package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.red_utilities";
    public static final String myFingerPrint = "6e1e2aafeccd7a124af8e98da861614af90f8b6dcc4f389efa86bdd3b9decb19";
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 853L)
    public static SubLSymbol $red_key_name_separator$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1033L)
    public static SubLSymbol $red_root_key_os$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1141L)
    public static SubLSymbol $red_root_key_application$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1262L)
    public static SubLSymbol $red_root_key_external$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1374L)
    public static SubLSymbol $red_root_key_license_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4482L)
    private static SubLSymbol $interpretable_red_element_value_key$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4551L)
    private static SubLSymbol $interpretable_red_element_interpretation_key$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4636L)
    private static SubLSymbol $red_element_interpret_as_literal$;
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4703L)
    private static SubLSymbol $red_element_interpret_as_symbol_value$;
    private static final SubLString $str0$_;
    private static final SubLString $str1$os;
    private static final SubLString $str2$application;
    private static final SubLString $str3$external;
    private static final SubLString $str4$license_keys;
    private static final SubLSymbol $kw5$LEAST_PRIVILEGED;
    private static final SubLString $str6$master_license_key;
    private static final SubLSymbol $sym7$RED_ELEMENT_STRUCT_P;
    private static final SubLSymbol $sym8$LISTP;
    private static final SubLSymbol $sym9$STRING_;
    private static final SubLSymbol $sym10$RED_ELEMENT_GET_KEY;
    private static final SubLString $str11$value;
    private static final SubLString $str12$interpretation;
    private static final SubLString $str13$literal;
    private static final SubLString $str14$symbol_value;
    private static final SubLString $str15$CYC;
    private static final SubLSymbol $sym16$EMPTY_STRING_P;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1488L)
    public static SubLObject get_red_application_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create((SubLObject)red_utilities.$kw5$LEAST_PRIVILEGED), red_utilities.$red_root_key_application$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1726L)
    public static SubLObject get_red_external_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create((SubLObject)red_utilities.$kw5$LEAST_PRIVILEGED), red_utilities.$red_root_key_external$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1900L)
    public static SubLObject get_red_application_elements() {
        final SubLObject red_application_element = get_red_application_element();
        return (SubLObject)((red_utilities.NIL != red_application_element) ? red_api.red_element_get_sub_elements(red_application_element) : red_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2113L)
    public static SubLObject get_red_root_element_for_application(final SubLObject application_name) {
        final SubLObject red_application_element = get_red_application_element();
        return (SubLObject)((red_utilities.NIL != red_application_element) ? red_api.red_get_element_get_sub_element_by_key(red_application_element, application_name) : red_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2378L)
    public static SubLObject get_red_root_element_for_external(final SubLObject external_name) {
        final SubLObject red_external_element = get_red_external_element();
        return (SubLObject)((red_utilities.NIL != red_external_element) ? red_api.red_get_element_get_sub_element_by_key(red_external_element, external_name) : red_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2622L)
    public static SubLObject get_red_os_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create((SubLObject)red_utilities.$kw5$LEAST_PRIVILEGED), red_utilities.$red_root_key_os$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2784L)
    public static SubLObject get_red_os_elements() {
        return red_api.red_element_get_sub_elements(get_red_os_element());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2884L)
    public static SubLObject get_red_master_license_key() {
        final SubLObject keys_element = red_api.red_get_element(red_api.red_repository_list_struct_create((SubLObject)red_utilities.$kw5$LEAST_PRIVILEGED), red_utilities.$red_root_key_license_keys$.getGlobalValue());
        if (red_utilities.NIL != keys_element) {
            final SubLObject master_key_element = red_api.red_get_element_get_sub_element_by_key(keys_element, (SubLObject)red_utilities.$str6$master_license_key);
            if (red_utilities.NIL != master_key_element) {
                return red_api.red_element_get_value(master_key_element);
            }
        }
        return (SubLObject)red_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 3303L)
    public static SubLObject red_get_element_get_sub_element_by_path(final SubLObject repository_element_struct, final SubLObject path) {
        assert red_utilities.NIL != red_api.red_element_struct_p(repository_element_struct) : repository_element_struct;
        assert red_utilities.NIL != Types.listp(path) : path;
        SubLObject sub_element = repository_element_struct;
        SubLObject cdolist_list_var = path;
        SubLObject key = (SubLObject)red_utilities.NIL;
        key = cdolist_list_var.first();
        while (red_utilities.NIL != cdolist_list_var) {
            sub_element = red_api.red_get_element_get_sub_element_by_key(sub_element, key);
            if (red_utilities.NIL == red_api.red_element_struct_p(sub_element)) {
                return (SubLObject)red_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return sub_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4083L)
    public static SubLObject interpret_red_element_subtree(final SubLObject root_element) {
        final SubLObject elements = red_api.red_element_get_sub_elements(root_element);
        SubLObject interpretation = (SubLObject)red_utilities.NIL;
        SubLObject cdolist_list_var = Sort.sort(elements, (SubLObject)red_utilities.$sym9$STRING_, (SubLObject)red_utilities.$sym10$RED_ELEMENT_GET_KEY);
        SubLObject element = (SubLObject)red_utilities.NIL;
        element = cdolist_list_var.first();
        while (red_utilities.NIL != cdolist_list_var) {
            interpretation = (SubLObject)ConsesLow.cons(interpret_red_element_subelements(element), interpretation);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return Sequences.nreverse(interpretation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4779L)
    public static SubLObject interpret_red_element_subelements(final SubLObject element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = red_api.red_element_get_value(red_api.red_get_element_get_sub_element_by_key(element, red_utilities.$interpretable_red_element_value_key$.getGlobalValue()));
        final SubLObject interpretation = red_api.red_element_get_value(red_api.red_get_element_get_sub_element_by_key(element, red_utilities.$interpretable_red_element_interpretation_key$.getGlobalValue()));
        if (red_utilities.NIL != Strings.string_equal(red_utilities.$red_element_interpret_as_literal$.getGlobalValue(), interpretation, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED)) {
            return value;
        }
        if (red_utilities.NIL != Strings.string_equal(red_utilities.$red_element_interpret_as_symbol_value$.getGlobalValue(), interpretation, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject v_package = interpret_red_element_value_as_symbol_reference(value, (SubLObject)red_utilities.UNPROVIDED);
            final SubLObject symbol = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Symbols.symbol_value(Packages.find_symbol(symbol, Packages.find_package(v_package)));
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 5579L)
    public static SubLObject interpret_red_element_value_as_symbol_reference(final SubLObject reference, SubLObject default_package_name) {
        if (default_package_name == red_utilities.UNPROVIDED) {
            default_package_name = (SubLObject)red_utilities.$str15$CYC;
        }
        final SubLObject pieces = Sequences.delete_if(Symbols.symbol_function((SubLObject)red_utilities.$sym16$EMPTY_STRING_P), string_utilities.split_string(reference, (SubLObject)red_utilities.$list17), (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED, (SubLObject)red_utilities.UNPROVIDED);
        if (red_utilities.NIL != list_utilities.lengthE(pieces, (SubLObject)red_utilities.TWO_INTEGER, (SubLObject)red_utilities.UNPROVIDED)) {
            return Values.values(pieces.first(), conses_high.second(pieces));
        }
        return Values.values(default_package_name, pieces.first());
    }
    
    public static SubLObject declare_red_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_application_element", "GET-RED-APPLICATION-ELEMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_external_element", "GET-RED-EXTERNAL-ELEMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_application_elements", "GET-RED-APPLICATION-ELEMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_root_element_for_application", "GET-RED-ROOT-ELEMENT-FOR-APPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_root_element_for_external", "GET-RED-ROOT-ELEMENT-FOR-EXTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_os_element", "GET-RED-OS-ELEMENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_os_elements", "GET-RED-OS-ELEMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "get_red_master_license_key", "GET-RED-MASTER-LICENSE-KEY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "red_get_element_get_sub_element_by_path", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "interpret_red_element_subtree", "INTERPRET-RED-ELEMENT-SUBTREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "interpret_red_element_subelements", "INTERPRET-RED-ELEMENT-SUBELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_utilities", "interpret_red_element_value_as_symbol_reference", "INTERPRET-RED-ELEMENT-VALUE-AS-SYMBOL-REFERENCE", 1, 1, false);
        return (SubLObject)red_utilities.NIL;
    }
    
    public static SubLObject init_red_utilities_file() {
        red_utilities.$red_key_name_separator$ = SubLFiles.deflexical("*RED-KEY-NAME-SEPARATOR*", (SubLObject)red_utilities.$str0$_);
        red_utilities.$red_root_key_os$ = SubLFiles.deflexical("*RED-ROOT-KEY-OS*", (SubLObject)red_utilities.$str1$os);
        red_utilities.$red_root_key_application$ = SubLFiles.deflexical("*RED-ROOT-KEY-APPLICATION*", (SubLObject)red_utilities.$str2$application);
        red_utilities.$red_root_key_external$ = SubLFiles.deflexical("*RED-ROOT-KEY-EXTERNAL*", (SubLObject)red_utilities.$str3$external);
        red_utilities.$red_root_key_license_keys$ = SubLFiles.deflexical("*RED-ROOT-KEY-LICENSE-KEYS*", (SubLObject)red_utilities.$str4$license_keys);
        red_utilities.$interpretable_red_element_value_key$ = SubLFiles.deflexical("*INTERPRETABLE-RED-ELEMENT-VALUE-KEY*", (SubLObject)red_utilities.$str11$value);
        red_utilities.$interpretable_red_element_interpretation_key$ = SubLFiles.deflexical("*INTERPRETABLE-RED-ELEMENT-INTERPRETATION-KEY*", (SubLObject)red_utilities.$str12$interpretation);
        red_utilities.$red_element_interpret_as_literal$ = SubLFiles.deflexical("*RED-ELEMENT-INTERPRET-AS-LITERAL*", (SubLObject)red_utilities.$str13$literal);
        red_utilities.$red_element_interpret_as_symbol_value$ = SubLFiles.deflexical("*RED-ELEMENT-INTERPRET-AS-SYMBOL-VALUE*", (SubLObject)red_utilities.$str14$symbol_value);
        return (SubLObject)red_utilities.NIL;
    }
    
    public static SubLObject setup_red_utilities_file() {
        return (SubLObject)red_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_red_utilities_file();
    }
    
    public void initializeVariables() {
        init_red_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_red_utilities_file();
    }
    
    static {
        me = (SubLFile)new red_utilities();
        red_utilities.$red_key_name_separator$ = null;
        red_utilities.$red_root_key_os$ = null;
        red_utilities.$red_root_key_application$ = null;
        red_utilities.$red_root_key_external$ = null;
        red_utilities.$red_root_key_license_keys$ = null;
        red_utilities.$interpretable_red_element_value_key$ = null;
        red_utilities.$interpretable_red_element_interpretation_key$ = null;
        red_utilities.$red_element_interpret_as_literal$ = null;
        red_utilities.$red_element_interpret_as_symbol_value$ = null;
        $str0$_ = SubLObjectFactory.makeString(".");
        $str1$os = SubLObjectFactory.makeString("os");
        $str2$application = SubLObjectFactory.makeString("application");
        $str3$external = SubLObjectFactory.makeString("external");
        $str4$license_keys = SubLObjectFactory.makeString("license-keys");
        $kw5$LEAST_PRIVILEGED = SubLObjectFactory.makeKeyword("LEAST-PRIVILEGED");
        $str6$master_license_key = SubLObjectFactory.makeString("master-license-key");
        $sym7$RED_ELEMENT_STRUCT_P = SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-P");
        $sym8$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym9$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym10$RED_ELEMENT_GET_KEY = SubLObjectFactory.makeSymbol("RED-ELEMENT-GET-KEY");
        $str11$value = SubLObjectFactory.makeString("value");
        $str12$interpretation = SubLObjectFactory.makeString("interpretation");
        $str13$literal = SubLObjectFactory.makeString("literal");
        $str14$symbol_value = SubLObjectFactory.makeString("symbol-value");
        $str15$CYC = SubLObjectFactory.makeString("CYC");
        $sym16$EMPTY_STRING_P = SubLObjectFactory.makeSymbol("EMPTY-STRING-P");
        $list17 = ConsesLow.list((SubLObject)Characters.CHAR_colon);
    }
}

/*

	Total time: 129 ms
	
*/