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
import com.cyc.cycjava_1.cycl.bookkeeping_store;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.constant_completion_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_interface;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.kb_hl_supports;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.skolems;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class constants_high extends SubLTranslatedFile {

  //// Constructor

  private constants_high() {}
  public static final SubLFile me = new constants_high();
  public static final String myName = "com.cyc.cycjava_1.cycl.constants_high";

  //// Definitions

  /** Return a new constant named NAME with EXTERNAL-ID as the external ID. */
  @SubL(source = "cycl/constants-high.lisp", position = 1073) 
  public static final SubLObject create_constant(SubLObject name, SubLObject external_id) {
    if ((external_id == UNPROVIDED)) {
      external_id = NIL;
    }
    checkType(name, $sym0$CONSTANT_NAME_SPEC_P);
    if ((NIL != external_id)) {
      checkType(external_id, $sym1$CONSTANT_EXTERNAL_ID_P);
    }
    if ((NIL == external_id)) {
      external_id = make_constant_external_id();
    }
    return constants_interface.kb_create_constant(name, external_id);
  }

  /** Remove CONSTANT from the KB. */
  @SubL(source = "cycl/constants-high.lisp", position = 3116) 
  public static final SubLObject remove_constant(SubLObject constant) {
    checkType(constant, $sym20$CONSTANT_P);
    remove_everything_about_constant(constant);
    return constants_interface.kb_remove_constant(constant);
  }

  /** Remove all information (assertions, nats) about CONSTANT from the KB. */
  @SubL(source = "cycl/constants-high.lisp", position = 3382) 
  public static final SubLObject remove_everything_about_constant(SubLObject constant) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(constant, $sym20$CONSTANT_P);
      {
        SubLObject _prev_bind_0 = kb_macros.$forts_being_removed$.currentBinding(thread);
        try {
          kb_macros.$forts_being_removed$.bind(cons(constant, kb_macros.$forts_being_removed$.getDynamicValue(thread)), thread);
          if ((NIL != term.reified_skolem_fn_in_any_mtP(constant, T, T))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 13059");
          }
          narts_high.remove_dependent_narts(constant);
          bookkeeping_store.unassert_all_bookkeeping_gafs_on_term(constant);
          kb_indexing.remove_term_indices(constant);
          kb_hl_supports.tms_remove_kb_hl_supports_mentioning_term(constant);
          cardinality_estimates.clear_cardinality_estimates(constant);
        } finally {
          kb_macros.$forts_being_removed$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Return the constant with NAME, or NIL if not present. */
  @SubL(source = "cycl/constants-high.lisp", position = 4590) 
  public static final SubLObject find_constant(SubLObject name) {
    checkType(name, $sym7$STRINGP);
    return constants_interface.kb_lookup_constant_by_name(name);
  }

  /** Return the name of CONSTANT or :unnamed. */
  @SubL(source = "cycl/constants-high.lisp", position = 4837) 
  public static final SubLObject constant_name(SubLObject constant) {
    checkType(constant, $sym20$CONSTANT_P);
    return constants_interface.kb_constant_name(constant);
  }

  /** Return the GUID of CONSTANT. */
  @SubL(source = "cycl/constants-high.lisp", position = 5005) 
  public static final SubLObject constant_guid(SubLObject constant) {
    checkType(constant, $sym20$CONSTANT_P);
    return ((NIL != constant_handles.constant_handle_validP(constant)) ? ((SubLObject) constants_interface.kb_constant_guid(constant)) : NIL);
  }

  /** Return the merged GUID of CONSTANT. */
  @SubL(source = "cycl/constants-high.lisp", position = 5198) 
  public static final SubLObject constant_merged_guid(SubLObject constant) {
    checkType(constant, $sym20$CONSTANT_P);
    return ((NIL != constant_handles.constant_handle_validP(constant)) ? ((SubLObject) constants_interface.kb_constant_merged_guid(constant)) : NIL);
  }

  /** Return the constant with ID, or NIL if not present. */
  @SubL(source = "cycl/constants-high.lisp", position = 5412) 
  public static final SubLObject find_constant_by_guid(SubLObject guid) {
    checkType(guid, $sym32$GUID_P);
    return constants_interface.kb_lookup_constant_by_guid(guid);
  }

  /** Rename CONSTANT to have NEW-NAME as its name.  The constant is returned. */
  @SubL(source = "cycl/constants-high.lisp", position = 5858) 
  public static final SubLObject rename_constant(SubLObject constant, SubLObject new_name) {
    checkType(constant, $sym20$CONSTANT_P);
    checkType(new_name, $sym7$STRINGP);
    return constants_interface.kb_rename_constant(constant, new_name);
  }

  /** Return the internal id of CONSTANT. */
  @SubL(source = "cycl/constants-high.lisp", position = 6182) 
  public static final SubLObject constant_internal_id(SubLObject constant) {
    checkType(constant, $sym20$CONSTANT_P);
    return constant_handles.constant_suid(constant);
  }

  /** Return the constant with internal ID, or NIL if not present. */
  @SubL(source = "cycl/constants-high.lisp", position = 6757) 
  public static final SubLObject find_constant_by_internal_id(SubLObject id) {
    checkType(id, $sym41$CONSTANT_INTERNAL_ID_P);
    return constant_handles.find_constant_by_suid(id);
  }

  /** Return T iff OBJECT is a constant that has its IDs installed. */
  @SubL(source = "cycl/constants-high.lisp", position = 7593) 
  public static final SubLObject installed_constant_p(SubLObject object) {
    return constant_handles.valid_constant_handleP(object);
  }

  /** Return T iff OBJECT is a constant that does not have its IDs installed. */
  @SubL(source = "cycl/constants-high.lisp", position = 7747) 
  public static final SubLObject uninstalled_constant_p(SubLObject object) {
    return makeBoolean(((NIL != constant_handles.constant_p(object))
           && (NIL == installed_constant_p(object))));
  }

  /** Return the internal ID where new constants started. */
  @SubL(source = "cycl/constants-high.lisp", position = 7950) 
  public static final SubLObject new_constant_internal_id_threshold() {
    return constant_handles.new_constant_suid_threshold();
  }

  /** Return the external id of CONSTANT. */
  @SubL(source = "cycl/constants-high.lisp", position = 8100) 
  public static final SubLObject constant_external_id(SubLObject constant) {
    checkType(constant, $sym20$CONSTANT_P);
    return constant_guid(constant);
  }

  /** Return the constant with EXTERNAL-ID, or NIL if not present. */
  @SubL(source = "cycl/constants-high.lisp", position = 8660) 
  public static final SubLObject find_constant_by_external_id(SubLObject external_id) {
    checkType(external_id, $sym1$CONSTANT_EXTERNAL_ID_P);
    return find_constant_by_guid(external_id);
  }

  /** Return T iff OBJECT could be an external constant ID. */
  @SubL(source = "cycl/constants-high.lisp", position = 8924) 
  public static final SubLObject constant_external_id_p(SubLObject object) {
    return Guids.guid_p(object);
  }

  /** Return T iff CONSTANT1 has a smaller external id than CONSTANT2 */
  @SubL(source = "cycl/constants-high.lisp", position = 9345) 
  public static final SubLObject constant_external_id_L(SubLObject constant1, SubLObject constant2) {
    {
      SubLObject guid_1 = constant_guid(constant1);
      SubLObject guid_2 = constant_guid(constant2);
      if (((NIL != guid_1)
           && (NIL != guid_2))) {
        return Guids.guidL(guid_1, guid_2);
      } else if ((!(((NIL != guid_1)
            || (NIL != guid_2))))) {
        return NIL;
      } else {
        return Types.sublisp_null(guid_1);
      }
    }
  }

  /** Returns a list of constant info-items corresponding to the GUID-LIST.  Each
info item is a list of guid-string and name. */
  @SubL(source = "cycl/constants-high.lisp", position = 9815) 
  public static final SubLObject constant_info_from_guid_strings(SubLObject guid_string_list) {
    checkType(guid_string_list, $sym53$LISTP);
    {
      SubLObject constant_info_list = NIL;
      SubLObject constant = NIL;
      SubLObject cdolist_list_var = guid_string_list;
      SubLObject guid_string = NIL;
      for (guid_string = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), guid_string = cdolist_list_var.first()) {
        constant = find_constant_by_external_id(Guids.string_to_guid(guid_string));
        if ((NIL != constant)) {
          constant_info_list = cons(list(guid_string, constant_name(constant)), constant_info_list);
        } else {
          constant_info_list = cons(NIL, constant_info_list);
        }
      }
      return Sequences.nreverse(constant_info_list);
    }
  }

  @SubL(source = "cycl/constants-high.lisp", position = 11034) 
  public static final SubLObject make_constant_external_id() {
    return make_constant_guid();
  }

  @SubL(source = "cycl/constants-high.lisp", position = 11449) 
  public static final SubLObject make_constant_guid() {
    return Guids.new_guid();
  }

  @SubL(source = "cycl/constants-high.lisp", position = 11508) 
  private static SubLSymbol $constant_legacy_guid_date$ = null;

  @SubL(source = "cycl/constants-high.lisp", position = 13080) 
  public static final SubLObject constant_legacy_id_p(SubLObject object) {
    return Types.integerp(object);
  }

  @SubL(source = "cycl/constants-high.lisp", position = 17589) 
  public static SubLSymbol $constant_dump_id_table$ = null;

  /** Return the constant with DUMP-ID during a KB load. */
  @SubL(source = "cycl/constants-high.lisp", position = 18080) 
  public static final SubLObject find_constant_by_dump_id(SubLObject dump_id) {
    return find_constant_by_internal_id(dump_id);
  }

  public static final SubLObject declare_constants_high_file() {
    declareFunction(myName, "create_constant", "CREATE-CONSTANT", 1, 1, false);
    declareFunction(myName, "find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
    declareFunction(myName, "gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false);
    declareFunction(myName, "suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 4, false);
    declareFunction(myName, "remove_constant", "REMOVE-CONSTANT", 1, 0, false);
    declareFunction(myName, "remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false);
    declareFunction(myName, "find_constant", "FIND-CONSTANT", 1, 0, false);
    declareFunction(myName, "constant_name", "CONSTANT-NAME", 1, 0, false);
    declareFunction(myName, "constant_guid", "CONSTANT-GUID", 1, 0, false);
    declareFunction(myName, "constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false);
    declareFunction(myName, "find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false);
    declareFunction(myName, "find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false);
    declareFunction(myName, "rename_constant", "RENAME-CONSTANT", 2, 0, false);
    declareFunction(myName, "constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false);
    declareFunction(myName, "constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false);
    declareFunction(myName, "find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
    declareFunction(myName, "constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false);
    declareFunction(myName, "constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false);
    declareFunction(myName, "installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false);
    declareFunction(myName, "constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false);
    declareFunction(myName, "find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
    declareFunction(myName, "constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false);
    declareFunction(myName, "constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false);
    declareFunction(myName, "constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false);
    declareFunction(myName, "constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
    declareFunction(myName, "constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
    declareFunction(myName, "make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false);
    declareFunction(myName, "make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false);
    declareFunction(myName, "make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false);
    declareFunction(myName, "make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false);
    declareFunction(myName, "constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false);
    declareFunction(myName, "constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false);
    declareFunction(myName, "find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false);
    declareFunction(myName, "constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false);
    declareFunction(myName, "unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false);
    declareFunction(myName, "constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
    declareFunction(myName, "random_constant", "RANDOM-CONSTANT", 0, 1, false);
    declareFunction(myName, "sample_constants", "SAMPLE-CONSTANTS", 0, 3, false);
    declareFunction(myName, "constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false);
    declareFunction(myName, "new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false);
    declareFunction(myName, "constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false);
    declareFunction(myName, "constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false);
    declareFunction(myName, "find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false);
    declareMacro(myName, "with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE");
    return NIL;
  }

  public static final SubLObject init_constants_high_file() {
    $constant_legacy_guid_date$ = deflexical("*CONSTANT-LEGACY-GUID-DATE*", $list63);
    $constant_dump_id_table$ = defparameter("*CONSTANT-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_constants_high_file() {
    // CVS_ID("Id: constants-high.lisp 127284 2009-02-27 19:58:11Z daves ");
    utilities_macros.register_cyc_api_function($sym2$CREATE_CONSTANT, $list3, $str4$Return_a_new_constant_named_NAME_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym8$FIND_OR_CREATE_CONSTANT, $list3, $str9$Return_the_constant_with_NAME_if_, $list10, $list6);
    utilities_macros.register_cyc_api_function($sym13$GENTEMP_CONSTANT, $list14, $str15$Create_and_return_a_temporary_con, $list16, $list6);
    utilities_macros.register_cyc_api_function($sym21$REMOVE_CONSTANT, $list22, $str23$Remove_CONSTANT_from_the_KB_, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym26$FIND_CONSTANT, $list27, $str28$Return_the_constant_with_NAME__or, $list10, $list29);
    utilities_macros.register_cyc_api_function($sym30$CONSTANT_NAME, $list22, $str31$Return_the_name_of_CONSTANT_or__u, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym34$RENAME_CONSTANT, $list35, $str36$Rename_CONSTANT_to_have_NEW_NAME_, $list37, $list6);
    utilities_macros.register_cyc_api_function($sym38$CONSTANT_INTERNAL_ID, $list22, $str39$Return_the_internal_id_of_CONSTAN, $list24, $list40);
    utilities_macros.register_cyc_api_function($sym42$FIND_CONSTANT_BY_INTERNAL_ID, $list43, $str44$Return_the_constant_with_internal, $list45, $list29);
    utilities_macros.register_cyc_api_function($sym46$CONSTANT_EXTERNAL_ID, $list22, $str47$Return_the_external_id_of_CONSTAN, $list24, $list48);
    utilities_macros.register_cyc_api_function($sym49$FIND_CONSTANT_BY_EXTERNAL_ID, $list50, $str51$Return_the_constant_with_EXTERNAL, $list52, $list29);
    utilities_macros.register_cyc_api_function($sym54$CONSTANT_INFO_FROM_GUID_STRINGS, $list55, $str56$Returns_a_list_of_constant_info_i, $list57, $list58);
    utilities_macros.register_cyc_api_function($sym59$CONSTANT_INFO_FROM_NAME_STRINGS, $list60, $str61$Returns_a_list_of_constant_info_i, $list62, $list58);
    utilities_macros.register_cyc_api_function($sym69$CONSTANT_NAMESPACE, $list22, $str70$Return_the_namespace_to_which_the, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym71$CONSTANT_NAME_WITHIN_NAMESPACE, $list22, $str72$Return_the_constant_name_within_i, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym74$RANDOM_CONSTANT, $list75, $str76$Return_a_randomly_chosen_constant, NIL, $list6);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");
  public static final SubLSymbol $sym1$CONSTANT_EXTERNAL_ID_P = makeSymbol("CONSTANT-EXTERNAL-ID-P");
  public static final SubLSymbol $sym2$CREATE_CONSTANT = makeSymbol("CREATE-CONSTANT");
  public static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));
  public static final SubLString $str4$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID as the external ID.");
  public static final SubLList $list5 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));
  public static final SubLList $list6 = list(makeSymbol("CONSTANT-P"));
  public static final SubLSymbol $sym7$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym8$FIND_OR_CREATE_CONSTANT = makeSymbol("FIND-OR-CREATE-CONSTANT");
  public static final SubLString $str9$Return_the_constant_with_NAME_if_ = makeString("Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant.");
  public static final SubLList $list10 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));
  public static final SubLString $str11$TMP = makeString("TMP");
  public static final SubLString $str12$_A__A = makeString("~A-~A");
  public static final SubLSymbol $sym13$GENTEMP_CONSTANT = makeSymbol("GENTEMP-CONSTANT");
  public static final SubLList $list14 = list(makeSymbol("START-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREFIX"), makeString("TMP")));
  public static final SubLString $str15$Create_and_return_a_temporary_con = makeString("Create and return a temporary constant whose name is based on START-NAME");
  public static final SubLList $list16 = list(list(makeSymbol("START-NAME"), makeSymbol("STRINGP")));
  public static final SubLString $str17$ = makeString("");
  public static final SubLString $str18$T = makeString("T");
  public static final SubLString $str19$T_ = makeString("T-");
  public static final SubLSymbol $sym20$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym21$REMOVE_CONSTANT = makeSymbol("REMOVE-CONSTANT");
  public static final SubLList $list22 = list(makeSymbol("CONSTANT"));
  public static final SubLString $str23$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");
  public static final SubLList $list24 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));
  public static final SubLList $list25 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym26$FIND_CONSTANT = makeSymbol("FIND-CONSTANT");
  public static final SubLList $list27 = list(makeSymbol("NAME"));
  public static final SubLString $str28$Return_the_constant_with_NAME__or = makeString("Return the constant with NAME, or NIL if not present.");
  public static final SubLList $list29 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $sym30$CONSTANT_NAME = makeSymbol("CONSTANT-NAME");
  public static final SubLString $str31$Return_the_name_of_CONSTANT_or__u = makeString("Return the name of CONSTANT or :unnamed.");
  public static final SubLSymbol $sym32$GUID_P = makeSymbol("GUID-P");
  public static final SubLSymbol $sym33$GUID_STRING_P = makeSymbol("GUID-STRING-P");
  public static final SubLSymbol $sym34$RENAME_CONSTANT = makeSymbol("RENAME-CONSTANT");
  public static final SubLList $list35 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));
  public static final SubLString $str36$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");
  public static final SubLList $list37 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("STRINGP")));
  public static final SubLSymbol $sym38$CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");
  public static final SubLString $str39$Return_the_internal_id_of_CONSTAN = makeString("Return the internal id of CONSTANT.");
  public static final SubLList $list40 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-INTERNAL-ID-P")));
  public static final SubLSymbol $sym41$CONSTANT_INTERNAL_ID_P = makeSymbol("CONSTANT-INTERNAL-ID-P");
  public static final SubLSymbol $sym42$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
  public static final SubLList $list43 = list(makeSymbol("ID"));
  public static final SubLString $str44$Return_the_constant_with_internal = makeString("Return the constant with internal ID, or NIL if not present.");
  public static final SubLList $list45 = list(list(makeSymbol("ID"), makeSymbol("CONSTANT-INTERNAL-ID-P")));
  public static final SubLSymbol $sym46$CONSTANT_EXTERNAL_ID = makeSymbol("CONSTANT-EXTERNAL-ID");
  public static final SubLString $str47$Return_the_external_id_of_CONSTAN = makeString("Return the external id of CONSTANT.");
  public static final SubLList $list48 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));
  public static final SubLSymbol $sym49$FIND_CONSTANT_BY_EXTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-EXTERNAL-ID");
  public static final SubLList $list50 = list(makeSymbol("EXTERNAL-ID"));
  public static final SubLString $str51$Return_the_constant_with_EXTERNAL = makeString("Return the constant with EXTERNAL-ID, or NIL if not present.");
  public static final SubLList $list52 = list(list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));
  public static final SubLSymbol $sym53$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym54$CONSTANT_INFO_FROM_GUID_STRINGS = makeSymbol("CONSTANT-INFO-FROM-GUID-STRINGS");
  public static final SubLList $list55 = list(makeSymbol("GUID-STRING-LIST"));
  public static final SubLString $str56$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.");
  public static final SubLList $list57 = list(list(makeSymbol("GUID-STRING-LIST"), makeSymbol("LISTP")));
  public static final SubLList $list58 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym59$CONSTANT_INFO_FROM_NAME_STRINGS = makeSymbol("CONSTANT-INFO-FROM-NAME-STRINGS");
  public static final SubLList $list60 = list(makeSymbol("NAME-STRING-LIST"));
  public static final SubLString $str61$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.");
  public static final SubLList $list62 = list(list(makeSymbol("NAME-STRING-LIST"), makeSymbol("LISTP")));
  public static final SubLList $list63 = list(SEVEN_INTEGER, TWENTY_INTEGER, makeInteger(1969));
  public static final SubLSymbol $sym64$CONSTANT_LEGACY_ID_P = makeSymbol("CONSTANT-LEGACY-ID-P");
  public static final SubLList $list65 = list(makeSymbol("MONTH"), makeSymbol("DAY"), makeSymbol("YEAR"));
  public static final SubLList $list66 = list(makeSymbol("LEGACY-MONTH"), makeSymbol("LEGACY-DAY"), makeSymbol("LEGACY-YEAR"));
  public static final SubLSymbol $kw67$UNNAMED = makeKeyword("UNNAMED");
  public static final SubLString $str68$cyc = makeString("cyc");
  public static final SubLSymbol $sym69$CONSTANT_NAMESPACE = makeSymbol("CONSTANT-NAMESPACE");
  public static final SubLString $str70$Return_the_namespace_to_which_the = makeString("Return the namespace to which the constant belongs.");
  public static final SubLSymbol $sym71$CONSTANT_NAME_WITHIN_NAMESPACE = makeSymbol("CONSTANT-NAME-WITHIN-NAMESPACE");
  public static final SubLString $str72$Return_the_constant_name_within_i = makeString("Return the constant name within its namespace.");
  public static final SubLSymbol $sym73$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym74$RANDOM_CONSTANT = makeSymbol("RANDOM-CONSTANT");
  public static final SubLList $list75 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), makeSymbol("TRUE"))));
  public static final SubLString $str76$Return_a_randomly_chosen_constant = makeString("Return a randomly chosen constant that satisfies TEST");
  public static final SubLInteger $int77$500 = makeInteger(500);
  public static final SubLSymbol $sym78$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLList $list79 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));
  public static final SubLSymbol $sym80$CLET = makeSymbol("CLET");
  public static final SubLList $list81 = list(list(makeSymbol("*CONSTANT-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-CONSTANT-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("CONSTANT-DUMP-ID"))));

  //// Initializers

  public void declareFunctions() {
    declare_constants_high_file();
  }

  public void initializeVariables() {
    init_constants_high_file();
  }

  public void runTopLevelForms() {
    setup_constants_high_file();
  }

}
