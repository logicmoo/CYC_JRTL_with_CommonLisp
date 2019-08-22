/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_genlpreds extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_genlpreds();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_genlpreds_check_cost$ = makeSymbol("*DEFAULT-GENLPREDS-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_not_genlpreds_check_cost$ = makeSymbol("*DEFAULT-NOT-GENLPREDS-CHECK-COST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));

    private static final SubLSymbol $REMOVAL_GENLPREDS_CHECK = makeKeyword("REMOVAL-GENLPREDS-CHECK");

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLPREDS-CHECK-EXPAND") });

    private static final SubLSymbol $REMOVAL_ALL_GENLPREDS = makeKeyword("REMOVAL-ALL-GENLPREDS");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ALL-GENLPREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlPreds"), list($BIND, makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-GENLPREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlPreds"), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <predicate-fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds #$performedBy ?WHAT)") });

    private static final SubLSymbol $REMOVAL_ALL_SPEC_PREDS = makeKeyword("REMOVAL-ALL-SPEC-PREDS");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), $COST, makeSymbol("REMOVAL-ALL-SPEC-PREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlPreds"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPEC-PREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <variable> <predicate-fort>"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds ?WHAT #$performedBy)") });

    private static final SubLSymbol $REMOVAL_NOT_GENLPREDS_CHECK = makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLPREDS-CHECK-EXPAND") });



    public static final SubLObject removal_genlpreds_check_expand_alt(SubLObject asent, SubLObject sense) {
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
                if (NIL != genl_predicates.genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($GENLPREDS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static SubLObject removal_genlpreds_check_expand(final SubLObject asent, SubLObject sense) {
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
            if (NIL != genl_predicates.genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLPREDS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    public static final SubLObject removal_all_genlpreds_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_genlpreds_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    public static final SubLObject removal_all_genlpreds_iterator_alt(SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_preds(spec_pred, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_all_genlpreds_iterator(final SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_preds(spec_pred, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject removal_all_spec_preds_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static SubLObject removal_all_spec_preds_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    public static final SubLObject removal_all_spec_preds_iterator_alt(SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_preds(genl_pred, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_all_spec_preds_iterator(final SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_preds(genl_pred, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject removal_not_genlpreds_check_expand_alt(SubLObject asent, SubLObject sense) {
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
                    if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == genl_predicates.genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED))) {
                        backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } else {
                        if (NIL != genl_predicates.not_genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
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

    public static SubLObject removal_not_genlpreds_check_expand(final SubLObject asent, SubLObject sense) {
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
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == genl_predicates.genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != genl_predicates.not_genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                    backward.removal_add_node(arguments.make_hl_support($GENLPREDS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLPREDS-CHECK-EXPAND") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), $COST, makeSymbol("REMOVAL-ALL-GENLPREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlPreds"), list($BIND, makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-GENLPREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlPreds"), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <predicate-fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds #$performedBy ?WHAT)") });

    public static SubLObject declare_removal_modules_genlpreds_file() {
        declareFunction("removal_genlpreds_check_expand", "REMOVAL-GENLPREDS-CHECK-EXPAND", 1, 1, false);
        new removal_modules_genlpreds.$removal_genlpreds_check_expand$UnaryFunction();
        new removal_modules_genlpreds.$removal_genlpreds_check_expand$BinaryFunction();
        declareFunction("removal_all_genlpreds_cost", "REMOVAL-ALL-GENLPREDS-COST", 1, 1, false);
        declareFunction("removal_all_genlpreds_iterator", "REMOVAL-ALL-GENLPREDS-ITERATOR", 1, 0, false);
        declareFunction("removal_all_spec_preds_cost", "REMOVAL-ALL-SPEC-PREDS-COST", 1, 1, false);
        declareFunction("removal_all_spec_preds_iterator", "REMOVAL-ALL-SPEC-PREDS-ITERATOR", 1, 0, false);
        declareFunction("removal_not_genlpreds_check_expand", "REMOVAL-NOT-GENLPREDS-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_genlpreds_file() {
        defparameter("*DEFAULT-GENLPREDS-CHECK-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-NOT-GENLPREDS-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlpreds_file() {
        inference_modules.inference_removal_module($REMOVAL_GENLPREDS_CHECK, $list3);
        inference_modules.inference_removal_module($REMOVAL_ALL_GENLPREDS, $list5);
        inference_modules.inference_removal_module($REMOVAL_ALL_SPEC_PREDS, $list7);
        inference_modules.inference_removal_module($REMOVAL_NOT_GENLPREDS_CHECK, $list10);
        inference_modules.register_solely_specific_removal_module_predicate($$genlPreds);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$genlPreds);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$genlPreds);
        return NIL;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), $COST, makeSymbol("REMOVAL-ALL-SPEC-PREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("genlPreds"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("REMOVAL-ALL-SPEC-PREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <variable> <predicate-fort>"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds ?WHAT #$performedBy)") });

    @Override
    public void declareFunctions() {
        declare_removal_modules_genlpreds_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genlpreds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genlpreds_file();
    }

    

    public static final class $removal_genlpreds_check_expand$UnaryFunction extends UnaryFunction {
        public $removal_genlpreds_check_expand$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_genlpreds_check_expand(arg1, removal_modules_genlpreds.$removal_genlpreds_check_expand$UnaryFunction.UNPROVIDED);
        }
    }

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("genlPreds"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("genlPreds"), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLPREDS-CHECK-EXPAND") });

    public static final class $removal_genlpreds_check_expand$BinaryFunction extends BinaryFunction {
        public $removal_genlpreds_check_expand$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_genlpreds_check_expand(arg1, arg2);
        }
    }
}

/**
 * Total time: 89 ms
 */
