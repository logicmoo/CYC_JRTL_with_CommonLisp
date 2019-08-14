/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      WFF-CONSEQUENCES
 *  source file: /cyc/top/cycl/wff-consequences.lisp
 *  created:     2019/07/03 17:39:07
 */
public final class wff_consequences extends SubLTranslatedFile implements V02 {
    // // Constructor
    private wff_consequences() {
    }

    public static final SubLFile me = new wff_consequences();

    public static final String myName = "com.cyc.cycjava.cycl.wff_consequences";

    // // Definitions
    /**
     *
     *
     * @param CYCL-SENTENCE;
     * 		a CycL sentence to be asserted or unasserted
     * @param ILLOCUTIONARY-FORCE;
     * 		:assert or :unassert
     * @param MT;
     * 		the mt in which CYCL-SENTENCE is to be asserted or unasserted
     * @return one of two things:
    (1) two values, each a list of assertions.  The first, assertions
    that became ill-formed as a result of the assert or unassert.
    The second, assertions that became well-formed as a result
    of the assert or unassert.
    (2) A set (set-p) of assertions to be examined for well-formedness,
    which the user chose not to examine.
     * @unknown In the process of determining the consequences,
    this will assert or unassert CYCL-SENTENCE in MT, without transcripting the operation.
     */
    public static final SubLObject readloop_determine_wff_consequences(SubLObject cycl_sentence, SubLObject illocutionary_force, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_set = determine_wff_consequence_assertion_set(cycl_sentence, illocutionary_force, mt);
                format(T, $str_alt0$_d_assertions_are_relevant___Proc, set.set_size(v_set));
                force_output(UNPROVIDED);
                {
                    SubLObject input = string_utilities.str(read(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    if ($$$y.equalp(input)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject assertions_that_became_ill_formed = determine_wff_consequences_of_set(cycl_sentence, illocutionary_force, mt, v_set);
                            SubLObject assertions_that_became_well_formed = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            format(T, $str_alt2$__The_following_assertions_would_);
                            if (NIL != assertions_that_became_ill_formed) {
                                format_nil.print_one_per_line(assertions_that_became_ill_formed, UNPROVIDED);
                            } else {
                                format(T, $str_alt3$None___);
                            }
                            format(T, $str_alt4$__The_following_assertions_would_);
                            if (NIL != assertions_that_became_well_formed) {
                                format_nil.print_one_per_line(assertions_that_became_well_formed, UNPROVIDED);
                            } else {
                                format(T, $str_alt3$None___);
                            }
                            return values(assertions_that_became_ill_formed, assertions_that_became_well_formed);
                        }
                    } else {
                        format(T, $str_alt5$Aborted___);
                    }
                }
                format(T, $str_alt6$____);
                return v_set;
            }
        }
    }

    /**
     *
     *
     * @param CYCL-SENTENCE;
     * 		a CycL sentence to be asserted or unasserted
     * @param ILLOCUTIONARY-FORCE;
     * 		:assert or :unassert
     * @param MT;
     * 		the mt in which CYCL-SENTENCE is to be asserted or unasserted
     * @param ASSERTION-SET;
     * 		a set (set-p) of assertions to be examined for well-formedness
     * @return 0 listp; a list of assertions that became ill-formed
    as a result of the assert or unassert.
     * @return 1 listp; a list of assertions that became well-formed
    as a result of the assert or unassert.
     * @unknown In the process of determining the consequences,
    this will assert or unassert CYCL-SENTENCE in MT, without transcripting the operation.
     */
    public static final SubLObject determine_wff_consequences_of_set(SubLObject cycl_sentence, SubLObject illocutionary_force, SubLObject mt, SubLObject assertion_set) {
        {
            SubLObject assertions_that_became_ill_formed = NIL;
            SubLObject assertions_that_became_well_formed = NIL;
            SubLObject before_hash = wff_check_assertion_set(assertion_set);
            {
                SubLObject pcase_var = illocutionary_force;
                if (pcase_var.eql($ASSERT)) {
                    cyc_kernel.cyc_assert(cycl_sentence, mt, UNPROVIDED);
                } else
                    if (pcase_var.eql($UNASSERT)) {
                        cyc_kernel.cyc_unassert(cycl_sentence, mt);
                    }

            }
            {
                SubLObject after_hash = wff_check_assertion_set(assertion_set);
                SubLObject changed_assertions = hash_table_utilities.hash_difference(before_hash, after_hash, UNPROVIDED);
                SubLObject cdolist_list_var = changed_assertions;
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    {
                        SubLObject pcase_var = gethash(ass, after_hash, UNPROVIDED);
                        if (pcase_var.eql($ILL_FORMED)) {
                            assertions_that_became_ill_formed = cons(ass, assertions_that_became_ill_formed);
                        } else
                            if (pcase_var.eql($WELL_FORMED)) {
                                assertions_that_became_well_formed = cons(ass, assertions_that_became_well_formed);
                            }

                    }
                }
            }
            return values(assertions_that_became_ill_formed, assertions_that_became_well_formed);
        }
    }

    /**
     *
     *
     * @return hashtable; ass -> boolean, t iff ASS is well-formed
     */
    public static final SubLObject wff_check_assertion_set(SubLObject v_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hash = make_hash_table(set.set_size(v_set), UNPROVIDED, UNPROVIDED);
                SubLObject set_var = v_set;
                utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt11$Wff_checking__a_relevant_assertio, set.set_size(v_set)), thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(set.set_size(set_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject set_contents_var = set.do_set_internal(set_var);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject ass = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, ass)) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (NIL != wff_utilities.assertion_not_wffP(ass)) {
                                            sethash(ass, hash, $ILL_FORMED);
                                        } else {
                                            sethash(ass, hash, $WELL_FORMED);
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return hash;
            }
        }
    }

    /**
     *
     *
     * @param CYCL-SENTENCE;
     * 		a CycL sentence to be asserted or unasserted
     * @param ILLOCUTIONARY-FORCE;
     * 		:assert or :unassert
     * @param MT;
     * 		the mt in which CYCL-SENTENCE is to be asserted or unasserted
     * @return set; a set of assertions that could possibly change their well-formedness
    if CYCL-SENTENCE were asserted or unasserted.
     */
    public static final SubLObject determine_wff_consequence_assertion_set(SubLObject cycl_sentence, SubLObject illocutionary_force, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pcase_var = cycl_utilities.sentence_arg0(cycl_sentence);
                            if (pcase_var.eql($$genls)) {
                                result = determine_wff_consequence_assertion_set_for_genls(cycl_sentence, illocutionary_force);
                            } else
                                if (pcase_var.eql($$genlPreds)) {
                                    result = determine_wff_consequence_assertion_set_for_genlpreds(cycl_sentence, illocutionary_force);
                                } else
                                    if (pcase_var.eql($$genlInverse)) {
                                        result = determine_wff_consequence_assertion_set_for_genlinverse(cycl_sentence, illocutionary_force);
                                    } else
                                        if (pcase_var.eql($$disjointWith)) {
                                            result = determine_wff_consequence_assertion_set_for_disjoint_with(cycl_sentence, illocutionary_force);
                                        } else
                                            if (pcase_var.eql($$argIsa)) {
                                                result = determine_wff_consequence_assertion_set_for_arg_isa(cycl_sentence, illocutionary_force);
                                            } else
                                                if (pcase_var.eql($$argGenl)) {
                                                    result = determine_wff_consequence_assertion_set_for_arg_genl(cycl_sentence, illocutionary_force);
                                                } else {
                                                    result = NIL;
                                                }





                            {
                                SubLObject assertion = czer_meta.find_assertion_cycl(cycl_sentence, mt);
                                if (NIL != assertion) {
                                    set.set_remove(assertion, result);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_genls(SubLObject genls_sentence, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_genls = el_utilities.unmake_binary_formula(genls_sentence);
                SubLObject spec = thread.secondMultipleValue();
                SubLObject genl = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (v_genls != $$genls) {
                        Errors.error($str_alt20$wff_consequence_expected_a_genls_, genls_sentence);
                    }
                }
                return determine_wff_consequence_assertion_set_for_collection_int(spec, illocutionary_force, UNPROVIDED);
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_genlpreds(SubLObject genlpreds_sentence, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject genlpreds = el_utilities.unmake_binary_formula(genlpreds_sentence);
                SubLObject spec_pred = thread.secondMultipleValue();
                SubLObject genl_pred = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (genlpreds != $$genlPreds) {
                        Errors.error($str_alt21$wff_consequence_expected_a_genlPr, genlpreds_sentence);
                    }
                }
                return determine_wff_consequence_assertion_set_for_predicate_int(spec_pred, illocutionary_force);
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_genlinverse(SubLObject genlinverse_sentence, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject genlinverse = el_utilities.unmake_binary_formula(genlinverse_sentence);
                SubLObject spec_pred = thread.secondMultipleValue();
                SubLObject genl_inverse = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (genlinverse != $$genlInverse) {
                        Errors.error($str_alt22$wff_consequence_expected_a_genlIn, genlinverse_sentence);
                    }
                }
                return determine_wff_consequence_assertion_set_for_predicate_int(spec_pred, illocutionary_force);
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_disjoint_with(SubLObject disjoint_with_sentence, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_disjoint_with = el_utilities.unmake_binary_formula(disjoint_with_sentence);
                SubLObject col1 = thread.secondMultipleValue();
                SubLObject col2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (v_disjoint_with != $$disjointWith) {
                        Errors.error($str_alt23$wff_consequence_expected_a_disjoi, disjoint_with_sentence);
                    }
                }
                {
                    SubLObject set1 = determine_wff_consequence_assertion_set_for_collection_int(col1, illocutionary_force, col2);
                    SubLObject set2 = determine_wff_consequence_assertion_set_for_collection_int(col2, illocutionary_force, col1);
                    return set_utilities.set_union(list(set1, set2), UNPROVIDED);
                }
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_arg_isa(SubLObject arg_isa_sentence, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject arg_isa = el_utilities.unmake_ternary_formula(arg_isa_sentence);
                SubLObject reln = thread.secondMultipleValue();
                SubLObject n = thread.thirdMultipleValue();
                SubLObject col = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (arg_isa != $$argIsa) {
                        Errors.error($str_alt24$wff_consequence_expected_a_arg_is, arg_isa_sentence);
                    }
                }
                return determine_wff_consequence_assertion_set_for_relation_int(reln, illocutionary_force);
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_arg_genl(SubLObject arg_genl_sentence, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject arg_genl = el_utilities.unmake_ternary_formula(arg_genl_sentence);
                SubLObject reln = thread.secondMultipleValue();
                SubLObject n = thread.thirdMultipleValue();
                SubLObject col = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (arg_genl != $$argGenl) {
                        Errors.error($str_alt25$wff_consequence_expected_a_arg_ge, arg_genl_sentence);
                    }
                }
                return determine_wff_consequence_assertion_set_for_relation_int(reln, illocutionary_force);
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_collection_int(SubLObject col, SubLObject illocutionary_force, SubLObject disjoint_col) {
        if (disjoint_col == UNPROVIDED) {
            disjoint_col = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_set = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject node_var = col;
                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }


                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        while (NIL != node_var) {
                                                            {
                                                                SubLObject spec = node_var;
                                                                if (!((NIL != disjoint_col) && (NIL != disjoint_with.disjoint_withP(spec, disjoint_col, UNPROVIDED, UNPROVIDED)))) {
                                                                    add_all_referencing_assertions_to_set(spec, v_set);
                                                                    {
                                                                        SubLObject cdolist_list_var = relations_with_col_as_arg_constraint(col);
                                                                        SubLObject reln = NIL;
                                                                        for (reln = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reln = cdolist_list_var.first()) {
                                                                            add_all_referencing_assertions_to_set(reln, v_set);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                SubLObject module_var = NIL;
                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                            {
                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    {
                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        if (NIL != d_link) {
                                                                                            {
                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                if (NIL != mt_links) {
                                                                                                    {
                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                            {
                                                                                                                                SubLObject iteration_state_10 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_10)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_10);
                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_12 = new_list;
                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , node_vars_link_node = cdolist_list_var_12.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_11, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state_10 = dictionary_contents.do_dictionary_contents_next(iteration_state_10);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_10);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_9, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                            }
                                                                                                        } 
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt37$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                            SubLObject cdolist_list_var_13 = new_list;
                                                                                            SubLObject generating_fn = NIL;
                                                                                            for (generating_fn = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , generating_fn = cdolist_list_var_13.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                        {
                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                            SubLObject new_list_15 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject cdolist_list_var_16 = new_list_15;
                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                            for (node_vars_link_node = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , node_vars_link_node = cdolist_list_var_16.first()) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_14, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }

                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_8, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            node_var = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_6, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_5, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt38$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_3, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_set;
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_predicate_int(SubLObject pred, SubLObject illocutionary_force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_set = set.new_set(UNPROVIDED, UNPROVIDED);
                {
                    SubLObject node_var = pred;
                    SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                    SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            {
                                SubLObject tv_var = NIL;
                                {
                                    SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (NIL != tv_var) {
                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    {
                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var.eql($WARN)) {
                                                                    Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                } else {
                                                                    Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                }


                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                    {
                                                        SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                            while (NIL != node_and_predicate_mode) {
                                                                {
                                                                    SubLObject node_var_23 = node_and_predicate_mode.first();
                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                    SubLObject spec_pred = node_var_23;
                                                                    {
                                                                        SubLObject _prev_bind_0_24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_23)) {
                                                                                add_all_referencing_assertions_to_set(spec_pred, v_set);
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_23);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_28)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_28);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_30 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , node_vars_link_node = cdolist_list_var_30.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_29, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_28 = dictionary_contents.do_dictionary_contents_next(iteration_state_28);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_28);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_27, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt37$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_31 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , generating_fn = cdolist_list_var_31.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                            SubLObject new_list_33 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_34 = new_list_33;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , node_vars_link_node = cdolist_list_var_34.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_32, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }

                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_26, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_25, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_24, thread);
                                                                        }
                                                                    }
                                                                }
                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                            } 
                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_22, thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_21, thread);
                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt38$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_19, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject node_var = pred;
                    SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                    SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            {
                                SubLObject tv_var = NIL;
                                {
                                    SubLObject _prev_bind_0_35 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (NIL != tv_var) {
                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    {
                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var.eql($WARN)) {
                                                                    Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                } else {
                                                                    Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                }


                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_36 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_37 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                    {
                                                        SubLObject _prev_bind_0_38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                            while (NIL != node_and_predicate_mode) {
                                                                {
                                                                    SubLObject node_var_41 = node_and_predicate_mode.first();
                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                    SubLObject spec_inverse = node_var_41;
                                                                    {
                                                                        SubLObject _prev_bind_0_42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_41)) {
                                                                                add_all_referencing_assertions_to_set(spec_inverse, v_set);
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_41);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_46)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_46);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_48 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_48.first(); NIL != cdolist_list_var_48; cdolist_list_var_48 = cdolist_list_var_48.rest() , node_vars_link_node = cdolist_list_var_48.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_47, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_46 = dictionary_contents.do_dictionary_contents_next(iteration_state_46);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_46);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_45, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt37$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_49 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , generating_fn = cdolist_list_var_49.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                            SubLObject new_list_51 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_52 = new_list_51;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_52.first(); NIL != cdolist_list_var_52; cdolist_list_var_52 = cdolist_list_var_52.rest() , node_vars_link_node = cdolist_list_var_52.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_50, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }

                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_44, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_43, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_42, thread);
                                                                        }
                                                                    }
                                                                }
                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                            } 
                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_40, thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_39, thread);
                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_38, thread);
                                                        }
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt38$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_37, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_36, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_35, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_set;
            }
        }
    }

    public static final SubLObject determine_wff_consequence_assertion_set_for_relation_int(SubLObject reln, SubLObject illocutionary_force) {
        {
            SubLObject v_set = set.new_set(UNPROVIDED, UNPROVIDED);
            if ((NIL != forts.fort_p(reln)) && (NIL != fort_types_interface.predicateP(reln))) {
                v_set = determine_wff_consequence_assertion_set_for_predicate_int(reln, illocutionary_force);
            } else {
                add_all_referencing_assertions_to_set(reln, v_set);
            }
            return v_set;
        }
    }

    public static final SubLObject relations_with_col_as_arg_constraint(SubLObject col) {
        {
            SubLObject result = NIL;
            result = kb_mapping_utilities.pred_values(col, $$argIsa, THREE_INTEGER, ONE_INTEGER, UNPROVIDED);
            result = nconc(result, kb_mapping_utilities.pred_values(col, $$argGenl, THREE_INTEGER, ONE_INTEGER, UNPROVIDED));
            return result;
        }
    }

    public static final SubLObject add_all_referencing_assertions_to_set(SubLObject v_term, SubLObject v_set) {
        {
            SubLObject cdolist_list_var = kb_accessors.relevant_term_assertions(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                set.set_add(ass, v_set);
            }
        }
        return v_set;
    }

    public static final SubLObject declare_wff_consequences_file() {
        declareFunction("readloop_determine_wff_consequences", "READLOOP-DETERMINE-WFF-CONSEQUENCES", 3, 0, false);
        declareFunction("determine_wff_consequences_of_set", "DETERMINE-WFF-CONSEQUENCES-OF-SET", 4, 0, false);
        declareFunction("wff_check_assertion_set", "WFF-CHECK-ASSERTION-SET", 1, 0, false);
        declareFunction("determine_wff_consequence_assertion_set", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET", 3, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_genls", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-GENLS", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_genlpreds", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-GENLPREDS", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_genlinverse", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-GENLINVERSE", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_disjoint_with", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-DISJOINT-WITH", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_arg_isa", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-ARG-ISA", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_arg_genl", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-ARG-GENL", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_collection_int", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-COLLECTION-INT", 2, 1, false);
        declareFunction("determine_wff_consequence_assertion_set_for_predicate_int", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-PREDICATE-INT", 2, 0, false);
        declareFunction("determine_wff_consequence_assertion_set_for_relation_int", "DETERMINE-WFF-CONSEQUENCE-ASSERTION-SET-FOR-RELATION-INT", 2, 0, false);
        declareFunction("relations_with_col_as_arg_constraint", "RELATIONS-WITH-COL-AS-ARG-CONSTRAINT", 1, 0, false);
        declareFunction("add_all_referencing_assertions_to_set", "ADD-ALL-REFERENCING-ASSERTIONS-TO-SET", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_wff_consequences_file() {
        return NIL;
    }

    public static final SubLObject setup_wff_consequences_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_d_assertions_are_relevant___Proc = makeString("~d assertions are relevant.  Proceed with wff-checking? [y/n] ");

    static private final SubLString $$$y = makeString("y");

    static private final SubLString $str_alt2$__The_following_assertions_would_ = makeString("~%The following assertions would become ill-formed:~%");

    static private final SubLString $str_alt3$None___ = makeString("None.~%");

    static private final SubLString $str_alt4$__The_following_assertions_would_ = makeString("~%The following assertions would become well-formed:~%");

    static private final SubLString $str_alt5$Aborted___ = makeString("Aborted.~%");

    static private final SubLString $str_alt6$____ = makeString("~%~%");







    private static final SubLSymbol $WELL_FORMED = makeKeyword("WELL-FORMED");

    static private final SubLString $str_alt11$Wff_checking__a_relevant_assertio = makeString("Wff-checking ~a relevant assertions");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLObject $$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLObject $$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));

    public static final SubLObject $$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));

    static private final SubLString $str_alt20$wff_consequence_expected_a_genls_ = makeString("wff consequence expected a genls sentence but got ~a");

    static private final SubLString $str_alt21$wff_consequence_expected_a_genlPr = makeString("wff consequence expected a genlPreds sentence but got ~a");

    static private final SubLString $str_alt22$wff_consequence_expected_a_genlIn = makeString("wff consequence expected a genlInverse sentence but got ~a");

    static private final SubLString $str_alt23$wff_consequence_expected_a_disjoi = makeString("wff consequence expected a disjointWith sentence but got ~a");

    static private final SubLString $str_alt24$wff_consequence_expected_a_arg_is = makeString("wff consequence expected a arg-isa sentence but got ~a");

    static private final SubLString $str_alt25$wff_consequence_expected_a_arg_ge = makeString("wff consequence expected a arg-genl sentence but got ~a");











    static private final SubLString $str_alt31$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt36$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt37$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt38$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    // // Initializers
    public void declareFunctions() {
        declare_wff_consequences_file();
    }

    public void initializeVariables() {
        init_wff_consequences_file();
    }

    public void runTopLevelForms() {
        setup_wff_consequences_file();
    }
}

