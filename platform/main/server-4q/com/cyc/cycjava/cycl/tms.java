/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.arguments.argument_tv;
import static com.cyc.cycjava.cycl.arguments.hl_support_p;
import static com.cyc.cycjava.cycl.arguments.remove_argument;
import static com.cyc.cycjava.cycl.arguments.support_mt;
import static com.cyc.cycjava.cycl.arguments.valid_argument;
import static com.cyc.cycjava.cycl.assertions_interface.kb_set_assertion_direction;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.control_vars.$check_for_circular_justs$;
import static com.cyc.cycjava.cycl.control_vars.$forward_inference_removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.control_vars.$prefer_forward_skolemization$;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_args;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_operator;
import static com.cyc.cycjava.cycl.deduction_handles.deduction_p;
import static com.cyc.cycjava.cycl.deduction_handles.valid_deductionP;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_arity;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.enumeration_types.tv_truth;
import static com.cyc.cycjava.cycl.genl_mts.genl_mtP;
import static com.cyc.cycjava.cycl.hl_supports.$perform_opaque_support_verification$;
import static com.cyc.cycjava.cycl.hl_supports.hl_predicate_p;
import static com.cyc.cycjava.cycl.hl_supports.hl_verify;
import static com.cyc.cycjava.cycl.hlmt.hlmt_equal;
import static com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.inference.inference_trampolines.inference_backchain_forbiddenP;
import static com.cyc.cycjava.cycl.list_utilities.fast_set_difference;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula;
import static com.cyc.cycjava.cycl.utilities_macros.$current_forward_problem_store$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_variable_initialization;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.argumentation;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TMS
 * source file: /cyc/top/cycl/tms.lisp
 * created:     2019/07/03 17:37:37
 */
public final class tms extends SubLTranslatedFile implements V12 {
    /**
     * Remove ASSERTION from the KB.
     */
    @LispMethod(comment = "Remove ASSERTION from the KB.")
    public static final SubLObject tms_remove_assertion_int_2(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        kb_indexing.remove_term_indices(assertion);
        forward.remqueue_forward_assertion(assertion);
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            inference_analysis.clear_transformation_rule_statistics(assertion);
        }
        wff_utilities.non_wff_remove(assertion);
        if (NIL == function_terms.tou_assertionP(assertion)) {
            return assertions_high.remove_assertion(assertion);
        }
        return NIL;
    }

    public static final SubLObject believed_circular_deduction(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rest = NIL;
                for (rest = deductions_high.deduction_supports(deduction); !((NIL != ans) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject support = rest.first();
                        if (NIL != assertion_handles.assertion_p(support)) {
                            if (NIL == subl_promotions.memberP(support, $circular_local_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                ans = T;
                            }
                        }
                    }
                }
                return makeBoolean(NIL == ans);
            }
        }
    }

    public static final SubLFile me = new tms();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $tms_debugP$ = makeSymbol("*TMS-DEBUG?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $tms_forts_to_kill$ = makeSymbol("*TMS-FORTS-TO-KILL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $tms_remove_assertion_lowP$ = makeSymbol("*TMS-REMOVE-ASSERTION-LOW?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $recursive_tms_bugP$ = makeSymbol("*RECURSIVE-TMS-BUG?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_backchain_forbidden_deduction_stale_wrt_exceptionsP_general_versionP$ = makeSymbol("*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$ = makeSymbol("*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS-HACK?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $circular_deductions$ = makeSymbol("*CIRCULAR-DEDUCTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $circular_assertions$ = makeSymbol("*CIRCULAR-ASSERTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $circular_local_assertions$ = makeSymbol("*CIRCULAR-LOCAL-ASSERTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $circular_target_assertion$ = makeSymbol("*CIRCULAR-TARGET-ASSERTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $circular_complexity_count$ = makeSymbol("*CIRCULAR-COMPLEXITY-COUNT*");

    // defparameter
    /**
     * The maximum number of assertions we'll consider while checking for circularly
     * supported assertions. NIL means no limit
     */
    @LispMethod(comment = "The maximum number of assertions we\'ll consider while checking for circularly\r\nsupported assertions. NIL means no limit\ndefparameter\nThe maximum number of assertions we\'ll consider while checking for circularly\nsupported assertions. NIL means no limit")
    public static final SubLSymbol $circular_complexity_count_limit$ = makeSymbol("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*");

    static private final SubLList $list1 = list(list(makeSymbol("ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $tms_assertions_being_removed$ = makeSymbol("*TMS-ASSERTIONS-BEING-REMOVED*");

    private static final SubLSymbol ADJOIN = makeSymbol("ADJOIN");

    static private final SubLList $list5 = list(makeSymbol("*TMS-ASSERTIONS-BEING-REMOVED*"));

    static private final SubLList $list7 = list(list(makeSymbol("DEDUCTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $tms_deductions_being_removed$ = makeSymbol("*TMS-DEDUCTIONS-BEING-REMOVED*");

    static private final SubLList $list9 = list(makeSymbol("*TMS-DEDUCTIONS-BEING-REMOVED*"));

    private static final SubLSymbol TMS_NOTE_DEDUCTION_BEING_REMOVED = makeSymbol("TMS-NOTE-DEDUCTION-BEING-REMOVED");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLList $list15 = list(makeSymbol("TMS-CAN-KILL-FORTS-FOR-ME?"));

    private static final SubLList $list16 = list(list(makeSymbol("*TMS-FORTS-TO-KILL*"), NIL));

    private static final SubLList $list17 = list(list(makeSymbol("TMS-KILL-QUEUED-FORTS")));

    private static final SubLList $list18 = list(list(makeSymbol("*TMS-FORTS-TO-KILL*"), makeKeyword("UNINITIALIZED")));

    private static final SubLSymbol TV_P = makeSymbol("TV-P");

    private static final SubLString $str27$do_broad_mt_index = makeString("do-broad-mt-index");

    private static final SubLSymbol $except_propagation_rule$ = makeSymbol("*EXCEPT-PROPAGATION-RULE*");

    private static final SubLSymbol $sym31$_EXCEPT_PROPAGATION_RULE__INITIALIZER = makeSymbol("*EXCEPT-PROPAGATION-RULE*-INITIALIZER");

    private static final SubLList $list32 = list(reader_make_constant_shell("implies"), list(new SubLObject[]{ reader_make_constant_shell("and"), list(reader_make_constant_shell("assertionSentence"), makeSymbol("?GENL-GAF"), makeSymbol("?SENTENCE")), list(reader_make_constant_shell("assertionSentence"), makeSymbol("?SPEC-GAF"), makeSymbol("?SENTENCE")), list(reader_make_constant_shell("different"), makeSymbol("?SPEC-GAF"), makeSymbol("?GENL-GAF")), list(reader_make_constant_shell("assertionTruth"), makeSymbol("?GENL-GAF"), makeSymbol("?GENL-TRUTH")), list(reader_make_constant_shell("assertionTruth"), makeSymbol("?SPEC-GAF"), makeSymbol("?SPEC-TRUTH")), list(reader_make_constant_shell("different"), makeSymbol("?SPEC-TRUTH"), makeSymbol("?GENL-TRUTH")), list(reader_make_constant_shell("assertionMt"), makeSymbol("?GENL-GAF"), makeSymbol("?GENL-MT")), list(reader_make_constant_shell("assertionMt"), makeSymbol("?SPEC-GAF"), makeSymbol("?SPEC-MT")), list(reader_make_constant_shell("genlMt"), makeSymbol("?SPEC-MT"), makeSymbol("?GENL-MT")) }), list(reader_make_constant_shell("ist"), makeSymbol("?SPEC-MT"), list(reader_make_constant_shell("except"), makeSymbol("?GENL-GAF"))));





    private static final SubLString $str41$_S_was_not_an_atomic_CNF_ = makeString("~S was not an atomic CNF.");



    private static final SubLList $list43 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));



    private static final SubLSymbol $sym45$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLSymbol $sym46$RULE_HAS_EXCEPTIONS_ = makeSymbol("RULE-HAS-EXCEPTIONS?");

    private static final SubLSymbol $sym47$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_ = makeSymbol("RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?");

    private static final SubLSymbol $sym48$LIFTING_RULE_ = makeSymbol("LIFTING-RULE?");

    private static final SubLSymbol $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN?");

    private static final SubLSymbol $sym50$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym51$_PRED = makeSymbol("?PRED");







    private static final SubLSymbol UNBOUND_PREDICATE_RULE_P = makeSymbol("UNBOUND-PREDICATE-RULE-P");

    private static final SubLSymbol $kw57$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $kw67$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw68$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw69$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLString $str70$_tms_deduction_stale_wrt_exceptio = makeString("(tms-deduction-stale-wrt-exceptions?-general-version (find-deduction-by-id ~A)) not yet implemented to deductions not supporting assertions");

    private static final SubLString $str71$_tms_deduction_stale_wrt_exceptio = makeString("(tms-deduction-stale-wrt-exceptions?-general-version (find-deduction-by-id ~A)) could not find GAF assertion to repropagate against rule (supported-object=~S)");

    private static final SubLString $str73$Found_deduction__A_supporting_wit = makeString("Found deduction ~A supporting with bindings but no rule?!  Aborting tms wrt exceptions.");

    private static final SubLString $str74$Performing_full_TMS_on_mt__S = makeString("Performing full TMS on mt ~S");

    private static final SubLSymbol TMS_RECONSIDER_ASSERTION = makeSymbol("TMS-RECONSIDER-ASSERTION");



    private static final SubLString $$$Reconsidering_assertion_arguments = makeString("Reconsidering assertion arguments");

    private static final SubLString $$$Computing_doomed_dependents = makeString("Computing doomed dependents");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $sym83$_ = makeSymbol(">");

    private static final SubLString $$$Precaching_indices = makeString("Precaching indices");

    private static final SubLSymbol TERM_INDEX = makeSymbol("TERM-INDEX");

    private static final SubLString $$$Removing_assertions = makeString("Removing assertions");

    private static final SubLInteger $int$250 = makeInteger(250);

    private static final SubLString $str89$Removing_circularly_supported_ass = makeString("Removing circularly supported assertions");

    private static final SubLString $str90$_____S_circularly_supported_asser = makeString("~%~%~S circularly supported assertions removed");

    private static final SubLString $str91$__Removing__S = makeString("~%Removing ~S");

    public static SubLObject tms_any_assertion_being_removedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($tms_assertions_being_removed$.getDynamicValue(thread));
    }

    /**
     * Return T iff ASSERTION is in the midst of being removed via TMS
     */
    @LispMethod(comment = "Return T iff ASSERTION is in the midst of being removed via TMS")
    public static final SubLObject tms_assertion_being_removedP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            return subl_promotions.memberP(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Return T iff ASSERTION is in the midst of being removed via TMS
     */
    @LispMethod(comment = "Return T iff ASSERTION is in the midst of being removed via TMS")
    public static SubLObject tms_assertion_being_removedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return list_utilities.member_kbeqP(assertion, $tms_assertions_being_removed$.getDynamicValue(thread));
    }

    public static final SubLObject tms_note_assertion_being_removed_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    assertion = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($tms_assertions_being_removed$, listS(ADJOIN, assertion, $list_alt5))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject tms_note_assertion_being_removed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        assertion = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($tms_assertions_being_removed$, listS(ADJOIN, assertion, $list5))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    /**
     * Return T iff DEDUCTION is in the midst of being removed via TMS
     */
    @LispMethod(comment = "Return T iff DEDUCTION is in the midst of being removed via TMS")
    public static final SubLObject tms_deduction_being_removedP_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
            return subl_promotions.memberP(deduction, $tms_deductions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Return T iff DEDUCTION is in the midst of being removed via TMS
     */
    @LispMethod(comment = "Return T iff DEDUCTION is in the midst of being removed via TMS")
    public static SubLObject tms_deduction_being_removedP(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        return list_utilities.member_kbeqP(deduction, $tms_deductions_being_removed$.getDynamicValue(thread));
    }

    public static final SubLObject tms_note_deduction_being_removed_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject deduction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    deduction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($tms_deductions_being_removed$, listS(ADJOIN, deduction, $list_alt9))), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject tms_note_deduction_being_removed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        deduction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($tms_deductions_being_removed$, listS(ADJOIN, deduction, $list9))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    /**
     * Return T iff ARGUMENT is known to be in the midst of being removed via TMS
     */
    @LispMethod(comment = "Return T iff ARGUMENT is known to be in the midst of being removed via TMS")
    public static final SubLObject tms_argument_being_removedP_alt(SubLObject argument) {
        return makeBoolean((NIL != deduction_p(argument)) && (NIL != com.cyc.cycjava.cycl.tms.tms_deduction_being_removedP(argument)));
    }

    /**
     * Return T iff ARGUMENT is known to be in the midst of being removed via TMS
     */
    @LispMethod(comment = "Return T iff ARGUMENT is known to be in the midst of being removed via TMS")
    public static SubLObject tms_argument_being_removedP(final SubLObject argument) {
        return makeBoolean((NIL != deduction_handles.deduction_p(argument)) && (NIL != tms_deduction_being_removedP(argument)));
    }

    public static final SubLObject tms_note_argument_being_removed_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject deduction = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    deduction = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, list(DEDUCTION_P, deduction), listS(TMS_NOTE_DEDUCTION_BEING_REMOVED, list(deduction), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject tms_note_argument_being_removed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        deduction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, list(DEDUCTION_P, deduction), listS(TMS_NOTE_DEDUCTION_BEING_REMOVED, list(deduction), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject tms_can_kill_forts_for_meP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.initialized_p($tms_forts_to_kill$.getDynamicValue(thread));
    }

    public static SubLObject tms_please_kill_this_term_for_me(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tms_can_kill_forts_for_meP()) {
            if (NIL == member(fort, $tms_forts_to_kill$.getDynamicValue(thread), symbol_function(KBEQ), symbol_function(IDENTITY))) {
                $tms_forts_to_kill$.setDynamicValue(cons(fort, $tms_forts_to_kill$.getDynamicValue(thread)), thread);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject tms_killing_forts_later(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PIF, $list15, bq_cons(PROGN, append(body, NIL)), listS(CLET, $list16, append(body, $list17)));
    }

    public static SubLObject tms_without_forts_to_kill_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list18, append(body, NIL));
    }

    public static SubLObject tms_forts_to_kill() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($tms_forts_to_kill$.getDynamicValue(thread));
    }

    public static SubLObject tms_fort_to_killP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != misc_utilities.initialized_p($tms_forts_to_kill$.getDynamicValue(thread))) && (NIL != list_utilities.member_kbeqP(fort, $tms_forts_to_kill$.getDynamicValue(thread))));
    }

    public static SubLObject tms_kill_queued_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject forts_to_kill = tms_forts_to_kill();
        final SubLObject _prev_bind_0 = $tms_forts_to_kill$.currentBinding(thread);
        try {
            $tms_forts_to_kill$.bind($UNINITIALIZED, thread);
            SubLObject cdolist_list_var = forts_to_kill;
            SubLObject fort = NIL;
            fort = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cyc_kernel.cyc_kill(fort)) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            } 
        } finally {
            $tms_forts_to_kill$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    /**
     * Unless an asserted argument with TV already exists on ASSERTION,
     * remove any existing asserted argument for ASSERTION,
     * and add a new asserted argument with TV.
     */
    @LispMethod(comment = "Unless an asserted argument with TV already exists on ASSERTION,\r\nremove any existing asserted argument for ASSERTION,\r\nand add a new asserted argument with TV.\nUnless an asserted argument with TV already exists on ASSERTION,\nremove any existing asserted argument for ASSERTION,\nand add a new asserted argument with TV.")
    public static final SubLObject tms_possibly_replace_asserted_argument_with_tv_alt(SubLObject assertion, SubLObject tv) {
        {
            SubLObject new_asserted_argument = hl_modifiers.possibly_replace_assertion_asserted_argument_with_tv(assertion, tv);
            if (NIL != new_asserted_argument) {
                return com.cyc.cycjava.cycl.tms.tms_postprocess_new_argument(assertion, new_asserted_argument);
            }
        }
        return NIL;
    }

    /**
     * Unless an asserted argument with TV already exists on ASSERTION,
     * remove any existing asserted argument for ASSERTION,
     * and add a new asserted argument with TV.
     */
    @LispMethod(comment = "Unless an asserted argument with TV already exists on ASSERTION,\r\nremove any existing asserted argument for ASSERTION,\r\nand add a new asserted argument with TV.\nUnless an asserted argument with TV already exists on ASSERTION,\nremove any existing asserted argument for ASSERTION,\nand add a new asserted argument with TV.")
    public static SubLObject tms_possibly_replace_asserted_argument_with_tv(final SubLObject assertion, final SubLObject tv) {
        final SubLObject new_asserted_argument = assertions_interface.possibly_replace_assertion_asserted_argument_with_tv(assertion, tv);
        if (NIL != new_asserted_argument) {
            return tms_postprocess_new_argument(assertion, new_asserted_argument, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Assumes that ASSERTION does not have any asserted arguments.
     * Creates a new asserted argument for ASSERTION with TV.
     */
    @LispMethod(comment = "Assumes that ASSERTION does not have any asserted arguments.\r\nCreates a new asserted argument for ASSERTION with TV.\nAssumes that ASSERTION does not have any asserted arguments.\nCreates a new asserted argument for ASSERTION with TV.")
    public static final SubLObject tms_create_asserted_argument_with_tv(SubLObject assertion, SubLObject tv) {
        {
            SubLObject new_asserted_argument = hl_modifiers.kb_create_asserted_argument_with_tv(assertion, tv);
            if (NIL != new_asserted_argument) {
                return com.cyc.cycjava.cycl.tms.tms_postprocess_new_argument(assertion, new_asserted_argument);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject tms_create_asserted_argument_with_tv(final SubLObject assertion, final SubLObject tv, SubLObject pre_existing_assertionP) {
        if (pre_existing_assertionP == UNPROVIDED) {
            pre_existing_assertionP = T;
        }
        final SubLObject new_asserted_argument = (NIL != pre_existing_assertionP) ? assertions_interface.kb_create_asserted_argument_with_tv(assertion, tv) : arguments.create_asserted_argument(assertion, tv);
        if (NIL != new_asserted_argument) {
            final SubLObject result = tms_postprocess_new_argument(assertion, new_asserted_argument, pre_existing_assertionP);
            hl_transcript_tracing.note_hlt_assert(assertion);
            return result;
        }
        return NIL;
    }

    public static final SubLObject tms_add_new_deduction(SubLObject assertion, SubLObject supports, SubLObject tv) {
        {
            SubLObject deduction = deductions_high.create_deduction_with_tv(assertion, supports, tv);
            com.cyc.cycjava.cycl.tms.tms_postprocess_new_argument(assertion, deduction);
            return deduction;
        }
    }

    public static SubLObject tms_add_new_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject tv, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLObject deduction = deductions_high.create_deduction_with_tv(assertion, supports, tv, v_bindings, pragmatic_support_mts);
        tms_postprocess_new_argument(assertion, deduction, UNPROVIDED);
        return deduction;
    }

    /**
     * Now that ARGUMENT for ASSERTION has been added to the KB,
     * perform necessary truth maintenance.  ARGUMENT is assumed to be a new argument,
     * not a redundant already-existing one.
     */
    @LispMethod(comment = "Now that ARGUMENT for ASSERTION has been added to the KB,\r\nperform necessary truth maintenance.  ARGUMENT is assumed to be a new argument,\r\nnot a redundant already-existing one.\nNow that ARGUMENT for ASSERTION has been added to the KB,\nperform necessary truth maintenance.  ARGUMENT is assumed to be a new argument,\nnot a redundant already-existing one.")
    public static final SubLObject tms_postprocess_new_argument(SubLObject assertion, SubLObject argument) {
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        {
            SubLObject successfulP = NIL;
            try {
                com.cyc.cycjava.cycl.tms.tms_recompute_assertion_tv(assertion);
                after_adding.handle_after_addings(argument, assertion);
                successfulP = T;
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL == successfulP) {
                            com.cyc.cycjava.cycl.tms.tms_remove_argument(argument, assertion);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return argument;
    }

    public static SubLObject tms_postprocess_new_argument(final SubLObject assertion, final SubLObject argument, SubLObject pre_existing_assertionP) {
        if (pre_existing_assertionP == UNPROVIDED) {
            pre_existing_assertionP = T;
        }
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        SubLObject successfulP = NIL;
        try {
            tms_recompute_assertion_tv(assertion, pre_existing_assertionP, UNPROVIDED);
            after_adding.handle_after_addings(argument, assertion);
            successfulP = T;
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL == successfulP) {
                    tms_remove_argument(argument, assertion, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return argument;
    }

    /**
     * Remove ARGUMENT for ASSERTION from the KB and perform necessary truth maintenance.
     * Return T if the supported assertion was removed, or it was invalid, else NIL.
     */
    @LispMethod(comment = "Remove ARGUMENT for ASSERTION from the KB and perform necessary truth maintenance.\r\nReturn T if the supported assertion was removed, or it was invalid, else NIL.\nRemove ARGUMENT for ASSERTION from the KB and perform necessary truth maintenance.\nReturn T if the supported assertion was removed, or it was invalid, else NIL.")
    public static final SubLObject tms_remove_argument(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(argument, ARGUMENT_P);
            if ((NIL != valid_argument(argument, UNPROVIDED)) && (NIL == com.cyc.cycjava.cycl.tms.tms_argument_being_removedP(argument))) {
                {
                    SubLObject assertion_removedP = NIL;
                    if (NIL != deduction_p(argument)) {
                        {
                            SubLObject _prev_bind_0 = $tms_deductions_being_removed$.currentBinding(thread);
                            try {
                                $tms_deductions_being_removed$.bind(adjoin(argument, $tms_deductions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                remove_argument(argument, assertion);
                                if (NIL != assertion_handles.assertion_p(assertion)) {
                                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                        assertion_removedP = com.cyc.cycjava.cycl.tms.tms_propagate_removed_argument(argument, assertion);
                                    } else {
                                        assertion_removedP = T;
                                    }
                                } else {
                                    if (NIL != hl_support_p(assertion)) {
                                        {
                                            SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support(assertion);
                                            if (NIL != kb_hl_support) {
                                                assertion_removedP = kb_hl_supports.tms_possibly_rejustify_kb_hl_support(kb_hl_support);
                                            } else {
                                                assertion_removedP = T;
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $tms_deductions_being_removed$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        remove_argument(argument, assertion);
                        if (NIL != assertion_handles.assertion_p(assertion)) {
                            if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                assertion_removedP = com.cyc.cycjava.cycl.tms.tms_propagate_removed_argument(argument, assertion);
                            } else {
                                assertion_removedP = T;
                            }
                        } else {
                            if (NIL != hl_support_p(assertion)) {
                                {
                                    SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support(assertion);
                                    if (NIL != kb_hl_support) {
                                        assertion_removedP = kb_hl_supports.tms_possibly_rejustify_kb_hl_support(kb_hl_support);
                                    } else {
                                        assertion_removedP = T;
                                    }
                                }
                            }
                        }
                    }
                    return assertion_removedP;
                }
            }
            return NIL;
        }
    }

    public static SubLObject tms_remove_argument(final SubLObject argument, final SubLObject support, SubLObject removing_the_last_asserted_argumentP) {
        if (removing_the_last_asserted_argumentP == UNPROVIDED) {
            removing_the_last_asserted_argumentP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        if ((NIL != arguments.valid_argument(argument, UNPROVIDED)) && (NIL == tms_argument_being_removedP(argument))) {
            SubLObject support_removedP = NIL;
            if (NIL != deduction_handles.deduction_p(argument)) {
                final SubLObject _prev_bind_0 = $tms_deductions_being_removed$.currentBinding(thread);
                try {
                    $tms_deductions_being_removed$.bind(adjoin(argument, $tms_deductions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                    if (((NIL == removing_the_last_asserted_argumentP) || (NIL == assertion_handles.assertion_p(support))) || (NIL == arguments.asserted_argument_p(argument))) {
                        arguments.remove_argument(argument, support);
                    }
                    if (NIL != assertion_handles.assertion_p(support)) {
                        if (NIL != assertion_handles.valid_assertionP(support, UNPROVIDED)) {
                            support_removedP = tms_propagate_removed_argument(argument, support, removing_the_last_asserted_argumentP);
                        } else {
                            support_removedP = T;
                        }
                    } else
                        if (NIL != arguments.hl_support_p(support)) {
                            final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(support);
                            if (NIL != kb_hl_support) {
                                support_removedP = kb_hl_supports_high.tms_possibly_rejustify_kb_hl_support(kb_hl_support);
                            } else {
                                support_removedP = T;
                            }
                        }

                } finally {
                    $tms_deductions_being_removed$.rebind(_prev_bind_0, thread);
                }
            } else {
                if (((NIL == removing_the_last_asserted_argumentP) || (NIL == assertion_handles.assertion_p(support))) || (NIL == arguments.asserted_argument_p(argument))) {
                    arguments.remove_argument(argument, support);
                }
                if (NIL != assertion_handles.assertion_p(support)) {
                    if (NIL != assertion_handles.valid_assertionP(support, UNPROVIDED)) {
                        support_removedP = tms_propagate_removed_argument(argument, support, removing_the_last_asserted_argumentP);
                    } else {
                        support_removedP = T;
                    }
                } else
                    if (NIL != arguments.hl_support_p(support)) {
                        final SubLObject kb_hl_support2 = kb_hl_supports_high.find_kb_hl_support(support);
                        if (NIL != kb_hl_support2) {
                            support_removedP = kb_hl_supports_high.tms_possibly_rejustify_kb_hl_support(kb_hl_support2);
                        } else {
                            support_removedP = T;
                        }
                    }

            }
            return support_removedP;
        }
        return NIL;
    }

    public static final SubLObject tms_propagate_removed_argument(SubLObject argument, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_removedP = NIL;
                if (NIL != kb_hl_supports.enqueueing_kb_hl_supports_for_tmsP()) {
                    assertion_removedP = com.cyc.cycjava.cycl.tms.tms_recompute_assertion_tv(assertion);
                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                        try {
                            if (NIL != assertion_removedP) {
                                {
                                    SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
                                    try {
                                        $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                        after_adding.handle_after_removings(argument, assertion);
                                    } finally {
                                        $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } else {
                                after_adding.handle_after_removings(argument, assertion);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != assertion_removedP) {
                                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                            if (NIL != com.cyc.cycjava.cycl.tms.tms_assertion_being_removedP(assertion)) {
                                                com.cyc.cycjava.cycl.tms.tms_remove_assertion_int_2(assertion);
                                            } else {
                                                com.cyc.cycjava.cycl.tms.tms_remove_assertion_int(assertion);
                                            }
                                        }
                                    } else {
                                        if ((NIL != $check_for_circular_justs$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.tms.some_belief_justification(assertion, UNPROVIDED))) {
                                            com.cyc.cycjava.cycl.tms.tms_remove_assertion(assertion);
                                            assertion_removedP = T;
                                        }
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = kb_hl_supports.$tms_kb_hl_support_queue$.currentBinding(thread);
                        try {
                            kb_hl_supports.$tms_kb_hl_support_queue$.bind(queues.create_queue(), thread);
                            assertion_removedP = com.cyc.cycjava.cycl.tms.tms_recompute_assertion_tv(assertion);
                            if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                try {
                                    if (NIL != assertion_removedP) {
                                        {
                                            SubLObject _prev_bind_0_1 = $tms_assertions_being_removed$.currentBinding(thread);
                                            try {
                                                $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                                after_adding.handle_after_removings(argument, assertion);
                                            } finally {
                                                $tms_assertions_being_removed$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    } else {
                                        after_adding.handle_after_removings(argument, assertion);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL != assertion_removedP) {
                                                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                                    if (NIL != com.cyc.cycjava.cycl.tms.tms_assertion_being_removedP(assertion)) {
                                                        com.cyc.cycjava.cycl.tms.tms_remove_assertion_int_2(assertion);
                                                    } else {
                                                        com.cyc.cycjava.cycl.tms.tms_remove_assertion_int(assertion);
                                                    }
                                                }
                                            } else {
                                                if ((NIL != $check_for_circular_justs$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.tms.some_belief_justification(assertion, UNPROVIDED))) {
                                                    com.cyc.cycjava.cycl.tms.tms_remove_assertion(assertion);
                                                    assertion_removedP = T;
                                                }
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                }
                            }
                            kb_hl_supports.process_tms_kb_hl_support_queue();
                        } finally {
                            kb_hl_supports.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return assertion_removedP;
            }
        }
    }

    public static SubLObject tms_propagate_removed_argument(final SubLObject argument, final SubLObject assertion, final SubLObject removing_the_last_asserted_argumentP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_removedP = NIL;
        if (NIL != tms_can_kill_forts_for_meP()) {
            if (NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP()) {
                assertion_removedP = tms_recompute_assertion_tv(assertion, T, removing_the_last_asserted_argumentP);
                if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                    try {
                        if (NIL != assertion_removedP) {
                            final SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
                            try {
                                $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                after_adding.handle_after_removings(argument, assertion);
                            } finally {
                                $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
                            }
                        } else {
                            after_adding.handle_after_removings(argument, assertion);
                        }
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != assertion_removedP) {
                                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                    if (NIL != tms_assertion_being_removedP(assertion)) {
                                        if (NIL != $tms_remove_assertion_lowP$.getDynamicValue(thread)) {
                                            tms_remove_assertion_low(assertion);
                                        }
                                    } else {
                                        tms_remove_assertion_int(assertion);
                                    }
                                }
                            } else
                                if ((NIL != $check_for_circular_justs$.getDynamicValue(thread)) && (NIL == some_belief_justification(assertion, UNPROVIDED))) {
                                    tms_remove_assertion(assertion);
                                    assertion_removedP = T;
                                }

                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            } else {
                final SubLObject _prev_bind_0 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding(thread);
                try {
                    kb_hl_supports_high.$tms_kb_hl_support_queue$.bind(queues.create_queue(UNPROVIDED), thread);
                    assertion_removedP = tms_recompute_assertion_tv(assertion, T, removing_the_last_asserted_argumentP);
                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                        try {
                            if (NIL != assertion_removedP) {
                                final SubLObject _prev_bind_0_$1 = $tms_assertions_being_removed$.currentBinding(thread);
                                try {
                                    $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                    after_adding.handle_after_removings(argument, assertion);
                                } finally {
                                    $tms_assertions_being_removed$.rebind(_prev_bind_0_$1, thread);
                                }
                            } else {
                                after_adding.handle_after_removings(argument, assertion);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != assertion_removedP) {
                                    if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                        if (NIL != tms_assertion_being_removedP(assertion)) {
                                            if (NIL != $tms_remove_assertion_lowP$.getDynamicValue(thread)) {
                                                tms_remove_assertion_low(assertion);
                                            }
                                        } else {
                                            tms_remove_assertion_int(assertion);
                                        }
                                    }
                                } else
                                    if ((NIL != $check_for_circular_justs$.getDynamicValue(thread)) && (NIL == some_belief_justification(assertion, UNPROVIDED))) {
                                        tms_remove_assertion(assertion);
                                        assertion_removedP = T;
                                    }

                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    }
                    kb_hl_supports_high.process_tms_kb_hl_support_queue();
                } finally {
                    kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            final SubLObject _prev_bind_0 = $tms_forts_to_kill$.currentBinding(thread);
            try {
                $tms_forts_to_kill$.bind(NIL, thread);
                if (NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP()) {
                    assertion_removedP = tms_recompute_assertion_tv(assertion, T, removing_the_last_asserted_argumentP);
                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                        try {
                            if (NIL != assertion_removedP) {
                                final SubLObject _prev_bind_0_$3 = $tms_assertions_being_removed$.currentBinding(thread);
                                try {
                                    $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                    after_adding.handle_after_removings(argument, assertion);
                                } finally {
                                    $tms_assertions_being_removed$.rebind(_prev_bind_0_$3, thread);
                                }
                            } else {
                                after_adding.handle_after_removings(argument, assertion);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                if (NIL != assertion_removedP) {
                                    if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                        if (NIL != tms_assertion_being_removedP(assertion)) {
                                            if (NIL != $tms_remove_assertion_lowP$.getDynamicValue(thread)) {
                                                tms_remove_assertion_low(assertion);
                                            }
                                        } else {
                                            tms_remove_assertion_int(assertion);
                                        }
                                    }
                                } else
                                    if ((NIL != $check_for_circular_justs$.getDynamicValue(thread)) && (NIL == some_belief_justification(assertion, UNPROVIDED))) {
                                        tms_remove_assertion(assertion);
                                        assertion_removedP = T;
                                    }

                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                } else {
                    final SubLObject _prev_bind_0_$5 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding(thread);
                    try {
                        kb_hl_supports_high.$tms_kb_hl_support_queue$.bind(queues.create_queue(UNPROVIDED), thread);
                        assertion_removedP = tms_recompute_assertion_tv(assertion, T, removing_the_last_asserted_argumentP);
                        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                            try {
                                if (NIL != assertion_removedP) {
                                    final SubLObject _prev_bind_0_$6 = $tms_assertions_being_removed$.currentBinding(thread);
                                    try {
                                        $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                        after_adding.handle_after_removings(argument, assertion);
                                    } finally {
                                        $tms_assertions_being_removed$.rebind(_prev_bind_0_$6, thread);
                                    }
                                } else {
                                    after_adding.handle_after_removings(argument, assertion);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    if (NIL != assertion_removedP) {
                                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                            if (NIL != tms_assertion_being_removedP(assertion)) {
                                                if (NIL != $tms_remove_assertion_lowP$.getDynamicValue(thread)) {
                                                    tms_remove_assertion_low(assertion);
                                                }
                                            } else {
                                                tms_remove_assertion_int(assertion);
                                            }
                                        }
                                    } else
                                        if ((NIL != $check_for_circular_justs$.getDynamicValue(thread)) && (NIL == some_belief_justification(assertion, UNPROVIDED))) {
                                            tms_remove_assertion(assertion);
                                            assertion_removedP = T;
                                        }

                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                        kb_hl_supports_high.process_tms_kb_hl_support_queue();
                    } finally {
                        kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                tms_kill_queued_forts();
            } finally {
                $tms_forts_to_kill$.rebind(_prev_bind_0, thread);
            }
        }
        return assertion_removedP;
    }

    /**
     * Remove each valid assertion in ASSERTIONS
     */
    @LispMethod(comment = "Remove each valid assertion in ASSERTIONS")
    public static final SubLObject tms_remove_assertion_list_alt(SubLObject assertions) {
        if (NIL == assertions) {
            return NIL;
        } else {
            return com.cyc.cycjava.cycl.tms.tms_remove_nonempty_assertion_list(assertions);
        }
    }

    /**
     * Remove each valid assertion in ASSERTIONS
     */
    @LispMethod(comment = "Remove each valid assertion in ASSERTIONS")
    public static SubLObject tms_remove_assertion_list(final SubLObject assertions) {
        if (NIL == assertions) {
            return NIL;
        }
        return tms_remove_nonempty_assertion_list(assertions);
    }

    /**
     * Remove each valid assertion in ASSERTIONS
     */
    @LispMethod(comment = "Remove each valid assertion in ASSERTIONS")
    public static final SubLObject tms_remove_nonempty_assertion_list_alt(SubLObject assertions) {
        {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.tms.tms_remove_assertion(assertion);
            }
        }
        return NIL;
    }

    /**
     * Remove each valid assertion in ASSERTIONS
     */
    @LispMethod(comment = "Remove each valid assertion in ASSERTIONS")
    public static SubLObject tms_remove_nonempty_assertion_list(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != tms_can_kill_forts_for_meP()) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tms_remove_assertion(assertion);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } else {
            final SubLObject _prev_bind_0 = $tms_forts_to_kill$.currentBinding(thread);
            try {
                $tms_forts_to_kill$.bind(NIL, thread);
                SubLObject cdolist_list_var2 = assertions;
                SubLObject assertion2 = NIL;
                assertion2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    tms_remove_assertion(assertion2);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    assertion2 = cdolist_list_var2.first();
                } 
                tms_kill_queued_forts();
            } finally {
                $tms_forts_to_kill$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Remove ASSERTION from the KB and do all necessary truth maintenance.
     */
    @LispMethod(comment = "Remove ASSERTION from the KB and do all necessary truth maintenance.")
    public static final SubLObject tms_remove_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) && (NIL == com.cyc.cycjava.cycl.tms.tms_assertion_being_removedP(assertion))) {
            return com.cyc.cycjava.cycl.tms.tms_remove_assertion_int(assertion);
        }
        return NIL;
    }

    /**
     * Remove ASSERTION from the KB and do all necessary truth maintenance.
     */
    @LispMethod(comment = "Remove ASSERTION from the KB and do all necessary truth maintenance.")
    public static SubLObject tms_remove_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            if (NIL == tms_assertion_being_removedP(assertion)) {
                return tms_remove_assertion_int(assertion);
            }
            if ((NIL != $recursive_tms_bugP$.getDynamicValue(thread)) && (NIL != tms_assertion_being_removedP(assertion))) {
                return tms_remove_assertion_low(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject tms_remove_assertion_int_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kb_modification_event.post_kb_modify_remove_assertion_event(assertion);
            if (NIL != kb_hl_supports.enqueueing_kb_hl_supports_for_tmsP()) {
                {
                    SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
                    try {
                        $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                            if (NIL == v_arguments) {
                                com.cyc.cycjava.cycl.tms.tms_remove_assertion_int_2(assertion);
                            } else {
                                {
                                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                    SubLObject argument = NIL;
                                    for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.tms.tms_remove_argument(argument, assertion);
                                    }
                                }
                            }
                        }
                    } finally {
                        $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                {
                    SubLObject _prev_bind_0 = kb_hl_supports.$tms_kb_hl_support_queue$.currentBinding(thread);
                    try {
                        kb_hl_supports.$tms_kb_hl_support_queue$.bind(queues.create_queue(), thread);
                        {
                            SubLObject _prev_bind_0_3 = $tms_assertions_being_removed$.currentBinding(thread);
                            try {
                                $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                {
                                    SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                                    if (NIL == v_arguments) {
                                        com.cyc.cycjava.cycl.tms.tms_remove_assertion_int_2(assertion);
                                    } else {
                                        {
                                            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                            SubLObject argument = NIL;
                                            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                                com.cyc.cycjava.cycl.tms.tms_remove_argument(argument, assertion);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $tms_assertions_being_removed$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                        kb_hl_supports.process_tms_kb_hl_support_queue();
                    } finally {
                        kb_hl_supports.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject tms_remove_assertion_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_modification_event.post_kb_modify_remove_assertion_event(assertion, UNPROVIDED);
        if (NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP()) {
            final SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
            try {
                $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                if (NIL == v_arguments) {
                    tms_remove_assertion_low(assertion);
                } else {
                    final SubLObject removing_the_last_asserted_argumentP = makeBoolean((NIL != list_utilities.singletonP(v_arguments)) && (NIL != arguments.asserted_argument_p(list_utilities.only_one(v_arguments))));
                    SubLObject cdolist_list_var = v_arguments;
                    SubLObject argument = NIL;
                    argument = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        tms_remove_argument(argument, assertion, removing_the_last_asserted_argumentP);
                        cdolist_list_var = cdolist_list_var.rest();
                        argument = cdolist_list_var.first();
                    } 
                    if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                        tms_remove_assertion_low(assertion);
                    }
                }
            } finally {
                $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding(thread);
            try {
                kb_hl_supports_high.$tms_kb_hl_support_queue$.bind(queues.create_queue(UNPROVIDED), thread);
                final SubLObject _prev_bind_0_$8 = $tms_assertions_being_removed$.currentBinding(thread);
                try {
                    $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                    final SubLObject v_arguments2 = assertions_high.assertion_arguments(assertion);
                    if (NIL == v_arguments2) {
                        tms_remove_assertion_low(assertion);
                    } else {
                        final SubLObject removing_the_last_asserted_argumentP2 = makeBoolean((NIL != list_utilities.singletonP(v_arguments2)) && (NIL != arguments.asserted_argument_p(list_utilities.only_one(v_arguments2))));
                        SubLObject cdolist_list_var2 = v_arguments2;
                        SubLObject argument2 = NIL;
                        argument2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            tms_remove_argument(argument2, assertion, removing_the_last_asserted_argumentP2);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            argument2 = cdolist_list_var2.first();
                        } 
                        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                            tms_remove_assertion_low(assertion);
                        }
                    }
                } finally {
                    $tms_assertions_being_removed$.rebind(_prev_bind_0_$8, thread);
                }
                kb_hl_supports_high.process_tms_kb_hl_support_queue();
            } finally {
                kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject tms_remove_assertion_low(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        kb_indexing.remove_term_indices(assertion);
        forward.remqueue_forward_assertion(assertion);
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            inference_analysis.clear_transformation_rule_statistics(assertion);
        }
        if ((NIL == function_terms.tou_assertionP(assertion)) || (NIL == nart_handles.valid_nartP(assertions_high.gaf_arg1(assertion), UNPROVIDED))) {
            return assertions_high.remove_assertion(assertion);
        }
        return NIL;
    }

    /**
     * Remove DEDUCTION from the KB and do all necessary truth maintenance.
     */
    @LispMethod(comment = "Remove DEDUCTION from the KB and do all necessary truth maintenance.")
    public static final SubLObject tms_remove_deduction_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
            {
                SubLObject assertion = deductions_high.deduction_assertion(deduction);
                SubLObject result = NIL;
                if (NIL != kb_hl_supports.enqueueing_kb_hl_supports_for_tmsP()) {
                    result = com.cyc.cycjava.cycl.tms.tms_remove_argument(deduction, assertion);
                } else {
                    {
                        SubLObject _prev_bind_0 = kb_hl_supports.$tms_kb_hl_support_queue$.currentBinding(thread);
                        try {
                            kb_hl_supports.$tms_kb_hl_support_queue$.bind(queues.create_queue(), thread);
                            result = com.cyc.cycjava.cycl.tms.tms_remove_argument(deduction, assertion);
                            kb_hl_supports.process_tms_kb_hl_support_queue();
                        } finally {
                            kb_hl_supports.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Remove DEDUCTION from the KB and do all necessary truth maintenance.
     */
    @LispMethod(comment = "Remove DEDUCTION from the KB and do all necessary truth maintenance.")
    public static SubLObject tms_remove_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        SubLObject result = NIL;
        if (NIL != kb_hl_supports_high.enqueueing_kb_hl_supports_for_tmsP()) {
            result = tms_remove_argument(deduction, supported_object, UNPROVIDED);
        } else {
            final SubLObject _prev_bind_0 = kb_hl_supports_high.$tms_kb_hl_support_queue$.currentBinding(thread);
            try {
                kb_hl_supports_high.$tms_kb_hl_support_queue$.bind(queues.create_queue(UNPROVIDED), thread);
                result = tms_remove_argument(deduction, supported_object, UNPROVIDED);
                kb_hl_supports_high.process_tms_kb_hl_support_queue();
            } finally {
                kb_hl_supports_high.$tms_kb_hl_support_queue$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     * Change the TV of asserted ARGUMENT for ASSERTION and perform necessary truth maintenance.
     */
    @LispMethod(comment = "Change the TV of asserted ARGUMENT for ASSERTION and perform necessary truth maintenance.")
    public static final SubLObject tms_change_asserted_argument_tv_alt(SubLObject asserted_argument, SubLObject assertion, SubLObject tv) {
        SubLTrampolineFile.checkType(asserted_argument, ASSERTED_ARGUMENT_P);
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(tv, TV_P);
        hl_modifiers.replace_assertion_asserted_argument_with_tv(assertion, tv);
        com.cyc.cycjava.cycl.tms.tms_recompute_assertion_tv(assertion);
        after_adding.handle_after_removings(asserted_argument, assertion);
        after_adding.handle_after_addings(asserted_argument, assertion);
        return asserted_argument;
    }

    /**
     * Change the TV of asserted ARGUMENT for ASSERTION and perform necessary truth maintenance.
     */
    @LispMethod(comment = "Change the TV of asserted ARGUMENT for ASSERTION and perform necessary truth maintenance.")
    public static SubLObject tms_change_asserted_argument_tv(final SubLObject asserted_argument, final SubLObject assertion, final SubLObject tv) {
        assert NIL != arguments.asserted_argument_p(asserted_argument) : "! arguments.asserted_argument_p(asserted_argument) " + ("arguments.asserted_argument_p(asserted_argument) " + "CommonSymbols.NIL != arguments.asserted_argument_p(asserted_argument) ") + asserted_argument;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.tv_p(tv) : "! enumeration_types.tv_p(tv) " + ("enumeration_types.tv_p(tv) " + "CommonSymbols.NIL != enumeration_types.tv_p(tv) ") + tv;
        assertions_interface.replace_assertion_asserted_argument_with_tv(assertion, tv);
        tms_recompute_assertion_tv(assertion, UNPROVIDED, UNPROVIDED);
        hl_transcript_tracing.note_hlt_assert(assertion);
        after_adding.handle_after_removings(asserted_argument, assertion);
        after_adding.handle_after_addings(asserted_argument, assertion);
        return asserted_argument;
    }

    /**
     * Recompute ASSERTION's tv and perform necessary truth maintenance.
     * Return T if ASSERTION should be removed, else NIL
     */
    @LispMethod(comment = "Recompute ASSERTION\'s tv and perform necessary truth maintenance.\r\nReturn T if ASSERTION should be removed, else NIL\nRecompute ASSERTION\'s tv and perform necessary truth maintenance.\nReturn T if ASSERTION should be removed, else NIL")
    public static final SubLObject tms_recompute_assertion_tv(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject changedP = NIL;
                SubLObject removeP = NIL;
                if (NIL == assertion_utilities.assertion_has_argumentsP(assertion)) {
                    {
                        SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
                        try {
                            $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                            com.cyc.cycjava.cycl.tms.tms_remove_dependents(assertion);
                        } finally {
                            $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
                        }
                    }
                    removeP = T;
                } else {
                    {
                        SubLObject old_tv = assertions_high.cyc_assertion_tv(assertion);
                        SubLObject new_tv = argumentation.compute_assertion_tv(assertion);
                        if (NIL != $bootstrapping_kbP$.getDynamicValue(thread)) {
                        } else {
                            if (old_tv == new_tv) {
                            } else {
                                if (tv_truth(old_tv) == tv_truth(new_tv)) {
                                    com.cyc.cycjava.cycl.tms.tms_recompute_dependents_tv(assertion);
                                } else {
                                    com.cyc.cycjava.cycl.tms.tms_remove_dependents(assertion);
                                    changedP = T;
                                }
                            }
                        }
                    }
                }
                if (NIL != changedP) {
                    rewrite_of_propagation.perform_rewrite_of_propagation(assertion);
                    if (assertions_high.assertion_direction(assertion) == $FORWARD) {
                        forward.queue_forward_assertion(assertion);
                    }
                }
                return removeP;
            }
        }
    }

    public static SubLObject tms_recompute_assertion_tv(final SubLObject assertion, SubLObject pre_existing_assertionP, SubLObject removing_the_last_asserted_argumentP) {
        if (pre_existing_assertionP == UNPROVIDED) {
            pre_existing_assertionP = T;
        }
        if (removing_the_last_asserted_argumentP == UNPROVIDED) {
            removing_the_last_asserted_argumentP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject changedP = NIL;
        SubLObject removeP = NIL;
        if ((NIL != removing_the_last_asserted_argumentP) || (NIL == assertion_utilities.assertion_has_argumentsP(assertion))) {
            final SubLObject _prev_bind_0 = $tms_assertions_being_removed$.currentBinding(thread);
            try {
                $tms_assertions_being_removed$.bind(adjoin(assertion, $tms_assertions_being_removed$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                tms_remove_dependents(assertion);
            } finally {
                $tms_assertions_being_removed$.rebind(_prev_bind_0, thread);
            }
            removeP = T;
        } else {
            final SubLObject old_tv = (NIL != pre_existing_assertionP) ? assertions_high.cyc_assertion_tv(assertion) : $UNKNOWN;
            final SubLObject new_tv = argumentation.compute_assertion_tv(assertion);
            if (NIL == $bootstrapping_kbP$.getDynamicValue(thread)) {
                if (!old_tv.eql(new_tv)) {
                    if (enumeration_types.tv_truth(old_tv).eql(enumeration_types.tv_truth(new_tv))) {
                        tms_recompute_dependents_tv(assertion);
                    } else {
                        tms_remove_dependents(assertion);
                        changedP = T;
                    }
                }
            }
        }
        if (NIL != changedP) {
            perform_except_propagation(assertion);
            rewrite_of_propagation.perform_rewrite_of_propagation(assertion);
            if (NIL != pre_existing_assertionP) {
                tms_possibly_schedule_assertion_for_forward_propagation(assertion);
            }
        }
        return removeP;
    }

    /**
     * Change the DIRECTION of ASSERTION and queue forward propagation if required.
     */
    @LispMethod(comment = "Change the DIRECTION of ASSERTION and queue forward propagation if required.")
    public static final SubLObject tms_change_direction_alt(SubLObject assertion, SubLObject direction) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(direction, DIRECTION_P);
        kb_set_assertion_direction(assertion, direction);
        if (direction == $FORWARD) {
            forward.queue_forward_assertion(assertion);
        }
        return assertion;
    }

    /**
     * Change the DIRECTION of ASSERTION and queue forward propagation if required.
     */
    @LispMethod(comment = "Change the DIRECTION of ASSERTION and queue forward propagation if required.")
    public static SubLObject tms_change_direction(final SubLObject assertion, final SubLObject direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != enumeration_types.direction_p(direction) : "! enumeration_types.direction_p(direction) " + ("enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) ") + direction;
        assertions_interface.kb_set_assertion_direction(assertion, direction);
        tms_possibly_schedule_assertion_for_forward_propagation(assertion);
        return assertion;
    }

    public static SubLObject tms_should_schedule_assertion_for_forward_propagationP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread)) && (NIL != assertions_high.forward_assertionP(assertion))) && (NIL != (NIL != assertions_high.rule_assertionP(assertion) ? assertion_utilities.true_assertionP(assertion) : makeBoolean(NIL == assertion_utilities.unknown_assertionP(assertion)))));
    }

    public static SubLObject tms_possibly_schedule_assertion_for_forward_propagation(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != tms_should_schedule_assertion_for_forward_propagationP(assertion)) {
            forward.queue_forward_assertion(assertion);
            return T;
        }
        return NIL;
    }

    public static final SubLObject tms_recompute_dependents_alt(SubLObject assertion) {
        com.cyc.cycjava.cycl.tms.tms_remove_dependents(assertion);
        com.cyc.cycjava.cycl.tms.tms_recompute_assertion_tv(assertion);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject argument = NIL;
            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                after_adding.handle_after_removings(argument, assertion);
                after_adding.handle_after_addings(argument, assertion);
            }
        }
        return assertion;
    }

    public static SubLObject tms_recompute_dependents(final SubLObject assertion) {
        tms_remove_dependents(assertion);
        tms_recompute_assertion_tv(assertion, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            after_adding.handle_after_removings(argument, assertion);
            after_adding.handle_after_addings(argument, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static SubLObject tms_handle_after_addings(final SubLObject assertion) {
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            after_adding.handle_after_addings(argument, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return assertion;
    }

    /**
     * Remove all the deductions depending on this ASSERTION.
     */
    @LispMethod(comment = "Remove all the deductions depending on this ASSERTION.")
    public static final SubLObject tms_remove_dependents_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
            SubLObject dependent_deduction = NIL;
            for (dependent_deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent_deduction = cdolist_list_var.first()) {
                if (NIL != valid_deductionP(dependent_deduction, UNPROVIDED)) {
                    {
                        SubLObject deduction_assertion = deductions_high.deduction_assertion(dependent_deduction);
                        com.cyc.cycjava.cycl.tms.tms_remove_argument(dependent_deduction, deduction_assertion);
                    }
                }
            }
        }
        return assertion;
    }

    /**
     * Remove all the deductions depending on this ASSERTION.
     */
    @LispMethod(comment = "Remove all the deductions depending on this ASSERTION.")
    public static SubLObject tms_remove_dependents(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_deduction;
        SubLObject deduction_supported_object;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_deduction = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_deduction)) && (NIL != deduction_handles.valid_deductionP(dependent_deduction, UNPROVIDED))) {
                deduction_supported_object = deductions_high.deduction_supported_object(dependent_deduction);
                tms_remove_argument(dependent_deduction, deduction_supported_object, UNPROVIDED);
            }
        }
        return assertion;
    }

    /**
     * Recompute the TV of all the deductions depending on this ASSERTION.
     */
    @LispMethod(comment = "Recompute the TV of all the deductions depending on this ASSERTION.")
    public static final SubLObject tms_recompute_dependents_tv_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
            SubLObject dependent = NIL;
            for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.tms.tms_recompute_deduction_tv(dependent);
            }
        }
        return assertion;
    }

    /**
     * Recompute the TV of all the deductions depending on this ASSERTION.
     */
    @LispMethod(comment = "Recompute the TV of all the deductions depending on this ASSERTION.")
    public static SubLObject tms_recompute_dependents_tv(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent)) {
                tms_recompute_deduction_tv(dependent);
            }
        }
        return assertion;
    }

    public static final SubLObject tms_recompute_deduction_tv_alt(SubLObject deduction) {
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        {
            SubLObject old_tv = argument_tv(deduction);
            SubLObject new_tv = argumentation.compute_deduction_tv(deduction);
            if (old_tv != new_tv) {
                {
                    SubLObject assertion = deductions_high.deduction_assertion(deduction);
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        com.cyc.cycjava.cycl.tms.tms_recompute_assertion_tv(assertion);
                    }
                }
            }
        }
        return deduction;
    }

    public static SubLObject tms_recompute_deduction_tv(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        final SubLObject old_tv = arguments.argument_tv(deduction);
        final SubLObject new_tv = argumentation.compute_deduction_tv(deduction);
        if (!old_tv.eql(new_tv)) {
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            if (NIL != assertion_handles.assertion_p(supported_object)) {
                tms_recompute_assertion_tv(supported_object, UNPROVIDED, UNPROVIDED);
            }
        }
        return deduction;
    }

    /**
     * Removes all arguments for assertions in MT.
     * If DEDUCTIONS-ONLY? is non-nil, then it only removes deductions.
     */
    @LispMethod(comment = "Removes all arguments for assertions in MT.\r\nIf DEDUCTIONS-ONLY? is non-nil, then it only removes deductions.\nRemoves all arguments for assertions in MT.\nIf DEDUCTIONS-ONLY? is non-nil, then it only removes deductions.")
    public static final SubLObject tms_remove_mt_arguments_alt(SubLObject mt, SubLObject deductions_onlyP) {
        if (deductions_onlyP == UNPROVIDED) {
            deductions_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != assertion);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                                                    SubLObject cdolist_list_var = v_arguments;
                                                    SubLObject argument = NIL;
                                                    for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                                        if ((NIL == deductions_onlyP) || (NIL != deduction_p(argument))) {
                                                            com.cyc.cycjava.cycl.tms.tms_remove_argument(argument, assertion);
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
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
                } else {
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt21$do_broad_mt_index, STRINGP);
                                {
                                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        noting_percent_progress_preamble($str_alt21$do_broad_mt_index);
                                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject assertion = NIL;
                                                while (NIL != id) {
                                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                        note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion, mt, NIL, NIL)) {
                                                            {
                                                                SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
                                                                SubLObject cdolist_list_var = v_arguments;
                                                                SubLObject argument = NIL;
                                                                for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                                                    if ((NIL == deductions_onlyP) || (NIL != deduction_p(argument))) {
                                                                        com.cyc.cycjava.cycl.tms.tms_remove_argument(argument, assertion);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    id = do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                                } 
                                            }
                                        }
                                        noting_percent_progress_postamble();
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
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

    /**
     * Removes all arguments for assertions in MT.
     * If DEDUCTIONS-ONLY? is non-nil, then it only removes deductions.
     */
    @LispMethod(comment = "Removes all arguments for assertions in MT.\r\nIf DEDUCTIONS-ONLY? is non-nil, then it only removes deductions.\nRemoves all arguments for assertions in MT.\nIf DEDUCTIONS-ONLY? is non-nil, then it only removes deductions.")
    public static SubLObject tms_remove_mt_arguments(final SubLObject mt, SubLObject deductions_onlyP) {
        if (deductions_onlyP == UNPROVIDED) {
            deductions_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                        if (NIL != valid) {
                            SubLObject cdolist_list_var;
                            final SubLObject v_arguments = cdolist_list_var = assertions_high.assertion_arguments(assertion);
                            SubLObject argument = NIL;
                            argument = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if ((NIL == deductions_onlyP) || (NIL != deduction_handles.deduction_p(argument))) {
                                    tms_remove_argument(argument, assertion, UNPROVIDED);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                argument = cdolist_list_var.first();
                            } 
                        }
                        done_var = makeBoolean(NIL == valid);
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
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $str27$do_broad_mt_index;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$9 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$9, $SKIP)) {
                            final SubLObject idx_$10 = idx_$9;
                            if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$10);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion2;
                                SubLObject cdolist_list_var2;
                                SubLObject v_arguments2;
                                SubLObject argument2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) {
                                            v_arguments2 = cdolist_list_var2 = assertions_high.assertion_arguments(assertion2);
                                            argument2 = NIL;
                                            argument2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                if ((NIL == deductions_onlyP) || (NIL != deduction_handles.deduction_p(argument2))) {
                                                    tms_remove_argument(argument2, assertion2, UNPROVIDED);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                argument2 = cdolist_list_var2.first();
                                            } 
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$11 = idx_$9;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$11);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$11);
                                final SubLObject end_id = id_index_next_id(idx_$11);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) {
                                            SubLObject cdolist_list_var3;
                                            final SubLObject v_arguments3 = cdolist_list_var3 = assertions_high.assertion_arguments(assertion3);
                                            SubLObject argument3 = NIL;
                                            argument3 = cdolist_list_var3.first();
                                            while (NIL != cdolist_list_var3) {
                                                if ((NIL == deductions_onlyP) || (NIL != deduction_handles.deduction_p(argument3))) {
                                                    tms_remove_argument(argument3, assertion3, UNPROVIDED);
                                                }
                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                argument3 = cdolist_list_var3.first();
                                            } 
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }

        return NIL;
    }

    public static SubLObject except_propagation_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list32, $$BaseKB);
    }

    public static SubLObject perform_except_propagation(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL == assertion_utilities.unknown_assertionP(assertion)) {
            final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
            if (NIL != clause_struc) {
                SubLObject cdolist_list_var = clause_strucs.clause_struc_assertions(clause_struc);
                SubLObject sibling_assertion = NIL;
                sibling_assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == kb_utilities.kbeq(sibling_assertion, assertion)) && assertions_high.assertion_truth(assertion).eql(enumeration_types.inverse_truth(assertions_high.assertion_truth(sibling_assertion)))) {
                        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                        final SubLObject sibling_assertion_mt = assertions_high.assertion_mt(sibling_assertion);
                        SubLObject excepted_assertion = NIL;
                        SubLObject excepted_mt = NIL;
                        SubLObject supports = NIL;
                        final SubLObject sibling_genl_mtP = genl_mts.genl_mtP(assertion_mt, sibling_assertion_mt, UNPROVIDED, UNPROVIDED);
                        final SubLObject sibling_spec_mtP = genl_mts.genl_mtP(sibling_assertion_mt, assertion_mt, UNPROVIDED, UNPROVIDED);
                        if ((NIL == sibling_genl_mtP) || (NIL == sibling_spec_mtP)) {
                            if (NIL != sibling_genl_mtP) {
                                excepted_assertion = sibling_assertion;
                                excepted_mt = assertion_mt;
                                supports = cons(removal_modules_genlmt.make_genl_mt_support(assertion_mt, sibling_assertion_mt), supports);
                            } else
                                if (NIL != sibling_spec_mtP) {
                                    excepted_assertion = assertion;
                                    excepted_mt = sibling_assertion_mt;
                                    supports = cons(removal_modules_genlmt.make_genl_mt_support(sibling_assertion_mt, assertion_mt), supports);
                                }

                        }
                        if (NIL != excepted_assertion) {
                            if (NIL != arguments.valid_supportP($except_propagation_rule$.getDynamicValue(thread), UNPROVIDED)) {
                                supports = cons($except_propagation_rule$.getDynamicValue(thread), supports);
                            }
                            supports = cons(assertion, supports);
                            supports = cons(sibling_assertion, supports);
                            final SubLObject asent = make_unary_formula($$except, excepted_assertion);
                            thread.resetMultipleValues();
                            final SubLObject deduction = hl_storage_modules.hl_add_deduction_for_gaf(asent, $TRUE, excepted_mt, supports, $FORWARD);
                            final SubLObject redundantP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject item_var;
                            final SubLObject assertion_$13 = item_var = (NIL != deduction_handles.deduction_p(deduction)) ? deductions_high.deduction_assertion(deduction) : NIL;
                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling_assertion = cdolist_list_var.first();
                } 
            }
        }
        return result;
    }

    public static final SubLObject tms_remove_deduction_for_assertion_alt(SubLObject assertion, SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        {
            SubLObject deduction = deductions_high.find_deduction(assertion, supports, truth);
            if (NIL != deduction) {
                com.cyc.cycjava.cycl.tms.tms_remove_argument(deduction, assertion);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject tms_remove_deduction_for_assertion(final SubLObject assertion, final SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLObject deduction = deductions_high.find_deduction(assertion, supports, truth);
        if (NIL != deduction) {
            tms_explicitly_remove_deduction_for_assertion(deduction);
            return T;
        }
        return NIL;
    }

    public static SubLObject tms_explicitly_remove_deduction_for_assertion(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        if ((NIL != deduction_handles.valid_deductionP(deduction, UNPROVIDED)) && (NIL == tms_argument_being_removedP(deduction))) {
            final SubLObject assertion = deductions_high.deduction_supported_object(deduction);
            if (NIL != assertion_handles.assertion_p(assertion)) {
                hl_transcript_tracing.note_hlt_remove_deduction(deduction);
                return tms_remove_argument(deduction, assertion, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 NIL or deduction-p
     * @return 1 booleanp; whether the deduction is redundant
     */
    @LispMethod(comment = "@return 0 NIL or deduction-p\r\n@return 1 booleanp; whether the deduction is redundant")
    public static final SubLObject tms_add_deduction_for_assertion(SubLObject assertion, SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (NIL != com.cyc.cycjava.cycl.tms.tms_direct_circularity(assertion, supports)) {
            return values(NIL, T);
        }
        {
            SubLObject existing = deductions_high.find_deduction(assertion, supports, truth);
            if (NIL != existing) {
                return values(existing, T);
            }
        }
        {
            SubLObject tv = argumentation.compute_supports_tv(supports, truth);
            SubLObject new_argument = com.cyc.cycjava.cycl.tms.tms_add_new_deduction(assertion, supports, tv);
            return values(new_argument, NIL);
        }
    }

    public static SubLObject tms_add_deduction_for_assertion(final SubLObject assertion, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        if (NIL != tms_direct_circularity(assertion, supports)) {
            return values(NIL, T);
        }
        final SubLObject existing = deductions_high.find_deduction(assertion, supports, truth);
        if (NIL != existing) {
            return values(existing, T);
        }
        final SubLObject tv = argumentation.compute_supports_tv(supports, truth);
        final SubLObject new_argument = tms_add_new_deduction(assertion, supports, tv, v_bindings, pragmatic_support_mts);
        tms_invalidate_weaker_redundant_arguments(assertion, new_argument);
        return values(new_argument, NIL);
    }

    public static final SubLObject tms_add_deduction_for_cnf(SubLObject cnf, SubLObject mt, SubLObject supports, SubLObject truth, SubLObject direction, SubLObject var_names) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        {
            SubLObject assertion = assertions_high.find_or_create_assertion(cnf, mt, var_names, direction);
            return com.cyc.cycjava.cycl.tms.tms_add_deduction_for_assertion(assertion, supports, truth);
        }
    }

    public static SubLObject tms_add_deduction_for_cnf(final SubLObject cnf, final SubLObject mt, final SubLObject supports, SubLObject truth, SubLObject direction, SubLObject var_names, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        if (direction == UNPROVIDED) {
            direction = $BACKWARD;
        }
        if (var_names == UNPROVIDED) {
            var_names = NIL;
        }
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        if (pragmatic_support_mts == UNPROVIDED) {
            pragmatic_support_mts = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertion = assertions_high.find_or_create_assertion(cnf, mt, var_names, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject newly_createdP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject deduction = tms_add_deduction_for_assertion(assertion, supports, truth, v_bindings, pragmatic_support_mts);
        final SubLObject redundantP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(deduction, redundantP, newly_createdP);
    }

    /**
     * Return T iff SUPPORTS for ASSERTION include a direct circularity
     */
    @LispMethod(comment = "Return T iff SUPPORTS for ASSERTION include a direct circularity")
    public static final SubLObject tms_direct_circularity_alt(SubLObject assertion, SubLObject supports) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return member(assertion, supports, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff SUPPORTS for ASSERTION include a direct circularity
     */
    @LispMethod(comment = "Return T iff SUPPORTS for ASSERTION include a direct circularity")
    public static SubLObject tms_direct_circularity(final SubLObject assertion, final SubLObject supports) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return list_utilities.member_kbeqP(assertion, supports);
    }

    /**
     * Return T iff DEDUCTION is a directly circular argument
     */
    @LispMethod(comment = "Return T iff DEDUCTION is a directly circular argument")
    public static final SubLObject tms_directly_circular_deduction_alt(SubLObject deduction) {
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        return com.cyc.cycjava.cycl.tms.tms_direct_circularity(deductions_high.deduction_assertion(deduction), deductions_high.deduction_supports(deduction));
    }

    /**
     * Return T iff DEDUCTION is a directly circular argument
     */
    @LispMethod(comment = "Return T iff DEDUCTION is a directly circular argument")
    public static SubLObject tms_directly_circular_deduction(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        return tms_direct_circularity(deductions_high.deduction_assertion(deduction), deductions_high.deduction_supports(deduction));
    }

    public static SubLObject tms_invalidate_weaker_redundant_arguments(final SubLObject assertion, final SubLObject new_argument) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject redundant_arguments = cdolist_list_var = tms_weaker_redundant_arguments(assertion, new_argument);
        SubLObject redundant_argument = NIL;
        redundant_argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != arguments.valid_argument(redundant_argument, UNPROVIDED)) {
                tms_remove_weaker_redundant_argument(redundant_argument, assertion);
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            redundant_argument = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject tms_weaker_redundant_arguments(final SubLObject assertion, final SubLObject new_argument) {
        SubLObject result = NIL;
        if (NIL != deduction_with_one_tou_supportP(new_argument)) {
            SubLObject naut = NIL;
            SubLObject other_supports = NIL;
            SubLObject cdolist_list_var = deductions_high.deduction_supports(new_argument);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != function_terms.tou_assertionP(support)) {
                    naut = assertions_high.gaf_arg2(support);
                } else {
                    other_supports = cons(support, other_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject other_argument = NIL;
            other_argument = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((!other_argument.eql(new_argument)) && (NIL != deduction_with_one_equality_support_matchingP(other_argument, naut))) {
                    SubLObject weaker_supports = NIL;
                    SubLObject cdolist_list_var_$14 = deductions_high.deduction_supports(other_argument);
                    SubLObject weaker_support = NIL;
                    weaker_support = cdolist_list_var_$14.first();
                    while (NIL != cdolist_list_var_$14) {
                        if (NIL == equality_support_matchingP(weaker_support, naut)) {
                            weaker_supports = cons(weaker_support, weaker_supports);
                        }
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        weaker_support = cdolist_list_var_$14.first();
                    } 
                    if (NIL != list_utilities.sets_equal_equalP(other_supports, weaker_supports)) {
                        result = cons(other_argument, result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_argument = cdolist_list_var.first();
            } 
        }
        return nreverse(result);
    }

    public static SubLObject tms_remove_weaker_redundant_argument(final SubLObject redundant_argument, final SubLObject support) {
        return tms_remove_argument(redundant_argument, support, UNPROVIDED);
    }

    public static SubLObject deduction_with_one_tou_supportP(final SubLObject v_object) {
        if (NIL != deduction_handles.deduction_p(v_object)) {
            SubLObject tou_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = deductions_high.deduction_supports(v_object);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != function_terms.tou_assertionP(support)) {
                    tou_count = add(tou_count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            return number_utilities.onep(tou_count);
        }
        return NIL;
    }

    public static SubLObject deduction_with_one_equality_support_matchingP(final SubLObject v_object, final SubLObject match) {
        if (NIL != deduction_handles.deduction_p(v_object)) {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = deductions_high.deduction_supports(v_object);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != equality_support_matchingP(support, match)) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            return number_utilities.onep(count);
        }
        return NIL;
    }

    public static SubLObject equality_support_matchingP(final SubLObject v_object, final SubLObject match) {
        return makeBoolean(((NIL != arguments.hl_support_p(v_object)) && ($EQUALITY == arguments.hl_support_module(v_object))) && match.equal(cycl_utilities.formula_arg1(arguments.hl_support_sentence(v_object), UNPROVIDED)));
    }

    /**
     * Return T iff ATOMIC-CNF can be trivially derived in MT.
     */
    @LispMethod(comment = "Return T iff ATOMIC-CNF can be trivially derived in MT.")
    public static final SubLObject atomic_cnf_trivially_derivable_alt(SubLObject atomic_cnf, SubLObject mt) {
        SubLTrampolineFile.checkType(atomic_cnf, CNF_P);
        if (NIL != clause_utilities.pos_atomic_cnf_p(atomic_cnf)) {
            {
                SubLObject asent = clause_utilities.atomic_cnf_asent(atomic_cnf);
                return com.cyc.cycjava.cycl.tms.gaf_trivially_derivable(asent, $TRUE, mt);
            }
        } else {
            if (NIL != clause_utilities.neg_atomic_cnf_p(atomic_cnf)) {
                {
                    SubLObject asent = clause_utilities.atomic_cnf_asent(atomic_cnf);
                    return com.cyc.cycjava.cycl.tms.gaf_trivially_derivable(asent, $FALSE, mt);
                }
            } else {
                return Errors.error($str_alt28$_S_was_not_an_atomic_CNF_, atomic_cnf);
            }
        }
    }

    /**
     * Return T iff ATOMIC-CNF can be trivially derived in MT.
     */
    @LispMethod(comment = "Return T iff ATOMIC-CNF can be trivially derived in MT.")
    public static SubLObject atomic_cnf_trivially_derivable(final SubLObject atomic_cnf, final SubLObject mt) {
        assert NIL != clauses.cnf_p(atomic_cnf) : "! clauses.cnf_p(atomic_cnf) " + ("clauses.cnf_p(atomic_cnf) " + "CommonSymbols.NIL != clauses.cnf_p(atomic_cnf) ") + atomic_cnf;
        if (NIL != clause_utilities.pos_atomic_cnf_p(atomic_cnf)) {
            final SubLObject asent = clause_utilities.atomic_cnf_asent(atomic_cnf);
            return gaf_trivially_derivable(asent, $TRUE, mt);
        }
        if (NIL != clause_utilities.neg_atomic_cnf_p(atomic_cnf)) {
            final SubLObject asent = clause_utilities.atomic_cnf_asent(atomic_cnf);
            return gaf_trivially_derivable(asent, $FALSE, mt);
        }
        return Errors.error($str41$_S_was_not_an_atomic_CNF_, atomic_cnf);
    }

    /**
     * Return T iff GAF with TRUTH can be trivially derived in MT.
     */
    @LispMethod(comment = "Return T iff GAF with TRUTH can be trivially derived in MT.")
    public static final SubLObject gaf_trivially_derivable_alt(SubLObject gaf, SubLObject truth, SubLObject mt) {
        {
            SubLObject pcase_var = truth;
            if (pcase_var.eql($TRUE)) {
                return com.cyc.cycjava.cycl.tms.true_gaf_trivially_derivable(gaf, mt);
            } else {
                if (pcase_var.eql($FALSE)) {
                    return com.cyc.cycjava.cycl.tms.false_gaf_trivially_derivable(gaf, mt);
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff GAF with TRUTH can be trivially derived in MT.
     */
    @LispMethod(comment = "Return T iff GAF with TRUTH can be trivially derived in MT.")
    public static SubLObject gaf_trivially_derivable(final SubLObject gaf, final SubLObject truth, final SubLObject mt) {
        if (truth.eql($TRUE)) {
            return true_gaf_trivially_derivable(gaf, mt);
        }
        if (truth.eql($FALSE)) {
            return false_gaf_trivially_derivable(gaf, mt);
        }
        return NIL;
    }

    public static final SubLObject true_gaf_trivially_derivable_alt(SubLObject gaf, SubLObject mt) {
        {
            SubLObject predicate = literal_predicate(gaf, UNPROVIDED);
            SubLObject pcase_var = predicate;
            if (pcase_var.eql($$isa)) {
                {
                    SubLObject datum = literal_args(gaf, UNPROVIDED);
                    SubLObject current = datum;
                    SubLObject arg1 = NIL;
                    SubLObject arg2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    arg2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return makeBoolean((NIL != isa.isaP(arg1, arg2, mt, UNPROVIDED)) || (NIL != at_defns.defns_admitP(arg2, arg1, mt)));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            } else {
                if (pcase_var.eql($$genls)) {
                    {
                        SubLObject datum = literal_args(gaf, UNPROVIDED);
                        SubLObject current = datum;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt30);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt30);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            return genls.genlsP(arg1, arg2, mt, UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt30);
                        }
                    }
                } else {
                    {
                        SubLObject v_arity = literal_arity(gaf, UNPROVIDED);
                        SubLObject pcase_var_4 = v_arity;
                        if (pcase_var_4.eql(TWO_INTEGER)) {
                            {
                                SubLObject datum = literal_args(gaf, UNPROVIDED);
                                SubLObject current = datum;
                                SubLObject arg1 = NIL;
                                SubLObject arg2 = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt30);
                                arg1 = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt30);
                                arg2 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (arg1.equal(arg2)) {
                                        if (NIL != kb_accessors.reflexive_predicateP(predicate)) {
                                            return T;
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt30);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject true_gaf_trivially_derivable(final SubLObject gaf, final SubLObject mt) {
        final SubLObject pcase_var;
        final SubLObject predicate = pcase_var = literal_predicate(gaf, UNPROVIDED);
        if (pcase_var.eql($$isa)) {
            SubLObject current;
            final SubLObject datum = current = literal_args(gaf, UNPROVIDED);
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list43);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list43);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((NIL != isa.isaP(arg1, arg2, mt, UNPROVIDED)) || (NIL != at_defns.defns_admitP(arg2, arg1, mt)));
            }
            cdestructuring_bind_error(datum, $list43);
        } else
            if (pcase_var.eql($$genls)) {
                SubLObject current;
                final SubLObject datum = current = literal_args(gaf, UNPROVIDED);
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list43);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list43);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    return genls.genlsP(arg1, arg2, mt, UNPROVIDED);
                }
                cdestructuring_bind_error(datum, $list43);
            } else {
                final SubLObject pcase_var_$15;
                final SubLObject v_arity = pcase_var_$15 = literal_arity(gaf, UNPROVIDED);
                if (pcase_var_$15.eql(TWO_INTEGER)) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = literal_args(gaf, UNPROVIDED);
                    SubLObject arg3 = NIL;
                    SubLObject arg4 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list43);
                    arg3 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list43);
                    arg4 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        if (arg3.equal(arg4) && (NIL != kb_accessors.reflexive_predicateP(predicate))) {
                            return T;
                        }
                    } else {
                        cdestructuring_bind_error(datum2, $list43);
                    }
                }
            }

        return NIL;
    }

    public static final SubLObject false_gaf_trivially_derivable_alt(SubLObject gaf, SubLObject mt) {
        return NIL;
    }

    public static SubLObject false_gaf_trivially_derivable(final SubLObject gaf, final SubLObject mt) {
        return NIL;
    }

    /**
     * Check that all the supports of all the deductions supporting ASSERTION are still true.
     * Remove any deduction whose supports are now stale.
     */
    @LispMethod(comment = "Check that all the supports of all the deductions supporting ASSERTION are still true.\r\nRemove any deduction whose supports are now stale.\nCheck that all the supports of all the deductions supporting ASSERTION are still true.\nRemove any deduction whose supports are now stale.")
    public static final SubLObject tms_reconsider_assertion_deductions_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject deduction = NIL;
            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                if (NIL != valid_deductionP(deduction, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.tms.tms_reconsider_deduction(deduction);
                }
            }
        }
        return assertion;
    }

    /**
     * Check that all the supports of all the deductions supporting ASSERTION are still true.
     * Remove any deduction whose supports are now stale.
     */
    @LispMethod(comment = "Check that all the supports of all the deductions supporting ASSERTION are still true.\r\nRemove any deduction whose supports are now stale.\nCheck that all the supports of all the deductions supporting ASSERTION are still true.\nRemove any deduction whose supports are now stale.")
    public static SubLObject tms_reconsider_assertion_deductions(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject deduction = NIL;
        deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.valid_deductionP(deduction, UNPROVIDED)) {
                tms_reconsider_deduction(deduction);
            }
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        } 
        return assertion;
    }

    /**
     * Check that all the deductions involving ASSERTION are still true.
     * Remove any deduction whose supports are now stale.
     */
    @LispMethod(comment = "Check that all the deductions involving ASSERTION are still true.\r\nRemove any deduction whose supports are now stale.\nCheck that all the deductions involving ASSERTION are still true.\nRemove any deduction whose supports are now stale.")
    public static final SubLObject tms_reconsider_assertion_dependents_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
            SubLObject deduction = NIL;
            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                if (NIL != valid_deductionP(deduction, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.tms.tms_reconsider_deduction(deduction);
                }
            }
        }
        return assertion;
    }

    /**
     * Check that all the deductions involving ASSERTION are still true.
     * Remove any deduction whose supports are now stale.
     */
    @LispMethod(comment = "Check that all the deductions involving ASSERTION are still true.\r\nRemove any deduction whose supports are now stale.\nCheck that all the deductions involving ASSERTION are still true.\nRemove any deduction whose supports are now stale.")
    public static SubLObject tms_reconsider_assertion_dependents(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, deduction)) && (NIL != deduction_handles.valid_deductionP(deduction, UNPROVIDED))) {
                tms_reconsider_deduction(deduction);
            }
        }
        return assertion;
    }

    /**
     * Check that all the supports of DEDUCTION are still true.
     * Remove DEDUCTION if any are now stale.
     * If the supports are ok, check that the TV is still OK.
     * Return T iff the assertion of DEDUCTION got removed as part of this checking.
     */
    @LispMethod(comment = "Check that all the supports of DEDUCTION are still true.\r\nRemove DEDUCTION if any are now stale.\r\nIf the supports are ok, check that the TV is still OK.\r\nReturn T iff the assertion of DEDUCTION got removed as part of this checking.\nCheck that all the supports of DEDUCTION are still true.\nRemove DEDUCTION if any are now stale.\nIf the supports are ok, check that the TV is still OK.\nReturn T iff the assertion of DEDUCTION got removed as part of this checking.")
    public static final SubLObject tms_reconsider_deduction_alt(SubLObject deduction) {
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        if (NIL != deductions_high.skolem_deduction_p(deduction)) {
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.tms.tms_deduction_stale_wrt_supportsP(deduction)) {
                return com.cyc.cycjava.cycl.tms.tms_remove_deduction(deduction);
            } else {
                if (NIL != com.cyc.cycjava.cycl.tms.tms_deduction_stale_wrt_exceptionsP(deduction)) {
                    return com.cyc.cycjava.cycl.tms.tms_remove_deduction(deduction);
                } else {
                    com.cyc.cycjava.cycl.tms.tms_recompute_deduction_tv(deduction);
                    return NIL;
                }
            }
        }
    }

    /**
     * Check that all the supports of DEDUCTION are still true.
     * Remove DEDUCTION if any are now stale.
     * If the supports are ok, check that the TV is still OK.
     * Return T iff the assertion of DEDUCTION got removed as part of this checking.
     */
    @LispMethod(comment = "Check that all the supports of DEDUCTION are still true.\r\nRemove DEDUCTION if any are now stale.\r\nIf the supports are ok, check that the TV is still OK.\r\nReturn T iff the assertion of DEDUCTION got removed as part of this checking.\nCheck that all the supports of DEDUCTION are still true.\nRemove DEDUCTION if any are now stale.\nIf the supports are ok, check that the TV is still OK.\nReturn T iff the assertion of DEDUCTION got removed as part of this checking.")
    public static SubLObject tms_reconsider_deduction(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        if (NIL != deductions_high.skolem_deduction_p(deduction)) {
            return NIL;
        }
        if (NIL != tms_deduction_stale_wrt_supportsP(deduction)) {
            return tms_explicitly_remove_deduction_for_assertion(deduction);
        }
        if (NIL != tms_deduction_stale_wrt_exceptionsP(deduction)) {
            return tms_explicitly_remove_deduction_for_assertion(deduction);
        }
        tms_recompute_deduction_tv(deduction);
        return NIL;
    }

    public static final SubLObject tms_deduction_stale_wrt_supportsP_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject liftingP = deductions_high.lifting_deduction_p(deduction);
                SubLObject deduction_mt = deductions_high.deduction_mt(deduction);
                SubLObject staleP = NIL;
                {
                    SubLObject _prev_bind_0 = $perform_opaque_support_verification$.currentBinding(thread);
                    try {
                        $perform_opaque_support_verification$.bind(T, thread);
                        {
                            SubLObject rest = NIL;
                            for (rest = deductions_high.deduction_supports(deduction); !((NIL != staleP) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject support = rest.first();
                                    if ((NIL != com.cyc.cycjava.cycl.tms.stale_support(support)) || ((NIL == liftingP) && (NIL != com.cyc.cycjava.cycl.tms.stale_support_mtP(support, deduction_mt)))) {
                                        staleP = T;
                                    }
                                }
                            }
                        }
                    } finally {
                        $perform_opaque_support_verification$.rebind(_prev_bind_0, thread);
                    }
                }
                return staleP;
            }
        }
    }

    public static SubLObject tms_deduction_stale_wrt_supportsP(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == deduction_handles.valid_deductionP(deduction, T)) {
            return T;
        }
        final SubLObject liftingP = deductions_high.lifting_deduction_p(deduction);
        final SubLObject deduction_mt = deductions_high.deduction_mt(deduction);
        SubLObject staleP = NIL;
        final SubLObject _prev_bind_0 = hl_supports.$perform_opaque_support_verification$.currentBinding(thread);
        try {
            hl_supports.$perform_opaque_support_verification$.bind(T, thread);
            SubLObject rest;
            SubLObject support;
            for (rest = NIL, rest = deductions_high.deduction_supports(deduction); (NIL == staleP) && (NIL != rest); rest = rest.rest()) {
                support = rest.first();
                if ((NIL != stale_support(support)) || ((NIL == liftingP) && (NIL != stale_support_mtP(support, deduction_mt)))) {
                    staleP = T;
                }
            }
        } finally {
            hl_supports.$perform_opaque_support_verification$.rebind(_prev_bind_0, thread);
        }
        return staleP;
    }

    /**
     * Find all reasons to believe the sentence of the assertion of DEDUCTION,
     * filter out those which are just lookup of the assertion itself, and if
     * there are no remaining reasons to believe it, return T, otherwise
     * conservatively return NIL.
     *
     * @unknown this could conceivably return T for reasons other than an exception.
     */
    @LispMethod(comment = "Find all reasons to believe the sentence of the assertion of DEDUCTION,\r\nfilter out those which are just lookup of the assertion itself, and if\r\nthere are no remaining reasons to believe it, return T, otherwise\r\nconservatively return NIL.\r\n\r\n@unknown this could conceivably return T for reasons other than an exception.\nFind all reasons to believe the sentence of the assertion of DEDUCTION,\nfilter out those which are just lookup of the assertion itself, and if\nthere are no remaining reasons to believe it, return T, otherwise\nconservatively return NIL.")
    public static final SubLObject tms_deduction_stale_wrt_exceptionsP_alt(SubLObject deduction) {
        {
            SubLObject old_supports = deductions_high.deduction_supports(deduction);
            SubLObject rules = remove_if_not($sym32$RULE_ASSERTION_, old_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != find_if($sym33$RULE_HAS_EXCEPTIONS_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find_if($sym34$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                {
                    SubLObject assertion = deductions_high.deduction_assertion(deduction);
                    SubLObject pred = formula_operator(assertions_high.assertion_formula(assertion));
                    SubLObject sentence = com.cyc.cycjava.cycl.tms.tms_reprove_deduction_query_sentence(assertion);
                    SubLObject mt = com.cyc.cycjava.cycl.tms.tms_reprove_deduction_query_mt(deduction);
                    SubLObject truth = deductions_high.deduction_truth(deduction);
                    SubLObject v_properties = com.cyc.cycjava.cycl.tms.tms_reprove_deduction_query_properties(sentence, mt, pred, truth, rules);
                    SubLObject justifications = inference_kernel.new_cyc_query(sentence, mt, v_properties);
                    SubLObject filtered_justifications = NIL;
                    SubLObject cdolist_list_var = justifications;
                    SubLObject justification = NIL;
                    for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                        if (NIL == subl_promotions.memberP(assertion, justification, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == fast_set_difference(rules, justification, UNPROVIDED)) {
                                filtered_justifications = cons(justification, filtered_justifications);
                            }
                        }
                    }
                    filtered_justifications = nreverse(filtered_justifications);
                    if (NIL == filtered_justifications) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Find all reasons to believe the sentence of the assertion of DEDUCTION,
     * filter out those which are just lookup of the assertion itself, and if
     * there are no remaining reasons to believe it, return T, otherwise
     * conservatively return NIL.
     *
     * @unknown this could conceivably return T for reasons other than an exception.
     */
    @LispMethod(comment = "Find all reasons to believe the sentence of the assertion of DEDUCTION,\r\nfilter out those which are just lookup of the assertion itself, and if\r\nthere are no remaining reasons to believe it, return T, otherwise\r\nconservatively return NIL.\r\n\r\n@unknown this could conceivably return T for reasons other than an exception.\nFind all reasons to believe the sentence of the assertion of DEDUCTION,\nfilter out those which are just lookup of the assertion itself, and if\nthere are no remaining reasons to believe it, return T, otherwise\nconservatively return NIL.")
    public static SubLObject tms_deduction_stale_wrt_exceptionsP(final SubLObject deduction) {
        final SubLObject old_supports = deductions_high.deduction_supports(deduction);
        final SubLObject rules = list_utilities.remove_if_not($sym45$RULE_ASSERTION_, old_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == find_if($sym46$RULE_HAS_EXCEPTIONS_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if($sym47$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL != deductions_high.deduction_bindings(deduction)) {
            return tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version(deduction);
        }
        if (NIL != find_if($sym48$LIFTING_RULE_, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return tms_deduction_stale_wrt_exceptionsP_lifting_rule_version(deduction);
        }
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        final SubLObject pred = cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion));
        if (NIL != inference_trampolines.inference_backchain_forbiddenP(pred, assertions_high.assertion_mt(assertion))) {
            return tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version(deduction);
        }
        return tms_deduction_stale_wrt_exceptionsP_query_version(deduction);
    }

    public static SubLObject tms_deduction_stale_wrt_exceptionsP_lifting_rule_version(final SubLObject deduction) {
        return tms_deduction_stale_wrt_exceptionsP_general_version(deduction);
    }

    public static SubLObject tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptionsP_general_versionP$.getDynamicValue(thread)) {
            return tms_deduction_stale_wrt_exceptionsP_general_version(deduction);
        }
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        final SubLObject pred = cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion));
        SubLObject result = NIL;
        if ((NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$.getDynamicValue(thread)) && (NIL != memoization_state.current_memoization_state())) {
            memoization_state.caching_state_clear(memoization_state.memoization_state_get_caching_state_for_function(memoization_state.current_memoization_state(), $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_));
        }
        final SubLObject _prev_bind_0 = kb_accessors.$suppress_backchain_forbidden_preds$.currentBinding(thread);
        try {
            kb_accessors.$suppress_backchain_forbidden_preds$.bind(NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$.getDynamicValue(thread) ? list(pred) : NIL, thread);
            result = tms_deduction_stale_wrt_exceptionsP_query_version(deduction);
            if ((NIL != $use_backchain_forbidden_deduction_stale_wrt_exceptions_hackP$.getDynamicValue(thread)) && (NIL != memoization_state.current_memoization_state())) {
                memoization_state.caching_state_clear(memoization_state.memoization_state_get_caching_state_for_function(memoization_state.current_memoization_state(), $sym49$INFERENCE_BACKCHAIN_FORBIDDEN_));
            }
            return result;
        } finally {
            kb_accessors.$suppress_backchain_forbidden_preds$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject tms_deduction_stale_wrt_exceptionsP_query_version(final SubLObject deduction) {
        final SubLObject old_supports = deductions_high.deduction_supports(deduction);
        final SubLObject rules = list_utilities.remove_if_not($sym45$RULE_ASSERTION_, old_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        final SubLObject pred = cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion));
        final SubLObject sentence = tms_reprove_deduction_query_sentence(assertion);
        final SubLObject mt = tms_reprove_deduction_query_mt(deduction);
        final SubLObject truth = deductions_high.deduction_truth(deduction);
        final SubLObject v_properties = tms_reprove_deduction_query_properties(sentence, mt, pred, truth, rules);
        final SubLObject justifications = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        SubLObject filtered_justifications = NIL;
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == list_utilities.member_kbeqP(assertion, justification)) && (NIL == list_utilities.fast_set_difference(rules, justification, UNPROVIDED))) {
                filtered_justifications = cons(justification, filtered_justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        filtered_justifications = nreverse(filtered_justifications);
        if (NIL == filtered_justifications) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject tms_reprove_deduction_query_sentence_alt(SubLObject assertion) {
        {
            SubLObject formula = assertions_high.assertion_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject pred = formula_operator(formula);
            SubLObject query_sentence = NIL;
            if (NIL != inference_backchain_forbiddenP(pred, mt)) {
                {
                    SubLObject args = formula_args(formula, UNPROVIDED);
                    SubLObject new_pred_var = $sym35$_PRED;
                    SubLObject antecedent = make_binary_formula($$genlPreds, pred, new_pred_var);
                    SubLObject consequent = make_formula(new_pred_var, args, UNPROVIDED);
                    query_sentence = make_binary_formula($$implies, antecedent, consequent);
                }
            } else {
                query_sentence = formula;
            }
            return query_sentence;
        }
    }

    public static SubLObject tms_reprove_deduction_query_sentence(final SubLObject assertion) {
        final SubLObject formula = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject pred = cycl_utilities.formula_operator(formula);
        SubLObject query_sentence = NIL;
        if (NIL != inference_trampolines.inference_backchain_forbiddenP(pred, mt)) {
            final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            final SubLObject new_pred_var = $sym51$_PRED;
            final SubLObject antecedent = make_binary_formula($$genlPreds, pred, new_pred_var);
            final SubLObject consequent = make_formula(new_pred_var, args, UNPROVIDED);
            query_sentence = make_binary_formula($$implies, antecedent, consequent);
        } else {
            query_sentence = formula;
        }
        return query_sentence;
    }

    public static final SubLObject tms_reprove_deduction_query_mt_alt(SubLObject deduction) {
        {
            SubLObject assertion = deductions_high.deduction_assertion(deduction);
            if (NIL != kb_accessors.decontextualized_assertionP(assertion)) {
                return $$InferencePSC;
            } else {
                return deductions_high.deduction_mt(deduction);
            }
        }
    }

    public static SubLObject tms_reprove_deduction_query_mt(final SubLObject deduction) {
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        if (NIL != kb_accessors.decontextualized_assertionP(supported_object)) {
            return $$InferencePSC;
        }
        return deductions_high.deduction_mt(deduction);
    }

    public static final SubLObject tms_reprove_deduction_query_properties_alt(SubLObject sentence, SubLObject mt, SubLObject predicate, SubLObject truth, SubLObject rules) {
        {
            SubLObject rule_count = length(rules);
            SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(sentence);
            SubLObject allow_unbound_predicate_transformationP = sublisp_boolean(find_if(UNBOUND_PREDICATE_RULE_P, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject allow_evaluatable_predicate_transformationP = makeBoolean(rule_count.isPositive() && ((NIL != relation_evaluation.evaluatable_predicateP(predicate, mt)) || rule_count.numG(ONE_INTEGER)));
            SubLObject allow_hl_predicate_transformationP = makeBoolean(rule_count.isPositive() && ((NIL != hl_predicate_p(predicate)) || rule_count.numG(ONE_INTEGER)));
            return list(new SubLObject[]{ $ALLOWED_RULES, rules, $kw41$CONDITIONAL_SENTENCE_, conditional_sentenceP, $MAX_TRANSFORMATION_DEPTH, rule_count, $RESULT_UNIQUENESS, $PROOF, $RETURN, $SUPPORTS, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, NIL, $PRODUCTIVITY_LIMIT, $POSITIVE_INFINITY, $kw52$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, allow_unbound_predicate_transformationP, $kw53$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, allow_evaluatable_predicate_transformationP, $kw54$ALLOW_HL_PREDICATE_TRANSFORMATION_, allow_hl_predicate_transformationP });
        }
    }

    public static SubLObject tms_reprove_deduction_query_properties(final SubLObject sentence, final SubLObject mt, final SubLObject predicate, final SubLObject truth, final SubLObject rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_count = length(rules);
        final SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(sentence);
        final SubLObject allow_unbound_predicate_transformationP = list_utilities.sublisp_boolean(find_if(UNBOUND_PREDICATE_RULE_P, rules, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject allow_evaluatable_predicate_transformationP = makeBoolean(rule_count.isPositive() && ((NIL != relation_evaluation.evaluatable_predicateP(predicate, mt)) || rule_count.numG(ONE_INTEGER)));
        final SubLObject allow_hl_predicate_transformationP = makeBoolean(rule_count.isPositive() && ((NIL != hl_supports.hl_predicate_p(predicate)) || rule_count.numG(ONE_INTEGER)));
        SubLObject productivity_limit = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rule_productivity_limit = forward.rule_forward_inference_productivity_limit(rule);
            if (rule_productivity_limit.isNumber() && ((NIL == productivity_limit) || rule_productivity_limit.numG(productivity_limit))) {
                productivity_limit = rule_productivity_limit;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        if (NIL == productivity_limit) {
            productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff($forward_inference_removal_cost_cutoff$.getDynamicValue(thread));
        }
        return list(new SubLObject[]{ $ALLOWED_RULES, rules, $kw57$CONDITIONAL_SENTENCE_, conditional_sentenceP, $MAX_TRANSFORMATION_DEPTH, rule_count, $RESULT_UNIQUENESS, $PROOF, $RETURN, $SUPPORTS, $ANSWER_LANGUAGE, $HL, $CONTINUABLE_, NIL, $PRODUCTIVITY_LIMIT, productivity_limit, $kw67$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, allow_unbound_predicate_transformationP, $kw68$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, allow_evaluatable_predicate_transformationP, $kw69$ALLOW_HL_PREDICATE_TRANSFORMATION_, allow_hl_predicate_transformationP });
    }

    public static SubLObject tms_deduction_stale_wrt_exceptionsP_general_version(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_transformation.supports_contain_excepted_assertion_in_mtP(deductions_high.deduction_supports(deduction), deductions_high.deduction_mt(deduction), UNPROVIDED)) {
            return T;
        }
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject assertion = deductions_high.deduction_supported_object(deduction);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.warn($str70$_tms_deduction_stale_wrt_exceptio, deduction_handles.deduction_id(deduction));
            return NIL;
        }
        final SubLObject rule = find_if(symbol_function($sym45$RULE_ASSERTION_), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject trigger_gaf = forward_rule_propagation.first_gaf_in_supports(remove_if(symbol_function($sym45$RULE_ASSERTION_), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL == trigger_gaf) {
            Errors.warn($str71$_tms_deduction_stale_wrt_exceptio, deduction_handles.deduction_id(deduction), deductions_high.deduction_supported_object(deduction));
            return NIL;
        }
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $prefer_forward_skolemization$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
            $prefer_forward_skolemization$.bind(NIL, thread);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
            final SubLObject _prev_bind_0_$16 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_1_$17 = $current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                $current_forward_problem_store$.bind(NIL, thread);
                try {
                    final SubLObject assertibles_queue = compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version(trigger_gaf, rule);
                    SubLObject not_staleP;
                    SubLObject rest;
                    SubLObject hl_assertible_var;
                    SubLObject assertible;
                    SubLObject argument_spec;
                    SubLObject hl_assertion_spec_var_$18;
                    SubLObject hl_assertion_spec_var;
                    SubLObject cnf;
                    SubLObject mt;
                    SubLObject direction;
                    SubLObject variable_map;
                    for (not_staleP = NIL, rest = NIL, rest = queues.do_queue_elements_queue_elements(assertibles_queue); (NIL == not_staleP) && (NIL != rest); rest = rest.rest()) {
                        assertible = hl_assertible_var = rest.first();
                        argument_spec = hl_storage_modules.hl_assertible_argument_spec(hl_assertible_var);
                        hl_assertion_spec_var = hl_assertion_spec_var_$18 = hl_storage_modules.hl_assertible_hl_assertion_spec(hl_assertible_var);
                        cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$18);
                        mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$18);
                        direction = hl_storage_modules.hl_assertion_spec_direction(hl_assertion_spec_var_$18);
                        variable_map = hl_storage_modules.hl_assertion_spec_variable_map(hl_assertion_spec_var_$18);
                        if (uncanonicalizer.assertion_el_formula(assertion).equal(uncanonicalizer.cnf_el_formula(cnf, UNPROVIDED, UNPROVIDED)) && assertions_high.assertion_mt(assertion).equal(mt)) {
                            not_staleP = T;
                        }
                    }
                    return makeBoolean(NIL == not_staleP);
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        forward.clear_current_forward_problem_store();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            } finally {
                $current_forward_problem_store$.rebind(_prev_bind_1_$17, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$16, thread);
            }
        } finally {
            $prefer_forward_skolemization$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(makeSymbol("*TMS-ASSERTIONS-BEING-REMOVED*"));

    public static SubLObject compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version(final SubLObject trigger_gaf, final SubLObject rule) {
        return forward.forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(trigger_gaf, rule);
    }

    static private final SubLList $list_alt7 = list(list(makeSymbol("DEDUCTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(makeSymbol("*TMS-DEDUCTIONS-BEING-REMOVED*"));

    public static SubLObject tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version(final SubLObject deduction) {
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject pragma_mts = deductions_high.deduction_pragmatic_support_mts(deduction);
        final SubLObject v_bindings = deductions_high.deduction_bindings(deduction);
        final SubLObject rule = find_if($sym45$RULE_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject mt = deductions_high.deduction_mt(deduction);
        if (NIL == rule) {
            Errors.warn($str73$Found_deduction__A_supporting_wit, deduction, deductions_high.deduction_supported_object(deduction));
            return NIL;
        }
        if (NIL != indexing_utilities.rule_with_some_pragmatic_somewhereP(rule)) {
            final SubLObject query_dnf = bindings.apply_bindings(v_bindings, inference_worker_transformation.forward_rule_pragmatic_dnf(rule, mt));
            if (NIL == inference_kernel.new_cyc_query_from_dnf(query_dnf, mt, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        if (NIL != abnormal.rule_has_exceptionsP(rule)) {
            final SubLObject store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
            final SubLObject abnormalP = abnormal.rule_bindings_abnormalP(store, rule, v_bindings, mt);
            inference_datastructures_problem_store.destroy_problem_store(store);
            if (NIL != abnormalP) {
                return T;
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt21$do_broad_mt_index = makeString("do-broad-mt-index");

    static private final SubLString $str_alt28$_S_was_not_an_atomic_CNF_ = makeString("~S was not an atomic CNF.");

    static private final SubLList $list_alt30 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLSymbol $sym32$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    static private final SubLSymbol $sym33$RULE_HAS_EXCEPTIONS_ = makeSymbol("RULE-HAS-EXCEPTIONS?");

    static private final SubLSymbol $sym34$RULE_WITH_SOME_PRAGMATIC_SOMEWHERE_ = makeSymbol("RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?");

    static private final SubLSymbol $sym35$_PRED = makeSymbol("?PRED");

    /**
     * Check the arguments of ASSERTION to make sure they are still true.
     * Return T iff ASSERTION got removed from the KB as a result of this checking.
     */
    @LispMethod(comment = "Check the arguments of ASSERTION to make sure they are still true.\r\nReturn T iff ASSERTION got removed from the KB as a result of this checking.\nCheck the arguments of ASSERTION to make sure they are still true.\nReturn T iff ASSERTION got removed from the KB as a result of this checking.")
    public static final SubLObject tms_reconsider_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
            if (NIL != v_arguments) {
                {
                    SubLObject removed = NIL;
                    if (NIL == removed) {
                        {
                            SubLObject csome_list_var = v_arguments;
                            SubLObject argument = NIL;
                            for (argument = csome_list_var.first(); !((NIL != removed) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , argument = csome_list_var.first()) {
                                if (NIL != deduction_p(argument)) {
                                    removed = com.cyc.cycjava.cycl.tms.tms_reconsider_deduction(argument);
                                }
                            }
                        }
                    }
                    return removed;
                }
            } else {
                com.cyc.cycjava.cycl.tms.tms_remove_assertion(assertion);
                return T;
            }
        }
    }

    /**
     * Check the arguments of ASSERTION to make sure they are still true.
     * Return T iff ASSERTION got removed from the KB as a result of this checking.
     */
    @LispMethod(comment = "Check the arguments of ASSERTION to make sure they are still true.\r\nReturn T iff ASSERTION got removed from the KB as a result of this checking.\nCheck the arguments of ASSERTION to make sure they are still true.\nReturn T iff ASSERTION got removed from the KB as a result of this checking.")
    public static SubLObject tms_reconsider_assertion(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        if (NIL != v_arguments) {
            SubLObject removed = NIL;
            if (NIL == removed) {
                SubLObject csome_list_var = v_arguments;
                SubLObject argument = NIL;
                argument = csome_list_var.first();
                while ((NIL == removed) && (NIL != csome_list_var)) {
                    if (NIL != deduction_handles.deduction_p(argument)) {
                        removed = tms_reconsider_deduction(argument);
                    }
                    csome_list_var = csome_list_var.rest();
                    argument = csome_list_var.first();
                } 
            }
            return removed;
        }
        tms_remove_assertion(assertion);
        return T;
    }

    public static final SubLSymbol $kw41$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    public static final SubLSymbol $kw52$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw53$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw54$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    static private final SubLString $str_alt55$Performing_full_TMS_on_mt__S = makeString("Performing full TMS on mt ~S");

    /**
     * Perform full TMS on all assertions in MT
     */
    @LispMethod(comment = "Perform full TMS on all assertions in MT")
    public static final SubLObject tms_reconsider_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(mt, HLMT_P);
            {
                SubLObject monad_mt = hlmt_monad_mt(mt);
                if (NIL != kb_indexing.broad_mtP(monad_mt)) {
                    {
                        SubLObject idx = assertion_handles.do_assertions_table();
                        SubLObject mess = format(NIL, $str_alt55$Performing_full_TMS_on_mt__S, mt);
                        SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType(mess, STRINGP);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble(mess);
                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject assertion = NIL;
                                        while (NIL != id) {
                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                                                    com.cyc.cycjava.cycl.tms.tms_reconsider_assertion(assertion);
                                                }
                                            }
                                            id = do_id_index_next_id(idx, T, id, state_var);
                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            kb_mapping.map_mt_index(TMS_RECONSIDER_ASSERTION, monad_mt, NIL, NIL);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Perform full TMS on all assertions in MT
     */
    @LispMethod(comment = "Perform full TMS on all assertions in MT")
    public static SubLObject tms_reconsider_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        if (NIL != kb_indexing.broad_mtP(monad_mt)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = format(NIL, $str74$Performing_full_TMS_on_mt__S, mt);
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$20 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$20, $SKIP)) {
                        final SubLObject idx_$21 = idx_$20;
                        if (NIL == id_index_dense_objects_empty_p(idx_$21, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$21);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt)) {
                                        tms_reconsider_assertion(assertion);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$22 = idx_$20;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$22)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$22);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$22);
                            final SubLObject end_id = id_index_next_id(idx_$22);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(assertion2), mt)) {
                                        tms_reconsider_assertion(assertion2);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_mt_index(TMS_RECONSIDER_ASSERTION, monad_mt, NIL, NIL);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_6, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str_alt63$Removing_circularly_supported_ass = makeString("Removing circularly supported assertions");

    static private final SubLString $str_alt64$_____S_circularly_supported_asser = makeString("~%~%~S circularly supported assertions removed");

    static private final SubLString $str_alt65$__Removing__S = makeString("~%Removing ~S");

    public static final SubLObject tms_reconsider_term_gafs_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_term_gafs(TMS_RECONSIDER_ASSERTION, v_term, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        kb_mapping.map_term_gafs(TMS_RECONSIDER_ASSERTION, v_term, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject tms_reconsider_term_gafs(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_term_gafs(TMS_RECONSIDER_ASSERTION, v_term, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_term_gafs(TMS_RECONSIDER_ASSERTION, v_term, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Perform full TMS on all gaf assertions whose predicate is PRED
     */
    @LispMethod(comment = "Perform full TMS on all gaf assertions whose predicate is PRED")
    public static final SubLObject tms_reconsider_predicate_extent_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt) {
                kb_mapping.map_predicate_extent_index(TMS_RECONSIDER_ASSERTION, pred, NIL, mt);
            } else {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        kb_mapping.map_predicate_extent_index(TMS_RECONSIDER_ASSERTION, pred, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Perform full TMS on all gaf assertions whose predicate is PRED
     */
    @LispMethod(comment = "Perform full TMS on all gaf assertions whose predicate is PRED")
    public static SubLObject tms_reconsider_predicate_extent(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt) {
            kb_mapping.map_predicate_extent_index(TMS_RECONSIDER_ASSERTION, pred, NIL, mt);
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_predicate_extent_index(TMS_RECONSIDER_ASSERTION, pred, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Perform full TMS on all gaf assertions indexed via TERM under ARG PREDICATE MT
     */
    @LispMethod(comment = "Perform full TMS on all gaf assertions indexed via TERM under ARG PREDICATE MT")
    public static final SubLObject tms_reconsider_gaf_args_alt(SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt) {
                kb_mapping.map_gaf_arg_index(TMS_RECONSIDER_ASSERTION, v_term, arg, predicate, NIL, mt);
            } else {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        kb_mapping.map_gaf_arg_index(TMS_RECONSIDER_ASSERTION, v_term, arg, predicate, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Perform full TMS on all gaf assertions indexed via TERM under ARG PREDICATE MT
     */
    @LispMethod(comment = "Perform full TMS on all gaf assertions indexed via TERM under ARG PREDICATE MT")
    public static SubLObject tms_reconsider_gaf_args(final SubLObject v_term, final SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt) {
            kb_mapping.map_gaf_arg_index(TMS_RECONSIDER_ASSERTION, v_term, arg, predicate, NIL, mt);
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_gaf_arg_index(TMS_RECONSIDER_ASSERTION, v_term, arg, predicate, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Perform full TMS on all assertions involving TERM indexed via MT
     * If MT is nil, all mts are used
     */
    @LispMethod(comment = "Perform full TMS on all assertions involving TERM indexed via MT\r\nIf MT is nil, all mts are used\nPerform full TMS on all assertions involving TERM indexed via MT\nIf MT is nil, all mts are used")
    public static final SubLObject tms_reconsider_term_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mt) {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_term(TMS_RECONSIDER_ASSERTION, v_term);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        kb_mapping.map_term(TMS_RECONSIDER_ASSERTION, v_term);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Perform full TMS on all assertions involving TERM indexed via MT
     * If MT is nil, all mts are used
     */
    @LispMethod(comment = "Perform full TMS on all assertions involving TERM indexed via MT\r\nIf MT is nil, all mts are used\nPerform full TMS on all assertions involving TERM indexed via MT\nIf MT is nil, all mts are used")
    public static SubLObject tms_reconsider_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_term(TMS_RECONSIDER_ASSERTION, v_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_term(TMS_RECONSIDER_ASSERTION, v_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject tms_reconsider_all_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total_5 = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Reconsidering_assertion_arguments, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$Reconsidering_assertion_arguments);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while (NIL != id) {
                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        note_percent_progress(sofar, total_5);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != com.cyc.cycjava.cycl.tms.tms_reconsider_assertion(assertion)) {
                                            total = add(total, ONE_INTEGER);
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject tms_reconsider_all_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Reconsidering_assertion_arguments;
        final SubLObject total_$24 = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$25 = idx;
                if (NIL == id_index_objects_empty_p(idx_$25, $SKIP)) {
                    final SubLObject idx_$26 = idx_$25;
                    if (NIL == id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$26);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != tms_reconsider_assertion(assertion)) {
                                    total = add(total, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total_$24);
                            }
                        }
                    }
                    final SubLObject idx_$27 = idx_$25;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$27)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$27);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$27);
                        final SubLObject end_id = id_index_next_id(idx_$27);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != tms_reconsider_assertion(assertion2)) {
                                    total = add(total, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total_$24);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    /**
     * Return T iff SUPPORT is no longer true.
     */
    @LispMethod(comment = "Return T iff SUPPORT is no longer true.")
    public static final SubLObject stale_support_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return makeBoolean((NIL == assertion_el_formula(support)) || (NIL == assertions_high.valid_assertion(support, UNPROVIDED)));
        } else {
            if (NIL != kb_hl_supports.kb_hl_support_p(support)) {
                return makeBoolean(NIL == kb_hl_supports.verify_kb_hl_support(support));
            } else {
                return makeBoolean(NIL == hl_verify(support));
            }
        }
    }

    /**
     * Return T iff SUPPORT is no longer true.
     */
    @LispMethod(comment = "Return T iff SUPPORT is no longer true.")
    public static SubLObject stale_support(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        if (NIL != assertion_handles.assertion_p(support)) {
            return makeBoolean((NIL == uncanonicalizer.assertion_el_formula(support)) || (NIL == assertions_high.valid_assertion(support, UNPROVIDED)));
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return makeBoolean(NIL == kb_hl_supports_high.verify_kb_hl_support(support));
        }
        return makeBoolean(NIL == hl_supports.hl_verify(support));
    }

    /**
     * Return T iff the mt of SUPPORT is no longer visible from DEDUCTION-MT.
     */
    @LispMethod(comment = "Return T iff the mt of SUPPORT is no longer visible from DEDUCTION-MT.")
    public static final SubLObject stale_support_mtP_alt(SubLObject support, SubLObject deduction_mt) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.tms.support_mt_okP(support, deduction_mt));
    }

    /**
     * Return T iff the mt of SUPPORT is no longer visible from DEDUCTION-MT.
     */
    @LispMethod(comment = "Return T iff the mt of SUPPORT is no longer visible from DEDUCTION-MT.")
    public static SubLObject stale_support_mtP(final SubLObject support, final SubLObject deduction_mt) {
        return makeBoolean(NIL == support_mt_okP(support, deduction_mt));
    }

    /**
     * Return T iff the mt of SUPPORT is (still) visible from DEDUCTION-MT.
     */
    @LispMethod(comment = "Return T iff the mt of SUPPORT is (still) visible from DEDUCTION-MT.")
    public static final SubLObject support_mt_okP_alt(SubLObject support, SubLObject deduction_mt) {
        {
            SubLObject support_mt = support_mt(support);
            SubLObject pcase_var = support_mt;
            if (pcase_var.eql($$InferencePSC) || pcase_var.eql($$EverythingPSC)) {
                return T;
            } else {
                return genl_mtP(deduction_mt, support_mt, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    /**
     * Return T iff the mt of SUPPORT is (still) visible from DEDUCTION-MT.
     */
    @LispMethod(comment = "Return T iff the mt of SUPPORT is (still) visible from DEDUCTION-MT.")
    public static SubLObject support_mt_okP(final SubLObject support, final SubLObject deduction_mt) {
        final SubLObject pcase_var;
        final SubLObject support_mt = pcase_var = arguments.support_mt(support);
        if (pcase_var.eql($$InferencePSC) || pcase_var.eql($$EverythingPSC)) {
            return T;
        }
        return genl_mts.genl_mtP(deduction_mt, support_mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list of deduction-p;
    Returns a list of the deductions supporting ASSERTION such that :
    The deduction contains a support which is a rule
    which has some relevant #$pragmaticRequirement
    that mentions #$assertedMoreSpecifically
     */
    @LispMethod(comment = "@return list of deduction-p;\r\nReturns a list of the deductions supporting ASSERTION such that :\r\nThe deduction contains a support which is a rule\r\nwhich has some relevant #$pragmaticRequirement\r\nthat mentions #$assertedMoreSpecifically")
    public static final SubLObject assertion_asserted_more_specifically_deductions_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject deductions = NIL;
            if (NIL != assertions_high.deduced_assertionP(assertion)) {
                {
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                    SubLObject deduction = NIL;
                    for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                        if (NIL != deduction_p(deduction)) {
                            {
                                SubLObject reconsiderP = NIL;
                                SubLObject rest = NIL;
                                for (rest = deductions_high.deduction_supports(deduction); !((NIL != reconsiderP) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject support = rest.first();
                                        if (NIL != kb_indexing.rule_with_some_asserted_more_specifically_pragmaticP(support, mt)) {
                                            reconsiderP = T;
                                        }
                                    }
                                }
                                if (NIL != reconsiderP) {
                                    deductions = cons(deduction, deductions);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(deductions);
        }
    }

    /**
     *
     *
     * @return list of deduction-p;
    Returns a list of the deductions supporting ASSERTION such that :
    The deduction contains a support which is a rule
    which has some relevant #$pragmaticRequirement
    that mentions #$assertedMoreSpecifically
     */
    @LispMethod(comment = "@return list of deduction-p;\r\nReturns a list of the deductions supporting ASSERTION such that :\r\nThe deduction contains a support which is a rule\r\nwhich has some relevant #$pragmaticRequirement\r\nthat mentions #$assertedMoreSpecifically")
    public static SubLObject assertion_asserted_more_specifically_deductions(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject deductions = NIL;
        if (NIL != assertions_high.deduced_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject deduction = NIL;
            deduction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != deduction_handles.deduction_p(deduction)) {
                    SubLObject reconsiderP;
                    SubLObject rest;
                    SubLObject support;
                    for (reconsiderP = NIL, rest = NIL, rest = deductions_high.deduction_supports(deduction); (NIL == reconsiderP) && (NIL != rest); rest = rest.rest()) {
                        support = rest.first();
                        if (NIL != indexing_utilities.rule_with_some_asserted_more_specifically_pragmaticP(support, mt)) {
                            reconsiderP = T;
                        }
                    }
                    if (NIL != reconsiderP) {
                        deductions = cons(deduction, deductions);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                deduction = cdolist_list_var.first();
            } 
        }
        return nreverse(deductions);
    }

    public static SubLObject bulk_remove_assertions(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject before = assertion_handles.assertion_count();
        final SubLObject doomed_assertion_set = set.new_set(symbol_function(EQL), length(assertions));
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Computing_doomed_dependents, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(assertions), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = assertions;
                SubLObject ass = NIL;
                ass = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject dependent_assertion_table = assertions_low.assertion_dependencies(ass);
                    SubLObject doomed = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(dependent_assertion_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            doomed = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            set.set_add(doomed, doomed_assertion_set);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    ass = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
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
        SubLObject doomed_assertions = set.set_element_list(doomed_assertion_set);
        SubLObject list_var;
        doomed_assertions = list_var = Sort.sort(doomed_assertions, symbol_function($sym83$_), symbol_function(ASSERTION_ID));
        SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Precaching_indices, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var;
                SubLObject doomed2 = NIL;
                doomed2 = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    cycl_utilities.assertion_map(symbol_function(TERM_INDEX), doomed2, UNPROVIDED, UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    doomed2 = csome_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        list_var = doomed_assertions;
        _prev_bind_9 = $progress_note$.currentBinding(thread);
        _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        _prev_bind_11 = $progress_total$.currentBinding(thread);
        _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Removing_assertions, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var;
                SubLObject doomed2 = NIL;
                doomed2 = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    tms_remove_assertion(doomed2);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    doomed2 = csome_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        final SubLObject after = assertion_handles.assertion_count();
        return subtract(before, after);
    }

    public static final SubLObject remove_circularly_supported_assertions_alt(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total_6 = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt63$Removing_circularly_supported_ass, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt63$Removing_circularly_supported_ass);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while (NIL != id) {
                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        note_percent_progress(sofar, total_6);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != com.cyc.cycjava.cycl.tms.remove_if_circularly_supported_assertion(assertion, verboseP)) {
                                            total = add(total, ONE_INTEGER);
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != verboseP) {
                    format(T, $str_alt64$_____S_circularly_supported_asser, total);
                }
                return total;
            }
        }
    }

    public static SubLObject remove_circularly_supported_assertions(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str89$Removing_circularly_supported_ass;
        final SubLObject total_$32 = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$33 = idx;
                if (NIL == id_index_objects_empty_p(idx_$33, $SKIP)) {
                    final SubLObject idx_$34 = idx_$33;
                    if (NIL == id_index_dense_objects_empty_p(idx_$34, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$34);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != remove_if_circularly_supported_assertion(assertion, verboseP)) {
                                    total = add(total, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total_$32);
                            }
                        }
                    }
                    final SubLObject idx_$35 = idx_$33;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$35)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$35);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$35);
                        final SubLObject end_id = id_index_next_id(idx_$35);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != remove_if_circularly_supported_assertion(assertion2, verboseP)) {
                                    total = add(total, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total_$32);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (NIL != verboseP) {
            format(T, $str90$_____S_circularly_supported_asser, total);
        }
        return total;
    }

    public static final SubLObject remove_if_circularly_supported_assertion_alt(SubLObject assertion, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (NIL == com.cyc.cycjava.cycl.tms.some_belief_justification(assertion, UNPROVIDED)) {
            if (NIL != verboseP) {
                format(T, $str_alt65$__Removing__S, assertion);
            }
            com.cyc.cycjava.cycl.tms.tms_remove_assertion(assertion);
            return T;
        }
        return NIL;
    }

    public static SubLObject remove_if_circularly_supported_assertion(final SubLObject assertion, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (NIL == some_belief_justification(assertion, UNPROVIDED)) {
            if (NIL != verboseP) {
                format(T, $str91$__Removing__S, assertion);
            }
            tms_remove_assertion(assertion);
            return T;
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION has been deduced without having to rely on an asserted argument for itself.
     */
    @LispMethod(comment = "Return T iff ASSERTION has been deduced without having to rely on an asserted argument for itself.")
    public static final SubLObject independently_deducible_assertionP_alt(SubLObject assertion) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.deduced_assertionP(assertion))) && (NIL != com.cyc.cycjava.cycl.tms.some_belief_justification(assertion, list(assertion))));
    }

    /**
     * Return T iff ASSERTION has been deduced without having to rely on an asserted argument for itself.
     */
    @LispMethod(comment = "Return T iff ASSERTION has been deduced without having to rely on an asserted argument for itself.")
    public static SubLObject independently_deducible_assertionP(final SubLObject assertion) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.deduced_assertionP(assertion))) && (NIL != some_belief_justification(assertion, list(assertion))));
    }

    public static final SubLObject some_belief_justification_alt(SubLObject assertion, SubLObject asserted_assertions_to_ignore) {
        if (asserted_assertions_to_ignore == UNPROVIDED) {
            asserted_assertions_to_ignore = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            if ((NIL != assertions_high.asserted_assertionP(assertion)) && (NIL == member_eqP(assertion, asserted_assertions_to_ignore))) {
                return T;
            } else {
                if (NIL == assertions_high.assertion_arguments(assertion)) {
                    return NIL;
                } else {
                    {
                        SubLObject just_found = NIL;
                        {
                            SubLObject _prev_bind_0 = $circular_deductions$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $circular_assertions$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $circular_local_assertions$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $circular_target_assertion$.currentBinding(thread);
                            SubLObject _prev_bind_4 = $circular_complexity_count$.currentBinding(thread);
                            try {
                                $circular_deductions$.bind(NIL, thread);
                                $circular_assertions$.bind(NIL, thread);
                                $circular_local_assertions$.bind(NIL, thread);
                                $circular_target_assertion$.bind(assertion, thread);
                                $circular_complexity_count$.bind(ZERO_INTEGER, thread);
                                try {
                                    {
                                        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                        SubLObject argument = NIL;
                                        for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                            if (NIL != deduction_p(argument)) {
                                                com.cyc.cycjava.cycl.tms.gather_circular_deduction(argument, asserted_assertions_to_ignore);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var = $circular_assertions$.getDynamicValue(thread);
                                        SubLObject supported_assertion = NIL;
                                        for (supported_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supported_assertion = cdolist_list_var.first()) {
                                            if ((NIL != assertions_high.asserted_assertionP(supported_assertion)) && (NIL == member_eqP(supported_assertion, asserted_assertions_to_ignore))) {
                                                com.cyc.cycjava.cycl.tms.mark_circular_assertion(supported_assertion);
                                            }
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    just_found = Errors.handleThrowable(ccatch_env_var, $JUST_FOUND);
                                }
                            } finally {
                                $circular_complexity_count$.rebind(_prev_bind_4, thread);
                                $circular_target_assertion$.rebind(_prev_bind_3, thread);
                                $circular_local_assertions$.rebind(_prev_bind_2, thread);
                                $circular_assertions$.rebind(_prev_bind_1, thread);
                                $circular_deductions$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return just_found;
                    }
                }
            }
        }
    }

    public static SubLObject some_belief_justification(final SubLObject assertion, SubLObject asserted_assertions_to_ignore) {
        if (asserted_assertions_to_ignore == UNPROVIDED) {
            asserted_assertions_to_ignore = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if ((NIL != assertions_high.asserted_assertionP(assertion)) && (NIL == list_utilities.member_kbeqP(assertion, asserted_assertions_to_ignore))) {
            return T;
        }
        if (NIL == assertions_high.assertion_arguments(assertion)) {
            return NIL;
        }
        SubLObject just_found = NIL;
        final SubLObject _prev_bind_0 = $circular_deductions$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $circular_assertions$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $circular_local_assertions$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $circular_target_assertion$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $circular_complexity_count$.currentBinding(thread);
        try {
            $circular_deductions$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            $circular_assertions$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            $circular_local_assertions$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            $circular_target_assertion$.bind(assertion, thread);
            $circular_complexity_count$.bind(ZERO_INTEGER, thread);
            try {
                thread.throwStack.push($JUST_FOUND);
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                SubLObject argument = NIL;
                argument = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != deduction_handles.deduction_p(argument)) {
                        gather_circular_deduction(argument, asserted_assertions_to_ignore);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    argument = cdolist_list_var.first();
                } 
                final SubLObject set_contents_var = set.do_set_internal($circular_assertions$.getDynamicValue(thread));
                SubLObject basis_object;
                SubLObject state;
                SubLObject supported_assertion;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    supported_assertion = set_contents.do_set_contents_next(basis_object, state);
                    if (((NIL != set_contents.do_set_contents_element_validP(state, supported_assertion)) && (NIL != assertions_high.asserted_assertionP(supported_assertion))) && (NIL == list_utilities.member_kbeqP(supported_assertion, asserted_assertions_to_ignore))) {
                        mark_circular_assertion(supported_assertion);
                    }
                }
            } catch (final Throwable ccatch_env_var) {
                just_found = Errors.handleThrowable(ccatch_env_var, $JUST_FOUND);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $circular_complexity_count$.rebind(_prev_bind_5, thread);
            $circular_target_assertion$.rebind(_prev_bind_4, thread);
            $circular_local_assertions$.rebind(_prev_bind_3, thread);
            $circular_assertions$.rebind(_prev_bind_2, thread);
            $circular_deductions$.rebind(_prev_bind_0, thread);
        }
        return just_found;
    }

    public static final SubLObject inc_circular_complexity_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $circular_complexity_count$.setDynamicValue(add($circular_complexity_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            if (NIL != $circular_complexity_count_limit$.getDynamicValue(thread)) {
                if ($circular_complexity_count$.getDynamicValue(thread).numG($circular_complexity_count_limit$.getDynamicValue(thread))) {
                    sublisp_throw($JUST_FOUND, T);
                }
            }
            return NIL;
        }
    }

    public static SubLObject inc_circular_complexity_count(SubLObject witness) {
        if (witness == UNPROVIDED) {
            witness = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $circular_complexity_count$.setDynamicValue(add($circular_complexity_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        if ((NIL != $circular_complexity_count_limit$.getDynamicValue(thread)) && $circular_complexity_count$.getDynamicValue(thread).numG($circular_complexity_count_limit$.getDynamicValue(thread))) {
            sublisp_throw($JUST_FOUND, $circular_complexity_count_limit$.getDynamicValue(thread));
        }
        return $circular_complexity_count$.getDynamicValue(thread);
    }

    public static final SubLObject gather_circular_deduction_alt(SubLObject deduction, SubLObject asserted_assertions_to_ignore) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == subl_promotions.memberP(deduction, $circular_deductions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                $circular_deductions$.setDynamicValue(cons(deduction, $circular_deductions$.getDynamicValue(thread)), thread);
                com.cyc.cycjava.cycl.tms.inc_circular_complexity_count();
                {
                    SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.assertion_p(assertion)) {
                            $circular_assertions$.setDynamicValue(cons(assertion, $circular_assertions$.getDynamicValue(thread)), thread);
                            com.cyc.cycjava.cycl.tms.inc_circular_complexity_count();
                            if (!((NIL != assertions_high.asserted_assertionP(assertion)) && (NIL == member_eqP(assertion, asserted_assertions_to_ignore)))) {
                                {
                                    SubLObject cdolist_list_var_7 = assertions_high.assertion_arguments(assertion);
                                    SubLObject argument = NIL;
                                    for (argument = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , argument = cdolist_list_var_7.first()) {
                                        if (NIL != deduction_p(argument)) {
                                            com.cyc.cycjava.cycl.tms.gather_circular_deduction(argument, asserted_assertions_to_ignore);
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

    public static SubLObject gather_circular_deduction(final SubLObject deduction, final SubLObject asserted_assertions_to_ignore) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_memberP(deduction, $circular_deductions$.getDynamicValue(thread))) {
            set.set_add(deduction, $circular_deductions$.getDynamicValue(thread));
            inc_circular_complexity_count(deduction);
            SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL == set.set_memberP(assertion, $circular_assertions$.getDynamicValue(thread)))) {
                    set.set_add(assertion, $circular_assertions$.getDynamicValue(thread));
                    inc_circular_complexity_count(assertion);
                    if ((NIL == assertions_high.asserted_assertionP(assertion)) || (NIL != list_utilities.member_kbeqP(assertion, asserted_assertions_to_ignore))) {
                        SubLObject cdolist_list_var_$37 = assertions_high.assertion_arguments(assertion);
                        SubLObject argument = NIL;
                        argument = cdolist_list_var_$37.first();
                        while (NIL != cdolist_list_var_$37) {
                            if (NIL != deduction_handles.deduction_p(argument)) {
                                gather_circular_deduction(argument, asserted_assertions_to_ignore);
                            }
                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                            argument = cdolist_list_var_$37.first();
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject mark_circular_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (assertion == $circular_target_assertion$.getDynamicValue(thread)) {
                sublisp_throw($JUST_FOUND, T);
            }
            if (NIL == subl_promotions.memberP(assertion, $circular_local_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                $circular_local_assertions$.setDynamicValue(cons(assertion, $circular_local_assertions$.getDynamicValue(thread)), thread);
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.tms.circular_deductions_with_assertion(assertion);
                    SubLObject deduction = NIL;
                    for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.tms.believed_circular_deduction(deduction)) {
                            com.cyc.cycjava.cycl.tms.mark_circular_assertion(deductions_high.deduction_assertion(deduction));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_circular_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertion.eql($circular_target_assertion$.getDynamicValue(thread))) {
            sublisp_throw($JUST_FOUND, T);
        }
        if (NIL == set.set_memberP(assertion, $circular_local_assertions$.getDynamicValue(thread))) {
            set.set_add(assertion, $circular_local_assertions$.getDynamicValue(thread));
            SubLObject cdolist_list_var = circular_deductions_with_assertion(assertion);
            SubLObject deduction = NIL;
            deduction = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != believed_circular_deductionP(deduction)) {
                    mark_circular_assertion(deductions_high.deduction_assertion(deduction));
                }
                cdolist_list_var = cdolist_list_var.rest();
                deduction = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject circular_deductions_with_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = $circular_deductions$.getDynamicValue(thread);
                SubLObject deduction = NIL;
                for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                    if (NIL != subl_promotions.memberP(assertion, deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED)) {
                        ans = cons(deduction, ans);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    public static SubLObject circular_deductions_with_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject set_contents_var = set.do_set_internal($circular_deductions$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, deduction)) && (NIL != list_utilities.member_kbeqP(assertion, deductions_high.deduction_supports(deduction)))) {
                ans = cons(deduction, ans);
            }
        }
        return nreverse(ans);
    }

    public static SubLObject believed_circular_deductionP(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject witness;
        SubLObject rest;
        SubLObject support;
        for (witness = NIL, rest = NIL, rest = deductions_high.deduction_supports(deduction); (NIL == witness) && (NIL != rest); rest = rest.rest()) {
            support = rest.first();
            if ((NIL != assertion_handles.assertion_p(support)) && (NIL == set.set_memberP(support, $circular_local_assertions$.getDynamicValue(thread)))) {
                witness = support;
            }
        }
        return makeBoolean(NIL == witness);
    }

    public static final SubLObject declare_tms_file_alt() {
        declareFunction("tms_assertion_being_removedP", "TMS-ASSERTION-BEING-REMOVED?", 1, 0, false);
        declareMacro("tms_note_assertion_being_removed", "TMS-NOTE-ASSERTION-BEING-REMOVED");
        declareFunction("tms_deduction_being_removedP", "TMS-DEDUCTION-BEING-REMOVED?", 1, 0, false);
        declareMacro("tms_note_deduction_being_removed", "TMS-NOTE-DEDUCTION-BEING-REMOVED");
        declareFunction("tms_argument_being_removedP", "TMS-ARGUMENT-BEING-REMOVED?", 1, 0, false);
        declareMacro("tms_note_argument_being_removed", "TMS-NOTE-ARGUMENT-BEING-REMOVED");
        declareFunction("tms_possibly_replace_asserted_argument_with_tv", "TMS-POSSIBLY-REPLACE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
        declareFunction("tms_create_asserted_argument_with_tv", "TMS-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
        declareFunction("tms_add_new_deduction", "TMS-ADD-NEW-DEDUCTION", 3, 0, false);
        declareFunction("tms_postprocess_new_argument", "TMS-POSTPROCESS-NEW-ARGUMENT", 2, 0, false);
        declareFunction("tms_remove_argument", "TMS-REMOVE-ARGUMENT", 2, 0, false);
        declareFunction("tms_propagate_removed_argument", "TMS-PROPAGATE-REMOVED-ARGUMENT", 2, 0, false);
        declareFunction("tms_remove_assertion_list", "TMS-REMOVE-ASSERTION-LIST", 1, 0, false);
        declareFunction("tms_remove_nonempty_assertion_list", "TMS-REMOVE-NONEMPTY-ASSERTION-LIST", 1, 0, false);
        declareFunction("tms_remove_assertion", "TMS-REMOVE-ASSERTION", 1, 0, false);
        declareFunction("tms_remove_assertion_int", "TMS-REMOVE-ASSERTION-INT", 1, 0, false);
        declareFunction("tms_remove_assertion_int_2", "TMS-REMOVE-ASSERTION-INT-2", 1, 0, false);
        declareFunction("tms_remove_deduction", "TMS-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("tms_change_asserted_argument_tv", "TMS-CHANGE-ASSERTED-ARGUMENT-TV", 3, 0, false);
        declareFunction("tms_recompute_assertion_tv", "TMS-RECOMPUTE-ASSERTION-TV", 1, 0, false);
        declareFunction("tms_change_direction", "TMS-CHANGE-DIRECTION", 2, 0, false);
        declareFunction("tms_recompute_dependents", "TMS-RECOMPUTE-DEPENDENTS", 1, 0, false);
        declareFunction("tms_remove_dependents", "TMS-REMOVE-DEPENDENTS", 1, 0, false);
        declareFunction("tms_recompute_dependents_tv", "TMS-RECOMPUTE-DEPENDENTS-TV", 1, 0, false);
        declareFunction("tms_recompute_deduction_tv", "TMS-RECOMPUTE-DEDUCTION-TV", 1, 0, false);
        declareFunction("tms_remove_mt_arguments", "TMS-REMOVE-MT-ARGUMENTS", 1, 1, false);
        declareFunction("tms_remove_deduction_for_assertion", "TMS-REMOVE-DEDUCTION-FOR-ASSERTION", 2, 1, false);
        declareFunction("tms_add_deduction_for_assertion", "TMS-ADD-DEDUCTION-FOR-ASSERTION", 2, 1, false);
        declareFunction("tms_add_deduction_for_cnf", "TMS-ADD-DEDUCTION-FOR-CNF", 3, 3, false);
        declareFunction("tms_direct_circularity", "TMS-DIRECT-CIRCULARITY", 2, 0, false);
        declareFunction("tms_directly_circular_deduction", "TMS-DIRECTLY-CIRCULAR-DEDUCTION", 1, 0, false);
        declareFunction("atomic_cnf_trivially_derivable", "ATOMIC-CNF-TRIVIALLY-DERIVABLE", 2, 0, false);
        declareFunction("gaf_trivially_derivable", "GAF-TRIVIALLY-DERIVABLE", 3, 0, false);
        declareFunction("true_gaf_trivially_derivable", "TRUE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
        declareFunction("false_gaf_trivially_derivable", "FALSE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
        declareFunction("tms_reconsider_assertion_deductions", "TMS-RECONSIDER-ASSERTION-DEDUCTIONS", 1, 0, false);
        declareFunction("tms_reconsider_assertion_dependents", "TMS-RECONSIDER-ASSERTION-DEPENDENTS", 1, 0, false);
        declareFunction("tms_reconsider_deduction", "TMS-RECONSIDER-DEDUCTION", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_supportsP", "TMS-DEDUCTION-STALE-WRT-SUPPORTS?", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?", 1, 0, false);
        declareFunction("tms_reprove_deduction_query_sentence", "TMS-REPROVE-DEDUCTION-QUERY-SENTENCE", 1, 0, false);
        declareFunction("tms_reprove_deduction_query_mt", "TMS-REPROVE-DEDUCTION-QUERY-MT", 1, 0, false);
        declareFunction("tms_reprove_deduction_query_properties", "TMS-REPROVE-DEDUCTION-QUERY-PROPERTIES", 5, 0, false);
        declareFunction("tms_reconsider_assertion", "TMS-RECONSIDER-ASSERTION", 1, 0, false);
        declareFunction("tms_reconsider_mt", "TMS-RECONSIDER-MT", 1, 0, false);
        declareFunction("tms_reconsider_term_gafs", "TMS-RECONSIDER-TERM-GAFS", 1, 1, false);
        declareFunction("tms_reconsider_predicate_extent", "TMS-RECONSIDER-PREDICATE-EXTENT", 1, 1, false);
        declareFunction("tms_reconsider_gaf_args", "TMS-RECONSIDER-GAF-ARGS", 2, 2, false);
        declareFunction("tms_reconsider_term", "TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction("tms_reconsider_all_assertions", "TMS-RECONSIDER-ALL-ASSERTIONS", 0, 0, false);
        declareFunction("stale_support", "STALE-SUPPORT", 1, 0, false);
        declareFunction("stale_support_mtP", "STALE-SUPPORT-MT?", 2, 0, false);
        declareFunction("support_mt_okP", "SUPPORT-MT-OK?", 2, 0, false);
        declareFunction("assertion_asserted_more_specifically_deductions", "ASSERTION-ASSERTED-MORE-SPECIFICALLY-DEDUCTIONS", 1, 0, false);
        declareFunction("remove_circularly_supported_assertions", "REMOVE-CIRCULARLY-SUPPORTED-ASSERTIONS", 0, 1, false);
        declareFunction("remove_if_circularly_supported_assertion", "REMOVE-IF-CIRCULARLY-SUPPORTED-ASSERTION", 1, 1, false);
        declareFunction("independently_deducible_assertionP", "INDEPENDENTLY-DEDUCIBLE-ASSERTION?", 1, 0, false);
        declareFunction("some_belief_justification", "SOME-BELIEF-JUSTIFICATION", 1, 1, false);
        declareFunction("inc_circular_complexity_count", "INC-CIRCULAR-COMPLEXITY-COUNT", 0, 0, false);
        declareFunction("gather_circular_deduction", "GATHER-CIRCULAR-DEDUCTION", 2, 0, false);
        declareFunction("mark_circular_assertion", "MARK-CIRCULAR-ASSERTION", 1, 0, false);
        declareFunction("circular_deductions_with_assertion", "CIRCULAR-DEDUCTIONS-WITH-ASSERTION", 1, 0, false);
        declareFunction("believed_circular_deduction", "BELIEVED-CIRCULAR-DEDUCTION", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_tms_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("tms_any_assertion_being_removedP", "TMS-ANY-ASSERTION-BEING-REMOVED?", 0, 0, false);
            declareFunction("tms_assertion_being_removedP", "TMS-ASSERTION-BEING-REMOVED?", 1, 0, false);
            declareMacro("tms_note_assertion_being_removed", "TMS-NOTE-ASSERTION-BEING-REMOVED");
            declareFunction("tms_deduction_being_removedP", "TMS-DEDUCTION-BEING-REMOVED?", 1, 0, false);
            declareMacro("tms_note_deduction_being_removed", "TMS-NOTE-DEDUCTION-BEING-REMOVED");
            declareFunction("tms_argument_being_removedP", "TMS-ARGUMENT-BEING-REMOVED?", 1, 0, false);
            declareMacro("tms_note_argument_being_removed", "TMS-NOTE-ARGUMENT-BEING-REMOVED");
            declareFunction("tms_can_kill_forts_for_meP", "TMS-CAN-KILL-FORTS-FOR-ME?", 0, 0, false);
            declareFunction("tms_please_kill_this_term_for_me", "TMS-PLEASE-KILL-THIS-TERM-FOR-ME", 1, 0, false);
            declareMacro("tms_killing_forts_later", "TMS-KILLING-FORTS-LATER");
            declareMacro("tms_without_forts_to_kill_list", "TMS-WITHOUT-FORTS-TO-KILL-LIST");
            declareFunction("tms_forts_to_kill", "TMS-FORTS-TO-KILL", 0, 0, false);
            declareFunction("tms_fort_to_killP", "TMS-FORT-TO-KILL?", 1, 0, false);
            declareFunction("tms_kill_queued_forts", "TMS-KILL-QUEUED-FORTS", 0, 0, false);
            declareFunction("tms_possibly_replace_asserted_argument_with_tv", "TMS-POSSIBLY-REPLACE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
            declareFunction("tms_create_asserted_argument_with_tv", "TMS-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 1, false);
            declareFunction("tms_add_new_deduction", "TMS-ADD-NEW-DEDUCTION", 3, 2, false);
            declareFunction("tms_postprocess_new_argument", "TMS-POSTPROCESS-NEW-ARGUMENT", 2, 1, false);
            declareFunction("tms_remove_argument", "TMS-REMOVE-ARGUMENT", 2, 1, false);
            declareFunction("tms_propagate_removed_argument", "TMS-PROPAGATE-REMOVED-ARGUMENT", 3, 0, false);
            declareFunction("tms_remove_assertion_list", "TMS-REMOVE-ASSERTION-LIST", 1, 0, false);
            declareFunction("tms_remove_nonempty_assertion_list", "TMS-REMOVE-NONEMPTY-ASSERTION-LIST", 1, 0, false);
            declareFunction("tms_remove_assertion", "TMS-REMOVE-ASSERTION", 1, 0, false);
            declareFunction("tms_remove_assertion_int", "TMS-REMOVE-ASSERTION-INT", 1, 0, false);
            declareFunction("tms_remove_assertion_low", "TMS-REMOVE-ASSERTION-LOW", 1, 0, false);
            declareFunction("tms_remove_deduction", "TMS-REMOVE-DEDUCTION", 1, 0, false);
            declareFunction("tms_change_asserted_argument_tv", "TMS-CHANGE-ASSERTED-ARGUMENT-TV", 3, 0, false);
            declareFunction("tms_recompute_assertion_tv", "TMS-RECOMPUTE-ASSERTION-TV", 1, 2, false);
            declareFunction("tms_change_direction", "TMS-CHANGE-DIRECTION", 2, 0, false);
            declareFunction("tms_should_schedule_assertion_for_forward_propagationP", "TMS-SHOULD-SCHEDULE-ASSERTION-FOR-FORWARD-PROPAGATION?", 1, 0, false);
            declareFunction("tms_possibly_schedule_assertion_for_forward_propagation", "TMS-POSSIBLY-SCHEDULE-ASSERTION-FOR-FORWARD-PROPAGATION", 1, 0, false);
            declareFunction("tms_recompute_dependents", "TMS-RECOMPUTE-DEPENDENTS", 1, 0, false);
            declareFunction("tms_handle_after_addings", "TMS-HANDLE-AFTER-ADDINGS", 1, 0, false);
            declareFunction("tms_remove_dependents", "TMS-REMOVE-DEPENDENTS", 1, 0, false);
            declareFunction("tms_recompute_dependents_tv", "TMS-RECOMPUTE-DEPENDENTS-TV", 1, 0, false);
            declareFunction("tms_recompute_deduction_tv", "TMS-RECOMPUTE-DEDUCTION-TV", 1, 0, false);
            declareFunction("tms_remove_mt_arguments", "TMS-REMOVE-MT-ARGUMENTS", 1, 1, false);
            declareFunction("except_propagation_ruleX_initializer", "*EXCEPT-PROPAGATION-RULE*-INITIALIZER", 0, 0, false);
            declareFunction("perform_except_propagation", "PERFORM-EXCEPT-PROPAGATION", 1, 0, false);
            declareFunction("tms_remove_deduction_for_assertion", "TMS-REMOVE-DEDUCTION-FOR-ASSERTION", 2, 1, false);
            declareFunction("tms_explicitly_remove_deduction_for_assertion", "TMS-EXPLICITLY-REMOVE-DEDUCTION-FOR-ASSERTION", 1, 0, false);
            declareFunction("tms_add_deduction_for_assertion", "TMS-ADD-DEDUCTION-FOR-ASSERTION", 2, 3, false);
            declareFunction("tms_add_deduction_for_cnf", "TMS-ADD-DEDUCTION-FOR-CNF", 3, 5, false);
            declareFunction("tms_direct_circularity", "TMS-DIRECT-CIRCULARITY", 2, 0, false);
            declareFunction("tms_directly_circular_deduction", "TMS-DIRECTLY-CIRCULAR-DEDUCTION", 1, 0, false);
            declareFunction("tms_invalidate_weaker_redundant_arguments", "TMS-INVALIDATE-WEAKER-REDUNDANT-ARGUMENTS", 2, 0, false);
            declareFunction("tms_weaker_redundant_arguments", "TMS-WEAKER-REDUNDANT-ARGUMENTS", 2, 0, false);
            declareFunction("tms_remove_weaker_redundant_argument", "TMS-REMOVE-WEAKER-REDUNDANT-ARGUMENT", 2, 0, false);
            declareFunction("deduction_with_one_tou_supportP", "DEDUCTION-WITH-ONE-TOU-SUPPORT?", 1, 0, false);
            declareFunction("deduction_with_one_equality_support_matchingP", "DEDUCTION-WITH-ONE-EQUALITY-SUPPORT-MATCHING?", 2, 0, false);
            declareFunction("equality_support_matchingP", "EQUALITY-SUPPORT-MATCHING?", 2, 0, false);
            declareFunction("atomic_cnf_trivially_derivable", "ATOMIC-CNF-TRIVIALLY-DERIVABLE", 2, 0, false);
            declareFunction("gaf_trivially_derivable", "GAF-TRIVIALLY-DERIVABLE", 3, 0, false);
            declareFunction("true_gaf_trivially_derivable", "TRUE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
            declareFunction("false_gaf_trivially_derivable", "FALSE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
            declareFunction("tms_reconsider_assertion_deductions", "TMS-RECONSIDER-ASSERTION-DEDUCTIONS", 1, 0, false);
            declareFunction("tms_reconsider_assertion_dependents", "TMS-RECONSIDER-ASSERTION-DEPENDENTS", 1, 0, false);
            declareFunction("tms_reconsider_deduction", "TMS-RECONSIDER-DEDUCTION", 1, 0, false);
            declareFunction("tms_deduction_stale_wrt_supportsP", "TMS-DEDUCTION-STALE-WRT-SUPPORTS?", 1, 0, false);
            declareFunction("tms_deduction_stale_wrt_exceptionsP", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?", 1, 0, false);
            declareFunction("tms_deduction_stale_wrt_exceptionsP_lifting_rule_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-LIFTING-RULE-VERSION", 1, 0, false);
            declareFunction("tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-BACKCHAIN-FORBIDDEN-VERSION", 1, 0, false);
            declareFunction("tms_deduction_stale_wrt_exceptionsP_query_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-QUERY-VERSION", 1, 0, false);
            declareFunction("tms_reprove_deduction_query_sentence", "TMS-REPROVE-DEDUCTION-QUERY-SENTENCE", 1, 0, false);
            declareFunction("tms_reprove_deduction_query_mt", "TMS-REPROVE-DEDUCTION-QUERY-MT", 1, 0, false);
            declareFunction("tms_reprove_deduction_query_properties", "TMS-REPROVE-DEDUCTION-QUERY-PROPERTIES", 5, 0, false);
            declareFunction("tms_deduction_stale_wrt_exceptionsP_general_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION", 1, 0, false);
            declareFunction("compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version", "COMPUTE-ASSERTIBLES-QUEUE-FOR-TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION", 2, 0, false);
            declareFunction("tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-USE-DEDUCTION-BINDINGS-VERSION", 1, 0, false);
            declareFunction("tms_reconsider_assertion", "TMS-RECONSIDER-ASSERTION", 1, 0, false);
            declareFunction("tms_reconsider_mt", "TMS-RECONSIDER-MT", 1, 0, false);
            declareFunction("tms_reconsider_term_gafs", "TMS-RECONSIDER-TERM-GAFS", 1, 1, false);
            declareFunction("tms_reconsider_predicate_extent", "TMS-RECONSIDER-PREDICATE-EXTENT", 1, 1, false);
            declareFunction("tms_reconsider_gaf_args", "TMS-RECONSIDER-GAF-ARGS", 2, 2, false);
            declareFunction("tms_reconsider_term", "TMS-RECONSIDER-TERM", 1, 1, false);
            declareFunction("tms_reconsider_all_assertions", "TMS-RECONSIDER-ALL-ASSERTIONS", 0, 0, false);
            declareFunction("stale_support", "STALE-SUPPORT", 1, 0, false);
            declareFunction("stale_support_mtP", "STALE-SUPPORT-MT?", 2, 0, false);
            declareFunction("support_mt_okP", "SUPPORT-MT-OK?", 2, 0, false);
            declareFunction("assertion_asserted_more_specifically_deductions", "ASSERTION-ASSERTED-MORE-SPECIFICALLY-DEDUCTIONS", 1, 0, false);
            declareFunction("bulk_remove_assertions", "BULK-REMOVE-ASSERTIONS", 1, 0, false);
            declareFunction("remove_circularly_supported_assertions", "REMOVE-CIRCULARLY-SUPPORTED-ASSERTIONS", 0, 1, false);
            declareFunction("remove_if_circularly_supported_assertion", "REMOVE-IF-CIRCULARLY-SUPPORTED-ASSERTION", 1, 1, false);
            declareFunction("independently_deducible_assertionP", "INDEPENDENTLY-DEDUCIBLE-ASSERTION?", 1, 0, false);
            declareFunction("some_belief_justification", "SOME-BELIEF-JUSTIFICATION", 1, 1, false);
            declareFunction("inc_circular_complexity_count", "INC-CIRCULAR-COMPLEXITY-COUNT", 0, 1, false);
            declareFunction("gather_circular_deduction", "GATHER-CIRCULAR-DEDUCTION", 2, 0, false);
            declareFunction("mark_circular_assertion", "MARK-CIRCULAR-ASSERTION", 1, 0, false);
            declareFunction("circular_deductions_with_assertion", "CIRCULAR-DEDUCTIONS-WITH-ASSERTION", 1, 0, false);
            declareFunction("believed_circular_deductionP", "BELIEVED-CIRCULAR-DEDUCTION?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("tms_create_asserted_argument_with_tv", "TMS-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
            declareFunction("tms_add_new_deduction", "TMS-ADD-NEW-DEDUCTION", 3, 0, false);
            declareFunction("tms_postprocess_new_argument", "TMS-POSTPROCESS-NEW-ARGUMENT", 2, 0, false);
            declareFunction("tms_remove_argument", "TMS-REMOVE-ARGUMENT", 2, 0, false);
            declareFunction("tms_propagate_removed_argument", "TMS-PROPAGATE-REMOVED-ARGUMENT", 2, 0, false);
            declareFunction("tms_remove_assertion_int_2", "TMS-REMOVE-ASSERTION-INT-2", 1, 0, false);
            declareFunction("tms_recompute_assertion_tv", "TMS-RECOMPUTE-ASSERTION-TV", 1, 0, false);
            declareFunction("tms_add_deduction_for_assertion", "TMS-ADD-DEDUCTION-FOR-ASSERTION", 2, 1, false);
            declareFunction("tms_add_deduction_for_cnf", "TMS-ADD-DEDUCTION-FOR-CNF", 3, 3, false);
            declareFunction("inc_circular_complexity_count", "INC-CIRCULAR-COMPLEXITY-COUNT", 0, 0, false);
            declareFunction("believed_circular_deduction", "BELIEVED-CIRCULAR-DEDUCTION", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_tms_file_Previous() {
        declareFunction("tms_any_assertion_being_removedP", "TMS-ANY-ASSERTION-BEING-REMOVED?", 0, 0, false);
        declareFunction("tms_assertion_being_removedP", "TMS-ASSERTION-BEING-REMOVED?", 1, 0, false);
        declareMacro("tms_note_assertion_being_removed", "TMS-NOTE-ASSERTION-BEING-REMOVED");
        declareFunction("tms_deduction_being_removedP", "TMS-DEDUCTION-BEING-REMOVED?", 1, 0, false);
        declareMacro("tms_note_deduction_being_removed", "TMS-NOTE-DEDUCTION-BEING-REMOVED");
        declareFunction("tms_argument_being_removedP", "TMS-ARGUMENT-BEING-REMOVED?", 1, 0, false);
        declareMacro("tms_note_argument_being_removed", "TMS-NOTE-ARGUMENT-BEING-REMOVED");
        declareFunction("tms_can_kill_forts_for_meP", "TMS-CAN-KILL-FORTS-FOR-ME?", 0, 0, false);
        declareFunction("tms_please_kill_this_term_for_me", "TMS-PLEASE-KILL-THIS-TERM-FOR-ME", 1, 0, false);
        declareMacro("tms_killing_forts_later", "TMS-KILLING-FORTS-LATER");
        declareMacro("tms_without_forts_to_kill_list", "TMS-WITHOUT-FORTS-TO-KILL-LIST");
        declareFunction("tms_forts_to_kill", "TMS-FORTS-TO-KILL", 0, 0, false);
        declareFunction("tms_fort_to_killP", "TMS-FORT-TO-KILL?", 1, 0, false);
        declareFunction("tms_kill_queued_forts", "TMS-KILL-QUEUED-FORTS", 0, 0, false);
        declareFunction("tms_possibly_replace_asserted_argument_with_tv", "TMS-POSSIBLY-REPLACE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
        declareFunction("tms_create_asserted_argument_with_tv", "TMS-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 1, false);
        declareFunction("tms_add_new_deduction", "TMS-ADD-NEW-DEDUCTION", 3, 2, false);
        declareFunction("tms_postprocess_new_argument", "TMS-POSTPROCESS-NEW-ARGUMENT", 2, 1, false);
        declareFunction("tms_remove_argument", "TMS-REMOVE-ARGUMENT", 2, 1, false);
        declareFunction("tms_propagate_removed_argument", "TMS-PROPAGATE-REMOVED-ARGUMENT", 3, 0, false);
        declareFunction("tms_remove_assertion_list", "TMS-REMOVE-ASSERTION-LIST", 1, 0, false);
        declareFunction("tms_remove_nonempty_assertion_list", "TMS-REMOVE-NONEMPTY-ASSERTION-LIST", 1, 0, false);
        declareFunction("tms_remove_assertion", "TMS-REMOVE-ASSERTION", 1, 0, false);
        declareFunction("tms_remove_assertion_int", "TMS-REMOVE-ASSERTION-INT", 1, 0, false);
        declareFunction("tms_remove_assertion_low", "TMS-REMOVE-ASSERTION-LOW", 1, 0, false);
        declareFunction("tms_remove_deduction", "TMS-REMOVE-DEDUCTION", 1, 0, false);
        declareFunction("tms_change_asserted_argument_tv", "TMS-CHANGE-ASSERTED-ARGUMENT-TV", 3, 0, false);
        declareFunction("tms_recompute_assertion_tv", "TMS-RECOMPUTE-ASSERTION-TV", 1, 2, false);
        declareFunction("tms_change_direction", "TMS-CHANGE-DIRECTION", 2, 0, false);
        declareFunction("tms_should_schedule_assertion_for_forward_propagationP", "TMS-SHOULD-SCHEDULE-ASSERTION-FOR-FORWARD-PROPAGATION?", 1, 0, false);
        declareFunction("tms_possibly_schedule_assertion_for_forward_propagation", "TMS-POSSIBLY-SCHEDULE-ASSERTION-FOR-FORWARD-PROPAGATION", 1, 0, false);
        declareFunction("tms_recompute_dependents", "TMS-RECOMPUTE-DEPENDENTS", 1, 0, false);
        declareFunction("tms_handle_after_addings", "TMS-HANDLE-AFTER-ADDINGS", 1, 0, false);
        declareFunction("tms_remove_dependents", "TMS-REMOVE-DEPENDENTS", 1, 0, false);
        declareFunction("tms_recompute_dependents_tv", "TMS-RECOMPUTE-DEPENDENTS-TV", 1, 0, false);
        declareFunction("tms_recompute_deduction_tv", "TMS-RECOMPUTE-DEDUCTION-TV", 1, 0, false);
        declareFunction("tms_remove_mt_arguments", "TMS-REMOVE-MT-ARGUMENTS", 1, 1, false);
        declareFunction("except_propagation_ruleX_initializer", "*EXCEPT-PROPAGATION-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("perform_except_propagation", "PERFORM-EXCEPT-PROPAGATION", 1, 0, false);
        declareFunction("tms_remove_deduction_for_assertion", "TMS-REMOVE-DEDUCTION-FOR-ASSERTION", 2, 1, false);
        declareFunction("tms_explicitly_remove_deduction_for_assertion", "TMS-EXPLICITLY-REMOVE-DEDUCTION-FOR-ASSERTION", 1, 0, false);
        declareFunction("tms_add_deduction_for_assertion", "TMS-ADD-DEDUCTION-FOR-ASSERTION", 2, 3, false);
        declareFunction("tms_add_deduction_for_cnf", "TMS-ADD-DEDUCTION-FOR-CNF", 3, 5, false);
        declareFunction("tms_direct_circularity", "TMS-DIRECT-CIRCULARITY", 2, 0, false);
        declareFunction("tms_directly_circular_deduction", "TMS-DIRECTLY-CIRCULAR-DEDUCTION", 1, 0, false);
        declareFunction("tms_invalidate_weaker_redundant_arguments", "TMS-INVALIDATE-WEAKER-REDUNDANT-ARGUMENTS", 2, 0, false);
        declareFunction("tms_weaker_redundant_arguments", "TMS-WEAKER-REDUNDANT-ARGUMENTS", 2, 0, false);
        declareFunction("tms_remove_weaker_redundant_argument", "TMS-REMOVE-WEAKER-REDUNDANT-ARGUMENT", 2, 0, false);
        declareFunction("deduction_with_one_tou_supportP", "DEDUCTION-WITH-ONE-TOU-SUPPORT?", 1, 0, false);
        declareFunction("deduction_with_one_equality_support_matchingP", "DEDUCTION-WITH-ONE-EQUALITY-SUPPORT-MATCHING?", 2, 0, false);
        declareFunction("equality_support_matchingP", "EQUALITY-SUPPORT-MATCHING?", 2, 0, false);
        declareFunction("atomic_cnf_trivially_derivable", "ATOMIC-CNF-TRIVIALLY-DERIVABLE", 2, 0, false);
        declareFunction("gaf_trivially_derivable", "GAF-TRIVIALLY-DERIVABLE", 3, 0, false);
        declareFunction("true_gaf_trivially_derivable", "TRUE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
        declareFunction("false_gaf_trivially_derivable", "FALSE-GAF-TRIVIALLY-DERIVABLE", 2, 0, false);
        declareFunction("tms_reconsider_assertion_deductions", "TMS-RECONSIDER-ASSERTION-DEDUCTIONS", 1, 0, false);
        declareFunction("tms_reconsider_assertion_dependents", "TMS-RECONSIDER-ASSERTION-DEPENDENTS", 1, 0, false);
        declareFunction("tms_reconsider_deduction", "TMS-RECONSIDER-DEDUCTION", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_supportsP", "TMS-DEDUCTION-STALE-WRT-SUPPORTS?", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP_lifting_rule_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-LIFTING-RULE-VERSION", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP_backchain_forbidden_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-BACKCHAIN-FORBIDDEN-VERSION", 1, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP_query_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-QUERY-VERSION", 1, 0, false);
        declareFunction("tms_reprove_deduction_query_sentence", "TMS-REPROVE-DEDUCTION-QUERY-SENTENCE", 1, 0, false);
        declareFunction("tms_reprove_deduction_query_mt", "TMS-REPROVE-DEDUCTION-QUERY-MT", 1, 0, false);
        declareFunction("tms_reprove_deduction_query_properties", "TMS-REPROVE-DEDUCTION-QUERY-PROPERTIES", 5, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP_general_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION", 1, 0, false);
        declareFunction("compute_assertibles_queue_for_tms_deduction_stale_wrt_exceptionsP_general_version", "COMPUTE-ASSERTIBLES-QUEUE-FOR-TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION", 2, 0, false);
        declareFunction("tms_deduction_stale_wrt_exceptionsP_use_deduction_bindings_version", "TMS-DEDUCTION-STALE-WRT-EXCEPTIONS?-USE-DEDUCTION-BINDINGS-VERSION", 1, 0, false);
        declareFunction("tms_reconsider_assertion", "TMS-RECONSIDER-ASSERTION", 1, 0, false);
        declareFunction("tms_reconsider_mt", "TMS-RECONSIDER-MT", 1, 0, false);
        declareFunction("tms_reconsider_term_gafs", "TMS-RECONSIDER-TERM-GAFS", 1, 1, false);
        declareFunction("tms_reconsider_predicate_extent", "TMS-RECONSIDER-PREDICATE-EXTENT", 1, 1, false);
        declareFunction("tms_reconsider_gaf_args", "TMS-RECONSIDER-GAF-ARGS", 2, 2, false);
        declareFunction("tms_reconsider_term", "TMS-RECONSIDER-TERM", 1, 1, false);
        declareFunction("tms_reconsider_all_assertions", "TMS-RECONSIDER-ALL-ASSERTIONS", 0, 0, false);
        declareFunction("stale_support", "STALE-SUPPORT", 1, 0, false);
        declareFunction("stale_support_mtP", "STALE-SUPPORT-MT?", 2, 0, false);
        declareFunction("support_mt_okP", "SUPPORT-MT-OK?", 2, 0, false);
        declareFunction("assertion_asserted_more_specifically_deductions", "ASSERTION-ASSERTED-MORE-SPECIFICALLY-DEDUCTIONS", 1, 0, false);
        declareFunction("bulk_remove_assertions", "BULK-REMOVE-ASSERTIONS", 1, 0, false);
        declareFunction("remove_circularly_supported_assertions", "REMOVE-CIRCULARLY-SUPPORTED-ASSERTIONS", 0, 1, false);
        declareFunction("remove_if_circularly_supported_assertion", "REMOVE-IF-CIRCULARLY-SUPPORTED-ASSERTION", 1, 1, false);
        declareFunction("independently_deducible_assertionP", "INDEPENDENTLY-DEDUCIBLE-ASSERTION?", 1, 0, false);
        declareFunction("some_belief_justification", "SOME-BELIEF-JUSTIFICATION", 1, 1, false);
        declareFunction("inc_circular_complexity_count", "INC-CIRCULAR-COMPLEXITY-COUNT", 0, 1, false);
        declareFunction("gather_circular_deduction", "GATHER-CIRCULAR-DEDUCTION", 2, 0, false);
        declareFunction("mark_circular_assertion", "MARK-CIRCULAR-ASSERTION", 1, 0, false);
        declareFunction("circular_deductions_with_assertion", "CIRCULAR-DEDUCTIONS-WITH-ASSERTION", 1, 0, false);
        declareFunction("believed_circular_deductionP", "BELIEVED-CIRCULAR-DEDUCTION?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_tms_file_alt() {
        defparameter("*TMS-ASSERTIONS-BEING-REMOVED*", NIL);
        defparameter("*TMS-DEDUCTIONS-BEING-REMOVED*", NIL);
        defparameter("*CIRCULAR-DEDUCTIONS*", NIL);
        defparameter("*CIRCULAR-ASSERTIONS*", NIL);
        defparameter("*CIRCULAR-TARGET-ASSERTION*", NIL);
        defparameter("*CIRCULAR-LOCAL-ASSERTIONS*", NIL);
        defparameter("*CIRCULAR-COMPLEXITY-COUNT*", ZERO_INTEGER);
        defparameter("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", $int$50);
        return NIL;
    }

    public static SubLObject init_tms_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TMS-DEBUG?*", NIL);
            defparameter("*TMS-ASSERTIONS-BEING-REMOVED*", NIL);
            defparameter("*TMS-DEDUCTIONS-BEING-REMOVED*", NIL);
            defparameter("*TMS-FORTS-TO-KILL*", $UNINITIALIZED);
            defparameter("*TMS-REMOVE-ASSERTION-LOW?*", NIL);
            defparameter("*RECURSIVE-TMS-BUG?*", NIL);
            defvar("*EXCEPT-PROPAGATION-RULE*", $UNINITIALIZED);
            defparameter("*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION?*", NIL);
            defparameter("*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS-HACK?*", T);
            defparameter("*CIRCULAR-DEDUCTIONS*", $UNINITIALIZED);
            defparameter("*CIRCULAR-ASSERTIONS*", $UNINITIALIZED);
            defparameter("*CIRCULAR-LOCAL-ASSERTIONS*", $UNINITIALIZED);
            defparameter("*CIRCULAR-TARGET-ASSERTION*", $UNINITIALIZED);
            defparameter("*CIRCULAR-COMPLEXITY-COUNT*", $UNINITIALIZED);
            defparameter("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", $int$250);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CIRCULAR-DEDUCTIONS*", NIL);
            defparameter("*CIRCULAR-ASSERTIONS*", NIL);
            defparameter("*CIRCULAR-TARGET-ASSERTION*", NIL);
            defparameter("*CIRCULAR-LOCAL-ASSERTIONS*", NIL);
            defparameter("*CIRCULAR-COMPLEXITY-COUNT*", ZERO_INTEGER);
            defparameter("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", $int$50);
        }
        return NIL;
    }

    public static SubLObject init_tms_file_Previous() {
        defparameter("*TMS-DEBUG?*", NIL);
        defparameter("*TMS-ASSERTIONS-BEING-REMOVED*", NIL);
        defparameter("*TMS-DEDUCTIONS-BEING-REMOVED*", NIL);
        defparameter("*TMS-FORTS-TO-KILL*", $UNINITIALIZED);
        defparameter("*TMS-REMOVE-ASSERTION-LOW?*", NIL);
        defparameter("*RECURSIVE-TMS-BUG?*", NIL);
        defvar("*EXCEPT-PROPAGATION-RULE*", $UNINITIALIZED);
        defparameter("*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS?-GENERAL-VERSION?*", NIL);
        defparameter("*USE-BACKCHAIN-FORBIDDEN-DEDUCTION-STALE-WRT-EXCEPTIONS-HACK?*", T);
        defparameter("*CIRCULAR-DEDUCTIONS*", $UNINITIALIZED);
        defparameter("*CIRCULAR-ASSERTIONS*", $UNINITIALIZED);
        defparameter("*CIRCULAR-LOCAL-ASSERTIONS*", $UNINITIALIZED);
        defparameter("*CIRCULAR-TARGET-ASSERTION*", $UNINITIALIZED);
        defparameter("*CIRCULAR-COMPLEXITY-COUNT*", $UNINITIALIZED);
        defparameter("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*", $int$250);
        return NIL;
    }

    public static SubLObject setup_tms_file() {
        register_kb_variable_initialization($except_propagation_rule$, $sym31$_EXCEPT_PROPAGATION_RULE__INITIALIZER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tms_file();
    }

    @Override
    public void initializeVariables() {
        init_tms_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tms_file();
    }

    static {
    }
}

/**
 * Total time: 1083 ms
 */
