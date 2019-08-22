/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
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
 * module:      MWP-RULE
 * source file: /cyc/top/cycl/mwp-rule.lisp
 * created:     2019/07/03 17:38:23
 */
public final class mwp_rule extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mwp_rule();

 public static final String myName = "com.cyc.cycjava.cycl.mwp_rule";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("DENOT"), makeSymbol("PRED"), makeSymbol("WU"));

    static private final SubLList $list2 = list(makeSymbol("SPEC-TYPE"), makeSymbol("TARGET"));

    private static final SubLSymbol $BASE_WORD_DENOT = makeKeyword("BASE-WORD-DENOT");

    public static final SubLSymbol $mwp_rule_constraint_table_deriv$ = makeSymbol("*MWP-RULE-CONSTRAINT-TABLE-DERIV*");

    public static final SubLSymbol $mwp_rule_constraint_table_infl$ = makeSymbol("*MWP-RULE-CONSTRAINT-TABLE-INFL*");



    static private final SubLString $str13$Getting_rule_constraints___ = makeString("Getting rule constraints...");





    private static final SubLSymbol MWP_BASE_POSES_FOR_REIFIED_AFFIX = makeSymbol("MWP-BASE-POSES-FOR-REIFIED-AFFIX");

    static private final SubLSymbol $sym19$_POS = makeSymbol("?POS");



    static private final SubLList $list21 = list(makeSymbol("?POS"));

    public static final SubLSymbol $mwp_base_poses_for_reified_affix_caching_state$ = makeSymbol("*MWP-BASE-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*");

    private static final SubLList $list23 = list(makeSymbol("RULE"), makeSymbol("CONSTRAINTS"));

    private static final SubLSymbol $mwp_rule_spec_table_deriv$ = makeSymbol("*MWP-RULE-SPEC-TABLE-DERIV*");

    private static final SubLSymbol $mwp_rule_spec_table_infl$ = makeSymbol("*MWP-RULE-SPEC-TABLE-INFL*");

    private static final SubLString $str26$Getting_rule_result_specs___ = makeString("Getting rule result specs...");

    private static final SubLSymbol MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX = makeSymbol("MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX");

    private static final SubLSymbol $sym28$_SEMX = makeSymbol("?SEMX");



    private static final SubLList $list30 = list(makeSymbol("?SEMX"));

    private static final SubLSymbol $mwp_sem_templates_for_reified_affix_caching_state$ = makeSymbol("*MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-CACHING-STATE*");

    private static final SubLSymbol MWP_RESULT_POSES_FOR_REIFIED_AFFIX = makeSymbol("MWP-RESULT-POSES-FOR-REIFIED-AFFIX");



    private static final SubLSymbol $mwp_result_poses_for_reified_affix_caching_state$ = makeSymbol("*MWP-RESULT-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*");

    private static final SubLList $list35 = list(makeSymbol("RULE"), makeSymbol("SPECS"));

    // Definitions
    public static final SubLObject mwp_rule_p_alt(SubLObject obj) {
        return constant_p(obj);
    }

    // Definitions
    public static SubLObject mwp_rule_p(final SubLObject obj) {
        return constant_p(obj);
    }

    public static final SubLObject mwp_rule_from_constant_alt(SubLObject constant) {
        return constant;
    }

    public static SubLObject mwp_rule_from_constant(final SubLObject constant) {
        return constant;
    }

    public static final SubLObject mwp_rule_constraints_alt(SubLObject rule, SubLObject type) {
        return dictionary.dictionary_lookup(com.cyc.cycjava.cycl.mwp_rule.mwp_rule_constraint_table(type), rule, UNPROVIDED);
    }

    public static SubLObject mwp_rule_constraints(final SubLObject rule, final SubLObject type) {
        return dictionary.dictionary_lookup(mwp_rule_constraint_table(type), rule, UNPROVIDED);
    }

    public static final SubLObject mwp_rule_result_specs_alt(SubLObject rule, SubLObject type) {
        return dictionary.dictionary_lookup(com.cyc.cycjava.cycl.mwp_rule.mwp_rule_spec_table(type), rule, UNPROVIDED);
    }

    public static SubLObject mwp_rule_result_specs(final SubLObject rule, final SubLObject type) {
        return dictionary.dictionary_lookup(mwp_rule_spec_table(type), rule, UNPROVIDED);
    }

    public static final SubLObject mwp_rule_constraint_table_init_alt() {
        {
            SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.mwp_rule.do_mwp_rule_constraint_table_init(type);
            }
        }
        return NIL;
    }

    public static SubLObject mwp_rule_constraint_table_init() {
        SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            do_mwp_rule_constraint_table_init(type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject mwp_rule_spec_table_init_alt() {
        {
            SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
            SubLObject type = NIL;
            for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.mwp_rule.do_mwp_rule_spec_table_init(type);
            }
        }
        return NIL;
    }

    public static SubLObject mwp_rule_spec_table_init() {
        SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            do_mwp_rule_spec_table_init(type);
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param DPW
     * 		listp; (<DENOT> <PRED> <WORD-UNIT>) from a base.
     * @param RULE;
     * 		an affix rule.
     * @param TYPE;
     * 		:INFL or :DERIV
     * @return :NON-WFF or LISTP (<DENOT> <PRED> <WORD-UNIT>), from applying RULE to DPW.
     */
    @LispMethod(comment = "@param DPW\r\n\t\tlistp; (<DENOT> <PRED> <WORD-UNIT>) from a base.\r\n@param RULE;\r\n\t\tan affix rule.\r\n@param TYPE;\r\n\t\t:INFL or :DERIV\r\n@return :NON-WFF or LISTP (<DENOT> <PRED> <WORD-UNIT>), from applying RULE to DPW.")
    public static final SubLObject mwp_rule_apply_alt(SubLObject dpw, SubLObject rule, SubLObject type, SubLObject affix_type) {
        {
            SubLObject datum = dpw;
            SubLObject current = datum;
            SubLObject denot = NIL;
            SubLObject pred = NIL;
            SubLObject wu = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            denot = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            wu = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_denot = NIL;
                    SubLObject new_pred = NIL;
                    SubLObject new_wu = (type == $DERIV) ? ((SubLObject) (lexicon_utilities.construct_word_unit(wu, rule, affix_type))) : wu;
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_result_specs(rule, type);
                    SubLObject spec = NIL;
                    for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                        {
                            SubLObject datum_1 = spec;
                            SubLObject current_2 = datum_1;
                            SubLObject spec_type = NIL;
                            SubLObject target = NIL;
                            destructuring_bind_must_consp(current_2, datum_1, $list_alt2);
                            spec_type = current_2.first();
                            current_2 = current_2.rest();
                            destructuring_bind_must_consp(current_2, datum_1, $list_alt2);
                            target = current_2.first();
                            current_2 = current_2.rest();
                            if (NIL == current_2) {
                                {
                                    SubLObject pcase_var = spec_type;
                                    if (pcase_var.eql($PRED)) {
                                        new_pred = target;
                                    } else {
                                        if (pcase_var.eql($SEMX)) {
                                            if (NIL != com.cyc.cycjava.cycl.mwp_rule.mwp_wf_base_word_denotP(denot, target)) {
                                                new_denot = subst(denot, $BASE_WORD_DENOT, target, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                return $NON_WFF;
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum_1, $list_alt2);
                            }
                        }
                    }
                    if (NIL == new_pred) {
                        new_pred = pred;
                    }
                    if (NIL == new_denot) {
                        new_denot = (type == $DERIV) ? ((SubLObject) (list($APPLY_AFFIX, rule, denot))) : denot;
                        com.cyc.cycjava.cycl.mwp_rule.log_mwp_missing_affix_semx(rule, wu, operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED));
                    }
                    return list(new_denot, new_pred, new_wu);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param DPW
     * 		listp; (<DENOT> <PRED> <WORD-UNIT>) from a base.
     * @param RULE;
     * 		an affix rule.
     * @param TYPE;
     * 		:INFL or :DERIV
     * @return :NON-WFF or LISTP (<DENOT> <PRED> <WORD-UNIT>), from applying RULE to DPW.
     */
    @LispMethod(comment = "@param DPW\r\n\t\tlistp; (<DENOT> <PRED> <WORD-UNIT>) from a base.\r\n@param RULE;\r\n\t\tan affix rule.\r\n@param TYPE;\r\n\t\t:INFL or :DERIV\r\n@return :NON-WFF or LISTP (<DENOT> <PRED> <WORD-UNIT>), from applying RULE to DPW.")
    public static SubLObject mwp_rule_apply(final SubLObject dpw, final SubLObject rule, final SubLObject type, final SubLObject affix_type) {
        SubLObject denot = NIL;
        SubLObject pred = NIL;
        SubLObject wu = NIL;
        destructuring_bind_must_consp(dpw, dpw, $list0);
        denot = dpw.first();
        SubLObject current = dpw.rest();
        destructuring_bind_must_consp(current, dpw, $list0);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, dpw, $list0);
        wu = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject new_denot = NIL;
            SubLObject new_pred = NIL;
            final SubLObject new_wu = (type == $DERIV) ? lexicon_utilities.construct_word_unit(wu, rule, affix_type) : wu;
            SubLObject cdolist_list_var = mwp_rule_result_specs(rule, type);
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = spec;
                SubLObject spec_type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current_$2, datum_$1, $list2);
                spec_type = current_$2.first();
                current_$2 = current_$2.rest();
                destructuring_bind_must_consp(current_$2, datum_$1, $list2);
                target = current_$2.first();
                current_$2 = current_$2.rest();
                if (NIL == current_$2) {
                    final SubLObject pcase_var = spec_type;
                    if (pcase_var.eql($PRED)) {
                        new_pred = target;
                    } else
                        if (pcase_var.eql($SEMX)) {
                            if (NIL == mwp_wf_base_word_denotP(denot, target)) {
                                return $NON_WFF;
                            }
                            new_denot = subst(denot, $BASE_WORD_DENOT, target, UNPROVIDED, UNPROVIDED);
                        }

                } else {
                    cdestructuring_bind_error(datum_$1, $list2);
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            } 
            if (NIL == new_pred) {
                new_pred = pred;
            }
            if (NIL == new_denot) {
                new_denot = (type == $DERIV) ? list($APPLY_AFFIX, rule, denot) : denot;
                log_mwp_missing_affix_semx(rule, wu, operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED));
            }
            return list(new_denot, new_pred, new_wu);
        }
        cdestructuring_bind_error(dpw, $list0);
        return NIL;
    }

    public static final SubLObject mwp_wf_base_word_denotP_alt(SubLObject denot, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = list(bq_cons($BASE_WORD_DENOT, denot));
                return makeBoolean(((!lexicon_vars.$mwp_wff_filter_level$.getDynamicValue(thread).isPositive()) || (NIL != rbp_wff.rbp_wf_template_argsP(target, v_bindings, ONE_INTEGER))) && ((!lexicon_vars.$mwp_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(target, v_bindings, TWO_INTEGER))));
            }
        }
    }

    public static SubLObject mwp_wf_base_word_denotP(final SubLObject denot, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_bindings = list(bq_cons($BASE_WORD_DENOT, denot));
        return makeBoolean(((!lexicon_vars.$mwp_wff_filter_level$.getDynamicValue(thread).isPositive()) || (NIL != rbp_wff.rbp_wf_template_argsP(target, v_bindings, ONE_INTEGER))) && ((!lexicon_vars.$mwp_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(target, v_bindings, TWO_INTEGER))));
    }

    /**
     * Keep a record of what affixes with missing semantics people have tried to get parses for, so that we know
     * which ones we should focus on adding semantics for.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Keep a record of what affixes with missing semantics people have tried to get parses for, so that we know\r\nwhich ones we should focus on adding semantics for.\r\n\r\n@unknown bgottesm\nKeep a record of what affixes with missing semantics people have tried to get parses for, so that we know\nwhich ones we should focus on adding semantics for.")
    public static final SubLObject log_mwp_missing_affix_semx_alt(SubLObject affix, SubLObject base_wu, SubLObject cyclist, SubLObject universal_date) {
        return NIL;
    }

    /**
     * Keep a record of what affixes with missing semantics people have tried to get parses for, so that we know
     * which ones we should focus on adding semantics for.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Keep a record of what affixes with missing semantics people have tried to get parses for, so that we know\r\nwhich ones we should focus on adding semantics for.\r\n\r\n@unknown bgottesm\nKeep a record of what affixes with missing semantics people have tried to get parses for, so that we know\nwhich ones we should focus on adding semantics for.")
    public static SubLObject log_mwp_missing_affix_semx(final SubLObject affix, final SubLObject base_wu, final SubLObject cyclist, final SubLObject universal_date) {
        return NIL;
    }

    public static final SubLObject mwp_rule_constraint_table_alt(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($DERIV)) {
                return $mwp_rule_constraint_table_deriv$.getGlobalValue();
            } else {
                if (pcase_var.eql($INFL)) {
                    return $mwp_rule_constraint_table_infl$.getGlobalValue();
                }
            }
        }
        return NIL;
    }

    public static SubLObject mwp_rule_constraint_table(final SubLObject type) {
        if (type.eql($DERIV)) {
            return $mwp_rule_constraint_table_deriv$.getGlobalValue();
        }
        if (type.eql($INFL)) {
            return $mwp_rule_constraint_table_infl$.getGlobalValue();
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP ((<rule> ((<constraint-type> <value))))
     */
    @LispMethod(comment = "@return LISTP ((<rule> ((<constraint-type> <value))))")
    public static final SubLObject mwp_gather_rule_constraints_from_kb_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($DERIV)) {
                    {
                        SubLObject constraints = NIL;
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject reified_affixes = isa.all_fort_instances($$DerivationalAffix, UNPROVIDED, UNPROVIDED);
                                    SubLObject total = length(reified_affixes);
                                    SubLObject so_far = ZERO_INTEGER;
                                    {
                                        SubLObject _prev_bind_0_3 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_4 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_5 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($str_alt13$Getting_rule_constraints___);
                                            {
                                                SubLObject cdolist_list_var = reified_affixes;
                                                SubLObject reified_affix = NIL;
                                                for (reified_affix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reified_affix = cdolist_list_var.first()) {
                                                    if (NIL == isa.isaP(reified_affix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                                        constraints = cons(com.cyc.cycjava.cycl.mwp_rule.mwp_gather_rule_constraints_from_kb_for_derivational_affix(reified_affix), constraints);
                                                    }
                                                    so_far = add(so_far, ONE_INTEGER);
                                                    note_percent_progress(so_far, total);
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2_5, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_4, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return constraints;
                    }
                } else {
                    if (pcase_var.eql($INFL)) {
                        {
                            SubLObject constraints = NIL;
                            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject pred_var = $$regularSuffix;
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
                                                                        SubLObject done_var_6 = NIL;
                                                                        SubLObject token_var_7 = NIL;
                                                                        while (NIL == done_var_6) {
                                                                            {
                                                                                SubLObject rule_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                                                SubLObject valid_8 = makeBoolean(token_var_7 != rule_as);
                                                                                if (NIL != valid_8) {
                                                                                    {
                                                                                        SubLObject rule = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_from_constant(assertions_high.gaf_arg1(rule_as));
                                                                                        SubLObject base_form = assertions_high.gaf_arg2(rule_as);
                                                                                        constraints = cons(list(rule, list(list($PRED, base_form))), constraints);
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
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return constraints;
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
     * @return LISTP ((<rule> ((<constraint-type> <value))))
     */
    @LispMethod(comment = "@return LISTP ((<rule> ((<constraint-type> <value))))")
    public static SubLObject mwp_gather_rule_constraints_from_kb(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (type.eql($DERIV)) {
            SubLObject constraints = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject reified_affixes = isa.all_fort_instances($$DerivationalAffix, UNPROVIDED, UNPROVIDED);
                final SubLObject total = length(reified_affixes);
                SubLObject so_far = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$3 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$5 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($str13$Getting_rule_constraints___);
                        SubLObject cdolist_list_var = reified_affixes;
                        SubLObject reified_affix = NIL;
                        reified_affix = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == isa.isaP(reified_affix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                constraints = cons(mwp_gather_rule_constraints_from_kb_for_derivational_affix(reified_affix), constraints);
                            }
                            so_far = add(so_far, ONE_INTEGER);
                            note_percent_progress(so_far, total);
                            cdolist_list_var = cdolist_list_var.rest();
                            reified_affix = cdolist_list_var.first();
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
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2_$5, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return constraints;
        }
        if (type.eql($INFL)) {
            SubLObject constraints = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = $$regularSuffix;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$6 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $silent_progressP$.currentBinding(thread);
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
                                    SubLObject done_var_$10 = NIL;
                                    final SubLObject token_var_$11 = NIL;
                                    while (NIL == done_var_$10) {
                                        final SubLObject rule_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                        final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(rule_as));
                                        if (NIL != valid_$12) {
                                            final SubLObject rule = mwp_rule_from_constant(assertions_high.gaf_arg1(rule_as));
                                            final SubLObject base_form = assertions_high.gaf_arg2(rule_as);
                                            constraints = cons(list(rule, list(list($PRED, base_form))), constraints);
                                        }
                                        done_var_$10 = makeBoolean(NIL == valid_$12);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_9, thread);
                        $is_noting_progressP$.rebind(_prev_bind_8, thread);
                        $progress_count$.rebind(_prev_bind_7, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
                        $progress_notification_count$.rebind(_prev_bind_5, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$6, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$5, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return constraints;
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP; (<rule> ((<constraint-type> <value)))
     */
    @LispMethod(comment = "@return LISTP; (<rule> ((<constraint-type> <value)))")
    public static final SubLObject mwp_gather_rule_constraints_from_kb_for_derivational_affix_alt(SubLObject reified_affix) {
        {
            SubLObject rule = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_from_constant(reified_affix);
            SubLObject base_poses = com.cyc.cycjava.cycl.mwp_rule.mwp_base_poses_for_reified_affix(reified_affix, UNPROVIDED);
            SubLObject pos_constraints = NIL;
            SubLObject cdolist_list_var = base_poses;
            SubLObject base_pos = NIL;
            for (base_pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , base_pos = cdolist_list_var.first()) {
                pos_constraints = cons(list($POS, base_pos), pos_constraints);
            }
            return list(rule, pos_constraints);
        }
    }

    /**
     *
     *
     * @return LISTP; (<rule> ((<constraint-type> <value)))
     */
    @LispMethod(comment = "@return LISTP; (<rule> ((<constraint-type> <value)))")
    public static SubLObject mwp_gather_rule_constraints_from_kb_for_derivational_affix(final SubLObject reified_affix) {
        final SubLObject rule = mwp_rule_from_constant(reified_affix);
        final SubLObject base_poses = mwp_base_poses_for_reified_affix(reified_affix, UNPROVIDED);
        SubLObject pos_constraints = NIL;
        SubLObject cdolist_list_var = base_poses;
        SubLObject base_pos = NIL;
        base_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pos_constraints = cons(list($POS, base_pos), pos_constraints);
            cdolist_list_var = cdolist_list_var.rest();
            base_pos = cdolist_list_var.first();
        } 
        return list(rule, pos_constraints);
    }

    public static final SubLObject clear_mwp_base_poses_for_reified_affix_alt() {
        {
            SubLObject cs = $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_mwp_base_poses_for_reified_affix() {
        final SubLObject cs = $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_mwp_base_poses_for_reified_affix_alt(SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue(), list(reified_affix, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_mwp_base_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue(), list(reified_affix, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_base_poses_for_reified_affix_internal_alt(SubLObject reified_affix, SubLObject mt) {
        return ask_utilities.ask_variable($sym19$_POS, listS($$derivationalAffixBasePOS, reified_affix, $list_alt21), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mwp_base_poses_for_reified_affix_internal(final SubLObject reified_affix, final SubLObject mt) {
        return ask_utilities.ask_variable($sym19$_POS, listS($$derivationalAffixBasePOS, reified_affix, $list21), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_base_poses_for_reified_affix_alt(SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MWP_BASE_POSES_FOR_REIFIED_AFFIX, $mwp_base_poses_for_reified_affix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(reified_affix, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (reified_affix.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.mwp_rule.mwp_base_poses_for_reified_affix_internal(reified_affix, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(reified_affix, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject mwp_base_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MWP_BASE_POSES_FOR_REIFIED_AFFIX, $mwp_base_poses_for_reified_affix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(reified_affix, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (reified_affix.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(mwp_base_poses_for_reified_affix_internal(reified_affix, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(reified_affix, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject do_mwp_rule_constraint_table_init_alt(SubLObject type) {
        {
            SubLObject dict = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_constraint_table(type);
            dictionary.clear_dictionary(dict);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.mwp_rule.mwp_gather_rule_constraints_from_kb(type);
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject rule = NIL;
                        SubLObject constraints = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt24);
                        rule = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt24);
                        constraints = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != constraints) {
                                dictionary_utilities.dictionary_append(dict, rule, constraints);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt24);
                        }
                    }
                }
            }
            return dict;
        }
    }

    public static SubLObject do_mwp_rule_constraint_table_init(final SubLObject type) {
        final SubLObject dict = mwp_rule_constraint_table(type);
        dictionary.clear_dictionary(dict);
        SubLObject cdolist_list_var = mwp_gather_rule_constraints_from_kb(type);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject rule = NIL;
            SubLObject constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list23);
            constraints = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != constraints) {
                    dictionary_utilities.dictionary_append(dict, rule, constraints);
                }
            } else {
                cdestructuring_bind_error(datum, $list23);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return dict;
    }

    public static final SubLObject mwp_rule_spec_table_alt(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($DERIV)) {
                return $mwp_rule_spec_table_deriv$.getGlobalValue();
            } else {
                if (pcase_var.eql($INFL)) {
                    return $mwp_rule_spec_table_infl$.getGlobalValue();
                }
            }
        }
        return NIL;
    }

    public static SubLObject mwp_rule_spec_table(final SubLObject type) {
        if (type.eql($DERIV)) {
            return $mwp_rule_spec_table_deriv$.getGlobalValue();
        }
        if (type.eql($INFL)) {
            return $mwp_rule_spec_table_infl$.getGlobalValue();
        }
        return NIL;
    }

    public static final SubLObject mwp_gather_rule_result_specs_from_kb_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject specs = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($DERIV)) {
                                {
                                    SubLObject reified_affixes = isa.all_fort_instances($$DerivationalAffix, UNPROVIDED, UNPROVIDED);
                                    SubLObject total = length(reified_affixes);
                                    SubLObject so_far = ZERO_INTEGER;
                                    {
                                        SubLObject _prev_bind_0_10 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_11 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_12 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($str_alt27$Getting_rule_result_specs___);
                                            {
                                                SubLObject cdolist_list_var = reified_affixes;
                                                SubLObject reified_affix = NIL;
                                                for (reified_affix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reified_affix = cdolist_list_var.first()) {
                                                    if (NIL == isa.isaP(reified_affix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                                        specs = cons(com.cyc.cycjava.cycl.mwp_rule.mwp_rule_specs_for_derivational_affix(reified_affix), specs);
                                                    }
                                                    so_far = add(so_far, ONE_INTEGER);
                                                    note_percent_progress(so_far, total);
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2_12, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_11, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($INFL)) {
                                    {
                                        SubLObject pred_var = $$regularSuffix;
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
                                                                        SubLObject done_var_13 = NIL;
                                                                        SubLObject token_var_14 = NIL;
                                                                        while (NIL == done_var_13) {
                                                                            {
                                                                                SubLObject rule_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                                SubLObject valid_15 = makeBoolean(token_var_14 != rule_as);
                                                                                if (NIL != valid_15) {
                                                                                    {
                                                                                        SubLObject rule = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_from_constant(assertions_high.gaf_arg1(rule_as));
                                                                                        SubLObject derived_form = assertions_high.gaf_arg1(rule_as);
                                                                                        specs = cons(list(rule, list(list($PRED, derived_form))), specs);
                                                                                    }
                                                                                }
                                                                                done_var_13 = makeBoolean(NIL == valid_15);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
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
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return specs;
            }
        }
    }

    public static SubLObject mwp_gather_rule_result_specs_from_kb(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject specs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (type.eql($DERIV)) {
                final SubLObject reified_affixes = isa.all_fort_instances($$DerivationalAffix, UNPROVIDED, UNPROVIDED);
                final SubLObject total = length(reified_affixes);
                SubLObject so_far = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$14 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$15 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$16 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($str26$Getting_rule_result_specs___);
                        SubLObject cdolist_list_var = reified_affixes;
                        SubLObject reified_affix = NIL;
                        reified_affix = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == isa.isaP(reified_affix, $$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED)) {
                                specs = cons(mwp_rule_specs_for_derivational_affix(reified_affix), specs);
                            }
                            so_far = add(so_far, ONE_INTEGER);
                            note_percent_progress(so_far, total);
                            cdolist_list_var = cdolist_list_var.rest();
                            reified_affix = cdolist_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_2_$16, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$15, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$14, thread);
                }
            } else
                if (type.eql($INFL)) {
                    final SubLObject pred_var = $$regularSuffix;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$16 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$16 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$17 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $silent_progressP$.currentBinding(thread);
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
                                        SubLObject done_var_$21 = NIL;
                                        final SubLObject token_var_$22 = NIL;
                                        while (NIL == done_var_$21) {
                                            final SubLObject rule_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                            final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(rule_as));
                                            if (NIL != valid_$23) {
                                                final SubLObject rule = mwp_rule_from_constant(assertions_high.gaf_arg1(rule_as));
                                                final SubLObject derived_form = assertions_high.gaf_arg1(rule_as);
                                                specs = cons(list(rule, list(list($PRED, derived_form))), specs);
                                            }
                                            done_var_$21 = makeBoolean(NIL == valid_$23);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_9, thread);
                            $is_noting_progressP$.rebind(_prev_bind_8, thread);
                            $progress_count$.rebind(_prev_bind_7, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
                            $progress_notification_count$.rebind(_prev_bind_5, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$17, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$16, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return specs;
    }

    /**
     *
     *
     * @return LISTP; (<rule> (<constraint-type> <value)*)
     */
    @LispMethod(comment = "@return LISTP; (<rule> (<constraint-type> <value)*)")
    public static final SubLObject mwp_rule_specs_for_derivational_affix_alt(SubLObject reified_affix) {
        {
            SubLObject rule = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_from_constant(reified_affix);
            SubLObject sem_templates = com.cyc.cycjava.cycl.mwp_rule.mwp_sem_templates_for_reified_affix(reified_affix, UNPROVIDED);
            SubLObject result_pred = com.cyc.cycjava.cycl.mwp_rule.mwp_result_pred_for_reified_affix(reified_affix);
            SubLObject rule_specs = NIL;
            SubLObject cdolist_list_var = sem_templates;
            SubLObject sem_template = NIL;
            for (sem_template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sem_template = cdolist_list_var.first()) {
                rule_specs = cons(list($SEMX, sem_template), rule_specs);
            }
            if (NIL != result_pred) {
                rule_specs = cons(list($PRED, result_pred), rule_specs);
            }
            return list(rule, rule_specs);
        }
    }

    /**
     *
     *
     * @return LISTP; (<rule> (<constraint-type> <value)*)
     */
    @LispMethod(comment = "@return LISTP; (<rule> (<constraint-type> <value)*)")
    public static SubLObject mwp_rule_specs_for_derivational_affix(final SubLObject reified_affix) {
        final SubLObject rule = mwp_rule_from_constant(reified_affix);
        final SubLObject sem_templates = mwp_sem_templates_for_reified_affix(reified_affix, UNPROVIDED);
        final SubLObject result_pred = mwp_result_pred_for_reified_affix(reified_affix);
        SubLObject rule_specs = NIL;
        SubLObject cdolist_list_var = sem_templates;
        SubLObject sem_template = NIL;
        sem_template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rule_specs = cons(list($SEMX, sem_template), rule_specs);
            cdolist_list_var = cdolist_list_var.rest();
            sem_template = cdolist_list_var.first();
        } 
        if (NIL != result_pred) {
            rule_specs = cons(list($PRED, result_pred), rule_specs);
        }
        return list(rule, rule_specs);
    }

    public static final SubLObject clear_mwp_sem_templates_for_reified_affix_alt() {
        {
            SubLObject cs = $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_mwp_sem_templates_for_reified_affix() {
        final SubLObject cs = $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_mwp_sem_templates_for_reified_affix_alt(SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue(), list(reified_affix, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_mwp_sem_templates_for_reified_affix(final SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue(), list(reified_affix, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_sem_templates_for_reified_affix_internal_alt(SubLObject reified_affix, SubLObject mt) {
        return ask_utilities.ask_variable($sym29$_SEMX, listS($$affixSemantics, reified_affix, $list_alt31), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mwp_sem_templates_for_reified_affix_internal(final SubLObject reified_affix, final SubLObject mt) {
        return ask_utilities.ask_variable($sym28$_SEMX, listS($$affixSemantics, reified_affix, $list30), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_sem_templates_for_reified_affix_alt(SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX, $mwp_sem_templates_for_reified_affix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(reified_affix, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (reified_affix.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.mwp_rule.mwp_sem_templates_for_reified_affix_internal(reified_affix, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(reified_affix, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject mwp_sem_templates_for_reified_affix(final SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX, $mwp_sem_templates_for_reified_affix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(reified_affix, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (reified_affix.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(mwp_sem_templates_for_reified_affix_internal(reified_affix, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(reified_affix, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject mwp_result_pred_for_reified_affix_alt(SubLObject reified_affix) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.mwp_rule.mwp_result_poses_for_reified_affix(reified_affix, UNPROVIDED);
            SubLObject pos = NIL;
            for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                {
                    SubLObject pred = morph_word.mwp_base_pred_of_pos(pos, UNPROVIDED);
                    if (NIL != pred) {
                        return pred;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject mwp_result_pred_for_reified_affix(final SubLObject reified_affix) {
        SubLObject cdolist_list_var = mwp_result_poses_for_reified_affix(reified_affix, UNPROVIDED);
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = morph_word.mwp_base_pred_of_pos(pos, UNPROVIDED);
            if (NIL != pred) {
                return pred;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject clear_mwp_result_poses_for_reified_affix_alt() {
        {
            SubLObject cs = $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_mwp_result_poses_for_reified_affix() {
        final SubLObject cs = $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_mwp_result_poses_for_reified_affix_alt(SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue(), list(reified_affix, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_mwp_result_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue(), list(reified_affix, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_result_poses_for_reified_affix_internal_alt(SubLObject reified_affix, SubLObject mt) {
        return ask_utilities.ask_variable($sym19$_POS, listS($$derivationalAffixResultPOS, reified_affix, $list_alt21), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mwp_result_poses_for_reified_affix_internal(final SubLObject reified_affix, final SubLObject mt) {
        return ask_utilities.ask_variable($sym19$_POS, listS($$derivationalAffixResultPOS, reified_affix, $list21), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_result_poses_for_reified_affix_alt(SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MWP_RESULT_POSES_FOR_REIFIED_AFFIX, $mwp_result_poses_for_reified_affix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(reified_affix, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw23$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (reified_affix.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.mwp_rule.mwp_result_poses_for_reified_affix_internal(reified_affix, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(reified_affix, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject mwp_result_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MWP_RESULT_POSES_FOR_REIFIED_AFFIX, $mwp_result_poses_for_reified_affix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(reified_affix, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (reified_affix.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(mwp_result_poses_for_reified_affix_internal(reified_affix, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(reified_affix, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject do_mwp_rule_spec_table_init_alt(SubLObject type) {
        {
            SubLObject dict = com.cyc.cycjava.cycl.mwp_rule.mwp_rule_spec_table(type);
            dictionary.clear_dictionary(dict);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.mwp_rule.mwp_gather_rule_result_specs_from_kb(type);
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject rule = NIL;
                        SubLObject specs = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt36);
                        rule = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt36);
                        specs = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != specs) {
                                dictionary_utilities.dictionary_append(dict, rule, specs);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt36);
                        }
                    }
                }
            }
            return dict;
        }
    }

    public static SubLObject do_mwp_rule_spec_table_init(final SubLObject type) {
        final SubLObject dict = mwp_rule_spec_table(type);
        dictionary.clear_dictionary(dict);
        SubLObject cdolist_list_var = mwp_gather_rule_result_specs_from_kb(type);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject rule = NIL;
            SubLObject specs = NIL;
            destructuring_bind_must_consp(current, datum, $list35);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list35);
            specs = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != specs) {
                    dictionary_utilities.dictionary_append(dict, rule, specs);
                }
            } else {
                cdestructuring_bind_error(datum, $list35);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return dict;
    }

    public static SubLObject declare_mwp_rule_file() {
        declareFunction("mwp_rule_p", "MWP-RULE-P", 1, 0, false);
        declareFunction("mwp_rule_from_constant", "MWP-RULE-FROM-CONSTANT", 1, 0, false);
        declareFunction("mwp_rule_constraints", "MWP-RULE-CONSTRAINTS", 2, 0, false);
        declareFunction("mwp_rule_result_specs", "MWP-RULE-RESULT-SPECS", 2, 0, false);
        declareFunction("mwp_rule_constraint_table_init", "MWP-RULE-CONSTRAINT-TABLE-INIT", 0, 0, false);
        declareFunction("mwp_rule_spec_table_init", "MWP-RULE-SPEC-TABLE-INIT", 0, 0, false);
        declareFunction("mwp_rule_apply", "MWP-RULE-APPLY", 4, 0, false);
        declareFunction("mwp_wf_base_word_denotP", "MWP-WF-BASE-WORD-DENOT?", 2, 0, false);
        declareFunction("log_mwp_missing_affix_semx", "LOG-MWP-MISSING-AFFIX-SEMX", 4, 0, false);
        declareFunction("mwp_rule_constraint_table", "MWP-RULE-CONSTRAINT-TABLE", 1, 0, false);
        declareFunction("mwp_gather_rule_constraints_from_kb", "MWP-GATHER-RULE-CONSTRAINTS-FROM-KB", 1, 0, false);
        declareFunction("mwp_gather_rule_constraints_from_kb_for_derivational_affix", "MWP-GATHER-RULE-CONSTRAINTS-FROM-KB-FOR-DERIVATIONAL-AFFIX", 1, 0, false);
        declareFunction("clear_mwp_base_poses_for_reified_affix", "CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX", 0, 0, false);
        declareFunction("remove_mwp_base_poses_for_reified_affix", "REMOVE-MWP-BASE-POSES-FOR-REIFIED-AFFIX", 1, 1, false);
        declareFunction("mwp_base_poses_for_reified_affix_internal", "MWP-BASE-POSES-FOR-REIFIED-AFFIX-INTERNAL", 2, 0, false);
        declareFunction("mwp_base_poses_for_reified_affix", "MWP-BASE-POSES-FOR-REIFIED-AFFIX", 1, 1, false);
        declareFunction("do_mwp_rule_constraint_table_init", "DO-MWP-RULE-CONSTRAINT-TABLE-INIT", 1, 0, false);
        declareFunction("mwp_rule_spec_table", "MWP-RULE-SPEC-TABLE", 1, 0, false);
        declareFunction("mwp_gather_rule_result_specs_from_kb", "MWP-GATHER-RULE-RESULT-SPECS-FROM-KB", 1, 0, false);
        declareFunction("mwp_rule_specs_for_derivational_affix", "MWP-RULE-SPECS-FOR-DERIVATIONAL-AFFIX", 1, 0, false);
        declareFunction("clear_mwp_sem_templates_for_reified_affix", "CLEAR-MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX", 0, 0, false);
        declareFunction("remove_mwp_sem_templates_for_reified_affix", "REMOVE-MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX", 1, 1, false);
        declareFunction("mwp_sem_templates_for_reified_affix_internal", "MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-INTERNAL", 2, 0, false);
        declareFunction("mwp_sem_templates_for_reified_affix", "MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX", 1, 1, false);
        declareFunction("mwp_result_pred_for_reified_affix", "MWP-RESULT-PRED-FOR-REIFIED-AFFIX", 1, 0, false);
        declareFunction("clear_mwp_result_poses_for_reified_affix", "CLEAR-MWP-RESULT-POSES-FOR-REIFIED-AFFIX", 0, 0, false);
        declareFunction("remove_mwp_result_poses_for_reified_affix", "REMOVE-MWP-RESULT-POSES-FOR-REIFIED-AFFIX", 1, 1, false);
        declareFunction("mwp_result_poses_for_reified_affix_internal", "MWP-RESULT-POSES-FOR-REIFIED-AFFIX-INTERNAL", 2, 0, false);
        declareFunction("mwp_result_poses_for_reified_affix", "MWP-RESULT-POSES-FOR-REIFIED-AFFIX", 1, 1, false);
        declareFunction("do_mwp_rule_spec_table_init", "DO-MWP-RULE-SPEC-TABLE-INIT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_mwp_rule_file_alt() {
        deflexical("*MWP-RULE-CONSTRAINT-TABLE-DERIV*", NIL != boundp($mwp_rule_constraint_table_deriv$) ? ((SubLObject) ($mwp_rule_constraint_table_deriv$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
        deflexical("*MWP-RULE-CONSTRAINT-TABLE-INFL*", NIL != boundp($mwp_rule_constraint_table_infl$) ? ((SubLObject) ($mwp_rule_constraint_table_infl$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
        deflexical("*MWP-BASE-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        deflexical("*MWP-RULE-SPEC-TABLE-DERIV*", NIL != boundp($mwp_rule_spec_table_deriv$) ? ((SubLObject) ($mwp_rule_spec_table_deriv$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
        deflexical("*MWP-RULE-SPEC-TABLE-INFL*", NIL != boundp($mwp_rule_spec_table_infl$) ? ((SubLObject) ($mwp_rule_spec_table_infl$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
        deflexical("*MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        deflexical("*MWP-RESULT-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_mwp_rule_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*MWP-RULE-CONSTRAINT-TABLE-DERIV*", SubLTrampolineFile.maybeDefault($mwp_rule_constraint_table_deriv$, $mwp_rule_constraint_table_deriv$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
            deflexical("*MWP-RULE-CONSTRAINT-TABLE-INFL*", SubLTrampolineFile.maybeDefault($mwp_rule_constraint_table_infl$, $mwp_rule_constraint_table_infl$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
            deflexical("*MWP-BASE-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
            deflexical("*MWP-RULE-SPEC-TABLE-DERIV*", SubLTrampolineFile.maybeDefault($mwp_rule_spec_table_deriv$, $mwp_rule_spec_table_deriv$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
            deflexical("*MWP-RULE-SPEC-TABLE-INFL*", SubLTrampolineFile.maybeDefault($mwp_rule_spec_table_infl$, $mwp_rule_spec_table_infl$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
            deflexical("*MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
            deflexical("*MWP-RESULT-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MWP-RULE-CONSTRAINT-TABLE-DERIV*", NIL != boundp($mwp_rule_constraint_table_deriv$) ? ((SubLObject) ($mwp_rule_constraint_table_deriv$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
            deflexical("*MWP-RULE-CONSTRAINT-TABLE-INFL*", NIL != boundp($mwp_rule_constraint_table_infl$) ? ((SubLObject) ($mwp_rule_constraint_table_infl$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
            deflexical("*MWP-RULE-SPEC-TABLE-DERIV*", NIL != boundp($mwp_rule_spec_table_deriv$) ? ((SubLObject) ($mwp_rule_spec_table_deriv$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
            deflexical("*MWP-RULE-SPEC-TABLE-INFL*", NIL != boundp($mwp_rule_spec_table_infl$) ? ((SubLObject) ($mwp_rule_spec_table_infl$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), $int$256));
        }
        return NIL;
    }

    public static SubLObject init_mwp_rule_file_Previous() {
        deflexical("*MWP-RULE-CONSTRAINT-TABLE-DERIV*", SubLTrampolineFile.maybeDefault($mwp_rule_constraint_table_deriv$, $mwp_rule_constraint_table_deriv$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
        deflexical("*MWP-RULE-CONSTRAINT-TABLE-INFL*", SubLTrampolineFile.maybeDefault($mwp_rule_constraint_table_infl$, $mwp_rule_constraint_table_infl$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
        deflexical("*MWP-BASE-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        deflexical("*MWP-RULE-SPEC-TABLE-DERIV*", SubLTrampolineFile.maybeDefault($mwp_rule_spec_table_deriv$, $mwp_rule_spec_table_deriv$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
        deflexical("*MWP-RULE-SPEC-TABLE-INFL*", SubLTrampolineFile.maybeDefault($mwp_rule_spec_table_infl$, $mwp_rule_spec_table_infl$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
        deflexical("*MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        deflexical("*MWP-RESULT-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_mwp_rule_file() {
        declare_defglobal($mwp_rule_constraint_table_deriv$);
        declare_defglobal($mwp_rule_constraint_table_infl$);
        memoization_state.note_globally_cached_function(MWP_BASE_POSES_FOR_REIFIED_AFFIX);
        declare_defglobal($mwp_rule_spec_table_deriv$);
        declare_defglobal($mwp_rule_spec_table_infl$);
        memoization_state.note_globally_cached_function(MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX);
        memoization_state.note_globally_cached_function(MWP_RESULT_POSES_FOR_REIFIED_AFFIX);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mwp_rule_file();
    }

    @Override
    public void initializeVariables() {
        init_mwp_rule_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mwp_rule_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("DENOT"), makeSymbol("PRED"), makeSymbol("WU"));

    static private final SubLList $list_alt2 = list(makeSymbol("SPEC-TYPE"), makeSymbol("TARGET"));

    static private final SubLString $str_alt13$Getting_rule_constraints___ = makeString("Getting rule constraints...");

    static private final SubLList $list_alt21 = list(makeSymbol("?POS"));

    public static final SubLSymbol $kw23$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt24 = list(makeSymbol("RULE"), makeSymbol("CONSTRAINTS"));

    static private final SubLString $str_alt27$Getting_rule_result_specs___ = makeString("Getting rule result specs...");

    static private final SubLSymbol $sym29$_SEMX = makeSymbol("?SEMX");

    static private final SubLList $list_alt31 = list(makeSymbol("?SEMX"));

    static private final SubLList $list_alt36 = list(makeSymbol("RULE"), makeSymbol("SPECS"));
}

/**
 * Total time: 299 ms
 */
