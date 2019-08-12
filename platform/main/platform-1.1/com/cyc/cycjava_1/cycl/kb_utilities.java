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

import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.after_adding;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_manager;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.assertions_low;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.bookkeeping_store;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.clause_strucs;
//dm import com.cyc.cycjava_1.cycl.constant_completion_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constant_index_manager;
//dm import com.cyc.cycjava_1.cycl.constant_reader;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deduction_manager;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.defns;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.equality_store;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_hl_support_manager;
//dm import com.cyc.cycjava_1.cycl.kb_hl_supports;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.keyhash;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_kb_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.nart_hl_formula_manager;
//dm import com.cyc.cycjava_1.cycl.nart_index_manager;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.shelfs;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.tva_cache;
//dm import com.cyc.cycjava_1.cycl.unrepresented_term_index_manager;
//dm import com.cyc.cycjava_1.cycl.unrepresented_terms;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class kb_utilities extends SubLTranslatedFile {

  //// Constructor

  private kb_utilities() {}
  public static final SubLFile me = new kb_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_utilities";

  //// Definitions

  @SubL(source = "cycl/kb-utilities.lisp", position = 943) 
  public static final SubLObject kb_statistics(SubLObject stream) {
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject constant_count = constant_handles.constant_count();
        SubLObject cached_constant_index_count = constant_index_manager.cached_constant_index_count();
        SubLObject nart_count = nart_handles.nart_count();
        SubLObject cached_nart_index_count = nart_index_manager.cached_nart_index_count();
        SubLObject cached_nart_hl_formula_count = nart_hl_formula_manager.cached_nart_hl_formula_count();
        SubLObject fort_count = forts.fort_count();
        SubLObject kb_assertion_count = assertion_handles.assertion_count();
        SubLObject cached_assertion_count = assertion_manager.cached_assertion_count();
        SubLObject bookkeeping_assertion_count = bookkeeping_store.bookkeeping_assertion_count();
        SubLObject virtual_assertion_count = ZERO_INTEGER;
        SubLObject deduction_count = deduction_handles.deduction_count();
        SubLObject cached_deduction_count = deduction_manager.cached_deduction_count();
        SubLObject kb_hl_support_count = kb_hl_supports.kb_hl_support_count();
        SubLObject cached_kb_hl_support_count = kb_hl_support_manager.cached_kb_hl_support_count();
        SubLObject unrepresented_term_count = unrepresented_terms.kb_unrepresented_term_count();
        SubLObject cached_unrepresented_term_index_count = unrepresented_term_index_manager.cached_unrepresented_term_index_count();
        SubLObject total_assertion_count = NIL;
        total_assertion_count = Numbers.add(kb_assertion_count, bookkeeping_assertion_count, virtual_assertion_count);
        {
          SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
          try {
            reader.$read_default_float_format$.bind($sym0$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, $str1$______KB__S_statistics, control_vars.kb_loaded());
            PrintLow.format(stream, $str2$__FORTs______________________9___, fort_count);
            PrintLow.format(stream, $str3$___Constants_________________9___, constant_count);
            if ((!(constant_count.isZero()))) {
              PrintLow.format(stream, $str4$____cached_indexing__________9___, cached_constant_index_count, number_utilities.percent(cached_constant_index_count, constant_count, THREE_INTEGER));
            }
            PrintLow.format(stream, $str5$___NARTs_____________________9___, nart_count);
            if ((!(nart_count.isZero()))) {
              PrintLow.format(stream, $str4$____cached_indexing__________9___, cached_nart_index_count, number_utilities.percent(cached_nart_index_count, nart_count, THREE_INTEGER));
              PrintLow.format(stream, $str6$____cached_HL_formulas_______9___, cached_nart_hl_formula_count, number_utilities.percent(cached_nart_hl_formula_count, nart_count, THREE_INTEGER));
            }
            PrintLow.format(stream, $str7$__Assertions_________________9___, total_assertion_count);
            PrintLow.format(stream, $str8$___KB_Assertions_____________9___, kb_assertion_count);
            if ((!(kb_assertion_count.isZero()))) {
              PrintLow.format(stream, $str9$____cached___________________9___, cached_assertion_count, number_utilities.percent(cached_assertion_count, kb_assertion_count, THREE_INTEGER));
            }
            PrintLow.format(stream, $str10$___Bookkeeping_Assertions____9___, bookkeeping_assertion_count);
            PrintLow.format(stream, $str11$__Deductions_________________9___, deduction_count);
            if ((!(deduction_count.isZero()))) {
              PrintLow.format(stream, $str9$____cached___________________9___, cached_deduction_count, number_utilities.percent(cached_deduction_count, deduction_count, THREE_INTEGER));
            }
            PrintLow.format(stream, $str12$__KB_HL_supports_____________9___, kb_hl_support_count);
            if ((!(kb_hl_support_count.isZero()))) {
              PrintLow.format(stream, $str9$____cached___________________9___, cached_kb_hl_support_count, number_utilities.percent(cached_kb_hl_support_count, kb_hl_support_count, THREE_INTEGER));
            }
            PrintLow.format(stream, $str13$__Unrepresented_terms________9___, unrepresented_term_count);
            if ((!(unrepresented_term_count.isZero()))) {
              PrintLow.format(stream, $str4$____cached_indexing__________9___, cached_unrepresented_term_index_count, number_utilities.percent(cached_unrepresented_term_index_count, unrepresented_term_count, THREE_INTEGER));
            }
            streams_high.terpri(stream);
          } finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 9045) 
  private static SubLSymbol $estimated_assertions_per_constant$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9155) 
  private static SubLSymbol $estimated_constants_per_nart$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9229) 
  private static SubLSymbol $estimated_assertions_per_deduction$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9303) 
  private static SubLSymbol $estimated_assertions_per_clause_struc$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9377) 
  private static SubLSymbol $estimated_assertions_per_meta_assertion$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9451) 
  private static SubLSymbol $estimated_arguments_per_assertion$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9525) 
  private static SubLSymbol $estimated_assertions_per_unrepresented_term$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 9597) 
  private static SubLSymbol $estimated_deductions_per_hl_support$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 11536) 
  private static SubLSymbol $kb_table_padding_multiplier$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 11593) 
  public static final SubLObject setup_kb_tables_int(SubLObject exactP, SubLObject constant_count, SubLObject nart_count, SubLObject assertion_count, SubLObject deduction_count, SubLObject kb_hl_support_count, SubLObject clause_struc_count, SubLObject kb_unrepresented_term_count) {
    constant_count = Numbers.ceiling(Numbers.multiply(constant_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    nart_count = Numbers.ceiling(Numbers.multiply(nart_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    assertion_count = Numbers.ceiling(Numbers.multiply(assertion_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    deduction_count = Numbers.ceiling(Numbers.multiply(deduction_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    kb_hl_support_count = Numbers.ceiling(Numbers.multiply(kb_hl_support_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    clause_struc_count = Numbers.ceiling(Numbers.multiply(clause_struc_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    kb_unrepresented_term_count = Numbers.ceiling(Numbers.multiply(kb_unrepresented_term_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
    setup_kb_fort_tables(constant_count, nart_count, exactP);
    setup_kb_assertion_tables(assertion_count, exactP);
    setup_kb_deduction_tables(deduction_count, exactP);
    kb_hl_supports.setup_kb_hl_support_tables(kb_hl_support_count, exactP);
    clause_strucs.setup_clause_struc_table(clause_struc_count, exactP);
    unrepresented_terms.setup_unrepresented_term_table(kb_unrepresented_term_count, exactP);
    variables.setup_variable_table();
    kb_indexing_datastructures.setup_indexing_tables(constant_count);
    assertions_low.setup_rule_set(assertion_count);
    cardinality_estimates.setup_cardinality_tables(constant_count);
    return constant_count;
  }

  /** Setup the kb fort tables, based on an estimate of CONSTANT-COUNT total constants and NART-COUNT total narts. */
  @SubL(source = "cycl/kb-utilities.lisp", position = 13245) 
  public static final SubLObject setup_kb_fort_tables(SubLObject constant_count, SubLObject nart_count, SubLObject exactP) {
    {
      SubLObject constant_table_size = constant_count;
      SubLObject nart_table_size = nart_count;
      constant_handles.setup_constant_tables(constant_table_size, exactP);
      nart_handles.setup_nart_table(nart_table_size, exactP);
      nart_hl_formula_manager.setup_nart_hl_formula_table(nart_table_size, exactP);
      nart_index_manager.setup_nart_index_table(nart_table_size, exactP);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 13767) 
  public static final SubLObject setup_kb_assertion_tables(SubLObject assertion_table_size, SubLObject exactP) {
    assertion_handles.setup_assertion_table(assertion_table_size, exactP);
    assertion_manager.setup_assertion_content_table(assertion_table_size, exactP);
    return NIL;
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 13977) 
  public static final SubLObject setup_kb_deduction_tables(SubLObject deduction_table_size, SubLObject exactP) {
    deduction_handles.setup_deduction_table(deduction_table_size, exactP);
    deduction_manager.setup_deduction_content_table(deduction_table_size, exactP);
    return NIL;
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 14625) 
  private static SubLSymbol $default_estimated_constant_count$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 15211) 
  public static final SubLObject clear_kb_state_int() {
    clause_strucs.free_all_clause_strucs();
    kb_hl_supports.free_all_kb_hl_support();
    deduction_handles.free_all_deductions();
    assertion_handles.free_all_assertions();
    nart_handles.free_all_narts();
    constant_handles.free_all_constants();
    constant_completion_high.map_constants_in_completions(Symbols.symbol_function($sym70$INIT_CONSTANT));
    unrepresented_terms.clear_unrepresented_term_table();
    forward.clear_current_forward_inference_environment();
    bookkeeping_store.clear_bookkeeping_binary_gaf_store();
    clear_kb_state_hashes();
    return NIL;
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 16449) 
  public static final SubLObject possibly_clear_dumpable_kb_state_hashes() {
    if ((NIL != defns.defns_cache_unbuiltP())) {
      defns.clear_defns_cache();
    }
    if ((NIL != somewhere_cache.somewhere_cache_unbuiltP())) {
      somewhere_cache.clear_all_somewhere_caches();
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 16687) 
  public static final SubLObject possibly_initialize_dumpable_kb_state_hashes() {
    if ((NIL != nart_hl_formula_manager.nart_hl_formulas_unbuiltP())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 869");
    }
    if ((NIL != sbhl_link_methods.non_fort_isa_tables_unbuiltP())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1806");
    }
    if ((NIL != tva_cache.tva_cache_unbuiltP())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3822");
    }
    if ((NIL != defns.defns_cache_unbuiltP())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10610");
    }
    if ((NIL != somewhere_cache.somewhere_cache_unbuiltP())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32146");
    }
    if ((NIL != arity.arity_cache_unbuiltP())) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12081");
    }
    return NIL;
  }

  /** Clear any hashes related to KB state. */
  @SubL(source = "cycl/kb-utilities.lisp", position = 17207) 
  public static final SubLObject clear_kb_state_hashes() {
    possibly_clear_dumpable_kb_state_hashes();
    after_adding.clear_after_addings();
    after_adding.clear_after_removings();
    equality_store.clear_some_equality_assertions_somewhere_set();
    at_utilities.clear_all_arg_type_predicate_caches();
    return NIL;
  }

  /** Initialize any hashes related to KB state. */
  @SubL(source = "cycl/kb-utilities.lisp", position = 17576) 
  public static final SubLObject initialize_kb_state_hashes() {
    possibly_initialize_dumpable_kb_state_hashes();
    after_adding.rebuild_after_adding_caches();
    equality_store.initialize_some_equality_assertions_somewhere_set();
    at_utilities.initialize_all_arg_type_predicate_caches();
    return NIL;
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 17865) 
  public static final SubLObject swap_out_all_pristine_kb_objects() {
    assertion_manager.swap_out_all_pristine_assertions();
    deduction_manager.swap_out_all_pristine_deductions();
    constant_index_manager.swap_out_all_pristine_constant_indices();
    nart_index_manager.swap_out_all_pristine_nart_indices();
    nart_hl_formula_manager.swap_out_all_pristine_nart_hl_formulas();
    unrepresented_term_index_manager.swap_out_all_pristine_unrepresented_term_indices();
    kb_hl_support_manager.swap_out_all_pristine_kb_hl_supports();
    sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
    return NIL;
  }

  public static final class $hl_external_id_string_p$UnaryFunction extends UnaryFunction {
    public $hl_external_id_string_p$UnaryFunction() { super(extractFunctionNamed("HL-EXTERNAL-ID-STRING-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4903"); }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 29543) 
  private static SubLSymbol $sort_terms_constants_by_name$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 29694) 
  private static SubLSymbol $sort_terms_ignore_variable_symbols$ = null;

  /** This trumps *sort-terms-constants-by-name* */
  @SubL(source = "cycl/kb-utilities.lisp", position = 29758) 
  private static SubLSymbol $sort_terms_by_internal_idP$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 29859) 
  public static final SubLObject sort_terms(SubLObject list, SubLObject copyP, SubLObject stableP, SubLObject constants_by_nameP, SubLObject ignore_variable_symbolsP, SubLObject key, SubLObject use_internal_idsP) {
    if ((copyP == UNPROVIDED)) {
      copyP = NIL;
    }
    if ((stableP == UNPROVIDED)) {
      stableP = NIL;
    }
    if ((constants_by_nameP == UNPROVIDED)) {
      constants_by_nameP = NIL;
    }
    if ((ignore_variable_symbolsP == UNPROVIDED)) {
      ignore_variable_symbolsP = NIL;
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((use_internal_idsP == UNPROVIDED)) {
      use_internal_idsP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $sort_terms_constants_by_name$.currentBinding(thread);
          SubLObject _prev_bind_1 = $sort_terms_ignore_variable_symbols$.currentBinding(thread);
          SubLObject _prev_bind_2 = $sort_terms_by_internal_idP$.currentBinding(thread);
          try {
            $sort_terms_constants_by_name$.bind(constants_by_nameP, thread);
            $sort_terms_ignore_variable_symbols$.bind(ignore_variable_symbolsP, thread);
            $sort_terms_by_internal_idP$.bind(use_internal_idsP, thread);
            {
              SubLObject seq = ((NIL != copyP) ? ((SubLObject) conses_high.copy_list(list)) : list);
              SubLObject sort_func = ((NIL != stableP) ? ((SubLObject) Symbols.symbol_function($sym112$STABLE_SORT)) : Symbols.symbol_function($sym113$SORT));
              ans = Functions.funcall(sort_func, seq, Symbols.symbol_function($sym114$FORM_SORT_PRED), key);
            }
          } finally {
            $sort_terms_by_internal_idP$.rebind(_prev_bind_2, thread);
            $sort_terms_ignore_variable_symbols$.rebind(_prev_bind_1, thread);
            $sort_terms_constants_by_name$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 30363) 
  public static final SubLObject term_L(SubLObject term1, SubLObject term2, SubLObject constants_by_nameP, SubLObject ignore_variable_symbolsP, SubLObject use_internal_idsP) {
    if ((constants_by_nameP == UNPROVIDED)) {
      constants_by_nameP = NIL;
    }
    if ((ignore_variable_symbolsP == UNPROVIDED)) {
      ignore_variable_symbolsP = NIL;
    }
    if ((use_internal_idsP == UNPROVIDED)) {
      use_internal_idsP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $sort_terms_constants_by_name$.currentBinding(thread);
          SubLObject _prev_bind_1 = $sort_terms_ignore_variable_symbols$.currentBinding(thread);
          SubLObject _prev_bind_2 = $sort_terms_by_internal_idP$.currentBinding(thread);
          try {
            $sort_terms_constants_by_name$.bind(constants_by_nameP, thread);
            $sort_terms_ignore_variable_symbols$.bind(ignore_variable_symbolsP, thread);
            $sort_terms_by_internal_idP$.bind(use_internal_idsP, thread);
            ans = form_sort_pred(term1, term2);
          } finally {
            $sort_terms_by_internal_idP$.rebind(_prev_bind_2, thread);
            $sort_terms_ignore_variable_symbols$.rebind(_prev_bind_1, thread);
            $sort_terms_constants_by_name$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  public static final class $term_L$BinaryFunction extends BinaryFunction {
    public $term_L$BinaryFunction() { super(extractFunctionNamed("TERM-<")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return term_L(arg1, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED); }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 30879) 
  public static final SubLObject form_sort_pred(SubLObject form1, SubLObject form2) {
    if ((form1 == form2)) {
      return NIL;
    }
    if (form1.isAtom()) {
      if (form2.isAtom()) {
        return atom_sort_pred(form1, form2);
      } else {
        return T;
      }
    } else {
      if (form2.isAtom()) {
        return NIL;
      } else {
        return cons_sort_pred(form1, form2);
      }
    }
  }

  public static final class $form_sort_pred$BinaryFunction extends BinaryFunction {
    public $form_sort_pred$BinaryFunction() { super(extractFunctionNamed("FORM-SORT-PRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return form_sort_pred(arg1, arg2); }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 31295) 
  public static final SubLObject cons_sort_pred(SubLObject cons1, SubLObject cons2) {
    {
      SubLObject curr_cons1 = NIL;
      SubLObject curr_cons2 = NIL;
      for (curr_cons1 = cons1, curr_cons2 = cons2; true; curr_cons1 = curr_cons1.rest(), curr_cons2 = curr_cons2.rest()) {
        {
          SubLObject car1 = curr_cons1.first();
          SubLObject car2 = curr_cons2.first();
          if ((NIL != form_sort_pred(car1, car2))) {
            return T;
          } else if ((NIL != form_sort_pred(car2, car1))) {
            return NIL;
          } else {
            {
              SubLObject cdr1 = curr_cons1.rest();
              SubLObject cdr2 = curr_cons2.rest();
              if (cdr1.isAtom()) {
                if (cdr2.isAtom()) {
                  return atom_sort_pred(cdr1, cdr2);
                } else {
                  return T;
                }
              } else {
                if (cdr2.isAtom()) {
                  return NIL;
                }
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 32051) 
  public static final SubLObject atom_sort_pred(SubLObject atom1, SubLObject atom2) {
    if ((atom1 == atom2)) {
      return NIL;
    }
    return makeBoolean((((NIL != forts.fort_p(atom1))
             && ((NIL == forts.fort_p(atom2))
              || (NIL != fort_sort_pred(atom1, atom2))))
          || ((NIL == forts.fort_p(atom2))
             && (((NIL != variables.variable_p(atom1))
                 && ((NIL == variables.variable_p(atom2))
                  || (NIL != variables.variable_L(atom1, atom2))))
              || ((NIL == variables.variable_p(atom2))
                 && ((atom1.isSymbol()
                     && ((!(atom2.isSymbol()))
                      || (NIL != symbol_sort_pred(atom1, atom2))))
                  || ((!(atom2.isSymbol()))
                     && ((atom1.isString()
                         && ((!(atom2.isString()))
                          || (NIL != Strings.stringL(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))
                      || ((!(atom2.isString()))
                         && ((atom1.isNumber()
                             && ((!(atom2.isNumber()))
                              || atom1.numL(atom2)))
                          || (atom1.isChar()
                             && (!(atom2.isNumber()))
                             && ((!(atom2.isChar()))
                              || (NIL != Characters.charL(atom1, atom2))))))))))))));
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 33309) 
  public static final SubLObject symbol_sort_pred(SubLObject symbol1, SubLObject symbol2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((symbol1.isKeyword()
               && ((!(symbol2.isKeyword()))
                || (NIL != Strings.stringL(Symbols.symbol_name(symbol1), Symbols.symbol_name(symbol2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))
            || ((!(symbol2.isKeyword()))
               && (((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32021"))
                   && ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32022"))
                    || ((NIL == $sort_terms_ignore_variable_symbols$.getDynamicValue(thread))
                       && (NIL != Strings.stringL(Symbols.symbol_name(symbol1), Symbols.symbol_name(symbol2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))))
                || ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32023"))
                   && (NIL != Strings.stringL(Symbols.symbol_name(symbol1), Symbols.symbol_name(symbol2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))))));
    }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 34144) 
  public static final SubLObject fort_sort_pred(SubLObject fort1, SubLObject fort2) {
    if ((NIL != nart_handles.nart_p(fort1))) {
      if ((NIL != nart_handles.nart_p(fort2))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4905");
      } else {
        return NIL;
      }
    } else {
      if ((NIL != nart_handles.nart_p(fort2))) {
        return T;
      } else {
        return constant_sort_pred(fort1, fort2);
      }
    }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 34515) 
  public static final SubLObject constant_sort_pred(SubLObject constant1, SubLObject constant2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $sort_terms_by_internal_idP$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31624");
      } else {
        if ((NIL != $sort_terms_constants_by_name$.getDynamicValue(thread))) {
          return atom_sort_pred(constants_high.constant_name(constant1), constants_high.constant_name(constant2));
        } else {
          return constants_high.constant_external_id_L(constant1, constant2);
        }
      }
    }
  }

  public static final class $fort_L$BinaryFunction extends BinaryFunction {
    public $fort_L$BinaryFunction() { super(extractFunctionNamed("FORT-<")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4900"); }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 36295) 
  private static SubLSymbol $definitional_pred_sort_order$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 37843) 
  public static SubLSymbol $term_order_method_table$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 38067) 
  public static final SubLObject term_order_assertion_method(SubLObject object) {
    return Numbers.add(ONE_INTEGER, Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4916"));
  }

  /** Fancy way of returning max term order within cons tree.
Handles dotted pairs. */
  @SubL(source = "cycl/kb-utilities.lisp", position = 38229) 
  public static final SubLObject term_order_cons_method(SubLObject object) {
    {
      SubLObject order = ZERO_INTEGER;
      SubLObject rest = NIL;
      SubLObject item = NIL;
      for (rest = object, item = rest.first(); rest.rest().isCons(); rest = rest.rest(), item = rest.first()) {
        order = Numbers.max(order, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4917"));
      }
      order = Numbers.max(order, Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4918"));
      if ((NIL != rest.rest())) {
        order = Numbers.max(order, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4919"));
      }
      return order;
    }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 46723) 
  private static SubLSymbol $cached_creation_time_caching_state$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 47141) 
  private static SubLSymbol $cached_creator_caching_state$ = null;

  /** Temporary variable.  @todo hard-code to T */
  @SubL(source = "cycl/kb-utilities.lisp", position = 63613) 
  private static SubLSymbol $set_to_collection_uses_reformulatorP$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 65886) 
  private static SubLSymbol $cached_union_all_specs_count_caching_state$ = null;

  public static final class $clear_cached_union_all_specs_count$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_union_all_specs_count$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-UNION-ALL-SPECS-COUNT")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4881"); }
  }

  /** Instances of any of these collections are forbidden */
  @SubL(source = "cycl/kb-utilities.lisp", position = 67110) 
  private static SubLSymbol $forbidden_kb_covering_collection_types$ = null;

  /** Quoted instances of any of these collections are forbidden */
  @SubL(source = "cycl/kb-utilities.lisp", position = 67326) 
  private static SubLSymbol $forbidden_kb_covering_quoted_collection_types$ = null;

  /** These exact collections are forbidden */
  @SubL(source = "cycl/kb-utilities.lisp", position = 67564) 
  private static SubLSymbol $forbidden_cols$ = null;

  /** Specs of any of these collections are forbidden */
  @SubL(source = "cycl/kb-utilities.lisp", position = 67766) 
  private static SubLSymbol $forbidden_specs$ = null;

  /** temporary variable for forbidden-kb-covering-collection? */
  @SubL(source = "cycl/kb-utilities.lisp", position = 71974) 
  private static SubLSymbol $min_each_spec_cardinality$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 72711) 
  private static SubLSymbol $forbidden_kb_covering_collections_set_caching_state$ = null;

  public static final class $clear_forbidden_kb_covering_collections_set$ZeroArityFunction extends ZeroArityFunction {
    public $clear_forbidden_kb_covering_collections_set$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4882"); }
  }

  @SubL(source = "cycl/kb-utilities.lisp", position = 74948) 
  private static SubLSymbol $all_specs_set_caching_state$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 75151) 
  private static SubLSymbol $all_genls_set_caching_state$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 103725) 
  private static SubLSymbol $predicate_type_arity_table$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 111076) 
  private static SubLSymbol $coasserted_fort_source$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 111190) 
  private static SubLSymbol $coasserted_fort_set$ = null;

  @SubL(source = "cycl/kb-utilities.lisp", position = 112106) 
  private static SubLSymbol $cached_compact_hl_external_id_string_caching_state$ = null;

  public static final SubLObject declare_kb_utilities_file() {
    declareFunction(myName, "kb_statistics", "KB-STATISTICS", 0, 1, false);
    //declareFunction(myName, "kb_content_statistics", "KB-CONTENT-STATISTICS", 0, 1, false);
    //declareFunction(myName, "histogram_of_predicate_extent", "HISTOGRAM-OF-PREDICATE-EXTENT", 0, 2, false);
    //declareFunction(myName, "mt_assertion_count", "MT-ASSERTION-COUNT", 1, 0, false);
    //declareFunction(myName, "broad_mt_assertion_count", "BROAD-MT-ASSERTION-COUNT", 1, 0, false);
    //declareFunction(myName, "most_populous_predicates_in_relevant_mts", "MOST-POPULOUS-PREDICATES-IN-RELEVANT-MTS", 1, 1, false);
    //declareFunction(myName, "most_populous_predicates_in_mt", "MOST-POPULOUS-PREDICATES-IN-MT", 1, 2, false);
    //declareFunction(myName, "setup_kb_shelf", "SETUP-KB-SHELF", 4, 0, false);
    //declareFunction(myName, "estimated_assertions_per_constant", "ESTIMATED-ASSERTIONS-PER-CONSTANT", 0, 0, false);
    //declareFunction(myName, "estimated_constants_per_nart", "ESTIMATED-CONSTANTS-PER-NART", 0, 0, false);
    //declareFunction(myName, "estimated_assertions_per_deduction", "ESTIMATED-ASSERTIONS-PER-DEDUCTION", 0, 0, false);
    //declareFunction(myName, "estimated_assertions_per_clause_struc", "ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC", 0, 0, false);
    //declareFunction(myName, "estimated_assertions_per_meta_assertion", "ESTIMATED-ASSERTIONS-PER-META-ASSERTION", 0, 0, false);
    //declareFunction(myName, "estimated_arguments_per_assertion", "ESTIMATED-ARGUMENTS-PER-ASSERTION", 0, 0, false);
    //declareFunction(myName, "estimated_assertions_per_unrepresented_term", "ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM", 0, 0, false);
    //declareFunction(myName, "estimated_deductions_per_hl_support", "ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT", 0, 0, false);
    //declareFunction(myName, "estimated_assertions_per_hl_support", "ESTIMATED-ASSERTIONS-PER-HL-SUPPORT", 0, 0, false);
    //declareFunction(myName, "setup_kb_tables", "SETUP-KB-TABLES", 1, 0, false);
    declareFunction(myName, "setup_kb_tables_int", "SETUP-KB-TABLES-INT", 8, 0, false);
    declareFunction(myName, "setup_kb_fort_tables", "SETUP-KB-FORT-TABLES", 3, 0, false);
    declareFunction(myName, "setup_kb_assertion_tables", "SETUP-KB-ASSERTION-TABLES", 2, 0, false);
    declareFunction(myName, "setup_kb_deduction_tables", "SETUP-KB-DEDUCTION-TABLES", 2, 0, false);
    //declareFunction(myName, "finalize_kb_tables", "FINALIZE-KB-TABLES", 0, 0, false);
    //declareFunction(myName, "finalize_kb_fort_tables", "FINALIZE-KB-FORT-TABLES", 0, 0, false);
    //declareFunction(myName, "clear_kb_state", "CLEAR-KB-STATE", 0, 1, false);
    declareFunction(myName, "clear_kb_state_int", "CLEAR-KB-STATE-INT", 0, 0, false);
    //declareFunction(myName, "clear_kb_fort_state", "CLEAR-KB-FORT-STATE", 0, 1, false);
    declareFunction(myName, "possibly_clear_dumpable_kb_state_hashes", "POSSIBLY-CLEAR-DUMPABLE-KB-STATE-HASHES", 0, 0, false);
    declareFunction(myName, "possibly_initialize_dumpable_kb_state_hashes", "POSSIBLY-INITIALIZE-DUMPABLE-KB-STATE-HASHES", 0, 0, false);
    declareFunction(myName, "clear_kb_state_hashes", "CLEAR-KB-STATE-HASHES", 0, 0, false);
    declareFunction(myName, "initialize_kb_state_hashes", "INITIALIZE-KB-STATE-HASHES", 0, 0, false);
    declareFunction(myName, "swap_out_all_pristine_kb_objects", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 0, 0, false);
    //declareFunction(myName, "show_new_kb_state", "SHOW-NEW-KB-STATE", 0, 1, false);
    //declareFunction(myName, "clear_new_kb_state", "CLEAR-NEW-KB-STATE", 0, 0, false);
    //declareFunction(myName, "kb_checkpoint_p", "KB-CHECKPOINT-P", 1, 0, false);
    //declareFunction(myName, "new_kb_checkpoint", "NEW-KB-CHECKPOINT", 0, 0, false);
    //declareFunction(myName, "kb_checkpoint_currentP", "KB-CHECKPOINT-CURRENT?", 1, 0, false);
    //declareFunction(myName, "theory_checkpoint_p", "THEORY-CHECKPOINT-P", 1, 0, false);
    //declareFunction(myName, "new_theory_checkpoint", "NEW-THEORY-CHECKPOINT", 0, 0, false);
    //declareFunction(myName, "theory_checkpoint_currentP", "THEORY-CHECKPOINT-CURRENT?", 1, 0, false);
    //declareFunction(myName, "hl_internal_id_string_p", "HL-INTERNAL-ID-STRING-P", 1, 0, false);
    //declareFunction(myName, "compact_hl_internal_id_string_p", "COMPACT-HL-INTERNAL-ID-STRING-P", 1, 0, false);
    //declareFunction(myName, "hl_internal_id_string", "HL-INTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "compact_hl_internal_id_string", "COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_object_by_hl_internal_id_string", "FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_object_by_compact_hl_internal_id_string", "FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "maybe_find_object_by_hl_internal_id_string", "MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "maybe_find_object_by_compact_hl_internal_id_string", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "hl_external_id_string_p", "HL-EXTERNAL-ID-STRING-P", 1, 0, false); new $hl_external_id_string_p$UnaryFunction();
    //declareFunction(myName, "compact_hl_external_id_string_p", "COMPACT-HL-EXTERNAL-ID-STRING-P", 1, 0, false);
    //declareFunction(myName, "compact_hl_external_id_stringP", "COMPACT-HL-EXTERNAL-ID-STRING?", 1, 0, false);
    //declareFunction(myName, "hl_external_id_string", "HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "compact_hl_external_id_string", "COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_object_by_hl_external_id_string", "FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_cycl_object_by_compact_hl_external_id_string", "FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_object_by_compact_hl_external_id_string", "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "maybe_find_object_by_compact_hl_external_id_string", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_object_by_hl_id_string", "FIND-OBJECT-BY-HL-ID-STRING", 2, 0, false);
    //declareFunction(myName, "invalid_hl_object_p", "INVALID-HL-OBJECT-P", 1, 0, false);
    //declareFunction(myName, "string_for_unlexified_term", "STRING-FOR-UNLEXIFIED-TERM", 1, 1, false);
    declareFunction(myName, "sort_terms", "SORT-TERMS", 1, 6, false);
    declareFunction(myName, "term_L", "TERM-<", 2, 3, false); new $term_L$BinaryFunction();
    //declareFunction(myName, "term_L_with_constant_by_name", "TERM-<-WITH-CONSTANT-BY-NAME", 2, 1, false);
    declareFunction(myName, "form_sort_pred", "FORM-SORT-PRED", 2, 0, false); new $form_sort_pred$BinaryFunction();
    declareFunction(myName, "cons_sort_pred", "CONS-SORT-PRED", 2, 0, false);
    declareFunction(myName, "atom_sort_pred", "ATOM-SORT-PRED", 2, 0, false);
    declareFunction(myName, "symbol_sort_pred", "SYMBOL-SORT-PRED", 2, 0, false);
    declareFunction(myName, "fort_sort_pred", "FORT-SORT-PRED", 2, 0, false);
    declareFunction(myName, "constant_sort_pred", "CONSTANT-SORT-PRED", 2, 0, false);
    //declareFunction(myName, "nart_sort_pred", "NART-SORT-PRED", 2, 0, false);
    //declareFunction(myName, "fort_L", "FORT-<", 2, 0, false); new $fort_L$BinaryFunction();
    //declareFunction(myName, "sort_forts", "SORT-FORTS", 1, 0, false);
    //declareFunction(myName, "definitional_pred_L", "DEFINITIONAL-PRED-<", 2, 1, false);
    //declareFunction(myName, "term_order", "TERM-ORDER", 1, 0, false);
    declareFunction(myName, "term_order_assertion_method", "TERM-ORDER-ASSERTION-METHOD", 1, 0, false);
    declareFunction(myName, "term_order_cons_method", "TERM-ORDER-CONS-METHOD", 1, 0, false);
    //declareFunction(myName, "term_similarity_metric", "TERM-SIMILARITY-METRIC", 2, 0, false);
    //declareFunction(myName, "instance_similarity_statistics", "INSTANCE-SIMILARITY-STATISTICS", 1, 1, false);
    //declareFunction(myName, "spec_similarity_statistics", "SPEC-SIMILARITY-STATISTICS", 1, 1, false);
    //declareFunction(myName, "term_similarity_metric_generalizations_internal", "TERM-SIMILARITY-METRIC-GENERALIZATIONS-INTERNAL", 1, 0, false);
    //declareFunction(myName, "term_similarity_metric_generalizations", "TERM-SIMILARITY-METRIC-GENERALIZATIONS", 1, 0, false);
    //declareFunction(myName, "term_similarity_all_isa", "TERM-SIMILARITY-ALL-ISA", 1, 0, false);
    //declareFunction(myName, "similarity_statistics_int", "SIMILARITY-STATISTICS-INT", 2, 0, false);
    //declareFunction(myName, "constants_created_between", "CONSTANTS-CREATED-BETWEEN", 2, 1, false);
    //declareFunction(myName, "assertion_nats", "ASSERTION-NATS", 1, 0, false);
    //declareFunction(myName, "assertion_tous", "ASSERTION-TOUS", 1, 0, false);
    //declareFunction(myName, "assertions_between", "ASSERTIONS-BETWEEN", 2, 1, false);
    //declareFunction(myName, "term_assertions_between", "TERM-ASSERTIONS-BETWEEN", 3, 1, false);
    //declareFunction(myName, "creation_time_L", "CREATION-TIME-<", 2, 0, false);
    //declareFunction(myName, "clear_cached_creation_time", "CLEAR-CACHED-CREATION-TIME", 0, 0, false);
    //declareFunction(myName, "remove_cached_creation_time", "REMOVE-CACHED-CREATION-TIME", 1, 0, false);
    //declareFunction(myName, "cached_creation_time_internal", "CACHED-CREATION-TIME-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_creation_time", "CACHED-CREATION-TIME", 1, 0, false);
    //declareFunction(myName, "creator_L", "CREATOR-<", 2, 0, false);
    //declareFunction(myName, "clear_cached_creator", "CLEAR-CACHED-CREATOR", 0, 0, false);
    //declareFunction(myName, "remove_cached_creator", "REMOVE-CACHED-CREATOR", 1, 0, false);
    //declareFunction(myName, "cached_creator_internal", "CACHED-CREATOR-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_creator", "CACHED-CREATOR", 1, 0, false);
    //declareFunction(myName, "assert_date_L", "ASSERT-DATE-<", 2, 0, false);
    //declareFunction(myName, "assert_cyclist_L", "ASSERT-CYCLIST-<", 2, 0, false);
    //declareFunction(myName, "probably_most_recent_assertion", "PROBABLY-MOST-RECENT-ASSERTION", 0, 0, false);
    //declareFunction(myName, "assert_timestamp_L", "ASSERT-TIMESTAMP-<", 2, 0, false);
    //declareFunction(myName, "all_constants", "ALL-CONSTANTS", 0, 0, false);
    //declareFunction(myName, "all_narts", "ALL-NARTS", 0, 0, false);
    //declareFunction(myName, "all_forts", "ALL-FORTS", 0, 0, false);
    //declareFunction(myName, "all_deductions", "ALL-DEDUCTIONS", 0, 0, false);
    //declareFunction(myName, "all_kb_hl_supports", "ALL-KB-HL-SUPPORTS", 0, 0, false);
    //declareFunction(myName, "all_assertions", "ALL-ASSERTIONS", 0, 0, false);
    //declareFunction(myName, "all_gafs", "ALL-GAFS", 0, 0, false);
    //declareFunction(myName, "all_forward_gafs", "ALL-FORWARD-GAFS", 0, 0, false);
    //declareFunction(myName, "all_backward_gafs", "ALL-BACKWARD-GAFS", 0, 0, false);
    //declareFunction(myName, "all_rules", "ALL-RULES", 0, 0, false);
    //declareFunction(myName, "all_forward_rules", "ALL-FORWARD-RULES", 0, 0, false);
    //declareFunction(myName, "all_backward_rules", "ALL-BACKWARD-RULES", 0, 0, false);
    //declareFunction(myName, "sorted_non_deduced_backward_gafs", "SORTED-NON-DEDUCED-BACKWARD-GAFS", 0, 0, false);
    //declareFunction(myName, "kb_object_count_list", "KB-OBJECT-COUNT-LIST", 0, 0, false);
    //declareFunction(myName, "kb_object_count_lists_new_constant_count", "KB-OBJECT-COUNT-LISTS-NEW-CONSTANT-COUNT", 2, 0, false);
    //declareFunction(myName, "kb_object_count_lists_new_nart_count", "KB-OBJECT-COUNT-LISTS-NEW-NART-COUNT", 2, 0, false);
    //declareFunction(myName, "kb_object_count_lists_new_assertion_count", "KB-OBJECT-COUNT-LISTS-NEW-ASSERTION-COUNT", 2, 0, false);
    //declareFunction(myName, "kb_object_count_lists_new_kb_hl_support_count", "KB-OBJECT-COUNT-LISTS-NEW-KB-HL-SUPPORT-COUNT", 2, 0, false);
    //declareFunction(myName, "kb_object_count_lists_new_deduction_count", "KB-OBJECT-COUNT-LISTS-NEW-DEDUCTION-COUNT", 2, 0, false);
    //declareFunction(myName, "kb_object_count_lists_differentP", "KB-OBJECT-COUNT-LISTS-DIFFERENT?", 2, 0, false);
    //declareMacro(myName, "showing_new_kb_object_counts", "SHOWING-NEW-KB-OBJECT-COUNTS");
    //declareFunction(myName, "all_constants_sorted_by_creation_time_estimate", "ALL-CONSTANTS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
    //declareFunction(myName, "guess_constant_creation_time", "GUESS-CONSTANT-CREATION-TIME", 1, 0, false);
    //declareFunction(myName, "lowest_assertion_id_for_constant", "LOWEST-ASSERTION-ID-FOR-CONSTANT", 1, 0, false);
    //declareFunction(myName, "sort_constants_by_sorting_info", "SORT-CONSTANTS-BY-SORTING-INFO", 2, 0, false);
    //declareFunction(myName, "constant_sorting_funky_L", "CONSTANT-SORTING-FUNKY-<", 2, 0, false);
    //declareFunction(myName, "definitional_type_for_naut", "DEFINITIONAL-TYPE-FOR-NAUT", 1, 0, false);
    //declareMacro(myName, "do_gaf_arg_index_naut", "DO-GAF-ARG-INDEX-NAUT");
    //declareMacro(myName, "do_misc_index_naut", "DO-MISC-INDEX-NAUT");
    //declareFunction(myName, "map_gaf_arg_index_naut", "MAP-GAF-ARG-INDEX-NAUT", 3, 3, false);
    //declareFunction(myName, "map_misc_index_naut", "MAP-MISC-INDEX-NAUT", 2, 1, false);
    //declareFunction(myName, "set_to_collection", "SET-TO-COLLECTION", 1, 1, false);
    //declareFunction(myName, "set_type_constraint", "SET-TYPE-CONSTRAINT", 1, 1, false);
    //declareFunction(myName, "clear_cached_union_all_specs_count", "CLEAR-CACHED-UNION-ALL-SPECS-COUNT", 0, 0, false); new $clear_cached_union_all_specs_count$ZeroArityFunction();
    //declareFunction(myName, "remove_cached_union_all_specs_count", "REMOVE-CACHED-UNION-ALL-SPECS-COUNT", 2, 0, false);
    //declareFunction(myName, "cached_union_all_specs_count_internal", "CACHED-UNION-ALL-SPECS-COUNT-INTERNAL", 2, 0, false);
    //declareFunction(myName, "cached_union_all_specs_count", "CACHED-UNION-ALL-SPECS-COUNT", 2, 0, false);
    //declareFunction(myName, "collection_coverage_ratio", "COLLECTION-COVERAGE-RATIO", 1, 2, false);
    //declareFunction(myName, "union_all_constant_specs_count", "UNION-ALL-CONSTANT-SPECS-COUNT", 2, 0, false);
    //declareFunction(myName, "constant_collection_coverage_ratio", "CONSTANT-COLLECTION-COVERAGE-RATIO", 1, 2, false);
    //declareFunction(myName, "compute_kb_covering_collections", "COMPUTE-KB-COVERING-COLLECTIONS", 4, 0, false);
    //declareFunction(myName, "print_kb_covering_collections", "PRINT-KB-COVERING-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "optimize_coverage", "OPTIMIZE-COVERAGE", 2, 0, false);
    //declareFunction(myName, "break_col_into_specs_and_merge", "BREAK-COL-INTO-SPECS-AND-MERGE", 4, 0, false);
    //declareFunction(myName, "clear_forbidden_kb_covering_collections_set", "CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false); new $clear_forbidden_kb_covering_collections_set$ZeroArityFunction();
    //declareFunction(myName, "remove_forbidden_kb_covering_collections_set", "REMOVE-FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
    //declareFunction(myName, "forbidden_kb_covering_collections_set_internal", "FORBIDDEN-KB-COVERING-COLLECTIONS-SET-INTERNAL", 0, 0, false);
    //declareFunction(myName, "forbidden_kb_covering_collections_set", "FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
    //declareFunction(myName, "forbidden_kb_covering_collectionP", "FORBIDDEN-KB-COVERING-COLLECTION?", 1, 0, false);
    //declareFunction(myName, "spec_union_overlap_cardinality", "SPEC-UNION-OVERLAP-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "spec_overlap_cardinality", "SPEC-OVERLAP-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "clear_all_specs_set", "CLEAR-ALL-SPECS-SET", 0, 0, false);
    //declareFunction(myName, "remove_all_specs_set", "REMOVE-ALL-SPECS-SET", 1, 0, false);
    //declareFunction(myName, "all_specs_set_internal", "ALL-SPECS-SET-INTERNAL", 1, 0, false);
    //declareFunction(myName, "all_specs_set", "ALL-SPECS-SET", 1, 0, false);
    //declareFunction(myName, "clear_all_genls_set", "CLEAR-ALL-GENLS-SET", 0, 0, false);
    //declareFunction(myName, "remove_all_genls_set", "REMOVE-ALL-GENLS-SET", 1, 0, false);
    //declareFunction(myName, "all_genls_set_internal", "ALL-GENLS-SET-INTERNAL", 1, 0, false);
    //declareFunction(myName, "all_genls_set", "ALL-GENLS-SET", 1, 0, false);
    //declareFunction(myName, "special_collection_coverage_ratio", "SPECIAL-COLLECTION-COVERAGE-RATIO", 1, 0, false);
    //declareFunction(myName, "max_non_overlapping_kb_coverage_cols", "MAX-NON-OVERLAPPING-KB-COVERAGE-COLS", 1, 0, false);
    //declareFunction(myName, "pretty_print_cycl_to_string", "PRETTY-PRINT-CYCL-TO-STRING", 1, 0, false);
    //declareFunction(myName, "string_remove_nart_affixes", "STRING-REMOVE-NART-AFFIXES", 1, 0, false);
    //declareFunction(myName, "nart_affix_char_p", "NART-AFFIX-CHAR-P", 1, 0, false);
    //declareFunction(myName, "collection_subsumption_paths", "COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
    //declareFunction(myName, "collection_subsumption_paths_int", "COLLECTION-SUBSUMPTION-PATHS-INT", 1, 0, false);
    //declareFunction(myName, "collection_subsumption_paths_co_genl_col", "COLLECTION-SUBSUMPTION-PATHS-CO-GENL-COL", 2, 0, false);
    //declareFunction(myName, "predicate_subsumption_paths", "PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
    //declareFunction(myName, "predicate_subsumption_paths_int", "PREDICATE-SUBSUMPTION-PATHS-INT", 1, 0, false);
    //declareFunction(myName, "predicate_subsumption_paths_co_genl_pred", "PREDICATE-SUBSUMPTION-PATHS-CO-GENL-PRED", 2, 0, false);
    //declareFunction(myName, "predicate_type_for_arity", "PREDICATE-TYPE-FOR-ARITY", 1, 0, false);
    //declareFunction(myName, "arity_of_predicate_type", "ARITY-OF-PREDICATE-TYPE", 1, 0, false);
    //declareFunction(myName, "random_hl_gaf", "RANDOM-HL-GAF", 0, 0, false);
    //declareFunction(myName, "random_non_hl_gaf", "RANDOM-NON-HL-GAF", 0, 0, false);
    //declareFunction(myName, "random_sbhl_gaf", "RANDOM-SBHL-GAF", 0, 0, false);
    //declareFunction(myName, "random_non_sbhl_gaf", "RANDOM-NON-SBHL-GAF", 0, 0, false);
    //declareFunction(myName, "hl_gafP", "HL-GAF?", 1, 0, false);
    //declareFunction(myName, "non_hl_gafP", "NON-HL-GAF?", 1, 0, false);
    //declareFunction(myName, "sbhl_gafP", "SBHL-GAF?", 1, 0, false);
    //declareFunction(myName, "non_sbhl_gafP", "NON-SBHL-GAF?", 1, 0, false);
    //declareFunction(myName, "random_argnum", "RANDOM-ARGNUM", 1, 1, false);
    //declareFunction(myName, "safe_random_closed_argnum", "SAFE-RANDOM-CLOSED-ARGNUM", 1, 1, false);
    //declareFunction(myName, "random_closed_argnum", "RANDOM-CLOSED-ARGNUM", 1, 1, false);
    //declareFunction(myName, "random_closed_argnum_int", "RANDOM-CLOSED-ARGNUM-INT", 3, 0, false);
    //declareFunction(myName, "turn_a_random_arg_into_a_variable", "TURN-A-RANDOM-ARG-INTO-A-VARIABLE", 1, 1, false);
    //declareFunction(myName, "random_predicate", "RANDOM-PREDICATE", 0, 0, false);
    //declareFunction(myName, "random_binary_predicate", "RANDOM-BINARY-PREDICATE", 0, 0, false);
    //declareFunction(myName, "gather_dates", "GATHER-DATES", 1, 1, false);
    //declareFunction(myName, "dateP", "DATE?", 1, 0, false);
    //declareFunction(myName, "not_at_all_commutative_predicate_p", "NOT-AT-ALL-COMMUTATIVE-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "at_least_partially_commutative_predicate_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "not_at_all_commutative_relation_p", "NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
    //declareFunction(myName, "at_least_partially_commutative_relation_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
    //declareFunction(myName, "find_invalid_constant_references", "FIND-INVALID-CONSTANT-REFERENCES", 1, 0, false);
    //declareFunction(myName, "fix_invalid_constant_references", "FIX-INVALID-CONSTANT-REFERENCES", 1, 0, false);
    //declareFunction(myName, "fix_invalid_constant_reference", "FIX-INVALID-CONSTANT-REFERENCE", 3, 1, false);
    //declareFunction(myName, "find_former_constants_named", "FIND-FORMER-CONSTANTS-NAMED", 1, 0, false);
    //declareFunction(myName, "coasserted_forts", "COASSERTED-FORTS", 1, 0, false);
    //declareFunction(myName, "visit_coasserted_fort", "VISIT-COASSERTED-FORT", 1, 0, false);
    //declareFunction(myName, "clear_cached_compact_hl_external_id_string", "CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 0, 0, false);
    //declareFunction(myName, "remove_cached_compact_hl_external_id_string", "REMOVE-CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "cached_compact_hl_external_id_string_internal", "CACHED-COMPACT-HL-EXTERNAL-ID-STRING-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_compact_hl_external_id_string", "CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
    //declareFunction(myName, "write_coasserted_forts", "WRITE-COASSERTED-FORTS", 1, 1, false);
    //declareFunction(myName, "write_all_coasserted_forts_to_file", "WRITE-ALL-COASSERTED-FORTS-TO-FILE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_utilities_file() {
    $estimated_assertions_per_constant$ = deflexical("*ESTIMATED-ASSERTIONS-PER-CONSTANT*", $float61$17_1);
    $estimated_constants_per_nart$ = deflexical("*ESTIMATED-CONSTANTS-PER-NART*", $float62$1_41);
    $estimated_assertions_per_deduction$ = deflexical("*ESTIMATED-ASSERTIONS-PER-DEDUCTION*", $float63$2_67);
    $estimated_assertions_per_clause_struc$ = deflexical("*ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC*", $float64$39_3);
    $estimated_assertions_per_meta_assertion$ = deflexical("*ESTIMATED-ASSERTIONS-PER-META-ASSERTION*", $float65$30_3);
    $estimated_arguments_per_assertion$ = deflexical("*ESTIMATED-ARGUMENTS-PER-ASSERTION*", $float66$1_12);
    $estimated_assertions_per_unrepresented_term$ = deflexical("*ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM*", $float67$7_97);
    $estimated_deductions_per_hl_support$ = deflexical("*ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT*", TEN_INTEGER);
    $kb_table_padding_multiplier$ = deflexical("*KB-TABLE-PADDING-MULTIPLIER*", $float68$1_05);
    $default_estimated_constant_count$ = defparameter("*DEFAULT-ESTIMATED-CONSTANT-COUNT*", $int69$50000);
    $sort_terms_constants_by_name$ = defparameter("*SORT-TERMS-CONSTANTS-BY-NAME*", T);
    $sort_terms_ignore_variable_symbols$ = defparameter("*SORT-TERMS-IGNORE-VARIABLE-SYMBOLS*", NIL);
    $sort_terms_by_internal_idP$ = defparameter("*SORT-TERMS-BY-INTERNAL-ID?*", NIL);
    $definitional_pred_sort_order$ = deflexical("*DEFINITIONAL-PRED-SORT-ORDER*", $list117);
    $term_order_method_table$ = deflexical("*TERM-ORDER-METHOD-TABLE*", Vectors.make_vector($int118$256, NIL));
    $cached_creation_time_caching_state$ = deflexical("*CACHED-CREATION-TIME-CACHING-STATE*", NIL);
    $cached_creator_caching_state$ = deflexical("*CACHED-CREATOR-CACHING-STATE*", NIL);
    $set_to_collection_uses_reformulatorP$ = defparameter("*SET-TO-COLLECTION-USES-REFORMULATOR?*", T);
    $cached_union_all_specs_count_caching_state$ = deflexical("*CACHED-UNION-ALL-SPECS-COUNT-CACHING-STATE*", NIL);
    $forbidden_kb_covering_collection_types$ = deflexical("*FORBIDDEN-KB-COVERING-COLLECTION-TYPES*", $list260);
    $forbidden_kb_covering_quoted_collection_types$ = deflexical("*FORBIDDEN-KB-COVERING-QUOTED-COLLECTION-TYPES*", $list261);
    $forbidden_cols$ = deflexical("*FORBIDDEN-COLS*", $list262);
    $forbidden_specs$ = deflexical("*FORBIDDEN-SPECS*", NIL);
    $min_each_spec_cardinality$ = defparameter("*MIN-EACH-SPEC-CARDINALITY*", NIL);
    $forbidden_kb_covering_collections_set_caching_state$ = deflexical("*FORBIDDEN-KB-COVERING-COLLECTIONS-SET-CACHING-STATE*", NIL);
    $all_specs_set_caching_state$ = deflexical("*ALL-SPECS-SET-CACHING-STATE*", NIL);
    $all_genls_set_caching_state$ = deflexical("*ALL-GENLS-SET-CACHING-STATE*", NIL);
    $predicate_type_arity_table$ = deflexical("*PREDICATE-TYPE-ARITY-TABLE*", $list288);
    $coasserted_fort_source$ = defparameter("*COASSERTED-FORT-SOURCE*", NIL);
    $coasserted_fort_set$ = defparameter("*COASSERTED-FORT-SET*", NIL);
    $cached_compact_hl_external_id_string_caching_state$ = deflexical("*CACHED-COMPACT-HL-EXTERNAL-ID-STRING-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_utilities_file() {
        Storage.register_low_memory_callback(Symbols.symbol_function($sym71$SWAP_OUT_ALL_PRISTINE_KB_OBJECTS));
    access_macros.register_external_symbol($sym72$SHOW_NEW_KB_STATE);
    access_macros.register_external_symbol($sym80$CLEAR_NEW_KB_STATE);
    access_macros.register_external_symbol($sym85$HL_INTERNAL_ID_STRING_P);
    access_macros.register_external_symbol($sym86$COMPACT_HL_INTERNAL_ID_STRING_P);
    access_macros.register_external_symbol($sym87$HL_INTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym88$COMPACT_HL_INTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym89$FIND_OBJECT_BY_HL_INTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym91$FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym93$MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym94$MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym95$HL_EXTERNAL_ID_STRING_P);
    access_macros.register_external_symbol($sym96$COMPACT_HL_EXTERNAL_ID_STRING_P);
    access_macros.register_external_symbol($sym97$COMPACT_HL_EXTERNAL_ID_STRING_);
    access_macros.register_external_symbol($sym101$HL_EXTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym102$COMPACT_HL_EXTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym103$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym104$FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym106$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
    access_macros.register_external_symbol($sym107$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
    Structures.register_method($term_order_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function($sym119$TERM_ORDER_ASSERTION_METHOD));
    Structures.register_method($term_order_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function($sym120$TERM_ORDER_CONS_METHOD));
    memoization_state.note_memoized_function($sym123$TERM_SIMILARITY_METRIC_GENERALIZATIONS);
    memoization_state.note_globally_cached_function($sym144$CACHED_CREATION_TIME);
    memoization_state.note_globally_cached_function($sym147$CACHED_CREATOR);
    memoization_state.note_globally_cached_function($sym255$CACHED_UNION_ALL_SPECS_COUNT);
    memoization_state.note_globally_cached_function($sym271$FORBIDDEN_KB_COVERING_COLLECTIONS_SET);
    memoization_state.note_globally_cached_function($sym270$ALL_SPECS_SET);
    memoization_state.note_globally_cached_function($sym276$ALL_GENLS_SET);
    utilities_macros.note_funcall_helper_function($sym300$VISIT_COASSERTED_FORT);
    memoization_state.note_globally_cached_function($sym301$CACHED_COMPACT_HL_EXTERNAL_ID_STRING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str1$______KB__S_statistics = makeString("~%;;; KB ~S statistics");
  public static final SubLString $str2$__FORTs______________________9___ = makeString("~%FORTs                   : ~9,' D");
  public static final SubLString $str3$___Constants_________________9___ = makeString("~% Constants              : ~9,' D");
  public static final SubLString $str4$____cached_indexing__________9___ = makeString("~%  cached indexing       : ~9,' D  (~A%)");
  public static final SubLString $str5$___NARTs_____________________9___ = makeString("~% NARTs                  : ~9,' D");
  public static final SubLString $str6$____cached_HL_formulas_______9___ = makeString("~%  cached HL formulas    : ~9,' D  (~A%)");
  public static final SubLString $str7$__Assertions_________________9___ = makeString("~%Assertions              : ~9,' D");
  public static final SubLString $str8$___KB_Assertions_____________9___ = makeString("~% KB Assertions          : ~9,' D");
  public static final SubLString $str9$____cached___________________9___ = makeString("~%  cached                : ~9,' D  (~A%)");
  public static final SubLString $str10$___Bookkeeping_Assertions____9___ = makeString("~% Bookkeeping Assertions : ~9,' D");
  public static final SubLString $str11$__Deductions_________________9___ = makeString("~%Deductions              : ~9,' D");
  public static final SubLString $str12$__KB_HL_supports_____________9___ = makeString("~%KB HL supports          : ~9,' D");
  public static final SubLString $str13$__Unrepresented_terms________9___ = makeString("~%Unrepresented terms     : ~9,' D");
  public static final SubLString $str14$______KB__S_content_statistics = makeString("~%;;; KB ~S content statistics");
  public static final SubLString $str15$__Terms______________________9___ = makeString("~%Terms                   : ~9,' D");
  public static final SubLString $str16$___Collections_______________9___ = makeString("~% Collections            : ~9,' D");
  public static final SubLObject $const17$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLString $str18$____FirstOrderCollections____9___ = makeString("~%  FirstOrderCollections : ~9,' D");
  public static final SubLObject $const19$FirstOrderCollection = constant_handles.reader_make_constant_shell(makeString("FirstOrderCollection"));
  public static final SubLString $str20$____SecondOrderCollections___9___ = makeString("~%  SecondOrderCollections: ~9,' D");
  public static final SubLObject $const21$SecondOrderCollection = constant_handles.reader_make_constant_shell(makeString("SecondOrderCollection"));
  public static final SubLString $str22$____ThirdOrderCollections____9___ = makeString("~%  ThirdOrderCollections : ~9,' D");
  public static final SubLObject $const23$ThirdOrderCollection = constant_handles.reader_make_constant_shell(makeString("ThirdOrderCollection"));
  public static final SubLString $str24$___Relations_________________9___ = makeString("~% Relations              : ~9,' D");
  public static final SubLObject $const25$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLString $str26$____Denotational_Functions___9___ = makeString("~%  Denotational Functions: ~9,' D");
  public static final SubLObject $const27$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLString $str28$____Predicates_______________9___ = makeString("~%  Predicates            : ~9,' D");
  public static final SubLObject $const29$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));
  public static final SubLString $str30$___Individuals_______________9___ = makeString("~% Individuals            : ~9,' D");
  public static final SubLObject $const31$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));
  public static final SubLString $str32$__KB_Assertions______________9___ = makeString("~%KB Assertions           : ~9,' D");
  public static final SubLSymbol $sym33$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const34$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLString $str35$Calculating_cardinalities_of_pred = makeString("Calculating cardinalities of predicate extents");
  public static final SubLSymbol $kw36$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym37$_ = makeSymbol(">");
  public static final SubLSymbol $sym38$CDR = makeSymbol("CDR");
  public static final SubLSymbol $kw39$MT = makeKeyword("MT");
  public static final SubLSymbol $kw40$BROAD_MT = makeKeyword("BROAD-MT");
  public static final SubLString $str41$do_broad_mt_index = makeString("do-broad-mt-index");
  public static final SubLSymbol $sym42$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw43$SKIP = makeKeyword("SKIP");
  public static final SubLObject $const44$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw45$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw46$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw47$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym48$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw49$ERROR = makeKeyword("ERROR");
  public static final SubLString $str50$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym51$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw52$CERROR = makeKeyword("CERROR");
  public static final SubLString $str53$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw54$WARN = makeKeyword("WARN");
  public static final SubLString $str55$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str56$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list57 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym59$_ = makeSymbol("=");
  public static final SubLSymbol $sym60$_ = makeSymbol("<");
  public static final SubLFloat $float61$17_1 = makeDouble(17.1);
  public static final SubLFloat $float62$1_41 = makeDouble(1.41);
  public static final SubLFloat $float63$2_67 = makeDouble(2.67);
  public static final SubLFloat $float64$39_3 = makeDouble(39.3);
  public static final SubLFloat $float65$30_3 = makeDouble(30.3);
  public static final SubLFloat $float66$1_12 = makeDouble(1.12);
  public static final SubLFloat $float67$7_97 = makeDouble(7.97);
  public static final SubLFloat $float68$1_05 = makeDouble(1.05);
  public static final SubLInteger $int69$50000 = makeInteger(50000);
  public static final SubLSymbol $sym70$INIT_CONSTANT = makeSymbol("INIT-CONSTANT");
  public static final SubLSymbol $sym71$SWAP_OUT_ALL_PRISTINE_KB_OBJECTS = makeSymbol("SWAP-OUT-ALL-PRISTINE-KB-OBJECTS");
  public static final SubLSymbol $sym72$SHOW_NEW_KB_STATE = makeSymbol("SHOW-NEW-KB-STATE");
  public static final SubLString $str73$______KB__S_new_KB_objects__ = makeString("~&;;; KB ~S new KB objects~%");
  public static final SubLString $str74$__New_FORTs__________________9___ = makeString("~&New FORTs               : ~9,' D~%");
  public static final SubLString $str75$___New_Constants_____________9___ = makeString("~& New Constants          : ~9,' D~%");
  public static final SubLString $str76$___New_NARTs_________________9___ = makeString("~& New NARTs              : ~9,' D~%");
  public static final SubLString $str77$__New_Assertions_____________9___ = makeString("~&New Assertions          : ~9,' D~%");
  public static final SubLString $str78$__New_Deductions_____________9___ = makeString("~&New Deductions          : ~9,' D~%");
  public static final SubLString $str79$__New_KB_HL_Supports_________9___ = makeString("~&New KB HL Supports      : ~9,' D~%");
  public static final SubLSymbol $sym80$CLEAR_NEW_KB_STATE = makeSymbol("CLEAR-NEW-KB-STATE");
  public static final SubLList $list81 = list(makeSymbol("CONSTANT-CP"), makeSymbol("NART-CP"), makeSymbol("ASSERTION-CP"), makeSymbol("DEDUCTION-CP"));
  public static final SubLSymbol $sym82$KB_CHECKPOINT_P = makeSymbol("KB-CHECKPOINT-P");
  public static final SubLList $list83 = list(makeSymbol("ASSERTION-CP"), makeSymbol("DEDUCTION-CP"));
  public static final SubLSymbol $sym84$THEORY_CHECKPOINT_P = makeSymbol("THEORY-CHECKPOINT-P");
  public static final SubLSymbol $sym85$HL_INTERNAL_ID_STRING_P = makeSymbol("HL-INTERNAL-ID-STRING-P");
  public static final SubLSymbol $sym86$COMPACT_HL_INTERNAL_ID_STRING_P = makeSymbol("COMPACT-HL-INTERNAL-ID-STRING-P");
  public static final SubLSymbol $sym87$HL_INTERNAL_ID_STRING = makeSymbol("HL-INTERNAL-ID-STRING");
  public static final SubLSymbol $sym88$COMPACT_HL_INTERNAL_ID_STRING = makeSymbol("COMPACT-HL-INTERNAL-ID-STRING");
  public static final SubLSymbol $sym89$FIND_OBJECT_BY_HL_INTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");
  public static final SubLSymbol $kw90$HEX = makeKeyword("HEX");
  public static final SubLSymbol $sym91$FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");
  public static final SubLSymbol $kw92$64 = makeKeyword("64");
  public static final SubLSymbol $sym93$MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");
  public static final SubLSymbol $sym94$MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");
  public static final SubLSymbol $sym95$HL_EXTERNAL_ID_STRING_P = makeSymbol("HL-EXTERNAL-ID-STRING-P");
  public static final SubLSymbol $sym96$COMPACT_HL_EXTERNAL_ID_STRING_P = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING-P");
  public static final SubLSymbol $sym97$COMPACT_HL_EXTERNAL_ID_STRING_ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING?");
  public static final SubLSymbol $kw98$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym99$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym100$_EXIT = makeSymbol("%EXIT");
  public static final SubLSymbol $sym101$HL_EXTERNAL_ID_STRING = makeSymbol("HL-EXTERNAL-ID-STRING");
  public static final SubLSymbol $sym102$COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
  public static final SubLSymbol $sym103$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING");
  public static final SubLSymbol $sym104$FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
  public static final SubLString $str105$Invalid_hl_external_id____A____fo = makeString("Invalid hl external id, '~A',  for a cycl term.~%.");
  public static final SubLSymbol $sym106$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
  public static final SubLSymbol $sym107$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
  public static final SubLString $str108$invalid_mode__S = makeString("invalid mode ~S");
  public static final SubLSymbol $sym109$INVALID_HL_OBJECT_P = makeSymbol("INVALID-HL-OBJECT-P");
  public static final SubLString $str110$an_unnamed_constant = makeString("an unnamed constant");
  public static final SubLString $str111$_a = makeString("~a");
  public static final SubLSymbol $sym112$STABLE_SORT = makeSymbol("STABLE-SORT");
  public static final SubLSymbol $sym113$SORT = makeSymbol("SORT");
  public static final SubLSymbol $sym114$FORM_SORT_PRED = makeSymbol("FORM-SORT-PRED");
  public static final SubLSymbol $sym115$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym116$FORT__ = makeSymbol("FORT-<");
  public static final SubLList $list117 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("genlMt")), constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("negationPreds")), constant_handles.reader_make_constant_shell(makeString("negationInverse")), constant_handles.reader_make_constant_shell(makeString("negationMt")), constant_handles.reader_make_constant_shell(makeString("defnIff")), constant_handles.reader_make_constant_shell(makeString("defnSufficient")), constant_handles.reader_make_constant_shell(makeString("defnNecessary")), constant_handles.reader_make_constant_shell(makeString("resultIsa")), constant_handles.reader_make_constant_shell(makeString("resultIsaArg")), constant_handles.reader_make_constant_shell(makeString("resultGenl")), constant_handles.reader_make_constant_shell(makeString("resultGenlArg")), constant_handles.reader_make_constant_shell(makeString("arity")), constant_handles.reader_make_constant_shell(makeString("arityMin")), constant_handles.reader_make_constant_shell(makeString("arityMax")), constant_handles.reader_make_constant_shell(makeString("argsIsa")), constant_handles.reader_make_constant_shell(makeString("argsGenl")), constant_handles.reader_make_constant_shell(makeString("arg1Isa")), constant_handles.reader_make_constant_shell(makeString("arg1Genl")), constant_handles.reader_make_constant_shell(makeString("arg2Isa")), constant_handles.reader_make_constant_shell(makeString("arg2Genl")), constant_handles.reader_make_constant_shell(makeString("arg3Isa")), constant_handles.reader_make_constant_shell(makeString("arg3Genl")), constant_handles.reader_make_constant_shell(makeString("arg4Isa")), constant_handles.reader_make_constant_shell(makeString("arg4Genl")), constant_handles.reader_make_constant_shell(makeString("arg5Isa")), constant_handles.reader_make_constant_shell(makeString("arg5Genl")), constant_handles.reader_make_constant_shell(makeString("argIsa")), constant_handles.reader_make_constant_shell(makeString("argGenl")), constant_handles.reader_make_constant_shell(makeString("fanOutArg")), constant_handles.reader_make_constant_shell(makeString("evaluationDefn")), constant_handles.reader_make_constant_shell(makeString("afterAdding")), constant_handles.reader_make_constant_shell(makeString("afterRemoving"))});
  public static final SubLInteger $int118$256 = makeInteger(256);
  public static final SubLSymbol $sym119$TERM_ORDER_ASSERTION_METHOD = makeSymbol("TERM-ORDER-ASSERTION-METHOD");
  public static final SubLSymbol $sym120$TERM_ORDER_CONS_METHOD = makeSymbol("TERM-ORDER-CONS-METHOD");
  public static final SubLInteger $int121$500 = makeInteger(500);
  public static final SubLSymbol $sym122$VALUES = makeSymbol("VALUES");
  public static final SubLSymbol $sym123$TERM_SIMILARITY_METRIC_GENERALIZATIONS = makeSymbol("TERM-SIMILARITY-METRIC-GENERALIZATIONS");
  public static final SubLSymbol $kw124$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str125$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $kw126$ALL = makeKeyword("ALL");
  public static final SubLString $str127$cdolist = makeString("cdolist");
  public static final SubLSymbol $sym128$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym129$VECTOR = makeSymbol("VECTOR");
  public static final SubLString $str130$cdotimes = makeString("cdotimes");
  public static final SubLSymbol $sym131$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str132$examining_creation_times_by__S = makeString("examining creation times by ~S");
  public static final SubLString $str133$examining_all_creation_times = makeString("examining all creation times");
  public static final SubLSymbol $sym134$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym135$CONSTANT_NAME = makeSymbol("CONSTANT-NAME");
  public static final SubLSymbol $sym136$CREATION_TIME__ = makeSymbol("CREATION-TIME-<");
  public static final SubLSymbol $sym137$CREATOR__ = makeSymbol("CREATOR-<");
  public static final SubLSymbol $sym138$FIND_GROUND_NAUT = makeSymbol("FIND-GROUND-NAUT");
  public static final SubLSymbol $sym139$TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");
  public static final SubLString $str140$examining_assertion_timestamps = makeString("examining assertion timestamps");
  public static final SubLSymbol $sym141$ASSERTION_CNF = makeSymbol("ASSERTION-CNF");
  public static final SubLSymbol $sym142$ASSERT_DATE__ = makeSymbol("ASSERT-DATE-<");
  public static final SubLSymbol $sym143$ASSERT_CYCLIST__ = makeSymbol("ASSERT-CYCLIST-<");
  public static final SubLSymbol $sym144$CACHED_CREATION_TIME = makeSymbol("CACHED-CREATION-TIME");
  public static final SubLSymbol $sym145$_CACHED_CREATION_TIME_CACHING_STATE_ = makeSymbol("*CACHED-CREATION-TIME-CACHING-STATE*");
  public static final SubLInteger $int146$200 = makeInteger(200);
  public static final SubLSymbol $sym147$CACHED_CREATOR = makeSymbol("CACHED-CREATOR");
  public static final SubLSymbol $sym148$_CACHED_CREATOR_CACHING_STATE_ = makeSymbol("*CACHED-CREATOR-CACHING-STATE*");
  public static final SubLString $str149$searching_for_probably_most_recen = makeString("searching for probably most recent assertion");
  public static final SubLString $str150$Gathering_all_constants = makeString("Gathering all constants");
  public static final SubLString $str151$Gathering_all_narts = makeString("Gathering all narts");
  public static final SubLString $str152$Gathering_all_forts = makeString("Gathering all forts");
  public static final SubLString $str153$Gathering_all_deductions = makeString("Gathering all deductions");
  public static final SubLString $str154$Gathering_all_KB_HL_supports = makeString("Gathering all KB HL supports");
  public static final SubLString $str155$Gathering_all_assertions = makeString("Gathering all assertions");
  public static final SubLString $str156$Gathering_all_gafs = makeString("Gathering all gafs");
  public static final SubLString $str157$Gathering_all_forward_gafs = makeString("Gathering all forward gafs");
  public static final SubLString $str158$Gathering_all_backward_gafs = makeString("Gathering all backward gafs");
  public static final SubLString $str159$Gathering_all_rules = makeString("Gathering all rules");
  public static final SubLString $str160$Gathering_all_forward_rules = makeString("Gathering all forward rules");
  public static final SubLString $str161$Gathering_all_backward_rules = makeString("Gathering all backward rules");
  public static final SubLSymbol $sym162$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");
  public static final SubLSymbol $sym163$SAFE__ = makeSymbol("SAFE->");
  public static final SubLSymbol $sym164$ASSERTED_WHEN = makeSymbol("ASSERTED-WHEN");
  public static final SubLList $list165 = list(list(makeSymbol("&KEY"), makeSymbol("KB-CHANGED-MESSAGE"), makeSymbol("KB-UNCHANGED-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list166 = list(makeKeyword("KB-CHANGED-MESSAGE"), makeKeyword("KB-UNCHANGED-MESSAGE"));
  public static final SubLSymbol $kw167$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw168$KB_CHANGED_MESSAGE = makeKeyword("KB-CHANGED-MESSAGE");
  public static final SubLSymbol $kw169$KB_UNCHANGED_MESSAGE = makeKeyword("KB-UNCHANGED-MESSAGE");
  public static final SubLSymbol $sym170$KB_OBJECT_COUNT_LIST_1 = makeUninternedSymbol("KB-OBJECT-COUNT-LIST-1");
  public static final SubLSymbol $sym171$KB_OBJECT_COUNT_LIST_2 = makeUninternedSymbol("KB-OBJECT-COUNT-LIST-2");
  public static final SubLSymbol $sym172$NEW_CONSTANT_COUNT = makeUninternedSymbol("NEW-CONSTANT-COUNT");
  public static final SubLSymbol $sym173$NEW_NART_COUNT = makeUninternedSymbol("NEW-NART-COUNT");
  public static final SubLSymbol $sym174$NEW_ASSERTION_COUNT = makeUninternedSymbol("NEW-ASSERTION-COUNT");
  public static final SubLSymbol $sym175$NEW_KB_HL_SUPPORT_COUNT = makeUninternedSymbol("NEW-KB-HL-SUPPORT-COUNT");
  public static final SubLSymbol $sym176$NEW_DEDUCTION_COUNT = makeUninternedSymbol("NEW-DEDUCTION-COUNT");
  public static final SubLSymbol $sym177$CLET = makeSymbol("CLET");
  public static final SubLList $list178 = list(list(makeSymbol("KB-OBJECT-COUNT-LIST")));
  public static final SubLSymbol $sym179$KB_OBJECT_COUNT_LISTS_NEW_CONSTANT_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-CONSTANT-COUNT");
  public static final SubLSymbol $sym180$KB_OBJECT_COUNT_LISTS_NEW_NART_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-NART-COUNT");
  public static final SubLSymbol $sym181$KB_OBJECT_COUNT_LISTS_NEW_ASSERTION_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-ASSERTION-COUNT");
  public static final SubLSymbol $sym182$KB_OBJECT_COUNT_LISTS_NEW_KB_HL_SUPPORT_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-KB-HL-SUPPORT-COUNT");
  public static final SubLSymbol $sym183$KB_OBJECT_COUNT_LISTS_NEW_DEDUCTION_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-DEDUCTION-COUNT");
  public static final SubLSymbol $sym184$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym185$COR = makeSymbol("COR");
  public static final SubLSymbol $sym186$NON_ZERO_INTEGER_P = makeSymbol("NON-ZERO-INTEGER-P");
  public static final SubLSymbol $sym187$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym188$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym189$FORMAT = makeSymbol("FORMAT");
  public static final SubLString $str190$___A__ = makeString("~&~A~%");
  public static final SubLString $str191$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");
  public static final SubLSymbol $sym192$ABS = makeSymbol("ABS");
  public static final SubLSymbol $sym193$FIF = makeSymbol("FIF");
  public static final SubLList $list194 = list(ONE_INTEGER);
  public static final SubLList $list195 = list(makeString("s were"), makeString(" was"));
  public static final SubLSymbol $sym196$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLList $list197 = list(makeString("created"), makeString("destroyed"));
  public static final SubLString $str198$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");
  public static final SubLString $str199$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");
  public static final SubLString $str200$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");
  public static final SubLString $str201$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");
  public static final SubLList $list202 = list(list(makeSymbol("FORCE-OUTPUT"), T));
  public static final SubLString $str203$mapping_Cyc_constants = makeString("mapping Cyc constants");
  public static final SubLSymbol $kw204$UNKNOWN_SECOND = makeKeyword("UNKNOWN-SECOND");
  public static final SubLSymbol $sym205$CONSTANT_SORTING_FUNKY__ = makeSymbol("CONSTANT-SORTING-FUNKY-<");
  public static final SubLSymbol $sym206$FOURTH = makeSymbol("FOURTH");
  public static final SubLSymbol $sym207$SORT_CONSTANTS_BY_SORTING_INFO = makeSymbol("SORT-CONSTANTS-BY-SORTING-INFO");
  public static final SubLSymbol $sym208$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $kw209$UNKNOWN_DATE = makeKeyword("UNKNOWN-DATE");
  public static final SubLSymbol $kw210$UNKNOWN_ID = makeKeyword("UNKNOWN-ID");
  public static final SubLList $list211 = list(makeSymbol("DATE1"), makeSymbol("SECOND1"), makeSymbol("ID1"), makeSymbol("DWIMMED-DATE1"));
  public static final SubLList $list212 = list(makeSymbol("DATE2"), makeSymbol("SECOND2"), makeSymbol("ID2"), makeSymbol("DWIMMED-DATE2"));
  public static final SubLObject $const213$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLList $list214 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list215 = list(makeKeyword("INDEX"), makeKeyword("PREDICATE"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));
  public static final SubLSymbol $kw216$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw217$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw218$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $kw219$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw220$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym221$INDEXED_TERMS = makeUninternedSymbol("INDEXED-TERMS");
  public static final SubLSymbol $sym222$EXPRESSION_GATHER = makeSymbol("EXPRESSION-GATHER");
  public static final SubLList $list223 = list(list(makeSymbol("QUOTE"), makeSymbol("INDEXED-TERM-P")), NIL, list(makeSymbol("FUNCTION"), EQUAL));
  public static final SubLSymbol $sym224$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym225$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym226$DO_OVERLAP_INDEX = makeSymbol("DO-OVERLAP-INDEX");
  public static final SubLSymbol $sym227$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym228$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym229$ASSERTION_DIRECTION = makeSymbol("ASSERTION-DIRECTION");
  public static final SubLSymbol $sym230$FORMULA_OPERATOR = makeSymbol("FORMULA-OPERATOR");
  public static final SubLSymbol $sym231$ASSERTION_FORMULA = makeSymbol("ASSERTION-FORMULA");
  public static final SubLSymbol $sym232$FORMULA_ARG = makeSymbol("FORMULA-ARG");
  public static final SubLSymbol $sym233$TERM_OCCURS_AS_FORMULA_ARGUMENT = makeSymbol("TERM-OCCURS-AS-FORMULA-ARGUMENT");
  public static final SubLList $list234 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list235 = list(makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $sym236$INDEXED_TERMS = makeUninternedSymbol("INDEXED-TERMS");
  public static final SubLList $list237 = list(list(makeSymbol("QUOTE"), makeSymbol("INDEXED-TERM-P")), NIL);
  public static final SubLSymbol $sym238$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym239$EXPRESSION_FIND = makeSymbol("EXPRESSION-FIND");
  public static final SubLList $list240 = list(T, list(makeSymbol("FUNCTION"), EQUAL));
  public static final SubLSymbol $sym241$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  public static final SubLSymbol $sym242$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym243$NAUT_P = makeSymbol("NAUT-P");
  public static final SubLSymbol $kw244$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLObject $const245$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym246$EL_SET_P = makeSymbol("EL-SET-P");
  public static final SubLObject $const247$Nothing = constant_handles.reader_make_constant_shell(makeString("Nothing"));
  public static final SubLObject $const248$CollectionSubsetFn = constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn"));
  public static final SubLList $list249 = list(makeSymbol("EL-VARIABLE"), makeSymbol("EXPRESSION"));
  public static final SubLObject $const250$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersection2Fn"));
  public static final SubLObject $const251$CollectionIntersectionFn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersectionFn"));
  public static final SubLObject $const252$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLObject $const253$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLString $str254$_S_was_not_a_set = makeString("~S was not a set");
  public static final SubLSymbol $sym255$CACHED_UNION_ALL_SPECS_COUNT = makeSymbol("CACHED-UNION-ALL-SPECS-COUNT");
  public static final SubLSymbol $sym256$_CACHED_UNION_ALL_SPECS_COUNT_CACHING_STATE_ = makeSymbol("*CACHED-UNION-ALL-SPECS-COUNT-CACHING-STATE*");
  public static final SubLSymbol $sym257$CLEAR_CACHED_UNION_ALL_SPECS_COUNT = makeSymbol("CLEAR-CACHED-UNION-ALL-SPECS-COUNT");
  public static final SubLList $list258 = list(constant_handles.reader_make_constant_shell(makeString("Thing")));
  public static final SubLSymbol $sym259$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLList $list260 = list(constant_handles.reader_make_constant_shell(makeString("UnderspecifiedCollectionType")), constant_handles.reader_make_constant_shell(makeString("CycKBSubsetCollection")));
  public static final SubLList $list261 = list(constant_handles.reader_make_constant_shell(makeString("WorkflowConstant")), constant_handles.reader_make_constant_shell(makeString("TPTP-PLA001-1-ProblemFORT")), constant_handles.reader_make_constant_shell(makeString("PoorlyOntologized")), constant_handles.reader_make_constant_shell(makeString("StubTerm")), constant_handles.reader_make_constant_shell(makeString("IndeterminateTerm")));
  public static final SubLList $list262 = list(constant_handles.reader_make_constant_shell(makeString("PotentialCBRNEThreat")), constant_handles.reader_make_constant_shell(makeString("Y2KThing")), constant_handles.reader_make_constant_shell(makeString("BPVMilitaryUnit")), constant_handles.reader_make_constant_shell(makeString("BPVEvent")), constant_handles.reader_make_constant_shell(makeString("BPVArtifact")), constant_handles.reader_make_constant_shell(makeString("BPVAgent")), constant_handles.reader_make_constant_shell(makeString("HPKB-TransnationalAgent")));
  public static final SubLSymbol $sym263$SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");
  public static final SubLString $str264$_5_d__s__ = makeString("~5,d ~s~%");
  public static final SubLString $str265$__Total_coverage___S___ = makeString("~%Total coverage: ~S%~%");
  public static final SubLInteger $int266$100 = makeInteger(100);
  public static final SubLString $str267$__Optimizing_coverage_via_relativ = makeString("~%Optimizing coverage via relative overlap:~%");
  public static final SubLString $str268$_s___s_unique_spec_p__ = makeString("~s: ~s unique spec~p~%");
  public static final SubLSymbol $sym269$FORBIDDEN_KB_COVERING_COLLECTION_ = makeSymbol("FORBIDDEN-KB-COVERING-COLLECTION?");
  public static final SubLSymbol $sym270$ALL_SPECS_SET = makeSymbol("ALL-SPECS-SET");
  public static final SubLSymbol $sym271$FORBIDDEN_KB_COVERING_COLLECTIONS_SET = makeSymbol("FORBIDDEN-KB-COVERING-COLLECTIONS-SET");
  public static final SubLSymbol $sym272$_FORBIDDEN_KB_COVERING_COLLECTIONS_SET_CACHING_STATE_ = makeSymbol("*FORBIDDEN-KB-COVERING-COLLECTIONS-SET-CACHING-STATE*");
  public static final SubLSymbol $sym273$CLEAR_FORBIDDEN_KB_COVERING_COLLECTIONS_SET = makeSymbol("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET");
  public static final SubLSymbol $sym274$_ALL_SPECS_SET_CACHING_STATE_ = makeSymbol("*ALL-SPECS-SET-CACHING-STATE*");
  public static final SubLSymbol $sym275$CLEAR_ALL_SPECS_SET = makeSymbol("CLEAR-ALL-SPECS-SET");
  public static final SubLSymbol $sym276$ALL_GENLS_SET = makeSymbol("ALL-GENLS-SET");
  public static final SubLSymbol $sym277$_ALL_GENLS_SET_CACHING_STATE_ = makeSymbol("*ALL-GENLS-SET-CACHING-STATE*");
  public static final SubLSymbol $sym278$CLEAR_ALL_GENLS_SET = makeSymbol("CLEAR-ALL-GENLS-SET");
  public static final SubLSymbol $sym279$NART_AFFIX_CHAR_P = makeSymbol("NART-AFFIX-CHAR-P");
  public static final SubLList $list280 = list(Characters.CHAR_less, Characters.CHAR_greater, Characters.CHAR_hash);
  public static final SubLSymbol $sym281$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym282$COLLECTION_P = makeSymbol("COLLECTION-P");
  public static final SubLSymbol $sym283$SET_SIZE = makeSymbol("SET-SIZE");
  public static final SubLList $list284 = cons(makeSymbol("COL"), makeSymbol("SET"));
  public static final SubLSymbol $sym285$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym286$PREDICATE_P = makeSymbol("PREDICATE-P");
  public static final SubLList $list287 = cons(makeSymbol("PRED"), makeSymbol("SET"));
  public static final SubLList $list288 = list(cons(ONE_INTEGER, constant_handles.reader_make_constant_shell(makeString("UnaryPredicate"))), cons(TWO_INTEGER, constant_handles.reader_make_constant_shell(makeString("BinaryPredicate"))), cons(THREE_INTEGER, constant_handles.reader_make_constant_shell(makeString("TernaryPredicate"))), cons(FOUR_INTEGER, constant_handles.reader_make_constant_shell(makeString("QuaternaryPredicate"))), cons(FIVE_INTEGER, constant_handles.reader_make_constant_shell(makeString("QuintaryPredicate"))));
  public static final SubLInteger $int289$10000 = makeInteger(10000);
  public static final SubLString $str290$All_args_of__s_were_open = makeString("All args of ~s were open");
  public static final SubLObject $const291$BinaryPredicate = constant_handles.reader_make_constant_shell(makeString("BinaryPredicate"));
  public static final SubLSymbol $sym292$DATE_ = makeSymbol("DATE?");
  public static final SubLObject $const293$Date = constant_handles.reader_make_constant_shell(makeString("Date"));
  public static final SubLSymbol $sym294$VALID_CONSTANT_NAME_CHAR_P = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
  public static final SubLList $list295 = list(Characters.CHAR_s, Characters.CHAR_colon);
  public static final SubLSymbol $sym296$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $kw297$IGNORE = makeKeyword("IGNORE");
  public static final SubLList $list298 = cons(makeSymbol("START"), makeSymbol("NAME"));
  public static final SubLObject $const299$oldConstantName = constant_handles.reader_make_constant_shell(makeString("oldConstantName"));
  public static final SubLSymbol $sym300$VISIT_COASSERTED_FORT = makeSymbol("VISIT-COASSERTED-FORT");
  public static final SubLSymbol $sym301$CACHED_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("CACHED-COMPACT-HL-EXTERNAL-ID-STRING");
  public static final SubLSymbol $sym302$_CACHED_COMPACT_HL_EXTERNAL_ID_STRING_CACHING_STATE_ = makeSymbol("*CACHED-COMPACT-HL-EXTERNAL-ID-STRING-CACHING-STATE*");
  public static final SubLString $str303$_ = makeString(" ");
  public static final SubLSymbol $kw304$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str305$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str306$Writing_coasserted_forts = makeString("Writing coasserted forts");
  public static final SubLSymbol $sym307$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str308$_A = makeString("~A");

  //// Initializers

  public void declareFunctions() {
    declare_kb_utilities_file();
  }

  public void initializeVariables() {
    init_kb_utilities_file();
  }

  public void runTopLevelForms() {
    setup_kb_utilities_file();
  }

}
