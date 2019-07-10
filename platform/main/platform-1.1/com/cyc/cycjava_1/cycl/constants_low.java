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

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.arete;
//dm import com.cyc.cycjava_1.cycl.constant_completion_low;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constant_index_manager;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.constants_interface;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class constants_low extends SubLTranslatedFile {

  //// Constructor

  private constants_low() {}
  public static final SubLFile me = new constants_low();
  public static final String myName = "com.cyc.cycjava_1.cycl.constants_low";

  //// Definitions

  @SubL(source = "cycl/constants-low.lisp", position = 939) 
  private static SubLSymbol $arete_constants_touched$ = null;

  /** ID -> constant-guid table */
  @SubL(source = "cycl/constants-low.lisp", position = 1173) 
  private static SubLSymbol $constant_guid_table$ = null;

  /** ID -> merged constant-guid table.  Use for keeping track of merged guids for a Constant. */
  @SubL(source = "cycl/constants-low.lisp", position = 1388) 
  private static SubLSymbol $constant_merged_guid_table$ = null;

  /** The GUID -> CONSTANT mapping table. */
  @SubL(source = "cycl/constants-low.lisp", position = 1546) 
  private static SubLSymbol $constant_from_guid$ = null;

  @SubL(source = "cycl/constants-low.lisp", position = 1632) 
  public static final SubLObject setup_constant_guid_table(SubLObject size, SubLObject exactP) {
    {
      SubLObject setupP = NIL;
      if ((NIL == id_index.id_index_p($constant_guid_table$.getGlobalValue()))) {
        $constant_guid_table$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
        setupP = T;
      }
      if ((NIL == id_index.id_index_p($constant_merged_guid_table$.getGlobalValue()))) {
        $constant_merged_guid_table$.setGlobalValue(id_index.new_id_index($int5$750, ZERO_INTEGER));
        setupP = T;
      }
      if ((!($constant_from_guid$.getGlobalValue().isHashtable()))) {
        $constant_from_guid$.setGlobalValue(Hashtables.make_hash_table(size, Symbols.symbol_function(EQUALP), UNPROVIDED));
        setupP = T;
      }
      return setupP;
    }
  }

  @SubL(source = "cycl/constants-low.lisp", position = 2364) 
  public static final SubLObject lookup_constant_guid(SubLObject id) {
    return id_index.id_index_lookup($constant_guid_table$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/constants-low.lisp", position = 2473) 
  public static final SubLObject lookup_constant_merged_guid(SubLObject id) {
    return id_index.id_index_lookup($constant_merged_guid_table$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/constants-low.lisp", position = 2582) 
  public static final SubLObject lookup_constant_by_guid(SubLObject guid) {
    return Hashtables.gethash_without_values(guid, $constant_from_guid$.getGlobalValue(), UNPROVIDED);
  }

  /** Note that ID will be used as the id for CONSTANT-GUID,
   and that the constant with guid CONSTANT-GUID is CONSTANT. */
  @SubL(source = "cycl/constants-low.lisp", position = 2692) 
  public static final SubLObject register_constant_guid(SubLObject id, SubLObject constant_guid, SubLObject constant) {
    id_index.id_index_enter($constant_guid_table$.getGlobalValue(), id, constant_guid);
    Hashtables.sethash(constant_guid, $constant_from_guid$.getGlobalValue(), constant);
    return constant_guid;
  }

  /** Note that ID is not in use as a CONSTANT id, i.e. no longer points to GUID. */
  @SubL(source = "cycl/constants-low.lisp", position = 3345) 
  public static final SubLObject deregister_constant_guid(SubLObject id, SubLObject guid) {
    id_index.id_index_remove($constant_guid_table$.getGlobalValue(), id);
    Hashtables.remhash(guid, $constant_from_guid$.getGlobalValue());
    return NIL;
  }

  @SubL(source = "cycl/constants-low.lisp", position = 3778) 
  public static final SubLObject clear_constant_guid_table() {
    id_index.clear_id_index($constant_guid_table$.getGlobalValue());
    id_index.clear_id_index($constant_merged_guid_table$.getGlobalValue());
    Hashtables.clrhash($constant_from_guid$.getGlobalValue());
    return NIL;
  }

  /** Create a new constant named NAME with id EXTERNAL-ID  Return a SUID. */
  @SubL(source = "cycl/constants-low.lisp", position = 3961) 
  public static final SubLObject kb_create_constant_kb_store(SubLObject name, SubLObject external_id) {
    {
      SubLObject constant = lookup_constant_by_guid(external_id);
      if ((NIL != constant)) {
        return constants_high.constant_internal_id(constant);
      } else {
        {
          SubLObject suid = constant_handles.make_constant_suid();
          constant = constant_handles.make_constant_shell(name, T);
          constant_handles.install_constant_suid(constant, suid);
          if (name.isString()) {
            constant_handles.deregister_invalid_constant_by_name(name);
          }
          kb_create_constant_int(constant, name, external_id);
          return suid;
        }
      }
    }
  }

  @SubL(source = "cycl/constants-low.lisp", position = 4694) 
  public static final SubLObject kb_create_constant_int(SubLObject constant, SubLObject name, SubLObject external_id) {
    install_constant_external_id(constant, external_id);
    if (name.isString()) {
      constant_completion_low.add_constant_to_completions(constant, name);
    }
    return NIL;
  }

  /** Install the ids for CONSTANT based on EXTERNAL-ID. */
  @SubL(source = "cycl/constants-low.lisp", position = 5232) 
  public static final SubLObject install_constant_external_id(SubLObject constant, SubLObject external_id) {
    {
      SubLObject guid = NIL;
      if ((NIL != constants_high.constant_legacy_id_p(external_id))) {
        guid = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31626");
      } else if ((NIL != Guids.guid_p(external_id))) {
        guid = external_id;
      }
      install_constant_guid(constant, guid);
      return constant;
    }
  }

  @SubL(source = "cycl/constants-low.lisp", position = 5881) 
  public static final SubLObject kb_remove_constant_internal(SubLObject constant) {
    {
      SubLObject name = constant_name_internal(constant);
      if (name.isString()) {
        constant_completion_low.remove_constant_from_completions(constant, name);
        constant_handles.deregister_invalid_constant_by_name(name);
      }
    }
    deregister_constant_guts(constant);
    deregister_constant_ids(constant);
    constant_handles.free_constant(constant);
    return NIL;
  }

  @SubL(source = "cycl/constants-low.lisp", position = 6516) 
  public static final SubLObject deregister_constant_guts(SubLObject constant) {
    {
      SubLObject suid = constant_handles.constant_suid(constant);
      if (suid.isInteger()) {
        constant_index_manager.deregister_constant_index(suid);
      }
    }
    return constant;
  }

  /** Remove all the id indexing to CONSTANT. */
  @SubL(source = "cycl/constants-low.lisp", position = 6697) 
  public static final SubLObject deregister_constant_ids(SubLObject constant) {
    {
      SubLObject guid = constants_high.constant_guid(constant);
      if ((NIL != Guids.guid_p(guid))) {
        deregister_constant_guid(constant_handles.constant_suid(constant), guid);
      }
    }
    {
      SubLObject guid = constants_high.constant_merged_guid(constant);
      if ((NIL != Guids.guid_p(guid))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32190");
      }
    }
    {
      SubLObject suid = constant_handles.constant_suid(constant);
      if (suid.isInteger()) {
        constant_handles.deregister_constant_suid(suid);
      }
    }
    return constant;
  }

  @SubL(source = "cycl/constants-low.lisp", position = 7258) 
  public static final SubLObject constant_guid_internal(SubLObject constant) {
    {
      SubLObject id = constant_handles.constant_suid(constant);
      return lookup_constant_guid(id);
    }
  }

  @SubL(source = "cycl/constants-low.lisp", position = 7421) 
  public static final SubLObject constant_merged_guid_internal(SubLObject constant) {
    {
      SubLObject id = constant_handles.constant_suid(constant);
      return lookup_constant_merged_guid(id);
    }
  }

  @SubL(source = "cycl/constants-low.lisp", position = 7566) 
  public static final SubLObject constant_name_internal(SubLObject constant) {
    return constant_handles.c_name(constant);
  }

  /** Return the indexing structure for CONSTANT. */
  @SubL(source = "cycl/constants-low.lisp", position = 7646) 
  public static final SubLObject constant_index(SubLObject constant) {
    {
      SubLObject id = constant_handles.constant_suid(constant);
      if ((NIL != id)) {
        return constant_index_manager.lookup_constant_index(id);
      }
    }
    return NIL;
  }

  /** Rename CONSTANT to have NEW-NAME as its name.  The constant is returned. */
  @SubL(source = "cycl/constants-low.lisp", position = 8283) 
  public static final SubLObject kb_rename_constant_internal(SubLObject constant, SubLObject new_name) {
    if ((NIL != constants_interface.kb_lookup_constant_by_name(new_name))) {
      Errors.error($str7$A_constant_with_the_name__s_alrea, new_name);
    }
    {
      SubLObject old_name = constants_high.constant_name(constant);
      if (old_name.isString()) {
        constant_completion_low.remove_constant_from_completions(constant, old_name);
        constant_handles.deregister_invalid_constant_by_name(old_name);
      }
    }
    reset_constant_name(constant, new_name);
    if (new_name.isString()) {
      constant_completion_low.add_constant_to_completions(constant, new_name);
      constant_handles.register_invalid_constant_by_name(new_name, constant);
    }
    return constant;
  }

  /** Primitively change the name of CONSTANT to NEW-NAME. */
  @SubL(source = "cycl/constants-low.lisp", position = 8980) 
  public static final SubLObject reset_constant_name(SubLObject constant, SubLObject new_name) {
    constant_handles._csetf_c_name(constant, new_name);
    return constant;
  }

  /** Primitively change the assertion index for CONSTANT to NEW-INDEX. */
  @SubL(source = "cycl/constants-low.lisp", position = 9176) 
  public static final SubLObject reset_constant_index(SubLObject constant, SubLObject new_index) {
    constant_index_manager.register_constant_index(constant_handles.constant_suid(constant), new_index);
    return constant;
  }

  @SubL(source = "cycl/constants-low.lisp", position = 9413) 
  public static final SubLObject install_constant_guid(SubLObject constant, SubLObject guid) {
    checkType(constant, $sym8$CONSTANT_P);
    checkType(guid, $sym9$GUID_P);
    if ((NIL == Guids.guid_p(constants_high.constant_guid(constant)))) {
      reset_constant_guid(constant, guid);
    }
    return constant;
  }

  /** Primitively change the GUID of CONSTANT to NEW-GUID. */
  @SubL(source = "cycl/constants-low.lisp", position = 9634) 
  public static final SubLObject reset_constant_guid(SubLObject constant, SubLObject new_guid) {
    register_constant_guid(constant_handles.constant_suid(constant), new_guid, constant);
    return constant;
  }

  /** Install GUID for CONSTANT with DUMP-ID in a KB load. */
  @SubL(source = "cycl/constants-low.lisp", position = 10502) 
  public static final SubLObject load_install_constant_ids(SubLObject constant, SubLObject dump_id, SubLObject guid) {
    {
      SubLObject name = constant_name_internal(constant);
      SubLObject suid = dump_id;
      constant_handles.install_constant_suid(constant, suid);
      constant_handles.deregister_invalid_constant_by_name(name);
      kb_create_constant_int(constant, name, guid);
      return constant;
    }
  }

  public static final SubLObject declare_constants_low_file() {
    declareFunction(myName, "arete_note_constant_touched", "ARETE-NOTE-CONSTANT-TOUCHED", 1, 0, false);
    declareFunction(myName, "setup_constant_guid_table", "SETUP-CONSTANT-GUID-TABLE", 2, 0, false);
    declareFunction(myName, "lookup_constant_guid", "LOOKUP-CONSTANT-GUID", 1, 0, false);
    declareFunction(myName, "lookup_constant_merged_guid", "LOOKUP-CONSTANT-MERGED-GUID", 1, 0, false);
    declareFunction(myName, "lookup_constant_by_guid", "LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
    declareFunction(myName, "register_constant_guid", "REGISTER-CONSTANT-GUID", 3, 0, false);
    declareFunction(myName, "register_constant_merged_guid", "REGISTER-CONSTANT-MERGED-GUID", 3, 0, false);
    declareFunction(myName, "deregister_constant_guid", "DEREGISTER-CONSTANT-GUID", 2, 0, false);
    declareFunction(myName, "deregister_constant_merged_guid", "DEREGISTER-CONSTANT-MERGED-GUID", 2, 0, false);
    declareFunction(myName, "clear_constant_guid_table", "CLEAR-CONSTANT-GUID-TABLE", 0, 0, false);
    declareFunction(myName, "kb_create_constant_kb_store", "KB-CREATE-CONSTANT-KB-STORE", 2, 0, false);
    declareFunction(myName, "kb_create_constant_int", "KB-CREATE-CONSTANT-INT", 3, 0, false);
    declareFunction(myName, "kb_create_constant_cyc", "KB-CREATE-CONSTANT-CYC", 2, 0, false);
    declareFunction(myName, "install_constant_external_id", "INSTALL-CONSTANT-EXTERNAL-ID", 2, 0, false);
    declareFunction(myName, "install_constant_internal_id", "INSTALL-CONSTANT-INTERNAL-ID", 2, 0, false);
    declareFunction(myName, "kb_remove_constant_internal", "KB-REMOVE-CONSTANT-INTERNAL", 1, 0, false);
    declareFunction(myName, "deregister_constant_guts", "DEREGISTER-CONSTANT-GUTS", 1, 0, false);
    declareFunction(myName, "deregister_constant_ids", "DEREGISTER-CONSTANT-IDS", 1, 0, false);
    declareFunction(myName, "constant_guid_internal", "CONSTANT-GUID-INTERNAL", 1, 0, false);
    declareFunction(myName, "constant_merged_guid_internal", "CONSTANT-MERGED-GUID-INTERNAL", 1, 0, false);
    declareFunction(myName, "constant_name_internal", "CONSTANT-NAME-INTERNAL", 1, 0, false);
    declareFunction(myName, "constant_index", "CONSTANT-INDEX", 1, 0, false);
    declareFunction(myName, "kb_new_constant_info_iterator_internal", "KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL", 0, 0, false);
    declareFunction(myName, "constant_info", "CONSTANT-INFO", 1, 0, false);
    declareFunction(myName, "kb_rename_constant_internal", "KB-RENAME-CONSTANT-INTERNAL", 2, 0, false);
    declareFunction(myName, "reset_constant_name", "RESET-CONSTANT-NAME", 2, 0, false);
    declareFunction(myName, "reset_constant_index", "RESET-CONSTANT-INDEX", 2, 0, false);
    declareFunction(myName, "install_constant_guid", "INSTALL-CONSTANT-GUID", 2, 0, false);
    declareFunction(myName, "reset_constant_guid", "RESET-CONSTANT-GUID", 2, 0, false);
    declareFunction(myName, "install_constant_merged_guid", "INSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
    declareFunction(myName, "uninstall_constant_merged_guid", "UNINSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
    declareFunction(myName, "load_install_constant_ids", "LOAD-INSTALL-CONSTANT-IDS", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_constants_low_file() {
    $arete_constants_touched$ = deflexical("*ARETE-CONSTANTS-TOUCHED*", maybeDefault( $sym0$_ARETE_CONSTANTS_TOUCHED_, $arete_constants_touched$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    $constant_guid_table$ = deflexical("*CONSTANT-GUID-TABLE*", maybeDefault( $sym1$_CONSTANT_GUID_TABLE_, $constant_guid_table$, ()-> ($kw2$UNINITIALIZED)));
    $constant_merged_guid_table$ = deflexical("*CONSTANT-MERGED-GUID-TABLE*", maybeDefault( $sym3$_CONSTANT_MERGED_GUID_TABLE_, $constant_merged_guid_table$, ()-> ($kw2$UNINITIALIZED)));
    $constant_from_guid$ = deflexical("*CONSTANT-FROM-GUID*", maybeDefault( $sym4$_CONSTANT_FROM_GUID_, $constant_from_guid$, NIL));
    return NIL;
  }

  public static final SubLObject setup_constants_low_file() {
    // CVS_ID("Id: constants-low.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_ARETE_CONSTANTS_TOUCHED_);
    subl_macro_promotions.declare_defglobal($sym1$_CONSTANT_GUID_TABLE_);
    subl_macro_promotions.declare_defglobal($sym3$_CONSTANT_MERGED_GUID_TABLE_);
    subl_macro_promotions.declare_defglobal($sym4$_CONSTANT_FROM_GUID_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_ARETE_CONSTANTS_TOUCHED_ = makeSymbol("*ARETE-CONSTANTS-TOUCHED*");
  public static final SubLSymbol $sym1$_CONSTANT_GUID_TABLE_ = makeSymbol("*CONSTANT-GUID-TABLE*");
  public static final SubLSymbol $kw2$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym3$_CONSTANT_MERGED_GUID_TABLE_ = makeSymbol("*CONSTANT-MERGED-GUID-TABLE*");
  public static final SubLSymbol $sym4$_CONSTANT_FROM_GUID_ = makeSymbol("*CONSTANT-FROM-GUID*");
  public static final SubLInteger $int5$750 = makeInteger(750);
  public static final SubLSymbol $sym6$CONSTANT_INFO = makeSymbol("CONSTANT-INFO");
  public static final SubLString $str7$A_constant_with_the_name__s_alrea = makeString("A constant with the name ~s already exists.");
  public static final SubLSymbol $sym8$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym9$GUID_P = makeSymbol("GUID-P");

  //// Initializers

  public void declareFunctions() {
    declare_constants_low_file();
  }

  public void initializeVariables() {
    init_constants_low_file();
  }

  public void runTopLevelForms() {
    setup_constants_low_file();
  }

}
