package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_source_schema_object_fn
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn";
  public static final String myFingerPrint = "b911b141f08220e426b6b86ab00d1e5875bca46335a3ff0205a1e0509660e70f";
  private static final SubLSymbol $kw0$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$SOURCE_SCHEMA_OBJECT_FN;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 6743L)
  public static SubLObject removal_source_schema_object_fn_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return removal_modules_equals.$default_unify_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 6926L)
  public static SubLObject removal_source_schema_object_fn_equals_support(final SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    final SubLObject support = arguments.make_hl_support( $kw10$SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, UNPROVIDED );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 7180L)
  public static SubLObject removal_source_schema_object_fn_undefined_support(final SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    final SubLObject support = arguments.make_hl_support( $kw10$SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, UNPROVIDED );
    final SubLObject more_supports = NIL;
    return Values.values( support, more_supports );
  }

  public static SubLObject declare_removal_modules_source_schema_object_fn_file()
  {
    SubLFiles.declareFunction( me, "removal_source_schema_object_fn_unify_cost", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_source_schema_object_fn_equals_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_source_schema_object_fn_undefined_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_source_schema_object_fn_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_source_schema_object_fn_file()
  {
    inference_modules.inference_removal_module( $kw0$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS, $list1 );
    inference_modules.inference_removal_module( $kw2$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY, $list3 );
    inference_modules.inference_removal_module( $kw4$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS, $list7 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_source_schema_object_fn_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_source_schema_object_fn_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_source_schema_object_fn_file();
  }
  static
  {
    me = new removal_modules_source_schema_object_fn();
    $kw0$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS = makeKeyword( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-CHECK-POS" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "CHECK" ), T, makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ),
      makeKeyword( "REQUIRED-MT" ), constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "equals" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
              "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeKeyword(
                  "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list(
          makeKeyword( "BIND" ), makeSymbol( "EXPRESSION1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EXPRESSION2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "EXPRESSION1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION2" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "EXPRESSION1" ), makeSymbol( "EXPRESSION2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "EXPRESSION1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION2" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$equals\n       (#$SourceSchemaObjectFn <SKS1> <ODS> <ID>)\n       (#$SourceSchemaObjectFn <SKS2> <ODS> <ID>))" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$equals\n      (#$SourceSchemaObjectFn #$CATS-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))" )
    } );
    $kw2$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY = makeKeyword( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-RIGHT-UNIFY" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-MT" ), constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ),
            ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
                makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                    "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow
                        .list( makeKeyword( "BIND" ), makeSymbol( "EXPRESSION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ), makeKeyword(
                            "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "EXPRESSION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                        "SUPPORT" ), makeSymbol( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$equals\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)\n      <NOT-FULLY-BOUND>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$equals\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5))" )
    } );
    $kw4$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY = makeKeyword( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-LEFT-UNIFY" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-MT" ), constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), makeKeyword( "FULLY-BOUND" ),
                makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                    "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
                        "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EXPRESSION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ), makeKeyword(
                            "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "EXPRESSION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ), makeKeyword(
                                        "SUPPORT" ), makeSymbol( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$equals\n      <NOT-FULLY-BOUND>\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$equals\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))" )
    } );
    $kw6$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS = makeKeyword( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-POS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "CHECK" ), T, makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "undefined" ) ), makeKeyword( "REQUIRED-MT" ), constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "undefined" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ),
                makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
                    "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "undefined" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EXPRESSION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "EXPRESSION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol(
              "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$undefined\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$undefined\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-hospital-LS 5))" )
    } );
    $kw8$REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG = makeKeyword( "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-NEG" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "CHECK" ), T, makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "undefined" ) ), makeKeyword( "REQUIRED-MT" ), constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "undefined" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ),
                makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
                    "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "undefined" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EXPRESSION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "EXPRESSION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EXPRESSION" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol(
              "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)))" ), makeKeyword(
                  "EXAMPLE" ), makeString( "(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)))" )
    } );
    $kw10$SOURCE_SCHEMA_OBJECT_FN = makeKeyword( "SOURCE-SCHEMA-OBJECT-FN" );
  }
}
/*
 * 
 * Total time: 102 ms
 * 
 */