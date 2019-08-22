package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class red_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new red_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.red_utilities";

    public static final String myFingerPrint = "6e1e2aafeccd7a124af8e98da861614af90f8b6dcc4f389efa86bdd3b9decb19";

    // deflexical
    public static final SubLSymbol $red_key_name_separator$ = makeSymbol("*RED-KEY-NAME-SEPARATOR*");

    // deflexical
    // The operating system specific part of the RED key hierarchy
    public static final SubLSymbol $red_root_key_os$ = makeSymbol("*RED-ROOT-KEY-OS*");

    // deflexical
    // The application specific part of the RED key hierarchy
    public static final SubLSymbol $red_root_key_application$ = makeSymbol("*RED-ROOT-KEY-APPLICATION*");

    // deflexical
    // The external specific part of the RED key hierarchy
    public static final SubLSymbol $red_root_key_external$ = makeSymbol("*RED-ROOT-KEY-EXTERNAL*");

    // deflexical
    // The license key part of the RED key hierarchy
    public static final SubLSymbol $red_root_key_license_keys$ = makeSymbol("*RED-ROOT-KEY-LICENSE-KEYS*");

    // deflexical
    private static final SubLSymbol $interpretable_red_element_value_key$ = makeSymbol("*INTERPRETABLE-RED-ELEMENT-VALUE-KEY*");

    // deflexical
    private static final SubLSymbol $interpretable_red_element_interpretation_key$ = makeSymbol("*INTERPRETABLE-RED-ELEMENT-INTERPRETATION-KEY*");

    // deflexical
    private static final SubLSymbol $red_element_interpret_as_literal$ = makeSymbol("*RED-ELEMENT-INTERPRET-AS-LITERAL*");

    // deflexical
    private static final SubLSymbol $red_element_interpret_as_symbol_value$ = makeSymbol("*RED-ELEMENT-INTERPRET-AS-SYMBOL-VALUE*");

    // Internal Constants
    public static final SubLString $str0$_ = makeString(".");

    public static final SubLString $$$os = makeString("os");

    public static final SubLString $$$application = makeString("application");

    public static final SubLString $$$external = makeString("external");

    public static final SubLString $str4$license_keys = makeString("license-keys");



    public static final SubLString $str6$master_license_key = makeString("master-license-key");

    public static final SubLSymbol RED_ELEMENT_STRUCT_P = makeSymbol("RED-ELEMENT-STRUCT-P");



    public static final SubLSymbol $sym9$STRING_ = makeSymbol("STRING<");

    public static final SubLSymbol RED_ELEMENT_GET_KEY = makeSymbol("RED-ELEMENT-GET-KEY");

    public static final SubLString $$$value = makeString("value");

    public static final SubLString $$$interpretation = makeString("interpretation");

    public static final SubLString $$$literal = makeString("literal");

    public static final SubLString $str14$symbol_value = makeString("symbol-value");

    public static final SubLString $$$CYC = makeString("CYC");



    public static final SubLList $list17 = list(CHAR_colon);

    public static SubLObject get_red_application_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_application$.getGlobalValue());
    }

    public static SubLObject get_red_external_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_external$.getGlobalValue());
    }

    public static SubLObject get_red_application_elements() {
        final SubLObject red_application_element = get_red_application_element();
        return NIL != red_application_element ? red_api.red_element_get_sub_elements(red_application_element) : NIL;
    }

    public static SubLObject get_red_root_element_for_application(final SubLObject application_name) {
        final SubLObject red_application_element = get_red_application_element();
        return NIL != red_application_element ? red_api.red_get_element_get_sub_element_by_key(red_application_element, application_name) : NIL;
    }

    public static SubLObject get_red_root_element_for_external(final SubLObject external_name) {
        final SubLObject red_external_element = get_red_external_element();
        return NIL != red_external_element ? red_api.red_get_element_get_sub_element_by_key(red_external_element, external_name) : NIL;
    }

    public static SubLObject get_red_os_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_os$.getGlobalValue());
    }

    public static SubLObject get_red_os_elements() {
        return red_api.red_element_get_sub_elements(get_red_os_element());
    }

    public static SubLObject get_red_master_license_key() {
        final SubLObject keys_element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_license_keys$.getGlobalValue());
        if (NIL != keys_element) {
            final SubLObject master_key_element = red_api.red_get_element_get_sub_element_by_key(keys_element, $str6$master_license_key);
            if (NIL != master_key_element) {
                return red_api.red_element_get_value(master_key_element);
            }
        }
        return NIL;
    }

    public static SubLObject red_get_element_get_sub_element_by_path(final SubLObject repository_element_struct, final SubLObject path) {
        assert NIL != red_api.red_element_struct_p(repository_element_struct) : "red_api.red_element_struct_p(repository_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(repository_element_struct) " + repository_element_struct;
        assert NIL != listp(path) : "Types.listp(path) " + "CommonSymbols.NIL != Types.listp(path) " + path;
        SubLObject sub_element = repository_element_struct;
        SubLObject cdolist_list_var = path;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sub_element = red_api.red_get_element_get_sub_element_by_key(sub_element, key);
            if (NIL == red_api.red_element_struct_p(sub_element)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return sub_element;
    }

    public static SubLObject interpret_red_element_subtree(final SubLObject root_element) {
        final SubLObject elements = red_api.red_element_get_sub_elements(root_element);
        SubLObject interpretation = NIL;
        SubLObject cdolist_list_var = Sort.sort(elements, $sym9$STRING_, RED_ELEMENT_GET_KEY);
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            interpretation = cons(interpret_red_element_subelements(element), interpretation);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return nreverse(interpretation);
    }

    public static SubLObject interpret_red_element_subelements(final SubLObject element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = red_api.red_element_get_value(red_api.red_get_element_get_sub_element_by_key(element, $interpretable_red_element_value_key$.getGlobalValue()));
        final SubLObject interpretation = red_api.red_element_get_value(red_api.red_get_element_get_sub_element_by_key(element, $interpretable_red_element_interpretation_key$.getGlobalValue()));
        if (NIL != Strings.string_equal($red_element_interpret_as_literal$.getGlobalValue(), interpretation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return value;
        }
        if (NIL != Strings.string_equal($red_element_interpret_as_symbol_value$.getGlobalValue(), interpretation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject v_package = interpret_red_element_value_as_symbol_reference(value, UNPROVIDED);
            final SubLObject symbol = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return symbol_value(find_symbol(symbol, find_package(v_package)));
        }
        return value;
    }

    public static SubLObject interpret_red_element_value_as_symbol_reference(final SubLObject reference, SubLObject default_package_name) {
        if (default_package_name == UNPROVIDED) {
            default_package_name = $$$CYC;
        }
        final SubLObject pieces = delete_if(symbol_function(EMPTY_STRING_P), string_utilities.split_string(reference, $list17), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.lengthE(pieces, TWO_INTEGER, UNPROVIDED)) {
            return values(pieces.first(), second(pieces));
        }
        return values(default_package_name, pieces.first());
    }

    public static SubLObject declare_red_utilities_file() {
        declareFunction(me, "get_red_application_element", "GET-RED-APPLICATION-ELEMENT", 0, 0, false);
        declareFunction(me, "get_red_external_element", "GET-RED-EXTERNAL-ELEMENT", 0, 0, false);
        declareFunction(me, "get_red_application_elements", "GET-RED-APPLICATION-ELEMENTS", 0, 0, false);
        declareFunction(me, "get_red_root_element_for_application", "GET-RED-ROOT-ELEMENT-FOR-APPLICATION", 1, 0, false);
        declareFunction(me, "get_red_root_element_for_external", "GET-RED-ROOT-ELEMENT-FOR-EXTERNAL", 1, 0, false);
        declareFunction(me, "get_red_os_element", "GET-RED-OS-ELEMENT", 0, 0, false);
        declareFunction(me, "get_red_os_elements", "GET-RED-OS-ELEMENTS", 0, 0, false);
        declareFunction(me, "get_red_master_license_key", "GET-RED-MASTER-LICENSE-KEY", 0, 0, false);
        declareFunction(me, "red_get_element_get_sub_element_by_path", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-PATH", 2, 0, false);
        declareFunction(me, "interpret_red_element_subtree", "INTERPRET-RED-ELEMENT-SUBTREE", 1, 0, false);
        declareFunction(me, "interpret_red_element_subelements", "INTERPRET-RED-ELEMENT-SUBELEMENTS", 1, 0, false);
        declareFunction(me, "interpret_red_element_value_as_symbol_reference", "INTERPRET-RED-ELEMENT-VALUE-AS-SYMBOL-REFERENCE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_red_utilities_file() {
        deflexical("*RED-KEY-NAME-SEPARATOR*", $str0$_);
        deflexical("*RED-ROOT-KEY-OS*", $$$os);
        deflexical("*RED-ROOT-KEY-APPLICATION*", $$$application);
        deflexical("*RED-ROOT-KEY-EXTERNAL*", $$$external);
        deflexical("*RED-ROOT-KEY-LICENSE-KEYS*", $str4$license_keys);
        deflexical("*INTERPRETABLE-RED-ELEMENT-VALUE-KEY*", $$$value);
        deflexical("*INTERPRETABLE-RED-ELEMENT-INTERPRETATION-KEY*", $$$interpretation);
        deflexical("*RED-ELEMENT-INTERPRET-AS-LITERAL*", $$$literal);
        deflexical("*RED-ELEMENT-INTERPRET-AS-SYMBOL-VALUE*", $str14$symbol_value);
        return NIL;
    }

    public static SubLObject setup_red_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_red_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_red_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_red_utilities_file();
    }

    
}

/**
 * Total time: 129 ms
 */
