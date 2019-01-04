package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.extended_numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_min_quant_value extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value";
    public static final String myFingerPrint = "f223cd7326915c4bc9031648da21417954d9fdb3abfe4b53d984219f34cd80a1";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 1900L)
    public static SubLSymbol $min_quant_value_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 3502L)
    public static SubLSymbol $max_quant_value_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 5199L)
    public static SubLSymbol $quantity_unit_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 6903L)
    public static SubLSymbol $quantity_measure_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 8166L)
    public static SubLSymbol $multiplication_units_defining_mt$;
    private static final SubLObject $const0$minQuantValue;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_LOOKUP_POS;
    private static final SubLSymbol $sym3$_MIN_QUANT_VALUE_DEFINING_MT_;
    private static final SubLObject $const4$UniversalVocabularyMt;
    private static final SubLObject $const5$MinQuantValueFn;
    private static final SubLSymbol $kw6$REMOVAL_MIN_QUANT_VALUE_POS;
    private static final SubLList $list7;
    private static final SubLObject $const8$maxQuantValue;
    private static final SubLSymbol $sym9$_MAX_QUANT_VALUE_DEFINING_MT_;
    private static final SubLObject $const10$MaxQuantValueFn;
    private static final SubLSymbol $kw11$REMOVAL_MAX_QUANT_VALUE_POS;
    private static final SubLList $list12;
    private static final SubLObject $const13$quantityUnit;
    private static final SubLSymbol $kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
    private static final SubLSymbol $sym15$_QUANTITY_UNIT_DEFINING_MT_;
    private static final SubLObject $const16$QuantityUnitFn;
    private static final SubLSymbol $kw17$REMOVAL_QUANTITY_UNIT_POS;
    private static final SubLList $list18;
    private static final SubLObject $const19$quantityMeasure;
    private static final SubLSymbol $sym20$_QUANTITY_MEASURE_DEFINING_MT_;
    private static final SubLObject $const21$QuantityMeasureFn;
    private static final SubLSymbol $kw22$REMOVAL_QUANTITY_MEASURE_POS;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_;
    private static final SubLObject $const25$multiplicationUnits;
    private static final SubLSymbol $kw26$MULTIPLICATION_UNITS;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2;
    private static final SubLList $list31;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 1016L)
    public static SubLObject unreified_quantity_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_min_quant_value.NIL != extended_numbers.possibly_infinite_or_extended_number_p(v_object) || removal_modules_min_quant_value.NIL != collection_defns.ibqeP(v_object, (SubLObject)removal_modules_min_quant_value.UNPROVIDED) || removal_modules_min_quant_value.NIL != collection_defns.cyc_fractional_measurable_quantity_simple_p(v_object) || removal_modules_min_quant_value.NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p(v_object) || removal_modules_min_quant_value.NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(v_object) || removal_modules_min_quant_value.NIL != collection_defns.simple_fractionP(v_object, (SubLObject)removal_modules_min_quant_value.UNPROVIDED) || removal_modules_min_quant_value.NIL != collection_defns.mixed_fractionP(v_object, (SubLObject)removal_modules_min_quant_value.UNPROVIDED) || removal_modules_min_quant_value.NIL != collection_defns.decimal_fractionP(v_object, (SubLObject)removal_modules_min_quant_value.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 2048L)
    public static SubLObject removal_min_quant_value(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate((SubLObject)ConsesLow.list(removal_modules_min_quant_value.$const5$MinQuantValueFn, quantity));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 3650L)
    public static SubLObject removal_max_quant_value(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate((SubLObject)ConsesLow.list(removal_modules_min_quant_value.$const10$MaxQuantValueFn, quantity));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 5343L)
    public static SubLObject removal_quantity_unit(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(el_utilities.make_unary_formula(removal_modules_min_quant_value.$const16$QuantityUnitFn, quantity));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 7056L)
    public static SubLObject removal_quantity_measure(final SubLObject quantity) {
        return relation_evaluation.cyc_evaluate(el_utilities.make_unary_formula(removal_modules_min_quant_value.$const21$QuantityMeasureFn, quantity));
    }
    
    public static SubLObject declare_removal_modules_min_quant_value_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value", "unreified_quantity_p", "UNREIFIED-QUANTITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value", "removal_min_quant_value", "REMOVAL-MIN-QUANT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value", "removal_max_quant_value", "REMOVAL-MAX-QUANT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value", "removal_quantity_unit", "REMOVAL-QUANTITY-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value", "removal_quantity_measure", "REMOVAL-QUANTITY-MEASURE", 1, 0, false);
        return (SubLObject)removal_modules_min_quant_value.NIL;
    }
    
    public static SubLObject init_removal_modules_min_quant_value_file() {
        removal_modules_min_quant_value.$min_quant_value_defining_mt$ = SubLFiles.deflexical("*MIN-QUANT-VALUE-DEFINING-MT*", (removal_modules_min_quant_value.NIL != Symbols.boundp((SubLObject)removal_modules_min_quant_value.$sym3$_MIN_QUANT_VALUE_DEFINING_MT_)) ? removal_modules_min_quant_value.$min_quant_value_defining_mt$.getGlobalValue() : removal_modules_min_quant_value.$const4$UniversalVocabularyMt);
        removal_modules_min_quant_value.$max_quant_value_defining_mt$ = SubLFiles.deflexical("*MAX-QUANT-VALUE-DEFINING-MT*", (removal_modules_min_quant_value.NIL != Symbols.boundp((SubLObject)removal_modules_min_quant_value.$sym9$_MAX_QUANT_VALUE_DEFINING_MT_)) ? removal_modules_min_quant_value.$max_quant_value_defining_mt$.getGlobalValue() : removal_modules_min_quant_value.$const4$UniversalVocabularyMt);
        removal_modules_min_quant_value.$quantity_unit_defining_mt$ = SubLFiles.deflexical("*QUANTITY-UNIT-DEFINING-MT*", (removal_modules_min_quant_value.NIL != Symbols.boundp((SubLObject)removal_modules_min_quant_value.$sym15$_QUANTITY_UNIT_DEFINING_MT_)) ? removal_modules_min_quant_value.$quantity_unit_defining_mt$.getGlobalValue() : removal_modules_min_quant_value.$const4$UniversalVocabularyMt);
        removal_modules_min_quant_value.$quantity_measure_defining_mt$ = SubLFiles.deflexical("*QUANTITY-MEASURE-DEFINING-MT*", (removal_modules_min_quant_value.NIL != Symbols.boundp((SubLObject)removal_modules_min_quant_value.$sym20$_QUANTITY_MEASURE_DEFINING_MT_)) ? removal_modules_min_quant_value.$quantity_measure_defining_mt$.getGlobalValue() : removal_modules_min_quant_value.$const4$UniversalVocabularyMt);
        removal_modules_min_quant_value.$multiplication_units_defining_mt$ = SubLFiles.deflexical("*MULTIPLICATION-UNITS-DEFINING-MT*", (removal_modules_min_quant_value.NIL != Symbols.boundp((SubLObject)removal_modules_min_quant_value.$sym24$_MULTIPLICATION_UNITS_DEFINING_MT_)) ? removal_modules_min_quant_value.$multiplication_units_defining_mt$.getGlobalValue() : removal_modules_min_quant_value.$const4$UniversalVocabularyMt);
        return (SubLObject)removal_modules_min_quant_value.NIL;
    }
    
    public static SubLObject setup_removal_modules_min_quant_value_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_min_quant_value.$const0$minQuantValue);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_min_quant_value.$kw1$POS, removal_modules_min_quant_value.$const0$minQuantValue, (SubLObject)removal_modules_min_quant_value.ONE_INTEGER);
        inference_modules.inference_removal_module_use_generic(removal_modules_min_quant_value.$const0$minQuantValue, (SubLObject)removal_modules_min_quant_value.$kw2$REMOVAL_LOOKUP_POS);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_min_quant_value.$sym3$_MIN_QUANT_VALUE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_min_quant_value.$sym3$_MIN_QUANT_VALUE_DEFINING_MT_, removal_modules_min_quant_value.$const0$minQuantValue);
        inference_modules.inference_removal_module((SubLObject)removal_modules_min_quant_value.$kw6$REMOVAL_MIN_QUANT_VALUE_POS, (SubLObject)removal_modules_min_quant_value.$list7);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_min_quant_value.$const8$maxQuantValue);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_min_quant_value.$kw1$POS, removal_modules_min_quant_value.$const8$maxQuantValue, (SubLObject)removal_modules_min_quant_value.ONE_INTEGER);
        inference_modules.inference_removal_module_use_generic(removal_modules_min_quant_value.$const8$maxQuantValue, (SubLObject)removal_modules_min_quant_value.$kw2$REMOVAL_LOOKUP_POS);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_min_quant_value.$sym9$_MAX_QUANT_VALUE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_min_quant_value.$sym9$_MAX_QUANT_VALUE_DEFINING_MT_, removal_modules_min_quant_value.$const8$maxQuantValue);
        inference_modules.inference_removal_module((SubLObject)removal_modules_min_quant_value.$kw11$REMOVAL_MAX_QUANT_VALUE_POS, (SubLObject)removal_modules_min_quant_value.$list12);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_min_quant_value.$const13$quantityUnit);
        inference_modules.inference_removal_module_use_generic(removal_modules_min_quant_value.$const13$quantityUnit, (SubLObject)removal_modules_min_quant_value.$kw2$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_min_quant_value.$const13$quantityUnit, (SubLObject)removal_modules_min_quant_value.$kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_min_quant_value.$kw1$POS, removal_modules_min_quant_value.$const13$quantityUnit, (SubLObject)removal_modules_min_quant_value.ONE_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_min_quant_value.$sym15$_QUANTITY_UNIT_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_min_quant_value.$sym15$_QUANTITY_UNIT_DEFINING_MT_, removal_modules_min_quant_value.$const13$quantityUnit);
        inference_modules.inference_removal_module((SubLObject)removal_modules_min_quant_value.$kw17$REMOVAL_QUANTITY_UNIT_POS, (SubLObject)removal_modules_min_quant_value.$list18);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_min_quant_value.$const19$quantityMeasure);
        inference_modules.inference_removal_module_use_generic(removal_modules_min_quant_value.$const19$quantityMeasure, (SubLObject)removal_modules_min_quant_value.$kw2$REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_min_quant_value.$const19$quantityMeasure, (SubLObject)removal_modules_min_quant_value.$kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_min_quant_value.$kw1$POS, removal_modules_min_quant_value.$const19$quantityMeasure, (SubLObject)removal_modules_min_quant_value.ONE_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_min_quant_value.$sym20$_QUANTITY_MEASURE_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_min_quant_value.$sym20$_QUANTITY_MEASURE_DEFINING_MT_, removal_modules_min_quant_value.$const19$quantityMeasure);
        inference_modules.inference_removal_module((SubLObject)removal_modules_min_quant_value.$kw22$REMOVAL_QUANTITY_MEASURE_POS, (SubLObject)removal_modules_min_quant_value.$list23);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_min_quant_value.$sym24$_MULTIPLICATION_UNITS_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_min_quant_value.$sym24$_MULTIPLICATION_UNITS_DEFINING_MT_, removal_modules_min_quant_value.$const25$multiplicationUnits);
        preference_modules.inference_preference_module((SubLObject)removal_modules_min_quant_value.$kw26$MULTIPLICATION_UNITS, (SubLObject)removal_modules_min_quant_value.$list27);
        inference_modules.inference_removal_module((SubLObject)removal_modules_min_quant_value.$kw28$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1, (SubLObject)removal_modules_min_quant_value.$list29);
        inference_modules.inference_removal_module((SubLObject)removal_modules_min_quant_value.$kw30$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2, (SubLObject)removal_modules_min_quant_value.$list31);
        return (SubLObject)removal_modules_min_quant_value.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_min_quant_value_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_min_quant_value_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_min_quant_value_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_min_quant_value();
        removal_modules_min_quant_value.$min_quant_value_defining_mt$ = null;
        removal_modules_min_quant_value.$max_quant_value_defining_mt$ = null;
        removal_modules_min_quant_value.$quantity_unit_defining_mt$ = null;
        removal_modules_min_quant_value.$quantity_measure_defining_mt$ = null;
        removal_modules_min_quant_value.$multiplication_units_defining_mt$ = null;
        $const0$minQuantValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minQuantValue"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $sym3$_MIN_QUANT_VALUE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*MIN-QUANT-VALUE-DEFINING-MT*");
        $const4$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const5$MinQuantValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinQuantValueFn"));
        $kw6$REMOVAL_MIN_QUANT_VALUE_POS = SubLObjectFactory.makeKeyword("REMOVAL-MIN-QUANT-VALUE-POS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minQuantValue")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNREIFIED-QUANTITY-P"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_min_quant_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MIN-QUANT-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MIN-QUANT-VALUE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$minQuantValue <numberp> <whatever>) or\n    (#$minQuantValue (<unit> <min/max>) <whatever>) or\n    (#$minQuantValue (<unit> <min> <max>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$minQuantValue 212 ?VAL)\n    (#$minQuantValue (#$Unity 212) 212)\n    (#$minQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
        $const8$maxQuantValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maxQuantValue"));
        $sym9$_MAX_QUANT_VALUE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*MAX-QUANT-VALUE-DEFINING-MT*");
        $const10$MaxQuantValueFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaxQuantValueFn"));
        $kw11$REMOVAL_MAX_QUANT_VALUE_POS = SubLObjectFactory.makeKeyword("REMOVAL-MAX-QUANT-VALUE-POS");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNREIFIED-QUANTITY-P"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_min_quant_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-MAX-QUANT-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maxQuantValue")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MAX-QUANT-VALUE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$maxQuantValue <numberp> <whatever>) or\n    (#$maxQuantValue (<unit> <min/max>) <whatever>) or\n    (#$maxQuantValue (<unit> <min> <max>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$maxQuantValue 212 ?VAL)\n    (#$maxQuantValue (#$Unity 212) 212)\n    (#$maxQuantValue (#$Meter 2 3) (#$Meter ?VAL)") });
        $const13$quantityUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityUnit"));
        $kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
        $sym15$_QUANTITY_UNIT_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*QUANTITY-UNIT-DEFINING-MT*");
        $const16$QuantityUnitFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantityUnitFn"));
        $kw17$REMOVAL_QUANTITY_UNIT_POS = SubLObjectFactory.makeKeyword("REMOVAL-QUANTITY-UNIT-POS");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNREIFIED-QUANTITY-P"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_min_quant_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-QUANTITY-UNIT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*QUANTITY-UNIT-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quantityUnit <numberp> <whatever>) or\n    (#$quantityUnit (<unit> <min/max>) <whatever>) or\n    (#$quantityUnit (<unit> <min> <max>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$quantityUnit 212 ?VAL)\n    (#$quantityUnit (#$Unity 212) #$Unity)\n    (#$quantityUnit (#$Meter 2 3) #$Meter)") });
        $const19$quantityMeasure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityMeasure"));
        $sym20$_QUANTITY_MEASURE_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*QUANTITY-MEASURE-DEFINING-MT*");
        $const21$QuantityMeasureFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantityMeasureFn"));
        $kw22$REMOVAL_QUANTITY_MEASURE_POS = SubLObjectFactory.makeKeyword("REMOVAL-QUANTITY-MEASURE-POS");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityMeasure")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityMeasure")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UNREIFIED-QUANTITY-P"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_min_quant_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityMeasure")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-QUANTITY-MEASURE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantityMeasure")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTITY")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*QUANTITY-MEASURE-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$quantityMeasure <numberp> <whatever>) or\n    (#$quantityMeasure (<unit> <min/max>) <whatever>) or\n    (#$quantityMeasure (<unit> <min> <max>) <whatever>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$quantityMeasure 212 ?VAL)\n    (#$quantityMeasure (#$Unity 212) 212)\n    (#$quantityMeasure (#$Meter 2 3) (#$Unity 2 3)") });
        $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*");
        $const25$multiplicationUnits = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits"));
        $kw26$MULTIPLICATION_UNITS = SubLObjectFactory.makeKeyword("MULTIPLICATION-UNITS");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw28$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG1");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_min_quant_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$multiplicationUnits #$Unity <unit> <whatever>) or\n    (#$multiplicationUnits #$Unity <whatever> <unit>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$multiplicationUnits #$Unity #$Meter ?WHAT)\n    (#$multiplicationUnits #$Unity ?WHAT #$Meter)") });
        $kw30$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG2");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_min_quant_value.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiplicationUnits")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*MULTIPLICATION-UNITS-DEFINING-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$multiplicationUnits <unit> #$Unity <whatever>) or\n    (#$multiplicationUnits <whatever> #$Unity <unit>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$multiplicationUnits #$Volt #$Unity ?WHAT)\n    (#$multiplicationUnits ?WHAT #$Unity #$Volt)") });
    }
}

/*

	Total time: 68 ms
	
*/