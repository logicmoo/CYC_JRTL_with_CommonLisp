package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_lat_long extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long";
    public static String myFingerPrint = "378342b7ce86eaaecab32ea924fb3e7fc211e7ae628fafdb56acb993b841ac94";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 800L)
    private static SubLSymbol $latitude_via_location_rule_formula$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1400L)
    private static SubLSymbol $latitude_via_location_rule_antecedent_template$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 4400L)
    private static SubLSymbol $longitude_via_location_rule_formula$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 5000L)
    private static SubLSymbol $longitude_via_location_rule_antecedent_template$;
    private static SubLList $list0;
    private static SubLSymbol $CODE;
    private static SubLObject $$GeographyMt;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static SubLSymbol $TRANSFORMATION_ALLOWED_;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLList $list11;
    private static SubLSymbol $sym12$LOC;
    private static SubLObject $$latitude;
    private static SubLList $list14;
    private static SubLSymbol $REMOVAL_LATITUDE_VIA_LOCATION_POS;
    private static SubLList $list16;
    private static SubLList $list17;
    private static SubLList $list18;
    private static SubLList $list19;
    private static SubLObject $$longitude;
    private static SubLSymbol $REMOVAL_LONGITUDE_VIA_LOCATION_POS;
    private static SubLList $list22;
    private static SubLSymbol $REMOVAL_LONGITUDE_FROM_LAT_LONG_POS;
    private static SubLList $list24;
    private static SubLSymbol $REMOVAL_LATITUDE_FROM_LAT_LONG_POS;
    private static SubLList $list26;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1200L)
    public static SubLObject make_latitude_via_location_rule_support() {
        return arguments.make_hl_support($CODE, $latitude_via_location_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 1700L)
    public static SubLObject latitude_via_location_rule_antecedent_dnf(SubLObject loc) {
        SubLObject rule_antecedent_info = $latitude_via_location_rule_antecedent_template$.getGlobalValue();
        SubLObject input_values = list(loc);
        SubLObject current;
        SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = NIL;
        SubLObject output_el_vars = NIL;
        SubLObject scoped_el_vars = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject el_dnf_template = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 2400L)
    public static SubLObject removal_latitude_via_location_antecedent_answers(SubLObject loc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        SubLObject rule_antecedent_dnf = latitude_via_location_rule_antecedent_dnf(loc);
        SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[] { $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 3000L)
    public static SubLObject removal_latitude_via_location_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list11;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, $sym12$LOC, UNPROVIDED, UNPROVIDED);
            SubLObject antecedent_answers = removal_latitude_via_location_antecedent_answers(loc, UNPROVIDED);
            if (NIL != antecedent_answers) {
                SubLObject output_template = list($$latitude, loc, variables.find_variable_by_id(ZERO_INTEGER));
                SubLObject rule_support = make_latitude_via_location_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, append(antecedent_supports, unify_justification));
                        }
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 4800L)
    public static SubLObject make_longitude_via_location_rule_support() {
        return arguments.make_hl_support($CODE, $longitude_via_location_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 5300L)
    public static SubLObject longitude_via_location_rule_antecedent_dnf(SubLObject loc) {
        SubLObject rule_antecedent_info = $longitude_via_location_rule_antecedent_template$.getGlobalValue();
        SubLObject input_values = list(loc);
        SubLObject current;
        SubLObject datum = current = rule_antecedent_info;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = NIL;
        SubLObject output_el_vars = NIL;
        SubLObject scoped_el_vars = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        input_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        output_el_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject el_dnf_template = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return Values.values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 6000L)
    public static SubLObject removal_longitude_via_location_antecedent_answers(SubLObject loc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        SubLObject rule_antecedent_dnf = longitude_via_location_rule_antecedent_dnf(loc);
        SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[] { $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lat-long.lisp", position = 6700L)
    public static SubLObject removal_longitude_via_location_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list19;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, $sym12$LOC, UNPROVIDED, UNPROVIDED);
            SubLObject antecedent_answers = removal_longitude_via_location_antecedent_answers(loc, UNPROVIDED);
            if (NIL != antecedent_answers) {
                SubLObject output_template = list($$longitude, loc, variables.find_variable_by_id(ONE_INTEGER));
                SubLObject rule_support = make_longitude_via_location_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        SubLObject v_bindings_$2 = unification_utilities.term_unify(proven_asent, asent, T, T);
                        SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$2) {
                            backward.removal_add_node(rule_support, v_bindings_$2, append(antecedent_supports, unify_justification));
                        }
                    } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_lat_long_file() {
        declareFunction(myName, "make_latitude_via_location_rule_support", "MAKE-LATITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false);
        declareFunction(myName, "latitude_via_location_rule_antecedent_dnf", "LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction(myName, "removal_latitude_via_location_antecedent_answers", "REMOVAL-LATITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false);
        declareFunction(myName, "removal_latitude_via_location_pos_expand", "REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "make_longitude_via_location_rule_support", "MAKE-LONGITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false);
        declareFunction(myName, "longitude_via_location_rule_antecedent_dnf", "LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction(myName, "removal_longitude_via_location_antecedent_answers", "REMOVAL-LONGITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false);
        declareFunction(myName, "removal_longitude_via_location_pos_expand", "REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_lat_long_file() {
        $latitude_via_location_rule_formula$ = deflexical("*LATITUDE-VIA-LOCATION-RULE-FORMULA*", $list0);
        $latitude_via_location_rule_antecedent_template$ = SubLFiles.deflexical("*LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", $list3);
        $longitude_via_location_rule_formula$ = deflexical("*LONGITUDE-VIA-LOCATION-RULE-FORMULA*", $list17);
        $longitude_via_location_rule_antecedent_template$ = SubLFiles.deflexical("*LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", $list18);
        return NIL;
    }

    public static SubLObject setup_removal_modules_lat_long_file() {
        inference_modules.inference_removal_module($REMOVAL_LATITUDE_VIA_LOCATION_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_LONGITUDE_VIA_LOCATION_POS, $list22);
        inference_modules.inference_removal_module($REMOVAL_LONGITUDE_FROM_LAT_LONG_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_LATITUDE_FROM_LAT_LONG_POS, $list26);
        return NIL;
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
        me = new removal_modules_lat_long();
        $latitude_via_location_rule_formula$ = null;
        $latitude_via_location_rule_antecedent_template$ = null;
        $longitude_via_location_rule_formula$ = null;
        $longitude_via_location_rule_antecedent_template$ = null;
        $list0 = list(makeConstSym(("implies")), list(makeConstSym(("locatedAtPoint-SurfaceGeographical")), makeSymbol("?PLACE"), list(makeConstSym(("LatLongFn")), makeSymbol("?LAT"), makeSymbol("?LONG"))), list(makeConstSym(("latitude")), makeSymbol("?PLACE"), makeSymbol("?LAT")));
        $CODE = makeKeyword("CODE");
        $$GeographyMt = makeConstSym(("GeographyMt"));
        $list3 = list(list(list(makeSymbol("?PLACE")), list(makeSymbol("?LAT"), makeSymbol("?LONG")), list(makeSymbol("?LONG"))),
                list(NIL, list(list(makeConstSym(("locatedAtPoint-SurfaceGeographical")), makeSymbol("?PLACE"), list(makeConstSym(("LatLongFn")), makeSymbol("?LAT"), makeSymbol("?LONG"))))));
        $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $list11 = list(makeConstSym(("latitude")), list(makeKeyword("BIND"), makeSymbol("LOC")), makeKeyword("ANYTHING"));
        $sym12$LOC = makeSymbol("LOC");
        $$latitude = makeConstSym(("latitude"));
        $list14 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));
        $REMOVAL_LATITUDE_VIA_LOCATION_POS = makeKeyword("REMOVAL-LATITUDE-VIA-LOCATION-POS");
        $list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("latitude")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("latitude")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the latitude from that"),
                makeKeyword("EXAMPLE"), makeString("(#$latitude #$CityOfSanFranciscoCA ?LONG)") });
        $list17 = list(makeConstSym(("implies")), list(makeConstSym(("locatedAtPoint-SurfaceGeographical")), makeSymbol("?PLACE"), list(makeConstSym(("LatLongFn")), makeSymbol("?LAT"), makeSymbol("?LONG"))), list(makeConstSym(("longitude")), makeSymbol("?PLACE"), makeSymbol("?LONG")));
        $list18 = list(list(list(makeSymbol("?PLACE")), list(makeSymbol("?LAT"), makeSymbol("?LONG")), list(makeSymbol("?LAT"))),
                list(NIL, list(list(makeConstSym(("locatedAtPoint-SurfaceGeographical")), makeSymbol("?PLACE"), list(makeConstSym(("LatLongFn")), makeSymbol("?LAT"), makeSymbol("?LONG"))))));
        $list19 = list(makeConstSym(("longitude")), list(makeKeyword("BIND"), makeSymbol("LOC")), makeKeyword("ANYTHING"));
        $$longitude = makeConstSym(("longitude"));
        $REMOVAL_LONGITUDE_VIA_LOCATION_POS = makeKeyword("REMOVAL-LONGITUDE-VIA-LOCATION-POS");
        $list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("longitude")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("longitude")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the longitude from that"),
                makeKeyword("EXAMPLE"), makeString("(#$longitude #$CityOfSanFranciscoCA ?LONG)") });
        $REMOVAL_LONGITUDE_FROM_LAT_LONG_POS = makeKeyword("REMOVAL-LONGITUDE-FROM-LAT-LONG-POS");
        $list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("longitude")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("longitude")), list(makeConstSym(("LatLongFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("longitude")), list(makeConstSym(("LatLongFn")), list(makeKeyword("BIND"), makeSymbol("LAT")), list(makeKeyword("BIND"), makeSymbol("LONG"))), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("LAT"), makeSymbol("LONG")),
                        list(makeConstSym(("longitude")), list(makeConstSym(("LatLongFn")), list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG"))), list(makeKeyword("VALUE"), makeSymbol("LONG")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$longitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$longitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
        $REMOVAL_LATITUDE_FROM_LAT_LONG_POS = makeKeyword("REMOVAL-LATITUDE-FROM-LAT-LONG-POS");
        $list26 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("latitude")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("latitude")), list(makeConstSym(("LatLongFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("latitude")), list(makeConstSym(("LatLongFn")), list(makeKeyword("BIND"), makeSymbol("LAT")), list(makeKeyword("BIND"), makeSymbol("LONG"))), makeKeyword("ANYTHING")),
                        list(list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("LAT"), makeSymbol("LONG")), list(makeConstSym(("latitude")), list(makeConstSym(("LatLongFn")), list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG"))), list(makeKeyword("VALUE"), makeSymbol("LAT")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$latitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$latitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
    }
}
/*
 *
 * Total time: 125 ms
 *
 */