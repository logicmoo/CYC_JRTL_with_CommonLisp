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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class czer_vars extends SubLTranslatedFile {

  //// Constructor

  private czer_vars() {}
  public static final SubLFile me = new czer_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.czer_vars";

  //// Definitions

  @SubL(source = "cycl/czer-vars.lisp", position = 385) 
  public static SubLSymbol $required_arg_preds$ = null;

  /** Integers denoting the most common arg positions of fixed-arity CycL relations. */
  @SubL(source = "cycl/czer-vars.lisp", position = 687) 
  public static SubLSymbol $arg_positions$ = null;

  /** suppresses resetting *arg-type-violations* */
  @SubL(source = "cycl/czer-vars.lisp", position = 837) 
  public static SubLSymbol $accumulating_semantic_violationsP$ = null;

  /** descriptions of how a relational expression is not semantically valid */
  @SubL(source = "cycl/czer-vars.lisp", position = 948) 
  public static SubLSymbol $semantic_violations$ = null;

  /** which function to use when accessing the formula for an assertion */
  @SubL(source = "cycl/czer-vars.lisp", position = 1071) 
  public static SubLSymbol $assertion_key$ = null;

  /** which function to use when accessing the formula for a nart */
  @SubL(source = "cycl/czer-vars.lisp", position = 1200) 
  public static SubLSymbol $nart_key$ = null;

  /** which function to use when accessing the formula for a reified formula (the genl of nart and assertion) */
  @SubL(source = "cycl/czer-vars.lisp", position = 1315) 
  public static SubLSymbol $rf_key$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 1467) 
  public static SubLSymbol $implication_operators$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 1569) 
  public static SubLSymbol $logical_operators$ = null;

  /** cyc constants that denote functions whose ranges are skolem functions */
  @SubL(source = "cycl/czer-vars.lisp", position = 1968) 
  public static SubLSymbol $skolem_function_functions$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 2261) 
  public static SubLSymbol $arg_isa_binary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 2380) 
  public static SubLSymbol $arg_isa_ternary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 2690) 
  public static SubLSymbol $arg_quoted_isa_binary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 2870) 
  public static SubLSymbol $arg_quoted_isa_ternary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 2964) 
  public static SubLSymbol $arg_genl_binary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 3091) 
  public static SubLSymbol $arg_genl_ternary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 3169) 
  public static SubLSymbol $arg_format_binary_preds$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 3299) 
  public static SubLSymbol $arg_format_ternary_preds$ = null;

  /** arg-type for meta predicates */
  @SubL(source = "cycl/czer-vars.lisp", position = 3364) 
  public static SubLSymbol $meta_arg_type$ = null;

  /** arg-type for meta predicates */
  @SubL(source = "cycl/czer-vars.lisp", position = 3452) 
  public static SubLSymbol $possibly_meta_arg_type$ = null;

  /** a dynamic stack of variables that are currently not permitted to be used as sequence variables (e.g. because they're scoped) */
  @SubL(source = "cycl/czer-vars.lisp", position = 3549) 
  public static SubLSymbol $variables_that_cannot_be_sequence_variables$ = null;

  /** are sequence variables permitted? */
  @SubL(source = "cycl/czer-vars.lisp", position = 3752) 
  public static SubLSymbol $el_supports_dot_syntaxP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 3842) 
  public static SubLSymbol $el_supports_variable_arity_skolemsP$ = null;

  /** is support for contractions (inverse #$expansions) enabled? */
  @SubL(source = "cycl/czer-vars.lisp", position = 3905) 
  public static SubLSymbol $el_supports_contractionsP$ = null;

  /** Variable to keep track if we are inside a quote form */
  @SubL(source = "cycl/czer-vars.lisp", position = 4024) 
  public static SubLSymbol $inside_quote$ = null;

  /** Whether to use the code for the new canonicalizer */
  @SubL(source = "cycl/czer-vars.lisp", position = 4117) 
  public static SubLSymbol $new_canonicalizerP$ = null;

  /** transient state variable; is t during the execution of canonicalizing functions */
  @SubL(source = "cycl/czer-vars.lisp", position = 4272) 
  public static SubLSymbol $within_canonicalizerP$ = null;

  /** canonicalizer state variable [:cnf :dnf] */
  @SubL(source = "cycl/czer-vars.lisp", position = 4409) 
  public static SubLSymbol $form_of_clausal_form$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 4504) 
  public static SubLSymbol $must_enforce_semanticsP$ = null;

  /** controls tracing level for canonicalizer [0..5] */
  @SubL(source = "cycl/czer-vars.lisp", position = 4596) 
  public static SubLSymbol $el_trace_level$ = null;

  /** controls whether the formula is printed after each step of canonicalization.  only set to t for debugging purposes. */
  @SubL(source = "cycl/czer-vars.lisp", position = 4690) 
  public static SubLSymbol $canon_verboseP$ = null;

  /** default predicate to identify variables */
  @SubL(source = "cycl/czer-vars.lisp", position = 4854) 
  public static SubLSymbol $varP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 4937) 
  public static SubLSymbol $subordinate_fi_opsP$ = null;

  /** flag to break on error conditions */
  @SubL(source = "cycl/czer-vars.lisp", position = 4988) 
  public static SubLSymbol $cryP$ = null;

  /** should the canonicalizer include only free vars referenced in existentially 
   quantified formulas in argument lists of the resulting skolem functions? */
  @SubL(source = "cycl/czer-vars.lisp", position = 5058) 
  public static SubLSymbol $minimal_skolem_arityP$ = null;

  /** should the canonicalizer translate existentially quantified vars into skolem functions during asks? */
  @SubL(source = "cycl/czer-vars.lisp", position = 5268) 
  public static SubLSymbol $skolemize_during_asksP$ = null;

  /** should the canonicalizer, when canonicalizing existentials, simply drop them (like it does by default during asks)?
This setting, if true, overrides the combination of *within-ask* and *skolemize-during-asks?*, but does not override
the case of *turn-existentials-into-skolems?* being false, which will cause no existential handling at all to be done.
@see drop-all-existentials?
@see existentials-out */
  @SubL(source = "cycl/czer-vars.lisp", position = 5426) 
  public static SubLSymbol $drop_all_existentialsP$ = null;

  /** should the canonicalizer, when canonicalizing existentials that are not in the scope of any other variable,
simply drop them (like it does by default during asks)?
This setting, if true, overrides the combination of *within-ask* and *skolemize-during-asks?*, but does not override
the case of *turn-existentials-into-skolems?* being false, which will cause no existential handling at all to be done.
@see leave-skolem-constants-alone?
@see existentials-out */
  @SubL(source = "cycl/czer-vars.lisp", position = 5886) 
  public static SubLSymbol $leave_skolem_constants_aloneP$ = null;

  /** Whether to enforce criterion Q2 in the Sequence Variable Specification, namely:
Q2: Within asserts, sequence variables can only be universally quantified; using existentially quantified variables as sequence variables is not permitted.
If T, Q2 is enforced.
If NIL, Q2 is not enforced.
If :assert-only, Q2 is enforced iff (within-assert?). */
  @SubL(source = "cycl/czer-vars.lisp", position = 6408) 
  public static SubLSymbol $forbid_quantified_sequence_variablesP$ = null;

  /** should the canonicalizer create and reference skolem constants instead of zero-arity skolem functions? */
  @SubL(source = "cycl/czer-vars.lisp", position = 6830) 
  public static SubLSymbol $use_skolem_constantsP$ = null;

  /** should commutative terms of gafs be sorted? */
  @SubL(source = "cycl/czer-vars.lisp", position = 6990) 
  public static SubLSymbol $canonicalize_gaf_commutative_termsP$ = null;

  /** The function that the canonicalizer uses internally to check whether something is a variable.
   :default means that it will use the default function @xref cyc-var?
   (this is slightly more efficient than just making the default be #'cyc-var?)
   @see canon-var? */
  @SubL(source = "cycl/czer-vars.lisp", position = 7103) 
  public static SubLSymbol $canon_var_function$ = null;

  /** determines the type of variables produced by the canonicalzer [:el-var :kb-var] */
  @SubL(source = "cycl/czer-vars.lisp", position = 7426) 
  public static SubLSymbol $canonical_variable_type$ = null;

  /** stores the variable rename mappings formed while standardizing 
   variables during canonicalization */
  @SubL(source = "cycl/czer-vars.lisp", position = 7570) 
  public static SubLSymbol $standardize_variables_memory$ = null;

  /** is distributing meta-knowledge over multiple assertions permitted? */
  @SubL(source = "cycl/czer-vars.lisp", position = 7735) 
  public static SubLSymbol $distributing_meta_knowledgeP$ = null;

  /** should meta-knowledge distribute over multiple assertions 
when those assertions all share a common el formula? */
  @SubL(source = "cycl/czer-vars.lisp", position = 7866) 
  public static SubLSymbol $distribute_meta_over_common_elP$ = null;

  /** If a decontextualized assertion is in the wrong mt, should the canonicalizer,
if asked to look up that assertion, find it?  If T, it will find it.
If NIL, it will treat it like any other uncanonical assertion and fail to find it. */
  @SubL(source = "cycl/czer-vars.lisp", position = 8043) 
  public static SubLSymbol $find_uncanonical_decontextualized_assertionsP$ = null;

  /** should EL variables in EL template args be canonicalized into HL variables during asks?
If t, then queries like (expansion genls (implies (isa ?OBJ :ARG1) (isa ?OBJ :ARG2)))
will not be interpreted as a boolean query, and will return ((?OBJ . ?OBJ))
instead of ((T . T)).  If it is set to nil, then queries like (expansion genls ?WHAT) will
be interpreted as a boolean query, and will return NIL instead of the expansion of genls. */
  @SubL(source = "cycl/czer-vars.lisp", position = 8352) 
  public static SubLSymbol $canonicalize_el_template_vars_during_queriesP$ = null;

  /** Controls whether, upon failing to find an assertion, a more thorough (and more time-consuming) lookup is performed.
   You can set this to T or NIL if you want to control its behavior. */
  @SubL(source = "cycl/czer-vars.lisp", position = 9037) 
  public static SubLSymbol $robust_assertion_lookup$ = null;

  /** Controls whether, upon failing to find a nart, a more thorough (and more time-consuming) lookup is performed.
   You can set this to T or NIL if you want to control its behavior. */
  @SubL(source = "cycl/czer-vars.lisp", position = 9504) 
  public static SubLSymbol $robust_nart_lookup$ = null;

  /** Dynamic variable set while recanonicalizing a nat for robust nart lookup. */
  @SubL(source = "cycl/czer-vars.lisp", position = 9742) 
  public static SubLSymbol $recanonicalizing_candidate_natP$ = null;

  /** stores the variable rename mappings formed while standardizing 
   variables during uncanonicalization */
  @SubL(source = "cycl/czer-vars.lisp", position = 9883) 
  public static SubLSymbol $el_var_blist$ = null;

  /** control var used to collect non-ground reifiable fn terms */
  @SubL(source = "cycl/czer-vars.lisp", position = 10036) 
  public static SubLSymbol $gathering_quantified_fn_termsP$ = null;

  /** should #$ELRelations be automatically expanded by the precanonicalizer? */
  @SubL(source = "cycl/czer-vars.lisp", position = 10159) 
  public static SubLSymbol $expand_el_relationsP$ = null;

  /** should all sentence args (of literals or denotational functions) be canonicalized into their el version? */
  @SubL(source = "cycl/czer-vars.lisp", position = 10284) 
  public static SubLSymbol $canonicalize_all_sentence_argsP$ = null;

  /** should tensed literals be canonicalized into their time quantified version? */
  @SubL(source = "cycl/czer-vars.lisp", position = 10456) 
  public static SubLSymbol $canonicalize_tensed_literalsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 10595) 
  public static SubLSymbol $add_term_of_unit_litsP$ = null;

  /** If you set this to NIL, the canonicalizer will be severely crippled.  Beware! */
  @SubL(source = "cycl/czer-vars.lisp", position = 10647) 
  public static SubLSymbol $turn_existentials_into_skolemsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 10788) 
  public static SubLSymbol $reify_skolemsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 10832) 
  public static SubLSymbol $create_narts_regardless_of_whether_within_assertP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 10913) 
  public static SubLSymbol $canonicalize_functionsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 10966) 
  public static SubLSymbol $canonicalize_termsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 11015) 
  public static SubLSymbol $canonicalize_literalsP$ = null;

  /** whether to canonicalize a disjunction over a common predicate as an #$elementOf expression */
  @SubL(source = "cycl/czer-vars.lisp", position = 11067) 
  public static SubLSymbol $canonicalize_disjunction_as_enumerationP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 11232) 
  public static SubLSymbol $canonicalize_variablesP$ = null;

  /** whether to eliminate universals which could be removed and still maintain the logical equivalence of the sentence if they are viewed as implicitly encapsulating it. */
  @SubL(source = "cycl/czer-vars.lisp", position = 11285) 
  public static SubLSymbol $implicitify_universalsP$ = null;

  /** whether the clausifier will assume that free variables are existentially bound, as opposed
to the default which is universally bound.  This ought to be the mode in which the clausifier
is run for queries. */
  @SubL(source = "cycl/czer-vars.lisp", position = 11505) 
  public static SubLSymbol $assume_free_vars_are_existentially_boundP$ = null;

  /** translate variables appearing as logical operators into encapsulated literals? */
  @SubL(source = "cycl/czer-vars.lisp", position = 11787) 
  public static SubLSymbol $encapsulate_var_formulaP$ = null;

  /** translate intensional (e.g., negated universally quantified) formulas into encapsulated negative literals? */
  @SubL(source = "cycl/czer-vars.lisp", position = 11924) 
  public static SubLSymbol $encapsulate_intensional_formulaP$ = null;

  /** If an expression fails to quiesce after 10 iterations, give up and deem it ill-formed. */
  @SubL(source = "cycl/czer-vars.lisp", position = 12097) 
  public static SubLSymbol $czer_quiescence_iteration_limit$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 12250) 
  public static SubLSymbol $clause_el_var_names$ = null;

  /** dynamic table of uniquifying el var suffixes */
  @SubL(source = "cycl/czer-vars.lisp", position = 12302) 
  public static SubLSymbol $el_symbol_suffix_table$ = null;

  /** is canonicalization occuring within scope of a negation? */
  @SubL(source = "cycl/czer-vars.lisp", position = 12403) 
  public static SubLSymbol $within_negationP$ = null;

  /** preferred order of preds wrt canonicalization */
  @SubL(source = "cycl/czer-vars.lisp", position = 12511) 
  public static SubLSymbol $hl_pred_order$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 12704) 
  public static SubLSymbol $controlP$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 12837) 
  public static SubLSymbol $control_1$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 12970) 
  public static SubLSymbol $control_2$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 13104) 
  public static SubLSymbol $control_3$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 13237) 
  public static SubLSymbol $control_4$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 13370) 
  public static SubLSymbol $control_5$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 13503) 
  public static SubLSymbol $control_6$ = null;

  /** temp: used to control canonicalizer to include (= nil) or exclude (= t) experimental code */
  @SubL(source = "cycl/czer-vars.lisp", position = 13636) 
  public static SubLSymbol $control_ecaP$ = null;

  /** dynamically bound to a memoization state for the canonicalizer */
  @SubL(source = "cycl/czer-vars.lisp", position = 13772) 
  public static SubLSymbol $czer_memoization_state$ = null;

  /** whether to use czer-fort-types at all. */
  @SubL(source = "cycl/czer-vars.lisp", position = 13892) 
  public static SubLSymbol $use_czer_fort_typesP$ = null;

  /** whether to always use czer-fort types.
If NIL, they will only be used within the canonicalizer.  If *use-czer-fort-types?* is NIL, this variable doesn't matter. */
  @SubL(source = "cycl/czer-vars.lisp", position = 13983) 
  public static SubLSymbol $use_czer_fort_types_globallyP$ = null;

  /** The set of predicates which specify #$CanonicalizerDirectives.  Not to be confused with the set
of all instances of #$CanonicalizerDirectivePredicate, which is much broader. */
  @SubL(source = "cycl/czer-vars.lisp", position = 14205) 
  public static SubLSymbol $canonicalizer_directive_predicates$ = null;

  /** Whether the uncanonicalizer should remove uniquifying numerical suffixes on EL variables. */
  @SubL(source = "cycl/czer-vars.lisp", position = 14555) 
  public static SubLSymbol $ununiquify_el_varsP$ = null;

  /** Whether the uncanonicalizer should insert #$forAlls around unquantified variables. */
  @SubL(source = "cycl/czer-vars.lisp", position = 14757) 
  public static SubLSymbol $unremove_universalsP$ = null;

  /** Whether the uncanonicalizer should rephrase sentences in terms of #$was, #$willBe, etc. */
  @SubL(source = "cycl/czer-vars.lisp", position = 14892) 
  public static SubLSymbol $uncanonicalize_tensed_literalsP$ = null;

  /** is an existing assertion being recanonicalized? */
  @SubL(source = "cycl/czer-vars.lisp", position = 15043) 
  public static SubLSymbol $recanonicalizingP$ = null;

  /** used for recursion detection */
  @SubL(source = "cycl/czer-vars.lisp", position = 15201) 
  public static SubLSymbol $recanonicalizing_candidate_assertion_stack$ = null;

  /** whether el-meta should set the value of @xref *recan-ill-formed-meta-args?* */
  @SubL(source = "cycl/czer-vars.lisp", position = 15306) 
  public static SubLSymbol $noting_ill_formed_meta_argsP$ = null;

  /** bound by el-meta when called from the recanonicalizer, so that the recanonicalizer can correctly analyze problems with finding meta assertions (which may be due to uncanonicality). */
  @SubL(source = "cycl/czer-vars.lisp", position = 15444) 
  public static SubLSymbol $recan_ill_formed_meta_argsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 15686) 
  public static SubLSymbol $simplify_sentenceP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 15780) 
  public static SubLSymbol $simplify_literalP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 15827) 
  public static SubLSymbol $simplify_implicationP$ = null;

  /** If t, non-wff literals will be reduced to #$False. */
  @SubL(source = "cycl/czer-vars.lisp", position = 15878) 
  public static SubLSymbol $simplify_non_wff_literalP$ = null;

  /** If t, non-wffs will be simplified to see if they become wff.  This usually only happens with sequence variables. */
  @SubL(source = "cycl/czer-vars.lisp", position = 15986) 
  public static SubLSymbol $try_to_simplify_non_wff_into_wffP$ = null;

  /** transient state variable, t iff we're in the middle of trying to simplify a non-wff into a wff */
  @SubL(source = "cycl/czer-vars.lisp", position = 16164) 
  public static SubLSymbol $trying_to_simplify_non_wff_into_wffP$ = null;

  /** If nil, simplify-cycl-sentence will only perform syntactic simplifications. */
  @SubL(source = "cycl/czer-vars.lisp", position = 16329) 
  public static SubLSymbol $simplify_using_semanticsP$ = null;

  /** If t, simplify-cycl-sentence will look for redundant literals and remove them. */
  @SubL(source = "cycl/czer-vars.lisp", position = 16462) 
  public static SubLSymbol $simplify_redundanciesP$ = null;

  /** If t, simplify-transitive-redundancies will look for transitive redundancies and remove them. */
  @SubL(source = "cycl/czer-vars.lisp", position = 16597) 
  public static SubLSymbol $simplify_transitive_redundanciesP$ = null;

  /** If t, simplify-sequence-vars will use arity information from the KB to eliminate sequence variables or convert them to term variables when possible.  (It will always use the arity of logical operators to simplify.) */
  @SubL(source = "cycl/czer-vars.lisp", position = 16758) 
  public static SubLSymbol $simplify_sequence_vars_using_kb_arityP$ = null;

  /** The maximum number of term variables that a sequence variable can be split into if we're using the arity information to simplify.  If 0 or 1, no splitting will be performed, except that EL relations will always be split, no matter what the split limit is. */
  @SubL(source = "cycl/czer-vars.lisp", position = 17043) 
  public static SubLSymbol $sequence_variable_split_limit$ = null;

  /** If T, the simplifier will simplify #$equalSymbols literals with one variable argument and one bound argument by substituting the binding throughout the conjunction.  WARNING: this may cause scoping problems and has not been fully tested. */
  @SubL(source = "cycl/czer-vars.lisp", position = 17360) 
  public static SubLSymbol $simplify_equal_symbols_literalP$ = null;

  /** If T, the simplifier will be more zealous in simplifying #$trueSentence literals away.  WARNING: This may cause inference problems and has not been fully tested. */
  @SubL(source = "cycl/czer-vars.lisp", position = 17663) 
  public static SubLSymbol $simplify_true_sentence_awayP$ = null;

  /** table of definitions of known skolems */
  @SubL(source = "cycl/czer-vars.lisp", position = 17887) 
  public static SubLSymbol $skolem_axiom_table$ = null;

  /** in the absence of explicit #$isa pos-lits, use applicable arg-isa constraints to infer the #$resultIsa of a skolem? */
  @SubL(source = "cycl/czer-vars.lisp", position = 18028) 
  public static SubLSymbol $infer_skolem_result_isa_via_arg_constraintsP$ = null;

  /** should skolem arg-isa constraints be interpolated into a singleton set? */
  @SubL(source = "cycl/czer-vars.lisp", position = 18223) 
  public static SubLSymbol $interpolate_singleton_arg_isaP$ = null;

  /** should newly-created skolems have #$termDependsOn assertions asserted about them.
   If NIL, we assume that the caller will assert the definitional assertions of the newly-created skolems.
   If T, the czer will assert #$termDependsOn assertions in lieu of having actual definitional assertions.
   This is for use in testing code that calls canonicalize-assert directly. */
  @SubL(source = "cycl/czer-vars.lisp", position = 18362) 
  public static SubLSymbol $clothe_naked_skolemsP$ = null;

  /** predicates for gafs that reference skolem functions that may be computed and asserted by the canonicalizer and may be manually edited */
  @SubL(source = "cycl/czer-vars.lisp", position = 18792) 
  public static SubLSymbol $preds_of_computed_skolem_gafs$ = null;

  /** predicates for gafs that reference skolem functions that may be computed and asserted by the canonicalizer, or the interface time-stamper, or may be manually edited */
  @SubL(source = "cycl/czer-vars.lisp", position = 19154) 
  public static SubLSymbol $preds_of_editable_skolem_gafs$ = null;

  /** skolems having no defining assertions encountered while reinitializing *skolem-axiom-table* */
  @SubL(source = "cycl/czer-vars.lisp", position = 19773) 
  public static SubLSymbol $empty_skolems$ = null;

  /** skolems diagnosed as having problems while reinitializing *skolem-axiom-table* */
  @SubL(source = "cycl/czer-vars.lisp", position = 19913) 
  public static SubLSymbol $mal_skolems$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20037) 
  public static SubLSymbol $express_as_rule_macroP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20141) 
  public static SubLSymbol $express_as_genlsP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20215) 
  public static SubLSymbol $express_as_arg_isaP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20266) 
  public static SubLSymbol $express_as_arg_genlP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20397) 
  public static SubLSymbol $express_as_genl_predicatesP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20456) 
  public static SubLSymbol $express_as_genl_inverseP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20512) 
  public static SubLSymbol $express_as_inter_arg_isaP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20569) 
  public static SubLSymbol $express_as_disjoint_withP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20627) 
  public static SubLSymbol $express_as_negation_predicatesP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20690) 
  public static SubLSymbol $express_as_negation_inverseP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20750) 
  public static SubLSymbol $express_as_reflexiveP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20804) 
  public static SubLSymbol $express_as_symmetricP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20857) 
  public static SubLSymbol $express_as_transitiveP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20911) 
  public static SubLSymbol $express_as_irreflexiveP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 20966) 
  public static SubLSymbol $express_as_asymmetricP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 21020) 
  public static SubLSymbol $express_as_relation_typeP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 21103) 
  public static SubLSymbol $express_as_required_arg_predP$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 21164) 
  public static SubLSymbol $tense_czer_mode$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 21248) 
  private static SubLSymbol $valid_tense_czer_modes$ = null;

  @SubL(source = "cycl/czer-vars.lisp", position = 21322) 
  public static final SubLObject valid_tense_czer_mode_p(SubLObject mode) {
    return list_utilities.member_eqP(mode, $valid_tense_czer_modes$.getGlobalValue());
  }

  public static final SubLObject declare_czer_vars_file() {
    declareFunction(myName, "valid_tense_czer_mode_p", "VALID-TENSE-CZER-MODE-P", 1, 0, false);
    declareFunction(myName, "get_tense_czer_mode", "GET-TENSE-CZER-MODE", 0, 0, false);
    declareFunction(myName, "within_assert_tense_czer_modeP", "WITHIN-ASSERT-TENSE-CZER-MODE?", 0, 0, false);
    declareFunction(myName, "within_query_tense_czer_modeP", "WITHIN-QUERY-TENSE-CZER-MODE?", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_czer_vars_file() {
    $required_arg_preds$ = defparameter("*REQUIRED-ARG-PREDS*", $list0);
    $arg_positions$ = deflexical("*ARG-POSITIONS*", $list1);
    $accumulating_semantic_violationsP$ = defparameter("*ACCUMULATING-SEMANTIC-VIOLATIONS?*", NIL);
    $semantic_violations$ = defparameter("*SEMANTIC-VIOLATIONS*", NIL);
    $assertion_key$ = defparameter("*ASSERTION-KEY*", $sym2$ASSERTION_FORMULA);
    $nart_key$ = defparameter("*NART-KEY*", $sym3$NART_HL_FORMULA);
    $rf_key$ = defparameter("*RF-KEY*", $sym4$RF_FORMULA);
    $implication_operators$ = deflexical("*IMPLICATION-OPERATORS*", $list5);
    $logical_operators$ = deflexical("*LOGICAL-OPERATORS*", $list6);
    $skolem_function_functions$ = deflexical("*SKOLEM-FUNCTION-FUNCTIONS*", $list7);
    $arg_isa_binary_preds$ = deflexical("*ARG-ISA-BINARY-PREDS*", $list8);
    $arg_isa_ternary_preds$ = deflexical("*ARG-ISA-TERNARY-PREDS*", $list9);
    $arg_quoted_isa_binary_preds$ = deflexical("*ARG-QUOTED-ISA-BINARY-PREDS*", $list10);
    $arg_quoted_isa_ternary_preds$ = deflexical("*ARG-QUOTED-ISA-TERNARY-PREDS*", $list11);
    $arg_genl_binary_preds$ = deflexical("*ARG-GENL-BINARY-PREDS*", $list12);
    $arg_genl_ternary_preds$ = deflexical("*ARG-GENL-TERNARY-PREDS*", $list13);
    $arg_format_binary_preds$ = deflexical("*ARG-FORMAT-BINARY-PREDS*", $list14);
    $arg_format_ternary_preds$ = deflexical("*ARG-FORMAT-TERNARY-PREDS*", $list15);
    $meta_arg_type$ = deflexical("*META-ARG-TYPE*", $const16$CycLAssertion);
    $possibly_meta_arg_type$ = deflexical("*POSSIBLY-META-ARG-TYPE*", $const17$CycLIndexedTerm);
    $variables_that_cannot_be_sequence_variables$ = defparameter("*VARIABLES-THAT-CANNOT-BE-SEQUENCE-VARIABLES*", NIL);
    $el_supports_dot_syntaxP$ = defparameter("*EL-SUPPORTS-DOT-SYNTAX?*", T);
    $el_supports_variable_arity_skolemsP$ = deflexical("*EL-SUPPORTS-VARIABLE-ARITY-SKOLEMS?*", T);
    $el_supports_contractionsP$ = defparameter("*EL-SUPPORTS-CONTRACTIONS?*", NIL);
    $inside_quote$ = defvar("*INSIDE-QUOTE*", NIL);
    $new_canonicalizerP$ = defparameter("*NEW-CANONICALIZER?*", NIL);
    $within_canonicalizerP$ = defparameter("*WITHIN-CANONICALIZER?*", NIL);
    $form_of_clausal_form$ = defparameter("*FORM-OF-CLAUSAL-FORM*", NIL);
    $must_enforce_semanticsP$ = defparameter("*MUST-ENFORCE-SEMANTICS?*", NIL);
    $el_trace_level$ = defparameter("*EL-TRACE-LEVEL*", ZERO_INTEGER);
    $canon_verboseP$ = defparameter("*CANON-VERBOSE?*", NIL);
    $varP$ = defparameter("*VAR?*", $sym18$EL_VAR_);
    $subordinate_fi_opsP$ = defparameter("*SUBORDINATE-FI-OPS?*", NIL);
    $cryP$ = defparameter("*CRY?*", T);
    $minimal_skolem_arityP$ = defparameter("*MINIMAL-SKOLEM-ARITY?*", NIL);
    $skolemize_during_asksP$ = defparameter("*SKOLEMIZE-DURING-ASKS?*", NIL);
    $drop_all_existentialsP$ = defparameter("*DROP-ALL-EXISTENTIALS?*", NIL);
    $leave_skolem_constants_aloneP$ = defparameter("*LEAVE-SKOLEM-CONSTANTS-ALONE?*", NIL);
    $forbid_quantified_sequence_variablesP$ = defparameter("*FORBID-QUANTIFIED-SEQUENCE-VARIABLES?*", $kw19$ASSERT_ONLY);
    $use_skolem_constantsP$ = defparameter("*USE-SKOLEM-CONSTANTS?*", NIL);
    $canonicalize_gaf_commutative_termsP$ = defparameter("*CANONICALIZE-GAF-COMMUTATIVE-TERMS?*", T);
    $canon_var_function$ = defparameter("*CANON-VAR-FUNCTION*", $kw20$DEFAULT);
    $canonical_variable_type$ = defparameter("*CANONICAL-VARIABLE-TYPE*", $kw21$KB_VAR);
    $standardize_variables_memory$ = defparameter("*STANDARDIZE-VARIABLES-MEMORY*", NIL);
    $distributing_meta_knowledgeP$ = defparameter("*DISTRIBUTING-META-KNOWLEDGE?*", NIL);
    $distribute_meta_over_common_elP$ = defparameter("*DISTRIBUTE-META-OVER-COMMON-EL?*", T);
    $find_uncanonical_decontextualized_assertionsP$ = defparameter("*FIND-UNCANONICAL-DECONTEXTUALIZED-ASSERTIONS?*", T);
    $canonicalize_el_template_vars_during_queriesP$ = defparameter("*CANONICALIZE-EL-TEMPLATE-VARS-DURING-QUERIES?*", T);
    $robust_assertion_lookup$ = defparameter("*ROBUST-ASSERTION-LOOKUP*", NIL);
    $robust_nart_lookup$ = defparameter("*ROBUST-NART-LOOKUP*", $kw20$DEFAULT);
    $recanonicalizing_candidate_natP$ = defparameter("*RECANONICALIZING-CANDIDATE-NAT?*", NIL);
    $el_var_blist$ = defparameter("*EL-VAR-BLIST*", NIL);
    $gathering_quantified_fn_termsP$ = defparameter("*GATHERING-QUANTIFIED-FN-TERMS?*", NIL);
    $expand_el_relationsP$ = defparameter("*EXPAND-EL-RELATIONS?*", T);
    $canonicalize_all_sentence_argsP$ = defparameter("*CANONICALIZE-ALL-SENTENCE-ARGS?*", NIL);
    $canonicalize_tensed_literalsP$ = defparameter("*CANONICALIZE-TENSED-LITERALS?*", T);
    $add_term_of_unit_litsP$ = defparameter("*ADD-TERM-OF-UNIT-LITS?*", T);
    $turn_existentials_into_skolemsP$ = defparameter("*TURN-EXISTENTIALS-INTO-SKOLEMS?*", T);
    $reify_skolemsP$ = defparameter("*REIFY-SKOLEMS?*", T);
    $create_narts_regardless_of_whether_within_assertP$ = defparameter("*CREATE-NARTS-REGARDLESS-OF-WHETHER-WITHIN-ASSERT?*", NIL);
    $canonicalize_functionsP$ = defparameter("*CANONICALIZE-FUNCTIONS?*", T);
    $canonicalize_termsP$ = defparameter("*CANONICALIZE-TERMS?*", T);
    $canonicalize_literalsP$ = defparameter("*CANONICALIZE-LITERALS?*", T);
    $canonicalize_disjunction_as_enumerationP$ = defparameter("*CANONICALIZE-DISJUNCTION-AS-ENUMERATION?*", NIL);
    $canonicalize_variablesP$ = defparameter("*CANONICALIZE-VARIABLES?*", T);
    $implicitify_universalsP$ = defparameter("*IMPLICITIFY-UNIVERSALS?*", T);
    $assume_free_vars_are_existentially_boundP$ = defparameter("*ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?*", NIL);
    $encapsulate_var_formulaP$ = defparameter("*ENCAPSULATE-VAR-FORMULA?*", T);
    $encapsulate_intensional_formulaP$ = defparameter("*ENCAPSULATE-INTENSIONAL-FORMULA?*", T);
    $czer_quiescence_iteration_limit$ = defparameter("*CZER-QUIESCENCE-ITERATION-LIMIT*", TEN_INTEGER);
    $clause_el_var_names$ = defparameter("*CLAUSE-EL-VAR-NAMES*", NIL);
    $el_symbol_suffix_table$ = defparameter("*EL-SYMBOL-SUFFIX-TABLE*", NIL);
    $within_negationP$ = defparameter("*WITHIN-NEGATION?*", NIL);
    $hl_pred_order$ = deflexical("*HL-PRED-ORDER*", $list22);
    $controlP$ = defparameter("*CONTROL?*", NIL);
    $control_1$ = defparameter("*CONTROL-1*", NIL);
    $control_2$ = defparameter("*CONTROL-2*", NIL);
    $control_3$ = defparameter("*CONTROL-3*", NIL);
    $control_4$ = defparameter("*CONTROL-4*", NIL);
    $control_5$ = defparameter("*CONTROL-5*", NIL);
    $control_6$ = defparameter("*CONTROL-6*", NIL);
    $control_ecaP$ = defparameter("*CONTROL-ECA?*", NIL);
    $czer_memoization_state$ = defparameter("*CZER-MEMOIZATION-STATE*", NIL);
    $use_czer_fort_typesP$ = defparameter("*USE-CZER-FORT-TYPES?*", T);
    $use_czer_fort_types_globallyP$ = defparameter("*USE-CZER-FORT-TYPES-GLOBALLY?*", T);
    $canonicalizer_directive_predicates$ = deflexical("*CANONICALIZER-DIRECTIVE-PREDICATES*", $list23);
    $ununiquify_el_varsP$ = defparameter("*UNUNIQUIFY-EL-VARS?*", NIL);
    $unremove_universalsP$ = defparameter("*UNREMOVE-UNIVERSALS?*", T);
    $uncanonicalize_tensed_literalsP$ = defparameter("*UNCANONICALIZE-TENSED-LITERALS?*", T);
    $recanonicalizingP$ = defparameter("*RECANONICALIZING?*", NIL);
    $recanonicalizing_candidate_assertion_stack$ = defparameter("*RECANONICALIZING-CANDIDATE-ASSERTION-STACK*", NIL);
    $noting_ill_formed_meta_argsP$ = defparameter("*NOTING-ILL-FORMED-META-ARGS?*", NIL);
    $recan_ill_formed_meta_argsP$ = defparameter("*RECAN-ILL-FORMED-META-ARGS?*", NIL);
    $simplify_sentenceP$ = defparameter("*SIMPLIFY-SENTENCE?*", T);
    $simplify_literalP$ = defparameter("*SIMPLIFY-LITERAL?*", T);
    $simplify_implicationP$ = defparameter("*SIMPLIFY-IMPLICATION?*", T);
    $simplify_non_wff_literalP$ = defparameter("*SIMPLIFY-NON-WFF-LITERAL?*", T);
    $try_to_simplify_non_wff_into_wffP$ = defparameter("*TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", T);
    $trying_to_simplify_non_wff_into_wffP$ = defparameter("*TRYING-TO-SIMPLIFY-NON-WFF-INTO-WFF?*", NIL);
    $simplify_using_semanticsP$ = defparameter("*SIMPLIFY-USING-SEMANTICS?*", T);
    $simplify_redundanciesP$ = defparameter("*SIMPLIFY-REDUNDANCIES?*", NIL);
    $simplify_transitive_redundanciesP$ = defparameter("*SIMPLIFY-TRANSITIVE-REDUNDANCIES?*", NIL);
    $simplify_sequence_vars_using_kb_arityP$ = defparameter("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*", T);
    $sequence_variable_split_limit$ = defparameter("*SEQUENCE-VARIABLE-SPLIT-LIMIT*", FIVE_INTEGER);
    $simplify_equal_symbols_literalP$ = defparameter("*SIMPLIFY-EQUAL-SYMBOLS-LITERAL?*", NIL);
    $simplify_true_sentence_awayP$ = defparameter("*SIMPLIFY-TRUE-SENTENCE-AWAY?*", NIL);
    $skolem_axiom_table$ = deflexical("*SKOLEM-AXIOM-TABLE*", maybeDefault( $sym24$_SKOLEM_AXIOM_TABLE_, $skolem_axiom_table$, ()-> (Hashtables.make_hash_table($int25$2048, Symbols.symbol_function(EQUAL), UNPROVIDED))));
    $infer_skolem_result_isa_via_arg_constraintsP$ = defparameter("*INFER-SKOLEM-RESULT-ISA-VIA-ARG-CONSTRAINTS?*", T);
    $interpolate_singleton_arg_isaP$ = defparameter("*INTERPOLATE-SINGLETON-ARG-ISA?*", NIL);
    $clothe_naked_skolemsP$ = defparameter("*CLOTHE-NAKED-SKOLEMS?*", NIL);
    $preds_of_computed_skolem_gafs$ = defparameter("*PREDS-OF-COMPUTED-SKOLEM-GAFS*", $list26);
    $preds_of_editable_skolem_gafs$ = deflexical("*PREDS-OF-EDITABLE-SKOLEM-GAFS*", ConsesLow.append(new SubLObject[] {$list27, $arg_isa_binary_preds$.getGlobalValue(), $arg_isa_ternary_preds$.getGlobalValue(), $arg_quoted_isa_binary_preds$.getGlobalValue(), $arg_quoted_isa_ternary_preds$.getGlobalValue(), $list28}));
    $empty_skolems$ = defparameter("*EMPTY-SKOLEMS*", NIL);
    $mal_skolems$ = defparameter("*MAL-SKOLEMS*", NIL);
    $express_as_rule_macroP$ = defparameter("*EXPRESS-AS-RULE-MACRO?*", NIL);
    $express_as_genlsP$ = defparameter("*EXPRESS-AS-GENLS?*", NIL);
    $express_as_arg_isaP$ = defparameter("*EXPRESS-AS-ARG-ISA?*", NIL);
    $express_as_arg_genlP$ = defparameter("*EXPRESS-AS-ARG-GENL?*", NIL);
    $express_as_genl_predicatesP$ = defparameter("*EXPRESS-AS-GENL-PREDICATES?*", NIL);
    $express_as_genl_inverseP$ = defparameter("*EXPRESS-AS-GENL-INVERSE?*", NIL);
    $express_as_inter_arg_isaP$ = defparameter("*EXPRESS-AS-INTER-ARG-ISA?*", NIL);
    $express_as_disjoint_withP$ = defparameter("*EXPRESS-AS-DISJOINT-WITH?*", NIL);
    $express_as_negation_predicatesP$ = defparameter("*EXPRESS-AS-NEGATION-PREDICATES?*", NIL);
    $express_as_negation_inverseP$ = defparameter("*EXPRESS-AS-NEGATION-INVERSE?*", NIL);
    $express_as_reflexiveP$ = defparameter("*EXPRESS-AS-REFLEXIVE?*", NIL);
    $express_as_symmetricP$ = defparameter("*EXPRESS-AS-SYMMETRIC?*", NIL);
    $express_as_transitiveP$ = defparameter("*EXPRESS-AS-TRANSITIVE?*", NIL);
    $express_as_irreflexiveP$ = defparameter("*EXPRESS-AS-IRREFLEXIVE?*", NIL);
    $express_as_asymmetricP$ = defparameter("*EXPRESS-AS-ASYMMETRIC?*", NIL);
    $express_as_relation_typeP$ = defparameter("*EXPRESS-AS-RELATION-TYPE?*", NIL);
    $express_as_required_arg_predP$ = defparameter("*EXPRESS-AS-REQUIRED-ARG-PRED?*", NIL);
    $tense_czer_mode$ = defparameter("*TENSE-CZER-MODE*", $kw20$DEFAULT);
    $valid_tense_czer_modes$ = deflexical("*VALID-TENSE-CZER-MODES*", $list29);
    return NIL;
  }

  public static final SubLObject setup_czer_vars_file() {
    // CVS_ID("Id: czer-vars.lisp 127691 2009-04-21 15:59:50Z pace ");
    subl_macro_promotions.declare_defglobal($sym24$_SKOLEM_AXIOM_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(constant_handles.reader_make_constant_shell(makeString("requiredArg1Pred")), constant_handles.reader_make_constant_shell(makeString("requiredArg2Pred")));
  public static final SubLList $list1 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);
  public static final SubLSymbol $sym2$ASSERTION_FORMULA = makeSymbol("ASSERTION-FORMULA");
  public static final SubLSymbol $sym3$NART_HL_FORMULA = makeSymbol("NART-HL-FORMULA");
  public static final SubLSymbol $sym4$RF_FORMULA = makeSymbol("RF-FORMULA");
  public static final SubLList $list5 = list(constant_handles.reader_make_constant_shell(makeString("implies")));
  public static final SubLList $list6 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("not")), constant_handles.reader_make_constant_shell(makeString("or")), constant_handles.reader_make_constant_shell(makeString("xor")), constant_handles.reader_make_constant_shell(makeString("and")), constant_handles.reader_make_constant_shell(makeString("equiv")), constant_handles.reader_make_constant_shell(makeString("implies")), constant_handles.reader_make_constant_shell(makeString("exceptFor")), constant_handles.reader_make_constant_shell(makeString("exceptWhen")), constant_handles.reader_make_constant_shell(makeString("forAll")), constant_handles.reader_make_constant_shell(makeString("thereExists")), constant_handles.reader_make_constant_shell(makeString("thereExistExactly")), constant_handles.reader_make_constant_shell(makeString("thereExistAtLeast")), constant_handles.reader_make_constant_shell(makeString("thereExistAtMost"))});
  public static final SubLList $list7 = list(constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn")), constant_handles.reader_make_constant_shell(makeString("SkolemFuncNFn")));
  public static final SubLList $list8 = list(constant_handles.reader_make_constant_shell(makeString("arg1Isa")), constant_handles.reader_make_constant_shell(makeString("arg2Isa")), constant_handles.reader_make_constant_shell(makeString("arg3Isa")), constant_handles.reader_make_constant_shell(makeString("arg4Isa")), constant_handles.reader_make_constant_shell(makeString("arg5Isa")), constant_handles.reader_make_constant_shell(makeString("arg6Isa")), constant_handles.reader_make_constant_shell(makeString("argsIsa")));
  public static final SubLList $list9 = list(constant_handles.reader_make_constant_shell(makeString("argIsa")), constant_handles.reader_make_constant_shell(makeString("argAndRestIsa")));
  public static final SubLList $list10 = list(constant_handles.reader_make_constant_shell(makeString("arg1QuotedIsa")), constant_handles.reader_make_constant_shell(makeString("arg2QuotedIsa")), constant_handles.reader_make_constant_shell(makeString("arg3QuotedIsa")), constant_handles.reader_make_constant_shell(makeString("arg4QuotedIsa")), constant_handles.reader_make_constant_shell(makeString("arg5QuotedIsa")), constant_handles.reader_make_constant_shell(makeString("arg6QuotedIsa")), constant_handles.reader_make_constant_shell(makeString("argsQuotedIsa")));
  public static final SubLList $list11 = list(constant_handles.reader_make_constant_shell(makeString("argQuotedIsa")), constant_handles.reader_make_constant_shell(makeString("argAndRestQuotedIsa")));
  public static final SubLList $list12 = list(constant_handles.reader_make_constant_shell(makeString("arg1Genl")), constant_handles.reader_make_constant_shell(makeString("arg2Genl")), constant_handles.reader_make_constant_shell(makeString("argsGenl")), constant_handles.reader_make_constant_shell(makeString("arg3Genl")), constant_handles.reader_make_constant_shell(makeString("arg4Genl")), constant_handles.reader_make_constant_shell(makeString("arg5Genl")), constant_handles.reader_make_constant_shell(makeString("arg6Genl")));
  public static final SubLList $list13 = list(constant_handles.reader_make_constant_shell(makeString("argGenl")), constant_handles.reader_make_constant_shell(makeString("argAndRestGenl")));
  public static final SubLList $list14 = list(constant_handles.reader_make_constant_shell(makeString("arg1Format")), constant_handles.reader_make_constant_shell(makeString("arg2Format")), constant_handles.reader_make_constant_shell(makeString("arg3Format")), constant_handles.reader_make_constant_shell(makeString("arg4Format")), constant_handles.reader_make_constant_shell(makeString("arg5Format")), constant_handles.reader_make_constant_shell(makeString("arg6Format")));
  public static final SubLList $list15 = list(constant_handles.reader_make_constant_shell(makeString("argFormat")));
  public static final SubLObject $const16$CycLAssertion = constant_handles.reader_make_constant_shell(makeString("CycLAssertion"));
  public static final SubLObject $const17$CycLIndexedTerm = constant_handles.reader_make_constant_shell(makeString("CycLIndexedTerm"));
  public static final SubLSymbol $sym18$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $kw19$ASSERT_ONLY = makeKeyword("ASSERT-ONLY");
  public static final SubLSymbol $kw20$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw21$KB_VAR = makeKeyword("KB-VAR");
  public static final SubLList $list22 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLList $list23 = list(constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArg")), constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForAllArgs")), constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArgAndRest")));
  public static final SubLSymbol $sym24$_SKOLEM_AXIOM_TABLE_ = makeSymbol("*SKOLEM-AXIOM-TABLE*");
  public static final SubLInteger $int25$2048 = makeInteger(2048);
  public static final SubLList $list26 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("arity")), constant_handles.reader_make_constant_shell(makeString("arityMin")), constant_handles.reader_make_constant_shell(makeString("arityMax")), constant_handles.reader_make_constant_shell(makeString("resultIsa")), constant_handles.reader_make_constant_shell(makeString("resultGenl")), constant_handles.reader_make_constant_shell(makeString("resultIsaArg")), constant_handles.reader_make_constant_shell(makeString("resultGenlArg")), constant_handles.reader_make_constant_shell(makeString("arg1Isa")), constant_handles.reader_make_constant_shell(makeString("arg2Isa")), constant_handles.reader_make_constant_shell(makeString("arg3Isa")), constant_handles.reader_make_constant_shell(makeString("arg4Isa")), constant_handles.reader_make_constant_shell(makeString("arg5Isa")), constant_handles.reader_make_constant_shell(makeString("arg6Isa"))});
  public static final SubLList $list27 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("arity")), constant_handles.reader_make_constant_shell(makeString("arityMin")), constant_handles.reader_make_constant_shell(makeString("arityMax")), constant_handles.reader_make_constant_shell(makeString("resultIsa")), constant_handles.reader_make_constant_shell(makeString("resultGenl")), constant_handles.reader_make_constant_shell(makeString("resultIsaArg")), constant_handles.reader_make_constant_shell(makeString("resultGenlArg")), constant_handles.reader_make_constant_shell(makeString("resultQuotedIsa")), constant_handles.reader_make_constant_shell(makeString("evaluationResultQuotedIsa"))});
  public static final SubLList $list28 = list(constant_handles.reader_make_constant_shell(makeString("myCreator")), constant_handles.reader_make_constant_shell(makeString("myCreationTime")), constant_handles.reader_make_constant_shell(makeString("myCreationSecond")), constant_handles.reader_make_constant_shell(makeString("comment")), constant_handles.reader_make_constant_shell(makeString("sharedNotes")), constant_handles.reader_make_constant_shell(makeString("skolemizeForward")));
  public static final SubLList $list29 = list(makeKeyword("DEFAULT"), makeKeyword("QUERY"), makeKeyword("ASSERT"));
  public static final SubLSymbol $kw30$ASSERT = makeKeyword("ASSERT");
  public static final SubLSymbol $kw31$QUERY = makeKeyword("QUERY");
  public static final SubLString $str32$Canonicalizer_tense_mode_not_set_ = makeString("Canonicalizer tense mode not set.");

  //// Initializers

  public void declareFunctions() {
    declare_czer_vars_file();
  }

  public void initializeVariables() {
    init_czer_vars_file();
  }

  public void runTopLevelForms() {
    setup_czer_vars_file();
  }

}
