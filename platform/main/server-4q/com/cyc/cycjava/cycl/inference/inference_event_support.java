package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_event_support extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "04653ae6e0875b7e9880a81e3855c467bfaebd26ebb7123610852baecaff23f3";
    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 1400L)
    private static SubLSymbol $inference_event_property_classes$;
    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 1500L)
    private static SubLSymbol $inference_event_class_properties$;
    private static SubLList $list0;
    private static SubLList $list1;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $PARENT;
    private static SubLSymbol $DOCSTRING;
    private static SubLSymbol $HIERARCHY;
    private static SubLSymbol $GENERATED_BY;
    private static SubLSymbol $PROPERTIES;
    private static SubLSymbol $sym8$PROGN;
    private static SubLSymbol $sym9$DECLARE_EVENT_CLASS;
    private static SubLSymbol $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES;
    private static SubLSymbol $sym11$QUOTE;
    private static SubLSymbol $ALL;
    private static SubLSymbol $NONE;

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 900L)
    public static SubLObject declare_inference_event_class(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == conses_high.member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        }
        SubLObject parent_tail = cdestructuring_bind.property_list_member($PARENT, current);
        SubLObject parent = (NIL != parent_tail) ? conses_high.cadr(parent_tail) : NIL;
        SubLObject docstring_tail = cdestructuring_bind.property_list_member($DOCSTRING, current);
        SubLObject docstring = (NIL != docstring_tail) ? conses_high.cadr(docstring_tail) : NIL;
        SubLObject hierarchy_tail = cdestructuring_bind.property_list_member($HIERARCHY, current);
        SubLObject hierarchy = (NIL != hierarchy_tail) ? conses_high.cadr(hierarchy_tail) : NIL;
        SubLObject generated_by_tail = cdestructuring_bind.property_list_member($GENERATED_BY, current);
        SubLObject generated_by = (NIL != generated_by_tail) ? conses_high.cadr(generated_by_tail) : NIL;
        SubLObject properties_tail = cdestructuring_bind.property_list_member($PROPERTIES, current);
        SubLObject v_properties = (NIL != properties_tail) ? conses_high.cadr(properties_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return list($sym8$PROGN, listS($sym9$DECLARE_EVENT_CLASS, list(class_key, $PARENT, parent, $DOCSTRING, docstring, $HIERARCHY, hierarchy), append(body, NIL)), list($sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES, class_key, list($sym11$QUOTE, v_properties)));
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 1600L)
    public static SubLObject note_inference_event_class_properties(SubLObject v_class, SubLObject v_properties) {
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

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 1900L)
    public static SubLObject inference_event_class_has_propertyP(SubLObject v_class, SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 2000L)
    public static SubLObject get_inference_event_classes_with_property(SubLObject property) {
        if (property.eql($ALL)) {
            return all_inference_event_classes();
        }
        if (property.eql($NONE)) {
            return NIL;
        }
        return dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 2300L)
    public static SubLObject get_inference_event_classes_with_some_properties(SubLObject v_properties) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject applies = get_inference_event_classes_with_property(property);
            result = conses_high.union(result, applies, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 2600L)
    public static SubLObject get_inference_event_classes_with_all_properties(SubLObject v_properties) {
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject property = NIL;
        SubLObject counter = NIL;
        list_var = v_properties;
        property = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), property = list_var.first(), counter = Numbers.add(ONE_INTEGER, counter)) {
            SubLObject applies = get_inference_event_classes_with_property(property);
            if (counter.isZero()) {
                result = applies;
            } else {
                result = conses_high.intersection(result, applies, UNPROVIDED, UNPROVIDED);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 2900L)
    public static SubLObject valid_inference_event_class_p(SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 3100L)
    public static SubLObject valid_inference_event_property_p(SubLObject property) {
        return makeBoolean(property == $ALL || property == $NONE || NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 3300L)
    public static SubLObject all_inference_event_classes() {
        return dictionary.dictionary_keys($inference_event_class_properties$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/inference-event-support.lisp", position = 3400L)
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
        $inference_event_property_classes$ = deflexical("*INFERENCE-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        $inference_event_class_properties$ = deflexical("*INFERENCE-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
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
        me = new inference_event_support();
        $inference_event_property_classes$ = null;
        $inference_event_class_properties$ = null;
        $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY"), makeSymbol("GENERATED-BY"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"), makeKeyword("GENERATED-BY"), makeKeyword("PROPERTIES"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $PARENT = makeKeyword("PARENT");
        $DOCSTRING = makeKeyword("DOCSTRING");
        $HIERARCHY = makeKeyword("HIERARCHY");
        $GENERATED_BY = makeKeyword("GENERATED-BY");
        $PROPERTIES = makeKeyword("PROPERTIES");
        $sym8$PROGN = makeSymbol("PROGN");
        $sym9$DECLARE_EVENT_CLASS = makeSymbol("DECLARE-EVENT-CLASS");
        $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES = makeSymbol("NOTE-INFERENCE-EVENT-CLASS-PROPERTIES");
        $sym11$QUOTE = makeSymbol("QUOTE");
        $ALL = makeKeyword("ALL");
        $NONE = makeKeyword("NONE");
    }
}
/*
 *
 * Total time: 89 ms
 *
 */