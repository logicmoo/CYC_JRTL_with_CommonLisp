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
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.disjoint_with;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.new_cycl_query_specification;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.xml_utilities;

public  final class value_tables extends SubLTranslatedFile {

  //// Constructor

  private value_tables() {}
  public static final SubLFile me = new value_tables();
  public static final String myName = "com.cyc.cycjava_1.cycl.value_tables";

  //// Definitions

  public static final class $value_table_column_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $query; }
    public SubLObject getField3() { return $label; }
    public SubLObject getField4() { return $values; }
    public SubLObject setField2(SubLObject value) { return $query = value; }
    public SubLObject setField3(SubLObject value) { return $label = value; }
    public SubLObject setField4(SubLObject value) { return $values = value; }
    public SubLObject $query = NIL;
    public SubLObject $label = NIL;
    public SubLObject $values = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($value_table_column_native.class, $sym0$VALUE_TABLE_COLUMN, $sym1$VALUE_TABLE_COLUMN_P, $list2, $list3, new String[] {"$query", "$label", "$values"}, $list4, $list5, $sym6$PRINT_VALUE_TABLE_COLUMN);
  }

  @SubL(source = "cycl/value-tables.lisp", position = 873) 
  public static SubLSymbol $dtp_value_table_column$ = null;

  @SubL(source = "cycl/value-tables.lisp", position = 873) 
  public static final SubLObject value_table_column_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4824");
    return NIL;
  }

  public static final class $value_table_column_p$UnaryFunction extends UnaryFunction {
    public $value_table_column_p$UnaryFunction() { super(extractFunctionNamed("VALUE-TABLE-COLUMN-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4828"); }
  }

  public static final class $value_table_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $label; }
    public SubLObject getField4() { return $input_columns; }
    public SubLObject getField5() { return $output_column; }
    public SubLObject getField6() { return $assignments; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $label = value; }
    public SubLObject setField4(SubLObject value) { return $input_columns = value; }
    public SubLObject setField5(SubLObject value) { return $output_column = value; }
    public SubLObject setField6(SubLObject value) { return $assignments = value; }
    public SubLObject $id = NIL;
    public SubLObject $label = NIL;
    public SubLObject $input_columns = NIL;
    public SubLObject $output_column = NIL;
    public SubLObject $assignments = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($value_table_native.class, $sym30$VALUE_TABLE, $sym31$VALUE_TABLE_P, $list32, $list33, new String[] {"$id", "$label", "$input_columns", "$output_column", "$assignments"}, $list34, $list35, $sym36$PRINT_VALUE_TABLE);
  }

  @SubL(source = "cycl/value-tables.lisp", position = 3491) 
  public static SubLSymbol $dtp_value_table$ = null;

  @SubL(source = "cycl/value-tables.lisp", position = 3491) 
  public static final SubLObject value_table_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4823");
    return NIL;
  }

  public static final class $value_table_p$UnaryFunction extends UnaryFunction {
    public $value_table_p$UnaryFunction() { super(extractFunctionNamed("VALUE-TABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4835"); }
  }

  public static final class $variable_mapping_table_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $source_query; }
    public SubLObject getField4() { return $target_query; }
    public SubLObject getField5() { return $source_variables; }
    public SubLObject getField6() { return $target_variables; }
    public SubLObject getField7() { return $incompatibles; }
    public SubLObject getField8() { return $assignments; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $source_query = value; }
    public SubLObject setField4(SubLObject value) { return $target_query = value; }
    public SubLObject setField5(SubLObject value) { return $source_variables = value; }
    public SubLObject setField6(SubLObject value) { return $target_variables = value; }
    public SubLObject setField7(SubLObject value) { return $incompatibles = value; }
    public SubLObject setField8(SubLObject value) { return $assignments = value; }
    public SubLObject $id = NIL;
    public SubLObject $source_query = NIL;
    public SubLObject $target_query = NIL;
    public SubLObject $source_variables = NIL;
    public SubLObject $target_variables = NIL;
    public SubLObject $incompatibles = NIL;
    public SubLObject $assignments = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($variable_mapping_table_native.class, $sym83$VARIABLE_MAPPING_TABLE, $sym84$VARIABLE_MAPPING_TABLE_P, $list85, $list86, new String[] {"$id", "$source_query", "$target_query", "$source_variables", "$target_variables", "$incompatibles", "$assignments"}, $list87, $list88, $sym89$PRINT_VARMAP_TABLE);
  }

  @SubL(source = "cycl/value-tables.lisp", position = 8704) 
  public static SubLSymbol $dtp_variable_mapping_table$ = null;

  @SubL(source = "cycl/value-tables.lisp", position = 8704) 
  public static final SubLObject variable_mapping_table_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4825");
    return NIL;
  }

  public static final class $variable_mapping_table_p$UnaryFunction extends UnaryFunction {
    public $variable_mapping_table_p$UnaryFunction() { super(extractFunctionNamed("VARIABLE-MAPPING-TABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4843"); }
  }

  public static final SubLObject declare_value_tables_file() {
    declareFunction(myName, "value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false); new $value_table_column_p$UnaryFunction();
    //declareFunction(myName, "value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false);
    //declareFunction(myName, "value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false);
    //declareFunction(myName, "value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false);
    //declareFunction(myName, "_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false);
    //declareFunction(myName, "_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false);
    //declareFunction(myName, "_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false);
    //declareFunction(myName, "make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false);
    //declareFunction(myName, "print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false);
    //declareFunction(myName, "new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false);
    //declareFunction(myName, "load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false);
    //declareFunction(myName, "xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false);
    //declareFunction(myName, "get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false);
    //declareFunction(myName, "get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false);
    declareFunction(myName, "value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "value_table_p", "VALUE-TABLE-P", 1, 0, false); new $value_table_p$UnaryFunction();
    //declareFunction(myName, "value_table_id", "VALUE-TABLE-ID", 1, 0, false);
    //declareFunction(myName, "value_table_label", "VALUE-TABLE-LABEL", 1, 0, false);
    //declareFunction(myName, "value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false);
    //declareFunction(myName, "value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false);
    //declareFunction(myName, "value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false);
    //declareFunction(myName, "_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false);
    //declareFunction(myName, "_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false);
    //declareFunction(myName, "_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false);
    //declareFunction(myName, "_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false);
    //declareFunction(myName, "make_value_table", "MAKE-VALUE-TABLE", 0, 1, false);
    //declareFunction(myName, "print_value_table", "PRINT-VALUE-TABLE", 3, 0, false);
    //declareFunction(myName, "new_value_table", "NEW-VALUE-TABLE", 1, 0, false);
    //declareFunction(myName, "load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false);
    //declareFunction(myName, "xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false);
    //declareFunction(myName, "get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false);
    //declareFunction(myName, "get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false);
    //declareFunction(myName, "load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false);
    declareFunction(myName, "variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false); new $variable_mapping_table_p$UnaryFunction();
    //declareFunction(myName, "variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false);
    //declareFunction(myName, "variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false);
    //declareFunction(myName, "variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false);
    //declareFunction(myName, "variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false);
    //declareFunction(myName, "variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false);
    //declareFunction(myName, "variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false);
    //declareFunction(myName, "variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false);
    //declareFunction(myName, "_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false);
    //declareFunction(myName, "make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false);
    //declareFunction(myName, "print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false);
    //declareFunction(myName, "xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false);
    //declareFunction(myName, "new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false);
    //declareFunction(myName, "load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false);
    //declareFunction(myName, "get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false);
    //declareFunction(myName, "varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false);
    //declareFunction(myName, "varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false);
    //declareFunction(myName, "varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false);
    //declareFunction(myName, "varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false);
    //declareFunction(myName, "varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false);
    //declareFunction(myName, "any_disjoint_with_anyP_memoized_internal", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INTERNAL", 3, 0, false);
    //declareFunction(myName, "any_disjoint_with_anyP_memoized", "ANY-DISJOINT-WITH-ANY?-MEMOIZED", 3, 0, false);
    //declareFunction(myName, "varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false);
    //declareFunction(myName, "varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false);
    //declareFunction(myName, "varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false);
    //declareFunction(myName, "varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false);
    //declareFunction(myName, "varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false);
    //declareFunction(myName, "varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false);
    //declareFunction(myName, "varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false);
    //declareFunction(myName, "varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false);
    return NIL;
  }

  public static final SubLObject init_value_tables_file() {
    $dtp_value_table_column$ = defconstant("*DTP-VALUE-TABLE-COLUMN*", $sym0$VALUE_TABLE_COLUMN);
    $dtp_value_table$ = defconstant("*DTP-VALUE-TABLE*", $sym30$VALUE_TABLE);
    $dtp_variable_mapping_table$ = defconstant("*DTP-VARIABLE-MAPPING-TABLE*", $sym83$VARIABLE_MAPPING_TABLE);
    return NIL;
  }

  public static final SubLObject setup_value_tables_file() {
    // CVS_ID("Id: value-tables.lisp 126721 2008-12-18 19:14:07Z baxter ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), Symbols.symbol_function($sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$VALUE_TABLE_COLUMN_QUERY, $sym9$_CSETF_VALUE_TABLE_COLUMN_QUERY);
    Structures.def_csetf($sym10$VALUE_TABLE_COLUMN_LABEL, $sym11$_CSETF_VALUE_TABLE_COLUMN_LABEL);
    Structures.def_csetf($sym12$VALUE_TABLE_COLUMN_VALUES, $sym13$_CSETF_VALUE_TABLE_COLUMN_VALUES);
    Equality.identity($sym0$VALUE_TABLE_COLUMN);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), Symbols.symbol_function($sym37$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym38$VALUE_TABLE_ID, $sym39$_CSETF_VALUE_TABLE_ID);
    Structures.def_csetf($sym40$VALUE_TABLE_LABEL, $sym41$_CSETF_VALUE_TABLE_LABEL);
    Structures.def_csetf($sym42$VALUE_TABLE_INPUT_COLUMNS, $sym43$_CSETF_VALUE_TABLE_INPUT_COLUMNS);
    Structures.def_csetf($sym44$VALUE_TABLE_OUTPUT_COLUMN, $sym45$_CSETF_VALUE_TABLE_OUTPUT_COLUMN);
    Structures.def_csetf($sym46$VALUE_TABLE_ASSIGNMENTS, $sym47$_CSETF_VALUE_TABLE_ASSIGNMENTS);
    Equality.identity($sym30$VALUE_TABLE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), Symbols.symbol_function($sym90$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym91$VARIABLE_MAPPING_TABLE_ID, $sym92$_CSETF_VARIABLE_MAPPING_TABLE_ID);
    Structures.def_csetf($sym93$VARIABLE_MAPPING_TABLE_SOURCE_QUERY, $sym94$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY);
    Structures.def_csetf($sym95$VARIABLE_MAPPING_TABLE_TARGET_QUERY, $sym96$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY);
    Structures.def_csetf($sym97$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES, $sym98$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES);
    Structures.def_csetf($sym99$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES, $sym100$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES);
    Structures.def_csetf($sym101$VARIABLE_MAPPING_TABLE_INCOMPATIBLES, $sym102$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES);
    Structures.def_csetf($sym103$VARIABLE_MAPPING_TABLE_ASSIGNMENTS, $sym104$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS);
    Equality.identity($sym83$VARIABLE_MAPPING_TABLE);
    memoization_state.note_memoized_function($sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED);
    access_macros.register_external_symbol($sym152$VARMAP_UNIQUE_EL_VAR_WRT_VARS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$VALUE_TABLE_COLUMN = makeSymbol("VALUE-TABLE-COLUMN");
  public static final SubLSymbol $sym1$VALUE_TABLE_COLUMN_P = makeSymbol("VALUE-TABLE-COLUMN-P");
  public static final SubLList $list2 = list(makeSymbol("QUERY"), makeSymbol("LABEL"), makeSymbol("VALUES"));
  public static final SubLList $list3 = list(makeKeyword("QUERY"), makeKeyword("LABEL"), makeKeyword("VALUES"));
  public static final SubLList $list4 = list(makeSymbol("VALUE-TABLE-COLUMN-QUERY"), makeSymbol("VALUE-TABLE-COLUMN-LABEL"), makeSymbol("VALUE-TABLE-COLUMN-VALUES"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES"));
  public static final SubLSymbol $sym6$PRINT_VALUE_TABLE_COLUMN = makeSymbol("PRINT-VALUE-TABLE-COLUMN");
  public static final SubLSymbol $sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$VALUE_TABLE_COLUMN_QUERY = makeSymbol("VALUE-TABLE-COLUMN-QUERY");
  public static final SubLSymbol $sym9$_CSETF_VALUE_TABLE_COLUMN_QUERY = makeSymbol("_CSETF-VALUE-TABLE-COLUMN-QUERY");
  public static final SubLSymbol $sym10$VALUE_TABLE_COLUMN_LABEL = makeSymbol("VALUE-TABLE-COLUMN-LABEL");
  public static final SubLSymbol $sym11$_CSETF_VALUE_TABLE_COLUMN_LABEL = makeSymbol("_CSETF-VALUE-TABLE-COLUMN-LABEL");
  public static final SubLSymbol $sym12$VALUE_TABLE_COLUMN_VALUES = makeSymbol("VALUE-TABLE-COLUMN-VALUES");
  public static final SubLSymbol $sym13$_CSETF_VALUE_TABLE_COLUMN_VALUES = makeSymbol("_CSETF-VALUE-TABLE-COLUMN-VALUES");
  public static final SubLSymbol $kw14$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw15$LABEL = makeKeyword("LABEL");
  public static final SubLSymbol $kw16$VALUES = makeKeyword("VALUES");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str18$__ValueTableColumn_ = makeString("#<ValueTableColumn ");
  public static final SubLString $str19$_A___S____supported_values___S = makeString("~A (~S)~% supported values: ~S");
  public static final SubLString $str20$_ = makeString(">");
  public static final SubLString $str21$valueTableColumn = makeString("valueTableColumn");
  public static final SubLString $str22$valueTableQuery = makeString("valueTableQuery");
  public static final SubLString $str23$valueTableLabel = makeString("valueTableLabel");
  public static final SubLString $str24$valueTableValues = makeString("valueTableValues");
  public static final SubLString $str25$valueTableValue = makeString("valueTableValue");
  public static final SubLList $list26 = list(makeSymbol("THE-SET"), makeSymbol("EL-INFERENCE-BINDING"));
  public static final SubLList $list27 = list(makeSymbol("EL-INFBIND-FN"), makeSymbol("VARIABLE"), makeSymbol("RESULT-VALUE"));
  public static final SubLSymbol $kw28$RESULT_SET = makeKeyword("RESULT-SET");
  public static final SubLObject $const29$validQueryResultForTable = constant_handles.reader_make_constant_shell(makeString("validQueryResultForTable"));
  public static final SubLSymbol $sym30$VALUE_TABLE = makeSymbol("VALUE-TABLE");
  public static final SubLSymbol $sym31$VALUE_TABLE_P = makeSymbol("VALUE-TABLE-P");
  public static final SubLList $list32 = list(makeSymbol("ID"), makeSymbol("LABEL"), makeSymbol("INPUT-COLUMNS"), makeSymbol("OUTPUT-COLUMN"), makeSymbol("ASSIGNMENTS"));
  public static final SubLList $list33 = list(makeKeyword("ID"), makeKeyword("LABEL"), makeKeyword("INPUT-COLUMNS"), makeKeyword("OUTPUT-COLUMN"), makeKeyword("ASSIGNMENTS"));
  public static final SubLList $list34 = list(makeSymbol("VALUE-TABLE-ID"), makeSymbol("VALUE-TABLE-LABEL"), makeSymbol("VALUE-TABLE-INPUT-COLUMNS"), makeSymbol("VALUE-TABLE-OUTPUT-COLUMN"), makeSymbol("VALUE-TABLE-ASSIGNMENTS"));
  public static final SubLList $list35 = list(makeSymbol("_CSETF-VALUE-TABLE-ID"), makeSymbol("_CSETF-VALUE-TABLE-LABEL"), makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS"), makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN"), makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS"));
  public static final SubLSymbol $sym36$PRINT_VALUE_TABLE = makeSymbol("PRINT-VALUE-TABLE");
  public static final SubLSymbol $sym37$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym38$VALUE_TABLE_ID = makeSymbol("VALUE-TABLE-ID");
  public static final SubLSymbol $sym39$_CSETF_VALUE_TABLE_ID = makeSymbol("_CSETF-VALUE-TABLE-ID");
  public static final SubLSymbol $sym40$VALUE_TABLE_LABEL = makeSymbol("VALUE-TABLE-LABEL");
  public static final SubLSymbol $sym41$_CSETF_VALUE_TABLE_LABEL = makeSymbol("_CSETF-VALUE-TABLE-LABEL");
  public static final SubLSymbol $sym42$VALUE_TABLE_INPUT_COLUMNS = makeSymbol("VALUE-TABLE-INPUT-COLUMNS");
  public static final SubLSymbol $sym43$_CSETF_VALUE_TABLE_INPUT_COLUMNS = makeSymbol("_CSETF-VALUE-TABLE-INPUT-COLUMNS");
  public static final SubLSymbol $sym44$VALUE_TABLE_OUTPUT_COLUMN = makeSymbol("VALUE-TABLE-OUTPUT-COLUMN");
  public static final SubLSymbol $sym45$_CSETF_VALUE_TABLE_OUTPUT_COLUMN = makeSymbol("_CSETF-VALUE-TABLE-OUTPUT-COLUMN");
  public static final SubLSymbol $sym46$VALUE_TABLE_ASSIGNMENTS = makeSymbol("VALUE-TABLE-ASSIGNMENTS");
  public static final SubLSymbol $sym47$_CSETF_VALUE_TABLE_ASSIGNMENTS = makeSymbol("_CSETF-VALUE-TABLE-ASSIGNMENTS");
  public static final SubLSymbol $kw48$ID = makeKeyword("ID");
  public static final SubLSymbol $kw49$INPUT_COLUMNS = makeKeyword("INPUT-COLUMNS");
  public static final SubLSymbol $kw50$OUTPUT_COLUMN = makeKeyword("OUTPUT-COLUMN");
  public static final SubLSymbol $kw51$ASSIGNMENTS = makeKeyword("ASSIGNMENTS");
  public static final SubLString $str52$__ValueTable_ = makeString("#<ValueTable ");
  public static final SubLString $str53$_S___A___ = makeString("~S (~A)~%");
  public static final SubLString $str54$_Input_Columns__ = makeString(" Input Columns: ");
  public static final SubLString $str55$_____S__ = makeString("    ~S~%");
  public static final SubLString $str56$_Output_Column__ = makeString(" Output Column: ");
  public static final SubLString $str57$_Existing_Assignments__ = makeString(" Existing Assignments: ");
  public static final SubLSymbol $sym58$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym59$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLString $str60$valueTable = makeString("valueTable");
  public static final SubLString $str61$valueTableId = makeString("valueTableId");
  public static final SubLString $str62$valueTableInputColumns = makeString("valueTableInputColumns");
  public static final SubLString $str63$valueTableOutputColumns = makeString("valueTableOutputColumns");
  public static final SubLString $str64$valueTableAssignments = makeString("valueTableAssignments");
  public static final SubLString $str65$valueTableAssignment = makeString("valueTableAssignment");
  public static final SubLList $list66 = cons(makeSymbol("SOURCES"), makeSymbol("TARGETS"));
  public static final SubLString $str67$valueTableAssignmentSources = makeString("valueTableAssignmentSources");
  public static final SubLString $str68$valueTableAssignmentTuple = makeString("valueTableAssignmentTuple");
  public static final SubLList $list69 = list(makeSymbol("QUERY"), makeSymbol("VALUE"));
  public static final SubLString $str70$valueTableAssignmentTargets = makeString("valueTableAssignmentTargets");
  public static final SubLSymbol $kw71$INPUT_QUERIES = makeKeyword("INPUT-QUERIES");
  public static final SubLObject $const72$valueTableSourceQueries = constant_handles.reader_make_constant_shell(makeString("valueTableSourceQueries"));
  public static final SubLList $list73 = list(makeKeyword("INPUT-QUERIES"));
  public static final SubLSymbol $kw74$OUTPUT_QUERY = makeKeyword("OUTPUT-QUERY");
  public static final SubLObject $const75$valueTableTargetQuery = constant_handles.reader_make_constant_shell(makeString("valueTableTargetQuery"));
  public static final SubLList $list76 = list(makeKeyword("OUTPUT-QUERY"));
  public static final SubLList $list77 = list(makeSymbol("?SOURCES"), makeSymbol("?TARGETS"));
  public static final SubLObject $const78$queryResultsCombineInTable = constant_handles.reader_make_constant_shell(makeString("queryResultsCombineInTable"));
  public static final SubLSymbol $sym79$_SOURCES = makeSymbol("?SOURCES");
  public static final SubLSymbol $sym80$_TARGETS = makeSymbol("?TARGETS");
  public static final SubLList $list81 = list(makeSymbol("SOURCES"), makeSymbol("TARGETS"));
  public static final SubLSymbol $sym82$REST = makeSymbol("REST");
  public static final SubLSymbol $sym83$VARIABLE_MAPPING_TABLE = makeSymbol("VARIABLE-MAPPING-TABLE");
  public static final SubLSymbol $sym84$VARIABLE_MAPPING_TABLE_P = makeSymbol("VARIABLE-MAPPING-TABLE-P");
  public static final SubLList $list85 = list(makeSymbol("ID"), makeSymbol("SOURCE-QUERY"), makeSymbol("TARGET-QUERY"), makeSymbol("SOURCE-VARIABLES"), makeSymbol("TARGET-VARIABLES"), makeSymbol("INCOMPATIBLES"), makeSymbol("ASSIGNMENTS"));
  public static final SubLList $list86 = list(makeKeyword("ID"), makeKeyword("SOURCE-QUERY"), makeKeyword("TARGET-QUERY"), makeKeyword("SOURCE-VARIABLES"), makeKeyword("TARGET-VARIABLES"), makeKeyword("INCOMPATIBLES"), makeKeyword("ASSIGNMENTS"));
  public static final SubLList $list87 = list(makeSymbol("VARIABLE-MAPPING-TABLE-ID"), makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY"), makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));
  public static final SubLList $list88 = list(makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES"), makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS"));
  public static final SubLSymbol $sym89$PRINT_VARMAP_TABLE = makeSymbol("PRINT-VARMAP-TABLE");
  public static final SubLSymbol $sym90$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym91$VARIABLE_MAPPING_TABLE_ID = makeSymbol("VARIABLE-MAPPING-TABLE-ID");
  public static final SubLSymbol $sym92$_CSETF_VARIABLE_MAPPING_TABLE_ID = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ID");
  public static final SubLSymbol $sym93$VARIABLE_MAPPING_TABLE_SOURCE_QUERY = makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-QUERY");
  public static final SubLSymbol $sym94$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY");
  public static final SubLSymbol $sym95$VARIABLE_MAPPING_TABLE_TARGET_QUERY = makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-QUERY");
  public static final SubLSymbol $sym96$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY");
  public static final SubLSymbol $sym97$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = makeSymbol("VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES");
  public static final SubLSymbol $sym98$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES");
  public static final SubLSymbol $sym99$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = makeSymbol("VARIABLE-MAPPING-TABLE-TARGET-VARIABLES");
  public static final SubLSymbol $sym100$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES");
  public static final SubLSymbol $sym101$VARIABLE_MAPPING_TABLE_INCOMPATIBLES = makeSymbol("VARIABLE-MAPPING-TABLE-INCOMPATIBLES");
  public static final SubLSymbol $sym102$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES");
  public static final SubLSymbol $sym103$VARIABLE_MAPPING_TABLE_ASSIGNMENTS = makeSymbol("VARIABLE-MAPPING-TABLE-ASSIGNMENTS");
  public static final SubLSymbol $sym104$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS = makeSymbol("_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS");
  public static final SubLSymbol $kw105$SOURCE_QUERY = makeKeyword("SOURCE-QUERY");
  public static final SubLSymbol $kw106$TARGET_QUERY = makeKeyword("TARGET-QUERY");
  public static final SubLSymbol $kw107$SOURCE_VARIABLES = makeKeyword("SOURCE-VARIABLES");
  public static final SubLSymbol $kw108$TARGET_VARIABLES = makeKeyword("TARGET-VARIABLES");
  public static final SubLSymbol $kw109$INCOMPATIBLES = makeKeyword("INCOMPATIBLES");
  public static final SubLString $str110$__VariableMappingTable_ = makeString("#<VariableMappingTable ");
  public static final SubLString $str111$_A_for__A_____A__ = makeString("~A for ~A -> ~A~%");
  public static final SubLString $str112$anonymous = makeString("anonymous");
  public static final SubLString $str113$no_source = makeString("no source");
  public static final SubLString $str114$no_target = makeString("no target");
  public static final SubLString $str115$_Source_Variables___A__ = makeString(" Source Variables: ~A~%");
  public static final SubLString $str116$_Target_Variables___A__ = makeString(" Target Variables: ~A~%");
  public static final SubLString $str117$_Incompatibilities__source_view__ = makeString(" Incompatibilities (source view): ~%");
  public static final SubLString $str118$null_dictionary__ = makeString("null dictionary~%");
  public static final SubLString $str119$_Current_Assignments___A__ = makeString(" Current Assignments: ~A~%");
  public static final SubLString $str120$varMapTable = makeString("varMapTable");
  public static final SubLString $str121$varMapTableId = makeString("varMapTableId");
  public static final SubLString $str122$varMapSourceQuery = makeString("varMapSourceQuery");
  public static final SubLString $str123$varMapTargetQuery = makeString("varMapTargetQuery");
  public static final SubLString $str124$varMapSourceVariables = makeString("varMapSourceVariables");
  public static final SubLString $str125$varMapTargetVariables = makeString("varMapTargetVariables");
  public static final SubLString $str126$varMapIncompatibles = makeString("varMapIncompatibles");
  public static final SubLString $str127$varMapIncompatible = makeString("varMapIncompatible");
  public static final SubLString $str128$varMapSourceVariable = makeString("varMapSourceVariable");
  public static final SubLString $str129$varMapAssignments = makeString("varMapAssignments");
  public static final SubLString $str130$varMapAssignment = makeString("varMapAssignment");
  public static final SubLList $list131 = list(makeSymbol("SOURCE-VAR"), makeSymbol("TARGET-VAR"));
  public static final SubLString $str132$varMapTargetVariable = makeString("varMapTargetVariable");
  public static final SubLSymbol $sym133$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $kw134$SOURCE = makeKeyword("SOURCE");
  public static final SubLObject $const135$variableMappingTableSourceFormula = constant_handles.reader_make_constant_shell(makeString("variableMappingTableSourceFormula-QuerySpec"));
  public static final SubLList $list136 = list(makeKeyword("SOURCE"));
  public static final SubLSymbol $kw137$TARGET = makeKeyword("TARGET");
  public static final SubLObject $const138$variableMappingTableTargetFormula = constant_handles.reader_make_constant_shell(makeString("variableMappingTableTargetFormula-QuerySpec"));
  public static final SubLList $list139 = list(makeKeyword("TARGET"));
  public static final SubLSymbol $sym140$ANY_DISJOINT_WITH_ANY__MEMOIZED = makeSymbol("ANY-DISJOINT-WITH-ANY?-MEMOIZED");
  public static final SubLSymbol $kw141$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str142$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLList $list143 = list(makeSymbol("SRC-ISAS"), makeSymbol("SRC-GENLS"), makeSymbol("SRC-QUOTED-ISAS"));
  public static final SubLList $list144 = list(makeSymbol("TRG-ISAS"), makeSymbol("TRG-GENLS"), makeSymbol("TRG-QUOTED-ISAS"));
  public static final SubLList $list145 = list(makeSymbol("?SOURCE-VAR"), makeSymbol("?TARGET-VAR"));
  public static final SubLObject $const146$querySpecVariablesUnifyInTable_Wo = constant_handles.reader_make_constant_shell(makeString("querySpecVariablesUnifyInTable-WorkaroundPred"));
  public static final SubLList $list147 = list(constant_handles.reader_make_constant_shell(makeString("AnalysisOutputBindingsForVarFn")), makeSymbol("?SOURCE-VAR"));
  public static final SubLList $list148 = list(constant_handles.reader_make_constant_shell(makeString("AnalysisInputBindingsForVarFn")), makeSymbol("?TARGET-VAR"));
  public static final SubLObject $const149$querySpecVariablesUnifyInTable = constant_handles.reader_make_constant_shell(makeString("querySpecVariablesUnifyInTable"));
  public static final SubLSymbol $sym150$_SOURCE_VAR = makeSymbol("?SOURCE-VAR");
  public static final SubLSymbol $sym151$_TARGET_VAR = makeSymbol("?TARGET-VAR");
  public static final SubLSymbol $sym152$VARMAP_UNIQUE_EL_VAR_WRT_VARS = makeSymbol("VARMAP-UNIQUE-EL-VAR-WRT-VARS");
  public static final SubLSymbol $sym153$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");

  //// Initializers

  public void declareFunctions() {
    declare_value_tables_file();
  }

  public void initializeVariables() {
    init_value_tables_file();
  }

  public void runTopLevelForms() {
    setup_value_tables_file();
  }

}
