package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_fractions extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_fractions();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_fractions";
















    private static final SubLObject $$numerator = reader_make_constant_shell(makeString("numerator"));

    private static final SubLSymbol $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");



    public static final SubLSymbol $numerator_defining_mt$ = makeSymbol("*NUMERATOR-DEFINING-MT*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol $REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS = makeKeyword("REMOVAL-NUMERATOR-SIMPLE-FRACTION-POS");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("numerator")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), list($BIND, makeSymbol("NUMERATOR")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("NUMERATOR")), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$numerator (#$SimpleFractionFn <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$numerator (#$SimpleFractionFn 5 9) 5)\n    (#$numerator (#$SimpleFractionFn 5 9) ?NUM)") });

    private static final SubLSymbol $REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS = makeKeyword("REMOVAL-NUMERATOR-SIMPLE-FRACTION-WITH-MEASURE-POS");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYCL-FUNCTION")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), list($BIND, makeSymbol("NUMERATOR")), makeKeyword("ANYTHING")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("NUMERATOR")), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$numerator (<unit of measure> (#$SimpleFractionFn <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$numerator (#$Inch (#$SimpleFractionFn 5 9)) 5)\n    (#$numerator (#$Inch (#$SimpleFractionFn 5 9)) ?NUM)") });

    private static final SubLSymbol $REMOVAL_NUMERATOR_MIXED_FRACTION_POS = makeKeyword("REMOVAL-NUMERATOR-MIXED-FRACTION-POS");

    private static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("numerator")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("NUMERATOR")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("NUMERATOR")), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$numerator (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$numerator (#$MixedFractionFn 3 5 9) 5)\n    (#$numerator (#$MixedFractionFn 3 5 9) ?NUM)") });

    private static final SubLSymbol $REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword("REMOVAL-NUMERATOR-MIXED-FRACTION-WITH-MEASURE-POS");

    private static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYCL-FUNCTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("NUMERATOR")), makeKeyword("ANYTHING")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("NUMERATOR")), list(reader_make_constant_shell(makeString("numerator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$numerator (<unit of measure> (#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$numerator (#$Inch (#$MixedFractionFn 3 5 9)) 5)\n    (#$numerator (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });

    private static final SubLObject $$UnitOfMeasure = reader_make_constant_shell(makeString("UnitOfMeasure"));

    private static final SubLObject $$MixedFractionFn = reader_make_constant_shell(makeString("MixedFractionFn"));

    private static final SubLObject $$NegativeMixedFractionFn = reader_make_constant_shell(makeString("NegativeMixedFractionFn"));

    private static final SubLObject $$SimpleFractionFn = reader_make_constant_shell(makeString("SimpleFractionFn"));

    private static final SubLObject $$denominator = reader_make_constant_shell(makeString("denominator"));

    public static final SubLSymbol $denominator_defining_mt$ = makeSymbol("*DENOMINATOR-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS = makeKeyword("REMOVAL-DENOMINATOR-SIMPLE-FRACTION-POS");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denominator")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOMINATOR")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("DENOMINATOR")), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$denominator (#$SimpleFractionFn <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$denominator (#$SimpleFractionFn 5 9) 9)\n    (#$denominator (#$SimpleFractionFn 5 9) ?NUM)") });

    private static final SubLSymbol $REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS = makeKeyword("REMOVAL-DENOMINATOR-SIMPLE-FRACTION-WITH-MEASURE-POS");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYCL-FUNCTION")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOMINATOR"))))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("DENOMINATOR")), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$denominator (<unit of measure> (#$SimpleFractionFn <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$denominator (#$Inch (#$SimpleFractionFn 5 9)) 9)\n    (#$denominator (#$Inch (#$SimpleFractionFn 5 9)) ?NUM)") });

    private static final SubLSymbol $REMOVAL_DENOMINATOR_MIXED_FRACTION_POS = makeKeyword("REMOVAL-DENOMINATOR-MIXED-FRACTION-POS");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denominator")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOMINATOR")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("DENOMINATOR")), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$denominator (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$denominator (#$MixedFractionFn 3 5 9) 9)\n    (#$denominator (#$MixedFractionFn 3 5 9) ?NUM)") });

    private static final SubLSymbol $REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword("REMOVAL-DENOMINATOR-MIXED-FRACTION-WITH-MEASURE-POS");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYCL-FUNCTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("DENOMINATOR"))))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("DENOMINATOR")), list(reader_make_constant_shell(makeString("denominator")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$denominator (<unit of measure> (#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$denominator (#$Inch (#$MixedFractionFn 3 5 9)) 9)\n    (#$denominator (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });

    private static final SubLObject $$wholeInMixedFraction = reader_make_constant_shell(makeString("wholeInMixedFraction"));

    public static final SubLSymbol $whole_in_mixed_fraction_defining_mt$ = makeSymbol("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_WHOLE_IN_MIXED_FRACTION_POS = makeKeyword("REMOVAL-WHOLE-IN-MIXED-FRACTION-POS");

    private static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wholeInMixedFraction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wholeInMixedFraction")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("wholeInMixedFraction")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), list($BIND, makeSymbol("WHOLE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("WHOLE")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("WHOLE")), list(reader_make_constant_shell(makeString("wholeInMixedFraction")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("WHOLE")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$wholeInMixedFraction (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$wholeInMixedFraction (#$MixedFractionFn 3 5 9) 3)\n    (#$wholeInMixedFraction (#$MixedFractionFn 3 5 9) ?NUM)") });

    private static final SubLSymbol $REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword("REMOVAL-WHOLE-IN-MIXED-FRACTION-WITH-MEASURE-POS");

    private static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wholeInMixedFraction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wholeInMixedFraction")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("wholeInMixedFraction")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYCL-FUNCTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), list($BIND, makeSymbol("WHOLE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("WHOLE")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("WHOLE")), list(reader_make_constant_shell(makeString("wholeInMixedFraction")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("WHOLE")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$wholeInMixedFraction (<unit of measure>(#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$wholeInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) 3)\n    (#$wholeInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });

    private static final SubLObject $$fractionalPartInMixedFraction = reader_make_constant_shell(makeString("fractionalPartInMixedFraction"));

    public static final SubLSymbol $fractional_part_in_mixed_fraction_defining_mt$ = makeSymbol("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS = makeKeyword("REMOVAL-FRACTIONAL-PART-IN-MIXED-FRACTION-POS");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("NUM")), list($BIND, makeSymbol("DEN")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("NUM")), list(makeKeyword("VALUE"), makeSymbol("DEN")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("NUM"), makeSymbol("DEN")), list(reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), list(makeKeyword("VALUE"), makeSymbol("NUM")), list(makeKeyword("VALUE"), makeSymbol("DEN"))))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$fractionalPartInMixedFraction (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$fractionalPartInMixedFraction (#$MixedFractionFn 3 5 9) (#$SimpleFractionFn 5 9))\n    (#$fractionalPartInMixedFraction (#$MixedFractionFn 3 5 9) ?NUM)") });

    private static final SubLSymbol $REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword("REMOVAL-FRACTIONAL-PART-IN-MIXED-FRACTION-WITH-MEASURE-POS");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYCL-FUNCTION")), list(reader_make_constant_shell(makeString("MixedFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("NUM")), list($BIND, makeSymbol("DEN"))))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("NUM")), list(makeKeyword("VALUE"), makeSymbol("DEN")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("NUM"), makeSymbol("DEN")), list(reader_make_constant_shell(makeString("fractionalPartInMixedFraction")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), list(makeKeyword("VALUE"), makeSymbol("NUM")), list(makeKeyword("VALUE"), makeSymbol("DEN"))))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$fractionalPartInMixedFraction (<unit of measure>(#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$fractionalPartInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) (#$SimpleFractionFn 5 9))\n    (#$fractionalPartInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });

    private static final SubLObject $$significand = reader_make_constant_shell(makeString("significand"));

    public static final SubLSymbol $significand_defining_mt$ = makeSymbol("*SIGNIFICAND-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_SIGNIFICAND_POS = makeKeyword("REMOVAL-SIGNIFICAND-POS");

    private static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("significand")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("significand")), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("significand")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), listS(reader_make_constant_shell(makeString("DecimalFractionFn")), list($BIND, makeSymbol("SIGNIFICAND")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("SIGNIFICAND")), list(reader_make_constant_shell(makeString("significand")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*SIGNIFICAND-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$significand (#$DecimalFractionFn <integer> <integer>) <whatever>)\n    (#$significand (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$significand (#$DecimalFractionFn     125 2)       125)\n    (#$significand (#$DecimalFractionFn     125 2)      ?NUM)\n    (#$significand (#$DecimalFractionFn 3142857 6 6) 3142857)\n    (#$significand (#$DecimalFractionFn 3142857 6 6)    ?NUM)") });

    private static final SubLSymbol $REMOVAL_SIGNIFICAND_WITH_MEASURE_POS = makeKeyword("REMOVAL-SIGNIFICAND-WITH-MEASURE-POS");

    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("significand")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("significand")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("significand")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYC-FUNCTION")), listS(reader_make_constant_shell(makeString("DecimalFractionFn")), list($BIND, makeSymbol("SIGNIFICAND")), makeKeyword("ANYTHING")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYC-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYC-FUNCTION"), makeSymbol("SIGNIFICAND")), list(reader_make_constant_shell(makeString("significand")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*SIGNIFICAND-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$significand (<unit of measure> (#$DecimalFractionFn <integer> <integer>)) <whatever>)\n    (#$significand (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$significand (#$Inch (#$DecimalFractionFn     125 2))       125)\n    (#$significand (#$Inch (#$DecimalFractionFn     125 2))      ?NUM)\n    (#$significand (#$Inch (#$DecimalFractionFn 3142857 6 6)) 3142857)\n    (#$significand (#$Inch (#$DecimalFractionFn 3142857 6 6))    ?NUM)") });

    private static final SubLObject $$decimalPosition = reader_make_constant_shell(makeString("decimalPosition"));

    public static final SubLSymbol $decimal_position_defining_mt$ = makeSymbol("*DECIMAL-POSITION-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_DECIMAL_POSITION_POS = makeKeyword("REMOVAL-DECIMAL-POSITION-POS");

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("decimalPosition")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), listS(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("POSITION")), makeKeyword("ANYTHING"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("POSITION")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("POSITION")), list(reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("POSITION")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DECIMAL-POSITION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$decimalPosition (#$DecimalFractionFn <integer> <integer>) <whatever>)\n    (#$decimalPosition (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$decimalPosition (#$DecimalFractionFn     125 2)      2)\n    (#$decimalPosition (#$DecimalFractionFn     125 2)   ?NUM)\n    (#$decimalPosition (#$DecimalFractionFn 3142857 6 6)    6)\n    (#$decimalPosition (#$DecimalFractionFn 3142857 6 6) ?NUM)") });

    private static final SubLSymbol $REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS = makeKeyword("REMOVAL-DECIMAL-POSITION-WITH-MEASURE-POS");

    private static final SubLList $list51 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("decimalPosition")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYC-FUNCTION")), listS(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("ANYTHING"), list($BIND, makeSymbol("POSITION")), makeKeyword("ANYTHING")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYC-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("POSITION")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYC-FUNCTION"), makeSymbol("POSITION")), list(reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("POSITION")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DECIMAL-POSITION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$decimalPosition (<unit of measure> (#$DecimalFractionFn <integer> <integer>)) <whatever>)\n    (#$decimalPosition (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$decimalPosition (#$Inch (#$DecimalFractionFn     125 2))      2)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn     125 2))   ?NUM)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn 3142857 6 6))    6)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn 3142857 6 6)) ?NUM)") });

    private static final SubLObject $$repeatingEndSequence = reader_make_constant_shell(makeString("repeatingEndSequence"));

    public static final SubLSymbol $repeating_end_sequence_defining_mt$ = makeSymbol("*REPEATING-END-SEQUENCE-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_REPEATING_END_SEQUENCE_POS = makeKeyword("REMOVAL-REPEATING-END-SEQUENCE-POS");

    private static final SubLList $list55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("repeatingEndSequence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("repeatingEndSequence")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("repeatingEndSequence")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("REPEAT")))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("REPEAT")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("REPEAT")), list(reader_make_constant_shell(makeString("repeatingEndSequence")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("REPEAT")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*REPEATING-END-SEQUENCE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$repeatingEndSequence (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$repeatingEndSequence (#$DecimalFractionFn 3142857 6 6)    6)\n    (#$repeatingEndSequence (#$DecimalFractionFn 3142857 6 6) ?NUM)") });

    private static final SubLSymbol $REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS = makeKeyword("REMOVAL-REPEATING-END-SEQUENCE-WITH-MEASURE-POS");

    private static final SubLList $list57 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("repeatingEndSequence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("repeatingEndSequence")), list(makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("repeatingEndSequence")), list(makeKeyword("AND"), list($BIND, makeSymbol("FRACTION")), list(list($BIND, makeSymbol("CYC-FUNCTION")), list(reader_make_constant_shell(makeString("DecimalFractionFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("REPEAT"))))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("CYC-FUNCTION")), list(makeKeyword("VALUE"), makeSymbol("REPEAT")))), makeKeyword("INPUT-VERIFY-PATTERN"), list($TEST, makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("CYC-FUNCTION"), makeSymbol("REPEAT")), list(reader_make_constant_shell(makeString("repeatingEndSequence")), list(makeKeyword("VALUE"), makeSymbol("FRACTION")), list(makeKeyword("VALUE"), makeSymbol("REPEAT")))), makeKeyword("SUPPORT-MODULE"), $CODE, makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*REPEATING-END-SEQUENCE-DEFINING-MT*"), makeKeyword("DOCUMENTATION"), makeString("(#$repeatingEndSequence (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)"), makeKeyword("EXAMPLE"), makeString("(#$repeatingEndSequence (#$Inch (#$DecimalFractionFn 3142857 6 6))    6)\n    (#$repeatingEndSequence (#$Inch (#$DecimalFractionFn 3142857 6 6)) ?NUM)") });

    public static SubLObject removal_fraction_with_measure_pos_check(final SubLObject cycl_input) {
        return isa.isaP(second(cycl_input), $$UnitOfMeasure, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject el_fraction_numerator(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != possibly_naut_p(v_term)) {
            if ((NIL != collection_defns.unit_of_measureP(cycl_utilities.naut_functor(v_term), mt)) && ((NIL == cycl_utilities.naut_arg2(v_term, UNPROVIDED)) || (NIL != czer_utilities.equals_elP(cycl_utilities.naut_arg1(v_term, UNPROVIDED), cycl_utilities.naut_arg2(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                v_term = cycl_utilities.naut_arg1(v_term, UNPROVIDED);
            }
            if (NIL != cycl_utilities.naut_with_functor_p(v_term, $$MixedFractionFn)) {
                return cycl_utilities.naut_arg2(v_term, UNPROVIDED);
            }
            if (NIL != cycl_utilities.naut_with_functor_p(v_term, $$NegativeMixedFractionFn)) {
                return cycl_utilities.naut_arg2(v_term, UNPROVIDED);
            }
            if (NIL != cycl_utilities.naut_with_functor_p(v_term, $$SimpleFractionFn)) {
                return cycl_utilities.naut_arg1(v_term, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject el_fraction_denominator(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL != possibly_naut_p(v_term)) {
            if ((NIL != collection_defns.unit_of_measureP(cycl_utilities.naut_functor(v_term), mt)) && ((NIL == cycl_utilities.naut_arg2(v_term, UNPROVIDED)) || (NIL != czer_utilities.equals_elP(cycl_utilities.naut_arg1(v_term, UNPROVIDED), cycl_utilities.naut_arg2(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                v_term = cycl_utilities.naut_arg1(v_term, UNPROVIDED);
            }
            if (NIL != cycl_utilities.naut_with_functor_p(v_term, $$MixedFractionFn)) {
                return cycl_utilities.naut_arg3(v_term, UNPROVIDED);
            }
            if (NIL != cycl_utilities.naut_with_functor_p(v_term, $$NegativeMixedFractionFn)) {
                return cycl_utilities.naut_arg3(v_term, UNPROVIDED);
            }
            if (NIL != cycl_utilities.naut_with_functor_p(v_term, $$SimpleFractionFn)) {
                return cycl_utilities.naut_arg2(v_term, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_fractions_file() {
        declareFunction("removal_fraction_with_measure_pos_check", "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK", 1, 0, false);
        declareFunction("el_fraction_numerator", "EL-FRACTION-NUMERATOR", 1, 1, false);
        declareFunction("el_fraction_denominator", "EL-FRACTION-DENOMINATOR", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_fractions_file() {
        deflexical("*NUMERATOR-DEFINING-MT*", SubLTrampolineFile.maybeDefault($numerator_defining_mt$, $numerator_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*DENOMINATOR-DEFINING-MT*", SubLTrampolineFile.maybeDefault($denominator_defining_mt$, $denominator_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*", SubLTrampolineFile.maybeDefault($whole_in_mixed_fraction_defining_mt$, $whole_in_mixed_fraction_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*", SubLTrampolineFile.maybeDefault($fractional_part_in_mixed_fraction_defining_mt$, $fractional_part_in_mixed_fraction_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*SIGNIFICAND-DEFINING-MT*", SubLTrampolineFile.maybeDefault($significand_defining_mt$, $significand_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*DECIMAL-POSITION-DEFINING-MT*", SubLTrampolineFile.maybeDefault($decimal_position_defining_mt$, $decimal_position_defining_mt$, $$UniversalVocabularyMt));
        deflexical("*REPEATING-END-SEQUENCE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($repeating_end_sequence_defining_mt$, $repeating_end_sequence_defining_mt$, $$UniversalVocabularyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_fractions_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$numerator);
        inference_modules.inference_removal_module_use_generic($$numerator, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$numerator, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$numerator, ONE_INTEGER);
        declare_defglobal($numerator_defining_mt$);
        mt_vars.note_mt_var($numerator_defining_mt$, $$numerator);
        inference_modules.inference_removal_module($REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS, $list7);
        inference_modules.inference_removal_module($REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_NUMERATOR_MIXED_FRACTION_POS, $list11);
        inference_modules.inference_removal_module($REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS, $list13);
        inference_modules.register_solely_specific_removal_module_predicate($$denominator);
        inference_modules.inference_removal_module_use_generic($$denominator, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$denominator, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$denominator, ONE_INTEGER);
        declare_defglobal($denominator_defining_mt$);
        mt_vars.note_mt_var($denominator_defining_mt$, $$denominator);
        inference_modules.inference_removal_module($REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS, $list23);
        inference_modules.inference_removal_module($REMOVAL_DENOMINATOR_MIXED_FRACTION_POS, $list25);
        inference_modules.inference_removal_module($REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS, $list27);
        inference_modules.register_solely_specific_removal_module_predicate($$wholeInMixedFraction);
        inference_modules.inference_removal_module_use_generic($$wholeInMixedFraction, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$wholeInMixedFraction, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$wholeInMixedFraction, ONE_INTEGER);
        declare_defglobal($whole_in_mixed_fraction_defining_mt$);
        mt_vars.note_mt_var($whole_in_mixed_fraction_defining_mt$, $$wholeInMixedFraction);
        inference_modules.inference_removal_module($REMOVAL_WHOLE_IN_MIXED_FRACTION_POS, $list31);
        inference_modules.inference_removal_module($REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS, $list33);
        inference_modules.register_solely_specific_removal_module_predicate($$fractionalPartInMixedFraction);
        inference_modules.inference_removal_module_use_generic($$fractionalPartInMixedFraction, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$fractionalPartInMixedFraction, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$fractionalPartInMixedFraction, ONE_INTEGER);
        declare_defglobal($fractional_part_in_mixed_fraction_defining_mt$);
        mt_vars.note_mt_var($fractional_part_in_mixed_fraction_defining_mt$, $$fractionalPartInMixedFraction);
        inference_modules.inference_removal_module($REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS, $list37);
        inference_modules.inference_removal_module($REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS, $list39);
        inference_modules.register_solely_specific_removal_module_predicate($$significand);
        inference_modules.inference_removal_module_use_generic($$significand, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$significand, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$significand, ONE_INTEGER);
        declare_defglobal($significand_defining_mt$);
        mt_vars.note_mt_var($significand_defining_mt$, $$significand);
        inference_modules.inference_removal_module($REMOVAL_SIGNIFICAND_POS, $list43);
        inference_modules.inference_removal_module($REMOVAL_SIGNIFICAND_WITH_MEASURE_POS, $list45);
        inference_modules.register_solely_specific_removal_module_predicate($$decimalPosition);
        inference_modules.inference_removal_module_use_generic($$decimalPosition, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$decimalPosition, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$decimalPosition, ONE_INTEGER);
        declare_defglobal($decimal_position_defining_mt$);
        mt_vars.note_mt_var($decimal_position_defining_mt$, $$decimalPosition);
        inference_modules.inference_removal_module($REMOVAL_DECIMAL_POSITION_POS, $list49);
        inference_modules.inference_removal_module($REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS, $list51);
        inference_modules.register_solely_specific_removal_module_predicate($$repeatingEndSequence);
        inference_modules.inference_removal_module_use_generic($$repeatingEndSequence, $REMOVAL_LOOKUP_POS);
        inference_modules.inference_removal_module_use_meta_removal($$repeatingEndSequence, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        preference_modules.doomed_unless_arg_bindable($POS, $$repeatingEndSequence, ONE_INTEGER);
        declare_defglobal($repeating_end_sequence_defining_mt$);
        mt_vars.note_mt_var($repeating_end_sequence_defining_mt$, $$repeatingEndSequence);
        inference_modules.inference_removal_module($REMOVAL_REPEATING_END_SEQUENCE_POS, $list55);
        inference_modules.inference_removal_module($REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS, $list57);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_fractions_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_fractions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_fractions_file();
    }

    static {


































































    }
}

/**
 * Total time: 258 ms
 */
