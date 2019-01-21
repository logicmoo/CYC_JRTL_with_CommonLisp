// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_reader extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constant_reader";
    public static final String myFingerPrint = "6a2258c4d1229cb28a5b3caa6a93d18a0228da4c9ade1491c17c39f661698cef";
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 1014L)
    private static SubLSymbol $constant_reader_macro_char$;
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 1428L)
    private static SubLSymbol $constant_reader_prefix$;
    private static final SubLString $str0$_;
    private static final SubLString $str1$The__S_reader_macro_does_not_take;
    private static final SubLInteger $int2$64;
    private static final SubLString $str3$_S_is_not_the_name_of_a_constant_;
    private static final SubLSymbol $sym4$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym5$SHARPSIGN_DOLLAR_RMF;
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 1223L)
    public static SubLObject constant_reader_macro_char() {
        return constant_reader.$constant_reader_macro_char$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 1590L)
    public static SubLObject constant_reader_prefix() {
        return constant_reader.$constant_reader_prefix$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 1736L)
    public static SubLObject sharpsign_dollar_rmf(final SubLObject stream, final SubLObject ch, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constant_reader.NIL != arg) {
            reader.simple_reader_error((SubLObject)constant_reader.$str1$The__S_reader_macro_does_not_take, (SubLObject)ConsesLow.list(ch));
        }
        SubLObject length = (SubLObject)constant_reader.$int2$64;
        SubLObject buffer = Strings.make_string(length, (SubLObject)constant_reader.UNPROVIDED);
        SubLObject i = (SubLObject)constant_reader.ZERO_INTEGER;
        SubLObject next;
        for (next = streams_high.read_char(stream, (SubLObject)constant_reader.NIL, (SubLObject)constant_reader.NIL, (SubLObject)constant_reader.UNPROVIDED); constant_reader.NIL != next && constant_reader.NIL != constant_completion_high.valid_constant_name_char_p(next); next = streams_high.read_char(stream, (SubLObject)constant_reader.NIL, (SubLObject)constant_reader.NIL, (SubLObject)constant_reader.UNPROVIDED)) {
            if (i.numGE(length)) {
                length = Numbers.multiply(length, (SubLObject)constant_reader.TWO_INTEGER);
                final SubLObject new_buffer = Strings.make_string(length, (SubLObject)constant_reader.UNPROVIDED);
                SubLObject j;
                for (j = (SubLObject)constant_reader.NIL, j = (SubLObject)constant_reader.ZERO_INTEGER; j.numL(i); j = Numbers.add(j, (SubLObject)constant_reader.ONE_INTEGER)) {
                    Strings.set_char(new_buffer, j, Strings.sublisp_char(buffer, j));
                }
                buffer = new_buffer;
            }
            Strings.set_char(buffer, i, next);
            i = Numbers.add(i, (SubLObject)constant_reader.ONE_INTEGER);
        }
        if (constant_reader.NIL != next) {
            streams_high.unread_char(next, stream);
        }
        if (constant_reader.NIL != reader.$read_suppress$.getDynamicValue(thread)) {
            return Values.values((SubLObject)constant_reader.NIL, (SubLObject)constant_reader.T);
        }
        final SubLObject name = i.numE(length) ? buffer : Sequences.subseq(buffer, (SubLObject)constant_reader.ZERO_INTEGER, i);
        SubLObject constant = find_constant_by_name(name);
        if (constant_reader.NIL != constant) {
            return Values.values(constant, (SubLObject)constant_reader.T);
        }
        if (constant_reader.NIL != stream_forbids_constant_creation(stream)) {
            reader.simple_reader_error((SubLObject)constant_reader.$str3$_S_is_not_the_name_of_a_constant_, (SubLObject)ConsesLow.list(name));
            return (SubLObject)constant_reader.NIL;
        }
        SubLObject error_message = (SubLObject)constant_reader.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)constant_reader.$sym4$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    constant = constant_handles.reader_make_constant_shell(name);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)constant_reader.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (constant_reader.NIL != error_message) {
            reader.simple_reader_error(error_message, (SubLObject)constant_reader.NIL);
        }
        return Values.values(constant, (SubLObject)constant_reader.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 3066L)
    public static SubLObject find_constant_by_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = (SubLObject)constant_reader.NIL;
        final SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding(thread);
        try {
            constant_completion_low.$require_valid_constants$.bind((SubLObject)constant_reader.NIL, thread);
            constant = constant_completion_high.constant_complete_exact(name, (SubLObject)constant_reader.UNPROVIDED, (SubLObject)constant_reader.UNPROVIDED);
        }
        finally {
            constant_completion_low.$require_valid_constants$.rebind(_prev_bind_0, thread);
        }
        if (constant_reader.NIL == constant) {
            constant = constant_handles.find_invalid_constant(name);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-reader.lisp", position = 3475L)
    public static SubLObject stream_forbids_constant_creation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constant_reader.NIL == control_vars.$read_require_constant_exists$.getDynamicValue(thread)) {
            return (SubLObject)constant_reader.NIL;
        }
        return (SubLObject)constant_reader.T;
    }
    
    public static SubLObject declare_constant_reader_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_reader", "constant_reader_macro_char", "CONSTANT-READER-MACRO-CHAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_reader", "constant_reader_prefix", "CONSTANT-READER-PREFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_reader", "sharpsign_dollar_rmf", "SHARPSIGN-DOLLAR-RMF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_reader", "find_constant_by_name", "FIND-CONSTANT-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_reader", "stream_forbids_constant_creation", "STREAM-FORBIDS-CONSTANT-CREATION", 1, 0, false);
        return (SubLObject)constant_reader.NIL;
    }
    
    public static SubLObject init_constant_reader_file() {
        constant_reader.$constant_reader_macro_char$ = SubLFiles.defconstant("*CONSTANT-READER-MACRO-CHAR*", (SubLObject)Characters.CHAR_dollar);
        constant_reader.$constant_reader_prefix$ = SubLFiles.defconstant("*CONSTANT-READER-PREFIX*", Sequences.cconcatenate((SubLObject)constant_reader.$str0$_, Strings.string(constant_reader.$constant_reader_macro_char$.getGlobalValue())));
        return (SubLObject)constant_reader.NIL;
    }
    
    public static SubLObject setup_constant_reader_file() {
        reader.set_dispatch_macro_character((SubLObject)Characters.CHAR_hash, constant_reader_macro_char(), (SubLObject)constant_reader.$sym5$SHARPSIGN_DOLLAR_RMF, (SubLObject)constant_reader.UNPROVIDED);
        return (SubLObject)constant_reader.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_constant_reader_file();
    }
    
    @Override
	public void initializeVariables() {
        init_constant_reader_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_constant_reader_file();
    }
    
    static {
        me = (SubLFile)new constant_reader();
        constant_reader.$constant_reader_macro_char$ = null;
        constant_reader.$constant_reader_prefix$ = null;
        $str0$_ = SubLObjectFactory.makeString("#");
        $str1$The__S_reader_macro_does_not_take = SubLObjectFactory.makeString("The ~S reader macro does not take an argument.");
        $int2$64 = SubLObjectFactory.makeInteger(64);
        $str3$_S_is_not_the_name_of_a_constant_ = SubLObjectFactory.makeString("~S is not the name of a constant.");
        $sym4$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym5$SHARPSIGN_DOLLAR_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-DOLLAR-RMF");
    }
}
