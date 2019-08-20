/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.data_warehousing;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.elf_to_list;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst_if;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_cost;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-DB-SATURATION
 * source file: /cyc/top/cycl/sksi/data-warehousing/sksi-db-saturation.lisp
 * created:     2019/07/03 17:38:34
 */
public final class sksi_db_saturation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_db_saturation();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol REGISTER_SKSI_SOURCES_FOR_DB_SATURATION = makeSymbol("REGISTER-SKSI-SOURCES-FOR-DB-SATURATION");

    private static final SubLSymbol SKS_REGISTERED_P = makeSymbol("SKS-REGISTERED-P");

    static private final SubLList $list2 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list4 = list(makeSymbol("SKSI-PROFILING-ON?"));

    private static final SubLSymbol EXISTENTIALLY_BIND_DONT_CARE_VARIABLES = makeSymbol("EXISTENTIALLY-BIND-DONT-CARE-VARIABLES");

    static private final SubLList $list7 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    private static final SubLSymbol SKSI_SATURATE_DB_WITH_RULE_MT = makeSymbol("SKSI-SATURATE-DB-WITH-RULE-MT");

    static private final SubLString $str9$__Total_time____A_sec__ = makeString("~%Total time : ~A sec~%");

    private static final SubLSymbol INFERENCE_ANSWER_BINDINGS = makeSymbol("INFERENCE-ANSWER-BINDINGS");

    static private final SubLString $$$SKSI_SQL_statement_cache_ = makeString("SKSI SQL statement cache ");

    static private final SubLString $str12$Could_not_determine_the_source_SK = makeString("Could not determine the source SKS list for ~s");

    static private final SubLString $str13$Could_not_determine_the_target_SK = makeString("Could not determine the target SKS list for ~s");

    static private final SubLString $$$Querying_antecedent = makeString("Querying antecedent");

    static private final SubLString $str15$__Query_time____A_sec__ = makeString("~%Query time : ~A sec~%");

    static private final SubLString $str16$_Cyc_side____A_sec__ = makeString(" Cyc side : ~A sec~%");

    static private final SubLString $str17$_DB_side____A_sec__ = makeString(" DB side : ~A sec~%");

    static private final SubLString $str18$___SQL_queries____A__ = makeString(" # SQL queries : ~A~%");

    static private final SubLString $str19$___bindings____A__ = makeString(" # bindings : ~A~%");

    static private final SubLString $str20$_Halt_reason____A__ = makeString(" Halt reason : ~A~%");









    static private final SubLString $$$Preparing_for_saturation = makeString("Preparing for saturation");

    static private final SubLString $str26$Unhandled___sksiSaturate_rule_con = makeString("Unhandled #$sksiSaturate rule consequent ~s");

    static private final SubLString $str27$__Saturation_time____A_sec__ = makeString("~%Saturation time : ~A sec~%");

    static private final SubLString $str28$___DB_edits____A__ = makeString(" # DB edits : ~A~%");

    static private final SubLString $str29$___batch_SQL_updates____A__ = makeString(" # batch SQL updates : ~A~%");

    private static final SubLList $list30 = list(makeSymbol("EXIST-VAR"), makeSymbol("ALL-AUTO-KEYS-LIST"));

    static private final SubLList $list31 = list(makeSymbol("EXIST-VAR-SUBST"), makeSymbol("FIELD-AUTO-KEYS-LIST"));

    static private final SubLList $list32 = list(makeSymbol("AUTO-KEY-FIELD"), makeSymbol("AUTO-KEYS"));

    private static final SubLObject $$subKS_Direct = reader_make_constant_shell("subKS-Direct");

    private static final SubLList $list37 = list(makeSymbol("PHYSICAL-SCHEMA"), makeSymbol("LOGICAL-SCHEMA"));



    private static final SubLSymbol PHYSICAL_FIELD_INDEXICAL_P = makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");

    private static final SubLString $$$Saturating_ = makeString("Saturating ");

    private static final SubLSymbol $REMOVAL_SKSI_SATURATE_RULE = makeKeyword("REMOVAL-SKSI-SATURATE-RULE");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("sksiSaturateRule"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("sksiSaturateRule"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), $COST, makeSymbol("REMOVAL-SKSI-SATURATE-RULE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-SATURATE-RULE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$sksiSaturateRule <rule> <source-mt> <target-mt>)"), makeKeyword("EXAMPLE"), makeString("") });



    private static final SubLList $list45 = list(makeSymbol("RULE"), makeSymbol("SOURCE-MT"), makeSymbol("TARGET-MT"));

    private static final SubLList $list47 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list48 = list(makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"));

    // Definitions
    public static final SubLObject register_sksi_sources_for_db_saturation_alt(SubLObject sks_list) {
        sksi_conjunctive_removal_modules_cost.$strongly_prefer_conjunctive_removal_modulesP$.setDynamicValue(T);
        return sksi_sks_manager.register_sksi_removal_modules_for_skses(remove_if(SKS_REGISTERED_P, sks_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    // Definitions
    public static SubLObject register_sksi_sources_for_db_saturation(final SubLObject sks_list) {
        return sksi_sks_manager.register_sksi_removal_modules_for_skses(remove_if(SKS_REGISTERED_P, sks_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject sksi_saturate_db_print_timing_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, $list_alt4, listS(FORMAT, T, format_string, append(args, NIL)));
            }
        }
    }

    public static SubLObject sksi_saturate_db_print_timing_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        format_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, $list4, listS(FORMAT, T, format_string, append(args, NIL)));
    }

    /**
     * Given an implication, RULE-FORMULA in the form of (#$implies <ANTECEDENT> <CONSEQUENT>)
     * this function rewrites RULE-FORMULA so that any open variables
     * in <ANTECEDENT> that do not appear in <CONSEQUENT> are existentially bound.
     */
    @LispMethod(comment = "Given an implication, RULE-FORMULA in the form of (#$implies <ANTECEDENT> <CONSEQUENT>)\r\nthis function rewrites RULE-FORMULA so that any open variables\r\nin <ANTECEDENT> that do not appear in <CONSEQUENT> are existentially bound.\nGiven an implication, RULE-FORMULA in the form of (#$implies <ANTECEDENT> <CONSEQUENT>)\nthis function rewrites RULE-FORMULA so that any open variables\nin <ANTECEDENT> that do not appear in <CONSEQUENT> are existentially bound.")
    public static final SubLObject existentially_bind_dont_care_variables_alt(SubLObject rule_formula) {
        {
            SubLObject datum = cycl_utilities.formula_args(rule_formula, UNPROVIDED);
            SubLObject current = datum;
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            antecedent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            consequent = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_antecedent = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.existentially_bind_dont_care_variables_int(antecedent, consequent);
                    return make_implication(new_antecedent, consequent);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    /**
     * Given an implication, RULE-FORMULA in the form of (#$implies <ANTECEDENT> <CONSEQUENT>)
     * this function rewrites RULE-FORMULA so that any open variables
     * in <ANTECEDENT> that do not appear in <CONSEQUENT> are existentially bound.
     */
    @LispMethod(comment = "Given an implication, RULE-FORMULA in the form of (#$implies <ANTECEDENT> <CONSEQUENT>)\r\nthis function rewrites RULE-FORMULA so that any open variables\r\nin <ANTECEDENT> that do not appear in <CONSEQUENT> are existentially bound.\nGiven an implication, RULE-FORMULA in the form of (#$implies <ANTECEDENT> <CONSEQUENT>)\nthis function rewrites RULE-FORMULA so that any open variables\nin <ANTECEDENT> that do not appear in <CONSEQUENT> are existentially bound.")
    public static SubLObject existentially_bind_dont_care_variables(final SubLObject rule_formula) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(rule_formula, UNPROVIDED);
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        antecedent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_antecedent = existentially_bind_dont_care_variables_int(antecedent, consequent);
            return make_implication(new_antecedent, consequent);
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    /**
     * This is the top-level function used by the SGT tool.
     * It takes a CycL rule formula (RULE) and a microtheory (MT).
     * MT is used to decide what knowledge sources are relevant to the current saturation effort --
     * see @xref sksi-saturate-db-extract-relevant-skses.
     */
    @LispMethod(comment = "This is the top-level function used by the SGT tool.\r\nIt takes a CycL rule formula (RULE) and a microtheory (MT).\r\nMT is used to decide what knowledge sources are relevant to the current saturation effort --\r\nsee @xref sksi-saturate-db-extract-relevant-skses.\nThis is the top-level function used by the SGT tool.\nIt takes a CycL rule formula (RULE) and a microtheory (MT).\nMT is used to decide what knowledge sources are relevant to the current saturation effort --\nsee @xref sksi-saturate-db-extract-relevant-skses.")
    public static final SubLObject sksi_saturate_db_with_rule_mt_alt(SubLObject rule, SubLObject mt, SubLObject query_properties, SubLObject post_bindings_max_number) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (post_bindings_max_number == UNPROVIDED) {
            post_bindings_max_number = NIL;
        }
        {
            SubLObject start_real_time = get_internal_real_time();
            SubLObject result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_with_rule_mt_int(rule, mt, query_properties, post_bindings_max_number);
            SubLObject end_real_time = get_internal_real_time();
            SubLObject total_time = numeric_date_utilities.elapsed_seconds_between_internal_real_times(start_real_time, end_real_time);
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                format(T, $str_alt9$__Total_time____A_sec__, total_time);
            }
            return values(result, total_time);
        }
    }

    /**
     * This is the top-level function used by the SGT tool.
     * It takes a CycL rule formula (RULE) and a microtheory (MT).
     * MT is used to decide what knowledge sources are relevant to the current saturation effort --
     * see @xref sksi-saturate-db-extract-relevant-skses.
     */
    @LispMethod(comment = "This is the top-level function used by the SGT tool.\r\nIt takes a CycL rule formula (RULE) and a microtheory (MT).\r\nMT is used to decide what knowledge sources are relevant to the current saturation effort --\r\nsee @xref sksi-saturate-db-extract-relevant-skses.\nThis is the top-level function used by the SGT tool.\nIt takes a CycL rule formula (RULE) and a microtheory (MT).\nMT is used to decide what knowledge sources are relevant to the current saturation effort --\nsee @xref sksi-saturate-db-extract-relevant-skses.")
    public static SubLObject sksi_saturate_db_with_rule_mt(final SubLObject rule, final SubLObject mt, SubLObject query_properties, SubLObject post_bindings_max_number) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (post_bindings_max_number == UNPROVIDED) {
            post_bindings_max_number = NIL;
        }
        final SubLObject start_real_time = get_internal_real_time();
        final SubLObject result = sksi_saturate_db_with_rule_mt_int(rule, mt, query_properties, post_bindings_max_number);
        final SubLObject end_real_time = get_internal_real_time();
        final SubLObject total_time = numeric_date_utilities.elapsed_seconds_between_internal_real_times(start_real_time, end_real_time);
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str9$__Total_time____A_sec__, total_time);
        }
        return values(result, total_time);
    }

    public static final SubLObject sksi_saturate_db_with_rule_consequent_from_inference_bindings_alt(SubLObject rule, SubLObject mt, SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject consequent = cycl_utilities.formula_arg2(rule, UNPROVIDED);
                SubLObject v_bindings = Mapping.mapcar(INFERENCE_ANSWER_BINDINGS, inference_datastructures_inference.inference_all_answers(inference));
                SubLObject target_sks_list = NIL;
                SubLObject result = NIL;
                if (NIL != v_bindings) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                target_sks_list = sksi_infrastructure_utilities.relevant_maximum_sksi_dbs();
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (NIL != target_sks_list) {
                        if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                            {
                                SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
                                result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool);
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                                SubLObject _prev_bind_2 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                                try {
                                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($str_alt11$SKSI_SQL_statement_cache_))), thread);
                                    {
                                        SubLObject resourcing_caches_finalizedP = NIL;
                                        try {
                                            {
                                                SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
                                                result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool);
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    try {
                                                        resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL == resourcing_caches_finalizedP) {
                                                                    sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2, thread);
                                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1, thread);
                                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_saturate_db_with_rule_consequent_from_inference_bindings(final SubLObject rule, final SubLObject mt, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject consequent = cycl_utilities.formula_arg2(rule, UNPROVIDED);
        final SubLObject v_bindings = Mapping.mapcar(INFERENCE_ANSWER_BINDINGS, inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED));
        SubLObject target_sks_list = NIL;
        SubLObject result = NIL;
        if (NIL != v_bindings) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                target_sks_list = sksi_infrastructure_utilities.relevant_maximum_sksi_dbs();
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL != target_sks_list) {
                if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    final SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
                    result = sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool);
                } else {
                    final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($$$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = NIL;
                        try {
                            final SubLObject task_process_pool2 = task_processor.get_task_process_pool_for_process(current_process());
                            result = sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool2);
                        } finally {
                            final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                } finally {
                                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values_$3 = getValuesAsVector();
                                        if (NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        restoreValuesFromVector(_values_$3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    } finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_6, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_5, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_4, thread);
                    }
                }
            }
        }
        return result;
    }

    public static final SubLObject sksi_saturate_db_with_rule_alt(SubLObject rule, SubLObject source_sks_list, SubLObject target_sks_list, SubLObject query_properties, SubLObject post_bindings_max_number) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (post_bindings_max_number == UNPROVIDED) {
            post_bindings_max_number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject datum = cycl_utilities.formula_args(rule, UNPROVIDED);
                SubLObject current = datum;
                SubLObject antecedent = NIL;
                SubLObject consequent = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                antecedent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                consequent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != ist_sentence_p(antecedent)) {
                        antecedent = cycl_utilities.formula_arg2(antecedent, UNPROVIDED);
                    }
                    if (NIL != ist_sentence_p(consequent)) {
                        consequent = cycl_utilities.formula_arg2(consequent, UNPROVIDED);
                    }
                    if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                        {
                            SubLObject _prev_bind_0 = sksi_infrastructure_macros.$sksi_profiling_onP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sksi_infrastructure_macros.$sksi_sql_query_time$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sksi_infrastructure_macros.$sksi_sql_query_count$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sksi_infrastructure_macros.$sksi_sql_update_time$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sksi_infrastructure_macros.$sksi_sql_update_count$.currentBinding(thread);
                            SubLObject _prev_bind_5 = sksi_infrastructure_macros.$sksi_sql_batch_update_count$.currentBinding(thread);
                            try {
                                sksi_infrastructure_macros.$sksi_profiling_onP$.bind(T, thread);
                                sksi_infrastructure_macros.$sksi_sql_query_time$.bind(ZERO_INTEGER, thread);
                                sksi_infrastructure_macros.$sksi_sql_query_count$.bind(ZERO_INTEGER, thread);
                                sksi_infrastructure_macros.$sksi_sql_update_time$.bind(ZERO_INTEGER, thread);
                                sksi_infrastructure_macros.$sksi_sql_update_count$.bind(ZERO_INTEGER, thread);
                                sksi_infrastructure_macros.$sksi_sql_batch_update_count$.bind(ZERO_INTEGER, thread);
                                {
                                    SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
                                    SubLObject v_bindings = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_query_rule_antecedent(antecedent, consequent, source_sks_list, target_sks_list, query_properties, post_bindings_max_number, task_process_pool);
                                    result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool);
                                }
                            } finally {
                                sksi_infrastructure_macros.$sksi_sql_batch_update_count$.rebind(_prev_bind_5, thread);
                                sksi_infrastructure_macros.$sksi_sql_update_count$.rebind(_prev_bind_4, thread);
                                sksi_infrastructure_macros.$sksi_sql_update_time$.rebind(_prev_bind_3, thread);
                                sksi_infrastructure_macros.$sksi_sql_query_count$.rebind(_prev_bind_2, thread);
                                sksi_infrastructure_macros.$sksi_sql_query_time$.rebind(_prev_bind_1, thread);
                                sksi_infrastructure_macros.$sksi_profiling_onP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        {
                            SubLObject _prev_bind_0 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                            try {
                                sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($str_alt11$SKSI_SQL_statement_cache_))), thread);
                                {
                                    SubLObject resourcing_caches_finalizedP = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_3 = sksi_infrastructure_macros.$sksi_profiling_onP$.currentBinding(thread);
                                            SubLObject _prev_bind_1_4 = sksi_infrastructure_macros.$sksi_sql_query_time$.currentBinding(thread);
                                            SubLObject _prev_bind_2_5 = sksi_infrastructure_macros.$sksi_sql_query_count$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = sksi_infrastructure_macros.$sksi_sql_update_time$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = sksi_infrastructure_macros.$sksi_sql_update_count$.currentBinding(thread);
                                            SubLObject _prev_bind_5 = sksi_infrastructure_macros.$sksi_sql_batch_update_count$.currentBinding(thread);
                                            try {
                                                sksi_infrastructure_macros.$sksi_profiling_onP$.bind(T, thread);
                                                sksi_infrastructure_macros.$sksi_sql_query_time$.bind(ZERO_INTEGER, thread);
                                                sksi_infrastructure_macros.$sksi_sql_query_count$.bind(ZERO_INTEGER, thread);
                                                sksi_infrastructure_macros.$sksi_sql_update_time$.bind(ZERO_INTEGER, thread);
                                                sksi_infrastructure_macros.$sksi_sql_update_count$.bind(ZERO_INTEGER, thread);
                                                sksi_infrastructure_macros.$sksi_sql_batch_update_count$.bind(ZERO_INTEGER, thread);
                                                {
                                                    SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
                                                    SubLObject v_bindings = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_query_rule_antecedent(antecedent, consequent, source_sks_list, target_sks_list, query_properties, post_bindings_max_number, task_process_pool);
                                                    result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool);
                                                }
                                            } finally {
                                                sksi_infrastructure_macros.$sksi_sql_batch_update_count$.rebind(_prev_bind_5, thread);
                                                sksi_infrastructure_macros.$sksi_sql_update_count$.rebind(_prev_bind_4, thread);
                                                sksi_infrastructure_macros.$sksi_sql_update_time$.rebind(_prev_bind_3, thread);
                                                sksi_infrastructure_macros.$sksi_sql_query_count$.rebind(_prev_bind_2_5, thread);
                                                sksi_infrastructure_macros.$sksi_sql_query_time$.rebind(_prev_bind_1_4, thread);
                                                sksi_infrastructure_macros.$sksi_profiling_onP$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                try {
                                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL == resourcing_caches_finalizedP) {
                                                                sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_2, thread);
                                sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1, thread);
                                sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_saturate_db_with_rule(final SubLObject rule, final SubLObject source_sks_list, final SubLObject target_sks_list, SubLObject query_properties, SubLObject post_bindings_max_number) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (post_bindings_max_number == UNPROVIDED) {
            post_bindings_max_number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(rule, UNPROVIDED);
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        antecedent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != ist_sentence_p(antecedent, UNPROVIDED)) {
                antecedent = cycl_utilities.formula_arg2(antecedent, UNPROVIDED);
            }
            if (NIL != ist_sentence_p(consequent, UNPROVIDED)) {
                consequent = cycl_utilities.formula_arg2(consequent, UNPROVIDED);
            }
            if (NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                final SubLObject _prev_bind_0 = sksi_infrastructure_macros.$sksi_profiling_onP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sksi_infrastructure_macros.$sksi_sql_query_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sksi_infrastructure_macros.$sksi_sql_query_count$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sksi_infrastructure_macros.$sksi_sql_update_time$.currentBinding(thread);
                final SubLObject _prev_bind_5 = sksi_infrastructure_macros.$sksi_sql_update_count$.currentBinding(thread);
                final SubLObject _prev_bind_6 = sksi_infrastructure_macros.$sksi_sql_batch_update_count$.currentBinding(thread);
                try {
                    sksi_infrastructure_macros.$sksi_profiling_onP$.bind(T, thread);
                    sksi_infrastructure_macros.$sksi_sql_query_time$.bind(ZERO_INTEGER, thread);
                    sksi_infrastructure_macros.$sksi_sql_query_count$.bind(ZERO_INTEGER, thread);
                    sksi_infrastructure_macros.$sksi_sql_update_time$.bind(ZERO_INTEGER, thread);
                    sksi_infrastructure_macros.$sksi_sql_update_count$.bind(ZERO_INTEGER, thread);
                    sksi_infrastructure_macros.$sksi_sql_batch_update_count$.bind(ZERO_INTEGER, thread);
                    final SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
                    final SubLObject v_bindings = sksi_saturate_query_rule_antecedent(antecedent, consequent, source_sks_list, target_sks_list, query_properties, post_bindings_max_number, task_process_pool);
                    result = sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings, task_process_pool);
                } finally {
                    sksi_infrastructure_macros.$sksi_sql_batch_update_count$.rebind(_prev_bind_6, thread);
                    sksi_infrastructure_macros.$sksi_sql_update_count$.rebind(_prev_bind_5, thread);
                    sksi_infrastructure_macros.$sksi_sql_update_time$.rebind(_prev_bind_4, thread);
                    sksi_infrastructure_macros.$sksi_sql_query_count$.rebind(_prev_bind_3, thread);
                    sksi_infrastructure_macros.$sksi_sql_query_time$.rebind(_prev_bind_2, thread);
                    sksi_infrastructure_macros.$sksi_profiling_onP$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject _prev_bind_0 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED), thread);
                    sksi_macros.$sksi_sql_statement_pool_lock$.bind(make_lock(Strings.string(gensym($$$SKSI_SQL_statement_cache_))), thread);
                    SubLObject resourcing_caches_finalizedP = NIL;
                    try {
                        final SubLObject _prev_bind_0_$4 = sksi_infrastructure_macros.$sksi_profiling_onP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = sksi_infrastructure_macros.$sksi_sql_query_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = sksi_infrastructure_macros.$sksi_sql_query_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = sksi_infrastructure_macros.$sksi_sql_update_time$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = sksi_infrastructure_macros.$sksi_sql_update_count$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = sksi_infrastructure_macros.$sksi_sql_batch_update_count$.currentBinding(thread);
                        try {
                            sksi_infrastructure_macros.$sksi_profiling_onP$.bind(T, thread);
                            sksi_infrastructure_macros.$sksi_sql_query_time$.bind(ZERO_INTEGER, thread);
                            sksi_infrastructure_macros.$sksi_sql_query_count$.bind(ZERO_INTEGER, thread);
                            sksi_infrastructure_macros.$sksi_sql_update_time$.bind(ZERO_INTEGER, thread);
                            sksi_infrastructure_macros.$sksi_sql_update_count$.bind(ZERO_INTEGER, thread);
                            sksi_infrastructure_macros.$sksi_sql_batch_update_count$.bind(ZERO_INTEGER, thread);
                            final SubLObject task_process_pool2 = task_processor.get_task_process_pool_for_process(current_process());
                            final SubLObject v_bindings2 = sksi_saturate_query_rule_antecedent(antecedent, consequent, source_sks_list, target_sks_list, query_properties, post_bindings_max_number, task_process_pool2);
                            result = sksi_saturate_rule_consequent(consequent, target_sks_list, v_bindings2, task_process_pool2);
                        } finally {
                            sksi_infrastructure_macros.$sksi_sql_batch_update_count$.rebind(_prev_bind_9, thread);
                            sksi_infrastructure_macros.$sksi_sql_update_count$.rebind(_prev_bind_8, thread);
                            sksi_infrastructure_macros.$sksi_sql_update_time$.rebind(_prev_bind_7, thread);
                            sksi_infrastructure_macros.$sksi_sql_query_count$.rebind(_prev_bind_2_$6, thread);
                            sksi_infrastructure_macros.$sksi_sql_query_time$.rebind(_prev_bind_1_$5, thread);
                            sksi_infrastructure_macros.$sksi_profiling_onP$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            try {
                                resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                            } finally {
                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values_$9 = getValuesAsVector();
                                    if (NIL == resourcing_caches_finalizedP) {
                                        sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                    }
                                    restoreValuesFromVector(_values_$9);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                } finally {
                    sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_3, thread);
                    sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_2, thread);
                    sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list7);
        }
        return result;
    }

    public static final SubLObject sksi_saturate_db_with_rule_mt_int_alt(SubLObject rule, SubLObject mt, SubLObject query_properties, SubLObject post_bindings_max_number) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (post_bindings_max_number == UNPROVIDED) {
            post_bindings_max_number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject source_sks_list = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_extract_relevant_skses(rule, mt, UNPROVIDED);
                    SubLObject target_sks_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != source_sks_list) && (NIL != target_sks_list)) {
                        result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_with_rule(rule, source_sks_list, target_sks_list, query_properties, post_bindings_max_number);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_saturate_db_with_rule_mt_int(final SubLObject rule, final SubLObject mt, SubLObject query_properties, SubLObject post_bindings_max_number) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (post_bindings_max_number == UNPROVIDED) {
            post_bindings_max_number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject source_sks_list = sksi_saturate_db_extract_relevant_skses(rule, mt, UNPROVIDED);
        final SubLObject target_sks_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != source_sks_list) && (NIL != target_sks_list)) {
            result = sksi_saturate_db_with_rule(rule, source_sks_list, target_sks_list, query_properties, post_bindings_max_number);
        }
        return result;
    }

    public static final SubLObject sksi_substitute_bindings_alt(SubLObject sentence, SubLObject v_bindings) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                result = cons(sublis(binding, sentence, symbol_function(EQ), UNPROVIDED), result);
            }
            return nreverse(result);
        }
    }

    public static SubLObject sksi_substitute_bindings(final SubLObject sentence, final SubLObject v_bindings) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(sublis(binding, sentence, symbol_function(EQ), UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject sksi_saturate_db_extract_relevant_skses_alt(SubLObject rule, SubLObject source_mt, SubLObject target_mt) {
        if (source_mt == UNPROVIDED) {
            source_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (target_mt == UNPROVIDED) {
            target_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source_sks_list = NIL;
                SubLObject target_sks_list = NIL;
                SubLObject datum = cycl_utilities.formula_args(rule, UNPROVIDED);
                SubLObject current = datum;
                SubLObject antecedent = NIL;
                SubLObject consequent = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                antecedent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                consequent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != ist_sentence_p(antecedent)) {
                        source_mt = cycl_utilities.formula_arg1(antecedent, UNPROVIDED);
                    }
                    if (NIL != ist_sentence_p(consequent)) {
                        target_mt = cycl_utilities.formula_arg1(consequent, UNPROVIDED);
                    }
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(source_mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                source_sks_list = sksi_infrastructure_utilities.relevant_maximum_sksi_dbs();
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (NIL != target_mt) {
                        {
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(target_mt);
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    target_sks_list = sksi_infrastructure_utilities.relevant_registered_top_level_sksi_dbs();
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } else {
                        target_sks_list = source_sks_list;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
                if (NIL != sksi_database_fusion.within_sksi_database_fusionP()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!source_sks_list.isCons()) {
                            Errors.error($str_alt12$Could_not_determine_the_source_SK, rule);
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!target_sks_list.isCons()) {
                            Errors.error($str_alt13$Could_not_determine_the_target_SK, rule);
                        }
                    }
                }
                return values(source_sks_list, target_sks_list);
            }
        }
    }

    public static SubLObject sksi_saturate_db_extract_relevant_skses(final SubLObject rule, SubLObject source_mt, SubLObject target_mt) {
        if (source_mt == UNPROVIDED) {
            source_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (target_mt == UNPROVIDED) {
            target_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject source_sks_list = NIL;
        SubLObject target_sks_list = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(rule, UNPROVIDED);
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        antecedent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != ist_sentence_p(antecedent, UNPROVIDED)) {
                source_mt = cycl_utilities.formula_arg1(antecedent, UNPROVIDED);
            }
            if (NIL != ist_sentence_p(consequent, UNPROVIDED)) {
                target_mt = cycl_utilities.formula_arg1(consequent, UNPROVIDED);
            }
            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(source_mt);
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                source_sks_list = sksi_infrastructure_utilities.relevant_maximum_sksi_dbs();
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL != target_mt) {
                mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(target_mt);
                _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    target_sks_list = sksi_infrastructure_utilities.relevant_registered_top_level_sksi_dbs();
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                target_sks_list = source_sks_list;
            }
        } else {
            cdestructuring_bind_error(datum, $list7);
        }
        if (NIL != sksi_database_fusion.within_sksi_database_fusionP()) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!source_sks_list.isCons())) {
                Errors.error($str12$Could_not_determine_the_source_SK, rule);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!target_sks_list.isCons())) {
                Errors.error($str13$Could_not_determine_the_target_SK, rule);
            }
        }
        return values(source_sks_list, target_sks_list);
    }

    public static final SubLObject sksi_saturate_query_rule_antecedent_alt(SubLObject antecedent, SubLObject consequent, SubLObject source_sks_list, SubLObject target_sks_list, SubLObject query_properties, SubLObject post_bindings_max_number, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject source_sks_mt = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_prepare_antecedent_query_mt(source_sks_list);
                SubLObject target_sks_mt = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_prepare_antecedent_query_mt(target_sks_list);
                SubLObject query_sentence = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_prepare_antecedent_query(antecedent, consequent, source_sks_mt, target_sks_mt, UNPROVIDED);
                SubLObject v_bindings = NIL;
                SubLObject halt_reason = NIL;
                SubLObject query_start_time = NIL;
                SubLObject query_end_time = NIL;
                SubLObject query_total_time = NIL;
                if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
                    task_processor.push_tpool_background_msg($$$Querying_antecedent, task_process_pool);
                }
                query_start_time = get_internal_real_time();
                thread.resetMultipleValues();
                {
                    SubLObject v_bindings_8 = inference_kernel.new_cyc_query(query_sentence, source_sks_mt, query_properties);
                    SubLObject halt_reason_9 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_bindings = v_bindings_8;
                    halt_reason = halt_reason_9;
                }
                query_end_time = get_internal_real_time();
                if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
                    if (NIL != subl_promotions.positive_integer_p(post_bindings_max_number)) {
                        task_processor.post_task_info_processor_partial_results(list_utilities.first_n(post_bindings_max_number, v_bindings));
                    } else {
                        if (!post_bindings_max_number.isZero()) {
                            task_processor.post_task_info_processor_partial_results(v_bindings);
                        }
                    }
                }
                query_total_time = numeric_date_utilities.elapsed_seconds_between_internal_real_times(query_start_time, query_end_time);
                if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                    format(T, $str_alt15$__Query_time____A_sec__, query_total_time);
                }
                if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                    format(T, $str_alt16$_Cyc_side____A_sec__, subtract(query_total_time, sksi_infrastructure_macros.$sksi_sql_query_time$.getDynamicValue(thread)));
                }
                if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                    format(T, $str_alt17$_DB_side____A_sec__, sksi_infrastructure_macros.$sksi_sql_query_time$.getDynamicValue(thread));
                }
                if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                    format(T, $str_alt18$___SQL_queries____A__, sksi_infrastructure_macros.$sksi_sql_query_count$.getDynamicValue(thread));
                }
                if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                    format(T, $str_alt19$___bindings____A__, NIL != v_bindings ? ((SubLObject) (list_length(v_bindings))) : ZERO_INTEGER);
                }
                if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                    format(T, $str_alt20$_Halt_reason____A__, halt_reason);
                }
                return values(v_bindings, query_total_time);
            }
        }
    }

    public static SubLObject sksi_saturate_query_rule_antecedent(final SubLObject antecedent, final SubLObject consequent, final SubLObject source_sks_list, final SubLObject target_sks_list, final SubLObject query_properties, final SubLObject post_bindings_max_number, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_sks_mt = sksi_saturate_prepare_antecedent_query_mt(source_sks_list);
        final SubLObject target_sks_mt = sksi_saturate_prepare_antecedent_query_mt(target_sks_list);
        final SubLObject query_sentence = sksi_saturate_prepare_antecedent_query(antecedent, consequent, source_sks_mt, target_sks_mt, UNPROVIDED);
        SubLObject v_bindings = NIL;
        SubLObject halt_reason = NIL;
        SubLObject query_start_time = NIL;
        SubLObject query_end_time = NIL;
        SubLObject query_total_time = NIL;
        if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
            task_processor.push_tpool_background_msg($$$Querying_antecedent, task_process_pool);
        }
        query_start_time = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject v_bindings_$10 = inference_kernel.new_cyc_query(query_sentence, source_sks_mt, query_properties);
        final SubLObject halt_reason_$11 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_bindings = v_bindings_$10;
        halt_reason = halt_reason_$11;
        query_end_time = get_internal_real_time();
        if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
            if (NIL != subl_promotions.positive_integer_p(post_bindings_max_number)) {
                task_processor.post_task_info_processor_partial_results(list_utilities.first_n(post_bindings_max_number, v_bindings));
            } else
                if (!post_bindings_max_number.isZero()) {
                    task_processor.post_task_info_processor_partial_results(v_bindings);
                }

        }
        query_total_time = numeric_date_utilities.elapsed_seconds_between_internal_real_times(query_start_time, query_end_time);
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str15$__Query_time____A_sec__, query_total_time);
        }
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str16$_Cyc_side____A_sec__, subtract(query_total_time, sksi_infrastructure_macros.$sksi_sql_query_time$.getDynamicValue(thread)));
        }
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str17$_DB_side____A_sec__, sksi_infrastructure_macros.$sksi_sql_query_time$.getDynamicValue(thread));
        }
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str18$___SQL_queries____A__, sksi_infrastructure_macros.$sksi_sql_query_count$.getDynamicValue(thread));
        }
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str19$___bindings____A__, NIL != v_bindings ? list_length(v_bindings) : ZERO_INTEGER);
        }
        if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            format(T, $str20$_Halt_reason____A__, halt_reason);
        }
        return values(v_bindings, query_total_time);
    }

    public static final SubLObject sksi_saturate_prepare_antecedent_query_alt(SubLObject antecedent, SubLObject consequent, SubLObject source_sks_mt, SubLObject target_sks_mt, SubLObject existentially_bind_extra_varsP) {
        if (existentially_bind_extra_varsP == UNPROVIDED) {
            existentially_bind_extra_varsP = T;
        }
        {
            SubLObject query_sentence = (NIL != existentially_bind_extra_varsP) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.existentially_bind_dont_care_variables_int(antecedent, consequent))) : antecedent;
            query_sentence = make_conjunction(list(make_ist_sentence(source_sks_mt, make_unary_formula($$sksiSentence, query_sentence)), make_ist_sentence(target_sks_mt, make_unary_formula($$unknownSentence, make_unary_formula($$sksiSentence, consequent)))));
            return query_sentence;
        }
    }

    public static SubLObject sksi_saturate_prepare_antecedent_query(final SubLObject antecedent, final SubLObject consequent, final SubLObject source_sks_mt, final SubLObject target_sks_mt, SubLObject existentially_bind_extra_varsP) {
        if (existentially_bind_extra_varsP == UNPROVIDED) {
            existentially_bind_extra_varsP = T;
        }
        SubLObject query_sentence = (NIL != existentially_bind_extra_varsP) ? existentially_bind_dont_care_variables_int(antecedent, consequent) : antecedent;
        query_sentence = make_conjunction(list(make_ist_sentence(source_sks_mt, make_unary_formula($$sksiSentence, query_sentence)), make_ist_sentence(target_sks_mt, make_unary_formula($$unknownSentence, make_unary_formula($$sksiSentence, consequent)))));
        return query_sentence;
    }

    public static final SubLObject existentially_bind_dont_care_variables_int_alt(SubLObject antecedent, SubLObject consequent) {
        {
            SubLObject query_sentence = antecedent;
            SubLObject antecedent_vars = sentence_free_variables(antecedent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject consequent_vars = sentence_free_variables(consequent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject extra_vars = set_difference(antecedent_vars, consequent_vars, symbol_function(EQ), UNPROVIDED);
            if (NIL != extra_vars) {
                {
                    SubLObject cdolist_list_var = extra_vars;
                    SubLObject extra_var = NIL;
                    for (extra_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , extra_var = cdolist_list_var.first()) {
                        query_sentence = make_binary_formula($$thereExists, extra_var, query_sentence);
                    }
                }
            }
            return query_sentence;
        }
    }

    public static SubLObject existentially_bind_dont_care_variables_int(final SubLObject antecedent, final SubLObject consequent) {
        SubLObject query_sentence = antecedent;
        final SubLObject antecedent_vars = sentence_free_variables(antecedent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject consequent_vars = sentence_free_variables(consequent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject extra_vars = set_difference(antecedent_vars, consequent_vars, symbol_function(EQ), UNPROVIDED);
        if (NIL != extra_vars) {
            SubLObject cdolist_list_var = extra_vars;
            SubLObject extra_var = NIL;
            extra_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                query_sentence = make_binary_formula($$thereExists, extra_var, query_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                extra_var = cdolist_list_var.first();
            } 
        }
        return query_sentence;
    }

    public static final SubLObject sksi_saturate_prepare_antecedent_query_mt_alt(SubLObject sks_list) {
        {
            SubLObject mt = NIL;
            SubLObject cdolist_list_var = sks_list;
            SubLObject sks = NIL;
            for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                {
                    SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt_in_any_mt(sks);
                    if (NIL != content_mt) {
                        {
                            SubLObject item_var = content_mt;
                            if (NIL == member(item_var, mt, symbol_function(EQ), symbol_function(IDENTITY))) {
                                mt = cons(item_var, mt);
                            }
                        }
                    }
                }
            }
            return NIL != list_utilities.lengthG(mt, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) (make_formula($$MtUnionFn, mt, UNPROVIDED))) : mt.first();
        }
    }

    public static SubLObject sksi_saturate_prepare_antecedent_query_mt(final SubLObject sks_list) {
        SubLObject mt = NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt_in_any_mt(sks);
            if (NIL != content_mt) {
                final SubLObject item_var = content_mt;
                if (NIL == member(item_var, mt, symbol_function(EQ), symbol_function(IDENTITY))) {
                    mt = cons(item_var, mt);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return NIL != list_utilities.lengthG(mt, ONE_INTEGER, UNPROVIDED) ? make_formula($$MtUnionFn, mt, UNPROVIDED) : mt.first();
    }

    public static final SubLObject sksi_saturate_rule_consequent_alt(SubLObject consequent, SubLObject sks_list, SubLObject v_bindings, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != v_bindings) {
                {
                    SubLObject start_time = get_internal_real_time();
                    SubLObject end_time = NIL;
                    SubLObject total_time = NIL;
                    SubLObject result = NIL;
                    if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
                        task_processor.push_tpool_background_msg($$$Preparing_for_saturation, task_process_pool);
                    }
                    if (NIL != atomic_sentenceP(consequent)) {
                        result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent_int(consequent, sks_list, v_bindings, task_process_pool);
                    } else {
                        if (NIL != el_existential_p(consequent)) {
                            result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_el_existential_consequent(consequent, sks_list, v_bindings, task_process_pool, UNPROVIDED);
                        } else {
                            if (NIL != el_conjunction_p(consequent)) {
                                result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent_int(consequent, sks_list, v_bindings, task_process_pool);
                            } else {
                                Errors.warn($str_alt26$Unhandled___sksiSaturate_rule_con, consequent);
                            }
                        }
                    }
                    end_time = get_internal_real_time();
                    total_time = numeric_date_utilities.elapsed_seconds_between_internal_real_times(start_time, end_time);
                    if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                        format(T, $str_alt27$__Saturation_time____A_sec__, total_time);
                    }
                    if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                        format(T, $str_alt16$_Cyc_side____A_sec__, subtract(total_time, sksi_infrastructure_macros.$sksi_sql_update_time$.getDynamicValue(thread)));
                    }
                    if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                        format(T, $str_alt17$_DB_side____A_sec__, sksi_infrastructure_macros.$sksi_sql_update_time$.getDynamicValue(thread));
                    }
                    if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                        format(T, $str_alt28$___DB_edits____A__, sksi_infrastructure_macros.$sksi_sql_update_count$.getDynamicValue(thread));
                    }
                    if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                        format(T, $str_alt29$___batch_SQL_updates____A__, sksi_infrastructure_macros.$sksi_sql_batch_update_count$.getDynamicValue(thread));
                    }
                    return values(result, total_time);
                }
            }
            return values(NIL, NIL);
        }
    }

    public static SubLObject sksi_saturate_rule_consequent(final SubLObject consequent, final SubLObject sks_list, final SubLObject v_bindings, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != v_bindings) {
            final SubLObject start_time = get_internal_real_time();
            SubLObject end_time = NIL;
            SubLObject total_time = NIL;
            SubLObject result = NIL;
            if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
                task_processor.push_tpool_background_msg($$$Preparing_for_saturation, task_process_pool);
            }
            if (NIL != atomic_sentenceP(consequent)) {
                result = sksi_saturate_rule_consequent_int(consequent, sks_list, v_bindings, task_process_pool);
            } else
                if (NIL != el_existential_p(consequent)) {
                    result = sksi_saturate_rule_el_existential_consequent(consequent, sks_list, v_bindings, task_process_pool, UNPROVIDED);
                } else
                    if (NIL != el_conjunction_p(consequent)) {
                        result = sksi_saturate_rule_consequent_int(consequent, sks_list, v_bindings, task_process_pool);
                    } else {
                        Errors.warn($str26$Unhandled___sksiSaturate_rule_con, consequent);
                    }


            end_time = get_internal_real_time();
            total_time = numeric_date_utilities.elapsed_seconds_between_internal_real_times(start_time, end_time);
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                format(T, $str27$__Saturation_time____A_sec__, total_time);
            }
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                format(T, $str16$_Cyc_side____A_sec__, subtract(total_time, sksi_infrastructure_macros.$sksi_sql_update_time$.getDynamicValue(thread)));
            }
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                format(T, $str17$_DB_side____A_sec__, sksi_infrastructure_macros.$sksi_sql_update_time$.getDynamicValue(thread));
            }
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                format(T, $str28$___DB_edits____A__, sksi_infrastructure_macros.$sksi_sql_update_count$.getDynamicValue(thread));
            }
            if (NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
                format(T, $str29$___batch_SQL_updates____A__, sksi_infrastructure_macros.$sksi_sql_batch_update_count$.getDynamicValue(thread));
            }
            return values(result, total_time);
        }
        return values(NIL, NIL);
    }

    public static final SubLObject sksi_saturate_rule_consequent_int_alt(SubLObject consequent, SubLObject sks_list, SubLObject v_bindings, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template = sksi_data_warehousing_utilities.make_sentence_template(consequent);
                SubLObject sentences = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_substitute_bindings(consequent, v_bindings);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = sks_list;
                SubLObject sks = NIL;
                for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject successes = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db(sentences, sks, template, task_process_pool, UNPROVIDED);
                        SubLObject errors = thread.secondMultipleValue();
                        SubLObject failures = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        result = append(result, successes);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_saturate_rule_consequent_int(final SubLObject consequent, final SubLObject sks_list, final SubLObject v_bindings, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = sksi_data_warehousing_utilities.make_sentence_template(consequent);
        final SubLObject sentences = sksi_substitute_bindings(consequent, v_bindings);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sks_list;
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject successes = sksi_saturate_db(sentences, sks, template, task_process_pool, UNPROVIDED);
            final SubLObject errors = thread.secondMultipleValue();
            final SubLObject failures = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            result = append(result, successes);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_saturate_rule_el_existential_consequent_alt(SubLObject consequent, SubLObject sks_list, SubLObject v_bindings, SubLObject task_process_pool, SubLObject exist_var_list) {
        if (exist_var_list == UNPROVIDED) {
            exist_var_list = NIL;
        }
        {
            SubLObject exist_var = cycl_utilities.formula_arg1(consequent, UNPROVIDED);
            SubLObject rest_consequent = cycl_utilities.formula_arg2(consequent, UNPROVIDED);
            SubLObject result = NIL;
            exist_var_list = cons(exist_var, exist_var_list);
            if (NIL != atomic_sentenceP(rest_consequent)) {
                {
                    SubLObject cdolist_list_var = sks_list;
                    SubLObject sks = NIL;
                    for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                        result = append(result, com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_reify_existential(rest_consequent, exist_var, sks, v_bindings, task_process_pool));
                    }
                }
            } else {
                if (NIL != el_conjunction_p(rest_consequent)) {
                    {
                        SubLObject cdolist_list_var = sks_list;
                        SubLObject sks = NIL;
                        for (sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sks = cdolist_list_var.first()) {
                            result = append(result, com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_el_existential_consequent_int(exist_var_list, cycl_utilities.formula_args(rest_consequent, UNPROVIDED), sks, v_bindings, task_process_pool));
                        }
                    }
                } else {
                    if (NIL != el_existential_p(rest_consequent)) {
                        result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_el_existential_consequent(rest_consequent, sks_list, v_bindings, task_process_pool, exist_var_list);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_saturate_rule_el_existential_consequent(final SubLObject consequent, final SubLObject sks_list, final SubLObject v_bindings, final SubLObject task_process_pool, SubLObject exist_var_list) {
        if (exist_var_list == UNPROVIDED) {
            exist_var_list = NIL;
        }
        final SubLObject exist_var = cycl_utilities.formula_arg1(consequent, UNPROVIDED);
        final SubLObject rest_consequent = cycl_utilities.formula_arg2(consequent, UNPROVIDED);
        SubLObject result = NIL;
        exist_var_list = cons(exist_var, exist_var_list);
        if (NIL != atomic_sentenceP(rest_consequent)) {
            SubLObject cdolist_list_var = sks_list;
            SubLObject sks = NIL;
            sks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = append(result, sksi_saturate_rule_reify_existential(rest_consequent, exist_var, sks, v_bindings, task_process_pool));
                cdolist_list_var = cdolist_list_var.rest();
                sks = cdolist_list_var.first();
            } 
        } else
            if (NIL != el_conjunction_p(rest_consequent)) {
                SubLObject cdolist_list_var = sks_list;
                SubLObject sks = NIL;
                sks = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = append(result, sksi_saturate_rule_el_existential_consequent_int(exist_var_list, cycl_utilities.formula_args(rest_consequent, UNPROVIDED), sks, v_bindings, task_process_pool));
                    cdolist_list_var = cdolist_list_var.rest();
                    sks = cdolist_list_var.first();
                } 
            } else
                if (NIL != el_existential_p(rest_consequent)) {
                    result = sksi_saturate_rule_el_existential_consequent(rest_consequent, sks_list, v_bindings, task_process_pool, exist_var_list);
                }


        return result;
    }

    public static final SubLObject sksi_saturate_rule_el_existential_consequent_int_alt(SubLObject exist_var_list, SubLObject conjuncts, SubLObject sks, SubLObject v_bindings, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                SubLObject result = NIL;
                SubLObject sql_statements_to_be_executed = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt30$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                                    {
                                        SubLObject _prev_bind_0_10 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject auto_keys = NIL;
                                                {
                                                    SubLObject cdolist_list_var = exist_var_list;
                                                    SubLObject exist_var = NIL;
                                                    for (exist_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exist_var = cdolist_list_var.first()) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject conjuncts_11 = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent_process_existential(sks, exist_var, conjuncts, v_bindings, result, auto_keys, task_process_pool);
                                                            SubLObject result_12 = thread.secondMultipleValue();
                                                            SubLObject auto_keys_13 = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            conjuncts = conjuncts_11;
                                                            result = result_12;
                                                            auto_keys = auto_keys_13;
                                                        }
                                                    }
                                                }
                                                if (NIL != auto_keys) {
                                                    {
                                                        SubLObject cdolist_list_var = conjuncts;
                                                        SubLObject conjunct = NIL;
                                                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject result_14 = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent_process_conjunct(sks, conjunct, v_bindings, auto_keys, result, sql_statements_to_be_executed, task_process_pool);
                                                                SubLObject sql_statements_to_be_executed_15 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                result = result_14;
                                                                sql_statements_to_be_executed = sql_statements_to_be_executed_15;
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject batch_execute_result = sksi_sks_interaction.sksi_batch_execute_sql_statements(sks, sksi_access_path.external_source_access_path(sks, UNPROVIDED, UNPROVIDED), sql_statements_to_be_executed, NIL, NIL);
                                                        if (NIL != sdbc.sdbc_error_p(batch_execute_result)) {
                                                            result = NIL;
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_saturate_rule_el_existential_consequent_int(final SubLObject exist_var_list, SubLObject conjuncts, final SubLObject sks, final SubLObject v_bindings, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        SubLObject result = NIL;
        SubLObject sql_statements_to_be_executed = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject auto_keys = NIL;
                    SubLObject cdolist_list_var = exist_var_list;
                    SubLObject exist_var = NIL;
                    exist_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject conjuncts_$13 = sksi_saturate_rule_consequent_process_existential(sks, exist_var, conjuncts, v_bindings, result, auto_keys, task_process_pool);
                        final SubLObject result_$14 = thread.secondMultipleValue();
                        final SubLObject auto_keys_$15 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        conjuncts = conjuncts_$13;
                        result = result_$14;
                        auto_keys = auto_keys_$15;
                        cdolist_list_var = cdolist_list_var.rest();
                        exist_var = cdolist_list_var.first();
                    } 
                    if (NIL != auto_keys) {
                        cdolist_list_var = conjuncts;
                        SubLObject conjunct = NIL;
                        conjunct = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject result_$15 = sksi_saturate_rule_consequent_process_conjunct(sks, conjunct, v_bindings, auto_keys, result, sql_statements_to_be_executed, task_process_pool);
                            final SubLObject sql_statements_to_be_executed_$17 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_$15;
                            sql_statements_to_be_executed = sql_statements_to_be_executed_$17;
                            cdolist_list_var = cdolist_list_var.rest();
                            conjunct = cdolist_list_var.first();
                        } 
                        final SubLObject batch_execute_result = sksi_sks_interaction.sksi_batch_execute_sql_statements(sks, sksi_access_path.external_source_access_path(sks, UNPROVIDED, UNPROVIDED), sql_statements_to_be_executed, NIL, NIL);
                        if (NIL != sdbc.sdbc_error_p(batch_execute_result)) {
                            result = NIL;
                        }
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sksi_saturate_rule_consequent_process_conjunct_alt(SubLObject sks, SubLObject conjunct, SubLObject v_bindings, SubLObject auto_keys, SubLObject result, SubLObject sql_statements_to_be_executed, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_substitute_bindings(conjunct, v_bindings);
                SubLObject template = sksi_data_warehousing_utilities.make_sentence_template(conjunct);
                SubLObject cdolist_list_var = auto_keys;
                SubLObject exist_var_all_auto_keys_pair = NIL;
                for (exist_var_all_auto_keys_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exist_var_all_auto_keys_pair = cdolist_list_var.first()) {
                    {
                        SubLObject exist_var_sentences = NIL;
                        SubLObject datum = exist_var_all_auto_keys_pair;
                        SubLObject current = datum;
                        SubLObject exist_var = NIL;
                        SubLObject all_auto_keys_list = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt31);
                        exist_var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt31);
                        all_auto_keys_list = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject cdolist_list_var_17 = all_auto_keys_list;
                                SubLObject auto_keys_list = NIL;
                                for (auto_keys_list = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , auto_keys_list = cdolist_list_var_17.first()) {
                                    {
                                        SubLObject datum_18 = auto_keys_list;
                                        SubLObject current_19 = datum_18;
                                        SubLObject exist_var_subst = NIL;
                                        SubLObject field_auto_keys_list = NIL;
                                        destructuring_bind_must_consp(current_19, datum_18, $list_alt32);
                                        exist_var_subst = current_19.first();
                                        current_19 = current_19.rest();
                                        destructuring_bind_must_consp(current_19, datum_18, $list_alt32);
                                        field_auto_keys_list = current_19.first();
                                        current_19 = current_19.rest();
                                        if (NIL == current_19) {
                                            {
                                                SubLObject cdolist_list_var_20 = field_auto_keys_list;
                                                SubLObject field_auto_keys = NIL;
                                                for (field_auto_keys = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , field_auto_keys = cdolist_list_var_20.first()) {
                                                    {
                                                        SubLObject datum_21 = field_auto_keys;
                                                        SubLObject current_22 = datum_21;
                                                        SubLObject auto_key_field = NIL;
                                                        SubLObject auto_keys_23 = NIL;
                                                        destructuring_bind_must_consp(current_22, datum_21, $list_alt33);
                                                        auto_key_field = current_22.first();
                                                        current_22 = current_22.rest();
                                                        destructuring_bind_must_consp(current_22, datum_21, $list_alt33);
                                                        auto_keys_23 = current_22.first();
                                                        current_22 = current_22.rest();
                                                        if (NIL == current_22) {
                                                            {
                                                                SubLObject sentence = NIL;
                                                                SubLObject sentence_24 = NIL;
                                                                SubLObject auto_key = NIL;
                                                                SubLObject auto_key_25 = NIL;
                                                                for (sentence = sentences, sentence_24 = sentence.first(), auto_key = auto_keys_23, auto_key_25 = auto_key.first(); !((NIL == auto_key) && (NIL == sentence)); sentence = sentence.rest() , sentence_24 = sentence.first() , auto_key = auto_key.rest() , auto_key_25 = auto_key.first()) {
                                                                    {
                                                                        SubLObject new_exist_var_subst = cycl_utilities.expression_subst(auto_key_25, $NO_VALUE, exist_var_subst, UNPROVIDED, UNPROVIDED);
                                                                        sentence_24 = cycl_utilities.expression_subst(new_exist_var_subst, exist_var, sentence_24, UNPROVIDED, UNPROVIDED);
                                                                        exist_var_sentences = cons(sentence_24, exist_var_sentences);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_21, $list_alt33);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_18, $list_alt32);
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt31);
                        }
                        sentences = nreverse(exist_var_sentences);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject successes = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db(sentences, sks, template, task_process_pool, NIL);
                    SubLObject errors = thread.secondMultipleValue();
                    SubLObject failures = thread.thirdMultipleValue();
                    SubLObject sql_statements = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    result = append(result, successes);
                    sql_statements_to_be_executed = append(sql_statements_to_be_executed, sql_statements);
                }
            }
            return values(result, sql_statements_to_be_executed);
        }
    }

    public static SubLObject sksi_saturate_rule_consequent_process_conjunct(final SubLObject sks, final SubLObject conjunct, final SubLObject v_bindings, final SubLObject auto_keys, SubLObject result, SubLObject sql_statements_to_be_executed, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = sksi_substitute_bindings(conjunct, v_bindings);
        final SubLObject template = sksi_data_warehousing_utilities.make_sentence_template(conjunct);
        SubLObject cdolist_list_var = auto_keys;
        SubLObject exist_var_all_auto_keys_pair = NIL;
        exist_var_all_auto_keys_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject exist_var_sentences = NIL;
            SubLObject current;
            final SubLObject datum = current = exist_var_all_auto_keys_pair;
            SubLObject exist_var = NIL;
            SubLObject all_auto_keys_list = NIL;
            destructuring_bind_must_consp(current, datum, $list30);
            exist_var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list30);
            all_auto_keys_list = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$19 = all_auto_keys_list;
                SubLObject auto_keys_list = NIL;
                auto_keys_list = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    SubLObject current_$21;
                    final SubLObject datum_$20 = current_$21 = auto_keys_list;
                    SubLObject exist_var_subst = NIL;
                    SubLObject field_auto_keys_list = NIL;
                    destructuring_bind_must_consp(current_$21, datum_$20, $list31);
                    exist_var_subst = current_$21.first();
                    current_$21 = current_$21.rest();
                    destructuring_bind_must_consp(current_$21, datum_$20, $list31);
                    field_auto_keys_list = current_$21.first();
                    current_$21 = current_$21.rest();
                    if (NIL == current_$21) {
                        SubLObject cdolist_list_var_$20 = field_auto_keys_list;
                        SubLObject field_auto_keys = NIL;
                        field_auto_keys = cdolist_list_var_$20.first();
                        while (NIL != cdolist_list_var_$20) {
                            SubLObject current_$22;
                            final SubLObject datum_$21 = current_$22 = field_auto_keys;
                            SubLObject auto_key_field = NIL;
                            SubLObject auto_keys_$25 = NIL;
                            destructuring_bind_must_consp(current_$22, datum_$21, $list32);
                            auto_key_field = current_$22.first();
                            current_$22 = current_$22.rest();
                            destructuring_bind_must_consp(current_$22, datum_$21, $list32);
                            auto_keys_$25 = current_$22.first();
                            current_$22 = current_$22.rest();
                            if (NIL == current_$22) {
                                SubLObject sentence = NIL;
                                SubLObject sentence_$26 = NIL;
                                SubLObject auto_key = NIL;
                                SubLObject auto_key_$27 = NIL;
                                sentence = sentences;
                                sentence_$26 = sentence.first();
                                auto_key = auto_keys_$25;
                                auto_key_$27 = auto_key.first();
                                while ((NIL != auto_key) || (NIL != sentence)) {
                                    final SubLObject new_exist_var_subst = cycl_utilities.expression_subst(auto_key_$27, $NO_VALUE, exist_var_subst, UNPROVIDED, UNPROVIDED);
                                    sentence_$26 = cycl_utilities.expression_subst(new_exist_var_subst, exist_var, sentence_$26, UNPROVIDED, UNPROVIDED);
                                    exist_var_sentences = cons(sentence_$26, exist_var_sentences);
                                    sentence = sentence.rest();
                                    sentence_$26 = sentence.first();
                                    auto_key = auto_key.rest();
                                    auto_key_$27 = auto_key.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum_$21, $list32);
                            }
                            cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                            field_auto_keys = cdolist_list_var_$20.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum_$20, $list31);
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    auto_keys_list = cdolist_list_var_$19.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list30);
            }
            sentences = nreverse(exist_var_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            exist_var_all_auto_keys_pair = cdolist_list_var.first();
        } 
        thread.resetMultipleValues();
        final SubLObject successes = sksi_saturate_db(sentences, sks, template, task_process_pool, NIL);
        final SubLObject errors = thread.secondMultipleValue();
        final SubLObject failures = thread.thirdMultipleValue();
        final SubLObject sql_statements = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result = append(result, successes);
        sql_statements_to_be_executed = append(sql_statements_to_be_executed, sql_statements);
        return values(result, sql_statements_to_be_executed);
    }

    public static final SubLObject sksi_saturate_rule_consequent_process_existential_alt(SubLObject sks, SubLObject exist_var, SubLObject conjuncts, SubLObject v_bindings, SubLObject result, SubLObject auto_keys, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject list_var = NIL;
                SubLObject conjunct = NIL;
                SubLObject n = NIL;
                for (list_var = conjuncts, conjunct = list_var.first(), n = ZERO_INTEGER; !((NIL != doneP) || (NIL == list_var)); list_var = list_var.rest() , conjunct = list_var.first() , n = add(ONE_INTEGER, n)) {
                    if (NIL != com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_conjunct_suitable_for_reifying_existentialP(conjunct, exist_var)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject reify_result = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_reify_existential(conjunct, exist_var, sks, v_bindings, task_process_pool);
                            SubLObject all_auto_keys_list = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != all_auto_keys_list) {
                                result = append(result, reify_result);
                                auto_keys = cons(list(exist_var, all_auto_keys_list), auto_keys);
                                conjuncts = list_utilities.remove_nth(n, conjuncts);
                                doneP = T;
                            }
                        }
                    }
                }
            }
            return values(conjuncts, result, auto_keys);
        }
    }

    public static SubLObject sksi_saturate_rule_consequent_process_existential(final SubLObject sks, final SubLObject exist_var, SubLObject conjuncts, final SubLObject v_bindings, SubLObject result, SubLObject auto_keys, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject list_var = NIL;
        SubLObject conjunct = NIL;
        SubLObject n = NIL;
        list_var = conjuncts;
        conjunct = list_var.first();
        for (n = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var); list_var = list_var.rest() , conjunct = list_var.first() , n = add(ONE_INTEGER, n)) {
            if (NIL != sksi_conjunct_suitable_for_reifying_existentialP(conjunct, exist_var)) {
                thread.resetMultipleValues();
                final SubLObject reify_result = sksi_saturate_rule_reify_existential(conjunct, exist_var, sks, v_bindings, task_process_pool);
                final SubLObject all_auto_keys_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != all_auto_keys_list) {
                    result = append(result, reify_result);
                    auto_keys = cons(list(exist_var, all_auto_keys_list), auto_keys);
                    conjuncts = list_utilities.remove_nth(n, conjuncts);
                    doneP = T;
                }
            }
        }
        return values(conjuncts, result, auto_keys);
    }

    public static final SubLObject sksi_conjunct_suitable_for_reifying_existentialP_alt(SubLObject conjunct, SubLObject exist_var) {
        return list_utilities.member_eqP(exist_var, elf_to_list(conjunct));
    }

    public static SubLObject sksi_conjunct_suitable_for_reifying_existentialP(final SubLObject conjunct, final SubLObject exist_var) {
        return list_utilities.member_eqP(exist_var, elf_to_list(conjunct));
    }

    public static final SubLObject sksi_saturate_rule_reify_existential_alt(SubLObject conjunct, SubLObject exist_var, SubLObject sks, SubLObject v_bindings, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject all_auto_keys_list = NIL;
                SubLObject pred_var = $$subKS_Direct;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sks, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sks, ONE_INTEGER, pred_var);
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
                                                SubLObject done_var_26 = NIL;
                                                SubLObject token_var_27 = NIL;
                                                while (NIL == done_var_26) {
                                                    {
                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_27);
                                                        SubLObject valid_28 = makeBoolean(token_var_27 != gaf);
                                                        if (NIL != valid_28) {
                                                            {
                                                                SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject successes = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_reify_existential_int(conjunct, exist_var, sub_ks, sks, v_bindings, task_process_pool);
                                                                    SubLObject auto_keys_list = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    result = append(result, successes);
                                                                    all_auto_keys_list = append(all_auto_keys_list, auto_keys_list);
                                                                }
                                                            }
                                                        }
                                                        done_var_26 = makeBoolean(NIL == valid_28);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                return values(result, all_auto_keys_list);
            }
        }
    }

    public static SubLObject sksi_saturate_rule_reify_existential(final SubLObject conjunct, final SubLObject exist_var, final SubLObject sks, final SubLObject v_bindings, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject all_auto_keys_list = NIL;
        final SubLObject pred_var = $$subKS_Direct;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sks, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sks, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$28 = NIL;
                        final SubLObject token_var_$29 = NIL;
                        while (NIL == done_var_$28) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                            final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(gaf));
                            if (NIL != valid_$30) {
                                final SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                thread.resetMultipleValues();
                                final SubLObject successes = sksi_saturate_rule_reify_existential_int(conjunct, exist_var, sub_ks, sks, v_bindings, task_process_pool);
                                final SubLObject auto_keys_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                result = append(result, successes);
                                all_auto_keys_list = append(all_auto_keys_list, auto_keys_list);
                            }
                            done_var_$28 = makeBoolean(NIL == valid_$30);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return values(result, all_auto_keys_list);
    }

    public static final SubLObject sksi_saturate_rule_reify_existential_int_alt(SubLObject conjunct, SubLObject exist_var, SubLObject sub_ks, SubLObject sks, SubLObject v_bindings, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sub_ks);
                SubLObject ps_ls_pairs = sksi_kb_accessors.sk_source_physical_logical_schema_pairs(sub_ks);
                SubLObject template = sksi_data_warehousing_utilities.make_sentence_template(conjunct);
                SubLObject result = NIL;
                SubLObject auto_keys_list = NIL;
                SubLObject cdolist_list_var = ps_ls_pairs;
                SubLObject ps_ls_pair = NIL;
                for (ps_ls_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ps_ls_pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = ps_ls_pair;
                        SubLObject current = datum;
                        SubLObject physical_schema = NIL;
                        SubLObject logical_schema = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt38);
                        physical_schema = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt38);
                        logical_schema = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject ms = sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemasP(template, logical_schema, physical_schema, UNPROVIDED);
                                if (NIL != ms) {
                                    {
                                        SubLObject exist_var_pos = position(exist_var, conjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject exist_lfi = (NIL != exist_var_pos) ? ((SubLObject) (nth(exist_var_pos, ms))) : NIL;
                                        SubLObject exist_var_subst = (NIL != exist_lfi) ? ((SubLObject) (sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(exist_lfi, UNPROVIDED, UNPROVIDED).first())) : NIL;
                                        SubLObject sentences = NIL;
                                        if (NIL != exist_var_subst) {
                                            exist_var_subst = cycl_utilities.expression_subst(sks, $$TheCurrentKnowledgeSource, exist_var_subst, UNPROVIDED, UNPROVIDED);
                                            exist_var_subst = subst_if($NO_VALUE, PHYSICAL_FIELD_INDEXICAL_P, exist_var_subst, UNPROVIDED);
                                            conjunct = cycl_utilities.expression_subst(exist_var_subst, exist_var, conjunct, UNPROVIDED, UNPROVIDED);
                                            sentences = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_substitute_bindings(conjunct, v_bindings);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject successes = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_int(sentences, sub_ks, list(ps_ls_pair), template, meta_mt, task_process_pool, T, T);
                                                SubLObject errors = thread.secondMultipleValue();
                                                SubLObject failures = thread.thirdMultipleValue();
                                                SubLObject auto_keys = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                result = append(result, successes);
                                                if (NIL != auto_keys) {
                                                    auto_keys_list = cons(list(exist_var_subst, auto_keys), auto_keys_list);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                    }
                }
                return values(result, auto_keys_list);
            }
        }
    }

    public static SubLObject sksi_saturate_rule_reify_existential_int(SubLObject conjunct, final SubLObject exist_var, final SubLObject sub_ks, final SubLObject sks, final SubLObject v_bindings, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sub_ks);
        final SubLObject ps_ls_pairs = sksi_kb_accessors.sk_source_physical_logical_schema_pairs(sub_ks);
        final SubLObject template = sksi_data_warehousing_utilities.make_sentence_template(conjunct);
        SubLObject result = NIL;
        SubLObject auto_keys_list = NIL;
        SubLObject cdolist_list_var = ps_ls_pairs;
        SubLObject ps_ls_pair = NIL;
        ps_ls_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ps_ls_pair;
            SubLObject physical_schema = NIL;
            SubLObject logical_schema = NIL;
            destructuring_bind_must_consp(current, datum, $list37);
            physical_schema = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list37);
            logical_schema = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject ms = sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemasP(template, logical_schema, physical_schema, UNPROVIDED);
                if (NIL != ms) {
                    final SubLObject exist_var_pos = position(exist_var, conjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject exist_lfi = (NIL != exist_var_pos) ? nth(exist_var_pos, ms) : NIL;
                    SubLObject exist_var_subst = (NIL != exist_lfi) ? sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(exist_lfi, UNPROVIDED, UNPROVIDED).first() : NIL;
                    SubLObject sentences = NIL;
                    if (NIL != exist_var_subst) {
                        exist_var_subst = cycl_utilities.expression_subst(sks, $$TheCurrentKnowledgeSource, exist_var_subst, UNPROVIDED, UNPROVIDED);
                        exist_var_subst = subst_if($NO_VALUE, PHYSICAL_FIELD_INDEXICAL_P, exist_var_subst, UNPROVIDED);
                        conjunct = cycl_utilities.expression_subst(exist_var_subst, exist_var, conjunct, UNPROVIDED, UNPROVIDED);
                        sentences = sksi_substitute_bindings(conjunct, v_bindings);
                        thread.resetMultipleValues();
                        final SubLObject successes = sksi_saturate_db_int(sentences, sub_ks, list(ps_ls_pair), template, meta_mt, task_process_pool, T, T);
                        final SubLObject errors = thread.secondMultipleValue();
                        final SubLObject failures = thread.thirdMultipleValue();
                        final SubLObject auto_keys = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        result = append(result, successes);
                        if (NIL != auto_keys) {
                            auto_keys_list = cons(list(exist_var_subst, auto_keys), auto_keys_list);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list37);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ps_ls_pair = cdolist_list_var.first();
        } 
        return values(result, auto_keys_list);
    }

    public static final SubLObject sksi_saturate_db_alt(SubLObject list_of_logical_sentences, SubLObject sk_source, SubLObject sentence_template, SubLObject task_process_pool, SubLObject execute_batchP) {
        if (execute_batchP == UNPROVIDED) {
            execute_batchP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                SubLObject successes = NIL;
                SubLObject errors = NIL;
                SubLObject failures = NIL;
                SubLObject auto_generated_keys = NIL;
                SubLObject sql_statements = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt30$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                                    {
                                        SubLObject _prev_bind_0_29 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject successes_30 = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_recursive(list_of_logical_sentences, sk_source, sentence_template, meta_mt, task_process_pool, execute_batchP);
                                                SubLObject errors_31 = thread.secondMultipleValue();
                                                SubLObject failures_32 = thread.thirdMultipleValue();
                                                SubLObject auto_generated_keys_33 = thread.fourthMultipleValue();
                                                SubLObject sql_statements_34 = thread.fifthMultipleValue();
                                                thread.resetMultipleValues();
                                                successes = successes_30;
                                                errors = errors_31;
                                                failures = failures_32;
                                                auto_generated_keys = auto_generated_keys_33;
                                                sql_statements = sql_statements_34;
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(successes, errors, failures, sql_statements);
            }
        }
    }

    public static SubLObject sksi_saturate_db(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject sentence_template, final SubLObject task_process_pool, SubLObject execute_batchP) {
        if (execute_batchP == UNPROVIDED) {
            execute_batchP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        SubLObject successes = NIL;
        SubLObject errors = NIL;
        SubLObject failures = NIL;
        SubLObject auto_generated_keys = NIL;
        SubLObject sql_statements = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$31 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    thread.resetMultipleValues();
                    final SubLObject successes_$32 = sksi_saturate_db_recursive(list_of_logical_sentences, sk_source, sentence_template, meta_mt, task_process_pool, execute_batchP);
                    final SubLObject errors_$33 = thread.secondMultipleValue();
                    final SubLObject failures_$34 = thread.thirdMultipleValue();
                    final SubLObject auto_generated_keys_$35 = thread.fourthMultipleValue();
                    final SubLObject sql_statements_$36 = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    successes = successes_$32;
                    errors = errors_$33;
                    failures = failures_$34;
                    auto_generated_keys = auto_generated_keys_$35;
                    sql_statements = sql_statements_$36;
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(successes, errors, failures, sql_statements);
    }

    public static final SubLObject sksi_saturate_db_recursive_alt(SubLObject list_of_logical_sentences, SubLObject sk_source, SubLObject template, SubLObject meta_mt, SubLObject task_process_pool, SubLObject execute_batchP) {
        {
            SubLObject ps_ls_pairs = sksi_kb_accessors.sk_source_physical_logical_schema_pairs(sk_source);
            return NIL != ps_ls_pairs ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_int(list_of_logical_sentences, sk_source, ps_ls_pairs, template, meta_mt, task_process_pool, NIL, execute_batchP))) : com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_descend(list_of_logical_sentences, sk_source, template, meta_mt, task_process_pool, execute_batchP);
        }
    }

    public static SubLObject sksi_saturate_db_recursive(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject template, final SubLObject meta_mt, final SubLObject task_process_pool, final SubLObject execute_batchP) {
        final SubLObject ps_ls_pairs = sksi_kb_accessors.sk_source_physical_logical_schema_pairs(sk_source);
        return NIL != ps_ls_pairs ? sksi_saturate_db_int(list_of_logical_sentences, sk_source, ps_ls_pairs, template, meta_mt, task_process_pool, NIL, execute_batchP) : sksi_saturate_db_descend(list_of_logical_sentences, sk_source, template, meta_mt, task_process_pool, execute_batchP);
    }

    public static final SubLObject sksi_saturate_db_int_alt(SubLObject list_of_logical_sentences, SubLObject sk_source, SubLObject ps_ls_pairs, SubLObject template, SubLObject meta_mt, SubLObject task_process_pool, SubLObject get_auto_generated_keysP, SubLObject execute_batchP) {
        if (get_auto_generated_keysP == UNPROVIDED) {
            get_auto_generated_keysP = NIL;
        }
        if (execute_batchP == UNPROVIDED) {
            execute_batchP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, UNPROVIDED, UNPROVIDED);
                SubLObject success = NIL;
                SubLObject error = NIL;
                SubLObject failure = NIL;
                SubLObject auto_generated_keys = NIL;
                SubLObject all_sql_statements = NIL;
                SubLObject cdolist_list_var = ps_ls_pairs;
                SubLObject ps_ls_pair = NIL;
                for (ps_ls_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ps_ls_pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = ps_ls_pair;
                        SubLObject current = datum;
                        SubLObject physical_schema = NIL;
                        SubLObject logical_schema = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt38);
                        physical_schema = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt38);
                        logical_schema = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject result = NIL;
                                SubLObject sql_statements = NIL;
                                if (NIL != sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemasP(template, logical_schema, physical_schema, UNPROVIDED)) {
                                    if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
                                        task_processor.push_tpool_background_msg(cconcatenate($str_alt41$Saturating_, format_nil.format_nil_a_no_copy(sk_source)), task_process_pool);
                                    }
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject result_36 = sksi_batch_store.sksi_store_or_delete_logical_sentences_in_db(list_of_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, $INSERT, get_auto_generated_keysP, execute_batchP);
                                        SubLObject auto_generated_keys_37 = thread.secondMultipleValue();
                                        SubLObject sql_statements_38 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        result = result_36;
                                        auto_generated_keys = auto_generated_keys_37;
                                        sql_statements = sql_statements_38;
                                    }
                                }
                                if (NIL != sql_statements) {
                                    all_sql_statements = append(all_sql_statements, sql_statements);
                                }
                                if (result.isCons() || (NIL != sql_statements)) {
                                    success = cons(sk_source, success);
                                } else {
                                    if (NIL != sdbc.sdbc_error_p(result)) {
                                        error = cons(sk_source, error);
                                    } else {
                                        failure = cons(sk_source, failure);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt38);
                        }
                    }
                }
                return values(success, error, failure, auto_generated_keys, all_sql_statements);
            }
        }
    }

    public static SubLObject sksi_saturate_db_int(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject ps_ls_pairs, final SubLObject template, final SubLObject meta_mt, final SubLObject task_process_pool, SubLObject get_auto_generated_keysP, SubLObject execute_batchP) {
        if (get_auto_generated_keysP == UNPROVIDED) {
            get_auto_generated_keysP = NIL;
        }
        if (execute_batchP == UNPROVIDED) {
            execute_batchP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, UNPROVIDED, UNPROVIDED);
        SubLObject success = NIL;
        SubLObject error = NIL;
        SubLObject failure = NIL;
        SubLObject auto_generated_keys = NIL;
        SubLObject all_sql_statements = NIL;
        SubLObject cdolist_list_var = ps_ls_pairs;
        SubLObject ps_ls_pair = NIL;
        ps_ls_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ps_ls_pair;
            SubLObject physical_schema = NIL;
            SubLObject logical_schema = NIL;
            destructuring_bind_must_consp(current, datum, $list37);
            physical_schema = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list37);
            logical_schema = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject result = NIL;
                SubLObject sql_statements = NIL;
                if (NIL != sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemasP(template, logical_schema, physical_schema, UNPROVIDED)) {
                    if (NIL != task_processor.task_process_pool_p(task_process_pool)) {
                        task_processor.push_tpool_background_msg(cconcatenate($$$Saturating_, format_nil.format_nil_a_no_copy(sk_source)), task_process_pool);
                    }
                    thread.resetMultipleValues();
                    final SubLObject result_$38 = sksi_batch_store.sksi_store_or_delete_logical_sentences_in_db(list_of_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, $INSERT, get_auto_generated_keysP, execute_batchP);
                    final SubLObject auto_generated_keys_$39 = thread.secondMultipleValue();
                    final SubLObject sql_statements_$40 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$38;
                    auto_generated_keys = auto_generated_keys_$39;
                    sql_statements = sql_statements_$40;
                }
                if (NIL != sql_statements) {
                    all_sql_statements = append(all_sql_statements, sql_statements);
                }
                if (result.isCons() || (NIL != sql_statements)) {
                    success = cons(sk_source, success);
                } else
                    if (NIL != sdbc.sdbc_error_p(result)) {
                        error = cons(sk_source, error);
                    } else {
                        failure = cons(sk_source, failure);
                    }

            } else {
                cdestructuring_bind_error(datum, $list37);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ps_ls_pair = cdolist_list_var.first();
        } 
        return values(success, error, failure, auto_generated_keys, all_sql_statements);
    }

    public static final SubLObject sksi_saturate_db_descend_alt(SubLObject list_of_logical_sentences, SubLObject sk_source, SubLObject template, SubLObject meta_mt, SubLObject task_process_pool, SubLObject execute_batchP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successes = NIL;
                SubLObject errors = NIL;
                SubLObject failures = NIL;
                SubLObject sql_statements = NIL;
                SubLObject pred_var = $$subKS_Direct;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sk_source, ONE_INTEGER, pred_var)) {
                    {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sk_source, ONE_INTEGER, pred_var);
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
                                                SubLObject done_var_39 = NIL;
                                                SubLObject token_var_40 = NIL;
                                                while (NIL == done_var_39) {
                                                    {
                                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_40);
                                                        SubLObject valid_41 = makeBoolean(token_var_40 != gaf);
                                                        if (NIL != valid_41) {
                                                            {
                                                                SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject sub_successes = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_recursive(list_of_logical_sentences, sub_ks, template, meta_mt, task_process_pool, execute_batchP);
                                                                    SubLObject sub_errors = thread.secondMultipleValue();
                                                                    SubLObject sub_failures = thread.thirdMultipleValue();
                                                                    SubLObject sub_auto_generated_keys = thread.fourthMultipleValue();
                                                                    SubLObject sub_sql_statements = thread.fifthMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    successes = append(successes, sub_successes);
                                                                    errors = append(errors, sub_errors);
                                                                    failures = append(failures, sub_failures);
                                                                    if (NIL == execute_batchP) {
                                                                        sql_statements = append(sql_statements, sub_sql_statements);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var_39 = makeBoolean(NIL == valid_41);
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                return values(successes, errors, failures, NIL, sql_statements);
            }
        }
    }

    public static SubLObject sksi_saturate_db_descend(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject template, final SubLObject meta_mt, final SubLObject task_process_pool, final SubLObject execute_batchP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successes = NIL;
        SubLObject errors = NIL;
        SubLObject failures = NIL;
        SubLObject sql_statements = NIL;
        final SubLObject pred_var = $$subKS_Direct;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sk_source, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sk_source, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$41 = NIL;
                        final SubLObject token_var_$42 = NIL;
                        while (NIL == done_var_$41) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                            final SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(gaf));
                            if (NIL != valid_$43) {
                                final SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                thread.resetMultipleValues();
                                final SubLObject sub_successes = sksi_saturate_db_recursive(list_of_logical_sentences, sub_ks, template, meta_mt, task_process_pool, execute_batchP);
                                final SubLObject sub_errors = thread.secondMultipleValue();
                                final SubLObject sub_failures = thread.thirdMultipleValue();
                                final SubLObject sub_auto_generated_keys = thread.fourthMultipleValue();
                                final SubLObject sub_sql_statements = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                successes = append(successes, sub_successes);
                                errors = append(errors, sub_errors);
                                failures = append(failures, sub_failures);
                                if (NIL == execute_batchP) {
                                    sql_statements = append(sql_statements, sub_sql_statements);
                                }
                            }
                            done_var_$41 = makeBoolean(NIL == valid_$43);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return values(successes, errors, failures, NIL, sql_statements);
    }

    public static final SubLObject removal_sksi_saturate_rule_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return ONE_INTEGER;
    }

    public static SubLObject removal_sksi_saturate_rule_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return ONE_INTEGER;
    }

    public static final SubLObject removal_sksi_saturate_rule_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.formula_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject rule = NIL;
                SubLObject source_mt = NIL;
                SubLObject target_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt46);
                rule = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt46);
                source_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt46);
                target_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    thread.resetMultipleValues();
                    {
                        SubLObject source_sks_list = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_db_extract_relevant_skses(rule, source_mt, target_mt);
                        SubLObject target_sks_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject datum_42 = cycl_utilities.formula_args(rule, UNPROVIDED);
                            SubLObject current_43 = datum_42;
                            SubLObject antecedent = NIL;
                            SubLObject consequent = NIL;
                            destructuring_bind_must_consp(current_43, datum_42, $list_alt7);
                            antecedent = current_43.first();
                            current_43 = current_43.rest();
                            destructuring_bind_must_consp(current_43, datum_42, $list_alt7);
                            consequent = current_43.first();
                            current_43 = current_43.rest();
                            if (NIL == current_43) {
                                return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.removal_sksi_saturate_rule_expand_int(antecedent, consequent, source_sks_list, target_sks_list, source_mt, target_mt);
                            } else {
                                cdestructuring_bind_error(datum_42, $list_alt7);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt46);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_sksi_saturate_rule_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(asent, UNPROVIDED);
        SubLObject rule = NIL;
        SubLObject source_mt = NIL;
        SubLObject target_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        rule = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        source_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        target_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject source_sks_list = sksi_saturate_db_extract_relevant_skses(rule, source_mt, target_mt);
            final SubLObject target_sks_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current_$45;
            final SubLObject datum_$44 = current_$45 = cycl_utilities.formula_args(rule, UNPROVIDED);
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            destructuring_bind_must_consp(current_$45, datum_$44, $list7);
            antecedent = current_$45.first();
            current_$45 = current_$45.rest();
            destructuring_bind_must_consp(current_$45, datum_$44, $list7);
            consequent = current_$45.first();
            current_$45 = current_$45.rest();
            if (NIL == current_$45) {
                return removal_sksi_saturate_rule_expand_int(antecedent, consequent, source_sks_list, target_sks_list, source_mt, target_mt);
            }
            cdestructuring_bind_error(datum_$44, $list7);
        } else {
            cdestructuring_bind_error(datum, $list45);
        }
        return NIL;
    }

    public static final SubLObject removal_sksi_saturate_rule_expand_int_alt(SubLObject antecedent, SubLObject consequent, SubLObject source_sks_list, SubLObject target_sks_list, SubLObject source_mt, SubLObject target_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject query_results = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.removal_sksi_saturate_query_antecedent(antecedent, consequent, source_mt, target_mt);
                SubLObject query_halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject bindings_to_saturate = list_utilities.fast_delete_duplicates(Mapping.mapcar(symbol_function(FIRST), query_results), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    thread.resetMultipleValues();
                    {
                        SubLObject saturate_results = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_rule_consequent(consequent, target_sks_list, bindings_to_saturate, NIL);
                        SubLObject saturate_time = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != saturate_results) {
                            {
                                SubLObject cdolist_list_var = query_results;
                                SubLObject query_result = NIL;
                                for (query_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_result = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = query_result;
                                        SubLObject current = datum;
                                        SubLObject v_bindings = NIL;
                                        SubLObject supports = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt48);
                                        v_bindings = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt48);
                                        supports = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            backward.removal_add_node(supports.first(), v_bindings, supports.rest());
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt48);
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

    public static SubLObject removal_sksi_saturate_rule_expand_int(final SubLObject antecedent, final SubLObject consequent, final SubLObject source_sks_list, final SubLObject target_sks_list, final SubLObject source_mt, final SubLObject target_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject query_results = removal_sksi_saturate_query_antecedent(antecedent, consequent, source_mt, target_mt);
        final SubLObject query_halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject bindings_to_saturate = list_utilities.fast_delete_duplicates(Mapping.mapcar(symbol_function(FIRST), query_results), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject saturate_results = sksi_saturate_rule_consequent(consequent, target_sks_list, bindings_to_saturate, NIL);
        final SubLObject saturate_time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != saturate_results) {
            SubLObject cdolist_list_var = query_results;
            SubLObject query_result = NIL;
            query_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = query_result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list47);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list47);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    backward.removal_add_node(supports.first(), v_bindings, supports.rest());
                } else {
                    cdestructuring_bind_error(datum, $list47);
                }
                cdolist_list_var = cdolist_list_var.rest();
                query_result = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject removal_sksi_saturate_query_antecedent_alt(SubLObject antecedent, SubLObject consequent, SubLObject source_mt, SubLObject target_mt) {
        {
            SubLObject query_sentence = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_db_saturation.sksi_saturate_prepare_antecedent_query(antecedent, consequent, source_mt, target_mt, NIL);
            return ask_utilities.inference_recursive_query(query_sentence, source_mt, $list_alt49);
        }
    }

    public static SubLObject removal_sksi_saturate_query_antecedent(final SubLObject antecedent, final SubLObject consequent, final SubLObject source_mt, final SubLObject target_mt) {
        final SubLObject query_sentence = sksi_saturate_prepare_antecedent_query(antecedent, consequent, source_mt, target_mt, NIL);
        return ask_utilities.inference_recursive_query(query_sentence, source_mt, $list48);
    }

    public static SubLObject declare_sksi_db_saturation_file() {
        declareFunction("register_sksi_sources_for_db_saturation", "REGISTER-SKSI-SOURCES-FOR-DB-SATURATION", 1, 0, false);
        declareMacro("sksi_saturate_db_print_timing_info", "SKSI-SATURATE-DB-PRINT-TIMING-INFO");
        declareFunction("existentially_bind_dont_care_variables", "EXISTENTIALLY-BIND-DONT-CARE-VARIABLES", 1, 0, false);
        declareFunction("sksi_saturate_db_with_rule_mt", "SKSI-SATURATE-DB-WITH-RULE-MT", 2, 2, false);
        declareFunction("sksi_saturate_db_with_rule_consequent_from_inference_bindings", "SKSI-SATURATE-DB-WITH-RULE-CONSEQUENT-FROM-INFERENCE-BINDINGS", 3, 0, false);
        declareFunction("sksi_saturate_db_with_rule", "SKSI-SATURATE-DB-WITH-RULE", 3, 2, false);
        declareFunction("sksi_saturate_db_with_rule_mt_int", "SKSI-SATURATE-DB-WITH-RULE-MT-INT", 2, 2, false);
        declareFunction("sksi_substitute_bindings", "SKSI-SUBSTITUTE-BINDINGS", 2, 0, false);
        declareFunction("sksi_saturate_db_extract_relevant_skses", "SKSI-SATURATE-DB-EXTRACT-RELEVANT-SKSES", 1, 2, false);
        declareFunction("sksi_saturate_query_rule_antecedent", "SKSI-SATURATE-QUERY-RULE-ANTECEDENT", 7, 0, false);
        declareFunction("sksi_saturate_prepare_antecedent_query", "SKSI-SATURATE-PREPARE-ANTECEDENT-QUERY", 4, 1, false);
        declareFunction("existentially_bind_dont_care_variables_int", "EXISTENTIALLY-BIND-DONT-CARE-VARIABLES-INT", 2, 0, false);
        declareFunction("sksi_saturate_prepare_antecedent_query_mt", "SKSI-SATURATE-PREPARE-ANTECEDENT-QUERY-MT", 1, 0, false);
        declareFunction("sksi_saturate_rule_consequent", "SKSI-SATURATE-RULE-CONSEQUENT", 4, 0, false);
        declareFunction("sksi_saturate_rule_consequent_int", "SKSI-SATURATE-RULE-CONSEQUENT-INT", 4, 0, false);
        declareFunction("sksi_saturate_rule_el_existential_consequent", "SKSI-SATURATE-RULE-EL-EXISTENTIAL-CONSEQUENT", 4, 1, false);
        declareFunction("sksi_saturate_rule_el_existential_consequent_int", "SKSI-SATURATE-RULE-EL-EXISTENTIAL-CONSEQUENT-INT", 5, 0, false);
        declareFunction("sksi_saturate_rule_consequent_process_conjunct", "SKSI-SATURATE-RULE-CONSEQUENT-PROCESS-CONJUNCT", 7, 0, false);
        declareFunction("sksi_saturate_rule_consequent_process_existential", "SKSI-SATURATE-RULE-CONSEQUENT-PROCESS-EXISTENTIAL", 7, 0, false);
        declareFunction("sksi_conjunct_suitable_for_reifying_existentialP", "SKSI-CONJUNCT-SUITABLE-FOR-REIFYING-EXISTENTIAL?", 2, 0, false);
        declareFunction("sksi_saturate_rule_reify_existential", "SKSI-SATURATE-RULE-REIFY-EXISTENTIAL", 5, 0, false);
        declareFunction("sksi_saturate_rule_reify_existential_int", "SKSI-SATURATE-RULE-REIFY-EXISTENTIAL-INT", 6, 0, false);
        declareFunction("sksi_saturate_db", "SKSI-SATURATE-DB", 4, 1, false);
        declareFunction("sksi_saturate_db_recursive", "SKSI-SATURATE-DB-RECURSIVE", 6, 0, false);
        declareFunction("sksi_saturate_db_int", "SKSI-SATURATE-DB-INT", 6, 2, false);
        declareFunction("sksi_saturate_db_descend", "SKSI-SATURATE-DB-DESCEND", 6, 0, false);
        declareFunction("removal_sksi_saturate_rule_cost", "REMOVAL-SKSI-SATURATE-RULE-COST", 1, 1, false);
        declareFunction("removal_sksi_saturate_rule_expand", "REMOVAL-SKSI-SATURATE-RULE-EXPAND", 1, 1, false);
        declareFunction("removal_sksi_saturate_rule_expand_int", "REMOVAL-SKSI-SATURATE-RULE-EXPAND-INT", 6, 0, false);
        declareFunction("removal_sksi_saturate_query_antecedent", "REMOVAL-SKSI-SATURATE-QUERY-ANTECEDENT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_db_saturation_file() {
        return NIL;
    }

    public static final SubLObject setup_sksi_db_saturation_file_alt() {
        register_external_symbol(REGISTER_SKSI_SOURCES_FOR_DB_SATURATION);
        register_external_symbol(EXISTENTIALLY_BIND_DONT_CARE_VARIABLES);
        register_external_symbol(SKSI_SATURATE_DB_WITH_RULE_MT);
        inference_modules.inference_removal_module($REMOVAL_SKSI_SATURATE_RULE, $list_alt44);
        inference_modules.register_solely_specific_removal_module_predicate($$sksiSaturateRule);
        return NIL;
    }

    public static SubLObject setup_sksi_db_saturation_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(REGISTER_SKSI_SOURCES_FOR_DB_SATURATION);
            register_external_symbol(EXISTENTIALLY_BIND_DONT_CARE_VARIABLES);
            register_external_symbol(SKSI_SATURATE_DB_WITH_RULE_MT);
            inference_modules.inference_removal_module($REMOVAL_SKSI_SATURATE_RULE, $list43);
            inference_modules.register_solely_specific_removal_module_predicate($$sksiSaturateRule);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_SKSI_SATURATE_RULE, $list_alt44);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_db_saturation_file_Previous() {
        register_external_symbol(REGISTER_SKSI_SOURCES_FOR_DB_SATURATION);
        register_external_symbol(EXISTENTIALLY_BIND_DONT_CARE_VARIABLES);
        register_external_symbol(SKSI_SATURATE_DB_WITH_RULE_MT);
        inference_modules.inference_removal_module($REMOVAL_SKSI_SATURATE_RULE, $list43);
        inference_modules.register_solely_specific_removal_module_predicate($$sksiSaturateRule);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_db_saturation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_db_saturation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_db_saturation_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SKSI-PROFILING-ON?"));

    static private final SubLList $list_alt7 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    static private final SubLString $str_alt9$__Total_time____A_sec__ = makeString("~%Total time : ~A sec~%");

    static private final SubLString $str_alt11$SKSI_SQL_statement_cache_ = makeString("SKSI SQL statement cache ");

    static private final SubLString $str_alt12$Could_not_determine_the_source_SK = makeString("Could not determine the source SKS list for ~s");

    static private final SubLString $str_alt13$Could_not_determine_the_target_SK = makeString("Could not determine the target SKS list for ~s");

    static private final SubLString $str_alt15$__Query_time____A_sec__ = makeString("~%Query time : ~A sec~%");

    static private final SubLString $str_alt16$_Cyc_side____A_sec__ = makeString(" Cyc side : ~A sec~%");

    static private final SubLString $str_alt17$_DB_side____A_sec__ = makeString(" DB side : ~A sec~%");

    static private final SubLString $str_alt18$___SQL_queries____A__ = makeString(" # SQL queries : ~A~%");

    static private final SubLString $str_alt19$___bindings____A__ = makeString(" # bindings : ~A~%");

    static private final SubLString $str_alt20$_Halt_reason____A__ = makeString(" Halt reason : ~A~%");

    static private final SubLString $str_alt26$Unhandled___sksiSaturate_rule_con = makeString("Unhandled #$sksiSaturate rule consequent ~s");

    static private final SubLString $str_alt27$__Saturation_time____A_sec__ = makeString("~%Saturation time : ~A sec~%");

    static private final SubLString $str_alt28$___DB_edits____A__ = makeString(" # DB edits : ~A~%");

    static private final SubLString $str_alt29$___batch_SQL_updates____A__ = makeString(" # batch SQL updates : ~A~%");

    static private final SubLString $str_alt30$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt31 = list(makeSymbol("EXIST-VAR"), makeSymbol("ALL-AUTO-KEYS-LIST"));

    static private final SubLList $list_alt32 = list(makeSymbol("EXIST-VAR-SUBST"), makeSymbol("FIELD-AUTO-KEYS-LIST"));

    static private final SubLList $list_alt33 = list(makeSymbol("AUTO-KEY-FIELD"), makeSymbol("AUTO-KEYS"));

    static private final SubLList $list_alt38 = list(makeSymbol("PHYSICAL-SCHEMA"), makeSymbol("LOGICAL-SCHEMA"));

    static private final SubLString $str_alt41$Saturating_ = makeString("Saturating ");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("sksiSaturateRule"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("sksiSaturateRule"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), $COST, makeSymbol("REMOVAL-SKSI-SATURATE-RULE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKSI-SATURATE-RULE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$sksiSaturateRule <rule> <source-mt> <target-mt>)"), makeKeyword("EXAMPLE"), makeString("") });

    static private final SubLList $list_alt46 = list(makeSymbol("RULE"), makeSymbol("SOURCE-MT"), makeSymbol("TARGET-MT"));

    static private final SubLList $list_alt48 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt49 = list(makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"));
}

/**
 * Total time: 399 ms
 */
