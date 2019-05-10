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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.constant_completion;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_benchmarks;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.cycjava.cycl.transcript_server;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class builder_utilities extends SubLTranslatedFile {

  //// Constructor

  private builder_utilities() {}
  public static final SubLFile me = new builder_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.builder_utilities";

  //// Definitions

  /** A list of all cyc product identifiers */
  @SubL(source = "cycl/builder-utilities.lisp", position = 26891) 
  public static SubLSymbol $all_cyc_products$ = null;

  /** A list of cyc product definitions, each of which is of the form
   ([CYC-PRODUCT] [CODE-PRODUCT] [KB-PRODUCT] [BRANCH-TAG]) */
  @SubL(source = "cycl/builder-utilities.lisp", position = 27079) 
  public static SubLSymbol $cyc_product_definitions$ = null;

  /** Declare that CYC-PRODUCT is composed of CODE-PRODUCT, KB-PRODUCT and BRANCH-TAG.
   This information is used to compositionally determine the CYC-PRODUCT of 
   a running image, which in turn can be used to gate various behaviors. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 27262) 
  public static final SubLObject declare_cyc_product(SubLObject cyc_product, SubLObject code_product, SubLObject kb_product, SubLObject branch_tag) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(cyc_product, $sym35$KEYWORDP);
      checkType(kb_product, $sym35$KEYWORDP);
      checkType(code_product, $sym35$KEYWORDP);
      checkType(branch_tag, $sym36$STRINGP);
      if ((NIL != cyc_product_definition_presentP(cyc_product, code_product, kb_product, branch_tag))) {
        return Errors.warn($str37$The_cyc_product___A__is_already_p, cyc_product);
      } else if ((NIL != find_cyc_product(code_product, kb_product, branch_tag))) {
        return Errors.error($str38$There_already_exists_a_different_, find_cyc_product(code_product, kb_product, branch_tag));
      } else if ((NIL != conses_high.assoc(cyc_product, $cyc_product_definitions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
        return Errors.error($str39$The_cyc_product__A_already_exists, cyc_product);
      } else {
        $all_cyc_products$.setDynamicValue(cons(cyc_product, $all_cyc_products$.getDynamicValue(thread)), thread);
        $cyc_product_definitions$.setDynamicValue(cons(list(cyc_product, kb_product, code_product, branch_tag), $cyc_product_definitions$.getDynamicValue(thread)), thread);
        return $cyc_product_definitions$.getDynamicValue(thread);
      }
    }
  }

  /** Returns T if a cyc product definition composed of these 4 values exists. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 28472) 
  public static final SubLObject cyc_product_definition_presentP(SubLObject cyc_product, SubLObject code_product, SubLObject kb_product, SubLObject branch_tag) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return conses_high.member(list(cyc_product, code_product, kb_product, branch_tag), $cyc_product_definitions$.getDynamicValue(thread), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }
  }

  /** Returns the cyc product identifier for this combination of code-product, 
  kb-product and branch-tag. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 28769) 
  public static final SubLObject find_cyc_product(SubLObject code_product, SubLObject kb_product, SubLObject branch_tag) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Sequences.find(list(code_product, kb_product, branch_tag), $cyc_product_definitions$.getDynamicValue(thread), Symbols.symbol_function(EQUAL), Symbols.symbol_function($sym40$CDR), UNPROVIDED, UNPROVIDED).first();
    }
  }

  /** The value of *CYC-PRODUCT* will be set dynamically at image startup, based
   on the values of *CODE-PRODUCT*, *KB-PRODUCT*, and *BRANCH-TAG*. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 29465) 
  private static SubLSymbol $cyc_product$ = null;

  /** The value of *CODE-PRODUCT* is set in this definition. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 29746) 
  private static SubLSymbol $code_product$ = null;

  /** The value of *KB-PRODUCT* will be set at KB load time. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 30040) 
  private static SubLSymbol $kb_product$ = null;

  /** The value of *BRANCH-TAG* is set in this definition. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 30137) 
  private static SubLSymbol $branch_tag$ = null;

  /** @return keywordp
   Return a token identifying the cyc product of this running image,
   which was initialized at startup based on properties of the code and 
   KB. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 30424) 
  public static final SubLObject cyc_product() {
    return $cyc_product$.getGlobalValue();
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 30648) 
  public static final SubLObject code_product() {
    return $code_product$.getGlobalValue();
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 30707) 
  public static final SubLObject kb_product() {
    return $kb_product$.getGlobalValue();
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 30762) 
  public static final SubLObject branch_tag() {
    return $branch_tag$.getGlobalValue();
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 30817) 
  public static final SubLObject set_cyc_product(SubLObject cyc_product) {
    checkType(cyc_product, $sym35$KEYWORDP);
    $cyc_product$.setGlobalValue(cyc_product);
    return cyc_product();
  }

  /** Detect what the value of *CYC-PRODUCT* should be, then set it. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 31316) 
  public static final SubLObject initialize_cyc_product() {
    {
      SubLObject cyc_product = detect_cyc_product();
      if ((NIL != cyc_product)) {
        set_cyc_product(cyc_product);
      } else {
        set_cyc_product($kw51$UNKNOWN_CYC_PRODUCT);
      }
      return cyc_product;
    }
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 31795) 
  public static final SubLObject detect_cyc_product() {
    return find_cyc_product(code_product(), kb_product(), branch_tag());
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 32980) 
  public static final SubLObject specify_sbhl_caching_policy_template(SubLObject link_predicate, SubLObject policy, SubLObject capacity, SubLObject exempts, SubLObject prefetch) {
    if ((exempts == UNPROVIDED)) {
      exempts = ZERO_INTEGER;
    }
    if ((prefetch == UNPROVIDED)) {
      prefetch = ZERO_INTEGER;
    }
    return list(link_predicate, policy, capacity, exempts, prefetch);
  }

  @SubL(source = "cycl/builder-utilities.lisp", position = 33538) 
  public static SubLSymbol $generic_sbhl_caching_policy_templates$ = null;

  /** Generate a KB SBHL caching policy proposal that reflects the state of the
   the system before the introduction of swap-out support--i.e. all modules
   are handled as sticky and nothing is pre-fetched.
   @return the policies */
  @SubL(source = "cycl/builder-utilities.lisp", position = 37825) 
  public static final SubLObject propose_legacy_kb_sbhl_caching_policies(SubLObject link_predicates) {
    if ((link_predicates == UNPROVIDED)) {
      link_predicates = NIL;
    }
    return propose_all_sticky_kb_sbhl_caching_policies(link_predicates, NIL);
  }

  /** Helper for getting just the predicates out of the module structures. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 38219) 
  public static final SubLObject get_all_sbhl_module_link_predicates() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject link_predicates = NIL;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject module = thread.secondMultipleValue();
            thread.resetMultipleValues();
            link_predicates = cons(sbhl_module_vars.get_sbhl_module_link_pred(module), link_predicates);
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return link_predicates;
      }
    }
  }

  /** Generate a KB SBHL caching policy proposal for sticky SBHL caching that for all
   passed link predicates. 
   @param WITH-PREFETCH-P determines whether the prefetch will be all or none
   @return the policies */
  @SubL(source = "cycl/builder-utilities.lisp", position = 38500) 
  public static final SubLObject propose_all_sticky_kb_sbhl_caching_policies(SubLObject link_predicates, SubLObject with_prefetch_p) {
    if ((NIL == link_predicates)) {
      link_predicates = get_all_sbhl_module_link_predicates();
    }
    {
      SubLObject prefetch = ((NIL != with_prefetch_p) ? ((SubLObject) $kw58$ALL) : NIL);
      SubLObject policies = NIL;
      SubLObject cdolist_list_var = link_predicates;
      SubLObject link_predicate = NIL;
      for (link_predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), link_predicate = cdolist_list_var.first()) {
        {
          SubLObject legacy_policy = sbhl_caching_policies.create_sbhl_caching_policy_from_term_recommendation_list(link_predicate, $kw56$STICKY, $kw57$UNDEFINED, NIL, $kw58$ALL, prefetch);
          policies = cons(legacy_policy, policies);
        }
      }
      return Sequences.nreverse(policies);
    }
  }

  /** Processes all of the tests in this list as part of the SBHL cache tuning. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 39332) 
  public static SubLSymbol $cyc_tests_to_use_for_sbhl_cache_tuning$ = null;

  /** Runs all of these queries as part of the SBHL cache tuning.
   @hack Currently not implemented. */
  @SubL(source = "cycl/builder-utilities.lisp", position = 39921) 
  public static SubLSymbol $kb_queries_to_use_for_sbhl_cache_tuning$ = null;

  /** When T, runs the CycLOPS benchmark once as part of the SBHL cache tuning.
   @hack Currently not implemented */
  @SubL(source = "cycl/builder-utilities.lisp", position = 40097) 
  public static SubLSymbol $run_cyclops_for_sbhl_cache_tuningP$ = null;

  public static final SubLObject declare_builder_utilities_file() {
    //declareFunction(myName, "close_old_areas", "CLOSE-OLD-AREAS", 0, 0, false);
    //declareFunction(myName, "verify_cyc_build", "VERIFY-CYC-BUILD", 0, 0, false);
    //declareFunction(myName, "cyc_build_world", "CYC-BUILD-WORLD", 2, 0, false);
    //declareFunction(myName, "cyc_build_world_verify", "CYC-BUILD-WORLD-VERIFY", 2, 0, false);
    //declareFunction(myName, "build_write_image", "BUILD-WRITE-IMAGE", 1, 0, false);
    //declareFunction(myName, "cyc_install_directory_name", "CYC-INSTALL-DIRECTORY-NAME", 1, 1, false);
    //declareFunction(myName, "cyc_install_directory", "CYC-INSTALL-DIRECTORY", 3, 1, false);
    //declareFunction(myName, "cyc_versioned_world_name", "CYC-VERSIONED-WORLD-NAME", 0, 0, false);
    //declareFunction(myName, "build_write_image_versioned", "BUILD-WRITE-IMAGE-VERSIONED", 1, 0, false);
    //declareFunction(myName, "builder_log_directory", "BUILDER-LOG-DIRECTORY", 0, 0, false);
    //declareFunction(myName, "builder_forward_inference_metrics_log", "BUILDER-FORWARD-INFERENCE-METRICS-LOG", 0, 0, false);
    //declareFunction(myName, "catchup_to_rollover_and_write_image", "CATCHUP-TO-ROLLOVER-AND-WRITE-IMAGE", 1, 2, false);
    //declareFunction(myName, "catchup_to_rollover", "CATCHUP-TO-ROLLOVER", 0, 0, false);
    //declareFunction(myName, "catchup_to_rollover_setup", "CATCHUP-TO-ROLLOVER-SETUP", 0, 0, false);
    //declareFunction(myName, "load_submitted_transcripts_and_write_image", "LOAD-SUBMITTED-TRANSCRIPTS-AND-WRITE-IMAGE", 2, 0, false);
    //declareFunction(myName, "catchup_to_current_and_write_image_versioned", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE-VERSIONED", 1, 0, false);
    //declareFunction(myName, "catchup_to_current_and_write_image", "CATCHUP-TO-CURRENT-AND-WRITE-IMAGE", 1, 0, false);
    //declareFunction(myName, "catchup_to_current_kb", "CATCHUP-TO-CURRENT-KB", 0, 0, false);
    declareFunction(myName, "declare_cyc_product", "DECLARE-CYC-PRODUCT", 4, 0, false);
    declareFunction(myName, "cyc_product_definition_presentP", "CYC-PRODUCT-DEFINITION-PRESENT?", 4, 0, false);
    declareFunction(myName, "find_cyc_product", "FIND-CYC-PRODUCT", 3, 0, false);
    declareFunction(myName, "cyc_product", "CYC-PRODUCT", 0, 0, false);
    declareFunction(myName, "code_product", "CODE-PRODUCT", 0, 0, false);
    declareFunction(myName, "kb_product", "KB-PRODUCT", 0, 0, false);
    declareFunction(myName, "branch_tag", "BRANCH-TAG", 0, 0, false);
    declareFunction(myName, "set_cyc_product", "SET-CYC-PRODUCT", 1, 0, false);
    //declareFunction(myName, "set_kb_product", "SET-KB-PRODUCT", 1, 0, false);
    declareFunction(myName, "initialize_cyc_product", "INITIALIZE-CYC-PRODUCT", 0, 0, false);
    declareFunction(myName, "detect_cyc_product", "DETECT-CYC-PRODUCT", 0, 0, false);
    //declareFunction(myName, "enumerate_fact_sheets_for_kb_to_file", "ENUMERATE-FACT-SHEETS-FOR-KB-TO-FILE", 1, 0, false);
    //declareFunction(myName, "enumerate_fact_sheets_for_kb", "ENUMERATE-FACT-SHEETS-FOR-KB", 0, 1, false);
    //declareFunction(myName, "fact_sheet_path_for_term_filter_and_transform", "FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM", 1, 0, false);
    declareFunction(myName, "specify_sbhl_caching_policy_template", "SPECIFY-SBHL-CACHING-POLICY-TEMPLATE", 3, 2, false);
    //declareFunction(myName, "generate_kb_sbhl_caching_policies", "GENERATE-KB-SBHL-CACHING-POLICIES", 2, 1, false);
    //declareFunction(myName, "generate_legacy_kb_sbhl_caching_policies", "GENERATE-LEGACY-KB-SBHL-CACHING-POLICIES", 1, 1, false);
    //declareFunction(myName, "generate_completely_cached_kb_sbhl_caching_policies", "GENERATE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 1, 1, false);
    //declareFunction(myName, "propose_kb_sbhl_caching_policies_from_tuning_data", "PROPOSE-KB-SBHL-CACHING-POLICIES-FROM-TUNING-DATA", 1, 1, false);
    //declareFunction(myName, "propose_completely_cached_kb_sbhl_caching_policies", "PROPOSE-COMPLETELY-CACHED-KB-SBHL-CACHING-POLICIES", 0, 1, false);
    declareFunction(myName, "propose_legacy_kb_sbhl_caching_policies", "PROPOSE-LEGACY-KB-SBHL-CACHING-POLICIES", 0, 1, false);
    declareFunction(myName, "get_all_sbhl_module_link_predicates", "GET-ALL-SBHL-MODULE-LINK-PREDICATES", 0, 0, false);
    declareFunction(myName, "propose_all_sticky_kb_sbhl_caching_policies", "PROPOSE-ALL-STICKY-KB-SBHL-CACHING-POLICIES", 2, 0, false);
    //declareFunction(myName, "gather_data_for_sbhl_cache_tuning", "GATHER-DATA-FOR-SBHL-CACHE-TUNING", 1, 0, false);
    //declareFunction(myName, "run_sbhl_cache_tuning_data_gathering", "RUN-SBHL-CACHE-TUNING-DATA-GATHERING", 1, 0, false);
    //declareFunction(myName, "sbhl_cache_tuning_data_gathering_prologue", "SBHL-CACHE-TUNING-DATA-GATHERING-PROLOGUE", 0, 0, false);
    //declareFunction(myName, "sbhl_cache_tuning_experiment_prologue", "SBHL-CACHE-TUNING-EXPERIMENT-PROLOGUE", 0, 0, false);
    //declareFunction(myName, "sbhl_cache_tuning_experiment_epilogue", "SBHL-CACHE-TUNING-EXPERIMENT-EPILOGUE", 1, 0, false);
    //declareFunction(myName, "sbhl_cache_tuning_data_gathering_generate_report", "SBHL-CACHE-TUNING-DATA-GATHERING-GENERATE-REPORT", 2, 0, false);
    //declareFunction(myName, "sbhl_cache_tuning_data_gathering_epilogue", "SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE", 0, 0, false);
    //declareFunction(myName, "get_kb_mini_dump_timestamp", "GET-KB-MINI-DUMP-TIMESTAMP", 0, 0, false);
    //declareFunction(myName, "prepare_kb_mini_dump", "PREPARE-KB-MINI-DUMP", 0, 0, false);
    //declareFunction(myName, "perform_kb_mini_dump", "PERFORM-KB-MINI-DUMP", 1, 0, false);
    //declareFunction(myName, "launch_asynchronous_kb_mini_dump", "LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP", 1, 0, false);
    //declareFunction(myName, "mark_kb_mini_dump_as_successful", "MARK-KB-MINI-DUMP-AS-SUCCESSFUL", 1, 0, false);
    //declareFunction(myName, "select_clippable_collections", "SELECT-CLIPPABLE-COLLECTIONS", 0, 2, false);
    //declareFunction(myName, "higher_order_collectionP", "HIGHER-ORDER-COLLECTION?", 1, 0, false);
    //declareFunction(myName, "gather_tabu_collections_for_clipping", "GATHER-TABU-COLLECTIONS-FOR-CLIPPING", 1, 2, false);
    //declareFunction(myName, "clip_kb_percentage", "CLIP-KB-PERCENTAGE", 2, 1, false);
    //declareFunction(myName, "clip_kb_given_tabu_term_list", "CLIP-KB-GIVEN-TABU-TERM-LIST", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_builder_utilities_file() {
    $all_cyc_products$ = defparameter("*ALL-CYC-PRODUCTS*", NIL);
    $cyc_product_definitions$ = defparameter("*CYC-PRODUCT-DEFINITIONS*", NIL);
    $cyc_product$ = deflexical("*CYC-PRODUCT*", ((NIL != Symbols.boundp($sym49$_CYC_PRODUCT_)) ? ((SubLObject) $cyc_product$.getGlobalValue()) : NIL));
    $code_product$ = defconstant("*CODE-PRODUCT*", $kw42$STANDARD);
    $kb_product$ = deflexical("*KB-PRODUCT*", ((NIL != Symbols.boundp($sym50$_KB_PRODUCT_)) ? ((SubLObject) $kb_product$.getGlobalValue()) : NIL));
    $branch_tag$ = defconstant("*BRANCH-TAG*", $str44$head);
    $generic_sbhl_caching_policy_templates$ = defparameter("*GENERIC-SBHL-CACHING-POLICY-TEMPLATES*", list(new SubLObject[] {specify_sbhl_caching_policy_template($kw55$DEFAULT, $kw56$STICKY, $kw57$UNDEFINED, $kw58$ALL, UNPROVIDED), specify_sbhl_caching_policy_template($const59$genlMt, $kw56$STICKY, $kw57$UNDEFINED, $kw58$ALL, $kw58$ALL), specify_sbhl_caching_policy_template($const60$genlPreds, $kw61$SWAPOUT, $int62$500, $int62$500, $int63$200), specify_sbhl_caching_policy_template($const64$negationPreds, $kw61$SWAPOUT, $int62$500, $int65$100, ZERO_INTEGER), specify_sbhl_caching_policy_template($const66$disjointWith, $kw61$SWAPOUT, $int62$500, $int62$500, $int63$200), specify_sbhl_caching_policy_template($const67$genlInverse, $kw61$SWAPOUT, $int62$500, $int62$500, $int63$200), specify_sbhl_caching_policy_template($const68$negationInverse, $kw61$SWAPOUT, $int62$500, $int65$100, ZERO_INTEGER), specify_sbhl_caching_policy_template($const69$genls, $kw61$SWAPOUT, $int70$5000, $int70$5000, $int71$2000), specify_sbhl_caching_policy_template($const72$isa, $kw61$SWAPOUT, $int73$10000, $int74$8000, $int71$2000), specify_sbhl_caching_policy_template($const75$quotedIsa, $kw61$SWAPOUT, $int70$5000, $int76$4000, $int77$1000)}));
    $cyc_tests_to_use_for_sbhl_cache_tuning$ = defparameter("*CYC-TESTS-TO-USE-FOR-SBHL-CACHE-TUNING*", NIL);
    $kb_queries_to_use_for_sbhl_cache_tuning$ = defparameter("*KB-QUERIES-TO-USE-FOR-SBHL-CACHE-TUNING*", NIL);
    $run_cyclops_for_sbhl_cache_tuningP$ = defparameter("*RUN-CYCLOPS-FOR-SBHL-CACHE-TUNING?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_builder_utilities_file() {
    // CVS_ID("Id: builder-utilities.lisp 128922 2009-10-07 14:10:45Z rck ");
    access_macros.register_external_symbol($sym1$CYC_BUILD_WORLD_VERIFY);
    declare_cyc_product($kw41$HEAD, $kw42$STANDARD, $kw43$FULL, $str44$head);
    declare_cyc_product($kw45$CAE_0_3, $kw46$TKB, $kw47$AKB, $str48$cake_release_0p3_20051215);
    subl_macro_promotions.declare_defglobal($sym49$_CYC_PRODUCT_);
    subl_macro_promotions.declare_defglobal($sym50$_KB_PRODUCT_);
    utilities_macros.note_funcall_helper_function($sym54$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM);
    access_macros.register_external_symbol($sym91$GET_KB_MINI_DUMP_TIMESTAMP);
    access_macros.register_external_symbol($sym92$PREPARE_KB_MINI_DUMP);
    access_macros.register_external_symbol($sym95$PERFORM_KB_MINI_DUMP);
    access_macros.register_external_symbol($sym97$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $sym1$CYC_BUILD_WORLD_VERIFY = makeSymbol("CYC-BUILD-WORLD-VERIFY");
  public static final SubLString $str2$Continue = makeString("Continue");
  public static final SubLString $str3$World_file__A_already_exists_and_ = makeString("World file ~A already exists and may not be overwritable if in use.");
  public static final SubLString $str4$A = makeString("A");
  public static final SubLString $str5$cyc_ = makeString("cyc-");
  public static final SubLString $str6$_ = makeString("-");
  public static final SubLString $str7$_kb_ = makeString("-kb-");
  public static final SubLString $str8$_cyc_ = makeString("/cyc/");
  public static final SubLString $str9$_ = makeString("/");
  public static final SubLString $str10$_install_ = makeString("/install/");
  public static final SubLString $str11$kb_ = makeString("kb-");
  public static final SubLString $str12$_load = makeString(".load");
  public static final SubLSymbol $sym13$DIRECTORY_P = makeSymbol("DIRECTORY-P");
  public static final SubLString $str14$Writing_cyc_image_to__A__ = makeString("Writing cyc image to ~A~%");
  public static final SubLString $str15$_home_builder_logs_ = makeString("/home/builder/logs/");
  public static final SubLString $str16$_4__0D = makeString("~4,'0D");
  public static final SubLString $str17$No_log_directory__A_____strange__ = makeString("No log directory ~A ... strange.~%");
  public static final SubLString $str18$forward_inference_metrics_ = makeString("forward-inference-metrics-");
  public static final SubLString $str19$_html = makeString(".html");
  public static final SubLString $str20$The_catchup_image_expected_to_be_ = makeString("The catchup image expected to be using world ~A but has ~A.");
  public static final SubLString $str21$Getting_caught_up_to_KB_rollover_ = makeString("Getting caught up to KB rollover to ");
  public static final SubLSymbol $sym22$KB_FULL_TRANSCRIPT_LOADED = makeSymbol("KB-FULL-TRANSCRIPT-LOADED");
  public static final SubLString $str23$The_agenda_is_not_running___Fix_y = makeString("The agenda is not running.  Fix your init files, probably parameters.lisp.");
  public static final SubLSymbol $kw24$RECEIVE_ONLY = makeKeyword("RECEIVE-ONLY");
  public static final SubLString $str25$TheBuilder = makeString("TheBuilder");
  public static final SubLObject $const26$Guest = constant_handles.reader_make_constant_shell(makeString("Guest"));
  public static final SubLString $str27$CycAdministrator = makeString("CycAdministrator");
  public static final SubLString $str28$Getting_caught_up__ = makeString("Getting caught up~%");
  public static final SubLSymbol $kw29$NONE = makeKeyword("NONE");
  public static final SubLString $str30$Getting_caught_up_from_KB_ = makeString("Getting caught up from KB ");
  public static final SubLString $str31$_ = makeString(".");
  public static final SubLString $str32$_to_KB_ = makeString(" to KB ");
  public static final SubLSymbol $kw33$DEAF = makeKeyword("DEAF");
  public static final SubLString $str34$Caught_up_to_KB__A__ = makeString("Caught up to KB ~A~%");
  public static final SubLSymbol $sym35$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym36$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str37$The_cyc_product___A__is_already_p = makeString("The cyc product, ~A, is already present with the declared definition.");
  public static final SubLString $str38$There_already_exists_a_different_ = makeString("There already exists a different cyc product, ~A, with this definition.");
  public static final SubLString $str39$The_cyc_product__A_already_exists = makeString("The cyc product ~A already exists with a different definition.");
  public static final SubLSymbol $sym40$CDR = makeSymbol("CDR");
  public static final SubLSymbol $kw41$HEAD = makeKeyword("HEAD");
  public static final SubLSymbol $kw42$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $kw43$FULL = makeKeyword("FULL");
  public static final SubLString $str44$head = makeString("head");
  public static final SubLSymbol $kw45$CAE_0_3 = makeKeyword("CAE-0.3");
  public static final SubLSymbol $kw46$TKB = makeKeyword("TKB");
  public static final SubLSymbol $kw47$AKB = makeKeyword("AKB");
  public static final SubLString $str48$cake_release_0p3_20051215 = makeString("cake-release-0p3-20051215");
  public static final SubLSymbol $sym49$_CYC_PRODUCT_ = makeSymbol("*CYC-PRODUCT*");
  public static final SubLSymbol $sym50$_KB_PRODUCT_ = makeSymbol("*KB-PRODUCT*");
  public static final SubLSymbol $kw51$UNKNOWN_CYC_PRODUCT = makeKeyword("UNKNOWN-CYC-PRODUCT");
  public static final SubLSymbol $kw52$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym54$FACT_SHEET_PATH_FOR_TERM_FILTER_AND_TRANSFORM = makeSymbol("FACT-SHEET-PATH-FOR-TERM-FILTER-AND-TRANSFORM");
  public static final SubLSymbol $kw55$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw56$STICKY = makeKeyword("STICKY");
  public static final SubLSymbol $kw57$UNDEFINED = makeKeyword("UNDEFINED");
  public static final SubLSymbol $kw58$ALL = makeKeyword("ALL");
  public static final SubLObject $const59$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLObject $const60$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw61$SWAPOUT = makeKeyword("SWAPOUT");
  public static final SubLInteger $int62$500 = makeInteger(500);
  public static final SubLInteger $int63$200 = makeInteger(200);
  public static final SubLObject $const64$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLInteger $int65$100 = makeInteger(100);
  public static final SubLObject $const66$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLObject $const67$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const68$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLObject $const69$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLInteger $int70$5000 = makeInteger(5000);
  public static final SubLInteger $int71$2000 = makeInteger(2000);
  public static final SubLObject $const72$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLInteger $int73$10000 = makeInteger(10000);
  public static final SubLInteger $int74$8000 = makeInteger(8000);
  public static final SubLObject $const75$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLInteger $int76$4000 = makeInteger(4000);
  public static final SubLInteger $int77$1000 = makeInteger(1000);
  public static final SubLSymbol $sym78$DICTIONARY_P = makeSymbol("DICTIONARY-P");
  public static final SubLSymbol $sym79$FIRST = makeSymbol("FIRST");
  public static final SubLString $str80$The_templates_list__A_does_not_co = makeString("The templates list ~A does not contain a default rule.");
  public static final SubLList $list81 = list(makeSymbol("PRED"), makeSymbol("POLICY"), makeSymbol("CAPACITY"), makeSymbol("&OPTIONAL"), makeSymbol("EXEMPT"), makeSymbol("PREFETCH"));
  public static final SubLString $str82$Gathering_SBHL_cache_tuning_data_ = makeString("Gathering SBHL cache tuning data via CYC tests ....");
  public static final SubLSymbol $sym83$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw84$SILENT = makeKeyword("SILENT");
  public static final SubLSymbol $kw85$CYC_TESTS = makeKeyword("CYC-TESTS");
  public static final SubLString $str86$Gathering_SBHL_cache_tuning_data_ = makeString("Gathering SBHL cache tuning data via KB queries ....");
  public static final SubLString $str87$KBQ_Support_currently_not_impleme = makeString("KBQ Support currently not implemented");
  public static final SubLSymbol $kw88$KB_QUERIES = makeKeyword("KB-QUERIES");
  public static final SubLString $str89$Gathering_SBHL_cache_tuning_data_ = makeString("Gathering SBHL cache tuning data via CycLOPs ....");
  public static final SubLSymbol $kw90$CYCLOPS = makeKeyword("CYCLOPS");
  public static final SubLSymbol $sym91$GET_KB_MINI_DUMP_TIMESTAMP = makeSymbol("GET-KB-MINI-DUMP-TIMESTAMP");
  public static final SubLSymbol $sym92$PREPARE_KB_MINI_DUMP = makeSymbol("PREPARE-KB-MINI-DUMP");
  public static final SubLSymbol $kw93$CYC_API = makeKeyword("CYC-API");
  public static final SubLSymbol $kw94$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym95$PERFORM_KB_MINI_DUMP = makeSymbol("PERFORM-KB-MINI-DUMP");
  public static final SubLSymbol $kw96$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $sym97$LAUNCH_ASYNCHRONOUS_KB_MINI_DUMP = makeSymbol("LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP");
  public static final SubLString $str98$Mini_KB_Dumper = makeString("Mini KB Dumper");
  public static final SubLString $str99$mini_dump_finished_text = makeString("mini-dump-finished.text");
  public static final SubLSymbol $sym100$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const101$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const102$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLSymbol $sym103$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym104$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym105$HIGHER_ORDER_COLLECTION_ = makeSymbol("HIGHER-ORDER-COLLECTION?");
  public static final SubLSymbol $sym106$_ = makeSymbol("<");
  public static final SubLSymbol $sym107$INSTANCE_CARDINALITY = makeSymbol("INSTANCE-CARDINALITY");
  public static final SubLSymbol $kw108$ASCENDING = makeKeyword("ASCENDING");
  public static final SubLObject $const109$CollectionType = constant_handles.reader_make_constant_shell(makeString("CollectionType"));
  public static final SubLString $str110$Nothing_to_clip_ = makeString("Nothing to clip.");
  public static final SubLSymbol $kw111$PERCENTAGE = makeKeyword("PERCENTAGE");
  public static final SubLString $str112$Invalid_percentage__A__cannot_cli = makeString("Invalid percentage ~A: cannot clip from ~A to ~A.");
  public static final SubLString $str113$cdolist = makeString("cdolist");
  public static final SubLSymbol $kw114$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym115$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str116$___A__Deleting__A_____ = makeString("~&~A: Deleting ~A ... ");
  public static final SubLString $str117$_done___ = makeString(" done.~%");
  public static final SubLSymbol $sym118$_EXIT = makeSymbol("%EXIT");
  public static final SubLSymbol $kw119$EXHAUSTED = makeKeyword("EXHAUSTED");
  public static final SubLString $str120$___A__Current_FORT_Count____A__ = makeString("~&~A: Current FORT Count : ~A~%");
  public static final SubLString $str121$___A__Gathering_tabu_collections_ = makeString("~&~A: Gathering tabu-collections ....~%");
  public static final SubLString $str122$___A__Selecting_clippable_collect = makeString("~&~A: Selecting clippable collections ....~%");
  public static final SubLString $str123$___A__Clipping_collections_______ = makeString("~&~A: Clipping collections ....~%");
  public static final SubLFloat $float124$0_1 = makeDouble(0.1);
  public static final SubLSymbol $kw125$LOG = makeKeyword("LOG");
  public static final SubLString $str126$___A__Clipping_stopped_at__A_FORT = makeString("~&~A: Clipping stopped at ~A FORTs remaining with reason code ~A.~%");

  //// Initializers

  public void declareFunctions() {
    declare_builder_utilities_file();
  }

  public void initializeVariables() {
    init_builder_utilities_file();
  }

  public void runTopLevelForms() {
    setup_builder_utilities_file();
  }

}
