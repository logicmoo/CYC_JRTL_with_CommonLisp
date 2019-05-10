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
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class mt_vars extends SubLTranslatedFile {

  //// Constructor

  private mt_vars() {}
  public static final SubLFile me = new mt_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.mt_vars";

  //// Definitions

  @SubL(source = "cycl/mt-vars.lisp", position = 858) 
  public static SubLSymbol $mt_var_basis_table$ = null;

  @SubL(source = "cycl/mt-vars.lisp", position = 1679) 
  public static final SubLObject note_mt_var(SubLObject var, SubLObject basis) {
    if ((basis == UNPROVIDED)) {
      basis = NIL;
    }
    if ((NIL != basis)) {
      note_mt_var_basis(var, basis);
    }
    return NIL;
  }

  @SubL(source = "cycl/mt-vars.lisp", position = 1863) 
  public static final SubLObject note_mt_var_basis(SubLObject var, SubLObject basis) {
    return dictionary.dictionary_enter($mt_var_basis_table$.getGlobalValue(), var, basis);
  }

  /** The root of the microtheory hierarchy */
  @SubL(source = "cycl/mt-vars.lisp", position = 1969) 
  public static SubLSymbol $mt_root$ = null;

  /** The highest theory microtheory where assertions/deductions could possibly go */
  @SubL(source = "cycl/mt-vars.lisp", position = 2099) 
  public static SubLSymbol $theory_mt_root$ = null;

  /** The highest microtheory where assertions can normally be made */
  @SubL(source = "cycl/mt-vars.lisp", position = 2259) 
  public static SubLSymbol $assertible_mt_root$ = null;

  /** The highest theory microtheory where assertions can normally be made */
  @SubL(source = "cycl/mt-vars.lisp", position = 2400) 
  public static SubLSymbol $assertible_theory_mt_root$ = null;

  /** The minimum (lowest) core microtheory. */
  @SubL(source = "cycl/mt-vars.lisp", position = 2559) 
  public static SubLSymbol $core_mt_floor$ = null;

  /** The microtheory in which microtheories are asserted to be instances of #$Microtheory,
and the microtheory where #$genlMt assertions go. */
  @SubL(source = "cycl/mt-vars.lisp", position = 2673) 
  public static SubLSymbol $mt_mt$ = null;

  /** The microtheory where #$definingMt assertions go.  Should be the same as the *mt-mt* */
  @SubL(source = "cycl/mt-vars.lisp", position = 3218) 
  public static SubLSymbol $defining_mt_mt$ = null;

  /** The microtheory where #$decontextualizedPredicate assertions go */
  @SubL(source = "cycl/mt-vars.lisp", position = 3389) 
  public static SubLSymbol $decontextualized_predicate_mt$ = null;

  /** The microtheory where #$decontextualizedCollection assertions go */
  @SubL(source = "cycl/mt-vars.lisp", position = 3545) 
  public static SubLSymbol $decontextualized_collection_mt$ = null;

  /** The microtheory where #$ephemeralTerm gafs go. */
  @SubL(source = "cycl/mt-vars.lisp", position = 3704) 
  public static SubLSymbol $ephemeral_term_mt$ = null;

  /** The microtheory where #$ist code supports are supported from.
It would be the microtheory where #$ist gafs would go, but those shouldn't really be in the KB at all. */
  @SubL(source = "cycl/mt-vars.lisp", position = 3819) 
  public static SubLSymbol $ist_mt$ = null;

  /** The microtheory where isa assertions to #$InferenceRelatedBookkeepingPredicate go. */
  @SubL(source = "cycl/mt-vars.lisp", position = 4070) 
  public static SubLSymbol $inference_related_bookkeeping_predicate_mt$ = null;

  /** The mt where isas to instances of #$AtemporalNecessarilyEssentialCollectionType go.
Note that this includes #$AtemporalNecessarilyEssentialCollectionType itself,
and the code assumes that these mts are the same. */
  @SubL(source = "cycl/mt-vars.lisp", position = 4307) 
  public static SubLSymbol $anect_mt$ = null;

  /** The microtheory where isa assertions to #$BroadMicrotheory go. */
  @SubL(source = "cycl/mt-vars.lisp", position = 4670) 
  public static SubLSymbol $broad_mt_mt$ = null;

  /** The microtheory where isa assertions to #$ProblemSolvingCntxt go. */
  @SubL(source = "cycl/mt-vars.lisp", position = 4822) 
  public static SubLSymbol $psc_mt$ = null;

  /** The microtheory where #$termOfUnit assertions go */
  @SubL(source = "cycl/mt-vars.lisp", position = 4951) 
  public static SubLSymbol $tou_mt$ = null;

  /** The microtheory where #$skolem assertions go */
  @SubL(source = "cycl/mt-vars.lisp", position = 5122) 
  public static SubLSymbol $skolem_mt$ = null;

  /** The microtheory where #$Thing is defined */
  @SubL(source = "cycl/mt-vars.lisp", position = 5220) 
  public static SubLSymbol $thing_defining_mt$ = null;

  /** The microtheory where #$Relation is defined */
  @SubL(source = "cycl/mt-vars.lisp", position = 5362) 
  public static SubLSymbol $relation_defining_mt$ = null;

  /** The microtheory where #$equals is defined */
  @SubL(source = "cycl/mt-vars.lisp", position = 5490) 
  public static SubLSymbol $equals_defining_mt$ = null;

  @SubL(source = "cycl/mt-vars.lisp", position = 5616) 
  public static SubLSymbol $element_of_defining_mt$ = null;

  @SubL(source = "cycl/mt-vars.lisp", position = 5738) 
  public static SubLSymbol $subset_of_defining_mt$ = null;

  /** The microtheory where #$arity assertions go */
  @SubL(source = "cycl/mt-vars.lisp", position = 5855) 
  public static SubLSymbol $arity_mt$ = null;

  /** The microtheory from which #$subLIdentifier and #$uniquelyIdentifiedInType assertions should be visisble. */
  @SubL(source = "cycl/mt-vars.lisp", position = 6053) 
  public static SubLSymbol $sublid_mt$ = null;

  /** The microtheory where #$notAssertibleMt assertions go */
  @SubL(source = "cycl/mt-vars.lisp", position = 6220) 
  public static SubLSymbol $not_assertible_mt_convention_mt$ = null;

  /** The default mt for asks */
  @SubL(source = "cycl/mt-vars.lisp", position = 6371) 
  public static SubLSymbol $default_ask_mt$ = null;

  /** The default mt for asserts */
  @SubL(source = "cycl/mt-vars.lisp", position = 6482) 
  public static SubLSymbol $default_assert_mt$ = null;

  /** The default mt for cloning sentences -- should be the common genl of the above two */
  @SubL(source = "cycl/mt-vars.lisp", position = 6564) 
  public static SubLSymbol $default_clone_mt$ = null;

  /** The default mt for HL supports -- one should be specified, but this is what to use as a backup */
  @SubL(source = "cycl/mt-vars.lisp", position = 6702) 
  public static SubLSymbol $default_support_mt$ = null;

  /** The default mt for asserting comments and cyclistNotes. */
  @SubL(source = "cycl/mt-vars.lisp", position = 6852) 
  public static SubLSymbol $default_comment_mt$ = null;

  /** The default mt for the convention mt of a decontextualized predicate or collection, to use if none is specified in the KB */
  @SubL(source = "cycl/mt-vars.lisp", position = 6963) 
  public static SubLSymbol $default_convention_mt$ = null;

  /** Temporary control variable ; controls whether or not genlMt has special-case
   optimization for core-microtheory-p */
  @SubL(source = "cycl/mt-vars.lisp", position = 7269) 
  public static SubLSymbol $core_mt_optimization_enabledP$ = null;

  /** The cluster of mts up near the root of the microtheory hierarchy.  Ordered from max (topmost) to min (lowest). */
  @SubL(source = "cycl/mt-vars.lisp", position = 7551) 
  private static SubLSymbol $core_mts$ = null;

  /** The cluster of mts up near the root of the microtheory hierarchy. Min numbered is topmost. */
  @SubL(source = "cycl/mt-vars.lisp", position = 8332) 
  private static SubLSymbol $ordered_core_mts$ = null;

  /** Return T iff OBJECT is a core microtheory. */
  @SubL(source = "cycl/mt-vars.lisp", position = 8700) 
  public static final SubLObject core_microtheory_p(SubLObject object) {
    return list_utilities.member_eqP(object, $core_mts$.getGlobalValue());
  }

  public static final class $core_microtheory_p$UnaryFunction extends UnaryFunction {
    public $core_microtheory_p$UnaryFunction() { super(extractFunctionNamed("CORE-MICROTHEORY-P")); }
    public SubLObject processItem(SubLObject arg1) { return core_microtheory_p(arg1); }
  }

  /** Return T iff core microtheory MT1 is lower than MT2 in the #$genlMt hierarchy. */
  @SubL(source = "cycl/mt-vars.lisp", position = 8834) 
  public static final SubLObject core_microtheory_L(SubLObject mt1, SubLObject mt2) {
    {
      SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
      SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
      if ((level1.isInteger()
           && level2.isInteger())) {
        return Numbers.numLE(level2, level1);
      }
    }
    return NIL;
  }

  /** Return T iff core microtheory MT1 is higher than MT2 in the #$genlMt hierarchy. */
  @SubL(source = "cycl/mt-vars.lisp", position = 9201) 
  public static final SubLObject core_microtheory_G(SubLObject mt1, SubLObject mt2) {
    {
      SubLObject level1 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED);
      SubLObject level2 = list_utilities.alist_lookup_without_values($ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED);
      if ((level1.isInteger()
           && level2.isInteger())) {
        return Numbers.numLE(level1, level2);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/mt-vars.lisp", position = 9569) 
  public static final SubLObject core_genl_mtP(SubLObject mt1, SubLObject mt2) {
    if (((NIL != special_core_loop_mt_p(mt1))
         && (NIL != special_core_loop_mt_p(mt2)))) {
      return T;
    } else {
      return core_microtheory_G(mt1, mt2);
    }
  }

  @SubL(source = "cycl/mt-vars.lisp", position = 9932) 
  private static SubLSymbol $special_loop_core_mts$ = null;

  @SubL(source = "cycl/mt-vars.lisp", position = 10018) 
  public static final SubLObject special_core_loop_mt_p(SubLObject object) {
    return list_utilities.member_eqP(object, $special_loop_core_mts$.getGlobalValue());
  }

  public static final class $special_core_loop_mt_p$UnaryFunction extends UnaryFunction {
    public $special_core_loop_mt_p$UnaryFunction() { super(extractFunctionNamed("SPECIAL-CORE-LOOP-MT-P")); }
    public SubLObject processItem(SubLObject arg1) { return special_core_loop_mt_p(arg1); }
  }

  /** Reduces MTS by eliminating any core microtheories that are proper genlMt of microtheories in MTS. */
  @SubL(source = "cycl/mt-vars.lisp", position = 10122) 
  public static final SubLObject minimize_mts_wrt_core(SubLObject mts) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject core_mts = list_utilities.partition_list(mts, $sym63$CORE_MICROTHEORY_P);
        SubLObject non_core_mts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != non_core_mts)) {
          return non_core_mts;
        } else {
          {
            SubLObject min_core_mt = list_utilities.extremal(core_mts, $sym64$CORE_MICROTHEORY__, UNPROVIDED);
            return removal_module_utilities.non_null_answer_to_singleton(min_core_mt);
          }
        }
      }
    }
  }

  /** Reduces MTS by eliminating any non-core mts if there are any core mts,
   and then taking the maximal core mt. */
  @SubL(source = "cycl/mt-vars.lisp", position = 10530) 
  public static final SubLObject maximize_mts_wrt_core(SubLObject mts) {
    {
      SubLObject core_mts = list_utilities.remove_if_not($sym63$CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != core_mts)) {
        {
          SubLObject max_core_mt = list_utilities.extremal(core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED);
          return list(max_core_mt);
        }
      } else {
        return mts;
      }
    }
  }

  /** Reduces mts in MT-SETS by eliminating any proper genlMts of core microtheories in each element of MT-SETS. */
  @SubL(source = "cycl/mt-vars.lisp", position = 10905) 
  public static final SubLObject minimize_mt_sets_wrt_core(SubLObject mt_sets) {
    {
      SubLObject reduced_mt_sets = NIL;
      SubLObject cdolist_list_var = mt_sets;
      SubLObject mt_set = NIL;
      for (mt_set = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt_set = cdolist_list_var.first()) {
        {
          SubLObject reduced_mt_set = minimize_mts_wrt_core(mt_set);
          SubLObject item_var = reduced_mt_set;
          if ((NIL == conses_high.member(item_var, reduced_mt_sets, Symbols.symbol_function($sym66$SETS_EQUAL_), Symbols.symbol_function(IDENTITY)))) {
            reduced_mt_sets = cons(item_var, reduced_mt_sets);
          }
        }
      }
      return Sequences.nreverse(reduced_mt_sets);
    }
  }

  public static final SubLObject declare_mt_vars_file() {
    declareMacro(myName, "defglobal_mt_var", "DEFGLOBAL-MT-VAR");
    declareFunction(myName, "note_mt_var", "NOTE-MT-VAR", 1, 1, false);
    declareFunction(myName, "note_mt_var_basis", "NOTE-MT-VAR-BASIS", 2, 0, false);
    declareFunction(myName, "mt_mt_relevantP", "MT-MT-RELEVANT?", 1, 0, false);
    declareFunction(myName, "core_microtheory_p", "CORE-MICROTHEORY-P", 1, 0, false); new $core_microtheory_p$UnaryFunction();
    declareFunction(myName, "core_microtheory_L", "CORE-MICROTHEORY-<", 2, 0, false);
    declareFunction(myName, "core_microtheory_G", "CORE-MICROTHEORY->", 2, 0, false);
    declareFunction(myName, "core_genl_mtP", "CORE-GENL-MT?", 2, 0, false);
    declareFunction(myName, "core_any_genl_mtP", "CORE-ANY-GENL-MT?", 2, 0, false);
    declareFunction(myName, "special_core_loop_mt_p", "SPECIAL-CORE-LOOP-MT-P", 1, 0, false); new $special_core_loop_mt_p$UnaryFunction();
    declareFunction(myName, "minimize_mts_wrt_core", "MINIMIZE-MTS-WRT-CORE", 1, 0, false);
    declareFunction(myName, "maximize_mts_wrt_core", "MAXIMIZE-MTS-WRT-CORE", 1, 0, false);
    declareFunction(myName, "minimize_mt_sets_wrt_core", "MINIMIZE-MT-SETS-WRT-CORE", 1, 0, false);
    declareFunction(myName, "push_core_mts_to_beginning", "PUSH-CORE-MTS-TO-BEGINNING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_mt_vars_file() {
    $mt_var_basis_table$ = deflexical("*MT-VAR-BASIS-TABLE*", dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED));
    $mt_root$ = deflexical("*MT-ROOT*", ((NIL != Symbols.boundp($sym6$_MT_ROOT_)) ? ((SubLObject) $mt_root$.getGlobalValue()) : $const7$BaseKB));
    $theory_mt_root$ = deflexical("*THEORY-MT-ROOT*", ((NIL != Symbols.boundp($sym8$_THEORY_MT_ROOT_)) ? ((SubLObject) $theory_mt_root$.getGlobalValue()) : $const7$BaseKB));
    $assertible_mt_root$ = deflexical("*ASSERTIBLE-MT-ROOT*", ((NIL != Symbols.boundp($sym9$_ASSERTIBLE_MT_ROOT_)) ? ((SubLObject) $assertible_mt_root$.getGlobalValue()) : $const7$BaseKB));
    $assertible_theory_mt_root$ = deflexical("*ASSERTIBLE-THEORY-MT-ROOT*", ((NIL != Symbols.boundp($sym10$_ASSERTIBLE_THEORY_MT_ROOT_)) ? ((SubLObject) $assertible_theory_mt_root$.getGlobalValue()) : $const7$BaseKB));
    $core_mt_floor$ = deflexical("*CORE-MT-FLOOR*", ((NIL != Symbols.boundp($sym11$_CORE_MT_FLOOR_)) ? ((SubLObject) $core_mt_floor$.getGlobalValue()) : $const7$BaseKB));
    $mt_mt$ = deflexical("*MT-MT*", ((NIL != Symbols.boundp($sym12$_MT_MT_)) ? ((SubLObject) $mt_mt$.getGlobalValue()) : $const13$UniversalVocabularyMt));
    $defining_mt_mt$ = deflexical("*DEFINING-MT-MT*", ((NIL != Symbols.boundp($sym15$_DEFINING_MT_MT_)) ? ((SubLObject) $defining_mt_mt$.getGlobalValue()) : $const7$BaseKB));
    $decontextualized_predicate_mt$ = deflexical("*DECONTEXTUALIZED-PREDICATE-MT*", ((NIL != Symbols.boundp($sym17$_DECONTEXTUALIZED_PREDICATE_MT_)) ? ((SubLObject) $decontextualized_predicate_mt$.getGlobalValue()) : $const7$BaseKB));
    $decontextualized_collection_mt$ = deflexical("*DECONTEXTUALIZED-COLLECTION-MT*", ((NIL != Symbols.boundp($sym19$_DECONTEXTUALIZED_COLLECTION_MT_)) ? ((SubLObject) $decontextualized_collection_mt$.getGlobalValue()) : $const7$BaseKB));
    $ephemeral_term_mt$ = deflexical("*EPHEMERAL-TERM-MT*", ((NIL != Symbols.boundp($sym21$_EPHEMERAL_TERM_MT_)) ? ((SubLObject) $ephemeral_term_mt$.getGlobalValue()) : $const7$BaseKB));
    $ist_mt$ = deflexical("*IST-MT*", ((NIL != Symbols.boundp($sym23$_IST_MT_)) ? ((SubLObject) $ist_mt$.getGlobalValue()) : $const7$BaseKB));
    $inference_related_bookkeeping_predicate_mt$ = deflexical("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*", ((NIL != Symbols.boundp($sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_)) ? ((SubLObject) $inference_related_bookkeeping_predicate_mt$.getGlobalValue()) : $const7$BaseKB));
    $anect_mt$ = deflexical("*ANECT-MT*", ((NIL != Symbols.boundp($sym27$_ANECT_MT_)) ? ((SubLObject) $anect_mt$.getGlobalValue()) : $const13$UniversalVocabularyMt));
    $broad_mt_mt$ = deflexical("*BROAD-MT-MT*", ((NIL != Symbols.boundp($sym29$_BROAD_MT_MT_)) ? ((SubLObject) $broad_mt_mt$.getGlobalValue()) : $const7$BaseKB));
    $psc_mt$ = deflexical("*PSC-MT*", ((NIL != Symbols.boundp($sym31$_PSC_MT_)) ? ((SubLObject) $psc_mt$.getGlobalValue()) : $const7$BaseKB));
    $tou_mt$ = deflexical("*TOU-MT*", ((NIL != Symbols.boundp($sym33$_TOU_MT_)) ? ((SubLObject) $tou_mt$.getGlobalValue()) : $const7$BaseKB));
    $skolem_mt$ = deflexical("*SKOLEM-MT*", ((NIL != Symbols.boundp($sym35$_SKOLEM_MT_)) ? ((SubLObject) $skolem_mt$.getGlobalValue()) : $const7$BaseKB));
    $thing_defining_mt$ = deflexical("*THING-DEFINING-MT*", ((NIL != Symbols.boundp($sym37$_THING_DEFINING_MT_)) ? ((SubLObject) $thing_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $relation_defining_mt$ = deflexical("*RELATION-DEFINING-MT*", ((NIL != Symbols.boundp($sym39$_RELATION_DEFINING_MT_)) ? ((SubLObject) $relation_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $equals_defining_mt$ = deflexical("*EQUALS-DEFINING-MT*", ((NIL != Symbols.boundp($sym41$_EQUALS_DEFINING_MT_)) ? ((SubLObject) $equals_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $element_of_defining_mt$ = deflexical("*ELEMENT-OF-DEFINING-MT*", ((NIL != Symbols.boundp($sym43$_ELEMENT_OF_DEFINING_MT_)) ? ((SubLObject) $element_of_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $subset_of_defining_mt$ = deflexical("*SUBSET-OF-DEFINING-MT*", ((NIL != Symbols.boundp($sym45$_SUBSET_OF_DEFINING_MT_)) ? ((SubLObject) $subset_of_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $arity_mt$ = deflexical("*ARITY-MT*", ((NIL != Symbols.boundp($sym47$_ARITY_MT_)) ? ((SubLObject) $arity_mt$.getGlobalValue()) : $const13$UniversalVocabularyMt));
    $sublid_mt$ = deflexical("*SUBLID-MT*", ((NIL != Symbols.boundp($sym49$_SUBLID_MT_)) ? ((SubLObject) $sublid_mt$.getGlobalValue()) : $const50$CycAPIMt));
    $not_assertible_mt_convention_mt$ = deflexical("*NOT-ASSERTIBLE-MT-CONVENTION-MT*", ((NIL != Symbols.boundp($sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_)) ? ((SubLObject) $not_assertible_mt_convention_mt$.getGlobalValue()) : $const13$UniversalVocabularyMt));
    $default_ask_mt$ = deflexical("*DEFAULT-ASK-MT*", ((NIL != Symbols.boundp($sym54$_DEFAULT_ASK_MT_)) ? ((SubLObject) $default_ask_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_assert_mt$ = deflexical("*DEFAULT-ASSERT-MT*", ((NIL != Symbols.boundp($sym55$_DEFAULT_ASSERT_MT_)) ? ((SubLObject) $default_assert_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_clone_mt$ = deflexical("*DEFAULT-CLONE-MT*", ((NIL != Symbols.boundp($sym56$_DEFAULT_CLONE_MT_)) ? ((SubLObject) $default_clone_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_support_mt$ = deflexical("*DEFAULT-SUPPORT-MT*", ((NIL != Symbols.boundp($sym57$_DEFAULT_SUPPORT_MT_)) ? ((SubLObject) $default_support_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_comment_mt$ = deflexical("*DEFAULT-COMMENT-MT*", ((NIL != Symbols.boundp($sym58$_DEFAULT_COMMENT_MT_)) ? ((SubLObject) $default_comment_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_convention_mt$ = deflexical("*DEFAULT-CONVENTION-MT*", ((NIL != Symbols.boundp($sym59$_DEFAULT_CONVENTION_MT_)) ? ((SubLObject) $default_convention_mt$.getGlobalValue()) : $const13$UniversalVocabularyMt));
    $core_mt_optimization_enabledP$ = defparameter("*CORE-MT-OPTIMIZATION-ENABLED?*", T);
    $core_mts$ = deflexical("*CORE-MTS*", $list60);
    $ordered_core_mts$ = deflexical("*ORDERED-CORE-MTS*", $list61);
    $special_loop_core_mts$ = deflexical("*SPECIAL-LOOP-CORE-MTS*", $list62);
    return NIL;
  }

  public static final SubLObject setup_mt_vars_file() {
    // CVS_ID("Id: mt-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym6$_MT_ROOT_);
    note_mt_var($sym6$_MT_ROOT_, NIL);
    subl_macro_promotions.declare_defglobal($sym8$_THEORY_MT_ROOT_);
    note_mt_var($sym8$_THEORY_MT_ROOT_, NIL);
    subl_macro_promotions.declare_defglobal($sym9$_ASSERTIBLE_MT_ROOT_);
    note_mt_var($sym9$_ASSERTIBLE_MT_ROOT_, NIL);
    subl_macro_promotions.declare_defglobal($sym10$_ASSERTIBLE_THEORY_MT_ROOT_);
    note_mt_var($sym10$_ASSERTIBLE_THEORY_MT_ROOT_, NIL);
    subl_macro_promotions.declare_defglobal($sym11$_CORE_MT_FLOOR_);
    note_mt_var($sym11$_CORE_MT_FLOOR_, NIL);
    subl_macro_promotions.declare_defglobal($sym12$_MT_MT_);
    note_mt_var($sym12$_MT_MT_, $const14$Microtheory);
    subl_macro_promotions.declare_defglobal($sym15$_DEFINING_MT_MT_);
    note_mt_var($sym15$_DEFINING_MT_MT_, $const16$definingMt);
    subl_macro_promotions.declare_defglobal($sym17$_DECONTEXTUALIZED_PREDICATE_MT_);
    note_mt_var($sym17$_DECONTEXTUALIZED_PREDICATE_MT_, $const18$decontextualizedPredicate);
    subl_macro_promotions.declare_defglobal($sym19$_DECONTEXTUALIZED_COLLECTION_MT_);
    note_mt_var($sym19$_DECONTEXTUALIZED_COLLECTION_MT_, $const20$decontextualizedCollection);
    subl_macro_promotions.declare_defglobal($sym21$_EPHEMERAL_TERM_MT_);
    note_mt_var($sym21$_EPHEMERAL_TERM_MT_, $const22$ephemeralTerm);
    subl_macro_promotions.declare_defglobal($sym23$_IST_MT_);
    note_mt_var($sym23$_IST_MT_, $const24$ist);
    subl_macro_promotions.declare_defglobal($sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_);
    note_mt_var($sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_, $const26$InferenceRelatedBookkeepingPredic);
    subl_macro_promotions.declare_defglobal($sym27$_ANECT_MT_);
    note_mt_var($sym27$_ANECT_MT_, $const28$AtemporalNecessarilyEssentialColl);
    subl_macro_promotions.declare_defglobal($sym29$_BROAD_MT_MT_);
    note_mt_var($sym29$_BROAD_MT_MT_, $const30$BroadMicrotheory);
    subl_macro_promotions.declare_defglobal($sym31$_PSC_MT_);
    note_mt_var($sym31$_PSC_MT_, $const32$ProblemSolvingCntxt);
    subl_macro_promotions.declare_defglobal($sym33$_TOU_MT_);
    note_mt_var($sym33$_TOU_MT_, $const34$termOfUnit);
    subl_macro_promotions.declare_defglobal($sym35$_SKOLEM_MT_);
    note_mt_var($sym35$_SKOLEM_MT_, $const36$skolem);
    subl_macro_promotions.declare_defglobal($sym37$_THING_DEFINING_MT_);
    note_mt_var($sym37$_THING_DEFINING_MT_, $const38$Thing);
    subl_macro_promotions.declare_defglobal($sym39$_RELATION_DEFINING_MT_);
    note_mt_var($sym39$_RELATION_DEFINING_MT_, $const40$Relation);
    subl_macro_promotions.declare_defglobal($sym41$_EQUALS_DEFINING_MT_);
    note_mt_var($sym41$_EQUALS_DEFINING_MT_, $const42$equals);
    subl_macro_promotions.declare_defglobal($sym43$_ELEMENT_OF_DEFINING_MT_);
    note_mt_var($sym43$_ELEMENT_OF_DEFINING_MT_, $const44$elementOf);
    subl_macro_promotions.declare_defglobal($sym45$_SUBSET_OF_DEFINING_MT_);
    note_mt_var($sym45$_SUBSET_OF_DEFINING_MT_, $const46$subsetOf);
    subl_macro_promotions.declare_defglobal($sym47$_ARITY_MT_);
    note_mt_var($sym47$_ARITY_MT_, $const48$arity);
    subl_macro_promotions.declare_defglobal($sym49$_SUBLID_MT_);
    note_mt_var($sym49$_SUBLID_MT_, $const51$subLIdentifier);
    subl_macro_promotions.declare_defglobal($sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_);
    note_mt_var($sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_, $const53$notAssertibleMt);
    subl_macro_promotions.declare_defglobal($sym54$_DEFAULT_ASK_MT_);
    note_mt_var($sym54$_DEFAULT_ASK_MT_, NIL);
    subl_macro_promotions.declare_defglobal($sym55$_DEFAULT_ASSERT_MT_);
    note_mt_var($sym55$_DEFAULT_ASSERT_MT_, NIL);
    subl_macro_promotions.declare_defglobal($sym56$_DEFAULT_CLONE_MT_);
    note_mt_var($sym56$_DEFAULT_CLONE_MT_, NIL);
    subl_macro_promotions.declare_defglobal($sym57$_DEFAULT_SUPPORT_MT_);
    note_mt_var($sym57$_DEFAULT_SUPPORT_MT_, NIL);
    subl_macro_promotions.declare_defglobal($sym58$_DEFAULT_COMMENT_MT_);
    note_mt_var($sym58$_DEFAULT_COMMENT_MT_, NIL);
    subl_macro_promotions.declare_defglobal($sym59$_DEFAULT_CONVENTION_MT_);
    note_mt_var($sym59$_DEFAULT_CONVENTION_MT_, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("VAR"), makeSymbol("DEFAULT"), makeSymbol("&OPTIONAL"), makeSymbol("BASIS"), makeSymbol("COMMENT"));
  public static final SubLString $str1$Illegal_basis_argument_to_defglob = makeString("Illegal basis argument to defglobal-mt-var: ~s");
  public static final SubLSymbol $sym2$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym3$DEFGLOBAL_PROTECTED = makeSymbol("DEFGLOBAL-PROTECTED");
  public static final SubLSymbol $sym4$NOTE_MT_VAR = makeSymbol("NOTE-MT-VAR");
  public static final SubLSymbol $sym5$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym6$_MT_ROOT_ = makeSymbol("*MT-ROOT*");
  public static final SubLObject $const7$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $sym8$_THEORY_MT_ROOT_ = makeSymbol("*THEORY-MT-ROOT*");
  public static final SubLSymbol $sym9$_ASSERTIBLE_MT_ROOT_ = makeSymbol("*ASSERTIBLE-MT-ROOT*");
  public static final SubLSymbol $sym10$_ASSERTIBLE_THEORY_MT_ROOT_ = makeSymbol("*ASSERTIBLE-THEORY-MT-ROOT*");
  public static final SubLSymbol $sym11$_CORE_MT_FLOOR_ = makeSymbol("*CORE-MT-FLOOR*");
  public static final SubLSymbol $sym12$_MT_MT_ = makeSymbol("*MT-MT*");
  public static final SubLObject $const13$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLObject $const14$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLSymbol $sym15$_DEFINING_MT_MT_ = makeSymbol("*DEFINING-MT-MT*");
  public static final SubLObject $const16$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));
  public static final SubLSymbol $sym17$_DECONTEXTUALIZED_PREDICATE_MT_ = makeSymbol("*DECONTEXTUALIZED-PREDICATE-MT*");
  public static final SubLObject $const18$decontextualizedPredicate = constant_handles.reader_make_constant_shell(makeString("decontextualizedPredicate"));
  public static final SubLSymbol $sym19$_DECONTEXTUALIZED_COLLECTION_MT_ = makeSymbol("*DECONTEXTUALIZED-COLLECTION-MT*");
  public static final SubLObject $const20$decontextualizedCollection = constant_handles.reader_make_constant_shell(makeString("decontextualizedCollection"));
  public static final SubLSymbol $sym21$_EPHEMERAL_TERM_MT_ = makeSymbol("*EPHEMERAL-TERM-MT*");
  public static final SubLObject $const22$ephemeralTerm = constant_handles.reader_make_constant_shell(makeString("ephemeralTerm"));
  public static final SubLSymbol $sym23$_IST_MT_ = makeSymbol("*IST-MT*");
  public static final SubLObject $const24$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_ = makeSymbol("*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*");
  public static final SubLObject $const26$InferenceRelatedBookkeepingPredic = constant_handles.reader_make_constant_shell(makeString("InferenceRelatedBookkeepingPredicate"));
  public static final SubLSymbol $sym27$_ANECT_MT_ = makeSymbol("*ANECT-MT*");
  public static final SubLObject $const28$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell(makeString("AtemporalNecessarilyEssentialCollectionType"));
  public static final SubLSymbol $sym29$_BROAD_MT_MT_ = makeSymbol("*BROAD-MT-MT*");
  public static final SubLObject $const30$BroadMicrotheory = constant_handles.reader_make_constant_shell(makeString("BroadMicrotheory"));
  public static final SubLSymbol $sym31$_PSC_MT_ = makeSymbol("*PSC-MT*");
  public static final SubLObject $const32$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell(makeString("ProblemSolvingCntxt"));
  public static final SubLSymbol $sym33$_TOU_MT_ = makeSymbol("*TOU-MT*");
  public static final SubLObject $const34$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $sym35$_SKOLEM_MT_ = makeSymbol("*SKOLEM-MT*");
  public static final SubLObject $const36$skolem = constant_handles.reader_make_constant_shell(makeString("skolem"));
  public static final SubLSymbol $sym37$_THING_DEFINING_MT_ = makeSymbol("*THING-DEFINING-MT*");
  public static final SubLObject $const38$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $sym39$_RELATION_DEFINING_MT_ = makeSymbol("*RELATION-DEFINING-MT*");
  public static final SubLObject $const40$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLSymbol $sym41$_EQUALS_DEFINING_MT_ = makeSymbol("*EQUALS-DEFINING-MT*");
  public static final SubLObject $const42$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLSymbol $sym43$_ELEMENT_OF_DEFINING_MT_ = makeSymbol("*ELEMENT-OF-DEFINING-MT*");
  public static final SubLObject $const44$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLSymbol $sym45$_SUBSET_OF_DEFINING_MT_ = makeSymbol("*SUBSET-OF-DEFINING-MT*");
  public static final SubLObject $const46$subsetOf = constant_handles.reader_make_constant_shell(makeString("subsetOf"));
  public static final SubLSymbol $sym47$_ARITY_MT_ = makeSymbol("*ARITY-MT*");
  public static final SubLObject $const48$arity = constant_handles.reader_make_constant_shell(makeString("arity"));
  public static final SubLSymbol $sym49$_SUBLID_MT_ = makeSymbol("*SUBLID-MT*");
  public static final SubLObject $const50$CycAPIMt = constant_handles.reader_make_constant_shell(makeString("CycAPIMt"));
  public static final SubLObject $const51$subLIdentifier = constant_handles.reader_make_constant_shell(makeString("subLIdentifier"));
  public static final SubLSymbol $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_ = makeSymbol("*NOT-ASSERTIBLE-MT-CONVENTION-MT*");
  public static final SubLObject $const53$notAssertibleMt = constant_handles.reader_make_constant_shell(makeString("notAssertibleMt"));
  public static final SubLSymbol $sym54$_DEFAULT_ASK_MT_ = makeSymbol("*DEFAULT-ASK-MT*");
  public static final SubLSymbol $sym55$_DEFAULT_ASSERT_MT_ = makeSymbol("*DEFAULT-ASSERT-MT*");
  public static final SubLSymbol $sym56$_DEFAULT_CLONE_MT_ = makeSymbol("*DEFAULT-CLONE-MT*");
  public static final SubLSymbol $sym57$_DEFAULT_SUPPORT_MT_ = makeSymbol("*DEFAULT-SUPPORT-MT*");
  public static final SubLSymbol $sym58$_DEFAULT_COMMENT_MT_ = makeSymbol("*DEFAULT-COMMENT-MT*");
  public static final SubLSymbol $sym59$_DEFAULT_CONVENTION_MT_ = makeSymbol("*DEFAULT-CONVENTION-MT*");
  public static final SubLList $list60 = list(constant_handles.reader_make_constant_shell(makeString("LogicalTruthMt")), constant_handles.reader_make_constant_shell(makeString("LogicalTruthImplementationMt")), constant_handles.reader_make_constant_shell(makeString("CoreCycLMt")), constant_handles.reader_make_constant_shell(makeString("CoreCycLImplementationMt")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyImplementationMt")), constant_handles.reader_make_constant_shell(makeString("BaseKB")));
  public static final SubLList $list61 = list(cons(constant_handles.reader_make_constant_shell(makeString("LogicalTruthMt")), ZERO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("LogicalTruthImplementationMt")), ZERO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("CoreCycLMt")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("CoreCycLImplementationMt")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyImplementationMt")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("BaseKB")), THREE_INTEGER));
  public static final SubLList $list62 = list(constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")), constant_handles.reader_make_constant_shell(makeString("BaseKB")));
  public static final SubLSymbol $sym63$CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");
  public static final SubLSymbol $sym64$CORE_MICROTHEORY__ = makeSymbol("CORE-MICROTHEORY-<");
  public static final SubLSymbol $sym65$CORE_MICROTHEORY__ = makeSymbol("CORE-MICROTHEORY->");
  public static final SubLSymbol $sym66$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

  //// Initializers

  public void declareFunctions() {
    declare_mt_vars_file();
  }

  public void initializeVariables() {
    init_mt_vars_file();
  }

  public void runTopLevelForms() {
    setup_mt_vars_file();
  }

}
