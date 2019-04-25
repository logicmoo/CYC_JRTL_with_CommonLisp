package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_id_links
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_id_links";
  public static final String myFingerPrint = "d621bb6761b3d2fcb91687c1fa30ac2a9062bcf507f5a277907094508507b620";
  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2586L)
  private static SubLSymbol $html_id_widget_lookup_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2775L)
  private static SubLSymbol $html_id_widget_id_functions$;
  private static final SubLSymbol $sym0$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym1$HTML_ID_LINK_HANDLER_NAME;
  private static final SubLSymbol $sym2$DEFINE_HTML_ID_LINK;
  private static final SubLString $str3$_;
  private static final SubLString $str4$HANDLER;
  private static final SubLSymbol $sym5$HTML_ID_LINK_BODY;
  private static final SubLSymbol $sym6$HTML_BASIC_IMAGE;
  private static final SubLSymbol $sym7$HTML_PRINC;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw11$INDEX;
  private static final SubLSymbol $kw12$CONTENTS;
  private static final SubLSymbol $kw13$TEXT;
  private static final SubLSymbol $kw14$IMAGE;
  private static final SubLSymbol $kw15$TARGET;
  private static final SubLSymbol $sym16$PROGN;
  private static final SubLSymbol $sym17$DEFINE_HTML_HANDLER;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$CDESTRUCTURING_BIND;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$ARGS;
  private static final SubLSymbol $sym22$CLET;
  private static final SubLSymbol $sym23$FUNCALL;
  private static final SubLSymbol $sym24$HTML_ID_LOOKUP_FUNC;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$DEFINE_PRIVATE;
  private static final SubLSymbol $sym27$ID;
  private static final SubLSymbol $sym28$HTML_ID_ID_FUNC;
  private static final SubLSymbol $sym29$FRAME_LINK;
  private static final SubLSymbol $sym30$HTML_FORMAT;
  private static final SubLString $str31$_a__a;
  private static final SubLList $list32;
  private static final SubLList $list33;

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2255L)
  public static SubLObject get_process_wrapper_by_id(final SubLObject id, final SubLObject process_wrapper_set)
  {
    final SubLObject set_contents_var = set.do_set_internal( process_wrapper_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject pw;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      pw = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, pw ) && id.eql( process_utilities.process_wrapper_get_id( pw ) ) )
      {
        return pw;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2969L)
  public static SubLObject register_html_id_index(final SubLObject index, final SubLObject lookup, final SubLObject id)
  {
    assert NIL != Types.function_spec_p( lookup ) : lookup;
    assert NIL != Types.function_spec_p( id ) : id;
    dictionary.dictionary_enter( $html_id_widget_id_functions$.getGlobalValue(), index, id );
    dictionary.dictionary_enter( $html_id_widget_lookup_functions$.getGlobalValue(), index, lookup );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3251L)
  public static SubLObject html_id_lookup_func(final SubLObject index)
  {
    return dictionary.dictionary_lookup( $html_id_widget_lookup_functions$.getGlobalValue(), index, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3362L)
  public static SubLObject html_id_id_func(final SubLObject index)
  {
    return dictionary.dictionary_lookup( $html_id_widget_id_functions$.getGlobalValue(), index, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3462L)
  public static SubLObject html_id_link_handler_name(final SubLObject link_func)
  {
    return Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( link_func ), new SubLObject[] { $str3$_, $str4$HANDLER
    } ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3636L)
  public static SubLObject html_id_link_body(final SubLObject text, final SubLObject image, final SubLObject contents)
  {
    if( NIL != image )
    {
      return ConsesLow.list( $sym6$HTML_BASIC_IMAGE, image, text );
    }
    if( NIL != text )
    {
      return ConsesLow.list( $sym7$HTML_PRINC, text );
    }
    return contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3848L)
  public static SubLObject define_html_id_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    v_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
      final SubLObject temp_$1 = current.rest();
      current = current.first();
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$2 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list8 );
        current_$2 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list8 );
        if( NIL == conses_high.member( current_$2, $list9, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$2 == $kw10$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
      }
      final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw11$INDEX, current );
      final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
      final SubLObject contents_tail = cdestructuring_bind.property_list_member( $kw12$CONTENTS, current );
      final SubLObject contents = ( NIL != contents_tail ) ? conses_high.cadr( contents_tail ) : NIL;
      final SubLObject text_tail = cdestructuring_bind.property_list_member( $kw13$TEXT, current );
      final SubLObject text = ( NIL != text_tail ) ? conses_high.cadr( text_tail ) : NIL;
      final SubLObject image_tail = cdestructuring_bind.property_list_member( $kw14$IMAGE, current );
      final SubLObject image = ( NIL != image_tail ) ? conses_high.cadr( image_tail ) : NIL;
      final SubLObject target_tail = cdestructuring_bind.property_list_member( $kw15$TARGET, current );
      final SubLObject target = ( NIL != target_tail ) ? conses_high.cadr( target_tail ) : NIL;
      final SubLObject body;
      current = ( body = temp_$1 );
      final SubLObject handler_func = html_id_link_handler_name( name );
      final SubLObject href_func_string = Strings.string_downcase( Symbols.symbol_name( handler_func ), UNPROVIDED, UNPROVIDED );
      return ConsesLow.list( $sym16$PROGN, ConsesLow.list( $sym17$DEFINE_HTML_HANDLER, handler_func, $list18, ConsesLow.list( $sym19$CDESTRUCTURING_BIND, $list20, $sym21$ARGS, ConsesLow.listS( $sym22$CLET, ConsesLow
          .list( ConsesLow.list( v_object, ConsesLow.listS( $sym23$FUNCALL, ConsesLow.list( $sym24$HTML_ID_LOOKUP_FUNC, index ), index, $list25 ) ) ), ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list(
              $sym26$DEFINE_PRIVATE, name, ConsesLow.list( v_object ), ConsesLow.listS( $sym22$CLET, ConsesLow.list( ConsesLow.list( $sym27$ID, ConsesLow.list( $sym23$FUNCALL, ConsesLow.list( $sym28$HTML_ID_ID_FUNC,
                  index ), v_object ) ) ), ConsesLow.list( $sym29$FRAME_LINK, ConsesLow.listS( $sym30$HTML_FORMAT, $str31$_a__a, href_func_string, $list32 ), html_id_link_body( text, image, contents ), target ),
                  $list33 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  public static SubLObject declare_html_id_links_file()
  {
    SubLFiles.declareFunction( me, "get_process_wrapper_by_id", "GET-PROCESS-WRAPPER-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "register_html_id_index", "REGISTER-HTML-ID-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "html_id_lookup_func", "HTML-ID-LOOKUP-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "html_id_id_func", "HTML-ID-ID-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "html_id_link_handler_name", "HTML-ID-LINK-HANDLER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "html_id_link_body", "HTML-ID-LINK-BODY", 3, 0, false );
    SubLFiles.declareMacro( me, "define_html_id_link", "DEFINE-HTML-ID-LINK" );
    return NIL;
  }

  public static SubLObject init_html_id_links_file()
  {
    $html_id_widget_lookup_functions$ = SubLFiles.deflexical( "*HTML-ID-WIDGET-LOOKUP-FUNCTIONS*", dictionary.new_dictionary( Symbols.symbol_function( EQL ), ZERO_INTEGER ) );
    $html_id_widget_id_functions$ = SubLFiles.deflexical( "*HTML-ID-WIDGET-ID-FUNCTIONS*", dictionary.new_dictionary( Symbols.symbol_function( EQL ), ZERO_INTEGER ) );
    return NIL;
  }

  public static SubLObject setup_html_id_links_file()
  {
    access_macros.register_macro_helper( $sym1$HTML_ID_LINK_HANDLER_NAME, $sym2$DEFINE_HTML_ID_LINK );
    access_macros.register_macro_helper( $sym5$HTML_ID_LINK_BODY, $sym2$DEFINE_HTML_ID_LINK );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_id_links_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_id_links_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_id_links_file();
  }
  static
  {
    me = new html_id_links();
    $html_id_widget_lookup_functions$ = null;
    $html_id_widget_id_functions$ = null;
    $sym0$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym1$HTML_ID_LINK_HANDLER_NAME = makeSymbol( "HTML-ID-LINK-HANDLER-NAME" );
    $sym2$DEFINE_HTML_ID_LINK = makeSymbol( "DEFINE-HTML-ID-LINK" );
    $str3$_ = makeString( "-" );
    $str4$HANDLER = makeString( "HANDLER" );
    $sym5$HTML_ID_LINK_BODY = makeSymbol( "HTML-ID-LINK-BODY" );
    $sym6$HTML_BASIC_IMAGE = makeSymbol( "HTML-BASIC-IMAGE" );
    $sym7$HTML_PRINC = makeSymbol( "HTML-PRINC" );
    $list8 = ConsesLow.list( makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "CONTENTS" ), makeSymbol( "TEXT" ), makeSymbol(
        "IMAGE" ), makeSymbol( "TARGET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list9 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "CONTENTS" ), makeKeyword( "TEXT" ), makeKeyword( "IMAGE" ), makeKeyword( "TARGET" ) );
    $kw10$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw11$INDEX = makeKeyword( "INDEX" );
    $kw12$CONTENTS = makeKeyword( "CONTENTS" );
    $kw13$TEXT = makeKeyword( "TEXT" );
    $kw14$IMAGE = makeKeyword( "IMAGE" );
    $kw15$TARGET = makeKeyword( "TARGET" );
    $sym16$PROGN = makeSymbol( "PROGN" );
    $sym17$DEFINE_HTML_HANDLER = makeSymbol( "DEFINE-HTML-HANDLER" );
    $list18 = ConsesLow.list( makeSymbol( "ARGS" ) );
    $sym19$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $list20 = ConsesLow.list( makeSymbol( "ID-STR" ) );
    $sym21$ARGS = makeSymbol( "ARGS" );
    $sym22$CLET = makeSymbol( "CLET" );
    $sym23$FUNCALL = makeSymbol( "FUNCALL" );
    $sym24$HTML_ID_LOOKUP_FUNC = makeSymbol( "HTML-ID-LOOKUP-FUNC" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "READ-FROM-STRING-IGNORING-ERRORS" ), makeSymbol( "ID-STR" ) ) );
    $sym26$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $sym27$ID = makeSymbol( "ID" );
    $sym28$HTML_ID_ID_FUNC = makeSymbol( "HTML-ID-ID-FUNC" );
    $sym29$FRAME_LINK = makeSymbol( "FRAME-LINK" );
    $sym30$HTML_FORMAT = makeSymbol( "HTML-FORMAT" );
    $str31$_a__a = makeString( "~a&~a" );
    $list32 = ConsesLow.list( makeSymbol( "ID" ) );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
  }
}
/*
 * 
 * Total time: 108 ms
 * 
 */