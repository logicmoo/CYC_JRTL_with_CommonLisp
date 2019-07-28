package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$ignore_conflictsP$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_error_explanatory_supports$;
import static com.cyc.cycjava.cycl.control_vars.$suppress_conflict_noticesP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_time_assertion_processing extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_time_assertion_processing();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing";

    public static final String myFingerPrint = "2e7b93bf34747f8c18694a2f5479922cb3ce3b07f33f55385ff2d75e32dcbe58";





    // Internal Constants
    public static final SubLSymbol $sbhl_time_default_link_mt$ = makeSymbol("*SBHL-TIME-DEFAULT-LINK-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLSymbol $hl_start_end_fn_defining_mt$ = makeSymbol("*HL-START-END-FN-DEFINING-MT*");

    private static final SubLObject $$HL_StartFn = reader_make_constant_shell(makeString("HL-StartFn"));

    private static final SubLSymbol NOT_EQL = makeSymbol("NOT-EQL");



    public static final SubLString $$$skip_subsumption_op = makeString("skip subsumption op");

    public static final SubLString $str7$_s_is_not_a_sbhl_time_predicate_p = makeString("~s is not a sbhl-time-predicate-p");

    public static final SubLString $str8$_s_is_not_a_sbhl_time_arg_p = makeString("~s is not a sbhl-time-arg-p");

    public static final SubLString $str9$gaf_is_effectively_date_date_asse = makeString("gaf is effectively date-date assertion: ~s ~a ~a~%");



    public static final SubLSymbol ADD_TEMPORAL_RELATION = makeSymbol("ADD-TEMPORAL-RELATION");



    public static final SubLString $str13$_sbhl__genls__skipping_remove_op_ = makeString("[sbhl :genls] skipping remove op; assertion still there: ~%~s");

    public static final SubLSymbol REMOVE_TEMPORAL_RELATION = makeSymbol("REMOVE-TEMPORAL-RELATION");















    private static final SubLSymbol $BEGINNING_OF_TIME = makeKeyword("BEGINNING-OF-TIME");

    private static final SubLSymbol $END_OF_TIME = makeKeyword("END-OF-TIME");

    public static final SubLSymbol $sym24$EXTENDED_UNIVERSAL_DATE_ = makeSymbol("EXTENDED-UNIVERSAL-DATE<");





    public static final SubLList $list27 = list(makeKeyword("WEAK"), makeKeyword("STRICT"), makeKeyword("WEAK-SUCCESSOR"), makeKeyword("SUCCESSOR-STRICT"));







    public static final SubLList $list31 = cons(makeUninternedSymbol("KEY"), makeUninternedSymbol("MODULE"));

    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLList $list33 = list(makeKeyword("DEFINITIONAL"));



    private static final SubLSymbol $sym35$__ = makeSymbol("<=");

    private static final SubLSymbol $sym36$_ = makeSymbol("<");

    private static final SubLSymbol $sym37$____ = makeSymbol("<=<=");

    private static final SubLSymbol $sym38$__ = makeSymbol("<<");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLString $str43$sbhl_conflict___s__a__a__ = makeString("sbhl conflict: ~s ~a ~a~%");

    private static final SubLString $str44$sbhl_conflict___s__a__a________be = makeString("sbhl conflict: ~s ~a ~a~%      because:");

    private static final SubLString $str45$__a = makeString(" ~a");







    private static final SubLString $str49$leave_the_kb_inconsistent_for_now = makeString("leave the kb inconsistent for now and resolve the conflict later");

    public static SubLObject add_temporal_relation(SubLObject source, final SubLObject assertion, SubLObject source_must_be_uniqueP) {
        if (source_must_be_uniqueP == UNPROVIDED) {
            source_must_be_uniqueP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_time_vars.sbhl_temporality_activeP()) && ((NIL == source_must_be_uniqueP) || (NIL == subl_promotions.memberP(source, assertions_high.assertion_arguments(assertion), symbol_function(NOT_EQL), UNPROVIDED)))) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(source, thread);
                sbhl_link_vars.$added_assertion$.bind(assertion, thread);
                final SubLObject truth = assertions_high.assertion_truth(assertion);
                final SubLObject sense = enumeration_types.truth_sense(truth);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject pred = assertions_high.gaf_arg0(assertion);
                final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    if (NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                        sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str7$_s_is_not_a_sbhl_time_predicate_p, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL == sbhl_time_utilities.sbhl_time_arg_p(arg1)) {
                            sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str8$_s_is_not_a_sbhl_time_arg_p, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == sbhl_time_utilities.sbhl_time_arg_p(arg2)) {
                                sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str8$_s_is_not_a_sbhl_time_arg_p, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL == sbhl_assimilable_temporality_gafP(pred, arg1, arg2)) {
                                    sbhl_paranoia.sbhl_cerror(FOUR_INTEGER, $$$skip_subsumption_op, $str9$gaf_is_effectively_date_date_asse, list(pred, arg1, arg2), truth, mt, UNPROVIDED, UNPROVIDED);
                                } else {
                                    final SubLObject _prev_bind_0_$2 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                                    try {
                                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(T, thread);
                                        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP(pred, arg1, arg2, enumeration_types.inverse_sense(sense), mt)) {
                                            handle_temporal_relation_literal_conflict(pred, arg1, arg2, sense, mt, $ADD);
                                        } else {
                                            add_temporal_relation_literal(assertion, pred, arg1, arg2, sense, mt);
                                        }
                                    } finally {
                                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }



                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject add_wff_temporal_relation(SubLObject source, final SubLObject assertion, SubLObject source_must_be_uniqueP) {
        if (source_must_be_uniqueP == UNPROVIDED) {
            source_must_be_uniqueP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_time_vars.sbhl_temporality_activeP()) && ((NIL == source_must_be_uniqueP) || (NIL == subl_promotions.memberP(source, assertions_high.assertion_arguments(assertion), symbol_function(NOT_EQL), UNPROVIDED)))) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(source, thread);
                sbhl_link_vars.$added_assertion$.bind(assertion, thread);
                final SubLObject truth = assertions_high.assertion_truth(assertion);
                final SubLObject sense = enumeration_types.truth_sense(truth);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject pred = assertions_high.gaf_arg0(assertion);
                final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    if (NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                        sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str7$_s_is_not_a_sbhl_time_predicate_p, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL == sbhl_time_utilities.sbhl_time_arg_p(arg1)) {
                            sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str8$_s_is_not_a_sbhl_time_arg_p, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == sbhl_time_utilities.sbhl_time_arg_p(arg2)) {
                                sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str8$_s_is_not_a_sbhl_time_arg_p, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL == sbhl_assimilable_temporality_gafP(pred, arg1, arg2)) {
                                    sbhl_paranoia.sbhl_cerror(FOUR_INTEGER, $$$skip_subsumption_op, $str9$gaf_is_effectively_date_date_asse, list(pred, arg1, arg2), truth, mt, UNPROVIDED, UNPROVIDED);
                                } else {
                                    final SubLObject _prev_bind_0_$5 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                                    try {
                                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(T, thread);
                                        add_temporal_relation_literal(assertion, pred, arg1, arg2, sense, mt);
                                    } finally {
                                        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }



                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$5, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject remove_temporal_relation(SubLObject source, final SubLObject assertion, SubLObject warn_when_assertion_existsP) {
        if (warn_when_assertion_existsP == UNPROVIDED) {
            warn_when_assertion_existsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_time_vars.sbhl_temporality_activeP()) {
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject sense = enumeration_types.truth_sense(truth);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject pred = assertions_high.gaf_arg0(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                if ((NIL != warn_when_assertion_existsP) && (NIL != kb_accessors.assertion_still_thereP(assertion, truth))) {
                    sbhl_paranoia.sbhl_warn(THREE_INTEGER, $str13$_sbhl__genls__skipping_remove_op_, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                        sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str7$_s_is_not_a_sbhl_time_predicate_p, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL == sbhl_time_utilities.sbhl_time_arg_p(arg1)) {
                            sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str8$_s_is_not_a_sbhl_time_arg_p, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == sbhl_time_utilities.sbhl_time_arg_p(arg2)) {
                                sbhl_paranoia.sbhl_cerror(THREE_INTEGER, $$$skip_subsumption_op, $str8$_s_is_not_a_sbhl_time_arg_p, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                remove_temporal_relation_literal(assertion, pred, arg1, arg2, sense, mt);
                            }



            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_assimilable_temporality_gafP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
        if (NIL == fboundp(conjunction_fn)) {
            return NIL;
        }
        final SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
        SubLObject not_date_date_quasi_linkP = NIL;
        if (NIL == not_date_date_quasi_linkP) {
            SubLObject csome_list_var;
            SubLObject conjunct;
            for (csome_list_var = conjuncts, conjunct = NIL, conjunct = csome_list_var.first(); (NIL == not_date_date_quasi_linkP) && (NIL != csome_list_var); not_date_date_quasi_linkP = makeBoolean(NIL == sbhl_time_query_processing.date_date_quasi_link_p(conjunct)) , csome_list_var = csome_list_var.rest() , conjunct = csome_list_var.first()) {
            }
        }
        return not_date_date_quasi_linkP;
    }

    public static SubLObject add_temporal_relation_literal(final SubLObject support, final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, final SubLObject mt) {
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
        if (NIL == fboundp(conjunction_fn)) {
            return NIL;
        }
        final SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
        if (sense.eql($POS)) {
            if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                add_temporal_quasi_link_conjunction(support, conjuncts, mt);
            } else
                if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                    add_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
                }

        } else
            if (sense.eql($NEG)) {
                if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                    add_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
                } else
                    if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                        add_temporal_quasi_link_conjunction(support, conjuncts, mt);
                    }

            }

        return NIL;
    }

    public static SubLObject remove_temporal_relation_literal(final SubLObject support, final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, final SubLObject mt) {
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
        if (NIL == fboundp(conjunction_fn)) {
            return NIL;
        }
        final SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
        if (sense.eql($POS)) {
            if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                remove_temporal_quasi_link_conjunction(support, conjuncts, mt);
            } else
                if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                    remove_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
                }

        } else
            if (sense.eql($NEG)) {
                if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                    remove_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
                } else
                    if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                        remove_temporal_quasi_link_conjunction(support, conjuncts, mt);
                    }

            }

        return NIL;
    }

    public static SubLObject add_temporal_quasi_link_conjunction(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        if (NIL == sbhl_time_query_processing.date_date_quasi_link_p(conjuncts.first())) {
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject link_tag = conjunct.first();
                final SubLObject before = find_or_create_hl_temporal_point(second(conjunct));
                final SubLObject after = find_or_create_hl_temporal_point(third(conjunct));
                add_temporal_link(support, link_tag, before, after, mt);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject remove_temporal_quasi_link_conjunction(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject link_tag = conjunct.first();
            final SubLObject before = find_hl_temporal_point(second(conjunct));
            final SubLObject after = find_hl_temporal_point(third(conjunct));
            remove_temporal_link(support, link_tag, before, after, mt);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject find_or_create_hl_temporal_point(final SubLObject quasi_point) {
        final SubLObject point_tag = quasi_point.first();
        final SubLObject point_time = second(quasi_point);
        final SubLObject pcase_var = point_tag;
        if (pcase_var.eql($START)) {
            if (point_time.isInteger()) {
                add_hl_start_for_extended_universal_date(point_time);
            } else
                if (NIL != closedP(point_time, UNPROVIDED)) {
                    add_hl_start_for_non_date(point_time);
                }

            return sbhl_time_utilities.hl_start(point_time);
        }
        if (pcase_var.eql($END)) {
            if (point_time.isInteger()) {
                add_hl_end_for_extended_universal_date(point_time);
            } else
                if (NIL != closedP(point_time, UNPROVIDED)) {
                    add_hl_end_for_non_date(point_time);
                }

            return sbhl_time_utilities.hl_end(point_time);
        }
        return NIL;
    }

    public static SubLObject find_hl_temporal_point(final SubLObject quasi_point) {
        final SubLObject point_tag = quasi_point.first();
        final SubLObject point_time = second(quasi_point);
        final SubLObject pcase_var = point_tag;
        if (pcase_var.eql($START)) {
            return sbhl_time_utilities.hl_start(point_time);
        }
        if (pcase_var.eql($END)) {
            return sbhl_time_utilities.hl_end(point_time);
        }
        return NIL;
    }

    public static SubLObject add_hl_start_for_non_date(final SubLObject time) {
        final SubLObject start = sbhl_time_utilities.hl_start(time);
        final SubLObject end = sbhl_time_utilities.hl_end(time);
        add_temporal_link($DEFINITIONAL, $WEAK, start, end, $sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link($DEFINITIONAL, $WEAK, sbhl_time_utilities.hl_end($BEGINNING_OF_TIME), start, $sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link($DEFINITIONAL, $WEAK, end, sbhl_time_utilities.hl_start($END_OF_TIME), $sbhl_time_default_link_mt$.getGlobalValue());
        return NIL;
    }

    public static SubLObject find_or_create_hl_start(final SubLObject time) {
        return sbhl_time_utilities.hl_start(time);
    }

    public static SubLObject add_hl_end_for_non_date(final SubLObject time) {
        final SubLObject end = sbhl_time_utilities.hl_end(time);
        final SubLObject start = sbhl_time_utilities.hl_start(time);
        add_temporal_link($DEFINITIONAL, $WEAK, start, end, $sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link($DEFINITIONAL, $WEAK, sbhl_time_utilities.hl_end($BEGINNING_OF_TIME), start, $sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link($DEFINITIONAL, $WEAK, end, sbhl_time_utilities.hl_start($END_OF_TIME), $sbhl_time_default_link_mt$.getGlobalValue());
        return NIL;
    }

    public static SubLObject find_or_create_hl_end(final SubLObject time) {
        return sbhl_time_utilities.hl_end(time);
    }

    public static SubLObject add_hl_start_for_extended_universal_date(final SubLObject eu_date) {
        final SubLObject start = sbhl_time_utilities.hl_start(eu_date);
        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(start)) {
            if (NIL == subl_promotions.memberP(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), symbol_function(EQL), UNPROVIDED)) {
                sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(Sort.cmerge(copy_list(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), list(eu_date), $sym24$EXTENDED_UNIVERSAL_DATE_, UNPROVIDED));
            }
            final SubLObject end = sbhl_time_utilities.hl_end(eu_date);
            final SubLObject n = position(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject date_list_last_position = subtract(length(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), ONE_INTEGER);
            SubLObject eu_date_before = NIL;
            SubLObject date_point_before = NIL;
            SubLObject eu_date_after = NIL;
            SubLObject date_point_after = NIL;
            if (n.numG(ZERO_INTEGER)) {
                eu_date_before = nth(subtract(n, ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_before = closest_hl_point_node_at_or_before_end(eu_date_before);
            }
            if (n.numL(date_list_last_position)) {
                eu_date_after = nth(add(n, ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_after = closest_hl_point_node_at_or_after_start(eu_date_after);
            }
            if (NIL != date_point_before) {
                if (eu_date_before.numE(numeric_date_utilities.preceding_extended_universal_date(eu_date)) && (NIL != sbhl_time_utilities.hl_end_p(date_point_before))) {
                    add_temporal_link($DEFINITIONAL, $SUCCESSOR, date_point_before, start, $sbhl_time_default_link_mt$.getGlobalValue());
                } else {
                    add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, date_point_before, start, $sbhl_time_default_link_mt$.getGlobalValue());
                }
            }
            if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(end)) {
                add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, start, end, $sbhl_time_default_link_mt$.getGlobalValue());
            } else
                if (NIL != date_point_after) {
                    add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, start, date_point_after, $sbhl_time_default_link_mt$.getGlobalValue());
                }

            if (NIL != date_point_before) {
                if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(end)) {
                    remove_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, date_point_before, end, $sbhl_time_default_link_mt$.getGlobalValue());
                } else
                    if (NIL != date_point_after) {
                        remove_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, date_point_before, date_point_after, $sbhl_time_default_link_mt$.getGlobalValue());
                    }

            }
        }
        return NIL;
    }

    public static SubLObject add_hl_end_for_extended_universal_date(final SubLObject eu_date) {
        final SubLObject end = sbhl_time_utilities.hl_end(eu_date);
        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(end)) {
            if (NIL == subl_promotions.memberP(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(Sort.cmerge(copy_list(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), list(eu_date), $sym24$EXTENDED_UNIVERSAL_DATE_, UNPROVIDED));
            }
            final SubLObject start = sbhl_time_utilities.hl_start(eu_date);
            final SubLObject n = position(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject date_list_last_position = subtract(length(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), ONE_INTEGER);
            SubLObject eu_date_before = NIL;
            SubLObject date_point_before = NIL;
            SubLObject eu_date_after = NIL;
            SubLObject date_point_after = NIL;
            if (n.numG(ZERO_INTEGER)) {
                eu_date_before = nth(subtract(n, ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_before = closest_hl_point_node_at_or_before_end(eu_date_before);
            }
            if (n.numL(date_list_last_position)) {
                eu_date_after = nth(add(n, ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_after = closest_hl_point_node_at_or_after_start(eu_date_after);
            }
            if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(start)) {
                add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, start, end, $sbhl_time_default_link_mt$.getGlobalValue());
            } else
                if (NIL != date_point_before) {
                    add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, date_point_before, end, $sbhl_time_default_link_mt$.getGlobalValue());
                }

            if (NIL != date_point_after) {
                if (eu_date_after.numE(numeric_date_utilities.succeeding_extended_universal_date(eu_date)) && (NIL != sbhl_time_utilities.hl_start_p(date_point_after))) {
                    add_temporal_link($DEFINITIONAL, $SUCCESSOR, end, date_point_after, $sbhl_time_default_link_mt$.getGlobalValue());
                } else {
                    add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, end, date_point_after, $sbhl_time_default_link_mt$.getGlobalValue());
                }
            }
            if (NIL != date_point_after) {
                if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(start)) {
                    remove_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, start, date_point_after, $sbhl_time_default_link_mt$.getGlobalValue());
                } else
                    if (NIL != date_point_before) {
                        remove_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, date_point_before, date_point_after, $sbhl_time_default_link_mt$.getGlobalValue());
                    }

            }
        }
        return NIL;
    }

    public static SubLObject closest_hl_point_node_at_or_after_start(final SubLObject time) {
        SubLObject point = sbhl_time_utilities.hl_start(time);
        if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(point)) {
            return point;
        }
        point = sbhl_time_utilities.hl_end(time);
        return NIL != sbhl_time_utilities.sbhl_temporal_node_p(point) ? point : NIL;
    }

    public static SubLObject closest_hl_point_node_at_or_before_end(final SubLObject time) {
        SubLObject point = sbhl_time_utilities.hl_end(time);
        if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(point)) {
            return point;
        }
        point = sbhl_time_utilities.hl_start(time);
        return NIL != sbhl_time_utilities.sbhl_temporal_node_p(point) ? point : NIL;
    }

    public static SubLObject add_temporal_link(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        SubLObject link_addedP = NIL;
        if (((!before.eql(after)) && (NIL != sbhl_time_utilities.hl_endpoint_p(before))) && (NIL != sbhl_time_utilities.hl_endpoint_p(after))) {
            if (NIL != list_utilities.member_eqP(val, $list27)) {
                link_addedP = add_temporal_link_int(support, val, before, after, mt);
            } else
                if (val == $COORDINATE) {
                    link_addedP = add_temporal_link_int(support, $WEAK, before, after, mt);
                    link_addedP = makeBoolean((NIL != add_temporal_link_int(support, $WEAK, after, before, mt)) || (NIL != link_addedP));
                } else
                    if (val == $SUCCESSOR) {
                        link_addedP = add_temporal_link_int(support, $STRICT, before, after, mt);
                        link_addedP = makeBoolean((NIL != add_temporal_link_int(support, $WEAK_SUCCESSOR, after, before, mt)) || (NIL != link_addedP));
                    }


        }
        return link_addedP;
    }

    public static SubLObject remove_temporal_link(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        if ((NIL != sbhl_time_utilities.hl_endpoint_p(before)) && (NIL != sbhl_time_utilities.hl_endpoint_p(after))) {
            if (NIL != list_utilities.member_eqP(val, $list27)) {
                remove_temporal_link_int(support, val, before, after, mt);
            } else
                if (val == $COORDINATE) {
                    remove_temporal_link_int(support, $WEAK, before, after, mt);
                    remove_temporal_link_int(support, $WEAK, after, before, mt);
                } else
                    if (val == $SUCCESSOR) {
                        remove_temporal_link_int(support, $STRICT, before, after, mt);
                        remove_temporal_link_int(support, $WEAK_SUCCESSOR, after, before, mt);
                    }


        }
        return NIL;
    }

    public static SubLObject add_temporal_link_int(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) || (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_time_dates_add_link_support(support, val, before, after, mt);
        }
        if (NIL != existing_temporal_link_supportP(val, before, after, mt)) {
            if (!support.isCons()) {
                add_temporal_link_support(support, val, before, after, mt);
            }
            return NIL;
        }
        sbhl_time_search.add_precedence_link(before, mt, val, after);
        add_temporal_link_support(support, val, before, after, mt);
        return T;
    }

    public static SubLObject remove_temporal_link_int(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) || (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            sbhl_time_dates.sbhl_time_dates_remove_link_support(support, val, before, after, mt);
        } else {
            remove_temporal_link_support(support, val, before, after, mt);
        }
        return NIL;
    }

    public static SubLObject existing_temporal_link_supportP(final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        return existing_temporal_link_object_supportP(list(val, before, after, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
    }

    public static SubLObject existing_temporal_link_object_supportP(final SubLObject link_object, final SubLObject table) {
        final SubLObject value = gethash_without_values(link_object, table, UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject supports = cdolist_list_var = value;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.assertion_p(support)) && (NIL == assertions_high.valid_assertion(support, UNPROVIDED))) {
                supports = remove(support, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        if (NIL == supports) {
            remhash(link_object, table);
        } else
            if (!value.equal(supports)) {
                sethash(link_object, table, supports);
            }

        return list_utilities.sublisp_boolean(supports);
    }

    public static SubLObject add_temporal_link_support(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        return add_temporal_link_object_support(support, list(val, before, after, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
    }

    public static SubLObject add_temporal_link_object_support(final SubLObject support, final SubLObject link_object, final SubLObject table) {
        hash_table_utilities.pushnew_hash(link_object, support, table, symbol_function(EQUAL));
        return NIL;
    }

    public static SubLObject remove_temporal_link_support(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        final SubLObject link = list(val, before, after, mt);
        SubLObject supports = gethash_without_values(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
        SubLObject cdolist_list_var;
        supports = cdolist_list_var = remove(support, supports, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_support = NIL;
        new_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.assertion_p(new_support)) && (NIL == assertions_high.valid_assertion(new_support, UNPROVIDED))) {
                supports = remove(new_support, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_support = cdolist_list_var.first();
        } 
        if (NIL != supports) {
            sethash(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), supports);
        } else {
            sbhl_time_search.remove_precedence_link(before, mt, val, after);
            remhash(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
            if (NIL != assertion_handles.assertion_p(support)) {
                consider_removing_definitional_links(before);
                consider_removing_definitional_links(after);
                consider_removing_temporal_point(before);
                consider_removing_temporal_point(after);
            }
        }
        return NIL;
    }

    public static SubLObject consider_removing_temporal_point(final SubLObject temporal_point) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != sbhl_time_utilities.hl_endpoint_p(temporal_point)) && (NIL == sbhl_time_utilities.sbhl_temporal_node_p(temporal_point))) && (NIL == gethash_without_values(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), UNPROVIDED))) && (NIL == subl_promotions.memberP(temporal_point, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED))) {
            final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_points_being_removed$.currentBinding(thread);
            try {
                sbhl_time_vars.$sbhl_temporal_points_being_removed$.bind(cons(temporal_point, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread)), thread);
                sbhl_time_utilities.remove_hl_endpoint(temporal_point);
            } finally {
                sbhl_time_vars.$sbhl_temporal_points_being_removed$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject consider_removing_definitional_links(final SubLObject temporal_point) {
        if (NIL == sbhl_time_utilities.temporal_link_disjunction_term_p(temporal_point)) {
            if (NIL != sbhl_time_utilities.hl_date_point_p(temporal_point)) {
                consider_removing_definitional_links_for_date_point(temporal_point);
            } else {
                consider_removing_definitional_links_for_non_date_point(temporal_point);
            }
        }
        return NIL;
    }

    public static SubLObject consider_removing_definitional_links_for_date_point(final SubLObject point) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject eu_date = cycl_utilities.formula_arg1(point, UNPROVIDED);
        SubLObject before = NIL;
        SubLObject after = NIL;
        SubLObject before_link_tag = NIL;
        SubLObject after_link_tag = NIL;
        SubLObject preceding_link_tag = NIL;
        SubLObject preceding_node = NIL;
        SubLObject succeeding_link_tag = NIL;
        SubLObject succeeding_node = NIL;
        SubLObject do_not_removeP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject module_$7;
        SubLObject _prev_bind_0;
        SubLObject d_link;
        SubLObject rest_$8;
        SubLObject direction;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject iteration_state_$9;
        SubLObject tv;
        SubLObject link_nodes_var;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject rest_$9;
        SubLObject iteration_state_$10;
        for (do_not_removeP = NIL, rest = NIL, rest = sbhl_module_vars.get_sbhl_modules(); (NIL == do_not_removeP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            key = NIL;
            module = NIL;
            destructuring_bind_must_consp(current, datum, $list31);
            key = current.first();
            current = module = current.rest();
            if (NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                module_$7 = module;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$7 ? module_$7 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$7);
                    if (NIL != d_link) {
                        for (rest_$8 = NIL, rest_$8 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$7); (NIL == do_not_removeP) && (NIL != rest_$8); rest_$8 = rest_$8.rest()) {
                            direction = rest_$8.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$7);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$7))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$9 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$9)); iteration_state_$9 = dictionary_contents.do_dictionary_contents_next(iteration_state_$9)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$9);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == do_not_removeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (NIL != after) {
                                                            do_not_removeP = T;
                                                        } else {
                                                            after = link_node;
                                                            after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    if (NIL == do_not_removeP) {
                                                        csome_list_var = sol;
                                                        link_node2 = NIL;
                                                        link_node2 = csome_list_var.first();
                                                        while ((NIL == do_not_removeP) && (NIL != csome_list_var)) {
                                                            if (NIL != after) {
                                                                do_not_removeP = T;
                                                            } else {
                                                                after = link_node2;
                                                                after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            link_node2 = csome_list_var.first();
                                                        } 
                                                    }
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$9);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$7 ? module_$7 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$7);
                    if (NIL != d_link) {
                        for (rest_$9 = NIL, rest_$9 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$7); (NIL == do_not_removeP) && (NIL != rest_$9); rest_$9 = rest_$9.rest()) {
                            direction = rest_$9.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$7);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$7))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$10 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$10)); iteration_state_$10 = dictionary_contents.do_dictionary_contents_next(iteration_state_$10)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$10);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == do_not_removeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (NIL != before) {
                                                            do_not_removeP = T;
                                                        } else {
                                                            before = link_node;
                                                            before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    if (NIL == do_not_removeP) {
                                                        csome_list_var = sol;
                                                        link_node2 = NIL;
                                                        link_node2 = csome_list_var.first();
                                                        while ((NIL == do_not_removeP) && (NIL != csome_list_var)) {
                                                            if (NIL != before) {
                                                                do_not_removeP = T;
                                                            } else {
                                                                before = link_node2;
                                                                before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            link_node2 = csome_list_var.first();
                                                        } 
                                                    }
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$10);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (((NIL != do_not_removeP) || (NIL == before)) || (NIL == after)) {
            return NIL;
        }
        final SubLObject before_link = list(before_link_tag, before, point, $sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject before_supports = gethash_without_values(before_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
        if (!before_supports.eql($list33)) {
            return NIL;
        }
        final SubLObject after_link = list(after_link_tag, point, after, $sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject after_supports = gethash_without_values(after_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
        if (!after_supports.eql($list33)) {
            return NIL;
        }
        SubLObject pcase_var = before_link_tag;
        if (pcase_var.eql($STRICT)) {
            preceding_link_tag = $SUCCESSOR;
            preceding_node = before;
        } else
            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                preceding_link_tag = $SUCCESSOR_STRICT;
                preceding_node = before;
            }

        pcase_var = after_link_tag;
        if (pcase_var.eql($STRICT)) {
            succeeding_link_tag = $SUCCESSOR;
            succeeding_node = after;
        } else
            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                succeeding_link_tag = $SUCCESSOR_STRICT;
                succeeding_node = after;
            }

        if ((NIL != preceding_node) && (NIL != succeeding_node)) {
            add_temporal_link($DEFINITIONAL, $SUCCESSOR_STRICT, preceding_node, succeeding_node, $sbhl_time_default_link_mt$.getGlobalValue());
            remove_temporal_link($DEFINITIONAL, preceding_link_tag, preceding_node, point, $sbhl_time_default_link_mt$.getGlobalValue());
            remove_temporal_link($DEFINITIONAL, succeeding_link_tag, point, succeeding_node, $sbhl_time_default_link_mt$.getGlobalValue());
        } else
            if (NIL != preceding_node) {
                remove_temporal_link($DEFINITIONAL, preceding_link_tag, preceding_node, point, $sbhl_time_default_link_mt$.getGlobalValue());
            } else
                if (NIL != succeeding_node) {
                    remove_temporal_link($DEFINITIONAL, succeeding_link_tag, point, succeeding_node, $sbhl_time_default_link_mt$.getGlobalValue());
                }


        sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(remove(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject link_type_keyword_for_symbol(final SubLObject link_type_symbol) {
        assert NIL != symbolp(link_type_symbol) : "Types.symbolp(link_type_symbol) " + "CommonSymbols.NIL != Types.symbolp(link_type_symbol) " + link_type_symbol;
        if (link_type_symbol.eql($sym35$__)) {
            return $WEAK;
        }
        if (link_type_symbol.eql($sym36$_)) {
            return $STRICT;
        }
        if (link_type_symbol.eql($sym37$____)) {
            return $WEAK_SUCCESSOR;
        }
        if (link_type_symbol.eql($sym38$__)) {
            return $SUCCESSOR_STRICT;
        }
        return NIL;
    }

    public static SubLObject consider_removing_definitional_links_for_non_date_point(final SubLObject temporal_point) {
        if (NIL != sbhl_time_utilities.hl_start_p(temporal_point)) {
            consider_removing_definitional_links_for_non_date_point_start(temporal_point);
        } else
            if (NIL != sbhl_time_utilities.hl_end_p(temporal_point)) {
                consider_removing_definitional_links_for_non_date_point_end(temporal_point);
            }

        return NIL;
    }

    public static SubLObject consider_removing_definitional_links_for_non_date_point_start(final SubLObject before) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject after = NIL;
        SubLObject after_link_tag = NIL;
        SubLObject do_not_removeP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject module_$12;
        SubLObject _prev_bind_0;
        SubLObject d_link;
        SubLObject rest_$13;
        SubLObject direction;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject iteration_state_$14;
        SubLObject tv;
        SubLObject link_nodes_var;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject rest_$14;
        SubLObject iteration_state_$15;
        for (do_not_removeP = NIL, rest = NIL, rest = sbhl_module_vars.get_sbhl_modules(); (NIL == do_not_removeP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            key = NIL;
            module = NIL;
            destructuring_bind_must_consp(current, datum, $list31);
            key = current.first();
            current = module = current.rest();
            if (NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                module_$12 = module;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$12 ? module_$12 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(before, module_$12);
                    if (NIL != d_link) {
                        for (rest_$13 = NIL, rest_$13 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$12); (NIL == do_not_removeP) && (NIL != rest_$13); rest_$13 = rest_$13.rest()) {
                            direction = rest_$13.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$12);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$12))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14)); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == do_not_removeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        do_not_removeP = T;
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    if (NIL == do_not_removeP) {
                                                        csome_list_var = sol;
                                                        link_node2 = NIL;
                                                        link_node2 = csome_list_var.first();
                                                        while ((NIL == do_not_removeP) && (NIL != csome_list_var)) {
                                                            do_not_removeP = T;
                                                            csome_list_var = csome_list_var.rest();
                                                            link_node2 = csome_list_var.first();
                                                        } 
                                                    }
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$12 ? module_$12 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(before, module_$12);
                    if (NIL != d_link) {
                        for (rest_$14 = NIL, rest_$14 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$12); (NIL == do_not_removeP) && (NIL != rest_$14); rest_$14 = rest_$14.rest()) {
                            direction = rest_$14.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$12);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$12))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15)); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == do_not_removeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (NIL != after) {
                                                            do_not_removeP = T;
                                                        } else {
                                                            after = link_node;
                                                            after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$12);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    if (NIL == do_not_removeP) {
                                                        csome_list_var = sol;
                                                        link_node2 = NIL;
                                                        link_node2 = csome_list_var.first();
                                                        while ((NIL == do_not_removeP) && (NIL != csome_list_var)) {
                                                            if (NIL != after) {
                                                                do_not_removeP = T;
                                                            } else {
                                                                after = link_node2;
                                                                after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$12);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            link_node2 = csome_list_var.first();
                                                        } 
                                                    }
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if ((NIL != do_not_removeP) || (NIL == after)) {
            return NIL;
        }
        final SubLObject after_link = list(after_link_tag, before, after, $sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject supports = gethash_without_values(after_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
        if (!supports.equal($list33)) {
            return NIL;
        }
        remove_temporal_link($DEFINITIONAL, after_link_tag, before, after, $sbhl_time_default_link_mt$.getGlobalValue());
        return NIL;
    }

    public static SubLObject consider_removing_definitional_links_for_non_date_point_end(final SubLObject after) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject before = NIL;
        SubLObject before_link_tag = NIL;
        SubLObject do_not_removeP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject module_$17;
        SubLObject _prev_bind_0;
        SubLObject d_link;
        SubLObject rest_$18;
        SubLObject direction;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject iteration_state_$19;
        SubLObject tv;
        SubLObject link_nodes_var;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject rest_$19;
        SubLObject iteration_state_$20;
        for (do_not_removeP = NIL, rest = NIL, rest = sbhl_module_vars.get_sbhl_modules(); (NIL == do_not_removeP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            key = NIL;
            module = NIL;
            destructuring_bind_must_consp(current, datum, $list31);
            key = current.first();
            current = module = current.rest();
            if (NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                module_$17 = module;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$17 ? module_$17 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(after, module_$17);
                    if (NIL != d_link) {
                        for (rest_$18 = NIL, rest_$18 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$17); (NIL == do_not_removeP) && (NIL != rest_$18); rest_$18 = rest_$18.rest()) {
                            direction = rest_$18.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$17);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$17))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19)); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == do_not_removeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        do_not_removeP = T;
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    if (NIL == do_not_removeP) {
                                                        csome_list_var = sol;
                                                        link_node2 = NIL;
                                                        link_node2 = csome_list_var.first();
                                                        while ((NIL == do_not_removeP) && (NIL != csome_list_var)) {
                                                            do_not_removeP = T;
                                                            csome_list_var = csome_list_var.rest();
                                                            link_node2 = csome_list_var.first();
                                                        } 
                                                    }
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$17 ? module_$17 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(after, module_$17);
                    if (NIL != d_link) {
                        for (rest_$19 = NIL, rest_$19 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$17); (NIL == do_not_removeP) && (NIL != rest_$19); rest_$19 = rest_$19.rest()) {
                            direction = rest_$19.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$17);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$17))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == do_not_removeP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20)); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == do_not_removeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (NIL != before) {
                                                            do_not_removeP = T;
                                                        } else {
                                                            before = link_node;
                                                            before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$17);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    if (NIL == do_not_removeP) {
                                                        csome_list_var = sol;
                                                        link_node2 = NIL;
                                                        link_node2 = csome_list_var.first();
                                                        while ((NIL == do_not_removeP) && (NIL != csome_list_var)) {
                                                            if (NIL != before) {
                                                                do_not_removeP = T;
                                                            } else {
                                                                before = link_node2;
                                                                before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$17);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            link_node2 = csome_list_var.first();
                                                        } 
                                                    }
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if ((NIL != do_not_removeP) || (NIL == before)) {
            return NIL;
        }
        final SubLObject before_link = list(before_link_tag, before, after, $sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject supports = gethash_without_values(before_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
        if (!supports.equal($list33)) {
            return NIL;
        }
        remove_temporal_link($DEFINITIONAL, before_link_tag, before, after, $sbhl_time_default_link_mt$.getGlobalValue());
        return NIL;
    }

    public static SubLObject add_temporal_quasi_link_conjunction_negation(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        if (NIL == sbhl_time_query_processing.date_date_quasi_link_p(conjuncts.first())) {
            final SubLObject disjuncts = sbhl_time_query_processing.temporal_link_conjunction_negation(conjuncts);
            if (NIL != list_utilities.singletonP(disjuncts)) {
                add_temporal_quasi_link_conjunction(support, disjuncts, mt);
            } else {
                add_temporal_link_disjunction(support, disjuncts, mt);
            }
        }
        return NIL;
    }

    public static SubLObject remove_temporal_quasi_link_conjunction_negation(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        final SubLObject disjuncts = sbhl_time_query_processing.temporal_link_conjunction_negation(conjuncts);
        if (NIL != list_utilities.singletonP(disjuncts)) {
            remove_temporal_quasi_link_conjunction(support, disjuncts, mt);
        } else {
            remove_temporal_link_disjunction(support, disjuncts, mt);
        }
        return NIL;
    }

    public static SubLObject add_temporal_link_disjunction(final SubLObject support, final SubLObject disjuncts, final SubLObject mt) {
        final SubLObject link_disjunction = list(disjuncts, mt);
        if (NIL != existing_temporal_link_disjunction_supportP(link_disjunction)) {
            add_temporal_link_disjunction_support(support, link_disjunction);
        } else {
            add_temporal_link_disjunction_support(support, link_disjunction);
            add_note_of_temporal_link_disjunction_terms(link_disjunction);
        }
        return NIL;
    }

    public static SubLObject remove_temporal_link_disjunction(final SubLObject support, final SubLObject disjuncts, final SubLObject mt) {
        remove_temporal_link_disjunction_support(support, list(disjuncts, mt));
        return NIL;
    }

    public static SubLObject existing_temporal_link_disjunction_supportP(final SubLObject link_disjunction) {
        return existing_temporal_link_object_supportP(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
    }

    public static SubLObject add_temporal_link_disjunction_support(final SubLObject support, final SubLObject link_disjunction) {
        add_temporal_link_object_support(support, link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
        return NIL;
    }

    public static SubLObject remove_temporal_link_disjunction_support(final SubLObject support, final SubLObject link_disjunction) {
        SubLObject supports = gethash_without_values(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), UNPROVIDED);
        SubLObject cdolist_list_var;
        supports = cdolist_list_var = remove(support, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_support = NIL;
        new_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == assertions_high.valid_assertion(new_support, UNPROVIDED)) {
                supports = remove(new_support, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_support = cdolist_list_var.first();
        } 
        if (NIL != supports) {
            sethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), supports);
        } else {
            remhash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
            remove_note_of_temporal_link_disjunction_terms(link_disjunction);
        }
        return NIL;
    }

    public static SubLObject add_note_of_temporal_link_disjunction_terms(final SubLObject link_disjunction) {
        final SubLObject disjuncts = link_disjunction.first();
        SubLObject terms = NIL;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject disjunct = NIL;
        disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject before = find_or_create_hl_temporal_point(second(disjunct));
            final SubLObject after = find_or_create_hl_temporal_point(third(disjunct));
            SubLObject item_var = before;
            if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                terms = cons(item_var, terms);
            }
            item_var = after;
            if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                terms = cons(item_var, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        } 
        cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_temporal_link_disjunction_term_support(link_disjunction, v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject remove_note_of_temporal_link_disjunction_terms(final SubLObject link_disjunction) {
        final SubLObject disjuncts = link_disjunction.first();
        SubLObject terms = NIL;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject disjunct = NIL;
        disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject before = find_hl_temporal_point(second(disjunct));
            final SubLObject after = find_hl_temporal_point(third(disjunct));
            if (NIL != before) {
                final SubLObject item_var = before;
                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
            }
            if (NIL != after) {
                final SubLObject item_var = after;
                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        } 
        cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remove_temporal_link_disjunction_term_support(link_disjunction, v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject add_temporal_link_disjunction_term_support(final SubLObject support, final SubLObject temporal_point) {
        add_temporal_link_object_support(support, temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue());
        return NIL;
    }

    public static SubLObject remove_temporal_link_disjunction_term_support(final SubLObject support, final SubLObject temporal_point) {
        SubLObject supports = gethash_without_values(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), UNPROVIDED);
        supports = remove(support, supports, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != supports) {
            sethash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), supports);
        } else {
            remhash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue());
            consider_removing_definitional_links(temporal_point);
            consider_removing_temporal_point(temporal_point);
        }
        return NIL;
    }

    public static SubLObject remove_fort_from_sbhl_temporality_structures(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        if (NIL != sbhl_time_utilities.time_stored_in_hl_p(fort)) {
            final SubLObject hl_start = sbhl_time_utilities.find_hl_start(fort);
            final SubLObject hl_end = sbhl_time_utilities.find_hl_end(fort);
            if (NIL == subl_promotions.memberP(hl_start, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)) {
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_points_being_removed$.currentBinding(thread);
                try {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.bind(cons(hl_start, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject assertions = cdolist_list_var = temporal_point_assertion_supports(hl_start);
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        remove_temporal_relation(NIL, assertion, NIL);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                } finally {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.rebind(_prev_bind_0, thread);
                }
            }
            sbhl_time_utilities.remove_hl_start(fort, hl_start);
            if (NIL == subl_promotions.memberP(hl_end, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread), symbol_function(EQL), UNPROVIDED)) {
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_points_being_removed$.currentBinding(thread);
                try {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.bind(cons(hl_end, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject assertions = cdolist_list_var = temporal_point_assertion_supports(hl_end);
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        remove_temporal_relation(NIL, assertion, NIL);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                } finally {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.rebind(_prev_bind_0, thread);
                }
            }
            sbhl_time_utilities.remove_hl_end(fort, hl_end);
        }
        SubLObject cdolist_list_var2 = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list31);
            key = current.first();
            current = module = current.rest();
            if (NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                final SubLObject module_$22 = module;
                final SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module_$22);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject pred_var = pred;
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
                                    SubLObject done_var_$23 = NIL;
                                    final SubLObject token_var_$24 = NIL;
                                    while (NIL == done_var_$23) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                        final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(assertion2));
                                        if (NIL != valid_$25) {
                                            remove_temporal_relation(NIL, assertion2, NIL);
                                        }
                                        done_var_$23 = makeBoolean(NIL == valid_$25);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    pred_var = pred;
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
                                    SubLObject done_var_$24 = NIL;
                                    final SubLObject token_var_$25 = NIL;
                                    while (NIL == done_var_$24) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                        final SubLObject valid_$26 = makeBoolean(!token_var_$25.eql(assertion2));
                                        if (NIL != valid_$26) {
                                            remove_temporal_relation(NIL, assertion2, NIL);
                                        }
                                        done_var_$24 = makeBoolean(NIL == valid_$26);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject temporal_point_assertion_supports(final SubLObject point) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_disjunctions = gethash_without_values(point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), UNPROVIDED);
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list31);
            key = current.first();
            current = module = current.rest();
            if (NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                final SubLObject module_$31 = module;
                final SubLObject tag = sbhl_module_utilities.get_sbhl_module_tag(module_$31);
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$31 ? module_$31 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$31);
                    if (NIL != d_link) {
                        SubLObject cdolist_list_var_$32 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$31);
                        SubLObject direction = NIL;
                        direction = cdolist_list_var_$32.first();
                        while (NIL != cdolist_list_var_$32) {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$31);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$31))) {
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    SubLObject iteration_state_$33;
                                    for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                        final SubLObject link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            final SubLObject sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject after;
                                                SubLObject cdolist_list_var_$33;
                                                SubLObject supports;
                                                SubLObject support;
                                                SubLObject item_var;
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    after = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, after)) {
                                                        supports = cdolist_list_var_$33 = gethash_without_values(list(tag, point, after, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
                                                        support = NIL;
                                                        support = cdolist_list_var_$33.first();
                                                        while (NIL != cdolist_list_var_$33) {
                                                            if (NIL != assertions_high.valid_assertion(support, UNPROVIDED)) {
                                                                item_var = support;
                                                                if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    assertions = cons(item_var, assertions);
                                                                }
                                                            }
                                                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                            support = cdolist_list_var_$33.first();
                                                        } 
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    SubLObject csome_list_var = sol;
                                                    SubLObject after2 = NIL;
                                                    after2 = csome_list_var.first();
                                                    while (NIL != csome_list_var) {
                                                        SubLObject cdolist_list_var_$34;
                                                        final SubLObject supports2 = cdolist_list_var_$34 = gethash_without_values(list(tag, point, after2, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
                                                        SubLObject support2 = NIL;
                                                        support2 = cdolist_list_var_$34.first();
                                                        while (NIL != cdolist_list_var_$34) {
                                                            if (NIL != assertions_high.valid_assertion(support2, UNPROVIDED)) {
                                                                final SubLObject item_var2 = support2;
                                                                if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    assertions = cons(item_var2, assertions);
                                                                }
                                                            }
                                                            cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                            support2 = cdolist_list_var_$34.first();
                                                        } 
                                                        csome_list_var = csome_list_var.rest();
                                                        after2 = csome_list_var.first();
                                                    } 
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                            direction = cdolist_list_var_$32.first();
                        } 
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(NIL != module_$31 ? module_$31 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$31);
                    if (NIL != d_link) {
                        SubLObject cdolist_list_var_$35 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$31);
                        SubLObject direction = NIL;
                        direction = cdolist_list_var_$35.first();
                        while (NIL != cdolist_list_var_$35) {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$31);
                            if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$31))) {
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    SubLObject iteration_state_$34;
                                    for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                        final SubLObject link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            final SubLObject sol = link_nodes_var;
                                            if (NIL != set.set_p(sol)) {
                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject supports;
                                                SubLObject support;
                                                SubLObject item_var;
                                                SubLObject before;
                                                SubLObject cdolist_list_var_$36;
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    before = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, before)) {
                                                        supports = cdolist_list_var_$36 = gethash_without_values(list(tag, before, point, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
                                                        support = NIL;
                                                        support = cdolist_list_var_$36.first();
                                                        while (NIL != cdolist_list_var_$36) {
                                                            if (NIL != assertions_high.valid_assertion(support, UNPROVIDED)) {
                                                                item_var = support;
                                                                if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    assertions = cons(item_var, assertions);
                                                                }
                                                            }
                                                            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                                            support = cdolist_list_var_$36.first();
                                                        } 
                                                    }
                                                }
                                            } else
                                                if (sol.isList()) {
                                                    SubLObject csome_list_var = sol;
                                                    SubLObject before2 = NIL;
                                                    before2 = csome_list_var.first();
                                                    while (NIL != csome_list_var) {
                                                        SubLObject cdolist_list_var_$37;
                                                        final SubLObject supports2 = cdolist_list_var_$37 = gethash_without_values(list(tag, before2, point, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), UNPROVIDED);
                                                        SubLObject support2 = NIL;
                                                        support2 = cdolist_list_var_$37.first();
                                                        while (NIL != cdolist_list_var_$37) {
                                                            if (NIL != assertions_high.valid_assertion(support2, UNPROVIDED)) {
                                                                final SubLObject item_var2 = support2;
                                                                if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    assertions = cons(item_var2, assertions);
                                                                }
                                                            }
                                                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                            support2 = cdolist_list_var_$37.first();
                                                        } 
                                                        csome_list_var = csome_list_var.rest();
                                                        before2 = csome_list_var.first();
                                                    } 
                                                } else {
                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                }

                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                            direction = cdolist_list_var_$35.first();
                        } 
                    }
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        cdolist_list_var = link_disjunctions;
        SubLObject link_disjunction = NIL;
        link_disjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$38;
            final SubLObject link_disjunction_supports = cdolist_list_var_$38 = gethash_without_values(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), UNPROVIDED);
            SubLObject support3 = NIL;
            support3 = cdolist_list_var_$38.first();
            while (NIL != cdolist_list_var_$38) {
                if (NIL != assertions_high.valid_assertion(support3, UNPROVIDED)) {
                    final SubLObject item_var3 = support3;
                    if (NIL == member(item_var3, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                        assertions = cons(item_var3, assertions);
                    }
                }
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                support3 = cdolist_list_var_$38.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            link_disjunction = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static SubLObject handle_temporal_relation_literal_conflict(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, final SubLObject mt, SubLObject op) {
        if (op == UNPROVIDED) {
            op = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        final SubLObject gaf = narts_high.nart_expand(fi.assertion_expand(list(pred, arg1, arg2)));
        final SubLObject truth = enumeration_types.sense_truth(sense);
        if (NIL == $suppress_conflict_noticesP$.getDynamicValue(thread)) {
            Errors.warn($str43$sbhl_conflict___s__a__a__, gaf, truth, mt);
            if (NIL == $ignore_conflictsP$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_verbose_justsP$.currentBinding(thread);
                try {
                    sbhl_time_vars.$sbhl_temporality_verbose_justsP$.bind(NIL, thread);
                    final SubLObject why = sbhl_time_query_processing.why_true_temporal_relation_literalP(pred, arg1, arg2, enumeration_types.inverse_sense(sense), mt);
                    sbhl_temporality_conflict_notify($str44$sbhl_conflict___s__a__a________be, gaf, truth, mt, why);
                } finally {
                    sbhl_time_vars.$sbhl_temporality_verbose_justsP$.rebind(_prev_bind_0, thread);
                }
                conflicts.$current_conflicts$.setGlobalValue(cons(list(gaf, mt, truth, op), conflicts.$current_conflicts$.getGlobalValue()));
                conflicts.$mt_conflicts$.setGlobalValue(cons(list(gaf, mt, truth, op), conflicts.$mt_conflicts$.getGlobalValue()));
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_temporality_conflict_notify(final SubLObject format_string, final SubLObject gaf, final SubLObject truth, final SubLObject mt, SubLObject supports) {
        if (supports == UNPROVIDED) {
            supports = NIL;
        }
        final SubLObject new_format_string = cconcatenate(format_string, $str45$__a);
        if (NIL != agenda.within_agenda()) {
            final SubLObject pcase_var = agenda.agenda_error_mode();
            if (pcase_var.eql($IGNORE)) {
                Errors.warn(new_format_string, new SubLObject[]{ gaf, truth, mt, supports });
            } else
                if (pcase_var.eql($HALT)) {
                    $last_agenda_error_explanatory_supports$.setGlobalValue(supports);
                    Errors.error(format_string, gaf, truth, mt);
                } else
                    if (pcase_var.eql($DEBUG)) {
                        Errors.cerror($str49$leave_the_kb_inconsistent_for_now, new_format_string, new SubLObject[]{ gaf, truth, mt, supports });
                    }


        } else {
            Errors.cerror($str49$leave_the_kb_inconsistent_for_now, new_format_string, new SubLObject[]{ gaf, truth, mt, supports });
        }
        return NIL;
    }

    public static SubLObject declare_sbhl_time_assertion_processing_file() {
        declareFunction(me, "add_temporal_relation", "ADD-TEMPORAL-RELATION", 2, 1, false);
        declareFunction(me, "add_wff_temporal_relation", "ADD-WFF-TEMPORAL-RELATION", 2, 1, false);
        declareFunction(me, "remove_temporal_relation", "REMOVE-TEMPORAL-RELATION", 2, 1, false);
        declareFunction(me, "sbhl_assimilable_temporality_gafP", "SBHL-ASSIMILABLE-TEMPORALITY-GAF?", 3, 0, false);
        declareFunction(me, "add_temporal_relation_literal", "ADD-TEMPORAL-RELATION-LITERAL", 6, 0, false);
        declareFunction(me, "remove_temporal_relation_literal", "REMOVE-TEMPORAL-RELATION-LITERAL", 6, 0, false);
        declareFunction(me, "add_temporal_quasi_link_conjunction", "ADD-TEMPORAL-QUASI-LINK-CONJUNCTION", 3, 0, false);
        declareFunction(me, "remove_temporal_quasi_link_conjunction", "REMOVE-TEMPORAL-QUASI-LINK-CONJUNCTION", 3, 0, false);
        declareFunction(me, "find_or_create_hl_temporal_point", "FIND-OR-CREATE-HL-TEMPORAL-POINT", 1, 0, false);
        declareFunction(me, "find_hl_temporal_point", "FIND-HL-TEMPORAL-POINT", 1, 0, false);
        declareFunction(me, "add_hl_start_for_non_date", "ADD-HL-START-FOR-NON-DATE", 1, 0, false);
        declareFunction(me, "find_or_create_hl_start", "FIND-OR-CREATE-HL-START", 1, 0, false);
        declareFunction(me, "add_hl_end_for_non_date", "ADD-HL-END-FOR-NON-DATE", 1, 0, false);
        declareFunction(me, "find_or_create_hl_end", "FIND-OR-CREATE-HL-END", 1, 0, false);
        declareFunction(me, "add_hl_start_for_extended_universal_date", "ADD-HL-START-FOR-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "add_hl_end_for_extended_universal_date", "ADD-HL-END-FOR-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "closest_hl_point_node_at_or_after_start", "CLOSEST-HL-POINT-NODE-AT-OR-AFTER-START", 1, 0, false);
        declareFunction(me, "closest_hl_point_node_at_or_before_end", "CLOSEST-HL-POINT-NODE-AT-OR-BEFORE-END", 1, 0, false);
        declareFunction(me, "add_temporal_link", "ADD-TEMPORAL-LINK", 5, 0, false);
        declareFunction(me, "remove_temporal_link", "REMOVE-TEMPORAL-LINK", 5, 0, false);
        declareFunction(me, "add_temporal_link_int", "ADD-TEMPORAL-LINK-INT", 5, 0, false);
        declareFunction(me, "remove_temporal_link_int", "REMOVE-TEMPORAL-LINK-INT", 5, 0, false);
        declareFunction(me, "existing_temporal_link_supportP", "EXISTING-TEMPORAL-LINK-SUPPORT?", 4, 0, false);
        declareFunction(me, "existing_temporal_link_object_supportP", "EXISTING-TEMPORAL-LINK-OBJECT-SUPPORT?", 2, 0, false);
        declareFunction(me, "add_temporal_link_support", "ADD-TEMPORAL-LINK-SUPPORT", 5, 0, false);
        declareFunction(me, "add_temporal_link_object_support", "ADD-TEMPORAL-LINK-OBJECT-SUPPORT", 3, 0, false);
        declareFunction(me, "remove_temporal_link_support", "REMOVE-TEMPORAL-LINK-SUPPORT", 5, 0, false);
        declareFunction(me, "consider_removing_temporal_point", "CONSIDER-REMOVING-TEMPORAL-POINT", 1, 0, false);
        declareFunction(me, "consider_removing_definitional_links", "CONSIDER-REMOVING-DEFINITIONAL-LINKS", 1, 0, false);
        declareFunction(me, "consider_removing_definitional_links_for_date_point", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-DATE-POINT", 1, 0, false);
        declareFunction(me, "link_type_keyword_for_symbol", "LINK-TYPE-KEYWORD-FOR-SYMBOL", 1, 0, false);
        declareFunction(me, "consider_removing_definitional_links_for_non_date_point", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-NON-DATE-POINT", 1, 0, false);
        declareFunction(me, "consider_removing_definitional_links_for_non_date_point_start", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-NON-DATE-POINT-START", 1, 0, false);
        declareFunction(me, "consider_removing_definitional_links_for_non_date_point_end", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-NON-DATE-POINT-END", 1, 0, false);
        declareFunction(me, "add_temporal_quasi_link_conjunction_negation", "ADD-TEMPORAL-QUASI-LINK-CONJUNCTION-NEGATION", 3, 0, false);
        declareFunction(me, "remove_temporal_quasi_link_conjunction_negation", "REMOVE-TEMPORAL-QUASI-LINK-CONJUNCTION-NEGATION", 3, 0, false);
        declareFunction(me, "add_temporal_link_disjunction", "ADD-TEMPORAL-LINK-DISJUNCTION", 3, 0, false);
        declareFunction(me, "remove_temporal_link_disjunction", "REMOVE-TEMPORAL-LINK-DISJUNCTION", 3, 0, false);
        declareFunction(me, "existing_temporal_link_disjunction_supportP", "EXISTING-TEMPORAL-LINK-DISJUNCTION-SUPPORT?", 1, 0, false);
        declareFunction(me, "add_temporal_link_disjunction_support", "ADD-TEMPORAL-LINK-DISJUNCTION-SUPPORT", 2, 0, false);
        declareFunction(me, "remove_temporal_link_disjunction_support", "REMOVE-TEMPORAL-LINK-DISJUNCTION-SUPPORT", 2, 0, false);
        declareFunction(me, "add_note_of_temporal_link_disjunction_terms", "ADD-NOTE-OF-TEMPORAL-LINK-DISJUNCTION-TERMS", 1, 0, false);
        declareFunction(me, "remove_note_of_temporal_link_disjunction_terms", "REMOVE-NOTE-OF-TEMPORAL-LINK-DISJUNCTION-TERMS", 1, 0, false);
        declareFunction(me, "add_temporal_link_disjunction_term_support", "ADD-TEMPORAL-LINK-DISJUNCTION-TERM-SUPPORT", 2, 0, false);
        declareFunction(me, "remove_temporal_link_disjunction_term_support", "REMOVE-TEMPORAL-LINK-DISJUNCTION-TERM-SUPPORT", 2, 0, false);
        declareFunction(me, "remove_fort_from_sbhl_temporality_structures", "REMOVE-FORT-FROM-SBHL-TEMPORALITY-STRUCTURES", 1, 0, false);
        declareFunction(me, "temporal_point_assertion_supports", "TEMPORAL-POINT-ASSERTION-SUPPORTS", 1, 0, false);
        declareFunction(me, "handle_temporal_relation_literal_conflict", "HANDLE-TEMPORAL-RELATION-LITERAL-CONFLICT", 5, 1, false);
        declareFunction(me, "sbhl_temporality_conflict_notify", "SBHL-TEMPORALITY-CONFLICT-NOTIFY", 4, 1, false);
        return NIL;
    }

    public static SubLObject init_sbhl_time_assertion_processing_file() {
        deflexical("*SBHL-TIME-DEFAULT-LINK-MT*", SubLTrampolineFile.maybeDefault($sbhl_time_default_link_mt$, $sbhl_time_default_link_mt$, $$BaseKB));
        deflexical("*HL-START-END-FN-DEFINING-MT*", SubLTrampolineFile.maybeDefault($hl_start_end_fn_defining_mt$, $hl_start_end_fn_defining_mt$, $$BaseKB));
        return NIL;
    }

    public static SubLObject setup_sbhl_time_assertion_processing_file() {
        declare_defglobal($sbhl_time_default_link_mt$);
        mt_vars.note_mt_var($sbhl_time_default_link_mt$, NIL);
        declare_defglobal($hl_start_end_fn_defining_mt$);
        mt_vars.note_mt_var($hl_start_end_fn_defining_mt$, $$HL_StartFn);
        register_kb_function(ADD_TEMPORAL_RELATION);
        register_kb_function(REMOVE_TEMPORAL_RELATION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_assertion_processing_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_assertion_processing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_assertion_processing_file();
    }

    static {





















































    }
}

/**
 * Total time: 828 ms
 */
