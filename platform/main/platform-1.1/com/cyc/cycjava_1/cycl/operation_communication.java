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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.agenda;
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.encapsulation;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_queues;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_info;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.transcript_server;
//dm import com.cyc.cycjava_1.cycl.transcript_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class operation_communication extends SubLTranslatedFile {

  //// Constructor

  private operation_communication() {}
  public static final SubLFile me = new operation_communication();
  public static final String myName = "com.cyc.cycjava_1.cycl.operation_communication";

  //// Definitions

  @SubL(source = "cycl/operation-communication.lisp", position = 431) 
  public static SubLSymbol $all_communication_modes$ = null;

  /** Is this image allowed to transmit.  As of now, 4/24/98, there are only 3 reasons for this to be nil.  One, the image is an experimental image.  See *experimental-image*.  Two, the image has connected to the transcript server and requested a transcript that has been CLOSED.  Three, the image has read through a master transcript and evaluated the CLOSE-KB operation and the defvar *auto-increment-kb* is nil. */
  @SubL(source = "cycl/operation-communication.lisp", position = 852) 
  public static SubLSymbol $allow_transmitting$ = null;

  /** Accessor for *allow-transmitting* */
  @SubL(source = "cycl/operation-communication.lisp", position = 1301) 
  public static final SubLObject allow_transmitting() {
    return $allow_transmitting$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 1571) 
  public static SubLSymbol $kb_full_transcript_loaded$ = null;

  /** Boolean: If T, then this image can not transmit operations.  This parameter should only be set at start up time.  It is intended to provide an image that can not transmit operations to the master transcript.  It is closely tied to *allow-transmitting* and its accessor functions.  For more info see *allow-transmitting*. */
  @SubL(source = "cycl/operation-communication.lisp", position = 1936) 
  public static SubLSymbol $experimental_image$ = null;

  /** The max number of read-transcript ops to load at once */
  @SubL(source = "cycl/operation-communication.lisp", position = 3078) 
  public static SubLSymbol $read_transcript_op_limit$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 3396) 
  public static final SubLObject dont_record_operations_locally() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return system_parameters.$dont_record_operations_locally$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 3694) 
  public static SubLSymbol $receiving_remote_operationsP$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 3741) 
  public static final SubLObject receiving_remote_operationsP() {
    return $receiving_remote_operationsP$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 3914) 
  public static final SubLObject set_receiving_remote_operationsP(SubLObject v_boolean) {
    $receiving_remote_operationsP$.setGlobalValue(v_boolean);
    return $receiving_remote_operationsP$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 4062) 
  public static SubLSymbol $process_local_operationsP$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 4106) 
  public static final SubLObject process_local_operationsP() {
    return $process_local_operationsP$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 4392) 
  public static SubLSymbol $process_auxiliary_operationsP$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 4440) 
  public static final SubLObject process_auxiliary_operationsP() {
    return $process_auxiliary_operationsP$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 4599) 
  public static final SubLObject set_process_auxiliary_operationsP(SubLObject v_boolean) {
    $process_auxiliary_operationsP$.setGlobalValue(v_boolean);
    return $process_auxiliary_operationsP$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 4750) 
  public static SubLSymbol $saving_operationsP$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 4789) 
  public static final SubLObject saving_operationsP() {
    return $saving_operationsP$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 4908) 
  public static final SubLObject set_saving_operationsP(SubLObject v_boolean) {
    $saving_operationsP$.setGlobalValue(v_boolean);
    return $saving_operationsP$.getGlobalValue();
  }

  /** The number of successfully processed operations generated by a different image, and read from the master transcript. */
  @SubL(source = "cycl/operation-communication.lisp", position = 5026) 
  public static SubLSymbol $total_remote_operations_run$ = null;

  /** The number of operations that have been processed by the auxiliary queue. */
  @SubL(source = "cycl/operation-communication.lisp", position = 5419) 
  public static SubLSymbol $total_auxiliary_operations_run$ = null;

  /** The number of operations that have been processed and recorded
locally by this image.  This is cummulative over all time,
i.e. it is not reset when a new local transcript is started. */
  @SubL(source = "cycl/operation-communication.lisp", position = 5773) 
  public static SubLSymbol $total_local_operations_recorded$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 6101) 
  public static final SubLObject inc_total_local_operations_recorded() {
    $total_local_operations_recorded$.setGlobalValue(Numbers.add($total_local_operations_recorded$.getGlobalValue(), ONE_INTEGER));
    return $total_local_operations_recorded$.getGlobalValue();
  }

  /** The number of local operations that have been transmitted to the
master transcript by this image.  This is cummulative over all time,
i.e. it is not reset when a new local transcript is started. */
  @SubL(source = "cycl/operation-communication.lisp", position = 6242) 
  public static SubLSymbol $total_local_operations_transmitted$ = null;

  /** The number of operations that have been read from the master transcript by this image.
 The objective is to accurately mark exactly where in the master transcript we are.
 This variable is accessed via (kb-op-number).  It should NOT be directly accessed.
 Operations are counted in two places.  As they are removed from the remote-queue and
 are about to be processed.  And as they are dropped because they were from this image. */
  @SubL(source = "cycl/operation-communication.lisp", position = 6741) 
  public static SubLSymbol $read_master_transcript_op_number$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 7222) 
  public static final SubLObject read_master_transcript_op_number() {
    return $read_master_transcript_op_number$.getGlobalValue();
  }

  /** The number of operations that have been read from the master transcript by this image *and* processed. */
  @SubL(source = "cycl/operation-communication.lisp", position = 7476) 
  public static SubLSymbol $total_master_transcript_operations_processed$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 7957) 
  public static final SubLObject the_cyclist() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return api_control_vars.$the_cyclist$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 8325) 
  public static final SubLObject set_the_cyclist(SubLObject name) {
    if ((name == UNPROVIDED)) {
      name = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject fort = map_cyclist_name_to_cyclist_term(name);
        api_control_vars.$the_cyclist$.setDynamicValue(fort, thread);
        return api_control_vars.$the_cyclist$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 8489) 
  public static final SubLObject map_cyclist_name_to_cyclist_term(SubLObject name) {
    {
      SubLObject cyclist_term = (name.isString() ? ((SubLObject) fi.fi_find_int(name)) : ((NIL != forts.valid_fortP(name)) ? ((SubLObject) name) : NIL));
      if (((NIL != cyclist_term)
           && (NIL != kb_accessors.cyclistP(cyclist_term)))) {
        return cyclist_term;
      }
    }
    return $const19$Guest;
  }

  /** Determines whether the image requires authentication */
  @SubL(source = "cycl/operation-communication.lisp", position = 8947) 
  private static SubLSymbol $image_requires_authenticationP$ = null;

  /** The Application for which the user is being authenticated. */
  @SubL(source = "cycl/operation-communication.lisp", position = 9339) 
  public static SubLSymbol $cyclist_authenticating_app$ = null;

  /** The default MT for looking up the Cyclist authentication information. */
  @SubL(source = "cycl/operation-communication.lisp", position = 10432) 
  public static SubLSymbol $default_cyclist_authentication_mt$ = null;

  /** Return the current KB version, i.e. both KB number and number of master transcript operations performed. */
  @SubL(source = "cycl/operation-communication.lisp", position = 15650) 
  public static final SubLObject kb_version_string() {
    if (read_master_transcript_op_number().numG(ZERO_INTEGER)) {
      return PrintLow.format(NIL, $str51$_a__a, control_vars.kb_loaded(), read_master_transcript_op_number());
    } else {
      return PrintLow.format(NIL, $str52$_a, control_vars.kb_loaded());
    }
  }

  /** Accessor for *communication-mode*. */
  @SubL(source = "cycl/operation-communication.lisp", position = 17142) 
  public static final SubLObject communication_mode() {
    return control_vars.$communication_mode$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 17249) 
  public static final SubLObject set_communication_mode_internal(SubLObject mode) {
    control_vars.$communication_mode$.setGlobalValue(mode);
    return control_vars.$communication_mode$.getGlobalValue();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 17371) 
  public static final SubLObject set_communication_mode(SubLObject keyword) {
    if ((keyword == UNPROVIDED)) {
      keyword = $kw4$RECEIVE_ONLY;
    }
    checkType(keyword, $sym55$COMMUNICATION_MODE_);
    if ((NIL == control_vars.cyc_image_id())) {
      control_vars.set_cyc_image_id();
    }
    if ((communication_mode() != keyword)) {
      if ((NIL == transcript_utilities.master_transcript())) {
        transcript_utilities.set_master_transcript(UNPROVIDED);
      }
      if (((NIL != control_vars.$init_file_loadedP$.getGlobalValue())
           && (NIL != transcript_utilities.local_transcript()))) {
        save_transcript_ops();
      }
      {
        SubLObject pcase_var = keyword;
        if (pcase_var.eql($kw3$TRANSMIT_AND_RECEIVE)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12972");
        } else if (pcase_var.eql($kw5$TRANSMIT_ONLY)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12973");
        } else if (pcase_var.eql($kw6$DEAF)) {
          set_to_deaf();
        } else if (pcase_var.eql($kw56$DEAD)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12968");
        } else if (pcase_var.eql($kw57$DEAD_RECEIVE)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12969");
        } else {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12970");
        }
      }
    }
    return communication_mode();
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 18350) 
  private static SubLSymbol $transmit_states$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 18519) 
  private static SubLSymbol $receive_states$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 19572) 
  public static final SubLObject set_to_storing() {
    transcript_utilities.new_local_transcript();
    set_process_auxiliary_operationsP(T);
    set_saving_operationsP(T);
    control_vars.$use_transcriptP$.setDynamicValue(T);
    return NIL;
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 20057) 
  public static final SubLObject set_to_not_receiving() {
    set_receiving_remote_operationsP(NIL);
    return NIL;
  }

  /** Is the change in communication-mode going to change the way processed operations are handled? */
  @SubL(source = "cycl/operation-communication.lisp", position = 20152) 
  public static final SubLObject transmitting_changeP(SubLObject new_mode) {
    if (get_transmit_state(new_mode).equal(get_transmit_state(communication_mode()))) {
      return NIL;
    } else {
      return T;
    }
  }

  /** Is the change in communication-mode going to change the receive part of the mode? */
  @SubL(source = "cycl/operation-communication.lisp", position = 20420) 
  public static final SubLObject receiving_changeP(SubLObject new_mode) {
    if (get_receive_state(new_mode).equal(get_receive_state(communication_mode()))) {
      return NIL;
    } else {
      return T;
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 20919) 
  public static final SubLObject set_to_deaf() {
    if ((NIL != transmitting_changeP($kw6$DEAF))) {
      set_to_storing();
    }
    if ((NIL != receiving_changeP($kw6$DEAF))) {
      set_to_not_receiving();
    }
    set_communication_mode_internal($kw6$DEAF);
    return $kw6$DEAF;
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 22150) 
  public static final SubLObject transmittingP() {
    if ((communication_mode().equal($kw5$TRANSMIT_ONLY)
        || communication_mode().equal($kw3$TRANSMIT_AND_RECEIVE))) {
      return T;
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 22342) 
  public static final SubLObject storingP() {
    if ((communication_mode().equal($kw6$DEAF)
        || communication_mode().equal($kw4$RECEIVE_ONLY))) {
      return T;
    } else {
      return NIL;
    }
  }

  /** @return TRANSMIT-STATE-P */
  @SubL(source = "cycl/operation-communication.lisp", position = 22915) 
  public static final SubLObject get_transmit_state(SubLObject mode) {
    if ((mode == UNPROVIDED)) {
      mode = communication_mode();
    }
    {
      SubLObject state = NIL;
      if (((mode == $kw3$TRANSMIT_AND_RECEIVE)
          || (mode == $kw5$TRANSMIT_ONLY))) {
        state = $str64$transmit;
      } else if (((mode == $kw6$DEAF)
          || (mode == $kw4$RECEIVE_ONLY))) {
        state = $str65$store;
      } else if (((mode == $kw56$DEAD)
          || (mode == $kw57$DEAD_RECEIVE))) {
        state = $str66$none;
      } else {
        state = NIL;
      }
      return state;
    }
  }

  /** @return RECEIVE-STATE-P */
  @SubL(source = "cycl/operation-communication.lisp", position = 23345) 
  public static final SubLObject get_receive_state(SubLObject mode) {
    if ((mode == UNPROVIDED)) {
      mode = communication_mode();
    }
    {
      SubLObject state = NIL;
      if (((mode == $kw3$TRANSMIT_AND_RECEIVE)
          || (mode == $kw4$RECEIVE_ONLY)
          || (mode == $kw57$DEAD_RECEIVE))) {
        state = $str67$yes;
      } else if (((mode == $kw6$DEAF)
          || (mode == $kw5$TRANSMIT_ONLY)
          || (mode == $kw56$DEAD))) {
        state = $str68$no;
      } else {
        state = NIL;
      }
      return state;
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 26692) 
  public static SubLSymbol $build_request_email$ = null;

  /** This lock controls who actually gets to write to the transcript file, 
   since multiple threads could otherwise open the same file for appending
   and stomp all over each other. */
  @SubL(source = "cycl/operation-communication.lisp", position = 33648) 
  private static SubLSymbol $save_transcript_ops_lock$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 34120) 
  public static final SubLObject save_transcript_ops() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12960");
      }
      if ((NIL == operation_queues.transcript_queue_empty())) {
        {
          SubLObject lock = $save_transcript_ops_lock$.getDynamicValue(thread);
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            save_transcript_ops_internal(UNPROVIDED);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 34401) 
  public static final SubLObject save_transcript_ops_internal(SubLObject transcript_known_to_exist) {
    if ((transcript_known_to_exist == UNPROVIDED)) {
      transcript_known_to_exist = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject local_transcript = transcript_utilities.local_transcript();
        SubLObject direction = ((NIL != Filesys.probe_file(local_transcript)) ? ((SubLObject) $kw73$APPEND) : $kw74$OUTPUT);
        SubLObject stream = NIL;
        try {
          {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
              stream_macros.$stream_requires_locking$.bind(NIL, thread);
              stream = compatibility.open_text(local_transcript, direction);
            } finally {
              stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
          }
          if ((!(stream.isStream()))) {
            Errors.error($str75$Unable_to_open__S, local_transcript);
          }
          {
            SubLObject stream_2 = stream;
            if (stream_2.isStream()) {
              {
                SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = print_high.$print_length$.currentBinding(thread);
                try {
                  print_high.$print_level$.bind(NIL, thread);
                  print_high.$print_length$.bind(NIL, thread);
                  {
                    SubLObject op = NIL;
                    for (; (NIL == operation_queues.transcript_queue_empty()); ) {
                      op = operation_queues.transcript_queue_dequeue();
                      if (((NIL == dont_record_operations_locally())
                           && (NIL != storingP()))) {
                        PrintLow.format(stream_2, $str76$_s__, op);
                        operation_queues.local_operation_storage_queue_enqueue(op);
                        inc_total_local_operations_recorded();
                      }
                      if (((NIL != allow_transmitting())
                           && (NIL != transmittingP()))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22952");
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12946");
                      }
                    }
                  }
                } finally {
                  print_high.$print_length$.rebind(_prev_bind_1, thread);
                  print_high.$print_level$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        } finally {
          {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
              if (stream.isStream()) {
                streams_high.close(stream, UNPROVIDED);
              }
            } finally {
              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  /** This lock controls who actually gets to write to the hl-transcript file, 
   since multiple threads could otherwise open the same file for appending
   and stomp all over each other. */
  @SubL(source = "cycl/operation-communication.lisp", position = 35399) 
  private static SubLSymbol $save_hl_transcript_ops_lock$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 40507) 
  public static SubLSymbol $transcript_load_succeeded$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 40549) 
  public static SubLSymbol $transcript_read_attempted$ = null;

  @SubL(source = "cycl/operation-communication.lisp", position = 40593) 
  public static SubLSymbol $initial_read_transcript_size$ = null;

  /** Return T iff there are remote operations available to run. */
  @SubL(source = "cycl/operation-communication.lisp", position = 42864) 
  public static final SubLObject remote_operation_to_runP() {
    return makeBoolean(((NIL != receiving_remote_operationsP())
           && (NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22949"))));
  }

  @SubL(source = "cycl/operation-communication.lisp", position = 53875) 
  private static SubLSymbol $remote_operations_kb_check_point$ = null;

  public static final SubLObject declare_operation_communication_file() {
    declareFunction(myName, "allow_transmitting", "ALLOW-TRANSMITTING", 0, 0, false);
    //declareFunction(myName, "set_allow_transmitting", "SET-ALLOW-TRANSMITTING", 1, 0, false);
    //declareFunction(myName, "kb_full_transcript_loaded", "KB-FULL-TRANSCRIPT-LOADED", 0, 0, false);
    //declareFunction(myName, "set_kb_full_transcript_loaded", "SET-KB-FULL-TRANSCRIPT-LOADED", 1, 0, false);
    //declareFunction(myName, "experimental_image", "EXPERIMENTAL-IMAGE", 0, 0, false);
    //declareFunction(myName, "set_experimental_image", "SET-EXPERIMENTAL-IMAGE", 1, 0, false);
    //declareFunction(myName, "read_transcript_op_limit", "READ-TRANSCRIPT-OP-LIMIT", 0, 0, false);
    //declareFunction(myName, "set_read_transcript_op_limit", "SET-READ-TRANSCRIPT-OP-LIMIT", 1, 0, false);
    declareFunction(myName, "dont_record_operations_locally", "DONT-RECORD-OPERATIONS-LOCALLY", 0, 0, false);
    //declareFunction(myName, "set_dont_record_operations_locally", "SET-DONT-RECORD-OPERATIONS-LOCALLY", 1, 0, false);
    declareFunction(myName, "receiving_remote_operationsP", "RECEIVING-REMOTE-OPERATIONS?", 0, 0, false);
    declareFunction(myName, "set_receiving_remote_operationsP", "SET-RECEIVING-REMOTE-OPERATIONS?", 1, 0, false);
    declareFunction(myName, "process_local_operationsP", "PROCESS-LOCAL-OPERATIONS?", 0, 0, false);
    //declareFunction(myName, "set_process_local_operationsP", "SET-PROCESS-LOCAL-OPERATIONS?", 1, 0, false);
    declareFunction(myName, "process_auxiliary_operationsP", "PROCESS-AUXILIARY-OPERATIONS?", 0, 0, false);
    declareFunction(myName, "set_process_auxiliary_operationsP", "SET-PROCESS-AUXILIARY-OPERATIONS?", 1, 0, false);
    declareFunction(myName, "saving_operationsP", "SAVING-OPERATIONS?", 0, 0, false);
    declareFunction(myName, "set_saving_operationsP", "SET-SAVING-OPERATIONS?", 1, 0, false);
    //declareFunction(myName, "total_remote_operations_run", "TOTAL-REMOTE-OPERATIONS-RUN", 0, 0, false);
    //declareFunction(myName, "set_total_remote_operations_run", "SET-TOTAL-REMOTE-OPERATIONS-RUN", 1, 0, false);
    //declareFunction(myName, "total_auxiliary_operations_run", "TOTAL-AUXILIARY-OPERATIONS-RUN", 0, 0, false);
    //declareFunction(myName, "inc_total_auxiliary_operations_run", "INC-TOTAL-AUXILIARY-OPERATIONS-RUN", 0, 0, false);
    //declareFunction(myName, "total_local_operations_recorded", "TOTAL-LOCAL-OPERATIONS-RECORDED", 0, 0, false);
    declareFunction(myName, "inc_total_local_operations_recorded", "INC-TOTAL-LOCAL-OPERATIONS-RECORDED", 0, 0, false);
    //declareFunction(myName, "total_local_operations_transmitted", "TOTAL-LOCAL-OPERATIONS-TRANSMITTED", 0, 0, false);
    //declareFunction(myName, "inc_total_local_operations_transmitted", "INC-TOTAL-LOCAL-OPERATIONS-TRANSMITTED", 0, 0, false);
    declareFunction(myName, "read_master_transcript_op_number", "READ-MASTER-TRANSCRIPT-OP-NUMBER", 0, 0, false);
    //declareFunction(myName, "set_read_master_transcript_op_number", "SET-READ-MASTER-TRANSCRIPT-OP-NUMBER", 1, 0, false);
    //declareFunction(myName, "total_master_transcript_operations_processed", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED", 0, 0, false);
    //declareFunction(myName, "set_total_master_transcript_operations_processed", "SET-TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED", 1, 0, false);
    declareFunction(myName, "the_cyclist", "THE-CYCLIST", 0, 0, false);
    declareFunction(myName, "set_the_cyclist", "SET-THE-CYCLIST", 0, 1, false);
    declareFunction(myName, "map_cyclist_name_to_cyclist_term", "MAP-CYCLIST-NAME-TO-CYCLIST-TERM", 1, 0, false);
    //declareFunction(myName, "the_cyclist_is_guestP", "THE-CYCLIST-IS-GUEST?", 0, 0, false);
    //declareFunction(myName, "image_requires_authenticationP", "IMAGE-REQUIRES-AUTHENTICATION?", 0, 0, false);
    //declareFunction(myName, "authenticate_the_cyclist", "AUTHENTICATE-THE-CYCLIST", 2, 1, false);
    //declareFunction(myName, "lookup_password_for_cyclist_from_kb", "LOOKUP-PASSWORD-FOR-CYCLIST-FROM-KB", 1, 1, false);
    //declareFunction(myName, "get_stored_password_for_cyclist_from_kb", "GET-STORED-PASSWORD-FOR-CYCLIST-FROM-KB", 1, 0, false);
    //declareFunction(myName, "specify_authentication_info_for_user", "SPECIFY-AUTHENTICATION-INFO-FOR-USER", 2, 1, false);
    //declareFunction(myName, "assert_stored_password_for_cyclist_in_kb", "ASSERT-STORED-PASSWORD-FOR-CYCLIST-IN-KB", 2, 0, false);
    //declareFunction(myName, "unassert_stored_password_for_cyclist_in_kb", "UNASSERT-STORED-PASSWORD-FOR-CYCLIST-IN-KB", 1, 0, false);
    //declareFunction(myName, "kb_op_number", "KB-OP-NUMBER", 0, 0, false);
    declareFunction(myName, "kb_version_string", "KB-VERSION-STRING", 0, 0, false);
    //declareFunction(myName, "remote_ops_processed", "REMOTE-OPS-PROCESSED", 0, 0, false);
    //declareFunction(myName, "available_communication_modes", "AVAILABLE-COMMUNICATION-MODES", 0, 1, false);
    //declareFunction(myName, "communication_modeP", "COMMUNICATION-MODE?", 1, 0, false);
    //declareFunction(myName, "communication_mode_name", "COMMUNICATION-MODE-NAME", 1, 0, false);
    declareFunction(myName, "communication_mode", "COMMUNICATION-MODE", 0, 0, false);
    declareFunction(myName, "set_communication_mode_internal", "SET-COMMUNICATION-MODE-INTERNAL", 1, 0, false);
    declareFunction(myName, "set_communication_mode", "SET-COMMUNICATION-MODE", 0, 1, false);
    //declareFunction(myName, "transmit_state_p", "TRANSMIT-STATE-P", 1, 0, false);
    //declareFunction(myName, "receive_state_p", "RECEIVE-STATE-P", 1, 0, false);
    //declareFunction(myName, "set_communication_state", "SET-COMMUNICATION-STATE", 2, 0, false);
    //declareFunction(myName, "set_transmit_state", "SET-TRANSMIT-STATE", 1, 0, false);
    //declareFunction(myName, "set_receive_state", "SET-RECEIVE-STATE", 1, 0, false);
    //declareFunction(myName, "set_to_transmitting", "SET-TO-TRANSMITTING", 0, 0, false);
    declareFunction(myName, "set_to_storing", "SET-TO-STORING", 0, 0, false);
    //declareFunction(myName, "set_to_no_record", "SET-TO-NO-RECORD", 0, 0, false);
    //declareFunction(myName, "set_to_receiving", "SET-TO-RECEIVING", 0, 0, false);
    declareFunction(myName, "set_to_not_receiving", "SET-TO-NOT-RECEIVING", 0, 0, false);
    declareFunction(myName, "transmitting_changeP", "TRANSMITTING-CHANGE?", 1, 0, false);
    declareFunction(myName, "receiving_changeP", "RECEIVING-CHANGE?", 1, 0, false);
    //declareFunction(myName, "set_to_receive_only", "SET-TO-RECEIVE-ONLY", 0, 0, false);
    declareFunction(myName, "set_to_deaf", "SET-TO-DEAF", 0, 0, false);
    //declareFunction(myName, "set_to_dead", "SET-TO-DEAD", 0, 0, false);
    //declareFunction(myName, "set_to_transmit_and_receive", "SET-TO-TRANSMIT-AND-RECEIVE", 0, 0, false);
    //declareFunction(myName, "set_to_transmit_only", "SET-TO-TRANSMIT-ONLY", 0, 0, false);
    //declareFunction(myName, "set_to_dead_receive", "SET-TO-DEAD-RECEIVE", 0, 0, false);
    declareFunction(myName, "transmittingP", "TRANSMITTING?", 0, 0, false);
    declareFunction(myName, "storingP", "STORING?", 0, 0, false);
    //declareFunction(myName, "not_recordingP", "NOT-RECORDING?", 0, 0, false);
    //declareFunction(myName, "receivingP", "RECEIVING?", 0, 0, false);
    declareFunction(myName, "get_transmit_state", "GET-TRANSMIT-STATE", 0, 1, false);
    declareFunction(myName, "get_receive_state", "GET-RECEIVE-STATE", 0, 1, false);
    //declareFunction(myName, "get_communication_state", "GET-COMMUNICATION-STATE", 2, 0, false);
    //declareFunction(myName, "valid_transcript_expression", "VALID-TRANSCRIPT-EXPRESSION", 1, 0, false);
    //declareFunction(myName, "operation_from_meP", "OPERATION-FROM-ME?", 1, 0, false);
    //declareFunction(myName, "writing_transcriptsP", "WRITING-TRANSCRIPTS?", 0, 0, false);
    //declareFunction(myName, "reading_transcriptsP", "READING-TRANSCRIPTS?", 0, 0, false);
    //declareFunction(myName, "clear_stored_operations", "CLEAR-STORED-OPERATIONS", 0, 0, false);
    //declareFunction(myName, "send_stored_operations", "SEND-STORED-OPERATIONS", 0, 0, false);
    //declareFunction(myName, "fi_save_ops", "FI-SAVE-OPS", 0, 0, false);
    //declareFunction(myName, "send_local_transcript", "SEND-LOCAL-TRANSCRIPT", 0, 0, false);
    //declareFunction(myName, "possibly_save_transcript_ops", "POSSIBLY-SAVE-TRANSCRIPT-OPS", 0, 0, false);
    declareFunction(myName, "save_transcript_ops", "SAVE-TRANSCRIPT-OPS", 0, 0, false);
    declareFunction(myName, "save_transcript_ops_internal", "SAVE-TRANSCRIPT-OPS-INTERNAL", 0, 1, false);
    //declareFunction(myName, "possibly_save_hl_transcript_ops", "POSSIBLY-SAVE-HL-TRANSCRIPT-OPS", 0, 0, false);
    //declareFunction(myName, "save_hl_transcript_ops", "SAVE-HL-TRANSCRIPT-OPS", 0, 0, false);
    //declareFunction(myName, "save_hl_transcript_ops_internal", "SAVE-HL-TRANSCRIPT-OPS-INTERNAL", 0, 0, false);
    //declareFunction(myName, "close_kb", "CLOSE-KB", 2, 0, false);
    //declareFunction(myName, "read_one_transcript_operation", "READ-ONE-TRANSCRIPT-OPERATION", 1, 0, false);
    //declareFunction(myName, "backup_transcript_stream", "BACKUP-TRANSCRIPT-STREAM", 2, 0, false);
    //declareFunction(myName, "load_transcript_exprs", "LOAD-TRANSCRIPT-EXPRS", 0, 0, false);
    //declareFunction(myName, "load_transcript_exprs_internal", "LOAD-TRANSCRIPT-EXPRS-INTERNAL", 0, 0, false);
    declareFunction(myName, "remote_operation_to_runP", "REMOTE-OPERATION-TO-RUN?", 0, 0, false);
    //declareFunction(myName, "master_transcript_catch_up", "MASTER-TRANSCRIPT-CATCH-UP", 0, 0, false);
    //declareFunction(myName, "run_random_transcript_op", "RUN-RANDOM-TRANSCRIPT-OP", 1, 0, false);
    //declareFunction(myName, "load_transcript_file", "LOAD-TRANSCRIPT-FILE", 1, 4, false);
    //declareFunction(myName, "server_summary", "SERVER-SUMMARY", 0, 1, false);
    //declareFunction(myName, "write_cyc_image", "WRITE-CYC-IMAGE", 1, 1, false);
    //declareFunction(myName, "make_cyc_image_filename", "MAKE-CYC-IMAGE-FILENAME", 0, 1, false);
    //declareFunction(myName, "make_next_cyc_image_filename", "MAKE-NEXT-CYC-IMAGE-FILENAME", 1, 0, false);
    //declareFunction(myName, "halt_cyc_image", "HALT-CYC-IMAGE", 0, 1, false);
    //declareFunction(myName, "get_remote_operations_kb_check_point", "GET-REMOTE-OPERATIONS-KB-CHECK-POINT", 0, 0, false);
    //declareFunction(myName, "set_remote_operations_kb_check_point", "SET-REMOTE-OPERATIONS-KB-CHECK-POINT", 1, 0, false);
    //declareFunction(myName, "clear_remote_operations_kb_check_point", "CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT", 0, 0, false);
    //declareFunction(myName, "note_kb_check_point_reached", "NOTE-KB-CHECK-POINT-REACHED", 1, 0, false);
    //declareFunction(myName, "transmit_kb_check_point_operation", "TRANSMIT-KB-CHECK-POINT-OPERATION", 1, 0, false);
    //declareFunction(myName, "possibly_roll_to_allow_transmitting", "POSSIBLY-ROLL-TO-ALLOW-TRANSMITTING", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_operation_communication_file() {
    $all_communication_modes$ = defparameter("*ALL-COMMUNICATION-MODES*", $list0);
    $allow_transmitting$ = deflexical("*ALLOW-TRANSMITTING*", maybeDefault( $sym1$_ALLOW_TRANSMITTING_, $allow_transmitting$, T));
    $kb_full_transcript_loaded$ = deflexical("*KB-FULL-TRANSCRIPT-LOADED*", maybeDefault( $sym2$_KB_FULL_TRANSCRIPT_LOADED_, $kb_full_transcript_loaded$, NIL));
    $experimental_image$ = defparameter("*EXPERIMENTAL-IMAGE*", NIL);
    $read_transcript_op_limit$ = defparameter("*READ-TRANSCRIPT-OP-LIMIT*", $int7$200);
    $receiving_remote_operationsP$ = deflexical("*RECEIVING-REMOTE-OPERATIONS?*", maybeDefault( $sym8$_RECEIVING_REMOTE_OPERATIONS__, $receiving_remote_operationsP$, T));
    $process_local_operationsP$ = deflexical("*PROCESS-LOCAL-OPERATIONS?*", maybeDefault( $sym9$_PROCESS_LOCAL_OPERATIONS__, $process_local_operationsP$, T));
    $process_auxiliary_operationsP$ = deflexical("*PROCESS-AUXILIARY-OPERATIONS?*", maybeDefault( $sym10$_PROCESS_AUXILIARY_OPERATIONS__, $process_auxiliary_operationsP$, T));
    $saving_operationsP$ = deflexical("*SAVING-OPERATIONS?*", maybeDefault( $sym11$_SAVING_OPERATIONS__, $saving_operationsP$, NIL));
    $total_remote_operations_run$ = deflexical("*TOTAL-REMOTE-OPERATIONS-RUN*", maybeDefault( $sym12$_TOTAL_REMOTE_OPERATIONS_RUN_, $total_remote_operations_run$, ()-> (ZERO_INTEGER)));
    $total_auxiliary_operations_run$ = deflexical("*TOTAL-AUXILIARY-OPERATIONS-RUN*", maybeDefault( $sym13$_TOTAL_AUXILIARY_OPERATIONS_RUN_, $total_auxiliary_operations_run$, ()-> (ZERO_INTEGER)));
    $total_local_operations_recorded$ = deflexical("*TOTAL-LOCAL-OPERATIONS-RECORDED*", maybeDefault( $sym14$_TOTAL_LOCAL_OPERATIONS_RECORDED_, $total_local_operations_recorded$, ()-> (ZERO_INTEGER)));
    $total_local_operations_transmitted$ = deflexical("*TOTAL-LOCAL-OPERATIONS-TRANSMITTED*", maybeDefault( $sym15$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_, $total_local_operations_transmitted$, ()-> (ZERO_INTEGER)));
    $read_master_transcript_op_number$ = deflexical("*READ-MASTER-TRANSCRIPT-OP-NUMBER*", maybeDefault( $sym16$_READ_MASTER_TRANSCRIPT_OP_NUMBER_, $read_master_transcript_op_number$, ()-> (ZERO_INTEGER)));
    $total_master_transcript_operations_processed$ = deflexical("*TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED*", maybeDefault( $sym17$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_, $total_master_transcript_operations_processed$, ()-> (ZERO_INTEGER)));
    $image_requires_authenticationP$ = deflexical("*IMAGE-REQUIRES-AUTHENTICATION?*", NIL);
    $cyclist_authenticating_app$ = defparameter("*CYCLIST-AUTHENTICATING-APP*", $const26$CycBrowser);
    $default_cyclist_authentication_mt$ = defparameter("*DEFAULT-CYCLIST-AUTHENTICATION-MT*", $const34$CyclistsMt);
    $transmit_states$ = deflexical("*TRANSMIT-STATES*", $list58);
    $receive_states$ = deflexical("*RECEIVE-STATES*", $list60);
    $build_request_email$ = deflexical("*BUILD-REQUEST-EMAIL*", $str72$build_requests_cyc_com);
    $save_transcript_ops_lock$ = defparameter("*SAVE-TRANSCRIPT-OPS-LOCK*", Locks.make_lock($str77$Save_Transcript_OPS_lock));
    $save_hl_transcript_ops_lock$ = defparameter("*SAVE-HL-TRANSCRIPT-OPS-LOCK*", Locks.make_lock($str78$Save_Hl_Transcript_OPS_lock));
    $transcript_load_succeeded$ = defvar("*TRANSCRIPT-LOAD-SUCCEEDED*", NIL);
    $transcript_read_attempted$ = deflexical("*TRANSCRIPT-READ-ATTEMPTED*", maybeDefault( $sym85$_TRANSCRIPT_READ_ATTEMPTED_, $transcript_read_attempted$, NIL));
    $initial_read_transcript_size$ = deflexical("*INITIAL-READ-TRANSCRIPT-SIZE*", maybeDefault( $sym86$_INITIAL_READ_TRANSCRIPT_SIZE_, $initial_read_transcript_size$, ()-> (ZERO_INTEGER)));
    $remote_operations_kb_check_point$ = deflexical("*REMOTE-OPERATIONS-KB-CHECK-POINT*", maybeDefault( $sym130$_REMOTE_OPERATIONS_KB_CHECK_POINT_, $remote_operations_kb_check_point$, NIL));
    return NIL;
  }

  public static final SubLObject setup_operation_communication_file() {
    // CVS_ID("Id: operation-communication.lisp 128745 2009-09-11 20:11:10Z rck ");
    subl_macro_promotions.declare_defglobal($sym1$_ALLOW_TRANSMITTING_);
    subl_macro_promotions.declare_defglobal($sym2$_KB_FULL_TRANSCRIPT_LOADED_);
    subl_macro_promotions.declare_defglobal($sym8$_RECEIVING_REMOTE_OPERATIONS__);
    subl_macro_promotions.declare_defglobal($sym9$_PROCESS_LOCAL_OPERATIONS__);
    subl_macro_promotions.declare_defglobal($sym10$_PROCESS_AUXILIARY_OPERATIONS__);
    subl_macro_promotions.declare_defglobal($sym11$_SAVING_OPERATIONS__);
    subl_macro_promotions.declare_defglobal($sym12$_TOTAL_REMOTE_OPERATIONS_RUN_);
    subl_macro_promotions.declare_defglobal($sym13$_TOTAL_AUXILIARY_OPERATIONS_RUN_);
    subl_macro_promotions.declare_defglobal($sym14$_TOTAL_LOCAL_OPERATIONS_RECORDED_);
    subl_macro_promotions.declare_defglobal($sym15$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_);
    subl_macro_promotions.declare_defglobal($sym16$_READ_MASTER_TRANSCRIPT_OP_NUMBER_);
    subl_macro_promotions.declare_defglobal($sym17$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_);
    access_macros.register_external_symbol($sym18$THE_CYCLIST);
    utilities_macros.register_cyc_api_function($sym20$THE_CYCLIST_IS_GUEST_, NIL, $str21$Return_T_iff_the_current_CyclIst_, NIL, $list22);
    utilities_macros.register_cyc_api_function($sym23$IMAGE_REQUIRES_AUTHENTICATION_, NIL, $str24$_return_non_NIL_iff_this_Cyc_imag, NIL, $list25);
    utilities_macros.register_cyc_api_function($sym29$AUTHENTICATE_THE_CYCLIST, $list30, $str31$Ensure_that_the_encrypted_passphr, $list32, $list33);
    utilities_macros.register_cyc_api_function($sym41$SPECIFY_AUTHENTICATION_INFO_FOR_USER, $list42, $str43$Store_the_authenitcation_informat, $list44, $list45);
    access_macros.register_external_symbol($sym50$KB_VERSION_STRING);
    subl_macro_promotions.declare_defglobal($sym85$_TRANSCRIPT_READ_ATTEMPTED_);
    subl_macro_promotions.declare_defglobal($sym86$_INITIAL_READ_TRANSCRIPT_SIZE_);
    subl_macro_promotions.declare_defglobal($sym130$_REMOTE_OPERATIONS_KB_CHECK_POINT_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(cons(makeKeyword("TRANSMIT-AND-RECEIVE"), makeString("Sending and Receiving")), cons(makeKeyword("RECEIVE-ONLY"), makeString("Storing and Receiving")), cons(makeKeyword("TRANSMIT-ONLY"), makeString("Sending Only")), cons(makeKeyword("DEAD-RECEIVE"), makeString("Not Recording but Receiving")), cons(makeKeyword("DEAF"), makeString("Storing Only")), cons(makeKeyword("DEAD"), makeString("Not Recording or Receiving")));
  public static final SubLSymbol $sym1$_ALLOW_TRANSMITTING_ = makeSymbol("*ALLOW-TRANSMITTING*");
  public static final SubLSymbol $sym2$_KB_FULL_TRANSCRIPT_LOADED_ = makeSymbol("*KB-FULL-TRANSCRIPT-LOADED*");
  public static final SubLSymbol $kw3$TRANSMIT_AND_RECEIVE = makeKeyword("TRANSMIT-AND-RECEIVE");
  public static final SubLSymbol $kw4$RECEIVE_ONLY = makeKeyword("RECEIVE-ONLY");
  public static final SubLSymbol $kw5$TRANSMIT_ONLY = makeKeyword("TRANSMIT-ONLY");
  public static final SubLSymbol $kw6$DEAF = makeKeyword("DEAF");
  public static final SubLInteger $int7$200 = makeInteger(200);
  public static final SubLSymbol $sym8$_RECEIVING_REMOTE_OPERATIONS__ = makeSymbol("*RECEIVING-REMOTE-OPERATIONS?*");
  public static final SubLSymbol $sym9$_PROCESS_LOCAL_OPERATIONS__ = makeSymbol("*PROCESS-LOCAL-OPERATIONS?*");
  public static final SubLSymbol $sym10$_PROCESS_AUXILIARY_OPERATIONS__ = makeSymbol("*PROCESS-AUXILIARY-OPERATIONS?*");
  public static final SubLSymbol $sym11$_SAVING_OPERATIONS__ = makeSymbol("*SAVING-OPERATIONS?*");
  public static final SubLSymbol $sym12$_TOTAL_REMOTE_OPERATIONS_RUN_ = makeSymbol("*TOTAL-REMOTE-OPERATIONS-RUN*");
  public static final SubLSymbol $sym13$_TOTAL_AUXILIARY_OPERATIONS_RUN_ = makeSymbol("*TOTAL-AUXILIARY-OPERATIONS-RUN*");
  public static final SubLSymbol $sym14$_TOTAL_LOCAL_OPERATIONS_RECORDED_ = makeSymbol("*TOTAL-LOCAL-OPERATIONS-RECORDED*");
  public static final SubLSymbol $sym15$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_ = makeSymbol("*TOTAL-LOCAL-OPERATIONS-TRANSMITTED*");
  public static final SubLSymbol $sym16$_READ_MASTER_TRANSCRIPT_OP_NUMBER_ = makeSymbol("*READ-MASTER-TRANSCRIPT-OP-NUMBER*");
  public static final SubLSymbol $sym17$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_ = makeSymbol("*TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED*");
  public static final SubLSymbol $sym18$THE_CYCLIST = makeSymbol("THE-CYCLIST");
  public static final SubLObject $const19$Guest = constant_handles.reader_make_constant_shell(makeString("Guest"));
  public static final SubLSymbol $sym20$THE_CYCLIST_IS_GUEST_ = makeSymbol("THE-CYCLIST-IS-GUEST?");
  public static final SubLString $str21$Return_T_iff_the_current_CyclIst_ = makeString("Return T iff the current CyclIst is the #$Guest account.");
  public static final SubLList $list22 = list(list(makeSymbol("LIST"), makeSymbol("BOOLEANP")));
  public static final SubLSymbol $sym23$IMAGE_REQUIRES_AUTHENTICATION_ = makeSymbol("IMAGE-REQUIRES-AUTHENTICATION?");
  public static final SubLString $str24$_return_non_NIL_iff_this_Cyc_imag = makeString("@return non-NIL iff this Cyc image requires authentication.");
  public static final SubLList $list25 = list(makeSymbol("BOOLEANP"));
  public static final SubLObject $const26$CycBrowser = constant_handles.reader_make_constant_shell(makeString("CycBrowser"));
  public static final SubLSymbol $sym27$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym28$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym29$AUTHENTICATE_THE_CYCLIST = makeSymbol("AUTHENTICATE-THE-CYCLIST");
  public static final SubLList $list30 = list(makeSymbol("NAME"), makeSymbol("ENCRYPTED-PASSWORD"), makeSymbol("&OPTIONAL"), list(makeSymbol("APPLICATION"), makeSymbol("*CYCLIST-AUTHENTICATING-APP*")));
  public static final SubLString $str31$Ensure_that_the_encrypted_passphr = makeString("Ensure that the encrypted passphrase (e.g. SHA1 of password and user name, or similar)\n   is the one recorded for APPLICATION for the Cyclist identified by NAME\n   in the current KB.\n   Otherwise, sets the cyclist to #$Guest.\n   @return FORT-P the current cyclist\n   @see THE-CYCLIST-IS-GUEST?");
  public static final SubLList $list32 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("ENCRYPTED-PASSWORD"), makeSymbol("STRINGP")), list(makeSymbol("APPLICATION"), makeSymbol("FORT-P")));
  public static final SubLList $list33 = list(makeSymbol("FORT-P"));
  public static final SubLObject $const34$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));
  public static final SubLObject $const35$UserOfProgramFn = constant_handles.reader_make_constant_shell(makeString("UserOfProgramFn"));
  public static final SubLSymbol $sym36$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLObject $const37$encryptedPasswordForUser = constant_handles.reader_make_constant_shell(makeString("encryptedPasswordForUser"));
  public static final SubLString $str38$Please_login_to_specify_authentic = makeString("Please login to specify authentication information for others.");
  public static final SubLSymbol $sym39$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str40$Cyclists_can_only_edit_their_own_ = makeString("Cyclists can only edit their own passwords.");
  public static final SubLSymbol $sym41$SPECIFY_AUTHENTICATION_INFO_FOR_USER = makeSymbol("SPECIFY-AUTHENTICATION-INFO-FOR-USER");
  public static final SubLList $list42 = list(makeSymbol("CYCLIST"), makeSymbol("PASSPHRASE"), makeSymbol("&OPTIONAL"), list(makeSymbol("APPLICATION"), makeSymbol("*CYCLIST-AUTHENTICATING-APP*")));
  public static final SubLString $str43$Store_the_authenitcation_informat = makeString("Store the authenitcation information for the user in the currrent KB.\n   Any valid user may add a password, but only the same user may edit it.\n   @param CYCLIST the cyclist for whom to establish this credential\n   @param PASSPHRASE the password as a STRINGP\n   @param APPLICATION the FORT-P denoting the program or NIL if it is the general credential\n   @return 0 BOOLEANP success indicator\n   @return 1 STRINGP error message, valid if BOOLEANP is NIL");
  public static final SubLList $list44 = list(list(makeSymbol("CYCLIST"), makeSymbol("FORT-P")), list(makeSymbol("PASSPHRASE"), makeSymbol("STRINGP")));
  public static final SubLList $list45 = list(makeSymbol("BOOLEANP"), makeSymbol("STRINGP"));
  public static final SubLString $str46$__Error__A___A__ = makeString("~&Error ~A: ~A~%");
  public static final SubLString $str47$Cannot_assert_passphrase_for__A__ = makeString("Cannot assert passphrase for ~A: ~A");
  public static final SubLString $str48$Cannot_unassert_missing_passphras = makeString("Cannot unassert missing passphrase for ~A ... concurrent modification?");
  public static final SubLString $str49$Cannot_unassert_passphrase__A_for = makeString("Cannot unassert passphrase ~A for ~A: ~A");
  public static final SubLSymbol $sym50$KB_VERSION_STRING = makeSymbol("KB-VERSION-STRING");
  public static final SubLString $str51$_a__a = makeString("~a.~a");
  public static final SubLString $str52$_a = makeString("~a");
  public static final SubLSymbol $sym53$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym54$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym55$COMMUNICATION_MODE_ = makeSymbol("COMMUNICATION-MODE?");
  public static final SubLSymbol $kw56$DEAD = makeKeyword("DEAD");
  public static final SubLSymbol $kw57$DEAD_RECEIVE = makeKeyword("DEAD-RECEIVE");
  public static final SubLList $list58 = list(makeString("transmit"), makeString("store"), makeString("none"));
  public static final SubLSymbol $sym59$STRING_EQUAL = makeSymbol("STRING-EQUAL");
  public static final SubLList $list60 = list(makeString("yes"), makeString("no"));
  public static final SubLSymbol $sym61$TRANSMIT_STATE_P = makeSymbol("TRANSMIT-STATE-P");
  public static final SubLSymbol $sym62$RECEIVE_STATE_P = makeSymbol("RECEIVE-STATE-P");
  public static final SubLString $str63$SENT = makeString("SENT");
  public static final SubLString $str64$transmit = makeString("transmit");
  public static final SubLString $str65$store = makeString("store");
  public static final SubLString $str66$none = makeString("none");
  public static final SubLString $str67$yes = makeString("yes");
  public static final SubLString $str68$no = makeString("no");
  public static final SubLString $str69$None = makeString("None");
  public static final SubLString $str70$Yes = makeString("Yes");
  public static final SubLString $str71$CLEARED = makeString("CLEARED");
  public static final SubLString $str72$build_requests_cyc_com = makeString("build-requests@cyc.com");
  public static final SubLSymbol $kw73$APPEND = makeKeyword("APPEND");
  public static final SubLSymbol $kw74$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str75$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str76$_s__ = makeString("~s~%");
  public static final SubLString $str77$Save_Transcript_OPS_lock = makeString("Save Transcript OPS lock");
  public static final SubLString $str78$Save_Hl_Transcript_OPS_lock = makeString("Save Hl-Transcript OPS lock");
  public static final SubLSymbol $kw79$EOF = makeKeyword("EOF");
  public static final SubLSymbol $kw80$ERROR = makeKeyword("ERROR");
  public static final SubLString $str81$Skip_forward_until_a_valid_transc = makeString("Skip forward until a valid transcript form is reached");
  public static final SubLString $str82$Bogus_form__S_read_from_transcrip = makeString("Bogus form ~S read from transcript at position ~S");
  public static final SubLString $str83$Assume_the_rest_of_the_operation_ = makeString("Assume the rest of the operation is now there and retry reading it");
  public static final SubLString $str84$Partial_transcript_operation__S_w = makeString("Partial transcript operation ~S was read in");
  public static final SubLSymbol $sym85$_TRANSCRIPT_READ_ATTEMPTED_ = makeSymbol("*TRANSCRIPT-READ-ATTEMPTED*");
  public static final SubLSymbol $sym86$_INITIAL_READ_TRANSCRIPT_SIZE_ = makeSymbol("*INITIAL-READ-TRANSCRIPT-SIZE*");
  public static final SubLString $str87$The_transcript_file__s_has_alread = makeString("The transcript file ~s has already been accessed, but cannot be found now.");
  public static final SubLSymbol $kw88$INPUT = makeKeyword("INPUT");
  public static final SubLString $str89$__Processing_master_transcript_op = makeString("~&Processing master transcript operations~%");
  public static final SubLInteger $int90$100 = makeInteger(100);
  public static final SubLString $str91$___4__0D__2__0D__2__0D__2__0D__2_ = makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D: processed ~A operations~%");
  public static final SubLString $str92$__Finished_processing__A_master_t = makeString("~&Finished processing ~A master transcript operations~%");
  public static final SubLSymbol $kw93$UNENCAPSULATION_ERROR = makeKeyword("UNENCAPSULATION-ERROR");
  public static final SubLSymbol $kw94$AUX = makeKeyword("AUX");
  public static final SubLSymbol $kw95$NONE = makeKeyword("NONE");
  public static final SubLString $str96$Loading__A = makeString("Loading ~A");
  public static final SubLSymbol $kw97$LOCAL = makeKeyword("LOCAL");
  public static final SubLString $str98$__Server_Summary____A = makeString("~%Server Summary:  ~A");
  public static final SubLString $str99$___Machine___A = makeString("   Machine: ~A");
  public static final SubLString $str100$__Cyclist___A = makeString("~%Cyclist: ~A");
  public static final SubLString $str101$___KB___A = makeString("   KB: ~A");
  public static final SubLString $str102$___System___A = makeString("   System: ~A");
  public static final SubLString $str103$__Comm___A = makeString("~%Comm: ~A");
  public static final SubLString $str104$___Agenda___A = makeString("   Agenda: ~A");
  public static final SubLString $str105$__Queues_ = makeString("~%Queues:");
  public static final SubLString $str106$___Aux__ = makeString("   Aux: ");
  public static final SubLString $str107$__d__d_ = makeString("(~d ~d)");
  public static final SubLString $str108$__d_ = makeString("(~d)");
  public static final SubLString $str109$___Remote__ = makeString("   Remote: ");
  public static final SubLString $str110$___Local__ = makeString("   Local: ");
  public static final SubLString $str111$__d__d__d_ = makeString("(~d ~d ~d)");
  public static final SubLSymbol $kw112$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLInteger $int113$25 = makeInteger(25);
  public static final SubLString $str114$Minor_version__S_is_not_in_the_ra = makeString("Minor-version ~S is not in the range 0 - 25.");
  public static final SubLString $str115$ABCDEFGHIJKLMNOPQRSTUVWXYZ = makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  public static final SubLList $list116 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("&REST"), makeSymbol("PATCH-NUMBERS"));
  public static final SubLSymbol $sym117$TO_STRING = makeSymbol("TO-STRING");
  public static final SubLString $str118$ = makeString("");
  public static final SubLString $str119$p = makeString("p");
  public static final SubLString $str120$cyc_s_D_A_kb_4__0D__C = makeString("cyc-s~D~A-kb~4,'0D-~C");
  public static final SubLString $str121$cyc_s_D_A__C = makeString("cyc-s~D~A-~C");
  public static final SubLString $str122$world = makeString("world");
  public static final SubLString $str123$_ = makeString(".");
  public static final SubLSymbol $sym124$DIRECTORY_P = makeSymbol("DIRECTORY-P");
  public static final SubLString $str125$Directory__S_is_not_writeable = makeString("Directory ~S is not writeable");
  public static final SubLInteger $int126$26 = makeInteger(26);
  public static final SubLString $str127$done = makeString("done");
  public static final SubLString $str128$Halting_Cyc_image____A = makeString("Halting Cyc image : ~A");
  public static final SubLString $str129$QUIT = makeString("QUIT");
  public static final SubLSymbol $sym130$_REMOTE_OPERATIONS_KB_CHECK_POINT_ = makeSymbol("*REMOTE-OPERATIONS-KB-CHECK-POINT*");
  public static final SubLSymbol $sym131$NOTE_KB_CHECK_POINT_REACHED = makeSymbol("NOTE-KB-CHECK-POINT-REACHED");

  //// Initializers

  public void declareFunctions() {
    declare_operation_communication_file();
  }

  public void initializeVariables() {
    init_operation_communication_file();
  }

  public void runTopLevelForms() {
    setup_operation_communication_file();
  }

}
