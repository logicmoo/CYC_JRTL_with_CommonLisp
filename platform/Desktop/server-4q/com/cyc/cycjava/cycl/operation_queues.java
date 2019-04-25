package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class operation_queues
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.operation_queues";
  public static final String myFingerPrint = "7fd42f2e861e5d0aa8b21a926da259457d09fe159fa82836f26762a630c034c5";
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 380L)
  private static SubLSymbol $local_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 1886L)
  public static SubLSymbol $local_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3385L)
  public static SubLSymbol $remote_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3673L)
  public static SubLSymbol $remote_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4320L)
  public static SubLSymbol $transcript_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4622L)
  public static SubLSymbol $transcript_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5329L)
  public static SubLSymbol $hl_transcript_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5642L)
  public static SubLSymbol $hl_transcript_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6395L)
  public static SubLSymbol $auxiliary_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6701L)
  public static SubLSymbol $auxiliary_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7558L)
  public static SubLSymbol $transmit_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7838L)
  public static SubLSymbol $transmit_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9354L)
  public static SubLSymbol $local_operation_storage_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9639L)
  public static SubLSymbol $local_operation_storage_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12906L)
  public static SubLSymbol $within_a_remote_opP$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15637L)
  public static SubLSymbol $hl_transcripts_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15928L)
  private static SubLSymbol $hl_transcript_special_operators$;
  private static final SubLSymbol $sym0$_LOCAL_QUEUE_;
  private static final SubLString $str1$Local_Queue_Lock;
  private static final SubLString $str2$Local_queue_being_overwritten___A;
  private static final SubLSymbol $sym3$_REMOTE_QUEUE_;
  private static final SubLString $str4$Remote_Queue_Lock;
  private static final SubLSymbol $sym5$_TRANSCRIPT_QUEUE_;
  private static final SubLString $str6$Transcript_Queue_Lock;
  private static final SubLSymbol $sym7$_HL_TRANSCRIPT_QUEUE_;
  private static final SubLString $str8$HL_Transcript_Queue_Lock;
  private static final SubLSymbol $sym9$_AUXILIARY_QUEUE_;
  private static final SubLString $str10$Auxiliary_Queue_Lock;
  private static final SubLSymbol $sym11$_TRANSMIT_QUEUE_;
  private static final SubLString $str12$Transmit_Queue_Lock;
  private static final SubLString $str13$The_Transmit_Queue_contains_OP__A;
  private static final SubLSymbol $sym14$_LOCAL_OPERATION_STORAGE_QUEUE_;
  private static final SubLString $str15$Local_Operation_Queue_Lock;
  private static final SubLSymbol $sym16$ALL_INTERNAL_QUEUE_SIZES;
  private static final SubLSymbol $sym17$WAIT_FOR_QUEUES_TO_FINISH;
  private static final SubLSymbol $sym18$STRINGP;
  private static final SubLSymbol $sym19$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str20$_A;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$UNENCAPSULATION_ERROR;
  private static final SubLSymbol $sym23$WITH_BOOKKEEPING_INFO;
  private static final SubLSymbol $sym24$QUOTE;

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 1952L)
  public static SubLObject local_queue_size()
  {
    return queues.queue_size( $local_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2081L)
  public static SubLObject local_queue_empty()
  {
    return queues.queue_empty_p( $local_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2214L)
  public static SubLObject clear_local_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $local_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2400L)
  public static SubLObject local_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $local_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2540L)
  public static SubLObject local_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $local_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2697L)
  public static SubLObject local_queue_peek()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_queue_lock$.getDynamicValue( thread ) );
      ans = queues.queue_peek( $local_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2854L)
  public static SubLObject local_queue_contents()
  {
    return queues.queue_elements( $local_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2996L)
  public static SubLObject local_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_queue_lock$.getDynamicValue( thread ) );
      result = $local_queue$.getGlobalValue();
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3143L)
  public static SubLObject set_local_queue(final SubLObject queue)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == local_queue_empty() )
    {
      Errors.warn( $str2$Local_queue_being_overwritten___A, local_queue_size() );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_queue_lock$.getDynamicValue( thread ) );
      $local_queue$.setGlobalValue( queue );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3741L)
  public static SubLObject remote_queue_size()
  {
    return queues.queue_size( $remote_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3816L)
  public static SubLObject remote_queue_empty()
  {
    return queues.queue_empty_p( $remote_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3894L)
  public static SubLObject clear_remote_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $remote_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $remote_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $remote_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4018L)
  public static SubLObject remote_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $remote_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $remote_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $remote_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4160L)
  public static SubLObject remote_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $remote_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $remote_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $remote_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4698L)
  public static SubLObject transcript_queue_size()
  {
    return queues.queue_size( $transcript_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4781L)
  public static SubLObject transcript_queue_empty()
  {
    return queues.queue_empty_p( $transcript_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4867L)
  public static SubLObject clear_transcript_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transcript_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $transcript_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transcript_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5003L)
  public static SubLObject transcript_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transcript_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $transcript_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transcript_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5157L)
  public static SubLObject transcript_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transcript_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $transcript_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transcript_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5724L)
  public static SubLObject hl_transcript_queue_size()
  {
    return queues.queue_size( $hl_transcript_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5813L)
  public static SubLObject hl_transcript_queue_emptyP()
  {
    return queues.queue_empty_p( $hl_transcript_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5906L)
  public static SubLObject clear_hl_transcript_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $hl_transcript_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $hl_transcript_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $hl_transcript_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6051L)
  public static SubLObject hl_transcript_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $hl_transcript_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $hl_transcript_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $hl_transcript_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6214L)
  public static SubLObject hl_transcript_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $hl_transcript_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $hl_transcript_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $hl_transcript_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6775L)
  public static SubLObject auxiliary_queue_size()
  {
    return queues.queue_size( $auxiliary_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6856L)
  public static SubLObject auxiliary_queue_empty()
  {
    return queues.queue_empty_p( $auxiliary_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6940L)
  public static SubLObject clear_auxiliary_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $auxiliary_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7073L)
  public static SubLObject auxiliary_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $auxiliary_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7224L)
  public static SubLObject auxiliary_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $auxiliary_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7393L)
  public static SubLObject auxiliary_queue_peek()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      ans = queues.queue_peek( $auxiliary_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $auxiliary_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7910L)
  public static SubLObject transmit_queue_size()
  {
    return queues.queue_size( $transmit_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7989L)
  public static SubLObject transmit_queue_empty()
  {
    return queues.queue_empty_p( $transmit_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8071L)
  public static SubLObject clear_transmit_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $transmit_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8201L)
  public static SubLObject transmit_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $transmit_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8349L)
  public static SubLObject transmit_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $transmit_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8515L)
  public static SubLObject transmit_queue_peek_chunk(final SubLObject chunk_size)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject size = NIL;
    SubLObject data = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      data = queues.queue_peek_n( $transmit_queue$.getGlobalValue(), chunk_size );
      size = Sequences.length( data );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return Values.values( data, size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8889L)
  public static SubLObject transmit_queue_remove_chunk(final SubLObject chunk)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      SubLObject cdolist_list_var = chunk;
      SubLObject expected_op = NIL;
      expected_op = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject found_op = queues.dequeue( $transmit_queue$.getGlobalValue() );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !expected_op.equal( found_op ) )
        {
          Errors.error( $str13$The_Transmit_Queue_contains_OP__A, expected_op, found_op );
        }
        cdolist_list_var = cdolist_list_var.rest();
        expected_op = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $transmit_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9733L)
  public static SubLObject local_operation_storage_queue_size()
  {
    return queues.queue_size( $local_operation_storage_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9842L)
  public static SubLObject local_operation_storage_queue_empty()
  {
    return queues.queue_empty_p( $local_operation_storage_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9954L)
  public static SubLObject clear_local_operation_storage_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_operation_storage_queue_lock$.getDynamicValue( thread ) );
      queues.clear_queue( $local_operation_storage_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_operation_storage_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10129L)
  public static SubLObject local_operation_storage_queue_enqueue(final SubLObject operation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_operation_storage_queue_lock$.getDynamicValue( thread ) );
      queues.enqueue( operation, $local_operation_storage_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_operation_storage_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10322L)
  public static SubLObject local_operation_storage_queue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $local_operation_storage_queue_lock$.getDynamicValue( thread ) );
      ans = queues.dequeue( $local_operation_storage_queue$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $local_operation_storage_queue_lock$.getDynamicValue( thread ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10533L)
  public static SubLObject local_operation_storage_queue_contents()
  {
    return queues.queue_elements( $local_operation_storage_queue$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10711L)
  public static SubLObject local_operations_anywhere()
  {
    return makeBoolean( NIL == local_queue_empty() || NIL == transcript_queue_empty() || NIL == local_operation_storage_queue_empty() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 11112L)
  public static SubLObject all_internal_queue_sizes()
  {
    return Numbers.add( auxiliary_queue_size(), local_queue_size() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 11321L)
  public static SubLObject wait_for_queues_to_finish(final SubLObject msg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( msg ) : msg;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( msg );
        final SubLObject max = all_internal_queue_sizes();
        while ( all_internal_queue_sizes().isPositive())
        {
          final SubLObject curr = all_internal_queue_sizes();
          final SubLObject done = Numbers.subtract( max, curr );
          utilities_macros.note_percent_progress( done, max );
          Threads.sleep( TEN_INTEGER );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return msg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 11800L)
  public static SubLObject add_to_local_queue(final SubLObject form, SubLObject encapsulateP)
  {
    if( encapsulateP == UNPROVIDED )
    {
      encapsulateP = T;
    }
    final SubLObject api_op = ( NIL != encapsulateP ) ? form_to_api_op( form ) : form;
    local_queue_enqueue( api_op );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12112L)
  public static SubLObject run_one_local_op()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject op = local_queue_dequeue();
    if( NIL != op )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
      try
      {
        api_control_vars.$use_local_queueP$.bind( NIL, thread );
        control_vars.$last_agenda_op$.setGlobalValue( op );
        final SubLObject form = api_op_to_form( op );
        if( NIL != form )
        {
          try
          {
            process_utilities.current_process_note_form( form );
            eval_in_api.cyc_api_eval( form );
          }
          finally
          {
            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              process_utilities.current_process_clear_form();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
            }
          }
        }
      }
      finally
      {
        api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
      }
      if( NIL != local_queue_empty() )
      {
        operation_communication.save_transcript_ops();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12594L)
  public static SubLObject add_to_remote_queue(final SubLObject form)
  {
    if( NIL != operation_communication.operation_from_meP( form ) )
    {
      operation_communication.set_read_master_transcript_op_number( Numbers.add( ONE_INTEGER, operation_communication.read_master_transcript_op_number() ) );
    }
    else
    {
      remote_queue_enqueue( conses_high.fourth( form ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12958L)
  public static SubLObject within_a_remote_opP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_a_remote_opP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 13028L)
  public static SubLObject run_one_remote_op()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject op = NIL;
    op = remote_queue_dequeue();
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $within_a_remote_opP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      control_vars.$use_transcriptP$.bind( NIL, thread );
      $within_a_remote_opP$.bind( T, thread );
      if( NIL != op )
      {
        operation_communication.set_read_master_transcript_op_number( Numbers.add( ONE_INTEGER, operation_communication.read_master_transcript_op_number() ) );
        control_vars.$last_agenda_op$.setGlobalValue( op );
        if( NIL != control_vars.$ignore_remote_errors$.getDynamicValue( thread ) )
        {
          SubLObject error_message = NIL;
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym19$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                run_one_remote_op_internal( op );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != error_message )
          {
            Errors.warn( $str20$_A, error_message );
          }
        }
        else
        {
          run_one_remote_op_internal( op );
        }
      }
    }
    finally
    {
      $within_a_remote_opP$.rebind( _prev_bind_3, thread );
      control_vars.$use_transcriptP$.rebind( _prev_bind_2, thread );
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 13861L)
  public static SubLObject run_one_remote_op_internal(final SubLObject op)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject form = api_op_to_form( op );
      if( NIL != form )
      {
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding( thread );
        try
        {
          Errors.$continue_cerrorP$.bind( T, thread );
          try
          {
            process_utilities.current_process_note_form( form );
            eval_in_api.cyc_api_eval( form );
          }
          finally
          {
            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              process_utilities.current_process_clear_form();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
            }
          }
          operation_communication.set_total_master_transcript_operations_processed( Numbers.add( ONE_INTEGER, operation_communication.total_master_transcript_operations_processed() ) );
        }
        finally
        {
          Errors.$continue_cerrorP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        operation_communication.set_total_remote_operations_run( Numbers.add( ONE_INTEGER, operation_communication.total_remote_operations_run() ) );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 14534L)
  public static SubLObject add_to_auxiliary_queue(final SubLObject form)
  {
    auxiliary_queue_enqueue( conses_high.fourth( form ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 14732L)
  public static SubLObject run_one_auxiliary_op()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject op = NIL;
    op = auxiliary_queue_dequeue();
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      control_vars.$use_transcriptP$.bind( NIL, thread );
      if( NIL != op )
      {
        control_vars.$last_agenda_op$.setGlobalValue( op );
        final SubLObject form = api_op_to_form( op );
        if( NIL != form )
        {
          try
          {
            process_utilities.current_process_note_form( form );
            eval_in_api.cyc_api_eval( form );
          }
          finally
          {
            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              process_utilities.current_process_clear_form();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
            }
          }
          operation_communication.inc_total_auxiliary_operations_run();
        }
      }
    }
    finally
    {
      control_vars.$use_transcriptP$.rebind( _prev_bind_2, thread );
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15177L)
  public static SubLObject possibly_add_to_transcript_queue(final SubLObject encapsulated_form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$use_transcriptP$.getDynamicValue( thread ) )
    {
      return add_to_transcript_queue( encapsulated_form );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15430L)
  public static SubLObject add_to_transcript_queue(final SubLObject encapsulated_form)
  {
    transcript_queue_enqueue( ConsesLow.list( encapsulation.encapsulate( operation_communication.the_cyclist() ), control_vars.cyc_image_id(), numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ),
        encapsulated_form ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 16217L)
  public static SubLObject hl_transcript_formP(final SubLObject form)
  {
    if( form.isCons() )
    {
      final SubLObject operator = form.first();
      if( NIL == subl_promotions.memberP( operator, $hl_transcript_special_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 16459L)
  public static SubLObject add_to_hl_transcript_queue(final SubLObject encapsulated_form)
  {
    hl_transcript_queue_enqueue( ConsesLow.list( encapsulation.encapsulate( operation_communication.the_cyclist() ), control_vars.cyc_image_id(), numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ),
        encapsulated_form ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 16681L)
  public static SubLObject api_op_to_form(SubLObject api_op)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject form = NIL;
    final SubLObject _prev_bind_0 = control_vars.$unencapsulating_within_agenda$.currentBinding( thread );
    try
    {
      control_vars.$unencapsulating_within_agenda$.bind( T, thread );
      try
      {
        thread.throwStack.push( $kw22$UNENCAPSULATION_ERROR );
        form = encapsulation.unencapsulate( api_op );
      }
      catch( final Throwable ccatch_env_var )
      {
        api_op = Errors.handleThrowable( ccatch_env_var, $kw22$UNENCAPSULATION_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      control_vars.$unencapsulating_within_agenda$.rebind( _prev_bind_0, thread );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 17059L)
  public static SubLObject form_to_api_op(final SubLObject form)
  {
    final SubLObject info = cyc_bookkeeping.cyc_bookkeeping_info();
    if( NIL != info )
    {
      return encapsulation.encapsulate( ConsesLow.list( $sym23$WITH_BOOKKEEPING_INFO, ConsesLow.list( $sym24$QUOTE, info ), form ) );
    }
    return encapsulation.encapsulate( form );
  }

  public static SubLObject declare_operation_queues_file()
  {
    SubLFiles.declareFunction( me, "local_queue_size", "LOCAL-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_queue_empty", "LOCAL-QUEUE-EMPTY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_local_queue", "CLEAR-LOCAL-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_queue_enqueue", "LOCAL-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "local_queue_dequeue", "LOCAL-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_queue_peek", "LOCAL-QUEUE-PEEK", 0, 0, false );
    SubLFiles.declareFunction( me, "local_queue_contents", "LOCAL-QUEUE-CONTENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "local_queue", "LOCAL-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_local_queue", "SET-LOCAL-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_queue_size", "REMOTE-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "remote_queue_empty", "REMOTE-QUEUE-EMPTY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_remote_queue", "CLEAR-REMOTE-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "remote_queue_enqueue", "REMOTE-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "remote_queue_dequeue", "REMOTE-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "transcript_queue_size", "TRANSCRIPT-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "transcript_queue_empty", "TRANSCRIPT-QUEUE-EMPTY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_transcript_queue", "CLEAR-TRANSCRIPT-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "transcript_queue_enqueue", "TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "transcript_queue_dequeue", "TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_transcript_queue_size", "HL-TRANSCRIPT-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_transcript_queue_emptyP", "HL-TRANSCRIPT-QUEUE-EMPTY?", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_hl_transcript_queue", "CLEAR-HL-TRANSCRIPT-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_transcript_queue_enqueue", "HL-TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_transcript_queue_dequeue", "HL-TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_queue_size", "AUXILIARY-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_queue_empty", "AUXILIARY-QUEUE-EMPTY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_auxiliary_queue", "CLEAR-AUXILIARY-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_queue_enqueue", "AUXILIARY-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_queue_dequeue", "AUXILIARY-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_queue_peek", "AUXILIARY-QUEUE-PEEK", 0, 0, false );
    SubLFiles.declareFunction( me, "transmit_queue_size", "TRANSMIT-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "transmit_queue_empty", "TRANSMIT-QUEUE-EMPTY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_transmit_queue", "CLEAR-TRANSMIT-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "transmit_queue_enqueue", "TRANSMIT-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "transmit_queue_dequeue", "TRANSMIT-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "transmit_queue_peek_chunk", "TRANSMIT-QUEUE-PEEK-CHUNK", 1, 0, false );
    SubLFiles.declareFunction( me, "transmit_queue_remove_chunk", "TRANSMIT-QUEUE-REMOVE-CHUNK", 1, 0, false );
    SubLFiles.declareFunction( me, "local_operation_storage_queue_size", "LOCAL-OPERATION-STORAGE-QUEUE-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_operation_storage_queue_empty", "LOCAL-OPERATION-STORAGE-QUEUE-EMPTY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_local_operation_storage_queue", "CLEAR-LOCAL-OPERATION-STORAGE-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_operation_storage_queue_enqueue", "LOCAL-OPERATION-STORAGE-QUEUE-ENQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "local_operation_storage_queue_dequeue", "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_operation_storage_queue_contents", "LOCAL-OPERATION-STORAGE-QUEUE-CONTENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "local_operations_anywhere", "LOCAL-OPERATIONS-ANYWHERE", 0, 0, false );
    SubLFiles.declareFunction( me, "all_internal_queue_sizes", "ALL-INTERNAL-QUEUE-SIZES", 0, 0, false );
    SubLFiles.declareFunction( me, "wait_for_queues_to_finish", "WAIT-FOR-QUEUES-TO-FINISH", 1, 0, false );
    SubLFiles.declareFunction( me, "add_to_local_queue", "ADD-TO-LOCAL-QUEUE", 1, 1, false );
    SubLFiles.declareFunction( me, "run_one_local_op", "RUN-ONE-LOCAL-OP", 0, 0, false );
    SubLFiles.declareFunction( me, "add_to_remote_queue", "ADD-TO-REMOTE-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "within_a_remote_opP", "WITHIN-A-REMOTE-OP?", 0, 0, false );
    SubLFiles.declareFunction( me, "run_one_remote_op", "RUN-ONE-REMOTE-OP", 0, 0, false );
    SubLFiles.declareFunction( me, "run_one_remote_op_internal", "RUN-ONE-REMOTE-OP-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "add_to_auxiliary_queue", "ADD-TO-AUXILIARY-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "run_one_auxiliary_op", "RUN-ONE-AUXILIARY-OP", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_add_to_transcript_queue", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_to_transcript_queue", "ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_transcript_formP", "HL-TRANSCRIPT-FORM?", 1, 0, false );
    SubLFiles.declareFunction( me, "add_to_hl_transcript_queue", "ADD-TO-HL-TRANSCRIPT-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "api_op_to_form", "API-OP-TO-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "form_to_api_op", "FORM-TO-API-OP", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_operation_queues_file()
  {
    $local_queue$ = SubLFiles.deflexical( "*LOCAL-QUEUE*", maybeDefault( $sym0$_LOCAL_QUEUE_, $local_queue$, () -> ( queues.create_queue( UNPROVIDED ) ) ) );
    $local_queue_lock$ = SubLFiles.defparameter( "*LOCAL-QUEUE-LOCK*", Locks.make_lock( $str1$Local_Queue_Lock ) );
    $remote_queue$ = SubLFiles.deflexical( "*REMOTE-QUEUE*", maybeDefault( $sym3$_REMOTE_QUEUE_, $remote_queue$, () -> ( queues.create_queue( UNPROVIDED ) ) ) );
    $remote_queue_lock$ = SubLFiles.defparameter( "*REMOTE-QUEUE-LOCK*", Locks.make_lock( $str4$Remote_Queue_Lock ) );
    $transcript_queue$ = SubLFiles.deflexical( "*TRANSCRIPT-QUEUE*", maybeDefault( $sym5$_TRANSCRIPT_QUEUE_, $transcript_queue$, () -> ( queues.create_queue( UNPROVIDED ) ) ) );
    $transcript_queue_lock$ = SubLFiles.defparameter( "*TRANSCRIPT-QUEUE-LOCK*", Locks.make_lock( $str6$Transcript_Queue_Lock ) );
    $hl_transcript_queue$ = SubLFiles.deflexical( "*HL-TRANSCRIPT-QUEUE*", maybeDefault( $sym7$_HL_TRANSCRIPT_QUEUE_, $hl_transcript_queue$, () -> ( queues.create_queue( UNPROVIDED ) ) ) );
    $hl_transcript_queue_lock$ = SubLFiles.defparameter( "*HL-TRANSCRIPT-QUEUE-LOCK*", Locks.make_lock( $str8$HL_Transcript_Queue_Lock ) );
    $auxiliary_queue$ = SubLFiles.deflexical( "*AUXILIARY-QUEUE*", maybeDefault( $sym9$_AUXILIARY_QUEUE_, $auxiliary_queue$, () -> ( queues.create_queue( UNPROVIDED ) ) ) );
    $auxiliary_queue_lock$ = SubLFiles.defparameter( "*AUXILIARY-QUEUE-LOCK*", Locks.make_lock( $str10$Auxiliary_Queue_Lock ) );
    $transmit_queue$ = SubLFiles.deflexical( "*TRANSMIT-QUEUE*", maybeDefault( $sym11$_TRANSMIT_QUEUE_, $transmit_queue$, () -> ( queues.create_queue( UNPROVIDED ) ) ) );
    $transmit_queue_lock$ = SubLFiles.defparameter( "*TRANSMIT-QUEUE-LOCK*", Locks.make_lock( $str12$Transmit_Queue_Lock ) );
    $local_operation_storage_queue$ = SubLFiles.deflexical( "*LOCAL-OPERATION-STORAGE-QUEUE*", maybeDefault( $sym14$_LOCAL_OPERATION_STORAGE_QUEUE_, $local_operation_storage_queue$, () -> ( queues.create_queue(
        UNPROVIDED ) ) ) );
    $local_operation_storage_queue_lock$ = SubLFiles.defparameter( "*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", Locks.make_lock( $str15$Local_Operation_Queue_Lock ) );
    $within_a_remote_opP$ = SubLFiles.defparameter( "*WITHIN-A-REMOTE-OP?*", NIL );
    $hl_transcripts_enabledP$ = SubLFiles.defparameter( "*HL-TRANSCRIPTS-ENABLED?*", NIL );
    $hl_transcript_special_operators$ = SubLFiles.deflexical( "*HL-TRANSCRIPT-SPECIAL-OPERATORS*", $list21 );
    return NIL;
  }

  public static SubLObject setup_operation_queues_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_LOCAL_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym3$_REMOTE_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym5$_TRANSCRIPT_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym7$_HL_TRANSCRIPT_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym9$_AUXILIARY_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym11$_TRANSMIT_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym14$_LOCAL_OPERATION_STORAGE_QUEUE_ );
    access_macros.register_external_symbol( $sym16$ALL_INTERNAL_QUEUE_SIZES );
    access_macros.register_external_symbol( $sym17$WAIT_FOR_QUEUES_TO_FINISH );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_operation_queues_file();
  }

  @Override
  public void initializeVariables()
  {
    init_operation_queues_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_operation_queues_file();
  }
  static
  {
    me = new operation_queues();
    $local_queue$ = null;
    $local_queue_lock$ = null;
    $remote_queue$ = null;
    $remote_queue_lock$ = null;
    $transcript_queue$ = null;
    $transcript_queue_lock$ = null;
    $hl_transcript_queue$ = null;
    $hl_transcript_queue_lock$ = null;
    $auxiliary_queue$ = null;
    $auxiliary_queue_lock$ = null;
    $transmit_queue$ = null;
    $transmit_queue_lock$ = null;
    $local_operation_storage_queue$ = null;
    $local_operation_storage_queue_lock$ = null;
    $within_a_remote_opP$ = null;
    $hl_transcripts_enabledP$ = null;
    $hl_transcript_special_operators$ = null;
    $sym0$_LOCAL_QUEUE_ = makeSymbol( "*LOCAL-QUEUE*" );
    $str1$Local_Queue_Lock = makeString( "Local Queue Lock" );
    $str2$Local_queue_being_overwritten___A = makeString( "Local queue being overwritten, ~A operations lost" );
    $sym3$_REMOTE_QUEUE_ = makeSymbol( "*REMOTE-QUEUE*" );
    $str4$Remote_Queue_Lock = makeString( "Remote Queue Lock" );
    $sym5$_TRANSCRIPT_QUEUE_ = makeSymbol( "*TRANSCRIPT-QUEUE*" );
    $str6$Transcript_Queue_Lock = makeString( "Transcript Queue Lock" );
    $sym7$_HL_TRANSCRIPT_QUEUE_ = makeSymbol( "*HL-TRANSCRIPT-QUEUE*" );
    $str8$HL_Transcript_Queue_Lock = makeString( "HL Transcript Queue Lock" );
    $sym9$_AUXILIARY_QUEUE_ = makeSymbol( "*AUXILIARY-QUEUE*" );
    $str10$Auxiliary_Queue_Lock = makeString( "Auxiliary Queue Lock" );
    $sym11$_TRANSMIT_QUEUE_ = makeSymbol( "*TRANSMIT-QUEUE*" );
    $str12$Transmit_Queue_Lock = makeString( "Transmit Queue Lock" );
    $str13$The_Transmit_Queue_contains_OP__A = makeString( "The Transmit Queue contains OP ~A, not the expected op ~A--out of sync." );
    $sym14$_LOCAL_OPERATION_STORAGE_QUEUE_ = makeSymbol( "*LOCAL-OPERATION-STORAGE-QUEUE*" );
    $str15$Local_Operation_Queue_Lock = makeString( "Local Operation Queue Lock" );
    $sym16$ALL_INTERNAL_QUEUE_SIZES = makeSymbol( "ALL-INTERNAL-QUEUE-SIZES" );
    $sym17$WAIT_FOR_QUEUES_TO_FINISH = makeSymbol( "WAIT-FOR-QUEUES-TO-FINISH" );
    $sym18$STRINGP = makeSymbol( "STRINGP" );
    $sym19$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str20$_A = makeString( "~A" );
    $list21 = ConsesLow.list( makeSymbol( "FI-ASSERT" ), makeSymbol( "FI-UNASSERT" ), makeSymbol( "FI-BLAST" ), makeSymbol( "FI-TIMESTAMP-CONSTANT" ), makeSymbol( "FI-TIMESTAMP-ASSERTION" ) );
    $kw22$UNENCAPSULATION_ERROR = makeKeyword( "UNENCAPSULATION-ERROR" );
    $sym23$WITH_BOOKKEEPING_INFO = makeSymbol( "WITH-BOOKKEEPING-INFO" );
    $sym24$QUOTE = makeSymbol( "QUOTE" );
  }
}
/*
 * 
 * Total time: 264 ms
 * 
 */