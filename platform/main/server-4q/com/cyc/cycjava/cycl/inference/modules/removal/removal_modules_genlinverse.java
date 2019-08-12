/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_genlinverse extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_genlinverse();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_genlinverse_check_cost$ = makeSymbol("*DEFAULT-GENLINVERSE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_genlinverse_check_cost$ = makeSymbol("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));

    private static final SubLSymbol $REMOVAL_GENLINVERSE_CHECK = makeKeyword("REMOVAL-GENLINVERSE-CHECK");

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLINVERSE-CHECK-EXPAND") });

    private static final SubLSymbol $REMOVAL_ALL_GENL_INVERSES = makeKeyword("REMOVAL-ALL-GENL-INVERSES");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ALL-GENL-INVERSES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlInverse"), list($BIND, makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-GENL-INVERSES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlInverse"), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlInverse <predicate-fort> <variable>"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse #$geographicalSubRegions ?WHAT)") });

    private static final SubLSymbol $REMOVAL_ALL_SPEC_INVERSES = makeKeyword("REMOVAL-ALL-SPEC-INVERSES");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), $COST, makeSymbol("REMOVAL-ALL-SPEC-INVERSES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlInverse"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPEC-INVERSES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlInverse <variable> <predicate-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse ?WHAT #$inRegion)") });

    private static final SubLSymbol $REMOVAL_NOT_GENLINVERSE_CHECK = makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND") });



    public static final SubLObject removal_genlinverse_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject current = datum;
            SubLObject spec_pred = NIL;
            SubLObject genl_pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            spec_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            genl_pred = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != genl_predicates.genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($GENLPREDS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static SubLObject removal_genlinverse_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_pred = NIL;
        SubLObject genl_pred = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        spec_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        genl_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != genl_predicates.genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLPREDS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    public static final SubLObject removal_all_genl_inverses_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_genl_inverses_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static final SubLObject removal_all_genl_inverses_iterator_alt(SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_inverses(spec_pred, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_all_genl_inverses_iterator(final SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_inverses(spec_pred, UNPROVIDED, UNPROVIDED));
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));

    public static final SubLObject removal_all_spec_inverses_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_spec_inverses_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLINVERSE-CHECK-EXPAND") });

    public static final SubLObject removal_all_spec_inverses_iterator_alt(SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_inverses(genl_pred, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_all_spec_inverses_iterator(final SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_inverses(genl_pred, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject removal_not_genlinverse_check_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                SubLObject current = datum;
                SubLObject spec_pred = NIL;
                SubLObject genl_pred = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                spec_pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                genl_pred = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == genl_predicates.genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED))) {
                        backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } else {
                        if (NIL != genl_predicates.not_genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                            backward.removal_add_node(arguments.make_hl_support($GENLPREDS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt0);
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_not_genlinverse_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_pred = NIL;
        SubLObject genl_pred = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        spec_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        genl_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == genl_predicates.genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != genl_predicates.not_genl_inverseP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($GENLPREDS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ALL-GENL-INVERSES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlInverse"), list($BIND, makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-GENL-INVERSES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlInverse"), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlInverse <predicate-fort> <variable>"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse #$geographicalSubRegions ?WHAT)") });

    public static SubLObject declare_removal_modules_genlinverse_file() {
        declareFunction("removal_genlinverse_check_expand", "REMOVAL-GENLINVERSE-CHECK-EXPAND", 1, 1, false);
        declareFunction("removal_all_genl_inverses_cost", "REMOVAL-ALL-GENL-INVERSES-COST", 1, 1, false);
        declareFunction("removal_all_genl_inverses_iterator", "REMOVAL-ALL-GENL-INVERSES-ITERATOR", 1, 0, false);
        declareFunction("removal_all_spec_inverses_cost", "REMOVAL-ALL-SPEC-INVERSES-COST", 1, 1, false);
        declareFunction("removal_all_spec_inverses_iterator", "REMOVAL-ALL-SPEC-INVERSES-ITERATOR", 1, 0, false);
        declareFunction("removal_not_genlinverse_check_expand", "REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), $COST, makeSymbol("REMOVAL-ALL-SPEC-INVERSES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlInverse"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPEC-INVERSES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlInverse <variable> <predicate-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genlInverse ?WHAT #$inRegion)") });

    public static SubLObject init_removal_modules_genlinverse_file() {
        defparameter("*DEFAULT-GENLINVERSE-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlinverse_file() {
        inference_modules.inference_removal_module($REMOVAL_GENLINVERSE_CHECK, $list3);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENL_INVERSES, $list5);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_INVERSES, $list7);
        inference_modules.inference_removal_module($REMOVAL_NOT_GENLINVERSE_CHECK, $list10);
        inference_modules.register_solely_specific_removal_module_predicate($$genlInverse);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$genlInverse);
        return NIL;
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlInverse"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlInverse"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLINVERSE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_genlinverse_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genlinverse_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genlinverse_file();
    }

    static {
    }
}

/**
 * Total time: 86 ms
 */
