package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_extent_cardinality
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_extent_cardinality";
  public static final String myFingerPrint = "32c5bc8bac82b488fb9c91d7ce418c392195ed24ef56c3e082388ebd7f69e93a";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 1314L)
  private static SubLSymbol $default_removal_extent_cardinality_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 9887L)
  public static SubLSymbol $length_of_list_defining_mt$;
  private static final SubLObject $const0$extentCardinality;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$HL;
  private static final SubLObject $const4$TheCollectionOf;
  private static final SubLObject $const5$TheEmptySet;
  private static final SubLSymbol $kw6$REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$UNEVALUATABLE;
  private static final SubLSymbol $kw9$REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$REMOVAL_EXTENT_CARDINALITY_THESET;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$REMOVAL_EXTENT_CARDINALITY_THESETOF;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$_LENGTH_OF_LIST_DEFINING_MT_;
  private static final SubLObject $const24$BaseKB;
  private static final SubLObject $const25$lengthOfList;
  private static final SubLSymbol $sym26$INTEGERP;
  private static final SubLSymbol $kw27$REMOVAL_LENGTH_OF_THELIST_CHECK_POS;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$REMOVAL_LENGTH_OF_THELIST_CHECK_NEG;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$REMOVAL_LENGTH_OF_THELIST_GENERATE;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_LENGTH_OF_THELIST_PRUNE;
  private static final SubLList $list34;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 954L)
  public static SubLObject removal_extent_cardinality_set(final SubLObject v_set)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject extent = quantities.set_extent( v_set, mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw3$HL );
    return Sequences.length( extent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 1081L)
  public static SubLObject removal_extent_cardinality_collection(final SubLObject col)
  {
    if( NIL != el_utilities.possibly_nat_p( col ) && $const4$TheCollectionOf.eql( cycl_utilities.nat_functor( col ) ) )
    {
      return Sequences.length( ask_utilities.the_set_of_elements( col, UNPROVIDED, UNPROVIDED ) );
    }
    return isa.count_all_instances( col, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 1411L)
  public static SubLObject removal_fort_extent_cardinality(final SubLObject v_set)
  {
    if( NIL != forts.fort_p( v_set ) )
    {
      if( $const5$TheEmptySet.eql( v_set ) )
      {
        return removal_extent_cardinality_set( v_set );
      }
      if( NIL != fort_types_interface.collectionP( v_set ) )
      {
        return removal_extent_cardinality_collection( v_set );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 2536L)
  public static SubLObject fort_has_extent_cardinalityP(final SubLObject v_set, final SubLObject cardinality)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject catch_this = NIL;
    try
    {
      thread.throwStack.push( $kw8$UNEVALUATABLE );
      if( NIL != forts.fort_p( v_set ) )
      {
        final SubLObject number = quantities.cycl_real_number_to_number( cardinality );
        if( NIL != subl_promotions.non_negative_integer_p( number ) )
        {
          if( $const5$TheEmptySet.eql( v_set ) )
          {
            result = Numbers.zerop( number );
          }
          else if( NIL != fort_types_interface.collectionP( v_set ) )
          {
            result = isa.count_all_instances_E( v_set, number, UNPROVIDED, UNPROVIDED );
          }
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_this = Errors.handleThrowable( ccatch_env_var, $kw8$UNEVALUATABLE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 10178L)
  public static SubLObject el_list_lengthE(final SubLObject el_list, final SubLObject integer)
  {
    assert NIL != Types.integerp( integer ) : integer;
    return Numbers.numE( el_utilities.el_list_length( el_list ), integer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 10502L)
  public static SubLObject removal_el_list_lengthE(final SubLObject el_list, final SubLObject integer)
  {
    return makeBoolean( NIL != el_utilities.el_list_p( el_list ) && NIL != subl_promotions.non_negative_integer_p( integer ) && NIL != el_list_lengthE( el_list, integer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-extent-cardinality.lisp", position = 14027L)
  public static SubLObject removal_length_of_the_list_prune(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject el_list = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject length = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return makeBoolean( NIL == removal_el_list_lengthE( el_list, length ) );
  }

  public static SubLObject declare_removal_modules_extent_cardinality_file()
  {
    SubLFiles.declareFunction( me, "removal_extent_cardinality_set", "REMOVAL-EXTENT-CARDINALITY-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_extent_cardinality_collection", "REMOVAL-EXTENT-CARDINALITY-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_fort_extent_cardinality", "REMOVAL-FORT-EXTENT-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_has_extent_cardinalityP", "FORT-HAS-EXTENT-CARDINALITY?", 2, 0, false );
    SubLFiles.declareFunction( me, "el_list_lengthE", "EL-LIST-LENGTH=", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_el_list_lengthE", "REMOVAL-EL-LIST-LENGTH=", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_length_of_the_list_prune", "REMOVAL-LENGTH-OF-THE-LIST-PRUNE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_extent_cardinality_file()
  {
    $default_removal_extent_cardinality_cost$ = SubLFiles.deflexical( "*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    $length_of_list_defining_mt$ = SubLFiles.deflexical( "*LENGTH-OF-LIST-DEFINING-MT*", maybeDefault( $sym23$_LENGTH_OF_LIST_DEFINING_MT_, $length_of_list_defining_mt$, $const24$BaseKB ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_extent_cardinality_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$extentCardinality );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$extentCardinality, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$extentCardinality );
    inference_modules.inference_removal_module( $kw6$REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG, $list12 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_EXTENT_CARDINALITY_THESET, $list14 );
    inference_modules.inference_removal_module( $kw15$REMOVAL_EXTENT_CARDINALITY_THESETOF, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF, $list18 );
    inference_modules.inference_removal_module( $kw19$REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION, $list20 );
    inference_modules.inference_removal_module( $kw21$REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM, $list22 );
    subl_macro_promotions.declare_defglobal( $sym23$_LENGTH_OF_LIST_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym23$_LENGTH_OF_LIST_DEFINING_MT_, $const25$lengthOfList );
    inference_modules.inference_removal_module( $kw27$REMOVAL_LENGTH_OF_THELIST_CHECK_POS, $list28 );
    inference_modules.inference_removal_module( $kw29$REMOVAL_LENGTH_OF_THELIST_CHECK_NEG, $list30 );
    inference_modules.inference_removal_module( $kw31$REMOVAL_LENGTH_OF_THELIST_GENERATE, $list32 );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const25$lengthOfList, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const25$lengthOfList );
    inference_modules.inference_removal_module( $kw33$REMOVAL_LENGTH_OF_THELIST_PRUNE, $list34 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_extent_cardinality_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_extent_cardinality_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_extent_cardinality_file();
  }
  static
  {
    me = new removal_modules_extent_cardinality();
    $default_removal_extent_cardinality_cost$ = null;
    $length_of_list_defining_mt$ = null;
    $const0$extentCardinality = constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$HL = makeKeyword( "HL" );
    $const4$TheCollectionOf = constant_handles.reader_make_constant_shell( makeString( "TheCollectionOf" ) );
    $const5$TheEmptySet = constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) );
    $kw6$REMOVAL_EXTENT_CARDINALITY_FORT_GENERATE = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "SET" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "REMOVAL-FORT-EXTENT-CARDINALITY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "extentCardinality" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$extentCardinality <fort> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$extentCardinality #$MonthOfYearType ?COUNT)" )
    } );
    $kw8$UNEVALUATABLE = makeKeyword( "UNEVALUATABLE" );
    $kw9$REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_POS = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CARDINALITY" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CARDINALITY" ) ) ) ), makeKeyword(
                  "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "SET" ), makeSymbol( "CARDINALITY" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "FORT-HAS-EXTENT-CARDINALITY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CARDINALITY" ) ) ) ), makeKeyword(
                          "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$extentCardinality <fort> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$extentCardinality #$MonthOfYearType 12)" )
    } );
    $kw11$REMOVAL_EXTENT_CARDINALITY_FORT_CHECK_NEG = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-NEG" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-REMOVAL-EXTENT-CARDINALITY-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CARDINALITY" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CARDINALITY" ) ) ) ), makeKeyword(
                  "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "SET" ), makeSymbol( "CARDINALITY" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORT-HAS-EXTENT-CARDINALITY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list(
                          makeKeyword( "VALUE" ), makeSymbol( "CARDINALITY" ) ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                              "(#$not (#$extentCardinality <fort> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$extentCardinality #$MonthOfYearType 14))" )
    } );
    $kw13$REMOVAL_EXTENT_CARDINALITY_THESET = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-THESET" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ),
            makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "SET" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
              makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-EXTENT-CARDINALITY-SET" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
          "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$extentCardinality (#$TheSet . <fully-bound>) <whatever>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$extentCardinality (#$TheSet #$Andorra #$France #$Portugal) ?COUNT)" )
    } );
    $kw15$REMOVAL_EXTENT_CARDINALITY_THESETOF = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-THESETOF" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow
              .list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-EXTENT-CARDINALITY-SET" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
                  "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ),
                      makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$extentCardinality (#$TheSetOf <variable> <closed except for variable>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$extentCardinality \n      (#$TheSetOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)" )
    } );
    $kw17$REMOVAL_EXTENT_CARDINALITY_THECOLLECTIONOF = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-THECOLLECTIONOF" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "TheCollectionOf" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ),
      makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE" ), makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
          "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
                  makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list(
                      makeKeyword( "CALL" ), makeSymbol( "REMOVAL-EXTENT-CARDINALITY-COLLECTION" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "extentCardinality" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$extentCardinality (#$TheCollectionOf <variable> <closed except for variable>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$extentCardinality \n      (#$TheCollectionOf ?COUNTRY\n        (#$and\n          (#$isa ?COUNTRY #$Country)\n          (#$politiesBorderEachOther #$Spain ?COUNTRY)))\n      ?COUNT)" )
    } );
    $kw19$REMOVAL_EXTENT_CARDINALITY_CYCLASSERTION = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-CYCLASSERTION" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), constant_handles.reader_make_constant_shell( makeString( "CycLAssertion" ) ), makeKeyword(
            "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ),
      makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE" ), makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-COUNT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), constant_handles.reader_make_constant_shell( makeString( "CycLAssertion" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
              "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$extentCardinality #$CycLAssertion <whatever>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$extentCardinality #$CycLAssertion ?COUNT)" )
    } );
    $kw21$REMOVAL_EXTENT_CARDINALITY_CYCLREIFIEDDENOTATIONALTERM = makeKeyword( "REMOVAL-EXTENT-CARDINALITY-CYCLREIFIEDDENOTATIONALTERM" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), constant_handles.reader_make_constant_shell( makeString( "CycLReifiedDenotationalTerm" ) ),
            makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXCLUSIVE" ), makeSymbol(
                "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-GENERATE" ), makeKeyword( "REMOVAL-EXTENT-CARDINALITY-FORT-CHECK-POS" ) ), makeKeyword(
                    "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORT-COUNT" ) ) ), makeKeyword(
                        "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), constant_handles.reader_make_constant_shell( makeString(
                            "CycLReifiedDenotationalTerm" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                                "DOCUMENTATION" ), makeString( "(#$extentCardinality #$CycLReifiedDenotationalTerm <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$extentCardinality #$CycLReifiedDenotationalTerm ?COUNT)" )
    } );
    $sym23$_LENGTH_OF_LIST_DEFINING_MT_ = makeSymbol( "*LENGTH-OF-LIST-DEFINING-MT*" );
    $const24$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const25$lengthOfList = constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) );
    $sym26$INTEGERP = makeSymbol( "INTEGERP" );
    $kw27$REMOVAL_LENGTH_OF_THELIST_CHECK_POS = makeKeyword( "REMOVAL-LENGTH-OF-THELIST-CHECK-POS" );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-LIST-P" ) ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                        "LENGTH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LENGTH" ) ) ) ), makeKeyword(
                            "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LENGTH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "REMOVAL-EL-LIST-LENGTH=" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LENGTH" ) ) ) ), makeKeyword(
                                    "SUPPORT-MT" ), makeSymbol( "*LENGTH-OF-LIST-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                        "(#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                            "(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 3)\n    (#$lengthOfList (#$TheList) 0)\n    (#$lengthOfList #$TheEmptyList 0)" )
    } );
    $kw29$REMOVAL_LENGTH_OF_THELIST_CHECK_NEG = makeKeyword( "REMOVAL-LENGTH-OF-THELIST-CHECK-NEG" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-LIST-P" ) ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                        "LENGTH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LIST" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LENGTH" ) ) ) ), makeKeyword(
                            "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LENGTH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-EL-LIST-LENGTH=" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LIST" ) ), ConsesLow.list(
                                    makeKeyword( "VALUE" ), makeSymbol( "LENGTH" ) ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*LENGTH-OF-LIST-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                        "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$not (#$lengthOfList (#$TheList . <fully-bound>) <fully-bound>)) or\n    (#$not (#$lengthOfList #$TheEmptyList <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$not (#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) 1))\n    (#$not (#$lengthOfList (#$TheList) 1))\n    (#$not (#$lengthOfList #$TheEmptyList 1))" )
    } );
    $kw31$REMOVAL_LENGTH_OF_THELIST_GENERATE = makeKeyword( "REMOVAL-LENGTH-OF-THELIST-GENERATE" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-LIST-P" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "lengthOfList" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LIST" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LIST" ) ) ), makeKeyword(
                        "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EL-LIST-LENGTH" ), makeKeyword(
                            "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "LIST" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*LENGTH-OF-LIST-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$lengthOfList (#$TheList . <fully-bound>) <not-fully-bound>) or\n    (#$lengthOfList #$TheEmptyList <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$lengthOfList (#$TheList #$Andorra #$France #$Portugal) ?COUNT)\n    (#$lengthOfList (#$TheList) ?COUNT)\n    (#$lengthOfList #$TheEmptyList ?COUNT)" )
    } );
    $kw33$REMOVAL_LENGTH_OF_THELIST_PRUNE = makeKeyword( "REMOVAL-LENGTH-OF-THELIST-PRUNE" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lengthOfList" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheList" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "PROPER-LIST-P" ) ) ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-LENGTH-OF-THE-LIST-PRUNE" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "pruning module that handles\n    (#$lengthOfList (#$TheList . <not fully-bound>) <fully-bound>) \n    where the length in ARG2 does not match the list in ARG1" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$lengthOfList (#$TheList #$isa ?X) 1)" )
    } );
  }
}
/*
 * 
 * Total time: 174 ms
 * 
 */