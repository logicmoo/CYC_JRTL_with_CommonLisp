/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-GIS
 *  source file: /cyc/top/cycl/inference/modules/removal/removal-modules-gis.lisp
 *  created:     2019/07/03 17:37:47
 */
public final class removal_modules_gis extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_gis() {
    }

    public static final SubLFile me = new removal_modules_gis();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_gis";

    // // Definitions
    /**
     * The IP address of the GIS server.
     */
    // defparameter
    private static final SubLSymbol $gis_server_host$ = makeSymbol("*GIS-SERVER-HOST*");

    /**
     * Port of the GIS server.
     */
    // defparameter
    private static final SubLSymbol $gis_server_port$ = makeSymbol("*GIS-SERVER-PORT*");

    public static final SubLObject get_gis_server_host() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $gis_server_host$.getDynamicValue(thread);
        }
    }

    public static final SubLObject get_gis_server_port() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $gis_server_port$.getDynamicValue(thread);
        }
    }

    // deflexical
    private static final SubLSymbol $force_element_query$ = makeSymbol("*FORCE-ELEMENT-QUERY*");

    // deflexical
    private static final SubLSymbol $tactical_point_query$ = makeSymbol("*TACTICAL-POINT-QUERY*");

    // deflexical
    private static final SubLSymbol $tactical_line_query$ = makeSymbol("*TACTICAL-LINE-QUERY*");

    // deflexical
    private static final SubLSymbol $tactical_area_query$ = makeSymbol("*TACTICAL-AREA-QUERY*");

    // deflexical
    private static final SubLSymbol $intersection_types$ = makeSymbol("*INTERSECTION-TYPES*");

    // deflexical
    private static final SubLSymbol $force_elements$ = makeSymbol("*FORCE-ELEMENTS*");

    // deflexical
    private static final SubLSymbol $tactical_points$ = makeSymbol("*TACTICAL-POINTS*");

    // deflexical
    private static final SubLSymbol $tactical_lines$ = makeSymbol("*TACTICAL-LINES*");

    // deflexical
    private static final SubLSymbol $tactical_areas$ = makeSymbol("*TACTICAL-AREAS*");

    public static final SubLObject save_gis_cache(SubLObject filename) {
        return cfasl_utilities.cfasl_save_externalized(list($force_elements$.getGlobalValue(), $tactical_points$.getGlobalValue(), $tactical_lines$.getGlobalValue(), $tactical_areas$.getGlobalValue()), filename);
    }

    public static final SubLObject load_gis_cache(SubLObject filename) {
        {
            SubLObject datum_evaluated_var = cfasl_utilities.cfasl_load(filename);
            $force_elements$.setGlobalValue(datum_evaluated_var.first());
            $tactical_points$.setGlobalValue(cadr(datum_evaluated_var));
            $tactical_lines$.setGlobalValue(cddr(datum_evaluated_var).first());
            $tactical_areas$.setGlobalValue(cadr(cddr(datum_evaluated_var)));
        }
        return T;
    }

    public static final SubLObject removal_force_element_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_force_element_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_object = second(asent);
            SubLObject force_elements = get_force_elements();
            SubLObject cdolist_list_var = force_elements;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                {
                    SubLObject id = getf(element, $ID, UNPROVIDED);
                    SubLObject force = get_gis_item_by_id_and_type(id, $$ModernMilitaryUnit_Deployable);
                    SubLObject formula = list($$forceElement_FromGIS, force);
                    backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(v_object, force)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_force_elements(SubLObject response) {
        {
            SubLObject state = $NORMAL;
            SubLObject id = NIL;
            SubLObject point = NIL;
            SubLObject force_elements = NIL;
            SubLObject cdolist_list_var = response;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != search($str_alt21$_FORCEELEMENT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_ELEMENT;
                }
                if (NIL != string_utilities.starts_with($str_alt23$__FORCEELEMENT_, element)) {
                    force_elements = cons(list($ID, id, $POINT, point), force_elements);
                    state = $NORMAL;
                }
                if (NIL != search($str_alt25$_AIGISPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_POINT;
                }
                {
                    SubLObject pcase_var = state;
                    if (pcase_var.eql($INSIDE_ELEMENT)) {
                        id = extract_id(element);
                    } else
                        if (pcase_var.eql($INSIDE_POINT)) {
                            point = extract_point(element);
                        }

                }
            }
            return nreverse(force_elements);
        }
    }

    public static final SubLObject removal_tactical_point_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_tactical_point_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_object = second(asent);
            SubLObject tactical_points = get_tactical_points();
            SubLObject cdolist_list_var = tactical_points;
            SubLObject tactical_point_plist = NIL;
            for (tactical_point_plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactical_point_plist = cdolist_list_var.first()) {
                {
                    SubLObject id = getf(tactical_point_plist, $ID, UNPROVIDED);
                    SubLObject tactical_point = get_gis_item_by_id_and_type(id, $$TacticalPoint);
                    SubLObject formula = list($$tacticalPoint_FromGIS, tactical_point);
                    backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(v_object, tactical_point)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_tactical_points(SubLObject response) {
        {
            SubLObject state = $NORMAL;
            SubLObject id = NIL;
            SubLObject point = NIL;
            SubLObject tactical_points = NIL;
            SubLObject cdolist_list_var = response;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != search($str_alt30$_TACTICALPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_ELEMENT;
                }
                if ((state == $INSIDE_ELEMENT) && (NIL != string_utilities.ends_with(element, $str_alt31$__, UNPROVIDED))) {
                    state = $NO_POINT_INFO;
                }
                if (NIL != string_utilities.starts_with($str_alt33$__TACTICALPOINT_, element)) {
                    tactical_points = cons(list($ID, id, $POINT, point), tactical_points);
                    state = $NORMAL;
                }
                if (NIL != search($str_alt34$_SIMPLEPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_POINT;
                }
                {
                    SubLObject pcase_var = state;
                    if (pcase_var.eql($NO_POINT_INFO)) {
                        tactical_points = cons(list($ID, extract_id(element), $POINT, NIL), tactical_points);
                        state = $NORMAL;
                    } else
                        if (pcase_var.eql($INSIDE_ELEMENT)) {
                            id = extract_id(element);
                        } else
                            if (pcase_var.eql($INSIDE_POINT)) {
                                point = extract_point(element);
                            }


                }
            }
            return nreverse(tactical_points);
        }
    }

    public static final SubLObject removal_tactical_line_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_tactical_line_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_object = second(asent);
            SubLObject tactical_lines = get_tactical_lines();
            SubLObject cdolist_list_var = tactical_lines;
            SubLObject tactical_line_plist = NIL;
            for (tactical_line_plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactical_line_plist = cdolist_list_var.first()) {
                {
                    SubLObject id = getf(tactical_line_plist, $ID, UNPROVIDED);
                    SubLObject tactical_line = get_gis_item_by_id_and_type(id, $$TacticalLine);
                    SubLObject formula = list($$tacticalLine_FromGIS, tactical_line);
                    backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(v_object, tactical_line)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_tactical_lines(SubLObject response) {
        {
            SubLObject state = $NORMAL;
            SubLObject id = NIL;
            SubLObject length = NIL;
            SubLObject first_point = NIL;
            SubLObject second_point = NIL;
            SubLObject tactical_lines = NIL;
            SubLObject cdolist_list_var = response;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != search($str_alt38$_TACTICALLINE_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_ELEMENT;
                }
                if (NIL != string_utilities.starts_with($str_alt39$__TACTICALLINE_, element)) {
                    {
                        SubLObject line = list($LENGTH, length, $STARTPOINT, first_point, $ENDPOINT, second_point);
                        tactical_lines = cons(list($ID, id, $LINE, line), tactical_lines);
                    }
                    state = $NORMAL;
                }
                if (NIL != search($str_alt34$_SIMPLEPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject pcase_var = state;
                        if (pcase_var.eql($INSIDE_FIRST_POINT)) {
                            state = $INSIDE_SECOND_POINT;
                        } else {
                            state = $INSIDE_FIRST_POINT;
                        }
                    }
                }
                {
                    SubLObject pcase_var = state;
                    if (pcase_var.eql($INSIDE_ELEMENT)) {
                        id = extract_id(element);
                        length = extract_length(element);
                    } else
                        if (pcase_var.eql($INSIDE_FIRST_POINT)) {
                            first_point = extract_point(element);
                        } else
                            if (pcase_var.eql($INSIDE_SECOND_POINT)) {
                                second_point = extract_point(element);
                            }


                }
            }
            return nreverse(tactical_lines);
        }
    }

    public static final SubLObject removal_tactical_area_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_tactical_area_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_object = second(asent);
            SubLObject tactical_areas = get_tactical_areas();
            SubLObject cdolist_list_var = tactical_areas;
            SubLObject tactical_area_plist = NIL;
            for (tactical_area_plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactical_area_plist = cdolist_list_var.first()) {
                {
                    SubLObject id = getf(tactical_area_plist, $ID, UNPROVIDED);
                    SubLObject tactical_area = get_gis_item_by_id_and_type(id, $$TacticalArea);
                    SubLObject formula = list($$tacticalArea_FromGIS, tactical_area);
                    backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(v_object, tactical_area)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_tactical_areas(SubLObject response) {
        {
            SubLObject state = $NORMAL;
            SubLObject id = NIL;
            SubLObject area = NIL;
            SubLObject point = NIL;
            SubLObject tactical_areas = NIL;
            SubLObject cdolist_list_var = response;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != search($str_alt49$_TACTICALAREA_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_ELEMENT;
                }
                if (NIL != string_utilities.starts_with($str_alt50$__TACTICALAREA_, element)) {
                    {
                        SubLObject tactical_area = list($TOTAL_AREA, area, $CENTER, point);
                        tactical_areas = cons(list($ID, id, $AREA, tactical_area), tactical_areas);
                    }
                    state = $NORMAL;
                }
                if (NIL != search($str_alt34$_SIMPLEPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_POINT;
                }
                {
                    SubLObject pcase_var = state;
                    if (pcase_var.eql($INSIDE_ELEMENT)) {
                        id = extract_id(element);
                        area = extract_area(element);
                    } else
                        if (pcase_var.eql($INSIDE_POINT)) {
                            point = extract_point(element);
                        }

                }
            }
            return nreverse(tactical_areas);
        }
    }

    public static final SubLObject removal_intersection_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return multiply(TWO_INTEGER, control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    }

    public static final SubLObject removal_intersection_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject intersection = second(asent);
            SubLObject v_set = third(asent);
            SubLObject first_object = second(v_set);
            SubLObject second_object = third(v_set);
            SubLObject first_object_id = gis_item_id(first_object);
            SubLObject second_object_id = gis_item_id(second_object);
            SubLObject first_object_type = determine_object_type(first_object);
            SubLObject second_object_type = determine_object_type(second_object);
            SubLObject intersection_query = construct_intersection_query(first_object_id, first_object_type, second_object_id, second_object_type);
            SubLObject response = (NIL != intersection_query) ? ((SubLObject) (xml_converse_with_gis_server(intersection_query))) : NIL;
            SubLObject intersections = (NIL != response) ? ((SubLObject) (extract_intersections(response))) : NIL;
            if (NIL != intersections) {
                {
                    SubLObject first_obj_canonicalized = canonicalize_gis_item(first_object);
                    SubLObject second_obj_canonicalized = canonicalize_gis_item(second_object);
                    SubLObject intersection_naut = list($$SpatialIntersectionFn, list($$TheSet, first_obj_canonicalized, second_obj_canonicalized));
                    SubLObject formula = list($$spatiallyIntersects, intersection_naut, list($$TheSet, first_object, second_object));
                    backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(intersection, intersection_naut)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_intersections(SubLObject response) {
        {
            SubLObject state = $NORMAL;
            SubLObject id = NIL;
            SubLObject area = NIL;
            SubLObject first_point = NIL;
            SubLObject second_point = NIL;
            SubLObject length = NIL;
            SubLObject intersections = NIL;
            SubLObject cdolist_list_var = response;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != search($str_alt59$_AIGISAREA_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_AREA;
                }
                if (NIL != search($str_alt61$__AIGISAREA_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject intersection_area = list($TOTAL_AREA, area, $CENTER, first_point);
                        intersections = cons(list($ID, id, $AREA, intersection_area), intersections);
                    }
                    state = $NORMAL;
                }
                if (NIL != search($str_alt62$_AIGISPATH_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    state = $INSIDE_PATH;
                }
                if (NIL != search($str_alt64$__AIGISPATH_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject line = list($LENGTH, length, $START_POINT, first_point, $END_POINT, second_point);
                        intersections = cons(list($ID, id, $LINE, line), intersections);
                    }
                    state = $NORMAL;
                }
                if (NIL != search($str_alt34$_SIMPLEPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject pcase_var = state;
                        if (pcase_var.eql($INSIDE_FIRST_POINT)) {
                            state = $INSIDE_SECOND_POINT;
                        } else {
                            state = $INSIDE_FIRST_POINT;
                        }
                    }
                }
                {
                    SubLObject pcase_var = state;
                    if (pcase_var.eql($INSIDE_AREA)) {
                        id = extract_id(element);
                        area = extract_area(element);
                    } else
                        if (pcase_var.eql($INSIDE_PATH)) {
                            id = extract_id(element);
                            length = extract_length(element);
                        } else
                            if (pcase_var.eql($INSIDE_FIRST_POINT)) {
                                first_point = extract_point(element);
                            } else
                                if (pcase_var.eql($INSIDE_SECOND_POINT)) {
                                    second_point = extract_point(element);
                                }



                }
            }
            return nreverse(intersections);
        }
    }

    public static final SubLObject removal_los_object_to_region_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return multiply(TWO_INTEGER, control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    }

    public static final SubLObject removal_los_object_to_region_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject v_object = second(asent);
            SubLObject viewshed_var = third(asent);
            SubLObject viewshed_query = construct_viewshed_query(v_object);
            SubLObject response = (NIL != viewshed_query) ? ((SubLObject) (xml_converse_with_gis_server(viewshed_query))) : NIL;
            SubLObject viewshed_plist = (NIL != response) ? ((SubLObject) (extract_viewshed(response))) : NIL;
            if (NIL != viewshed_plist) {
                {
                    SubLObject id = getf(viewshed_plist, $ID, UNPROVIDED);
                    SubLObject viewshed = get_gis_item_by_id_and_type(id, $$TacticalArea);
                    SubLObject formula = list($$lineOfSight_ObjectToRegion, v_object, viewshed);
                    backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(viewshed_var, viewshed)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_viewshed(SubLObject response) {
        {
            SubLObject id = NIL;
            SubLObject area = NIL;
            SubLObject point = NIL;
            SubLObject cdolist_list_var = response;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != search($str_alt69$_VIEWSHED_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    id = extract_id(element);
                    area = extract_area(element);
                }
                if (NIL != search($str_alt70$__VIEWSHED_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return list($ID, id, $AREA, area, $POINT, point);
                }
                if (NIL != search($str_alt34$_SIMPLEPOINT_, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    point = extract_point(element);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject removal_located_at_point_surf_geog_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    }

    public static final SubLObject removal_located_at_point_surf_geog_sentence_lookup_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            SubLObject spatial_thing = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            SubLObject location_var = cycl_utilities.formula_arg2(asent, UNPROVIDED);
            SubLObject type = determine_object_type(spatial_thing);
            SubLObject all_items = get_all_items_of_type(type);
            SubLObject location = (NIL != all_items) ? ((SubLObject) (extract_location_of(spatial_thing, all_items))) : NIL;
            if (NIL != location) {
                {
                    SubLObject datum = location;
                    SubLObject current = datum;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_1 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt73);
                        current_1 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt73);
                        if (NIL == member(current_1, $list_alt74, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_1 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt73);
                    }
                    {
                        SubLObject x_tail = property_list_member($X, current);
                        SubLObject x = (NIL != x_tail) ? ((SubLObject) (cadr(x_tail))) : NIL;
                        SubLObject y_tail = property_list_member($Y, current);
                        SubLObject y = (NIL != y_tail) ? ((SubLObject) (cadr(y_tail))) : NIL;
                        SubLObject geog_point = construct_geographical_point(y, x);
                        SubLObject formula = el_utilities.make_binary_formula($$locatedAtPoint_SurfGeog_FromGIS, spatial_thing, geog_point);
                        backward.removal_add_node(arguments.make_hl_support($GIS, formula, UNPROVIDED, UNPROVIDED), list(bindings.make_variable_binding(location_var, geog_point)), UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_location_of(SubLObject spatial_thing, SubLObject items) {
        {
            SubLObject id = gis_item_id(spatial_thing);
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                {
                    SubLObject this_id = getf(item, $ID, UNPROVIDED);
                    if (NIL != Strings.string_equal(this_id, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return extract_location_of_int(item);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject extract_location_of_int(SubLObject gis_plist) {
        {
            SubLObject point = getf(gis_plist, $POINT, UNPROVIDED);
            if (NIL != point) {
                return point;
            }
        }
        {
            SubLObject line = getf(gis_plist, $LINE, UNPROVIDED);
            if (NIL != line) {
                {
                    SubLObject startpoint = getf(line, $STARTPOINT, UNPROVIDED);
                    SubLObject endpoint = getf(line, $ENDPOINT, UNPROVIDED);
                    SubLObject startpoint_x = getf(startpoint, $X, UNPROVIDED);
                    SubLObject startpoint_y = getf(startpoint, $Y, UNPROVIDED);
                    SubLObject endpoint_x = getf(endpoint, $X, UNPROVIDED);
                    SubLObject endpoint_y = getf(endpoint, $Y, UNPROVIDED);
                    SubLObject midpoint_x = divide(add(startpoint_x, endpoint_x), TWO_INTEGER);
                    SubLObject midpoint_y = divide(add(startpoint_y, endpoint_y), TWO_INTEGER);
                    return list($X, midpoint_x, $Y, midpoint_y);
                }
            }
        }
        {
            SubLObject area = getf(gis_plist, $AREA, UNPROVIDED);
            if (NIL != area) {
                return getf(area, $CENTER, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject get_all_items_of_type(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($$ModernMilitaryUnit_Deployable)) {
                return get_force_elements();
            } else
                if (pcase_var.eql($$TacticalPoint)) {
                    return get_tactical_points();
                } else
                    if (pcase_var.eql($$TacticalLine)) {
                        return get_tactical_lines();
                    } else
                        if (pcase_var.eql($$TacticalArea)) {
                            return get_tactical_areas();
                        } else {
                            return NIL;
                        }



        }
    }

    public static final SubLObject get_force_elements() {
        if ($force_elements$.getGlobalValue() == $NOT_CACHED) {
            {
                SubLObject response = xml_converse_with_gis_server($force_element_query$.getGlobalValue());
                if (NIL != response) {
                    $force_elements$.setGlobalValue(extract_force_elements(response));
                }
            }
        }
        return $force_elements$.getGlobalValue();
    }

    public static final SubLObject get_tactical_points() {
        if ($tactical_points$.getGlobalValue() == $NOT_CACHED) {
            {
                SubLObject response = xml_converse_with_gis_server($tactical_point_query$.getGlobalValue());
                if (NIL != response) {
                    $tactical_points$.setGlobalValue(extract_tactical_points(response));
                }
            }
        }
        return $tactical_points$.getGlobalValue();
    }

    public static final SubLObject get_tactical_lines() {
        if ($tactical_lines$.getGlobalValue() == $NOT_CACHED) {
            {
                SubLObject response = xml_converse_with_gis_server($tactical_line_query$.getGlobalValue());
                if (NIL != response) {
                    $tactical_lines$.setGlobalValue(extract_tactical_lines(response));
                }
            }
        }
        return $tactical_lines$.getGlobalValue();
    }

    public static final SubLObject get_tactical_areas() {
        if ($tactical_areas$.getGlobalValue() == $NOT_CACHED) {
            {
                SubLObject response = xml_converse_with_gis_server($tactical_area_query$.getGlobalValue());
                if (NIL != response) {
                    $tactical_areas$.setGlobalValue(extract_tactical_areas(response));
                }
            }
        }
        return $tactical_areas$.getGlobalValue();
    }

    public static final SubLObject extract_id(SubLObject element) {
        return string_utilities.get_substring_between_tags(element, $str_alt78$id__, $str_alt79$__, ZERO_INTEGER, NIL);
    }

    public static final SubLObject extract_point(SubLObject element) {
        return list($X, read_from_string_ignoring_errors(string_utilities.get_substring_between_tags(element, $str_alt80$x__, $str_alt79$__, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $Y, read_from_string_ignoring_errors(string_utilities.get_substring_between_tags(element, $str_alt81$y__, $str_alt82$__, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject extract_length(SubLObject element) {
        return read_from_string_ignoring_errors(string_utilities.get_substring_between_tags(element, $str_alt83$length__, $str_alt84$__, ZERO_INTEGER, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject extract_area(SubLObject element) {
        return read_from_string_ignoring_errors(string_utilities.get_substring_between_tags(element, $str_alt85$totalarea__, $str_alt79$__, ZERO_INTEGER, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * create an appropriate xml query to send to the GIS
     */
    public static final SubLObject construct_intersection_query(SubLObject id1, SubLObject type1, SubLObject id2, SubLObject type2) {
        {
            SubLObject type = determine_intersection_type(type1, type2);
            SubLObject type_string = getf($intersection_types$.getGlobalValue(), type, UNPROVIDED);
            if (NIL != type_string) {
                return format(NIL, $str_alt86$_AIGIS__REQUEST__CALCULATE__INTER, new SubLObject[]{ type_string, id1, id2, type_string });
            }
            return NIL;
        }
    }

    public static final SubLObject determine_object_type(SubLObject v_object) {
        if (NIL != isa.isa_in_any_mtP(v_object, $$TacticalPoint)) {
            return $$TacticalPoint;
        } else
            if (NIL != isa.isa_in_any_mtP(v_object, $$TacticalLine)) {
                return $$TacticalLine;
            } else
                if (NIL != isa.isa_in_any_mtP(v_object, $$TacticalArea)) {
                    return $$TacticalArea;
                } else
                    if (NIL != isa.isa_in_any_mtP(v_object, $$ModernMilitaryUnit_Deployable)) {
                        return $$ModernMilitaryUnit_Deployable;
                    } else {
                        return NIL;
                    }



    }

    public static final SubLObject determine_intersection_type(SubLObject type1, SubLObject type2) {
        if ((((type1 == $$TacticalPoint) || (type1 == $$ModernMilitaryUnit_Deployable)) && (type2 == $$TacticalArea)) || (((type2 == $$TacticalPoint) || (type2 == $$ModernMilitaryUnit_Deployable)) && (type1 == $$TacticalArea))) {
            return $POINT_TO_AREA;
        } else
            if (((type1 == $$TacticalLine) && (type2 == $$TacticalArea)) || ((type2 == $$TacticalLine) && (type1 == $$TacticalArea))) {
                return $PATH_TO_AREA;
            } else {
                return NIL;
            }

    }

    /**
     * object is assumed to be of the form (#$InstanceNamedFn 'blah' #$Thing)
     */
    public static final SubLObject construct_viewshed_query(SubLObject v_object) {
        {
            SubLObject id = gis_item_id(v_object);
            if (NIL != id) {
                return format(NIL, $str_alt89$_AIGIS__REQUEST__CALCULATE__VIEWS, id);
            }
            return NIL;
        }
    }

    public static final SubLObject converse_with_gis_server(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject response = $str_alt90$;
                SubLObject stream = NIL;
                try {
                    stream = subl_promotions.open_tcp_stream_with_timeout(get_gis_server_host(), get_gis_server_port(), NIL, $PRIVATE);
                    if (NIL != stream) {
                        write_string(query, stream, UNPROVIDED, UNPROVIDED);
                        string_utilities.network_terpri(stream);
                        force_output(stream);
                        {
                            SubLObject length = $int$64;
                            SubLObject buffer = Strings.make_string(length, UNPROVIDED);
                            SubLObject idx = ZERO_INTEGER;
                            SubLObject done = NIL;
                            {
                                SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                                try {
                                    Errors.$continue_cerrorP$.bind(T, thread);
                                    {
                                        SubLObject error_message = NIL;
                                        while (NIL == done) {
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            {
                                                                SubLObject ch = read_char(stream, T, UNPROVIDED, UNPROVIDED);
                                                                if (NIL != ch) {
                                                                    buffer = string_utilities.add_to_buffer(ch, buffer, idx);
                                                                    idx = add(idx, ONE_INTEGER);
                                                                }
                                                            }
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            }
                                            if (NIL != error_message) {
                                                done = T;
                                            }
                                        } 
                                        if (subtract(idx, TWO_INTEGER).numG(ZERO_INTEGER)) {
                                            response = string_utilities.substring(buffer, ZERO_INTEGER, subtract(idx, TWO_INTEGER));
                                        }
                                    }
                                } finally {
                                    Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return response;
            }
        }
    }

    /**
     *
     *
     * @return list of tokenized strings
     */
    public static final SubLObject xml_converse_with_gis_server(SubLObject query) {
        {
            SubLObject response = NIL;
            SubLObject stream = NIL;
            try {
                stream = subl_promotions.open_tcp_stream_with_timeout(get_gis_server_host(), get_gis_server_port(), NIL, $PRIVATE);
                if (NIL != stream) {
                    write_string(query, stream, UNPROVIDED, UNPROVIDED);
                    string_utilities.network_terpri(stream);
                    force_output(stream);
                    response = web_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != stream) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return response;
        }
    }

    public static final SubLObject parse_gis_response(SubLObject response) {
        {
            SubLObject stream = make_string_input_stream(response, UNPROVIDED, UNPROVIDED);
            SubLObject tokens = web_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return tokens;
        }
    }

    public static final SubLObject canonicalize_gis_item(SubLObject item) {
        SubLSystemTrampolineFile.checkType(item, GIS_ITEM_P);
        if (NIL != forts.fort_p(item)) {
            return item;
        } else {
            {
                SubLObject id = gis_item_id(item);
                SubLObject fort = find_gis_fort_by_id(id);
                return NIL != fort ? ((SubLObject) (fort)) : item;
            }
        }
    }

    public static final SubLObject get_gis_item_by_id_and_type(SubLObject id, SubLObject type) {
        {
            SubLObject fort = find_gis_fort_by_id(id);
            return NIL != fort ? ((SubLObject) (fort)) : el_utilities.make_binary_formula($$InstanceNamedFn, id, type);
        }
    }

    public static final SubLObject find_gis_fort_by_id(SubLObject id) {
        return kb_mapping_utilities.pred_arg_values_in_mt($$RKFYear3GIS, $$synonymousExternalConcept, id, $$RKFYear3GISMt, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, UNPROVIDED).first();
    }

    /**
     *
     *
     * @return stringp; the id of the GIS term ITEM
     */
    public static final SubLObject gis_item_id(SubLObject item) {
        if (NIL != forts.fort_p(item)) {
            return kb_mapping_utilities.pred_arg_values_in_mt(item, $$synonymousExternalConcept, $$RKFYear3GIS, $$RKFYear3GISMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        } else {
            return cycl_utilities.formula_arg1(item, UNPROVIDED);
        }
    }

    public static final SubLObject construct_geographical_point(SubLObject lat, SubLObject v_long) {
        return el_utilities.make_binary_formula($$LatLongFn, el_utilities.make_unary_formula($$Degree_UnitOfAngularMeasure, lat), el_utilities.make_unary_formula($$Degree_UnitOfAngularMeasure, v_long));
    }

    public static final SubLObject gis_item_p(SubLObject item) {
        return makeBoolean((NIL != forts.fort_p(item)) || (NIL != narts_high.naut_p(item)));
    }

    public static final SubLObject declare_removal_modules_gis_file() {
        declareFunction("get_gis_server_host", "GET-GIS-SERVER-HOST", 0, 0, false);
        declareFunction("get_gis_server_port", "GET-GIS-SERVER-PORT", 0, 0, false);
        declareFunction("save_gis_cache", "SAVE-GIS-CACHE", 1, 0, false);
        declareFunction("load_gis_cache", "LOAD-GIS-CACHE", 1, 0, false);
        declareFunction("removal_force_element_sentence_lookup_pos_cost", "REMOVAL-FORCE-ELEMENT-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_force_element_sentence_lookup_pos_expand", "REMOVAL-FORCE-ELEMENT-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_force_elements", "EXTRACT-FORCE-ELEMENTS", 1, 0, false);
        declareFunction("removal_tactical_point_sentence_lookup_pos_cost", "REMOVAL-TACTICAL-POINT-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_tactical_point_sentence_lookup_pos_expand", "REMOVAL-TACTICAL-POINT-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_tactical_points", "EXTRACT-TACTICAL-POINTS", 1, 0, false);
        declareFunction("removal_tactical_line_sentence_lookup_pos_cost", "REMOVAL-TACTICAL-LINE-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_tactical_line_sentence_lookup_pos_expand", "REMOVAL-TACTICAL-LINE-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_tactical_lines", "EXTRACT-TACTICAL-LINES", 1, 0, false);
        declareFunction("removal_tactical_area_sentence_lookup_pos_cost", "REMOVAL-TACTICAL-AREA-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_tactical_area_sentence_lookup_pos_expand", "REMOVAL-TACTICAL-AREA-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_tactical_areas", "EXTRACT-TACTICAL-AREAS", 1, 0, false);
        declareFunction("removal_intersection_sentence_lookup_pos_cost", "REMOVAL-INTERSECTION-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_intersection_sentence_lookup_pos_expand", "REMOVAL-INTERSECTION-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_intersections", "EXTRACT-INTERSECTIONS", 1, 0, false);
        declareFunction("removal_los_object_to_region_sentence_lookup_pos_cost", "REMOVAL-LOS-OBJECT-TO-REGION-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_los_object_to_region_sentence_lookup_pos_expand", "REMOVAL-LOS-OBJECT-TO-REGION-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_viewshed", "EXTRACT-VIEWSHED", 1, 0, false);
        declareFunction("removal_located_at_point_surf_geog_sentence_lookup_pos_cost", "REMOVAL-LOCATED-AT-POINT-SURF-GEOG-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
        declareFunction("removal_located_at_point_surf_geog_sentence_lookup_pos_expand", "REMOVAL-LOCATED-AT-POINT-SURF-GEOG-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false);
        declareFunction("extract_location_of", "EXTRACT-LOCATION-OF", 2, 0, false);
        declareFunction("extract_location_of_int", "EXTRACT-LOCATION-OF-INT", 1, 0, false);
        declareFunction("get_all_items_of_type", "GET-ALL-ITEMS-OF-TYPE", 1, 0, false);
        declareFunction("get_force_elements", "GET-FORCE-ELEMENTS", 0, 0, false);
        declareFunction("get_tactical_points", "GET-TACTICAL-POINTS", 0, 0, false);
        declareFunction("get_tactical_lines", "GET-TACTICAL-LINES", 0, 0, false);
        declareFunction("get_tactical_areas", "GET-TACTICAL-AREAS", 0, 0, false);
        declareFunction("extract_id", "EXTRACT-ID", 1, 0, false);
        declareFunction("extract_point", "EXTRACT-POINT", 1, 0, false);
        declareFunction("extract_length", "EXTRACT-LENGTH", 1, 0, false);
        declareFunction("extract_area", "EXTRACT-AREA", 1, 0, false);
        declareFunction("construct_intersection_query", "CONSTRUCT-INTERSECTION-QUERY", 4, 0, false);
        declareFunction("determine_object_type", "DETERMINE-OBJECT-TYPE", 1, 0, false);
        declareFunction("determine_intersection_type", "DETERMINE-INTERSECTION-TYPE", 2, 0, false);
        declareFunction("construct_viewshed_query", "CONSTRUCT-VIEWSHED-QUERY", 1, 0, false);
        declareFunction("converse_with_gis_server", "CONVERSE-WITH-GIS-SERVER", 1, 0, false);
        declareFunction("xml_converse_with_gis_server", "XML-CONVERSE-WITH-GIS-SERVER", 1, 0, false);
        declareFunction("parse_gis_response", "PARSE-GIS-RESPONSE", 1, 0, false);
        declareFunction("canonicalize_gis_item", "CANONICALIZE-GIS-ITEM", 1, 0, false);
        declareFunction("get_gis_item_by_id_and_type", "GET-GIS-ITEM-BY-ID-AND-TYPE", 2, 0, false);
        declareFunction("find_gis_fort_by_id", "FIND-GIS-FORT-BY-ID", 1, 0, false);
        declareFunction("gis_item_id", "GIS-ITEM-ID", 1, 0, false);
        declareFunction("construct_geographical_point", "CONSTRUCT-GEOGRAPHICAL-POINT", 2, 0, false);
        declareFunction("gis_item_p", "GIS-ITEM-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_gis_file() {
        defparameter("*GIS-SERVER-HOST*", $str_alt0$phillie_cyc_com);
        defparameter("*GIS-SERVER-PORT*", $int$4000);
        deflexical("*FORCE-ELEMENT-QUERY*", $str_alt2$_AIGIS__REQUEST__GET__ALLFORCEELE);
        deflexical("*TACTICAL-POINT-QUERY*", $str_alt3$_AIGIS__REQUEST__GET__ALLTACTICAL);
        deflexical("*TACTICAL-LINE-QUERY*", $str_alt4$_AIGIS__REQUEST__GET__ALLTACTICAL);
        deflexical("*TACTICAL-AREA-QUERY*", $str_alt5$_AIGIS__REQUEST__GET__ALLTACTICAL);
        deflexical("*INTERSECTION-TYPES*", $list_alt6);
        deflexical("*FORCE-ELEMENTS*", $NOT_CACHED);
        deflexical("*TACTICAL-POINTS*", $NOT_CACHED);
        deflexical("*TACTICAL-LINES*", $NOT_CACHED);
        deflexical("*TACTICAL-AREAS*", $NOT_CACHED);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_gis_file() {
                inference_modules.register_solely_specific_removal_module_predicate($$forceElement_FromGIS);
        inference_modules.register_solely_specific_removal_module_predicate($$tacticalPoint_FromGIS);
        inference_modules.register_solely_specific_removal_module_predicate($$tacticalLine_FromGIS);
        inference_modules.register_solely_specific_removal_module_predicate($$tacticalArea_FromGIS);
        inference_modules.register_solely_specific_removal_module_predicate($$spatialIntersectionOf);
        inference_modules.register_solely_specific_removal_module_predicate($$lineOfSight_ObjectToRegion);
        inference_modules.register_solely_specific_removal_module_predicate($$locatedAtPoint_SurfGeog_FromGIS);
        inference_modules.inference_removal_module($REMOVAL_FORCE_ELEMENT_SENTENCE_LOOKUP_POS, $list_alt16);
        inference_modules.inference_removal_module($REMOVAL_TACTICAL_POINT_SENTENCE_LOOKUP_POS, $list_alt28);
        inference_modules.inference_removal_module($REMOVAL_TACTICAL_LINE_SENTENCE_LOOKUP_POS, $list_alt36);
        inference_modules.inference_removal_module($REMOVAL_TACTICAL_AREA_SENTENCE_LOOKUP_POS, $list_alt47);
        inference_modules.inference_removal_module($REMOVAL_INTERSECTION_SENTENCE_LOOKUP_POS, $list_alt55);
        inference_modules.inference_removal_module($REMOVAL_LOS_OBJECT_TO_REGION_SENTENCE_LOOKUP_POS, $list_alt68);
        inference_modules.inference_removal_module($REMOVAL_LOCATED_AT_POINT_SURF_GEOG_SENTENCE_LOOKUP_POS, $list_alt72);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$phillie_cyc_com = makeString("phillie.cyc.com");

    public static final SubLInteger $int$4000 = makeInteger(4000);

    static private final SubLString $str_alt2$_AIGIS__REQUEST__GET__ALLFORCEELE = makeString("<AIGIS><REQUEST><GET><ALLFORCEELEMENTS/></GET></REQUEST><RESPONSE/></AIGIS>");

    static private final SubLString $str_alt3$_AIGIS__REQUEST__GET__ALLTACTICAL = makeString("<AIGIS><REQUEST><GET><ALLTACTICALPOINTS/></GET></REQUEST><RESPONSE/></AIGIS>");

    static private final SubLString $str_alt4$_AIGIS__REQUEST__GET__ALLTACTICAL = makeString("<AIGIS><REQUEST><GET><ALLTACTICALLINES/></GET></REQUEST><RESPONSE/></AIGIS>");

    static private final SubLString $str_alt5$_AIGIS__REQUEST__GET__ALLTACTICAL = makeString("<AIGIS><REQUEST><GET><ALLTACTICALAREAS/></GET></REQUEST><RESPONSE/></AIGIS>");

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("POINT-TO-AREA"), makeString("POINTTOAREA"), makeKeyword("PATH-TO-AREA"), makeString("PATHTOAREA"), makeKeyword("POINT-TO-PATH"), makeString("POINTTOPATH"), makeKeyword("PATH-TO-PATH"), makeString("PATHTOPATH"), makeKeyword("AREA-TO-AREA"), makeString("AREATOAREA") });

    private static final SubLSymbol $NOT_CACHED = makeKeyword("NOT-CACHED");

    public static final SubLObject $$forceElement_FromGIS = constant_handles.reader_make_constant_shell(makeString("forceElement-FromGIS"));

    public static final SubLObject $$tacticalPoint_FromGIS = constant_handles.reader_make_constant_shell(makeString("tacticalPoint-FromGIS"));

    public static final SubLObject $$tacticalLine_FromGIS = constant_handles.reader_make_constant_shell(makeString("tacticalLine-FromGIS"));

    public static final SubLObject $$tacticalArea_FromGIS = constant_handles.reader_make_constant_shell(makeString("tacticalArea-FromGIS"));

    public static final SubLObject $$spatialIntersectionOf = constant_handles.reader_make_constant_shell(makeString("spatialIntersectionOf"));

    public static final SubLObject $$lineOfSight_ObjectToRegion = constant_handles.reader_make_constant_shell(makeString("lineOfSight-ObjectToRegion"));

    public static final SubLObject $$locatedAtPoint_SurfGeog_FromGIS = constant_handles.reader_make_constant_shell(makeString("locatedAtPoint-SurfGeog-FromGIS"));

    private static final SubLSymbol $REMOVAL_FORCE_ELEMENT_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-FORCE-ELEMENT-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("forceElement-FromGIS")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("forceElement-FromGIS")), makeKeyword("VARIABLE")), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-FORCE-ELEMENT-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-FORCE-ELEMENT-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$forceElement-FromGIS ?UNIT) \n    access the SAIC XML gateway and return all the force elements in the GIS system"), makeKeyword("EXAMPLE"), makeString("(#$forceElement-FromGIS ?UNIT)") });



    public static final SubLObject $$ModernMilitaryUnit_Deployable = constant_handles.reader_make_constant_shell(makeString("ModernMilitaryUnit-Deployable"));

    private static final SubLSymbol $GIS = makeKeyword("GIS");



    static private final SubLString $str_alt21$_FORCEELEMENT_ = makeString("<FORCEELEMENT ");

    private static final SubLSymbol $INSIDE_ELEMENT = makeKeyword("INSIDE-ELEMENT");

    static private final SubLString $str_alt23$__FORCEELEMENT_ = makeString("</FORCEELEMENT>");

    private static final SubLSymbol $POINT = makeKeyword("POINT");

    static private final SubLString $str_alt25$_AIGISPOINT_ = makeString("<AIGISPOINT ");

    private static final SubLSymbol $INSIDE_POINT = makeKeyword("INSIDE-POINT");

    private static final SubLSymbol $REMOVAL_TACTICAL_POINT_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-TACTICAL-POINT-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("tacticalPoint-FromGIS")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("tacticalPoint-FromGIS")), makeKeyword("VARIABLE")), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-TACTICAL-POINT-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TACTICAL-POINT-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$tacticalPoint-FromGIS ?WHAT)\n    access the SAIC XML gateway and return all the tactical points in the GIS system"), makeKeyword("EXAMPLE"), makeString("(#$tacticalPoint-FromGIS ?POINT)") });

    public static final SubLObject $$TacticalPoint = constant_handles.reader_make_constant_shell(makeString("TacticalPoint"));

    static private final SubLString $str_alt30$_TACTICALPOINT_ = makeString("<TACTICALPOINT ");

    static private final SubLString $str_alt31$__ = makeString("/>");

    private static final SubLSymbol $NO_POINT_INFO = makeKeyword("NO-POINT-INFO");

    static private final SubLString $str_alt33$__TACTICALPOINT_ = makeString("</TACTICALPOINT>");

    static private final SubLString $str_alt34$_SIMPLEPOINT_ = makeString("<SIMPLEPOINT ");

    private static final SubLSymbol $REMOVAL_TACTICAL_LINE_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-TACTICAL-LINE-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("tacticalLine-FromGIS")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("tacticalLine-FromGIS")), makeKeyword("VARIABLE")), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-TACTICAL-LINE-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TACTICAL-LINE-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$tacticalLine-FromGIS ?SPATIAL-LINE) \n    access the SAIC XML gateway and return all the tactical lines in the GIS system"), makeKeyword("EXAMPLE"), makeString("(#$tacticalLine-FromGIS ?LINE)") });

    public static final SubLObject $$TacticalLine = constant_handles.reader_make_constant_shell(makeString("TacticalLine"));

    static private final SubLString $str_alt38$_TACTICALLINE_ = makeString("<TACTICALLINE ");

    static private final SubLString $str_alt39$__TACTICALLINE_ = makeString("</TACTICALLINE>");



    private static final SubLSymbol $STARTPOINT = makeKeyword("STARTPOINT");

    private static final SubLSymbol $ENDPOINT = makeKeyword("ENDPOINT");



    private static final SubLSymbol $INSIDE_FIRST_POINT = makeKeyword("INSIDE-FIRST-POINT");

    private static final SubLSymbol $INSIDE_SECOND_POINT = makeKeyword("INSIDE-SECOND-POINT");

    private static final SubLSymbol $REMOVAL_TACTICAL_AREA_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-TACTICAL-AREA-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("tacticalArea-FromGIS")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("tacticalArea-FromGIS")), makeKeyword("VARIABLE")), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-TACTICAL-AREA-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TACTICAL-AREA-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$tacticalArea-FromGIS ?SPATIAL-AREA)\n    access the SAIC XML gateway and return all the tactical areas in the GIS system"), makeKeyword("EXAMPLE"), makeString("(#$tacticalArea-FromGIS ?AREA)") });

    public static final SubLObject $$TacticalArea = constant_handles.reader_make_constant_shell(makeString("TacticalArea"));

    static private final SubLString $str_alt49$_TACTICALAREA_ = makeString("<TACTICALAREA ");

    static private final SubLString $str_alt50$__TACTICALAREA_ = makeString("</TACTICALAREA>");

    private static final SubLSymbol $TOTAL_AREA = makeKeyword("TOTAL-AREA");





    private static final SubLSymbol $REMOVAL_INTERSECTION_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-INTERSECTION-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt55 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("spatialIntersectionOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("spatialIntersectionOf")), makeKeyword("NOT-FULLY-BOUND"), list(constant_handles.reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-INTERSECTION-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTERSECTION-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$spatialIntersectionOf ?INTERSECTION (#$TheSet ?SPATIAL-ENTITY ?SPATIAL-AREA)) \n    access the SAIC XML gateway and determine the intersection of the entity to the area"), makeKeyword("EXAMPLE"), makeString("(#$spatialIntersectionOf ?INTERSECTION (#$TheSet ?SPATIAL-ENTITY ?SPATIAL-AREA)) ") });

    public static final SubLObject $$SpatialIntersectionFn = constant_handles.reader_make_constant_shell(makeString("SpatialIntersectionFn"));

    public static final SubLObject $$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));

    public static final SubLObject $$spatiallyIntersects = constant_handles.reader_make_constant_shell(makeString("spatiallyIntersects"));

    static private final SubLString $str_alt59$_AIGISAREA_ = makeString("<AIGISAREA ");

    private static final SubLSymbol $INSIDE_AREA = makeKeyword("INSIDE-AREA");

    static private final SubLString $str_alt61$__AIGISAREA_ = makeString("</AIGISAREA>");

    static private final SubLString $str_alt62$_AIGISPATH_ = makeString("<AIGISPATH ");

    private static final SubLSymbol $INSIDE_PATH = makeKeyword("INSIDE-PATH");

    static private final SubLString $str_alt64$__AIGISPATH_ = makeString("</AIGISPATH>");

    private static final SubLSymbol $START_POINT = makeKeyword("START-POINT");

    private static final SubLSymbol $END_POINT = makeKeyword("END-POINT");

    private static final SubLSymbol $REMOVAL_LOS_OBJECT_TO_REGION_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-LOS-OBJECT-TO-REGION-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt68 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("lineOfSight-ObjectToRegion")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("lineOfSight-ObjectToRegion")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-LOS-OBJECT-TO-REGION-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOS-OBJECT-TO-REGION-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$lineOfSight-ObjectToRegion ?OBJECT ?REGION)\n    access the SAIC XML gateway and determine the viewshed of ?OBJECT"), makeKeyword("EXAMPLE"), makeString("(#$lineOfSight-ObjectToRegion ?OBJECT ?REGION)") });

    static private final SubLString $str_alt69$_VIEWSHED_ = makeString("<VIEWSHED ");

    static private final SubLString $str_alt70$__VIEWSHED_ = makeString("</VIEWSHED>");

    private static final SubLSymbol $REMOVAL_LOCATED_AT_POINT_SURF_GEOG_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-LOCATED-AT-POINT-SURF-GEOG-SENTENCE-LOOKUP-POS");

    static private final SubLList $list_alt72 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("locatedAtPoint-SurfGeog-FromGIS")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("locatedAtPoint-SurfGeog-FromGIS")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED-MT"), constant_handles.reader_make_constant_shell(makeString("WorldGeographyDualistMt")), $COST, makeSymbol("REMOVAL-LOCATED-AT-POINT-SURF-GEOG-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATED-AT-POINT-SURF-GEOG-SENTENCE-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$locatedAtPoint-SurfGeog-FromGIS <spatial-thing> ?LOCATION)\n    access the SAIC XML gateway and determine the location of <spatial-thing>"), makeKeyword("EXAMPLE"), makeString("(#$locatedAtPoint-SurfGeog-FromGIS (#$InstanceNamedFn \"TacticalGraphicArea -*- 47\" #$TacticalArea) ?LOCATION)") });

    static private final SubLList $list_alt73 = list(makeSymbol("&KEY"), makeSymbol("X"), makeSymbol("Y"));

    static private final SubLList $list_alt74 = list(makeKeyword("X"), makeKeyword("Y"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $Y = makeKeyword("Y");

    static private final SubLString $str_alt78$id__ = makeString("id=\"");

    static private final SubLString $str_alt79$__ = makeString("\" ");

    static private final SubLString $str_alt80$x__ = makeString("x=\"");

    static private final SubLString $str_alt81$y__ = makeString("y=\"");

    static private final SubLString $str_alt82$__ = makeString("\"/");

    static private final SubLString $str_alt83$length__ = makeString("length=\"");

    static private final SubLString $str_alt84$__ = makeString("\">");

    static private final SubLString $str_alt85$totalarea__ = makeString("totalarea=\"");

    static private final SubLString $str_alt86$_AIGIS__REQUEST__CALCULATE__INTER = makeString("<AIGIS><REQUEST><CALCULATE><INTERSECTION><AIGISGEOMETRICRELATION><~A><AIGISOBJ id=\"~A\"/><AIGISOBJ id=\"~A\"/></~A></AIGISGEOMETRICRELATION></INTERSECTION></CALCULATE></REQUEST></AIGIS>");

    private static final SubLSymbol $POINT_TO_AREA = makeKeyword("POINT-TO-AREA");

    private static final SubLSymbol $PATH_TO_AREA = makeKeyword("PATH-TO-AREA");

    static private final SubLString $str_alt89$_AIGIS__REQUEST__CALCULATE__VIEWS = makeString("<AIGIS><REQUEST><CALCULATE><VIEWSHED><MAXIMUMRANGE value=\"10000\" \nunits=\"meters\"/><FEATUREHEIGHT value=\"0\" units=\"meters\"/><OBSERVERHEIGHT \nvalue=\"2\" units=\"meters\"/><AIGISOBJ id=\"~A\"/></VIEWSHED></CALCULATE></REQUEST></AIGIS>");

    static private final SubLString $str_alt90$ = makeString("");







    private static final SubLSymbol GIS_ITEM_P = makeSymbol("GIS-ITEM-P");

    public static final SubLObject $$InstanceNamedFn = constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn"));

    public static final SubLObject $$RKFYear3GIS = constant_handles.reader_make_constant_shell(makeString("RKFYear3GIS"));

    public static final SubLObject $$synonymousExternalConcept = constant_handles.reader_make_constant_shell(makeString("synonymousExternalConcept"));

    public static final SubLObject $$RKFYear3GISMt = constant_handles.reader_make_constant_shell(makeString("RKFYear3GISMt"));

    public static final SubLObject $$LatLongFn = constant_handles.reader_make_constant_shell(makeString("LatLongFn"));

    public static final SubLObject $$Degree_UnitOfAngularMeasure = constant_handles.reader_make_constant_shell(makeString("Degree-UnitOfAngularMeasure"));

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_gis_file();
    }

    public void initializeVariables() {
        init_removal_modules_gis_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_gis_file();
    }
}

