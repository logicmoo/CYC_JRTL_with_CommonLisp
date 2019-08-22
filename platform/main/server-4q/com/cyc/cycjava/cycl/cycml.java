package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.package_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cycml extends SubLTranslatedFile {
    public static final SubLFile me = new cycml();

    public static final String myName = "com.cyc.cycjava.cycl.cycml";

    public static final String myFingerPrint = "5f1c3d5cc80269e858d98d13c074a7481b4ba85f33edab2a2934b68be6e2b0e5";

    // defparameter
    public static final SubLSymbol $cycml_indent_mode_on$ = makeSymbol("*CYCML-INDENT-MODE-ON*");

    // defparameter
    private static final SubLSymbol $cycml_namespaces$ = makeSymbol("CYCML-NAMESPACES");

    // defparameter
    private static final SubLSymbol $cycml_serialize_inside_el_formulaP$ = makeSymbol("*CYCML-SERIALIZE-INSIDE-EL-FORMULA?*");

    // Internal Constants
    public static final SubLList $list0 = list(makeString("xmlns:xsi"), makeString("http://www.w3c.org/2001/XMLSchema-instance"), makeString("xsi:noNamespaceSchemaLocation"), makeString("http://opencyc.sourceforge.net/xsd"));

    public static final SubLString $$$package = makeString("package");

    public static final SubLString $$$comment = makeString("comment");

    public static final SubLString $$$guid = makeString("guid");

    public static final SubLString $str4$assertion_id = makeString("assertion-id");

    public static final SubLString $$$name = makeString("name");

    public static final SubLString $$$character = makeString("character");

    public static final SubLString $$$string = makeString("string");

    public static final SubLString $$$url = makeString("url");

    public static final SubLString $$$variable = makeString("variable");

    public static final SubLString $$$number = makeString("number");





    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");







    public static final SubLString $str17$ = makeString("");

    public static final SubLString $str18$__ = makeString("~&");

    public static final SubLString $str19$__xml_version__1_0____ = makeString("<?xml version=\"1.0\" ?>");

    public static final SubLString $str20$__xml_version__1_0__encoding__ISO = makeString("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>");

    public static final SubLString $str21$__DOCTYPE_case_SYSTEM__PartiallyS = makeString("<!DOCTYPE case SYSTEM \"PartiallySpecifiedCase.dtd\">");

    public static final SubLString $$$cycml = makeString("cycml");

    public static final SubLString $$$constants = makeString("constants");

    public static final SubLString $$$assertions = makeString("assertions");

    public static final SubLString $$$assertion = makeString("assertion");

    public static final SubLString $str26$don_t_know_how_to_serialize__S = makeString("don't know how to serialize ~S");

    public static final SubLString $$$paraphrase = makeString("paraphrase");

    public static final SubLString $$$sentence = makeString("sentence");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    public static final SubLString $$$not = makeString("not");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLString $$$and = makeString("and");

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    public static final SubLString $$$or = makeString("or");

    private static final SubLObject $$xor = reader_make_constant_shell(makeString("xor"));

    public static final SubLString $$$xor = makeString("xor");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    public static final SubLString $$$implies = makeString("implies");

    private static final SubLObject $$equiv = reader_make_constant_shell(makeString("equiv"));

    public static final SubLString $$$equiv = makeString("equiv");

    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    public static final SubLString $$$forAll = makeString("forAll");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    public static final SubLString $$$thereExists = makeString("thereExists");

    private static final SubLObject $$thereExistExactly = reader_make_constant_shell(makeString("thereExistExactly"));

    public static final SubLString $$$thereExistExactly = makeString("thereExistExactly");

    private static final SubLObject $$thereExistAtMost = reader_make_constant_shell(makeString("thereExistAtMost"));

    public static final SubLString $$$thereExistAtMost = makeString("thereExistAtMost");

    private static final SubLObject $$thereExistAtLeast = reader_make_constant_shell(makeString("thereExistAtLeast"));

    public static final SubLString $$$thereExistAtLeast = makeString("thereExistAtLeast");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    public static final SubLString $$$predicate = makeString("predicate");



    public static final SubLList $list55 = list(makeSymbol("HP-MARKER"), makeSymbol("CONSTANT-NAME"), makeSymbol("CONSTANT-GUID"));

    public static final SubLString $$$constant = makeString("constant");



    public static final SubLList $list58 = list(makeSymbol("NAT-MARKER"), makeSymbol("FORMULA-TERMS"));

    public static final SubLString $$$function = makeString("function");

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $$QuasiQuote = reader_make_constant_shell(makeString("QuasiQuote"));

    private static final SubLObject $$EscapeQuote = reader_make_constant_shell(makeString("EscapeQuote"));

    public static final SubLString $$$byteVector = makeString("byteVector");

    public static final SubLString $$$length = makeString("length");



    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $str67$_2__0X = makeString("~2,'0X");

    public static final SubLSymbol $sym68$_FILENAME = makeSymbol("?FILENAME");

    public static final SubLList $list69 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SUBJECTCLUMP"), reader_make_constant_shell(makeString("CycSubjectClump")));

    private static final SubLObject $$cycSubjectClumps = reader_make_constant_shell(makeString("cycSubjectClumps"));

    public static final SubLList $list71 = list(makeSymbol("?SUBJECTCLUMP"));

    private static final SubLObject $$mainSubjectClump = reader_make_constant_shell(makeString("mainSubjectClump"));

    public static final SubLList $list73 = list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("vocabFilename")), makeSymbol("?SUBJECTCLUMP"), makeSymbol("?FILENAME")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("superSubjectClump")), makeSymbol("?SUBJECTCLUMP"), makeSymbol("?SUPER")), list(reader_make_constant_shell(makeString("vocabFilename")), makeSymbol("?SUPER"), makeSymbol("?FILENAME")))));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLString $str75$http___www_cyc_com_cyc_2_1_vocab_ = makeString("http://www.cyc.com/cyc-2-1/vocab/");

    public static final SubLString $str76$_ = makeString("#");



    public static final SubLSymbol CYCML_CONSTANT_SORT_PREDICATE = makeSymbol("CYCML-CONSTANT-SORT-PREDICATE");

    public static final SubLString $$$list = makeString("list");

    public static final SubLString $str80$dotted_item = makeString("dotted-item");

    public static final SubLString $$$item = makeString("item");

    public static final SubLString $$$symbol = makeString("symbol");

    public static final SubLString $$$microtheory = makeString("microtheory");

    public static final SubLString $$$strength = makeString("strength");

    public static final SubLString $$$direction = makeString("direction");



    public static final SubLString $$$E = makeString("E");

    public static final SubLString $$$d = makeString("d");

    public static final SubLString $$$reified = makeString("reified");

    public static final SubLString $$$true = makeString("true");

    public static final SubLString $$$false = makeString("false");



    public static SubLObject cycml_indent() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_utilities.indent(xml_vars.$xml_stream$.getDynamicValue(thread), xml_utilities.$cycml_indent_level$.getDynamicValue(thread));
    }

    public static SubLObject cycml_serialize_package(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$package, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_comment(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$comment, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_guid(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$guid, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_assertion_id(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($str4$assertion_id, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_name(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$name, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_character(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$character, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_string(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$string, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_url(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$url, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_variable(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$variable, body, attributes);
        return NIL;
    }

    public static SubLObject cycml_serialize_number(final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        cycml_serialize_primitive($$$number, body, attributes);
        return NIL;
    }

    public static SubLObject serialize_tagged_list_to_xml_file(final SubLObject tagged_list, final SubLObject filepath) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cycml_indent_mode_on$.currentBinding(thread);
        try {
            xml_utilities.$cycml_indent_level$.bind(ZERO_INTEGER, thread);
            $cycml_indent_mode_on$.bind(T, thread);
            SubLObject stream_var = NIL;
            try {
                stream_var = StreamsLow.open(filepath, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE, $IF_EXISTS, $OVERWRITE });
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream_var, thread);
                    emit_eeld_prologue(UNPROVIDED);
                    serialize_tagged_list_to_xml(tagged_list);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != stream_var) {
                        close(stream_var, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $cycml_indent_mode_on$.rebind(_prev_bind_2, thread);
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject serialize_tagged_list_to_xml(final SubLObject tagged_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == tagged_list) {
            return NIL;
        }
        final SubLObject tag = tagged_list.first();
        final SubLObject items = tagged_list.rest();
        if (NIL == items) {
            cycml_serialize_primitive(tag, $str17$, UNPROVIDED);
        } else
            if (items.first().isString()) {
                cycml_serialize_primitive(tag, items.first(), UNPROVIDED);
            } else
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                    final SubLObject name_var = tag;
                    xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                    final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                        final SubLObject _prev_bind_0_$3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            serialize_tagged_list_items(items);
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$3, thread);
                        }
                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                            cycml_indent();
                        }
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }


        return NIL;
    }

    public static SubLObject serialize_tagged_list_items(final SubLObject items) {
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            serialize_tagged_list_to_xml(item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject emit_cycml_prologue(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        princ($str19$__xml_version__1_0____, stream);
        terpri(stream);
        return NIL;
    }

    public static SubLObject emit_eeld_prologue(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        princ($str20$__xml_version__1_0__encoding__ISO, stream);
        terpri(stream);
        princ($str21$__DOCTYPE_case_SYSTEM__PartiallyS, stream);
        terpri(stream);
        return NIL;
    }

    public static SubLObject emit_cycml_assertions(final SubLObject assertions, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLObject constants = cycml_gather_all_constants_from_assertions(assertions);
        return emit_cycml_constants_assertions(constants, assertions, stream);
    }

    public static SubLObject emit_cycml_constants_assertions(final SubLObject constants, final SubLObject assertions, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        emit_cycml_prologue(stream);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_utilities.$cycml_indent_level$.bind(ZERO_INTEGER, thread);
            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$cycml;
                xml_utilities.xml_start_tag_internal(name_var, $cycml_namespaces$.getDynamicValue(thread), NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                            cycml_indent();
                            final SubLObject name_var_$6 = $$$constants;
                            xml_utilities.xml_start_tag_internal(name_var_$6, NIL, NIL, NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    SubLObject cdolist_list_var = constants;
                                    SubLObject constant = NIL;
                                    constant = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cycml_serialize_constant(constant, T);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        constant = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$7, thread);
                                }
                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                    cycml_indent();
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$6);
                        }
                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                            cycml_indent();
                            final SubLObject name_var_$7 = $$$assertions;
                            xml_utilities.xml_start_tag_internal(name_var_$7, NIL, NIL, NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    SubLObject cdolist_list_var = assertions;
                                    SubLObject assertion = NIL;
                                    assertion = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject phrase = pph_main.generate_phrase(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        cycml_serialize_assertion(uncanonicalizer.assertion_el_formula(assertion), assertion_handles.assertion_id(assertion), phrase, assertions_high.assertion_mt(assertion), assertions_high.assertion_strength(assertion), assertions_high.assertion_direction(assertion));
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    } 
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$9, thread);
                                }
                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                    cycml_indent();
                                }
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$7);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$5, thread);
                    }
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_assertion(final SubLObject formula, final SubLObject id, final SubLObject phrase, final SubLObject mt, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$assertion;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_assertion_id(id, UNPROVIDED);
                    cycml_serialize_paraphrase(phrase, UNPROVIDED);
                    cycml_serialize_sentence(formula);
                    cycml_serialize_mt(mt);
                    cycml_serialize_strength(strength);
                    cycml_serialize_direction(direction);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$12, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_term_to_string(final SubLObject expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                cycml_serialize_term(expr);
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string;
    }

    public static SubLObject cycml_serialize_term(final SubLObject expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(expr)) {
            cycml_serialize_constant(expr, UNPROVIDED);
        } else
            if (NIL != cycl_grammar.el_variable_p(expr)) {
                cycml_serialize_variable(expr, UNPROVIDED);
            } else
                if (expr.isDouble()) {
                    cycml_serialize_float(expr);
                } else
                    if (expr.isNumber()) {
                        cycml_serialize_number(expr, UNPROVIDED);
                    } else
                        if (expr.isString()) {
                            cycml_serialize_string(expr, UNPROVIDED);
                        } else
                            if (NIL != unicode_strings.unicode_string_p(expr)) {
                                cycml_serialize_string(unicode_strings.unicode_string_to_utf8(expr), UNPROVIDED);
                            } else
                                if (expr.isChar()) {
                                    cycml_serialize_character(expr, UNPROVIDED);
                                } else
                                    if (expr.isSymbol()) {
                                        cycml_serialize_symbol(expr);
                                    } else
                                        if (NIL != Guids.guid_p(expr)) {
                                            cycml_serialize_guid(Guids.guid_to_string(expr), UNPROVIDED);
                                        } else
                                            if (NIL != cycl_grammar.cycl_sentence_p(expr)) {
                                                if (NIL != $cycml_serialize_inside_el_formulaP$.getDynamicValue(thread)) {
                                                    cycml_serialize_el_formula(expr);
                                                } else {
                                                    cycml_serialize_sentence(expr);
                                                }
                                            } else
                                                if (NIL != cycml_nat_p(expr)) {
                                                    cycml_serialize_function_expr(expr);
                                                } else
                                                    if (expr.isList()) {
                                                        cycml_serialize_list(expr);
                                                    } else
                                                        if (NIL != vector_utilities.byte_vector_p(expr)) {
                                                            cycml_serialize_byte_vector(expr);
                                                        } else {
                                                            Errors.error($str26$don_t_know_how_to_serialize__S, expr);
                                                        }












        return NIL;
    }

    public static SubLObject cycml_serialize_paraphrase(final SubLObject string, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == string) {
            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$paraphrase;
                xml_utilities.xml_start_tag_internal(name_var, attributes, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    cycml_serialize_symbol(string);
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else {
            cycml_serialize_cdata($$$paraphrase, string, attributes);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_sentence(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(formula);
        if (NIL != arg0) {
            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$sentence;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        if (arg0.eql($$not)) {
                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                cycml_indent();
                                final SubLObject name_var_$14 = $$$not;
                                xml_utilities.xml_start_tag_internal(name_var_$14, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$15, thread);
                                    }
                                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                        cycml_indent();
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$14);
                            }
                        } else
                            if (arg0.eql($$and)) {
                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                    cycml_indent();
                                    final SubLObject name_var_$15 = $$$and;
                                    xml_utilities.xml_start_tag_internal(name_var_$15, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                    final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                        final SubLObject _prev_bind_0_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            cycml_serialize_constant(arg0, UNPROVIDED);
                                            SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                                            SubLObject sentence = NIL;
                                            sentence = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                cycml_serialize_sentence(sentence);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                sentence = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$17, thread);
                                        }
                                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                            cycml_indent();
                                        }
                                    } finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_$15);
                                }
                            } else
                                if (arg0.eql($$or)) {
                                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                        cycml_indent();
                                        final SubLObject name_var_$16 = $$$or;
                                        xml_utilities.xml_start_tag_internal(name_var_$16, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                        final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                            final SubLObject _prev_bind_0_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                cycml_serialize_constant(arg0, UNPROVIDED);
                                                SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                                                SubLObject sentence = NIL;
                                                sentence = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    cycml_serialize_sentence(sentence);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    sentence = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                cycml_indent();
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var_$16);
                                    }
                                } else
                                    if (arg0.eql($$xor)) {
                                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                            cycml_indent();
                                            final SubLObject name_var_$17 = $$$xor;
                                            xml_utilities.xml_start_tag_internal(name_var_$17, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                            final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                            try {
                                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                final SubLObject _prev_bind_0_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                    cycml_serialize_constant(arg0, UNPROVIDED);
                                                    cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                                    cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$21, thread);
                                                }
                                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                    cycml_indent();
                                                }
                                            } finally {
                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                            }
                                            xml_utilities.xml_end_tag_internal(name_var_$17);
                                        }
                                    } else
                                        if (arg0.eql($$implies)) {
                                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                cycml_indent();
                                                final SubLObject name_var_$18 = $$$implies;
                                                xml_utilities.xml_start_tag_internal(name_var_$18, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                    final SubLObject _prev_bind_0_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                        cycml_serialize_constant(arg0, UNPROVIDED);
                                                        cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                                        cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$23, thread);
                                                    }
                                                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                        cycml_indent();
                                                    }
                                                } finally {
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$22, thread);
                                                }
                                                xml_utilities.xml_end_tag_internal(name_var_$18);
                                            }
                                        } else
                                            if (arg0.eql($$equiv)) {
                                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                    cycml_indent();
                                                    final SubLObject name_var_$19 = $$$equiv;
                                                    xml_utilities.xml_start_tag_internal(name_var_$19, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                        final SubLObject _prev_bind_0_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                        try {
                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                            cycml_serialize_constant(arg0, UNPROVIDED);
                                                            cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                                            cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                                                        } finally {
                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                            cycml_indent();
                                                        }
                                                    } finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                                    }
                                                    xml_utilities.xml_end_tag_internal(name_var_$19);
                                                }
                                            } else
                                                if (arg0.eql($$forAll)) {
                                                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                        cycml_indent();
                                                        final SubLObject name_var_$20 = $$$forAll;
                                                        xml_utilities.xml_start_tag_internal(name_var_$20, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                        final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                        try {
                                                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                            final SubLObject _prev_bind_0_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                cycml_serialize_constant(arg0, UNPROVIDED);
                                                                cycml_serialize_variable(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED);
                                                                cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$27, thread);
                                                            }
                                                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                cycml_indent();
                                                            }
                                                        } finally {
                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                                        }
                                                        xml_utilities.xml_end_tag_internal(name_var_$20);
                                                    }
                                                } else
                                                    if (arg0.eql($$thereExists)) {
                                                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                            cycml_indent();
                                                            final SubLObject name_var_$21 = $$$thereExists;
                                                            xml_utilities.xml_start_tag_internal(name_var_$21, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                            final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                            try {
                                                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                final SubLObject _prev_bind_0_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                    cycml_serialize_constant(arg0, UNPROVIDED);
                                                                    cycml_serialize_variable(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED);
                                                                    cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$29, thread);
                                                                }
                                                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                    cycml_indent();
                                                                }
                                                            } finally {
                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                                            }
                                                            xml_utilities.xml_end_tag_internal(name_var_$21);
                                                        }
                                                    } else
                                                        if (arg0.eql($$thereExistExactly)) {
                                                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                cycml_indent();
                                                                final SubLObject name_var_$22 = $$$thereExistExactly;
                                                                xml_utilities.xml_start_tag_internal(name_var_$22, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                    final SubLObject _prev_bind_0_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                    try {
                                                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                        cycml_serialize_constant(arg0, UNPROVIDED);
                                                                        cycml_serialize_term(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                                                        cycml_serialize_variable(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
                                                                        cycml_serialize_sentence(cycl_utilities.formula_arg3(formula, UNPROVIDED));
                                                                    } finally {
                                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$31, thread);
                                                                    }
                                                                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                        cycml_indent();
                                                                    }
                                                                } finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                                xml_utilities.xml_end_tag_internal(name_var_$22);
                                                            }
                                                        } else
                                                            if (arg0.eql($$thereExistAtMost)) {
                                                                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                    cycml_indent();
                                                                    final SubLObject name_var_$23 = $$$thereExistAtMost;
                                                                    xml_utilities.xml_start_tag_internal(name_var_$23, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                                    final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                        final SubLObject _prev_bind_0_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                        try {
                                                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                            cycml_serialize_constant(arg0, UNPROVIDED);
                                                                            cycml_serialize_term(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                                                            cycml_serialize_variable(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
                                                                            cycml_serialize_sentence(cycl_utilities.formula_arg3(formula, UNPROVIDED));
                                                                        } finally {
                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$33, thread);
                                                                        }
                                                                        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                            cycml_indent();
                                                                        }
                                                                    } finally {
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                                    }
                                                                    xml_utilities.xml_end_tag_internal(name_var_$23);
                                                                }
                                                            } else
                                                                if (arg0.eql($$thereExistAtLeast)) {
                                                                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                        cycml_indent();
                                                                        final SubLObject name_var_$24 = $$$thereExistAtLeast;
                                                                        xml_utilities.xml_start_tag_internal(name_var_$24, NIL, NIL, NIL, xml_vars.cycml_namespace());
                                                                        final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                        try {
                                                                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                                                            final SubLObject _prev_bind_0_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                            try {
                                                                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                                                                cycml_serialize_constant(arg0, UNPROVIDED);
                                                                                cycml_serialize_term(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                                                                                cycml_serialize_variable(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED);
                                                                                cycml_serialize_sentence(cycl_utilities.formula_arg3(formula, UNPROVIDED));
                                                                            } finally {
                                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$35, thread);
                                                                            }
                                                                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                                                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                                                                cycml_indent();
                                                                            }
                                                                        } finally {
                                                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                                                                        }
                                                                        xml_utilities.xml_end_tag_internal(name_var_$24);
                                                                    }
                                                                } else {
                                                                    cycml_serialize_predicate(cycl_utilities.formula_arg0(formula));
                                                                    SubLObject cdolist_list_var2 = cycl_utilities.formula_args(formula, UNPROVIDED);
                                                                    SubLObject argument = NIL;
                                                                    argument = cdolist_list_var2.first();
                                                                    while (NIL != cdolist_list_var2) {
                                                                        cycml_serialize_term(argument);
                                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                                        argument = cdolist_list_var2.first();
                                                                    } 
                                                                }










                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$13, thread);
                    }
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else
            if ((formula.eql($$True) || formula.eql($$False)) && (NIL != $cycml_indent_mode_on$.getDynamicValue(thread))) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$sentence;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_constant(formula, UNPROVIDED);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$36, thread);
                    }
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }

        return NIL;
    }

    public static SubLObject cycml_serialize_encapsulated_el_formula(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$sentence;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_encapsulated_predicate(v_object.first());
                    SubLObject cdolist_list_var = v_object.rest();
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cycml_serialize_encapsulated_term(v_term);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$48, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return v_object;
    }

    public static SubLObject cycml_serialize_encapsulated_predicate(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$predicate;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_encapsulated_term(v_object);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$49, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return v_object;
    }

    public static SubLObject cycml_serialize_encapsulated_term(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isCons()) {
            final SubLObject pcase_var;
            final SubLObject marker = pcase_var = v_object.first();
            if (pcase_var.eql($HP)) {
                SubLObject hp_marker = NIL;
                SubLObject constant_name = NIL;
                SubLObject constant_guid = NIL;
                destructuring_bind_must_consp(v_object, v_object, $list55);
                hp_marker = v_object.first();
                SubLObject current = v_object.rest();
                destructuring_bind_must_consp(current, v_object, $list55);
                constant_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, v_object, $list55);
                constant_guid = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                        final SubLObject name_var = $$$constant;
                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_guid(Guids.guid_to_string(constant_guid), UNPROVIDED);
                                cycml_serialize_name(constant_name, UNPROVIDED);
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$50, thread);
                            }
                            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                                cycml_indent();
                            }
                        } finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    }
                } else {
                    cdestructuring_bind_error(v_object, $list55);
                }
            } else
                if (pcase_var.eql($NAT)) {
                    SubLObject nat_marker = NIL;
                    SubLObject formula_terms = NIL;
                    destructuring_bind_must_consp(v_object, v_object, $list58);
                    nat_marker = v_object.first();
                    SubLObject current = v_object.rest();
                    destructuring_bind_must_consp(current, v_object, $list58);
                    formula_terms = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        cycml_serialize_encapsulated_naut(formula_terms);
                    } else {
                        cdestructuring_bind_error(v_object, $list58);
                    }
                } else {
                    cycml_serialize_encapsulated_naut(v_object);
                }

        } else {
            cycml_serialize_term(v_object);
        }
        return v_object;
    }

    public static SubLObject cycml_serialize_encapsulated_naut(final SubLObject formula_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$function;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var = formula_terms;
                    SubLObject formula_term = NIL;
                    formula_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cycml_serialize_encapsulated_term(formula_term);
                        cdolist_list_var = cdolist_list_var.rest();
                        formula_term = cdolist_list_var.first();
                    } 
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$51, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return formula_terms;
    }

    public static SubLObject cycml_serialize_el_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cycml_serialize_inside_el_formulaP$.currentBinding(thread);
        try {
            $cycml_serialize_inside_el_formulaP$.bind(T, thread);
            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$sentence;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0_$52 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_predicate(cycl_utilities.formula_arg0(formula));
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                        SubLObject argument = NIL;
                        argument = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cycml_serialize_term(argument);
                            cdolist_list_var = cdolist_list_var.rest();
                            argument = cdolist_list_var.first();
                        } 
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$53, thread);
                    }
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$52, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } finally {
            $cycml_serialize_inside_el_formulaP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cycml_nat_p(final SubLObject v_object) {
        return makeBoolean((((NIL != cycl_grammar.cycl_nat_p(v_object)) || $$Quote.eql(cycl_utilities.formula_arg0(v_object))) || $$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object))) || $$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object)));
    }

    public static SubLObject cycml_serialize_byte_vector(final SubLObject vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$byteVector;
            xml_utilities.xml_start_tag_internal(name_var, list($$$length, length(vector)), NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    for (cdotimes_end_var = length(vector), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        if (mod(i, $int$32).isZero()) {
                            terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
                            cycml_indent();
                        } else
                            if (mod(i, FOUR_INTEGER).isZero()) {
                                write_string($$$_, xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            }

                        cycml_serialize_byte(aref(vector, i));
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$54, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_byte(final SubLObject v_byte) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str67$_2__0X, v_byte);
        return NIL;
    }

    public static SubLObject cycml_serialize_constant(final SubLObject constant, SubLObject commentP) {
        if (commentP == UNPROVIDED) {
            commentP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != commentP) {
            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$constant;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_guid(Guids.guid_to_string(constants_high.constant_guid(constant)), UNPROVIDED);
                        cycml_serialize_name(constants_high.constant_name(constant), UNPROVIDED);
                        cycml_serialize_comment(kb_accessors.comment(constant, UNPROVIDED), UNPROVIDED);
                        cycml_serialize_vocab_url(constant);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$55, thread);
                    }
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        } else
            if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                cycml_indent();
                final SubLObject name_var = $$$constant;
                xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$56 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_guid(Guids.guid_to_string(constants_high.constant_guid(constant)), UNPROVIDED);
                        cycml_serialize_name(constants_high.constant_name(constant), UNPROVIDED);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$56, thread);
                    }
                    if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                        format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                        cycml_indent();
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }

        return NIL;
    }

    public static SubLObject cycml_serialize_vocab_url(final SubLObject constant) {
        SubLObject files = NIL;
        files = ask_utilities.ask_template($sym68$_FILENAME, listS($$and, $list69, list($$or, listS($$cycSubjectClumps, constant, $list71), listS($$mainSubjectClump, constant, $list71)), $list73), $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != files) {
            cycml_serialize_url(cconcatenate($str75$http___www_cyc_com_cyc_2_1_vocab_, new SubLObject[]{ files.first(), $str76$_, constants_high.constant_name(constant) }), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cycml_gather_all_constants_from_assertions(final SubLObject assertions) {
        SubLObject constants = NIL;
        SubLObject sorted_constants = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
            if (NIL != nart_handles.nart_p(v_hlmt)) {
                constants = append(constants, list_utilities.tree_gather(narts_high.nart_el_formula(v_hlmt), CONSTANT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                constants = cons(v_hlmt, constants);
            }
            constants = append(constants, list_utilities.tree_gather(uncanonicalizer.assertion_el_formula(assertion), CONSTANT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        constants = remove_duplicates(constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sorted_constants = Sort.sort(constants, CYCML_CONSTANT_SORT_PREDICATE, UNPROVIDED);
        return sorted_constants;
    }

    public static SubLObject cycml_constant_sort_predicate(final SubLObject constant_1, final SubLObject constant_2) {
        return Strings.stringL(constants_high.constant_name(constant_1), constants_high.constant_name(constant_2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cycml_serialize_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$list;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$57 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject rest;
                    for (rest = NIL, rest = list; rest.isCons(); rest = rest.rest()) {
                        cycml_serialize_item(rest.first());
                    }
                    if (NIL != rest) {
                        cycml_serialize_dotted_item(rest);
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$57, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_dotted_item(final SubLObject tail) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $str80$dotted_item;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$58 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(tail);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$58, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_item(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$item;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(item);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$59, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_symbol(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$symbol;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_package(package_name(symbol_package(symbol)), UNPROVIDED);
                    cycml_serialize_name(symbol_name(symbol), UNPROVIDED);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$60, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$microtheory;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(mt);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$61, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_strength(final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$strength;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(strength);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$62, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_direction(final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$direction;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(direction);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$63, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_float(final SubLObject v_float) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != floatp(v_float) : "Types.floatp(v_float) " + "CommonSymbols.NIL != Types.floatp(v_float) " + v_float;
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$number;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                xml_utilities.xml_write(string_utilities.string_substitute($$$E, $$$d, princ_to_string(v_float), UNPROVIDED), UNPROVIDED);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$predicate;
            xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$64 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(predicate);
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$64, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_function_expr(final SubLObject function_expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            final SubLObject name_var = $$$function;
            xml_utilities.xml_start_tag_internal(name_var, list($$$reified, NIL != nart_handles.nart_p(function_expr) ? $$$true : $$$false), NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$65 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(cycl_utilities.formula_arg0(function_expr));
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(function_expr, UNPROVIDED);
                    SubLObject argument = NIL;
                    argument = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cycml_serialize_term(argument);
                        cdolist_list_var = cdolist_list_var.rest();
                        argument = cdolist_list_var.first();
                    } 
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$65, thread);
                }
                if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
                    format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
                    cycml_indent();
                }
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_cdata(final SubLObject tag, final SubLObject string, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            xml_utilities.xml_start_tag_internal(tag, attributes, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                xml_utilities.xml_cdata(string);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(tag);
        }
        return NIL;
    }

    public static SubLObject cycml_serialize_primitive(final SubLObject tag, final SubLObject body, SubLObject attributes) {
        if (attributes == UNPROVIDED) {
            attributes = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cycml_indent_mode_on$.getDynamicValue(thread)) {
            format(xml_vars.$xml_stream$.getDynamicValue(thread), $str18$__);
            cycml_indent();
            xml_utilities.xml_start_tag_internal(tag, attributes, NIL, NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                xml_utilities.xml_print(body, UNPROVIDED);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(tag);
        }
        return NIL;
    }

    public static SubLObject test_emit_cycml_assertions() {
        final SubLObject assertions = list(assertions_high.random_assertion(UNPROVIDED), assertions_high.random_assertion(UNPROVIDED), assertions_high.random_assertion(UNPROVIDED), assertions_high.random_assertion(UNPROVIDED), assertions_high.random_assertion(UNPROVIDED));
        emit_cycml_assertions(assertions, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_cycml_file() {
        declareFunction(me, "cycml_indent", "CYCML-INDENT", 0, 0, false);
        declareFunction(me, "cycml_serialize_package", "CYCML-SERIALIZE-PACKAGE", 1, 1, false);
        declareFunction(me, "cycml_serialize_comment", "CYCML-SERIALIZE-COMMENT", 1, 1, false);
        declareFunction(me, "cycml_serialize_guid", "CYCML-SERIALIZE-GUID", 1, 1, false);
        declareFunction(me, "cycml_serialize_assertion_id", "CYCML-SERIALIZE-ASSERTION-ID", 1, 1, false);
        declareFunction(me, "cycml_serialize_name", "CYCML-SERIALIZE-NAME", 1, 1, false);
        declareFunction(me, "cycml_serialize_character", "CYCML-SERIALIZE-CHARACTER", 1, 1, false);
        declareFunction(me, "cycml_serialize_string", "CYCML-SERIALIZE-STRING", 1, 1, false);
        declareFunction(me, "cycml_serialize_url", "CYCML-SERIALIZE-URL", 1, 1, false);
        declareFunction(me, "cycml_serialize_variable", "CYCML-SERIALIZE-VARIABLE", 1, 1, false);
        declareFunction(me, "cycml_serialize_number", "CYCML-SERIALIZE-NUMBER", 1, 1, false);
        declareFunction(me, "serialize_tagged_list_to_xml_file", "SERIALIZE-TAGGED-LIST-TO-XML-FILE", 2, 0, false);
        declareFunction(me, "serialize_tagged_list_to_xml", "SERIALIZE-TAGGED-LIST-TO-XML", 1, 0, false);
        declareFunction(me, "serialize_tagged_list_items", "SERIALIZE-TAGGED-LIST-ITEMS", 1, 0, false);
        declareFunction(me, "emit_cycml_prologue", "EMIT-CYCML-PROLOGUE", 0, 1, false);
        declareFunction(me, "emit_eeld_prologue", "EMIT-EELD-PROLOGUE", 0, 1, false);
        declareFunction(me, "emit_cycml_assertions", "EMIT-CYCML-ASSERTIONS", 1, 1, false);
        declareFunction(me, "emit_cycml_constants_assertions", "EMIT-CYCML-CONSTANTS-ASSERTIONS", 2, 1, false);
        declareFunction(me, "cycml_serialize_assertion", "CYCML-SERIALIZE-ASSERTION", 6, 0, false);
        declareFunction(me, "cycml_serialize_term_to_string", "CYCML-SERIALIZE-TERM-TO-STRING", 1, 0, false);
        declareFunction(me, "cycml_serialize_term", "CYCML-SERIALIZE-TERM", 1, 0, false);
        declareFunction(me, "cycml_serialize_paraphrase", "CYCML-SERIALIZE-PARAPHRASE", 1, 1, false);
        declareFunction(me, "cycml_serialize_sentence", "CYCML-SERIALIZE-SENTENCE", 1, 0, false);
        declareFunction(me, "cycml_serialize_encapsulated_el_formula", "CYCML-SERIALIZE-ENCAPSULATED-EL-FORMULA", 1, 0, false);
        declareFunction(me, "cycml_serialize_encapsulated_predicate", "CYCML-SERIALIZE-ENCAPSULATED-PREDICATE", 1, 0, false);
        declareFunction(me, "cycml_serialize_encapsulated_term", "CYCML-SERIALIZE-ENCAPSULATED-TERM", 1, 0, false);
        declareFunction(me, "cycml_serialize_encapsulated_naut", "CYCML-SERIALIZE-ENCAPSULATED-NAUT", 1, 0, false);
        declareFunction(me, "cycml_serialize_el_formula", "CYCML-SERIALIZE-EL-FORMULA", 1, 0, false);
        declareFunction(me, "cycml_nat_p", "CYCML-NAT-P", 1, 0, false);
        declareFunction(me, "cycml_serialize_byte_vector", "CYCML-SERIALIZE-BYTE-VECTOR", 1, 0, false);
        declareFunction(me, "cycml_serialize_byte", "CYCML-SERIALIZE-BYTE", 1, 0, false);
        declareFunction(me, "cycml_serialize_constant", "CYCML-SERIALIZE-CONSTANT", 1, 1, false);
        declareFunction(me, "cycml_serialize_vocab_url", "CYCML-SERIALIZE-VOCAB-URL", 1, 0, false);
        declareFunction(me, "cycml_gather_all_constants_from_assertions", "CYCML-GATHER-ALL-CONSTANTS-FROM-ASSERTIONS", 1, 0, false);
        declareFunction(me, "cycml_constant_sort_predicate", "CYCML-CONSTANT-SORT-PREDICATE", 2, 0, false);
        declareFunction(me, "cycml_serialize_list", "CYCML-SERIALIZE-LIST", 1, 0, false);
        declareFunction(me, "cycml_serialize_dotted_item", "CYCML-SERIALIZE-DOTTED-ITEM", 1, 0, false);
        declareFunction(me, "cycml_serialize_item", "CYCML-SERIALIZE-ITEM", 1, 0, false);
        declareFunction(me, "cycml_serialize_symbol", "CYCML-SERIALIZE-SYMBOL", 1, 0, false);
        declareFunction(me, "cycml_serialize_mt", "CYCML-SERIALIZE-MT", 1, 0, false);
        declareFunction(me, "cycml_serialize_strength", "CYCML-SERIALIZE-STRENGTH", 1, 0, false);
        declareFunction(me, "cycml_serialize_direction", "CYCML-SERIALIZE-DIRECTION", 1, 0, false);
        declareFunction(me, "cycml_serialize_float", "CYCML-SERIALIZE-FLOAT", 1, 0, false);
        declareFunction(me, "cycml_serialize_predicate", "CYCML-SERIALIZE-PREDICATE", 1, 0, false);
        declareFunction(me, "cycml_serialize_function_expr", "CYCML-SERIALIZE-FUNCTION-EXPR", 1, 0, false);
        declareFunction(me, "cycml_serialize_cdata", "CYCML-SERIALIZE-CDATA", 2, 1, false);
        declareFunction(me, "cycml_serialize_primitive", "CYCML-SERIALIZE-PRIMITIVE", 2, 1, false);
        declareFunction(me, "test_emit_cycml_assertions", "TEST-EMIT-CYCML-ASSERTIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cycml_file() {
        defparameter("*CYCML-INDENT-MODE-ON*", T);
        defparameter("CYCML-NAMESPACES", $list0);
        defparameter("*CYCML-SERIALIZE-INSIDE-EL-FORMULA?*", NIL);
        return NIL;
    }

    public static SubLObject setup_cycml_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycml_file();
    }

    @Override
    public void initializeVariables() {
        init_cycml_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycml_file();
    }

    
}

/**
 * Total time: 728 ms
 */
