package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.wordnet;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_wn_direct_denots
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_wn_direct_denots";
  public static final String myFingerPrint = "fd63d6bcc192803354f5543787ece60ae38892a6643de50ab9ddb0d6411d7ac0";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 735L)
  public static SubLSymbol $wn_direct_denots_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 2845L)
  public static SubLSymbol $result_of_wn_direct_denots$;
  private static final SubLObject $const0$termStringsViaWordNet;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$REMOVAL_WN_DIRECT_DENOTS_CHECK_POS;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_WN_DIRECT_DENOTS_POS;
  private static final SubLList $list8;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 895L)
  public static SubLObject string_has_wn_direct_denotP(final SubLObject cyc_term, final SubLObject string)
  {
    final SubLObject result = wordnet.wn_direct_denots_of_string( string, UNPROVIDED );
    return subl_promotions.memberP( cyc_term, result, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 1796L)
  public static SubLObject string_has_wn_direct_denot_negP(final SubLObject cyc_term, final SubLObject string)
  {
    final SubLObject result = wordnet.wn_direct_denots_of_string( string, UNPROVIDED );
    return makeBoolean( NIL == subl_promotions.memberP( cyc_term, result, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 3000L)
  public static SubLObject removal_wn_direct_denots_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    $result_of_wn_direct_denots$.setDynamicValue( wordnet.wn_direct_denots_of_string( string, UNPROVIDED ), thread );
    return Sequences.length( $result_of_wn_direct_denots$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-wn-direct-denots.lisp", position = 3267L)
  public static SubLObject wn_direct_denots_of_string_iterator()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $result_of_wn_direct_denots$.getDynamicValue( thread ) )
    {
      return iteration.new_list_iterator( $result_of_wn_direct_denots$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_wn_direct_denots_file()
  {
    SubLFiles.declareFunction( me, "string_has_wn_direct_denotP", "STRING-HAS-WN-DIRECT-DENOT?", 2, 0, false );
    SubLFiles.declareFunction( me, "string_has_wn_direct_denot_negP", "STRING-HAS-WN-DIRECT-DENOT-NEG?", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_wn_direct_denots_pos_cost", "REMOVAL-WN-DIRECT-DENOTS-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "wn_direct_denots_of_string_iterator", "WN-DIRECT-DENOTS-OF-STRING-ITERATOR", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_wn_direct_denots_file()
  {
    $wn_direct_denots_check_cost$ = SubLFiles.defvar( "*WN-DIRECT-DENOTS-CHECK-COST*", ONE_INTEGER );
    $result_of_wn_direct_denots$ = SubLFiles.defvar( "*RESULT-OF-WN-DIRECT-DENOTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_removal_modules_wn_direct_denots_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$termStringsViaWordNet );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$termStringsViaWordNet, TWO_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$termStringsViaWordNet );
    inference_modules.inference_removal_module( $kw3$REMOVAL_WN_DIRECT_DENOTS_CHECK_POS, $list4 );
    inference_modules.inference_removal_module( $kw5$REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_WN_DIRECT_DENOTS_POS, $list8 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_wn_direct_denots_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_wn_direct_denots_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_wn_direct_denots_file();
  }
  static
  {
    me = new removal_modules_wn_direct_denots();
    $wn_direct_denots_check_cost$ = null;
    $result_of_wn_direct_denots$ = null;
    $const0$termStringsViaWordNet = constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$REMOVAL_WN_DIRECT_DENOTS_CHECK_POS = makeKeyword( "REMOVAL-WN-DIRECT-DENOTS-CHECK-POS" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*WN-DIRECT-DENOTS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STRING-HAS-WN-DIRECT-DENOT?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list(
          makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$termStringsViaWordNet <fully-bound> <string>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$termStringsViaWordNet #$AnimalWalkingProcess \"walk\")" )
    } );
    $kw5$REMOVAL_WN_DIRECT_DENOTS_CHECK_NEG = makeKeyword( "REMOVAL-WN-DIRECT-DENOTS-CHECK-NEG" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*WN-DIRECT-DENOTS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STRING-HAS-WN-DIRECT-DENOT-NEG?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYC-TERM" ) ), ConsesLow.list(
          makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$termStringsViaWordNet <fully-bound> <string>))" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$not (#$termStringsViaWordNet #$AnimalWalkingProcess \"rooster\"))" )
    } );
    $kw7$REMOVAL_WN_DIRECT_DENOTS_POS = makeKeyword( "REMOVAL-WN-DIRECT-DENOTS-POS" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-WN-DIRECT-DENOTS-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list(
              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "WN-DIRECT-DENOTS-OF-STRING-ITERATOR" ) ),
      makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStringsViaWordNet" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ),
          makeSymbol( "STRING" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$termStringsViaWordNet <not-fully-bound> <string>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$termStringsViaWordNet ?X \"walk\")\n    (#$termStringsViaWordNet (#$JuvenileFn ?X) \"puppy\")" )
    } );
  }
}
/*
 * 
 * Total time: 79 ms
 * 
 */