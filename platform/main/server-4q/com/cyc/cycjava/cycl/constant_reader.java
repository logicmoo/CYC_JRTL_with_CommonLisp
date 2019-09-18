/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.find_invalid_constant;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$read_require_constant_exists$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_suppress$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.set_dispatch_macro_character;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.simple_reader_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.unread_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class constant_reader extends SubLTranslatedFile {
    public static final SubLFile me = new constant_reader();

    public static final String myName = "com.cyc.cycjava.cycl.constant_reader";

    public static final String myFingerPrint = "6a2258c4d1229cb28a5b3caa6a93d18a0228da4c9ade1491c17c39f661698cef";

    // defconstant
    private static final SubLSymbol $constant_reader_macro_char$ = makeSymbol("*CONSTANT-READER-MACRO-CHAR*");

    // defconstant
    // The string that prefixes all CycL constant names
    private static final SubLSymbol $constant_reader_prefix$ = makeSymbol("*CONSTANT-READER-PREFIX*");

    // Internal Constants
    public static final SubLString $str0$_ = makeString("#");

    public static final SubLString $str1$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");



    public static final SubLString $str3$_S_is_not_the_name_of_a_constant_ = makeString("~S is not the name of a constant.");



    public static final SubLSymbol SHARPSIGN_DOLLAR_RMF = makeSymbol("SHARPSIGN-DOLLAR-RMF");

    public static SubLObject constant_reader_macro_char() {
        return $constant_reader_macro_char$.getGlobalValue();
    }

    public static SubLObject constant_reader_prefix() {
        return $constant_reader_prefix$.getGlobalValue();
    }

    public static SubLObject sharpsign_dollar_rmf(final SubLObject stream, final SubLObject ch, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arg) {
            simple_reader_error($str1$The__S_reader_macro_does_not_take, list(ch));
        }
        SubLObject length = $int$64;
        SubLObject buffer = Strings.make_string(length, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject next;
        for (next = read_char(stream, NIL, NIL, UNPROVIDED); (NIL != next) && (NIL != constant_completion_high.valid_constant_name_char_p(next)); next = read_char(stream, NIL, NIL, UNPROVIDED)) {
            if (i.numGE(length)) {
                length = multiply(length, TWO_INTEGER);
                final SubLObject new_buffer = Strings.make_string(length, UNPROVIDED);
                SubLObject j;
                for (j = NIL, j = ZERO_INTEGER; j.numL(i); j = add(j, ONE_INTEGER)) {
                    Strings.set_char(new_buffer, j, Strings.sublisp_char(buffer, j));
                }
                buffer = new_buffer;
            }
            Strings.set_char(buffer, i, next);
            i = add(i, ONE_INTEGER);
        }
        if (NIL != next) {
            unread_char(next, stream);
        }
        if (NIL != $read_suppress$.getDynamicValue(thread)) {
            return values(NIL, T);
        }
        final SubLObject name = (i.numE(length)) ? buffer : subseq(buffer, ZERO_INTEGER, i);
        SubLObject constant = find_constant_by_name(name);
        if (NIL != constant) {
            return values(constant, T);
        }
        if (NIL != stream_forbids_constant_creation(stream)) {
            simple_reader_error($str3$_S_is_not_the_name_of_a_constant_, list(name));
            return NIL;
        }
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    constant = reader_make_constant_shell(name);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            simple_reader_error(error_message, NIL);
        }
        return values(constant, T);
    }

    public static SubLObject find_constant_by_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = NIL;
        final SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding(thread);
        try {
            constant_completion_low.$require_valid_constants$.bind(NIL, thread);
            constant = constant_completion_high.constant_complete_exact(name, UNPROVIDED, UNPROVIDED);
        } finally {
            constant_completion_low.$require_valid_constants$.rebind(_prev_bind_0, thread);
        }
        if (NIL == constant) {
            constant = find_invalid_constant(name);
        }
        if (NIL == constant) {
            if (ke.NIL == ke.$old_constant_names_table$.getGlobalValue()) {
                ke.initialize_old_constant_names();
            }
            constant = ke.old_constant_names(name).first();
            if (NIL != constant) {
                System.err.println(((";;; using old constant! " + constant) + " for ") + name);
            }
        }
        return constant;
    }

    public static SubLObject stream_forbids_constant_creation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $read_require_constant_exists$.getDynamicValue(thread)) {
            return NIL;
        }
		if (Startup.BOOTY_HACKZ)
			return NIL;
        return T;
    }

    public static SubLObject declare_constant_reader_file() {
        declareFunction(me, "constant_reader_macro_char", "CONSTANT-READER-MACRO-CHAR", 0, 0, false);
        declareFunction(me, "constant_reader_prefix", "CONSTANT-READER-PREFIX", 0, 0, false);
        declareFunction(me, "sharpsign_dollar_rmf", "SHARPSIGN-DOLLAR-RMF", 3, 0, false);
        declareFunction(me, "find_constant_by_name", "FIND-CONSTANT-BY-NAME", 1, 0, false);
        declareFunction(me, "stream_forbids_constant_creation", "STREAM-FORBIDS-CONSTANT-CREATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_constant_reader_file() {
        defconstant("*CONSTANT-READER-MACRO-CHAR*", CHAR_dollar);
        defconstant("*CONSTANT-READER-PREFIX*", cconcatenate($str0$_, Strings.string($constant_reader_macro_char$.getGlobalValue())));
        return NIL;
    }

    public static SubLObject setup_constant_reader_file() {
        set_dispatch_macro_character(CHAR_hash, constant_reader_macro_char(), SHARPSIGN_DOLLAR_RMF, UNPROVIDED);
        return NIL;
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

}

