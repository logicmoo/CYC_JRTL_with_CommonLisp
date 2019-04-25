package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class os_process_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.os_process_utilities";
  public static final String myFingerPrint = "7755e184803b5d1e090372bcb84a29252e229bfca6ccdef0a98c1e892eb61504";
  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLSymbol $dtp_os_process_impl$;
  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 5231L)
  private static SubLSymbol $valid_os_process_status$;
  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 5854L)
  private static SubLSymbol $os_process_enumeration_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 6094L)
  private static SubLSymbol $active_os_processes$;
  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 22146L)
  private static SubLSymbol $forked_cyc_server_process_task$;
  private static final SubLSymbol $sym0$OS_PROCESS_IMPL;
  private static final SubLSymbol $sym1$OS_PROCESS_IMPL_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_OS_PROCESS_IMPL;
  private static final SubLSymbol $sym7$OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$OS_PROCESS_IMPL_ID;
  private static final SubLSymbol $sym10$_CSETF_OS_PROCESS_IMPL_ID;
  private static final SubLSymbol $sym11$OS_PROCESS_IMPL_NAME;
  private static final SubLSymbol $sym12$_CSETF_OS_PROCESS_IMPL_NAME;
  private static final SubLSymbol $sym13$OS_PROCESS_IMPL_PROGRAM;
  private static final SubLSymbol $sym14$_CSETF_OS_PROCESS_IMPL_PROGRAM;
  private static final SubLSymbol $sym15$OS_PROCESS_IMPL_ARGUMENTS;
  private static final SubLSymbol $sym16$_CSETF_OS_PROCESS_IMPL_ARGUMENTS;
  private static final SubLSymbol $sym17$OS_PROCESS_IMPL_STDIN_STREAM;
  private static final SubLSymbol $sym18$_CSETF_OS_PROCESS_IMPL_STDIN_STREAM;
  private static final SubLSymbol $sym19$OS_PROCESS_IMPL_STDIN_FILENAME;
  private static final SubLSymbol $sym20$_CSETF_OS_PROCESS_IMPL_STDIN_FILENAME;
  private static final SubLSymbol $sym21$OS_PROCESS_IMPL_STDOUT_STREAM;
  private static final SubLSymbol $sym22$_CSETF_OS_PROCESS_IMPL_STDOUT_STREAM;
  private static final SubLSymbol $sym23$OS_PROCESS_IMPL_STDOUT_FILENAME;
  private static final SubLSymbol $sym24$_CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME;
  private static final SubLSymbol $sym25$OS_PROCESS_IMPL_STDERR_STREAM;
  private static final SubLSymbol $sym26$_CSETF_OS_PROCESS_IMPL_STDERR_STREAM;
  private static final SubLSymbol $sym27$OS_PROCESS_IMPL_STDERR_FILENAME;
  private static final SubLSymbol $sym28$_CSETF_OS_PROCESS_IMPL_STDERR_FILENAME;
  private static final SubLSymbol $sym29$OS_PROCESS_IMPL_STATUS;
  private static final SubLSymbol $sym30$_CSETF_OS_PROCESS_IMPL_STATUS;
  private static final SubLSymbol $sym31$OS_PROCESS_IMPL_STARTED;
  private static final SubLSymbol $sym32$_CSETF_OS_PROCESS_IMPL_STARTED;
  private static final SubLSymbol $sym33$OS_PROCESS_IMPL_FINISHED;
  private static final SubLSymbol $sym34$_CSETF_OS_PROCESS_IMPL_FINISHED;
  private static final SubLSymbol $sym35$OS_PROCESS_IMPL_EXIT_CODE;
  private static final SubLSymbol $sym36$_CSETF_OS_PROCESS_IMPL_EXIT_CODE;
  private static final SubLSymbol $sym37$OS_PROCESS_IMPL_PROPERTIES;
  private static final SubLSymbol $sym38$_CSETF_OS_PROCESS_IMPL_PROPERTIES;
  private static final SubLSymbol $kw39$ID;
  private static final SubLSymbol $kw40$NAME;
  private static final SubLSymbol $kw41$PROGRAM;
  private static final SubLSymbol $kw42$ARGUMENTS;
  private static final SubLSymbol $kw43$STDIN_STREAM;
  private static final SubLSymbol $kw44$STDIN_FILENAME;
  private static final SubLSymbol $kw45$STDOUT_STREAM;
  private static final SubLSymbol $kw46$STDOUT_FILENAME;
  private static final SubLSymbol $kw47$STDERR_STREAM;
  private static final SubLSymbol $kw48$STDERR_FILENAME;
  private static final SubLSymbol $kw49$STATUS;
  private static final SubLSymbol $kw50$STARTED;
  private static final SubLSymbol $kw51$FINISHED;
  private static final SubLSymbol $kw52$EXIT_CODE;
  private static final SubLSymbol $kw53$PROPERTIES;
  private static final SubLString $str54$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw55$BEGIN;
  private static final SubLSymbol $sym56$MAKE_OS_PROCESS_IMPL;
  private static final SubLSymbol $kw57$SLOT;
  private static final SubLSymbol $kw58$END;
  private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_OS_PROCESS_IMPL_METHOD;
  private static final SubLString $str60$__OS_PROCESS_;
  private static final SubLString $str61$_A__S__A__S__A;
  private static final SubLString $str62$_;
  private static final SubLSymbol $kw63$STREAM;
  private static final SubLSymbol $kw64$OUTPUT;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$_OS_PROCESS_ENUMERATION_LOCK_;
  private static final SubLString $str67$OS_Process_enumeration_lock;
  private static final SubLSymbol $sym68$_ACTIVE_OS_PROCESSES_;
  private static final SubLString $str69$_A___A____A__A__;
  private static final SubLString $str70$Trying_to_remove_missing_OS_proce;
  private static final SubLSymbol $sym71$STRINGP;
  private static final SubLSymbol $sym72$SEQUENCEP;
  private static final SubLSymbol $sym73$VALID_OS_PROCESS_INPUT_STREAM_SPEC_P;
  private static final SubLSymbol $sym74$VALID_OS_PROCESS_ERROR_OUTPUT_STREAM_SPEC_P;
  private static final SubLSymbol $sym75$VALID_OS_PROCESS_OUTPUT_STREAM_SPEC_P;
  private static final SubLSymbol $kw76$INITIALIZING;
  private static final SubLSymbol $kw77$RUNNING;
  private static final SubLSymbol $kw78$FAILURE;
  private static final SubLSymbol $sym79$OS_PROCESS_P;
  private static final SubLFloat $float80$0_1;
  private static final SubLString $str81$Currently_not_implemented_for_thi;
  private static final SubLString $str82$_;
  private static final SubLSymbol $kw83$DEAD;
  private static final SubLString $str84$Currently_not_implemented_;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $kw87$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw88$ARGS;
  private static final SubLString $str89$My_OS_process;
  private static final SubLSymbol $kw90$STDIN;
  private static final SubLSymbol $sym91$_STANDARD_INPUT_;
  private static final SubLSymbol $kw92$STDOUT;
  private static final SubLSymbol $sym93$_STANDARD_OUTPUT_;
  private static final SubLSymbol $kw94$STDERR;
  private static final SubLSymbol $sym95$CLET;
  private static final SubLSymbol $sym96$MAKE_OS_PROCESS;
  private static final SubLSymbol $sym97$CUNWIND_PROTECT;
  private static final SubLSymbol $sym98$PROGN;
  private static final SubLSymbol $sym99$DESTROY_OS_PROCESS;
  private static final SubLSymbol $sym100$RUN_OS_PROCESS;
  private static final SubLSymbol $sym101$WAIT_UNTIL_OS_PROCESS_FINISHED;
  private static final SubLString $str102$My_system_eval_OS_Process;
  private static final SubLString $str103$My_system_eval_OS_Process_outputt;
  private static final SubLSymbol $kw104$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym105$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym106$FORK_CYC_SERVER_PROCESS;
  private static final SubLSymbol $sym107$FORK_CYC_SERVER_PROCESS_IMPLEMENTATION;

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_os_process_impl( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $os_process_impl_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_id(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_name(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_program(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_arguments(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_stdin_stream(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_stdin_filename(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_stdout_stream(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_stdout_filename(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_stderr_stream(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_stderr_filename(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_status(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_started(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_finished(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_exit_code(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject os_process_impl_properties(final SubLObject v_object)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_program(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_arguments(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_stdin_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_stdin_filename(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_stdout_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_stdout_filename(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_stderr_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_stderr_filename(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_started(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_finished(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_exit_code(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject _csetf_os_process_impl_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != os_process_impl_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject make_os_process_impl(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $os_process_impl_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw39$ID ) )
      {
        _csetf_os_process_impl_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$NAME ) )
      {
        _csetf_os_process_impl_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$PROGRAM ) )
      {
        _csetf_os_process_impl_program( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$ARGUMENTS ) )
      {
        _csetf_os_process_impl_arguments( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$STDIN_STREAM ) )
      {
        _csetf_os_process_impl_stdin_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$STDIN_FILENAME ) )
      {
        _csetf_os_process_impl_stdin_filename( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$STDOUT_STREAM ) )
      {
        _csetf_os_process_impl_stdout_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$STDOUT_FILENAME ) )
      {
        _csetf_os_process_impl_stdout_filename( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$STDERR_STREAM ) )
      {
        _csetf_os_process_impl_stderr_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$STDERR_FILENAME ) )
      {
        _csetf_os_process_impl_stderr_filename( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$STATUS ) )
      {
        _csetf_os_process_impl_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$STARTED ) )
      {
        _csetf_os_process_impl_started( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$FINISHED ) )
      {
        _csetf_os_process_impl_finished( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$EXIT_CODE ) )
      {
        _csetf_os_process_impl_exit_code( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$PROPERTIES ) )
      {
        _csetf_os_process_impl_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str54$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject visit_defstruct_os_process_impl(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw55$BEGIN, $sym56$MAKE_OS_PROCESS_IMPL, FIFTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw39$ID, os_process_impl_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw40$NAME, os_process_impl_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw41$PROGRAM, os_process_impl_program( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw42$ARGUMENTS, os_process_impl_arguments( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw43$STDIN_STREAM, os_process_impl_stdin_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw44$STDIN_FILENAME, os_process_impl_stdin_filename( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw45$STDOUT_STREAM, os_process_impl_stdout_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw46$STDOUT_FILENAME, os_process_impl_stdout_filename( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw47$STDERR_STREAM, os_process_impl_stderr_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw48$STDERR_FILENAME, os_process_impl_stderr_filename( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw49$STATUS, os_process_impl_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw50$STARTED, os_process_impl_started( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw51$FINISHED, os_process_impl_finished( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw52$EXIT_CODE, os_process_impl_exit_code( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw53$PROPERTIES, os_process_impl_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$END, $sym56$MAKE_OS_PROCESS_IMPL, FIFTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 1928L)
  public static SubLObject visit_defstruct_object_os_process_impl_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_os_process_impl( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 4105L)
  public static SubLObject print_os_process_impl(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str60$__OS_PROCESS_, stream, UNPROVIDED, UNPROVIDED );
    PrintLow.format( stream, $str61$_A__S__A__S__A, new SubLObject[] { os_process_impl_name( v_object ), os_process_impl_status( v_object ), os_process_impl_program( v_object ), os_process_impl_arguments( v_object ),
      os_process_impl_id( v_object )
    } );
    streams_high.write_string( $str62$_, stream, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 4511L)
  public static SubLObject valid_os_process_input_stream_spec_p(final SubLObject v_object)
  {
    return makeBoolean( ( v_object.isStream() && NIL != streams_high.input_stream_p( v_object ) ) || v_object == $kw63$STREAM || v_object.isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 4778L)
  public static SubLObject valid_os_process_output_stream_spec_p(final SubLObject v_object)
  {
    return makeBoolean( ( v_object.isStream() && NIL != streams_high.output_stream_p( v_object ) ) || v_object == $kw63$STREAM || v_object.isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 4986L)
  public static SubLObject valid_os_process_error_output_stream_spec_p(final SubLObject v_object)
  {
    return makeBoolean( ( v_object.isStream() && NIL != streams_high.output_stream_p( v_object ) ) || v_object == $kw63$STREAM || v_object == $kw64$OUTPUT || v_object.isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 5624L)
  public static SubLObject is_valid_os_process_status_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $valid_os_process_status$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 5731L)
  public static SubLObject os_process_p(final SubLObject v_object)
  {
    return os_process_impl_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 6140L)
  public static SubLObject clear_active_os_processes()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $os_process_enumeration_lock$.getGlobalValue() );
      $active_os_processes$.setGlobalValue( NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $os_process_enumeration_lock$.getGlobalValue() );
      }
    }
    return $active_os_processes$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 6351L)
  public static SubLObject all_os_processes()
  {
    SubLObject processes = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $os_process_enumeration_lock$.getGlobalValue() );
      processes = conses_high.copy_list( $active_os_processes$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $os_process_enumeration_lock$.getGlobalValue() );
      }
    }
    return processes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 6540L)
  public static SubLObject show_os_processes()
  {
    SubLObject cdolist_list_var = all_os_processes();
    SubLObject os_process = NIL;
    os_process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str69$_A___A____A__A__, new SubLObject[] { os_process_name( os_process ), os_process_id( os_process ), external_program_command_line_for_os_process( os_process ), os_process_status(
          os_process )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      os_process = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 6862L)
  public static SubLObject os_processes_named(final SubLObject name)
  {
    SubLObject named_processes = NIL;
    SubLObject cdolist_list_var = all_os_processes();
    SubLObject os_process = NIL;
    os_process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( os_process_name( os_process ).equal( name ) )
      {
        named_processes = ConsesLow.cons( os_process, named_processes );
      }
      cdolist_list_var = cdolist_list_var.rest();
      os_process = cdolist_list_var.first();
    }
    return named_processes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 7099L)
  public static SubLObject kill_os_processes_named(final SubLObject name)
  {
    SubLObject cdolist_list_var = os_processes_named( name );
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kill_os_process( process );
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 7238L)
  public static SubLObject add_os_process_to_active_list(final SubLObject os_process)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $os_process_enumeration_lock$.getGlobalValue() );
      $active_os_processes$.setGlobalValue( ConsesLow.cons( os_process, $active_os_processes$.getGlobalValue() ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $os_process_enumeration_lock$.getGlobalValue() );
      }
    }
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 7445L)
  public static SubLObject remove_os_process_from_active_list(final SubLObject os_process, SubLObject error_if_not_foundP)
  {
    if( error_if_not_foundP == UNPROVIDED )
    {
      error_if_not_foundP = NIL;
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $os_process_enumeration_lock$.getGlobalValue() );
      if( NIL != error_if_not_foundP && NIL == Sequences.find( os_process, $active_os_processes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.error( $str70$Trying_to_remove_missing_OS_proce, os_process );
      }
      $active_os_processes$.setGlobalValue( Sequences.delete( os_process, $active_os_processes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $os_process_enumeration_lock$.getGlobalValue() );
      }
    }
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 7868L)
  public static SubLObject make_os_process(final SubLObject name, final SubLObject program, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( stdin == UNPROVIDED )
    {
      stdin = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( stdout == UNPROVIDED )
    {
      stdout = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( stderr == UNPROVIDED )
    {
      stderr = $kw64$OUTPUT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.stringp( program ) : program;
    assert NIL != Types.sequencep( args ) : args;
    assert NIL != valid_os_process_input_stream_spec_p( stdin ) : stdin;
    assert NIL != valid_os_process_error_output_stream_spec_p( stderr ) : stderr;
    assert NIL != valid_os_process_output_stream_spec_p( stdout ) : stdout;
    final SubLObject os_process = make_os_process_impl( UNPROVIDED );
    _csetf_os_process_impl_started( os_process, Time.get_internal_real_time() );
    _csetf_os_process_impl_status( os_process, $kw76$INITIALIZING );
    _csetf_os_process_impl_name( os_process, name );
    _csetf_os_process_impl_program( os_process, program );
    _csetf_os_process_impl_arguments( os_process, args );
    if( stdin.isString() || stdin == $kw63$STREAM )
    {
      _csetf_os_process_impl_stdin_filename( os_process, stdin );
    }
    if( stdout.isString() || stdout == $kw63$STREAM )
    {
      _csetf_os_process_impl_stdout_filename( os_process, stdout );
    }
    if( stderr.isString() || stderr == $kw63$STREAM )
    {
      _csetf_os_process_impl_stderr_filename( os_process, stderr );
    }
    thread.resetMultipleValues();
    final SubLObject stdin_stream = make_os_process_internal( program, args, stdin, stdout, stderr );
    final SubLObject stdout_stream = thread.secondMultipleValue();
    final SubLObject stderr_stream = thread.thirdMultipleValue();
    final SubLObject pid = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    _csetf_os_process_impl_id( os_process, pid );
    if( NIL != valid_os_process_idP( pid ) )
    {
      _csetf_os_process_impl_status( os_process, $kw77$RUNNING );
      add_os_process_to_active_list( os_process );
    }
    else
    {
      _csetf_os_process_impl_status( os_process, $kw78$FAILURE );
    }
    _csetf_os_process_impl_stdin_stream( os_process, stdin_stream );
    _csetf_os_process_impl_stdout_stream( os_process, stdout_stream );
    _csetf_os_process_impl_stderr_stream( os_process, stderr_stream );
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 10211L)
  public static SubLObject valid_os_process_idP(final SubLObject pid)
  {
    return Types.integerp( pid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 10339L)
  public static SubLObject os_process_runningP(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    verify_os_process_run_status( os_process, UNPROVIDED );
    return Equality.eq( $kw77$RUNNING, os_process_impl_status( os_process ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 10531L)
  public static SubLObject wait_until_os_processes_finished(final SubLObject os_processes)
  {
    SubLObject cdolist_list_var = os_processes;
    SubLObject os_process = NIL;
    os_process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      wait_until_os_process_finished( os_process );
      cdolist_list_var = cdolist_list_var.rest();
      os_process = cdolist_list_var.first();
    }
    return os_processes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 10703L)
  public static SubLObject wait_until_os_process_finished(final SubLObject os_process)
  {
    while ( NIL != os_process_runningP( os_process ))
    {
      Threads.sleep( $float80$0_1 );
    }
    return os_process_exit_code( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 11029L)
  public static SubLObject make_os_process_internal(final SubLObject program, final SubLObject args, final SubLObject stdin_spec, final SubLObject stdout_spec, final SubLObject stderr_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject null_stream_path = get_null_file_stream_path();
    final SubLObject input = stdin_spec.eql( StreamsLow.$null_input$.getDynamicValue( thread ) ) ? null_stream_path : stdin_spec;
    final SubLObject output = stdout_spec.eql( StreamsLow.$null_output$.getDynamicValue( thread ) ) ? null_stream_path : stdout_spec;
    final SubLObject error = stderr_spec.eql( StreamsLow.$null_output$.getDynamicValue( thread ) ) ? null_stream_path : stderr_spec;
    if( NIL == Processes.external_processes_supportedP() )
    {
      return Errors.error( $str81$Currently_not_implemented_for_thi );
    }
    return Processes.run_external_process( program, args, input, output, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 12704L)
  public static SubLObject get_null_file_stream_path()
  {
    return Filesys.canonical_null_file_stream_path();
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 12945L)
  public static SubLObject external_program_command_line_from_program_and_args(final SubLObject program, final SubLObject args)
  {
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      streams_high.write_string( string_utilities.to_string( program ), stream, UNPROVIDED, UNPROVIDED );
      if( args.isSequence() )
      {
        for( SubLObject sequence_var = args, end_index = sequence_var.isList() ? NIL : Sequences.length( sequence_var ), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( element_num,
            end_index, sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( element_num, end_index, sequence_var ) )
        {
          final SubLObject element = subl_macros.do_sequence_index_valueP( element_num, sequence_var );
          streams_high.write_string( $str82$_, stream, UNPROVIDED, UNPROVIDED );
          streams_high.write_string( string_utilities.to_string( element ), stream, UNPROVIDED, UNPROVIDED );
          sequence_var = subl_macros.do_sequence_index_update( sequence_var );
          element_num = Numbers.add( element_num, ONE_INTEGER );
        }
      }
      else
      {
        streams_high.write_string( $str82$_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( string_utilities.to_string( args ), stream, UNPROVIDED, UNPROVIDED );
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 13433L)
  public static SubLObject external_program_command_line_for_os_process(final SubLObject os_process)
  {
    final SubLObject program = os_process_program( os_process );
    final SubLObject args = os_process_arguments( os_process );
    return external_program_command_line_from_program_and_args( program, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 13689L)
  public static SubLObject verify_os_process_run_status(final SubLObject os_process, SubLObject waitP)
  {
    if( waitP == UNPROVIDED )
    {
      waitP = NIL;
    }
    if( $kw77$RUNNING == os_process_impl_status( os_process ) )
    {
      final SubLObject exit_code = get_current_os_process_status_internal( os_process, waitP );
      if( exit_code.isFixnum() )
      {
        _csetf_os_process_impl_finished( os_process, Time.get_internal_real_time() );
        _csetf_os_process_impl_exit_code( os_process, exit_code );
        _csetf_os_process_impl_status( os_process, $kw83$DEAD );
        remove_os_process_from_active_list( os_process, UNPROVIDED );
      }
    }
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 14226L)
  public static SubLObject get_current_os_process_status_internal(final SubLObject os_process, SubLObject waitP)
  {
    if( waitP == UNPROVIDED )
    {
      waitP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject status = get_current_os_process_status_implementation( os_process, waitP );
    final SubLObject pid = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( !pid.eql( os_process_impl_id( os_process ) ) )
    {
      status = MINUS_ONE_INTEGER;
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 14522L)
  public static SubLObject get_current_os_process_status_implementation(final SubLObject os_process, final SubLObject waitP)
  {
    if( NIL == Processes.external_processes_supportedP() )
    {
      return Errors.error( $str84$Currently_not_implemented_ );
    }
    return Processes.get_external_process_status( os_process_impl_id( os_process ), waitP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 15471L)
  public static SubLObject kill_os_process(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    if( NIL != os_process_runningP( os_process ) )
    {
      kill_os_process_internal( os_process );
    }
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 15662L)
  public static SubLObject cleanup_os_process(final SubLObject os_process)
  {
    if( NIL == os_process_runningP( os_process ) )
    {
      if( NIL != os_process_stdin_filename( os_process ) && os_process_stdin_stream( os_process ).isStream() )
      {
        streams_high.close( os_process_stdin_stream( os_process ), UNPROVIDED );
      }
      _csetf_os_process_impl_stdin_stream( os_process, NIL );
      if( NIL != os_process_stdout_filename( os_process ) && os_process_stdout_stream( os_process ).isStream() )
      {
        streams_high.close( os_process_stdout_stream( os_process ), UNPROVIDED );
      }
      _csetf_os_process_impl_stdout_stream( os_process, NIL );
      if( NIL != os_process_stderr_filename( os_process ) && os_process_stderr_stream( os_process ).isStream() )
      {
        streams_high.close( os_process_stderr_stream( os_process ), UNPROVIDED );
      }
      _csetf_os_process_impl_stderr_stream( os_process, NIL );
    }
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 16555L)
  public static SubLObject destroy_os_process(final SubLObject process)
  {
    if( NIL != os_process_runningP( process ) )
    {
      kill_os_process( process );
    }
    return cleanup_os_process( process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 16755L)
  public static SubLObject kill_os_process_internal(final SubLObject os_process)
  {
    final SubLObject pid = os_process_id( os_process );
    final SubLObject any_point_in_waitingP = Processes.kill_external_process( pid );
    verify_os_process_run_status( os_process, any_point_in_waitingP );
    return os_process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 17188L)
  public static SubLObject run_os_process(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject os_process_var = NIL;
    SubLObject command = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    os_process_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    command = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      if( NIL == conses_high.member( current_$1, $list86, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw87$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    }
    final SubLObject args_tail = cdestructuring_bind.property_list_member( $kw88$ARGS, current );
    final SubLObject args = ( NIL != args_tail ) ? conses_high.cadr( args_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw40$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : $str89$My_OS_process;
    final SubLObject stdin_tail = cdestructuring_bind.property_list_member( $kw90$STDIN, current );
    final SubLObject stdin = ( NIL != stdin_tail ) ? conses_high.cadr( stdin_tail ) : $sym91$_STANDARD_INPUT_;
    final SubLObject stdout_tail = cdestructuring_bind.property_list_member( $kw92$STDOUT, current );
    final SubLObject stdout = ( NIL != stdout_tail ) ? conses_high.cadr( stdout_tail ) : $sym93$_STANDARD_OUTPUT_;
    final SubLObject stderr_tail = cdestructuring_bind.property_list_member( $kw94$STDERR, current );
    final SubLObject stderr = ( NIL != stderr_tail ) ? conses_high.cadr( stderr_tail ) : $kw64$OUTPUT;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym95$CLET, ConsesLow.list( ConsesLow.list( os_process_var, ConsesLow.list( $sym96$MAKE_OS_PROCESS, name, command, args, stdin, stdout, stderr ) ) ), ConsesLow.list( $sym97$CUNWIND_PROTECT,
        reader.bq_cons( $sym98$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym99$DESTROY_OS_PROCESS, os_process_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 17685L)
  public static SubLObject run_os_process_to_completion(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject os_process_var = NIL;
    SubLObject command = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    os_process_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    command = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      if( NIL == conses_high.member( current_$2, $list86, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw87$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    }
    final SubLObject args_tail = cdestructuring_bind.property_list_member( $kw88$ARGS, current );
    final SubLObject args = ( NIL != args_tail ) ? conses_high.cadr( args_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw40$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : $str89$My_OS_process;
    final SubLObject stdin_tail = cdestructuring_bind.property_list_member( $kw90$STDIN, current );
    final SubLObject stdin = ( NIL != stdin_tail ) ? conses_high.cadr( stdin_tail ) : $sym91$_STANDARD_INPUT_;
    final SubLObject stdout_tail = cdestructuring_bind.property_list_member( $kw92$STDOUT, current );
    final SubLObject stdout = ( NIL != stdout_tail ) ? conses_high.cadr( stdout_tail ) : $sym93$_STANDARD_OUTPUT_;
    final SubLObject stderr_tail = cdestructuring_bind.property_list_member( $kw94$STDERR, current );
    final SubLObject stderr = ( NIL != stderr_tail ) ? conses_high.cadr( stderr_tail ) : $kw64$OUTPUT;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym100$RUN_OS_PROCESS, ConsesLow.list( new SubLObject[] { os_process_var, command, $kw88$ARGS, args, $kw40$NAME, name, $kw90$STDIN, stdin, $kw92$STDOUT, stdout, $kw94$STDERR, stderr
    } ), ConsesLow.list( $sym101$WAIT_UNTIL_OS_PROCESS_FINISHED, os_process_var ), reader.bq_cons( $sym98$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 18171L)
  public static SubLObject system_eval_using_make_os_process(final SubLObject command, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( stdin == UNPROVIDED )
    {
      stdin = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( stdout == UNPROVIDED )
    {
      stdout = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( stderr == UNPROVIDED )
    {
      stderr = $kw64$OUTPUT;
    }
    SubLObject exit_code = MINUS_ONE_INTEGER;
    final SubLObject os_process = make_os_process( $str102$My_system_eval_OS_Process, command, args, stdin, stdout, stderr );
    try
    {
      wait_until_os_process_finished( os_process );
      exit_code = os_process_exit_code( os_process );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        destroy_os_process( os_process );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return exit_code;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 18673L)
  public static SubLObject system_eval_using_make_os_process_successfulP(final SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin, SubLObject stdout, SubLObject stderr)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( success_exit_code == UNPROVIDED )
    {
      success_exit_code = ZERO_INTEGER;
    }
    if( stdin == UNPROVIDED )
    {
      stdin = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( stdout == UNPROVIDED )
    {
      stdout = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( stderr == UNPROVIDED )
    {
      stderr = $kw64$OUTPUT;
    }
    final SubLObject exit_code = system_eval_using_make_os_process( command, args, stdin, stdout, stderr );
    return Equality.eql( exit_code, success_exit_code );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 19187L)
  public static SubLObject os_process_evaluation_output_strings(final SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( success_exit_code == UNPROVIDED )
    {
      success_exit_code = ZERO_INTEGER;
    }
    if( stdin == UNPROVIDED )
    {
      stdin = StreamsLow.$null_input$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject exit_code = MINUS_ONE_INTEGER;
    final SubLObject temp_filename = file_utilities.make_unused_temp_filename( UNPROVIDED );
    final SubLObject name = Sequences.cconcatenate( $str103$My_system_eval_OS_Process_outputt, format_nil.format_nil_a_no_copy( temp_filename ) );
    final SubLObject os_process = make_os_process( name, command, args, stdin, temp_filename, $kw64$OUTPUT );
    try
    {
      wait_until_os_process_finished( os_process );
      exit_code = os_process_exit_code( os_process );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        destroy_os_process( os_process );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject strings = file_utilities.read_text_file( temp_filename );
    final SubLObject successP = Equality.eql( exit_code, success_exit_code );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw104$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym105$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          Filesys.delete_file( temp_filename );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_2, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw104$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( strings, successP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20095L)
  public static SubLObject os_process_id(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_id( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20291L)
  public static SubLObject os_process_arguments(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_arguments( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20428L)
  public static SubLObject os_process_exit_code(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_exit_code( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20565L)
  public static SubLObject os_process_finished(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_finished( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20700L)
  public static SubLObject os_process_name(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_name( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20827L)
  public static SubLObject os_process_program(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_program( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 20960L)
  public static SubLObject os_process_started(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_started( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 21093L)
  public static SubLObject os_process_status(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    verify_os_process_run_status( os_process, UNPROVIDED );
    return os_process_impl_status( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 21268L)
  public static SubLObject os_process_stderr_filename(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_stderr_filename( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 21417L)
  public static SubLObject os_process_stderr_stream(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_stderr_stream( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 21562L)
  public static SubLObject os_process_stdin_filename(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_stdin_filename( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 21709L)
  public static SubLObject os_process_stdin_stream(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_stdin_stream( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 21852L)
  public static SubLObject os_process_stdout_filename(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_stdout_filename( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 22001L)
  public static SubLObject os_process_stdout_stream(final SubLObject os_process)
  {
    assert NIL != os_process_p( os_process ) : os_process;
    return os_process_impl_stdout_stream( os_process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 22423L)
  public static SubLObject fork_cyc_server_process(final SubLObject task, SubLObject callback, SubLObject logfile)
  {
    if( callback == UNPROVIDED )
    {
      callback = NIL;
    }
    if( logfile == UNPROVIDED )
    {
      logfile = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $forked_cyc_server_process_task$.currentBinding( thread );
    try
    {
      $forked_cyc_server_process_task$.bind( task, thread );
      result = Processes.fork_process( $sym107$FORK_CYC_SERVER_PROCESS_IMPLEMENTATION, callback, logfile );
    }
    finally
    {
      $forked_cyc_server_process_task$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/os-process-utilities.lisp", position = 23959L)
  public static SubLObject fork_cyc_server_process_implementation()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject task = $forked_cyc_server_process_task$.getDynamicValue( thread );
    misc_utilities.redo_system_code_initializations();
    return Functions.funcall( task );
  }

  public static SubLObject declare_os_process_utilities_file()
  {
    SubLFiles.declareFunction( me, "os_process_impl_print_function_trampoline", "OS-PROCESS-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_p", "OS-PROCESS-IMPL-P", 1, 0, false );
    new $os_process_impl_p$UnaryFunction();
    SubLFiles.declareFunction( me, "os_process_impl_id", "OS-PROCESS-IMPL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_name", "OS-PROCESS-IMPL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_program", "OS-PROCESS-IMPL-PROGRAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_arguments", "OS-PROCESS-IMPL-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_stdin_stream", "OS-PROCESS-IMPL-STDIN-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_stdin_filename", "OS-PROCESS-IMPL-STDIN-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_stdout_stream", "OS-PROCESS-IMPL-STDOUT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_stdout_filename", "OS-PROCESS-IMPL-STDOUT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_stderr_stream", "OS-PROCESS-IMPL-STDERR-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_stderr_filename", "OS-PROCESS-IMPL-STDERR-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_status", "OS-PROCESS-IMPL-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_started", "OS-PROCESS-IMPL-STARTED", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_finished", "OS-PROCESS-IMPL-FINISHED", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_exit_code", "OS-PROCESS-IMPL-EXIT-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_impl_properties", "OS-PROCESS-IMPL-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_id", "_CSETF-OS-PROCESS-IMPL-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_name", "_CSETF-OS-PROCESS-IMPL-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_program", "_CSETF-OS-PROCESS-IMPL-PROGRAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_arguments", "_CSETF-OS-PROCESS-IMPL-ARGUMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_stdin_stream", "_CSETF-OS-PROCESS-IMPL-STDIN-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_stdin_filename", "_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_stdout_stream", "_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_stdout_filename", "_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_stderr_stream", "_CSETF-OS-PROCESS-IMPL-STDERR-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_stderr_filename", "_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_status", "_CSETF-OS-PROCESS-IMPL-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_started", "_CSETF-OS-PROCESS-IMPL-STARTED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_finished", "_CSETF-OS-PROCESS-IMPL-FINISHED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_exit_code", "_CSETF-OS-PROCESS-IMPL-EXIT-CODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_os_process_impl_properties", "_CSETF-OS-PROCESS-IMPL-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_os_process_impl", "MAKE-OS-PROCESS-IMPL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_os_process_impl", "VISIT-DEFSTRUCT-OS-PROCESS-IMPL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_os_process_impl_method", "VISIT-DEFSTRUCT-OBJECT-OS-PROCESS-IMPL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_os_process_impl", "PRINT-OS-PROCESS-IMPL", 3, 0, false );
    SubLFiles.declareFunction( me, "valid_os_process_input_stream_spec_p", "VALID-OS-PROCESS-INPUT-STREAM-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_os_process_output_stream_spec_p", "VALID-OS-PROCESS-OUTPUT-STREAM-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_os_process_error_output_stream_spec_p", "VALID-OS-PROCESS-ERROR-OUTPUT-STREAM-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "is_valid_os_process_status_p", "IS-VALID-OS-PROCESS-STATUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_p", "OS-PROCESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_active_os_processes", "CLEAR-ACTIVE-OS-PROCESSES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_os_processes", "ALL-OS-PROCESSES", 0, 0, false );
    SubLFiles.declareFunction( me, "show_os_processes", "SHOW-OS-PROCESSES", 0, 0, false );
    SubLFiles.declareFunction( me, "os_processes_named", "OS-PROCESSES-NAMED", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_os_processes_named", "KILL-OS-PROCESSES-NAMED", 1, 0, false );
    SubLFiles.declareFunction( me, "add_os_process_to_active_list", "ADD-OS-PROCESS-TO-ACTIVE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_os_process_from_active_list", "REMOVE-OS-PROCESS-FROM-ACTIVE-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "make_os_process", "MAKE-OS-PROCESS", 2, 4, false );
    SubLFiles.declareFunction( me, "valid_os_process_idP", "VALID-OS-PROCESS-ID?", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_runningP", "OS-PROCESS-RUNNING?", 1, 0, false );
    SubLFiles.declareFunction( me, "wait_until_os_processes_finished", "WAIT-UNTIL-OS-PROCESSES-FINISHED", 1, 0, false );
    SubLFiles.declareFunction( me, "wait_until_os_process_finished", "WAIT-UNTIL-OS-PROCESS-FINISHED", 1, 0, false );
    SubLFiles.declareFunction( me, "make_os_process_internal", "MAKE-OS-PROCESS-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "get_null_file_stream_path", "GET-NULL-FILE-STREAM-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "external_program_command_line_from_program_and_args", "EXTERNAL-PROGRAM-COMMAND-LINE-FROM-PROGRAM-AND-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "external_program_command_line_for_os_process", "EXTERNAL-PROGRAM-COMMAND-LINE-FOR-OS-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_os_process_run_status", "VERIFY-OS-PROCESS-RUN-STATUS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_current_os_process_status_internal", "GET-CURRENT-OS-PROCESS-STATUS-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_current_os_process_status_implementation", "GET-CURRENT-OS-PROCESS-STATUS-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "kill_os_process", "KILL-OS-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "cleanup_os_process", "CLEANUP-OS-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_os_process", "DESTROY-OS-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_os_process_internal", "KILL-OS-PROCESS-INTERNAL", 1, 0, false );
    SubLFiles.declareMacro( me, "run_os_process", "RUN-OS-PROCESS" );
    SubLFiles.declareMacro( me, "run_os_process_to_completion", "RUN-OS-PROCESS-TO-COMPLETION" );
    SubLFiles.declareFunction( me, "system_eval_using_make_os_process", "SYSTEM-EVAL-USING-MAKE-OS-PROCESS", 1, 4, false );
    SubLFiles.declareFunction( me, "system_eval_using_make_os_process_successfulP", "SYSTEM-EVAL-USING-MAKE-OS-PROCESS-SUCCESSFUL?", 1, 5, false );
    SubLFiles.declareFunction( me, "os_process_evaluation_output_strings", "OS-PROCESS-EVALUATION-OUTPUT-STRINGS", 1, 3, false );
    SubLFiles.declareFunction( me, "os_process_id", "OS-PROCESS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_arguments", "OS-PROCESS-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_exit_code", "OS-PROCESS-EXIT-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_finished", "OS-PROCESS-FINISHED", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_name", "OS-PROCESS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_program", "OS-PROCESS-PROGRAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_started", "OS-PROCESS-STARTED", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_status", "OS-PROCESS-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_stderr_filename", "OS-PROCESS-STDERR-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_stderr_stream", "OS-PROCESS-STDERR-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_stdin_filename", "OS-PROCESS-STDIN-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_stdin_stream", "OS-PROCESS-STDIN-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_stdout_filename", "OS-PROCESS-STDOUT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "os_process_stdout_stream", "OS-PROCESS-STDOUT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "fork_cyc_server_process", "FORK-CYC-SERVER-PROCESS", 1, 2, false );
    SubLFiles.declareFunction( me, "fork_cyc_server_process_implementation", "FORK-CYC-SERVER-PROCESS-IMPLEMENTATION", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_os_process_utilities_file()
  {
    $dtp_os_process_impl$ = SubLFiles.defconstant( "*DTP-OS-PROCESS-IMPL*", $sym0$OS_PROCESS_IMPL );
    $valid_os_process_status$ = SubLFiles.defconstant( "*VALID-OS-PROCESS-STATUS*", $list65 );
    $os_process_enumeration_lock$ = SubLFiles.deflexical( "*OS-PROCESS-ENUMERATION-LOCK*", maybeDefault( $sym66$_OS_PROCESS_ENUMERATION_LOCK_, $os_process_enumeration_lock$, () -> ( Locks.make_lock(
        $str67$OS_Process_enumeration_lock ) ) ) );
    $active_os_processes$ = SubLFiles.deflexical( "*ACTIVE-OS-PROCESSES*", ( maybeDefault( $sym68$_ACTIVE_OS_PROCESSES_, $active_os_processes$, NIL ) ) );
    $forked_cyc_server_process_task$ = SubLFiles.defparameter( "*FORKED-CYC-SERVER-PROCESS-TASK*", NIL );
    return NIL;
  }

  public static SubLObject setup_os_process_utilities_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_os_process_impl$.getGlobalValue(), Symbols.symbol_function( $sym7$OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$OS_PROCESS_IMPL_ID, $sym10$_CSETF_OS_PROCESS_IMPL_ID );
    Structures.def_csetf( $sym11$OS_PROCESS_IMPL_NAME, $sym12$_CSETF_OS_PROCESS_IMPL_NAME );
    Structures.def_csetf( $sym13$OS_PROCESS_IMPL_PROGRAM, $sym14$_CSETF_OS_PROCESS_IMPL_PROGRAM );
    Structures.def_csetf( $sym15$OS_PROCESS_IMPL_ARGUMENTS, $sym16$_CSETF_OS_PROCESS_IMPL_ARGUMENTS );
    Structures.def_csetf( $sym17$OS_PROCESS_IMPL_STDIN_STREAM, $sym18$_CSETF_OS_PROCESS_IMPL_STDIN_STREAM );
    Structures.def_csetf( $sym19$OS_PROCESS_IMPL_STDIN_FILENAME, $sym20$_CSETF_OS_PROCESS_IMPL_STDIN_FILENAME );
    Structures.def_csetf( $sym21$OS_PROCESS_IMPL_STDOUT_STREAM, $sym22$_CSETF_OS_PROCESS_IMPL_STDOUT_STREAM );
    Structures.def_csetf( $sym23$OS_PROCESS_IMPL_STDOUT_FILENAME, $sym24$_CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME );
    Structures.def_csetf( $sym25$OS_PROCESS_IMPL_STDERR_STREAM, $sym26$_CSETF_OS_PROCESS_IMPL_STDERR_STREAM );
    Structures.def_csetf( $sym27$OS_PROCESS_IMPL_STDERR_FILENAME, $sym28$_CSETF_OS_PROCESS_IMPL_STDERR_FILENAME );
    Structures.def_csetf( $sym29$OS_PROCESS_IMPL_STATUS, $sym30$_CSETF_OS_PROCESS_IMPL_STATUS );
    Structures.def_csetf( $sym31$OS_PROCESS_IMPL_STARTED, $sym32$_CSETF_OS_PROCESS_IMPL_STARTED );
    Structures.def_csetf( $sym33$OS_PROCESS_IMPL_FINISHED, $sym34$_CSETF_OS_PROCESS_IMPL_FINISHED );
    Structures.def_csetf( $sym35$OS_PROCESS_IMPL_EXIT_CODE, $sym36$_CSETF_OS_PROCESS_IMPL_EXIT_CODE );
    Structures.def_csetf( $sym37$OS_PROCESS_IMPL_PROPERTIES, $sym38$_CSETF_OS_PROCESS_IMPL_PROPERTIES );
    Equality.identity( $sym0$OS_PROCESS_IMPL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_os_process_impl$.getGlobalValue(), Symbols.symbol_function(
        $sym59$VISIT_DEFSTRUCT_OBJECT_OS_PROCESS_IMPL_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym66$_OS_PROCESS_ENUMERATION_LOCK_ );
    subl_macro_promotions.declare_defglobal( $sym68$_ACTIVE_OS_PROCESSES_ );
    access_macros.register_external_symbol( $sym106$FORK_CYC_SERVER_PROCESS );
    utilities_macros.note_funcall_helper_function( $sym107$FORK_CYC_SERVER_PROCESS_IMPLEMENTATION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_os_process_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_os_process_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_os_process_utilities_file();
  }
  static
  {
    me = new os_process_utilities();
    $dtp_os_process_impl$ = null;
    $valid_os_process_status$ = null;
    $os_process_enumeration_lock$ = null;
    $active_os_processes$ = null;
    $forked_cyc_server_process_task$ = null;
    $sym0$OS_PROCESS_IMPL = makeSymbol( "OS-PROCESS-IMPL" );
    $sym1$OS_PROCESS_IMPL_P = makeSymbol( "OS-PROCESS-IMPL-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "ID" ), makeSymbol( "NAME" ), makeSymbol( "PROGRAM" ), makeSymbol( "ARGUMENTS" ), makeSymbol( "STDIN-STREAM" ), makeSymbol( "STDIN-FILENAME" ), makeSymbol(
        "STDOUT-STREAM" ), makeSymbol( "STDOUT-FILENAME" ), makeSymbol( "STDERR-STREAM" ), makeSymbol( "STDERR-FILENAME" ), makeSymbol( "STATUS" ), makeSymbol( "STARTED" ), makeSymbol( "FINISHED" ), makeSymbol(
            "EXIT-CODE" ), makeSymbol( "PROPERTIES" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "NAME" ), makeKeyword( "PROGRAM" ), makeKeyword( "ARGUMENTS" ), makeKeyword( "STDIN-STREAM" ), makeKeyword( "STDIN-FILENAME" ),
      makeKeyword( "STDOUT-STREAM" ), makeKeyword( "STDOUT-FILENAME" ), makeKeyword( "STDERR-STREAM" ), makeKeyword( "STDERR-FILENAME" ), makeKeyword( "STATUS" ), makeKeyword( "STARTED" ), makeKeyword( "FINISHED" ),
      makeKeyword( "EXIT-CODE" ), makeKeyword( "PROPERTIES" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "OS-PROCESS-IMPL-ID" ), makeSymbol( "OS-PROCESS-IMPL-NAME" ), makeSymbol( "OS-PROCESS-IMPL-PROGRAM" ), makeSymbol( "OS-PROCESS-IMPL-ARGUMENTS" ), makeSymbol(
        "OS-PROCESS-IMPL-STDIN-STREAM" ), makeSymbol( "OS-PROCESS-IMPL-STDIN-FILENAME" ), makeSymbol( "OS-PROCESS-IMPL-STDOUT-STREAM" ), makeSymbol( "OS-PROCESS-IMPL-STDOUT-FILENAME" ), makeSymbol(
            "OS-PROCESS-IMPL-STDERR-STREAM" ), makeSymbol( "OS-PROCESS-IMPL-STDERR-FILENAME" ), makeSymbol( "OS-PROCESS-IMPL-STATUS" ), makeSymbol( "OS-PROCESS-IMPL-STARTED" ), makeSymbol( "OS-PROCESS-IMPL-FINISHED" ),
      makeSymbol( "OS-PROCESS-IMPL-EXIT-CODE" ), makeSymbol( "OS-PROCESS-IMPL-PROPERTIES" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-OS-PROCESS-IMPL-ID" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-NAME" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-PROGRAM" ), makeSymbol(
        "_CSETF-OS-PROCESS-IMPL-ARGUMENTS" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDIN-STREAM" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM" ), makeSymbol(
            "_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDERR-STREAM" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-STATUS" ),
      makeSymbol( "_CSETF-OS-PROCESS-IMPL-STARTED" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-FINISHED" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-EXIT-CODE" ), makeSymbol( "_CSETF-OS-PROCESS-IMPL-PROPERTIES" )
    } );
    $sym6$PRINT_OS_PROCESS_IMPL = makeSymbol( "PRINT-OS-PROCESS-IMPL" );
    $sym7$OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "OS-PROCESS-IMPL-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "OS-PROCESS-IMPL-P" ) );
    $sym9$OS_PROCESS_IMPL_ID = makeSymbol( "OS-PROCESS-IMPL-ID" );
    $sym10$_CSETF_OS_PROCESS_IMPL_ID = makeSymbol( "_CSETF-OS-PROCESS-IMPL-ID" );
    $sym11$OS_PROCESS_IMPL_NAME = makeSymbol( "OS-PROCESS-IMPL-NAME" );
    $sym12$_CSETF_OS_PROCESS_IMPL_NAME = makeSymbol( "_CSETF-OS-PROCESS-IMPL-NAME" );
    $sym13$OS_PROCESS_IMPL_PROGRAM = makeSymbol( "OS-PROCESS-IMPL-PROGRAM" );
    $sym14$_CSETF_OS_PROCESS_IMPL_PROGRAM = makeSymbol( "_CSETF-OS-PROCESS-IMPL-PROGRAM" );
    $sym15$OS_PROCESS_IMPL_ARGUMENTS = makeSymbol( "OS-PROCESS-IMPL-ARGUMENTS" );
    $sym16$_CSETF_OS_PROCESS_IMPL_ARGUMENTS = makeSymbol( "_CSETF-OS-PROCESS-IMPL-ARGUMENTS" );
    $sym17$OS_PROCESS_IMPL_STDIN_STREAM = makeSymbol( "OS-PROCESS-IMPL-STDIN-STREAM" );
    $sym18$_CSETF_OS_PROCESS_IMPL_STDIN_STREAM = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDIN-STREAM" );
    $sym19$OS_PROCESS_IMPL_STDIN_FILENAME = makeSymbol( "OS-PROCESS-IMPL-STDIN-FILENAME" );
    $sym20$_CSETF_OS_PROCESS_IMPL_STDIN_FILENAME = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME" );
    $sym21$OS_PROCESS_IMPL_STDOUT_STREAM = makeSymbol( "OS-PROCESS-IMPL-STDOUT-STREAM" );
    $sym22$_CSETF_OS_PROCESS_IMPL_STDOUT_STREAM = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM" );
    $sym23$OS_PROCESS_IMPL_STDOUT_FILENAME = makeSymbol( "OS-PROCESS-IMPL-STDOUT-FILENAME" );
    $sym24$_CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME" );
    $sym25$OS_PROCESS_IMPL_STDERR_STREAM = makeSymbol( "OS-PROCESS-IMPL-STDERR-STREAM" );
    $sym26$_CSETF_OS_PROCESS_IMPL_STDERR_STREAM = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDERR-STREAM" );
    $sym27$OS_PROCESS_IMPL_STDERR_FILENAME = makeSymbol( "OS-PROCESS-IMPL-STDERR-FILENAME" );
    $sym28$_CSETF_OS_PROCESS_IMPL_STDERR_FILENAME = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME" );
    $sym29$OS_PROCESS_IMPL_STATUS = makeSymbol( "OS-PROCESS-IMPL-STATUS" );
    $sym30$_CSETF_OS_PROCESS_IMPL_STATUS = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STATUS" );
    $sym31$OS_PROCESS_IMPL_STARTED = makeSymbol( "OS-PROCESS-IMPL-STARTED" );
    $sym32$_CSETF_OS_PROCESS_IMPL_STARTED = makeSymbol( "_CSETF-OS-PROCESS-IMPL-STARTED" );
    $sym33$OS_PROCESS_IMPL_FINISHED = makeSymbol( "OS-PROCESS-IMPL-FINISHED" );
    $sym34$_CSETF_OS_PROCESS_IMPL_FINISHED = makeSymbol( "_CSETF-OS-PROCESS-IMPL-FINISHED" );
    $sym35$OS_PROCESS_IMPL_EXIT_CODE = makeSymbol( "OS-PROCESS-IMPL-EXIT-CODE" );
    $sym36$_CSETF_OS_PROCESS_IMPL_EXIT_CODE = makeSymbol( "_CSETF-OS-PROCESS-IMPL-EXIT-CODE" );
    $sym37$OS_PROCESS_IMPL_PROPERTIES = makeSymbol( "OS-PROCESS-IMPL-PROPERTIES" );
    $sym38$_CSETF_OS_PROCESS_IMPL_PROPERTIES = makeSymbol( "_CSETF-OS-PROCESS-IMPL-PROPERTIES" );
    $kw39$ID = makeKeyword( "ID" );
    $kw40$NAME = makeKeyword( "NAME" );
    $kw41$PROGRAM = makeKeyword( "PROGRAM" );
    $kw42$ARGUMENTS = makeKeyword( "ARGUMENTS" );
    $kw43$STDIN_STREAM = makeKeyword( "STDIN-STREAM" );
    $kw44$STDIN_FILENAME = makeKeyword( "STDIN-FILENAME" );
    $kw45$STDOUT_STREAM = makeKeyword( "STDOUT-STREAM" );
    $kw46$STDOUT_FILENAME = makeKeyword( "STDOUT-FILENAME" );
    $kw47$STDERR_STREAM = makeKeyword( "STDERR-STREAM" );
    $kw48$STDERR_FILENAME = makeKeyword( "STDERR-FILENAME" );
    $kw49$STATUS = makeKeyword( "STATUS" );
    $kw50$STARTED = makeKeyword( "STARTED" );
    $kw51$FINISHED = makeKeyword( "FINISHED" );
    $kw52$EXIT_CODE = makeKeyword( "EXIT-CODE" );
    $kw53$PROPERTIES = makeKeyword( "PROPERTIES" );
    $str54$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw55$BEGIN = makeKeyword( "BEGIN" );
    $sym56$MAKE_OS_PROCESS_IMPL = makeSymbol( "MAKE-OS-PROCESS-IMPL" );
    $kw57$SLOT = makeKeyword( "SLOT" );
    $kw58$END = makeKeyword( "END" );
    $sym59$VISIT_DEFSTRUCT_OBJECT_OS_PROCESS_IMPL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-OS-PROCESS-IMPL-METHOD" );
    $str60$__OS_PROCESS_ = makeString( "#<OS-PROCESS " );
    $str61$_A__S__A__S__A = makeString( "~A ~S ~A ~S ~A" );
    $str62$_ = makeString( ">" );
    $kw63$STREAM = makeKeyword( "STREAM" );
    $kw64$OUTPUT = makeKeyword( "OUTPUT" );
    $list65 = ConsesLow.list( makeKeyword( "INITIALIZING" ), makeKeyword( "RUNNING" ), makeKeyword( "DEAD" ), makeKeyword( "FAILURE" ) );
    $sym66$_OS_PROCESS_ENUMERATION_LOCK_ = makeSymbol( "*OS-PROCESS-ENUMERATION-LOCK*" );
    $str67$OS_Process_enumeration_lock = makeString( "OS Process enumeration lock" );
    $sym68$_ACTIVE_OS_PROCESSES_ = makeSymbol( "*ACTIVE-OS-PROCESSES*" );
    $str69$_A___A____A__A__ = makeString( "~A (~A): ~A ~A~%" );
    $str70$Trying_to_remove_missing_OS_proce = makeString( "Trying to remove missing OS process ~A from active process list" );
    $sym71$STRINGP = makeSymbol( "STRINGP" );
    $sym72$SEQUENCEP = makeSymbol( "SEQUENCEP" );
    $sym73$VALID_OS_PROCESS_INPUT_STREAM_SPEC_P = makeSymbol( "VALID-OS-PROCESS-INPUT-STREAM-SPEC-P" );
    $sym74$VALID_OS_PROCESS_ERROR_OUTPUT_STREAM_SPEC_P = makeSymbol( "VALID-OS-PROCESS-ERROR-OUTPUT-STREAM-SPEC-P" );
    $sym75$VALID_OS_PROCESS_OUTPUT_STREAM_SPEC_P = makeSymbol( "VALID-OS-PROCESS-OUTPUT-STREAM-SPEC-P" );
    $kw76$INITIALIZING = makeKeyword( "INITIALIZING" );
    $kw77$RUNNING = makeKeyword( "RUNNING" );
    $kw78$FAILURE = makeKeyword( "FAILURE" );
    $sym79$OS_PROCESS_P = makeSymbol( "OS-PROCESS-P" );
    $float80$0_1 = makeDouble( 0.1 );
    $str81$Currently_not_implemented_for_thi = makeString( "Currently not implemented for this port." );
    $str82$_ = makeString( " " );
    $kw83$DEAD = makeKeyword( "DEAD" );
    $str84$Currently_not_implemented_ = makeString( "Currently not implemented." );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "OS-PROCESS-VAR" ), makeSymbol( "COMMAND" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ARGS" ), NIL ), ConsesLow.list( makeSymbol( "NAME" ), makeString(
        "My OS process" ) ), ConsesLow.list( makeSymbol( "STDIN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*STANDARD-INPUT*" ) ) ), ConsesLow.list( makeSymbol( "STDOUT" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) ), ConsesLow.list( makeSymbol( "STDERR" ), makeKeyword( "OUTPUT" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list86 = ConsesLow.list( makeKeyword( "ARGS" ), makeKeyword( "NAME" ), makeKeyword( "STDIN" ), makeKeyword( "STDOUT" ), makeKeyword( "STDERR" ) );
    $kw87$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw88$ARGS = makeKeyword( "ARGS" );
    $str89$My_OS_process = makeString( "My OS process" );
    $kw90$STDIN = makeKeyword( "STDIN" );
    $sym91$_STANDARD_INPUT_ = makeSymbol( "*STANDARD-INPUT*" );
    $kw92$STDOUT = makeKeyword( "STDOUT" );
    $sym93$_STANDARD_OUTPUT_ = makeSymbol( "*STANDARD-OUTPUT*" );
    $kw94$STDERR = makeKeyword( "STDERR" );
    $sym95$CLET = makeSymbol( "CLET" );
    $sym96$MAKE_OS_PROCESS = makeSymbol( "MAKE-OS-PROCESS" );
    $sym97$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym98$PROGN = makeSymbol( "PROGN" );
    $sym99$DESTROY_OS_PROCESS = makeSymbol( "DESTROY-OS-PROCESS" );
    $sym100$RUN_OS_PROCESS = makeSymbol( "RUN-OS-PROCESS" );
    $sym101$WAIT_UNTIL_OS_PROCESS_FINISHED = makeSymbol( "WAIT-UNTIL-OS-PROCESS-FINISHED" );
    $str102$My_system_eval_OS_Process = makeString( "My system-eval OS Process" );
    $str103$My_system_eval_OS_Process_outputt = makeString( "My system-eval OS Process outputting to " );
    $kw104$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym105$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym106$FORK_CYC_SERVER_PROCESS = makeSymbol( "FORK-CYC-SERVER-PROCESS" );
    $sym107$FORK_CYC_SERVER_PROCESS_IMPLEMENTATION = makeSymbol( "FORK-CYC-SERVER-PROCESS-IMPLEMENTATION" );
  }

  public static final class $os_process_impl_native
      extends
        SubLStructNative
  {
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

    public $os_process_impl_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
      this.$program = CommonSymbols.NIL;
      this.$arguments = CommonSymbols.NIL;
      this.$stdin_stream = CommonSymbols.NIL;
      this.$stdin_filename = CommonSymbols.NIL;
      this.$stdout_stream = CommonSymbols.NIL;
      this.$stdout_filename = CommonSymbols.NIL;
      this.$stderr_stream = CommonSymbols.NIL;
      this.$stderr_filename = CommonSymbols.NIL;
      this.$status = CommonSymbols.NIL;
      this.$started = CommonSymbols.NIL;
      this.$finished = CommonSymbols.NIL;
      this.$exit_code = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $os_process_impl_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$program;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$arguments;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$stdin_stream;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$stdin_filename;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$stdout_stream;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$stdout_filename;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$stderr_stream;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$stderr_filename;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$status;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$started;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$finished;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$exit_code;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$program = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$arguments = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$stdin_stream = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$stdin_filename = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$stdout_stream = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$stdout_filename = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$stderr_stream = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$stderr_filename = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$status = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$started = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$finished = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$exit_code = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $os_process_impl_native.class, $sym0$OS_PROCESS_IMPL, $sym1$OS_PROCESS_IMPL_P, $list2, $list3, new String[] { "$id", "$name", "$program", "$arguments", "$stdin_stream",
        "$stdin_filename", "$stdout_stream", "$stdout_filename", "$stderr_stream", "$stderr_filename", "$status", "$started", "$finished", "$exit_code", "$properties"
      }, $list4, $list5, $sym6$PRINT_OS_PROCESS_IMPL );
    }
  }

  public static final class $os_process_impl_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $os_process_impl_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "OS-PROCESS-IMPL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return os_process_impl_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 332 ms
 * 
 */