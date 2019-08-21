package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.kb_modification_event_support;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.kb_modification_event_support.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_modification_event_support extends SubLTranslatedFile {
    public static final SubLFile me = new kb_modification_event_support();

    public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event_support";

    public static final String myFingerPrint = "13d200fd48262d1a1c8458d2888b1e7d6787257725bb919915bc18545cfcfd69";

    // deflexical
    private static final SubLSymbol $kb_modification_event_property_classes$ = makeSymbol("*KB-MODIFICATION-EVENT-PROPERTY-CLASSES*");

    // deflexical
    private static final SubLSymbol $kb_modification_event_class_properties$ = makeSymbol("*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cash_stable_description_retry_limit$ = makeSymbol("*CASH-STABLE-DESCRIPTION-RETRY-LIMIT*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("CLASS-KEY"), makeSymbol("&KEY"), makeSymbol("PARENT"), makeSymbol("DOCSTRING"), makeSymbol("HIERARCHY"), makeSymbol("GENERATED-BY"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("PARENT"), makeKeyword("DOCSTRING"), makeKeyword("HIERARCHY"), makeKeyword("GENERATED-BY"), makeKeyword("PROPERTIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");













    public static final SubLSymbol DECLARE_EVENT_CLASS = makeSymbol("DECLARE-EVENT-CLASS");

    public static final SubLSymbol NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES = makeSymbol("NOTE-KB-MODIFICATION-EVENT-CLASS-PROPERTIES");



    public static final SubLList $list12 = list(list(makeSymbol("CLASS"), makeSymbol("PROPERTIES")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list14 = list(makeSymbol("*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*"));





    public static final SubLString $str17$Could_not_properly_unpack_the_eve = makeString("Could not properly unpack the event description: ~A");

    public static SubLObject declare_kbmod_event_class(final SubLObject macroform, final SubLObject environment) {
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
        return list(PROGN, listS(DECLARE_EVENT_CLASS, list(class_key, $PARENT, parent, $DOCSTRING, docstring, $HIERARCHY, hierarchy), append(body, NIL)), list(NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES, class_key, list(QUOTE, v_properties)));
    }

    public static SubLObject do_all_event_class_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_class = NIL;
        SubLObject v_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        v_properties = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, listS(v_class, v_properties, $list14), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    public static SubLObject note_kb_modification_event_class_properties(final SubLObject v_class, final SubLObject v_properties) {
        if (NIL != v_properties) {
            dictionary.dictionary_enter($kb_modification_event_class_properties$.getGlobalValue(), v_class, v_properties);
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = NIL;
            property = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push($kb_modification_event_property_classes$.getGlobalValue(), property, v_class);
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            } 
        }
        return v_class;
    }

    public static SubLObject kb_modification_event_class_has_propertyP(final SubLObject v_class, final SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup($kb_modification_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_kb_modification_event_classes_with_property(final SubLObject property) {
        if (property.eql($ALL)) {
            return all_kb_modification_event_classes();
        }
        if (property.eql($NONE)) {
            return NIL;
        }
        return dictionary.dictionary_lookup($kb_modification_event_property_classes$.getGlobalValue(), property, UNPROVIDED);
    }

    public static SubLObject get_kb_modification_event_classes_with_some_properties(final SubLObject v_properties) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject applies = get_kb_modification_event_classes_with_property(property);
            result = union(result, applies, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_kb_modification_event_classes_with_all_properties(final SubLObject v_properties) {
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject property = NIL;
        SubLObject counter = NIL;
        list_var = v_properties;
        property = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , property = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            final SubLObject applies = get_kb_modification_event_classes_with_property(property);
            if (counter.isZero()) {
                result = applies;
            } else {
                result = intersection(result, applies, UNPROVIDED, UNPROVIDED);
            }
        }
        return result;
    }

    public static SubLObject valid_kb_modification_event_class_p(final SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($kb_modification_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED));
    }

    public static SubLObject valid_kb_modification_event_property_p(final SubLObject property) {
        return makeBoolean(((property == $ALL) || (property == $NONE)) || (NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup($kb_modification_event_property_classes$.getGlobalValue(), property, UNPROVIDED))));
    }

    public static SubLObject all_kb_modification_event_classes() {
        return dictionary.dictionary_keys($kb_modification_event_class_properties$.getGlobalValue());
    }

    public static SubLObject all_kb_modification_event_properties() {
        return dictionary.dictionary_keys($kb_modification_event_property_classes$.getGlobalValue());
    }

    public static SubLObject get_stable_description(final SubLObject v_object) {
        return cfasl_encode_externalized(v_object);
    }

    public static SubLObject cash_stable_description(final SubLObject description) {
        SubLObject interpretation = cfasl_decode(description);
        SubLObject counter = ZERO_INTEGER;
        while (NIL != list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_nart(), interpretation, UNPROVIDED, UNPROVIDED)) {
            counter = add(counter, ONE_INTEGER);
            if (counter.numG($cash_stable_description_retry_limit$.getGlobalValue())) {
                Errors.error($str17$Could_not_properly_unpack_the_eve, description);
            }
            sleep(ONE_INTEGER);
            interpretation = cfasl_decode(description);
        } 
        return interpretation;
    }

    public static SubLObject declare_kb_modification_event_support_file() {
        declareMacro(me, "declare_kbmod_event_class", "DECLARE-KBMOD-EVENT-CLASS");
        declareMacro(me, "do_all_event_class_properties", "DO-ALL-EVENT-CLASS-PROPERTIES");
        declareFunction(me, "note_kb_modification_event_class_properties", "NOTE-KB-MODIFICATION-EVENT-CLASS-PROPERTIES", 2, 0, false);
        declareFunction(me, "kb_modification_event_class_has_propertyP", "KB-MODIFICATION-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false);
        declareFunction(me, "get_kb_modification_event_classes_with_property", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false);
        declareFunction(me, "get_kb_modification_event_classes_with_some_properties", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false);
        declareFunction(me, "get_kb_modification_event_classes_with_all_properties", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false);
        declareFunction(me, "valid_kb_modification_event_class_p", "VALID-KB-MODIFICATION-EVENT-CLASS-P", 1, 0, false);
        declareFunction(me, "valid_kb_modification_event_property_p", "VALID-KB-MODIFICATION-EVENT-PROPERTY-P", 1, 0, false);
        declareFunction(me, "all_kb_modification_event_classes", "ALL-KB-MODIFICATION-EVENT-CLASSES", 0, 0, false);
        declareFunction(me, "all_kb_modification_event_properties", "ALL-KB-MODIFICATION-EVENT-PROPERTIES", 0, 0, false);
        declareFunction(me, "get_stable_description", "GET-STABLE-DESCRIPTION", 1, 0, false);
        declareFunction(me, "cash_stable_description", "CASH-STABLE-DESCRIPTION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_modification_event_support_file() {
        deflexical("*KB-MODIFICATION-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*CASH-STABLE-DESCRIPTION-RETRY-LIMIT*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_kb_modification_event_support_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_modification_event_support_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_modification_event_support_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_modification_event_support_file();
    }

    static {






















    }
}

/**
 * Total time: 139 ms
 */
