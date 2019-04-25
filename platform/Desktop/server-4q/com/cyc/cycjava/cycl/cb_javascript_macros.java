package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_javascript_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_javascript_macros";
  public static final String myFingerPrint = "bc1eb77556ae1ffd4924bb3632c030c8981321d564e8d5e672a7d81a7434dc8d";
  private static final SubLSymbol $sym0$CB_UIAT_WITH_DOM_SCRIPT;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$PROGN;
  private static final SubLSymbol $sym3$CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$VISIBLE;
  private static final SubLSymbol $sym7$CB_UIAT_POTENTIALLY_SHOW;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$DHTML_POTENTIALLY_SHOW;
  private static final SubLSymbol $kw10$INITIAL_VISIBILITY;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$CB_UIAT_POTENTIALLY_SHOW_SWITCHED;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$DHTML_POTENTIALLY_SHOW_SWITCHED;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CB_UIAT_TOGGLE_VISIBILITY_LINK;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$DHTML_TOGGLE_VISIBILITY_LINK;
  private static final SubLSymbol $kw19$LINK_TEXT;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$CB_UIAT_SWITCH_VISIBILITY_LINKS;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$DHTML_SWITCH_VISIBILITY_LINKS;
  private static final SubLList $list24;
  private static final SubLString $str25$;
  private static final SubLSymbol $sym26$CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$DHTML_SWITCH_VISIBILITY_LINKS_ARROWS;
  private static final SubLSymbol $sym29$CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS;

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 826L)
  public static SubLObject cb_uiat_with_dom_script(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    access_macros.defmacro_obsolete_warning( $sym0$CB_UIAT_WITH_DOM_SCRIPT, $list1 );
    return ConsesLow.listS( $sym2$PROGN, $list1, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1222L)
  public static SubLObject cb_uiat_with_toggle_visibility_support(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    access_macros.defmacro_obsolete_warning( $sym3$CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT, $list4 );
    return ConsesLow.listS( $sym2$PROGN, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1419L)
  public static SubLObject cb_uiat_potentially_show(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    object_id = current.first();
    current = current.rest();
    final SubLObject initial_visibility = current.isCons() ? current.first() : $kw6$VISIBLE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list5 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym7$CB_UIAT_POTENTIALLY_SHOW, $list8 );
      return ConsesLow.listS( $sym9$DHTML_POTENTIALLY_SHOW, ConsesLow.listS( object_id, $kw10$INITIAL_VISIBILITY, initial_visibility, $list11 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1686L)
  public static SubLObject cb_uiat_potentially_show_switched(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    object_id = current.first();
    current = current.rest();
    final SubLObject initial_visibility = current.isCons() ? current.first() : $kw6$VISIBLE;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list5 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym12$CB_UIAT_POTENTIALLY_SHOW_SWITCHED, $list13 );
      return ConsesLow.listS( $sym14$DHTML_POTENTIALLY_SHOW_SWITCHED, ConsesLow.listS( object_id, $kw10$INITIAL_VISIBILITY, initial_visibility, $list11 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 1979L)
  public static SubLObject cb_uiat_toggle_visibility_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    SubLObject link_text = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    object_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    link_text = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym16$CB_UIAT_TOGGLE_VISIBILITY_LINK, $list17 );
      return ConsesLow.listS( $sym18$DHTML_TOGGLE_VISIBILITY_LINK, ConsesLow.list( object_id, $kw19$LINK_TEXT, link_text ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 2195L)
  public static SubLObject cb_uiat_switch_visibility_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    SubLObject show_link_text = NIL;
    SubLObject hide_link_text = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    object_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    show_link_text = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    hide_link_text = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        access_macros.defmacro_obsolete_warning( $sym21$CB_UIAT_SWITCH_VISIBILITY_LINKS, $list22 );
        return ConsesLow.list( $sym23$DHTML_SWITCH_VISIBILITY_LINKS, object_id, show_link_text, hide_link_text );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 2425L)
  public static SubLObject cb_uiat_switch_visibility_links_arrows(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    object_id = current.first();
    current = current.rest();
    final SubLObject text = current.isCons() ? current.first() : $str25$;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list24 );
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        access_macros.defmacro_obsolete_warning( $sym26$CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS, $list27 );
        return ConsesLow.list( $sym28$DHTML_SWITCH_VISIBILITY_LINKS_ARROWS, object_id, text );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-javascript-macros.lisp", position = 2639L)
  public static SubLObject cb_uiat_switch_visibility_links_left_arrows(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    object_id = current.first();
    current = current.rest();
    final SubLObject text = current.isCons() ? current.first() : $str25$;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list24 );
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        access_macros.defmacro_obsolete_warning( $sym29$CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, $list30 );
        return ConsesLow.list( $sym31$DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS, object_id, text );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    return NIL;
  }

  public static SubLObject declare_cb_javascript_macros_file()
  {
    SubLFiles.declareMacro( me, "cb_uiat_with_dom_script", "CB-UIAT-WITH-DOM-SCRIPT" );
    SubLFiles.declareMacro( me, "cb_uiat_with_toggle_visibility_support", "CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT" );
    SubLFiles.declareMacro( me, "cb_uiat_potentially_show", "CB-UIAT-POTENTIALLY-SHOW" );
    SubLFiles.declareMacro( me, "cb_uiat_potentially_show_switched", "CB-UIAT-POTENTIALLY-SHOW-SWITCHED" );
    SubLFiles.declareMacro( me, "cb_uiat_toggle_visibility_link", "CB-UIAT-TOGGLE-VISIBILITY-LINK" );
    SubLFiles.declareMacro( me, "cb_uiat_switch_visibility_links", "CB-UIAT-SWITCH-VISIBILITY-LINKS" );
    SubLFiles.declareMacro( me, "cb_uiat_switch_visibility_links_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS" );
    SubLFiles.declareMacro( me, "cb_uiat_switch_visibility_links_left_arrows", "CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS" );
    return NIL;
  }

  public static SubLObject init_cb_javascript_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_javascript_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_javascript_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_javascript_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_javascript_macros_file();
  }
  static
  {
    me = new cb_javascript_macros();
    $sym0$CB_UIAT_WITH_DOM_SCRIPT = makeSymbol( "CB-UIAT-WITH-DOM-SCRIPT" );
    $list1 = ConsesLow.list( makeSymbol( "DHTML-WITH-DOM-SCRIPT" ) );
    $sym2$PROGN = makeSymbol( "PROGN" );
    $sym3$CB_UIAT_WITH_TOGGLE_VISIBILITY_SUPPORT = makeSymbol( "CB-UIAT-WITH-TOGGLE-VISIBILITY-SUPPORT" );
    $list4 = ConsesLow.list( makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INITIAL-VISIBILITY" ), makeKeyword( "VISIBLE" ) ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $kw6$VISIBLE = makeKeyword( "VISIBLE" );
    $sym7$CB_UIAT_POTENTIALLY_SHOW = makeSymbol( "CB-UIAT-POTENTIALLY-SHOW" );
    $list8 = ConsesLow.list( makeSymbol( "DHTML-POTENTIALLY-SHOW" ) );
    $sym9$DHTML_POTENTIALLY_SHOW = makeSymbol( "DHTML-POTENTIALLY-SHOW" );
    $kw10$INITIAL_VISIBILITY = makeKeyword( "INITIAL-VISIBILITY" );
    $list11 = ConsesLow.list( makeKeyword( "FLOW-TYPE" ), makeKeyword( "TEXT" ) );
    $sym12$CB_UIAT_POTENTIALLY_SHOW_SWITCHED = makeSymbol( "CB-UIAT-POTENTIALLY-SHOW-SWITCHED" );
    $list13 = ConsesLow.list( makeSymbol( "DHTML-POTENTIALLY-SHOW-SWITCHED" ) );
    $sym14$DHTML_POTENTIALLY_SHOW_SWITCHED = makeSymbol( "DHTML-POTENTIALLY-SHOW-SWITCHED" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "LINK-TEXT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym16$CB_UIAT_TOGGLE_VISIBILITY_LINK = makeSymbol( "CB-UIAT-TOGGLE-VISIBILITY-LINK" );
    $list17 = ConsesLow.list( makeSymbol( "DHTML-TOGGLE-VISIBILITY-LINK" ) );
    $sym18$DHTML_TOGGLE_VISIBILITY_LINK = makeSymbol( "DHTML-TOGGLE-VISIBILITY-LINK" );
    $kw19$LINK_TEXT = makeKeyword( "LINK-TEXT" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "SHOW-LINK-TEXT" ), makeSymbol( "HIDE-LINK-TEXT" ) ) );
    $sym21$CB_UIAT_SWITCH_VISIBILITY_LINKS = makeSymbol( "CB-UIAT-SWITCH-VISIBILITY-LINKS" );
    $list22 = ConsesLow.list( makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS" ) );
    $sym23$DHTML_SWITCH_VISIBILITY_LINKS = makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEXT" ), makeString( "" ) ) ) );
    $str25$ = makeString( "" );
    $sym26$CB_UIAT_SWITCH_VISIBILITY_LINKS_ARROWS = makeSymbol( "CB-UIAT-SWITCH-VISIBILITY-LINKS-ARROWS" );
    $list27 = ConsesLow.list( makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS" ) );
    $sym28$DHTML_SWITCH_VISIBILITY_LINKS_ARROWS = makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS" );
    $sym29$CB_UIAT_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = makeSymbol( "CB-UIAT-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS" );
    $list30 = ConsesLow.list( makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS" ) );
    $sym31$DHTML_SWITCH_VISIBILITY_LINKS_LEFT_ARROWS = makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS" );
  }
}
/*
 * 
 * Total time: 86 ms
 * 
 */