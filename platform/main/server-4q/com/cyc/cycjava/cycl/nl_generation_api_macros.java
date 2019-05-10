package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_generation_api_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_generation_api_macros";
  public static final String myFingerPrint = "4f2e68e8ce89f6ffbf72c7debbe300c02f18331051c65abe750492046e3af350";
  private static final SubLSymbol $sym0$CYCL_TERM_TO_NL_STRING;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$PPH_PARAMS;
  private static final SubLSymbol $kw5$DEFAULT;
  private static final SubLSymbol $sym6$CYCL_TERM_TO_NL_STRING_INTERNAL;
  private static final SubLSymbol $sym7$CYCL_TERM_TO_NL;
  private static final SubLSymbol $sym8$CYCL_TERM_TO_NL_INTERNAL;
  private static final SubLSymbol $sym9$CYCL_TERMS_TO_NL;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$CYCL_TERMS_TO_NL_INTERNAL;
  private static final SubLSymbol $sym12$CYCL_TERMS_TO_NL_STRINGS;
  private static final SubLSymbol $sym13$CYCL_TERMS_TO_NL_STRINGS_INTERNAL;
  private static final SubLSymbol $sym14$CYCL_TERM_TO_SEARCH_QUERY;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$ENGINE;
  private static final SubLSymbol $kw18$MAX_WORDS;
  private static final SubLSymbol $sym19$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL;
  private static final SubLSymbol $sym20$PPH_OUTPUT_MAP_TO_TEXT;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$USE_BULLETED_LISTS_;
  private static final SubLSymbol $kw24$BULLETED_LIST_INDENT_LEVEL;
  private static final SubLSymbol $kw25$ALLOW_UTF8_;
  private static final SubLSymbol $kw26$USE_BLANKS_FOR_VARS_;
  private static final SubLSymbol $sym27$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL;
  private static final SubLSymbol $sym28$PPH_OUTPUT_MAP_TO_HTML;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$TAG_FUNCTION;
  private static final SubLSymbol $sym32$PPH_ANCHOR_TAGS_FOR_TERM;
  private static final SubLSymbol $kw33$LINK_ARG0_;
  private static final SubLSymbol $sym34$PPH_OUTPUT_MAP_TO_HTML_INTERNAL;
  private static final SubLSymbol $sym35$QUOTE;

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 854L)
  public static SubLObject cycl_term_to_nl_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    cycl_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject pph_params_tail = cdestructuring_bind.property_list_member( $kw4$PPH_PARAMS, current );
    final SubLObject pph_params = ( NIL != pph_params_tail ) ? conses_high.cadr( pph_params_tail ) : $kw5$DEFAULT;
    return ConsesLow.list( $sym6$CYCL_TERM_TO_NL_STRING_INTERNAL, cycl_term, pph_params );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 1021L)
  public static SubLObject cycl_term_to_nl(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    cycl_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$2, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject pph_params_tail = cdestructuring_bind.property_list_member( $kw4$PPH_PARAMS, current );
    final SubLObject pph_params = ( NIL != pph_params_tail ) ? conses_high.cadr( pph_params_tail ) : $kw5$DEFAULT;
    return ConsesLow.list( $sym8$CYCL_TERM_TO_NL_INTERNAL, cycl_term, pph_params );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 1173L)
  public static SubLObject cycl_terms_to_nl(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl_term_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    cycl_term_list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list10 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list10 );
      if( NIL == conses_high.member( current_$3, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    }
    final SubLObject pph_params_tail = cdestructuring_bind.property_list_member( $kw4$PPH_PARAMS, current );
    final SubLObject pph_params = ( NIL != pph_params_tail ) ? conses_high.cadr( pph_params_tail ) : $kw5$DEFAULT;
    return ConsesLow.list( $sym11$CYCL_TERMS_TO_NL_INTERNAL, cycl_term_list, pph_params );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 2103L)
  public static SubLObject cycl_terms_to_nl_strings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl_term_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    cycl_term_list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list10 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list10 );
      if( NIL == conses_high.member( current_$4, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    }
    final SubLObject pph_params_tail = cdestructuring_bind.property_list_member( $kw4$PPH_PARAMS, current );
    final SubLObject pph_params = ( NIL != pph_params_tail ) ? conses_high.cadr( pph_params_tail ) : $kw5$DEFAULT;
    return ConsesLow.list( $sym13$CYCL_TERMS_TO_NL_STRINGS_INTERNAL, cycl_term_list, pph_params );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 2283L)
  public static SubLObject cycl_term_to_search_query(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    cycl_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$5, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject engine_tail = cdestructuring_bind.property_list_member( $kw17$ENGINE, current );
    final SubLObject engine = ( NIL != engine_tail ) ? conses_high.cadr( engine_tail ) : NIL;
    final SubLObject max_words_tail = cdestructuring_bind.property_list_member( $kw18$MAX_WORDS, current );
    final SubLObject max_words = ( NIL != max_words_tail ) ? conses_high.cadr( max_words_tail ) : NIL;
    final SubLObject pph_params_tail = cdestructuring_bind.property_list_member( $kw4$PPH_PARAMS, current );
    final SubLObject pph_params = ( NIL != pph_params_tail ) ? conses_high.cadr( pph_params_tail ) : $kw5$DEFAULT;
    return ConsesLow.list( $sym19$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL, cycl_term, engine, max_words, pph_params );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 2506L)
  public static SubLObject pph_output_map_to_text(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    map = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list21 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list21 );
      if( NIL == conses_high.member( current_$6, $list22, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    }
    final SubLObject use_bulleted_listsP_tail = cdestructuring_bind.property_list_member( $kw23$USE_BULLETED_LISTS_, current );
    final SubLObject use_bulleted_listsP = ( NIL != use_bulleted_listsP_tail ) ? conses_high.cadr( use_bulleted_listsP_tail ) : NIL;
    final SubLObject bulleted_list_indent_level_tail = cdestructuring_bind.property_list_member( $kw24$BULLETED_LIST_INDENT_LEVEL, current );
    final SubLObject bulleted_list_indent_level = ( NIL != bulleted_list_indent_level_tail ) ? conses_high.cadr( bulleted_list_indent_level_tail ) : ZERO_INTEGER;
    final SubLObject allow_utf8P_tail = cdestructuring_bind.property_list_member( $kw25$ALLOW_UTF8_, current );
    final SubLObject allow_utf8P = ( NIL != allow_utf8P_tail ) ? conses_high.cadr( allow_utf8P_tail ) : NIL;
    final SubLObject use_blanks_for_varsP_tail = cdestructuring_bind.property_list_member( $kw26$USE_BLANKS_FOR_VARS_, current );
    final SubLObject use_blanks_for_varsP = ( NIL != use_blanks_for_varsP_tail ) ? conses_high.cadr( use_blanks_for_varsP_tail ) : NIL;
    return ConsesLow.list( $sym27$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL, map, use_bulleted_listsP, bulleted_list_indent_level, allow_utf8P, use_blanks_for_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api-macros.lisp", position = 3102L)
  public static SubLObject pph_output_map_to_html(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    map = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      if( NIL == conses_high.member( current_$7, $list30, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    final SubLObject tag_function_tail = cdestructuring_bind.property_list_member( $kw31$TAG_FUNCTION, current );
    final SubLObject tag_function = ( NIL != tag_function_tail ) ? conses_high.cadr( tag_function_tail ) : $sym32$PPH_ANCHOR_TAGS_FOR_TERM;
    final SubLObject use_bulleted_listsP_tail = cdestructuring_bind.property_list_member( $kw23$USE_BULLETED_LISTS_, current );
    final SubLObject use_bulleted_listsP = ( NIL != use_bulleted_listsP_tail ) ? conses_high.cadr( use_bulleted_listsP_tail ) : T;
    final SubLObject bulleted_list_indent_level_tail = cdestructuring_bind.property_list_member( $kw24$BULLETED_LIST_INDENT_LEVEL, current );
    final SubLObject bulleted_list_indent_level = ( NIL != bulleted_list_indent_level_tail ) ? conses_high.cadr( bulleted_list_indent_level_tail ) : ZERO_INTEGER;
    final SubLObject link_arg0P_tail = cdestructuring_bind.property_list_member( $kw33$LINK_ARG0_, current );
    final SubLObject link_arg0P = ( NIL != link_arg0P_tail ) ? conses_high.cadr( link_arg0P_tail ) : T;
    final SubLObject use_blanks_for_varsP_tail = cdestructuring_bind.property_list_member( $kw26$USE_BLANKS_FOR_VARS_, current );
    final SubLObject use_blanks_for_varsP = ( NIL != use_blanks_for_varsP_tail ) ? conses_high.cadr( use_blanks_for_varsP_tail ) : NIL;
    return ConsesLow.list( $sym34$PPH_OUTPUT_MAP_TO_HTML_INTERNAL, map, ConsesLow.list( $sym35$QUOTE, tag_function ), use_bulleted_listsP, bulleted_list_indent_level, link_arg0P, use_blanks_for_varsP );
  }

  public static SubLObject declare_nl_generation_api_macros_file()
  {
    SubLFiles.declareMacro( me, "cycl_term_to_nl_string", "CYCL-TERM-TO-NL-STRING" );
    SubLFiles.declareMacro( me, "cycl_term_to_nl", "CYCL-TERM-TO-NL" );
    SubLFiles.declareMacro( me, "cycl_terms_to_nl", "CYCL-TERMS-TO-NL" );
    SubLFiles.declareMacro( me, "cycl_terms_to_nl_strings", "CYCL-TERMS-TO-NL-STRINGS" );
    SubLFiles.declareMacro( me, "cycl_term_to_search_query", "CYCL-TERM-TO-SEARCH-QUERY" );
    SubLFiles.declareMacro( me, "pph_output_map_to_text", "PPH-OUTPUT-MAP-TO-TEXT" );
    SubLFiles.declareMacro( me, "pph_output_map_to_html", "PPH-OUTPUT-MAP-TO-HTML" );
    return NIL;
  }

  public static SubLObject init_nl_generation_api_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_nl_generation_api_macros_file()
  {
    access_macros.register_external_symbol( $sym0$CYCL_TERM_TO_NL_STRING );
    access_macros.register_external_symbol( $sym7$CYCL_TERM_TO_NL );
    access_macros.register_external_symbol( $sym9$CYCL_TERMS_TO_NL );
    access_macros.register_external_symbol( $sym12$CYCL_TERMS_TO_NL_STRINGS );
    access_macros.register_external_symbol( $sym14$CYCL_TERM_TO_SEARCH_QUERY );
    access_macros.register_external_symbol( $sym20$PPH_OUTPUT_MAP_TO_TEXT );
    access_macros.register_external_symbol( $sym28$PPH_OUTPUT_MAP_TO_HTML );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_generation_api_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_generation_api_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_generation_api_macros_file();
  }
  static
  {
    me = new nl_generation_api_macros();
    $sym0$CYCL_TERM_TO_NL_STRING = makeSymbol( "CYCL-TERM-TO-NL-STRING" );
    $list1 = ConsesLow.list( makeSymbol( "CYCL-TERM" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PPH-PARAMS" ), makeKeyword( "DEFAULT" ) ) );
    $list2 = ConsesLow.list( makeKeyword( "PPH-PARAMS" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$PPH_PARAMS = makeKeyword( "PPH-PARAMS" );
    $kw5$DEFAULT = makeKeyword( "DEFAULT" );
    $sym6$CYCL_TERM_TO_NL_STRING_INTERNAL = makeSymbol( "CYCL-TERM-TO-NL-STRING-INTERNAL" );
    $sym7$CYCL_TERM_TO_NL = makeSymbol( "CYCL-TERM-TO-NL" );
    $sym8$CYCL_TERM_TO_NL_INTERNAL = makeSymbol( "CYCL-TERM-TO-NL-INTERNAL" );
    $sym9$CYCL_TERMS_TO_NL = makeSymbol( "CYCL-TERMS-TO-NL" );
    $list10 = ConsesLow.list( makeSymbol( "CYCL-TERM-LIST" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PPH-PARAMS" ), makeKeyword( "DEFAULT" ) ) );
    $sym11$CYCL_TERMS_TO_NL_INTERNAL = makeSymbol( "CYCL-TERMS-TO-NL-INTERNAL" );
    $sym12$CYCL_TERMS_TO_NL_STRINGS = makeSymbol( "CYCL-TERMS-TO-NL-STRINGS" );
    $sym13$CYCL_TERMS_TO_NL_STRINGS_INTERNAL = makeSymbol( "CYCL-TERMS-TO-NL-STRINGS-INTERNAL" );
    $sym14$CYCL_TERM_TO_SEARCH_QUERY = makeSymbol( "CYCL-TERM-TO-SEARCH-QUERY" );
    $list15 = ConsesLow.list( makeSymbol( "CYCL-TERM" ), makeSymbol( "&KEY" ), makeSymbol( "ENGINE" ), makeSymbol( "MAX-WORDS" ), ConsesLow.list( makeSymbol( "PPH-PARAMS" ), makeKeyword( "DEFAULT" ) ) );
    $list16 = ConsesLow.list( makeKeyword( "ENGINE" ), makeKeyword( "MAX-WORDS" ), makeKeyword( "PPH-PARAMS" ) );
    $kw17$ENGINE = makeKeyword( "ENGINE" );
    $kw18$MAX_WORDS = makeKeyword( "MAX-WORDS" );
    $sym19$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL = makeSymbol( "CYCL-TERM-TO-SEARCH-QUERY-INTERNAL" );
    $sym20$PPH_OUTPUT_MAP_TO_TEXT = makeSymbol( "PPH-OUTPUT-MAP-TO-TEXT" );
    $list21 = ConsesLow.list( makeSymbol( "MAP" ), makeSymbol( "&KEY" ), makeSymbol( "USE-BULLETED-LISTS?" ), ConsesLow.list( makeSymbol( "BULLETED-LIST-INDENT-LEVEL" ), ZERO_INTEGER ), makeSymbol( "ALLOW-UTF8?" ),
        makeSymbol( "USE-BLANKS-FOR-VARS?" ) );
    $list22 = ConsesLow.list( makeKeyword( "USE-BULLETED-LISTS?" ), makeKeyword( "BULLETED-LIST-INDENT-LEVEL" ), makeKeyword( "ALLOW-UTF8?" ), makeKeyword( "USE-BLANKS-FOR-VARS?" ) );
    $kw23$USE_BULLETED_LISTS_ = makeKeyword( "USE-BULLETED-LISTS?" );
    $kw24$BULLETED_LIST_INDENT_LEVEL = makeKeyword( "BULLETED-LIST-INDENT-LEVEL" );
    $kw25$ALLOW_UTF8_ = makeKeyword( "ALLOW-UTF8?" );
    $kw26$USE_BLANKS_FOR_VARS_ = makeKeyword( "USE-BLANKS-FOR-VARS?" );
    $sym27$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL = makeSymbol( "PPH-OUTPUT-MAP-TO-TEXT-INTERNAL" );
    $sym28$PPH_OUTPUT_MAP_TO_HTML = makeSymbol( "PPH-OUTPUT-MAP-TO-HTML" );
    $list29 = ConsesLow.list( makeSymbol( "MAP" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "TAG-FUNCTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PPH-ANCHOR-TAGS-FOR-TERM" ) ) ), ConsesLow.list(
        makeSymbol( "USE-BULLETED-LISTS?" ), T ), ConsesLow.list( makeSymbol( "BULLETED-LIST-INDENT-LEVEL" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "LINK-ARG0?" ), T ), ConsesLow.list( makeSymbol(
            "USE-BLANKS-FOR-VARS?" ), NIL ) );
    $list30 = ConsesLow.list( makeKeyword( "TAG-FUNCTION" ), makeKeyword( "USE-BULLETED-LISTS?" ), makeKeyword( "BULLETED-LIST-INDENT-LEVEL" ), makeKeyword( "LINK-ARG0?" ), makeKeyword( "USE-BLANKS-FOR-VARS?" ) );
    $kw31$TAG_FUNCTION = makeKeyword( "TAG-FUNCTION" );
    $sym32$PPH_ANCHOR_TAGS_FOR_TERM = makeSymbol( "PPH-ANCHOR-TAGS-FOR-TERM" );
    $kw33$LINK_ARG0_ = makeKeyword( "LINK-ARG0?" );
    $sym34$PPH_OUTPUT_MAP_TO_HTML_INTERNAL = makeSymbol( "PPH-OUTPUT-MAP-TO-HTML-INTERNAL" );
    $sym35$QUOTE = makeSymbol( "QUOTE" );
  }
}
/*
 * 
 * Total time: 117 ms
 * 
 */