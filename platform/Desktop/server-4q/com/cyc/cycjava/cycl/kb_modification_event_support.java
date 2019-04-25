package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_modification_event_support extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event_support";
    public static final String myFingerPrint = "13d200fd48262d1a1c8458d2888b1e7d6787257725bb919915bc18545cfcfd69";
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1423L)
    private static SubLSymbol $kb_modification_event_property_classes$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1553L)
    private static SubLSymbol $kb_modification_event_class_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 7776L)
    private static SubLSymbol $cash_stable_description_retry_limit$;
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
    private static final SubLSymbol $sym10$NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES;
    private static final SubLSymbol $sym11$QUOTE;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$DO_DICTIONARY;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$ALL;
    private static final SubLSymbol $kw16$NONE;
    private static final SubLString $str17$Could_not_properly_unpack_the_eve;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 917L)
    public static SubLObject declare_kbmod_event_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_support.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_key = (SubLObject)kb_modification_event_support.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_support.$list0);
        class_key = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_modification_event_support.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_modification_event_support.NIL;
        SubLObject current_$1 = (SubLObject)kb_modification_event_support.NIL;
        while (kb_modification_event_support.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_modification_event_support.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_modification_event_support.$list0);
            if (kb_modification_event_support.NIL == conses_high.member(current_$1, (SubLObject)kb_modification_event_support.$list1, (SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED)) {
                bad = (SubLObject)kb_modification_event_support.T;
            }
            if (current_$1 == kb_modification_event_support.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_modification_event_support.NIL != bad && kb_modification_event_support.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_modification_event_support.$list0);
        }
        final SubLObject parent_tail = cdestructuring_bind.property_list_member((SubLObject)kb_modification_event_support.$kw3$PARENT, current);
        final SubLObject parent = (SubLObject)((kb_modification_event_support.NIL != parent_tail) ? conses_high.cadr(parent_tail) : kb_modification_event_support.NIL);
        final SubLObject docstring_tail = cdestructuring_bind.property_list_member((SubLObject)kb_modification_event_support.$kw4$DOCSTRING, current);
        final SubLObject docstring = (SubLObject)((kb_modification_event_support.NIL != docstring_tail) ? conses_high.cadr(docstring_tail) : kb_modification_event_support.NIL);
        final SubLObject hierarchy_tail = cdestructuring_bind.property_list_member((SubLObject)kb_modification_event_support.$kw5$HIERARCHY, current);
        final SubLObject hierarchy = (SubLObject)((kb_modification_event_support.NIL != hierarchy_tail) ? conses_high.cadr(hierarchy_tail) : kb_modification_event_support.NIL);
        final SubLObject generated_by_tail = cdestructuring_bind.property_list_member((SubLObject)kb_modification_event_support.$kw6$GENERATED_BY, current);
        final SubLObject generated_by = (SubLObject)((kb_modification_event_support.NIL != generated_by_tail) ? conses_high.cadr(generated_by_tail) : kb_modification_event_support.NIL);
        final SubLObject properties_tail = cdestructuring_bind.property_list_member((SubLObject)kb_modification_event_support.$kw7$PROPERTIES, current);
        final SubLObject v_properties = (SubLObject)((kb_modification_event_support.NIL != properties_tail) ? conses_high.cadr(properties_tail) : kb_modification_event_support.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_support.$sym8$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kb_modification_event_support.$sym9$DECLARE_EVENT_CLASS, (SubLObject)ConsesLow.list(class_key, (SubLObject)kb_modification_event_support.$kw3$PARENT, parent, (SubLObject)kb_modification_event_support.$kw4$DOCSTRING, docstring, (SubLObject)kb_modification_event_support.$kw5$HIERARCHY, hierarchy), ConsesLow.append(body, (SubLObject)kb_modification_event_support.NIL)), (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_support.$sym10$NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES, class_key, (SubLObject)ConsesLow.list((SubLObject)kb_modification_event_support.$sym11$QUOTE, v_properties)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1636L)
    public static SubLObject do_all_event_class_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_support.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_class = (SubLObject)kb_modification_event_support.NIL;
        SubLObject v_properties = (SubLObject)kb_modification_event_support.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_support.$list12);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_modification_event_support.$list12);
        v_properties = current.first();
        current = current.rest();
        if (kb_modification_event_support.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_modification_event_support.$sym13$DO_DICTIONARY, (SubLObject)ConsesLow.listS(v_class, v_properties, (SubLObject)kb_modification_event_support.$list14), ConsesLow.append(body, (SubLObject)kb_modification_event_support.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_modification_event_support.$list12);
        return (SubLObject)kb_modification_event_support.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1822L)
    public static SubLObject note_kb_modification_event_class_properties(final SubLObject v_class, final SubLObject v_properties) {
        if (kb_modification_event_support.NIL != v_properties) {
            dictionary.dictionary_enter(kb_modification_event_support.$kb_modification_event_class_properties$.getGlobalValue(), v_class, v_properties);
            SubLObject cdolist_list_var = v_properties;
            SubLObject property = (SubLObject)kb_modification_event_support.NIL;
            property = cdolist_list_var.first();
            while (kb_modification_event_support.NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push(kb_modification_event_support.$kb_modification_event_property_classes$.getGlobalValue(), property, v_class);
                cdolist_list_var = cdolist_list_var.rest();
                property = cdolist_list_var.first();
            }
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2138L)
    public static SubLObject kb_modification_event_class_has_propertyP(final SubLObject v_class, final SubLObject property) {
        return subl_promotions.memberP(property, dictionary.dictionary_lookup(kb_modification_event_support.$kb_modification_event_class_properties$.getGlobalValue(), v_class, (SubLObject)kb_modification_event_support.UNPROVIDED), (SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2313L)
    public static SubLObject get_kb_modification_event_classes_with_property(final SubLObject property) {
        if (property.eql((SubLObject)kb_modification_event_support.$kw15$ALL)) {
            return all_kb_modification_event_classes();
        }
        if (property.eql((SubLObject)kb_modification_event_support.$kw16$NONE)) {
            return (SubLObject)kb_modification_event_support.NIL;
        }
        return dictionary.dictionary_lookup(kb_modification_event_support.$kb_modification_event_property_classes$.getGlobalValue(), property, (SubLObject)kb_modification_event_support.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2596L)
    public static SubLObject get_kb_modification_event_classes_with_some_properties(final SubLObject v_properties) {
        SubLObject result = (SubLObject)kb_modification_event_support.NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = (SubLObject)kb_modification_event_support.NIL;
        property = cdolist_list_var.first();
        while (kb_modification_event_support.NIL != cdolist_list_var) {
            final SubLObject applies = get_kb_modification_event_classes_with_property(property);
            result = conses_high.union(result, applies, (SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2883L)
    public static SubLObject get_kb_modification_event_classes_with_all_properties(final SubLObject v_properties) {
        SubLObject result = (SubLObject)kb_modification_event_support.NIL;
        SubLObject list_var = (SubLObject)kb_modification_event_support.NIL;
        SubLObject property = (SubLObject)kb_modification_event_support.NIL;
        SubLObject counter = (SubLObject)kb_modification_event_support.NIL;
        list_var = v_properties;
        property = list_var.first();
        for (counter = (SubLObject)kb_modification_event_support.ZERO_INTEGER; kb_modification_event_support.NIL != list_var; list_var = list_var.rest(), property = list_var.first(), counter = Numbers.add((SubLObject)kb_modification_event_support.ONE_INTEGER, counter)) {
            final SubLObject applies = get_kb_modification_event_classes_with_property(property);
            if (counter.isZero()) {
                result = applies;
            }
            else {
                result = conses_high.intersection(result, applies, (SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3264L)
    public static SubLObject valid_kb_modification_event_class_p(final SubLObject v_class) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup(kb_modification_event_support.$kb_modification_event_class_properties$.getGlobalValue(), v_class, (SubLObject)kb_modification_event_support.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3413L)
    public static SubLObject valid_kb_modification_event_property_p(final SubLObject property) {
        return (SubLObject)SubLObjectFactory.makeBoolean(property == kb_modification_event_support.$kw15$ALL || property == kb_modification_event_support.$kw16$NONE || kb_modification_event_support.NIL != list_utilities.sublisp_boolean(dictionary.dictionary_lookup(kb_modification_event_support.$kb_modification_event_property_classes$.getGlobalValue(), property, (SubLObject)kb_modification_event_support.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3638L)
    public static SubLObject all_kb_modification_event_classes() {
        return dictionary.dictionary_keys(kb_modification_event_support.$kb_modification_event_class_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3759L)
    public static SubLObject all_kb_modification_event_properties() {
        return dictionary.dictionary_keys(kb_modification_event_support.$kb_modification_event_property_classes$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3883L)
    public static SubLObject get_stable_description(final SubLObject v_object) {
        return cfasl.cfasl_encode_externalized(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 7839L)
    public static SubLObject cash_stable_description(final SubLObject description) {
        SubLObject interpretation = cfasl.cfasl_decode(description);
        SubLObject counter = (SubLObject)kb_modification_event_support.ZERO_INTEGER;
        while (kb_modification_event_support.NIL != list_utilities.tree_find(cfasl_kb_methods.cfasl_invalid_nart(), interpretation, (SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED)) {
            counter = Numbers.add(counter, (SubLObject)kb_modification_event_support.ONE_INTEGER);
            if (counter.numG(kb_modification_event_support.$cash_stable_description_retry_limit$.getGlobalValue())) {
                Errors.error((SubLObject)kb_modification_event_support.$str17$Could_not_properly_unpack_the_eve, description);
            }
            Threads.sleep((SubLObject)kb_modification_event_support.ONE_INTEGER);
            interpretation = cfasl.cfasl_decode(description);
        }
        return interpretation;
    }
    
    public static SubLObject declare_kb_modification_event_support_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_modification_event_support", "declare_kbmod_event_class", "DECLARE-KBMOD-EVENT-CLASS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_modification_event_support", "do_all_event_class_properties", "DO-ALL-EVENT-CLASS-PROPERTIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "note_kb_modification_event_class_properties", "NOTE-KB-MODIFICATION-EVENT-CLASS-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "kb_modification_event_class_has_propertyP", "KB-MODIFICATION-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "get_kb_modification_event_classes_with_property", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "get_kb_modification_event_classes_with_some_properties", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "get_kb_modification_event_classes_with_all_properties", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "valid_kb_modification_event_class_p", "VALID-KB-MODIFICATION-EVENT-CLASS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "valid_kb_modification_event_property_p", "VALID-KB-MODIFICATION-EVENT-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "all_kb_modification_event_classes", "ALL-KB-MODIFICATION-EVENT-CLASSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "all_kb_modification_event_properties", "ALL-KB-MODIFICATION-EVENT-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "get_stable_description", "GET-STABLE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_modification_event_support", "cash_stable_description", "CASH-STABLE-DESCRIPTION", 1, 0, false);
        return (SubLObject)kb_modification_event_support.NIL;
    }
    
    public static SubLObject init_kb_modification_event_support_file() {
        kb_modification_event_support.$kb_modification_event_property_classes$ = SubLFiles.deflexical("*KB-MODIFICATION-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary((SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED));
        kb_modification_event_support.$kb_modification_event_class_properties$ = SubLFiles.deflexical("*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary((SubLObject)kb_modification_event_support.UNPROVIDED, (SubLObject)kb_modification_event_support.UNPROVIDED));
        kb_modification_event_support.$cash_stable_description_retry_limit$ = SubLFiles.deflexical("*CASH-STABLE-DESCRIPTION-RETRY-LIMIT*", (SubLObject)kb_modification_event_support.ONE_INTEGER);
        return (SubLObject)kb_modification_event_support.NIL;
    }
    
    public static SubLObject setup_kb_modification_event_support_file() {
        return (SubLObject)kb_modification_event_support.NIL;
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
        me = (SubLFile)new kb_modification_event_support();
        kb_modification_event_support.$kb_modification_event_property_classes$ = null;
        kb_modification_event_support.$kb_modification_event_class_properties$ = null;
        kb_modification_event_support.$cash_stable_description_retry_limit$ = null;
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
        $sym10$NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES = SubLObjectFactory.makeSymbol("NOTE-KB-MODIFICATION-EVENT-CLASS-PROPERTIES");
        $sym11$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*"));
        $kw15$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw16$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str17$Could_not_properly_unpack_the_eve = SubLObjectFactory.makeString("Could not properly unpack the event description: ~A");
    }
}

/*

	Total time: 139 ms
	
*/