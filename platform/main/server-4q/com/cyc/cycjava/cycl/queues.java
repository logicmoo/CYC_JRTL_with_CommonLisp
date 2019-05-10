package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class queues
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.queues";
  public static final String myFingerPrint = "4ea470777cc1a58b46b2346208558b4c44a196c7f0661352be50f6c1fb15f498";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLSymbol $dtp_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6933L)
  private static SubLSymbol $cfasl_wide_opcode_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLSymbol $dtp_priority_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLSymbol $dtp_lazy_priority_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLSymbol $dtp_locked_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLSymbol $dtp_locked_p_queue$;
  private static final SubLSymbol $sym0$QUEUE;
  private static final SubLSymbol $sym1$QUEUE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_QUEUE;
  private static final SubLSymbol $sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$Q_NUM;
  private static final SubLSymbol $sym10$_CSETF_Q_NUM;
  private static final SubLSymbol $sym11$Q_ELEMENTS;
  private static final SubLSymbol $sym12$_CSETF_Q_ELEMENTS;
  private static final SubLSymbol $sym13$Q_LAST;
  private static final SubLSymbol $sym14$_CSETF_Q_LAST;
  private static final SubLSymbol $kw15$NUM;
  private static final SubLSymbol $kw16$ELEMENTS;
  private static final SubLSymbol $kw17$LAST;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_QUEUE;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD;
  private static final SubLString $str24$size_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $kw27$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw28$DONE;
  private static final SubLSymbol $sym29$DO_LIST;
  private static final SubLSymbol $sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS;
  private static final SubLSymbol $sym31$DO_QUEUE_ELEMENTS;
  private static final SubLSymbol $sym32$Q;
  private static final SubLSymbol $sym33$DONE_VAR;
  private static final SubLSymbol $sym34$CLET;
  private static final SubLSymbol $sym35$COR;
  private static final SubLSymbol $sym36$QUEUE_EMPTY_P;
  private static final SubLSymbol $sym37$WHILE;
  private static final SubLSymbol $sym38$CNOT;
  private static final SubLSymbol $sym39$DEQUEUE;
  private static final SubLSymbol $sym40$CSETQ;
  private static final SubLString $str41$__Queue_length____a;
  private static final SubLString $str42$__Queue_contents__;
  private static final SubLString $str43$___s;
  private static final SubLInteger $int44$131;
  private static final SubLSymbol $sym45$CFASL_INPUT_QUEUE;
  private static final SubLSymbol $sym46$CFASL_OUTPUT_OBJECT_QUEUE_METHOD;
  private static final SubLString $str47$We_promised_to_write__A_elements_;
  private static final SubLSymbol $sym48$PRIORITY_QUEUE;
  private static final SubLSymbol $sym49$PRIORITY_QUEUE_P;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$PRINT_P_QUEUE;
  private static final SubLSymbol $sym55$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$P_QUEUE_NUM;
  private static final SubLSymbol $sym58$_CSETF_P_QUEUE_NUM;
  private static final SubLSymbol $sym59$P_QUEUE_MAX_SIZE;
  private static final SubLSymbol $sym60$_CSETF_P_QUEUE_MAX_SIZE;
  private static final SubLSymbol $sym61$P_QUEUE_RANK_FUNC;
  private static final SubLSymbol $sym62$_CSETF_P_QUEUE_RANK_FUNC;
  private static final SubLSymbol $sym63$P_QUEUE_COMP_FUNC;
  private static final SubLSymbol $sym64$_CSETF_P_QUEUE_COMP_FUNC;
  private static final SubLSymbol $sym65$P_QUEUE_TREE;
  private static final SubLSymbol $sym66$_CSETF_P_QUEUE_TREE;
  private static final SubLSymbol $kw67$MAX_SIZE;
  private static final SubLSymbol $kw68$RANK_FUNC;
  private static final SubLSymbol $kw69$COMP_FUNC;
  private static final SubLSymbol $kw70$TREE;
  private static final SubLSymbol $sym71$MAKE_PRIORITY_QUEUE;
  private static final SubLSymbol $sym72$VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD;
  private static final SubLSymbol $sym73$_;
  private static final SubLSymbol $sym74$PQ_COLLISION_ENTER;
  private static final SubLSymbol $sym75$PQ_COLLISION_REMOVE;
  private static final SubLSymbol $sym76$PQ_COLLISION_EMPTY;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$KEY_VAR;
  private static final SubLSymbol $sym79$COLLISIONS_VAR;
  private static final SubLSymbol $sym80$DO_BTREE_INDEX;
  private static final SubLSymbol $sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE;
  private static final SubLSymbol $sym82$IGNORE;
  private static final SubLSymbol $sym83$DO_PRIORITY_QUEUE_ELEMENTS;
  private static final SubLSymbol $sym84$LAZY_PRIORITY_QUEUE;
  private static final SubLSymbol $sym85$LAZY_PRIORITY_QUEUE_P;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$PRINT_LAZY_P_QUEUE;
  private static final SubLSymbol $sym91$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$LAZY_P_QUEUE_ORDERED_ITEMS;
  private static final SubLSymbol $sym94$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS;
  private static final SubLSymbol $sym95$LAZY_P_QUEUE_NEW_ITEMS;
  private static final SubLSymbol $sym96$_CSETF_LAZY_P_QUEUE_NEW_ITEMS;
  private static final SubLSymbol $kw97$ORDERED_ITEMS;
  private static final SubLSymbol $kw98$NEW_ITEMS;
  private static final SubLSymbol $sym99$MAKE_LAZY_PRIORITY_QUEUE;
  private static final SubLSymbol $sym100$VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD;
  private static final SubLString $str101$___S_new_;
  private static final SubLSymbol $sym102$_;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$LAZY_PRIORITY_QUEUE_ELEMENTS;
  private static final SubLSymbol $sym105$LOCKED_QUEUE;
  private static final SubLSymbol $sym106$LOCKED_QUEUE_P;
  private static final SubLList $list107;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym112$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$LOCKED_QUEUE_LOCK;
  private static final SubLSymbol $sym115$_CSETF_LOCKED_QUEUE_LOCK;
  private static final SubLSymbol $sym116$LOCKED_QUEUE_QUEUE;
  private static final SubLSymbol $sym117$_CSETF_LOCKED_QUEUE_QUEUE;
  private static final SubLSymbol $kw118$LOCK;
  private static final SubLSymbol $kw119$QUEUE;
  private static final SubLSymbol $sym120$MAKE_LOCKED_QUEUE;
  private static final SubLSymbol $sym121$VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD;
  private static final SubLString $str122$Queue_Lock;
  private static final SubLSymbol $sym123$LOCKED_P_QUEUE;
  private static final SubLSymbol $sym124$LOCKED_P_QUEUE_P;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$PRINT_LP_QUEUE;
  private static final SubLSymbol $sym130$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$LP_QUEUE_LOCK;
  private static final SubLSymbol $sym133$_CSETF_LP_QUEUE_LOCK;
  private static final SubLSymbol $sym134$LP_QUEUE_PRIORITY_QUEUE;
  private static final SubLSymbol $sym135$_CSETF_LP_QUEUE_PRIORITY_QUEUE;
  private static final SubLSymbol $kw136$PRIORITY_QUEUE;
  private static final SubLSymbol $sym137$MAKE_LOCKED_P_QUEUE;
  private static final SubLSymbol $sym138$VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD;
  private static final SubLString $str139$_tree_;
  private static final SubLString $str140$Queues_Module_Supercategory;
  private static final SubLString $str141$Priority_Queue_Subcategory;
  private static final SubLString $str142$Priority_Queue_Testing_Suite;
  private static final SubLString $str143$Locked_Priority_Queue_Subcategory;
  private static final SubLString $str144$Locked_Priority_Queue_Testing_Sui;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_queue( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject q_num(final SubLObject v_object)
  {
    assert NIL != queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject q_elements(final SubLObject v_object)
  {
    assert NIL != queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject q_last(final SubLObject v_object)
  {
    assert NIL != queue_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject _csetf_q_num(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject _csetf_q_elements(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject _csetf_q_last(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != queue_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject make_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$NUM ) )
      {
        _csetf_q_num( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$ELEMENTS ) )
      {
        _csetf_q_elements( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$LAST ) )
      {
        _csetf_q_last( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject visit_defstruct_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_QUEUE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$NUM, q_num( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$ELEMENTS, q_elements( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$LAST, q_last( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_QUEUE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 948L)
  public static SubLObject visit_defstruct_object_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1060L)
  public static SubLObject print_queue(final SubLObject queue, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( queue, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, queue, T, T );
      streams_high.write_string( $str24$size_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( queue_size( queue ), stream );
      print_macros.print_unreadable_object_postamble( stream, queue, T, T );
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1277L)
  public static SubLObject create_queue(SubLObject initial_elements)
  {
    if( initial_elements == UNPROVIDED )
    {
      initial_elements = NIL;
    }
    final SubLObject queue = clear_queue( make_queue( UNPROVIDED ) );
    if( NIL != initial_elements )
    {
      enqueue_all( initial_elements, queue );
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1546L)
  public static SubLObject clear_queue(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    _csetf_q_num( queue, ZERO_INTEGER );
    _csetf_q_elements( queue, NIL );
    _csetf_q_last( queue, NIL );
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1744L)
  public static SubLObject queue_empty_p(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    return Types.sublisp_null( q_elements( queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1879L)
  public static SubLObject queue_not_empty_p(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    return list_utilities.sublisp_boolean( q_elements( queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2025L)
  public static SubLObject queue_size(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    return q_num( queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2156L)
  public static SubLObject queue_elements(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    return conses_high.copy_list( q_elements( queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2308L)
  public static SubLObject enqueue(final SubLObject item, final SubLObject queue)
  {
    final SubLObject new_cell = ConsesLow.list( item );
    if( NIL != queue_empty_p( queue ) )
    {
      _csetf_q_elements( queue, new_cell );
    }
    else
    {
      ConsesLow.rplacd( q_last( queue ), new_cell );
    }
    _csetf_q_num( queue, Numbers.add( q_num( queue ), ONE_INTEGER ) );
    _csetf_q_last( queue, new_cell );
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2636L)
  public static SubLObject enqueue_all(final SubLObject items, final SubLObject queue)
  {
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      enqueue( item, queue );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2875L)
  public static SubLObject dequeue(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    if( NIL == queue_empty_p( queue ) )
    {
      final SubLObject elements = q_elements( queue );
      final SubLObject item = elements.first();
      final SubLObject rest = elements.rest();
      _csetf_q_num( queue, Numbers.subtract( q_num( queue ), ONE_INTEGER ) );
      _csetf_q_elements( queue, rest );
      if( NIL == rest )
      {
        _csetf_q_last( queue, NIL );
      }
      return item;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3252L)
  public static SubLObject dequeue_all(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    final SubLObject elements = q_elements( queue );
    clear_queue( queue );
    return elements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3487L)
  public static SubLObject requeue(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    final SubLObject item = dequeue( queue );
    enqueue( item, queue );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3777L)
  public static SubLObject remqueue(final SubLObject item, final SubLObject queue, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != queue_p( queue ) : queue;
    final SubLObject last = q_last( queue );
    SubLObject back = NIL;
    SubLObject next;
    for( next = NIL, next = q_elements( queue ); NIL != next; next = next.rest() )
    {
      if( NIL != Functions.funcall( test, next.first(), item ) )
      {
        _csetf_q_num( queue, Numbers.subtract( q_num( queue ), ONE_INTEGER ) );
        if( next.eql( last ) )
        {
          _csetf_q_last( queue, back );
        }
        if( next.eql( q_elements( queue ) ) )
        {
          _csetf_q_elements( queue, next.rest() );
        }
        else
        {
          ConsesLow.rplacd( back, next.rest() );
        }
      }
      else
      {
        back = next;
      }
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4336L)
  public static SubLObject remlast_queue(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    if( NIL != queue_empty_p( queue ) )
    {
      return queue;
    }
    if( queue_size( queue ).numE( ONE_INTEGER ) )
    {
      return clear_queue( queue );
    }
    SubLObject back = NIL;
    SubLObject last;
    SubLObject next;
    for( last = q_last( queue ), next = NIL, next = q_elements( queue ); !next.eql( last ); next = next.rest() )
    {
      back = next;
    }
    _csetf_q_num( queue, Numbers.subtract( q_num( queue ), ONE_INTEGER ) );
    _csetf_q_last( queue, back );
    ConsesLow.rplacd( back, next.rest() );
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4840L)
  public static SubLObject queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != queue_p( queue ) : queue;
    return Sequences.find( item, q_elements( queue ), test, key, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5048L)
  public static SubLObject queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != queue_p( queue ) : queue;
    return Sequences.find_if( test, q_elements( queue ), key, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5244L)
  public static SubLObject queue_peek(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    return q_elements( queue ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5407L)
  public static SubLObject queue_peek_n(final SubLObject queue, final SubLObject n)
  {
    assert NIL != queue_p( queue ) : queue;
    return list_utilities.first_n( n, q_elements( queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5583L)
  public static SubLObject new_queue_iterator(final SubLObject queue)
  {
    assert NIL != queue_p( queue ) : queue;
    return iteration.new_list_iterator( q_elements( queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5755L)
  public static SubLObject do_queue_elements(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item_var = NIL;
    SubLObject queue = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    item_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    queue = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      if( NIL == conses_high.member( current_$1, $list26, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw27$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw28$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym29$DO_LIST, ConsesLow.list( item_var, ConsesLow.list( $sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, queue ), $kw28$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6044L)
  public static SubLObject do_queue_elements_queue_elements(final SubLObject queue)
  {
    return q_elements( queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6164L)
  public static SubLObject do_queue_dequeue(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item_var = NIL;
    SubLObject queue = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    item_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    queue = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      if( NIL == conses_high.member( current_$2, $list26, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw27$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw28$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject q = $sym32$Q;
    final SubLObject done_var = $sym33$DONE_VAR;
    return ConsesLow.list( $sym34$CLET, ConsesLow.list( ConsesLow.list( q, queue ), ConsesLow.list( done_var, reader.bq_cons( $sym35$COR, ConsesLow.append( ( NIL != done ) ? ConsesLow.list( done ) : NIL, ConsesLow.list(
        ConsesLow.list( $sym36$QUEUE_EMPTY_P, q ) ) ) ) ) ), ConsesLow.list( $sym37$WHILE, ConsesLow.list( $sym38$CNOT, done_var ), ConsesLow.listS( $sym34$CLET, ConsesLow.list( ConsesLow.list( item_var, ConsesLow.list(
            $sym39$DEQUEUE, q ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym40$CSETQ, done_var, reader.bq_cons( $sym35$COR, ConsesLow.append( ( NIL != done ) ? ConsesLow.list( done ) : NIL, ConsesLow
                .list( ConsesLow.list( $sym36$QUEUE_EMPTY_P, q ) ) ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6532L)
  public static SubLObject queue_copy(final SubLObject queue)
  {
    final SubLObject copy = create_queue( UNPROVIDED );
    SubLObject cdolist_list_var = do_queue_elements_queue_elements( queue );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      enqueue( item, copy );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return copy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6679L)
  public static SubLObject print_queue_contents(final SubLObject queue, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    PrintLow.format( stream, $str41$__Queue_length____a, queue_size( queue ) );
    PrintLow.format( stream, $str42$__Queue_contents__ );
    SubLObject cdolist_list_var = q_elements( queue );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str43$___s, item );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7036L)
  public static SubLObject cfasl_output_object_queue_method(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_wide_output_queue( v_object, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7156L)
  public static SubLObject cfasl_wide_output_queue(final SubLObject queue, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_queue$.getGlobalValue(), stream );
    cfasl_output_queue_internal( queue, stream );
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7335L)
  public static SubLObject cfasl_output_queue_internal(final SubLObject queue, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject size = queue_size( queue );
    SubLObject counter = ZERO_INTEGER;
    cfasl.cfasl_output( size, stream );
    SubLObject cdolist_list_var = do_queue_elements_queue_elements( queue );
    SubLObject curr = NIL;
    curr = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cfasl.cfasl_output( curr, stream );
      counter = Numbers.add( counter, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      curr = cdolist_list_var.first();
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !counter.numE( size ) )
    {
      Errors.error( $str47$We_promised_to_write__A_elements_, size, counter );
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7686L)
  public static SubLObject cfasl_input_queue(final SubLObject stream)
  {
    final SubLObject size = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject queue = create_queue( UNPROVIDED );
    SubLObject i;
    SubLObject item;
    for( i = NIL, i = ZERO_INTEGER; i.numL( size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      item = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      enqueue( item, queue );
    }
    return queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_p_queue( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject priority_queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $priority_queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject p_queue_num(final SubLObject v_object)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject p_queue_max_size(final SubLObject v_object)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject p_queue_rank_func(final SubLObject v_object)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject p_queue_comp_func(final SubLObject v_object)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject p_queue_tree(final SubLObject v_object)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject _csetf_p_queue_num(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject _csetf_p_queue_max_size(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject _csetf_p_queue_rank_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject _csetf_p_queue_comp_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject _csetf_p_queue_tree(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != priority_queue_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject make_priority_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $priority_queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$NUM ) )
      {
        _csetf_p_queue_num( v_new, current_value );
      }
      else if( pcase_var.eql( $kw67$MAX_SIZE ) )
      {
        _csetf_p_queue_max_size( v_new, current_value );
      }
      else if( pcase_var.eql( $kw68$RANK_FUNC ) )
      {
        _csetf_p_queue_rank_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw69$COMP_FUNC ) )
      {
        _csetf_p_queue_comp_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw70$TREE ) )
      {
        _csetf_p_queue_tree( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject visit_defstruct_priority_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym71$MAKE_PRIORITY_QUEUE, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$NUM, p_queue_num( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw67$MAX_SIZE, p_queue_max_size( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw68$RANK_FUNC, p_queue_rank_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw69$COMP_FUNC, p_queue_comp_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw70$TREE, p_queue_tree( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym71$MAKE_PRIORITY_QUEUE, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8165L)
  public static SubLObject visit_defstruct_object_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_priority_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8318L)
  public static SubLObject print_p_queue(final SubLObject p_queue, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( p_queue, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, p_queue, T, T );
      streams_high.write_string( $str24$size_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( p_queue_size( p_queue ), stream );
      print_macros.print_unreadable_object_postamble( stream, p_queue, T, T );
    }
    return p_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8547L)
  public static SubLObject create_p_queue(final SubLObject max_size, SubLObject rank_func, SubLObject comp_func)
  {
    if( comp_func == UNPROVIDED )
    {
      comp_func = Symbols.symbol_function( $sym73$_ );
    }
    if( rank_func.isSymbol() )
    {
      rank_func = Symbols.symbol_function( rank_func );
    }
    if( comp_func.isSymbol() )
    {
      comp_func = Symbols.symbol_function( comp_func );
    }
    final SubLObject pq = make_priority_queue( UNPROVIDED );
    _csetf_p_queue_num( pq, ZERO_INTEGER );
    _csetf_p_queue_max_size( pq, max_size );
    _csetf_p_queue_rank_func( pq, rank_func );
    _csetf_p_queue_comp_func( pq, comp_func );
    _csetf_p_queue_tree( pq, NIL );
    return pq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9079L)
  public static SubLObject p_queue_clear(final SubLObject priority_queue)
  {
    _csetf_p_queue_num( priority_queue, ZERO_INTEGER );
    _csetf_p_queue_tree( priority_queue, NIL );
    return priority_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9235L)
  public static SubLObject p_queue_size(final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    return p_queue_num( priority_queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9419L)
  public static SubLObject p_queue_empty_p(final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    return Numbers.numE( p_queue_size( priority_queue ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9602L)
  public static SubLObject p_queue_full_p(final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    return makeBoolean( p_queue_max_size( priority_queue ).isFixnum() && p_queue_size( priority_queue ).numE( p_queue_max_size( priority_queue ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9874L)
  public static SubLObject p_queue_best(final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    final SubLObject best = binary_tree.btree_find_best( p_queue_tree( priority_queue ) );
    if( NIL != binary_tree.btree_p( best ) )
    {
      return pq_collision_next( binary_tree.bt_state( best ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10109L)
  public static SubLObject p_queue_worst(final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    final SubLObject worst = binary_tree.btree_find_worst( p_queue_tree( priority_queue ) );
    if( NIL != binary_tree.btree_p( worst ) )
    {
      return pq_collision_last( binary_tree.bt_state( worst ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10349L)
  public static SubLObject p_enqueue(final SubLObject item, final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    final SubLObject bumpedP = p_queue_full_p( priority_queue );
    if( NIL == bumpedP )
    {
      final SubLObject ans = binary_tree.btree_insert( item, Functions.funcall( p_queue_rank_func( priority_queue ), item ), p_queue_tree( priority_queue ), p_queue_comp_func( priority_queue ), Symbols.symbol_function(
          $sym74$PQ_COLLISION_ENTER ) );
      if( !ans.eql( p_queue_tree( priority_queue ) ) )
      {
        _csetf_p_queue_tree( priority_queue, ans );
      }
      _csetf_p_queue_num( priority_queue, Numbers.add( p_queue_num( priority_queue ), ONE_INTEGER ) );
      return Values.values( priority_queue, bumpedP, NIL );
    }
    final SubLObject worst = p_queue_worst( priority_queue );
    if( NIL != Functions.funcall( p_queue_comp_func( priority_queue ), Functions.funcall( p_queue_rank_func( priority_queue ), item ), Functions.funcall( p_queue_rank_func( priority_queue ), worst ) ) )
    {
      final SubLObject bumped_item = p_dequeue( priority_queue, T );
      p_enqueue( item, priority_queue );
      return Values.values( priority_queue, bumpedP, bumped_item );
    }
    return Values.values( priority_queue, bumpedP, item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11348L)
  public static SubLObject p_dequeue(final SubLObject priority_queue, SubLObject worstP)
  {
    if( worstP == UNPROVIDED )
    {
      worstP = NIL;
    }
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    if( NIL == p_queue_empty_p( priority_queue ) )
    {
      final SubLObject remove = ( NIL != worstP ) ? p_queue_worst( priority_queue ) : p_queue_best( priority_queue );
      final SubLObject ans = binary_tree.btree_remove( remove, Functions.funcall( p_queue_rank_func( priority_queue ), remove ), p_queue_tree( priority_queue ), p_queue_comp_func( priority_queue ), Symbols
          .symbol_function( $sym75$PQ_COLLISION_REMOVE ), Symbols.symbol_function( $sym76$PQ_COLLISION_EMPTY ) );
      if( !ans.eql( p_queue_tree( priority_queue ) ) )
      {
        _csetf_p_queue_tree( priority_queue, ans );
      }
      _csetf_p_queue_num( priority_queue, Numbers.subtract( p_queue_num( priority_queue ), ONE_INTEGER ) );
      return remove;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12037L)
  public static SubLObject do_priority_queue_elements(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item_var = NIL;
    SubLObject priority_queue = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    item_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    priority_queue = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      if( NIL == conses_high.member( current_$3, $list26, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw27$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw28$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject key_var = $sym78$KEY_VAR;
    final SubLObject collisions_var = $sym79$COLLISIONS_VAR;
    return ConsesLow.list( $sym80$DO_BTREE_INDEX, ConsesLow.list( key_var, collisions_var, ConsesLow.list( $sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE, priority_queue ), $kw28$DONE, done ), ConsesLow.list( $sym82$IGNORE,
        key_var ), ConsesLow.listS( $sym29$DO_LIST, ConsesLow.list( item_var, collisions_var, $kw28$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12437L)
  public static SubLObject do_priority_queue_elements_btree(final SubLObject priority_queue)
  {
    assert NIL != priority_queue_p( priority_queue ) : priority_queue;
    return p_queue_tree( priority_queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12633L)
  public static SubLObject p_queue_elements(final SubLObject priority_queue)
  {
    SubLObject items = NIL;
    SubLObject stack = NIL;
    SubLObject subtree = do_priority_queue_elements_btree( priority_queue );
    while ( NIL != subtree)
    {
      final SubLObject key_var = binary_tree.do_btree_index_key( subtree );
      SubLObject cdolist_list_var;
      final SubLObject collisions_var = cdolist_list_var = binary_tree.do_btree_index_value( subtree );
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        items = ConsesLow.cons( item, items );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      final SubLObject lower = binary_tree.do_btree_lower( subtree );
      final SubLObject higher = binary_tree.do_btree_higher( subtree );
      if( NIL != lower )
      {
        if( NIL != higher )
        {
          stack = ConsesLow.cons( higher, stack );
        }
        subtree = lower;
      }
      else if( NIL != higher )
      {
        subtree = higher;
      }
      else
      {
        subtree = stack.first();
        stack = stack.rest();
      }
    }
    stack = NIL;
    final SubLObject comp_func = p_queue_comp_func( priority_queue );
    final SubLObject rank_func = p_queue_rank_func( priority_queue );
    items = Sort.sort( items, comp_func, rank_func );
    return items;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13102L)
  public static SubLObject p_queue_find(final SubLObject item, final SubLObject queue, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != priority_queue_p( queue ) : queue;
    SubLObject found = NIL;
    SubLObject stack = NIL;
    SubLObject subtree = do_priority_queue_elements_btree( queue );
    while ( NIL == found && NIL != subtree)
    {
      final SubLObject key_var = binary_tree.do_btree_index_key( subtree );
      final SubLObject collisions_var = binary_tree.do_btree_index_value( subtree );
      SubLObject rest;
      SubLObject this_item;
      for( rest = NIL, rest = collisions_var; NIL == found && NIL != rest; rest = rest.rest() )
      {
        this_item = rest.first();
        if( NIL != Functions.funcall( test, item, Functions.funcall( key, this_item ) ) )
        {
          found = this_item;
        }
      }
      final SubLObject lower = binary_tree.do_btree_lower( subtree );
      final SubLObject higher = binary_tree.do_btree_higher( subtree );
      if( NIL != lower )
      {
        if( NIL != higher )
        {
          stack = ConsesLow.cons( higher, stack );
        }
        subtree = lower;
      }
      else if( NIL != higher )
      {
        subtree = higher;
      }
      else
      {
        subtree = stack.first();
        stack = stack.rest();
      }
    }
    stack = NIL;
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13458L)
  public static SubLObject p_queue_find_if(final SubLObject test, final SubLObject queue, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != priority_queue_p( queue ) : queue;
    SubLObject found = NIL;
    SubLObject stack = NIL;
    SubLObject subtree = do_priority_queue_elements_btree( queue );
    while ( NIL == found && NIL != subtree)
    {
      final SubLObject key_var = binary_tree.do_btree_index_key( subtree );
      final SubLObject collisions_var = binary_tree.do_btree_index_value( subtree );
      SubLObject rest;
      SubLObject this_item;
      for( rest = NIL, rest = collisions_var; NIL == found && NIL != rest; rest = rest.rest() )
      {
        this_item = rest.first();
        if( NIL != Functions.funcall( test, Functions.funcall( key, this_item ) ) )
        {
          found = this_item;
        }
      }
      final SubLObject lower = binary_tree.do_btree_lower( subtree );
      final SubLObject higher = binary_tree.do_btree_higher( subtree );
      if( NIL != lower )
      {
        if( NIL != higher )
        {
          stack = ConsesLow.cons( higher, stack );
        }
        subtree = lower;
      }
      else if( NIL != higher )
      {
        subtree = higher;
      }
      else
      {
        subtree = stack.first();
        stack = stack.rest();
      }
    }
    stack = NIL;
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13815L)
  public static SubLObject pq_collision_enter(final SubLObject item, final SubLObject queue)
  {
    return list_utilities.nadd_to_end( item, queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14064L)
  public static SubLObject pq_collision_next(final SubLObject queue)
  {
    return queue.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14237L)
  public static SubLObject pq_collision_last(final SubLObject queue)
  {
    return list_utilities.last_one( queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14413L)
  public static SubLObject pq_collision_remove(final SubLObject item, final SubLObject queue)
  {
    return list_utilities.delete_first( item, queue, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14639L)
  public static SubLObject pq_collision_empty(final SubLObject queue)
  {
    return Types.sublisp_null( queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject lazy_priority_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_lazy_p_queue( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject lazy_priority_queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $lazy_priority_queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject lazy_p_queue_ordered_items(final SubLObject v_object)
  {
    assert NIL != lazy_priority_queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject lazy_p_queue_new_items(final SubLObject v_object)
  {
    assert NIL != lazy_priority_queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject _csetf_lazy_p_queue_ordered_items(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lazy_priority_queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject _csetf_lazy_p_queue_new_items(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != lazy_priority_queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject make_lazy_priority_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $lazy_priority_queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw97$ORDERED_ITEMS ) )
      {
        _csetf_lazy_p_queue_ordered_items( v_new, current_value );
      }
      else if( pcase_var.eql( $kw98$NEW_ITEMS ) )
      {
        _csetf_lazy_p_queue_new_items( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject visit_defstruct_lazy_priority_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym99$MAKE_LAZY_PRIORITY_QUEUE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw97$ORDERED_ITEMS, lazy_p_queue_ordered_items( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw98$NEW_ITEMS, lazy_p_queue_new_items( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym99$MAKE_LAZY_PRIORITY_QUEUE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15549L)
  public static SubLObject visit_defstruct_object_lazy_priority_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_lazy_priority_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15695L)
  public static SubLObject print_lazy_p_queue(final SubLObject lpq, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( lpq, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, lpq, T, T );
      streams_high.write_string( $str24$size_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( lazy_priority_queue_size( lpq ), stream );
      final SubLObject additions = queue_size( lazy_p_queue_new_items( lpq ) );
      if( !additions.isZero() )
      {
        PrintLow.format( stream, $str101$___S_new_, additions );
      }
      print_macros.print_unreadable_object_postamble( stream, lpq, T, T );
    }
    return lpq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16065L)
  public static SubLObject new_lazy_priority_queue(final SubLObject rank_func, SubLObject comp_func)
  {
    if( comp_func == UNPROVIDED )
    {
      comp_func = Symbols.symbol_function( $sym102$_ );
    }
    final SubLObject lpq = make_lazy_priority_queue( UNPROVIDED );
    _csetf_lazy_p_queue_ordered_items( lpq, create_p_queue( NIL, rank_func, comp_func ) );
    _csetf_lazy_p_queue_new_items( lpq, create_queue( UNPROVIDED ) );
    return lpq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16364L)
  public static SubLObject do_lazy_priority_queue_elements(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item_var = NIL;
    SubLObject lpq = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    item_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    lpq = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      if( NIL == conses_high.member( current_$4, $list26, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw27$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw28$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym29$DO_LIST, ConsesLow.list( item_var, ConsesLow.list( $sym104$LAZY_PRIORITY_QUEUE_ELEMENTS, lpq ), $kw28$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16586L)
  public static SubLObject lazy_priority_queue_size(final SubLObject lpq)
  {
    assert NIL != lazy_priority_queue_p( lpq ) : lpq;
    return Numbers.add( p_queue_size( lazy_p_queue_ordered_items( lpq ) ), queue_size( lazy_p_queue_new_items( lpq ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16800L)
  public static SubLObject lazy_priority_queue_empty_p(final SubLObject lpq)
  {
    return Numbers.zerop( lazy_priority_queue_size( lpq ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16940L)
  public static SubLObject lazy_priority_queue_peek(final SubLObject lpq)
  {
    assert NIL != lazy_priority_queue_p( lpq ) : lpq;
    ensure_lazy_priority_queue_ordered( lpq );
    return p_queue_best( lazy_p_queue_ordered_items( lpq ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17128L)
  public static SubLObject lazy_priority_queue_elements(final SubLObject lpq)
  {
    assert NIL != lazy_priority_queue_p( lpq ) : lpq;
    ensure_lazy_priority_queue_ordered( lpq );
    return p_queue_elements( lazy_p_queue_ordered_items( lpq ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17324L)
  public static SubLObject lazy_priority_queue_add(final SubLObject lpq, final SubLObject item)
  {
    assert NIL != lazy_priority_queue_p( lpq ) : lpq;
    enqueue( item, lazy_p_queue_new_items( lpq ) );
    return lpq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17489L)
  public static SubLObject lazy_priority_queue_remove(final SubLObject lpq)
  {
    assert NIL != lazy_priority_queue_p( lpq ) : lpq;
    ensure_lazy_priority_queue_ordered( lpq );
    return p_dequeue( lazy_p_queue_ordered_items( lpq ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17678L)
  public static SubLObject ensure_lazy_priority_queue_ordered(final SubLObject lpq)
  {
    final SubLObject ordered_items = lazy_p_queue_ordered_items( lpq );
    final SubLObject new_items = lazy_p_queue_new_items( lpq );
    while ( NIL == queue_empty_p( new_items ))
    {
      p_enqueue( dequeue( new_items ), ordered_items );
    }
    return lpq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject locked_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject locked_queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $locked_queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject locked_queue_lock(final SubLObject v_object)
  {
    assert NIL != locked_queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject locked_queue_queue(final SubLObject v_object)
  {
    assert NIL != locked_queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject _csetf_locked_queue_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != locked_queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject _csetf_locked_queue_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != locked_queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject make_locked_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $locked_queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw118$LOCK ) )
      {
        _csetf_locked_queue_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw119$QUEUE ) )
      {
        _csetf_locked_queue_queue( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject visit_defstruct_locked_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym120$MAKE_LOCKED_QUEUE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw118$LOCK, locked_queue_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw119$QUEUE, locked_queue_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym120$MAKE_LOCKED_QUEUE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18017L)
  public static SubLObject visit_defstruct_object_locked_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_locked_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18122L)
  public static SubLObject create_locked_queue()
  {
    final SubLObject lq = make_locked_queue( UNPROVIDED );
    _csetf_locked_queue_queue( lq, create_queue( UNPROVIDED ) );
    _csetf_locked_queue_lock( lq, Locks.make_lock( $str122$Queue_Lock ) );
    return lq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18323L)
  public static SubLObject clear_locked_queue(final SubLObject lq)
  {
    SubLObject ans = NIL;
    if( NIL != locked_queue_p( lq ) )
    {
      final SubLObject lock = locked_queue_lock( lq );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = clear_queue( locked_queue_queue( lq ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18588L)
  public static SubLObject locked_queue_empty_p(final SubLObject lq)
  {
    SubLObject ans = NIL;
    if( NIL != locked_queue_p( lq ) )
    {
      final SubLObject lock = locked_queue_lock( lq );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = queue_empty_p( locked_queue_queue( lq ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18859L)
  public static SubLObject locked_queue_size(final SubLObject lq)
  {
    SubLObject ans = NIL;
    if( NIL != locked_queue_p( lq ) )
    {
      final SubLObject lock = locked_queue_lock( lq );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = queue_size( locked_queue_queue( lq ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19150L)
  public static SubLObject locked_queue_elements(final SubLObject lq)
  {
    SubLObject ans = NIL;
    if( NIL != locked_queue_p( lq ) )
    {
      final SubLObject lock = locked_queue_lock( lq );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = queue_elements( locked_queue_queue( lq ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19442L)
  public static SubLObject locked_enqueue(final SubLObject item, final SubLObject lq)
  {
    SubLObject ans = NIL;
    if( NIL != locked_queue_p( lq ) )
    {
      final SubLObject lock = locked_queue_lock( lq );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = enqueue( item, locked_queue_queue( lq ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19714L)
  public static SubLObject locked_dequeue(final SubLObject lq)
  {
    SubLObject ans = NIL;
    if( NIL != locked_queue_p( lq ) )
    {
      final SubLObject lock = locked_queue_lock( lq );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = dequeue( locked_queue_queue( lq ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject locked_p_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_lp_queue( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject locked_p_queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $locked_p_queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject lp_queue_lock(final SubLObject v_object)
  {
    assert NIL != locked_p_queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject lp_queue_priority_queue(final SubLObject v_object)
  {
    assert NIL != locked_p_queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject _csetf_lp_queue_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != locked_p_queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject _csetf_lp_queue_priority_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != locked_p_queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject make_locked_p_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $locked_p_queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw118$LOCK ) )
      {
        _csetf_lp_queue_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw136$PRIORITY_QUEUE ) )
      {
        _csetf_lp_queue_priority_queue( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject visit_defstruct_locked_p_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym137$MAKE_LOCKED_P_QUEUE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw118$LOCK, lp_queue_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw136$PRIORITY_QUEUE, lp_queue_priority_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym137$MAKE_LOCKED_P_QUEUE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19978L)
  public static SubLObject visit_defstruct_object_locked_p_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_locked_p_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20177L)
  public static SubLObject print_lp_queue(final SubLObject lp_queue, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( lp_queue, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, lp_queue, T, T );
      streams_high.write_string( $str24$size_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( lp_queue_size( lp_queue ), stream );
      streams_high.write_string( $str139$_tree_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( p_queue_tree( lp_queue_priority_queue( lp_queue ) ), stream );
      print_macros.print_unreadable_object_postamble( stream, lp_queue, T, T );
    }
    return lp_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20569L)
  public static SubLObject create_lp_queue(final SubLObject max_size, final SubLObject rank_func, SubLObject comp_func)
  {
    if( comp_func == UNPROVIDED )
    {
      comp_func = Symbols.symbol_function( $sym73$_ );
    }
    final SubLObject lp_queue = make_locked_p_queue( UNPROVIDED );
    _csetf_lp_queue_priority_queue( lp_queue, create_p_queue( max_size, rank_func, comp_func ) );
    _csetf_lp_queue_lock( lp_queue, Locks.make_lock( $str122$Queue_Lock ) );
    return lp_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20927L)
  public static SubLObject lp_queue_size(final SubLObject lp_queue)
  {
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = p_queue_size( lp_queue_priority_queue( lp_queue ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21249L)
  public static SubLObject lp_queue_empty_p(final SubLObject lp_queue)
  {
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = p_queue_empty_p( lp_queue_priority_queue( lp_queue ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21558L)
  public static SubLObject lp_queue_full_p(final SubLObject lp_queue)
  {
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = p_queue_full_p( lp_queue_priority_queue( lp_queue ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21870L)
  public static SubLObject lp_queue_best(final SubLObject lp_queue)
  {
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = p_queue_best( lp_queue_priority_queue( lp_queue ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22195L)
  public static SubLObject lp_queue_worst(final SubLObject lp_queue)
  {
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = p_queue_worst( lp_queue_priority_queue( lp_queue ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22523L)
  public static SubLObject lp_enqueue(final SubLObject item, final SubLObject lp_queue)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        thread.resetMultipleValues();
        final SubLObject queue = p_enqueue( item, lp_queue_priority_queue( lp_queue ) );
        final SubLObject bumpedP = thread.secondMultipleValue();
        final SubLObject bumped_item = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        ans = ConsesLow.list( lp_queue, bumpedP, bumped_item );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return subl_promotions.values_list( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23073L)
  public static SubLObject lp_dequeue(final SubLObject lp_queue, SubLObject worstP)
  {
    if( worstP == UNPROVIDED )
    {
      worstP = NIL;
    }
    SubLObject ans = NIL;
    if( NIL != locked_p_queue_p( lp_queue ) )
    {
      final SubLObject lock = lp_queue_lock( lp_queue );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ans = p_dequeue( lp_queue_priority_queue( lp_queue ), worstP );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return ans;
  }

  public static SubLObject declare_queues_file()
  {
    SubLFiles.declareFunction( me, "queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_p", "QUEUE-P", 1, 0, false );
    new $queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "q_num", "Q-NUM", 1, 0, false );
    SubLFiles.declareFunction( me, "q_elements", "Q-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "q_last", "Q-LAST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_queue", "MAKE-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_queue", "VISIT-DEFSTRUCT-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_queue_method", "VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_queue", "PRINT-QUEUE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_queue", "CREATE-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_queue", "CLEAR-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_not_empty_p", "QUEUE-NOT-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_size", "QUEUE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_elements", "QUEUE-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "enqueue", "ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "enqueue_all", "ENQUEUE-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "dequeue", "DEQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "dequeue_all", "DEQUEUE-ALL", 1, 0, false );
    SubLFiles.declareFunction( me, "requeue", "REQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "remqueue", "REMQUEUE", 2, 1, false );
    SubLFiles.declareFunction( me, "remlast_queue", "REMLAST-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_find", "QUEUE-FIND", 2, 2, false );
    SubLFiles.declareFunction( me, "queue_find_if", "QUEUE-FIND-IF", 2, 1, false );
    SubLFiles.declareFunction( me, "queue_peek", "QUEUE-PEEK", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_peek_n", "QUEUE-PEEK-N", 2, 0, false );
    SubLFiles.declareFunction( me, "new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_queue_elements", "DO-QUEUE-ELEMENTS" );
    SubLFiles.declareFunction( me, "do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_queue_dequeue", "DO-QUEUE-DEQUEUE" );
    SubLFiles.declareFunction( me, "queue_copy", "QUEUE-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false );
    new $priority_queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "p_queue_num", "P-QUEUE-NUM", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_tree", "P-QUEUE-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_priority_queue", "VISIT-DEFSTRUCT-PRIORITY-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_p_queue", "PRINT-P-QUEUE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_p_queue", "CREATE-P-QUEUE", 2, 1, false );
    SubLFiles.declareFunction( me, "p_queue_clear", "P-QUEUE-CLEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_size", "P-QUEUE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_best", "P-QUEUE-BEST", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_worst", "P-QUEUE-WORST", 1, 0, false );
    SubLFiles.declareFunction( me, "p_enqueue", "P-ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "p_dequeue", "P-DEQUEUE", 1, 1, false );
    SubLFiles.declareMacro( me, "do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS" );
    SubLFiles.declareFunction( me, "do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "p_queue_find", "P-QUEUE-FIND", 2, 2, false );
    SubLFiles.declareFunction( me, "p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false );
    SubLFiles.declareFunction( me, "pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false );
    new $pq_collision_enter$BinaryFunction();
    SubLFiles.declareFunction( me, "pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false );
    SubLFiles.declareFunction( me, "pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false );
    new $pq_collision_remove$BinaryFunction();
    SubLFiles.declareFunction( me, "pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false );
    new $pq_collision_empty$UnaryFunction();
    SubLFiles.declareFunction( me, "lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false );
    new $lazy_priority_queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_lazy_priority_queue", "VISIT-DEFSTRUCT-LAZY-PRIORITY-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_lazy_priority_queue_method", "VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false );
    SubLFiles.declareMacro( me, "do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS" );
    SubLFiles.declareFunction( me, "lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false );
    new $locked_queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_locked_queue", "VISIT-DEFSTRUCT-LOCKED-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_locked_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false );
    new $locked_p_queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_locked_p_queue", "VISIT-DEFSTRUCT-LOCKED-P-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_locked_p_queue_method", "VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false );
    SubLFiles.declareFunction( me, "lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lp_queue_best", "LP-QUEUE-BEST", 1, 0, false );
    SubLFiles.declareFunction( me, "lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false );
    SubLFiles.declareFunction( me, "lp_enqueue", "LP-ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "lp_dequeue", "LP-DEQUEUE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_queues_file()
  {
    $dtp_queue$ = SubLFiles.defconstant( "*DTP-QUEUE*", $sym0$QUEUE );
    $cfasl_wide_opcode_queue$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-QUEUE*", $int44$131 );
    $dtp_priority_queue$ = SubLFiles.defconstant( "*DTP-PRIORITY-QUEUE*", $sym48$PRIORITY_QUEUE );
    $dtp_lazy_priority_queue$ = SubLFiles.defconstant( "*DTP-LAZY-PRIORITY-QUEUE*", $sym84$LAZY_PRIORITY_QUEUE );
    $dtp_locked_queue$ = SubLFiles.defconstant( "*DTP-LOCKED-QUEUE*", $sym105$LOCKED_QUEUE );
    $dtp_locked_p_queue$ = SubLFiles.defconstant( "*DTP-LOCKED-P-QUEUE*", $sym123$LOCKED_P_QUEUE );
    return NIL;
  }

  public static SubLObject setup_queues_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), Symbols.symbol_function( $sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$Q_NUM, $sym10$_CSETF_Q_NUM );
    Structures.def_csetf( $sym11$Q_ELEMENTS, $sym12$_CSETF_Q_ELEMENTS );
    Structures.def_csetf( $sym13$Q_LAST, $sym14$_CSETF_Q_LAST );
    Equality.identity( $sym0$QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), Symbols.symbol_function( $sym23$VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD ) );
    access_macros.register_macro_helper( $sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, $sym31$DO_QUEUE_ELEMENTS );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_queue$.getGlobalValue(), $sym45$CFASL_INPUT_QUEUE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), Symbols.symbol_function( $sym46$CFASL_OUTPUT_OBJECT_QUEUE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), Symbols.symbol_function( $sym55$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list56 );
    Structures.def_csetf( $sym57$P_QUEUE_NUM, $sym58$_CSETF_P_QUEUE_NUM );
    Structures.def_csetf( $sym59$P_QUEUE_MAX_SIZE, $sym60$_CSETF_P_QUEUE_MAX_SIZE );
    Structures.def_csetf( $sym61$P_QUEUE_RANK_FUNC, $sym62$_CSETF_P_QUEUE_RANK_FUNC );
    Structures.def_csetf( $sym63$P_QUEUE_COMP_FUNC, $sym64$_CSETF_P_QUEUE_COMP_FUNC );
    Structures.def_csetf( $sym65$P_QUEUE_TREE, $sym66$_CSETF_P_QUEUE_TREE );
    Equality.identity( $sym48$PRIORITY_QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), Symbols.symbol_function( $sym72$VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD ) );
    access_macros.register_macro_helper( $sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE, $sym83$DO_PRIORITY_QUEUE_ELEMENTS );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), Symbols.symbol_function( $sym91$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list92 );
    Structures.def_csetf( $sym93$LAZY_P_QUEUE_ORDERED_ITEMS, $sym94$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS );
    Structures.def_csetf( $sym95$LAZY_P_QUEUE_NEW_ITEMS, $sym96$_CSETF_LAZY_P_QUEUE_NEW_ITEMS );
    Equality.identity( $sym84$LAZY_PRIORITY_QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), Symbols.symbol_function(
        $sym100$VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), Symbols.symbol_function( $sym112$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list113 );
    Structures.def_csetf( $sym114$LOCKED_QUEUE_LOCK, $sym115$_CSETF_LOCKED_QUEUE_LOCK );
    Structures.def_csetf( $sym116$LOCKED_QUEUE_QUEUE, $sym117$_CSETF_LOCKED_QUEUE_QUEUE );
    Equality.identity( $sym105$LOCKED_QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), Symbols.symbol_function( $sym121$VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), Symbols.symbol_function( $sym130$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list131 );
    Structures.def_csetf( $sym132$LP_QUEUE_LOCK, $sym133$_CSETF_LP_QUEUE_LOCK );
    Structures.def_csetf( $sym134$LP_QUEUE_PRIORITY_QUEUE, $sym135$_CSETF_LP_QUEUE_PRIORITY_QUEUE );
    Equality.identity( $sym123$LOCKED_P_QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), Symbols.symbol_function( $sym138$VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD ) );
    sunit_external.define_test_category( $str140$Queues_Module_Supercategory, UNPROVIDED );
    sunit_external.define_test_category( $str141$Priority_Queue_Subcategory, ConsesLow.list( $str140$Queues_Module_Supercategory ) );
    sunit_external.define_test_suite( $str142$Priority_Queue_Testing_Suite, ConsesLow.list( $str141$Priority_Queue_Subcategory ), UNPROVIDED, UNPROVIDED );
    sunit_external.define_test_category( $str143$Locked_Priority_Queue_Subcategory, ConsesLow.list( $str140$Queues_Module_Supercategory ) );
    sunit_external.define_test_suite( $str144$Locked_Priority_Queue_Testing_Sui, ConsesLow.list( $str143$Locked_Priority_Queue_Subcategory ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_queues_file();
  }

  @Override
  public void initializeVariables()
  {
    init_queues_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_queues_file();
  }
  static
  {
    me = new queues();
    $dtp_queue$ = null;
    $cfasl_wide_opcode_queue$ = null;
    $dtp_priority_queue$ = null;
    $dtp_lazy_priority_queue$ = null;
    $dtp_locked_queue$ = null;
    $dtp_locked_p_queue$ = null;
    $sym0$QUEUE = makeSymbol( "QUEUE" );
    $sym1$QUEUE_P = makeSymbol( "QUEUE-P" );
    $list2 = ConsesLow.list( makeSymbol( "NUM" ), makeSymbol( "ELEMENTS" ), makeSymbol( "LAST" ) );
    $list3 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "ELEMENTS" ), makeKeyword( "LAST" ) );
    $list4 = ConsesLow.list( makeSymbol( "Q-NUM" ), makeSymbol( "Q-ELEMENTS" ), makeSymbol( "Q-LAST" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-Q-NUM" ), makeSymbol( "_CSETF-Q-ELEMENTS" ), makeSymbol( "_CSETF-Q-LAST" ) );
    $sym6$PRINT_QUEUE = makeSymbol( "PRINT-QUEUE" );
    $sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "QUEUE-P" ) );
    $sym9$Q_NUM = makeSymbol( "Q-NUM" );
    $sym10$_CSETF_Q_NUM = makeSymbol( "_CSETF-Q-NUM" );
    $sym11$Q_ELEMENTS = makeSymbol( "Q-ELEMENTS" );
    $sym12$_CSETF_Q_ELEMENTS = makeSymbol( "_CSETF-Q-ELEMENTS" );
    $sym13$Q_LAST = makeSymbol( "Q-LAST" );
    $sym14$_CSETF_Q_LAST = makeSymbol( "_CSETF-Q-LAST" );
    $kw15$NUM = makeKeyword( "NUM" );
    $kw16$ELEMENTS = makeKeyword( "ELEMENTS" );
    $kw17$LAST = makeKeyword( "LAST" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_QUEUE = makeSymbol( "MAKE-QUEUE" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-QUEUE-METHOD" );
    $str24$size_ = makeString( "size=" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM-VAR" ), makeSymbol( "QUEUE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list26 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw27$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw28$DONE = makeKeyword( "DONE" );
    $sym29$DO_LIST = makeSymbol( "DO-LIST" );
    $sym30$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS = makeSymbol( "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS" );
    $sym31$DO_QUEUE_ELEMENTS = makeSymbol( "DO-QUEUE-ELEMENTS" );
    $sym32$Q = makeUninternedSymbol( "Q" );
    $sym33$DONE_VAR = makeUninternedSymbol( "DONE-VAR" );
    $sym34$CLET = makeSymbol( "CLET" );
    $sym35$COR = makeSymbol( "COR" );
    $sym36$QUEUE_EMPTY_P = makeSymbol( "QUEUE-EMPTY-P" );
    $sym37$WHILE = makeSymbol( "WHILE" );
    $sym38$CNOT = makeSymbol( "CNOT" );
    $sym39$DEQUEUE = makeSymbol( "DEQUEUE" );
    $sym40$CSETQ = makeSymbol( "CSETQ" );
    $str41$__Queue_length____a = makeString( "~%Queue length : ~a" );
    $str42$__Queue_contents__ = makeString( "~%Queue contents :" );
    $str43$___s = makeString( "~%~s" );
    $int44$131 = makeInteger( 131 );
    $sym45$CFASL_INPUT_QUEUE = makeSymbol( "CFASL-INPUT-QUEUE" );
    $sym46$CFASL_OUTPUT_OBJECT_QUEUE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-QUEUE-METHOD" );
    $str47$We_promised_to_write__A_elements_ = makeString( "We promised to write ~A elements but wrote ~A." );
    $sym48$PRIORITY_QUEUE = makeSymbol( "PRIORITY-QUEUE" );
    $sym49$PRIORITY_QUEUE_P = makeSymbol( "PRIORITY-QUEUE-P" );
    $list50 = ConsesLow.list( makeSymbol( "NUM" ), makeSymbol( "MAX-SIZE" ), makeSymbol( "RANK-FUNC" ), makeSymbol( "COMP-FUNC" ), makeSymbol( "TREE" ) );
    $list51 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "MAX-SIZE" ), makeKeyword( "RANK-FUNC" ), makeKeyword( "COMP-FUNC" ), makeKeyword( "TREE" ) );
    $list52 = ConsesLow.list( makeSymbol( "P-QUEUE-NUM" ), makeSymbol( "P-QUEUE-MAX-SIZE" ), makeSymbol( "P-QUEUE-RANK-FUNC" ), makeSymbol( "P-QUEUE-COMP-FUNC" ), makeSymbol( "P-QUEUE-TREE" ) );
    $list53 = ConsesLow.list( makeSymbol( "_CSETF-P-QUEUE-NUM" ), makeSymbol( "_CSETF-P-QUEUE-MAX-SIZE" ), makeSymbol( "_CSETF-P-QUEUE-RANK-FUNC" ), makeSymbol( "_CSETF-P-QUEUE-COMP-FUNC" ), makeSymbol(
        "_CSETF-P-QUEUE-TREE" ) );
    $sym54$PRINT_P_QUEUE = makeSymbol( "PRINT-P-QUEUE" );
    $sym55$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list56 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PRIORITY-QUEUE-P" ) );
    $sym57$P_QUEUE_NUM = makeSymbol( "P-QUEUE-NUM" );
    $sym58$_CSETF_P_QUEUE_NUM = makeSymbol( "_CSETF-P-QUEUE-NUM" );
    $sym59$P_QUEUE_MAX_SIZE = makeSymbol( "P-QUEUE-MAX-SIZE" );
    $sym60$_CSETF_P_QUEUE_MAX_SIZE = makeSymbol( "_CSETF-P-QUEUE-MAX-SIZE" );
    $sym61$P_QUEUE_RANK_FUNC = makeSymbol( "P-QUEUE-RANK-FUNC" );
    $sym62$_CSETF_P_QUEUE_RANK_FUNC = makeSymbol( "_CSETF-P-QUEUE-RANK-FUNC" );
    $sym63$P_QUEUE_COMP_FUNC = makeSymbol( "P-QUEUE-COMP-FUNC" );
    $sym64$_CSETF_P_QUEUE_COMP_FUNC = makeSymbol( "_CSETF-P-QUEUE-COMP-FUNC" );
    $sym65$P_QUEUE_TREE = makeSymbol( "P-QUEUE-TREE" );
    $sym66$_CSETF_P_QUEUE_TREE = makeSymbol( "_CSETF-P-QUEUE-TREE" );
    $kw67$MAX_SIZE = makeKeyword( "MAX-SIZE" );
    $kw68$RANK_FUNC = makeKeyword( "RANK-FUNC" );
    $kw69$COMP_FUNC = makeKeyword( "COMP-FUNC" );
    $kw70$TREE = makeKeyword( "TREE" );
    $sym71$MAKE_PRIORITY_QUEUE = makeSymbol( "MAKE-PRIORITY-QUEUE" );
    $sym72$VISIT_DEFSTRUCT_OBJECT_PRIORITY_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PRIORITY-QUEUE-METHOD" );
    $sym73$_ = makeSymbol( "<" );
    $sym74$PQ_COLLISION_ENTER = makeSymbol( "PQ-COLLISION-ENTER" );
    $sym75$PQ_COLLISION_REMOVE = makeSymbol( "PQ-COLLISION-REMOVE" );
    $sym76$PQ_COLLISION_EMPTY = makeSymbol( "PQ-COLLISION-EMPTY" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM-VAR" ), makeSymbol( "PRIORITY-QUEUE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym78$KEY_VAR = makeUninternedSymbol( "KEY-VAR" );
    $sym79$COLLISIONS_VAR = makeUninternedSymbol( "COLLISIONS-VAR" );
    $sym80$DO_BTREE_INDEX = makeSymbol( "DO-BTREE-INDEX" );
    $sym81$DO_PRIORITY_QUEUE_ELEMENTS_BTREE = makeSymbol( "DO-PRIORITY-QUEUE-ELEMENTS-BTREE" );
    $sym82$IGNORE = makeSymbol( "IGNORE" );
    $sym83$DO_PRIORITY_QUEUE_ELEMENTS = makeSymbol( "DO-PRIORITY-QUEUE-ELEMENTS" );
    $sym84$LAZY_PRIORITY_QUEUE = makeSymbol( "LAZY-PRIORITY-QUEUE" );
    $sym85$LAZY_PRIORITY_QUEUE_P = makeSymbol( "LAZY-PRIORITY-QUEUE-P" );
    $list86 = ConsesLow.list( makeSymbol( "ORDERED-ITEMS" ), makeSymbol( "NEW-ITEMS" ) );
    $list87 = ConsesLow.list( makeKeyword( "ORDERED-ITEMS" ), makeKeyword( "NEW-ITEMS" ) );
    $list88 = ConsesLow.list( makeSymbol( "LAZY-P-QUEUE-ORDERED-ITEMS" ), makeSymbol( "LAZY-P-QUEUE-NEW-ITEMS" ) );
    $list89 = ConsesLow.list( makeSymbol( "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS" ), makeSymbol( "_CSETF-LAZY-P-QUEUE-NEW-ITEMS" ) );
    $sym90$PRINT_LAZY_P_QUEUE = makeSymbol( "PRINT-LAZY-P-QUEUE" );
    $sym91$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list92 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "LAZY-PRIORITY-QUEUE-P" ) );
    $sym93$LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol( "LAZY-P-QUEUE-ORDERED-ITEMS" );
    $sym94$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol( "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS" );
    $sym95$LAZY_P_QUEUE_NEW_ITEMS = makeSymbol( "LAZY-P-QUEUE-NEW-ITEMS" );
    $sym96$_CSETF_LAZY_P_QUEUE_NEW_ITEMS = makeSymbol( "_CSETF-LAZY-P-QUEUE-NEW-ITEMS" );
    $kw97$ORDERED_ITEMS = makeKeyword( "ORDERED-ITEMS" );
    $kw98$NEW_ITEMS = makeKeyword( "NEW-ITEMS" );
    $sym99$MAKE_LAZY_PRIORITY_QUEUE = makeSymbol( "MAKE-LAZY-PRIORITY-QUEUE" );
    $sym100$VISIT_DEFSTRUCT_OBJECT_LAZY_PRIORITY_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LAZY-PRIORITY-QUEUE-METHOD" );
    $str101$___S_new_ = makeString( " (~S new)" );
    $sym102$_ = makeSymbol( ">" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM-VAR" ), makeSymbol( "LPQ" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym104$LAZY_PRIORITY_QUEUE_ELEMENTS = makeSymbol( "LAZY-PRIORITY-QUEUE-ELEMENTS" );
    $sym105$LOCKED_QUEUE = makeSymbol( "LOCKED-QUEUE" );
    $sym106$LOCKED_QUEUE_P = makeSymbol( "LOCKED-QUEUE-P" );
    $list107 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "QUEUE" ) );
    $list108 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "QUEUE" ) );
    $list109 = ConsesLow.list( makeSymbol( "LOCKED-QUEUE-LOCK" ), makeSymbol( "LOCKED-QUEUE-QUEUE" ) );
    $list110 = ConsesLow.list( makeSymbol( "_CSETF-LOCKED-QUEUE-LOCK" ), makeSymbol( "_CSETF-LOCKED-QUEUE-QUEUE" ) );
    $sym111$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym112$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list113 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "LOCKED-QUEUE-P" ) );
    $sym114$LOCKED_QUEUE_LOCK = makeSymbol( "LOCKED-QUEUE-LOCK" );
    $sym115$_CSETF_LOCKED_QUEUE_LOCK = makeSymbol( "_CSETF-LOCKED-QUEUE-LOCK" );
    $sym116$LOCKED_QUEUE_QUEUE = makeSymbol( "LOCKED-QUEUE-QUEUE" );
    $sym117$_CSETF_LOCKED_QUEUE_QUEUE = makeSymbol( "_CSETF-LOCKED-QUEUE-QUEUE" );
    $kw118$LOCK = makeKeyword( "LOCK" );
    $kw119$QUEUE = makeKeyword( "QUEUE" );
    $sym120$MAKE_LOCKED_QUEUE = makeSymbol( "MAKE-LOCKED-QUEUE" );
    $sym121$VISIT_DEFSTRUCT_OBJECT_LOCKED_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LOCKED-QUEUE-METHOD" );
    $str122$Queue_Lock = makeString( "Queue Lock" );
    $sym123$LOCKED_P_QUEUE = makeSymbol( "LOCKED-P-QUEUE" );
    $sym124$LOCKED_P_QUEUE_P = makeSymbol( "LOCKED-P-QUEUE-P" );
    $list125 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "PRIORITY-QUEUE" ) );
    $list126 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "PRIORITY-QUEUE" ) );
    $list127 = ConsesLow.list( makeSymbol( "LP-QUEUE-LOCK" ), makeSymbol( "LP-QUEUE-PRIORITY-QUEUE" ) );
    $list128 = ConsesLow.list( makeSymbol( "_CSETF-LP-QUEUE-LOCK" ), makeSymbol( "_CSETF-LP-QUEUE-PRIORITY-QUEUE" ) );
    $sym129$PRINT_LP_QUEUE = makeSymbol( "PRINT-LP-QUEUE" );
    $sym130$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list131 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "LOCKED-P-QUEUE-P" ) );
    $sym132$LP_QUEUE_LOCK = makeSymbol( "LP-QUEUE-LOCK" );
    $sym133$_CSETF_LP_QUEUE_LOCK = makeSymbol( "_CSETF-LP-QUEUE-LOCK" );
    $sym134$LP_QUEUE_PRIORITY_QUEUE = makeSymbol( "LP-QUEUE-PRIORITY-QUEUE" );
    $sym135$_CSETF_LP_QUEUE_PRIORITY_QUEUE = makeSymbol( "_CSETF-LP-QUEUE-PRIORITY-QUEUE" );
    $kw136$PRIORITY_QUEUE = makeKeyword( "PRIORITY-QUEUE" );
    $sym137$MAKE_LOCKED_P_QUEUE = makeSymbol( "MAKE-LOCKED-P-QUEUE" );
    $sym138$VISIT_DEFSTRUCT_OBJECT_LOCKED_P_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LOCKED-P-QUEUE-METHOD" );
    $str139$_tree_ = makeString( " tree=" );
    $str140$Queues_Module_Supercategory = makeString( "Queues Module Supercategory" );
    $str141$Priority_Queue_Subcategory = makeString( "Priority Queue Subcategory" );
    $str142$Priority_Queue_Testing_Suite = makeString( "Priority Queue Testing Suite" );
    $str143$Locked_Priority_Queue_Subcategory = makeString( "Locked Priority Queue Subcategory" );
    $str144$Locked_Priority_Queue_Testing_Sui = makeString( "Locked Priority Queue Testing Suite" );
  }

  public static final class $queue_native
      extends
        SubLStructNative
  {
    public SubLObject $num;
    public SubLObject $elements;
    public SubLObject $last;
    private static final SubLStructDeclNative structDecl;

    public $queue_native()
    {
      this.$num = CommonSymbols.NIL;
      this.$elements = CommonSymbols.NIL;
      this.$last = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$num;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$elements;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$last;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$num = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$elements = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$last = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $queue_native.class, $sym0$QUEUE, $sym1$QUEUE_P, $list2, $list3, new String[] { "$num", "$elements", "$last"
      }, $list4, $list5, $sym6$PRINT_QUEUE );
    }
  }

  public static final class $queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return queue_p( arg1 );
    }
  }

  public static final class $priority_queue_native
      extends
        SubLStructNative
  {
    public SubLObject $num;
    public SubLObject $max_size;
    public SubLObject $rank_func;
    public SubLObject $comp_func;
    public SubLObject $tree;
    private static final SubLStructDeclNative structDecl;

    public $priority_queue_native()
    {
      this.$num = CommonSymbols.NIL;
      this.$max_size = CommonSymbols.NIL;
      this.$rank_func = CommonSymbols.NIL;
      this.$comp_func = CommonSymbols.NIL;
      this.$tree = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $priority_queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$num;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$max_size;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$rank_func;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$comp_func;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$tree;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$num = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$max_size = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$rank_func = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$comp_func = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$tree = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $priority_queue_native.class, $sym48$PRIORITY_QUEUE, $sym49$PRIORITY_QUEUE_P, $list50, $list51, new String[] { "$num", "$max_size", "$rank_func", "$comp_func", "$tree"
      }, $list52, $list53, $sym54$PRINT_P_QUEUE );
    }
  }

  public static final class $priority_queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $priority_queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PRIORITY-QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return priority_queue_p( arg1 );
    }
  }

  public static final class $pq_collision_enter$BinaryFunction
      extends
        BinaryFunction
  {
    public $pq_collision_enter$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PQ-COLLISION-ENTER" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return pq_collision_enter( arg1, arg2 );
    }
  }

  public static final class $pq_collision_remove$BinaryFunction
      extends
        BinaryFunction
  {
    public $pq_collision_remove$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PQ-COLLISION-REMOVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return pq_collision_remove( arg1, arg2 );
    }
  }

  public static final class $pq_collision_empty$UnaryFunction
      extends
        UnaryFunction
  {
    public $pq_collision_empty$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PQ-COLLISION-EMPTY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pq_collision_empty( arg1 );
    }
  }

  public static final class $lazy_priority_queue_native
      extends
        SubLStructNative
  {
    public SubLObject $ordered_items;
    public SubLObject $new_items;
    private static final SubLStructDeclNative structDecl;

    public $lazy_priority_queue_native()
    {
      this.$ordered_items = CommonSymbols.NIL;
      this.$new_items = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $lazy_priority_queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$ordered_items;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$new_items;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$ordered_items = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$new_items = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $lazy_priority_queue_native.class, $sym84$LAZY_PRIORITY_QUEUE, $sym85$LAZY_PRIORITY_QUEUE_P, $list86, $list87, new String[] { "$ordered_items", "$new_items"
      }, $list88, $list89, $sym90$PRINT_LAZY_P_QUEUE );
    }
  }

  public static final class $lazy_priority_queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $lazy_priority_queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LAZY-PRIORITY-QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return lazy_priority_queue_p( arg1 );
    }
  }

  public static final class $locked_queue_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $queue;
    private static final SubLStructDeclNative structDecl;

    public $locked_queue_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$queue = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $locked_queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$queue;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$queue = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $locked_queue_native.class, $sym105$LOCKED_QUEUE, $sym106$LOCKED_QUEUE_P, $list107, $list108, new String[] { "$lock", "$queue"
      }, $list109, $list110, $sym111$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $locked_queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $locked_queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LOCKED-QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return locked_queue_p( arg1 );
    }
  }

  public static final class $locked_p_queue_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $priority_queue;
    private static final SubLStructDeclNative structDecl;

    public $locked_p_queue_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$priority_queue = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $locked_p_queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$priority_queue;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$priority_queue = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $locked_p_queue_native.class, $sym123$LOCKED_P_QUEUE, $sym124$LOCKED_P_QUEUE_P, $list125, $list126, new String[] { "$lock", "$priority_queue"
      }, $list127, $list128, $sym129$PRINT_LP_QUEUE );
    }
  }

  public static final class $locked_p_queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $locked_p_queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LOCKED-P-QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return locked_p_queue_p( arg1 );
    }
  }

  /**
   * @return
   */
  public static SubLObject create_queue()
  {
    return create_queue( NIL );
  }
}
/*
 *
 * Total time: 508 ms
 *
 */