/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.variables.find_variable_by_id;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-LAT-LONG
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-lat-long.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_lat_long extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_lat_long();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $latitude_via_location_rule_formula$ = makeSymbol("*LATITUDE-VIA-LOCATION-RULE-FORMULA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $latitude_via_location_rule_antecedent_template$ = makeSymbol("*LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $longitude_via_location_rule_formula$ = makeSymbol("*LONGITUDE-VIA-LOCATION-RULE-FORMULA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $longitude_via_location_rule_antecedent_template$ = makeSymbol("*LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))), list(reader_make_constant_shell("latitude"), makeSymbol("?PLACE"), makeSymbol("?LAT")));



    static private final SubLList $list3 = list(list(list(makeSymbol("?PLACE")), list(makeSymbol("?LAT"), makeSymbol("?LONG")), list(makeSymbol("?LONG"))), list(NIL, list(list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))))));

    static private final SubLList $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    static private final SubLList $list11 = list(reader_make_constant_shell("latitude"), list($BIND, makeSymbol("LOC")), makeKeyword("ANYTHING"));

    private static final SubLSymbol LOC = makeSymbol("LOC");



    static private final SubLList $list14 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    private static final SubLSymbol $REMOVAL_LATITUDE_VIA_LOCATION_POS = makeKeyword("REMOVAL-LATITUDE-VIA-LOCATION-POS");

    static private final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("latitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("latitude"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the latitude from that"), makeKeyword("EXAMPLE"), makeString("(#$latitude #$CityOfSanFranciscoCA ?LONG)") });

    static private final SubLList $list17 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))), list(reader_make_constant_shell("longitude"), makeSymbol("?PLACE"), makeSymbol("?LONG")));

    static private final SubLList $list18 = list(list(list(makeSymbol("?PLACE")), list(makeSymbol("?LAT"), makeSymbol("?LONG")), list(makeSymbol("?LAT"))), list(NIL, list(list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))))));

    static private final SubLList $list19 = list(reader_make_constant_shell("longitude"), list($BIND, makeSymbol("LOC")), makeKeyword("ANYTHING"));



    private static final SubLSymbol $REMOVAL_LONGITUDE_VIA_LOCATION_POS = makeKeyword("REMOVAL-LONGITUDE-VIA-LOCATION-POS");

    static private final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("longitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("longitude"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the longitude from that"), makeKeyword("EXAMPLE"), makeString("(#$longitude #$CityOfSanFranciscoCA ?LONG)") });

    private static final SubLSymbol $REMOVAL_LONGITUDE_FROM_LAT_LONG_POS = makeKeyword("REMOVAL-LONGITUDE-FROM-LAT-LONG-POS");

    static private final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("longitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("longitude"), list(reader_make_constant_shell("LatLongFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("longitude"), list(reader_make_constant_shell("LatLongFn"), list($BIND, makeSymbol("LAT")), list($BIND, makeSymbol("LONG"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LAT"), makeSymbol("LONG")), list(reader_make_constant_shell("longitude"), list(reader_make_constant_shell("LatLongFn"), list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG"))), list(makeKeyword("VALUE"), makeSymbol("LONG")))), makeKeyword("DOCUMENTATION"), makeString("(#$longitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$longitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });

    private static final SubLSymbol $REMOVAL_LATITUDE_FROM_LAT_LONG_POS = makeKeyword("REMOVAL-LATITUDE-FROM-LAT-LONG-POS");

    static private final SubLList $list26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("latitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("latitude"), list(reader_make_constant_shell("LatLongFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("latitude"), list(reader_make_constant_shell("LatLongFn"), list($BIND, makeSymbol("LAT")), list($BIND, makeSymbol("LONG"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LAT"), makeSymbol("LONG")), list(reader_make_constant_shell("latitude"), list(reader_make_constant_shell("LatLongFn"), list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG"))), list(makeKeyword("VALUE"), makeSymbol("LAT")))), makeKeyword("DOCUMENTATION"), makeString("(#$latitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$latitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });

    public static final SubLObject make_latitude_via_location_rule_support_alt() {
        return arguments.make_hl_support($CODE, $latitude_via_location_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    public static SubLObject make_latitude_via_location_rule_support() {
        return arguments.make_hl_support($CODE, $latitude_via_location_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    public static final SubLObject latitude_via_location_rule_antecedent_dnf_alt(SubLObject loc) {
        {
            SubLObject rule_antecedent_info = $latitude_via_location_rule_antecedent_template$.getGlobalValue();
            SubLObject input_values = list(loc);
            SubLObject datum = rule_antecedent_info;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject input_el_vars = NIL;
                    SubLObject output_el_vars = NIL;
                    SubLObject scoped_el_vars = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    input_el_vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    output_el_vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    scoped_el_vars = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject el_dnf_template = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt4);
                            el_dnf_template = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject el_bindings = removal_modules_distance_between.make_variable_bindings(input_el_vars, input_values);
                                    SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                                    SubLObject hl_dnf = removal_modules_distance_between.subst_hl_variables(output_el_vars, el_dnf);
                                    SubLObject scoped_hl_vars = removal_modules_distance_between.subst_hl_variables(output_el_vars, scoped_el_vars);
                                    return values(hl_dnf, scoped_hl_vars);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt4);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject latitude_via_location_rule_antecedent_dnf(final SubLObject loc) {
        final SubLObject rule_antecedent_info = $latitude_via_location_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = list(loc);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = NIL;
        SubLObject output_el_vars = NIL;
        SubLObject scoped_el_vars = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        input_el_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        output_el_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject el_dnf_template = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind_error(datum, $list4);
        } else {
            cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    public static final SubLObject removal_latitude_via_location_antecedent_answers_alt(SubLObject loc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem_store = inference_worker.currently_active_problem_store();
                thread.resetMultipleValues();
                {
                    SubLObject rule_antecedent_dnf = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long.latitude_via_location_rule_antecedent_dnf(loc);
                    SubLObject scoped_vars = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
                }
            }
        }
    }

    public static SubLObject removal_latitude_via_location_antecedent_answers(final SubLObject loc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = latitude_via_location_rule_antecedent_dnf(loc);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    public static final SubLObject removal_latitude_via_location_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt11;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, LOC, UNPROVIDED, UNPROVIDED);
                            SubLObject antecedent_answers = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long.removal_latitude_via_location_antecedent_answers(loc, UNPROVIDED);
                            if (NIL != antecedent_answers) {
                                {
                                    SubLObject output_template = list($$latitude, loc, find_variable_by_id(ZERO_INTEGER));
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long.make_latitude_via_location_rule_support();
                                    SubLObject cdolist_list_var = antecedent_answers;
                                    SubLObject antecedent_answer = NIL;
                                    for (antecedent_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_answer = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = antecedent_answer;
                                            SubLObject current = datum;
                                            SubLObject antecedent_bindings = NIL;
                                            SubLObject antecedent_supports = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt14);
                                            antecedent_bindings = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt14);
                                            antecedent_supports = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                {
                                                    SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings_1 = unification_utilities.term_unify(proven_asent, asent, T, T);
                                                        SubLObject unify_justification = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings_1) {
                                                            backward.removal_add_node(rule_support, v_bindings_1, append(antecedent_supports, unify_justification));
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt14);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_latitude_via_location_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, LOC, UNPROVIDED, UNPROVIDED);
            final SubLObject antecedent_answers = removal_latitude_via_location_antecedent_answers(loc, UNPROVIDED);
            if (NIL != antecedent_answers) {
                final SubLObject output_template = list($$latitude, loc, variables.find_variable_by_id(ZERO_INTEGER));
                final SubLObject rule_support = make_latitude_via_location_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, append(antecedent_supports, unify_justification));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject make_longitude_via_location_rule_support_alt() {
        return arguments.make_hl_support($CODE, $longitude_via_location_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    public static SubLObject make_longitude_via_location_rule_support() {
        return arguments.make_hl_support($CODE, $longitude_via_location_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    public static final SubLObject longitude_via_location_rule_antecedent_dnf_alt(SubLObject loc) {
        {
            SubLObject rule_antecedent_info = $longitude_via_location_rule_antecedent_template$.getGlobalValue();
            SubLObject input_values = list(loc);
            SubLObject datum = rule_antecedent_info;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject input_el_vars = NIL;
                    SubLObject output_el_vars = NIL;
                    SubLObject scoped_el_vars = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    input_el_vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    output_el_vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    scoped_el_vars = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject el_dnf_template = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt4);
                            el_dnf_template = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject el_bindings = removal_modules_distance_between.make_variable_bindings(input_el_vars, input_values);
                                    SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                                    SubLObject hl_dnf = removal_modules_distance_between.subst_hl_variables(output_el_vars, el_dnf);
                                    SubLObject scoped_hl_vars = removal_modules_distance_between.subst_hl_variables(output_el_vars, scoped_el_vars);
                                    return values(hl_dnf, scoped_hl_vars);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt4);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject longitude_via_location_rule_antecedent_dnf(final SubLObject loc) {
        final SubLObject rule_antecedent_info = $longitude_via_location_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = list(loc);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = NIL;
        SubLObject output_el_vars = NIL;
        SubLObject scoped_el_vars = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        input_el_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        output_el_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject el_dnf_template = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind_error(datum, $list4);
        } else {
            cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    public static final SubLObject removal_longitude_via_location_antecedent_answers_alt(SubLObject loc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem_store = inference_worker.currently_active_problem_store();
                thread.resetMultipleValues();
                {
                    SubLObject rule_antecedent_dnf = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long.longitude_via_location_rule_antecedent_dnf(loc);
                    SubLObject scoped_vars = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
                }
            }
        }
    }

    public static SubLObject removal_longitude_via_location_antecedent_answers(final SubLObject loc, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = longitude_via_location_rule_antecedent_dnf(loc);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    public static final SubLObject removal_longitude_via_location_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt19;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, LOC, UNPROVIDED, UNPROVIDED);
                            SubLObject antecedent_answers = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long.removal_longitude_via_location_antecedent_answers(loc, UNPROVIDED);
                            if (NIL != antecedent_answers) {
                                {
                                    SubLObject output_template = list($$longitude, loc, find_variable_by_id(ONE_INTEGER));
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lat_long.make_longitude_via_location_rule_support();
                                    SubLObject cdolist_list_var = antecedent_answers;
                                    SubLObject antecedent_answer = NIL;
                                    for (antecedent_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_answer = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = antecedent_answer;
                                            SubLObject current = datum;
                                            SubLObject antecedent_bindings = NIL;
                                            SubLObject antecedent_supports = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt14);
                                            antecedent_bindings = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt14);
                                            antecedent_supports = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                {
                                                    SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings_2 = unification_utilities.term_unify(proven_asent, asent, T, T);
                                                        SubLObject unify_justification = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings_2) {
                                                            backward.removal_add_node(rule_support, v_bindings_2, append(antecedent_supports, unify_justification));
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt14);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_longitude_via_location_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list19;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject loc = list_utilities.alist_lookup_without_values(v_bindings, LOC, UNPROVIDED, UNPROVIDED);
            final SubLObject antecedent_answers = removal_longitude_via_location_antecedent_answers(loc, UNPROVIDED);
            if (NIL != antecedent_answers) {
                final SubLObject output_template = list($$longitude, loc, variables.find_variable_by_id(ONE_INTEGER));
                final SubLObject rule_support = make_longitude_via_location_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$2 = unification_utilities.term_unify(proven_asent, asent, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$2) {
                            backward.removal_add_node(rule_support, v_bindings_$2, append(antecedent_supports, unify_justification));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))), list(reader_make_constant_shell("latitude"), makeSymbol("?PLACE"), makeSymbol("?LAT")));

    static private final SubLList $list_alt3 = list(list(list(makeSymbol("?PLACE")), list(makeSymbol("?LAT"), makeSymbol("?LONG")), list(makeSymbol("?LONG"))), list(NIL, list(list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))))));

    static private final SubLList $list_alt4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    public static SubLObject declare_removal_modules_lat_long_file() {
        declareFunction("make_latitude_via_location_rule_support", "MAKE-LATITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false);
        declareFunction("latitude_via_location_rule_antecedent_dnf", "LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction("removal_latitude_via_location_antecedent_answers", "REMOVAL-LATITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false);
        declareFunction("removal_latitude_via_location_pos_expand", "REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false);
        declareFunction("make_longitude_via_location_rule_support", "MAKE-LONGITUDE-VIA-LOCATION-RULE-SUPPORT", 0, 0, false);
        declareFunction("longitude_via_location_rule_antecedent_dnf", "LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction("removal_longitude_via_location_antecedent_answers", "REMOVAL-LONGITUDE-VIA-LOCATION-ANTECEDENT-ANSWERS", 1, 1, false);
        declareFunction("removal_longitude_via_location_pos_expand", "REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("latitude"), list($BIND, makeSymbol("LOC")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt14 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("latitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("latitude"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LATITUDE-VIA-LOCATION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the latitude from that"), makeKeyword("EXAMPLE"), makeString("(#$latitude #$CityOfSanFranciscoCA ?LONG)") });

    public static SubLObject init_removal_modules_lat_long_file() {
        deflexical("*LATITUDE-VIA-LOCATION-RULE-FORMULA*", $list0);
        deflexical("*LATITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", $list3);
        deflexical("*LONGITUDE-VIA-LOCATION-RULE-FORMULA*", $list17);
        deflexical("*LONGITUDE-VIA-LOCATION-RULE-ANTECEDENT-TEMPLATE*", $list18);
        return NIL;
    }

    public static SubLObject setup_removal_modules_lat_long_file() {
        inference_modules.inference_removal_module($REMOVAL_LATITUDE_VIA_LOCATION_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_LONGITUDE_VIA_LOCATION_POS, $list22);
        inference_modules.inference_removal_module($REMOVAL_LONGITUDE_FROM_LAT_LONG_POS, $list24);
        inference_modules.inference_removal_module($REMOVAL_LATITUDE_FROM_LAT_LONG_POS, $list26);
        return NIL;
    }

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))), list(reader_make_constant_shell("longitude"), makeSymbol("?PLACE"), makeSymbol("?LONG")));

    @Override
    public void declareFunctions() {
        declare_removal_modules_lat_long_file();
    }

    static private final SubLList $list_alt18 = list(list(list(makeSymbol("?PLACE")), list(makeSymbol("?LAT"), makeSymbol("?LONG")), list(makeSymbol("?LAT"))), list(NIL, list(list(reader_make_constant_shell("locatedAtPoint-SurfaceGeographical"), makeSymbol("?PLACE"), list(reader_make_constant_shell("LatLongFn"), makeSymbol("?LAT"), makeSymbol("?LONG"))))));

    @Override
    public void initializeVariables() {
        init_removal_modules_lat_long_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_lat_long_file();
    }

    

    static private final SubLList $list_alt19 = list(reader_make_constant_shell("longitude"), list($BIND, makeSymbol("LOC")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("longitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("longitude"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LONGITUDE-VIA-LOCATION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the longitude from that"), makeKeyword("EXAMPLE"), makeString("(#$longitude #$CityOfSanFranciscoCA ?LONG)") });

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("longitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("longitude"), list(reader_make_constant_shell("LatLongFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("longitude"), list(reader_make_constant_shell("LatLongFn"), list($BIND, makeSymbol("LAT")), list($BIND, makeSymbol("LONG"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LAT"), makeSymbol("LONG")), list(reader_make_constant_shell("longitude"), list(reader_make_constant_shell("LatLongFn"), list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG"))), list(makeKeyword("VALUE"), makeSymbol("LONG")))), makeKeyword("DOCUMENTATION"), makeString("(#$longitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$longitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("latitude"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("latitude"), list(reader_make_constant_shell("LatLongFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("latitude"), list(reader_make_constant_shell("LatLongFn"), list($BIND, makeSymbol("LAT")), list($BIND, makeSymbol("LONG"))), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("LAT"), makeSymbol("LONG")), list(reader_make_constant_shell("latitude"), list(reader_make_constant_shell("LatLongFn"), list(makeKeyword("VALUE"), makeSymbol("LAT")), list(makeKeyword("VALUE"), makeSymbol("LONG"))), list(makeKeyword("VALUE"), makeSymbol("LAT")))), makeKeyword("DOCUMENTATION"), makeString("(#$latitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$latitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
}

/**
 * Total time: 125 ms
 */
