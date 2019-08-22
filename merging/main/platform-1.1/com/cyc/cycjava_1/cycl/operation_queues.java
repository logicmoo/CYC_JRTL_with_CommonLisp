/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_bookkeeping;
//dm import com.cyc.cycjava_1.cycl.encapsulation;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class operation_queues extends SubLTranslatedFile {

  //// Constructor

  private operation_queues() {}
  public static final SubLFile me = new operation_queues();
  public static final String myName = "com.cyc.cycjava_1.cycl.operation_queues";

  //// Definitions

  /** A queue for local operations that need to be processed by the agenda. */
  @SubL(source = "cycl/operation-queues.lisp", position = 380) 
  private static SubLSymbol $local_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 1886) 
  public static SubLSymbol $local_queue_lock$ = null;

  /** Return T iff there are no local operations pending. */
  @SubL(source = "cycl/operation-queues.lisp", position = 2081) 
  public static final SubLObject local_queue_empty() {
    return queues.queue_empty_p($local_queue$.getGlobalValue());
  }

  /** A queue for operations that are loaded from the master transcript and need to be processed. */
  @SubL(source = "cycl/operation-queues.lisp", position = 3385) 
  public static SubLSymbol $remote_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 3673) 
  public static SubLSymbol $remote_queue_lock$ = null;

  /** A queue for storing operations that have been processed
but need to be written to a transcript. */
  @SubL(source = "cycl/operation-queues.lisp", position = 4320) 
  public static SubLSymbol $transcript_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 4622) 
  public static SubLSymbol $transcript_queue_lock$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 4698) 
  public static final SubLObject transcript_queue_size() {
    return queues.queue_size($transcript_queue$.getGlobalValue());
  }

  @SubL(source = "cycl/operation-queues.lisp", position = 4781) 
  public static final SubLObject transcript_queue_empty() {
    return queues.queue_empty_p($transcript_queue$.getGlobalValue());
  }

  @SubL(source = "cycl/operation-queues.lisp", position = 5003) 
  public static final SubLObject transcript_queue_enqueue(SubLObject operation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject lock = $transcript_queue_lock$.getDynamicValue(thread);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          queues.enqueue(operation, $transcript_queue$.getGlobalValue());
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return NIL;
    }
  }


  @SubL(source = "cycl/operation-queues.lisp", position = 10108) 
  public static final SubLObject add_to_local_queue(SubLObject form, SubLObject encapsulateP) {
    if ((encapsulateP == UNPROVIDED)) {
      encapsulateP = T;
    }
    {
      SubLObject api_op = ((NIL != encapsulateP) ? ((SubLObject) form_to_api_op(form)) : form);
      local_queue_enqueue(api_op);
      return T;
    }
  }


  /** Add bookkeeping info (if any) and other context to FORM,
   then encapsulate it so it is externalizable. */
  @SubL(source = "cycl/operation-queues.lisp", position = 14898) 
  public static final SubLObject form_to_api_op(SubLObject form) {
    {
      SubLObject info = cyc_bookkeeping.cyc_bookkeeping_info();
      if ((NIL != info)) {
        return encapsulation.encapsulate(list($sym19$WITH_BOOKKEEPING_INFO, list($sym20$QUOTE, info), form));
      } else {
        return encapsulation.encapsulate(form);
      }
    }
  }


  @SubL(source = "cycl/operation-queues.lisp", position = 2400) 
  public static final SubLObject local_queue_enqueue(SubLObject operation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          queues.enqueue(operation, $local_queue$.getGlobalValue());
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/operation-queues.lisp", position = 5157) 
  public static final SubLObject transcript_queue_dequeue() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        SubLObject lock = $transcript_queue_lock$.getDynamicValue(thread);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          ans = queues.dequeue($transcript_queue$.getGlobalValue());
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return ans;
      }
    }
  }

  /** A queue for storing operations that have been processed
but need to be written to an HL transcript. */
  @SubL(source = "cycl/operation-queues.lisp", position = 5329) 
  public static SubLSymbol $hl_transcript_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 5642) 
  public static SubLSymbol $hl_transcript_queue_lock$ = null;

  /** A queue for loading separate stand-alone transcript files,
and for other (yet to be specified) uses. */
  @SubL(source = "cycl/operation-queues.lisp", position = 6395) 
  public static SubLSymbol $auxiliary_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 6701) 
  public static SubLSymbol $auxiliary_queue_lock$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 6856) 
  public static final SubLObject auxiliary_queue_empty() {
    return queues.queue_empty_p($auxiliary_queue$.getGlobalValue());
  }

  /** A queue for storing operations that need to be sent to the master transcript. */
  @SubL(source = "cycl/operation-queues.lisp", position = 7393) 
  public static SubLSymbol $transmit_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 7673) 
  public static SubLSymbol $transmit_queue_lock$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 7745) 
  public static final SubLObject transmit_queue_size() {
    return queues.queue_size($transmit_queue$.getGlobalValue());
  }

  @SubL(source = "cycl/operation-queues.lisp", position = 7824) 
  public static final SubLObject transmit_queue_empty() {
    return queues.queue_empty_p($transmit_queue$.getGlobalValue());
  }

  /** A queue for storing operations while in storing mode */
  @SubL(source = "cycl/operation-queues.lisp", position = 8350) 
  public static SubLSymbol $local_operation_storage_queue$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 8635) 
  public static SubLSymbol $local_operation_storage_queue_lock$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 8950) 
  public static final SubLObject clear_local_operation_storage_queue() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject lock = $local_operation_storage_queue_lock$.getDynamicValue(thread);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          queues.clear_queue($local_operation_storage_queue$.getGlobalValue());
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return T;
    }
  }

  @SubL(source = "cycl/operation-queues.lisp", position = 9125) 
  public static final SubLObject local_operation_storage_queue_enqueue(SubLObject operation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject lock = $local_operation_storage_queue_lock$.getDynamicValue(thread);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          queues.enqueue(operation, $local_operation_storage_queue$.getGlobalValue());
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/operation-queues.lisp", position = 11108) 
  public static SubLSymbol $within_a_remote_opP$ = null;

  @SubL(source = "cycl/operation-queues.lisp", position = 13168) 
  public static final SubLObject add_to_transcript_queue(SubLObject encapsulated_form) {
    transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), control_vars.cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
    return T;
  }

  /** Do we support HL transcripts?  Currently (11/04) HL transcript support is experimental,
   so this should be left as NIL. */
  @SubL(source = "cycl/operation-queues.lisp", position = 13476) 
  public static SubLSymbol $hl_transcripts_enabledP$ = null;

  /** Operators that are handled differently in HL transcripts than EL transcripts,
and so should not be straightforwardly written to the HL transcript */
  @SubL(source = "cycl/operation-queues.lisp", position = 13767) 
  private static SubLSymbol $hl_transcript_special_operators$ = null;

  public static final SubLObject declare_operation_queues_file() {
    declareFunction("local_queue_size", "LOCAL-QUEUE-SIZE", 0, 0, false);
    declareFunction("local_queue_empty", "LOCAL-QUEUE-EMPTY", 0, 0, false);
    declareFunction("clear_local_queue", "CLEAR-LOCAL-QUEUE", 0, 0, false);
    declareFunction("local_queue_enqueue", "LOCAL-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("local_queue_dequeue", "LOCAL-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("local_queue_peek", "LOCAL-QUEUE-PEEK", 0, 0, false);
    declareFunction("local_queue_contents", "LOCAL-QUEUE-CONTENTS", 0, 0, false);
    declareFunction("local_queue", "LOCAL-QUEUE", 0, 0, false);
    declareFunction("set_local_queue", "SET-LOCAL-QUEUE", 1, 0, false);
    declareFunction("remote_queue_size", "REMOTE-QUEUE-SIZE", 0, 0, false);
    declareFunction("remote_queue_empty", "REMOTE-QUEUE-EMPTY", 0, 0, false);
    declareFunction("clear_remote_queue", "CLEAR-REMOTE-QUEUE", 0, 0, false);
    declareFunction("remote_queue_enqueue", "REMOTE-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("remote_queue_dequeue", "REMOTE-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("transcript_queue_size", "TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
    declareFunction("transcript_queue_empty", "TRANSCRIPT-QUEUE-EMPTY", 0, 0, false);
    declareFunction("clear_transcript_queue", "CLEAR-TRANSCRIPT-QUEUE", 0, 0, false);
    declareFunction("transcript_queue_enqueue", "TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("transcript_queue_dequeue", "TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("hl_transcript_queue_size", "HL-TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
    declareFunction("hl_transcript_queue_emptyP", "HL-TRANSCRIPT-QUEUE-EMPTY?", 0, 0, false);
    declareFunction("clear_hl_transcript_queue", "CLEAR-HL-TRANSCRIPT-QUEUE", 0, 0, false);
    declareFunction("hl_transcript_queue_enqueue", "HL-TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("hl_transcript_queue_dequeue", "HL-TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("auxiliary_queue_size", "AUXILIARY-QUEUE-SIZE", 0, 0, false);
    declareFunction("auxiliary_queue_empty", "AUXILIARY-QUEUE-EMPTY", 0, 0, false);
    declareFunction("clear_auxiliary_queue", "CLEAR-AUXILIARY-QUEUE", 0, 0, false);
    declareFunction("auxiliary_queue_enqueue", "AUXILIARY-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("auxiliary_queue_dequeue", "AUXILIARY-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("transmit_queue_size", "TRANSMIT-QUEUE-SIZE", 0, 0, false);
    declareFunction("transmit_queue_empty", "TRANSMIT-QUEUE-EMPTY", 0, 0, false);
    declareFunction("clear_transmit_queue", "CLEAR-TRANSMIT-QUEUE", 0, 0, false);
    declareFunction("transmit_queue_enqueue", "TRANSMIT-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("transmit_queue_dequeue", "TRANSMIT-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("local_operation_storage_queue_size", "LOCAL-OPERATION-STORAGE-QUEUE-SIZE", 0, 0, false);
    declareFunction("local_operation_storage_queue_empty", "LOCAL-OPERATION-STORAGE-QUEUE-EMPTY", 0, 0, false);
    declareFunction("clear_local_operation_storage_queue", "CLEAR-LOCAL-OPERATION-STORAGE-QUEUE", 0, 0, false);
    declareFunction("local_operation_storage_queue_enqueue", "LOCAL-OPERATION-STORAGE-QUEUE-ENQUEUE", 1, 0, false);
    declareFunction("local_operation_storage_queue_dequeue", "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE", 0, 0, false);
    declareFunction("local_operation_storage_queue_contents", "LOCAL-OPERATION-STORAGE-QUEUE-CONTENTS", 0, 0, false);
    declareFunction("local_operations_anywhere", "LOCAL-OPERATIONS-ANYWHERE", 0, 0, false);
    declareFunction("add_to_local_queue", "ADD-TO-LOCAL-QUEUE", 1, 1, false);
    declareFunction("run_one_local_op", "RUN-ONE-LOCAL-OP", 0, 0, false);
    declareFunction("add_to_remote_queue", "ADD-TO-REMOTE-QUEUE", 1, 0, false);
    declareFunction("within_a_remote_opP", "WITHIN-A-REMOTE-OP?", 0, 0, false);
    declareFunction("run_one_remote_op", "RUN-ONE-REMOTE-OP", 0, 0, false);
    declareFunction("run_one_remote_op_internal", "RUN-ONE-REMOTE-OP-INTERNAL", 1, 0, false);
    declareFunction("add_to_auxiliary_queue", "ADD-TO-AUXILIARY-QUEUE", 1, 0, false);
    declareFunction("run_one_auxiliary_op", "RUN-ONE-AUXILIARY-OP", 0, 0, false);
    declareFunction("add_to_transcript_queue", "ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
    declareFunction("hl_transcript_formP", "HL-TRANSCRIPT-FORM?", 1, 0, false);
    declareFunction("add_to_hl_transcript_queue", "ADD-TO-HL-TRANSCRIPT-QUEUE", 1, 0, false);
    declareFunction("api_op_to_form", "API-OP-TO-FORM", 1, 0, false);
    declareFunction("form_to_api_op", "FORM-TO-API-OP", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_operation_queues_file() {
    $local_queue$ = deflexical("*LOCAL-QUEUE*", maybeDefault( $sym0$_LOCAL_QUEUE_, $local_queue$, ()-> (queues.create_queue())));
    $local_queue_lock$ = defparameter("*LOCAL-QUEUE-LOCK*", Locks.make_lock($str1$Local_Queue_Lock));
    $remote_queue$ = deflexical("*REMOTE-QUEUE*", maybeDefault( $sym3$_REMOTE_QUEUE_, $remote_queue$, ()-> (queues.create_queue())));
    $remote_queue_lock$ = defparameter("*REMOTE-QUEUE-LOCK*", Locks.make_lock($str4$Remote_Queue_Lock));
    $transcript_queue$ = deflexical("*TRANSCRIPT-QUEUE*", maybeDefault( $sym5$_TRANSCRIPT_QUEUE_, $transcript_queue$, ()-> (queues.create_queue())));
    $transcript_queue_lock$ = defparameter("*TRANSCRIPT-QUEUE-LOCK*", Locks.make_lock($str6$Transcript_Queue_Lock));
    $hl_transcript_queue$ = deflexical("*HL-TRANSCRIPT-QUEUE*", maybeDefault( $sym7$_HL_TRANSCRIPT_QUEUE_, $hl_transcript_queue$, ()-> (queues.create_queue())));
    $hl_transcript_queue_lock$ = defparameter("*HL-TRANSCRIPT-QUEUE-LOCK*", Locks.make_lock($str8$HL_Transcript_Queue_Lock));
    $auxiliary_queue$ = deflexical("*AUXILIARY-QUEUE*", maybeDefault( $sym9$_AUXILIARY_QUEUE_, $auxiliary_queue$, ()-> (queues.create_queue())));
    $auxiliary_queue_lock$ = defparameter("*AUXILIARY-QUEUE-LOCK*", Locks.make_lock($str10$Auxiliary_Queue_Lock));
    $transmit_queue$ = deflexical("*TRANSMIT-QUEUE*", maybeDefault( $sym11$_TRANSMIT_QUEUE_, $transmit_queue$, ()-> (queues.create_queue())));
    $transmit_queue_lock$ = defparameter("*TRANSMIT-QUEUE-LOCK*", Locks.make_lock($str12$Transmit_Queue_Lock));
    $local_operation_storage_queue$ = deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", maybeDefault( $sym13$_LOCAL_OPERATION_STORAGE_QUEUE_, $local_operation_storage_queue$, ()-> (queues.create_queue())));
    $local_operation_storage_queue_lock$ = defparameter("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", Locks.make_lock($str14$Local_Operation_Queue_Lock));
    $within_a_remote_opP$ = defparameter("*WITHIN-A-REMOTE-OP?*", NIL);
    $hl_transcripts_enabledP$ = defparameter("*HL-TRANSCRIPTS-ENABLED?*", NIL);
    $hl_transcript_special_operators$ = deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", $list17);
    return NIL;
  }

  public static final SubLObject setup_operation_queues_file() {
        subl_macro_promotions.declare_defglobal($sym0$_LOCAL_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym3$_REMOTE_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym5$_TRANSCRIPT_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym7$_HL_TRANSCRIPT_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym9$_AUXILIARY_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym11$_TRANSMIT_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym13$_LOCAL_OPERATION_STORAGE_QUEUE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_LOCAL_QUEUE_ = makeSymbol("*LOCAL-QUEUE*");
  public static final SubLString $str1$Local_Queue_Lock = makeString("Local Queue Lock");
  public static final SubLString $str2$Local_queue_being_overwritten___A = makeString("Local queue being overwritten, ~A operations lost");
  public static final SubLSymbol $sym3$_REMOTE_QUEUE_ = makeSymbol("*REMOTE-QUEUE*");
  public static final SubLString $str4$Remote_Queue_Lock = makeString("Remote Queue Lock");
  public static final SubLSymbol $sym5$_TRANSCRIPT_QUEUE_ = makeSymbol("*TRANSCRIPT-QUEUE*");
  public static final SubLString $str6$Transcript_Queue_Lock = makeString("Transcript Queue Lock");
  public static final SubLSymbol $sym7$_HL_TRANSCRIPT_QUEUE_ = makeSymbol("*HL-TRANSCRIPT-QUEUE*");
  public static final SubLString $str8$HL_Transcript_Queue_Lock = makeString("HL Transcript Queue Lock");
  public static final SubLSymbol $sym9$_AUXILIARY_QUEUE_ = makeSymbol("*AUXILIARY-QUEUE*");
  public static final SubLString $str10$Auxiliary_Queue_Lock = makeString("Auxiliary Queue Lock");
  public static final SubLSymbol $sym11$_TRANSMIT_QUEUE_ = makeSymbol("*TRANSMIT-QUEUE*");
  public static final SubLString $str12$Transmit_Queue_Lock = makeString("Transmit Queue Lock");
  public static final SubLSymbol $sym13$_LOCAL_OPERATION_STORAGE_QUEUE_ = makeSymbol("*LOCAL-OPERATION-STORAGE-QUEUE*");
  public static final SubLString $str14$Local_Operation_Queue_Lock = makeString("Local Operation Queue Lock");
  public static final SubLSymbol $sym15$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str16$_A = makeString("~A");
  public static final SubLList $list17 = list(makeSymbol("FI-ASSERT"), makeSymbol("FI-UNASSERT"), makeSymbol("FI-BLAST"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));
  public static final SubLSymbol $kw18$UNENCAPSULATION_ERROR = makeKeyword("UNENCAPSULATION-ERROR");
  public static final SubLSymbol $sym19$WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");
  public static final SubLSymbol $sym20$QUOTE = makeSymbol("QUOTE");

  //// Initializers

  public void declareFunctions() {
    declare_operation_queues_file();
  }

  public void initializeVariables() {
    init_operation_queues_file();
  }

  public void runTopLevelForms() {
    setup_operation_queues_file();
  }

}
