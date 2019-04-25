package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_genlpreds
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds";
  public static final String myFingerPrint = "fb566c69ffa4a5fd606d82e4c1773f9db984b3714a0bffad324c0f512a415e0b";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 525L)
  private static SubLSymbol $default_genlpreds_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3452L)
  private static SubLSymbol $default_not_genlpreds_check_cost$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$GENLPREDS;
  private static final SubLSymbol $kw2$REMOVAL_GENLPREDS_CHECK;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_ALL_GENLPREDS;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_ALL_SPEC_PREDS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$MINIMIZE;
  private static final SubLSymbol $kw9$REMOVAL_NOT_GENLPREDS_CHECK;
  private static final SubLList $list10;
  private static final SubLObject $const11$genlPreds;
  private static final SubLSymbol $kw12$POS;
  private static final SubLSymbol $kw13$NEG;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 688L)
  public static SubLObject removal_genlpreds_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject spec_pred = NIL;
    SubLObject genl_pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    spec_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    genl_pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != genl_predicates.genl_predP( spec_pred, genl_pred, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw1$GENLPREDS, asent, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 1251L)
  public static SubLObject removal_all_genlpreds_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cardinality_estimates.genl_cardinality( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 1472L)
  public static SubLObject removal_all_genlpreds_iterator(final SubLObject spec_pred)
  {
    return iteration.new_list_iterator( genl_predicates.all_genl_preds( spec_pred, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 2349L)
  public static SubLObject removal_all_spec_preds_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cardinality_estimates.spec_cardinality( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 2574L)
  public static SubLObject removal_all_spec_preds_iterator(final SubLObject genl_pred)
  {
    return iteration.new_list_iterator( genl_predicates.all_spec_preds( genl_pred, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3610L)
  public static SubLObject removal_not_genlpreds_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject spec_pred = NIL;
    SubLObject genl_pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    spec_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    genl_pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == genl_predicates.genl_predP( spec_pred, genl_pred, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw8$MINIMIZE, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != genl_predicates.not_genl_predP( spec_pred, genl_pred, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw1$GENLPREDS, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_genlpreds_file()
  {
    SubLFiles.declareFunction( me, "removal_genlpreds_check_expand", "REMOVAL-GENLPREDS-CHECK-EXPAND", 1, 1, false );
    new $removal_genlpreds_check_expand$UnaryFunction();
    new $removal_genlpreds_check_expand$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_all_genlpreds_cost", "REMOVAL-ALL-GENLPREDS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_genlpreds_iterator", "REMOVAL-ALL-GENLPREDS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_spec_preds_cost", "REMOVAL-ALL-SPEC-PREDS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_spec_preds_iterator", "REMOVAL-ALL-SPEC-PREDS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_genlpreds_check_expand", "REMOVAL-NOT-GENLPREDS-CHECK-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_genlpreds_file()
  {
    $default_genlpreds_check_cost$ = SubLFiles.defparameter( "*DEFAULT-GENLPREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_not_genlpreds_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-GENLPREDS-CHECK-COST*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_genlpreds_file()
  {
    inference_modules.inference_removal_module( $kw2$REMOVAL_GENLPREDS_CHECK, $list3 );
    inference_modules.inference_removal_module( $kw4$REMOVAL_ALL_GENLPREDS, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_ALL_SPEC_PREDS, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_NOT_GENLPREDS_CHECK, $list10 );
    inference_modules.register_solely_specific_removal_module_predicate( $const11$genlPreds );
    preference_modules.doomed_unless_either_arg_bindable( $kw12$POS, $const11$genlPreds );
    preference_modules.doomed_unless_all_args_bindable( $kw13$NEG, $const11$genlPreds );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_genlpreds_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_genlpreds_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_genlpreds_file();
  }
  static
  {
    me = new removal_modules_genlpreds();
    $default_genlpreds_check_cost$ = null;
    $default_not_genlpreds_check_cost$ = null;
    $list0 = ConsesLow.list( makeSymbol( "SPEC-PRED" ), makeSymbol( "GENL-PRED" ) );
    $kw1$GENLPREDS = makeKeyword( "GENLPREDS" );
    $kw2$REMOVAL_GENLPREDS_CHECK = makeKeyword( "REMOVAL-GENLPREDS-CHECK" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "PREDICATE-FORT" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GENLPREDS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-GENLPREDS-CHECK-EXPAND" )
    } );
    $kw4$REMOVAL_ALL_GENLPREDS = makeKeyword( "REMOVAL-ALL-GENLPREDS" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ALL-GENLPREDS-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ),
                ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SPEC-PRED" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SPEC-PRED" ) ) ), makeKeyword(
                    "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-GENLPREDS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SPEC-PRED" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                            "SUPPORT-MODULE" ), makeKeyword( "GENLPREDS" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$genlPreds <predicate-fort> <variable>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$genlPreds #$performedBy ?WHAT)" )
    } );
    $kw6$REMOVAL_ALL_SPEC_PREDS = makeKeyword( "REMOVAL-ALL-SPEC-PREDS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "PREDICATE-FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ALL-SPEC-PREDS-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ),
                makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GENL-PRED" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GENL-PRED" ) ) ), makeKeyword(
                    "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-SPEC-PREDS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
                        .list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GENL-PRED" ) ) ), makeKeyword(
                            "SUPPORT-MODULE" ), makeKeyword( "GENLPREDS" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$genlPreds <variable> <predicate-fort>" ), makeKeyword( "EXAMPLE" ), makeString( "(#$genlPreds ?WHAT #$performedBy)" )
    } );
    $kw8$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw9$REMOVAL_NOT_GENLPREDS_CHECK = makeKeyword( "REMOVAL-NOT-GENLPREDS-CHECK" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "PREDICATE-FORT" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-GENLPREDS-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-GENLPREDS-CHECK-EXPAND" )
    } );
    $const11$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw12$POS = makeKeyword( "POS" );
    $kw13$NEG = makeKeyword( "NEG" );
  }

  public static final class $removal_genlpreds_check_expand$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_genlpreds_check_expand$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-CHECK-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_genlpreds_check_expand( arg1, $removal_genlpreds_check_expand$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_genlpreds_check_expand$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_genlpreds_check_expand$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-CHECK-EXPAND" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_genlpreds_check_expand( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 89 ms
 * 
 */