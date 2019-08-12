/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.clause_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-GENLS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-genls.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_genls extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_genls();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_superset_cost$ = makeSymbol("*DEFAULT-SUPERSET-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_nat_all_genls_cost$ = makeSymbol("*DEFAULT-NAT-ALL-GENLS-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $all_specs_lazy_iteration_threshold$ = makeSymbol("*ALL-SPECS-LAZY-ITERATION-THRESHOLD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_superset_cost$ = makeSymbol("*DEFAULT-NOT-SUPERSET-COST*");



    private static final SubLSymbol $REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");

    private static final SubLSymbol $ALL_SPECS_OF_FORT_POS = makeKeyword("ALL-SPECS-OF-FORT-POS");

    static private final SubLList $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), $FORT), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $ALL_SPECS_OF_NON_FORT_POS = makeKeyword("ALL-SPECS-OF-NON-FORT-POS");

    static private final SubLList $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), $FORT))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $ALL_GENLS_POS = makeKeyword("ALL-GENLS-POS");

    static private final SubLList $list9 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $sym10$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog #$Animal)") });

    private static final SubLSymbol $REMOVAL_NAT_GENLS = makeKeyword("REMOVAL-NAT-GENLS");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) #$Animal)") });

    private static final SubLSymbol $REMOVAL_ALL_GENLS = makeKeyword("REMOVAL-ALL-GENLS");

    private static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-ALL-GENLS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog ?WHAT)") });

    private static final SubLSymbol $REMOVAL_NAT_ALL_GENLS = makeKeyword("REMOVAL-NAT-ALL-GENLS");

    private static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NAT-ALL-GENLS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <not fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) ?WHAT)") });

    private static final SubLInteger $int$550 = makeInteger(550);

    private static final SubLSymbol $REMOVAL_ALL_SPECS = makeKeyword("REMOVAL-ALL-SPECS");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ALL-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genls"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls ?WHAT #$Animal)") });

    private static final SubLSymbol $REMOVAL_NOT_SUPERSET = makeKeyword("REMOVAL-NOT-SUPERSET");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("OR"), $FORT, cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("FIF"), makeSymbol("*NEGATION-BY-FAILURE*"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeSymbol("*DEFAULT-NOT-SUPERSET-COST*")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <fort> <fully-bound>))\n    (#$not (#$genls (<fully-bound> . <fully-bound>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$Collection #$Individual))\n    (#$not (#$genls (#$JuvenileFn #$Cougar) #$Individual))") });

    private static final SubLSymbol $REMOVAL_GENLS_BETWEEN = makeKeyword("REMOVAL-GENLS-BETWEEN");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("genls")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-GENLS-BETWEEN-APPLICABILITY"), $COST, makeSymbol("REMOVAL-GENLS-BETWEEN-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$genls <fort1> <varN>)\n           (#$genls <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$genls #$Dog ?COL)\n           (#$genls ?COL #$Animal))") });

    private static final SubLSymbol BINARY_CLAUSE_P = makeSymbol("BINARY-CLAUSE-P");

    private static final SubLList $list29 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLSymbol REMOVAL_GENLS_BETWEEN_COMPLETENESS = makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS");

    static private final SubLList $list34 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));

    static private final SubLList $list35 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    static private final SubLList $list36 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));

    private static final SubLList $list37 = list(makeSymbol("INDEX"), makeSymbol("VARIABLE"));

    private static final SubLSymbol $REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK = makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-POS-CHECK");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>))") });

    private static final SubLSymbol $REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK = makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-NEG-CHECK");

    private static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>)))") });









    private static final SubLSymbol $REMOVAL_GENLS_DOWN_ARG2_BOUND = makeKeyword("REMOVAL-GENLS-DOWN-ARG2-BOUND");

    private static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlsDown"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlsDown"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <fully-bound>)\n(#$genlsDown <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog #$Animal)\n(#$genlsDown ?WHAT #$Dog)") });

    private static final SubLSymbol REMOVAL_GENLS_DOWN_ARG2_BOUND_COST = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST");

    private static final SubLSymbol REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS");

    private static final SubLSymbol REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND");

    static private final SubLList $list53 = list(makeSymbol("GENLS-DOWN"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLSymbol $REMOVAL_GENLS_DOWN_ARG2_UNIFY = makeKeyword("REMOVAL-GENLS-DOWN-ARG2-UNIFY");

    static private final SubLList $list55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlsDown"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlsDown"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlsDown"), list($BIND, makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(list(reader_make_constant_shell("genlsDown"), makeKeyword("INPUT"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog ?WHAT)") });

    // Definitions
    public static final SubLObject inference_genlP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != inference_trampolines.inference_collectionP(spec, mt)) && (spec.equal(genl) || ((NIL != inference_trampolines.inference_collectionP(genl, mt)) && (NIL != genls.genlP(spec, genl, mt, tv)))));
    }

    // Definitions
    public static SubLObject inference_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((NIL != inference_trampolines.inference_collectionP(spec, mt)) && ((NIL != equals.equalsP(spec, genl, UNPROVIDED, UNPROVIDED)) || ((NIL != inference_trampolines.inference_collectionP(genl, mt)) && (NIL != genls.genlP(spec, genl, mt, tv)))));
    }

    public static final SubLObject inference_not_genlP_alt(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((((!spec.equal(genl)) && (NIL != inference_trampolines.inference_collectionP(spec, mt))) && (NIL != inference_trampolines.inference_collectionP(genl, mt))) && (NIL != genls.not_genlP(spec, genl, mt, tv)));
    }

    public static SubLObject inference_not_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return makeBoolean((((NIL == equals.equalsP(spec, genl, UNPROVIDED, UNPROVIDED)) && (NIL != inference_trampolines.inference_collectionP(spec, mt))) && (NIL != inference_trampolines.inference_collectionP(genl, mt))) && (NIL != genls.not_genlP(spec, genl, mt, tv)));
    }

    public static final SubLObject inference_all_genls_alt(SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != inference_trampolines.inference_collectionP(spec, mt)) {
            return genls.all_genls(spec, mt, tv);
        }
        return NIL;
    }

    public static SubLObject inference_all_genls(final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != inference_trampolines.inference_collectionP(spec, mt)) {
            return Sort.sort(genls.all_genls(spec, mt, tv), $sym10$GENERALITY_ESTIMATE_, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject inference_all_specs_alt(SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != inference_trampolines.inference_collectionP(genl, mt)) {
            return genls.all_specs(genl, mt, tv);
        }
        return NIL;
    }

    public static SubLObject inference_all_specs(final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (NIL != inference_trampolines.inference_collectionP(genl, mt)) {
            return genls.all_specs(genl, mt, tv);
        }
        return NIL;
    }

    public static final SubLObject inference_genls_between_alt(SubLObject lower_bound_col, SubLObject upper_bound_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ((NIL != inference_trampolines.inference_collectionP(lower_bound_col, UNPROVIDED)) && (NIL != inference_trampolines.inference_collectionP(upper_bound_col, UNPROVIDED))) {
                            result = genls.all_genls_wrt(lower_bound_col, upper_bound_col, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject inference_genls_between(final SubLObject lower_bound_col, final SubLObject upper_bound_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != inference_trampolines.inference_collectionP(lower_bound_col, UNPROVIDED)) && (NIL != inference_trampolines.inference_collectionP(upper_bound_col, UNPROVIDED))) {
                result = genls.all_genls_wrt(lower_bound_col, upper_bound_col, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject removal_superset_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_superset_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($GENLS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject removal_nat_genls_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.removal_superset_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_nat_genls_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_superset_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_all_genls_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_genls_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static final SubLObject removal_all_genls_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                SubLObject collections = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.inference_all_genls(subset, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = collections;
                SubLObject collection = NIL;
                for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            {
                                SubLObject unify_arg2 = bindings.subst_bindings(v_bindings, arg2);
                                SubLObject formula = list($$genls, subset, unify_arg2);
                                backward.removal_add_node(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_all_genls_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject collections = cdolist_list_var = inference_all_genls(subset, UNPROVIDED, UNPROVIDED);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject unify_arg2 = bindings.subst_bindings(v_bindings, arg2);
                final SubLObject formula = list($$genls, subset, unify_arg2);
                backward.removal_add_node(arguments.make_hl_support($GENLS, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_nat_all_genls_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.removal_all_genls_expand(asent, UNPROVIDED);
    }

    public static SubLObject removal_nat_all_genls_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_all_genls_expand(asent, UNPROVIDED);
    }

    public static final SubLObject removal_all_specs_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
        }
    }

    public static SubLObject removal_all_specs_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $$genls));
    }

    public static final SubLObject removal_all_specs_iterator_alt(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (cardinality_estimates.spec_cardinality(collection).numG($all_specs_lazy_iteration_threshold$.getDynamicValue(thread))) {
                return kb_iterators.new_specs_iterator(collection);
            }
            return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.inference_all_specs(collection, UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject removal_all_specs_iterator(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cardinality_estimates.spec_cardinality(collection).numG($all_specs_lazy_iteration_threshold$.getDynamicValue(thread))) {
            return kb_iterators.new_specs_iterator(collection);
        }
        return iteration.new_list_iterator(inference_all_specs(collection, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject removal_not_superset_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED))) {
                    backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.inference_not_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                        backward.removal_add_node(arguments.make_hl_support($GENLS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_superset_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED))) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != inference_not_genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static final SubLObject removal_genls_between_applicability_alt(SubLObject contextualized_dnf_clause) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.removal_sbhl_between_applicability(contextualized_dnf_clause, $$genls);
    }

    public static SubLObject removal_genls_between_applicability(final SubLObject contextualized_dnf_clause) {
        return removal_sbhl_between_applicability(contextualized_dnf_clause, $$genls);
    }

    public static final SubLObject removal_genls_between_cost_alt(SubLObject contextualized_dnf_clause) {
        SubLTrampolineFile.checkType(contextualized_dnf_clause, BINARY_CLAUSE_P);
        {
            SubLObject spec = NIL;
            SubLObject genl = NIL;
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                {
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
                            spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                        } else {
                            genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt28);
                    }
                }
            }
            SubLTrampolineFile.checkType(spec, FORT_P);
            SubLTrampolineFile.checkType(genl, FORT_P);
            {
                SubLObject cardinality_diff = subtract(cardinality_estimates.genl_cardinality(spec), cardinality_estimates.genl_cardinality(genl));
                return max(ZERO_INTEGER, number_utilities.f_1X(cardinality_diff));
            }
        }
    }

    public static SubLObject removal_genls_between_cost(final SubLObject contextualized_dnf_clause) {
        assert NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) : "! clause_utilities.binary_clause_p(contextualized_dnf_clause) " + ("clause_utilities.binary_clause_p(contextualized_dnf_clause) " + "CommonSymbols.NIL != clause_utilities.binary_clause_p(contextualized_dnf_clause) ") + contextualized_dnf_clause;
        SubLObject spec = NIL;
        SubLObject genl = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) {
                    spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                } else {
                    genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(spec) : "! forts.fort_p(spec) " + ("forts.fort_p(spec) " + "CommonSymbols.NIL != forts.fort_p(spec) ") + spec;
        assert NIL != forts.fort_p(genl) : "! forts.fort_p(genl) " + ("forts.fort_p(genl) " + "CommonSymbols.NIL != forts.fort_p(genl) ") + genl;
        final SubLObject cardinality_diff = subtract(cardinality_estimates.genl_cardinality(spec), cardinality_estimates.genl_cardinality(genl));
        return max(ZERO_INTEGER, number_utilities.f_1X(cardinality_diff));
    }

    public static final SubLObject removal_genls_between_completeness_alt() {
        return NIL != kb_accessors.complete_extent_enumerableP($$genls, UNPROVIDED) ? ((SubLObject) ($COMPLETE)) : $INCOMPLETE;
    }

    public static SubLObject removal_genls_between_completeness() {
        return NIL != kb_accessors.complete_extent_enumerableP($$genls, UNPROVIDED) ? $COMPLETE : $INCOMPLETE;
    }

    public static final SubLObject removal_genls_between_expand_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject current = datum;
                SubLObject contextualized_asent0 = NIL;
                SubLObject contextualized_asent1 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt33);
                contextualized_asent0 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt33);
                contextualized_asent1 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject datum_1 = contextualized_asent0;
                        SubLObject current_2 = datum_1;
                        SubLObject mt0 = NIL;
                        SubLObject asent0 = NIL;
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt34);
                        mt0 = current_2.first();
                        current_2 = current_2.rest();
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt34);
                        asent0 = current_2.first();
                        current_2 = current_2.rest();
                        if (NIL == current_2) {
                            {
                                SubLObject datum_3 = contextualized_asent1;
                                SubLObject current_4 = datum_3;
                                SubLObject mt1 = NIL;
                                SubLObject asent1 = NIL;
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt35);
                                mt1 = current_4.first();
                                current_4 = current_4.rest();
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt35);
                                asent1 = current_4.first();
                                current_4 = current_4.rest();
                                if (NIL == current_4) {
                                    if (mt0.equal(mt1)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject lower_bound_asent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.removal_genls_between_categorize_asents(asent0, asent1);
                                            SubLObject upper_bound_asent = thread.secondMultipleValue();
                                            SubLObject lower_firstP = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject lower_bound = cycl_utilities.atomic_sentence_arg1(lower_bound_asent, UNPROVIDED);
                                                SubLObject variable = cycl_utilities.atomic_sentence_arg2(lower_bound_asent, UNPROVIDED);
                                                SubLObject upper_bound = cycl_utilities.atomic_sentence_arg2(upper_bound_asent, UNPROVIDED);
                                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.inference_genls_between(lower_bound, upper_bound, mt0);
                                                SubLObject between_col = NIL;
                                                for (between_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , between_col = cdolist_list_var.first()) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings = unification_utilities.term_unify(variable, between_col, UNPROVIDED, UNPROVIDED);
                                                        SubLObject unify_justification = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings) {
                                                            {
                                                                SubLObject lower_support_formula = make_binary_formula($$genls, lower_bound, between_col);
                                                                SubLObject upper_support_formula = make_binary_formula($$genls, between_col, upper_bound);
                                                                SubLObject lower_support = arguments.make_hl_support($GENLS, lower_support_formula, mt0, UNPROVIDED);
                                                                SubLObject upper_support = arguments.make_hl_support($GENLS, upper_support_formula, mt0, UNPROVIDED);
                                                                SubLObject lower_supports = list(lower_support);
                                                                SubLObject upper_supports = list(upper_support);
                                                                SubLObject justifications = (NIL != lower_firstP) ? ((SubLObject) (list(lower_supports, upper_supports))) : list(upper_supports, lower_supports);
                                                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_3, $list_alt35);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_1, $list_alt34);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt33);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_genls_between_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent0 = NIL;
        SubLObject contextualized_asent2 = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        contextualized_asent0 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        contextualized_asent2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = contextualized_asent0;
            SubLObject mt0 = NIL;
            SubLObject asent0 = NIL;
            destructuring_bind_must_consp(current_$2, datum_$1, $list35);
            mt0 = current_$2.first();
            current_$2 = current_$2.rest();
            destructuring_bind_must_consp(current_$2, datum_$1, $list35);
            asent0 = current_$2.first();
            current_$2 = current_$2.rest();
            if (NIL == current_$2) {
                SubLObject current_$3;
                final SubLObject datum_$2 = current_$3 = contextualized_asent2;
                SubLObject mt2 = NIL;
                SubLObject asent2 = NIL;
                destructuring_bind_must_consp(current_$3, datum_$2, $list36);
                mt2 = current_$3.first();
                current_$3 = current_$3.rest();
                destructuring_bind_must_consp(current_$3, datum_$2, $list36);
                asent2 = current_$3.first();
                current_$3 = current_$3.rest();
                if (NIL == current_$3) {
                    if (mt0.equal(mt2)) {
                        thread.resetMultipleValues();
                        final SubLObject lower_bound_asent = removal_genls_between_categorize_asents(asent0, asent2);
                        final SubLObject upper_bound_asent = thread.secondMultipleValue();
                        final SubLObject lower_firstP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject lower_bound = cycl_utilities.atomic_sentence_arg1(lower_bound_asent, UNPROVIDED);
                        final SubLObject variable = cycl_utilities.atomic_sentence_arg2(lower_bound_asent, UNPROVIDED);
                        final SubLObject upper_bound = cycl_utilities.atomic_sentence_arg2(upper_bound_asent, UNPROVIDED);
                        SubLObject cdolist_list_var = inference_genls_between(lower_bound, upper_bound, mt0);
                        SubLObject between_col = NIL;
                        between_col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings = unification_utilities.term_unify(variable, between_col, UNPROVIDED, UNPROVIDED);
                            final SubLObject unify_justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != v_bindings) {
                                final SubLObject lower_support_formula = make_binary_formula($$genls, lower_bound, between_col);
                                final SubLObject upper_support_formula = make_binary_formula($$genls, between_col, upper_bound);
                                final SubLObject lower_support = arguments.make_hl_support($GENLS, lower_support_formula, mt0, UNPROVIDED);
                                final SubLObject upper_support = arguments.make_hl_support($GENLS, upper_support_formula, mt0, UNPROVIDED);
                                final SubLObject lower_supports = list(lower_support);
                                final SubLObject upper_supports = list(upper_support);
                                final SubLObject justifications = (NIL != lower_firstP) ? list(lower_supports, upper_supports) : list(upper_supports, lower_supports);
                                inference_worker_removal.conjunctive_removal_callback(v_bindings, justifications);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            between_col = cdolist_list_var.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum_$2, $list36);
                }
            } else {
                cdestructuring_bind_error(datum_$1, $list35);
            }
        } else {
            cdestructuring_bind_error(datum, $list34);
        }
        return NIL;
    }

    public static final SubLObject removal_sbhl_between_applicability_alt(SubLObject contextualized_dnf_clause, SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subclause_specs = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pos_pred_indices_var_arg1 = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.find_pos_pred_indices_for_pred_between(contextualized_dnf_clause, predicate);
                    SubLObject pos_pred_indices_var_arg2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != pos_pred_indices_var_arg1) && (NIL != pos_pred_indices_var_arg2)) {
                        {
                            SubLObject var2_index = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = pos_pred_indices_var_arg2;
                                SubLObject pair = NIL;
                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = pair;
                                        SubLObject current = datum;
                                        SubLObject index = NIL;
                                        SubLObject variable = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt36);
                                        index = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt36);
                                        variable = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            dictionary_utilities.dictionary_push(var2_index, variable, index);
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt36);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = pos_pred_indices_var_arg1;
                                SubLObject pair = NIL;
                                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = pair;
                                        SubLObject current = datum;
                                        SubLObject index = NIL;
                                        SubLObject variable = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt36);
                                        index = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt36);
                                        variable = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject paired_indices = dictionary.dictionary_lookup(var2_index, variable, UNPROVIDED);
                                                SubLObject cdolist_list_var_5 = paired_indices;
                                                SubLObject paired_index = NIL;
                                                for (paired_index = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , paired_index = cdolist_list_var_5.first()) {
                                                    {
                                                        SubLObject subclause_spec = new_subclause_spec(NIL, list(index, paired_index));
                                                        subclause_specs = cons(subclause_spec, subclause_specs);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt36);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(subclause_specs);
            }
        }
    }

    public static SubLObject removal_sbhl_between_applicability(final SubLObject contextualized_dnf_clause, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        thread.resetMultipleValues();
        final SubLObject pos_pred_indices_var_arg1 = find_pos_pred_indices_for_pred_between(contextualized_dnf_clause, predicate);
        final SubLObject pos_pred_indices_var_arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != pos_pred_indices_var_arg1) && (NIL != pos_pred_indices_var_arg2)) {
            final SubLObject var2_index = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var = pos_pred_indices_var_arg2;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject index = NIL;
                SubLObject variable = NIL;
                destructuring_bind_must_consp(current, datum, $list37);
                index = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list37);
                variable = current.first();
                current = current.rest();
                if (NIL == current) {
                    dictionary_utilities.dictionary_push(var2_index, variable, index);
                } else {
                    cdestructuring_bind_error(datum, $list37);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
            cdolist_list_var = pos_pred_indices_var_arg1;
            pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject index = NIL;
                SubLObject variable = NIL;
                destructuring_bind_must_consp(current, datum, $list37);
                index = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list37);
                variable = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$5;
                    final SubLObject paired_indices = cdolist_list_var_$5 = dictionary.dictionary_lookup(var2_index, variable, UNPROVIDED);
                    SubLObject paired_index = NIL;
                    paired_index = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        final SubLObject subclause_spec = clause_utilities.new_subclause_spec(NIL, list(index, paired_index));
                        subclause_specs = cons(subclause_spec, subclause_specs);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        paired_index = cdolist_list_var_$5.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list37);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        }
        return nreverse(subclause_specs);
    }

    public static final SubLObject find_pos_pred_indices_for_pred_between_alt(SubLObject contextualized_dnf_clause, SubLObject predicate) {
        {
            SubLObject pos_pred_indices_var_arg1 = NIL;
            SubLObject pos_pred_indices_var_arg2 = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                {
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                            {
                                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                                if ((NIL != variables.variable_p(arg1)) && (NIL != fort_p(arg2))) {
                                    pos_pred_indices_var_arg1 = cons(list(index, arg1), pos_pred_indices_var_arg1);
                                } else {
                                    if ((NIL != fort_p(arg1)) && (NIL != variables.variable_p(arg2))) {
                                        pos_pred_indices_var_arg2 = cons(list(index, arg2), pos_pred_indices_var_arg2);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt28);
                    }
                }
                index = add(index, ONE_INTEGER);
            }
            pos_pred_indices_var_arg1 = nreverse(pos_pred_indices_var_arg1);
            pos_pred_indices_var_arg2 = nreverse(pos_pred_indices_var_arg2);
            return values(pos_pred_indices_var_arg1, pos_pred_indices_var_arg2);
        }
    }

    public static SubLObject find_pos_pred_indices_for_pred_between(final SubLObject contextualized_dnf_clause, final SubLObject predicate) {
        SubLObject pos_pred_indices_var_arg1 = NIL;
        SubLObject pos_pred_indices_var_arg2 = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if ((NIL != variables.variable_p(arg1)) && (NIL != forts.fort_p(arg2))) {
                        pos_pred_indices_var_arg1 = cons(list(index, arg1), pos_pred_indices_var_arg1);
                    } else
                        if ((NIL != forts.fort_p(arg1)) && (NIL != variables.variable_p(arg2))) {
                            pos_pred_indices_var_arg2 = cons(list(index, arg2), pos_pred_indices_var_arg2);
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        pos_pred_indices_var_arg1 = nreverse(pos_pred_indices_var_arg1);
        pos_pred_indices_var_arg2 = nreverse(pos_pred_indices_var_arg2);
        return values(pos_pred_indices_var_arg1, pos_pred_indices_var_arg2);
    }

    public static final SubLObject removal_genls_between_categorize_asents_alt(SubLObject asent0, SubLObject asent1) {
        if (NIL != fort_p(cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED))) {
            return values(asent0, asent1, T);
        } else {
            return values(asent1, asent0, NIL);
        }
    }

    public static SubLObject removal_genls_between_categorize_asents(final SubLObject asent0, final SubLObject asent1) {
        if (NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED))) {
            return values(asent0, asent1, T);
        }
        return values(asent1, asent0, NIL);
    }

    public static final SubLObject removal_genls_collection_subset_check_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.removal_genls_collection_subset_construct_query(asent);
                SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL != recursive_results) {
                    {
                        SubLObject query_support = arguments.make_hl_support($QUERY, query, UNPROVIDED, UNPROVIDED);
                        if (NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                            backward.removal_add_node(query_support, NIL, NIL);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_genls_collection_subset_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = removal_genls_collection_subset_construct_query(asent);
        final SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != recursive_results) {
            final SubLObject query_support = arguments.make_hl_support($QUERY, query, UNPROVIDED, UNPROVIDED);
            if (NIL != cyc_kernel.closed_query_success_token_p(recursive_results)) {
                backward.removal_add_node(query_support, NIL, NIL);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_genls_collection_subset_check_neg_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.removal_genls_collection_subset_construct_query(asent);
                SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == recursive_results) {
                    {
                        SubLObject query_support = arguments.make_hl_support($QUERY, list($$unknownSentence, query), UNPROVIDED, UNPROVIDED);
                        backward.removal_add_node(query_support, NIL, NIL);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_genls_collection_subset_check_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = removal_genls_collection_subset_construct_query(asent);
        final SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings(query, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == recursive_results) {
            final SubLObject query_support = arguments.make_hl_support($QUERY, list($$unknownSentence, query), UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(query_support, NIL, NIL);
        }
        return NIL;
    }

    public static final SubLObject removal_genls_collection_subset_construct_query_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_genls = unmake_binary_formula(asent);
                SubLObject colsub_nat1 = thread.secondMultipleValue();
                SubLObject colsub_nat2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject colsub_func1 = unmake_binary_formula(colsub_nat1);
                    SubLObject col1 = thread.secondMultipleValue();
                    SubLObject set1 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject colsub_func2 = unmake_binary_formula(colsub_nat2);
                        SubLObject col2 = thread.secondMultipleValue();
                        SubLObject set2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return list($$and, list($$genls, col1, col2), list($$subsetOf, set1, set2));
                    }
                }
            }
        }
    }

    public static SubLObject removal_genls_collection_subset_construct_query(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_genls = unmake_binary_formula(asent);
        final SubLObject colsub_nat1 = thread.secondMultipleValue();
        final SubLObject colsub_nat2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject colsub_func1 = unmake_binary_formula(colsub_nat1);
        final SubLObject col1 = thread.secondMultipleValue();
        final SubLObject set1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject colsub_func2 = unmake_binary_formula(colsub_nat2);
        final SubLObject col2 = thread.secondMultipleValue();
        final SubLObject set2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return list($$and, list($$genls, col1, col2), list($$subsetOf, set1, set2));
    }

    public static final SubLObject removal_genls_down_arg2_bound_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != variables.fully_bound_p(asent)) {
                return ONE_INTEGER;
            }
            thread.resetMultipleValues();
            {
                SubLObject genls_asent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.destructure_genls_down_asent(asent);
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return inference_utilities.literal_removal_cost(genls_asent, $POS, mt, UNPROVIDED);
            }
        }
    }

    public static SubLObject removal_genls_down_arg2_bound_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(asent)) {
            return ONE_INTEGER;
        }
        thread.resetMultipleValues();
        final SubLObject genls_asent = destructure_genls_down_asent(asent);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_utilities.literal_removal_cost(genls_asent, $POS, mt, UNPROVIDED);
    }

    public static final SubLObject removal_genls_down_arg2_bound_completeness_alt(SubLObject asent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != variables.fully_bound_p(asent)) {
                return $COMPLETE;
            }
            thread.resetMultipleValues();
            {
                SubLObject genls_asent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.destructure_genls_down_asent(asent);
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return inference_utilities.literal_removal_completeness(genls_asent, $POS, mt);
            }
        }
    }

    public static SubLObject removal_genls_down_arg2_bound_completeness(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != variables.fully_bound_p(asent)) {
            return $COMPLETE;
        }
        thread.resetMultipleValues();
        final SubLObject genls_asent = destructure_genls_down_asent(asent);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_utilities.literal_removal_completeness(genls_asent, $POS, mt);
    }

    public static final SubLObject removal_genls_down_arg2_bound_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject genls_asent = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genls.destructure_genls_down_asent(asent);
                SubLObject mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject bindings_list = ask_utilities.inference_recursive_query_unique_bindings(genls_asent, mt, UNPROVIDED);
                    SubLObject cdolist_list_var = bindings_list;
                    SubLObject v_bindings = NIL;
                    for (v_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_bindings = cdolist_list_var.first()) {
                        {
                            SubLObject support_asent = bindings.apply_bindings(v_bindings, genls_asent);
                            SubLObject support = arguments.make_hl_support($QUERY, support_asent, mt, $TRUE_DEF);
                            backward.removal_add_node(support, v_bindings, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_genls_down_arg2_bound_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject genls_asent = destructure_genls_down_asent(asent);
        final SubLObject mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var;
        final SubLObject bindings_list = cdolist_list_var = ask_utilities.inference_recursive_query_unique_bindings(genls_asent, mt, UNPROVIDED);
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject support_asent = bindings.apply_bindings(v_bindings, genls_asent);
            final SubLObject support = arguments.make_hl_support($QUERY, support_asent, mt, $TRUE_DEF);
            backward.removal_add_node(support, v_bindings, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject destructure_genls_down_asent_alt(SubLObject asent) {
        {
            SubLObject datum = asent;
            SubLObject current = datum;
            SubLObject genls_down = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            genls_down = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt53);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt53);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return values(make_binary_formula($$genls, arg1, arg2), mt_relevance_macros.current_mt_relevance_mt());
            } else {
                cdestructuring_bind_error(datum, $list_alt53);
            }
        }
        return NIL;
    }

    public static SubLObject destructure_genls_down_asent(final SubLObject asent) {
        SubLObject genls_down = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(asent, asent, $list53);
        genls_down = asent.first();
        SubLObject current = asent.rest();
        destructuring_bind_must_consp(current, asent, $list53);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, asent, $list53);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return values(make_binary_formula($$genls, arg1, arg2), mt_relevance_macros.current_mt_relevance_mt());
        }
        cdestructuring_bind_error(asent, $list53);
        return NIL;
    }

    private static final SubLSymbol $GENLS_X_Y_POS = makeKeyword("GENLS-X-Y-POS");

    static private final SubLList $list_alt3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), $FORT), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    public static SubLObject declare_removal_modules_genls_file() {
        declareFunction("inference_genlP", "INFERENCE-GENL?", 2, 2, false);
        declareFunction("inference_not_genlP", "INFERENCE-NOT-GENL?", 2, 2, false);
        declareFunction("inference_all_genls", "INFERENCE-ALL-GENLS", 1, 2, false);
        declareFunction("inference_all_specs", "INFERENCE-ALL-SPECS", 1, 2, false);
        declareFunction("inference_genls_between", "INFERENCE-GENLS-BETWEEN", 2, 1, false);
        declareFunction("removal_superset_expand", "REMOVAL-SUPERSET-EXPAND", 1, 1, false);
        new removal_modules_genls.$removal_superset_expand$UnaryFunction();
        new removal_modules_genls.$removal_superset_expand$BinaryFunction();
        declareFunction("removal_nat_genls_expand", "REMOVAL-NAT-GENLS-EXPAND", 1, 1, false);
        declareFunction("removal_all_genls_cost", "REMOVAL-ALL-GENLS-COST", 1, 1, false);
        declareFunction("removal_all_genls_expand", "REMOVAL-ALL-GENLS-EXPAND", 1, 1, false);
        declareFunction("removal_nat_all_genls_expand", "REMOVAL-NAT-ALL-GENLS-EXPAND", 1, 1, false);
        declareFunction("removal_all_specs_cost", "REMOVAL-ALL-SPECS-COST", 1, 1, false);
        declareFunction("removal_all_specs_iterator", "REMOVAL-ALL-SPECS-ITERATOR", 1, 0, false);
        declareFunction("removal_not_superset_expand", "REMOVAL-NOT-SUPERSET-EXPAND", 1, 1, false);
        declareFunction("removal_genls_between_applicability", "REMOVAL-GENLS-BETWEEN-APPLICABILITY", 1, 0, false);
        new removal_modules_genls.$removal_genls_between_applicability$UnaryFunction();
        declareFunction("removal_genls_between_cost", "REMOVAL-GENLS-BETWEEN-COST", 1, 0, false);
        declareFunction("removal_genls_between_completeness", "REMOVAL-GENLS-BETWEEN-COMPLETENESS", 0, 0, false);
        declareFunction("removal_genls_between_expand", "REMOVAL-GENLS-BETWEEN-EXPAND", 1, 0, false);
        declareFunction("removal_sbhl_between_applicability", "REMOVAL-SBHL-BETWEEN-APPLICABILITY", 2, 0, false);
        declareFunction("find_pos_pred_indices_for_pred_between", "FIND-POS-PRED-INDICES-FOR-PRED-BETWEEN", 2, 0, false);
        declareFunction("removal_genls_between_categorize_asents", "REMOVAL-GENLS-BETWEEN-CATEGORIZE-ASENTS", 2, 0, false);
        declareFunction("removal_genls_collection_subset_check_pos_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction("removal_genls_collection_subset_check_neg_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND", 1, 1, false);
        declareFunction("removal_genls_collection_subset_construct_query", "REMOVAL-GENLS-COLLECTION-SUBSET-CONSTRUCT-QUERY", 1, 0, false);
        declareFunction("removal_genls_down_arg2_bound_cost", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COST", 1, 1, false);
        declareFunction("removal_genls_down_arg2_bound_completeness", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS", 1, 0, false);
        declareFunction("removal_genls_down_arg2_bound_expand", "REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND", 1, 1, false);
        declareFunction("destructure_genls_down_asent", "DESTRUCTURE-GENLS-DOWN-ASENT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), $FORT))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    static private final SubLList $list_alt9 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    static private final SubLList $list_alt12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), $FORT, makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog #$Animal)") });

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) #$Animal)") });

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), $FORT, makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-ALL-GENLS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog ?WHAT)") });

    public static SubLObject init_removal_modules_genls_file() {
        defparameter("*DEFAULT-SUPERSET-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NAT-ALL-GENLS-COST*", $average_all_genls_count$.getDynamicValue());
        defparameter("*ALL-SPECS-LAZY-ITERATION-THRESHOLD*", $int$550);
        defparameter("*DEFAULT-NOT-SUPERSET-COST*", ONE_INTEGER);
        return NIL;
    }

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NAT-ALL-GENLS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <not fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) ?WHAT)") });

    public static final SubLObject setup_removal_modules_genls_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$genls);
        inference_modules.inference_removal_module_use_generic($$genls, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.inference_preference_module($GENLS_X_Y_POS, $list_alt3);
        preference_modules.inference_preference_module($ALL_SPECS_OF_FORT_POS, $list_alt5);
        preference_modules.inference_preference_module($ALL_SPECS_OF_NON_FORT_POS, $list_alt7);
        preference_modules.inference_preference_module($ALL_GENLS_POS, $list_alt9);
        inference_modules.inference_removal_module($REMOVAL_SUPERSET, $list_alt12);
        inference_modules.inference_removal_module($REMOVAL_NAT_GENLS, $list_alt14);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENLS, $list_alt16);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_GENLS, $list_alt18);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPECS, $list_alt21);
        inference_modules.inference_removal_module($REMOVAL_NOT_SUPERSET, $list_alt24);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_GENLS_BETWEEN, $list_alt26);
        note_funcall_helper_function(REMOVAL_GENLS_BETWEEN_COMPLETENESS);
        inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, $list_alt38);
        inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, $list_alt40);
        inference_modules.register_solely_specific_removal_module_predicate($$genlsDown);
        inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_BOUND, $list_alt47);
        note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_COST);
        note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS);
        note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_UNIFY, $list_alt55);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genls_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$genls);
            inference_modules.inference_removal_module_use_generic($$genls, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$genls);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$genls);
            preference_modules.inference_preference_module($ALL_SPECS_OF_FORT_POS, $list5);
            preference_modules.inference_preference_module($ALL_SPECS_OF_NON_FORT_POS, $list7);
            preference_modules.inference_preference_module($ALL_GENLS_POS, $list9);
            inference_modules.inference_removal_module($REMOVAL_SUPERSET, $list13);
            inference_modules.inference_removal_module($REMOVAL_NAT_GENLS, $list15);
            inference_modules.inference_removal_module($REMOVAL_ALL_GENLS, $list17);
            inference_modules.inference_removal_module($REMOVAL_NAT_ALL_GENLS, $list19);
            inference_modules.inference_removal_module($REMOVAL_ALL_SPECS, $list22);
            inference_modules.inference_removal_module($REMOVAL_NOT_SUPERSET, $list25);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_GENLS_BETWEEN, $list27);
            note_funcall_helper_function(REMOVAL_GENLS_BETWEEN_COMPLETENESS);
            inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, $list39);
            inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, $list41);
            inference_modules.register_solely_specific_removal_module_predicate($$genlsDown);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$genlsDown);
            inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_BOUND, $list48);
            note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_COST);
            note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS);
            note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND);
            inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_UNIFY, $list55);
        }
        if (SubLFiles.USE_V2) {
            preference_modules.inference_preference_module($GENLS_X_Y_POS, $list_alt3);
            inference_modules.inference_removal_module($REMOVAL_SUPERSET, $list_alt12);
            inference_modules.inference_removal_module($REMOVAL_NAT_GENLS, $list_alt14);
            inference_modules.inference_removal_module($REMOVAL_ALL_GENLS, $list_alt16);
            inference_modules.inference_removal_module($REMOVAL_NAT_ALL_GENLS, $list_alt18);
            inference_modules.inference_removal_module($REMOVAL_ALL_SPECS, $list_alt21);
            inference_modules.inference_removal_module($REMOVAL_NOT_SUPERSET, $list_alt24);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_GENLS_BETWEEN, $list_alt26);
            inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, $list_alt38);
            inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, $list_alt40);
            inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_BOUND, $list_alt47);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_genls_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$genls);
        inference_modules.inference_removal_module_use_generic($$genls, $REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$genls);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$genls);
        preference_modules.inference_preference_module($ALL_SPECS_OF_FORT_POS, $list5);
        preference_modules.inference_preference_module($ALL_SPECS_OF_NON_FORT_POS, $list7);
        preference_modules.inference_preference_module($ALL_GENLS_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_SUPERSET, $list13);
        inference_modules.inference_removal_module($REMOVAL_NAT_GENLS, $list15);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENLS, $list17);
        inference_modules.inference_removal_module($REMOVAL_NAT_ALL_GENLS, $list19);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPECS, $list22);
        inference_modules.inference_removal_module($REMOVAL_NOT_SUPERSET, $list25);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_GENLS_BETWEEN, $list27);
        note_funcall_helper_function(REMOVAL_GENLS_BETWEEN_COMPLETENESS);
        inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, $list39);
        inference_modules.inference_removal_module($REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, $list41);
        inference_modules.register_solely_specific_removal_module_predicate($$genlsDown);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$genlsDown);
        inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_BOUND, $list48);
        note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_COST);
        note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS);
        note_funcall_helper_function(REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_GENLS_DOWN_ARG2_UNIFY, $list55);
        return NIL;
    }

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("NOT-FULLY-BOUND"), $FORT), $COST, makeSymbol("REMOVAL-ALL-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genls"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genls"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls ?WHAT #$Animal)") });

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("OR"), $FORT, cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("FIF"), makeSymbol("*NEGATION-BY-FAILURE*"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeSymbol("*DEFAULT-NOT-SUPERSET-COST*")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <fort> <fully-bound>))\n    (#$not (#$genls (<fully-bound> . <fully-bound>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$Collection #$Individual))\n    (#$not (#$genls (#$JuvenileFn #$Cougar) #$Individual))") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_genls_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genls_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genls_file();
    }

    static {
    }

    public static final class $removal_superset_expand$UnaryFunction extends UnaryFunction {
        public $removal_superset_expand$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-SUPERSET-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_superset_expand(arg1, removal_modules_genls.$removal_superset_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_superset_expand$BinaryFunction extends BinaryFunction {
        public $removal_superset_expand$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-SUPERSET-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_superset_expand(arg1, arg2);
        }
    }

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell("genls")), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-GENLS-BETWEEN-APPLICABILITY"), $COST, makeSymbol("REMOVAL-GENLS-BETWEEN-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$genls <fort1> <varN>)\n           (#$genls <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$genls #$Dog ?COL)\n           (#$genls ?COL #$Animal))") });

    public static final class $removal_genls_between_applicability$UnaryFunction extends UnaryFunction {
        public $removal_genls_between_applicability$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-GENLS-BETWEEN-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_genls_between_applicability(arg1);
        }
    }

    static private final SubLList $list_alt28 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLList $list_alt33 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));

    static private final SubLList $list_alt34 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    static private final SubLList $list_alt35 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));

    static private final SubLList $list_alt36 = list(makeSymbol("INDEX"), makeSymbol("VARIABLE"));

    static private final SubLList $list_alt38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>))") });

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genls"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genls"), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(reader_make_constant_shell("CollectionSubsetFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>)))") });

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlsDown"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlsDown"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <fully-bound>)\n(#$genlsDown <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog #$Animal)\n(#$genlsDown ?WHAT #$Dog)") });

    static private final SubLList $list_alt53 = list(makeSymbol("GENLS-DOWN"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlsDown"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlsDown"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlsDown"), list($BIND, makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(list(reader_make_constant_shell("genlsDown"), makeKeyword("INPUT"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog ?WHAT)") });
}

/**
 * Total time: 218 ms
 */
