package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_macros";
  public static final String myFingerPrint = "eac41364fcd530e3d4f7e81ce2c8fa758cce994348891bdd838fd033292a1cbc";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$NAME_VAR;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$XML_START_TAG_INTERNAL;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$XML_END_TAG_INTERNAL;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$NAME_VAR;
  private static final SubLSymbol $sym9$_XML_DEFAULT_NAMESPACE_;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$FORMAT;
  private static final SubLSymbol $sym12$_XML_STREAM_;

  @SubLTranslatedFile.SubL(source = "cycl/xml-macros.lisp", position = 734L)
  public static SubLObject xml_element(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject attributes = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    attributes = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL != body )
    {
      final SubLObject name_var = $sym1$NAME_VAR;
      return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( name_var, name ) ), ConsesLow.listS( $sym3$XML_START_TAG_INTERNAL, name_var, attributes, $list4 ), ConsesLow.append( body, ConsesLow.list(
          ConsesLow.list( $sym5$XML_END_TAG_INTERNAL, name_var ) ) ) );
    }
    return ConsesLow.listS( $sym3$XML_START_TAG_INTERNAL, name, attributes, $list6 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-macros.lisp", position = 1833L)
  public static SubLObject xml_element_wXdefault_namespace(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject attributes = NIL;
    SubLObject default_namespace = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    attributes = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    default_namespace = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject name_var = $sym8$NAME_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( name_var, name ) ), ConsesLow.list( $sym3$XML_START_TAG_INTERNAL, name_var, attributes, NIL, NIL, default_namespace ), ConsesLow.listS( $sym2$CLET,
        ConsesLow.list( ConsesLow.list( $sym9$_XML_DEFAULT_NAMESPACE_, default_namespace ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym5$XML_END_TAG_INTERNAL, name_var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-macros.lisp", position = 2536L)
  public static SubLObject xml_format(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject control_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    control_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym11$FORMAT, $sym12$_XML_STREAM_, control_string, ConsesLow.append( args, NIL ) );
  }

  public static SubLObject declare_xml_macros_file()
  {
    SubLFiles.declareMacro( me, "xml_element", "XML-ELEMENT" );
    SubLFiles.declareMacro( me, "xml_element_wXdefault_namespace", "XML-ELEMENT-W/DEFAULT-NAMESPACE" );
    SubLFiles.declareMacro( me, "xml_format", "XML-FORMAT" );
    return NIL;
  }

  public static SubLObject init_xml_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_xml_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_macros_file();
  }
  static
  {
    me = new xml_macros();
    $list0 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$NAME_VAR = makeUninternedSymbol( "NAME-VAR" );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$XML_START_TAG_INTERNAL = makeSymbol( "XML-START-TAG-INTERNAL" );
    $list4 = ConsesLow.list( NIL );
    $sym5$XML_END_TAG_INTERNAL = makeSymbol( "XML-END-TAG-INTERNAL" );
    $list6 = ConsesLow.list( T );
    $list7 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "DEFAULT-NAMESPACE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym8$NAME_VAR = makeUninternedSymbol( "NAME-VAR" );
    $sym9$_XML_DEFAULT_NAMESPACE_ = makeSymbol( "*XML-DEFAULT-NAMESPACE*" );
    $list10 = ConsesLow.list( makeSymbol( "CONTROL-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym11$FORMAT = makeSymbol( "FORMAT" );
    $sym12$_XML_STREAM_ = makeSymbol( "*XML-STREAM*" );
  }
}
/*
 * 
 * Total time: 68 ms
 * 
 */