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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cyc_bookkeeping;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.transcript_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class cyc_kernel extends SubLTranslatedFile {

  //// Constructor

  private cyc_kernel() {}
  public static final SubLFile me = new cyc_kernel();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_kernel";

  //// Definitions

  /** Creates a new constant with name NAME, but makes
   no effort to synchronize its external ID with
   other Cyc images.  This is intended for constants
   that will not be transmitted to other Cyc images. */
  @SubL(source = "cycl/cyc-kernel.lisp", position = 3027) 
  public static final SubLObject cyc_create_new_ephemeral(SubLObject name) {
    checkType(name, $sym0$NEW_CONSTANT_NAME_SPEC_P);
    return cyc_create(name, constants_high.make_constant_external_id());
  }

  /** Create a new constant with id EXTERNAL-ID.
   If NAME is anything other than :unnamed,
   the new constant will be given the name NAME. */
  @SubL(source = "cycl/cyc-kernel.lisp", position = 3426) 
  public static final SubLObject cyc_create(SubLObject name, SubLObject external_id) {
    checkType(name, $sym0$NEW_CONSTANT_NAME_SPEC_P);
    if ((NIL != external_id)) {
      checkType(external_id, $sym9$CONSTANT_EXTERNAL_ID_P);
    }
    {
      SubLObject result = NIL;
      result = fi.fi_create_int(name, external_id);
      cyc_bookkeeping.perform_constant_bookkeeping(result);
      return result;
    }
  }

  /** Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions
   in that microtheory are removed. */
  @SubL(source = "cycl/cyc-kernel.lisp", position = 7963) 
  public static final SubLObject cyc_kill(SubLObject fort) {
    checkType(fort, $sym28$FORT_P);
    return fi.fi_kill_int(fort);
  }

  @SubL(source = "cycl/cyc-kernel.lisp", position = 9400) 
  public static final SubLObject get_assert_property(SubLObject v_properties, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    return conses_high.getf(v_properties, indicator, v_default);
  }

  /** Assert SENTENCE in the specified MT.
   properties; :strength el-strength-p (:default or :monotonic)
               :direction direction-p  (:forward or :backward)
   GAF assertion direction defaults to :forward, and rule
   assertion direction defaults to :backward.
   @return booleanp; t iff the assert succeeded.  If the assertion
   already existed, it is considered a success. */
  @SubL(source = "cycl/cyc-kernel.lisp", position = 9524) 
  public static final SubLObject cyc_assert(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sentence, $sym44$POSSIBLY_SENTENCE_P);
      if ((NIL != mt)) {
        checkType(mt, $sym45$POSSIBLY_MT_P);
      }
      checkType(v_properties, $sym46$ASSERT_PROPERTIES_P);
      {
        SubLObject result = NIL;
        SubLObject strength = get_assert_property(v_properties, $kw47$STRENGTH, $kw48$DEFAULT);
        SubLObject direction = get_assert_property(v_properties, $kw49$DIRECTION, UNPROVIDED);
        thread.resetMultipleValues();
        {
          SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
          SubLObject right_mt = thread.secondMultipleValue();
          thread.resetMultipleValues();
          result = fi.fi_assert_int(right_sentence, right_mt, strength, direction);
          cyc_bookkeeping.perform_assertion_bookkeeping(result);
        }
        return result;
      }
    }
  }

  /** Like @xref CYC-ASSERT, but SENTENCE is assumed well-formed. */
  @SubL(source = "cycl/cyc-kernel.lisp", position = 10557) 
  public static final SubLObject cyc_assert_wff(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = fi.$assume_assert_sentence_is_wfP$.currentBinding(thread);
          try {
            fi.$assume_assert_sentence_is_wfP$.bind(T, thread);
            result = cyc_assert(sentence, mt, v_properties);
          } finally {
            fi.$assume_assert_sentence_is_wfP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Remove the assertions canonicalized from FORMULA in the microtheory MT.
   Return T if the operation succeeded, otherwise return NIL. */
  @SubL(source = "cycl/cyc-kernel.lisp", position = 10862) 
  public static final SubLObject cyc_unassert(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sentence, $sym44$POSSIBLY_SENTENCE_P);
      if ((NIL != mt)) {
        checkType(mt, $sym45$POSSIBLY_MT_P);
      }
      {
        SubLObject result = NIL;
        thread.resetMultipleValues();
        {
          SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt);
          SubLObject right_mt = thread.secondMultipleValue();
          thread.resetMultipleValues();
          result = fi.fi_unassert_int(right_sentence, right_mt);
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/cyc-kernel.lisp", position = 18695) 
  private static SubLSymbol $closed_query_bindings$ = null;

  @SubL(source = "cycl/cyc-kernel.lisp", position = 20189) 
  private static SubLSymbol $closed_query_success_token$ = null;

  public static final SubLObject declare_cyc_kernel_file() {
    declareFunction(myName, "cyc_create_new_permanent", "CYC-CREATE-NEW-PERMANENT", 1, 0, false);
    declareFunction(myName, "cyc_create_new_ephemeral", "CYC-CREATE-NEW-EPHEMERAL", 1, 0, false);
    declareFunction(myName, "cyc_create", "CYC-CREATE", 2, 0, false);
    declareFunction(myName, "cyc_find_or_create", "CYC-FIND-OR-CREATE", 2, 0, false);
    declareFunction(myName, "cyc_find_or_create_new_permanent", "CYC-FIND-OR-CREATE-NEW-PERMANENT", 1, 0, false);
    declareFunction(myName, "cyc_rename", "CYC-RENAME", 2, 0, false);
    declareFunction(myName, "cyc_recreate", "CYC-RECREATE", 1, 0, false);
    declareFunction(myName, "new_constant_name_spec_p", "NEW-CONSTANT-NAME-SPEC-P", 1, 0, false);
    declareFunction(myName, "cyc_kill", "CYC-KILL", 1, 0, false);
    declareFunction(myName, "cyc_rewrite", "CYC-REWRITE", 2, 0, false);
    declareFunction(myName, "cyc_merge", "CYC-MERGE", 2, 0, false);
    declareFunction(myName, "assert_properties_p", "ASSERT-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "get_assert_property", "GET-ASSERT-PROPERTY", 2, 1, false);
    declareFunction(myName, "cyc_assert", "CYC-ASSERT", 1, 2, false);
    declareFunction(myName, "cyc_assert_wff", "CYC-ASSERT-WFF", 1, 2, false);
    declareFunction(myName, "cyc_unassert", "CYC-UNASSERT", 1, 1, false);
    declareFunction(myName, "cyc_edit", "CYC-EDIT", 2, 3, false);
    declareFunction(myName, "cyc_add_argument", "CYC-ADD-ARGUMENT", 2, 3, false);
    declareFunction(myName, "cyc_remove_argument", "CYC-REMOVE-ARGUMENT", 2, 1, false);
    declareFunction(myName, "cyc_remove_all_arguments", "CYC-REMOVE-ALL-ARGUMENTS", 1, 1, false);
    declareFunction(myName, "legacy_query_properties_p", "LEGACY-QUERY-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "query_results_p", "QUERY-RESULTS-P", 1, 0, false);
    declareFunction(myName, "cyc_query", "CYC-QUERY", 1, 2, false);
    declareFunction(myName, "query_success_result_p", "QUERY-SUCCESS-RESULT-P", 1, 0, false);
    declareFunction(myName, "open_query_result_p", "OPEN-QUERY-RESULT-P", 1, 0, false);
    declareFunction(myName, "open_query_success_result_p", "OPEN-QUERY-SUCCESS-RESULT-P", 1, 0, false);
    declareFunction(myName, "closed_query_bindings_p", "CLOSED-QUERY-BINDINGS-P", 1, 0, false);
    declareFunction(myName, "closed_query_justified_bindings_p", "CLOSED-QUERY-JUSTIFIED-BINDINGS-P", 1, 0, false);
    declareFunction(myName, "closed_query_success_token", "CLOSED-QUERY-SUCCESS-TOKEN", 0, 0, false);
    declareFunction(myName, "closed_query_success_token_p", "CLOSED-QUERY-SUCCESS-TOKEN-P", 1, 0, false);
    declareFunction(myName, "closed_query_success_result_p", "CLOSED-QUERY-SUCCESS-RESULT-P", 1, 0, false);
    declareFunction(myName, "closed_query_justified_success_result_p", "CLOSED-QUERY-JUSTIFIED-SUCCESS-RESULT-P", 1, 0, false);
    declareFunction(myName, "query_id_p", "QUERY-ID-P", 1, 0, false);
    declareFunction(myName, "cyc_continue_query", "CYC-CONTINUE-QUERY", 0, 2, false);
    declareFunction(myName, "cyc_tms_reconsider_sentence", "CYC-TMS-RECONSIDER-SENTENCE", 1, 1, false);
    declareFunction(myName, "cyc_tms_reconsider_term", "CYC-TMS-RECONSIDER-TERM", 1, 1, false);
    declareFunction(myName, "cyc_tms_reconsider_mt", "CYC-TMS-RECONSIDER-MT", 1, 0, false);
    declareFunction(myName, "cyc_rename_variables", "CYC-RENAME-VARIABLES", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_cyc_kernel_file() {
    $closed_query_bindings$ = deflexical("*CLOSED-QUERY-BINDINGS*", NIL);
    $closed_query_success_token$ = deflexical("*CLOSED-QUERY-SUCCESS-TOKEN*", list($closed_query_bindings$.getGlobalValue()));
    return NIL;
  }

  public static final SubLObject setup_cyc_kernel_file() {
    // CVS_ID("Id: cyc-kernel.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym2$CYC_CREATE_NEW_PERMANENT, $list3, $str4$Creates_a_new_constant_with_name_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym7$CYC_CREATE_NEW_EPHEMERAL, $list3, $str8$Creates_a_new_constant_with_name_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym1$CYC_CREATE, $list10, $str11$Create_a_new_constant_with_id_EXT, $list12, $list6);
    utilities_macros.register_cyc_api_function($sym14$CYC_FIND_OR_CREATE, $list10, $str15$Return_constant_with_NAME_if_it_i, $list16, $list6);
    utilities_macros.register_cyc_api_function($sym18$CYC_RENAME, $list19, $str20$Change_name_of_CONSTANT_to_NAME__, $list21, $list22);
    utilities_macros.register_cyc_api_function($sym23$CYC_RECREATE, $list24, $str25$Doesn_t_unassert_the_bookkeeping_, $list26, $list6);
    utilities_macros.register_cyc_api_function($sym29$CYC_KILL, $list30, $str31$Kill_FORT_and_all_its_uses_from_t, $list32, $list33);
    utilities_macros.register_cyc_api_function($sym35$CYC_REWRITE, $list36, $str37$_moves__all_asserted_arguments_fr, $list38, $list39);
    utilities_macros.register_cyc_api_function($sym40$CYC_MERGE, $list41, $str42$Move_asserted_assertions_on_KILL_, $list43, $list39);
    utilities_macros.register_cyc_api_function($sym50$CYC_ASSERT, $list51, $str52$Assert_SENTENCE_in_the_specified_, $list53, $list33);
    utilities_macros.register_cyc_api_function($sym54$CYC_UNASSERT, $list55, $str56$Remove_the_assertions_canonicaliz, $list57, $list33);
    utilities_macros.register_cyc_api_function($sym58$CYC_EDIT, $list59, $str60$Unassert_OLD_SENTENCE_in_OLD_MT__, $list61, $list33);
    utilities_macros.register_cyc_api_function($sym64$CYC_ADD_ARGUMENT, $list65, $str66$Tell_Cyc_to_conclude_SENTENCE__op, $list67, $list33);
    utilities_macros.register_cyc_api_function($sym68$CYC_REMOVE_ARGUMENT, $list69, $str70$Remove_the_argument_for_SENTENCE_, $list71, $list33);
    utilities_macros.register_cyc_api_function($sym72$CYC_REMOVE_ALL_ARGUMENTS, $list55, $str73$Remove_all_arguments_for_SENTENCE, $list57, $list33);
    utilities_macros.register_cyc_api_function($sym80$CYC_QUERY, $list51, $str81$Query_for_bindings_for_free_varia, $list82, $list83);
    utilities_macros.register_obsolete_cyc_api_function($sym88$CYC_CONTINUE_QUERY, $list89, $list90, $str91$Continues_a_query_started_by__xre, $list92, $list83);
    utilities_macros.register_cyc_api_function($sym93$CYC_TMS_RECONSIDER_SENTENCE, $list55, $str94$Reconsider_all_arguments_for_SENT, $list57, $list33);
    utilities_macros.register_cyc_api_function($sym96$CYC_RENAME_VARIABLES, $list97, $str98$Rename_the_variables_in_SENTENCE_, $list99, $list33);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$NEW_CONSTANT_NAME_SPEC_P = makeSymbol("NEW-CONSTANT-NAME-SPEC-P");
  public static final SubLSymbol $sym1$CYC_CREATE = makeSymbol("CYC-CREATE");
  public static final SubLSymbol $sym2$CYC_CREATE_NEW_PERMANENT = makeSymbol("CYC-CREATE-NEW-PERMANENT");
  public static final SubLList $list3 = list(makeSymbol("NAME"));
  public static final SubLString $str4$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue.");
  public static final SubLList $list5 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")));
  public static final SubLList $list6 = list(makeSymbol("CONSTANT-P"));
  public static final SubLSymbol $sym7$CYC_CREATE_NEW_EPHEMERAL = makeSymbol("CYC-CREATE-NEW-EPHEMERAL");
  public static final SubLString $str8$Creates_a_new_constant_with_name_ = makeString("Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images.");
  public static final SubLSymbol $sym9$CONSTANT_EXTERNAL_ID_P = makeSymbol("CONSTANT-EXTERNAL-ID-P");
  public static final SubLList $list10 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));
  public static final SubLString $str11$Create_a_new_constant_with_id_EXT = makeString("Create a new constant with id EXTERNAL-ID.\n   If NAME is anything other than :unnamed,\n   the new constant will be given the name NAME.");
  public static final SubLList $list12 = list(list(makeSymbol("NAME"), makeSymbol("NEW-CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));
  public static final SubLSymbol $sym13$VALID_CONSTANT_NAME_P = makeSymbol("VALID-CONSTANT-NAME-P");
  public static final SubLSymbol $sym14$CYC_FIND_OR_CREATE = makeSymbol("CYC-FIND-OR-CREATE");
  public static final SubLString $str15$Return_constant_with_NAME_if_it_i = makeString("Return constant with NAME if it is present.  \n   If not present, then create constant with NAME, using EXTERNAL-ID if given.\n   If EXTERNAL-ID is not given, generate a new one for the new constant.");
  public static final SubLList $list16 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));
  public static final SubLSymbol $sym17$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym18$CYC_RENAME = makeSymbol("CYC-RENAME");
  public static final SubLList $list19 = list(makeSymbol("CONSTANT"), makeSymbol("NAME"));
  public static final SubLString $str20$Change_name_of_CONSTANT_to_NAME__ = makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");
  public static final SubLList $list21 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));
  public static final SubLList $list22 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $sym23$CYC_RECREATE = makeSymbol("CYC-RECREATE");
  public static final SubLList $list24 = list(makeSymbol("CONSTANT"));
  public static final SubLString $str25$Doesn_t_unassert_the_bookkeeping_ = makeString("Doesn't unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow.");
  public static final SubLList $list26 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $kw27$UNNAMED = makeKeyword("UNNAMED");
  public static final SubLSymbol $sym28$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym29$CYC_KILL = makeSymbol("CYC-KILL");
  public static final SubLList $list30 = list(makeSymbol("FORT"));
  public static final SubLString $str31$Kill_FORT_and_all_its_uses_from_t = makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed.");
  public static final SubLList $list32 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));
  public static final SubLList $list33 = list(makeSymbol("BOOLEANP"));
  public static final SubLString $str34$cyc_rewrite_is_not_implemented_ye = makeString("cyc-rewrite is not implemented yet");
  public static final SubLSymbol $sym35$CYC_REWRITE = makeSymbol("CYC-REWRITE");
  public static final SubLList $list36 = list(makeSymbol("SOURCE-FORT"), makeSymbol("TARGET-FORT"));
  public static final SubLString $str37$_moves__all_asserted_arguments_fr = makeString("'moves' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT");
  public static final SubLList $list38 = list(list(makeSymbol("SOURCE-FORT"), makeSymbol("FORT-P")), list(makeSymbol("TARGET-FORT"), makeSymbol("FORT-P")));
  public static final SubLList $list39 = list(makeSymbol("FORT-P"));
  public static final SubLSymbol $sym40$CYC_MERGE = makeSymbol("CYC-MERGE");
  public static final SubLList $list41 = list(makeSymbol("KILL-FORT"), makeSymbol("KEEP-FORT"));
  public static final SubLString $str42$Move_asserted_assertions_on_KILL_ = makeString("Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\n   @return fort-p; KEEP-FORT");
  public static final SubLList $list43 = list(list(makeSymbol("KILL-FORT"), makeSymbol("FORT-P")), list(makeSymbol("KEEP-FORT"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym44$POSSIBLY_SENTENCE_P = makeSymbol("POSSIBLY-SENTENCE-P");
  public static final SubLSymbol $sym45$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
  public static final SubLSymbol $sym46$ASSERT_PROPERTIES_P = makeSymbol("ASSERT-PROPERTIES-P");
  public static final SubLSymbol $kw47$STRENGTH = makeKeyword("STRENGTH");
  public static final SubLSymbol $kw48$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw49$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $sym50$CYC_ASSERT = makeSymbol("CYC-ASSERT");
  public static final SubLList $list51 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("PROPERTIES"));
  public static final SubLString $str52$Assert_SENTENCE_in_the_specified_ = makeString("Assert SENTENCE in the specified MT.\n   properties; :strength el-strength-p (:default or :monotonic)\n               :direction direction-p  (:forward or :backward)\n   GAF assertion direction defaults to :forward, and rule\n   assertion direction defaults to :backward.\n   @return booleanp; t iff the assert succeeded.  If the assertion\n   already existed, it is considered a success.");
  public static final SubLList $list53 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("ASSERT-PROPERTIES-P")));
  public static final SubLSymbol $sym54$CYC_UNASSERT = makeSymbol("CYC-UNASSERT");
  public static final SubLList $list55 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str56$Remove_the_assertions_canonicaliz = makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\n   Return T if the operation succeeded, otherwise return NIL.");
  public static final SubLList $list57 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));
  public static final SubLSymbol $sym58$CYC_EDIT = makeSymbol("CYC-EDIT");
  public static final SubLList $list59 = list(makeSymbol("OLD-SENTENCE"), makeSymbol("NEW-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("OLD-MT"), list(makeSymbol("NEW-MT"), makeSymbol("OLD-MT")), makeSymbol("PROPERTIES"));
  public static final SubLString $str60$Unassert_OLD_SENTENCE_in_OLD_MT__ = makeString("Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\n   @see cyc-unassert and @xref cyc-assert");
  public static final SubLList $list61 = list(list(makeSymbol("OLD-SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("NEW-SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("OLD-MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("NEW-MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));
  public static final SubLSymbol $sym62$LIST_OF_CYCL_SUPPORT_P = makeSymbol("LIST-OF-CYCL-SUPPORT-P");
  public static final SubLSymbol $sym63$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym64$CYC_ADD_ARGUMENT = makeSymbol("CYC-ADD-ARGUMENT");
  public static final SubLList $list65 = list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SUPPORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("VERIFY-SUPPORTS"));
  public static final SubLString $str66$Tell_Cyc_to_conclude_SENTENCE__op = makeString("Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or \n   otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports \n   before making the assertion.\n   Properties: :direction :forward or :backward");
  public static final SubLList $list67 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("CYCL-SUPPORTS"), makeSymbol("LIST-OF-CYCL-SUPPORT-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("ASSERT-PROPERTIES-P")), list(makeSymbol("VERIFY-SUPPORTS"), makeSymbol("BOOLEANP")));
  public static final SubLSymbol $sym68$CYC_REMOVE_ARGUMENT = makeSymbol("CYC-REMOVE-ARGUMENT");
  public static final SubLList $list69 = list(makeSymbol("SENTENCE"), makeSymbol("CYCL-SUPPORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str70$Remove_the_argument_for_SENTENCE_ = makeString("Remove the argument for SENTENCE specified by CYCL-SUPPORTS.");
  public static final SubLList $list71 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("CYCL-SUPPORTS"), makeSymbol("LIST-OF-CYCL-SUPPORT-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))));
  public static final SubLSymbol $sym72$CYC_REMOVE_ALL_ARGUMENTS = makeSymbol("CYC-REMOVE-ALL-ARGUMENTS");
  public static final SubLString $str73$Remove_all_arguments_for_SENTENCE = makeString("Remove all arguments for SENTENCE within MT, including both those \n   arguments resulting the direct assertion of SENTENCE, and \n   those arguments supporting SENTENCE which were derived through inference.\n   Return T if successful, otherwise return NIL.");
  public static final SubLSymbol $sym74$LEGACY_QUERY_PROPERTIES_P = makeSymbol("LEGACY-QUERY-PROPERTIES-P");
  public static final SubLSymbol $kw75$BACKCHAIN = makeKeyword("BACKCHAIN");
  public static final SubLSymbol $kw76$NUMBER = makeKeyword("NUMBER");
  public static final SubLSymbol $kw77$TIME = makeKeyword("TIME");
  public static final SubLSymbol $kw78$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw79$CONDITIONAL_SENTENCE = makeKeyword("CONDITIONAL-SENTENCE");
  public static final SubLSymbol $sym80$CYC_QUERY = makeSymbol("CYC-QUERY");
  public static final SubLString $str81$Query_for_bindings_for_free_varia = makeString("Query for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\n   Properties: :backchain NIL or an integer or T\n               :number    NIL or an integer\n               :time      NIL or an integer\n               :depth     NIL or an integer\n               :conditional-sentence boolean\n   If :backchain is NIL, no backchaining is performed.\n   If :backchain is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If :backchain is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If :number is an integer, then at most that number of bindings are returned.\n   If :time is an integer, then at most that many seconds are consumed by the search for\n   bindings.\n   If :depth is an integer, then the inference paths are limited to that number of\n   total steps.\n   Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)\n   binding set.  In the case where the SENTENCE has no free variables,\n   the form (NIL), the empty binding set is returned, indicating that the gaf is either\n   directly asserted in the KB, or that it can be derived via rules in the KB.\n   If it fails to be proven, NIL will be returned.\n   The second return value indicates the reason why the query halted.\n   If SENTENCE is an implication, or an ist wrapped around an implication,\n   and the :conditional-sentence property is non-nil, cyc-query will attempt to\n   prove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC");
  public static final SubLList $list82 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));
  public static final SubLList $list83 = list(makeSymbol("QUERY-RESULTS-P"));
  public static final SubLSymbol $sym84$CLOSED_QUERY_JUSTIFIED_BINDINGS_P = makeSymbol("CLOSED-QUERY-JUSTIFIED-BINDINGS-P");
  public static final SubLSymbol $kw85$LAST = makeKeyword("LAST");
  public static final SubLSymbol $sym86$QUERY_ID_P = makeSymbol("QUERY-ID-P");
  public static final SubLString $str87$cyc_continue_query_is_deprecated_ = makeString("cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead.");
  public static final SubLSymbol $sym88$CYC_CONTINUE_QUERY = makeSymbol("CYC-CONTINUE-QUERY");
  public static final SubLList $list89 = list(makeSymbol("CONTINUE-INFERENCE"));
  public static final SubLList $list90 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("QUERY-ID"), makeKeyword("LAST")), makeSymbol("PROPERTIES"));
  public static final SubLString $str91$Continues_a_query_started_by__xre = makeString("Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued.");
  public static final SubLList $list92 = list(list(makeSymbol("QUERY-ID"), makeSymbol("QUERY-ID-P")), list(makeSymbol("PROPERTIES"), makeSymbol("LEGACY-QUERY-PROPERTIES-P")));
  public static final SubLSymbol $sym93$CYC_TMS_RECONSIDER_SENTENCE = makeSymbol("CYC-TMS-RECONSIDER-SENTENCE");
  public static final SubLString $str94$Reconsider_all_arguments_for_SENT = makeString("Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error.");
  public static final SubLSymbol $sym95$ALIST_P = makeSymbol("ALIST-P");
  public static final SubLSymbol $sym96$CYC_RENAME_VARIABLES = makeSymbol("CYC-RENAME-VARIABLES");
  public static final SubLList $list97 = list(makeSymbol("SENTENCE"), makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str98$Rename_the_variables_in_SENTENCE_ = makeString("Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error.");
  public static final SubLList $list99 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("RENAME-VARIABLE-LIST"), makeSymbol("ALIST-P")));

  //// Initializers

  public void declareFunctions() {
    declare_cyc_kernel_file();
  }

  public void initializeVariables() {
    init_cyc_kernel_file();
  }

  public void runTopLevelForms() {
    setup_cyc_kernel_file();
  }

}
