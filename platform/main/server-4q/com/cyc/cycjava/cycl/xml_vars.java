package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_vars";
  public static final String myFingerPrint = "5c4c9d5b45a7d51db7bdae896b700a0549269c925a01c6d241a047684b7326c5";
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 703L)
  public static SubLSymbol $xml_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 741L)
  public static SubLSymbol $xml_entity_table$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 884L)
  public static SubLSymbol $xml_valid_char_code_ranges$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1170L)
  public static SubLSymbol $xml_predefined_entities$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1408L)
  public static SubLSymbol $xml_document_entity_names$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1558L)
  public static SubLSymbol $xml_default_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1701L)
  private static SubLSymbol $formula_template_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1799L)
  public static SubLSymbol $formula_template_include_namespaceP$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2012L)
  private static SubLSymbol $cycl_query_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2097L)
  public static SubLSymbol $cycl_query_include_namespaceP$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2286L)
  private static SubLSymbol $cycml_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2362L)
  public static SubLSymbol $cycml_include_namespaceP$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2531L)
  private static SubLSymbol $proof_view_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2616L)
  public static SubLSymbol $proof_view_include_namespaceP$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLString $str3$http___www_opencyc_org_xml_formul;
  private static final SubLString $str4$http___www_opencyc_org_xml_cyclQu;
  private static final SubLString $str5$http___www_opencyc_org_xml_cycML_;
  private static final SubLString $str6$http___www_opencyc_org_xml_proofV;

  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1863L)
  public static SubLObject formula_template_namespace()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $formula_template_include_namespaceP$.getDynamicValue( thread ) ) ? $formula_template_namespace$.getGlobalValue() : misc_utilities.uninitialized();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2155L)
  public static SubLObject cycl_query_namespace()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $cycl_query_include_namespaceP$.getDynamicValue( thread ) ) ? $cycl_query_namespace$.getGlobalValue() : misc_utilities.uninitialized();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2415L)
  public static SubLObject cycml_namespace()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $cycml_include_namespaceP$.getDynamicValue( thread ) ) ? $cycml_namespace$.getGlobalValue() : misc_utilities.uninitialized();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2674L)
  public static SubLObject proof_view_namespace()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $proof_view_include_namespaceP$.getDynamicValue( thread ) ) ? $proof_view_namespace$.getGlobalValue() : misc_utilities.uninitialized();
  }

  public static SubLObject declare_xml_vars_file()
  {
    SubLFiles.declareFunction( me, "formula_template_namespace", "FORMULA-TEMPLATE-NAMESPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_namespace", "CYCL-QUERY-NAMESPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "cycml_namespace", "CYCML-NAMESPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "proof_view_namespace", "PROOF-VIEW-NAMESPACE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_xml_vars_file()
  {
    $xml_stream$ = SubLFiles.defparameter( "*XML-STREAM*", T );
    $xml_entity_table$ = SubLFiles.defparameter( "*XML-ENTITY-TABLE*", $list0 );
    $xml_valid_char_code_ranges$ = SubLFiles.deflexical( "*XML-VALID-CHAR-CODE-RANGES*", $list1 );
    $xml_predefined_entities$ = SubLFiles.deflexical( "*XML-PREDEFINED-ENTITIES*", $list2 );
    $xml_document_entity_names$ = SubLFiles.defparameter( "*XML-DOCUMENT-ENTITY-NAMES*", misc_utilities.uninitialized() );
    $xml_default_namespace$ = SubLFiles.defparameter( "*XML-DEFAULT-NAMESPACE*", misc_utilities.uninitialized() );
    $formula_template_namespace$ = SubLFiles.deflexical( "*FORMULA-TEMPLATE-NAMESPACE*", $str3$http___www_opencyc_org_xml_formul );
    $formula_template_include_namespaceP$ = SubLFiles.defparameter( "*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*", NIL );
    $cycl_query_namespace$ = SubLFiles.deflexical( "*CYCL-QUERY-NAMESPACE*", $str4$http___www_opencyc_org_xml_cyclQu );
    $cycl_query_include_namespaceP$ = SubLFiles.defparameter( "*CYCL-QUERY-INCLUDE-NAMESPACE?*", NIL );
    $cycml_namespace$ = SubLFiles.deflexical( "*CYCML-NAMESPACE*", $str5$http___www_opencyc_org_xml_cycML_ );
    $cycml_include_namespaceP$ = SubLFiles.defparameter( "*CYCML-INCLUDE-NAMESPACE?*", NIL );
    $proof_view_namespace$ = SubLFiles.deflexical( "*PROOF-VIEW-NAMESPACE*", $str6$http___www_opencyc_org_xml_proofV );
    $proof_view_include_namespaceP$ = SubLFiles.defparameter( "*PROOF-VIEW-INCLUDE-NAMESPACE?*", NIL );
    return NIL;
  }

  public static SubLObject setup_xml_vars_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_vars_file();
  }
  static
  {
    me = new xml_vars();
    $xml_stream$ = null;
    $xml_entity_table$ = null;
    $xml_valid_char_code_ranges$ = null;
    $xml_predefined_entities$ = null;
    $xml_document_entity_names$ = null;
    $xml_default_namespace$ = null;
    $formula_template_namespace$ = null;
    $formula_template_include_namespaceP$ = null;
    $cycl_query_namespace$ = null;
    $cycl_query_include_namespaceP$ = null;
    $cycml_namespace$ = null;
    $cycml_include_namespaceP$ = null;
    $proof_view_namespace$ = null;
    $proof_view_include_namespaceP$ = null;
    $list0 = ConsesLow.list( ConsesLow.cons( Characters.CHAR_ampersand, makeString( "amp" ) ), ConsesLow.cons( Characters.CHAR_less, makeString( "lt" ) ), ConsesLow.cons( Characters.CHAR_greater, makeString( "gt" ) ),
        ConsesLow.cons( Characters.CHAR_quotation, makeString( "quot" ) ), ConsesLow.cons( Characters.CHAR_quote, makeString( "apos" ) ) );
    $list1 = ConsesLow.list( ConsesLow.list( NINE_INTEGER, NINE_INTEGER ), ConsesLow.list( TEN_INTEGER, TEN_INTEGER ), ConsesLow.list( THIRTEEN_INTEGER, THIRTEEN_INTEGER ), ConsesLow.list( makeInteger( 32 ), makeInteger(
        32 ) ), ConsesLow.list( makeInteger( 33 ), makeInteger( 55295 ) ), ConsesLow.list( makeInteger( 57344 ), makeInteger( 65533 ) ), ConsesLow.list( makeInteger( 65536 ), makeInteger( 1114111 ) ) );
    $list2 = ConsesLow.list( ConsesLow.cons( makeString( "quot" ), makeInteger( 34 ) ), ConsesLow.cons( makeString( "amp" ), makeInteger( 38 ) ), ConsesLow.cons( makeString( "apos" ), makeInteger( 39 ) ), ConsesLow.cons(
        makeString( "lt" ), makeInteger( 60 ) ), ConsesLow.cons( makeString( "gt" ), makeInteger( 62 ) ) );
    $str3$http___www_opencyc_org_xml_formul = makeString( "http://www.opencyc.org/xml/formulaTemplate/" );
    $str4$http___www_opencyc_org_xml_cyclQu = makeString( "http://www.opencyc.org/xml/cyclQuery/" );
    $str5$http___www_opencyc_org_xml_cycML_ = makeString( "http://www.opencyc.org/xml/cycML/" );
    $str6$http___www_opencyc_org_xml_proofV = makeString( "http://www.opencyc.org/xml/proofView/" );
  }
}
/*
 * 
 * Total time: 21 ms
 * 
 */