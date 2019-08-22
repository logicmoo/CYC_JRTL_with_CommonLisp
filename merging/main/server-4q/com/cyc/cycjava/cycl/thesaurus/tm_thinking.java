/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sunit_macros;
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
 *  module:      TM-THINKING
 *  source file: /cyc/top/cycl/thesaurus/tm-thinking.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_thinking extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_thinking() {
    }

    public static final SubLFile me = new tm_thinking();

    public static final String myName = "com.cyc.cycjava.cycl.thesaurus.tm_thinking";

    // // Definitions
    // deflexical
    private static final SubLSymbol $tm_thinking_index$ = makeSymbol("*TM-THINKING-INDEX*");

    // deflexical
    private static final SubLSymbol $tm_thinking_index_lock$ = makeSymbol("*TM-THINKING-INDEX-LOCK*");

    // deflexical
    private static final SubLSymbol $tm_thinking_isg$ = makeSymbol("*TM-THINKING-ISG*");

    public static final SubLObject next_tm_thinking_id() {
        return integer_sequence_generator.integer_sequence_generator_next($tm_thinking_isg$.getGlobalValue());
    }

    public static final SubLObject tm_all_thinkings() {
        return dictionary.dictionary_values($tm_thinking_index$.getGlobalValue());
    }

    public static final SubLObject tm_thinking_id(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ID);
    }

    public static final SubLObject tm_thinking_user(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TM_USER);
    }

    public static final SubLObject tm_thinking_type(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $TYPE);
    }

    public static final SubLObject tm_thinking_function(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $FUNCTION);
    }

    public static final SubLObject tm_thinking_args(SubLObject thinking) {
        return process_utilities.thinking_property(thinking, $ARGS);
    }

    public static final SubLObject tm_thinking_name(SubLObject thinking) {
        {
            SubLObject type = tm_thinking_type(thinking);
            return tm_thinking_name_for_type(type);
        }
    }

    public static final SubLObject tm_thinking_name_for_type(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($GENERATE_THESAURI_REPORT)) {
                return $$$Generate_Thesaurus_Statistics;
            } else
                if (pcase_var.eql($COPY_THESAURUS)) {
                    return $$$Copy_Thesaurus;
                } else
                    if (pcase_var.eql($LOAD_THESAURUS)) {
                        return $$$Load_Thesaurus;
                    } else
                        if (pcase_var.eql($UPDATE_LOAD)) {
                            return $$$Update_Load_Analysis;
                        } else
                            if (pcase_var.eql($OUTPUT_THESAURUS)) {
                                return $$$Output_Thesaurus;
                            } else
                                if (pcase_var.eql($BACKUP_THESAURI)) {
                                    return $$$Backup_Thesaurus_Info_To_File;
                                } else
                                    if (pcase_var.eql($COUNTING)) {
                                        return $$$Counting;
                                    } else {
                                        Errors.error($str_alt20$Unknown_thinking_type__A, type);
                                    }






        }
        return NIL;
    }

    public static final SubLObject tm_thinking_progress_message(SubLObject thinking) {
        {
            SubLObject type = tm_thinking_type(thinking);
            SubLObject args = tm_thinking_args(thinking);
            SubLObject pcase_var = type;
            if (pcase_var.eql($GENERATE_THESAURI_REPORT)) {
                return $str_alt21$Generating_Thesaurus_Statistics__;
            } else
                if (pcase_var.eql($COPY_THESAURUS)) {
                    {
                        SubLObject datum = args;
                        SubLObject current = datum;
                        SubLObject source_thesaurus = NIL;
                        SubLObject target_thesaurus = NIL;
                        SubLObject target_concept = NIL;
                        SubLObject start_concepts = NIL;
                        SubLObject cutoff_concepts = NIL;
                        SubLObject num_levels = NIL;
                        SubLObject skipped_facts_log = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        source_thesaurus = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        target_thesaurus = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        target_concept = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        start_concepts = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        cutoff_concepts = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        num_levels = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        skipped_facts_log = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != tm_internals.thesaurusP(source_thesaurus)) && (NIL != tm_internals.thesaurusP(target_thesaurus))) {
                                return cconcatenate($str_alt23$Copying_Thesaurus_, new SubLObject[]{ tm_internals.thesaurus_name(source_thesaurus), $str_alt24$_to_, tm_internals.thesaurus_name(target_thesaurus) });
                            } else {
                                return $str_alt25$Copy_Thesaurus__Details_no_longer;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                    }
                } else
                    if (pcase_var.eql($LOAD_THESAURUS)) {
                        {
                            SubLObject datum = args;
                            SubLObject current = datum;
                            SubLObject pathname = NIL;
                            SubLObject thesaurus = NIL;
                            SubLObject format = NIL;
                            SubLObject reuse_mode = NIL;
                            SubLObject reuse_thesauri = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt26);
                            pathname = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt26);
                            thesaurus = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt26);
                            format = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt26);
                            reuse_mode = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt26);
                            reuse_thesauri = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != tm_internals.thesaurusP(thesaurus)) {
                                    {
                                        SubLObject pcase_var_1 = process_utilities.thinking_property(thinking, $PASS);
                                        if (pcase_var_1.eql(ONE_INTEGER)) {
                                            return cconcatenate($str_alt27$Checking_relations_in_load_file_, new SubLObject[]{ pathname, $str_alt28$_for_thesaurus_, tm_internals.thesaurus_name(thesaurus) });
                                        } else
                                            if (pcase_var_1.eql(TWO_INTEGER)) {
                                                return cconcatenate($str_alt29$Loading_Thesaurus_, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt30$_in_format_, string_utilities.string_from_keyword(format), $str_alt31$_from_file_, pathname });
                                            }

                                    }
                                } else {
                                    return $str_alt33$Load_Thesaurus__Details_no_longer;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt26);
                            }
                        }
                    } else
                        if (pcase_var.eql($UPDATE_LOAD)) {
                            {
                                SubLObject datum = args;
                                SubLObject current = datum;
                                SubLObject pathname = NIL;
                                SubLObject thesaurus = NIL;
                                SubLObject format = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt34);
                                pathname = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt34);
                                thesaurus = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt34);
                                format = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != tm_internals.thesaurusP(thesaurus)) {
                                        return cconcatenate($str_alt35$Update_load_analysis_for_, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt36$_with_respect_to_, string_utilities.string_from_keyword(format), $str_alt37$_file_, pathname });
                                    } else {
                                        return $str_alt38$Update_Load_Analysis__Details_no_;
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt34);
                                }
                            }
                        } else
                            if (pcase_var.eql($OUTPUT_THESAURUS)) {
                                {
                                    SubLObject datum = args;
                                    SubLObject current = datum;
                                    SubLObject thesaurus = NIL;
                                    SubLObject pathname = NIL;
                                    SubLObject format = NIL;
                                    SubLObject start_terms = NIL;
                                    SubLObject cutoff_terms = NIL;
                                    SubLObject cutoff_level = NIL;
                                    SubLObject filter = NIL;
                                    SubLObject v_case = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    thesaurus = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    pathname = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    format = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    start_terms = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    cutoff_terms = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    cutoff_level = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    filter = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt39);
                                    v_case = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != tm_internals.thesaurusP(thesaurus)) {
                                            return cconcatenate($str_alt40$Outputting_thesaurus_, new SubLObject[]{ tm_internals.thesaurus_name(thesaurus), $str_alt41$_to_file_, pathname, $str_alt42$_using_, string_utilities.string_from_keyword(format), $str_alt43$_format___ });
                                        } else {
                                            return $str_alt44$Output_Thesaurus__Details_no_long;
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt39);
                                    }
                                }
                            } else
                                if (pcase_var.eql($BACKUP_THESAURI)) {
                                    {
                                        SubLObject datum = args;
                                        SubLObject current = datum;
                                        SubLObject pathname = NIL;
                                        SubLObject thesauri = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt45);
                                        pathname = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt45);
                                        thesauri = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            return cconcatenate($str_alt46$Backing_up_thesaurus_information_, pathname);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt45);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($COUNTING)) {
                                        return format(NIL, $str_alt47$Counting_to__A____, args.first());
                                    } else {
                                        Errors.error($str_alt20$Unknown_thinking_type__A, type);
                                    }






        }
        return NIL;
    }

    public static final SubLObject tm_add_thinking(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject id = tm_thinking_id(thinking);
            dictionary.dictionary_enter($tm_thinking_index$.getGlobalValue(), id, thinking);
        }
        {
            SubLObject user = tm_thinking_user(thinking);
            if (NIL != user) {
                tm_datastructures.change_tm_value(user, $THINKINGS, thinking, $ADJOIN);
            }
        }
        return tm_all_thinkings();
    }

    public static final SubLObject tm_remove_thinking(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject id = tm_thinking_id(thinking);
            dictionary.dictionary_remove($tm_thinking_index$.getGlobalValue(), id);
        }
        {
            SubLObject user = tm_thinking_user(thinking);
            if (NIL != user) {
                tm_datastructures.change_tm_value(user, $THINKINGS, remove(thinking, tm_datastructures.tm_value(user, $THINKINGS), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            }
        }
        return tm_all_thinkings();
    }

    /**
     * Retrieve a thinking task by ID.
     */
    public static final SubLObject tm_lookup_thinking(SubLObject id) {
        SubLTrampolineFile.checkType(id, INTEGERP);
        return dictionary.dictionary_lookup($tm_thinking_index$.getGlobalValue(), id, UNPROVIDED);
    }

    /**
     * Create a new thinking task of type TYPE, started by USER.
     */
    public static final SubLObject tm_new_thinking(SubLObject user, SubLObject type) {
        {
            SubLObject id = next_tm_thinking_id();
            SubLObject v_properties = list($TM_USER, user, $TYPE, type, $ID, id);
            SubLObject thinking = process_utilities.new_thinking_task(tm_thinking_name_for_type(type), $str_alt52$Starting___, v_properties);
            tm_add_thinking(thinking);
            return thinking;
        }
    }

    /**
     * Start THINKING running FUNCTION on ARG-LIST.
     */
    public static final SubLObject tm_thinking_start(SubLObject thinking, SubLObject function, SubLObject arg_list) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        process_utilities.thinking_note_property(thinking, $FUNCTION, function);
        process_utilities.thinking_note_property(thinking, $ARGS, arg_list);
        return process_utilities.thinking_start(thinking, TM_THINKING_THREAD_RUN, NIL);
    }

    public static final SubLObject tm_thinking_thread_run() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thinking = process_utilities.thinking_task();
                SubLObject user = tm_thinking_user(thinking);
                SubLObject function = tm_thinking_function(thinking);
                SubLObject args = tm_thinking_args(thinking);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = tm_datastructures.$tm_user$.currentBinding(thread);
                    try {
                        tm_datastructures.$tm_user$.bind(user, thread);
                        result = apply(function, args);
                    } finally {
                        tm_datastructures.$tm_user$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Halt THINKING.
     */
    public static final SubLObject tm_thinking_stop(SubLObject thinking) {
        return process_utilities.thinking_stop(thinking);
    }

    /**
     * Remember FUNCTION and ARG-LIST so that THINKING can be started on them later.
     */
    public static final SubLObject tm_thinking_delay_start(SubLObject thinking, SubLObject function, SubLObject arg_list) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        process_utilities.thinking_note_property(thinking, $FUNCTION, function);
        process_utilities.thinking_note_property(thinking, $ARGS, arg_list);
        return thinking;
    }

    /**
     * Start THINKING with a remembered function and list of arguments.
     */
    public static final SubLObject tm_thinking_start_after_delay(SubLObject thinking) {
        {
            SubLObject function = tm_thinking_function(thinking);
            SubLObject args = tm_thinking_args(thinking);
            SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
            SubLTrampolineFile.checkType(args, CONSP);
            return process_utilities.thinking_start(thinking, function, args);
        }
    }

    /**
     * Note a percent progress of SOFAR of TOTAL items in THINKING.
     */
    public static final SubLObject tm_thinking_note_percent_progress(SubLObject sofar, SubLObject total, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        SubLTrampolineFile.checkType(sofar, INTEGERP);
        SubLTrampolineFile.checkType(total, INTEGERP);
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_progress_sofar(thinking, sofar);
            process_utilities.thinking_note_progress_total(thinking, total);
        }
        return thinking;
    }

    /**
     * Increment the progress-sofar value for THINKING.
     */
    public static final SubLObject tm_thinking_cinc_sofar(SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            {
                SubLObject current = process_utilities.thinking_progress_sofar(thinking);
                SubLObject v_new = add(current, ONE_INTEGER);
                process_utilities.thinking_note_progress_sofar(thinking, v_new);
            }
        }
        return thinking;
    }

    /**
     * Set the progress-sofar value for THINKING to SOFAR.
     */
    public static final SubLObject tm_thinking_set_progress_sofar(SubLObject sofar, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        SubLTrampolineFile.checkType(sofar, INTEGERP);
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_progress_sofar(thinking, sofar);
        }
        return thinking;
    }

    /**
     * Set the progress-total value for THINKING to TOTAL.
     */
    public static final SubLObject tm_thinking_set_progress_total(SubLObject total, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        SubLTrampolineFile.checkType(total, INTEGERP);
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_progress_total(thinking, total);
        }
        return thinking;
    }

    public static final SubLObject tm_thinking_set_property(SubLObject property, SubLObject value, SubLObject thinking) {
        if (thinking == UNPROVIDED) {
            thinking = process_utilities.thinking_task();
        }
        SubLTrampolineFile.checkType(property, KEYWORDP);
        if (NIL != process_utilities.thinking_task_p(thinking)) {
            process_utilities.thinking_note_property(thinking, property, value);
        }
        return thinking;
    }

    /**
     * Returns all running thinking tasks having type = TYPE.
     */
    public static final SubLObject tm_active_thinking_tasks_of_type(SubLObject type) {
        SubLTrampolineFile.checkType(type, KEYWORDP);
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tm_all_thinkings();
            SubLObject thinking = NIL;
            for (thinking = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thinking = cdolist_list_var.first()) {
                if ((NIL != processp(process_utilities.thinking_thread(thinking))) && (tm_thinking_type(thinking) == type)) {
                    result = cons(thinking, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * Returns all thinking tasks of TYPE which involve THESAURUS.
     */
    public static final SubLObject tm_thinking_tasks_of_type_for_thesaurus(SubLObject type, SubLObject thesaurus) {
        SubLTrampolineFile.checkType(type, KEYWORDP);
        SubLTrampolineFile.checkType(thesaurus, $sym57$THESAURUS_);
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tm_all_thinkings();
            SubLObject thinking = NIL;
            for (thinking = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thinking = cdolist_list_var.first()) {
                if (tm_thinking_type(thinking) == type) {
                    {
                        SubLObject args = tm_thinking_args(thinking);
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($GENERATE_THESAURI_REPORT)) {
                        } else
                            if (pcase_var.eql($COPY_THESAURUS)) {
                                if ((thesaurus == second(args)) || (thesaurus == args.first())) {
                                    result = cons(thinking, result);
                                }
                            } else
                                if (pcase_var.eql($LOAD_THESAURUS)) {
                                    if (thesaurus == args.first()) {
                                        result = cons(thinking, result);
                                    }
                                } else
                                    if (pcase_var.eql($UPDATE_LOAD)) {
                                        if (thesaurus == second(args)) {
                                            result = cons(thinking, result);
                                        }
                                    } else
                                        if (pcase_var.eql($OUTPUT_THESAURUS)) {
                                            if (thesaurus == args.first()) {
                                                result = cons(thinking, result);
                                            }
                                        } else
                                            if (pcase_var.eql($BACKUP_THESAURI)) {
                                                if (NIL != subl_promotions.memberP(thesaurus, second(args), UNPROVIDED, UNPROVIDED)) {
                                                    result = cons(thinking, result);
                                                }
                                            } else
                                                if (pcase_var.eql($COUNTING)) {
                                                } else {
                                                    Errors.error($str_alt20$Unknown_thinking_type__A, type);
                                                }






                    }
                }
            }
            return nreverse(result);
        }
    }

    /**
     * Return a list of currently-running thinking tasks of type TYPE, which involve
     * THESAURUS.
     */
    public static final SubLObject tm_active_thinking_tasks_of_type_for_thesaurus(SubLObject type, SubLObject thesaurus) {
        SubLTrampolineFile.checkType(type, KEYWORDP);
        SubLTrampolineFile.checkType(thesaurus, $sym57$THESAURUS_);
        {
            SubLObject candidates = tm_thinking_tasks_of_type_for_thesaurus(type, thesaurus);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = NIL;
            for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                if (NIL != processp(process_utilities.thinking_thread(candidate))) {
                    result = cons(candidate, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * Return a list of thinking tasks which involve THESAURUS, whether they
     * are actively running or not.
     */
    public static final SubLObject tm_any_thinking_task_for_thesaurus(SubLObject thesaurus) {
        SubLTrampolineFile.checkType(thesaurus, $sym57$THESAURUS_);
        return makeBoolean(((((NIL != tm_thinking_tasks_of_type_for_thesaurus($COPY_THESAURUS, thesaurus)) || (NIL != tm_thinking_tasks_of_type_for_thesaurus($LOAD_THESAURUS, thesaurus))) || (NIL != tm_thinking_tasks_of_type_for_thesaurus($UPDATE_LOAD, thesaurus))) || (NIL != tm_thinking_tasks_of_type_for_thesaurus($OUTPUT_THESAURUS, thesaurus))) || (NIL != tm_thinking_tasks_of_type_for_thesaurus($BACKUP_THESAURI, thesaurus)));
    }

    /**
     * Only call this within HTML interface code.  Returns T IFF there is some
     * thinking task that the user started, or if there are any thinking tasks and
     * the user is an administrator.
     */
    public static final SubLObject tm_relevant_thinking_task_p() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) {
                return list_utilities.sublisp_boolean(tm_all_thinkings());
            }
            return list_utilities.sublisp_boolean(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THINKINGS));
        }
    }

    public static final SubLObject get_tm_thinking_user(SubLObject v_tm_thinking) {
        return classes.subloop_get_access_protected_instance_slot(v_tm_thinking, THREE_INTEGER, USER);
    }

    public static final SubLObject set_tm_thinking_user(SubLObject v_tm_thinking, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_tm_thinking, value, THREE_INTEGER, USER);
    }

    public static final SubLObject subloop_reserved_initialize_tm_thinking_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_tm_thinking_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, TM_THINKING, USER, NIL);
        return NIL;
    }

    public static final SubLObject tm_thinking_p(SubLObject v_tm_thinking) {
        return classes.subloop_instanceof_class(v_tm_thinking, TM_THINKING);
    }

    public static final SubLObject declare_tm_thinking_file() {
        declareFunction("next_tm_thinking_id", "NEXT-TM-THINKING-ID", 0, 0, false);
        declareFunction("tm_all_thinkings", "TM-ALL-THINKINGS", 0, 0, false);
        declareFunction("tm_thinking_id", "TM-THINKING-ID", 1, 0, false);
        declareFunction("tm_thinking_user", "TM-THINKING-USER", 1, 0, false);
        declareFunction("tm_thinking_type", "TM-THINKING-TYPE", 1, 0, false);
        declareFunction("tm_thinking_function", "TM-THINKING-FUNCTION", 1, 0, false);
        declareFunction("tm_thinking_args", "TM-THINKING-ARGS", 1, 0, false);
        declareFunction("tm_thinking_name", "TM-THINKING-NAME", 1, 0, false);
        declareFunction("tm_thinking_name_for_type", "TM-THINKING-NAME-FOR-TYPE", 1, 0, false);
        declareFunction("tm_thinking_progress_message", "TM-THINKING-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("tm_add_thinking", "TM-ADD-THINKING", 1, 0, false);
        declareFunction("tm_remove_thinking", "TM-REMOVE-THINKING", 1, 0, false);
        declareFunction("tm_lookup_thinking", "TM-LOOKUP-THINKING", 1, 0, false);
        declareFunction("tm_new_thinking", "TM-NEW-THINKING", 2, 0, false);
        declareFunction("tm_thinking_start", "TM-THINKING-START", 3, 0, false);
        declareFunction("tm_thinking_thread_run", "TM-THINKING-THREAD-RUN", 0, 0, false);
        declareFunction("tm_thinking_stop", "TM-THINKING-STOP", 1, 0, false);
        declareFunction("tm_thinking_delay_start", "TM-THINKING-DELAY-START", 3, 0, false);
        declareFunction("tm_thinking_start_after_delay", "TM-THINKING-START-AFTER-DELAY", 1, 0, false);
        declareFunction("tm_thinking_note_percent_progress", "TM-THINKING-NOTE-PERCENT-PROGRESS", 2, 1, false);
        declareFunction("tm_thinking_cinc_sofar", "TM-THINKING-CINC-SOFAR", 0, 1, false);
        declareFunction("tm_thinking_set_progress_sofar", "TM-THINKING-SET-PROGRESS-SOFAR", 1, 1, false);
        declareFunction("tm_thinking_set_progress_total", "TM-THINKING-SET-PROGRESS-TOTAL", 1, 1, false);
        declareFunction("tm_thinking_set_property", "TM-THINKING-SET-PROPERTY", 2, 1, false);
        declareFunction("tm_active_thinking_tasks_of_type", "TM-ACTIVE-THINKING-TASKS-OF-TYPE", 1, 0, false);
        declareFunction("tm_thinking_tasks_of_type_for_thesaurus", "TM-THINKING-TASKS-OF-TYPE-FOR-THESAURUS", 2, 0, false);
        declareFunction("tm_active_thinking_tasks_of_type_for_thesaurus", "TM-ACTIVE-THINKING-TASKS-OF-TYPE-FOR-THESAURUS", 2, 0, false);
        declareFunction("tm_any_thinking_task_for_thesaurus", "TM-ANY-THINKING-TASK-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_relevant_thinking_task_p", "TM-RELEVANT-THINKING-TASK-P", 0, 0, false);
        declareFunction("get_tm_thinking_user", "GET-TM-THINKING-USER", 1, 0, false);
        declareFunction("set_tm_thinking_user", "SET-TM-THINKING-USER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_tm_thinking_class", "SUBLOOP-RESERVED-INITIALIZE-TM-THINKING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_tm_thinking_instance", "SUBLOOP-RESERVED-INITIALIZE-TM-THINKING-INSTANCE", 1, 0, false);
        declareFunction("tm_thinking_p", "TM-THINKING-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_thinking_file() {
        deflexical("*TM-THINKING-INDEX*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TM-THINKING-INDEX-LOCK*", make_lock($$$TM_Thinking_Lock));
        deflexical("*TM-THINKING-ISG*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_tm_thinking_file() {
                sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TM_THINKING, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TM_THINKING);
        classes.subloop_new_class(TM_THINKING, TEST_CASE, NIL, NIL, $list_alt61);
        classes.class_set_implements_slot_listeners(TM_THINKING, NIL);
        classes.subloop_note_class_initialization_function(TM_THINKING, SUBLOOP_RESERVED_INITIALIZE_TM_THINKING_CLASS);
        classes.subloop_note_instance_initialization_function(TM_THINKING, SUBLOOP_RESERVED_INITIALIZE_TM_THINKING_INSTANCE);
        subloop_reserved_initialize_tm_thinking_class(TM_THINKING);
        sunit_macros.define_test_case_postamble(TM_THINKING, $str_alt77$tm_thinking, $$$cycl, NIL);
        sunit_macros.def_test_method_register(TM_THINKING, TEST_BASIC);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$TM_Thinking_Lock = makeString("TM Thinking Lock");



    private static final SubLSymbol $TM_USER = makeKeyword("TM-USER");







    private static final SubLSymbol $GENERATE_THESAURI_REPORT = makeKeyword("GENERATE-THESAURI-REPORT");

    static private final SubLString $$$Generate_Thesaurus_Statistics = makeString("Generate Thesaurus Statistics");

    private static final SubLSymbol $COPY_THESAURUS = makeKeyword("COPY-THESAURUS");

    static private final SubLString $$$Copy_Thesaurus = makeString("Copy Thesaurus");

    private static final SubLSymbol $LOAD_THESAURUS = makeKeyword("LOAD-THESAURUS");

    static private final SubLString $$$Load_Thesaurus = makeString("Load Thesaurus");

    private static final SubLSymbol $UPDATE_LOAD = makeKeyword("UPDATE-LOAD");

    static private final SubLString $$$Update_Load_Analysis = makeString("Update Load Analysis");

    private static final SubLSymbol $OUTPUT_THESAURUS = makeKeyword("OUTPUT-THESAURUS");

    static private final SubLString $$$Output_Thesaurus = makeString("Output Thesaurus");

    private static final SubLSymbol $BACKUP_THESAURI = makeKeyword("BACKUP-THESAURI");

    static private final SubLString $$$Backup_Thesaurus_Info_To_File = makeString("Backup Thesaurus Info To File");

    private static final SubLSymbol $COUNTING = makeKeyword("COUNTING");

    static private final SubLString $$$Counting = makeString("Counting");

    static private final SubLString $str_alt20$Unknown_thinking_type__A = makeString("Unknown thinking type ~A");

    static private final SubLString $str_alt21$Generating_Thesaurus_Statistics__ = makeString("Generating Thesaurus Statistics ...");

    static private final SubLList $list_alt22 = list(makeSymbol("SOURCE-THESAURUS"), makeSymbol("TARGET-THESAURUS"), makeSymbol("TARGET-CONCEPT"), makeSymbol("START-CONCEPTS"), makeSymbol("CUTOFF-CONCEPTS"), makeSymbol("NUM-LEVELS"), makeSymbol("SKIPPED-FACTS-LOG"));

    static private final SubLString $str_alt23$Copying_Thesaurus_ = makeString("Copying Thesaurus ");

    static private final SubLString $str_alt24$_to_ = makeString(" to ");

    static private final SubLString $str_alt25$Copy_Thesaurus__Details_no_longer = makeString("Copy Thesaurus: Details no longer available.");

    static private final SubLList $list_alt26 = list(makeSymbol("PATHNAME"), makeSymbol("THESAURUS"), makeSymbol("FORMAT"), makeSymbol("REUSE-MODE"), makeSymbol("REUSE-THESAURI"));

    static private final SubLString $str_alt27$Checking_relations_in_load_file_ = makeString("Checking relations in load file ");

    static private final SubLString $str_alt28$_for_thesaurus_ = makeString(" for thesaurus ");

    static private final SubLString $str_alt29$Loading_Thesaurus_ = makeString("Loading Thesaurus ");

    static private final SubLString $str_alt30$_in_format_ = makeString(" in format ");

    static private final SubLString $str_alt31$_from_file_ = makeString(" from file ");



    static private final SubLString $str_alt33$Load_Thesaurus__Details_no_longer = makeString("Load Thesaurus: Details no longer available.");

    static private final SubLList $list_alt34 = list(makeSymbol("PATHNAME"), makeSymbol("THESAURUS"), makeSymbol("FORMAT"));

    static private final SubLString $str_alt35$Update_load_analysis_for_ = makeString("Update load analysis for ");

    static private final SubLString $str_alt36$_with_respect_to_ = makeString(" with respect to ");

    static private final SubLString $str_alt37$_file_ = makeString(" file ");

    static private final SubLString $str_alt38$Update_Load_Analysis__Details_no_ = makeString("Update Load Analysis: Details no longer available.");

    static private final SubLList $list_alt39 = list(makeSymbol("THESAURUS"), makeSymbol("PATHNAME"), makeSymbol("FORMAT"), makeSymbol("START-TERMS"), makeSymbol("CUTOFF-TERMS"), makeSymbol("CUTOFF-LEVEL"), makeSymbol("FILTER"), makeSymbol("CASE"));

    static private final SubLString $str_alt40$Outputting_thesaurus_ = makeString("Outputting thesaurus ");

    static private final SubLString $str_alt41$_to_file_ = makeString(" to file ");

    static private final SubLString $str_alt42$_using_ = makeString(" using ");

    static private final SubLString $str_alt43$_format___ = makeString(" format...");

    static private final SubLString $str_alt44$Output_Thesaurus__Details_no_long = makeString("Output Thesaurus: Details no longer available.");

    static private final SubLList $list_alt45 = list(makeSymbol("PATHNAME"), makeSymbol("THESAURI"));

    static private final SubLString $str_alt46$Backing_up_thesaurus_information_ = makeString("Backing up thesaurus information to file ");

    static private final SubLString $str_alt47$Counting_to__A____ = makeString("Counting to ~A ...");

    private static final SubLSymbol THINKING_TASK_P = makeSymbol("THINKING-TASK-P");

    private static final SubLSymbol $THINKINGS = makeKeyword("THINKINGS");





    static private final SubLString $str_alt52$Starting___ = makeString("Starting...");

    private static final SubLSymbol TM_THINKING_THREAD_RUN = makeSymbol("TM-THINKING-THREAD-RUN");







    static private final SubLSymbol $sym57$THESAURUS_ = makeSymbol("THESAURUS?");

    static private final SubLString $$$administrator = makeString("administrator");

    private static final SubLSymbol TM_THINKING = makeSymbol("TM-THINKING");



    static private final SubLList $list_alt61 = list(list(makeSymbol("USER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-BASIC"), NIL, makeKeyword("PROTECTED")));



















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TM_THINKING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TM-THINKING-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TM_THINKING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TM-THINKING-INSTANCE");

    static private final SubLString $str_alt77$tm_thinking = makeString("tm-thinking");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_BASIC = makeSymbol("TEST-BASIC");

    // // Initializers
    public void declareFunctions() {
        declare_tm_thinking_file();
    }

    public void initializeVariables() {
        init_tm_thinking_file();
    }

    public void runTopLevelForms() {
        setup_tm_thinking_file();
    }
}

