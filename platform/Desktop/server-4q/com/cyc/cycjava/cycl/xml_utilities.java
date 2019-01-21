package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_utilities";
    public static final String myFingerPrint = "e7c9cb1f7880bc162f20850315e6cd986c364934afaa5401951df48410191408";
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1033L)
    public static SubLSymbol $xml_version$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1135L)
    public static SubLSymbol $xml_indentation_level$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1187L)
    public static SubLSymbol $xml_indentation_amount$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1361L)
    public static SubLSymbol $cycml_indent_level$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3724L)
    private static SubLSymbol $xml_cdata_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3843L)
    private static SubLSymbol $xml_cdata_suffix$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11890L)
    private static SubLSymbol $xml_base_char_code_ranges$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15420L)
    private static SubLSymbol $xml_ideographic_char_code_ranges$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16784L)
    public static SubLSymbol $xml_special_chars$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24338L)
    private static SubLSymbol $alists_sort_key$;
    private static final SubLFloat $float0$1_0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$VALID_XML_CHAR_P;
    private static final SubLString $str4$Skipping_invalid_xml_character__S;
    private static final SubLSymbol $sym5$CHAR_;
    private static final SubLString $str6$US_ASCII;
    private static final SubLSymbol $sym7$FLOATP;
    private static final SubLSymbol $sym8$STRINGP;
    private static final SubLSymbol $sym9$BOOLEANP;
    private static final SubLString $str10$__xml_version_;
    private static final SubLSymbol $sym11$DOUBLE_FLOAT;
    private static final SubLString $str12$_encoding_;
    private static final SubLString $str13$_standalone_;
    private static final SubLString $str14$yes;
    private static final SubLString $str15$no;
    private static final SubLString $str16$___;
    private static final SubLString $str17$___CDATA_;
    private static final SubLString $str18$___;
    private static final SubLString $str19$____;
    private static final SubLString $str20$___;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$CUNWIND_PROTECT;
    private static final SubLSymbol $sym23$WITH_XML_INDENTATION;
    private static final SubLSymbol $sym24$XML_START_TAG_INTERNAL;
    private static final SubLSymbol $sym25$_XML_DEFAULT_NAMESPACE_;
    private static final SubLSymbol $sym26$PUNLESS;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$XML_END_TAG_INTERNAL;
    private static final SubLString $str29$xmlns;
    private static final SubLString $str30$__;
    private static final SubLString $str31$__;
    private static final SubLString $str32$__;
    private static final SubLString $str33$_;
    private static final SubLString $str34$_;
    private static final SubLSymbol $sym35$VALID_XML_NAME_CHAR_P;
    private static final SubLSymbol $sym36$VALID_XML_NAME_CHAR_CODE_P;
    private static final SubLList $list37;
    private static final SubLObject $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLString $str42$_;
    private static final SubLInteger $int43$34;
    private static final SubLString $str44$_quot_;
    private static final SubLInteger $int45$38;
    private static final SubLString $str46$_amp_;
    private static final SubLInteger $int47$39;
    private static final SubLString $str48$_apos_;
    private static final SubLInteger $int49$60;
    private static final SubLString $str50$_lt_;
    private static final SubLInteger $int51$62;
    private static final SubLString $str52$_gt_;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$DIGIT_CHAR_P;
    private static final SubLSymbol $sym55$HEX_CHAR_P;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$_XML_STREAM_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$SYMBOLP;
    private static final SubLSymbol $sym60$STREAM;
    private static final SubLSymbol $sym61$CWITH_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym62$WITH_XML_OUTPUT_TO_STREAM;
    private static final SubLSymbol $sym63$GENERATE_VALID_XML_HEADER;
    private static final SubLList $list64;
    private static final SubLString $str65$__DOCTYPE__A_SYSTEM__S_;
    private static final SubLList $list66;
    private static final SubLString $str67$xmlns_;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLString $str70$xml_;
    private static final SubLString $str71$http_;
    private static final SubLString $str72$Couldn_t_resolve__S_based_on__S_a;
    private static final SubLSymbol $sym73$LISTP;
    private static final SubLSymbol $kw74$UNINITIALIZED;
    private static final SubLSymbol $sym75$TERM___WITH_CONSTANT_BY_NAME;
    private static final SubLSymbol $sym76$ALISTS_SORT_KEY;
    private static final SubLSymbol $kw77$NAME;
    private static final SubLSymbol $kw78$ATTRIBUTES;
    private static final SubLSymbol $kw79$ELEMENTS;
    private static final SubLSymbol $kw80$TEXT;
    private static final SubLList $list81;
    private static final SubLString $str82$__A;
    private static final SubLString $str83$__;
    private static final SubLString $str84$__A__A;
    private static final SubLString $str85$___;
    private static final SubLString $str86$_A__;
    private static final SubLString $str87$___A___;
    private static final SubLString $str88$____;
    private static final SubLSymbol $kw89$SORT_ASC;
    private static final SubLSymbol $kw90$SORT_DESC;
    private static final SubLString $str91$__name__binding___elements__;
    private static final SubLString $str92$__name__;
    private static final SubLString $str93$___text_;
    private static final SubLString $str94$__;
    private static final SubLString $str95$__;
    private static final SubLString $str96$root;
    private static final SubLSymbol $sym97$QUERY_RESULTS_TO_XML_STREAM;
    private static final SubLSymbol $kw98$DEFAULT;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$URL_P;
    private static final SubLSymbol $kw101$INPUT;
    private static final SubLString $str102$Unable_to_open__S;
    private static final SubLInteger $int103$2000;
    private static final SubLString $str104$404;
    private static final SubLString $str105$Not_Found;
    private static final SubLString $str106$Url_not_found_;
    private static final SubLString $str107$503_Service_Temporarily_Unavailab;
    private static final SubLString $str108$Server_not_available;
    private static final SubLString $str109$__xml;
    private static final SubLString $str110$Not_XML_document__Starts_with_;
    private static final SubLString $str111$Encountered_error_trying_to_downl;
    private static final SubLSymbol $sym112$QUERY_RESULTS_TO_XML_FILE;
    private static final SubLSymbol $kw113$OUTPUT;
    private static final SubLSymbol $sym114$QUERY_RESULTS_TO_XML_STRING;
    private static final SubLString $str115$true;
    private static final SubLString $str116$false;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1079L)
    public static SubLObject xml_version() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return xml_utilities.$xml_version$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1239L)
    public static SubLObject xml_add_indentation(SubLObject stream) {
        if (stream == xml_utilities.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_utilities.indent(stream, xml_utilities.$xml_indentation_level$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1410L)
    public static SubLObject with_xml_indentation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)xml_utilities.$sym1$CLET, (SubLObject)xml_utilities.$list2, ConsesLow.append(body, (SubLObject)xml_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1679L)
    public static SubLObject xml_terpri() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
        xml_add_indentation((SubLObject)xml_utilities.UNPROVIDED);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1771L)
    public static SubLObject xml_write_string(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == xml_utilities.UNPROVIDED) {
            start = (SubLObject)xml_utilities.ZERO_INTEGER;
        }
        if (end == xml_utilities.UNPROVIDED) {
            end = (SubLObject)xml_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (xml_utilities.NIL != list_utilities.find_if_not((SubLObject)xml_utilities.$sym3$VALID_XML_CHAR_P, string, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)) {
            SubLObject end_var_$1;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = (end_var_$1 = ((xml_utilities.NIL != end) ? end : Sequences.length(string))), char_num = (SubLObject)xml_utilities.NIL, char_num = start; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (xml_utilities.NIL != valid_xml_char_p(v_char)) {
                    streams_high.write_char(v_char, xml_vars.$xml_stream$.getDynamicValue(thread));
                }
                else {
                    Errors.warn((SubLObject)xml_utilities.$str4$Skipping_invalid_xml_character__S, v_char, string);
                }
            }
        }
        else {
            streams_high.write_string(string, xml_vars.$xml_stream$.getDynamicValue(thread), start, end);
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 2298L)
    public static SubLObject xml_write_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert xml_utilities.NIL != valid_xml_char_p(v_char) : v_char;
        streams_high.write_char(v_char, xml_vars.$xml_stream$.getDynamicValue(thread));
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 2453L)
    public static SubLObject xml_write_string_indented(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == xml_utilities.UNPROVIDED) {
            start = (SubLObject)xml_utilities.ZERO_INTEGER;
        }
        if (end == xml_utilities.UNPROVIDED) {
            end = (SubLObject)xml_utilities.NIL;
        }
        if (xml_utilities.NIL == end) {
            end = Sequences.length(string);
        }
        while (start.numL(end)) {
            final SubLObject end_of_line = Sequences.position((SubLObject)Characters.CHAR_newline, string, Symbols.symbol_function((SubLObject)xml_utilities.$sym5$CHAR_), Symbols.symbol_function((SubLObject)xml_utilities.IDENTITY), start, end);
            final SubLObject fragment_end = end_of_line.isFixnum() ? end_of_line : end;
            xml_write_string(string, start, fragment_end);
            if (end_of_line.isFixnum()) {
                xml_terpri();
            }
            start = Numbers.add(fragment_end, (SubLObject)xml_utilities.ONE_INTEGER);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3048L)
    public static SubLObject xml_header(SubLObject version, SubLObject encoding, SubLObject standalone) {
        if (version == xml_utilities.UNPROVIDED) {
            version = xml_utilities.$xml_version$.getDynamicValue();
        }
        if (encoding == xml_utilities.UNPROVIDED) {
            encoding = (SubLObject)xml_utilities.$str6$US_ASCII;
        }
        if (standalone == xml_utilities.UNPROVIDED) {
            standalone = (SubLObject)xml_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert xml_utilities.NIL != Types.floatp(version) : version;
        assert xml_utilities.NIL != Types.stringp(encoding) : encoding;
        assert xml_utilities.NIL != Types.booleanp(standalone) : standalone;
        xml_write_string((SubLObject)xml_utilities.$str10$__xml_version_, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)xml_utilities.$sym11$DOUBLE_FLOAT, thread);
            print_high.prin1(print_high.prin1_to_string(version), xml_vars.$xml_stream$.getDynamicValue(thread));
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        xml_write_string((SubLObject)xml_utilities.$str12$_encoding_, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        print_high.prin1(encoding, xml_vars.$xml_stream$.getDynamicValue(thread));
        xml_write_string((SubLObject)xml_utilities.$str13$_standalone_, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        print_high.prin1((SubLObject)((xml_utilities.NIL != standalone) ? xml_utilities.$str14$yes : xml_utilities.$str15$no), xml_vars.$xml_stream$.getDynamicValue(thread));
        xml_write_string((SubLObject)xml_utilities.$str16$___, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        streams_high.terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3777L)
    public static SubLObject xml_cdata_prefix() {
        return xml_utilities.$xml_cdata_prefix$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3890L)
    public static SubLObject xml_cdata_suffix() {
        return xml_utilities.$xml_cdata_suffix$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3956L)
    public static SubLObject xml_cdata(final SubLObject string) {
        xml_write_string(xml_cdata_prefix(), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        xml_write_string(string, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        xml_write_string(xml_cdata_suffix(), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 4428L)
    public static SubLObject xml_markup(final SubLObject string) {
        xml_write_string(string, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 4689L)
    public static SubLObject xml_comment(final SubLObject string) {
        xml_write_string((SubLObject)xml_utilities.$str19$____, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        xml_write_string(string, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        xml_write_string((SubLObject)xml_utilities.$str20$___, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 5056L)
    public static SubLObject xml_tag(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)xml_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list21);
        name = current.first();
        current = current.rest();
        final SubLObject attributes = (SubLObject)(current.isCons() ? current.first() : xml_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)xml_utilities.$list21);
        current = current.rest();
        final SubLObject atomicP = (SubLObject)(current.isCons() ? current.first() : xml_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)xml_utilities.$list21);
        current = current.rest();
        final SubLObject no_nested_elementsP = (SubLObject)(current.isCons() ? current.first() : xml_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)xml_utilities.$list21);
        current = current.rest();
        final SubLObject multiple_line_attributesP = (SubLObject)(current.isCons() ? current.first() : xml_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)xml_utilities.$list21);
        current = current.rest();
        final SubLObject default_namespace = current.isCons() ? current.first() : xml_vars.$xml_default_namespace$.getDynamicValue(thread);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)xml_utilities.$list21);
        current = current.rest();
        if (xml_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym22$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym23$WITH_XML_INDENTATION, (SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym24$XML_START_TAG_INTERNAL, name, attributes, atomicP, multiple_line_attributesP, default_namespace), (SubLObject)ConsesLow.listS((SubLObject)xml_utilities.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym25$_XML_DEFAULT_NAMESPACE_, default_namespace)), ConsesLow.append(body, (SubLObject)xml_utilities.NIL))), (SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym26$PUNLESS, atomicP, (SubLObject)ConsesLow.listS((SubLObject)xml_utilities.$sym26$PUNLESS, no_nested_elementsP, (SubLObject)xml_utilities.$list27), (SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym28$XML_END_TAG_INTERNAL, name)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)xml_utilities.$list21);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 6172L)
    public static SubLObject xml_start_tag_internal(final SubLObject name, SubLObject attributes, final SubLObject atomicP, SubLObject multiple_line_attributesP, SubLObject default_namespace) {
        if (multiple_line_attributesP == xml_utilities.UNPROVIDED) {
            multiple_line_attributesP = (SubLObject)xml_utilities.NIL;
        }
        if (default_namespace == xml_utilities.UNPROVIDED) {
            default_namespace = xml_vars.$xml_default_namespace$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_write_char((SubLObject)Characters.CHAR_less);
        xml_write_string(name, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        if (xml_utilities.NIL != misc_utilities.initialized_p(default_namespace)) {
            assert xml_utilities.NIL != Types.stringp(default_namespace) : default_namespace;
            if (!default_namespace.equal(xml_vars.$xml_default_namespace$.getDynamicValue(thread))) {
                attributes = conses_high.putf(attributes, (SubLObject)xml_utilities.$str29$xmlns, default_namespace);
            }
        }
        SubLObject att_list = (SubLObject)xml_utilities.NIL;
        SubLObject att_name = (SubLObject)xml_utilities.NIL;
        SubLObject att_value = (SubLObject)xml_utilities.NIL;
        att_list = attributes;
        att_name = att_list.first();
        att_value = conses_high.second(att_list);
        while (xml_utilities.NIL != att_name) {
            xml_write_char((SubLObject)Characters.CHAR_space);
            xml_write_string(att_name, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            xml_write_string((SubLObject)xml_utilities.$str30$__, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            xml_write_wXescaped_special_chars(att_value.isString() ? att_value : print_high.prin1_to_string(att_value));
            xml_write_char((SubLObject)Characters.CHAR_quotation);
            if (xml_utilities.NIL != multiple_line_attributesP) {
                xml_terpri();
            }
            att_list = conses_high.cddr(att_list);
            att_name = att_list.first();
            att_value = conses_high.second(att_list);
        }
        if (xml_utilities.NIL != atomicP) {
            xml_write_string((SubLObject)xml_utilities.$str31$__, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        }
        else {
            xml_write_char((SubLObject)Characters.CHAR_greater);
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 7546L)
    public static SubLObject xml_end_tag_internal(final SubLObject name) {
        xml_write_string((SubLObject)xml_utilities.$str32$__, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        xml_write_string(name, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        xml_write_char((SubLObject)Characters.CHAR_greater);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 7807L)
    public static SubLObject xml_print(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == xml_utilities.UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write(string_utilities.to_string(v_object), entity_table);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 7946L)
    public static SubLObject xml_prin1(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == xml_utilities.UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write(print_high.prin1_to_string(v_object), entity_table);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8090L)
    public static SubLObject xml_print_line(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == xml_utilities.UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write_line(string_utilities.to_string(v_object), entity_table);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8238L)
    public static SubLObject xml_prin1_line(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == xml_utilities.UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write_line(print_high.prin1_to_string(v_object), entity_table);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8392L)
    public static SubLObject xml_write(final SubLObject string, SubLObject entity_table) {
        if (entity_table == xml_utilities.UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        assert xml_utilities.NIL != Types.stringp(string) : string;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject ent;
        for (cdotimes_end_var = Sequences.length(string), i = (SubLObject)xml_utilities.NIL, i = (SubLObject)xml_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)xml_utilities.ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, i);
            ent = conses_high.assoc(ch, entity_table, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            if (xml_utilities.NIL != ent) {
                xml_write_string(Sequences.cconcatenate((SubLObject)xml_utilities.$str33$_, new SubLObject[] { ent.rest(), xml_utilities.$str34$_ }), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            }
            else {
                xml_write_char(ch);
            }
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8714L)
    public static SubLObject xml_write_line(final SubLObject string, SubLObject entity_table) {
        if (entity_table == xml_utilities.UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        assert xml_utilities.NIL != Types.stringp(string) : string;
        xml_write(string, entity_table);
        xml_write_char((SubLObject)Characters.CHAR_newline);
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8905L)
    public static SubLObject valid_xml_name_p(final SubLObject name) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != string_utilities.non_empty_string_p(name) && xml_utilities.NIL != ((xml_utilities.NIL != unicode_strings.ascii_string_p(name)) ? valid_ascii_xml_name_p(name) : valid_non_ascii_xml_name_p(name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9093L)
    public static SubLObject remove_invalid_xml_name_chars(final SubLObject name) {
        assert xml_utilities.NIL != Types.stringp(name) : name;
        return (xml_utilities.NIL != unicode_strings.ascii_string_p(name)) ? remove_invalid_xml_name_chars_from_ascii_string(name) : remove_invalid_xml_name_chars_from_non_ascii_string(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9406L)
    public static SubLObject valid_ascii_xml_name_p(final SubLObject name) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != valid_xml_name_initial_char_p(string_utilities.first_char(name)) && xml_utilities.NIL == list_utilities.find_if_not((SubLObject)xml_utilities.$sym35$VALID_XML_NAME_CHAR_P, name, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9574L)
    public static SubLObject valid_xml_name_initial_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.eql((SubLObject)Characters.CHAR_underbar) || v_char.eql((SubLObject)Characters.CHAR_colon) || xml_utilities.NIL != xml_letter_char_p(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9706L)
    public static SubLObject valid_xml_name_initial_char_code_p(final SubLObject code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(code.eql(Characters.char_code((SubLObject)Characters.CHAR_underbar)) || code.eql(Characters.char_code((SubLObject)Characters.CHAR_colon)) || xml_utilities.NIL != xml_letter_char_code_p(code));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9874L)
    public static SubLObject valid_non_ascii_xml_name_p(final SubLObject name) {
        final SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector(name);
        return (SubLObject)SubLObjectFactory.makeBoolean((string_utilities.first_char(name).eql((SubLObject)Characters.CHAR_underbar) || string_utilities.first_char(name).eql((SubLObject)Characters.CHAR_colon) || xml_utilities.NIL != xml_letter_char_code_p(Vectors.aref(char_codes, (SubLObject)xml_utilities.ZERO_INTEGER))) && xml_utilities.NIL == list_utilities.find_if_not((SubLObject)xml_utilities.$sym36$VALID_XML_NAME_CHAR_CODE_P, char_codes, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 10189L)
    public static SubLObject valid_xml_name_char_p(final SubLObject v_char) {
        return valid_xml_name_char_code_p(Characters.char_code(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 10290L)
    public static SubLObject remove_invalid_xml_name_chars_from_ascii_string(final SubLObject name) {
        SubLObject new_name;
        for (new_name = name; xml_utilities.NIL == string_utilities.empty_string_p(new_name) && xml_utilities.NIL == valid_xml_name_initial_char_p(string_utilities.first_char(new_name)); new_name = string_utilities.substring(new_name, (SubLObject)xml_utilities.ONE_INTEGER, (SubLObject)xml_utilities.UNPROVIDED)) {}
        return list_utilities.remove_if_not((SubLObject)xml_utilities.$sym35$VALID_XML_NAME_CHAR_P, new_name, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 10594L)
    public static SubLObject remove_invalid_xml_name_chars_from_non_ascii_string(final SubLObject name) {
        SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector(name);
        SubLObject found_invalidP = (SubLObject)xml_utilities.NIL;
        while (xml_utilities.NIL == list_utilities.lengthE(char_codes, (SubLObject)xml_utilities.ZERO_INTEGER, (SubLObject)xml_utilities.UNPROVIDED) && xml_utilities.NIL == valid_xml_name_initial_char_code_p(Vectors.aref(char_codes, (SubLObject)xml_utilities.ZERO_INTEGER))) {
            found_invalidP = (SubLObject)xml_utilities.T;
            char_codes = Sequences.subseq(char_codes, (SubLObject)xml_utilities.ONE_INTEGER, (SubLObject)xml_utilities.UNPROVIDED);
        }
        if (xml_utilities.NIL != found_invalidP || xml_utilities.NIL != list_utilities.find_if_not((SubLObject)xml_utilities.$sym36$VALID_XML_NAME_CHAR_CODE_P, char_codes, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)) {
            return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(list_utilities.delete_if_not((SubLObject)xml_utilities.$sym36$VALID_XML_NAME_CHAR_CODE_P, char_codes, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11163L)
    public static SubLObject valid_xml_name_char_code_p(final SubLObject code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != subl_promotions.non_negative_integer_p(code) && (xml_utilities.NIL != xml_letter_char_code_p(code) || xml_utilities.NIL != digit_char_code_p(code) || xml_utilities.NIL != conses_high.member(code, (SubLObject)xml_utilities.$list37, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11414L)
    public static SubLObject digit_char_code_p(final SubLObject code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(code.numGE(Characters.char_code((SubLObject)Characters.CHAR_0)) && code.numLE(Characters.char_code((SubLObject)Characters.CHAR_9)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11642L)
    public static SubLObject xml_letter_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != xml_base_char_p(v_char) || xml_utilities.NIL != xml_ideographic_char_p(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11757L)
    public static SubLObject xml_letter_char_code_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != xml_base_char_code_p(v_object) || xml_utilities.NIL != xml_ideographic_char_code_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15532L)
    public static SubLObject xml_base_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && xml_utilities.NIL != char_in_ranges_p(v_object, xml_utilities.$xml_base_char_code_ranges$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15670L)
    public static SubLObject xml_base_char_code_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isNumber() && xml_utilities.NIL != char_code_in_ranges_p(v_object, xml_utilities.$xml_base_char_code_ranges$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15814L)
    public static SubLObject xml_ideographic_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && xml_utilities.NIL != char_in_ranges_p(v_object, xml_utilities.$xml_ideographic_char_code_ranges$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15966L)
    public static SubLObject xml_ideographic_char_code_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isNumber() && xml_utilities.NIL != char_code_in_ranges_p(v_object, xml_utilities.$xml_ideographic_char_code_ranges$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16124L)
    public static SubLObject valid_xml_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && xml_utilities.NIL != char_code_in_ranges_p(Characters.char_code(v_char), xml_vars.$xml_valid_char_code_ranges$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16274L)
    public static SubLObject valid_xml_char_code_p(final SubLObject char_code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(char_code.isNumber() && xml_utilities.NIL != char_code_in_ranges_p(char_code, xml_vars.$xml_valid_char_code_ranges$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16429L)
    public static SubLObject char_in_ranges_p(final SubLObject v_char, final SubLObject v_ranges) {
        return char_code_in_ranges_p(Characters.char_code(v_char), v_ranges);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16535L)
    public static SubLObject char_code_in_ranges_p(final SubLObject char_code, final SubLObject v_ranges) {
        SubLObject okP = (SubLObject)xml_utilities.NIL;
        if (xml_utilities.NIL == okP) {
            SubLObject csome_list_var = v_ranges;
            SubLObject range = (SubLObject)xml_utilities.NIL;
            range = csome_list_var.first();
            while (xml_utilities.NIL == okP && xml_utilities.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = range;
                SubLObject low = (SubLObject)xml_utilities.NIL;
                SubLObject high = (SubLObject)xml_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list40);
                low = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list40);
                high = current.first();
                current = current.rest();
                if (xml_utilities.NIL == current) {
                    if (char_code.numGE(low) && char_code.numLE(high)) {
                        okP = (SubLObject)xml_utilities.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)xml_utilities.$list40);
                }
                csome_list_var = csome_list_var.rest();
                range = csome_list_var.first();
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16853L)
    public static SubLObject xml_special_charP(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != string_utilities.control_char_p(v_char) || xml_utilities.NIL != conses_high.member(v_char, xml_utilities.$xml_special_chars$.getGlobalValue(), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16970L)
    public static SubLObject xml_char_escaped_version(final SubLObject v_char) {
        if (xml_utilities.NIL != string_utilities.control_char_p(v_char)) {
            return (SubLObject)xml_utilities.$str42$_;
        }
        final SubLObject pcase_var = Characters.char_code(v_char);
        if (pcase_var.eql((SubLObject)xml_utilities.$int43$34)) {
            return (SubLObject)xml_utilities.$str44$_quot_;
        }
        if (pcase_var.eql((SubLObject)xml_utilities.$int45$38)) {
            return (SubLObject)xml_utilities.$str46$_amp_;
        }
        if (pcase_var.eql((SubLObject)xml_utilities.$int47$39)) {
            return (SubLObject)xml_utilities.$str48$_apos_;
        }
        if (pcase_var.eql((SubLObject)xml_utilities.$int49$60)) {
            return (SubLObject)xml_utilities.$str50$_lt_;
        }
        if (pcase_var.eql((SubLObject)xml_utilities.$int51$62)) {
            return (SubLObject)xml_utilities.$str52$_gt_;
        }
        if (pcase_var.eql((SubLObject)xml_utilities.TEN_INTEGER)) {
            return (SubLObject)xml_utilities.$str42$_;
        }
        return PrintLow.write_to_string(v_char, xml_utilities.EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 17285L)
    public static SubLObject xml_unescape_string(final SubLObject str) {
        return string_utilities.do_string_substitutions_robust(str, (SubLObject)xml_utilities.$list53, (SubLObject)xml_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 17461L)
    public static SubLObject xml_write_wXescaped_special_chars(final SubLObject string) {
        assert xml_utilities.NIL != Types.stringp(string) : string;
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = (end_var_$2 = Sequences.length(string)), i = (SubLObject)xml_utilities.NIL, i = (SubLObject)xml_utilities.ZERO_INTEGER; !i.numGE(end_var_$2); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (v_char.eql((SubLObject)Characters.CHAR_newline)) {
                xml_write_char(v_char);
            }
            else if (v_char.eql((SubLObject)Characters.CHAR_ampersand) && xml_utilities.NIL != possible_xml_entity_reference_p(string, i, (SubLObject)xml_utilities.UNPROVIDED)) {
                xml_write_char(v_char);
            }
            else if (xml_utilities.NIL != xml_special_charP(v_char)) {
                xml_write_string(xml_char_escaped_version(v_char), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            }
            else if (xml_utilities.NIL == valid_xml_char_p(v_char)) {
                xml_write_char((SubLObject)Characters.CHAR_space);
            }
            else {
                xml_write_char(v_char);
            }
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 17975L)
    public static SubLObject possible_xml_entity_reference_p(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == xml_utilities.UNPROVIDED) {
            start = (SubLObject)xml_utilities.ZERO_INTEGER;
        }
        if (end == xml_utilities.UNPROVIDED) {
            end = (SubLObject)xml_utilities.NIL;
        }
        if (Strings.sublisp_char(string, start).eql((SubLObject)Characters.CHAR_ampersand) && xml_utilities.NIL != list_utilities.lengthG(string, Numbers.add(start, (SubLObject)xml_utilities.TWO_INTEGER), (SubLObject)xml_utilities.UNPROVIDED) && xml_utilities.NIL != valid_xml_entity_name_first_char_p(Strings.sublisp_char(string, number_utilities.f_1X(start)))) {
            final SubLObject name_stream = streams_high.make_private_string_output_stream();
            print_high.princ(Strings.sublisp_char(string, number_utilities.f_1X(start)), name_stream);
            SubLObject end_var_$3;
            SubLObject end_var;
            SubLObject i;
            SubLObject v_char;
            for (end_var = (end_var_$3 = Sequences.length(string)), i = (SubLObject)xml_utilities.NIL, i = Numbers.add(start, (SubLObject)xml_utilities.TWO_INTEGER); !i.numGE(end_var_$3); i = number_utilities.f_1X(i)) {
                v_char = Strings.sublisp_char(string, i);
                if (v_char.eql((SubLObject)Characters.CHAR_semicolon)) {
                    return possible_xml_entity_name_p(streams_high.get_output_stream_string(name_stream));
                }
                if (end.isInteger() && i.numG(end)) {
                    return (SubLObject)xml_utilities.NIL;
                }
                if (xml_utilities.NIL == valid_xml_entity_name_char_p(v_char)) {
                    return (SubLObject)xml_utilities.NIL;
                }
                print_high.princ(v_char, name_stream);
            }
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 18636L)
    public static SubLObject possible_xml_entity_name_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (xml_utilities.NIL != misc_utilities.uninitialized_p(xml_vars.$xml_document_entity_names$.getDynamicValue(thread))) {
            return (SubLObject)xml_utilities.T;
        }
        if (xml_utilities.NIL != possible_xml_numeric_character_reference_p(string)) {
            return (SubLObject)xml_utilities.T;
        }
        if (xml_utilities.NIL != list_utilities.alist_has_keyP(xml_vars.$xml_predefined_entities$.getGlobalValue(), string, (SubLObject)xml_utilities.UNPROVIDED)) {
            return (SubLObject)xml_utilities.T;
        }
        return subl_promotions.memberP(string, xml_vars.$xml_document_entity_names$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)xml_utilities.EQUALP), (SubLObject)xml_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 18967L)
    public static SubLObject possible_xml_numeric_character_reference_p(final SubLObject string) {
        SubLObject possibleP = (SubLObject)xml_utilities.NIL;
        if (string_utilities.first_char(string).eql((SubLObject)Characters.CHAR_hash)) {
            if (xml_utilities.NIL == list_utilities.find_if_not((SubLObject)xml_utilities.$sym54$DIGIT_CHAR_P, string, Symbols.symbol_function((SubLObject)xml_utilities.IDENTITY), (SubLObject)xml_utilities.ONE_INTEGER, (SubLObject)xml_utilities.UNPROVIDED)) {
                possibleP = (SubLObject)xml_utilities.T;
            }
            else if (Strings.sublisp_char(string, (SubLObject)xml_utilities.ONE_INTEGER).eql((SubLObject)Characters.CHAR_x) && xml_utilities.NIL == list_utilities.find_if_not((SubLObject)xml_utilities.$sym55$HEX_CHAR_P, string, Symbols.symbol_function((SubLObject)xml_utilities.IDENTITY), (SubLObject)xml_utilities.TWO_INTEGER, (SubLObject)xml_utilities.UNPROVIDED)) {
                possibleP = (SubLObject)xml_utilities.T;
            }
        }
        return possibleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 19435L)
    public static SubLObject valid_xml_entity_name_first_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != Characters.alpha_char_p(v_char) || v_char.eql((SubLObject)Characters.CHAR_underbar) || v_char.eql((SubLObject)Characters.CHAR_colon));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 19566L)
    public static SubLObject valid_xml_entity_name_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_utilities.NIL != valid_xml_entity_name_first_char_p(v_char) || xml_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)xml_utilities.UNPROVIDED) || v_char.eql((SubLObject)Characters.CHAR_period) || v_char.eql((SubLObject)Characters.CHAR_hyphen));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 19836L)
    public static SubLObject with_xml_output_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = (SubLObject)xml_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list56);
        stream = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)xml_utilities.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym57$_XML_STREAM_, stream)), ConsesLow.append(body, (SubLObject)xml_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 20012L)
    public static SubLObject with_xml_output_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = (SubLObject)xml_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list58);
        string_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert xml_utilities.NIL != Types.symbolp(string_var) : string_var;
        final SubLObject stream = (SubLObject)xml_utilities.$sym60$STREAM;
        return (SubLObject)ConsesLow.list((SubLObject)xml_utilities.$sym61$CWITH_OUTPUT_TO_STRING, (SubLObject)ConsesLow.list(stream, string_var), (SubLObject)ConsesLow.listS((SubLObject)xml_utilities.$sym62$WITH_XML_OUTPUT_TO_STREAM, stream, ConsesLow.append(body, (SubLObject)xml_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 20401L)
    public static SubLObject generate_valid_xml_header(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_header(xml_version(), (SubLObject)xml_utilities.$str6$US_ASCII, (SubLObject)xml_utilities.NIL);
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 20713L)
    public static SubLObject generate_xml_header_entry_for_dtd(final SubLObject sysid, final SubLObject dtd, SubLObject stream) {
        if (stream == xml_utilities.UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        PrintLow.format(stream, (SubLObject)xml_utilities.$str65$__DOCTYPE__A_SYSTEM__S_, sysid, dtd);
        xml_terpri();
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 21047L)
    public static SubLObject resolve_xml_namespaces(final SubLObject token, final SubLObject stack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resolved = string_utilities.copy_string(token);
        SubLObject new_bindings = (SubLObject)xml_utilities.NIL;
        SubLObject current;
        final SubLObject datum = current = xml_parsing_utilities.parse_xml_token(token);
        SubLObject element_name = (SubLObject)xml_utilities.NIL;
        SubLObject attributes = (SubLObject)xml_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list66);
        element_name = current.first();
        current = (attributes = current.rest());
        if (xml_utilities.NIL != string_utilities.substringP((SubLObject)xml_utilities.$str67$xmlns_, token, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)) {
            SubLObject cdolist_list_var = attributes;
            SubLObject cons = (SubLObject)xml_utilities.NIL;
            cons = cdolist_list_var.first();
            while (xml_utilities.NIL != cdolist_list_var) {
                SubLObject current_$5;
                final SubLObject datum_$4 = current_$5 = cons;
                SubLObject attribute = (SubLObject)xml_utilities.NIL;
                SubLObject value = (SubLObject)xml_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)xml_utilities.$list68);
                attribute = current_$5.first();
                current_$5 = (value = current_$5.rest());
                if (xml_utilities.NIL != string_utilities.starts_with(attribute, (SubLObject)xml_utilities.$str67$xmlns_)) {
                    new_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(string_utilities.substring(attribute, (SubLObject)xml_utilities.SIX_INTEGER, Sequences.position((SubLObject)Characters.CHAR_equal, attribute, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)), value), new_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        final SubLObject resolved_element_name = maybe_resolve_xml_namespace(element_name, new_bindings, stack);
        SubLObject something_changedP = string_utilities.non_empty_string_p(resolved_element_name);
        final SubLObject new_element_name = (xml_utilities.NIL != resolved_element_name) ? resolved_element_name : element_name;
        SubLObject new_attributes = attributes;
        SubLObject cdolist_list_var2 = attributes;
        SubLObject cons2 = (SubLObject)xml_utilities.NIL;
        cons2 = cdolist_list_var2.first();
        while (xml_utilities.NIL != cdolist_list_var2) {
            SubLObject current_$6;
            final SubLObject datum_$5 = current_$6 = cons2;
            SubLObject key = (SubLObject)xml_utilities.NIL;
            SubLObject value2 = (SubLObject)xml_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)xml_utilities.$list69);
            key = current_$6.first();
            current_$6 = (value2 = current_$6.rest());
            final SubLObject new_value = maybe_resolve_xml_namespace(value2, new_bindings, stack);
            if (xml_utilities.NIL != new_value) {
                new_attributes = list_utilities.alist_enter(new_attributes, key, new_value, Symbols.symbol_function((SubLObject)xml_utilities.EQUAL));
                something_changedP = (SubLObject)xml_utilities.T;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons2 = cdolist_list_var2.first();
        }
        if (xml_utilities.NIL != something_changedP) {
            SubLObject stream = (SubLObject)xml_utilities.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    if (xml_utilities.NIL != xml_parsing_utilities.xml_opening_tag_p(token) || xml_utilities.NIL != xml_parsing_utilities.xml_empty_tagP(token)) {
                        xml_start_tag_internal(new_element_name, list_utilities.alist_to_plist(new_attributes), xml_parsing_utilities.xml_empty_tagP(token), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
                    }
                    else {
                        xml_end_tag_internal(new_element_name);
                    }
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                resolved = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)xml_utilities.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return Values.values(resolved, new_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 22395L)
    public static SubLObject maybe_resolve_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        return (SubLObject)((xml_utilities.NIL != Sequences.find((SubLObject)Characters.CHAR_colon, name, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED) && xml_utilities.NIL == string_utilities.starts_with(name, (SubLObject)xml_utilities.$str67$xmlns_) && xml_utilities.NIL == string_utilities.starts_with(name, (SubLObject)xml_utilities.$str70$xml_) && xml_utilities.NIL == string_utilities.starts_with(name, (SubLObject)xml_utilities.$str71$http_)) ? resolve_xml_namespace(name, new_bindings, stack) : xml_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 22670L)
    public static SubLObject resolve_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        final SubLObject namespace = xml_parsing_utilities.xml_prefixed_name_namespace(name);
        SubLObject expanded = list_utilities.alist_lookup_without_values(new_bindings, namespace, Symbols.symbol_function((SubLObject)xml_utilities.EQUAL), (SubLObject)xml_utilities.NIL);
        if (xml_utilities.NIL == expanded) {
            SubLObject csome_list_var = stack;
            SubLObject binding = (SubLObject)xml_utilities.NIL;
            binding = csome_list_var.first();
            while (xml_utilities.NIL == expanded && xml_utilities.NIL != csome_list_var) {
                if (binding.isCons() && namespace.equal(binding.first())) {
                    expanded = binding.rest();
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        if (xml_utilities.NIL == expanded) {
            Errors.error((SubLObject)xml_utilities.$str72$Couldn_t_resolve__S_based_on__S_a, name, new_bindings, stack);
        }
        return Sequences.cconcatenate(expanded, xml_parsing_utilities.xml_prefixed_name_local_name(name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 23256L)
    public static SubLObject xml_sexpr_output_as_xml(final SubLObject sexpr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sexpr.isString()) {
            xml_write_string(sexpr, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
        }
        else {
            final SubLObject atomicP = (SubLObject)xml_utilities.NIL;
            final SubLObject no_nested_elementsP = Types.sublisp_null(Sequences.find_if((SubLObject)xml_utilities.$sym73$LISTP, xml_parsing_utilities.xml_sexpr_daughters(sexpr, (SubLObject)xml_utilities.UNPROVIDED), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
            try {
                final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_start_tag_internal(xml_parsing_utilities.xml_sexpr_type(sexpr), xml_tag_attributes_from_sexpr(sexpr), atomicP, (SubLObject)xml_utilities.NIL, (SubLObject)xml_utilities.$kw74$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)xml_utilities.$kw74$UNINITIALIZED, thread);
                        xml_sexpr_output_daughters(sexpr, (SubLObject)xml_utilities.UNPROVIDED);
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (xml_utilities.NIL == atomicP) {
                        if (xml_utilities.NIL == no_nested_elementsP) {
                            xml_terpri();
                        }
                        xml_end_tag_internal(xml_parsing_utilities.xml_sexpr_type(sexpr));
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 23774L)
    public static SubLObject xml_sexpr_output_daughters(final SubLObject sexpr, SubLObject tag) {
        if (tag == xml_utilities.UNPROVIDED) {
            tag = (SubLObject)xml_utilities.NIL;
        }
        final SubLObject dtrs = xml_parsing_utilities.xml_sexpr_daughters(sexpr, tag);
        SubLObject list_var = (SubLObject)xml_utilities.NIL;
        SubLObject dtr_sexpr = (SubLObject)xml_utilities.NIL;
        SubLObject dtr_num = (SubLObject)xml_utilities.NIL;
        list_var = dtrs;
        dtr_sexpr = list_var.first();
        for (dtr_num = (SubLObject)xml_utilities.ZERO_INTEGER; xml_utilities.NIL != list_var; list_var = list_var.rest(), dtr_sexpr = list_var.first(), dtr_num = Numbers.add((SubLObject)xml_utilities.ONE_INTEGER, dtr_num)) {
            xml_sexpr_output_as_xml(dtr_sexpr);
            if (!dtr_sexpr.isString() && xml_utilities.NIL == list_utilities.lengthE(dtrs, number_utilities.f_1X(dtr_num), (SubLObject)xml_utilities.UNPROVIDED)) {
                xml_terpri();
            }
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24141L)
    public static SubLObject xml_tag_attributes_from_sexpr(final SubLObject sexpr) {
        return list_utilities.alist_to_plist(xml_parsing_utilities.xml_sexpr_attributes(sexpr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24481L)
    public static SubLObject alists_sort_key(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(alist, xml_utilities.$alists_sort_key$.getDynamicValue(thread), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24571L)
    public static SubLObject attribute_vars(final SubLObject attributes) {
        SubLObject attribute_vars = (SubLObject)xml_utilities.NIL;
        SubLObject grouping_key_pairs = (SubLObject)xml_utilities.NIL;
        SubLObject remainder;
        SubLObject attribute_name;
        SubLObject attribute_var;
        for (remainder = (SubLObject)xml_utilities.NIL, remainder = attributes; xml_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            attribute_name = remainder.first();
            attribute_var = conses_high.cadr(remainder);
            if (attribute_var.isString()) {
                grouping_key_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(attribute_var, attribute_var), grouping_key_pairs);
            }
            attribute_vars = (SubLObject)ConsesLow.cons(attribute_var, attribute_vars);
        }
        return Values.values(attribute_vars, grouping_key_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24969L)
    public static SubLObject sort_query_results_on_el_var(final SubLObject alists, final SubLObject sort_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)xml_utilities.NIL;
        final SubLObject _prev_bind_0 = xml_utilities.$alists_sort_key$.currentBinding(thread);
        try {
            xml_utilities.$alists_sort_key$.bind(sort_key, thread);
            results = Sort.sort(conses_high.copy_list(alists), Symbols.symbol_function((SubLObject)xml_utilities.$sym75$TERM___WITH_CONSTANT_BY_NAME), (SubLObject)xml_utilities.$sym76$ALISTS_SORT_KEY);
        }
        finally {
            xml_utilities.$alists_sort_key$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 25216L)
    public static SubLObject write_xml_from_grouped_bindings(final SubLObject grouped_bindings, final SubLObject xml_spec, final SubLObject indent_num, final SubLObject output_stream, final SubLObject cycl_prefixP) {
        final SubLObject name = conses_high.getf(xml_spec, (SubLObject)xml_utilities.$kw77$NAME, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject attributes = conses_high.getf(xml_spec, (SubLObject)xml_utilities.$kw78$ATTRIBUTES, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject elements = conses_high.getf(xml_spec, (SubLObject)xml_utilities.$kw79$ELEMENTS, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject text = conses_high.getf(xml_spec, (SubLObject)xml_utilities.$kw80$TEXT, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject attribute_vars = attribute_vars(attributes);
        SubLObject cdolist_list_var = grouped_bindings;
        SubLObject cons = (SubLObject)xml_utilities.NIL;
        cons = cdolist_list_var.first();
        while (xml_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject grouping_key_tuples = (SubLObject)xml_utilities.NIL;
            SubLObject other_bindings = (SubLObject)xml_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_utilities.$list81);
            grouping_key_tuples = current.first();
            current = (other_bindings = current.rest());
            string_utilities.indent(output_stream, indent_num);
            PrintLow.format(output_stream, (SubLObject)xml_utilities.$str82$__A, name);
            if (grouping_key_tuples.isList()) {
                SubLObject cdolist_list_var_$9 = attribute_vars;
                SubLObject attribute_var = (SubLObject)xml_utilities.NIL;
                attribute_var = cdolist_list_var_$9.first();
                while (xml_utilities.NIL != cdolist_list_var_$9) {
                    SubLObject value = format_nil.format_nil_a(list_utilities.alist_lookup(grouping_key_tuples, attribute_var, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
                    if (xml_utilities.NIL == cycl_prefixP) {
                        value = string_utilities.remove_substring(value, (SubLObject)xml_utilities.$str83$__);
                    }
                    PrintLow.format(output_stream, (SubLObject)xml_utilities.$str84$__A__A, conses_high.getf(Sequences.reverse(attributes), attribute_var, (SubLObject)xml_utilities.UNPROVIDED), string_utilities.quote_string(value, (SubLObject)xml_utilities.UNPROVIDED));
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    attribute_var = cdolist_list_var_$9.first();
                }
            }
            if (xml_utilities.NIL != elements || xml_utilities.NIL != text) {
                PrintLow.format(output_stream, (SubLObject)xml_utilities.$str85$___);
                if (xml_utilities.NIL != text) {
                    string_utilities.indent(output_stream, indent_num);
                    SubLObject value2 = format_nil.format_nil_a(list_utilities.alist_lookup(grouping_key_tuples, text, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED));
                    if (xml_utilities.NIL == cycl_prefixP) {
                        value2 = string_utilities.remove_substring(value2, (SubLObject)xml_utilities.$str83$__);
                    }
                    PrintLow.format(output_stream, (SubLObject)xml_utilities.$str86$_A__, value2);
                }
                if (xml_utilities.NIL != other_bindings) {
                    SubLObject cdolist_list_var_$10 = elements;
                    SubLObject element = (SubLObject)xml_utilities.NIL;
                    element = cdolist_list_var_$10.first();
                    while (xml_utilities.NIL != cdolist_list_var_$10) {
                        query_bindings_to_xml(other_bindings, element, Numbers.add(indent_num, (SubLObject)xml_utilities.TWO_INTEGER), output_stream, cycl_prefixP);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        element = cdolist_list_var_$10.first();
                    }
                }
                string_utilities.indent(output_stream, indent_num);
                PrintLow.format(output_stream, (SubLObject)xml_utilities.$str87$___A___, name);
            }
            else {
                PrintLow.format(output_stream, (SubLObject)xml_utilities.$str88$____);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)xml_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 26743L)
    public static SubLObject query_bindings_to_xml(final SubLObject query_bindings, final SubLObject query_result_xml_spec, final SubLObject indent_num, final SubLObject output_stream, final SubLObject cycl_prefixP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_results = query_bindings;
        final SubLObject attributes = conses_high.getf(query_result_xml_spec, (SubLObject)xml_utilities.$kw78$ATTRIBUTES, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject text = conses_high.getf(query_result_xml_spec, (SubLObject)xml_utilities.$kw80$TEXT, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject sort_asc = conses_high.getf(query_result_xml_spec, (SubLObject)xml_utilities.$kw89$SORT_ASC, (SubLObject)xml_utilities.UNPROVIDED);
        final SubLObject sort_desc = conses_high.getf(query_result_xml_spec, (SubLObject)xml_utilities.$kw90$SORT_DESC, (SubLObject)xml_utilities.UNPROVIDED);
        SubLObject count = (SubLObject)xml_utilities.ZERO_INTEGER;
        SubLObject attribute_vars = (SubLObject)xml_utilities.NIL;
        SubLObject initial_grouping_key_tuples = (SubLObject)xml_utilities.NIL;
        SubLObject grouping_keys = (SubLObject)xml_utilities.NIL;
        SubLObject other_bindings_by_el_value_tuples = (SubLObject)xml_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject attribute_vars_$11 = attribute_vars(attributes);
        final SubLObject initial_grouping_key_tuples_$12 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        attribute_vars = attribute_vars_$11;
        initial_grouping_key_tuples = initial_grouping_key_tuples_$12;
        grouping_keys = attribute_vars;
        if (xml_utilities.NIL != sort_asc) {
            query_results = Sequences.reverse(sort_query_results_on_el_var(query_bindings, sort_asc));
        }
        else if (xml_utilities.NIL != sort_desc) {
            query_results = sort_query_results_on_el_var(query_bindings, sort_desc);
        }
        if (xml_utilities.NIL != text) {
            if (text.isString()) {
                initial_grouping_key_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(text, text), initial_grouping_key_tuples);
            }
            grouping_keys = (SubLObject)ConsesLow.cons(text, grouping_keys);
        }
        SubLObject cdolist_list_var = query_results;
        SubLObject query_result = (SubLObject)xml_utilities.NIL;
        query_result = cdolist_list_var.first();
        while (xml_utilities.NIL != cdolist_list_var) {
            if (xml_utilities.NIL != grouping_keys) {
                SubLObject grouping_key_tuples = initial_grouping_key_tuples;
                SubLObject cdolist_list_var_$13 = query_result;
                SubLObject binding = (SubLObject)xml_utilities.NIL;
                binding = cdolist_list_var_$13.first();
                while (xml_utilities.NIL != cdolist_list_var_$13) {
                    final SubLObject el_var = binding.first();
                    if (xml_utilities.NIL != list_utilities.member_eqP(el_var, grouping_keys)) {
                        grouping_key_tuples = (SubLObject)ConsesLow.cons(binding, grouping_key_tuples);
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    binding = cdolist_list_var_$13.first();
                }
                other_bindings_by_el_value_tuples = list_utilities.alist_push(other_bindings_by_el_value_tuples, grouping_key_tuples, query_result, Symbols.symbol_function((SubLObject)xml_utilities.EQUAL));
            }
            else {
                other_bindings_by_el_value_tuples = list_utilities.alist_push(other_bindings_by_el_value_tuples, count, query_result, Symbols.symbol_function((SubLObject)xml_utilities.EQUAL));
                count = number_utilities.f_1X(count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_result = cdolist_list_var.first();
        }
        write_xml_from_grouped_bindings(other_bindings_by_el_value_tuples, query_result_xml_spec, indent_num, output_stream, cycl_prefixP);
        return (SubLObject)xml_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 28639L)
    public static SubLObject get_default_xml_spec_for_el_vars(final SubLObject el_vars) {
        SubLObject xml_spec = Sequences.copy_seq((SubLObject)xml_utilities.$str91$__name__binding___elements__);
        SubLObject cdolist_list_var = el_vars;
        SubLObject el_var = (SubLObject)xml_utilities.NIL;
        el_var = cdolist_list_var.first();
        while (xml_utilities.NIL != cdolist_list_var) {
            xml_spec = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(xml_spec), new SubLObject[] { xml_utilities.$str92$__name__, format_nil.format_nil_a_no_copy(Strings.string_downcase(cycl_variables.el_var_name_without_prefix(el_var), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)), xml_utilities.$str93$___text_, format_nil.format_nil_a_no_copy(el_var), xml_utilities.$str94$__ });
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        }
        xml_spec = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(xml_spec), (SubLObject)xml_utilities.$str95$__);
        return reader.read_from_string(xml_spec, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 29061L)
    public static SubLObject query_bindings_to_xml_stream(final SubLObject el_bindings, final SubLObject xml_spec, final SubLObject indent_num, final SubLObject stream, SubLObject cycl_prefixP) {
        if (cycl_prefixP == xml_utilities.UNPROVIDED) {
            cycl_prefixP = (SubLObject)xml_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_header((SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            xml_start_tag_internal((SubLObject)xml_utilities.$str96$root, (SubLObject)xml_utilities.NIL, (SubLObject)xml_utilities.NIL, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            xml_terpri();
            query_bindings_to_xml(el_bindings, xml_spec, indent_num, stream, cycl_prefixP);
            xml_end_tag_internal((SubLObject)xml_utilities.$str96$root);
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 29437L)
    public static SubLObject query_results_to_xml_stream(final SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec, SubLObject stream) {
        if (query_mt == xml_utilities.UNPROVIDED) {
            query_mt = (SubLObject)xml_utilities.NIL;
        }
        if (query_properties == xml_utilities.UNPROVIDED) {
            query_properties = (SubLObject)xml_utilities.NIL;
        }
        if (xml_spec == xml_utilities.UNPROVIDED) {
            xml_spec = (SubLObject)xml_utilities.$kw98$DEFAULT;
        }
        if (stream == xml_utilities.UNPROVIDED) {
            stream = (SubLObject)xml_utilities.T;
        }
        if (xml_spec.equal((SubLObject)xml_utilities.$kw98$DEFAULT)) {
            final SubLObject free_el_vars = el_utilities.sentence_free_variables(query_sent, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            xml_spec = get_default_xml_spec_for_el_vars(free_el_vars);
        }
        final SubLObject el_bindings = inference_kernel.new_cyc_query(query_sent, query_mt, query_properties);
        query_bindings_to_xml_stream(el_bindings, xml_spec, (SubLObject)xml_utilities.TWO_INTEGER, stream, (SubLObject)xml_utilities.UNPROVIDED);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 29921L)
    public static SubLObject download_xml_url(final SubLObject url, SubLObject source_file, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (source_file == xml_utilities.UNPROVIDED) {
            source_file = (SubLObject)xml_utilities.NIL;
        }
        if (accept_types == xml_utilities.UNPROVIDED) {
            accept_types = (SubLObject)xml_utilities.$list99;
        }
        if (follow_redirectsP == xml_utilities.UNPROVIDED) {
            follow_redirectsP = (SubLObject)xml_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert xml_utilities.NIL != web_utilities.url_p(url) : url;
        if (xml_utilities.NIL == source_file) {
            source_file = file_utilities.make_unused_temp_filename((SubLObject)xml_utilities.UNPROVIDED);
        }
        SubLObject error_message = web_utilities.save_url_to_file(url, source_file, accept_types, follow_redirectsP);
        if (xml_utilities.NIL == error_message) {
            SubLObject stream = (SubLObject)xml_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)xml_utilities.NIL, thread);
                    stream = compatibility.open_text(source_file, (SubLObject)xml_utilities.$kw101$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)xml_utilities.$str102$Unable_to_open__S, source_file);
                }
                final SubLObject s = stream;
                if (streams_high.file_length(s).numL((SubLObject)xml_utilities.$int103$2000)) {
                    final SubLObject contents = string_utilities.read_string_from_file(source_file, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
                    if (xml_utilities.NIL != Sequences.search((SubLObject)xml_utilities.$str104$404, contents, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED) && xml_utilities.NIL != Sequences.search((SubLObject)xml_utilities.$str105$Not_Found, contents, Symbols.symbol_function((SubLObject)xml_utilities.EQUALP), (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)) {
                        error_message = (SubLObject)xml_utilities.$str106$Url_not_found_;
                    }
                    else if (xml_utilities.NIL != Sequences.search((SubLObject)xml_utilities.$str107$503_Service_Temporarily_Unavailab, contents, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED)) {
                        error_message = (SubLObject)xml_utilities.$str108$Server_not_available;
                    }
                    else if (xml_utilities.NIL == string_utilities.starts_with_by_test(contents, (SubLObject)xml_utilities.$str109$__xml, Symbols.symbol_function((SubLObject)xml_utilities.EQUALP))) {
                        final SubLObject snippet_end = Numbers.min((SubLObject)xml_utilities.FIFTEEN_INTEGER, Sequences.length(contents));
                        final SubLObject snippet = string_utilities.substring(contents, (SubLObject)xml_utilities.ZERO_INTEGER, snippet_end);
                        error_message = Sequences.cconcatenate((SubLObject)xml_utilities.$str110$Not_XML_document__Starts_with_, format_nil.format_nil_s_no_copy(snippet));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)xml_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        if (xml_utilities.NIL != error_message) {
            Errors.error((SubLObject)xml_utilities.$str111$Encountered_error_trying_to_downl, url, error_message);
        }
        return source_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 31066L)
    public static SubLObject query_results_to_xml_file(final SubLObject query_sent, final SubLObject file, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec) {
        if (query_mt == xml_utilities.UNPROVIDED) {
            query_mt = (SubLObject)xml_utilities.NIL;
        }
        if (query_properties == xml_utilities.UNPROVIDED) {
            query_properties = (SubLObject)xml_utilities.NIL;
        }
        if (xml_spec == xml_utilities.UNPROVIDED) {
            xml_spec = (SubLObject)xml_utilities.$kw98$DEFAULT;
        }
        SubLObject stream = (SubLObject)xml_utilities.NIL;
        try {
            stream = compatibility.open_text(file, (SubLObject)xml_utilities.$kw113$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)xml_utilities.$str102$Unable_to_open__S, file);
            }
            final SubLObject s_out = stream;
            query_results_to_xml_stream(query_sent, query_mt, query_properties, xml_spec, s_out);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)xml_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)xml_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 31358L)
    public static SubLObject query_results_to_xml_string(final SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec) {
        if (query_mt == xml_utilities.UNPROVIDED) {
            query_mt = (SubLObject)xml_utilities.NIL;
        }
        if (query_properties == xml_utilities.UNPROVIDED) {
            query_properties = (SubLObject)xml_utilities.NIL;
        }
        if (xml_spec == xml_utilities.UNPROVIDED) {
            xml_spec = (SubLObject)xml_utilities.$kw98$DEFAULT;
        }
        if (xml_spec.equal((SubLObject)xml_utilities.$kw98$DEFAULT)) {
            final SubLObject free_el_vars = el_utilities.sentence_free_variables(query_sent, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED, (SubLObject)xml_utilities.UNPROVIDED);
            xml_spec = get_default_xml_spec_for_el_vars(free_el_vars);
        }
        final SubLObject el_bindings = inference_kernel.new_cyc_query(query_sent, query_mt, query_properties);
        SubLObject xml_string = (SubLObject)xml_utilities.NIL;
        SubLObject stream = (SubLObject)xml_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            query_bindings_to_xml_stream(el_bindings, xml_spec, (SubLObject)xml_utilities.TWO_INTEGER, stream, (SubLObject)xml_utilities.UNPROVIDED);
            xml_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)xml_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)xml_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return xml_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 31899L)
    public static SubLObject boolean_to_trueXfalse_string(final SubLObject v_boolean) {
        return (SubLObject)((xml_utilities.NIL != v_boolean) ? xml_utilities.$str115$true : xml_utilities.$str116$false);
    }
    
    public static SubLObject declare_xml_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_version", "XML-VERSION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_add_indentation", "XML-ADD-INDENTATION", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_utilities", "with_xml_indentation", "WITH-XML-INDENTATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_terpri", "XML-TERPRI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_write_string", "XML-WRITE-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_write_char", "XML-WRITE-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_write_string_indented", "XML-WRITE-STRING-INDENTED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_header", "XML-HEADER", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_cdata_prefix", "XML-CDATA-PREFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_cdata_suffix", "XML-CDATA-SUFFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_cdata", "XML-CDATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_markup", "XML-MARKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_comment", "XML-COMMENT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_utilities", "xml_tag", "XML-TAG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_end_tag_internal", "XML-END-TAG-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_print", "XML-PRINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_prin1", "XML-PRIN1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_print_line", "XML-PRINT-LINE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_prin1_line", "XML-PRIN1-LINE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_write", "XML-WRITE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_write_line", "XML-WRITE-LINE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_name_p", "VALID-XML-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "remove_invalid_xml_name_chars", "REMOVE-INVALID-XML-NAME-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_ascii_xml_name_p", "VALID-ASCII-XML-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_name_initial_char_p", "VALID-XML-NAME-INITIAL-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_name_initial_char_code_p", "VALID-XML-NAME-INITIAL-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_non_ascii_xml_name_p", "VALID-NON-ASCII-XML-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_name_char_p", "VALID-XML-NAME-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "remove_invalid_xml_name_chars_from_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-ASCII-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "remove_invalid_xml_name_chars_from_non_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-NON-ASCII-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_name_char_code_p", "VALID-XML-NAME-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "digit_char_code_p", "DIGIT-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_letter_char_p", "XML-LETTER-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_letter_char_code_p", "XML-LETTER-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_base_char_p", "XML-BASE-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_base_char_code_p", "XML-BASE-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_ideographic_char_p", "XML-IDEOGRAPHIC-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_ideographic_char_code_p", "XML-IDEOGRAPHIC-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_char_p", "VALID-XML-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_char_code_p", "VALID-XML-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "char_in_ranges_p", "CHAR-IN-RANGES-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "char_code_in_ranges_p", "CHAR-CODE-IN-RANGES-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_special_charP", "XML-SPECIAL-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_char_escaped_version", "XML-CHAR-ESCAPED-VERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_unescape_string", "XML-UNESCAPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_write_wXescaped_special_chars", "XML-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "possible_xml_entity_reference_p", "POSSIBLE-XML-ENTITY-REFERENCE-P", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "possible_xml_entity_name_p", "POSSIBLE-XML-ENTITY-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "possible_xml_numeric_character_reference_p", "POSSIBLE-XML-NUMERIC-CHARACTER-REFERENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_entity_name_first_char_p", "VALID-XML-ENTITY-NAME-FIRST-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "valid_xml_entity_name_char_p", "VALID-XML-ENTITY-NAME-CHAR-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_utilities", "with_xml_output_to_stream", "WITH-XML-OUTPUT-TO-STREAM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_utilities", "with_xml_output_to_string", "WITH-XML-OUTPUT-TO-STRING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "generate_valid_xml_header", "GENERATE-VALID-XML-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "resolve_xml_namespaces", "RESOLVE-XML-NAMESPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "maybe_resolve_xml_namespace", "MAYBE-RESOLVE-XML-NAMESPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "resolve_xml_namespace", "RESOLVE-XML-NAMESPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_sexpr_output_as_xml", "XML-SEXPR-OUTPUT-AS-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_sexpr_output_daughters", "XML-SEXPR-OUTPUT-DAUGHTERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "xml_tag_attributes_from_sexpr", "XML-TAG-ATTRIBUTES-FROM-SEXPR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "alists_sort_key", "ALISTS-SORT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "attribute_vars", "ATTRIBUTE-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "sort_query_results_on_el_var", "SORT-QUERY-RESULTS-ON-EL-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "write_xml_from_grouped_bindings", "WRITE-XML-FROM-GROUPED-BINDINGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "query_bindings_to_xml", "QUERY-BINDINGS-TO-XML", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "get_default_xml_spec_for_el_vars", "GET-DEFAULT-XML-SPEC-FOR-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "query_bindings_to_xml_stream", "QUERY-BINDINGS-TO-XML-STREAM", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "query_results_to_xml_stream", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "download_xml_url", "DOWNLOAD-XML-URL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "query_results_to_xml_file", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "query_results_to_xml_string", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_utilities", "boolean_to_trueXfalse_string", "BOOLEAN-TO-TRUE/FALSE-STRING", 1, 0, false);
        return (SubLObject)xml_utilities.NIL;
    }
    
    public static SubLObject init_xml_utilities_file() {
        xml_utilities.$xml_version$ = SubLFiles.defparameter("*XML-VERSION*", (SubLObject)xml_utilities.$float0$1_0);
        xml_utilities.$xml_indentation_level$ = SubLFiles.defparameter("*XML-INDENTATION-LEVEL*", (SubLObject)xml_utilities.ZERO_INTEGER);
        xml_utilities.$xml_indentation_amount$ = SubLFiles.defparameter("*XML-INDENTATION-AMOUNT*", (SubLObject)xml_utilities.ONE_INTEGER);
        xml_utilities.$cycml_indent_level$ = SubLFiles.defparameter("*CYCML-INDENT-LEVEL*", (SubLObject)xml_utilities.ZERO_INTEGER);
        xml_utilities.$xml_cdata_prefix$ = SubLFiles.deflexical("*XML-CDATA-PREFIX*", (SubLObject)xml_utilities.$str17$___CDATA_);
        xml_utilities.$xml_cdata_suffix$ = SubLFiles.deflexical("*XML-CDATA-SUFFIX*", (SubLObject)xml_utilities.$str18$___);
        xml_utilities.$xml_base_char_code_ranges$ = SubLFiles.deflexical("*XML-BASE-CHAR-CODE-RANGES*", xml_utilities.$list38);
        xml_utilities.$xml_ideographic_char_code_ranges$ = SubLFiles.deflexical("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", (SubLObject)xml_utilities.$list39);
        xml_utilities.$xml_special_chars$ = SubLFiles.defconstant("*XML-SPECIAL-CHARS*", (SubLObject)xml_utilities.$list41);
        xml_utilities.$alists_sort_key$ = SubLFiles.defparameter("*ALISTS-SORT-KEY*", (SubLObject)xml_utilities.NIL);
        return (SubLObject)xml_utilities.NIL;
    }
    
    public static SubLObject setup_xml_utilities_file() {
        access_macros.define_obsolete_register((SubLObject)xml_utilities.$sym63$GENERATE_VALID_XML_HEADER, (SubLObject)xml_utilities.$list64);
        access_macros.register_external_symbol((SubLObject)xml_utilities.$sym97$QUERY_RESULTS_TO_XML_STREAM);
        access_macros.register_external_symbol((SubLObject)xml_utilities.$sym112$QUERY_RESULTS_TO_XML_FILE);
        access_macros.register_external_symbol((SubLObject)xml_utilities.$sym114$QUERY_RESULTS_TO_XML_STRING);
        return (SubLObject)xml_utilities.NIL;
    }
    
    private static SubLObject _constant_38_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(65), (SubLObject)SubLObjectFactory.makeInteger(90)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(97), (SubLObject)SubLObjectFactory.makeInteger(122)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(192), (SubLObject)SubLObjectFactory.makeInteger(214)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(216), (SubLObject)SubLObjectFactory.makeInteger(246)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(248), (SubLObject)SubLObjectFactory.makeInteger(255)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(256), (SubLObject)SubLObjectFactory.makeInteger(305)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(308), (SubLObject)SubLObjectFactory.makeInteger(318)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(321), (SubLObject)SubLObjectFactory.makeInteger(328)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(330), (SubLObject)SubLObjectFactory.makeInteger(382)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(384), (SubLObject)SubLObjectFactory.makeInteger(451)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(461), (SubLObject)SubLObjectFactory.makeInteger(496)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(500), (SubLObject)SubLObjectFactory.makeInteger(501)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(506), (SubLObject)SubLObjectFactory.makeInteger(535)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(592), (SubLObject)SubLObjectFactory.makeInteger(680)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(699), (SubLObject)SubLObjectFactory.makeInteger(705)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(902), (SubLObject)SubLObjectFactory.makeInteger(902)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(904), (SubLObject)SubLObjectFactory.makeInteger(906)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(908), (SubLObject)SubLObjectFactory.makeInteger(908)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(910), (SubLObject)SubLObjectFactory.makeInteger(929)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(931), (SubLObject)SubLObjectFactory.makeInteger(974)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(976), (SubLObject)SubLObjectFactory.makeInteger(982)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(986), (SubLObject)SubLObjectFactory.makeInteger(986)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(988), (SubLObject)SubLObjectFactory.makeInteger(988)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(990), (SubLObject)SubLObjectFactory.makeInteger(990)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(992), (SubLObject)SubLObjectFactory.makeInteger(992)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(994), (SubLObject)SubLObjectFactory.makeInteger(1011)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1025), (SubLObject)SubLObjectFactory.makeInteger(1036)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1038), (SubLObject)SubLObjectFactory.makeInteger(1103)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1105), (SubLObject)SubLObjectFactory.makeInteger(1116)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1118), (SubLObject)SubLObjectFactory.makeInteger(1153)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1168), (SubLObject)SubLObjectFactory.makeInteger(1220)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1223), (SubLObject)SubLObjectFactory.makeInteger(1224)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1227), (SubLObject)SubLObjectFactory.makeInteger(1228)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1232), (SubLObject)SubLObjectFactory.makeInteger(1259)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1262), (SubLObject)SubLObjectFactory.makeInteger(1269)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1272), (SubLObject)SubLObjectFactory.makeInteger(1273)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1329), (SubLObject)SubLObjectFactory.makeInteger(1366)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1369), (SubLObject)SubLObjectFactory.makeInteger(1369)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1377), (SubLObject)SubLObjectFactory.makeInteger(1414)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1488), (SubLObject)SubLObjectFactory.makeInteger(1514)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1520), (SubLObject)SubLObjectFactory.makeInteger(1522)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1569), (SubLObject)SubLObjectFactory.makeInteger(1594)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1601), (SubLObject)SubLObjectFactory.makeInteger(1610)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1649), (SubLObject)SubLObjectFactory.makeInteger(1719)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1722), (SubLObject)SubLObjectFactory.makeInteger(1726)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1728), (SubLObject)SubLObjectFactory.makeInteger(1742)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1744), (SubLObject)SubLObjectFactory.makeInteger(1747)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1749), (SubLObject)SubLObjectFactory.makeInteger(1749)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(1765), (SubLObject)SubLObjectFactory.makeInteger(1766)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2309), (SubLObject)SubLObjectFactory.makeInteger(2361)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2365), (SubLObject)SubLObjectFactory.makeInteger(2365)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2392), (SubLObject)SubLObjectFactory.makeInteger(2401)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2437), (SubLObject)SubLObjectFactory.makeInteger(2444)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2447), (SubLObject)SubLObjectFactory.makeInteger(2448)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2451), (SubLObject)SubLObjectFactory.makeInteger(2472)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2474), (SubLObject)SubLObjectFactory.makeInteger(2480)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2482), (SubLObject)SubLObjectFactory.makeInteger(2482)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2486), (SubLObject)SubLObjectFactory.makeInteger(2489)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2524), (SubLObject)SubLObjectFactory.makeInteger(2525)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2527), (SubLObject)SubLObjectFactory.makeInteger(2529)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2544), (SubLObject)SubLObjectFactory.makeInteger(2545)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2565), (SubLObject)SubLObjectFactory.makeInteger(2570)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2575), (SubLObject)SubLObjectFactory.makeInteger(2576)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2579), (SubLObject)SubLObjectFactory.makeInteger(2600)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2602), (SubLObject)SubLObjectFactory.makeInteger(2608)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2610), (SubLObject)SubLObjectFactory.makeInteger(2611)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2613), (SubLObject)SubLObjectFactory.makeInteger(2614)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2616), (SubLObject)SubLObjectFactory.makeInteger(2617)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2649), (SubLObject)SubLObjectFactory.makeInteger(2652)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2654), (SubLObject)SubLObjectFactory.makeInteger(2654)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2674), (SubLObject)SubLObjectFactory.makeInteger(2676)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2693), (SubLObject)SubLObjectFactory.makeInteger(2699)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2701), (SubLObject)SubLObjectFactory.makeInteger(2701)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2703), (SubLObject)SubLObjectFactory.makeInteger(2705)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2707), (SubLObject)SubLObjectFactory.makeInteger(2728)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2730), (SubLObject)SubLObjectFactory.makeInteger(2736)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2738), (SubLObject)SubLObjectFactory.makeInteger(2739)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2741), (SubLObject)SubLObjectFactory.makeInteger(2745)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2749), (SubLObject)SubLObjectFactory.makeInteger(2749)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2784), (SubLObject)SubLObjectFactory.makeInteger(2784)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2821), (SubLObject)SubLObjectFactory.makeInteger(2828)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2831), (SubLObject)SubLObjectFactory.makeInteger(2832)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2835), (SubLObject)SubLObjectFactory.makeInteger(2856)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2858), (SubLObject)SubLObjectFactory.makeInteger(2864)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2866), (SubLObject)SubLObjectFactory.makeInteger(2867)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2870), (SubLObject)SubLObjectFactory.makeInteger(2873)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2877), (SubLObject)SubLObjectFactory.makeInteger(2877)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2908), (SubLObject)SubLObjectFactory.makeInteger(2909)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2911), (SubLObject)SubLObjectFactory.makeInteger(2913)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2949), (SubLObject)SubLObjectFactory.makeInteger(2954)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2958), (SubLObject)SubLObjectFactory.makeInteger(2960)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2962), (SubLObject)SubLObjectFactory.makeInteger(2965)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2969), (SubLObject)SubLObjectFactory.makeInteger(2970)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2972), (SubLObject)SubLObjectFactory.makeInteger(2972)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2974), (SubLObject)SubLObjectFactory.makeInteger(2975)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2979), (SubLObject)SubLObjectFactory.makeInteger(2980)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2984), (SubLObject)SubLObjectFactory.makeInteger(2986)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2990), (SubLObject)SubLObjectFactory.makeInteger(2997)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(2999), (SubLObject)SubLObjectFactory.makeInteger(3001)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3077), (SubLObject)SubLObjectFactory.makeInteger(3084)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3086), (SubLObject)SubLObjectFactory.makeInteger(3088)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3090), (SubLObject)SubLObjectFactory.makeInteger(3112)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3114), (SubLObject)SubLObjectFactory.makeInteger(3123)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3125), (SubLObject)SubLObjectFactory.makeInteger(3129)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3168), (SubLObject)SubLObjectFactory.makeInteger(3169)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3205), (SubLObject)SubLObjectFactory.makeInteger(3212)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3214), (SubLObject)SubLObjectFactory.makeInteger(3216)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3218), (SubLObject)SubLObjectFactory.makeInteger(3240)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3242), (SubLObject)SubLObjectFactory.makeInteger(3251)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3253), (SubLObject)SubLObjectFactory.makeInteger(3257)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3294), (SubLObject)SubLObjectFactory.makeInteger(3294)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3296), (SubLObject)SubLObjectFactory.makeInteger(3297)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3333), (SubLObject)SubLObjectFactory.makeInteger(3340)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3342), (SubLObject)SubLObjectFactory.makeInteger(3344)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3346), (SubLObject)SubLObjectFactory.makeInteger(3368)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3370), (SubLObject)SubLObjectFactory.makeInteger(3385)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3424), (SubLObject)SubLObjectFactory.makeInteger(3425)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3585), (SubLObject)SubLObjectFactory.makeInteger(3630)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3632), (SubLObject)SubLObjectFactory.makeInteger(3632)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3634), (SubLObject)SubLObjectFactory.makeInteger(3635)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3648), (SubLObject)SubLObjectFactory.makeInteger(3653)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3713), (SubLObject)SubLObjectFactory.makeInteger(3714)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3716), (SubLObject)SubLObjectFactory.makeInteger(3716)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3719), (SubLObject)SubLObjectFactory.makeInteger(3720)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3722), (SubLObject)SubLObjectFactory.makeInteger(3722)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3725), (SubLObject)SubLObjectFactory.makeInteger(3725)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3732), (SubLObject)SubLObjectFactory.makeInteger(3735)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3737), (SubLObject)SubLObjectFactory.makeInteger(3743)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3745), (SubLObject)SubLObjectFactory.makeInteger(3747)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3749), (SubLObject)SubLObjectFactory.makeInteger(3749)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3751), (SubLObject)SubLObjectFactory.makeInteger(3751)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3754), (SubLObject)SubLObjectFactory.makeInteger(3755)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3757), (SubLObject)SubLObjectFactory.makeInteger(3758)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3760), (SubLObject)SubLObjectFactory.makeInteger(3760)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3762), (SubLObject)SubLObjectFactory.makeInteger(3763)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3773), (SubLObject)SubLObjectFactory.makeInteger(3773)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3776), (SubLObject)SubLObjectFactory.makeInteger(3780)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3904), (SubLObject)SubLObjectFactory.makeInteger(3911)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(3913), (SubLObject)SubLObjectFactory.makeInteger(3945)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4256), (SubLObject)SubLObjectFactory.makeInteger(4293)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4304), (SubLObject)SubLObjectFactory.makeInteger(4342)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4352), (SubLObject)SubLObjectFactory.makeInteger(4352)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4354), (SubLObject)SubLObjectFactory.makeInteger(4355)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4357), (SubLObject)SubLObjectFactory.makeInteger(4359)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4361), (SubLObject)SubLObjectFactory.makeInteger(4361)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4363), (SubLObject)SubLObjectFactory.makeInteger(4364)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4366), (SubLObject)SubLObjectFactory.makeInteger(4370)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4412), (SubLObject)SubLObjectFactory.makeInteger(4412)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4414), (SubLObject)SubLObjectFactory.makeInteger(4414)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4416), (SubLObject)SubLObjectFactory.makeInteger(4416)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4428), (SubLObject)SubLObjectFactory.makeInteger(4428)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4430), (SubLObject)SubLObjectFactory.makeInteger(4430)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4432), (SubLObject)SubLObjectFactory.makeInteger(4432)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4436), (SubLObject)SubLObjectFactory.makeInteger(4437)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4441), (SubLObject)SubLObjectFactory.makeInteger(4441)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4447), (SubLObject)SubLObjectFactory.makeInteger(4449)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4451), (SubLObject)SubLObjectFactory.makeInteger(4451)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4453), (SubLObject)SubLObjectFactory.makeInteger(4453)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4455), (SubLObject)SubLObjectFactory.makeInteger(4455)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4457), (SubLObject)SubLObjectFactory.makeInteger(4457)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4461), (SubLObject)SubLObjectFactory.makeInteger(4462)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4466), (SubLObject)SubLObjectFactory.makeInteger(4467)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4469), (SubLObject)SubLObjectFactory.makeInteger(4469)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4510), (SubLObject)SubLObjectFactory.makeInteger(4510)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4520), (SubLObject)SubLObjectFactory.makeInteger(4520)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4523), (SubLObject)SubLObjectFactory.makeInteger(4523)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4526), (SubLObject)SubLObjectFactory.makeInteger(4527)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4535), (SubLObject)SubLObjectFactory.makeInteger(4536)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4538), (SubLObject)SubLObjectFactory.makeInteger(4538)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4540), (SubLObject)SubLObjectFactory.makeInteger(4546)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4587), (SubLObject)SubLObjectFactory.makeInteger(4587)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4592), (SubLObject)SubLObjectFactory.makeInteger(4592)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(4601), (SubLObject)SubLObjectFactory.makeInteger(4601)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(7680), (SubLObject)SubLObjectFactory.makeInteger(7835)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(7840), (SubLObject)SubLObjectFactory.makeInteger(7929)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(7936), (SubLObject)SubLObjectFactory.makeInteger(7957)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(7960), (SubLObject)SubLObjectFactory.makeInteger(7965)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(7968), (SubLObject)SubLObjectFactory.makeInteger(8005)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8008), (SubLObject)SubLObjectFactory.makeInteger(8013)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8016), (SubLObject)SubLObjectFactory.makeInteger(8023)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8025), (SubLObject)SubLObjectFactory.makeInteger(8025)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8027), (SubLObject)SubLObjectFactory.makeInteger(8027)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8029), (SubLObject)SubLObjectFactory.makeInteger(8029)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8031), (SubLObject)SubLObjectFactory.makeInteger(8061)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8064), (SubLObject)SubLObjectFactory.makeInteger(8116)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8118), (SubLObject)SubLObjectFactory.makeInteger(8124)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8126), (SubLObject)SubLObjectFactory.makeInteger(8126)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8130), (SubLObject)SubLObjectFactory.makeInteger(8132)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8134), (SubLObject)SubLObjectFactory.makeInteger(8140)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8144), (SubLObject)SubLObjectFactory.makeInteger(8147)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8150), (SubLObject)SubLObjectFactory.makeInteger(8155)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8160), (SubLObject)SubLObjectFactory.makeInteger(8172)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8178), (SubLObject)SubLObjectFactory.makeInteger(8180)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8182), (SubLObject)SubLObjectFactory.makeInteger(8188)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8486), (SubLObject)SubLObjectFactory.makeInteger(8486)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8490), (SubLObject)SubLObjectFactory.makeInteger(8491)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8494), (SubLObject)SubLObjectFactory.makeInteger(8494)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(8576), (SubLObject)SubLObjectFactory.makeInteger(8578)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(12353), (SubLObject)SubLObjectFactory.makeInteger(12436)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(12449), (SubLObject)SubLObjectFactory.makeInteger(12538)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(12549), (SubLObject)SubLObjectFactory.makeInteger(12588)), ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(44032), (SubLObject)SubLObjectFactory.makeInteger(55203)) });
    }
    
    @Override
	public void declareFunctions() {
        declare_xml_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_xml_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_xml_utilities_file();
    }
    
    static {
        me = (SubLFile)new xml_utilities();
        xml_utilities.$xml_version$ = null;
        xml_utilities.$xml_indentation_level$ = null;
        xml_utilities.$xml_indentation_amount$ = null;
        xml_utilities.$cycml_indent_level$ = null;
        xml_utilities.$xml_cdata_prefix$ = null;
        xml_utilities.$xml_cdata_suffix$ = null;
        xml_utilities.$xml_base_char_code_ranges$ = null;
        xml_utilities.$xml_ideographic_char_code_ranges$ = null;
        xml_utilities.$xml_special_chars$ = null;
        xml_utilities.$alists_sort_key$ = null;
        $float0$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-INDENTATION-LEVEL*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-INDENTATION-AMOUNT*"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-INDENTATION-LEVEL*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCML-INDENT-LEVEL*"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-INDENTATION-LEVEL*")));
        $sym3$VALID_XML_CHAR_P = SubLObjectFactory.makeSymbol("VALID-XML-CHAR-P");
        $str4$Skipping_invalid_xml_character__S = SubLObjectFactory.makeString("Skipping invalid xml character ~S in ~S");
        $sym5$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $str6$US_ASCII = SubLObjectFactory.makeString("US-ASCII");
        $sym7$FLOATP = SubLObjectFactory.makeSymbol("FLOATP");
        $sym8$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym9$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $str10$__xml_version_ = SubLObjectFactory.makeString("<?xml version=");
        $sym11$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str12$_encoding_ = SubLObjectFactory.makeString(" encoding=");
        $str13$_standalone_ = SubLObjectFactory.makeString(" standalone=");
        $str14$yes = SubLObjectFactory.makeString("yes");
        $str15$no = SubLObjectFactory.makeString("no");
        $str16$___ = SubLObjectFactory.makeString(" ?>");
        $str17$___CDATA_ = SubLObjectFactory.makeString("<![CDATA[");
        $str18$___ = SubLObjectFactory.makeString("]]>");
        $str19$____ = SubLObjectFactory.makeString("<!--");
        $str20$___ = SubLObjectFactory.makeString("-->");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC?"), (SubLObject)SubLObjectFactory.makeSymbol("NO-NESTED-ELEMENTS?"), (SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-LINE-ATTRIBUTES?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-NAMESPACE"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-DEFAULT-NAMESPACE*"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym23$WITH_XML_INDENTATION = SubLObjectFactory.makeSymbol("WITH-XML-INDENTATION");
        $sym24$XML_START_TAG_INTERNAL = SubLObjectFactory.makeSymbol("XML-START-TAG-INTERNAL");
        $sym25$_XML_DEFAULT_NAMESPACE_ = SubLObjectFactory.makeSymbol("*XML-DEFAULT-NAMESPACE*");
        $sym26$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TERPRI")));
        $sym28$XML_END_TAG_INTERNAL = SubLObjectFactory.makeSymbol("XML-END-TAG-INTERNAL");
        $str29$xmlns = SubLObjectFactory.makeString("xmlns");
        $str30$__ = SubLObjectFactory.makeString("=\"");
        $str31$__ = SubLObjectFactory.makeString("/>");
        $str32$__ = SubLObjectFactory.makeString("</");
        $str33$_ = SubLObjectFactory.makeString("&");
        $str34$_ = SubLObjectFactory.makeString(";");
        $sym35$VALID_XML_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-XML-NAME-CHAR-P");
        $sym36$VALID_XML_NAME_CHAR_CODE_P = SubLObjectFactory.makeSymbol("VALID-XML-NAME-CHAR-CODE-P");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(46), (SubLObject)SubLObjectFactory.makeInteger(45), (SubLObject)SubLObjectFactory.makeInteger(95), (SubLObject)SubLObjectFactory.makeInteger(58));
        $list38 = _constant_38_initializer();
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(19968), (SubLObject)SubLObjectFactory.makeInteger(40869)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(12295), (SubLObject)SubLObjectFactory.makeInteger(12295)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(12321), (SubLObject)SubLObjectFactory.makeInteger(12329)));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOW"), (SubLObject)SubLObjectFactory.makeSymbol("HIGH"));
        $list41 = ConsesLow.list((SubLObject)Characters.CHAR_ampersand, (SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_greater, (SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_newline);
        $str42$_ = SubLObjectFactory.makeString(" ");
        $int43$34 = SubLObjectFactory.makeInteger(34);
        $str44$_quot_ = SubLObjectFactory.makeString("&quot;");
        $int45$38 = SubLObjectFactory.makeInteger(38);
        $str46$_amp_ = SubLObjectFactory.makeString("&amp;");
        $int47$39 = SubLObjectFactory.makeInteger(39);
        $str48$_apos_ = SubLObjectFactory.makeString("&apos;");
        $int49$60 = SubLObjectFactory.makeInteger(60);
        $str50$_lt_ = SubLObjectFactory.makeString("&lt;");
        $int51$62 = SubLObjectFactory.makeInteger(62);
        $str52$_gt_ = SubLObjectFactory.makeString("&gt;");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&gt;"), (SubLObject)SubLObjectFactory.makeString(">")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&lt;"), (SubLObject)SubLObjectFactory.makeString("<")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&amp;"), (SubLObject)SubLObjectFactory.makeString("&")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&quot;"), (SubLObject)SubLObjectFactory.makeString("\"")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&apos;"), (SubLObject)SubLObjectFactory.makeString("'")));
        $sym54$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $sym55$HEX_CHAR_P = SubLObjectFactory.makeSymbol("HEX-CHAR-P");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym57$_XML_STREAM_ = SubLObjectFactory.makeSymbol("*XML-STREAM*");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym59$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym60$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym61$CWITH_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym62$WITH_XML_OUTPUT_TO_STREAM = SubLObjectFactory.makeSymbol("WITH-XML-OUTPUT-TO-STREAM");
        $sym63$GENERATE_VALID_XML_HEADER = SubLObjectFactory.makeSymbol("GENERATE-VALID-XML-HEADER");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-HEADER"));
        $str65$__DOCTYPE__A_SYSTEM__S_ = SubLObjectFactory.makeString("<!DOCTYPE ~A SYSTEM ~S>");
        $list66 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"));
        $str67$xmlns_ = SubLObjectFactory.makeString("xmlns:");
        $list68 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list69 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str70$xml_ = SubLObjectFactory.makeString("xml:");
        $str71$http_ = SubLObjectFactory.makeString("http:");
        $str72$Couldn_t_resolve__S_based_on__S_a = SubLObjectFactory.makeString("Couldn't resolve ~S based on ~S and ~S.");
        $sym73$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw74$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym75$TERM___WITH_CONSTANT_BY_NAME = SubLObjectFactory.makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");
        $sym76$ALISTS_SORT_KEY = SubLObjectFactory.makeSymbol("ALISTS-SORT-KEY");
        $kw77$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw78$ATTRIBUTES = SubLObjectFactory.makeKeyword("ATTRIBUTES");
        $kw79$ELEMENTS = SubLObjectFactory.makeKeyword("ELEMENTS");
        $kw80$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list81 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("GROUPING-KEY-TUPLES"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-BINDINGS"));
        $str82$__A = SubLObjectFactory.makeString("<~A");
        $str83$__ = SubLObjectFactory.makeString("#$");
        $str84$__A__A = SubLObjectFactory.makeString(" ~A=~A");
        $str85$___ = SubLObjectFactory.makeString(">~%");
        $str86$_A__ = SubLObjectFactory.makeString("~A~%");
        $str87$___A___ = SubLObjectFactory.makeString("</~A>~%");
        $str88$____ = SubLObjectFactory.makeString("/>~%");
        $kw89$SORT_ASC = SubLObjectFactory.makeKeyword("SORT-ASC");
        $kw90$SORT_DESC = SubLObjectFactory.makeKeyword("SORT-DESC");
        $str91$__name__binding___elements__ = SubLObjectFactory.makeString("(:name \"binding\" :elements (");
        $str92$__name__ = SubLObjectFactory.makeString("(:name \"");
        $str93$___text_ = SubLObjectFactory.makeString("\" :text ");
        $str94$__ = SubLObjectFactory.makeString(") ");
        $str95$__ = SubLObjectFactory.makeString("))");
        $str96$root = SubLObjectFactory.makeString("root");
        $sym97$QUERY_RESULTS_TO_XML_STREAM = SubLObjectFactory.makeSymbol("QUERY-RESULTS-TO-XML-STREAM");
        $kw98$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/xml"), (SubLObject)SubLObjectFactory.makeString("*/*;q=0.5"));
        $sym100$URL_P = SubLObjectFactory.makeSymbol("URL-P");
        $kw101$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str102$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $int103$2000 = SubLObjectFactory.makeInteger(2000);
        $str104$404 = SubLObjectFactory.makeString("404");
        $str105$Not_Found = SubLObjectFactory.makeString("Not Found");
        $str106$Url_not_found_ = SubLObjectFactory.makeString("Url not found.");
        $str107$503_Service_Temporarily_Unavailab = SubLObjectFactory.makeString("503 Service Temporarily Unavailable");
        $str108$Server_not_available = SubLObjectFactory.makeString("Server not available");
        $str109$__xml = SubLObjectFactory.makeString("<?xml");
        $str110$Not_XML_document__Starts_with_ = SubLObjectFactory.makeString("Not XML document. Starts with ");
        $str111$Encountered_error_trying_to_downl = SubLObjectFactory.makeString("Encountered error trying to download ~S:~% ~S");
        $sym112$QUERY_RESULTS_TO_XML_FILE = SubLObjectFactory.makeSymbol("QUERY-RESULTS-TO-XML-FILE");
        $kw113$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym114$QUERY_RESULTS_TO_XML_STRING = SubLObjectFactory.makeSymbol("QUERY-RESULTS-TO-XML-STRING");
        $str115$true = SubLObjectFactory.makeString("true");
        $str116$false = SubLObjectFactory.makeString("false");
    }
}

/*

	Total time: 398 ms
	
*/