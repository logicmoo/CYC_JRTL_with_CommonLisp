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
//dm import com.cyc.cycjava_1.cycl.inference.arete;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.dumper;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.kbq_query_run;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.tva_utilities;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.verbosifier;

public  final class folification extends SubLTranslatedFile {

  //// Constructor

  private folification() {}
  public static final SubLFile me = new folification();
  public static final String myName = "com.cyc.cycjava_1.cycl.folification";

  //// Definitions

  @SubL(source = "cycl/folification.lisp", position = 1990) 
  public static SubLSymbol $folification_version$ = null;

  /** One of :regular-fol
          :set-theory
           */
  @SubL(source = "cycl/folification.lisp", position = 3989) 
  private static SubLSymbol $fol_translation_type$ = null;

  /** One of :mt-visible
          :mt-visible-except-core-mts
	  :mt-argument
          (:collapse <single-theory>)
          :flat (not recommended)
           */
  @SubL(source = "cycl/folification.lisp", position = 4229) 
  private static SubLSymbol $fol_mt_handling$ = null;

  /** One of :unary-predicate, :isa */
  @SubL(source = "cycl/folification.lisp", position = 4707) 
  private static SubLSymbol $fol_isa_handling$ = null;

  /** How to handle rule macro predicates:
   One of :gaf, :expansion, :gaf-and-expansion */
  @SubL(source = "cycl/folification.lisp", position = 4917) 
  private static SubLSymbol $fol_rmp_handling$ = null;

  /** One of :allowed, :dwim-to-single-constant, :dwim-to-distinct-constants, :skip */
  @SubL(source = "cycl/folification.lisp", position = 5182) 
  private static SubLSymbol $fol_string_handling$ = null;

  /** One of :allowed, :dwim-floats-to-distinct-constants, :dwim-all-to-distinct-constants */
  @SubL(source = "cycl/folification.lisp", position = 5484) 
  private static SubLSymbol $fol_number_handling$ = null;

  /** Terms that are explicitly forbidden to be converted to FOL. */
  @SubL(source = "cycl/folification.lisp", position = 5827) 
  private static SubLSymbol $unfolifiable_terms$ = null;

  /** COUNT assertion(s) could not be converted to FOL because it/they... */
  @SubL(source = "cycl/folification.lisp", position = 6498) 
  private static SubLSymbol $folification_unhandled_explanation_table$ = null;

  /** The list of possible FOL output formats */
  @SubL(source = "cycl/folification.lisp", position = 8379) 
  private static SubLSymbol $fol_output_formats$ = null;

  /** If non-nil, will use this name for the conjecture instead of a number. */
  @SubL(source = "cycl/folification.lisp", position = 8603) 
  public static SubLSymbol $tptp_query_name$ = null;

  /** If non-nil, will prefix all axiom ids with this string. */
  @SubL(source = "cycl/folification.lisp", position = 8726) 
  public static SubLSymbol $tptp_axiom_prefix$ = null;

  @SubL(source = "cycl/folification.lisp", position = 8836) 
  private static SubLSymbol $tptp_axiom_count$ = null;

  @SubL(source = "cycl/folification.lisp", position = 8883) 
  private static SubLSymbol $candidate_sentence_count$ = null;

  @SubL(source = "cycl/folification.lisp", position = 8938) 
  private static SubLSymbol $handled_sentence_count$ = null;

  @SubL(source = "cycl/folification.lisp", position = 8990) 
  private static SubLSymbol $term_count$ = null;

  @SubL(source = "cycl/folification.lisp", position = 9030) 
  private static SubLSymbol $handled_term_count$ = null;

  @SubL(source = "cycl/folification.lisp", position = 9078) 
  private static SubLSymbol $partially_handled_term_count$ = null;

  @SubL(source = "cycl/folification.lisp", position = 9136) 
  private static SubLSymbol $unhandled_term_count$ = null;

  /** This is only used to handle HL variables in assertion objects. */
  @SubL(source = "cycl/folification.lisp", position = 34909) 
  private static SubLSymbol $fol_current_assertion$ = null;

  @SubL(source = "cycl/folification.lisp", position = 49287) 
  private static SubLSymbol $fol_sequence_variable_args_for_arity_caching_state$ = null;

  @SubL(source = "cycl/folification.lisp", position = 86733) 
  private static SubLSymbol $compute_tptp_query_index_number_caching_state$ = null;

  @SubL(source = "cycl/folification.lisp", position = 95547) 
  private static SubLSymbol $tptp_long_symbol_name_cache$ = null;

  /** The minimum length that a symbol must be to be considered too long */
  @SubL(source = "cycl/folification.lisp", position = 95628) 
  private static SubLSymbol $tptp_long_symbol_min_length$ = null;

  @SubL(source = "cycl/folification.lisp", position = 105294) 
  private static SubLSymbol $categorize_fol_predicates$ = null;

  @SubL(source = "cycl/folification.lisp", position = 105350) 
  private static SubLSymbol $categorize_fol_functions$ = null;

  @SubL(source = "cycl/folification.lisp", position = 105405) 
  private static SubLSymbol $categorize_fol_terms$ = null;

  @SubL(source = "cycl/folification.lisp", position = 106848) 
  private static SubLSymbol $fol_nart_string_caching_state$ = null;

  @SubL(source = "cycl/folification.lisp", position = 107256) 
  public static SubLSymbol $deepak_folification_properties$ = null;

  /** Queries used in the first FOLification paper: First-Orderized ResearchCyc : Expressivity and Efficiency in a Common-Sense Ontology */
  @SubL(source = "cycl/folification.lisp", position = 109041) 
  private static SubLSymbol $deepak_queries$ = null;

  /** Queries used in the second FOLification paper */
  @SubL(source = "cycl/folification.lisp", position = 110302) 
  private static SubLSymbol $deepak_queries_2$ = null;

  public static final SubLObject declare_folification_file() {
    //declareFunction(myName, "fol_translation_type_property_p", "FOL-TRANSLATION-TYPE-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "fol_mt_handling_property_p", "FOL-MT-HANDLING-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "fol_isa_handling_property_p", "FOL-ISA-HANDLING-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "fol_rmp_handling_property_p", "FOL-RMP-HANDLING-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "fol_string_handling_property_p", "FOL-STRING-HANDLING-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "fol_number_handling_property_p", "FOL-NUMBER-HANDLING-PROPERTY-P", 1, 0, false);
    //declareFunction(myName, "fol_output_format_p", "FOL-OUTPUT-FORMAT-P", 1, 0, false);
    //declareFunction(myName, "new_fol_sentences_analysis", "NEW-FOL-SENTENCES-ANALYSIS", 9, 0, false);
    //declareFunction(myName, "fol_sentences_analysis_data", "FOL-SENTENCES-ANALYSIS-DATA", 1, 0, false);
    //declareFunction(myName, "fol_sentences_analysis_generation_properties", "FOL-SENTENCES-ANALYSIS-GENERATION-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "fol_sentences_analysis_rejection_statistics", "FOL-SENTENCES-ANALYSIS-REJECTION-STATISTICS", 1, 0, false);
    //declareFunction(myName, "kb_fol_sentences", "KB-FOL-SENTENCES", 0, 1, false);
    //declareFunction(myName, "cycl_assertions_to_fol", "CYCL-ASSERTIONS-TO-FOL", 1, 2, false);
    //declareFunction(myName, "cycl_sentences_to_fol", "CYCL-SENTENCES-TO-FOL", 1, 1, false);
    //declareFunction(myName, "fol_sentences", "FOL-SENTENCES", 3, 1, false);
    //declareFunction(myName, "assertions_fol_sentences_data", "ASSERTIONS-FOL-SENTENCES-DATA", 9, 0, false);
    //declareFunction(myName, "sentences_fol_sentences_data", "SENTENCES-FOL-SENTENCES-DATA", 9, 0, false);
    //declareFunction(myName, "forts_fol_sentences_data", "FORTS-FOL-SENTENCES-DATA", 9, 0, false);
    //declareFunction(myName, "load_fol_sentences_analysis", "LOAD-FOL-SENTENCES-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "fol_sentences_input_item_type", "FOL-SENTENCES-INPUT-ITEM-TYPE", 1, 0, false);
    //declareFunction(myName, "fol_sentences_analysis_nmerge_fol_sentences_data", "FOL-SENTENCES-ANALYSIS-NMERGE-FOL-SENTENCES-DATA", 2, 0, false);
    //declareFunction(myName, "fol_sentences_to_file", "FOL-SENTENCES-TO-FILE", 3, 0, false);
    //declareFunction(myName, "fol_sentences_to_stream", "FOL-SENTENCES-TO-STREAM", 2, 1, false);
    //declareFunction(myName, "fol_sentences_symbol_count", "FOL-SENTENCES-SYMBOL-COUNT", 1, 0, false);
    //declareFunction(myName, "query_fol_sentence", "QUERY-FOL-SENTENCE", 2, 1, false);
    //declareFunction(myName, "fol_query_to_stream", "FOL-QUERY-TO-STREAM", 3, 1, false);
    //declareFunction(myName, "kbq_fol_sentence", "KBQ-FOL-SENTENCE", 1, 1, false);
    //declareFunction(myName, "kbq_fol_sentence_to_stream", "KBQ-FOL-SENTENCE-TO-STREAM", 3, 2, false);
    //declareFunction(myName, "assertion_fol_sentences_to_stream", "ASSERTION-FOL-SENTENCES-TO-STREAM", 2, 1, false);
    //declareFunction(myName, "make_and_postprocess_fol_sentences_datum", "MAKE-AND-POSTPROCESS-FOL-SENTENCES-DATUM", 6, 0, false);
    //declareFunction(myName, "make_fol_sentences_datum", "MAKE-FOL-SENTENCES-DATUM", 2, 0, false);
    //declareFunction(myName, "postprocess_fol_sentences_datum", "POSTPROCESS-FOL-SENTENCES-DATUM", 5, 0, false);
    //declareFunction(myName, "postprocess_fol_sentences_datum_output", "POSTPROCESS-FOL-SENTENCES-DATUM-OUTPUT", 3, 0, false);
    //declareFunction(myName, "postprocess_fol_sentences_datum_analysis", "POSTPROCESS-FOL-SENTENCES-DATUM-ANALYSIS", 3, 0, false);
    //declareFunction(myName, "possibly_save_fol_sentences_analysis", "POSSIBLY-SAVE-FOL-SENTENCES-ANALYSIS", 2, 0, false);
    //declareFunction(myName, "update_fol_analysis_counts", "UPDATE-FOL-ANALYSIS-COUNTS", 1, 0, false);
    //declareFunction(myName, "check_folification_properties", "CHECK-FOLIFICATION-PROPERTIES", 18, 0, false);
    //declareFunction(myName, "kb_fol_assertion_under_mt_ceilingP", "KB-FOL-ASSERTION-UNDER-MT-CEILING?", 2, 0, false);
    //declareFunction(myName, "kb_fol_under_mt_ceilingP", "KB-FOL-UNDER-MT-CEILING?", 2, 0, false);
    //declareFunction(myName, "assertion_fol_sentences", "ASSERTION-FOL-SENTENCES", 1, 0, false);
    //declareFunction(myName, "assertion_fol_sentences_int", "ASSERTION-FOL-SENTENCES-INT", 2, 0, false);
    //declareFunction(myName, "sentence_fol_sentences", "SENTENCE-FOL-SENTENCES", 2, 0, false);
    //declareFunction(myName, "fol_expand_sentence", "FOL-EXPAND-SENTENCE", 2, 0, false);
    //declareFunction(myName, "fol_expandible_expressionP", "FOL-EXPANDIBLE-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "fol_expandible_rmpP", "FOL-EXPANDIBLE-RMP?", 1, 0, false);
    //declareFunction(myName, "fol_expand_one_step", "FOL-EXPAND-ONE-STEP", 1, 1, false);
    //declareFunction(myName, "cnf_clausal_form_for_fol", "CNF-CLAUSAL-FORM-FOR-FOL", 2, 0, false);
    //declareFunction(myName, "cnf_fol_sentences", "CNF-FOL-SENTENCES", 2, 0, false);
    //declareFunction(myName, "partition_fol_unhandled_sentences", "PARTITION-FOL-UNHANDLED-SENTENCES", 1, 0, false);
    //declareFunction(myName, "fol_sentences_datum_update_rejection_statistics", "FOL-SENTENCES-DATUM-UPDATE-REJECTION-STATISTICS", 2, 0, false);
    //declareFunction(myName, "update_fol_rejection_statistics_for_expression", "UPDATE-FOL-REJECTION-STATISTICS-FOR-EXPRESSION", 2, 0, false);
    //declareFunction(myName, "print_folification_summary", "PRINT-FOLIFICATION-SUMMARY", 1, 1, false);
    //declareFunction(myName, "print_fol_rejection_statistics", "PRINT-FOL-REJECTION-STATISTICS", 1, 1, false);
    //declareFunction(myName, "pretty_print_fol_rejection_statistics", "PRETTY-PRINT-FOL-REJECTION-STATISTICS", 1, 1, false);
    //declareFunction(myName, "fol_unhandled_explanation", "FOL-UNHANDLED-EXPLANATION", 1, 0, false);
    //declareFunction(myName, "fol_unhandled_expression_p", "FOL-UNHANDLED-EXPRESSION-P", 1, 0, false);
    //declareFunction(myName, "contains_fol_unhandled_expression_p", "CONTAINS-FOL-UNHANDLED-EXPRESSION-P", 1, 0, false);
    //declareFunction(myName, "fol_unhandled", "FOL-UNHANDLED", 2, 0, false);
    //declareFunction(myName, "additional_gaf_fol_sentences", "ADDITIONAL-GAF-FOL-SENTENCES", 2, 0, false);
    //declareFunction(myName, "additional_arg_isa_or_arg_genl_sentences", "ADDITIONAL-ARG-ISA-OR-ARG-GENL-SENTENCES", 3, 0, false);
    //declareFunction(myName, "additional_result_isa_or_result_genl_sentences", "ADDITIONAL-RESULT-ISA-OR-RESULT-GENL-SENTENCES", 3, 0, false);
    //declareFunction(myName, "nonstandard_sentential_relation_p", "NONSTANDARD-SENTENTIAL-RELATION-P", 1, 0, false);
    //declareFunction(myName, "clear_fol_sequence_variable_args_for_arity", "CLEAR-FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 0, 0, false);
    //declareFunction(myName, "remove_fol_sequence_variable_args_for_arity", "REMOVE-FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
    //declareFunction(myName, "fol_sequence_variable_args_for_arity_internal", "FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-INTERNAL", 1, 0, false);
    //declareFunction(myName, "fol_sequence_variable_args_for_arity", "FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY", 1, 0, false);
    //declareFunction(myName, "kb_fol_additional_sentences_for_term", "KB-FOL-ADDITIONAL-SENTENCES-FOR-TERM", 3, 0, false);
    //declareMacro(myName, "do_arg_isa_gafs", "DO-ARG-ISA-GAFS");
    //declareFunction(myName, "kb_fol_predicate_arg_type_sentences", "KB-FOL-PREDICATE-ARG-TYPE-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_transitive_binary_predicate_sentences", "KB-FOL-TRANSITIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_symmetric_binary_predicate_sentences", "KB-FOL-SYMMETRIC-BINARY-PREDICATE-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_asymmetric_binary_predicate_sentences", "KB-FOL-ASYMMETRIC-BINARY-PREDICATE-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_reflexive_binary_predicate_sentences", "KB-FOL-REFLEXIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_irreflexive_binary_predicate_sentences", "KB-FOL-IRREFLEXIVE-BINARY-PREDICATE-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_tva_sentences", "KB-FOL-TVA-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_tva_sentences_int", "KB-FOL-TVA-SENTENCES-INT", 1, 0, false);
    //declareFunction(myName, "kb_fol_tva_pred_neg_lit", "KB-FOL-TVA-PRED-NEG-LIT", 2, 0, false);
    //declareFunction(myName, "kb_fol_tva_pred_pos_lit", "KB-FOL-TVA-PRED-POS-LIT", 2, 0, false);
    //declareFunction(myName, "replace_argnum_variable_formula", "REPLACE-ARGNUM-VARIABLE-FORMULA", 3, 0, false);
    //declareFunction(myName, "argnum_variable_formula", "ARGNUM-VARIABLE-FORMULA", 1, 0, false);
    //declareFunction(myName, "kb_fol_nat_function_sentences", "KB-FOL-NAT-FUNCTION-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_nat_argument_sentences", "KB-FOL-NAT-ARGUMENT-SENTENCES", 1, 0, false);
    //declareFunction(myName, "kb_fol_result_isa_sentences", "KB-FOL-RESULT-ISA-SENTENCES", 1, 0, false);
    //declareFunction(myName, "asent_sentence", "ASENT-SENTENCE", 3, 0, false);
    //declareFunction(myName, "asent_fol_sentence", "ASENT-FOL-SENTENCE", 3, 0, false);
    //declareFunction(myName, "genlmt_asent_fol_sentence", "GENLMT-ASENT-FOL-SENTENCE", 1, 0, false);
    //declareFunction(myName, "different_asent_fol_sentence", "DIFFERENT-ASENT-FOL-SENTENCE", 1, 0, false);
    //declareFunction(myName, "generic_asent_fol_sentence", "GENERIC-ASENT-FOL-SENTENCE", 3, 0, false);
    //declareFunction(myName, "isa_asent_fol_sentence", "ISA-ASENT-FOL-SENTENCE", 3, 0, false);
    //declareFunction(myName, "isa_asent_fol_sentence_as_isa", "ISA-ASENT-FOL-SENTENCE-AS-ISA", 3, 0, false);
    //declareFunction(myName, "isa_asent_fol_sentence_as_unary_predicate", "ISA-ASENT-FOL-SENTENCE-AS-UNARY-PREDICATE", 2, 0, false);
    //declareFunction(myName, "fol_transform_args", "FOL-TRANSFORM-ARGS", 1, 0, false);
    //declareFunction(myName, "fol_transform_arg", "FOL-TRANSFORM-ARG", 1, 0, false);
    //declareFunction(myName, "fol_transform_microtheory", "FOL-TRANSFORM-MICROTHEORY", 1, 0, false);
    //declareFunction(myName, "asent_set_sentence", "ASENT-SET-SENTENCE", 3, 0, false);
    //declareFunction(myName, "genlmt_asent_set_sentence", "GENLMT-ASENT-SET-SENTENCE", 1, 0, false);
    //declareFunction(myName, "generic_asent_set_sentence", "GENERIC-ASENT-SET-SENTENCE", 3, 0, false);
    //declareFunction(myName, "isa_asent_set_sentence", "ISA-ASENT-SET-SENTENCE", 3, 0, false);
    //declareFunction(myName, "different_asent_set_sentence", "DIFFERENT-ASENT-SET-SENTENCE", 1, 0, false);
    //declareFunction(myName, "set_transform_args", "SET-TRANSFORM-ARGS", 1, 0, false);
    //declareFunction(myName, "set_transform_function", "SET-TRANSFORM-FUNCTION", 1, 0, false);
    //declareFunction(myName, "set_transform_arg", "SET-TRANSFORM-ARG", 1, 0, false);
    //declareFunction(myName, "set_transform_microtheory", "SET-TRANSFORM-MICROTHEORY", 1, 0, false);
    //declareFunction(myName, "set_transform_predicate", "SET-TRANSFORM-PREDICATE", 2, 0, false);
    //declareFunction(myName, "fol_transform_predicate", "FOL-TRANSFORM-PREDICATE", 2, 0, false);
    //declareFunction(myName, "fol_transform_col_as_predicate", "FOL-TRANSFORM-COL-AS-PREDICATE", 2, 0, false);
    //declareFunction(myName, "fol_transform_function", "FOL-TRANSFORM-FUNCTION", 1, 0, false);
    //declareFunction(myName, "fol_term_p", "FOL-TERM-P", 1, 0, false);
    //declareFunction(myName, "fol_represented_term_p", "FOL-REPRESENTED-TERM-P", 1, 0, false);
    //declareFunction(myName, "fol_unrepresented_term_p", "FOL-UNREPRESENTED-TERM-P", 1, 0, false);
    //declareFunction(myName, "make_fol_atomic_term", "MAKE-FOL-ATOMIC-TERM", 1, 0, false);
    //declareFunction(myName, "fol_atomic_term_p", "FOL-ATOMIC-TERM-P", 1, 0, false);
    //declareFunction(myName, "make_fol_predicate", "MAKE-FOL-PREDICATE", 2, 0, false);
    //declareFunction(myName, "fol_predicate_p", "FOL-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "make_fol_function", "MAKE-FOL-FUNCTION", 2, 0, false);
    //declareFunction(myName, "fol_function_p", "FOL-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "fol_function_arity", "FOL-FUNCTION-ARITY", 1, 0, false);
    //declareFunction(myName, "make_fol_string", "MAKE-FOL-STRING", 1, 0, false);
    //declareFunction(myName, "fol_string_p", "FOL-STRING-P", 1, 0, false);
    //declareFunction(myName, "fol_string_constant_p", "FOL-STRING-CONSTANT-P", 1, 0, false);
    //declareFunction(myName, "make_fol_number", "MAKE-FOL-NUMBER", 1, 0, false);
    //declareFunction(myName, "fol_number_p", "FOL-NUMBER-P", 1, 0, false);
    //declareFunction(myName, "fol_number_constant_p", "FOL-NUMBER-CONSTANT-P", 1, 0, false);
    //declareFunction(myName, "fol_cafP", "FOL-CAF?", 1, 0, false);
    //declareFunction(myName, "fol_atomic_sentenceP", "FOL-ATOMIC-SENTENCE?", 1, 0, false);
    //declareFunction(myName, "fol_closedP", "FOL-CLOSED?", 1, 0, false);
    //declareFunction(myName, "fol_sentences_data_mentioning_term", "FOL-SENTENCES-DATA-MENTIONING-TERM", 2, 0, false);
    //declareFunction(myName, "all_fol_predicates_and_arguments_mentioned_in_analysis", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "all_fol_predicates_and_arguments_mentioned_in_analysis_data", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSIS-DATA", 1, 0, false);
    //declareFunction(myName, "all_fol_predicates_and_arguments_mentioned_in_fol_datum", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOL-DATUM", 1, 0, false);
    //declareFunction(myName, "all_fol_predicates_and_arguments_mentioned_in_fol_sentences", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOL-SENTENCES", 1, 1, false);
    //declareFunction(myName, "all_fol_predicates_and_arguments_mentioned_in_focycl_sentence", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-FOCYCL-SENTENCE", 2, 0, false);
    //declareFunction(myName, "fol_header_to_stream", "FOL-HEADER-TO-STREAM", 3, 0, false);
    //declareFunction(myName, "fol_datum_to_stream", "FOL-DATUM-TO-STREAM", 3, 0, false);
    //declareFunction(myName, "fol_sentences_to_cycl_stream", "FOL-SENTENCES-TO-CYCL-STREAM", 2, 0, false);
    //declareFunction(myName, "fol_header_to_cycl_stream", "FOL-HEADER-TO-CYCL-STREAM", 2, 0, false);
    //declareFunction(myName, "fol_datum_to_cycl_stream", "FOL-DATUM-TO-CYCL-STREAM", 2, 0, false);
    //declareFunction(myName, "fol_query_to_cycl_stream", "FOL-QUERY-TO-CYCL-STREAM", 3, 0, false);
    //declareFunction(myName, "assertions_to_tptp_stream", "ASSERTIONS-TO-TPTP-STREAM", 2, 0, false);
    //declareFunction(myName, "fol_sentences_to_tptp_stream", "FOL-SENTENCES-TO-TPTP-STREAM", 2, 0, false);
    //declareFunction(myName, "fol_header_to_tptp_stream", "FOL-HEADER-TO-TPTP-STREAM", 2, 0, false);
    //declareFunction(myName, "fol_datum_to_tptp_stream", "FOL-DATUM-TO-TPTP-STREAM", 2, 0, false);
    //declareFunction(myName, "output_tptp_term_comment", "OUTPUT-TPTP-TERM-COMMENT", 2, 0, false);
    //declareFunction(myName, "fol_query_to_tptp_stream", "FOL-QUERY-TO-TPTP-STREAM", 3, 0, false);
    //declareFunction(myName, "fol_generate_tptp_header", "FOL-GENERATE-TPTP-HEADER", 1, 0, false);
    //declareFunction(myName, "fol_tptp_header_add_field", "FOL-TPTP-HEADER-ADD-FIELD", 3, 0, false);
    //declareFunction(myName, "fol_tptp_header_add_blankline", "FOL-TPTP-HEADER-ADD-BLANKLINE", 1, 0, false);
    //declareFunction(myName, "clear_compute_tptp_query_index_number", "CLEAR-COMPUTE-TPTP-QUERY-INDEX-NUMBER", 0, 0, false);
    //declareFunction(myName, "remove_compute_tptp_query_index_number", "REMOVE-COMPUTE-TPTP-QUERY-INDEX-NUMBER", 1, 0, false);
    //declareFunction(myName, "compute_tptp_query_index_number_internal", "COMPUTE-TPTP-QUERY-INDEX-NUMBER-INTERNAL", 1, 0, false);
    //declareFunction(myName, "compute_tptp_query_index_number", "COMPUTE-TPTP-QUERY-INDEX-NUMBER", 1, 0, false);
    //declareFunction(myName, "output_focycl_as_tptp", "OUTPUT-FOCYCL-AS-TPTP", 3, 0, false);
    //declareFunction(myName, "output_fol_query_as_tptp", "OUTPUT-FOL-QUERY-AS-TPTP", 3, 0, false);
    //declareFunction(myName, "output_tptp_axiom", "OUTPUT-TPTP-AXIOM", 3, 0, false);
    //declareFunction(myName, "tptp_axiom_id", "TPTP-AXIOM-ID", 1, 0, false);
    //declareFunction(myName, "output_tptp_query", "OUTPUT-TPTP-QUERY", 3, 0, false);
    //declareFunction(myName, "output_tptp_sentence_recursive", "OUTPUT-TPTP-SENTENCE-RECURSIVE", 2, 0, false);
    //declareFunction(myName, "output_tptp_arg", "OUTPUT-TPTP-ARG", 2, 0, false);
    //declareFunction(myName, "output_tptp_nat", "OUTPUT-TPTP-NAT", 2, 0, false);
    //declareFunction(myName, "output_tptp_predicate", "OUTPUT-TPTP-PREDICATE", 2, 0, false);
    //declareFunction(myName, "output_tptp_function", "OUTPUT-TPTP-FUNCTION", 2, 0, false);
    //declareFunction(myName, "output_tptp_zero_arity_function", "OUTPUT-TPTP-ZERO-ARITY-FUNCTION", 2, 0, false);
    //declareFunction(myName, "output_tptp_atomic_term", "OUTPUT-TPTP-ATOMIC-TERM", 2, 0, false);
    //declareFunction(myName, "output_tptp_string_constant", "OUTPUT-TPTP-STRING-CONSTANT", 2, 0, false);
    //declareFunction(myName, "output_tptp_string", "OUTPUT-TPTP-STRING", 2, 0, false);
    //declareFunction(myName, "output_tptp_number_constant", "OUTPUT-TPTP-NUMBER-CONSTANT", 2, 0, false);
    //declareFunction(myName, "output_tptp_number", "OUTPUT-TPTP-NUMBER", 2, 0, false);
    //declareFunction(myName, "output_tptp_variable", "OUTPUT-TPTP-VARIABLE", 2, 0, false);
    //declareFunction(myName, "fol_tptp_el_var_name", "FOL-TPTP-EL-VAR-NAME", 1, 0, false);
    //declareFunction(myName, "tptp_string_stringify", "TPTP-STRING-STRINGIFY", 1, 0, false);
    //declareFunction(myName, "clear_tptp_long_symbol_name_cache", "CLEAR-TPTP-LONG-SYMBOL-NAME-CACHE", 0, 0, false);
    //declareFunction(myName, "make_tptp_symbol_name", "MAKE-TPTP-SYMBOL-NAME", 1, 0, false);
    //declareFunction(myName, "tptp_downcase_stringify", "TPTP-DOWNCASE-STRINGIFY", 1, 0, false);
    //declareFunction(myName, "tptp_upcase_stringify", "TPTP-UPCASE-STRINGIFY", 1, 0, false);
    //declareFunction(myName, "tptp_number_stringify", "TPTP-NUMBER-STRINGIFY", 1, 0, false);
    //declareFunction(myName, "tptp_string_char_p", "TPTP-STRING-CHAR-P", 1, 0, false);
    //declareFunction(myName, "tptp_non_numeric_atom_char_p", "TPTP-NON-NUMERIC-ATOM-CHAR-P", 1, 0, false);
    //declareFunction(myName, "tptp_numeric_atom_char_p", "TPTP-NUMERIC-ATOM-CHAR-P", 1, 0, false);
    //declareFunction(myName, "focycl_to_cycl", "FOCYCL-TO-CYCL", 1, 0, false);
    //declareFunction(myName, "generate_symbol_index_file_from_kb", "GENERATE-SYMBOL-INDEX-FILE-FROM-KB", 1, 1, false);
    //declareFunction(myName, "fol_sentence_allowed_by_horn_handling", "FOL-SENTENCE-ALLOWED-BY-HORN-HANDLING", 2, 0, false);
    //declareFunction(myName, "generate_symbol_index_file_from_kb_int", "GENERATE-SYMBOL-INDEX-FILE-FROM-KB-INT", 7, 0, false);
    //declareFunction(myName, "categorize_fol_terms", "CATEGORIZE-FOL-TERMS", 1, 0, false);
    //declareFunction(myName, "categorize_fol_terms_int", "CATEGORIZE-FOL-TERMS-INT", 1, 0, false);
    //declareFunction(myName, "print_symbol_index_term_string", "PRINT-SYMBOL-INDEX-TERM-STRING", 3, 0, false);
    //declareFunction(myName, "fol_constant_string", "FOL-CONSTANT-STRING", 1, 0, false);
    //declareFunction(myName, "clear_fol_nart_string", "CLEAR-FOL-NART-STRING", 0, 0, false);
    //declareFunction(myName, "remove_fol_nart_string", "REMOVE-FOL-NART-STRING", 1, 0, false);
    //declareFunction(myName, "fol_nart_string_internal", "FOL-NART-STRING-INTERNAL", 1, 0, false);
    //declareFunction(myName, "fol_nart_string", "FOL-NART-STRING", 1, 0, false);
    //declareFunction(myName, "write_deepak_opencyc_queries", "WRITE-DEEPAK-OPENCYC-QUERIES", 2, 0, false);
    //declareFunction(myName, "deepak_kb_fol_sentences", "DEEPAK-KB-FOL-SENTENCES", 0, 1, false);
    //declareFunction(myName, "deepak_fol_query_to_tptp_stream", "DEEPAK-FOL-QUERY-TO-TPTP-STREAM", 3, 1, false);
    //declareFunction(myName, "deepak_assertion_fol_sentences", "DEEPAK-ASSERTION-FOL-SENTENCES", 1, 0, false);
    //declareFunction(myName, "deepak_queries_timing_test", "DEEPAK-QUERIES-TIMING-TEST", 0, 0, false);
    //declareFunction(myName, "deepak_queries_timing_test_2", "DEEPAK-QUERIES-TIMING-TEST-2", 0, 3, false);
    //declareFunction(myName, "deepak_queries_timing_test_int", "DEEPAK-QUERIES-TIMING-TEST-INT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_folification_file() {
    $folification_version$ = deflexical("*FOLIFICATION-VERSION*", $str0$0_7_2);
    $fol_translation_type$ = defparameter("*FOL-TRANSLATION-TYPE*", $kw1$REGULAR_FOL);
    $fol_mt_handling$ = defparameter("*FOL-MT-HANDLING*", $kw3$MT_VISIBLE_EXCEPT_CORE_MTS);
    $fol_isa_handling$ = defparameter("*FOL-ISA-HANDLING*", $kw6$UNARY_PREDICATE);
    $fol_rmp_handling$ = defparameter("*FOL-RMP-HANDLING*", $kw8$GAF);
    $fol_string_handling$ = defparameter("*FOL-STRING-HANDLING*", $kw10$ALLOWED);
    $fol_number_handling$ = defparameter("*FOL-NUMBER-HANDLING*", $kw12$DWIM_FLOATS_TO_DISTINCT_CONSTANTS);
    $unfolifiable_terms$ = deflexical("*UNFOLIFIABLE-TERMS*", $list14);
    $folification_unhandled_explanation_table$ = deflexical("*FOLIFICATION-UNHANDLED-EXPLANATION-TABLE*", $list15);
    $fol_output_formats$ = deflexical("*FOL-OUTPUT-FORMATS*", $list16);
    $tptp_query_name$ = defparameter("*TPTP-QUERY-NAME*", NIL);
    $tptp_axiom_prefix$ = defparameter("*TPTP-AXIOM-PREFIX*", NIL);
    $tptp_axiom_count$ = defparameter("*TPTP-AXIOM-COUNT*", NIL);
    $candidate_sentence_count$ = defparameter("*CANDIDATE-SENTENCE-COUNT*", NIL);
    $handled_sentence_count$ = defparameter("*HANDLED-SENTENCE-COUNT*", NIL);
    $term_count$ = defparameter("*TERM-COUNT*", NIL);
    $handled_term_count$ = defparameter("*HANDLED-TERM-COUNT*", NIL);
    $partially_handled_term_count$ = defparameter("*PARTIALLY-HANDLED-TERM-COUNT*", NIL);
    $unhandled_term_count$ = defparameter("*UNHANDLED-TERM-COUNT*", NIL);
    $fol_current_assertion$ = defparameter("*FOL-CURRENT-ASSERTION*", NIL);
    $fol_sequence_variable_args_for_arity_caching_state$ = deflexical("*FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-CACHING-STATE*", NIL);
    $compute_tptp_query_index_number_caching_state$ = deflexical("*COMPUTE-TPTP-QUERY-INDEX-NUMBER-CACHING-STATE*", NIL);
    $tptp_long_symbol_name_cache$ = deflexical("*TPTP-LONG-SYMBOL-NAME-CACHE*", maybeDefault( $sym329$_TPTP_LONG_SYMBOL_NAME_CACHE_, $tptp_long_symbol_name_cache$, ()-> (Hashtables.make_hash_table($int330$256, Symbols.symbol_function(EQUAL), UNPROVIDED))));
    $tptp_long_symbol_min_length$ = defparameter("*TPTP-LONG-SYMBOL-MIN-LENGTH*", $int330$256);
    $categorize_fol_predicates$ = defparameter("*CATEGORIZE-FOL-PREDICATES*", NIL);
    $categorize_fol_functions$ = defparameter("*CATEGORIZE-FOL-FUNCTIONS*", NIL);
    $categorize_fol_terms$ = defparameter("*CATEGORIZE-FOL-TERMS*", NIL);
    $fol_nart_string_caching_state$ = deflexical("*FOL-NART-STRING-CACHING-STATE*", NIL);
    $deepak_folification_properties$ = deflexical("*DEEPAK-FOLIFICATION-PROPERTIES*", $list355);
    $deepak_queries$ = deflexical("*DEEPAK-QUERIES*", $list357);
    $deepak_queries_2$ = deflexical("*DEEPAK-QUERIES-2*", $list358);
    return NIL;
  }

  public static final SubLObject setup_folification_file() {
    // CVS_ID("Id: folification.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    memoization_state.note_globally_cached_function($sym157$FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY);
    memoization_state.note_globally_cached_function($sym286$COMPUTE_TPTP_QUERY_INDEX_NUMBER);
    subl_macro_promotions.declare_defglobal($sym329$_TPTP_LONG_SYMBOL_NAME_CACHE_);
    memoization_state.note_globally_cached_function($sym351$FOL_NART_STRING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$0_7_2 = makeString("0.7.2");
  public static final SubLSymbol $kw1$REGULAR_FOL = makeKeyword("REGULAR-FOL");
  public static final SubLList $list2 = list(makeKeyword("REGULAR-FOL"), makeKeyword("SET-THEORY"));
  public static final SubLSymbol $kw3$MT_VISIBLE_EXCEPT_CORE_MTS = makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS");
  public static final SubLList $list4 = list(makeKeyword("MT-VISIBLE"), makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), makeKeyword("MT-ARGUMENT"), makeKeyword("FLAT"));
  public static final SubLSymbol $kw5$COLLAPSE = makeKeyword("COLLAPSE");
  public static final SubLSymbol $kw6$UNARY_PREDICATE = makeKeyword("UNARY-PREDICATE");
  public static final SubLList $list7 = list(makeKeyword("UNARY-PREDICATE"), makeKeyword("ISA"));
  public static final SubLSymbol $kw8$GAF = makeKeyword("GAF");
  public static final SubLList $list9 = list(makeKeyword("GAF"), makeKeyword("EXPANSION"), makeKeyword("GAF-AND-EXPANSION"));
  public static final SubLSymbol $kw10$ALLOWED = makeKeyword("ALLOWED");
  public static final SubLList $list11 = list(makeKeyword("ALLOWED"), makeKeyword("DWIM-TO-SINGLE-CONSTANT"), makeKeyword("DWIM-TO-DISTINCT-CONSTANTS"), makeKeyword("SKIP"));
  public static final SubLSymbol $kw12$DWIM_FLOATS_TO_DISTINCT_CONSTANTS = makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS");
  public static final SubLList $list13 = list(makeKeyword("ALLOWED"), makeKeyword("DWIM-FLOATS-TO-DISTINCT-CONSTANTS"), makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS"));
  public static final SubLList $list14 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("Quote")), constant_handles.reader_make_constant_shell(makeString("EscapeQuote")), constant_handles.reader_make_constant_shell(makeString("QuasiQuote")), constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn")), constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn")), constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerable")), constant_handles.reader_make_constant_shell(makeString("completelyEnumerableCollection")), constant_handles.reader_make_constant_shell(makeString("unknownSentence")), constant_handles.reader_make_constant_shell(makeString("evaluate")), constant_handles.reader_make_constant_shell(makeString("Nothing")), constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), constant_handles.reader_make_constant_shell(makeString("reformulatorEquiv"))});
  public static final SubLList $list15 = list(new SubLObject[] {makeKeyword("VARIABLE-ARITY-PREDICATE"), makeString("contained a variable-arity predicate with a maximum arity."), makeKeyword("VARIABLE-ARITY-FUNCTION"), makeString("contained a variable-arity function with a maximum arity."), makeKeyword("UNBOUNDED-ARITY-PREDICATE"), makeString("contained a variable-arity predicate with an unbounded arity."), makeKeyword("UNBOUNDED-ARITY-FUNCTION"), makeString("contained a variable-arity function with an unbounded arity."), makeKeyword("META-SENTENCE"), makeString("contained an embedded sentence used as a term."), makeKeyword("META-ASSERTION"), makeString("contained an embedded assertion used as a term."), makeKeyword("META-VARIABLE"), makeString("contained a meta-variable."), makeKeyword("SUBL-ESCAPE"), makeString("contained an escape to SubL (a hook into the underlying implentation language)"), makeKeyword("FUNCTION-ARG-CONSTRAINT"), makeString("expressed an argument constraint on a function, for which there is currently no FOL translation."), makeKeyword("FUNCTION-QUANTIFICATION"), makeString("quantified over functions."), makeKeyword("PREDICATE-QUANTIFICATION"), makeString("quantified over predicates."), makeKeyword("COLLECTION-QUANTIFICATION"), makeString("quantified into a collection, which is like quantifying over predicates."), makeKeyword("SEQUENCE-VAR"), makeString("contained a sequence variable"), makeKeyword("IST"), makeString("used the predicate #$ist, which is used to do quantification across contexts or contextual lifting."), makeKeyword("ILL-FORMED"), makeString("were ill-formed.  This illustrates a problem with the Cyc KB itself, not with the Cyc -> FOL conversion."), makeKeyword("NONSTANDARD-SENTENTIAL-RELATION"), makeString("contained a bounded existential, or a user-defined logical operator or quantifier"), makeKeyword("EXPANSION"), makeString("had an expansion that could not be translated"), makeKeyword("KAPPA"), makeString("contained Kappa, a predicate-denoting function"), makeKeyword("LAMBDA"), makeString("contained Lambda, a function-denoting function"), makeKeyword("EXPLICITLY-FORBIDDEN-TERM"), makeString("contained an explicitly forbidden term, function, or predicate")});
  public static final SubLList $list16 = list(makeKeyword("TPTP"), makeKeyword("CYCL"));
  public static final SubLSymbol $kw17$GENERATION_PROPERTIES = makeKeyword("GENERATION-PROPERTIES");
  public static final SubLSymbol $kw18$CANDIDATE_FOL_SENTENCE_COUNT = makeKeyword("CANDIDATE-FOL-SENTENCE-COUNT");
  public static final SubLSymbol $kw19$FOL_SENTENCE_COUNT = makeKeyword("FOL-SENTENCE-COUNT");
  public static final SubLSymbol $kw20$TERM_COUNT = makeKeyword("TERM-COUNT");
  public static final SubLSymbol $kw21$HANDLED_TERM_COUNT = makeKeyword("HANDLED-TERM-COUNT");
  public static final SubLSymbol $kw22$PARTIALLY_HANDLED_TERM_COUNT = makeKeyword("PARTIALLY-HANDLED-TERM-COUNT");
  public static final SubLSymbol $kw23$UNHANDLED_TERM_COUNT = makeKeyword("UNHANDLED-TERM-COUNT");
  public static final SubLSymbol $kw24$FOL_SENTENCES_DATA = makeKeyword("FOL-SENTENCES-DATA");
  public static final SubLSymbol $kw25$REJECTION_STATISTICS = makeKeyword("REJECTION-STATISTICS");
  public static final SubLSymbol $sym26$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym27$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym28$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLList $list29 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("TRANSLATION-TYPE"), makeSymbol("MT-HANDLING"), makeSymbol("MT-CEILING"), makeSymbol("ISA-HANDLING"), makeSymbol("RULE-MACRO-PREDICATE-HANDLING"), makeSymbol("STRING-HANDLING"), makeSymbol("NUMBER-HANDLING"), makeSymbol("ALLOW-EQUIV-RELATION?"), list(makeSymbol("SAMPLE-RATE"), ONE_INTEGER), makeSymbol("OUTPUT-FILENAME"), makeSymbol("OUTPUT-FORMAT"), makeSymbol("HEADER"), makeSymbol("ANALYSIS-FILENAME"), makeSymbol("ANALYSIS-FILE-INTERNAL?"), makeSymbol("INCLUDE-COMMENTS?"), makeSymbol("RETURN-DATA?"), list(makeSymbol("NEGATE-QUERIES?"), T), list(makeSymbol("VERBOSE?"), T)});
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("TRANSLATION-TYPE"), makeKeyword("MT-HANDLING"), makeKeyword("MT-CEILING"), makeKeyword("ISA-HANDLING"), makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("STRING-HANDLING"), makeKeyword("NUMBER-HANDLING"), makeKeyword("ALLOW-EQUIV-RELATION?"), makeKeyword("SAMPLE-RATE"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("HEADER"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("ANALYSIS-FILE-INTERNAL?"), makeKeyword("INCLUDE-COMMENTS?"), makeKeyword("RETURN-DATA?"), makeKeyword("NEGATE-QUERIES?"), makeKeyword("VERBOSE?")});
  public static final SubLSymbol $kw31$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw32$TRANSLATION_TYPE = makeKeyword("TRANSLATION-TYPE");
  public static final SubLSymbol $kw33$MT_HANDLING = makeKeyword("MT-HANDLING");
  public static final SubLSymbol $kw34$MT_CEILING = makeKeyword("MT-CEILING");
  public static final SubLSymbol $kw35$ISA_HANDLING = makeKeyword("ISA-HANDLING");
  public static final SubLSymbol $kw36$RULE_MACRO_PREDICATE_HANDLING = makeKeyword("RULE-MACRO-PREDICATE-HANDLING");
  public static final SubLSymbol $kw37$STRING_HANDLING = makeKeyword("STRING-HANDLING");
  public static final SubLSymbol $kw38$NUMBER_HANDLING = makeKeyword("NUMBER-HANDLING");
  public static final SubLSymbol $kw39$ALLOW_EQUIV_RELATION_ = makeKeyword("ALLOW-EQUIV-RELATION?");
  public static final SubLSymbol $kw40$SAMPLE_RATE = makeKeyword("SAMPLE-RATE");
  public static final SubLSymbol $kw41$OUTPUT_FILENAME = makeKeyword("OUTPUT-FILENAME");
  public static final SubLSymbol $kw42$OUTPUT_FORMAT = makeKeyword("OUTPUT-FORMAT");
  public static final SubLSymbol $kw43$HEADER = makeKeyword("HEADER");
  public static final SubLSymbol $kw44$ANALYSIS_FILENAME = makeKeyword("ANALYSIS-FILENAME");
  public static final SubLSymbol $kw45$ANALYSIS_FILE_INTERNAL_ = makeKeyword("ANALYSIS-FILE-INTERNAL?");
  public static final SubLSymbol $kw46$INCLUDE_COMMENTS_ = makeKeyword("INCLUDE-COMMENTS?");
  public static final SubLSymbol $kw47$RETURN_DATA_ = makeKeyword("RETURN-DATA?");
  public static final SubLSymbol $kw48$NEGATE_QUERIES_ = makeKeyword("NEGATE-QUERIES?");
  public static final SubLSymbol $kw49$VERBOSE_ = makeKeyword("VERBOSE?");
  public static final SubLSymbol $kw50$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str51$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str52$Converting_assertions_to_FOL = makeString("Converting assertions to FOL");
  public static final SubLSymbol $kw53$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym54$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str55$failed_to_translate__s__ = makeString("failed to translate ~s~%");
  public static final SubLString $str56$Converting_sentences_to_FOL = makeString("Converting sentences to FOL");
  public static final SubLObject $const57$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLString $str58$failed_to_translate__s = makeString("failed to translate ~s");
  public static final SubLSymbol $sym59$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const60$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLString $str61$Converting_forts_to_FOL = makeString("Converting forts to FOL");
  public static final SubLSymbol $sym62$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw63$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw64$ANALYSIS = makeKeyword("ANALYSIS");
  public static final SubLString $str65$Expected_a_fol_sentences_analysis = makeString("Expected a fol-sentences-analysis as the first loaded item");
  public static final SubLSymbol $kw66$EOF = makeKeyword("EOF");
  public static final SubLSymbol $kw67$DATUM = makeKeyword("DATUM");
  public static final SubLString $str68$expected_to_input_a_cons__got__s = makeString("expected to input a cons, got ~s");
  public static final SubLSymbol $kw69$CYCL = makeKeyword("CYCL");
  public static final SubLSymbol $kw70$TPTP = makeKeyword("TPTP");
  public static final SubLString $str71$Unrecognized_output_format___s = makeString("Unrecognized output format: ~s");
  public static final SubLString $str72$Gathering_FOL_symbols = makeString("Gathering FOL symbols");
  public static final SubLList $list73 = list(makeSymbol("TERM"), makeSymbol("FOL-SENTENCES"), makeSymbol("&OPTIONAL"), makeSymbol("UNHANDLED-FOL-SENTENCES"));
  public static final SubLSymbol $sym74$FOL_REPRESENTED_TERM_P = makeSymbol("FOL-REPRESENTED-TERM-P");
  public static final SubLList $list75 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("TRANSLATION-TYPE"), makeSymbol("MT-HANDLING"), makeSymbol("MT-CEILING"), makeSymbol("ISA-HANDLING"), makeSymbol("RULE-MACRO-PREDICATE-HANDLING"), makeSymbol("STRING-HANDLING"), makeSymbol("NUMBER-HANDLING"), makeSymbol("ALLOW-EQUIV-RELATION?"), list(makeSymbol("SAMPLE-RATE"), ONE_INTEGER), makeSymbol("OUTPUT-FILENAME"), makeSymbol("OUTPUT-FORMAT"), makeSymbol("HEADER"), makeSymbol("INCLUDE-COMMENTS?"), list(makeSymbol("NEGATE-QUERIES?"), T), list(makeSymbol("VERBOSE?"), T)});
  public static final SubLList $list76 = list(new SubLObject[] {makeKeyword("TRANSLATION-TYPE"), makeKeyword("MT-HANDLING"), makeKeyword("MT-CEILING"), makeKeyword("ISA-HANDLING"), makeKeyword("RULE-MACRO-PREDICATE-HANDLING"), makeKeyword("STRING-HANDLING"), makeKeyword("NUMBER-HANDLING"), makeKeyword("ALLOW-EQUIV-RELATION?"), makeKeyword("SAMPLE-RATE"), makeKeyword("OUTPUT-FILENAME"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("HEADER"), makeKeyword("INCLUDE-COMMENTS?"), makeKeyword("NEGATE-QUERIES?"), makeKeyword("VERBOSE?")});
  public static final SubLList $list77 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLSymbol $kw78$MT_ARGUMENT = makeKeyword("MT-ARGUMENT");
  public static final SubLObject $const79$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $sym80$_MT = makeSymbol("?MT");
  public static final SubLSymbol $kw81$MT_VISIBLE = makeKeyword("MT-VISIBLE");
  public static final SubLObject $const82$mtVisible = constant_handles.reader_make_constant_shell(makeString("mtVisible"));
  public static final SubLSymbol $kw83$FLAT = makeKeyword("FLAT");
  public static final SubLSymbol $kw84$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLString $str85$can_t_handle_conditional_sentence = makeString("can't handle conditional sentences~%");
  public static final SubLSymbol $kw86$TESTING = makeKeyword("TESTING");
  public static final SubLSymbol $sym87$FOL_TRANSLATION_TYPE_PROPERTY_P = makeSymbol("FOL-TRANSLATION-TYPE-PROPERTY-P");
  public static final SubLSymbol $sym88$FOL_MT_HANDLING_PROPERTY_P = makeSymbol("FOL-MT-HANDLING-PROPERTY-P");
  public static final SubLSymbol $sym89$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym90$FOL_ISA_HANDLING_PROPERTY_P = makeSymbol("FOL-ISA-HANDLING-PROPERTY-P");
  public static final SubLSymbol $sym91$FOL_RMP_HANDLING_PROPERTY_P = makeSymbol("FOL-RMP-HANDLING-PROPERTY-P");
  public static final SubLSymbol $sym92$FOL_STRING_HANDLING_PROPERTY_P = makeSymbol("FOL-STRING-HANDLING-PROPERTY-P");
  public static final SubLSymbol $sym93$FOL_NUMBER_HANDLING_PROPERTY_P = makeSymbol("FOL-NUMBER-HANDLING-PROPERTY-P");
  public static final SubLSymbol $sym94$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym95$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym96$FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");
  public static final SubLSymbol $sym97$FOL_OUTPUT_FORMAT_P = makeSymbol("FOL-OUTPUT-FORMAT-P");
  public static final SubLSymbol $kw98$EXPANSION = makeKeyword("EXPANSION");
  public static final SubLSymbol $kw99$GAF_AND_EXPANSION = makeKeyword("GAF-AND-EXPANSION");
  public static final SubLObject $const100$resultIsaArg = constant_handles.reader_make_constant_shell(makeString("resultIsaArg"));
  public static final SubLObject $const101$RelationAllExistsFn = constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn"));
  public static final SubLList $list102 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")), makeSymbol("?DEP-COL")));
  public static final SubLObject $const103$RelationExistsAllFn = constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn"));
  public static final SubLList $list104 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL")), list(constant_handles.reader_make_constant_shell(makeString("relationExistsAll")), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), makeSymbol("?DEP-COL")));
  public static final SubLSymbol $kw105$EXPLICITLY_FORBIDDEN_TERM = makeKeyword("EXPLICITLY-FORBIDDEN-TERM");
  public static final SubLSymbol $sym106$FOL_EXPANDIBLE_EXPRESSION_ = makeSymbol("FOL-EXPANDIBLE-EXPRESSION?");
  public static final SubLSymbol $sym107$FOL_EXPAND_ONE_STEP = makeSymbol("FOL-EXPAND-ONE-STEP");
  public static final SubLObject $const108$expansion = constant_handles.reader_make_constant_shell(makeString("expansion"));
  public static final SubLList $list109 = list(makeSymbol("COLLAPSE"), makeSymbol("THEORY-MT"));
  public static final SubLSymbol $kw110$NOT_IN_THEORY = makeKeyword("NOT-IN-THEORY");
  public static final SubLSymbol $sym111$FOL_UNHANDLED_EXPRESSION_P = makeSymbol("FOL-UNHANDLED-EXPRESSION-P");
  public static final SubLList $list112 = list(makeSymbol("FOL-UNHANDLED-FN"), makeSymbol("REASON"), makeSymbol("CULPRIT"));
  public static final SubLString $str113$___a__ = makeString("~%~a~%");
  public static final SubLString $str114$FOLification_statistics = makeString("FOLification statistics");
  public static final SubLString $str115$_a__ = makeString("~a~%");
  public static final SubLString $str116$_______________________ = makeString("-----------------------");
  public static final SubLString $str117$Rejection_statistics__raw__ = makeString("Rejection statistics (raw):");
  public static final SubLString $str118$Rejection_statistics__pretty__ = makeString("Rejection statistics (pretty):");
  public static final SubLString $str119$Conversion_statistics_ = makeString("Conversion statistics:");
  public static final SubLSymbol $sym120$_ = makeSymbol(">");
  public static final SubLList $list121 = cons(makeSymbol("REASON"), makeSymbol("COUNT"));
  public static final SubLString $str122$_s_assertion_p_could_not_be_conve = makeString("~s assertion~p could not be converted to FOL because ~a ~a~%");
  public static final SubLString $str123$it = makeString("it");
  public static final SubLString $str124$they = makeString("they");
  public static final SubLString $str125$yielded_the_rejection_condition_ = makeString("yielded the rejection condition ");
  public static final SubLObject $const126$FOL_UnhandledFn = constant_handles.reader_make_constant_shell(makeString("FOL-UnhandledFn"));
  public static final SubLList $list127 = cons(makeSymbol("PREDICATE"), makeSymbol("ARGS"));
  public static final SubLObject $const128$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLList $list129 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLObject $const130$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLList $list131 = list(NIL);
  public static final SubLObject $const132$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));
  public static final SubLObject $const133$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));
  public static final SubLObject $const134$arg3Isa = constant_handles.reader_make_constant_shell(makeString("arg3Isa"));
  public static final SubLObject $const135$arg4Isa = constant_handles.reader_make_constant_shell(makeString("arg4Isa"));
  public static final SubLObject $const136$arg5Isa = constant_handles.reader_make_constant_shell(makeString("arg5Isa"));
  public static final SubLObject $const137$arg6Isa = constant_handles.reader_make_constant_shell(makeString("arg6Isa"));
  public static final SubLObject $const138$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const139$arg1Genl = constant_handles.reader_make_constant_shell(makeString("arg1Genl"));
  public static final SubLObject $const140$arg2Genl = constant_handles.reader_make_constant_shell(makeString("arg2Genl"));
  public static final SubLObject $const141$arg3Genl = constant_handles.reader_make_constant_shell(makeString("arg3Genl"));
  public static final SubLObject $const142$arg4Genl = constant_handles.reader_make_constant_shell(makeString("arg4Genl"));
  public static final SubLObject $const143$arg5Genl = constant_handles.reader_make_constant_shell(makeString("arg5Genl"));
  public static final SubLObject $const144$arg6Genl = constant_handles.reader_make_constant_shell(makeString("arg6Genl"));
  public static final SubLObject $const145$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const146$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLObject $const147$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));
  public static final SubLObject $const148$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLObject $const149$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const150$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLList $list151 = list(makeSymbol("PRED"), makeSymbol("COL"));
  public static final SubLSymbol $kw152$FUNCTION_ARG_CONSTRAINT = makeKeyword("FUNCTION-ARG-CONSTRAINT");
  public static final SubLSymbol $kw153$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLSymbol $kw154$NONSTANDARD_SENTENTIAL_RELATION = makeKeyword("NONSTANDARD-SENTENTIAL-RELATION");
  public static final SubLSymbol $kw155$UNEXPECTED = makeKeyword("UNEXPECTED");
  public static final SubLList $list156 = list(makeSymbol("FUNC"), makeSymbol("COL"));
  public static final SubLSymbol $sym157$FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY = makeSymbol("FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY");
  public static final SubLString $str158$ARG = makeString("ARG");
  public static final SubLSymbol $sym159$_FOL_SEQUENCE_VARIABLE_ARGS_FOR_ARITY_CACHING_STATE_ = makeSymbol("*FOL-SEQUENCE-VARIABLE-ARGS-FOR-ARITY-CACHING-STATE*");
  public static final SubLSymbol $kw160$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const161$equiv = constant_handles.reader_make_constant_shell(makeString("equiv"));
  public static final SubLList $list162 = list(constant_handles.reader_make_constant_shell(makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell(makeString("isa")), TWO_INTEGER);
  public static final SubLSymbol $sym163$_X = makeSymbol("?X");
  public static final SubLObject $const164$FOL_PredicateFn = constant_handles.reader_make_constant_shell(makeString("FOL-PredicateFn"));
  public static final SubLList $list165 = list(ONE_INTEGER);
  public static final SubLList $list166 = list(makeSymbol("?X"));
  public static final SubLObject $const167$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLList $list168 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(list(constant_handles.reader_make_constant_shell(makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell(makeString("mtVisible")), ONE_INTEGER), makeSymbol("?SPEC-MT")), list(list(constant_handles.reader_make_constant_shell(makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell(makeString("genlMt")), TWO_INTEGER), makeSymbol("?SPEC-MT"), makeSymbol("?GENL-MT"))), list(list(constant_handles.reader_make_constant_shell(makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell(makeString("mtVisible")), ONE_INTEGER), makeSymbol("?GENL-MT")));
  public static final SubLList $list169 = list(makeKeyword("MT-VISIBLE"), makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"));
  public static final SubLList $list170 = list(constant_handles.reader_make_constant_shell(makeString("FOL-PredicateFn")), constant_handles.reader_make_constant_shell(makeString("mtVisible")), ONE_INTEGER);
  public static final SubLList $list171 = list(list(makeSymbol("GAF-VAR"), makeSymbol("ARGNUM-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym172$ARGNUM_1 = makeUninternedSymbol("ARGNUM-1");
  public static final SubLSymbol $sym173$ARG_ISA_PRED = makeUninternedSymbol("ARG-ISA-PRED");
  public static final SubLSymbol $sym174$ARITY = makeUninternedSymbol("ARITY");
  public static final SubLSymbol $sym175$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym176$FIXED_ARITY_PREDICATE_P = makeSymbol("FIXED-ARITY-PREDICATE-P");
  public static final SubLSymbol $sym177$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym178$ARITY = makeSymbol("ARITY");
  public static final SubLSymbol $sym179$CDOTIMES = makeSymbol("CDOTIMES");
  public static final SubLSymbol $sym180$1_ = makeSymbol("1+");
  public static final SubLSymbol $sym181$ARG_ISA_PRED = makeSymbol("ARG-ISA-PRED");
  public static final SubLSymbol $sym182$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLSymbol $kw183$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLList $list184 = list(makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("TRUTH"), makeKeyword("TRUE"));
  public static final SubLSymbol $kw185$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym186$_INS = makeSymbol("?INS");
  public static final SubLList $list187 = list(makeSymbol("?X"), makeSymbol("?Y"));
  public static final SubLList $list188 = list(makeSymbol("?Y"), makeSymbol("?Z"));
  public static final SubLList $list189 = list(makeSymbol("?X"), makeSymbol("?Z"));
  public static final SubLList $list190 = list(makeSymbol("?Y"), makeSymbol("?X"));
  public static final SubLList $list191 = list(makeSymbol("?X"), makeSymbol("?X"));
  public static final SubLObject $const192$transitiveViaArg = constant_handles.reader_make_constant_shell(makeString("transitiveViaArg"));
  public static final SubLObject $const193$transitiveViaArgInverse = constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse"));
  public static final SubLList $list194 = list(makeSymbol("?OLD"), makeSymbol("?NEW"));
  public static final SubLList $list195 = list(makeSymbol("?NEW"), makeSymbol("?OLD"));
  public static final SubLSymbol $sym196$_OLD = makeSymbol("?OLD");
  public static final SubLSymbol $sym197$_NEW = makeSymbol("?NEW");
  public static final SubLObject $const198$natFunction = constant_handles.reader_make_constant_shell(makeString("natFunction"));
  public static final SubLObject $const199$natArgument = constant_handles.reader_make_constant_shell(makeString("natArgument"));
  public static final SubLSymbol $kw200$SET_THEORY = makeKeyword("SET-THEORY");
  public static final SubLSymbol $kw201$SEQUENCE_VAR = makeKeyword("SEQUENCE-VAR");
  public static final SubLObject $const202$different = constant_handles.reader_make_constant_shell(makeString("different"));
  public static final SubLSymbol $sym203$FOL_TRANSFORM_ARG = makeSymbol("FOL-TRANSFORM-ARG");
  public static final SubLObject $const204$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLList $list205 = list(makeSymbol("NEW-ARG1"), makeSymbol("NEW-ARG2"));
  public static final SubLSymbol $kw206$ISA = makeKeyword("ISA");
  public static final SubLList $list207 = list(makeSymbol("TERM"), makeSymbol("COL"));
  public static final SubLSymbol $kw208$META_ASSERTION = makeKeyword("META-ASSERTION");
  public static final SubLSymbol $kw209$META_VARIABLE = makeKeyword("META-VARIABLE");
  public static final SubLSymbol $kw210$SUBL_ESCAPE = makeKeyword("SUBL-ESCAPE");
  public static final SubLSymbol $kw211$META_SENTENCE = makeKeyword("META-SENTENCE");
  public static final SubLObject $const212$memberOfSet = constant_handles.reader_make_constant_shell(makeString("memberOfSet"));
  public static final SubLObject $const213$SetifyArgumentFn = constant_handles.reader_make_constant_shell(makeString("SetifyArgumentFn"));
  public static final SubLObject $const214$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $kw215$IST = makeKeyword("IST");
  public static final SubLList $list216 = list(constant_handles.reader_make_constant_shell(makeString("equals")), constant_handles.reader_make_constant_shell(makeString("equalSymbols")));
  public static final SubLSymbol $kw217$NON_PREDICATE = makeKeyword("NON-PREDICATE");
  public static final SubLSymbol $kw218$VARIABLE_ARITY_PREDICATE = makeKeyword("VARIABLE-ARITY-PREDICATE");
  public static final SubLSymbol $kw219$UNBOUNDED_ARITY_PREDICATE = makeKeyword("UNBOUNDED-ARITY-PREDICATE");
  public static final SubLSymbol $kw220$PREDICATE_QUANTIFICATION = makeKeyword("PREDICATE-QUANTIFICATION");
  public static final SubLObject $const221$Kappa = constant_handles.reader_make_constant_shell(makeString("Kappa"));
  public static final SubLSymbol $kw222$KAPPA = makeKeyword("KAPPA");
  public static final SubLSymbol $kw223$NON_COLLECTION = makeKeyword("NON-COLLECTION");
  public static final SubLSymbol $kw224$COLLECTION_QUANTIFICATION = makeKeyword("COLLECTION-QUANTIFICATION");
  public static final SubLSymbol $kw225$NON_FUNCTION = makeKeyword("NON-FUNCTION");
  public static final SubLSymbol $kw226$SCOPING_RELATION = makeKeyword("SCOPING-RELATION");
  public static final SubLSymbol $kw227$VARIABLE_ARITY_FUNCTION = makeKeyword("VARIABLE-ARITY-FUNCTION");
  public static final SubLSymbol $kw228$UNBOUNDED_ARITY_FUNCTION = makeKeyword("UNBOUNDED-ARITY-FUNCTION");
  public static final SubLSymbol $kw229$FUNCTION_QUANTIFICATION = makeKeyword("FUNCTION-QUANTIFICATION");
  public static final SubLObject $const230$Lambda = constant_handles.reader_make_constant_shell(makeString("Lambda"));
  public static final SubLSymbol $kw231$LAMBDA = makeKeyword("LAMBDA");
  public static final SubLObject $const232$FOL_AtomicTermFn = constant_handles.reader_make_constant_shell(makeString("FOL-AtomicTermFn"));
  public static final SubLSymbol $sym233$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLObject $const234$FOL_FunctionFn = constant_handles.reader_make_constant_shell(makeString("FOL-FunctionFn"));
  public static final SubLObject $const235$FOL_StringFn = constant_handles.reader_make_constant_shell(makeString("FOL-StringFn"));
  public static final SubLSymbol $kw236$DWIM_TO_DISTINCT_CONSTANTS = makeKeyword("DWIM-TO-DISTINCT-CONSTANTS");
  public static final SubLObject $const237$FOL_StringConstantFn = constant_handles.reader_make_constant_shell(makeString("FOL-StringConstantFn"));
  public static final SubLSymbol $kw238$DWIM_TO_SINGLE_CONSTANT = makeKeyword("DWIM-TO-SINGLE-CONSTANT");
  public static final SubLObject $const239$Canonical_String = constant_handles.reader_make_constant_shell(makeString("Canonical_String"));
  public static final SubLString $str240$unexpected_string_handling_direct = makeString("unexpected string handling directive ~s");
  public static final SubLSymbol $sym241$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLObject $const242$FOL_NumberFn = constant_handles.reader_make_constant_shell(makeString("FOL-NumberFn"));
  public static final SubLObject $const243$FOL_NumberConstantFn = constant_handles.reader_make_constant_shell(makeString("FOL-NumberConstantFn"));
  public static final SubLSymbol $kw244$DWIM_ALL_TO_DISTINCT_CONSTANTS = makeKeyword("DWIM-ALL-TO-DISTINCT-CONSTANTS");
  public static final SubLString $str245$unexpected_number_handling_direct = makeString("unexpected number handling directive ~s");
  public static final SubLSymbol $sym246$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLList $list247 = list(makeSymbol("PREDICATES"), makeSymbol("ARGUMENTS"));
  public static final SubLList $list248 = cons(makeSymbol("FOL-PREDICATE"), makeSymbol("FOL-ARGS"));
  public static final SubLSymbol $sym249$FOL_ATOMIC_SENTENCE_ = makeSymbol("FOL-ATOMIC-SENTENCE?");
  public static final SubLString $str250$______S = makeString("~%;; ~S");
  public static final SubLString $str251$_____QUERY_ = makeString("~%;; QUERY:");
  public static final SubLString $str252$__Cyc_Assertion___a___ = makeString("% Cyc Assertion #~a:~%");
  public static final SubLString $str253$__Cyc_NART___a___ = makeString("% Cyc NART #~a:~%");
  public static final SubLString $str254$__Cyc_Constant___a___ = makeString("% Cyc Constant #~a:~%");
  public static final SubLString $str255$__CycL_Sentence___a___ = makeString("% CycL Sentence: ~a:~%");
  public static final SubLString $str256$Unexpected_object__s = makeString("Unexpected object ~s");
  public static final SubLString $str257$_________________________________ = makeString("%--------------------------------------------------------------------------\n");
  public static final SubLString $str258$File = makeString("File");
  public static final SubLString $str259$CYC_10___TPTP_v2_2_0__Released_2_ = makeString("CYC-10 : TPTP v2.2.0. Released 2.2.0. ");
  public static final SubLString $str260$Domain = makeString("Domain");
  public static final SubLString $str261$Knowledge_Representation_Common_S = makeString("Knowledge Representation(Common-Sense Reasoning)");
  public static final SubLString $str262$Problem = makeString("Problem");
  public static final SubLString $str263$Reasoning_with_the_Cyc_Common_Sen = makeString("Reasoning with the Cyc Common Sense KB");
  public static final SubLString $str264$Version = makeString("Version");
  public static final SubLString $str265$__ = makeString(": ");
  public static final SubLString $str266$English = makeString("English");
  public static final SubLString $str267$The_Cyc_KB_contains_assertions_fo = makeString("The Cyc KB contains assertions for reasoning with Common Sense mainly in FOL but with some extensions.");
  public static final SubLString $str268$Refs = makeString("Refs");
  public static final SubLString $str269$ = makeString("");
  public static final SubLString $str270$Source = makeString("Source");
  public static final SubLString $str271$Names = makeString("Names");
  public static final SubLString $str272$Status = makeString("Status");
  public static final SubLString $str273$unknown = makeString("unknown");
  public static final SubLString $str274$Rating = makeString("Rating");
  public static final SubLString $str275$1_0 = makeString("1.0");
  public static final SubLString $str276$Syntax = makeString("Syntax");
  public static final SubLString $str277$_blank_ = makeString("<blank>");
  public static final SubLString $str278$Comments = makeString("Comments");
  public static final SubLString $str279$To_obtain_a_First_Orderification_ = makeString("To obtain a First Orderification of the ResearchCyc KB a number of non-trivial transformations were done. \n% Please view http://wiki.cyc.com/wiki/FOLification for details.");
  public static final SubLString $str280$Bugfixes = makeString("Bugfixes");
  public static final SubLString $str281$_________________________________ = makeString("%-----------------------------------------\n");
  public static final SubLString $str282$__ = makeString("% ");
  public static final SubLString $str283$___ = makeString(" : ");
  public static final SubLString $str284$_ = makeString("\n");
  public static final SubLString $str285$__ = makeString("%\n");
  public static final SubLSymbol $sym286$COMPUTE_TPTP_QUERY_INDEX_NUMBER = makeSymbol("COMPUTE-TPTP-QUERY-INDEX-NUMBER");
  public static final SubLSymbol $sym287$_COMPUTE_TPTP_QUERY_INDEX_NUMBER_CACHING_STATE_ = makeSymbol("*COMPUTE-TPTP-QUERY-INDEX-NUMBER-CACHING-STATE*");
  public static final SubLString $str288$fof__a_axiom_ = makeString("fof(~a,axiom,");
  public static final SubLString $str289$____ = makeString(").~%");
  public static final SubLString $str290$fof__a_conjecture_ = makeString("fof(~a,conjecture,");
  public static final SubLList $list291 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));
  public static final SubLList $list292 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));
  public static final SubLString $str293$_ = makeString("(");
  public static final SubLString $str294$____ = makeString(" => ");
  public static final SubLString $str295$_ = makeString(")");
  public static final SubLObject $const296$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLString $str297$___ = makeString(" & ");
  public static final SubLObject $const298$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLString $str299$___ = makeString(" | ");
  public static final SubLObject $const300$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLString $str301$__ = makeString("(~");
  public static final SubLObject $const302$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLList $list303 = list(makeSymbol("EL-VAR"), makeSymbol("FOL-SUBSENTENCE"));
  public static final SubLString $str304$_____a____ = makeString("(? [~a] : ");
  public static final SubLObject $const305$forAll = constant_handles.reader_make_constant_shell(makeString("forAll"));
  public static final SubLString $str306$_____a____ = makeString("(! [~a] : ");
  public static final SubLObject $const307$equalSymbols = constant_handles.reader_make_constant_shell(makeString("equalSymbols"));
  public static final SubLString $str308$___ = makeString(" = ");
  public static final SubLString $str309$_ = makeString(",");
  public static final SubLString $str310$__ = makeString("))");
  public static final SubLString $str311$unexpected_FOL_term__s = makeString("unexpected FOL term ~s");
  public static final SubLList $list312 = cons(makeSymbol("FOL-FUNCTION"), makeSymbol("FOL-ARGS"));
  public static final SubLList $list313 = list(makeSymbol("FOL-PREDICATE-FN"), makeSymbol("CYCL-PREDICATE"), makeSymbol("ARITY"));
  public static final SubLString $str314$p_ = makeString("p_");
  public static final SubLList $list315 = list(makeSymbol("FOL-FUNCTION-FN"), makeSymbol("CYCL-FUNCTION"), makeSymbol("ARITY"));
  public static final SubLString $str316$f_ = makeString("f_");
  public static final SubLString $str317$c_zero_arity_function_application = makeString("c_zero_arity_function_application_");
  public static final SubLList $list318 = list(makeSymbol("FOL-ATOMIC-TERM-FN"), makeSymbol("CYCL-ATOMIC-TERM"));
  public static final SubLString $str319$c_ = makeString("c_");
  public static final SubLList $list320 = list(makeSymbol("FOL-STRING-CONSTANT-FN"), makeSymbol("SUBL-STRING"));
  public static final SubLString $str321$s_ = makeString("s_");
  public static final SubLList $list322 = list(makeSymbol("FOL-STRING-FN"), makeSymbol("SUBL-STRING"));
  public static final SubLString $str323$_ = makeString("\"");
  public static final SubLList $list324 = list(makeSymbol("FOL-NUMBER-CONSTANT-FN"), makeSymbol("SUBL-NUMBER"));
  public static final SubLSymbol $sym325$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str326$n_ = makeString("n_");
  public static final SubLList $list327 = list(makeSymbol("FOL-NUMBER-FN"), makeSymbol("SUBL-NUMBER"));
  public static final SubLSymbol $sym328$TPTP_STRING_CHAR_P = makeSymbol("TPTP-STRING-CHAR-P");
  public static final SubLSymbol $sym329$_TPTP_LONG_SYMBOL_NAME_CACHE_ = makeSymbol("*TPTP-LONG-SYMBOL-NAME-CACHE*");
  public static final SubLInteger $int330$256 = makeInteger(256);
  public static final SubLString $str331$ls_ = makeString("ls_");
  public static final SubLSymbol $sym332$TPTP_NON_NUMERIC_ATOM_CHAR_P = makeSymbol("TPTP-NON-NUMERIC-ATOM-CHAR-P");
  public static final SubLString $str333$tptp_ = makeString("tptp_");
  public static final SubLSymbol $sym334$TPTP_NUMERIC_ATOM_CHAR_P = makeSymbol("TPTP-NUMERIC-ATOM-CHAR-P");
  public static final SubLInteger $int335$32 = makeInteger(32);
  public static final SubLInteger $int336$126 = makeInteger(126);
  public static final SubLSymbol $sym337$FOCYCL_TO_CYCL = makeSymbol("FOCYCL-TO-CYCL");
  public static final SubLSymbol $kw338$INCLUDE_HORN = makeKeyword("INCLUDE-HORN");
  public static final SubLSymbol $kw339$TERM_TYPES = makeKeyword("TERM-TYPES");
  public static final SubLSymbol $kw340$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw341$SKIP = makeKeyword("SKIP");
  public static final SubLString $str342$_S_ = makeString("~S ");
  public static final SubLSymbol $kw343$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLSymbol $kw344$TERM = makeKeyword("TERM");
  public static final SubLSymbol $sym345$CATEGORIZE_FOL_TERMS_INT = makeSymbol("CATEGORIZE-FOL-TERMS-INT");
  public static final SubLString $str346$time_to_handle_non_forts = makeString("time to handle non-forts");
  public static final SubLString $str347$_P = makeString("_P");
  public static final SubLString $str348$_F = makeString("_F");
  public static final SubLString $str349$_T = makeString("_T");
  public static final SubLString $str350$time_to_handle__S = makeString("time to handle ~S");
  public static final SubLSymbol $sym351$FOL_NART_STRING = makeSymbol("FOL-NART-STRING");
  public static final SubLString $str352$__ = makeString("#$");
  public static final SubLSymbol $sym353$VALID_CONSTANT_NAME_CHAR_P = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
  public static final SubLSymbol $sym354$_FOL_NART_STRING_CACHING_STATE_ = makeSymbol("*FOL-NART-STRING-CACHING-STATE*");
  public static final SubLList $list355 = list(makeKeyword("TRANSLATION-TYPE"), makeKeyword("SET-THEORY"), makeKeyword("MT-HANDLING"), makeKeyword("MT-VISIBLE-EXCEPT-CORE-MTS"), makeKeyword("ISA-HANDLING"), makeKeyword("UNARY-PREDICATE"), makeKeyword("STRING-HANDLING"), makeKeyword("DWIM-TO-SINGLE-CONSTANT"));
  public static final SubLString $str356$opencyc_all_20050422_non_conditio = makeString("opencyc-all-20050422-non-conditional");
  public static final SubLList $list357 = list(list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Individual")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("subOrganizations")), makeSymbol("?Z"), makeSymbol("?X")), list(constant_handles.reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?X"), makeSymbol("?Y"))), list(constant_handles.reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?Z"), makeSymbol("?Y")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("typePrimaryFunction")), constant_handles.reader_make_constant_shell(makeString("Bathtub")), constant_handles.reader_make_constant_shell(makeString("TakingABath")), constant_handles.reader_make_constant_shell(makeString("deviceUsed")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("typeBehaviorIncapable")), constant_handles.reader_make_constant_shell(makeString("Doughnut")), constant_handles.reader_make_constant_shell(makeString("Talking")), constant_handles.reader_make_constant_shell(makeString("doneBy")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("parts")), makeSymbol("?Y"), makeSymbol("?Z"))), list(constant_handles.reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Z")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("Baseball-Ball")), constant_handles.reader_make_constant_shell(makeString("Cube")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("HumanInfant")), constant_handles.reader_make_constant_shell(makeString("Doctor-Medical")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("TerrestrialFrameOfReferenceMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CUP"), constant_handles.reader_make_constant_shell(makeString("CoffeeCup"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COFFEE"), constant_handles.reader_make_constant_shell(makeString("Coffee-Hot"))), list(constant_handles.reader_make_constant_shell(makeString("in-ContOpen")), makeSymbol("?COFFEE"), makeSymbol("?CUP"))), list(constant_handles.reader_make_constant_shell(makeString("orientation")), makeSymbol("?CUP"), constant_handles.reader_make_constant_shell(makeString("RightSideUp"))))));
  public static final SubLObject $list358 = _constant_358_initializer();
  public static final SubLInteger $int359$60 = makeInteger(60);
  public static final SubLSymbol $kw360$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLList $list361 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL, makeKeyword("MAX-NUMBER"), ONE_INTEGER);
  public static final SubLSymbol $kw362$FAILURE = makeKeyword("FAILURE");
  public static final SubLString $str363$_S___s___s____ = makeString("~S~%~s~%~s~%~%");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_358_initializer() {
    return list(new SubLObject[] {list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("BaseKB")), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Individual")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("BaseKB")), list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("Baseball-Ball")), constant_handles.reader_make_constant_shell(makeString("Cube")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ProductUsageMt")), list(constant_handles.reader_make_constant_shell(makeString("typePrimaryFunction")), constant_handles.reader_make_constant_shell(makeString("Bathtub")), constant_handles.reader_make_constant_shell(makeString("TakingABath")), constant_handles.reader_make_constant_shell(makeString("deviceUsed")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("AnimalActivitiesMt")), list(constant_handles.reader_make_constant_shell(makeString("typeBehaviorIncapable")), constant_handles.reader_make_constant_shell(makeString("InanimateObject")), constant_handles.reader_make_constant_shell(makeString("AtLeastPartiallyMentalEvent")), constant_handles.reader_make_constant_shell(makeString("doneBy")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UnitedStatesSocialLifeMt")), list(constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("HumanInfant")), constant_handles.reader_make_constant_shell(makeString("HumanPreSchoolageChild")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("IndustryMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("subOrganizations")), makeSymbol("?Z"), makeSymbol("?X")), list(constant_handles.reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?X"), makeSymbol("?Y"))), list(constant_handles.reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?Z"), makeSymbol("?Y")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ClothingGMt")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Garment"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Bluish")))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("WorldCulturalGeographyDataMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("perpetrator")), constant_handles.reader_make_constant_shell(makeString("BombingOfIraqEvent")), constant_handles.reader_make_constant_shell(makeString("UnitedStatesOfAmerica"))), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), constant_handles.reader_make_constant_shell(makeString("Person"))), list(constant_handles.reader_make_constant_shell(makeString("responsibleFor")), makeSymbol("?Y"), constant_handles.reader_make_constant_shell(makeString("BombingOfIraqEvent"))))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("BlowDryer")), constant_handles.reader_make_constant_shell(makeString("Weapon")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("GolfCart"))), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("ArmoredVehicle")))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("or")), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Alice")), constant_handles.reader_make_constant_shell(makeString("Animal"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Alice")), constant_handles.reader_make_constant_shell(makeString("Vegetable-Plant"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Alice")), constant_handles.reader_make_constant_shell(makeString("Mineral"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ArtifactGVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("FireplacePoker"))), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("productTypeManufacturedIn")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Foundry-Building"))))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("parts")), makeSymbol("?Y"), makeSymbol("?Z"))), list(constant_handles.reader_make_constant_shell(makeString("parts")), makeSymbol("?X"), makeSymbol("?Z")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("covers-Generic")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("transformedInto")), makeSymbol("?Y"), makeSymbol("?X"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("interArgIsa2-1")), constant_handles.reader_make_constant_shell(makeString("anatomicalParts")), list(constant_handles.reader_make_constant_shell(makeString("FruitFn")), constant_handles.reader_make_constant_shell(makeString("BananaTree"))), constant_handles.reader_make_constant_shell(makeString("BananaTree")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("performedBy")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("ArrestingSomeone"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), constant_handles.reader_make_constant_shell(makeString("PrivateSectorEmployee")))))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Thinking"))), list(constant_handles.reader_make_constant_shell(makeString("doneBy")), makeSymbol("?X"), makeSymbol("?Y"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), constant_handles.reader_make_constant_shell(makeString("SomethingExisting"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CIAWorldFactbook1997Mt")), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("permanentMemberOfOrganization")), constant_handles.reader_make_constant_shell(makeString("SouthKorea")), constant_handles.reader_make_constant_shell(makeString("UNSecurityCouncil"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("ScatteredSpaceRegion"))), list(constant_handles.reader_make_constant_shell(makeString("convexSpaceRegionOf")), makeSymbol("?Y"), makeSymbol("?X")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Z"), list(constant_handles.reader_make_constant_shell(makeString("convexSpaceRegionOf")), makeSymbol("?X"), makeSymbol("?Z")))), list(constant_handles.reader_make_constant_shell(makeString("componentPartOfSpaceRegion")), makeSymbol("?Y"), makeSymbol("?X")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ProductPhysicalCharacteristicsMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("PhoneAnsweringMachineCombo"))), list(constant_handles.reader_make_constant_shell(makeString("uniformColorOfObject")), makeSymbol("?X"), makeSymbol("?Y")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"), constant_handles.reader_make_constant_shell(makeString("ResetButton"))), list(constant_handles.reader_make_constant_shell(makeString("surfaceParts")), makeSymbol("?Z"), makeSymbol("?X"))), list(constant_handles.reader_make_constant_shell(makeString("uniformColorOfObject")), makeSymbol("?Z"), makeSymbol("?Y")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("PatternsOfGlobalTerrorism1998Mt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COMP2"), constant_handles.reader_make_constant_shell(makeString("IBMNetfinityComputer"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COMP1"), constant_handles.reader_make_constant_shell(makeString("SunMachine"))), list(constant_handles.reader_make_constant_shell(makeString("equivalentHosts")), makeSymbol("?COMP1"), makeSymbol("?COMP2")), list(constant_handles.reader_make_constant_shell(makeString("doneBy")), makeSymbol("?CRACK"), makeSymbol("?HACKER")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CRACK"), constant_handles.reader_make_constant_shell(makeString("Cracking-CompromisingSecurity"))), list(constant_handles.reader_make_constant_shell(makeString("securityCompromised")), makeSymbol("?CRACK"), makeSymbol("?COMP1"))), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?ACTION"), list(constant_handles.reader_make_constant_shell(makeString("damages")), makeSymbol("?ACTION"), makeSymbol("?COMP2"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("NaiveInformationMt")), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CUP"), constant_handles.reader_make_constant_shell(makeString("Demitasse"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?COFFEE"), constant_handles.reader_make_constant_shell(makeString("Coffee-Hot"))), list(constant_handles.reader_make_constant_shell(makeString("in-ContOpen")), makeSymbol("?COFFEE"), makeSymbol("?CUP"))), list(constant_handles.reader_make_constant_shell(makeString("orientation")), makeSymbol("?CUP"), constant_handles.reader_make_constant_shell(makeString("RightSideUp"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("typeBehaviorIncapable")), constant_handles.reader_make_constant_shell(makeString("Can")), constant_handles.reader_make_constant_shell(makeString("Cancan-StyleOfDance")), constant_handles.reader_make_constant_shell(makeString("performedBy")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(constant_handles.reader_make_constant_shell(makeString("not")), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell(makeString("biologicalFather")), constant_handles.reader_make_constant_shell(makeString("Cyc")), constant_handles.reader_make_constant_shell(makeString("MaleAnimal"))))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TERRORIST"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERRORIST"), constant_handles.reader_make_constant_shell(makeString("Terrorist"))), list(constant_handles.reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?TERRORIST"), constant_handles.reader_make_constant_shell(makeString("ContinentOfAsia"))))))});
  }

  //// Initializers

  public void declareFunctions() {
    declare_folification_file();
  }

  public void initializeVariables() {
    init_folification_file();
  }

  public void runTopLevelForms() {
    setup_folification_file();
  }

}
