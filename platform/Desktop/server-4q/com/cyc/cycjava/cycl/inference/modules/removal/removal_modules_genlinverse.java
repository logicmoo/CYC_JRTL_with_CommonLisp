package com.cyc.cycjava.cycl.inference.modules.removal;

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

public final class removal_modules_genlinverse
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlinverse";
  public static final String myFingerPrint = "3a30f363df17cbac5a8369fc81aaff29702eff50f806dfce2067532dae017ba7";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 531L)
  private static SubLSymbol $default_genlinverse_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 3577L)
  private static SubLSymbol $default_not_genlinverse_check_cost$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$GENLPREDS;
  private static final SubLSymbol $kw2$REMOVAL_GENLINVERSE_CHECK;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_ALL_GENL_INVERSES;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_ALL_SPEC_INVERSES;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$MINIMIZE;
  private static final SubLSymbol $kw9$REMOVAL_NOT_GENLINVERSE_CHECK;
  private static final SubLList $list10;
  private static final SubLObject $const11$genlInverse;
  private static final SubLSymbol $kw12$NEG;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 702L)
  public static SubLObject removal_genlinverse_check_expand(final SubLObject asent, SubLObject sense)
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
      if( NIL != genl_predicates.genl_inverseP( spec_pred, genl_pred, UNPROVIDED, UNPROVIDED ) )
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 1286L)
  public static SubLObject removal_all_genl_inverses_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cardinality_estimates.genl_cardinality( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 1523L)
  public static SubLObject removal_all_genl_inverses_iterator(final SubLObject spec_pred)
  {
    return iteration.new_list_iterator( genl_predicates.all_genl_inverses( spec_pred, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 2438L)
  public static SubLObject removal_all_spec_inverses_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cardinality_estimates.spec_cardinality( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 2675L)
  public static SubLObject removal_all_spec_inverses_iterator(final SubLObject genl_pred)
  {
    return iteration.new_list_iterator( genl_predicates.all_spec_inverses( genl_pred, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlinverse.lisp", position = 3743L)
  public static SubLObject removal_not_genlinverse_check_expand(final SubLObject asent, SubLObject sense)
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
      if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == genl_predicates.genl_inverseP( spec_pred, genl_pred, UNPROVIDED, UNPROVIDED ) )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw8$MINIMIZE, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != genl_predicates.not_genl_inverseP( spec_pred, genl_pred, UNPROVIDED, UNPROVIDED ) )
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

  public static SubLObject declare_removal_modules_genlinverse_file()
  {
    SubLFiles.declareFunction( me, "removal_genlinverse_check_expand", "REMOVAL-GENLINVERSE-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_genl_inverses_cost", "REMOVAL-ALL-GENL-INVERSES-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_genl_inverses_iterator", "REMOVAL-ALL-GENL-INVERSES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_spec_inverses_cost", "REMOVAL-ALL-SPEC-INVERSES-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_spec_inverses_iterator", "REMOVAL-ALL-SPEC-INVERSES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_genlinverse_check_expand", "REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_genlinverse_file()
  {
    $default_genlinverse_check_cost$ = SubLFiles.defparameter( "*DEFAULT-GENLINVERSE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_not_genlinverse_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-GENLINVERSE-CHECK-COST*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_genlinverse_file()
  {
    inference_modules.inference_removal_module( $kw2$REMOVAL_GENLINVERSE_CHECK, $list3 );
    inference_modules.inference_removal_module( $kw4$REMOVAL_ALL_GENL_INVERSES, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_ALL_SPEC_INVERSES, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_NOT_GENLINVERSE_CHECK, $list10 );
    inference_modules.register_solely_specific_removal_module_predicate( $const11$genlInverse );
    preference_modules.doomed_unless_all_args_bindable( $kw12$NEG, $const11$genlInverse );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_genlinverse_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_genlinverse_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_genlinverse_file();
  }
  static
  {
    me = new removal_modules_genlinverse();
    $default_genlinverse_check_cost$ = null;
    $default_not_genlinverse_check_cost$ = null;
    $list0 = ConsesLow.list( makeSymbol( "SPEC-PRED" ), makeSymbol( "GENL-PRED" ) );
    $kw1$GENLPREDS = makeKeyword( "GENLPREDS" );
    $kw2$REMOVAL_GENLINVERSE_CHECK = makeKeyword( "REMOVAL-GENLINVERSE-CHECK" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "PREDICATE-FORT" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GENLINVERSE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-GENLINVERSE-CHECK-EXPAND" )
    } );
    $kw4$REMOVAL_ALL_GENL_INVERSES = makeKeyword( "REMOVAL-ALL-GENL-INVERSES" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ALL-GENL-INVERSES-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "genlInverse" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SPEC-PRED" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SPEC-PRED" ) ) ), makeKeyword(
                    "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-GENL-INVERSES-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
                        .list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SPEC-PRED" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                            "SUPPORT-MODULE" ), makeKeyword( "GENLPREDS" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$genlInverse <predicate-fort> <variable>" ), makeKeyword( "EXAMPLE" ), makeString( "(#$genlInverse #$geographicalSubRegions ?WHAT)" )
    } );
    $kw6$REMOVAL_ALL_SPEC_INVERSES = makeKeyword( "REMOVAL-ALL-SPEC-INVERSES" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "PREDICATE-FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-ALL-SPEC-INVERSES-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "genlInverse" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GENL-PRED" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GENL-PRED" ) ) ), makeKeyword(
                    "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-SPEC-INVERSES-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
                        .list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GENL-PRED" ) ) ), makeKeyword(
                            "SUPPORT-MODULE" ), makeKeyword( "GENLPREDS" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "DEFAULT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$genlInverse <variable> <predicate-fort>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$genlInverse ?WHAT #$inRegion)" )
    } );
    $kw8$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw9$REMOVAL_NOT_GENLINVERSE_CHECK = makeKeyword( "REMOVAL-NOT-GENLINVERSE-CHECK" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeKeyword( "PREDICATE-FORT" ), makeKeyword( "PREDICATE-FORT" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-GENLINVERSE-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-GENLINVERSE-CHECK-EXPAND" )
    } );
    $const11$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $kw12$NEG = makeKeyword( "NEG" );
  }
}
/*
 * 
 * Total time: 86 ms
 * 
 */