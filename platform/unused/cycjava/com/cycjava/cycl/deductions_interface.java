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
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deductions_low;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.hl_interface_infrastructure;
import com.cyc.cycjava.cycl.kb_hl_supports;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class deductions_interface extends SubLTranslatedFile {

  //// Constructor

  private deductions_interface() {}
  public static final SubLFile me = new deductions_interface();
  public static final String myName = "com.cyc.cycjava.cycl.deductions_interface";

  //// Definitions

  /** Create a new deduction consisting of SUPPORTS for ASSERTION.
   TRUTH is the truth value of the deduction.
   Hook up the indexing for the new deduction. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 1119) 
  public static final SubLObject kb_create_deduction(SubLObject assertion, SubLObject supports, SubLObject truth) {
    checkType(assertion, $sym0$SUPPORT_P);
    checkType(supports, $sym1$HL_JUSTIFICATION_P);
    checkType(truth, $sym2$TRUTH_P);
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation($sym3$KB_CREATE_DEDUCTION, assertion, supports, truth, UNPROVIDED, UNPROVIDED);
    if ((NIL != hl_interface_infrastructure.hl_modify_anywhereP())) {
      {
        SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          {
            SubLObject deduction = ((NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32156")) : kb_create_deduction_local(assertion, supports, truth));
            hl_interface_infrastructure.define_hl_modifier_postamble();
            return deduction;
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/deductions-interface.lisp", position = 2294) 
  public static final SubLObject kb_create_deduction_local(SubLObject assertion, SubLObject supports, SubLObject truth) {
    {
      SubLObject internal_id = deductions_low.kb_create_deduction_kb_store(assertion, supports, truth);
      return deduction_handles.find_deduction_by_id(internal_id);
    }
  }

  /** Remove DEDUCTION from the KB, and unhook its indexing. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 2531) 
  public static final SubLObject kb_remove_deduction(SubLObject deduction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(deduction, $sym10$DEDUCTION_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym11$KB_REMOVE_DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29551");
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
                  deductions_low.remove_deduction_dependents(deduction);
                  {
                    SubLObject deduction_assertion = deductions_high.deduction_assertion(deduction);
                    if ((NIL != assertion_handles.assertion_p(deduction_assertion))) {
                      if ((NIL != assertion_handles.valid_assertionP(deduction_assertion, UNPROVIDED))) {
                        assertions_low.remove_assertion_argument(deduction_assertion, deduction);
                      }
                    } else if ((NIL != arguments.hl_support_p(deduction_assertion))) {
                      {
                        SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support(deduction_assertion);
                        if ((NIL != kb_hl_support)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11044");
                        }
                      }
                    }
                  }
                  return deductions_low.kb_remove_deduction_internal(deduction);
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

  /** Return the deduction with ASSERTION, SUPPORTS, and TRUTH, if it exists.
   Return NIL otherwise. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 3346) 
  public static final SubLObject kb_lookup_deduction(SubLObject assertion, SubLObject supports, SubLObject truth) {
    checkType(assertion, $sym0$SUPPORT_P);
    checkType(supports, $sym1$HL_JUSTIFICATION_P);
    checkType(truth, $sym2$TRUTH_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29552");
    } else {
      return deductions_low.find_deduction_internal(assertion, supports, truth);
    }
  }

  /** Return the assertion for DEDUCTION. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 3763) 
  public static final SubLObject kb_deduction_assertion(SubLObject deduction) {
    checkType(deduction, $sym10$DEDUCTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29553");
    } else {
      return deductions_low.deduction_assertion_internal(deduction);
    }
  }

  /** Return the supports for DEDUCTION. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 3989) 
  public static final SubLObject kb_deduction_supports(SubLObject deduction) {
    checkType(deduction, $sym10$DEDUCTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29554");
    } else {
      return deductions_low.deduction_supports_internal(deduction);
    }
  }

  /** Return the truth for DEDUCTION. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 4220) 
  public static final SubLObject kb_deduction_truth(SubLObject deduction) {
    checkType(deduction, $sym10$DEDUCTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29555");
    } else {
      return deductions_low.deduction_truth_internal(deduction);
    }
  }

  /** Return the strength for DEDUCTION. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 4431) 
  public static final SubLObject kb_deduction_strength(SubLObject deduction) {
    checkType(deduction, $sym10$DEDUCTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29556");
    } else {
      return deductions_low.deduction_strength_internal(deduction);
    }
  }

  /** Change the strength of DEDUCTION to NEW-STRENGTH. */
  @SubL(source = "cycl/deductions-interface.lisp", position = 4657) 
  public static final SubLObject kb_set_deduction_strength(SubLObject deduction, SubLObject new_strength) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(deduction, $sym10$DEDUCTION_P);
      checkType(new_strength, $sym32$EL_STRENGTH_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym33$KB_SET_DEDUCTION_STRENGTH, deduction, new_strength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29557");
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
                    SubLObject old_strength = arguments.argument_strength(deduction);
                    SubLObject result_1 = deductions_low.kb_set_deduction_strength_internal(deduction, new_strength);
                    return result_1;
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

  public static final SubLObject declare_deductions_interface_file() {
    declareFunction(myName, "kb_create_deduction", "KB-CREATE-DEDUCTION", 3, 0, false);
    declareFunction(myName, "kb_create_deduction_remote", "KB-CREATE-DEDUCTION-REMOTE", 3, 0, false);
    declareFunction(myName, "kb_create_deduction_local", "KB-CREATE-DEDUCTION-LOCAL", 3, 0, false);
    declareFunction(myName, "kb_remove_deduction", "KB-REMOVE-DEDUCTION", 1, 0, false);
    declareFunction(myName, "kb_lookup_deduction", "KB-LOOKUP-DEDUCTION", 3, 0, false);
    declareFunction(myName, "kb_deduction_assertion", "KB-DEDUCTION-ASSERTION", 1, 0, false);
    declareFunction(myName, "kb_deduction_supports", "KB-DEDUCTION-SUPPORTS", 1, 0, false);
    declareFunction(myName, "kb_deduction_truth", "KB-DEDUCTION-TRUTH", 1, 0, false);
    declareFunction(myName, "kb_deduction_strength", "KB-DEDUCTION-STRENGTH", 1, 0, false);
    declareFunction(myName, "kb_set_deduction_strength", "KB-SET-DEDUCTION-STRENGTH", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_deductions_interface_file() {
    return NIL;
  }

  public static final SubLObject setup_deductions_interface_file() {
    // CVS_ID("Id: deductions-interface.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym3$KB_CREATE_DEDUCTION, $list5, $str6$Create_a_new_deduction_consisting, $list7, $list8);
    utilities_macros.register_cyc_api_function($sym11$KB_REMOVE_DEDUCTION, $list13, $str14$Remove_DEDUCTION_from_the_KB__and, $list15, $list16);
    utilities_macros.register_cyc_api_function($sym17$KB_LOOKUP_DEDUCTION, $list5, $str18$Return_the_deduction_with_ASSERTI, $list7, $list19);
    utilities_macros.register_cyc_api_function($sym20$KB_DEDUCTION_ASSERTION, $list13, $str21$Return_the_assertion_for_DEDUCTIO, $list15, $list22);
    utilities_macros.register_cyc_api_function($sym23$KB_DEDUCTION_SUPPORTS, $list13, $str24$Return_the_supports_for_DEDUCTION, $list15, $list25);
    utilities_macros.register_cyc_api_function($sym26$KB_DEDUCTION_TRUTH, $list13, $str27$Return_the_truth_for_DEDUCTION_, $list15, $list28);
    utilities_macros.register_cyc_api_function($sym29$KB_DEDUCTION_STRENGTH, $list13, $str30$Return_the_strength_for_DEDUCTION, $list15, $list31);
    utilities_macros.register_cyc_api_function($sym33$KB_SET_DEDUCTION_STRENGTH, $list34, $str35$Change_the_strength_of_DEDUCTION_, $list36, $list8);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SUPPORT_P = makeSymbol("SUPPORT-P");
  public static final SubLSymbol $sym1$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLSymbol $sym2$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $sym3$KB_CREATE_DEDUCTION = makeSymbol("KB-CREATE-DEDUCTION");
  public static final SubLSymbol $sym4$_EXIT = makeSymbol("%EXIT");
  public static final SubLList $list5 = list(makeSymbol("ASSERTION"), makeSymbol("SUPPORTS"), makeSymbol("TRUTH"));
  public static final SubLString $str6$Create_a_new_deduction_consisting = makeString("Create a new deduction consisting of SUPPORTS for ASSERTION.\n   TRUTH is the truth value of the deduction.\n   Hook up the indexing for the new deduction.");
  public static final SubLList $list7 = list(list(makeSymbol("ASSERTION"), makeSymbol("SUPPORT-P")), list(makeSymbol("SUPPORTS"), makeSymbol("HL-JUSTIFICATION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLList $list8 = list(makeSymbol("DEDUCTION-P"));
  public static final SubLSymbol $sym9$KB_CREATE_DEDUCTION_KB_STORE = makeSymbol("KB-CREATE-DEDUCTION-KB-STORE");
  public static final SubLSymbol $sym10$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $sym11$KB_REMOVE_DEDUCTION = makeSymbol("KB-REMOVE-DEDUCTION");
  public static final SubLSymbol $sym12$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list13 = list(makeSymbol("DEDUCTION"));
  public static final SubLString $str14$Remove_DEDUCTION_from_the_KB__and = makeString("Remove DEDUCTION from the KB, and unhook its indexing.");
  public static final SubLList $list15 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")));
  public static final SubLList $list16 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym17$KB_LOOKUP_DEDUCTION = makeSymbol("KB-LOOKUP-DEDUCTION");
  public static final SubLString $str18$Return_the_deduction_with_ASSERTI = makeString("Return the deduction with ASSERTION, SUPPORTS, and TRUTH, if it exists.\n   Return NIL otherwise.");
  public static final SubLList $list19 = list(list(makeSymbol("NIL-OR"), makeSymbol("DEDUCTION-P")));
  public static final SubLSymbol $sym20$KB_DEDUCTION_ASSERTION = makeSymbol("KB-DEDUCTION-ASSERTION");
  public static final SubLString $str21$Return_the_assertion_for_DEDUCTIO = makeString("Return the assertion for DEDUCTION.");
  public static final SubLList $list22 = list(makeSymbol("SUPPORT-P"));
  public static final SubLSymbol $sym23$KB_DEDUCTION_SUPPORTS = makeSymbol("KB-DEDUCTION-SUPPORTS");
  public static final SubLString $str24$Return_the_supports_for_DEDUCTION = makeString("Return the supports for DEDUCTION.");
  public static final SubLList $list25 = list(makeSymbol("HL-JUSTIFICATION-P"));
  public static final SubLSymbol $sym26$KB_DEDUCTION_TRUTH = makeSymbol("KB-DEDUCTION-TRUTH");
  public static final SubLString $str27$Return_the_truth_for_DEDUCTION_ = makeString("Return the truth for DEDUCTION.");
  public static final SubLList $list28 = list(makeSymbol("TRUTH-P"));
  public static final SubLSymbol $sym29$KB_DEDUCTION_STRENGTH = makeSymbol("KB-DEDUCTION-STRENGTH");
  public static final SubLString $str30$Return_the_strength_for_DEDUCTION = makeString("Return the strength for DEDUCTION.");
  public static final SubLList $list31 = list(makeSymbol("EL-STRENGTH-P"));
  public static final SubLSymbol $sym32$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLSymbol $sym33$KB_SET_DEDUCTION_STRENGTH = makeSymbol("KB-SET-DEDUCTION-STRENGTH");
  public static final SubLList $list34 = list(makeSymbol("DEDUCTION"), makeSymbol("NEW-STRENGTH"));
  public static final SubLString $str35$Change_the_strength_of_DEDUCTION_ = makeString("Change the strength of DEDUCTION to NEW-STRENGTH.");
  public static final SubLList $list36 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")), list(makeSymbol("NEW-STRENGTH"), makeSymbol("EL-STRENGTH-P")));

  //// Initializers

  public void declareFunctions() {
    declare_deductions_interface_file();
  }

  public void initializeVariables() {
    init_deductions_interface_file();
  }

  public void runTopLevelForms() {
    setup_deductions_interface_file();
  }

}
