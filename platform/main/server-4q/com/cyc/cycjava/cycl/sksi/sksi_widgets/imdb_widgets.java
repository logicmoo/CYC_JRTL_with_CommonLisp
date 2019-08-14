/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      IMDB-WIDGETS
 * source file: /cyc/top/cycl/sksi/sksi-widgets/imdb-widgets.lisp
 * created:     2019/07/03 17:38:35
 */
public final class imdb_widgets extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new imdb_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_title_ = makeString("<title>");

    static private final SubLString $str1$__ = makeString(", ");

    static private final SubLString $$$Directed_by = makeString("Directed by");

    static private final SubLString $$$Full_Cast_and_Crew_for_ = makeString("Full Cast and Crew for ");

    private static final SubLSymbol XML_TOKEN_STARTS_WITH = makeSymbol("XML-TOKEN-STARTS-WITH");

    static private final SubLString $str5$__TR_ = makeString("</TR>");

    static private final SubLString $str6$_ = makeString("<");

    static private final SubLString $str7$__TABLE_ = makeString("</TABLE>");

    static private final SubLString $str8$_TD_ = makeString("<TD ");

    static private final SubLString $str9$_a_href___Name_ = makeString("<a href=\"/Name?");

    static private final SubLString $str10$______ = makeString(" .... ");

    static private final SubLString $str11$_td_valign__top__ = makeString("<td valign=\"top\">");

    private static final SubLSymbol IMDB_CANONICALIZE_PERSON = makeSymbol("IMDB-CANONICALIZE-PERSON");

    private static final SubLSymbol HTML_GLYPH_DECODE = makeSymbol("HTML-GLYPH-DECODE");

    static private final SubLString $str15$__ = makeString("&#");

    static private final SubLString $str17$_ = makeString("%");

    static private final SubLString $$$Director = makeString("Director");

    static private final SubLString $str20$_A_NAME__ = makeString("<A NAME=\"");

    static private final SubLString $$$filmography = makeString("filmography");

    static private final SubLString $str22$_OL_ = makeString("<OL>");

    static private final SubLString $str23$_LI_ = makeString("<LI>");

    static private final SubLString $str24$__LI_ = makeString("</LI>");

    static private final SubLString $str25$__OL_ = makeString("</OL>");

    static private final SubLString $str26$_A_ = makeString("<A ");

    static private final SubLString $str27$V_ = makeString("V)");

    static private final SubLString $str28$TV_ = makeString("TV)");

    static private final SubLString $str29$VG_ = makeString("VG)");

    static private final SubLString $str30$__a_ = makeString("</a>");

    static private final SubLString $str31$_____ = makeString(".... ");

    static private final SubLString $$$unknown = makeString("unknown");

    private static final SubLSymbol IMDB_NON_MOVIE_P = makeSymbol("IMDB-NON-MOVIE-P");

    static private final SubLString $str34$_V_ = makeString("(V)");

    static private final SubLString $str35$_TV_ = makeString("(TV)");

    static private final SubLString $$$Act = makeString("Act");

    static private final SubLString $$$Cast = makeString("Cast");

    static private final SubLString $str38$Genre_ = makeString("Genre:");

    static private final SubLString $str39$_BR_ = makeString("<BR>");

    static private final SubLString $str40$_A_HREF___Sections_Genres_ = makeString("<A HREF=\"/Sections/Genres/");

    // Definitions
    public static final SubLObject imdb_get_title_alt(SubLObject tokens) {
        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt0$_title_, UNPROVIDED);
        return second(tokens);
    }

    // Definitions
    public static SubLObject imdb_get_title(SubLObject tokens) {
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str0$_title_, UNPROVIDED);
        return second(tokens);
    }

    public static final SubLObject reverse_name_alt(SubLObject name) {
        {
            SubLObject tokenized = string_utilities.string_tokenize(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return cconcatenate(format_nil.format_nil_a_no_copy(second(tokenized)), new SubLObject[]{ $str_alt1$__, format_nil.format_nil_a_no_copy(tokenized.first()) });
        }
    }

    public static SubLObject reverse_name(final SubLObject name) {
        final SubLObject tokenized = string_utilities.string_tokenize(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cconcatenate(format_nil.format_nil_a_no_copy(second(tokenized)), new SubLObject[]{ $str1$__, format_nil.format_nil_a_no_copy(tokenized.first()) });
    }

    public static final SubLObject imdb_parse_movie_directors_alt(SubLObject tokens) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_credit_request(tokens, $$$Directed_by);
    }

    public static SubLObject imdb_parse_movie_directors(final SubLObject tokens) {
        return imdb_parse_credit_request(tokens, $$$Directed_by);
    }

    public static final SubLObject imdb_parse_credit_request_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject persons = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_credit_request_internal(tokens, category);
            SubLObject page_title = string_utilities.remove_substring(com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_get_title(tokens), $str_alt3$Full_Cast_and_Crew_for_);
            persons = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_filter_non_persons(persons);
            return list_utilities.cartesian_product(list(persons, list(page_title)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject imdb_parse_credit_request(final SubLObject tokens, final SubLObject category) {
        SubLObject persons = imdb_parse_credit_request_internal(tokens, category);
        final SubLObject page_title = string_utilities.remove_substring(imdb_get_title(tokens), $$$Full_Cast_and_Crew_for_);
        persons = imdb_filter_non_persons(persons);
        return list_utilities.cartesian_product(list(persons, list(page_title)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject imdb_parse_credit_request_internal_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject category_token = category;
            tokens = web_utilities.advance_xml_tokens_to(tokens, category_token, XML_TOKEN_STARTS_WITH);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt5$__TR_, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt6$_, UNPROVIDED);
            {
                SubLObject persons = NIL;
                while ((NIL != tokens) && (NIL == web_utilities.xml_token_matches(tokens.first(), $str_alt7$__TABLE_))) {
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt8$_TD_, UNPROVIDED);
                    {
                        SubLObject person_link = second(tokens);
                        if (NIL != web_utilities.xml_token_starts_with(person_link, $str_alt9$_a_href___Name_)) {
                            {
                                SubLObject length = length(person_link);
                                SubLObject person = string_utilities.substring(person_link, FIFTEEN_INTEGER, subtract(length, TWO_INTEGER));
                                person = web_utilities.html_url_decode(person);
                                persons = cons(person, persons);
                            }
                        }
                    }
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt5$__TR_, UNPROVIDED);
                    tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt6$_, UNPROVIDED);
                } 
                persons = nreverse(persons);
                return persons;
            }
        }
    }

    public static SubLObject imdb_parse_credit_request_internal(SubLObject tokens, final SubLObject category) {
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, category, XML_TOKEN_STARTS_WITH);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str5$__TR_, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str6$_, UNPROVIDED);
        SubLObject persons = NIL;
        while ((NIL != tokens) && (NIL == xml_parsing_utilities.xml_token_matches(tokens.first(), $str7$__TABLE_))) {
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str8$_TD_, UNPROVIDED);
            final SubLObject person_link = second(tokens);
            if (NIL != xml_parsing_utilities.xml_token_starts_with(person_link, $str9$_a_href___Name_)) {
                final SubLObject length = length(person_link);
                SubLObject person = string_utilities.substring(person_link, FIFTEEN_INTEGER, subtract(length, TWO_INTEGER));
                person = web_utilities.html_url_decode(person);
                persons = cons(person, persons);
            }
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str5$__TR_, UNPROVIDED);
            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str6$_, UNPROVIDED);
        } 
        persons = nreverse(persons);
        return persons;
    }

    public static final SubLObject imdb_parse_credit_actor_request_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject persons = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_credit_actor_request_internal(tokens, category);
            SubLObject page_title = string_utilities.remove_substring(com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_get_title(tokens), $str_alt3$Full_Cast_and_Crew_for_);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = persons;
            SubLObject person = NIL;
            for (person = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , person = cdolist_list_var.first()) {
                result = cons(cons(page_title, person), result);
            }
            return result;
        }
    }

    public static SubLObject imdb_parse_credit_actor_request(final SubLObject tokens, final SubLObject category) {
        final SubLObject persons = imdb_parse_credit_actor_request_internal(tokens, category);
        final SubLObject page_title = string_utilities.remove_substring(imdb_get_title(tokens), $$$Full_Cast_and_Crew_for_);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = persons;
        SubLObject person = NIL;
        person = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(cons(page_title, person), result);
            cdolist_list_var = cdolist_list_var.rest();
            person = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject imdb_parse_credit_actor_request_internal_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject category_token = category;
            tokens = web_utilities.advance_xml_tokens_to(tokens, category_token, XML_TOKEN_STARTS_WITH);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt5$__TR_, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt6$_, UNPROVIDED);
            {
                SubLObject persons = NIL;
                SubLObject person = NIL;
                while ((NIL != tokens) && (NIL == web_utilities.xml_token_matches(tokens.first(), $str_alt7$__TABLE_))) {
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt8$_TD_, UNPROVIDED);
                    {
                        SubLObject person_link = second(tokens);
                        if (NIL != web_utilities.xml_token_starts_with(person_link, $str_alt9$_a_href___Name_)) {
                            {
                                SubLObject length = length(person_link);
                                person = string_utilities.substring(person_link, FIFTEEN_INTEGER, subtract(length, TWO_INTEGER));
                                person = web_utilities.html_url_decode(person);
                            }
                        }
                    }
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt10$______, UNPROVIDED);
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt11$_td_valign__top__, UNPROVIDED);
                    {
                        SubLObject nexttoken = second(tokens);
                        if (NIL != web_utilities.xml_token_starts_with(nexttoken, $str_alt6$_)) {
                            nexttoken = third(tokens);
                        }
                        persons = cons(list(person, nexttoken), persons);
                    }
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt5$__TR_, UNPROVIDED);
                    tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt6$_, UNPROVIDED);
                } 
                persons = nreverse(persons);
                return persons;
            }
        }
    }

    public static SubLObject imdb_parse_credit_actor_request_internal(SubLObject tokens, final SubLObject category) {
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, category, XML_TOKEN_STARTS_WITH);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str5$__TR_, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str6$_, UNPROVIDED);
        SubLObject persons = NIL;
        SubLObject person = NIL;
        while ((NIL != tokens) && (NIL == xml_parsing_utilities.xml_token_matches(tokens.first(), $str7$__TABLE_))) {
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str8$_TD_, UNPROVIDED);
            final SubLObject person_link = second(tokens);
            if (NIL != xml_parsing_utilities.xml_token_starts_with(person_link, $str9$_a_href___Name_)) {
                final SubLObject length = length(person_link);
                person = string_utilities.substring(person_link, FIFTEEN_INTEGER, subtract(length, TWO_INTEGER));
                person = web_utilities.html_url_decode(person);
            }
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str10$______, UNPROVIDED);
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str11$_td_valign__top__, UNPROVIDED);
            SubLObject nexttoken = second(tokens);
            if (NIL != xml_parsing_utilities.xml_token_starts_with(nexttoken, $str6$_)) {
                nexttoken = third(tokens);
            }
            persons = cons(list(person, nexttoken), persons);
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str5$__TR_, UNPROVIDED);
            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str6$_, UNPROVIDED);
        } 
        persons = nreverse(persons);
        return persons;
    }

    public static final SubLObject imdb_filter_non_persons_alt(SubLObject persons) {
        persons = list_utilities.delete_if_not(symbol_function(STRINGP), persons, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        persons = Mapping.mapcar(symbol_function(IMDB_CANONICALIZE_PERSON), persons);
        persons = Mapping.mapcar(symbol_function(HTML_GLYPH_DECODE), persons);
        persons = delete($str_alt15$__, persons, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        persons = delete($str_alt17$_, persons, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        persons = Sort.sort(persons, symbol_function(STRING_LESSP), UNPROVIDED);
        return persons;
    }

    public static SubLObject imdb_filter_non_persons(SubLObject persons) {
        persons = list_utilities.delete_if_not(symbol_function(STRINGP), persons, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        persons = Mapping.mapcar(symbol_function(IMDB_CANONICALIZE_PERSON), persons);
        persons = Mapping.mapcar(symbol_function(HTML_GLYPH_DECODE), persons);
        persons = delete($str15$__, persons, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        persons = delete($str17$_, persons, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        persons = Sort.sort(persons, symbol_function(STRING_LESSP), UNPROVIDED);
        return persons;
    }

    public static final SubLObject imdb_canonicalize_person_alt(SubLObject person) {
        return web_utilities.html_url_decode(person);
    }

    public static SubLObject imdb_canonicalize_person(final SubLObject person) {
        return web_utilities.html_url_decode(person);
    }

    public static final SubLObject imdb_parse_director_movies_alt(SubLObject tokens) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_movie_request(tokens, $$$Director);
    }

    public static SubLObject imdb_parse_director_movies(final SubLObject tokens) {
        return imdb_parse_movie_request(tokens, $$$Director);
    }

    public static final SubLObject imdb_parse_movie_request_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject movies = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_movie_request_internal(tokens, category);
            SubLObject page_title = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.reverse_name(com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_get_title(tokens));
            movies = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_filter_non_movies(movies);
            return list_utilities.cartesian_product(list(list(page_title), movies), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject imdb_parse_movie_request(final SubLObject tokens, final SubLObject category) {
        SubLObject movies = imdb_parse_movie_request_internal(tokens, category);
        final SubLObject page_title = reverse_name(imdb_get_title(tokens));
        movies = imdb_filter_non_movies(movies);
        return list_utilities.cartesian_product(list(list(page_title), movies), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject imdb_parse_movie_request_internal_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject category_token = cconcatenate($str_alt20$_A_NAME__, category);
            tokens = web_utilities.advance_xml_tokens_to(tokens, category_token, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $$$filmography, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt22$_OL_, UNPROVIDED);
            {
                SubLObject movies = NIL;
                SubLObject done = NIL;
                while (NIL == done) {
                    {
                        SubLObject li_pos = web_utilities.next_xml_token_position(tokens, $str_alt23$_LI_, UNPROVIDED);
                        SubLObject li_end = web_utilities.next_xml_token_position(tokens, $str_alt24$__LI_, UNPROVIDED);
                        SubLObject ol_end = web_utilities.next_xml_token_position(tokens, $str_alt25$__OL_, UNPROVIDED);
                        if (NIL != li_pos) {
                            if (ol_end.numG(li_pos)) {
                                tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt23$_LI_, UNPROVIDED);
                                tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt26$_A_, UNPROVIDED);
                                {
                                    SubLObject movie = nth(ONE_INTEGER, tokens);
                                    movies = cons(movie, movies);
                                }
                                if ((NIL != li_end) && li_end.numL(ol_end)) {
                                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt24$__LI_, UNPROVIDED);
                                    tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                } else {
                                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt25$__OL_, UNPROVIDED);
                                    done = T;
                                }
                            } else {
                                done = T;
                            }
                        } else {
                            done = T;
                        }
                    }
                } 
                movies = nreverse(movies);
                return movies;
            }
        }
    }

    public static SubLObject imdb_parse_movie_request_internal(SubLObject tokens, final SubLObject category) {
        final SubLObject category_token = cconcatenate($str20$_A_NAME__, category);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, category_token, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$filmography, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str22$_OL_, UNPROVIDED);
        SubLObject movies = NIL;
        SubLObject done = NIL;
        while (NIL == done) {
            final SubLObject li_pos = xml_parsing_utilities.next_xml_token_position(tokens, $str23$_LI_, UNPROVIDED);
            final SubLObject li_end = xml_parsing_utilities.next_xml_token_position(tokens, $str24$__LI_, UNPROVIDED);
            final SubLObject ol_end = xml_parsing_utilities.next_xml_token_position(tokens, $str25$__OL_, UNPROVIDED);
            if (NIL != li_pos) {
                if (ol_end.numG(li_pos)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str23$_LI_, UNPROVIDED);
                    tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str26$_A_, UNPROVIDED);
                    final SubLObject movie = nth(ONE_INTEGER, tokens);
                    movies = cons(movie, movies);
                    if ((NIL != li_end) && li_end.numL(ol_end)) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str24$__LI_, UNPROVIDED);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    } else {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str25$__OL_, UNPROVIDED);
                        done = T;
                    }
                } else {
                    done = T;
                }
            } else {
                done = T;
            }
        } 
        movies = nreverse(movies);
        return movies;
    }

    public static final SubLObject imdb_parse_movie_actor_request_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject movies = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_movie_actor_request_internal(tokens, category);
            SubLObject page_title = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.reverse_name(com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_get_title(tokens));
            SubLObject result = NIL;
            SubLObject cdolist_list_var = movies;
            SubLObject movie = NIL;
            for (movie = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , movie = cdolist_list_var.first()) {
                result = cons(cons(page_title, movie), result);
            }
            return result;
        }
    }

    public static SubLObject imdb_parse_movie_actor_request(final SubLObject tokens, final SubLObject category) {
        final SubLObject movies = imdb_parse_movie_actor_request_internal(tokens, category);
        final SubLObject page_title = reverse_name(imdb_get_title(tokens));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = movies;
        SubLObject movie = NIL;
        movie = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(cons(page_title, movie), result);
            cdolist_list_var = cdolist_list_var.rest();
            movie = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject imdb_parse_movie_actor_request_internal_alt(SubLObject tokens, SubLObject category) {
        {
            SubLObject category_token = cconcatenate($str_alt20$_A_NAME__, category);
            SubLObject results = NIL;
            tokens = web_utilities.advance_xml_tokens_to(tokens, category_token, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $$$filmography, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt22$_OL_, UNPROVIDED);
            {
                SubLObject movie = NIL;
                SubLObject done = NIL;
                while (NIL == done) {
                    {
                        SubLObject li_pos = web_utilities.next_xml_token_position(tokens, $str_alt23$_LI_, UNPROVIDED);
                        SubLObject li_end = web_utilities.next_xml_token_position(tokens, $str_alt24$__LI_, UNPROVIDED);
                        SubLObject ol_end = web_utilities.next_xml_token_position(tokens, $str_alt25$__OL_, UNPROVIDED);
                        if (NIL != li_pos) {
                            if (ol_end.numG(li_pos)) {
                                tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt23$_LI_, UNPROVIDED);
                                tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt26$_A_, UNPROVIDED);
                                movie = nth(ONE_INTEGER, tokens);
                                if (!(((NIL != string_utilities.ends_with(movie, $str_alt27$V_, UNPROVIDED)) || (NIL != string_utilities.ends_with(movie, $str_alt28$TV_, UNPROVIDED))) || (NIL != string_utilities.ends_with(movie, $str_alt29$VG_, UNPROVIDED)))) {
                                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt30$__a_, UNPROVIDED);
                                    {
                                        SubLObject nexttoken = second(tokens);
                                        SubLObject role_start = search($str_alt31$_____, nexttoken, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL != role_start) {
                                            results = cons(list(web_utilities.html_glyph_decode(movie), string_utilities.strip_chars_meeting_test(string_utilities.substring(nexttoken, add(role_start, FIVE_INTEGER), UNPROVIDED), UNPROVIDED)), results);
                                        } else {
                                            results = cons(list(web_utilities.html_glyph_decode(movie), $$$unknown), results);
                                        }
                                    }
                                }
                                if ((NIL != li_end) && li_end.numL(ol_end)) {
                                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt24$__LI_, UNPROVIDED);
                                    tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                } else {
                                    tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt25$__OL_, UNPROVIDED);
                                    done = T;
                                }
                            } else {
                                done = T;
                            }
                        } else {
                            done = T;
                        }
                    }
                } 
                return nreverse(results);
            }
        }
    }

    public static SubLObject imdb_parse_movie_actor_request_internal(SubLObject tokens, final SubLObject category) {
        final SubLObject category_token = cconcatenate($str20$_A_NAME__, category);
        SubLObject results = NIL;
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, category_token, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$filmography, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str22$_OL_, UNPROVIDED);
        SubLObject movie = NIL;
        SubLObject done = NIL;
        while (NIL == done) {
            final SubLObject li_pos = xml_parsing_utilities.next_xml_token_position(tokens, $str23$_LI_, UNPROVIDED);
            final SubLObject li_end = xml_parsing_utilities.next_xml_token_position(tokens, $str24$__LI_, UNPROVIDED);
            final SubLObject ol_end = xml_parsing_utilities.next_xml_token_position(tokens, $str25$__OL_, UNPROVIDED);
            if (NIL != li_pos) {
                if (ol_end.numG(li_pos)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str23$_LI_, UNPROVIDED);
                    tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str26$_A_, UNPROVIDED);
                    movie = nth(ONE_INTEGER, tokens);
                    if (((NIL == string_utilities.ends_with(movie, $str27$V_, UNPROVIDED)) && (NIL == string_utilities.ends_with(movie, $str28$TV_, UNPROVIDED))) && (NIL == string_utilities.ends_with(movie, $str29$VG_, UNPROVIDED))) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str30$__a_, UNPROVIDED);
                        final SubLObject nexttoken = second(tokens);
                        final SubLObject role_start = search($str31$_____, nexttoken, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != role_start) {
                            results = cons(list(web_utilities.html_glyph_decode(movie), string_utilities.strip_chars_meeting_test(string_utilities.substring(nexttoken, add(role_start, FIVE_INTEGER), UNPROVIDED), UNPROVIDED)), results);
                        } else {
                            results = cons(list(web_utilities.html_glyph_decode(movie), $$$unknown), results);
                        }
                    }
                    if ((NIL != li_end) && li_end.numL(ol_end)) {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str24$__LI_, UNPROVIDED);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    } else {
                        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str25$__OL_, UNPROVIDED);
                        done = T;
                    }
                } else {
                    done = T;
                }
            } else {
                done = T;
            }
        } 
        return nreverse(results);
    }

    public static final SubLObject imdb_filter_non_movies_alt(SubLObject movies) {
        movies = list_utilities.delete_if_not(symbol_function(STRINGP), movies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = Mapping.mapcar(symbol_function(HTML_GLYPH_DECODE), movies);
        movies = delete_if(symbol_function(IMDB_NON_MOVIE_P), movies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = delete($str_alt15$__, movies, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = delete($str_alt17$_, movies, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = Sort.sort(movies, symbol_function(STRING_LESSP), UNPROVIDED);
        return movies;
    }

    public static SubLObject imdb_filter_non_movies(SubLObject movies) {
        movies = list_utilities.delete_if_not(symbol_function(STRINGP), movies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = Mapping.mapcar(symbol_function(HTML_GLYPH_DECODE), movies);
        movies = delete_if(symbol_function(IMDB_NON_MOVIE_P), movies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = delete($str15$__, movies, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = delete($str17$_, movies, symbol_function(SEARCH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        movies = Sort.sort(movies, symbol_function(STRING_LESSP), UNPROVIDED);
        return movies;
    }

    /**
     * Return T iff MOVIE-NAME appears to not be movie.
     */
    @LispMethod(comment = "Return T iff MOVIE-NAME appears to not be movie.")
    public static final SubLObject imdb_non_movie_p_alt(SubLObject movie_name) {
        return makeBoolean(((NIL != search($str_alt34$_V_, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search($str_alt35$_TV_, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != position(CHAR_quotation, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff MOVIE-NAME appears to not be movie.
     */
    @LispMethod(comment = "Return T iff MOVIE-NAME appears to not be movie.")
    public static SubLObject imdb_non_movie_p(final SubLObject movie_name) {
        return makeBoolean(((NIL != search($str34$_V_, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search($str35$_TV_, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != position(CHAR_quotation, movie_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject imdb_parse_actor_movies_alt(SubLObject movie_tokens) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_movie_actor_request(movie_tokens, $$$Act);
    }

    public static SubLObject imdb_parse_actor_movies(final SubLObject movie_tokens) {
        return imdb_parse_movie_actor_request(movie_tokens, $$$Act);
    }

    public static final SubLObject imdb_parse_movie_actors_alt(SubLObject actor_tokens) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_parse_credit_actor_request(actor_tokens, $$$Cast);
    }

    public static SubLObject imdb_parse_movie_actors(final SubLObject actor_tokens) {
        return imdb_parse_credit_actor_request(actor_tokens, $$$Cast);
    }

    public static final SubLObject imdb_parse_genres_request_alt(SubLObject tokens) {
        {
            SubLObject title = com.cyc.cycjava.cycl.sksi.sksi_widgets.imdb_widgets.imdb_get_title(tokens);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt38$Genre_, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
            if (NIL != tokens) {
                {
                    SubLObject movies = NIL;
                    while (NIL == web_utilities.xml_token_matches(tokens.first(), $str_alt39$_BR_)) {
                        if (NIL != web_utilities.xml_token_starts_with(tokens.first(), $str_alt40$_A_HREF___Sections_Genres_)) {
                            tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                            movies = cons(list(title, tokens.first()), movies);
                        }
                        tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    } 
                    movies = nreverse(movies);
                    return movies;
                }
            }
        }
        return NIL;
    }

    public static SubLObject imdb_parse_genres_request(SubLObject tokens) {
        final SubLObject title = imdb_get_title(tokens);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str38$Genre_, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
        if (NIL != tokens) {
            SubLObject movies = NIL;
            while (NIL == xml_parsing_utilities.xml_token_matches(tokens.first(), $str39$_BR_)) {
                if (NIL != xml_parsing_utilities.xml_token_starts_with(tokens.first(), $str40$_A_HREF___Sections_Genres_)) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    movies = cons(list(title, tokens.first()), movies);
                }
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            } 
            movies = nreverse(movies);
            return movies;
        }
        return NIL;
    }

    public static SubLObject declare_imdb_widgets_file() {
        declareFunction("imdb_get_title", "IMDB-GET-TITLE", 1, 0, false);
        declareFunction("reverse_name", "REVERSE-NAME", 1, 0, false);
        declareFunction("imdb_parse_movie_directors", "IMDB-PARSE-MOVIE-DIRECTORS", 1, 0, false);
        declareFunction("imdb_parse_credit_request", "IMDB-PARSE-CREDIT-REQUEST", 2, 0, false);
        declareFunction("imdb_parse_credit_request_internal", "IMDB-PARSE-CREDIT-REQUEST-INTERNAL", 2, 0, false);
        declareFunction("imdb_parse_credit_actor_request", "IMDB-PARSE-CREDIT-ACTOR-REQUEST", 2, 0, false);
        declareFunction("imdb_parse_credit_actor_request_internal", "IMDB-PARSE-CREDIT-ACTOR-REQUEST-INTERNAL", 2, 0, false);
        declareFunction("imdb_filter_non_persons", "IMDB-FILTER-NON-PERSONS", 1, 0, false);
        declareFunction("imdb_canonicalize_person", "IMDB-CANONICALIZE-PERSON", 1, 0, false);
        declareFunction("imdb_parse_director_movies", "IMDB-PARSE-DIRECTOR-MOVIES", 1, 0, false);
        declareFunction("imdb_parse_movie_request", "IMDB-PARSE-MOVIE-REQUEST", 2, 0, false);
        declareFunction("imdb_parse_movie_request_internal", "IMDB-PARSE-MOVIE-REQUEST-INTERNAL", 2, 0, false);
        declareFunction("imdb_parse_movie_actor_request", "IMDB-PARSE-MOVIE-ACTOR-REQUEST", 2, 0, false);
        declareFunction("imdb_parse_movie_actor_request_internal", "IMDB-PARSE-MOVIE-ACTOR-REQUEST-INTERNAL", 2, 0, false);
        declareFunction("imdb_filter_non_movies", "IMDB-FILTER-NON-MOVIES", 1, 0, false);
        declareFunction("imdb_non_movie_p", "IMDB-NON-MOVIE-P", 1, 0, false);
        declareFunction("imdb_parse_actor_movies", "IMDB-PARSE-ACTOR-MOVIES", 1, 0, false);
        declareFunction("imdb_parse_movie_actors", "IMDB-PARSE-MOVIE-ACTORS", 1, 0, false);
        declareFunction("imdb_parse_genres_request", "IMDB-PARSE-GENRES-REQUEST", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_title_ = makeString("<title>");

    static private final SubLString $str_alt1$__ = makeString(", ");

    static private final SubLString $str_alt3$Full_Cast_and_Crew_for_ = makeString("Full Cast and Crew for ");

    static private final SubLString $str_alt5$__TR_ = makeString("</TR>");

    public static SubLObject init_imdb_widgets_file() {
        return NIL;
    }

    static private final SubLString $str_alt6$_ = makeString("<");

    public static SubLObject setup_imdb_widgets_file() {
        return NIL;
    }

    static private final SubLString $str_alt7$__TABLE_ = makeString("</TABLE>");

    @Override
    public void declareFunctions() {
        declare_imdb_widgets_file();
    }

    static private final SubLString $str_alt8$_TD_ = makeString("<TD ");

    @Override
    public void initializeVariables() {
        init_imdb_widgets_file();
    }

    static private final SubLString $str_alt9$_a_href___Name_ = makeString("<a href=\"/Name?");

    @Override
    public void runTopLevelForms() {
        setup_imdb_widgets_file();
    }

    static private final SubLString $str_alt10$______ = makeString(" .... ");

    static private final SubLString $str_alt11$_td_valign__top__ = makeString("<td valign=\"top\">");

    static {
    }

    static private final SubLString $str_alt15$__ = makeString("&#");

    static private final SubLString $str_alt17$_ = makeString("%");

    static private final SubLString $str_alt20$_A_NAME__ = makeString("<A NAME=\"");

    static private final SubLString $str_alt22$_OL_ = makeString("<OL>");

    static private final SubLString $str_alt23$_LI_ = makeString("<LI>");

    static private final SubLString $str_alt24$__LI_ = makeString("</LI>");

    static private final SubLString $str_alt25$__OL_ = makeString("</OL>");

    static private final SubLString $str_alt26$_A_ = makeString("<A ");

    static private final SubLString $str_alt27$V_ = makeString("V)");

    static private final SubLString $str_alt28$TV_ = makeString("TV)");

    static private final SubLString $str_alt29$VG_ = makeString("VG)");

    static private final SubLString $str_alt30$__a_ = makeString("</a>");

    static private final SubLString $str_alt31$_____ = makeString(".... ");

    static private final SubLString $str_alt34$_V_ = makeString("(V)");

    static private final SubLString $str_alt35$_TV_ = makeString("(TV)");

    static private final SubLString $str_alt38$Genre_ = makeString("Genre:");

    static private final SubLString $str_alt39$_BR_ = makeString("<BR>");

    static private final SubLString $str_alt40$_A_HREF___Sections_Genres_ = makeString("<A HREF=\"/Sections/Genres/");
}

/**
 * Total time: 118 ms
 */
