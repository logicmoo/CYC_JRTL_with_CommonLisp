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
import com.cyc.cycjava_1.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.at_defns;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.inference.collection_intersection;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.disjoint_with;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_mapping;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.keyhash_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.misc_kb_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class genls extends SubLTranslatedFile {

  //// Constructor

  private genls() {}
  public static final SubLFile me = new genls();
  public static final String myName = "com.cyc.cycjava_1.cycl.genls";

  //// Definitions

  /** Returns all genls of collection COL
   (ascending transitive closure; inexpensive) */
  @SubL(source = "cycl/genls.lisp", position = 5557) 
  public static final SubLObject all_genls(SubLObject col, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(col, $sym5$EL_FORT_P);
    if (((NIL == forts.fort_p(col))
        || (NIL != fort_types_interface.collectionP(col)))) {
      return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const0$genls), col, mt, tv);
    }
    return NIL;
  }

  /** Returns all specs of collection COL 
   (descending transitive closure; expensive) */
  @SubL(source = "cycl/genls.lisp", position = 7269) 
  public static final SubLObject all_specs(SubLObject col, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(col, $sym5$EL_FORT_P);
    if (((NIL == forts.fort_p(col))
        || (NIL != fort_types_interface.collectionP(col)))) {
      return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($const0$genls), col, mt, tv);
    }
    return NIL;
  }

  /** Returns whether (#$genls SPEC GENL) can be inferred.
   (ascending transitive search; inexpensive) */
  @SubL(source = "cycl/genls.lisp", position = 20177) 
  public static final SubLObject genlP(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(spec, $sym5$EL_FORT_P);
    checkType(genl, $sym5$EL_FORT_P);
    if (((NIL == forts.fort_p(spec))
        || (NIL != fort_types_interface.collectionP(spec)))) {
      return makeBoolean(((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const0$genls), spec, genl, mt, tv))
            || (NIL != ((NIL != cycl_grammar.cycl_nat_p(spec)) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5056")) : NIL))));
    }
    return NIL;
  }

  /** is collection GENL a genl of SPEC?
   (ascending transitive search; inexpensive) */
  @SubL(source = "cycl/genls.lisp", position = 20758) 
  public static final SubLObject genlsP(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return genlP(spec, genl, mt, tv);
  }
  

  /** gather results of applying FN to every (all) genls of COL
   (FN must not effect the current sbhl space) */
  @SubL(source = "cycl/genls.lisp", position = 18210) 
  public static final SubLObject gather_all_genls(SubLObject fn, SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((combine_fn == UNPROVIDED)) {
      combine_fn = NIL;
    }
    return sbhl_search_methods.sbhl_gather_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const0$genls), col, fn, mt, tv, combine_fn);
  }

  

  /** Returns whether (#$genls SPEC GENL) can be inferred.
   (ascending transitive search; inexpensive) */
  @SubL(source = "cycl/genls.lisp", position = 21416) 
  public static final SubLObject specP(SubLObject genl, SubLObject spec, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(genl, $sym5$EL_FORT_P);
    checkType(spec, $sym5$EL_FORT_P);
    return genlP(spec, genl, mt, tv);
  }

  /** Returns T iff (spec? genl spec) for some spec in SPECS */
  @SubL(source = "cycl/genls.lisp", position = 24176) 
  public static final SubLObject any_specP(SubLObject genl, SubLObject specs, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(genl, $sym5$EL_FORT_P);
      checkType(specs, $sym52$LISTP);
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
            if ((NIL == specs)) {
              result = NIL;
            } else if ((NIL != list_utilities.singletonP(specs))) {
              result = specP(genl, specs.first(), mt, tv);
            } else {
              result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const0$genls), specs, genl, mt, tv);
            }
          } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** consider #$isa gafs when determining if two collections intersect? */
  @SubL(source = "cycl/genls.lisp", position = 29776) 
  private static SubLSymbol $sbhl_infer_intersection_from_instancesP$ = null;

  /** Returns the minimally-general (the most specific) among reified collections COLS,
   collections that have no proper specs among COLS */
  @SubL(source = "cycl/genls.lisp", position = 37862) 
  public static final SubLObject min_cols(SubLObject cols, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(cols, $sym153$LIST_OF_COLLECTIONS_P);
    return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($const0$genls), cols, mt, tv);
  }

  /** @return booleanp; whether there are any asserted true genls links for COL. */
  @SubL(source = "cycl/genls.lisp", position = 46255) 
  public static final SubLObject asserted_genlsP(SubLObject col, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($const0$genls), col, mt);
  }

  /** @return listp; the asserted true genls links for COL in MT / *mt*. */
  @SubL(source = "cycl/genls.lisp", position = 46458) 
  public static final SubLObject asserted_genls(SubLObject col, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($const0$genls), col, mt);
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genls.lisp", position = 48334) 
  public static final SubLObject genls_after_adding(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const0$genls));
    sbhl_cache.sbhl_cache_addition_maintainence(assertion);
    misc_kb_utilities.possibly_clear_genl_pos(assertion);
    {
      SubLObject spec = assertions_high.gaf_arg1(assertion);
      SubLObject genl = assertions_high.gaf_arg2(assertion);
      if ((NIL != assertions_high.assertion_has_truth(assertion, $kw134$TRUE))) {
        at_defns.handle_added_genl_for_suf_defns(spec, genl);
        at_defns.handle_added_genl_for_suf_quoted_defns(spec, genl);
        at_defns.handle_added_genl_for_suf_functions(spec, genl);
        cardinality_estimates.update_cardinality_estimates_wrt_genls(spec, genl);
      }
      handle_more_specific_genl(spec, genl);
    }
    collection_intersection.genls_collection_intersection_after_adding_int(assertion);
    after_adding_modules.clear_genls_dependent_caches(source, assertion);
    return NIL;
  }

  /** Modifier.  Possibly does TMS when (#$genls SPEC GENL) invalidates some other genls assertion that was deduced from an assertedMoreSpecifically rule. */
  @SubL(source = "cycl/genls.lisp", position = 49362) 
  public static final SubLObject handle_more_specific_genl(SubLObject spec, SubLObject genl) {
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genls.lisp", position = 50295) 
  public static final SubLObject genls_after_removing(SubLObject source, SubLObject assertion) {
    misc_kb_utilities.possibly_clear_genl_pos(assertion);
    sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($const0$genls));
    sbhl_cache.sbhl_cache_removal_maintainence(assertion);
    {
      SubLObject spec = assertions_high.gaf_arg1(assertion);
      SubLObject genl = assertions_high.gaf_arg2(assertion);
      if ((NIL != assertions_high.assertion_has_truth(assertion, $kw134$TRUE))) {
        at_defns.handle_removed_genl_for_suf_defns(spec, genl);
        at_defns.handle_removed_genl_for_suf_quoted_defns(spec, genl);
        at_defns.handle_removed_genl_for_suf_functions(spec, genl);
      }
    }
    return NIL;
  }

  public static final SubLObject declare_genls_file() {
    //declareFunction(myName, "genls", "GENLS", 1, 2, false);
    //declareFunction(myName, "min_genls", "MIN-GENLS", 1, 2, false);
    //declareFunction(myName, "nat_genls", "NAT-GENLS", 1, 2, false);
    //declareFunction(myName, "nat_min_genls", "NAT-MIN-GENLS", 1, 2, false);
    //declareFunction(myName, "min_genls_of_type", "MIN-GENLS-OF-TYPE", 2, 2, false);
    //declareFunction(myName, "min_proper_genls_of_type", "MIN-PROPER-GENLS-OF-TYPE", 2, 2, false);
    //declareFunction(myName, "naut_genls", "NAUT-GENLS", 1, 1, false);
    //declareFunction(myName, "not_genls", "NOT-GENLS", 1, 2, false);
    //declareFunction(myName, "max_not_genls", "MAX-NOT-GENLS", 1, 2, false);
    //declareFunction(myName, "nat_not_genls", "NAT-NOT-GENLS", 1, 2, false);
    //declareFunction(myName, "nat_max_not_genls", "NAT-MAX-NOT-GENLS", 1, 2, false);
    //declareFunction(myName, "naut_not_genls", "NAUT-NOT-GENLS", 1, 1, false);
    //declareFunction(myName, "specs", "SPECS", 1, 2, false);
    //declareFunction(myName, "leaf_colP", "LEAF-COL?", 1, 2, false);
    //declareFunction(myName, "max_specs", "MAX-SPECS", 1, 2, false);
    //declareFunction(myName, "not_specs", "NOT-SPECS", 1, 2, false);
    //declareFunction(myName, "min_not_specs", "MIN-NOT-SPECS", 1, 2, false);
    //declareFunction(myName, "genl_siblings", "GENL-SIBLINGS", 1, 2, false);
    //declareFunction(myName, "spec_siblings", "SPEC-SIBLINGS", 1, 2, false);
    declareFunction(myName, "all_genls", "ALL-GENLS", 1, 2, false);
    //declareFunction(myName, "all_genls_in_any_mt", "ALL-GENLS-IN-ANY-MT", 1, 0, false);
    //declareFunction(myName, "all_genls_in_mt", "ALL-GENLS-IN-MT", 1, 1, false);
    //declareFunction(myName, "all_genls_in_mts", "ALL-GENLS-IN-MTS", 1, 1, false);
    //declareFunction(myName, "nat_all_genls", "NAT-ALL-GENLS", 1, 2, false);
    //declareFunction(myName, "all_proper_genls", "ALL-PROPER-GENLS", 1, 2, false);
    declareFunction(myName, "all_specs", "ALL-SPECS", 1, 2, false);
    //declareFunction(myName, "all_proper_specs", "ALL-PROPER-SPECS", 1, 2, false);
    //declareFunction(myName, "all_proper_specs_in_any_mt", "ALL-PROPER-SPECS-IN-ANY-MT", 1, 0, false);
    //declareFunction(myName, "all_leaf_specs_in_all_mts", "ALL-LEAF-SPECS-IN-ALL-MTS", 1, 0, false);
    //declareFunction(myName, "all_specs_with_max", "ALL-SPECS-WITH-MAX", 2, 0, false);
    //declareFunction(myName, "count_all_specs", "COUNT-ALL-SPECS", 1, 2, false);
    //declareFunction(myName, "count_all_specs_if", "COUNT-ALL-SPECS-IF", 2, 2, false);
    //declareFunction(myName, "count_all_specs_E", "COUNT-ALL-SPECS-=", 2, 2, false);
    //declareFunction(myName, "count_all_specs_G", "COUNT-ALL-SPECS->", 2, 2, false);
    //declareFunction(myName, "count_all_specs_GE", "COUNT-ALL-SPECS->=", 2, 2, false);
    //declareFunction(myName, "count_all_specs_L", "COUNT-ALL-SPECS-<", 2, 2, false);
    //declareFunction(myName, "count_all_specs_LE", "COUNT-ALL-SPECS-<=", 2, 2, false);
    //declareFunction(myName, "all_genls_wrt", "ALL-GENLS-WRT", 2, 2, false);
    //declareFunction(myName, "union_all_genls", "UNION-ALL-GENLS", 1, 2, false);
    //declareFunction(myName, "union_min_genls_of_type", "UNION-MIN-GENLS-OF-TYPE", 2, 2, false);
    //declareFunction(myName, "union_all_genls_among", "UNION-ALL-GENLS-AMONG", 2, 2, false);
    //declareFunction(myName, "all_genl_of_someP", "ALL-GENL-OF-SOME?", 2, 2, false);
    //declareFunction(myName, "union_all_specs", "UNION-ALL-SPECS", 1, 2, false);
    //declareFunction(myName, "union_all_specs_count", "UNION-ALL-SPECS-COUNT", 1, 2, false);
    //declareFunction(myName, "max_cols_beneath", "MAX-COLS-BENEATH", 2, 1, false);
    //declareFunction(myName, "all_dependent_specs", "ALL-DEPENDENT-SPECS", 1, 2, false);
    //declareFunction(myName, "min_genls_among", "MIN-GENLS-AMONG", 2, 2, false);
    //declareFunction(myName, "all_genls_among", "ALL-GENLS-AMONG", 2, 2, false);
    //declareFunction(myName, "all_specs_among", "ALL-SPECS-AMONG", 2, 2, false);
    //declareFunction(myName, "all_genls_if", "ALL-GENLS-IF", 2, 2, false);
    //declareFunction(myName, "all_specs_if", "ALL-SPECS-IF", 2, 2, false);
    //declareFunction(myName, "all_genls_if_with_pruning", "ALL-GENLS-IF-WITH-PRUNING", 2, 2, false);
    //declareFunction(myName, "all_not_genls", "ALL-NOT-GENLS", 1, 2, false);
    //declareFunction(myName, "all_not_specs", "ALL-NOT-SPECS", 1, 2, false);
    //declareFunction(myName, "cols_awning", "COLS-AWNING", 2, 2, false);
    //declareFunction(myName, "map_all_genls", "MAP-ALL-GENLS", 2, 2, false);
    //declareFunction(myName, "map_all_specs", "MAP-ALL-SPECS", 2, 2, false);
    //declareFunction(myName, "map_union_all_genls", "MAP-UNION-ALL-GENLS", 2, 2, false);
    //declareFunction(myName, "map_all_genls_if", "MAP-ALL-GENLS-IF", 3, 2, false);
    //declareFunction(myName, "gather_all_genls", "GATHER-ALL-GENLS", 2, 3, false);
    //declareFunction(myName, "gather_all_specs", "GATHER-ALL-SPECS", 2, 3, false);
    //declareFunction(myName, "any_all_genls", "ANY-ALL-GENLS", 2, 2, false);
    //declareFunction(myName, "any_all_specs", "ANY-ALL-SPECS", 2, 2, false);
    //declareFunction(myName, "sample_leaf_specs", "SAMPLE-LEAF-SPECS", 1, 3, false);
    //declareFunction(myName, "sample_different_leaf_specs", "SAMPLE-DIFFERENT-LEAF-SPECS", 2, 3, false);
    declareFunction(myName, "genlP", "GENL?", 2, 2, false);
    declareFunction(myName, "genlsP", "GENLS?", 2, 2, false);
    //declareFunction(myName, "genl_in_mtsP", "GENL-IN-MTS?", 2, 1, false);
    //declareFunction(myName, "genl_in_any_mtP", "GENL-IN-ANY-MT?", 2, 0, false);
    declareFunction(myName, "specP", "SPEC?", 2, 2, false);
    //declareFunction(myName, "nat_genlP", "NAT-GENL?", 2, 1, false);
    //declareFunction(myName, "naut_genlP", "NAUT-GENL?", 2, 1, false);
    //declareFunction(myName, "result_genl_colP", "RESULT-GENL-COL?", 2, 1, false);
    //declareFunction(myName, "result_genl_arg_colP", "RESULT-GENL-ARG-COL?", 2, 1, false);
    //declareFunction(myName, "result_genl_inter_arg_colP", "RESULT-GENL-INTER-ARG-COL?", 2, 1, false);
    //declareFunction(myName, "result_genl_via_pgiaP", "RESULT-GENL-VIA-PGIA?", 2, 1, false);
    //declareFunction(myName, "genl_ofP", "GENL-OF?", 2, 2, false);
    //declareFunction(myName, "any_genlP", "ANY-GENL?", 2, 2, false);
    declareFunction(myName, "any_specP", "ANY-SPEC?", 2, 2, false);
    //declareFunction(myName, "all_genlP", "ALL-GENL?", 2, 2, false);
    //declareFunction(myName, "all_specP", "ALL-SPEC?", 2, 2, false);
    //declareFunction(myName, "any_genl_anyP", "ANY-GENL-ANY?", 2, 2, false);
    //declareFunction(myName, "any_genl_allP", "ANY-GENL-ALL?", 2, 2, false);
    //declareFunction(myName, "all_spec_anyP", "ALL-SPEC-ANY?", 2, 2, false);
    //declareFunction(myName, "not_genlsP", "NOT-GENLS?", 2, 2, false);
    //declareFunction(myName, "not_genlP", "NOT-GENL?", 2, 2, false);
    //declareFunction(myName, "argue_not_genlP", "ARGUE-NOT-GENL?", 2, 2, false);
    //declareFunction(myName, "all_not_specP", "ALL-NOT-SPEC?", 2, 2, false);
    //declareFunction(myName, "any_not_genlP", "ANY-NOT-GENL?", 2, 2, false);
    //declareFunction(myName, "random_genl_of", "RANDOM-GENL-OF", 1, 1, false);
    //declareFunction(myName, "random_spec_of", "RANDOM-SPEC-OF", 1, 1, false);
    //declareFunction(myName, "collections_coextensionalP", "COLLECTIONS-COEXTENSIONAL?", 2, 1, false);
    //declareFunction(myName, "tacit_coextensionalP", "TACIT-COEXTENSIONAL?", 2, 1, false);
    //declareFunction(myName, "common_instanceP", "COMMON-INSTANCE?", 2, 1, false);
    //declareFunction(myName, "why_common_instanceP", "WHY-COMMON-INSTANCE?", 2, 3, false);
    //declareFunction(myName, "collections_intersectP", "COLLECTIONS-INTERSECT?", 2, 1, false);
    //declareFunction(myName, "hierarchical_collectionsP", "HIERARCHICAL-COLLECTIONS?", 2, 1, false);
    //declareFunction(myName, "genl_of_any_argP", "GENL-OF-ANY-ARG?", 3, 4, false);
    //declareFunction(myName, "genl_of_any_argP_int", "GENL-OF-ANY-ARG?-INT", 7, 0, false);
    //declareFunction(myName, "why_genlP", "WHY-GENL?", 2, 3, false);
    //declareFunction(myName, "any_just_of_nat_genl", "ANY-JUST-OF-NAT-GENL", 2, 1, false);
    //declareFunction(myName, "why_not_genlP", "WHY-NOT-GENL?", 2, 3, false);
    //declareFunction(myName, "why_not_assert_genlsP", "WHY-NOT-ASSERT-GENLS?", 2, 1, false);
    //declareFunction(myName, "why_collections_intersectP", "WHY-COLLECTIONS-INTERSECT?", 2, 3, false);
    //declareFunction(myName, "why_not_assert_mdwP", "WHY-NOT-ASSERT-MDW?", 2, 1, false);
    //declareFunction(myName, "collection_leaves", "COLLECTION-LEAVES", 1, 2, false);
    declareFunction(myName, "min_cols", "MIN-COLS", 1, 2, false);
    //declareFunction(myName, "min_col", "MIN-COL", 1, 2, false);
    //declareFunction(myName, "max_cols", "MAX-COLS", 1, 2, false);
    //declareFunction(myName, "nearest_common_genls", "NEAREST-COMMON-GENLS", 1, 3, false);
    //declareFunction(myName, "min_ceiling_cols", "MIN-CEILING-COLS", 1, 3, false);
    //declareFunction(myName, "nearest_common_specs", "NEAREST-COMMON-SPECS", 1, 3, false);
    //declareFunction(myName, "max_floor_cols", "MAX-FLOOR-COLS", 1, 3, false);
    //declareFunction(myName, "floor_of_col_pairP", "FLOOR-OF-COL-PAIR?", 2, 1, false);
    //declareFunction(myName, "any_floor_of_col_pair", "ANY-FLOOR-OF-COL-PAIR", 2, 2, false);
    //declareFunction(myName, "all_common_specs", "ALL-COMMON-SPECS", 1, 2, false);
    //declareFunction(myName, "any_genl_isa", "ANY-GENL-ISA", 2, 2, false);
    //declareFunction(myName, "lighter_col", "LIGHTER-COL", 2, 0, false);
    //declareFunction(myName, "lightest_col", "LIGHTEST-COL", 2, 0, false);
    //declareFunction(myName, "lightest_of_cols", "LIGHTEST-OF-COLS", 1, 0, false);
    //declareFunction(myName, "shallower_col", "SHALLOWER-COL", 2, 0, false);
    //declareFunction(myName, "shallowest_col", "SHALLOWEST-COL", 2, 0, false);
    //declareFunction(myName, "max_floor_mts_of_genls_paths_wrt", "MAX-FLOOR-MTS-OF-GENLS-PATHS-WRT", 3, 0, false);
    //declareFunction(myName, "max_floor_mts_of_genls_paths", "MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_nat_genls_paths", "MAX-FLOOR-MTS-OF-NAT-GENLS-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_genls_paths", "MIN-MTS-OF-GENLS-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_not_genls_paths", "MAX-FLOOR-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_not_genls_paths", "MIN-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
    //declareFunction(myName, "genls_mts", "GENLS-MTS", 1, 0, false);
    declareFunction(myName, "asserted_genlsP", "ASSERTED-GENLS?", 1, 1, false);
    declareFunction(myName, "asserted_genls", "ASSERTED-GENLS", 1, 1, false);
    //declareFunction(myName, "asserted_not_genls", "ASSERTED-NOT-GENLS", 1, 1, false);
    //declareFunction(myName, "supported_genls", "SUPPORTED-GENLS", 1, 1, false);
    //declareFunction(myName, "supported_not_genls", "SUPPORTED-NOT-GENLS", 1, 1, false);
    //declareFunction(myName, "asserted_specs", "ASSERTED-SPECS", 1, 1, false);
    //declareFunction(myName, "asserted_not_specs", "ASSERTED-NOT-SPECS", 1, 1, false);
    //declareFunction(myName, "supported_specs", "SUPPORTED-SPECS", 1, 1, false);
    //declareFunction(myName, "supported_not_specs", "SUPPORTED-NOT-SPECS", 1, 1, false);
    //declareFunction(myName, "asserted_coextensionalP", "ASSERTED-COEXTENSIONAL?", 2, 1, false);
    declareFunction(myName, "genls_after_adding", "GENLS-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "handle_more_specific_genl", "HANDLE-MORE-SPECIFIC-GENL", 2, 0, false);
    //declareFunction(myName, "more_general_genls_assertions", "MORE-GENERAL-GENLS-ASSERTIONS", 2, 0, false);
    declareFunction(myName, "genls_after_removing", "GENLS-AFTER-REMOVING", 2, 0, false);
    //declareFunction(myName, "clear_genls_graph", "CLEAR-GENLS-GRAPH", 0, 0, false);
    //declareFunction(myName, "clear_node_genls_links", "CLEAR-NODE-GENLS-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_genls_links", "RESET-GENLS-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_genls_links_in_mt", "RESET-GENLS-LINKS-IN-MT", 2, 0, false);
    //declareFunction(myName, "reset_genls_graph", "RESET-GENLS-GRAPH", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_genls_file() {
    $sbhl_infer_intersection_from_instancesP$ = defvar("*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_genls_file() {
    // CVS_ID("Id: genls.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym1$MIN_GENLS, $list2, $str3$Returns_the_most_specific_genls_o, NIL, $list4);
    utilities_macros.register_cyc_api_function($sym6$MAX_NOT_GENLS, $list2, $str7$Returns_the_least_specific_negate, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym10$MAX_SPECS, $list2, $str11$Returns_the_least_specific_specs_, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym12$MIN_NOT_SPECS, $list2, $str13$Returns_the_most_specific_negated, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym14$GENL_SIBLINGS, $list2, $str15$Returns_the_direct_genls_of_those, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym16$SPEC_SIBLINGS, $list2, $str17$Returns_the_direct_specs_of_those, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym18$ALL_GENLS, $list2, $str19$Returns_all_genls_of_collection_C, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym24$ALL_SPECS, $list2, $str25$Returns_all_specs_of_collection_C, $list8, $list4);
    access_macros.register_external_symbol($sym40$ALL_SPECS_WITH_MAX);
    utilities_macros.register_cyc_api_function($sym43$COUNT_ALL_SPECS, $list44, $str45$Counts_the_number_of_specs_in_COL, $list46, $list47);
    utilities_macros.register_cyc_api_function($sym48$ALL_GENLS_WRT, $list49, $str50$Returns_all_genls_of_collection_S, $list51, $list4);
    utilities_macros.register_cyc_api_function($sym53$UNION_ALL_GENLS, $list54, $str55$Returns_all_genls_of_each_collect, $list56, $list4);
    utilities_macros.register_cyc_api_function($sym57$UNION_ALL_SPECS, $list54, $str58$Returns_all_specs_of_each_collect, $list56, $list4);
    utilities_macros.register_cyc_api_function($sym59$ALL_DEPENDENT_SPECS, $list2, $str60$Returns_all_specs_s_of_COL_s_t__e, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym61$ALL_GENLS_AMONG, $list62, $str63$Returns_those_genls_of_COL_that_a, $list64, $list4);
    utilities_macros.register_cyc_api_function($sym65$ALL_SPECS_AMONG, $list62, $str66$Returns_those_specs_of_COL_that_a, $list64, $list4);
    utilities_macros.register_cyc_api_function($sym68$ALL_GENLS_IF, $list69, $str70$Returns_all_genls_of_collection_C, $list71, $list4);
    utilities_macros.register_cyc_api_function($sym72$ALL_SPECS_IF, $list69, $str70$Returns_all_genls_of_collection_C, $list71, $list4);
    utilities_macros.register_cyc_api_function($sym73$ALL_NOT_GENLS, $list2, $str74$Returns_all_negated_genls_of_coll, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym75$ALL_NOT_SPECS, $list2, $str76$Returns_all_negated_specs_of_coll, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym77$MAP_ALL_GENLS, $list78, $str79$Applies_FN_to_every__all__genls_o, $list80, NIL);
    utilities_macros.register_cyc_api_function($sym81$MAP_ALL_SPECS, $list78, $str82$Applies_FN_to_every__all__specs_o, $list80, NIL);
    utilities_macros.register_cyc_api_function($sym83$ANY_ALL_GENLS, $list78, $str84$Return_a_non_nil_result_of_applyi, $list80, NIL);
    utilities_macros.register_cyc_api_function($sym85$ANY_ALL_SPECS, $list78, $str86$Return_a_non_nil_result_of_applyi, $list80, NIL);
    utilities_macros.register_cyc_api_function($sym87$GENL_, $list49, $str88$Returns_whether____genls_SPEC_GEN, $list51, $list89);
    utilities_macros.register_cyc_api_function($sym90$SPEC_, $list91, $str88$Returns_whether____genls_SPEC_GEN, $list92, $list89);
    utilities_macros.register_cyc_api_function($sym94$ANY_GENL_, $list95, $str96$_any_genl__spec_genls__is_t_iff__, $list97, $list89);
    utilities_macros.register_cyc_api_function($sym98$ANY_SPEC_, $list99, $str100$Returns_T_iff__spec__genl_spec__f, $list101, $list89);
    utilities_macros.register_cyc_api_function($sym102$ALL_GENL_, $list95, $str103$Returns_T_iff__genl__spec_genl__f, $list97, $list89);
    utilities_macros.register_cyc_api_function($sym104$ALL_SPEC_, $list99, $str105$Returns_T_iff__spec__genl_spec__f, $list101, $list89);
    utilities_macros.register_cyc_api_function($sym106$ANY_GENL_ANY_, $list107, $str108$Return_T_iff__genl__spec_genl_mt_, $list109, $list89);
    utilities_macros.register_cyc_api_function($sym110$ANY_GENL_ALL_, $list107, $str111$Return_T_iff__genl__spec_genl_mt_, $list109, $list89);
    utilities_macros.register_cyc_api_function($sym112$ALL_SPEC_ANY_, $list107, $str113$Return_T_iff_for_each_spec_in_SPE, $list109, $list89);
    utilities_macros.register_cyc_api_function($sym114$NOT_GENL_, $list115, $str116$Return_whether_collection_NOT_GEN, $list117, $list89);
    utilities_macros.register_cyc_api_function($sym118$ALL_NOT_SPEC_, $list119, $str120$Return_whether_every_collection_i, $list121, $list89);
    utilities_macros.register_cyc_api_function($sym122$ANY_NOT_GENL_, $list123, $str124$Returns_whether_any_collection_in, $list125, $list89);
    utilities_macros.register_cyc_api_function($sym128$COLLECTIONS_COEXTENSIONAL_, $list129, $str130$Are_COL_1_and_COL_2_coextensional, $list131, $list89);
    utilities_macros.register_cyc_api_function($sym132$COLLECTIONS_INTERSECT_, $list129, $str133$Do_collections_COL_1_and_COL_2_in, $list131, $list89);
    utilities_macros.register_cyc_api_function($sym136$WHY_GENL_, $list137, $str138$Justification_of__genls_SPEC_GENL, $list51, $list139);
    utilities_macros.register_cyc_api_function($sym146$WHY_NOT_GENL_, $list137, $str147$Justification_of__not__genls_SPEC, $list51, $list139);
    utilities_macros.register_cyc_api_function($sym148$WHY_NOT_ASSERT_GENLS_, $list149, $str150$Justification_of_why_asserting__g, $list51, $list139);
    utilities_macros.register_cyc_api_function($sym151$COLLECTION_LEAVES, $list2, $str152$Returns_the_minimally_general__th, $list8, $list4);
    utilities_macros.register_cyc_api_function($sym154$MIN_COLS, $list54, $str155$Returns_the_minimally_general__th, $list156, $list4);
    utilities_macros.register_cyc_api_function($sym157$MIN_COL, $list54, $str158$Returns_the_single_minimally_gene, $list56, $list159);
    utilities_macros.register_cyc_api_function($sym160$MAX_COLS, $list54, $str161$Returns_the_most_general_among_re, $list56, $list4);
    utilities_macros.register_cyc_api_function($sym162$MIN_CEILING_COLS, $list163, $str164$Returns_the_most_specific_common_, $list56, $list4);
    utilities_macros.register_cyc_api_function($sym165$MAX_FLOOR_COLS, $list163, $str166$Returns_the_most_general_common_s, $list56, $list4);
    utilities_macros.register_cyc_api_function($sym167$ANY_GENL_ISA, $list168, $str169$Return_some_genl_of_COL_that_isa_, $list170, $list159);
    utilities_macros.register_cyc_api_function($sym171$LIGHTER_COL, $list172, $str173$Return_COL_B_iff_it_has_fewer_spe, $list174, $list159);
    utilities_macros.register_cyc_api_function($sym175$LIGHTEST_OF_COLS, $list176, $str177$Return_the_collection_having_the_, $list56, $list159);
    utilities_macros.register_cyc_api_function($sym178$SHALLOWER_COL, $list172, $str179$Return_COL_B_iff_it_has_fewer_gen, $list174, $list159);
    utilities_macros.register_cyc_api_function($sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS, $list181, $str182$_return_listp__Returns_in_what__m, $list51, NIL);
    utilities_macros.register_kb_function($sym184$GENLS_AFTER_ADDING);
    utilities_macros.register_kb_function($sym185$GENLS_AFTER_REMOVING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym1$MIN_GENLS = makeSymbol("MIN-GENLS");
  public static final SubLList $list2 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str3$Returns_the_most_specific_genls_o = makeString("Returns the most-specific genls of collection COL");
  public static final SubLList $list4 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym5$EL_FORT_P = makeSymbol("EL-FORT-P");
  public static final SubLSymbol $sym6$MAX_NOT_GENLS = makeSymbol("MAX-NOT-GENLS");
  public static final SubLString $str7$Returns_the_least_specific_negate = makeString("Returns the least-specific negated genls of collection COL");
  public static final SubLList $list8 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $kw9$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $sym10$MAX_SPECS = makeSymbol("MAX-SPECS");
  public static final SubLString $str11$Returns_the_least_specific_specs_ = makeString("Returns the least-specific specs of collection COL");
  public static final SubLSymbol $sym12$MIN_NOT_SPECS = makeSymbol("MIN-NOT-SPECS");
  public static final SubLString $str13$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specs of collection COL");
  public static final SubLSymbol $sym14$GENL_SIBLINGS = makeSymbol("GENL-SIBLINGS");
  public static final SubLString $str15$Returns_the_direct_genls_of_those = makeString("Returns the direct genls of those direct spec collections of COL");
  public static final SubLSymbol $sym16$SPEC_SIBLINGS = makeSymbol("SPEC-SIBLINGS");
  public static final SubLString $str17$Returns_the_direct_specs_of_those = makeString("Returns the direct specs of those direct genls collections of COL");
  public static final SubLSymbol $sym18$ALL_GENLS = makeSymbol("ALL-GENLS");
  public static final SubLString $str19$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)");
  public static final SubLSymbol $sym20$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const21$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym22$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
  public static final SubLSymbol $sym24$ALL_SPECS = makeSymbol("ALL-SPECS");
  public static final SubLString $str25$Returns_all_specs_of_collection_C = makeString("Returns all specs of collection COL \n   (descending transitive closure; expensive)");
  public static final SubLSymbol $kw26$DESCENDING = makeKeyword("DESCENDING");
  public static final SubLSymbol $kw27$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw28$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw29$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw31$ERROR = makeKeyword("ERROR");
  public static final SubLString $str32$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym33$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw34$CERROR = makeKeyword("CERROR");
  public static final SubLString $str35$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw36$WARN = makeKeyword("WARN");
  public static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str39$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym40$ALL_SPECS_WITH_MAX = makeSymbol("ALL-SPECS-WITH-MAX");
  public static final SubLSymbol $sym41$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw42$INVALID_ITERATION_TERM = makeKeyword("INVALID-ITERATION-TERM");
  public static final SubLSymbol $sym43$COUNT_ALL_SPECS = makeSymbol("COUNT-ALL-SPECS");
  public static final SubLList $list44 = list(makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str45$Counts_the_number_of_specs_in_COL = makeString("Counts the number of specs in COLLECTION and then returns the count.");
  public static final SubLList $list46 = list(list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));
  public static final SubLList $list47 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $sym48$ALL_GENLS_WRT = makeSymbol("ALL-GENLS-WRT");
  public static final SubLList $list49 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str50$Returns_all_genls_of_collection_S = makeString("Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)");
  public static final SubLList $list51 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym52$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym53$UNION_ALL_GENLS = makeSymbol("UNION-ALL-GENLS");
  public static final SubLList $list54 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str55$Returns_all_genls_of_each_collect = makeString("Returns all genls of each collection in COLs");
  public static final SubLList $list56 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym57$UNION_ALL_SPECS = makeSymbol("UNION-ALL-SPECS");
  public static final SubLString $str58$Returns_all_specs_of_each_collect = makeString("Returns all specs of each collection in COLs");
  public static final SubLSymbol $sym59$ALL_DEPENDENT_SPECS = makeSymbol("ALL-DEPENDENT-SPECS");
  public static final SubLString $str60$Returns_all_specs_s_of_COL_s_t__e = makeString("Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL");
  public static final SubLSymbol $sym61$ALL_GENLS_AMONG = makeSymbol("ALL-GENLS-AMONG");
  public static final SubLList $list62 = list(makeSymbol("COL"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str63$Returns_those_genls_of_COL_that_a = makeString("Returns those genls of COL that are included among CANDIDATES");
  public static final SubLList $list64 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym65$ALL_SPECS_AMONG = makeSymbol("ALL-SPECS-AMONG");
  public static final SubLString $str66$Returns_those_specs_of_COL_that_a = makeString("Returns those specs of COL that are included among CANDIDATEs");
  public static final SubLSymbol $sym67$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym68$ALL_GENLS_IF = makeSymbol("ALL-GENLS-IF");
  public static final SubLList $list69 = list(makeSymbol("FUNCTION"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str70$Returns_all_genls_of_collection_C = makeString("Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)");
  public static final SubLList $list71 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym72$ALL_SPECS_IF = makeSymbol("ALL-SPECS-IF");
  public static final SubLSymbol $sym73$ALL_NOT_GENLS = makeSymbol("ALL-NOT-GENLS");
  public static final SubLString $str74$Returns_all_negated_genls_of_coll = makeString("Returns all negated genls of collection COL \n   (descending transitive closure; expensive)");
  public static final SubLSymbol $sym75$ALL_NOT_SPECS = makeSymbol("ALL-NOT-SPECS");
  public static final SubLString $str76$Returns_all_negated_specs_of_coll = makeString("Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)");
  public static final SubLSymbol $sym77$MAP_ALL_GENLS = makeSymbol("MAP-ALL-GENLS");
  public static final SubLList $list78 = list(makeSymbol("FN"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str79$Applies_FN_to_every__all__genls_o = makeString("Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)");
  public static final SubLList $list80 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym81$MAP_ALL_SPECS = makeSymbol("MAP-ALL-SPECS");
  public static final SubLString $str82$Applies_FN_to_every__all__specs_o = makeString("Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)");
  public static final SubLSymbol $sym83$ANY_ALL_GENLS = makeSymbol("ANY-ALL-GENLS");
  public static final SubLString $str84$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)");
  public static final SubLSymbol $sym85$ANY_ALL_SPECS = makeSymbol("ANY-ALL-SPECS");
  public static final SubLString $str86$Return_a_non_nil_result_of_applyi = makeString("Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)");
  public static final SubLSymbol $sym87$GENL_ = makeSymbol("GENL?");
  public static final SubLString $str88$Returns_whether____genls_SPEC_GEN = makeString("Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)");
  public static final SubLList $list89 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym90$SPEC_ = makeSymbol("SPEC?");
  public static final SubLList $list91 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLList $list92 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")));
  public static final SubLObject $const93$preservesGenlsInArg = constant_handles.reader_make_constant_shell(makeString("preservesGenlsInArg"));
  public static final SubLSymbol $sym94$ANY_GENL_ = makeSymbol("ANY-GENL?");
  public static final SubLList $list95 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str96$_any_genl__spec_genls__is_t_iff__ = makeString("(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");
  public static final SubLList $list97 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym98$ANY_SPEC_ = makeSymbol("ANY-SPEC?");
  public static final SubLList $list99 = list(makeSymbol("GENL"), makeSymbol("SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str100$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for some spec in SPECS");
  public static final SubLList $list101 = list(list(makeSymbol("GENL"), makeSymbol("EL-FORT-P")), list(makeSymbol("SPECS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym102$ALL_GENL_ = makeSymbol("ALL-GENL?");
  public static final SubLString $str103$Returns_T_iff__genl__spec_genl__f = makeString("Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)");
  public static final SubLSymbol $sym104$ALL_SPEC_ = makeSymbol("ALL-SPEC?");
  public static final SubLString $str105$Returns_T_iff__spec__genl_spec__f = makeString("Returns T iff (spec? genl spec) for every spec in SPECS");
  public static final SubLSymbol $sym106$ANY_GENL_ANY_ = makeSymbol("ANY-GENL-ANY?");
  public static final SubLList $list107 = list(makeSymbol("SPECS"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str108$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS");
  public static final SubLList $list109 = list(list(makeSymbol("SPECS"), makeSymbol("LISTP")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym110$ANY_GENL_ALL_ = makeSymbol("ANY-GENL-ALL?");
  public static final SubLString $str111$Return_T_iff__genl__spec_genl_mt_ = makeString("Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS");
  public static final SubLSymbol $sym112$ALL_SPEC_ANY_ = makeSymbol("ALL-SPEC-ANY?");
  public static final SubLString $str113$Return_T_iff_for_each_spec_in_SPE = makeString("Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)");
  public static final SubLSymbol $sym114$NOT_GENL_ = makeSymbol("NOT-GENL?");
  public static final SubLList $list115 = list(makeSymbol("COL"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str116$Return_whether_collection_NOT_GEN = makeString("Return whether collection NOT-GENL is not a genl of COL.");
  public static final SubLList $list117 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym118$ALL_NOT_SPEC_ = makeSymbol("ALL-NOT-SPEC?");
  public static final SubLList $list119 = list(makeSymbol("COL"), makeSymbol("NOT-SPECS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str120$Return_whether_every_collection_i = makeString("Return whether every collection in NOT-SPECS is not a spec of COL.");
  public static final SubLList $list121 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-SPECS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym122$ANY_NOT_GENL_ = makeSymbol("ANY-NOT-GENL?");
  public static final SubLList $list123 = list(makeSymbol("COL"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str124$Returns_whether_any_collection_in = makeString("Returns whether any collection in NOT-GENLS is not a genl of COL.");
  public static final SubLList $list125 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym126$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym127$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym128$COLLECTIONS_COEXTENSIONAL_ = makeSymbol("COLLECTIONS-COEXTENSIONAL?");
  public static final SubLList $list129 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str130$Are_COL_1_and_COL_2_coextensional = makeString("Are COL-1 and COL-2 coextensional?");
  public static final SubLList $list131 = list(list(makeSymbol("COL-1"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-2"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym132$COLLECTIONS_INTERSECT_ = makeSymbol("COLLECTIONS-INTERSECT?");
  public static final SubLString $str133$Do_collections_COL_1_and_COL_2_in = makeString("Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)");
  public static final SubLSymbol $kw134$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw135$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym136$WHY_GENL_ = makeSymbol("WHY-GENL?");
  public static final SubLList $list137 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));
  public static final SubLString $str138$Justification_of__genls_SPEC_GENL = makeString("Justification of (genls SPEC GENL)");
  public static final SubLList $list139 = list(makeSymbol("LISTP"));
  public static final SubLObject $const140$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list141 = list(makeKeyword("TRUE"));
  public static final SubLObject $const142$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));
  public static final SubLObject $const143$resultGenlArg = constant_handles.reader_make_constant_shell(makeString("resultGenlArg"));
  public static final SubLObject $const144$interArgResultGenl = constant_handles.reader_make_constant_shell(makeString("interArgResultGenl"));
  public static final SubLObject $const145$interArgResultGenlReln = constant_handles.reader_make_constant_shell(makeString("interArgResultGenlReln"));
  public static final SubLSymbol $sym146$WHY_NOT_GENL_ = makeSymbol("WHY-NOT-GENL?");
  public static final SubLString $str147$Justification_of__not__genls_SPEC = makeString("Justification of (not (genls SPEC GENL))");
  public static final SubLSymbol $sym148$WHY_NOT_ASSERT_GENLS_ = makeSymbol("WHY-NOT-ASSERT-GENLS?");
  public static final SubLList $list149 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str150$Justification_of_why_asserting__g = makeString("Justification of why asserting (genls SPEC GENL) is not consistent");
  public static final SubLSymbol $sym151$COLLECTION_LEAVES = makeSymbol("COLLECTION-LEAVES");
  public static final SubLString $str152$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among all-specs of COL");
  public static final SubLSymbol $sym153$LIST_OF_COLLECTIONS_P = makeSymbol("LIST-OF-COLLECTIONS-P");
  public static final SubLSymbol $sym154$MIN_COLS = makeSymbol("MIN-COLS");
  public static final SubLString $str155$Returns_the_minimally_general__th = makeString("Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS");
  public static final SubLList $list156 = list(list(makeSymbol("COLS"), makeSymbol("LIST-OF-COLLECTIONS-P")));
  public static final SubLSymbol $sym157$MIN_COL = makeSymbol("MIN-COL");
  public static final SubLString $str158$Returns_the_single_minimally_gene = makeString("Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.");
  public static final SubLList $list159 = list(makeSymbol("FORT-P"));
  public static final SubLSymbol $sym160$MAX_COLS = makeSymbol("MAX-COLS");
  public static final SubLString $str161$Returns_the_most_general_among_re = makeString("Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS");
  public static final SubLSymbol $sym162$MIN_CEILING_COLS = makeSymbol("MIN-CEILING-COLS");
  public static final SubLList $list163 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str164$Returns_the_most_specific_common_ = makeString("Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");
  public static final SubLSymbol $sym165$MAX_FLOOR_COLS = makeSymbol("MAX-FLOOR-COLS");
  public static final SubLString $str166$Returns_the_most_general_common_s = makeString("Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");
  public static final SubLSymbol $sym167$ANY_GENL_ISA = makeSymbol("ANY-GENL-ISA");
  public static final SubLList $list168 = list(makeSymbol("COL"), makeSymbol("ISA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str169$Return_some_genl_of_COL_that_isa_ = makeString("Return some genl of COL that isa instance of ISA (if any such genl exists)");
  public static final SubLList $list170 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")), list(makeSymbol("ISA"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym171$LIGHTER_COL = makeSymbol("LIGHTER-COL");
  public static final SubLList $list172 = list(makeSymbol("COL-A"), makeSymbol("COL-B"));
  public static final SubLString $str173$Return_COL_B_iff_it_has_fewer_spe = makeString("Return COL-B iff it has fewer specs than COL-A, else return COL-A");
  public static final SubLList $list174 = list(list(makeSymbol("COL-A"), makeSymbol("EL-FORT-P")), list(makeSymbol("COL-B"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym175$LIGHTEST_OF_COLS = makeSymbol("LIGHTEST-OF-COLS");
  public static final SubLList $list176 = list(makeSymbol("COLS"));
  public static final SubLString $str177$Return_the_collection_having_the_ = makeString("Return the collection having the fewest specs given a list of collections.");
  public static final SubLSymbol $sym178$SHALLOWER_COL = makeSymbol("SHALLOWER-COL");
  public static final SubLString $str179$Return_COL_B_iff_it_has_fewer_gen = makeString("Return COL-B iff it has fewer genls than COL-A, else return COL-A");
  public static final SubLSymbol $sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENLS-PATHS");
  public static final SubLList $list181 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));
  public static final SubLString $str182$_return_listp__Returns_in_what__m = makeString("@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC");
  public static final SubLObject $const183$coExtensional = constant_handles.reader_make_constant_shell(makeString("coExtensional"));
  public static final SubLSymbol $sym184$GENLS_AFTER_ADDING = makeSymbol("GENLS-AFTER-ADDING");
  public static final SubLSymbol $sym185$GENLS_AFTER_REMOVING = makeSymbol("GENLS-AFTER-REMOVING");

  //// Initializers

  public void declareFunctions() {
    declare_genls_file();
  }

  public void initializeVariables() {
    init_genls_file();
  }

  public void runTopLevelForms() {
    setup_genls_file();
  }

}
