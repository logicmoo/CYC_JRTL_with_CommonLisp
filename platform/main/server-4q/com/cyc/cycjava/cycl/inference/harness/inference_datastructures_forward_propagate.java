package com.cyc.cycjava.cycl.inference.harness;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_forward_propagate
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate";
  public static final String myFingerPrint = "124acc916b3f9d8c2b19bd91f24dece51d03d76b95e2de05bf05c2c9b11b6068";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLSymbol $dtp_forward_propagate$;
  private static final SubLSymbol $sym0$FORWARD_PROPAGATE;
  private static final SubLSymbol $sym1$FORWARD_PROPAGATE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_FORWARD_PROPAGATE;
  private static final SubLSymbol $sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$FPMT_OLD_QUEUE;
  private static final SubLSymbol $sym10$_CSETF_FPMT_OLD_QUEUE;
  private static final SubLSymbol $sym11$FPMT_NEW_QUEUE;
  private static final SubLSymbol $sym12$_CSETF_FPMT_NEW_QUEUE;
  private static final SubLSymbol $kw13$OLD_QUEUE;
  private static final SubLSymbol $kw14$NEW_QUEUE;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_FORWARD_PROPAGATE;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD;
  private static final SubLString $str21$_Forward_Propagate_old__a_new__a;
  private static final SubLString $str22$_Invalid_Forward_Propagate__s_;
  private static final SubLSymbol $sym23$QUEUE_P;
  private static final SubLSymbol $sym24$RULE_ASSERTION_;
  private static final SubLSymbol $kw25$FREE;
  private static final SubLSymbol $sym26$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym27$ASSERTION_P;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject forward_propagate_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_forward_propagate( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject forward_propagate_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $forward_propagate_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject fpmt_old_queue(final SubLObject v_object)
  {
    assert NIL != forward_propagate_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject fpmt_new_queue(final SubLObject v_object)
  {
    assert NIL != forward_propagate_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject _csetf_fpmt_old_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_propagate_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject _csetf_fpmt_new_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_propagate_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject make_forward_propagate(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $forward_propagate_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$OLD_QUEUE ) )
      {
        _csetf_fpmt_old_queue( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$NEW_QUEUE ) )
      {
        _csetf_fpmt_new_queue( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject visit_defstruct_forward_propagate(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_FORWARD_PROPAGATE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$OLD_QUEUE, fpmt_old_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$NEW_QUEUE, fpmt_new_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_FORWARD_PROPAGATE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164L)
  public static SubLObject visit_defstruct_object_forward_propagate_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_forward_propagate( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1295L)
  public static SubLObject print_forward_propagate(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != forward_propagate_p( v_object ) )
    {
      PrintLow.format( stream, $str21$_Forward_Propagate_old__a_new__a, queues.queue_size( forward_propagate_old_queue( v_object ) ), queues.queue_size( forward_propagate_new_queue( v_object ) ) );
    }
    else
    {
      PrintLow.format( stream, $str22$_Invalid_Forward_Propagate__s_, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1662L)
  public static SubLObject new_forward_propagate(SubLObject source_mt)
  {
    if( source_mt == UNPROVIDED )
    {
      source_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fp_mt = make_forward_propagate( UNPROVIDED );
    SubLObject environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      set_forward_propagate_old_queue( fp_mt, forward.current_forward_inference_environment() );
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    environment = forward.get_forward_inference_environment();
    assert NIL != queues.queue_p( environment ) : environment;
    _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_environment$.bind( environment, thread );
      set_forward_propagate_new_queue( fp_mt, forward.current_forward_inference_environment() );
    }
    finally
    {
      kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0, thread );
    }
    if( NIL != hlmt.hlmt_p( source_mt ) )
    {
      SubLObject assertions = kb_mapping.gather_mt_index( source_mt );
      assertions = list_utilities.sort_via_test( conses_high.copy_list( assertions ), Symbols.symbol_function( $sym24$RULE_ASSERTION_ ), UNPROVIDED );
      enqueue_forward_propagate_assertions_to_new_queue( fp_mt, assertions );
    }
    return fp_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2286L)
  public static SubLObject destroy_forward_propagate(final SubLObject forward_propagate)
  {
    if( NIL == forward_propagate_p( forward_propagate ) )
    {
      return NIL;
    }
    queues.clear_queue( fpmt_old_queue( forward_propagate ) );
    queues.clear_queue( fpmt_new_queue( forward_propagate ) );
    _csetf_fpmt_old_queue( forward_propagate, $kw25$FREE );
    _csetf_fpmt_new_queue( forward_propagate, $kw25$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2690L)
  public static SubLObject forward_propagate_old_queue(final SubLObject forward_propagate)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    return fpmt_old_queue( forward_propagate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2856L)
  public static SubLObject set_forward_propagate_old_queue(final SubLObject forward_propagate, final SubLObject queue)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    assert NIL != queues.queue_p( queue ) : queue;
    _csetf_fpmt_old_queue( forward_propagate, queue );
    return forward_propagate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3093L)
  public static SubLObject clear_forward_propagate_old_queue(final SubLObject forward_propagate)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    queues.clear_queue( fpmt_old_queue( forward_propagate ) );
    return forward_propagate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3297L)
  public static SubLObject forward_propagate_new_queue(final SubLObject forward_propagate)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    return fpmt_new_queue( forward_propagate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3461L)
  public static SubLObject set_forward_propagate_new_queue(final SubLObject forward_propagate, final SubLObject queue)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    assert NIL != queues.queue_p( queue ) : queue;
    _csetf_fpmt_new_queue( forward_propagate, queue );
    return forward_propagate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3698L)
  public static SubLObject swap_forward_propagate_queues(final SubLObject forward_propagate)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    final SubLObject temp_swap = forward_propagate_old_queue( forward_propagate );
    set_forward_propagate_old_queue( forward_propagate, forward_propagate_new_queue( forward_propagate ) );
    set_forward_propagate_new_queue( forward_propagate, temp_swap );
    return forward_propagate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 4098L)
  public static SubLObject enqueue_forward_propagate_assertions_to_new_queue(final SubLObject forward_propagate, final SubLObject assertions)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    assert NIL != list_utilities.non_dotted_list_p( assertions ) : assertions;
    SubLObject cdolist_list_var = assertions;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != assertion_handles.assertion_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      queues.enqueue( assertion, fpmt_new_queue( forward_propagate ) );
      cdolist_list_var2 = cdolist_list_var2.rest();
      assertion = cdolist_list_var2.first();
    }
    return forward_propagate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 4415L)
  public static SubLObject dequeue_forward_propagate_assertion_from_old_queue(final SubLObject forward_propagate)
  {
    assert NIL != forward_propagate_p( forward_propagate ) : forward_propagate;
    return queues.dequeue( fpmt_old_queue( forward_propagate ) );
  }

  public static SubLObject declare_inference_datastructures_forward_propagate_file()
  {
    SubLFiles.declareFunction( me, "forward_propagate_print_function_trampoline", "FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_propagate_p", "FORWARD-PROPAGATE-P", 1, 0, false );
    new $forward_propagate_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fpmt_old_queue", "FPMT-OLD-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "fpmt_new_queue", "FPMT-NEW-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fpmt_old_queue", "_CSETF-FPMT-OLD-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fpmt_new_queue", "_CSETF-FPMT-NEW-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_forward_propagate", "MAKE-FORWARD-PROPAGATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_forward_propagate", "VISIT-DEFSTRUCT-FORWARD-PROPAGATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_forward_propagate_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_forward_propagate", "PRINT-FORWARD-PROPAGATE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_forward_propagate", "NEW-FORWARD-PROPAGATE", 0, 1, false );
    SubLFiles.declareFunction( me, "destroy_forward_propagate", "DESTROY-FORWARD-PROPAGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_propagate_old_queue", "FORWARD-PROPAGATE-OLD-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_forward_propagate_old_queue", "SET-FORWARD-PROPAGATE-OLD-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_forward_propagate_old_queue", "CLEAR-FORWARD-PROPAGATE-OLD-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_propagate_new_queue", "FORWARD-PROPAGATE-NEW-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_forward_propagate_new_queue", "SET-FORWARD-PROPAGATE-NEW-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "swap_forward_propagate_queues", "SWAP-FORWARD-PROPAGATE-QUEUES", 1, 0, false );
    SubLFiles.declareFunction( me, "enqueue_forward_propagate_assertions_to_new_queue", "ENQUEUE-FORWARD-PROPAGATE-ASSERTIONS-TO-NEW-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "dequeue_forward_propagate_assertion_from_old_queue", "DEQUEUE-FORWARD-PROPAGATE-ASSERTION-FROM-OLD-QUEUE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_datastructures_forward_propagate_file()
  {
    $dtp_forward_propagate$ = SubLFiles.defconstant( "*DTP-FORWARD-PROPAGATE*", $sym0$FORWARD_PROPAGATE );
    return NIL;
  }

  public static SubLObject setup_inference_datastructures_forward_propagate_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_propagate$.getGlobalValue(), Symbols.symbol_function( $sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$FPMT_OLD_QUEUE, $sym10$_CSETF_FPMT_OLD_QUEUE );
    Structures.def_csetf( $sym11$FPMT_NEW_QUEUE, $sym12$_CSETF_FPMT_NEW_QUEUE );
    Equality.identity( $sym0$FORWARD_PROPAGATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_propagate$.getGlobalValue(), Symbols.symbol_function(
        $sym20$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_datastructures_forward_propagate_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_datastructures_forward_propagate_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_datastructures_forward_propagate_file();
  }
  static
  {
    me = new inference_datastructures_forward_propagate();
    $dtp_forward_propagate$ = null;
    $sym0$FORWARD_PROPAGATE = makeSymbol( "FORWARD-PROPAGATE" );
    $sym1$FORWARD_PROPAGATE_P = makeSymbol( "FORWARD-PROPAGATE-P" );
    $list2 = ConsesLow.list( makeSymbol( "OLD-QUEUE" ), makeSymbol( "NEW-QUEUE" ) );
    $list3 = ConsesLow.list( makeKeyword( "OLD-QUEUE" ), makeKeyword( "NEW-QUEUE" ) );
    $list4 = ConsesLow.list( makeSymbol( "FPMT-OLD-QUEUE" ), makeSymbol( "FPMT-NEW-QUEUE" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-FPMT-OLD-QUEUE" ), makeSymbol( "_CSETF-FPMT-NEW-QUEUE" ) );
    $sym6$PRINT_FORWARD_PROPAGATE = makeSymbol( "PRINT-FORWARD-PROPAGATE" );
    $sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FORWARD-PROPAGATE-P" ) );
    $sym9$FPMT_OLD_QUEUE = makeSymbol( "FPMT-OLD-QUEUE" );
    $sym10$_CSETF_FPMT_OLD_QUEUE = makeSymbol( "_CSETF-FPMT-OLD-QUEUE" );
    $sym11$FPMT_NEW_QUEUE = makeSymbol( "FPMT-NEW-QUEUE" );
    $sym12$_CSETF_FPMT_NEW_QUEUE = makeSymbol( "_CSETF-FPMT-NEW-QUEUE" );
    $kw13$OLD_QUEUE = makeKeyword( "OLD-QUEUE" );
    $kw14$NEW_QUEUE = makeKeyword( "NEW-QUEUE" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_FORWARD_PROPAGATE = makeSymbol( "MAKE-FORWARD-PROPAGATE" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATE-METHOD" );
    $str21$_Forward_Propagate_old__a_new__a = makeString( "<Forward Propagate old=~a new=~a" );
    $str22$_Invalid_Forward_Propagate__s_ = makeString( "<Invalid Forward Propagate ~s>" );
    $sym23$QUEUE_P = makeSymbol( "QUEUE-P" );
    $sym24$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $kw25$FREE = makeKeyword( "FREE" );
    $sym26$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym27$ASSERTION_P = makeSymbol( "ASSERTION-P" );
  }

  public static final class $forward_propagate_native
      extends
        SubLStructNative
  {
    public SubLObject $old_queue;
    public SubLObject $new_queue;
    private static final SubLStructDeclNative structDecl;

    public $forward_propagate_native()
    {
      this.$old_queue = CommonSymbols.NIL;
      this.$new_queue = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $forward_propagate_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$old_queue;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$new_queue;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$old_queue = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$new_queue = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $forward_propagate_native.class, $sym0$FORWARD_PROPAGATE, $sym1$FORWARD_PROPAGATE_P, $list2, $list3, new String[] { "$old_queue", "$new_queue"
      }, $list4, $list5, $sym6$PRINT_FORWARD_PROPAGATE );
    }
  }

  public static final class $forward_propagate_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_propagate_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-PROPAGATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_propagate_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 70 ms
 * 
 */