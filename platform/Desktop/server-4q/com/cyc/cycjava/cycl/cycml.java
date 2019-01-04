package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycml extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycml";
    public static final String myFingerPrint = "5f1c3d5cc80269e858d98d13c074a7481b4ba85f33edab2a2934b68be6e2b0e5";
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 747L)
    public static SubLSymbol $cycml_indent_mode_on$;
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 901L)
    private static SubLSymbol $cycml_namespaces$;
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 12427L)
    private static SubLSymbol $cycml_serialize_inside_el_formulaP$;
    private static final SubLList $list0;
    private static final SubLString $str1$package;
    private static final SubLString $str2$comment;
    private static final SubLString $str3$guid;
    private static final SubLString $str4$assertion_id;
    private static final SubLString $str5$name;
    private static final SubLString $str6$character;
    private static final SubLString $str7$string;
    private static final SubLString $str8$url;
    private static final SubLString $str9$variable;
    private static final SubLString $str10$number;
    private static final SubLSymbol $kw11$DIRECTION;
    private static final SubLSymbol $kw12$OUTPUT;
    private static final SubLSymbol $kw13$IF_DOES_NOT_EXIST;
    private static final SubLSymbol $kw14$CREATE;
    private static final SubLSymbol $kw15$IF_EXISTS;
    private static final SubLSymbol $kw16$OVERWRITE;
    private static final SubLString $str17$;
    private static final SubLString $str18$__;
    private static final SubLString $str19$__xml_version__1_0____;
    private static final SubLString $str20$__xml_version__1_0__encoding__ISO;
    private static final SubLString $str21$__DOCTYPE_case_SYSTEM__PartiallyS;
    private static final SubLString $str22$cycml;
    private static final SubLString $str23$constants;
    private static final SubLString $str24$assertions;
    private static final SubLString $str25$assertion;
    private static final SubLString $str26$don_t_know_how_to_serialize__S;
    private static final SubLString $str27$paraphrase;
    private static final SubLString $str28$sentence;
    private static final SubLObject $const29$not;
    private static final SubLString $str30$not;
    private static final SubLObject $const31$and;
    private static final SubLString $str32$and;
    private static final SubLObject $const33$or;
    private static final SubLString $str34$or;
    private static final SubLObject $const35$xor;
    private static final SubLString $str36$xor;
    private static final SubLObject $const37$implies;
    private static final SubLString $str38$implies;
    private static final SubLObject $const39$equiv;
    private static final SubLString $str40$equiv;
    private static final SubLObject $const41$forAll;
    private static final SubLString $str42$forAll;
    private static final SubLObject $const43$thereExists;
    private static final SubLString $str44$thereExists;
    private static final SubLObject $const45$thereExistExactly;
    private static final SubLString $str46$thereExistExactly;
    private static final SubLObject $const47$thereExistAtMost;
    private static final SubLString $str48$thereExistAtMost;
    private static final SubLObject $const49$thereExistAtLeast;
    private static final SubLString $str50$thereExistAtLeast;
    private static final SubLObject $const51$True;
    private static final SubLObject $const52$False;
    private static final SubLString $str53$predicate;
    private static final SubLSymbol $kw54$HP;
    private static final SubLList $list55;
    private static final SubLString $str56$constant;
    private static final SubLSymbol $kw57$NAT;
    private static final SubLList $list58;
    private static final SubLString $str59$function;
    private static final SubLObject $const60$Quote;
    private static final SubLObject $const61$QuasiQuote;
    private static final SubLObject $const62$EscapeQuote;
    private static final SubLString $str63$byteVector;
    private static final SubLString $str64$length;
    private static final SubLInteger $int65$32;
    private static final SubLString $str66$_;
    private static final SubLString $str67$_2__0X;
    private static final SubLSymbol $sym68$_FILENAME;
    private static final SubLList $list69;
    private static final SubLObject $const70$cycSubjectClumps;
    private static final SubLList $list71;
    private static final SubLObject $const72$mainSubjectClump;
    private static final SubLList $list73;
    private static final SubLObject $const74$EverythingPSC;
    private static final SubLString $str75$http___www_cyc_com_cyc_2_1_vocab_;
    private static final SubLString $str76$_;
    private static final SubLSymbol $sym77$CONSTANT_P;
    private static final SubLSymbol $sym78$CYCML_CONSTANT_SORT_PREDICATE;
    private static final SubLString $str79$list;
    private static final SubLString $str80$dotted_item;
    private static final SubLString $str81$item;
    private static final SubLString $str82$symbol;
    private static final SubLString $str83$microtheory;
    private static final SubLString $str84$strength;
    private static final SubLString $str85$direction;
    private static final SubLSymbol $sym86$FLOATP;
    private static final SubLString $str87$E;
    private static final SubLString $str88$d;
    private static final SubLString $str89$reified;
    private static final SubLString $str90$true;
    private static final SubLString $str91$false;
    private static final SubLSymbol $sym92$STRINGP;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1087L)
    public static SubLObject cycml_indent() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_utilities.indent(xml_vars.$xml_stream$.getDynamicValue(thread), xml_utilities.$cycml_indent_level$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_package(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str1$package, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_comment(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str2$comment, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_guid(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str3$guid, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_assertion_id(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str4$assertion_id, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_name(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str5$name, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_character(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str6$character, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_string(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str7$string, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_url(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str8$url, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_variable(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str9$variable, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1228L)
    public static SubLObject cycml_serialize_number(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        cycml_serialize_primitive((SubLObject)cycml.$str10$number, body, attributes);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 1372L)
    public static SubLObject serialize_tagged_list_to_xml_file(final SubLObject tagged_list, final SubLObject filepath) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cycml.$cycml_indent_mode_on$.currentBinding(thread);
        try {
            xml_utilities.$cycml_indent_level$.bind((SubLObject)cycml.ZERO_INTEGER, thread);
            cycml.$cycml_indent_mode_on$.bind((SubLObject)cycml.T, thread);
            SubLObject stream_var = (SubLObject)cycml.NIL;
            try {
                stream_var = StreamsLow.open(filepath, new SubLObject[] { cycml.$kw11$DIRECTION, cycml.$kw12$OUTPUT, cycml.$kw13$IF_DOES_NOT_EXIST, cycml.$kw14$CREATE, cycml.$kw15$IF_EXISTS, cycml.$kw16$OVERWRITE });
                final SubLObject _prev_bind_0_$1 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream_var, thread);
                    emit_eeld_prologue((SubLObject)cycml.UNPROVIDED);
                    serialize_tagged_list_to_xml(tagged_list);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cycml.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (cycml.NIL != stream_var) {
                        streams_high.close(stream_var, (SubLObject)cycml.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            cycml.$cycml_indent_mode_on$.rebind(_prev_bind_2, thread);
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 2293L)
    public static SubLObject serialize_tagged_list_to_xml(final SubLObject tagged_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL == tagged_list) {
            return (SubLObject)cycml.NIL;
        }
        final SubLObject tag = tagged_list.first();
        final SubLObject items = tagged_list.rest();
        if (cycml.NIL == items) {
            cycml_serialize_primitive(tag, (SubLObject)cycml.$str17$, (SubLObject)cycml.UNPROVIDED);
        }
        else if (items.first().isString()) {
            cycml_serialize_primitive(tag, items.first(), (SubLObject)cycml.UNPROVIDED);
        }
        else if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = tag;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    serialize_tagged_list_items(items);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$3, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 2985L)
    public static SubLObject serialize_tagged_list_items(final SubLObject items) {
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)cycml.NIL;
        item = cdolist_list_var.first();
        while (cycml.NIL != cdolist_list_var) {
            serialize_tagged_list_to_xml(item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 3116L)
    public static SubLObject emit_cycml_prologue(SubLObject stream) {
        if (stream == cycml.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        print_high.princ((SubLObject)cycml.$str19$__xml_version__1_0____, stream);
        streams_high.terpri(stream);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 3371L)
    public static SubLObject emit_eeld_prologue(SubLObject stream) {
        if (stream == cycml.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        print_high.princ((SubLObject)cycml.$str20$__xml_version__1_0__encoding__ISO, stream);
        streams_high.terpri(stream);
        print_high.princ((SubLObject)cycml.$str21$__DOCTYPE_case_SYSTEM__PartiallyS, stream);
        streams_high.terpri(stream);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 3731L)
    public static SubLObject emit_cycml_assertions(final SubLObject assertions, SubLObject stream) {
        if (stream == cycml.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLObject constants = cycml_gather_all_constants_from_assertions(assertions);
        return emit_cycml_constants_assertions(constants, assertions, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 4094L)
    public static SubLObject emit_cycml_constants_assertions(final SubLObject constants, final SubLObject assertions, SubLObject stream) {
        if (stream == cycml.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        emit_cycml_prologue(stream);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_utilities.$cycml_indent_level$.bind((SubLObject)cycml.ZERO_INTEGER, thread);
            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                cycml_indent();
                final SubLObject name_var = (SubLObject)cycml.$str22$cycml;
                xml_utilities.xml_start_tag_internal(name_var, cycml.$cycml_namespaces$.getDynamicValue(thread), (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                            cycml_indent();
                            final SubLObject name_var_$6 = (SubLObject)cycml.$str23$constants;
                            xml_utilities.xml_start_tag_internal(name_var_$6, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$7 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    SubLObject cdolist_list_var = constants;
                                    SubLObject constant = (SubLObject)cycml.NIL;
                                    constant = cdolist_list_var.first();
                                    while (cycml.NIL != cdolist_list_var) {
                                        cycml_serialize_constant(constant, (SubLObject)cycml.T);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        constant = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$7, thread);
                                }
                                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                    cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$6);
                        }
                        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                            cycml_indent();
                            final SubLObject name_var_$7 = (SubLObject)cycml.$str24$assertions;
                            xml_utilities.xml_start_tag_internal(name_var_$7, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    SubLObject cdolist_list_var = assertions;
                                    SubLObject assertion = (SubLObject)cycml.NIL;
                                    assertion = cdolist_list_var.first();
                                    while (cycml.NIL != cdolist_list_var) {
                                        final SubLObject phrase = pph_main.generate_phrase(assertion, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_assertion(uncanonicalizer.assertion_el_formula(assertion), assertion_handles.assertion_id(assertion), phrase, assertions_high.assertion_mt(assertion), assertions_high.assertion_strength(assertion), assertions_high.assertion_direction(assertion));
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$9, thread);
                                }
                                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                    cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$7);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$5, thread);
                    }
                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                        cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 5087L)
    public static SubLObject cycml_serialize_assertion(final SubLObject formula, final SubLObject id, final SubLObject phrase, final SubLObject mt, final SubLObject strength, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str25$assertion;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_assertion_id(id, (SubLObject)cycml.UNPROVIDED);
                    cycml_serialize_paraphrase(phrase, (SubLObject)cycml.UNPROVIDED);
                    cycml_serialize_sentence(formula);
                    cycml_serialize_mt(mt);
                    cycml_serialize_strength(strength);
                    cycml_serialize_direction(direction);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$12, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 5775L)
    public static SubLObject cycml_serialize_term_to_string(final SubLObject expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)cycml.NIL;
        SubLObject stream = (SubLObject)cycml.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                cycml_serialize_term(expr);
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cycml.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cycml.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 6107L)
    public static SubLObject cycml_serialize_term(final SubLObject expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != constant_handles.constant_p(expr)) {
            cycml_serialize_constant(expr, (SubLObject)cycml.UNPROVIDED);
        }
        else if (cycml.NIL != cycl_grammar.el_variable_p(expr)) {
            cycml_serialize_variable(expr, (SubLObject)cycml.UNPROVIDED);
        }
        else if (expr.isDouble()) {
            cycml_serialize_float(expr);
        }
        else if (expr.isNumber()) {
            cycml_serialize_number(expr, (SubLObject)cycml.UNPROVIDED);
        }
        else if (expr.isString()) {
            cycml_serialize_string(expr, (SubLObject)cycml.UNPROVIDED);
        }
        else if (cycml.NIL != unicode_strings.unicode_string_p(expr)) {
            cycml_serialize_string(unicode_strings.unicode_string_to_utf8(expr), (SubLObject)cycml.UNPROVIDED);
        }
        else if (expr.isChar()) {
            cycml_serialize_character(expr, (SubLObject)cycml.UNPROVIDED);
        }
        else if (expr.isSymbol()) {
            cycml_serialize_symbol(expr);
        }
        else if (cycml.NIL != Guids.guid_p(expr)) {
            cycml_serialize_guid(Guids.guid_to_string(expr), (SubLObject)cycml.UNPROVIDED);
        }
        else if (cycml.NIL != cycl_grammar.cycl_sentence_p(expr)) {
            if (cycml.NIL != cycml.$cycml_serialize_inside_el_formulaP$.getDynamicValue(thread)) {
                cycml_serialize_el_formula(expr);
            }
            else {
                cycml_serialize_sentence(expr);
            }
        }
        else if (cycml.NIL != cycml_nat_p(expr)) {
            cycml_serialize_function_expr(expr);
        }
        else if (expr.isList()) {
            cycml_serialize_list(expr);
        }
        else if (cycml.NIL != vector_utilities.byte_vector_p(expr)) {
            cycml_serialize_byte_vector(expr);
        }
        else {
            Errors.error((SubLObject)cycml.$str26$don_t_know_how_to_serialize__S, expr);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 7257L)
    public static SubLObject cycml_serialize_paraphrase(final SubLObject string, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL == string) {
            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                cycml_indent();
                final SubLObject name_var = (SubLObject)cycml.$str27$paraphrase;
                xml_utilities.xml_start_tag_internal(name_var, attributes, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    cycml_serialize_symbol(string);
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cycml_serialize_cdata((SubLObject)cycml.$str27$paraphrase, string, attributes);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 7527L)
    public static SubLObject cycml_serialize_sentence(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg0 = cycl_utilities.formula_arg0(formula);
        if (cycml.NIL != arg0) {
            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                cycml_indent();
                final SubLObject name_var = (SubLObject)cycml.$str28$sentence;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        if (arg0.eql(cycml.$const29$not)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$14 = (SubLObject)cycml.$str30$not;
                                xml_utilities.xml_start_tag_internal(name_var_$14, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$15, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$14);
                            }
                        }
                        else if (arg0.eql(cycml.$const31$and)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$15 = (SubLObject)cycml.$str32$and;
                                xml_utilities.xml_start_tag_internal(name_var_$15, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)cycml.UNPROVIDED);
                                        SubLObject sentence = (SubLObject)cycml.NIL;
                                        sentence = cdolist_list_var.first();
                                        while (cycml.NIL != cdolist_list_var) {
                                            cycml_serialize_sentence(sentence);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            sentence = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$17, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$15);
                            }
                        }
                        else if (arg0.eql(cycml.$const33$or)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$16 = (SubLObject)cycml.$str34$or;
                                xml_utilities.xml_start_tag_internal(name_var_$16, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)cycml.UNPROVIDED);
                                        SubLObject sentence = (SubLObject)cycml.NIL;
                                        sentence = cdolist_list_var.first();
                                        while (cycml.NIL != cdolist_list_var) {
                                            cycml_serialize_sentence(sentence);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            sentence = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$19, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$16);
                            }
                        }
                        else if (arg0.eql(cycml.$const35$xor)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$17 = (SubLObject)cycml.$str36$xor;
                                xml_utilities.xml_start_tag_internal(name_var_$17, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                        cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$21, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$17);
                            }
                        }
                        else if (arg0.eql(cycml.$const37$implies)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$18 = (SubLObject)cycml.$str38$implies;
                                xml_utilities.xml_start_tag_internal(name_var_$18, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                        cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$23, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$22, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$18);
                            }
                        }
                        else if (arg0.eql(cycml.$const39$equiv)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$19 = (SubLObject)cycml.$str40$equiv;
                                xml_utilities.xml_start_tag_internal(name_var_$19, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                        cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$25, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$19);
                            }
                        }
                        else if (arg0.eql(cycml.$const41$forAll)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$20 = (SubLObject)cycml.$str42$forAll;
                                xml_utilities.xml_start_tag_internal(name_var_$20, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_variable(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$27, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$20);
                            }
                        }
                        else if (arg0.eql(cycml.$const43$thereExists)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$21 = (SubLObject)cycml.$str44$thereExists;
                                xml_utilities.xml_start_tag_internal(name_var_$21, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$29 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_variable(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$29, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$21);
                            }
                        }
                        else if (arg0.eql(cycml.$const45$thereExistExactly)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$22 = (SubLObject)cycml.$str46$thereExistExactly;
                                xml_utilities.xml_start_tag_internal(name_var_$22, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$31 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_term(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                        cycml_serialize_variable(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg3(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$31, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$22);
                            }
                        }
                        else if (arg0.eql(cycml.$const47$thereExistAtMost)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$23 = (SubLObject)cycml.$str48$thereExistAtMost;
                                xml_utilities.xml_start_tag_internal(name_var_$23, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_term(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                        cycml_serialize_variable(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg3(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$33, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$23);
                            }
                        }
                        else if (arg0.eql(cycml.$const49$thereExistAtLeast)) {
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                                final SubLObject name_var_$24 = (SubLObject)cycml.$str50$thereExistAtLeast;
                                xml_utilities.xml_start_tag_internal(name_var_$24, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                                final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                    final SubLObject _prev_bind_0_$35 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                        cycml_serialize_constant(arg0, (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_term(cycl_utilities.formula_arg1(formula, (SubLObject)cycml.UNPROVIDED));
                                        cycml_serialize_variable(cycl_utilities.formula_arg2(formula, (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
                                        cycml_serialize_sentence(cycl_utilities.formula_arg3(formula, (SubLObject)cycml.UNPROVIDED));
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$35, thread);
                                    }
                                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                        cycml_indent();
                                    }
                                }
                                finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                                }
                                xml_utilities.xml_end_tag_internal(name_var_$24);
                            }
                        }
                        else {
                            cycml_serialize_predicate(cycl_utilities.formula_arg0(formula));
                            SubLObject cdolist_list_var2 = cycl_utilities.formula_args(formula, (SubLObject)cycml.UNPROVIDED);
                            SubLObject argument = (SubLObject)cycml.NIL;
                            argument = cdolist_list_var2.first();
                            while (cycml.NIL != cdolist_list_var2) {
                                cycml_serialize_term(argument);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                argument = cdolist_list_var2.first();
                            }
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$13, thread);
                    }
                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                        cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if ((formula.eql(cycml.$const51$True) || formula.eql(cycml.$const52$False)) && cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str28$sentence;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$36 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_constant(formula, (SubLObject)cycml.UNPROVIDED);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$36, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 10897L)
    public static SubLObject cycml_serialize_encapsulated_el_formula(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str28$sentence;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_encapsulated_predicate(v_object.first());
                    SubLObject cdolist_list_var = v_object.rest();
                    SubLObject v_term = (SubLObject)cycml.NIL;
                    v_term = cdolist_list_var.first();
                    while (cycml.NIL != cdolist_list_var) {
                        cycml_serialize_encapsulated_term(v_term);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$48, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 11174L)
    public static SubLObject cycml_serialize_encapsulated_predicate(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str53$predicate;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$49 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_encapsulated_term(v_object);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$49, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 11356L)
    public static SubLObject cycml_serialize_encapsulated_term(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isCons()) {
            final SubLObject pcase_var;
            final SubLObject marker = pcase_var = v_object.first();
            if (pcase_var.eql((SubLObject)cycml.$kw54$HP)) {
                SubLObject hp_marker = (SubLObject)cycml.NIL;
                SubLObject constant_name = (SubLObject)cycml.NIL;
                SubLObject constant_guid = (SubLObject)cycml.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)cycml.$list55);
                hp_marker = v_object.first();
                SubLObject current = v_object.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)cycml.$list55);
                constant_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)cycml.$list55);
                constant_guid = current.first();
                current = current.rest();
                if (cycml.NIL == current) {
                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                        cycml_indent();
                        final SubLObject name_var = (SubLObject)cycml.$str56$constant;
                        xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$50 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_guid(Guids.guid_to_string(constant_guid), (SubLObject)cycml.UNPROVIDED);
                                cycml_serialize_name(constant_name, (SubLObject)cycml.UNPROVIDED);
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$50, thread);
                            }
                            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                                cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)cycml.$list55);
                }
            }
            else if (pcase_var.eql((SubLObject)cycml.$kw57$NAT)) {
                SubLObject nat_marker = (SubLObject)cycml.NIL;
                SubLObject formula_terms = (SubLObject)cycml.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)cycml.$list58);
                nat_marker = v_object.first();
                SubLObject current = v_object.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)cycml.$list58);
                formula_terms = current.first();
                current = current.rest();
                if (cycml.NIL == current) {
                    cycml_serialize_encapsulated_naut(formula_terms);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)cycml.$list58);
                }
            }
            else {
                cycml_serialize_encapsulated_naut(v_object);
            }
        }
        else {
            cycml_serialize_term(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 12175L)
    public static SubLObject cycml_serialize_encapsulated_naut(final SubLObject formula_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str59$function;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var = formula_terms;
                    SubLObject formula_term = (SubLObject)cycml.NIL;
                    formula_term = cdolist_list_var.first();
                    while (cycml.NIL != cdolist_list_var) {
                        cycml_serialize_encapsulated_term(formula_term);
                        cdolist_list_var = cdolist_list_var.rest();
                        formula_term = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$51, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return formula_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 12493L)
    public static SubLObject cycml_serialize_el_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cycml.$cycml_serialize_inside_el_formulaP$.currentBinding(thread);
        try {
            cycml.$cycml_serialize_inside_el_formulaP$.bind((SubLObject)cycml.T, thread);
            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                cycml_indent();
                final SubLObject name_var = (SubLObject)cycml.$str28$sentence;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0_$52 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_predicate(cycl_utilities.formula_arg0(formula));
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)cycml.UNPROVIDED);
                        SubLObject argument = (SubLObject)cycml.NIL;
                        argument = cdolist_list_var.first();
                        while (cycml.NIL != cdolist_list_var) {
                            cycml_serialize_term(argument);
                            cdolist_list_var = cdolist_list_var.rest();
                            argument = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$53, thread);
                    }
                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                        cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$52, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        finally {
            cycml.$cycml_serialize_inside_el_formulaP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 12814L)
    public static SubLObject cycml_nat_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycml.NIL != cycl_grammar.cycl_nat_p(v_object) || cycml.$const60$Quote.eql(cycl_utilities.formula_arg0(v_object)) || cycml.$const61$QuasiQuote.eql(cycl_utilities.formula_arg0(v_object)) || cycml.$const62$EscapeQuote.eql(cycl_utilities.formula_arg0(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 13178L)
    public static SubLObject cycml_serialize_byte_vector(final SubLObject vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str63$byteVector;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)ConsesLow.list((SubLObject)cycml.$str64$length, Sequences.length(vector)), (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$54 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    for (cdotimes_end_var = Sequences.length(vector), i = (SubLObject)cycml.NIL, i = (SubLObject)cycml.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)cycml.ONE_INTEGER)) {
                        if (Numbers.mod(i, (SubLObject)cycml.$int65$32).isZero()) {
                            streams_high.terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
                            cycml_indent();
                        }
                        else if (Numbers.mod(i, (SubLObject)cycml.FOUR_INTEGER).isZero()) {
                            streams_high.write_string((SubLObject)cycml.$str66$_, xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED);
                        }
                        cycml_serialize_byte(Vectors.aref(vector, i));
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$54, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 13580L)
    public static SubLObject cycml_serialize_byte(final SubLObject v_byte) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str67$_2__0X, v_byte);
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 13677L)
    public static SubLObject cycml_serialize_constant(final SubLObject constant, SubLObject commentP) {
        if (commentP == cycml.UNPROVIDED) {
            commentP = (SubLObject)cycml.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != commentP) {
            if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                cycml_indent();
                final SubLObject name_var = (SubLObject)cycml.$str56$constant;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_guid(Guids.guid_to_string(constants_high.constant_guid(constant)), (SubLObject)cycml.UNPROVIDED);
                        cycml_serialize_name(constants_high.constant_name(constant), (SubLObject)cycml.UNPROVIDED);
                        cycml_serialize_comment(kb_accessors.comment(constant, (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
                        cycml_serialize_vocab_url(constant);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$55, thread);
                    }
                    if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                        cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str56$constant;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$56 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_guid(Guids.guid_to_string(constants_high.constant_guid(constant)), (SubLObject)cycml.UNPROVIDED);
                    cycml_serialize_name(constants_high.constant_name(constant), (SubLObject)cycml.UNPROVIDED);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$56, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 14378L)
    public static SubLObject cycml_serialize_vocab_url(final SubLObject constant) {
        SubLObject files = (SubLObject)cycml.NIL;
        files = ask_utilities.ask_template((SubLObject)cycml.$sym68$_FILENAME, (SubLObject)ConsesLow.listS(cycml.$const31$and, (SubLObject)cycml.$list69, (SubLObject)ConsesLow.list(cycml.$const33$or, (SubLObject)ConsesLow.listS(cycml.$const70$cycSubjectClumps, constant, (SubLObject)cycml.$list71), (SubLObject)ConsesLow.listS(cycml.$const72$mainSubjectClump, constant, (SubLObject)cycml.$list71)), (SubLObject)cycml.$list73), cycml.$const74$EverythingPSC, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED);
        if (cycml.NIL != files) {
            cycml_serialize_url(Sequences.cconcatenate((SubLObject)cycml.$str75$http___www_cyc_com_cyc_2_1_vocab_, new SubLObject[] { files.first(), cycml.$str76$_, constants_high.constant_name(constant) }), (SubLObject)cycml.UNPROVIDED);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 15191L)
    public static SubLObject cycml_gather_all_constants_from_assertions(final SubLObject assertions) {
        SubLObject constants = (SubLObject)cycml.NIL;
        SubLObject sorted_constants = (SubLObject)cycml.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)cycml.NIL;
        assertion = cdolist_list_var.first();
        while (cycml.NIL != cdolist_list_var) {
            final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
            if (cycml.NIL != nart_handles.nart_p(v_hlmt)) {
                constants = ConsesLow.append(constants, list_utilities.tree_gather(narts_high.nart_el_formula(v_hlmt), (SubLObject)cycml.$sym77$CONSTANT_P, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED));
            }
            else {
                constants = (SubLObject)ConsesLow.cons(v_hlmt, constants);
            }
            constants = ConsesLow.append(constants, list_utilities.tree_gather(uncanonicalizer.assertion_el_formula(assertion), (SubLObject)cycml.$sym77$CONSTANT_P, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        constants = Sequences.remove_duplicates(constants, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED);
        sorted_constants = Sort.sort(constants, (SubLObject)cycml.$sym78$CYCML_CONSTANT_SORT_PREDICATE, (SubLObject)cycml.UNPROVIDED);
        return sorted_constants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 16027L)
    public static SubLObject cycml_constant_sort_predicate(final SubLObject constant_1, final SubLObject constant_2) {
        return Strings.stringL(constants_high.constant_name(constant_1), constants_high.constant_name(constant_2), (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED, (SubLObject)cycml.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 16251L)
    public static SubLObject cycml_serialize_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str79$list;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$57 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject rest;
                    for (rest = (SubLObject)cycml.NIL, rest = list; rest.isCons(); rest = rest.rest()) {
                        cycml_serialize_item(rest.first());
                    }
                    if (cycml.NIL != rest) {
                        cycml_serialize_dotted_item(rest);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$57, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 16621L)
    public static SubLObject cycml_serialize_dotted_item(final SubLObject tail) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str80$dotted_item;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$58 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(tail);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$58, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 16975L)
    public static SubLObject cycml_serialize_item(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str81$item;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$59 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(item);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$59, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 17240L)
    public static SubLObject cycml_serialize_symbol(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str82$symbol;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_package(Packages.package_name(Symbols.symbol_package(symbol)), (SubLObject)cycml.UNPROVIDED);
                    cycml_serialize_name(Symbols.symbol_name(symbol), (SubLObject)cycml.UNPROVIDED);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$60, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 17586L)
    public static SubLObject cycml_serialize_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str83$microtheory;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$61 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(mt);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$61, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 17855L)
    public static SubLObject cycml_serialize_strength(final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str84$strength;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(strength);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$62, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 18159L)
    public static SubLObject cycml_serialize_direction(final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str85$direction;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(direction);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$63, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 18461L)
    public static SubLObject cycml_serialize_float(final SubLObject v_float) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml.NIL != Types.floatp(v_float) : v_float;
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str10$number;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                xml_utilities.xml_write(string_utilities.string_substitute((SubLObject)cycml.$str87$E, (SubLObject)cycml.$str88$d, print_high.princ_to_string(v_float), (SubLObject)cycml.UNPROVIDED), (SubLObject)cycml.UNPROVIDED);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 18776L)
    public static SubLObject cycml_serialize_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str53$predicate;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$64 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(predicate);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$64, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 19063L)
    public static SubLObject cycml_serialize_function_expr(final SubLObject function_expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            final SubLObject name_var = (SubLObject)cycml.$str59$function;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)ConsesLow.list((SubLObject)cycml.$str89$reified, (SubLObject)((cycml.NIL != nart_handles.nart_p(function_expr)) ? cycml.$str90$true : cycml.$str91$false)), (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$65 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_term(cycl_utilities.formula_arg0(function_expr));
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(function_expr, (SubLObject)cycml.UNPROVIDED);
                    SubLObject argument = (SubLObject)cycml.NIL;
                    argument = cdolist_list_var.first();
                    while (cycml.NIL != cdolist_list_var) {
                        cycml_serialize_term(argument);
                        cdolist_list_var = cdolist_list_var.rest();
                        argument = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$65, thread);
                }
                if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
                    cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 19541L)
    public static SubLObject cycml_serialize_cdata(final SubLObject tag, final SubLObject string, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml.NIL != Types.stringp(string) : string;
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            xml_utilities.xml_start_tag_internal(tag, attributes, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                xml_utilities.xml_cdata(string);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(tag);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 19869L)
    public static SubLObject cycml_serialize_primitive(final SubLObject tag, final SubLObject body, SubLObject attributes) {
        if (attributes == cycml.UNPROVIDED) {
            attributes = (SubLObject)cycml.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml.$str18$__);
            cycml_indent();
            xml_utilities.xml_start_tag_internal(tag, attributes, (SubLObject)cycml.NIL, (SubLObject)cycml.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                xml_utilities.xml_print(body, (SubLObject)cycml.UNPROVIDED);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(tag);
        }
        return (SubLObject)cycml.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml.lisp", position = 20254L)
    public static SubLObject test_emit_cycml_assertions() {
        final SubLObject assertions = (SubLObject)ConsesLow.list(assertions_high.random_assertion((SubLObject)cycml.UNPROVIDED), assertions_high.random_assertion((SubLObject)cycml.UNPROVIDED), assertions_high.random_assertion((SubLObject)cycml.UNPROVIDED), assertions_high.random_assertion((SubLObject)cycml.UNPROVIDED), assertions_high.random_assertion((SubLObject)cycml.UNPROVIDED));
        emit_cycml_assertions(assertions, (SubLObject)cycml.UNPROVIDED);
        return (SubLObject)cycml.NIL;
    }
    
    public static SubLObject declare_cycml_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_indent", "CYCML-INDENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_package", "CYCML-SERIALIZE-PACKAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_comment", "CYCML-SERIALIZE-COMMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_guid", "CYCML-SERIALIZE-GUID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_assertion_id", "CYCML-SERIALIZE-ASSERTION-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_name", "CYCML-SERIALIZE-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_character", "CYCML-SERIALIZE-CHARACTER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_string", "CYCML-SERIALIZE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_url", "CYCML-SERIALIZE-URL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_variable", "CYCML-SERIALIZE-VARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_number", "CYCML-SERIALIZE-NUMBER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "serialize_tagged_list_to_xml_file", "SERIALIZE-TAGGED-LIST-TO-XML-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "serialize_tagged_list_to_xml", "SERIALIZE-TAGGED-LIST-TO-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "serialize_tagged_list_items", "SERIALIZE-TAGGED-LIST-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "emit_cycml_prologue", "EMIT-CYCML-PROLOGUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "emit_eeld_prologue", "EMIT-EELD-PROLOGUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "emit_cycml_assertions", "EMIT-CYCML-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "emit_cycml_constants_assertions", "EMIT-CYCML-CONSTANTS-ASSERTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_assertion", "CYCML-SERIALIZE-ASSERTION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_term_to_string", "CYCML-SERIALIZE-TERM-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_term", "CYCML-SERIALIZE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_paraphrase", "CYCML-SERIALIZE-PARAPHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_sentence", "CYCML-SERIALIZE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_encapsulated_el_formula", "CYCML-SERIALIZE-ENCAPSULATED-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_encapsulated_predicate", "CYCML-SERIALIZE-ENCAPSULATED-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_encapsulated_term", "CYCML-SERIALIZE-ENCAPSULATED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_encapsulated_naut", "CYCML-SERIALIZE-ENCAPSULATED-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_el_formula", "CYCML-SERIALIZE-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_nat_p", "CYCML-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_byte_vector", "CYCML-SERIALIZE-BYTE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_byte", "CYCML-SERIALIZE-BYTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_constant", "CYCML-SERIALIZE-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_vocab_url", "CYCML-SERIALIZE-VOCAB-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_gather_all_constants_from_assertions", "CYCML-GATHER-ALL-CONSTANTS-FROM-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_constant_sort_predicate", "CYCML-CONSTANT-SORT-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_list", "CYCML-SERIALIZE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_dotted_item", "CYCML-SERIALIZE-DOTTED-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_item", "CYCML-SERIALIZE-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_symbol", "CYCML-SERIALIZE-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_mt", "CYCML-SERIALIZE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_strength", "CYCML-SERIALIZE-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_direction", "CYCML-SERIALIZE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_float", "CYCML-SERIALIZE-FLOAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_predicate", "CYCML-SERIALIZE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_function_expr", "CYCML-SERIALIZE-FUNCTION-EXPR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_cdata", "CYCML-SERIALIZE-CDATA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "cycml_serialize_primitive", "CYCML-SERIALIZE-PRIMITIVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml", "test_emit_cycml_assertions", "TEST-EMIT-CYCML-ASSERTIONS", 0, 0, false);
        return (SubLObject)cycml.NIL;
    }
    
    public static SubLObject init_cycml_file() {
        cycml.$cycml_indent_mode_on$ = SubLFiles.defparameter("*CYCML-INDENT-MODE-ON*", (SubLObject)cycml.T);
        cycml.$cycml_namespaces$ = SubLFiles.defparameter("CYCML-NAMESPACES", (SubLObject)cycml.$list0);
        cycml.$cycml_serialize_inside_el_formulaP$ = SubLFiles.defparameter("*CYCML-SERIALIZE-INSIDE-EL-FORMULA?*", (SubLObject)cycml.NIL);
        return (SubLObject)cycml.NIL;
    }
    
    public static SubLObject setup_cycml_file() {
        return (SubLObject)cycml.NIL;
    }
    
    public void declareFunctions() {
        declare_cycml_file();
    }
    
    public void initializeVariables() {
        init_cycml_file();
    }
    
    public void runTopLevelForms() {
        setup_cycml_file();
    }
    
    static {
        me = (SubLFile)new cycml();
        cycml.$cycml_indent_mode_on$ = null;
        cycml.$cycml_namespaces$ = null;
        cycml.$cycml_serialize_inside_el_formulaP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xmlns:xsi"), (SubLObject)SubLObjectFactory.makeString("http://www.w3c.org/2001/XMLSchema-instance"), (SubLObject)SubLObjectFactory.makeString("xsi:noNamespaceSchemaLocation"), (SubLObject)SubLObjectFactory.makeString("http://opencyc.sourceforge.net/cycml.xsd"));
        $str1$package = SubLObjectFactory.makeString("package");
        $str2$comment = SubLObjectFactory.makeString("comment");
        $str3$guid = SubLObjectFactory.makeString("guid");
        $str4$assertion_id = SubLObjectFactory.makeString("assertion-id");
        $str5$name = SubLObjectFactory.makeString("name");
        $str6$character = SubLObjectFactory.makeString("character");
        $str7$string = SubLObjectFactory.makeString("string");
        $str8$url = SubLObjectFactory.makeString("url");
        $str9$variable = SubLObjectFactory.makeString("variable");
        $str10$number = SubLObjectFactory.makeString("number");
        $kw11$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw12$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw13$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $kw14$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $kw15$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");
        $kw16$OVERWRITE = SubLObjectFactory.makeKeyword("OVERWRITE");
        $str17$ = SubLObjectFactory.makeString("");
        $str18$__ = SubLObjectFactory.makeString("~&");
        $str19$__xml_version__1_0____ = SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>");
        $str20$__xml_version__1_0__encoding__ISO = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>");
        $str21$__DOCTYPE_case_SYSTEM__PartiallyS = SubLObjectFactory.makeString("<!DOCTYPE case SYSTEM \"PartiallySpecifiedCase.dtd\">");
        $str22$cycml = SubLObjectFactory.makeString("cycml");
        $str23$constants = SubLObjectFactory.makeString("constants");
        $str24$assertions = SubLObjectFactory.makeString("assertions");
        $str25$assertion = SubLObjectFactory.makeString("assertion");
        $str26$don_t_know_how_to_serialize__S = SubLObjectFactory.makeString("don't know how to serialize ~S");
        $str27$paraphrase = SubLObjectFactory.makeString("paraphrase");
        $str28$sentence = SubLObjectFactory.makeString("sentence");
        $const29$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $str30$not = SubLObjectFactory.makeString("not");
        $const31$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str32$and = SubLObjectFactory.makeString("and");
        $const33$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $str34$or = SubLObjectFactory.makeString("or");
        $const35$xor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("xor"));
        $str36$xor = SubLObjectFactory.makeString("xor");
        $const37$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $str38$implies = SubLObjectFactory.makeString("implies");
        $const39$equiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv"));
        $str40$equiv = SubLObjectFactory.makeString("equiv");
        $const41$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $str42$forAll = SubLObjectFactory.makeString("forAll");
        $const43$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $str44$thereExists = SubLObjectFactory.makeString("thereExists");
        $const45$thereExistExactly = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
        $str46$thereExistExactly = SubLObjectFactory.makeString("thereExistExactly");
        $const47$thereExistAtMost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $str48$thereExistAtMost = SubLObjectFactory.makeString("thereExistAtMost");
        $const49$thereExistAtLeast = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $str50$thereExistAtLeast = SubLObjectFactory.makeString("thereExistAtLeast");
        $const51$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const52$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $str53$predicate = SubLObjectFactory.makeString("predicate");
        $kw54$HP = SubLObjectFactory.makeKeyword("HP");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HP-MARKER"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-GUID"));
        $str56$constant = SubLObjectFactory.makeString("constant");
        $kw57$NAT = SubLObjectFactory.makeKeyword("NAT");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAT-MARKER"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TERMS"));
        $str59$function = SubLObjectFactory.makeString("function");
        $const60$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $const61$QuasiQuote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiQuote"));
        $const62$EscapeQuote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EscapeQuote"));
        $str63$byteVector = SubLObjectFactory.makeString("byteVector");
        $str64$length = SubLObjectFactory.makeString("length");
        $int65$32 = SubLObjectFactory.makeInteger(32);
        $str66$_ = SubLObjectFactory.makeString(" ");
        $str67$_2__0X = SubLObjectFactory.makeString("~2,'0X");
        $sym68$_FILENAME = SubLObjectFactory.makeSymbol("?FILENAME");
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBJECTCLUMP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycSubjectClump")));
        $const70$cycSubjectClumps = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cycSubjectClumps"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SUBJECTCLUMP"));
        $const72$mainSubjectClump = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mainSubjectClump"));
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("vocabFilename")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBJECTCLUMP"), (SubLObject)SubLObjectFactory.makeSymbol("?FILENAME")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superSubjectClump")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBJECTCLUMP"), (SubLObject)SubLObjectFactory.makeSymbol("?SUPER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("vocabFilename")), (SubLObject)SubLObjectFactory.makeSymbol("?SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("?FILENAME")))));
        $const74$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str75$http___www_cyc_com_cyc_2_1_vocab_ = SubLObjectFactory.makeString("http://www.cyc.com/cyc-2-1/vocab/");
        $str76$_ = SubLObjectFactory.makeString("#");
        $sym77$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym78$CYCML_CONSTANT_SORT_PREDICATE = SubLObjectFactory.makeSymbol("CYCML-CONSTANT-SORT-PREDICATE");
        $str79$list = SubLObjectFactory.makeString("list");
        $str80$dotted_item = SubLObjectFactory.makeString("dotted-item");
        $str81$item = SubLObjectFactory.makeString("item");
        $str82$symbol = SubLObjectFactory.makeString("symbol");
        $str83$microtheory = SubLObjectFactory.makeString("microtheory");
        $str84$strength = SubLObjectFactory.makeString("strength");
        $str85$direction = SubLObjectFactory.makeString("direction");
        $sym86$FLOATP = SubLObjectFactory.makeSymbol("FLOATP");
        $str87$E = SubLObjectFactory.makeString("E");
        $str88$d = SubLObjectFactory.makeString("d");
        $str89$reified = SubLObjectFactory.makeString("reified");
        $str90$true = SubLObjectFactory.makeString("true");
        $str91$false = SubLObjectFactory.makeString("false");
        $sym92$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    }
}

/*

	Total time: 728 ms
	
*/