package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class document_search
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.document_search";
  public static final String myFingerPrint = "4c68a9504653a7d19a7a57bcdeeaa5d41d386e097733f0d2547c28eb0cc72f20";
  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 693L)
  private static SubLSymbol $search_engines$;
  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 1624L)
  private static SubLSymbol $search_engine_specs$;
  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 2397L)
  private static SubLSymbol $default_search_engine$;
  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 14873L)
  private static SubLSymbol $cluster_id_isg$;
  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15014L)
  private static SubLSymbol $cluster_map$;
  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15145L)
  private static SubLSymbol $cluster_lock$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SEARCH_ENGINE_P;
  private static final SubLSymbol $sym3$REGISTER_SEARCH_ENGINE;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$ENGINE_UNKNOWN;
  private static final SubLSymbol $sym6$DEREGISTER_SEARCH_ENGINE;
  private static final SubLSymbol $sym7$GET_AVAILABLE_SEARCH_ENGINES;
  private static final SubLSymbol $sym8$SEARCH_ENGINE_AVAILABLE_;
  private static final SubLSymbol $sym9$GET_DEFAULT_SEARCH_ENGINE;
  private static final SubLSymbol $sym10$SET_DEFAULT_SEARCH_ENGINE;
  private static final SubLSymbol $sym11$GET_SEARCH_ENGINE_DESCRIPTION;
  private static final SubLString $str12$_;
  private static final SubLSymbol $sym13$SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE;
  private static final SubLSymbol $sym14$SEARCH_DOCUMENTS_FOR_NL_SENTENCE;
  private static final SubLSymbol $kw15$CYC_SEMANTIC;
  private static final SubLSymbol $sym16$SEARCH_COUNT;
  private static final SubLSymbol $sym17$SEARCH_URL_AVAILABLE_;
  private static final SubLSymbol $sym18$SEARCH_URL;
  private static final SubLString $str19$Cannot_retrieve_a_search_url_beca;
  private static final SubLSymbol $sym20$SEARCH_URL_FOR_CYCL_SENTENCE;
  private static final SubLSymbol $kw21$SERVER_ERROR;
  private static final SubLString $str22$Server_error_;
  private static final SubLSymbol $kw23$ERROR;
  private static final SubLString $str24$Error_;
  private static final SubLSymbol $kw25$GOOGLE;
  private static final SubLSymbol $kw26$INTERP_ID;
  private static final SubLSymbol $sym27$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str28$0_0_q__0;
  private static final SubLSymbol $sym29$DOC_ANNOTATION_IRRELEVANT_TERM;
  private static final SubLSymbol $sym30$CYCL_FORT_P;
  private static final SubLString $str31$cycTermID____0_9____;
  private static final SubLString $str32$justification____a_zA_Z_0_9____;
  private static final SubLString $str33$_span2_type__tooltip__id__;
  private static final SubLString $str34$___strong_;
  private static final SubLString $str35$_span_______;
  private static final SubLString $str36$__span_;
  private static final SubLString $str37$__strong___span2_;
  private static final SubLString $str38$Cyc_Semantic_Search_was_unable_to;
  private static final SubLSymbol $kw39$URL;
  private static final SubLString $str40$_html__font_color___005522___b_;
  private static final SubLSymbol $kw41$TITLE;
  private static final SubLString $str42$__b___font___html_;
  private static final SubLSymbol $kw43$SNIPPET;
  private static final SubLString $str44$failed_to_replace_SPAN_tags___S__;
  private static final SubLObject $const45$InferencePSC;
  private static final SubLSymbol $sym46$VALID_CONCEPT_FILTER_NODES;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$CLET;
  private static final SubLSymbol $sym49$_DEFAULT_CONCEPT_FILTER_SPECIFICATION_;
  private static final SubLSymbol $sym50$_CLUSTER_ID_ISG_;
  private static final SubLSymbol $sym51$_CLUSTER_MAP_;
  private static final SubLSymbol $sym52$_CLUSTER_LOCK_;
  private static final SubLString $str53$Ontological_Cluster_Map_Lock;
  private static final SubLSymbol $sym54$CREATE_CLUSTER;
  private static final SubLObject $const55$Thing;
  private static final SubLSymbol $sym56$FREE_CLUSTER;
  private static final SubLSymbol $sym57$ADD_TERM_TO_CLUSTER;
  private static final SubLObject $const58$Collection;
  private static final SubLObject $const59$Event;
  private static final SubLSymbol $sym60$RETRIEVE_CLUSTER;
  private static final SubLSymbol $sym61$CLUSTER_TERMS_ONTOLOGICALLY;
  private static final SubLSymbol $sym62$NULL;
  private static final SubLSymbol $sym63$GET_TERMS_FROM_URL;
  private static final SubLString $str64$;
  private static final SubLString $str65$_nbsp_;
  private static final SubLSymbol $sym66$GET_TERMS_IN_STRING;
  private static final SubLObject $const67$EnglishParaphraseMt;
  private static final SubLSymbol $kw68$FILTER;
  private static final SubLSymbol $kw69$UNKNOWN;
  private static final SubLSymbol $kw70$DEFAULT;
  private static final SubLSymbol $kw71$NONE;
  private static final SubLSymbol $sym72$LIST_ITEM_;
  private static final SubLString $str73$failed_on__S____S__;
  private static final SubLSymbol $kw74$TEST;
  private static final SubLSymbol $sym75$SUPER_JAVALISTS_MORE_OR_LESS_EQUAL;
  private static final SubLSymbol $kw76$OWNER;
  private static final SubLSymbol $kw77$CLASSES;
  private static final SubLSymbol $kw78$KB;
  private static final SubLSymbol $kw79$FULL;
  private static final SubLSymbol $kw80$WORKING_;
  private static final SubLObject $list81;

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 2449L)
  public static SubLObject search_engine_p(final SubLObject v_object)
  {
    return list_utilities.alist_has_keyP( $search_engine_specs$.getGlobalValue(), v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 2547L)
  public static SubLObject register_search_engine(final SubLObject symbol)
  {
    if( NIL == list_utilities.alist_has_keyP( $search_engine_specs$.getGlobalValue(), symbol, UNPROVIDED ) )
    {
      return $kw5$ENGINE_UNKNOWN;
    }
    SubLObject current;
    final SubLObject datum = current = conses_high.assoc( symbol, $search_engine_specs$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    SubLObject symbol_$1 = NIL;
    SubLObject description = NIL;
    SubLObject availableP = NIL;
    SubLObject string_function = NIL;
    SubLObject search_function = NIL;
    SubLObject count_function = NIL;
    SubLObject search_url_func = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    symbol_$1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    description = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    availableP = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    string_function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    search_function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    count_function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    search_url_func = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return register_search_engine_int( symbol_$1, description, availableP, string_function, search_function, count_function, search_url_func );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3002L)
  public static SubLObject register_search_engine_int(final SubLObject symbol, final SubLObject description, final SubLObject availableP, final SubLObject string_function, final SubLObject search_function,
      final SubLObject count_function, final SubLObject search_url_func)
  {
    $search_engines$.setGlobalValue( list_utilities.alist_delete( $search_engines$.getGlobalValue(), symbol, UNPROVIDED ) );
    $search_engines$.setGlobalValue( list_utilities.alist_enter( $search_engines$.getGlobalValue(), symbol, ConsesLow.list( description, availableP, string_function, search_function, count_function, search_url_func ),
        UNPROVIDED ) );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3427L)
  public static SubLObject deregister_search_engine(final SubLObject symbol)
  {
    $search_engines$.setGlobalValue( list_utilities.alist_delete( $search_engines$.getGlobalValue(), symbol, UNPROVIDED ) );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3561L)
  public static SubLObject get_available_search_engines()
  {
    SubLObject engines = NIL;
    SubLObject cdolist_list_var = $search_engines$.getGlobalValue();
    SubLObject engine = NIL;
    engine = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Functions.apply( conses_high.third( engine ), NIL ) )
      {
        engines = ConsesLow.cons( engine.first(), engines );
      }
      cdolist_list_var = cdolist_list_var.rest();
      engine = cdolist_list_var.first();
    }
    return Sequences.reverse( engines );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3772L)
  public static SubLObject search_engine_availableP(final SubLObject engine)
  {
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    if( NIL == desc )
    {
      return NIL;
    }
    return Functions.apply( conses_high.second( desc ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 3996L)
  public static SubLObject get_default_search_engine()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $default_search_engine$.getDynamicValue( thread ) )
    {
      return $default_search_engine$.getDynamicValue( thread );
    }
    set_default_search_engine( get_available_search_engines().first() );
    return $default_search_engine$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4213L)
  public static SubLObject set_default_search_engine(final SubLObject engine)
  {
    assert NIL != search_engine_p( engine ) : engine;
    $default_search_engine$.setDynamicValue( engine );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4358L)
  public static SubLObject get_search_engine_description(final SubLObject engine)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != search_engine_p( engine ) : engine;
    SubLObject description = NIL;
    thread.resetMultipleValues();
    final SubLObject desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    final SubLObject found = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != found )
    {
      description = desc.first();
    }
    return description;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4632L)
  public static SubLObject generic_query_string_for_cycl_sentence(final SubLObject cycl_sentence)
  {
    final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence( cycl_sentence, UNPROVIDED, UNPROVIDED );
    final SubLObject string_without_eol = string_utilities.replace_substring( search_string, string_utilities.$new_line_string$.getGlobalValue(), $str12$_ );
    return string_without_eol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 4893L)
  public static SubLObject query_string_for_cycl_sentence(final SubLObject cycl_sentence, final SubLObject engine)
  {
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject engine_desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    if( NIL == engine_desc )
    {
      return NIL;
    }
    return Functions.apply( conses_high.third( engine_desc ), ConsesLow.list( cycl_sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 5175L)
  public static SubLObject search_documents_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject search_string = query_string_for_cycl_sentence( search_sentence, engine );
    return search_documents( search_string, engine, start, hits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 5964L)
  public static SubLObject search_documents_for_nl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject search_string = ( engine == $kw15$CYC_SEMANTIC ) ? cyc_semantic_search_string( search_sentence ) : search_sentence;
    return search_documents( search_string, engine, start, hits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 6823L)
  public static SubLObject search_documents(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject engine_desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    if( NIL == engine_desc )
    {
      return NIL;
    }
    return Functions.apply( conses_high.fourth( engine_desc ), ConsesLow.list( search_string, start, hits ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 7633L)
  public static SubLObject search_count(final SubLObject search_string, SubLObject engine)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject engine_desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    if( NIL == engine_desc )
    {
      return NIL;
    }
    return Functions.apply( conses_high.fifth( engine_desc ), ConsesLow.list( search_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 7936L)
  public static SubLObject search_url_availableP(SubLObject engine)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject engine_desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    if( NIL == engine_desc )
    {
      return NIL;
    }
    return ( NIL != conses_high.sixth( engine_desc ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 8217L)
  public static SubLObject search_url(final SubLObject search_string, SubLObject engine, SubLObject start, SubLObject hits)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject engine_desc = list_utilities.alist_lookup( $search_engines$.getGlobalValue(), engine, UNPROVIDED, UNPROVIDED );
    if( NIL == engine_desc )
    {
      return NIL;
    }
    if( NIL == conses_high.sixth( engine_desc ) )
    {
      Errors.error( $str19$Cannot_retrieve_a_search_url_beca, engine_desc.first() );
    }
    return Functions.apply( conses_high.sixth( engine_desc ), ConsesLow.list( search_string, start, hits ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 8698L)
  public static SubLObject search_url_for_cycl_sentence(final SubLObject search_sentence, SubLObject engine, SubLObject start, SubLObject hits)
  {
    if( engine == UNPROVIDED )
    {
      engine = get_default_search_engine();
    }
    if( start == UNPROVIDED )
    {
      start = ONE_INTEGER;
    }
    if( hits == UNPROVIDED )
    {
      hits = TEN_INTEGER;
    }
    assert NIL != search_engine_p( engine ) : engine;
    final SubLObject search_string = query_string_for_cycl_sentence( search_sentence, engine );
    return search_url( search_string, engine, start, hits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 9007L)
  public static SubLObject google_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits)
  {
    final SubLObject google_results = search_engine.google_search( search_string, start, hits );
    SubLObject results = NIL;
    if( $kw21$SERVER_ERROR == google_results )
    {
      return $str22$Server_error_;
    }
    if( $kw23$ERROR == google_results )
    {
      return $str24$Error_;
    }
    SubLObject list_var = NIL;
    SubLObject result = NIL;
    SubLObject result_number = NIL;
    list_var = google_results;
    result = list_var.first();
    for( result_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), result = list_var.first(), result_number = Numbers.add( ONE_INTEGER, result_number ) )
    {
      if( result_number.numL( hits ) )
      {
        final SubLObject url = search_engine.google_passage_get_url_method( result );
        final SubLObject rank = search_engine.google_passage_get_rank_method( result );
        final SubLObject title = search_engine.google_passage_get_title_method( result );
        final SubLObject snippet = search_engine.google_passage_get_snippet_method( result );
        final SubLObject item_var;
        final SubLObject v_answer = item_var = ConsesLow.list( rank, url, title, snippet );
        if( NIL == conses_high.member( item_var, results, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          results = ConsesLow.cons( item_var, results );
        }
      }
    }
    return Sequences.reverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 9825L)
  public static SubLObject google_query_string_for_cycl_sentence(final SubLObject cycl_sentence)
  {
    final SubLObject search_string = qua_query.qua_query_string_for_cycl_sentence( cycl_sentence, $kw25$GOOGLE, UNPROVIDED );
    final SubLObject string_without_eol = string_utilities.replace_substring( search_string, string_utilities.$new_line_string$.getGlobalValue(), $str12$_ );
    return string_without_eol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10093L)
  public static SubLObject lucene_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits)
  {
    final SubLObject pages = lucene_index.ws_index_search_with_titles_and_snippets( search_string, start, hits, UNPROVIDED, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = pages;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rank = result.first();
      final SubLObject url = http_kernel.get_absolute_url( conses_high.second( result ), UNPROVIDED );
      final SubLObject title = conses_high.third( result );
      final SubLObject snippet = conses_high.fourth( result );
      results = ConsesLow.cons( ConsesLow.list( rank, url, title, snippet ), results );
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return Sequences.reverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10512L)
  public static SubLObject lucene_count_wrapper(final SubLObject search_string)
  {
    return lucene_index.ws_index_count( search_string, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10606L)
  public static SubLObject cyc_semantic_search_string(final SubLObject text_string)
  {
    SubLObject ids = NIL;
    SubLObject cdolist_list_var = document_annotation_widgets.terms_for_cyc_semantic_query( text_string );
    SubLObject record = NIL;
    record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = record.rest();
      SubLObject interps = NIL;
      interps = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        ids = ConsesLow.cons( conses_high.getf( interps, $kw26$INTERP_ID, UNPROVIDED ), ids );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        interps = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      record = cdolist_list_var.first();
    }
    return string_utilities.bunge( Sequences.nreverse( ids ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 10891L)
  public static SubLObject cyc_semantic_index_server_aliveP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == document_annotation_widgets.semantic_index_initializedP() )
    {
      return NIL;
    }
    SubLObject error_msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym27$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          document_annotation_widgets.lucene_sem_query_with_sem_search_string( $str28$0_0_q__0, ONE_INTEGER );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == error_msg )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 11327L)
  public static SubLObject cyc_semantic_query_string_for_cycl_sentence(final SubLObject cycl_sent)
  {
    final SubLObject cycl_terms = Sequences.remove_if( $sym29$DOC_ANNOTATION_IRRELEVANT_TERM, cycl_utilities.expression_gather( cycl_sent, $sym30$CYCL_FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject query_terms = NIL;
    SubLObject cdolist_list_var = cycl_terms;
    SubLObject cycl_term = NIL;
    cycl_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = document_annotation_widgets.cyc_semantic_search_token( NIL, cycl_term );
      if( NIL == conses_high.member( item_var, query_terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        query_terms = ConsesLow.cons( item_var, query_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl_term = cdolist_list_var.first();
    }
    return string_utilities.bunge( query_terms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 11677L)
  public static SubLObject replace_span_tags(SubLObject snippet)
  {
    SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_regular_expression( $str35$_span_______, snippet, UNPROVIDED, UNPROVIDED );
    SubLObject span_tag = NIL;
    span_tag = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject term_id = conses_high.second( regular_expression_utilities.regexp_capturing_match( $str31$cycTermID____0_9____, span_tag, UNPROVIDED, UNPROVIDED ) );
      final SubLObject justification_terms = string_utilities.split_string( conses_high.second( regular_expression_utilities.regexp_capturing_match( $str32$justification____a_zA_Z_0_9____, span_tag, UNPROVIDED,
          UNPROVIDED ) ), UNPROVIDED );
      final SubLObject relation_id = justification_terms.first();
      final SubLObject related_term_id = conses_high.second( justification_terms );
      if( NIL != term_id && NIL != relation_id && NIL != related_term_id )
      {
        snippet = string_utilities.replace_substring( snippet, span_tag, Sequences.cconcatenate( $str33$_span2_type__tooltip__id__, new SubLObject[] { format_nil.format_nil_a_no_copy( term_id ), $str12$_, format_nil
            .format_nil_a_no_copy( relation_id ), $str12$_, format_nil.format_nil_a_no_copy( related_term_id ), $str34$___strong_
        } ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      span_tag = cdolist_list_var.first();
    }
    snippet = string_utilities.replace_substring( snippet, $str36$__span_, $str37$__strong___span2_ );
    return snippet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 12745L)
  public static SubLObject cyc_semantic_search_wrapper(final SubLObject search_string, final SubLObject start, final SubLObject hits)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rank = ONE_INTEGER;
    SubLObject results = NIL;
    SubLObject error_msg = NIL;
    SubLObject search_results = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym27$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          search_results = document_annotation_widgets.lucene_sem_query_with_sem_search_string( search_string, hits );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_msg )
    {
      return $str38$Cyc_Semantic_Search_was_unable_to;
    }
    SubLObject cdolist_list_var = search_results;
    SubLObject search_result = NIL;
    search_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject url = list_utilities.plist_lookup( search_result, $kw39$URL, UNPROVIDED );
      final SubLObject title = Sequences.cconcatenate( $str40$_html__font_color___005522___b_, new SubLObject[] { list_utilities.plist_lookup( search_result, $kw41$TITLE, UNPROVIDED ), $str42$__b___font___html_
      } );
      SubLObject snippet = list_utilities.plist_lookup( search_result, $kw43$SNIPPET, UNPROVIDED );
      error_msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym27$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            snippet = replace_span_tags( snippet );
            results = ConsesLow.cons( ConsesLow.list( rank, url, title, snippet ), results );
          }
          catch( final Throwable catch_var2 )
          {
            Errors.handleThrowable( catch_var2, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_2, thread );
        }
      }
      catch( final Throwable ccatch_env_var2 )
      {
        error_msg = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_msg )
      {
        Errors.warn( $str44$failed_to_replace_SPAN_tags___S__, error_msg );
      }
      rank = Numbers.add( rank, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      search_result = cdolist_list_var.first();
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 13739L)
  public static SubLObject cyc_semantic_count_wrapper(final SubLObject search_string)
  {
    return TEN_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 13845L)
  public static SubLObject min_cluster_parents_for_collection(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const45$InferencePSC;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject all_genls = genls.all_genls( col, mt, tv );
    final SubLObject genls_of_type = list_utilities.remove_if_not( Symbols.symbol_function( $sym46$VALID_CONCEPT_FILTER_NODES ), all_genls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return genls.min_cols( Sequences.remove( col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 14395L)
  public static SubLObject min_cluster_parents_for_individual(final SubLObject v_term, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const45$InferencePSC;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject all_isas = isa.all_isa( v_term, mt, tv );
    final SubLObject isas_of_type = list_utilities.remove_if_not( Symbols.symbol_function( $sym46$VALID_CONCEPT_FILTER_NODES ), all_isas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return genls.min_cols( isas_of_type, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 14730L)
  public static SubLObject with_cluster_taxonomy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_set = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    v_set = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym48$CLET, ConsesLow.list( ConsesLow.list( $sym49$_DEFAULT_CONCEPT_FILTER_SPECIFICATION_, v_set ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15290L)
  public static SubLObject create_cluster()
  {
    final SubLObject v_graph = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject root_node = $const55$Thing;
    final SubLObject uuid = task_processor.get_current_task_processor_client();
    final SubLObject id = integer_sequence_generator.integer_sequence_generator_next( $cluster_id_isg$.getGlobalValue() );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $cluster_lock$.getGlobalValue() );
      dictionary.dictionary_enter( $cluster_map$.getGlobalValue(), id, ConsesLow.list( v_graph, root_node, uuid ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $cluster_lock$.getGlobalValue() );
      }
    }
    dictionary.dictionary_enter( v_graph, root_node, NIL );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 15752L)
  public static SubLObject lookup_cluster(final SubLObject graph_id)
  {
    SubLObject v_graph = NIL;
    SubLObject root = NIL;
    SubLObject uuid = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $cluster_lock$.getGlobalValue() );
      final SubLObject graph_triplet = dictionary.dictionary_lookup( $cluster_map$.getGlobalValue(), graph_id, UNPROVIDED );
      v_graph = graph_triplet.first();
      root = conses_high.second( graph_triplet );
      uuid = conses_high.third( graph_triplet );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $cluster_lock$.getGlobalValue() );
      }
    }
    return Values.values( v_graph, root, uuid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 16084L)
  public static SubLObject free_cluster(final SubLObject graph_id)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $cluster_lock$.getGlobalValue() );
      dictionary.dictionary_remove( $cluster_map$.getGlobalValue(), graph_id );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $cluster_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 16354L)
  public static SubLObject release_cluster_resources_for_client(final SubLObject client_uuid)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $cluster_lock$.getGlobalValue() );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $cluster_map$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject id = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject graph_triplet = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject graph_uuid = conses_high.third( graph_triplet );
        if( graph_uuid.equal( client_uuid ) )
        {
          free_cluster( id );
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $cluster_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 16758L)
  public static SubLObject add_term_to_cluster(final SubLObject graph_id, final SubLObject v_term, SubLObject mt, SubLObject seen_map)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const45$InferencePSC;
    }
    if( seen_map == UNPROVIDED )
    {
      seen_map = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject v_graph = lookup_cluster( graph_id );
      final SubLObject root = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == dictionary_utilities.dictionary_has_keyP( v_graph, v_term ) )
      {
        dictionary.dictionary_enter( v_graph, v_term, NIL );
        dictionary.dictionary_enter( seen_map, v_term, T );
        final SubLObject parents = ( NIL != isa.isaP( v_term, $const58$Collection, mt, UNPROVIDED ) ) ? min_cluster_parents_for_collection( v_term, mt, UNPROVIDED )
            : min_cluster_parents_for_individual( v_term, mt, UNPROVIDED );
        SubLObject seen_a_parent = NIL;
        SubLObject cdolist_list_var = parents;
        SubLObject parent = NIL;
        parent = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == dictionary_utilities.dictionary_has_keyP( seen_map, parent ) && NIL == cardinality_estimates.generality_estimateG( parent, $const59$Event ) )
          {
            seen_a_parent = T;
            add_term_to_cluster( graph_id, parent, mt, seen_map );
            dictionary_utilities.dictionary_pushnew( v_graph, parent, v_term, UNPROVIDED, UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          parent = cdolist_list_var.first();
        }
        if( NIL == seen_a_parent )
        {
          dictionary_utilities.dictionary_pushnew( v_graph, root, v_term, UNPROVIDED, UNPROVIDED );
        }
        dictionary.dictionary_remove( seen_map, v_term );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 17889L)
  public static SubLObject retrieve_cluster(final SubLObject graph_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_graph = lookup_cluster( graph_id );
    final SubLObject root = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return build_cluster_from_dag( root, v_graph, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 18250L)
  public static SubLObject cluster_terms_ontologically(final SubLObject terms)
  {
    final SubLObject graph_id = create_cluster();
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      add_term_to_cluster( graph_id, v_term, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    final SubLObject v_answer = retrieve_cluster( graph_id );
    free_cluster( graph_id );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 18790L)
  public static SubLObject find_term_in_cluster(final SubLObject v_term, final SubLObject cluster)
  {
    if( NIL == cluster )
    {
      return NIL;
    }
    if( cluster.first().eql( v_term ) )
    {
      return T;
    }
    SubLObject cdolist_list_var = cluster.rest();
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != find_term_in_cluster( v_term, child ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 19202L)
  public static SubLObject clean_cluster(final SubLObject cluster)
  {
    final SubLObject root_term = cluster.first();
    SubLObject children = cluster.rest();
    final SubLObject child_count = Sequences.length( children );
    SubLObject i = ZERO_INTEGER;
    SubLObject j = ZERO_INTEGER;
    if( ONE_INTEGER.numE( child_count ) )
    {
      return children.first();
    }
    if( ZERO_INTEGER.numE( child_count ) )
    {
      return cluster;
    }
    while ( i.numL( child_count ))
    {
      if( NIL != ConsesLow.nth( i, children ) )
      {
        for( j = ZERO_INTEGER; j.numL( i ); j = Numbers.add( j, ONE_INTEGER ) )
        {
          if( NIL != ConsesLow.nth( j, children ) )
          {
            final SubLObject child1 = ConsesLow.nth( i, children );
            final SubLObject child2 = ConsesLow.nth( j, children );
            final SubLObject head1 = child1.first();
            final SubLObject head2 = child2.first();
            final SubLObject rest1 = child1.rest();
            final SubLObject rest2 = child2.rest();
            if( head1.eql( head2 ) )
            {
              ConsesLow.set_nth( i, children, clean_cluster( ConsesLow.cons( head1, ConsesLow.append( rest1, rest2 ) ) ) );
              ConsesLow.set_nth( j, children, NIL );
            }
          }
        }
      }
      i = Numbers.add( i, ONE_INTEGER );
    }
    for( i = ZERO_INTEGER; i.numL( child_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != ConsesLow.nth( i, children ) )
      {
        for( j = ZERO_INTEGER; j.numL( child_count ); j = Numbers.add( j, ONE_INTEGER ) )
        {
          if( NIL != ConsesLow.nth( j, children ) && !i.numE( j ) )
          {
            final SubLObject child1 = ConsesLow.nth( i, children );
            final SubLObject child2 = ConsesLow.nth( j, children );
            final SubLObject head1 = child1.first();
            if( NIL != find_term_in_cluster( head1, child2 ) )
            {
              ConsesLow.set_nth( i, children, NIL );
            }
          }
        }
      }
    }
    children = Sequences.remove_if( $sym62$NULL, children, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( ONE_INTEGER.numE( Sequences.length( children ) ) )
    {
      return children.first();
    }
    return ConsesLow.cons( root_term, children );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 21267L)
  public static SubLObject build_cluster_from_dag(final SubLObject root_term, final SubLObject link_map, SubLObject seen_map)
  {
    if( seen_map == UNPROVIDED )
    {
      seen_map = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    }
    SubLObject result = NIL;
    final SubLObject terms = dictionary.dictionary_lookup( link_map, root_term, UNPROVIDED );
    if( NIL == dictionary.dictionary_lookup( seen_map, root_term, UNPROVIDED ) )
    {
      dictionary.dictionary_enter( seen_map, root_term, T );
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( build_cluster_from_dag( v_term, link_map, seen_map ), result );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      dictionary.dictionary_remove( seen_map, root_term );
    }
    return clean_cluster( ConsesLow.cons( root_term, result ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 22217L)
  public static SubLObject get_terms_from_url(final SubLObject url, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const45$InferencePSC;
    }
    final SubLObject text_object = html_utilities.remove_html_tags( web_utilities.get_html_source_from_url( url, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject dirty_text = text_object.isString() ? text_object : conses_high.second( text_object );
    final SubLObject clean_text = ( NIL == dirty_text ) ? $str64$ : string_utilities.string_substitute( $str12$_, $str65$_nbsp_, dirty_text, UNPROVIDED );
    return get_terms_in_string( clean_text, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 22833L)
  public static SubLObject get_terms_in_string(final SubLObject string, SubLObject mt, SubLObject generation_mt, SubLObject filter)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const45$InferencePSC;
    }
    if( generation_mt == UNPROVIDED )
    {
      generation_mt = $const67$EnglishParaphraseMt;
    }
    if( filter == UNPROVIDED )
    {
      filter = concept_filter.get_default_concept_filter_specification();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_document = document.new_document( string, UNPROVIDED, UNPROVIDED );
    final SubLObject iterator = concept_tagger.tag_concepts( v_document, ConsesLow.list( $kw68$FILTER, filter ) );
    final SubLObject total = document.document_sentence_length( v_document );
    SubLObject current = ZERO_INTEGER;
    SubLObject results = NIL;
    while ( NIL == iteration.iteration_done( iterator ))
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject sentence = iteration.iteration_next( iterator );
        final SubLObject sentence_text = document.sentence_string( sentence );
        current = Numbers.add( ONE_INTEGER, current );
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$3 = document.word_cycls( word );
          SubLObject v_term = NIL;
          v_term = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            final SubLObject _prev_bind_0_$4 = pph_vars.$pph_terse_modeP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$6 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding( thread );
            final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding( thread );
            final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding( thread );
            final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding( thread );
            final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding( thread );
            final SubLObject _prev_bind_8 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding( thread );
            final SubLObject _prev_bind_9 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
            final SubLObject _prev_bind_10 = pph_vars.$pph_use_title_capitalizationP$.currentBinding( thread );
            final SubLObject _prev_bind_11 = pph_vars.$pph_use_indexical_datesP$.currentBinding( thread );
            final SubLObject _prev_bind_12 = pph_vars.$pph_addressee$.currentBinding( thread );
            final SubLObject _prev_bind_13 = pph_vars.$pph_speaker$.currentBinding( thread );
            final SubLObject _prev_bind_14 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
            try
            {
              pph_vars.$pph_terse_modeP$.bind( T, thread );
              pph_vars.$pph_use_bulleted_listsP$.bind( T, thread );
              pph_vars.$pph_replace_bulleted_list_tagsP$.bind( NIL, thread );
              pph_vars.$paraphrase_precision$.bind( NIL, thread );
              pph_vars.$pph_terse_mt_scopeP$.bind( T, thread );
              pph_vars.$pph_maximize_linksP$.bind( T, thread );
              pph_vars.$pph_link_arg0P$.bind( T, thread );
              pph_vars.$pph_use_smart_variable_replacementP$.bind( T, thread );
              pph_vars.$pph_demerit_cutoff$.bind( number_utilities.positive_infinity(), thread );
              pph_vars.$pph_use_title_capitalizationP$.bind( NIL, thread );
              pph_vars.$pph_use_indexical_datesP$.bind( NIL, thread );
              pph_vars.$pph_addressee$.bind( $kw69$UNKNOWN, thread );
              pph_vars.$pph_speaker$.bind( $kw69$UNKNOWN, thread );
              pph_vars.$pph_quantify_varsP$.bind( T, thread );
              final SubLObject java_phrase = pph_main.generate_phrase_for_java( v_term, $kw70$DEFAULT, $kw71$NONE, generation_mt, mt, UNPROVIDED );
              final SubLObject result = ConsesLow.list( java_phrase, narts_high.nart_substitute( v_term ) );
              if( NIL != task_processor.task_process_pool_p( task_processor.get_task_process_pool_for_process( Threads.current_process() ) ) )
              {
                task_processor.post_task_info_processor_partial_results( ConsesLow.list( result, sentence_text, current, total ) );
              }
              else
              {
                results = ConsesLow.cons( ConsesLow.list( result, sentence_text, current, total ), results );
              }
            }
            finally
            {
              pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_14, thread );
              pph_vars.$pph_speaker$.rebind( _prev_bind_13, thread );
              pph_vars.$pph_addressee$.rebind( _prev_bind_12, thread );
              pph_vars.$pph_use_indexical_datesP$.rebind( _prev_bind_11, thread );
              pph_vars.$pph_use_title_capitalizationP$.rebind( _prev_bind_10, thread );
              pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_9, thread );
              pph_vars.$pph_use_smart_variable_replacementP$.rebind( _prev_bind_8, thread );
              pph_vars.$pph_link_arg0P$.rebind( _prev_bind_7, thread );
              pph_vars.$pph_maximize_linksP$.rebind( _prev_bind_6, thread );
              pph_vars.$pph_terse_mt_scopeP$.rebind( _prev_bind_5, thread );
              pph_vars.$paraphrase_precision$.rebind( _prev_bind_4, thread );
              pph_vars.$pph_replace_bulleted_list_tagsP$.rebind( _prev_bind_2_$6, thread );
              pph_vars.$pph_use_bulleted_listsP$.rebind( _prev_bind_1_$5, thread );
              pph_vars.$pph_terse_modeP$.rebind( _prev_bind_0_$4, thread );
            }
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            v_term = cdolist_list_var_$3.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return Sequences.reverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 24702L)
  public static SubLObject list_itemL(final SubLObject list_item1, final SubLObject list_item2)
  {
    final SubLObject pph_item1 = conses_high.second( list_item1.first().first() ).first();
    final SubLObject pph_item2 = conses_high.second( list_item2.first().first() ).first();
    final SubLObject term1 = czer_main.canonicalize_term( conses_high.second( pph_item1 ), UNPROVIDED );
    final SubLObject term2 = czer_main.canonicalize_term( conses_high.second( pph_item2 ), UNPROVIDED );
    return kb_utilities.term_L( term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 24702L)
  public static SubLObject super_javalists_more_or_less_equal(SubLObject super_jl1, SubLObject super_jl2)
  {
    super_jl1 = Sort.sort( conses_high.copy_list( super_jl1 ), Symbols.symbol_function( $sym72$LIST_ITEM_ ), UNPROVIDED );
    super_jl2 = Sort.sort( conses_high.copy_list( super_jl2 ), Symbols.symbol_function( $sym72$LIST_ITEM_ ), UNPROVIDED );
    SubLObject failureP = NIL;
    SubLObject super_list1_item = NIL;
    SubLObject super_list1_item_$7 = NIL;
    SubLObject super_list2_item = NIL;
    SubLObject super_list2_item_$8 = NIL;
    super_list1_item = super_jl1;
    super_list1_item_$7 = super_list1_item.first();
    super_list2_item = super_jl2;
    super_list2_item_$8 = super_list2_item.first();
    while ( NIL != super_list2_item || NIL != super_list1_item)
    {
      final SubLObject jl1 = super_list1_item_$7.first().first();
      final SubLObject jl2 = super_list2_item_$8.first().first();
      if( NIL == failureP )
      {
        failureP = makeBoolean( NIL == javalists_more_or_less_equal( jl1, jl2 ) );
      }
      super_list1_item = super_list1_item.rest();
      super_list1_item_$7 = super_list1_item.first();
      super_list2_item = super_list2_item.rest();
      super_list2_item_$8 = super_list2_item.first();
    }
    return makeBoolean( NIL == failureP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-search.lisp", position = 24702L)
  public static SubLObject javalists_more_or_less_equal(final SubLObject jl1, final SubLObject jl2)
  {
    final SubLObject display_string1 = jl1.first();
    final SubLObject display_string2 = jl2.first();
    final SubLObject pph_list1 = conses_high.second( jl1 );
    final SubLObject pph_list2 = conses_high.second( jl2 );
    SubLObject failureP = NIL;
    if( NIL == failureP )
    {
      SubLObject pph_item1 = NIL;
      SubLObject pph_item1_$9 = NIL;
      SubLObject pph_item2 = NIL;
      SubLObject pph_item2_$10 = NIL;
      pph_item1 = pph_list1;
      pph_item1_$9 = pph_item1.first();
      pph_item2 = pph_list2;
      pph_item2_$10 = pph_item2.first();
      while ( NIL == failureP && ( NIL != pph_item2 || NIL != pph_item1 ))
      {
        if( NIL == failureP && ( !pph_item1_$9.first().equal( pph_item2_$10.first() ) || NIL == czer_utilities.equals_elP( czer_main.canonicalize_term( conses_high.second( pph_item1_$9 ), UNPROVIDED ), czer_main
            .canonicalize_term( conses_high.second( pph_item2_$10 ), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) || !conses_high.third( pph_item1_$9 ).equal( conses_high.third( pph_item2_$10 ) ) || !conses_high
                .fifth( pph_item1_$9 ).equal( conses_high.fifth( pph_item2_$10 ) ) || !conses_high.sixth( pph_item1_$9 ).equal( conses_high.sixth( pph_item2_$10 ) ) || !display_string1.equal( display_string2 ) ) )
        {
          Errors.warn( $str73$failed_on__S____S__, pph_item1_$9, pph_item2_$10 );
          failureP = T;
        }
        pph_item1 = pph_item1.rest();
        pph_item1_$9 = pph_item1.first();
        pph_item2 = pph_item2.rest();
        pph_item2_$10 = pph_item2.first();
      }
    }
    return makeBoolean( NIL == failureP );
  }

  public static SubLObject declare_document_search_file()
  {
    SubLFiles.declareFunction( me, "search_engine_p", "SEARCH-ENGINE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "register_search_engine", "REGISTER-SEARCH-ENGINE", 1, 0, false );
    SubLFiles.declareFunction( me, "register_search_engine_int", "REGISTER-SEARCH-ENGINE-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "deregister_search_engine", "DEREGISTER-SEARCH-ENGINE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_available_search_engines", "GET-AVAILABLE-SEARCH-ENGINES", 0, 0, false );
    SubLFiles.declareFunction( me, "search_engine_availableP", "SEARCH-ENGINE-AVAILABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_search_engine", "GET-DEFAULT-SEARCH-ENGINE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_default_search_engine", "SET-DEFAULT-SEARCH-ENGINE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_search_engine_description", "GET-SEARCH-ENGINE-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_query_string_for_cycl_sentence", "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "query_string_for_cycl_sentence", "QUERY-STRING-FOR-CYCL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "search_documents_for_cycl_sentence", "SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "search_documents_for_nl_sentence", "SEARCH-DOCUMENTS-FOR-NL-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "search_documents", "SEARCH-DOCUMENTS", 1, 3, false );
    SubLFiles.declareFunction( me, "search_count", "SEARCH-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "search_url_availableP", "SEARCH-URL-AVAILABLE?", 0, 1, false );
    SubLFiles.declareFunction( me, "search_url", "SEARCH-URL", 1, 3, false );
    SubLFiles.declareFunction( me, "search_url_for_cycl_sentence", "SEARCH-URL-FOR-CYCL-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "google_search_wrapper", "GOOGLE-SEARCH-WRAPPER", 3, 0, false );
    SubLFiles.declareFunction( me, "google_query_string_for_cycl_sentence", "GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_search_wrapper", "LUCENE-SEARCH-WRAPPER", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_count_wrapper", "LUCENE-COUNT-WRAPPER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_semantic_search_string", "CYC-SEMANTIC-SEARCH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_semantic_index_server_aliveP", "CYC-SEMANTIC-INDEX-SERVER-ALIVE?", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_semantic_query_string_for_cycl_sentence", "CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_span_tags", "REPLACE-SPAN-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_semantic_search_wrapper", "CYC-SEMANTIC-SEARCH-WRAPPER", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_semantic_count_wrapper", "CYC-SEMANTIC-COUNT-WRAPPER", 1, 0, false );
    SubLFiles.declareFunction( me, "min_cluster_parents_for_collection", "MIN-CLUSTER-PARENTS-FOR-COLLECTION", 1, 2, false );
    SubLFiles.declareFunction( me, "min_cluster_parents_for_individual", "MIN-CLUSTER-PARENTS-FOR-INDIVIDUAL", 1, 2, false );
    SubLFiles.declareMacro( me, "with_cluster_taxonomy", "WITH-CLUSTER-TAXONOMY" );
    SubLFiles.declareFunction( me, "create_cluster", "CREATE-CLUSTER", 0, 0, false );
    SubLFiles.declareFunction( me, "lookup_cluster", "LOOKUP-CLUSTER", 1, 0, false );
    SubLFiles.declareFunction( me, "free_cluster", "FREE-CLUSTER", 1, 0, false );
    SubLFiles.declareFunction( me, "release_cluster_resources_for_client", "RELEASE-CLUSTER-RESOURCES-FOR-CLIENT", 1, 0, false );
    SubLFiles.declareFunction( me, "add_term_to_cluster", "ADD-TERM-TO-CLUSTER", 2, 2, false );
    SubLFiles.declareFunction( me, "retrieve_cluster", "RETRIEVE-CLUSTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cluster_terms_ontologically", "CLUSTER-TERMS-ONTOLOGICALLY", 1, 0, false );
    SubLFiles.declareFunction( me, "find_term_in_cluster", "FIND-TERM-IN-CLUSTER", 2, 0, false );
    SubLFiles.declareFunction( me, "clean_cluster", "CLEAN-CLUSTER", 1, 0, false );
    SubLFiles.declareFunction( me, "build_cluster_from_dag", "BUILD-CLUSTER-FROM-DAG", 2, 1, false );
    SubLFiles.declareFunction( me, "get_terms_from_url", "GET-TERMS-FROM-URL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_terms_in_string", "GET-TERMS-IN-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "list_itemL", "LIST-ITEM<", 2, 0, false );
    SubLFiles.declareFunction( me, "super_javalists_more_or_less_equal", "SUPER-JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "javalists_more_or_less_equal", "JAVALISTS-MORE-OR-LESS-EQUAL", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_document_search_file()
  {
    $search_engines$ = SubLFiles.deflexical( "*SEARCH-ENGINES*", $list0 );
    $search_engine_specs$ = SubLFiles.deflexical( "*SEARCH-ENGINE-SPECS*", $list1 );
    $default_search_engine$ = SubLFiles.defparameter( "*DEFAULT-SEARCH-ENGINE*", NIL );
    $cluster_id_isg$ = SubLFiles.deflexical( "*CLUSTER-ID-ISG*", maybeDefault( $sym50$_CLUSTER_ID_ISG_, $cluster_id_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) ) );
    $cluster_map$ = SubLFiles.deflexical( "*CLUSTER-MAP*", maybeDefault( $sym51$_CLUSTER_MAP_, $cluster_map$, () -> ( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) ) ) );
    $cluster_lock$ = SubLFiles.deflexical( "*CLUSTER-LOCK*", maybeDefault( $sym52$_CLUSTER_LOCK_, $cluster_lock$, () -> ( Locks.make_lock( $str53$Ontological_Cluster_Map_Lock ) ) ) );
    return NIL;
  }

  public static SubLObject setup_document_search_file()
  {
    access_macros.register_external_symbol( $sym2$SEARCH_ENGINE_P );
    access_macros.register_external_symbol( $sym3$REGISTER_SEARCH_ENGINE );
    access_macros.register_external_symbol( $sym6$DEREGISTER_SEARCH_ENGINE );
    access_macros.register_external_symbol( $sym7$GET_AVAILABLE_SEARCH_ENGINES );
    access_macros.register_external_symbol( $sym8$SEARCH_ENGINE_AVAILABLE_ );
    access_macros.register_external_symbol( $sym9$GET_DEFAULT_SEARCH_ENGINE );
    access_macros.register_external_symbol( $sym10$SET_DEFAULT_SEARCH_ENGINE );
    access_macros.register_external_symbol( $sym11$GET_SEARCH_ENGINE_DESCRIPTION );
    access_macros.register_external_symbol( $sym13$SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE );
    access_macros.register_external_symbol( $sym14$SEARCH_DOCUMENTS_FOR_NL_SENTENCE );
    access_macros.register_external_symbol( $sym16$SEARCH_COUNT );
    access_macros.register_external_symbol( $sym17$SEARCH_URL_AVAILABLE_ );
    access_macros.register_external_symbol( $sym18$SEARCH_URL );
    access_macros.register_external_symbol( $sym20$SEARCH_URL_FOR_CYCL_SENTENCE );
    subl_macro_promotions.declare_defglobal( $sym50$_CLUSTER_ID_ISG_ );
    subl_macro_promotions.declare_defglobal( $sym51$_CLUSTER_MAP_ );
    subl_macro_promotions.declare_defglobal( $sym52$_CLUSTER_LOCK_ );
    access_macros.register_external_symbol( $sym54$CREATE_CLUSTER );
    access_macros.register_external_symbol( $sym56$FREE_CLUSTER );
    access_macros.register_external_symbol( $sym57$ADD_TERM_TO_CLUSTER );
    access_macros.register_external_symbol( $sym60$RETRIEVE_CLUSTER );
    access_macros.register_external_symbol( $sym61$CLUSTER_TERMS_ONTOLOGICALLY );
    access_macros.register_external_symbol( $sym63$GET_TERMS_FROM_URL );
    access_macros.register_external_symbol( $sym66$GET_TERMS_IN_STRING );
    generic_testing.define_test_case_table_int( $sym66$GET_TERMS_IN_STRING, ConsesLow.list( new SubLObject[] { $kw74$TEST, $sym75$SUPER_JAVALISTS_MORE_OR_LESS_EQUAL, $kw76$OWNER, NIL, $kw77$CLASSES, NIL, $kw78$KB,
      $kw79$FULL, $kw80$WORKING_, NIL
    } ), $list81 );
    return NIL;
  }

  private static SubLObject _constant_81_initializer()
  {
    return ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "George Washington chopped down an apple tree" ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), constant_handles
        .reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "George Washington" ), ConsesLow.list( ConsesLow.list(
            makeString( "George" ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ), NIL, makeString( "<a href=\"cg?CB-CF&14961\" target=\"_self\">" ), NIL, ZERO_INTEGER ), ConsesLow.list(
                makeString( " " ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ), NIL, NIL, NIL, SIX_INTEGER ), ConsesLow.list( makeString( "Washington" ), constant_handles
                    .reader_make_constant_shell( makeString( "GeorgeWashington" ) ), NIL, NIL, makeString( "</a>" ), SEVEN_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ) ),
            makeString( "George Washington chopped down an apple tree" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "George Washington University" ), ConsesLow.list(
                ConsesLow.list( makeString( "George" ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, makeString( "<a href=\"cg?CB-CF&67586\" target=\"_self\">" ), NIL,
                    ZERO_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, NIL, SIX_INTEGER ), ConsesLow.list( makeString(
                        "Washington" ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, NIL, SEVEN_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles
                            .reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, NIL, SEVENTEEN_INTEGER ), ConsesLow.list( makeString( "University" ), constant_handles
                                .reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, makeString( "</a>" ), EIGHTEEN_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "GeorgeWashingtonUniversity" ) ) ), makeString( "George Washington chopped down an apple tree" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                        makeString( "chopping" ), ConsesLow.list( ConsesLow.list( makeString( "chopping" ), constant_handles.reader_make_constant_shell( makeString( "ChoppingSomething" ) ), NIL,
                                            makeString( "<a href=\"cg?CB-CF&7109\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                "ChoppingSomething" ) ) ), makeString( "George Washington chopped down an apple tree" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                    makeString( "apple tree" ), ConsesLow.list( ConsesLow.list( makeString( "apple" ), constant_handles.reader_make_constant_shell( makeString( "AppleTree" ) ), NIL,
                                                        makeString( "<a href=\"cg?CB-CF&607\" target=\"_self\">" ), NIL, ZERO_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell(
                                                            makeString( "AppleTree" ) ), NIL, NIL, NIL, FIVE_INTEGER ), ConsesLow.list( makeString( "tree" ), constant_handles.reader_make_constant_shell( makeString(
                                                                "AppleTree" ) ), NIL, NIL, makeString( "</a>" ), SIX_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "AppleTree" ) ) ), makeString(
                                                                    "George Washington chopped down an apple tree" ), ONE_INTEGER, ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                        "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ) ), ConsesLow.list( new SubLObject[]
                                                                        { ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Osama bin Laden" ), ConsesLow.list( ConsesLow.list( makeString( "Osama" ),
                                                                            constant_handles.reader_make_constant_shell( makeString( "OsamaBinLaden" ) ), NIL, makeString( "<a href=\"cg?CB-CF&44138\" target=\"_self\">" ),
                                                                            NIL, ZERO_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString( "OsamaBinLaden" ) ), NIL, NIL,
                                                                                NIL, FIVE_INTEGER ), ConsesLow.list( makeString( "bin" ), constant_handles.reader_make_constant_shell( makeString( "OsamaBinLaden" ) ), NIL,
                                                                                    NIL, NIL, SIX_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString(
                                                                                        "OsamaBinLaden" ) ), NIL, NIL, NIL, NINE_INTEGER ), ConsesLow.list( makeString( "Laden" ), constant_handles
                                                                                            .reader_make_constant_shell( makeString( "OsamaBinLaden" ) ), NIL, NIL, makeString( "</a>" ), TEN_INTEGER ) ) ),
                                                                            constant_handles.reader_make_constant_shell( makeString( "OsamaBinLaden" ) ) ), makeString(
                                                                                "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list(
                                                                                    ConsesLow.list( ConsesLow.list( makeString( "belonging" ), ConsesLow.list( ConsesLow.list( makeString( "belonging" ), constant_handles
                                                                                        .reader_make_constant_shell( makeString( "possesses" ) ), NIL, makeString( "<a href=\"cg?CB-CF&17858\" target=\"_self\">" ),
                                                                                        makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "possesses" ) ) ), makeString(
                                                                                            "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER, ONE_INTEGER ),
                                                                          ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "sighting" ), ConsesLow.list( ConsesLow.list( makeString( "sighting" ),
                                                                              constant_handles.reader_make_constant_shell( makeString( "Sighting" ) ), NIL, makeString( "<a href=\"cg?CB-CF&123172\" target=\"_self\">" ),
                                                                              makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "Sighting" ) ) ), makeString(
                                                                                  "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list(
                                                                                      ConsesLow.list( ConsesLow.list( makeString( "Afghanistan" ), ConsesLow.list( ConsesLow.list( makeString( "Afghanistan" ),
                                                                                          constant_handles.reader_make_constant_shell( makeString( "Afghanistan" ) ), NIL, makeString(
                                                                                              "<a href=\"cg?CB-CF&2761\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "Afghanistan" ) ) ), makeString(
                                                                                                      "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER,
                                                                                      ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Mohamed Atta" ), ConsesLow.list( ConsesLow.list(
                                                                                          makeString( "Mohamed" ), constant_handles.reader_make_constant_shell( makeString( "MohamedAtta" ) ), NIL, makeString(
                                                                                              "<a href=\"cg?CB-CF&94907\" target=\"_self\">" ), NIL, ZERO_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "MohamedAtta" ) ), NIL, NIL, NIL, SEVEN_INTEGER ), ConsesLow.list( makeString(
                                                                                                      "Atta" ), constant_handles.reader_make_constant_shell( makeString( "MohamedAtta" ) ), NIL, NIL, makeString( "</a>" ),
                                                                                                      EIGHT_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "MohamedAtta" ) ) ), makeString(
                                                                                                          "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER,
                                                                                          ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "visit" ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "visit" ), constant_handles.reader_make_constant_shell( makeString( "VisitingSomeone" ) ), NIL, makeString(
                                                                                                  "<a href=\"cg?CB-CF&5536\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "VisitingSomeone" ) ) ), makeString(
                                                                                                          "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER,
                                                                                              ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "sight" ), ConsesLow.list( ConsesLow.list(
                                                                                                  makeString( "sight" ), constant_handles.reader_make_constant_shell( makeString( "sees" ) ), NIL, makeString(
                                                                                                      "<a href=\"cg?CB-CF&5242\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "sees" ) ) ), makeString(
                                                                                                              "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ), ONE_INTEGER,
                                                                                                  ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "meeting event" ), ConsesLow.list( ConsesLow
                                                                                                      .list( makeString( "meeting" ), constant_handles.reader_make_constant_shell( makeString( "MeetingSomeone" ) ), NIL,
                                                                                                          makeString( "<a href=\"cg?CB-CF&21509\" target=\"_self\">" ), NIL, ZERO_INTEGER ), ConsesLow.list( makeString(
                                                                                                              " " ), constant_handles.reader_make_constant_shell( makeString( "MeetingSomeone" ) ), NIL, NIL, NIL,
                                                                                                              SEVEN_INTEGER ), ConsesLow.list( makeString( "event" ), constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "MeetingSomeone" ) ), NIL, NIL, makeString( "</a>" ), EIGHT_INTEGER ) ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "MeetingSomeone" ) ) ), makeString(
                                                                                                                          "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ),
                                                                                                      ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "visual perception" ),
                                                                                                          ConsesLow.list( ConsesLow.list( makeString( "visual" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "VisualPerception" ) ), NIL, makeString( "<a href=\"cg?CB-CF&5427\" target=\"_self\">" ), NIL, ZERO_INTEGER ),
                                                                                                              ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                  "VisualPerception" ) ), NIL, NIL, NIL, SIX_INTEGER ), ConsesLow.list( makeString( "perception" ),
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "VisualPerception" ) ), NIL, NIL, makeString(
                                                                                                                          "</a>" ), SEVEN_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "VisualPerception" ) ) ), makeString(
                                                                                                                                  "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ),
                                                                                                          ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "New York" ), ConsesLow
                                                                                                              .list( ConsesLow.list( makeString( "New" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                  "NewYork-State" ) ), NIL, makeString( "<a href=\"cg?CB-CF&503\" target=\"_self\">" ), NIL, ZERO_INTEGER ),
                                                                                                                  ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "NewYork-State" ) ), NIL, NIL, NIL, THREE_INTEGER ), ConsesLow.list( makeString( "York" ),
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "NewYork-State" ) ), NIL, NIL,
                                                                                                                          makeString( "</a>" ), FOUR_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "NewYork-State" ) ) ), makeString(
                                                                                                                                  "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ),
                                                                                                              ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "New York City, NY" ),
                                                                                                                  ConsesLow.list( ConsesLow.list( makeString( "New" ), constant_handles.reader_make_constant_shell(
                                                                                                                      makeString( "CityOfNewYorkNY" ) ), NIL, makeString( "<a href=\"cg?CB-CF&2405\" target=\"_self\">" ),
                                                                                                                      NIL, ZERO_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell(
                                                                                                                          makeString( "CityOfNewYorkNY" ) ), NIL, NIL, NIL, THREE_INTEGER ), ConsesLow.list( makeString(
                                                                                                                              "York" ), constant_handles.reader_make_constant_shell( makeString( "CityOfNewYorkNY" ) ), NIL,
                                                                                                                              NIL, NIL, FOUR_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "CityOfNewYorkNY" ) ), NIL, NIL, NIL,
                                                                                                                                  EIGHT_INTEGER ), ConsesLow.list( makeString( "City," ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "CityOfNewYorkNY" ) ), NIL, NIL, NIL,
                                                                                                                                      NINE_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "CityOfNewYorkNY" ) ), NIL, NIL, NIL,
                                                                                                                                          FOURTEEN_INTEGER ), ConsesLow.list( makeString( "NY" ), constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "CityOfNewYorkNY" ) ), NIL, NIL,
                                                                                                                                              makeString( "</a>" ), FIFTEEN_INTEGER ) ) ), constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "CityOfNewYorkNY" ) ) ),
                                                                                                                  makeString( "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ),
                                                                                                                  ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "New York" ),
                                                                                                                      ConsesLow.list( ConsesLow.list( makeString( "New" ), constant_handles.reader_make_constant_shell(
                                                                                                                          makeString( "NewYork-Colony" ) ), NIL, makeString(
                                                                                                                              "<a href=\"cg?CB-CF&166826\" target=\"_self\">" ), NIL, ZERO_INTEGER ), ConsesLow.list(
                                                                                                                                  makeString( " " ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "NewYork-Colony" ) ), NIL, NIL, NIL, THREE_INTEGER ), ConsesLow.list( makeString(
                                                                                                                                          "York" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                              "NewYork-Colony" ) ), NIL, NIL, makeString( "</a>" ), FOUR_INTEGER ) ) ),
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "NewYork-Colony" ) ) ), makeString(
                                                                                                                          "Osama bin Laden has been sighted in Afghanistan, and Mohammed Atta was seen in New York" ),
                                                                                                                      ONE_INTEGER, ONE_INTEGER )
    } ) ), ConsesLow.list( ConsesLow.list( makeString( "George Washington likes to eat apples" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "George Washington" ), ConsesLow.list(
        ConsesLow.list( makeString( "George" ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ), NIL, makeString( "<a href=\"cg?CB-CF&14961\" target=\"_self\">" ), NIL, ZERO_INTEGER ),
        ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ), NIL, NIL, NIL, SIX_INTEGER ), ConsesLow.list( makeString( "Washington" ), constant_handles
            .reader_make_constant_shell( makeString( "GeorgeWashington" ) ), NIL, NIL, makeString( "</a>" ), SEVEN_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashington" ) ) ),
        makeString( "George Washington likes to eat apples" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "George Washington University" ), ConsesLow.list( ConsesLow.list(
            makeString( "George" ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, makeString( "<a href=\"cg?CB-CF&67586\" target=\"_self\">" ), NIL, ZERO_INTEGER ),
            ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, NIL, SIX_INTEGER ), ConsesLow.list( makeString( "Washington" ),
                constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, NIL, SEVEN_INTEGER ), ConsesLow.list( makeString( " " ), constant_handles.reader_make_constant_shell(
                    makeString( "GeorgeWashingtonUniversity" ) ), NIL, NIL, NIL, SEVENTEEN_INTEGER ), ConsesLow.list( makeString( "University" ), constant_handles.reader_make_constant_shell( makeString(
                        "GeorgeWashingtonUniversity" ) ), NIL, NIL, makeString( "</a>" ), EIGHTEEN_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWashingtonUniversity" ) ) ), makeString(
                            "George Washington likes to eat apples" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "liking" ), ConsesLow.list( ConsesLow.list( makeString(
                                "liking" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ExperiencingEmotionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Like" ) ) ),
                                NIL, makeString( "<a href=\"cg?CB-CF&-119393\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "ExperiencingEmotionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Like" ) ) ) ), makeString( "George Washington likes to eat apples" ), ONE_INTEGER, ONE_INTEGER ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "liking" ), ConsesLow.list( ConsesLow.list( makeString( "liking" ), constant_handles.reader_make_constant_shell( makeString( "likes-Generic" ) ), NIL,
            makeString( "<a href=\"cg?CB-CF&83363\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles.reader_make_constant_shell( makeString( "likes-Generic" ) ) ), makeString(
                "George Washington likes to eat apples" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "eating" ), ConsesLow.list( ConsesLow.list( makeString( "eating" ),
                    constant_handles.reader_make_constant_shell( makeString( "EatingEvent" ) ), NIL, makeString( "<a href=\"cg?CB-CF&293\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), constant_handles
                        .reader_make_constant_shell( makeString( "EatingEvent" ) ) ), makeString( "George Washington likes to eat apples" ), ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                            makeString( "apple" ), ConsesLow.list( ConsesLow.list( makeString( "apple" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FruitFn" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "AppleTree" ) ) ), NIL, makeString( "<a href=\"cg?CB-CF&-3414\" target=\"_self\">" ), makeString( "</a>" ), ZERO_INTEGER ) ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "FruitFn" ) ), constant_handles.reader_make_constant_shell( makeString( "AppleTree" ) ) ) ), makeString(
                                        "George Washington likes to eat apples" ), ONE_INTEGER, ONE_INTEGER ) ) ) );
  }

  @Override
  public void declareFunctions()
  {
    declare_document_search_file();
  }

  @Override
  public void initializeVariables()
  {
    init_document_search_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_document_search_file();
  }
  static
  {
    me = new document_search();
    $search_engines$ = null;
    $search_engine_specs$ = null;
    $default_search_engine$ = null;
    $cluster_id_isg$ = null;
    $cluster_map$ = null;
    $cluster_lock$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeKeyword( "CYC-SEMANTIC" ), makeString( "Cyc Semantic Search" ), makeSymbol( "CYC-SEMANTIC-INDEX-SERVER-ALIVE?" ), makeSymbol(
        "CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol( "CYC-SEMANTIC-SEARCH-WRAPPER" ), makeSymbol( "CYC-SEMANTIC-COUNT-WRAPPER" ), NIL ), ConsesLow.list( makeKeyword( "YAHOO" ), makeString( "Yahoo!" ),
            makeSymbol( "YAHOO-AVAILABLE?" ), makeSymbol( "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol( "YAHOO-SEARCH" ), makeSymbol( "YAHOO-COUNT" ), makeSymbol( "YAHOO-SEARCH-URL" ) ), ConsesLow.list(
                makeKeyword( "GOOGLE" ), makeString( "Google" ), makeSymbol( "GET-GOOGLE-KEY" ), makeSymbol( "GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol( "GOOGLE-SEARCH-WRAPPER" ), makeSymbol( "GOOGLE-COUNT" ),
                makeSymbol( "GOOGLE-SEARCH-URL" ) ), ConsesLow.list( makeKeyword( "LUCENE" ), makeString( "Lucene" ), makeSymbol( "WS-INDEX-SERVER-ALIVE?" ), makeSymbol( "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE" ),
                    makeSymbol( "LUCENE-SEARCH-WRAPPER" ), makeSymbol( "LUCENE-COUNT-WRAPPER" ), NIL ) );
    $list1 = ConsesLow.list( ConsesLow.list( makeKeyword( "YAHOO" ), makeString( "Yahoo!" ), makeSymbol( "YAHOO-AVAILABLE?" ), makeSymbol( "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol( "YAHOO-SEARCH" ),
        makeSymbol( "YAHOO-COUNT" ), makeSymbol( "YAHOO-SEARCH-URL" ) ), ConsesLow.list( makeKeyword( "GOOGLE" ), makeString( "Google" ), makeSymbol( "GET-GOOGLE-KEY" ), makeSymbol(
            "GOOGLE-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol( "GOOGLE-SEARCH-WRAPPER" ), makeSymbol( "GOOGLE-COUNT" ), makeSymbol( "GOOGLE-SEARCH-URL" ) ), ConsesLow.list( makeKeyword( "LUCENE" ), makeString(
                "Lucene" ), makeSymbol( "WS-INDEX-SERVER-ALIVE?" ), makeSymbol( "GENERIC-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol( "LUCENE-SEARCH-WRAPPER" ), makeSymbol( "LUCENE-COUNT-WRAPPER" ), NIL ), ConsesLow
                    .list( makeKeyword( "CYC-SEMANTIC" ), makeString( "Cyc Semantic Search" ), makeSymbol( "CYC-SEMANTIC-INDEX-SERVER-ALIVE?" ), makeSymbol( "CYC-SEMANTIC-QUERY-STRING-FOR-CYCL-SENTENCE" ), makeSymbol(
                        "CYC-SEMANTIC-SEARCH-WRAPPER" ), makeSymbol( "CYC-SEMANTIC-COUNT-WRAPPER" ), NIL ) );
    $sym2$SEARCH_ENGINE_P = makeSymbol( "SEARCH-ENGINE-P" );
    $sym3$REGISTER_SEARCH_ENGINE = makeSymbol( "REGISTER-SEARCH-ENGINE" );
    $list4 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "DESCRIPTION" ), makeSymbol( "AVAILABLE?" ), makeSymbol( "STRING-FUNCTION" ), makeSymbol( "SEARCH-FUNCTION" ), makeSymbol( "COUNT-FUNCTION" ), makeSymbol(
        "SEARCH-URL-FUNC" ) );
    $kw5$ENGINE_UNKNOWN = makeKeyword( "ENGINE-UNKNOWN" );
    $sym6$DEREGISTER_SEARCH_ENGINE = makeSymbol( "DEREGISTER-SEARCH-ENGINE" );
    $sym7$GET_AVAILABLE_SEARCH_ENGINES = makeSymbol( "GET-AVAILABLE-SEARCH-ENGINES" );
    $sym8$SEARCH_ENGINE_AVAILABLE_ = makeSymbol( "SEARCH-ENGINE-AVAILABLE?" );
    $sym9$GET_DEFAULT_SEARCH_ENGINE = makeSymbol( "GET-DEFAULT-SEARCH-ENGINE" );
    $sym10$SET_DEFAULT_SEARCH_ENGINE = makeSymbol( "SET-DEFAULT-SEARCH-ENGINE" );
    $sym11$GET_SEARCH_ENGINE_DESCRIPTION = makeSymbol( "GET-SEARCH-ENGINE-DESCRIPTION" );
    $str12$_ = makeString( " " );
    $sym13$SEARCH_DOCUMENTS_FOR_CYCL_SENTENCE = makeSymbol( "SEARCH-DOCUMENTS-FOR-CYCL-SENTENCE" );
    $sym14$SEARCH_DOCUMENTS_FOR_NL_SENTENCE = makeSymbol( "SEARCH-DOCUMENTS-FOR-NL-SENTENCE" );
    $kw15$CYC_SEMANTIC = makeKeyword( "CYC-SEMANTIC" );
    $sym16$SEARCH_COUNT = makeSymbol( "SEARCH-COUNT" );
    $sym17$SEARCH_URL_AVAILABLE_ = makeSymbol( "SEARCH-URL-AVAILABLE?" );
    $sym18$SEARCH_URL = makeSymbol( "SEARCH-URL" );
    $str19$Cannot_retrieve_a_search_url_beca = makeString( "Cannot retrieve a search url because ~A does not provide that capability." );
    $sym20$SEARCH_URL_FOR_CYCL_SENTENCE = makeSymbol( "SEARCH-URL-FOR-CYCL-SENTENCE" );
    $kw21$SERVER_ERROR = makeKeyword( "SERVER-ERROR" );
    $str22$Server_error_ = makeString( "Server error." );
    $kw23$ERROR = makeKeyword( "ERROR" );
    $str24$Error_ = makeString( "Error." );
    $kw25$GOOGLE = makeKeyword( "GOOGLE" );
    $kw26$INTERP_ID = makeKeyword( "INTERP-ID" );
    $sym27$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str28$0_0_q__0 = makeString( "0#0#q\\^0" );
    $sym29$DOC_ANNOTATION_IRRELEVANT_TERM = makeSymbol( "DOC-ANNOTATION-IRRELEVANT-TERM" );
    $sym30$CYCL_FORT_P = makeSymbol( "CYCL-FORT-P" );
    $str31$cycTermID____0_9____ = makeString( "cycTermID=\"([0-9]+)\"" );
    $str32$justification____a_zA_Z_0_9____ = makeString( "justification=\"([a-zA-Z 0-9]+)\"" );
    $str33$_span2_type__tooltip__id__ = makeString( "<span2 type=\"tooltip\" id=\"" );
    $str34$___strong_ = makeString( "\"><strong>" );
    $str35$_span_______ = makeString( "<span [^>]+>" );
    $str36$__span_ = makeString( "</span>" );
    $str37$__strong___span2_ = makeString( "</strong></span2>" );
    $str38$Cyc_Semantic_Search_was_unable_to = makeString( "Cyc Semantic Search was unable to perform the search." );
    $kw39$URL = makeKeyword( "URL" );
    $str40$_html__font_color___005522___b_ = makeString( "<html><font color=\"#005522\"><b>" );
    $kw41$TITLE = makeKeyword( "TITLE" );
    $str42$__b___font___html_ = makeString( "</b></font></html>" );
    $kw43$SNIPPET = makeKeyword( "SNIPPET" );
    $str44$failed_to_replace_SPAN_tags___S__ = makeString( "failed to replace SPAN tags: ~S~%" );
    $const45$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym46$VALID_CONCEPT_FILTER_NODES = makeSymbol( "VALID-CONCEPT-FILTER-NODES" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym48$CLET = makeSymbol( "CLET" );
    $sym49$_DEFAULT_CONCEPT_FILTER_SPECIFICATION_ = makeSymbol( "*DEFAULT-CONCEPT-FILTER-SPECIFICATION*" );
    $sym50$_CLUSTER_ID_ISG_ = makeSymbol( "*CLUSTER-ID-ISG*" );
    $sym51$_CLUSTER_MAP_ = makeSymbol( "*CLUSTER-MAP*" );
    $sym52$_CLUSTER_LOCK_ = makeSymbol( "*CLUSTER-LOCK*" );
    $str53$Ontological_Cluster_Map_Lock = makeString( "Ontological Cluster Map Lock" );
    $sym54$CREATE_CLUSTER = makeSymbol( "CREATE-CLUSTER" );
    $const55$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym56$FREE_CLUSTER = makeSymbol( "FREE-CLUSTER" );
    $sym57$ADD_TERM_TO_CLUSTER = makeSymbol( "ADD-TERM-TO-CLUSTER" );
    $const58$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const59$Event = constant_handles.reader_make_constant_shell( makeString( "Event" ) );
    $sym60$RETRIEVE_CLUSTER = makeSymbol( "RETRIEVE-CLUSTER" );
    $sym61$CLUSTER_TERMS_ONTOLOGICALLY = makeSymbol( "CLUSTER-TERMS-ONTOLOGICALLY" );
    $sym62$NULL = makeSymbol( "NULL" );
    $sym63$GET_TERMS_FROM_URL = makeSymbol( "GET-TERMS-FROM-URL" );
    $str64$ = makeString( "" );
    $str65$_nbsp_ = makeString( "&nbsp;" );
    $sym66$GET_TERMS_IN_STRING = makeSymbol( "GET-TERMS-IN-STRING" );
    $const67$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $kw68$FILTER = makeKeyword( "FILTER" );
    $kw69$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw70$DEFAULT = makeKeyword( "DEFAULT" );
    $kw71$NONE = makeKeyword( "NONE" );
    $sym72$LIST_ITEM_ = makeSymbol( "LIST-ITEM<" );
    $str73$failed_on__S____S__ = makeString( "failed on ~S~% ~S~%" );
    $kw74$TEST = makeKeyword( "TEST" );
    $sym75$SUPER_JAVALISTS_MORE_OR_LESS_EQUAL = makeSymbol( "SUPER-JAVALISTS-MORE-OR-LESS-EQUAL" );
    $kw76$OWNER = makeKeyword( "OWNER" );
    $kw77$CLASSES = makeKeyword( "CLASSES" );
    $kw78$KB = makeKeyword( "KB" );
    $kw79$FULL = makeKeyword( "FULL" );
    $kw80$WORKING_ = makeKeyword( "WORKING?" );
    $list81 = _constant_81_initializer();
  }
}
/*
 * 
 * Total time: 462 ms
 * 
 */