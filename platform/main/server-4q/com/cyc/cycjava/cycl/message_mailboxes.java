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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class message_mailboxes
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.message_mailboxes";
  public static final String myFingerPrint = "26e3e349aaa14c9cdee94a2e0cc7e179d893dce78516684832a93afe8749de0f";
  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLSymbol $dtp_message_mailbox_suite$;
  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1238L)
  public static SubLSymbol $message_mailbox_suite$;
  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1709L)
  public static SubLSymbol $message_mailbox_style$;
  private static final SubLSymbol $sym0$MESSAGE_MAILBOX_SUITE;
  private static final SubLSymbol $sym1$MESSAGE_MAILBOX_SUITE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$MESSAGE_MAILBOX_SUITE_LOCK;
  private static final SubLSymbol $sym10$_CSETF_MESSAGE_MAILBOX_SUITE_LOCK;
  private static final SubLSymbol $sym11$MESSAGE_MAILBOX_SUITE_MAILBOXES;
  private static final SubLSymbol $sym12$_CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES;
  private static final SubLSymbol $kw13$LOCK;
  private static final SubLSymbol $kw14$MAILBOXES;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_MESSAGE_MAILBOX_SUITE;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD;
  private static final SubLString $str21$Message_Mailbox_Suite;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$CLET;
  private static final SubLSymbol $sym24$_MESSAGE_MAILBOX_SUITE_;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$WITH_LOCK_HELD;
  private static final SubLSymbol $kw27$NON_BLOCKING;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$PIF;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$ENQUEUE;
  private static final SubLSymbol $sym33$IPC_ENQUEUE;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$FIF;
  private static final SubLSymbol $sym36$QUEUE_P;
  private static final SubLSymbol $sym37$IPC_QUEUE_P;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$NEW_IPC_QUEUE;
  private static final SubLSymbol $sym41$QUEUE_EMPTY_P;
  private static final SubLString $str42$;
  private static final SubLSymbol $sym43$DEQUEUE;
  private static final SubLSymbol $sym44$IPC_DEQUEUE;
  private static final SubLSymbol $sym45$QUEUE_SIZE;
  private static final SubLSymbol $sym46$IPC_CURRENT_QUEUE_SIZE;
  private static final SubLString $str47$Message_Mailbox;
  private static final SubLString $str48$Address__S___;
  private static final SubLString $str49$_D_messages___;

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject message_mailbox_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject message_mailbox_suite_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $message_mailbox_suite_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject message_mailbox_suite_lock(final SubLObject v_object)
  {
    assert NIL != message_mailbox_suite_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject message_mailbox_suite_mailboxes(final SubLObject v_object)
  {
    assert NIL != message_mailbox_suite_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject _csetf_message_mailbox_suite_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != message_mailbox_suite_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject _csetf_message_mailbox_suite_mailboxes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != message_mailbox_suite_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject make_message_mailbox_suite(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $message_mailbox_suite_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$LOCK ) )
      {
        _csetf_message_mailbox_suite_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$MAILBOXES ) )
      {
        _csetf_message_mailbox_suite_mailboxes( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject visit_defstruct_message_mailbox_suite(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_MESSAGE_MAILBOX_SUITE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$LOCK, message_mailbox_suite_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$MAILBOXES, message_mailbox_suite_mailboxes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_MESSAGE_MAILBOX_SUITE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 792L)
  public static SubLObject visit_defstruct_object_message_mailbox_suite_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_message_mailbox_suite( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 946L)
  public static SubLObject new_message_mailbox_suite()
  {
    final SubLObject mbox_suite = make_message_mailbox_suite( UNPROVIDED );
    _csetf_message_mailbox_suite_lock( mbox_suite, Locks.make_lock( $str21$Message_Mailbox_Suite ) );
    _csetf_message_mailbox_suite_mailboxes( mbox_suite, dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    return mbox_suite;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1318L)
  public static SubLObject with_message_mailbox_suite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject mailbox = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    mailbox = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym23$CLET, ConsesLow.list( ConsesLow.list( $sym24$_MESSAGE_MAILBOX_SUITE_, mailbox ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1457L)
  public static SubLObject with_message_mailbox_suite_lock_held(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject mbox_suite = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    mbox_suite = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym26$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym9$MESSAGE_MAILBOX_SUITE_LOCK, mbox_suite ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1625L)
  public static SubLObject current_message_mailbox_suite()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $message_mailbox_suite$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1805L)
  public static SubLObject with_blocking_message_mailbox_style(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym23$CLET, $list28, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 1948L)
  public static SubLObject is_non_blocking_message_mailboxP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $message_mailbox_style$.getDynamicValue( thread ), $kw27$NON_BLOCKING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2053L)
  public static SubLObject is_blocking_message_mailboxP()
  {
    return makeBoolean( NIL == is_non_blocking_message_mailboxP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2153L)
  public static SubLObject add_message_to_message_mailbox(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject message = NIL;
    SubLObject mailbox = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    message = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    mailbox = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$PIF, $list31, ConsesLow.list( $sym32$ENQUEUE, message, mailbox ), ConsesLow.list( $sym33$IPC_ENQUEUE, message, mailbox ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2359L)
  public static SubLObject is_message_mailbox_p(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mailbox = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    mailbox = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym35$FIF, $list31, ConsesLow.list( $sym36$QUEUE_P, mailbox ), ConsesLow.list( $sym37$IPC_QUEUE_P, mailbox ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2530L)
  public static SubLObject allocate_message_mailbox(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym35$FIF, $list31, $list39, ConsesLow.list( $sym40$NEW_IPC_QUEUE, name ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2696L)
  public static SubLObject remove_message_from_message_mailbox(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mailbox = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    mailbox = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym35$FIF, $list31, ConsesLow.list( $sym35$FIF, ConsesLow.list( $sym41$QUEUE_EMPTY_P, mailbox ), $str42$, ConsesLow.list( $sym43$DEQUEUE, mailbox ) ), ConsesLow.list( $sym44$IPC_DEQUEUE,
          mailbox ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 2914L)
  public static SubLObject fetch_mailbox_size(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mailbox = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    mailbox = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym35$FIF, $list31, ConsesLow.list( $sym45$QUEUE_SIZE, mailbox ), ConsesLow.list( $sym46$IPC_CURRENT_QUEUE_SIZE, mailbox ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 3095L)
  public static SubLObject known_message_mailboxP(final SubLObject address)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue( thread );
    SubLObject result = NIL;
    final SubLObject lock = message_mailbox_suite_lock( mbox_suite );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_dictionary = message_mailbox_suite_mailboxes( mbox_suite );
      result = dictionary.dictionary_lookup( v_dictionary, address, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return list_utilities.sublisp_boolean( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 3439L)
  public static SubLObject store_mail_in_message_mailbox(final SubLObject address, final SubLObject message, SubLObject mbox_suite)
  {
    if( mbox_suite == UNPROVIDED )
    {
      mbox_suite = $message_mailbox_suite$.getDynamicValue();
    }
    final SubLObject mailbox = ensure_message_mailbox_allocation( address, mbox_suite );
    final SubLObject lock = message_mailbox_suite_lock( mbox_suite );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      if( NIL != is_non_blocking_message_mailboxP() )
      {
        queues.enqueue( message, mailbox );
      }
      else
      {
        process_utilities.ipc_enqueue( message, mailbox, UNPROVIDED );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return address;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 3848L)
  public static SubLObject ensure_message_mailbox_allocation(final SubLObject address, SubLObject mbox_suite)
  {
    if( mbox_suite == UNPROVIDED )
    {
      mbox_suite = $message_mailbox_suite$.getDynamicValue();
    }
    SubLObject mailbox = NIL;
    final SubLObject lock = message_mailbox_suite_lock( mbox_suite );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_dictionary = message_mailbox_suite_mailboxes( mbox_suite );
      mailbox = dictionary.dictionary_lookup( v_dictionary, address, UNPROVIDED );
      if( NIL == ( ( NIL != is_non_blocking_message_mailboxP() ) ? queues.queue_p( mailbox ) : process_utilities.ipc_queue_p( mailbox ) ) )
      {
        mailbox = ( ( NIL != is_non_blocking_message_mailboxP() ) ? queues.create_queue( UNPROVIDED ) : process_utilities.new_ipc_queue( $str47$Message_Mailbox ) );
        dictionary.dictionary_enter( v_dictionary, address, mailbox );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return mailbox;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 4365L)
  public static SubLObject deallocate_message_mailbox(final SubLObject address, SubLObject mbox_suite)
  {
    if( mbox_suite == UNPROVIDED )
    {
      mbox_suite = $message_mailbox_suite$.getDynamicValue();
    }
    SubLObject mailbox = NIL;
    final SubLObject lock = message_mailbox_suite_lock( mbox_suite );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_dictionary = message_mailbox_suite_mailboxes( mbox_suite );
      mailbox = dictionary.dictionary_lookup( v_dictionary, address, UNPROVIDED );
      if( NIL != ( ( NIL != is_non_blocking_message_mailboxP() ) ? queues.queue_p( mailbox ) : process_utilities.ipc_queue_p( mailbox ) ) )
      {
        dictionary.dictionary_remove( v_dictionary, address );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return mailbox;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 4794L)
  public static SubLObject retrieve_mail_from_message_mailbox(final SubLObject address)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue( thread );
    SubLObject message = NIL;
    SubLObject mailbox = NIL;
    final SubLObject lock = message_mailbox_suite_lock( mbox_suite );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_dictionary = message_mailbox_suite_mailboxes( mbox_suite );
      mailbox = dictionary.dictionary_lookup( v_dictionary, address, UNPROVIDED );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    if( NIL != ( ( NIL != is_non_blocking_message_mailboxP() ) ? queues.queue_p( mailbox ) : process_utilities.ipc_queue_p( mailbox ) ) )
    {
      if( NIL != is_non_blocking_message_mailboxP() )
      {
        final SubLObject lock_$1 = message_mailbox_suite_lock( mbox_suite );
        SubLObject release_$2 = NIL;
        try
        {
          release_$2 = Locks.seize_lock( lock_$1 );
          message = ( NIL != is_non_blocking_message_mailboxP() ) ? ( ( NIL != queues.queue_empty_p( mailbox ) ) ? $str42$ : queues.dequeue( mailbox ) ) : process_utilities.ipc_dequeue( mailbox, UNPROVIDED );
        }
        finally
        {
          if( NIL != release_$2 )
          {
            Locks.release_lock( lock_$1 );
          }
        }
      }
      else
      {
        message = ( NIL != is_non_blocking_message_mailboxP() ) ? ( ( NIL != queues.queue_empty_p( mailbox ) ) ? $str42$ : queues.dequeue( mailbox ) ) : process_utilities.ipc_dequeue( mailbox, UNPROVIDED );
      }
    }
    return message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/message-mailboxes.lisp", position = 5686L)
  public static SubLObject show_current_message_mailbox_suite(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mbox_suite = $message_mailbox_suite$.getDynamicValue( thread );
    final SubLObject v_dictionary = message_mailbox_suite_mailboxes( mbox_suite );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject address = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject mbox = thread.secondMultipleValue();
      thread.resetMultipleValues();
      PrintLow.format( stream, $str48$Address__S___, address );
      PrintLow.format( stream, $str49$_D_messages___, ( NIL != is_non_blocking_message_mailboxP() ) ? queues.queue_size( mbox ) : process_utilities.ipc_current_queue_size( mbox ) );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return stream;
  }

  public static SubLObject declare_message_mailboxes_file()
  {
    SubLFiles.declareFunction( me, "message_mailbox_suite_print_function_trampoline", "MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "message_mailbox_suite_p", "MESSAGE-MAILBOX-SUITE-P", 1, 0, false );
    new $message_mailbox_suite_p$UnaryFunction();
    SubLFiles.declareFunction( me, "message_mailbox_suite_lock", "MESSAGE-MAILBOX-SUITE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "message_mailbox_suite_mailboxes", "MESSAGE-MAILBOX-SUITE-MAILBOXES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_message_mailbox_suite_lock", "_CSETF-MESSAGE-MAILBOX-SUITE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_message_mailbox_suite_mailboxes", "_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_message_mailbox_suite", "MAKE-MESSAGE-MAILBOX-SUITE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_message_mailbox_suite", "VISIT-DEFSTRUCT-MESSAGE-MAILBOX-SUITE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_message_mailbox_suite_method", "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_message_mailbox_suite", "NEW-MESSAGE-MAILBOX-SUITE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_message_mailbox_suite", "WITH-MESSAGE-MAILBOX-SUITE" );
    SubLFiles.declareMacro( me, "with_message_mailbox_suite_lock_held", "WITH-MESSAGE-MAILBOX-SUITE-LOCK-HELD" );
    SubLFiles.declareFunction( me, "current_message_mailbox_suite", "CURRENT-MESSAGE-MAILBOX-SUITE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_blocking_message_mailbox_style", "WITH-BLOCKING-MESSAGE-MAILBOX-STYLE" );
    SubLFiles.declareFunction( me, "is_non_blocking_message_mailboxP", "IS-NON-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false );
    SubLFiles.declareFunction( me, "is_blocking_message_mailboxP", "IS-BLOCKING-MESSAGE-MAILBOX?", 0, 0, false );
    SubLFiles.declareMacro( me, "add_message_to_message_mailbox", "ADD-MESSAGE-TO-MESSAGE-MAILBOX" );
    SubLFiles.declareMacro( me, "is_message_mailbox_p", "IS-MESSAGE-MAILBOX-P" );
    SubLFiles.declareMacro( me, "allocate_message_mailbox", "ALLOCATE-MESSAGE-MAILBOX" );
    SubLFiles.declareMacro( me, "remove_message_from_message_mailbox", "REMOVE-MESSAGE-FROM-MESSAGE-MAILBOX" );
    SubLFiles.declareMacro( me, "fetch_mailbox_size", "FETCH-MAILBOX-SIZE" );
    SubLFiles.declareFunction( me, "known_message_mailboxP", "KNOWN-MESSAGE-MAILBOX?", 1, 0, false );
    SubLFiles.declareFunction( me, "store_mail_in_message_mailbox", "STORE-MAIL-IN-MESSAGE-MAILBOX", 2, 1, false );
    SubLFiles.declareFunction( me, "ensure_message_mailbox_allocation", "ENSURE-MESSAGE-MAILBOX-ALLOCATION", 1, 1, false );
    SubLFiles.declareFunction( me, "deallocate_message_mailbox", "DEALLOCATE-MESSAGE-MAILBOX", 1, 1, false );
    SubLFiles.declareFunction( me, "retrieve_mail_from_message_mailbox", "RETRIEVE-MAIL-FROM-MESSAGE-MAILBOX", 1, 0, false );
    SubLFiles.declareFunction( me, "show_current_message_mailbox_suite", "SHOW-CURRENT-MESSAGE-MAILBOX-SUITE", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_message_mailboxes_file()
  {
    $dtp_message_mailbox_suite$ = SubLFiles.defconstant( "*DTP-MESSAGE-MAILBOX-SUITE*", $sym0$MESSAGE_MAILBOX_SUITE );
    $message_mailbox_suite$ = SubLFiles.defparameter( "*MESSAGE-MAILBOX-SUITE*", new_message_mailbox_suite() );
    $message_mailbox_style$ = SubLFiles.defparameter( "*MESSAGE-MAILBOX-STYLE*", $kw27$NON_BLOCKING );
    return NIL;
  }

  public static SubLObject setup_message_mailboxes_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_message_mailbox_suite$.getGlobalValue(), Symbols.symbol_function( $sym7$MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$MESSAGE_MAILBOX_SUITE_LOCK, $sym10$_CSETF_MESSAGE_MAILBOX_SUITE_LOCK );
    Structures.def_csetf( $sym11$MESSAGE_MAILBOX_SUITE_MAILBOXES, $sym12$_CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES );
    Equality.identity( $sym0$MESSAGE_MAILBOX_SUITE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_message_mailbox_suite$.getGlobalValue(), Symbols.symbol_function(
        $sym20$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_message_mailboxes_file();
  }

  @Override
  public void initializeVariables()
  {
    init_message_mailboxes_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_message_mailboxes_file();
  }
  static
  {
    me = new message_mailboxes();
    $dtp_message_mailbox_suite$ = null;
    $message_mailbox_suite$ = null;
    $message_mailbox_style$ = null;
    $sym0$MESSAGE_MAILBOX_SUITE = makeSymbol( "MESSAGE-MAILBOX-SUITE" );
    $sym1$MESSAGE_MAILBOX_SUITE_P = makeSymbol( "MESSAGE-MAILBOX-SUITE-P" );
    $list2 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "MAILBOXES" ) );
    $list3 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "MAILBOXES" ) );
    $list4 = ConsesLow.list( makeSymbol( "MESSAGE-MAILBOX-SUITE-LOCK" ), makeSymbol( "MESSAGE-MAILBOX-SUITE-MAILBOXES" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-MESSAGE-MAILBOX-SUITE-LOCK" ), makeSymbol( "_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$MESSAGE_MAILBOX_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "MESSAGE-MAILBOX-SUITE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "MESSAGE-MAILBOX-SUITE-P" ) );
    $sym9$MESSAGE_MAILBOX_SUITE_LOCK = makeSymbol( "MESSAGE-MAILBOX-SUITE-LOCK" );
    $sym10$_CSETF_MESSAGE_MAILBOX_SUITE_LOCK = makeSymbol( "_CSETF-MESSAGE-MAILBOX-SUITE-LOCK" );
    $sym11$MESSAGE_MAILBOX_SUITE_MAILBOXES = makeSymbol( "MESSAGE-MAILBOX-SUITE-MAILBOXES" );
    $sym12$_CSETF_MESSAGE_MAILBOX_SUITE_MAILBOXES = makeSymbol( "_CSETF-MESSAGE-MAILBOX-SUITE-MAILBOXES" );
    $kw13$LOCK = makeKeyword( "LOCK" );
    $kw14$MAILBOXES = makeKeyword( "MAILBOXES" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_MESSAGE_MAILBOX_SUITE = makeSymbol( "MAKE-MESSAGE-MAILBOX-SUITE" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_MESSAGE_MAILBOX_SUITE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-MESSAGE-MAILBOX-SUITE-METHOD" );
    $str21$Message_Mailbox_Suite = makeString( "Message Mailbox Suite" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAILBOX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym23$CLET = makeSymbol( "CLET" );
    $sym24$_MESSAGE_MAILBOX_SUITE_ = makeSymbol( "*MESSAGE-MAILBOX-SUITE*" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "MBOX-SUITE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym26$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $kw27$NON_BLOCKING = makeKeyword( "NON-BLOCKING" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "*MESSAGE-MAILBOX-STYLE*" ), makeKeyword( "BLOCKING" ) ) );
    $list29 = ConsesLow.list( makeSymbol( "MESSAGE" ), makeSymbol( "MAILBOX" ) );
    $sym30$PIF = makeSymbol( "PIF" );
    $list31 = ConsesLow.list( makeSymbol( "IS-NON-BLOCKING-MESSAGE-MAILBOX?" ) );
    $sym32$ENQUEUE = makeSymbol( "ENQUEUE" );
    $sym33$IPC_ENQUEUE = makeSymbol( "IPC-ENQUEUE" );
    $list34 = ConsesLow.list( makeSymbol( "MAILBOX" ) );
    $sym35$FIF = makeSymbol( "FIF" );
    $sym36$QUEUE_P = makeSymbol( "QUEUE-P" );
    $sym37$IPC_QUEUE_P = makeSymbol( "IPC-QUEUE-P" );
    $list38 = ConsesLow.list( makeSymbol( "NAME" ) );
    $list39 = ConsesLow.list( makeSymbol( "CREATE-QUEUE" ) );
    $sym40$NEW_IPC_QUEUE = makeSymbol( "NEW-IPC-QUEUE" );
    $sym41$QUEUE_EMPTY_P = makeSymbol( "QUEUE-EMPTY-P" );
    $str42$ = makeString( "" );
    $sym43$DEQUEUE = makeSymbol( "DEQUEUE" );
    $sym44$IPC_DEQUEUE = makeSymbol( "IPC-DEQUEUE" );
    $sym45$QUEUE_SIZE = makeSymbol( "QUEUE-SIZE" );
    $sym46$IPC_CURRENT_QUEUE_SIZE = makeSymbol( "IPC-CURRENT-QUEUE-SIZE" );
    $str47$Message_Mailbox = makeString( "Message Mailbox" );
    $str48$Address__S___ = makeString( "Address ~S : " );
    $str49$_D_messages___ = makeString( "~D messages.~%" );
  }

  public static final class $message_mailbox_suite_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $mailboxes;
    private static final SubLStructDeclNative structDecl;

    public $message_mailbox_suite_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$mailboxes = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $message_mailbox_suite_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mailboxes;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mailboxes = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $message_mailbox_suite_native.class, $sym0$MESSAGE_MAILBOX_SUITE, $sym1$MESSAGE_MAILBOX_SUITE_P, $list2, $list3, new String[] { "$lock", "$mailboxes"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $message_mailbox_suite_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $message_mailbox_suite_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "MESSAGE-MAILBOX-SUITE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return message_mailbox_suite_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 129 ms
 * 
 */