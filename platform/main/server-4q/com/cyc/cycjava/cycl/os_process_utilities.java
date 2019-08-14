/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sequencep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.input_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OS-PROCESS-UTILITIES
 * source file: /cyc/top/cycl/os-process-utilities.lisp
 * created:     2019/07/03 17:37:13
 */
public final class os_process_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new os_process_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.os_process_utilities";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_os_process_impl$ = makeSymbol("*DTP-OS-PROCESS-IMPL*");

    // defconstant
    // The valid OS process status values.
    /**
     * The valid OS process status values.
     */
    @LispMethod(comment = "The valid OS process status values.\ndefconstant")
    private static final SubLSymbol $valid_os_process_status$ = makeSymbol("*VALID-OS-PROCESS-STATUS*");

    // defparameter
    /**
     * Used to communicate the user's task between the forking CYC server and the
     * child, which has to run system code initialization setup first.
     */
    @LispMethod(comment = "Used to communicate the user\'s task between the forking CYC server and the\r\nchild, which has to run system code initialization setup first.\ndefparameter\nUsed to communicate the user\'s task between the forking CYC server and the\nchild, which has to run system code initialization setup first.")
    private static final SubLSymbol $forked_cyc_server_process_task$ = makeSymbol("*FORKED-CYC-SERVER-PROCESS-TASK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol OS_PROCESS_IMPL = makeSymbol("OS-PROCESS-IMPL");

    private static final SubLSymbol OS_PROCESS_IMPL_P = makeSymbol("OS-PROCESS-IMPL-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("PROGRAM"), makeSymbol("ARGUMENTS"), makeSymbol("STDIN-STREAM"), makeSymbol("STDIN-FILENAME"), makeSymbol("STDOUT-STREAM"), makeSymbol("STDOUT-FILENAME"), makeSymbol("STDERR-STREAM"), makeSymbol("STDERR-FILENAME"), makeSymbol("STATUS"), makeSymbol("STARTED"), makeSymbol("FINISHED"), makeSymbol("EXIT-CODE"), makeSymbol("PROPERTIES") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("ID"), $NAME, makeKeyword("PROGRAM"), makeKeyword("ARGUMENTS"), makeKeyword("STDIN-STREAM"), makeKeyword("STDIN-FILENAME"), makeKeyword("STDOUT-STREAM"), makeKeyword("STDOUT-FILENAME"), makeKeyword("STDERR-STREAM"), makeKeyword("STDERR-FILENAME"), makeKeyword("STATUS"), makeKeyword("STARTED"), makeKeyword("FINISHED"), makeKeyword("EXIT-CODE"), makeKeyword("PROPERTIES") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("OS-PROCESS-IMPL-ID"), makeSymbol("OS-PROCESS-IMPL-NAME"), makeSymbol("OS-PROCESS-IMPL-PROGRAM"), makeSymbol("OS-PROCESS-IMPL-ARGUMENTS"), makeSymbol("OS-PROCESS-IMPL-STDIN-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDIN-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STDOUT-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDOUT-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STDERR-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDERR-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STATUS"), makeSymbol("OS-PROCESS-IMPL-STARTED"), makeSymbol("OS-PROCESS-IMPL-FINISHED"), makeSymbol("OS-PROCESS-IMPL-EXIT-CODE"), makeSymbol("OS-PROCESS-IMPL-PROPERTIES") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-OS-PROCESS-IMPL-ID"), makeSymbol("_CSETF-OS-PROCESS-IMPL-NAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-PROGRAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-ARGUMENTS"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STATUS"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STARTED"), makeSymbol("_CSETF-OS-PROCESS-IMPL-FINISHED"), makeSymbol("_CSETF-OS-PROCESS-IMPL-EXIT-CODE"), makeSymbol("_CSETF-OS-PROCESS-IMPL-PROPERTIES") });

    private static final SubLSymbol PRINT_OS_PROCESS_IMPL = makeSymbol("PRINT-OS-PROCESS-IMPL");

    private static final SubLSymbol OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OS-PROCESS-IMPL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("OS-PROCESS-IMPL-P"));

    private static final SubLSymbol OS_PROCESS_IMPL_ID = makeSymbol("OS-PROCESS-IMPL-ID");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_ID = makeSymbol("_CSETF-OS-PROCESS-IMPL-ID");

    private static final SubLSymbol OS_PROCESS_IMPL_NAME = makeSymbol("OS-PROCESS-IMPL-NAME");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_NAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-NAME");

    private static final SubLSymbol OS_PROCESS_IMPL_PROGRAM = makeSymbol("OS-PROCESS-IMPL-PROGRAM");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_PROGRAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-PROGRAM");

    private static final SubLSymbol OS_PROCESS_IMPL_ARGUMENTS = makeSymbol("OS-PROCESS-IMPL-ARGUMENTS");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_ARGUMENTS = makeSymbol("_CSETF-OS-PROCESS-IMPL-ARGUMENTS");

    private static final SubLSymbol OS_PROCESS_IMPL_STDIN_STREAM = makeSymbol("OS-PROCESS-IMPL-STDIN-STREAM");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STDIN_STREAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-STREAM");

    private static final SubLSymbol OS_PROCESS_IMPL_STDIN_FILENAME = makeSymbol("OS-PROCESS-IMPL-STDIN-FILENAME");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STDIN_FILENAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME");

    private static final SubLSymbol OS_PROCESS_IMPL_STDOUT_STREAM = makeSymbol("OS-PROCESS-IMPL-STDOUT-STREAM");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STDOUT_STREAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM");

    private static final SubLSymbol OS_PROCESS_IMPL_STDOUT_FILENAME = makeSymbol("OS-PROCESS-IMPL-STDOUT-FILENAME");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME");

    private static final SubLSymbol OS_PROCESS_IMPL_STDERR_STREAM = makeSymbol("OS-PROCESS-IMPL-STDERR-STREAM");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STDERR_STREAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-STREAM");

    private static final SubLSymbol OS_PROCESS_IMPL_STDERR_FILENAME = makeSymbol("OS-PROCESS-IMPL-STDERR-FILENAME");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STDERR_FILENAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME");

    private static final SubLSymbol OS_PROCESS_IMPL_STATUS = makeSymbol("OS-PROCESS-IMPL-STATUS");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STATUS = makeSymbol("_CSETF-OS-PROCESS-IMPL-STATUS");

    private static final SubLSymbol OS_PROCESS_IMPL_STARTED = makeSymbol("OS-PROCESS-IMPL-STARTED");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_STARTED = makeSymbol("_CSETF-OS-PROCESS-IMPL-STARTED");

    private static final SubLSymbol OS_PROCESS_IMPL_FINISHED = makeSymbol("OS-PROCESS-IMPL-FINISHED");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_FINISHED = makeSymbol("_CSETF-OS-PROCESS-IMPL-FINISHED");

    private static final SubLSymbol OS_PROCESS_IMPL_EXIT_CODE = makeSymbol("OS-PROCESS-IMPL-EXIT-CODE");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_EXIT_CODE = makeSymbol("_CSETF-OS-PROCESS-IMPL-EXIT-CODE");

    private static final SubLSymbol OS_PROCESS_IMPL_PROPERTIES = makeSymbol("OS-PROCESS-IMPL-PROPERTIES");

    private static final SubLSymbol _CSETF_OS_PROCESS_IMPL_PROPERTIES = makeSymbol("_CSETF-OS-PROCESS-IMPL-PROPERTIES");

    private static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_OS_PROCESS_IMPL = makeSymbol("MAKE-OS-PROCESS-IMPL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_OS_PROCESS_IMPL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-OS-PROCESS-IMPL-METHOD");

    private static final SubLString $str60$__OS_PROCESS_ = makeString("#<OS-PROCESS ");

    private static final SubLString $str61$_A__S__A__S__A = makeString("~A ~S ~A ~S ~A");

    private static final SubLString $str62$_ = makeString(">");

    private static final SubLList $list65 = list(makeKeyword("INITIALIZING"), makeKeyword("RUNNING"), $DEAD, makeKeyword("FAILURE"));

    private static final SubLSymbol $os_process_enumeration_lock$ = makeSymbol("*OS-PROCESS-ENUMERATION-LOCK*");

    private static final SubLString $$$OS_Process_enumeration_lock = makeString("OS Process enumeration lock");

    private static final SubLSymbol $active_os_processes$ = makeSymbol("*ACTIVE-OS-PROCESSES*");

    private static final SubLString $str69$_A___A____A__A__ = makeString("~A (~A): ~A ~A~%");

    private static final SubLString $str70$Trying_to_remove_missing_OS_proce = makeString("Trying to remove missing OS process ~A from active process list");

    private static final SubLSymbol VALID_OS_PROCESS_INPUT_STREAM_SPEC_P = makeSymbol("VALID-OS-PROCESS-INPUT-STREAM-SPEC-P");

    private static final SubLSymbol VALID_OS_PROCESS_ERROR_OUTPUT_STREAM_SPEC_P = makeSymbol("VALID-OS-PROCESS-ERROR-OUTPUT-STREAM-SPEC-P");

    private static final SubLSymbol VALID_OS_PROCESS_OUTPUT_STREAM_SPEC_P = makeSymbol("VALID-OS-PROCESS-OUTPUT-STREAM-SPEC-P");

    private static final SubLSymbol OS_PROCESS_P = makeSymbol("OS-PROCESS-P");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLString $str81$Currently_not_implemented_for_thi = makeString("Currently not implemented for this port.");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str84$Currently_not_implemented_ = makeString("Currently not implemented.");

    private static final SubLList $list85 = list(list(makeSymbol("OS-PROCESS-VAR"), makeSymbol("COMMAND"), makeSymbol("&KEY"), list(makeSymbol("ARGS"), NIL), list(makeSymbol("NAME"), makeString("My OS process")), list(makeSymbol("STDIN"), list(QUOTE, makeSymbol("*STANDARD-INPUT*"))), list(makeSymbol("STDOUT"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("STDERR"), makeKeyword("OUTPUT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list86 = list($ARGS, $NAME, makeKeyword("STDIN"), makeKeyword("STDOUT"), makeKeyword("STDERR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $$$My_OS_process = makeString("My OS process");

    private static final SubLSymbol $standard_input$ = makeSymbol("*STANDARD-INPUT*");

    private static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

    private static final SubLSymbol MAKE_OS_PROCESS = makeSymbol("MAKE-OS-PROCESS");

    private static final SubLSymbol DESTROY_OS_PROCESS = makeSymbol("DESTROY-OS-PROCESS");

    private static final SubLSymbol RUN_OS_PROCESS = makeSymbol("RUN-OS-PROCESS");

    private static final SubLSymbol WAIT_UNTIL_OS_PROCESS_FINISHED = makeSymbol("WAIT-UNTIL-OS-PROCESS-FINISHED");

    private static final SubLString $str102$My_system_eval_OS_Process = makeString("My system-eval OS Process");

    private static final SubLString $str103$My_system_eval_OS_Process_outputt = makeString("My system-eval OS Process outputting to ");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol FORK_CYC_SERVER_PROCESS = makeSymbol("FORK-CYC-SERVER-PROCESS");

    private static final SubLSymbol FORK_CYC_SERVER_PROCESS_IMPLEMENTATION = makeSymbol("FORK-CYC-SERVER-PROCESS-IMPLEMENTATION");

    public static final SubLObject os_process_impl_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_os_process_impl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject os_process_impl_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_os_process_impl(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject os_process_impl_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.os_process_utilities.$os_process_impl_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject os_process_impl_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.os_process_utilities.$os_process_impl_native.class ? T : NIL;
    }

    public static final SubLObject os_process_impl_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField2();
    }

    public static SubLObject os_process_impl_id(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject os_process_impl_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField3();
    }

    public static SubLObject os_process_impl_name(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject os_process_impl_program_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField4();
    }

    public static SubLObject os_process_impl_program(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject os_process_impl_arguments_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField5();
    }

    public static SubLObject os_process_impl_arguments(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject os_process_impl_stdin_stream_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField6();
    }

    public static SubLObject os_process_impl_stdin_stream(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject os_process_impl_stdin_filename_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField7();
    }

    public static SubLObject os_process_impl_stdin_filename(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject os_process_impl_stdout_stream_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField8();
    }

    public static SubLObject os_process_impl_stdout_stream(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject os_process_impl_stdout_filename_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField9();
    }

    public static SubLObject os_process_impl_stdout_filename(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject os_process_impl_stderr_stream_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField10();
    }

    public static SubLObject os_process_impl_stderr_stream(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject os_process_impl_stderr_filename_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField11();
    }

    public static SubLObject os_process_impl_stderr_filename(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject os_process_impl_status_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField12();
    }

    public static SubLObject os_process_impl_status(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject os_process_impl_started_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField13();
    }

    public static SubLObject os_process_impl_started(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject os_process_impl_finished_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField14();
    }

    public static SubLObject os_process_impl_finished(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject os_process_impl_exit_code_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField15();
    }

    public static SubLObject os_process_impl_exit_code(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject os_process_impl_properties_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.getField16();
    }

    public static SubLObject os_process_impl_properties(final SubLObject v_object) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject _csetf_os_process_impl_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_os_process_impl_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_os_process_impl_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_os_process_impl_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_os_process_impl_program_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_os_process_impl_program(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_os_process_impl_arguments_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_os_process_impl_arguments(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_os_process_impl_stdin_stream_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_os_process_impl_stdin_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_os_process_impl_stdin_filename_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_os_process_impl_stdin_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_os_process_impl_stdout_stream_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_os_process_impl_stdout_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_os_process_impl_stdout_filename_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_os_process_impl_stdout_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_os_process_impl_stderr_stream_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_os_process_impl_stderr_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_os_process_impl_stderr_filename_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_os_process_impl_stderr_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_os_process_impl_status_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_os_process_impl_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_os_process_impl_started_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_os_process_impl_started(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_os_process_impl_finished_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_os_process_impl_finished(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_os_process_impl_exit_code_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_os_process_impl_exit_code(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_os_process_impl_properties_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, OS_PROCESS_IMPL_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_os_process_impl_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != os_process_impl_p(v_object) : "! os_process_utilities.os_process_impl_p(v_object) " + "os_process_utilities.os_process_impl_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject make_os_process_impl_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.os_process_utilities.$os_process_impl_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_os_process_impl_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NAME)) {
                            _csetf_os_process_impl_name(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PROGRAM)) {
                                _csetf_os_process_impl_program(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ARGUMENTS)) {
                                    _csetf_os_process_impl_arguments(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($STDIN_STREAM)) {
                                        _csetf_os_process_impl_stdin_stream(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($STDIN_FILENAME)) {
                                            _csetf_os_process_impl_stdin_filename(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($STDOUT_STREAM)) {
                                                _csetf_os_process_impl_stdout_stream(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($STDOUT_FILENAME)) {
                                                    _csetf_os_process_impl_stdout_filename(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($STDERR_STREAM)) {
                                                        _csetf_os_process_impl_stderr_stream(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($STDERR_FILENAME)) {
                                                            _csetf_os_process_impl_stderr_filename(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($STATUS)) {
                                                                _csetf_os_process_impl_status(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($STARTED)) {
                                                                    _csetf_os_process_impl_started(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($FINISHED)) {
                                                                        _csetf_os_process_impl_finished(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($EXIT_CODE)) {
                                                                            _csetf_os_process_impl_exit_code(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($PROPERTIES)) {
                                                                                _csetf_os_process_impl_properties(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_os_process_impl(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.os_process_utilities.$os_process_impl_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_os_process_impl_id(v_new, current_value);
            } else
                if (pcase_var.eql($NAME)) {
                    _csetf_os_process_impl_name(v_new, current_value);
                } else
                    if (pcase_var.eql($PROGRAM)) {
                        _csetf_os_process_impl_program(v_new, current_value);
                    } else
                        if (pcase_var.eql($ARGUMENTS)) {
                            _csetf_os_process_impl_arguments(v_new, current_value);
                        } else
                            if (pcase_var.eql($STDIN_STREAM)) {
                                _csetf_os_process_impl_stdin_stream(v_new, current_value);
                            } else
                                if (pcase_var.eql($STDIN_FILENAME)) {
                                    _csetf_os_process_impl_stdin_filename(v_new, current_value);
                                } else
                                    if (pcase_var.eql($STDOUT_STREAM)) {
                                        _csetf_os_process_impl_stdout_stream(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($STDOUT_FILENAME)) {
                                            _csetf_os_process_impl_stdout_filename(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($STDERR_STREAM)) {
                                                _csetf_os_process_impl_stderr_stream(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($STDERR_FILENAME)) {
                                                    _csetf_os_process_impl_stderr_filename(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($STATUS)) {
                                                        _csetf_os_process_impl_status(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($STARTED)) {
                                                            _csetf_os_process_impl_started(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($FINISHED)) {
                                                                _csetf_os_process_impl_finished(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($EXIT_CODE)) {
                                                                    _csetf_os_process_impl_exit_code(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($PROPERTIES)) {
                                                                        _csetf_os_process_impl_properties(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_os_process_impl(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_OS_PROCESS_IMPL, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, os_process_impl_id(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, os_process_impl_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRAM, os_process_impl_program(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGUMENTS, os_process_impl_arguments(obj));
        funcall(visitor_fn, obj, $SLOT, $STDIN_STREAM, os_process_impl_stdin_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $STDIN_FILENAME, os_process_impl_stdin_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $STDOUT_STREAM, os_process_impl_stdout_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $STDOUT_FILENAME, os_process_impl_stdout_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $STDERR_STREAM, os_process_impl_stderr_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $STDERR_FILENAME, os_process_impl_stderr_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, os_process_impl_status(obj));
        funcall(visitor_fn, obj, $SLOT, $STARTED, os_process_impl_started(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISHED, os_process_impl_finished(obj));
        funcall(visitor_fn, obj, $SLOT, $EXIT_CODE, os_process_impl_exit_code(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, os_process_impl_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_OS_PROCESS_IMPL, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_os_process_impl_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_os_process_impl(obj, visitor_fn);
    }

    public static final SubLObject print_os_process_impl_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt54$__OS_PROCESS_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str_alt55$_A__S__A__S__A, new SubLObject[]{ os_process_impl_name(v_object), os_process_impl_status(v_object), os_process_impl_program(v_object), os_process_impl_arguments(v_object), os_process_impl_id(v_object) });
        write_string($str_alt56$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject print_os_process_impl(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        write_string($str60$__OS_PROCESS_, stream, UNPROVIDED, UNPROVIDED);
        format(stream, $str61$_A__S__A__S__A, new SubLObject[]{ os_process_impl_name(v_object), os_process_impl_status(v_object), os_process_impl_program(v_object), os_process_impl_arguments(v_object), os_process_impl_id(v_object) });
        write_string($str62$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject valid_os_process_input_stream_spec_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isStream() && (NIL != input_stream_p(v_object))) || (v_object == $STREAM)) || v_object.isString());
    }

    public static SubLObject valid_os_process_input_stream_spec_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isStream() && (NIL != input_stream_p(v_object))) || (v_object == $STREAM)) || v_object.isString());
    }

    public static final SubLObject valid_os_process_output_stream_spec_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isStream() && (NIL != output_stream_p(v_object))) || (v_object == $STREAM)) || v_object.isString());
    }

    public static SubLObject valid_os_process_output_stream_spec_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isStream() && (NIL != output_stream_p(v_object))) || (v_object == $STREAM)) || v_object.isString());
    }

    public static final SubLObject valid_os_process_error_output_stream_spec_p_alt(SubLObject v_object) {
        return makeBoolean((((v_object.isStream() && (NIL != output_stream_p(v_object))) || (v_object == $STREAM)) || (v_object == $OUTPUT)) || v_object.isString());
    }

    public static SubLObject valid_os_process_error_output_stream_spec_p(final SubLObject v_object) {
        return makeBoolean((((v_object.isStream() && (NIL != output_stream_p(v_object))) || (v_object == $STREAM)) || (v_object == $OUTPUT)) || v_object.isString());
    }

    public static final SubLObject is_valid_os_process_status_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $valid_os_process_status$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject is_valid_os_process_status_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $valid_os_process_status$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject os_process_p_alt(SubLObject v_object) {
        return os_process_impl_p(v_object);
    }

    public static SubLObject os_process_p(final SubLObject v_object) {
        return os_process_impl_p(v_object);
    }

    /**
     * Called from system code initializations.
     */
    @LispMethod(comment = "Called from system code initializations.")
    public static final SubLObject clear_active_os_processes_alt() {
        {
            SubLObject lock = $os_process_enumeration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $active_os_processes$.setGlobalValue(NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $active_os_processes$.getGlobalValue();
    }

    /**
     * Called from system code initializations.
     */
    @LispMethod(comment = "Called from system code initializations.")
    public static SubLObject clear_active_os_processes() {
        SubLObject release = NIL;
        try {
            release = seize_lock($os_process_enumeration_lock$.getGlobalValue());
            $active_os_processes$.setGlobalValue(NIL);
        } finally {
            if (NIL != release) {
                release_lock($os_process_enumeration_lock$.getGlobalValue());
            }
        }
        return $active_os_processes$.getGlobalValue();
    }

    public static final SubLObject all_os_processes_alt() {
        {
            SubLObject processes = NIL;
            SubLObject lock = $os_process_enumeration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                processes = copy_list($active_os_processes$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return processes;
        }
    }

    public static SubLObject all_os_processes() {
        SubLObject processes = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($os_process_enumeration_lock$.getGlobalValue());
            processes = copy_list($active_os_processes$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($os_process_enumeration_lock$.getGlobalValue());
            }
        }
        return processes;
    }

    public static final SubLObject show_os_processes_alt() {
        {
            SubLObject cdolist_list_var = all_os_processes();
            SubLObject os_process = NIL;
            for (os_process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , os_process = cdolist_list_var.first()) {
                format(T, $str_alt63$_A___A____A__A__, new SubLObject[]{ os_process_name(os_process), os_process_id(os_process), external_program_command_line_for_os_process(os_process), os_process_status(os_process) });
            }
        }
        return NIL;
    }

    public static SubLObject show_os_processes() {
        SubLObject cdolist_list_var = all_os_processes();
        SubLObject os_process = NIL;
        os_process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str69$_A___A____A__A__, new SubLObject[]{ os_process_name(os_process), os_process_id(os_process), external_program_command_line_for_os_process(os_process), os_process_status(os_process) });
            cdolist_list_var = cdolist_list_var.rest();
            os_process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject os_processes_named_alt(SubLObject name) {
        {
            SubLObject named_processes = NIL;
            SubLObject cdolist_list_var = all_os_processes();
            SubLObject os_process = NIL;
            for (os_process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , os_process = cdolist_list_var.first()) {
                if (os_process_name(os_process).equal(name)) {
                    named_processes = cons(os_process, named_processes);
                }
            }
            return named_processes;
        }
    }

    public static SubLObject os_processes_named(final SubLObject name) {
        SubLObject named_processes = NIL;
        SubLObject cdolist_list_var = all_os_processes();
        SubLObject os_process = NIL;
        os_process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (os_process_name(os_process).equal(name)) {
                named_processes = cons(os_process, named_processes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            os_process = cdolist_list_var.first();
        } 
        return named_processes;
    }

    public static final SubLObject kill_os_processes_named_alt(SubLObject name) {
        {
            SubLObject cdolist_list_var = os_processes_named(name);
            SubLObject process = NIL;
            for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                kill_os_process(process);
            }
        }
        return NIL;
    }

    public static SubLObject kill_os_processes_named(final SubLObject name) {
        SubLObject cdolist_list_var = os_processes_named(name);
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kill_os_process(process);
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject add_os_process_to_active_list_alt(SubLObject os_process) {
        {
            SubLObject lock = $os_process_enumeration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $active_os_processes$.setGlobalValue(cons(os_process, $active_os_processes$.getGlobalValue()));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return os_process;
    }

    public static SubLObject add_os_process_to_active_list(final SubLObject os_process) {
        SubLObject release = NIL;
        try {
            release = seize_lock($os_process_enumeration_lock$.getGlobalValue());
            $active_os_processes$.setGlobalValue(cons(os_process, $active_os_processes$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($os_process_enumeration_lock$.getGlobalValue());
            }
        }
        return os_process;
    }

    public static final SubLObject remove_os_process_from_active_list_alt(SubLObject os_process, SubLObject error_if_not_foundP) {
        if (error_if_not_foundP == UNPROVIDED) {
            error_if_not_foundP = NIL;
        }
        {
            SubLObject lock = $os_process_enumeration_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != error_if_not_foundP) {
                    if (NIL == find(os_process, $active_os_processes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt64$Trying_to_remove_missing_OS_proce, os_process);
                    }
                }
                $active_os_processes$.setGlobalValue(delete(os_process, $active_os_processes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return os_process;
    }

    public static SubLObject remove_os_process_from_active_list(final SubLObject os_process, SubLObject error_if_not_foundP) {
        if (error_if_not_foundP == UNPROVIDED) {
            error_if_not_foundP = NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($os_process_enumeration_lock$.getGlobalValue());
            if ((NIL != error_if_not_foundP) && (NIL == find(os_process, $active_os_processes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                Errors.error($str70$Trying_to_remove_missing_OS_proce, os_process);
            }
            $active_os_processes$.setGlobalValue(delete(os_process, $active_os_processes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($os_process_enumeration_lock$.getGlobalValue());
            }
        }
        return os_process;
    }

    public static final SubLObject make_os_process_alt(SubLObject name, SubLObject program, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (stderr == UNPROVIDED) {
            stderr = $OUTPUT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(program, STRINGP);
            SubLTrampolineFile.checkType(args, SEQUENCEP);
            SubLTrampolineFile.checkType(stdin, VALID_OS_PROCESS_INPUT_STREAM_SPEC_P);
            SubLTrampolineFile.checkType(stderr, VALID_OS_PROCESS_ERROR_OUTPUT_STREAM_SPEC_P);
            SubLTrampolineFile.checkType(stdout, VALID_OS_PROCESS_OUTPUT_STREAM_SPEC_P);
            if (NIL != string_utilities.multi_word_string(program)) {
                Errors.warn($str_alt70$make_os_process_provided_a_progra);
            }
            {
                SubLObject os_process = make_os_process_impl(UNPROVIDED);
                _csetf_os_process_impl_started(os_process, get_internal_real_time());
                _csetf_os_process_impl_status(os_process, $INITIALIZING);
                _csetf_os_process_impl_name(os_process, name);
                _csetf_os_process_impl_program(os_process, program);
                _csetf_os_process_impl_arguments(os_process, args);
                if (stdin.isString() || (stdin == $STREAM)) {
                    _csetf_os_process_impl_stdin_filename(os_process, stdin);
                }
                if (stdout.isString() || (stdout == $STREAM)) {
                    _csetf_os_process_impl_stdout_filename(os_process, stdout);
                }
                if (stderr.isString() || (stderr == $STREAM)) {
                    _csetf_os_process_impl_stderr_filename(os_process, stderr);
                }
                thread.resetMultipleValues();
                {
                    SubLObject stdin_stream = make_os_process_internal(program, args, stdin, stdout, stderr);
                    SubLObject stdout_stream = thread.secondMultipleValue();
                    SubLObject stderr_stream = thread.thirdMultipleValue();
                    SubLObject pid = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    _csetf_os_process_impl_id(os_process, pid);
                    if (NIL != valid_os_process_idP(pid)) {
                        _csetf_os_process_impl_status(os_process, $RUNNING);
                        add_os_process_to_active_list(os_process);
                    } else {
                        _csetf_os_process_impl_status(os_process, $FAILURE);
                    }
                    _csetf_os_process_impl_stdin_stream(os_process, stdin_stream);
                    _csetf_os_process_impl_stdout_stream(os_process, stdout_stream);
                    _csetf_os_process_impl_stderr_stream(os_process, stderr_stream);
                }
                return os_process;
            }
        }
    }

    public static SubLObject make_os_process(final SubLObject name, final SubLObject program, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (stderr == UNPROVIDED) {
            stderr = $OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != stringp(program) : "! stringp(program) " + ("Types.stringp(program) " + "CommonSymbols.NIL != Types.stringp(program) ") + program;
        assert NIL != sequencep(args) : "! sequencep(args) " + ("Types.sequencep(args) " + "CommonSymbols.NIL != Types.sequencep(args) ") + args;
        assert NIL != valid_os_process_input_stream_spec_p(stdin) : "! os_process_utilities.valid_os_process_input_stream_spec_p(stdin) " + ("os_process_utilities.valid_os_process_input_stream_spec_p(stdin) " + "CommonSymbols.NIL != os_process_utilities.valid_os_process_input_stream_spec_p(stdin) ") + stdin;
        assert NIL != valid_os_process_error_output_stream_spec_p(stderr) : "! os_process_utilities.valid_os_process_error_output_stream_spec_p(stderr) " + ("os_process_utilities.valid_os_process_error_output_stream_spec_p(stderr) " + "CommonSymbols.NIL != os_process_utilities.valid_os_process_error_output_stream_spec_p(stderr) ") + stderr;
        assert NIL != valid_os_process_output_stream_spec_p(stdout) : "! os_process_utilities.valid_os_process_output_stream_spec_p(stdout) " + ("os_process_utilities.valid_os_process_output_stream_spec_p(stdout) " + "CommonSymbols.NIL != os_process_utilities.valid_os_process_output_stream_spec_p(stdout) ") + stdout;
        final SubLObject os_process = make_os_process_impl(UNPROVIDED);
        _csetf_os_process_impl_started(os_process, get_internal_real_time());
        _csetf_os_process_impl_status(os_process, $INITIALIZING);
        _csetf_os_process_impl_name(os_process, name);
        _csetf_os_process_impl_program(os_process, program);
        _csetf_os_process_impl_arguments(os_process, args);
        if (stdin.isString() || (stdin == $STREAM)) {
            _csetf_os_process_impl_stdin_filename(os_process, stdin);
        }
        if (stdout.isString() || (stdout == $STREAM)) {
            _csetf_os_process_impl_stdout_filename(os_process, stdout);
        }
        if (stderr.isString() || (stderr == $STREAM)) {
            _csetf_os_process_impl_stderr_filename(os_process, stderr);
        }
        thread.resetMultipleValues();
        final SubLObject stdin_stream = make_os_process_internal(program, args, stdin, stdout, stderr);
        final SubLObject stdout_stream = thread.secondMultipleValue();
        final SubLObject stderr_stream = thread.thirdMultipleValue();
        final SubLObject pid = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        _csetf_os_process_impl_id(os_process, pid);
        if (NIL != valid_os_process_idP(pid)) {
            _csetf_os_process_impl_status(os_process, $RUNNING);
            add_os_process_to_active_list(os_process);
        } else {
            _csetf_os_process_impl_status(os_process, $FAILURE);
        }
        _csetf_os_process_impl_stdin_stream(os_process, stdin_stream);
        _csetf_os_process_impl_stdout_stream(os_process, stdout_stream);
        _csetf_os_process_impl_stderr_stream(os_process, stderr_stream);
        return os_process;
    }

    public static final SubLObject valid_os_process_idP_alt(SubLObject pid) {
        return integerp(pid);
    }

    public static SubLObject valid_os_process_idP(final SubLObject pid) {
        return integerp(pid);
    }

    public static final SubLObject os_process_runningP_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        verify_os_process_run_status(os_process, UNPROVIDED);
        return eq($RUNNING, os_process_impl_status(os_process));
    }

    public static SubLObject os_process_runningP(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        verify_os_process_run_status(os_process, UNPROVIDED);
        return eq($RUNNING, os_process_impl_status(os_process));
    }

    public static final SubLObject wait_until_os_processes_finished_alt(SubLObject os_processes) {
        {
            SubLObject cdolist_list_var = os_processes;
            SubLObject os_process = NIL;
            for (os_process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , os_process = cdolist_list_var.first()) {
                wait_until_os_process_finished(os_process);
            }
        }
        return os_processes;
    }

    public static SubLObject wait_until_os_processes_finished(final SubLObject os_processes) {
        SubLObject cdolist_list_var = os_processes;
        SubLObject os_process = NIL;
        os_process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            wait_until_os_process_finished(os_process);
            cdolist_list_var = cdolist_list_var.rest();
            os_process = cdolist_list_var.first();
        } 
        return os_processes;
    }

    public static final SubLObject wait_until_os_process_finished_alt(SubLObject os_process) {
        while (NIL != os_process_runningP(os_process)) {
            sleep($float$0_1);
        } 
        return os_process_exit_code(os_process);
    }

    public static SubLObject wait_until_os_process_finished(final SubLObject os_process) {
        while (NIL != os_process_runningP(os_process)) {
            sleep($float$0_1);
        } 
        return os_process_exit_code(os_process);
    }

    public static final SubLObject make_os_process_internal_alt(SubLObject program, SubLObject args, SubLObject stdin_spec, SubLObject stdout_spec, SubLObject stderr_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject null_stream_path = get_null_file_stream_path();
                SubLObject input = (stdin_spec == StreamsLow.$null_input$.getDynamicValue(thread)) ? ((SubLObject) (null_stream_path)) : stdin_spec;
                SubLObject output = (stdout_spec == StreamsLow.$null_output$.getDynamicValue(thread)) ? ((SubLObject) (null_stream_path)) : stdout_spec;
                SubLObject error = (stderr_spec == StreamsLow.$null_output$.getDynamicValue(thread)) ? ((SubLObject) (null_stream_path)) : stderr_spec;
                if (NIL == Processes.external_processes_supportedP()) {
                    return Errors.error($str_alt76$Currently_not_implemented_for_thi);
                }
                return Processes.run_external_process(program, args, input, output, error);
            }
        }
    }

    public static SubLObject make_os_process_internal(final SubLObject program, final SubLObject args, final SubLObject stdin_spec, final SubLObject stdout_spec, final SubLObject stderr_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject null_stream_path = get_null_file_stream_path();
        final SubLObject input = (stdin_spec.eql(StreamsLow.$null_input$.getDynamicValue(thread))) ? null_stream_path : stdin_spec;
        final SubLObject output = (stdout_spec.eql(StreamsLow.$null_output$.getDynamicValue(thread))) ? null_stream_path : stdout_spec;
        final SubLObject error = (stderr_spec.eql(StreamsLow.$null_output$.getDynamicValue(thread))) ? null_stream_path : stderr_spec;
        if (NIL == Processes.external_processes_supportedP()) {
            return Errors.error($str81$Currently_not_implemented_for_thi);
        }
        return Processes.run_external_process(program, args, input, output, error);
    }

    public static final SubLObject get_null_file_stream_path_alt() {
        return Filesys.canonical_null_file_stream_path();
    }

    public static SubLObject get_null_file_stream_path() {
        return Filesys.canonical_null_file_stream_path();
    }

    public static final SubLObject external_program_command_line_from_program_and_args_alt(SubLObject program, SubLObject args) {
        {
            SubLObject result = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                write_string(string_utilities.to_string(program), stream, UNPROVIDED, UNPROVIDED);
                if (args.isSequence()) {
                    {
                        SubLObject sequence_var = args;
                        SubLObject end_index = (sequence_var.isList()) ? ((SubLObject) (NIL)) : length(sequence_var);
                        SubLObject element_num = ZERO_INTEGER;
                        SubLObject sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var);
                        while (NIL == sequence_doneP) {
                            {
                                SubLObject element = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                                write_string($str_alt77$_, stream, UNPROVIDED, UNPROVIDED);
                                write_string(string_utilities.to_string(element), stream, UNPROVIDED, UNPROVIDED);
                                sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                                element_num = add(element_num, ONE_INTEGER);
                                sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var);
                            }
                        } 
                    }
                } else {
                    write_string($str_alt77$_, stream, UNPROVIDED, UNPROVIDED);
                    write_string(string_utilities.to_string(args), stream, UNPROVIDED, UNPROVIDED);
                }
                result = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject external_program_command_line_from_program_and_args(final SubLObject program, final SubLObject args) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_string(string_utilities.to_string(program), stream, UNPROVIDED, UNPROVIDED);
            if (args.isSequence()) {
                for (SubLObject sequence_var = args, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
                    final SubLObject element = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                    write_string(string_utilities.to_string(element), stream, UNPROVIDED, UNPROVIDED);
                    sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                    element_num = add(element_num, ONE_INTEGER);
                }
            } else {
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                write_string(string_utilities.to_string(args), stream, UNPROVIDED, UNPROVIDED);
            }
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static final SubLObject external_program_command_line_for_os_process_alt(SubLObject os_process) {
        {
            SubLObject program = os_process_program(os_process);
            SubLObject args = os_process_arguments(os_process);
            return external_program_command_line_from_program_and_args(program, args);
        }
    }

    public static SubLObject external_program_command_line_for_os_process(final SubLObject os_process) {
        final SubLObject program = os_process_program(os_process);
        final SubLObject args = os_process_arguments(os_process);
        return external_program_command_line_from_program_and_args(program, args);
    }

    public static final SubLObject verify_os_process_run_status_alt(SubLObject os_process, SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        if ($RUNNING == os_process_impl_status(os_process)) {
            {
                SubLObject exit_code = get_current_os_process_status_internal(os_process, waitP);
                if (exit_code.isFixnum()) {
                    _csetf_os_process_impl_finished(os_process, get_internal_real_time());
                    _csetf_os_process_impl_exit_code(os_process, exit_code);
                    _csetf_os_process_impl_status(os_process, $DEAD);
                    remove_os_process_from_active_list(os_process, UNPROVIDED);
                }
            }
        }
        return os_process;
    }

    public static SubLObject verify_os_process_run_status(final SubLObject os_process, SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        if ($RUNNING == os_process_impl_status(os_process)) {
            final SubLObject exit_code = get_current_os_process_status_internal(os_process, waitP);
            if (exit_code.isFixnum()) {
                _csetf_os_process_impl_finished(os_process, get_internal_real_time());
                _csetf_os_process_impl_exit_code(os_process, exit_code);
                _csetf_os_process_impl_status(os_process, $DEAD);
                remove_os_process_from_active_list(os_process, UNPROVIDED);
            }
        }
        return os_process;
    }

    public static final SubLObject get_current_os_process_status_internal_alt(SubLObject os_process, SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject status = get_current_os_process_status_implementation(os_process, waitP);
                SubLObject pid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pid != os_process_impl_id(os_process)) {
                    status = MINUS_ONE_INTEGER;
                }
                return status;
            }
        }
    }

    public static SubLObject get_current_os_process_status_internal(final SubLObject os_process, SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject status = get_current_os_process_status_implementation(os_process, waitP);
        final SubLObject pid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!pid.eql(os_process_impl_id(os_process))) {
            status = MINUS_ONE_INTEGER;
        }
        return status;
    }

    public static final SubLObject get_current_os_process_status_implementation_alt(SubLObject os_process, SubLObject waitP) {
        if (NIL == Processes.external_processes_supportedP()) {
            return Errors.error($str_alt79$Currently_not_implemented_);
        }
        return Processes.get_external_process_status(os_process_impl_id(os_process), waitP);
    }

    public static SubLObject get_current_os_process_status_implementation(final SubLObject os_process, final SubLObject waitP) {
        if (NIL == Processes.external_processes_supportedP()) {
            return Errors.error($str84$Currently_not_implemented_);
        }
        return Processes.get_external_process_status(os_process_impl_id(os_process), waitP);
    }

    public static final SubLObject kill_os_process_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        if (NIL != os_process_runningP(os_process)) {
            kill_os_process_internal(os_process);
        }
        return os_process;
    }

    public static SubLObject kill_os_process(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        if (NIL != os_process_runningP(os_process)) {
            kill_os_process_internal(os_process);
        }
        return os_process;
    }

    /**
     * Reclaim all OS resources.
     */
    @LispMethod(comment = "Reclaim all OS resources.")
    public static final SubLObject cleanup_os_process_alt(SubLObject os_process) {
        if (NIL == os_process_runningP(os_process)) {
            if (!((NIL == os_process_stdin_filename(os_process)) || (!os_process_stdin_stream(os_process).isStream()))) {
                close(os_process_stdin_stream(os_process), UNPROVIDED);
            }
            _csetf_os_process_impl_stdin_stream(os_process, NIL);
            if (!((NIL == os_process_stdout_filename(os_process)) || (!os_process_stdout_stream(os_process).isStream()))) {
                close(os_process_stdout_stream(os_process), UNPROVIDED);
            }
            _csetf_os_process_impl_stdout_stream(os_process, NIL);
            if (!((NIL == os_process_stderr_filename(os_process)) || (!os_process_stderr_stream(os_process).isStream()))) {
                close(os_process_stderr_stream(os_process), UNPROVIDED);
            }
            _csetf_os_process_impl_stderr_stream(os_process, NIL);
        }
        return os_process;
    }

    /**
     * Reclaim all OS resources.
     */
    @LispMethod(comment = "Reclaim all OS resources.")
    public static SubLObject cleanup_os_process(final SubLObject os_process) {
        if (NIL == os_process_runningP(os_process)) {
            if ((NIL != os_process_stdin_filename(os_process)) && os_process_stdin_stream(os_process).isStream()) {
                close(os_process_stdin_stream(os_process), UNPROVIDED);
            }
            _csetf_os_process_impl_stdin_stream(os_process, NIL);
            if ((NIL != os_process_stdout_filename(os_process)) && os_process_stdout_stream(os_process).isStream()) {
                close(os_process_stdout_stream(os_process), UNPROVIDED);
            }
            _csetf_os_process_impl_stdout_stream(os_process, NIL);
            if ((NIL != os_process_stderr_filename(os_process)) && os_process_stderr_stream(os_process).isStream()) {
                close(os_process_stderr_stream(os_process), UNPROVIDED);
            }
            _csetf_os_process_impl_stderr_stream(os_process, NIL);
        }
        return os_process;
    }

    public static final SubLObject destroy_os_process_alt(SubLObject process) {
        if (NIL != os_process_runningP(process)) {
            kill_os_process(process);
        }
        return cleanup_os_process(process);
    }

    public static SubLObject destroy_os_process(final SubLObject process) {
        if (NIL != os_process_runningP(process)) {
            kill_os_process(process);
        }
        return cleanup_os_process(process);
    }

    public static final SubLObject kill_os_process_internal_alt(SubLObject os_process) {
        {
            SubLObject pid = os_process_id(os_process);
            SubLObject any_point_in_waitingP = Processes.kill_external_process(pid);
            verify_os_process_run_status(os_process, any_point_in_waitingP);
        }
        return os_process;
    }

    public static SubLObject kill_os_process_internal(final SubLObject os_process) {
        final SubLObject pid = os_process_id(os_process);
        final SubLObject any_point_in_waitingP = Processes.kill_external_process(pid);
        verify_os_process_run_status(os_process, any_point_in_waitingP);
        return os_process;
    }

    public static final SubLObject run_os_process_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject os_process_var = NIL;
                    SubLObject command = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    os_process_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    command = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt80);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt80);
                            if (NIL == member(current_1, $list_alt81, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt80);
                        }
                        {
                            SubLObject args_tail = property_list_member($ARGS, current);
                            SubLObject args = (NIL != args_tail) ? ((SubLObject) (cadr(args_tail))) : NIL;
                            SubLObject name_tail = property_list_member($NAME, current);
                            SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : $$$My_OS_process;
                            SubLObject stdin_tail = property_list_member($STDIN, current);
                            SubLObject stdin = (NIL != stdin_tail) ? ((SubLObject) (cadr(stdin_tail))) : $standard_input$;
                            SubLObject stdout_tail = property_list_member($STDOUT, current);
                            SubLObject stdout = (NIL != stdout_tail) ? ((SubLObject) (cadr(stdout_tail))) : $standard_output$;
                            SubLObject stderr_tail = property_list_member($STDERR, current);
                            SubLObject stderr = (NIL != stderr_tail) ? ((SubLObject) (cadr(stderr_tail))) : $OUTPUT;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(list(os_process_var, list(MAKE_OS_PROCESS, name, command, args, stdin, stdout, stderr))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(DESTROY_OS_PROCESS, os_process_var)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject run_os_process(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject os_process_var = NIL;
        SubLObject command = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        os_process_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        command = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list85);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list85);
            if (NIL == member(current_$1, $list86, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list85);
        }
        final SubLObject args_tail = property_list_member($ARGS, current);
        final SubLObject args = (NIL != args_tail) ? cadr(args_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : $$$My_OS_process;
        final SubLObject stdin_tail = property_list_member($STDIN, current);
        final SubLObject stdin = (NIL != stdin_tail) ? cadr(stdin_tail) : $standard_input$;
        final SubLObject stdout_tail = property_list_member($STDOUT, current);
        final SubLObject stdout = (NIL != stdout_tail) ? cadr(stdout_tail) : $standard_output$;
        final SubLObject stderr_tail = property_list_member($STDERR, current);
        final SubLObject stderr = (NIL != stderr_tail) ? cadr(stderr_tail) : $OUTPUT;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(list(os_process_var, list(MAKE_OS_PROCESS, name, command, args, stdin, stdout, stderr))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(DESTROY_OS_PROCESS, os_process_var)));
    }

    public static final SubLObject run_os_process_to_completion_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject os_process_var = NIL;
                    SubLObject command = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    os_process_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt80);
                    command = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt80);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt80);
                            if (NIL == member(current_2, $list_alt81, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt80);
                        }
                        {
                            SubLObject args_tail = property_list_member($ARGS, current);
                            SubLObject args = (NIL != args_tail) ? ((SubLObject) (cadr(args_tail))) : NIL;
                            SubLObject name_tail = property_list_member($NAME, current);
                            SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : $$$My_OS_process;
                            SubLObject stdin_tail = property_list_member($STDIN, current);
                            SubLObject stdin = (NIL != stdin_tail) ? ((SubLObject) (cadr(stdin_tail))) : $standard_input$;
                            SubLObject stdout_tail = property_list_member($STDOUT, current);
                            SubLObject stdout = (NIL != stdout_tail) ? ((SubLObject) (cadr(stdout_tail))) : $standard_output$;
                            SubLObject stderr_tail = property_list_member($STDERR, current);
                            SubLObject stderr = (NIL != stderr_tail) ? ((SubLObject) (cadr(stderr_tail))) : $OUTPUT;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(RUN_OS_PROCESS, list(new SubLObject[]{ os_process_var, command, $ARGS, args, $NAME, name, $STDIN, stdin, $STDOUT, stdout, $STDERR, stderr }), list(WAIT_UNTIL_OS_PROCESS_FINISHED, os_process_var), bq_cons(PROGN, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject run_os_process_to_completion(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject os_process_var = NIL;
        SubLObject command = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        os_process_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        command = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list85);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list85);
            if (NIL == member(current_$2, $list86, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list85);
        }
        final SubLObject args_tail = property_list_member($ARGS, current);
        final SubLObject args = (NIL != args_tail) ? cadr(args_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : $$$My_OS_process;
        final SubLObject stdin_tail = property_list_member($STDIN, current);
        final SubLObject stdin = (NIL != stdin_tail) ? cadr(stdin_tail) : $standard_input$;
        final SubLObject stdout_tail = property_list_member($STDOUT, current);
        final SubLObject stdout = (NIL != stdout_tail) ? cadr(stdout_tail) : $standard_output$;
        final SubLObject stderr_tail = property_list_member($STDERR, current);
        final SubLObject stderr = (NIL != stderr_tail) ? cadr(stderr_tail) : $OUTPUT;
        final SubLObject body;
        current = body = temp;
        return list(RUN_OS_PROCESS, list(new SubLObject[]{ os_process_var, command, $ARGS, args, $NAME, name, $STDIN, stdin, $STDOUT, stdout, $STDERR, stderr }), list(WAIT_UNTIL_OS_PROCESS_FINISHED, os_process_var), bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject system_eval_using_make_os_process_alt(SubLObject command, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (stderr == UNPROVIDED) {
            stderr = $OUTPUT;
        }
        {
            SubLObject exit_code = MINUS_ONE_INTEGER;
            SubLObject os_process = make_os_process($str_alt97$My_system_eval_OS_Process, command, args, stdin, stdout, stderr);
            try {
                wait_until_os_process_finished(os_process);
                exit_code = os_process_exit_code(os_process);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        destroy_os_process(os_process);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return exit_code;
        }
    }

    public static SubLObject system_eval_using_make_os_process(final SubLObject command, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (stderr == UNPROVIDED) {
            stderr = $OUTPUT;
        }
        SubLObject exit_code = MINUS_ONE_INTEGER;
        final SubLObject os_process = make_os_process($str102$My_system_eval_OS_Process, command, args, stdin, stdout, stderr);
        try {
            wait_until_os_process_finished(os_process);
            exit_code = os_process_exit_code(os_process);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                destroy_os_process(os_process);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return exit_code;
    }

    /**
     * Like @xref system-eval-using-make-os-process, except returns T iff
     * the os-process's exit code is SUCCESS-EXIT-CODE.
     */
    @LispMethod(comment = "Like @xref system-eval-using-make-os-process, except returns T iff\r\nthe os-process\'s exit code is SUCCESS-EXIT-CODE.\nLike @xref system-eval-using-make-os-process, except returns T iff\nthe os-process\'s exit code is SUCCESS-EXIT-CODE.")
    public static final SubLObject system_eval_using_make_os_process_successfulP_alt(SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (success_exit_code == UNPROVIDED) {
            success_exit_code = ZERO_INTEGER;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (stderr == UNPROVIDED) {
            stderr = $OUTPUT;
        }
        {
            SubLObject exit_code = system_eval_using_make_os_process(command, args, stdin, stdout, stderr);
            return eql(exit_code, success_exit_code);
        }
    }

    @LispMethod(comment = "Like @xref system-eval-using-make-os-process, except returns T iff\r\nthe os-process\'s exit code is SUCCESS-EXIT-CODE.\nLike @xref system-eval-using-make-os-process, except returns T iff\nthe os-process\'s exit code is SUCCESS-EXIT-CODE.")
    public static SubLObject system_eval_using_make_os_process_successfulP(final SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (success_exit_code == UNPROVIDED) {
            success_exit_code = ZERO_INTEGER;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (stdout == UNPROVIDED) {
            stdout = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (stderr == UNPROVIDED) {
            stderr = $OUTPUT;
        }
        final SubLObject exit_code = system_eval_using_make_os_process(command, args, stdin, stdout, stderr);
        return eql(exit_code, success_exit_code);
    }

    /**
     *
     *
     * @param INTERACTIVE?
     * 		
     * @return 0 list of stringp; a list of strings containing the output of the execution of COMMAND with ARGS.
    Each line will be one element of the returned list.
     * @return 1 booleanp; whether the os-process's exit code is SUCCESS-EXIT-CODE.
     */
    @LispMethod(comment = "@param INTERACTIVE?\r\n\t\t\r\n@return 0 list of stringp; a list of strings containing the output of the execution of COMMAND with ARGS.\r\nEach line will be one element of the returned list.\r\n@return 1 booleanp; whether the os-process\'s exit code is SUCCESS-EXIT-CODE.")
    public static final SubLObject os_process_evaluation_output_strings_alt(SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (success_exit_code == UNPROVIDED) {
            success_exit_code = ZERO_INTEGER;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$null_input$.getDynamicValue();
        }
        {
            SubLObject exit_code = MINUS_ONE_INTEGER;
            SubLObject temp_filename = file_utilities.make_unused_temp_filename(UNPROVIDED);
            SubLObject name = cconcatenate($str_alt98$My_system_eval_OS_Process_outputt, format_nil.format_nil_a_no_copy(temp_filename));
            SubLObject os_process = make_os_process(name, command, args, stdin, temp_filename, $OUTPUT);
            try {
                wait_until_os_process_finished(os_process);
                exit_code = os_process_exit_code(os_process);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        destroy_os_process(os_process);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            {
                SubLObject strings = file_utilities.read_text_file(temp_filename);
                SubLObject successP = eql(exit_code, success_exit_code);
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                            try {
                                Filesys.delete_file(temp_filename);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                return values(strings, successP);
            }
        }
    }

    /**
     *
     *
     * @param INTERACTIVE?
     * 		
     * @return 0 list of stringp; a list of strings containing the output of the execution of COMMAND with ARGS.
    Each line will be one element of the returned list.
     * @return 1 booleanp; whether the os-process's exit code is SUCCESS-EXIT-CODE.
     */
    @LispMethod(comment = "@param INTERACTIVE?\r\n\t\t\r\n@return 0 list of stringp; a list of strings containing the output of the execution of COMMAND with ARGS.\r\nEach line will be one element of the returned list.\r\n@return 1 booleanp; whether the os-process\'s exit code is SUCCESS-EXIT-CODE.")
    public static SubLObject os_process_evaluation_output_strings(final SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (success_exit_code == UNPROVIDED) {
            success_exit_code = ZERO_INTEGER;
        }
        if (stdin == UNPROVIDED) {
            stdin = StreamsLow.$null_input$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject exit_code = MINUS_ONE_INTEGER;
        final SubLObject temp_filename = file_utilities.make_unused_temp_filename(UNPROVIDED);
        final SubLObject name = cconcatenate($str103$My_system_eval_OS_Process_outputt, format_nil.format_nil_a_no_copy(temp_filename));
        final SubLObject os_process = make_os_process(name, command, args, stdin, temp_filename, $OUTPUT);
        try {
            wait_until_os_process_finished(os_process);
            exit_code = os_process_exit_code(os_process);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                destroy_os_process(os_process);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject strings = file_utilities.read_text_file(temp_filename);
        final SubLObject successP = eql(exit_code, success_exit_code);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    Filesys.delete_file(temp_filename);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(strings, successP);
    }

    public static final SubLObject os_process_id_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_id(os_process);
    }

    public static SubLObject os_process_id(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_id(os_process);
    }

    public static final SubLObject os_process_arguments_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_arguments(os_process);
    }

    public static SubLObject os_process_arguments(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_arguments(os_process);
    }

    public static final SubLObject os_process_exit_code_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_exit_code(os_process);
    }

    public static SubLObject os_process_exit_code(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_exit_code(os_process);
    }

    public static final SubLObject os_process_finished_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_finished(os_process);
    }

    public static SubLObject os_process_finished(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_finished(os_process);
    }

    public static final SubLObject os_process_name_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_name(os_process);
    }

    public static SubLObject os_process_name(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_name(os_process);
    }

    public static final SubLObject os_process_program_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_program(os_process);
    }

    public static SubLObject os_process_program(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_program(os_process);
    }

    public static final SubLObject os_process_started_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_started(os_process);
    }

    public static SubLObject os_process_started(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_started(os_process);
    }

    public static final SubLObject os_process_status_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        verify_os_process_run_status(os_process, UNPROVIDED);
        return os_process_impl_status(os_process);
    }

    public static SubLObject os_process_status(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        verify_os_process_run_status(os_process, UNPROVIDED);
        return os_process_impl_status(os_process);
    }

    public static final SubLObject os_process_stderr_filename_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_stderr_filename(os_process);
    }

    public static SubLObject os_process_stderr_filename(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_stderr_filename(os_process);
    }

    public static final SubLObject os_process_stderr_stream_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_stderr_stream(os_process);
    }

    public static SubLObject os_process_stderr_stream(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_stderr_stream(os_process);
    }

    public static final SubLObject os_process_stdin_filename_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_stdin_filename(os_process);
    }

    public static SubLObject os_process_stdin_filename(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_stdin_filename(os_process);
    }

    public static final SubLObject os_process_stdin_stream_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_stdin_stream(os_process);
    }

    public static SubLObject os_process_stdin_stream(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_stdin_stream(os_process);
    }

    public static final SubLObject os_process_stdout_filename_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_stdout_filename(os_process);
    }

    public static SubLObject os_process_stdout_filename(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_stdout_filename(os_process);
    }

    public static final SubLObject os_process_stdout_stream_alt(SubLObject os_process) {
        SubLTrampolineFile.checkType(os_process, OS_PROCESS_P);
        return os_process_impl_stdout_stream(os_process);
    }

    public static SubLObject os_process_stdout_stream(final SubLObject os_process) {
        assert NIL != os_process_p(os_process) : "! os_process_utilities.os_process_p(os_process) " + ("os_process_utilities.os_process_p(os_process) " + "CommonSymbols.NIL != os_process_utilities.os_process_p(os_process) ") + os_process;
        return os_process_impl_stdout_stream(os_process);
    }

    /**
     * Fork the current CYC server process at the OS level. The forked process
     * will, once initialized, eventually invoke TASK.
     *
     * @param TASK
     * 		A FUNCTION-SPEC-P that takes no arguments and that returns
     * 		a FIXNUMP, which is the exit code that the parent will receive. By convention,
     * 		errors should be signaled with negative exit codes.
     * @param CALLBACK
     * 		a FUNCTION-SPEC-P that, if defined, will be invoked on
     * 		the child's exit code when the parent CYC server process handles the SIGCHLD
     * 		signal.
     * @param LOGFILE
     * 		a STRINGP that, if defined, STDOUT and STDERR of the child process
     * 		will be redirected to
     * @return a generalized BOOLEANP reflecting the success of the FORK-PROCESS call
     * @unknown The forked CYC server process will reinitialize itself via system code
    initializations (e.g. causing a new CYC image ID to be established, a new transcript
    file to be opened, relinking of HL store caches to occur, etc etc. It will also drop
    any SubL PROCESSes (or threads) currently running except the one executing the
    FORK-PROCESS to be dropped and discontinued. Any memory not cleaned by system code
    initializations can be used to communicate more detailed information between the
    child and the parent OS process.
     */
    @LispMethod(comment = "Fork the current CYC server process at the OS level. The forked process\r\nwill, once initialized, eventually invoke TASK.\r\n\r\n@param TASK\r\n\t\tA FUNCTION-SPEC-P that takes no arguments and that returns\r\n\t\ta FIXNUMP, which is the exit code that the parent will receive. By convention,\r\n\t\terrors should be signaled with negative exit codes.\r\n@param CALLBACK\r\n\t\ta FUNCTION-SPEC-P that, if defined, will be invoked on\r\n\t\tthe child\'s exit code when the parent CYC server process handles the SIGCHLD\r\n\t\tsignal.\r\n@param LOGFILE\r\n\t\ta STRINGP that, if defined, STDOUT and STDERR of the child process\r\n\t\twill be redirected to\r\n@return a generalized BOOLEANP reflecting the success of the FORK-PROCESS call\r\n@unknown The forked CYC server process will reinitialize itself via system code\r\ninitializations (e.g. causing a new CYC image ID to be established, a new transcript\r\nfile to be opened, relinking of HL store caches to occur, etc etc. It will also drop\r\nany SubL PROCESSes (or threads) currently running except the one executing the\r\nFORK-PROCESS to be dropped and discontinued. Any memory not cleaned by system code\r\ninitializations can be used to communicate more detailed information between the\r\nchild and the parent OS process.\nFork the current CYC server process at the OS level. The forked process\nwill, once initialized, eventually invoke TASK.")
    public static final SubLObject fork_cyc_server_process_alt(SubLObject task, SubLObject callback, SubLObject logfile) {
        if (callback == UNPROVIDED) {
            callback = NIL;
        }
        if (logfile == UNPROVIDED) {
            logfile = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $forked_cyc_server_process_task$.currentBinding(thread);
                    try {
                        $forked_cyc_server_process_task$.bind(task, thread);
                        result = Processes.fork_process(FORK_CYC_SERVER_PROCESS_IMPLEMENTATION, callback, logfile);
                    } finally {
                        $forked_cyc_server_process_task$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Fork the current CYC server process at the OS level. The forked process\r\nwill, once initialized, eventually invoke TASK.\r\n\r\n@param TASK\r\n\t\tA FUNCTION-SPEC-P that takes no arguments and that returns\r\n\t\ta FIXNUMP, which is the exit code that the parent will receive. By convention,\r\n\t\terrors should be signaled with negative exit codes.\r\n@param CALLBACK\r\n\t\ta FUNCTION-SPEC-P that, if defined, will be invoked on\r\n\t\tthe child\'s exit code when the parent CYC server process handles the SIGCHLD\r\n\t\tsignal.\r\n@param LOGFILE\r\n\t\ta STRINGP that, if defined, STDOUT and STDERR of the child process\r\n\t\twill be redirected to\r\n@return a generalized BOOLEANP reflecting the success of the FORK-PROCESS call\r\n@unknown The forked CYC server process will reinitialize itself via system code\r\ninitializations (e.g. causing a new CYC image ID to be established, a new transcript\r\nfile to be opened, relinking of HL store caches to occur, etc etc. It will also drop\r\nany SubL PROCESSes (or threads) currently running except the one executing the\r\nFORK-PROCESS to be dropped and discontinued. Any memory not cleaned by system code\r\ninitializations can be used to communicate more detailed information between the\r\nchild and the parent OS process.\nFork the current CYC server process at the OS level. The forked process\nwill, once initialized, eventually invoke TASK.")
    public static SubLObject fork_cyc_server_process(final SubLObject task, SubLObject callback, SubLObject logfile) {
        if (callback == UNPROVIDED) {
            callback = NIL;
        }
        if (logfile == UNPROVIDED) {
            logfile = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $forked_cyc_server_process_task$.currentBinding(thread);
        try {
            $forked_cyc_server_process_task$.bind(task, thread);
            result = Processes.fork_process(FORK_CYC_SERVER_PROCESS_IMPLEMENTATION, callback, logfile);
        } finally {
            $forked_cyc_server_process_task$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * This method ensures that the CYC server initializations take place before the
     * actual server task is executed.
     */
    @LispMethod(comment = "This method ensures that the CYC server initializations take place before the\r\nactual server task is executed.\nThis method ensures that the CYC server initializations take place before the\nactual server task is executed.")
    public static final SubLObject fork_cyc_server_process_implementation_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject task = $forked_cyc_server_process_task$.getDynamicValue(thread);
                misc_utilities.redo_system_code_initializations();
                return funcall(task);
            }
        }
    }

    @LispMethod(comment = "This method ensures that the CYC server initializations take place before the\r\nactual server task is executed.\nThis method ensures that the CYC server initializations take place before the\nactual server task is executed.")
    public static SubLObject fork_cyc_server_process_implementation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject task = $forked_cyc_server_process_task$.getDynamicValue(thread);
        misc_utilities.redo_system_code_initializations();
        return funcall(task);
    }

    public static SubLObject declare_os_process_utilities_file() {
        declareFunction("os_process_impl_print_function_trampoline", "OS-PROCESS-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("os_process_impl_p", "OS-PROCESS-IMPL-P", 1, 0, false);
        new os_process_utilities.$os_process_impl_p$UnaryFunction();
        declareFunction("os_process_impl_id", "OS-PROCESS-IMPL-ID", 1, 0, false);
        declareFunction("os_process_impl_name", "OS-PROCESS-IMPL-NAME", 1, 0, false);
        declareFunction("os_process_impl_program", "OS-PROCESS-IMPL-PROGRAM", 1, 0, false);
        declareFunction("os_process_impl_arguments", "OS-PROCESS-IMPL-ARGUMENTS", 1, 0, false);
        declareFunction("os_process_impl_stdin_stream", "OS-PROCESS-IMPL-STDIN-STREAM", 1, 0, false);
        declareFunction("os_process_impl_stdin_filename", "OS-PROCESS-IMPL-STDIN-FILENAME", 1, 0, false);
        declareFunction("os_process_impl_stdout_stream", "OS-PROCESS-IMPL-STDOUT-STREAM", 1, 0, false);
        declareFunction("os_process_impl_stdout_filename", "OS-PROCESS-IMPL-STDOUT-FILENAME", 1, 0, false);
        declareFunction("os_process_impl_stderr_stream", "OS-PROCESS-IMPL-STDERR-STREAM", 1, 0, false);
        declareFunction("os_process_impl_stderr_filename", "OS-PROCESS-IMPL-STDERR-FILENAME", 1, 0, false);
        declareFunction("os_process_impl_status", "OS-PROCESS-IMPL-STATUS", 1, 0, false);
        declareFunction("os_process_impl_started", "OS-PROCESS-IMPL-STARTED", 1, 0, false);
        declareFunction("os_process_impl_finished", "OS-PROCESS-IMPL-FINISHED", 1, 0, false);
        declareFunction("os_process_impl_exit_code", "OS-PROCESS-IMPL-EXIT-CODE", 1, 0, false);
        declareFunction("os_process_impl_properties", "OS-PROCESS-IMPL-PROPERTIES", 1, 0, false);
        declareFunction("_csetf_os_process_impl_id", "_CSETF-OS-PROCESS-IMPL-ID", 2, 0, false);
        declareFunction("_csetf_os_process_impl_name", "_CSETF-OS-PROCESS-IMPL-NAME", 2, 0, false);
        declareFunction("_csetf_os_process_impl_program", "_CSETF-OS-PROCESS-IMPL-PROGRAM", 2, 0, false);
        declareFunction("_csetf_os_process_impl_arguments", "_CSETF-OS-PROCESS-IMPL-ARGUMENTS", 2, 0, false);
        declareFunction("_csetf_os_process_impl_stdin_stream", "_CSETF-OS-PROCESS-IMPL-STDIN-STREAM", 2, 0, false);
        declareFunction("_csetf_os_process_impl_stdin_filename", "_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME", 2, 0, false);
        declareFunction("_csetf_os_process_impl_stdout_stream", "_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM", 2, 0, false);
        declareFunction("_csetf_os_process_impl_stdout_filename", "_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME", 2, 0, false);
        declareFunction("_csetf_os_process_impl_stderr_stream", "_CSETF-OS-PROCESS-IMPL-STDERR-STREAM", 2, 0, false);
        declareFunction("_csetf_os_process_impl_stderr_filename", "_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME", 2, 0, false);
        declareFunction("_csetf_os_process_impl_status", "_CSETF-OS-PROCESS-IMPL-STATUS", 2, 0, false);
        declareFunction("_csetf_os_process_impl_started", "_CSETF-OS-PROCESS-IMPL-STARTED", 2, 0, false);
        declareFunction("_csetf_os_process_impl_finished", "_CSETF-OS-PROCESS-IMPL-FINISHED", 2, 0, false);
        declareFunction("_csetf_os_process_impl_exit_code", "_CSETF-OS-PROCESS-IMPL-EXIT-CODE", 2, 0, false);
        declareFunction("_csetf_os_process_impl_properties", "_CSETF-OS-PROCESS-IMPL-PROPERTIES", 2, 0, false);
        declareFunction("make_os_process_impl", "MAKE-OS-PROCESS-IMPL", 0, 1, false);
        declareFunction("visit_defstruct_os_process_impl", "VISIT-DEFSTRUCT-OS-PROCESS-IMPL", 2, 0, false);
        declareFunction("visit_defstruct_object_os_process_impl_method", "VISIT-DEFSTRUCT-OBJECT-OS-PROCESS-IMPL-METHOD", 2, 0, false);
        declareFunction("print_os_process_impl", "PRINT-OS-PROCESS-IMPL", 3, 0, false);
        declareFunction("valid_os_process_input_stream_spec_p", "VALID-OS-PROCESS-INPUT-STREAM-SPEC-P", 1, 0, false);
        declareFunction("valid_os_process_output_stream_spec_p", "VALID-OS-PROCESS-OUTPUT-STREAM-SPEC-P", 1, 0, false);
        declareFunction("valid_os_process_error_output_stream_spec_p", "VALID-OS-PROCESS-ERROR-OUTPUT-STREAM-SPEC-P", 1, 0, false);
        declareFunction("is_valid_os_process_status_p", "IS-VALID-OS-PROCESS-STATUS-P", 1, 0, false);
        declareFunction("os_process_p", "OS-PROCESS-P", 1, 0, false);
        declareFunction("clear_active_os_processes", "CLEAR-ACTIVE-OS-PROCESSES", 0, 0, false);
        declareFunction("all_os_processes", "ALL-OS-PROCESSES", 0, 0, false);
        declareFunction("show_os_processes", "SHOW-OS-PROCESSES", 0, 0, false);
        declareFunction("os_processes_named", "OS-PROCESSES-NAMED", 1, 0, false);
        declareFunction("kill_os_processes_named", "KILL-OS-PROCESSES-NAMED", 1, 0, false);
        declareFunction("add_os_process_to_active_list", "ADD-OS-PROCESS-TO-ACTIVE-LIST", 1, 0, false);
        declareFunction("remove_os_process_from_active_list", "REMOVE-OS-PROCESS-FROM-ACTIVE-LIST", 1, 1, false);
        declareFunction("make_os_process", "MAKE-OS-PROCESS", 2, 4, false);
        declareFunction("valid_os_process_idP", "VALID-OS-PROCESS-ID?", 1, 0, false);
        declareFunction("os_process_runningP", "OS-PROCESS-RUNNING?", 1, 0, false);
        declareFunction("wait_until_os_processes_finished", "WAIT-UNTIL-OS-PROCESSES-FINISHED", 1, 0, false);
        declareFunction("wait_until_os_process_finished", "WAIT-UNTIL-OS-PROCESS-FINISHED", 1, 0, false);
        declareFunction("make_os_process_internal", "MAKE-OS-PROCESS-INTERNAL", 5, 0, false);
        declareFunction("get_null_file_stream_path", "GET-NULL-FILE-STREAM-PATH", 0, 0, false);
        declareFunction("external_program_command_line_from_program_and_args", "EXTERNAL-PROGRAM-COMMAND-LINE-FROM-PROGRAM-AND-ARGS", 2, 0, false);
        declareFunction("external_program_command_line_for_os_process", "EXTERNAL-PROGRAM-COMMAND-LINE-FOR-OS-PROCESS", 1, 0, false);
        declareFunction("verify_os_process_run_status", "VERIFY-OS-PROCESS-RUN-STATUS", 1, 1, false);
        declareFunction("get_current_os_process_status_internal", "GET-CURRENT-OS-PROCESS-STATUS-INTERNAL", 1, 1, false);
        declareFunction("get_current_os_process_status_implementation", "GET-CURRENT-OS-PROCESS-STATUS-IMPLEMENTATION", 2, 0, false);
        declareFunction("kill_os_process", "KILL-OS-PROCESS", 1, 0, false);
        declareFunction("cleanup_os_process", "CLEANUP-OS-PROCESS", 1, 0, false);
        declareFunction("destroy_os_process", "DESTROY-OS-PROCESS", 1, 0, false);
        declareFunction("kill_os_process_internal", "KILL-OS-PROCESS-INTERNAL", 1, 0, false);
        declareMacro("run_os_process", "RUN-OS-PROCESS");
        declareMacro("run_os_process_to_completion", "RUN-OS-PROCESS-TO-COMPLETION");
        declareFunction("system_eval_using_make_os_process", "SYSTEM-EVAL-USING-MAKE-OS-PROCESS", 1, 4, false);
        declareFunction("system_eval_using_make_os_process_successfulP", "SYSTEM-EVAL-USING-MAKE-OS-PROCESS-SUCCESSFUL?", 1, 5, false);
        declareFunction("os_process_evaluation_output_strings", "OS-PROCESS-EVALUATION-OUTPUT-STRINGS", 1, 3, false);
        declareFunction("os_process_id", "OS-PROCESS-ID", 1, 0, false);
        declareFunction("os_process_arguments", "OS-PROCESS-ARGUMENTS", 1, 0, false);
        declareFunction("os_process_exit_code", "OS-PROCESS-EXIT-CODE", 1, 0, false);
        declareFunction("os_process_finished", "OS-PROCESS-FINISHED", 1, 0, false);
        declareFunction("os_process_name", "OS-PROCESS-NAME", 1, 0, false);
        declareFunction("os_process_program", "OS-PROCESS-PROGRAM", 1, 0, false);
        declareFunction("os_process_started", "OS-PROCESS-STARTED", 1, 0, false);
        declareFunction("os_process_status", "OS-PROCESS-STATUS", 1, 0, false);
        declareFunction("os_process_stderr_filename", "OS-PROCESS-STDERR-FILENAME", 1, 0, false);
        declareFunction("os_process_stderr_stream", "OS-PROCESS-STDERR-STREAM", 1, 0, false);
        declareFunction("os_process_stdin_filename", "OS-PROCESS-STDIN-FILENAME", 1, 0, false);
        declareFunction("os_process_stdin_stream", "OS-PROCESS-STDIN-STREAM", 1, 0, false);
        declareFunction("os_process_stdout_filename", "OS-PROCESS-STDOUT-FILENAME", 1, 0, false);
        declareFunction("os_process_stdout_stream", "OS-PROCESS-STDOUT-STREAM", 1, 0, false);
        declareFunction("fork_cyc_server_process", "FORK-CYC-SERVER-PROCESS", 1, 2, false);
        declareFunction("fork_cyc_server_process_implementation", "FORK-CYC-SERVER-PROCESS-IMPLEMENTATION", 0, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("PROGRAM"), makeSymbol("ARGUMENTS"), makeSymbol("STDIN-STREAM"), makeSymbol("STDIN-FILENAME"), makeSymbol("STDOUT-STREAM"), makeSymbol("STDOUT-FILENAME"), makeSymbol("STDERR-STREAM"), makeSymbol("STDERR-FILENAME"), makeSymbol("STATUS"), makeSymbol("STARTED"), makeSymbol("FINISHED"), makeSymbol("EXIT-CODE"), makeSymbol("PROPERTIES") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("ID"), $NAME, makeKeyword("PROGRAM"), makeKeyword("ARGUMENTS"), makeKeyword("STDIN-STREAM"), makeKeyword("STDIN-FILENAME"), makeKeyword("STDOUT-STREAM"), makeKeyword("STDOUT-FILENAME"), makeKeyword("STDERR-STREAM"), makeKeyword("STDERR-FILENAME"), makeKeyword("STATUS"), makeKeyword("STARTED"), makeKeyword("FINISHED"), makeKeyword("EXIT-CODE"), makeKeyword("PROPERTIES") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("OS-PROCESS-IMPL-ID"), makeSymbol("OS-PROCESS-IMPL-NAME"), makeSymbol("OS-PROCESS-IMPL-PROGRAM"), makeSymbol("OS-PROCESS-IMPL-ARGUMENTS"), makeSymbol("OS-PROCESS-IMPL-STDIN-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDIN-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STDOUT-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDOUT-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STDERR-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDERR-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STATUS"), makeSymbol("OS-PROCESS-IMPL-STARTED"), makeSymbol("OS-PROCESS-IMPL-FINISHED"), makeSymbol("OS-PROCESS-IMPL-EXIT-CODE"), makeSymbol("OS-PROCESS-IMPL-PROPERTIES") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-OS-PROCESS-IMPL-ID"), makeSymbol("_CSETF-OS-PROCESS-IMPL-NAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-PROGRAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-ARGUMENTS"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STATUS"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STARTED"), makeSymbol("_CSETF-OS-PROCESS-IMPL-FINISHED"), makeSymbol("_CSETF-OS-PROCESS-IMPL-EXIT-CODE"), makeSymbol("_CSETF-OS-PROCESS-IMPL-PROPERTIES") });

    public static final SubLObject init_os_process_utilities_file_alt() {
        defconstant("*DTP-OS-PROCESS-IMPL*", OS_PROCESS_IMPL);
        defconstant("*VALID-OS-PROCESS-STATUS*", $list_alt59);
        deflexical("*OS-PROCESS-ENUMERATION-LOCK*", NIL != boundp($os_process_enumeration_lock$) ? ((SubLObject) ($os_process_enumeration_lock$.getGlobalValue())) : make_lock($$$OS_Process_enumeration_lock));
        deflexical("*ACTIVE-OS-PROCESSES*", NIL != boundp($active_os_processes$) ? ((SubLObject) ($active_os_processes$.getGlobalValue())) : NIL);
        defparameter("*FORKED-CYC-SERVER-PROCESS-TASK*", NIL);
        return NIL;
    }

    public static SubLObject init_os_process_utilities_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-OS-PROCESS-IMPL*", OS_PROCESS_IMPL);
            defconstant("*VALID-OS-PROCESS-STATUS*", $list65);
            deflexical("*OS-PROCESS-ENUMERATION-LOCK*", SubLTrampolineFile.maybeDefault($os_process_enumeration_lock$, $os_process_enumeration_lock$, () -> make_lock($$$OS_Process_enumeration_lock)));
            deflexical("*ACTIVE-OS-PROCESSES*", SubLTrampolineFile.maybeDefault($active_os_processes$, $active_os_processes$, NIL));
            defparameter("*FORKED-CYC-SERVER-PROCESS-TASK*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*VALID-OS-PROCESS-STATUS*", $list_alt59);
            deflexical("*OS-PROCESS-ENUMERATION-LOCK*", NIL != boundp($os_process_enumeration_lock$) ? ((SubLObject) ($os_process_enumeration_lock$.getGlobalValue())) : make_lock($$$OS_Process_enumeration_lock));
            deflexical("*ACTIVE-OS-PROCESSES*", NIL != boundp($active_os_processes$) ? ((SubLObject) ($active_os_processes$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_os_process_utilities_file_Previous() {
        defconstant("*DTP-OS-PROCESS-IMPL*", OS_PROCESS_IMPL);
        defconstant("*VALID-OS-PROCESS-STATUS*", $list65);
        deflexical("*OS-PROCESS-ENUMERATION-LOCK*", SubLTrampolineFile.maybeDefault($os_process_enumeration_lock$, $os_process_enumeration_lock$, () -> make_lock($$$OS_Process_enumeration_lock)));
        deflexical("*ACTIVE-OS-PROCESSES*", SubLTrampolineFile.maybeDefault($active_os_processes$, $active_os_processes$, NIL));
        defparameter("*FORKED-CYC-SERVER-PROCESS-TASK*", NIL);
        return NIL;
    }

    public static SubLObject setup_os_process_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_os_process_impl$.getGlobalValue(), symbol_function(OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(OS_PROCESS_IMPL_ID, _CSETF_OS_PROCESS_IMPL_ID);
        def_csetf(OS_PROCESS_IMPL_NAME, _CSETF_OS_PROCESS_IMPL_NAME);
        def_csetf(OS_PROCESS_IMPL_PROGRAM, _CSETF_OS_PROCESS_IMPL_PROGRAM);
        def_csetf(OS_PROCESS_IMPL_ARGUMENTS, _CSETF_OS_PROCESS_IMPL_ARGUMENTS);
        def_csetf(OS_PROCESS_IMPL_STDIN_STREAM, _CSETF_OS_PROCESS_IMPL_STDIN_STREAM);
        def_csetf(OS_PROCESS_IMPL_STDIN_FILENAME, _CSETF_OS_PROCESS_IMPL_STDIN_FILENAME);
        def_csetf(OS_PROCESS_IMPL_STDOUT_STREAM, _CSETF_OS_PROCESS_IMPL_STDOUT_STREAM);
        def_csetf(OS_PROCESS_IMPL_STDOUT_FILENAME, _CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME);
        def_csetf(OS_PROCESS_IMPL_STDERR_STREAM, _CSETF_OS_PROCESS_IMPL_STDERR_STREAM);
        def_csetf(OS_PROCESS_IMPL_STDERR_FILENAME, _CSETF_OS_PROCESS_IMPL_STDERR_FILENAME);
        def_csetf(OS_PROCESS_IMPL_STATUS, _CSETF_OS_PROCESS_IMPL_STATUS);
        def_csetf(OS_PROCESS_IMPL_STARTED, _CSETF_OS_PROCESS_IMPL_STARTED);
        def_csetf(OS_PROCESS_IMPL_FINISHED, _CSETF_OS_PROCESS_IMPL_FINISHED);
        def_csetf(OS_PROCESS_IMPL_EXIT_CODE, _CSETF_OS_PROCESS_IMPL_EXIT_CODE);
        def_csetf(OS_PROCESS_IMPL_PROPERTIES, _CSETF_OS_PROCESS_IMPL_PROPERTIES);
        identity(OS_PROCESS_IMPL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_os_process_impl$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_OS_PROCESS_IMPL_METHOD));
        declare_defglobal($os_process_enumeration_lock$);
        declare_defglobal($active_os_processes$);
        register_external_symbol(FORK_CYC_SERVER_PROCESS);
        note_funcall_helper_function(FORK_CYC_SERVER_PROCESS_IMPLEMENTATION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_os_process_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_os_process_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_os_process_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt54$__OS_PROCESS_ = makeString("#<OS-PROCESS ");

    public static final class $os_process_impl_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $name;

        public SubLObject $program;

        public SubLObject $arguments;

        public SubLObject $stdin_stream;

        public SubLObject $stdin_filename;

        public SubLObject $stdout_stream;

        public SubLObject $stdout_filename;

        public SubLObject $stderr_stream;

        public SubLObject $stderr_filename;

        public SubLObject $status;

        public SubLObject $started;

        public SubLObject $finished;

        public SubLObject $exit_code;

        public SubLObject $properties;

        private static final SubLStructDeclNative structDecl;

        public $os_process_impl_native() {
            os_process_utilities.$os_process_impl_native.this.$id = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$name = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$program = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$arguments = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$stdin_stream = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$stdin_filename = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$stdout_stream = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$stdout_filename = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$stderr_stream = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$stderr_filename = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$status = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$started = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$finished = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$exit_code = Lisp.NIL;
            os_process_utilities.$os_process_impl_native.this.$properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return os_process_utilities.$os_process_impl_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return os_process_utilities.$os_process_impl_native.this.$name;
        }

        @Override
        public SubLObject getField4() {
            return os_process_utilities.$os_process_impl_native.this.$program;
        }

        @Override
        public SubLObject getField5() {
            return os_process_utilities.$os_process_impl_native.this.$arguments;
        }

        @Override
        public SubLObject getField6() {
            return os_process_utilities.$os_process_impl_native.this.$stdin_stream;
        }

        @Override
        public SubLObject getField7() {
            return os_process_utilities.$os_process_impl_native.this.$stdin_filename;
        }

        @Override
        public SubLObject getField8() {
            return os_process_utilities.$os_process_impl_native.this.$stdout_stream;
        }

        @Override
        public SubLObject getField9() {
            return os_process_utilities.$os_process_impl_native.this.$stdout_filename;
        }

        @Override
        public SubLObject getField10() {
            return os_process_utilities.$os_process_impl_native.this.$stderr_stream;
        }

        @Override
        public SubLObject getField11() {
            return os_process_utilities.$os_process_impl_native.this.$stderr_filename;
        }

        @Override
        public SubLObject getField12() {
            return os_process_utilities.$os_process_impl_native.this.$status;
        }

        @Override
        public SubLObject getField13() {
            return os_process_utilities.$os_process_impl_native.this.$started;
        }

        @Override
        public SubLObject getField14() {
            return os_process_utilities.$os_process_impl_native.this.$finished;
        }

        @Override
        public SubLObject getField15() {
            return os_process_utilities.$os_process_impl_native.this.$exit_code;
        }

        @Override
        public SubLObject getField16() {
            return os_process_utilities.$os_process_impl_native.this.$properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$program = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$arguments = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$stdin_stream = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$stdin_filename = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$stdout_stream = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$stdout_filename = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$stderr_stream = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$stderr_filename = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$status = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$started = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$finished = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$exit_code = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return os_process_utilities.$os_process_impl_native.this.$properties = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.os_process_utilities.$os_process_impl_native.class, OS_PROCESS_IMPL, OS_PROCESS_IMPL_P, $list2, $list3, new String[]{ "$id", "$name", "$program", "$arguments", "$stdin_stream", "$stdin_filename", "$stdout_stream", "$stdout_filename", "$stderr_stream", "$stderr_filename", "$status", "$started", "$finished", "$exit_code", "$properties" }, $list4, $list5, PRINT_OS_PROCESS_IMPL);
        }
    }

    static private final SubLString $str_alt55$_A__S__A__S__A = makeString("~A ~S ~A ~S ~A");

    static private final SubLString $str_alt56$_ = makeString(">");

    static private final SubLList $list_alt59 = list(makeKeyword("INITIALIZING"), makeKeyword("RUNNING"), $DEAD, makeKeyword("FAILURE"));

    static private final SubLString $str_alt63$_A___A____A__A__ = makeString("~A (~A): ~A ~A~%");

    static private final SubLString $str_alt64$Trying_to_remove_missing_OS_proce = makeString("Trying to remove missing OS process ~A from active process list");

    static private final SubLString $str_alt70$make_os_process_provided_a_progra = makeString("make-os-process provided a program name containing whitespace: ~S.  This is probably an error: the programs command line arguments should be provided to make-os-process in the 3rd argument.");

    static private final SubLString $str_alt76$Currently_not_implemented_for_thi = makeString("Currently not implemented for this port.");

    static private final SubLString $str_alt77$_ = makeString(" ");

    static private final SubLString $str_alt79$Currently_not_implemented_ = makeString("Currently not implemented.");

    static private final SubLList $list_alt80 = list(list(makeSymbol("OS-PROCESS-VAR"), makeSymbol("COMMAND"), makeSymbol("&KEY"), list(makeSymbol("ARGS"), NIL), list(makeSymbol("NAME"), makeString("My OS process")), list(makeSymbol("STDIN"), list(QUOTE, makeSymbol("*STANDARD-INPUT*"))), list(makeSymbol("STDOUT"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("STDERR"), makeKeyword("OUTPUT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt81 = list($ARGS, $NAME, makeKeyword("STDIN"), makeKeyword("STDOUT"), makeKeyword("STDERR"));

    static private final SubLString $str_alt97$My_system_eval_OS_Process = makeString("My system-eval OS Process");

    static private final SubLString $str_alt98$My_system_eval_OS_Process_outputt = makeString("My system-eval OS Process outputting to ");

    public static final class $os_process_impl_p$UnaryFunction extends UnaryFunction {
        public $os_process_impl_p$UnaryFunction() {
            super(extractFunctionNamed("OS-PROCESS-IMPL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return os_process_impl_p(arg1);
        }
    }
}

/**
 * Total time: 332 ms
 */
