package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_fractions extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_fractions";
	public static String myFingerPrint = "94310db00d16239ec1bf48b04a9bfdc3d7cda5323835b156c73c135b3735eee0";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 1400L)
	public static SubLSymbol $numerator_defining_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 6900L)
	public static SubLSymbol $denominator_defining_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 12500L)
	public static SubLSymbol $whole_in_mixed_fraction_defining_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 15400L)
	public static SubLSymbol $fractional_part_in_mixed_fraction_defining_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 18600L)
	public static SubLSymbol $significand_defining_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 21900L)
	public static SubLSymbol $decimal_position_defining_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 25300L)
	public static SubLSymbol $repeating_end_sequence_defining_mt$;
	private static SubLObject $const0$numerator;
	private static SubLSymbol $kw$REMOVAL_LOOKUP_POS;
	private static SubLSymbol $kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $sym4$_NUMERATOR_DEFINING_MT_;
	private static SubLObject $const5$UniversalVocabularyMt;
	private static SubLSymbol $kw$REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS;
	private static SubLList $list7;
	private static SubLSymbol $kw$REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS;
	private static SubLList $list9;
	private static SubLSymbol $kw$REMOVAL_NUMERATOR_MIXED_FRACTION_POS;
	private static SubLList $list11;
	private static SubLSymbol $kw$REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS;
	private static SubLList $list13;
	private static SubLObject $const14$UnitOfMeasure;
	private static SubLObject $const15$MixedFractionFn;
	private static SubLObject $const16$NegativeMixedFractionFn;
	private static SubLObject $const17$SimpleFractionFn;
	private static SubLObject $const18$denominator;
	private static SubLSymbol $sym19$_DENOMINATOR_DEFINING_MT_;
	private static SubLSymbol $kw$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS;
	private static SubLList $list21;
	private static SubLSymbol $kw$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS;
	private static SubLList $list23;
	private static SubLSymbol $kw$REMOVAL_DENOMINATOR_MIXED_FRACTION_POS;
	private static SubLList $list25;
	private static SubLSymbol $kw$REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS;
	private static SubLList $list27;
	private static SubLObject $const28$wholeInMixedFraction;
	private static SubLSymbol $sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_;
	private static SubLSymbol $kw$REMOVAL_WHOLE_IN_MIXED_FRACTION_POS;
	private static SubLList $list31;
	private static SubLSymbol $kw$REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS;
	private static SubLList $list33;
	private static SubLObject $const34$fractionalPartInMixedFraction;
	private static SubLSymbol $sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_;
	private static SubLSymbol $kw$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS;
	private static SubLList $list37;
	private static SubLSymbol $kw$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS;
	private static SubLList $list39;
	private static SubLObject $const40$significand;
	private static SubLSymbol $sym41$_SIGNIFICAND_DEFINING_MT_;
	private static SubLSymbol $kw$REMOVAL_SIGNIFICAND_POS;
	private static SubLList $list43;
	private static SubLSymbol $kw$REMOVAL_SIGNIFICAND_WITH_MEASURE_POS;
	private static SubLList $list45;
	private static SubLObject $const46$decimalPosition;
	private static SubLSymbol $sym47$_DECIMAL_POSITION_DEFINING_MT_;
	private static SubLSymbol $kw$REMOVAL_DECIMAL_POSITION_POS;
	private static SubLList $list49;
	private static SubLSymbol $kw$REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS;
	private static SubLList $list51;
	private static SubLObject $const52$repeatingEndSequence;
	private static SubLSymbol $sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_;
	private static SubLSymbol $kw$REMOVAL_REPEATING_END_SEQUENCE_POS;
	private static SubLList $list55;
	private static SubLSymbol $kw$REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS;
	private static SubLList $list57;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 5600L)
	public static SubLObject removal_fraction_with_measure_pos_check(SubLObject cycl_input) {
		return isa.isaP(conses_high.second(cycl_input), $const14$UnitOfMeasure, UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 5800L)
	public static SubLObject el_fraction_numerator(SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = mt_relevance_macros.$mt$.getDynamicValue();
		}
		if (NIL != el_utilities.possibly_naut_p(v_term)) {
			if ((NIL != collection_defns.unit_of_measureP(cycl_utilities.naut_functor(v_term), mt))
					&& ((NIL == cycl_utilities.naut_arg2(v_term, UNPROVIDED))
							|| (NIL != czer_utilities.equals_elP(cycl_utilities.naut_arg1(v_term, UNPROVIDED),
									cycl_utilities.naut_arg2(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED,
									UNPROVIDED)))) {
				v_term = cycl_utilities.naut_arg1(v_term, UNPROVIDED);
			}
			if (NIL != cycl_utilities.naut_with_functor_p(v_term, $const15$MixedFractionFn))
				return cycl_utilities.naut_arg2(v_term, UNPROVIDED);
			if (NIL != cycl_utilities.naut_with_functor_p(v_term, $const16$NegativeMixedFractionFn))
				return cycl_utilities.naut_arg2(v_term, UNPROVIDED);
			if (NIL != cycl_utilities.naut_with_functor_p(v_term, $const17$SimpleFractionFn))
				return cycl_utilities.naut_arg1(v_term, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 11200L)
	public static SubLObject el_fraction_denominator(SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = mt_relevance_macros.$mt$.getDynamicValue();
		}
		if (NIL != el_utilities.possibly_naut_p(v_term)) {
			if ((NIL != collection_defns.unit_of_measureP(cycl_utilities.naut_functor(v_term), mt))
					&& ((NIL == cycl_utilities.naut_arg2(v_term, UNPROVIDED))
							|| (NIL != czer_utilities.equals_elP(cycl_utilities.naut_arg1(v_term, UNPROVIDED),
									cycl_utilities.naut_arg2(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED,
									UNPROVIDED)))) {
				v_term = cycl_utilities.naut_arg1(v_term, UNPROVIDED);
			}
			if (NIL != cycl_utilities.naut_with_functor_p(v_term, $const15$MixedFractionFn))
				return cycl_utilities.naut_arg3(v_term, UNPROVIDED);
			if (NIL != cycl_utilities.naut_with_functor_p(v_term, $const16$NegativeMixedFractionFn))
				return cycl_utilities.naut_arg3(v_term, UNPROVIDED);
			if (NIL != cycl_utilities.naut_with_functor_p(v_term, $const17$SimpleFractionFn))
				return cycl_utilities.naut_arg2(v_term, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_fractions_file() {
		declareFunction(myName, "removal_fraction_with_measure_pos_check", "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK", 1,
				0, false);
		declareFunction(myName, "el_fraction_numerator", "EL-FRACTION-NUMERATOR", 1, 1, false);
		declareFunction(myName, "el_fraction_denominator", "EL-FRACTION-DENOMINATOR", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_fractions_file() {
		$numerator_defining_mt$ = deflexical("*NUMERATOR-DEFINING-MT*",
				maybeDefault($sym4$_NUMERATOR_DEFINING_MT_, $numerator_defining_mt$, $const5$UniversalVocabularyMt));
		$denominator_defining_mt$ = deflexical("*DENOMINATOR-DEFINING-MT*", maybeDefault(
				$sym19$_DENOMINATOR_DEFINING_MT_, $denominator_defining_mt$, $const5$UniversalVocabularyMt));
		$whole_in_mixed_fraction_defining_mt$ = deflexical("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*",
				maybeDefault($sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_, $whole_in_mixed_fraction_defining_mt$,
						$const5$UniversalVocabularyMt));
		$fractional_part_in_mixed_fraction_defining_mt$ = deflexical("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*",
				maybeDefault($sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_,
						$fractional_part_in_mixed_fraction_defining_mt$, $const5$UniversalVocabularyMt));
		$significand_defining_mt$ = deflexical("*SIGNIFICAND-DEFINING-MT*", maybeDefault(
				$sym41$_SIGNIFICAND_DEFINING_MT_, $significand_defining_mt$, $const5$UniversalVocabularyMt));
		$decimal_position_defining_mt$ = deflexical("*DECIMAL-POSITION-DEFINING-MT*", maybeDefault(
				$sym47$_DECIMAL_POSITION_DEFINING_MT_, $decimal_position_defining_mt$, $const5$UniversalVocabularyMt));
		$repeating_end_sequence_defining_mt$ = deflexical("*REPEATING-END-SEQUENCE-DEFINING-MT*",
				maybeDefault($sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_, $repeating_end_sequence_defining_mt$,
						$const5$UniversalVocabularyMt));
		return NIL;
	}

	public static SubLObject setup_removal_modules_fractions_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$numerator);
		inference_modules.inference_removal_module_use_generic($const0$numerator, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const0$numerator,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$numerator, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym4$_NUMERATOR_DEFINING_MT_);
		mt_vars.note_mt_var($sym4$_NUMERATOR_DEFINING_MT_, $const0$numerator);
		inference_modules.inference_removal_module($kw$REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS, $list7);
		inference_modules.inference_removal_module($kw$REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS, $list9);
		inference_modules.inference_removal_module($kw$REMOVAL_NUMERATOR_MIXED_FRACTION_POS, $list11);
		inference_modules.inference_removal_module($kw$REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS, $list13);
		inference_modules.register_solely_specific_removal_module_predicate($const18$denominator);
		inference_modules.inference_removal_module_use_generic($const18$denominator, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const18$denominator,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const18$denominator, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym19$_DENOMINATOR_DEFINING_MT_);
		mt_vars.note_mt_var($sym19$_DENOMINATOR_DEFINING_MT_, $const18$denominator);
		inference_modules.inference_removal_module($kw$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS, $list21);
		inference_modules.inference_removal_module($kw$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS, $list23);
		inference_modules.inference_removal_module($kw$REMOVAL_DENOMINATOR_MIXED_FRACTION_POS, $list25);
		inference_modules.inference_removal_module($kw$REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS, $list27);
		inference_modules.register_solely_specific_removal_module_predicate($const28$wholeInMixedFraction);
		inference_modules.inference_removal_module_use_generic($const28$wholeInMixedFraction, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const28$wholeInMixedFraction,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const28$wholeInMixedFraction, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_);
		mt_vars.note_mt_var($sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_, $const28$wholeInMixedFraction);
		inference_modules.inference_removal_module($kw$REMOVAL_WHOLE_IN_MIXED_FRACTION_POS, $list31);
		inference_modules.inference_removal_module($kw$REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS, $list33);
		inference_modules.register_solely_specific_removal_module_predicate($const34$fractionalPartInMixedFraction);
		inference_modules.inference_removal_module_use_generic($const34$fractionalPartInMixedFraction,
				$kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const34$fractionalPartInMixedFraction,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const34$fractionalPartInMixedFraction, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_);
		mt_vars.note_mt_var($sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_,
				$const34$fractionalPartInMixedFraction);
		inference_modules.inference_removal_module($kw$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS, $list37);
		inference_modules.inference_removal_module($kw$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS,
				$list39);
		inference_modules.register_solely_specific_removal_module_predicate($const40$significand);
		inference_modules.inference_removal_module_use_generic($const40$significand, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const40$significand,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const40$significand, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym41$_SIGNIFICAND_DEFINING_MT_);
		mt_vars.note_mt_var($sym41$_SIGNIFICAND_DEFINING_MT_, $const40$significand);
		inference_modules.inference_removal_module($kw$REMOVAL_SIGNIFICAND_POS, $list43);
		inference_modules.inference_removal_module($kw$REMOVAL_SIGNIFICAND_WITH_MEASURE_POS, $list45);
		inference_modules.register_solely_specific_removal_module_predicate($const46$decimalPosition);
		inference_modules.inference_removal_module_use_generic($const46$decimalPosition, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const46$decimalPosition,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const46$decimalPosition, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym47$_DECIMAL_POSITION_DEFINING_MT_);
		mt_vars.note_mt_var($sym47$_DECIMAL_POSITION_DEFINING_MT_, $const46$decimalPosition);
		inference_modules.inference_removal_module($kw$REMOVAL_DECIMAL_POSITION_POS, $list49);
		inference_modules.inference_removal_module($kw$REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS, $list51);
		inference_modules.register_solely_specific_removal_module_predicate($const52$repeatingEndSequence);
		inference_modules.inference_removal_module_use_generic($const52$repeatingEndSequence, $kw$REMOVAL_LOOKUP_POS);
		inference_modules.inference_removal_module_use_meta_removal($const52$repeatingEndSequence,
				$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const52$repeatingEndSequence, ONE_INTEGER);
		subl_macro_promotions.declare_defglobal($sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_);
		mt_vars.note_mt_var($sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_, $const52$repeatingEndSequence);
		inference_modules.inference_removal_module($kw$REMOVAL_REPEATING_END_SEQUENCE_POS, $list55);
		inference_modules.inference_removal_module($kw$REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS, $list57);
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
		me = new removal_modules_fractions();
		$numerator_defining_mt$ = null;
		$denominator_defining_mt$ = null;
		$whole_in_mixed_fraction_defining_mt$ = null;
		$fractional_part_in_mixed_fraction_defining_mt$ = null;
		$significand_defining_mt$ = null;
		$decimal_position_defining_mt$ = null;
		$repeating_end_sequence_defining_mt$ = null;
		$const0$numerator = constant_handles.reader_make_constant_shell(makeString("numerator"));
		$kw$REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");
		$kw$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
		$kw$POS = makeKeyword("POS");
		$sym4$_NUMERATOR_DEFINING_MT_ = makeSymbol("*NUMERATOR-DEFINING-MT*");
		$const5$UniversalVocabularyMt = constant_handles
				.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
		$kw$REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS = makeKeyword("REMOVAL-NUMERATOR-SIMPLE-FRACTION-POS");
		$list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										list(makeKeyword("BIND"), makeSymbol("NUMERATOR")), makeKeyword("ANYTHING"))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("NUMERATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("numerator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$numerator (#$SimpleFractionFn <integer> <integer>) <whatever>)"), makeKeyword("EXAMPLE"),
				makeString(
						"(#$numerator (#$SimpleFractionFn 5 9) 5)\n    (#$numerator (#$SimpleFractionFn 5 9) ?NUM)") });
		$kw$REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-NUMERATOR-SIMPLE-FRACTION-WITH-MEASURE-POS");
		$list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")), list(
								list(makeKeyword("BIND"), makeSymbol("CYCL-FUNCTION")),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										list(makeKeyword("BIND"), makeSymbol("NUMERATOR")), makeKeyword("ANYTHING")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("NUMERATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("numerator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$numerator (<unit of measure> (#$SimpleFractionFn <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$numerator (#$Inch (#$SimpleFractionFn 5 9)) 5)\n    (#$numerator (#$Inch (#$SimpleFractionFn 5 9)) ?NUM)") });
		$kw$REMOVAL_NUMERATOR_MIXED_FRACTION_POS = makeKeyword("REMOVAL-NUMERATOR-MIXED-FRACTION-POS");
		$list11 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NUMERATOR")),
										makeKeyword("ANYTHING"))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("NUMERATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("numerator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$numerator (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$numerator (#$MixedFractionFn 3 5 9) 5)\n    (#$numerator (#$MixedFractionFn 3 5 9) ?NUM)") });
		$kw$REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-NUMERATOR-MIXED-FRACTION-WITH-MEASURE-POS");
		$list13 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("numerator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("numerator")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")), list(
								list(makeKeyword("BIND"), makeSymbol("CYCL-FUNCTION")),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NUMERATOR")),
										makeKeyword("ANYTHING")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("NUMERATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("numerator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUMERATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*NUMERATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$numerator (<unit of measure> (#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$numerator (#$Inch (#$MixedFractionFn 3 5 9)) 5)\n    (#$numerator (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });
		$const14$UnitOfMeasure = constant_handles.reader_make_constant_shell(makeString("UnitOfMeasure"));
		$const15$MixedFractionFn = constant_handles.reader_make_constant_shell(makeString("MixedFractionFn"));
		$const16$NegativeMixedFractionFn = constant_handles
				.reader_make_constant_shell(makeString("NegativeMixedFractionFn"));
		$const17$SimpleFractionFn = constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn"));
		$const18$denominator = constant_handles.reader_make_constant_shell(makeString("denominator"));
		$sym19$_DENOMINATOR_DEFINING_MT_ = makeSymbol("*DENOMINATOR-DEFINING-MT*");
		$kw$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS = makeKeyword("REMOVAL-DENOMINATOR-SIMPLE-FRACTION-POS");
		$list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("denominator")),
						list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("denominator")),
						ConsesLow.list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DENOMINATOR")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("DENOMINATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("denominator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$denominator (#$SimpleFractionFn <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$denominator (#$SimpleFractionFn 5 9) 9)\n    (#$denominator (#$SimpleFractionFn 5 9) ?NUM)") });
		$kw$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-DENOMINATOR-SIMPLE-FRACTION-WITH-MEASURE-POS");
		$list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("denominator")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("denominator")),
								list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
										list(list(makeKeyword("BIND"), makeSymbol("CYCL-FUNCTION")),
												list(constant_handles.reader_make_constant_shell(
														makeString("SimpleFractionFn")), makeKeyword("ANYTHING"),
														list(makeKeyword("BIND"), makeSymbol("DENOMINATOR"))))),
								makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("DENOMINATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("denominator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$denominator (<unit of measure> (#$SimpleFractionFn <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$denominator (#$Inch (#$SimpleFractionFn 5 9)) 9)\n    (#$denominator (#$Inch (#$SimpleFractionFn 5 9)) ?NUM)") });
		$kw$REMOVAL_DENOMINATOR_MIXED_FRACTION_POS = makeKeyword("REMOVAL-DENOMINATOR-MIXED-FRACTION-POS");
		$list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("denominator")),
						list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("denominator")),
								list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												makeKeyword("ANYTHING"), makeKeyword("ANYTHING"),
												list(makeKeyword("BIND"), makeSymbol("DENOMINATOR")))),
								makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("DENOMINATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("denominator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$denominator (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$denominator (#$MixedFractionFn 3 5 9) 9)\n    (#$denominator (#$MixedFractionFn 3 5 9) ?NUM)") });
		$kw$REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-DENOMINATOR-MIXED-FRACTION-WITH-MEASURE-POS");
		$list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("denominator")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("denominator")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("denominator")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(list(makeKeyword("BIND"), makeSymbol("CYCL-FUNCTION")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												makeKeyword("ANYTHING"), makeKeyword("ANYTHING"),
												list(makeKeyword("BIND"), makeSymbol("DENOMINATOR"))))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("DENOMINATOR")),
						list(constant_handles.reader_make_constant_shell(makeString("denominator")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("DENOMINATOR")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOMINATOR-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$denominator (<unit of measure> (#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$denominator (#$Inch (#$MixedFractionFn 3 5 9)) 9)\n    (#$denominator (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });
		$const28$wholeInMixedFraction = constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction"));
		$sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_ = makeSymbol("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*");
		$kw$REMOVAL_WHOLE_IN_MIXED_FRACTION_POS = makeKeyword("REMOVAL-WHOLE-IN-MIXED-FRACTION-POS");
		$list31 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
						list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
								list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												list(makeKeyword("BIND"), makeSymbol("WHOLE")), makeKeyword("ANYTHING"),
												makeKeyword("ANYTHING"))),
								makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("WHOLE")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("WHOLE")),
						list(constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("WHOLE")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString("(#$wholeInMixedFraction (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$wholeInMixedFraction (#$MixedFractionFn 3 5 9) 3)\n    (#$wholeInMixedFraction (#$MixedFractionFn 3 5 9) ?NUM)") });
		$kw$REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-WHOLE-IN-MIXED-FRACTION-WITH-MEASURE-POS");
		$list33 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(list(makeKeyword("BIND"), makeSymbol("CYCL-FUNCTION")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												list(makeKeyword("BIND"), makeSymbol("WHOLE")), makeKeyword("ANYTHING"),
												makeKeyword("ANYTHING")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("WHOLE")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("WHOLE")),
						list(constant_handles.reader_make_constant_shell(makeString("wholeInMixedFraction")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("WHOLE")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$wholeInMixedFraction (<unit of measure>(#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$wholeInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) 3)\n    (#$wholeInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });
		$const34$fractionalPartInMixedFraction = constant_handles
				.reader_make_constant_shell(makeString("fractionalPartInMixedFraction"));
		$sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_ = makeSymbol(
				"*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*");
		$kw$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS = makeKeyword(
				"REMOVAL-FRACTIONAL-PART-IN-MIXED-FRACTION-POS");
		$list37 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
						list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
								list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NUM")),
												list(makeKeyword("BIND"), makeSymbol("DEN")))),
								makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUM")),
								list(makeKeyword("VALUE"), makeSymbol("DEN")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("NUM"), makeSymbol("DEN")),
						list(constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										list(makeKeyword("VALUE"), makeSymbol("NUM")),
										list(makeKeyword("VALUE"), makeSymbol("DEN"))))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$fractionalPartInMixedFraction (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$fractionalPartInMixedFraction (#$MixedFractionFn 3 5 9) (#$SimpleFractionFn 5 9))\n    (#$fractionalPartInMixedFraction (#$MixedFractionFn 3 5 9) ?NUM)") });
		$kw$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-FRACTIONAL-PART-IN-MIXED-FRACTION-WITH-MEASURE-POS");
		$list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(list(makeKeyword("BIND"), makeSymbol("CYCL-FUNCTION")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NUM")),
												list(makeKeyword("BIND"), makeSymbol("DEN"))))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYCL-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("NUM")),
								list(makeKeyword("VALUE"), makeSymbol("DEN")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYCL-FUNCTION"), makeSymbol("NUM"), makeSymbol("DEN")),
						list(constant_handles.reader_make_constant_shell(makeString("fractionalPartInMixedFraction")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										list(makeKeyword("VALUE"), makeSymbol("NUM")),
										list(makeKeyword("VALUE"), makeSymbol("DEN"))))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$fractionalPartInMixedFraction (<unit of measure>(#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$fractionalPartInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) (#$SimpleFractionFn 5 9))\n    (#$fractionalPartInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)") });
		$const40$significand = constant_handles.reader_make_constant_shell(makeString("significand"));
		$sym41$_SIGNIFICAND_DEFINING_MT_ = makeSymbol("*SIGNIFICAND-DEFINING-MT*");
		$kw$REMOVAL_SIGNIFICAND_POS = makeKeyword("REMOVAL-SIGNIFICAND-POS");
		$list43 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("significand")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("significand")),
						list(makeKeyword("OR"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER")),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("significand")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								listS(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										list(makeKeyword("BIND"), makeSymbol("SIGNIFICAND")), makeKeyword("ANYTHING"))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("SIGNIFICAND")),
						list(constant_handles.reader_make_constant_shell(makeString("significand")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*SIGNIFICAND-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$significand (#$DecimalFractionFn <integer> <integer>) <whatever>)\n    (#$significand (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$significand (#$DecimalFractionFn     125 2)       125)\n    (#$significand (#$DecimalFractionFn     125 2)      ?NUM)\n    (#$significand (#$DecimalFractionFn 3142857 6 6) 3142857)\n    (#$significand (#$DecimalFractionFn 3142857 6 6)    ?NUM)") });
		$kw$REMOVAL_SIGNIFICAND_WITH_MEASURE_POS = makeKeyword("REMOVAL-SIGNIFICAND-WITH-MEASURE-POS");
		$list45 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("significand")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("significand")), list(makeKeyword("OR"),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("significand")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")), list(
								list(makeKeyword("BIND"), makeSymbol("CYC-FUNCTION")),
								listS(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										list(makeKeyword("BIND"), makeSymbol("SIGNIFICAND")),
										makeKeyword("ANYTHING")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYC-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYC-FUNCTION"), makeSymbol("SIGNIFICAND")),
						list(constant_handles.reader_make_constant_shell(makeString("significand")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("SIGNIFICAND")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*SIGNIFICAND-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$significand (<unit of measure> (#$DecimalFractionFn <integer> <integer>)) <whatever>)\n    (#$significand (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$significand (#$Inch (#$DecimalFractionFn     125 2))       125)\n    (#$significand (#$Inch (#$DecimalFractionFn     125 2))      ?NUM)\n    (#$significand (#$Inch (#$DecimalFractionFn 3142857 6 6)) 3142857)\n    (#$significand (#$Inch (#$DecimalFractionFn 3142857 6 6))    ?NUM)") });
		$const46$decimalPosition = constant_handles.reader_make_constant_shell(makeString("decimalPosition"));
		$sym47$_DECIMAL_POSITION_DEFINING_MT_ = makeSymbol("*DECIMAL-POSITION-DEFINING-MT*");
		$kw$REMOVAL_DECIMAL_POSITION_POS = makeKeyword("REMOVAL-DECIMAL-POSITION-POS");
		$list49 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
						list(makeKeyword("OR"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER")),
								list(constant_handles
										.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								listS(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("POSITION")),
										makeKeyword("ANYTHING"))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("POSITION")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("POSITION")),
						list(constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("POSITION")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DECIMAL-POSITION-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$decimalPosition (#$DecimalFractionFn <integer> <integer>) <whatever>)\n    (#$decimalPosition (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$decimalPosition (#$DecimalFractionFn     125 2)      2)\n    (#$decimalPosition (#$DecimalFractionFn     125 2)   ?NUM)\n    (#$decimalPosition (#$DecimalFractionFn 3142857 6 6)    6)\n    (#$decimalPosition (#$DecimalFractionFn 3142857 6 6) ?NUM)") });
		$kw$REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS = makeKeyword("REMOVAL-DECIMAL-POSITION-WITH-MEASURE-POS");
		$list51 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("decimalPosition")), list(makeKeyword("OR"),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")), list(
								list(makeKeyword("BIND"), makeSymbol("CYC-FUNCTION")),
								listS(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("POSITION")),
										makeKeyword("ANYTHING")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYC-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("POSITION")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYC-FUNCTION"), makeSymbol("POSITION")),
						list(constant_handles.reader_make_constant_shell(makeString("decimalPosition")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("POSITION")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*DECIMAL-POSITION-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$decimalPosition (<unit of measure> (#$DecimalFractionFn <integer> <integer>)) <whatever>)\n    (#$decimalPosition (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$decimalPosition (#$Inch (#$DecimalFractionFn     125 2))      2)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn     125 2))   ?NUM)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn 3142857 6 6))    6)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn 3142857 6 6)) ?NUM)") });
		$const52$repeatingEndSequence = constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence"));
		$sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_ = makeSymbol("*REPEATING-END-SEQUENCE-DEFINING-MT*");
		$kw$REMOVAL_REPEATING_END_SEQUENCE_POS = makeKeyword("REMOVAL-REPEATING-END-SEQUENCE-POS");
		$list55 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
						list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
								makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("ANYTHING"), makeKeyword("ANYTHING"),
										list(makeKeyword("BIND"), makeSymbol("REPEAT")))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("REPEAT")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("FRACTION"), makeSymbol("REPEAT")),
						list(constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("REPEAT")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*REPEATING-END-SEQUENCE-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$repeatingEndSequence (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$repeatingEndSequence (#$DecimalFractionFn 3142857 6 6)    6)\n    (#$repeatingEndSequence (#$DecimalFractionFn 3142857 6 6) ?NUM)") });
		$kw$REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS = makeKeyword(
				"REMOVAL-REPEATING-END-SEQUENCE-WITH-MEASURE-POS");
		$list57 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
						list(makeKeyword("ANYTHING"),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("INTEGER"), makeKeyword("INTEGER"), makeKeyword("INTEGER"))),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(
						constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
						list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("FRACTION")), list(
								list(makeKeyword("BIND"), makeSymbol("CYC-FUNCTION")),
								list(constant_handles.reader_make_constant_shell(makeString("DecimalFractionFn")),
										makeKeyword("ANYTHING"), makeKeyword("ANYTHING"),
										list(makeKeyword("BIND"), makeSymbol("REPEAT"))))),
						makeKeyword("ANYTHING")),
						list(list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("CYC-FUNCTION")),
								list(makeKeyword("VALUE"), makeSymbol("REPEAT")))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("TUPLE"),
						list(makeSymbol("FRACTION"), makeSymbol("CYC-FUNCTION"), makeSymbol("REPEAT")),
						list(constant_handles.reader_make_constant_shell(makeString("repeatingEndSequence")),
								list(makeKeyword("VALUE"), makeSymbol("FRACTION")),
								list(makeKeyword("VALUE"), makeSymbol("REPEAT")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeSymbol("*REPEATING-END-SEQUENCE-DEFINING-MT*"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$repeatingEndSequence (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$repeatingEndSequence (#$Inch (#$DecimalFractionFn 3142857 6 6))    6)\n    (#$repeatingEndSequence (#$Inch (#$DecimalFractionFn 3142857 6 6)) ?NUM)") });
	}
}
/*
 *
 * Total time: 258 ms
 *
 */