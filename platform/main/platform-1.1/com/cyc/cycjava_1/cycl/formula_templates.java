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
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.inference.ask_utilities;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertion_utilities;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_high;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.cycml_generator;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.czer_meta;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.el_grammar;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.graph_utilities;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.hlmt_czer;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.kb_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.new_cycl_query_specification;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.simplifier;
import com.cyc.cycjava_1.cycl.somewhere_cache;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.uncanonicalizer;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.xml_utilities;

public  final class formula_templates extends SubLTranslatedFile {

  //// Constructor

  private formula_templates() {}
  public static final SubLFile me = new formula_templates();
  public static final String myName = "com.cyc.cycjava_1.cycl.formula_templates";

  //// Definitions

  public static final class $template_topic_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $supertopic; }
    public SubLObject getField3() { return $topic; }
    public SubLObject getField4() { return $subtopics; }
    public SubLObject getField5() { return $templates; }
    public SubLObject getField6() { return $ordering; }
    public SubLObject getField7() { return $title; }
    public SubLObject getField8() { return $term_prefix; }
    public SubLObject getField9() { return $intro_template; }
    public SubLObject getField10() { return $source_types; }
    public SubLObject getField11() { return $source_mt; }
    public SubLObject getField12() { return $query_mt; }
    public SubLObject getField13() { return $definitional_mt; }
    public SubLObject setField2(SubLObject value) { return $supertopic = value; }
    public SubLObject setField3(SubLObject value) { return $topic = value; }
    public SubLObject setField4(SubLObject value) { return $subtopics = value; }
    public SubLObject setField5(SubLObject value) { return $templates = value; }
    public SubLObject setField6(SubLObject value) { return $ordering = value; }
    public SubLObject setField7(SubLObject value) { return $title = value; }
    public SubLObject setField8(SubLObject value) { return $term_prefix = value; }
    public SubLObject setField9(SubLObject value) { return $intro_template = value; }
    public SubLObject setField10(SubLObject value) { return $source_types = value; }
    public SubLObject setField11(SubLObject value) { return $source_mt = value; }
    public SubLObject setField12(SubLObject value) { return $query_mt = value; }
    public SubLObject setField13(SubLObject value) { return $definitional_mt = value; }
    public SubLObject $supertopic = NIL;
    public SubLObject $topic = NIL;
    public SubLObject $subtopics = NIL;
    public SubLObject $templates = NIL;
    public SubLObject $ordering = NIL;
    public SubLObject $title = NIL;
    public SubLObject $term_prefix = NIL;
    public SubLObject $intro_template = NIL;
    public SubLObject $source_types = NIL;
    public SubLObject $source_mt = NIL;
    public SubLObject $query_mt = NIL;
    public SubLObject $definitional_mt = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($template_topic_native.class, $sym0$TEMPLATE_TOPIC, $sym1$TEMPLATE_TOPIC_P, $list2, $list3, new String[] {"$supertopic", "$topic", "$subtopics", "$templates", "$ordering", "$title", "$term_prefix", "$intro_template", "$source_types", "$source_mt", "$query_mt", "$definitional_mt"}, $list4, $list5, $sym6$PRINT_TEMPLATE_TOPIC);
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 1894) 
  public static SubLSymbol $dtp_template_topic$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 1894) 
  public static final SubLObject template_topic_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5848");
    return NIL;
  }

  public static final class $template_topic_p$UnaryFunction extends UnaryFunction {
    public $template_topic_p$UnaryFunction() { super(extractFunctionNamed("TEMPLATE-TOPIC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5851"); }
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 2583) 
  private static SubLSymbol $cfasl_guid_opcode_template_topic$ = null;

  public static final class $arg_position_details_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $argument_position; }
    public SubLObject getField3() { return $ordering; }
    public SubLObject getField4() { return $gloss; }
    public SubLObject getField5() { return $invisible_replacement_positions; }
    public SubLObject getField6() { return $replacement_constraints; }
    public SubLObject getField7() { return $candidate_replacements; }
    public SubLObject getField8() { return $is_editable; }
    public SubLObject getField9() { return $explanation; }
    public SubLObject getField10() { return $requires_validation; }
    public SubLObject getField11() { return $unknown_replacement; }
    public SubLObject setField2(SubLObject value) { return $argument_position = value; }
    public SubLObject setField3(SubLObject value) { return $ordering = value; }
    public SubLObject setField4(SubLObject value) { return $gloss = value; }
    public SubLObject setField5(SubLObject value) { return $invisible_replacement_positions = value; }
    public SubLObject setField6(SubLObject value) { return $replacement_constraints = value; }
    public SubLObject setField7(SubLObject value) { return $candidate_replacements = value; }
    public SubLObject setField8(SubLObject value) { return $is_editable = value; }
    public SubLObject setField9(SubLObject value) { return $explanation = value; }
    public SubLObject setField10(SubLObject value) { return $requires_validation = value; }
    public SubLObject setField11(SubLObject value) { return $unknown_replacement = value; }
    public SubLObject $argument_position = NIL;
    public SubLObject $ordering = NIL;
    public SubLObject $gloss = NIL;
    public SubLObject $invisible_replacement_positions = NIL;
    public SubLObject $replacement_constraints = NIL;
    public SubLObject $candidate_replacements = NIL;
    public SubLObject $is_editable = NIL;
    public SubLObject $explanation = NIL;
    public SubLObject $requires_validation = NIL;
    public SubLObject $unknown_replacement = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($arg_position_details_native.class, $sym47$ARG_POSITION_DETAILS, $sym48$ARG_POSITION_DETAILS_P, $list49, $list50, new String[] {"$argument_position", "$ordering", "$gloss", "$invisible_replacement_positions", "$replacement_constraints", "$candidate_replacements", "$is_editable", "$explanation", "$requires_validation", "$unknown_replacement"}, $list51, $list52, $sym53$PRINT_ARG_POSITION_DETAILS);
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 2723) 
  public static SubLSymbol $dtp_arg_position_details$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 2723) 
  public static final SubLObject arg_position_details_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5845");
    return NIL;
  }

  public static final class $arg_position_details_p$UnaryFunction extends UnaryFunction {
    public $arg_position_details_p$UnaryFunction() { super(extractFunctionNamed("ARG-POSITION-DETAILS-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5647"); }
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 3321) 
  private static SubLSymbol $cfasl_guid_opcode_arg_position_details$ = null;

  public static final class $formula_template_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $topic; }
    public SubLObject getField3() { return $id; }
    public SubLObject getField4() { return $formula; }
    public SubLObject getField5() { return $query_specification; }
    public SubLObject getField6() { return $elmt; }
    public SubLObject getField7() { return $focal_term; }
    public SubLObject getField8() { return $argpos_details; }
    public SubLObject getField9() { return $argpos_ordering; }
    public SubLObject getField10() { return $examples; }
    public SubLObject getField11() { return $entry_format; }
    public SubLObject getField12() { return $follow_ups; }
    public SubLObject getField13() { return $gloss; }
    public SubLObject getField14() { return $refspec; }
    public SubLObject setField2(SubLObject value) { return $topic = value; }
    public SubLObject setField3(SubLObject value) { return $id = value; }
    public SubLObject setField4(SubLObject value) { return $formula = value; }
    public SubLObject setField5(SubLObject value) { return $query_specification = value; }
    public SubLObject setField6(SubLObject value) { return $elmt = value; }
    public SubLObject setField7(SubLObject value) { return $focal_term = value; }
    public SubLObject setField8(SubLObject value) { return $argpos_details = value; }
    public SubLObject setField9(SubLObject value) { return $argpos_ordering = value; }
    public SubLObject setField10(SubLObject value) { return $examples = value; }
    public SubLObject setField11(SubLObject value) { return $entry_format = value; }
    public SubLObject setField12(SubLObject value) { return $follow_ups = value; }
    public SubLObject setField13(SubLObject value) { return $gloss = value; }
    public SubLObject setField14(SubLObject value) { return $refspec = value; }
    public SubLObject $topic = NIL;
    public SubLObject $id = NIL;
    public SubLObject $formula = NIL;
    public SubLObject $query_specification = NIL;
    public SubLObject $elmt = NIL;
    public SubLObject $focal_term = NIL;
    public SubLObject $argpos_details = NIL;
    public SubLObject $argpos_ordering = NIL;
    public SubLObject $examples = NIL;
    public SubLObject $entry_format = NIL;
    public SubLObject $follow_ups = NIL;
    public SubLObject $gloss = NIL;
    public SubLObject $refspec = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($formula_template_native.class, $sym86$FORMULA_TEMPLATE, $sym87$FORMULA_TEMPLATE_P, $list88, $list89, new String[] {"$topic", "$id", "$formula", "$query_specification", "$elmt", "$focal_term", "$argpos_details", "$argpos_ordering", "$examples", "$entry_format", "$follow_ups", "$gloss", "$refspec"}, $list90, $list91, $sym92$PRINT_FORMULA_TEMPLATE);
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 3473) 
  public static SubLSymbol $dtp_formula_template$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 3473) 
  public static final SubLObject formula_template_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5847");
    return NIL;
  }

  public static final class $formula_template_p$UnaryFunction extends UnaryFunction {
    public $formula_template_p$UnaryFunction() { super(extractFunctionNamed("FORMULA-TEMPLATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5749"); }
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 4233) 
  private static SubLSymbol $cfasl_guid_opcode_formula_template$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 4377) 
  private static SubLSymbol $make_ftemplate_loading_supporting_ask_browsableP$ = null;

  /** The bundle of assertions that are not supposed to be made available for editing. */
  @SubL(source = "cycl/formula-templates.lisp", position = 5133) 
  public static SubLSymbol $non_editable_assertions_for_template_topic_instance$ = null;

  /** A useful switch to test things that should not be made available yet. */
  @SubL(source = "cycl/formula-templates.lisp", position = 12386) 
  private static SubLSymbol $xml_suppress_future_template_extensions$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 12549) 
  private static SubLSymbol $xml_template_topic_revisions$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 15300) 
  public static final SubLObject cfasl_output_object_template_topic_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5671");
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 26620) 
  public static final SubLObject cfasl_output_object_formula_template_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5670");
  }

  @SubL(source = "cycl/formula-templates.lisp", position = 33998) 
  public static final SubLObject cfasl_output_object_arg_position_details_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5669");
  }

  /** Bound to dictionary mapping terms to lists of lower priority terms. */
  @SubL(source = "cycl/formula-templates.lisp", position = 67429) 
  private static SubLSymbol $high_to_low_priorities$ = null;

  /** Only emit output that something is bad, dont actually stop. */
  @SubL(source = "cycl/formula-templates.lisp", position = 77318) 
  private static SubLSymbol $warn_on_template_topic_validation_only$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 79511) 
  private static SubLSymbol $template_count_mt$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 88269) 
  private static SubLSymbol $xml_template_topic_assertions_revisions$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 95246) 
  private static SubLSymbol $quaternary_fet_evaluation_pred$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 98661) 
  private static SubLSymbol $map_elmt_to_published_conceptual_work_caching_state$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 99520) 
  private static SubLSymbol $unique_variables_list_for_formula_templates$ = null;

  @SubL(source = "cycl/formula-templates.lisp", position = 99671) 
  private static SubLSymbol $elmt_variable_for_formula_templates$ = null;

  /** BOOLEANP; Should we try to get assertion objects via our first ask, as opposed
to finding bindings, substituting, and then looking for matching assertions? */
  @SubL(source = "cycl/formula-templates.lisp", position = 99743) 
  public static SubLSymbol $get_assertions_from_initial_askP$ = null;

  /** All the constructions we dont currently deal with. */
  @SubL(source = "cycl/formula-templates.lisp", position = 120379) 
  private static SubLSymbol $ftemplate_constraint_to_collection_skiplist$ = null;

  public static final SubLObject declare_formula_templates_file() {
    declareFunction(myName, "template_topic_print_function_trampoline", "TEMPLATE-TOPIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "template_topic_p", "TEMPLATE-TOPIC-P", 1, 0, false); new $template_topic_p$UnaryFunction();
    //declareFunction(myName, "template_topic_supertopic", "TEMPLATE-TOPIC-SUPERTOPIC", 1, 0, false);
    //declareFunction(myName, "template_topic_topic", "TEMPLATE-TOPIC-TOPIC", 1, 0, false);
    //declareFunction(myName, "template_topic_subtopics", "TEMPLATE-TOPIC-SUBTOPICS", 1, 0, false);
    //declareFunction(myName, "template_topic_templates", "TEMPLATE-TOPIC-TEMPLATES", 1, 0, false);
    //declareFunction(myName, "template_topic_ordering", "TEMPLATE-TOPIC-ORDERING", 1, 0, false);
    //declareFunction(myName, "template_topic_title", "TEMPLATE-TOPIC-TITLE", 1, 0, false);
    //declareFunction(myName, "template_topic_term_prefix", "TEMPLATE-TOPIC-TERM-PREFIX", 1, 0, false);
    //declareFunction(myName, "template_topic_intro_template", "TEMPLATE-TOPIC-INTRO-TEMPLATE", 1, 0, false);
    //declareFunction(myName, "template_topic_source_types", "TEMPLATE-TOPIC-SOURCE-TYPES", 1, 0, false);
    //declareFunction(myName, "template_topic_source_mt", "TEMPLATE-TOPIC-SOURCE-MT", 1, 0, false);
    //declareFunction(myName, "template_topic_query_mt", "TEMPLATE-TOPIC-QUERY-MT", 1, 0, false);
    //declareFunction(myName, "template_topic_definitional_mt", "TEMPLATE-TOPIC-DEFINITIONAL-MT", 1, 0, false);
    //declareFunction(myName, "_csetf_template_topic_supertopic", "_CSETF-TEMPLATE-TOPIC-SUPERTOPIC", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_topic", "_CSETF-TEMPLATE-TOPIC-TOPIC", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_subtopics", "_CSETF-TEMPLATE-TOPIC-SUBTOPICS", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_templates", "_CSETF-TEMPLATE-TOPIC-TEMPLATES", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_ordering", "_CSETF-TEMPLATE-TOPIC-ORDERING", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_title", "_CSETF-TEMPLATE-TOPIC-TITLE", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_term_prefix", "_CSETF-TEMPLATE-TOPIC-TERM-PREFIX", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_intro_template", "_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_source_types", "_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_source_mt", "_CSETF-TEMPLATE-TOPIC-SOURCE-MT", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_query_mt", "_CSETF-TEMPLATE-TOPIC-QUERY-MT", 2, 0, false);
    //declareFunction(myName, "_csetf_template_topic_definitional_mt", "_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT", 2, 0, false);
    //declareFunction(myName, "make_template_topic", "MAKE-TEMPLATE-TOPIC", 0, 1, false);
    declareFunction(myName, "arg_position_details_print_function_trampoline", "ARG-POSITION-DETAILS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "arg_position_details_p", "ARG-POSITION-DETAILS-P", 1, 0, false); new $arg_position_details_p$UnaryFunction();
    //declareFunction(myName, "arg_position_details_argument_position", "ARG-POSITION-DETAILS-ARGUMENT-POSITION", 1, 0, false);
    //declareFunction(myName, "arg_position_details_ordering", "ARG-POSITION-DETAILS-ORDERING", 1, 0, false);
    //declareFunction(myName, "arg_position_details_gloss", "ARG-POSITION-DETAILS-GLOSS", 1, 0, false);
    //declareFunction(myName, "arg_position_details_invisible_replacement_positions", "ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS", 1, 0, false);
    //declareFunction(myName, "arg_position_details_replacement_constraints", "ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS", 1, 0, false);
    //declareFunction(myName, "arg_position_details_candidate_replacements", "ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS", 1, 0, false);
    //declareFunction(myName, "arg_position_details_is_editable", "ARG-POSITION-DETAILS-IS-EDITABLE", 1, 0, false);
    //declareFunction(myName, "arg_position_details_explanation", "ARG-POSITION-DETAILS-EXPLANATION", 1, 0, false);
    //declareFunction(myName, "arg_position_details_requires_validation", "ARG-POSITION-DETAILS-REQUIRES-VALIDATION", 1, 0, false);
    //declareFunction(myName, "arg_position_details_unknown_replacement", "ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT", 1, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_argument_position", "_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_ordering", "_CSETF-ARG-POSITION-DETAILS-ORDERING", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_gloss", "_CSETF-ARG-POSITION-DETAILS-GLOSS", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_invisible_replacement_positions", "_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_replacement_constraints", "_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_candidate_replacements", "_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_is_editable", "_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_explanation", "_CSETF-ARG-POSITION-DETAILS-EXPLANATION", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_requires_validation", "_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION", 2, 0, false);
    //declareFunction(myName, "_csetf_arg_position_details_unknown_replacement", "_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT", 2, 0, false);
    //declareFunction(myName, "make_arg_position_details", "MAKE-ARG-POSITION-DETAILS", 0, 1, false);
    declareFunction(myName, "formula_template_print_function_trampoline", "FORMULA-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "formula_template_p", "FORMULA-TEMPLATE-P", 1, 0, false); new $formula_template_p$UnaryFunction();
    //declareFunction(myName, "formula_template_topic", "FORMULA-TEMPLATE-TOPIC", 1, 0, false);
    //declareFunction(myName, "formula_template_id", "FORMULA-TEMPLATE-ID", 1, 0, false);
    //declareFunction(myName, "formula_template_formula", "FORMULA-TEMPLATE-FORMULA", 1, 0, false);
    //declareFunction(myName, "formula_template_query_specification", "FORMULA-TEMPLATE-QUERY-SPECIFICATION", 1, 0, false);
    //declareFunction(myName, "formula_template_elmt", "FORMULA-TEMPLATE-ELMT", 1, 0, false);
    //declareFunction(myName, "formula_template_focal_term", "FORMULA-TEMPLATE-FOCAL-TERM", 1, 0, false);
    //declareFunction(myName, "formula_template_argpos_details", "FORMULA-TEMPLATE-ARGPOS-DETAILS", 1, 0, false);
    //declareFunction(myName, "formula_template_argpos_ordering", "FORMULA-TEMPLATE-ARGPOS-ORDERING", 1, 0, false);
    //declareFunction(myName, "formula_template_examples", "FORMULA-TEMPLATE-EXAMPLES", 1, 0, false);
    //declareFunction(myName, "formula_template_entry_format", "FORMULA-TEMPLATE-ENTRY-FORMAT", 1, 0, false);
    //declareFunction(myName, "formula_template_follow_ups", "FORMULA-TEMPLATE-FOLLOW-UPS", 1, 0, false);
    //declareFunction(myName, "formula_template_gloss", "FORMULA-TEMPLATE-GLOSS", 1, 0, false);
    //declareFunction(myName, "formula_template_refspec", "FORMULA-TEMPLATE-REFSPEC", 1, 0, false);
    //declareFunction(myName, "_csetf_formula_template_topic", "_CSETF-FORMULA-TEMPLATE-TOPIC", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_id", "_CSETF-FORMULA-TEMPLATE-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_formula", "_CSETF-FORMULA-TEMPLATE-FORMULA", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_query_specification", "_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_elmt", "_CSETF-FORMULA-TEMPLATE-ELMT", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_focal_term", "_CSETF-FORMULA-TEMPLATE-FOCAL-TERM", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_argpos_details", "_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_argpos_ordering", "_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_examples", "_CSETF-FORMULA-TEMPLATE-EXAMPLES", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_entry_format", "_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_follow_ups", "_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_gloss", "_CSETF-FORMULA-TEMPLATE-GLOSS", 2, 0, false);
    //declareFunction(myName, "_csetf_formula_template_refspec", "_CSETF-FORMULA-TEMPLATE-REFSPEC", 2, 0, false);
    //declareFunction(myName, "make_formula_template", "MAKE-FORMULA-TEMPLATE", 0, 1, false);
    //declareFunction(myName, "is_ftemplate_loading_supporting_ask_browsableP", "IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?", 0, 0, false);
    //declareMacro(myName, "with_browsable_ftemplate_loading_supporting_ask", "WITH-BROWSABLE-FTEMPLATE-LOADING-SUPPORTING-ASK");
    //declareMacro(myName, "reusing_rkf_sd_problem_store_if_available", "REUSING-RKF-SD-PROBLEM-STORE-IF-AVAILABLE");
    //declareFunction(myName, "get_non_editable_assertions_for_template_topic_instance", "GET-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 0, 0, false);
    //declareMacro(myName, "with_known_non_editable_assertions_for_template_topic_instance", "WITH-KNOWN-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
    //declareFunction(myName, "compute_non_editable_assertions_for_template_topic_instance", "COMPUTE-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 4, 0, false);
    //declareFunction(myName, "is_non_editable_assertion_for_template_topic_instanceP", "IS-NON-EDITABLE-ASSERTION-FOR-TEMPLATE-TOPIC-INSTANCE?", 1, 0, false);
    //declareMacro(myName, "with_non_editable_assertions_for_template_topic_instance", "WITH-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
    //declareFunction(myName, "valid_formula_template_p", "VALID-FORMULA-TEMPLATE-P", 1, 0, false);
    //declareFunction(myName, "new_template_topic", "NEW-TEMPLATE-TOPIC", 1, 1, false);
    //declareFunction(myName, "template_topic_add_subtopic", "TEMPLATE-TOPIC-ADD-SUBTOPIC", 2, 0, false);
    //declareFunction(myName, "template_topic_add_template", "TEMPLATE-TOPIC-ADD-TEMPLATE", 2, 0, false);
    //declareFunction(myName, "template_topic_add_title", "TEMPLATE-TOPIC-ADD-TITLE", 2, 0, false);
    //declareFunction(myName, "template_topic_add_term_prefix", "TEMPLATE-TOPIC-ADD-TERM-PREFIX", 2, 0, false);
    //declareFunction(myName, "template_topic_set_introductory_template", "TEMPLATE-TOPIC-SET-INTRODUCTORY-TEMPLATE", 2, 0, false);
    //declareFunction(myName, "template_topic_set_source_types", "TEMPLATE-TOPIC-SET-SOURCE-TYPES", 2, 0, false);
    //declareFunction(myName, "print_template_topic", "PRINT-TEMPLATE-TOPIC", 3, 0, false);
    //declareFunction(myName, "xml_template_topic_current_revision", "XML-TEMPLATE-TOPIC-CURRENT-REVISION", 0, 0, false);
    //declareFunction(myName, "xml_serialize_template_topic", "XML-SERIALIZE-TEMPLATE-TOPIC", 1, 1, false);
    declareFunction(myName, "cfasl_output_object_template_topic_method", "CFASL-OUTPUT-OBJECT-TEMPLATE-TOPIC-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_template_topic", "CFASL-OUTPUT-TEMPLATE-TOPIC", 2, 0, false);
    //declareFunction(myName, "cfasl_input_template_topic", "CFASL-INPUT-TEMPLATE-TOPIC", 1, 0, false);
    //declareFunction(myName, "new_formula_template", "NEW-FORMULA-TEMPLATE", 1, 1, false);
    //declareFunction(myName, "formula_template_is_single_entryP", "FORMULA-TEMPLATE-IS-SINGLE-ENTRY?", 1, 0, false);
    //declareFunction(myName, "formula_template_is_multiple_entryP", "FORMULA-TEMPLATE-IS-MULTIPLE-ENTRY?", 1, 0, false);
    //declareFunction(myName, "formula_template_has_reformulation_specificationP", "FORMULA-TEMPLATE-HAS-REFORMULATION-SPECIFICATION?", 1, 0, false);
    //declareFunction(myName, "print_formula_template", "PRINT-FORMULA-TEMPLATE", 3, 0, false);
    //declareFunction(myName, "formula_template_set_formula", "FORMULA-TEMPLATE-SET-FORMULA", 2, 0, false);
    //declareFunction(myName, "formula_template_set_examples", "FORMULA-TEMPLATE-SET-EXAMPLES", 2, 0, false);
    //declareFunction(myName, "formula_template_set_focal_term", "FORMULA-TEMPLATE-SET-FOCAL-TERM", 2, 0, false);
    //declareFunction(myName, "formula_template_set_elmt", "FORMULA-TEMPLATE-SET-ELMT", 2, 0, false);
    //declareFunction(myName, "formula_template_set_entry_format", "FORMULA-TEMPLATE-SET-ENTRY-FORMAT", 2, 0, false);
    //declareFunction(myName, "formula_template_set_gloss", "FORMULA-TEMPLATE-SET-GLOSS", 2, 0, false);
    //declareFunction(myName, "formula_template_set_query_specification", "FORMULA-TEMPLATE-SET-QUERY-SPECIFICATION", 2, 0, false);
    //declareFunction(myName, "xml_serialize_formula_template", "XML-SERIALIZE-FORMULA-TEMPLATE", 1, 1, false);
    //declareFunction(myName, "xml_serialize_formula_template_as_document", "XML-SERIALIZE-FORMULA-TEMPLATE-AS-DOCUMENT", 1, 1, false);
    //declareFunction(myName, "xml_serialize_formula_template_header", "XML-SERIALIZE-FORMULA-TEMPLATE-HEADER", 0, 1, false);
    declareFunction(myName, "cfasl_output_object_formula_template_method", "CFASL-OUTPUT-OBJECT-FORMULA-TEMPLATE-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_formula_template", "CFASL-OUTPUT-FORMULA-TEMPLATE", 2, 0, false);
    //declareFunction(myName, "cfasl_input_formula_template", "CFASL-INPUT-FORMULA-TEMPLATE", 1, 0, false);
    //declareFunction(myName, "new_arg_position_details", "NEW-ARG-POSITION-DETAILS", 1, 0, false);
    //declareFunction(myName, "valid_arg_position_details_p", "VALID-ARG-POSITION-DETAILS-P", 1, 0, false);
    //declareFunction(myName, "print_arg_position_details", "PRINT-ARG-POSITION-DETAILS", 3, 0, false);
    //declareFunction(myName, "xml_serialize_arg_position_details", "XML-SERIALIZE-ARG-POSITION-DETAILS", 1, 1, false);
    declareFunction(myName, "cfasl_output_object_arg_position_details_method", "CFASL-OUTPUT-OBJECT-ARG-POSITION-DETAILS-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_arg_position_details", "CFASL-OUTPUT-ARG-POSITION-DETAILS", 2, 0, false);
    //declareFunction(myName, "cfasl_input_arg_position_details", "CFASL-INPUT-ARG-POSITION-DETAILS", 1, 0, false);
    //declareFunction(myName, "xml_serialize_arg_position", "XML-SERIALIZE-ARG-POSITION", 1, 1, false);
    //declareFunction(myName, "formula_template_load_topic_template_details", "FORMULA-TEMPLATE-LOAD-TOPIC-TEMPLATE-DETAILS", 3, 0, false);
    //declareFunction(myName, "ftemplate_load_argument_position_detail_information", "FTEMPLATE-LOAD-ARGUMENT-POSITION-DETAIL-INFORMATION", 2, 1, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_glosses", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-GLOSSES", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_explanations", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-EXPLANATIONS", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_invisible_replacement_positions", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-INVISIBLE-REPLACEMENT-POSITIONS", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_replacable_positions", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-REPLACABLE-POSITIONS", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_replacement_constraints", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-REPLACEMENT-CONSTRAINTS", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_candidate_replacements", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-CANDIDATE-REPLACEMENTS", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_validation_required", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-VALIDATION-REQUIRED", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_unknown_replacements", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-UNKNOWN-REPLACEMENTS", 2, 0, false);
    //declareFunction(myName, "get_ftemplate_arg_position_details", "GET-FTEMPLATE-ARG-POSITION-DETAILS", 2, 0, false);
    //declareFunction(myName, "update_ftemplate_argpos_detail_ordering_information", "UPDATE-FTEMPLATE-ARGPOS-DETAIL-ORDERING-INFORMATION", 1, 0, false);
    //declareFunction(myName, "ftemplate_compute_ordering_of_argpos_details", "FTEMPLATE-COMPUTE-ORDERING-OF-ARGPOS-DETAILS", 2, 0, false);
    //declareFunction(myName, "sort_argpos_details_by_ordering", "SORT-ARGPOS-DETAILS-BY-ORDERING", 1, 0, false);
    //declareFunction(myName, "ordered_by_argument_position", "ORDERED-BY-ARGUMENT-POSITION", 2, 0, false);
    //declareFunction(myName, "load_formula_template_skeleton_from_kb", "LOAD-FORMULA-TEMPLATE-SKELETON-FROM-KB", 2, 0, false);
    //declareFunction(myName, "load_formula_template_details_from_kb", "LOAD-FORMULA-TEMPLATE-DETAILS-FROM-KB", 2, 0, false);
    //declareFunction(myName, "ftemplate_assign_formula_component", "FTEMPLATE-ASSIGN-FORMULA-COMPONENT", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_functional_slot_value", "FTEMPLATE-GET-FUNCTIONAL-SLOT-VALUE", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_template_reformulation_specification", "FTEMPLATE-GET-TEMPLATE-REFORMULATION-SPECIFICATION", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_query_specification", "FTEMPLATE-GET-QUERY-SPECIFICATION", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_formula", "FTEMPLATE-GET-TEMPLATE-FORMULA", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_elmt", "FTEMPLATE-GET-TEMPLATE-ELMT", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_follow_ups", "FTEMPLATE-GET-TEMPLATE-FOLLOW-UPS", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_gloss", "FTEMPLATE-GET-TEMPLATE-GLOSS", 2, 0, false);
    //declareFunction(myName, "ftemplate_qualify_mt_to_now", "FTEMPLATE-QUALIFY-MT-TO-NOW", 1, 0, false);
    //declareFunction(myName, "ftemplate_qualify_mt_to_anytime", "FTEMPLATE-QUALIFY-MT-TO-ANYTIME", 1, 0, false);
    //declareFunction(myName, "ftemplate_hlmt_change_time", "FTEMPLATE-HLMT-CHANGE-TIME", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_glosses", "FTEMPLATE-GET-TEMPLATE-GLOSSES", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_template_explanations", "FTEMPLATE-GET-TEMPLATE-EXPLANATIONS", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_template_examples", "FTEMPLATE-GET-TEMPLATE-EXAMPLES", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_first_asserted_value", "FTEMPLATE-GET-FIRST-ASSERTED-VALUE", 4, 4, false);
    //declareFunction(myName, "ftemplate_get_asserted_values", "FTEMPLATE-GET-ASSERTED-VALUES", 4, 5, false);
    //declareFunction(myName, "ftemplate_get_template_focal_term", "FTEMPLATE-GET-TEMPLATE-FOCAL-TERM", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_template_format", "FTEMPLATE-GET-TEMPLATE-FORMAT", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_template_invisible_replacement_positions", "FTEMPLATE-GET-TEMPLATE-INVISIBLE-REPLACEMENT-POSITIONS", 3, 0, false);
    //declareFunction(myName, "ftemplate_get_template_replacement_constraints", "FTEMPLATE-GET-TEMPLATE-REPLACEMENT-CONSTRAINTS", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_unknown_replacements", "FTEMPLATE-GET-TEMPLATE-UNKNOWN-REPLACEMENTS", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_candidate_replacements_for_position", "FTEMPLATE-GET-TEMPLATE-CANDIDATE-REPLACEMENTS-FOR-POSITION", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_replacable_positions", "FTEMPLATE-GET-TEMPLATE-REPLACABLE-POSITIONS", 2, 0, false);
    //declareFunction(myName, "ftemplate_get_template_validation_requirements", "FTEMPLATE-GET-TEMPLATE-VALIDATION-REQUIREMENTS", 2, 0, false);
    //declareFunction(myName, "formula_template_load_topic_subtopic_ordering", "FORMULA-TEMPLATE-LOAD-TOPIC-SUBTOPIC-ORDERING", 2, 0, false);
    //declareFunction(myName, "formula_template_load_topic_template_ordering", "FORMULA-TEMPLATE-LOAD-TOPIC-TEMPLATE-ORDERING", 2, 0, false);
    //declareFunction(myName, "lower_priority_terms", "LOWER-PRIORITY-TERMS", 1, 0, false);
    //declareFunction(myName, "accumulate_lower_priority_terms", "ACCUMULATE-LOWER-PRIORITY-TERMS", 2, 0, false);
    //declareFunction(myName, "higher_priorityP", "HIGHER-PRIORITY?", 2, 0, false);
    //declareFunction(myName, "apply_prioritizing_ordering_to_kb_objects", "APPLY-PRIORITIZING-ORDERING-TO-KB-OBJECTS", 2, 0, false);
    //declareFunction(myName, "apply_prioritizing_ordering_to_kb_objects_rck", "APPLY-PRIORITIZING-ORDERING-TO-KB-OBJECTS-RCK", 2, 0, false);
    //declareFunction(myName, "construct_highXlow_information_from_prioritizing_ordering", "CONSTRUCT-HIGH/LOW-INFORMATION-FROM-PRIORITIZING-ORDERING", 1, 0, false);
    //declareFunction(myName, "formula_template_load_prioritization_information_for_subtopics", "FORMULA-TEMPLATE-LOAD-PRIORITIZATION-INFORMATION-FOR-SUBTOPICS", 2, 0, false);
    //declareFunction(myName, "formula_template_load_prioritization_information_for_templates", "FORMULA-TEMPLATE-LOAD-PRIORITIZATION-INFORMATION-FOR-TEMPLATES", 2, 0, false);
    //declareFunction(myName, "formula_template_organize_templates_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-TEMPLATES-BY-ORDERING", 1, 0, false);
    //declareFunction(myName, "formula_template_organize_subtopics_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-SUBTOPICS-BY-ORDERING", 1, 0, false);
    //declareFunction(myName, "formula_template_organize_by_ordering", "FORMULA-TEMPLATE-ORGANIZE-BY-ORDERING", 3, 0, false);
    //declareFunction(myName, "stable_template_id_compare", "STABLE-TEMPLATE-ID-COMPARE", 2, 0, false);
    //declareFunction(myName, "formula_template_load_template_graph", "FORMULA-TEMPLATE-LOAD-TEMPLATE-GRAPH", 2, 0, false);
    //declareFunction(myName, "validate_template_topic_semantic_constraints", "VALIDATE-TEMPLATE-TOPIC-SEMANTIC-CONSTRAINTS", 1, 0, false);
    //declareFunction(myName, "template_topic_query_mt_can_see_all_assertion_mts", "TEMPLATE-TOPIC-QUERY-MT-CAN-SEE-ALL-ASSERTION-MTS", 1, 0, false);
    //declareFunction(myName, "check_template_topic_query_mt_can_see_subtopics_assertion_mts", "CHECK-TEMPLATE-TOPIC-QUERY-MT-CAN-SEE-SUBTOPICS-ASSERTION-MTS", 2, 0, false);
    //declareFunction(myName, "templates_use_isaXgenlsP", "TEMPLATES-USE-ISA/GENLS?", 0, 0, false);
    //declareFunction(myName, "asserted_formula_template_ids_for_type", "ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE", 2, 0, false);
    //declareFunction(myName, "sort_formula_template_subtopics_by_template_count", "SORT-FORMULA-TEMPLATE-SUBTOPICS-BY-TEMPLATE-COUNT", 2, 0, false);
    //declareFunction(myName, "count_asserted_formula_template_ids_for_type_internal", "COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE-INTERNAL", 1, 1, false);
    //declareFunction(myName, "count_asserted_formula_template_ids_for_type", "COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE", 1, 1, false);
    //declareFunction(myName, "fet_topic_fort_has_subtopicsP", "FET-TOPIC-FORT-HAS-SUBTOPICS?", 2, 0, false);
    //declareFunction(myName, "fet_topic_fort_has_templatesP", "FET-TOPIC-FORT-HAS-TEMPLATES?", 2, 0, false);
    //declareFunction(myName, "formula_template_subtopics_for_type", "FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false);
    //declareFunction(myName, "formula_template_asserted_subtopics_for_type", "FORMULA-TEMPLATE-ASSERTED-SUBTOPICS-FOR-TYPE", 2, 0, false);
    //declareFunction(myName, "asserted_formula_template_subtopics_for_type", "ASSERTED-FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false);
    //declareFunction(myName, "formula_template_induction_mt", "FORMULA-TEMPLATE-INDUCTION-MT", 2, 0, false);
    //declareFunction(myName, "formula_template_topic_load_topic_specifics", "FORMULA-TEMPLATE-TOPIC-LOAD-TOPIC-SPECIFICS", 2, 0, false);
    //declareFunction(myName, "topictmplt_get_topic_template_source_types", "TOPICTMPLT-GET-TOPIC-TEMPLATE-SOURCE-TYPES", 2, 0, false);
    //declareFunction(myName, "ftemplate_topic_get_functional_slot_value", "FTEMPLATE-TOPIC-GET-FUNCTIONAL-SLOT-VALUE", 3, 0, false);
    //declareFunction(myName, "topictmplt_get_topic_template_introductory_template", "TOPICTMPLT-GET-TOPIC-TEMPLATE-INTRODUCTORY-TEMPLATE", 2, 0, false);
    //declareFunction(myName, "topictmplt_get_topic_template_title", "TOPICTMPLT-GET-TOPIC-TEMPLATE-TITLE", 2, 0, false);
    //declareFunction(myName, "topictmplt_get_topic_template_term_prefix", "TOPICTMPLT-GET-TOPIC-TEMPLATE-TERM-PREFIX", 2, 0, false);
    //declareFunction(myName, "topictmplt_get_topic_template_query_mt", "TOPICTMPLT-GET-TOPIC-TEMPLATE-QUERY-MT", 2, 0, false);
    //declareFunction(myName, "topictmplt_get_topic_template_definitional_mt", "TOPICTMPLT-GET-TOPIC-TEMPLATE-DEFINITIONAL-MT", 2, 0, false);
    //declareFunction(myName, "ftemplate_ask_variable", "FTEMPLATE-ASK-VARIABLE", 3, 1, false);
    //declareFunction(myName, "ftemplate_ask_template", "FTEMPLATE-ASK-TEMPLATE", 3, 1, false);
    //declareFunction(myName, "get_editable_and_non_editable_assertions_for_template_topic_instance", "GET-EDITABLE-AND-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 3, 0, false);
    //declareFunction(myName, "get_assertions_for_template_topic_instance", "GET-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 3, 0, false);
    //declareFunction(myName, "get_assertions_for_template_topic_instance_int", "GET-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE-INT", 4, 0, false);
    //declareFunction(myName, "xml_template_topic_assertions_current_revision", "XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION", 0, 0, false);
    //declareFunction(myName, "xml_serialize_assertions_for_template_topic_instance", "XML-SERIALIZE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE", 5, 1, false);
    //declareFunction(myName, "xml_serialize_assertions_for_formula_template_instance", "XML-SERIALIZE-ASSERTIONS-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 1, false);
    //declareFunction(myName, "ftemplate_assertion_non_editableP", "FTEMPLATE-ASSERTION-NON-EDITABLE?", 2, 0, false);
    //declareFunction(myName, "xml_serialize_assertion_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
    //declareFunction(myName, "xml_serialize_assertion_sentence_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-SENTENCE-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
    //declareFunction(myName, "xml_serialize_assertion_suids_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-SUIDS-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_suids", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SUIDS", 2, 0, false);
    //declareFunction(myName, "xml_serialize_assertion_evaluation_data_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-EVALUATION-DATA-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
    //declareFunction(myName, "quaternary_fet_evaluation_pred", "QUATERNARY-FET-EVALUATION-PRED", 0, 0, false);
    //declareFunction(myName, "ftemplate_assertion_evaluations", "FTEMPLATE-ASSERTION-EVALUATIONS", 3, 0, false);
    //declareFunction(myName, "ftemplate_evaluation_judgment", "FTEMPLATE-EVALUATION-JUDGMENT", 1, 0, false);
    //declareFunction(myName, "xml_serialize_assertion_timestamp_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-TIMESTAMP-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_date", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-DATE", 2, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_second", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SECOND", 2, 0, false);
    //declareFunction(myName, "xml_serialize_assertion_elmt_for_formula_template_instance", "XML-SERIALIZE-ASSERTION-ELMT-FOR-FORMULA-TEMPLATE-INSTANCE", 3, 0, false);
    //declareFunction(myName, "xml_serialize_elmt_information_for_assertion", "XML-SERIALIZE-ELMT-INFORMATION-FOR-ASSERTION", 1, 1, false);
    //declareFunction(myName, "clear_map_elmt_to_published_conceptual_work", "CLEAR-MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 0, 0, false);
    //declareFunction(myName, "remove_map_elmt_to_published_conceptual_work", "REMOVE-MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 1, 0, false);
    //declareFunction(myName, "map_elmt_to_published_conceptual_work_internal", "MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-INTERNAL", 1, 0, false);
    //declareFunction(myName, "map_elmt_to_published_conceptual_work", "MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK", 1, 0, false);
    //declareFunction(myName, "get_assertions_for_leaf_template_topic_instance", "GET-ASSERTIONS-FOR-LEAF-TEMPLATE-TOPIC-INSTANCE", 4, 0, false);
    //declareFunction(myName, "get_assertions_for_formula_template_instance", "GET-ASSERTIONS-FOR-FORMULA-TEMPLATE-INSTANCE", 4, 0, false);
    //declareFunction(myName, "get_assertions_for_fet_sentence", "GET-ASSERTIONS-FOR-FET-SENTENCE", 5, 3, false);
    //declareFunction(myName, "fet_fallback_to_default_mtP", "FET-FALLBACK-TO-DEFAULT-MT?", 1, 0, false);
    //declareFunction(myName, "ftemplate_reformulated_query_mt", "FTEMPLATE-REFORMULATED-QUERY-MT", 2, 0, false);
    //declareFunction(myName, "ftemplate_filter_reformulated_result_set", "FTEMPLATE-FILTER-REFORMULATED-RESULT-SET", 2, 0, false);
    //declareFunction(myName, "ftemplate_reformulated_result_duplicateP", "FTEMPLATE-REFORMULATED-RESULT-DUPLICATE?", 2, 0, false);
    //declareFunction(myName, "unpack_note_reformulation_result_sets", "UNPACK-NOTE-REFORMULATION-RESULT-SETS", 3, 0, false);
    //declareFunction(myName, "add_one_polycanonicalized_result", "ADD-ONE-POLYCANONICALIZED-RESULT", 2, 0, false);
    //declareFunction(myName, "unpack_note_reformulation_result", "UNPACK-NOTE-REFORMULATION-RESULT", 3, 0, false);
    //declareFunction(myName, "ftemplate_loading_supporting_ask", "FTEMPLATE-LOADING-SUPPORTING-ASK", 3, 1, false);
    //declareFunction(myName, "smarter_find_visible_assertions_cycl", "SMARTER-FIND-VISIBLE-ASSERTIONS-CYCL", 2, 0, false);
    //declareFunction(myName, "get_assertions_from_formula_template_result_sets", "GET-ASSERTIONS-FROM-FORMULA-TEMPLATE-RESULT-SETS", 5, 1, false);
    //declareFunction(myName, "make_ftemplate_polycanonicalized_assertion", "MAKE-FTEMPLATE-POLYCANONICALIZED-ASSERTION", 2, 1, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_p", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-P", 1, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_sentence", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-SENTENCE", 1, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_hl_assertions", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-HL-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_find_hl_assertions", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-FIND-HL-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "ftemplate_polycanonicalized_assertion_mt", "FTEMPLATE-POLYCANONICALIZED-ASSERTION-MT", 1, 0, false);
    //declareFunction(myName, "ftemplate_assertion_mt", "FTEMPLATE-ASSERTION-MT", 1, 0, false);
    //declareFunction(myName, "bad_assertion_for_formula_templatesP", "BAD-ASSERTION-FOR-FORMULA-TEMPLATES?", 1, 0, false);
    //declareFunction(myName, "uninteresting_indeterminate_termP", "UNINTERESTING-INDETERMINATE-TERM?", 1, 0, false);
    //declareFunction(myName, "is_skolemish_termP", "IS-SKOLEMISH-TERM?", 1, 0, false);
    //declareFunction(myName, "get_assertion_sentence_and_constraints_from_formula_template", "GET-ASSERTION-SENTENCE-AND-CONSTRAINTS-FROM-FORMULA-TEMPLATE", 3, 0, false);
    //declareFunction(myName, "get_assertion_finding_query_sentence", "GET-ASSERTION-FINDING-QUERY-SENTENCE", 1, 1, false);
    //declareFunction(myName, "constrain_query_with_accumulated_constraints", "CONSTRAIN-QUERY-WITH-ACCUMULATED-CONSTRAINTS", 2, 0, false);
    //declareFunction(myName, "fet_assertion_variable_for_formula", "FET-ASSERTION-VARIABLE-FOR-FORMULA", 1, 0, false);
    //declareFunction(myName, "ftemplate_assertion_constrained_query_formula", "FTEMPLATE-ASSERTION-CONSTRAINED-QUERY-FORMULA", 1, 1, false);
    //declareFunction(myName, "formula_ok_for_fet_assertion_varP", "FORMULA-OK-FOR-FET-ASSERTION-VAR?", 2, 0, false);
    //declareFunction(myName, "convert_ftemplate_input_constraint_to_collection", "CONVERT-FTEMPLATE-INPUT-CONSTRAINT-TO-COLLECTION", 2, 0, false);
    //declareFunction(myName, "get_lexical_mt_for_rkf_interaction_mt", "GET-LEXICAL-MT-FOR-RKF-INTERACTION-MT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_formula_templates_file() {
    $dtp_template_topic$ = defconstant("*DTP-TEMPLATE-TOPIC*", $sym0$TEMPLATE_TOPIC);
    $cfasl_guid_opcode_template_topic$ = deflexical("*CFASL-GUID-OPCODE-TEMPLATE-TOPIC*", Guids.string_to_guid($str45$18287931_d871_11d9_8eef_0002b3891));
    $dtp_arg_position_details$ = defconstant("*DTP-ARG-POSITION-DETAILS*", $sym47$ARG_POSITION_DETAILS);
    $cfasl_guid_opcode_arg_position_details$ = deflexical("*CFASL-GUID-OPCODE-ARG-POSITION-DETAILS*", Guids.string_to_guid($str84$182a9c10_d871_11d9_8eef_0002b3891));
    $dtp_formula_template$ = defconstant("*DTP-FORMULA-TEMPLATE*", $sym86$FORMULA_TEMPLATE);
    $cfasl_guid_opcode_formula_template$ = deflexical("*CFASL-GUID-OPCODE-FORMULA-TEMPLATE*", Guids.string_to_guid($str131$182b1140_d871_11d9_8eef_0002b3891));
    $make_ftemplate_loading_supporting_ask_browsableP$ = defparameter("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*", NIL);
    $non_editable_assertions_for_template_topic_instance$ = defparameter("*NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE*", NIL);
    $xml_suppress_future_template_extensions$ = defparameter("*XML-SUPPRESS-FUTURE-TEMPLATE-EXTENSIONS*", T);
    $xml_template_topic_revisions$ = deflexical("*XML-TEMPLATE-TOPIC-REVISIONS*", $list163);
    $high_to_low_priorities$ = defparameter("*HIGH-TO-LOW-PRIORITIES*", NIL);
    $warn_on_template_topic_validation_only$ = deflexical("*WARN-ON-TEMPLATE-TOPIC-VALIDATION-ONLY*", T);
    $template_count_mt$ = defparameter("*TEMPLATE-COUNT-MT*", $const331$InferencePSC);
    $xml_template_topic_assertions_revisions$ = deflexical("*XML-TEMPLATE-TOPIC-ASSERTIONS-REVISIONS*", $list352);
    $quaternary_fet_evaluation_pred$ = deflexical("*QUATERNARY-FET-EVALUATION-PRED*", NIL);
    $map_elmt_to_published_conceptual_work_caching_state$ = deflexical("*MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-CACHING-STATE*", NIL);
    $unique_variables_list_for_formula_templates$ = deflexical("*UNIQUE-VARIABLES-LIST-FOR-FORMULA-TEMPLATES*", $list392);
    $elmt_variable_for_formula_templates$ = deflexical("*ELMT-VARIABLE-FOR-FORMULA-TEMPLATES*", $sym393$_POLY_ELMT);
    $get_assertions_from_initial_askP$ = defparameter("*GET-ASSERTIONS-FROM-INITIAL-ASK?*", T);
    $ftemplate_constraint_to_collection_skiplist$ = deflexical("*FTEMPLATE-CONSTRAINT-TO-COLLECTION-SKIPLIST*", $list422);
    return NIL;
  }

  public static final SubLObject setup_formula_templates_file() {
    // CVS_ID("Id: formula-templates.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_template_topic$.getGlobalValue(), Symbols.symbol_function($sym7$TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TEMPLATE_TOPIC_SUPERTOPIC, $sym9$_CSETF_TEMPLATE_TOPIC_SUPERTOPIC);
    Structures.def_csetf($sym10$TEMPLATE_TOPIC_TOPIC, $sym11$_CSETF_TEMPLATE_TOPIC_TOPIC);
    Structures.def_csetf($sym12$TEMPLATE_TOPIC_SUBTOPICS, $sym13$_CSETF_TEMPLATE_TOPIC_SUBTOPICS);
    Structures.def_csetf($sym14$TEMPLATE_TOPIC_TEMPLATES, $sym15$_CSETF_TEMPLATE_TOPIC_TEMPLATES);
    Structures.def_csetf($sym16$TEMPLATE_TOPIC_ORDERING, $sym17$_CSETF_TEMPLATE_TOPIC_ORDERING);
    Structures.def_csetf($sym18$TEMPLATE_TOPIC_TITLE, $sym19$_CSETF_TEMPLATE_TOPIC_TITLE);
    Structures.def_csetf($sym20$TEMPLATE_TOPIC_TERM_PREFIX, $sym21$_CSETF_TEMPLATE_TOPIC_TERM_PREFIX);
    Structures.def_csetf($sym22$TEMPLATE_TOPIC_INTRO_TEMPLATE, $sym23$_CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE);
    Structures.def_csetf($sym24$TEMPLATE_TOPIC_SOURCE_TYPES, $sym25$_CSETF_TEMPLATE_TOPIC_SOURCE_TYPES);
    Structures.def_csetf($sym26$TEMPLATE_TOPIC_SOURCE_MT, $sym27$_CSETF_TEMPLATE_TOPIC_SOURCE_MT);
    Structures.def_csetf($sym28$TEMPLATE_TOPIC_QUERY_MT, $sym29$_CSETF_TEMPLATE_TOPIC_QUERY_MT);
    Structures.def_csetf($sym30$TEMPLATE_TOPIC_DEFINITIONAL_MT, $sym31$_CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT);
    Equality.identity($sym0$TEMPLATE_TOPIC);
    cfasl.register_cfasl_guid_denoted_type_input_function($cfasl_guid_opcode_template_topic$.getGlobalValue(), $sym46$CFASL_INPUT_TEMPLATE_TOPIC);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_arg_position_details$.getGlobalValue(), Symbols.symbol_function($sym54$ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym55$ARG_POSITION_DETAILS_ARGUMENT_POSITION, $sym56$_CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION);
    Structures.def_csetf($sym57$ARG_POSITION_DETAILS_ORDERING, $sym58$_CSETF_ARG_POSITION_DETAILS_ORDERING);
    Structures.def_csetf($sym59$ARG_POSITION_DETAILS_GLOSS, $sym60$_CSETF_ARG_POSITION_DETAILS_GLOSS);
    Structures.def_csetf($sym61$ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS, $sym62$_CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS);
    Structures.def_csetf($sym63$ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS, $sym64$_CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS);
    Structures.def_csetf($sym65$ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS, $sym66$_CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS);
    Structures.def_csetf($sym67$ARG_POSITION_DETAILS_IS_EDITABLE, $sym68$_CSETF_ARG_POSITION_DETAILS_IS_EDITABLE);
    Structures.def_csetf($sym69$ARG_POSITION_DETAILS_EXPLANATION, $sym70$_CSETF_ARG_POSITION_DETAILS_EXPLANATION);
    Structures.def_csetf($sym71$ARG_POSITION_DETAILS_REQUIRES_VALIDATION, $sym72$_CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION);
    Structures.def_csetf($sym73$ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT, $sym74$_CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT);
    Equality.identity($sym47$ARG_POSITION_DETAILS);
    cfasl.register_cfasl_guid_denoted_type_input_function($cfasl_guid_opcode_arg_position_details$.getGlobalValue(), $sym85$CFASL_INPUT_ARG_POSITION_DETAILS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_formula_template$.getGlobalValue(), Symbols.symbol_function($sym93$FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym94$FORMULA_TEMPLATE_TOPIC, $sym95$_CSETF_FORMULA_TEMPLATE_TOPIC);
    Structures.def_csetf($sym96$FORMULA_TEMPLATE_ID, $sym97$_CSETF_FORMULA_TEMPLATE_ID);
    Structures.def_csetf($sym98$FORMULA_TEMPLATE_FORMULA, $sym99$_CSETF_FORMULA_TEMPLATE_FORMULA);
    Structures.def_csetf($sym100$FORMULA_TEMPLATE_QUERY_SPECIFICATION, $sym101$_CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION);
    Structures.def_csetf($sym102$FORMULA_TEMPLATE_ELMT, $sym103$_CSETF_FORMULA_TEMPLATE_ELMT);
    Structures.def_csetf($sym104$FORMULA_TEMPLATE_FOCAL_TERM, $sym105$_CSETF_FORMULA_TEMPLATE_FOCAL_TERM);
    Structures.def_csetf($sym106$FORMULA_TEMPLATE_ARGPOS_DETAILS, $sym107$_CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS);
    Structures.def_csetf($sym108$FORMULA_TEMPLATE_ARGPOS_ORDERING, $sym109$_CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING);
    Structures.def_csetf($sym110$FORMULA_TEMPLATE_EXAMPLES, $sym111$_CSETF_FORMULA_TEMPLATE_EXAMPLES);
    Structures.def_csetf($sym112$FORMULA_TEMPLATE_ENTRY_FORMAT, $sym113$_CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT);
    Structures.def_csetf($sym114$FORMULA_TEMPLATE_FOLLOW_UPS, $sym115$_CSETF_FORMULA_TEMPLATE_FOLLOW_UPS);
    Structures.def_csetf($sym116$FORMULA_TEMPLATE_GLOSS, $sym117$_CSETF_FORMULA_TEMPLATE_GLOSS);
    Structures.def_csetf($sym118$FORMULA_TEMPLATE_REFSPEC, $sym119$_CSETF_FORMULA_TEMPLATE_REFSPEC);
    Equality.identity($sym86$FORMULA_TEMPLATE);
    cfasl.register_cfasl_guid_denoted_type_input_function($cfasl_guid_opcode_formula_template$.getGlobalValue(), $sym132$CFASL_INPUT_FORMULA_TEMPLATE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_template_topic$.getGlobalValue(), Symbols.symbol_function($sym179$CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD));
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_formula_template$.getGlobalValue(), Symbols.symbol_function($sym223$CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD));
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_arg_position_details$.getGlobalValue(), Symbols.symbol_function($sym248$CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD));
    memoization_state.note_memoized_function($sym333$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE);
    memoization_state.note_globally_cached_function($sym388$MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TEMPLATE_TOPIC = makeSymbol("TEMPLATE-TOPIC");
  public static final SubLSymbol $sym1$TEMPLATE_TOPIC_P = makeSymbol("TEMPLATE-TOPIC-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("SUPERTOPIC"), makeSymbol("TOPIC"), makeSymbol("SUBTOPICS"), makeSymbol("TEMPLATES"), makeSymbol("ORDERING"), makeSymbol("TITLE"), makeSymbol("TERM-PREFIX"), makeSymbol("INTRO-TEMPLATE"), makeSymbol("SOURCE-TYPES"), makeSymbol("SOURCE-MT"), makeSymbol("QUERY-MT"), makeSymbol("DEFINITIONAL-MT")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("SUPERTOPIC"), makeKeyword("TOPIC"), makeKeyword("SUBTOPICS"), makeKeyword("TEMPLATES"), makeKeyword("ORDERING"), makeKeyword("TITLE"), makeKeyword("TERM-PREFIX"), makeKeyword("INTRO-TEMPLATE"), makeKeyword("SOURCE-TYPES"), makeKeyword("SOURCE-MT"), makeKeyword("QUERY-MT"), makeKeyword("DEFINITIONAL-MT")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("TEMPLATE-TOPIC-SUPERTOPIC"), makeSymbol("TEMPLATE-TOPIC-TOPIC"), makeSymbol("TEMPLATE-TOPIC-SUBTOPICS"), makeSymbol("TEMPLATE-TOPIC-TEMPLATES"), makeSymbol("TEMPLATE-TOPIC-ORDERING"), makeSymbol("TEMPLATE-TOPIC-TITLE"), makeSymbol("TEMPLATE-TOPIC-TERM-PREFIX"), makeSymbol("TEMPLATE-TOPIC-INTRO-TEMPLATE"), makeSymbol("TEMPLATE-TOPIC-SOURCE-TYPES"), makeSymbol("TEMPLATE-TOPIC-SOURCE-MT"), makeSymbol("TEMPLATE-TOPIC-QUERY-MT"), makeSymbol("TEMPLATE-TOPIC-DEFINITIONAL-MT")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-TEMPLATE-TOPIC-SUPERTOPIC"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TOPIC"), makeSymbol("_CSETF-TEMPLATE-TOPIC-SUBTOPICS"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TEMPLATES"), makeSymbol("_CSETF-TEMPLATE-TOPIC-ORDERING"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TITLE"), makeSymbol("_CSETF-TEMPLATE-TOPIC-TERM-PREFIX"), makeSymbol("_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE"), makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES"), makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-MT"), makeSymbol("_CSETF-TEMPLATE-TOPIC-QUERY-MT"), makeSymbol("_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT")});
  public static final SubLSymbol $sym6$PRINT_TEMPLATE_TOPIC = makeSymbol("PRINT-TEMPLATE-TOPIC");
  public static final SubLSymbol $sym7$TEMPLATE_TOPIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEMPLATE-TOPIC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TEMPLATE_TOPIC_SUPERTOPIC = makeSymbol("TEMPLATE-TOPIC-SUPERTOPIC");
  public static final SubLSymbol $sym9$_CSETF_TEMPLATE_TOPIC_SUPERTOPIC = makeSymbol("_CSETF-TEMPLATE-TOPIC-SUPERTOPIC");
  public static final SubLSymbol $sym10$TEMPLATE_TOPIC_TOPIC = makeSymbol("TEMPLATE-TOPIC-TOPIC");
  public static final SubLSymbol $sym11$_CSETF_TEMPLATE_TOPIC_TOPIC = makeSymbol("_CSETF-TEMPLATE-TOPIC-TOPIC");
  public static final SubLSymbol $sym12$TEMPLATE_TOPIC_SUBTOPICS = makeSymbol("TEMPLATE-TOPIC-SUBTOPICS");
  public static final SubLSymbol $sym13$_CSETF_TEMPLATE_TOPIC_SUBTOPICS = makeSymbol("_CSETF-TEMPLATE-TOPIC-SUBTOPICS");
  public static final SubLSymbol $sym14$TEMPLATE_TOPIC_TEMPLATES = makeSymbol("TEMPLATE-TOPIC-TEMPLATES");
  public static final SubLSymbol $sym15$_CSETF_TEMPLATE_TOPIC_TEMPLATES = makeSymbol("_CSETF-TEMPLATE-TOPIC-TEMPLATES");
  public static final SubLSymbol $sym16$TEMPLATE_TOPIC_ORDERING = makeSymbol("TEMPLATE-TOPIC-ORDERING");
  public static final SubLSymbol $sym17$_CSETF_TEMPLATE_TOPIC_ORDERING = makeSymbol("_CSETF-TEMPLATE-TOPIC-ORDERING");
  public static final SubLSymbol $sym18$TEMPLATE_TOPIC_TITLE = makeSymbol("TEMPLATE-TOPIC-TITLE");
  public static final SubLSymbol $sym19$_CSETF_TEMPLATE_TOPIC_TITLE = makeSymbol("_CSETF-TEMPLATE-TOPIC-TITLE");
  public static final SubLSymbol $sym20$TEMPLATE_TOPIC_TERM_PREFIX = makeSymbol("TEMPLATE-TOPIC-TERM-PREFIX");
  public static final SubLSymbol $sym21$_CSETF_TEMPLATE_TOPIC_TERM_PREFIX = makeSymbol("_CSETF-TEMPLATE-TOPIC-TERM-PREFIX");
  public static final SubLSymbol $sym22$TEMPLATE_TOPIC_INTRO_TEMPLATE = makeSymbol("TEMPLATE-TOPIC-INTRO-TEMPLATE");
  public static final SubLSymbol $sym23$_CSETF_TEMPLATE_TOPIC_INTRO_TEMPLATE = makeSymbol("_CSETF-TEMPLATE-TOPIC-INTRO-TEMPLATE");
  public static final SubLSymbol $sym24$TEMPLATE_TOPIC_SOURCE_TYPES = makeSymbol("TEMPLATE-TOPIC-SOURCE-TYPES");
  public static final SubLSymbol $sym25$_CSETF_TEMPLATE_TOPIC_SOURCE_TYPES = makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-TYPES");
  public static final SubLSymbol $sym26$TEMPLATE_TOPIC_SOURCE_MT = makeSymbol("TEMPLATE-TOPIC-SOURCE-MT");
  public static final SubLSymbol $sym27$_CSETF_TEMPLATE_TOPIC_SOURCE_MT = makeSymbol("_CSETF-TEMPLATE-TOPIC-SOURCE-MT");
  public static final SubLSymbol $sym28$TEMPLATE_TOPIC_QUERY_MT = makeSymbol("TEMPLATE-TOPIC-QUERY-MT");
  public static final SubLSymbol $sym29$_CSETF_TEMPLATE_TOPIC_QUERY_MT = makeSymbol("_CSETF-TEMPLATE-TOPIC-QUERY-MT");
  public static final SubLSymbol $sym30$TEMPLATE_TOPIC_DEFINITIONAL_MT = makeSymbol("TEMPLATE-TOPIC-DEFINITIONAL-MT");
  public static final SubLSymbol $sym31$_CSETF_TEMPLATE_TOPIC_DEFINITIONAL_MT = makeSymbol("_CSETF-TEMPLATE-TOPIC-DEFINITIONAL-MT");
  public static final SubLSymbol $kw32$SUPERTOPIC = makeKeyword("SUPERTOPIC");
  public static final SubLSymbol $kw33$TOPIC = makeKeyword("TOPIC");
  public static final SubLSymbol $kw34$SUBTOPICS = makeKeyword("SUBTOPICS");
  public static final SubLSymbol $kw35$TEMPLATES = makeKeyword("TEMPLATES");
  public static final SubLSymbol $kw36$ORDERING = makeKeyword("ORDERING");
  public static final SubLSymbol $kw37$TITLE = makeKeyword("TITLE");
  public static final SubLSymbol $kw38$TERM_PREFIX = makeKeyword("TERM-PREFIX");
  public static final SubLSymbol $kw39$INTRO_TEMPLATE = makeKeyword("INTRO-TEMPLATE");
  public static final SubLSymbol $kw40$SOURCE_TYPES = makeKeyword("SOURCE-TYPES");
  public static final SubLSymbol $kw41$SOURCE_MT = makeKeyword("SOURCE-MT");
  public static final SubLSymbol $kw42$QUERY_MT = makeKeyword("QUERY-MT");
  public static final SubLSymbol $kw43$DEFINITIONAL_MT = makeKeyword("DEFINITIONAL-MT");
  public static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str45$18287931_d871_11d9_8eef_0002b3891 = makeString("18287931-d871-11d9-8eef-0002b3891c5a");
  public static final SubLSymbol $sym46$CFASL_INPUT_TEMPLATE_TOPIC = makeSymbol("CFASL-INPUT-TEMPLATE-TOPIC");
  public static final SubLSymbol $sym47$ARG_POSITION_DETAILS = makeSymbol("ARG-POSITION-DETAILS");
  public static final SubLSymbol $sym48$ARG_POSITION_DETAILS_P = makeSymbol("ARG-POSITION-DETAILS-P");
  public static final SubLList $list49 = list(new SubLObject[] {makeSymbol("ARGUMENT-POSITION"), makeSymbol("ORDERING"), makeSymbol("GLOSS"), makeSymbol("INVISIBLE-REPLACEMENT-POSITIONS"), makeSymbol("REPLACEMENT-CONSTRAINTS"), makeSymbol("CANDIDATE-REPLACEMENTS"), makeSymbol("IS-EDITABLE"), makeSymbol("EXPLANATION"), makeSymbol("REQUIRES-VALIDATION"), makeSymbol("UNKNOWN-REPLACEMENT")});
  public static final SubLList $list50 = list(new SubLObject[] {makeKeyword("ARGUMENT-POSITION"), makeKeyword("ORDERING"), makeKeyword("GLOSS"), makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS"), makeKeyword("REPLACEMENT-CONSTRAINTS"), makeKeyword("CANDIDATE-REPLACEMENTS"), makeKeyword("IS-EDITABLE"), makeKeyword("EXPLANATION"), makeKeyword("REQUIRES-VALIDATION"), makeKeyword("UNKNOWN-REPLACEMENT")});
  public static final SubLList $list51 = list(new SubLObject[] {makeSymbol("ARG-POSITION-DETAILS-ARGUMENT-POSITION"), makeSymbol("ARG-POSITION-DETAILS-ORDERING"), makeSymbol("ARG-POSITION-DETAILS-GLOSS"), makeSymbol("ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS"), makeSymbol("ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS"), makeSymbol("ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS"), makeSymbol("ARG-POSITION-DETAILS-IS-EDITABLE"), makeSymbol("ARG-POSITION-DETAILS-EXPLANATION"), makeSymbol("ARG-POSITION-DETAILS-REQUIRES-VALIDATION"), makeSymbol("ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT")});
  public static final SubLList $list52 = list(new SubLObject[] {makeSymbol("_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-ORDERING"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-GLOSS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-EXPLANATION"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION"), makeSymbol("_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT")});
  public static final SubLSymbol $sym53$PRINT_ARG_POSITION_DETAILS = makeSymbol("PRINT-ARG-POSITION-DETAILS");
  public static final SubLSymbol $sym54$ARG_POSITION_DETAILS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARG-POSITION-DETAILS-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym55$ARG_POSITION_DETAILS_ARGUMENT_POSITION = makeSymbol("ARG-POSITION-DETAILS-ARGUMENT-POSITION");
  public static final SubLSymbol $sym56$_CSETF_ARG_POSITION_DETAILS_ARGUMENT_POSITION = makeSymbol("_CSETF-ARG-POSITION-DETAILS-ARGUMENT-POSITION");
  public static final SubLSymbol $sym57$ARG_POSITION_DETAILS_ORDERING = makeSymbol("ARG-POSITION-DETAILS-ORDERING");
  public static final SubLSymbol $sym58$_CSETF_ARG_POSITION_DETAILS_ORDERING = makeSymbol("_CSETF-ARG-POSITION-DETAILS-ORDERING");
  public static final SubLSymbol $sym59$ARG_POSITION_DETAILS_GLOSS = makeSymbol("ARG-POSITION-DETAILS-GLOSS");
  public static final SubLSymbol $sym60$_CSETF_ARG_POSITION_DETAILS_GLOSS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-GLOSS");
  public static final SubLSymbol $sym61$ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS = makeSymbol("ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS");
  public static final SubLSymbol $sym62$_CSETF_ARG_POSITION_DETAILS_INVISIBLE_REPLACEMENT_POSITIONS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-INVISIBLE-REPLACEMENT-POSITIONS");
  public static final SubLSymbol $sym63$ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS = makeSymbol("ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS");
  public static final SubLSymbol $sym64$_CSETF_ARG_POSITION_DETAILS_REPLACEMENT_CONSTRAINTS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-REPLACEMENT-CONSTRAINTS");
  public static final SubLSymbol $sym65$ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS = makeSymbol("ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS");
  public static final SubLSymbol $sym66$_CSETF_ARG_POSITION_DETAILS_CANDIDATE_REPLACEMENTS = makeSymbol("_CSETF-ARG-POSITION-DETAILS-CANDIDATE-REPLACEMENTS");
  public static final SubLSymbol $sym67$ARG_POSITION_DETAILS_IS_EDITABLE = makeSymbol("ARG-POSITION-DETAILS-IS-EDITABLE");
  public static final SubLSymbol $sym68$_CSETF_ARG_POSITION_DETAILS_IS_EDITABLE = makeSymbol("_CSETF-ARG-POSITION-DETAILS-IS-EDITABLE");
  public static final SubLSymbol $sym69$ARG_POSITION_DETAILS_EXPLANATION = makeSymbol("ARG-POSITION-DETAILS-EXPLANATION");
  public static final SubLSymbol $sym70$_CSETF_ARG_POSITION_DETAILS_EXPLANATION = makeSymbol("_CSETF-ARG-POSITION-DETAILS-EXPLANATION");
  public static final SubLSymbol $sym71$ARG_POSITION_DETAILS_REQUIRES_VALIDATION = makeSymbol("ARG-POSITION-DETAILS-REQUIRES-VALIDATION");
  public static final SubLSymbol $sym72$_CSETF_ARG_POSITION_DETAILS_REQUIRES_VALIDATION = makeSymbol("_CSETF-ARG-POSITION-DETAILS-REQUIRES-VALIDATION");
  public static final SubLSymbol $sym73$ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT = makeSymbol("ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT");
  public static final SubLSymbol $sym74$_CSETF_ARG_POSITION_DETAILS_UNKNOWN_REPLACEMENT = makeSymbol("_CSETF-ARG-POSITION-DETAILS-UNKNOWN-REPLACEMENT");
  public static final SubLSymbol $kw75$ARGUMENT_POSITION = makeKeyword("ARGUMENT-POSITION");
  public static final SubLSymbol $kw76$GLOSS = makeKeyword("GLOSS");
  public static final SubLSymbol $kw77$INVISIBLE_REPLACEMENT_POSITIONS = makeKeyword("INVISIBLE-REPLACEMENT-POSITIONS");
  public static final SubLSymbol $kw78$REPLACEMENT_CONSTRAINTS = makeKeyword("REPLACEMENT-CONSTRAINTS");
  public static final SubLSymbol $kw79$CANDIDATE_REPLACEMENTS = makeKeyword("CANDIDATE-REPLACEMENTS");
  public static final SubLSymbol $kw80$IS_EDITABLE = makeKeyword("IS-EDITABLE");
  public static final SubLSymbol $kw81$EXPLANATION = makeKeyword("EXPLANATION");
  public static final SubLSymbol $kw82$REQUIRES_VALIDATION = makeKeyword("REQUIRES-VALIDATION");
  public static final SubLSymbol $kw83$UNKNOWN_REPLACEMENT = makeKeyword("UNKNOWN-REPLACEMENT");
  public static final SubLString $str84$182a9c10_d871_11d9_8eef_0002b3891 = makeString("182a9c10-d871-11d9-8eef-0002b3891c5a");
  public static final SubLSymbol $sym85$CFASL_INPUT_ARG_POSITION_DETAILS = makeSymbol("CFASL-INPUT-ARG-POSITION-DETAILS");
  public static final SubLSymbol $sym86$FORMULA_TEMPLATE = makeSymbol("FORMULA-TEMPLATE");
  public static final SubLSymbol $sym87$FORMULA_TEMPLATE_P = makeSymbol("FORMULA-TEMPLATE-P");
  public static final SubLList $list88 = list(new SubLObject[] {makeSymbol("TOPIC"), makeSymbol("ID"), makeSymbol("FORMULA"), makeSymbol("QUERY-SPECIFICATION"), makeSymbol("ELMT"), makeSymbol("FOCAL-TERM"), makeSymbol("ARGPOS-DETAILS"), makeSymbol("ARGPOS-ORDERING"), makeSymbol("EXAMPLES"), makeSymbol("ENTRY-FORMAT"), makeSymbol("FOLLOW-UPS"), makeSymbol("GLOSS"), makeSymbol("REFSPEC")});
  public static final SubLList $list89 = list(new SubLObject[] {makeKeyword("TOPIC"), makeKeyword("ID"), makeKeyword("FORMULA"), makeKeyword("QUERY-SPECIFICATION"), makeKeyword("ELMT"), makeKeyword("FOCAL-TERM"), makeKeyword("ARGPOS-DETAILS"), makeKeyword("ARGPOS-ORDERING"), makeKeyword("EXAMPLES"), makeKeyword("ENTRY-FORMAT"), makeKeyword("FOLLOW-UPS"), makeKeyword("GLOSS"), makeKeyword("REFSPEC")});
  public static final SubLList $list90 = list(new SubLObject[] {makeSymbol("FORMULA-TEMPLATE-TOPIC"), makeSymbol("FORMULA-TEMPLATE-ID"), makeSymbol("FORMULA-TEMPLATE-FORMULA"), makeSymbol("FORMULA-TEMPLATE-QUERY-SPECIFICATION"), makeSymbol("FORMULA-TEMPLATE-ELMT"), makeSymbol("FORMULA-TEMPLATE-FOCAL-TERM"), makeSymbol("FORMULA-TEMPLATE-ARGPOS-DETAILS"), makeSymbol("FORMULA-TEMPLATE-ARGPOS-ORDERING"), makeSymbol("FORMULA-TEMPLATE-EXAMPLES"), makeSymbol("FORMULA-TEMPLATE-ENTRY-FORMAT"), makeSymbol("FORMULA-TEMPLATE-FOLLOW-UPS"), makeSymbol("FORMULA-TEMPLATE-GLOSS"), makeSymbol("FORMULA-TEMPLATE-REFSPEC")});
  public static final SubLList $list91 = list(new SubLObject[] {makeSymbol("_CSETF-FORMULA-TEMPLATE-TOPIC"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ID"), makeSymbol("_CSETF-FORMULA-TEMPLATE-FORMULA"), makeSymbol("_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ELMT"), makeSymbol("_CSETF-FORMULA-TEMPLATE-FOCAL-TERM"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EXAMPLES"), makeSymbol("_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT"), makeSymbol("_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-GLOSS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-REFSPEC")});
  public static final SubLSymbol $sym92$PRINT_FORMULA_TEMPLATE = makeSymbol("PRINT-FORMULA-TEMPLATE");
  public static final SubLSymbol $sym93$FORMULA_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORMULA-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym94$FORMULA_TEMPLATE_TOPIC = makeSymbol("FORMULA-TEMPLATE-TOPIC");
  public static final SubLSymbol $sym95$_CSETF_FORMULA_TEMPLATE_TOPIC = makeSymbol("_CSETF-FORMULA-TEMPLATE-TOPIC");
  public static final SubLSymbol $sym96$FORMULA_TEMPLATE_ID = makeSymbol("FORMULA-TEMPLATE-ID");
  public static final SubLSymbol $sym97$_CSETF_FORMULA_TEMPLATE_ID = makeSymbol("_CSETF-FORMULA-TEMPLATE-ID");
  public static final SubLSymbol $sym98$FORMULA_TEMPLATE_FORMULA = makeSymbol("FORMULA-TEMPLATE-FORMULA");
  public static final SubLSymbol $sym99$_CSETF_FORMULA_TEMPLATE_FORMULA = makeSymbol("_CSETF-FORMULA-TEMPLATE-FORMULA");
  public static final SubLSymbol $sym100$FORMULA_TEMPLATE_QUERY_SPECIFICATION = makeSymbol("FORMULA-TEMPLATE-QUERY-SPECIFICATION");
  public static final SubLSymbol $sym101$_CSETF_FORMULA_TEMPLATE_QUERY_SPECIFICATION = makeSymbol("_CSETF-FORMULA-TEMPLATE-QUERY-SPECIFICATION");
  public static final SubLSymbol $sym102$FORMULA_TEMPLATE_ELMT = makeSymbol("FORMULA-TEMPLATE-ELMT");
  public static final SubLSymbol $sym103$_CSETF_FORMULA_TEMPLATE_ELMT = makeSymbol("_CSETF-FORMULA-TEMPLATE-ELMT");
  public static final SubLSymbol $sym104$FORMULA_TEMPLATE_FOCAL_TERM = makeSymbol("FORMULA-TEMPLATE-FOCAL-TERM");
  public static final SubLSymbol $sym105$_CSETF_FORMULA_TEMPLATE_FOCAL_TERM = makeSymbol("_CSETF-FORMULA-TEMPLATE-FOCAL-TERM");
  public static final SubLSymbol $sym106$FORMULA_TEMPLATE_ARGPOS_DETAILS = makeSymbol("FORMULA-TEMPLATE-ARGPOS-DETAILS");
  public static final SubLSymbol $sym107$_CSETF_FORMULA_TEMPLATE_ARGPOS_DETAILS = makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-DETAILS");
  public static final SubLSymbol $sym108$FORMULA_TEMPLATE_ARGPOS_ORDERING = makeSymbol("FORMULA-TEMPLATE-ARGPOS-ORDERING");
  public static final SubLSymbol $sym109$_CSETF_FORMULA_TEMPLATE_ARGPOS_ORDERING = makeSymbol("_CSETF-FORMULA-TEMPLATE-ARGPOS-ORDERING");
  public static final SubLSymbol $sym110$FORMULA_TEMPLATE_EXAMPLES = makeSymbol("FORMULA-TEMPLATE-EXAMPLES");
  public static final SubLSymbol $sym111$_CSETF_FORMULA_TEMPLATE_EXAMPLES = makeSymbol("_CSETF-FORMULA-TEMPLATE-EXAMPLES");
  public static final SubLSymbol $sym112$FORMULA_TEMPLATE_ENTRY_FORMAT = makeSymbol("FORMULA-TEMPLATE-ENTRY-FORMAT");
  public static final SubLSymbol $sym113$_CSETF_FORMULA_TEMPLATE_ENTRY_FORMAT = makeSymbol("_CSETF-FORMULA-TEMPLATE-ENTRY-FORMAT");
  public static final SubLSymbol $sym114$FORMULA_TEMPLATE_FOLLOW_UPS = makeSymbol("FORMULA-TEMPLATE-FOLLOW-UPS");
  public static final SubLSymbol $sym115$_CSETF_FORMULA_TEMPLATE_FOLLOW_UPS = makeSymbol("_CSETF-FORMULA-TEMPLATE-FOLLOW-UPS");
  public static final SubLSymbol $sym116$FORMULA_TEMPLATE_GLOSS = makeSymbol("FORMULA-TEMPLATE-GLOSS");
  public static final SubLSymbol $sym117$_CSETF_FORMULA_TEMPLATE_GLOSS = makeSymbol("_CSETF-FORMULA-TEMPLATE-GLOSS");
  public static final SubLSymbol $sym118$FORMULA_TEMPLATE_REFSPEC = makeSymbol("FORMULA-TEMPLATE-REFSPEC");
  public static final SubLSymbol $sym119$_CSETF_FORMULA_TEMPLATE_REFSPEC = makeSymbol("_CSETF-FORMULA-TEMPLATE-REFSPEC");
  public static final SubLSymbol $kw120$ID = makeKeyword("ID");
  public static final SubLSymbol $kw121$FORMULA = makeKeyword("FORMULA");
  public static final SubLSymbol $kw122$QUERY_SPECIFICATION = makeKeyword("QUERY-SPECIFICATION");
  public static final SubLSymbol $kw123$ELMT = makeKeyword("ELMT");
  public static final SubLSymbol $kw124$FOCAL_TERM = makeKeyword("FOCAL-TERM");
  public static final SubLSymbol $kw125$ARGPOS_DETAILS = makeKeyword("ARGPOS-DETAILS");
  public static final SubLSymbol $kw126$ARGPOS_ORDERING = makeKeyword("ARGPOS-ORDERING");
  public static final SubLSymbol $kw127$EXAMPLES = makeKeyword("EXAMPLES");
  public static final SubLSymbol $kw128$ENTRY_FORMAT = makeKeyword("ENTRY-FORMAT");
  public static final SubLSymbol $kw129$FOLLOW_UPS = makeKeyword("FOLLOW-UPS");
  public static final SubLSymbol $kw130$REFSPEC = makeKeyword("REFSPEC");
  public static final SubLString $str131$182b1140_d871_11d9_8eef_0002b3891 = makeString("182b1140-d871-11d9-8eef-0002b3891c5a");
  public static final SubLSymbol $sym132$CFASL_INPUT_FORMULA_TEMPLATE = makeSymbol("CFASL-INPUT-FORMULA-TEMPLATE");
  public static final SubLSymbol $sym133$CLET = makeSymbol("CLET");
  public static final SubLList $list134 = list(list(makeSymbol("*MAKE-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?*"), T));
  public static final SubLSymbol $sym135$PROGN = makeSymbol("PROGN");
  public static final SubLList $list136 = list(list(makeSymbol("NON-EDITABLES")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym137$_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE_ = makeSymbol("*NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE*");
  public static final SubLSymbol $sym138$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list139 = list(makeSymbol("SET-P"));
  public static final SubLList $list140 = list(list(makeSymbol("INSTANCE"), makeSymbol("TEMPLATE-ID"), makeSymbol("TEMPLATE-ELMT"), makeSymbol("QUERY-MT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym141$NON_EDITABLE = makeUninternedSymbol("NON-EDITABLE");
  public static final SubLSymbol $sym142$COMPUTE_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE = makeSymbol("COMPUTE-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
  public static final SubLSymbol $sym143$WITH_KNOWN_NON_EDITABLE_ASSERTIONS_FOR_TEMPLATE_TOPIC_INSTANCE = makeSymbol("WITH-KNOWN-NON-EDITABLE-ASSERTIONS-FOR-TEMPLATE-TOPIC-INSTANCE");
  public static final SubLString $str144$_S_is_not_a_FORMULA_TEMPLATE_P_ = makeString("~S is not a FORMULA-TEMPLATE-P.");
  public static final SubLString $str145$_S_is_not_EL_FORMULA_P_ = makeString("~S is not EL-FORMULA-P.");
  public static final SubLString $str146$_S_is_not_POSSIBLY_MT_P_ = makeString("~S is not POSSIBLY-MT-P.");
  public static final SubLString $str147$bad_formula_template___S__ = makeString("bad formula template: ~S~%");
  public static final SubLSymbol $sym148$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym149$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym150$LISTP = makeSymbol("LISTP");
  public static final SubLString $str151$_TemplateTopic__ = makeString("<TemplateTopic: ");
  public static final SubLString $str152$Parent___S___Topic___S_ = makeString("Parent: ~S : Topic: ~S ");
  public static final SubLString $str153$_named_ = makeString(" named ");
  public static final SubLString $str154$_Term_Prefix__ = makeString(" Term Prefix: ");
  public static final SubLString $str155$___SubTopics__ = makeString(" : SubTopics: ");
  public static final SubLString $str156$___Sources__ = makeString(" : Sources: ");
  public static final SubLString $str157$___Template_Source_Mt__ = makeString(" : Template Source Mt: ");
  public static final SubLString $str158$___Template_Query_Mt__ = makeString(" : Template Query Mt: ");
  public static final SubLString $str159$___Template_Definitional_Mt__ = makeString(" : Template Definitional Mt: ");
  public static final SubLString $str160$___Templates_ = makeString(" : Templates:");
  public static final SubLString $str161$____introductory_template__ = makeString(" (= introductory template) ");
  public static final SubLString $str162$_ = makeString(">");
  public static final SubLList $list163 = list(list(ONE_INTEGER, makeString("Adds <templateTopicRevision> to <templateTopic>")), list(ZERO_INTEGER, makeString("Initial version")));
  public static final SubLString $str164$templateTopic = makeString("templateTopic");
  public static final SubLString $str165$templateTopicRevision = makeString("templateTopicRevision");
  public static final SubLString $str166$topic = makeString("topic");
  public static final SubLString $str167$superTopic = makeString("superTopic");
  public static final SubLString $str168$title = makeString("title");
  public static final SubLString $str169$termPrefix = makeString("termPrefix");
  public static final SubLString $str170$introductoryTemplate = makeString("introductoryTemplate");
  public static final SubLString $str171$subTopics = makeString("subTopics");
  public static final SubLString $str172$subTopic = makeString("subTopic");
  public static final SubLString $str173$sourcesOfTopic = makeString("sourcesOfTopic");
  public static final SubLString $str174$sourceOfTopic = makeString("sourceOfTopic");
  public static final SubLString $str175$templateSourceMt = makeString("templateSourceMt");
  public static final SubLString $str176$templateQueryMt = makeString("templateQueryMt");
  public static final SubLString $str177$templateDefinitionalMt = makeString("templateDefinitionalMt");
  public static final SubLString $str178$formulaTemplates = makeString("formulaTemplates");
  public static final SubLSymbol $sym179$CFASL_OUTPUT_OBJECT_TEMPLATE_TOPIC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TEMPLATE-TOPIC-METHOD");
  public static final SubLSymbol $sym180$VALID_FORMULA_TEMPLATE_P = makeSymbol("VALID-FORMULA-TEMPLATE-P");
  public static final SubLString $str181$CFASL_INPUT_TEMPLATE_TOPIC_has_lo = makeString("CFASL-INPUT-TEMPLATE-TOPIC has loaded a subtopic for ~A which claims to belong to ~A");
  public static final SubLObject $const182$SingleAssertionEntry = constant_handles.reader_make_constant_shell(makeString("SingleAssertionEntry"));
  public static final SubLObject $const183$MultipleAssertionEntry = constant_handles.reader_make_constant_shell(makeString("MultipleAssertionEntry"));
  public static final SubLString $str184$_Formula_Template__ = makeString("<Formula Template: ");
  public static final SubLString $str185$_A_ = makeString("~A ");
  public static final SubLString $str186$of_topic__A__ = makeString("of topic ~A~%");
  public static final SubLString $str187$_formula__A_in__A__ = makeString(" formula ~A in ~A~%");
  public static final SubLString $str188$_query_spec__A_in__A__ = makeString(" query-spec ~A in ~A~%");
  public static final SubLString $str189$_focal_term__A___A___ = makeString(" focal term ~A (~A)~%");
  public static final SubLString $str190$_focal_term_occurrences__A___A___ = makeString(" focal term occurrences ~A (~A)~%");
  public static final SubLString $str191$_examples___A__ = makeString(" examples: ~A~%");
  public static final SubLString $str192$_follow_ups___A__ = makeString(" follow-ups: ~A~%");
  public static final SubLString $str193$_template_gloss___A__ = makeString(" template gloss: ~A~%");
  public static final SubLString $str194$_reformulation_specification___A_ = makeString(" reformulation specification: ~A~%");
  public static final SubLString $str195$_argpos_details__ = makeString(" argpos-details: ");
  public static final SubLString $str196$_ = makeString(" ");
  public static final SubLSymbol $sym197$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym198$ISA_MT_ = makeSymbol("ISA-MT?");
  public static final SubLSymbol $sym199$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym200$NEW_CYCL_QUERY_SPECIFICATION_P = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-P");
  public static final SubLString $str201$formulaTemplate = makeString("formulaTemplate");
  public static final SubLString $str202$id = makeString("id");
  public static final SubLString $str203$formula = makeString("formula");
  public static final SubLString $str204$elmt = makeString("elmt");
  public static final SubLString $str205$focalTerm = makeString("focalTerm");
  public static final SubLString $str206$argPositions = makeString("argPositions");
  public static final SubLString $str207$singleEntry = makeString("singleEntry");
  public static final SubLSymbol $kw208$ATOMIC = makeKeyword("ATOMIC");
  public static final SubLString $str209$multipleEntry = makeString("multipleEntry");
  public static final SubLString $str210$usageExamples = makeString("usageExamples");
  public static final SubLString $str211$example = makeString("example");
  public static final SubLString $str212$glossForTemplate = makeString("glossForTemplate");
  public static final SubLString $str213$followUps = makeString("followUps");
  public static final SubLString $str214$followUp = makeString("followUp");
  public static final SubLList $list215 = list(makeSymbol("TERM"), makeSymbol("CONNECTIVE"), makeSymbol("LOAD-MT"));
  public static final SubLString $str216$templateId = makeString("templateId");
  public static final SubLString $str217$connective = makeString("connective");
  public static final SubLString $str218$loadMt = makeString("loadMt");
  public static final SubLString $str219$reformulationSpecification = makeString("reformulationSpecification");
  public static final SubLString $str220$argumentPositionDetails = makeString("argumentPositionDetails");
  public static final SubLString $str221$__xml_version__1_0__encoding__US_ = makeString("<?xml version=\"1.0\" encoding=\"US-ASCII\" standalone=\"no\"?>");
  public static final SubLString $str222$__DOCTYPE_formulaTemplate_SYSTEM_ = makeString("<!DOCTYPE formulaTemplate SYSTEM \"http://www.opencyc.org/xml/formulaTemplate.dtd\">");
  public static final SubLSymbol $sym223$CFASL_OUTPUT_OBJECT_FORMULA_TEMPLATE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FORMULA-TEMPLATE-METHOD");
  public static final SubLString $str224$__ArgPos_Details__ = makeString("#<ArgPos-Details: ");
  public static final SubLString $str225$_for_position__A_ = makeString(" for position ~A ");
  public static final SubLString $str226$__ordering_slot__D_ = makeString(" (ordering slot ~D)");
  public static final SubLString $str227$__no_ordering_info_ = makeString(" (no ordering info)");
  public static final SubLString $str228$_READ_ONLY = makeString(" READ-ONLY");
  public static final SubLString $str229$_gloss___A__ = makeString(" gloss: ~A~%");
  public static final SubLString $str230$_replacementInvisible___A__ = makeString(" replacementInvisible: ~A~%");
  public static final SubLString $str231$_candidate_replacements___A__ = makeString(" candidate replacements: ~A~%");
  public static final SubLString $str232$_constraints___A__ = makeString(" constraints: ~A~%");
  public static final SubLString $str233$__requires_validation____ = makeString(" [requires validation] ~%");
  public static final SubLString $str234$_explanation___A__ = makeString(" explanation: ~A~%");
  public static final SubLString $str235$_term_for_unknown___A__ = makeString(" term for unknown: ~A~%");
  public static final SubLString $str236$argumentPositionDetail = makeString("argumentPositionDetail");
  public static final SubLString $str237$ordering = makeString("ordering");
  public static final SubLString $str238$glossText = makeString("glossText");
  public static final SubLString $str239$candidateReplacementsForPosition = makeString("candidateReplacementsForPosition");
  public static final SubLString $str240$candidateReplacementForPosition = makeString("candidateReplacementForPosition");
  public static final SubLString $str241$templateReplacementsInvisibleForP = makeString("templateReplacementsInvisibleForPosition");
  public static final SubLString $str242$isEditable = makeString("isEditable");
  public static final SubLString $str243$validationRequired = makeString("validationRequired");
  public static final SubLString $str244$explanation = makeString("explanation");
  public static final SubLString $str245$unknownTermForTemplatePosition = makeString("unknownTermForTemplatePosition");
  public static final SubLString $str246$constraintsOnReplacement = makeString("constraintsOnReplacement");
  public static final SubLString $str247$constraintOnReplacement = makeString("constraintOnReplacement");
  public static final SubLSymbol $sym248$CFASL_OUTPUT_OBJECT_ARG_POSITION_DETAILS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-ARG-POSITION-DETAILS-METHOD");
  public static final SubLString $str249$argPosition = makeString("argPosition");
  public static final SubLString $str250$position = makeString("position");
  public static final SubLSymbol $sym251$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLString $str252$Can_t_load_a_formula_template_wit = makeString("Can't load a formula template without a FORT id: ~S");
  public static final SubLObject $const253$formulaTemplateHasArgumentPositio = constant_handles.reader_make_constant_shell(makeString("formulaTemplateHasArgumentPositionInformation"));
  public static final SubLList $list254 = list(makeSymbol("GLOSS-TEXT"), makeSymbol("ARGPOS"), makeSymbol("ORDERING"));
  public static final SubLList $list255 = list(makeSymbol("EXPLANATION-TEXT"), makeSymbol("ARGPOS"));
  public static final SubLList $list256 = list(makeSymbol("ARGPOS"), makeSymbol("REPLACE-CONSTRAINTS"));
  public static final SubLList $list257 = list(makeSymbol("ARGPOS"), makeSymbol("CANDIDATES"));
  public static final SubLList $list258 = list(makeSymbol("ARGPOS"), makeSymbol("THING"));
  public static final SubLSymbol $sym259$ORDERED_BY_ARGUMENT_POSITION = makeSymbol("ORDERED-BY-ARGUMENT-POSITION");
  public static final SubLSymbol $sym260$_ = makeSymbol("<");
  public static final SubLSymbol $sym261$POSSIBLY_FO_REPRESENTED_TERM_P = makeSymbol("POSSIBLY-FO-REPRESENTED-TERM-P");
  public static final SubLString $str262$Dwimming_MT_for__A_to__A____your_ = makeString("Dwimming MT for ~A to ~A -- your own fault.");
  public static final SubLList $list263 = list(TWO_INTEGER);
  public static final SubLObject $const264$reformulateTemplateViaSpecificati = constant_handles.reader_make_constant_shell(makeString("reformulateTemplateViaSpecification"));
  public static final SubLObject $const265$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell(makeString("TemplateFromTestQueryFn"));
  public static final SubLObject $const266$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate"));
  public static final SubLObject $const267$formulaForFormulaTemplate = constant_handles.reader_make_constant_shell(makeString("formulaForFormulaTemplate"));
  public static final SubLObject $const268$assertMtForFormulaTemplate = constant_handles.reader_make_constant_shell(makeString("assertMtForFormulaTemplate"));
  public static final SubLObject $const269$formulaTemplateFollowUp = constant_handles.reader_make_constant_shell(makeString("formulaTemplateFollowUp"));
  public static final SubLSymbol $sym270$COMMUTATIVE_RELATION_ = makeSymbol("COMMUTATIVE-RELATION?");
  public static final SubLSymbol $sym271$SECOND = makeSymbol("SECOND");
  public static final SubLList $list272 = list(makeSymbol("FOLLOW-UP"), makeSymbol("CONNECTIVE"));
  public static final SubLObject $const273$formulaTemplateGloss = constant_handles.reader_make_constant_shell(makeString("formulaTemplateGloss"));
  public static final SubLSymbol $kw274$TRUE = makeKeyword("TRUE");
  public static final SubLList $list275 = list(constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell(makeString("Now")), constant_handles.reader_make_constant_shell(makeString("CalendarSecond")));
  public static final SubLObject $const276$AnytimePSC = constant_handles.reader_make_constant_shell(makeString("AnytimePSC"));
  public static final SubLList $list277 = list(FOUR_INTEGER, THREE_INTEGER, FIVE_INTEGER);
  public static final SubLObject $const278$glossForFormulaTemplate = constant_handles.reader_make_constant_shell(makeString("glossForFormulaTemplate"));
  public static final SubLList $list279 = list(FOUR_INTEGER, THREE_INTEGER);
  public static final SubLObject $const280$formulaTemplateArgExplanation = constant_handles.reader_make_constant_shell(makeString("formulaTemplateArgExplanation"));
  public static final SubLObject $const281$formulaTemplateExample = constant_handles.reader_make_constant_shell(makeString("formulaTemplateExample"));
  public static final SubLSymbol $sym282$GET_VARIABLE = makeSymbol("GET-VARIABLE");
  public static final SubLObject $const283$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const284$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));
  public static final SubLSymbol $kw285$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw286$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
  public static final SubLSymbol $kw287$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLSymbol $kw288$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw289$TEMPLATE = makeKeyword("TEMPLATE");
  public static final SubLSymbol $kw290$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw291$HL = makeKeyword("HL");
  public static final SubLObject $const292$focalTermPositionForFormulaTempla = constant_handles.reader_make_constant_shell(makeString("focalTermPositionForFormulaTemplate"));
  public static final SubLObject $const293$assertionFormatForFormulaTemplate = constant_handles.reader_make_constant_shell(makeString("assertionFormatForFormulaTemplate"));
  public static final SubLObject $const294$templateReplacementsInvisibleForP = constant_handles.reader_make_constant_shell(makeString("templateReplacementsInvisibleForPosition"));
  public static final SubLList $list295 = list(TWO_INTEGER, THREE_INTEGER);
  public static final SubLObject $const296$constraintOnReplacement = constant_handles.reader_make_constant_shell(makeString("constraintOnReplacement"));
  public static final SubLList $list297 = list(makeSymbol("POSITION"), makeSymbol("CONSTRAINT"));
  public static final SubLObject $const298$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLSymbol $sym299$_X = makeSymbol("?X");
  public static final SubLObject $const300$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const301$unknownTermForTemplatePosition = constant_handles.reader_make_constant_shell(makeString("unknownTermForTemplatePosition"));
  public static final SubLObject $const302$candidateReplacementForPosition = constant_handles.reader_make_constant_shell(makeString("candidateReplacementForPosition"));
  public static final SubLList $list303 = list(makeSymbol("POSITION"), makeSymbol("CANDIDATE"));
  public static final SubLObject $const304$positionInFormulaTemplateIsReplac = constant_handles.reader_make_constant_shell(makeString("positionInFormulaTemplateIsReplaceable"));
  public static final SubLObject $const305$validationRequiredOnTemplatePosit = constant_handles.reader_make_constant_shell(makeString("validationRequiredOnTemplatePosition"));
  public static final SubLObject $const306$InducedFormulaTemplateTopicType = constant_handles.reader_make_constant_shell(makeString("InducedFormulaTemplateTopicType"));
  public static final SubLSymbol $sym307$DICTIONARY_P = makeSymbol("DICTIONARY-P");
  public static final SubLSymbol $sym308$HIGHER_PRIORITY_ = makeSymbol("HIGHER-PRIORITY?");
  public static final SubLSymbol $sym309$FORT_SORT_PRED = makeSymbol("FORT-SORT-PRED");
  public static final SubLList $list310 = list(makeSymbol("HIGHER"), makeSymbol("LOWER"));
  public static final SubLString $str311$higherPriorityTemplateTypeForTopi = makeString("higherPriorityTemplateTypeForTopicType");
  public static final SubLList $list312 = list(makeSymbol("?HIGHER"), makeSymbol("?LOWER"));
  public static final SubLSymbol $sym313$_HIGHER = makeSymbol("?HIGHER");
  public static final SubLSymbol $sym314$_LOWER = makeSymbol("?LOWER");
  public static final SubLList $list315 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER);
  public static final SubLObject $const316$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLList $list317 = list(constant_handles.reader_make_constant_shell(makeString("higherPriorityTemplateType")), makeSymbol("?HIGHER"), makeSymbol("?LOWER"));
  public static final SubLList $list318 = list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?HIGHER"), makeSymbol("?LOWER"));
  public static final SubLObject $const319$formulaTemplateTypeHasTopicType = constant_handles.reader_make_constant_shell(makeString("formulaTemplateTypeHasTopicType"));
  public static final SubLList $list320 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);
  public static final SubLObject $const321$higherPriorityTemplateForType = constant_handles.reader_make_constant_shell(makeString("higherPriorityTemplateForType"));
  public static final SubLSymbol $sym322$STABLE_TEMPLATE_ID_COMPARE = makeSymbol("STABLE-TEMPLATE-ID-COMPARE");
  public static final SubLSymbol $sym323$WARN = makeSymbol("WARN");
  public static final SubLSymbol $sym324$ERROR = makeSymbol("ERROR");
  public static final SubLString $str325$Invalid_formula_template__A_in_to = makeString("Invalid formula template ~A in topic ~A: template topic query mt ~A cannot see formula template mt ~A");
  public static final SubLString $str326$FactivoreTab = makeString("FactivoreTab");
  public static final SubLObject $const327$FormulaTemplateTopicType = constant_handles.reader_make_constant_shell(makeString("FormulaTemplateTopicType"));
  public static final SubLObject $const328$FirstOrderCollection = constant_handles.reader_make_constant_shell(makeString("FirstOrderCollection"));
  public static final SubLSymbol $sym329$_TEMPLATE = makeSymbol("?TEMPLATE");
  public static final SubLObject $const330$formulaTemplateHasType = constant_handles.reader_make_constant_shell(makeString("formulaTemplateHasType"));
  public static final SubLObject $const331$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym332$_ = makeSymbol(">");
  public static final SubLSymbol $sym333$COUNT_ASSERTED_FORMULA_TEMPLATE_IDS_FOR_TYPE = makeSymbol("COUNT-ASSERTED-FORMULA-TEMPLATE-IDS-FOR-TYPE");
  public static final SubLSymbol $kw334$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list335 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);
  public static final SubLSymbol $sym336$_SUBTOPIC = makeSymbol("?SUBTOPIC");
  public static final SubLSymbol $kw337$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw338$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $sym339$_MT = makeSymbol("?MT");
  public static final SubLObject $const340$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));
  public static final SubLList $list341 = list(makeSymbol("?VOCABULARY-MT"));
  public static final SubLList $list342 = list(list(constant_handles.reader_make_constant_shell(makeString("genlMt-Vocabulary")), makeSymbol("?MT"), makeSymbol("?VOCABULARY-MT")));
  public static final SubLObject $const343$DataForNLMt = constant_handles.reader_make_constant_shell(makeString("DataForNLMt"));
  public static final SubLSymbol $sym344$FORT_OR_NAUT_P = makeSymbol("FORT-OR-NAUT-P");
  public static final SubLObject $const345$sourcesForTopic = constant_handles.reader_make_constant_shell(makeString("sourcesForTopic"));
  public static final SubLObject $const346$focalTermIntroduction = constant_handles.reader_make_constant_shell(makeString("focalTermIntroduction"));
  public static final SubLObject $const347$titleForFormulaTemplateType_Strin = constant_handles.reader_make_constant_shell(makeString("titleForFormulaTemplateType-String"));
  public static final SubLObject $const348$templateTopicPrefix = constant_handles.reader_make_constant_shell(makeString("templateTopicPrefix"));
  public static final SubLObject $const349$queryMtForTopicAssertions = constant_handles.reader_make_constant_shell(makeString("queryMtForTopicAssertions"));
  public static final SubLObject $const350$definitionalMtForTopicAssertions = constant_handles.reader_make_constant_shell(makeString("definitionalMtForTopicAssertions"));
  public static final SubLSymbol $sym351$SET_P = makeSymbol("SET-P");
  public static final SubLList $list352 = list(list(ONE_INTEGER, makeString("Adds <templateTopicAssertionsRevision> to <knownAssertionsForTemplateTopic>\n          Adds <knownAssertionSUIDs> to <knownAssertion>\n          Adds <assertion-id> to <knownAssertionSUIDs>\n          Adds <bookkeeping-info> to <knownAssertion>\n          Adds <date> to <bookkeeping-info>\n          Adds <time> to <bookkeeping-info>\n          Adds <knownAssertionEvaluations> to <knownAssertion>\n          Adds <knownAssertionEvaluation> to <knownAssertionEvaluations>\n          Adds <evaluator> to <knownAssertionEvaluation>\n          Adds <judgment> to <knownAssertionEvaluation>")), list(ZERO_INTEGER, makeString("Initial version")));
  public static final SubLString $str353$knownAssertionsForTemplateTopic = makeString("knownAssertionsForTemplateTopic");
  public static final SubLString $str354$queryELMt = makeString("queryELMt");
  public static final SubLString $str355$templateInstance = makeString("templateInstance");
  public static final SubLString $str356$templateTopicAssertionsRevision = makeString("templateTopicAssertionsRevision");
  public static final SubLString $str357$knownAssertionsForTemplateSubTopi = makeString("knownAssertionsForTemplateSubTopics");
  public static final SubLList $list358 = list(makeSymbol("SUBTOPIC-ID"), makeSymbol("TEMPLATE-RESULT-SETS"));
  public static final SubLString $str359$knownAssertionsForTemplateSubTopi = makeString("knownAssertionsForTemplateSubTopic");
  public static final SubLString $str360$knownAssertionsForFormulaTemplate = makeString("knownAssertionsForFormulaTemplates");
  public static final SubLList $list361 = list(makeSymbol("TEMPLATE-ID"), makeSymbol("ASSERTIONS"));
  public static final SubLString $str362$knownAssertionsForFormulaTemplate = makeString("knownAssertionsForFormulaTemplate");
  public static final SubLString $str363$assertionsMatchTemplate = makeString("assertionsMatchTemplate");
  public static final SubLString $str364$knownAssertions = makeString("knownAssertions");
  public static final SubLString $str365$Problem_serializing_assertions_fo = makeString("Problem serializing assertions for ");
  public static final SubLSymbol $sym366$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");
  public static final SubLString $str367$Invalid_return_object_ = makeString("Invalid return object ");
  public static final SubLString $str368$_in_assertion_list = makeString(" in assertion list");
  public static final SubLString $str369$knownAssertion = makeString("knownAssertion");
  public static final SubLString $str370$deducedAssertion = makeString("deducedAssertion");
  public static final SubLString $str371$knownAssertionSUIDs = makeString("knownAssertionSUIDs");
  public static final SubLString $str372$knownAssertionEvaluations = makeString("knownAssertionEvaluations");
  public static final SubLList $list373 = list(makeSymbol("EVALUATION"), makeSymbol("EVALUATOR"));
  public static final SubLString $str374$knownAssertionEvaluation = makeString("knownAssertionEvaluation");
  public static final SubLString $str375$evaluator = makeString("evaluator");
  public static final SubLString $str376$judgment = makeString("judgment");
  public static final SubLString $str377$evaluationOfAssertionByOn = makeString("evaluationOfAssertionByOn");
  public static final SubLString $str378$evaluationOfAssertionOfByOn = makeString("evaluationOfAssertionOfByOn");
  public static final SubLList $list379 = list(makeSymbol("?EVAL"), makeSymbol("?BY"));
  public static final SubLSymbol $sym380$_EVAL = makeSymbol("?EVAL");
  public static final SubLList $list381 = list(makeSymbol("?BY"), makeSymbol("??ON"));
  public static final SubLList $list382 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));
  public static final SubLSymbol $sym383$_JUDGMENT = makeSymbol("?JUDGMENT");
  public static final SubLObject $const384$evaluationOutputSentences = constant_handles.reader_make_constant_shell(makeString("evaluationOutputSentences"));
  public static final SubLList $list385 = list(list(makeSymbol("?JUDGMENT"), makeSymbol("?SENTENCE")));
  public static final SubLString $str386$knownAssertionELMt = makeString("knownAssertionELMt");
  public static final SubLString $str387$knownAssertionCW = makeString("knownAssertionCW");
  public static final SubLSymbol $sym388$MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK = makeSymbol("MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK");
  public static final SubLSymbol $kw389$PCW = makeKeyword("PCW");
  public static final SubLObject $const390$contextOfPCW = constant_handles.reader_make_constant_shell(makeString("contextOfPCW"));
  public static final SubLSymbol $sym391$_MAP_ELMT_TO_PUBLISHED_CONCEPTUAL_WORK_CACHING_STATE_ = makeSymbol("*MAP-ELMT-TO-PUBLISHED-CONCEPTUAL-WORK-CACHING-STATE*");
  public static final SubLList $list392 = list(new SubLObject[] {makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"), makeSymbol("?F"), makeSymbol("?G"), makeSymbol("?H"), makeSymbol("?J"), makeSymbol("?K"), makeSymbol("?L"), makeSymbol("?M"), makeSymbol("?N"), makeSymbol("?O"), makeSymbol("?P"), makeSymbol("?Q"), makeSymbol("?R"), makeSymbol("?S"), makeSymbol("?T"), makeSymbol("?U"), makeSymbol("?V"), makeSymbol("?W"), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z")});
  public static final SubLSymbol $sym393$_POLY_ELMT = makeSymbol("?POLY-ELMT");
  public static final SubLObject $const394$ist_Intermediate = constant_handles.reader_make_constant_shell(makeString("ist-Intermediate"));
  public static final SubLObject $const395$MtUnionFn = constant_handles.reader_make_constant_shell(makeString("MtUnionFn"));
  public static final SubLObject $const396$RKFInteractionContextMicrotheory = constant_handles.reader_make_constant_shell(makeString("RKFInteractionContextMicrotheory"));
  public static final SubLSymbol $sym397$__REFSPEC = makeSymbol("??REFSPEC");
  public static final SubLSymbol $sym398$__ASSERTION = makeSymbol("??ASSERTION");
  public static final SubLSymbol $kw399$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
  public static final SubLSymbol $kw400$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw401$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLFloat $float402$1_0 = makeDouble(1.0);
  public static final SubLSymbol $kw403$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLSymbol $kw404$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw405$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $sym406$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const407$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLList $list408 = cons(makeSymbol("VARIABLE"), makeSymbol("TERM"));
  public static final SubLSymbol $sym409$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");
  public static final SubLSymbol $sym410$EL_TERM_P = makeSymbol("EL-TERM-P");
  public static final SubLSymbol $sym411$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $kw412$POLY_CANONICALIZED = makeKeyword("POLY-CANONICALIZED");
  public static final SubLSymbol $sym413$FTEMPLATE_POLYCANONICALIZED_ASSERTION_P = makeSymbol("FTEMPLATE-POLYCANONICALIZED-ASSERTION-P");
  public static final SubLObject $const414$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLObject $const415$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLList $list416 = list(makeSymbol("IST-PART"), makeSymbol("MT-PART"), makeSymbol("FORMULA-PART"));
  public static final SubLSymbol $sym417$_FET_ASSERTION_VAR_524 = makeSymbol("?FET-ASSERTION-VAR-524");
  public static final SubLList $list418 = list(makeSymbol("QUANTIFIER"), makeSymbol("VARIABLE"), makeSymbol("CLAUSES"));
  public static final SubLObject $const419$assertionSentence = constant_handles.reader_make_constant_shell(makeString("assertionSentence"));
  public static final SubLObject $const420$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));
  public static final SubLObject $const421$assertionProducedByReformulation = constant_handles.reader_make_constant_shell(makeString("assertionProducedByReformulation"));
  public static final SubLList $list422 = list(list(constant_handles.reader_make_constant_shell(makeString("SomeExampleFn")), constant_handles.reader_make_constant_shell(makeString("TimeInterval"))));
  public static final SubLObject $const423$SpecsFn = constant_handles.reader_make_constant_shell(makeString("SpecsFn"));
  public static final SubLObject $const424$SomeExampleFn = constant_handles.reader_make_constant_shell(makeString("SomeExampleFn"));
  public static final SubLObject $const425$SomeExampleSpecFn = constant_handles.reader_make_constant_shell(makeString("SomeExampleSpecFn"));
  public static final SubLObject $const426$defnIff = constant_handles.reader_make_constant_shell(makeString("defnIff"));
  public static final SubLObject $const427$defnSufficient = constant_handles.reader_make_constant_shell(makeString("defnSufficient"));
  public static final SubLSymbol $kw428$LEXICAL_MT = makeKeyword("LEXICAL-MT");
  public static final SubLList $list429 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("LEXICAL-MT"), constant_handles.reader_make_constant_shell(makeString("TemporaryLexicalMicrotheory")));
  public static final SubLObject $const430$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

  //// Initializers

  public void declareFunctions() {
    declare_formula_templates_file();
  }

  public void initializeVariables() {
    init_formula_templates_file();
  }

  public void runTopLevelForms() {
    setup_formula_templates_file();
  }

}
