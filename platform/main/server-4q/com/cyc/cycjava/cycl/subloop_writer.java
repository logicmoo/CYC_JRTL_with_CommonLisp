package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class subloop_writer extends SubLTranslatedFile {
    public static final SubLFile me = new subloop_writer();

    public static final String myName = "com.cyc.cycjava.cycl.subloop_writer";

    public static final String myFingerPrint = "6920982fea837b23df3dd47bcb75eb0baf4749cb20771f30acc7714c32005182";

    // Internal Constants
    public static final SubLSymbol SUBLOOP_WRITER = makeSymbol("SUBLOOP-WRITER");



    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("OPEN-FN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTSTREAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeSymbol("*STANDARD-OUTPUT*")), list(makeSymbol("INDENT-NUM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDENT-INCREMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREASE-INDENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DECREASE-INDENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INDENT-INCREMENT"), list(makeSymbol("INTEGER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STREAM"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FLUSH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLOSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-OBJECT"), list(makeSymbol("OBJECT"), makeSymbol("INDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-STRING"), list(makeSymbol("STRING"), makeSymbol("INDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-LINE"), list(makeSymbol("STRING"), makeSymbol("INDENT")), makeKeyword("PUBLIC")) });

    public static final SubLSymbol INDENT_INCREMENT = makeSymbol("INDENT-INCREMENT");





    public static final SubLSymbol OPEN_FN = makeSymbol("OPEN-FN");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-INSTANCE");

    public static final SubLSymbol INCREASE_INDENT = makeSymbol("INCREASE-INDENT");

    public static final SubLList $list13 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list14 = list(list(makeSymbol("CSETQ"), makeSymbol("INDENT-NUM"), list(makeSymbol("+"), makeSymbol("INDENT-NUM"), makeSymbol("INDENT-INCREMENT"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD");

    public static final SubLSymbol SUBLOOP_WRITER_INCREASE_INDENT_METHOD = makeSymbol("SUBLOOP-WRITER-INCREASE-INDENT-METHOD");

    public static final SubLSymbol DECREASE_INDENT = makeSymbol("DECREASE-INDENT");

    public static final SubLList $list18 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INDENT-NUM"), list(makeSymbol("-"), makeSymbol("INDENT-NUM"), makeSymbol("INDENT-INCREMENT")))), list(makeSymbol("PIF"), list(makeSymbol(">"), ZERO_INTEGER, makeSymbol("NEW-INDENT-NUM")), list(makeSymbol("WARN"), makeString("~%Cannot assign negative indentation")), list(makeSymbol("CSETQ"), makeSymbol("INDENT-NUM"), makeSymbol("NEW-INDENT-NUM")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD");

    public static final SubLString $str20$__Cannot_assign_negative_indentat = makeString("~%Cannot assign negative indentation");

    public static final SubLSymbol SUBLOOP_WRITER_DECREASE_INDENT_METHOD = makeSymbol("SUBLOOP-WRITER-DECREASE-INDENT-METHOD");

    public static final SubLSymbol SET_INDENT_INCREMENT = makeSymbol("SET-INDENT-INCREMENT");

    public static final SubLList $list23 = list(makeSymbol("NUM"));

    public static final SubLList $list24 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NUM"), makeSymbol("INTEGERP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUM"), makeSymbol("PLUSP")), list(makeSymbol("CSETQ"), makeSymbol("INDENT-INCREMENT"), makeSymbol("NUM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SUBLOOP-WRITER-METHOD");





    public static final SubLSymbol SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD = makeSymbol("SUBLOOP-WRITER-SET-INDENT-INCREMENT-METHOD");

    public static final SubLSymbol TEXT_WRITER = makeSymbol("TEXT-WRITER");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-INSTANCE");



    public static final SubLList $list33 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list34 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("OPEN-FN"), list(makeSymbol("FUNCTION"), makeSymbol("OPEN-TEXT"))), list(makeSymbol("CSETQ"), makeSymbol("INDENT-NUM"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("INDENT-INCREMENT"), TWO_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");



    public static final SubLSymbol TEXT_WRITER_INITIALIZE_METHOD = makeSymbol("TEXT-WRITER-INITIALIZE-METHOD");



    public static final SubLList $list39 = list(makeSymbol("OUT-STREAM"));

    public static final SubLList $list40 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OUT-STREAM"), makeSymbol("STREAMP")), list(makeSymbol("CSETQ"), makeSymbol("OUTSTREAM"), makeSymbol("OUT-STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");



    public static final SubLSymbol TEXT_WRITER_SET_STREAM_METHOD = makeSymbol("TEXT-WRITER-SET-STREAM-METHOD");

    public static final SubLSymbol SET_STREAM_FROM_FILE_NAME = makeSymbol("SET-STREAM-FROM-FILE-NAME");

    public static final SubLList $list45 = list(makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("DIRECTION"), makeKeyword("OUTPUT")));

    public static final SubLList $list46 = list(list(makeSymbol("ENSURE-PRIVATE-STREAM"), list(makeSymbol("CSETQ"), makeSymbol("OUTSTREAM"), list(makeSymbol("FUNCALL"), makeSymbol("OPEN-FN"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")))), list(makeSymbol("RET"), makeSymbol("SELF")));



    public static final SubLSymbol $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");

    public static final SubLSymbol TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD = makeSymbol("TEXT-WRITER-SET-STREAM-FROM-FILE-NAME-METHOD");

    public static final SubLSymbol FLUSH = makeSymbol("FLUSH");

    public static final SubLList $list51 = list(list(makeSymbol("FINISH-OUTPUT"), makeSymbol("OUTSTREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");

    public static final SubLSymbol TEXT_WRITER_FLUSH_METHOD = makeSymbol("TEXT-WRITER-FLUSH-METHOD");



    public static final SubLList $list55 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FLUSH"))), list(makeSymbol("CLOSE"), makeSymbol("OUTSTREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");

    public static final SubLSymbol TEXT_WRITER_CLOSE_METHOD = makeSymbol("TEXT-WRITER-CLOSE-METHOD");

    public static final SubLSymbol PRINT_OBJECT = makeSymbol("PRINT-OBJECT");

    public static final SubLList $list59 = list(makeSymbol("OBJECT"), makeSymbol("INDENT"));

    public static final SubLList $list60 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("FORMAT"), NIL, makeString("~A"), makeSymbol("OBJECT")))), list(makeSymbol("PWHEN"), makeSymbol("INDENT"), list(makeSymbol("INDENT"), makeSymbol("OUTSTREAM"), makeSymbol("INDENT-NUM"))), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("OUTSTREAM")), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");

    public static final SubLString $str62$_A = makeString("~A");

    public static final SubLSymbol TEXT_WRITER_PRINT_OBJECT_METHOD = makeSymbol("TEXT-WRITER-PRINT-OBJECT-METHOD");

    public static final SubLSymbol PRINT_STRING = makeSymbol("PRINT-STRING");

    public static final SubLList $list65 = list(makeSymbol("STRING"), makeSymbol("INDENT"));

    public static final SubLList $list66 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), makeSymbol("INDENT"), list(makeSymbol("INDENT"), makeSymbol("OUTSTREAM"), makeSymbol("INDENT-NUM"))), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("OUTSTREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");



    public static final SubLSymbol TEXT_WRITER_PRINT_STRING_METHOD = makeSymbol("TEXT-WRITER-PRINT-STRING-METHOD");

    public static final SubLSymbol PRINT_LINE = makeSymbol("PRINT-LINE");

    public static final SubLList $list71 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), makeSymbol("INDENT"), list(makeSymbol("INDENT"), makeSymbol("OUTSTREAM"), makeSymbol("INDENT-NUM"))), list(makeSymbol("WRITE-LINE"), makeSymbol("STRING"), makeSymbol("OUTSTREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-WRITER-METHOD");

    public static final SubLSymbol TEXT_WRITER_PRINT_LINE_METHOD = makeSymbol("TEXT-WRITER-PRINT-LINE-METHOD");

    public static SubLObject get_subloop_writer_indent_increment(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, FOUR_INTEGER, INDENT_INCREMENT);
    }

    public static SubLObject set_subloop_writer_indent_increment(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, FOUR_INTEGER, INDENT_INCREMENT);
    }

    public static SubLObject get_subloop_writer_indent_num(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, THREE_INTEGER, INDENT_NUM);
    }

    public static SubLObject set_subloop_writer_indent_num(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, THREE_INTEGER, INDENT_NUM);
    }

    public static SubLObject get_subloop_writer_outstream(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, TWO_INTEGER, OUTSTREAM);
    }

    public static SubLObject set_subloop_writer_outstream(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, TWO_INTEGER, OUTSTREAM);
    }

    public static SubLObject get_subloop_writer_open_fn(final SubLObject v_subloop_writer) {
        return classes.subloop_get_access_protected_instance_slot(v_subloop_writer, ONE_INTEGER, OPEN_FN);
    }

    public static SubLObject set_subloop_writer_open_fn(final SubLObject v_subloop_writer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_subloop_writer, value, ONE_INTEGER, OPEN_FN);
    }

    public static SubLObject subloop_reserved_initialize_subloop_writer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_subloop_writer_instance(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, OPEN_FN, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, INDENT_NUM, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, INDENT_INCREMENT, NIL);
        return NIL;
    }

    public static SubLObject subloop_writer_p(final SubLObject v_subloop_writer) {
        return classes.subloop_instanceof_class(v_subloop_writer, SUBLOOP_WRITER);
    }

    public static SubLObject subloop_writer_increase_indent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_subloop_writer_method = NIL;
        final SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        SubLObject indent_num = get_subloop_writer_indent_num(self);
        try {
            thread.throwStack.push($sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
            try {
                indent_num = add(indent_num, indent_increment);
                sublisp_throw($sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    set_subloop_writer_indent_num(self, indent_num);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_subloop_writer_method = Errors.handleThrowable(ccatch_env_var, $sym15$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_subloop_writer_method;
    }

    public static SubLObject subloop_writer_decrease_indent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_subloop_writer_method = NIL;
        final SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        SubLObject indent_num = get_subloop_writer_indent_num(self);
        try {
            thread.throwStack.push($sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
            try {
                final SubLObject new_indent_num = subtract(indent_num, indent_increment);
                if (ZERO_INTEGER.numG(new_indent_num)) {
                    Errors.warn($str20$__Cannot_assign_negative_indentat);
                } else {
                    indent_num = new_indent_num;
                }
                sublisp_throw($sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    set_subloop_writer_indent_num(self, indent_num);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_subloop_writer_method = Errors.handleThrowable(ccatch_env_var, $sym19$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_subloop_writer_method;
    }

    public static SubLObject subloop_writer_set_indent_increment_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_subloop_writer_method = NIL;
        SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        try {
            thread.throwStack.push($sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
            try {
                assert NIL != integerp(num) : "Types.integerp(num) " + "CommonSymbols.NIL != Types.integerp(num) " + num;
                assert NIL != plusp(num) : "Numbers.plusp(num) " + "CommonSymbols.NIL != Numbers.plusp(num) " + num;
                indent_increment = num;
                sublisp_throw($sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_subloop_writer_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_SUBLOOP_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_subloop_writer_method;
    }

    public static SubLObject subloop_reserved_initialize_text_writer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_text_writer_instance(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, OPEN_FN, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, OUTSTREAM, StreamsLow.$standard_output$.getDynamicValue(thread));
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, INDENT_NUM, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLOOP_WRITER, INDENT_INCREMENT, NIL);
        return NIL;
    }

    public static SubLObject text_writer_p(final SubLObject text_writer) {
        return classes.subloop_instanceof_class(text_writer, TEXT_WRITER);
    }

    public static SubLObject text_writer_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        SubLObject indent_increment = get_subloop_writer_indent_increment(self);
        SubLObject indent_num = get_subloop_writer_indent_num(self);
        SubLObject open_fn = get_subloop_writer_open_fn(self);
        try {
            thread.throwStack.push($sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                object.object_initialize_method(self);
                open_fn = symbol_function(OPEN_TEXT);
                indent_num = ZERO_INTEGER;
                indent_increment = TWO_INTEGER;
                sublisp_throw($sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_increment(self, indent_increment);
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_open_fn(self, open_fn);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_set_stream_method(final SubLObject self, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                assert NIL != streamp(out_stream) : "Types.streamp(out_stream) " + "CommonSymbols.NIL != Types.streamp(out_stream) " + out_stream;
                outstream = out_stream;
                sublisp_throw($sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_set_stream_from_file_name_method(final SubLObject self, final SubLObject filename, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = $OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        SubLObject outstream = get_subloop_writer_outstream(self);
        final SubLObject open_fn = get_subloop_writer_open_fn(self);
        try {
            thread.throwStack.push($sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    outstream = funcall(open_fn, filename, direction);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                sublisp_throw($sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    set_subloop_writer_open_fn(self, open_fn);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_flush_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                finish_output(outstream);
                sublisp_throw($sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_close_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(self, FLUSH);
                close(outstream, UNPROVIDED);
                sublisp_throw($sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_print_object_method(final SubLObject self, final SubLObject v_object, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        final SubLObject indent_num = get_subloop_writer_indent_num(self);
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                final SubLObject string = format(NIL, $str62$_A, v_object);
                if (NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                write_string(string, outstream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_print_string_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        final SubLObject indent_num = get_subloop_writer_indent_num(self);
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                if (NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                write_string(string, outstream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject text_writer_print_line_method(final SubLObject self, final SubLObject string, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_writer_method = NIL;
        final SubLObject indent_num = get_subloop_writer_indent_num(self);
        final SubLObject outstream = get_subloop_writer_outstream(self);
        try {
            thread.throwStack.push($sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                if (NIL != indent) {
                    string_utilities.indent(outstream, indent_num);
                }
                write_line(string, outstream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_subloop_writer_indent_num(self, indent_num);
                    set_subloop_writer_outstream(self, outstream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_writer_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_TEXT_WRITER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_writer_method;
    }

    public static SubLObject declare_subloop_writer_file() {
        declareFunction(me, "get_subloop_writer_indent_increment", "GET-SUBLOOP-WRITER-INDENT-INCREMENT", 1, 0, false);
        declareFunction(me, "set_subloop_writer_indent_increment", "SET-SUBLOOP-WRITER-INDENT-INCREMENT", 2, 0, false);
        declareFunction(me, "get_subloop_writer_indent_num", "GET-SUBLOOP-WRITER-INDENT-NUM", 1, 0, false);
        declareFunction(me, "set_subloop_writer_indent_num", "SET-SUBLOOP-WRITER-INDENT-NUM", 2, 0, false);
        declareFunction(me, "get_subloop_writer_outstream", "GET-SUBLOOP-WRITER-OUTSTREAM", 1, 0, false);
        declareFunction(me, "set_subloop_writer_outstream", "SET-SUBLOOP-WRITER-OUTSTREAM", 2, 0, false);
        declareFunction(me, "get_subloop_writer_open_fn", "GET-SUBLOOP-WRITER-OPEN-FN", 1, 0, false);
        declareFunction(me, "set_subloop_writer_open_fn", "SET-SUBLOOP-WRITER-OPEN-FN", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_subloop_writer_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_subloop_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-WRITER-INSTANCE", 1, 0, false);
        declareFunction(me, "subloop_writer_p", "SUBLOOP-WRITER-P", 1, 0, false);
        declareFunction(me, "subloop_writer_increase_indent_method", "SUBLOOP-WRITER-INCREASE-INDENT-METHOD", 1, 0, false);
        declareFunction(me, "subloop_writer_decrease_indent_method", "SUBLOOP-WRITER-DECREASE-INDENT-METHOD", 1, 0, false);
        declareFunction(me, "subloop_writer_set_indent_increment_method", "SUBLOOP-WRITER-SET-INDENT-INCREMENT-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_text_writer_class", "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_text_writer_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXT-WRITER-INSTANCE", 1, 0, false);
        declareFunction(me, "text_writer_p", "TEXT-WRITER-P", 1, 0, false);
        declareFunction(me, "text_writer_initialize_method", "TEXT-WRITER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "text_writer_set_stream_method", "TEXT-WRITER-SET-STREAM-METHOD", 2, 0, false);
        declareFunction(me, "text_writer_set_stream_from_file_name_method", "TEXT-WRITER-SET-STREAM-FROM-FILE-NAME-METHOD", 2, 1, false);
        declareFunction(me, "text_writer_flush_method", "TEXT-WRITER-FLUSH-METHOD", 1, 0, false);
        declareFunction(me, "text_writer_close_method", "TEXT-WRITER-CLOSE-METHOD", 1, 0, false);
        declareFunction(me, "text_writer_print_object_method", "TEXT-WRITER-PRINT-OBJECT-METHOD", 3, 0, false);
        declareFunction(me, "text_writer_print_string_method", "TEXT-WRITER-PRINT-STRING-METHOD", 3, 0, false);
        declareFunction(me, "text_writer_print_line_method", "TEXT-WRITER-PRINT-LINE-METHOD", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_subloop_writer_file() {
        return NIL;
    }

    public static SubLObject setup_subloop_writer_file() {
        classes.subloop_new_class(SUBLOOP_WRITER, OBJECT, NIL, T, $list2);
        classes.class_set_implements_slot_listeners(SUBLOOP_WRITER, NIL);
        classes.subloop_note_class_initialization_function(SUBLOOP_WRITER, SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_CLASS);
        classes.subloop_note_instance_initialization_function(SUBLOOP_WRITER, SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_WRITER_INSTANCE);
        subloop_reserved_initialize_subloop_writer_class(SUBLOOP_WRITER);
        methods.methods_incorporate_instance_method(INCREASE_INDENT, SUBLOOP_WRITER, $list13, NIL, $list14);
        methods.subloop_register_instance_method(SUBLOOP_WRITER, INCREASE_INDENT, SUBLOOP_WRITER_INCREASE_INDENT_METHOD);
        methods.methods_incorporate_instance_method(DECREASE_INDENT, SUBLOOP_WRITER, $list13, NIL, $list18);
        methods.subloop_register_instance_method(SUBLOOP_WRITER, DECREASE_INDENT, SUBLOOP_WRITER_DECREASE_INDENT_METHOD);
        methods.methods_incorporate_instance_method(SET_INDENT_INCREMENT, SUBLOOP_WRITER, $list13, $list23, $list24);
        methods.subloop_register_instance_method(SUBLOOP_WRITER, SET_INDENT_INCREMENT, SUBLOOP_WRITER_SET_INDENT_INCREMENT_METHOD);
        classes.subloop_new_class(TEXT_WRITER, SUBLOOP_WRITER, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(TEXT_WRITER, NIL);
        classes.subloop_note_class_initialization_function(TEXT_WRITER, SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_CLASS);
        classes.subloop_note_instance_initialization_function(TEXT_WRITER, SUBLOOP_RESERVED_INITIALIZE_TEXT_WRITER_INSTANCE);
        subloop_reserved_initialize_text_writer_class(TEXT_WRITER);
        methods.methods_incorporate_instance_method(INITIALIZE, TEXT_WRITER, $list33, NIL, $list34);
        methods.subloop_register_instance_method(TEXT_WRITER, INITIALIZE, TEXT_WRITER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_STREAM, TEXT_WRITER, $list13, $list39, $list40);
        methods.subloop_register_instance_method(TEXT_WRITER, SET_STREAM, TEXT_WRITER_SET_STREAM_METHOD);
        methods.methods_incorporate_instance_method(SET_STREAM_FROM_FILE_NAME, TEXT_WRITER, $list13, $list45, $list46);
        methods.subloop_register_instance_method(TEXT_WRITER, SET_STREAM_FROM_FILE_NAME, TEXT_WRITER_SET_STREAM_FROM_FILE_NAME_METHOD);
        methods.methods_incorporate_instance_method(FLUSH, TEXT_WRITER, $list13, NIL, $list51);
        methods.subloop_register_instance_method(TEXT_WRITER, FLUSH, TEXT_WRITER_FLUSH_METHOD);
        methods.methods_incorporate_instance_method(CLOSE, TEXT_WRITER, $list13, NIL, $list55);
        methods.subloop_register_instance_method(TEXT_WRITER, CLOSE, TEXT_WRITER_CLOSE_METHOD);
        methods.methods_incorporate_instance_method(PRINT_OBJECT, TEXT_WRITER, $list13, $list59, $list60);
        methods.subloop_register_instance_method(TEXT_WRITER, PRINT_OBJECT, TEXT_WRITER_PRINT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(PRINT_STRING, TEXT_WRITER, $list13, $list65, $list66);
        methods.subloop_register_instance_method(TEXT_WRITER, PRINT_STRING, TEXT_WRITER_PRINT_STRING_METHOD);
        methods.methods_incorporate_instance_method(PRINT_LINE, TEXT_WRITER, $list13, $list65, $list71);
        methods.subloop_register_instance_method(TEXT_WRITER, PRINT_LINE, TEXT_WRITER_PRINT_LINE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subloop_writer_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_writer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_writer_file();
    }

    
}

/**
 * Total time: 223 ms
 */
