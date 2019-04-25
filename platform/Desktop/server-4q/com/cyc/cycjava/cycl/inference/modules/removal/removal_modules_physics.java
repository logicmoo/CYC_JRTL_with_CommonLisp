package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_physics extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics";
    public static final String myFingerPrint = "8b9f51f4fdcaa3b9a6024ba4df93da10bb10782dce68519eec8b6a838e86c7c6";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 2621L)
    private static SubLSymbol $default_type_has_boiling_point_temperature_and_pressure_cost$;
    private static final SubLObject $const0$antoineEquationParametersForTypeA;
    private static final SubLSymbol $kw1$GAF;
    private static final SubLSymbol $sym2$_EXIT;
    private static final SubLObject $const3$DegreeCelsius;
    private static final SubLList $list4;
    private static final SubLObject $const5$antoineEquationParametersForTypeA;
    private static final SubLObject $const6$MM_Hg;
    private static final SubLObject $const7$typeHasBoilingPoint_TemperatureAt;
    private static final SubLSymbol $kw8$POS;
    private static final SubLSymbol $kw9$TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$OPAQUE;
    private static final SubLSymbol $kw14$REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE;
    private static final SubLList $list15;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 928L)
    public static SubLObject antoine_equation_constants_for_temperature_of_liquid(final SubLObject liquid, final SubLObject temperature) {
        final SubLObject pred_var = removal_modules_physics.$const0$antoineEquationParametersForTypeA;
        if (removal_modules_physics.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(liquid, (SubLObject)removal_modules_physics.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(liquid, (SubLObject)removal_modules_physics.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_physics.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_physics.NIL;
            while (removal_modules_physics.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_physics.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_physics.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_physics.$kw1$GAF, (SubLObject)removal_modules_physics.NIL, (SubLObject)removal_modules_physics.NIL);
                        SubLObject done_var_$1 = (SubLObject)removal_modules_physics.NIL;
                        final SubLObject token_var_$2 = (SubLObject)removal_modules_physics.NIL;
                        while (removal_modules_physics.NIL == done_var_$1) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(ass));
                            if (removal_modules_physics.NIL != valid_$3) {
                                final SubLObject temperature_interval = assertions_high.gaf_arg5(ass);
                                if (removal_modules_physics.NIL != quantities.cyc_quantity_subsumes(temperature_interval, temperature)) {
                                    return (SubLObject)ConsesLow.list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass), assertions_high.gaf_arg4(ass));
                                }
                            }
                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_physics.NIL == valid_$3);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_physics.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_physics.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_physics.NIL == valid);
            }
        }
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 1372L)
    public static SubLObject boiling_point_temperature_to_pressure(final SubLObject liquid, final SubLObject temperature) {
        final SubLObject constants = antoine_equation_constants_for_temperature_of_liquid(liquid, temperature);
        final SubLObject temperature_in_celsius = quantities.convert_to_units_absolute(removal_modules_physics.$const3$DegreeCelsius, temperature.first(), conses_high.second(temperature), (SubLObject)removal_modules_physics.UNPROVIDED);
        if (removal_modules_physics.NIL != constants) {
            SubLObject current;
            final SubLObject datum = current = constants;
            SubLObject a = (SubLObject)removal_modules_physics.NIL;
            SubLObject b = (SubLObject)removal_modules_physics.NIL;
            SubLObject c = (SubLObject)removal_modules_physics.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_physics.$list4);
            a = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_physics.$list4);
            b = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_physics.$list4);
            c = current.first();
            current = current.rest();
            if (removal_modules_physics.NIL == current) {
                return Numbers.expt((SubLObject)removal_modules_physics.TEN_INTEGER, Numbers.subtract(a, Numbers.divide(b, Numbers.add(c, temperature_in_celsius))));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_physics.$list4);
        }
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 1796L)
    public static SubLObject antoine_equation_constants_for_pressure_of_liquid(final SubLObject liquid, final SubLObject pressure) {
        final SubLObject pred_var = removal_modules_physics.$const5$antoineEquationParametersForTypeA;
        if (removal_modules_physics.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(liquid, (SubLObject)removal_modules_physics.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(liquid, (SubLObject)removal_modules_physics.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_physics.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_physics.NIL;
            while (removal_modules_physics.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_physics.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_physics.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_physics.$kw1$GAF, (SubLObject)removal_modules_physics.NIL, (SubLObject)removal_modules_physics.NIL);
                        SubLObject done_var_$4 = (SubLObject)removal_modules_physics.NIL;
                        final SubLObject token_var_$5 = (SubLObject)removal_modules_physics.NIL;
                        while (removal_modules_physics.NIL == done_var_$4) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(ass));
                            if (removal_modules_physics.NIL != valid_$6) {
                                final SubLObject pressure_interval = assertions_high.gaf_arg5(ass);
                                if (removal_modules_physics.NIL != quantities.cyc_quantity_subsumes(pressure_interval, pressure)) {
                                    return (SubLObject)ConsesLow.list(assertions_high.gaf_arg2(ass), assertions_high.gaf_arg3(ass), assertions_high.gaf_arg4(ass));
                                }
                            }
                            done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_physics.NIL == valid_$6);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_physics.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_physics.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_physics.NIL == valid);
            }
        }
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 2233L)
    public static SubLObject boiling_point_pressure_to_temperature(final SubLObject liquid, final SubLObject pressure) {
        final SubLObject constants = antoine_equation_constants_for_pressure_of_liquid(liquid, pressure);
        final SubLObject pressure_in_mmhg = quantities.convert_to_units_absolute(removal_modules_physics.$const6$MM_Hg, pressure.first(), conses_high.second(pressure), (SubLObject)removal_modules_physics.UNPROVIDED);
        if (removal_modules_physics.NIL != constants) {
            SubLObject current;
            final SubLObject datum = current = constants;
            SubLObject a = (SubLObject)removal_modules_physics.NIL;
            SubLObject b = (SubLObject)removal_modules_physics.NIL;
            SubLObject c = (SubLObject)removal_modules_physics.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_physics.$list4);
            a = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_physics.$list4);
            b = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_physics.$list4);
            c = current.first();
            current = current.rest();
            if (removal_modules_physics.NIL == current) {
                return Numbers.subtract(Numbers.divide(b, Numbers.subtract(a, Numbers.log(pressure_in_mmhg, (SubLObject)removal_modules_physics.TEN_INTEGER))), c);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_physics.$list4);
        }
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 4045L)
    public static SubLObject removal_type_has_boiling_point_temperature_at_pressure_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_physics.UNPROVIDED) {
            sense = (SubLObject)removal_modules_physics.NIL;
        }
        final SubLObject substance_type = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_physics.UNPROVIDED);
        final SubLObject temperature = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_physics.UNPROVIDED);
        final SubLObject pressure_arg = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_physics.UNPROVIDED);
        final SubLObject pressure_in_mm_hg = boiling_point_temperature_to_pressure(substance_type, temperature);
        if (pressure_in_mm_hg.isNumber()) {
            final SubLObject pressure = el_utilities.make_unary_formula(removal_modules_physics.$const6$MM_Hg, pressure_in_mm_hg);
            final SubLObject v_bindings = quantities.term_unify_with_units(pressure_arg, pressure);
            if (removal_modules_physics.NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_physics.$kw13$OPAQUE, (SubLObject)ConsesLow.list(removal_modules_physics.$const7$typeHasBoilingPoint_TemperatureAt, substance_type, temperature, pressure), (SubLObject)removal_modules_physics.UNPROVIDED, (SubLObject)removal_modules_physics.UNPROVIDED), v_bindings, (SubLObject)removal_modules_physics.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-physics.lisp", position = 5512L)
    public static SubLObject removal_type_has_boiling_point_pressure_at_temperature_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_physics.UNPROVIDED) {
            sense = (SubLObject)removal_modules_physics.NIL;
        }
        final SubLObject substance_type = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_physics.UNPROVIDED);
        final SubLObject pressure = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_physics.UNPROVIDED);
        final SubLObject temperature_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_physics.UNPROVIDED);
        final SubLObject temperature_in_celsius = boiling_point_pressure_to_temperature(substance_type, pressure);
        if (temperature_in_celsius.isNumber()) {
            final SubLObject temperature = el_utilities.make_unary_formula(removal_modules_physics.$const3$DegreeCelsius, temperature_in_celsius);
            final SubLObject v_bindings = quantities.term_unify_with_units(temperature_arg, temperature);
            if (removal_modules_physics.NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_physics.$kw13$OPAQUE, (SubLObject)ConsesLow.list(removal_modules_physics.$const7$typeHasBoilingPoint_TemperatureAt, substance_type, temperature, pressure), (SubLObject)removal_modules_physics.UNPROVIDED, (SubLObject)removal_modules_physics.UNPROVIDED), v_bindings, (SubLObject)removal_modules_physics.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    public static SubLObject declare_removal_modules_physics_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics", "antoine_equation_constants_for_temperature_of_liquid", "ANTOINE-EQUATION-CONSTANTS-FOR-TEMPERATURE-OF-LIQUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics", "boiling_point_temperature_to_pressure", "BOILING-POINT-TEMPERATURE-TO-PRESSURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics", "antoine_equation_constants_for_pressure_of_liquid", "ANTOINE-EQUATION-CONSTANTS-FOR-PRESSURE-OF-LIQUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics", "boiling_point_pressure_to_temperature", "BOILING-POINT-PRESSURE-TO-TEMPERATURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics", "removal_type_has_boiling_point_temperature_at_pressure_expand", "REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_physics", "removal_type_has_boiling_point_pressure_at_temperature_expand", "REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    public static SubLObject init_removal_modules_physics_file() {
        removal_modules_physics.$default_type_has_boiling_point_temperature_and_pressure_cost$ = SubLFiles.defparameter("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*", control_vars.$typical_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_physics.NIL;
    }
    
    public static SubLObject setup_removal_modules_physics_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_physics.$const7$typeHasBoilingPoint_TemperatureAt);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_physics.$kw8$POS, removal_modules_physics.$const7$typeHasBoilingPoint_TemperatureAt, (SubLObject)removal_modules_physics.ONE_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_physics.$kw9$TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE, (SubLObject)removal_modules_physics.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_physics.$kw11$REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE, (SubLObject)removal_modules_physics.$list12);
        inference_modules.inference_removal_module((SubLObject)removal_modules_physics.$kw14$REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE, (SubLObject)removal_modules_physics.$list15);
        return (SubLObject)removal_modules_physics.NIL;
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
        me = (SubLFile)new removal_modules_physics();
        removal_modules_physics.$default_type_has_boiling_point_temperature_and_pressure_cost$ = null;
        $const0$antoineEquationParametersForTypeA = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("antoineEquationParametersForTypeAndInterval"));
        $kw1$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym2$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const3$DegreeCelsius = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DegreeCelsius"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"));
        $const5$antoineEquationParametersForTypeA = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("antoineEquationParametersForTypeAndPressureInterval"));
        $const6$MM_Hg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MM-Hg"));
        $const7$typeHasBoilingPoint_TemperatureAt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure"));
        $kw8$POS = SubLObjectFactory.makeKeyword("POS");
        $kw9$TYPE_HAS_BOILING_POINT_EITHER_ARG2_OR_ARG3_BINDABLE = SubLObjectFactory.makeKeyword("TYPE-HAS-BOILING-POINT-EITHER-ARG2-OR-ARG3-BINDABLE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG2-OR-ARG3"));
        $kw11$REMOVAL_TYPE_HAS_BOILING_POINT_TEMPERATURE_AT_PRESSURE = SubLObjectFactory.makeKeyword("REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> <fully-bound-p> ?PRESSURE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water (#$DegreeCelsius 100) ?PRESSURE)") });
        $kw13$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw14$REMOVAL_TYPE_HAS_BOILING_POINT_PRESSURE_AT_TEMPERATURE = SubLObjectFactory.makeKeyword("REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TYPE-HAS-BOILING-POINT-TEMPERATURE-AND-PRESSURE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> ?TEMPERATURE <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water ?TEMPERATURE (#$Atmosphere-UnitOfPressure 1))") });
    }
}

/*

	Total time: 126 ms
	
*/