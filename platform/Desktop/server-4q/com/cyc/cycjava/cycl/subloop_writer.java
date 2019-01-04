package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_writer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_writer";
    public static final String myFingerPrint = "6920982fea837b23df3dd47bcb75eb0baf4749cb20771f30acc7714c32005182";
    private static final SubLSymbol $sym0$SUBLOOP_WRITER;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$INDENT_INCREMENT;
    private static final SubLSymbol $sym4$INDENT_NUM;
    private static final SubLSymbol $sym5$OUTSTREAM;
    private static final SubLSymbol $sym6$OPEN_FN;
    private static final SubLSymbol $sym7$INSTANCE_COUNT;
    private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS;
    private static final SubLSymbol $sym9$ISOLATED_P;
    private static final SubLSymbol $sym10$INSTANCE_NUMBER;
    private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE;
    private static final SubLSymbol $sym12$INCREASE_INDENT;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD;
    private static final SubLSymbol $sym16$SUBLOOP_WRITER_INCREASE_INDENT_METHOD;
    private static final SubLSymbol $sym17$DECREASE_INDENT;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD;
    private static final SubLString $str20$__Cannot_assign_negative_indentat;
    private static final SubLSymbol $sym21$SUBLOOP_WRITER_DECREASE_INDENT_METHOD;
    private static final SubLSymbol $sym22$SET_INDENT_INCREMENT;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD;
    private static final SubLSymbol $sym26$INTEGERP;
    private static final SubLSymbol $sym27$PLUSP;
    private static final SubLSymbol $sym28$SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD;
    private static final SubLSymbol $sym29$TEXT_WRITER;
    private static final SubLSymbol $sym30$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS;
    private static final SubLSymbol $sym31$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE;
    private static final SubLSymbol $sym32$INITIALIZE;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym36$OPEN_TEXT;
    private static final SubLSymbol $sym37$TEXT_WRITER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym38$SET_STREAM;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym42$STREAMP;
    private static final SubLSymbol $sym43$TEXT_WRITER_SET_STREAM_METHOD;
    private static final SubLSymbol $sym44$SET_STREAM_FROM_FILE_NAME;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$OUTPUT;
    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym49$TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD;
    private static final SubLSymbol $sym50$FLUSH;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym53$TEXT_WRITER_FLUSH_METHOD;
    private static final SubLSymbol $sym54$CLOSE;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym57$TEXT_WRITER_CLOSE_METHOD;
    private static final SubLSymbol $sym58$PRINT_OBJECT;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLString $str62$_A;
    private static final SubLSymbol $sym63$TEXT_WRITER_PRINT_OBJECT_METHOD;
    private static final SubLSymbol $sym64$PRINT_STRING;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym68$STRINGP;
    private static final SubLSymbol $sym69$TEXT_WRITER_PRINT_STRING_METHOD;
    private static final SubLSymbol $sym70$PRINT_LINE;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD;
    private static final SubLSymbol $sym73$TEXT_WRITER_PRINT_LINE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject get_subloop_writer_indent_increment(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, (SubLObject)subloop_writer.FOUR_INTEGER, (SubLObject)subloop_writer.$sym3$INDENT_INCREMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject set_subloop_writer_indent_increment(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, (SubLObject)subloop_writer.FOUR_INTEGER, (SubLObject)subloop_writer.$sym3$INDENT_INCREMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject get_subloop_writer_indent_num(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, (SubLObject)subloop_writer.THREE_INTEGER, (SubLObject)subloop_writer.$sym4$INDENT_NUM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject set_subloop_writer_indent_num(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, (SubLObject)subloop_writer.THREE_INTEGER, (SubLObject)subloop_writer.$sym4$INDENT_NUM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject get_subloop_writer_outstream(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, (SubLObject)subloop_writer.TWO_INTEGER, (SubLObject)subloop_writer.$sym5$OUTSTREAM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject set_subloop_writer_outstream(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, (SubLObject)subloop_writer.TWO_INTEGER, (SubLObject)subloop_writer.$sym5$OUTSTREAM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject get_subloop_writer_open_fn(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, (SubLObject)subloop_writer.ONE_INTEGER, (SubLObject)subloop_writer.$sym6$OPEN_FN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject set_subloop_writer_open_fn(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, (SubLObject)subloop_writer.ONE_INTEGER, (SubLObject)subloop_writer.$sym6$OPEN_FN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject subloop_reserved_initialize_subloop_writer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.$sym7$INSTANCE_COUNT, (SubLObject)subloop_writer.ZERO_INTEGER);
        return (SubLObject)subloop_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject subloop_reserved_initialize_subloop_writer_instance(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.$sym9$ISOLATED_P, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.$sym10$INSTANCE_NUMBER, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym6$OPEN_FN, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym5$OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym4$INDENT_NUM, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym3$INDENT_INCREMENT, (SubLObject)subloop_writer.NIL);
        return (SubLObject)subloop_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 1256L)
    public static SubLObject subloop_writer_p(final SubLObject v_subloop_writer) {
        return classes.subloop_instanceof_class(v_subloop_writer, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2149L)
    public static SubLObject subloop_writer_increase_indent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_subloop_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        SubLObject indent_num = get_subloop_writer_indent_num(self);
        try {
            thread.throwStack.push(subloop_writer.$sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
            try {
                indent_num = Numbers.add(indent_num, indent_increment);
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    set_subloop_writer_indent_num(self, indent_num);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_subloop_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_subloop_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2282L)
    public static SubLObject subloop_writer_decrease_indent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_subloop_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        SubLObject indent_num = get_subloop_writer_indent_num(self);
        try {
            thread.throwStack.push(subloop_writer.$sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
            try {
                final SubLObject new_indent_num = Numbers.subtract(indent_num, indent_increment);
                if (subloop_writer.ZERO_INTEGER.numG(new_indent_num)) {
                    Errors.warn((SubLObject)subloop_writer.$str20$__Cannot_assign_negative_indentat);
                }
                else {
                    indent_num = new_indent_num;
                }
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    set_subloop_writer_indent_num(self, indent_num);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_subloop_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_subloop_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2537L)
    public static SubLObject subloop_writer_set_indent_increment_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_subloop_writer_method = (SubLObject)subloop_writer.NIL;
        SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        try {
            thread.throwStack.push(subloop_writer.$sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
            try {
                assert subloop_writer.NIL != Types.integerp(num) : num;
                assert subloop_writer.NIL != Numbers.plusp(num) : num;
                indent_increment = num;
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_subloop_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_subloop_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2709L)
    public static SubLObject subloop_reserved_initialize_text_writer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.$sym7$INSTANCE_COUNT, (SubLObject)subloop_writer.ZERO_INTEGER);
        return (SubLObject)subloop_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2709L)
    public static SubLObject subloop_reserved_initialize_text_writer_instance(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.$sym9$ISOLATED_P, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.$sym10$INSTANCE_NUMBER, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym6$OPEN_FN, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym5$OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym4$INDENT_NUM, (SubLObject)subloop_writer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym3$INDENT_INCREMENT, (SubLObject)subloop_writer.NIL);
        return (SubLObject)subloop_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2709L)
    public static SubLObject text_writer_p(final SubLObject text_writer) {
        return classes.subloop_instanceof_class(text_writer, (SubLObject)subloop_writer.$sym29$TEXT_WRITER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 2930L)
    public static SubLObject text_writer_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        SubLObject indent_num = get_subloop_writer_indent_num(self);
        SubLObject open_fn = get_subloop_writer_open_fn(self);
        try {
            thread.throwStack.push(subloop_writer.$sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                object.object_initialize_method(self);
                open_fn = Symbols.symbol_function((SubLObject)subloop_writer.$sym36$OPEN_TEXT);
                indent_num = (SubLObject)subloop_writer.ZERO_INTEGER;
                indent_increment = (SubLObject)subloop_writer.TWO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_open_fn(self, open_fn);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3110L)
    public static SubLObject text_writer_set_stream_method(final SubLObject self, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(subloop_writer.$sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                assert subloop_writer.NIL != Types.streamp(out_stream) : out_stream;
                outstream = out_stream;
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3257L)
    public static SubLObject text_writer_set_stream_from_file_name_method(final SubLObject self, final SubLObject filename, SubLObject direction) {
        if (direction == subloop_writer.UNPROVIDED) {
            direction = (SubLObject)subloop_writer.$kw47$OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        SubLObject outstream = get_subloop_writer_outstream(self);
        final SubLObject open_fn = get_subloop_writer_open_fn(self);
        try {
            thread.throwStack.push(subloop_writer.$sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)subloop_writer.NIL, thread);
                    outstream = Functions.funcall(open_fn, filename, direction);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    set_subloop_writer_open_fn(self, open_fn);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3463L)
    public static SubLObject text_writer_flush_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(subloop_writer.$sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                streams_high.finish_output(outstream);
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3558L)
    public static SubLObject text_writer_close_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(subloop_writer.$sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(self, (SubLObject)subloop_writer.$sym50$FLUSH);
                streams_high.close(outstream, (SubLObject)subloop_writer.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3685L)
    public static SubLObject text_writer_print_object_method(final SubLObject self, final SubLObject v_object, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject indent_num = get_subloop_writer_indent_num(self);
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(subloop_writer.$sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                final SubLObject string = PrintLow.format((SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.$str62$_A, v_object);
                if (subloop_writer.NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                streams_high.write_string(string, outstream, (SubLObject)subloop_writer.UNPROVIDED, (SubLObject)subloop_writer.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 3904L)
    public static SubLObject text_writer_print_string_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject indent_num = get_subloop_writer_indent_num(self);
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(subloop_writer.$sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                assert subloop_writer.NIL != Types.stringp(string) : string;
                if (subloop_writer.NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                streams_high.write_string(string, outstream, (SubLObject)subloop_writer.UNPROVIDED, (SubLObject)subloop_writer.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-writer.lisp", position = 4102L)
    public static SubLObject text_writer_print_line_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = (SubLObject)subloop_writer.NIL;
        final SubLObject indent_num = get_subloop_writer_indent_num(self);
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push(subloop_writer.$sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                assert subloop_writer.NIL != Types.stringp(string) : string;
                if (subloop_writer.NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                streams_high.write_line(string, outstream, (SubLObject)subloop_writer.UNPROVIDED, (SubLObject)subloop_writer.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)subloop_writer.$sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_writer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_outstream(self, outstream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_writer.$sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }
    
    public static SubLObject declare_subloop_writer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "get_subloop_writer_indent_increment", "GET-SUBLOOP-WRITER-INDENT-INCREMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "set_subloop_writer_indent_increment", "SET-SUBLOOP-WRITER-INDENT-INCREMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "get_subloop_writer_indent_num", "GET-SUBLOOP-WRITER-INDENT-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "set_subloop_writer_indent_num", "SET-SUBLOOP-WRITER-INDENT-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "get_subloop_writer_outstream", "GET-SUBLOOP-WRITER-OUTSTREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "set_subloop_writer_outstream", "SET-SUBLOOP-WRITER-OUTSTREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "get_subloop_writer_open_fn", "GET-SUBLOOP-WRITER-OPEN-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "set_subloop_writer_open_fn", "SET-SUBLOOP-WRITER-OPEN-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_reserved_initialize_subloop_writer_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_reserved_initialize_subloop_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_writer_p", "SUBLOOP-WRITER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_writer_increase_indent_method", "SUBLOOP-WRITER-INCREASE-INDENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_writer_decrease_indent_method", "SUBLOOP-WRITER-DECREASE-INDENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_writer_set_indent_increment_method", "SUBLOOP-WRITER-SET-INDENT-INCREMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_reserved_initialize_text_writer_class", "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "subloop_reserved_initialize_text_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_p", "TEXT-WRITER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_initialize_method", "TEXT-WRITER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_set_stream_method", "TEXT-WRITER-SET-STREAM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_set_stream_from_file_name_method", "TEXT-WRITER-SET-STREAM-FROM-FILE-NAME-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_flush_method", "TEXT-WRITER-FLUSH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_close_method", "TEXT-WRITER-CLOSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_print_object_method", "TEXT-WRITER-PRINT-OBJECT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_print_string_method", "TEXT-WRITER-PRINT-STRING-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_writer", "text_writer_print_line_method", "TEXT-WRITER-PRINT-LINE-METHOD", 3, 0, false);
        return (SubLObject)subloop_writer.NIL;
    }
    
    public static SubLObject init_subloop_writer_file() {
        return (SubLObject)subloop_writer.NIL;
    }
    
    public static SubLObject setup_subloop_writer_file() {
        classes.subloop_new_class((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym1$OBJECT, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.T, (SubLObject)subloop_writer.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym8$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym11$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE);
        subloop_reserved_initialize_subloop_writer_class((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym12$INCREASE_INDENT, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.$list14);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym12$INCREASE_INDENT, (SubLObject)subloop_writer.$sym16$SUBLOOP_WRITER_INCREASE_INDENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym17$DECREASE_INDENT, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.$list18);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym17$DECREASE_INDENT, (SubLObject)subloop_writer.$sym21$SUBLOOP_WRITER_DECREASE_INDENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym22$SET_INDENT_INCREMENT, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.$list23, (SubLObject)subloop_writer.$list24);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.$sym22$SET_INDENT_INCREMENT, (SubLObject)subloop_writer.$sym28$SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD);
        classes.subloop_new_class((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym0$SUBLOOP_WRITER, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym30$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym31$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE);
        subloop_reserved_initialize_text_writer_class((SubLObject)subloop_writer.$sym29$TEXT_WRITER);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym32$INITIALIZE, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list33, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.$list34);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym32$INITIALIZE, (SubLObject)subloop_writer.$sym37$TEXT_WRITER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym38$SET_STREAM, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.$list39, (SubLObject)subloop_writer.$list40);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym38$SET_STREAM, (SubLObject)subloop_writer.$sym43$TEXT_WRITER_SET_STREAM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym44$SET_STREAM_FROM_FILE_NAME, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.$list45, (SubLObject)subloop_writer.$list46);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym44$SET_STREAM_FROM_FILE_NAME, (SubLObject)subloop_writer.$sym49$TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym50$FLUSH, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.$list51);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym50$FLUSH, (SubLObject)subloop_writer.$sym53$TEXT_WRITER_FLUSH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym54$CLOSE, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.NIL, (SubLObject)subloop_writer.$list55);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym54$CLOSE, (SubLObject)subloop_writer.$sym57$TEXT_WRITER_CLOSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym58$PRINT_OBJECT, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.$list59, (SubLObject)subloop_writer.$list60);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym58$PRINT_OBJECT, (SubLObject)subloop_writer.$sym63$TEXT_WRITER_PRINT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym64$PRINT_STRING, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.$list65, (SubLObject)subloop_writer.$list66);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym64$PRINT_STRING, (SubLObject)subloop_writer.$sym69$TEXT_WRITER_PRINT_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_writer.$sym70$PRINT_LINE, (SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$list13, (SubLObject)subloop_writer.$list65, (SubLObject)subloop_writer.$list71);
        methods.subloop_register_instance_method((SubLObject)subloop_writer.$sym29$TEXT_WRITER, (SubLObject)subloop_writer.$sym70$PRINT_LINE, (SubLObject)subloop_writer.$sym73$TEXT_WRITER_PRINT_LINE_METHOD);
        return (SubLObject)subloop_writer.NIL;
    }
    
    public void declareFunctions() {
        declare_subloop_writer_file();
    }
    
    public void initializeVariables() {
        init_subloop_writer_file();
    }
    
    public void runTopLevelForms() {
        setup_subloop_writer_file();
    }
    
    static {
        me = (SubLFile)new subloop_writer();
        $sym0$SUBLOOP_WRITER = SubLObjectFactory.makeSymbol("SUBLOOP-WRITER");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-FN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT-INCREMENT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INCREASE-INDENT"), (SubLObject)subloop_writer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DECREASE-INDENT"), (SubLObject)subloop_writer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INDENT-INCREMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FLUSH"), (SubLObject)subloop_writer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLOSE"), (SubLObject)subloop_writer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-LINE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym3$INDENT_INCREMENT = SubLObjectFactory.makeSymbol("INDENT-INCREMENT");
        $sym4$INDENT_NUM = SubLObjectFactory.makeSymbol("INDENT-NUM");
        $sym5$OUTSTREAM = SubLObjectFactory.makeSymbol("OUTSTREAM");
        $sym6$OPEN_FN = SubLObjectFactory.makeSymbol("OPEN-FN");
        $sym7$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym8$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-CLASS");
        $sym9$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym10$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym11$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-INSTANCE");
        $sym12$INCREASE_INDENT = SubLObjectFactory.makeSymbol("INCREASE-INDENT");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-INCREMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD");
        $sym16$SUBLOOP_WRITER_INCREASE_INDENT_METHOD = SubLObjectFactory.makeSymbol("SUBLOOP-WRITER-INCREASE-INDENT-METHOD");
        $sym17$DECREASE_INDENT = SubLObjectFactory.makeSymbol("DECREASE-INDENT");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INDENT-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-INCREMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)subloop_writer.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("NEW-INDENT-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Cannot assign negative indentation")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INDENT-NUM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD");
        $str20$__Cannot_assign_negative_indentat = SubLObjectFactory.makeString("~%Cannot assign negative indentation");
        $sym21$SUBLOOP_WRITER_DECREASE_INDENT_METHOD = SubLObjectFactory.makeSymbol("SUBLOOP-WRITER-DECREASE-INDENT-METHOD");
        $sym22$SET_INDENT_INCREMENT = SubLObjectFactory.makeSymbol("SET-INDENT-INCREMENT");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("PLUSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-INCREMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD");
        $sym26$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym27$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
        $sym28$SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD = SubLObjectFactory.makeSymbol("SUBLOOP-WRITER-SET-INDENT-INCREMENT-METHOD");
        $sym29$TEXT_WRITER = SubLObjectFactory.makeSymbol("TEXT-WRITER");
        $sym30$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-CLASS");
        $sym31$SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-INSTANCE");
        $sym32$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-FN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"), (SubLObject)subloop_writer.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-INCREMENT"), (SubLObject)subloop_writer.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym36$OPEN_TEXT = SubLObjectFactory.makeSymbol("OPEN-TEXT");
        $sym37$TEXT_WRITER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-INITIALIZE-METHOD");
        $sym38$SET_STREAM = SubLObjectFactory.makeSymbol("SET-STREAM");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-STREAM"));
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OUT-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("STREAMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("OUT-STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym42$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym43$TEXT_WRITER_SET_STREAM_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-SET-STREAM-METHOD");
        $sym44$SET_STREAM_FROM_FILE_NAME = SubLObjectFactory.makeSymbol("SET-STREAM-FROM-FILE-NAME");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT")));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-PRIVATE-STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-FN"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $kw47$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym49$TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-SET-STREAM-FROM-FILE-NAME-METHOD");
        $sym50$FLUSH = SubLObjectFactory.makeSymbol("FLUSH");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINISH-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym53$TEXT_WRITER_FLUSH_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-FLUSH-METHOD");
        $sym54$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FLUSH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLOSE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym57$TEXT_WRITER_CLOSE_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-CLOSE-METHOD");
        $sym58$PRINT_OBJECT = SubLObjectFactory.makeSymbol("PRINT-OBJECT");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"));
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)subloop_writer.NIL, (SubLObject)SubLObjectFactory.makeString("~A"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $str62$_A = SubLObjectFactory.makeString("~A");
        $sym63$TEXT_WRITER_PRINT_OBJECT_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-PRINT-OBJECT-METHOD");
        $sym64$PRINT_STRING = SubLObjectFactory.makeSymbol("PRINT-STRING");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"));
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym68$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym69$TEXT_WRITER_PRINT_STRING_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-PRINT-STRING-METHOD");
        $sym70$PRINT_LINE = SubLObjectFactory.makeSymbol("PRINT-LINE");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-LINE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");
        $sym73$TEXT_WRITER_PRINT_LINE_METHOD = SubLObjectFactory.makeSymbol("TEXT-WRITER-PRINT-LINE-METHOD");
    }
}

/*

	Total time: 223 ms
	
*/