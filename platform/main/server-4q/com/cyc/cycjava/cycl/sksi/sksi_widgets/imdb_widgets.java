package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class imdb_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets";
  public static final String myFingerPrint = "12f57480f8b9d8ec229fb033b431f690dad2585d9d950ad588d155e0ca8d4d2b";
  private static final SubLString $str0$_title_;
  private static final SubLString $str1$__;
  private static final SubLString $str2$Directed_by;
  private static final SubLString $str3$Full_Cast_and_Crew_for_;
  private static final SubLSymbol $sym4$XML_TOKEN_STARTS_WITH;
  private static final SubLString $str5$__TR_;
  private static final SubLString $str6$_;
  private static final SubLString $str7$__TABLE_;
  private static final SubLString $str8$_TD_;
  private static final SubLString $str9$_a_href___Name_;
  private static final SubLString $str10$______;
  private static final SubLString $str11$_td_valign__top__;
  private static final SubLSymbol $sym12$STRINGP;
  private static final SubLSymbol $sym13$IMDB_CANONICALIZE_PERSON;
  private static final SubLSymbol $sym14$HTML_GLYPH_DECODE;
  private static final SubLString $str15$__;
  private static final SubLSymbol $sym16$SEARCH;
  private static final SubLString $str17$_;
  private static final SubLSymbol $sym18$STRING_LESSP;
  private static final SubLString $str19$Director;
  private static final SubLString $str20$_A_NAME__;
  private static final SubLString $str21$filmography;
  private static final SubLString $str22$_OL_;
  private static final SubLString $str23$_LI_;
  private static final SubLString $str24$__LI_;
  private static final SubLString $str25$__OL_;
  private static final SubLString $str26$_A_;
  private static final SubLString $str27$V_;
  private static final SubLString $str28$TV_;
  private static final SubLString $str29$VG_;
  private static final SubLString $str30$__a_;
  private static final SubLString $str31$_____;
  private static final SubLString $str32$unknown;
  private static final SubLSymbol $sym33$IMDB_NON_MOVIE_P;
  private static final SubLString $str34$_V_;
  private static final SubLString $str35$_TV_;
  private static final SubLString $str36$Act;
  private static final SubLString $str37$Cast;
  private static final SubLString $str38$Genre_;
  private static final SubLString $str39$_BR_;
  private static final SubLString $str40$_A_HREF___Sections_Genres_;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 978L)
  public static SubLObject imdb_get_title(SubLObject tokens)
  {
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str0$_title_, UNPROVIDED );
    return conses_high.second( tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 1148L)
  public static SubLObject reverse_name(final SubLObject name)
  {
    final SubLObject tokenized = string_utilities.string_tokenize( name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( conses_high.second( tokenized ) ), new SubLObject[] { $str1$__, format_nil.format_nil_a_no_copy( tokenized.first() )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 1303L)
  public static SubLObject imdb_parse_movie_directors(final SubLObject tokens)
  {
    return imdb_parse_credit_request( tokens, $str2$Directed_by );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 1465L)
  public static SubLObject imdb_parse_credit_request(final SubLObject tokens, final SubLObject category)
  {
    SubLObject persons = imdb_parse_credit_request_internal( tokens, category );
    final SubLObject page_title = string_utilities.remove_substring( imdb_get_title( tokens ), $str3$Full_Cast_and_Crew_for_ );
    persons = imdb_filter_non_persons( persons );
    return list_utilities.cartesian_product( ConsesLow.list( persons, ConsesLow.list( page_title ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 1805L)
  public static SubLObject imdb_parse_credit_request_internal(SubLObject tokens, final SubLObject category)
  {
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, category, $sym4$XML_TOKEN_STARTS_WITH );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str5$__TR_, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str6$_, UNPROVIDED );
    SubLObject persons = NIL;
    while ( NIL != tokens && NIL == xml_parsing_utilities.xml_token_matches( tokens.first(), $str7$__TABLE_ ))
    {
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str8$_TD_, UNPROVIDED );
      final SubLObject person_link = conses_high.second( tokens );
      if( NIL != xml_parsing_utilities.xml_token_starts_with( person_link, $str9$_a_href___Name_ ) )
      {
        final SubLObject length = Sequences.length( person_link );
        SubLObject person = string_utilities.substring( person_link, FIFTEEN_INTEGER, Numbers.subtract( length, TWO_INTEGER ) );
        person = web_utilities.html_url_decode( person );
        persons = ConsesLow.cons( person, persons );
      }
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str5$__TR_, UNPROVIDED );
      tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str6$_, UNPROVIDED );
    }
    persons = Sequences.nreverse( persons );
    return persons;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 3060L)
  public static SubLObject imdb_parse_credit_actor_request(final SubLObject tokens, final SubLObject category)
  {
    final SubLObject persons = imdb_parse_credit_actor_request_internal( tokens, category );
    final SubLObject page_title = string_utilities.remove_substring( imdb_get_title( tokens ), $str3$Full_Cast_and_Crew_for_ );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = persons;
    SubLObject person = NIL;
    person = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.cons( page_title, person ), result );
      cdolist_list_var = cdolist_list_var.rest();
      person = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 3459L)
  public static SubLObject imdb_parse_credit_actor_request_internal(SubLObject tokens, final SubLObject category)
  {
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, category, $sym4$XML_TOKEN_STARTS_WITH );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str5$__TR_, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str6$_, UNPROVIDED );
    SubLObject persons = NIL;
    SubLObject person = NIL;
    while ( NIL != tokens && NIL == xml_parsing_utilities.xml_token_matches( tokens.first(), $str7$__TABLE_ ))
    {
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str8$_TD_, UNPROVIDED );
      final SubLObject person_link = conses_high.second( tokens );
      if( NIL != xml_parsing_utilities.xml_token_starts_with( person_link, $str9$_a_href___Name_ ) )
      {
        final SubLObject length = Sequences.length( person_link );
        person = string_utilities.substring( person_link, FIFTEEN_INTEGER, Numbers.subtract( length, TWO_INTEGER ) );
        person = web_utilities.html_url_decode( person );
      }
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str10$______, UNPROVIDED );
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str11$_td_valign__top__, UNPROVIDED );
      SubLObject nexttoken = conses_high.second( tokens );
      if( NIL != xml_parsing_utilities.xml_token_starts_with( nexttoken, $str6$_ ) )
      {
        nexttoken = conses_high.third( tokens );
      }
      persons = ConsesLow.cons( ConsesLow.list( person, nexttoken ), persons );
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str5$__TR_, UNPROVIDED );
      tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
      tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str6$_, UNPROVIDED );
    }
    persons = Sequences.nreverse( persons );
    return persons;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 5035L)
  public static SubLObject imdb_filter_non_persons(SubLObject persons)
  {
    persons = list_utilities.delete_if_not( Symbols.symbol_function( $sym12$STRINGP ), persons, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    persons = Mapping.mapcar( Symbols.symbol_function( $sym13$IMDB_CANONICALIZE_PERSON ), persons );
    persons = Mapping.mapcar( Symbols.symbol_function( $sym14$HTML_GLYPH_DECODE ), persons );
    persons = Sequences.delete( $str15$__, persons, Symbols.symbol_function( $sym16$SEARCH ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    persons = Sequences.delete( $str17$_, persons, Symbols.symbol_function( $sym16$SEARCH ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    persons = Sort.sort( persons, Symbols.symbol_function( $sym18$STRING_LESSP ), UNPROVIDED );
    return persons;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 5533L)
  public static SubLObject imdb_canonicalize_person(final SubLObject person)
  {
    return web_utilities.html_url_decode( person );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 5622L)
  public static SubLObject imdb_parse_director_movies(final SubLObject tokens)
  {
    return imdb_parse_movie_request( tokens, $str19$Director );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 5774L)
  public static SubLObject imdb_parse_movie_request(final SubLObject tokens, final SubLObject category)
  {
    SubLObject movies = imdb_parse_movie_request_internal( tokens, category );
    final SubLObject page_title = reverse_name( imdb_get_title( tokens ) );
    movies = imdb_filter_non_movies( movies );
    return list_utilities.cartesian_product( ConsesLow.list( ConsesLow.list( page_title ), movies ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 6122L)
  public static SubLObject imdb_parse_movie_request_internal(SubLObject tokens, final SubLObject category)
  {
    final SubLObject category_token = Sequences.cconcatenate( $str20$_A_NAME__, category );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, category_token, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str21$filmography, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str22$_OL_, UNPROVIDED );
    SubLObject movies = NIL;
    SubLObject done = NIL;
    while ( NIL == done)
    {
      final SubLObject li_pos = xml_parsing_utilities.next_xml_token_position( tokens, $str23$_LI_, UNPROVIDED );
      final SubLObject li_end = xml_parsing_utilities.next_xml_token_position( tokens, $str24$__LI_, UNPROVIDED );
      final SubLObject ol_end = xml_parsing_utilities.next_xml_token_position( tokens, $str25$__OL_, UNPROVIDED );
      if( NIL != li_pos )
      {
        if( ol_end.numG( li_pos ) )
        {
          tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str23$_LI_, UNPROVIDED );
          tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str26$_A_, UNPROVIDED );
          final SubLObject movie = ConsesLow.nth( ONE_INTEGER, tokens );
          movies = ConsesLow.cons( movie, movies );
          if( NIL != li_end && li_end.numL( ol_end ) )
          {
            tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str24$__LI_, UNPROVIDED );
            tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
          }
          else
          {
            tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str25$__OL_, UNPROVIDED );
            done = T;
          }
        }
        else
        {
          done = T;
        }
      }
      else
      {
        done = T;
      }
    }
    movies = Sequences.nreverse( movies );
    return movies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 7529L)
  public static SubLObject imdb_parse_movie_actor_request(final SubLObject tokens, final SubLObject category)
  {
    final SubLObject movies = imdb_parse_movie_actor_request_internal( tokens, category );
    final SubLObject page_title = reverse_name( imdb_get_title( tokens ) );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = movies;
    SubLObject movie = NIL;
    movie = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.cons( page_title, movie ), result );
      cdolist_list_var = cdolist_list_var.rest();
      movie = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 7940L)
  public static SubLObject imdb_parse_movie_actor_request_internal(SubLObject tokens, final SubLObject category)
  {
    final SubLObject category_token = Sequences.cconcatenate( $str20$_A_NAME__, category );
    SubLObject results = NIL;
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, category_token, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str21$filmography, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str22$_OL_, UNPROVIDED );
    SubLObject movie = NIL;
    SubLObject done = NIL;
    while ( NIL == done)
    {
      final SubLObject li_pos = xml_parsing_utilities.next_xml_token_position( tokens, $str23$_LI_, UNPROVIDED );
      final SubLObject li_end = xml_parsing_utilities.next_xml_token_position( tokens, $str24$__LI_, UNPROVIDED );
      final SubLObject ol_end = xml_parsing_utilities.next_xml_token_position( tokens, $str25$__OL_, UNPROVIDED );
      if( NIL != li_pos )
      {
        if( ol_end.numG( li_pos ) )
        {
          tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str23$_LI_, UNPROVIDED );
          tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str26$_A_, UNPROVIDED );
          movie = ConsesLow.nth( ONE_INTEGER, tokens );
          if( NIL == string_utilities.ends_with( movie, $str27$V_, UNPROVIDED ) && NIL == string_utilities.ends_with( movie, $str28$TV_, UNPROVIDED ) && NIL == string_utilities.ends_with( movie, $str29$VG_,
              UNPROVIDED ) )
          {
            tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str30$__a_, UNPROVIDED );
            final SubLObject nexttoken = conses_high.second( tokens );
            final SubLObject role_start = Sequences.search( $str31$_____, nexttoken, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != role_start )
            {
              results = ConsesLow.cons( ConsesLow.list( web_utilities.html_glyph_decode( movie ), string_utilities.strip_chars_meeting_test( string_utilities.substring( nexttoken, Numbers.add( role_start, FIVE_INTEGER ),
                  UNPROVIDED ), UNPROVIDED ) ), results );
            }
            else
            {
              results = ConsesLow.cons( ConsesLow.list( web_utilities.html_glyph_decode( movie ), $str32$unknown ), results );
            }
          }
          if( NIL != li_end && li_end.numL( ol_end ) )
          {
            tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str24$__LI_, UNPROVIDED );
            tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
          }
          else
          {
            tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str25$__OL_, UNPROVIDED );
            done = T;
          }
        }
        else
        {
          done = T;
        }
      }
      else
      {
        done = T;
      }
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 9815L)
  public static SubLObject imdb_filter_non_movies(SubLObject movies)
  {
    movies = list_utilities.delete_if_not( Symbols.symbol_function( $sym12$STRINGP ), movies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    movies = Mapping.mapcar( Symbols.symbol_function( $sym14$HTML_GLYPH_DECODE ), movies );
    movies = Sequences.delete_if( Symbols.symbol_function( $sym33$IMDB_NON_MOVIE_P ), movies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    movies = Sequences.delete( $str15$__, movies, Symbols.symbol_function( $sym16$SEARCH ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    movies = Sequences.delete( $str17$_, movies, Symbols.symbol_function( $sym16$SEARCH ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    movies = Sort.sort( movies, Symbols.symbol_function( $sym18$STRING_LESSP ), UNPROVIDED );
    return movies;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 10322L)
  public static SubLObject imdb_non_movie_p(final SubLObject movie_name)
  {
    return makeBoolean( NIL != Sequences.search( $str34$_V_, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.search( $str35$_TV_, movie_name, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.position( Characters.CHAR_quotation, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 10528L)
  public static SubLObject imdb_parse_actor_movies(final SubLObject movie_tokens)
  {
    return imdb_parse_movie_actor_request( movie_tokens, $str36$Act );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 10692L)
  public static SubLObject imdb_parse_movie_actors(final SubLObject actor_tokens)
  {
    return imdb_parse_credit_actor_request( actor_tokens, $str37$Cast );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/imdb-widgets.lisp", position = 10863L)
  public static SubLObject imdb_parse_genres_request(SubLObject tokens)
  {
    final SubLObject title = imdb_get_title( tokens );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str38$Genre_, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
    if( NIL != tokens )
    {
      SubLObject movies = NIL;
      while ( NIL == xml_parsing_utilities.xml_token_matches( tokens.first(), $str39$_BR_ ))
      {
        if( NIL != xml_parsing_utilities.xml_token_starts_with( tokens.first(), $str40$_A_HREF___Sections_Genres_ ) )
        {
          tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
          movies = ConsesLow.cons( ConsesLow.list( title, tokens.first() ), movies );
        }
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
      }
      movies = Sequences.nreverse( movies );
      return movies;
    }
    return NIL;
  }

  public static SubLObject declare_imdb_widgets_file()
  {
    SubLFiles.declareFunction( me, "imdb_get_title", "IMDB-GET-TITLE", 1, 0, false );
    SubLFiles.declareFunction( me, "reverse_name", "REVERSE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_movie_directors", "IMDB-PARSE-MOVIE-DIRECTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_credit_request", "IMDB-PARSE-CREDIT-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_credit_request_internal", "IMDB-PARSE-CREDIT-REQUEST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_credit_actor_request", "IMDB-PARSE-CREDIT-ACTOR-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_credit_actor_request_internal", "IMDB-PARSE-CREDIT-ACTOR-REQUEST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_filter_non_persons", "IMDB-FILTER-NON-PERSONS", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_canonicalize_person", "IMDB-CANONICALIZE-PERSON", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_director_movies", "IMDB-PARSE-DIRECTOR-MOVIES", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_movie_request", "IMDB-PARSE-MOVIE-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_movie_request_internal", "IMDB-PARSE-MOVIE-REQUEST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_movie_actor_request", "IMDB-PARSE-MOVIE-ACTOR-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_movie_actor_request_internal", "IMDB-PARSE-MOVIE-ACTOR-REQUEST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "imdb_filter_non_movies", "IMDB-FILTER-NON-MOVIES", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_non_movie_p", "IMDB-NON-MOVIE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_actor_movies", "IMDB-PARSE-ACTOR-MOVIES", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_movie_actors", "IMDB-PARSE-MOVIE-ACTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "imdb_parse_genres_request", "IMDB-PARSE-GENRES-REQUEST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_imdb_widgets_file()
  {
    return NIL;
  }

  public static SubLObject setup_imdb_widgets_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_imdb_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_imdb_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_imdb_widgets_file();
  }
  static
  {
    me = new imdb_widgets();
    $str0$_title_ = makeString( "<title>" );
    $str1$__ = makeString( ", " );
    $str2$Directed_by = makeString( "Directed by" );
    $str3$Full_Cast_and_Crew_for_ = makeString( "Full Cast and Crew for " );
    $sym4$XML_TOKEN_STARTS_WITH = makeSymbol( "XML-TOKEN-STARTS-WITH" );
    $str5$__TR_ = makeString( "</TR>" );
    $str6$_ = makeString( "<" );
    $str7$__TABLE_ = makeString( "</TABLE>" );
    $str8$_TD_ = makeString( "<TD " );
    $str9$_a_href___Name_ = makeString( "<a href=\"/Name?" );
    $str10$______ = makeString( " .... " );
    $str11$_td_valign__top__ = makeString( "<td valign=\"top\">" );
    $sym12$STRINGP = makeSymbol( "STRINGP" );
    $sym13$IMDB_CANONICALIZE_PERSON = makeSymbol( "IMDB-CANONICALIZE-PERSON" );
    $sym14$HTML_GLYPH_DECODE = makeSymbol( "HTML-GLYPH-DECODE" );
    $str15$__ = makeString( "&#" );
    $sym16$SEARCH = makeSymbol( "SEARCH" );
    $str17$_ = makeString( "%" );
    $sym18$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $str19$Director = makeString( "Director" );
    $str20$_A_NAME__ = makeString( "<A NAME=\"" );
    $str21$filmography = makeString( "filmography" );
    $str22$_OL_ = makeString( "<OL>" );
    $str23$_LI_ = makeString( "<LI>" );
    $str24$__LI_ = makeString( "</LI>" );
    $str25$__OL_ = makeString( "</OL>" );
    $str26$_A_ = makeString( "<A " );
    $str27$V_ = makeString( "V)" );
    $str28$TV_ = makeString( "TV)" );
    $str29$VG_ = makeString( "VG)" );
    $str30$__a_ = makeString( "</a>" );
    $str31$_____ = makeString( ".... " );
    $str32$unknown = makeString( "unknown" );
    $sym33$IMDB_NON_MOVIE_P = makeSymbol( "IMDB-NON-MOVIE-P" );
    $str34$_V_ = makeString( "(V)" );
    $str35$_TV_ = makeString( "(TV)" );
    $str36$Act = makeString( "Act" );
    $str37$Cast = makeString( "Cast" );
    $str38$Genre_ = makeString( "Genre:" );
    $str39$_BR_ = makeString( "<BR>" );
    $str40$_A_HREF___Sections_Genres_ = makeString( "<A HREF=\"/Sections/Genres/" );
  }
}
/*
 * 
 * Total time: 118 ms
 * 
 */