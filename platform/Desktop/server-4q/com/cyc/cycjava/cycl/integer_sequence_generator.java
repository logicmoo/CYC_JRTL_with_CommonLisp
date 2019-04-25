package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class integer_sequence_generator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.integer_sequence_generator";
  public static final String myFingerPrint = "75e0f470924e95d6caf6dd935ca8a5609c04ff0c5be17462b6189dcfcb3ae11c";
  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLSymbol $dtp_integer_sequence_generator$;
  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4425L)
  private static SubLSymbol $cfasl_wide_opcode_isg$;
  private static final SubLSymbol $sym0$INTEGER_SEQUENCE_GENERATOR;
  private static final SubLSymbol $sym1$INTEGER_SEQUENCE_GENERATOR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR;
  private static final SubLSymbol $sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$ISG_LOCK;
  private static final SubLSymbol $sym10$_CSETF_ISG_LOCK;
  private static final SubLSymbol $sym11$ISG_CURRENT;
  private static final SubLSymbol $sym12$_CSETF_ISG_CURRENT;
  private static final SubLSymbol $sym13$ISG_START;
  private static final SubLSymbol $sym14$_CSETF_ISG_START;
  private static final SubLSymbol $sym15$ISG_LIMIT;
  private static final SubLSymbol $sym16$_CSETF_ISG_LIMIT;
  private static final SubLSymbol $sym17$ISG_DELTA;
  private static final SubLSymbol $sym18$_CSETF_ISG_DELTA;
  private static final SubLSymbol $kw19$LOCK;
  private static final SubLSymbol $kw20$CURRENT;
  private static final SubLSymbol $kw21$START;
  private static final SubLSymbol $kw22$LIMIT;
  private static final SubLSymbol $kw23$DELTA;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_INTEGER_SEQUENCE_GENERATOR;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD;
  private static final SubLString $str30$__ISG_From__A;
  private static final SubLString $str31$_to__A;
  private static final SubLString $str32$_by__A;
  private static final SubLString $str33$_at__A_;
  private static final SubLSymbol $sym34$INTEGERP;
  private static final SubLString $str35$DELTA_must_not_be_zero;
  private static final SubLString $str36$ISG;
  private static final SubLString $str37$Integer_Sequence_Generator__S_has;
  private static final SubLInteger $int38$130;
  private static final SubLSymbol $sym39$CFASL_INPUT_ISG;
  private static final SubLSymbol $sym40$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject integer_sequence_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_integer_sequence_generator( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject integer_sequence_generator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $integer_sequence_generator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject isg_lock(final SubLObject v_object)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject isg_current(final SubLObject v_object)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject isg_start(final SubLObject v_object)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject isg_limit(final SubLObject v_object)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject isg_delta(final SubLObject v_object)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject _csetf_isg_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject _csetf_isg_current(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject _csetf_isg_start(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject _csetf_isg_limit(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject _csetf_isg_delta(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != integer_sequence_generator_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject make_integer_sequence_generator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $integer_sequence_generator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$LOCK ) )
      {
        _csetf_isg_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$CURRENT ) )
      {
        _csetf_isg_current( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$START ) )
      {
        _csetf_isg_start( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$LIMIT ) )
      {
        _csetf_isg_limit( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$DELTA ) )
      {
        _csetf_isg_delta( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject visit_defstruct_integer_sequence_generator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_INTEGER_SEQUENCE_GENERATOR, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw19$LOCK, isg_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw20$CURRENT, isg_current( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$START, isg_start( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$LIMIT, isg_limit( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$DELTA, isg_delta( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_INTEGER_SEQUENCE_GENERATOR, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1209L)
  public static SubLObject visit_defstruct_object_integer_sequence_generator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_integer_sequence_generator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1430L)
  public static SubLObject print_integer_sequence_generator(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject start = isg_start( v_object );
    final SubLObject current = isg_current( v_object );
    final SubLObject limit = isg_limit( v_object );
    final SubLObject delta = isg_delta( v_object );
    PrintLow.format( stream, $str30$__ISG_From__A, start );
    if( NIL != limit )
    {
      PrintLow.format( stream, $str31$_to__A, limit );
    }
    PrintLow.format( stream, $str32$_by__A, delta );
    PrintLow.format( stream, $str33$_at__A_, current );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 1840L)
  public static SubLObject fast_forward_isg(final SubLObject isg, final SubLObject current)
  {
    assert NIL != integer_sequence_generator_p( isg ) : isg;
    final SubLObject lock = isg_lock( isg );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_isg_current( isg, current );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return isg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 2114L)
  public static SubLObject new_integer_sequence_generator(SubLObject start, SubLObject limit, SubLObject delta)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    if( delta == UNPROVIDED )
    {
      delta = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( start ) : start;
    assert NIL != Types.integerp( delta ) : delta;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && delta.isZero() )
    {
      Errors.error( $str35$DELTA_must_not_be_zero );
    }
    if( NIL != limit && !assertionsDisabledInClass && NIL == Types.integerp( limit ) )
    {
      throw new AssertionError( limit );
    }
    final SubLObject isg = make_integer_sequence_generator( UNPROVIDED );
    final SubLObject lock = Locks.make_lock( $str36$ISG );
    _csetf_isg_lock( isg, lock );
    _csetf_isg_start( isg, start );
    _csetf_isg_limit( isg, limit );
    _csetf_isg_delta( isg, delta );
    return integer_sequence_generator_reset( isg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 2777L)
  public static SubLObject integer_sequence_generator_reset(final SubLObject isg)
  {
    assert NIL != integer_sequence_generator_p( isg ) : isg;
    final SubLObject lock = isg_lock( isg );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_isg_current( isg, isg_start( isg ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return isg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 3065L)
  public static SubLObject integer_sequence_generator_next(final SubLObject isg)
  {
    assert NIL != integer_sequence_generator_p( isg ) : isg;
    final SubLObject lock = isg_lock( isg );
    SubLObject current = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject limit = isg_limit( isg );
      final SubLObject delta = isg_delta( isg );
      current = isg_current( isg );
      if( NIL != limit && NIL != ( delta.isNegative() ? Numbers.numLE( current, limit ) : Numbers.numGE( current, limit ) ) )
      {
        current = NIL;
      }
      if( NIL != current )
      {
        _csetf_isg_current( isg, Numbers.add( isg_current( isg ), delta ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    if( NIL != current )
    {
      return current;
    }
    Errors.error( $str37$Integer_Sequence_Generator__S_has, isg );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 3718L)
  public static SubLObject get_integer_sequence_generator_start(final SubLObject isg)
  {
    assert NIL != integer_sequence_generator_p( isg ) : isg;
    return isg_start( isg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 3917L)
  public static SubLObject get_integer_sequence_generator_recent(final SubLObject isg)
  {
    assert NIL != integer_sequence_generator_p( isg ) : isg;
    final SubLObject lock = isg_lock( isg );
    SubLObject recent = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      recent = isg_current( isg );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    if( !recent.numE( isg_start( isg ) ) )
    {
      recent = Numbers.subtract( recent, isg_delta( isg ) );
    }
    return recent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4525L)
  public static SubLObject cfasl_output_object_integer_sequence_generator_method(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_wide_output_isg( v_object, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4664L)
  public static SubLObject cfasl_wide_output_isg(final SubLObject isg, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_isg$.getGlobalValue(), stream );
    cfasl_output_isg_internal( isg, stream );
    return isg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 4831L)
  public static SubLObject cfasl_output_isg_internal(final SubLObject isg, final SubLObject stream)
  {
    final SubLObject lock = isg_lock( isg );
    SubLObject current = NIL;
    SubLObject start = NIL;
    SubLObject delta = NIL;
    SubLObject limit = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      current = isg_current( isg );
      start = isg_start( isg );
      limit = isg_limit( isg );
      delta = isg_delta( isg );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    cfasl.cfasl_output( current, stream );
    cfasl.cfasl_output( start, stream );
    cfasl.cfasl_output( limit, stream );
    cfasl.cfasl_output( delta, stream );
    return isg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/integer-sequence-generator.lisp", position = 5272L)
  public static SubLObject cfasl_input_isg(final SubLObject stream)
  {
    final SubLObject current = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject start = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject limit = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject delta = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject isg = new_integer_sequence_generator( start, limit, delta );
    return fast_forward_isg( isg, current );
  }

  public static SubLObject declare_integer_sequence_generator_file()
  {
    SubLFiles.declareFunction( me, "integer_sequence_generator_print_function_trampoline", "INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_p", "INTEGER-SEQUENCE-GENERATOR-P", 1, 0, false );
    new $integer_sequence_generator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "isg_lock", "ISG-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "isg_current", "ISG-CURRENT", 1, 0, false );
    SubLFiles.declareFunction( me, "isg_start", "ISG-START", 1, 0, false );
    SubLFiles.declareFunction( me, "isg_limit", "ISG-LIMIT", 1, 0, false );
    SubLFiles.declareFunction( me, "isg_delta", "ISG-DELTA", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_isg_lock", "_CSETF-ISG-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_isg_current", "_CSETF-ISG-CURRENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_isg_start", "_CSETF-ISG-START", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_isg_limit", "_CSETF-ISG-LIMIT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_isg_delta", "_CSETF-ISG-DELTA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_integer_sequence_generator", "MAKE-INTEGER-SEQUENCE-GENERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_integer_sequence_generator", "VISIT-DEFSTRUCT-INTEGER-SEQUENCE-GENERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_integer_sequence_generator_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_integer_sequence_generator", "PRINT-INTEGER-SEQUENCE-GENERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "fast_forward_isg", "FAST-FORWARD-ISG", 2, 0, false );
    SubLFiles.declareFunction( me, "new_integer_sequence_generator", "NEW-INTEGER-SEQUENCE-GENERATOR", 0, 3, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_reset", "INTEGER-SEQUENCE-GENERATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_sequence_generator_next", "INTEGER-SEQUENCE-GENERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_integer_sequence_generator_start", "GET-INTEGER-SEQUENCE-GENERATOR-START", 1, 0, false );
    SubLFiles.declareFunction( me, "get_integer_sequence_generator_recent", "GET-INTEGER-SEQUENCE-GENERATOR-RECENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_integer_sequence_generator_method", "CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_output_isg", "CFASL-WIDE-OUTPUT-ISG", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_isg_internal", "CFASL-OUTPUT-ISG-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_isg", "CFASL-INPUT-ISG", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_integer_sequence_generator_file()
  {
    $dtp_integer_sequence_generator$ = SubLFiles.defconstant( "*DTP-INTEGER-SEQUENCE-GENERATOR*", $sym0$INTEGER_SEQUENCE_GENERATOR );
    $cfasl_wide_opcode_isg$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-ISG*", $int38$130 );
    return NIL;
  }

  public static SubLObject setup_integer_sequence_generator_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function(
        $sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$ISG_LOCK, $sym10$_CSETF_ISG_LOCK );
    Structures.def_csetf( $sym11$ISG_CURRENT, $sym12$_CSETF_ISG_CURRENT );
    Structures.def_csetf( $sym13$ISG_START, $sym14$_CSETF_ISG_START );
    Structures.def_csetf( $sym15$ISG_LIMIT, $sym16$_CSETF_ISG_LIMIT );
    Structures.def_csetf( $sym17$ISG_DELTA, $sym18$_CSETF_ISG_DELTA );
    Equality.identity( $sym0$INTEGER_SEQUENCE_GENERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function(
        $sym29$VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD ) );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_isg$.getGlobalValue(), $sym39$CFASL_INPUT_ISG );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function(
        $sym40$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_integer_sequence_generator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_integer_sequence_generator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_integer_sequence_generator_file();
  }
  static
  {
    me = new integer_sequence_generator();
    $dtp_integer_sequence_generator$ = null;
    $cfasl_wide_opcode_isg$ = null;
    $sym0$INTEGER_SEQUENCE_GENERATOR = makeSymbol( "INTEGER-SEQUENCE-GENERATOR" );
    $sym1$INTEGER_SEQUENCE_GENERATOR_P = makeSymbol( "INTEGER-SEQUENCE-GENERATOR-P" );
    $list2 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "CURRENT" ), makeSymbol( "START" ), makeSymbol( "LIMIT" ), makeSymbol( "DELTA" ) );
    $list3 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "CURRENT" ), makeKeyword( "START" ), makeKeyword( "LIMIT" ), makeKeyword( "DELTA" ) );
    $list4 = ConsesLow.list( makeSymbol( "ISG-LOCK" ), makeSymbol( "ISG-CURRENT" ), makeSymbol( "ISG-START" ), makeSymbol( "ISG-LIMIT" ), makeSymbol( "ISG-DELTA" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-ISG-LOCK" ), makeSymbol( "_CSETF-ISG-CURRENT" ), makeSymbol( "_CSETF-ISG-START" ), makeSymbol( "_CSETF-ISG-LIMIT" ), makeSymbol( "_CSETF-ISG-DELTA" ) );
    $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR = makeSymbol( "PRINT-INTEGER-SEQUENCE-GENERATOR" );
    $sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INTEGER-SEQUENCE-GENERATOR-P" ) );
    $sym9$ISG_LOCK = makeSymbol( "ISG-LOCK" );
    $sym10$_CSETF_ISG_LOCK = makeSymbol( "_CSETF-ISG-LOCK" );
    $sym11$ISG_CURRENT = makeSymbol( "ISG-CURRENT" );
    $sym12$_CSETF_ISG_CURRENT = makeSymbol( "_CSETF-ISG-CURRENT" );
    $sym13$ISG_START = makeSymbol( "ISG-START" );
    $sym14$_CSETF_ISG_START = makeSymbol( "_CSETF-ISG-START" );
    $sym15$ISG_LIMIT = makeSymbol( "ISG-LIMIT" );
    $sym16$_CSETF_ISG_LIMIT = makeSymbol( "_CSETF-ISG-LIMIT" );
    $sym17$ISG_DELTA = makeSymbol( "ISG-DELTA" );
    $sym18$_CSETF_ISG_DELTA = makeSymbol( "_CSETF-ISG-DELTA" );
    $kw19$LOCK = makeKeyword( "LOCK" );
    $kw20$CURRENT = makeKeyword( "CURRENT" );
    $kw21$START = makeKeyword( "START" );
    $kw22$LIMIT = makeKeyword( "LIMIT" );
    $kw23$DELTA = makeKeyword( "DELTA" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_INTEGER_SEQUENCE_GENERATOR = makeSymbol( "MAKE-INTEGER-SEQUENCE-GENERATOR" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD" );
    $str30$__ISG_From__A = makeString( "#<ISG:From ~A" );
    $str31$_to__A = makeString( " to ~A" );
    $str32$_by__A = makeString( " by ~A" );
    $str33$_at__A_ = makeString( " at ~A>" );
    $sym34$INTEGERP = makeSymbol( "INTEGERP" );
    $str35$DELTA_must_not_be_zero = makeString( "DELTA must not be zero" );
    $str36$ISG = makeString( "ISG" );
    $str37$Integer_Sequence_Generator__S_has = makeString( "Integer Sequence Generator ~S has been exhausted" );
    $int38$130 = makeInteger( 130 );
    $sym39$CFASL_INPUT_ISG = makeSymbol( "CFASL-INPUT-ISG" );
    $sym40$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD" );
  }

  public static final class $integer_sequence_generator_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $current;
    public SubLObject $start;
    public SubLObject $limit;
    public SubLObject $delta;
    private static final SubLStructDeclNative structDecl;

    public $integer_sequence_generator_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$current = CommonSymbols.NIL;
      this.$start = CommonSymbols.NIL;
      this.$limit = CommonSymbols.NIL;
      this.$delta = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $integer_sequence_generator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$current;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$start;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$limit;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$delta;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$current = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$start = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$limit = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$delta = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $integer_sequence_generator_native.class, $sym0$INTEGER_SEQUENCE_GENERATOR, $sym1$INTEGER_SEQUENCE_GENERATOR_P, $list2, $list3, new String[] { "$lock", "$current",
        "$start", "$limit", "$delta"
      }, $list4, $list5, $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR );
    }
  }

  public static final class $integer_sequence_generator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $integer_sequence_generator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INTEGER-SEQUENCE-GENERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return integer_sequence_generator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 91 ms synthetic
 */