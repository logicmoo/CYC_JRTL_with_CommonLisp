package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.JavaLink;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_math extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math";
    public static final String myFingerPrint = "6cd63cf6ff87581a938838c5c29c78f0502960e9c51c9fce9949bb35f89c08f5";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 1010L)
    public static SubLSymbol $default_math_module_cost$;
    private static final SubLObject $const0$interpolationWithCubicSpline;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_INTERPOLATION_WITH_CUBIC_SPLINE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$JAVA_LINK_X_Y_CUBIC_SPLINE_FIND_Y_FOR_X;
    private static final SubLObject $const5$interpolationWithPiecewiseLinearP;
    private static final SubLSymbol $kw6$REMOVAL_INTERPOLATION_WITH_PIECEWISE_LINEAR_POLYNOMIAL;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$JAVA_LINK_X_Y_PIECEWISE_LINEAR_FIND_Y_FOR_X;
    private static final SubLObject $const9$extrapolationWithSimpleLinearRegr;
    private static final SubLSymbol $kw10$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X;
    private static final SubLSymbol $sym13$EL_2D_POINT_P;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$OPAQUE;
    private static final SubLSymbol $sym16$NREVERSE;
    private static final SubLObject $const17$extrapolationWithSimpleLinearRegr;
    private static final SubLSymbol $kw18$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION_WITH_ERROR_BA;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X_WITH_ERROR_BARS;
    private static final SubLObject $const21$regressionLinesForSetsIntersectAt;
    private static final SubLSymbol $kw22$REMOVAL_REGRESSION_LINES_FOR_SETS_INTERSECT_AT_POINT;
    private static final SubLList $list23;
    private static final SubLObject $const24$The2DPoint;
    private static final SubLObject $const25$slopeOfRegressionLineForSetOfPoin;
    private static final SubLSymbol $kw26$REMOVAL_SLOPE_OF_REGRESSION_LINE_FOR_SET_OF_POINTS;
    private static final SubLList $list27;
    private static final SubLObject $const28$setOfFirstDerivativePointsBasedOn;
    private static final SubLSymbol $kw29$REMOVAL_SET_OF_FIRST_DERIVATIVE_POINTS_BASED_ON_SET_OF_POINTS;
    private static final SubLList $list30;
    private static final SubLObject $const31$setHasPointsWithYValueRelnToMatch;
    private static final SubLSymbol $kw32$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO_MATCHING_X_VALUE_POIN;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$FIRST;
    private static final SubLString $str35$org_apache_commons_math_stat_regr;
    private static final SubLString $str36$addData;
    private static final SubLString $str37$double;
    private static final SubLString $str38$getSlope;
    private static final SubLString $str39$getIntercept;
    private static final SubLSymbol $sym40$MIN;
    private static final SubLSymbol $sym41$MAX;
    private static final SubLString $str42$org_apache_commons_math_analysis_;
    private static final SubLString $str43$interpolate;
    private static final SubLString $str44$_D;
    private static final SubLString $str45$org_apache_commons_math_analysis_;
    private static final SubLString $str46$value;
    private static final SubLSymbol $sym47$_;
    private static final SubLSymbol $sym48$SECOND;
    private static final SubLString $str49$org_apache_commons_math_analysis_;
    private static final SubLString $str50$predict;
    private static final SubLString $str51$getSumSquaredErrors;
    private static final SubLString $str52$org_apache_commons_math_geometry_;
    private static final SubLString $str53$org_apache_commons_math_geometry_;
    private static final SubLString $str54$intersection;
    private static final SubLString $str55$org_apache_commons_math_geometry_;
    private static final SubLString $str56$getX;
    private static final SubLString $str57$getY;
    private static final SubLObject $const58$CubicSpline;
    private static final SubLObject $const59$LinearPolynomialFunction_Piecewis;
    private static final SubLString $str60$derivative;
    private static final SubLSymbol $sym61$NON_DOTTED_LIST_P;
    private static final SubLObject $const62$setHasPointsWithYValueRelnTo;
    private static final SubLSymbol $kw63$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO;
    private static final SubLList $list64;
    private static final SubLObject $const65$operationResultComparison;
    private static final SubLSymbol $kw66$NEG;
    private static final SubLSymbol $kw67$REMOVAL_OPERATION_RESULT_COMPARISON_POS_CHECK;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$REMOVAL_OPERATION_RESULT_COMPARISON_NEG_CHECK;
    private static final SubLList $list70;
    private static final SubLObject $const71$inflowLengthsWithStartingDepths;
    private static final SubLSymbol $kw72$REMOVAL_INFLOW_LENGTHS_WITH_STARTING_DEPTHS;
    private static final SubLList $list73;
    private static final SubLObject $const74$Meter;
    private static final SubLObject $const75$DegreeCelsius;
    private static final SubLString $str76$____;
    private static final SubLList $list77;
    private static final SubLString $str78$High_value__x__A_y__A__;
    private static final SubLList $list79;
    private static final SubLString $str80$checking_x__A_deriv__A__;
    private static final SubLString $str81$Bad_looping;
    private static final SubLFloat $float82$0_5;
    private static final SubLFloat $float83$_0_5;
    private static final SubLString $str84$Got_interval___A__A___;
    private static final SubLSymbol $sym85$_;
    private static final SubLString $str86$inflow_lengths___A__;
    private static final SubLList $list87;
    private static final SubLString $str88$merged_inflow_lengths___A__;
    private static final SubLObject $const89$TheList;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 2762L)
    public static SubLObject removal_interpolation_with_cubic_spline_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        return removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(asent, (SubLObject)removal_modules_math.$sym4$JAVA_LINK_X_Y_CUBIC_SPLINE_FIND_Y_FOR_X);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 4723L)
    public static SubLObject removal_interpolation_with_piecewise_linear_polynomial_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        return removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(asent, (SubLObject)removal_modules_math.$sym8$JAVA_LINK_X_Y_PIECEWISE_LINEAR_FIND_Y_FOR_X);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 6709L)
    public static SubLObject removal_extrapolation_with_simple_linear_regression_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        return removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(asent, (SubLObject)removal_modules_math.$sym12$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 6959L)
    public static SubLObject removal_interpolation_or_extrapolation_with_java_link_function_expand_helper(final SubLObject asent, final SubLObject java_link_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject query_point = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
            final SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
            if (removal_modules_math.NIL != v_2d_points && removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_math.NIL != x_y_values && removal_modules_math.NIL != x_units && removal_modules_math.NIL != y_units) {
                    SubLObject current;
                    final SubLObject datum = current = query_point;
                    SubLObject the_2d_point = (SubLObject)removal_modules_math.NIL;
                    SubLObject query_x_value_with_units = (SubLObject)removal_modules_math.NIL;
                    SubLObject query_y_value_with_units = (SubLObject)removal_modules_math.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list14);
                    the_2d_point = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list14);
                    query_x_value_with_units = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list14);
                    query_y_value_with_units = current.first();
                    current = current.rest();
                    if (removal_modules_math.NIL == current) {
                        if (removal_modules_math.NIL != variables.not_fully_bound_p(query_y_value_with_units)) {
                            thread.resetMultipleValues();
                            final SubLObject query_x_units = quantities.explode_interval(query_x_value_with_units);
                            final SubLObject query_x_value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject normalized_query_x_value = quantities.convert_to_units_absolute(x_units, query_x_units, query_x_value, (SubLObject)removal_modules_math.UNPROVIDED);
                            final SubLObject answer_y_value = Functions.funcall(java_link_function, x_y_values, normalized_query_x_value);
                            if (removal_modules_math.NIL != answer_y_value) {
                                final SubLObject answer_y_value_with_units = quantities.make_interval(y_units, answer_y_value, (SubLObject)removal_modules_math.UNPROVIDED);
                                final SubLObject v_bindings = quantities.term_unify_with_units(query_y_value_with_units, answer_y_value_with_units);
                                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                            }
                        }
                        else {
                            final SubLObject y_x_values = Mapping.mapcar((SubLObject)removal_modules_math.$sym16$NREVERSE, x_y_values);
                            thread.resetMultipleValues();
                            final SubLObject query_y_units = quantities.explode_interval(query_y_value_with_units);
                            final SubLObject query_y_value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject normalized_query_y_value = quantities.convert_to_units_absolute(y_units, query_y_units, query_y_value, (SubLObject)removal_modules_math.UNPROVIDED);
                            final SubLObject answer_x_value = Functions.funcall(java_link_function, y_x_values, normalized_query_y_value);
                            if (removal_modules_math.NIL != answer_x_value) {
                                final SubLObject answer_x_value_with_units = quantities.make_interval(x_units, answer_x_value, (SubLObject)removal_modules_math.UNPROVIDED);
                                final SubLObject v_bindings2 = quantities.term_unify_with_units(query_x_value_with_units, answer_x_value_with_units);
                                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings2, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings2, (SubLObject)removal_modules_math.UNPROVIDED);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_math.$list14);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 10919L)
    public static SubLObject removal_extrapolation_with_simple_linear_regression_with_error_bars_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        return removal_interpolation_or_extrapolation_with_error_bars_with_java_link_function_expand_helper(asent, (SubLObject)removal_modules_math.$sym20$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X_WITH_ERROR_BARS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 11217L)
    public static SubLObject removal_interpolation_or_extrapolation_with_error_bars_with_java_link_function_expand_helper(final SubLObject asent, final SubLObject java_link_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject query_point = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject query_error_with_units = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
            final SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
            if (removal_modules_math.NIL != v_2d_points && removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_math.NIL != x_y_values && removal_modules_math.NIL != x_units && removal_modules_math.NIL != y_units) {
                    SubLObject current;
                    final SubLObject datum = current = query_point;
                    SubLObject the_2d_point = (SubLObject)removal_modules_math.NIL;
                    SubLObject query_x_value_with_units = (SubLObject)removal_modules_math.NIL;
                    SubLObject query_y_value_with_units = (SubLObject)removal_modules_math.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list14);
                    the_2d_point = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list14);
                    query_x_value_with_units = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list14);
                    query_y_value_with_units = current.first();
                    current = current.rest();
                    if (removal_modules_math.NIL == current) {
                        if (removal_modules_math.NIL != variables.not_fully_bound_p(query_y_value_with_units)) {
                            thread.resetMultipleValues();
                            final SubLObject query_x_units = quantities.explode_interval(query_x_value_with_units);
                            final SubLObject query_x_value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject normalized_query_x_value = quantities.convert_to_units_absolute(x_units, query_x_units, query_x_value, (SubLObject)removal_modules_math.UNPROVIDED);
                            thread.resetMultipleValues();
                            final SubLObject answer_y_value = Functions.funcall(java_link_function, x_y_values, normalized_query_x_value);
                            final SubLObject answer_y_error = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (removal_modules_math.NIL != answer_y_value && removal_modules_math.NIL != answer_y_error) {
                                final SubLObject answer_y_value_with_units = quantities.make_interval(y_units, answer_y_value, (SubLObject)removal_modules_math.UNPROVIDED);
                                final SubLObject answer_y_error_with_units = quantities.make_interval(y_units, answer_y_error, (SubLObject)removal_modules_math.UNPROVIDED);
                                final SubLObject v_bindings = ConsesLow.append(quantities.term_unify_with_units(query_y_value_with_units, answer_y_value_with_units), quantities.term_unify_with_units(query_error_with_units, answer_y_error_with_units));
                                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                            }
                        }
                        else {
                            final SubLObject y_x_values = Mapping.mapcar((SubLObject)removal_modules_math.$sym16$NREVERSE, x_y_values);
                            thread.resetMultipleValues();
                            final SubLObject query_y_units = quantities.explode_interval(query_y_value_with_units);
                            final SubLObject query_y_value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject normalized_query_y_value = quantities.convert_to_units_absolute(y_units, query_y_units, query_y_value, (SubLObject)removal_modules_math.UNPROVIDED);
                            thread.resetMultipleValues();
                            final SubLObject answer_x_value = Functions.funcall(java_link_function, y_x_values, normalized_query_y_value);
                            final SubLObject answer_x_error = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (removal_modules_math.NIL != answer_x_value && removal_modules_math.NIL != answer_x_error) {
                                final SubLObject answer_x_value_with_units = quantities.make_interval(x_units, answer_x_value, (SubLObject)removal_modules_math.UNPROVIDED);
                                final SubLObject answer_x_error_with_units = quantities.make_interval(x_units, answer_x_error, (SubLObject)removal_modules_math.UNPROVIDED);
                                final SubLObject v_bindings2 = ConsesLow.append(quantities.term_unify_with_units(query_x_value_with_units, answer_x_value_with_units), quantities.term_unify_with_units(query_error_with_units, answer_x_error_with_units));
                                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings2, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings2, (SubLObject)removal_modules_math.UNPROVIDED);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_math.$list14);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 15419L)
    public static SubLObject removal_regression_lines_for_sets_intersect_at_point_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_of_points_in_units_1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject set_of_points_in_units_2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject query_point = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units_1) && removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units_2)) {
            final SubLObject v_2d_points_1 = el_utilities.extensional_set_elements(set_of_points_in_units_1);
            final SubLObject v_2d_points_2 = el_utilities.extensional_set_elements(set_of_points_in_units_2);
            if (removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points_1, (SubLObject)removal_modules_math.UNPROVIDED) && removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points_2, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject x_y_values_1 = explode_2d_points_with_units(v_2d_points_1, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject x_y_values_2 = explode_2d_points_with_units(v_2d_points_2, x_units, y_units);
                thread.resetMultipleValues();
                final SubLObject x = java_link_point_intersection_of_two_x_y_regressions(x_y_values_1, x_y_values_2);
                final SubLObject y = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (x.isNumber() && y.isNumber()) {
                    if (removal_modules_math.NIL != variables.variable_p(query_point)) {
                        final SubLObject x_y_point_with_units = (SubLObject)ConsesLow.list(removal_modules_math.$const24$The2DPoint, quantities.make_interval(x_units, x, (SubLObject)removal_modules_math.UNPROVIDED), quantities.make_interval(y_units, y, (SubLObject)removal_modules_math.UNPROVIDED));
                        final SubLObject v_bindings = quantities.term_unify_with_units(query_point, x_y_point_with_units);
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                    }
                    else {
                        final SubLObject v_bindings2 = ConsesLow.append(quantities.term_unify_with_units(conses_high.second(query_point), quantities.make_interval(x_units, x, (SubLObject)removal_modules_math.UNPROVIDED)), quantities.term_unify_with_units(conses_high.third(query_point), quantities.make_interval(y_units, y, (SubLObject)removal_modules_math.UNPROVIDED)));
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings2, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings2, (SubLObject)removal_modules_math.UNPROVIDED);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 18260L)
    public static SubLObject removal_slope_of_regression_line_for_set_of_points_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject query_slope = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units) && removal_modules_math.ONE_INTEGER.numL(el_utilities.el_set_size(set_of_points_in_units))) {
            final SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
            if (removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject slope = java_link_slope_and_intercept_of_x_y_regression(x_y_values);
                final SubLObject bindings_1 = quantities.term_unify_with_units(query_slope, quantities.make_interval(quantities.unit_quotient(y_units, x_units), slope, (SubLObject)removal_modules_math.UNPROVIDED));
                final SubLObject bindings_2 = (SubLObject)((removal_modules_math.NIL != czer_utilities.equals_elP(x_units, y_units, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED)) ? removal_modules_math.NIL : quantities.term_unify_with_units(query_slope, quantities.make_interval(quantities.unit_quotient(x_units, y_units), Numbers.divide((SubLObject)removal_modules_math.ONE_INTEGER, slope), (SubLObject)removal_modules_math.UNPROVIDED)));
                if (removal_modules_math.NIL != bindings_1) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(bindings_1, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), bindings_1, (SubLObject)removal_modules_math.UNPROVIDED);
                }
                if (removal_modules_math.NIL != bindings_2) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(bindings_2, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), bindings_2, (SubLObject)removal_modules_math.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 21085L)
    public static SubLObject removal_set_of_first_derivative_points_based_on_set_of_points_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject function_type = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject set_of_derivative_points_in_units = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
            final SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
            if (removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject x_y_derivative_points = java_link_x_y_derivatives_for_interpolation_at_each_x(x_y_values, function_type);
                final SubLObject derivative_units = quantities.unit_quotient(y_units, x_units);
                SubLObject result = (SubLObject)removal_modules_math.NIL;
                SubLObject v_bindings = (SubLObject)removal_modules_math.NIL;
                SubLObject cdolist_list_var = x_y_derivative_points;
                SubLObject x_y_derivative_point = (SubLObject)removal_modules_math.NIL;
                x_y_derivative_point = cdolist_list_var.first();
                while (removal_modules_math.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removal_modules_math.$const24$The2DPoint, (SubLObject)ConsesLow.list(x_units, x_y_derivative_point.first()), (SubLObject)ConsesLow.list(derivative_units, conses_high.second(x_y_derivative_point))), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    x_y_derivative_point = cdolist_list_var.first();
                }
                result = el_utilities.make_el_extensional_set(Sequences.nreverse(result));
                v_bindings = unification_utilities.term_unify(result, set_of_derivative_points_in_units, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                if (removal_modules_math.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 24664L)
    public static SubLObject removal_set_has_points_with_y_value_reln_to_matching_x_value_points_in_set_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_of_points_1_in_units = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject set_of_points_2_in_units = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject binary_function = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject binary_predicate = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject value_in_y_units = cycl_utilities.atomic_sentence_arg5(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject set_of_qualifying_points_in_units = cycl_utilities.atomic_sentence_arg6(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_1_in_units) && removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_2_in_units) && removal_modules_math.NIL != fort_types_interface.functionP(binary_function) && arity.arity(binary_function).eql((SubLObject)removal_modules_math.TWO_INTEGER) && removal_modules_math.NIL != kb_accessors.binary_predicateP(binary_predicate)) {
            final SubLObject v_2d_points_1 = el_utilities.extensional_set_elements(set_of_points_1_in_units);
            final SubLObject v_2d_points_2 = el_utilities.extensional_set_elements(set_of_points_2_in_units);
            if (removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points_1, (SubLObject)removal_modules_math.UNPROVIDED) && removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points_2, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject x_y_values_1 = explode_2d_points_with_units(v_2d_points_1, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject x_y_values_2 = explode_2d_points_with_units(v_2d_points_2, x_units, y_units);
                final SubLObject y_compare_value = conses_high.second(quantities.cyc_quantity_conversion(y_units, value_in_y_units));
                SubLObject result_x_y_values = (SubLObject)removal_modules_math.NIL;
                SubLObject cdolist_list_var = x_y_values_1;
                SubLObject x_y_value_1 = (SubLObject)removal_modules_math.NIL;
                x_y_value_1 = cdolist_list_var.first();
                while (removal_modules_math.NIL != cdolist_list_var) {
                    final SubLObject x_value_1 = x_y_value_1.first();
                    final SubLObject y_value_1 = conses_high.second(x_y_value_1);
                    final SubLObject y_value_2 = conses_high.second(Sequences.find(x_value_1, x_y_values_2, (SubLObject)removal_modules_math.EQL, (SubLObject)removal_modules_math.$sym34$FIRST, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED));
                    if (removal_modules_math.NIL != y_value_2 && removal_modules_math.NIL != backward.removal_ask((SubLObject)ConsesLow.list(binary_predicate, (SubLObject)ConsesLow.list(binary_function, y_value_1, y_value_2), y_compare_value), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED)) {
                        result_x_y_values = (SubLObject)ConsesLow.cons(x_y_value_1, result_x_y_values);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    x_y_value_1 = cdolist_list_var.first();
                }
                SubLObject result = (SubLObject)removal_modules_math.NIL;
                SubLObject cdolist_list_var2 = result_x_y_values;
                SubLObject result_x_y_value = (SubLObject)removal_modules_math.NIL;
                result_x_y_value = cdolist_list_var2.first();
                while (removal_modules_math.NIL != cdolist_list_var2) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removal_modules_math.$const24$The2DPoint, (SubLObject)ConsesLow.list(x_units, result_x_y_value.first()), (SubLObject)ConsesLow.list(y_units, conses_high.second(result_x_y_value))), result);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    result_x_y_value = cdolist_list_var2.first();
                }
                result = el_utilities.make_el_extensional_set(Sequences.nreverse(result));
                final SubLObject v_bindings = unification_utilities.term_unify(result, set_of_qualifying_points_in_units, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                if (removal_modules_math.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 26793L)
    public static SubLObject java_link_debug_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$inference_debugP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 26967L)
    public static SubLObject java_link_slope_and_intercept_of_x_y_regression(final SubLObject x_y_values) {
        final SubLObject regression = JavaLink.java_new((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject add_data_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str36$addData, new SubLObject[] { removal_modules_math.$str37$double, removal_modules_math.$str37$double });
        final SubLObject slope_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str38$getSlope, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject intercept_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str39$getIntercept, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject cdolist_list_var = x_y_values;
        SubLObject x_y_value = (SubLObject)removal_modules_math.NIL;
        x_y_value = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            JavaLink.java_call(add_data_method, regression, new SubLObject[] { x_y_value.first(), conses_high.second(x_y_value) });
            cdolist_list_var = cdolist_list_var.rest();
            x_y_value = cdolist_list_var.first();
        }
        return Values.values(JavaLink.java_call(slope_method, regression, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY), JavaLink.java_call(intercept_method, regression, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 27719L)
    public static SubLObject java_link_x_y_cubic_spline_find_y_for_x(SubLObject x_y_values, final SubLObject x_value) {
        if (x_value.numL(Functions.apply((SubLObject)removal_modules_math.$sym40$MIN, Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values))) || x_value.numG(Functions.apply((SubLObject)removal_modules_math.$sym41$MAX, Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values))) || (removal_modules_math.NIL == java_link_debug_modeP() && removal_modules_math.NIL != list_utilities.duplicatesP(Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED))) {
            return (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject interpolator = JavaLink.java_new((SubLObject)removal_modules_math.$str42$org_apache_commons_math_analysis_, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject interpolate_method = JavaLink.java_method((SubLObject)removal_modules_math.$str42$org_apache_commons_math_analysis_, (SubLObject)removal_modules_math.$str43$interpolate, new SubLObject[] { removal_modules_math.$str44$_D, removal_modules_math.$str44$_D });
        final SubLObject value_method = JavaLink.java_method((SubLObject)removal_modules_math.$str45$org_apache_commons_math_analysis_, (SubLObject)removal_modules_math.$str46$value, new SubLObject[] { removal_modules_math.$str37$double });
        x_y_values = Sort.sort(x_y_values, (SubLObject)removal_modules_math.$sym47$_, (SubLObject)removal_modules_math.$sym34$FIRST);
        final SubLObject poly_spline_function = JavaLink.java_call(interpolate_method, interpolator, new SubLObject[] { Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values), Mapping.mapcar((SubLObject)removal_modules_math.$sym48$SECOND, x_y_values) });
        return JavaLink.java_call(value_method, poly_spline_function, new SubLObject[] { x_value });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 28657L)
    public static SubLObject java_link_x_y_piecewise_linear_find_y_for_x(SubLObject x_y_values, final SubLObject x_value) {
        if (x_value.numL(Functions.apply((SubLObject)removal_modules_math.$sym40$MIN, Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values))) || x_value.numG(Functions.apply((SubLObject)removal_modules_math.$sym41$MAX, Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values))) || (removal_modules_math.NIL == java_link_debug_modeP() && removal_modules_math.NIL != list_utilities.duplicatesP(Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED))) {
            return (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject interpolator = JavaLink.java_new((SubLObject)removal_modules_math.$str49$org_apache_commons_math_analysis_, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject interpolate_method = JavaLink.java_method((SubLObject)removal_modules_math.$str49$org_apache_commons_math_analysis_, (SubLObject)removal_modules_math.$str43$interpolate, new SubLObject[] { removal_modules_math.$str44$_D, removal_modules_math.$str44$_D });
        final SubLObject value_method = JavaLink.java_method((SubLObject)removal_modules_math.$str45$org_apache_commons_math_analysis_, (SubLObject)removal_modules_math.$str46$value, new SubLObject[] { removal_modules_math.$str37$double });
        x_y_values = Sort.sort(x_y_values, (SubLObject)removal_modules_math.$sym47$_, (SubLObject)removal_modules_math.$sym34$FIRST);
        final SubLObject poly_spline_function = JavaLink.java_call(interpolate_method, interpolator, new SubLObject[] { Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values), Mapping.mapcar((SubLObject)removal_modules_math.$sym48$SECOND, x_y_values) });
        return JavaLink.java_call(value_method, poly_spline_function, new SubLObject[] { x_value });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 29599L)
    public static SubLObject java_link_x_y_regression_find_y_for_x(final SubLObject x_y_values, final SubLObject x_value) {
        final SubLObject regression = JavaLink.java_new((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject add_data_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str36$addData, new SubLObject[] { removal_modules_math.$str37$double, removal_modules_math.$str37$double });
        final SubLObject predict_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str50$predict, new SubLObject[] { removal_modules_math.$str37$double });
        SubLObject cdolist_list_var = x_y_values;
        SubLObject x_y_value = (SubLObject)removal_modules_math.NIL;
        x_y_value = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            JavaLink.java_call(add_data_method, regression, new SubLObject[] { x_y_value.first(), conses_high.second(x_y_value) });
            cdolist_list_var = cdolist_list_var.rest();
            x_y_value = cdolist_list_var.first();
        }
        return JavaLink.java_call(predict_method, regression, new SubLObject[] { x_value });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 30201L)
    public static SubLObject java_link_x_y_regression_find_y_for_x_with_error_bars(final SubLObject x_y_values, final SubLObject x_value) {
        if (Sequences.length(x_y_values).numL((SubLObject)removal_modules_math.THREE_INTEGER)) {
            return (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject number_of_points = Sequences.length(x_y_values);
        final SubLObject regression = JavaLink.java_new((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject add_data_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str36$addData, new SubLObject[] { removal_modules_math.$str37$double, removal_modules_math.$str37$double });
        final SubLObject sse_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str51$getSumSquaredErrors, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject predict_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str50$predict, new SubLObject[] { removal_modules_math.$str37$double });
        SubLObject cdolist_list_var = x_y_values;
        SubLObject x_y_value = (SubLObject)removal_modules_math.NIL;
        x_y_value = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            JavaLink.java_call(add_data_method, regression, new SubLObject[] { x_y_value.first(), conses_high.second(x_y_value) });
            cdolist_list_var = cdolist_list_var.rest();
            x_y_value = cdolist_list_var.first();
        }
        final SubLObject sum_of_squared_errors = JavaLink.java_call(sse_method, regression, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject y_error = Numbers.sqrt(Numbers.divide(sum_of_squared_errors, Numbers.subtract(number_of_points, (SubLObject)removal_modules_math.TWO_INTEGER)));
        return Values.values(JavaLink.java_call(predict_method, regression, new SubLObject[] { x_value }), y_error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 31195L)
    public static SubLObject java_link_point_intersection_of_two_x_y_regressions(final SubLObject x_y_values_1, final SubLObject x_y_values_2) {
        if (removal_modules_math.NIL == x_y_values_1 || removal_modules_math.NIL != list_utilities.singletonP(x_y_values_1) || removal_modules_math.NIL == x_y_values_2 || removal_modules_math.NIL != list_utilities.singletonP(x_y_values_2)) {
            return (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject regression_1 = JavaLink.java_new((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject regression_2 = JavaLink.java_new((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject add_data_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str36$addData, new SubLObject[] { removal_modules_math.$str37$double, removal_modules_math.$str37$double });
        final SubLObject predict_method = JavaLink.java_method((SubLObject)removal_modules_math.$str35$org_apache_commons_math_stat_regr, (SubLObject)removal_modules_math.$str50$predict, new SubLObject[] { removal_modules_math.$str37$double });
        final SubLObject l1_p1_x = x_y_values_1.first().first();
        final SubLObject l1_p2_x = conses_high.second(x_y_values_1).first();
        final SubLObject l2_p1_x = x_y_values_2.first().first();
        final SubLObject l2_p2_x = conses_high.second(x_y_values_2).first();
        SubLObject cdolist_list_var = x_y_values_1;
        SubLObject x_y_value_1 = (SubLObject)removal_modules_math.NIL;
        x_y_value_1 = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            JavaLink.java_call(add_data_method, regression_1, new SubLObject[] { x_y_value_1.first(), conses_high.second(x_y_value_1) });
            cdolist_list_var = cdolist_list_var.rest();
            x_y_value_1 = cdolist_list_var.first();
        }
        cdolist_list_var = x_y_values_2;
        SubLObject x_y_value_2 = (SubLObject)removal_modules_math.NIL;
        x_y_value_2 = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            JavaLink.java_call(add_data_method, regression_2, new SubLObject[] { x_y_value_2.first(), conses_high.second(x_y_value_2) });
            cdolist_list_var = cdolist_list_var.rest();
            x_y_value_2 = cdolist_list_var.first();
        }
        final SubLObject l1_p1_y = JavaLink.java_call(predict_method, regression_1, new SubLObject[] { l1_p1_x });
        final SubLObject l1_p2_y = JavaLink.java_call(predict_method, regression_1, new SubLObject[] { l1_p2_x });
        final SubLObject l2_p1_y = JavaLink.java_call(predict_method, regression_2, new SubLObject[] { l2_p1_x });
        final SubLObject l2_p2_y = JavaLink.java_call(predict_method, regression_2, new SubLObject[] { l2_p2_x });
        final SubLObject line_class_name = (SubLObject)removal_modules_math.$str52$org_apache_commons_math_geometry_;
        final SubLObject vector2d_class_name = (SubLObject)removal_modules_math.$str53$org_apache_commons_math_geometry_;
        final SubLObject line_new_method = JavaLink.java_method(line_class_name, (SubLObject)removal_modules_math.NIL, new SubLObject[] { vector2d_class_name, vector2d_class_name });
        final SubLObject vector2d_new_method = JavaLink.java_method(vector2d_class_name, (SubLObject)removal_modules_math.NIL, new SubLObject[] { removal_modules_math.$str37$double, removal_modules_math.$str37$double });
        final SubLObject line_1 = JavaLink.java_new(line_new_method, new SubLObject[] { JavaLink.java_new(vector2d_new_method, new SubLObject[] { l1_p1_x, l1_p1_y }), JavaLink.java_new(vector2d_new_method, new SubLObject[] { l1_p2_x, l1_p2_y }) });
        final SubLObject line_2 = JavaLink.java_new(line_new_method, new SubLObject[] { JavaLink.java_new(vector2d_new_method, new SubLObject[] { l2_p1_x, l2_p1_y }), JavaLink.java_new(vector2d_new_method, new SubLObject[] { l2_p2_x, l2_p2_y }) });
        final SubLObject intersection_method = JavaLink.java_method(line_class_name, (SubLObject)removal_modules_math.$str54$intersection, new SubLObject[] { removal_modules_math.$str55$org_apache_commons_math_geometry_ });
        final SubLObject intersection_2dvector = JavaLink.java_call(intersection_method, line_1, new SubLObject[] { line_2 });
        if (removal_modules_math.NIL != intersection_2dvector) {
            final SubLObject vector2d_getx_method = JavaLink.java_method(vector2d_class_name, (SubLObject)removal_modules_math.$str56$getX, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
            final SubLObject vector2d_gety_method = JavaLink.java_method(vector2d_class_name, (SubLObject)removal_modules_math.$str57$getY, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
            return Values.values(JavaLink.java_call(vector2d_getx_method, intersection_2dvector, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY), JavaLink.java_call(vector2d_gety_method, intersection_2dvector, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY));
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 33751L)
    public static SubLObject java_link_x_y_derivatives_for_interpolation_at_each_x(SubLObject x_y_values, final SubLObject interpolator) {
        if (removal_modules_math.NIL == java_link_debug_modeP() && removal_modules_math.NIL != list_utilities.duplicatesP(Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED)) {
            return (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject interpolator_string = (SubLObject)(interpolator.eql(removal_modules_math.$const58$CubicSpline) ? removal_modules_math.$str42$org_apache_commons_math_analysis_ : (interpolator.eql(removal_modules_math.$const59$LinearPolynomialFunction_Piecewis) ? removal_modules_math.$str49$org_apache_commons_math_analysis_ : removal_modules_math.$str42$org_apache_commons_math_analysis_));
        final SubLObject interpolator_$1 = JavaLink.java_new(interpolator_string, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject interpolate_method = JavaLink.java_method(interpolator_string, (SubLObject)removal_modules_math.$str43$interpolate, new SubLObject[] { removal_modules_math.$str44$_D, removal_modules_math.$str44$_D });
        final SubLObject value_method = JavaLink.java_method((SubLObject)removal_modules_math.$str45$org_apache_commons_math_analysis_, (SubLObject)removal_modules_math.$str46$value, new SubLObject[] { removal_modules_math.$str37$double });
        final SubLObject derivative_method = JavaLink.java_method((SubLObject)removal_modules_math.$str45$org_apache_commons_math_analysis_, (SubLObject)removal_modules_math.$str60$derivative, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject derivative_x_y_values = (SubLObject)removal_modules_math.NIL;
        x_y_values = Sort.sort(conses_high.copy_list(x_y_values), (SubLObject)removal_modules_math.$sym47$_, (SubLObject)removal_modules_math.$sym34$FIRST);
        final SubLObject poly_spline_function = JavaLink.java_call(interpolate_method, interpolator_$1, new SubLObject[] { Mapping.mapcar((SubLObject)removal_modules_math.$sym34$FIRST, x_y_values), Mapping.mapcar((SubLObject)removal_modules_math.$sym48$SECOND, x_y_values) });
        final SubLObject poly_spline_derivative = JavaLink.java_call(derivative_method, poly_spline_function, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject cdolist_list_var = x_y_values;
        SubLObject x_y_value = (SubLObject)removal_modules_math.NIL;
        x_y_value = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            final SubLObject x_value = x_y_value.first();
            derivative_x_y_values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(x_value, JavaLink.java_call(value_method, poly_spline_derivative, new SubLObject[] { x_value })), derivative_x_y_values);
            cdolist_list_var = cdolist_list_var.rest();
            x_y_value = cdolist_list_var.first();
        }
        return Sequences.nreverse(derivative_x_y_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 35966L)
    public static SubLObject el_2d_point_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_math.NIL != el_utilities.el_formula_p(v_object) && cycl_utilities.formula_operator(v_object).eql(removal_modules_math.$const24$The2DPoint) && removal_modules_math.NIL != el_utilities.el_binary_formula_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 36227L)
    public static SubLObject explode_2d_points_with_units(final SubLObject v_2d_points, SubLObject x_units, SubLObject y_units) {
        if (x_units == removal_modules_math.UNPROVIDED) {
            x_units = (SubLObject)removal_modules_math.NIL;
        }
        if (y_units == removal_modules_math.UNPROVIDED) {
            y_units = (SubLObject)removal_modules_math.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_math.NIL != list_utilities.non_dotted_list_p(v_2d_points) : v_2d_points;
        SubLObject cdolist_list_var = v_2d_points;
        SubLObject elem = (SubLObject)removal_modules_math.NIL;
        elem = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            assert removal_modules_math.NIL != el_2d_point_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject x_y_values = (SubLObject)removal_modules_math.NIL;
        cdolist_list_var = v_2d_points;
        SubLObject v_2d_point = (SubLObject)removal_modules_math.NIL;
        v_2d_point = cdolist_list_var.first();
        while (removal_modules_math.NIL != cdolist_list_var) {
            final SubLObject x_y_with_units = cycl_utilities.formula_args(v_2d_point, (SubLObject)removal_modules_math.UNPROVIDED);
            final SubLObject x_with_units = x_y_with_units.first();
            final SubLObject y_with_units = conses_high.second(x_y_with_units);
            thread.resetMultipleValues();
            final SubLObject this_x_units = quantities.explode_interval(x_with_units);
            SubLObject this_x_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_math.NIL == x_units) {
                x_units = this_x_units;
            }
            if (!x_units.equal(this_x_units)) {
                this_x_value = quantities.convert_to_units_absolute(x_units, this_x_units, this_x_value, (SubLObject)removal_modules_math.UNPROVIDED);
            }
            thread.resetMultipleValues();
            final SubLObject this_y_units = quantities.explode_interval(y_with_units);
            SubLObject this_y_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_math.NIL == y_units) {
                y_units = this_y_units;
            }
            if (!y_units.equal(this_y_units)) {
                this_y_value = quantities.convert_to_units_absolute(y_units, this_y_units, this_y_value, (SubLObject)removal_modules_math.UNPROVIDED);
            }
            x_y_values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(this_x_value, this_y_value), x_y_values);
            cdolist_list_var = cdolist_list_var.rest();
            v_2d_point = cdolist_list_var.first();
        }
        return Values.values(x_y_values, x_units, y_units);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 38878L)
    public static SubLObject removal_set_has_points_with_y_value_reln_to_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject operator = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject comparator = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject quant1 = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject quant2 = cycl_utilities.atomic_sentence_arg5(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject newset_var = cycl_utilities.atomic_sentence_arg6(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units) && removal_modules_math.NIL != fort_types_interface.functionP(operator) && removal_modules_math.NIL != relation_evaluation.evaluatable_predicateP(comparator, (SubLObject)removal_modules_math.UNPROVIDED) && arity.arity(comparator).eql((SubLObject)removal_modules_math.TWO_INTEGER)) {
            final SubLObject x_y_values_with_units = el_utilities.extensional_set_elements(set_of_points_in_units);
            SubLObject result_points = (SubLObject)removal_modules_math.NIL;
            if (removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, x_y_values_with_units, (SubLObject)removal_modules_math.UNPROVIDED)) {
                SubLObject cdolist_list_var = x_y_values_with_units;
                SubLObject x_y_value_with_units = (SubLObject)removal_modules_math.NIL;
                x_y_value_with_units = cdolist_list_var.first();
                while (removal_modules_math.NIL != cdolist_list_var) {
                    final SubLObject y_value = cycl_utilities.formula_arg2(x_y_value_with_units, (SubLObject)removal_modules_math.UNPROVIDED);
                    if (removal_modules_math.NIL != relation_evaluation.cyc_evaluate((SubLObject)ConsesLow.list(comparator, (SubLObject)ConsesLow.list(operator, y_value, quant1), quant2))) {
                        result_points = (SubLObject)ConsesLow.cons(x_y_value_with_units, result_points);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    x_y_value_with_units = cdolist_list_var.first();
                }
            }
            if (removal_modules_math.NIL != result_points) {
                final SubLObject v_bindings = unification_utilities.term_unify(el_utilities.make_el_set(list_utilities.fast_remove_duplicates(result_points, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), (SubLObject)removal_modules_math.UNPROVIDED), newset_var, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                if (removal_modules_math.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 41158L)
    public static SubLObject removal_operation_result_comparison_pos_check(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject operator = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject a = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject b = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject comparator = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject quant = cycl_utilities.atomic_sentence_arg5(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != fort_types_interface.functionP(operator) && removal_modules_math.NIL != relation_evaluation.evaluatable_predicateP(comparator, (SubLObject)removal_modules_math.UNPROVIDED) && arity.arity(comparator).eql((SubLObject)removal_modules_math.TWO_INTEGER)) {
            final SubLObject expression = (SubLObject)ConsesLow.list(comparator, (SubLObject)ConsesLow.list(operator, a, b), quant);
            if (removal_modules_math.NIL != relation_evaluation.cyc_evaluate(expression)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, asent, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), (SubLObject)removal_modules_math.NIL, (SubLObject)ConsesLow.list(removal_modules_evaluation.make_eval_support(expression, (SubLObject)removal_modules_math.UNPROVIDED)));
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 42485L)
    public static SubLObject removal_operation_result_comparison_neg_check(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLObject operator = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject a = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject b = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject comparator = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject quant = cycl_utilities.atomic_sentence_arg5(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        if (removal_modules_math.NIL != fort_types_interface.functionP(operator) && removal_modules_math.NIL != relation_evaluation.evaluatable_predicateP(comparator, (SubLObject)removal_modules_math.UNPROVIDED) && arity.arity(comparator).eql((SubLObject)removal_modules_math.TWO_INTEGER)) {
            final SubLObject expression = (SubLObject)ConsesLow.list(comparator, (SubLObject)ConsesLow.list(operator, a, b), quant);
            if (removal_modules_math.NIL == relation_evaluation.cyc_evaluate(expression)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, el_utilities.make_negation(asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), (SubLObject)removal_modules_math.NIL, (SubLObject)ConsesLow.list(removal_modules_evaluation.make_eval_support(el_utilities.make_negation(expression), (SubLObject)removal_modules_math.UNPROVIDED)));
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-math.lisp", position = 45181L)
    public static SubLObject removal_inflow_lengths_with_starting_depths_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_math.UNPROVIDED) {
            sense = (SubLObject)removal_modules_math.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject well = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject set_of_points_in_units = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject function_type = removal_modules_math.$const58$CubicSpline;
        final SubLObject length_and_depths_query = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_math.UNPROVIDED);
        final SubLObject debugP = (SubLObject)removal_modules_math.NIL;
        if (removal_modules_math.NIL != el_utilities.el_extensional_set_p(set_of_points_in_units)) {
            final SubLObject v_2d_points = el_utilities.extensional_set_elements(set_of_points_in_units);
            if (removal_modules_math.NIL != list_utilities.every_in_list((SubLObject)removal_modules_math.$sym13$EL_2D_POINT_P, v_2d_points, (SubLObject)removal_modules_math.UNPROVIDED)) {
                thread.resetMultipleValues();
                SubLObject x_y_values = explode_2d_points_with_units(v_2d_points, removal_modules_math.$const74$Meter, removal_modules_math.$const75$DegreeCelsius);
                final SubLObject x_units = thread.secondMultipleValue();
                final SubLObject y_units = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                x_y_values = Sort.sort(conses_high.copy_list(x_y_values), (SubLObject)removal_modules_math.$sym47$_, (SubLObject)removal_modules_math.$sym34$FIRST);
                final SubLObject x_y_derivative_points = java_link_x_y_derivatives_for_interpolation_at_each_x(x_y_values, function_type);
                final SubLObject average_y_value = number_utilities.average(x_y_values, (SubLObject)removal_modules_math.$sym48$SECOND);
                final SubLObject derivative_units = quantities.unit_quotient(y_units, x_units);
                SubLObject inflow_lengths = (SubLObject)removal_modules_math.NIL;
                if (removal_modules_math.NIL != debugP) {
                    print_high.print(x_y_values, (SubLObject)removal_modules_math.UNPROVIDED);
                    print_high.print(x_y_derivative_points, (SubLObject)removal_modules_math.UNPROVIDED);
                    format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str76$____, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                }
                SubLObject cdolist_list_var = Sort.sort(conses_high.copy_list(x_y_values), (SubLObject)removal_modules_math.$sym85$_, (SubLObject)removal_modules_math.$sym48$SECOND);
                SubLObject x_y_value = (SubLObject)removal_modules_math.NIL;
                x_y_value = cdolist_list_var.first();
                while (removal_modules_math.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = x_y_value;
                    SubLObject x_value = (SubLObject)removal_modules_math.NIL;
                    SubLObject y_value = (SubLObject)removal_modules_math.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list77);
                    x_value = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_math.$list77);
                    y_value = current.first();
                    current = current.rest();
                    if (removal_modules_math.NIL == current) {
                        if (removal_modules_math.NIL != debugP) {
                            format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str78$High_value__x__A_y__A__, x_value, y_value, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                        }
                        if (y_value.numG(Numbers.add((SubLObject)removal_modules_math.FIVE_INTEGER, average_y_value))) {
                            SubLObject already_in_inflowP = (SubLObject)removal_modules_math.NIL;
                            SubLObject inflow_start_x = (SubLObject)removal_modules_math.NIL;
                            SubLObject inflow_end_x = (SubLObject)removal_modules_math.NIL;
                            if (removal_modules_math.NIL == already_in_inflowP) {
                                SubLObject csome_list_var = inflow_lengths;
                                SubLObject inflow_length = (SubLObject)removal_modules_math.NIL;
                                inflow_length = csome_list_var.first();
                                while (removal_modules_math.NIL == already_in_inflowP && removal_modules_math.NIL != csome_list_var) {
                                    if (x_value.numGE(inflow_length.first()) && x_value.numLE(conses_high.second(inflow_length))) {
                                        already_in_inflowP = (SubLObject)removal_modules_math.T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    inflow_length = csome_list_var.first();
                                }
                            }
                            if (removal_modules_math.NIL == already_in_inflowP) {
                                SubLObject found_start_pointP = (SubLObject)removal_modules_math.NIL;
                                if (removal_modules_math.NIL == found_start_pointP) {
                                    SubLObject cur_x_y_value = (SubLObject)removal_modules_math.NIL;
                                    SubLObject cur_x_y_value_$2 = (SubLObject)removal_modules_math.NIL;
                                    SubLObject cur_x_y_derivative_point = (SubLObject)removal_modules_math.NIL;
                                    SubLObject cur_x_y_derivative_point_$3 = (SubLObject)removal_modules_math.NIL;
                                    cur_x_y_value = Sequences.nreverse(conses_high.copy_list(x_y_values));
                                    cur_x_y_value_$2 = cur_x_y_value.first();
                                    cur_x_y_derivative_point = Sequences.nreverse(conses_high.copy_list(x_y_derivative_points));
                                    cur_x_y_derivative_point_$3 = cur_x_y_derivative_point.first();
                                    while (removal_modules_math.NIL == found_start_pointP && (removal_modules_math.NIL != cur_x_y_derivative_point || removal_modules_math.NIL != cur_x_y_value)) {
                                        SubLObject current_$5;
                                        final SubLObject datum_$4 = current_$5 = cur_x_y_derivative_point_$3;
                                        SubLObject cur_x_value = (SubLObject)removal_modules_math.NIL;
                                        SubLObject cur_y_derivative_value = (SubLObject)removal_modules_math.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)removal_modules_math.$list79);
                                        cur_x_value = current_$5.first();
                                        current_$5 = current_$5.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)removal_modules_math.$list79);
                                        cur_y_derivative_value = current_$5.first();
                                        current_$5 = current_$5.rest();
                                        if (removal_modules_math.NIL == current_$5) {
                                            final SubLObject cur_y_value = conses_high.second(cur_x_y_value_$2);
                                            if (removal_modules_math.NIL != debugP) {
                                                format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str80$checking_x__A_deriv__A__, cur_x_value, cur_y_derivative_value, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                                                if (!cur_x_value.eql(cur_x_y_value_$2.first())) {
                                                    print_high.print((SubLObject)removal_modules_math.$str81$Bad_looping, (SubLObject)removal_modules_math.UNPROVIDED);
                                                    Errors.sublisp_break((SubLObject)removal_modules_math.UNPROVIDED, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
                                                }
                                            }
                                            if (cur_y_derivative_value.numGE((SubLObject)removal_modules_math.$float82$0_5) && cur_x_value.numL(x_value)) {
                                                found_start_pointP = (SubLObject)removal_modules_math.T;
                                                inflow_start_x = cur_x_value;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$4, (SubLObject)removal_modules_math.$list79);
                                        }
                                        cur_x_y_value = cur_x_y_value.rest();
                                        cur_x_y_value_$2 = cur_x_y_value.first();
                                        cur_x_y_derivative_point = cur_x_y_derivative_point.rest();
                                        cur_x_y_derivative_point_$3 = cur_x_y_derivative_point.first();
                                    }
                                }
                                SubLObject found_end_pointP = (SubLObject)removal_modules_math.NIL;
                                if (removal_modules_math.NIL == found_end_pointP) {
                                    SubLObject cur_x_y_value = (SubLObject)removal_modules_math.NIL;
                                    SubLObject cur_x_y_value_$3 = (SubLObject)removal_modules_math.NIL;
                                    SubLObject cur_x_y_derivative_point = (SubLObject)removal_modules_math.NIL;
                                    SubLObject cur_x_y_derivative_point_$4 = (SubLObject)removal_modules_math.NIL;
                                    cur_x_y_value = x_y_values;
                                    cur_x_y_value_$3 = cur_x_y_value.first();
                                    cur_x_y_derivative_point = x_y_derivative_points;
                                    cur_x_y_derivative_point_$4 = cur_x_y_derivative_point.first();
                                    while (removal_modules_math.NIL == found_end_pointP && (removal_modules_math.NIL != cur_x_y_derivative_point || removal_modules_math.NIL != cur_x_y_value)) {
                                        SubLObject current_$6;
                                        final SubLObject datum_$5 = current_$6 = cur_x_y_derivative_point_$4;
                                        SubLObject cur_x_value = (SubLObject)removal_modules_math.NIL;
                                        SubLObject cur_y_derivative_value = (SubLObject)removal_modules_math.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)removal_modules_math.$list79);
                                        cur_x_value = current_$6.first();
                                        current_$6 = current_$6.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)removal_modules_math.$list79);
                                        cur_y_derivative_value = current_$6.first();
                                        current_$6 = current_$6.rest();
                                        if (removal_modules_math.NIL == current_$6) {
                                            final SubLObject cur_y_value = conses_high.second(cur_x_y_value_$3);
                                            if (removal_modules_math.NIL != debugP) {
                                                format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str80$checking_x__A_deriv__A__, cur_x_value, cur_y_derivative_value, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                                                if (!cur_x_value.eql(cur_x_y_value_$3.first())) {
                                                    print_high.print((SubLObject)removal_modules_math.$str81$Bad_looping, (SubLObject)removal_modules_math.UNPROVIDED);
                                                    Errors.sublisp_break((SubLObject)removal_modules_math.UNPROVIDED, removal_modules_math.EMPTY_SUBL_OBJECT_ARRAY);
                                                }
                                            }
                                            if (cur_y_derivative_value.numLE((SubLObject)removal_modules_math.$float83$_0_5) && cur_x_value.numG(x_value)) {
                                                found_end_pointP = (SubLObject)removal_modules_math.T;
                                                inflow_end_x = cur_x_value;
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)removal_modules_math.$list79);
                                        }
                                        cur_x_y_value = cur_x_y_value.rest();
                                        cur_x_y_value_$3 = cur_x_y_value.first();
                                        cur_x_y_derivative_point = cur_x_y_derivative_point.rest();
                                        cur_x_y_derivative_point_$4 = cur_x_y_derivative_point.first();
                                    }
                                }
                            }
                            if (removal_modules_math.NIL != inflow_start_x && removal_modules_math.NIL != inflow_end_x) {
                                if (removal_modules_math.NIL != debugP) {
                                    format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str84$Got_interval___A__A___, inflow_start_x, inflow_end_x, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                                }
                                inflow_lengths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inflow_start_x, inflow_end_x), inflow_lengths);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_math.$list77);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    x_y_value = cdolist_list_var.first();
                }
                inflow_lengths = Sort.sort(inflow_lengths, (SubLObject)removal_modules_math.$sym47$_, (SubLObject)removal_modules_math.$sym34$FIRST);
                if (removal_modules_math.NIL != debugP) {
                    format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str86$inflow_lengths___A__, inflow_lengths, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                }
                SubLObject merged_inflow_lengths = (SubLObject)removal_modules_math.NIL;
                SubLObject cur_start = (SubLObject)removal_modules_math.NIL;
                SubLObject cur_end = (SubLObject)removal_modules_math.NIL;
                SubLObject cdolist_list_var2 = inflow_lengths;
                SubLObject inflow_length2 = (SubLObject)removal_modules_math.NIL;
                inflow_length2 = cdolist_list_var2.first();
                while (removal_modules_math.NIL != cdolist_list_var2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = inflow_length2;
                    SubLObject start = (SubLObject)removal_modules_math.NIL;
                    SubLObject end = (SubLObject)removal_modules_math.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)removal_modules_math.$list87);
                    start = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)removal_modules_math.$list87);
                    end = current2.first();
                    current2 = current2.rest();
                    if (removal_modules_math.NIL == current2) {
                        if (removal_modules_math.NIL != cur_start && removal_modules_math.NIL != cur_end) {
                            if (start.numLE(cur_end)) {
                                cur_end = end;
                            }
                            else {
                                merged_inflow_lengths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cur_start, cur_end), merged_inflow_lengths);
                                cur_start = start;
                                cur_end = end;
                            }
                        }
                        else {
                            cur_start = start;
                            cur_end = end;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)removal_modules_math.$list87);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    inflow_length2 = cdolist_list_var2.first();
                }
                if (removal_modules_math.NIL != cur_start && removal_modules_math.NIL != cur_end) {
                    merged_inflow_lengths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cur_start, cur_end), merged_inflow_lengths);
                }
                if (removal_modules_math.NIL != debugP) {
                    format_nil.force_format((SubLObject)removal_modules_math.T, (SubLObject)removal_modules_math.$str88$merged_inflow_lengths___A__, merged_inflow_lengths, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                }
                inflow_lengths = merged_inflow_lengths;
                SubLObject result = (SubLObject)removal_modules_math.NIL;
                SubLObject cdolist_list_var3 = inflow_lengths;
                SubLObject result_inflow_length = (SubLObject)removal_modules_math.NIL;
                result_inflow_length = cdolist_list_var3.first();
                while (removal_modules_math.NIL != cdolist_list_var3) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removal_modules_math.$const89$TheList, (SubLObject)ConsesLow.list(x_units, result_inflow_length.first()), (SubLObject)ConsesLow.list(x_units, Numbers.subtract(conses_high.second(result_inflow_length), result_inflow_length.first()))), result);
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    result_inflow_length = cdolist_list_var3.first();
                }
                result = el_utilities.make_el_list(result, (SubLObject)removal_modules_math.UNPROVIDED);
                final SubLObject v_bindings = unification_utilities.term_unify(result, length_and_depths_query, (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED);
                if (removal_modules_math.NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_math.$kw15$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_math.UNPROVIDED, (SubLObject)removal_modules_math.UNPROVIDED), v_bindings, (SubLObject)removal_modules_math.UNPROVIDED);
                }
            }
        }
        return (SubLObject)removal_modules_math.NIL;
    }
    
    public static SubLObject declare_removal_modules_math_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_interpolation_with_cubic_spline_expand", "REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_interpolation_with_piecewise_linear_polynomial_expand", "REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_extrapolation_with_simple_linear_regression_expand", "REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_interpolation_or_extrapolation_with_java_link_function_expand_helper", "REMOVAL-INTERPOLATION-OR-EXTRAPOLATION-WITH-JAVA-LINK-FUNCTION-EXPAND-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_extrapolation_with_simple_linear_regression_with_error_bars_expand", "REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-WITH-ERROR-BARS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_interpolation_or_extrapolation_with_error_bars_with_java_link_function_expand_helper", "REMOVAL-INTERPOLATION-OR-EXTRAPOLATION-WITH-ERROR-BARS-WITH-JAVA-LINK-FUNCTION-EXPAND-HELPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_regression_lines_for_sets_intersect_at_point_expand", "REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_slope_of_regression_line_for_set_of_points_expand", "REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_set_of_first_derivative_points_based_on_set_of_points_expand", "REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_set_has_points_with_y_value_reln_to_matching_x_value_points_in_set_expand", "REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_debug_modeP", "JAVA-LINK-DEBUG-MODE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_slope_and_intercept_of_x_y_regression", "JAVA-LINK-SLOPE-AND-INTERCEPT-OF-X-Y-REGRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_x_y_cubic_spline_find_y_for_x", "JAVA-LINK-X-Y-CUBIC-SPLINE-FIND-Y-FOR-X", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_x_y_piecewise_linear_find_y_for_x", "JAVA-LINK-X-Y-PIECEWISE-LINEAR-FIND-Y-FOR-X", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_x_y_regression_find_y_for_x", "JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_x_y_regression_find_y_for_x_with_error_bars", "JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X-WITH-ERROR-BARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_point_intersection_of_two_x_y_regressions", "JAVA-LINK-POINT-INTERSECTION-OF-TWO-X-Y-REGRESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "java_link_x_y_derivatives_for_interpolation_at_each_x", "JAVA-LINK-X-Y-DERIVATIVES-FOR-INTERPOLATION-AT-EACH-X", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "el_2d_point_p", "EL-2D-POINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "explode_2d_points_with_units", "EXPLODE-2D-POINTS-WITH-UNITS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_set_has_points_with_y_value_reln_to_expand", "REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_operation_result_comparison_pos_check", "REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_operation_result_comparison_neg_check", "REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_math", "removal_inflow_lengths_with_starting_depths_expand", "REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_math.NIL;
    }
    
    public static SubLObject init_removal_modules_math_file() {
        removal_modules_math.$default_math_module_cost$ = SubLFiles.defparameter("*DEFAULT-MATH-MODULE-COST*", control_vars.$typical_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_math.NIL;
    }
    
    public static SubLObject setup_removal_modules_math_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const0$interpolationWithCubicSpline);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const0$interpolationWithCubicSpline, (SubLObject)removal_modules_math.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw2$REMOVAL_INTERPOLATION_WITH_CUBIC_SPLINE, (SubLObject)removal_modules_math.$list3);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const5$interpolationWithPiecewiseLinearP);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const5$interpolationWithPiecewiseLinearP, (SubLObject)removal_modules_math.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw6$REMOVAL_INTERPOLATION_WITH_PIECEWISE_LINEAR_POLYNOMIAL, (SubLObject)removal_modules_math.$list7);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const9$extrapolationWithSimpleLinearRegr);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const9$extrapolationWithSimpleLinearRegr, (SubLObject)removal_modules_math.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw10$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION, (SubLObject)removal_modules_math.$list11);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const17$extrapolationWithSimpleLinearRegr);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const17$extrapolationWithSimpleLinearRegr, (SubLObject)removal_modules_math.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw18$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION_WITH_ERROR_BA, (SubLObject)removal_modules_math.$list19);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const21$regressionLinesForSetsIntersectAt);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const21$regressionLinesForSetsIntersectAt, (SubLObject)removal_modules_math.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const21$regressionLinesForSetsIntersectAt, (SubLObject)removal_modules_math.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw22$REMOVAL_REGRESSION_LINES_FOR_SETS_INTERSECT_AT_POINT, (SubLObject)removal_modules_math.$list23);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const25$slopeOfRegressionLineForSetOfPoin);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const25$slopeOfRegressionLineForSetOfPoin, (SubLObject)removal_modules_math.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw26$REMOVAL_SLOPE_OF_REGRESSION_LINE_FOR_SET_OF_POINTS, (SubLObject)removal_modules_math.$list27);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const28$setOfFirstDerivativePointsBasedOn);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const28$setOfFirstDerivativePointsBasedOn, (SubLObject)removal_modules_math.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const28$setOfFirstDerivativePointsBasedOn, (SubLObject)removal_modules_math.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw29$REMOVAL_SET_OF_FIRST_DERIVATIVE_POINTS_BASED_ON_SET_OF_POINTS, (SubLObject)removal_modules_math.$list30);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const31$setHasPointsWithYValueRelnToMatch);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const31$setHasPointsWithYValueRelnToMatch, (SubLObject)removal_modules_math.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const31$setHasPointsWithYValueRelnToMatch, (SubLObject)removal_modules_math.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const31$setHasPointsWithYValueRelnToMatch, (SubLObject)removal_modules_math.THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const31$setHasPointsWithYValueRelnToMatch, (SubLObject)removal_modules_math.FOUR_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const31$setHasPointsWithYValueRelnToMatch, (SubLObject)removal_modules_math.FIVE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw32$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO_MATCHING_X_VALUE_POIN, (SubLObject)removal_modules_math.$list33);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const62$setHasPointsWithYValueRelnTo);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const62$setHasPointsWithYValueRelnTo, (SubLObject)removal_modules_math.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const62$setHasPointsWithYValueRelnTo, (SubLObject)removal_modules_math.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const62$setHasPointsWithYValueRelnTo, (SubLObject)removal_modules_math.THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const62$setHasPointsWithYValueRelnTo, (SubLObject)removal_modules_math.FOUR_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const62$setHasPointsWithYValueRelnTo, (SubLObject)removal_modules_math.FIVE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw63$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO, (SubLObject)removal_modules_math.$list64);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const65$operationResultComparison);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const65$operationResultComparison);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_math.$kw66$NEG, removal_modules_math.$const65$operationResultComparison);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw67$REMOVAL_OPERATION_RESULT_COMPARISON_POS_CHECK, (SubLObject)removal_modules_math.$list68);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw69$REMOVAL_OPERATION_RESULT_COMPARISON_NEG_CHECK, (SubLObject)removal_modules_math.$list70);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_math.$const71$inflowLengthsWithStartingDepths);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const71$inflowLengthsWithStartingDepths, (SubLObject)removal_modules_math.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_math.$kw1$POS, removal_modules_math.$const71$inflowLengthsWithStartingDepths, (SubLObject)removal_modules_math.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_math.$kw72$REMOVAL_INFLOW_LENGTHS_WITH_STARTING_DEPTHS, (SubLObject)removal_modules_math.$list73);
        return (SubLObject)removal_modules_math.NIL;
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
        me = (SubLFile)new removal_modules_math();
        removal_modules_math.$default_math_module_cost$ = null;
        $const0$interpolationWithCubicSpline = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpolationWithCubicSpline"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_INTERPOLATION_WITH_CUBIC_SPLINE = SubLObjectFactory.makeKeyword("REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpolationWithCubicSpline")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpolationWithCubicSpline")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-INTERPOLATION-WITH-CUBIC-SPLINE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$interpolationWithCubicSpline <set-of-points> <2d-point-with-x-or-y-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$interpolationWithCubicSpline \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
        $sym4$JAVA_LINK_X_Y_CUBIC_SPLINE_FIND_Y_FOR_X = SubLObjectFactory.makeSymbol("JAVA-LINK-X-Y-CUBIC-SPLINE-FIND-Y-FOR-X");
        $const5$interpolationWithPiecewiseLinearP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpolationWithPiecewiseLinearPolynomial"));
        $kw6$REMOVAL_INTERPOLATION_WITH_PIECEWISE_LINEAR_POLYNOMIAL = SubLObjectFactory.makeKeyword("REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpolationWithPiecewiseLinearPolynomial")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpolationWithPiecewiseLinearPolynomial")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-INTERPOLATION-WITH-PIECEWISE-LINEAR-POLYNOMIAL-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$interpolationWithPiecewiseLinearPolynomial <set-of-points> <2d-point-with-x-or-y-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$interpolationWithPiecewiseLinearPolynomial \n    (#$TheSet \n     (#$The2DPoint \n      (#$Meter 440.1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$Meter 441.1) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$Meter 442.3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$Meter 443.6) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$Meter 444.9) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$Meter 445.8) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$Meter 446.7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$Meter 447.9) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$Meter 445.0) \n     (#$DegreeCelsius ?VALUE)))") });
        $sym8$JAVA_LINK_X_Y_PIECEWISE_LINEAR_FIND_Y_FOR_X = SubLObjectFactory.makeSymbol("JAVA-LINK-X-Y-PIECEWISE-LINEAR-FIND-Y-FOR-X");
        $const9$extrapolationWithSimpleLinearRegr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegression"));
        $kw10$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION = SubLObjectFactory.makeKeyword("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegression")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegression")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extrapolationWithSimpleLinearRegression <set-of-points> <2d-point-with-x-or-y-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extrapolationWithSimpleLinearRegression \n    (#$TheSet \n     (#$The2DPoint \n      (#$DaysDuration 1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$DaysDuration 2) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$DaysDuration 3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$DaysDuration 4) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$DaysDuration 5) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$DaysDuration 6) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$DaysDuration 7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$DaysDuration 8) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$DaysDuration ?VALUE) \n     (#$DegreeCelsius 200)))") });
        $sym12$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X = SubLObjectFactory.makeSymbol("JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X");
        $sym13$EL_2D_POINT_P = SubLObjectFactory.makeSymbol("EL-2D-POINT-P");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-2D-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-X-VALUE-WITH-UNITS"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-Y-VALUE-WITH-UNITS"));
        $kw15$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym16$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $const17$extrapolationWithSimpleLinearRegr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegressionWithErrorBars"));
        $kw18$REMOVAL_EXTRAPOLATION_WITH_SIMPLE_LINEAR_REGRESSION_WITH_ERROR_BA = SubLObjectFactory.makeKeyword("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-WITH-ERROR-BARS");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegressionWithErrorBars")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extrapolationWithSimpleLinearRegressionWithErrorBars")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXTRAPOLATION-WITH-SIMPLE-LINEAR-REGRESSION-WITH-ERROR-BARS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$extrapolationWithSimpleLinearRegressionWithErrorBars <set-of-points> <2d-point-with-x-or-y-bound> <error-term-unbound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$extrapolationWithSimpleLinearRegressionWithErrorBars\n    (#$TheSet \n     (#$The2DPoint \n      (#$DaysDuration 1) \n      (#$DegreeCelsius 160.3)) \n     (#$The2DPoint \n      (#$DaysDuration 2) \n      (#$DegreeCelsius 161.4)) \n     (#$The2DPoint \n      (#$DaysDuration 3) \n      (#$DegreeCelsius 163.6)) \n     (#$The2DPoint \n      (#$DaysDuration 4) \n      (#$DegreeCelsius 165.5)) \n     (#$The2DPoint \n      (#$DaysDuration 5) \n      (#$DegreeCelsius 166.4)) \n     (#$The2DPoint \n      (#$DaysDuration 6) \n      (#$DegreeCelsius 166.3)) \n     (#$The2DPoint \n      (#$DaysDuration 7) \n      (#$DegreeCelsius 165.4)) \n     (#$The2DPoint \n      (#$DaysDuration 8) \n      (#$DegreeCelsius 167.8))) \n    (#$The2DPoint \n     (#$DaysDuration ?VALUE) \n     (#$DegreeCelsius 200))\n    ?ERROR)") });
        $sym20$JAVA_LINK_X_Y_REGRESSION_FIND_Y_FOR_X_WITH_ERROR_BARS = SubLObjectFactory.makeSymbol("JAVA-LINK-X-Y-REGRESSION-FIND-Y-FOR-X-WITH-ERROR-BARS");
        $const21$regressionLinesForSetsIntersectAt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regressionLinesForSetsIntersectAtPoint"));
        $kw22$REMOVAL_REGRESSION_LINES_FOR_SETS_INTERSECT_AT_POINT = SubLObjectFactory.makeKeyword("REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regressionLinesForSetsIntersectAtPoint")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regressionLinesForSetsIntersectAtPoint")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-REGRESSION-LINES-FOR-SETS-INTERSECT-AT-POINT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regressionLinesForSetsIntersectAtPoint <set-of-points> <set-of-points> ?POINT)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regressionLinesForSetsIntersectAtPoint\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 200)\n       (#$SecondsDuration 1263118210))\n      (#$The2DPoint\n       (#$DegreeCelsius 210)\n       (#$SecondsDuration 1263204610))\n      (#$The2DPoint\n       (#$DegreeCelsius 220)\n       (#$SecondsDuration 1263291010)))\n     (TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400)))\n     ?POINT)") });
        $const24$The2DPoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The2DPoint"));
        $const25$slopeOfRegressionLineForSetOfPoin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("slopeOfRegressionLineForSetOfPoints"));
        $kw26$REMOVAL_SLOPE_OF_REGRESSION_LINE_FOR_SET_OF_POINTS = SubLObjectFactory.makeKeyword("REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("slopeOfRegressionLineForSetOfPoints")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("slopeOfRegressionLineForSetOfPoints")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SLOPE-OF-REGRESSION-LINE-FOR-SET-OF-POINTS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$slopeOfRegressionLineForSetOfPoints <set-of-points> ?SLOPE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$slopeOfRegressionLineForSetOfPoints\n     (#$TheSet\n      (#$The2DPoint\n       (#$DegreeCelsius 211)\n       (#$SecondsDuration 1263081600))\n      (#$The2DPoint\n       (#$DegreeCelsius 212)\n       (#$SecondsDuration 1263168000))\n      (#$The2DPoint\n       (#$DegreeCelsius 213)\n       (#$SecondsDuration 1263254400))) ?X)") });
        $const28$setOfFirstDerivativePointsBasedOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setOfFirstDerivativePointsBasedOnSetOfPoints"));
        $kw29$REMOVAL_SET_OF_FIRST_DERIVATIVE_POINTS_BASED_ON_SET_OF_POINTS = SubLObjectFactory.makeKeyword("REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setOfFirstDerivativePointsBasedOnSetOfPoints")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SET-OF-FIRST-DERIVATIVE-POINTS-BASED-ON-SET-OF-POINTS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints <set-of-points> ?SET-OF-POINTS)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setOfFirstDerivativePointsBasedOnSetOfPoints\n    (#$TheSet\n     (#$The2DPoint (#$SecondsDuration 1) (#$DegreeCelsius 1))\n     (#$The2DPoint (#$SecondsDuration 3) (#$DegreeCelsius 5))\n     (#$The2DPoint (#$SecondsDuration 5) (#$DegreeCelsius 1)))\n    #$CubicSpline\n    ?X)\n    -->\n    (#$TheSet \n     (#$The2DPoint (#$SecondsDuration 1) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 6.0))\n     (#$The2DPoint (#$SecondsDuration 3) ((#$PerFn #$DegreeCelsius #$SecondsDuration) 0.0))\n     (#$The2DPoint (#$SecondsDuration 5) ((#$PerFn #$DegreeCelsius #$SecondsDuration) -6.0)))") });
        $const31$setHasPointsWithYValueRelnToMatch = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet"));
        $kw32$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO_MATCHING_X_VALUE_POIN = SubLObjectFactory.makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET");
        $list33 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnToMatchingXValuePointsInSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-MATCHING-X-VALUE-POINTS-IN-SET-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet <set-of-points> <set-of-points> <binary-function> <binary-predicate> <value-in-y-units> ?RESULT-SET-OF-POINTS)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnToMatchingXValuePointsInSet \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170))) \n    (#$TheSet \n      (#$The2DPoint (#$Meter 702) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 703) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 704) (#$Kelvin 175)) \n      (#$The2DPoint (#$Meter 705) (#$Kelvin 170)))\n    #$DifferenceFn\n    #$greaterThanOrEqualTo \n    (#$Kelvin 2)\n    ?NEWSET)\n    -->\n    (((?NEWSET #$TheSet (#$The2DPoint (#$Meter 702) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 703) (#$Kelvin 177.5)) \n                        (#$The2DPoint (#$Meter 704) (#$Kelvin 177.5)))))") });
        $sym34$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str35$org_apache_commons_math_stat_regr = SubLObjectFactory.makeString("org.apache.commons.math.stat.regression.SimpleRegression");
        $str36$addData = SubLObjectFactory.makeString("addData");
        $str37$double = SubLObjectFactory.makeString("double");
        $str38$getSlope = SubLObjectFactory.makeString("getSlope");
        $str39$getIntercept = SubLObjectFactory.makeString("getIntercept");
        $sym40$MIN = SubLObjectFactory.makeSymbol("MIN");
        $sym41$MAX = SubLObjectFactory.makeSymbol("MAX");
        $str42$org_apache_commons_math_analysis_ = SubLObjectFactory.makeString("org.apache.commons.math.analysis.interpolation.SplineInterpolator");
        $str43$interpolate = SubLObjectFactory.makeString("interpolate");
        $str44$_D = SubLObjectFactory.makeString("[D");
        $str45$org_apache_commons_math_analysis_ = SubLObjectFactory.makeString("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction");
        $str46$value = SubLObjectFactory.makeString("value");
        $sym47$_ = SubLObjectFactory.makeSymbol("<");
        $sym48$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str49$org_apache_commons_math_analysis_ = SubLObjectFactory.makeString("org.apache.commons.math.analysis.interpolation.LinearInterpolator");
        $str50$predict = SubLObjectFactory.makeString("predict");
        $str51$getSumSquaredErrors = SubLObjectFactory.makeString("getSumSquaredErrors");
        $str52$org_apache_commons_math_geometry_ = SubLObjectFactory.makeString("org.apache.commons.math.geometry.euclidean.twod.Line");
        $str53$org_apache_commons_math_geometry_ = SubLObjectFactory.makeString("org.apache.commons.math.geometry.euclidean.twod.Vector2D");
        $str54$intersection = SubLObjectFactory.makeString("intersection");
        $str55$org_apache_commons_math_geometry_ = SubLObjectFactory.makeString("org.apache.commons.math.geometry.partitioning.Hyperplane");
        $str56$getX = SubLObjectFactory.makeString("getX");
        $str57$getY = SubLObjectFactory.makeString("getY");
        $const58$CubicSpline = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CubicSpline"));
        $const59$LinearPolynomialFunction_Piecewis = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinearPolynomialFunction-Piecewise"));
        $str60$derivative = SubLObjectFactory.makeString("derivative");
        $sym61$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $const62$setHasPointsWithYValueRelnTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnTo"));
        $kw63$REMOVAL_SET_HAS_POINTS_WITH_Y_VALUE_RELN_TO = SubLObjectFactory.makeKeyword("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO");
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnTo")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setHasPointsWithYValueRelnTo")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SET-HAS-POINTS-WITH-Y-VALUE-RELN-TO-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnTo <set-of-points> <operator> <comparator> <quant1> <quant2> ?NEWSET)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setHasPointsWithYValueRelnTo \n (#$TheSet \n  (#$The2DPoint \n   (#$Meter 20.0) \n   (#$DegreeCelsius 68.35)) \n  (#$The2DPoint \n   (#$Meter 21.0) \n   (#$DegreeCelsius 72.98)) \n  (#$The2DPoint \n   (#$Meter 22.0) \n   (#$DegreeCelsius 75.68)) \n  (#$The2DPoint \n   (#$Meter 23.0) \n   (#$DegreeCelsius 78.16)) \n  (#$The2DPoint \n   (#$Meter 24.0) \n   (#$DegreeCelsius 80.79)))\n #$PlusFn\n #$lessThanOrEqualTo \n (#$DegreeCelsius 0) \n (#$DegreeCelsius 70) ?NEWSET)\n -->\n (((?NEWSET TheSet\n   (The2DPoint\n       (Meter 20.0)\n       (DegreeCelsius 68.35)))))") });
        $const65$operationResultComparison = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operationResultComparison"));
        $kw66$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw67$REMOVAL_OPERATION_RESULT_COMPARISON_POS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK");
        $list68 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-OPERATION-RESULT-COMPARISON-POS-CHECK"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$operationResultComparison #$PlusFn (#$DegreeCelsius 50) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
        $kw69$REMOVAL_OPERATION_RESULT_COMPARISON_NEG_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK");
        $list70 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("operationResultComparison")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-OPERATION-RESULT-COMPARISON-NEG-CHECK"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$operationResultComparison <OP> <A> <B> <COMP> <QUANT>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$operationResultComparison #$PlusFn (#$DegreeCelsius 100) (#$DegreeCelsius 0) #$lessThanOrEqualTo (#$DegreeCelsius 70))\n   --> True") });
        $const71$inflowLengthsWithStartingDepths = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inflowLengthsWithStartingDepths"));
        $kw72$REMOVAL_INFLOW_LENGTHS_WITH_STARTING_DEPTHS = SubLObjectFactory.makeKeyword("REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS");
        $list73 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inflowLengthsWithStartingDepths")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inflowLengthsWithStartingDepths")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MATH-MODULE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-INFLOW-LENGTHS-WITH-STARTING-DEPTHS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$inflowLengthsWithStartingDepths <well> <set-of-points> ?LENGTH-AND-DEPTHS)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$inflowLengthsWithStartingDepths\n  (#$The #$Well)\n  (#$TheSet \n   (#$The2DPoint (#$Meter 100) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 110) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 120) (#$DegreeCelsius 115))\n   (#$The2DPoint (#$Meter 130) (#$DegreeCelsius 114))\n   (#$The2DPoint (#$Meter 140) (#$DegreeCelsius 103))\n   (#$The2DPoint (#$Meter 150) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 160) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 170) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 180) (#$DegreeCelsius 102))\n   (#$The2DPoint (#$Meter 190) (#$DegreeCelsius  91))\n   (#$The2DPoint (#$Meter 200) (#$DegreeCelsius 100))\n   (#$The2DPoint (#$Meter 210) (#$DegreeCelsius 110))\n   (#$The2DPoint (#$Meter 220) (#$DegreeCelsius 105))\n   (#$The2DPoint (#$Meter 230) (#$DegreeCelsius  97))\n   (#$The2DPoint (#$Meter 240) (#$DegreeCelsius  96))\n   (#$The2DPoint (#$Meter 250) (#$DegreeCelsius  95))\n   (#$The2DPoint (#$Meter 260) (#$DegreeCelsius  94))\n   (#$The2DPoint (#$Meter 270) (#$DegreeCelsius  93))\n   (#$The2DPoint (#$Meter 280) (#$DegreeCelsius  92)))\n  ?LENGTH-AND-DEPTHS)") });
        $const74$Meter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Meter"));
        $const75$DegreeCelsius = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DegreeCelsius"));
        $str76$____ = SubLObjectFactory.makeString("~%~%");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("Y-VALUE"));
        $str78$High_value__x__A_y__A__ = SubLObjectFactory.makeString("High value: x=~A y=~A~%");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-X-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-Y-DERIVATIVE-VALUE"));
        $str80$checking_x__A_deriv__A__ = SubLObjectFactory.makeString("checking x=~A deriv=~A~%");
        $str81$Bad_looping = SubLObjectFactory.makeString("Bad looping");
        $float82$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $float83$_0_5 = (SubLFloat)SubLObjectFactory.makeDouble(-0.5);
        $str84$Got_interval___A__A___ = SubLObjectFactory.makeString("Got interval (~A ~A)~%");
        $sym85$_ = SubLObjectFactory.makeSymbol(">");
        $str86$inflow_lengths___A__ = SubLObjectFactory.makeString("inflow-lengths: ~A~%");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str88$merged_inflow_lengths___A__ = SubLObjectFactory.makeString("merged-inflow-lengths: ~A~%");
        $const89$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
    }
}

/*

	Total time: 340 ms
	
*/