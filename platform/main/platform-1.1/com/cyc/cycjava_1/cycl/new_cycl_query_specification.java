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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_parameters;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.xml_utilities;

public  final class new_cycl_query_specification extends SubLTranslatedFile {

  //// Constructor

  private new_cycl_query_specification() {}
  public static final SubLFile me = new new_cycl_query_specification();
  public static final String myName = "com.cyc.cycjava_1.cycl.new_cycl_query_specification";

  //// Definitions

  public static final class $new_cycl_query_specification_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $cycl_id; }
    public SubLObject getField3() { return $formula; }
    public SubLObject getField4() { return $mt; }
    public SubLObject getField5() { return $comment; }
    public SubLObject getField6() { return $properties; }
    public SubLObject getField7() { return $indexicals; }
    public SubLObject getField8() { return $edited; }
    public SubLObject setField2(SubLObject value) { return $cycl_id = value; }
    public SubLObject setField3(SubLObject value) { return $formula = value; }
    public SubLObject setField4(SubLObject value) { return $mt = value; }
    public SubLObject setField5(SubLObject value) { return $comment = value; }
    public SubLObject setField6(SubLObject value) { return $properties = value; }
    public SubLObject setField7(SubLObject value) { return $indexicals = value; }
    public SubLObject setField8(SubLObject value) { return $edited = value; }
    public SubLObject $cycl_id = NIL;
    public SubLObject $formula = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $comment = NIL;
    public SubLObject $properties = NIL;
    public SubLObject $indexicals = NIL;
    public SubLObject $edited = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($new_cycl_query_specification_native.class, $sym0$NEW_CYCL_QUERY_SPECIFICATION, $sym1$NEW_CYCL_QUERY_SPECIFICATION_P, $list2, $list3, new String[] {"$cycl_id", "$formula", "$mt", "$comment", "$properties", "$indexicals", "$edited"}, $list4, $list5, $sym6$NEW_CYCL_QUERY_SPECIFICATION_PRINT);
  }

  @SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632) 
  public static SubLSymbol $dtp_new_cycl_query_specification$ = null;

  @SubL(source = "cycl/new-cycl-query-specification.lisp", position = 2632) 
  public static final SubLObject new_cycl_query_specification_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7959");
    return NIL;
  }

  public static final class $new_cycl_query_specification_p$UnaryFunction extends UnaryFunction {
    public $new_cycl_query_specification_p$UnaryFunction() { super(extractFunctionNamed("NEW-CYCL-QUERY-SPECIFICATION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7958"); }
  }

  /** Contains all of the code mappings for permissible CycL query parameters. */
  @SubL(source = "cycl/new-cycl-query-specification.lisp", position = 16778) 
  private static SubLSymbol $new_cycl_query_parameter_set$ = null;

  /** The Mt where the SubL encoding for inference parameters are stored. */
  @SubL(source = "cycl/new-cycl-query-specification.lisp", position = 18297) 
  private static SubLSymbol $new_cycl_query_encoding_extent$ = null;

  public static final SubLObject declare_new_cycl_query_specification_file() {
    declareFunction(myName, "new_cycl_query_specification_print_function_trampoline", "NEW-CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_p", "NEW-CYCL-QUERY-SPECIFICATION-P", 1, 0, false); new $new_cycl_query_specification_p$UnaryFunction();
    //declareFunction(myName, "new_cycl_query_spec_cycl_id", "NEW-CYCL-QUERY-SPEC-CYCL-ID", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_spec_formula", "NEW-CYCL-QUERY-SPEC-FORMULA", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_spec_mt", "NEW-CYCL-QUERY-SPEC-MT", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_spec_comment", "NEW-CYCL-QUERY-SPEC-COMMENT", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_spec_properties", "NEW-CYCL-QUERY-SPEC-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_spec_indexicals", "NEW-CYCL-QUERY-SPEC-INDEXICALS", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_spec_edited", "NEW-CYCL-QUERY-SPEC-EDITED", 1, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_cycl_id", "_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_formula", "_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA", 2, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_mt", "_CSETF-NEW-CYCL-QUERY-SPEC-MT", 2, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_comment", "_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT", 2, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_properties", "_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES", 2, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_indexicals", "_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS", 2, 0, false);
    //declareFunction(myName, "_csetf_new_cycl_query_spec_edited", "_CSETF-NEW-CYCL-QUERY-SPEC-EDITED", 2, 0, false);
    //declareFunction(myName, "make_new_cycl_query_specification", "MAKE-NEW-CYCL-QUERY-SPECIFICATION", 0, 1, false);
    //declareFunction(myName, "new_cycl_query_specification_print", "NEW-CYCL-QUERY-SPECIFICATION-PRINT", 3, 0, false);
    //declareFunction(myName, "xml_serialize_new_cycl_query_specification", "XML-SERIALIZE-NEW-CYCL-QUERY-SPECIFICATION", 1, 1, false);
    //declareFunction(myName, "new_cycl_query_specification_cycl_id", "NEW-CYCL-QUERY-SPECIFICATION-CYCL-ID", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_formula", "NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_mt", "NEW-CYCL-QUERY-SPECIFICATION-MT", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_comment", "NEW-CYCL-QUERY-SPECIFICATION-COMMENT", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_properties", "NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_indexicals", "NEW-CYCL-QUERY-SPECIFICATION-INDEXICALS", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_edited", "NEW-CYCL-QUERY-SPECIFICATION-EDITED", 1, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_cycl_id", "SET-NEW-CYCL-QUERY-SPECIFICATION-CYCL-ID", 2, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_formula", "SET-NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 2, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_mt", "SET-NEW-CYCL-QUERY-SPECIFICATION-MT", 2, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_comment", "SET-NEW-CYCL-QUERY-SPECIFICATION-COMMENT", 2, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_properties", "SET-NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES", 2, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_properties_eliminating_defaults", "SET-NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES-ELIMINATING-DEFAULTS", 2, 0, false);
    //declareFunction(myName, "set_new_cycl_query_specification_indexicals", "SET-NEW-CYCL-QUERY-SPECIFICATION-INDEXICALS", 2, 0, false);
    //declareFunction(myName, "set_cycl_query_specification_edited", "SET-CYCL-QUERY-SPECIFICATION-EDITED", 1, 0, false);
    //declareFunction(myName, "templated_new_cycl_query_specification_p", "TEMPLATED-NEW-CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_edited_p", "NEW-CYCL-QUERY-SPECIFICATION-EDITED-P", 1, 0, false);
    //declareFunction(myName, "mark_new_cycl_query_specification_modified", "MARK-NEW-CYCL-QUERY-SPECIFICATION-MODIFIED", 1, 0, false);
    //declareFunction(myName, "update_query_spec_params_using_defaults", "UPDATE-QUERY-SPEC-PARAMS-USING-DEFAULTS", 2, 0, false);
    //declareFunction(myName, "reset_new_cycl_query_specification_formula", "RESET-NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 2, 0, false);
    //declareFunction(myName, "reset_new_cycl_query_specification_mt", "RESET-NEW-CYCL-QUERY-SPECIFICATION-MT", 2, 0, false);
    //declareFunction(myName, "new_cycl_query_indexical_p", "NEW-CYCL-QUERY-INDEXICAL-P", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_indexical_formula_p", "NEW-CYCL-QUERY-INDEXICAL-FORMULA-P", 1, 0, false);
    //declareFunction(myName, "create_new_cycl_query_specification", "CREATE-NEW-CYCL-QUERY-SPECIFICATION", 0, 0, false);
    //declareFunction(myName, "load_new_cycl_query_specification_from_kb", "LOAD-NEW-CYCL-QUERY-SPECIFICATION-FROM-KB", 1, 1, false);
    //declareFunction(myName, "analyse_new_cycl_query_specification_for_indexicals", "ANALYSE-NEW-CYCL-QUERY-SPECIFICATION-FOR-INDEXICALS", 1, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_load_sentence", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-SENTENCE", 2, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_load_mt", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-MT", 2, 0, false);
    //declareFunction(myName, "new_cycl_query_specification_load_inference_parameters", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-INFERENCE-PARAMETERS", 2, 0, false);
    //declareFunction(myName, "copy_new_cycl_query_specification", "COPY-NEW-CYCL-QUERY-SPECIFICATION", 1, 0, false);
    //declareFunction(myName, "instantiate_new_cycl_query_specification_from_template", "INSTANTIATE-NEW-CYCL-QUERY-SPECIFICATION-FROM-TEMPLATE", 2, 1, false);
    //declareFunction(myName, "new_cycl_query_specification_ask", "NEW-CYCL-QUERY-SPECIFICATION-ASK", 1, 3, false);
    //declareFunction(myName, "get_new_cycl_query_parameter_set", "GET-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
    //declareFunction(myName, "ensure_new_cycl_query_parameter_set_initialized", "ENSURE-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED", 0, 0, false);
    //declareFunction(myName, "is_new_cycl_query_parameter_set_initializedP", "IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?", 0, 0, false);
    //declareFunction(myName, "new_cycl_query_parameter_set", "NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
    //declareFunction(myName, "ncq_inference_parameter_p", "NCQ-INFERENCE-PARAMETER-P", 1, 0, false);
    //declareFunction(myName, "initialize_new_cycl_query_parameter_set", "INITIALIZE-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
    //declareFunction(myName, "compute_new_cycl_query_parameter_set", "COMPUTE-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
    //declareFunction(myName, "new_cycl_query_get_all_parameters", "NEW-CYCL-QUERY-GET-ALL-PARAMETERS", 0, 0, false);
    //declareFunction(myName, "new_cycl_query_get_internal_encoding_for_parameter", "NEW-CYCL-QUERY-GET-INTERNAL-ENCODING-FOR-PARAMETER", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_new_cycl_query_specification_file() {
    $dtp_new_cycl_query_specification$ = defconstant("*DTP-NEW-CYCL-QUERY-SPECIFICATION*", $sym0$NEW_CYCL_QUERY_SPECIFICATION);
    $new_cycl_query_parameter_set$ = deflexical("*NEW-CYCL-QUERY-PARAMETER-SET*", maybeDefault( $sym58$_NEW_CYCL_QUERY_PARAMETER_SET_, $new_cycl_query_parameter_set$, NIL));
    $new_cycl_query_encoding_extent$ = deflexical("*NEW-CYCL-QUERY-ENCODING-EXTENT*", $const60$CycAPIMt);
    return NIL;
  }

  public static final SubLObject setup_new_cycl_query_specification_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_new_cycl_query_specification$.getGlobalValue(), Symbols.symbol_function($sym7$NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$NEW_CYCL_QUERY_SPEC_CYCL_ID, $sym9$_CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID);
    Structures.def_csetf($sym10$NEW_CYCL_QUERY_SPEC_FORMULA, $sym11$_CSETF_NEW_CYCL_QUERY_SPEC_FORMULA);
    Structures.def_csetf($sym12$NEW_CYCL_QUERY_SPEC_MT, $sym13$_CSETF_NEW_CYCL_QUERY_SPEC_MT);
    Structures.def_csetf($sym14$NEW_CYCL_QUERY_SPEC_COMMENT, $sym15$_CSETF_NEW_CYCL_QUERY_SPEC_COMMENT);
    Structures.def_csetf($sym16$NEW_CYCL_QUERY_SPEC_PROPERTIES, $sym17$_CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES);
    Structures.def_csetf($sym18$NEW_CYCL_QUERY_SPEC_INDEXICALS, $sym19$_CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS);
    Structures.def_csetf($sym20$NEW_CYCL_QUERY_SPEC_EDITED, $sym21$_CSETF_NEW_CYCL_QUERY_SPEC_EDITED);
    Equality.identity($sym0$NEW_CYCL_QUERY_SPECIFICATION);
    subl_macro_promotions.declare_defglobal($sym58$_NEW_CYCL_QUERY_PARAMETER_SET_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$NEW_CYCL_QUERY_SPECIFICATION = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION");
  public static final SubLSymbol $sym1$NEW_CYCL_QUERY_SPECIFICATION_P = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-P");
  public static final SubLList $list2 = list(makeSymbol("CYCL-ID"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("PROPERTIES"), makeSymbol("INDEXICALS"), makeSymbol("EDITED"));
  public static final SubLList $list3 = list(makeKeyword("CYCL-ID"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("PROPERTIES"), makeKeyword("INDEXICALS"), makeKeyword("EDITED"));
  public static final SubLList $list4 = list(makeSymbol("NEW-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("NEW-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("NEW-CYCL-QUERY-SPEC-MT"), makeSymbol("NEW-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("NEW-CYCL-QUERY-SPEC-PROPERTIES"), makeSymbol("NEW-CYCL-QUERY-SPEC-INDEXICALS"), makeSymbol("NEW-CYCL-QUERY-SPEC-EDITED"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-MT"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-EDITED"));
  public static final SubLSymbol $sym6$NEW_CYCL_QUERY_SPECIFICATION_PRINT = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-PRINT");
  public static final SubLSymbol $sym7$NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$NEW_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("NEW-CYCL-QUERY-SPEC-CYCL-ID");
  public static final SubLSymbol $sym9$_CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID");
  public static final SubLSymbol $sym10$NEW_CYCL_QUERY_SPEC_FORMULA = makeSymbol("NEW-CYCL-QUERY-SPEC-FORMULA");
  public static final SubLSymbol $sym11$_CSETF_NEW_CYCL_QUERY_SPEC_FORMULA = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA");
  public static final SubLSymbol $sym12$NEW_CYCL_QUERY_SPEC_MT = makeSymbol("NEW-CYCL-QUERY-SPEC-MT");
  public static final SubLSymbol $sym13$_CSETF_NEW_CYCL_QUERY_SPEC_MT = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-MT");
  public static final SubLSymbol $sym14$NEW_CYCL_QUERY_SPEC_COMMENT = makeSymbol("NEW-CYCL-QUERY-SPEC-COMMENT");
  public static final SubLSymbol $sym15$_CSETF_NEW_CYCL_QUERY_SPEC_COMMENT = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT");
  public static final SubLSymbol $sym16$NEW_CYCL_QUERY_SPEC_PROPERTIES = makeSymbol("NEW-CYCL-QUERY-SPEC-PROPERTIES");
  public static final SubLSymbol $sym17$_CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES");
  public static final SubLSymbol $sym18$NEW_CYCL_QUERY_SPEC_INDEXICALS = makeSymbol("NEW-CYCL-QUERY-SPEC-INDEXICALS");
  public static final SubLSymbol $sym19$_CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS");
  public static final SubLSymbol $sym20$NEW_CYCL_QUERY_SPEC_EDITED = makeSymbol("NEW-CYCL-QUERY-SPEC-EDITED");
  public static final SubLSymbol $sym21$_CSETF_NEW_CYCL_QUERY_SPEC_EDITED = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-EDITED");
  public static final SubLSymbol $kw22$CYCL_ID = makeKeyword("CYCL-ID");
  public static final SubLSymbol $kw23$FORMULA = makeKeyword("FORMULA");
  public static final SubLSymbol $kw24$MT = makeKeyword("MT");
  public static final SubLSymbol $kw25$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw26$PROPERTIES = makeKeyword("PROPERTIES");
  public static final SubLSymbol $kw27$INDEXICALS = makeKeyword("INDEXICALS");
  public static final SubLSymbol $kw28$EDITED = makeKeyword("EDITED");
  public static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str30$_NEW_CYCL_QUERY_SPECIFICATION__S_ = makeString("<NEW-CYCL-QUERY-SPECIFICATION ~S ~S in ~S ;; ~A~% ");
  public static final SubLString $str31$_Properties___S_ = makeString(" Properties: ~S ");
  public static final SubLString $str32$_Template_Slots___S_ = makeString(" Template Slots: ~S ");
  public static final SubLString $str33$__changed__ = makeString(" (changed) ");
  public static final SubLSymbol $sym34$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str35$cyclQuery = makeString("cyclQuery");
  public static final SubLString $str36$queryID = makeString("queryID");
  public static final SubLString $str37$queryFormula = makeString("queryFormula");
  public static final SubLString $str38$Can_t_serialize__S____Its_query_f = makeString("Can't serialize ~S.~% Its query formula is not a valid CycL sentence:~% ~S");
  public static final SubLString $str39$queryMt = makeString("queryMt");
  public static final SubLString $str40$queryComment = makeString("queryComment");
  public static final SubLString $str41$queryInferenceProperties = makeString("queryInferenceProperties");
  public static final SubLString $str42$queryInferenceProperty = makeString("queryInferenceProperty");
  public static final SubLString $str43$propertySymbol = makeString("propertySymbol");
  public static final SubLString $str44$propertyValue = makeString("propertyValue");
  public static final SubLString $str45$queryIndexicals = makeString("queryIndexicals");
  public static final SubLString $str46$queryIndexical = makeString("queryIndexical");
  public static final SubLSymbol $kw47$CHANGED = makeKeyword("CHANGED");
  public static final SubLSymbol $kw48$INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
  public static final SubLSymbol $sym49$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym50$MICROTHEORY_P = makeSymbol("MICROTHEORY-P");
  public static final SubLObject $const51$TheNthFn = constant_handles.reader_make_constant_shell(makeString("TheNthFn"));
  public static final SubLSymbol $sym52$CYCL_DENOTATIONAL_TERM_P = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
  public static final SubLSymbol $sym53$NEW_CYCL_QUERY_INDEXICAL_P = makeSymbol("NEW-CYCL-QUERY-INDEXICAL-P");
  public static final SubLSymbol $sym54$NCQ_INFERENCE_PARAMETER_P = makeSymbol("NCQ-INFERENCE-PARAMETER-P");
  public static final SubLSymbol $sym55$LISTP = makeSymbol("LISTP");
  public static final SubLList $list56 = cons(makeSymbol("TERM"), makeSymbol("REPLACEMENT"));
  public static final SubLString $str57$Insufficient_number_of_substituti = makeString("Insufficient number of substitutions -- indexicals ~A unaccounted for.");
  public static final SubLSymbol $sym58$_NEW_CYCL_QUERY_PARAMETER_SET_ = makeSymbol("*NEW-CYCL-QUERY-PARAMETER-SET*");
  public static final SubLObject $const59$InferenceParameter = constant_handles.reader_make_constant_shell(makeString("InferenceParameter"));
  public static final SubLObject $const60$CycAPIMt = constant_handles.reader_make_constant_shell(makeString("CycAPIMt"));
  public static final SubLObject $const61$subLIdentifier = constant_handles.reader_make_constant_shell(makeString("subLIdentifier"));
  public static final SubLSymbol $kw62$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const63$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));

  //// Initializers

  public void declareFunctions() {
    declare_new_cycl_query_specification_file();
  }

  public void initializeVariables() {
    init_new_cycl_query_specification_file();
  }

  public void runTopLevelForms() {
    setup_new_cycl_query_specification_file();
  }

}
