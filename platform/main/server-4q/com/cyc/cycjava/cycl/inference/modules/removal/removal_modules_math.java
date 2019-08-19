package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_math extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math";
	public static String myFingerPrint = "6cd63cf6ff87581a938838c5c29c78f0502960e9c51c9fce9949bb35f89c08f5";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 1000L)
	public static SubLSymbol $default_math_module_cost$;
	private static SubLObject $const0$interpolationWithCubicSpline;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_INTERPOLATION_WITH_CUBIC_SPLINE;
	private static SubLList $list3;
	private static SubLSymbol $sym4$JAVA_LINK_X_Y_CUBIC_SPLINE_FIND_Y_FOR_X;
	private static SubLObject $const5$interpolationWithPiecewiseLinearP;
	private static SubLSymbol $kw$REMOVAL_INTERPOLATION_WITH_PIECEWISE_LINEAR_POLYNOMIAL;
	private static SubLList $list7;
	private static SubLSymbol $sym8$JAVA_LINK_X_Y_PIECEWISE_LINEAR_FIND_Y_FOR_X;
	private static SubLObject $const9$extrapolationWithSimpleLinearRegr;
	private static SubLSymbol $kw$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION;
	private static SubLList $list11;
	private static SubLSymbol $sym12$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X;
	private static SubLSymbol $sym13$EL_2D_POINT_P;
	private static SubLList $list14;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLSymbol $sym16$NREVERSE;
	private static SubLObject $const17$extrapolationWithSimpleLinearRegr;
	private static SubLSymbol $kw$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION_WITH_ERROR_BA;
	private static SubLList $list19;
	private static SubLSymbol $sym20$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X_WITH_ERROR_BARS;
	private static SubLObject $const21$regressionLinesForSetsIntersectAt;
	private static SubLSymbol $kw$REMOVAL_REGRESSION_LINES_FOR_SETS_INTERSECT_AT_POINT;
	private static SubLList $list23;
	private static SubLObject $const24$The2DPoint;
	private static SubLObject $const25$slopeOfRegressionLineForSetOfPoin;
	private static SubLSymbol $kw$REMOVAL_SLOPE_OF_REGRESSION_LINE_FOR_SET_OF_POINTS;
	private static SubLList $list27;
	private static SubLObject $const28$setOfFirstDerivativePointsBasedOn;
	private static SubLSymbol $kw$REMOVAL_SET_OF_FIRST_DERIVATIVE_POINTS_BASED_ON_SET_OF_POINTS;
	private static SubLList $list30;
	private static SubLObject $const31$setHasPointsWithYValueRelnToMatch;
	private static SubLSymbol $kw$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO_MATCHING_X_VALUE_POIN;
	private static SubLList $list33;
	private static SubLSymbol $sym34$FIRST;
	private static SubLString $str35$org_apache_commons_math_stat_regr;
	private static SubLString $str36$addData;
	private static SubLString $str37$double;
	private static SubLString $str38$getSlope;
	private static SubLString $str39$getIntercept;
	private static SubLSymbol $sym40$MIN;
	private static SubLSymbol $sym41$MAX;
	private static SubLString $str42$org_apache_commons_math_analysis_;
	private static SubLString $str43$interpolate;
	private static SubLString $str44$_D;
	private static SubLString $str45$org_apache_commons_math_analysis_;
	private static SubLString $str46$value;
	private static SubLSymbol $sym47$_;
	private static SubLSymbol $sym48$SECOND;
	private static SubLString $str49$org_apache_commons_math_analysis_;
	private static SubLString $str50$predict;
	private static SubLString $str51$getSumSquaredErrors;
	private static SubLString $str52$org_apache_commons_math_geometry_;
	private static SubLString $str53$org_apache_commons_math_geometry_;
	private static SubLString $str54$intersection;
	private static SubLString $str55$org_apache_commons_math_geometry_;
	private static SubLString $str56$getX;
	private static SubLString $str57$getY;
	private static SubLObject $const58$CubicSpline;
	private static SubLObject $const59$LinearPolynomialFunction_Piecewis;
	private static SubLString $str60$derivative;
	private static SubLSymbol $sym61$NON_DOTTED_LIST_P;
	private static SubLObject $const62$setHasPointsWithYValueRelnTo;
	private static SubLSymbol $kw$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO;
	private static SubLList $list64;
	private static SubLObject $const65$operationResultComparison;
	private static SubLSymbol $kw$NEG;
	private static SubLSymbol $kw$REMOVAL_OPERATION_RESULT_COMPARISON_POS_CHECK;
	private static SubLList $list68;
	private static SubLSymbol $kw$REMOVAL_OPERATION_RESULT_COMPARISON_NEG_CHECK;
	private static SubLList $list70;
	private static SubLObject $const71$inflowLengthsWithStartingDepths;
	private static SubLSymbol $kw$REMOVAL_INFLOW_LENGTHS_WITH_STARTING_DEPTHS;
	private static SubLList $list73;
	private static SubLObject $const74$Meter;
	private static SubLObject $const75$DegreeCelsius;
	private static SubLString $str76$____;
	private static SubLList $list77;
	private static SubLString $str78$High_value__x__A_y__A__;
	private static SubLList $list79;
	private static SubLString $str80$checking_x__A_deriv__A__;
	private static SubLString $str81$Bad_looping;
	private static SubLFloat $float82$0_5;
	private static SubLFloat $float83$_0_5;
	private static SubLString $str84$Got_interval___A__A___;
	private static SubLSymbol $sym85$_;
	private static SubLString $str86$inflow_lengths___A__;
	private static SubLList $list87;
	private static SubLString $str88$merged_inflow_lengths___A__;
	private static SubLObject $const89$TheList;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 2700L)
	public static SubLObject removal_interpolation_with_cubic_spline_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		return removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(asent,
				$sym4$JAVA_LINK_X_Y_CUBIC_SPLINE_FIND_Y_FOR_X);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 4700L)
	public static SubLObject removal_interpolation_with_piecewise_linear_polynomial_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		return removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(asent,
				$sym8$JAVA_LINK_X_Y_PIECEWISE_LINEAR_FIND_Y_FOR_X);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 6700L)
	public static SubLObject removal_extrapolation_with_simple_linear_regression_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		return removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(asent,
				$sym12$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 6900L)
	public static SubLObject removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(
			SubLObject asent, SubLObject java_link_function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject query_point = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if (NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
			SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
			if ((NIL != v_2d_points)
					&& (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points, UNPROVIDED))) {
				thread.resetMultipleValues();
				SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, UNPROVIDED, UNPROVIDED);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				if ((NIL != x_y_values) && (NIL != x_units) && (NIL != y_units)) {
					SubLObject current;
					SubLObject datum = current = query_point;
					SubLObject the_2d_point = NIL;
					SubLObject query_x_value_with_units = NIL;
					SubLObject query_y_value_with_units = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
					the_2d_point = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
					query_x_value_with_units = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
					query_y_value_with_units = current.first();
					current = current.rest();
					if (NIL == current) {
						if (NIL != variables.not_fully_bound_p(query_y_value_with_units)) {
							thread.resetMultipleValues();
							SubLObject query_x_units = quantities.explode_interval(query_x_value_with_units);
							SubLObject query_x_value = thread.secondMultipleValue();
							thread.resetMultipleValues();
							SubLObject normalized_query_x_value = quantities.convert_to_units_absolute(x_units,
									query_x_units, query_x_value, UNPROVIDED);
							SubLObject answer_y_value = Functions.funcall(java_link_function, x_y_values,
									normalized_query_x_value);
							if (NIL != answer_y_value) {
								SubLObject answer_y_value_with_units = quantities.make_interval(y_units, answer_y_value,
										UNPROVIDED);
								SubLObject v_bindings = quantities.term_unify_with_units(query_y_value_with_units,
										answer_y_value_with_units);
								backward.removal_add_node(
										arguments.make_hl_support($kw$OPAQUE,
												bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED),
										v_bindings, UNPROVIDED);
							}
						} else {
							SubLObject y_x_values = Mapping.mapcar($sym16$NREVERSE, x_y_values);
							thread.resetMultipleValues();
							SubLObject query_y_units = quantities.explode_interval(query_y_value_with_units);
							SubLObject query_y_value = thread.secondMultipleValue();
							thread.resetMultipleValues();
							SubLObject normalized_query_y_value = quantities.convert_to_units_absolute(y_units,
									query_y_units, query_y_value, UNPROVIDED);
							SubLObject answer_x_value = Functions.funcall(java_link_function, y_x_values,
									normalized_query_y_value);
							if (NIL != answer_x_value) {
								SubLObject answer_x_value_with_units = quantities.make_interval(x_units, answer_x_value,
										UNPROVIDED);
								SubLObject v_bindings2 = quantities.term_unify_with_units(query_x_value_with_units,
										answer_x_value_with_units);
								backward.removal_add_node(
										arguments.make_hl_support($kw$OPAQUE,
												bindings.apply_bindings(v_bindings2, asent), UNPROVIDED, UNPROVIDED),
										v_bindings2, UNPROVIDED);
							}
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
					}
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 10900L)
	public static SubLObject removal_extrapolation_with_simple_linear_regression_with_error_bars_expand(
			SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		return removal_interpolation_or_extrapolation_with_error_bars_with_java_link_function_expand_helper(asent,
				$sym20$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X_WITH_ERROR_BARS);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 11200L)
	public static SubLObject removal_interpolation_or_extrapolation_with_error_bars_with_java_link_function_expand_helper(
			SubLObject asent, SubLObject java_link_function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject query_point = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject query_error_with_units = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		if (NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
			SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
			if ((NIL != v_2d_points)
					&& (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points, UNPROVIDED))) {
				thread.resetMultipleValues();
				SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, UNPROVIDED, UNPROVIDED);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				if ((NIL != x_y_values) && (NIL != x_units) && (NIL != y_units)) {
					SubLObject current;
					SubLObject datum = current = query_point;
					SubLObject the_2d_point = NIL;
					SubLObject query_x_value_with_units = NIL;
					SubLObject query_y_value_with_units = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
					the_2d_point = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
					query_x_value_with_units = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
					query_y_value_with_units = current.first();
					current = current.rest();
					if (NIL == current) {
						if (NIL != variables.not_fully_bound_p(query_y_value_with_units)) {
							thread.resetMultipleValues();
							SubLObject query_x_units = quantities.explode_interval(query_x_value_with_units);
							SubLObject query_x_value = thread.secondMultipleValue();
							thread.resetMultipleValues();
							SubLObject normalized_query_x_value = quantities.convert_to_units_absolute(x_units,
									query_x_units, query_x_value, UNPROVIDED);
							thread.resetMultipleValues();
							SubLObject answer_y_value = Functions.funcall(java_link_function, x_y_values,
									normalized_query_x_value);
							SubLObject answer_y_error = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if ((NIL != answer_y_value) && (NIL != answer_y_error)) {
								SubLObject answer_y_value_with_units = quantities.make_interval(y_units, answer_y_value,
										UNPROVIDED);
								SubLObject answer_y_error_with_units = quantities.make_interval(y_units, answer_y_error,
										UNPROVIDED);
								SubLObject v_bindings = append(
										quantities.term_unify_with_units(query_y_value_with_units,
												answer_y_value_with_units),
										quantities.term_unify_with_units(query_error_with_units,
												answer_y_error_with_units));
								backward.removal_add_node(
										arguments.make_hl_support($kw$OPAQUE,
												bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED),
										v_bindings, UNPROVIDED);
							}
						} else {
							SubLObject y_x_values = Mapping.mapcar($sym16$NREVERSE, x_y_values);
							thread.resetMultipleValues();
							SubLObject query_y_units = quantities.explode_interval(query_y_value_with_units);
							SubLObject query_y_value = thread.secondMultipleValue();
							thread.resetMultipleValues();
							SubLObject normalized_query_y_value = quantities.convert_to_units_absolute(y_units,
									query_y_units, query_y_value, UNPROVIDED);
							thread.resetMultipleValues();
							SubLObject answer_x_value = Functions.funcall(java_link_function, y_x_values,
									normalized_query_y_value);
							SubLObject answer_x_error = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if ((NIL != answer_x_value) && (NIL != answer_x_error)) {
								SubLObject answer_x_value_with_units = quantities.make_interval(x_units, answer_x_value,
										UNPROVIDED);
								SubLObject answer_x_error_with_units = quantities.make_interval(x_units, answer_x_error,
										UNPROVIDED);
								SubLObject v_bindings2 = append(
										quantities.term_unify_with_units(query_x_value_with_units,
												answer_x_value_with_units),
										quantities.term_unify_with_units(query_error_with_units,
												answer_x_error_with_units));
								backward.removal_add_node(
										arguments.make_hl_support($kw$OPAQUE,
												bindings.apply_bindings(v_bindings2, asent), UNPROVIDED, UNPROVIDED),
										v_bindings2, UNPROVIDED);
							}
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
					}
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 15400L)
	public static SubLObject removal_regression_lines_for_sets_intersect_at_point_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_of_points_in_units_1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject set_of_points_in_units_2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject query_point = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		if ((NIL != el_utilities.el_extensional_set_p(set_of_points_in_units_1))
				&& (NIL != el_utilities.el_extensional_set_p(set_of_points_in_units_2))) {
			SubLObject v_2d_points_1 = el_utilities.extensional_set_elements(set_of_points_in_units_1);
			SubLObject v_2d_points_2 = el_utilities.extensional_set_elements(set_of_points_in_units_2);
			if ((NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points_1, UNPROVIDED))
					&& (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points_2, UNPROVIDED))) {
				thread.resetMultipleValues();
				SubLObject x_y_values_1 = explode_2d_points_with_units(v_2d_points_1, UNPROVIDED, UNPROVIDED);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				SubLObject x_y_values_2 = explode_2d_points_with_units(v_2d_points_2, x_units, y_units);
				thread.resetMultipleValues();
				SubLObject x = java_link_point_intersection_of_two_x_y_regressions(x_y_values_1, x_y_values_2);
				SubLObject y = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (x.isNumber() && y.isNumber()) {
					if (NIL != variables.variable_p(query_point)) {
						SubLObject x_y_point_with_units = list($const24$The2DPoint,
								quantities.make_interval(x_units, x, UNPROVIDED),
								quantities.make_interval(y_units, y, UNPROVIDED));
						SubLObject v_bindings = quantities.term_unify_with_units(query_point, x_y_point_with_units);
						backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
								bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
								UNPROVIDED);
					} else {
						SubLObject v_bindings2 = append(
								quantities.term_unify_with_units(conses_high.second(query_point),
										quantities.make_interval(x_units, x, UNPROVIDED)),
								quantities.term_unify_with_units(conses_high.third(query_point),
										quantities.make_interval(y_units, y, UNPROVIDED)));
						backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
								bindings.apply_bindings(v_bindings2, asent), UNPROVIDED, UNPROVIDED), v_bindings2,
								UNPROVIDED);
					}
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 18200L)
	public static SubLObject removal_slope_of_regression_line_for_set_of_points_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject query_slope = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if ((NIL != el_utilities.el_extensional_set_p(set_of_points_in_units))
				&& ONE_INTEGER.numL(el_utilities.el_set_size(set_of_points_in_units))) {
			SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
			if (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points, UNPROVIDED)) {
				thread.resetMultipleValues();
				SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, UNPROVIDED, UNPROVIDED);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				SubLObject slope = java_link_slope_and_intercept_of_x_y_regression(x_y_values);
				SubLObject bindings_1 = quantities.term_unify_with_units(query_slope,
						quantities.make_interval(quantities.unit_quotient(y_units, x_units), slope, UNPROVIDED));
				SubLObject bindings_2 = (NIL != czer_utilities.equals_elP(x_units, y_units, UNPROVIDED, UNPROVIDED,
						UNPROVIDED))
								? NIL
								: quantities.term_unify_with_units(query_slope,
										quantities.make_interval(quantities.unit_quotient(x_units, y_units),
												Numbers.divide(ONE_INTEGER, slope), UNPROVIDED));
				if (NIL != bindings_1) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(bindings_1, asent), UNPROVIDED, UNPROVIDED), bindings_1,
							UNPROVIDED);
				}
				if (NIL != bindings_2) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(bindings_2, asent), UNPROVIDED, UNPROVIDED), bindings_2,
							UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 21000L)
	public static SubLObject removal_set_of_first_derivative_points_based_on_set_of_points_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject function_type = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject set_of_derivative_points_in_units = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		if (NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
			SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
			if (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points, UNPROVIDED)) {
				thread.resetMultipleValues();
				SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, UNPROVIDED, UNPROVIDED);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				SubLObject x_y_derivative_points = java_link_x_y_derivatives_for_interpolation_at_each_x(x_y_values,
						function_type);
				SubLObject derivative_units = quantities.unit_quotient(y_units, x_units);
				SubLObject result = NIL;
				SubLObject v_bindings = NIL;
				SubLObject cdolist_list_var = x_y_derivative_points;
				SubLObject x_y_derivative_point = NIL;
				x_y_derivative_point = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					result = cons(list($const24$The2DPoint, list(x_units, x_y_derivative_point.first()),
							list(derivative_units, conses_high.second(x_y_derivative_point))), result);
					cdolist_list_var = cdolist_list_var.rest();
					x_y_derivative_point = cdolist_list_var.first();
				}
				result = el_utilities.make_el_extensional_set(Sequences.nreverse(result));
				v_bindings = unification_utilities.term_unify(result, set_of_derivative_points_in_units, UNPROVIDED,
						UNPROVIDED);
				if (NIL != v_bindings) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
							UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 24600L)
	public static SubLObject removal_set_has_points_with_y_value_reln_to_matching_x_value_points_in_set_expand(
			SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject set_of_points_1_in_units = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject set_of_points_2_in_units = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject binary_function = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject binary_predicate = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject value_in_y_units = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
		SubLObject set_of_qualifying_points_in_units = cycl_utilities.atomic_sentence_arg6(asent, UNPROVIDED);
		if ((NIL != el_utilities.el_extensional_set_p(set_of_points_1_in_units))
				&& (NIL != el_utilities.el_extensional_set_p(set_of_points_2_in_units))
				&& (NIL != fort_types_interface.functionP(binary_function))
				&& arity.arity(binary_function).eql(TWO_INTEGER)
				&& (NIL != kb_accessors.binary_predicateP(binary_predicate))) {
			SubLObject v_2d_points_1 = el_utilities.extensional_set_elements(set_of_points_1_in_units);
			SubLObject v_2d_points_2 = el_utilities.extensional_set_elements(set_of_points_2_in_units);
			if ((NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points_1, UNPROVIDED))
					&& (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points_2, UNPROVIDED))) {
				thread.resetMultipleValues();
				SubLObject x_y_values_1 = explode_2d_points_with_units(v_2d_points_1, UNPROVIDED, UNPROVIDED);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				SubLObject x_y_values_2 = explode_2d_points_with_units(v_2d_points_2, x_units, y_units);
				SubLObject y_compare_value = conses_high
						.second(quantities.cyc_quantity_conversion(y_units, value_in_y_units));
				SubLObject result_x_y_values = NIL;
				SubLObject cdolist_list_var = x_y_values_1;
				SubLObject x_y_value_1 = NIL;
				x_y_value_1 = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject x_value_1 = x_y_value_1.first();
					SubLObject y_value_1 = conses_high.second(x_y_value_1);
					SubLObject y_value_2 = conses_high
							.second(Sequences.find(x_value_1, x_y_values_2, EQL, $sym34$FIRST, UNPROVIDED, UNPROVIDED));
					if ((NIL != y_value_2) && (NIL != backward.removal_ask(
							list(binary_predicate, list(binary_function, y_value_1, y_value_2), y_compare_value),
							UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
						result_x_y_values = cons(x_y_value_1, result_x_y_values);
					}
					cdolist_list_var = cdolist_list_var.rest();
					x_y_value_1 = cdolist_list_var.first();
				}
				SubLObject result = NIL;
				SubLObject cdolist_list_var2 = result_x_y_values;
				SubLObject result_x_y_value = NIL;
				result_x_y_value = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					result = ConsesLow.cons(list($const24$The2DPoint, list(x_units, result_x_y_value.first()),
							list(y_units, conses_high.second(result_x_y_value))), result);
					cdolist_list_var2 = cdolist_list_var2.rest();
					result_x_y_value = cdolist_list_var2.first();
				}
				result = el_utilities.make_el_extensional_set(Sequences.nreverse(result));
				SubLObject v_bindings = unification_utilities.term_unify(result, set_of_qualifying_points_in_units,
						UNPROVIDED, UNPROVIDED);
				if (NIL != v_bindings) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
							UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 26700L)
	public static SubLObject java_link_debug_modeP() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return control_vars.$inference_debugP$.getDynamicValue(thread);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 26900L)
	public static SubLObject java_link_slope_and_intercept_of_x_y_regression(SubLObject x_y_values) {
		SubLObject regression = JavaLink.java_new($str35$org_apache_commons_math_stat_regr, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject add_data_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str36$addData,
				new SubLObject[] { $str37$double, $str37$double });
		SubLObject slope_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str38$getSlope,
				EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject intercept_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr,
				$str39$getIntercept, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject cdolist_list_var = x_y_values;
		SubLObject x_y_value = NIL;
		x_y_value = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			JavaLink.java_call(add_data_method, regression,
					new SubLObject[] { x_y_value.first(), conses_high.second(x_y_value) });
			cdolist_list_var = cdolist_list_var.rest();
			x_y_value = cdolist_list_var.first();
		}
		return Values.values(JavaLink.java_call(slope_method, regression, EMPTY_SUBL_OBJECT_ARRAY),
				JavaLink.java_call(intercept_method, regression, EMPTY_SUBL_OBJECT_ARRAY));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 27700L)
	public static SubLObject java_link_x_y_cubic_spline_find_y_for_x(SubLObject x_y_values, SubLObject x_value) {
		if (x_value.numL(Functions.apply($sym40$MIN, Mapping.mapcar($sym34$FIRST, x_y_values)))
				|| x_value.numG(Functions.apply($sym41$MAX, Mapping.mapcar($sym34$FIRST, x_y_values)))
				|| ((NIL == java_link_debug_modeP()) && (NIL != list_utilities
						.duplicatesP(Mapping.mapcar($sym34$FIRST, x_y_values), UNPROVIDED, UNPROVIDED))))
			return NIL;
		SubLObject interpolator = JavaLink.java_new($str42$org_apache_commons_math_analysis_, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject interpolate_method = JavaLink.java_method($str42$org_apache_commons_math_analysis_,
				$str43$interpolate, new SubLObject[] { $str44$_D, $str44$_D });
		SubLObject value_method = JavaLink.java_method($str45$org_apache_commons_math_analysis_, $str46$value,
				new SubLObject[] { $str37$double });
		x_y_values = Sort.sort(x_y_values, $sym47$_, $sym34$FIRST);
		SubLObject poly_spline_function = JavaLink.java_call(interpolate_method, interpolator, new SubLObject[] {
				Mapping.mapcar($sym34$FIRST, x_y_values), Mapping.mapcar($sym48$SECOND, x_y_values) });
		return JavaLink.java_call(value_method, poly_spline_function, new SubLObject[] { x_value });
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 28600L)
	public static SubLObject java_link_x_y_piecewise_linear_find_y_for_x(SubLObject x_y_values, SubLObject x_value) {
		if (x_value.numL(Functions.apply($sym40$MIN, Mapping.mapcar($sym34$FIRST, x_y_values)))
				|| x_value.numG(Functions.apply($sym41$MAX, Mapping.mapcar($sym34$FIRST, x_y_values)))
				|| ((NIL == java_link_debug_modeP()) && (NIL != list_utilities
						.duplicatesP(Mapping.mapcar($sym34$FIRST, x_y_values), UNPROVIDED, UNPROVIDED))))
			return NIL;
		SubLObject interpolator = JavaLink.java_new($str49$org_apache_commons_math_analysis_, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject interpolate_method = JavaLink.java_method($str49$org_apache_commons_math_analysis_,
				$str43$interpolate, new SubLObject[] { $str44$_D, $str44$_D });
		SubLObject value_method = JavaLink.java_method($str45$org_apache_commons_math_analysis_, $str46$value,
				new SubLObject[] { $str37$double });
		x_y_values = Sort.sort(x_y_values, $sym47$_, $sym34$FIRST);
		SubLObject poly_spline_function = JavaLink.java_call(interpolate_method, interpolator, new SubLObject[] {
				Mapping.mapcar($sym34$FIRST, x_y_values), Mapping.mapcar($sym48$SECOND, x_y_values) });
		return JavaLink.java_call(value_method, poly_spline_function, new SubLObject[] { x_value });
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 29500L)
	public static SubLObject java_link_x_y_regression_find_y_for_x(SubLObject x_y_values, SubLObject x_value) {
		SubLObject regression = JavaLink.java_new($str35$org_apache_commons_math_stat_regr, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject add_data_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str36$addData,
				new SubLObject[] { $str37$double, $str37$double });
		SubLObject predict_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str50$predict,
				new SubLObject[] { $str37$double });
		SubLObject cdolist_list_var = x_y_values;
		SubLObject x_y_value = NIL;
		x_y_value = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			JavaLink.java_call(add_data_method, regression,
					new SubLObject[] { x_y_value.first(), conses_high.second(x_y_value) });
			cdolist_list_var = cdolist_list_var.rest();
			x_y_value = cdolist_list_var.first();
		}
		return JavaLink.java_call(predict_method, regression, new SubLObject[] { x_value });
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 30200L)
	public static SubLObject java_link_x_y_regression_find_y_for_x_with_error_bars(SubLObject x_y_values,
			SubLObject x_value) {
		if (Sequences.length(x_y_values).numL(THREE_INTEGER))
			return NIL;
		SubLObject number_of_points = Sequences.length(x_y_values);
		SubLObject regression = JavaLink.java_new($str35$org_apache_commons_math_stat_regr, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject add_data_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str36$addData,
				new SubLObject[] { $str37$double, $str37$double });
		SubLObject sse_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr,
				$str51$getSumSquaredErrors, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject predict_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str50$predict,
				new SubLObject[] { $str37$double });
		SubLObject cdolist_list_var = x_y_values;
		SubLObject x_y_value = NIL;
		x_y_value = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			JavaLink.java_call(add_data_method, regression,
					new SubLObject[] { x_y_value.first(), conses_high.second(x_y_value) });
			cdolist_list_var = cdolist_list_var.rest();
			x_y_value = cdolist_list_var.first();
		}
		SubLObject sum_of_squared_errors = JavaLink.java_call(sse_method, regression, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject y_error = Numbers
				.sqrt(Numbers.divide(sum_of_squared_errors, Numbers.subtract(number_of_points, TWO_INTEGER)));
		return Values.values(JavaLink.java_call(predict_method, regression, new SubLObject[] { x_value }), y_error);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 31100L)
	public static SubLObject java_link_point_intersection_of_two_x_y_regressions(SubLObject x_y_values_1,
			SubLObject x_y_values_2) {
		if ((NIL == x_y_values_1) || (NIL != list_utilities.singletonP(x_y_values_1)) || (NIL == x_y_values_2)
				|| (NIL != list_utilities.singletonP(x_y_values_2)))
			return NIL;
		SubLObject regression_1 = JavaLink.java_new($str35$org_apache_commons_math_stat_regr, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject regression_2 = JavaLink.java_new($str35$org_apache_commons_math_stat_regr, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject add_data_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str36$addData,
				new SubLObject[] { $str37$double, $str37$double });
		SubLObject predict_method = JavaLink.java_method($str35$org_apache_commons_math_stat_regr, $str50$predict,
				new SubLObject[] { $str37$double });
		SubLObject l1_p1_x = x_y_values_1.first().first();
		SubLObject l1_p2_x = conses_high.second(x_y_values_1).first();
		SubLObject l2_p1_x = x_y_values_2.first().first();
		SubLObject l2_p2_x = conses_high.second(x_y_values_2).first();
		SubLObject cdolist_list_var = x_y_values_1;
		SubLObject x_y_value_1 = NIL;
		x_y_value_1 = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			JavaLink.java_call(add_data_method, regression_1,
					new SubLObject[] { x_y_value_1.first(), conses_high.second(x_y_value_1) });
			cdolist_list_var = cdolist_list_var.rest();
			x_y_value_1 = cdolist_list_var.first();
		}
		cdolist_list_var = x_y_values_2;
		SubLObject x_y_value_2 = NIL;
		x_y_value_2 = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			JavaLink.java_call(add_data_method, regression_2,
					new SubLObject[] { x_y_value_2.first(), conses_high.second(x_y_value_2) });
			cdolist_list_var = cdolist_list_var.rest();
			x_y_value_2 = cdolist_list_var.first();
		}
		SubLObject l1_p1_y = JavaLink.java_call(predict_method, regression_1, new SubLObject[] { l1_p1_x });
		SubLObject l1_p2_y = JavaLink.java_call(predict_method, regression_1, new SubLObject[] { l1_p2_x });
		SubLObject l2_p1_y = JavaLink.java_call(predict_method, regression_2, new SubLObject[] { l2_p1_x });
		SubLObject l2_p2_y = JavaLink.java_call(predict_method, regression_2, new SubLObject[] { l2_p2_x });
		SubLObject line_class_name = $str52$org_apache_commons_math_geometry_;
		SubLObject vector2d_class_name = $str53$org_apache_commons_math_geometry_;
		SubLObject line_new_method = JavaLink.java_method(line_class_name, NIL,
				new SubLObject[] { vector2d_class_name, vector2d_class_name });
		SubLObject vector2d_new_method = JavaLink.java_method(vector2d_class_name, NIL,
				new SubLObject[] { $str37$double, $str37$double });
		SubLObject line_1 = JavaLink.java_new(line_new_method,
				new SubLObject[] { JavaLink.java_new(vector2d_new_method, new SubLObject[] { l1_p1_x, l1_p1_y }),
						JavaLink.java_new(vector2d_new_method, new SubLObject[] { l1_p2_x, l1_p2_y }) });
		SubLObject line_2 = JavaLink.java_new(line_new_method,
				new SubLObject[] { JavaLink.java_new(vector2d_new_method, new SubLObject[] { l2_p1_x, l2_p1_y }),
						JavaLink.java_new(vector2d_new_method, new SubLObject[] { l2_p2_x, l2_p2_y }) });
		SubLObject intersection_method = JavaLink.java_method(line_class_name, $str54$intersection,
				new SubLObject[] { $str55$org_apache_commons_math_geometry_ });
		SubLObject intersection_2dvector = JavaLink.java_call(intersection_method, line_1, new SubLObject[] { line_2 });
		if (NIL != intersection_2dvector) {
			SubLObject vector2d_getx_method = JavaLink.java_method(vector2d_class_name, $str56$getX,
					EMPTY_SUBL_OBJECT_ARRAY);
			SubLObject vector2d_gety_method = JavaLink.java_method(vector2d_class_name, $str57$getY,
					EMPTY_SUBL_OBJECT_ARRAY);
			return Values.values(
					JavaLink.java_call(vector2d_getx_method, intersection_2dvector, EMPTY_SUBL_OBJECT_ARRAY),
					JavaLink.java_call(vector2d_gety_method, intersection_2dvector, EMPTY_SUBL_OBJECT_ARRAY));
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 33700L)
	public static SubLObject java_link_x_y_derivatives_for_interpolation_at_each_x(SubLObject x_y_values,
			SubLObject interpolator) {
		if ((NIL == java_link_debug_modeP()) && (NIL != list_utilities
				.duplicatesP(Mapping.mapcar($sym34$FIRST, x_y_values), UNPROVIDED, UNPROVIDED)))
			return NIL;
		SubLObject interpolator_string = interpolator.eql($const58$CubicSpline)
				? $str42$org_apache_commons_math_analysis_
				: (interpolator.eql($const59$LinearPolynomialFunction_Piecewis)
						? $str49$org_apache_commons_math_analysis_
						: $str42$org_apache_commons_math_analysis_);
		SubLObject interpolator_$1 = JavaLink.java_new(interpolator_string, EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject interpolate_method = JavaLink.java_method(interpolator_string, $str43$interpolate,
				new SubLObject[] { $str44$_D, $str44$_D });
		SubLObject value_method = JavaLink.java_method($str45$org_apache_commons_math_analysis_, $str46$value,
				new SubLObject[] { $str37$double });
		SubLObject derivative_method = JavaLink.java_method($str45$org_apache_commons_math_analysis_, $str60$derivative,
				EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject derivative_x_y_values = NIL;
		x_y_values = Sort.sort(conses_high.copy_list(x_y_values), $sym47$_, $sym34$FIRST);
		SubLObject poly_spline_function = JavaLink.java_call(interpolate_method, interpolator_$1, new SubLObject[] {
				Mapping.mapcar($sym34$FIRST, x_y_values), Mapping.mapcar($sym48$SECOND, x_y_values) });
		SubLObject poly_spline_derivative = JavaLink.java_call(derivative_method, poly_spline_function,
				EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject cdolist_list_var = x_y_values;
		SubLObject x_y_value = NIL;
		x_y_value = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject x_value = x_y_value.first();
			derivative_x_y_values = cons(
					list(x_value,
							JavaLink.java_call(value_method, poly_spline_derivative, new SubLObject[] { x_value })),
					derivative_x_y_values);
			cdolist_list_var = cdolist_list_var.rest();
			x_y_value = cdolist_list_var.first();
		}
		return Sequences.nreverse(derivative_x_y_values);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 35900L)
	public static SubLObject el_2d_point_p(SubLObject v_object) {
		return makeBoolean((NIL != el_utilities.el_formula_p(v_object))
				&& cycl_utilities.formula_operator(v_object).eql($const24$The2DPoint)
				&& (NIL != el_utilities.el_binary_formula_p(v_object)));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 36200L)
	public static SubLObject explode_2d_points_with_units(SubLObject v_2d_points, SubLObject x_units,
			SubLObject y_units) {
		if (x_units == UNPROVIDED) {
			x_units = NIL;
		}
		if (y_units == UNPROVIDED) {
			y_units = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != list_utilities.non_dotted_list_p(v_2d_points) : v_2d_points;
		SubLObject cdolist_list_var = v_2d_points;
		SubLObject elem = NIL;
		elem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			assert NIL != el_2d_point_p(elem) : elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		SubLObject x_y_values = NIL;
		cdolist_list_var = v_2d_points;
		SubLObject v_2d_point = NIL;
		v_2d_point = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject x_y_with_units = cycl_utilities.formula_args(v_2d_point, UNPROVIDED);
			SubLObject x_with_units = x_y_with_units.first();
			SubLObject y_with_units = conses_high.second(x_y_with_units);
			thread.resetMultipleValues();
			SubLObject this_x_units = quantities.explode_interval(x_with_units);
			SubLObject this_x_value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL == x_units) {
				x_units = this_x_units;
			}
			if (!x_units.equal(this_x_units)) {
				this_x_value = quantities.convert_to_units_absolute(x_units, this_x_units, this_x_value, UNPROVIDED);
			}
			thread.resetMultipleValues();
			SubLObject this_y_units = quantities.explode_interval(y_with_units);
			SubLObject this_y_value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL == y_units) {
				y_units = this_y_units;
			}
			if (!y_units.equal(this_y_units)) {
				this_y_value = quantities.convert_to_units_absolute(y_units, this_y_units, this_y_value, UNPROVIDED);
			}
			x_y_values = cons(list(this_x_value, this_y_value), x_y_values);
			cdolist_list_var = cdolist_list_var.rest();
			v_2d_point = cdolist_list_var.first();
		}
		return Values.values(x_y_values, x_units, y_units);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 38800L)
	public static SubLObject removal_set_has_points_with_y_value_reln_to_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject operator = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject comparator = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject quant1 = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject quant2 = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
		SubLObject newset_var = cycl_utilities.atomic_sentence_arg6(asent, UNPROVIDED);
		if ((NIL != el_utilities.el_extensional_set_p(set_of_points_in_units))
				&& (NIL != fort_types_interface.functionP(operator))
				&& (NIL != relation_evaluation.evaluatable_predicateP(comparator, UNPROVIDED))
				&& arity.arity(comparator).eql(TWO_INTEGER)) {
			SubLObject x_y_values_with_units = el_utilities.extensional_set_elements(set_of_points_in_units);
			SubLObject result_points = NIL;
			if (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, x_y_values_with_units, UNPROVIDED)) {
				SubLObject cdolist_list_var = x_y_values_with_units;
				SubLObject x_y_value_with_units = NIL;
				x_y_value_with_units = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject y_value = cycl_utilities.formula_arg2(x_y_value_with_units, UNPROVIDED);
					if (NIL != relation_evaluation
							.cyc_evaluate(list(comparator, list(operator, y_value, quant1), quant2))) {
						result_points = cons(x_y_value_with_units, result_points);
					}
					cdolist_list_var = cdolist_list_var.rest();
					x_y_value_with_units = cdolist_list_var.first();
				}
			}
			if (NIL != result_points) {
				SubLObject v_bindings = unification_utilities.term_unify(
						el_utilities.make_el_set(list_utilities.fast_remove_duplicates(result_points, UNPROVIDED,
								UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED),
						newset_var, UNPROVIDED, UNPROVIDED);
				if (NIL != v_bindings) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
							UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 41100L)
	public static SubLObject removal_operation_result_comparison_pos_check(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject operator = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject a = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject b = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject comparator = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject quant = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
		if ((NIL != fort_types_interface.functionP(operator))
				&& (NIL != relation_evaluation.evaluatable_predicateP(comparator, UNPROVIDED))
				&& arity.arity(comparator).eql(TWO_INTEGER)) {
			SubLObject expression = list(comparator, list(operator, a, b), quant);
			if (NIL != relation_evaluation.cyc_evaluate(expression)) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, asent, UNPROVIDED, UNPROVIDED), NIL,
						list(removal_modules_evaluation.make_eval_support(expression, UNPROVIDED)));
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 42400L)
	public static SubLObject removal_operation_result_comparison_neg_check(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject operator = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject a = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject b = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject comparator = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject quant = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
		if ((NIL != fort_types_interface.functionP(operator))
				&& (NIL != relation_evaluation.evaluatable_predicateP(comparator, UNPROVIDED))
				&& arity.arity(comparator).eql(TWO_INTEGER)) {
			SubLObject expression = list(comparator, list(operator, a, b), quant);
			if (NIL == relation_evaluation.cyc_evaluate(expression)) {
				backward.removal_add_node(
						arguments.make_hl_support($kw$OPAQUE, el_utilities.make_negation(asent), UNPROVIDED,
								UNPROVIDED),
						NIL, list(removal_modules_evaluation.make_eval_support(el_utilities.make_negation(expression),
								UNPROVIDED)));
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 45100L)
	public static SubLObject removal_inflow_lengths_with_starting_depths_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject well = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject function_type = $const58$CubicSpline;
		SubLObject length_and_depths_query = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject debugP = NIL;
		if (NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
			SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
			if (NIL != list_utilities.every_in_list($sym13$EL_2D_POINT_P, v_2d_points, UNPROVIDED)) {
				thread.resetMultipleValues();
				SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, $const74$Meter,
						$const75$DegreeCelsius);
				SubLObject x_units = thread.secondMultipleValue();
				SubLObject y_units = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				x_y_values = Sort.sort(conses_high.copy_list(x_y_values), $sym47$_, $sym34$FIRST);
				SubLObject x_y_derivative_points = java_link_x_y_derivatives_for_interpolation_at_each_x(x_y_values,
						function_type);
				SubLObject average_y_value = number_utilities.average(x_y_values, $sym48$SECOND);
				SubLObject derivative_units = quantities.unit_quotient(y_units, x_units);
				SubLObject inflow_lengths = NIL;
				if (NIL != debugP) {
					print_high.print(x_y_values, UNPROVIDED);
					print_high.print(x_y_derivative_points, UNPROVIDED);
					format_nil.force_format(T, $str76$____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
							UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				SubLObject cdolist_list_var = Sort.sort(conses_high.copy_list(x_y_values), $sym85$_, $sym48$SECOND);
				SubLObject x_y_value = NIL;
				x_y_value = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject current;
					SubLObject datum = current = x_y_value;
					SubLObject x_value = NIL;
					SubLObject y_value = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
					x_value = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
					y_value = current.first();
					current = current.rest();
					if (NIL == current) {
						if (NIL != debugP) {
							format_nil.force_format(T, $str78$High_value__x__A_y__A__, x_value, y_value, UNPROVIDED,
									UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
						if (y_value.numG(Numbers.add(FIVE_INTEGER, average_y_value))) {
							SubLObject already_in_inflowP = NIL;
							SubLObject inflow_start_x = NIL;
							SubLObject inflow_end_x = NIL;
							if (NIL == already_in_inflowP) {
								SubLObject csome_list_var = inflow_lengths;
								SubLObject inflow_length = NIL;
								inflow_length = csome_list_var.first();
								while ((NIL == already_in_inflowP) && (NIL != csome_list_var)) {
									if (x_value.numGE(inflow_length.first())
											&& x_value.numLE(conses_high.second(inflow_length))) {
										already_in_inflowP = T;
									}
									csome_list_var = csome_list_var.rest();
									inflow_length = csome_list_var.first();
								}
							}
							if (NIL == already_in_inflowP) {
								SubLObject found_start_pointP = NIL;
								if (NIL == found_start_pointP) {
									SubLObject cur_x_y_value = NIL;
									SubLObject cur_x_y_value_$2 = NIL;
									SubLObject cur_x_y_derivative_point = NIL;
									SubLObject cur_x_y_derivative_point_$3 = NIL;
									cur_x_y_value = Sequences.nreverse(conses_high.copy_list(x_y_values));
									cur_x_y_value_$2 = cur_x_y_value.first();
									cur_x_y_derivative_point = Sequences
											.nreverse(conses_high.copy_list(x_y_derivative_points));
									cur_x_y_derivative_point_$3 = cur_x_y_derivative_point.first();
									while ((NIL == found_start_pointP)
											&& ((NIL != cur_x_y_derivative_point) || (NIL != cur_x_y_value))) {
										SubLObject current_$5;
										SubLObject datum_$4 = current_$5 = cur_x_y_derivative_point_$3;
										SubLObject cur_x_value = NIL;
										SubLObject cur_y_derivative_value = NIL;
										cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4,
												$list79);
										cur_x_value = current_$5.first();
										current_$5 = current_$5.rest();
										cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4,
												$list79);
										cur_y_derivative_value = current_$5.first();
										current_$5 = current_$5.rest();
										if (NIL == current_$5) {
											SubLObject cur_y_value = conses_high.second(cur_x_y_value_$2);
											if (NIL != debugP) {
												format_nil.force_format(T, $str80$checking_x__A_deriv__A__, cur_x_value,
														cur_y_derivative_value, UNPROVIDED, UNPROVIDED, UNPROVIDED,
														UNPROVIDED, UNPROVIDED, UNPROVIDED);
												if (!cur_x_value.eql(cur_x_y_value_$2.first())) {
													print_high.print($str81$Bad_looping, UNPROVIDED);
													Errors.sublisp_break(UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
												}
											}
											if (cur_y_derivative_value.numGE($float82$0_5)
													&& cur_x_value.numL(x_value)) {
												found_start_pointP = T;
												inflow_start_x = cur_x_value;
											}
										} else {
											cdestructuring_bind.cdestructuring_bind_error(datum_$4, $list79);
										}
										cur_x_y_value = cur_x_y_value.rest();
										cur_x_y_value_$2 = cur_x_y_value.first();
										cur_x_y_derivative_point = cur_x_y_derivative_point.rest();
										cur_x_y_derivative_point_$3 = cur_x_y_derivative_point.first();
									}
								}
								SubLObject found_end_pointP = NIL;
								if (NIL == found_end_pointP) {
									SubLObject cur_x_y_value = NIL;
									SubLObject cur_x_y_value_$3 = NIL;
									SubLObject cur_x_y_derivative_point = NIL;
									SubLObject cur_x_y_derivative_point_$4 = NIL;
									cur_x_y_value = x_y_values;
									cur_x_y_value_$3 = cur_x_y_value.first();
									cur_x_y_derivative_point = x_y_derivative_points;
									cur_x_y_derivative_point_$4 = cur_x_y_derivative_point.first();
									while ((NIL == found_end_pointP)
											&& ((NIL != cur_x_y_derivative_point) || (NIL != cur_x_y_value))) {
										SubLObject current_$6;
										SubLObject datum_$5 = current_$6 = cur_x_y_derivative_point_$4;
										SubLObject cur_x_value = NIL;
										SubLObject cur_y_derivative_value = NIL;
										cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5,
												$list79);
										cur_x_value = current_$6.first();
										current_$6 = current_$6.rest();
										cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5,
												$list79);
										cur_y_derivative_value = current_$6.first();
										current_$6 = current_$6.rest();
										if (NIL == current_$6) {
											SubLObject cur_y_value = conses_high.second(cur_x_y_value_$3);
											if (NIL != debugP) {
												format_nil.force_format(T, $str80$checking_x__A_deriv__A__, cur_x_value,
														cur_y_derivative_value, UNPROVIDED, UNPROVIDED, UNPROVIDED,
														UNPROVIDED, UNPROVIDED, UNPROVIDED);
												if (!cur_x_value.eql(cur_x_y_value_$3.first())) {
													print_high.print($str81$Bad_looping, UNPROVIDED);
													Errors.sublisp_break(UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY);
												}
											}
											if (cur_y_derivative_value.numLE($float83$_0_5)
													&& cur_x_value.numG(x_value)) {
												found_end_pointP = T;
												inflow_end_x = cur_x_value;
											}
										} else {
											cdestructuring_bind.cdestructuring_bind_error(datum_$5, $list79);
										}
										cur_x_y_value = cur_x_y_value.rest();
										cur_x_y_value_$3 = cur_x_y_value.first();
										cur_x_y_derivative_point = cur_x_y_derivative_point.rest();
										cur_x_y_derivative_point_$4 = cur_x_y_derivative_point.first();
									}
								}
							}
							if ((NIL != inflow_start_x) && (NIL != inflow_end_x)) {
								if (NIL != debugP) {
									format_nil.force_format(T, $str84$Got_interval___A__A___, inflow_start_x,
											inflow_end_x, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
											UNPROVIDED);
								}
								inflow_lengths = cons(list(inflow_start_x, inflow_end_x), inflow_lengths);
							}
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, $list77);
					}
					cdolist_list_var = cdolist_list_var.rest();
					x_y_value = cdolist_list_var.first();
				}
				inflow_lengths = Sort.sort(inflow_lengths, $sym47$_, $sym34$FIRST);
				if (NIL != debugP) {
					format_nil.force_format(T, $str86$inflow_lengths___A__, inflow_lengths, UNPROVIDED, UNPROVIDED,
							UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				SubLObject merged_inflow_lengths = NIL;
				SubLObject cur_start = NIL;
				SubLObject cur_end = NIL;
				SubLObject cdolist_list_var2 = inflow_lengths;
				SubLObject inflow_length2 = NIL;
				inflow_length2 = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					SubLObject current2;
					SubLObject datum2 = current2 = inflow_length2;
					SubLObject start = NIL;
					SubLObject end = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, $list87);
					start = current2.first();
					current2 = current2.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, $list87);
					end = current2.first();
					current2 = current2.rest();
					if (NIL == current2) {
						if ((NIL != cur_start) && (NIL != cur_end)) {
							if (start.numLE(cur_end)) {
								cur_end = end;
							} else {
								merged_inflow_lengths = cons(list(cur_start, cur_end), merged_inflow_lengths);
								cur_start = start;
								cur_end = end;
							}
						} else {
							cur_start = start;
							cur_end = end;
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum2, $list87);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					inflow_length2 = cdolist_list_var2.first();
				}
				if ((NIL != cur_start) && (NIL != cur_end)) {
					merged_inflow_lengths = cons(list(cur_start, cur_end), merged_inflow_lengths);
				}
				if (NIL != debugP) {
					format_nil.force_format(T, $str88$merged_inflow_lengths___A__, merged_inflow_lengths, UNPROVIDED,
							UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				inflow_lengths = merged_inflow_lengths;
				SubLObject result = NIL;
				SubLObject cdolist_list_var3 = inflow_lengths;
				SubLObject result_inflow_length = NIL;
				result_inflow_length = cdolist_list_var3.first();
				while (NIL != cdolist_list_var3) {
					result = cons(
							list($const89$TheList, list(x_units, result_inflow_length.first()), list(x_units, Numbers
									.subtract(conses_high.second(result_inflow_length), result_inflow_length.first()))),
							result);
					cdolist_list_var3 = cdolist_list_var3.rest();
					result_inflow_length = cdolist_list_var3.first();
				}
				result = el_utilities.make_el_list(result, UNPROVIDED);
				SubLObject v_bindings = unification_utilities.term_unify(result, length_and_depths_query, UNPROVIDED,
						UNPROVIDED);
				if (NIL != v_bindings) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
							UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_math_file() {
		declareFunction(myName, "removal_interpolation_with_cubic_spline_expand",
				"REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_interpolation_with_piecewise_linear_polynomial_expand",
				"REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_extrapolation_with_simple_linear_regression_expand",
				"REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_interpolation_or_extrapolation_with_java_link_function_expand_helper",
				"REMOVAL-INTERPOLATION-OR-EXTRAPOLATION-WITH-JAVA-LINK-FUNCTION-EXPAND-HELPER", 2, 0, false);
		declareFunction(myName, "removal_extrapolation_with_simple_linear_regression_with_error_bars_expand",
				"REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-WITH-ERROR-BARS-EXPAND", 1, 1, false);
		declareFunction(me,
				"removal_interpolation_or_extrapolation_with_error_bars_with_java_link_function_expand_helper",
				"REMOVAL-INTERPOLATION-OR-EXTRAPOLATION-WITH-ERROR-BARS-WITH-JAVA-LINK-FUNCTION-EXPAND-HELPER", 2, 0,
				false);
		declareFunction(myName, "removal_regression_lines_for_sets_intersect_at_point_expand",
				"REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_slope_of_regression_line_for_set_of_points_expand",
				"REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_set_of_first_derivative_points_based_on_set_of_points_expand",
				"REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS-EXPAND", 1, 1, false);
		declareFunction(me, "removal_set_has_points_with_y_value_reln_to_matching_x_value_points_in_set_expand",
				"REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET-EXPAND", 1, 1, false);
		declareFunction(myName, "java_link_debug_modeP", "JAVA-LINK-DEBUG-MODE?", 0, 0, false);
		declareFunction(myName, "java_link_slope_and_intercept_of_x_y_regression",
				"JAVA-LINK-SLOPE-AND-INTERCEPT-OF-X-Y-REGRESSION", 1, 0, false);
		declareFunction(myName, "java_link_x_y_cubic_spline_find_y_for_x", "JAVA-LINK-X-Y-CUBIC-SPLINE-FIND-Y-FOR-X", 2,
				0, false);
		declareFunction(myName, "java_link_x_y_piecewise_linear_find_y_for_x",
				"JAVA-LINK-X-Y-PIECEWISE-LINEAR-FIND-Y-FOR-X", 2, 0, false);
		declareFunction(myName, "java_link_x_y_regression_find_y_for_x", "JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X", 2, 0,
				false);
		declareFunction(myName, "java_link_x_y_regression_find_y_for_x_with_error_bars",
				"JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X-WITH-ERROR-BARS", 2, 0, false);
		declareFunction(myName, "java_link_point_intersection_of_two_x_y_regressions",
				"JAVA-LINK-POINT-INTERSECTION-OF-TWO-X-Y-REGRESSIONS", 2, 0, false);
		declareFunction(myName, "java_link_x_y_derivatives_for_interpolation_at_each_x",
				"JAVA-LINK-X-Y-DERIVATIVES-FOR-INTERPOLATION-AT-EACH-X", 2, 0, false);
		declareFunction(myName, "el_2d_point_p", "EL-2D-POINT-P", 1, 0, false);
		declareFunction(myName, "explode_2d_points_with_units", "EXPLODE-2D-POINTS-WITH-UNITS", 1, 2, false);
		declareFunction(myName, "removal_set_has_points_with_y_value_reln_to_expand",
				"REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-EXPAND", 1, 1, false);
		declareFunction(myName, "removal_operation_result_comparison_pos_check",
				"REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK", 1, 1, false);
		declareFunction(myName, "removal_operation_result_comparison_neg_check",
				"REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK", 1, 1, false);
		declareFunction(myName, "removal_inflow_lengths_with_starting_depths_expand",
				"REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS-EXPAND", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_math_file() {
		$default_math_module_cost$ = defparameter("*DEFAULT-MATH-MODULE-COST*",
				control_vars.$typical_hl_module_check_cost$.getGlobalValue());
		return NIL;
	}

	public static SubLObject setup_removal_modules_math_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$interpolationWithCubicSpline);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$interpolationWithCubicSpline, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_INTERPOLATION_WITH_CUBIC_SPLINE, $list3);
		inference_modules.register_solely_specific_removal_module_predicate($const5$interpolationWithPiecewiseLinearP);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const5$interpolationWithPiecewiseLinearP, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_INTERPOLATION_WITH_PIECEWISE_LINEAR_POLYNOMIAL, $list7);
		inference_modules.register_solely_specific_removal_module_predicate($const9$extrapolationWithSimpleLinearRegr);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const9$extrapolationWithSimpleLinearRegr, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION, $list11);
		inference_modules.register_solely_specific_removal_module_predicate($const17$extrapolationWithSimpleLinearRegr);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const17$extrapolationWithSimpleLinearRegr, ONE_INTEGER);
		inference_modules.inference_removal_module(
				$kw$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION_WITH_ERROR_BA, $list19);
		inference_modules.register_solely_specific_removal_module_predicate($const21$regressionLinesForSetsIntersectAt);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const21$regressionLinesForSetsIntersectAt, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const21$regressionLinesForSetsIntersectAt, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_REGRESSION_LINES_FOR_SETS_INTERSECT_AT_POINT, $list23);
		inference_modules.register_solely_specific_removal_module_predicate($const25$slopeOfRegressionLineForSetOfPoin);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const25$slopeOfRegressionLineForSetOfPoin, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_SLOPE_OF_REGRESSION_LINE_FOR_SET_OF_POINTS, $list27);
		inference_modules.register_solely_specific_removal_module_predicate($const28$setOfFirstDerivativePointsBasedOn);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const28$setOfFirstDerivativePointsBasedOn, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const28$setOfFirstDerivativePointsBasedOn, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_SET_OF_FIRST_DERIVATIVE_POINTS_BASED_ON_SET_OF_POINTS,
				$list30);
		inference_modules.register_solely_specific_removal_module_predicate($const31$setHasPointsWithYValueRelnToMatch);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const31$setHasPointsWithYValueRelnToMatch, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const31$setHasPointsWithYValueRelnToMatch, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const31$setHasPointsWithYValueRelnToMatch,
				THREE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const31$setHasPointsWithYValueRelnToMatch,
				FOUR_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const31$setHasPointsWithYValueRelnToMatch,
				FIVE_INTEGER);
		inference_modules.inference_removal_module(
				$kw$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO_MATCHING_X_VALUE_POIN, $list33);
		inference_modules.register_solely_specific_removal_module_predicate($const62$setHasPointsWithYValueRelnTo);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const62$setHasPointsWithYValueRelnTo, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const62$setHasPointsWithYValueRelnTo, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const62$setHasPointsWithYValueRelnTo, THREE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const62$setHasPointsWithYValueRelnTo, FOUR_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const62$setHasPointsWithYValueRelnTo, FIVE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO, $list64);
		inference_modules.register_solely_specific_removal_module_predicate($const65$operationResultComparison);
		preference_modules.doomed_unless_all_args_bindable($kw$POS, $const65$operationResultComparison);
		preference_modules.doomed_unless_all_args_bindable($kw$NEG, $const65$operationResultComparison);
		inference_modules.inference_removal_module($kw$REMOVAL_OPERATION_RESULT_COMPARISON_POS_CHECK, $list68);
		inference_modules.inference_removal_module($kw$REMOVAL_OPERATION_RESULT_COMPARISON_NEG_CHECK, $list70);
		inference_modules.register_solely_specific_removal_module_predicate($const71$inflowLengthsWithStartingDepths);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const71$inflowLengthsWithStartingDepths, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const71$inflowLengthsWithStartingDepths, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_INFLOW_LENGTHS_WITH_STARTING_DEPTHS, $list73);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_math_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_math_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_math_file();
	}

	static {
		me = new removal_modules_math();
		$default_math_module_cost$ = null;
		$const0$interpolationWithCubicSpline = constant_handles
				.reader_make_constant_shell(makeString("interpolationWithCubicSpline"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_INTERPOLATION_WITH_CUBIC_SPLINE = makeKeyword("REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("interpolationWithCubicSpline")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("interpolationWithCubicSpline")),
						makeKeyword("FULLY-BOUND"),
						list(makeKeyword("OR"),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$interpolationWithCubicSpline <set-of-points> <2d-point-with-x-or-y-bound>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$interpolationWithCubicSpline \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
		$sym4$JAVA_LINK_X_Y_CUBIC_SPLINE_FIND_Y_FOR_X = makeSymbol("JAVA-LINK-X-Y-CUBIC-SPLINE-FIND-Y-FOR-X");
		$const5$interpolationWithPiecewiseLinearP = constant_handles
				.reader_make_constant_shell(makeString("interpolationWithPiecewiseLinearPolynomial"));
		$kw$REMOVAL_INTERPOLATION_WITH_PIECEWISE_LINEAR_POLYNOMIAL = makeKeyword(
				"REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL");
		$list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("interpolationWithPiecewiseLinearPolynomial")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("interpolationWithPiecewiseLinearPolynomial")),
						makeKeyword("FULLY-BOUND"),
						list(makeKeyword("OR"),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$interpolationWithPiecewiseLinearPolynomial <set-of-points> <2d-point-with-x-or-y-bound>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$interpolationWithPiecewiseLinearPolynomial \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
		$sym8$JAVA_LINK_X_Y_PIECEWISE_LINEAR_FIND_Y_FOR_X = makeSymbol("JAVA-LINK-X-Y-PIECEWISE-LINEAR-FIND-Y-FOR-X");
		$const9$extrapolationWithSimpleLinearRegr = constant_handles
				.reader_make_constant_shell(makeString("extrapolationWithSimpleLinearRegression"));
		$kw$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION = makeKeyword(
				"REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION");
		$list11 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("extrapolationWithSimpleLinearRegression")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("extrapolationWithSimpleLinearRegression")),
						makeKeyword("FULLY-BOUND"),
						list(makeKeyword("OR"),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$extrapolationWithSimpleLinearRegression <set-of-points> <2d-point-with-x-or-y-bound>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$extrapolationWithSimpleLinearRegression \n    (#$TheSet \n     (#$The2DPoint \n      (#$DaysDuration 1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$DaysDuration 2) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$DaysDuration 3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$DaysDuration 4) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$DaysDuration 5) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$DaysDuration 6) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$DaysDuration 7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$DaysDuration 8) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$DaysDuration ?VALUE) \n     (#$DegreeCelsius 200)))") });
		$sym12$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X = makeSymbol("JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X");
		$sym13$EL_2D_POINT_P = makeSymbol("EL-2D-POINT-P");
		$list14 = list(makeSymbol("THE-2D-POINT"), makeSymbol("QUERY-X-VALUE-WITH-UNITS"),
				makeSymbol("QUERY-Y-VALUE-WITH-UNITS"));
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$sym16$NREVERSE = makeSymbol("NREVERSE");
		$const17$extrapolationWithSimpleLinearRegr = constant_handles
				.reader_make_constant_shell(makeString("extrapolationWithSimpleLinearRegressionWithErrorBars"));
		$kw$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION_WITH_ERROR_BA = makeKeyword(
				"REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-WITH-ERROR-BARS");
		$list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles
						.reader_make_constant_shell(makeString("extrapolationWithSimpleLinearRegressionWithErrorBars")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("extrapolationWithSimpleLinearRegressionWithErrorBars")),
						makeKeyword("FULLY-BOUND"),
						list(makeKeyword("OR"),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
								list(constant_handles.reader_make_constant_shell(makeString("The2DPoint")),
										makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))),
						makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-WITH-ERROR-BARS-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$extrapolationWithSimpleLinearRegressionWithErrorBars <set-of-points> <2d-point-with-x-or-y-bound> <error-term-unbound>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$extrapolationWithSimpleLinearRegressionWithErrorBars\n    (#$TheSet \n     (#$The2DPoint \n      (#$DaysDuration 1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$DaysDuration 2) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$DaysDuration 3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$DaysDuration 4) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$DaysDuration 5) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$DaysDuration 6) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$DaysDuration 7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$DaysDuration 8) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$DaysDuration ?VALUE) \n     (#$DegreeCelsius 200))\n    ?ERROR)") });
		$sym20$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X_WITH_ERROR_BARS = makeSymbol(
				"JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X-WITH-ERROR-BARS");
		$const21$regressionLinesForSetsIntersectAt = constant_handles
				.reader_make_constant_shell(makeString("regressionLinesForSetsIntersectAtPoint"));
		$kw$REMOVAL_REGRESSION_LINES_FOR_SETS_INTERSECT_AT_POINT = makeKeyword(
				"REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT");
		$list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regressionLinesForSetsIntersectAtPoint")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("regressionLinesForSetsIntersectAtPoint")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$regressionLinesForSetsIntersectAtPoint <set-of-points> <set-of-points> ?POINT)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$regressionLinesForSetsIntersectAtPoint\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 200)\n       (#$SecondsDuration 1263118210))\n      (#$The2DPoint\n       (#$DegreeCelsius 210)\n       (#$SecondsDuration 1263204610))\n      (#$The2DPoint\n       (#$DegreeCelsius 220)\n       (#$SecondsDuration 1263291010)))\n     (TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400)))\n     ?POINT)") });
		$const24$The2DPoint = constant_handles.reader_make_constant_shell(makeString("The2DPoint"));
		$const25$slopeOfRegressionLineForSetOfPoin = constant_handles
				.reader_make_constant_shell(makeString("slopeOfRegressionLineForSetOfPoints"));
		$kw$REMOVAL_SLOPE_OF_REGRESSION_LINE_FOR_SET_OF_POINTS = makeKeyword(
				"REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS");
		$list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("slopeOfRegressionLineForSetOfPoints")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("slopeOfRegressionLineForSetOfPoints")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$slopeOfRegressionLineForSetOfPoints <set-of-points> ?SLOPE)"), makeKeyword("EXAMPLE"),
				makeString(
						"(#$slopeOfRegressionLineForSetOfPoints\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400))) ?X)") });
		$const28$setOfFirstDerivativePointsBasedOn = constant_handles
				.reader_make_constant_shell(makeString("setOfFirstDerivativePointsBasedOnSetOfPoints"));
		$kw$REMOVAL_SET_OF_FIRST_DERIVATIVE_POINTS_BASED_ON_SET_OF_POINTS = makeKeyword(
				"REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS");
		$list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints <set-of-points> ?SET-OF-POINTS)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$setOfFirstDerivativePointsBasedOnSetOfPoints\n    (#$TheSet\n     (#$The2DPoint (#$SecondsDuration 1) (#$DegreeCelsius 1))\n     (#$The2DPoint (#$SecondsDuration 3) (#$DegreeCelsius 5))\n     (#$The2DPoint (#$SecondsDuration 5) (#$DegreeCelsius 1)))\n    #$CubicSpline\n    ?X)\n    -->\n    (#$TheSet \n     (#$The2DPoint (#$SecondsDuration 1) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 6.0))\n     (#$The2DPoint (#$SecondsDuration 3) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 0.0))\n     (#$The2DPoint (#$SecondsDuration 5) ((#$PerFn #$DegreeCelsius #$SecondsDuration) -6.0)))") });
		$const31$setHasPointsWithYValueRelnToMatch = constant_handles
				.reader_make_constant_shell(makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet"));
		$kw$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO_MATCHING_X_VALUE_POIN = makeKeyword(
				"REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET");
		$list33 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(
						makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(
						makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet <set-of-points> <set-of-points> <binary-function> <binary-predicate> <value-in-y-units> ?RESULT-SET-OF-POINTS)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170))) \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170)))\n    #$DifferenceFn\n    #$greaterThanOrEqualTo \n    (#$Kelvin 2)\n    ?NEWSET)\n    -->\n    (((?NEWSET #$TheSet (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)))))") });
		$sym34$FIRST = makeSymbol("FIRST");
		$str35$org_apache_commons_math_stat_regr = makeString(
				"org.apache.commons.math.stat.regression.SimpleRegression");
		$str36$addData = makeString("addData");
		$str37$double = makeString("double");
		$str38$getSlope = makeString("getSlope");
		$str39$getIntercept = makeString("getIntercept");
		$sym40$MIN = makeSymbol("MIN");
		$sym41$MAX = makeSymbol("MAX");
		$str42$org_apache_commons_math_analysis_ = makeString(
				"org.apache.commons.math.analysis.interpolation.SplineInterpolator");
		$str43$interpolate = makeString("interpolate");
		$str44$_D = makeString("[D");
		$str45$org_apache_commons_math_analysis_ = makeString(
				"org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction");
		$str46$value = makeString("value");
		$sym47$_ = makeSymbol("<");
		$sym48$SECOND = makeSymbol("SECOND");
		$str49$org_apache_commons_math_analysis_ = makeString(
				"org.apache.commons.math.analysis.interpolation.LinearInterpolator");
		$str50$predict = makeString("predict");
		$str51$getSumSquaredErrors = makeString("getSumSquaredErrors");
		$str52$org_apache_commons_math_geometry_ = makeString("org.apache.commons.math.geometry.euclidean.twod.Line");
		$str53$org_apache_commons_math_geometry_ = makeString(
				"org.apache.commons.math.geometry.euclidean.twod.Vector2D");
		$str54$intersection = makeString("intersection");
		$str55$org_apache_commons_math_geometry_ = makeString(
				"org.apache.commons.math.geometry.partitioning.Hyperplane");
		$str56$getX = makeString("getX");
		$str57$getY = makeString("getY");
		$const58$CubicSpline = constant_handles.reader_make_constant_shell(makeString("CubicSpline"));
		$const59$LinearPolynomialFunction_Piecewis = constant_handles
				.reader_make_constant_shell(makeString("LinearPolynomialFunction-Piecewise"));
		$str60$derivative = makeString("derivative");
		$sym61$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
		$const62$setHasPointsWithYValueRelnTo = constant_handles
				.reader_make_constant_shell(makeString("setHasPointsWithYValueRelnTo"));
		$kw$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO = makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO");
		$list64 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("setHasPointsWithYValueRelnTo")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("setHasPointsWithYValueRelnTo")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$setHasPointsWithYValueRelnTo <set-of-points> <operator> <comparator> <quant1> <quant2> ?NEWSET)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$setHasPointsWithYValueRelnTo \n (#$TheSet \n  (#$The2DPoint \n   (#$Meter 20.0) \n   (#$DegreeCelsius 68.35)) \n  (#$The2DPoint \n   (#$Meter 21.0) \n   (#$DegreeCelsius 72.98)) \n  (#$The2DPoint \n   (#$Meter 22.0) \n   (#$DegreeCelsius 75.68)) \n  (#$The2DPoint \n   (#$Meter 23.0) \n   (#$DegreeCelsius 78.16)) \n  (#$The2DPoint \n   (#$Meter 24.0) \n   (#$DegreeCelsius 80.79)))\n #$PlusFn\n #$lessThanOrEqualTo \n (#$DegreeCelsius 0) \n (#$DegreeCelsius 70) ?NEWSET)\n -->\n (((?NEWSET TheSet\n   (The2DPoint\n       (Meter 20.0)\n       (DegreeCelsius 68.35)))))") });
		$const65$operationResultComparison = constant_handles
				.reader_make_constant_shell(makeString("operationResultComparison"));
		$kw$NEG = makeKeyword("NEG");
		$kw$REMOVAL_OPERATION_RESULT_COMPARISON_POS_CHECK = makeKeyword(
				"REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK");
		$list68 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("operationResultComparison")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("operationResultComparison")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK"), makeKeyword("DOCUMENTATION"),
				makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), makeKeyword("EXAMPLE"),
				makeString(
						"(#$operationResultComparison #$PlusFn (#$DegreeCelsius 50) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
		$kw$REMOVAL_OPERATION_RESULT_COMPARISON_NEG_CHECK = makeKeyword(
				"REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK");
		$list70 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("operationResultComparison")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("operationResultComparison")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK"), makeKeyword("DOCUMENTATION"),
				makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), makeKeyword("EXAMPLE"),
				makeString(
						"(#$not (#$operationResultComparison #$PlusFn (#$DegreeCelsius 100) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
		$const71$inflowLengthsWithStartingDepths = constant_handles
				.reader_make_constant_shell(makeString("inflowLengthsWithStartingDepths"));
		$kw$REMOVAL_INFLOW_LENGTHS_WITH_STARTING_DEPTHS = makeKeyword("REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS");
		$list73 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("inflowLengthsWithStartingDepths")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("inflowLengthsWithStartingDepths")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$inflowLengthsWithStartingDepths <well> <set-of-points> ?LENGTH-AND-DEPTHS)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$inflowLengthsWithStartingDepths\n  (#$The #$Well)\n  (#$TheSet \n   (#$The2DPoint (#$Meter 100) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 110) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 120) (#$DegreeCelsius 115))\n   (#$The2DPoint (#$Meter 130) (#$DegreeCelsius 114))\n   (#$The2DPoint (#$Meter 140) (#$DegreeCelsius 103))\n   (#$The2DPoint (#$Meter 150) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 160) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 170) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 180) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 190) (#$DegreeCelsius  91))\n   (#$The2DPoint (#$Meter 200) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 210) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 220) (#$DegreeCelsius 105))\n   (#$The2DPoint (#$Meter 230) (#$DegreeCelsius  97))\n   (#$The2DPoint (#$Meter 240) (#$DegreeCelsius  96))\n   (#$The2DPoint (#$Meter 250) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 260) (#$DegreeCelsius  94))\n   (#$The2DPoint (#$Meter 270) (#$DegreeCelsius  93))\n   (#$The2DPoint (#$Meter 280) (#$DegreeCelsius  92)))\n  ?LENGTH-AND-DEPTHS)") });
		$const74$Meter = constant_handles.reader_make_constant_shell(makeString("Meter"));
		$const75$DegreeCelsius = constant_handles.reader_make_constant_shell(makeString("DegreeCelsius"));
		$str76$____ = makeString("~%~%");
		$list77 = list(makeSymbol("X-VALUE"), makeSymbol("Y-VALUE"));
		$str78$High_value__x__A_y__A__ = makeString("High value: x=~A y=~A~%");
		$list79 = list(makeSymbol("CUR-X-VALUE"), makeSymbol("CUR-Y-DERIVATIVE-VALUE"));
		$str80$checking_x__A_deriv__A__ = makeString("checking x=~A deriv=~A~%");
		$str81$Bad_looping = makeString("Bad looping");
		$float82$0_5 = makeDouble(0.5);
		$float83$_0_5 = makeDouble(-0.5);
		$str84$Got_interval___A__A___ = makeString("Got interval (~A ~A)~%");
		$sym85$_ = makeSymbol(">");
		$str86$inflow_lengths___A__ = makeString("inflow-lengths: ~A~%");
		$list87 = list(makeSymbol("START"), makeSymbol("END"));
		$str88$merged_inflow_lengths___A__ = makeString("merged-inflow-lengths: ~A~%");
		$const89$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
	}
}
/*
 *
 * Total time: 340 ms
 *
 */