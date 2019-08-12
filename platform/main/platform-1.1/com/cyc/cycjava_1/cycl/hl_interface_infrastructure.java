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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.remote_image;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class hl_interface_infrastructure extends SubLTranslatedFile {

  //// Constructor

  private hl_interface_infrastructure() {}
  public static final SubLFile me = new hl_interface_infrastructure();
  public static final String myName = "com.cyc.cycjava_1.cycl.hl_interface_infrastructure";

  //// Definitions

  /** Where HL store modification and access should be done.  There
   are four valid values:
     :local-local   (modify and access locally)
     :remote-remote (modify and access remotely)
     :both-local    (modify and access locally, also modify remotely)
     :both-remote   (modify and access remotely, also modify locally)
     :none-local    (access locally, do not modify) */
  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 995) 
  public static SubLSymbol $hl_store_modification_and_access$ = null;

  /** A non-NIL value means that access will be done locally regardless
   of the value of *hl-store-modification-and-access*. */
  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1523) 
  public static SubLSymbol $override_hl_store_remote_accessP$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1707) 
  public static final SubLObject hl_modify_localP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((($kw0$LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1929) 
  public static final SubLObject hl_modify_remoteP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((($kw3$REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2154) 
  public static final SubLObject hl_modify_anywhereP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((($kw0$LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw3$REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw1$BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))
            || ($kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2700) 
  public static final SubLObject hl_access_remoteP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL == $override_hl_store_remote_accessP$.getDynamicValue(thread))
             && (($kw3$REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))
              || ($kw2$BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread)))));
    }
  }

  /** The remote HL store image */
  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3200) 
  private static SubLSymbol $remote_hl_store_image$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3667) 
  private static SubLSymbol $remote_hl_store_connection_pool$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3764) 
  private static SubLSymbol $remote_hl_store_connection_pool_lock$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3879) 
  private static SubLSymbol $remote_hl_store_connection_pool_max_size$ = null;

  /** Code to execute before the internals of the hl-modifier (or hl-creator). */
  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 8593) 
  public static final SubLObject define_hl_modifier_preamble() {
    memoization_state.clear_hl_store_dependent_caches();
    return NIL;
  }

  /** Code to execute before the internals of the hl-modifier (or hl-creator). */
  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 8822) 
  public static final SubLObject define_hl_modifier_postamble() {
    memoization_state.clear_hl_store_dependent_caches();
    return NIL;
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9805) 
  public static SubLSymbol $hl_store_error_handling_mode$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10983) 
  private static SubLSymbol $hl_store_iterators$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11128) 
  private static SubLSymbol $next_hl_store_iterator_id$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11309) 
  public static final SubLObject candidate_next_hl_store_iterator_id() {
    {
      SubLObject next_id = $next_hl_store_iterator_id$.getGlobalValue();
      $next_hl_store_iterator_id$.setGlobalValue(Numbers.add($next_hl_store_iterator_id$.getGlobalValue(), ONE_INTEGER));
      if ($next_hl_store_iterator_id$.getGlobalValue().numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
        $next_hl_store_iterator_id$.setGlobalValue(ZERO_INTEGER);
      }
      return next_id;
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11583) 
  public static final SubLObject new_hl_store_iterator_id() {
    {
      SubLObject next_id = candidate_next_hl_store_iterator_id();
      while ((NIL != lookup_hl_store_iterator(next_id))) {
        next_id = candidate_next_hl_store_iterator_id();
      }
      return next_id;
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11813) 
  private static SubLSymbol $hl_store_iterator_lock$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11898) 
  public static final SubLObject note_hl_store_iterator(SubLObject iterator) {
    {
      SubLObject id = NIL;
      SubLObject lock = $hl_store_iterator_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id = new_hl_store_iterator_id();
        dictionary.dictionary_enter($hl_store_iterators$.getGlobalValue(), id, iterator);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return id;
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12127) 
  public static final SubLObject lookup_hl_store_iterator(SubLObject id) {
    return dictionary.dictionary_lookup_without_values($hl_store_iterators$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12242) 
  public static final SubLObject unnote_hl_store_iterator(SubLObject id) {
    {
      SubLObject result = NIL;
      SubLObject lock = $hl_store_iterator_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        result = dictionary.dictionary_remove($hl_store_iterators$.getGlobalValue(), id);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12438) 
  public static final SubLObject new_hl_store_iterator_int(SubLObject form) {
    {
      SubLObject iterator = Eval.eval(form);
      return ((NIL != iteration.iterator_p(iterator)) ? ((SubLObject) note_hl_store_iterator(iterator)) : NIL);
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12604) 
  public static final SubLObject hl_store_iterator_next_int(SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject iterator = lookup_hl_store_iterator(id);
        if ((NIL != iterator)) {
          thread.resetMultipleValues();
          {
            SubLObject next = iteration.iteration_next(iterator);
            SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return list(next, validP);
          }
        } else {
          return list(NIL, NIL);
        }
      }
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13255) 
  public static final SubLObject hl_store_iterator_done_int(SubLObject id) {
    {
      SubLObject iterator = lookup_hl_store_iterator(id);
      if ((NIL != iterator)) {
        return iteration.iteration_done(iterator);
      } else {
        return T;
      }
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13422) 
  public static final SubLObject hl_store_iterator_destroy_int(SubLObject id) {
    {
      SubLObject iterator = lookup_hl_store_iterator(id);
      if ((NIL != iterator)) {
        unnote_hl_store_iterator(id);
        return iteration.iteration_finalize(iterator);
      } else {
        return T;
      }
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13642) 
  public static final SubLObject new_hl_store_iterator(SubLObject form, SubLObject buffer_size) {
    if ((buffer_size == UNPROVIDED)) {
      buffer_size = ONE_INTEGER;
    }
    checkType(form, $sym52$LISTP);
    checkType(buffer_size, $sym53$POSITIVE_INTEGER_P);
    {
      SubLObject id = ((NIL != hl_access_remoteP()) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29558")) : new_hl_store_iterator_int(form));
      return (buffer_size.numE(ONE_INTEGER) ? ((SubLObject) create_hl_store_iterator(id)) : Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29503"));
    }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14175) 
  public static final SubLObject create_hl_store_iterator(SubLObject id) {
    return iteration.new_iterator(id, $sym55$HL_STORE_ITERATOR_DONE_, $sym56$HL_STORE_ITERATOR_NEXT, $sym57$HL_STORE_ITERATOR_DESTROY);
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14368) 
  public static final SubLObject hl_store_iterator_doneP(SubLObject id) {
    return ((NIL != hl_access_remoteP()) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29559")) : hl_store_iterator_done_int(id));
  }

  public static final class $hl_store_iterator_doneP$UnaryFunction extends UnaryFunction {
    public $hl_store_iterator_doneP$UnaryFunction() { super(extractFunctionNamed("HL-STORE-ITERATOR-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return hl_store_iterator_doneP(arg1); }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14550) 
  public static final SubLObject hl_store_iterator_next(SubLObject id) {
    {
      SubLObject datum = ((NIL != hl_access_remoteP()) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29560")) : hl_store_iterator_next_int(id));
      SubLObject current = datum;
      SubLObject next = NIL;
      SubLObject validP = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list60);
      next = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list60);
      validP = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return Values.values(next, id, Types.sublisp_null(validP));
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list60);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14806) 
  public static final SubLObject hl_store_iterator_destroy(SubLObject id) {
    return ((NIL != hl_access_remoteP()) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29561")) : hl_store_iterator_destroy_int(id));
  }

  public static final class $hl_store_iterator_destroy$UnaryFunction extends UnaryFunction {
    public $hl_store_iterator_destroy$UnaryFunction() { super(extractFunctionNamed("HL-STORE-ITERATOR-DESTROY")); }
    public SubLObject processItem(SubLObject arg1) { return hl_store_iterator_destroy(arg1); }
  }

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16230) 
  public static SubLSymbol $hl_transcript_stream$ = null;

  @SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17052) 
  public static final SubLObject note_hl_modifier_invocation(SubLObject name, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = $kw69$UNPROVIDED;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = $kw69$UNPROVIDED;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = $kw69$UNPROVIDED;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = $kw69$UNPROVIDED;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = $kw69$UNPROVIDED;
    }
    if ($hl_transcript_stream$.getGlobalValue().isStream()) {
      {
        SubLObject hlop = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29566");
        cfasl.cfasl_output_externalized(hlop, $hl_transcript_stream$.getGlobalValue());
      }
    }
    return NIL;
  }

  public static final SubLObject declare_hl_interface_infrastructure_file() {
    declareFunction(myName, "hl_modify_localP", "HL-MODIFY-LOCAL?", 0, 0, false);
    declareFunction(myName, "hl_modify_remoteP", "HL-MODIFY-REMOTE?", 0, 0, false);
    declareFunction(myName, "hl_modify_anywhereP", "HL-MODIFY-ANYWHERE?", 0, 0, false);
    declareFunction(myName, "hl_access_localP", "HL-ACCESS-LOCAL?", 0, 0, false);
    declareFunction(myName, "hl_access_remoteP", "HL-ACCESS-REMOTE?", 0, 0, false);
    declareMacro(myName, "override_remote_hl_store_access", "OVERRIDE-REMOTE-HL-STORE-ACCESS");
    declareMacro(myName, "do_not_override_remote_hl_store_access", "DO-NOT-OVERRIDE-REMOTE-HL-STORE-ACCESS");
    declareFunction(myName, "set_remote_hl_store_image", "SET-REMOTE-HL-STORE-IMAGE", 3, 0, false);
    declareFunction(myName, "unset_remote_hl_store_image", "UNSET-REMOTE-HL-STORE-IMAGE", 0, 0, false);
    declareFunction(myName, "clear_remote_hl_store_connection_pool", "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL", 0, 0, false);
    declareFunction(myName, "create_remote_hl_store_connection", "CREATE-REMOTE-HL-STORE-CONNECTION", 0, 0, false);
    declareFunction(myName, "release_hl_store_connection", "RELEASE-HL-STORE-CONNECTION", 1, 0, false);
    declareFunction(myName, "open_remote_hl_store_connection_p", "OPEN-REMOTE-HL-STORE-CONNECTION-P", 1, 0, false);
    declareFunction(myName, "get_free_hl_store_connection", "GET-FREE-HL-STORE-CONNECTION", 0, 0, false);
    declareFunction(myName, "initialize_remote_hl_store_connections", "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS", 0, 0, false);
    declareFunction(myName, "declare_remote_hl_store_image", "DECLARE-REMOTE-HL-STORE-IMAGE", 2, 1, false);
    declareFunction(myName, "undeclare_remote_hl_store_image", "UNDECLARE-REMOTE-HL-STORE-IMAGE", 0, 0, false);
    declareFunction(myName, "hl_store_remote_eval", "HL-STORE-REMOTE-EVAL", 1, 0, false);
    declareMacro(myName, "define_hl_creator", "DEFINE-HL-CREATOR");
    declareMacro(myName, "define_hl_modifier", "DEFINE-HL-MODIFIER");
    declareFunction(myName, "define_hl_modifier_preamble", "DEFINE-HL-MODIFIER-PREAMBLE", 0, 0, false);
    declareFunction(myName, "define_hl_modifier_postamble", "DEFINE-HL-MODIFIER-POSTAMBLE", 0, 0, false);
    declareMacro(myName, "define_hl_accessor", "DEFINE-HL-ACCESSOR");
    declareFunction(myName, "valid_hl_store_error_handling_mode_p", "VALID-HL-STORE-ERROR-HANDLING-MODE-P", 1, 0, false);
    declareFunction(myName, "hl_store_error_handling_mode", "HL-STORE-ERROR-HANDLING-MODE", 0, 0, false);
    declareFunction(myName, "hl_store_error", "HL-STORE-ERROR", 1, 0, false);
    declareMacro(myName, "with_hl_store_error_handling_mode", "WITH-HL-STORE-ERROR-HANDLING-MODE");
    declareMacro(myName, "with_hl_store_ignore_errors", "WITH-HL-STORE-IGNORE-ERRORS");
    declareMacro(myName, "with_hl_store_warn_on_errors", "WITH-HL-STORE-WARN-ON-ERRORS");
    declareMacro(myName, "with_hl_store_break_on_errors", "WITH-HL-STORE-BREAK-ON-ERRORS");
    declareFunction(myName, "reset_next_hl_store_iterator_id", "RESET-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
    declareFunction(myName, "candidate_next_hl_store_iterator_id", "CANDIDATE-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
    declareFunction(myName, "new_hl_store_iterator_id", "NEW-HL-STORE-ITERATOR-ID", 0, 0, false);
    declareFunction(myName, "note_hl_store_iterator", "NOTE-HL-STORE-ITERATOR", 1, 0, false);
    declareFunction(myName, "lookup_hl_store_iterator", "LOOKUP-HL-STORE-ITERATOR", 1, 0, false);
    declareFunction(myName, "unnote_hl_store_iterator", "UNNOTE-HL-STORE-ITERATOR", 1, 0, false);
    declareFunction(myName, "new_hl_store_iterator_int", "NEW-HL-STORE-ITERATOR-INT", 1, 0, false);
    declareFunction(myName, "hl_store_iterator_next_int", "HL-STORE-ITERATOR-NEXT-INT", 1, 0, false);
    declareFunction(myName, "hl_store_iterator_next_n_int", "HL-STORE-ITERATOR-NEXT-N-INT", 2, 0, false);
    declareFunction(myName, "hl_store_iterator_done_int", "HL-STORE-ITERATOR-DONE-INT", 1, 0, false);
    declareFunction(myName, "hl_store_iterator_destroy_int", "HL-STORE-ITERATOR-DESTROY-INT", 1, 0, false);
    declareFunction(myName, "new_hl_store_iterator", "NEW-HL-STORE-ITERATOR", 1, 1, false);
    declareFunction(myName, "destroy_hl_store_iterator", "DESTROY-HL-STORE-ITERATOR", 1, 0, false);
    declareFunction(myName, "create_hl_store_iterator", "CREATE-HL-STORE-ITERATOR", 1, 0, false);
    declareFunction(myName, "hl_store_iterator_doneP", "HL-STORE-ITERATOR-DONE?", 1, 0, false); new $hl_store_iterator_doneP$UnaryFunction();
    declareFunction(myName, "hl_store_iterator_next", "HL-STORE-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "hl_store_iterator_destroy", "HL-STORE-ITERATOR-DESTROY", 1, 0, false); new $hl_store_iterator_destroy$UnaryFunction();
    declareFunction(myName, "create_hl_store_buffered_iterator", "CREATE-HL-STORE-BUFFERED-ITERATOR", 2, 0, false);
    declareFunction(myName, "hl_store_buffered_iterator_doneP", "HL-STORE-BUFFERED-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "hl_store_buffered_iterator_next", "HL-STORE-BUFFERED-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "hl_store_buffered_iterator_destroy", "HL-STORE-BUFFERED-ITERATOR-DESTROY", 1, 0, false);
    declareFunction(myName, "open_hl_transcript", "OPEN-HL-TRANSCRIPT", 1, 0, false);
    declareFunction(myName, "close_hl_transcript", "CLOSE-HL-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 6, 0, false);
    declareFunction(myName, "note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 5, false);
    declareFunction(myName, "load_hl_transcript", "LOAD-HL-TRANSCRIPT", 1, 0, false);
    declareFunction(myName, "load_one_hl_transcript_op", "LOAD-ONE-HL-TRANSCRIPT-OP", 1, 0, false);
    declareFunction(myName, "eval_hl_transcript_op", "EVAL-HL-TRANSCRIPT-OP", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_hl_interface_infrastructure_file() {
    $hl_store_modification_and_access$ = defvar("*HL-STORE-MODIFICATION-AND-ACCESS*", $kw0$LOCAL_LOCAL);
    $override_hl_store_remote_accessP$ = defvar("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*", NIL);
    $remote_hl_store_image$ = deflexical("*REMOTE-HL-STORE-IMAGE*", maybeDefault( $sym8$_REMOTE_HL_STORE_IMAGE_, $remote_hl_store_image$, NIL));
    $remote_hl_store_connection_pool$ = deflexical("*REMOTE-HL-STORE-CONNECTION-POOL*", maybeDefault( $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_, $remote_hl_store_connection_pool$, ()-> (queues.create_queue())));
    $remote_hl_store_connection_pool_lock$ = deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*", Locks.make_lock($str10$Remote_HL_Store_Connection_Pool_L));
    $remote_hl_store_connection_pool_max_size$ = deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
    $hl_store_error_handling_mode$ = defparameter("*HL-STORE-ERROR-HANDLING-MODE*", NIL);
    $hl_store_iterators$ = deflexical("*HL-STORE-ITERATORS*", maybeDefault( $sym49$_HL_STORE_ITERATORS_, $hl_store_iterators$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED))));
    $next_hl_store_iterator_id$ = deflexical("*NEXT-HL-STORE-ITERATOR-ID*", maybeDefault( $sym50$_NEXT_HL_STORE_ITERATOR_ID_, $next_hl_store_iterator_id$, ()-> (ZERO_INTEGER)));
    $hl_store_iterator_lock$ = deflexical("*HL-STORE-ITERATOR-LOCK*", Locks.make_lock($str51$HL_Store_Iterator_Lock));
    $hl_transcript_stream$ = deflexical("*HL-TRANSCRIPT-STREAM*", maybeDefault( $sym67$_HL_TRANSCRIPT_STREAM_, $hl_transcript_stream$, NIL));
    return NIL;
  }

  public static final SubLObject setup_hl_interface_infrastructure_file() {
        subl_macro_promotions.declare_defglobal($sym8$_REMOTE_HL_STORE_IMAGE_);
    subl_macro_promotions.declare_defglobal($sym9$_REMOTE_HL_STORE_CONNECTION_POOL_);
    access_macros.register_macro_helper($sym34$DEFINE_HL_MODIFIER_PREAMBLE, $list35);
    access_macros.register_macro_helper($sym36$DEFINE_HL_MODIFIER_POSTAMBLE, $list35);
    subl_macro_promotions.declare_defglobal($sym49$_HL_STORE_ITERATORS_);
    subl_macro_promotions.declare_defglobal($sym50$_NEXT_HL_STORE_ITERATOR_ID_);
    subl_macro_promotions.declare_defglobal($sym67$_HL_TRANSCRIPT_STREAM_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$LOCAL_LOCAL = makeKeyword("LOCAL-LOCAL");
  public static final SubLSymbol $kw1$BOTH_LOCAL = makeKeyword("BOTH-LOCAL");
  public static final SubLSymbol $kw2$BOTH_REMOTE = makeKeyword("BOTH-REMOTE");
  public static final SubLSymbol $kw3$REMOTE_REMOTE = makeKeyword("REMOTE-REMOTE");
  public static final SubLSymbol $kw4$NONE_LOCAL = makeKeyword("NONE-LOCAL");
  public static final SubLSymbol $sym5$CLET = makeSymbol("CLET");
  public static final SubLList $list6 = list(list(makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), T));
  public static final SubLList $list7 = list(list(makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), NIL));
  public static final SubLSymbol $sym8$_REMOTE_HL_STORE_IMAGE_ = makeSymbol("*REMOTE-HL-STORE-IMAGE*");
  public static final SubLSymbol $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_ = makeSymbol("*REMOTE-HL-STORE-CONNECTION-POOL*");
  public static final SubLString $str10$Remote_HL_Store_Connection_Pool_L = makeString("Remote HL Store Connection Pool Lock");
  public static final SubLString $str11$Could_not_open_a_connection_to__s = makeString("Could not open a connection to ~s");
  public static final SubLSymbol $kw12$CFASL = makeKeyword("CFASL");
  public static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLList $list14 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym15$DEFINE_API = makeSymbol("DEFINE-API");
  public static final SubLSymbol $sym16$PROGN = makeSymbol("PROGN");
  public static final SubLList $list17 = list(makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE"));
  public static final SubLSymbol $sym18$NOTE_HL_MODIFIER_INVOCATION = makeSymbol("NOTE-HL-MODIFIER-INVOCATION");
  public static final SubLSymbol $sym19$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym20$PIF = makeSymbol("PIF");
  public static final SubLList $list21 = list(makeSymbol("HL-MODIFY-ANYWHERE?"));
  public static final SubLSymbol $sym22$WITHIN_HL_MODIFICATION = makeSymbol("WITHIN-HL-MODIFICATION");
  public static final SubLList $list23 = list(list(makeSymbol("RET"), NIL));
  public static final SubLSymbol $sym24$LIST = makeSymbol("LIST");
  public static final SubLList $list25 = list(makeSymbol("QUOTE"), makeSymbol("QUOTE"));
  public static final SubLSymbol $sym26$RESULT = makeUninternedSymbol("RESULT");
  public static final SubLSymbol $sym27$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list28 = list(makeSymbol("HL-MODIFY-REMOTE?"));
  public static final SubLSymbol $sym29$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym30$HL_STORE_REMOTE_EVAL = makeSymbol("HL-STORE-REMOTE-EVAL");
  public static final SubLList $list31 = list(makeSymbol("HL-MODIFY-LOCAL?"));
  public static final SubLSymbol $sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS = makeSymbol("OVERRIDE-REMOTE-HL-STORE-ACCESS");
  public static final SubLSymbol $sym33$RET = makeSymbol("RET");
  public static final SubLSymbol $sym34$DEFINE_HL_MODIFIER_PREAMBLE = makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE");
  public static final SubLList $list35 = list(makeSymbol("DEFINE-HL-MODIFIER"), makeSymbol("DEFINE-HL-CREATOR"));
  public static final SubLSymbol $sym36$DEFINE_HL_MODIFIER_POSTAMBLE = makeSymbol("DEFINE-HL-MODIFIER-POSTAMBLE");
  public static final SubLList $list37 = list(makeSymbol("HL-ACCESS-REMOTE?"));
  public static final SubLList $list38 = list(makeKeyword("IGNORE"), makeKeyword("WARN"), makeKeyword("BREAK"));
  public static final SubLSymbol $kw39$BREAK = makeKeyword("BREAK");
  public static final SubLSymbol $sym40$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw41$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw42$WARN = makeKeyword("WARN");
  public static final SubLList $list43 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym44$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list45 = list(makeSymbol("VALID-HL-STORE-ERROR-HANDLING-MODE-P"));
  public static final SubLSymbol $sym46$_HL_STORE_ERROR_HANDLING_MODE_ = makeSymbol("*HL-STORE-ERROR-HANDLING-MODE*");
  public static final SubLSymbol $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE = makeSymbol("WITH-HL-STORE-ERROR-HANDLING-MODE");
  public static final SubLList $list48 = list(list(makeSymbol("*INFERENCE-DEBUG?*"), T));
  public static final SubLSymbol $sym49$_HL_STORE_ITERATORS_ = makeSymbol("*HL-STORE-ITERATORS*");
  public static final SubLSymbol $sym50$_NEXT_HL_STORE_ITERATOR_ID_ = makeSymbol("*NEXT-HL-STORE-ITERATOR-ID*");
  public static final SubLString $str51$HL_Store_Iterator_Lock = makeString("HL Store Iterator Lock");
  public static final SubLSymbol $sym52$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym53$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym54$NEW_HL_STORE_ITERATOR_INT = makeSymbol("NEW-HL-STORE-ITERATOR-INT");
  public static final SubLSymbol $sym55$HL_STORE_ITERATOR_DONE_ = makeSymbol("HL-STORE-ITERATOR-DONE?");
  public static final SubLSymbol $sym56$HL_STORE_ITERATOR_NEXT = makeSymbol("HL-STORE-ITERATOR-NEXT");
  public static final SubLSymbol $sym57$HL_STORE_ITERATOR_DESTROY = makeSymbol("HL-STORE-ITERATOR-DESTROY");
  public static final SubLSymbol $sym58$HL_STORE_ITERATOR_DONE_INT = makeSymbol("HL-STORE-ITERATOR-DONE-INT");
  public static final SubLSymbol $sym59$HL_STORE_ITERATOR_NEXT_INT = makeSymbol("HL-STORE-ITERATOR-NEXT-INT");
  public static final SubLList $list60 = list(makeSymbol("NEXT"), makeSymbol("VALID?"));
  public static final SubLSymbol $sym61$HL_STORE_ITERATOR_DESTROY_INT = makeSymbol("HL-STORE-ITERATOR-DESTROY-INT");
  public static final SubLSymbol $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_ = makeSymbol("HL-STORE-BUFFERED-ITERATOR-DONE?");
  public static final SubLSymbol $sym63$HL_STORE_BUFFERED_ITERATOR_NEXT = makeSymbol("HL-STORE-BUFFERED-ITERATOR-NEXT");
  public static final SubLSymbol $sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY = makeSymbol("HL-STORE-BUFFERED-ITERATOR-DESTROY");
  public static final SubLList $list65 = list(makeSymbol("BUFFER"), makeSymbol("ID"), makeSymbol("N"));
  public static final SubLSymbol $sym66$HL_STORE_ITERATOR_NEXT_N_INT = makeSymbol("HL-STORE-ITERATOR-NEXT-N-INT");
  public static final SubLSymbol $sym67$_HL_TRANSCRIPT_STREAM_ = makeSymbol("*HL-TRANSCRIPT-STREAM*");
  public static final SubLSymbol $kw68$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $kw69$UNPROVIDED = makeKeyword("UNPROVIDED");
  public static final SubLSymbol $kw70$INPUT = makeKeyword("INPUT");
  public static final SubLString $str71$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $kw72$EOF = makeKeyword("EOF");

  //// Initializers

  public void declareFunctions() {
    declare_hl_interface_infrastructure_file();
  }

  public void initializeVariables() {
    init_hl_interface_infrastructure_file();
  }

  public void runTopLevelForms() {
    setup_hl_interface_infrastructure_file();
  }

}
