package com.cyc.cycjava.cycl.inference;


import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.inference.inference_event_support;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.inference.inference_event_support.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_event_support extends SubLTranslatedFile {
    public static final SubLFile me = new inference_event_support();

    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event_support";

    public static final String myFingerPrint = "04653ae6e0875b7e9880a81e3855c467bfaebd26ebb7123610852baecaff23f3";

    // deflexical
    private static final SubLSymbol $inference_event_property_classes$ = makeSymbol("*INFERENCE-EVENT-PROPERTY-CLASSES*");

    // deflexical
    private static final SubLSymbol $inference_event_class_properties$ = makeSymbol("*INFERENCE-EVENT-CLASS-PROPERTIES*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY"), makeSymbol("GENERATED-BY"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"), makeKeyword("GENERATED-BY"), makeKeyword("PROPERTIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");













    public static final SubLSymbol DECLARE_EVENT_CLASS = makeSymbol("DECLARE-EVENT-CLASS");

    public static final SubLSymbol NOTE_INFERENCE_EVENT_CLASS_PROPERTIES = makeSymbol("NOTE-INFERENCE-EVENT-CLASS-PROPERTIES");







    public static SubLObject declare_inference_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject parent_tail = property_list_member($PARENT, current);
        final SubLObject parent = (NIL != parent_tail) ? cadr(parent_tail) : NIL;
        final SubLObject docstring_tail = property_list_member($DOCSTRING, current);
        final SubLObject docstring = (NIL != docstring_tail) ? cadr(docstring_tail) : NIL;
        final SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
        final SubLObject hierarchy = (NIL != hierarchy_tail) ? cadr(hierarchy_tail) : NIL;
        final SubLObject generated_by_tail = property_list_member($GENERATED_BY, current);
        final SubLObject generated_by = (NIL != generated_by_tail) ? cadr(generated_by_tail) : NIL;
        final SubLObject properties_tail = property_list_member($PROPERTIES, current);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, listS(DECLARE_EVENT_CLASS, list(class_key, $PARENT, parent, $DOCSTRING, docstring, $HIERARCHY, hierarchy), append(body, NIL)), list(NOTE_INFERENCE_EVENT_CLASS_PROPERTIES, class_key, list(QUOTE, v_properties)));
    }

    public static SubLObject note_inference_event_class_properties(final SubLObject v_class, final SubLObject v_properties) {
        if (NIL != v_properties) {
            dictionary.dictionary_enter($inference_event_class_properties$.getGlobalValue(), v_class, v_properties);
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = NIL;
            property = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push($inference_event_property_classes$.getGlobalValue(), property, v_class);
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            } 
        }
        return v_class;
    }

    public static SubLObject inference_event_class_has_propertyP(final SubLObject v_class, final SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_inference_event_classes_with_property(final SubLObject property) {
        if (property.eql($ALL)) {
            return all_inference_event_classes();
        }
        if (property.eql($NONE)) {
            return NIL;
        }
        return dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED);
    }

    public static SubLObject get_inference_event_classes_with_some_properties(final SubLObject v_properties) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject applies = get_inference_event_classes_with_property(property);
            result = union(result, applies, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_inference_event_classes_with_all_properties(final SubLObject v_properties) {
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject property = NIL;
        SubLObject counter = NIL;
        list_var = v_properties;
        property = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , property = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            final SubLObject applies = get_inference_event_classes_with_property(property);
            if (counter.isZero()) {
                result = applies;
            } else {
                result = intersection(result, applies, UNPROVIDED, UNPROVIDED);
            }
        }
        return result;
    }

    public static SubLObject valid_inference_event_class_p(final SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED));
    }

    public static SubLObject valid_inference_event_property_p(final SubLObject property) {
        return makeBoolean(((property == $ALL) || (property == $NONE)) || (NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED))));
    }

    public static SubLObject all_inference_event_classes() {
        return dictionary.dictionary_keys($inference_event_class_properties$.getGlobalValue());
    }

    public static SubLObject all_inference_event_properties() {
        return dictionary.dictionary_keys($inference_event_property_classes$.getGlobalValue());
    }

    public static SubLObject declare_inference_event_support_file() {
        declareMacro(me, "declare_inference_event_class", "DECLARE-INFERENCE-EVENT-CLASS");
        declareFunction(me, "note_inference_event_class_properties", "NOTE-INFERENCE-EVENT-CLASS-PROPERTIES", 2, 0, false);
        declareFunction(me, "inference_event_class_has_propertyP", "INFERENCE-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false);
        declareFunction(me, "get_inference_event_classes_with_property", "GET-INFERENCE-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false);
        declareFunction(me, "get_inference_event_classes_with_some_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false);
        declareFunction(me, "get_inference_event_classes_with_all_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false);
        declareFunction(me, "valid_inference_event_class_p", "VALID-INFERENCE-EVENT-CLASS-P", 1, 0, false);
        declareFunction(me, "valid_inference_event_property_p", "VALID-INFERENCE-EVENT-PROPERTY-P", 1, 0, false);
        declareFunction(me, "all_inference_event_classes", "ALL-INFERENCE-EVENT-CLASSES", 0, 0, false);
        declareFunction(me, "all_inference_event_properties", "ALL-INFERENCE-EVENT-PROPERTIES", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_event_support_file() {
        deflexical("*INFERENCE-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*INFERENCE-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_inference_event_support_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_event_support_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_event_support_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_event_support_file();
    }

    static {

















    }
}

/**
 * Total time: 89 ms
 */
