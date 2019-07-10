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

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.disjoint_with;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.equals;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.gt_vars;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.morphology;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.pattern_match;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_identifier;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.unicode_strings;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;
//dm import com.cyc.cycjava_1.cycl.web_utilities;
//dm import com.cyc.cycjava_1.cycl.wff;

public  final class evaluation_defns extends SubLTranslatedFile {

  //// Constructor

  private evaluation_defns() {}
  public static final SubLFile me = new evaluation_defns();
  public static final String myName = "com.cyc.cycjava_1.cycl.evaluation_defns";

  //// Definitions

  @SubL(source = "cycl/evaluation-defns.lisp", position = 1255) 
  private static SubLSymbol $cycl_functions_used_as_evaluation_defns$ = null;

  /** #$evaluationDefn for #$different */
  @SubL(source = "cycl/evaluation-defns.lisp", position = 2118) 
  public static final SubLObject cyc_different(SubLObject args) {
    {
      SubLObject result = equals.differentP(args, $kw6$UNKNOWN);
      if ((result == $kw6$UNKNOWN)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30339");
      }
      return result;
    }
  }

  public static final class $cyc_different$UnaryFunction extends UnaryFunction {
    public $cyc_different$UnaryFunction() { super(extractFunctionNamed("CYC-DIFFERENT")); }
    public SubLObject processItem(SubLObject arg1) { return cyc_different(arg1); }
  }

  /** Formulas longer than this cause more trouble than they're worth.
See, e.g. bug 18429.
@todo - Move to more general file if other cases are discovered. */
  @SubL(source = "cycl/evaluation-defns.lisp", position = 12823) 
  private static SubLSymbol $max_supported_formula_arity$ = null;

  /** Determines whether #$MakeFormulaFn, #$SubstituteFormulaArgFn and #$SubstituteFormulaFn take and return explicitly quoted formula */
  @SubL(source = "cycl/evaluation-defns.lisp", position = 31949) 
  private static SubLSymbol $bug_18769_switchP$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 36737) 
  private static SubLSymbol $word_strings_fn$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 37041) 
  private static SubLSymbol $word_sequence_fn$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 52127) 
  private static SubLSymbol $cyc_ordering_relation$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 59361) 
  private static SubLSymbol $term_to_isg_table_lock$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 59526) 
  private static SubLSymbol $term_to_isg_table$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 60077) 
  private static SubLSymbol $term_to_isg_wXstart_table_lock$ = null;

  @SubL(source = "cycl/evaluation-defns.lisp", position = 60255) 
  private static SubLSymbol $term_to_isg_wXstart_table$ = null;

  public static final SubLObject declare_evaluation_defns_file() {
    //declareFunction(myName, "evaluatable_predicate_count", "EVALUATABLE-PREDICATE-COUNT", 0, 0, false);
    //declareFunction(myName, "cyc_true_subl", "CYC-TRUE-SUBL", 1, 0, false);
    declareFunction(myName, "cyc_different", "CYC-DIFFERENT", 1, 0, false); new $cyc_different$UnaryFunction();
    //declareFunction(myName, "cyc_different_symbols", "CYC-DIFFERENT-SYMBOLS", 1, 0, false);
    //declareFunction(myName, "cyc_substring_predicate", "CYC-SUBSTRING-PREDICATE", 2, 0, false);
    //declareFunction(myName, "cyc_substring_case_insensitive_predicate", "CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE", 2, 0, false);
    //declareFunction(myName, "cyc_substring_predicate_internal", "CYC-SUBSTRING-PREDICATE-INTERNAL", 3, 0, false);
    //declareFunction(myName, "cyc_prefix_substring", "CYC-PREFIX-SUBSTRING", 2, 0, false);
    //declareFunction(myName, "cyc_suffix_substring", "CYC-SUFFIX-SUBSTRING", 2, 0, false);
    //declareFunction(myName, "cyc_subword_predicate", "CYC-SUBWORD-PREDICATE", 2, 0, false);
    //declareFunction(myName, "cyc_find_constant", "CYC-FIND-CONSTANT", 1, 0, false);
    //declareFunction(myName, "evaluatable_function_count", "EVALUATABLE-FUNCTION-COUNT", 0, 0, false);
    //declareFunction(myName, "cyc_evaluate_subl", "CYC-EVALUATE-SUBL", 1, 0, false);
    //declareFunction(myName, "cyc_string_upcase", "CYC-STRING-UPCASE", 1, 0, false);
    //declareFunction(myName, "string_upcase_defn", "STRING-UPCASE-DEFN", 1, 0, false);
    //declareFunction(myName, "cyc_string_downcase", "CYC-STRING-DOWNCASE", 1, 0, false);
    //declareFunction(myName, "cyc_substring", "CYC-SUBSTRING", 3, 0, false);
    //declareFunction(myName, "cyc_string_concat", "CYC-STRING-CONCAT", 1, 0, false);
    //declareFunction(myName, "cyc_strings_to_phrase", "CYC-STRINGS-TO-PHRASE", 1, 0, false);
    //declareFunction(myName, "cyc_pre_remove", "CYC-PRE-REMOVE", 2, 0, false);
    //declareFunction(myName, "cyc_replace_substring", "CYC-REPLACE-SUBSTRING", 3, 0, false);
    //declareFunction(myName, "unicode_naut_or_ascii_string_p", "UNICODE-NAUT-OR-ASCII-STRING-P", 1, 0, false);
    //declareFunction(myName, "unicode_naut_or_string_to_unicode_vector", "UNICODE-NAUT-OR-STRING-TO-UNICODE-VECTOR", 1, 0, false);
    //declareFunction(myName, "cyc_remove_substring", "CYC-REMOVE-SUBSTRING", 2, 0, false);
    //declareFunction(myName, "cyc_post_remove", "CYC-POST-REMOVE", 2, 0, false);
    //declareFunction(myName, "cyc_trim_whitespace", "CYC-TRIM-WHITESPACE", 1, 0, false);
    //declareFunction(myName, "cyc_string_search", "CYC-STRING-SEARCH", 2, 0, false);
    //declareFunction(myName, "cyc_length", "CYC-LENGTH", 1, 0, false);
    //declareFunction(myName, "cyc_string_to_integer", "CYC-STRING-TO-INTEGER", 1, 0, false);
    //declareFunction(myName, "cyc_integer_to_string", "CYC-INTEGER-TO-STRING", 1, 0, false);
    //declareFunction(myName, "cyc_string_to_real_number", "CYC-STRING-TO-REAL-NUMBER", 1, 0, false);
    //declareFunction(myName, "cyc_real_number_to_string", "CYC-REAL-NUMBER-TO-STRING", 1, 0, false);
    //declareFunction(myName, "max_supported_formula_arity", "MAX-SUPPORTED-FORMULA-ARITY", 0, 0, false);
    //declareFunction(myName, "cyc_string_tokenize", "CYC-STRING-TOKENIZE", 2, 0, false);
    //declareFunction(myName, "cyc_http_url_encode", "CYC-HTTP-URL-ENCODE", 1, 0, false);
    //declareFunction(myName, "cyc_html_image", "CYC-HTML-IMAGE", 2, 0, false);
    //declareFunction(myName, "html_image_plist", "HTML-IMAGE-PLIST", 1, 0, false);
    //declareFunction(myName, "cyc_html_table_data", "CYC-HTML-TABLE-DATA", 2, 0, false);
    //declareFunction(myName, "cyc_html_table_data_variable_arity", "CYC-HTML-TABLE-DATA-VARIABLE-ARITY", 1, 0, false);
    //declareFunction(myName, "html_table_data_plist", "HTML-TABLE-DATA-PLIST", 1, 0, false);
    //declareFunction(myName, "cyc_html_table_row", "CYC-HTML-TABLE-ROW", 2, 0, false);
    //declareFunction(myName, "cyc_html_table_row_variable_arity", "CYC-HTML-TABLE-ROW-VARIABLE-ARITY", 1, 0, false);
    //declareFunction(myName, "html_table_row_plist", "HTML-TABLE-ROW-PLIST", 1, 0, false);
    //declareFunction(myName, "cyc_html_table", "CYC-HTML-TABLE", 2, 0, false);
    //declareFunction(myName, "cyc_html_table_variable_arity", "CYC-HTML-TABLE-VARIABLE-ARITY", 1, 0, false);
    //declareFunction(myName, "html_table_plist", "HTML-TABLE-PLIST", 1, 0, false);
    //declareFunction(myName, "cyc_html_division", "CYC-HTML-DIVISION", 2, 0, false);
    //declareFunction(myName, "cyc_html_division_variable_arity", "CYC-HTML-DIVISION-VARIABLE-ARITY", 1, 0, false);
    //declareFunction(myName, "html_division_plist", "HTML-DIVISION-PLIST", 1, 0, false);
    //declareFunction(myName, "decode_html_option", "DECODE-HTML-OPTION", 1, 0, false);
    //declareFunction(myName, "parse_html_attribute", "PARSE-HTML-ATTRIBUTE", 1, 0, false);
    //declareFunction(myName, "parse_html_attribute_value", "PARSE-HTML-ATTRIBUTE-VALUE", 1, 0, false);
    //declareFunction(myName, "cyc_contextual_url", "CYC-CONTEXTUAL-URL", 2, 0, false);
    //declareFunction(myName, "url_string", "URL-STRING", 1, 0, false);
    //declareFunction(myName, "cyc_remove_html_tags", "CYC-REMOVE-HTML-TAGS", 1, 0, false);
    //declareFunction(myName, "cyc_capitalize_smart", "CYC-CAPITALIZE-SMART", 1, 0, false);
    //declareFunction(myName, "cyc_recapitalize_smart", "CYC-RECAPITALIZE-SMART", 1, 0, false);
    //declareFunction(myName, "cyc_relation_arg", "CYC-RELATION-ARG", 2, 0, false);
    //declareFunction(myName, "cyc_relation_args_list", "CYC-RELATION-ARGS-LIST", 1, 0, false);
    //declareFunction(myName, "cyc_relation_arg_set", "CYC-RELATION-ARG-SET", 1, 0, false);
    //declareFunction(myName, "cyc_relation_expression_arity", "CYC-RELATION-EXPRESSION-ARITY", 1, 0, false);
    //declareFunction(myName, "cyc_identity", "CYC-IDENTITY", 1, 0, false);
    //declareFunction(myName, "cyc_relation_tuples", "CYC-RELATION-TUPLES", 1, 0, false);
    //declareFunction(myName, "cyc_relation_tuples_internal", "CYC-RELATION-TUPLES-INTERNAL", 1, 1, false);
    //declareFunction(myName, "convert_relation_to_kappa", "CONVERT-RELATION-TO-KAPPA", 1, 0, false);
    //declareFunction(myName, "cyc_substitute_formula", "CYC-SUBSTITUTE-FORMULA", 3, 0, false);
    //declareFunction(myName, "cyc_bilateral_form_of_sentence_left", "CYC-BILATERAL-FORM-OF-SENTENCE-LEFT", 1, 0, false);
    //declareFunction(myName, "symmetric_part_typeP", "SYMMETRIC-PART-TYPE?", 1, 0, false);
    //declareFunction(myName, "left_form_of_symmetric_part_type", "LEFT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
    //declareFunction(myName, "cyc_bilateral_form_of_sentence_right", "CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT", 1, 0, false);
    //declareFunction(myName, "symmetry_neutralized_el_sentence_p", "SYMMETRY-NEUTRALIZED-EL-SENTENCE-P", 1, 0, false);
    //declareFunction(myName, "right_form_of_symmetric_part_type", "RIGHT-FORM-OF-SYMMETRIC-PART-TYPE", 1, 0, false);
    //declareFunction(myName, "neutralize_symmetric_formula", "NEUTRALIZE-SYMMETRIC-FORMULA", 1, 0, false);
    //declareFunction(myName, "side_fn_naut_p", "SIDE-FN-NAUT-P", 1, 0, false);
    //declareFunction(myName, "cyc_substitute_formula_arg", "CYC-SUBSTITUTE-FORMULA-ARG", 3, 0, false);
    //declareFunction(myName, "cyc_substitute_formula_arg_position", "CYC-SUBSTITUTE-FORMULA-ARG-POSITION", 3, 0, false);
    //declareFunction(myName, "cyc_make_formula", "CYC-MAKE-FORMULA", 2, 0, false);
    //declareFunction(myName, "cyc_substitute_quoted_formula_arg", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG", 3, 0, false);
    //declareFunction(myName, "cyc_substitute_quoted_formula_arg_position", "CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION", 3, 0, false);
    //declareFunction(myName, "cyc_make_quoted_formula", "CYC-MAKE-QUOTED-FORMULA", 2, 0, false);
    //declareFunction(myName, "cycl_to_el_fn", "CYCL-TO-EL-FN", 1, 0, false);
    //declareFunction(myName, "cyc_substitute_nlte", "CYC-SUBSTITUTE-NLTE", 3, 0, false);
    //declareFunction(myName, "sem_trans_template_defn", "SEM-TRANS-TEMPLATE-DEFN", 3, 0, false);
    //declareFunction(myName, "cyc_word_strings", "CYC-WORD-STRINGS", 2, 0, false);
    //declareFunction(myName, "word_strings_fn", "WORD-STRINGS-FN", 0, 0, false);
    //declareFunction(myName, "word_sequence_fn", "WORD-SEQUENCE-FN", 0, 0, false);
    //declareFunction(myName, "cyc_strings_of_word_sequence", "CYC-STRINGS-OF-WORD-SEQUENCE", 1, 0, false);
    //declareFunction(myName, "cyc_instantiate", "CYC-INSTANTIATE", 3, 0, false);
    //declareFunction(myName, "cyc_find_or_instantiate", "CYC-FIND-OR-INSTANTIATE", 3, 0, false);
    //declareFunction(myName, "cyc_instantiate_set_formula", "CYC-INSTANTIATE-SET-FORMULA", 1, 0, false);
    //declareFunction(myName, "cyc_instantiate_formula", "CYC-INSTANTIATE-FORMULA", 3, 0, false);
    //declareFunction(myName, "cyc_individual_denoting_unary_function_for", "CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
    //declareFunction(myName, "cyc_collection_denoting_unary_function_for", "CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR", 1, 0, false);
    //declareFunction(myName, "unary_functions_for", "UNARY-FUNCTIONS-FOR", 2, 0, false);
    //declareFunction(myName, "unary_functionP", "UNARY-FUNCTION?", 1, 0, false);
    //declareFunction(myName, "individual_denoting_fnP", "INDIVIDUAL-DENOTING-FN?", 1, 0, false);
    //declareFunction(myName, "cyc_el_variable_fn", "CYC-EL-VARIABLE-FN", 1, 0, false);
    //declareFunction(myName, "cyc_add_english_suffix", "CYC-ADD-ENGLISH-SUFFIX", 2, 0, false);
    //declareFunction(myName, "state_or_province_for_city_defn", "STATE-OR-PROVINCE-FOR-CITY-DEFN", 1, 0, false);
    //declareFunction(myName, "cyc_html_url_encode", "CYC-HTML-URL-ENCODE", 1, 0, false);
    //declareFunction(myName, "cyc_url_source", "CYC-URL-SOURCE", 1, 0, false);
    //declareFunction(myName, "cyc_get_from_http_source", "CYC-GET-FROM-HTTP-SOURCE", 1, 0, false);
    //declareFunction(myName, "encode_list_for_simple_http_server", "ENCODE-LIST-FOR-SIMPLE-HTTP-SERVER", 1, 0, false);
    //declareFunction(myName, "cyc_term_uri_fn", "CYC-TERM-URI-FN", 1, 0, false);
    //declareFunction(myName, "city_named_fn_defn", "CITY-NAMED-FN-DEFN", 2, 0, false);
    //declareFunction(myName, "city_in_regionP", "CITY-IN-REGION?", 2, 0, false);
    //declareFunction(myName, "text_topic_structure", "TEXT-TOPIC-STRUCTURE", 1, 0, false);
    //declareFunction(myName, "el_list_to_subl_list", "EL-LIST-TO-SUBL-LIST", 1, 0, false);
    //declareFunction(myName, "cyc_ordering_result", "CYC-ORDERING-RESULT", 1, 0, false);
    //declareFunction(myName, "ordering_L", "ORDERING-<", 2, 0, false);
    //declareFunction(myName, "cyc_ordering_result_internal", "CYC-ORDERING-RESULT-INTERNAL", 2, 0, false);
    //declareFunction(myName, "cyc_seconds_since_1970_to_date", "CYC-SECONDS-SINCE-1970-TO-DATE", 1, 0, false);
    //declareFunction(myName, "cyc_types_most_often_asserted_using_tool", "CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 2, 0, false);
    //declareFunction(myName, "types_most_often_asserted_using_tool", "TYPES-MOST-OFTEN-ASSERTED-USING-TOOL", 1, 3, false);
    //declareFunction(myName, "assertion_generating_tool_p", "ASSERTION-GENERATING-TOOL-P", 1, 0, false);
    //declareFunction(myName, "cyc_html_for_text_containing_strings", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS", 2, 0, false);
    //declareFunction(myName, "cyc_html_for_text_containing_strings_count_bold_tags", "CYC-HTML-FOR-TEXT-CONTAINING-STRINGS-COUNT-BOLD-TAGS", 1, 0, false);
    //declareFunction(myName, "cyc_format", "CYC-FORMAT", 2, 0, false);
    //declareFunction(myName, "cyc_next_integer_in_sequence", "CYC-NEXT-INTEGER-IN-SEQUENCE", 1, 0, false);
    //declareFunction(myName, "cyc_next_integer_in_sequence_starting_at", "CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT", 2, 0, false);
    //declareFunction(myName, "cyc_concatenate_strings", "CYC-CONCATENATE-STRINGS", 1, 0, false);
    //declareFunction(myName, "strings_to_display_vector_strings", "STRINGS-TO-DISPLAY-VECTOR-STRINGS", 1, 0, false);
    //declareFunction(myName, "cyc_term_similarity_metric", "CYC-TERM-SIMILARITY-METRIC", 2, 0, false);
    //declareFunction(myName, "cyc_kb_orthogonal", "CYC-KB-ORTHOGONAL", 2, 0, false);
    //declareFunction(myName, "cyc_content_of_file", "CYC-CONTENT-OF-FILE", 1, 0, false);
    //declareFunction(myName, "cyc_transform_relation_tuples", "CYC-TRANSFORM-RELATION-TUPLES", 1, 0, false);
    //declareFunction(myName, "unlist", "UNLIST", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_evaluation_defns_file() {
    $cycl_functions_used_as_evaluation_defns$ = deflexical("*CYCL-FUNCTIONS-USED-AS-EVALUATION-DEFNS*", $list0);
    $max_supported_formula_arity$ = deflexical("*MAX-SUPPORTED-FORMULA-ARITY*", $int47$1000);
    $bug_18769_switchP$ = defparameter("*BUG-18769-SWITCH?*", NIL);
    $word_strings_fn$ = deflexical("*WORD-STRINGS-FN*", NIL);
    $word_sequence_fn$ = deflexical("*WORD-SEQUENCE-FN*", NIL);
    $cyc_ordering_relation$ = defparameter("*CYC-ORDERING-RELATION*", NIL);
    $term_to_isg_table_lock$ = deflexical("*TERM-TO-ISG-TABLE-LOCK*", Locks.make_lock($str186$term____isg_table_lock));
    $term_to_isg_table$ = deflexical("*TERM-TO-ISG-TABLE*", maybeDefault( $sym187$_TERM_TO_ISG_TABLE_, $term_to_isg_table$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED))));
    $term_to_isg_wXstart_table_lock$ = deflexical("*TERM-TO-ISG-W/START-TABLE-LOCK*", Locks.make_lock($str189$term____isg_w__start_table_lock));
    $term_to_isg_wXstart_table$ = deflexical("*TERM-TO-ISG-W/START-TABLE*", maybeDefault( $sym190$_TERM_TO_ISG_W_START_TABLE_, $term_to_isg_wXstart_table$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_evaluation_defns_file() {
    // CVS_ID("Id: evaluation-defns.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    {
      SubLObject cdolist_list_var = $cycl_functions_used_as_evaluation_defns$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_kb_function(symbol);
      }
    }
    utilities_macros.register_kb_function($sym5$CYC_TRUE_SUBL);
    utilities_macros.register_kb_function($sym7$CYC_DIFFERENT);
    utilities_macros.register_kb_function($sym8$CYC_DIFFERENT_SYMBOLS);
    utilities_macros.register_kb_function($sym10$CYC_SUBSTRING_PREDICATE);
    utilities_macros.register_kb_function($sym12$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE);
    utilities_macros.register_kb_function($sym13$CYC_PREFIX_SUBSTRING);
    utilities_macros.register_kb_function($sym14$CYC_SUFFIX_SUBSTRING);
    utilities_macros.register_kb_function($sym15$CYC_SUBWORD_PREDICATE);
    utilities_macros.register_kb_function($sym18$CYC_FIND_CONSTANT);
    utilities_macros.register_kb_function($sym20$CYC_EVALUATE_SUBL);
    utilities_macros.register_kb_function($sym21$CYC_STRING_UPCASE);
    access_macros.define_obsolete_register($sym22$STRING_UPCASE_DEFN, $list23);
    utilities_macros.register_kb_function($sym24$CYC_STRING_DOWNCASE);
    utilities_macros.register_kb_function($sym25$CYC_SUBSTRING);
    utilities_macros.register_kb_function($sym28$CYC_STRING_CONCAT);
    utilities_macros.register_kb_function($sym31$CYC_STRINGS_TO_PHRASE);
    utilities_macros.register_kb_function($sym32$CYC_PRE_REMOVE);
    utilities_macros.register_kb_function($sym35$CYC_REPLACE_SUBSTRING);
    utilities_macros.register_kb_function($sym36$CYC_REMOVE_SUBSTRING);
    utilities_macros.register_kb_function($sym37$CYC_POST_REMOVE);
    utilities_macros.register_kb_function($sym38$CYC_TRIM_WHITESPACE);
    utilities_macros.register_kb_function($sym39$CYC_STRING_SEARCH);
    utilities_macros.register_kb_function($sym40$CYC_LENGTH);
    utilities_macros.register_kb_function($sym42$CYC_STRING_TO_INTEGER);
    utilities_macros.register_kb_function($sym43$CYC_INTEGER_TO_STRING);
    utilities_macros.register_kb_function($sym44$CYC_STRING_TO_REAL_NUMBER);
    utilities_macros.register_kb_function($sym46$CYC_REAL_NUMBER_TO_STRING);
    utilities_macros.register_kb_function($sym48$CYC_STRING_TOKENIZE);
    utilities_macros.register_kb_function($sym49$CYC_HTTP_URL_ENCODE);
    utilities_macros.register_kb_function($sym50$CYC_HTML_IMAGE);
    utilities_macros.register_kb_function($sym51$CYC_HTML_TABLE_DATA);
    utilities_macros.register_kb_function($sym52$CYC_HTML_TABLE_DATA_VARIABLE_ARITY);
    utilities_macros.register_kb_function($sym53$CYC_HTML_TABLE_ROW);
    utilities_macros.register_kb_function($sym54$CYC_HTML_TABLE_ROW_VARIABLE_ARITY);
    utilities_macros.register_kb_function($sym55$CYC_HTML_TABLE);
    utilities_macros.register_kb_function($sym56$CYC_HTML_TABLE_VARIABLE_ARITY);
    utilities_macros.register_kb_function($sym57$CYC_HTML_DIVISION);
    utilities_macros.register_kb_function($sym58$CYC_HTML_DIVISION_VARIABLE_ARITY);
    utilities_macros.register_kb_function($sym65$CYC_CONTEXTUAL_URL);
    utilities_macros.register_kb_function($sym66$CYC_REMOVE_HTML_TAGS);
    utilities_macros.register_kb_function($sym67$CYC_CAPITALIZE_SMART);
    utilities_macros.register_kb_function($sym68$CYC_RECAPITALIZE_SMART);
    utilities_macros.register_kb_function($sym69$CYC_RELATION_ARG);
    utilities_macros.register_kb_function($sym71$CYC_RELATION_ARGS_LIST);
    utilities_macros.register_kb_function($sym73$CYC_RELATION_ARG_SET);
    utilities_macros.register_kb_function($sym74$CYC_RELATION_EXPRESSION_ARITY);
    utilities_macros.register_kb_function($sym75$CYC_IDENTITY);
    utilities_macros.register_kb_function($sym76$CYC_RELATION_TUPLES);
    utilities_macros.register_kb_function($sym78$CYC_SUBSTITUTE_FORMULA);
    utilities_macros.register_kb_function($sym81$CYC_BILATERAL_FORM_OF_SENTENCE_LEFT);
    utilities_macros.register_kb_function($sym85$CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT);
    utilities_macros.register_kb_function($sym91$CYC_SUBSTITUTE_FORMULA_ARG);
    utilities_macros.register_kb_function($sym92$CYC_SUBSTITUTE_FORMULA_ARG_POSITION);
    utilities_macros.register_kb_function($sym93$CYC_MAKE_FORMULA);
    utilities_macros.register_kb_function($sym94$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG);
    utilities_macros.register_kb_function($sym95$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION);
    utilities_macros.register_kb_function($sym96$CYC_MAKE_QUOTED_FORMULA);
    utilities_macros.register_kb_function($sym97$CYCL_TO_EL_FN);
    utilities_macros.register_kb_function($sym98$CYC_SUBSTITUTE_NLTE);
    utilities_macros.register_kb_function($sym99$SEM_TRANS_TEMPLATE_DEFN);
    utilities_macros.register_kb_function($sym100$CYC_WORD_STRINGS);
    utilities_macros.register_kb_function($sym103$CYC_STRINGS_OF_WORD_SEQUENCE);
    utilities_macros.register_kb_function($sym104$CYC_INSTANTIATE);
    utilities_macros.register_kb_function($sym106$CYC_FIND_OR_INSTANTIATE);
    utilities_macros.register_kb_function($sym113$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR);
    utilities_macros.register_kb_function($sym115$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR);
    utilities_macros.register_kb_function($sym120$CYC_EL_VARIABLE_FN);
    utilities_macros.register_kb_function($sym121$CYC_ADD_ENGLISH_SUFFIX);
    utilities_macros.register_kb_function($sym125$STATE_OR_PROVINCE_FOR_CITY_DEFN);
    utilities_macros.register_kb_function($sym126$CYC_HTML_URL_ENCODE);
    utilities_macros.register_kb_function($sym132$CYC_URL_SOURCE);
    utilities_macros.register_kb_function($sym146$CYC_GET_FROM_HTTP_SOURCE);
    utilities_macros.register_kb_function($sym152$CYC_TERM_URI_FN);
    utilities_macros.register_kb_function($sym155$CITY_NAMED_FN_DEFN);
    utilities_macros.register_kb_function($sym157$TEXT_TOPIC_STRUCTURE);
    utilities_macros.register_kb_function($sym158$EL_LIST_TO_SUBL_LIST);
    utilities_macros.register_kb_function($sym167$CYC_ORDERING_RESULT);
    utilities_macros.register_kb_function($sym171$CYC_SECONDS_SINCE_1970_TO_DATE);
    utilities_macros.register_kb_function($sym172$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL);
    utilities_macros.register_kb_function($sym182$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS);
    utilities_macros.register_kb_function($sym185$CYC_FORMAT);
    subl_macro_promotions.declare_defglobal($sym187$_TERM_TO_ISG_TABLE_);
    utilities_macros.register_kb_function($sym188$CYC_NEXT_INTEGER_IN_SEQUENCE);
    subl_macro_promotions.declare_defglobal($sym190$_TERM_TO_ISG_W_START_TABLE_);
    utilities_macros.register_kb_function($sym191$CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT);
    utilities_macros.register_kb_function($sym193$CYC_CONCATENATE_STRINGS);
    generic_testing.define_test_case_table_int($sym193$CYC_CONCATENATE_STRINGS, list(new SubLObject[] {$kw194$TEST, NIL, $kw195$OWNER, NIL, $kw196$CLASSES, NIL, $kw197$KB, $kw198$FULL, $kw199$WORKING_, T}), $list200);
    utilities_macros.register_kb_function($sym201$CYC_TERM_SIMILARITY_METRIC);
    utilities_macros.register_kb_function($sym202$CYC_KB_ORTHOGONAL);
    utilities_macros.register_kb_function($sym203$CYC_CONTENT_OF_FILE);
    utilities_macros.register_kb_function($sym204$CYC_TRANSFORM_RELATION_TUPLES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("ASSERTED-WHEN"));
  public static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const2$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const3$evaluationDefn = constant_handles.reader_make_constant_shell(makeString("evaluationDefn"));
  public static final SubLObject $const4$EvaluatablePredicate = constant_handles.reader_make_constant_shell(makeString("EvaluatablePredicate"));
  public static final SubLSymbol $sym5$CYC_TRUE_SUBL = makeSymbol("CYC-TRUE-SUBL");
  public static final SubLSymbol $kw6$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $sym7$CYC_DIFFERENT = makeSymbol("CYC-DIFFERENT");
  public static final SubLSymbol $sym8$CYC_DIFFERENT_SYMBOLS = makeSymbol("CYC-DIFFERENT-SYMBOLS");
  public static final SubLSymbol $sym9$CHAR_ = makeSymbol("CHAR=");
  public static final SubLSymbol $sym10$CYC_SUBSTRING_PREDICATE = makeSymbol("CYC-SUBSTRING-PREDICATE");
  public static final SubLSymbol $sym11$CHAR_EQUAL = makeSymbol("CHAR-EQUAL");
  public static final SubLSymbol $sym12$CYC_SUBSTRING_CASE_INSENSITIVE_PREDICATE = makeSymbol("CYC-SUBSTRING-CASE-INSENSITIVE-PREDICATE");
  public static final SubLSymbol $sym13$CYC_PREFIX_SUBSTRING = makeSymbol("CYC-PREFIX-SUBSTRING");
  public static final SubLSymbol $sym14$CYC_SUFFIX_SUBSTRING = makeSymbol("CYC-SUFFIX-SUBSTRING");
  public static final SubLSymbol $sym15$CYC_SUBWORD_PREDICATE = makeSymbol("CYC-SUBWORD-PREDICATE");
  public static final SubLString $str16$Could_not_find_constant__A_ = makeString("Could not find constant ~A.");
  public static final SubLString $str17$Arg1_of___FindConstantFn_must_be_ = makeString("Arg1 of #$FindConstantFn must be a string: ~A.");
  public static final SubLSymbol $sym18$CYC_FIND_CONSTANT = makeSymbol("CYC-FIND-CONSTANT");
  public static final SubLObject $const19$EvaluatableFunction = constant_handles.reader_make_constant_shell(makeString("EvaluatableFunction"));
  public static final SubLSymbol $sym20$CYC_EVALUATE_SUBL = makeSymbol("CYC-EVALUATE-SUBL");
  public static final SubLSymbol $sym21$CYC_STRING_UPCASE = makeSymbol("CYC-STRING-UPCASE");
  public static final SubLSymbol $sym22$STRING_UPCASE_DEFN = makeSymbol("STRING-UPCASE-DEFN");
  public static final SubLList $list23 = list(makeSymbol("CYC-STRING-UPCASE"));
  public static final SubLSymbol $sym24$CYC_STRING_DOWNCASE = makeSymbol("CYC-STRING-DOWNCASE");
  public static final SubLSymbol $sym25$CYC_SUBSTRING = makeSymbol("CYC-SUBSTRING");
  public static final SubLSymbol $sym26$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym27$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLSymbol $sym28$CYC_STRING_CONCAT = makeSymbol("CYC-STRING-CONCAT");
  public static final SubLString $str29$ = makeString("");
  public static final SubLString $str30$_ = makeString(" ");
  public static final SubLSymbol $sym31$CYC_STRINGS_TO_PHRASE = makeSymbol("CYC-STRINGS-TO-PHRASE");
  public static final SubLSymbol $sym32$CYC_PRE_REMOVE = makeSymbol("CYC-PRE-REMOVE");
  public static final SubLInteger $int33$128 = makeInteger(128);
  public static final SubLSymbol $sym34$__ = makeSymbol("<=");
  public static final SubLSymbol $sym35$CYC_REPLACE_SUBSTRING = makeSymbol("CYC-REPLACE-SUBSTRING");
  public static final SubLSymbol $sym36$CYC_REMOVE_SUBSTRING = makeSymbol("CYC-REMOVE-SUBSTRING");
  public static final SubLSymbol $sym37$CYC_POST_REMOVE = makeSymbol("CYC-POST-REMOVE");
  public static final SubLSymbol $sym38$CYC_TRIM_WHITESPACE = makeSymbol("CYC-TRIM-WHITESPACE");
  public static final SubLSymbol $sym39$CYC_STRING_SEARCH = makeSymbol("CYC-STRING-SEARCH");
  public static final SubLSymbol $sym40$CYC_LENGTH = makeSymbol("CYC-LENGTH");
  public static final SubLString $str41$_ = makeString(",");
  public static final SubLSymbol $sym42$CYC_STRING_TO_INTEGER = makeSymbol("CYC-STRING-TO-INTEGER");
  public static final SubLSymbol $sym43$CYC_INTEGER_TO_STRING = makeSymbol("CYC-INTEGER-TO-STRING");
  public static final SubLSymbol $sym44$CYC_STRING_TO_REAL_NUMBER = makeSymbol("CYC-STRING-TO-REAL-NUMBER");
  public static final SubLSymbol $sym45$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLSymbol $sym46$CYC_REAL_NUMBER_TO_STRING = makeSymbol("CYC-REAL-NUMBER-TO-STRING");
  public static final SubLInteger $int47$1000 = makeInteger(1000);
  public static final SubLSymbol $sym48$CYC_STRING_TOKENIZE = makeSymbol("CYC-STRING-TOKENIZE");
  public static final SubLSymbol $sym49$CYC_HTTP_URL_ENCODE = makeSymbol("CYC-HTTP-URL-ENCODE");
  public static final SubLSymbol $sym50$CYC_HTML_IMAGE = makeSymbol("CYC-HTML-IMAGE");
  public static final SubLSymbol $sym51$CYC_HTML_TABLE_DATA = makeSymbol("CYC-HTML-TABLE-DATA");
  public static final SubLSymbol $sym52$CYC_HTML_TABLE_DATA_VARIABLE_ARITY = makeSymbol("CYC-HTML-TABLE-DATA-VARIABLE-ARITY");
  public static final SubLSymbol $sym53$CYC_HTML_TABLE_ROW = makeSymbol("CYC-HTML-TABLE-ROW");
  public static final SubLSymbol $sym54$CYC_HTML_TABLE_ROW_VARIABLE_ARITY = makeSymbol("CYC-HTML-TABLE-ROW-VARIABLE-ARITY");
  public static final SubLSymbol $sym55$CYC_HTML_TABLE = makeSymbol("CYC-HTML-TABLE");
  public static final SubLSymbol $sym56$CYC_HTML_TABLE_VARIABLE_ARITY = makeSymbol("CYC-HTML-TABLE-VARIABLE-ARITY");
  public static final SubLSymbol $sym57$CYC_HTML_DIVISION = makeSymbol("CYC-HTML-DIVISION");
  public static final SubLSymbol $sym58$CYC_HTML_DIVISION_VARIABLE_ARITY = makeSymbol("CYC-HTML-DIVISION-VARIABLE-ARITY");
  public static final SubLList $list59 = list(makeSymbol("EL-ATTRIBUTE"), makeSymbol("EL-VALUE"));
  public static final SubLList $list60 = list(constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn")), makeKeyword("ANYTHING"));
  public static final SubLList $list61 = list(constant_handles.reader_make_constant_shell(makeString("Percent")), makeKeyword("ANYTHING"));
  public static final SubLString $str62$_ = makeString("%");
  public static final SubLSymbol $sym63$PARSE_HTML_ATTRIBUTE_VALUE = makeSymbol("PARSE-HTML-ATTRIBUTE-VALUE");
  public static final SubLObject $const64$URLFn = constant_handles.reader_make_constant_shell(makeString("URLFn"));
  public static final SubLSymbol $sym65$CYC_CONTEXTUAL_URL = makeSymbol("CYC-CONTEXTUAL-URL");
  public static final SubLSymbol $sym66$CYC_REMOVE_HTML_TAGS = makeSymbol("CYC-REMOVE-HTML-TAGS");
  public static final SubLSymbol $sym67$CYC_CAPITALIZE_SMART = makeSymbol("CYC-CAPITALIZE-SMART");
  public static final SubLSymbol $sym68$CYC_RECAPITALIZE_SMART = makeSymbol("CYC-RECAPITALIZE-SMART");
  public static final SubLSymbol $sym69$CYC_RELATION_ARG = makeSymbol("CYC-RELATION-ARG");
  public static final SubLObject $const70$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLSymbol $sym71$CYC_RELATION_ARGS_LIST = makeSymbol("CYC-RELATION-ARGS-LIST");
  public static final SubLObject $const72$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLSymbol $sym73$CYC_RELATION_ARG_SET = makeSymbol("CYC-RELATION-ARG-SET");
  public static final SubLSymbol $sym74$CYC_RELATION_EXPRESSION_ARITY = makeSymbol("CYC-RELATION-EXPRESSION-ARITY");
  public static final SubLSymbol $sym75$CYC_IDENTITY = makeSymbol("CYC-IDENTITY");
  public static final SubLSymbol $sym76$CYC_RELATION_TUPLES = makeSymbol("CYC-RELATION-TUPLES");
  public static final SubLObject $const77$Kappa = constant_handles.reader_make_constant_shell(makeString("Kappa"));
  public static final SubLSymbol $sym78$CYC_SUBSTITUTE_FORMULA = makeSymbol("CYC-SUBSTITUTE-FORMULA");
  public static final SubLSymbol $sym79$SYMMETRIC_PART_TYPE_ = makeSymbol("SYMMETRIC-PART-TYPE?");
  public static final SubLSymbol $sym80$LEFT_FORM_OF_SYMMETRIC_PART_TYPE = makeSymbol("LEFT-FORM-OF-SYMMETRIC-PART-TYPE");
  public static final SubLSymbol $sym81$CYC_BILATERAL_FORM_OF_SENTENCE_LEFT = makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-LEFT");
  public static final SubLObject $const82$SymmetricAnatomicalPartType = constant_handles.reader_make_constant_shell(makeString("SymmetricAnatomicalPartType"));
  public static final SubLObject $const83$LeftObjectOfPairFn = constant_handles.reader_make_constant_shell(makeString("LeftObjectOfPairFn"));
  public static final SubLSymbol $sym84$RIGHT_FORM_OF_SYMMETRIC_PART_TYPE = makeSymbol("RIGHT-FORM-OF-SYMMETRIC-PART-TYPE");
  public static final SubLSymbol $sym85$CYC_BILATERAL_FORM_OF_SENTENCE_RIGHT = makeSymbol("CYC-BILATERAL-FORM-OF-SENTENCE-RIGHT");
  public static final SubLObject $const86$RightObjectOfPairFn = constant_handles.reader_make_constant_shell(makeString("RightObjectOfPairFn"));
  public static final SubLSymbol $sym87$SIDE_FN_NAUT_P = makeSymbol("SIDE-FN-NAUT-P");
  public static final SubLSymbol $sym88$NAT_ARG1 = makeSymbol("NAT-ARG1");
  public static final SubLSymbol $sym89$_SIDEFN = makeSymbol("?SIDEFN");
  public static final SubLObject $const90$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLSymbol $sym91$CYC_SUBSTITUTE_FORMULA_ARG = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG");
  public static final SubLSymbol $sym92$CYC_SUBSTITUTE_FORMULA_ARG_POSITION = makeSymbol("CYC-SUBSTITUTE-FORMULA-ARG-POSITION");
  public static final SubLSymbol $sym93$CYC_MAKE_FORMULA = makeSymbol("CYC-MAKE-FORMULA");
  public static final SubLSymbol $sym94$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG");
  public static final SubLSymbol $sym95$CYC_SUBSTITUTE_QUOTED_FORMULA_ARG_POSITION = makeSymbol("CYC-SUBSTITUTE-QUOTED-FORMULA-ARG-POSITION");
  public static final SubLSymbol $sym96$CYC_MAKE_QUOTED_FORMULA = makeSymbol("CYC-MAKE-QUOTED-FORMULA");
  public static final SubLSymbol $sym97$CYCL_TO_EL_FN = makeSymbol("CYCL-TO-EL-FN");
  public static final SubLSymbol $sym98$CYC_SUBSTITUTE_NLTE = makeSymbol("CYC-SUBSTITUTE-NLTE");
  public static final SubLSymbol $sym99$SEM_TRANS_TEMPLATE_DEFN = makeSymbol("SEM-TRANS-TEMPLATE-DEFN");
  public static final SubLSymbol $sym100$CYC_WORD_STRINGS = makeSymbol("CYC-WORD-STRINGS");
  public static final SubLString $str101$WordStringsFn = makeString("WordStringsFn");
  public static final SubLString $str102$WordSequenceFn = makeString("WordSequenceFn");
  public static final SubLSymbol $sym103$CYC_STRINGS_OF_WORD_SEQUENCE = makeSymbol("CYC-STRINGS-OF-WORD-SEQUENCE");
  public static final SubLSymbol $sym104$CYC_INSTANTIATE = makeSymbol("CYC-INSTANTIATE");
  public static final SubLList $list105 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);
  public static final SubLSymbol $sym106$CYC_FIND_OR_INSTANTIATE = makeSymbol("CYC-FIND-OR-INSTANTIATE");
  public static final SubLObject $const107$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym108$_OBJ = makeSymbol("?OBJ");
  public static final SubLObject $const109$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLObject $const110$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));
  public static final SubLObject $const111$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLSymbol $sym112$INDIVIDUAL_DENOTING_FN_ = makeSymbol("INDIVIDUAL-DENOTING-FN?");
  public static final SubLSymbol $sym113$CYC_INDIVIDUAL_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-INDIVIDUAL-DENOTING-UNARY-FUNCTION-FOR");
  public static final SubLObject $const114$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));
  public static final SubLSymbol $sym115$CYC_COLLECTION_DENOTING_UNARY_FUNCTION_FOR = makeSymbol("CYC-COLLECTION-DENOTING-UNARY-FUNCTION-FOR");
  public static final SubLSymbol $sym116$UNARY_FUNCTION_ = makeSymbol("UNARY-FUNCTION?");
  public static final SubLSymbol $sym117$SKOLEM_FUNCTION_ = makeSymbol("SKOLEM-FUNCTION?");
  public static final SubLObject $const118$UnaryFunction = constant_handles.reader_make_constant_shell(makeString("UnaryFunction"));
  public static final SubLObject $const119$IndividualDenotingFunction = constant_handles.reader_make_constant_shell(makeString("IndividualDenotingFunction"));
  public static final SubLSymbol $sym120$CYC_EL_VARIABLE_FN = makeSymbol("CYC-EL-VARIABLE-FN");
  public static final SubLSymbol $sym121$CYC_ADD_ENGLISH_SUFFIX = makeSymbol("CYC-ADD-ENGLISH-SUFFIX");
  public static final SubLObject $const122$geopoliticalSubdivision = constant_handles.reader_make_constant_shell(makeString("geopoliticalSubdivision"));
  public static final SubLObject $const123$State_UnitedStates = constant_handles.reader_make_constant_shell(makeString("State-UnitedStates"));
  public static final SubLObject $const124$CanadianProvince = constant_handles.reader_make_constant_shell(makeString("CanadianProvince"));
  public static final SubLSymbol $sym125$STATE_OR_PROVINCE_FOR_CITY_DEFN = makeSymbol("STATE-OR-PROVINCE-FOR-CITY-DEFN");
  public static final SubLSymbol $sym126$CYC_HTML_URL_ENCODE = makeSymbol("CYC-HTML-URL-ENCODE");
  public static final SubLSymbol $sym127$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLInteger $int128$255 = makeInteger(255);
  public static final SubLSymbol $sym129$_ = makeSymbol("<");
  public static final SubLSymbol $sym130$CHAR_CODE = makeSymbol("CHAR-CODE");
  public static final SubLString $str131$charset_utf_8 = makeString("charset=utf-8");
  public static final SubLSymbol $sym132$CYC_URL_SOURCE = makeSymbol("CYC-URL-SOURCE");
  public static final SubLSymbol $kw133$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLInteger $int134$80 = makeInteger(80);
  public static final SubLSymbol $kw135$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLSymbol $kw136$MACHINE = makeKeyword("MACHINE");
  public static final SubLSymbol $kw137$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw138$METHOD = makeKeyword("METHOD");
  public static final SubLSymbol $kw139$GET = makeKeyword("GET");
  public static final SubLSymbol $kw140$URL = makeKeyword("URL");
  public static final SubLString $str141$simple_http_get = makeString("simple-http-get");
  public static final SubLSymbol $kw142$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw143$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");
  public static final SubLSymbol $kw144$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");
  public static final SubLSymbol $kw145$ACCEPT_TYPES = makeKeyword("ACCEPT-TYPES");
  public static final SubLSymbol $sym146$CYC_GET_FROM_HTTP_SOURCE = makeSymbol("CYC-GET-FROM-HTTP-SOURCE");
  public static final SubLString $str147$_ = makeString("\"");
  public static final SubLString $str148$_ = makeString("&");
  public static final SubLObject $const149$SchemaObjectFn = constant_handles.reader_make_constant_shell(makeString("SchemaObjectFn"));
  public static final SubLString $str150$_ = makeString("<");
  public static final SubLString $str151$_ = makeString(">");
  public static final SubLSymbol $sym152$CYC_TERM_URI_FN = makeSymbol("CYC-TERM-URI-FN");
  public static final SubLObject $const153$City = constant_handles.reader_make_constant_shell(makeString("City"));
  public static final SubLObject $const154$CityNamedFn = constant_handles.reader_make_constant_shell(makeString("CityNamedFn"));
  public static final SubLSymbol $sym155$CITY_NAMED_FN_DEFN = makeSymbol("CITY-NAMED-FN-DEFN");
  public static final SubLList $list156 = list(makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI"))));
  public static final SubLSymbol $sym157$TEXT_TOPIC_STRUCTURE = makeSymbol("TEXT-TOPIC-STRUCTURE");
  public static final SubLSymbol $sym158$EL_LIST_TO_SUBL_LIST = makeSymbol("EL-LIST-TO-SUBL-LIST");
  public static final SubLSymbol $kw159$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym160$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw161$BASE_SET = makeKeyword("BASE-SET");
  public static final SubLObject $const162$baseSet = constant_handles.reader_make_constant_shell(makeString("baseSet"));
  public static final SubLList $list163 = list(makeKeyword("BASE-SET"));
  public static final SubLSymbol $kw164$ORDERING_RELATION = makeKeyword("ORDERING-RELATION");
  public static final SubLObject $const165$orderingRelation = constant_handles.reader_make_constant_shell(makeString("orderingRelation"));
  public static final SubLList $list166 = list(makeKeyword("ORDERING-RELATION"));
  public static final SubLSymbol $sym167$CYC_ORDERING_RESULT = makeSymbol("CYC-ORDERING-RESULT");
  public static final SubLSymbol $kw168$ELEMENT = makeKeyword("ELEMENT");
  public static final SubLObject $const169$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLSymbol $sym170$ORDERING__ = makeSymbol("ORDERING-<");
  public static final SubLSymbol $sym171$CYC_SECONDS_SINCE_1970_TO_DATE = makeSymbol("CYC-SECONDS-SINCE-1970-TO-DATE");
  public static final SubLSymbol $sym172$CYC_TYPES_MOST_OFTEN_ASSERTED_USING_TOOL = makeSymbol("CYC-TYPES-MOST-OFTEN-ASSERTED-USING-TOOL");
  public static final SubLSymbol $sym173$ASSERTION_GENERATING_TOOL_P = makeSymbol("ASSERTION-GENERATING-TOOL-P");
  public static final SubLSymbol $sym174$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym175$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $kw176$GAF = makeKeyword("GAF");
  public static final SubLObject $const177$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const178$assertedUsingTool = constant_handles.reader_make_constant_shell(makeString("assertedUsingTool"));
  public static final SubLSymbol $sym179$_ = makeSymbol(">");
  public static final SubLSymbol $sym180$CAR = makeSymbol("CAR");
  public static final SubLObject $const181$AssertionGeneratingRKFTool = constant_handles.reader_make_constant_shell(makeString("AssertionGeneratingRKFTool"));
  public static final SubLSymbol $sym182$CYC_HTML_FOR_TEXT_CONTAINING_STRINGS = makeSymbol("CYC-HTML-FOR-TEXT-CONTAINING-STRINGS");
  public static final SubLString $str183$_b_ = makeString("<b>");
  public static final SubLSymbol $sym184$FORMAT = makeSymbol("FORMAT");
  public static final SubLSymbol $sym185$CYC_FORMAT = makeSymbol("CYC-FORMAT");
  public static final SubLString $str186$term____isg_table_lock = makeString("term -> isg table lock");
  public static final SubLSymbol $sym187$_TERM_TO_ISG_TABLE_ = makeSymbol("*TERM-TO-ISG-TABLE*");
  public static final SubLSymbol $sym188$CYC_NEXT_INTEGER_IN_SEQUENCE = makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE");
  public static final SubLString $str189$term____isg_w__start_table_lock = makeString("term -> isg w/ start table lock");
  public static final SubLSymbol $sym190$_TERM_TO_ISG_W_START_TABLE_ = makeSymbol("*TERM-TO-ISG-W/START-TABLE*");
  public static final SubLSymbol $sym191$CYC_NEXT_INTEGER_IN_SEQUENCE_STARTING_AT = makeSymbol("CYC-NEXT-INTEGER-IN-SEQUENCE-STARTING-AT");
  public static final SubLSymbol $sym192$UNICODE_NAUT_P = makeSymbol("UNICODE-NAUT-P");
  public static final SubLSymbol $sym193$CYC_CONCATENATE_STRINGS = makeSymbol("CYC-CONCATENATE-STRINGS");
  public static final SubLSymbol $kw194$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw195$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw196$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw197$KB = makeKeyword("KB");
  public static final SubLSymbol $kw198$FULL = makeKeyword("FULL");
  public static final SubLSymbol $kw199$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list200 = list(list(list(list(makeString("foo"), makeString("bar"))), makeString("foobar")), list(list(list(list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000")), makeString(" or more"))), list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000 or more"))), list(list(list(makeString("as well as "), list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000")))), list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("as well as for debts not exceeding &ua3;5,000"))), list(list(list(list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000")), list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString(" or &ua3;6,000")))), list(constant_handles.reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("for debts not exceeding &ua3;5,000 or &ua3;6,000"))), list(list(list(makeString("&quot;"), makeString("US Designates Al Akhtar Trust"), makeString("&quot;"))), makeString("&quot;US Designates Al Akhtar Trust&quot;")));
  public static final SubLSymbol $sym201$CYC_TERM_SIMILARITY_METRIC = makeSymbol("CYC-TERM-SIMILARITY-METRIC");
  public static final SubLSymbol $sym202$CYC_KB_ORTHOGONAL = makeSymbol("CYC-KB-ORTHOGONAL");
  public static final SubLSymbol $sym203$CYC_CONTENT_OF_FILE = makeSymbol("CYC-CONTENT-OF-FILE");
  public static final SubLSymbol $sym204$CYC_TRANSFORM_RELATION_TUPLES = makeSymbol("CYC-TRANSFORM-RELATION-TUPLES");
  public static final SubLString $str205$_a_doesn_t_start_with___TheList = makeString("~a doesn't start with #$TheList");

  //// Initializers

  public void declareFunctions() {
    declare_evaluation_defns_file();
  }

  public void initializeVariables() {
    init_evaluation_defns_file();
  }

  public void runTopLevelForms() {
    setup_evaluation_defns_file();
  }

}
