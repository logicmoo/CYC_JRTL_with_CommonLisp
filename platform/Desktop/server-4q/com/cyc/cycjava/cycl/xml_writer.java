package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_writer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_writer";
    public static final String myFingerPrint = "ab1cc8e02cfa7690d1b2545c4c8f5fb6dab8c697be35befb3c1f3ab9e9ad1471";
    private static final SubLSymbol $sym0$XML_WRITER;
    private static final SubLSymbol $sym1$TEXT_WRITER;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS;
    private static final SubLSymbol $sym6$ISOLATED_P;
    private static final SubLSymbol $sym7$INSTANCE_NUMBER;
    private static final SubLSymbol $sym8$SUBLOOP_WRITER;
    private static final SubLSymbol $sym9$OPEN_FN;
    private static final SubLSymbol $sym10$OUTSTREAM;
    private static final SubLSymbol $sym11$INDENT_NUM;
    private static final SubLSymbol $sym12$INDENT_INCREMENT;
    private static final SubLSymbol $sym13$VERSION;
    private static final SubLSymbol $sym14$ENCODING;
    private static final SubLSymbol $sym15$STANDALONE;
    private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE;
    private static final SubLSymbol $sym17$INITIALIZE;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLFloat $float21$1_0;
    private static final SubLString $str22$US_ASCII;
    private static final SubLSymbol $sym23$XML_WRITER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym24$HEADER;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLSymbol $sym28$XML_WRITER_HEADER_METHOD;
    private static final SubLSymbol $sym29$CDATA;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLSymbol $sym33$STRINGP;
    private static final SubLSymbol $sym34$XML_WRITER_CDATA_METHOD;
    private static final SubLSymbol $sym35$MARKUP;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLSymbol $sym38$XML_WRITER_MARKUP_METHOD;
    private static final SubLSymbol $sym39$COMMENT;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLSymbol $sym42$XML_WRITER_COMMENT_METHOD;
    private static final SubLSymbol $sym43$START_TAG;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$LISTP;
    private static final SubLSymbol $sym48$INCREASE_INDENT;
    private static final SubLSymbol $sym49$XML_WRITER_START_TAG_METHOD;
    private static final SubLSymbol $sym50$END_TAG;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$DECREASE_INDENT;
    private static final SubLSymbol $sym55$XML_WRITER_END_TAG_METHOD;
    private static final SubLSymbol $sym56$XML_PRINT;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLSymbol $sym60$XML_WRITER_XML_PRINT_METHOD;
    private static final SubLSymbol $sym61$XML_PRINT_LINE;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD;
    private static final SubLSymbol $sym64$XML_WRITER_XML_PRINT_LINE_METHOD;
    private static final SubLString $str65$cyc_constant;
    private static final SubLString $str66$guid;
    private static final SubLString $str67$name;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject get_xml_writer_standalone(final SubLObject v_xml_writer) {
        return classes.subloop_get_instance_slot(v_xml_writer, (SubLObject)xml_writer.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject set_xml_writer_standalone(final SubLObject v_xml_writer, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_xml_writer, value, (SubLObject)xml_writer.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject get_xml_writer_encoding(final SubLObject v_xml_writer) {
        return classes.subloop_get_instance_slot(v_xml_writer, (SubLObject)xml_writer.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject set_xml_writer_encoding(final SubLObject v_xml_writer, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_xml_writer, value, (SubLObject)xml_writer.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject get_xml_writer_version(final SubLObject v_xml_writer) {
        return classes.subloop_get_instance_slot(v_xml_writer, (SubLObject)xml_writer.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject set_xml_writer_version(final SubLObject v_xml_writer, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_xml_writer, value, (SubLObject)xml_writer.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject subloop_reserved_initialize_xml_writer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym3$OBJECT, (SubLObject)xml_writer.$sym4$INSTANCE_COUNT, (SubLObject)xml_writer.ZERO_INTEGER);
        return (SubLObject)xml_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject subloop_reserved_initialize_xml_writer_instance(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym3$OBJECT, (SubLObject)xml_writer.$sym6$ISOLATED_P, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym3$OBJECT, (SubLObject)xml_writer.$sym7$INSTANCE_NUMBER, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym8$SUBLOOP_WRITER, (SubLObject)xml_writer.$sym9$OPEN_FN, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym8$SUBLOOP_WRITER, (SubLObject)xml_writer.$sym10$OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym8$SUBLOOP_WRITER, (SubLObject)xml_writer.$sym11$INDENT_NUM, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym8$SUBLOOP_WRITER, (SubLObject)xml_writer.$sym12$INDENT_INCREMENT, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym13$VERSION, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym14$ENCODING, (SubLObject)xml_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym15$STANDALONE, (SubLObject)xml_writer.NIL);
        return (SubLObject)xml_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 1454L)
    public static SubLObject xml_writer_p(final SubLObject v_xml_writer) {
        return classes.subloop_instanceof_class(v_xml_writer, (SubLObject)xml_writer.$sym0$XML_WRITER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2188L)
    public static SubLObject xml_writer_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        SubLObject standalone = get_xml_writer_standalone(self);
        SubLObject encoding = get_xml_writer_encoding(self);
        SubLObject version = get_xml_writer_version(self);
        try {
            thread.throwStack.push(xml_writer.$sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                subloop_writer.text_writer_initialize_method(self);
                version = (SubLObject)xml_writer.$float21$1_0;
                encoding = (SubLObject)xml_writer.$str22$US_ASCII;
                standalone = (SubLObject)xml_writer.T;
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_xml_writer_standalone(self, standalone);
                    set_xml_writer_encoding(self, encoding);
                    set_xml_writer_version(self, version);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2358L)
    public static SubLObject xml_writer_header_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        final SubLObject standalone = get_xml_writer_standalone(self);
        final SubLObject encoding = get_xml_writer_encoding(self);
        final SubLObject version = get_xml_writer_version(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(xml_writer.$sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_header(version, encoding, standalone);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_xml_writer_standalone(self, standalone);
                    set_xml_writer_encoding(self, encoding);
                    set_xml_writer_version(self, version);
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2506L)
    public static SubLObject xml_writer_cdata_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(xml_writer.$sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert xml_writer.NIL != Types.stringp(string) : string;
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_cdata(string);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2667L)
    public static SubLObject xml_writer_markup_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(xml_writer.$sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert xml_writer.NIL != Types.stringp(string) : string;
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_markup(string);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2830L)
    public static SubLObject xml_writer_comment_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(xml_writer.$sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert xml_writer.NIL != Types.stringp(string) : string;
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_comment(string);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 2995L)
    public static SubLObject xml_writer_start_tag_method(final SubLObject self, final SubLObject name, final SubLObject attributes, final SubLObject atomic, final SubLObject newline) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        assert xml_writer.NIL != Types.stringp(name) : name;
        assert xml_writer.NIL != Types.listp(attributes) : attributes;
        string_utilities.indent(outstream, indent_num);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(outstream, thread);
            xml_utilities.xml_start_tag_internal(name, attributes, atomic, (SubLObject)xml_writer.UNPROVIDED, (SubLObject)xml_writer.UNPROVIDED);
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        if (xml_writer.NIL != newline) {
            streams_high.write_char((SubLObject)Characters.CHAR_newline, outstream);
        }
        if (xml_writer.NIL == atomic) {
            methods.funcall_instance_method_with_0_args(self, (SubLObject)xml_writer.$sym48$INCREASE_INDENT);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 3406L)
    public static SubLObject xml_writer_end_tag_method(final SubLObject self, final SubLObject name, final SubLObject indent, SubLObject newline) {
        if (newline == xml_writer.UNPROVIDED) {
            newline = (SubLObject)xml_writer.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert xml_writer.NIL != Types.stringp(name) : name;
        methods.funcall_instance_method_with_0_args(self, (SubLObject)xml_writer.$sym54$DECREASE_INDENT);
        final SubLObject cur_stream = subloop_writer.get_subloop_writer_outstream(self);
        if (xml_writer.NIL != indent) {
            string_utilities.indent(cur_stream, subloop_writer.get_subloop_writer_indent_num(self));
        }
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(cur_stream, thread);
            xml_utilities.xml_end_tag_internal(name);
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        if (xml_writer.NIL != newline) {
            streams_high.write_char((SubLObject)Characters.CHAR_newline, cur_stream);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 3878L)
    public static SubLObject xml_writer_xml_print_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(xml_writer.$sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert xml_writer.NIL != Types.stringp(string) : string;
                if (xml_writer.NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_print(string, (SubLObject)xml_writer.UNPROVIDED);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_writer.set_subloop_writer_indent_num(self, indent_num);
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 4097L)
    public static SubLObject xml_writer_xml_print_line_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_xml_writer_method = (SubLObject)xml_writer.NIL;
        final SubLObject indent_num = subloop_writer.get_subloop_writer_indent_num(self);
        final SubLObject outstream = subloop_writer.get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(xml_writer.$sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD);
            try {
                assert xml_writer.NIL != Types.stringp(string) : string;
                if (xml_writer.NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(outstream, thread);
                    xml_utilities.xml_print_line(string, (SubLObject)xml_writer.UNPROVIDED);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)xml_writer.$sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_writer.set_subloop_writer_indent_num(self, indent_num);
                    subloop_writer.set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_xml_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)xml_writer.$sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_xml_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-writer.lisp", position = 4326L)
    public static SubLObject constant_to_xml(final SubLObject constant, final SubLObject v_xml_writer) {
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)xml_writer.$sym43$START_TAG, (SubLObject)xml_writer.$str65$cyc_constant, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.T);
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)xml_writer.$sym43$START_TAG, (SubLObject)xml_writer.$str66$guid, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)xml_writer.$sym56$XML_PRINT, Guids.guid_to_string(constants_high.constant_guid(constant)), (SubLObject)xml_writer.NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)xml_writer.$sym50$END_TAG, (SubLObject)xml_writer.$str66$guid, (SubLObject)xml_writer.NIL);
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)xml_writer.$sym43$START_TAG, (SubLObject)xml_writer.$str67$name, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)xml_writer.$sym56$XML_PRINT, constants_high.constant_name(constant), (SubLObject)xml_writer.NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)xml_writer.$sym50$END_TAG, (SubLObject)xml_writer.$str67$name, (SubLObject)xml_writer.NIL);
        methods.funcall_instance_method_with_2_args(v_xml_writer, (SubLObject)xml_writer.$sym50$END_TAG, (SubLObject)xml_writer.$str65$cyc_constant, (SubLObject)xml_writer.T);
        return (SubLObject)xml_writer.T;
    }
    
    public static SubLObject declare_xml_writer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "get_xml_writer_standalone", "GET-XML-WRITER-STANDALONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "set_xml_writer_standalone", "SET-XML-WRITER-STANDALONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "get_xml_writer_encoding", "GET-XML-WRITER-ENCODING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "set_xml_writer_encoding", "SET-XML-WRITER-ENCODING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "get_xml_writer_version", "GET-XML-WRITER-VERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "set_xml_writer_version", "SET-XML-WRITER-VERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "subloop_reserved_initialize_xml_writer_class", "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "subloop_reserved_initialize_xml_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_p", "XML-WRITER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_initialize_method", "XML-WRITER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_header_method", "XML-WRITER-HEADER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_cdata_method", "XML-WRITER-CDATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_markup_method", "XML-WRITER-MARKUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_comment_method", "XML-WRITER-COMMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_start_tag_method", "XML-WRITER-START-TAG-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_end_tag_method", "XML-WRITER-END-TAG-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_xml_print_method", "XML-WRITER-XML-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "xml_writer_xml_print_line_method", "XML-WRITER-XML-PRINT-LINE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_writer", "constant_to_xml", "CONSTANT-TO-XML", 2, 0, false);
        return (SubLObject)xml_writer.NIL;
    }
    
    public static SubLObject init_xml_writer_file() {
        return (SubLObject)xml_writer.NIL;
    }
    
    public static SubLObject setup_xml_writer_file() {
        classes.subloop_new_class((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym1$TEXT_WRITER, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym5$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym16$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE);
        subloop_reserved_initialize_xml_writer_class((SubLObject)xml_writer.$sym0$XML_WRITER);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym17$INITIALIZE, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list18, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.$list19);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym17$INITIALIZE, (SubLObject)xml_writer.$sym23$XML_WRITER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym24$HEADER, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list25, (SubLObject)xml_writer.NIL, (SubLObject)xml_writer.$list26);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym24$HEADER, (SubLObject)xml_writer.$sym28$XML_WRITER_HEADER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym29$CDATA, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list25, (SubLObject)xml_writer.$list30, (SubLObject)xml_writer.$list31);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym29$CDATA, (SubLObject)xml_writer.$sym34$XML_WRITER_CDATA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym35$MARKUP, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list25, (SubLObject)xml_writer.$list30, (SubLObject)xml_writer.$list36);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym35$MARKUP, (SubLObject)xml_writer.$sym38$XML_WRITER_MARKUP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym39$COMMENT, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list25, (SubLObject)xml_writer.$list30, (SubLObject)xml_writer.$list40);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym39$COMMENT, (SubLObject)xml_writer.$sym42$XML_WRITER_COMMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym43$START_TAG, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list44, (SubLObject)xml_writer.$list45, (SubLObject)xml_writer.$list46);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym43$START_TAG, (SubLObject)xml_writer.$sym49$XML_WRITER_START_TAG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym50$END_TAG, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list51, (SubLObject)xml_writer.$list52, (SubLObject)xml_writer.$list53);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym50$END_TAG, (SubLObject)xml_writer.$sym55$XML_WRITER_END_TAG_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym56$XML_PRINT, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list25, (SubLObject)xml_writer.$list57, (SubLObject)xml_writer.$list58);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym56$XML_PRINT, (SubLObject)xml_writer.$sym60$XML_WRITER_XML_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)xml_writer.$sym61$XML_PRINT_LINE, (SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$list25, (SubLObject)xml_writer.$list57, (SubLObject)xml_writer.$list62);
        methods.subloop_register_instance_method((SubLObject)xml_writer.$sym0$XML_WRITER, (SubLObject)xml_writer.$sym61$XML_PRINT_LINE, (SubLObject)xml_writer.$sym64$XML_WRITER_XML_PRINT_LINE_METHOD);
        return (SubLObject)xml_writer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_xml_writer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_xml_writer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_xml_writer_file();
    }
    
    static {
        me = (SubLFile)new xml_writer();
        $sym0$XML_WRITER = SubLObjectFactory.makeSymbol("XML-WRITER");
        $sym1$TEXT_WRITER = SubLObjectFactory.makeSymbol("TEXT-WRITER");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERSION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENCODING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STANDALONE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HEADER"), (SubLObject)xml_writer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CDATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MARKUP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("START-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("END-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT-LINE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym8$SUBLOOP_WRITER = SubLObjectFactory.makeSymbol("SUBLOOP-WRITER");
        $sym9$OPEN_FN = SubLObjectFactory.makeSymbol("OPEN-FN");
        $sym10$OUTSTREAM = SubLObjectFactory.makeSymbol("OUTSTREAM");
        $sym11$INDENT_NUM = SubLObjectFactory.makeSymbol("INDENT-NUM");
        $sym12$INDENT_INCREMENT = SubLObjectFactory.makeSymbol("INDENT-INCREMENT");
        $sym13$VERSION = SubLObjectFactory.makeSymbol("VERSION");
        $sym14$ENCODING = SubLObjectFactory.makeSymbol("ENCODING");
        $sym15$STANDALONE = SubLObjectFactory.makeSymbol("STANDALONE");
        $sym16$SUBLOOP_RESERVED_INITIALIZE_XML_WRITER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-XML-WRITER-INSTANCE");
        $sym17$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VERSION"), (SubLObject)SubLObjectFactory.makeDouble(1.0)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"), (SubLObject)SubLObjectFactory.makeString("US-ASCII")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STANDALONE"), (SubLObject)xml_writer.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym20$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $float21$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $str22$US_ASCII = SubLObjectFactory.makeString("US-ASCII");
        $sym23$XML_WRITER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-INITIALIZE-METHOD");
        $sym24$HEADER = SubLObjectFactory.makeSymbol("HEADER");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-HEADER"), (SubLObject)SubLObjectFactory.makeSymbol("VERSION"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"), (SubLObject)SubLObjectFactory.makeSymbol("STANDALONE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym27$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $sym28$XML_WRITER_HEADER_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-HEADER-METHOD");
        $sym29$CDATA = SubLObjectFactory.makeSymbol("CDATA");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-CDATA"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym32$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $sym33$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym34$XML_WRITER_CDATA_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-CDATA-METHOD");
        $sym35$MARKUP = SubLObjectFactory.makeSymbol("MARKUP");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-MARKUP"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym37$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $sym38$XML_WRITER_MARKUP_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-MARKUP-METHOD");
        $sym39$COMMENT = SubLObjectFactory.makeSymbol("COMMENT");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym41$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $sym42$XML_WRITER_COMMENT_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-COMMENT-METHOD");
        $sym43$START_TAG = SubLObjectFactory.makeSymbol("START-TAG");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC"), (SubLObject)SubLObjectFactory.makeSymbol("NEWLINE"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-START-TAG-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NEWLINE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-CHAR"), (SubLObject)Characters.CHAR_newline, (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INCREASE-INDENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym47$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym48$INCREASE_INDENT = SubLObjectFactory.makeSymbol("INCREASE-INDENT");
        $sym49$XML_WRITER_START_TAG_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-START-TAG-METHOD");
        $sym50$END_TAG = SubLObjectFactory.makeSymbol("END-TAG");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEWLINE"), (SubLObject)xml_writer.T));
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DECREASE-INDENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SUBLOOP-WRITER-OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SUBLOOP-WRITER-INDENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-END-TAG-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NEWLINE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-CHAR"), (SubLObject)Characters.CHAR_newline, (SubLObject)SubLObjectFactory.makeSymbol("CUR-STREAM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym54$DECREASE_INDENT = SubLObjectFactory.makeSymbol("DECREASE-INDENT");
        $sym55$XML_WRITER_END_TAG_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-END-TAG-METHOD");
        $sym56$XML_PRINT = SubLObjectFactory.makeSymbol("XML-PRINT");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"));
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym59$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $sym60$XML_WRITER_XML_PRINT_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-XML-PRINT-METHOD");
        $sym61$XML_PRINT_LINE = SubLObjectFactory.makeSymbol("XML-PRINT-LINE");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-PRINT-LINE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym63$OUTER_CATCH_FOR_XML_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-XML-WRITER-METHOD");
        $sym64$XML_WRITER_XML_PRINT_LINE_METHOD = SubLObjectFactory.makeSymbol("XML-WRITER-XML-PRINT-LINE-METHOD");
        $str65$cyc_constant = SubLObjectFactory.makeString("cyc-constant");
        $str66$guid = SubLObjectFactory.makeString("guid");
        $str67$name = SubLObjectFactory.makeString("name");
    }
}

/*

	Total time: 172 ms
	
*/