package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mt_vars";
  public static final String myFingerPrint = "c8287c48409ed3a8f507cd9ca0c0edf59042fe6e2f6a254799f980503958c33d";
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 858L)
  public static SubLSymbol $mt_var_basis_table$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 1969L)
  public static SubLSymbol $mt_root$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2099L)
  public static SubLSymbol $theory_mt_root$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2259L)
  public static SubLSymbol $assertible_mt_root$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2400L)
  public static SubLSymbol $assertible_theory_mt_root$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2559L)
  public static SubLSymbol $core_mt_floor$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 2673L)
  public static SubLSymbol $mt_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3218L)
  public static SubLSymbol $defining_mt_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3389L)
  public static SubLSymbol $decontextualized_predicate_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3545L)
  public static SubLSymbol $decontextualized_collection_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3704L)
  public static SubLSymbol $ephemeral_term_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 3819L)
  public static SubLSymbol $ist_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4070L)
  public static SubLSymbol $inference_related_bookkeeping_predicate_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4307L)
  public static SubLSymbol $anect_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4670L)
  public static SubLSymbol $broad_mt_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4822L)
  public static SubLSymbol $psc_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 4951L)
  public static SubLSymbol $tou_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5122L)
  public static SubLSymbol $skolem_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5220L)
  public static SubLSymbol $thing_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5362L)
  public static SubLSymbol $relation_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5490L)
  public static SubLSymbol $equals_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5616L)
  public static SubLSymbol $element_of_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5738L)
  public static SubLSymbol $subset_of_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 5855L)
  public static SubLSymbol $arity_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6053L)
  public static SubLSymbol $sublid_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6220L)
  public static SubLSymbol $not_assertible_mt_convention_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6371L)
  public static SubLSymbol $default_ask_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6482L)
  public static SubLSymbol $default_assert_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6564L)
  public static SubLSymbol $default_clone_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6702L)
  public static SubLSymbol $default_support_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6852L)
  public static SubLSymbol $default_comment_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 6963L)
  public static SubLSymbol $default_convention_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 7269L)
  public static SubLSymbol $core_mt_optimization_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 7551L)
  private static SubLSymbol $core_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 8332L)
  private static SubLSymbol $ordered_core_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9929L)
  private static SubLSymbol $special_loop_core_mts$;
  private static final SubLList $list0;
  private static final SubLString $str1$Illegal_basis_argument_to_defglob;
  private static final SubLSymbol $sym2$PROGN;
  private static final SubLSymbol $sym3$DEFGLOBAL_PROTECTED;
  private static final SubLSymbol $sym4$NOTE_MT_VAR;
  private static final SubLSymbol $sym5$QUOTE;
  private static final SubLSymbol $sym6$_MT_ROOT_;
  private static final SubLObject $const7$BaseKB;
  private static final SubLSymbol $sym8$_THEORY_MT_ROOT_;
  private static final SubLSymbol $sym9$_ASSERTIBLE_MT_ROOT_;
  private static final SubLSymbol $sym10$_ASSERTIBLE_THEORY_MT_ROOT_;
  private static final SubLSymbol $sym11$_CORE_MT_FLOOR_;
  private static final SubLSymbol $sym12$_MT_MT_;
  private static final SubLObject $const13$UniversalVocabularyMt;
  private static final SubLObject $const14$Microtheory;
  private static final SubLSymbol $sym15$_DEFINING_MT_MT_;
  private static final SubLObject $const16$definingMt;
  private static final SubLSymbol $sym17$_DECONTEXTUALIZED_PREDICATE_MT_;
  private static final SubLObject $const18$decontextualizedPredicate;
  private static final SubLSymbol $sym19$_DECONTEXTUALIZED_COLLECTION_MT_;
  private static final SubLObject $const20$decontextualizedCollection;
  private static final SubLSymbol $sym21$_EPHEMERAL_TERM_MT_;
  private static final SubLObject $const22$ephemeralTerm;
  private static final SubLSymbol $sym23$_IST_MT_;
  private static final SubLObject $const24$ist;
  private static final SubLSymbol $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_;
  private static final SubLObject $const26$InferenceRelatedBookkeepingPredic;
  private static final SubLSymbol $sym27$_ANECT_MT_;
  private static final SubLObject $const28$AtemporalNecessarilyEssentialColl;
  private static final SubLSymbol $sym29$_BROAD_MT_MT_;
  private static final SubLObject $const30$BroadMicrotheory;
  private static final SubLSymbol $sym31$_PSC_MT_;
  private static final SubLObject $const32$ProblemSolvingCntxt;
  private static final SubLSymbol $sym33$_TOU_MT_;
  private static final SubLObject $const34$termOfUnit;
  private static final SubLSymbol $sym35$_SKOLEM_MT_;
  private static final SubLObject $const36$skolem;
  private static final SubLSymbol $sym37$_THING_DEFINING_MT_;
  private static final SubLObject $const38$Thing;
  private static final SubLSymbol $sym39$_RELATION_DEFINING_MT_;
  private static final SubLObject $const40$Relation;
  private static final SubLSymbol $sym41$_EQUALS_DEFINING_MT_;
  private static final SubLObject $const42$equals;
  private static final SubLSymbol $sym43$_ELEMENT_OF_DEFINING_MT_;
  private static final SubLObject $const44$elementOf;
  private static final SubLSymbol $sym45$_SUBSET_OF_DEFINING_MT_;
  private static final SubLObject $const46$subsetOf;
  private static final SubLSymbol $sym47$_ARITY_MT_;
  private static final SubLObject $const48$arity;
  private static final SubLSymbol $sym49$_SUBLID_MT_;
  private static final SubLObject $const50$CycAPIMt;
  private static final SubLObject $const51$subLIdentifier;
  private static final SubLSymbol $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_;
  private static final SubLObject $const53$notAssertibleMt;
  private static final SubLSymbol $sym54$_DEFAULT_ASK_MT_;
  private static final SubLSymbol $sym55$_DEFAULT_ASSERT_MT_;
  private static final SubLSymbol $sym56$_DEFAULT_CLONE_MT_;
  private static final SubLSymbol $sym57$_DEFAULT_SUPPORT_MT_;
  private static final SubLSymbol $sym58$_DEFAULT_COMMENT_MT_;
  private static final SubLSymbol $sym59$_DEFAULT_CONVENTION_MT_;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$CORE_MICROTHEORY_P;
  private static final SubLSymbol $sym64$CORE_MICROTHEORY__;
  private static final SubLSymbol $sym65$CORE_MICROTHEORY__;
  private static final SubLSymbol $sym66$SETS_EQUAL_;

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 956L)
  public static SubLObject defglobal_mt_var(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    SubLObject v_default = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_default = current.first();
    current = current.rest();
    final SubLObject basis = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    final SubLObject comment = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && basis.isString() )
      {
        Errors.error( $str1$Illegal_basis_argument_to_defglob, basis );
      }
      return ConsesLow.list( $sym2$PROGN, ConsesLow.list( $sym3$DEFGLOBAL_PROTECTED, var, v_default, comment ), ConsesLow.list( $sym4$NOTE_MT_VAR, ConsesLow.list( $sym5$QUOTE, var ), basis ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 1679L)
  public static SubLObject note_mt_var(final SubLObject var, SubLObject basis)
  {
    if( basis == UNPROVIDED )
    {
      basis = NIL;
    }
    if( NIL != basis )
    {
      note_mt_var_basis( var, basis );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 1863L)
  public static SubLObject note_mt_var_basis(final SubLObject var, final SubLObject basis)
  {
    return dictionary.dictionary_enter( $mt_var_basis_table$.getGlobalValue(), var, basis );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 7162L)
  public static SubLObject mt_mt_relevantP(final SubLObject mt)
  {
    return genl_mts.genl_mtP( $mt_mt$.getGlobalValue(), mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 8700L)
  public static SubLObject core_microtheory_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $core_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 8831L)
  public static SubLObject core_microtheory_L(final SubLObject mt1, final SubLObject mt2)
  {
    final SubLObject level1 = list_utilities.alist_lookup_without_values( $ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED );
    final SubLObject level2 = list_utilities.alist_lookup_without_values( $ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED );
    if( level1.isInteger() && level2.isInteger() )
    {
      return Numbers.numLE( level2, level1 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9198L)
  public static SubLObject core_microtheory_G(final SubLObject mt1, final SubLObject mt2)
  {
    final SubLObject level1 = list_utilities.alist_lookup_without_values( $ordered_core_mts$.getGlobalValue(), mt1, UNPROVIDED, UNPROVIDED );
    final SubLObject level2 = list_utilities.alist_lookup_without_values( $ordered_core_mts$.getGlobalValue(), mt2, UNPROVIDED, UNPROVIDED );
    if( level1.isInteger() && level2.isInteger() )
    {
      return Numbers.numLE( level1, level2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9566L)
  public static SubLObject core_genl_mtP(final SubLObject mt1, final SubLObject mt2)
  {
    if( NIL != special_core_loop_mt_p( mt1 ) && NIL != special_core_loop_mt_p( mt2 ) )
    {
      return T;
    }
    return core_microtheory_G( mt1, mt2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 9789L)
  public static SubLObject core_any_genl_mtP(final SubLObject spec, final SubLObject v_genls)
  {
    SubLObject cdolist_list_var = v_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != core_genl_mtP( spec, genl ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10015L)
  public static SubLObject special_core_loop_mt_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $special_loop_core_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10116L)
  public static SubLObject minimize_mts_wrt_core(final SubLObject mts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject core_mts = list_utilities.partition_list( mts, $sym63$CORE_MICROTHEORY_P );
    final SubLObject non_core_mts = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != non_core_mts )
    {
      return non_core_mts;
    }
    final SubLObject min_core_mt = list_utilities.extremal( core_mts, $sym64$CORE_MICROTHEORY__, UNPROVIDED );
    return removal_module_utilities.non_null_answer_to_singleton( min_core_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10524L)
  public static SubLObject maximize_mts_wrt_core(final SubLObject mts)
  {
    final SubLObject core_mts = list_utilities.remove_if_not( $sym63$CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != core_mts )
    {
      final SubLObject max_core_mt = list_utilities.extremal( core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED );
      return ConsesLow.list( max_core_mt );
    }
    return mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 10899L)
  public static SubLObject minimize_mt_sets_wrt_core(final SubLObject mt_sets)
  {
    SubLObject reduced_mt_sets = NIL;
    SubLObject cdolist_list_var = mt_sets;
    SubLObject mt_set = NIL;
    mt_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      final SubLObject reduced_mt_set = item_var = minimize_mts_wrt_core( mt_set );
      if( NIL == conses_high.member( item_var, reduced_mt_sets, Symbols.symbol_function( $sym66$SETS_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        reduced_mt_sets = ConsesLow.cons( item_var, reduced_mt_sets );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_set = cdolist_list_var.first();
    }
    return Sequences.nreverse( reduced_mt_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-vars.lisp", position = 11286L)
  public static SubLObject push_core_mts_to_beginning(final SubLObject mts)
  {
    final SubLObject core_mts = list_utilities.remove_if_not( $sym63$CORE_MICROTHEORY_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != core_mts )
    {
      final SubLObject non_core_mts = list_utilities.ordered_set_difference( mts, core_mts, UNPROVIDED, UNPROVIDED );
      final SubLObject sorted_core_mts = Sort.sort( core_mts, $sym65$CORE_MICROTHEORY__, UNPROVIDED );
      final SubLObject sorted_mts = ConsesLow.nconc( sorted_core_mts, non_core_mts );
      return sorted_mts;
    }
    return mts;
  }

  public static SubLObject declare_mt_vars_file()
  {
    SubLFiles.declareMacro( me, "defglobal_mt_var", "DEFGLOBAL-MT-VAR" );
    SubLFiles.declareFunction( me, "note_mt_var", "NOTE-MT-VAR", 1, 1, false );
    SubLFiles.declareFunction( me, "note_mt_var_basis", "NOTE-MT-VAR-BASIS", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_mt_relevantP", "MT-MT-RELEVANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "core_microtheory_p", "CORE-MICROTHEORY-P", 1, 0, false );
    new $core_microtheory_p$UnaryFunction();
    SubLFiles.declareFunction( me, "core_microtheory_L", "CORE-MICROTHEORY-<", 2, 0, false );
    SubLFiles.declareFunction( me, "core_microtheory_G", "CORE-MICROTHEORY->", 2, 0, false );
    SubLFiles.declareFunction( me, "core_genl_mtP", "CORE-GENL-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "core_any_genl_mtP", "CORE-ANY-GENL-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "special_core_loop_mt_p", "SPECIAL-CORE-LOOP-MT-P", 1, 0, false );
    new $special_core_loop_mt_p$UnaryFunction();
    SubLFiles.declareFunction( me, "minimize_mts_wrt_core", "MINIMIZE-MTS-WRT-CORE", 1, 0, false );
    SubLFiles.declareFunction( me, "maximize_mts_wrt_core", "MAXIMIZE-MTS-WRT-CORE", 1, 0, false );
    SubLFiles.declareFunction( me, "minimize_mt_sets_wrt_core", "MINIMIZE-MT-SETS-WRT-CORE", 1, 0, false );
    SubLFiles.declareFunction( me, "push_core_mts_to_beginning", "PUSH-CORE-MTS-TO-BEGINNING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_mt_vars_file()
  {
    $mt_var_basis_table$ = SubLFiles.deflexical( "*MT-VAR-BASIS-TABLE*", dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $mt_root$ = SubLFiles.deflexical( "*MT-ROOT*", maybeDefault( $sym6$_MT_ROOT_, $mt_root$, $const7$BaseKB ) );
    $theory_mt_root$ = SubLFiles.deflexical( "*THEORY-MT-ROOT*", maybeDefault( $sym8$_THEORY_MT_ROOT_, $theory_mt_root$, $const7$BaseKB ) );
    $assertible_mt_root$ = SubLFiles.deflexical( "*ASSERTIBLE-MT-ROOT*", maybeDefault( $sym9$_ASSERTIBLE_MT_ROOT_, $assertible_mt_root$, $const7$BaseKB ) );
    $assertible_theory_mt_root$ = SubLFiles.deflexical( "*ASSERTIBLE-THEORY-MT-ROOT*", maybeDefault( $sym10$_ASSERTIBLE_THEORY_MT_ROOT_, $assertible_theory_mt_root$, $const7$BaseKB ) );
    $core_mt_floor$ = SubLFiles.deflexical( "*CORE-MT-FLOOR*", maybeDefault( $sym11$_CORE_MT_FLOOR_, $core_mt_floor$, $const7$BaseKB ) );
    $mt_mt$ = SubLFiles.deflexical( "*MT-MT*", maybeDefault( $sym12$_MT_MT_, $mt_mt$, $const13$UniversalVocabularyMt ) );
    $defining_mt_mt$ = SubLFiles.deflexical( "*DEFINING-MT-MT*", maybeDefault( $sym15$_DEFINING_MT_MT_, $defining_mt_mt$, $const7$BaseKB ) );
    $decontextualized_predicate_mt$ = SubLFiles.deflexical( "*DECONTEXTUALIZED-PREDICATE-MT*", maybeDefault( $sym17$_DECONTEXTUALIZED_PREDICATE_MT_, $decontextualized_predicate_mt$, $const7$BaseKB ) );
    $decontextualized_collection_mt$ = SubLFiles.deflexical( "*DECONTEXTUALIZED-COLLECTION-MT*", maybeDefault( $sym19$_DECONTEXTUALIZED_COLLECTION_MT_, $decontextualized_collection_mt$, $const7$BaseKB ) );
    $ephemeral_term_mt$ = SubLFiles.deflexical( "*EPHEMERAL-TERM-MT*", maybeDefault( $sym21$_EPHEMERAL_TERM_MT_, $ephemeral_term_mt$, $const7$BaseKB ) );
    $ist_mt$ = SubLFiles.deflexical( "*IST-MT*", maybeDefault( $sym23$_IST_MT_, $ist_mt$, $const7$BaseKB ) );
    $inference_related_bookkeeping_predicate_mt$ = SubLFiles.deflexical( "*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*", maybeDefault( $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_,
        $inference_related_bookkeeping_predicate_mt$, $const7$BaseKB ) );
    $anect_mt$ = SubLFiles.deflexical( "*ANECT-MT*", maybeDefault( $sym27$_ANECT_MT_, $anect_mt$, $const13$UniversalVocabularyMt ) );
    $broad_mt_mt$ = SubLFiles.deflexical( "*BROAD-MT-MT*", maybeDefault( $sym29$_BROAD_MT_MT_, $broad_mt_mt$, $const7$BaseKB ) );
    $psc_mt$ = SubLFiles.deflexical( "*PSC-MT*", maybeDefault( $sym31$_PSC_MT_, $psc_mt$, $const7$BaseKB ) );
    $tou_mt$ = SubLFiles.deflexical( "*TOU-MT*", maybeDefault( $sym33$_TOU_MT_, $tou_mt$, $const7$BaseKB ) );
    $skolem_mt$ = SubLFiles.deflexical( "*SKOLEM-MT*", maybeDefault( $sym35$_SKOLEM_MT_, $skolem_mt$, $const7$BaseKB ) );
    $thing_defining_mt$ = SubLFiles.deflexical( "*THING-DEFINING-MT*", maybeDefault( $sym37$_THING_DEFINING_MT_, $thing_defining_mt$, $const7$BaseKB ) );
    $relation_defining_mt$ = SubLFiles.deflexical( "*RELATION-DEFINING-MT*", maybeDefault( $sym39$_RELATION_DEFINING_MT_, $relation_defining_mt$, $const7$BaseKB ) );
    $equals_defining_mt$ = SubLFiles.deflexical( "*EQUALS-DEFINING-MT*", maybeDefault( $sym41$_EQUALS_DEFINING_MT_, $equals_defining_mt$, $const7$BaseKB ) );
    $element_of_defining_mt$ = SubLFiles.deflexical( "*ELEMENT-OF-DEFINING-MT*", maybeDefault( $sym43$_ELEMENT_OF_DEFINING_MT_, $element_of_defining_mt$, $const7$BaseKB ) );
    $subset_of_defining_mt$ = SubLFiles.deflexical( "*SUBSET-OF-DEFINING-MT*", maybeDefault( $sym45$_SUBSET_OF_DEFINING_MT_, $subset_of_defining_mt$, $const7$BaseKB ) );
    $arity_mt$ = SubLFiles.deflexical( "*ARITY-MT*", maybeDefault( $sym47$_ARITY_MT_, $arity_mt$, $const13$UniversalVocabularyMt ) );
    $sublid_mt$ = SubLFiles.deflexical( "*SUBLID-MT*", maybeDefault( $sym49$_SUBLID_MT_, $sublid_mt$, $const50$CycAPIMt ) );
    $not_assertible_mt_convention_mt$ = SubLFiles.deflexical( "*NOT-ASSERTIBLE-MT-CONVENTION-MT*", maybeDefault( $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_, $not_assertible_mt_convention_mt$,
        $const13$UniversalVocabularyMt ) );
    $default_ask_mt$ = SubLFiles.deflexical( "*DEFAULT-ASK-MT*", maybeDefault( $sym54$_DEFAULT_ASK_MT_, $default_ask_mt$, $const7$BaseKB ) );
    $default_assert_mt$ = SubLFiles.deflexical( "*DEFAULT-ASSERT-MT*", maybeDefault( $sym55$_DEFAULT_ASSERT_MT_, $default_assert_mt$, $const7$BaseKB ) );
    $default_clone_mt$ = SubLFiles.deflexical( "*DEFAULT-CLONE-MT*", maybeDefault( $sym56$_DEFAULT_CLONE_MT_, $default_clone_mt$, $const7$BaseKB ) );
    $default_support_mt$ = SubLFiles.deflexical( "*DEFAULT-SUPPORT-MT*", maybeDefault( $sym57$_DEFAULT_SUPPORT_MT_, $default_support_mt$, $const7$BaseKB ) );
    $default_comment_mt$ = SubLFiles.deflexical( "*DEFAULT-COMMENT-MT*", maybeDefault( $sym58$_DEFAULT_COMMENT_MT_, $default_comment_mt$, $const7$BaseKB ) );
    $default_convention_mt$ = SubLFiles.deflexical( "*DEFAULT-CONVENTION-MT*", maybeDefault( $sym59$_DEFAULT_CONVENTION_MT_, $default_convention_mt$, $const13$UniversalVocabularyMt ) );
    $core_mt_optimization_enabledP$ = SubLFiles.defparameter( "*CORE-MT-OPTIMIZATION-ENABLED?*", T );
    $core_mts$ = SubLFiles.deflexical( "*CORE-MTS*", $list60 );
    $ordered_core_mts$ = SubLFiles.deflexical( "*ORDERED-CORE-MTS*", $list61 );
    $special_loop_core_mts$ = SubLFiles.deflexical( "*SPECIAL-LOOP-CORE-MTS*", $list62 );
    return NIL;
  }

  public static SubLObject setup_mt_vars_file()
  {
    subl_macro_promotions.declare_defglobal( $sym6$_MT_ROOT_ );
    note_mt_var( $sym6$_MT_ROOT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym8$_THEORY_MT_ROOT_ );
    note_mt_var( $sym8$_THEORY_MT_ROOT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym9$_ASSERTIBLE_MT_ROOT_ );
    note_mt_var( $sym9$_ASSERTIBLE_MT_ROOT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym10$_ASSERTIBLE_THEORY_MT_ROOT_ );
    note_mt_var( $sym10$_ASSERTIBLE_THEORY_MT_ROOT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym11$_CORE_MT_FLOOR_ );
    note_mt_var( $sym11$_CORE_MT_FLOOR_, NIL );
    subl_macro_promotions.declare_defglobal( $sym12$_MT_MT_ );
    note_mt_var( $sym12$_MT_MT_, $const14$Microtheory );
    subl_macro_promotions.declare_defglobal( $sym15$_DEFINING_MT_MT_ );
    note_mt_var( $sym15$_DEFINING_MT_MT_, $const16$definingMt );
    subl_macro_promotions.declare_defglobal( $sym17$_DECONTEXTUALIZED_PREDICATE_MT_ );
    note_mt_var( $sym17$_DECONTEXTUALIZED_PREDICATE_MT_, $const18$decontextualizedPredicate );
    subl_macro_promotions.declare_defglobal( $sym19$_DECONTEXTUALIZED_COLLECTION_MT_ );
    note_mt_var( $sym19$_DECONTEXTUALIZED_COLLECTION_MT_, $const20$decontextualizedCollection );
    subl_macro_promotions.declare_defglobal( $sym21$_EPHEMERAL_TERM_MT_ );
    note_mt_var( $sym21$_EPHEMERAL_TERM_MT_, $const22$ephemeralTerm );
    subl_macro_promotions.declare_defglobal( $sym23$_IST_MT_ );
    note_mt_var( $sym23$_IST_MT_, $const24$ist );
    subl_macro_promotions.declare_defglobal( $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_ );
    note_mt_var( $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_, $const26$InferenceRelatedBookkeepingPredic );
    subl_macro_promotions.declare_defglobal( $sym27$_ANECT_MT_ );
    note_mt_var( $sym27$_ANECT_MT_, $const28$AtemporalNecessarilyEssentialColl );
    subl_macro_promotions.declare_defglobal( $sym29$_BROAD_MT_MT_ );
    note_mt_var( $sym29$_BROAD_MT_MT_, $const30$BroadMicrotheory );
    subl_macro_promotions.declare_defglobal( $sym31$_PSC_MT_ );
    note_mt_var( $sym31$_PSC_MT_, $const32$ProblemSolvingCntxt );
    subl_macro_promotions.declare_defglobal( $sym33$_TOU_MT_ );
    note_mt_var( $sym33$_TOU_MT_, $const34$termOfUnit );
    subl_macro_promotions.declare_defglobal( $sym35$_SKOLEM_MT_ );
    note_mt_var( $sym35$_SKOLEM_MT_, $const36$skolem );
    subl_macro_promotions.declare_defglobal( $sym37$_THING_DEFINING_MT_ );
    note_mt_var( $sym37$_THING_DEFINING_MT_, $const38$Thing );
    subl_macro_promotions.declare_defglobal( $sym39$_RELATION_DEFINING_MT_ );
    note_mt_var( $sym39$_RELATION_DEFINING_MT_, $const40$Relation );
    subl_macro_promotions.declare_defglobal( $sym41$_EQUALS_DEFINING_MT_ );
    note_mt_var( $sym41$_EQUALS_DEFINING_MT_, $const42$equals );
    subl_macro_promotions.declare_defglobal( $sym43$_ELEMENT_OF_DEFINING_MT_ );
    note_mt_var( $sym43$_ELEMENT_OF_DEFINING_MT_, $const44$elementOf );
    subl_macro_promotions.declare_defglobal( $sym45$_SUBSET_OF_DEFINING_MT_ );
    note_mt_var( $sym45$_SUBSET_OF_DEFINING_MT_, $const46$subsetOf );
    subl_macro_promotions.declare_defglobal( $sym47$_ARITY_MT_ );
    note_mt_var( $sym47$_ARITY_MT_, $const48$arity );
    subl_macro_promotions.declare_defglobal( $sym49$_SUBLID_MT_ );
    note_mt_var( $sym49$_SUBLID_MT_, $const51$subLIdentifier );
    subl_macro_promotions.declare_defglobal( $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_ );
    note_mt_var( $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_, $const53$notAssertibleMt );
    subl_macro_promotions.declare_defglobal( $sym54$_DEFAULT_ASK_MT_ );
    note_mt_var( $sym54$_DEFAULT_ASK_MT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym55$_DEFAULT_ASSERT_MT_ );
    note_mt_var( $sym55$_DEFAULT_ASSERT_MT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym56$_DEFAULT_CLONE_MT_ );
    note_mt_var( $sym56$_DEFAULT_CLONE_MT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym57$_DEFAULT_SUPPORT_MT_ );
    note_mt_var( $sym57$_DEFAULT_SUPPORT_MT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym58$_DEFAULT_COMMENT_MT_ );
    note_mt_var( $sym58$_DEFAULT_COMMENT_MT_, NIL );
    subl_macro_promotions.declare_defglobal( $sym59$_DEFAULT_CONVENTION_MT_ );
    note_mt_var( $sym59$_DEFAULT_CONVENTION_MT_, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mt_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mt_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mt_vars_file();
  }
  static
  {
    me = new mt_vars();
    $mt_var_basis_table$ = null;
    $mt_root$ = null;
    $theory_mt_root$ = null;
    $assertible_mt_root$ = null;
    $assertible_theory_mt_root$ = null;
    $core_mt_floor$ = null;
    $mt_mt$ = null;
    $defining_mt_mt$ = null;
    $decontextualized_predicate_mt$ = null;
    $decontextualized_collection_mt$ = null;
    $ephemeral_term_mt$ = null;
    $ist_mt$ = null;
    $inference_related_bookkeeping_predicate_mt$ = null;
    $anect_mt$ = null;
    $broad_mt_mt$ = null;
    $psc_mt$ = null;
    $tou_mt$ = null;
    $skolem_mt$ = null;
    $thing_defining_mt$ = null;
    $relation_defining_mt$ = null;
    $equals_defining_mt$ = null;
    $element_of_defining_mt$ = null;
    $subset_of_defining_mt$ = null;
    $arity_mt$ = null;
    $sublid_mt$ = null;
    $not_assertible_mt_convention_mt$ = null;
    $default_ask_mt$ = null;
    $default_assert_mt$ = null;
    $default_clone_mt$ = null;
    $default_support_mt$ = null;
    $default_comment_mt$ = null;
    $default_convention_mt$ = null;
    $core_mt_optimization_enabledP$ = null;
    $core_mts$ = null;
    $ordered_core_mts$ = null;
    $special_loop_core_mts$ = null;
    $list0 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "DEFAULT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "BASIS" ), makeSymbol( "COMMENT" ) );
    $str1$Illegal_basis_argument_to_defglob = makeString( "Illegal basis argument to defglobal-mt-var: ~s" );
    $sym2$PROGN = makeSymbol( "PROGN" );
    $sym3$DEFGLOBAL_PROTECTED = makeSymbol( "DEFGLOBAL-PROTECTED" );
    $sym4$NOTE_MT_VAR = makeSymbol( "NOTE-MT-VAR" );
    $sym5$QUOTE = makeSymbol( "QUOTE" );
    $sym6$_MT_ROOT_ = makeSymbol( "*MT-ROOT*" );
    $const7$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym8$_THEORY_MT_ROOT_ = makeSymbol( "*THEORY-MT-ROOT*" );
    $sym9$_ASSERTIBLE_MT_ROOT_ = makeSymbol( "*ASSERTIBLE-MT-ROOT*" );
    $sym10$_ASSERTIBLE_THEORY_MT_ROOT_ = makeSymbol( "*ASSERTIBLE-THEORY-MT-ROOT*" );
    $sym11$_CORE_MT_FLOOR_ = makeSymbol( "*CORE-MT-FLOOR*" );
    $sym12$_MT_MT_ = makeSymbol( "*MT-MT*" );
    $const13$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const14$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $sym15$_DEFINING_MT_MT_ = makeSymbol( "*DEFINING-MT-MT*" );
    $const16$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
    $sym17$_DECONTEXTUALIZED_PREDICATE_MT_ = makeSymbol( "*DECONTEXTUALIZED-PREDICATE-MT*" );
    $const18$decontextualizedPredicate = constant_handles.reader_make_constant_shell( makeString( "decontextualizedPredicate" ) );
    $sym19$_DECONTEXTUALIZED_COLLECTION_MT_ = makeSymbol( "*DECONTEXTUALIZED-COLLECTION-MT*" );
    $const20$decontextualizedCollection = constant_handles.reader_make_constant_shell( makeString( "decontextualizedCollection" ) );
    $sym21$_EPHEMERAL_TERM_MT_ = makeSymbol( "*EPHEMERAL-TERM-MT*" );
    $const22$ephemeralTerm = constant_handles.reader_make_constant_shell( makeString( "ephemeralTerm" ) );
    $sym23$_IST_MT_ = makeSymbol( "*IST-MT*" );
    $const24$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym25$_INFERENCE_RELATED_BOOKKEEPING_PREDICATE_MT_ = makeSymbol( "*INFERENCE-RELATED-BOOKKEEPING-PREDICATE-MT*" );
    $const26$InferenceRelatedBookkeepingPredic = constant_handles.reader_make_constant_shell( makeString( "InferenceRelatedBookkeepingPredicate" ) );
    $sym27$_ANECT_MT_ = makeSymbol( "*ANECT-MT*" );
    $const28$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell( makeString( "AtemporalNecessarilyEssentialCollectionType" ) );
    $sym29$_BROAD_MT_MT_ = makeSymbol( "*BROAD-MT-MT*" );
    $const30$BroadMicrotheory = constant_handles.reader_make_constant_shell( makeString( "BroadMicrotheory" ) );
    $sym31$_PSC_MT_ = makeSymbol( "*PSC-MT*" );
    $const32$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell( makeString( "ProblemSolvingCntxt" ) );
    $sym33$_TOU_MT_ = makeSymbol( "*TOU-MT*" );
    $const34$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $sym35$_SKOLEM_MT_ = makeSymbol( "*SKOLEM-MT*" );
    $const36$skolem = constant_handles.reader_make_constant_shell( makeString( "skolem" ) );
    $sym37$_THING_DEFINING_MT_ = makeSymbol( "*THING-DEFINING-MT*" );
    $const38$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym39$_RELATION_DEFINING_MT_ = makeSymbol( "*RELATION-DEFINING-MT*" );
    $const40$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $sym41$_EQUALS_DEFINING_MT_ = makeSymbol( "*EQUALS-DEFINING-MT*" );
    $const42$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $sym43$_ELEMENT_OF_DEFINING_MT_ = makeSymbol( "*ELEMENT-OF-DEFINING-MT*" );
    $const44$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $sym45$_SUBSET_OF_DEFINING_MT_ = makeSymbol( "*SUBSET-OF-DEFINING-MT*" );
    $const46$subsetOf = constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) );
    $sym47$_ARITY_MT_ = makeSymbol( "*ARITY-MT*" );
    $const48$arity = constant_handles.reader_make_constant_shell( makeString( "arity" ) );
    $sym49$_SUBLID_MT_ = makeSymbol( "*SUBLID-MT*" );
    $const50$CycAPIMt = constant_handles.reader_make_constant_shell( makeString( "CycAPIMt" ) );
    $const51$subLIdentifier = constant_handles.reader_make_constant_shell( makeString( "subLIdentifier" ) );
    $sym52$_NOT_ASSERTIBLE_MT_CONVENTION_MT_ = makeSymbol( "*NOT-ASSERTIBLE-MT-CONVENTION-MT*" );
    $const53$notAssertibleMt = constant_handles.reader_make_constant_shell( makeString( "notAssertibleMt" ) );
    $sym54$_DEFAULT_ASK_MT_ = makeSymbol( "*DEFAULT-ASK-MT*" );
    $sym55$_DEFAULT_ASSERT_MT_ = makeSymbol( "*DEFAULT-ASSERT-MT*" );
    $sym56$_DEFAULT_CLONE_MT_ = makeSymbol( "*DEFAULT-CLONE-MT*" );
    $sym57$_DEFAULT_SUPPORT_MT_ = makeSymbol( "*DEFAULT-SUPPORT-MT*" );
    $sym58$_DEFAULT_COMMENT_MT_ = makeSymbol( "*DEFAULT-COMMENT-MT*" );
    $sym59$_DEFAULT_CONVENTION_MT_ = makeSymbol( "*DEFAULT-CONVENTION-MT*" );
    $list60 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LogicalTruthMt" ) ), constant_handles.reader_make_constant_shell( makeString( "LogicalTruthImplementationMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "CoreCycLMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CoreCycLImplementationMt" ) ), constant_handles.reader_make_constant_shell( makeString(
            "UniversalVocabularyMt" ) ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyImplementationMt" ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) );
    $list61 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "LogicalTruthMt" ) ), ZERO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
        "LogicalTruthImplementationMt" ) ), ZERO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "CoreCycLMt" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CoreCycLImplementationMt" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ), TWO_INTEGER ),
        ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyImplementationMt" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
            "BaseKB" ) ), THREE_INTEGER ) );
    $list62 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) );
    $sym63$CORE_MICROTHEORY_P = makeSymbol( "CORE-MICROTHEORY-P" );
    $sym64$CORE_MICROTHEORY__ = makeSymbol( "CORE-MICROTHEORY-<" );
    $sym65$CORE_MICROTHEORY__ = makeSymbol( "CORE-MICROTHEORY->" );
    $sym66$SETS_EQUAL_ = makeSymbol( "SETS-EQUAL?" );
  }

  public static final class $core_microtheory_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $core_microtheory_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CORE-MICROTHEORY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return core_microtheory_p( arg1 );
    }
  }

  public static final class $special_core_loop_mt_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $special_core_loop_mt_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SPECIAL-CORE-LOOP-MT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return special_core_loop_mt_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 174 ms
 * 
 */