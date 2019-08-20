package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.extended_numbers;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_min_quant_value extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "f223cd7326915c4bc9031648da21417954d9fdb3abfe4b53d984219f34cd80a1";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 1900L)
    public static SubLSymbol $min_quant_value_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 3500L)
    public static SubLSymbol $max_quant_value_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 5100L)
    public static SubLSymbol $quantity_unit_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 6900L)
    public static SubLSymbol $quantity_measure_defining_mt$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 8100L)
    public static SubLSymbol $multiplication_units_defining_mt$;
    private static SubLObject $$minQuantValue;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_LOOKUP_POS;
    private static SubLSymbol $sym3$_MIN_QUANT_VALUE_DEFINING_MT_;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLObject $$MinQuantValueFn;
    private static SubLSymbol $REMOVAL_MIN_QUANT_VALUE_POS;
    private static SubLList $list7;
    private static SubLObject $$maxQuantValue;
    private static SubLSymbol $sym9$_MAX_QUANT_VALUE_DEFINING_MT_;
    private static SubLObject $$MaxQuantValueFn;
    private static SubLSymbol $REMOVAL_MAX_QUANT_VALUE_POS;
    private static SubLList $list12;
    private static SubLObject $$quantityUnit;
    private static SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static SubLSymbol $sym15$_QUANTITY_UNIT_DEFINING_MT_;
    private static SubLObject $$QuantityUnitFn;
    private static SubLSymbol $REMOVAL_QUANTITY_UNIT_POS;
    private static SubLList $list18;
    private static SubLObject $$quantityMeasure;
    private static SubLSymbol $sym20$_QUANTITY_MEASURE_DEFINING_MT_;
    private static SubLObject $$QuantityMeasureFn;
    private static SubLSymbol $REMOVAL_QUANTITY_MEASURE_POS;
    private static SubLList $list23;
    private static SubLSymbol $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_;
    private static SubLObject $$multiplicationUnits;
    private static SubLSymbol $MULTIPLICATION_UNITS;
    private static SubLList $list27;
    private static SubLSymbol $REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1;
    private static SubLList $list29;
    private static SubLSymbol $REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2;
    private static SubLList $list31;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 1000L)
    public static SubLObject unreified_quantity_p(SubLObject v_object) {
        return makeBoolean(NIL != extended_numbers.possibly_infinite_or_extended_number_p(v_object) || NIL != collection_defns.ibqeP(v_object, UNPROVIDED) || NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(v_object)
                || NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(v_object) || NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(v_object) || NIL != collection_defns.simple_fractionP(v_object, UNPROVIDED)
                || NIL != collection_defns.mixed_fractionP(v_object, UNPROVIDED) || NIL != collection_defns.decimal_fractionP(v_object, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 2000L)
    public static SubLObject removal_min_quant_value(SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(list($$MinQuantValueFn, quantity));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 3600L)
    public static SubLObject removal_max_quant_value(SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(list($$MaxQuantValueFn, quantity));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 5300L)
    public static SubLObject removal_quantity_unit(SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(el_utilities.make_unary_formula($$QuantityUnitFn, quantity));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 7000L)
    public static SubLObject removal_quantity_measure(SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(el_utilities.make_unary_formula($$QuantityMeasureFn, quantity));
    }

    public static SubLObject declare_removal_modules_min_quant_value_file() {
        declareFunction("unreified_quantity_p", "UNREIFIED-QUANTITY-P", 1, 0, false);
        declareFunction("removal_min_quant_value", "REMOVAL-MIN-QUANT-VALUE", 1, 0, false);
        declareFunction("removal_max_quant_value", "REMOVAL-MAX-QUANT-VALUE", 1, 0, false);
        declareFunction("removal_quantity_unit", "REMOVAL-QUANTITY-UNIT", 1, 0, false);
        declareFunction("removal_quantity_measure", "REMOVAL-QUANTITY-MEASURE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_min_quant_value_file() {
        $min_quant_value_defining_mt$ = deflexical("*MIN-QUANT-VALUE-DEFINING-MT*", maybeDefault($sym3$_MIN_QUANT_VALUE_DEFINING_MT_, $min_quant_value_defining_mt$, $$UniversalVocabularyMt));
        $max_quant_value_defining_mt$ = deflexical("*MAX-QUANT-VALUE-DEFINING-MT*", maybeDefault($sym9$_MAX_QUANT_VALUE_DEFINING_MT_, $max_quant_value_defining_mt$, $$UniversalVocabularyMt));
        $quantity_unit_defining_mt$ = deflexical("*QUANTITY-UNIT-DEFINING-MT*", maybeDefault($sym15$_QUANTITY_UNIT_DEFINING_MT_, $quantity_unit_defining_mt$, $$UniversalVocabularyMt));
        $quantity_measure_defining_mt$ = deflexical("*QUANTITY-MEASURE-DEFINING-MT*", maybeDefault($sym20$_QUANTITY_MEASURE_DEFINING_MT_, $quantity_measure_defining_mt$, $$UniversalVocabularyMt));
        $multiplication_units_defining_mt$ = deflexical("*MULTIPLICATION-UNITS-DEFINING-MT*", maybeDefault($sym24$_MULTIPLICATION_UNITS_DEFINING_MT_, $multiplication_units_defining_mt$, $$UniversalVocabularyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_min_quant_value_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$minQuantValue);
        preference_modules.doomed_unless_arg_bindable($POS, $$minQuantValue, ONE_INTEGER);
        inference_modules.inference_removal_module_use_generic($$minQuantValue, $REMOVAL_LOOKUP_POS);
        subl_macro_promotions.declare_defglobal($sym3$_MIN_QUANT_VALUE_DEFINING_MT_);
        mt_vars.note_mt_var($sym3$_MIN_QUANT_VALUE_DEFINING_MT_, $$minQuantValue);
        inference_modules.inference_removal_module($REMOVAL_MIN_QUANT_VALUE_POS, $list7);
        inference_modules.register_solely_specific_removal_module_predicate($$maxQuantValue);
        preference_modules.doomed_unless_arg_bindable($POS, $$maxQuantValue, ONE_INTEGER);
        inference_modules.inference_removal_module_use_generic($$maxQuantValue, $REMOVAL_LOOKUP_POS);
        subl_macro_promotions.declare_defglobal($sym9$_MAX_QUANT_VALUE_DEFINING_MT_);
        mt_vars.note_mt_var($sym9$_MAX_QUANT_VALUE_DEFINING_MT_, $$maxQuantValue);
        inference_modules.inference_removal_module($REMOVAL_MAX_QUANT_VALUE_POS, $list12);
        inference_modules.register_solely_specific_removal_module_predicate($$quantityUnit);
        inference_modules.inference_removal_module_use_generic($$quantityUnit, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quantityUnit, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$quantityUnit, ONE_INTEGER);
        subl_macro_promotions.declare_defglobal($sym15$_QUANTITY_UNIT_DEFINING_MT_);
        mt_vars.note_mt_var($sym15$_QUANTITY_UNIT_DEFINING_MT_, $$quantityUnit);
        inference_modules.inference_removal_module($REMOVAL_QUANTITY_UNIT_POS, $list18);
        inference_modules.register_solely_specific_removal_module_predicate($$quantityMeasure);
        inference_modules.inference_removal_module_use_generic($$quantityMeasure, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quantityMeasure, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$quantityMeasure, ONE_INTEGER);
        subl_macro_promotions.declare_defglobal($sym20$_QUANTITY_MEASURE_DEFINING_MT_);
        mt_vars.note_mt_var($sym20$_QUANTITY_MEASURE_DEFINING_MT_, $$quantityMeasure);
        inference_modules.inference_removal_module($REMOVAL_QUANTITY_MEASURE_POS, $list23);
        subl_macro_promotions.declare_defglobal($sym24$_MULTIPLICATION_UNITS_DEFINING_MT_);
        mt_vars.note_mt_var($sym24$_MULTIPLICATION_UNITS_DEFINING_MT_, $$multiplicationUnits);
        preference_modules.inference_preference_module($MULTIPLICATION_UNITS, $list27);
        inference_modules.inference_removal_module($REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1, $list29);
        inference_modules.inference_removal_module($REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2, $list31);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_min_quant_value_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_min_quant_value_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_min_quant_value_file();
    }

    static {
        me = new removal_modules_min_quant_value();
        $min_quant_value_defining_mt$ = null;
        $max_quant_value_defining_mt$ = null;
        $quantity_unit_defining_mt$ = null;
        $quantity_measure_defining_mt$ = null;
        $multiplication_units_defining_mt$ = null;
        $$minQuantValue = makeConstSym(("minQuantValue"));
        $POS = makeKeyword("POS");
        $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");
        $sym3$_MIN_QUANT_VALUE_DEFINING_MT_ = makeSymbol("*MIN-QUANT-VALUE-DEFINING-MT*");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $$MinQuantValueFn = makeConstSym(("MinQuantValueFn"));
        $REMOVAL_MIN_QUANT_VALUE_POS = makeKeyword("REMOVAL-MIN-QUANT-VALUE-POS");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("minQuantValue")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("minQuantValue")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("minQuantValue")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MIN-QUANT-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("minQuantValue")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MIN-QUANT-VALUE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$minQuantValue <numberp> <whatever>) or\n    (#$minQuantValue (<unit> <min/max>) <whatever>) or\n    (#$minQuantValue (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$minQuantValue 212 ?VAL)\n    (#$minQuantValue (#$Unity 212) 212)\n    (#$minQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
        $$maxQuantValue = makeConstSym(("maxQuantValue"));
        $sym9$_MAX_QUANT_VALUE_DEFINING_MT_ = makeSymbol("*MAX-QUANT-VALUE-DEFINING-MT*");
        $$MaxQuantValueFn = makeConstSym(("MaxQuantValueFn"));
        $REMOVAL_MAX_QUANT_VALUE_POS = makeKeyword("REMOVAL-MAX-QUANT-VALUE-POS");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("maxQuantValue")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("maxQuantValue")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("maxQuantValue")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MAX-QUANT-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("maxQuantValue")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MAX-QUANT-VALUE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$maxQuantValue <numberp> <whatever>) or\n    (#$maxQuantValue (<unit> <min/max>) <whatever>) or\n    (#$maxQuantValue (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$maxQuantValue 212 ?VAL)\n    (#$maxQuantValue (#$Unity 212) 212)\n    (#$maxQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
        $$quantityUnit = makeConstSym(("quantityUnit"));
        $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $sym15$_QUANTITY_UNIT_DEFINING_MT_ = makeSymbol("*QUANTITY-UNIT-DEFINING-MT*");
        $$QuantityUnitFn = makeConstSym(("QuantityUnitFn"));
        $REMOVAL_QUANTITY_UNIT_POS = makeKeyword("REMOVAL-QUANTITY-UNIT-POS");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quantityUnit")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("quantityUnit")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("quantityUnit")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUANTITY-UNIT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("quantityUnit")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*QUANTITY-UNIT-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$quantityUnit <numberp> <whatever>) or\n    (#$quantityUnit (<unit> <min/max>) <whatever>) or\n    (#$quantityUnit (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$quantityUnit 212 ?VAL)\n    (#$quantityUnit (#$Unity 212) #$Unity)\n    (#$quantityUnit (#$Meter 2 3) #$Meter)") });
        $$quantityMeasure = makeConstSym(("quantityMeasure"));
        $sym20$_QUANTITY_MEASURE_DEFINING_MT_ = makeSymbol("*QUANTITY-MEASURE-DEFINING-MT*");
        $$QuantityMeasureFn = makeConstSym(("QuantityMeasureFn"));
        $REMOVAL_QUANTITY_MEASURE_POS = makeKeyword("REMOVAL-QUANTITY-MEASURE-POS");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("quantityMeasure")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("quantityMeasure")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("quantityMeasure")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUANTITY-MEASURE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("quantityMeasure")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*QUANTITY-MEASURE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$quantityMeasure <numberp> <whatever>) or\n    (#$quantityMeasure (<unit> <min/max>) <whatever>) or\n    (#$quantityMeasure (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"),
                makeString("(#$quantityMeasure 212 ?VAL)\n    (#$quantityMeasure (#$Unity 212) 212)\n    (#$quantityMeasure (#$Meter 2 3) (#$Unity 2 3)") });
        $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_ = makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*");
        $$multiplicationUnits = makeConstSym(("multiplicationUnits"));
        $MULTIPLICATION_UNITS = makeKeyword("MULTIPLICATION-UNITS");
        $list27 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("multiplicationUnits")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("multiplicationUnits")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                        list(makeConstSym(("multiplicationUnits")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(makeConstSym(("multiplicationUnits")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1 = makeKeyword("REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG1");
        $list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("multiplicationUnits")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("multiplicationUnits")), makeConstSym(("Unity")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeConstSym(("multiplicationUnits")), makeConstSym(("Unity")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"),
                        list(makeKeyword("OR"), list(makeConstSym(("multiplicationUnits")), makeConstSym(("Unity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))), makeKeyword("ANYTHING")),
                                list(makeConstSym(("multiplicationUnits")), makeConstSym(("Unity")), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))))),
                        list(makeKeyword("VALUE"), makeSymbol("UNIT"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("multiplicationUnits")), makeConstSym(("Unity")), list(makeKeyword("VALUE"), makeSymbol("UNIT")), list(makeKeyword("VALUE"), makeSymbol("UNIT"))),
                makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$multiplicationUnits #$Unity <unit> <whatever>) or\n    (#$multiplicationUnits #$Unity <whatever> <unit>)"), makeKeyword("EXAMPLE"), makeString("(#$multiplicationUnits #$Unity #$Meter ?WHAT)\n    (#$multiplicationUnits #$Unity ?WHAT #$Meter)") });
        $REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2 = makeKeyword("REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG2");
        $list31 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("multiplicationUnits")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("multiplicationUnits")), makeKeyword("FULLY-BOUND"), makeConstSym(("Unity")), makeKeyword("ANYTHING")), list(makeConstSym(("multiplicationUnits")), makeKeyword("ANYTHING"), makeConstSym(("Unity")), makeKeyword("FULLY-BOUND"))),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"),
                        list(makeKeyword("OR"), list(makeConstSym(("multiplicationUnits")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))), makeConstSym(("Unity")), makeKeyword("ANYTHING")),
                                list(makeConstSym(("multiplicationUnits")), makeKeyword("ANYTHING"), makeConstSym(("Unity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))))),
                        list(makeKeyword("VALUE"), makeSymbol("UNIT"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("multiplicationUnits")), list(makeKeyword("VALUE"), makeSymbol("UNIT")), makeConstSym(("Unity")), list(makeKeyword("VALUE"), makeSymbol("UNIT"))),
                makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
                makeString("(#$multiplicationUnits <unit> #$Unity <whatever>) or\n    (#$multiplicationUnits <whatever> #$Unity <unit>)"), makeKeyword("EXAMPLE"), makeString("(#$multiplicationUnits #$Volt #$Unity ?WHAT)\n    (#$multiplicationUnits ?WHAT #$Unity #$Volt)") });
    }
}
/*
 *
 * Total time: 68 ms
 *
 */