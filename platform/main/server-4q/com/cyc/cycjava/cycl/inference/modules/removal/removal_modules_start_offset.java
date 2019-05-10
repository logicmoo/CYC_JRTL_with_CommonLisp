package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_start_offset
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset";
  public static final String myFingerPrint = "8b1870ef90c82e8c15c150b66ddf7099a0f1137297f42360f41b9252f14ad7c4";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 519L)
  private static SubLSymbol $start_offset_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 2669L)
  private static SubLSymbol $start_offset_unify_cost$;
  private static final SubLSymbol $sym0$_START_OFFSET_CHECK_COST_;
  private static final SubLSymbol $kw1$REMOVAL_START_OFFSET_CHECK_POS;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$REMOVAL_START_OFFSET_CHECK_NEG;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_START_OFFSET_UNIFY_COST_;
  private static final SubLSymbol $kw6$REMOVAL_START_OFFSET_UNIFY_ARG3_POS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$REMOVAL_START_OFFSET_DELAY;
  private static final SubLList $list9;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 682L)
  public static SubLObject string_has_offsetP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset)
  {
    return string_utilities.starts_with( string_utilities.substring( big_string, offset, UNPROVIDED ), little_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 1607L)
  public static SubLObject string_has_offset_negP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset)
  {
    return makeBoolean( NIL == string_has_offsetP( big_string, little_string, offset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 3642L)
  public static SubLObject start_offset_of_string_iterator(final SubLObject big_string, final SubLObject little_string)
  {
    return string_utilities.search_all( little_string, big_string, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  public static SubLObject declare_removal_modules_start_offset_file()
  {
    SubLFiles.declareFunction( me, "string_has_offsetP", "STRING-HAS-OFFSET?", 3, 0, false );
    SubLFiles.declareFunction( me, "string_has_offset_negP", "STRING-HAS-OFFSET-NEG?", 3, 0, false );
    SubLFiles.declareFunction( me, "start_offset_of_string_iterator", "START-OFFSET-OF-STRING-ITERATOR", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_start_offset_file()
  {
    $start_offset_check_cost$ = SubLFiles.deflexical( "*START-OFFSET-CHECK-COST*", ( maybeDefault( $sym0$_START_OFFSET_CHECK_COST_, $start_offset_check_cost$, ONE_INTEGER ) ) );
    $start_offset_unify_cost$ = SubLFiles.deflexical( "*START-OFFSET-UNIFY-COST*", ( maybeDefault( $sym5$_START_OFFSET_UNIFY_COST_, $start_offset_unify_cost$, ONE_INTEGER ) ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_start_offset_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_START_OFFSET_CHECK_COST_ );
    inference_modules.inference_removal_module( $kw1$REMOVAL_START_OFFSET_CHECK_POS, $list2 );
    inference_modules.inference_removal_module( $kw3$REMOVAL_START_OFFSET_CHECK_NEG, $list4 );
    subl_macro_promotions.declare_defglobal( $sym5$_START_OFFSET_UNIFY_COST_ );
    inference_modules.inference_removal_module( $kw6$REMOVAL_START_OFFSET_UNIFY_ARG3_POS, $list7 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_START_OFFSET_DELAY, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_start_offset_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_start_offset_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_start_offset_file();
  }
  static
  {
    me = new removal_modules_start_offset();
    $start_offset_check_cost$ = null;
    $start_offset_unify_cost$ = null;
    $sym0$_START_OFFSET_CHECK_COST_ = makeSymbol( "*START-OFFSET-CHECK-COST*" );
    $kw1$REMOVAL_START_OFFSET_CHECK_POS = makeKeyword( "REMOVAL-START-OFFSET-CHECK-POS" );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*START-OFFSET-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OFFSET" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow
                        .list( makeKeyword( "VALUE" ), makeSymbol( "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OFFSET" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "STRING-HAS-OFFSET?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OFFSET" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$startOffset <string> <string> <fully-bound>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$startOffset \"food\" \"foo\" 0)" )
    } );
    $kw3$REMOVAL_START_OFFSET_CHECK_NEG = makeKeyword( "REMOVAL-START-OFFSET-CHECK-NEG" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*START-OFFSET-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OFFSET" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow
                        .list( makeKeyword( "VALUE" ), makeSymbol( "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OFFSET" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "STRING-HAS-OFFSET-NEG?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OFFSET" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                    "(#$not (#$startOffset <string> <string> <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$startOffset \"foo\" \"bar\" 0))" )
    } );
    $sym5$_START_OFFSET_UNIFY_COST_ = makeSymbol( "*START-OFFSET-UNIFY-COST*" );
    $kw6$REMOVAL_START_OFFSET_UNIFY_ARG3_POS = makeKeyword( "REMOVAL-START-OFFSET-UNIFY-ARG3-POS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*START-OFFSET-UNIFY-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OFFSET" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow
                        .list( makeKeyword( "VALUE" ), makeSymbol( "LITTLE-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OFFSET" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "START-OFFSET-OF-STRING-ITERATOR" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "LITTLE-STRING" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), ConsesLow.list(
                                    makeKeyword( "VALUE" ), makeSymbol( "BIG-STRING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LITTLE-STRING" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$startOffset <string> <string> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$startOffset \"food\" \"foo\" ?N)" )
    } );
    $kw8$REMOVAL_START_OFFSET_DELAY = makeKeyword( "REMOVAL-START-OFFSET-DELAY" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword(
            "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startOffset" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ) ),
      makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "REQUIRED" ), makeSymbol( "FALSE" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound." ), makeKeyword( "EXAMPLE" ), makeString( "(#$startOffset ?X ?Y 10)" )
    } );
  }
}
/*
 * 
 * Total time: 91 ms
 * 
 */