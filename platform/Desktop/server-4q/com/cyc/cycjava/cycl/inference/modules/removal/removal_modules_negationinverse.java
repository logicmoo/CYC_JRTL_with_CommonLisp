package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_negationinverse
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_negationinverse";
  public static final String myFingerPrint = "a3a4a1aaec237688d9b1cafcedcaf431dbe23d7f2f539eceec9ec3134c1933c8";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 732L)
  private static SubLSymbol $default_negationinverse_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 3422L)
  private static SubLSymbol $default_not_negationinverse_check_cost$;
  private static final SubLObject $const0$negationInverse;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$NEGATIONPREDS;
  private static final SubLSymbol $kw5$REMOVAL_NEGATIONINVERSE_CHECK;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_MAX_NEGATIONINVERSE;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$MAX_NEGATION_INVERSE_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$MINIMIZE;
  private static final SubLSymbol $kw12$REMOVAL_NOT_NEGATIONINVERSE_CHECK;
  private static final SubLList $list13;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 919L)
  public static SubLObject removal_negationinverse_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject pred1 = NIL;
    SubLObject pred2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    pred1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    pred2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != negation_predicate.negation_inverseP( pred1, pred2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$negationInverse, ConsesLow.list( pred1, pred2 ) );
        backward.removal_add_node( arguments.make_hl_support( $kw4$NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 1620L)
  public static SubLObject removal_max_negationinverse_cost(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject v_term = el_utilities.literal_arg1( literal, UNPROVIDED );
    if( NIL == forts.fort_p( v_term ) )
    {
      v_term = el_utilities.literal_arg2( literal, UNPROVIDED );
    }
    return cardinality_estimates.genl_cardinality( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 1956L)
  public static SubLObject removal_max_negationinverse_expand(final SubLObject literal, SubLObject sense)
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
    final SubLObject disjoint_terms = cdolist_list_var = negation_predicate.max_negation_inverses( fort, UNPROVIDED );
    SubLObject disjoint_term = NIL;
    disjoint_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( variable, disjoint_term, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject subst_literal = bindings.subst_bindings( v_bindings, literal );
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$negationInverse, el_utilities.literal_args( subst_literal, UNPROVIDED ) );
        backward.removal_add_node( arguments.make_hl_support( $kw4$NEGATIONPREDS, hl_support_formula, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      disjoint_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-negationinverse.lisp", position = 3604L)
  public static SubLObject removal_not_negationinverse_check_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject pred1 = NIL;
    SubLObject pred2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    pred1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    pred2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == negation_predicate.negation_inverseP( pred1, pred2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$negationInverse, ConsesLow.list( pred1, pred2 ) );
        backward.removal_add_node( arguments.make_hl_support( $kw11$MINIMIZE, cycl_utilities.negate( hl_support_formula ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != negation_predicate.not_negation_inverseP( pred1, pred2, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal( $const0$negationInverse, ConsesLow.list( pred1, pred2 ) );
        backward.removal_add_node( arguments.make_hl_support( $kw4$NEGATIONPREDS, cycl_utilities.negate( hl_support_formula ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_negationinverse_file()
  {
    SubLFiles.declareFunction( me, "removal_negationinverse_check_expand", "REMOVAL-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_negationinverse_cost", "REMOVAL-MAX-NEGATIONINVERSE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_max_negationinverse_expand", "REMOVAL-MAX-NEGATIONINVERSE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_negationinverse_check_expand", "REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_negationinverse_file()
  {
    $default_negationinverse_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NEGATIONINVERSE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_not_negationinverse_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_negationinverse_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$negationInverse );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const0$negationInverse );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$negationInverse );
    inference_modules.inference_removal_module( $kw5$REMOVAL_NEGATIONINVERSE_CHECK, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_MAX_NEGATIONINVERSE, $list8 );
    preference_modules.inference_preference_module( $kw9$MAX_NEGATION_INVERSE_POS, $list10 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_NOT_NEGATIONINVERSE_CHECK, $list13 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_negationinverse_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_negationinverse_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_negationinverse_file();
  }
  static
  {
    me = new removal_modules_negationinverse();
    $default_negationinverse_check_cost$ = null;
    $default_not_negationinverse_check_cost$ = null;
    $const0$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $list3 = ConsesLow.list( makeSymbol( "PRED1" ), makeSymbol( "PRED2" ) );
    $kw4$NEGATIONPREDS = makeKeyword( "NEGATIONPREDS" );
    $kw5$REMOVAL_NEGATIONINVERSE_CHECK = makeKeyword( "REMOVAL-NEGATIONINVERSE-CHECK" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-NEGATIONINVERSE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NEGATIONINVERSE-CHECK-EXPAND" )
    } );
    $kw7$REMOVAL_MAX_NEGATIONINVERSE = makeKeyword( "REMOVAL-MAX-NEGATIONINVERSE" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "FORT" ) ) ), makeKeyword( "COST" ), makeSymbol(
                "REMOVAL-MAX-NEGATIONINVERSE-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MAX-NEGATIONINVERSE-EXPAND" )
    } );
    $kw9$MAX_NEGATION_INVERSE_POS = makeKeyword( "MAX-NEGATION-INVERSE-POS" );
    $list10 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
                "GROSSLY-DISPREFERRED" ) );
    $kw11$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw12$REMOVAL_NOT_NEGATIONINVERSE_CHECK = makeKeyword( "REMOVAL-NOT-NEGATIONINVERSE-CHECK" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-NOT-NEGATIONINVERSE-CHECK-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-NEGATIONINVERSE-CHECK-EXPAND" )
    } );
  }
}
/*
 * 
 * Total time: 92 ms
 * 
 */