package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_subset_of
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subset_of";
  public static final String myFingerPrint = "d858e5df7b3a48113aa127e4351ba14762b1a95c30ec588b671b6258bc4c40d6";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 4097L)
  private static SubLSymbol $removal_subsetof_theset_theset_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 7120L)
  private static SubLSymbol $removal_subsetof_theset_thesetof_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10037L)
  private static SubLSymbol $default_subsetof_thesetof_hypothesize_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11462L)
  private static SubLSymbol $default_genls_thecollectionof_hypothesize_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 15396L)
  private static SubLSymbol $default_subsetof_thesetof_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16308L)
  private static SubLSymbol $default_genls_thecollectionof_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20117L)
  private static SubLSymbol $default_subsetof_unbound_theset_max_cardinality$;
  private static final SubLSymbol $kw0$TRUE_DEF;
  private static final SubLSymbol $kw1$SUBSETOF;
  private static final SubLObject $const2$subsetOf;
  private static final SubLSymbol $kw3$BOTH;
  private static final SubLSymbol $kw4$TRUE_MON;
  private static final SubLSymbol $kw5$REMOVAL_SUBSETOF_THESET_THESET_POS;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_SUBSETOF_THESET_THESET_NEG;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$REMOVAL_SUBSETOF_THESET_THESETOF_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_SUBSETOF_THESET_THESETOF_NEG;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$POS;
  private static final SubLSymbol $kw14$NEG;
  private static final SubLSymbol $kw15$REMOVAL_SUBSETOF_THESETOF_FORT_POS;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$REMOVAL_SUBSETOF_THESETOF_FORT_NEG;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$REMOVAL_SUBSETOF_THESETOF_THESETOF_POS;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG;
  private static final SubLList $list26;
  private static final SubLSymbol $kw27$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG;
  private static final SubLList $list30;
  private static final SubLObject $const31$TheSet;
  private static final SubLObject $const32$UniversalVocabularyMt;
  private static final SubLSymbol $kw33$REMOVAL_SUBSETOF_VARIABLE_THESET_POS;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$VARIABLE_P;
  private static final SubLObject $const36$rewriteOf;
  private static final SubLSymbol $kw37$CODE;
  private static final SubLSymbol $kw38$REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLObject $const41$BaseKB;
  private static final SubLSymbol $kw42$REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION;
  private static final SubLList $list43;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 1582L)
  public static SubLObject make_subsetof_hl_support(final SubLObject formula, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( tv == UNPROVIDED )
    {
      tv = $kw0$TRUE_DEF;
    }
    return arguments.make_hl_support( $kw1$SUBSETOF, formula, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 1896L)
  public static SubLObject removal_subsetof_theset_theset_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subset = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject superset = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject subset_elements = cycl_utilities.nat_args( subset, UNPROVIDED );
    final SubLObject superset_elements = cycl_utilities.nat_args( superset, UNPROVIDED );
    if( NIL != conses_high.subsetp( subset_elements, superset_elements, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      backward.removal_add_node( make_subsetof_hl_support( asent, mt_vars.$subset_of_defining_mt$.getGlobalValue(), $kw4$TRUE_MON ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 2602L)
  public static SubLObject removal_subsetof_theset_theset_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subset = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject superset = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject subset_elements = cycl_utilities.nat_args( subset, UNPROVIDED );
    final SubLObject superset_elements = cycl_utilities.nat_args( superset, UNPROVIDED );
    if( NIL == conses_high.subsetp( subset_elements, superset_elements, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      backward.removal_add_node( make_subsetof_hl_support( cycl_utilities.negate( asent ), mt_vars.$subset_of_defining_mt$.getGlobalValue(), $kw4$TRUE_MON ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 4211L)
  public static SubLObject removal_subsetof_theset_thesetof_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args( arg1_set, UNPROVIDED );
    SubLObject arg1_element = NIL;
    arg1_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject result = removal_modules_isa.inference_elementof_thesetof_check( arg1_element, arg2_set_of, UNPROVIDED );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == result && NIL != validP )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg1_element = cdolist_list_var.first();
    }
    backward.removal_add_node( make_subsetof_hl_support( asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 5280L)
  public static SubLObject removal_subsetof_theset_thesetof_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1_set = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2_set_of = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject arg1_elements = cdolist_list_var = cycl_utilities.nat_args( arg1_set, UNPROVIDED );
    SubLObject arg1_element = NIL;
    arg1_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject result = removal_modules_isa.inference_elementof_thesetof_check( arg1_element, arg2_set_of, UNPROVIDED );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == result && NIL != validP )
      {
        backward.removal_add_node( make_subsetof_hl_support( cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg1_element = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 7215L)
  public static SubLObject removal_subsetof_thesetof_fort_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_fort_expand( asent, $kw13$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 8705L)
  public static SubLObject removal_subsetof_thesetof_fort_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_fort_expand( asent, $kw14$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10130L)
  public static SubLObject removal_subsetof_thesetof_fort_expand(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject the_set_of = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject set_formula = cycl_utilities.nat_arg2( the_set_of, UNPROVIDED );
    final SubLObject collection = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject hypothetical_mt = inference_hypothesize_element( set_formula, UNPROVIDED );
    final SubLObject hypothetical_element = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject subset = makeBoolean( NIL != hypothetical_mt && NIL != hypothetical_element && NIL != isa.isaP( hypothetical_element, collection, hypothetical_mt, UNPROVIDED ) );
    if( NIL != ( ( NIL != subset ) ? Equality.eq( $kw13$POS, sense ) : Equality.eq( $kw14$NEG, sense ) ) )
    {
      SubLObject support_formula = asent;
      if( $kw14$NEG == sense )
      {
        support_formula = cycl_utilities.negate( support_formula );
      }
      backward.removal_add_node( make_subsetof_hl_support( support_formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 10844L)
  public static SubLObject inference_hypothesize_element(final SubLObject set_formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hypothetical_mt = NIL;
    SubLObject hypothetical_element = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_apply_necessary_defnsP$.currentBinding( thread );
    try
    {
      at_vars.$at_apply_necessary_defnsP$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject hyp_mt = prove.prepare_hypothesis_mt( set_formula, mt, ZERO_INTEGER );
      final SubLObject term_bindings = thread.secondMultipleValue();
      final SubLObject failure_reasons = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == failure_reasons )
      {
        final SubLObject binding = term_bindings.first();
        final SubLObject hyp_element = bindings.variable_binding_value( binding );
        if( NIL != forts.fort_p( hyp_element ) )
        {
          hypothetical_mt = hyp_mt;
          hypothetical_element = hyp_element;
        }
      }
    }
    finally
    {
      at_vars.$at_apply_necessary_defnsP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != hypothetical_element )
    {
      return Values.values( hypothetical_mt, hypothetical_element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11675L)
  public static SubLObject removal_genls_thecollectionof_fort_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_fort_expand( asent, $kw13$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 11839L)
  public static SubLObject removal_genls_thecollectionof_fort_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_fort_expand( asent, $kw14$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 13231L)
  public static SubLObject removal_subsetof_thesetof_thesetof_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_thesetof_expand( asent, $kw13$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 13733L)
  public static SubLObject removal_subsetof_thesetof_thesetof_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_thesetof_expand( asent, $kw14$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 15483L)
  public static SubLObject removal_subsetof_thesetof_thesetof_expand(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject the_set_of_sub = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject set_formula_sub = cycl_utilities.nat_arg2( the_set_of_sub, UNPROVIDED );
    final SubLObject the_set_of_super = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject hypothetical_mt = inference_hypothesize_element( set_formula_sub, UNPROVIDED );
    final SubLObject hypothetical_element = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != hypothetical_mt && NIL != hypothetical_element )
    {
      thread.resetMultipleValues();
      final SubLObject subset = removal_modules_isa.inference_elementof_thesetof_check( hypothetical_element, the_set_of_super, hypothetical_mt );
      final SubLObject validP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != validP && NIL != ( ( NIL != subset ) ? Equality.eq( $kw13$POS, sense ) : Equality.eq( $kw14$NEG, sense ) ) )
      {
        SubLObject support_formula = asent;
        if( $kw14$NEG == sense )
        {
          support_formula = cycl_utilities.negate( support_formula );
        }
        backward.removal_add_node( arguments.make_hl_support( $kw1$SUBSETOF, support_formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16436L)
  public static SubLObject removal_genls_thecollectionof_thecollectionof_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_thesetof_expand( asent, $kw13$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 16615L)
  public static SubLObject removal_genls_thecollectionof_thecollectionof_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_subsetof_thesetof_thesetof_expand( asent, $kw14$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 18581L)
  public static SubLObject removal_subsetof_variable_theset_cost(final SubLObject asent)
  {
    return Numbers.expt( TWO_INTEGER, Sequences.length( cycl_utilities.nat_args( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 18916L)
  public static SubLObject removal_subsetof_variable_theset_expand(final SubLObject asent, final SubLObject sense)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject superset = cycl_utilities.nat_args( arg2, UNPROVIDED );
    SubLObject cdolist_list_var = list_utilities.powerset( superset );
    SubLObject subset = NIL;
    subset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_bindings = unification_utilities.term_unify( arg1, reader.bq_cons( $const31$TheSet, ConsesLow.append( subset, NIL ) ), UNPROVIDED, UNPROVIDED );
      if( NIL != v_bindings )
      {
        final SubLObject unify_arg1 = bindings.subst_bindings( v_bindings, arg1 );
        final SubLObject formula = ConsesLow.list( $const2$subsetOf, unify_arg1, arg2 );
        backward.removal_add_node( arguments.make_hl_support( $kw1$SUBSETOF, formula, $const32$UniversalVocabularyMt, $kw4$TRUE_MON ), v_bindings, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subset = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20210L)
  public static SubLObject small_extensional_set_wrt_powersetP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_extensional_set_p( v_object ) )
    {
      return Numbers.numLE( Sequences.length( el_utilities.extensional_set_elements( v_object ) ), $default_subsetof_unbound_theset_max_cardinality$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20530L)
  public static SubLObject all_extensional_set_elements_unboundP(final SubLObject v_object)
  {
    if( NIL != el_utilities.el_extensional_set_p( v_object ) )
    {
      return list_utilities.every_in_list( Symbols.symbol_function( $sym35$VARIABLE_P ), el_utilities.extensional_set_elements( v_object ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 20798L)
  public static SubLObject removal_subsetof_not_fully_bound_theset_expand(final SubLObject asent, final SubLObject sense)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject superset = cycl_utilities.nat_args( arg2, UNPROVIDED );
    SubLObject cdolist_list_var = list_utilities.powerset( superset );
    SubLObject subset = NIL;
    subset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = list_utilities.permute_list( subset, UNPROVIDED );
      SubLObject perm = NIL;
      perm = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject candidate = reader.bq_cons( $const31$TheSet, ConsesLow.append( perm, NIL ) );
        final SubLObject v_bindings = unification_utilities.term_unify( arg1, candidate, UNPROVIDED, UNPROVIDED );
        if( NIL != v_bindings )
        {
          final SubLObject unify_arg1 = bindings.subst_bindings( v_bindings, arg1 );
          final SubLObject formula = ConsesLow.list( $const2$subsetOf, unify_arg1, arg2 );
          final SubLObject canonical_candidate = el_utilities.canonicalize_extensional_set( candidate );
          final SubLObject rewrite_formula = ConsesLow.list( $const36$rewriteOf, canonical_candidate, candidate );
          final SubLObject additional_supports = ( NIL != el_utilities.canonical_extensional_set_p( candidate ) ) ? NIL
              : ConsesLow.list( arguments.make_hl_support( $kw37$CODE, rewrite_formula, $const32$UniversalVocabularyMt, $kw4$TRUE_MON ) );
          backward.removal_add_node( arguments.make_hl_support( $kw1$SUBSETOF, formula, $const32$UniversalVocabularyMt, $kw4$TRUE_MON ), v_bindings, additional_supports );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        perm = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      subset = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 22656L)
  public static SubLObject make_empty_set_support()
  {
    return arguments.make_hl_support( $kw37$CODE, $list40, $const41$BaseKB, $kw4$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subset-of.lisp", position = 24652L)
  public static SubLObject removal_subsetof_theemptyset_set_or_collection_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    backward.removal_add_node( make_subsetof_hl_support( asent, UNPROVIDED, UNPROVIDED ), NIL, ConsesLow.list( make_empty_set_support() ) );
    return NIL;
  }

  public static SubLObject declare_removal_modules_subset_of_file()
  {
    SubLFiles.declareFunction( me, "make_subsetof_hl_support", "MAKE-SUBSETOF-HL-SUPPORT", 1, 2, false );
    SubLFiles.declareFunction( me, "removal_subsetof_theset_theset_pos_expand", "REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_theset_theset_neg_expand", "REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_theset_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_theset_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_thesetof_fort_pos_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_thesetof_fort_neg_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_thesetof_fort_expand", "REMOVAL-SUBSETOF-THESETOF-FORT-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_hypothesize_element", "INFERENCE-HYPOTHESIZE-ELEMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genls_thecollectionof_fort_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genls_thecollectionof_fort_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_thesetof_thesetof_pos_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_thesetof_thesetof_neg_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_thesetof_thesetof_expand", "REMOVAL-SUBSETOF-THESETOF-THESETOF-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_genls_thecollectionof_thecollectionof_pos_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genls_thecollectionof_thecollectionof_neg_expand", "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_subsetof_variable_theset_cost", "REMOVAL-SUBSETOF-VARIABLE-THESET-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_subsetof_variable_theset_expand", "REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "small_extensional_set_wrt_powersetP", "SMALL-EXTENSIONAL-SET-WRT-POWERSET?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_extensional_set_elements_unboundP", "ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_subsetof_not_fully_bound_theset_expand", "REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "make_empty_set_support", "MAKE-EMPTY-SET-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_subsetof_theemptyset_set_or_collection_expand", "REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_subset_of_file()
  {
    $removal_subsetof_theset_theset_cost$ = SubLFiles.defparameter( "*REMOVAL-SUBSETOF-THESET-THESET-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $removal_subsetof_theset_thesetof_cost$ = SubLFiles.defparameter( "*REMOVAL-SUBSETOF-THESET-THESETOF-COST*", TWO_INTEGER );
    $default_subsetof_thesetof_hypothesize_cost$ = SubLFiles.defparameter( "*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*", TWO_INTEGER );
    $default_genls_thecollectionof_hypothesize_cost$ = SubLFiles.defparameter( "*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*", $default_subsetof_thesetof_hypothesize_cost$.getDynamicValue() );
    $default_subsetof_thesetof_check_cost$ = SubLFiles.defparameter( "*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*", TWO_INTEGER );
    $default_genls_thecollectionof_check_cost$ = SubLFiles.defparameter( "*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*", $default_subsetof_thesetof_check_cost$.getDynamicValue() );
    $default_subsetof_unbound_theset_max_cardinality$ = SubLFiles.defparameter( "*DEFAULT-SUBSETOF-UNBOUND-THESET-MAX-CARDINALITY*", TEN_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_subset_of_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const2$subsetOf );
    preference_modules.doomed_unless_all_args_bindable( $kw3$BOTH, $const2$subsetOf );
    inference_modules.inference_removal_module( $kw5$REMOVAL_SUBSETOF_THESET_THESET_POS, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_SUBSETOF_THESET_THESET_NEG, $list8 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_SUBSETOF_THESET_THESETOF_POS, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_SUBSETOF_THESET_THESETOF_NEG, $list12 );
    inference_modules.inference_removal_module( $kw15$REMOVAL_SUBSETOF_THESETOF_FORT_POS, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_SUBSETOF_THESETOF_FORT_NEG, $list18 );
    inference_modules.inference_removal_module( $kw19$REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS, $list20 );
    inference_modules.inference_removal_module( $kw21$REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG, $list22 );
    inference_modules.inference_removal_module( $kw23$REMOVAL_SUBSETOF_THESETOF_THESETOF_POS, $list24 );
    inference_modules.inference_removal_module( $kw25$REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG, $list26 );
    inference_modules.inference_removal_module( $kw27$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS, $list28 );
    inference_modules.inference_removal_module( $kw29$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG, $list30 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_SUBSETOF_VARIABLE_THESET_POS, $list34 );
    inference_modules.inference_removal_module( $kw38$REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS, $list39 );
    inference_modules.inference_removal_module( $kw42$REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION, $list43 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_subset_of_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_subset_of_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_subset_of_file();
  }
  static
  {
    me = new removal_modules_subset_of();
    $removal_subsetof_theset_theset_cost$ = null;
    $removal_subsetof_theset_thesetof_cost$ = null;
    $default_subsetof_thesetof_hypothesize_cost$ = null;
    $default_genls_thecollectionof_hypothesize_cost$ = null;
    $default_subsetof_thesetof_check_cost$ = null;
    $default_genls_thecollectionof_check_cost$ = null;
    $default_subsetof_unbound_theset_max_cardinality$ = null;
    $kw0$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw1$SUBSETOF = makeKeyword( "SUBSETOF" );
    $const2$subsetOf = constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) );
    $kw3$BOTH = makeKeyword( "BOTH" );
    $kw4$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw5$REMOVAL_SUBSETOF_THESET_THESET_POS = makeKeyword( "REMOVAL-SUBSETOF-THESET-THESET-POS" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*REMOVAL-SUBSETOF-THESET-THESET-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESET-THESET-POS-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$subsetOf (#$TheSet 1 2)(#$TheSet 1 2 3))" )
    } );
    $kw7$REMOVAL_SUBSETOF_THESET_THESET_NEG = makeKeyword( "REMOVAL-SUBSETOF-THESET-THESET-NEG" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*REMOVAL-SUBSETOF-THESET-THESET-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESET-THESET-NEG-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$not (#$subsetOf (#$TheSet . <fully-bound>)(#$TheSet . <fully-bound>)))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$not (#$subsetOf (#$TheSet 1 2 3)(#$TheSet 1 2)))" )
    } );
    $kw9$REMOVAL_SUBSETOF_THESET_THESETOF_POS = makeKeyword( "REMOVAL-SUBSETOF-THESET-THESETOF-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*REMOVAL-SUBSETOF-THESET-THESETOF-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESET-THESETOF-POS-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$subsetOf\n  (#$TheSet #$France #$Austria)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY)))" )
    } );
    $kw11$REMOVAL_SUBSETOF_THESET_THESETOF_NEG = makeKeyword( "REMOVAL-SUBSETOF-THESET-THESETOF-NEG" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*REMOVAL-SUBSETOF-THESET-THESETOF-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESET-THESETOF-NEG-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$not \n (#$subsetOf\n  (#$TheSet . <fully-bound>)\n  (#$TheSetOf <variable> <fully-bound>)))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$not\n (#$subsetOf\n  (#$TheSet #$France #$Canada)\n  (#$TheSetOf ?COUNTRY\n    (#$bordersOn #$Germany ?COUNTRY))))" )
    } );
    $kw13$POS = makeKeyword( "POS" );
    $kw14$NEG = makeKeyword( "NEG" );
    $kw15$REMOVAL_SUBSETOF_THESETOF_FORT_POS = makeKeyword( "REMOVAL-SUBSETOF-THESETOF-FORT-POS" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESETOF-FORT-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>)" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)" )
    } );
    $kw17$REMOVAL_SUBSETOF_THESETOF_FORT_NEG = makeKeyword( "REMOVAL-SUBSETOF-THESETOF-FORT-NEG" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-SUBSETOF-THESETOF-HYPOTHESIZE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESETOF-FORT-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not\n  (#$subsetOf (#$TheSetOf <variable> <fully-bound>) <fort>))" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))" )
    } );
    $kw19$REMOVAL_GENLS_THECOLLECTIONOF_FORT_POS = makeKeyword( "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  #$Mammal)" )
    } );
    $kw21$REMOVAL_GENLS_THECOLLECTIONOF_FORT_NEG = makeKeyword( "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GENLS-THECOLLECTIONOF-HYPOTHESIZE-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$not\n  (#$genls (#$TheCollectionOf <variable> <fully-bound>) <fort>))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL \n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    #$Dog))" )
    } );
    $kw23$REMOVAL_SUBSETOF_THESETOF_THESETOF_POS = makeKeyword( "REMOVAL-SUBSETOF-THESETOF-THESETOF-POS" );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESETOF-THESETOF-POS-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$subsetOf \n  (#$TheSetOf <variable> <fully-bound>) \n  (#$TheSetOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$subsetOf \n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheSetOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))" )
    } );
    $kw25$REMOVAL_SUBSETOF_THESETOF_THESETOF_NEG = makeKeyword( "REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG" );
    $list26 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-SUBSETOF-THESETOF-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THESETOF-THESETOF-NEG-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$not \n  (#$subsetOf \n    (#$TheSetOf <variable> <fully-bound>) \n    (#$TheSetOf <variable> <fully-bound>)))" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$not\n  (#$subsetOf \n    (#$TheSetOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheSetOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))" )
    } );
    $kw27$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_POS = makeKeyword( "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS" );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheCollectionOf" ) ),
                makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword( "REMOVAL-GENLS-THECOLLECTIONOF-FORT-POS" ) ), makeKeyword(
                    "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                        "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                            "(#$genls \n  (#$TheCollectionOf <variable> <fully-bound>) \n  (#$TheCollectionOf <variable> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                "(#$genls \n  (#$TheCollectionOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor)))\n  (#$TheCollectionOf ?MAMMAL\n    (#$and \n      (#$isa ?MAMMAL #$Mammal)\n      (#$colorOfObject ?MAMMAL #$RedColor))))" )
    } );
    $kw29$REMOVAL_GENLS_THECOLLECTIONOF_THECOLLECTIONOF_NEG = makeKeyword( "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ) ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheCollectionOf" ) ),
                makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword( "REMOVAL-GENLS-THECOLLECTIONOF-FORT-NEG" ) ), makeKeyword(
                    "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GENLS-THECOLLECTIONOF-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                        "REMOVAL-GENLS-THECOLLECTIONOF-THECOLLECTIONOF-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                            "(#$not \n  (#$genls \n    (#$TheCollectionOf <variable> <fully-bound>) \n    (#$TheCollectionOf <variable> <fully-bound>)))" ), makeKeyword( "EXAMPLE" ), makeString(
                                "(#$not\n  (#$genls \n    (#$TheCollectionOf ?MAMMAL\n      (#$and \n        (#$isa ?MAMMAL #$Mammal)\n        (#$colorOfObject ?MAMMAL #$RedColor)))\n    (#$TheCollectionOf ?DOG \n      (#$and \n        (#$isa ?DOG #$Dog)\n        (#$colorOfObject ?DOG #$RedColor)))))" )
    } );
    $const31$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $const32$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw33$REMOVAL_SUBSETOF_VARIABLE_THESET_POS = makeKeyword( "REMOVAL-SUBSETOF-VARIABLE-THESET-POS" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.list( makeKeyword( "OR" ), makeKeyword( "VARIABLE" ), ConsesLow.list( makeKeyword( "AND" ),
            ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?" ) ) ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword(
                    "FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SMALL-EXTENSIONAL-SET-WRT-POWERSET?" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-SUBSETOF-VARIABLE-THESET-COST" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-VARIABLE-THESET-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$subsetOf (<variable> or (#$TheSet . <all-unbound>) (#$TheSet . <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$subsetOf ?SUBSET (#$TheSet 1 2 3))" )
    } );
    $sym35$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $const36$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $kw37$CODE = makeKeyword( "CODE" );
    $kw38$REMOVAL_SUBSETOF_NOT_FULLY_BOUND_THESET_POS = makeKeyword( "REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-POS" );
    $list39 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword(
            "VARIABLE" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword(
                "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ALL-EXTENSIONAL-SET-ELEMENTS-UNBOUND?" ) ) ) ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( constant_handles
                    .reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SMALL-EXTENSIONAL-SET-WRT-POWERSET?" ) ) ) ), makeKeyword(
                        "COST" ), makeSymbol( "REMOVAL-SUBSETOF-VARIABLE-THESET-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                            "REMOVAL-SUBSETOF-NOT-FULLY-BOUND-THESET-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$subsetOf (#$TheSet . <not-fully-bound>) (#$TheSet . <fully-bound>))" ), makeKeyword(
                                "EXAMPLE" ), makeString( "(#$subsetOf (#$TheSet 1 ?X 3) (#$TheSet 1 2 3 4))" )
    } );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ), makeSymbol( "?SET" ) );
    $const41$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw42$REMOVAL_SUBSETOF_THEEMPTYSET_SET_OR_COLLECTION = makeKeyword( "REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subsetOf" ) ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ), ConsesLow.list(
            makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SET-OR-COLLECTION?" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SUBSETOF-THEEMPTYSET-SET-OR-COLLECTION-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$subsetOf #$TheEmptySet <fully-bound>)\n    where <fully-bound> arg2 is also a #$Set-Mathematical or a #$Collection" ), makeKeyword( "EXAMPLE" ), makeString(
                        " (#$subsetOf #$TheEmptySet #$TheEmptySet)\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSet #$isa #$Thing #$Collection))\n\n  (#$subsetOf \n  #$TheEmptySet\n  (#$TheSetOf ?DOG \n    (#$and \n      (#$isa ?DOG #$Dog)\n      (#$colorOfObject ?DOG #$RedColor))))\n" )
    } );
  }
}
/*
 * 
 * Total time: 245 ms
 * 
 */