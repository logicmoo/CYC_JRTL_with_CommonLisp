/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.misc_utilities.other_binary_arg;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
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
 * module:      TVA-UTILITIES
 * source file: /cyc/top/cycl/tva-utilities.lisp
 * created:     2019/07/03 17:37:35
 */
public final class tva_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new tva_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.tva_utilities";


    // deflexical
    // Definitions
    // The predicates used for TVA inference
    /**
     * The predicates used for TVA inference
     */
    @LispMethod(comment = "The predicates used for TVA inference\ndeflexical")
    private static final SubLSymbol $tva_predicates$ = makeSymbol("*TVA-PREDICATES*");







    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $tva_force_arg_admittance_checkingP$ = makeSymbol("*TVA-FORCE-ARG-ADMITTANCE-CHECKING?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("transitiveViaArg"), reader_make_constant_shell("transitiveViaArgInverse"), reader_make_constant_shell("conservativeViaArg"), reader_make_constant_shell("conservativeViaArgInverse"));

    static private final SubLList $list1 = list(list(makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list6 = list(makeSymbol("GET-TVA-PREDICATES"));

    public static final SubLSymbol $tva_precomputes_sksi_closuresP$ = makeSymbol("*TVA-PRECOMPUTES-SKSI-CLOSURES?*");

    public static final SubLSymbol $tva_iterates_kb_predicate_extentP$ = makeSymbol("*TVA-ITERATES-KB-PREDICATE-EXTENT?*");

    public static final SubLSymbol $tva_iterates_sksi_predicate_extentP$ = makeSymbol("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*");

    private static final SubLObject $const10$argAdmittanceTestedDuringTransiti = reader_make_constant_shell("argAdmittanceTestedDuringTransitiveViaInference");

    private static final SubLInteger $int$1500 = makeInteger(1500);

    static private final SubLList $list12 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list15 = list(makeSymbol("INTEGERP"));

    public static final SubLSymbol $tva_precompute_closure_threshold$ = makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*");



    private static final SubLSymbol TVA_ASSERTION_P = makeSymbol("TVA-ASSERTION-P");





    private static final SubLSymbol CVA_ASSERTION_P = makeSymbol("CVA-ASSERTION-P");



    private static final SubLSymbol CACHED_SOME_TVA_FOR_PREDICATE = makeSymbol("CACHED-SOME-TVA-FOR-PREDICATE");



    static private final SubLSymbol $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_ = makeSymbol("SOME-TRANSITIVE-VIA-ARG-ASSERTION?");



    public static final SubLSymbol $cached_some_tva_for_predicate_caching_state$ = makeSymbol("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_SOME_TVA_FOR_PREDICATE = makeSymbol("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE");

    private static final SubLSymbol CACHED_SOME_CVA_FOR_PREDICATE = makeSymbol("CACHED-SOME-CVA-FOR-PREDICATE");

    private static final SubLSymbol $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_ = makeSymbol("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?");

    private static final SubLSymbol $cached_some_cva_for_predicate_caching_state$ = makeSymbol("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_SOME_CVA_FOR_PREDICATE = makeSymbol("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE");

    private static final SubLSymbol CACHED_TVA_SPEC_PREDS_AND_INVERSES = makeSymbol("CACHED-TVA-SPEC-PREDS-AND-INVERSES");

    private static final SubLString $str45$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str50$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str52$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    static private final SubLString $str53$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str54$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLSymbol $cached_tva_spec_preds_and_inverses_caching_state$ = makeSymbol("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES = makeSymbol("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES");

    private static final SubLSymbol TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED = makeSymbol("TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED");

    private static final SubLSymbol $tva_pred_arg_values_for_tva_pred_cached_caching_state$ = makeSymbol("*TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLSymbol CLEAR_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED = makeSymbol("CLEAR-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED");

    private static final SubLList $list61 = list(list(makeSymbol("TRANS-PRED-VAR"), makeSymbol("TVA-PRED"), makeSymbol("PRED"), makeSymbol("ARGNUM"), makeSymbol("INVERSE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG = makeSymbol("TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG");

    private static final SubLSymbol $sym64$CACHED_ANY_TVA_FOR_ARG_ = makeSymbol("CACHED-ANY-TVA-FOR-ARG?");

    private static final SubLSymbol BEST_INVERSE_BINARY_PREDICATE = makeSymbol("BEST-INVERSE-BINARY-PREDICATE");

    private static final SubLString $$$Continue = makeString("Continue");

    private static final SubLString $str71$Error_in_tva_pred____a = makeString("Error in tva-pred : ~a");

    private static final SubLString $str74$Error_in_direction____a = makeString("Error in direction : ~a");

    private static final SubLList $list75 = list(list(makeSymbol("ARGNUM-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list76 = list(list(makeSymbol("TVA-TERM-ARGNUMS")));

    private static final SubLList $list77 = list(makeSymbol("VAR"), makeSymbol("ARGNUM"));







    public static final SubLObject get_tva_predicates_alt() {
        return $tva_predicates$.getGlobalValue();
    }

    public static SubLObject get_tva_predicates() {
        return $tva_predicates$.getGlobalValue();
    }

    public static final SubLObject do_tva_predicates_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    pred = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt1);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt1);
                            if (NIL == member(current_1, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt1);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(pred, $list_alt6, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_tva_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(pred, $list6, done), append(body, NIL));
    }

    public static final SubLObject tva_precomputes_sksi_closuresP_alt() {
        return $tva_precomputes_sksi_closuresP$.getGlobalValue();
    }

    public static SubLObject tva_precomputes_sksi_closuresP() {
        return $tva_precomputes_sksi_closuresP$.getGlobalValue();
    }

    public static final SubLObject tva_iterates_kb_predicate_extentP_alt() {
        return $tva_iterates_kb_predicate_extentP$.getGlobalValue();
    }

    public static SubLObject tva_iterates_kb_predicate_extentP() {
        return $tva_iterates_kb_predicate_extentP$.getGlobalValue();
    }

    public static final SubLObject tva_iterates_sksi_predicate_extentP_alt() {
        return $tva_iterates_sksi_predicate_extentP$.getGlobalValue();
    }

    public static SubLObject tva_iterates_sksi_predicate_extentP() {
        return $tva_iterates_sksi_predicate_extentP$.getGlobalValue();
    }

    public static final SubLObject tva_arg_admittance_okP_alt(SubLObject trans_pred, SubLObject tva_pred, SubLObject pred, SubLObject argnum, SubLObject inverseP) {
        {
            SubLObject gather_argnum = com.cyc.cycjava.cycl.tva_utilities.determine_tva_gather_argnum(argnum, inverseP);
            if (NIL != com.cyc.cycjava.cycl.tva_utilities.tva_relation_checks_arg_admittance_p(tva_pred, pred, trans_pred, gather_argnum)) {
                return com.cyc.cycjava.cycl.tva_utilities.tva_argument_admitted_p(gather_argnum);
            }
        }
        return T;
    }

    public static SubLObject tva_arg_admittance_okP(final SubLObject trans_pred, final SubLObject tva_pred, final SubLObject pred, final SubLObject argnum, final SubLObject inverseP) {
        if (NIL != kappa_predicate_p(trans_pred)) {
            return NIL;
        }
        final SubLObject gather_argnum = determine_tva_gather_argnum(argnum, inverseP);
        if ((NIL != tva_relation_checks_arg_admittance_p(tva_pred, pred, trans_pred, gather_argnum)) && (NIL == tva_argument_admitted_p(gather_argnum))) {
            return NIL;
        }
        return T;
    }

    /**
     *
     *
     * @return booleanp. Returns whether arg admittance is tested for tva relation specified by (TVA-PRED INDEX-PRED TRANS-PRED ARGNUM)
     */
    @LispMethod(comment = "@return booleanp. Returns whether arg admittance is tested for tva relation specified by (TVA-PRED INDEX-PRED TRANS-PRED ARGNUM)")
    public static final SubLObject tva_relation_checks_arg_admittance_p_alt(SubLObject tva_pred, SubLObject index_pred, SubLObject trans_pred, SubLObject argnum) {
        return list_utilities.sublisp_boolean(kb_indexing.find_gaf_in_relevant_mt(make_el_formula($const10$argAdmittanceTestedDuringTransiti, list(tva_pred, index_pred, trans_pred, argnum), UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp. Returns whether arg admittance is tested for tva relation specified by (TVA-PRED INDEX-PRED TRANS-PRED ARGNUM)
     */
    @LispMethod(comment = "@return booleanp. Returns whether arg admittance is tested for tva relation specified by (TVA-PRED INDEX-PRED TRANS-PRED ARGNUM)")
    public static SubLObject tva_relation_checks_arg_admittance_p(final SubLObject tva_pred, final SubLObject index_pred, final SubLObject trans_pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $tva_force_arg_admittance_checkingP$.getDynamicValue(thread)) || (NIL != list_utilities.sublisp_boolean(kb_indexing.find_gaf_in_relevant_mt(make_el_formula($const10$argAdmittanceTestedDuringTransiti, list(tva_pred, index_pred, trans_pred, argnum), UNPROVIDED)))));
    }

    /**
     *
     *
     * @return booleanp. Returns whether the ARGNUMth arg of the *tva-asent* is an admitted argument.
     */
    @LispMethod(comment = "@return booleanp. Returns whether the ARGNUMth arg of the *tva-asent* is an admitted argument.")
    public static final SubLObject tva_argument_admitted_p_alt(SubLObject argnum) {
        {
            SubLObject checkedP = tva_inference.tva_asent_arg_admitted(argnum);
            if (NIL != checkedP) {
                return eq(checkedP, T);
            }
        }
        {
            SubLObject admittedP = at_admitted.admitted_argumentP(tva_inference.tva_asent_arg(argnum), argnum, tva_inference.tva_asent_pred(), UNPROVIDED);
            if (NIL != admittedP) {
                tva_inference.set_tva_asent_arg_admitted(argnum);
            } else {
                tva_inference.set_tva_asent_arg_failed(argnum);
            }
            return eq(admittedP, T);
        }
    }

    /**
     *
     *
     * @return booleanp. Returns whether the ARGNUMth arg of the *tva-asent* is an admitted argument.
     */
    @LispMethod(comment = "@return booleanp. Returns whether the ARGNUMth arg of the *tva-asent* is an admitted argument.")
    public static SubLObject tva_argument_admitted_p(final SubLObject argnum) {
        final SubLObject checkedP = tva_inference.tva_asent_arg_admitted(argnum);
        if (NIL != checkedP) {
            return eq(checkedP, T);
        }
        final SubLObject admittedP = at_admitted.admitted_argumentP(tva_inference.tva_asent_arg(argnum), argnum, tva_inference.tva_asent_pred(), UNPROVIDED);
        if (NIL != admittedP) {
            tva_inference.set_tva_asent_arg_admitted(argnum);
        } else {
            tva_inference.set_tva_asent_arg_failed(argnum);
        }
        return eq(admittedP, T);
    }

    /**
     * Binds *tva-precompute-closure-theshold* to NUM.
     */
    @LispMethod(comment = "Binds *tva-precompute-closure-theshold* to NUM.")
    public static final SubLObject with_tva_precompute_closure_threshold_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject num = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            num = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, num, $list_alt15), listS(CLET, list(list($tva_precompute_closure_threshold$, num)), append(body, NIL)));
            }
        }
    }

    /**
     * Binds *tva-precompute-closure-theshold* to NUM.
     */
    @LispMethod(comment = "Binds *tva-precompute-closure-theshold* to NUM.")
    public static SubLObject with_tva_precompute_closure_threshold(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        num = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, num, $list15), listS(CLET, list(list($tva_precompute_closure_threshold$, num)), append(body, NIL)));
    }

    public static final SubLObject less_than_precompute_closure_thresholdP_alt(SubLObject cardinality) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return numL(cardinality, $tva_precompute_closure_threshold$.getDynamicValue(thread));
        }
    }

    public static SubLObject less_than_precompute_closure_thresholdP(final SubLObject cardinality) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numL(cardinality, $tva_precompute_closure_threshold$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return booleanp. Returns whether PRED is a valid for transitive predicate slots
    in #$transitiveViaArg[Inverse] assertions.
     */
    @LispMethod(comment = "@return booleanp. Returns whether PRED is a valid for transitive predicate slots\r\nin #$transitiveViaArg[Inverse] assertions.")
    public static final SubLObject tva_predicate_p_alt(SubLObject pred) {
        return fort_types_interface.transitive_binary_predicate_p(pred);
    }

    /**
     *
     *
     * @return booleanp. Returns whether PRED is a valid for transitive predicate slots
    in #$transitiveViaArg[Inverse] assertions.
     */
    @LispMethod(comment = "@return booleanp. Returns whether PRED is a valid for transitive predicate slots\r\nin #$transitiveViaArg[Inverse] assertions.")
    public static SubLObject tva_predicate_p(final SubLObject pred) {
        return fort_types_interface.transitive_binary_predicate_p(pred);
    }

    /**
     *
     *
     * @return booleanp. Returns whether PRED is a valid for transitive predicate slots
    in #$conservativeViaArg[Inverse] assertions.
     */
    @LispMethod(comment = "@return booleanp. Returns whether PRED is a valid for transitive predicate slots\r\nin #$conservativeViaArg[Inverse] assertions.")
    public static final SubLObject cva_predicate_p_alt(SubLObject pred) {
        return kb_accessors.binary_predicateP(pred);
    }

    /**
     *
     *
     * @return booleanp. Returns whether PRED is a valid for transitive predicate slots
    in #$conservativeViaArg[Inverse] assertions.
     */
    @LispMethod(comment = "@return booleanp. Returns whether PRED is a valid for transitive predicate slots\r\nin #$conservativeViaArg[Inverse] assertions.")
    public static SubLObject cva_predicate_p(final SubLObject pred) {
        return kb_accessors.binary_predicateP(pred);
    }

    /**
     *
     *
     * @return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.
     */
    @LispMethod(comment = "@return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.")
    public static final SubLObject tva_assertion_p_alt(SubLObject assertion) {
        return fort_types_interface.transitive_binary_predicate_p(assertions_high.gaf_arg2(assertion));
    }

    /**
     *
     *
     * @return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.
     */
    @LispMethod(comment = "@return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.")
    public static SubLObject tva_assertion_p(final SubLObject assertion) {
        return fort_types_interface.transitive_binary_predicate_p(assertions_high.gaf_arg2(assertion));
    }

    /**
     *
     *
     * @return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.
     */
    @LispMethod(comment = "@return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.")
    public static final SubLObject cva_assertion_p_alt(SubLObject assertion) {
        return kb_accessors.binary_predicateP(assertions_high.gaf_arg2(assertion));
    }

    /**
     *
     *
     * @return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.
     */
    @LispMethod(comment = "@return booleanp. Returns whether the arg 2 of ASSERTION is a GAF.")
    public static SubLObject cva_assertion_p(final SubLObject assertion) {
        return kb_accessors.binary_predicateP(assertions_high.gaf_arg2(assertion));
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE should has any pertinent TVA[I] assertions
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE should has any pertinent TVA[I] assertions")
    public static final SubLObject some_transitive_via_arg_assertionP_alt(SubLObject predicate) {
        return makeBoolean((NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$transitiveViaArg, TVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$transitiveViaArgInverse, TVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE should has any pertinent TVA[I] assertions
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE should has any pertinent TVA[I] assertions")
    public static SubLObject some_transitive_via_arg_assertionP(final SubLObject predicate) {
        return makeBoolean((NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$transitiveViaArg, TVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$transitiveViaArgInverse, TVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE should has any pertinent CVA[I] assertions
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE should has any pertinent CVA[I] assertions")
    public static final SubLObject some_conservative_via_arg_assertionP_alt(SubLObject predicate) {
        return makeBoolean((NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$conservativeViaArg, CVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$conservativeViaArgInverse, CVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE should has any pertinent CVA[I] assertions
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE should has any pertinent CVA[I] assertions")
    public static SubLObject some_conservative_via_arg_assertionP(final SubLObject predicate) {
        return makeBoolean((NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$conservativeViaArg, CVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value_if(predicate, $$conservativeViaArgInverse, CVA_ASSERTION_P, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE has a #$transitiveViaArg... assertion somewhere, and should use the :tva module
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE has a #$transitiveViaArg... assertion somewhere, and should use the :tva module")
    public static final SubLObject some_tva_for_predicate_alt(SubLObject predicate) {
        return com.cyc.cycjava.cycl.tva_utilities.cached_some_tva_for_predicate(predicate, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE has a #$transitiveViaArg... assertion somewhere, and should use the :tva module
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE has a #$transitiveViaArg... assertion somewhere, and should use the :tva module")
    public static SubLObject some_tva_for_predicate(final SubLObject predicate) {
        return cached_some_tva_for_predicate(predicate, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE has a #$conservativeViaArg... assertion somewhere should use the :tva module
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE has a #$conservativeViaArg... assertion somewhere should use the :tva module")
    public static final SubLObject some_cva_for_predicate_alt(SubLObject predicate) {
        return com.cyc.cycjava.cycl.tva_utilities.cached_some_cva_for_predicate(predicate, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp. Returns whether PREDICATE has a #$conservativeViaArg... assertion somewhere should use the :tva module
     */
    @LispMethod(comment = "@return booleanp. Returns whether PREDICATE has a #$conservativeViaArg... assertion somewhere should use the :tva module")
    public static SubLObject some_cva_for_predicate(final SubLObject predicate) {
        return cached_some_cva_for_predicate(predicate, UNPROVIDED);
    }

    public static final SubLObject clear_cached_some_tva_for_predicate_alt() {
        {
            SubLObject cs = $cached_some_tva_for_predicate_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_some_tva_for_predicate() {
        final SubLObject cs = $cached_some_tva_for_predicate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_some_tva_for_predicate_alt(SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_some_tva_for_predicate_caching_state$.getGlobalValue(), list(predicate, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_some_tva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_some_tva_for_predicate_caching_state$.getGlobalValue(), list(predicate, mt_info), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; Whether PREDICATE is the arg1 of any transitive-via assertion.
     */
    @LispMethod(comment = "@return booleanp; Whether PREDICATE is the arg1 of any transitive-via assertion.")
    public static final SubLObject cached_some_tva_for_predicate_internal_alt(SubLObject predicate, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                    ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                                    ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Whether PREDICATE is the arg1 of any transitive-via assertion.
     */
    @LispMethod(comment = "@return booleanp; Whether PREDICATE is the arg1 of any transitive-via assertion.")
    public static SubLObject cached_some_tva_for_predicate_internal(final SubLObject predicate, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return ans;
    }

    public static final SubLObject cached_some_tva_for_predicate_alt(SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            SubLObject caching_state = $cached_some_tva_for_predicate_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SOME_TVA_FOR_PREDICATE, $cached_some_tva_for_predicate_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$100);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_SOME_TVA_FOR_PREDICATE);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (predicate.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.tva_utilities.cached_some_tva_for_predicate_internal(predicate, mt_info)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt_info));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_some_tva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        SubLObject caching_state = $cached_some_tva_for_predicate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SOME_TVA_FOR_PREDICATE, $cached_some_tva_for_predicate_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$100);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_SOME_TVA_FOR_PREDICATE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_some_tva_for_predicate_internal(predicate, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_cached_some_cva_for_predicate_alt() {
        {
            SubLObject cs = $cached_some_cva_for_predicate_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_some_cva_for_predicate() {
        final SubLObject cs = $cached_some_cva_for_predicate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_some_cva_for_predicate_alt(SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_some_cva_for_predicate_caching_state$.getGlobalValue(), list(predicate, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_some_cva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_some_cva_for_predicate_caching_state$.getGlobalValue(), list(predicate, mt_info), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; Whether PREDICATE is the arg1 of any conservative-via assertion.
     */
    @LispMethod(comment = "@return booleanp; Whether PREDICATE is the arg1 of any conservative-via assertion.")
    public static final SubLObject cached_some_cva_for_predicate_internal_alt(SubLObject predicate, SubLObject mt_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                    ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                                    ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Whether PREDICATE is the arg1 of any conservative-via assertion.
     */
    @LispMethod(comment = "@return booleanp; Whether PREDICATE is the arg1 of any conservative-via assertion.")
    public static SubLObject cached_some_cva_for_predicate_internal(final SubLObject predicate, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym36$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return ans;
    }

    public static final SubLObject cached_some_cva_for_predicate_alt(SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        {
            SubLObject caching_state = $cached_some_cva_for_predicate_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SOME_CVA_FOR_PREDICATE, $cached_some_cva_for_predicate_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$100);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_SOME_CVA_FOR_PREDICATE);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (predicate.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.tva_utilities.cached_some_cva_for_predicate_internal(predicate, mt_info)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt_info));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_some_cva_for_predicate(final SubLObject predicate, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        SubLObject caching_state = $cached_some_cva_for_predicate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SOME_CVA_FOR_PREDICATE, $cached_some_cva_for_predicate_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$100);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_SOME_CVA_FOR_PREDICATE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_some_cva_for_predicate_internal(predicate, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject tva_spec_preds_and_inverses(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.tva_utilities.cached_tva_spec_preds_and_inverses(predicate, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread));
        }
    }

    public static SubLObject tva_spec_preds_and_inverses(final SubLObject predicate, SubLObject prove_negationP) {
        if (prove_negationP == UNPROVIDED) {
            prove_negationP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == prove_negationP) {
            return cached_tva_spec_preds_and_inverses(predicate, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), UNPROVIDED);
        }
        SubLObject spec_preds = NIL;
        SubLObject spec_inverses = NIL;
        SubLObject cdolist_list_var = negation_predicate.local_negation_predicates(predicate, UNPROVIDED, UNPROVIDED);
        SubLObject negpred = NIL;
        negpred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_spec_preds = cached_tva_spec_preds_and_inverses(negpred, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), UNPROVIDED);
            final SubLObject this_spec_inverses = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$2 = this_spec_preds;
            SubLObject this_spec_pred = NIL;
            this_spec_pred = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject item_var = this_spec_pred;
                if (NIL == member(item_var, spec_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    spec_preds = cons(item_var, spec_preds);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                this_spec_pred = cdolist_list_var_$2.first();
            } 
            SubLObject cdolist_list_var_$3 = this_spec_inverses;
            SubLObject this_spec_inverse = NIL;
            this_spec_inverse = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject item_var = this_spec_inverse;
                if (NIL == member(item_var, spec_inverses, symbol_function(EQL), symbol_function(IDENTITY))) {
                    spec_inverses = cons(item_var, spec_inverses);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                this_spec_inverse = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            negpred = cdolist_list_var.first();
        } 
        cdolist_list_var = negation_predicate.local_negation_inverses(predicate, UNPROVIDED, UNPROVIDED);
        SubLObject neginversepred = NIL;
        neginversepred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_spec_inverses2 = cached_tva_spec_preds_and_inverses(neginversepred, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), T);
            final SubLObject this_spec_preds2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$4 = this_spec_preds2;
            SubLObject this_spec_pred = NIL;
            this_spec_pred = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                final SubLObject item_var = this_spec_pred;
                if (NIL == member(item_var, spec_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    spec_preds = cons(item_var, spec_preds);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                this_spec_pred = cdolist_list_var_$4.first();
            } 
            SubLObject cdolist_list_var_$5 = this_spec_inverses2;
            SubLObject this_spec_inverse = NIL;
            this_spec_inverse = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                final SubLObject item_var = this_spec_inverse;
                if (NIL == member(item_var, spec_inverses, symbol_function(EQL), symbol_function(IDENTITY))) {
                    spec_inverses = cons(item_var, spec_inverses);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                this_spec_inverse = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            neginversepred = cdolist_list_var.first();
        } 
        return values(genl_predicates.max_predicates(spec_preds, UNPROVIDED, UNPROVIDED), genl_predicates.max_predicates(spec_inverses, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject clear_cached_tva_spec_preds_and_inverses_alt() {
        {
            SubLObject cs = $cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_tva_spec_preds_and_inverses() {
        final SubLObject cs = $cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_tva_spec_preds_and_inverses(SubLObject predicate, SubLObject mt, SubLObject relevant_mt_function) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue(), list(predicate, mt, relevant_mt_function), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_tva_spec_preds_and_inverses(final SubLObject predicate, final SubLObject mt, final SubLObject relevant_mt_function, SubLObject predicate_already_inverseP) {
        if (predicate_already_inverseP == UNPROVIDED) {
            predicate_already_inverseP = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue(), list(predicate, mt, relevant_mt_function, predicate_already_inverseP), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the list of specPreds/Inverses in which to do a TVA search for PREDICATE
     */
    @LispMethod(comment = "@return listp; the list of specPreds/Inverses in which to do a TVA search for PREDICATE")
    public static final SubLObject cached_tva_spec_preds_and_inverses_internal(SubLObject predicate, SubLObject mt, SubLObject relevant_mt_function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != com.cyc.cycjava.cycl.tva_utilities.some_transitive_via_arg_assertionP(predicate)) || (NIL != com.cyc.cycjava.cycl.tva_utilities.some_conservative_via_arg_assertionP(predicate))) {
                return values(list(predicate), NIL);
            } else {
                {
                    SubLObject spec_preds = NIL;
                    SubLObject spec_inverses = NIL;
                    SubLObject node_var = predicate;
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
                                    SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
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
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var.eql($WARN)) {
                                                                    Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                } else {
                                                                    Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                    {
                                                        SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                        SubLObject _prev_bind_2_7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                            node_and_predicate_mode = list(predicate, sbhl_search_vars.genl_inverse_mode_p());
                                                            while (NIL != node_and_predicate_mode) {
                                                                {
                                                                    SubLObject node_var_8 = node_and_predicate_mode.first();
                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                    SubLObject spec = node_var_8;
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                            {
                                                                                SubLObject inverse_mode_p = predicate_mode;
                                                                                if ((NIL != com.cyc.cycjava.cycl.tva_utilities.some_transitive_via_arg_assertionP(spec)) || (NIL != com.cyc.cycjava.cycl.tva_utilities.some_conservative_via_arg_assertionP(spec))) {
                                                                                    if (NIL != inverse_mode_p) {
                                                                                        spec_inverses = cons(spec, spec_inverses);
                                                                                    } else {
                                                                                        spec_preds = cons(spec, spec_preds);
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_8);
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
                                                                                                                                    SubLObject mt_12 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_12)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_12, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_14)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_14);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_16 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , node_vars_link_node = cdolist_list_var_16.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_15, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_14 = dictionary_contents.do_dictionary_contents_next(iteration_state_14);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_14);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_13, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt53$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_17 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , generating_fn = cdolist_list_var_17.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_19 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_20 = new_list_19;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , node_vars_link_node = cdolist_list_var_20.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_18, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_11, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_10, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                }
                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                            } 
                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_7, thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_6, thread);
                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt54$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_4, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return values(genl_predicates.max_predicates(spec_preds, UNPROVIDED, UNPROVIDED), genl_predicates.max_predicates(spec_inverses, UNPROVIDED, UNPROVIDED));
                }
            }
        }
    }

    public static SubLObject cached_tva_spec_preds_and_inverses_internal(final SubLObject predicate, final SubLObject mt, final SubLObject relevant_mt_function, final SubLObject predicate_already_inverseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != some_transitive_via_arg_assertionP(predicate)) || (NIL != some_conservative_via_arg_assertionP(predicate))) {
            return values(list(predicate), NIL);
        }
        SubLObject spec_preds = NIL;
        SubLObject spec_inverses = NIL;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str50$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(predicate, UNPROVIDED);
                                for (node_and_predicate_mode = list(predicate, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$12 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec = node_var_$12;
                                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverse_mode_p = predicate_mode;
                                        if ((NIL != some_transitive_via_arg_assertionP(spec)) || (NIL != some_conservative_via_arg_assertionP(spec))) {
                                            if (!makeBoolean(NIL == inverse_mode_p).eql(makeBoolean(NIL == predicate_already_inverseP))) {
                                                spec_inverses = cons(spec, spec_inverses);
                                            } else {
                                                spec_preds = cons(spec, spec_preds);
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$12);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$16)) {
                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$16, thread);
                                                                        SubLObject iteration_state_$18;
                                                                        for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str52$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$12, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$11, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str53$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$20;
                                                        final SubLObject new_list = cdolist_list_var_$20 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$20.first();
                                                        while (NIL != cdolist_list_var_$20) {
                                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str52$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$13, thread);
                                                            }
                                                            cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                                            generating_fn = cdolist_list_var_$20.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$10, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str54$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return values(genl_predicates.max_predicates(spec_preds, UNPROVIDED, UNPROVIDED), genl_predicates.max_predicates(spec_inverses, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cached_tva_spec_preds_and_inverses(SubLObject predicate, SubLObject mt, SubLObject relevant_mt_function) {
        {
            SubLObject caching_state = $cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_TVA_SPEC_PREDS_AND_INVERSES, $cached_tva_spec_preds_and_inverses_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, mt, relevant_mt_function);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (predicate.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && relevant_mt_function.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.tva_utilities.cached_tva_spec_preds_and_inverses_internal(predicate, mt, relevant_mt_function)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt, relevant_mt_function));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject cached_tva_spec_preds_and_inverses(final SubLObject predicate, final SubLObject mt, final SubLObject relevant_mt_function, SubLObject predicate_already_inverseP) {
        if (predicate_already_inverseP == UNPROVIDED) {
            predicate_already_inverseP = NIL;
        }
        SubLObject caching_state = $cached_tva_spec_preds_and_inverses_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_TVA_SPEC_PREDS_AND_INVERSES, $cached_tva_spec_preds_and_inverses_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, mt, relevant_mt_function, predicate_already_inverseP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (relevant_mt_function.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && predicate_already_inverseP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_tva_spec_preds_and_inverses_internal(predicate, mt, relevant_mt_function, predicate_already_inverseP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt, relevant_mt_function, predicate_already_inverseP));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return listp; Returns the transitive predicates, X, s.t. (TVA-PRED INDEX-PRED X ARGNUM).
     */
    @LispMethod(comment = "@return listp; Returns the transitive predicates, X, s.t. (TVA-PRED INDEX-PRED X ARGNUM).")
    public static final SubLObject tva_gather_transitive_predicates_for_arg(SubLObject tva_pred, SubLObject index_pred, SubLObject argnum, SubLObject inverseP) {
        return NIL != somewhere_cache.some_pred_assertion_somewhereP(tva_pred, index_pred, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) (kb_mapping_utilities.pred_arg_values(index_pred, tva_pred, com.cyc.cycjava.cycl.tva_utilities.determine_tva_gather_argnum(argnum, inverseP), ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED))) : NIL;
    }

    public static SubLObject tva_gather_transitive_predicates_for_arg(final SubLObject tva_pred, final SubLObject index_pred, final SubLObject argnum, final SubLObject inverseP, SubLObject just_oneP) {
        if (just_oneP == UNPROVIDED) {
            just_oneP = NIL;
        }
        return NIL != somewhere_cache.some_pred_assertion_somewhereP(tva_pred, index_pred, ONE_INTEGER, UNPROVIDED) ? NIL != just_oneP ? kb_mapping_utilities.fpred_arg_value(index_pred, tva_pred, determine_tva_gather_argnum(argnum, inverseP), ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED) : kb_mapping_utilities.pred_arg_values(index_pred, tva_pred, determine_tva_gather_argnum(argnum, inverseP), ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject clear_tva_pred_arg_values_for_tva_pred_cached() {
        final SubLObject cs = $tva_pred_arg_values_for_tva_pred_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_tva_pred_arg_values_for_tva_pred_cached(final SubLObject index_pred, final SubLObject tva_pred, final SubLObject arg, final SubLObject mt, final SubLObject term_psn, final SubLObject arg_psn, final SubLObject gather_psn) {
        return memoization_state.caching_state_remove_function_results_with_args($tva_pred_arg_values_for_tva_pred_cached_caching_state$.getGlobalValue(), list(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tva_pred_arg_values_for_tva_pred_cached_internal(final SubLObject index_pred, final SubLObject tva_pred, final SubLObject arg, final SubLObject mt, final SubLObject term_psn, final SubLObject arg_psn, final SubLObject gather_psn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = kb_mapping_utilities.pred_arg_values(index_pred, tva_pred, arg, term_psn, arg_psn, gather_psn, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject tva_pred_arg_values_for_tva_pred_cached(final SubLObject index_pred, final SubLObject tva_pred, final SubLObject arg, final SubLObject mt, final SubLObject term_psn, final SubLObject arg_psn, final SubLObject gather_psn) {
        SubLObject caching_state = $tva_pred_arg_values_for_tva_pred_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED, $tva_pred_arg_values_for_tva_pred_cached_caching_state$, $int$2048, EQL, SEVEN_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (index_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (tva_pred.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (arg.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (term_psn.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (arg_psn.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && gather_psn.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(tva_pred_arg_values_for_tva_pred_cached_internal(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(index_pred, tva_pred, arg, mt, term_psn, arg_psn, gather_psn));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject do_trans_preds_for_arg_with_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject trans_pred_var = NIL;
                    SubLObject tva_pred = NIL;
                    SubLObject pred = NIL;
                    SubLObject argnum = NIL;
                    SubLObject inverseP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    trans_pred_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    tva_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    inverseP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, list(trans_pred_var, list(TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG, tva_pred, pred, argnum, inverseP)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_trans_preds_for_arg_with_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject trans_pred_var = NIL;
        SubLObject tva_pred = NIL;
        SubLObject pred = NIL;
        SubLObject argnum = NIL;
        SubLObject inverseP = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        trans_pred_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        tva_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        argnum = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        inverseP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(trans_pred_var, list(TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG, tva_pred, pred, argnum, inverseP)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list61);
        return NIL;
    }

    /**
     * For PRED, are there any tva assertions that apply to arg ARGNUM?
     */
    @LispMethod(comment = "For PRED, are there any tva assertions that apply to arg ARGNUM?")
    public static final SubLObject any_tva_for_argP_alt(SubLObject pred, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.tva_utilities.cached_any_tva_for_argP(pred, argnum, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread));
        }
    }

    /**
     * For PRED, are there any tva assertions that apply to arg ARGNUM?
     */
    @LispMethod(comment = "For PRED, are there any tva assertions that apply to arg ARGNUM?")
    public static SubLObject any_tva_for_argP(final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cached_any_tva_for_argP(pred, argnum, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread));
    }

    public static final SubLObject cached_any_tva_for_argP_internal_alt(SubLObject pred, SubLObject argnum, SubLObject mt, SubLObject relevant_mt_function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                if (NIL == foundP) {
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
                                        SubLObject _prev_bind_0_21 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
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
                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else {
                                                                if (pcase_var.eql($CERROR)) {
                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($WARN)) {
                                                                        Errors.warn($str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    } else {
                                                                        Errors.warn($str_alt51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                        Errors.cerror($$$continue_anyway, $str_alt46$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                SubLObject _prev_bind_1_23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                while ((NIL != node_and_predicate_mode) && (NIL == foundP)) {
                                                                    {
                                                                        SubLObject node_var_27 = node_and_predicate_mode.first();
                                                                        SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                        SubLObject spec_pred = node_var_27;
                                                                        {
                                                                            SubLObject _prev_bind_0_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                {
                                                                                    SubLObject inverse_modeP = predicate_mode;
                                                                                    if (NIL == foundP) {
                                                                                        {
                                                                                            SubLObject csome_list_var = com.cyc.cycjava.cycl.tva_utilities.get_tva_predicates();
                                                                                            SubLObject tva_pred = NIL;
                                                                                            for (tva_pred = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , tva_pred = csome_list_var.first()) {
                                                                                                if (NIL != com.cyc.cycjava.cycl.tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, spec_pred, argnum, inverse_modeP)) {
                                                                                                    foundP = T;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                        SubLObject rest = NIL;
                                                                                        for (rest = accessible_modules; !((NIL != foundP) || (NIL == rest)); rest = rest.rest()) {
                                                                                            {
                                                                                                SubLObject module_var = rest.first();
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_27);
                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                {
                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != d_link) {
                                                                                                                        {
                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != mt_links) {
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                    while (!((NIL != foundP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject mt_31 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_31)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_31, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (!((NIL != foundP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_33)))) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_33);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject rest_35 = NIL;
                                                                                                                                                                                    for (rest_35 = new_list; !((NIL != foundP) || (NIL == rest_35)); rest_35 = rest_35.rest()) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject node_vars_link_node = rest_35.first();
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_34, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_33 = dictionary_contents.do_dictionary_contents_next(iteration_state_33);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_33);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_32, thread);
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
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt53$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject rest_36 = NIL;
                                                                                                                        for (rest_36 = new_list; !((NIL != foundP) || (NIL == rest_36)); rest_36 = rest_36.rest()) {
                                                                                                                            {
                                                                                                                                SubLObject generating_fn = rest_36.first();
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject rest_39 = NIL;
                                                                                                                                            for (rest_39 = new_list_38; !((NIL != foundP) || (NIL == rest_39)); rest_39 = rest_39.rest()) {
                                                                                                                                                {
                                                                                                                                                    SubLObject node_vars_link_node = rest_39.first();
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_37, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_30, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_29, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_28, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                } 
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_26, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_25, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_24, thread);
                                                            }
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt54$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_23, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_22, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_21, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return foundP;
            }
        }
    }

    public static SubLObject cached_any_tva_for_argP_internal(final SubLObject pred, final SubLObject argnum, final SubLObject mt, final SubLObject relevant_mt_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str50$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == foundP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$29 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$29;
                                        final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverse_modeP = predicate_mode;
                                            if (NIL == foundP) {
                                                SubLObject csome_list_var = get_tva_predicates();
                                                SubLObject tva_pred = NIL;
                                                tva_pred = csome_list_var.first();
                                                while ((NIL == foundP) && (NIL != csome_list_var)) {
                                                    if (NIL != tva_gather_transitive_predicates_for_arg(tva_pred, spec_pred, argnum, inverse_modeP, T)) {
                                                        foundP = T;
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    tva_pred = csome_list_var.first();
                                                } 
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$27;
                                            SubLObject _prev_bind_1_$27;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$33;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$28;
                                            SubLObject iteration_state_$35;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$29;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$37;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$30;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var_$29);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$33 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$33)) {
                                                                        _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$33, thread);
                                                                            for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35)); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == foundP) {
                                                                                                    csome_list_var2 = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                    while ((NIL == foundP) && (NIL != csome_list_var2)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str52$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str53$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$37 = NIL, rest_$37 = new_list; (NIL == foundP) && (NIL != rest_$37); rest_$37 = rest_$37.rest()) {
                                                                generating_fn = rest_$37.first();
                                                                _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == foundP) {
                                                                                csome_list_var3 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                while ((NIL == foundP) && (NIL != csome_list_var3)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str52$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$27, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$25, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str54$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$24, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$23, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return foundP;
    }

    public static final SubLObject cached_any_tva_for_argP_alt(SubLObject pred, SubLObject argnum, SubLObject mt, SubLObject relevant_mt_function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.tva_utilities.cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym60$CACHED_ANY_TVA_FOR_ARG_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym60$CACHED_ANY_TVA_FOR_ARG_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym60$CACHED_ANY_TVA_FOR_ARG_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(pred, argnum, mt, relevant_mt_function);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pred.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (argnum.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (mt.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && relevant_mt_function.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.tva_utilities.cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, argnum, mt, relevant_mt_function));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject cached_any_tva_for_argP(final SubLObject pred, final SubLObject argnum, final SubLObject mt, final SubLObject relevant_mt_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym64$CACHED_ANY_TVA_FOR_ARG_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym64$CACHED_ANY_TVA_FOR_ARG_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym64$CACHED_ANY_TVA_FOR_ARG_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(pred, argnum, mt, relevant_mt_function);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && relevant_mt_function.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, argnum, mt, relevant_mt_function));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject tva_pred_signature(final SubLObject asent_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject raw_result = NIL;
        if (NIL != fort_types_interface.transitive_binary_predicate_p(asent_pred)) {
            raw_result = list_utilities.alist_push(raw_result, list(ONE_INTEGER, $TVAI), asent_pred, symbol_function(EQUAL));
            raw_result = list_utilities.alist_push(raw_result, list(TWO_INTEGER, $TVA), asent_pred, symbol_function(EQUAL));
        }
        if (NIL != fort_types_interface.predicate_p(asent_pred)) {
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str50$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str45$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(asent_pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(asent_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$46 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject pred = node_var_$46;
                                        final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverse_modeP = predicate_mode;
                                            SubLObject csome_list_var = get_tva_predicates();
                                            SubLObject tva_pred = NIL;
                                            tva_pred = csome_list_var.first();
                                            while (NIL != csome_list_var) {
                                                SubLObject cdotimes_end_var;
                                                SubLObject num;
                                                SubLObject argnum;
                                                SubLObject cdolist_list_var;
                                                SubLObject preds;
                                                SubLObject pred_$48;
                                                SubLObject pcase_var2;
                                                for (cdotimes_end_var = arity.arity(asent_pred), num = NIL, num = ZERO_INTEGER; num.numL(cdotimes_end_var); num = add(num, ONE_INTEGER)) {
                                                    argnum = add(ONE_INTEGER, num);
                                                    if ((NIL == inverse_modeP) || (NIL != misc_utilities.other_binary_arg(argnum))) {
                                                        preds = cdolist_list_var = tva_gather_transitive_predicates_for_arg(tva_pred, pred, argnum, NIL, UNPROVIDED);
                                                        pred_$48 = NIL;
                                                        pred_$48 = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            pcase_var2 = tva_pred;
                                                            if (pcase_var2.eql($$transitiveViaArg) || pcase_var2.eql($$conservativeViaArg)) {
                                                                if (NIL != inverse_modeP) {
                                                                    raw_result = list_utilities.alist_push(raw_result, list(misc_utilities.other_binary_arg(argnum), $TVA), pred_$48, symbol_function(EQUAL));
                                                                } else {
                                                                    raw_result = list_utilities.alist_push(raw_result, list(argnum, $TVA), pred_$48, symbol_function(EQUAL));
                                                                }
                                                            } else
                                                                if (pcase_var2.eql($$transitiveViaArgInverse) || pcase_var2.eql($$conservativeViaArgInverse)) {
                                                                    if (NIL != inverse_modeP) {
                                                                        raw_result = list_utilities.alist_push(raw_result, list(misc_utilities.other_binary_arg(argnum), $TVAI), pred_$48, symbol_function(EQUAL));
                                                                    } else {
                                                                        raw_result = list_utilities.alist_push(raw_result, list(argnum, $TVAI), pred_$48, symbol_function(EQUAL));
                                                                    }
                                                                }

                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            pred_$48 = cdolist_list_var.first();
                                                        } 
                                                    }
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                tva_pred = csome_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$46);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$52;
                                                                            for (iteration_state_$52 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$52); iteration_state_$52 = dictionary_contents.do_dictionary_contents_next(iteration_state_$52)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$52);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var2 = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (NIL != csome_list_var2) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str52$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$46, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$52);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$45, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str53$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$54;
                                                            final SubLObject new_list = cdolist_list_var_$54 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$54.first();
                                                            while (NIL != cdolist_list_var_$54) {
                                                                final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str52$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$47, thread);
                                                                }
                                                                cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                                                                generating_fn = cdolist_list_var_$54.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$44, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$44, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var = cdolist_list_var2.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$43, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$45, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$43, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$42, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str54$Node__a_does_not_pass_sbhl_type_t, asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$42, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$41, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$40, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject result = NIL;
        if (NIL != raw_result) {
            SubLObject cdotimes_end_var2;
            SubLObject num2;
            SubLObject argnum2;
            SubLObject tva;
            SubLObject tvai;
            SubLObject tva_to_tvai;
            SubLObject tvai_to_tva;
            for (cdotimes_end_var2 = arity.arity(asent_pred), num2 = NIL, num2 = ZERO_INTEGER; num2.numL(cdotimes_end_var2); num2 = add(num2, ONE_INTEGER)) {
                argnum2 = add(ONE_INTEGER, num2);
                tva = list_utilities.alist_lookup(raw_result, list(argnum2, $TVA), symbol_function(EQUAL), UNPROVIDED);
                tvai = list_utilities.alist_lookup(raw_result, list(argnum2, $TVAI), symbol_function(EQUAL), UNPROVIDED);
                if ((NIL != tva) && (NIL != tvai)) {
                    tva_to_tvai = Mapping.mapcar(BEST_INVERSE_BINARY_PREDICATE, tva);
                    tvai_to_tva = Mapping.mapcar(BEST_INVERSE_BINARY_PREDICATE, tvai);
                    if (NIL == list_utilities.member_eqP(NIL, tvai_to_tva)) {
                        result = list_utilities.alist_enter(result, list(argnum2, $TVA), genl_predicates.min_predicates(append(tva, tvai_to_tva), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    } else
                        if (NIL == list_utilities.member_eqP(NIL, tva_to_tvai)) {
                            result = list_utilities.alist_enter(result, list(argnum2, $TVAI), genl_predicates.min_predicates(append(tvai, tva_to_tvai), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        } else {
                            result = list_utilities.alist_enter(result, list(argnum2, $TVA), genl_predicates.min_predicates(tva, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                            result = list_utilities.alist_enter(result, list(argnum2, $TVAI), genl_predicates.min_predicates(tvai, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }

                } else
                    if (NIL != tva) {
                        result = list_utilities.alist_enter(result, list(argnum2, $TVA), genl_predicates.min_predicates(tva, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    } else
                        if (NIL != tvai) {
                            result = list_utilities.alist_enter(result, list(argnum2, $TVAI), genl_predicates.min_predicates(tvai, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        }


            }
        }
        return nreverse(result);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("transitiveViaArg"), reader_make_constant_shell("transitiveViaArgInverse"), reader_make_constant_shell("conservativeViaArg"), reader_make_constant_shell("conservativeViaArgInverse"));

    static private final SubLList $list_alt1 = list(list(makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list($DONE);

    static private final SubLList $list_alt6 = list(makeSymbol("GET-TVA-PREDICATES"));

    public static final SubLInteger $int$60 = makeInteger(60);

    static private final SubLList $list_alt12 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt15 = list(makeSymbol("INTEGERP"));

    public static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_ = makeSymbol("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?");

    static private final SubLString $str_alt46$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt51$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt53$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt54$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt57 = list(list(makeSymbol("TRANS-PRED-VAR"), makeSymbol("TVA-PRED"), makeSymbol("PRED"), makeSymbol("ARGNUM"), makeSymbol("INVERSE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym60$CACHED_ANY_TVA_FOR_ARG_ = makeSymbol("CACHED-ANY-TVA-FOR-ARG?");

    static private final SubLString $str_alt64$Error_in_tva_pred____a = makeString("Error in tva-pred : ~a");

    static private final SubLString $str_alt67$Error_in_direction____a = makeString("Error in direction : ~a");

    static private final SubLList $list_alt68 = list(list(makeSymbol("ARGNUM-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt69 = list(list(makeSymbol("TVA-TERM-ARGNUMS")));

    static private final SubLList $list_alt70 = list(makeSymbol("VAR"), makeSymbol("ARGNUM"));

    public static final SubLObject tva_direction_for_tva_pred_alt(SubLObject tva_pred) {
        {
            SubLObject pcase_var = tva_pred;
            if (pcase_var.eql($$transitiveViaArg) || pcase_var.eql($$conservativeViaArg)) {
                return $BACKWARD;
            } else {
                if (pcase_var.eql($$transitiveViaArgInverse) || pcase_var.eql($$conservativeViaArgInverse)) {
                    return $FORWARD;
                } else {
                    return Errors.cerror($$$Continue, $str_alt64$Error_in_tva_pred____a, tva_pred);
                }
            }
        }
    }

    public static SubLObject tva_direction_for_tva_pred(final SubLObject tva_pred) {
        if (tva_pred.eql($$transitiveViaArg) || tva_pred.eql($$conservativeViaArg)) {
            return $BACKWARD;
        }
        if (tva_pred.eql($$transitiveViaArgInverse) || tva_pred.eql($$conservativeViaArgInverse)) {
            return $FORWARD;
        }
        return Errors.cerror($$$Continue, $str71$Error_in_tva_pred____a, tva_pred);
    }

    public static final SubLObject tva_direction_to_sbhl_direction_alt(SubLObject direction) {
        {
            SubLObject pcase_var = direction;
            if (pcase_var.eql($FORWARD)) {
                return $PREDICATE;
            } else {
                if (pcase_var.eql($BACKWARD)) {
                    return $INVERSE;
                } else {
                    return Errors.cerror($$$Continue, $str_alt67$Error_in_direction____a, direction);
                }
            }
        }
    }

    public static SubLObject tva_direction_to_sbhl_direction(final SubLObject direction) {
        if (direction.eql($FORWARD)) {
            return $PREDICATE;
        }
        if (direction.eql($BACKWARD)) {
            return $INVERSE;
        }
        return Errors.cerror($$$Continue, $str74$Error_in_direction____a, direction);
    }

    public static final SubLObject tva_direction_to_ghl_direction_alt(SubLObject direction) {
        return direction;
    }

    public static SubLObject tva_direction_to_ghl_direction(final SubLObject direction) {
        return direction;
    }

    public static final SubLObject tva_direction_to_ghl_closure_direction_alt(SubLObject direction) {
        {
            SubLObject pcase_var = direction;
            if (pcase_var.eql($FORWARD)) {
                return $BACKWARD;
            } else {
                if (pcase_var.eql($BACKWARD)) {
                    return $FORWARD;
                } else {
                    return Errors.cerror($$$Continue, $str_alt67$Error_in_direction____a, direction);
                }
            }
        }
    }

    public static SubLObject tva_direction_to_ghl_closure_direction(final SubLObject direction) {
        if (direction.eql($FORWARD)) {
            return $BACKWARD;
        }
        if (direction.eql($BACKWARD)) {
            return $FORWARD;
        }
        return Errors.cerror($$$Continue, $str74$Error_in_direction____a, direction);
    }

    public static final SubLObject determine_tva_gather_argnum_alt(SubLObject argnum, SubLObject inverseP) {
        if (NIL != inverseP) {
            return other_binary_arg(argnum);
        } else {
            return argnum;
        }
    }

    public static SubLObject determine_tva_gather_argnum(final SubLObject argnum, final SubLObject inverseP) {
        if (NIL != inverseP) {
            return misc_utilities.other_binary_arg(argnum);
        }
        return argnum;
    }

    public static final SubLObject do_tva_term_argnums_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt68);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argnum_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt68);
                    argnum_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, bq_cons(argnum_var, $list_alt69), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt68);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_tva_term_argnums(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argnum_var = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        argnum_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, bq_cons(argnum_var, $list76), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list75);
        return NIL;
    }

    public static final SubLObject tva_precomputation_p_alt(SubLObject obj) {
        return makeBoolean((NIL != sbhl_marking_vars.sbhl_table_p(obj)) || (NIL != ghl_search_utilities.ghl_table_p(obj)));
    }

    public static SubLObject tva_precomputation_p(final SubLObject obj) {
        return makeBoolean((NIL != sbhl_marking_vars.sbhl_table_p(obj)) || (NIL != ghl_search_utilities.ghl_table_p(obj)));
    }

    /**
     * Unifies the variables of the *tva-asent* with the associated terms in ASSERTION.
     */
    @LispMethod(comment = "Unifies the variables of the *tva-asent* with the associated terms in ASSERTION.")
    public static final SubLObject tva_unify_vars_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = tva_inference.tva_var_argnums();
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject var = NIL;
                        SubLObject argnum = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt70);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt70);
                        argnum = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject gather_argnum = com.cyc.cycjava.cycl.tva_utilities.determine_tva_gather_argnum(argnum, sbhl_search_vars.genl_inverse_mode_p());
                                SubLObject sentence_arg = cycl_utilities.atomic_sentence_arg(sentence, gather_argnum, UNPROVIDED);
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = unification_utilities.term_unify(var, sentence_arg, UNPROVIDED, UNPROVIDED);
                                    SubLObject justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = nconc(v_bindings, result);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt70);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Unifies the variables of the *tva-asent* with the associated terms in ASSERTION.
     */
    @LispMethod(comment = "Unifies the variables of the *tva-asent* with the associated terms in ASSERTION.")
    public static SubLObject tva_unify_vars(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tva_inference.tva_var_argnums();
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject var = NIL;
            SubLObject argnum = NIL;
            destructuring_bind_must_consp(current, datum, $list77);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list77);
            argnum = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject gather_argnum = determine_tva_gather_argnum(argnum, sbhl_search_vars.genl_inverse_mode_p());
                final SubLObject sentence_arg = cycl_utilities.atomic_sentence_arg(sentence, gather_argnum, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(var, sentence_arg, UNPROVIDED, UNPROVIDED);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = nconc(v_bindings, result);
            } else {
                cdestructuring_bind_error(datum, $list77);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject tva_support_module_for_pred_alt(SubLObject pred) {
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            return sbhl_module_utilities.sbhl_pred_get_hl_module(pred);
        } else {
            if (NIL != fort_types_interface.transitive_binary_predicate_p(pred)) {
                return $TRANSITIVITY;
            } else {
                return $CONTEXTUAL_TRANSITIVITY;
            }
        }
    }

    public static SubLObject tva_support_module_for_pred(final SubLObject pred) {
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            return sbhl_module_utilities.sbhl_pred_get_hl_module(pred);
        }
        if (NIL != fort_types_interface.transitive_binary_predicate_p(pred)) {
            return $TRANSITIVITY;
        }
        return $CONTEXTUAL_TRANSITIVITY;
    }

    public static final SubLObject genl_preds_support_from_pred_to_pred_alt(SubLObject from_pred, SubLObject to_pred, SubLObject inverseP) {
        if (NIL != inverseP) {
            return arguments.make_hl_support($GENLPREDS, list($$genlInverse, from_pred, to_pred), UNPROVIDED, UNPROVIDED);
        } else {
            return arguments.make_hl_support($GENLPREDS, list($$genlPreds, from_pred, to_pred), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject genl_preds_support_from_pred_to_pred(final SubLObject from_pred, final SubLObject to_pred, final SubLObject inverseP) {
        final SubLObject negationP = makeBoolean(((NIL == inverseP) && (NIL != negation_predicate.negation_predP(from_pred, to_pred, UNPROVIDED))) || ((NIL != inverseP) && (NIL != negation_predicate.negation_inverseP(from_pred, to_pred, UNPROVIDED, UNPROVIDED))));
        final SubLObject pred = (NIL != negationP) ? NIL != inverseP ? $$negationInverse : $$negationPreds : NIL != inverseP ? $$genlInverse : $$genlPreds;
        return arguments.make_hl_support($GENLPREDS, list(pred, from_pred, to_pred), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject genl_preds_support_from_pred_to_tva_pred_alt(SubLObject pred, SubLObject inverseP) {
        return com.cyc.cycjava.cycl.tva_utilities.genl_preds_support_from_pred_to_pred(pred, tva_inference.tva_asent_pred(), inverseP);
    }

    public static SubLObject genl_preds_support_from_pred_to_tva_pred(final SubLObject pred, final SubLObject inverseP) {
        return genl_preds_support_from_pred_to_pred(pred, tva_inference.tva_asent_pred(), inverseP);
    }

    public static final SubLObject tva_assertion_support_alt(SubLObject tva_pred, SubLObject pred, SubLObject trans_pred, SubLObject argnum) {
        if (pred == trans_pred) {
            return arguments.make_hl_support($CODE, list(tva_pred, pred, trans_pred, argnum), UNPROVIDED, UNPROVIDED);
        } else {
            return kb_indexing.find_gaf_in_relevant_mt(list(tva_pred, pred, trans_pred, argnum));
        }
    }

    public static SubLObject tva_assertion_support(final SubLObject tva_pred, final SubLObject pred, final SubLObject trans_pred, final SubLObject argnum) {
        if (pred.eql(trans_pred)) {
            return arguments.make_hl_support($CODE, list(tva_pred, pred, trans_pred, argnum), UNPROVIDED, UNPROVIDED);
        }
        return kb_indexing.find_gaf_in_relevant_mt(list(tva_pred, pred, trans_pred, argnum));
    }

    public static final SubLObject declare_tva_utilities_file_alt() {
        declareFunction("get_tva_predicates", "GET-TVA-PREDICATES", 0, 0, false);
        declareMacro("do_tva_predicates", "DO-TVA-PREDICATES");
        declareFunction("tva_precomputes_sksi_closuresP", "TVA-PRECOMPUTES-SKSI-CLOSURES?", 0, 0, false);
        declareFunction("tva_iterates_kb_predicate_extentP", "TVA-ITERATES-KB-PREDICATE-EXTENT?", 0, 0, false);
        declareFunction("tva_iterates_sksi_predicate_extentP", "TVA-ITERATES-SKSI-PREDICATE-EXTENT?", 0, 0, false);
        declareFunction("tva_arg_admittance_okP", "TVA-ARG-ADMITTANCE-OK?", 5, 0, false);
        declareFunction("tva_relation_checks_arg_admittance_p", "TVA-RELATION-CHECKS-ARG-ADMITTANCE-P", 4, 0, false);
        declareFunction("tva_argument_admitted_p", "TVA-ARGUMENT-ADMITTED-P", 1, 0, false);
        declareMacro("with_tva_precompute_closure_threshold", "WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD");
        declareFunction("less_than_precompute_closure_thresholdP", "LESS-THAN-PRECOMPUTE-CLOSURE-THRESHOLD?", 1, 0, false);
        declareFunction("tva_predicate_p", "TVA-PREDICATE-P", 1, 0, false);
        declareFunction("cva_predicate_p", "CVA-PREDICATE-P", 1, 0, false);
        declareFunction("tva_assertion_p", "TVA-ASSERTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.tva_utilities.$tva_assertion_p$UnaryFunction();
        declareFunction("cva_assertion_p", "CVA-ASSERTION-P", 1, 0, false);
        declareFunction("some_transitive_via_arg_assertionP", "SOME-TRANSITIVE-VIA-ARG-ASSERTION?", 1, 0, false);
        new com.cyc.cycjava.cycl.tva_utilities.$some_transitive_via_arg_assertionP$UnaryFunction();
        declareFunction("some_conservative_via_arg_assertionP", "SOME-CONSERVATIVE-VIA-ARG-ASSERTION?", 1, 0, false);
        new com.cyc.cycjava.cycl.tva_utilities.$some_conservative_via_arg_assertionP$UnaryFunction();
        declareFunction("some_tva_for_predicate", "SOME-TVA-FOR-PREDICATE", 1, 0, false);
        declareFunction("some_cva_for_predicate", "SOME-CVA-FOR-PREDICATE", 1, 0, false);
        declareFunction("clear_cached_some_tva_for_predicate", "CLEAR-CACHED-SOME-TVA-FOR-PREDICATE", 0, 0, false);
        new com.cyc.cycjava.cycl.tva_utilities.$clear_cached_some_tva_for_predicate$ZeroArityFunction();
        declareFunction("remove_cached_some_tva_for_predicate", "REMOVE-CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("cached_some_tva_for_predicate_internal", "CACHED-SOME-TVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
        declareFunction("cached_some_tva_for_predicate", "CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("clear_cached_some_cva_for_predicate", "CLEAR-CACHED-SOME-CVA-FOR-PREDICATE", 0, 0, false);
        new com.cyc.cycjava.cycl.tva_utilities.$clear_cached_some_cva_for_predicate$ZeroArityFunction();
        declareFunction("remove_cached_some_cva_for_predicate", "REMOVE-CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("cached_some_cva_for_predicate_internal", "CACHED-SOME-CVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
        declareFunction("cached_some_cva_for_predicate", "CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("tva_spec_preds_and_inverses", "TVA-SPEC-PREDS-AND-INVERSES", 1, 0, false);
        declareFunction("clear_cached_tva_spec_preds_and_inverses", "CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 0, 0, false);
        new com.cyc.cycjava.cycl.tva_utilities.$clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction();
        declareFunction("remove_cached_tva_spec_preds_and_inverses", "REMOVE-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 0, false);
        declareFunction("cached_tva_spec_preds_and_inverses_internal", "CACHED-TVA-SPEC-PREDS-AND-INVERSES-INTERNAL", 3, 0, false);
        declareFunction("cached_tva_spec_preds_and_inverses", "CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 0, false);
        declareFunction("tva_gather_transitive_predicates_for_arg", "TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG", 4, 0, false);
        declareMacro("do_trans_preds_for_arg_with_mode", "DO-TRANS-PREDS-FOR-ARG-WITH-MODE");
        declareFunction("any_tva_for_argP", "ANY-TVA-FOR-ARG?", 2, 0, false);
        declareFunction("cached_any_tva_for_argP_internal", "CACHED-ANY-TVA-FOR-ARG?-INTERNAL", 4, 0, false);
        declareFunction("cached_any_tva_for_argP", "CACHED-ANY-TVA-FOR-ARG?", 4, 0, false);
        declareFunction("tva_direction_for_tva_pred", "TVA-DIRECTION-FOR-TVA-PRED", 1, 0, false);
        declareFunction("tva_direction_to_sbhl_direction", "TVA-DIRECTION-TO-SBHL-DIRECTION", 1, 0, false);
        declareFunction("tva_direction_to_ghl_direction", "TVA-DIRECTION-TO-GHL-DIRECTION", 1, 0, false);
        declareFunction("tva_direction_to_ghl_closure_direction", "TVA-DIRECTION-TO-GHL-CLOSURE-DIRECTION", 1, 0, false);
        declareFunction("determine_tva_gather_argnum", "DETERMINE-TVA-GATHER-ARGNUM", 2, 0, false);
        declareMacro("do_tva_term_argnums", "DO-TVA-TERM-ARGNUMS");
        declareFunction("tva_precomputation_p", "TVA-PRECOMPUTATION-P", 1, 0, false);
        declareFunction("tva_unify_vars", "TVA-UNIFY-VARS", 1, 0, false);
        declareFunction("tva_support_module_for_pred", "TVA-SUPPORT-MODULE-FOR-PRED", 1, 0, false);
        declareFunction("genl_preds_support_from_pred_to_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-PRED", 3, 0, false);
        declareFunction("genl_preds_support_from_pred_to_tva_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-TVA-PRED", 2, 0, false);
        declareFunction("tva_assertion_support", "TVA-ASSERTION-SUPPORT", 4, 0, false);
        return NIL;
    }

    public static SubLObject declare_tva_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("get_tva_predicates", "GET-TVA-PREDICATES", 0, 0, false);
            declareMacro("do_tva_predicates", "DO-TVA-PREDICATES");
            declareFunction("tva_precomputes_sksi_closuresP", "TVA-PRECOMPUTES-SKSI-CLOSURES?", 0, 0, false);
            declareFunction("tva_iterates_kb_predicate_extentP", "TVA-ITERATES-KB-PREDICATE-EXTENT?", 0, 0, false);
            declareFunction("tva_iterates_sksi_predicate_extentP", "TVA-ITERATES-SKSI-PREDICATE-EXTENT?", 0, 0, false);
            declareFunction("tva_arg_admittance_okP", "TVA-ARG-ADMITTANCE-OK?", 5, 0, false);
            declareFunction("tva_relation_checks_arg_admittance_p", "TVA-RELATION-CHECKS-ARG-ADMITTANCE-P", 4, 0, false);
            declareFunction("tva_argument_admitted_p", "TVA-ARGUMENT-ADMITTED-P", 1, 0, false);
            declareMacro("with_tva_precompute_closure_threshold", "WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD");
            declareFunction("less_than_precompute_closure_thresholdP", "LESS-THAN-PRECOMPUTE-CLOSURE-THRESHOLD?", 1, 0, false);
            declareFunction("tva_predicate_p", "TVA-PREDICATE-P", 1, 0, false);
            declareFunction("cva_predicate_p", "CVA-PREDICATE-P", 1, 0, false);
            declareFunction("tva_assertion_p", "TVA-ASSERTION-P", 1, 0, false);
            new tva_utilities.$tva_assertion_p$UnaryFunction();
            declareFunction("cva_assertion_p", "CVA-ASSERTION-P", 1, 0, false);
            declareFunction("some_transitive_via_arg_assertionP", "SOME-TRANSITIVE-VIA-ARG-ASSERTION?", 1, 0, false);
            new tva_utilities.$some_transitive_via_arg_assertionP$UnaryFunction();
            declareFunction("some_conservative_via_arg_assertionP", "SOME-CONSERVATIVE-VIA-ARG-ASSERTION?", 1, 0, false);
            new tva_utilities.$some_conservative_via_arg_assertionP$UnaryFunction();
            declareFunction("some_tva_for_predicate", "SOME-TVA-FOR-PREDICATE", 1, 0, false);
            declareFunction("some_cva_for_predicate", "SOME-CVA-FOR-PREDICATE", 1, 0, false);
            declareFunction("clear_cached_some_tva_for_predicate", "CLEAR-CACHED-SOME-TVA-FOR-PREDICATE", 0, 0, false);
            new tva_utilities.$clear_cached_some_tva_for_predicate$ZeroArityFunction();
            declareFunction("remove_cached_some_tva_for_predicate", "REMOVE-CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
            declareFunction("cached_some_tva_for_predicate_internal", "CACHED-SOME-TVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
            declareFunction("cached_some_tva_for_predicate", "CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
            declareFunction("clear_cached_some_cva_for_predicate", "CLEAR-CACHED-SOME-CVA-FOR-PREDICATE", 0, 0, false);
            new tva_utilities.$clear_cached_some_cva_for_predicate$ZeroArityFunction();
            declareFunction("remove_cached_some_cva_for_predicate", "REMOVE-CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
            declareFunction("cached_some_cva_for_predicate_internal", "CACHED-SOME-CVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
            declareFunction("cached_some_cva_for_predicate", "CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
            declareFunction("tva_spec_preds_and_inverses", "TVA-SPEC-PREDS-AND-INVERSES", 1, 1, false);
            declareFunction("clear_cached_tva_spec_preds_and_inverses", "CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 0, 0, false);
            new tva_utilities.$clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction();
            declareFunction("remove_cached_tva_spec_preds_and_inverses", "REMOVE-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 1, false);
            declareFunction("cached_tva_spec_preds_and_inverses_internal", "CACHED-TVA-SPEC-PREDS-AND-INVERSES-INTERNAL", 4, 0, false);
            declareFunction("cached_tva_spec_preds_and_inverses", "CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 1, false);
            declareFunction("tva_gather_transitive_predicates_for_arg", "TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG", 4, 1, false);
            declareFunction("clear_tva_pred_arg_values_for_tva_pred_cached", "CLEAR-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 0, 0, false);
            declareFunction("remove_tva_pred_arg_values_for_tva_pred_cached", "REMOVE-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 7, 0, false);
            declareFunction("tva_pred_arg_values_for_tva_pred_cached_internal", "TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-INTERNAL", 7, 0, false);
            declareFunction("tva_pred_arg_values_for_tva_pred_cached", "TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 7, 0, false);
            declareMacro("do_trans_preds_for_arg_with_mode", "DO-TRANS-PREDS-FOR-ARG-WITH-MODE");
            declareFunction("any_tva_for_argP", "ANY-TVA-FOR-ARG?", 2, 0, false);
            declareFunction("cached_any_tva_for_argP_internal", "CACHED-ANY-TVA-FOR-ARG?-INTERNAL", 4, 0, false);
            declareFunction("cached_any_tva_for_argP", "CACHED-ANY-TVA-FOR-ARG?", 4, 0, false);
            declareFunction("tva_pred_signature", "TVA-PRED-SIGNATURE", 1, 0, false);
            declareFunction("tva_direction_for_tva_pred", "TVA-DIRECTION-FOR-TVA-PRED", 1, 0, false);
            declareFunction("tva_direction_to_sbhl_direction", "TVA-DIRECTION-TO-SBHL-DIRECTION", 1, 0, false);
            declareFunction("tva_direction_to_ghl_direction", "TVA-DIRECTION-TO-GHL-DIRECTION", 1, 0, false);
            declareFunction("tva_direction_to_ghl_closure_direction", "TVA-DIRECTION-TO-GHL-CLOSURE-DIRECTION", 1, 0, false);
            declareFunction("determine_tva_gather_argnum", "DETERMINE-TVA-GATHER-ARGNUM", 2, 0, false);
            declareMacro("do_tva_term_argnums", "DO-TVA-TERM-ARGNUMS");
            declareFunction("tva_precomputation_p", "TVA-PRECOMPUTATION-P", 1, 0, false);
            declareFunction("tva_unify_vars", "TVA-UNIFY-VARS", 1, 0, false);
            declareFunction("tva_support_module_for_pred", "TVA-SUPPORT-MODULE-FOR-PRED", 1, 0, false);
            declareFunction("genl_preds_support_from_pred_to_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-PRED", 3, 0, false);
            declareFunction("genl_preds_support_from_pred_to_tva_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-TVA-PRED", 2, 0, false);
            declareFunction("tva_assertion_support", "TVA-ASSERTION-SUPPORT", 4, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("tva_spec_preds_and_inverses", "TVA-SPEC-PREDS-AND-INVERSES", 1, 0, false);
            declareFunction("remove_cached_tva_spec_preds_and_inverses", "REMOVE-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 0, false);
            declareFunction("cached_tva_spec_preds_and_inverses_internal", "CACHED-TVA-SPEC-PREDS-AND-INVERSES-INTERNAL", 3, 0, false);
            declareFunction("cached_tva_spec_preds_and_inverses", "CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 0, false);
            declareFunction("tva_gather_transitive_predicates_for_arg", "TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG", 4, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_tva_utilities_file_Previous() {
        declareFunction("get_tva_predicates", "GET-TVA-PREDICATES", 0, 0, false);
        declareMacro("do_tva_predicates", "DO-TVA-PREDICATES");
        declareFunction("tva_precomputes_sksi_closuresP", "TVA-PRECOMPUTES-SKSI-CLOSURES?", 0, 0, false);
        declareFunction("tva_iterates_kb_predicate_extentP", "TVA-ITERATES-KB-PREDICATE-EXTENT?", 0, 0, false);
        declareFunction("tva_iterates_sksi_predicate_extentP", "TVA-ITERATES-SKSI-PREDICATE-EXTENT?", 0, 0, false);
        declareFunction("tva_arg_admittance_okP", "TVA-ARG-ADMITTANCE-OK?", 5, 0, false);
        declareFunction("tva_relation_checks_arg_admittance_p", "TVA-RELATION-CHECKS-ARG-ADMITTANCE-P", 4, 0, false);
        declareFunction("tva_argument_admitted_p", "TVA-ARGUMENT-ADMITTED-P", 1, 0, false);
        declareMacro("with_tva_precompute_closure_threshold", "WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD");
        declareFunction("less_than_precompute_closure_thresholdP", "LESS-THAN-PRECOMPUTE-CLOSURE-THRESHOLD?", 1, 0, false);
        declareFunction("tva_predicate_p", "TVA-PREDICATE-P", 1, 0, false);
        declareFunction("cva_predicate_p", "CVA-PREDICATE-P", 1, 0, false);
        declareFunction("tva_assertion_p", "TVA-ASSERTION-P", 1, 0, false);
        new tva_utilities.$tva_assertion_p$UnaryFunction();
        declareFunction("cva_assertion_p", "CVA-ASSERTION-P", 1, 0, false);
        declareFunction("some_transitive_via_arg_assertionP", "SOME-TRANSITIVE-VIA-ARG-ASSERTION?", 1, 0, false);
        new tva_utilities.$some_transitive_via_arg_assertionP$UnaryFunction();
        declareFunction("some_conservative_via_arg_assertionP", "SOME-CONSERVATIVE-VIA-ARG-ASSERTION?", 1, 0, false);
        new tva_utilities.$some_conservative_via_arg_assertionP$UnaryFunction();
        declareFunction("some_tva_for_predicate", "SOME-TVA-FOR-PREDICATE", 1, 0, false);
        declareFunction("some_cva_for_predicate", "SOME-CVA-FOR-PREDICATE", 1, 0, false);
        declareFunction("clear_cached_some_tva_for_predicate", "CLEAR-CACHED-SOME-TVA-FOR-PREDICATE", 0, 0, false);
        new tva_utilities.$clear_cached_some_tva_for_predicate$ZeroArityFunction();
        declareFunction("remove_cached_some_tva_for_predicate", "REMOVE-CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("cached_some_tva_for_predicate_internal", "CACHED-SOME-TVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
        declareFunction("cached_some_tva_for_predicate", "CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("clear_cached_some_cva_for_predicate", "CLEAR-CACHED-SOME-CVA-FOR-PREDICATE", 0, 0, false);
        new tva_utilities.$clear_cached_some_cva_for_predicate$ZeroArityFunction();
        declareFunction("remove_cached_some_cva_for_predicate", "REMOVE-CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("cached_some_cva_for_predicate_internal", "CACHED-SOME-CVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
        declareFunction("cached_some_cva_for_predicate", "CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
        declareFunction("tva_spec_preds_and_inverses", "TVA-SPEC-PREDS-AND-INVERSES", 1, 1, false);
        declareFunction("clear_cached_tva_spec_preds_and_inverses", "CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 0, 0, false);
        new tva_utilities.$clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction();
        declareFunction("remove_cached_tva_spec_preds_and_inverses", "REMOVE-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 1, false);
        declareFunction("cached_tva_spec_preds_and_inverses_internal", "CACHED-TVA-SPEC-PREDS-AND-INVERSES-INTERNAL", 4, 0, false);
        declareFunction("cached_tva_spec_preds_and_inverses", "CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 1, false);
        declareFunction("tva_gather_transitive_predicates_for_arg", "TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG", 4, 1, false);
        declareFunction("clear_tva_pred_arg_values_for_tva_pred_cached", "CLEAR-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 0, 0, false);
        declareFunction("remove_tva_pred_arg_values_for_tva_pred_cached", "REMOVE-TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 7, 0, false);
        declareFunction("tva_pred_arg_values_for_tva_pred_cached_internal", "TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-INTERNAL", 7, 0, false);
        declareFunction("tva_pred_arg_values_for_tva_pred_cached", "TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED", 7, 0, false);
        declareMacro("do_trans_preds_for_arg_with_mode", "DO-TRANS-PREDS-FOR-ARG-WITH-MODE");
        declareFunction("any_tva_for_argP", "ANY-TVA-FOR-ARG?", 2, 0, false);
        declareFunction("cached_any_tva_for_argP_internal", "CACHED-ANY-TVA-FOR-ARG?-INTERNAL", 4, 0, false);
        declareFunction("cached_any_tva_for_argP", "CACHED-ANY-TVA-FOR-ARG?", 4, 0, false);
        declareFunction("tva_pred_signature", "TVA-PRED-SIGNATURE", 1, 0, false);
        declareFunction("tva_direction_for_tva_pred", "TVA-DIRECTION-FOR-TVA-PRED", 1, 0, false);
        declareFunction("tva_direction_to_sbhl_direction", "TVA-DIRECTION-TO-SBHL-DIRECTION", 1, 0, false);
        declareFunction("tva_direction_to_ghl_direction", "TVA-DIRECTION-TO-GHL-DIRECTION", 1, 0, false);
        declareFunction("tva_direction_to_ghl_closure_direction", "TVA-DIRECTION-TO-GHL-CLOSURE-DIRECTION", 1, 0, false);
        declareFunction("determine_tva_gather_argnum", "DETERMINE-TVA-GATHER-ARGNUM", 2, 0, false);
        declareMacro("do_tva_term_argnums", "DO-TVA-TERM-ARGNUMS");
        declareFunction("tva_precomputation_p", "TVA-PRECOMPUTATION-P", 1, 0, false);
        declareFunction("tva_unify_vars", "TVA-UNIFY-VARS", 1, 0, false);
        declareFunction("tva_support_module_for_pred", "TVA-SUPPORT-MODULE-FOR-PRED", 1, 0, false);
        declareFunction("genl_preds_support_from_pred_to_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-PRED", 3, 0, false);
        declareFunction("genl_preds_support_from_pred_to_tva_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-TVA-PRED", 2, 0, false);
        declareFunction("tva_assertion_support", "TVA-ASSERTION-SUPPORT", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_tva_utilities_file_alt() {
        deflexical("*TVA-PREDICATES*", $list_alt0);
        deflexical("*TVA-PRECOMPUTES-SKSI-CLOSURES?*", NIL != boundp($tva_precomputes_sksi_closuresP$) ? ((SubLObject) ($tva_precomputes_sksi_closuresP$.getGlobalValue())) : NIL);
        deflexical("*TVA-ITERATES-KB-PREDICATE-EXTENT?*", NIL != boundp($tva_iterates_kb_predicate_extentP$) ? ((SubLObject) ($tva_iterates_kb_predicate_extentP$.getGlobalValue())) : T);
        deflexical("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*", NIL != boundp($tva_iterates_sksi_predicate_extentP$) ? ((SubLObject) ($tva_iterates_sksi_predicate_extentP$.getGlobalValue())) : NIL);
        defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", $int$60);
        deflexical("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*", NIL);
        deflexical("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*", NIL);
        deflexical("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_tva_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TVA-PREDICATES*", $list0);
            deflexical("*TVA-PRECOMPUTES-SKSI-CLOSURES?*", SubLTrampolineFile.maybeDefault($tva_precomputes_sksi_closuresP$, $tva_precomputes_sksi_closuresP$, NIL));
            deflexical("*TVA-ITERATES-KB-PREDICATE-EXTENT?*", SubLTrampolineFile.maybeDefault($tva_iterates_kb_predicate_extentP$, $tva_iterates_kb_predicate_extentP$, T));
            deflexical("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*", SubLTrampolineFile.maybeDefault($tva_iterates_sksi_predicate_extentP$, $tva_iterates_sksi_predicate_extentP$, NIL));
            defparameter("*TVA-FORCE-ARG-ADMITTANCE-CHECKING?*", NIL);
            defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", $int$1500);
            deflexical("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*", NIL);
            deflexical("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*", NIL);
            deflexical("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*", NIL);
            deflexical("*TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TVA-PRECOMPUTES-SKSI-CLOSURES?*", NIL != boundp($tva_precomputes_sksi_closuresP$) ? ((SubLObject) ($tva_precomputes_sksi_closuresP$.getGlobalValue())) : NIL);
            deflexical("*TVA-ITERATES-KB-PREDICATE-EXTENT?*", NIL != boundp($tva_iterates_kb_predicate_extentP$) ? ((SubLObject) ($tva_iterates_kb_predicate_extentP$.getGlobalValue())) : T);
            deflexical("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*", NIL != boundp($tva_iterates_sksi_predicate_extentP$) ? ((SubLObject) ($tva_iterates_sksi_predicate_extentP$.getGlobalValue())) : NIL);
            defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", $int$60);
        }
        return NIL;
    }

    public static SubLObject init_tva_utilities_file_Previous() {
        deflexical("*TVA-PREDICATES*", $list0);
        deflexical("*TVA-PRECOMPUTES-SKSI-CLOSURES?*", SubLTrampolineFile.maybeDefault($tva_precomputes_sksi_closuresP$, $tva_precomputes_sksi_closuresP$, NIL));
        deflexical("*TVA-ITERATES-KB-PREDICATE-EXTENT?*", SubLTrampolineFile.maybeDefault($tva_iterates_kb_predicate_extentP$, $tva_iterates_kb_predicate_extentP$, T));
        deflexical("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*", SubLTrampolineFile.maybeDefault($tva_iterates_sksi_predicate_extentP$, $tva_iterates_sksi_predicate_extentP$, NIL));
        defparameter("*TVA-FORCE-ARG-ADMITTANCE-CHECKING?*", NIL);
        defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", $int$1500);
        deflexical("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*", NIL);
        deflexical("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*", NIL);
        deflexical("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*", NIL);
        deflexical("*TVA-PRED-ARG-VALUES-FOR-TVA-PRED-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tva_utilities_file_alt() {
        declare_defglobal($tva_precomputes_sksi_closuresP$);
        declare_defglobal($tva_iterates_kb_predicate_extentP$);
        declare_defglobal($tva_iterates_sksi_predicate_extentP$);
        memoization_state.note_globally_cached_function(CACHED_SOME_TVA_FOR_PREDICATE);
        memoization_state.note_globally_cached_function(CACHED_SOME_CVA_FOR_PREDICATE);
        memoization_state.note_globally_cached_function(CACHED_TVA_SPEC_PREDS_AND_INVERSES);
        memoization_state.note_memoized_function($sym60$CACHED_ANY_TVA_FOR_ARG_);
        return NIL;
    }

    public static SubLObject setup_tva_utilities_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($tva_precomputes_sksi_closuresP$);
            declare_defglobal($tva_iterates_kb_predicate_extentP$);
            declare_defglobal($tva_iterates_sksi_predicate_extentP$);
            memoization_state.note_globally_cached_function(CACHED_SOME_TVA_FOR_PREDICATE);
            memoization_state.note_globally_cached_function(CACHED_SOME_CVA_FOR_PREDICATE);
            memoization_state.note_globally_cached_function(CACHED_TVA_SPEC_PREDS_AND_INVERSES);
            memoization_state.note_globally_cached_function(TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED);
            memoization_state.note_memoized_function($sym64$CACHED_ANY_TVA_FOR_ARG_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym60$CACHED_ANY_TVA_FOR_ARG_);
        }
        return NIL;
    }

    public static SubLObject setup_tva_utilities_file_Previous() {
        declare_defglobal($tva_precomputes_sksi_closuresP$);
        declare_defglobal($tva_iterates_kb_predicate_extentP$);
        declare_defglobal($tva_iterates_sksi_predicate_extentP$);
        memoization_state.note_globally_cached_function(CACHED_SOME_TVA_FOR_PREDICATE);
        memoization_state.note_globally_cached_function(CACHED_SOME_CVA_FOR_PREDICATE);
        memoization_state.note_globally_cached_function(CACHED_TVA_SPEC_PREDS_AND_INVERSES);
        memoization_state.note_globally_cached_function(TVA_PRED_ARG_VALUES_FOR_TVA_PRED_CACHED);
        memoization_state.note_memoized_function($sym64$CACHED_ANY_TVA_FOR_ARG_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tva_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_tva_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tva_utilities_file();
    }

    static {
    }

    public static final class $tva_assertion_p$UnaryFunction extends UnaryFunction {
        public $tva_assertion_p$UnaryFunction() {
            super(extractFunctionNamed("TVA-ASSERTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tva_assertion_p(arg1);
        }
    }

    public static final class $some_transitive_via_arg_assertionP$UnaryFunction extends UnaryFunction {
        public $some_transitive_via_arg_assertionP$UnaryFunction() {
            super(extractFunctionNamed("SOME-TRANSITIVE-VIA-ARG-ASSERTION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return some_transitive_via_arg_assertionP(arg1);
        }
    }

    public static final class $some_conservative_via_arg_assertionP$UnaryFunction extends UnaryFunction {
        public $some_conservative_via_arg_assertionP$UnaryFunction() {
            super(extractFunctionNamed("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return some_conservative_via_arg_assertionP(arg1);
        }
    }

    public static final class $clear_cached_some_tva_for_predicate$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_some_tva_for_predicate$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_some_tva_for_predicate();
        }
    }

    public static final class $clear_cached_some_cva_for_predicate$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_some_cva_for_predicate$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_some_cva_for_predicate();
        }
    }

    public static final class $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_tva_spec_preds_and_inverses();
        }
    }
}

/**
 * Total time: 1299 ms
 */
