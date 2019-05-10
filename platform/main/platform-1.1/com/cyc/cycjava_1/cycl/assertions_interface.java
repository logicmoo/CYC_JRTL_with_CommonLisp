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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.assertions_low;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.hl_interface_infrastructure;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class assertions_interface extends SubLTranslatedFile {

  //// Constructor

  private assertions_interface() {}
  public static final SubLFile me = new assertions_interface();
  public static final String myName = "com.cyc.cycjava_1.cycl.assertions_interface";

  //// Definitions

  /** Create a new assertion with CNF in MT. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 1629) 
  public static final SubLObject kb_create_assertion(SubLObject cnf, SubLObject mt) {
    checkType(cnf, $sym0$CNF_P);
    checkType(mt, $sym1$HLMT_P);
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation($sym2$KB_CREATE_ASSERTION, cnf, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    if ((NIL != hl_interface_infrastructure.hl_modify_anywhereP())) {
      {
        SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          {
            SubLObject assertion = ((NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32157")) : kb_create_assertion_local(cnf, mt));
            hl_interface_infrastructure.define_hl_modifier_postamble();
            return assertion;
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

  @SubL(source = "cycl/assertions-interface.lisp", position = 2495) 
  public static final SubLObject kb_create_assertion_local(SubLObject cnf, SubLObject mt) {
    {
      SubLObject internal_id = assertions_low.kb_create_assertion_kb_store(cnf, mt);
      return assertion_handles.find_assertion_by_id(internal_id);
    }
  }

  /** Remove ASSERTION from the KB. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 2696) 
  public static final SubLObject kb_remove_assertion(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym10$KB_REMOVE_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29510");
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
                  return assertions_low.kb_remove_assertion_internal(assertion);
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

  /** Return the CNF for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 3214) 
  public static final SubLObject kb_assertion_cnf(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29511");
    } else {
      return assertions_low.assertion_cnf_internal(assertion);
    }
  }

  /** Return the CNF for ASSERTION or NIL. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 3501) 
  public static final SubLObject kb_possibly_assertion_cnf(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29512");
    } else {
      return assertions_low.possibly_assertion_cnf_internal(assertion);
    }
  }

  /** Return the MT for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 3738) 
  public static final SubLObject kb_assertion_mt(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29513");
    } else {
      return assertions_low.assertion_mt_internal(assertion);
    }
  }

  /** Return the assertion with CNF and MT, if it exists.
   Return NIL otherwise. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 3939) 
  public static final SubLObject kb_lookup_assertion(SubLObject cnf, SubLObject mt) {
    checkType(cnf, $sym0$CNF_P);
    checkType(mt, $sym1$HLMT_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29514");
    } else {
      return kb_indexing.find_assertion_internal(cnf, mt);
    }
  }

  /** Return T iff ASSERTION is a ground atomic formula (gaf). */
  @SubL(source = "cycl/assertions-interface.lisp", position = 4207) 
  public static final SubLObject kb_gaf_assertionP(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29515");
    } else {
      return assertions_low.assertion_gaf_p(assertion);
    }
  }

  /** Returns the HL clause of ASSERTION if it's a gaf, otherwise returns nil.
   Ignores the truth - i.e. returns <blah> instead of (#$not <blah>) for negated gafs. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 4505) 
  public static final SubLObject kb_assertion_gaf_hl_formula(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29516");
    } else {
      return assertions_low.assertion_gaf_hl_formula_internal(assertion);
    }
  }

  /** Returns a CNF or GAF HL formula. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 5080) 
  public static final SubLObject kb_assertion_cons(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29517");
    } else {
      return assertions_low.assertion_cons_internal(assertion);
    }
  }

  /** Return the direction of ASSERTION (either :backward, :forward or :code). */
  @SubL(source = "cycl/assertions-interface.lisp", position = 5343) 
  public static final SubLObject kb_assertion_direction(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29518");
    } else {
      return assertions_low.assertion_direction_internal(assertion);
    }
  }

  /** Return the current truth of ASSERTION -- either :true :false or :unknown. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 5643) 
  public static final SubLObject kb_assertion_truth(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29519");
    } else {
      return assertions_low.assertion_truth_internal(assertion);
    }
  }

  /** Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 5920) 
  public static final SubLObject kb_assertion_strength(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29520");
    } else {
      return assertions_low.assertion_strength_internal(assertion);
    }
  }

  /** Return the variable names for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 6244) 
  public static final SubLObject kb_assertion_variable_names(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29521");
    } else {
      return assertions_low.assertion_variable_names_internal(assertion);
    }
  }

  /** Return the asserted-by bookkeeping info for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 6500) 
  public static final SubLObject kb_assertion_asserted_by(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29522");
    } else {
      return assertions_low.asserted_by_internal(assertion);
    }
  }

  /** Return the asserted-when bookkeeping info for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 6761) 
  public static final SubLObject kb_assertion_asserted_when(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29523");
    } else {
      return assertions_low.asserted_when_internal(assertion);
    }
  }

  /** Return the asserted-why bookkeeping info for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 7021) 
  public static final SubLObject kb_assertion_asserted_why(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29524");
    } else {
      return assertions_low.asserted_why_internal(assertion);
    }
  }

  /** Return the asserted-second bookkeeping info for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 7268) 
  public static final SubLObject kb_assertion_asserted_second(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29525");
    } else {
      return assertions_low.asserted_second_internal(assertion);
    }
  }

  /** Change direction of ASSERTION to NEW-DIRECTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 7536) 
  public static final SubLObject kb_set_assertion_direction(SubLObject assertion, SubLObject new_direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      checkType(new_direction, $sym60$DIRECTION_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym61$KB_SET_ASSERTION_DIRECTION, assertion, new_direction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29526");
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
                    SubLObject old_direction = assertions_high.assertion_direction(assertion);
                    SubLObject result_1 = assertions_low.kb_set_assertion_direction_internal(assertion, new_direction);
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

  /** Change the truth of ASSERTION to NEW-TRUTH. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 8095) 
  public static final SubLObject kb_set_assertion_truth(SubLObject assertion, SubLObject new_truth) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      checkType(new_truth, $sym65$TRUTH_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym66$KB_SET_ASSERTION_TRUTH, assertion, new_truth, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29527");
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
                    SubLObject old_truth = assertions_high.assertion_truth(assertion);
                    SubLObject result_2 = assertions_low.reset_assertion_truth(assertion, new_truth);
                    return result_2;
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

  /** Change the strength of ASSERTION to NEW-STRENGTH. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 8558) 
  public static final SubLObject kb_set_assertion_strength(SubLObject assertion, SubLObject new_strength) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      checkType(new_strength, $sym70$EL_STRENGTH_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym71$KB_SET_ASSERTION_STRENGTH, assertion, new_strength, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29528");
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
                    SubLObject old_strength = assertions_high.assertion_strength(assertion);
                    SubLObject result_3 = assertions_low.reset_assertion_strength(assertion, new_strength);
                    return result_3;
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

  /** Change the variable names for ASSERTION to NEW-VARIABLE-NAMES. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 9069) 
  public static final SubLObject kb_set_assertion_variable_names(SubLObject assertion, SubLObject new_variable_names) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      checkType(new_variable_names, $sym75$LISTP);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym76$KB_SET_ASSERTION_VARIABLE_NAMES, assertion, new_variable_names, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29529");
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
                    SubLObject old_var_names = assertions_high.assertion_variable_names(assertion);
                    SubLObject result_4 = assertions_low.reset_assertion_variable_names(assertion, new_variable_names);
                    return result_4;
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

  /** Set the asserted-by bookkeeping info for ASSERTION to ASSERTOR. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 9633) 
  public static final SubLObject kb_set_assertion_asserted_by(SubLObject assertion, SubLObject assertor) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      if ((NIL != assertor)) {
        checkType(assertor, $sym80$FORT_P);
      }
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym81$KB_SET_ASSERTION_ASSERTED_BY, assertion, assertor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29530");
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
                    SubLObject old_assertor = assertions_high.asserted_by(assertion);
                    SubLObject result_5 = assertions_low.set_assertion_asserted_by(assertion, assertor);
                    return result_5;
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

  /** Set the asserted-when bookkeeping info for ASSERTION to UNIVERSAL-DATE. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 10143) 
  public static final SubLObject kb_set_assertion_asserted_when(SubLObject assertion, SubLObject universal_date) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      if ((NIL != universal_date)) {
        checkType(universal_date, $sym85$UNIVERSAL_DATE_P);
      }
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym86$KB_SET_ASSERTION_ASSERTED_WHEN, assertion, universal_date, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29531");
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
                    SubLObject old_when = assertions_high.asserted_when(assertion);
                    SubLObject result_6 = assertions_low.set_assertion_asserted_when(assertion, universal_date);
                    return result_6;
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

  /** Set the asserted-why bookkeeping info for ASSERTION to REASON. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 10694) 
  public static final SubLObject kb_set_assertion_asserted_why(SubLObject assertion, SubLObject reason) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      if ((NIL != reason)) {
        checkType(reason, $sym80$FORT_P);
      }
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym90$KB_SET_ASSERTION_ASSERTED_WHY, assertion, reason, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29532");
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
                    SubLObject old_reason = assertions_high.asserted_why(assertion);
                    SubLObject result_7 = assertions_low.set_assertion_asserted_why(assertion, reason);
                    return result_7;
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

  /** Set the asserted-second bookkeeping info for ASSERTION to UNIVERSAL-SECOND. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 11194) 
  public static final SubLObject kb_set_assertion_asserted_second(SubLObject assertion, SubLObject universal_second) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym9$ASSERTION_P);
      if ((NIL != universal_second)) {
        checkType(universal_second, $sym94$UNIVERSAL_SECOND_P);
      }
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym95$KB_SET_ASSERTION_ASSERTED_SECOND, assertion, universal_second, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29533");
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
                    SubLObject old_seconds = assertions_high.asserted_second(assertion);
                    SubLObject result_8 = assertions_low.set_assertion_asserted_second(assertion, universal_second);
                    return result_8;
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

  /** Return the arguments for ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 11778) 
  public static final SubLObject kb_assertion_arguments(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29534");
    } else {
      return assertions_low.assertion_arguments_internal(assertion);
    }
  }

  /** Return the dependents of ASSERTION. */
  @SubL(source = "cycl/assertions-interface.lisp", position = 12202) 
  public static final SubLObject kb_assertion_dependents(SubLObject assertion) {
    checkType(assertion, $sym9$ASSERTION_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29535");
    } else {
      return assertions_low.assertion_dependents_internal(assertion);
    }
  }

  public static final SubLObject declare_assertions_interface_file() {
    declareFunction(myName, "kb_create_assertion", "KB-CREATE-ASSERTION", 2, 0, false);
    declareFunction(myName, "kb_create_assertion_remote", "KB-CREATE-ASSERTION-REMOTE", 2, 0, false);
    declareFunction(myName, "kb_create_assertion_local", "KB-CREATE-ASSERTION-LOCAL", 2, 0, false);
    declareFunction(myName, "kb_remove_assertion", "KB-REMOVE-ASSERTION", 1, 0, false);
    declareFunction(myName, "kb_assertion_cnf", "KB-ASSERTION-CNF", 1, 0, false);
    declareFunction(myName, "kb_possibly_assertion_cnf", "KB-POSSIBLY-ASSERTION-CNF", 1, 0, false);
    declareFunction(myName, "kb_assertion_mt", "KB-ASSERTION-MT", 1, 0, false);
    declareFunction(myName, "kb_lookup_assertion", "KB-LOOKUP-ASSERTION", 2, 0, false);
    declareFunction(myName, "kb_gaf_assertionP", "KB-GAF-ASSERTION?", 1, 0, false);
    declareFunction(myName, "kb_assertion_gaf_hl_formula", "KB-ASSERTION-GAF-HL-FORMULA", 1, 0, false);
    declareFunction(myName, "kb_assertion_cons", "KB-ASSERTION-CONS", 1, 0, false);
    declareFunction(myName, "kb_assertion_direction", "KB-ASSERTION-DIRECTION", 1, 0, false);
    declareFunction(myName, "kb_assertion_truth", "KB-ASSERTION-TRUTH", 1, 0, false);
    declareFunction(myName, "kb_assertion_strength", "KB-ASSERTION-STRENGTH", 1, 0, false);
    declareFunction(myName, "kb_assertion_variable_names", "KB-ASSERTION-VARIABLE-NAMES", 1, 0, false);
    declareFunction(myName, "kb_assertion_asserted_by", "KB-ASSERTION-ASSERTED-BY", 1, 0, false);
    declareFunction(myName, "kb_assertion_asserted_when", "KB-ASSERTION-ASSERTED-WHEN", 1, 0, false);
    declareFunction(myName, "kb_assertion_asserted_why", "KB-ASSERTION-ASSERTED-WHY", 1, 0, false);
    declareFunction(myName, "kb_assertion_asserted_second", "KB-ASSERTION-ASSERTED-SECOND", 1, 0, false);
    declareFunction(myName, "kb_set_assertion_direction", "KB-SET-ASSERTION-DIRECTION", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_truth", "KB-SET-ASSERTION-TRUTH", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_strength", "KB-SET-ASSERTION-STRENGTH", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_variable_names", "KB-SET-ASSERTION-VARIABLE-NAMES", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_asserted_by", "KB-SET-ASSERTION-ASSERTED-BY", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_asserted_when", "KB-SET-ASSERTION-ASSERTED-WHEN", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_asserted_why", "KB-SET-ASSERTION-ASSERTED-WHY", 2, 0, false);
    declareFunction(myName, "kb_set_assertion_asserted_second", "KB-SET-ASSERTION-ASSERTED-SECOND", 2, 0, false);
    declareFunction(myName, "kb_assertion_arguments", "KB-ASSERTION-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "kb_assertion_dependents", "KB-ASSERTION-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "all_dependent_assertions", "ALL-DEPENDENT-ASSERTIONS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_assertions_interface_file() {
    return NIL;
  }

  public static final SubLObject setup_assertions_interface_file() {
    // CVS_ID("Id: assertions-interface.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym2$KB_CREATE_ASSERTION, $list4, $str5$Create_a_new_assertion_with_CNF_i, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym10$KB_REMOVE_ASSERTION, $list12, $str13$Remove_ASSERTION_from_the_KB_, $list14, $list15);
    utilities_macros.register_cyc_api_function($sym16$KB_ASSERTION_CNF, $list12, $str17$Return_the_CNF_for_ASSERTION_, $list14, $list18);
    utilities_macros.register_cyc_api_function($sym19$KB_POSSIBLY_ASSERTION_CNF, $list12, $str20$Return_the_CNF_for_ASSERTION_or_N, $list14, $list21);
    utilities_macros.register_cyc_api_function($sym22$KB_ASSERTION_MT, $list12, $str23$Return_the_MT_for_ASSERTION_, $list14, $list24);
    utilities_macros.register_cyc_api_function($sym25$KB_LOOKUP_ASSERTION, $list4, $str26$Return_the_assertion_with_CNF_and, $list6, $list27);
    utilities_macros.register_cyc_api_function($sym28$KB_GAF_ASSERTION_, $list12, $str29$Return_T_iff_ASSERTION_is_a_groun, $list14, $list30);
    utilities_macros.register_cyc_api_function($sym31$KB_ASSERTION_GAF_HL_FORMULA, $list12, $str32$Returns_the_HL_clause_of_ASSERTIO, $list14, $list33);
    utilities_macros.register_cyc_api_function($sym34$KB_ASSERTION_CONS, $list12, $str35$Returns_a_CNF_or_GAF_HL_formula_, $list14, $list36);
    utilities_macros.register_cyc_api_function($sym37$KB_ASSERTION_DIRECTION, $list12, $str38$Return_the_direction_of_ASSERTION, $list14, $list39);
    utilities_macros.register_cyc_api_function($sym40$KB_ASSERTION_TRUTH, $list12, $str41$Return_the_current_truth_of_ASSER, $list14, $list42);
    utilities_macros.register_cyc_api_function($sym43$KB_ASSERTION_STRENGTH, $list12, $str44$Return_the_current_argumentation_, $list14, $list45);
    utilities_macros.register_cyc_api_function($sym46$KB_ASSERTION_VARIABLE_NAMES, $list12, $str47$Return_the_variable_names_for_ASS, $list14, $list48);
    utilities_macros.register_cyc_api_function($sym49$KB_ASSERTION_ASSERTED_BY, $list12, $str50$Return_the_asserted_by_bookkeepin, $list14, $list51);
    utilities_macros.register_cyc_api_function($sym52$KB_ASSERTION_ASSERTED_WHEN, $list12, $str53$Return_the_asserted_when_bookkeep, $list14, $list54);
    utilities_macros.register_cyc_api_function($sym55$KB_ASSERTION_ASSERTED_WHY, $list12, $str56$Return_the_asserted_why_bookkeepi, $list14, $list51);
    utilities_macros.register_cyc_api_function($sym57$KB_ASSERTION_ASSERTED_SECOND, $list12, $str58$Return_the_asserted_second_bookke, $list14, $list59);
    utilities_macros.register_cyc_api_function($sym61$KB_SET_ASSERTION_DIRECTION, $list62, $str63$Change_direction_of_ASSERTION_to_, $list64, $list7);
    utilities_macros.register_cyc_api_function($sym66$KB_SET_ASSERTION_TRUTH, $list67, $str68$Change_the_truth_of_ASSERTION_to_, $list69, $list7);
    utilities_macros.register_cyc_api_function($sym71$KB_SET_ASSERTION_STRENGTH, $list72, $str73$Change_the_strength_of_ASSERTION_, $list74, $list7);
    utilities_macros.register_cyc_api_function($sym76$KB_SET_ASSERTION_VARIABLE_NAMES, $list77, $str78$Change_the_variable_names_for_ASS, $list79, $list7);
    utilities_macros.register_cyc_api_function($sym81$KB_SET_ASSERTION_ASSERTED_BY, $list82, $str83$Set_the_asserted_by_bookkeeping_i, $list84, $list7);
    utilities_macros.register_cyc_api_function($sym86$KB_SET_ASSERTION_ASSERTED_WHEN, $list87, $str88$Set_the_asserted_when_bookkeeping, $list89, $list7);
    utilities_macros.register_cyc_api_function($sym90$KB_SET_ASSERTION_ASSERTED_WHY, $list91, $str92$Set_the_asserted_why_bookkeeping_, $list93, $list7);
    utilities_macros.register_cyc_api_function($sym95$KB_SET_ASSERTION_ASSERTED_SECOND, $list96, $str97$Set_the_asserted_second_bookkeepi, $list98, $list7);
    utilities_macros.register_cyc_api_function($sym99$KB_ASSERTION_ARGUMENTS, $list12, $str100$Return_the_arguments_for_ASSERTIO, $list14, $list48);
    utilities_macros.register_cyc_api_function($sym101$KB_ASSERTION_DEPENDENTS, $list12, $str102$Return_the_dependents_of_ASSERTIO, $list14, $list48);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $sym1$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym2$KB_CREATE_ASSERTION = makeSymbol("KB-CREATE-ASSERTION");
  public static final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");
  public static final SubLList $list4 = list(makeSymbol("CNF"), makeSymbol("MT"));
  public static final SubLString $str5$Create_a_new_assertion_with_CNF_i = makeString("Create a new assertion with CNF in MT.");
  public static final SubLList $list6 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));
  public static final SubLList $list7 = list(makeSymbol("ASSERTION-P"));
  public static final SubLSymbol $sym8$KB_CREATE_ASSERTION_KB_STORE = makeSymbol("KB-CREATE-ASSERTION-KB-STORE");
  public static final SubLSymbol $sym9$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym10$KB_REMOVE_ASSERTION = makeSymbol("KB-REMOVE-ASSERTION");
  public static final SubLSymbol $sym11$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list12 = list(makeSymbol("ASSERTION"));
  public static final SubLString $str13$Remove_ASSERTION_from_the_KB_ = makeString("Remove ASSERTION from the KB.");
  public static final SubLList $list14 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));
  public static final SubLList $list15 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym16$KB_ASSERTION_CNF = makeSymbol("KB-ASSERTION-CNF");
  public static final SubLString $str17$Return_the_CNF_for_ASSERTION_ = makeString("Return the CNF for ASSERTION.");
  public static final SubLList $list18 = list(makeSymbol("CNF-P"));
  public static final SubLSymbol $sym19$KB_POSSIBLY_ASSERTION_CNF = makeSymbol("KB-POSSIBLY-ASSERTION-CNF");
  public static final SubLString $str20$Return_the_CNF_for_ASSERTION_or_N = makeString("Return the CNF for ASSERTION or NIL.");
  public static final SubLList $list21 = list(list(makeSymbol("NIL-OR"), makeSymbol("CNF-P")));
  public static final SubLSymbol $sym22$KB_ASSERTION_MT = makeSymbol("KB-ASSERTION-MT");
  public static final SubLString $str23$Return_the_MT_for_ASSERTION_ = makeString("Return the MT for ASSERTION.");
  public static final SubLList $list24 = list(makeSymbol("HLMT-P"));
  public static final SubLSymbol $sym25$KB_LOOKUP_ASSERTION = makeSymbol("KB-LOOKUP-ASSERTION");
  public static final SubLString $str26$Return_the_assertion_with_CNF_and = makeString("Return the assertion with CNF and MT, if it exists.\n   Return NIL otherwise.");
  public static final SubLList $list27 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $sym28$KB_GAF_ASSERTION_ = makeSymbol("KB-GAF-ASSERTION?");
  public static final SubLString $str29$Return_T_iff_ASSERTION_is_a_groun = makeString("Return T iff ASSERTION is a ground atomic formula (gaf).");
  public static final SubLList $list30 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym31$KB_ASSERTION_GAF_HL_FORMULA = makeSymbol("KB-ASSERTION-GAF-HL-FORMULA");
  public static final SubLString $str32$Returns_the_HL_clause_of_ASSERTIO = makeString("Returns the HL clause of ASSERTION if it's a gaf, otherwise returns nil.\n   Ignores the truth - i.e. returns <blah> instead of (#$not <blah>) for negated gafs.");
  public static final SubLList $list33 = list(makeSymbol("POSSIBLY-SENTENCE-P"));
  public static final SubLSymbol $sym34$KB_ASSERTION_CONS = makeSymbol("KB-ASSERTION-CONS");
  public static final SubLString $str35$Returns_a_CNF_or_GAF_HL_formula_ = makeString("Returns a CNF or GAF HL formula.");
  public static final SubLList $list36 = list(makeSymbol("CONSP"));
  public static final SubLSymbol $sym37$KB_ASSERTION_DIRECTION = makeSymbol("KB-ASSERTION-DIRECTION");
  public static final SubLString $str38$Return_the_direction_of_ASSERTION = makeString("Return the direction of ASSERTION (either :backward, :forward or :code).");
  public static final SubLList $list39 = list(makeSymbol("DIRECTION-P"));
  public static final SubLSymbol $sym40$KB_ASSERTION_TRUTH = makeSymbol("KB-ASSERTION-TRUTH");
  public static final SubLString $str41$Return_the_current_truth_of_ASSER = makeString("Return the current truth of ASSERTION -- either :true :false or :unknown.");
  public static final SubLList $list42 = list(makeSymbol("TRUTH-P"));
  public static final SubLSymbol $sym43$KB_ASSERTION_STRENGTH = makeSymbol("KB-ASSERTION-STRENGTH");
  public static final SubLString $str44$Return_the_current_argumentation_ = makeString("Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.");
  public static final SubLList $list45 = list(makeSymbol("EL-STRENGTH-P"));
  public static final SubLSymbol $sym46$KB_ASSERTION_VARIABLE_NAMES = makeSymbol("KB-ASSERTION-VARIABLE-NAMES");
  public static final SubLString $str47$Return_the_variable_names_for_ASS = makeString("Return the variable names for ASSERTION.");
  public static final SubLList $list48 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym49$KB_ASSERTION_ASSERTED_BY = makeSymbol("KB-ASSERTION-ASSERTED-BY");
  public static final SubLString $str50$Return_the_asserted_by_bookkeepin = makeString("Return the asserted-by bookkeeping info for ASSERTION.");
  public static final SubLList $list51 = list(list(makeSymbol("NIL-OR"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym52$KB_ASSERTION_ASSERTED_WHEN = makeSymbol("KB-ASSERTION-ASSERTED-WHEN");
  public static final SubLString $str53$Return_the_asserted_when_bookkeep = makeString("Return the asserted-when bookkeeping info for ASSERTION.");
  public static final SubLList $list54 = list(list(makeSymbol("NIL-OR"), makeSymbol("UNIVERSAL-DATE-P")));
  public static final SubLSymbol $sym55$KB_ASSERTION_ASSERTED_WHY = makeSymbol("KB-ASSERTION-ASSERTED-WHY");
  public static final SubLString $str56$Return_the_asserted_why_bookkeepi = makeString("Return the asserted-why bookkeeping info for ASSERTION.");
  public static final SubLSymbol $sym57$KB_ASSERTION_ASSERTED_SECOND = makeSymbol("KB-ASSERTION-ASSERTED-SECOND");
  public static final SubLString $str58$Return_the_asserted_second_bookke = makeString("Return the asserted-second bookkeeping info for ASSERTION.");
  public static final SubLList $list59 = list(list(makeSymbol("NIL-OR"), makeSymbol("UNIVERSAL-SECOND-P")));
  public static final SubLSymbol $sym60$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLSymbol $sym61$KB_SET_ASSERTION_DIRECTION = makeSymbol("KB-SET-ASSERTION-DIRECTION");
  public static final SubLList $list62 = list(makeSymbol("ASSERTION"), makeSymbol("NEW-DIRECTION"));
  public static final SubLString $str63$Change_direction_of_ASSERTION_to_ = makeString("Change direction of ASSERTION to NEW-DIRECTION.");
  public static final SubLList $list64 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("NEW-DIRECTION"), makeSymbol("DIRECTION-P")));
  public static final SubLSymbol $sym65$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $sym66$KB_SET_ASSERTION_TRUTH = makeSymbol("KB-SET-ASSERTION-TRUTH");
  public static final SubLList $list67 = list(makeSymbol("ASSERTION"), makeSymbol("NEW-TRUTH"));
  public static final SubLString $str68$Change_the_truth_of_ASSERTION_to_ = makeString("Change the truth of ASSERTION to NEW-TRUTH.");
  public static final SubLList $list69 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("NEW-TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym70$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLSymbol $sym71$KB_SET_ASSERTION_STRENGTH = makeSymbol("KB-SET-ASSERTION-STRENGTH");
  public static final SubLList $list72 = list(makeSymbol("ASSERTION"), makeSymbol("NEW-STRENGTH"));
  public static final SubLString $str73$Change_the_strength_of_ASSERTION_ = makeString("Change the strength of ASSERTION to NEW-STRENGTH.");
  public static final SubLList $list74 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("NEW-STRENGTH"), makeSymbol("EL-STRENGTH-P")));
  public static final SubLSymbol $sym75$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym76$KB_SET_ASSERTION_VARIABLE_NAMES = makeSymbol("KB-SET-ASSERTION-VARIABLE-NAMES");
  public static final SubLList $list77 = list(makeSymbol("ASSERTION"), makeSymbol("NEW-VARIABLE-NAMES"));
  public static final SubLString $str78$Change_the_variable_names_for_ASS = makeString("Change the variable names for ASSERTION to NEW-VARIABLE-NAMES.");
  public static final SubLList $list79 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("NEW-VARIABLE-NAMES"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym80$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym81$KB_SET_ASSERTION_ASSERTED_BY = makeSymbol("KB-SET-ASSERTION-ASSERTED-BY");
  public static final SubLList $list82 = list(makeSymbol("ASSERTION"), makeSymbol("ASSERTOR"));
  public static final SubLString $str83$Set_the_asserted_by_bookkeeping_i = makeString("Set the asserted-by bookkeeping info for ASSERTION to ASSERTOR.");
  public static final SubLList $list84 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("ASSERTOR"), list(makeSymbol("NIL-OR"), makeSymbol("FORT-P"))));
  public static final SubLSymbol $sym85$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
  public static final SubLSymbol $sym86$KB_SET_ASSERTION_ASSERTED_WHEN = makeSymbol("KB-SET-ASSERTION-ASSERTED-WHEN");
  public static final SubLList $list87 = list(makeSymbol("ASSERTION"), makeSymbol("UNIVERSAL-DATE"));
  public static final SubLString $str88$Set_the_asserted_when_bookkeeping = makeString("Set the asserted-when bookkeeping info for ASSERTION to UNIVERSAL-DATE.");
  public static final SubLList $list89 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("UNIVERSAL-DATE"), list(makeSymbol("NIL-OR"), makeSymbol("UNIVERSAL-DATE-P"))));
  public static final SubLSymbol $sym90$KB_SET_ASSERTION_ASSERTED_WHY = makeSymbol("KB-SET-ASSERTION-ASSERTED-WHY");
  public static final SubLList $list91 = list(makeSymbol("ASSERTION"), makeSymbol("REASON"));
  public static final SubLString $str92$Set_the_asserted_why_bookkeeping_ = makeString("Set the asserted-why bookkeeping info for ASSERTION to REASON.");
  public static final SubLList $list93 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("REASON"), list(makeSymbol("NIL-OR"), makeSymbol("FORT-P"))));
  public static final SubLSymbol $sym94$UNIVERSAL_SECOND_P = makeSymbol("UNIVERSAL-SECOND-P");
  public static final SubLSymbol $sym95$KB_SET_ASSERTION_ASSERTED_SECOND = makeSymbol("KB-SET-ASSERTION-ASSERTED-SECOND");
  public static final SubLList $list96 = list(makeSymbol("ASSERTION"), makeSymbol("UNIVERSAL-SECOND"));
  public static final SubLString $str97$Set_the_asserted_second_bookkeepi = makeString("Set the asserted-second bookkeeping info for ASSERTION to UNIVERSAL-SECOND.");
  public static final SubLList $list98 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("UNIVERSAL-SECOND"), list(makeSymbol("NIL-OR"), makeSymbol("UNIVERSAL-SECOND-P"))));
  public static final SubLSymbol $sym99$KB_ASSERTION_ARGUMENTS = makeSymbol("KB-ASSERTION-ARGUMENTS");
  public static final SubLString $str100$Return_the_arguments_for_ASSERTIO = makeString("Return the arguments for ASSERTION.");
  public static final SubLSymbol $sym101$KB_ASSERTION_DEPENDENTS = makeSymbol("KB-ASSERTION-DEPENDENTS");
  public static final SubLString $str102$Return_the_dependents_of_ASSERTIO = makeString("Return the dependents of ASSERTION.");

  //// Initializers

  public void declareFunctions() {
    declare_assertions_interface_file();
  }

  public void initializeVariables() {
    init_assertions_interface_file();
  }

  public void runTopLevelForms() {
    setup_assertions_interface_file();
  }

}
