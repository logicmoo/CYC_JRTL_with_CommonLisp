package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_genlmt extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_genlmt();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt";

    public static final String myFingerPrint = "52c3b1afae129193be9aa85bd3cf1ef3f9f74ca81b8d6867c9e1a1fcbc2e40e1";

    // defparameter
    // Definitions
    private static final SubLSymbol $default_genlmt_check_cost$ = makeSymbol("*DEFAULT-GENLMT-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_not_genlmt_check_cost$ = makeSymbol("*DEFAULT-NOT-GENLMT-CHECK-COST*");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));





    private static final SubLList $list3 = list(reader_make_constant_shell(makeString("EverythingPSC")), reader_make_constant_shell(makeString("InferencePSC")));



    private static final SubLList $list5 = list(makeSymbol("SPEC-MT"), makeSymbol("GENL-MT"));

    private static final SubLSymbol $REMOVAL_GENLMT_CHECK = makeKeyword("REMOVAL-GENLMT-CHECK");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genlMt")), makeKeyword("CLOSED-HLMT"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLMT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLMT-CHECK-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt #$CrossLinguisticLexicalMt)") });

    private static final SubLSymbol $REMOVAL_ALL_GENLMT = makeKeyword("REMOVAL-ALL-GENLMT");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genlMt")), makeKeyword("CLOSED-HLMT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-GENLMT-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("genlMt")), list(makeKeyword("BIND"), makeSymbol("SPEC-HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-GENLMT-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("genlMt")), list(makeKeyword("VALUE"), makeSymbol("SPEC-HLMT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <closed-hlmt> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt ?GENL-MT)") });

    private static final SubLSymbol $REMOVAL_ALL_SPEC_MTS = makeKeyword("REMOVAL-ALL-SPEC-MTS");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genlMt")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-SPEC-MTS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("genlMt")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL-MT"))), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-SPEC-MTS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("genlMt")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <not-fully-bound> <closed-hlmt>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt ?SPEC-MT #$GermanLexicalMt)") });



    private static final SubLSymbol $REMOVAL_NOT_GENLMT_CHECK = makeKeyword("REMOVAL-NOT-GENLMT-CHECK");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("genlMt")), makeKeyword("CLOSED-HLMT"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLMT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLMT-CHECK-EXPAND") });

    public static SubLObject possibly_make_query_mt_support(final SubLObject query_mt, final SubLObject support_mt) {
        if (((NIL != query_mt) && (NIL == subl_promotions.memberP(query_mt, $list3, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(support_mt, $list3, UNPROVIDED, UNPROVIDED))) {
            final SubLObject genl_mt_support = make_genl_mt_support(query_mt, support_mt);
            return genl_mt_support;
        }
        return NIL;
    }

    public static SubLObject make_genl_mt_support(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLObject sentence = make_binary_formula($$genlMt, spec_mt, genl_mt);
        return arguments.make_hl_support($GENLMT, sentence, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject removal_genlmt_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_mt = NIL;
        SubLObject genl_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        spec_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        genl_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != inference_genl_mtP(spec_mt, genl_mt)) {
                backward.removal_add_node(arguments.make_hl_support($GENLMT, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list5);
        }
        return NIL;
    }

    public static SubLObject inference_genl_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        return makeBoolean(((NIL != hlmt.hlmtP(spec_mt)) && (NIL != hlmt.hlmtP(genl_mt))) && (NIL != genl_mts.genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject removal_all_genlmt_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_genlmt_iterator(final SubLObject spec_hlmt) {
        return iteration.new_list_iterator(inference_all_genl_mts(spec_hlmt));
    }

    public static SubLObject inference_all_genl_mts(final SubLObject mt) {
        if (NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_all_spec_mts_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_spec_mts_iterator(final SubLObject genl_mt) {
        return iteration.new_list_iterator(inference_all_spec_mts(genl_mt));
    }

    public static SubLObject inference_all_spec_mts(final SubLObject mt) {
        if (NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_spec_mts(mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_not_genlmt_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_mt = NIL;
        SubLObject genl_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        spec_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        genl_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == inference_genl_mtP(spec_mt, genl_mt))) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != inference_not_genl_mtP(spec_mt, genl_mt)) {
                    backward.removal_add_node(arguments.make_hl_support($GENLMT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list5);
        }
        return NIL;
    }

    public static SubLObject inference_not_genl_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        return makeBoolean(((NIL != hlmt.hlmtP(spec_mt)) && (NIL != hlmt.hlmtP(genl_mt))) && (NIL != genl_mts.not_genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject declare_removal_modules_genlmt_file() {
        declareFunction(me, "possibly_make_query_mt_support", "POSSIBLY-MAKE-QUERY-MT-SUPPORT", 2, 0, false);
        declareFunction(me, "make_genl_mt_support", "MAKE-GENL-MT-SUPPORT", 2, 0, false);
        declareFunction(me, "removal_genlmt_check_expand", "REMOVAL-GENLMT-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "inference_genl_mtP", "INFERENCE-GENL-MT?", 2, 0, false);
        declareFunction(me, "removal_all_genlmt_cost", "REMOVAL-ALL-GENLMT-COST", 1, 1, false);
        declareFunction(me, "removal_all_genlmt_iterator", "REMOVAL-ALL-GENLMT-ITERATOR", 1, 0, false);
        declareFunction(me, "inference_all_genl_mts", "INFERENCE-ALL-GENL-MTS", 1, 0, false);
        declareFunction(me, "removal_all_spec_mts_cost", "REMOVAL-ALL-SPEC-MTS-COST", 1, 1, false);
        declareFunction(me, "removal_all_spec_mts_iterator", "REMOVAL-ALL-SPEC-MTS-ITERATOR", 1, 0, false);
        declareFunction(me, "inference_all_spec_mts", "INFERENCE-ALL-SPEC-MTS", 1, 0, false);
        declareFunction(me, "removal_not_genlmt_check_expand", "REMOVAL-NOT-GENLMT-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "inference_not_genl_mtP", "INFERENCE-NOT-GENL-MT?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_genlmt_file() {
        defparameter("*DEFAULT-GENLMT-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-GENLMT-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlmt_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$genlMt);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$genlMt);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$genlMt);
        inference_modules.inference_removal_module($REMOVAL_GENLMT_CHECK, $list7);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENLMT, $list9);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_MTS, $list11);
        inference_modules.inference_removal_module($REMOVAL_NOT_GENLMT_CHECK, $list14);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_genlmt_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genlmt_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genlmt_file();
    }

    static {


















    }
}

/**
 * Total time: 94 ms
 */
