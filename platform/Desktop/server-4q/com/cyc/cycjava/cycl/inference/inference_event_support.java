package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_event_support extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event_support";
    public static final String myFingerPrint = "04653ae6e0875b7e9880a81e3855c467bfaebd26ebb7123610852baecaff23f3";
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1411L)
    private static SubLSymbol $inference_event_property_classes$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1535L)
    private static SubLSymbol $inference_event_class_properties$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$PARENT;
    private static final SubLSymbol $kw4$DOCSTRING;
    private static final SubLSymbol $kw5$HIERARCHY;
    private static final SubLSymbol $kw6$GENERATED_BY;
    private static final SubLSymbol $kw7$PROPERTIES;
    private static final SubLSymbol $sym8$PROGN;
    private static final SubLSymbol $sym9$DECLARE_EVENT_CLASS;
    private static final SubLSymbol $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES;
    private static final SubLSymbol $sym11$QUOTE;
    private static final SubLSymbol $kw12$ALL;
    private static final SubLSymbol $kw13$NONE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 907L)
    public static SubLObject declare_inference_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_event_support.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = (SubLObject)inference_event_support.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_event_support.$list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_event_support.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_event_support.NIL;
        SubLObject current_$1 = (SubLObject)inference_event_support.NIL;
        while (inference_event_support.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_event_support.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_event_support.$list0);
            if (inference_event_support.NIL == conses_high.member(current_$1, (SubLObject)inference_event_support.$list1, (SubLObject)inference_event_support.UNPROVIDED, (SubLObject)inference_event_support.UNPROVIDED)) {
                bad = (SubLObject)inference_event_support.T;
            }
            if (current_$1 == inference_event_support.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_event_support.NIL != bad && inference_event_support.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_event_support.$list0);
        }
        final SubLObject parent_tail = cdestructuring_bind.property_list_member((SubLObject)inference_event_support.$kw3$PARENT, current);
        final SubLObject parent = (SubLObject)((inference_event_support.NIL != parent_tail) ? conses_high.cadr(parent_tail) : inference_event_support.NIL);
        final SubLObject docstring_tail = cdestructuring_bind.property_list_member((SubLObject)inference_event_support.$kw4$DOCSTRING, current);
        final SubLObject docstring = (SubLObject)((inference_event_support.NIL != docstring_tail) ? conses_high.cadr(docstring_tail) : inference_event_support.NIL);
        final SubLObject hierarchy_tail = cdestructuring_bind.property_list_member((SubLObject)inference_event_support.$kw5$HIERARCHY, current);
        final SubLObject hierarchy = (SubLObject)((inference_event_support.NIL != hierarchy_tail) ? conses_high.cadr(hierarchy_tail) : inference_event_support.NIL);
        final SubLObject generated_by_tail = cdestructuring_bind.property_list_member((SubLObject)inference_event_support.$kw6$GENERATED_BY, current);
        final SubLObject generated_by = (SubLObject)((inference_event_support.NIL != generated_by_tail) ? conses_high.cadr(generated_by_tail) : inference_event_support.NIL);
        final SubLObject properties_tail = cdestructuring_bind.property_list_member((SubLObject)inference_event_support.$kw7$PROPERTIES, current);
        final SubLObject v_properties = (SubLObject)((inference_event_support.NIL != properties_tail) ? conses_high.cadr(properties_tail) : inference_event_support.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_event_support.$sym8$PROGN, (SubLObject)ConsesLow.listS((SubLObject)inference_event_support.$sym9$DECLARE_EVENT_CLASS, (SubLObject)ConsesLow.list(class_key, (SubLObject)inference_event_support.$kw3$PARENT, parent, (SubLObject)inference_event_support.$kw4$DOCSTRING, docstring, (SubLObject)inference_event_support.$kw5$HIERARCHY, hierarchy), ConsesLow.append(body, (SubLObject)inference_event_support.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_event_support.$sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES, class_key, (SubLObject)ConsesLow.list((SubLObject)inference_event_support.$sym11$QUOTE, v_properties)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1612L)
    public static SubLObject note_inference_event_class_properties(final SubLObject v_class, final SubLObject v_properties) {
        if (inference_event_support.NIL != v_properties) {
            dictionary.dictionary_enter(inference_event_support.$inference_event_class_properties$.getGlobalValue(), v_class, v_properties);
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = (SubLObject)inference_event_support.NIL;
            property = cdolist_list_var.first();
            while (inference_event_support.NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push(inference_event_support.$inference_event_property_classes$.getGlobalValue(), property, v_class);
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            }
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1910L)
    public static SubLObject inference_event_class_has_propertyP(final SubLObject v_class, final SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup(inference_event_support.$inference_event_class_properties$.getGlobalValue(), v_class, (SubLObject)inference_event_support.UNPROVIDED), (SubLObject)inference_event_support.UNPROVIDED, (SubLObject)inference_event_support.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2073L)
    public static SubLObject get_inference_event_classes_with_property(final SubLObject property) {
        if (property.eql((SubLObject)inference_event_support.$kw12$ALL)) {
            return all_inference_event_classes();
        }
        if (property.eql((SubLObject)inference_event_support.$kw13$NONE)) {
            return (SubLObject)inference_event_support.NIL;
        }
        return dictionary.dictionary_lookup(inference_event_support.$inference_event_property_classes$.getGlobalValue(), property, (SubLObject)inference_event_support.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2338L)
    public static SubLObject get_inference_event_classes_with_some_properties(final SubLObject v_properties) {
        SubLObject result = (SubLObject)inference_event_support.NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = (SubLObject)inference_event_support.NIL;
        property = cdolist_list_var.first();
        while (inference_event_support.NIL != cdolist_list_var) {
            final SubLObject applies = get_inference_event_classes_with_property(property);
            result = conses_high.union(result, applies, (SubLObject)inference_event_support.UNPROVIDED, (SubLObject)inference_event_support.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2613L)
    public static SubLObject get_inference_event_classes_with_all_properties(final SubLObject v_properties) {
        SubLObject result = (SubLObject)inference_event_support.NIL;
        SubLObject list_var = (SubLObject)inference_event_support.NIL;
        SubLObject property = (SubLObject)inference_event_support.NIL;
        SubLObject counter = (SubLObject)inference_event_support.NIL;
        list_var = v_properties;
        property = list_var.first();
        for (counter = (SubLObject)inference_event_support.ZERO_INTEGER; inference_event_support.NIL != list_var; list_var = list_var.rest(), property = list_var.first(), counter = Numbers.add((SubLObject)inference_event_support.ONE_INTEGER, counter)) {
            final SubLObject applies = get_inference_event_classes_with_property(property);
            if (counter.isZero()) {
                result = applies;
            }
            else {
                result = conses_high.intersection(result, applies, (SubLObject)inference_event_support.UNPROVIDED, (SubLObject)inference_event_support.UNPROVIDED);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2982L)
    public static SubLObject valid_inference_event_class_p(final SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup(inference_event_support.$inference_event_class_properties$.getGlobalValue(), v_class, (SubLObject)inference_event_support.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 3119L)
    public static SubLObject valid_inference_event_property_p(final SubLObject property) {
        return (SubLObject)SubLObjectFactory.makeBoolean(property == inference_event_support.$kw12$ALL || property == inference_event_support.$kw13$NONE || inference_event_support.NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup(inference_event_support.$inference_event_property_classes$.getGlobalValue(), property, (SubLObject)inference_event_support.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 3332L)
    public static SubLObject all_inference_event_classes() {
        return dictionary.dictionary_keys(inference_event_support.$inference_event_class_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 3441L)
    public static SubLObject all_inference_event_properties() {
        return dictionary.dictionary_keys(inference_event_support.$inference_event_property_classes$.getGlobalValue());
    }
    
    public static SubLObject declare_inference_event_support_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.inference_event_support", "declare_inference_event_class", "DECLARE-INFERENCE-EVENT-CLASS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "note_inference_event_class_properties", "NOTE-INFERENCE-EVENT-CLASS-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "inference_event_class_has_propertyP", "INFERENCE-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "get_inference_event_classes_with_property", "GET-INFERENCE-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "get_inference_event_classes_with_some_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "get_inference_event_classes_with_all_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "valid_inference_event_class_p", "VALID-INFERENCE-EVENT-CLASS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "valid_inference_event_property_p", "VALID-INFERENCE-EVENT-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "all_inference_event_classes", "ALL-INFERENCE-EVENT-CLASSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event_support", "all_inference_event_properties", "ALL-INFERENCE-EVENT-PROPERTIES", 0, 0, false);
        return (SubLObject)inference_event_support.NIL;
    }
    
    public static SubLObject init_inference_event_support_file() {
        inference_event_support.$inference_event_property_classes$ = SubLFiles.deflexical("*INFERENCE-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary((SubLObject)inference_event_support.UNPROVIDED, (SubLObject)inference_event_support.UNPROVIDED));
        inference_event_support.$inference_event_class_properties$ = SubLFiles.deflexical("*INFERENCE-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary((SubLObject)inference_event_support.UNPROVIDED, (SubLObject)inference_event_support.UNPROVIDED));
        return (SubLObject)inference_event_support.NIL;
    }
    
    public static SubLObject setup_inference_event_support_file() {
        return (SubLObject)inference_event_support.NIL;
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
        me = (SubLFile)new inference_event_support();
        inference_event_support.$inference_event_property_classes$ = null;
        inference_event_support.$inference_event_class_properties$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("DOCSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("HIERARCHY"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATED-BY"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("DOCSTRING"), (SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY"), (SubLObject)SubLObjectFactory.makeKeyword("GENERATED-BY"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw4$DOCSTRING = SubLObjectFactory.makeKeyword("DOCSTRING");
        $kw5$HIERARCHY = SubLObjectFactory.makeKeyword("HIERARCHY");
        $kw6$GENERATED_BY = SubLObjectFactory.makeKeyword("GENERATED-BY");
        $kw7$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $sym8$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym9$DECLARE_EVENT_CLASS = SubLObjectFactory.makeSymbol("DECLARE-EVENT-CLASS");
        $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES = SubLObjectFactory.makeSymbol("NOTE-INFERENCE-EVENT-CLASS-PROPERTIES");
        $sym11$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw12$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw13$NONE = SubLObjectFactory.makeKeyword("NONE");
    }
}

/*

	Total time: 89 ms
	
*/