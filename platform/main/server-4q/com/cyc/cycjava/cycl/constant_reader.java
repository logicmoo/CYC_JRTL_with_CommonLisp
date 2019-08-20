/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANT-READER
 * source file: /cyc/top/cycl/constant-reader.lisp
 * created:     2019/07/03 17:37:18
 */
public final class constant_reader extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constant_reader();



    // defconstant
    // Definitions
    /**
     * The character that signals the reader that what follows is to be treated
     * as a CycL constant name
     */
    @LispMethod(comment = "The character that signals the reader that what follows is to be treated\r\nas a CycL constant name\ndefconstant\nThe character that signals the reader that what follows is to be treated\nas a CycL constant name")
    private static final SubLSymbol $constant_reader_macro_char$ = makeSymbol("*CONSTANT-READER-MACRO-CHAR*");

    // defconstant
    // The string that prefixes all CycL constant names
    /**
     * The string that prefixes all CycL constant names
     */
    @LispMethod(comment = "The string that prefixes all CycL constant names\ndefconstant")
    private static final SubLSymbol $constant_reader_prefix$ = makeSymbol("*CONSTANT-READER-PREFIX*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_ = makeString("#");

    static private final SubLString $str1$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");

    static private final SubLString $str3$_S_is_not_the_name_of_a_constant_ = makeString("~S is not the name of a constant.");

    private static final SubLSymbol SHARPSIGN_DOLLAR_RMF = makeSymbol("SHARPSIGN-DOLLAR-RMF");

    /**
     *
     *
     * @return CHARACTERP; The character that signals the reader that what follows is to be treated
    as a CycL constant name
     */
    @LispMethod(comment = "@return CHARACTERP; The character that signals the reader that what follows is to be treated\r\nas a CycL constant name")
    public static final SubLObject constant_reader_macro_char_alt() {
        return $constant_reader_macro_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return CHARACTERP; The character that signals the reader that what follows is to be treated
    as a CycL constant name
     */
    @LispMethod(comment = "@return CHARACTERP; The character that signals the reader that what follows is to be treated\r\nas a CycL constant name")
    public static SubLObject constant_reader_macro_char() {
        return $constant_reader_macro_char$.getGlobalValue();
    }

    /**
     *
     *
     * @return STRINGP; The string that prefixes all CycL constant names
     */
    @LispMethod(comment = "@return STRINGP; The string that prefixes all CycL constant names")
    public static final SubLObject constant_reader_prefix_alt() {
        return $constant_reader_prefix$.getGlobalValue();
    }

    /**
     *
     *
     * @return STRINGP; The string that prefixes all CycL constant names
     */
    @LispMethod(comment = "@return STRINGP; The string that prefixes all CycL constant names")
    public static SubLObject constant_reader_prefix() {
        return $constant_reader_prefix$.getGlobalValue();
    }

    public static final SubLObject sharpsign_dollar_rmf_alt(SubLObject stream, SubLObject ch, SubLObject arg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != arg) {
                simple_reader_error($str_alt1$The__S_reader_macro_does_not_take, list(ch));
            }
            {
                SubLObject length = $int$64;
                SubLObject buffer = Strings.make_string(length, UNPROVIDED);
                SubLObject i = ZERO_INTEGER;
                SubLObject next = read_char(stream, NIL, NIL, UNPROVIDED);
                while ((NIL != next) && (NIL != constant_completion_high.valid_constant_name_char_p(next))) {
                    if (i.numGE(length)) {
                        length = multiply(length, TWO_INTEGER);
                        {
                            SubLObject new_buffer = Strings.make_string(length, UNPROVIDED);
                            SubLObject j = NIL;
                            for (j = ZERO_INTEGER; j.numL(i); j = add(j, ONE_INTEGER)) {
                                Strings.set_char(new_buffer, j, Strings.sublisp_char(buffer, j));
                            }
                            buffer = new_buffer;
                        }
                    }
                    Strings.set_char(buffer, i, next);
                    i = add(i, ONE_INTEGER);
                    next = read_char(stream, NIL, NIL, UNPROVIDED);
                } 
                if (NIL != next) {
                    unread_char(next, stream);
                }
                if (NIL != $read_suppress$.getDynamicValue(thread)) {
                    return values(NIL, T);
                } else {
                    {
                        SubLObject name = (i.numE(length)) ? ((SubLObject) (buffer)) : subseq(buffer, ZERO_INTEGER, i);
                        SubLObject constant = com.cyc.cycjava.cycl.constant_reader.find_constant_by_name(name);
                        if (NIL != constant) {
                            return values(constant, T);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.constant_reader.stream_forbids_constant_creation(stream)) {
                                simple_reader_error($str_alt3$_S_is_not_the_name_of_a_constant_, list(name));
                            } else {
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    constant = reader_make_constant_shell(name);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        simple_reader_error(error_message, NIL);
                                    }
                                    return values(constant, T);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject find_constant_by_name_alt(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = NIL;
                {
                    SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding(thread);
                    try {
                        constant_completion_low.$require_valid_constants$.bind(NIL, thread);
                        constant = constant_completion_high.constant_complete_exact(name, UNPROVIDED, UNPROVIDED);
                    } finally {
                        constant_completion_low.$require_valid_constants$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == constant) {
                    constant = find_invalid_constant(name);
                }
                return constant;
            }
        }
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

    /**
     * Return T iff STREAM forbids the creation of constant shells for unknown constants.
     */
    @LispMethod(comment = "Return T iff STREAM forbids the creation of constant shells for unknown constants.")
    public static final SubLObject stream_forbids_constant_creation_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $read_require_constant_exists$.getDynamicValue(thread)) {
                return NIL;
            }
            return T;
        }
    }

    @LispMethod(comment = "Return T iff STREAM forbids the creation of constant shells for unknown constants.")
    public static SubLObject stream_forbids_constant_creation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $read_require_constant_exists$.getDynamicValue(thread)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject declare_constant_reader_file() {
        declareFunction("constant_reader_macro_char", "CONSTANT-READER-MACRO-CHAR", 0, 0, false);
        declareFunction("constant_reader_prefix", "CONSTANT-READER-PREFIX", 0, 0, false);
        declareFunction("sharpsign_dollar_rmf", "SHARPSIGN-DOLLAR-RMF", 3, 0, false);
        declareFunction("find_constant_by_name", "FIND-CONSTANT-BY-NAME", 1, 0, false);
        declareFunction("stream_forbids_constant_creation", "STREAM-FORBIDS-CONSTANT-CREATION", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_ = makeString("#");

    static private final SubLString $str_alt1$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");

    static private final SubLString $str_alt3$_S_is_not_the_name_of_a_constant_ = makeString("~S is not the name of a constant.");

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

    static {
    }
}

