package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class obsolete_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.obsolete_macros";
  public static final String myFingerPrint = "e50e4d64f3f3c35f003e4fc623b37b2e482f37b96303cb18c4d72edea69aa80d";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLSymbol $sym2$HTML_MARKUP;
  private static final SubLSymbol $sym3$HTML_MARKUP_WRAPPER;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$HTML_ATTRIBUTE;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$HTML_MARKUP_BODY;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$MAP_AS;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$DO_GAF_ARG_INDEX;
  private static final SubLSymbol $kw41$PREDICATE;
  private static final SubLSymbol $kw42$INDEX;
  private static final SubLSymbol $kw43$TRUTH;
  private static final SubLSymbol $kw44$DONE;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$MAP_AS_IN_MT;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$WITH_JUST_MT;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$MAP_AS_IN_MTS;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$WITH_MT_LIST;
  private static final SubLSymbol $sym53$MAP_AS_IN_ANY_MT;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$WITH_ALL_MTS;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$MAP_AS_IN_RELEVANT_MTS;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$POSSIBLY_IN_MT;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$MAP_US;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$DO_GAF_ARG_INDEX_VALUES;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$MAP_US_IN_MT;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$MAP_US_IN_MTS;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$MAP_US_IN_ANY_MT;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$MAP_US_IN_RELEVANT_MTS;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$DO_ARG_INDEX;
  private static final SubLSymbol $sym76$DO_ARG_INDEX_IN_MT;
  private static final SubLSymbol $sym77$DO_ARG_INDEX_IN_MTS;
  private static final SubLSymbol $sym78$DO_ARG_INDEX_IN_ANY_MT;
  private static final SubLSymbol $sym79$DO_ARG_INDEX_IN_RELEVANT_MTS;
  private static final SubLSymbol $sym80$DO_ARG_INDEX_VALUES;
  private static final SubLSymbol $sym81$DO_ARG_INDEX_VALUES_IN_MT;
  private static final SubLSymbol $sym82$DO_ARG_INDEX_VALUES_IN_MTS;
  private static final SubLSymbol $sym83$DO_ARG_INDEX_VALUES_IN_ANY_MT;
  private static final SubLSymbol $sym84$DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$DO_PRED_INDEX;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$DO_PREDICATE_EXTENT_INDEX;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$DO_PRED_INDEX_IN_MT;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$DO_PRED_INDEX_IN_MTS;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$DO_PRED_INDEX_IN_ANY_MT;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$DO_PRED_INDEX_IN_RELEVANT_MTS;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$RELEVANT_PRED_MAP_AS;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLSymbol $kw104$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw105$DIRECTION;
  private static final SubLSymbol $sym106$DO_GAF_ARG_INDEX_RELEVANT_PRED;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$GP_MAP_AS;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$DO_GAF_ARG_INDEX_GP;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$GP_MAP_AS_IN_MT;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$WITH_MT;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$GP_MAP_AS_IN_MTS;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$GP_MAP_AS_IN_ANY_MT;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$GP_MAP_AS_IN_RELEVANT_MTS;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$GP_MAP_US;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$DO_GAF_ARG_INDEX_VALUES_GP;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$GP_MAP_US_IN_MT;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$GP_MAP_US_IN_MTS;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$GP_MAP_US_IN_ANY_MT;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$GP_MAP_US_IN_RELEVANT_MTS;
  private static final SubLList $list136;
  private static final SubLList $list137;
  private static final SubLString $str138$mapping_Cyc_NATs;
  private static final SubLSymbol $sym139$DO_NATS;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$DO_NARTS;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$WITH_PRIVATE_TCP_CONNECTION;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$WITH_TCP_CONNECTION;
  private static final SubLList $list146;

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_attribute(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject att = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    att = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$PROGN, ConsesLow.list( $sym2$HTML_MARKUP, att ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_form(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$HTML_MARKUP_WRAPPER, $list4, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_form_url(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list8, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_form_method(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list9, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_form_body(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym10$HTML_MARKUP_BODY, ConsesLow.listS( $sym5$CLET, $list11, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_input(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$PROGN, $list12, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ), $list13 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_input_type(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list14, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_input_name(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list15, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_input_value(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym7$HTML_ATTRIBUTE, $list16, ConsesLow.listS( $sym5$CLET, $list17, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_input_size(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list18, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_input_checked(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    return $list19;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_select(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$HTML_MARKUP_WRAPPER, $list20, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_select_name(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list21, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_select_size(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list22, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_select_multiple(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    return $list23;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_select_body(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym10$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_option(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$HTML_MARKUP_WRAPPER, $list24, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_option_selected(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    return $list25;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_option_body(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym10$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_textarea(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$HTML_MARKUP_WRAPPER, $list26, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_textarea_name(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list27, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_textarea_cols(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list28, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_textarea_rows(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list29, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_textarea_body(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym10$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_anchor(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym3$HTML_MARKUP_WRAPPER, $list30, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_anchor_href(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list31, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_anchor_name(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list32, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_anchor_linktext(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym10$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_image(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$PROGN, $list33, ConsesLow.listS( $sym5$CLET, $list6, ConsesLow.append( body, NIL ) ), $list13 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_image_url(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list34, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_image_alt(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list35, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 800L)
  public static SubLObject html_image_border(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$HTML_ATTRIBUTE, $list36, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 6575L)
  public static SubLObject map_as(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym38$MAP_AS, $list39 );
      return ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 6908L)
  public static SubLObject map_as_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    mt = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list45 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list45 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym46$MAP_AS_IN_MT, $list47 );
      return ConsesLow.list( $sym48$WITH_JUST_MT, mt, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE,
        done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 7194L)
  public static SubLObject map_as_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    mts = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym50$MAP_AS_IN_MTS, $list51 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE,
        done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 7483L)
  public static SubLObject map_as_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym53$MAP_AS_IN_ANY_MT, $list54 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 7766L)
  public static SubLObject map_as_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    done = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym57$MAP_AS_IN_RELEVANT_MTS, $list58 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE,
        done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 8066L)
  public static SubLObject map_us(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    done = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym61$MAP_US, $list62 );
      return ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg, $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 8373L)
  public static SubLObject map_us_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    mt = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym65$MAP_US_IN_MT, $list66 );
      return ConsesLow.list( $sym48$WITH_JUST_MT, mt, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg,
        $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 8714L)
  public static SubLObject map_us_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    mts = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list67 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list67 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list67 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym68$MAP_US_IN_MTS, $list69 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg,
        $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list67 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 9058L)
  public static SubLObject map_us_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    done = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym70$MAP_US_IN_ANY_MT, $list71 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg, $kw43$TRUTH,
        truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 9396L)
  public static SubLObject map_us_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    done = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym73$MAP_US_IN_RELEVANT_MTS, $list74 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg,
        $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 9751L)
  public static SubLObject do_arg_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym75$DO_ARG_INDEX, $list39 );
      return ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10012L)
  public static SubLObject do_arg_index_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    mt = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list45 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list45 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym76$DO_ARG_INDEX_IN_MT, $list47 );
      return ConsesLow.list( $sym48$WITH_JUST_MT, mt, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE,
        done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10297L)
  public static SubLObject do_arg_index_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    mts = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym77$DO_ARG_INDEX_IN_MTS, $list51 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE,
        done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10585L)
  public static SubLObject do_arg_index_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list37 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym78$DO_ARG_INDEX_IN_ANY_MT, $list54 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 10867L)
  public static SubLObject do_arg_index_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    done = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list56 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym79$DO_ARG_INDEX_IN_RELEVANT_MTS, $list58 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw41$PREDICATE, pred, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw44$DONE,
        done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 11166L)
  public static SubLObject do_arg_index_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    done = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym80$DO_ARG_INDEX_VALUES, $list62 );
      return ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg, $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 11499L)
  public static SubLObject do_arg_index_values_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    mt = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym81$DO_ARG_INDEX_VALUES_IN_MT, $list66 );
      return ConsesLow.list( $sym48$WITH_JUST_MT, mt, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg,
        $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 11853L)
  public static SubLObject do_arg_index_values_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    mts = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list67 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list67 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list67 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym82$DO_ARG_INDEX_VALUES_IN_MTS, $list69 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg,
        $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list67 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 12210L)
  public static SubLObject do_arg_index_values_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    done = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list60 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym83$DO_ARG_INDEX_VALUES_IN_ANY_MT, $list71 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg, $kw43$TRUTH,
        truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 12561L)
  public static SubLObject do_arg_index_values_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    done = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list72 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym84$DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS, $list74 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym63$DO_GAF_ARG_INDEX_VALUES, ConsesLow.list( new SubLObject[] { var, v_term, gather_arg, $kw41$PREDICATE, pred, $kw42$INDEX, index_arg,
        $kw43$TRUTH, truth, $kw44$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 12929L)
  public static SubLObject do_pred_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    done = current.first();
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym86$DO_PRED_INDEX, $list87 );
      return ConsesLow.listS( $sym88$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, pred, $kw43$TRUTH, truth, $kw44$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13164L)
  public static SubLObject do_pred_index_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    mt = current.first();
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list89 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym90$DO_PRED_INDEX_IN_MT, $list91 );
      return ConsesLow.list( $sym48$WITH_JUST_MT, mt, ConsesLow.listS( $sym88$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, pred, $kw43$TRUTH, truth, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13422L)
  public static SubLObject do_pred_index_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    mts = current.first();
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym93$DO_PRED_INDEX_IN_MTS, $list94 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym88$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, pred, $kw43$TRUTH, truth, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13683L)
  public static SubLObject do_pred_index_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    done = current.first();
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list85 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym95$DO_PRED_INDEX_IN_ANY_MT, $list96 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym88$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, pred, $kw43$TRUTH, truth, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 13938L)
  public static SubLObject do_pred_index_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    done = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list97 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list97 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym98$DO_PRED_INDEX_IN_RELEVANT_MTS, $list99 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym88$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, pred, $kw43$TRUTH, truth, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list97 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14210L)
  public static SubLObject relevant_pred_map_as(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list100 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym101$RELEVANT_PRED_MAP_AS, $list39 );
      return ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( var, v_term, $kw42$INDEX, index, $kw44$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14480L)
  public static SubLObject do_gaf_arg_index_relevant_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list102 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list102 );
      if( NIL == conses_high.member( current_$1, $list103, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw104$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list102 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw42$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw43$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw105$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw44$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    access_macros.defmacro_obsolete_warning( $sym106$DO_GAF_ARG_INDEX_RELEVANT_PRED, $list39 );
    return ConsesLow.listS( $sym40$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { assertion_var, v_term, $kw42$INDEX, index, $kw43$TRUTH, truth, $kw105$DIRECTION, direction, $kw44$DONE, done
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14756L)
  public static SubLObject gp_map_as(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym108$GP_MAP_AS, $list109 );
      return ConsesLow.listS( $sym110$DO_GAF_ARG_INDEX_GP, ConsesLow.list( var, v_term, pred, $kw42$INDEX, index, $kw44$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 14986L)
  public static SubLObject gp_map_as_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    mt = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list111 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym112$GP_MAP_AS_IN_MT, $list113 );
      return ConsesLow.list( $sym114$WITH_MT, mt, ConsesLow.listS( $sym110$DO_GAF_ARG_INDEX_GP, ConsesLow.list( var, v_term, pred, $kw42$INDEX, index, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list111 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 15233L)
  public static SubLObject gp_map_as_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    mts = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list115 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym116$GP_MAP_AS_IN_MTS, $list117 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym110$DO_GAF_ARG_INDEX_GP, ConsesLow.list( var, v_term, pred, $kw42$INDEX, index, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 15493L)
  public static SubLObject gp_map_as_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list107 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list107 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym118$GP_MAP_AS_IN_ANY_MT, $list119 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym110$DO_GAF_ARG_INDEX_GP, ConsesLow.list( var, v_term, pred, $kw42$INDEX, index, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list107 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 15747L)
  public static SubLObject gp_map_as_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    mt = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list111 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym120$GP_MAP_AS_IN_RELEVANT_MTS, $list121 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym110$DO_GAF_ARG_INDEX_GP, ConsesLow.list( var, v_term, pred, $kw42$INDEX, index, $kw44$DONE, done ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list111 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16018L)
  public static SubLObject gp_map_us(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    done = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym123$GP_MAP_US, $list124 );
      return ConsesLow.listS( $sym125$DO_GAF_ARG_INDEX_VALUES_GP, ConsesLow.list( var, v_term, gather_arg, pred, $kw42$INDEX, index_arg, $kw44$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16297L)
  public static SubLObject gp_map_us_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
    mt = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list126 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list126 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym127$GP_MAP_US_IN_MT, $list128 );
      return ConsesLow.list( $sym114$WITH_MT, mt, ConsesLow.listS( $sym125$DO_GAF_ARG_INDEX_VALUES_GP, ConsesLow.list( var, v_term, gather_arg, pred, $kw42$INDEX, index_arg, $kw44$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list126 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16593L)
  public static SubLObject gp_map_us_in_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    SubLObject mts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    done = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    mts = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list129 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list129 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym130$GP_MAP_US_IN_MTS, $list131 );
      return ConsesLow.list( $sym52$WITH_MT_LIST, mts, ConsesLow.listS( $sym125$DO_GAF_ARG_INDEX_VALUES_GP, ConsesLow.list( var, v_term, gather_arg, pred, $kw42$INDEX, index_arg, $kw44$DONE, done ), ConsesLow.append(
          body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list129 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 16902L)
  public static SubLObject gp_map_us_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    done = current.first();
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list122 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym132$GP_MAP_US_IN_ANY_MT, $list133 );
      return ConsesLow.list( $sym55$WITH_ALL_MTS, ConsesLow.listS( $sym125$DO_GAF_ARG_INDEX_VALUES_GP, ConsesLow.list( var, v_term, gather_arg, pred, $kw42$INDEX, index_arg, $kw44$DONE, done ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 17205L)
  public static SubLObject gp_map_us_in_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
    done = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list134 );
    current = current.rest();
    final SubLObject index_arg = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list134 );
    current = current.rest();
    final SubLObject gather_arg = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list134 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym135$GP_MAP_US_IN_RELEVANT_MTS, $list136 );
      return ConsesLow.list( $sym59$POSSIBLY_IN_MT, mt, ConsesLow.listS( $sym125$DO_GAF_ARG_INDEX_VALUES_GP, ConsesLow.list( var, v_term, gather_arg, pred, $kw42$INDEX, index_arg, $kw44$DONE, done ), ConsesLow.append(
          body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list134 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 17525L)
  public static SubLObject do_nats(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    var = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str138$mapping_Cyc_NATs;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list137 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym139$DO_NATS, $list140 );
      return ConsesLow.listS( $sym141$DO_NARTS, ConsesLow.list( var, message ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list137 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/obsolete-macros.lisp", position = 17847L)
  public static SubLObject with_private_tcp_connection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bi_stream = NIL;
    SubLObject host = NIL;
    SubLObject port = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    bi_stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    host = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list142 );
    port = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      access_macros.defmacro_obsolete_warning( $sym143$WITH_PRIVATE_TCP_CONNECTION, $list144 );
      return ConsesLow.listS( $sym145$WITH_TCP_CONNECTION, ConsesLow.listS( bi_stream, host, port, $list146 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list142 );
    return NIL;
  }

  public static SubLObject declare_obsolete_macros_file()
  {
    SubLFiles.declareMacro( me, "html_attribute", "HTML-ATTRIBUTE" );
    SubLFiles.declareMacro( me, "html_form", "HTML-FORM" );
    SubLFiles.declareMacro( me, "html_form_url", "HTML-FORM-URL" );
    SubLFiles.declareMacro( me, "html_form_method", "HTML-FORM-METHOD" );
    SubLFiles.declareMacro( me, "html_form_body", "HTML-FORM-BODY" );
    SubLFiles.declareMacro( me, "html_input", "HTML-INPUT" );
    SubLFiles.declareMacro( me, "html_input_type", "HTML-INPUT-TYPE" );
    SubLFiles.declareMacro( me, "html_input_name", "HTML-INPUT-NAME" );
    SubLFiles.declareMacro( me, "html_input_value", "HTML-INPUT-VALUE" );
    SubLFiles.declareMacro( me, "html_input_size", "HTML-INPUT-SIZE" );
    SubLFiles.declareMacro( me, "html_input_checked", "HTML-INPUT-CHECKED" );
    SubLFiles.declareMacro( me, "html_select", "HTML-SELECT" );
    SubLFiles.declareMacro( me, "html_select_name", "HTML-SELECT-NAME" );
    SubLFiles.declareMacro( me, "html_select_size", "HTML-SELECT-SIZE" );
    SubLFiles.declareMacro( me, "html_select_multiple", "HTML-SELECT-MULTIPLE" );
    SubLFiles.declareMacro( me, "html_select_body", "HTML-SELECT-BODY" );
    SubLFiles.declareMacro( me, "html_option", "HTML-OPTION" );
    SubLFiles.declareMacro( me, "html_option_selected", "HTML-OPTION-SELECTED" );
    SubLFiles.declareMacro( me, "html_option_body", "HTML-OPTION-BODY" );
    SubLFiles.declareMacro( me, "html_textarea", "HTML-TEXTAREA" );
    SubLFiles.declareMacro( me, "html_textarea_name", "HTML-TEXTAREA-NAME" );
    SubLFiles.declareMacro( me, "html_textarea_cols", "HTML-TEXTAREA-COLS" );
    SubLFiles.declareMacro( me, "html_textarea_rows", "HTML-TEXTAREA-ROWS" );
    SubLFiles.declareMacro( me, "html_textarea_body", "HTML-TEXTAREA-BODY" );
    SubLFiles.declareMacro( me, "html_anchor", "HTML-ANCHOR" );
    SubLFiles.declareMacro( me, "html_anchor_href", "HTML-ANCHOR-HREF" );
    SubLFiles.declareMacro( me, "html_anchor_name", "HTML-ANCHOR-NAME" );
    SubLFiles.declareMacro( me, "html_anchor_linktext", "HTML-ANCHOR-LINKTEXT" );
    SubLFiles.declareMacro( me, "html_image", "HTML-IMAGE" );
    SubLFiles.declareMacro( me, "html_image_url", "HTML-IMAGE-URL" );
    SubLFiles.declareMacro( me, "html_image_alt", "HTML-IMAGE-ALT" );
    SubLFiles.declareMacro( me, "html_image_border", "HTML-IMAGE-BORDER" );
    SubLFiles.declareMacro( me, "map_as", "MAP-AS" );
    SubLFiles.declareMacro( me, "map_as_in_mt", "MAP-AS-IN-MT" );
    SubLFiles.declareMacro( me, "map_as_in_mts", "MAP-AS-IN-MTS" );
    SubLFiles.declareMacro( me, "map_as_in_any_mt", "MAP-AS-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "map_as_in_relevant_mts", "MAP-AS-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "map_us", "MAP-US" );
    SubLFiles.declareMacro( me, "map_us_in_mt", "MAP-US-IN-MT" );
    SubLFiles.declareMacro( me, "map_us_in_mts", "MAP-US-IN-MTS" );
    SubLFiles.declareMacro( me, "map_us_in_any_mt", "MAP-US-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "map_us_in_relevant_mts", "MAP-US-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "do_arg_index", "DO-ARG-INDEX" );
    SubLFiles.declareMacro( me, "do_arg_index_in_mt", "DO-ARG-INDEX-IN-MT" );
    SubLFiles.declareMacro( me, "do_arg_index_in_mts", "DO-ARG-INDEX-IN-MTS" );
    SubLFiles.declareMacro( me, "do_arg_index_in_any_mt", "DO-ARG-INDEX-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "do_arg_index_in_relevant_mts", "DO-ARG-INDEX-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "do_arg_index_values", "DO-ARG-INDEX-VALUES" );
    SubLFiles.declareMacro( me, "do_arg_index_values_in_mt", "DO-ARG-INDEX-VALUES-IN-MT" );
    SubLFiles.declareMacro( me, "do_arg_index_values_in_mts", "DO-ARG-INDEX-VALUES-IN-MTS" );
    SubLFiles.declareMacro( me, "do_arg_index_values_in_any_mt", "DO-ARG-INDEX-VALUES-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "do_arg_index_values_in_relevant_mts", "DO-ARG-INDEX-VALUES-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "do_pred_index", "DO-PRED-INDEX" );
    SubLFiles.declareMacro( me, "do_pred_index_in_mt", "DO-PRED-INDEX-IN-MT" );
    SubLFiles.declareMacro( me, "do_pred_index_in_mts", "DO-PRED-INDEX-IN-MTS" );
    SubLFiles.declareMacro( me, "do_pred_index_in_any_mt", "DO-PRED-INDEX-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "do_pred_index_in_relevant_mts", "DO-PRED-INDEX-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "relevant_pred_map_as", "RELEVANT-PRED-MAP-AS" );
    SubLFiles.declareMacro( me, "do_gaf_arg_index_relevant_pred", "DO-GAF-ARG-INDEX-RELEVANT-PRED" );
    SubLFiles.declareMacro( me, "gp_map_as", "GP-MAP-AS" );
    SubLFiles.declareMacro( me, "gp_map_as_in_mt", "GP-MAP-AS-IN-MT" );
    SubLFiles.declareMacro( me, "gp_map_as_in_mts", "GP-MAP-AS-IN-MTS" );
    SubLFiles.declareMacro( me, "gp_map_as_in_any_mt", "GP-MAP-AS-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "gp_map_as_in_relevant_mts", "GP-MAP-AS-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "gp_map_us", "GP-MAP-US" );
    SubLFiles.declareMacro( me, "gp_map_us_in_mt", "GP-MAP-US-IN-MT" );
    SubLFiles.declareMacro( me, "gp_map_us_in_mts", "GP-MAP-US-IN-MTS" );
    SubLFiles.declareMacro( me, "gp_map_us_in_any_mt", "GP-MAP-US-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "gp_map_us_in_relevant_mts", "GP-MAP-US-IN-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "do_nats", "DO-NATS" );
    SubLFiles.declareMacro( me, "with_private_tcp_connection", "WITH-PRIVATE-TCP-CONNECTION" );
    return NIL;
  }

  public static SubLObject init_obsolete_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_obsolete_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_obsolete_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_obsolete_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_obsolete_macros_file();
  }
  static
  {
    me = new obsolete_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "ATT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $sym2$HTML_MARKUP = makeSymbol( "HTML-MARKUP" );
    $sym3$HTML_MARKUP_WRAPPER = makeSymbol( "HTML-MARKUP-WRAPPER" );
    $list4 = ConsesLow.list( makeSymbol( "*HTML-FORM-HEAD*" ), makeSymbol( "*HTML-FORM-TAIL*" ) );
    $sym5$CLET = makeSymbol( "CLET" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-SAFE-PRINT*" ), NIL ) );
    $sym7$HTML_ATTRIBUTE = makeSymbol( "HTML-ATTRIBUTE" );
    $list8 = ConsesLow.list( makeSymbol( "*HTML-FORM-ACTION*" ) );
    $list9 = ConsesLow.list( makeSymbol( "*HTML-FORM-METHOD*" ) );
    $sym10$HTML_MARKUP_BODY = makeSymbol( "HTML-MARKUP-BODY" );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-HTML-FORM*" ), T ) );
    $list12 = ConsesLow.list( makeSymbol( "HTML-MARKUP" ), makeSymbol( "*HTML-INPUT-HEAD*" ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_greater ) );
    $list14 = ConsesLow.list( makeSymbol( "*HTML-INPUT-TYPE*" ) );
    $list15 = ConsesLow.list( makeSymbol( "*HTML-INPUT-NAME*" ) );
    $list16 = ConsesLow.list( makeSymbol( "*HTML-INPUT-VALUE*" ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-SAFE-PRINT*" ), T ) );
    $list18 = ConsesLow.list( makeSymbol( "*HTML-INPUT-SIZE*" ) );
    $list19 = ConsesLow.list( makeSymbol( "HTML-MARKUP" ), makeSymbol( "*HTML-INPUT-CHECKED*" ) );
    $list20 = ConsesLow.list( makeSymbol( "*HTML-SELECT-HEAD*" ), makeSymbol( "*HTML-SELECT-TAIL*" ) );
    $list21 = ConsesLow.list( makeSymbol( "*HTML-SELECT-NAME*" ) );
    $list22 = ConsesLow.list( makeSymbol( "*HTML-SELECT-SIZE*" ) );
    $list23 = ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "*HTML-SELECT-MULTIPLE*" ) );
    $list24 = ConsesLow.list( makeSymbol( "*HTML-OPTION-HEAD*" ), makeSymbol( "*HTML-OPTION-TAIL*" ) );
    $list25 = ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "*HTML-OPTION-SELECTED*" ) );
    $list26 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-HEAD*" ), makeSymbol( "*HTML-TEXTAREA-TAIL*" ) );
    $list27 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-NAME*" ) );
    $list28 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-COLS*" ) );
    $list29 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-ROWS*" ) );
    $list30 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-HEAD*" ), makeSymbol( "*HTML-ANCHOR-TAIL*" ) );
    $list31 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-HREF*" ) );
    $list32 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-NAME*" ) );
    $list33 = ConsesLow.list( makeSymbol( "HTML-MARKUP" ), makeSymbol( "*HTML-IMAGE-HEAD*" ) );
    $list34 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-SRC*" ) );
    $list35 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-ALT*" ) );
    $list36 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-BORDER*" ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ), ONE_INTEGER ),
        makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$MAP_AS = makeSymbol( "MAP-AS" );
    $list39 = ConsesLow.list( makeSymbol( "DO-GAF-ARG-INDEX" ) );
    $sym40$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $kw41$PREDICATE = makeKeyword( "PREDICATE" );
    $kw42$INDEX = makeKeyword( "INDEX" );
    $kw43$TRUTH = makeKeyword( "TRUTH" );
    $kw44$DONE = makeKeyword( "DONE" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ),
        ONE_INTEGER ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym46$MAP_AS_IN_MT = makeSymbol( "MAP-AS-IN-MT" );
    $list47 = ConsesLow.list( makeSymbol( "WITH-JUST-MT" ), makeSymbol( "DO-GAF-ARG-INDEX" ) );
    $sym48$WITH_JUST_MT = makeSymbol( "WITH-JUST-MT" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ),
        ONE_INTEGER ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$MAP_AS_IN_MTS = makeSymbol( "MAP-AS-IN-MTS" );
    $list51 = ConsesLow.list( makeSymbol( "WITH-MT-LIST" ), makeSymbol( "DO-GAF-ARG-INDEX" ) );
    $sym52$WITH_MT_LIST = makeSymbol( "WITH-MT-LIST" );
    $sym53$MAP_AS_IN_ANY_MT = makeSymbol( "MAP-AS-IN-ANY-MT" );
    $list54 = ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), makeSymbol( "DO-GAF-ARG-INDEX" ) );
    $sym55$WITH_ALL_MTS = makeSymbol( "WITH-ALL-MTS" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "INDEX" ),
        ONE_INTEGER ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym57$MAP_AS_IN_RELEVANT_MTS = makeSymbol( "MAP-AS-IN-RELEVANT-MTS" );
    $list58 = ConsesLow.list( makeSymbol( "POSSIBLY-IN-MT" ), makeSymbol( "DO-GAF-ARG-INDEX" ) );
    $sym59$POSSIBLY_IN_MT = makeSymbol( "POSSIBLY-IN-MT" );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ),
        ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym61$MAP_US = makeSymbol( "MAP-US" );
    $list62 = ConsesLow.list( makeSymbol( "DO-GAF-ARG-INDEX-VALUES" ) );
    $sym63$DO_GAF_ARG_INDEX_VALUES = makeSymbol( "DO-GAF-ARG-INDEX-VALUES" );
    $list64 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ), makeSymbol( "TRUTH" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym65$MAP_US_IN_MT = makeSymbol( "MAP-US-IN-MT" );
    $list66 = ConsesLow.list( makeSymbol( "WITH-JUST-MT" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES" ) );
    $list67 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ), makeSymbol( "TRUTH" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym68$MAP_US_IN_MTS = makeSymbol( "MAP-US-IN-MTS" );
    $list69 = ConsesLow.list( makeSymbol( "WITH-MT-LIST" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES" ) );
    $sym70$MAP_US_IN_ANY_MT = makeSymbol( "MAP-US-IN-ANY-MT" );
    $list71 = ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES" ) );
    $list72 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list(
        makeSymbol( "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ), makeSymbol( "TRUTH" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym73$MAP_US_IN_RELEVANT_MTS = makeSymbol( "MAP-US-IN-RELEVANT-MTS" );
    $list74 = ConsesLow.list( makeSymbol( "POSSIBLY-IN-MT" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES" ) );
    $sym75$DO_ARG_INDEX = makeSymbol( "DO-ARG-INDEX" );
    $sym76$DO_ARG_INDEX_IN_MT = makeSymbol( "DO-ARG-INDEX-IN-MT" );
    $sym77$DO_ARG_INDEX_IN_MTS = makeSymbol( "DO-ARG-INDEX-IN-MTS" );
    $sym78$DO_ARG_INDEX_IN_ANY_MT = makeSymbol( "DO-ARG-INDEX-IN-ANY-MT" );
    $sym79$DO_ARG_INDEX_IN_RELEVANT_MTS = makeSymbol( "DO-ARG-INDEX-IN-RELEVANT-MTS" );
    $sym80$DO_ARG_INDEX_VALUES = makeSymbol( "DO-ARG-INDEX-VALUES" );
    $sym81$DO_ARG_INDEX_VALUES_IN_MT = makeSymbol( "DO-ARG-INDEX-VALUES-IN-MT" );
    $sym82$DO_ARG_INDEX_VALUES_IN_MTS = makeSymbol( "DO-ARG-INDEX-VALUES-IN-MTS" );
    $sym83$DO_ARG_INDEX_VALUES_IN_ANY_MT = makeSymbol( "DO-ARG-INDEX-VALUES-IN-ANY-MT" );
    $sym84$DO_ARG_INDEX_VALUES_IN_RELEVANT_MTS = makeSymbol( "DO-ARG-INDEX-VALUES-IN-RELEVANT-MTS" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym86$DO_PRED_INDEX = makeSymbol( "DO-PRED-INDEX" );
    $list87 = ConsesLow.list( makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ) );
    $sym88$DO_PREDICATE_EXTENT_INDEX = makeSymbol( "DO-PREDICATE-EXTENT-INDEX" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym90$DO_PRED_INDEX_IN_MT = makeSymbol( "DO-PRED-INDEX-IN-MT" );
    $list91 = ConsesLow.list( makeSymbol( "WITH-JUST-MT" ), makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ) );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym93$DO_PRED_INDEX_IN_MTS = makeSymbol( "DO-PRED-INDEX-IN-MTS" );
    $list94 = ConsesLow.list( makeSymbol( "WITH-MT-LIST" ), makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ) );
    $sym95$DO_PRED_INDEX_IN_ANY_MT = makeSymbol( "DO-PRED-INDEX-IN-ANY-MT" );
    $list96 = ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym98$DO_PRED_INDEX_IN_RELEVANT_MTS = makeSymbol( "DO-PRED-INDEX-IN-RELEVANT-MTS" );
    $list99 = ConsesLow.list( makeSymbol( "POSSIBLY-IN-MT" ), makeSymbol( "DO-PREDICATE-EXTENT-INDEX" ) );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ), ONE_INTEGER ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym101$RELEVANT_PRED_MAP_AS = makeSymbol( "RELEVANT-PRED-MAP-AS" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "TRUTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "DONE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list103 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "TRUTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "DONE" ) );
    $kw104$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw105$DIRECTION = makeKeyword( "DIRECTION" );
    $sym106$DO_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol( "DO-GAF-ARG-INDEX-RELEVANT-PRED" );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ), ONE_INTEGER ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym108$GP_MAP_AS = makeSymbol( "GP-MAP-AS" );
    $list109 = ConsesLow.list( makeSymbol( "DO-GAF-ARG-INDEX-GP" ) );
    $sym110$DO_GAF_ARG_INDEX_GP = makeSymbol( "DO-GAF-ARG-INDEX-GP" );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ),
        ONE_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym112$GP_MAP_AS_IN_MT = makeSymbol( "GP-MAP-AS-IN-MT" );
    $list113 = ConsesLow.list( makeSymbol( "WITH-MT" ), makeSymbol( "DO-GAF-ARG-INDEX-GP" ) );
    $sym114$WITH_MT = makeSymbol( "WITH-MT" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ),
        ONE_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym116$GP_MAP_AS_IN_MTS = makeSymbol( "GP-MAP-AS-IN-MTS" );
    $list117 = ConsesLow.list( makeSymbol( "WITH-MT-LIST" ), makeSymbol( "DO-GAF-ARG-INDEX-GP" ) );
    $sym118$GP_MAP_AS_IN_ANY_MT = makeSymbol( "GP-MAP-AS-IN-ANY-MT" );
    $list119 = ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), makeSymbol( "DO-GAF-ARG-INDEX-GP" ) );
    $sym120$GP_MAP_AS_IN_RELEVANT_MTS = makeSymbol( "GP-MAP-AS-IN-RELEVANT-MTS" );
    $list121 = ConsesLow.list( makeSymbol( "POSSIBLY-IN-MT" ), makeSymbol( "DO-GAF-ARG-INDEX-GP" ) );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX-ARG" ), ONE_INTEGER ),
        ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym123$GP_MAP_US = makeSymbol( "GP-MAP-US" );
    $list124 = ConsesLow.list( makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" ) );
    $sym125$DO_GAF_ARG_INDEX_VALUES_GP = makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" );
    $list126 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
        "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym127$GP_MAP_US_IN_MT = makeSymbol( "GP-MAP-US-IN-MT" );
    $list128 = ConsesLow.list( makeSymbol( "WITH-MT" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" ) );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "MTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
        "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym130$GP_MAP_US_IN_MTS = makeSymbol( "GP-MAP-US-IN-MTS" );
    $list131 = ConsesLow.list( makeSymbol( "WITH-MT-LIST" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" ) );
    $sym132$GP_MAP_US_IN_ANY_MT = makeSymbol( "GP-MAP-US-IN-ANY-MT" );
    $list133 = ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" ) );
    $list134 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol(
        "INDEX-ARG" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER-ARG" ), TWO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym135$GP_MAP_US_IN_RELEVANT_MTS = makeSymbol( "GP-MAP-US-IN-RELEVANT-MTS" );
    $list136 = ConsesLow.list( makeSymbol( "POSSIBLY-IN-MT" ), makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" ) );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "mapping Cyc NATs" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str138$mapping_Cyc_NATs = makeString( "mapping Cyc NATs" );
    $sym139$DO_NATS = makeSymbol( "DO-NATS" );
    $list140 = ConsesLow.list( makeSymbol( "DO-NARTS" ) );
    $sym141$DO_NARTS = makeSymbol( "DO-NARTS" );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "BI-STREAM" ), makeSymbol( "HOST" ), makeSymbol( "PORT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym143$WITH_PRIVATE_TCP_CONNECTION = makeSymbol( "WITH-PRIVATE-TCP-CONNECTION" );
    $list144 = ConsesLow.list( makeSymbol( "WITH-TCP-CONNECTION" ) );
    $sym145$WITH_TCP_CONNECTION = makeSymbol( "WITH-TCP-CONNECTION" );
    $list146 = ConsesLow.list( makeKeyword( "ACCESS-MODE" ), makeKeyword( "PRIVATE" ) );
  }
}
/*
 * 
 * Total time: 480 ms
 * 
 */