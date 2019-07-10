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
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_completion_low;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.constants_low;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.hl_interface_infrastructure;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class constants_interface extends SubLTranslatedFile {

  //// Constructor

  private constants_interface() {}
  public static final SubLFile me = new constants_interface();
  public static final String myName = "com.cyc.cycjava_1.cycl.constants_interface";

  //// Definitions

  /** Return a new constant named NAME with EXTERNAL-ID.
   If NAME is :unnamed, returns a constant with no name. */
  @SubL(source = "cycl/constants-interface.lisp", position = 856) 
  public static final SubLObject kb_create_constant(SubLObject name, SubLObject external_id) {
    checkType(name, $sym0$CONSTANT_NAME_SPEC_P);
    checkType(external_id, $sym1$CONSTANT_EXTERNAL_ID_P);
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation($sym2$KB_CREATE_CONSTANT, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    if ((NIL != hl_interface_infrastructure.hl_modify_anywhereP())) {
      {
        SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          {
            SubLObject constant = ((NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32155")) : kb_create_constant_local(name, external_id));
            hl_interface_infrastructure.define_hl_modifier_postamble();
            return constant;
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

  @SubL(source = "cycl/constants-interface.lisp", position = 1915) 
  public static final SubLObject kb_create_constant_local(SubLObject name, SubLObject external_id) {
    {
      SubLObject internal_id = constants_low.kb_create_constant_kb_store(name, external_id);
      return constants_high.find_constant_by_internal_id(internal_id);
    }
  }

  /** Remove CONSTANT from the KB. */
  @SubL(source = "cycl/constants-interface.lisp", position = 2142) 
  public static final SubLObject kb_remove_constant(SubLObject constant) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(constant, $sym9$CONSTANT_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym10$KB_REMOVE_CONSTANT, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29543");
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
                  return constants_low.kb_remove_constant_internal(constant);
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

  /** Return the constant named NAME, if it exists.
   Return NIL otherwise. */
  @SubL(source = "cycl/constants-interface.lisp", position = 2461) 
  public static final SubLObject kb_lookup_constant_by_name(SubLObject name) {
    checkType(name, $sym16$STRINGP);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29544");
    } else {
      return constant_completion_low.constant_shell_from_name(name);
    }
  }

  /** Return the name for CONSTANT. */
  @SubL(source = "cycl/constants-interface.lisp", position = 2816) 
  public static final SubLObject kb_constant_name(SubLObject constant) {
    checkType(constant, $sym9$CONSTANT_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29545");
    } else {
      return constants_low.constant_name_internal(constant);
    }
  }

  /** Return the constant with GUID, if it exists.
   Return NIL otherwise. */
  @SubL(source = "cycl/constants-interface.lisp", position = 3030) 
  public static final SubLObject kb_lookup_constant_by_guid(SubLObject guid) {
    checkType(guid, $sym25$GUID_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29546");
    } else {
      return constants_low.lookup_constant_by_guid(guid);
    }
  }

  /** Return the external ID for CONSTANT. */
  @SubL(source = "cycl/constants-interface.lisp", position = 3278) 
  public static final SubLObject kb_constant_guid(SubLObject constant) {
    checkType(constant, $sym9$CONSTANT_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29547");
    } else {
      return constants_low.constant_guid_internal(constant);
    }
  }

  /** Return the external merged ID for CONSTANT. */
  @SubL(source = "cycl/constants-interface.lisp", position = 3501) 
  public static final SubLObject kb_constant_merged_guid(SubLObject constant) {
    checkType(constant, $sym9$CONSTANT_P);
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29548");
    } else {
      return constants_low.constant_merged_guid_internal(constant);
    }
  }

  /** Rename CONSTANT to have NEW-NAME as its name.  The constant is returned. */
  @SubL(source = "cycl/constants-interface.lisp", position = 3745) 
  public static final SubLObject kb_rename_constant(SubLObject constant, SubLObject new_name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(constant, $sym9$CONSTANT_P);
      checkType(new_name, $sym35$VALID_CONSTANT_NAME_P);
      {
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation($sym36$KB_RENAME_CONSTANT, constant, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != hl_interface_infrastructure.hl_modify_remoteP())) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29549");
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
                    SubLObject old_name = constants_high.constant_name(constant);
                    SubLObject result_1 = constants_low.kb_rename_constant_internal(constant, new_name);
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

  public static final SubLObject declare_constants_interface_file() {
    declareFunction(myName, "kb_create_constant", "KB-CREATE-CONSTANT", 2, 0, false);
    declareFunction(myName, "kb_create_constant_remote", "KB-CREATE-CONSTANT-REMOTE", 2, 0, false);
    declareFunction(myName, "kb_create_constant_local", "KB-CREATE-CONSTANT-LOCAL", 2, 0, false);
    declareFunction(myName, "kb_remove_constant", "KB-REMOVE-CONSTANT", 1, 0, false);
    declareFunction(myName, "kb_lookup_constant_by_name", "KB-LOOKUP-CONSTANT-BY-NAME", 1, 0, false);
    declareFunction(myName, "kb_constant_name", "KB-CONSTANT-NAME", 1, 0, false);
    declareFunction(myName, "kb_lookup_constant_by_guid", "KB-LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
    declareFunction(myName, "kb_constant_guid", "KB-CONSTANT-GUID", 1, 0, false);
    declareFunction(myName, "kb_constant_merged_guid", "KB-CONSTANT-MERGED-GUID", 1, 0, false);
    declareFunction(myName, "kb_rename_constant", "KB-RENAME-CONSTANT", 2, 0, false);
    declareFunction(myName, "kb_new_constant_info_iterator", "KB-NEW-CONSTANT-INFO-ITERATOR", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_constants_interface_file() {
    return NIL;
  }

  public static final SubLObject setup_constants_interface_file() {
    // CVS_ID("Id: constants-interface.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym2$KB_CREATE_CONSTANT, $list4, $str5$Return_a_new_constant_named_NAME_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym10$KB_REMOVE_CONSTANT, $list12, $str13$Remove_CONSTANT_from_the_KB_, $list14, $list15);
    utilities_macros.register_cyc_api_function($sym17$KB_LOOKUP_CONSTANT_BY_NAME, $list18, $str19$Return_the_constant_named_NAME__i, $list20, $list21);
    utilities_macros.register_cyc_api_function($sym22$KB_CONSTANT_NAME, $list12, $str23$Return_the_name_for_CONSTANT_, $list14, $list24);
    utilities_macros.register_cyc_api_function($sym26$KB_LOOKUP_CONSTANT_BY_GUID, $list27, $str28$Return_the_constant_with_GUID__if, $list29, $list21);
    utilities_macros.register_cyc_api_function($sym30$KB_CONSTANT_GUID, $list12, $str31$Return_the_external_ID_for_CONSTA, $list14, $list32);
    utilities_macros.register_cyc_api_function($sym33$KB_CONSTANT_MERGED_GUID, $list12, $str34$Return_the_external_merged_ID_for, $list14, $list32);
    utilities_macros.register_cyc_api_function($sym36$KB_RENAME_CONSTANT, $list37, $str38$Rename_CONSTANT_to_have_NEW_NAME_, $list39, $list7);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");
  public static final SubLSymbol $sym1$CONSTANT_EXTERNAL_ID_P = makeSymbol("CONSTANT-EXTERNAL-ID-P");
  public static final SubLSymbol $sym2$KB_CREATE_CONSTANT = makeSymbol("KB-CREATE-CONSTANT");
  public static final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");
  public static final SubLList $list4 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));
  public static final SubLString $str5$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID.\n   If NAME is :unnamed, returns a constant with no name.");
  public static final SubLList $list6 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));
  public static final SubLList $list7 = list(makeSymbol("CONSTANT-P"));
  public static final SubLSymbol $sym8$KB_CREATE_CONSTANT_KB_STORE = makeSymbol("KB-CREATE-CONSTANT-KB-STORE");
  public static final SubLSymbol $sym9$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym10$KB_REMOVE_CONSTANT = makeSymbol("KB-REMOVE-CONSTANT");
  public static final SubLSymbol $sym11$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list12 = list(makeSymbol("CONSTANT"));
  public static final SubLString $str13$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");
  public static final SubLList $list14 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));
  public static final SubLList $list15 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym16$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym17$KB_LOOKUP_CONSTANT_BY_NAME = makeSymbol("KB-LOOKUP-CONSTANT-BY-NAME");
  public static final SubLList $list18 = list(makeSymbol("NAME"));
  public static final SubLString $str19$Return_the_constant_named_NAME__i = makeString("Return the constant named NAME, if it exists.\n   Return NIL otherwise.");
  public static final SubLList $list20 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));
  public static final SubLList $list21 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $sym22$KB_CONSTANT_NAME = makeSymbol("KB-CONSTANT-NAME");
  public static final SubLString $str23$Return_the_name_for_CONSTANT_ = makeString("Return the name for CONSTANT.");
  public static final SubLList $list24 = list(makeSymbol("CONSTANT-NAME-SPEC-P"));
  public static final SubLSymbol $sym25$GUID_P = makeSymbol("GUID-P");
  public static final SubLSymbol $sym26$KB_LOOKUP_CONSTANT_BY_GUID = makeSymbol("KB-LOOKUP-CONSTANT-BY-GUID");
  public static final SubLList $list27 = list(makeSymbol("GUID"));
  public static final SubLString $str28$Return_the_constant_with_GUID__if = makeString("Return the constant with GUID, if it exists.\n   Return NIL otherwise.");
  public static final SubLList $list29 = list(list(makeSymbol("GUID"), makeSymbol("GUID-P")));
  public static final SubLSymbol $sym30$KB_CONSTANT_GUID = makeSymbol("KB-CONSTANT-GUID");
  public static final SubLString $str31$Return_the_external_ID_for_CONSTA = makeString("Return the external ID for CONSTANT.");
  public static final SubLList $list32 = list(makeSymbol("CONSTANT-EXTERNAL-ID-P"));
  public static final SubLSymbol $sym33$KB_CONSTANT_MERGED_GUID = makeSymbol("KB-CONSTANT-MERGED-GUID");
  public static final SubLString $str34$Return_the_external_merged_ID_for = makeString("Return the external merged ID for CONSTANT.");
  public static final SubLSymbol $sym35$VALID_CONSTANT_NAME_P = makeSymbol("VALID-CONSTANT-NAME-P");
  public static final SubLSymbol $sym36$KB_RENAME_CONSTANT = makeSymbol("KB-RENAME-CONSTANT");
  public static final SubLList $list37 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));
  public static final SubLString $str38$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");
  public static final SubLList $list39 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));
  public static final SubLList $list40 = list(makeSymbol("KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL"));

  //// Initializers

  public void declareFunctions() {
    declare_constants_interface_file();
  }

  public void initializeVariables() {
    init_constants_interface_file();
  }

  public void runTopLevelForms() {
    setup_constants_interface_file();
  }

}
