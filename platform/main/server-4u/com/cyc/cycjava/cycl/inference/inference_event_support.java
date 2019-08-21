/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-EVENT-SUPPORT
 * source file: /cyc/top/cycl/inference/inference-event-support.lisp
 * created:     2019/07/03 17:37:37
 */
public final class inference_event_support extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_event_support();

 public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event_support";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $inference_event_property_classes$ = makeSymbol("*INFERENCE-EVENT-PROPERTY-CLASSES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $inference_event_class_properties$ = makeSymbol("*INFERENCE-EVENT-CLASS-PROPERTIES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY"), makeSymbol("GENERATED-BY"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"), makeKeyword("GENERATED-BY"), makeKeyword("PROPERTIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DECLARE_EVENT_CLASS = makeSymbol("DECLARE-EVENT-CLASS");

    private static final SubLSymbol NOTE_INFERENCE_EVENT_CLASS_PROPERTIES = makeSymbol("NOTE-INFERENCE-EVENT-CLASS-PROPERTIES");

    // Definitions
    public static final SubLObject declare_inference_event_class_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject class_key = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    class_key = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject parent_tail = property_list_member($PARENT, current);
                            SubLObject parent = (NIL != parent_tail) ? ((SubLObject) (cadr(parent_tail))) : NIL;
                            SubLObject docstring_tail = property_list_member($DOCSTRING, current);
                            SubLObject docstring = (NIL != docstring_tail) ? ((SubLObject) (cadr(docstring_tail))) : NIL;
                            SubLObject hierarchy_tail = property_list_member($HIERARCHY, current);
                            SubLObject hierarchy = (NIL != hierarchy_tail) ? ((SubLObject) (cadr(hierarchy_tail))) : NIL;
                            SubLObject generated_by_tail = property_list_member($GENERATED_BY, current);
                            SubLObject generated_by = (NIL != generated_by_tail) ? ((SubLObject) (cadr(generated_by_tail))) : NIL;
                            SubLObject properties_tail = property_list_member($PROPERTIES, current);
                            SubLObject v_properties = (NIL != properties_tail) ? ((SubLObject) (cadr(properties_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PROGN, listS(DECLARE_EVENT_CLASS, list(class_key, $PARENT, parent, $DOCSTRING, docstring, $HIERARCHY, hierarchy), append(body, NIL)), list(NOTE_INFERENCE_EVENT_CLASS_PROPERTIES, class_key, list(QUOTE, v_properties)));
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
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

    public static final SubLObject note_inference_event_class_properties_alt(SubLObject v_class, SubLObject v_properties) {
        if (NIL != v_properties) {
            dictionary.dictionary_enter($inference_event_class_properties$.getGlobalValue(), v_class, v_properties);
            {
                SubLObject cdolist_list_var = v_properties;
                SubLObject property = NIL;
                for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_push($inference_event_property_classes$.getGlobalValue(), property, v_class);
                }
            }
        }
        return v_class;
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

    public static final SubLObject inference_event_class_has_propertyP_alt(SubLObject v_class, SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_event_class_has_propertyP(final SubLObject v_class, final SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_inference_event_classes_with_property_alt(SubLObject property) {
        {
            SubLObject pcase_var = property;
            if (pcase_var.eql($ALL)) {
                return com.cyc.cycjava.cycl.inference.inference_event_support.all_inference_event_classes();
            } else {
                if (pcase_var.eql($NONE)) {
                    return NIL;
                } else {
                    return dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED);
                }
            }
        }
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

    public static final SubLObject get_inference_event_classes_with_some_properties_alt(SubLObject v_properties) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = NIL;
            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                {
                    SubLObject applies = com.cyc.cycjava.cycl.inference.inference_event_support.get_inference_event_classes_with_property(property);
                    result = union(result, applies, UNPROVIDED, UNPROVIDED);
                }
            }
            return result;
        }
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

    public static final SubLObject get_inference_event_classes_with_all_properties_alt(SubLObject v_properties) {
        {
            SubLObject result = NIL;
            SubLObject list_var = NIL;
            SubLObject property = NIL;
            SubLObject counter = NIL;
            for (list_var = v_properties, property = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , property = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                {
                    SubLObject applies = com.cyc.cycjava.cycl.inference.inference_event_support.get_inference_event_classes_with_property(property);
                    if (counter.isZero()) {
                        result = applies;
                    } else {
                        result = intersection(result, applies, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return result;
        }
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

    public static final SubLObject valid_inference_event_class_p_alt(SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED));
    }

    public static SubLObject valid_inference_event_class_p(final SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED));
    }

    public static final SubLObject valid_inference_event_property_p_alt(SubLObject property) {
        return makeBoolean(((property == $ALL) || (property == $NONE)) || (NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED))));
    }

    public static SubLObject valid_inference_event_property_p(final SubLObject property) {
        return makeBoolean(((property == $ALL) || (property == $NONE)) || (NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED))));
    }

    public static final SubLObject all_inference_event_classes_alt() {
        return dictionary.dictionary_keys($inference_event_class_properties$.getGlobalValue());
    }

    public static SubLObject all_inference_event_classes() {
        return dictionary.dictionary_keys($inference_event_class_properties$.getGlobalValue());
    }

    public static final SubLObject all_inference_event_properties_alt() {
        return dictionary.dictionary_keys($inference_event_property_classes$.getGlobalValue());
    }

    public static SubLObject all_inference_event_properties() {
        return dictionary.dictionary_keys($inference_event_property_classes$.getGlobalValue());
    }

    public static SubLObject declare_inference_event_support_file() {
        declareMacro("declare_inference_event_class", "DECLARE-INFERENCE-EVENT-CLASS");
        declareFunction("note_inference_event_class_properties", "NOTE-INFERENCE-EVENT-CLASS-PROPERTIES", 2, 0, false);
        declareFunction("inference_event_class_has_propertyP", "INFERENCE-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false);
        declareFunction("get_inference_event_classes_with_property", "GET-INFERENCE-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false);
        declareFunction("get_inference_event_classes_with_some_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false);
        declareFunction("get_inference_event_classes_with_all_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false);
        declareFunction("valid_inference_event_class_p", "VALID-INFERENCE-EVENT-CLASS-P", 1, 0, false);
        declareFunction("valid_inference_event_property_p", "VALID-INFERENCE-EVENT-PROPERTY-P", 1, 0, false);
        declareFunction("all_inference_event_classes", "ALL-INFERENCE-EVENT-CLASSES", 0, 0, false);
        declareFunction("all_inference_event_properties", "ALL-INFERENCE-EVENT-PROPERTIES", 0, 0, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY"), makeSymbol("GENERATED-BY"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"), makeKeyword("GENERATED-BY"), makeKeyword("PROPERTIES"));
}

/**
 * Total time: 89 ms
 */
