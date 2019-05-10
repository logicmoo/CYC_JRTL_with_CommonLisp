package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_kappa
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa";
  public static final String myFingerPrint = "702d667b7e8dc79777041fdc0fdec92c35fd8f52e36327441e10d9db405d554b";
  private static final SubLSymbol $kw0$REMOVAL_KAPPA;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$REMOVAL_KAPPA_POS;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$POS;
  private static final SubLSymbol $kw5$INCOMPLETE;
  private static final SubLSymbol $kw6$GROSSLY_DISPREFERRED;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$MAKE_VARIABLE_BINDING;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 1359L)
  public static SubLObject removal_kappa_pos_gaf_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject expression_query = kappa_expression_query( asent );
    SubLObject cost = ( NIL != el_utilities.atomic_sentenceP( expression_query ) ) ? inference_utilities.literal_removal_cost( expression_query, $kw4$POS, UNPROVIDED, UNPROVIDED )
        : control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
    if( !cost.isZero() )
    {
      cost = Numbers.add( cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue( thread ) );
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 1739L)
  public static SubLObject removal_kappa_pos_gaf_completeness(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject expression_query = kappa_expression_query( asent );
    final SubLObject completeness = ( NIL != el_utilities.atomic_sentenceP( expression_query ) ) ? inference_utilities.literal_removal_completeness( expression_query, $kw4$POS, UNPROVIDED ) : $kw5$INCOMPLETE;
    return completeness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2055L)
  public static SubLObject removal_kappa_pos_gaf_preference_level(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject expression_query = kappa_expression_query( asent );
    final SubLObject preference_level = ( NIL != el_utilities.atomic_sentenceP( expression_query ) ) ? inference_utilities.literal_removal_preference_level( expression_query, $kw4$POS, bindable_vars, UNPROVIDED,
        UNPROVIDED ) : $kw6$GROSSLY_DISPREFERRED;
    return preference_level;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2433L)
  public static SubLObject removal_kappa_expand(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject regular_query = kappa_expression_query( asent );
    final SubLObject variable_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = ask_utilities.kappa_tuples_justified( variable_bindings, regular_query, inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED );
    SubLObject bindings_and_supports = NIL;
    bindings_and_supports = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_and_supports;
      SubLObject v_bindings = NIL;
      SubLObject supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
      supports = current.first();
      current = current.rest();
      if( NIL == current )
      {
        backward.removal_add_node( supports.first(), bindings.apply_bindings( variable_bindings, v_bindings ), supports.rest() );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_and_supports = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2915L)
  public static SubLObject kappa_expression_query(final SubLObject asent)
  {
    final SubLObject kappa_expression = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject formal_args = el_utilities.kappa_predicate_formal_args( kappa_expression );
    final SubLObject kappa_query = el_utilities.kappa_predicate_query( kappa_expression );
    final SubLObject args = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    final SubLObject formal_argument_bindings = Mapping.mapcar( Symbols.symbol_function( $sym8$MAKE_VARIABLE_BINDING ), formal_args, new SubLObject[] { args
    } );
    final SubLObject regular_query = bindings.apply_bindings( formal_argument_bindings, kappa_query );
    final SubLObject variable_bindings = remove_bindings_to_ground_terms( formal_argument_bindings );
    return Values.values( regular_query, variable_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 3472L)
  public static SubLObject remove_bindings_to_ground_terms(final SubLObject v_bindings)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == el_utilities.groundP( bindings.variable_binding_value( binding ), UNPROVIDED ) )
      {
        result = ConsesLow.cons( binding, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return result;
  }

  public static SubLObject declare_removal_modules_kappa_file()
  {
    SubLFiles.declareFunction( me, "removal_kappa_pos_gaf_cost", "REMOVAL-KAPPA-POS-GAF-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_kappa_pos_gaf_completeness", "REMOVAL-KAPPA-POS-GAF-COMPLETENESS", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_kappa_pos_gaf_preference_level", "REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_kappa_expand", "REMOVAL-KAPPA-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "kappa_expression_query", "KAPPA-EXPRESSION-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_bindings_to_ground_terms", "REMOVE-BINDINGS-TO-GROUND-TERMS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_kappa_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_kappa_file()
  {
    inference_modules.inference_removal_module( $kw0$REMOVAL_KAPPA, $list1 );
    preference_modules.inference_preference_module( $kw2$REMOVAL_KAPPA_POS, $list3 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_kappa_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_kappa_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_kappa_file();
  }
  static
  {
    me = new removal_modules_kappa();
    $kw0$REMOVAL_KAPPA = makeKeyword( "REMOVAL-KAPPA" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "KAPPA-PREDICATE-P" ) ),
        makeKeyword( "ANYTHING" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-KAPPA-POS-GAF-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
            "REMOVAL-KAPPA-POS-GAF-COMPLETENESS" ), makeKeyword( "INPUT" ), makeKeyword( "POS" ) ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-KAPPA-EXPAND" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ),
      makeKeyword( "SUPPLANTS" ), makeKeyword( "ALL" ), makeKeyword( "DOCUMENTATION" ), makeString( "((#$Kappa <formal-args> <sentence>) <args>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "((#$Kappa (?X ?Y) (#$isa ?X ?Y)) #$Guyren ?WHAT)" )
    } );
    $kw2$REMOVAL_KAPPA_POS = makeKeyword( "REMOVAL-KAPPA-POS" );
    $list3 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "KAPPA-PREDICATE-P" ) ), makeKeyword(
        "ANYTHING" ) ), makeKeyword( "PREFERENCE" ), makeSymbol( "REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL" ) );
    $kw4$POS = makeKeyword( "POS" );
    $kw5$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw6$GROSSLY_DISPREFERRED = makeKeyword( "GROSSLY-DISPREFERRED" );
    $list7 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $sym8$MAKE_VARIABLE_BINDING = makeSymbol( "MAKE-VARIABLE-BINDING" );
  }
}
/*
 * 
 * Total time: 79 ms
 * 
 */