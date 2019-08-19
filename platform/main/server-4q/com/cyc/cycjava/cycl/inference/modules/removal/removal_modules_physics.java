package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_physics extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics";
	public static String myFingerPrint = "8b9f51f4fdcaa3b9a6024ba4df93da10bb10782dce68519eec8b6a838e86c7c6";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 2600L)
	private static SubLSymbol $default_type_has_boiling_point_temperature_and_pressure_cost$;
	private static SubLObject $const0$antoineEquationParametersForTypeA;
	private static SubLSymbol $kw$GAF;
	private static SubLSymbol $sym2$_EXIT;
	private static SubLObject $const3$DegreeCelsius;
	private static SubLList $list4;
	private static SubLObject $const5$antoineEquationParametersForTypeA;
	private static SubLObject $const6$MM_Hg;
	private static SubLObject $const7$typeHasBoilingPoint_TemperatureAt;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE;
	private static SubLList $list10;
	private static SubLSymbol $kw$REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE;
	private static SubLList $list12;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLSymbol $kw$REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE;
	private static SubLList $list15;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 900L)
	public static SubLObject antoine_equation_constants_for_temperature_of_liquid(SubLObject liquid,
			SubLObject temperature) {
		SubLObject pred_var = $const0$antoineEquationParametersForTypeA;
		if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(liquid, ONE_INTEGER, pred_var)) {
			SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(liquid, ONE_INTEGER,
					pred_var);
			SubLObject done_var = NIL;
			SubLObject token_var = NIL;
			while (NIL == done_var) {
				SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var,
						token_var);
				SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
				if (NIL != valid) {
					SubLObject final_index_iterator = NIL;
					try {
						final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw$GAF,
								NIL, NIL);
						SubLObject done_var_$1 = NIL;
						SubLObject token_var_$2 = NIL;
						while (NIL == done_var_$1) {
							SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator,
									token_var_$2);
							SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
							if (NIL != valid_$3) {
								SubLObject temperature_interval = assertions_high.gaf_arg5(ass);
								if (NIL != quantities.cyc_quantity_subsumes(temperature_interval, temperature))
									return list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass),
											assertions_high.gaf_arg4(ass));
							}
							done_var_$1 = makeBoolean(NIL == valid_$3);
						}
					} finally {
						SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
						try {
							Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
							SubLObject _values = Values.getValuesAsVector();
							if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							}
							Values.restoreValuesFromVector(_values);
						} finally {
							Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
				done_var = makeBoolean(NIL == valid);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 1300L)
	public static SubLObject boiling_point_temperature_to_pressure(SubLObject liquid, SubLObject temperature) {
		SubLObject constants = antoine_equation_constants_for_temperature_of_liquid(liquid, temperature);
		SubLObject temperature_in_celsius = quantities.convert_to_units_absolute($const3$DegreeCelsius,
				temperature.first(), conses_high.second(temperature), UNPROVIDED);
		if (NIL != constants) {
			SubLObject current;
			SubLObject datum = current = constants;
			SubLObject a = NIL;
			SubLObject b = NIL;
			SubLObject c = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			a = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			b = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			c = current.first();
			current = current.rest();
			if (NIL == current)
				return Numbers.expt(TEN_INTEGER,
						Numbers.subtract(a, Numbers.divide(b, Numbers.add(c, temperature_in_celsius))));
			cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 1700L)
	public static SubLObject antoine_equation_constants_for_pressure_of_liquid(SubLObject liquid, SubLObject pressure) {
		SubLObject pred_var = $const5$antoineEquationParametersForTypeA;
		if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(liquid, ONE_INTEGER, pred_var)) {
			SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(liquid, ONE_INTEGER,
					pred_var);
			SubLObject done_var = NIL;
			SubLObject token_var = NIL;
			while (NIL == done_var) {
				SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var,
						token_var);
				SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
				if (NIL != valid) {
					SubLObject final_index_iterator = NIL;
					try {
						final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw$GAF,
								NIL, NIL);
						SubLObject done_var_$4 = NIL;
						SubLObject token_var_$5 = NIL;
						while (NIL == done_var_$4) {
							SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator,
									token_var_$5);
							SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
							if (NIL != valid_$6) {
								SubLObject pressure_interval = assertions_high.gaf_arg5(ass);
								if (NIL != quantities.cyc_quantity_subsumes(pressure_interval, pressure))
									return list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass),
											assertions_high.gaf_arg4(ass));
							}
							done_var_$4 = makeBoolean(NIL == valid_$6);
						}
					} finally {
						SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
						try {
							Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
							SubLObject _values = Values.getValuesAsVector();
							if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							}
							Values.restoreValuesFromVector(_values);
						} finally {
							Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
				done_var = makeBoolean(NIL == valid);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 2200L)
	public static SubLObject boiling_point_pressure_to_temperature(SubLObject liquid, SubLObject pressure) {
		SubLObject constants = antoine_equation_constants_for_pressure_of_liquid(liquid, pressure);
		SubLObject pressure_in_mmhg = quantities.convert_to_units_absolute($const6$MM_Hg, pressure.first(),
				conses_high.second(pressure), UNPROVIDED);
		if (NIL != constants) {
			SubLObject current;
			SubLObject datum = current = constants;
			SubLObject a = NIL;
			SubLObject b = NIL;
			SubLObject c = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			a = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			b = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
			c = current.first();
			current = current.rest();
			if (NIL == current)
				return Numbers.subtract(
						Numbers.divide(b, Numbers.subtract(a, Numbers.log(pressure_in_mmhg, TEN_INTEGER))), c);
			cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 4000L)
	public static SubLObject removal_type_has_boiling_point_temperature_at_pressure_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject substance_type = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject temperature = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject pressure_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject pressure_in_mm_hg = boiling_point_temperature_to_pressure(substance_type, temperature);
		if (pressure_in_mm_hg.isNumber()) {
			SubLObject pressure = el_utilities.make_unary_formula($const6$MM_Hg, pressure_in_mm_hg);
			SubLObject v_bindings = quantities.term_unify_with_units(pressure_arg, pressure);
			if (NIL != v_bindings) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						list($const7$typeHasBoilingPoint_TemperatureAt, substance_type, temperature, pressure),
						UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 5500L)
	public static SubLObject removal_type_has_boiling_point_pressure_at_temperature_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject substance_type = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject pressure = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject temperature_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject temperature_in_celsius = boiling_point_pressure_to_temperature(substance_type, pressure);
		if (temperature_in_celsius.isNumber()) {
			SubLObject temperature = el_utilities.make_unary_formula($const3$DegreeCelsius, temperature_in_celsius);
			SubLObject v_bindings = quantities.term_unify_with_units(temperature_arg, temperature);
			if (NIL != v_bindings) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						list($const7$typeHasBoilingPoint_TemperatureAt, substance_type, temperature, pressure),
						UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_physics_file() {
		declareFunction(myName, "antoine_equation_constants_for_temperature_of_liquid",
				"ANTOINE-EQUATION-CONSTANTS-FOR-TEMPERATURE-OF-LIQUID", 2, 0, false);
		declareFunction(myName, "boiling_point_temperature_to_pressure", "BOILING-POINT-TEMPERATURE-TO-PRESSURE", 2, 0,
				false);
		declareFunction(myName, "antoine_equation_constants_for_pressure_of_liquid",
				"ANTOINE-EQUATION-CONSTANTS-FOR-PRESSURE-OF-LIQUID", 2, 0, false);
		declareFunction(myName, "boiling_point_pressure_to_temperature", "BOILING-POINT-PRESSURE-TO-TEMPERATURE", 2, 0,
				false);
		declareFunction(myName, "removal_type_has_boiling_point_temperature_at_pressure_expand",
				"REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_type_has_boiling_point_pressure_at_temperature_expand",
				"REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE-EXPAND", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_physics_file() {
		$default_type_has_boiling_point_temperature_and_pressure_cost$ = defparameter(
				"*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*",
				control_vars.$typical_hl_module_check_cost$.getGlobalValue());
		return NIL;
	}

	public static SubLObject setup_removal_modules_physics_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const7$typeHasBoilingPoint_TemperatureAt);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const7$typeHasBoilingPoint_TemperatureAt, ONE_INTEGER);
		preference_modules.inference_preference_module($kw$TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE,
				$list10);
		inference_modules.inference_removal_module($kw$REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE, $list12);
		inference_modules.inference_removal_module($kw$REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE, $list15);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_physics_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_physics_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_physics_file();
	}

	static {
		me = new removal_modules_physics();
		$default_type_has_boiling_point_temperature_and_pressure_cost$ = null;
		$const0$antoineEquationParametersForTypeA = constant_handles
				.reader_make_constant_shell(makeString("antoineEquationParametersForTypeAndInterval"));
		$kw$GAF = makeKeyword("GAF");
		$sym2$_EXIT = makeSymbol("%EXIT");
		$const3$DegreeCelsius = constant_handles.reader_make_constant_shell(makeString("DegreeCelsius"));
		$list4 = list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"));
		$const5$antoineEquationParametersForTypeA = constant_handles
				.reader_make_constant_shell(makeString("antoineEquationParametersForTypeAndPressureInterval"));
		$const6$MM_Hg = constant_handles.reader_make_constant_shell(makeString("MM-Hg"));
		$const7$typeHasBoilingPoint_TemperatureAt = constant_handles
				.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure"));
		$kw$POS = makeKeyword("POS");
		$kw$TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE = makeKeyword(
				"TYPE-HAS-BOILING-POINT-EITHER-ARG2-OR-ARG3-BINDABLE");
		$list10 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")),
				makeKeyword("REQUIRED-PATTERN"),
				listS(constant_handles
						.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")),
						makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG2-OR-ARG3"));
		$kw$REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE = makeKeyword(
				"REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE");
		$list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"),
				makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> <fully-bound-p> ?PRESSURE)"),
				makeKeyword("EXAMPLE"),
				makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water (#$DegreeCelsius 100) ?PRESSURE)") });
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$kw$REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE = makeKeyword(
				"REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE");
		$list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"),
				makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> ?TEMPERATURE <fully-bound-p>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$typeHasBoilingPoint-TemperatureAtPressure #$Water ?TEMPERATURE (#$Atmosphere-UnitOfPressure 1))") });
	}
}
/*
 *
 * Total time: 126 ms
 *
 */