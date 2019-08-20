/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RED-UTILITIES
 * source file: /cyc/top/cycl/red-utilities.lisp
 * created:     2019/07/03 17:37:15
 */
public final class red_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new red_utilities();



    // deflexical
    @LispMethod(comment = "The separator to be used to keep apart RED keys\ndeflexical")
    // Definitions
    /**
     * The separator to be used to keep apart RED keys
     */
    public static final SubLSymbol $red_key_name_separator$ = makeSymbol("*RED-KEY-NAME-SEPARATOR*");

    // deflexical
    // The operating system specific part of the RED key hierarchy
    /**
     * The operating system specific part of the RED key hierarchy
     */
    @LispMethod(comment = "The operating system specific part of the RED key hierarchy\ndeflexical")
    public static final SubLSymbol $red_root_key_os$ = makeSymbol("*RED-ROOT-KEY-OS*");

    // deflexical
    // The application specific part of the RED key hierarchy
    /**
     * The application specific part of the RED key hierarchy
     */
    @LispMethod(comment = "The application specific part of the RED key hierarchy\ndeflexical")
    public static final SubLSymbol $red_root_key_application$ = makeSymbol("*RED-ROOT-KEY-APPLICATION*");

    // deflexical
    // The external specific part of the RED key hierarchy
    /**
     * The external specific part of the RED key hierarchy
     */
    @LispMethod(comment = "The external specific part of the RED key hierarchy\ndeflexical")
    public static final SubLSymbol $red_root_key_external$ = makeSymbol("*RED-ROOT-KEY-EXTERNAL*");

    // deflexical
    // The license key part of the RED key hierarchy
    /**
     * The license key part of the RED key hierarchy
     */
    @LispMethod(comment = "The license key part of the RED key hierarchy\ndeflexical")
    public static final SubLSymbol $red_root_key_license_keys$ = makeSymbol("*RED-ROOT-KEY-LICENSE-KEYS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $interpretable_red_element_value_key$ = makeSymbol("*INTERPRETABLE-RED-ELEMENT-VALUE-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $interpretable_red_element_interpretation_key$ = makeSymbol("*INTERPRETABLE-RED-ELEMENT-INTERPRETATION-KEY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $red_element_interpret_as_literal$ = makeSymbol("*RED-ELEMENT-INTERPRET-AS-LITERAL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $red_element_interpret_as_symbol_value$ = makeSymbol("*RED-ELEMENT-INTERPRET-AS-SYMBOL-VALUE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_ = makeString(".");

    static private final SubLString $$$os = makeString("os");

    static private final SubLString $$$application = makeString("application");

    static private final SubLString $$$external = makeString("external");

    static private final SubLString $str4$license_keys = makeString("license-keys");

    static private final SubLString $str6$master_license_key = makeString("master-license-key");

    private static final SubLSymbol RED_ELEMENT_STRUCT_P = makeSymbol("RED-ELEMENT-STRUCT-P");

    static private final SubLSymbol $sym9$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol RED_ELEMENT_GET_KEY = makeSymbol("RED-ELEMENT-GET-KEY");

    static private final SubLString $$$value = makeString("value");

    static private final SubLString $$$interpretation = makeString("interpretation");

    static private final SubLString $$$literal = makeString("literal");

    static private final SubLString $str14$symbol_value = makeString("symbol-value");

    static private final SubLString $$$CYC = makeString("CYC");

    static private final SubLList $list17 = list(CHAR_colon);

    public static final SubLObject get_red_application_element_alt() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_application$.getGlobalValue());
    }

    public static SubLObject get_red_application_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_application$.getGlobalValue());
    }

    public static final SubLObject get_red_external_element_alt() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_external$.getGlobalValue());
    }

    public static SubLObject get_red_external_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_external$.getGlobalValue());
    }

    public static final SubLObject get_red_application_elements_alt() {
        {
            SubLObject red_application_element = com.cyc.cycjava.cycl.red_utilities.get_red_application_element();
            return NIL != red_application_element ? ((SubLObject) (red_api.red_element_get_sub_elements(red_application_element))) : NIL;
        }
    }

    public static SubLObject get_red_application_elements() {
        final SubLObject red_application_element = get_red_application_element();
        return NIL != red_application_element ? red_api.red_element_get_sub_elements(red_application_element) : NIL;
    }

    public static final SubLObject get_red_root_element_for_application_alt(SubLObject application_name) {
        {
            SubLObject red_application_element = com.cyc.cycjava.cycl.red_utilities.get_red_application_element();
            return NIL != red_application_element ? ((SubLObject) (red_api.red_get_element_get_sub_element_by_key(red_application_element, application_name))) : NIL;
        }
    }

    public static SubLObject get_red_root_element_for_application(final SubLObject application_name) {
        final SubLObject red_application_element = get_red_application_element();
        return NIL != red_application_element ? red_api.red_get_element_get_sub_element_by_key(red_application_element, application_name) : NIL;
    }

    public static final SubLObject get_red_root_element_for_external_alt(SubLObject external_name) {
        {
            SubLObject red_external_element = com.cyc.cycjava.cycl.red_utilities.get_red_external_element();
            return NIL != red_external_element ? ((SubLObject) (red_api.red_get_element_get_sub_element_by_key(red_external_element, external_name))) : NIL;
        }
    }

    public static SubLObject get_red_root_element_for_external(final SubLObject external_name) {
        final SubLObject red_external_element = get_red_external_element();
        return NIL != red_external_element ? red_api.red_get_element_get_sub_element_by_key(red_external_element, external_name) : NIL;
    }

    public static final SubLObject get_red_os_element_alt() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_os$.getGlobalValue());
    }

    public static SubLObject get_red_os_element() {
        return red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_os$.getGlobalValue());
    }

    public static final SubLObject get_red_os_elements_alt() {
        return red_api.red_element_get_sub_elements(com.cyc.cycjava.cycl.red_utilities.get_red_os_element());
    }

    public static SubLObject get_red_os_elements() {
        return red_api.red_element_get_sub_elements(get_red_os_element());
    }

    /**
     *
     *
     * @unknown goolsbey
     */
    @LispMethod(comment = "@unknown goolsbey")
    public static final SubLObject get_red_master_license_key_alt() {
        {
            SubLObject keys_element = red_api.red_get_element(red_api.red_repository_list_struct_create($LEAST_PRIVILEGED), $red_root_key_license_keys$.getGlobalValue());
            if (NIL != keys_element) {
                {
                    SubLObject master_key_element = red_api.red_get_element_get_sub_element_by_key(keys_element, $str_alt6$master_license_key);
                    if (NIL != master_key_element) {
                        return red_api.red_element_get_value(master_key_element);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown goolsbey
     */
    @LispMethod(comment = "@unknown goolsbey")
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

    /**
     * Get the repository-element struct at the end of PATH within the given repository-element struct
     *
     * @param repository-element-struct;
     * 		the red-repository-element-struct in which we are to search
     * @param path;
     * 		a list of key string
     * @return red-element-struct; the struct at the end of PATH within REPOSITORY-ELEMENT-STRUCT if it exists,
    nil otherwise
     */
    @LispMethod(comment = "Get the repository-element struct at the end of PATH within the given repository-element struct\r\n\r\n@param repository-element-struct;\r\n\t\tthe red-repository-element-struct in which we are to search\r\n@param path;\r\n\t\ta list of key string\r\n@return red-element-struct; the struct at the end of PATH within REPOSITORY-ELEMENT-STRUCT if it exists,\r\nnil otherwise")
    public static final SubLObject red_get_element_get_sub_element_by_path_alt(SubLObject repository_element_struct, SubLObject path) {
        SubLTrampolineFile.checkType(repository_element_struct, RED_ELEMENT_STRUCT_P);
        SubLTrampolineFile.checkType(path, LISTP);
        {
            SubLObject sub_element = repository_element_struct;
            SubLObject cdolist_list_var = path;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                sub_element = red_api.red_get_element_get_sub_element_by_key(sub_element, key);
                if (NIL == red_api.red_element_struct_p(sub_element)) {
                    return NIL;
                }
            }
            return sub_element;
        }
    }

    /**
     * Get the repository-element struct at the end of PATH within the given repository-element struct
     *
     * @param repository-element-struct;
     * 		the red-repository-element-struct in which we are to search
     * @param path;
     * 		a list of key string
     * @return red-element-struct; the struct at the end of PATH within REPOSITORY-ELEMENT-STRUCT if it exists,
    nil otherwise
     */
    @LispMethod(comment = "Get the repository-element struct at the end of PATH within the given repository-element struct\r\n\r\n@param repository-element-struct;\r\n\t\tthe red-repository-element-struct in which we are to search\r\n@param path;\r\n\t\ta list of key string\r\n@return red-element-struct; the struct at the end of PATH within REPOSITORY-ELEMENT-STRUCT if it exists,\r\nnil otherwise")
    public static SubLObject red_get_element_get_sub_element_by_path(final SubLObject repository_element_struct, final SubLObject path) {
        assert NIL != red_api.red_element_struct_p(repository_element_struct) : "! red_api.red_element_struct_p(repository_element_struct) " + ("red_api.red_element_struct_p(repository_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(repository_element_struct) ") + repository_element_struct;
        assert NIL != listp(path) : "! listp(path) " + ("Types.listp(path) " + "CommonSymbols.NIL != Types.listp(path) ") + path;
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

    public static final SubLObject interpret_red_element_subtree_alt(SubLObject root_element) {
        {
            SubLObject elements = red_api.red_element_get_sub_elements(root_element);
            SubLObject interpretation = NIL;
            SubLObject cdolist_list_var = Sort.sort(elements, $sym9$STRING_, RED_ELEMENT_GET_KEY);
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                interpretation = cons(com.cyc.cycjava.cycl.red_utilities.interpret_red_element_subelements(element), interpretation);
            }
            return nreverse(interpretation);
        }
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

    public static final SubLObject interpret_red_element_subelements_alt(SubLObject element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject value = red_api.red_element_get_value(red_api.red_get_element_get_sub_element_by_key(element, $interpretable_red_element_value_key$.getGlobalValue()));
                SubLObject interpretation = red_api.red_element_get_value(red_api.red_get_element_get_sub_element_by_key(element, $interpretable_red_element_interpretation_key$.getGlobalValue()));
                if (NIL != Strings.string_equal($red_element_interpret_as_literal$.getGlobalValue(), interpretation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return value;
                } else {
                    if (NIL != Strings.string_equal($red_element_interpret_as_symbol_value$.getGlobalValue(), interpretation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_package = com.cyc.cycjava.cycl.red_utilities.interpret_red_element_value_as_symbol_reference(value, UNPROVIDED);
                            SubLObject symbol = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            return symbol_value(find_symbol(symbol, find_package(v_package)));
                        }
                    } else {
                        return value;
                    }
                }
            }
        }
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

    public static final SubLObject interpret_red_element_value_as_symbol_reference_alt(SubLObject reference, SubLObject default_package_name) {
        if (default_package_name == UNPROVIDED) {
            default_package_name = $$$CYC;
        }
        {
            SubLObject pieces = delete_if(symbol_function(EMPTY_STRING_P), string_utilities.split_string(reference, $list_alt17), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.lengthE(pieces, TWO_INTEGER, UNPROVIDED)) {
                return values(pieces.first(), second(pieces));
            } else {
                return values(default_package_name, pieces.first());
            }
        }
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
        declareFunction("get_red_application_element", "GET-RED-APPLICATION-ELEMENT", 0, 0, false);
        declareFunction("get_red_external_element", "GET-RED-EXTERNAL-ELEMENT", 0, 0, false);
        declareFunction("get_red_application_elements", "GET-RED-APPLICATION-ELEMENTS", 0, 0, false);
        declareFunction("get_red_root_element_for_application", "GET-RED-ROOT-ELEMENT-FOR-APPLICATION", 1, 0, false);
        declareFunction("get_red_root_element_for_external", "GET-RED-ROOT-ELEMENT-FOR-EXTERNAL", 1, 0, false);
        declareFunction("get_red_os_element", "GET-RED-OS-ELEMENT", 0, 0, false);
        declareFunction("get_red_os_elements", "GET-RED-OS-ELEMENTS", 0, 0, false);
        declareFunction("get_red_master_license_key", "GET-RED-MASTER-LICENSE-KEY", 0, 0, false);
        declareFunction("red_get_element_get_sub_element_by_path", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-PATH", 2, 0, false);
        declareFunction("interpret_red_element_subtree", "INTERPRET-RED-ELEMENT-SUBTREE", 1, 0, false);
        declareFunction("interpret_red_element_subelements", "INTERPRET-RED-ELEMENT-SUBELEMENTS", 1, 0, false);
        declareFunction("interpret_red_element_value_as_symbol_reference", "INTERPRET-RED-ELEMENT-VALUE-AS-SYMBOL-REFERENCE", 1, 1, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_ = makeString(".");

    @Override
    public void initializeVariables() {
        init_red_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_red_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt4$license_keys = makeString("license-keys");

    static private final SubLString $str_alt6$master_license_key = makeString("master-license-key");

    static private final SubLString $str_alt14$symbol_value = makeString("symbol-value");

    static private final SubLList $list_alt17 = list(CHAR_colon);
}

/**
 * Total time: 129 ms
 */
