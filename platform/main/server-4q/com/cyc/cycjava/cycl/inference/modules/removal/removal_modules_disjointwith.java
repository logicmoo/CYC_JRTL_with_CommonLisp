package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_disjointwith
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith";
  public static final String myFingerPrint = "8047c575dc76b707a909369f2b180386cf996a6d98f1b533072ef75a625f16b3";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 1611L)
  private static SubLSymbol $default_disjointwith_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 2601L)
  private static SubLSymbol $default_sibling_disjoint_cost_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 5942L)
  private static SubLSymbol $default_max_sibling_disjoint_cost_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 8258L)
  private static SubLSymbol $default_not_disjointwith_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 9834L)
  private static SubLSymbol $default_instancesofdisjointcollections_check_cost$;
  private static final SubLObject $const0$disjointWith;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$MAX_DISJOINT_WITH_POS;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$DISJOINTWITH;
  private static final SubLSymbol $kw6$REMOVAL_DISJOINTWITH_CHECK;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$SIBLING_DISJOINT;
  private static final SubLSymbol $kw9$REMOVAL_SIBLING_DISJOINT_CHECK;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_MAX_DISJOINTWITH;
  private static final SubLList $list12;
  private static final SubLInteger $int13$100;
  private static final SubLSymbol $kw14$REMOVAL_MAX_SIBLING_DISJOINT;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$MINIMIZE;
  private static final SubLSymbol $kw18$REMOVAL_NOT_DISJOINTWITH_CHECK;
  private static final SubLList $list19;
  private static final SubLObject $const20$instancesOfDisjointCollections;
  private static final SubLSymbol $kw21$REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS;
  private static final SubLList $list22;
  private static final SubLObject $const23$maximalConsistentSubsets;
  private static final SubLSymbol $kw24$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST;
  private static final SubLSymbol $sym29$CANONICALIZE_TERM;
  private static final SubLSymbol $sym30$MAKE_EL_SET;
  private static final SubLSymbol $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 1893L)
  public static SubLObject removal_disjointwith_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
    try
    {
      sdc.$ignoring_sdcP$.bind( T, thread );
      final SubLObject col1 = el_utilities.literal_arg1( literal, UNPROVIDED );
      final SubLObject col2 = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( NIL != disjoint_with.disjoint_withP( col1, col2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$disjointWith, ConsesLow.list( col1, col2 ) );
        backward.removal_add_node( arguments.make_hl_support( $kw5$DISJOINTWITH, hl_support_formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 2855L)
  public static SubLObject removal_sibling_disjoint_check_required(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject arg1 = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject arg2 = el_utilities.literal_arg2( literal, UNPROVIDED );
    return makeBoolean( NIL != inference_trampolines.inference_applicable_sdctP( arg1 ) && NIL != inference_trampolines.inference_applicable_sdctP( arg2 ) && NIL != sdc.isa_common_sdctP( arg1, arg2, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 3224L)
  public static SubLObject removal_sibling_disjoint_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject col1 = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject col2 = el_utilities.literal_arg2( literal, UNPROVIDED );
    if( NIL != sdc.sdcP( col1, col2, UNPROVIDED ) )
    {
      final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$disjointWith, ConsesLow.list( col1, col2 ) );
      backward.removal_add_node( arguments.make_hl_support( $kw8$SIBLING_DISJOINT, hl_support_formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 4170L)
  public static SubLObject removal_max_disjointwith_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject v_term = el_utilities.literal_arg1( literal, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == forts.fort_p( v_term ) )
    {
      v_term = el_utilities.literal_arg2( literal, UNPROVIDED );
    }
    result = cardinality_estimates.genl_cardinality( v_term );
    if( result.isZero() )
    {
      result = Sequences.length( genls.all_genls( v_term, UNPROVIDED, UNPROVIDED ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 4812L)
  public static SubLObject removal_max_disjointwith_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject term2 = el_utilities.literal_arg2( literal, UNPROVIDED );
    final SubLObject variable = ( NIL != variables.variable_p( term1 ) ) ? term1 : term2;
    final SubLObject fort = ( NIL != forts.fort_p( term1 ) ) ? term1 : term2;
    SubLObject cdolist_list_var;
    final SubLObject disjoint_terms = cdolist_list_var = disjoint_with.max_all_disjoint_with_no_sdc( fort, UNPROVIDED, UNPROVIDED );
    SubLObject disjoint_term = NIL;
    disjoint_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( variable, disjoint_term, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject subst_literal = bindings.subst_bindings( v_bindings, literal );
      final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$disjointWith, el_utilities.literal_args( subst_literal, UNPROVIDED ) );
      backward.removal_add_node( arguments.make_hl_support( $kw5$DISJOINTWITH, hl_support_formula, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
      cdolist_list_var = cdolist_list_var.rest();
      disjoint_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 6246L)
  public static SubLObject removal_max_sibling_disjoint_required(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject arg1 = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject arg2 = el_utilities.literal_arg2( literal, UNPROVIDED );
    return makeBoolean( ( NIL != forts.fort_p( arg1 ) && NIL != inference_trampolines.inference_applicable_sdctP( arg1 ) ) || ( NIL != forts.fort_p( arg2 ) && NIL != inference_trampolines.inference_applicable_sdctP(
        arg2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 6628L)
  public static SubLObject removal_max_sibling_disjoint_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject disjoint_cost = removal_max_disjointwith_cost( literal, UNPROVIDED );
    return Numbers.multiply( disjoint_cost, $default_max_sibling_disjoint_cost_factor$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 7078L)
  public static SubLObject removal_max_sibling_disjoint_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = el_utilities.literal_arg1( literal, UNPROVIDED );
    final SubLObject term2 = el_utilities.literal_arg2( literal, UNPROVIDED );
    final SubLObject variable = ( NIL != variables.variable_p( term1 ) ) ? term1 : term2;
    final SubLObject fort = ( NIL != forts.fort_p( term1 ) ) ? term1 : term2;
    SubLObject cdolist_list_var;
    final SubLObject disjoint_terms = cdolist_list_var = sdc.max_sdc( fort, UNPROVIDED );
    SubLObject disjoint_term = NIL;
    disjoint_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( variable, disjoint_term, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject subst_literal = bindings.subst_bindings( v_bindings, literal );
      final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$disjointWith, el_utilities.literal_args( subst_literal, UNPROVIDED ) );
      backward.removal_add_node( arguments.make_hl_support( $kw8$SIBLING_DISJOINT, hl_support_formula, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
      cdolist_list_var = cdolist_list_var.rest();
      disjoint_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 8428L)
  public static SubLObject removal_not_disjointwith_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject col1 = NIL;
    SubLObject col2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    col1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    col2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == disjoint_with.disjoint_withP( col1, col2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$disjointWith, ConsesLow.list( col1, col2 ) );
        backward.removal_add_node( arguments.make_hl_support( $kw17$MINIMIZE, cycl_utilities.negate( hl_support_formula ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != disjoint_with.not_disjoint_withP( col1, col2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$disjointWith, ConsesLow.list( col1, col2 ) );
        backward.removal_add_node( arguments.make_hl_support( $kw5$DISJOINTWITH, cycl_utilities.negate( hl_support_formula ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 10997L)
  public static SubLObject removal_instances_of_disjoint_collections_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject inst1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject inst2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( inst1.eql( inst2 ) )
    {
      return NIL;
    }
    if( NIL != disjoint_with.instances_of_disjoint_collectionsP( inst1, inst2, UNPROVIDED, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw5$DISJOINTWITH, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 13907L)
  public static SubLObject removal_maximal_consistent_subsets_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject v_set = el_utilities.el_extensional_set_elements( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) );
    return Sequences.length( v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 14119L)
  public static SubLObject removal_maximal_consistent_subsets_unify_output_generate(final SubLObject v_set)
  {
    final SubLObject cols = el_utilities.el_extensional_set_elements( v_set );
    final SubLObject subsets = disjoint_with.maximal_consistent_subsets( cols );
    return Mapping.mapcar( $sym29$CANONICALIZE_TERM, Mapping.mapcar( $sym30$MAKE_EL_SET, subsets ) );
  }

  public static SubLObject declare_removal_modules_disjointwith_file()
  {
    SubLFiles.declareFunction( me, "removal_disjointwith_check_expand", "REMOVAL-DISJOINTWITH-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sibling_disjoint_check_required", "REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sibling_disjoint_check_expand", "REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_disjointwith_cost", "REMOVAL-MAX-DISJOINTWITH-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_disjointwith_expand", "REMOVAL-MAX-DISJOINTWITH-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_sibling_disjoint_required", "REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_sibling_disjoint_cost", "REMOVAL-MAX-SIBLING-DISJOINT-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_sibling_disjoint_expand", "REMOVAL-MAX-SIBLING-DISJOINT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_disjointwith_check_expand", "REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_instances_of_disjoint_collections_expand", "REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_maximal_consistent_subsets_unify_cost", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_maximal_consistent_subsets_unify_output_generate", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_disjointwith_file()
  {
    $default_disjointwith_check_cost$ = SubLFiles.defparameter( "*DEFAULT-DISJOINTWITH-CHECK-COST*", TWO_INTEGER );
    $default_sibling_disjoint_cost_factor$ = SubLFiles.defparameter( "*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*", TWO_INTEGER );
    $default_max_sibling_disjoint_cost_factor$ = SubLFiles.defparameter( "*DEFAULT-MAX-SIBLING-DISJOINT-COST-FACTOR*", $int13$100 );
    $default_not_disjointwith_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*", FOUR_INTEGER );
    $default_instancesofdisjointcollections_check_cost$ = SubLFiles.defparameter( "*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*", $default_disjointwith_check_cost$.getDynamicValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_disjointwith_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$disjointWith );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const0$disjointWith );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$disjointWith );
    preference_modules.inference_preference_module( $kw3$MAX_DISJOINT_WITH_POS, $list4 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_DISJOINTWITH_CHECK, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_SIBLING_DISJOINT_CHECK, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_MAX_DISJOINTWITH, $list12 );
    inference_modules.inference_removal_module( $kw14$REMOVAL_MAX_SIBLING_DISJOINT, $list15 );
    inference_modules.inference_removal_module( $kw18$REMOVAL_NOT_DISJOINTWITH_CHECK, $list19 );
    inference_modules.register_solely_specific_removal_module_predicate( $const20$instancesOfDisjointCollections );
    preference_modules.doomed_unless_all_args_bindable( $kw1$POS, $const20$instancesOfDisjointCollections );
    inference_modules.inference_removal_module( $kw21$REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS, $list22 );
    inference_modules.register_solely_specific_removal_module_predicate( $const23$maximalConsistentSubsets );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const23$maximalConsistentSubsets, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw24$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK, $list25 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY, $list27 );
    utilities_macros.note_funcall_helper_function( $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST );
    utilities_macros.note_funcall_helper_function( $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_disjointwith_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_disjointwith_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_disjointwith_file();
  }
  static
  {
    me = new removal_modules_disjointwith();
    $default_disjointwith_check_cost$ = null;
    $default_sibling_disjoint_cost_factor$ = null;
    $default_max_sibling_disjoint_cost_factor$ = null;
    $default_not_disjointwith_check_cost$ = null;
    $default_instancesofdisjointcollections_check_cost$ = null;
    $const0$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$MAX_DISJOINT_WITH_POS = makeKeyword( "MAX-DISJOINT-WITH-POS" );
    $list4 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
                "GROSSLY-DISPREFERRED" ) );
    $kw5$DISJOINTWITH = makeKeyword( "DISJOINTWITH" );
    $kw6$REMOVAL_DISJOINTWITH_CHECK = makeKeyword( "REMOVAL-DISJOINTWITH-CHECK" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-DISJOINTWITH-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-DISJOINTWITH-CHECK-EXPAND" )
    } );
    $kw8$SIBLING_DISJOINT = makeKeyword( "SIBLING-DISJOINT" );
    $kw9$REMOVAL_SIBLING_DISJOINT_CHECK = makeKeyword( "REMOVAL-SIBLING-DISJOINT-CHECK" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "REQUIRED" ), makeSymbol(
            "REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "*DEFAULT-DISJOINTWITH-CHECK-COST*" ), makeSymbol(
                "*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*" ) ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND" )
    } );
    $kw11$REMOVAL_MAX_DISJOINTWITH = makeKeyword( "REMOVAL-MAX-DISJOINTWITH" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "FORT" ) ) ), makeKeyword( "COST" ), makeSymbol(
                "REMOVAL-MAX-DISJOINTWITH-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MAX-DISJOINTWITH-EXPAND" )
    } );
    $int13$100 = makeInteger( 100 );
    $kw14$REMOVAL_MAX_SIBLING_DISJOINT = makeKeyword( "REMOVAL-MAX-SIBLING-DISJOINT" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "FORT" ) ) ), makeKeyword( "REQUIRED" ), makeSymbol(
                "REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MAX-SIBLING-DISJOINT-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                    "EXPAND" ), makeSymbol( "REMOVAL-MAX-SIBLING-DISJOINT-EXPAND" )
    } );
    $list16 = ConsesLow.list( makeSymbol( "COL1" ), makeSymbol( "COL2" ) );
    $kw17$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw18$REMOVAL_NOT_DISJOINTWITH_CHECK = makeKeyword( "REMOVAL-NOT-DISJOINTWITH-CHECK" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND" )
    } );
    $const20$instancesOfDisjointCollections = constant_handles.reader_make_constant_shell( makeString( "instancesOfDisjointCollections" ) );
    $kw21$REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS = makeKeyword( "REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "instancesOfDisjointCollections" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "instancesOfDisjointCollections" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND" ), makeKeyword(
          "DOCUMENTATION" ), makeString( "(#$instancesOfDisjointCollections <fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$instancesOfDisjointCollections #$AbrahamLincoln #$CityOfAustinTX)\n    (#$instancesOfDisjointCollections (#$SomeFn #$Cat) (#$SomeFn #$Dog))" )
    } );
    $const23$maximalConsistentSubsets = constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) );
    $kw24$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK = makeKeyword( "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-CHECK" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ),
          ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-EXTENSIONAL-SET-P" ) ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
              "EL-EXTENSIONAL-SET-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword(
                      "BIND" ), makeSymbol( "SUBSET" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBSET" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "SET" ), makeSymbol( "SUBSET" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "MAXIMAL-CONSISTENT-SUBSET?" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EL-EXTENSIONAL-SET-ELEMENTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ) ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "EL-EXTENSIONAL-SET-ELEMENTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBSET" ) ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword(
                  "DOCUMENTATION" ), makeString( "(#$maximalConsistentSubsets <set-of-collections> <set-of-collections>)" ), makeKeyword( "EXAMPLE" ), makeString(
                      "(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) (#$TheSet #$Animal #$MaleAnimal))" )
    } );
    $kw26$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY = makeKeyword( "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ),
          ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-EXTENSIONAL-SET-P" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ), ConsesLow.list(
          makeKeyword( "BIND" ), makeSymbol( "SET" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "maximalConsistentSubsets" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "CODE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$maximalConsistentSubsets <set-of-collections> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) ?WHAT)" )
    } );
    $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST = makeSymbol( "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST" );
    $sym29$CANONICALIZE_TERM = makeSymbol( "CANONICALIZE-TERM" );
    $sym30$MAKE_EL_SET = makeSymbol( "MAKE-EL-SET" );
    $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE = makeSymbol( "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE" );
  }
}
/*
 * 
 * Total time: 132 ms
 * 
 */