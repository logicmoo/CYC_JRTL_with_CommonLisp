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

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_interface_infrastructure;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class hl_modifiers extends SubLTranslatedFile {

  //// Constructor

  private hl_modifiers() {}
  public static final SubLFile me = new hl_modifiers();
  public static final String myName = "com.cyc.cycjava.cycl.hl_modifiers";

  //// Definitions

  @SubL(source = "cycl/hl-modifiers.lisp", position = 2951) 
  public static final SubLObject kb_create_asserted_argument_with_tv(SubLObject assertion, SubLObject tv) {
    {
      SubLObject truth = enumeration_types.tv_truth(tv);
      SubLObject strength = enumeration_types.tv_strength(tv);
      return kb_create_asserted_argument(assertion, truth, strength);
    }
  }

  /** Create an asserted argument for ASSERTION from TRUTH and STRENGTH,
and hook up all the indexing between them. */
  @SubL(source = "cycl/hl-modifiers.lisp", position = 3154) 
  public static final SubLObject kb_create_asserted_argument(SubLObject assertion, SubLObject truth, SubLObject strength) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym0$ASSERTION_P);
      checkType(truth, $sym1$TRUTH_P);
      checkType(strength, $sym2$EL_STRENGTH_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym4$KB_CREATE_ASSERTED_ARGUMENT, assertion, truth, strength, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29562");
        }
        if ((NIL != hl_interface_infrastructure.hl_modify_localP())) {
          {
            SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
              hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
              {
                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                  release = Locks.seize_lock(lock);
                  {
                    SubLObject tv = enumeration_types.tv_from_truth_strength(truth, strength);
                    SubLObject asserted_argument = arguments.create_asserted_argument(assertion, tv);
                    assertions_low.add_new_assertion_argument(assertion, asserted_argument);
                    return asserted_argument;
                  }
                } finally {
                  if ((NIL != release)) {
                    Locks.release_lock(lock);
                  }
                }
              }
            } finally {
              hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          return result;
        }
      }
    }
  }

  /** Remove ASSERTED-ARGUMENT for ASSERTION. */
  @SubL(source = "cycl/hl-modifiers.lisp", position = 3862) 
  public static final SubLObject kb_remove_asserted_argument(SubLObject assertion, SubLObject asserted_argument) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym0$ASSERTION_P);
      checkType(asserted_argument, $sym3$ASSERTED_ARGUMENT_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym11$KB_REMOVE_ASSERTED_ARGUMENT, assertion, asserted_argument, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29563");
        }
        if ((NIL != hl_interface_infrastructure.hl_modify_localP())) {
          {
            SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
              hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
              {
                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                  release = Locks.seize_lock(lock);
                  assertions_low.set_assertion_asserted_by(assertion, NIL);
                  assertions_low.set_assertion_asserted_when(assertion, NIL);
                  assertions_low.set_assertion_asserted_why(assertion, NIL);
                  assertions_low.set_assertion_asserted_second(assertion, NIL);
                  assertions_low.remove_assertion_argument(assertion, asserted_argument);
                  arguments.kb_remove_asserted_argument_internal(asserted_argument);
                  return assertion;
                } finally {
                  if ((NIL != release)) {
                    Locks.release_lock(lock);
                  }
                }
              }
            } finally {
              hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          return result;
        }
      }
    }
  }

  /** Assert (PRED ARG1 ARG2) in MT to the bookkeeping store. */
  @SubL(source = "cycl/hl-modifiers.lisp", position = 4776) 
  public static final SubLObject hl_assert_bookkeeping_binary_gaf(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(pred, $sym16$FORT_P);
      checkType(mt, $sym17$HLMT_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym18$HL_ASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29564");
        }
        if ((NIL != hl_interface_infrastructure.hl_modify_localP())) {
          {
            SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
              hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
              {
                SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                  release = Locks.seize_lock(lock);
                  return bookkeeping_store.assert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
                } finally {
                  if ((NIL != release)) {
                    Locks.release_lock(lock);
                  }
                }
              }
            } finally {
              hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          return result;
        }
      }
    }
  }

  public static final SubLObject declare_hl_modifiers_file() {
    declareFunction(myName, "possibly_replace_assertion_asserted_argument_with_tv", "POSSIBLY-REPLACE-ASSERTION-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
    declareFunction(myName, "replace_assertion_asserted_argument_with_tv", "REPLACE-ASSERTION-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
    declareFunction(myName, "replace_assertion_asserted_argument", "REPLACE-ASSERTION-ASSERTED-ARGUMENT", 4, 0, false);
    declareFunction(myName, "kb_create_asserted_argument_with_tv", "KB-CREATE-ASSERTED-ARGUMENT-WITH-TV", 2, 0, false);
    declareFunction(myName, "kb_create_asserted_argument", "KB-CREATE-ASSERTED-ARGUMENT", 3, 0, false);
    declareFunction(myName, "kb_remove_asserted_argument", "KB-REMOVE-ASSERTED-ARGUMENT", 2, 0, false);
    declareFunction(myName, "hl_assert_bookkeeping_binary_gaf", "HL-ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
    declareFunction(myName, "hl_unassert_bookkeeping_binary_gaf", "HL-UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_hl_modifiers_file() {
    return NIL;
  }

  public static final SubLObject setup_hl_modifiers_file() {
    // CVS_ID("Id: hl-modifiers.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym4$KB_CREATE_ASSERTED_ARGUMENT, $list7, $str8$Create_an_asserted_argument_for_A, $list9, $list10);
    utilities_macros.register_cyc_api_function($sym11$KB_REMOVE_ASSERTED_ARGUMENT, $list12, $str13$Remove_ASSERTED_ARGUMENT_for_ASSE, $list14, $list15);
    utilities_macros.register_cyc_api_function($sym18$HL_ASSERT_BOOKKEEPING_BINARY_GAF, $list19, $str20$Assert__PRED_ARG1_ARG2__in_MT_to_, $list21, $list22);
    utilities_macros.register_cyc_api_function($sym23$HL_UNASSERT_BOOKKEEPING_BINARY_GAF, $list19, $str24$Unassert__PRED_ARG1_ARG2__in_MT_f, $list21, $list22);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym1$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $sym2$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLSymbol $sym3$ASSERTED_ARGUMENT_P = makeSymbol("ASSERTED-ARGUMENT-P");
  public static final SubLSymbol $sym4$KB_CREATE_ASSERTED_ARGUMENT = makeSymbol("KB-CREATE-ASSERTED-ARGUMENT");
  public static final SubLSymbol $sym5$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");
  public static final SubLList $list7 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"), makeSymbol("STRENGTH"));
  public static final SubLString $str8$Create_an_asserted_argument_for_A = makeString("Create an asserted argument for ASSERTION from TRUTH and STRENGTH,\nand hook up all the indexing between them.");
  public static final SubLList $list9 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")), list(makeSymbol("STRENGTH"), makeSymbol("EL-STRENGTH-P")));
  public static final SubLList $list10 = list(makeSymbol("ASSERTED-ARGUMENT-P"));
  public static final SubLSymbol $sym11$KB_REMOVE_ASSERTED_ARGUMENT = makeSymbol("KB-REMOVE-ASSERTED-ARGUMENT");
  public static final SubLList $list12 = list(makeSymbol("ASSERTION"), makeSymbol("ASSERTED-ARGUMENT"));
  public static final SubLString $str13$Remove_ASSERTED_ARGUMENT_for_ASSE = makeString("Remove ASSERTED-ARGUMENT for ASSERTION.");
  public static final SubLList $list14 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("ASSERTED-ARGUMENT"), makeSymbol("ASSERTED-ARGUMENT-P")));
  public static final SubLList $list15 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym16$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym17$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym18$HL_ASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol("HL-ASSERT-BOOKKEEPING-BINARY-GAF");
  public static final SubLList $list19 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("MT"));
  public static final SubLString $str20$Assert__PRED_ARG1_ARG2__in_MT_to_ = makeString("Assert (PRED ARG1 ARG2) in MT to the bookkeeping store.");
  public static final SubLList $list21 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));
  public static final SubLList $list22 = list(makeSymbol("BOOLEAN"));
  public static final SubLSymbol $sym23$HL_UNASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol("HL-UNASSERT-BOOKKEEPING-BINARY-GAF");
  public static final SubLString $str24$Unassert__PRED_ARG1_ARG2__in_MT_f = makeString("Unassert (PRED ARG1 ARG2) in MT from the bookkeeping store.");

  //// Initializers

  public void declareFunctions() {
    declare_hl_modifiers_file();
  }

  public void initializeVariables() {
    init_hl_modifiers_file();
  }

  public void runTopLevelForms() {
    setup_hl_modifiers_file();
  }

}
