package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_lat_long extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long";
    public static final String myFingerPrint = "378342b7ce86eaaecab32ea924fb3e7fc211e7ae628fafdb56acb993b841ac94";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 873L)
    private static SubLSymbol $latitude_via_location_rule_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1413L)
    private static SubLSymbol $latitude_via_location_rule_antecedent_template$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 4498L)
    private static SubLSymbol $longitude_via_location_rule_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 5044L)
    private static SubLSymbol $longitude_via_location_rule_antecedent_template$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$CODE;
    private static final SubLObject $const2$GeographyMt;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$PROBLEM_STORE;
    private static final SubLSymbol $kw6$CONTINUABLE_;
    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_;
    private static final SubLSymbol $kw9$RETURN;
    private static final SubLSymbol $kw10$BINDINGS_AND_SUPPORTS;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$LOC;
    private static final SubLObject $const13$latitude;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$REMOVAL_LATITUDE_VIA_LOCATION_POS;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLObject $const20$longitude;
    private static final SubLSymbol $kw21$REMOVAL_LONGITUDE_VIA_LOCATION_POS;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$REMOVAL_LONGITUDE_FROM_LAT_LONG_POS;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$REMOVAL_LATITUDE_FROM_LAT_LONG_POS;
    private static final SubLList $list26;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1269L)
    public static SubLObject make_latitude_via_location_rule_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_lat_long.$kw1$CODE, removal_modules_lat_long.$latitude_via_location_rule_formula$.getGlobalValue(), removal_modules_lat_long.$const2$GeographyMt, (SubLObject)removal_modules_lat_long.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1729L)
    public static SubLObject latitude_via_location_rule_antecedent_dnf(final SubLObject loc) {
        final SubLObject rule_antecedent_info = removal_modules_lat_long.$latitude_via_location_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = (SubLObject)ConsesLow.list(loc);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = (SubLObject)removal_modules_lat_long.NIL;
        SubLObject output_el_vars = (SubLObject)removal_modules_lat_long.NIL;
        SubLObject scoped_el_vars = (SubLObject)removal_modules_lat_long.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (removal_modules_lat_long.NIL == current) {
            current = temp;
            SubLObject el_dnf_template = (SubLObject)removal_modules_lat_long.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (removal_modules_lat_long.NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lat_long.$list4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lat_long.$list4);
        }
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 2448L)
    public static SubLObject removal_latitude_via_location_antecedent_answers(final SubLObject loc, SubLObject mt) {
        if (mt == removal_modules_lat_long.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = latitude_via_location_rule_antecedent_dnf(loc);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_lat_long.$kw5$PROBLEM_STORE, problem_store, removal_modules_lat_long.$kw6$CONTINUABLE_, removal_modules_lat_long.NIL, removal_modules_lat_long.$kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, removal_modules_lat_long.T, removal_modules_lat_long.$kw8$TRANSFORMATION_ALLOWED_, removal_modules_lat_long.NIL, removal_modules_lat_long.$kw9$RETURN, removal_modules_lat_long.$kw10$BINDINGS_AND_SUPPORTS }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 3079L)
    public static SubLObject removal_latitude_via_location_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lat_long.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lat_long.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)removal_modules_lat_long.$list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_lat_long.NIL != success) {
            final SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_lat_long.$sym12$LOC, (SubLObject)removal_modules_lat_long.UNPROVIDED, (SubLObject)removal_modules_lat_long.UNPROVIDED);
            final SubLObject antecedent_answers = removal_latitude_via_location_antecedent_answers(loc, (SubLObject)removal_modules_lat_long.UNPROVIDED);
            if (removal_modules_lat_long.NIL != antecedent_answers) {
                final SubLObject output_template = (SubLObject)ConsesLow.list(removal_modules_lat_long.$const13$latitude, loc, variables.find_variable_by_id((SubLObject)removal_modules_lat_long.ZERO_INTEGER));
                final SubLObject rule_support = make_latitude_via_location_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = (SubLObject)removal_modules_lat_long.NIL;
                antecedent_answer = cdolist_list_var.first();
                while (removal_modules_lat_long.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = (SubLObject)removal_modules_lat_long.NIL;
                    SubLObject antecedent_supports = (SubLObject)removal_modules_lat_long.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (removal_modules_lat_long.NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, (SubLObject)removal_modules_lat_long.T, (SubLObject)removal_modules_lat_long.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_lat_long.NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, ConsesLow.append(antecedent_supports, unify_justification));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lat_long.$list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 4898L)
    public static SubLObject make_longitude_via_location_rule_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_lat_long.$kw1$CODE, removal_modules_lat_long.$longitude_via_location_rule_formula$.getGlobalValue(), removal_modules_lat_long.$const2$GeographyMt, (SubLObject)removal_modules_lat_long.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 5360L)
    public static SubLObject longitude_via_location_rule_antecedent_dnf(final SubLObject loc) {
        final SubLObject rule_antecedent_info = removal_modules_lat_long.$longitude_via_location_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = (SubLObject)ConsesLow.list(loc);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = (SubLObject)removal_modules_lat_long.NIL;
        SubLObject output_el_vars = (SubLObject)removal_modules_lat_long.NIL;
        SubLObject scoped_el_vars = (SubLObject)removal_modules_lat_long.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (removal_modules_lat_long.NIL == current) {
            current = temp;
            SubLObject el_dnf_template = (SubLObject)removal_modules_lat_long.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (removal_modules_lat_long.NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lat_long.$list4);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lat_long.$list4);
        }
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 6082L)
    public static SubLObject removal_longitude_via_location_antecedent_answers(final SubLObject loc, SubLObject mt) {
        if (mt == removal_modules_lat_long.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = longitude_via_location_rule_antecedent_dnf(loc);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_lat_long.$kw5$PROBLEM_STORE, problem_store, removal_modules_lat_long.$kw6$CONTINUABLE_, removal_modules_lat_long.NIL, removal_modules_lat_long.$kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, removal_modules_lat_long.T, removal_modules_lat_long.$kw8$TRANSFORMATION_ALLOWED_, removal_modules_lat_long.NIL, removal_modules_lat_long.$kw9$RETURN, removal_modules_lat_long.$kw10$BINDINGS_AND_SUPPORTS }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 6716L)
    public static SubLObject removal_longitude_via_location_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lat_long.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lat_long.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = (SubLObject)removal_modules_lat_long.$list19;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_lat_long.NIL != success) {
            final SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_lat_long.$sym12$LOC, (SubLObject)removal_modules_lat_long.UNPROVIDED, (SubLObject)removal_modules_lat_long.UNPROVIDED);
            final SubLObject antecedent_answers = removal_longitude_via_location_antecedent_answers(loc, (SubLObject)removal_modules_lat_long.UNPROVIDED);
            if (removal_modules_lat_long.NIL != antecedent_answers) {
                final SubLObject output_template = (SubLObject)ConsesLow.list(removal_modules_lat_long.$const20$longitude, loc, variables.find_variable_by_id((SubLObject)removal_modules_lat_long.ONE_INTEGER));
                final SubLObject rule_support = make_longitude_via_location_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = (SubLObject)removal_modules_lat_long.NIL;
                antecedent_answer = cdolist_list_var.first();
                while (removal_modules_lat_long.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = (SubLObject)removal_modules_lat_long.NIL;
                    SubLObject antecedent_supports = (SubLObject)removal_modules_lat_long.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lat_long.$list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (removal_modules_lat_long.NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$2 = unification_utilities.term_unify(proven_asent, asent, (SubLObject)removal_modules_lat_long.T, (SubLObject)removal_modules_lat_long.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_lat_long.NIL != v_bindings_$2) {
                            backward.removal_add_node(rule_support, v_bindings_$2, ConsesLow.append(antecedent_supports, unify_justification));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lat_long.$list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    public static SubLObject declare_removal_modules_lat_long_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "make_latitude_via_location_rule_support", "MAKE-LATITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "latitude_via_location_rule_antecedent_dnf", "LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "removal_latitude_via_location_antecedent_answers", "REMOVAL-LATITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "removal_latitude_via_location_pos_expand", "REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "make_longitude_via_location_rule_support", "MAKE-LONGITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "longitude_via_location_rule_antecedent_dnf", "LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "removal_longitude_via_location_antecedent_answers", "REMOVAL-LONGITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long", "removal_longitude_via_location_pos_expand", "REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    public static SubLObject init_removal_modules_lat_long_file() {
        removal_modules_lat_long.$latitude_via_location_rule_formula$ = SubLFiles.deflexical("*LATITUDE-VIA-LOCATION-RULE-FORMULA*", (SubLObject)removal_modules_lat_long.$list0);
        removal_modules_lat_long.$latitude_via_location_rule_antecedent_template$ = SubLFiles.deflexical("*LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", (SubLObject)removal_modules_lat_long.$list3);
        removal_modules_lat_long.$longitude_via_location_rule_formula$ = SubLFiles.deflexical("*LONGITUDE-VIA-LOCATION-RULE-FORMULA*", (SubLObject)removal_modules_lat_long.$list17);
        removal_modules_lat_long.$longitude_via_location_rule_antecedent_template$ = SubLFiles.deflexical("*LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", (SubLObject)removal_modules_lat_long.$list18);
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    public static SubLObject setup_removal_modules_lat_long_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_lat_long.$kw15$REMOVAL_LATITUDE_VIA_LOCATION_POS, (SubLObject)removal_modules_lat_long.$list16);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lat_long.$kw21$REMOVAL_LONGITUDE_VIA_LOCATION_POS, (SubLObject)removal_modules_lat_long.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lat_long.$kw23$REMOVAL_LONGITUDE_FROM_LAT_LONG_POS, (SubLObject)removal_modules_lat_long.$list24);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lat_long.$kw25$REMOVAL_LATITUDE_FROM_LAT_LONG_POS, (SubLObject)removal_modules_lat_long.$list26);
        return (SubLObject)removal_modules_lat_long.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_lat_long_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_lat_long_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_lat_long_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_lat_long();
        removal_modules_lat_long.$latitude_via_location_rule_formula$ = null;
        removal_modules_lat_long.$latitude_via_location_rule_antecedent_template$ = null;
        removal_modules_lat_long.$longitude_via_location_rule_formula$ = null;
        removal_modules_lat_long.$longitude_via_location_rule_antecedent_template$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("?LAT")));
        $kw1$CODE = SubLObjectFactory.makeKeyword("CODE");
        $const2$GeographyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographyMt"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PLACE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LAT"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LONG"))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_lat_long.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG"))))));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-EL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPED-EL-VARS")), (SubLObject)SubLObjectFactory.makeSymbol("EL-DNF-TEMPLATE"));
        $kw5$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw6$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw8$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw9$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw10$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LOC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym12$LOC = SubLObjectFactory.makeSymbol("LOC");
        $const13$latitude = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT-SUPPORTS"));
        $kw15$REMOVAL_LATITUDE_VIA_LOCATION_POS = SubLObjectFactory.makeKeyword("REMOVAL-LATITUDE-VIA-LOCATION-POS");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_lat_long.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the latitude from that"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$latitude #$CityOfSanFranciscoCA ?LONG)") });
        $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG")));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PLACE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LAT"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LAT"))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_lat_long.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)SubLObjectFactory.makeSymbol("?LAT"), (SubLObject)SubLObjectFactory.makeSymbol("?LONG"))))));
        $list19 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LOC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const20$longitude = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude"));
        $kw21$REMOVAL_LONGITUDE_VIA_LOCATION_POS = SubLObjectFactory.makeKeyword("REMOVAL-LONGITUDE-VIA-LOCATION-POS");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_lat_long.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the longitude from that"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$longitude #$CityOfSanFranciscoCA ?LONG)") });
        $kw23$REMOVAL_LONGITUDE_FROM_LAT_LONG_POS = SubLObjectFactory.makeKeyword("REMOVAL-LONGITUDE-FROM-LAT-LONG-POS");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_lat_long.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LONG"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LONG")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAT"), (SubLObject)SubLObjectFactory.makeSymbol("LONG")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("longitude")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LONG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LONG")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$longitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$longitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
        $kw25$REMOVAL_LATITUDE_FROM_LAT_LONG_POS = SubLObjectFactory.makeKeyword("REMOVAL-LATITUDE-FROM-LAT-LONG-POS");
        $list26 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_lat_long.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("LONG"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LONG")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAT"), (SubLObject)SubLObjectFactory.makeSymbol("LONG")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latitude")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LONG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LAT")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$latitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$latitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
    }
}

/*

	Total time: 125 ms
	
*/