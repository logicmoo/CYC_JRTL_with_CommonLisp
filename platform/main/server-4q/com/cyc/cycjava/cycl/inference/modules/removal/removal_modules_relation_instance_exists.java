package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_relation_instance_exists
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_instance_exists";
  public static final String myFingerPrint = "98a4f2cc8a9baae65d418938ad512716b76c1a4da71a6236c4066a338b12ea4c";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 4765L)
  private static SubLSymbol $relation_instance_exists_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 4982L)
  public static SubLSymbol $relation_instance_exists_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 8728L)
  private static SubLSymbol $default_relation_instance_exists_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 13457L)
  private static SubLSymbol $minimum_relation_instance_exists_unify_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 28406L)
  private static SubLSymbol $relation_exists_instance_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 28623L)
  public static SubLSymbol $relation_exists_instance_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 32347L)
  private static SubLSymbol $default_relation_exists_instance_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 37201L)
  private static SubLSymbol $minimum_relation_exists_instance_unify_cost$;
  private static final SubLSymbol $kw0$GENL_PREDS;
  private static final SubLSymbol $kw1$GENL_INVERSE;
  private static final SubLSymbol $kw2$BOTH;
  private static final SubLObject $const3$relationInstanceExists;
  private static final SubLObject $const4$RelationInstanceExistsFn;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_;
  private static final SubLObject $const7$BaseKB;
  private static final SubLSymbol $kw8$CODE;
  private static final SubLSymbol $kw9$TRUE_MON;
  private static final SubLSymbol $kw10$REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$RIE_COL;
  private static final SubLSymbol $sym15$RIE_TERM;
  private static final SubLSymbol $sym16$RIE_PRED;
  private static final SubLSymbol $sym17$TERM;
  private static final SubLSymbol $sym18$PREDICATE;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$POS;
  private static final SubLSymbol $kw22$GAF_ARG;
  private static final SubLSymbol $kw23$GAF;
  private static final SubLSymbol $kw24$PREDICATE_EXTENT;
  private static final SubLSymbol $kw25$OVERLAP;
  private static final SubLSymbol $kw26$REMOVAL_RELATION_INSTANCE_EXISTS_CHECK;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$TRUE;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2;
  private static final SubLList $list37;
  private static final SubLObject $const38$relationExistsInstance;
  private static final SubLObject $const39$RelationExistsInstanceFn;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$_RELATION_EXISTS_INSTANCE_DEFINING_MT_;
  private static final SubLSymbol $kw42$REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$REI_TERM;
  private static final SubLSymbol $sym47$REI_COL;
  private static final SubLSymbol $sym48$REI_PRED;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$REMOVAL_RELATION_EXISTS_INSTANCE_CHECK;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2;
  private static final SubLList $list56;
  private static final SubLSymbol $kw57$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR;
  private static final SubLList $list62;
  private static final SubLObject $const63$thereExists;
  private static final SubLSymbol $sym64$_INS;
  private static final SubLObject $const65$and;
  private static final SubLList $list66;
  private static final SubLObject $const67$isa;
  private static final SubLSymbol $kw68$QUERY;
  private static final SubLSymbol $kw69$REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR;
  private static final SubLList $list70;
  private static final SubLSymbol $kw71$REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $kw77$TVA;
  private static final SubLSymbol $kw78$ISA;
  private static final SubLList $list79;
  private static final SubLList $list80;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 920L)
  public static SubLObject some_relation_instance_for_predicate(final SubLObject relation_instance_pred, final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( predicate, relation_instance_pred, mt, ONE_INTEGER, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != sksi_infrastructure_utilities.any_sksi_content_mt_relevantP() )
    {
      return sksi_tva_utilities.sksi_pred_and_relevance_p( relation_instance_pred );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 1520L)
  public static SubLObject removal_relation_instance_support_direction_relevantP(final SubLObject support)
  {
    if( NIL != kb_control_vars.within_forward_inferenceP() && NIL != sksi_infrastructure_utilities.sksi_support_p( support ) )
    {
      return NIL;
    }
    if( NIL != assertion_handles.assertion_p( support ) && NIL == backward_utilities.direction_is_relevant( support ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 1975L)
  public static SubLObject removal_relation_instance_support_sentence(final SubLObject support)
  {
    return ( NIL != assertions_high.gaf_assertionP( support ) ) ? assertions_high.gaf_formula( support ) : arguments.hl_support_sentence( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 2148L)
  public static SubLObject sksi_relation_instance_cost(final SubLObject rel_inst_pred)
  {
    SubLObject sksi_cost = ZERO_INTEGER;
    if( NIL != sksi_infrastructure_utilities.any_sksi_content_mt_relevantP() )
    {
      sksi_cost = sksi_sks_predicate_indexing.sksi_indexed_predicate_extent_count_in_relevant_mts( rel_inst_pred );
    }
    return sksi_cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 2541L)
  public static SubLObject removal_all_spec_or_inverse_predicates(final SubLObject predicate, final SubLObject mode)
  {
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      return inference_trampolines.inference_all_spec_predicates( predicate );
    }
    if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      return inference_trampolines.inference_all_spec_inverses( predicate );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 2765L)
  public static SubLObject removal_some_relation_instance_exists_for_predicate(final SubLObject predicate, final SubLObject mode, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( mode.eql( $kw2$BOTH ) )
    {
      return makeBoolean( NIL != some_relation_instance_exists_for_predicate_and_spec( predicate, mt ) || NIL != some_relation_instance_exists_for_predicate_and_inverse( predicate, mt ) );
    }
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      return some_relation_instance_exists_for_predicate_and_spec( predicate, mt );
    }
    if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      return some_relation_instance_exists_for_predicate_and_inverse( predicate, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 3487L)
  public static SubLObject some_relation_instance_exists_for_predicate(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return some_relation_instance_for_predicate( $const3$relationInstanceExists, predicate, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 3659L)
  public static SubLObject some_relation_instance_exists_for_predicate_and_spec(final SubLObject predicate, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject spec_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_predicates( predicate );
    SubLObject spec_predicate = NIL;
    spec_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_relation_instance_exists_for_predicate( spec_predicate, mt ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 3950L)
  public static SubLObject some_relation_instance_exists_for_predicate_and_inverse(final SubLObject predicate, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject inv_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_inverses( predicate );
    SubLObject inv_predicate = NIL;
    inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_relation_instance_exists_for_predicate( inv_predicate, mt ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      inv_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 4239L)
  public static SubLObject removal_relation_instance_exists_required(final SubLObject asent, final SubLObject mode, final SubLObject require_new_terms_allowedP)
  {
    if( NIL != require_new_terms_allowedP && NIL == removal_module_utilities.current_query_allows_new_termsP() )
    {
      return NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    return makeBoolean( NIL == hl_supports.hl_predicate_p( predicate ) && ( NIL == require_new_terms_allowedP || NIL != removal_modules_termofunit.skolemization_allowed( $const4$RelationInstanceExistsFn ) )
        && NIL != removal_some_relation_instance_exists_for_predicate( predicate, mode, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 5075L)
  public static SubLObject make_relation_instance_exists_support()
  {
    return arguments.make_hl_support( $kw8$CODE, $relation_instance_exists_rule$.getGlobalValue(), $relation_instance_exists_defining_mt$.getGlobalValue(), $kw9$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 5247L)
  public static SubLObject make_relation_instance_exists_term(final SubLObject predicate, final SubLObject v_object, final SubLObject coll)
  {
    return el_utilities.list_to_elf( ConsesLow.list( $const4$RelationInstanceExistsFn, predicate, v_object, coll ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 5934L)
  public static SubLObject removal_relation_instance_exists_prune(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != formula_pattern_match.pattern_matches_formula( $list12, asent ) )
    {
      final SubLObject pattern = $list13;
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject rie_col = list_utilities.alist_lookup_without_values( v_bindings, $sym14$RIE_COL, UNPROVIDED, UNPROVIDED );
        final SubLObject rie_term = list_utilities.alist_lookup_without_values( v_bindings, $sym15$RIE_TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject rie_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym16$RIE_PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym17$TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject predicate = list_utilities.alist_lookup_without_values( v_bindings, $sym18$PREDICATE, UNPROVIDED, UNPROVIDED );
        if( !rie_pred.eql( predicate ) && NIL == genl_predicates.genl_predicateP( rie_pred, predicate, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        if( NIL == unification.unify_possible( rie_term, v_term ) )
        {
          return T;
        }
      }
    }
    else
    {
      if( NIL == formula_pattern_match.pattern_matches_formula( $list19, asent ) )
      {
        return T;
      }
      final SubLObject pattern = $list20;
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject rie_col = list_utilities.alist_lookup_without_values( v_bindings, $sym14$RIE_COL, UNPROVIDED, UNPROVIDED );
        final SubLObject rie_term = list_utilities.alist_lookup_without_values( v_bindings, $sym15$RIE_TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject rie_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym16$RIE_PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym17$TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject predicate = list_utilities.alist_lookup_without_values( v_bindings, $sym18$PREDICATE, UNPROVIDED, UNPROVIDED );
        if( !rie_pred.eql( predicate ) && NIL == genl_predicates.genl_inverseP( rie_pred, predicate, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        if( NIL == unification.unify_possible( rie_term, v_term ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 7186L)
  public static SubLObject removal_relation_instance_exists_check_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == removal_relation_instance_exists_required( asent, $kw2$BOTH, NIL ) )
    {
      return NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != el_utilities.el_formula_p( arg2 ) && NIL != cycl_utilities.formula_find( $const4$RelationInstanceExistsFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject functor = el_utilities.unmake_ternary_formula( arg2 );
      final SubLObject rie_pred = thread.secondMultipleValue();
      final SubLObject v_term = thread.thirdMultipleValue();
      final SubLObject coll = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      return makeBoolean( ( rie_pred.eql( predicate ) || NIL != genl_predicates.genl_predicateP( rie_pred, predicate, UNPROVIDED, UNPROVIDED ) ) && arg1.equal( v_term ) );
    }
    if( NIL != el_utilities.el_formula_p( arg1 ) && NIL != cycl_utilities.formula_find( $const4$RelationInstanceExistsFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject functor = el_utilities.unmake_ternary_formula( arg1 );
      final SubLObject rie_pred = thread.secondMultipleValue();
      final SubLObject v_term = thread.thirdMultipleValue();
      final SubLObject coll = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      return makeBoolean( ( rie_pred.eql( predicate ) || NIL != genl_predicates.genl_inverseP( rie_pred, predicate, UNPROVIDED, UNPROVIDED ) ) && arg2.equal( v_term ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 8842L)
  public static SubLObject removal_relation_instance_exists_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject functor = NIL;
    SubLObject pred = NIL;
    SubLObject v_term = NIL;
    SubLObject coll = NIL;
    SubLObject mode = NIL;
    if( NIL != el_utilities.el_formula_p( arg2 ) && NIL != cycl_utilities.formula_find( $const4$RelationInstanceExistsFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject functor_$1 = el_utilities.unmake_ternary_formula( arg2 );
      final SubLObject pred_$2 = thread.secondMultipleValue();
      final SubLObject v_term_$3 = thread.thirdMultipleValue();
      final SubLObject coll_$4 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      functor = functor_$1;
      pred = pred_$2;
      v_term = v_term_$3;
      coll = coll_$4;
      mode = $kw0$GENL_PREDS;
    }
    else if( NIL != el_utilities.el_formula_p( arg1 ) && NIL != cycl_utilities.formula_find( $const4$RelationInstanceExistsFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject functor_$2 = el_utilities.unmake_ternary_formula( arg1 );
      final SubLObject pred_$3 = thread.secondMultipleValue();
      final SubLObject v_term_$4 = thread.thirdMultipleValue();
      final SubLObject coll_$5 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      functor = functor_$2;
      pred = pred_$3;
      v_term = v_term_$4;
      coll = coll_$5;
      mode = $kw1$GENL_INVERSE;
    }
    final SubLObject rie_sentence = el_utilities.list_to_elf( ConsesLow.list( $const3$relationInstanceExists, pred, v_term, coll ) );
    final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( rie_sentence, $kw21$POS );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw22$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term_$5 = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate_$10 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate_$10 )
        {
          final SubLObject pred_var = predicate_$10;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$5, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$5, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                  SubLObject done_var_$11 = NIL;
                  final SubLObject token_var_$12 = NIL;
                  while ( NIL == done_var_$11)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$12 );
                    final SubLObject valid_$13 = makeBoolean( !token_var_$12.eql( assertion ) );
                    if( NIL != valid_$13 )
                    {
                      removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, assertion, mode );
                    }
                    done_var_$11 = makeBoolean( NIL == valid_$13 );
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
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$5, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$5, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                  SubLObject done_var_$12 = NIL;
                  final SubLObject token_var_$13 = NIL;
                  while ( NIL == done_var_$12)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$13 );
                    final SubLObject valid_$14 = makeBoolean( !token_var_$13.eql( assertion ) );
                    if( NIL != valid_$14 )
                    {
                      removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, assertion, mode );
                    }
                    done_var_$12 = makeBoolean( NIL == valid_$14 );
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
      else if( NIL != predicate_$10 )
      {
        final SubLObject pred_var = predicate_$10;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$5, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$5, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                SubLObject done_var_$13 = NIL;
                final SubLObject token_var_$14 = NIL;
                while ( NIL == done_var_$13)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$14 );
                  final SubLObject valid_$15 = makeBoolean( !token_var_$14.eql( assertion ) );
                  if( NIL != valid_$15 )
                  {
                    removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, assertion, mode );
                  }
                  done_var_$13 = makeBoolean( NIL == valid_$15 );
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
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$5, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$5, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                SubLObject done_var_$14 = NIL;
                final SubLObject token_var_$15 = NIL;
                while ( NIL == done_var_$14)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$15 );
                  final SubLObject valid_$16 = makeBoolean( !token_var_$15.eql( assertion ) );
                  if( NIL != valid_$16 )
                  {
                    removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, assertion, mode );
                  }
                  done_var_$14 = makeBoolean( NIL == valid_$16 );
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
    else if( pcase_var.eql( $kw24$PREDICATE_EXTENT ) )
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
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                SubLObject done_var_$15 = NIL;
                final SubLObject token_var_$16 = NIL;
                while ( NIL == done_var_$15)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$16 );
                  final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( assertion2 ) );
                  if( NIL != valid_$17 )
                  {
                    removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, assertion2, mode );
                  }
                  done_var_$15 = makeBoolean( NIL == valid_$17 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
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
    else if( pcase_var.eql( $kw25$OVERLAP ) )
    {
      SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == enumeration_types.sense_truth( $kw21$POS ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( $kw21$POS ) ) )
        {
          removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, assertion3, mode );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion3 = cdolist_list_var.first();
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_lookup_index( rie_sentence, $kw21$POS );
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject support_$27 = support;
      removal_relation_instance_exists_check_expand_internal( predicate, v_term, coll, support_$27, mode );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 11124L)
  public static SubLObject removal_relation_instance_exists_check_expand_internal(final SubLObject pred, final SubLObject v_term, final SubLObject coll, final SubLObject support, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == removal_relation_instance_support_direction_relevantP( support ) )
    {
      return NIL;
    }
    final SubLObject support_sent = removal_relation_instance_support_sentence( support );
    if( NIL != el_utilities.formula_arityE( support_sent, THREE_INTEGER, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject relation_instance_exists = el_utilities.unmake_ternary_formula( support_sent );
      final SubLObject gaf_pred = thread.secondMultipleValue();
      final SubLObject gaf_obj = thread.thirdMultipleValue();
      final SubLObject gaf_coll = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      if( !gaf_obj.equal( v_term ) || !gaf_coll.equal( coll ) )
      {
        return NIL;
      }
      SubLObject more_supports = NIL;
      if( mode.eql( $kw0$GENL_PREDS ) )
      {
        if( gaf_pred.eql( pred ) || NIL != genl_predicates.genl_predicateP( gaf_pred, pred, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject rule_support = make_relation_instance_exists_support();
          final SubLObject genl_preds_supports = removal_module_utilities.additional_genl_preds_supports( gaf_pred, pred );
          more_supports = ConsesLow.listS( rule_support, genl_preds_supports );
        }
      }
      else if( mode.eql( $kw1$GENL_INVERSE ) )
      {
        if( gaf_pred.eql( pred ) || NIL != genl_predicates.genl_inverseP( gaf_pred, pred, UNPROVIDED, UNPROVIDED ) )
        {
        }
        final SubLObject rule_support = make_relation_instance_exists_support();
        final SubLObject genl_inverse_supports = removal_module_utilities.additional_genl_inverse_supports( gaf_pred, pred );
        more_supports = ConsesLow.listS( rule_support, genl_inverse_supports );
      }
      backward.removal_add_node( support, NIL, more_supports );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 12525L)
  public static SubLObject removal_relation_instance_exists_unify_arg1_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_required( asent, $kw1$GENL_INVERSE, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 13273L)
  public static SubLObject removal_relation_instance_exists_unify_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_required( asent, $kw0$GENL_PREDS, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 13566L)
  public static SubLObject removal_relation_instance_exists_unify_cost(final SubLObject predicate, final SubLObject v_term, final SubLObject mode)
  {
    final SubLObject predicate_cost_estimate = relation_instance_exists_predicate_cost_estimate( predicate, mode, UNPROVIDED );
    final SubLObject object_cost_estimate = relation_instance_exists_object_cost_estimate( v_term, UNPROVIDED );
    return Numbers.max( $minimum_relation_instance_exists_unify_cost$.getGlobalValue(), Numbers.min( predicate_cost_estimate, object_cost_estimate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 13962L)
  public static SubLObject removal_relation_instance_exists_unify_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return removal_relation_instance_exists_unify_cost( predicate, v_term, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 14255L)
  public static SubLObject removal_relation_instance_exists_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_relation_instance_exists_unify_cost( predicate, v_term, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 14550L)
  public static SubLObject removal_relation_instance_exists_unify_expand(final SubLObject predicate, final SubLObject v_term, final SubLObject asent, final SubLObject mode)
  {
    final SubLObject predicate_cost_estimate = relation_instance_exists_predicate_cost_estimate( predicate, mode, NIL );
    final SubLObject object_cost_estimate = relation_instance_exists_object_cost_estimate( v_term, NIL );
    if( predicate_cost_estimate.numLE( object_cost_estimate ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates( predicate, mode );
      SubLObject spec_inv_predicate = NIL;
      spec_inv_predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred_var = $const3$relationInstanceExists;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( spec_inv_predicate, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( spec_inv_predicate, ONE_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw28$TRUE, NIL );
                SubLObject done_var_$28 = NIL;
                final SubLObject token_var_$29 = NIL;
                while ( NIL == done_var_$28)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$29 );
                  final SubLObject valid_$30 = makeBoolean( !token_var_$29.eql( assertion ) );
                  if( NIL != valid_$30 )
                  {
                    removal_relation_instance_exists_unify_via_predicate_expand( asent, assertion, v_term, mode );
                  }
                  done_var_$28 = makeBoolean( NIL == valid_$30 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec_inv_predicate = cdolist_list_var.first();
      }
    }
    else
    {
      final SubLObject pred_var2 = $const3$relationInstanceExists;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, TWO_INTEGER, pred_var2 ) )
      {
        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, TWO_INTEGER, pred_var2 );
        SubLObject done_var2 = NIL;
        final SubLObject token_var2 = NIL;
        while ( NIL == done_var2)
        {
          final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
          final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
          if( NIL != valid2 )
          {
            SubLObject final_index_iterator2 = NIL;
            try
            {
              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw23$GAF, $kw28$TRUE, NIL );
              SubLObject done_var_$29 = NIL;
              final SubLObject token_var_$30 = NIL;
              while ( NIL == done_var_$29)
              {
                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$30 );
                final SubLObject valid_$31 = makeBoolean( !token_var_$30.eql( assertion2 ) );
                if( NIL != valid_$31 )
                {
                  removal_relation_instance_exists_unify_via_object_expand( asent, assertion2, mode );
                }
                done_var_$29 = makeBoolean( NIL == valid_$31 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator2 )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
              }
            }
          }
          done_var2 = makeBoolean( NIL == valid2 );
        }
      }
    }
    SubLObject cdolist_list_var;
    final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates( predicate, mode );
    SubLObject spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$34 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( spec_inv_predicate, ONE_INTEGER, $const3$relationInstanceExists, $kw28$TRUE );
      SubLObject gather_sentence_mt_pair = NIL;
      gather_sentence_mt_pair = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        SubLObject current;
        final SubLObject datum = current = gather_sentence_mt_pair;
        SubLObject support_sent = NIL;
        SubLObject support_mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_sent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_mt = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject support = sksi_infrastructure_utilities.make_sksi_support( support_sent, support_mt );
          removal_relation_instance_exists_unify_via_predicate_expand( asent, support, v_term, mode );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
        }
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        gather_sentence_mt_pair = cdolist_list_var_$34.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 16027L)
  public static SubLObject removal_relation_instance_exists_unify_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return removal_relation_instance_exists_unify_expand( predicate, v_term, asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 16330L)
  public static SubLObject removal_relation_instance_exists_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_relation_instance_exists_unify_expand( predicate, v_term, asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 17994L)
  public static SubLObject relation_instance_exists_sksi_cost()
  {
    return sksi_relation_instance_cost( $const3$relationInstanceExists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 18127L)
  public static SubLObject relation_instance_exists_predicate_cost_estimate(final SubLObject predicate, final SubLObject mode, SubLObject include_sksiP)
  {
    if( include_sksiP == UNPROVIDED )
    {
      include_sksiP = T;
    }
    final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates( predicate, mode );
    SubLObject kb_cost = ZERO_INTEGER;
    final SubLObject sksi_cost = ( NIL != include_sksiP ) ? relation_instance_exists_sksi_cost() : ZERO_INTEGER;
    SubLObject cdolist_list_var = spec_inv_predicates;
    SubLObject spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_relation_instance_exists_for_predicate( spec_inv_predicate, UNPROVIDED ) )
      {
        kb_cost = Numbers.add( kb_cost, kb_indexing.relevant_num_gaf_arg_index( spec_inv_predicate, ONE_INTEGER, $const3$relationInstanceExists ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    return Numbers.add( kb_cost, sksi_cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 18672L)
  public static SubLObject relation_instance_exists_object_cost_estimate(final SubLObject v_object, SubLObject include_sksiP)
  {
    if( include_sksiP == UNPROVIDED )
    {
      include_sksiP = T;
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_object ) )
    {
      return ( NIL != include_sksiP ) ? Numbers.add( kb_indexing.relevant_num_gaf_arg_index( v_object, TWO_INTEGER, $const3$relationInstanceExists ), relation_instance_exists_sksi_cost() )
          : kb_indexing.relevant_num_gaf_arg_index( v_object, TWO_INTEGER, $const3$relationInstanceExists );
    }
    return Numbers.$most_positive_fixnum$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 19363L)
  public static SubLObject removal_relation_instance_exists_unify_via_predicate_expand(final SubLObject asent, final SubLObject support, final SubLObject v_term, final SubLObject mode)
  {
    if( NIL != variables.fully_bound_p( v_term ) )
    {
      final SubLObject support_sent = removal_relation_instance_support_sentence( support );
      if( !v_term.equal( cycl_utilities.atomic_sentence_arg2( support_sent, UNPROVIDED ) ) )
      {
        return NIL;
      }
    }
    return removal_relation_instance_exists_unify_expand_guts( asent, support, mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 19863L)
  public static SubLObject removal_relation_instance_exists_unify_via_object_expand(final SubLObject asent, final SubLObject assertion, final SubLObject mode)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject rie_pred = assertions_high.gaf_arg1( assertion );
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      if( !rie_pred.eql( predicate ) && NIL == genl_predicates.genl_predP( rie_pred, predicate, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    else if( mode.eql( $kw1$GENL_INVERSE ) && !rie_pred.eql( predicate ) && NIL == genl_predicates.genl_inverseP( rie_pred, predicate, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return removal_relation_instance_exists_unify_expand_guts( asent, assertion, mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 20568L)
  public static SubLObject removal_relation_instance_exists_unify_expand_guts(final SubLObject asent, final SubLObject support, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == removal_relation_instance_support_direction_relevantP( support ) )
    {
      return NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject support_sent = removal_relation_instance_support_sentence( support );
    final SubLObject rie_pred = cycl_utilities.atomic_sentence_arg1( support_sent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( support_sent, UNPROVIDED );
    final SubLObject coll = cycl_utilities.atomic_sentence_arg3( support_sent, UNPROVIDED );
    final SubLObject exists_term = make_relation_instance_exists_term( rie_pred, v_term, coll );
    SubLObject bound_asent = NIL;
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      bound_asent = ConsesLow.list( predicate, v_term, exists_term );
    }
    else if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      bound_asent = ConsesLow.list( predicate, exists_term, v_term );
    }
    if( NIL != function_terms.within_term_functional_complexity_cutoffP( exists_term ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( asent, bound_asent, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject rule_support = make_relation_instance_exists_support();
        SubLObject pred_supports = NIL;
        SubLObject more_supports = NIL;
        if( mode.eql( $kw0$GENL_PREDS ) )
        {
          pred_supports = removal_module_utilities.additional_genl_preds_supports( rie_pred, predicate );
        }
        else if( mode.eql( $kw1$GENL_INVERSE ) )
        {
          pred_supports = removal_module_utilities.additional_genl_inverse_supports( rie_pred, predicate );
        }
        more_supports = ConsesLow.append( ConsesLow.list( rule_support ), pred_supports, unify_justification );
        backward.removal_add_node( support, v_bindings, more_supports );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 21960L)
  public static SubLObject removal_relation_instance_exists_unbound_required(final SubLObject asent, final SubLObject mode)
  {
    return removal_relation_instance_exists_required( asent, mode, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 22657L)
  public static SubLObject removal_relation_instance_exists_unbound_arg1_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_required( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 22849L)
  public static SubLObject removal_relation_instance_exists_unbound_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_required( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 23043L)
  public static SubLObject removal_relation_instance_exists_unbound_cost(final SubLObject asent, final SubLObject mode)
  {
    return relation_instance_exists_predicate_cost_estimate( cycl_utilities.atomic_sentence_predicate( asent ), mode, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 23218L)
  public static SubLObject removal_relation_instance_exists_unbound_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_cost( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 23402L)
  public static SubLObject removal_relation_instance_exists_unbound_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_cost( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 23588L)
  public static SubLObject removal_relation_instance_exists_unbound_expand(final SubLObject asent, final SubLObject mode)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject v_term = NIL;
    final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates( predicate, mode );
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    }
    else if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    }
    SubLObject cdolist_list_var = spec_inv_predicates;
    SubLObject spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_var = $const3$relationInstanceExists;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( spec_inv_predicate, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( spec_inv_predicate, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw28$TRUE, NIL );
              SubLObject done_var_$35 = NIL;
              final SubLObject token_var_$36 = NIL;
              while ( NIL == done_var_$35)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$36 );
                final SubLObject valid_$37 = makeBoolean( !token_var_$36.eql( assertion ) );
                if( NIL != valid_$37 )
                {
                  removal_relation_instance_exists_unify_via_predicate_expand( asent, assertion, v_term, mode );
                }
                done_var_$35 = makeBoolean( NIL == valid_$37 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    cdolist_list_var = spec_inv_predicates;
    spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$38 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( spec_inv_predicate, ONE_INTEGER, $const3$relationInstanceExists, $kw28$TRUE );
      SubLObject gather_sentence_mt_pair = NIL;
      gather_sentence_mt_pair = cdolist_list_var_$38.first();
      while ( NIL != cdolist_list_var_$38)
      {
        SubLObject current;
        final SubLObject datum = current = gather_sentence_mt_pair;
        SubLObject support_sent = NIL;
        SubLObject support_mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_sent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_mt = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject support = sksi_infrastructure_utilities.make_sksi_support( support_sent, support_mt );
          removal_relation_instance_exists_unify_via_predicate_expand( asent, support, v_term, mode );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
        }
        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
        gather_sentence_mt_pair = cdolist_list_var_$38.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 24594L)
  public static SubLObject removal_relation_instance_exists_unbound_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_expand( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 24782L)
  public static SubLObject removal_relation_instance_exists_unbound_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_expand( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 26403L)
  public static SubLObject removal_some_relation_exists_instance_for_predicate(final SubLObject predicate, final SubLObject mode, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( mode.eql( $kw2$BOTH ) )
    {
      return makeBoolean( NIL != some_relation_exists_instance_for_predicate_and_spec( predicate, mt ) || NIL != some_relation_exists_instance_for_predicate_and_inverse( predicate, mt ) );
    }
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      return some_relation_exists_instance_for_predicate_and_spec( predicate, mt );
    }
    if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      return some_relation_exists_instance_for_predicate_and_inverse( predicate, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27124L)
  public static SubLObject some_relation_exists_instance_for_predicate(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return some_relation_instance_for_predicate( $const38$relationExistsInstance, predicate, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27301L)
  public static SubLObject some_relation_exists_instance_for_predicate_and_spec(final SubLObject predicate, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject spec_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_predicates( predicate );
    SubLObject spec_predicate = NIL;
    spec_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_relation_exists_instance_for_predicate( spec_predicate, mt ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27592L)
  public static SubLObject some_relation_exists_instance_for_predicate_and_inverse(final SubLObject predicate, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject inv_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_inverses( predicate );
    SubLObject inv_predicate = NIL;
    inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_relation_exists_instance_for_predicate( inv_predicate, mt ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      inv_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27880L)
  public static SubLObject removal_relation_exists_instance_required(final SubLObject asent, final SubLObject mode, final SubLObject require_new_terms_allowedP)
  {
    if( NIL != require_new_terms_allowedP && NIL == removal_module_utilities.current_query_allows_new_termsP() )
    {
      return NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    return makeBoolean( NIL == hl_supports.hl_predicate_p( predicate ) && ( NIL == require_new_terms_allowedP || NIL != removal_modules_termofunit.skolemization_allowed( $const39$RelationExistsInstanceFn ) )
        && NIL != removal_some_relation_exists_instance_for_predicate( predicate, mode, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 28716L)
  public static SubLObject make_relation_exists_instance_support()
  {
    return arguments.make_hl_support( $kw8$CODE, $relation_exists_instance_rule$.getGlobalValue(), $relation_exists_instance_defining_mt$.getGlobalValue(), $kw9$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 28888L)
  public static SubLObject make_relation_exists_instance_term(final SubLObject predicate, final SubLObject coll, final SubLObject v_object)
  {
    return el_utilities.list_to_elf( ConsesLow.list( $const39$RelationExistsInstanceFn, predicate, coll, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 29575L)
  public static SubLObject removal_relation_exists_instance_prune(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != formula_pattern_match.pattern_matches_formula( $list44, asent ) )
    {
      final SubLObject pattern = $list45;
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject rei_term = list_utilities.alist_lookup_without_values( v_bindings, $sym46$REI_TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject rei_col = list_utilities.alist_lookup_without_values( v_bindings, $sym47$REI_COL, UNPROVIDED, UNPROVIDED );
        final SubLObject rei_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym48$REI_PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym17$TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject predicate = list_utilities.alist_lookup_without_values( v_bindings, $sym18$PREDICATE, UNPROVIDED, UNPROVIDED );
        if( !rei_pred.eql( predicate ) && NIL == genl_predicates.genl_predicateP( rei_pred, predicate, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        if( NIL == unification.unify_possible( rei_term, v_term ) )
        {
          return T;
        }
      }
    }
    else
    {
      if( NIL == formula_pattern_match.pattern_matches_formula( $list49, asent ) )
      {
        return T;
      }
      final SubLObject pattern = $list50;
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject rei_col2 = list_utilities.alist_lookup_without_values( v_bindings, $sym47$REI_COL, UNPROVIDED, UNPROVIDED );
        final SubLObject rei_term2 = list_utilities.alist_lookup_without_values( v_bindings, $sym46$REI_TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject rei_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym48$REI_PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym17$TERM, UNPROVIDED, UNPROVIDED );
        final SubLObject predicate = list_utilities.alist_lookup_without_values( v_bindings, $sym18$PREDICATE, UNPROVIDED, UNPROVIDED );
        if( !rei_pred.eql( predicate ) && NIL == genl_predicates.genl_inverseP( rei_pred, predicate, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        if( NIL == unification.unify_possible( rei_term2, v_term ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 30828L)
  public static SubLObject removal_relation_exists_instance_check_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != removal_relation_exists_instance_required( asent, $kw2$BOTH, NIL ) )
    {
      final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
      final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
      if( NIL != el_utilities.el_formula_p( arg1 ) && NIL != cycl_utilities.formula_find( $const39$RelationExistsInstanceFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject functor = el_utilities.unmake_ternary_formula( arg1 );
        final SubLObject rei_pred = thread.secondMultipleValue();
        final SubLObject coll = thread.thirdMultipleValue();
        final SubLObject v_term = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean( ( rei_pred.eql( predicate ) || NIL != genl_predicates.genl_predicateP( rei_pred, predicate, UNPROVIDED, UNPROVIDED ) ) && arg2.equal( v_term ) );
      }
      if( NIL != el_utilities.el_formula_p( arg2 ) && NIL != cycl_utilities.formula_find( $const39$RelationExistsInstanceFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject functor = el_utilities.unmake_ternary_formula( arg2 );
        final SubLObject rei_pred = thread.secondMultipleValue();
        final SubLObject coll = thread.thirdMultipleValue();
        final SubLObject v_term = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean( ( rei_pred.eql( predicate ) || NIL != genl_predicates.genl_inverseP( rei_pred, predicate, UNPROVIDED, UNPROVIDED ) ) && arg1.equal( v_term ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 32456L)
  public static SubLObject removal_relation_exists_instance_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject functor = NIL;
    SubLObject pred = NIL;
    SubLObject v_term = NIL;
    SubLObject coll = NIL;
    SubLObject mode = NIL;
    if( NIL != el_utilities.el_formula_p( arg1 ) && NIL != cycl_utilities.formula_find( $const39$RelationExistsInstanceFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject functor_$39 = el_utilities.unmake_ternary_formula( arg1 );
      final SubLObject pred_$40 = thread.secondMultipleValue();
      final SubLObject coll_$41 = thread.thirdMultipleValue();
      final SubLObject v_term_$42 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      functor = functor_$39;
      pred = pred_$40;
      coll = coll_$41;
      v_term = v_term_$42;
      mode = $kw0$GENL_PREDS;
    }
    else if( NIL != el_utilities.el_formula_p( arg2 ) && NIL != cycl_utilities.formula_find( $const39$RelationExistsInstanceFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject functor_$40 = el_utilities.unmake_ternary_formula( arg2 );
      final SubLObject pred_$41 = thread.secondMultipleValue();
      final SubLObject coll_$42 = thread.thirdMultipleValue();
      final SubLObject v_term_$43 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      functor = functor_$40;
      pred = pred_$41;
      coll = coll_$42;
      v_term = v_term_$43;
      mode = $kw1$GENL_INVERSE;
    }
    final SubLObject rei_sentence = el_utilities.list_to_elf( ConsesLow.list( $const38$relationExistsInstance, pred, coll, v_term ) );
    final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( rei_sentence, $kw21$POS );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw22$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term_$44 = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate_$48 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate_$48 )
        {
          final SubLObject pred_var = predicate_$48;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$44, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$44, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                  SubLObject done_var_$49 = NIL;
                  final SubLObject token_var_$50 = NIL;
                  while ( NIL == done_var_$49)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$50 );
                    final SubLObject valid_$51 = makeBoolean( !token_var_$50.eql( assertion ) );
                    if( NIL != valid_$51 )
                    {
                      removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, assertion, mode );
                    }
                    done_var_$49 = makeBoolean( NIL == valid_$51 );
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
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$44, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$44, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                  SubLObject done_var_$50 = NIL;
                  final SubLObject token_var_$51 = NIL;
                  while ( NIL == done_var_$50)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$51 );
                    final SubLObject valid_$52 = makeBoolean( !token_var_$51.eql( assertion ) );
                    if( NIL != valid_$52 )
                    {
                      removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, assertion, mode );
                    }
                    done_var_$50 = makeBoolean( NIL == valid_$52 );
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
      else if( NIL != predicate_$48 )
      {
        final SubLObject pred_var = predicate_$48;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$44, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$44, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                SubLObject done_var_$51 = NIL;
                final SubLObject token_var_$52 = NIL;
                while ( NIL == done_var_$51)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$52 );
                  final SubLObject valid_$53 = makeBoolean( !token_var_$52.eql( assertion ) );
                  if( NIL != valid_$53 )
                  {
                    removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, assertion, mode );
                  }
                  done_var_$51 = makeBoolean( NIL == valid_$53 );
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
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term_$44, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term_$44, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                SubLObject done_var_$52 = NIL;
                final SubLObject token_var_$53 = NIL;
                while ( NIL == done_var_$52)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$53 );
                  final SubLObject valid_$54 = makeBoolean( !token_var_$53.eql( assertion ) );
                  if( NIL != valid_$54 )
                  {
                    removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, assertion, mode );
                  }
                  done_var_$52 = makeBoolean( NIL == valid_$54 );
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
    else if( pcase_var.eql( $kw24$PREDICATE_EXTENT ) )
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
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw23$GAF, enumeration_types.sense_truth( $kw21$POS ), NIL );
                SubLObject done_var_$53 = NIL;
                final SubLObject token_var_$54 = NIL;
                while ( NIL == done_var_$53)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$54 );
                  final SubLObject valid_$55 = makeBoolean( !token_var_$54.eql( assertion2 ) );
                  if( NIL != valid_$55 )
                  {
                    removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, assertion2, mode );
                  }
                  done_var_$53 = makeBoolean( NIL == valid_$55 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
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
    else if( pcase_var.eql( $kw25$OVERLAP ) )
    {
      SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == enumeration_types.sense_truth( $kw21$POS ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( $kw21$POS ) ) )
        {
          removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, assertion3, mode );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion3 = cdolist_list_var.first();
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_lookup_index( rei_sentence, $kw21$POS );
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject support_$65 = support;
      removal_relation_exists_instance_check_expand_internal( predicate, v_term, coll, support_$65, mode );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 34746L)
  public static SubLObject removal_relation_exists_instance_check_expand_internal(final SubLObject pred, final SubLObject v_term, final SubLObject coll, final SubLObject support, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == removal_relation_instance_support_direction_relevantP( support ) )
    {
      return NIL;
    }
    final SubLObject support_sent = removal_relation_instance_support_sentence( support );
    if( NIL != el_utilities.formula_arityE( support_sent, THREE_INTEGER, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject relation_exists_instance = el_utilities.unmake_ternary_formula( support_sent );
      final SubLObject gaf_pred = thread.secondMultipleValue();
      final SubLObject gaf_coll = thread.thirdMultipleValue();
      final SubLObject gaf_obj = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      if( !coll.equal( gaf_coll ) || !v_term.equal( gaf_obj ) )
      {
        return NIL;
      }
      SubLObject more_supports = NIL;
      if( mode.eql( $kw0$GENL_PREDS ) )
      {
        if( gaf_pred.eql( pred ) || NIL != genl_predicates.genl_predicateP( gaf_pred, pred, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject rule_support = make_relation_exists_instance_support();
          final SubLObject genl_preds_supports = removal_module_utilities.additional_genl_preds_supports( gaf_pred, pred );
          more_supports = ConsesLow.listS( rule_support, genl_preds_supports );
        }
      }
      else if( mode.eql( $kw1$GENL_INVERSE ) && ( gaf_pred.eql( pred ) || NIL != genl_predicates.genl_inverseP( gaf_pred, pred, UNPROVIDED, UNPROVIDED ) ) )
      {
        final SubLObject rule_support = make_relation_exists_instance_support();
        final SubLObject genl_inverse_supports = removal_module_utilities.additional_genl_inverse_supports( gaf_pred, pred );
        more_supports = ConsesLow.listS( rule_support, genl_inverse_supports );
      }
      backward.removal_add_node( support, NIL, more_supports );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 36145L)
  public static SubLObject removal_relation_exists_instance_unify_required(final SubLObject asent, final SubLObject mode)
  {
    return removal_relation_exists_instance_required( asent, mode, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 36823L)
  public static SubLObject removal_relation_exists_instance_unify_arg1_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unify_required( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 37011L)
  public static SubLObject removal_relation_exists_instance_unify_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unify_required( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 37310L)
  public static SubLObject removal_relation_exists_instance_unify_cost(final SubLObject predicate, final SubLObject v_term, final SubLObject mode)
  {
    final SubLObject predicate_cost_estimate = relation_exists_instance_predicate_cost_estimate( predicate, mode, UNPROVIDED );
    final SubLObject object_cost_estimate = relation_exists_instance_object_cost_estimate( v_term, UNPROVIDED );
    return Numbers.max( $minimum_relation_exists_instance_unify_cost$.getGlobalValue(), Numbers.min( predicate_cost_estimate, object_cost_estimate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 37706L)
  public static SubLObject removal_relation_exists_instance_unify_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return removal_relation_exists_instance_unify_cost( predicate, v_term, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 37997L)
  public static SubLObject removal_relation_exists_instance_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_relation_exists_instance_unify_cost( predicate, v_term, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 38290L)
  public static SubLObject removal_relation_exists_instance_unify_expand(final SubLObject predicate, final SubLObject v_term, final SubLObject asent, final SubLObject mode)
  {
    final SubLObject predicate_cost_estimate = relation_exists_instance_predicate_cost_estimate( predicate, mode, NIL );
    final SubLObject object_cost_estimate = relation_exists_instance_object_cost_estimate( v_term, NIL );
    if( predicate_cost_estimate.numLE( object_cost_estimate ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates( predicate, mode );
      SubLObject spec_inv_predicate = NIL;
      spec_inv_predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred_var = $const38$relationExistsInstance;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( spec_inv_predicate, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( spec_inv_predicate, ONE_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw28$TRUE, NIL );
                SubLObject done_var_$66 = NIL;
                final SubLObject token_var_$67 = NIL;
                while ( NIL == done_var_$66)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$67 );
                  final SubLObject valid_$68 = makeBoolean( !token_var_$67.eql( assertion ) );
                  if( NIL != valid_$68 )
                  {
                    removal_relation_exists_instance_unify_via_predicate_expand( asent, assertion, v_term, mode );
                  }
                  done_var_$66 = makeBoolean( NIL == valid_$68 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec_inv_predicate = cdolist_list_var.first();
      }
    }
    else
    {
      final SubLObject pred_var2 = $const38$relationExistsInstance;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, THREE_INTEGER, pred_var2 ) )
      {
        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, THREE_INTEGER, pred_var2 );
        SubLObject done_var2 = NIL;
        final SubLObject token_var2 = NIL;
        while ( NIL == done_var2)
        {
          final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
          final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
          if( NIL != valid2 )
          {
            SubLObject final_index_iterator2 = NIL;
            try
            {
              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw23$GAF, $kw28$TRUE, NIL );
              SubLObject done_var_$67 = NIL;
              final SubLObject token_var_$68 = NIL;
              while ( NIL == done_var_$67)
              {
                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$68 );
                final SubLObject valid_$69 = makeBoolean( !token_var_$68.eql( assertion2 ) );
                if( NIL != valid_$69 )
                {
                  removal_relation_exists_instance_unify_via_object_expand( asent, assertion2, mode );
                }
                done_var_$67 = makeBoolean( NIL == valid_$69 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator2 )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
              }
            }
          }
          done_var2 = makeBoolean( NIL == valid2 );
        }
      }
    }
    SubLObject cdolist_list_var;
    final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates( predicate, mode );
    SubLObject spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$72 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( spec_inv_predicate, ONE_INTEGER, $const38$relationExistsInstance, $kw28$TRUE );
      SubLObject gather_sentence_mt_pair = NIL;
      gather_sentence_mt_pair = cdolist_list_var_$72.first();
      while ( NIL != cdolist_list_var_$72)
      {
        SubLObject current;
        final SubLObject datum = current = gather_sentence_mt_pair;
        SubLObject support_sent = NIL;
        SubLObject support_mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_sent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_mt = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject support = sksi_infrastructure_utilities.make_sksi_support( support_sent, support_mt );
          removal_relation_exists_instance_unify_via_predicate_expand( asent, support, v_term, mode );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
        }
        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
        gather_sentence_mt_pair = cdolist_list_var_$72.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 39764L)
  public static SubLObject removal_relation_exists_instance_unify_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return removal_relation_exists_instance_unify_expand( predicate, v_term, asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 40065L)
  public static SubLObject removal_relation_exists_instance_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_relation_exists_instance_unify_expand( predicate, v_term, asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 41766L)
  public static SubLObject relation_exists_instance_sksi_cost()
  {
    return sksi_relation_instance_cost( $const38$relationExistsInstance );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 41899L)
  public static SubLObject relation_exists_instance_predicate_cost_estimate(final SubLObject predicate, final SubLObject mode, SubLObject include_sksiP)
  {
    if( include_sksiP == UNPROVIDED )
    {
      include_sksiP = T;
    }
    final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates( predicate, mode );
    SubLObject kb_cost = ZERO_INTEGER;
    final SubLObject sksi_cost = ( NIL != include_sksiP ) ? relation_exists_instance_sksi_cost() : ZERO_INTEGER;
    SubLObject cdolist_list_var = spec_inv_predicates;
    SubLObject spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_relation_exists_instance_for_predicate( spec_inv_predicate, UNPROVIDED ) )
      {
        kb_cost = Numbers.add( kb_cost, kb_indexing.relevant_num_gaf_arg_index( predicate, ONE_INTEGER, $const38$relationExistsInstance ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    return Numbers.add( kb_cost, sksi_cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 42435L)
  public static SubLObject relation_exists_instance_object_cost_estimate(final SubLObject v_object, SubLObject include_sksiP)
  {
    if( include_sksiP == UNPROVIDED )
    {
      include_sksiP = T;
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( v_object ) )
    {
      return ( NIL != include_sksiP ) ? Numbers.add( kb_indexing.relevant_num_gaf_arg_index( v_object, THREE_INTEGER, $const38$relationExistsInstance ), relation_exists_instance_sksi_cost() )
          : kb_indexing.relevant_num_gaf_arg_index( v_object, THREE_INTEGER, $const38$relationExistsInstance );
    }
    return Numbers.$most_positive_fixnum$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 43129L)
  public static SubLObject removal_relation_exists_instance_unify_via_predicate_expand(final SubLObject asent, final SubLObject support, final SubLObject v_term, final SubLObject mode)
  {
    if( NIL != variables.fully_bound_p( v_term ) )
    {
      final SubLObject support_sent = removal_relation_instance_support_sentence( support );
      if( !v_term.equal( cycl_utilities.atomic_sentence_arg3( support_sent, UNPROVIDED ) ) )
      {
        return NIL;
      }
    }
    return removal_relation_exists_instance_unify_expand_guts( asent, support, mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 43629L)
  public static SubLObject removal_relation_exists_instance_unify_via_object_expand(final SubLObject asent, final SubLObject assertion, final SubLObject mode)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject rei_pred = assertions_high.gaf_arg1( assertion );
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      if( !rei_pred.eql( predicate ) && NIL == genl_predicates.genl_predP( rei_pred, predicate, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    else if( mode.eql( $kw1$GENL_INVERSE ) && !rei_pred.eql( predicate ) && NIL == genl_predicates.genl_inverseP( rei_pred, predicate, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return removal_relation_exists_instance_unify_expand_guts( asent, assertion, mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 44334L)
  public static SubLObject removal_relation_exists_instance_unify_expand_guts(final SubLObject asent, final SubLObject support, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == removal_relation_instance_support_direction_relevantP( support ) )
    {
      return NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject support_sent = removal_relation_instance_support_sentence( support );
    final SubLObject rei_pred = cycl_utilities.atomic_sentence_arg1( support_sent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg3( support_sent, UNPROVIDED );
    final SubLObject coll = cycl_utilities.atomic_sentence_arg2( support_sent, UNPROVIDED );
    final SubLObject exists_term = make_relation_exists_instance_term( rei_pred, coll, v_term );
    SubLObject bound_asent = NIL;
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      bound_asent = ConsesLow.list( predicate, exists_term, v_term );
    }
    else if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      bound_asent = ConsesLow.list( predicate, v_term, exists_term );
    }
    if( NIL != function_terms.within_term_functional_complexity_cutoffP( exists_term ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( asent, bound_asent, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject rule_support = make_relation_exists_instance_support();
        SubLObject pred_supports = NIL;
        SubLObject more_supports = NIL;
        if( mode.eql( $kw0$GENL_PREDS ) )
        {
          pred_supports = removal_module_utilities.additional_genl_preds_supports( rei_pred, predicate );
        }
        else if( mode.eql( $kw1$GENL_INVERSE ) )
        {
          pred_supports = removal_module_utilities.additional_genl_inverse_supports( rei_pred, predicate );
        }
        more_supports = ConsesLow.append( ConsesLow.list( rule_support ), pred_supports, unify_justification );
        backward.removal_add_node( support, v_bindings, more_supports );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 45724L)
  public static SubLObject removal_relation_exists_instance_unbound_required(final SubLObject asent, final SubLObject mode)
  {
    return removal_relation_exists_instance_required( asent, mode, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 46429L)
  public static SubLObject removal_relation_exists_instance_unbound_arg1_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_required( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 46623L)
  public static SubLObject removal_relation_exists_instance_unbound_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_required( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 46815L)
  public static SubLObject removal_relation_exists_instance_unbound_cost(final SubLObject asent, final SubLObject mode)
  {
    return relation_exists_instance_predicate_cost_estimate( cycl_utilities.atomic_sentence_predicate( asent ), mode, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 46990L)
  public static SubLObject removal_relation_exists_instance_unbound_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_cost( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 47176L)
  public static SubLObject removal_relation_exists_instance_unbound_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_cost( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 47360L)
  public static SubLObject removal_relation_exists_instance_unbound_expand(final SubLObject asent, final SubLObject mode)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject v_term = NIL;
    final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates( predicate, mode );
    if( mode.eql( $kw0$GENL_PREDS ) )
    {
      v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    }
    else if( mode.eql( $kw1$GENL_INVERSE ) )
    {
      v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    }
    SubLObject cdolist_list_var = spec_inv_predicates;
    SubLObject spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_var = $const38$relationExistsInstance;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( spec_inv_predicate, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( spec_inv_predicate, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw28$TRUE, NIL );
              SubLObject done_var_$73 = NIL;
              final SubLObject token_var_$74 = NIL;
              while ( NIL == done_var_$73)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$74 );
                final SubLObject valid_$75 = makeBoolean( !token_var_$74.eql( assertion ) );
                if( NIL != valid_$75 )
                {
                  removal_relation_exists_instance_unify_via_predicate_expand( asent, assertion, v_term, mode );
                }
                done_var_$73 = makeBoolean( NIL == valid_$75 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    cdolist_list_var = spec_inv_predicates;
    spec_inv_predicate = NIL;
    spec_inv_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$76 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index( spec_inv_predicate, ONE_INTEGER, $const38$relationExistsInstance, $kw28$TRUE );
      SubLObject gather_sentence_mt_pair = NIL;
      gather_sentence_mt_pair = cdolist_list_var_$76.first();
      while ( NIL != cdolist_list_var_$76)
      {
        SubLObject current;
        final SubLObject datum = current = gather_sentence_mt_pair;
        SubLObject support_sent = NIL;
        SubLObject support_mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_sent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
        support_mt = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject support = sksi_infrastructure_utilities.make_sksi_support( support_sent, support_mt );
          removal_relation_exists_instance_unify_via_predicate_expand( asent, support, v_term, mode );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
        }
        cdolist_list_var_$76 = cdolist_list_var_$76.rest();
        gather_sentence_mt_pair = cdolist_list_var_$76.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv_predicate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 48371L)
  public static SubLObject removal_relation_exists_instance_unbound_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_expand( asent, $kw1$GENL_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 48561L)
  public static SubLObject removal_relation_exists_instance_unbound_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_expand( asent, $kw0$GENL_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 51320L)
  public static SubLObject removal_relation_instance_exists_via_exemplar_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject sentence = ConsesLow.list( $const63$thereExists, $sym64$_INS, ConsesLow.list( $const65$and, ConsesLow.listS( predicate, v_term, $list66 ), ConsesLow.list( $const67$isa, $sym64$_INS, collection ) ) );
    SubLObject cost = inference_utilities.literal_removal_cost( sentence, $kw21$POS, UNPROVIDED, UNPROVIDED );
    if( !cost.isZero() )
    {
      cost = Numbers.add( cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue( thread ) );
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 51834L)
  public static SubLObject removal_relation_instance_exists_via_exemplar_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject sentence = ConsesLow.list( $const63$thereExists, $sym64$_INS, ConsesLow.list( $const65$and, ConsesLow.listS( predicate, v_term, $list66 ), ConsesLow.list( $const67$isa, $sym64$_INS, collection ) ) );
    if( NIL != removal_relation_instance_exists_via_exemplar_query( sentence, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_relation_instance_exists_via_exemplar_support( sentence );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 52414L)
  public static SubLObject removal_relation_instance_exists_via_exemplar_query(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return inference_trampolines.inference_true_sentence_recursive_query( sentence, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 52577L)
  public static SubLObject make_relation_instance_exists_via_exemplar_support(final SubLObject sentence)
  {
    return arguments.make_hl_support( $kw68$QUERY, sentence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 53713L)
  public static SubLObject removal_relation_exists_instance_via_exemplar_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject sentence = ConsesLow.list( $const63$thereExists, $sym64$_INS, ConsesLow.list( $const65$and, ConsesLow.list( predicate, $sym64$_INS, v_term ), ConsesLow.list( $const67$isa, $sym64$_INS,
        collection ) ) );
    SubLObject cost = inference_utilities.literal_removal_cost( sentence, $kw21$POS, UNPROVIDED, UNPROVIDED );
    if( !cost.isZero() )
    {
      cost = Numbers.add( cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue( thread ) );
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 54227L)
  public static SubLObject removal_relation_exists_instance_via_exemplar_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject sentence = ConsesLow.list( $const63$thereExists, $sym64$_INS, ConsesLow.list( $const65$and, ConsesLow.list( predicate, $sym64$_INS, v_term ), ConsesLow.list( $const67$isa, $sym64$_INS,
        collection ) ) );
    if( NIL != removal_relation_exists_instance_via_exemplar_query( sentence, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_relation_exists_instance_via_exemplar_support( sentence );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 54807L)
  public static SubLObject removal_relation_exists_instance_via_exemplar_query(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return inference_trampolines.inference_true_sentence_recursive_query( sentence, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 54970L)
  public static SubLObject make_relation_exists_instance_via_exemplar_support(final SubLObject sentence)
  {
    return arguments.make_hl_support( $kw68$QUERY, sentence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 56053L)
  public static SubLObject removal_relation_instance_exists_expansion_applicability(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subclause_specs = NIL;
    if( NIL != removal_module_utilities.current_query_allows_new_termsP() )
    {
      SubLObject index0 = ZERO_INTEGER;
      SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
      SubLObject contextualized_asent0 = NIL;
      contextualized_asent0 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = contextualized_asent0;
        SubLObject mt0 = NIL;
        SubLObject asent0 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
        mt0 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
        asent0 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject mt_var = mt0;
          final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            if( $const67$isa.eql( cycl_utilities.atomic_sentence_predicate( asent0 ) ) )
            {
              final SubLObject isa_arg1 = cycl_utilities.atomic_sentence_arg1( asent0, UNPROVIDED );
              final SubLObject isa_arg2 = cycl_utilities.atomic_sentence_arg2( asent0, UNPROVIDED );
              if( NIL != variables.fully_bound_p( isa_arg2 ) && NIL != variables.not_fully_bound_p( isa_arg1 ) )
              {
                SubLObject index2 = ZERO_INTEGER;
                SubLObject cdolist_list_var_$77 = clauses.pos_lits( contextualized_dnf_clause );
                SubLObject contextualized_asent2 = NIL;
                contextualized_asent2 = cdolist_list_var_$77.first();
                while ( NIL != cdolist_list_var_$77)
                {
                  if( !index0.eql( index2 ) )
                  {
                    SubLObject current_$79;
                    final SubLObject datum_$78 = current_$79 = contextualized_asent2;
                    SubLObject mt2 = NIL;
                    SubLObject asent2 = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current_$79, datum_$78, $list74 );
                    mt2 = current_$79.first();
                    current_$79 = current_$79.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current_$79, datum_$78, $list74 );
                    asent2 = current_$79.first();
                    current_$79 = current_$79.rest();
                    if( NIL == current_$79 )
                    {
                      if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                      {
                        final SubLObject mt_var_$80 = mt2;
                        final SubLObject _prev_bind_0_$81 = mt_relevance_macros.$mt$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$82 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                        final SubLObject _prev_bind_2_$83 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                        try
                        {
                          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var_$80 ), thread );
                          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var_$80 ), thread );
                          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var_$80 ), thread );
                          final SubLObject pred1 = cycl_utilities.atomic_sentence_predicate( asent2 );
                          if( NIL != hl_supports.non_hl_predicate_p( pred1 ) && NIL != kb_accessors.binary_predicateP( pred1 ) )
                          {
                            final SubLObject pred1_arg1 = cycl_utilities.atomic_sentence_arg1( asent2, UNPROVIDED );
                            final SubLObject pred1_arg2 = cycl_utilities.atomic_sentence_arg2( asent2, UNPROVIDED );
                            if( NIL != variables.not_fully_bound_p( pred1_arg2 ) && pred1_arg2.equal( isa_arg1 ) && NIL != relation_instance_exists_unifiableP( pred1, pred1_arg1, isa_arg2, mt2 )
                                && NIL != removal_relation_instance_exists_required( asent2, $kw0$GENL_PREDS, T ) )
                            {
                              if( index0.numL( index2 ) )
                              {
                                subclause_specs = ConsesLow.cons( ConsesLow.list( NIL, ConsesLow.list( index0, index2 ) ), subclause_specs );
                              }
                              else
                              {
                                subclause_specs = ConsesLow.cons( ConsesLow.list( NIL, ConsesLow.list( index2, index0 ) ), subclause_specs );
                              }
                            }
                          }
                        }
                        finally
                        {
                          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$83, thread );
                          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$82, thread );
                          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$81, thread );
                        }
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum_$78, $list74 );
                    }
                  }
                  index2 = Numbers.add( index2, ONE_INTEGER );
                  cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                  contextualized_asent2 = cdolist_list_var_$77.first();
                }
              }
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list73 );
        }
        index0 = Numbers.add( index0, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent0 = cdolist_list_var.first();
      }
    }
    return list_utilities.fast_delete_duplicates( subclause_specs, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 57720L)
  public static SubLObject removal_relation_instance_exists_expansion_cost(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cost = NIL;
    thread.resetMultipleValues();
    final SubLObject isa_mt = destructure_relation_instance_exists_expansion( contextualized_dnf_clause );
    final SubLObject isa_asent = thread.secondMultipleValue();
    final SubLObject other_mt = thread.thirdMultipleValue();
    final SubLObject other_asent = thread.fourthMultipleValue();
    final SubLObject isa_firstP = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    final SubLObject relation = cycl_utilities.atomic_sentence_predicate( other_asent );
    final SubLObject instance = cycl_utilities.atomic_sentence_arg1( other_asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( isa_asent, UNPROVIDED );
    final SubLObject asent = el_utilities.make_ternary_formula( $const3$relationInstanceExists, relation, instance, collection );
    final SubLObject mt_var = other_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      cost = removal_modules_tva_lookup.removal_tva_unify_cost( asent, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 58400L)
  public static SubLObject removal_relation_instance_exists_expansion_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject isa_mt = destructure_relation_instance_exists_expansion( contextualized_dnf_clause );
    final SubLObject isa_asent = thread.secondMultipleValue();
    final SubLObject other_mt = thread.thirdMultipleValue();
    final SubLObject other_asent = thread.fourthMultipleValue();
    final SubLObject isa_firstP = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    final SubLObject relation = cycl_utilities.atomic_sentence_predicate( other_asent );
    final SubLObject instance = cycl_utilities.atomic_sentence_arg1( other_asent, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( isa_asent, UNPROVIDED );
    final SubLObject tva_asent_template = el_utilities.make_ternary_formula( $const3$relationInstanceExists, relation, instance, collection );
    final SubLObject rie_term_template = make_relation_instance_exists_term( relation, instance, collection );
    final SubLObject rie_isa_asent_template = el_utilities.make_binary_formula( $const67$isa, rie_term_template, collection );
    final SubLObject rie_other_asent_template = el_utilities.make_binary_formula( relation, instance, rie_term_template );
    SubLObject cdolist_list_var = relation_instance_exists_unify( relation, instance, collection, other_mt );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = result;
      SubLObject rie_bindings = NIL;
      SubLObject rie_just = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
      rie_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
      rie_just = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject sub_bindings = ( NIL != rie_bindings ) ? rie_bindings : $list76;
        final SubLObject tva_asent = bindings.subst_bindings( sub_bindings, tva_asent_template );
        final SubLObject tva_support = arguments.make_hl_support( $kw77$TVA, tva_asent, other_mt, UNPROVIDED );
        final SubLObject rie_isa_asent = bindings.subst_bindings( sub_bindings, rie_isa_asent_template );
        thread.resetMultipleValues();
        final SubLObject isa_bindings = unification_utilities.gaf_asent_unify( isa_asent, rie_isa_asent, T, T );
        final SubLObject isa_gaf_asent = thread.secondMultipleValue();
        final SubLObject isa_unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != isa_bindings )
        {
          final SubLObject isa_support = arguments.make_hl_support( $kw78$ISA, rie_isa_asent, isa_mt, UNPROVIDED );
          final SubLObject isa_just = ConsesLow.cons( isa_support, isa_unify_justification );
          final SubLObject rie_other_asent = bindings.subst_bindings( sub_bindings, rie_other_asent_template );
          thread.resetMultipleValues();
          final SubLObject other_bindings = unification_utilities.gaf_asent_unify( other_asent, rie_other_asent, T, T );
          final SubLObject other_gaf_asent = thread.secondMultipleValue();
          final SubLObject other_unify_justification = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != other_bindings )
          {
            final SubLObject other_support = make_relation_instance_exists_support();
            final SubLObject other_just = ConsesLow.cons( other_support, ConsesLow.cons( tva_support, other_unify_justification ) );
            final SubLObject v_bindings = list_utilities.fast_delete_duplicates( ConsesLow.append( rie_bindings, isa_bindings, other_bindings ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
            inference_worker_removal.conjunctive_removal_callback( v_bindings, ( NIL != isa_firstP ) ? ConsesLow.list( isa_just, other_just ) : ConsesLow.list( other_just, isa_just ) );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 60690L)
  public static SubLObject destructure_relation_instance_exists_expansion(final SubLObject contextualized_dnf_clause)
  {
    SubLObject current;
    final SubLObject datum = current = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent1 = NIL;
    SubLObject contextualized_asent2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    contextualized_asent1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    contextualized_asent2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$85;
      final SubLObject datum_$84 = current_$85 = contextualized_asent1;
      SubLObject mt1 = NIL;
      SubLObject asent1 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$85, datum_$84, $list74 );
      mt1 = current_$85.first();
      current_$85 = current_$85.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$85, datum_$84, $list74 );
      asent1 = current_$85.first();
      current_$85 = current_$85.rest();
      if( NIL == current_$85 )
      {
        SubLObject current_$86;
        final SubLObject datum_$85 = current_$86 = contextualized_asent2;
        SubLObject mt2 = NIL;
        SubLObject asent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$86, datum_$85, $list80 );
        mt2 = current_$86.first();
        current_$86 = current_$86.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$86, datum_$85, $list80 );
        asent2 = current_$86.first();
        current_$86 = current_$86.rest();
        if( NIL == current_$86 )
        {
          return $const67$isa.eql( cycl_utilities.atomic_sentence_predicate( asent1 ) ) ? Values.values( mt1, asent1, mt2, asent2, T ) : Values.values( mt2, asent2, mt1, asent1, NIL );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$85, $list80 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$84, $list74 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 61182L)
  public static SubLObject relation_instance_exists_unifiableP(final SubLObject relation, final SubLObject instance, final SubLObject collection, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject unifiableP = NIL;
    final SubLObject asent = el_utilities.make_ternary_formula( $const3$relationInstanceExists, relation, instance, collection );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      unifiableP = removal_modules_tva_lookup.tva_unify_usefulP( asent );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return unifiableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 61505L)
  public static SubLObject relation_instance_exists_unify(final SubLObject relation, final SubLObject instance, final SubLObject collection, final SubLObject mt)
  {
    final SubLObject asent = el_utilities.make_ternary_formula( $const3$relationInstanceExists, relation, instance, collection );
    return tva_inference.tva_unify( asent, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_removal_modules_relation_instance_exists_file()
  {
    SubLFiles.declareFunction( me, "some_relation_instance_for_predicate", "SOME-RELATION-INSTANCE-FOR-PREDICATE", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_support_direction_relevantP", "REMOVAL-RELATION-INSTANCE-SUPPORT-DIRECTION-RELEVANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_support_sentence", "REMOVAL-RELATION-INSTANCE-SUPPORT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_relation_instance_cost", "SKSI-RELATION-INSTANCE-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_spec_or_inverse_predicates", "REMOVAL-ALL-SPEC-OR-INVERSE-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_some_relation_instance_exists_for_predicate", "REMOVAL-SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE", 2, 1, false );
    SubLFiles.declareFunction( me, "some_relation_instance_exists_for_predicate", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "some_relation_instance_exists_for_predicate_and_spec", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE-AND-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "some_relation_instance_exists_for_predicate_and_inverse", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE-AND-INVERSE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_required", "REMOVAL-RELATION-INSTANCE-EXISTS-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( me, "make_relation_instance_exists_support", "MAKE-RELATION-INSTANCE-EXISTS-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "make_relation_instance_exists_term", "MAKE-RELATION-INSTANCE-EXISTS-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_prune", "REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_check_required", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_check_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_check_expand_internal", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_arg1_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED", 1, 1, false );
    new $removal_relation_instance_exists_unify_arg1_required$UnaryFunction();
    new $removal_relation_instance_exists_unify_arg1_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_arg2_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED", 1, 1, false );
    new $removal_relation_instance_exists_unify_arg2_required$UnaryFunction();
    new $removal_relation_instance_exists_unify_arg2_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-COST", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_arg1_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_arg2_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-EXPAND", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_arg1_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_arg2_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "relation_instance_exists_sksi_cost", "RELATION-INSTANCE-EXISTS-SKSI-COST", 0, 0, false );
    SubLFiles.declareFunction( me, "relation_instance_exists_predicate_cost_estimate", "RELATION-INSTANCE-EXISTS-PREDICATE-COST-ESTIMATE", 2, 1, false );
    SubLFiles.declareFunction( me, "relation_instance_exists_object_cost_estimate", "RELATION-INSTANCE-EXISTS-OBJECT-COST-ESTIMATE", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-VIA-PREDICATE-EXPAND", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_via_object_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-VIA-OBJECT-EXPAND", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unify_expand_guts", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-EXPAND-GUTS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-REQUIRED", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_arg1_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED", 1, 1, false );
    new $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction();
    new $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_arg2_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED", 1, 1, false );
    new $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction();
    new $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_arg1_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_arg2_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_arg1_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_unbound_arg2_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_some_relation_exists_instance_for_predicate", "REMOVAL-SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE", 2, 1, false );
    SubLFiles.declareFunction( me, "some_relation_exists_instance_for_predicate", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "some_relation_exists_instance_for_predicate_and_spec", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE-AND-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "some_relation_exists_instance_for_predicate_and_inverse", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE-AND-INVERSE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_required", "REMOVAL-RELATION-EXISTS-INSTANCE-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( me, "make_relation_exists_instance_support", "MAKE-RELATION-EXISTS-INSTANCE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "make_relation_exists_instance_term", "MAKE-RELATION-EXISTS-INSTANCE-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_prune", "REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_check_required", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_check_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_check_expand_internal", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-REQUIRED", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_arg1_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED", 1, 1, false );
    new $removal_relation_exists_instance_unify_arg1_required$UnaryFunction();
    new $removal_relation_exists_instance_unify_arg1_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_arg2_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED", 1, 1, false );
    new $removal_relation_exists_instance_unify_arg2_required$UnaryFunction();
    new $removal_relation_exists_instance_unify_arg2_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-COST", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_arg1_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_arg2_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-EXPAND", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_arg1_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_arg2_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "relation_exists_instance_sksi_cost", "RELATION-EXISTS-INSTANCE-SKSI-COST", 0, 0, false );
    SubLFiles.declareFunction( me, "relation_exists_instance_predicate_cost_estimate", "RELATION-EXISTS-INSTANCE-PREDICATE-COST-ESTIMATE", 2, 1, false );
    SubLFiles.declareFunction( me, "relation_exists_instance_object_cost_estimate", "RELATION-EXISTS-INSTANCE-OBJECT-COST-ESTIMATE", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_via_predicate_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-VIA-PREDICATE-EXPAND", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_via_object_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-VIA-OBJECT-EXPAND", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unify_expand_guts", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-EXPAND-GUTS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-REQUIRED", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_arg1_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED", 1, 1, false );
    new $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction();
    new $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_arg2_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED", 1, 1, false );
    new $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction();
    new $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_arg1_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_arg2_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_arg1_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_unbound_arg2_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_via_exemplar_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_via_exemplar_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_via_exemplar_query", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "make_relation_instance_exists_via_exemplar_support", "MAKE-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_via_exemplar_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_via_exemplar_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_relation_exists_instance_via_exemplar_query", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "make_relation_exists_instance_via_exemplar_support", "MAKE-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_expansion_applicability", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY", 1, 0, false );
    new $removal_relation_instance_exists_expansion_applicability$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_expansion_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_relation_instance_exists_expansion_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "destructure_relation_instance_exists_expansion", "DESTRUCTURE-RELATION-INSTANCE-EXISTS-EXPANSION", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_instance_exists_unifiableP", "RELATION-INSTANCE-EXISTS-UNIFIABLE?", 4, 0, false );
    SubLFiles.declareFunction( me, "relation_instance_exists_unify", "RELATION-INSTANCE-EXISTS-UNIFY", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_relation_instance_exists_file()
  {
    $relation_instance_exists_rule$ = SubLFiles.deflexical( "*RELATION-INSTANCE-EXISTS-RULE*", el_utilities.list_to_elf( $list5 ) );
    $relation_instance_exists_defining_mt$ = SubLFiles.deflexical( "*RELATION-INSTANCE-EXISTS-DEFINING-MT*", maybeDefault( $sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_, $relation_instance_exists_defining_mt$,
        $const7$BaseKB ) );
    $default_relation_instance_exists_check_cost$ = SubLFiles.deflexical( "*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    $minimum_relation_instance_exists_unify_cost$ = SubLFiles.deflexical( "*MINIMUM-RELATION-INSTANCE-EXISTS-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    $relation_exists_instance_rule$ = SubLFiles.deflexical( "*RELATION-EXISTS-INSTANCE-RULE*", el_utilities.list_to_elf( $list40 ) );
    $relation_exists_instance_defining_mt$ = SubLFiles.deflexical( "*RELATION-EXISTS-INSTANCE-DEFINING-MT*", maybeDefault( $sym41$_RELATION_EXISTS_INSTANCE_DEFINING_MT_, $relation_exists_instance_defining_mt$,
        $const7$BaseKB ) );
    $default_relation_exists_instance_check_cost$ = SubLFiles.deflexical( "*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    $minimum_relation_exists_instance_unify_cost$ = SubLFiles.deflexical( "*MINIMUM-RELATION-EXISTS-INSTANCE-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_relation_instance_exists_file()
  {
    subl_macro_promotions.declare_defglobal( $sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_, $const3$relationInstanceExists );
    inference_modules.inference_removal_module( $kw10$REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE, $list11 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_RELATION_INSTANCE_EXISTS_CHECK, $list27 );
    inference_modules.inference_removal_module( $kw30$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1, $list31 );
    inference_modules.inference_removal_module( $kw32$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2, $list33 );
    inference_modules.inference_removal_module( $kw34$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1, $list35 );
    inference_modules.inference_removal_module( $kw36$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2, $list37 );
    subl_macro_promotions.declare_defglobal( $sym41$_RELATION_EXISTS_INSTANCE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym41$_RELATION_EXISTS_INSTANCE_DEFINING_MT_, $const38$relationExistsInstance );
    inference_modules.inference_removal_module( $kw42$REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE, $list43 );
    inference_modules.inference_removal_module( $kw51$REMOVAL_RELATION_EXISTS_INSTANCE_CHECK, $list52 );
    inference_modules.inference_removal_module( $kw53$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1, $list54 );
    inference_modules.inference_removal_module( $kw55$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2, $list56 );
    inference_modules.inference_removal_module( $kw57$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1, $list58 );
    inference_modules.inference_removal_module( $kw59$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2, $list60 );
    inference_modules.inference_removal_module( $kw61$REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR, $list62 );
    inference_modules.inference_removal_module( $kw69$REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR, $list70 );
    inference_modules.inference_conjunctive_removal_module( $kw71$REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION, $list72 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_relation_instance_exists_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_relation_instance_exists_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_relation_instance_exists_file();
  }
  static
  {
    me = new removal_modules_relation_instance_exists();
    $relation_instance_exists_rule$ = null;
    $relation_instance_exists_defining_mt$ = null;
    $default_relation_instance_exists_check_cost$ = null;
    $minimum_relation_instance_exists_unify_cost$ = null;
    $relation_exists_instance_rule$ = null;
    $relation_exists_instance_defining_mt$ = null;
    $default_relation_exists_instance_check_cost$ = null;
    $minimum_relation_exists_instance_unify_cost$ = null;
    $kw0$GENL_PREDS = makeKeyword( "GENL-PREDS" );
    $kw1$GENL_INVERSE = makeKeyword( "GENL-INVERSE" );
    $kw2$BOTH = makeKeyword( "BOTH" );
    $const3$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $const4$RelationInstanceExistsFn = constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), makeSymbol(
        "?PRED" ), makeSymbol( "?THING" ), makeSymbol( "?COLL" ) ), ConsesLow.list( makeSymbol( "?PRED" ), makeSymbol( "?THING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "RelationInstanceExistsFn" ) ), makeSymbol( "?PRED" ), makeSymbol( "?THING" ), makeSymbol( "?COLL" ) ) ) );
    $sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_ = makeSymbol( "*RELATION-INSTANCE-EXISTS-DEFINING-MT*" );
    $const7$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw8$CODE = makeKeyword( "CODE" );
    $kw9$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw10$REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TREE-FIND" ), constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol(
            "REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "@todo write this" ), makeKeyword( "EXAMPLE" ), makeString( "@todo write this" )
    } );
    $list12 = ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ), makeKeyword( "ANYTHING" ) ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RIE-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RIE-TERM" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RIE-COL" ) ) ) );
    $sym14$RIE_COL = makeSymbol( "RIE-COL" );
    $sym15$RIE_TERM = makeSymbol( "RIE-TERM" );
    $sym16$RIE_PRED = makeSymbol( "RIE-PRED" );
    $sym17$TERM = makeSymbol( "TERM" );
    $sym18$PREDICATE = makeSymbol( "PREDICATE" );
    $list19 = ConsesLow.list( makeKeyword( "FORT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), makeKeyword( "FORT" ), makeKeyword( "ANYTHING" ), makeKeyword(
        "ANYTHING" ) ), makeKeyword( "ANYTHING" ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), ConsesLow.list(
        makeKeyword( "BIND" ), makeSymbol( "RIE-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RIE-TERM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RIE-COL" ) ) ), ConsesLow.list(
            makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) );
    $kw21$POS = makeKeyword( "POS" );
    $kw22$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw23$GAF = makeKeyword( "GAF" );
    $kw24$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $kw25$OVERLAP = makeKeyword( "OVERLAP" );
    $kw26$REMOVAL_RELATION_INSTANCE_EXISTS_CHECK = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list(
        makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ),
            makeKeyword( "FULLY-BOUND" ) ) ), ConsesLow.list( makeKeyword( "FORT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), makeKeyword( "FORT" ),
                makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-REQUIRED" ), makeKeyword(
                    "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND" ), makeKeyword(
                        "DOCUMENTATION" ), makeString(
                            "(<predicate> <object> (#$RelationInstanceExistsFn <predicate> <object> <coll>)) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> (#$RelationInstanceExistsFn <predicate> <object> <coll>) <object>) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)\n" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$owns #$Sean \n      (#$RelationInstanceExistsFn #$owns #$Sean #$Holster))\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)" )
    } );
    $kw28$TRUE = makeKeyword( "TRUE" );
    $list29 = ConsesLow.list( makeSymbol( "SUPPORT-SENT" ), makeSymbol( "SUPPORT-MT" ) );
    $kw30$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1 = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword(
        "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(<predicate> <not fully-bound> <object>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "" )
    } );
    $kw32$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2 = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2" );
    $list33 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword(
        "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(<predicate> <object> <not fully-bound>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$owns #$Sean ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)" )
    } );
    $kw34$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1 = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1" );
    $list35 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list(
        makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "VARIABLE" ) ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "RelationInstanceExistsFn" ) ), makeKeyword( "ANYTHING" ) ) ) ) ), makeKeyword( "REQUIRED" ), makeSymbol(
                "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                    "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(<predicate> <not fully-bound> <anything>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$owns ?WHO ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)" )
    } );
    $kw36$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2 = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2" );
    $list37 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(<predicate> <anything> <not fully-bound>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>\nand (#$genlInverse <inv-predicate> <predicate)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "" )
    } );
    $const38$relationExistsInstance = constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) );
    $const39$RelationExistsInstanceFn = constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), makeSymbol(
        "?PRED" ), makeSymbol( "?COLL" ), makeSymbol( "?THING" ) ), ConsesLow.list( makeSymbol( "?PRED" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ),
            makeSymbol( "?PRED" ), makeSymbol( "?COLL" ), makeSymbol( "?THING" ) ), makeSymbol( "?THING" ) ) );
    $sym41$_RELATION_EXISTS_INSTANCE_DEFINING_MT_ = makeSymbol( "*RELATION-EXISTS-INSTANCE-DEFINING-MT*" );
    $kw42$REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TREE-FIND" ), constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol(
            "REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "@todo write this" ), makeKeyword( "EXAMPLE" ), makeString( "@todo write this" )
    } );
    $list44 = ConsesLow.list( makeKeyword( "FORT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ), makeKeyword( "FORT" ), makeKeyword( "ANYTHING" ), makeKeyword(
        "ANYTHING" ) ), makeKeyword( "ANYTHING" ) );
    $list45 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ), ConsesLow.list(
        makeKeyword( "BIND" ), makeSymbol( "REI-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REI-COL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REI-TERM" ) ) ), ConsesLow.list(
            makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) );
    $sym46$REI_TERM = makeSymbol( "REI-TERM" );
    $sym47$REI_COL = makeSymbol( "REI-COL" );
    $sym48$REI_PRED = makeSymbol( "REI-PRED" );
    $list49 = ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ), makeKeyword( "FORT" ), makeKeyword(
        "ANYTHING" ), makeKeyword( "ANYTHING" ) ) );
    $list50 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REI-PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REI-COL" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REI-TERM" ) ) ) );
    $kw51$REMOVAL_RELATION_EXISTS_INSTANCE_CHECK = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK" );
    $list52 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list(
        makeKeyword( "FORT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ), makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
        makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ),
            makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-REQUIRED" ), makeKeyword(
                "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString(
          "(<predicate> (#$RelationExistsInstanceFn <predicate> <coll> <object>) <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> <object> (#$RelationExistsInstanceFn <predicate> <coll> <object>)) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate)" ),
      makeKeyword( "EXAMPLE" ), makeString(
          "(#$inRegion (#$RelationExistsInstanceFn #$inRegion #$Subway #$CityOfMadridSpain)\n                #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)" )
    } );
    $kw53$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1 = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1" );
    $list54 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword(
        "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(<predicate> <not fully-bound> <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate>" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$inRegion ?WHAT #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)" )
    } );
    $kw55$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2 = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2" );
    $list56 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword(
        "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(<predicate> <object> <not fully-bound>) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate>" ), makeKeyword( "EXAMPLE" ), makeString(
                        "" )
    } );
    $kw57$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1 = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1" );
    $list58 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "FORT" ), makeKeyword(
        "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(<predicate> <not fully-bound> <anything>)\nfrom (#$relationExistsInstance <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "" )
    } );
    $kw59$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2 = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2" );
    $list60 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list(
        makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "RelationExistsInstanceFn" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ) ), makeKeyword( "REQUIRED" ), makeSymbol(
                "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                    "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(<predicate> <anything> <not fully-bound>)\nfrom (#$relationExistsInstance <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$inRegion ?OBJ1 ?OBJ2)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)" )
    } );
    $kw61$REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR" );
    $list62 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "FORT" ), ConsesLow.list(
          makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "COLLECTION-FORT" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-COST" ), makeKeyword(
              "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$relationInstanceExists <predicate> <term> <collection>) \nfrom (<spec-predicate> <term> <collection-instance>) \n(#$genlPreds <spec-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>) \nor \nfrom (<inv-predicate> <collection-instance> <term>) \n(#$genlInverse <inv-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>)\t       \n" ),
      makeKeyword( "EXAMPLE" ), makeString( "" )
    } );
    $const63$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym64$_INS = makeSymbol( "?INS" );
    $const65$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list66 = ConsesLow.list( makeSymbol( "?INS" ) );
    $const67$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw68$QUERY = makeKeyword( "QUERY" );
    $kw69$REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR = makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR" );
    $list70 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), makeKeyword( "PREDICATE-FORT" ), ConsesLow.list( makeKeyword( "AND" ),
          makeKeyword( "FULLY-BOUND" ), makeKeyword( "COLLECTION-FORT" ) ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-COST" ), makeKeyword(
              "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$relationExistsInstance <predicate> <collection> <term>)\nfrom (<spec-predicate> <collection-instance> <term>)\n(#$genlPreds <spec-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\nor\nfrom (<inv-predicate> <term> <collection-instance>)\n(#$genlInverse <inv-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\t       \n" ),
      makeKeyword( "EXAMPLE" ), makeString( "" )
    } );
    $kw71$REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION = makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION" );
    $list72 = ConsesLow.list( new SubLObject[] { makeKeyword( "EVERY-PREDICATES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ), makeKeyword( "APPLICABILITY" ), makeSymbol(
        "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
            "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$and (<fort> <anything> <not-fully-bound-N>)\n           (#$isa <not-fully-bound-N> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$and (#$organismKilled ?EVENT ?PERSON)\n           (#$isa ?PERSON #$UnitedStatesPerson))" )
    } );
    $list73 = ConsesLow.list( makeSymbol( "MT0" ), makeSymbol( "ASENT0" ) );
    $list74 = ConsesLow.list( makeSymbol( "MT1" ), makeSymbol( "ASENT1" ) );
    $list75 = ConsesLow.list( makeSymbol( "RIE-BINDINGS" ), makeSymbol( "RIE-JUST" ) );
    $list76 = ConsesLow.list( NIL );
    $kw77$TVA = makeKeyword( "TVA" );
    $kw78$ISA = makeKeyword( "ISA" );
    $list79 = ConsesLow.list( makeSymbol( "CONTEXTUALIZED-ASENT1" ), makeSymbol( "CONTEXTUALIZED-ASENT2" ) );
    $list80 = ConsesLow.list( makeSymbol( "MT2" ), makeSymbol( "ASENT2" ) );
  }

  public static final class $removal_relation_instance_exists_unify_arg1_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_instance_exists_unify_arg1_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_instance_exists_unify_arg1_required( arg1, $removal_relation_instance_exists_unify_arg1_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_instance_exists_unify_arg1_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_instance_exists_unify_arg1_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_instance_exists_unify_arg1_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_instance_exists_unify_arg2_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_instance_exists_unify_arg2_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_instance_exists_unify_arg2_required( arg1, $removal_relation_instance_exists_unify_arg2_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_instance_exists_unify_arg2_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_instance_exists_unify_arg2_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_instance_exists_unify_arg2_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_instance_exists_unbound_arg1_required( arg1, $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_instance_exists_unbound_arg1_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_instance_exists_unbound_arg2_required( arg1, $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_instance_exists_unbound_arg2_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_exists_instance_unify_arg1_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_exists_instance_unify_arg1_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_exists_instance_unify_arg1_required( arg1, $removal_relation_exists_instance_unify_arg1_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_exists_instance_unify_arg1_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_exists_instance_unify_arg1_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_exists_instance_unify_arg1_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_exists_instance_unify_arg2_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_exists_instance_unify_arg2_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_exists_instance_unify_arg2_required( arg1, $removal_relation_exists_instance_unify_arg2_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_exists_instance_unify_arg2_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_exists_instance_unify_arg2_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_exists_instance_unify_arg2_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_exists_instance_unbound_arg1_required( arg1, $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_exists_instance_unbound_arg1_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_exists_instance_unbound_arg2_required( arg1, $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_relation_exists_instance_unbound_arg2_required( arg1, arg2 );
    }
  }

  public static final class $removal_relation_instance_exists_expansion_applicability$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_relation_instance_exists_expansion_applicability$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_relation_instance_exists_expansion_applicability( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1403 ms
 * 
 */