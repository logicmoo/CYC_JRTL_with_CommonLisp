package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kqml
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kqml";
  public static final String myFingerPrint = "27875a0181070618a1c2a73935aa6c4f7945a3c7ffc5435b32db232d3566b1db";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$LIST;
  private static final SubLSymbol $sym2$QUOTE;
  private static final SubLSymbol $sym3$ASK_ALL;
  private static final SubLSymbol $kw4$SENDER;
  private static final SubLSymbol $sym5$A_SENDER;
  private static final SubLSymbol $kw6$RECEIVER;
  private static final SubLSymbol $sym7$A_RECEIVER;
  private static final SubLSymbol $kw8$REPLY_WITH;
  private static final SubLSymbol $sym9$A_REPLY_WITH;
  private static final SubLSymbol $kw10$IN_REPLY_TO;
  private static final SubLSymbol $sym11$AN_IN_REPLY_TO;
  private static final SubLSymbol $kw12$CONTENT;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$LANGUAGE;
  private static final SubLSymbol $sym15$KQML;
  private static final SubLSymbol $kw16$ONTOLOGY;
  private static final SubLSymbol $sym17$CYCL;
  private static final SubLSymbol $kw18$FORCE;
  private static final SubLString $str19$__kqml_demo__S__;
  private static final SubLString $str20$kqml_performative__S__;
  private static final SubLString $str21$kqml_parm_value__sender__S__;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 818L)
  public static SubLObject create_kqml(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject performative = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    performative = current.first();
    SubLObject parms;
    current = ( parms = current.rest() );
    SubLObject v_kqml = ConsesLow.list( $sym1$LIST, ConsesLow.list( $sym2$QUOTE, performative ) );
    while ( NIL != parms)
    {
      v_kqml = ConsesLow.append( v_kqml, ConsesLow.list( ConsesLow.list( $sym2$QUOTE, parms.first() ), conses_high.cadr( parms ) ) );
      parms = conses_high.cddr( parms );
    }
    return v_kqml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1366L)
  public static SubLObject kqml_performative(final SubLObject v_kqml)
  {
    return v_kqml.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1488L)
  public static SubLObject kqml_parm_value(final SubLObject v_kqml, final SubLObject parm)
  {
    for( SubLObject parms = v_kqml.rest(); NIL != parms; parms = conses_high.cddr( parms ) )
    {
      if( parms.first().eql( parm ) )
      {
        return conses_high.cadr( parms );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1811L)
  public static SubLObject kqml_demo()
  {
    SubLObject v_kqml = NIL;
    v_kqml = ConsesLow.list( new SubLObject[] { $sym3$ASK_ALL, $kw4$SENDER, $sym5$A_SENDER, $kw6$RECEIVER, $sym7$A_RECEIVER, $kw8$REPLY_WITH, $sym9$A_REPLY_WITH, $kw10$IN_REPLY_TO, $sym11$AN_IN_REPLY_TO, $kw12$CONTENT,
      $list13, $kw14$LANGUAGE, $sym15$KQML, $kw16$ONTOLOGY, $sym17$CYCL, $kw18$FORCE, T
    } );
    PrintLow.format( T, $str19$__kqml_demo__S__, v_kqml );
    PrintLow.format( T, $str20$kqml_performative__S__, kqml_performative( v_kqml ) );
    PrintLow.format( T, $str21$kqml_parm_value__sender__S__, kqml_parm_value( v_kqml, $kw4$SENDER ) );
    return NIL;
  }

  public static SubLObject declare_kqml_file()
  {
    SubLFiles.declareMacro( me, "create_kqml", "CREATE-KQML" );
    SubLFiles.declareFunction( me, "kqml_performative", "KQML-PERFORMATIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "kqml_parm_value", "KQML-PARM-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "kqml_demo", "KQML-DEMO", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_kqml_file()
  {
    return NIL;
  }

  public static SubLObject setup_kqml_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kqml_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kqml_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kqml_file();
  }
  static
  {
    me = new kqml();
    $list0 = ConsesLow.list( makeSymbol( "PERFORMATIVE" ), makeSymbol( "&REST" ), makeSymbol( "PARMS" ) );
    $sym1$LIST = makeSymbol( "LIST" );
    $sym2$QUOTE = makeSymbol( "QUOTE" );
    $sym3$ASK_ALL = makeSymbol( "ASK-ALL" );
    $kw4$SENDER = makeKeyword( "SENDER" );
    $sym5$A_SENDER = makeSymbol( "A-SENDER" );
    $kw6$RECEIVER = makeKeyword( "RECEIVER" );
    $sym7$A_RECEIVER = makeSymbol( "A-RECEIVER" );
    $kw8$REPLY_WITH = makeKeyword( "REPLY-WITH" );
    $sym9$A_REPLY_WITH = makeSymbol( "A-REPLY-WITH" );
    $kw10$IN_REPLY_TO = makeKeyword( "IN-REPLY-TO" );
    $sym11$AN_IN_REPLY_TO = makeSymbol( "AN-IN-REPLY-TO" );
    $kw12$CONTENT = makeKeyword( "CONTENT" );
    $list13 = ConsesLow.list( makeSymbol( "SOME" ), makeSymbol( "CONTENT" ) );
    $kw14$LANGUAGE = makeKeyword( "LANGUAGE" );
    $sym15$KQML = makeSymbol( "KQML" );
    $kw16$ONTOLOGY = makeKeyword( "ONTOLOGY" );
    $sym17$CYCL = makeSymbol( "CYCL" );
    $kw18$FORCE = makeKeyword( "FORCE" );
    $str19$__kqml_demo__S__ = makeString( "~%kqml-demo ~S~%" );
    $str20$kqml_performative__S__ = makeString( "kqml-performative ~S~%" );
    $str21$kqml_parm_value__sender__S__ = makeString( "kqml-parm-value :sender ~S~%" );
  }
}
/*
 * 
 * Total time: 18 ms
 * 
 */