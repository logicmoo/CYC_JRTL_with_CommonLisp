/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.arguments.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-GENLMT
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-genlmt.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_genlmt extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_genlmt();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_genlmt_check_cost$ = makeSymbol("*DEFAULT-GENLMT-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_genlmt_check_cost$ = makeSymbol("*DEFAULT-NOT-GENLMT-CHECK-COST*");



    private static final SubLList $list3 = list(reader_make_constant_shell("EverythingPSC"), reader_make_constant_shell("InferencePSC"));

    private static final SubLList $list5 = list(makeSymbol("SPEC-MT"), makeSymbol("GENL-MT"));

    private static final SubLSymbol $REMOVAL_GENLMT_CHECK = makeKeyword("REMOVAL-GENLMT-CHECK");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("CLOSED-HLMT"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLMT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLMT-CHECK-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt #$CrossLinguisticLexicalMt)") });

    private static final SubLSymbol $REMOVAL_ALL_GENLMT = makeKeyword("REMOVAL-ALL-GENLMT");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("CLOSED-HLMT"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-ALL-GENLMT-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlMt"), list($BIND, makeSymbol("SPEC-HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-GENLMT-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlMt"), list(makeKeyword("VALUE"), makeSymbol("SPEC-HLMT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <closed-hlmt> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt ?GENL-MT)") });

    private static final SubLSymbol $REMOVAL_ALL_SPEC_MTS = makeKeyword("REMOVAL-ALL-SPEC-MTS");

    static private final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("CLOSED-HLMT")), $COST, makeSymbol("REMOVAL-ALL-SPEC-MTS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlMt"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("GENL-MT"))), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPEC-MTS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <not-fully-bound> <closed-hlmt>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt ?SPEC-MT #$GermanLexicalMt)") });

    private static final SubLSymbol $REMOVAL_NOT_GENLMT_CHECK = makeKeyword("REMOVAL-NOT-GENLMT-CHECK");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("CLOSED-HLMT"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLMT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLMT-CHECK-EXPAND") });

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

    public static final SubLObject removal_genlmt_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject spec_mt = NIL;
            SubLObject genl_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt1);
            spec_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt1);
            genl_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt.inference_genl_mtP(spec_mt, genl_mt)) {
                    backward.removal_add_node(make_hl_support($GENLMT, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt1);
            }
        }
        return NIL;
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

    public static final SubLObject inference_genl_mtP_alt(SubLObject spec_mt, SubLObject genl_mt) {
        return makeBoolean(((NIL != hlmt.hlmtP(spec_mt)) && (NIL != hlmt.hlmtP(genl_mt))) && (NIL != genl_mts.genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject inference_genl_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        return makeBoolean(((NIL != hlmt.hlmtP(spec_mt)) && (NIL != hlmt.hlmtP(genl_mt))) && (NIL != genl_mts.genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject removal_all_genlmt_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_genlmt_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static final SubLObject removal_all_genlmt_iterator_alt(SubLObject spec_hlmt) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt.inference_all_genl_mts(spec_hlmt));
    }

    public static SubLObject removal_all_genlmt_iterator(final SubLObject spec_hlmt) {
        return iteration.new_list_iterator(inference_all_genl_mts(spec_hlmt));
    }

    static private final SubLList $list_alt1 = list(makeSymbol("SPEC-MT"), makeSymbol("GENL-MT"));

    public static final SubLObject inference_all_genl_mts_alt(SubLObject mt) {
        if (NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_all_genl_mts(final SubLObject mt) {
        if (NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("CLOSED-HLMT"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLMT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLMT-CHECK-EXPAND"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt #$CrossLinguisticLexicalMt)") });

    public static final SubLObject removal_all_spec_mts_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_spec_mts_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject removal_all_spec_mts_iterator_alt(SubLObject genl_mt) {
        return iteration.new_list_iterator(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt.inference_all_spec_mts(genl_mt));
    }

    public static SubLObject removal_all_spec_mts_iterator(final SubLObject genl_mt) {
        return iteration.new_list_iterator(inference_all_spec_mts(genl_mt));
    }

    public static final SubLObject inference_all_spec_mts_alt(SubLObject mt) {
        if (NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_spec_mts(mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_all_spec_mts(final SubLObject mt) {
        if (NIL != hlmt.hlmtP(mt)) {
            return genl_mts.all_spec_mts(mt, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("CLOSED-HLMT"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-ALL-GENLMT-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlMt"), list($BIND, makeSymbol("SPEC-HLMT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-HLMT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-GENLMT-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlMt"), list(makeKeyword("VALUE"), makeSymbol("SPEC-HLMT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <closed-hlmt> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$GermanLexicalMt ?GENL-MT)") });

    public static final SubLObject removal_not_genlmt_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject spec_mt = NIL;
                SubLObject genl_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt1);
                spec_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt1);
                genl_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt.inference_genl_mtP(spec_mt, genl_mt))) {
                        backward.removal_add_node(make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlmt.inference_not_genl_mtP(spec_mt, genl_mt)) {
                            backward.removal_add_node(make_hl_support($GENLMT, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt1);
                }
            }
            return NIL;
        }
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

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("CLOSED-HLMT")), $COST, makeSymbol("REMOVAL-ALL-SPEC-MTS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlMt"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("GENL-MT"))), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPEC-MTS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-MT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLMT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <not-fully-bound> <closed-hlmt>)"), makeKeyword("EXAMPLE"), makeString("(#$genlMt ?SPEC-MT #$GermanLexicalMt)") });

    public static final SubLObject inference_not_genl_mtP_alt(SubLObject spec_mt, SubLObject genl_mt) {
        return makeBoolean(((NIL != hlmt.hlmtP(spec_mt)) && (NIL != hlmt.hlmtP(genl_mt))) && (NIL != genl_mts.not_genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject inference_not_genl_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        return makeBoolean(((NIL != hlmt.hlmtP(spec_mt)) && (NIL != hlmt.hlmtP(genl_mt))) && (NIL != genl_mts.not_genl_mtP(spec_mt, genl_mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject declare_removal_modules_genlmt_file() {
        declareFunction("possibly_make_query_mt_support", "POSSIBLY-MAKE-QUERY-MT-SUPPORT", 2, 0, false);
        declareFunction("make_genl_mt_support", "MAKE-GENL-MT-SUPPORT", 2, 0, false);
        declareFunction("removal_genlmt_check_expand", "REMOVAL-GENLMT-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_genl_mtP", "INFERENCE-GENL-MT?", 2, 0, false);
        declareFunction("removal_all_genlmt_cost", "REMOVAL-ALL-GENLMT-COST", 1, 1, false);
        declareFunction("removal_all_genlmt_iterator", "REMOVAL-ALL-GENLMT-ITERATOR", 1, 0, false);
        declareFunction("inference_all_genl_mts", "INFERENCE-ALL-GENL-MTS", 1, 0, false);
        declareFunction("removal_all_spec_mts_cost", "REMOVAL-ALL-SPEC-MTS-COST", 1, 1, false);
        declareFunction("removal_all_spec_mts_iterator", "REMOVAL-ALL-SPEC-MTS-ITERATOR", 1, 0, false);
        declareFunction("inference_all_spec_mts", "INFERENCE-ALL-SPEC-MTS", 1, 0, false);
        declareFunction("removal_not_genlmt_check_expand", "REMOVAL-NOT-GENLMT-CHECK-EXPAND", 1, 1, false);
        declareFunction("inference_not_genl_mtP", "INFERENCE-NOT-GENL-MT?", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlMt"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlMt"), makeKeyword("CLOSED-HLMT"), makeKeyword("CLOSED-HLMT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLMT-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLMT-CHECK-EXPAND") });

    public static SubLObject init_removal_modules_genlmt_file() {
        defparameter("*DEFAULT-GENLMT-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-GENLMT-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_genlmt_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$genlMt);
        inference_modules.inference_removal_module($REMOVAL_GENLMT_CHECK, $list_alt4);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENLMT, $list_alt6);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_MTS, $list_alt8);
        inference_modules.inference_removal_module($REMOVAL_NOT_GENLMT_CHECK, $list_alt11);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlmt_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$genlMt);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$genlMt);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$genlMt);
            inference_modules.inference_removal_module($REMOVAL_GENLMT_CHECK, $list7);
            inference_modules.inference_removal_module($REMOVAL_ALL_GENLMT, $list9);
            inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_MTS, $list11);
            inference_modules.inference_removal_module($REMOVAL_NOT_GENLMT_CHECK, $list14);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_GENLMT_CHECK, $list_alt4);
            inference_modules.inference_removal_module($REMOVAL_ALL_GENLMT, $list_alt6);
            inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_MTS, $list_alt8);
            inference_modules.inference_removal_module($REMOVAL_NOT_GENLMT_CHECK, $list_alt11);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlmt_file_Previous() {
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
