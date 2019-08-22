package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_downcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class system_parameter_export extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new system_parameter_export();

    public static final String myName = "com.cyc.cycjava_2.cycl.system_parameter_export";


    // deflexical
    public static final SubLSymbol $system_parameter_name_space$ = makeSymbol("*SYSTEM-PARAMETER-NAME-SPACE*");

    // defparameter
    public static final SubLSymbol $default_target_name_space$ = makeSymbol("*DEFAULT-TARGET-NAME-SPACE*");

    // deflexical
    private static final SubLSymbol $default_xsd_schema_attribute_list$ = makeSymbol("*DEFAULT-XSD-SCHEMA-ATTRIBUTE-LIST*");



    private static final SubLString $str1$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $INCLUDE_FEATURES = makeKeyword("INCLUDE-FEATURES");

    private static final SubLString $$$params = makeString("params");

    private static final SubLString $$$xmlns = makeString("xmlns");



    private static final SubLList $list6 = list(cons(makeString("true"), makeString("::TRUE::")), cons(makeString("false"), makeString("::FALSE::")));

    private static final SubLString $$$param = makeString("param");

    private static final SubLList $list8 = list(makeSymbol("SYMBOL"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));

    private static final SubLString $$$doc = makeString("doc");

    private static final SubLString $str10$Possible_Values__ = makeString("Possible Values: ");



    private static final SubLString $$$equiv = makeString("equiv");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $$$value = makeString("value");

    private static final SubLSymbol UNDEFINED = makeSymbol("UNDEFINED");



    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$false = makeString("false");

    private static final SubLList $list19 = list(makeSymbol("OR"), makeSymbol("STRING"), makeSymbol("UNDEFINED"));

    private static final SubLString $$$string = makeString("string");

    private static final SubLString $$$undefined = makeString("undefined");

    private static final SubLList $list22 = list(makeSymbol("AND"), makeSymbol("OR"));

    private static final SubLList $list23 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-TYPES"));







    private static final SubLString $$$keyword = makeString("keyword");

    private static final SubLString $str28$Unsupported_operator__A_in_type__ = makeString("Unsupported operator ~A in type ~A.");

    private static final SubLString $str29$Unsupported_type_descriptor__A_ = makeString("Unsupported type descriptor ~A.");

    private static final SubLString $str30$UTF_8 = makeString("UTF-8");

    private static final SubLString $str31$__generated_by_Cyc__A____A___ = makeString("  generated by Cyc ~A  (~A)~%");

    private static final SubLString $str32$____________at__A__ = makeString("            at ~A~%");

    private static final SubLString $str33$__Features_of_generating_code___ = makeString("  Features of generating code:~%");

    private static final SubLString $str34$http___ws_opencyc_org_xsd_sysPara = makeString("http://ws.opencyc.org/xsd/sysParam/0.9");

    private static final SubLList $list35 = list(list(makeSymbol("TARGET-NAME-SPACE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym36$ATT_LIST = makeUninternedSymbol("ATT-LIST");



    private static final SubLList $list38 = list(list(makeSymbol("COMPILE-DEFAULT-XSD-ATTRIBUTE-LIST")));



    private static final SubLSymbol XSD_ADD_TARGET_NAME_SPACE = makeSymbol("XSD-ADD-TARGET-NAME-SPACE");



    private static final SubLString $str42$xsd_schema = makeString("xsd:schema");

    private static final SubLList $list43 = list(makeSymbol("XML-TERPRI"));

    private static final SubLList $list44 = list(makeSymbol("XML-TAG"), list(makeString("xsd:import"), list(makeSymbol("LIST"), makeString("namespace"), makeString("http://www.w3.org/XML/1998/namespace"), makeString("schemaLocation"), makeString("http://www.w3.org/2001/xml.xsd")), T, T));

    private static final SubLString $str45$http___ws_opencyc_org_SystemParam = makeString("http://ws.opencyc.org/SystemParameterType/0.9/");

    private static final SubLSymbol GENERATE_SYSTEM_PARAMETER_TYPES_XSD = makeSymbol("GENERATE-SYSTEM-PARAMETER-TYPES-XSD");

    private static final SubLString $str47$xsd_import = makeString("xsd:import");

    private static final SubLString $$$namespace = makeString("namespace");

    private static final SubLString $str49$http___www_w3_org_XML_1998_namesp = makeString("http://www.w3.org/XML/1998/namespace");

    private static final SubLString $$$schemaLocation = makeString("schemaLocation");

    private static final SubLString $str51$http___www_w3_org_2001_xml_xsd = makeString("http://www.w3.org/2001/xml.xsd");

    private static final SubLList $list52 = list(makeString("xmlns:xsd"), makeString("http://www.w3.org/2001/XMLSchema"), makeString("xmlns:xsi"), makeString("http://www.w3.org/2001/XMLSchema-instance"), makeString("xsi:schemaLocation"), makeString("http://www.w3.org/2001/XMLSchema http://www.w3.org/2001/XMLSchema.xsd"), makeString("xmlns:xml"), makeString("http://www.w3.org/XML/1998/namespace"));

    private static final SubLString $$$targetNameSpace = makeString("targetNameSpace");

    private static final SubLString $str54$xmlns_tns = makeString("xmlns:tns");

    private static final SubLString $str55$_definition_for_SYSTEM_PARAMETER_ = makeString(" definition for SYSTEM-PARAMETER type ");

    private static final SubLString $str56$Dont_handle_recursive_types_yet_ = makeString("Dont handle recursive types yet.");

    public static SubLObject generate_system_parameter_xml_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str1$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                generate_xml_prolegomena($INCLUDE_FEATURES);
                try {
                    final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$params, list($$$xmlns, $system_parameter_name_space$.getGlobalValue()), NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            final SubLObject substitutions = $list6;
                            SubLObject cdolist_list_var = system_parameters.all_system_parameter_definitions();
                            SubLObject entry = NIL;
                            entry = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                generate_one_system_parameter_in_xml(entry, substitutions);
                                cdolist_list_var = cdolist_list_var.rest();
                                entry = cdolist_list_var.first();
                            } 
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($$$params);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return filename;
    }

    public static SubLObject generate_one_system_parameter_in_xml(final SubLObject entry, final SubLObject substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_terpri();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$param, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject symbol = NIL;
                    SubLObject v_default = NIL;
                    SubLObject type = NIL;
                    SubLObject description = NIL;
                    destructuring_bind_must_consp(entry, entry, $list8);
                    symbol = entry.first();
                    SubLObject current = entry.rest();
                    destructuring_bind_must_consp(current, entry, $list8);
                    v_default = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, entry, $list8);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, entry, $list8);
                    description = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$doc, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_write_string($str10$Possible_Values__, UNPROVIDED, UNPROVIDED);
                                    final SubLObject possible_values = system_parameter_types.determine_system_parameter_type_possible_values_string(type, $XML);
                                    final SubLObject localized = system_parameters.localize_boolean_description_lines(list(possible_values), substitutions, UNPROVIDED).first();
                                    xml_utilities.xml_write_string(localized, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var = system_parameters.get_parameter_description_lines(description, substitutions, UNPROVIDED);
                                    SubLObject line = NIL;
                                    line = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_write_string(line, UNPROVIDED, UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        line = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$doc);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                        final SubLObject symbol_name = symbol_name(symbol);
                        final SubLObject att_list = list($$$equiv, symbol_name);
                        final SubLObject param_name = gensysparam_symbol_name_to_parameter_name(symbol_name, UNPROVIDED);
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$name, att_list, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_write_string(param_name, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$7, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$name);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$value, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    final SubLObject tag_name = gensysparam_type_to_final_tag_name(type);
                                    final SubLObject nested_elementsP = system_parameter_has_nested_elementsP(type);
                                    try {
                                        final SubLObject _prev_bind_0_$13 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                            xml_utilities.xml_start_tag_internal(tag_name, NIL, NIL, NIL, $UNINITIALIZED);
                                            final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                if (UNDEFINED != type) {
                                                    if (BOOLEAN == type) {
                                                        xml_utilities.xml_write_string(NIL != v_default ? $$$true : $$$false, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if ($list19.equal(type)) {
                                                            if (v_default.isString()) {
                                                                try {
                                                                    final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                        xml_utilities.xml_start_tag_internal($$$string, NIL, NIL, NIL, $UNINITIALIZED);
                                                                        final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                            xml_utilities.xml_write_string(v_default, UNPROVIDED, UNPROVIDED);
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                                                        }
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values3 = getValuesAsVector();
                                                                        xml_utilities.xml_end_tag_internal($$$string);
                                                                        restoreValuesFromVector(_values3);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$undefined, NIL, T, NIL, $UNINITIALIZED);
                                                                    final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$11, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                                                                }
                                                            }
                                                        } else {
                                                            xml_utilities.xml_write_string(string_utilities.to_string(v_default), UNPROVIDED, UNPROVIDED);
                                                        }

                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                            }
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$9, thread);
                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != nested_elementsP) {
                                                xml_utilities.xml_terpri();
                                            }
                                            xml_utilities.xml_end_tag_internal(tag_name);
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$value);
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(entry, $list8);
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values6 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$param);
                restoreValuesFromVector(_values6);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return entry;
    }

    public static SubLObject system_parameter_has_nested_elementsP(final SubLObject type) {
        if (type.isCons()) {
            return subl_promotions.memberP(type.first(), $list22, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gensysparam_symbol_name_to_parameter_name(final SubLObject symbol_name, SubLObject downcase_firstP) {
        if (downcase_firstP == UNPROVIDED) {
            downcase_firstP = NIL;
        }
        SubLObject param_name = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject keptP = downcase_firstP;
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject curr_char;
            SubLObject result_char;
            for (cdotimes_end_var = length(symbol_name), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                curr_char = Strings.sublisp_char(symbol_name, i);
                if (NIL != alphanumericp(curr_char)) {
                    result_char = (NIL != keptP) ? char_downcase(curr_char) : char_upcase(curr_char);
                    write_char(result_char, s);
                    keptP = T;
                } else {
                    keptP = NIL;
                }
            }
            param_name = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return param_name;
    }

    public static SubLObject gensysparam_type_to_final_tag_name(final SubLObject type) {
        final SubLObject result = gensysparam_type_to_tag_name(type);
        return string_utilities.uncapitalize_first(result);
    }

    public static SubLObject gensysparam_type_to_tag_name(final SubLObject type) {
        SubLObject result = NIL;
        if (type.isCons()) {
            SubLObject operator = NIL;
            destructuring_bind_must_consp(type, type, $list23);
            operator = type.first();
            final SubLObject sub_types;
            final SubLObject current = sub_types = type.rest();
            if ((OR == operator) || (AND == operator)) {
                final SubLObject op_name = gensysparam_symbol_name_to_parameter_name(symbol_name(operator), UNPROVIDED);
                SubLObject s = NIL;
                try {
                    s = make_private_string_output_stream();
                    SubLObject list_var = NIL;
                    SubLObject sub_type = NIL;
                    SubLObject index = NIL;
                    list_var = sub_types;
                    sub_type = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sub_type = list_var.first() , index = add(ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            write_string(op_name, s, UNPROVIDED, UNPROVIDED);
                        }
                        write_string(gensysparam_type_to_tag_name(sub_type), s, UNPROVIDED, UNPROVIDED);
                    }
                    result = get_output_stream_string(s);
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        close(s, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            } else
                if (MEMBER == operator) {
                    result = $$$keyword;
                } else {
                    Errors.error($str28$Unsupported_operator__A_in_type__, operator, type);
                }

        } else
            if (type.isSymbol()) {
                result = gensysparam_symbol_name_to_parameter_name(symbol_name(type), UNPROVIDED);
            } else {
                Errors.error($str29$Unsupported_type_descriptor__A_, type);
            }

        return result;
    }

    public static SubLObject generate_xml_prolegomena(SubLObject include_featuresP) {
        if (include_featuresP == UNPROVIDED) {
            include_featuresP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_utilities.xml_header(xml_utilities.$xml_version$.getDynamicValue(thread), $str30$UTF_8, NIL);
        SubLObject comment = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            format(s, $str31$__generated_by_Cyc__A____A___, system_info.cyc_revision_string(), Environment.lisp_implementation_type());
            format(s, $str32$____________at__A__, numeric_date_utilities.timestring(UNPROVIDED));
            terpri(s);
            if (NIL != include_featuresP) {
                format(s, $str33$__Features_of_generating_code___);
                SubLObject cdolist_list_var = $features$.getDynamicValue(thread);
                SubLObject feature = NIL;
                feature = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    string_utilities.indent(s, FOUR_INTEGER);
                    prin1(feature, s);
                    terpri(s);
                    cdolist_list_var = cdolist_list_var.rest();
                    feature = cdolist_list_var.first();
                } 
                terpri(s);
            }
            comment = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        xml_utilities.xml_comment(comment);
        return xml_utilities.xml_terpri();
    }

    public static SubLObject with_xsd_schema(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject target_name_space = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        target_name_space = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject att_list = $sym36$ATT_LIST;
            return list(CLET, list(bq_cons(att_list, $list38)), list(CSETQ, att_list, list(XSD_ADD_TARGET_NAME_SPACE, att_list, target_name_space)), listS(XML_TAG, list($str42$xsd_schema, att_list), $list43, $list44, $list43, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject generate_system_parameter_types_xsd(final SubLObject xsd_path, final SubLObject types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(xsd_path, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str1$Unable_to_open__S, xsd_path);
            }
            final SubLObject s = stream;
            final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(s, thread);
                generate_xsd_prolegomena(UNPROVIDED);
                SubLObject att_list = compile_default_xsd_attribute_list();
                att_list = xsd_add_target_name_space(att_list, $default_target_name_space$.getDynamicValue(thread));
                try {
                    final SubLObject _prev_bind_0_$28 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($str42$xsd_schema, att_list, NIL, NIL, $UNINITIALIZED);
                        final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            xml_utilities.xml_terpri();
                            final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($str47$xsd_import, list($$$namespace, $str49$http___www_w3_org_XML_1998_namesp, $$$schemaLocation, $str51$http___www_w3_org_2001_xml_xsd), T, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$31, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$30, thread);
                            }
                            xml_utilities.xml_terpri();
                            final SubLObject set_contents_var = set.do_set_internal(types);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject type;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                type = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                    generate_xsd_definition_for_type(type);
                                }
                            }
                            generate_xsd_epilogue();
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$28, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal($str42$xsd_schema);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return xsd_path;
    }

    public static SubLObject compile_default_xsd_attribute_list() {
        return copy_list($default_xsd_schema_attribute_list$.getGlobalValue());
    }

    public static SubLObject xsd_add_target_name_space(final SubLObject att_list, final SubLObject target_name_space) {
        return append(att_list, list($$$targetNameSpace, target_name_space, $str54$xmlns_tns, target_name_space));
    }

    public static SubLObject generate_xsd_prolegomena(SubLObject include_featuresP) {
        if (include_featuresP == UNPROVIDED) {
            include_featuresP = T;
        }
        return generate_xml_prolegomena(include_featuresP);
    }

    public static SubLObject generate_xsd_epilogue() {
        return xml_utilities.xml_terpri();
    }

    public static SubLObject generate_xsd_definition_for_type(final SubLObject type) {
        xml_utilities.xml_comment(cconcatenate($str55$_definition_for_SYSTEM_PARAMETER_, format_nil.format_nil_a_no_copy(type)));
        if (type.isCons()) {
            Errors.error($str56$Dont_handle_recursive_types_yet_);
        } else
            if (type.isSymbol()) {
            }

        return xml_utilities.xml_terpri();
    }

    public static SubLObject declare_system_parameter_export_file() {
        declareFunction("generate_system_parameter_xml_file", "GENERATE-SYSTEM-PARAMETER-XML-FILE", 1, 0, false);
        declareFunction("generate_one_system_parameter_in_xml", "GENERATE-ONE-SYSTEM-PARAMETER-IN-XML", 2, 0, false);
        declareFunction("system_parameter_has_nested_elementsP", "SYSTEM-PARAMETER-HAS-NESTED-ELEMENTS?", 1, 0, false);
        declareFunction("gensysparam_symbol_name_to_parameter_name", "GENSYSPARAM-SYMBOL-NAME-TO-PARAMETER-NAME", 1, 1, false);
        declareFunction("gensysparam_type_to_final_tag_name", "GENSYSPARAM-TYPE-TO-FINAL-TAG-NAME", 1, 0, false);
        declareFunction("gensysparam_type_to_tag_name", "GENSYSPARAM-TYPE-TO-TAG-NAME", 1, 0, false);
        declareFunction("generate_xml_prolegomena", "GENERATE-XML-PROLEGOMENA", 0, 1, false);
        declareMacro("with_xsd_schema", "WITH-XSD-SCHEMA");
        declareFunction("generate_system_parameter_types_xsd", "GENERATE-SYSTEM-PARAMETER-TYPES-XSD", 2, 0, false);
        declareFunction("compile_default_xsd_attribute_list", "COMPILE-DEFAULT-XSD-ATTRIBUTE-LIST", 0, 0, false);
        declareFunction("xsd_add_target_name_space", "XSD-ADD-TARGET-NAME-SPACE", 2, 0, false);
        declareFunction("generate_xsd_prolegomena", "GENERATE-XSD-PROLEGOMENA", 0, 1, false);
        declareFunction("generate_xsd_epilogue", "GENERATE-XSD-EPILOGUE", 0, 0, false);
        declareFunction("generate_xsd_definition_for_type", "GENERATE-XSD-DEFINITION-FOR-TYPE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_system_parameter_export_file() {
        deflexical("*SYSTEM-PARAMETER-NAME-SPACE*", $str34$http___ws_opencyc_org_xsd_sysPara);
        defparameter("*DEFAULT-TARGET-NAME-SPACE*", $str45$http___ws_opencyc_org_SystemParam);
        deflexical("*DEFAULT-XSD-SCHEMA-ATTRIBUTE-LIST*", $list52);
        return NIL;
    }

    public static SubLObject setup_system_parameter_export_file() {
        register_external_symbol(GENERATE_SYSTEM_PARAMETER_TYPES_XSD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_system_parameter_export_file();
    }

    @Override
    public void initializeVariables() {
        init_system_parameter_export_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_system_parameter_export_file();
    }

    
}

/**
 * Total time: 560 ms
 */
