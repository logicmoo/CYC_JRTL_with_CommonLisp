package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_physics extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_physics();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_physics";


    // defparameter
    private static final SubLSymbol $default_type_has_boiling_point_temperature_and_pressure_cost$ = makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*");

    private static final SubLObject $const0$antoineEquationParametersForTypeA = reader_make_constant_shell(makeString("antoineEquationParametersForTypeAndInterval"));



    private static final SubLSymbol $sym2$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$DegreeCelsius = reader_make_constant_shell(makeString("DegreeCelsius"));

    private static final SubLList $list4 = list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"));

    private static final SubLObject $const5$antoineEquationParametersForTypeA = reader_make_constant_shell(makeString("antoineEquationParametersForTypeAndPressureInterval"));

    private static final SubLObject $$MM_Hg = reader_make_constant_shell(makeString("MM-Hg"));

    private static final SubLObject $const7$typeHasBoilingPoint_TemperatureAt = reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure"));



    private static final SubLSymbol $TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE = makeKeyword("TYPE-HAS-BOILING-POINT-EITHER-ARG2-OR-ARG3-BINDABLE");

    private static final SubLList $list10 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("REQUIRED-PATTERN"), listS(reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG2-OR-ARG3"));

    private static final SubLSymbol $REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE = makeKeyword("REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> <fully-bound-p> ?PRESSURE)"), makeKeyword("EXAMPLE"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water (#$DegreeCelsius 100) ?PRESSURE)") });



    private static final SubLSymbol $REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE = makeKeyword("REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> ?TEMPERATURE <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water ?TEMPERATURE (#$Atmosphere-UnitOfPressure 1))") });

    public static SubLObject antoine_equation_constants_for_temperature_of_liquid(final SubLObject liquid, final SubLObject temperature) {
        final SubLObject pred_var = $const0$antoineEquationParametersForTypeA;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(liquid, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(liquid, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$1 = NIL;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                            if (NIL != valid_$3) {
                                final SubLObject temperature_interval = assertions_high.gaf_arg5(ass);
                                if (NIL != quantities.cyc_quantity_subsumes(temperature_interval, temperature)) {
                                    return list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass), assertions_high.gaf_arg4(ass));
                                }
                            }
                            done_var_$1 = makeBoolean(NIL == valid_$3);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject boiling_point_temperature_to_pressure(final SubLObject liquid, final SubLObject temperature) {
        final SubLObject constants = antoine_equation_constants_for_temperature_of_liquid(liquid, temperature);
        final SubLObject temperature_in_celsius = quantities.convert_to_units_absolute($$DegreeCelsius, temperature.first(), second(temperature), UNPROVIDED);
        if (NIL != constants) {
            SubLObject current;
            final SubLObject datum = current = constants;
            SubLObject a = NIL;
            SubLObject b = NIL;
            SubLObject c = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            a = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            b = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            c = current.first();
            current = current.rest();
            if (NIL == current) {
                return expt(TEN_INTEGER, subtract(a, divide(b, add(c, temperature_in_celsius))));
            }
            cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    public static SubLObject antoine_equation_constants_for_pressure_of_liquid(final SubLObject liquid, final SubLObject pressure) {
        final SubLObject pred_var = $const5$antoineEquationParametersForTypeA;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(liquid, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(liquid, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$4 = NIL;
                        final SubLObject token_var_$5 = NIL;
                        while (NIL == done_var_$4) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                            if (NIL != valid_$6) {
                                final SubLObject pressure_interval = assertions_high.gaf_arg5(ass);
                                if (NIL != quantities.cyc_quantity_subsumes(pressure_interval, pressure)) {
                                    return list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass), assertions_high.gaf_arg4(ass));
                                }
                            }
                            done_var_$4 = makeBoolean(NIL == valid_$6);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static SubLObject boiling_point_pressure_to_temperature(final SubLObject liquid, final SubLObject pressure) {
        final SubLObject constants = antoine_equation_constants_for_pressure_of_liquid(liquid, pressure);
        final SubLObject pressure_in_mmhg = quantities.convert_to_units_absolute($$MM_Hg, pressure.first(), second(pressure), UNPROVIDED);
        if (NIL != constants) {
            SubLObject current;
            final SubLObject datum = current = constants;
            SubLObject a = NIL;
            SubLObject b = NIL;
            SubLObject c = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            a = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            b = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            c = current.first();
            current = current.rest();
            if (NIL == current) {
                return subtract(divide(b, subtract(a, log(pressure_in_mmhg, TEN_INTEGER))), c);
            }
            cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    public static SubLObject removal_type_has_boiling_point_temperature_at_pressure_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject substance_type = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject temperature = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject pressure_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject pressure_in_mm_hg = boiling_point_temperature_to_pressure(substance_type, temperature);
        if (pressure_in_mm_hg.isNumber()) {
            final SubLObject pressure = make_unary_formula($$MM_Hg, pressure_in_mm_hg);
            final SubLObject v_bindings = quantities.term_unify_with_units(pressure_arg, pressure);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list($const7$typeHasBoilingPoint_TemperatureAt, substance_type, temperature, pressure), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_type_has_boiling_point_pressure_at_temperature_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject substance_type = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pressure = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject temperature_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject temperature_in_celsius = boiling_point_pressure_to_temperature(substance_type, pressure);
        if (temperature_in_celsius.isNumber()) {
            final SubLObject temperature = make_unary_formula($$DegreeCelsius, temperature_in_celsius);
            final SubLObject v_bindings = quantities.term_unify_with_units(temperature_arg, temperature);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, list($const7$typeHasBoilingPoint_TemperatureAt, substance_type, temperature, pressure), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_physics_file() {
        declareFunction("antoine_equation_constants_for_temperature_of_liquid", "ANTOINE-EQUATION-CONSTANTS-FOR-TEMPERATURE-OF-LIQUID", 2, 0, false);
        declareFunction("boiling_point_temperature_to_pressure", "BOILING-POINT-TEMPERATURE-TO-PRESSURE", 2, 0, false);
        declareFunction("antoine_equation_constants_for_pressure_of_liquid", "ANTOINE-EQUATION-CONSTANTS-FOR-PRESSURE-OF-LIQUID", 2, 0, false);
        declareFunction("boiling_point_pressure_to_temperature", "BOILING-POINT-PRESSURE-TO-TEMPERATURE", 2, 0, false);
        declareFunction("removal_type_has_boiling_point_temperature_at_pressure_expand", "REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE-EXPAND", 1, 1, false);
        declareFunction("removal_type_has_boiling_point_pressure_at_temperature_expand", "REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_physics_file() {
        defparameter("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*", $typical_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_physics_file() {
        inference_modules.register_solely_specific_removal_module_predicate($const7$typeHasBoilingPoint_TemperatureAt);
        preference_modules.doomed_unless_arg_bindable($POS, $const7$typeHasBoilingPoint_TemperatureAt, ONE_INTEGER);
        preference_modules.inference_preference_module($TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE, $list10);
        inference_modules.inference_removal_module($REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE, $list12);
        inference_modules.inference_removal_module($REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE, $list15);
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


















    }
}

/**
 * Total time: 126 ms
 */
