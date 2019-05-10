package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.el_grammar;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_isa
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa";
  public static final String myFingerPrint = "72637670105c1fe957953398107292be7a90b882811e59f2fbf7ac38804173dd";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3783L)
  private static SubLSymbol $isa_fort_collection_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4076L)
  private static SubLSymbol $isa_non_fort_collection_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 6085L)
  private static SubLSymbol $default_not_isa_collection_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8592L)
  private static SubLSymbol $isa_fort_defn_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8815L)
  private static SubLSymbol $isa_non_fort_defn_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13640L)
  private static SubLSymbol $all_instances_lazy_iteration_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 43304L)
  private static SubLSymbol $subcollection_functors$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59003L)
  private static SubLSymbol $quoted_isa_fort_collection_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59381L)
  private static SubLSymbol $quoted_isa_non_fort_collection_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61354L)
  private static SubLSymbol $default_not_quoted_isa_collection_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62192L)
  private static SubLSymbol $quoted_isa_fort_defn_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62429L)
  private static SubLSymbol $quoted_isa_non_fort_defn_cost$;
  private static final SubLObject $const0$isa;
  private static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
  private static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
  private static final SubLSymbol $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG;
  private static final SubLSymbol $kw4$REMOVAL_ABDUCTION_POS_CHECK;
  private static final SubLSymbol $kw5$REMOVAL_ABDUCTION_POS_UNIFY;
  private static final SubLSymbol $kw6$REMOVAL_RELATION_ALL_EXISTS_CHECK;
  private static final SubLSymbol $kw7$REMOVAL_RELATION_ALL_EXISTS_UNIFY;
  private static final SubLSymbol $kw8$REMOVAL_RELATION_EXISTS_ALL_CHECK;
  private static final SubLSymbol $kw9$REMOVAL_BACKCHAIN_REQUIRED_PRUNE;
  private static final SubLSymbol $kw10$POS;
  private static final SubLSymbol $kw11$NEG;
  private static final SubLSymbol $kw12$ALL_INSTANCES_POS;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$PREFERRED;
  private static final SubLSymbol $kw15$DISPREFERRED;
  private static final SubLSymbol $kw16$DISALLOWED;
  private static final SubLSymbol $kw17$GROSSLY_DISPREFERRED;
  private static final SubLSymbol $kw18$ALL_ISA_POS;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$ALL_ELEMENTOF_POS;
  private static final SubLList $list21;
  private static final SubLFloat $float22$0_1;
  private static final SubLSymbol $kw23$REMOVAL_ISA_COLLECTION_CHECK_POS;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$REMOVAL_ISA_COLLECTION_CHECK_NEG;
  private static final SubLList $list26;
  private static final SubLInteger $int27$30;
  private static final SubLSymbol $kw28$ISA;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$MINIMIZE;
  private static final SubLSymbol $kw31$REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$TRUE;
  private static final SubLSymbol $kw36$GAF_ARG;
  private static final SubLSymbol $kw37$GAF;
  private static final SubLSymbol $kw38$PREDICATE_EXTENT;
  private static final SubLSymbol $kw39$OVERLAP;
  private static final SubLSymbol $kw40$REMOVAL_ISA_DEFN_POS;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$REMOVAL_ISA_DEFN_NEG;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$DEFN;
  private static final SubLSymbol $kw45$REMOVAL_ALL_ISA;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym48$REMOVAL_ALL_ISA_EXPAND;
  private static final SubLSymbol $kw49$GROSSLY_INCOMPLETE;
  private static final SubLSymbol $kw50$COMPLETE;
  private static final SubLInteger $int51$2300;
  private static final SubLSymbol $kw52$REMOVAL_ALL_INSTANCES;
  private static final SubLList $list53;
  private static final SubLObject $const54$elementOf;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$ELEMENTOF;
  private static final SubLSymbol $kw57$TRUE_MON;
  private static final SubLSymbol $kw58$REMOVAL_ELEMENTOF_CHECK;
  private static final SubLList $list59;
  private static final SubLSymbol $kw60$REMOVAL_NOT_ELEMENTOF_CHECK;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$REMOVAL_ELEMENTOF_COLLECTION_CHECK;
  private static final SubLList $list63;
  private static final SubLSymbol $kw64$REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$REMOVAL_ELEMENTOF_SET_CHECK;
  private static final SubLList $list67;
  private static final SubLSymbol $kw68$REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$REMOVAL_NOT_ELEMENTOF_SET_CHECK;
  private static final SubLList $list73;
  private static final SubLSymbol $kw74$OPAQUE;
  private static final SubLSymbol $kw75$REMOVAL_ELEMENTOF_THESETOF_CHECK;
  private static final SubLList $list76;
  private static final SubLSymbol $kw77$REMOVAL_ISA_THECOLLECTIONOF_CHECK;
  private static final SubLList $list78;
  private static final SubLSymbol $kw79$QUERY;
  private static final SubLSymbol $kw80$REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK;
  private static final SubLList $list81;
  private static final SubLSymbol $kw82$REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK;
  private static final SubLList $list83;
  private static final SubLSymbol $kw84$REMOVAL_ALL_ELEMENTOF;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$REMOVAL_NAT_ALL_ELEMENTOF;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLSymbol $kw90$REMOVAL_ELEMENTOF_UNIFY;
  private static final SubLList $list91;
  private static final SubLSymbol $kw92$REMOVAL_ELEMENTOF_COLLECTION_UNIFY;
  private static final SubLList $list93;
  private static final SubLSymbol $kw94$REMOVAL_ELEMENTOF_SET_UNIFY;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$EL_LITERAL_P;
  private static final SubLSymbol $kw97$HL;
  private static final SubLSymbol $kw98$REMOVAL_ELEMENTOF_THESETOF_UNIFY;
  private static final SubLList $list99;
  private static final SubLSymbol $kw100$REMOVAL_ISA_THECOLLECTIONOF_UNIFY;
  private static final SubLList $list101;
  private static final SubLObject $const102$TheSetOf;
  private static final SubLObject $const103$subcollectionFunctionDefiningRule;
  private static final SubLString $str104$Expected__s_to_have_only_one_free;
  private static final SubLString $str105$Expected_exactly_one_poslit_in__S;
  private static final SubLString $str106$Expected_exactly_one___termOfUnit;
  private static final SubLList $list107;
  private static final SubLSymbol $kw108$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY;
  private static final SubLList $list109;
  private static final SubLSymbol $kw110$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK;
  private static final SubLList $list111;
  private static final SubLSymbol $kw112$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY;
  private static final SubLList $list113;
  private static final SubLSymbol $kw114$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK;
  private static final SubLList $list115;
  private static final SubLSymbol $kw116$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY;
  private static final SubLList $list117;
  private static final SubLSymbol $kw118$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK;
  private static final SubLList $list119;
  private static final SubLSymbol $kw120$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY;
  private static final SubLList $list121;
  private static final SubLSymbol $kw122$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY;
  private static final SubLList $list125;
  private static final SubLSymbol $kw126$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK;
  private static final SubLList $list127;
  private static final SubLSymbol $kw128$REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY;
  private static final SubLList $list129;
  private static final SubLSymbol $kw130$REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK;
  private static final SubLList $list131;
  private static final SubLSymbol $kw132$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY;
  private static final SubLList $list133;
  private static final SubLSymbol $kw134$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK;
  private static final SubLList $list135;
  private static final SubLSymbol $kw136$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY;
  private static final SubLList $list137;
  private static final SubLSymbol $kw138$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK;
  private static final SubLList $list139;
  private static final SubLSymbol $kw140$REMOVAL_ALL_ISA_OF_TYPE;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$BINARY_CLAUSE_P;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$FORT_P;
  private static final SubLList $list145;
  private static final SubLList $list146;
  private static final SubLList $list147;
  private static final SubLObject $const148$quotedIsa;
  private static final SubLSymbol $kw149$ALL_QUOTED_INSTANCES_POS;
  private static final SubLList $list150;
  private static final SubLSymbol $kw151$ALL_QUOTED_ISA_POS;
  private static final SubLList $list152;
  private static final SubLSymbol $kw153$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS;
  private static final SubLList $list154;
  private static final SubLSymbol $kw155$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG;
  private static final SubLList $list156;
  private static final SubLSymbol $kw157$REMOVAL_QUOTED_ISA_DEFN_POS;
  private static final SubLList $list158;
  private static final SubLSymbol $kw159$REMOVAL_QUOTED_ISA_DEFN_NEG;
  private static final SubLList $list160;
  private static final SubLSymbol $kw161$REMOVAL_NAT_QUOTED_ISA;
  private static final SubLList $list162;
  private static final SubLSymbol $kw163$REMOVAL_ALL_QUOTED_ISA;
  private static final SubLList $list164;
  private static final SubLSymbol $kw165$REMOVAL_NAT_ALL_QUOTED_ISA;
  private static final SubLList $list166;
  private static final SubLSymbol $kw167$REMOVAL_ALL_QUOTED_INSTANCES;
  private static final SubLList $list168;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 2283L)
  public static SubLObject all_instances_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject var = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg_bindableP = list_utilities.member_eqP( var, bindable_vars );
    if( NIL != cycl_grammar.cycl_nat_p( col ) && NIL != subcollection_functor_p( cycl_utilities.nat_functor( col ) ) )
    {
      return $kw14$PREFERRED;
    }
    if( NIL != fort_types_interface.collection_p( col ) )
    {
      final SubLObject completeness = inference_collection_iteration_completeness( col );
      SubLObject preference = preference_modules.completeness_to_preference_level( completeness );
      if( NIL != arg_bindableP && NIL != preference_modules.preference_level_LE( preference, $kw15$DISPREFERRED ) && NIL != kb_accessors.check_preferred_collectionP( col, UNPROVIDED ) )
      {
        preference = $kw16$DISALLOWED;
      }
      return preference;
    }
    return $kw17$GROSSLY_DISPREFERRED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3506L)
  public static SubLObject inference_all_isas_of_type(final SubLObject ins, final SubLObject type_col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != forts.fort_p( ins ) && NIL != inference_trampolines.inference_collectionP( type_col, UNPROVIDED ) )
      {
        result = isa.all_isas_wrt( ins, type_col, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4216L)
  public static SubLObject removal_isa_collection_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != forts.fort_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) )
    {
      return $isa_fort_collection_cost$.getGlobalValue();
    }
    return $isa_non_fort_collection_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4443L)
  public static SubLObject removal_isa_collection_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_isa_collection_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4594L)
  public static SubLObject removal_isa_collection_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_collection_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4747L)
  public static SubLObject removal_isa_collection_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_isa_collection_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 5695L)
  public static SubLObject removal_isa_collection_check_expand(final SubLObject asent)
  {
    final SubLObject v_object = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( !function_terms.term_functional_complexity( v_object ).numGE( $int27$30 ) && NIL != isa.isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 6152L)
  public static SubLObject removal_not_isa_collection_check_cost(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) )
    {
      return removal_isa_collection_check_pos_cost( asent, UNPROVIDED );
    }
    return $default_not_isa_collection_check_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 6397L)
  public static SubLObject removal_not_isa_collection_check_expand(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_object = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    collection = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == isa.isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw30$MINIMIZE, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != isa.not_isa_by_sbhlP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 7315L)
  public static SubLObject removal_isa_naut_collection_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return control_vars.$hl_module_check_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 7487L)
  public static SubLObject removal_isa_naut_collection_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_naut_collection_lookup_pos_expand( asent, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8133L)
  public static SubLObject removal_isa_naut_collection_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) )
    {
      return control_vars.$hl_module_check_cost$.getDynamicValue( thread );
    }
    return kb_indexing.num_best_gaf_lookup_index( asent, $kw35$TRUE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8381L)
  public static SubLObject removal_isa_naut_collection_lookup_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( asent, sense );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw36$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw37$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$1 = NIL;
                  final SubLObject token_var_$2 = NIL;
                  while ( NIL == done_var_$1)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                    final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                    if( NIL != valid_$3 )
                    {
                      removal_modules_lookup.removal_lookup_expand_internal( assertion, asent );
                    }
                    done_var_$1 = makeBoolean( NIL == valid_$3 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw37$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$2 = NIL;
                  final SubLObject token_var_$3 = NIL;
                  while ( NIL == done_var_$2)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                    final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( assertion ) );
                    if( NIL != valid_$4 )
                    {
                      removal_modules_lookup.removal_lookup_expand_internal( assertion, asent );
                    }
                    done_var_$2 = makeBoolean( NIL == valid_$4 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( NIL != predicate )
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw37$GAF, enumeration_types.sense_truth( sense ), NIL );
                SubLObject done_var_$3 = NIL;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( assertion ) );
                  if( NIL != valid_$5 )
                  {
                    removal_modules_lookup.removal_lookup_expand_internal( assertion, asent );
                  }
                  done_var_$3 = makeBoolean( NIL == valid_$5 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw37$GAF, enumeration_types.sense_truth( sense ), NIL );
                SubLObject done_var_$4 = NIL;
                final SubLObject token_var_$5 = NIL;
                while ( NIL == done_var_$4)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                  final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion ) );
                  if( NIL != valid_$6 )
                  {
                    removal_modules_lookup.removal_lookup_expand_internal( assertion, asent );
                  }
                  done_var_$4 = makeBoolean( NIL == valid_$6 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw38$PREDICATE_EXTENT ) )
    {
      final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw37$GAF, enumeration_types.sense_truth( sense ), NIL );
                SubLObject done_var_$5 = NIL;
                final SubLObject token_var_$6 = NIL;
                while ( NIL == done_var_$5)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$6 );
                  final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion2 ) );
                  if( NIL != valid_$7 )
                  {
                    removal_modules_lookup.removal_lookup_expand_internal( assertion2, asent );
                  }
                  done_var_$5 = makeBoolean( NIL == valid_$7 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values5 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values5 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
        }
      }
    }
    else if( pcase_var.eql( $kw39$OVERLAP ) )
    {
      SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == enumeration_types.sense_truth( sense ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( sense ) ) )
        {
          removal_modules_lookup.removal_lookup_expand_internal( assertion3, asent );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion3 = cdolist_list_var.first();
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8957L)
  public static SubLObject removal_isa_defn_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != forts.fort_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) )
    {
      return $isa_fort_defn_cost$.getGlobalValue();
    }
    return $isa_non_fort_defn_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9160L)
  public static SubLObject removal_isa_defn_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_module_utilities.invert_removal_check_cost( removal_isa_defn_pos_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9315L)
  public static SubLObject removal_isa_defn_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_defn_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9449L)
  public static SubLObject removal_isa_defn_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_defn_reject_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 9583L)
  public static SubLObject removal_isa_defn_pos_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return makeBoolean( NIL != at_defns.any_sufficient_defn_anywhereP( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) || NIL != at_defns.any_sufficient_quoted_defn_anywhereP( cycl_utilities
        .atomic_sentence_arg2( asent, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 10675L)
  public static SubLObject removal_isa_defn_check_expand(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_object = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    collection = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == isa.isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
        try
        {
          at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
          if( NIL != at_defns.quiet_defns_admitP( collection, v_object, NIL ) )
          {
            backward.removal_add_node( arguments.make_hl_support( $kw44$DEFN, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          }
        }
        finally
        {
          at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 11222L)
  public static SubLObject removal_isa_defn_reject_expand(final SubLObject asent)
  {
    final SubLObject v_object = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != at_defns.quiet_defns_rejectP( collection, v_object, NIL ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw44$DEFN, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 11941L)
  public static SubLObject removal_all_isa_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_object = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject collections = cdolist_list_var = Sort.sort( isa.all_isa( v_object, UNPROVIDED, UNPROVIDED ), $sym47$GENERALITY_ESTIMATE_, UNPROVIDED );
    SubLObject collection = NIL;
    collection = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( arg2, collection, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject unified_arg2 = bindings.subst_bindings( v_bindings, arg2 );
        final SubLObject formula = el_utilities.make_binary_formula( predicate, v_object, unified_arg2 );
        backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, formula, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      collection = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12685L)
  public static SubLObject removal_all_instances_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return inference_all_instances_cost( collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12955L)
  public static SubLObject removal_all_instances_completeness(final SubLObject asent)
  {
    return inference_collection_iteration_completeness( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13100L)
  public static SubLObject inference_collection_iteration_completeness(final SubLObject collection)
  {
    if( NIL == forts.fort_p( collection ) )
    {
      return $kw49$GROSSLY_INCOMPLETE;
    }
    if( NIL != at_defns.any_sufficient_defn_anywhereP( collection ) || NIL != at_defns.any_sufficient_quoted_defn_anywhereP( collection ) )
    {
      return $kw49$GROSSLY_INCOMPLETE;
    }
    if( NIL != kb_accessors.completely_enumerable_collectionP( collection, UNPROVIDED ) )
    {
      return $kw50$COMPLETE;
    }
    return $kw49$GROSSLY_INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13807L)
  public static SubLObject removal_all_instances_iterator(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cardinality_estimates.instance_cardinality( collection ).numG( $all_instances_lazy_iteration_threshold$.getDynamicValue( thread ) ) )
    {
      return kb_iterators.new_instances_iterator( collection );
    }
    return iteration.new_list_iterator( isa.all_instances( collection, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 14831L)
  public static SubLObject inference_all_instances_cost(final SubLObject collection)
  {
    final SubLObject instance_iteration_cost = cardinality_estimates.instance_iteration_cost( collection );
    return instance_iteration_cost.isZero() ? kb_indexing.relevant_num_gaf_arg_index( collection, TWO_INTEGER, $const0$isa ) : instance_iteration_cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 15886L)
  public static SubLObject removal_elementof_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject element = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    element = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject theset = NIL;
    SubLObject elements = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    theset = current.first();
    current = ( elements = current.rest() );
    current = temp;
    if( NIL == current )
    {
      if( NIL != subl_promotions.memberP( element, elements, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw56$ELEMENTOF, asent, mt_relevance_macros.inference_relevant_mt(), $kw57$TRUE_MON ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 17376L)
  public static SubLObject removal_not_elementof_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject element = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    element = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject theset = NIL;
    SubLObject elements = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    theset = current.first();
    current = ( elements = current.rest() );
    current = temp;
    if( NIL == current )
    {
      if( NIL == subl_promotions.memberP( element, elements, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw56$ELEMENTOF, cycl_utilities.negate( asent ), mt_relevance_macros.inference_relevant_mt(), $kw57$TRUE_MON ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 18391L)
  public static SubLObject removal_elementof_collection_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_collection_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 19117L)
  public static SubLObject removal_elementof_collection_defn_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_defn_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 19917L)
  public static SubLObject removal_elementof_set_check_iterator(final SubLObject asent)
  {
    return removal_modules_lookup.removal_lookup_pos_iterator( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 21093L)
  public static SubLObject removal_not_elementof_collection_check_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_isa_collection_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 21435L)
  public static SubLObject removal_not_elementof_collection_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_isa_collection_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 22037L)
  public static SubLObject removal_not_elementof_collection_defn_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_isa_defn_reject_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 22882L)
  public static SubLObject removal_not_elementof_set_check_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_modules_lookup.removal_lookup_neg_cost( asent, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 23187L)
  public static SubLObject removal_not_elementof_set_check_completeness(final SubLObject asent)
  {
    return removal_modules_lookup.removal_lookup_neg_completeness( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 23306L)
  public static SubLObject removal_not_elementof_set_check_iterator(final SubLObject asent)
  {
    return removal_modules_lookup.removal_lookup_neg_iterator( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 24384L)
  public static SubLObject removal_elementof_thesetof_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject results = inference_elementof_thesetof_check( element, the_set_of, UNPROVIDED );
    final SubLObject validP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != results && NIL != validP )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw74$OPAQUE, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 25702L)
  public static SubLObject inference_elementof_thesetof_check(final SubLObject element, final SubLObject the_set_of, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject variable = cycl_utilities.nat_arg1( the_set_of, UNPROVIDED );
    final SubLObject formula = cycl_utilities.nat_arg2( the_set_of, UNPROVIDED );
    final SubLObject ask_formula = conses_high.subst( element, variable, formula, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject results = inference_trampolines.inference_true_sentence_recursive_query( ask_formula, mt, UNPROVIDED, UNPROVIDED );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p( halt_reason ) )
    {
      Errors.error( inference_datastructures_enumerated_types.inference_error_suspend_status_message( halt_reason ) );
      return NIL;
    }
    if( NIL != inference_datastructures_enumerated_types.exhausted_query_halt_reason_p( halt_reason ) )
    {
      return Values.values( results, T );
    }
    return Values.values( results, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 26336L)
  public static SubLObject removal_isa_thecollectionof_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_elementof_thesetof_check_expand( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 27359L)
  public static SubLObject removal_not_elementof_thesetof_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject results = inference_elementof_thesetof_check( element, the_set_of, UNPROVIDED );
    final SubLObject validP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == results && NIL != validP )
    {
      final SubLObject bound_the_set_of = cycl_utilities.expression_subst( element, cycl_utilities.formula_arg1( the_set_of, UNPROVIDED ), cycl_utilities.formula_arg2( the_set_of, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      backward.removal_add_node( arguments.make_hl_support( $kw79$QUERY, cycl_utilities.negate( bound_the_set_of ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 28920L)
  public static SubLObject removal_not_isa_thecollectionof_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_elementof_thesetof_check_expand( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 29820L)
  public static SubLObject removal_all_elementof_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_all_isa_expand( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 30508L)
  public static SubLObject removal_nat_all_elementof_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_all_isa_expand( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 31394L)
  public static SubLObject removal_elementof_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return Sequences.length( cycl_utilities.nat_args( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 31709L)
  public static SubLObject removal_elementof_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$18;
      final SubLObject datum_$17 = current_$18 = arg2;
      SubLObject theset = NIL;
      SubLObject elements = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$18, datum_$17, $list89 );
      theset = current_$18.first();
      current_$18 = current_$18.rest();
      SubLObject cdolist_list_var;
      elements = ( cdolist_list_var = current_$18 );
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( arg1, element, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          final SubLObject formula = el_utilities.make_binary_formula( $const54$elementOf, bindings.subst_bindings( v_bindings, arg1 ), arg2 );
          backward.removal_add_node( arguments.make_hl_support( $kw56$ELEMENTOF, formula, mt_relevance_macros.inference_relevant_mt(), $kw57$TRUE_MON ), v_bindings, unify_justification );
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 32792L)
  public static SubLObject removal_elementof_collection_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_all_instances_cost( asent, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 33167L)
  public static SubLObject removal_elementof_collection_unify_completeness(final SubLObject asent)
  {
    return removal_all_instances_completeness( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 33292L)
  public static SubLObject removal_elementof_collection_unify_iterator(final SubLObject collection)
  {
    return removal_all_instances_iterator( collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 34217L)
  public static SubLObject removal_elementof_set_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_modules_lookup.removal_lookup_pos_cost( asent, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 34506L)
  public static SubLObject removal_elementof_set_unify_iterator(final SubLObject asent)
  {
    return removal_modules_lookup.removal_lookup_pos_iterator( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 35446L)
  public static SubLObject removal_elementof_thesetof_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject elementof = el_utilities.unmake_binary_formula( asent );
    final SubLObject arg1 = thread.secondMultipleValue();
    final SubLObject thesetof_nat = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject thesetof = el_utilities.unmake_binary_formula( thesetof_nat );
    final SubLObject var = thread.secondMultipleValue();
    final SubLObject such_that = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject smart_cost = removal_elementof_thesetof_unify_cost_smart( var, such_that );
    return ( NIL != smart_cost ) ? smart_cost : backward_utilities.$inference_recursive_query_overhead$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 36100L)
  public static SubLObject removal_elementof_thesetof_unify_cost_smart(final SubLObject el_var, SubLObject such_that)
  {
    if( NIL != el_grammar.el_literal_p( such_that ) )
    {
      such_that = el_utilities.make_conjunction( ConsesLow.list( such_that ) );
    }
    if( NIL != el_utilities.el_conjunction_p( such_that ) )
    {
      final SubLObject el_literals = cycl_utilities.formula_args( such_that, UNPROVIDED );
      if( NIL != el_literals && NIL != list_utilities.every_in_list( $sym96$EL_LITERAL_P, cycl_utilities.formula_args( such_that, UNPROVIDED ), UNPROVIDED ) )
      {
        SubLObject cheapest_literal_cost = number_utilities.positive_infinity();
        SubLObject cdolist_list_var = el_literals;
        SubLObject el_literal = NIL;
        el_literal = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject hl_literal = cycl_utilities.expression_subst( variables.find_variable_by_id( ZERO_INTEGER ), el_var, el_literal, UNPROVIDED, UNPROVIDED );
          final SubLObject asent = el_utilities.literal_atomic_sentence( hl_literal );
          final SubLObject sense = el_utilities.literal_sense( hl_literal );
          final SubLObject cost = inference_utilities.literal_removal_cost( asent, sense, UNPROVIDED, UNPROVIDED );
          if( NIL != number_utilities.potentially_infinite_number_LE( cost, cheapest_literal_cost ) )
          {
            cheapest_literal_cost = cost;
          }
          cdolist_list_var = cdolist_list_var.rest();
          el_literal = cdolist_list_var.first();
        }
        if( cheapest_literal_cost.isNumber() )
        {
          return cheapest_literal_cost;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 37192L)
  public static SubLObject removal_elementof_thesetof_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject elements = cdolist_list_var = ask_utilities.the_set_of_elements( the_set_of, $kw97$HL, UNPROVIDED );
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( arg1, element, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject unified_arg1 = bindings.subst_bindings( v_bindings, arg1 );
        final SubLObject formula = el_utilities.make_binary_formula( pred, unified_arg1, the_set_of );
        backward.removal_add_node( arguments.make_hl_support( $kw74$OPAQUE, formula, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 38369L)
  public static SubLObject removal_isa_thecollectionof_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_elementof_thesetof_unify_cost( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 38562L)
  public static SubLObject removal_isa_thecollectionof_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_elementof_thesetof_unify_expand( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 39355L)
  public static SubLObject removal_collection_subset_fn_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject collectionsubsetfn = el_utilities.unmake_binary_formula( subcol_nat );
    final SubLObject col = thread.secondMultipleValue();
    final SubLObject thesetof_nat = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != el_utilities.el_formula_with_operator_p( thesetof_nat, $const102$TheSetOf ) )
    {
      thread.resetMultipleValues();
      final SubLObject thesetof = el_utilities.unmake_binary_formula( thesetof_nat );
      final SubLObject var = thread.secondMultipleValue();
      final SubLObject explicit_such_that = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject additional_isa_literal = ConsesLow.list( $const0$isa, var, col );
      final SubLObject such_that = simplifier.conjoin( ConsesLow.list( additional_isa_literal, explicit_such_that ), T );
      final SubLObject smart_cost = removal_elementof_thesetof_unify_cost_smart( var, such_that );
      if( NIL != smart_cost )
      {
        return smart_cost;
      }
    }
    return removal_isa_subcollection_cost( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 40512L)
  public static SubLObject removal_isa_subcollection_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subcol_nat = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject col = cycl_utilities.nat_arg1( subcol_nat, UNPROVIDED );
    return Numbers.ceiling( inference_all_instances_cost( col ), TEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 40824L)
  public static SubLObject removal_isa_subcollection_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_isa = el_utilities.unmake_binary_formula( asent );
    final SubLObject arg1 = thread.secondMultipleValue();
    final SubLObject subcol_nat = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject subcol_fn = cycl_utilities.nat_functor( subcol_nat );
    final SubLObject rule = kb_mapping_utilities.fpred_value( subcol_fn, $const103$subcollectionFunctionDefiningRule, ONE_INTEGER, TWO_INTEGER, $kw35$TRUE );
    if( NIL != rule )
    {
      final SubLObject query = removal_isa_subcollection_construct_query( rule, asent );
      final SubLObject recursive_results = ask_utilities.inference_recursive_query_unique_bindings( query, mt_relevance_macros.$mt$.getDynamicValue( thread ), ask_utilities.filter_query_properties_for_recursive_query(
          inference_utilities.current_query_properties() ) );
      if( NIL != recursive_results )
      {
        final SubLObject more_supports = ConsesLow.list( rule );
        if( NIL != cyc_kernel.closed_query_success_token_p( recursive_results ) )
        {
          final SubLObject hl_support = arguments.make_hl_support( $kw79$QUERY, query, UNPROVIDED, UNPROVIDED );
          backward.removal_add_node( hl_support, NIL, more_supports );
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != conses_high.second( recursive_results.first() ) )
          {
            Errors.error( $str104$Expected__s_to_have_only_one_free, rule );
          }
          SubLObject cdolist_list_var = recursive_results;
          SubLObject v_bindings = NIL;
          v_bindings = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject fully_bound_query = bindings.apply_bindings( v_bindings, query );
            final SubLObject hl_support2 = arguments.make_hl_support( $kw79$QUERY, fully_bound_query, UNPROVIDED, UNPROVIDED );
            final SubLObject binding = v_bindings.first();
            final SubLObject ins = bindings.variable_binding_value( binding );
            thread.resetMultipleValues();
            final SubLObject v_bindings_$19 = unification_utilities.term_unify( ins, arg1, NIL, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != v_bindings_$19 )
            {
              backward.removal_add_node( hl_support2, v_bindings_$19, ConsesLow.append( more_supports, unify_justification ) );
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 42271L)
  public static SubLObject removal_isa_subcollection_construct_query(final SubLObject rule, final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( clauses.pos_lits( cnf ) ) )
    {
      Errors.error( $str105$Expected_exactly_one_poslit_in__S, rule );
    }
    final SubLObject pos_lit = clauses.pos_lits( cnf ).first();
    final SubLObject neg_lits = clauses.neg_lits( cnf );
    final SubLObject tou_lits = el_utilities.tou_lits( neg_lits );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( tou_lits ) )
    {
      Errors.error( $str106$Expected_exactly_one___termOfUnit, rule );
    }
    final SubLObject tou_lit = tou_lits.first();
    final SubLObject query_neg_lits = Sequences.remove( tou_lit, neg_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject termofunit = el_utilities.unmake_binary_formula( tou_lit );
    final SubLObject var = thread.secondMultipleValue();
    final SubLObject unbound_subcol_naut = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject tou_binding = bindings.make_variable_binding( var, unbound_subcol_naut );
    final SubLObject tou_bindings = ConsesLow.list( tou_binding );
    final SubLObject fixed_cnf = bindings.apply_bindings( tou_bindings, pos_lit );
    thread.resetMultipleValues();
    final SubLObject unify_bindings = unification.unify( asent, fixed_cnf, NIL, UNPROVIDED );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject query_lits = bindings.apply_bindings( unify_bindings, query_neg_lits );
    final SubLObject query = simplifier.conjoin( query_lits, UNPROVIDED );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 43917L)
  public static SubLObject subcollection_functor_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $subcollection_functors$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 53920L)
  public static SubLObject removal_all_isa_of_type_completeness(final SubLObject asent_1, final SubLObject mt_1, final SubLObject asent_2, final SubLObject mt_2)
  {
    SubLObject result = NIL;
    final SubLObject completeness_1 = inference_utilities.literal_removal_completeness( asent_1, $kw10$POS, mt_1 );
    if( $kw50$COMPLETE == completeness_1 )
    {
      result = $kw50$COMPLETE;
    }
    else
    {
      final SubLObject completeness_2 = inference_utilities.literal_removal_completeness( asent_2, $kw10$POS, mt_2 );
      result = inference_datastructures_enumerated_types.max2_completeness( completeness_1, completeness_2 );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 54338L)
  public static SubLObject removal_all_isa_of_type_applicability(final SubLObject contextualized_dnf_clause)
  {
    return removal_modules_genls.removal_sbhl_between_applicability( contextualized_dnf_clause, $const0$isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 54499L)
  public static SubLObject removal_all_isa_of_type_cost(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != clause_utilities.binary_clause_p( contextualized_dnf_clause ) : contextualized_dnf_clause;
    SubLObject ins = NIL;
    SubLObject type_col = NIL;
    SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != variables.variable_p( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) )
        {
          ins = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
        }
        else
        {
          type_col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list143 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    assert NIL != forts.fort_p( ins ) : ins;
    assert NIL != forts.fort_p( type_col ) : type_col;
    final SubLObject all_isa_cardinality = control_vars.$average_all_isa_count$.getDynamicValue( thread );
    final SubLObject all_instances_cardinality = inference_all_instances_cost( type_col );
    final SubLObject max_col_cardinality = Numbers.min( all_isa_cardinality, all_instances_cardinality );
    return Numbers.integerDivide( max_col_cardinality, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 55382L)
  public static SubLObject removal_all_isa_of_type_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent0 = NIL;
    SubLObject contextualized_asent2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    contextualized_asent0 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    contextualized_asent2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$21;
      final SubLObject datum_$20 = current_$21 = contextualized_asent0;
      SubLObject mt0 = NIL;
      SubLObject asent0 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list146 );
      mt0 = current_$21.first();
      current_$21 = current_$21.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list146 );
      asent0 = current_$21.first();
      current_$21 = current_$21.rest();
      if( NIL == current_$21 )
      {
        SubLObject current_$22;
        final SubLObject datum_$21 = current_$22 = contextualized_asent2;
        SubLObject mt2 = NIL;
        SubLObject asent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list147 );
        mt2 = current_$22.first();
        current_$22 = current_$22.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list147 );
        asent2 = current_$22.first();
        current_$22 = current_$22.rest();
        if( NIL == current_$22 )
        {
          if( mt0.equal( mt2 ) )
          {
            thread.resetMultipleValues();
            final SubLObject ins_asent = removal_all_isa_of_type_categorize_asents( asent0, asent2 );
            final SubLObject type_col_asent = thread.secondMultipleValue();
            final SubLObject ins_firstP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject ins = cycl_utilities.atomic_sentence_arg1( ins_asent, UNPROVIDED );
            final SubLObject variable = cycl_utilities.atomic_sentence_arg2( ins_asent, UNPROVIDED );
            final SubLObject type_col = cycl_utilities.atomic_sentence_arg2( type_col_asent, UNPROVIDED );
            SubLObject cdolist_list_var = inference_all_isas_of_type( ins, type_col, mt0 );
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              thread.resetMultipleValues();
              final SubLObject v_bindings = unification_utilities.term_unify( variable, col, UNPROVIDED, UNPROVIDED );
              final SubLObject unify_justification = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != v_bindings )
              {
                final SubLObject ins_support_formula = el_utilities.make_binary_formula( $const0$isa, ins, col );
                final SubLObject type_col_support_formula = el_utilities.make_binary_formula( $const0$isa, col, type_col );
                final SubLObject ins_support = arguments.make_hl_support( $kw28$ISA, ins_support_formula, mt0, UNPROVIDED );
                final SubLObject type_col_support = arguments.make_hl_support( $kw28$ISA, type_col_support_formula, mt0, UNPROVIDED );
                final SubLObject ins_supports = ConsesLow.list( ins_support );
                final SubLObject type_col_supports = ConsesLow.list( type_col_support );
                final SubLObject justifications = ( NIL != ins_firstP ) ? ConsesLow.list( ins_supports, type_col_supports ) : ConsesLow.list( type_col_supports, ins_supports );
                inference_worker_removal.conjunctive_removal_callback( v_bindings, justifications );
              }
              cdolist_list_var = cdolist_list_var.rest();
              col = cdolist_list_var.first();
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$21, $list147 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$20, $list146 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list145 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 56919L)
  public static SubLObject removal_all_isa_of_type_categorize_asents(final SubLObject asent0, final SubLObject asent1)
  {
    if( NIL != forts.fort_p( cycl_utilities.atomic_sentence_arg1( asent0, UNPROVIDED ) ) )
    {
      return Values.values( asent0, asent1, T );
    }
    return Values.values( asent1, asent0, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 58113L)
  public static SubLObject all_quoted_instances_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject var = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg_bindableP = list_utilities.member_eqP( var, bindable_vars );
    if( NIL != fort_types_interface.collection_p( col ) )
    {
      final SubLObject completeness = inference_quoted_collection_iteration_completeness( col );
      SubLObject preference = preference_modules.completeness_to_preference_level( completeness );
      if( NIL != arg_bindableP && NIL != preference_modules.preference_level_LE( preference, $kw15$DISPREFERRED ) && NIL != kb_accessors.check_preferred_collectionP( col, UNPROVIDED ) )
      {
        preference = $kw16$DISALLOWED;
      }
      return preference;
    }
    return $kw17$GROSSLY_DISPREFERRED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59535L)
  public static SubLObject removal_quoted_isa_collection_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != forts.fort_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) )
    {
      return $quoted_isa_fort_collection_cost$.getGlobalValue();
    }
    return $quoted_isa_non_fort_collection_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59783L)
  public static SubLObject removal_quoted_isa_collection_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_quoted_isa_collection_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 59948L)
  public static SubLObject removal_quoted_isa_collection_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_quoted_isa_collection_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 60113L)
  public static SubLObject removal_quoted_isa_collection_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_not_quoted_isa_collection_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61057L)
  public static SubLObject removal_quoted_isa_collection_check_expand(final SubLObject asent)
  {
    final SubLObject v_object = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != isa.quoted_isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61428L)
  public static SubLObject removal_not_quoted_isa_collection_check_cost(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) )
    {
      return removal_quoted_isa_collection_check_pos_cost( asent, UNPROVIDED );
    }
    return $default_not_quoted_isa_collection_check_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61694L)
  public static SubLObject removal_not_quoted_isa_collection_check_expand(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_object = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    collection = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == isa.quoted_isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw30$MINIMIZE, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != isa.not_quoted_isa_by_sbhlP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62585L)
  public static SubLObject removal_quoted_isa_defn_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != forts.fort_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) )
    {
      return $quoted_isa_fort_defn_cost$.getGlobalValue();
    }
    return $quoted_isa_non_fort_defn_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62809L)
  public static SubLObject removal_quoted_isa_defn_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_module_utilities.invert_removal_check_cost( removal_quoted_isa_defn_pos_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 62978L)
  public static SubLObject removal_quoted_isa_defn_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_quoted_isa_defn_check_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 63126L)
  public static SubLObject removal_quoted_isa_defn_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_quoted_isa_defn_reject_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 63274L)
  public static SubLObject removal_quoted_isa_defn_pos_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return at_defns.any_sufficient_quoted_defn_anywhereP( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 64403L)
  public static SubLObject removal_quoted_isa_defn_check_expand(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_object = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    collection = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == forts.fort_p( v_object ) || NIL == isa.quoted_isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
        try
        {
          at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
          if( NIL != at_defns.quiet_quoted_defns_admitP( collection, v_object, NIL ) )
          {
            backward.removal_add_node( arguments.make_hl_support( $kw44$DEFN, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          }
        }
        finally
        {
          at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 64999L)
  public static SubLObject removal_quoted_isa_defn_reject_expand(final SubLObject asent)
  {
    final SubLObject v_object = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != at_defns.quiet_quoted_defns_rejectP( collection, v_object, NIL ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw44$DEFN, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 65368L)
  public static SubLObject removal_nat_quoted_isa_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_object = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    collection = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != isa.quoted_isaP( v_object, collection, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 66139L)
  public static SubLObject removal_all_quoted_isa_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_fort_all_quoted_isa_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 66720L)
  public static SubLObject removal_fort_all_quoted_isa_expand(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_object = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject collections = cdolist_list_var = isa.all_quoted_isa( v_object, UNPROVIDED, UNPROVIDED );
    SubLObject collection = NIL;
    collection = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( arg2, collection, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject unified_arg2 = bindings.subst_bindings( v_bindings, arg2 );
        final SubLObject formula = el_utilities.make_binary_formula( predicate, v_object, unified_arg2 );
        backward.removal_add_node( arguments.make_hl_support( $kw28$ISA, formula, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      collection = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 67368L)
  public static SubLObject removal_nat_all_quoted_isa_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_all_quoted_isa_expand( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 68041L)
  public static SubLObject removal_all_quoted_instances_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return inference_all_quoted_instances_cost( collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 68346L)
  public static SubLObject removal_all_quoted_instances_completeness(final SubLObject asent)
  {
    return inference_quoted_collection_iteration_completeness( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 68505L)
  public static SubLObject inference_quoted_collection_iteration_completeness(final SubLObject collection)
  {
    if( NIL == forts.fort_p( collection ) )
    {
      return $kw49$GROSSLY_INCOMPLETE;
    }
    if( NIL != at_defns.any_sufficient_quoted_defn_anywhereP( collection ) )
    {
      return $kw49$GROSSLY_INCOMPLETE;
    }
    if( NIL != kb_accessors.completely_enumerable_collectionP( collection, UNPROVIDED ) )
    {
      return $kw50$COMPLETE;
    }
    return $kw49$GROSSLY_INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 69001L)
  public static SubLObject removal_all_quoted_instances_iterator(final SubLObject collection)
  {
    return iteration.new_list_iterator( isa.all_quoted_instances( collection, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 70147L)
  public static SubLObject inference_all_quoted_instances_cost(final SubLObject collection)
  {
    return Numbers.max( cardinality_estimates.quoted_instance_iteration_cost( collection ), kb_indexing.relevant_num_gaf_arg_index( collection, TWO_INTEGER, $const148$quotedIsa ) );
  }

  public static SubLObject declare_removal_modules_isa_file()
  {
    SubLFiles.declareFunction( me, "all_instances_pos_preference", "ALL-INSTANCES-POS-PREFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_all_isas_of_type", "INFERENCE-ALL-ISAS-OF-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_collection_check_pos_cost", "REMOVAL-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false );
    new $removal_isa_collection_check_pos_cost$UnaryFunction();
    new $removal_isa_collection_check_pos_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_isa_collection_check_neg_cost", "REMOVAL-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_collection_check_pos_expand", "REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_collection_check_neg_expand", "REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_collection_check_expand", "REMOVAL-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_isa_collection_check_cost", "REMOVAL-NOT-ISA-COLLECTION-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_isa_collection_check_expand", "REMOVAL-NOT-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_isa_naut_collection_check_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_naut_collection_check_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_naut_collection_lookup_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_naut_collection_lookup_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_pos_cost", "REMOVAL-ISA-DEFN-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_neg_cost", "REMOVAL-ISA-DEFN-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_pos_expand", "REMOVAL-ISA-DEFN-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_neg_expand", "REMOVAL-ISA-DEFN-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_pos_required", "REMOVAL-ISA-DEFN-POS-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_check_expand", "REMOVAL-ISA-DEFN-CHECK-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_isa_defn_reject_expand", "REMOVAL-ISA-DEFN-REJECT-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_isa_expand", "REMOVAL-ALL-ISA-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_instances_cost", "REMOVAL-ALL-INSTANCES-COST", 1, 1, false );
    new $removal_all_instances_cost$UnaryFunction();
    new $removal_all_instances_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_all_instances_completeness", "REMOVAL-ALL-INSTANCES-COMPLETENESS", 1, 0, false );
    new $removal_all_instances_completeness$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_collection_iteration_completeness", "INFERENCE-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_instances_iterator", "REMOVAL-ALL-INSTANCES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_instances_cost", "INFERENCE-ALL-INSTANCES-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_elementof_check_expand", "REMOVAL-ELEMENTOF-CHECK-EXPAND", 1, 1, false );
    new $removal_elementof_check_expand$UnaryFunction();
    new $removal_elementof_check_expand$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_not_elementof_check_expand", "REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_collection_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_collection_defn_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_set_check_iterator", "REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_collection_check_cost", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_collection_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_collection_defn_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_set_check_cost", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_set_check_completeness", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_set_check_iterator", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_elementof_thesetof_check_expand", "REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_elementof_thesetof_check", "INFERENCE-ELEMENTOF-THESETOF-CHECK", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_thecollectionof_check_expand", "REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_elementof_thesetof_check_expand", "REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_isa_thecollectionof_check_expand", "REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_elementof_expand", "REMOVAL-ALL-ELEMENTOF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nat_all_elementof_expand", "REMOVAL-NAT-ALL-ELEMENTOF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_unify_cost", "REMOVAL-ELEMENTOF-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_unify_expand", "REMOVAL-ELEMENTOF-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_collection_unify_cost", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_collection_unify_completeness", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_elementof_collection_unify_iterator", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_elementof_set_unify_cost", "REMOVAL-ELEMENTOF-SET-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_set_unify_iterator", "REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_elementof_thesetof_unify_cost", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_elementof_thesetof_unify_cost_smart", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST-SMART", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_elementof_thesetof_unify_expand", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_thecollectionof_unify_cost", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_thecollectionof_unify_expand", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_collection_subset_fn_cost", "REMOVAL-COLLECTION-SUBSET-FN-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_subcollection_cost", "REMOVAL-ISA-SUBCOLLECTION-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_subcollection_unify_expand", "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_isa_subcollection_construct_query", "REMOVAL-ISA-SUBCOLLECTION-CONSTRUCT-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "subcollection_functor_p", "SUBCOLLECTION-FUNCTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_isa_of_type_completeness", "REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_all_isa_of_type_applicability", "REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY", 1, 0, false );
    new $removal_all_isa_of_type_applicability$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_all_isa_of_type_cost", "REMOVAL-ALL-ISA-OF-TYPE-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_isa_of_type_expand", "REMOVAL-ALL-ISA-OF-TYPE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_isa_of_type_categorize_asents", "REMOVAL-ALL-ISA-OF-TYPE-CATEGORIZE-ASENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "all_quoted_instances_pos_preference", "ALL-QUOTED-INSTANCES-POS-PREFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_collection_check_pos_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false );
    new $removal_quoted_isa_collection_check_pos_cost$UnaryFunction();
    new $removal_quoted_isa_collection_check_pos_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_quoted_isa_collection_check_neg_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_collection_check_pos_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false );
    new $removal_quoted_isa_collection_check_pos_expand$UnaryFunction();
    new $removal_quoted_isa_collection_check_pos_expand$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_quoted_isa_collection_check_neg_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_collection_check_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_quoted_isa_collection_check_cost", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_quoted_isa_collection_check_expand", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_pos_cost", "REMOVAL-QUOTED-ISA-DEFN-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_neg_cost", "REMOVAL-QUOTED-ISA-DEFN-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_pos_expand", "REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_neg_expand", "REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_pos_required", "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED", 1, 1, false );
    new $removal_quoted_isa_defn_pos_required$UnaryFunction();
    new $removal_quoted_isa_defn_pos_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_check_expand", "REMOVAL-QUOTED-ISA-DEFN-CHECK-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quoted_isa_defn_reject_expand", "REMOVAL-QUOTED-ISA-DEFN-REJECT-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_nat_quoted_isa_expand", "REMOVAL-NAT-QUOTED-ISA-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_quoted_isa_expand", "REMOVAL-ALL-QUOTED-ISA-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fort_all_quoted_isa_expand", "REMOVAL-FORT-ALL-QUOTED-ISA-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_nat_all_quoted_isa_expand", "REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_quoted_instances_cost", "REMOVAL-ALL-QUOTED-INSTANCES-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_quoted_instances_completeness", "REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_quoted_collection_iteration_completeness", "INFERENCE-QUOTED-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_quoted_instances_iterator", "REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_quoted_instances_cost", "INFERENCE-ALL-QUOTED-INSTANCES-COST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_isa_file()
  {
    $isa_fort_collection_cost$ = SubLFiles.deflexical( "*ISA-FORT-COLLECTION-COST*", Numbers.subtract( control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float22$0_1 ) );
    $isa_non_fort_collection_cost$ = SubLFiles.deflexical( "*ISA-NON-FORT-COLLECTION-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_not_isa_collection_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER );
    $isa_fort_defn_cost$ = SubLFiles.deflexical( "*ISA-FORT-DEFN-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $isa_non_fort_defn_cost$ = SubLFiles.deflexical( "*ISA-NON-FORT-DEFN-COST*", Numbers.subtract( control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float22$0_1 ) );
    $all_instances_lazy_iteration_threshold$ = SubLFiles.defparameter( "*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*", $int51$2300 );
    $subcollection_functors$ = SubLFiles.deflexical( "*SUBCOLLECTION-FUNCTORS*", $list107 );
    $quoted_isa_fort_collection_cost$ = SubLFiles.deflexical( "*QUOTED-ISA-FORT-COLLECTION-COST*", Numbers.subtract( control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float22$0_1 ) );
    $quoted_isa_non_fort_collection_cost$ = SubLFiles.deflexical( "*QUOTED-ISA-NON-FORT-COLLECTION-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_not_quoted_isa_collection_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER );
    $quoted_isa_fort_defn_cost$ = SubLFiles.deflexical( "*QUOTED-ISA-FORT-DEFN-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $quoted_isa_non_fort_defn_cost$ = SubLFiles.deflexical( "*QUOTED-ISA-NON-FORT-DEFN-COST*", Numbers.subtract( control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float22$0_1 ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_isa_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$isa );
    inference_modules.inference_removal_module_use_meta_removal( $const0$isa, $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const0$isa, $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw4$REMOVAL_ABDUCTION_POS_CHECK );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw5$REMOVAL_ABDUCTION_POS_UNIFY );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw6$REMOVAL_RELATION_ALL_EXISTS_CHECK );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw7$REMOVAL_RELATION_ALL_EXISTS_UNIFY );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw8$REMOVAL_RELATION_EXISTS_ALL_CHECK );
    inference_modules.inference_removal_module_use_generic( $const0$isa, $kw9$REMOVAL_BACKCHAIN_REQUIRED_PRUNE );
    preference_modules.doomed_unless_either_arg_bindable( $kw10$POS, $const0$isa );
    preference_modules.doomed_unless_all_args_bindable( $kw11$NEG, $const0$isa );
    preference_modules.inference_preference_module( $kw12$ALL_INSTANCES_POS, $list13 );
    preference_modules.inference_preference_module( $kw18$ALL_ISA_POS, $list19 );
    preference_modules.inference_preference_module( $kw20$ALL_ELEMENTOF_POS, $list21 );
    inference_modules.inference_removal_module( $kw23$REMOVAL_ISA_COLLECTION_CHECK_POS, $list24 );
    inference_modules.inference_removal_module( $kw25$REMOVAL_ISA_COLLECTION_CHECK_NEG, $list26 );
    inference_modules.inference_removal_module( $kw31$REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list34 );
    inference_modules.inference_removal_module( $kw40$REMOVAL_ISA_DEFN_POS, $list41 );
    inference_modules.inference_removal_module( $kw42$REMOVAL_ISA_DEFN_NEG, $list43 );
    inference_modules.inference_removal_module( $kw45$REMOVAL_ALL_ISA, $list46 );
    utilities_macros.note_funcall_helper_function( $sym48$REMOVAL_ALL_ISA_EXPAND );
    inference_modules.inference_removal_module( $kw52$REMOVAL_ALL_INSTANCES, $list53 );
    inference_modules.register_solely_specific_removal_module_predicate( $const54$elementOf );
    preference_modules.doomed_unless_either_arg_bindable( $kw10$POS, $const54$elementOf );
    preference_modules.doomed_unless_all_args_bindable( $kw11$NEG, $const54$elementOf );
    inference_modules.inference_removal_module( $kw58$REMOVAL_ELEMENTOF_CHECK, $list59 );
    inference_modules.inference_removal_module( $kw60$REMOVAL_NOT_ELEMENTOF_CHECK, $list61 );
    inference_modules.inference_removal_module( $kw62$REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list63 );
    inference_modules.inference_removal_module( $kw64$REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list65 );
    inference_modules.inference_removal_module( $kw66$REMOVAL_ELEMENTOF_SET_CHECK, $list67 );
    inference_modules.inference_removal_module( $kw68$REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list69 );
    inference_modules.inference_removal_module( $kw70$REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list71 );
    inference_modules.inference_removal_module( $kw72$REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list73 );
    inference_modules.inference_removal_module( $kw75$REMOVAL_ELEMENTOF_THESETOF_CHECK, $list76 );
    inference_modules.inference_removal_module( $kw77$REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list78 );
    inference_modules.inference_removal_module( $kw80$REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list81 );
    inference_modules.inference_removal_module( $kw82$REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list83 );
    inference_modules.inference_removal_module( $kw84$REMOVAL_ALL_ELEMENTOF, $list85 );
    inference_modules.inference_removal_module( $kw86$REMOVAL_NAT_ALL_ELEMENTOF, $list87 );
    inference_modules.inference_removal_module( $kw90$REMOVAL_ELEMENTOF_UNIFY, $list91 );
    inference_modules.inference_removal_module( $kw92$REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list93 );
    inference_modules.inference_removal_module( $kw94$REMOVAL_ELEMENTOF_SET_UNIFY, $list95 );
    inference_modules.inference_removal_module( $kw98$REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list99 );
    inference_modules.inference_removal_module( $kw100$REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list101 );
    inference_modules.inference_removal_module( $kw108$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list109 );
    inference_modules.inference_removal_module( $kw110$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list111 );
    inference_modules.inference_removal_module( $kw112$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list113 );
    inference_modules.inference_removal_module( $kw114$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list115 );
    inference_modules.inference_removal_module( $kw116$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list117 );
    inference_modules.inference_removal_module( $kw118$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list119 );
    inference_modules.inference_removal_module( $kw120$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list121 );
    inference_modules.inference_removal_module( $kw122$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list123 );
    inference_modules.inference_removal_module( $kw124$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list125 );
    inference_modules.inference_removal_module( $kw126$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list127 );
    inference_modules.inference_removal_module( $kw128$REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list129 );
    inference_modules.inference_removal_module( $kw130$REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list131 );
    inference_modules.inference_removal_module( $kw132$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list133 );
    inference_modules.inference_removal_module( $kw134$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list135 );
    inference_modules.inference_removal_module( $kw136$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list137 );
    inference_modules.inference_removal_module( $kw138$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list139 );
    inference_modules.inference_conjunctive_removal_module( $kw140$REMOVAL_ALL_ISA_OF_TYPE, $list141 );
    inference_modules.register_solely_specific_removal_module_predicate( $const148$quotedIsa );
    inference_modules.inference_removal_module_use_meta_removal( $const148$quotedIsa, $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const148$quotedIsa, $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS );
    inference_modules.inference_removal_module_use_generic( $const148$quotedIsa, $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG );
    preference_modules.doomed_unless_either_arg_bindable( $kw10$POS, $const148$quotedIsa );
    preference_modules.doomed_unless_all_args_bindable( $kw11$NEG, $const148$quotedIsa );
    preference_modules.inference_preference_module( $kw149$ALL_QUOTED_INSTANCES_POS, $list150 );
    preference_modules.inference_preference_module( $kw151$ALL_QUOTED_ISA_POS, $list152 );
    inference_modules.inference_removal_module( $kw153$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS, $list154 );
    inference_modules.inference_removal_module( $kw155$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG, $list156 );
    inference_modules.inference_removal_module( $kw157$REMOVAL_QUOTED_ISA_DEFN_POS, $list158 );
    inference_modules.inference_removal_module( $kw159$REMOVAL_QUOTED_ISA_DEFN_NEG, $list160 );
    inference_modules.inference_removal_module( $kw161$REMOVAL_NAT_QUOTED_ISA, $list162 );
    inference_modules.inference_removal_module( $kw163$REMOVAL_ALL_QUOTED_ISA, $list164 );
    inference_modules.inference_removal_module( $kw165$REMOVAL_NAT_ALL_QUOTED_ISA, $list166 );
    inference_modules.inference_removal_module( $kw167$REMOVAL_ALL_QUOTED_INSTANCES, $list168 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_isa_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_isa_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_isa_file();
  }
  static
  {
    me = new removal_modules_isa();
    $isa_fort_collection_cost$ = null;
    $isa_non_fort_collection_cost$ = null;
    $default_not_isa_collection_check_cost$ = null;
    $isa_fort_defn_cost$ = null;
    $isa_non_fort_defn_cost$ = null;
    $all_instances_lazy_iteration_threshold$ = null;
    $subcollection_functors$ = null;
    $quoted_isa_fort_collection_cost$ = null;
    $quoted_isa_non_fort_collection_cost$ = null;
    $default_not_quoted_isa_collection_check_cost$ = null;
    $quoted_isa_fort_defn_cost$ = null;
    $quoted_isa_non_fort_defn_cost$ = null;
    $const0$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-ENUMERABLE-POS" );
    $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-DECIDABLE-POS" );
    $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword( "REMOVAL-COMPLETELY-DECIDABLE-NEG" );
    $kw4$REMOVAL_ABDUCTION_POS_CHECK = makeKeyword( "REMOVAL-ABDUCTION-POS-CHECK" );
    $kw5$REMOVAL_ABDUCTION_POS_UNIFY = makeKeyword( "REMOVAL-ABDUCTION-POS-UNIFY" );
    $kw6$REMOVAL_RELATION_ALL_EXISTS_CHECK = makeKeyword( "REMOVAL-RELATION-ALL-EXISTS-CHECK" );
    $kw7$REMOVAL_RELATION_ALL_EXISTS_UNIFY = makeKeyword( "REMOVAL-RELATION-ALL-EXISTS-UNIFY" );
    $kw8$REMOVAL_RELATION_EXISTS_ALL_CHECK = makeKeyword( "REMOVAL-RELATION-EXISTS-ALL-CHECK" );
    $kw9$REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword( "REMOVAL-BACKCHAIN-REQUIRED-PRUNE" );
    $kw10$POS = makeKeyword( "POS" );
    $kw11$NEG = makeKeyword( "NEG" );
    $kw12$ALL_INSTANCES_POS = makeKeyword( "ALL-INSTANCES-POS" );
    $list13 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "PREFERENCE" ), makeSymbol(
            "ALL-INSTANCES-POS-PREFERENCE" ) );
    $kw14$PREFERRED = makeKeyword( "PREFERRED" );
    $kw15$DISPREFERRED = makeKeyword( "DISPREFERRED" );
    $kw16$DISALLOWED = makeKeyword( "DISALLOWED" );
    $kw17$GROSSLY_DISPREFERRED = makeKeyword( "GROSSLY-DISPREFERRED" );
    $kw18$ALL_ISA_POS = makeKeyword( "ALL-ISA-POS" );
    $list19 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "DISPREFERRED" ) );
    $kw20$ALL_ELEMENTOF_POS = makeKeyword( "ALL-ELEMENTOF-POS" );
    $list21 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $float22$0_1 = makeDouble( 0.1 );
    $kw23$REMOVAL_ISA_COLLECTION_CHECK_POS = makeKeyword( "REMOVAL-ISA-COLLECTION-CHECK-POS" );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ISA-COLLECTION-CHECK-POS-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$isa <fully-bound> <fort>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)" )
    } );
    $kw25$REMOVAL_ISA_COLLECTION_CHECK_NEG = makeKeyword( "REMOVAL-ISA-COLLECTION-CHECK-NEG" );
    $list26 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ISA-COLLECTION-CHECK-NEG-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$isa <fort> <fort>))" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$isa #$Dog #$Predicate))" )
    } );
    $int27$30 = makeInteger( 30 );
    $kw28$ISA = makeKeyword( "ISA" );
    $list29 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "COLLECTION" ) );
    $kw30$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw31$REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS = makeKeyword( "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FORT" ), makeKeyword( "CLOSED-NAUT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "" ), makeKeyword(
                "EXAMPLE" ), makeString( "" )
    } );
    $kw33$REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS = makeKeyword( "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "FORT" ) ), makeKeyword( "CLOSED-NAUT" ) ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "" ), makeKeyword( "EXAMPLE" ), makeString( "" )
    } );
    $kw35$TRUE = makeKeyword( "TRUE" );
    $kw36$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw37$GAF = makeKeyword( "GAF" );
    $kw38$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $kw39$OVERLAP = makeKeyword( "OVERLAP" );
    $kw40$REMOVAL_ISA_DEFN_POS = makeKeyword( "REMOVAL-ISA-DEFN-POS" );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "REQUIRED" ), makeSymbol(
            "REMOVAL-ISA-DEFN-POS-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-DEFN-POS-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-DEFN-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient" ), makeKeyword( "EXAMPLE" ), makeString( "(#$isa 42 #$Integer)" )
    } );
    $kw42$REMOVAL_ISA_DEFN_NEG = makeKeyword( "REMOVAL-ISA-DEFN-NEG" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ISA-DEFN-NEG-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-DEFN-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$isa 42 #$SubLString))" )
    } );
    $kw44$DEFN = makeKeyword( "DEFN" );
    $kw45$REMOVAL_ALL_ISA = makeKeyword( "REMOVAL-ALL-ISA" );
    $list46 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*AVERAGE-ALL-ISA-COUNT*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ALL-ISA-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$isa <fort> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)" )
    } );
    $sym47$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $sym48$REMOVAL_ALL_ISA_EXPAND = makeSymbol( "REMOVAL-ALL-ISA-EXPAND" );
    $kw49$GROSSLY_INCOMPLETE = makeKeyword( "GROSSLY-INCOMPLETE" );
    $kw50$COMPLETE = makeKeyword( "COMPLETE" );
    $int51$2300 = makeInteger( 2300 );
    $kw52$REMOVAL_ALL_INSTANCES = makeKeyword( "REMOVAL-ALL-INSTANCES" );
    $list53 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ALL-INSTANCES-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-INSTANCES-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "REMOVAL-ALL-INSTANCES-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "isa" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "ISA" ), makeKeyword(
                                "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$isa <not fully-bound> <fort>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$isa ?DOG #$Dog)" )
    } );
    $const54$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $list55 = ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.cons( makeSymbol( "THESET" ), makeSymbol( "ELEMENTS" ) ) );
    $kw56$ELEMENTOF = makeKeyword( "ELEMENTOF" );
    $kw57$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw58$REMOVAL_ELEMENTOF_CHECK = makeKeyword( "REMOVAL-ELEMENTOF-CHECK" );
    $list59 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-ELEMENTOF-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))" )
    } );
    $kw60$REMOVAL_NOT_ELEMENTOF_CHECK = makeKeyword( "REMOVAL-NOT-ELEMENTOF-CHECK" );
    $list61 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))" )
    } );
    $kw62$REMOVAL_ELEMENTOF_COLLECTION_CHECK = makeKeyword( "REMOVAL-ELEMENTOF-COLLECTION-CHECK" );
    $list63 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FORT" ), makeKeyword( "COLLECTION-FORT" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$elementOf <fort> <fort>)\n where <fort> is a collection " ), makeKeyword( "EXAMPLE" ), makeString( "(#$elementOf #$Dog #$Collection)" )
    } );
    $kw64$REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword( "REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK" );
    $list65 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "COLLECTION-FORT" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection" ), makeKeyword( "EXAMPLE" ), makeString( "(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient" )
    } );
    $kw66$REMOVAL_ELEMENTOF_SET_CHECK = makeKeyword( "REMOVAL-ELEMENTOF-SET-CHECK" );
    $list67 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FORT" ), ConsesLow
            .list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "COLLECTION-P" ) ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword(
                "COMPLETE-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-COMPLETELY-ASSERTED-ASENT?" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
                            .list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                                makeKeyword( "CALL" ), makeSymbol( "GAF-FORMULA" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                    "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)" )
    } );
    $kw68$REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK = makeKeyword( "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK" );
    $list69 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FORT" ), makeKeyword( "COLLECTION-FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$elementOf #$Dog #$Predicate))" )
    } );
    $kw70$REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword( "REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK" );
    $list71 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "COLLECTION-FORT" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary" )
    } );
    $kw72$REMOVAL_NOT_ELEMENTOF_SET_CHECK = makeKeyword( "REMOVAL-NOT-ELEMENTOF-SET-CHECK" );
    $list73 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FORT" ), ConsesLow
            .list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "COLLECTION-P" ) ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST" ), makeKeyword(
                "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
                    .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword(
                        "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GAF-FORMULA" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))" )
    } );
    $kw74$OPAQUE = makeKeyword( "OPAQUE" );
    $kw75$REMOVAL_ELEMENTOF_THESETOF_CHECK = makeKeyword( "REMOVAL-ELEMENTOF-THESETOF-CHECK" );
    $list76 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))" )
    } );
    $kw77$REMOVAL_ISA_THECOLLECTIONOF_CHECK = makeKeyword( "REMOVAL-ISA-THECOLLECTIONOF-CHECK" );
    $list78 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword(
                "REMOVAL-ALL-INSTANCES" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))" )
    } );
    $kw79$QUERY = makeKeyword( "QUERY" );
    $kw80$REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK = makeKeyword( "REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK" );
    $list81 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*INFERENCE-RECURSIVE-QUERY-OVERHEAD*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))" )
    } );
    $kw82$REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK = makeKeyword( "REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK" );
    $list83 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*INFERENCE-RECURSIVE-QUERY-OVERHEAD*" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))" )
    } );
    $kw84$REMOVAL_ALL_ELEMENTOF = makeKeyword( "REMOVAL-ALL-ELEMENTOF" );
    $list85 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*AVERAGE-ALL-ISA-COUNT*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ALL-ELEMENTOF-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$elementOf <fort> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$elementOf #$Dog ?WHAT)" )
    } );
    $kw86$REMOVAL_NAT_ALL_ELEMENTOF = makeKeyword( "REMOVAL-NAT-ALL-ELEMENTOF" );
    $list87 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*AVERAGE-ALL-ISA-COUNT*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NAT-ALL-ELEMENTOF-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg" ), makeKeyword(
                    "EXAMPLE" ), makeString( "(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)" )
    } );
    $list88 = ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $list89 = ConsesLow.cons( makeSymbol( "THESET" ), makeSymbol( "ELEMENTS" ) );
    $kw90$REMOVAL_ELEMENTOF_UNIFY = makeKeyword( "REMOVAL-ELEMENTOF-UNIFY" );
    $list91 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ELEMENTOF-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-ELEMENTOF-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))" )
    } );
    $kw92$REMOVAL_ELEMENTOF_COLLECTION_UNIFY = makeKeyword( "REMOVAL-ELEMENTOF-COLLECTION-UNIFY" );
    $list93 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "COLLECTION-FORT" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS" ), makeKeyword(
          "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
              "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "ISA" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$elementOf ?DOG #$Dog)" )
    } );
    $kw94$REMOVAL_ELEMENTOF_SET_UNIFY = makeKeyword( "REMOVAL-ELEMENTOF-SET-UNIFY" );
    $list95 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FORT" ),
            ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "COLLECTION-P" ) ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ELEMENTOF-SET-UNIFY-COST" ), makeKeyword(
                "COMPLETE-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-COMPLETELY-ASSERTED-ASENT?" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
                            .list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                                makeKeyword( "CALL" ), makeSymbol( "GAF-FORMULA" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                    "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)" )
    } );
    $sym96$EL_LITERAL_P = makeSymbol( "EL-LITERAL-P" );
    $kw97$HL = makeKeyword( "HL" );
    $kw98$REMOVAL_ELEMENTOF_THESETOF_UNIFY = makeKeyword( "REMOVAL-ELEMENTOF-THESETOF-UNIFY" );
    $list99 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))" )
    } );
    $kw100$REMOVAL_ISA_THECOLLECTIONOF_UNIFY = makeKeyword( "REMOVAL-ISA-THECOLLECTIONOF-UNIFY" );
    $list101 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword(
                "REMOVAL-ALL-INSTANCES" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))" )
    } );
    $const102$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $const103$subcollectionFunctionDefiningRule = constant_handles.reader_make_constant_shell( makeString( "subcollectionFunctionDefiningRule" ) );
    $str104$Expected__s_to_have_only_one_free = makeString( "Expected ~s to have only one free variable" );
    $str105$Expected_exactly_one_poslit_in__S = makeString( "Expected exactly one poslit in ~S" );
    $str106$Expected_exactly_one___termOfUnit = makeString( "Expected exactly one #$termOfUnit neglit in ~S" );
    $list107 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SubcollectionOfWithRelationFromFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "SubcollectionOfWithRelationFromTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SubcollectionOccursAtFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                "CollectionSubsetFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), constant_handles.reader_make_constant_shell( makeString( "CollectionDifferenceFn" ) ) );
    $kw108$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-UNIFY" );
    $list109 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))" )
    } );
    $kw110$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-CHECK" );
    $list111 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))" )
    } );
    $kw112$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-UNIFY" );
    $list113 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))" )
    } );
    $kw114$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-CHECK" );
    $list115 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))" )
    } );
    $kw116$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-UNIFY" );
    $list117 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))" )
    } );
    $kw118$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-CHECK" );
    $list119 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))" )
    } );
    $kw120$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-UNIFY" );
    $list121 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))" )
    } );
    $kw122$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-CHECK" );
    $list123 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))" )
    } );
    $kw124$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-UNIFY" );
    $list125 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOccursAtFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))" )
    } );
    $kw126$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK = makeKeyword( "REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-CHECK" );
    $list127 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "SubcollectionOccursAtFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))" )
    } );
    $kw128$REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY = makeKeyword( "REMOVAL-ISA-COLLECTION-SUBSET-FN-UNIFY" );
    $list129 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CollectionSubsetFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-COLLECTION-SUBSET-FN-COST" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))" )
    } );
    $kw130$REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK = makeKeyword( "REMOVAL-ISA-COLLECTION-SUBSET-FN-CHECK" );
    $list131 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CollectionSubsetFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))" )
    } );
    $kw132$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY = makeKeyword( "REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-UNIFY" );
    $list133 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))" )
    } );
    $kw134$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK = makeKeyword( "REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-CHECK" );
    $list135 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))" )
    } );
    $kw136$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY = makeKeyword( "REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-UNIFY" );
    $list137 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CollectionDifferenceFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-COST" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))" )
    } );
    $kw138$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK = makeKeyword( "REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-CHECK" );
    $list139 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "CollectionDifferenceFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))" )
    } );
    $kw140$REMOVAL_ALL_ISA_OF_TYPE = makeKeyword( "REMOVAL-ALL-ISA-OF-TYPE" );
    $list141 = ConsesLow.list( new SubLObject[] { makeKeyword( "EVERY-PREDICATES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), makeKeyword( "APPLICABILITY" ), makeSymbol(
        "REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( NIL, ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword(
            "BIND" ), makeSymbol( "MT-1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT-1" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT-2" ) ), ConsesLow.list(
                makeKeyword( "BIND" ), makeSymbol( "ASENT-2" ) ) ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                    "ASENT-1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT-1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT-2" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "MT-2" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ALL-ISA-OF-TYPE-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ALL-ISA-OF-TYPE-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))" )
    } );
    $sym142$BINARY_CLAUSE_P = makeSymbol( "BINARY-CLAUSE-P" );
    $list143 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $sym144$FORT_P = makeSymbol( "FORT-P" );
    $list145 = ConsesLow.list( makeSymbol( "CONTEXTUALIZED-ASENT0" ), makeSymbol( "CONTEXTUALIZED-ASENT1" ) );
    $list146 = ConsesLow.list( makeSymbol( "MT0" ), makeSymbol( "ASENT0" ) );
    $list147 = ConsesLow.list( makeSymbol( "MT1" ), makeSymbol( "ASENT1" ) );
    $const148$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $kw149$ALL_QUOTED_INSTANCES_POS = makeKeyword( "ALL-QUOTED-INSTANCES-POS" );
    $list150 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "PREFERENCE" ), makeSymbol(
            "ALL-QUOTED-INSTANCES-POS-PREFERENCE" ) );
    $kw151$ALL_QUOTED_ISA_POS = makeKeyword( "ALL-QUOTED-ISA-POS" );
    $list152 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "DISPREFERRED" ) );
    $kw153$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS = makeKeyword( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS" );
    $list154 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$quotedIsa <fort> <fort>)" )
    } );
    $kw155$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG = makeKeyword( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG" );
    $list156 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (#$quotedIsa <fort> <fort>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$quotedIsa #$Dog #$Predicate))" )
    } );
    $kw157$REMOVAL_QUOTED_ISA_DEFN_POS = makeKeyword( "REMOVAL-QUOTED-ISA-DEFN-POS" );
    $list158 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "REQUIRED" ), makeSymbol(
            "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-QUOTED-ISA-DEFN-POS-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient" ), makeKeyword( "EXAMPLE" ), makeString( "(#$quotedIsa 42 #$SubLInteger)" )
    } );
    $kw159$REMOVAL_QUOTED_ISA_DEFN_NEG = makeKeyword( "REMOVAL-QUOTED-ISA-DEFN-NEG" );
    $list160 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-QUOTED-ISA-DEFN-NEG-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$quotedIsa 42 #$SubLString))" )
    } );
    $kw161$REMOVAL_NAT_QUOTED_ISA = makeKeyword( "REMOVAL-NAT-QUOTED-ISA" );
    $list162 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-QUOTED-ISA-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)" )
    } );
    $kw163$REMOVAL_ALL_QUOTED_ISA = makeKeyword( "REMOVAL-ALL-QUOTED-ISA" );
    $list164 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*AVERAGE-ALL-ISA-COUNT*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ALL-QUOTED-ISA-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$quotedIsa <fort> <not fully-bound>)" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$quotedIsa #$Dog ?COL)" )
    } );
    $kw165$REMOVAL_NAT_ALL_QUOTED_ISA = makeKeyword( "REMOVAL-NAT-ALL-QUOTED-ISA" );
    $list166 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*AVERAGE-ALL-ISA-COUNT*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)" )
    } );
    $kw167$REMOVAL_ALL_QUOTED_INSTANCES = makeKeyword( "REMOVAL-ALL-QUOTED-INSTANCES" );
    $list168 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ALL-QUOTED-INSTANCES-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "quotedIsa" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "ISA" ), makeKeyword( "SUPPORT-STRENGTH" ),
      makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$quotedIsa <not fully-bound> <fort>)" )
    } );
  }

  public static final class $removal_isa_collection_check_pos_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_isa_collection_check_pos_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ISA-COLLECTION-CHECK-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_isa_collection_check_pos_cost( arg1, $removal_isa_collection_check_pos_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_isa_collection_check_pos_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_isa_collection_check_pos_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ISA-COLLECTION-CHECK-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_isa_collection_check_pos_cost( arg1, arg2 );
    }
  }

  public static final class $removal_all_instances_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_all_instances_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ALL-INSTANCES-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_all_instances_cost( arg1, $removal_all_instances_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_all_instances_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_all_instances_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ALL-INSTANCES-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_all_instances_cost( arg1, arg2 );
    }
  }

  public static final class $removal_all_instances_completeness$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_all_instances_completeness$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ALL-INSTANCES-COMPLETENESS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_all_instances_completeness( arg1 );
    }
  }

  public static final class $removal_elementof_check_expand$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_elementof_check_expand$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ELEMENTOF-CHECK-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_elementof_check_expand( arg1, $removal_elementof_check_expand$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_elementof_check_expand$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_elementof_check_expand$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ELEMENTOF-CHECK-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_elementof_check_expand( arg1, arg2 );
    }
  }

  public static final class $removal_all_isa_of_type_applicability$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_all_isa_of_type_applicability$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_all_isa_of_type_applicability( arg1 );
    }
  }

  public static final class $removal_quoted_isa_collection_check_pos_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_quoted_isa_collection_check_pos_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_quoted_isa_collection_check_pos_cost( arg1, $removal_quoted_isa_collection_check_pos_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_quoted_isa_collection_check_pos_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_quoted_isa_collection_check_pos_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_quoted_isa_collection_check_pos_cost( arg1, arg2 );
    }
  }

  public static final class $removal_quoted_isa_collection_check_pos_expand$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_quoted_isa_collection_check_pos_expand$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_quoted_isa_collection_check_pos_expand( arg1, $removal_quoted_isa_collection_check_pos_expand$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_quoted_isa_collection_check_pos_expand$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_quoted_isa_collection_check_pos_expand$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_quoted_isa_collection_check_pos_expand( arg1, arg2 );
    }
  }

  public static final class $removal_quoted_isa_defn_pos_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_quoted_isa_defn_pos_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_quoted_isa_defn_pos_required( arg1, $removal_quoted_isa_defn_pos_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_quoted_isa_defn_pos_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_quoted_isa_defn_pos_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_quoted_isa_defn_pos_required( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 925 ms
 * 
 */