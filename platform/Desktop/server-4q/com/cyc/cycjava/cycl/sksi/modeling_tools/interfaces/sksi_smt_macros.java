package com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_smt_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt_macros";
  public static final String myFingerPrint = "5e77782906d6a9ef731e2230e46d8adb5a922c26036dd7f4c44b2f474a000581";
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$COMPLETION_;
  private static final SubLSymbol $kw4$SHOW_COPYRIGHT;
  private static final SubLSymbol $sym5$HTML_DOCUMENT;
  private static final SubLSymbol $sym6$CB_HEAD;
  private static final SubLSymbol $sym7$SKSI_SMT_HTML_TITLE;
  private static final SubLSymbol $sym8$PWHEN;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$HTML_FANCY_BODY;
  private static final SubLSymbol $sym12$SKSI_SMT_HTML_DOCUMENT;
  private static final SubLString $str13$SMT;
  private static final SubLString $str14$___;
  private static final SubLString $str15$___A;
  private static final SubLString $str16$_;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt-macros.lisp", position = 928L)
  public static SubLObject sksi_smt_html_document(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    title = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject completionP_tail = cdestructuring_bind.property_list_member( $kw3$COMPLETION_, current );
    final SubLObject completionP = ( NIL != completionP_tail ) ? conses_high.cadr( completionP_tail ) : NIL;
    final SubLObject show_copyright_tail = cdestructuring_bind.property_list_member( $kw4$SHOW_COPYRIGHT, current );
    final SubLObject show_copyright = ( NIL != show_copyright_tail ) ? conses_high.cadr( show_copyright_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym5$HTML_DOCUMENT, ConsesLow.listS( $sym6$CB_HEAD, ConsesLow.list( $sym7$SKSI_SMT_HTML_TITLE, title ), ConsesLow.listS( $sym8$PWHEN, completionP, $list9 ), $list10 ), ConsesLow.listS(
        $sym11$HTML_FANCY_BODY, ConsesLow.list( $kw4$SHOW_COPYRIGHT, show_copyright ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/interfaces/sksi-smt-macros.lisp", position = 1375L)
  public static SubLObject sksi_smt_html_title(SubLObject v_object)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
    html_utilities.html_princ( $str13$SMT );
    if( NIL != v_object )
    {
      html_utilities.html_princ( $str14$___ );
      html_utilities.html_princ( string_utilities.to_string( v_object ) );
    }
    final SubLObject machine = Environment.get_machine_name( UNPROVIDED );
    if( machine.isString() )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str15$___A, machine );
      html_utilities.html_princ( $str16$_ );
    }
    html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject declare_sksi_smt_macros_file()
  {
    SubLFiles.declareMacro( me, "sksi_smt_html_document", "SKSI-SMT-HTML-DOCUMENT" );
    SubLFiles.declareFunction( me, "sksi_smt_html_title", "SKSI-SMT-HTML-TITLE", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_sksi_smt_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_sksi_smt_macros_file()
  {
    access_macros.register_macro_helper( $sym7$SKSI_SMT_HTML_TITLE, $sym12$SKSI_SMT_HTML_DOCUMENT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_smt_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_smt_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_smt_macros_file();
  }
  static
  {
    me = new sksi_smt_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "&KEY" ), makeSymbol( "COMPLETION?" ), makeSymbol( "SHOW-COPYRIGHT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "COMPLETION?" ), makeKeyword( "SHOW-COPYRIGHT" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$COMPLETION_ = makeKeyword( "COMPLETION?" );
    $kw4$SHOW_COPYRIGHT = makeKeyword( "SHOW-COPYRIGHT" );
    $sym5$HTML_DOCUMENT = makeSymbol( "HTML-DOCUMENT" );
    $sym6$CB_HEAD = makeSymbol( "CB-HEAD" );
    $sym7$SKSI_SMT_HTML_TITLE = makeSymbol( "SKSI-SMT-HTML-TITLE" );
    $sym8$PWHEN = makeSymbol( "PWHEN" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-COMPLETE-SCRIPT" ) ) );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "DHTML-WITH-DOM-SCRIPT" ) ), ConsesLow.list( makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ) ), ConsesLow.list( makeSymbol( "HTML-BASIC-CB-SCRIPTS" ) ) );
    $sym11$HTML_FANCY_BODY = makeSymbol( "HTML-FANCY-BODY" );
    $sym12$SKSI_SMT_HTML_DOCUMENT = makeSymbol( "SKSI-SMT-HTML-DOCUMENT" );
    $str13$SMT = makeString( "SMT" );
    $str14$___ = makeString( " - " );
    $str15$___A = makeString( " (~A" );
    $str16$_ = makeString( ")" );
  }
}
/*
 * 
 * Total time: 92 ms
 * 
 */