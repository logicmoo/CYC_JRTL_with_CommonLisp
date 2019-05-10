package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dhtml_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.dhtml_macros";
  public static final String myFingerPrint = "b87b793fbcb7a2da870f2742f97cbf5eddc90b6c036a4860bdc9166a805ac6ac";
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 898L)
  public static SubLSymbol $dhtml_css_head$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 949L)
  public static SubLSymbol $dhtml_css_type$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 999L)
  public static SubLSymbol $dhtml_css_media$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 1051L)
  public static SubLSymbol $dhtml_css_tail$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 1999L)
  public static SubLSymbol $dhtml_dom_position$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2126L)
  public static SubLSymbol $dhtml_dom_top$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2179L)
  public static SubLSymbol $dhtml_dom_bottom$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2235L)
  public static SubLSymbol $dhtml_dom_right$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2290L)
  public static SubLSymbol $dhtml_dom_left$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2344L)
  public static SubLSymbol $dhtml_dom_visibility$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2404L)
  public static SubLSymbol $dhtml_dom_display$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2461L)
  public static SubLSymbol $dhtml_dom_height$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2517L)
  public static SubLSymbol $dhtml_dom_width$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 5702L)
  public static SubLSymbol $dhtml_blank_href_js$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23722L)
  public static SubLSymbol $html_element_id$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24354L)
  public static SubLSymbol $js_load_later$;
  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 26675L)
  private static SubLSymbol $kea_set_focal_tool$;
  private static final SubLString $str0$_style;
  private static final SubLString $str1$_type_;
  private static final SubLString $str2$_media_;
  private static final SubLString $str3$__style_;
  private static final SubLList $list4;
  private static final SubLString $str5$text_css;
  private static final SubLString $str6$screen;
  private static final SubLSymbol $sym7$HTML_QUOTED_ATTRIBUTE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$HTML_MARKUP;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PROGN;
  private static final SubLSymbol $sym12$HTML_MARKUP_WRAPPER;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$HTML_MARKUP_BODY;
  private static final SubLList $list15;
  private static final SubLString $str16$position;
  private static final SubLString $str17$top;
  private static final SubLString $str18$bottom;
  private static final SubLString $str19$right;
  private static final SubLString $str20$left;
  private static final SubLString $str21$visibility;
  private static final SubLString $str22$display;
  private static final SubLString $str23$height;
  private static final SubLString $str24$width;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$DHTML_DOM_WRAPPER_PREAMBLE;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$DHTML_DOM_WRAPPER;
  private static final SubLString $str29$__A__;
  private static final SubLSymbol $sym30$DHTML_DOM_WRAPPER_POSTAMBLE;
  private static final SubLString $str31$__;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$DHTML_DOM_ATTRIBUTE;
  private static final SubLString $str36$__A_;
  private static final SubLSymbol $sym37$DHTML_DOM_ATTRIBUTE_POSTAMBLE;
  private static final SubLString $str38$_;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw42$TOP;
  private static final SubLSymbol $kw43$BOTTOM;
  private static final SubLSymbol $kw44$RIGHT;
  private static final SubLSymbol $kw45$LEFT;
  private static final SubLSymbol $kw46$HEIGHT;
  private static final SubLSymbol $kw47$WIDTH;
  private static final SubLSymbol $kw48$POSITION;
  private static final SubLSymbol $kw49$VISIBILITY;
  private static final SubLSymbol $kw50$DISPLAY;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLString $str61$javascript_void____;
  private static final SubLSymbol $kw62$FINDDOM;
  private static final SubLSymbol $kw63$CONSTANT_CREATION;
  private static final SubLSymbol $kw64$LEXICAL;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$VISIBLE;
  private static final SubLSymbol $kw68$INVISIBLE;
  private static final SubLString $str69$_S_was_not_a_known_visibility_p;
  private static final SubLSymbol $sym70$VISIBILITY_P;
  private static final SubLSymbol $sym71$FLOW_TYPE_P;
  private static final SubLString $str72$none;
  private static final SubLSymbol $kw73$PARAGRAPH;
  private static final SubLString $str74$block;
  private static final SubLString $str75$inline;
  private static final SubLSymbol $kw76$TEXT;
  private static final SubLString $str77$setVisibility__;
  private static final SubLString $str78$___;
  private static final SubLString $str79$___;
  private static final SubLSymbol $sym80$STRINGP;
  private static final SubLString $str81$_show_button;
  private static final SubLString $str82$_hide_button;
  private static final SubLSymbol $sym83$WHITESPACEP;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$INITIAL_VISIBILITY;
  private static final SubLSymbol $kw87$FLOW_TYPE;
  private static final SubLSymbol $sym88$DHTML_SET_VISIBILITY;
  private static final SubLSymbol $sym89$HTML_FANCY_DIV;
  private static final SubLSymbol $kw90$ID;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$DHTML_SET_SWITCHED_VISIBILITY;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $kw95$STYLE;
  private static final SubLString $str96$;
  private static final SubLSymbol $sym97$HTML_FANCY_SPAN;
  private static final SubLSymbol $sym98$DHTML_POTENTIALLY_SHOW_SWITCHED;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$LINK_TEXT;
  private static final SubLSymbol $sym102$HREF;
  private static final SubLSymbol $sym103$CLICK_ACTION;
  private static final SubLSymbol $sym104$CLET;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$DHTML_GENERATE_VISIBILITY_SETTER;
  private static final SubLSymbol $sym107$HTML_FANCY_ANCHOR;
  private static final SubLSymbol $kw108$HREF;
  private static final SubLSymbol $kw109$ONCLICK;
  private static final SubLSymbol $sym110$PWHEN;
  private static final SubLSymbol $sym111$HTML_PRINC;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$HREF;
  private static final SubLSymbol $sym115$CLICK_ACTION;
  private static final SubLSymbol $sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$HREF;
  private static final SubLSymbol $sym119$CLICK_ACTION;
  private static final SubLSymbol $sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE;
  private static final SubLSymbol $sym121$DHTML_TOGGLE_VISIBILITY_LINK;
  private static final SubLSymbol $sym122$STRING;
  private static final SubLString $str123$toggleVisibility__;
  private static final SubLSymbol $kw124$SHOW;
  private static final SubLString $str125$__true;
  private static final SubLSymbol $kw126$HIDE;
  private static final SubLString $str127$__false;
  private static final SubLString $str128$toggleClassVisibility__;
  private static final SubLString $str129$_;
  private static final SubLString $str130$__;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$SHOW_ID;
  private static final SubLSymbol $sym133$SHOW_ACTION;
  private static final SubLSymbol $sym134$HIDE_ID;
  private static final SubLSymbol $sym135$HIDE_ACTION;
  private static final SubLSymbol $sym136$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS;
  private static final SubLSymbol $sym138$DHTML_SWITCH_VISIBLITY_LINK;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$SHOW_ID;
  private static final SubLSymbol $sym141$SHOW_ACTION;
  private static final SubLSymbol $sym142$HIDE_ID;
  private static final SubLSymbol $sym143$HIDE_ACTION;
  private static final SubLSymbol $sym144$SHOW_STYLE;
  private static final SubLSymbol $sym145$HIDE_STYLE;
  private static final SubLSymbol $sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS;
  private static final SubLSymbol $sym147$FIF;
  private static final SubLList $list148;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE;
  private static final SubLList $list151;
  private static final SubLSymbol $sym152$DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE;
  private static final SubLSymbol $sym153$DHTML_VISIBILITY_DECLARE_DOM_OBJECTS;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$HREF;
  private static final SubLSymbol $sym156$DHTML_POTENTIALLY_SHOW_TEXT;
  private static final SubLSymbol $sym157$HTML_SMALL;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLSymbol $sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK;
  private static final SubLSymbol $sym162$DHTML_CHANGE_VISIBILE_SECTION;
  private static final SubLString $str163$___block___setVisibility__;
  private static final SubLString $str164$___none___;
  private static final SubLSymbol $kw165$RIGHT_TRIANGLE_V;
  private static final SubLString $str166$cyc_right_triangle_violet_gif;
  private static final SubLString $str167$_Show_;
  private static final SubLSymbol $kw168$LEFT_TRIANGLE_V;
  private static final SubLString $str169$cyc_left_triangle_violet_gif;
  private static final SubLSymbol $kw170$DOWN_TRIANGLE_V;
  private static final SubLString $str171$cyc_down_triangle_violet_gif;
  private static final SubLString $str172$_Hide_;
  private static final SubLSymbol $kw173$UP_TRIANGLE_V;
  private static final SubLString $str174$cyc_up_triangle_violet_gif;
  private static final SubLSymbol $kw175$BLANK_TRIANGLE;
  private static final SubLString $str176$cyc_no_triangle_violet_gif;
  private static final SubLString $str177$__;
  private static final SubLSymbol $kw178$SQUARE_MINUS;
  private static final SubLString $str179$square_minus_gif;
  private static final SubLSymbol $kw180$SQUARE_PLUS;
  private static final SubLString $str181$square_plus_gif;
  private static final SubLSymbol $kw182$SQUARE_BLANK;
  private static final SubLString $str183$square_blank_gif;
  private static final SubLSymbol $kw184$CENTER;
  private static final SubLString $str185$display_inline;
  private static final SubLString $str186$display_none;
  private static final SubLSymbol $kw187$NBSP;
  private static final SubLSymbol $kw188$CONNECTION;
  private static final SubLList $list189;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLString $str192$_script_type__text_javascript__fu;
  private static final SubLList $list193;
  private static final SubLList $list194;
  private static final SubLSymbol $kw195$MESSAGE;
  private static final SubLSymbol $kw196$TAG;
  private static final SubLString $str197$span;
  private static final SubLSymbol $kw198$DELAY;
  private static final SubLInteger $int199$50;
  private static final SubLSymbol $sym200$JS_DELAYED_LOAD_INT;
  private static final SubLSymbol $sym201$LIST;
  private static final SubLSymbol $kw202$HANDLER;
  private static final SubLSymbol $kw203$ARGS;
  private static final SubLSymbol $sym204$JS_DELAYED_LOAD;
  private static final SubLString $str205$cyc_elt_;
  private static final SubLString $str206$__A_id___A___A___A_;
  private static final SubLString $str207$_script_type__text_javascript__tr;
  private static final SubLString $str208$_;
  private static final SubLList $list209;
  private static final SubLString $str210$_;
  private static final SubLString $str211$_;
  private static final SubLString $str212$_if__isKeaHosted________var_keaBu;
  private static final SubLSymbol $kw213$MENU_CSS;
  private static final SubLSymbol $kw214$CB_CYC;
  private static final SubLSymbol $kw215$SELECTOR;
  private static final SubLSymbol $kw216$EVENT_DELEGATION;
  private static final SubLSymbol $kw217$CONTAINER_CORE;
  private static final SubLSymbol $kw218$MENU;
  private static final SubLSymbol $kw219$OVERLIB;
  private static final SubLSymbol $kw220$CB;
  private static final SubLSymbol $kw221$CB_INLINE_EDIT;
  private static final SubLSymbol $kw222$CYCJS_KEA_SESSION_BUS;
  private static final SubLString $str223$__yui_skin_sam__editContainer__yu;

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 1103L)
  public static SubLObject dhtml_with_cascading_style_sheet(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject type = current.isCons() ? current.first() : $str5$text_css;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list4 );
    current = current.rest();
    final SubLObject media = current.isCons() ? current.first() : $str6$screen;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list4 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      SubLObject attributes = NIL;
      if( NIL != type )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym7$HTML_QUOTED_ATTRIBUTE, $list8, type.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, type ) : type ), attributes );
      }
      if( NIL != media )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym7$HTML_QUOTED_ATTRIBUTE, $list10, type.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, media ) : media ), attributes );
      }
      if( NIL != attributes )
      {
        attributes = Sequences.nreverse( attributes );
      }
      return ConsesLow.listS( $sym11$PROGN, ConsesLow.listS( $sym12$HTML_MARKUP_WRAPPER, $list13, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym14$HTML_MARKUP_BODY, ConsesLow.append( body,
          NIL ) ) ) ) ), $list15 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2572L)
  public static SubLObject dhtml_dom_wrapper(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    object_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym11$PROGN, ConsesLow.list( $sym26$DHTML_DOM_WRAPPER_PREAMBLE, object_id ), ConsesLow.append( body, $list27 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2745L)
  public static SubLObject dhtml_dom_wrapper_preamble(final SubLObject object_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str29$__A__, object_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 2938L)
  public static SubLObject dhtml_dom_wrapper_postamble()
  {
    return html_utilities.html_markup( $str31$__ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3095L)
  public static SubLObject dhtml_dom_attribute(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject attribute = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    attribute = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym11$PROGN, ConsesLow.list( $sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE, attribute ), ConsesLow.append( body, $list34 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3301L)
  public static SubLObject dhtml_dom_attribute_preamble(final SubLObject attribute)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str36$__A_, attribute );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3493L)
  public static SubLObject dhtml_dom_attribute_postamble()
  {
    return html_utilities.html_markup( $str38$_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 3655L)
  public static SubLObject dhtml_declare_dom_object(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    object_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp_$1 = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      if( NIL == conses_high.member( current_$2, $list40, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    }
    final SubLObject top_tail = cdestructuring_bind.property_list_member( $kw42$TOP, current );
    final SubLObject top = ( NIL != top_tail ) ? conses_high.cadr( top_tail ) : NIL;
    final SubLObject bottom_tail = cdestructuring_bind.property_list_member( $kw43$BOTTOM, current );
    final SubLObject bottom = ( NIL != bottom_tail ) ? conses_high.cadr( bottom_tail ) : NIL;
    final SubLObject right_tail = cdestructuring_bind.property_list_member( $kw44$RIGHT, current );
    final SubLObject right = ( NIL != right_tail ) ? conses_high.cadr( right_tail ) : NIL;
    final SubLObject left_tail = cdestructuring_bind.property_list_member( $kw45$LEFT, current );
    final SubLObject left = ( NIL != left_tail ) ? conses_high.cadr( left_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw46$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw47$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject position_tail = cdestructuring_bind.property_list_member( $kw48$POSITION, current );
    final SubLObject position = ( NIL != position_tail ) ? conses_high.cadr( position_tail ) : NIL;
    final SubLObject visibility_tail = cdestructuring_bind.property_list_member( $kw49$VISIBILITY, current );
    final SubLObject visibility = ( NIL != visibility_tail ) ? conses_high.cadr( visibility_tail ) : NIL;
    final SubLObject display_tail = cdestructuring_bind.property_list_member( $kw50$DISPLAY, current );
    final SubLObject display = ( NIL != display_tail ) ? conses_high.cadr( display_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp_$1 );
    current = temp;
    if( NIL == current )
    {
      SubLObject attributes = NIL;
      if( NIL != position )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list51, position.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, position ) : position ), attributes );
      }
      if( NIL != top )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list52, top.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, top ) : top ), attributes );
      }
      if( NIL != bottom )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list53, bottom.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, bottom ) : bottom ), attributes );
      }
      if( NIL != left )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list54, left.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, left ) : left ), attributes );
      }
      if( NIL != right )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list55, right.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, right ) : right ), attributes );
      }
      if( NIL != visibility )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list56, visibility.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, visibility ) : visibility ), attributes );
      }
      if( NIL != display )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list57, display.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, display ) : display ), attributes );
      }
      if( NIL != height )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list58, height.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, height ) : height ), attributes );
      }
      if( NIL != width )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym35$DHTML_DOM_ATTRIBUTE, $list59, width.isAtom() ? ConsesLow.list( $sym9$HTML_MARKUP, width ) : width ), attributes );
      }
      if( NIL != attributes )
      {
        attributes = Sequences.nreverse( attributes );
      }
      return ConsesLow.listS( $sym11$PROGN, $list60, ConsesLow.listS( $sym28$DHTML_DOM_WRAPPER, ConsesLow.list( object_id ), ConsesLow.append( attributes, body, NIL ) ), $list15 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 5973L)
  public static SubLObject dhtml_with_dom_script()
  {
    cyc_file_dependencies.javascript( $kw62$FINDDOM );
    return html_utilities.html_source_readability_terpri( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6084L)
  public static SubLObject dhtml_creation_scripts()
  {
    cyc_file_dependencies.javascript( $kw63$CONSTANT_CREATION );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6211L)
  public static SubLObject dhtml_lexical_scripts()
  {
    cyc_file_dependencies.javascript( $kw64$LEXICAL );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6327L)
  public static SubLObject dhtml_with_toggle_visibility_support()
  {
    cyc_file_dependencies.javascript( $kw49$VISIBILITY );
    return html_utilities.html_source_readability_terpri( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6575L)
  public static SubLObject flow_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list65, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6805L)
  public static SubLObject visibility_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list66, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 6945L)
  public static SubLObject invert_visibility(final SubLObject visibility)
  {
    if( visibility.eql( $kw67$VISIBLE ) )
    {
      return $kw68$INVISIBLE;
    }
    if( visibility.eql( $kw68$INVISIBLE ) )
    {
      return $kw67$VISIBLE;
    }
    return Errors.error( $str69$_S_was_not_a_known_visibility_p, visibility );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 7157L)
  public static SubLObject dhtml_encode_visibility(final SubLObject visibility, final SubLObject flow_type)
  {
    assert NIL != visibility_p( visibility ) : visibility;
    assert NIL != flow_type_p( flow_type ) : flow_type;
    if( $kw68$INVISIBLE == visibility )
    {
      return $str72$none;
    }
    if( $kw73$PARAGRAPH == flow_type )
    {
      return $str74$block;
    }
    return $str75$inline;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 7516L)
  public static SubLObject dhtml_generate_visibility_setter(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type)
  {
    if( flow_type == UNPROVIDED )
    {
      flow_type = $kw76$TEXT;
    }
    final SubLObject visibility_encoding = dhtml_encode_visibility( visibility, flow_type );
    return Sequences.cconcatenate( $str77$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy( object_id ), $str78$___, format_nil.format_nil_a_no_copy( visibility_encoding ), $str79$___
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 7859L)
  public static SubLObject dhtml_generate_class_visibility_toggle(final SubLObject object_class, SubLObject show_or_hide)
  {
    if( show_or_hide == UNPROVIDED )
    {
      show_or_hide = NIL;
    }
    return dhtml_visibility_generate_js_for_class_toggle( object_class, show_or_hide );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 8196L)
  public static SubLObject dhtml_set_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type)
  {
    if( flow_type == UNPROVIDED )
    {
      flow_type = $kw76$TEXT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject visibility_encoding = dhtml_encode_visibility( visibility, flow_type );
    html_utilities.html_markup( $dhtml_css_head$.getGlobalValue() );
    html_utilities.html_markup( $dhtml_css_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str5$text_css );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $dhtml_css_media$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str6$screen );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_terpri( UNPROVIDED );
      dhtml_dom_wrapper_preamble( object_id );
      dhtml_dom_attribute_preamble( $dhtml_dom_display$.getGlobalValue() );
      html_utilities.html_markup( visibility_encoding );
      dhtml_dom_attribute_postamble();
      dhtml_dom_wrapper_postamble();
      html_utilities.html_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( $dhtml_css_tail$.getGlobalValue() );
    html_utilities.html_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 8700L)
  public static SubLObject dhtml_visibility_generate_switch_ids(final SubLObject object_id)
  {
    final SubLObject show_id = dhtml_visibility_generate_show_object_id( object_id );
    final SubLObject hide_id = dhtml_visibility_generate_hide_object_id( object_id );
    return Values.values( show_id, hide_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9066L)
  public static SubLObject dhtml_class_visibility_generate_switch_ids(final SubLObject object_class)
  {
    final SubLObject show_id = dhtml_class_visibility_generate_show_object_id( object_class );
    final SubLObject hide_id = dhtml_class_visibility_generate_hide_object_id( object_class );
    return Values.values( show_id, hide_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9461L)
  public static SubLObject dhtml_visibility_generate_show_object_id(final SubLObject object_id)
  {
    assert NIL != Types.stringp( object_id ) : object_id;
    return Sequences.cconcatenate( object_id, $str81$_show_button );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9670L)
  public static SubLObject dhtml_visibility_generate_hide_object_id(final SubLObject object_id)
  {
    assert NIL != Types.stringp( object_id ) : object_id;
    return Sequences.cconcatenate( object_id, $str82$_hide_button );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 9878L)
  public static SubLObject dhtml_class_visibility_generate_show_object_id(final SubLObject object_class)
  {
    assert NIL != Types.stringp( object_class ) : object_class;
    return Sequences.cconcatenate( Sequences.remove_if( $sym83$WHITESPACEP, object_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str81$_show_button );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 10127L)
  public static SubLObject dhtml_class_visibility_generate_hide_object_id(final SubLObject object_class)
  {
    assert NIL != Types.stringp( object_class ) : object_class;
    return Sequences.cconcatenate( Sequences.remove_if( $sym83$WHITESPACEP, object_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str82$_hide_button );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 10375L)
  public static SubLObject dhtml_potentially_show(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    object_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list84 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list84 );
      if( NIL == conses_high.member( current_$3, $list85, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
    }
    final SubLObject initial_visibility_tail = cdestructuring_bind.property_list_member( $kw86$INITIAL_VISIBILITY, current );
    final SubLObject initial_visibility = ( NIL != initial_visibility_tail ) ? conses_high.cadr( initial_visibility_tail ) : $kw67$VISIBLE;
    final SubLObject flow_type_tail = cdestructuring_bind.property_list_member( $kw87$FLOW_TYPE, current );
    final SubLObject flow_type = ( NIL != flow_type_tail ) ? conses_high.cadr( flow_type_tail ) : $kw76$TEXT;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym11$PROGN, ConsesLow.list( $sym88$DHTML_SET_VISIBILITY, object_id, initial_visibility, flow_type ), ConsesLow.listS( $sym89$HTML_FANCY_DIV, ConsesLow.list( $kw90$ID, object_id ), ConsesLow
        .append( body, NIL ) ), $list91 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 10960L)
  public static SubLObject dhtml_potentially_show_switched(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    object_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list84 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list84 );
      if( NIL == conses_high.member( current_$4, $list85, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
    }
    final SubLObject initial_visibility_tail = cdestructuring_bind.property_list_member( $kw86$INITIAL_VISIBILITY, current );
    final SubLObject initial_visibility = ( NIL != initial_visibility_tail ) ? conses_high.cadr( initial_visibility_tail ) : $kw67$VISIBLE;
    final SubLObject flow_type_tail = cdestructuring_bind.property_list_member( $kw87$FLOW_TYPE, current );
    final SubLObject flow_type = ( NIL != flow_type_tail ) ? conses_high.cadr( flow_type_tail ) : $kw76$TEXT;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym11$PROGN, ConsesLow.list( $sym92$DHTML_SET_SWITCHED_VISIBILITY, object_id, initial_visibility, flow_type ), ConsesLow.listS( $sym89$HTML_FANCY_DIV, ConsesLow.list( $kw90$ID, object_id ),
        ConsesLow.append( body, NIL ) ), $list91 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 11271L)
  public static SubLObject dhtml_potentially_show_text(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
    object_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list93 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list93 );
      if( NIL == conses_high.member( current_$5, $list94, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list93 );
    }
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw95$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : $str96$;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym11$PROGN, ConsesLow.listS( $sym97$HTML_FANCY_SPAN, ConsesLow.list( $kw90$ID, object_id, $kw95$STYLE, style ), ConsesLow.append( body, NIL ) ), $list91 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 11479L)
  public static SubLObject dhtml_set_switched_visibility(final SubLObject object_id, final SubLObject visibility, SubLObject flow_type)
  {
    if( flow_type == UNPROVIDED )
    {
      flow_type = $kw76$TEXT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_switch_ids( object_id );
    final SubLObject hide_id = thread.secondMultipleValue();
    thread.resetMultipleValues();
    dhtml_set_visibility( object_id, visibility, flow_type );
    dhtml_set_visibility( show_id, invert_visibility( visibility ), $kw76$TEXT );
    dhtml_set_visibility( hide_id, visibility, $kw76$TEXT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 12303L)
  public static SubLObject dhtml_set_visibility_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    SubLObject visibility = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    object_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    visibility = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list99 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list99 );
      if( NIL == conses_high.member( current_$6, $list100, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    }
    final SubLObject link_text_tail = cdestructuring_bind.property_list_member( $kw101$LINK_TEXT, current );
    final SubLObject link_text = ( NIL != link_text_tail ) ? conses_high.cadr( link_text_tail ) : NIL;
    final SubLObject flow_type_tail = cdestructuring_bind.property_list_member( $kw87$FLOW_TYPE, current );
    final SubLObject flow_type = ( NIL != flow_type_tail ) ? conses_high.cadr( flow_type_tail ) : $kw76$TEXT;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject href = $sym102$HREF;
    final SubLObject click_action = $sym103$CLICK_ACTION;
    return ConsesLow.listS( $sym104$CLET, ConsesLow.list( reader.bq_cons( href, $list105 ), ConsesLow.list( click_action, ConsesLow.list( $sym106$DHTML_GENERATE_VISIBILITY_SETTER, object_id, visibility, flow_type ) ) ),
        ConsesLow.listS( $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$HREF, href, $kw109$ONCLICK, click_action ), ConsesLow.list( $sym110$PWHEN, link_text, ConsesLow.list( $sym111$HTML_PRINC, link_text ) ),
            ConsesLow.append( body, NIL ) ), $list91 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 12879L)
  public static SubLObject dhtml_toggle_visibility_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject object_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    object_id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list112 );
      if( NIL == conses_high.member( current_$7, $list113, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
    }
    final SubLObject link_text_tail = cdestructuring_bind.property_list_member( $kw101$LINK_TEXT, current );
    final SubLObject link_text = ( NIL != link_text_tail ) ? conses_high.cadr( link_text_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject href = $sym114$HREF;
    final SubLObject click_action = $sym115$CLICK_ACTION;
    return ConsesLow.listS( $sym104$CLET, ConsesLow.list( reader.bq_cons( href, $list105 ), ConsesLow.list( click_action, ConsesLow.list( $sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, object_id ) ) ), ConsesLow.listS(
        $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$HREF, href, $kw109$ONCLICK, click_action ), ConsesLow.list( $sym110$PWHEN, link_text, ConsesLow.list( $sym111$HTML_PRINC, link_text ) ), ConsesLow.append( body,
            NIL ) ), $list91 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 13460L)
  public static SubLObject dhtml_toggle_class_visibility_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_class = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    v_class = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list117 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list117 );
      if( NIL == conses_high.member( current_$8, $list113, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list117 );
    }
    final SubLObject link_text_tail = cdestructuring_bind.property_list_member( $kw101$LINK_TEXT, current );
    final SubLObject link_text = ( NIL != link_text_tail ) ? conses_high.cadr( link_text_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject href = $sym118$HREF;
    final SubLObject click_action = $sym119$CLICK_ACTION;
    return ConsesLow.listS( $sym104$CLET, ConsesLow.list( reader.bq_cons( href, $list105 ), ConsesLow.list( click_action, ConsesLow.list( $sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, v_class ) ) ), ConsesLow
        .listS( $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$HREF, href, $kw109$ONCLICK, click_action ), ConsesLow.list( $sym110$PWHEN, link_text, ConsesLow.list( $sym111$HTML_PRINC, link_text ) ), ConsesLow.append(
            body, NIL ) ), $list91 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 14082L)
  public static SubLObject dhtml_visibility_generate_js_for_toggle(final SubLObject object_id)
  {
    assert NIL != Strings.string( object_id ) : object_id;
    return Sequences.cconcatenate( $str123$toggleVisibility__, new SubLObject[] { object_id, $str79$___
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 14289L)
  public static SubLObject dhtml_visibility_generate_js_for_class_toggle(final SubLObject v_class, SubLObject show_or_hide)
  {
    if( show_or_hide == UNPROVIDED )
    {
      show_or_hide = NIL;
    }
    assert NIL != Strings.string( v_class ) : v_class;
    final SubLObject visibility_arg = ( show_or_hide == $kw124$SHOW ) ? $str125$__true : ( ( show_or_hide == $kw126$HIDE ) ? $str127$__false : $str96$ );
    return Sequences.cconcatenate( $str128$toggleClassVisibility__, new SubLObject[] { v_class, $str129$_, visibility_arg, $str130$__
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 14670L)
  public static SubLObject dhtml_switch_visibility_links_with_code(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject object_id = NIL;
    SubLObject show_link_code = NIL;
    SubLObject hide_link_code = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    object_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    show_link_code = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    hide_link_code = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject show_id = $sym132$SHOW_ID;
      final SubLObject show_action = $sym133$SHOW_ACTION;
      final SubLObject hide_id = $sym134$HIDE_ID;
      final SubLObject hide_action = $sym135$HIDE_ACTION;
      return ConsesLow.list( $sym136$CMULTIPLE_VALUE_BIND, ConsesLow.list( show_id, show_action, hide_id, hide_action ), ConsesLow.list( $sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_id ), ConsesLow.list(
          $sym138$DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code ), ConsesLow.list( $sym138$DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action, hide_link_code ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list131 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 15515L)
  public static SubLObject dhtml_switch_class_visibility_links_with_code(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject object_class = NIL;
    SubLObject show_link_code = NIL;
    SubLObject hide_link_code = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
    object_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
    show_link_code = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
    hide_link_code = current.first();
    current = current.rest();
    final SubLObject initially_hiddenP = current.isCons() ? current.first() : T;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list139 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject show_id = $sym140$SHOW_ID;
      final SubLObject show_action = $sym141$SHOW_ACTION;
      final SubLObject hide_id = $sym142$HIDE_ID;
      final SubLObject hide_action = $sym143$HIDE_ACTION;
      final SubLObject show_style = $sym144$SHOW_STYLE;
      final SubLObject hide_style = $sym145$HIDE_STYLE;
      return ConsesLow.list( $sym136$CMULTIPLE_VALUE_BIND, ConsesLow.list( show_id, show_action, hide_id, hide_action ), ConsesLow.list( $sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, object_class ), ConsesLow
          .list( $sym104$CLET, ConsesLow.list( ConsesLow.list( show_style, ConsesLow.listS( $sym147$FIF, initially_hiddenP, $list148 ) ), ConsesLow.list( hide_style, ConsesLow.listS( $sym147$FIF, initially_hiddenP,
              $list149 ) ) ), ConsesLow.list( $sym138$DHTML_SWITCH_VISIBLITY_LINK, show_id, show_action, show_link_code, show_style ), ConsesLow.list( $sym138$DHTML_SWITCH_VISIBLITY_LINK, hide_id, hide_action,
                  hide_link_code, hide_style ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list139 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 16668L)
  public static SubLObject dhtml_visibility_generate_ids_and_actions(final SubLObject object_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_switch_ids( object_id );
    final SubLObject hide_id = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject show_action = dhtml_switch_visibility_generate_show_action( object_id, show_id, hide_id );
    final SubLObject hide_action = dhtml_switch_visibility_generate_hide_action( object_id, show_id, hide_id );
    return Values.values( show_id, show_action, hide_id, hide_action );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 17164L)
  public static SubLObject dhtml_class_visibility_generate_ids_and_actions(final SubLObject object_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_class_visibility_generate_switch_ids( object_class );
    final SubLObject hide_id = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject show_action = dhtml_switch_class_visibility_generate_show_action( object_class, show_id, hide_id );
    final SubLObject hide_action = dhtml_switch_class_visibility_generate_hide_action( object_class, show_id, hide_id );
    return Values.values( show_id, show_action, hide_id, hide_action );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 17684L)
  public static SubLObject dhtml_visibility_declare_dom_objects(final SubLObject show_id, final SubLObject hide_id)
  {
    dhtml_set_visibility( show_id, $kw67$VISIBLE, $kw76$TEXT );
    dhtml_set_visibility( hide_id, $kw68$INVISIBLE, $kw76$TEXT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 17925L)
  public static SubLObject dhtml_switch_visiblity_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject object_id = NIL;
    SubLObject onclick_action = NIL;
    SubLObject link_code = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    object_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    onclick_action = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    link_code = current.first();
    current = current.rest();
    final SubLObject style = current.isCons() ? current.first() : $str96$;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list154 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject href = $sym155$HREF;
      return ConsesLow.list( $sym104$CLET, ConsesLow.list( reader.bq_cons( href, $list105 ) ), ConsesLow.list( $sym156$DHTML_POTENTIALLY_SHOW_TEXT, ConsesLow.list( object_id, $kw95$STYLE, style ), ConsesLow.list(
          $sym157$HTML_SMALL, ConsesLow.list( $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$HREF, href, $kw109$ONCLICK, onclick_action ), link_code ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list154 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 18327L)
  public static SubLObject dhtml_switch_visibility_generate_show_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id)
  {
    return Sequences.cconcatenate( dhtml_generate_visibility_setter( object_id, $kw67$VISIBLE, $kw73$PARAGRAPH ), new SubLObject[] { dhtml_generate_visibility_setter( show_id, $kw68$INVISIBLE, $kw76$TEXT ),
      dhtml_generate_visibility_setter( hide_id, $kw67$VISIBLE, $kw76$TEXT )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 18658L)
  public static SubLObject dhtml_switch_visibility_generate_hide_action(final SubLObject object_id, final SubLObject show_id, final SubLObject hide_id)
  {
    return Sequences.cconcatenate( dhtml_generate_visibility_setter( object_id, $kw68$INVISIBLE, $kw73$PARAGRAPH ), new SubLObject[] { dhtml_generate_visibility_setter( show_id, $kw67$VISIBLE, $kw76$TEXT ),
      dhtml_generate_visibility_setter( hide_id, $kw68$INVISIBLE, $kw76$TEXT )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 18976L)
  public static SubLObject dhtml_switch_class_visibility_generate_show_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id)
  {
    return Sequences.cconcatenate( dhtml_generate_class_visibility_toggle( object_class, $kw124$SHOW ), new SubLObject[] { dhtml_generate_visibility_setter( show_id, $kw68$INVISIBLE, $kw76$TEXT ),
      dhtml_generate_visibility_setter( hide_id, $kw67$VISIBLE, $kw76$TEXT )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 19295L)
  public static SubLObject dhtml_switch_class_visibility_generate_hide_action(final SubLObject object_class, final SubLObject show_id, final SubLObject hide_id)
  {
    return Sequences.cconcatenate( dhtml_generate_class_visibility_toggle( object_class, $kw126$HIDE ), new SubLObject[] { dhtml_generate_visibility_setter( show_id, $kw67$VISIBLE, $kw76$TEXT ),
      dhtml_generate_visibility_setter( hide_id, $kw68$INVISIBLE, $kw76$TEXT )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 19615L)
  public static SubLObject dhtml_change_visibile_section(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list158 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list158 );
      if( NIL == conses_high.member( current_$9, $list159, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
    }
    final SubLObject show_tail = cdestructuring_bind.property_list_member( $kw124$SHOW, current );
    final SubLObject show = ( NIL != show_tail ) ? conses_high.cadr( show_tail ) : NIL;
    final SubLObject hide_tail = cdestructuring_bind.property_list_member( $kw126$HIDE, current );
    final SubLObject hide = ( NIL != hide_tail ) ? conses_high.cadr( hide_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym107$HTML_FANCY_ANCHOR, ConsesLow.list( $kw108$HREF, $list160, $kw109$ONCLICK, ConsesLow.list( $sym9$HTML_MARKUP, ConsesLow.list( $sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, show,
        hide ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 20045L)
  public static SubLObject dhtml_change_visible_section_onclick(final SubLObject show, final SubLObject hide)
  {
    return Sequences.cconcatenate( $str77$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy( show ), $str163$___block___setVisibility__, format_nil.format_nil_a_no_copy( hide ), $str164$___none___
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21088L)
  public static SubLObject dhtml_switch_visibility_links(final SubLObject object_id, final SubLObject show_link_text, final SubLObject hide_link_text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_ids_and_actions( object_id );
    final SubLObject show_action = thread.secondMultipleValue();
    final SubLObject hide_id = thread.thirdMultipleValue();
    final SubLObject hide_action = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != show_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( show_link_text );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != hide_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( hide_link_text );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21310L)
  public static SubLObject dhtml_switch_visibility_links_plus_minus(final SubLObject object_id, final SubLObject text)
  {
    return dhtml_switch_visibility_links_icons( object_id, text, $kw178$SQUARE_MINUS, $kw180$SQUARE_PLUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21476L)
  public static SubLObject dhtml_switch_visibility_links_arrows(final SubLObject object_id, final SubLObject text)
  {
    return dhtml_switch_visibility_links_icons( object_id, text, $kw165$RIGHT_TRIANGLE_V, $kw170$DOWN_TRIANGLE_V );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21646L)
  public static SubLObject dhtml_switch_class_visibility_links_arrows(final SubLObject object_class, final SubLObject text, SubLObject initially_hiddenP)
  {
    if( initially_hiddenP == UNPROVIDED )
    {
      initially_hiddenP = T;
    }
    return dhtml_switch_class_visibility_links_icons( object_class, text, $kw165$RIGHT_TRIANGLE_V, $kw170$DOWN_TRIANGLE_V, initially_hiddenP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 21904L)
  public static SubLObject dhtml_switch_visibility_links_icons(final SubLObject object_id, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_ids_and_actions( object_id );
    final SubLObject show_action = thread.secondMultipleValue();
    final SubLObject hide_id = thread.thirdMultipleValue();
    final SubLObject hide_action = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != show_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( show_icon ) );
        final SubLObject align = $kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( show_icon );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != hide_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( hide_icon ) );
        final SubLObject align = $kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( hide_icon );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_princ( text );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 22213L)
  public static SubLObject dhtml_switch_class_visibility_links_icons(final SubLObject object_class, final SubLObject text, final SubLObject show_icon, final SubLObject hide_icon, SubLObject initially_hiddenP)
  {
    if( initially_hiddenP == UNPROVIDED )
    {
      initially_hiddenP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_class_visibility_generate_ids_and_actions( object_class );
    final SubLObject show_action = thread.secondMultipleValue();
    final SubLObject hide_id = thread.thirdMultipleValue();
    final SubLObject hide_action = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    final SubLObject show_style = ( NIL != initially_hiddenP ) ? $str185$display_inline : $str186$display_none;
    final SubLObject hide_style = ( NIL != initially_hiddenP ) ? $str186$display_none : $str185$display_inline;
    SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != show_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( show_style );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( show_icon ) );
        final SubLObject align = $kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( show_icon );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != hide_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( hide_style );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( hide_icon ) );
        final SubLObject align = $kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( hide_icon );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_princ( text );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 22599L)
  public static SubLObject dhtml_switch_visibility_links_arrows_and_text(final SubLObject object_id, final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_ids_and_actions( object_id );
    final SubLObject show_action = thread.secondMultipleValue();
    final SubLObject hide_id = thread.thirdMultipleValue();
    final SubLObject hide_action = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != show_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw165$RIGHT_TRIANGLE_V ) );
        final SubLObject align = $kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw165$RIGHT_TRIANGLE_V );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        html_utilities.html_princ( text );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != hide_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw170$DOWN_TRIANGLE_V ) );
        final SubLObject align = $kw42$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw170$DOWN_TRIANGLE_V );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        html_utilities.html_princ( text );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 22972L)
  public static SubLObject dhtml_switch_visibility_links_left_arrows(final SubLObject object_id, final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_princ( text );
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_ids_and_actions( object_id );
    final SubLObject show_action = thread.secondMultipleValue();
    final SubLObject hide_id = thread.thirdMultipleValue();
    final SubLObject hide_action = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != show_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw168$LEFT_TRIANGLE_V ) );
        final SubLObject align = $kw184$CENTER;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw168$LEFT_TRIANGLE_V );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != hide_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw170$DOWN_TRIANGLE_V ) );
        final SubLObject align = $kw184$CENTER;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw170$DOWN_TRIANGLE_V );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23241L)
  public static SubLObject dhtml_switch_visibility_links_up_arrows(final SubLObject object_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject show_id = dhtml_visibility_generate_ids_and_actions( object_id );
    final SubLObject show_action = thread.secondMultipleValue();
    final SubLObject hide_id = thread.thirdMultipleValue();
    final SubLObject hide_action = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != show_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( show_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw165$RIGHT_TRIANGLE_V ) );
        final SubLObject align = $kw184$CENTER;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw165$RIGHT_TRIANGLE_V );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    href = $dhtml_blank_href_js$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    if( NIL != hide_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str96$ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( hide_action );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw173$UP_TRIANGLE_V ) );
        final SubLObject align = $kw184$CENTER;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw173$UP_TRIANGLE_V );
        final SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( image_src );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != alt )
        {
          html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( alt );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != align )
        {
          html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != border )
        {
          html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( border );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23485L)
  public static SubLObject dhtml_switch_visibility_no_arrow()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw175$BLANK_TRIANGLE ) );
    final SubLObject align = $kw42$TOP;
    final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw175$BLANK_TRIANGLE );
    final SubLObject border = ZERO_INTEGER;
    html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( image_src );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != alt )
    {
      html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( alt );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != align )
    {
      html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( align ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != border )
    {
      html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( border );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    html_utilities.html_glyph( $kw187$NBSP, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 23933L)
  public static SubLObject get_next_html_element_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = $html_element_id$.getDynamicValue( thread );
    $html_element_id$.setDynamicValue( Numbers.add( $html_element_id$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24057L)
  public static SubLObject basic_ajax_scripts()
  {
    cyc_file_dependencies.javascript( $kw188$CONNECTION );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24173L)
  public static SubLObject with_delayed_html_load_support(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym104$CLET, $list189, $list190, $list191, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 24884L)
  public static SubLObject js_delayed_load(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject handler = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    handler = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    args = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$32 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list193 );
      current_$32 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list193 );
      if( NIL == conses_high.member( current_$32, $list194, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$32 == $kw41$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list193 );
    }
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw195$MESSAGE, current );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : $str96$;
    final SubLObject tag_tail = cdestructuring_bind.property_list_member( $kw196$TAG, current );
    final SubLObject tag = ( NIL != tag_tail ) ? conses_high.cadr( tag_tail ) : $str197$span;
    final SubLObject delay_tail = cdestructuring_bind.property_list_member( $kw198$DELAY, current );
    final SubLObject delay = ( NIL != delay_tail ) ? conses_high.cadr( delay_tail ) : $int199$50;
    return ConsesLow.list( $sym200$JS_DELAYED_LOAD_INT, ConsesLow.listS( $sym201$LIST, $kw202$HANDLER, handler, $kw203$ARGS, args, ConsesLow.append( ( NIL != message ) ? ConsesLow.list( $kw195$MESSAGE, message ) : NIL,
        ( NIL != tag ) ? ConsesLow.list( $kw196$TAG, tag ) : NIL, ( NIL != delay ) ? ConsesLow.list( $kw198$DELAY, delay ) : NIL, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 25713L)
  public static SubLObject js_delayed_load_int(final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject handler_tail = cdestructuring_bind.property_list_member( $kw202$HANDLER, plist );
    final SubLObject handler = ( NIL != handler_tail ) ? conses_high.cadr( handler_tail ) : NIL;
    final SubLObject args_tail = cdestructuring_bind.property_list_member( $kw203$ARGS, plist );
    final SubLObject args = ( NIL != args_tail ) ? conses_high.cadr( args_tail ) : NIL;
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw195$MESSAGE, plist );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : NIL;
    final SubLObject tag_tail = cdestructuring_bind.property_list_member( $kw196$TAG, plist );
    final SubLObject tag = ( NIL != tag_tail ) ? conses_high.cadr( tag_tail ) : NIL;
    final SubLObject delay_tail = cdestructuring_bind.property_list_member( $kw198$DELAY, plist );
    final SubLObject delay = ( NIL != delay_tail ) ? conses_high.cadr( delay_tail ) : NIL;
    final SubLObject url = make_url_from_handler_and_args( handler, args );
    final SubLObject elt_id = Sequences.cconcatenate( $str205$cyc_elt_, format_nil.format_nil_a_no_copy( $html_element_id$.getDynamicValue( thread ) ) );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str206$__A_id___A___A___A_, new SubLObject[] { tag, elt_id, message, tag
    } );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str207$_script_type__text_javascript__tr, new SubLObject[] { url, elt_id, delay, elt_id, message
    } );
    $html_element_id$.setDynamicValue( Numbers.add( $html_element_id$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 26365L)
  public static SubLObject make_url_from_handler_and_args(final SubLObject handler, final SubLObject arg_alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject output_string = Sequences.cconcatenate( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ), new SubLObject[] { $str208$_, string_utilities.to_string( handler )
    } );
    SubLObject cdolist_list_var = arg_alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list209 );
      key = current.first();
      current = ( value = current.rest() );
      output_string = Sequences.cconcatenate( output_string, new SubLObject[] { $str210$_, key, $str211$_, cb_utilities.cb_term_identifier( value )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 27009L)
  public static SubLObject init_kea_support()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $kea_set_focal_tool$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/dhtml-macros.lisp", position = 27116L)
  public static SubLObject html_basic_cb_scripts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyc_file_dependencies.css( $kw213$MENU_CSS );
    cyc_file_dependencies.css( $kw214$CB_CYC );
    cyc_file_dependencies.javascript( $kw215$SELECTOR );
    cyc_file_dependencies.javascript( $kw216$EVENT_DELEGATION );
    cyc_file_dependencies.javascript( $kw217$CONTAINER_CORE );
    cyc_file_dependencies.javascript( $kw218$MENU );
    cyc_file_dependencies.javascript( $kw219$OVERLIB );
    cyc_file_dependencies.javascript( $kw220$CB );
    cyc_file_dependencies.javascript( $kw221$CB_INLINE_EDIT );
    cyc_file_dependencies.javascript( $kw222$CYCJS_KEA_SESSION_BUS );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_style_head$.getGlobalValue() );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str223$__yui_skin_sam__editContainer__yu );
    html_utilities.html_markup( html_macros.$html_style_tail$.getGlobalValue() );
    init_kea_support();
    return NIL;
  }

  public static SubLObject declare_dhtml_macros_file()
  {
    SubLFiles.declareMacro( me, "dhtml_with_cascading_style_sheet", "DHTML-WITH-CASCADING-STYLE-SHEET" );
    SubLFiles.declareMacro( me, "dhtml_dom_wrapper", "DHTML-DOM-WRAPPER" );
    SubLFiles.declareFunction( me, "dhtml_dom_wrapper_preamble", "DHTML-DOM-WRAPPER-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_dom_wrapper_postamble", "DHTML-DOM-WRAPPER-POSTAMBLE", 0, 0, false );
    SubLFiles.declareMacro( me, "dhtml_dom_attribute", "DHTML-DOM-ATTRIBUTE" );
    SubLFiles.declareFunction( me, "dhtml_dom_attribute_preamble", "DHTML-DOM-ATTRIBUTE-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_dom_attribute_postamble", "DHTML-DOM-ATTRIBUTE-POSTAMBLE", 0, 0, false );
    SubLFiles.declareMacro( me, "dhtml_declare_dom_object", "DHTML-DECLARE-DOM-OBJECT" );
    SubLFiles.declareFunction( me, "dhtml_with_dom_script", "DHTML-WITH-DOM-SCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "dhtml_creation_scripts", "DHTML-CREATION-SCRIPTS", 0, 0, false );
    SubLFiles.declareFunction( me, "dhtml_lexical_scripts", "DHTML-LEXICAL-SCRIPTS", 0, 0, false );
    SubLFiles.declareFunction( me, "dhtml_with_toggle_visibility_support", "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "flow_type_p", "FLOW-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "visibility_p", "VISIBILITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "invert_visibility", "INVERT-VISIBILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_encode_visibility", "DHTML-ENCODE-VISIBILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "dhtml_generate_visibility_setter", "DHTML-GENERATE-VISIBILITY-SETTER", 2, 1, false );
    SubLFiles.declareFunction( me, "dhtml_generate_class_visibility_toggle", "DHTML-GENERATE-CLASS-VISIBILITY-TOGGLE", 1, 1, false );
    SubLFiles.declareFunction( me, "dhtml_set_visibility", "DHTML-SET-VISIBILITY", 2, 1, false );
    SubLFiles.declareFunction( me, "dhtml_visibility_generate_switch_ids", "DHTML-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_class_visibility_generate_switch_ids", "DHTML-CLASS-VISIBILITY-GENERATE-SWITCH-IDS", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_visibility_generate_show_object_id", "DHTML-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_visibility_generate_hide_object_id", "DHTML-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_class_visibility_generate_show_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-SHOW-OBJECT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_class_visibility_generate_hide_object_id", "DHTML-CLASS-VISIBILITY-GENERATE-HIDE-OBJECT-ID", 1, 0, false );
    SubLFiles.declareMacro( me, "dhtml_potentially_show", "DHTML-POTENTIALLY-SHOW" );
    SubLFiles.declareMacro( me, "dhtml_potentially_show_switched", "DHTML-POTENTIALLY-SHOW-SWITCHED" );
    SubLFiles.declareMacro( me, "dhtml_potentially_show_text", "DHTML-POTENTIALLY-SHOW-TEXT" );
    SubLFiles.declareFunction( me, "dhtml_set_switched_visibility", "DHTML-SET-SWITCHED-VISIBILITY", 2, 1, false );
    SubLFiles.declareMacro( me, "dhtml_set_visibility_link", "DHTML-SET-VISIBILITY-LINK" );
    SubLFiles.declareMacro( me, "dhtml_toggle_visibility_link", "DHTML-TOGGLE-VISIBILITY-LINK" );
    SubLFiles.declareMacro( me, "dhtml_toggle_class_visibility_link", "DHTML-TOGGLE-CLASS-VISIBILITY-LINK" );
    SubLFiles.declareFunction( me, "dhtml_visibility_generate_js_for_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_visibility_generate_js_for_class_toggle", "DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE", 1, 1, false );
    SubLFiles.declareMacro( me, "dhtml_switch_visibility_links_with_code", "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE" );
    SubLFiles.declareMacro( me, "dhtml_switch_class_visibility_links_with_code", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE" );
    SubLFiles.declareFunction( me, "dhtml_visibility_generate_ids_and_actions", "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_class_visibility_generate_ids_and_actions", "DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_visibility_declare_dom_objects", "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS", 2, 0, false );
    SubLFiles.declareMacro( me, "dhtml_switch_visiblity_link", "DHTML-SWITCH-VISIBLITY-LINK" );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_generate_show_action", "DHTML-SWITCH-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_generate_hide_action", "DHTML-SWITCH-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_class_visibility_generate_show_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-SHOW-ACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_class_visibility_generate_hide_action", "DHTML-SWITCH-CLASS-VISIBILITY-GENERATE-HIDE-ACTION", 3, 0, false );
    SubLFiles.declareMacro( me, "dhtml_change_visibile_section", "DHTML-CHANGE-VISIBILE-SECTION" );
    SubLFiles.declareFunction( me, "dhtml_change_visible_section_onclick", "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK", 2, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links", "DHTML-SWITCH-VISIBILITY-LINKS", 3, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links_plus_minus", "DHTML-SWITCH-VISIBILITY-LINKS-PLUS-MINUS", 2, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS", 2, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_class_visibility_links_arrows", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ARROWS", 2, 1, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links_icons", "DHTML-SWITCH-VISIBILITY-LINKS-ICONS", 4, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_class_visibility_links_icons", "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-ICONS", 4, 1, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links_arrows_and_text", "DHTML-SWITCH-VISIBILITY-LINKS-ARROWS-AND-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links_left_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-LEFT-ARROWS", 2, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_links_up_arrows", "DHTML-SWITCH-VISIBILITY-LINKS-UP-ARROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "dhtml_switch_visibility_no_arrow", "DHTML-SWITCH-VISIBILITY-NO-ARROW", 0, 0, false );
    SubLFiles.declareFunction( me, "get_next_html_element_id", "GET-NEXT-HTML-ELEMENT-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "basic_ajax_scripts", "BASIC-AJAX-SCRIPTS", 0, 0, false );
    SubLFiles.declareMacro( me, "with_delayed_html_load_support", "WITH-DELAYED-HTML-LOAD-SUPPORT" );
    SubLFiles.declareMacro( me, "js_delayed_load", "JS-DELAYED-LOAD" );
    SubLFiles.declareFunction( me, "js_delayed_load_int", "JS-DELAYED-LOAD-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_url_from_handler_and_args", "MAKE-URL-FROM-HANDLER-AND-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "init_kea_support", "INIT-KEA-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "html_basic_cb_scripts", "HTML-BASIC-CB-SCRIPTS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_dhtml_macros_file()
  {
    $dhtml_css_head$ = SubLFiles.defconstant( "*DHTML-CSS-HEAD*", $str0$_style );
    $dhtml_css_type$ = SubLFiles.defconstant( "*DHTML-CSS-TYPE*", $str1$_type_ );
    $dhtml_css_media$ = SubLFiles.defconstant( "*DHTML-CSS-MEDIA*", $str2$_media_ );
    $dhtml_css_tail$ = SubLFiles.defconstant( "*DHTML-CSS-TAIL*", $str3$__style_ );
    $dhtml_dom_position$ = SubLFiles.defconstant( "*DHTML-DOM-POSITION*", $str16$position );
    $dhtml_dom_top$ = SubLFiles.defconstant( "*DHTML-DOM-TOP*", $str17$top );
    $dhtml_dom_bottom$ = SubLFiles.defconstant( "*DHTML-DOM-BOTTOM*", $str18$bottom );
    $dhtml_dom_right$ = SubLFiles.defconstant( "*DHTML-DOM-RIGHT*", $str19$right );
    $dhtml_dom_left$ = SubLFiles.defconstant( "*DHTML-DOM-LEFT*", $str20$left );
    $dhtml_dom_visibility$ = SubLFiles.defconstant( "*DHTML-DOM-VISIBILITY*", $str21$visibility );
    $dhtml_dom_display$ = SubLFiles.defconstant( "*DHTML-DOM-DISPLAY*", $str22$display );
    $dhtml_dom_height$ = SubLFiles.defconstant( "*DHTML-DOM-HEIGHT*", $str23$height );
    $dhtml_dom_width$ = SubLFiles.defconstant( "*DHTML-DOM-WIDTH*", $str24$width );
    $dhtml_blank_href_js$ = SubLFiles.defconstant( "*DHTML-BLANK-HREF-JS*", $str61$javascript_void____ );
    $html_element_id$ = SubLFiles.defparameter( "*HTML-ELEMENT-ID*", ZERO_INTEGER );
    $js_load_later$ = SubLFiles.deflexical( "*JS-LOAD-LATER*", $str192$_script_type__text_javascript__fu );
    $kea_set_focal_tool$ = SubLFiles.deflexical( "*KEA-SET-FOCAL-TOOL*", $str212$_if__isKeaHosted________var_keaBu );
    return NIL;
  }

  public static SubLObject setup_dhtml_macros_file()
  {
    access_macros.register_macro_helper( $sym26$DHTML_DOM_WRAPPER_PREAMBLE, $sym28$DHTML_DOM_WRAPPER );
    access_macros.register_macro_helper( $sym30$DHTML_DOM_WRAPPER_POSTAMBLE, $sym28$DHTML_DOM_WRAPPER );
    access_macros.register_macro_helper( $sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE, $sym35$DHTML_DOM_ATTRIBUTE );
    access_macros.register_macro_helper( $sym37$DHTML_DOM_ATTRIBUTE_POSTAMBLE, $sym35$DHTML_DOM_ATTRIBUTE );
    access_macros.register_macro_helper( $sym92$DHTML_SET_SWITCHED_VISIBILITY, $sym98$DHTML_POTENTIALLY_SHOW_SWITCHED );
    access_macros.register_macro_helper( $sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE, $sym121$DHTML_TOGGLE_VISIBILITY_LINK );
    access_macros.register_macro_helper( $sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE, $sym121$DHTML_TOGGLE_VISIBILITY_LINK );
    meta_macros.declare_indention_pattern( $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE, $list151 );
    access_macros.register_macro_helper( $sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS, $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE );
    access_macros.register_macro_helper( $sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS, $sym152$DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE );
    access_macros.register_macro_helper( $sym153$DHTML_VISIBILITY_DECLARE_DOM_OBJECTS, $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE );
    access_macros.register_macro_helper( $sym138$DHTML_SWITCH_VISIBLITY_LINK, $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE );
    access_macros.register_macro_helper( $sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK, $sym162$DHTML_CHANGE_VISIBILE_SECTION );
    Hashtables.sethash( $kw165$RIGHT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str166$cyc_right_triangle_violet_gif, $str167$_Show_ ) );
    Hashtables.sethash( $kw168$LEFT_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str169$cyc_left_triangle_violet_gif, $str167$_Show_ ) );
    Hashtables.sethash( $kw170$DOWN_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str171$cyc_down_triangle_violet_gif, $str172$_Hide_ ) );
    Hashtables.sethash( $kw173$UP_TRIANGLE_V, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str174$cyc_up_triangle_violet_gif, $str172$_Hide_ ) );
    Hashtables.sethash( $kw175$BLANK_TRIANGLE, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str176$cyc_no_triangle_violet_gif, $str177$__ ) );
    Hashtables.sethash( $kw178$SQUARE_MINUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str179$square_minus_gif, $str167$_Show_ ) );
    Hashtables.sethash( $kw180$SQUARE_PLUS, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str181$square_plus_gif, $str172$_Hide_ ) );
    Hashtables.sethash( $kw182$SQUARE_BLANK, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str183$square_blank_gif, $str177$__ ) );
    access_macros.register_macro_helper( $sym200$JS_DELAYED_LOAD_INT, $sym204$JS_DELAYED_LOAD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_dhtml_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_dhtml_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_dhtml_macros_file();
  }
  static
  {
    me = new dhtml_macros();
    $dhtml_css_head$ = null;
    $dhtml_css_type$ = null;
    $dhtml_css_media$ = null;
    $dhtml_css_tail$ = null;
    $dhtml_dom_position$ = null;
    $dhtml_dom_top$ = null;
    $dhtml_dom_bottom$ = null;
    $dhtml_dom_right$ = null;
    $dhtml_dom_left$ = null;
    $dhtml_dom_visibility$ = null;
    $dhtml_dom_display$ = null;
    $dhtml_dom_height$ = null;
    $dhtml_dom_width$ = null;
    $dhtml_blank_href_js$ = null;
    $html_element_id$ = null;
    $js_load_later$ = null;
    $kea_set_focal_tool$ = null;
    $str0$_style = makeString( "<style" );
    $str1$_type_ = makeString( " type=" );
    $str2$_media_ = makeString( " media=" );
    $str3$__style_ = makeString( "</style>" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TYPE" ), makeString( "text/css" ) ), ConsesLow.list( makeSymbol( "MEDIA" ), makeString( "screen" ) ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $str5$text_css = makeString( "text/css" );
    $str6$screen = makeString( "screen" );
    $sym7$HTML_QUOTED_ATTRIBUTE = makeSymbol( "HTML-QUOTED-ATTRIBUTE" );
    $list8 = ConsesLow.list( makeSymbol( "*DHTML-CSS-TYPE*" ) );
    $sym9$HTML_MARKUP = makeSymbol( "HTML-MARKUP" );
    $list10 = ConsesLow.list( makeSymbol( "*DHTML-CSS-MEDIA*" ) );
    $sym11$PROGN = makeSymbol( "PROGN" );
    $sym12$HTML_MARKUP_WRAPPER = makeSymbol( "HTML-MARKUP-WRAPPER" );
    $list13 = ConsesLow.list( makeSymbol( "*DHTML-CSS-HEAD*" ), makeSymbol( "*DHTML-CSS-TAIL*" ) );
    $sym14$HTML_MARKUP_BODY = makeSymbol( "HTML-MARKUP-BODY" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-TERPRI" ) ) );
    $str16$position = makeString( "position" );
    $str17$top = makeString( "top" );
    $str18$bottom = makeString( "bottom" );
    $str19$right = makeString( "right" );
    $str20$left = makeString( "left" );
    $str21$visibility = makeString( "visibility" );
    $str22$display = makeString( "display" );
    $str23$height = makeString( "height" );
    $str24$width = makeString( "width" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym26$DHTML_DOM_WRAPPER_PREAMBLE = makeSymbol( "DHTML-DOM-WRAPPER-PREAMBLE" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "DHTML-DOM-WRAPPER-POSTAMBLE" ) ) );
    $sym28$DHTML_DOM_WRAPPER = makeSymbol( "DHTML-DOM-WRAPPER" );
    $str29$__A__ = makeString( "#~A {" );
    $sym30$DHTML_DOM_WRAPPER_POSTAMBLE = makeSymbol( "DHTML-DOM-WRAPPER-POSTAMBLE" );
    $str31$__ = makeString( " }" );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "ATTRIBUTE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym33$DHTML_DOM_ATTRIBUTE_PREAMBLE = makeSymbol( "DHTML-DOM-ATTRIBUTE-PREAMBLE" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "DHTML-DOM-ATTRIBUTE-POSTAMBLE" ) ) );
    $sym35$DHTML_DOM_ATTRIBUTE = makeSymbol( "DHTML-DOM-ATTRIBUTE" );
    $str36$__A_ = makeString( " ~A:" );
    $sym37$DHTML_DOM_ATTRIBUTE_POSTAMBLE = makeSymbol( "DHTML-DOM-ATTRIBUTE-POSTAMBLE" );
    $str38$_ = makeString( ";" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "TOP" ), makeSymbol( "BOTTOM" ), makeSymbol( "RIGHT" ), makeSymbol( "LEFT" ),
      makeSymbol( "HEIGHT" ), makeSymbol( "WIDTH" ), makeSymbol( "POSITION" ), makeSymbol( "VISIBILITY" ), makeSymbol( "DISPLAY" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) ) );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "TOP" ), makeKeyword( "BOTTOM" ), makeKeyword( "RIGHT" ), makeKeyword( "LEFT" ), makeKeyword( "HEIGHT" ), makeKeyword( "WIDTH" ), makeKeyword( "POSITION" ),
      makeKeyword( "VISIBILITY" ), makeKeyword( "DISPLAY" )
    } );
    $kw41$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw42$TOP = makeKeyword( "TOP" );
    $kw43$BOTTOM = makeKeyword( "BOTTOM" );
    $kw44$RIGHT = makeKeyword( "RIGHT" );
    $kw45$LEFT = makeKeyword( "LEFT" );
    $kw46$HEIGHT = makeKeyword( "HEIGHT" );
    $kw47$WIDTH = makeKeyword( "WIDTH" );
    $kw48$POSITION = makeKeyword( "POSITION" );
    $kw49$VISIBILITY = makeKeyword( "VISIBILITY" );
    $kw50$DISPLAY = makeKeyword( "DISPLAY" );
    $list51 = ConsesLow.list( makeSymbol( "*DHTML-DOM-POSITION*" ) );
    $list52 = ConsesLow.list( makeSymbol( "*DHTML-DOM-TOP*" ) );
    $list53 = ConsesLow.list( makeSymbol( "*DHTML-DOM-BOTTOM*" ) );
    $list54 = ConsesLow.list( makeSymbol( "*DHTML-DOM-LEFT*" ) );
    $list55 = ConsesLow.list( makeSymbol( "*DHTML-DOM-RIGHT*" ) );
    $list56 = ConsesLow.list( makeSymbol( "*DHTML-DOM-VISIBILITY*" ) );
    $list57 = ConsesLow.list( makeSymbol( "*DHTML-DOM-DISPLAY*" ) );
    $list58 = ConsesLow.list( makeSymbol( "*DHTML-DOM-HEIGHT*" ) );
    $list59 = ConsesLow.list( makeSymbol( "*DHTML-DOM-WIDTH*" ) );
    $list60 = ConsesLow.list( makeSymbol( "HTML-TERPRI" ) );
    $str61$javascript_void____ = makeString( "javascript:void('')" );
    $kw62$FINDDOM = makeKeyword( "FINDDOM" );
    $kw63$CONSTANT_CREATION = makeKeyword( "CONSTANT-CREATION" );
    $kw64$LEXICAL = makeKeyword( "LEXICAL" );
    $list65 = ConsesLow.list( makeKeyword( "PARAGRAPH" ), makeKeyword( "TEXT" ) );
    $list66 = ConsesLow.list( makeKeyword( "VISIBLE" ), makeKeyword( "INVISIBLE" ) );
    $kw67$VISIBLE = makeKeyword( "VISIBLE" );
    $kw68$INVISIBLE = makeKeyword( "INVISIBLE" );
    $str69$_S_was_not_a_known_visibility_p = makeString( "~S was not a known visibility-p" );
    $sym70$VISIBILITY_P = makeSymbol( "VISIBILITY-P" );
    $sym71$FLOW_TYPE_P = makeSymbol( "FLOW-TYPE-P" );
    $str72$none = makeString( "none" );
    $kw73$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $str74$block = makeString( "block" );
    $str75$inline = makeString( "inline" );
    $kw76$TEXT = makeKeyword( "TEXT" );
    $str77$setVisibility__ = makeString( "setVisibility('" );
    $str78$___ = makeString( "','" );
    $str79$___ = makeString( "');" );
    $sym80$STRINGP = makeSymbol( "STRINGP" );
    $str81$_show_button = makeString( "_show_button" );
    $str82$_hide_button = makeString( "_hide_button" );
    $sym83$WHITESPACEP = makeSymbol( "WHITESPACEP" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "INITIAL-VISIBILITY" ), makeKeyword( "VISIBLE" ) ), ConsesLow.list( makeSymbol( "FLOW-TYPE" ),
        makeKeyword( "TEXT" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list85 = ConsesLow.list( makeKeyword( "INITIAL-VISIBILITY" ), makeKeyword( "FLOW-TYPE" ) );
    $kw86$INITIAL_VISIBILITY = makeKeyword( "INITIAL-VISIBILITY" );
    $kw87$FLOW_TYPE = makeKeyword( "FLOW-TYPE" );
    $sym88$DHTML_SET_VISIBILITY = makeSymbol( "DHTML-SET-VISIBILITY" );
    $sym89$HTML_FANCY_DIV = makeSymbol( "HTML-FANCY-DIV" );
    $kw90$ID = makeKeyword( "ID" );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SOURCE-READABILITY-TERPRI" ) ) );
    $sym92$DHTML_SET_SWITCHED_VISIBILITY = makeSymbol( "DHTML-SET-SWITCHED-VISIBILITY" );
    $list93 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "STYLE" ), makeString( "" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list94 = ConsesLow.list( makeKeyword( "STYLE" ) );
    $kw95$STYLE = makeKeyword( "STYLE" );
    $str96$ = makeString( "" );
    $sym97$HTML_FANCY_SPAN = makeSymbol( "HTML-FANCY-SPAN" );
    $sym98$DHTML_POTENTIALLY_SHOW_SWITCHED = makeSymbol( "DHTML-POTENTIALLY-SHOW-SWITCHED" );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "VISIBILITY" ), makeSymbol( "&KEY" ), makeSymbol( "LINK-TEXT" ), ConsesLow.list( makeSymbol( "FLOW-TYPE" ), makeKeyword( "TEXT" ) ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list100 = ConsesLow.list( makeKeyword( "LINK-TEXT" ), makeKeyword( "FLOW-TYPE" ) );
    $kw101$LINK_TEXT = makeKeyword( "LINK-TEXT" );
    $sym102$HREF = makeUninternedSymbol( "HREF" );
    $sym103$CLICK_ACTION = makeUninternedSymbol( "CLICK-ACTION" );
    $sym104$CLET = makeSymbol( "CLET" );
    $list105 = ConsesLow.list( makeSymbol( "*DHTML-BLANK-HREF-JS*" ) );
    $sym106$DHTML_GENERATE_VISIBILITY_SETTER = makeSymbol( "DHTML-GENERATE-VISIBILITY-SETTER" );
    $sym107$HTML_FANCY_ANCHOR = makeSymbol( "HTML-FANCY-ANCHOR" );
    $kw108$HREF = makeKeyword( "HREF" );
    $kw109$ONCLICK = makeKeyword( "ONCLICK" );
    $sym110$PWHEN = makeSymbol( "PWHEN" );
    $sym111$HTML_PRINC = makeSymbol( "HTML-PRINC" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "&KEY" ), makeSymbol( "LINK-TEXT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list113 = ConsesLow.list( makeKeyword( "LINK-TEXT" ) );
    $sym114$HREF = makeUninternedSymbol( "HREF" );
    $sym115$CLICK_ACTION = makeUninternedSymbol( "CLICK-ACTION" );
    $sym116$DHTML_VISIBILITY_GENERATE_JS_FOR_TOGGLE = makeSymbol( "DHTML-VISIBILITY-GENERATE-JS-FOR-TOGGLE" );
    $list117 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "&KEY" ), makeSymbol( "LINK-TEXT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym118$HREF = makeUninternedSymbol( "HREF" );
    $sym119$CLICK_ACTION = makeUninternedSymbol( "CLICK-ACTION" );
    $sym120$DHTML_VISIBILITY_GENERATE_JS_FOR_CLASS_TOGGLE = makeSymbol( "DHTML-VISIBILITY-GENERATE-JS-FOR-CLASS-TOGGLE" );
    $sym121$DHTML_TOGGLE_VISIBILITY_LINK = makeSymbol( "DHTML-TOGGLE-VISIBILITY-LINK" );
    $sym122$STRING = makeSymbol( "STRING" );
    $str123$toggleVisibility__ = makeString( "toggleVisibility('" );
    $kw124$SHOW = makeKeyword( "SHOW" );
    $str125$__true = makeString( ", true" );
    $kw126$HIDE = makeKeyword( "HIDE" );
    $str127$__false = makeString( ", false" );
    $str128$toggleClassVisibility__ = makeString( "toggleClassVisibility('" );
    $str129$_ = makeString( "'" );
    $str130$__ = makeString( ");" );
    $list131 = ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "SHOW-LINK-CODE" ), makeSymbol( "HIDE-LINK-CODE" ) );
    $sym132$SHOW_ID = makeUninternedSymbol( "SHOW-ID" );
    $sym133$SHOW_ACTION = makeUninternedSymbol( "SHOW-ACTION" );
    $sym134$HIDE_ID = makeUninternedSymbol( "HIDE-ID" );
    $sym135$HIDE_ACTION = makeUninternedSymbol( "HIDE-ACTION" );
    $sym136$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym137$DHTML_VISIBILITY_GENERATE_IDS_AND_ACTIONS = makeSymbol( "DHTML-VISIBILITY-GENERATE-IDS-AND-ACTIONS" );
    $sym138$DHTML_SWITCH_VISIBLITY_LINK = makeSymbol( "DHTML-SWITCH-VISIBLITY-LINK" );
    $list139 = ConsesLow.list( makeSymbol( "OBJECT-CLASS" ), makeSymbol( "SHOW-LINK-CODE" ), makeSymbol( "HIDE-LINK-CODE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INITIALLY-HIDDEN?" ), T ) );
    $sym140$SHOW_ID = makeUninternedSymbol( "SHOW-ID" );
    $sym141$SHOW_ACTION = makeUninternedSymbol( "SHOW-ACTION" );
    $sym142$HIDE_ID = makeUninternedSymbol( "HIDE-ID" );
    $sym143$HIDE_ACTION = makeUninternedSymbol( "HIDE-ACTION" );
    $sym144$SHOW_STYLE = makeUninternedSymbol( "SHOW-STYLE" );
    $sym145$HIDE_STYLE = makeUninternedSymbol( "HIDE-STYLE" );
    $sym146$DHTML_CLASS_VISIBILITY_GENERATE_IDS_AND_ACTIONS = makeSymbol( "DHTML-CLASS-VISIBILITY-GENERATE-IDS-AND-ACTIONS" );
    $sym147$FIF = makeSymbol( "FIF" );
    $list148 = ConsesLow.list( makeString( "display:inline" ), makeString( "display:none" ) );
    $list149 = ConsesLow.list( makeString( "display:none" ), makeString( "display:inline" ) );
    $sym150$DHTML_SWITCH_VISIBILITY_LINKS_WITH_CODE = makeSymbol( "DHTML-SWITCH-VISIBILITY-LINKS-WITH-CODE" );
    $list151 = ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym152$DHTML_SWITCH_CLASS_VISIBILITY_LINKS_WITH_CODE = makeSymbol( "DHTML-SWITCH-CLASS-VISIBILITY-LINKS-WITH-CODE" );
    $sym153$DHTML_VISIBILITY_DECLARE_DOM_OBJECTS = makeSymbol( "DHTML-VISIBILITY-DECLARE-DOM-OBJECTS" );
    $list154 = ConsesLow.list( makeSymbol( "OBJECT-ID" ), makeSymbol( "ONCLICK-ACTION" ), makeSymbol( "LINK-CODE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STYLE" ), makeString( "" ) ) );
    $sym155$HREF = makeUninternedSymbol( "HREF" );
    $sym156$DHTML_POTENTIALLY_SHOW_TEXT = makeSymbol( "DHTML-POTENTIALLY-SHOW-TEXT" );
    $sym157$HTML_SMALL = makeSymbol( "HTML-SMALL" );
    $list158 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SHOW" ), makeSymbol( "HIDE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list159 = ConsesLow.list( makeKeyword( "SHOW" ), makeKeyword( "HIDE" ) );
    $list160 = ConsesLow.list( makeSymbol( "HTML-MARKUP" ), ConsesLow.list( makeSymbol( "JAVASCRIPT-VOID-URL" ) ) );
    $sym161$DHTML_CHANGE_VISIBLE_SECTION_ONCLICK = makeSymbol( "DHTML-CHANGE-VISIBLE-SECTION-ONCLICK" );
    $sym162$DHTML_CHANGE_VISIBILE_SECTION = makeSymbol( "DHTML-CHANGE-VISIBILE-SECTION" );
    $str163$___block___setVisibility__ = makeString( "','block');setVisibility('" );
    $str164$___none___ = makeString( "','none');" );
    $kw165$RIGHT_TRIANGLE_V = makeKeyword( "RIGHT-TRIANGLE-V" );
    $str166$cyc_right_triangle_violet_gif = makeString( "cyc-right-triangle-violet.gif" );
    $str167$_Show_ = makeString( "[Show]" );
    $kw168$LEFT_TRIANGLE_V = makeKeyword( "LEFT-TRIANGLE-V" );
    $str169$cyc_left_triangle_violet_gif = makeString( "cyc-left-triangle-violet.gif" );
    $kw170$DOWN_TRIANGLE_V = makeKeyword( "DOWN-TRIANGLE-V" );
    $str171$cyc_down_triangle_violet_gif = makeString( "cyc-down-triangle-violet.gif" );
    $str172$_Hide_ = makeString( "[Hide]" );
    $kw173$UP_TRIANGLE_V = makeKeyword( "UP-TRIANGLE-V" );
    $str174$cyc_up_triangle_violet_gif = makeString( "cyc-up-triangle-violet.gif" );
    $kw175$BLANK_TRIANGLE = makeKeyword( "BLANK-TRIANGLE" );
    $str176$cyc_no_triangle_violet_gif = makeString( "cyc-no-triangle-violet.gif" );
    $str177$__ = makeString( "  " );
    $kw178$SQUARE_MINUS = makeKeyword( "SQUARE-MINUS" );
    $str179$square_minus_gif = makeString( "square-minus.gif" );
    $kw180$SQUARE_PLUS = makeKeyword( "SQUARE-PLUS" );
    $str181$square_plus_gif = makeString( "square-plus.gif" );
    $kw182$SQUARE_BLANK = makeKeyword( "SQUARE-BLANK" );
    $str183$square_blank_gif = makeString( "square-blank.gif" );
    $kw184$CENTER = makeKeyword( "CENTER" );
    $str185$display_inline = makeString( "display:inline" );
    $str186$display_none = makeString( "display:none" );
    $kw187$NBSP = makeKeyword( "NBSP" );
    $kw188$CONNECTION = makeKeyword( "CONNECTION" );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-ELEMENT-ID*" ), ZERO_INTEGER ) );
    $list190 = ConsesLow.list( makeSymbol( "BASIC-AJAX-SCRIPTS" ) );
    $list191 = ConsesLow.list( makeSymbol( "HTML-MARKUP" ), makeSymbol( "*JS-LOAD-LATER*" ) );
    $str192$_script_type__text_javascript__fu = makeString(
        "<script type='text/javascript'>function loadLater(url, id) {\n  var callback = {success: handleDelayedLoad, \n                  failure: handleFailedDelayedLoad,\n                  argument: {eltId: id}};\n  YAHOO.util.Connect.asyncRequest('get', url, callback);\n}\nfunction handleDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML=o.responseText;\n}\nfunction handleFailedDelayedLoad(o) {\n  document.getElementById(o.argument.eltId).innerHTML='Unable to load';\n}\n</script>\n" );
    $list193 = ConsesLow.list( makeSymbol( "HANDLER" ), makeSymbol( "ARGS" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "" ) ), ConsesLow.list( makeSymbol( "TAG" ), makeString(
        "span" ) ), ConsesLow.list( makeSymbol( "DELAY" ), makeInteger( 50 ) ) );
    $list194 = ConsesLow.list( makeKeyword( "MESSAGE" ), makeKeyword( "TAG" ), makeKeyword( "DELAY" ) );
    $kw195$MESSAGE = makeKeyword( "MESSAGE" );
    $kw196$TAG = makeKeyword( "TAG" );
    $str197$span = makeString( "span" );
    $kw198$DELAY = makeKeyword( "DELAY" );
    $int199$50 = makeInteger( 50 );
    $sym200$JS_DELAYED_LOAD_INT = makeSymbol( "JS-DELAYED-LOAD-INT" );
    $sym201$LIST = makeSymbol( "LIST" );
    $kw202$HANDLER = makeKeyword( "HANDLER" );
    $kw203$ARGS = makeKeyword( "ARGS" );
    $sym204$JS_DELAYED_LOAD = makeSymbol( "JS-DELAYED-LOAD" );
    $str205$cyc_elt_ = makeString( "cyc-elt-" );
    $str206$__A_id___A___A___A_ = makeString( "<~A id='~A'>~A</~A>" );
    $str207$_script_type__text_javascript__tr = makeString(
        "<script type='text/javascript'>try {YAHOO.util.Event.addListener(window, 'load', setTimeout(\"loadLater('~A', '~A')\", ~A));} catch(err) {document.getElementById('~a').innerHTML='Error ~A';}</script>" );
    $str208$_ = makeString( "?" );
    $list209 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $str210$_ = makeString( "&" );
    $str211$_ = makeString( "=" );
    $str212$_if__isKeaHosted________var_keaBu = makeString(
        "\nif (isKeaHosted()) {\n  var keaBus = new KEASessionBus();\n  YAHOO.util.Event.onDOMReady(function() {\n    window.onfocus = function() {\n      keaBus.setFocalTool('');\n      keaBus.setFocalTool('legacyToolFocus');\n    }; \n  });\n}" );
    $kw213$MENU_CSS = makeKeyword( "MENU-CSS" );
    $kw214$CB_CYC = makeKeyword( "CB-CYC" );
    $kw215$SELECTOR = makeKeyword( "SELECTOR" );
    $kw216$EVENT_DELEGATION = makeKeyword( "EVENT-DELEGATION" );
    $kw217$CONTAINER_CORE = makeKeyword( "CONTAINER-CORE" );
    $kw218$MENU = makeKeyword( "MENU" );
    $kw219$OVERLIB = makeKeyword( "OVERLIB" );
    $kw220$CB = makeKeyword( "CB" );
    $kw221$CB_INLINE_EDIT = makeKeyword( "CB-INLINE-EDIT" );
    $kw222$CYCJS_KEA_SESSION_BUS = makeKeyword( "CYCJS-KEA-SESSION-BUS" );
    $str223$__yui_skin_sam__editContainer__yu = makeString( " .yui-skin-sam .editContainer .yui-ac-input { position:relative; width:10em; }" );
  }
}
/*
 * 
 * Total time: 726 ms
 * 
 */