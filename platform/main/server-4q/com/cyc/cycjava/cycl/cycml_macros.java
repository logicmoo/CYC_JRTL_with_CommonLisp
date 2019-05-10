package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycml_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cycml_macros";
  public static final String myFingerPrint = "e700a724f2a530ade411036e5f248722c5ba644f35d577c6393392f99911a380";
  private static final SubLSymbol $sym0$DEF_CYCML_PRIMITIVE;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$BODY;
  private static final SubLSymbol $sym4$ATTRIBUTES;
  private static final SubLSymbol $sym5$DEFINE_PUBLIC;
  private static final SubLString $str6$CYCML_SERIALIZE_;
  private static final SubLSymbol $sym7$_OPTIONAL;
  private static final SubLSymbol $sym8$CYCML_SERIALIZE_PRIMITIVE;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PWHEN;
  private static final SubLSymbol $sym12$_CYCML_INDENT_MODE_ON_;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$CLET;
  private static final SubLList $list18;
  private static final SubLList $list19;

  @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 829L)
  public static SubLObject def_cycml_primitives(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject names;
    final SubLObject current = names = datum;
    SubLObject couples = NIL;
    SubLObject cdolist_list_var = names;
    SubLObject name = NIL;
    name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      couples = ConsesLow.cons( ConsesLow.list( $sym0$DEF_CYCML_PRIMITIVE, name ), couples );
      cdolist_list_var = cdolist_list_var.rest();
      name = cdolist_list_var.first();
    }
    return reader.bq_cons( $sym1$PROGN, ConsesLow.append( couples, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 1159L)
  public static SubLObject def_cycml_primitive(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body = $sym3$BODY;
      final SubLObject attributes = $sym4$ATTRIBUTES;
      return ConsesLow.listS( $sym5$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str6$CYCML_SERIALIZE_, Symbols.symbol_name( name ) ), UNPROVIDED ), ConsesLow.list( body, $sym7$_OPTIONAL, attributes ),
          ConsesLow.list( $sym8$CYCML_SERIALIZE_PRIMITIVE, Strings.string_downcase( Symbols.symbol_name( name ), UNPROVIDED, UNPROVIDED ), body, attributes ), $list9 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 1580L)
  public static SubLObject cycml_primitive_indented_element(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject attributes = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    attributes = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym11$PWHEN, $sym12$_CYCML_INDENT_MODE_ON_, $list13, $list14, ConsesLow.listS( $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE, name, attributes, $list16, ConsesLow.append(
        body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 2171L)
  public static SubLObject cycml_complex_indented_element(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject attributes = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    attributes = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym11$PWHEN, $sym12$_CYCML_INDENT_MODE_ON_, $list13, $list14, ConsesLow.listS( $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE, name, attributes, $list16, ConsesLow.listS(
        $sym17$CLET, $list18, ConsesLow.append( body, NIL ) ), $list19 ) ) );
  }

  public static SubLObject declare_cycml_macros_file()
  {
    SubLFiles.declareMacro( me, "def_cycml_primitives", "DEF-CYCML-PRIMITIVES" );
    SubLFiles.declareMacro( me, "def_cycml_primitive", "DEF-CYCML-PRIMITIVE" );
    SubLFiles.declareMacro( me, "cycml_primitive_indented_element", "CYCML-PRIMITIVE-INDENTED-ELEMENT" );
    SubLFiles.declareMacro( me, "cycml_complex_indented_element", "CYCML-COMPLEX-INDENTED-ELEMENT" );
    return NIL;
  }

  public static SubLObject init_cycml_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_cycml_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cycml_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cycml_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cycml_macros_file();
  }
  static
  {
    me = new cycml_macros();
    $sym0$DEF_CYCML_PRIMITIVE = makeSymbol( "DEF-CYCML-PRIMITIVE" );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $list2 = ConsesLow.list( makeSymbol( "NAME" ) );
    $sym3$BODY = makeUninternedSymbol( "BODY" );
    $sym4$ATTRIBUTES = makeUninternedSymbol( "ATTRIBUTES" );
    $sym5$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $str6$CYCML_SERIALIZE_ = makeString( "CYCML-SERIALIZE-" );
    $sym7$_OPTIONAL = makeSymbol( "&OPTIONAL" );
    $sym8$CYCML_SERIALIZE_PRIMITIVE = makeSymbol( "CYCML-SERIALIZE-PRIMITIVE" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list10 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym11$PWHEN = makeSymbol( "PWHEN" );
    $sym12$_CYCML_INDENT_MODE_ON_ = makeSymbol( "*CYCML-INDENT-MODE-ON*" );
    $list13 = ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "*XML-STREAM*" ), makeString( "~&" ) );
    $list14 = ConsesLow.list( makeSymbol( "CYCML-INDENT" ) );
    $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE = makeSymbol( "XML-ELEMENT-W/DEFAULT-NAMESPACE" );
    $list16 = ConsesLow.list( makeSymbol( "CYCML-NAMESPACE" ) );
    $sym17$CLET = makeSymbol( "CLET" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCML-INDENT-LEVEL*" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "*CYCML-INDENT-LEVEL*" ) ) ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*CYCML-INDENT-MODE-ON*" ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "*XML-STREAM*" ), makeString( "~&" ) ), ConsesLow.list(
        makeSymbol( "CYCML-INDENT" ) ) ) );
  }
}
/*
 * 
 * Total time: 75 ms
 * 
 */