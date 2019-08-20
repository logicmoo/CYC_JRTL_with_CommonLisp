package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_genlpreds extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "fb566c69ffa4a5fd606d82e4c1773f9db984b3714a0bffad324c0f512a415e0b";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 500L)
    private static SubLSymbol $default_genlpreds_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3400L)
    private static SubLSymbol $default_not_genlpreds_check_cost$;
    private static SubLList $list0;
    private static SubLSymbol $GENLPREDS;
    private static SubLSymbol $REMOVAL_GENLPREDS_CHECK;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_ALL_GENLPREDS;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_ALL_SPEC_PREDS;
    private static SubLList $list7;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_NOT_GENLPREDS_CHECK;
    private static SubLList $list10;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 600L)
    public static SubLObject removal_genlpreds_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_pred = NIL;
        SubLObject genl_pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        genl_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != genl_predicates.genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLPREDS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 1200L)
    public static SubLObject removal_all_genlpreds_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 1400L)
    public static SubLObject removal_all_genlpreds_iterator(SubLObject spec_pred) {
        return iteration.new_list_iterator(genl_predicates.all_genl_preds(spec_pred, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 2300L)
    public static SubLObject removal_all_spec_preds_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return cardinality_estimates.spec_cardinality(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 2500L)
    public static SubLObject removal_all_spec_preds_iterator(SubLObject genl_pred) {
        return iteration.new_list_iterator(genl_predicates.all_spec_preds(genl_pred, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3600L)
    public static SubLObject removal_not_genlpreds_check_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject spec_pred = NIL;
        SubLObject genl_pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        spec_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        genl_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == genl_predicates.genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != genl_predicates.not_genl_predP(spec_pred, genl_pred, UNPROVIDED, UNPROVIDED)) {
                backward.removal_add_node(arguments.make_hl_support($GENLPREDS, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_genlpreds_file() {
        declareFunction("removal_genlpreds_check_expand", "REMOVAL-GENLPREDS-CHECK-EXPAND", 1, 1, false);
        new $removal_genlpreds_check_expand$UnaryFunction();
        new $removal_genlpreds_check_expand$BinaryFunction();
        declareFunction("removal_all_genlpreds_cost", "REMOVAL-ALL-GENLPREDS-COST", 1, 1, false);
        declareFunction("removal_all_genlpreds_iterator", "REMOVAL-ALL-GENLPREDS-ITERATOR", 1, 0, false);
        declareFunction("removal_all_spec_preds_cost", "REMOVAL-ALL-SPEC-PREDS-COST", 1, 1, false);
        declareFunction("removal_all_spec_preds_iterator", "REMOVAL-ALL-SPEC-PREDS-ITERATOR", 1, 0, false);
        declareFunction("removal_not_genlpreds_check_expand", "REMOVAL-NOT-GENLPREDS-CHECK-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_genlpreds_file() {
        $default_genlpreds_check_cost$ = defparameter("*DEFAULT-GENLPREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_not_genlpreds_check_cost$ = defparameter("*DEFAULT-NOT-GENLPREDS-CHECK-COST*", TWO_INTEGER);
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

    static {
        me = new removal_modules_genlpreds();
        $default_genlpreds_check_cost$ = null;
        $default_not_genlpreds_check_cost$ = null;
        $list0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));
        $GENLPREDS = makeKeyword("GENLPREDS");
        $REMOVAL_GENLPREDS_CHECK = makeKeyword("REMOVAL-GENLPREDS-CHECK");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlPreds")), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLPREDS-CHECK-EXPAND") });
        $REMOVAL_ALL_GENLPREDS = makeKeyword("REMOVAL-ALL-GENLPREDS");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlPreds")), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-GENLPREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("genlPreds")), list(makeKeyword("BIND"), makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-GENLPREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("genlPreds")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$genlPreds <predicate-fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds #$performedBy ?WHAT)") });
        $REMOVAL_ALL_SPEC_PREDS = makeKeyword("REMOVAL-ALL-SPEC-PREDS");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlPreds")), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST"),
                makeSymbol("REMOVAL-ALL-SPEC-PREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("genlPreds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-SPEC-PREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("genlPreds")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$genlPreds <variable> <predicate-fort>"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds ?WHAT #$performedBy)") });
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_NOT_GENLPREDS_CHECK = makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("genlPreds")), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NOT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLPREDS-CHECK-EXPAND") });
        $$genlPreds = makeConstSym(("genlPreds"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
    }

    public static class $removal_genlpreds_check_expand$UnaryFunction extends UnaryFunction {
        public $removal_genlpreds_check_expand$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genlpreds_check_expand(arg1, $removal_genlpreds_check_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_genlpreds_check_expand$BinaryFunction extends BinaryFunction {
        public $removal_genlpreds_check_expand$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_genlpreds_check_expand(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 89 ms
 *
 */