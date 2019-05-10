package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fort_types_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.fort_types_interface";
  public static final String myFingerPrint = "26b5a6e7eb9687b4d3345468faa546fe536f7b7bc1798e4f1824b90cd03b0834";
  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37299L)
  private static SubLSymbol $proprietary_constantP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37513L)
  private static SubLSymbol $proprietary_termP_caching_state$;
  private static final SubLObject $const0$isa;
  private static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const2$EverythingPSC;
  private static final SubLSymbol $sym3$FORT_P;
  private static final SubLObject $const4$Collection;
  private static final SubLObject $const5$Function_Denotational;
  private static final SubLObject $const6$Predicate;
  private static final SubLObject $const7$Microtheory;
  private static final SubLObject $const8$FirstOrderCollection;
  private static final SubLObject $const9$SecondOrderCollection;
  private static final SubLObject $const10$ThirdOrderCollection;
  private static final SubLObject $const11$FourthOrderCollection;
  private static final SubLSymbol $kw12$MULTIORDINAL;
  private static final SubLSymbol $sym13$COLLECTION_P;
  private static final SubLSymbol $sym14$PREDICATE_P;
  private static final SubLSymbol $sym15$ISA_PREDICATE_;
  private static final SubLObject $const16$Relation;
  private static final SubLObject $const17$SententialRelation;
  private static final SubLObject $const18$AntiSymmetricBinaryPredicate;
  private static final SubLObject $const19$AntiTransitiveBinaryPredicate;
  private static final SubLObject $const20$ArgTypeBinaryPredicate;
  private static final SubLObject $const21$ArgQuotedIsaBinaryPredicate;
  private static final SubLObject $const22$ArgFormatBinaryPredicate;
  private static final SubLObject $const23$ArgTypeTernaryPredicate;
  private static final SubLObject $const24$ArgQuotedIsaTernaryPredicate;
  private static final SubLObject $const25$ArgFormatTernaryPredicate;
  private static final SubLObject $const26$AsymmetricBinaryPredicate;
  private static final SubLObject $const27$BookkeepingPredicate;
  private static final SubLObject $const28$UnderspecifiedPredicate;
  private static final SubLObject $const29$BroadMicrotheory;
  private static final SubLSymbol $sym30$COMMUTATIVE_RELATION_;
  private static final SubLList $list31;
  private static final SubLString $str32$Return_T_iff_RELATION_is_a_commut;
  private static final SubLList $list33;
  private static final SubLObject $const34$CommutativeRelation;
  private static final SubLObject $const35$CommutativePredicate;
  private static final SubLObject $const36$DistributingMetaKnowledgePredicat;
  private static final SubLObject $const37$ELRelation;
  private static final SubLObject $const38$EvaluatableFunction;
  private static final SubLObject $const39$EvaluatablePredicate;
  private static final SubLObject $const40$ExistentialQuantifier;
  private static final SubLObject $const41$IrreflexiveBinaryPredicate;
  private static final SubLObject $const42$LogicalConnective;
  private static final SubLObject $const43$MicrotheoryDesignatingRelation;
  private static final SubLObject $const44$PartiallyCommutativeRelation;
  private static final SubLObject $const45$PartiallyCommutativePredicate;
  private static final SubLObject $const46$ProblemSolvingCntxt;
  private static final SubLObject $const47$Quantifier;
  private static final SubLObject $const48$ReflexiveBinaryPredicate;
  private static final SubLObject $const49$ReifiableFunction;
  private static final SubLObject $const50$RuleMacroPredicate;
  private static final SubLObject $const51$ScopingRelation;
  private static final SubLObject $const52$SiblingDisjointCollectionType;
  private static final SubLObject $const53$DisjointCollectionType;
  private static final SubLObject $const54$SkolemFunction;
  private static final SubLObject $const55$SymmetricBinaryPredicate;
  private static final SubLObject $const56$TransitiveBinaryPredicate;
  private static final SubLObject $const57$VariableArityRelation;
  private static final SubLObject $const58$DocumentationPredicate;
  private static final SubLObject $const59$SKSIContentMicrotheory;
  private static final SubLObject $const60$SKSIExternalTermDenotingFunction;
  private static final SubLObject $const61$SKSISupportedComparisonPredicate;
  private static final SubLObject $const62$SKSISupportedFunction;
  private static final SubLObject $const63$CSQLComparisonPredicate;
  private static final SubLObject $const64$SKSISupportedConstant;
  private static final SubLObject $const65$CSQLFunction;
  private static final SubLObject $const66$CSQLLogicalConnective;
  private static final SubLObject $const67$CSQLQuantifier;
  private static final SubLObject $const68$CSQLConstantFunction;
  private static final SubLObject $const69$NLDefinitenessAttribute;
  private static final SubLObject $const70$NLQuantAttribute;
  private static final SubLObject $const71$ExistentialQuantifier_Bounded;
  private static final SubLObject $const72$EvaluatableRelation_Contextualize;
  private static final SubLObject $const73$PublicConstant;
  private static final SubLSymbol $sym74$PROPRIETARY_CONSTANT_;
  private static final SubLObject $const75$ProprietaryConstant;
  private static final SubLSymbol $sym76$_PROPRIETARY_CONSTANT__CACHING_STATE_;
  private static final SubLSymbol $sym77$CLEAR_PROPRIETARY_CONSTANT_;
  private static final SubLSymbol $sym78$PROPRIETARY_TERM_;
  private static final SubLObject $const79$ProprietaryTerm;
  private static final SubLSymbol $sym80$_PROPRIETARY_TERM__CACHING_STATE_;
  private static final SubLSymbol $sym81$CLEAR_PROPRIETARY_TERM_;
  private static final SubLObject $const82$ObsoleteConstant;
  private static final SubLSymbol $sym83$CITY_IN_ANY_MT_;
  private static final SubLObject $const84$City;
  private static final SubLSymbol $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_;
  private static final SubLObject $const86$GeographicalRegion;
  private static final SubLSymbol $sym87$COUNTRY_IN_ANY_MT_;
  private static final SubLObject $const88$Country;

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 886L)
  public static SubLObject fort_types(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return sbhl_cache.sbhl_cached_relations_for_node( $const0$isa, fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 1138L)
  public static SubLObject fort_has_typeP(final SubLObject fort, final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != forts.fort_p( fort ) )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding( thread );
      final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        sbhl_search_vars.$sbhl_justification_search_p$.bind( NIL, thread );
        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind( NIL, thread );
        result = sbhl_search_methods.sbhl_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$isa ), fort, type, mt, UNPROVIDED );
      }
      finally
      {
        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind( _prev_bind_5, thread );
        sbhl_search_vars.$sbhl_justification_search_p$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 2042L)
  public static SubLObject fort_has_cached_typeP(final SubLObject fort, final SubLObject type)
  {
    return ( NIL != sbhl_paranoia.check_sbhl_cachesP() ) ? sbhl_cache.sbhl_cached_predicate_relation_p( $const0$isa, fort, type, UNPROVIDED ) : fort_has_typeP( fort, type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 2365L)
  public static SubLObject fort_has_type_in_any_mtP(final SubLObject fort, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      result = fort_has_typeP( fort, type, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 2521L)
  public static SubLObject definitional_fort_type(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    assert NIL != forts.fort_p( fort ) : fort;
    return select_definitional_type( fort_types( fort, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 2759L)
  public static SubLObject select_definitional_type(final SubLObject types)
  {
    if( NIL != subl_promotions.memberP( $const4$Collection, types, UNPROVIDED, UNPROVIDED ) )
    {
      return $const4$Collection;
    }
    if( NIL != subl_promotions.memberP( $const5$Function_Denotational, types, UNPROVIDED, UNPROVIDED ) )
    {
      return $const5$Function_Denotational;
    }
    if( NIL != subl_promotions.memberP( $const6$Predicate, types, UNPROVIDED, UNPROVIDED ) )
    {
      return $const6$Predicate;
    }
    if( NIL != subl_promotions.memberP( $const7$Microtheory, types, UNPROVIDED, UNPROVIDED ) )
    {
      return $const7$Microtheory;
    }
    if( NIL == types )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 3245L)
  public static SubLObject all_forts_of_type(final SubLObject type)
  {
    return sbhl_cache.sbhl_all_subnodes_for_cached_node( $const0$isa, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 3345L)
  public static SubLObject genericP(final SubLObject fort)
  {
    return makeBoolean( NIL == collectionP( fort ) && NIL == predicateP( fort ) && NIL == mtP( fort ) && NIL == functionP( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 3596L)
  public static SubLObject collection_in_any_mtP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      result = fort_has_typeP( fort, $const4$Collection, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 3856L)
  public static SubLObject collectionP(final SubLObject fort)
  {
    return collection_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 3955L)
  public static SubLObject collection_p(final SubLObject fort)
  {
    return collection_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 4055L)
  public static SubLObject collection_order(final SubLObject v_term)
  {
    if( NIL != narts_high.naut_p( v_term ) )
    {
      return collection_order( genls.naut_genls( v_term, UNPROVIDED ).first() );
    }
    if( NIL == forts.fort_p( v_term ) )
    {
      return NIL;
    }
    if( NIL == collection_in_any_mtP( v_term ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != isa.isa_in_any_mtP( v_term, $const8$FirstOrderCollection ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != isa.isa_in_any_mtP( v_term, $const9$SecondOrderCollection ) )
    {
      return TWO_INTEGER;
    }
    if( NIL != isa.isa_in_any_mtP( v_term, $const10$ThirdOrderCollection ) )
    {
      return THREE_INTEGER;
    }
    if( NIL != isa.isa_in_any_mtP( v_term, $const11$FourthOrderCollection ) )
    {
      return FOUR_INTEGER;
    }
    return $kw12$MULTIORDINAL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 4581L)
  public static SubLObject random_collection()
  {
    SubLObject collection;
    for( collection = NIL; NIL == collection_p( collection ); collection = forts.random_fort( UNPROVIDED ) )
    {
    }
    return collection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 4905L)
  public static SubLObject list_of_collections_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( $sym13$COLLECTION_P, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 4999L)
  public static SubLObject isa_collectionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return collectionP( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const4$Collection, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const4$Collection, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 5235L)
  public static SubLObject isa_collection_in_any_mtP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return collectionP( v_term );
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      result = makeBoolean( NIL != isa.isaP( v_term, $const4$Collection, UNPROVIDED, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const4$Collection, v_term, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 5534L)
  public static SubLObject predicate_in_any_mtP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      result = fort_has_typeP( fort, $const6$Predicate, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 5733L)
  public static SubLObject predicateP(final SubLObject fort)
  {
    return predicate_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 5829L)
  public static SubLObject predicate_p(final SubLObject fort)
  {
    return predicate_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 5926L)
  public static SubLObject list_of_predicates_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( $sym14$PREDICATE_P, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6018L)
  public static SubLObject isa_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return predicateP( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const6$Predicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const6$Predicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6249L)
  public static SubLObject list_of_predicatesP(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( $sym15$ISA_PREDICATE_, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6343L)
  public static SubLObject fixed_arity_predicate_p(final SubLObject fort)
  {
    return makeBoolean( NIL != predicate_p( fort ) && NIL == variable_arity_relation_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6471L)
  public static SubLObject variable_arity_predicate_p(final SubLObject fort)
  {
    return makeBoolean( NIL != predicate_p( fort ) && NIL != variable_arity_relation_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6595L)
  public static SubLObject function_in_any_mtP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      result = fort_has_typeP( fort, $const5$Function_Denotational, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6847L)
  public static SubLObject functorP(final SubLObject fort)
  {
    return non_predicate_functionP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 6957L)
  public static SubLObject functor_p(final SubLObject fort)
  {
    return function_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 7064L)
  public static SubLObject non_predicate_functionP(final SubLObject fort)
  {
    return function_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 7185L)
  public static SubLObject functionP(final SubLObject fort)
  {
    return non_predicate_functionP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 7297L)
  public static SubLObject isa_functionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return functionP( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const5$Function_Denotational, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const5$Function_Denotational, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 7549L)
  public static SubLObject fixed_arity_functor_p(final SubLObject fort)
  {
    return makeBoolean( NIL != functor_p( fort ) && NIL == variable_arity_relation_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 7673L)
  public static SubLObject variable_arity_functor_p(final SubLObject fort)
  {
    return makeBoolean( NIL != functor_p( fort ) && NIL != variable_arity_relation_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 7793L)
  public static SubLObject mt_in_any_mtP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mtP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      mtP = fort_has_typeP( fort, $const7$Microtheory, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return mtP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 8106L)
  public static SubLObject mtP(final SubLObject fort)
  {
    return mt_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 8190L)
  public static SubLObject microtheory_p(final SubLObject fort)
  {
    return mt_in_any_mtP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 8284L)
  public static SubLObject isa_mtP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return mtP( v_term );
    }
    if( NIL != hlmt.hlmt_naut_p( v_term ) )
    {
      return hlmt.hlmtP( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const7$Microtheory, UNPROVIDED, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const7$Microtheory, v_term, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 8565L)
  public static SubLObject random_mt()
  {
    SubLObject mt;
    for( mt = NIL; NIL == microtheory_p( mt ); mt = forts.random_fort( UNPROVIDED ) )
    {
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 8860L)
  public static SubLObject relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const16$Relation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 10122L)
  public static SubLObject isa_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const16$Relation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const16$Relation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 10349L)
  public static SubLObject sentential_relation_p(final SubLObject fort)
  {
    return makeBoolean( NIL != logical_connective_p( fort ) || NIL != quantifier_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 10613L)
  public static SubLObject isa_sentential_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return sentential_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const17$SententialRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const17$SententialRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 10893L)
  public static SubLObject anti_symmetric_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const18$AntiSymmetricBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 11106L)
  public static SubLObject isa_anti_symmetric_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return anti_symmetric_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const18$AntiSymmetricBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const18$AntiSymmetricBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 11442L)
  public static SubLObject anti_transitive_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const19$AntiTransitiveBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 11659L)
  public static SubLObject isa_anti_transitive_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return anti_transitive_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const19$AntiTransitiveBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const19$AntiTransitiveBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 12000L)
  public static SubLObject arg_type_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const20$ArgTypeBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 12190L)
  public static SubLObject isa_arg_type_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return arg_type_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const20$ArgTypeBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const20$ArgTypeBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 12497L)
  public static SubLObject isa_arg_quoted_isa_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const21$ArgQuotedIsaBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const21$ArgQuotedIsaBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 12801L)
  public static SubLObject isa_arg_format_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const22$ArgFormatBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const22$ArgFormatBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 13038L)
  public static SubLObject arg_type_ternary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const23$ArgTypeTernaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 13231L)
  public static SubLObject isa_arg_type_ternary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return arg_type_ternary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const23$ArgTypeTernaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const23$ArgTypeTernaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 13542L)
  public static SubLObject isa_arg_quoted_isa_ternary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const24$ArgQuotedIsaTernaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const24$ArgQuotedIsaTernaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 13850L)
  public static SubLObject isa_arg_format_ternary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const25$ArgFormatTernaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const25$ArgFormatTernaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 14095L)
  public static SubLObject asymmetric_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const26$AsymmetricBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 14293L)
  public static SubLObject isa_asymmetric_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return asymmetric_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const26$AsymmetricBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const26$AsymmetricBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 14611L)
  public static SubLObject bookkeeping_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const27$BookkeepingPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 14786L)
  public static SubLObject isa_bookkeeping_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return bookkeeping_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const27$BookkeepingPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const27$BookkeepingPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 15076L)
  public static SubLObject underspecified_predicate_p(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fort_has_typeP( fort, $const28$UnderspecifiedPredicate, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 15270L)
  public static SubLObject isa_underspecified_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return underspecified_predicate_p( v_term, mt );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const28$UnderspecifiedPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const28$UnderspecifiedPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 15578L)
  public static SubLObject broad_microtheory_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const29$BroadMicrotheory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 15738L)
  public static SubLObject isa_broad_microtheoryP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return broad_microtheory_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const29$BroadMicrotheory, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const29$BroadMicrotheory, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 16008L)
  public static SubLObject commutative_relationP(final SubLObject relation)
  {
    return commutative_relation_p( relation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 16205L)
  public static SubLObject commutative_relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const34$CommutativeRelation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 16350L)
  public static SubLObject isa_commutative_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return commutative_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const34$CommutativeRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const34$CommutativeRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 16635L)
  public static SubLObject commutative_predicate_p(final SubLObject fort)
  {
    return makeBoolean( NIL != commutative_relation_p( fort ) && NIL != predicate_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 16892L)
  public static SubLObject isa_commutative_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return commutative_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const35$CommutativePredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const35$CommutativePredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 17182L)
  public static SubLObject distributing_meta_knowledge_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const36$DistributingMetaKnowledgePredicat );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 17419L)
  public static SubLObject isa_distributing_meta_knowledge_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return distributing_meta_knowledge_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const36$DistributingMetaKnowledgePredicat, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const36$DistributingMetaKnowledgePredicat, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 17785L)
  public static SubLObject forts_typed_distributing_meta_knowledge_predicate()
  {
    return all_forts_of_type( $const36$DistributingMetaKnowledgePredicat );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 18000L)
  public static SubLObject el_relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const37$ELRelation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 18136L)
  public static SubLObject isa_el_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return el_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const37$ELRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const37$ELRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 18377L)
  public static SubLObject evaluatable_function_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const38$EvaluatableFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 18581L)
  public static SubLObject isa_evaluatable_functionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return evaluatable_function_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const38$EvaluatableFunction, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const38$EvaluatableFunction, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 18866L)
  public static SubLObject evaluatable_predicate_p(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fort_has_typeP( fort, $const39$EvaluatablePredicate, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 19047L)
  public static SubLObject isa_evaluatable_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return evaluatable_predicate_p( v_term, mt );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const39$EvaluatablePredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const39$EvaluatablePredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 19340L)
  public static SubLObject existential_quantifier_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const40$ExistentialQuantifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 19519L)
  public static SubLObject isa_existential_quantifierP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return existential_quantifier_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const40$ExistentialQuantifier, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const40$ExistentialQuantifier, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 19814L)
  public static SubLObject irreflexive_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const41$IrreflexiveBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 20016L)
  public static SubLObject isa_irreflexive_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return irreflexive_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const41$IrreflexiveBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const41$IrreflexiveBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 20339L)
  public static SubLObject logical_connective_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const42$LogicalConnective );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 20502L)
  public static SubLObject isa_logical_connectiveP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return logical_connective_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const42$LogicalConnective, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const42$LogicalConnective, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 20777L)
  public static SubLObject microtheory_designating_relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const43$MicrotheoryDesignatingRelation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 20995L)
  public static SubLObject isa_microtheory_designating_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return microtheory_designating_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const43$MicrotheoryDesignatingRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const43$MicrotheoryDesignatingRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 21338L)
  public static SubLObject partially_commutative_relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const44$PartiallyCommutativeRelation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 21548L)
  public static SubLObject isa_partially_commutative_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return partially_commutative_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const44$PartiallyCommutativeRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const44$PartiallyCommutativeRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 21881L)
  public static SubLObject partially_commutative_predicate_p(final SubLObject fort)
  {
    return isa.isaP( fort, $const45$PartiallyCommutativePredicate, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 22173L)
  public static SubLObject isa_partially_commutative_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return partially_commutative_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const45$PartiallyCommutativePredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const45$PartiallyCommutativePredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 22511L)
  public static SubLObject problem_solving_context_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const46$ProblemSolvingCntxt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 22691L)
  public static SubLObject isa_problem_solving_contextP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return problem_solving_context_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const46$ProblemSolvingCntxt, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const46$ProblemSolvingCntxt, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 22985L)
  public static SubLObject quantifier_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const47$Quantifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 23117L)
  public static SubLObject isa_quantifierP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return quantifier_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const47$Quantifier, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const47$Quantifier, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 23354L)
  public static SubLObject reflexive_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const48$ReflexiveBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 23548L)
  public static SubLObject isa_reflexive_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return reflexive_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const48$ReflexiveBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const48$ReflexiveBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 23861L)
  public static SubLObject reifiable_function_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const49$ReifiableFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 24024L)
  public static SubLObject isa_reifiable_functionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return reifiable_function_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const49$ReifiableFunction, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const49$ReifiableFunction, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 24299L)
  public static SubLObject rule_macro_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const50$RuleMacroPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 24470L)
  public static SubLObject isa_rule_macro_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return rule_macro_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const50$RuleMacroPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const50$RuleMacroPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 24753L)
  public static SubLObject scoping_relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const51$ScopingRelation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 24909L)
  public static SubLObject isa_scoping_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return scoping_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const51$ScopingRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const51$ScopingRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 25174L)
  public static SubLObject sibling_disjoint_collection_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const52$SiblingDisjointCollectionType );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 25376L)
  public static SubLObject isa_sibling_disjoint_collectionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return sibling_disjoint_collection_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const52$SiblingDisjointCollectionType, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const52$SiblingDisjointCollectionType, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 25702L)
  public static SubLObject forts_typed_sibling_disjoint_collection()
  {
    return all_forts_of_type( $const52$SiblingDisjointCollectionType );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 25892L)
  public static SubLObject disjoint_collection_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const53$DisjointCollectionType );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 26063L)
  public static SubLObject skolem_functionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return at_defns.quiet_has_typeP( v_term, $const54$SkolemFunction, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 26223L)
  public static SubLObject skolem_function_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const54$SkolemFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 26353L)
  public static SubLObject skolem_fort_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != skolem_function_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 26460L)
  public static SubLObject isa_skolem_functionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return skolem_function_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const54$SkolemFunction, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const54$SkolemFunction, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 26720L)
  public static SubLObject symmetric_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const55$SymmetricBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 26914L)
  public static SubLObject isa_symmetric_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return symmetric_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const55$SymmetricBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const55$SymmetricBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 27227L)
  public static SubLObject transitive_binary_predicate_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const56$TransitiveBinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 27425L)
  public static SubLObject isa_transitive_binary_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return transitive_binary_predicate_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const56$TransitiveBinaryPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const56$TransitiveBinaryPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 27743L)
  public static SubLObject variable_arity_relation_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const57$VariableArityRelation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 27925L)
  public static SubLObject isa_variable_arity_relationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return variable_arity_relation_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const57$VariableArityRelation, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const57$VariableArityRelation, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 28223L)
  public static SubLObject documentation_predicate_p(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fort_has_typeP( fort, $const58$DocumentationPredicate, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 28412L)
  public static SubLObject isa_documentation_predicateP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return documentation_predicate_p( v_term, mt );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const58$DocumentationPredicate, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const58$DocumentationPredicate, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 28715L)
  public static SubLObject sksi_content_microtheory_p(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return fort_has_typeP( fort, $const59$SKSIContentMicrotheory, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 28899L)
  public static SubLObject isa_sksi_content_microtheoryP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return sksi_content_microtheory_p( v_term, mt );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const59$SKSIContentMicrotheory, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const59$SKSIContentMicrotheory, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 29208L)
  public static SubLObject sksi_external_term_denoting_function_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const60$SKSIExternalTermDenotingFunction, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 30218L)
  public static SubLObject isa_sksi_external_term_denoting_functionP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return sksi_external_term_denoting_function_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const60$SKSIExternalTermDenotingFunction );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const60$SKSIExternalTermDenotingFunction, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 30697L)
  public static SubLObject sksi_supported_comparison_predicate_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const61$SKSISupportedComparisonPredicate, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 30975L)
  public static SubLObject isa_sksi_supported_comparison_predicateP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return sksi_supported_comparison_predicate_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const61$SKSISupportedComparisonPredicate );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const61$SKSISupportedComparisonPredicate, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 31451L)
  public static SubLObject sksi_supported_function_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const62$SKSISupportedFunction, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 31683L)
  public static SubLObject isa_sksi_supported_functionP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return sksi_supported_function_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const62$SKSISupportedFunction );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const62$SKSISupportedFunction, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 32101L)
  public static SubLObject csql_comparison_predicate_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const63$CSQLComparisonPredicate, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 32340L)
  public static SubLObject isa_csql_comparison_predicateP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return csql_comparison_predicate_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const63$CSQLComparisonPredicate );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const63$CSQLComparisonPredicate, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 32767L)
  public static SubLObject sksi_supported_constant_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const64$SKSISupportedConstant, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 32997L)
  public static SubLObject isa_sksi_supported_constantP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return sksi_supported_constant_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const64$SKSISupportedConstant );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const64$SKSISupportedConstant, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 33415L)
  public static SubLObject csql_function_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const65$CSQLFunction, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 33607L)
  public static SubLObject isa_csql_functionP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return csql_function_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const65$CSQLFunction );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const65$CSQLFunction, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 33976L)
  public static SubLObject csql_logical_connective_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const66$CSQLLogicalConnective, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 34206L)
  public static SubLObject isa_csql_logical_connectiveP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return csql_logical_connective_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const66$CSQLLogicalConnective );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const66$CSQLLogicalConnective, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 34623L)
  public static SubLObject csql_quantifier_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const67$CSQLQuantifier, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 34823L)
  public static SubLObject isa_csql_quantifierP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return csql_quantifier_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const67$CSQLQuantifier );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const67$CSQLQuantifier, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 35202L)
  public static SubLObject csql_constant_p(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( fort, $const68$CSQLConstantFunction, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 35410L)
  public static SubLObject isa_csql_constantP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( v_term ) )
    {
      return csql_constant_p( v_term );
    }
    SubLObject ans = isa.isa_in_any_mtP( v_term, $const68$CSQLConstantFunction );
    if( NIL != ans )
    {
      return ans;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = at_defns.quiet_sufficient_defns_admitP( $const68$CSQLConstantFunction, v_term, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 35795L)
  public static SubLObject nl_definiteness_attributeP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( v_object, $const69$NLDefinitenessAttribute, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 35984L)
  public static SubLObject nl_quant_attributeP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( v_object, $const70$NLQuantAttribute, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 36162L)
  public static SubLObject bounded_existential_quantifier_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
      ans = fort_has_typeP( v_object, $const71$ExistentialQuantifier_Bounded, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 36377L)
  public static SubLObject evaluatable_relation_contextualized_p(final SubLObject fort)
  {
    return fort_has_type_in_any_mtP( fort, $const72$EvaluatableRelation_Contextualize );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 36609L)
  public static SubLObject isa_evaluatable_relation_contextualizedP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_term ) )
    {
      return evaluatable_relation_contextualized_p( v_term );
    }
    return makeBoolean( NIL != isa.isaP( v_term, $const72$EvaluatableRelation_Contextualize, mt, UNPROVIDED ) || NIL != at_defns.quiet_sufficient_defns_admitP( $const72$EvaluatableRelation_Contextualize, v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 36969L)
  public static SubLObject public_constantP(final SubLObject fort)
  {
    return isa.quoted_isa_in_any_mtP( fort, $const73$PublicConstant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37125L)
  public static SubLObject non_public_constantP(final SubLObject fort)
  {
    return makeBoolean( NIL != constant_handles.constant_p( fort ) && NIL == public_constantP( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37299L)
  public static SubLObject clear_proprietary_constantP()
  {
    final SubLObject cs = $proprietary_constantP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37299L)
  public static SubLObject remove_proprietary_constantP(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $proprietary_constantP_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37299L)
  public static SubLObject proprietary_constantP_internal(final SubLObject fort)
  {
    return isa.quoted_isa_in_any_mtP( fort, $const75$ProprietaryConstant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37299L)
  public static SubLObject proprietary_constantP(final SubLObject fort)
  {
    SubLObject caching_state = $proprietary_constantP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym74$PROPRIETARY_CONSTANT_, $sym76$_PROPRIETARY_CONSTANT__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_quoted_isa_dependent_cache_clear_callback( $sym77$CLEAR_PROPRIETARY_CONSTANT_ );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( proprietary_constantP_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37513L)
  public static SubLObject clear_proprietary_termP()
  {
    final SubLObject cs = $proprietary_termP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37513L)
  public static SubLObject remove_proprietary_termP(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $proprietary_termP_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37513L)
  public static SubLObject proprietary_termP_internal(final SubLObject fort)
  {
    return isa.quoted_isa_in_any_mtP( fort, $const79$ProprietaryTerm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37513L)
  public static SubLObject proprietary_termP(final SubLObject fort)
  {
    SubLObject caching_state = $proprietary_termP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym78$PROPRIETARY_TERM_, $sym80$_PROPRIETARY_TERM__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_quoted_isa_dependent_cache_clear_callback( $sym81$CLEAR_PROPRIETARY_TERM_ );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( proprietary_termP_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37719L)
  public static SubLObject obsolete_constantP(final SubLObject fort)
  {
    return isa.quoted_isa_in_any_mtP( fort, $const82$ObsoleteConstant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37877L)
  public static SubLObject city_in_any_mtP_internal(final SubLObject v_term)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL != isa.isa_in_any_mtP( v_term, $const84$City ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 37877L)
  public static SubLObject city_in_any_mtP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return city_in_any_mtP_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym83$CITY_IN_ANY_MT_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym83$CITY_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym83$CITY_IN_ANY_MT_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( city_in_any_mtP_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 38053L)
  public static SubLObject geographical_region_in_any_mtP_internal(final SubLObject v_term)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL != isa.isa_in_any_mtP( v_term, $const86$GeographicalRegion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 38053L)
  public static SubLObject geographical_region_in_any_mtP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return geographical_region_in_any_mtP_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( geographical_region_in_any_mtP_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 38233L)
  public static SubLObject country_in_any_mtP_internal(final SubLObject v_term)
  {
    return makeBoolean( NIL != kb_indexing_datastructures.indexed_term_p( v_term ) && NIL != isa.isa_in_any_mtP( v_term, $const88$Country ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fort-types-interface.lisp", position = 38233L)
  public static SubLObject country_in_any_mtP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return country_in_any_mtP_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym87$COUNTRY_IN_ANY_MT_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym87$COUNTRY_IN_ANY_MT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym87$COUNTRY_IN_ANY_MT_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( country_in_any_mtP_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_fort_types_interface_file()
  {
    SubLFiles.declareFunction( me, "fort_types", "FORT-TYPES", 1, 1, false );
    SubLFiles.declareFunction( me, "fort_has_typeP", "FORT-HAS-TYPE?", 2, 1, false );
    SubLFiles.declareFunction( me, "fort_has_cached_typeP", "FORT-HAS-CACHED-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_has_type_in_any_mtP", "FORT-HAS-TYPE-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "definitional_fort_type", "DEFINITIONAL-FORT-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "select_definitional_type", "SELECT-DEFINITIONAL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_forts_of_type", "ALL-FORTS-OF-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "genericP", "GENERIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_in_any_mtP", "COLLECTION-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "collectionP", "COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_p", "COLLECTION-P", 1, 0, false );
    new $collection_p$UnaryFunction();
    SubLFiles.declareFunction( me, "collection_order", "COLLECTION-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "random_collection", "RANDOM-COLLECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "list_of_collections_p", "LIST-OF-COLLECTIONS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_collectionP", "ISA-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_collection_in_any_mtP", "ISA-COLLECTION-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_in_any_mtP", "PREDICATE-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "predicateP", "PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_p", "PREDICATE-P", 1, 0, false );
    new $predicate_p$UnaryFunction();
    SubLFiles.declareFunction( me, "list_of_predicates_p", "LIST-OF-PREDICATES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_predicateP", "ISA-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "list_of_predicatesP", "LIST-OF-PREDICATES?", 1, 0, false );
    SubLFiles.declareFunction( me, "fixed_arity_predicate_p", "FIXED-ARITY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_arity_predicate_p", "VARIABLE-ARITY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "function_in_any_mtP", "FUNCTION-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "functorP", "FUNCTOR?", 1, 0, false );
    SubLFiles.declareFunction( me, "functor_p", "FUNCTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_predicate_functionP", "NON-PREDICATE-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "functionP", "FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_functionP", "ISA-FUNCTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "fixed_arity_functor_p", "FIXED-ARITY-FUNCTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_arity_functor_p", "VARIABLE-ARITY-FUNCTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_in_any_mtP", "MT-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "mtP", "MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "microtheory_p", "MICROTHEORY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_mtP", "ISA-MT?", 1, 1, false );
    SubLFiles.declareFunction( me, "random_mt", "RANDOM-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "relation_p", "RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_relationP", "ISA-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "sentential_relation_p", "SENTENTIAL-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_sentential_relationP", "ISA-SENTENTIAL-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "anti_symmetric_binary_predicate_p", "ANTI-SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_anti_symmetric_binary_predicateP", "ISA-ANTI-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "anti_transitive_binary_predicate_p", "ANTI-TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_anti_transitive_binary_predicateP", "ISA-ANTI-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_type_binary_predicate_p", "ARG-TYPE-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_arg_type_binary_predicateP", "ISA-ARG-TYPE-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_arg_quoted_isa_binary_predicateP", "ISA-ARG-QUOTED-ISA-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_arg_format_binary_predicateP", "ISA-ARG-FORMAT-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_type_ternary_predicate_p", "ARG-TYPE-TERNARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_arg_type_ternary_predicateP", "ISA-ARG-TYPE-TERNARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_arg_quoted_isa_ternary_predicateP", "ISA-ARG-QUOTED-ISA-TERNARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_arg_format_ternary_predicateP", "ISA-ARG-FORMAT-TERNARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "asymmetric_binary_predicate_p", "ASYMMETRIC-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_asymmetric_binary_predicateP", "ISA-ASYMMETRIC-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "bookkeeping_predicate_p", "BOOKKEEPING-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_bookkeeping_predicateP", "ISA-BOOKKEEPING-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "underspecified_predicate_p", "UNDERSPECIFIED-PREDICATE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_underspecified_predicateP", "ISA-UNDERSPECIFIED-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "broad_microtheory_p", "BROAD-MICROTHEORY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_broad_microtheoryP", "ISA-BROAD-MICROTHEORY?", 1, 1, false );
    SubLFiles.declareFunction( me, "commutative_relationP", "COMMUTATIVE-RELATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "commutative_relation_p", "COMMUTATIVE-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_commutative_relationP", "ISA-COMMUTATIVE-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "commutative_predicate_p", "COMMUTATIVE-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_commutative_predicateP", "ISA-COMMUTATIVE-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "distributing_meta_knowledge_predicate_p", "DISTRIBUTING-META-KNOWLEDGE-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_distributing_meta_knowledge_predicateP", "ISA-DISTRIBUTING-META-KNOWLEDGE-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "forts_typed_distributing_meta_knowledge_predicate", "FORTS-TYPED-DISTRIBUTING-META-KNOWLEDGE-PREDICATE", 0, 0, false );
    SubLFiles.declareFunction( me, "el_relation_p", "EL-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_el_relationP", "ISA-EL-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "evaluatable_function_p", "EVALUATABLE-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_evaluatable_functionP", "ISA-EVALUATABLE-FUNCTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "evaluatable_predicate_p", "EVALUATABLE-PREDICATE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_evaluatable_predicateP", "ISA-EVALUATABLE-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "existential_quantifier_p", "EXISTENTIAL-QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_existential_quantifierP", "ISA-EXISTENTIAL-QUANTIFIER?", 1, 1, false );
    SubLFiles.declareFunction( me, "irreflexive_binary_predicate_p", "IRREFLEXIVE-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_irreflexive_binary_predicateP", "ISA-IRREFLEXIVE-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "logical_connective_p", "LOGICAL-CONNECTIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_logical_connectiveP", "ISA-LOGICAL-CONNECTIVE?", 1, 1, false );
    SubLFiles.declareFunction( me, "microtheory_designating_relation_p", "MICROTHEORY-DESIGNATING-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_microtheory_designating_relationP", "ISA-MICROTHEORY-DESIGNATING-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "partially_commutative_relation_p", "PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_partially_commutative_relationP", "ISA-PARTIALLY-COMMUTATIVE-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "partially_commutative_predicate_p", "PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_partially_commutative_predicateP", "ISA-PARTIALLY-COMMUTATIVE-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "problem_solving_context_p", "PROBLEM-SOLVING-CONTEXT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_problem_solving_contextP", "ISA-PROBLEM-SOLVING-CONTEXT?", 1, 1, false );
    SubLFiles.declareFunction( me, "quantifier_p", "QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_quantifierP", "ISA-QUANTIFIER?", 1, 1, false );
    SubLFiles.declareFunction( me, "reflexive_binary_predicate_p", "REFLEXIVE-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_reflexive_binary_predicateP", "ISA-REFLEXIVE-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "reifiable_function_p", "REIFIABLE-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_reifiable_functionP", "ISA-REIFIABLE-FUNCTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "rule_macro_predicate_p", "RULE-MACRO-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_rule_macro_predicateP", "ISA-RULE-MACRO-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "scoping_relation_p", "SCOPING-RELATION-P", 1, 0, false );
    new $scoping_relation_p$UnaryFunction();
    SubLFiles.declareFunction( me, "isa_scoping_relationP", "ISA-SCOPING-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "sibling_disjoint_collection_p", "SIBLING-DISJOINT-COLLECTION-P", 1, 0, false );
    new $sibling_disjoint_collection_p$UnaryFunction();
    SubLFiles.declareFunction( me, "isa_sibling_disjoint_collectionP", "ISA-SIBLING-DISJOINT-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "forts_typed_sibling_disjoint_collection", "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "disjoint_collection_p", "DISJOINT-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_functionP", "SKOLEM-FUNCTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "skolem_function_p", "SKOLEM-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_fort_p", "SKOLEM-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_skolem_functionP", "ISA-SKOLEM-FUNCTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "symmetric_binary_predicate_p", "SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_symmetric_binary_predicateP", "ISA-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "transitive_binary_predicate_p", "TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_transitive_binary_predicateP", "ISA-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "variable_arity_relation_p", "VARIABLE-ARITY-RELATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_variable_arity_relationP", "ISA-VARIABLE-ARITY-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "documentation_predicate_p", "DOCUMENTATION-PREDICATE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_documentation_predicateP", "ISA-DOCUMENTATION-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_content_microtheory_p", "SKSI-CONTENT-MICROTHEORY-P", 1, 1, false );
    SubLFiles.declareFunction( me, "isa_sksi_content_microtheoryP", "ISA-SKSI-CONTENT-MICROTHEORY?", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_external_term_denoting_function_p", "SKSI-EXTERNAL-TERM-DENOTING-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_sksi_external_term_denoting_functionP", "ISA-SKSI-EXTERNAL-TERM-DENOTING-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_comparison_predicate_p", "SKSI-SUPPORTED-COMPARISON-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_sksi_supported_comparison_predicateP", "ISA-SKSI-SUPPORTED-COMPARISON-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_function_p", "SKSI-SUPPORTED-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_sksi_supported_functionP", "ISA-SKSI-SUPPORTED-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_comparison_predicate_p", "CSQL-COMPARISON-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_csql_comparison_predicateP", "ISA-CSQL-COMPARISON-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_constant_p", "SKSI-SUPPORTED-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_sksi_supported_constantP", "ISA-SKSI-SUPPORTED-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_function_p", "CSQL-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_csql_functionP", "ISA-CSQL-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_logical_connective_p", "CSQL-LOGICAL-CONNECTIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_csql_logical_connectiveP", "ISA-CSQL-LOGICAL-CONNECTIVE?", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_quantifier_p", "CSQL-QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_csql_quantifierP", "ISA-CSQL-QUANTIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "csql_constant_p", "CSQL-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_csql_constantP", "ISA-CSQL-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_definiteness_attributeP", "NL-DEFINITENESS-ATTRIBUTE?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_quant_attributeP", "NL-QUANT-ATTRIBUTE?", 1, 0, false );
    SubLFiles.declareFunction( me, "bounded_existential_quantifier_p", "BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluatable_relation_contextualized_p", "EVALUATABLE-RELATION-CONTEXTUALIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_evaluatable_relation_contextualizedP", "ISA-EVALUATABLE-RELATION-CONTEXTUALIZED?", 1, 1, false );
    SubLFiles.declareFunction( me, "public_constantP", "PUBLIC-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_public_constantP", "NON-PUBLIC-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_proprietary_constantP", "CLEAR-PROPRIETARY-CONSTANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_proprietary_constantP", "REMOVE-PROPRIETARY-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "proprietary_constantP_internal", "PROPRIETARY-CONSTANT?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proprietary_constantP", "PROPRIETARY-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_proprietary_termP", "CLEAR-PROPRIETARY-TERM?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_proprietary_termP", "REMOVE-PROPRIETARY-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "proprietary_termP_internal", "PROPRIETARY-TERM?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "proprietary_termP", "PROPRIETARY-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "obsolete_constantP", "OBSOLETE-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "city_in_any_mtP_internal", "CITY-IN-ANY-MT?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "city_in_any_mtP", "CITY-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_region_in_any_mtP_internal", "GEOGRAPHICAL-REGION-IN-ANY-MT?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_region_in_any_mtP", "GEOGRAPHICAL-REGION-IN-ANY-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "country_in_any_mtP_internal", "COUNTRY-IN-ANY-MT?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "country_in_any_mtP", "COUNTRY-IN-ANY-MT?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_fort_types_interface_file()
  {
    $proprietary_constantP_caching_state$ = SubLFiles.deflexical( "*PROPRIETARY-CONSTANT?-CACHING-STATE*", NIL );
    $proprietary_termP_caching_state$ = SubLFiles.deflexical( "*PROPRIETARY-TERM?-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_fort_types_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym30$COMMUTATIVE_RELATION_, $list31, $str32$Return_T_iff_RELATION_is_a_commut, NIL, $list33 );
    memoization_state.note_globally_cached_function( $sym74$PROPRIETARY_CONSTANT_ );
    memoization_state.note_globally_cached_function( $sym78$PROPRIETARY_TERM_ );
    memoization_state.note_memoized_function( $sym83$CITY_IN_ANY_MT_ );
    memoization_state.note_memoized_function( $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_ );
    memoization_state.note_memoized_function( $sym87$COUNTRY_IN_ANY_MT_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_fort_types_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_fort_types_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_fort_types_interface_file();
  }
  static
  {
    me = new fort_types_interface();
    $proprietary_constantP_caching_state$ = null;
    $proprietary_termP_caching_state$ = null;
    $const0$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym1$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const2$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym3$FORT_P = makeSymbol( "FORT-P" );
    $const4$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const5$Function_Denotational = constant_handles.reader_make_constant_shell( makeString( "Function-Denotational" ) );
    $const6$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $const7$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $const8$FirstOrderCollection = constant_handles.reader_make_constant_shell( makeString( "FirstOrderCollection" ) );
    $const9$SecondOrderCollection = constant_handles.reader_make_constant_shell( makeString( "SecondOrderCollection" ) );
    $const10$ThirdOrderCollection = constant_handles.reader_make_constant_shell( makeString( "ThirdOrderCollection" ) );
    $const11$FourthOrderCollection = constant_handles.reader_make_constant_shell( makeString( "FourthOrderCollection" ) );
    $kw12$MULTIORDINAL = makeKeyword( "MULTIORDINAL" );
    $sym13$COLLECTION_P = makeSymbol( "COLLECTION-P" );
    $sym14$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $sym15$ISA_PREDICATE_ = makeSymbol( "ISA-PREDICATE?" );
    $const16$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $const17$SententialRelation = constant_handles.reader_make_constant_shell( makeString( "SententialRelation" ) );
    $const18$AntiSymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AntiSymmetricBinaryPredicate" ) );
    $const19$AntiTransitiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AntiTransitiveBinaryPredicate" ) );
    $const20$ArgTypeBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgTypeBinaryPredicate" ) );
    $const21$ArgQuotedIsaBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgQuotedIsaBinaryPredicate" ) );
    $const22$ArgFormatBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgFormatBinaryPredicate" ) );
    $const23$ArgTypeTernaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgTypeTernaryPredicate" ) );
    $const24$ArgQuotedIsaTernaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgQuotedIsaTernaryPredicate" ) );
    $const25$ArgFormatTernaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgFormatTernaryPredicate" ) );
    $const26$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AsymmetricBinaryPredicate" ) );
    $const27$BookkeepingPredicate = constant_handles.reader_make_constant_shell( makeString( "BookkeepingPredicate" ) );
    $const28$UnderspecifiedPredicate = constant_handles.reader_make_constant_shell( makeString( "UnderspecifiedPredicate" ) );
    $const29$BroadMicrotheory = constant_handles.reader_make_constant_shell( makeString( "BroadMicrotheory" ) );
    $sym30$COMMUTATIVE_RELATION_ = makeSymbol( "COMMUTATIVE-RELATION?" );
    $list31 = ConsesLow.list( makeSymbol( "RELATION" ) );
    $str32$Return_T_iff_RELATION_is_a_commut = makeString( "Return T iff RELATION is a commutative relation." );
    $list33 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $const34$CommutativeRelation = constant_handles.reader_make_constant_shell( makeString( "CommutativeRelation" ) );
    $const35$CommutativePredicate = constant_handles.reader_make_constant_shell( makeString( "CommutativePredicate" ) );
    $const36$DistributingMetaKnowledgePredicat = constant_handles.reader_make_constant_shell( makeString( "DistributingMetaKnowledgePredicate" ) );
    $const37$ELRelation = constant_handles.reader_make_constant_shell( makeString( "ELRelation" ) );
    $const38$EvaluatableFunction = constant_handles.reader_make_constant_shell( makeString( "EvaluatableFunction" ) );
    $const39$EvaluatablePredicate = constant_handles.reader_make_constant_shell( makeString( "EvaluatablePredicate" ) );
    $const40$ExistentialQuantifier = constant_handles.reader_make_constant_shell( makeString( "ExistentialQuantifier" ) );
    $const41$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "IrreflexiveBinaryPredicate" ) );
    $const42$LogicalConnective = constant_handles.reader_make_constant_shell( makeString( "LogicalConnective" ) );
    $const43$MicrotheoryDesignatingRelation = constant_handles.reader_make_constant_shell( makeString( "MicrotheoryDesignatingRelation" ) );
    $const44$PartiallyCommutativeRelation = constant_handles.reader_make_constant_shell( makeString( "PartiallyCommutativeRelation" ) );
    $const45$PartiallyCommutativePredicate = constant_handles.reader_make_constant_shell( makeString( "PartiallyCommutativePredicate" ) );
    $const46$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell( makeString( "ProblemSolvingCntxt" ) );
    $const47$Quantifier = constant_handles.reader_make_constant_shell( makeString( "Quantifier" ) );
    $const48$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ReflexiveBinaryPredicate" ) );
    $const49$ReifiableFunction = constant_handles.reader_make_constant_shell( makeString( "ReifiableFunction" ) );
    $const50$RuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "RuleMacroPredicate" ) );
    $const51$ScopingRelation = constant_handles.reader_make_constant_shell( makeString( "ScopingRelation" ) );
    $const52$SiblingDisjointCollectionType = constant_handles.reader_make_constant_shell( makeString( "SiblingDisjointCollectionType" ) );
    $const53$DisjointCollectionType = constant_handles.reader_make_constant_shell( makeString( "DisjointCollectionType" ) );
    $const54$SkolemFunction = constant_handles.reader_make_constant_shell( makeString( "SkolemFunction" ) );
    $const55$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "SymmetricBinaryPredicate" ) );
    $const56$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "TransitiveBinaryPredicate" ) );
    $const57$VariableArityRelation = constant_handles.reader_make_constant_shell( makeString( "VariableArityRelation" ) );
    $const58$DocumentationPredicate = constant_handles.reader_make_constant_shell( makeString( "DocumentationPredicate" ) );
    $const59$SKSIContentMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SKSIContentMicrotheory" ) );
    $const60$SKSIExternalTermDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "SKSIExternalTermDenotingFunction" ) );
    $const61$SKSISupportedComparisonPredicate = constant_handles.reader_make_constant_shell( makeString( "SKSISupportedComparisonPredicate" ) );
    $const62$SKSISupportedFunction = constant_handles.reader_make_constant_shell( makeString( "SKSISupportedFunction" ) );
    $const63$CSQLComparisonPredicate = constant_handles.reader_make_constant_shell( makeString( "CSQLComparisonPredicate" ) );
    $const64$SKSISupportedConstant = constant_handles.reader_make_constant_shell( makeString( "SKSISupportedConstant" ) );
    $const65$CSQLFunction = constant_handles.reader_make_constant_shell( makeString( "CSQLFunction" ) );
    $const66$CSQLLogicalConnective = constant_handles.reader_make_constant_shell( makeString( "CSQLLogicalConnective" ) );
    $const67$CSQLQuantifier = constant_handles.reader_make_constant_shell( makeString( "CSQLQuantifier" ) );
    $const68$CSQLConstantFunction = constant_handles.reader_make_constant_shell( makeString( "CSQLConstantFunction" ) );
    $const69$NLDefinitenessAttribute = constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessAttribute" ) );
    $const70$NLQuantAttribute = constant_handles.reader_make_constant_shell( makeString( "NLQuantAttribute" ) );
    $const71$ExistentialQuantifier_Bounded = constant_handles.reader_make_constant_shell( makeString( "ExistentialQuantifier-Bounded" ) );
    $const72$EvaluatableRelation_Contextualize = constant_handles.reader_make_constant_shell( makeString( "EvaluatableRelation-Contextualized" ) );
    $const73$PublicConstant = constant_handles.reader_make_constant_shell( makeString( "PublicConstant" ) );
    $sym74$PROPRIETARY_CONSTANT_ = makeSymbol( "PROPRIETARY-CONSTANT?" );
    $const75$ProprietaryConstant = constant_handles.reader_make_constant_shell( makeString( "ProprietaryConstant" ) );
    $sym76$_PROPRIETARY_CONSTANT__CACHING_STATE_ = makeSymbol( "*PROPRIETARY-CONSTANT?-CACHING-STATE*" );
    $sym77$CLEAR_PROPRIETARY_CONSTANT_ = makeSymbol( "CLEAR-PROPRIETARY-CONSTANT?" );
    $sym78$PROPRIETARY_TERM_ = makeSymbol( "PROPRIETARY-TERM?" );
    $const79$ProprietaryTerm = constant_handles.reader_make_constant_shell( makeString( "ProprietaryTerm" ) );
    $sym80$_PROPRIETARY_TERM__CACHING_STATE_ = makeSymbol( "*PROPRIETARY-TERM?-CACHING-STATE*" );
    $sym81$CLEAR_PROPRIETARY_TERM_ = makeSymbol( "CLEAR-PROPRIETARY-TERM?" );
    $const82$ObsoleteConstant = constant_handles.reader_make_constant_shell( makeString( "ObsoleteConstant" ) );
    $sym83$CITY_IN_ANY_MT_ = makeSymbol( "CITY-IN-ANY-MT?" );
    $const84$City = constant_handles.reader_make_constant_shell( makeString( "City" ) );
    $sym85$GEOGRAPHICAL_REGION_IN_ANY_MT_ = makeSymbol( "GEOGRAPHICAL-REGION-IN-ANY-MT?" );
    $const86$GeographicalRegion = constant_handles.reader_make_constant_shell( makeString( "GeographicalRegion" ) );
    $sym87$COUNTRY_IN_ANY_MT_ = makeSymbol( "COUNTRY-IN-ANY-MT?" );
    $const88$Country = constant_handles.reader_make_constant_shell( makeString( "Country" ) );
  }

  public static final class $collection_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $collection_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "COLLECTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return collection_p( arg1 );
    }
  }

  public static final class $predicate_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $predicate_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREDICATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return predicate_p( arg1 );
    }
  }

  public static final class $scoping_relation_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $scoping_relation_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SCOPING-RELATION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return scoping_relation_p( arg1 );
    }
  }

  public static final class $sibling_disjoint_collection_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sibling_disjoint_collection_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SIBLING-DISJOINT-COLLECTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sibling_disjoint_collection_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 450 ms
 * 
 */