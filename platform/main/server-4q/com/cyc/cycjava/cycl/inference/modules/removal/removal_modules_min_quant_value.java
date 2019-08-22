package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.extended_numbers;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_min_quant_value extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_min_quant_value();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value";

    public static final String myFingerPrint = "f223cd7326915c4bc9031648da21417954d9fdb3abfe4b53d984219f34cd80a1";











    private static final SubLObject $$minQuantValue = reader_make_constant_shell(makeString("minQuantValue"));



    private static final SubLSymbol $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");

    public static final SubLSymbol $min_quant_value_defining_mt$ = makeSymbol("*MIN-QUANT-VALUE-DEFINING-MT*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$MinQuantValueFn = reader_make_constant_shell(makeString("MinQuantValueFn"));

    private static final SubLSymbol $REMOVAL_MIN_QUANT_VALUE_POS = makeKeyword("REMOVAL-MIN-QUANT-VALUE-POS");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("minQuantValue")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("minQuantValue")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("minQuantValue")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MIN-QUANT-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("minQuantValue")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MIN-QUANT-VALUE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$minQuantValue <numberp> <whatever>) or\n    (#$minQuantValue (<unit> <min/max>) <whatever>) or\n    (#$minQuantValue (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$minQuantValue 212 ?VAL)\n    (#$minQuantValue (#$Unity 212) 212)\n    (#$minQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });

    private static final SubLObject $$maxQuantValue = reader_make_constant_shell(makeString("maxQuantValue"));

    public static final SubLSymbol $max_quant_value_defining_mt$ = makeSymbol("*MAX-QUANT-VALUE-DEFINING-MT*");

    private static final SubLObject $$MaxQuantValueFn = reader_make_constant_shell(makeString("MaxQuantValueFn"));

    private static final SubLSymbol $REMOVAL_MAX_QUANT_VALUE_POS = makeKeyword("REMOVAL-MAX-QUANT-VALUE-POS");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("maxQuantValue")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("maxQuantValue")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("maxQuantValue")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MAX-QUANT-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("maxQuantValue")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MAX-QUANT-VALUE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$maxQuantValue <numberp> <whatever>) or\n    (#$maxQuantValue (<unit> <min/max>) <whatever>) or\n    (#$maxQuantValue (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$maxQuantValue 212 ?VAL)\n    (#$maxQuantValue (#$Unity 212) 212)\n    (#$maxQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });

    private static final SubLObject $$quantityUnit = reader_make_constant_shell(makeString("quantityUnit"));

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    public static final SubLSymbol $quantity_unit_defining_mt$ = makeSymbol("*QUANTITY-UNIT-DEFINING-MT*");

    private static final SubLObject $$QuantityUnitFn = reader_make_constant_shell(makeString("QuantityUnitFn"));

    private static final SubLSymbol $REMOVAL_QUANTITY_UNIT_POS = makeKeyword("REMOVAL-QUANTITY-UNIT-POS");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quantityUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("quantityUnit")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("quantityUnit")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUANTITY-UNIT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("quantityUnit")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*QUANTITY-UNIT-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$quantityUnit <numberp> <whatever>) or\n    (#$quantityUnit (<unit> <min/max>) <whatever>) or\n    (#$quantityUnit (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$quantityUnit 212 ?VAL)\n    (#$quantityUnit (#$Unity 212) #$Unity)\n    (#$quantityUnit (#$Meter 2 3) #$Meter)") });

    private static final SubLObject $$quantityMeasure = reader_make_constant_shell(makeString("quantityMeasure"));

    public static final SubLSymbol $quantity_measure_defining_mt$ = makeSymbol("*QUANTITY-MEASURE-DEFINING-MT*");

    private static final SubLObject $$QuantityMeasureFn = reader_make_constant_shell(makeString("QuantityMeasureFn"));

    private static final SubLSymbol $REMOVAL_QUANTITY_MEASURE_POS = makeKeyword("REMOVAL-QUANTITY-MEASURE-POS");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("quantityMeasure")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("quantityMeasure")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("UNREIFIED-QUANTITY-P"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("quantityMeasure")), list(makeKeyword("BIND"), makeSymbol("QUANTITY")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-QUANTITY-MEASURE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("quantityMeasure")), list(makeKeyword("VALUE"), makeSymbol("QUANTITY")), makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*QUANTITY-MEASURE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$quantityMeasure <numberp> <whatever>) or\n    (#$quantityMeasure (<unit> <min/max>) <whatever>) or\n    (#$quantityMeasure (<unit> <min> <max>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$quantityMeasure 212 ?VAL)\n    (#$quantityMeasure (#$Unity 212) 212)\n    (#$quantityMeasure (#$Meter 2 3) (#$Unity 2 3)") });

    public static final SubLSymbol $multiplication_units_defining_mt$ = makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*");

    private static final SubLObject $$multiplicationUnits = reader_make_constant_shell(makeString("multiplicationUnits"));



    private static final SubLList $list27 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1 = makeKeyword("REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG1");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("multiplicationUnits")), reader_make_constant_shell(makeString("Unity")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("multiplicationUnits")), reader_make_constant_shell(makeString("Unity")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("multiplicationUnits")), reader_make_constant_shell(makeString("Unity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("multiplicationUnits")), reader_make_constant_shell(makeString("Unity")), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))))), list(makeKeyword("VALUE"), makeSymbol("UNIT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("multiplicationUnits")), reader_make_constant_shell(makeString("Unity")), list(makeKeyword("VALUE"), makeSymbol("UNIT")), list(makeKeyword("VALUE"), makeSymbol("UNIT"))), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$multiplicationUnits #$Unity <unit> <whatever>) or\n    (#$multiplicationUnits #$Unity <whatever> <unit>)"), makeKeyword("EXAMPLE"), makeString("(#$multiplicationUnits #$Unity #$Meter ?WHAT)\n    (#$multiplicationUnits #$Unity ?WHAT #$Meter)") });

    private static final SubLSymbol $REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2 = makeKeyword("REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG2");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("FULLY-BOUND"), reader_make_constant_shell(makeString("Unity")), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("ANYTHING"), reader_make_constant_shell(makeString("Unity")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("multiplicationUnits")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))), reader_make_constant_shell(makeString("Unity")), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("multiplicationUnits")), makeKeyword("ANYTHING"), reader_make_constant_shell(makeString("Unity")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("BIND"), makeSymbol("UNIT"))))), list(makeKeyword("VALUE"), makeSymbol("UNIT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("multiplicationUnits")), list(makeKeyword("VALUE"), makeSymbol("UNIT")), reader_make_constant_shell(makeString("Unity")), list(makeKeyword("VALUE"), makeSymbol("UNIT"))), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$multiplicationUnits <unit> #$Unity <whatever>) or\n    (#$multiplicationUnits <whatever> #$Unity <unit>)"), makeKeyword("EXAMPLE"), makeString("(#$multiplicationUnits #$Volt #$Unity ?WHAT)\n    (#$multiplicationUnits ?WHAT #$Unity #$Volt)") });

    public static SubLObject unreified_quantity_p(final SubLObject v_object) {
        return makeBoolean((((((((NIL != extended_numbers.possibly_infinite_or_extended_number_p(v_object)) || (NIL != collection_defns.ibqeP(v_object, UNPROVIDED))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(v_object))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(v_object))) || (NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(v_object))) || (NIL != collection_defns.simple_fractionP(v_object, UNPROVIDED))) || (NIL != collection_defns.mixed_fractionP(v_object, UNPROVIDED))) || (NIL != collection_defns.decimal_fractionP(v_object, UNPROVIDED)));
    }

    public static SubLObject removal_min_quant_value(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(list($$MinQuantValueFn, quantity));
    }

    public static SubLObject removal_max_quant_value(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(list($$MaxQuantValueFn, quantity));
    }

    public static SubLObject removal_quantity_unit(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(make_unary_formula($$QuantityUnitFn, quantity));
    }

    public static SubLObject removal_quantity_measure(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(make_unary_formula($$QuantityMeasureFn, quantity));
    }

    public static SubLObject declare_removal_modules_min_quant_value_file() {
        declareFunction(me, "unreified_quantity_p", "UNREIFIED-QUANTITY-P", 1, 0, false);
        declareFunction(me, "removal_min_quant_value", "REMOVAL-MIN-QUANT-VALUE", 1, 0, false);
        declareFunction(me, "removal_max_quant_value", "REMOVAL-MAX-QUANT-VALUE", 1, 0, false);
        declareFunction(me, "removal_quantity_unit", "REMOVAL-QUANTITY-UNIT", 1, 0, false);
        declareFunction(me, "removal_quantity_measure", "REMOVAL-QUANTITY-MEASURE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_min_quant_value_file() {
        deflexical("*MIN-QUANT-VALUE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($min_quant_value_defining_mt$, $min_quant_value_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*MAX-QUANT-VALUE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($max_quant_value_defining_mt$, $max_quant_value_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*QUANTITY-UNIT-DEFINING-MT*", SubLTrampolineFile.maybeDefault($quantity_unit_defining_mt$, $quantity_unit_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*QUANTITY-MEASURE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($quantity_measure_defining_mt$, $quantity_measure_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*MULTIPLICATION-UNITS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($multiplication_units_defining_mt$, $multiplication_units_defining_mt$, $$UniversalVocabularyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_min_quant_value_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$minQuantValue);
        preference_modules.doomed_unless_arg_bindable($POS, $$minQuantValue, ONE_INTEGER);
        inference_modules.inference_removal_module_use_generic($$minQuantValue, $REMOVAL_LOOKUP_POS);
        declare_defglobal($min_quant_value_defining_mt$);
        mt_vars.note_mt_var($min_quant_value_defining_mt$, $$minQuantValue);
        inference_modules.inference_removal_module($REMOVAL_MIN_QUANT_VALUE_POS, $list7);
        inference_modules.register_solely_specific_removal_module_predicate($$maxQuantValue);
        preference_modules.doomed_unless_arg_bindable($POS, $$maxQuantValue, ONE_INTEGER);
        inference_modules.inference_removal_module_use_generic($$maxQuantValue, $REMOVAL_LOOKUP_POS);
        declare_defglobal($max_quant_value_defining_mt$);
        mt_vars.note_mt_var($max_quant_value_defining_mt$, $$maxQuantValue);
        inference_modules.inference_removal_module($REMOVAL_MAX_QUANT_VALUE_POS, $list12);
        inference_modules.register_solely_specific_removal_module_predicate($$quantityUnit);
        inference_modules.inference_removal_module_use_generic($$quantityUnit, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quantityUnit, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$quantityUnit, ONE_INTEGER);
        declare_defglobal($quantity_unit_defining_mt$);
        mt_vars.note_mt_var($quantity_unit_defining_mt$, $$quantityUnit);
        inference_modules.inference_removal_module($REMOVAL_QUANTITY_UNIT_POS, $list18);
        inference_modules.register_solely_specific_removal_module_predicate($$quantityMeasure);
        inference_modules.inference_removal_module_use_generic($$quantityMeasure, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$quantityMeasure, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$quantityMeasure, ONE_INTEGER);
        declare_defglobal($quantity_measure_defining_mt$);
        mt_vars.note_mt_var($quantity_measure_defining_mt$, $$quantityMeasure);
        inference_modules.inference_removal_module($REMOVAL_QUANTITY_MEASURE_POS, $list23);
        declare_defglobal($multiplication_units_defining_mt$);
        mt_vars.note_mt_var($multiplication_units_defining_mt$, $$multiplicationUnits);
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

    
}

/**
 * Total time: 68 ms
 */
