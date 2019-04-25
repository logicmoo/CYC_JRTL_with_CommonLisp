package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_unicode
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_unicode";
  public static final String myFingerPrint = "e3b27c85b1b287524268b41c7cf248f41fabe68c75f99689dd3ed82509df91ef";
  @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1186L)
  public static SubLSymbol $cb_display_unicode_nauts_as_stringsP$;
  private static final SubLSymbol $sym0$UNICODE_NAUT;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$UNICODE_NAUT;
  private static final SubLSymbol $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__;
  private static final SubLSymbol $kw4$LAQUO;
  private static final SubLSymbol $kw5$RAQUO;
  private static final SubLSymbol $kw6$TOP;
  private static final SubLString $str7$cb_start__A;
  private static final SubLString $str8$_a__a;
  private static final SubLSymbol $sym9$CB_LINK_UNICODE_NAUT;

  @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1355L)
  public static SubLObject unicode_naut_applicability_test(final SubLObject cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $cb_display_unicode_nauts_as_stringsP$.getDynamicValue( thread ) && NIL != unicode_nauts.unicode_naut_p( cons, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1494L)
  public static SubLObject unicode_naut_html_output_fn(final SubLObject cons, final SubLObject depth, final SubLObject wrap_axiomsP)
  {
    return html_utilities.html_print_doc_string( cons );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1633L)
  public static SubLObject cb_link_unicode_naut(final SubLObject unicode_naut, SubLObject linktext, SubLObject image_keyword)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( image_keyword == UNPROVIDED )
    {
      image_keyword = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = Sequences.cconcatenate( html_utilities.html_glyph_markup( $kw4$LAQUO ), new SubLObject[] { unicode_strings.unicode_display_to_html( conses_high.second( unicode_naut ) ), html_utilities.html_glyph_markup(
          $kw5$RAQUO )
      } );
    }
    SubLObject handler = cb_utilities.$cb_default_naut_handler$.getDynamicValue( thread );
    final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue( thread );
    if( frame == $kw6$TOP )
    {
      handler = PrintLow.format( NIL, $str7$cb_start__A, cb_utilities.$cb_default_naut_handler$.getDynamicValue( thread ) );
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str8$_a__a, handler, cb_utilities.cb_naut_identifier( unicode_naut ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != image_keyword )
      {
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( image_keyword );
        final SubLObject align = $kw6$TOP;
        final SubLObject alt = ( NIL != linktext ) ? linktext : cyc_file_dependencies.cb_get_icon_alt_string( image_keyword );
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
        final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      else
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), linktext );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return unicode_naut;
  }

  public static SubLObject declare_cb_unicode_file()
  {
    SubLFiles.declareFunction( me, "unicode_naut_applicability_test", "UNICODE-NAUT-APPLICABILITY-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_naut_html_output_fn", "UNICODE-NAUT-HTML-OUTPUT-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_link_unicode_naut", "CB-LINK-UNICODE-NAUT", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_cb_unicode_file()
  {
    $cb_display_unicode_nauts_as_stringsP$ = SubLFiles.defparameter( "*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*", T );
    return NIL;
  }

  public static SubLObject setup_cb_unicode_file()
  {
    cb_utilities.register_cb_form_cons_method( $sym0$UNICODE_NAUT, $list1 );
    cb_utilities.declare_cb_form_cons_method_always_active( $kw2$UNICODE_NAUT );
    utilities_macros.register_html_state_variable( $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ );
    utilities_macros.register_html_interface_variable( $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ );
    cb_utilities.setup_cb_link_method( $kw2$UNICODE_NAUT, $sym9$CB_LINK_UNICODE_NAUT, THREE_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_unicode_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_unicode_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_unicode_file();
  }
  static
  {
    me = new cb_unicode();
    $cb_display_unicode_nauts_as_stringsP$ = null;
    $sym0$UNICODE_NAUT = makeSymbol( "UNICODE-NAUT" );
    $list1 = ConsesLow.list( makeKeyword( "NAME" ), makeString( "unicode-naut" ), makeKeyword( "KEYWORD" ), makeKeyword( "UNICODE-NAUT" ), makeKeyword( "APPLICABILITY-TEST-FN" ), makeSymbol(
        "UNICODE-NAUT-APPLICABILITY-TEST" ), makeKeyword( "HTML-OUTPUT-FN" ), makeSymbol( "UNICODE-NAUT-HTML-OUTPUT-FN" ) );
    $kw2$UNICODE_NAUT = makeKeyword( "UNICODE-NAUT" );
    $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ = makeSymbol( "*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*" );
    $kw4$LAQUO = makeKeyword( "LAQUO" );
    $kw5$RAQUO = makeKeyword( "RAQUO" );
    $kw6$TOP = makeKeyword( "TOP" );
    $str7$cb_start__A = makeString( "cb-start|~A" );
    $str8$_a__a = makeString( "~a&~a" );
    $sym9$CB_LINK_UNICODE_NAUT = makeSymbol( "CB-LINK-UNICODE-NAUT" );
  }
}
/*
 * 
 * Total time: 94 ms
 * 
 */