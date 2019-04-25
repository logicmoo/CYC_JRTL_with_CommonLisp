package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lucene_index
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lucene_index";
  public static final String myFingerPrint = "2c3c5679ace69848f5fa0d3a6910c515611afe769a177f9ceeb244e1c33d58be";
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 3698L)
  public static SubLSymbol $ws_index_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 4003L)
  public static SubLSymbol $ws_index_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 4364L)
  private static SubLSymbol $url_index_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 4566L)
  private static SubLSymbol $url_index_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 4729L)
  public static SubLSymbol $ebmt_index_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 4960L)
  public static SubLSymbol $ebmt_index_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 5134L)
  public static SubLSymbol $ebmt_index_content$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 5410L)
  public static SubLSymbol $ebmt_index_log$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 5617L)
  private static SubLSymbol $ql_index_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 5997L)
  private static SubLSymbol $ql_index_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 6336L)
  private static SubLSymbol $ql_index_root_dir_names$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 7028L)
  private static SubLSymbol $ql_index_log$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24221L)
  public static SubLSymbol $ql_index_sc_added$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24343L)
  public static SubLSymbol $ql_index_sc_not_added$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24432L)
  public static SubLSymbol $ql_index_sc_built$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24511L)
  public static SubLSymbol $ql_index_sc_not_built$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24600L)
  public static SubLSymbol $ql_index_sc_query$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24679L)
  public static SubLSymbol $ql_index_sc_form$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24756L)
  public static SubLSymbol $ql_index_sc_cycl$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24832L)
  public static SubLSymbol $ql_index_sc_kb$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24902L)
  public static SubLSymbol $ql_index_sc_process$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 24987L)
  public static SubLSymbol $ql_index_sc_host$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25063L)
  public static SubLSymbol $ql_index_sc_user$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25139L)
  public static SubLSymbol $ql_index_sc_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25215L)
  public static SubLSymbol $ql_index_sc_type$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25291L)
  public static SubLSymbol $ql_index_sc_id$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25361L)
  public static SubLSymbol $ql_index_sc_gloss$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25440L)
  public static SubLSymbol $ql_index_sc_generation$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25534L)
  public static SubLSymbol $ql_index_sc_build$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25613L)
  public static SubLSymbol $ql_index_sc_add$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25686L)
  public static SubLSymbol $ql_index_sc_add_n$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25765L)
  public static SubLSymbol $ql_index_sc_find$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25841L)
  public static SubLSymbol $ql_index_sc_quit$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 25921L)
  public static SubLSymbol $ql_index_sc_search_string$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 26024L)
  public static SubLSymbol $ql_index_sc_query_index_forms$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 37462L)
  private static SubLSymbol $lucene_query_string_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 38578L)
  public static SubLSymbol $lucene_symbolic_query_translate_dates$;
  private static final SubLString $str0$query;
  private static final SubLString $str1$type;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_WS_INDEX_HOST_;
  private static final SubLString $str4$webstore_cyc_com;
  private static final SubLSymbol $kw5$PARAMETER;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$_WS_INDEX_PORT_;
  private static final SubLInteger $int8$7777;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$CLET;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$_URL_INDEX_HOST_;
  private static final SubLString $str13$urlindex_cyc_com;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$_URL_INDEX_PORT_;
  private static final SubLInteger $int16$7778;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$_EBMT_INDEX_HOST_;
  private static final SubLString $str19$ebmtindex_cyc_com;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$_EBMT_INDEX_PORT_;
  private static final SubLInteger $int22$7779;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$_EBMT_INDEX_CONTENT_;
  private static final SubLString $str25$_cyc_departments_nl_corpora_ebmt_;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$_EBMT_INDEX_LOG_;
  private static final SubLString $str28$_cyc_departments_nl_corpora_ebmt_;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$_QL_INDEX_HOST_;
  private static final SubLString $str31$elmore_cyc_com;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$_QL_INDEX_PORT_;
  private static final SubLInteger $int34$7781;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$_QL_INDEX_ROOT_DIR_NAMES_;
  private static final SubLString $str37$data_ir_indexes_ql;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$_QL_INDEX_LOG_;
  private static final SubLString $str40$data_ir_indexes_ql_ql_index_log;
  private static final SubLSymbol $sym41$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw42$PUBLIC;
  private static final SubLString $str43$___lucene_index_query__s__s__s___;
  private static final SubLString $str44$version;
  private static final SubLString $str45$;
  private static final SubLString $str46$Lucene_Index_Server_listening_at_;
  private static final SubLString $str47$Lucene_Index_Server_NOT_listening;
  private static final SubLString $str48$AddIndices;
  private static final SubLString $str49$__;
  private static final SubLString $str50$__;
  private static final SubLString $str51$__;
  private static final SubLString $str52$_;
  private static final SubLSymbol $sym53$CCONCATENATE;
  private static final SubLString $str54$StringURLs;
  private static final SubLString $str55$Web_store_Index_Server_not_listen;
  private static final SubLString $str56$StringURLsAndSnippets;
  private static final SubLString $str57$StringURLsTitlesAndSnippets__A__A;
  private static final SubLString $str58$URLContent;
  private static final SubLString $str59$URLText;
  private static final SubLString $str60$URLTitle;
  private static final SubLString $str61$URLFile;
  private static final SubLString $str62$StringFiles;
  private static final SubLString $str63$_quit_;
  private static final SubLString $str64$Successfully_shutdown_Web_store_I;
  private static final SubLString $str65$CountContents;
  private static final SubLString $str66$URLIndex;
  private static final SubLString $str67$URL_Index_Server_not_listening_at;
  private static final SubLString $str68$Successfully_shutdown_URL_Index_S;
  private static final SubLString $str69$add;
  private static final SubLString $str70$EBMT_Template_Index_Server_not_li;
  private static final SubLString $str71$find;
  private static final SubLSymbol $sym72$EBMT_TEMPLATE_FROM_RAW_TEMPLATE;
  private static final SubLString $str73$delete;
  private static final SubLString $str74$Successfully_shutdown_EBMT_Templa;
  private static final SubLString $str75$Added;
  private static final SubLString $str76$NotAdded;
  private static final SubLString $str77$Built;
  private static final SubLString $str78$NotBuilt;
  private static final SubLString $str79$form;
  private static final SubLString $str80$cycl;
  private static final SubLString $str81$kb;
  private static final SubLString $str82$process;
  private static final SubLString $str83$host;
  private static final SubLString $str84$user;
  private static final SubLString $str85$time;
  private static final SubLString $str86$id;
  private static final SubLString $str87$gloss;
  private static final SubLString $str88$generation;
  private static final SubLString $str89$build;
  private static final SubLString $str90$add_n;
  private static final SubLString $str91$search_string;
  private static final SubLString $str92$query_index_forms;
  private static final SubLSymbol $sym93$NON_EMPTY_STRING_P;
  private static final SubLSymbol $sym94$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym95$BOOLEAN_;
  private static final SubLString $str96$QL_Index_Server_not_listening_at_;
  private static final SubLSymbol $kw97$ID;
  private static final SubLSymbol $kw98$CYCL;
  private static final SubLSymbol $kw99$GENERATION;
  private static final SubLSymbol $kw100$GLOSS;
  private static final SubLSymbol $kw101$KB;
  private static final SubLSymbol $kw102$PROCESS;
  private static final SubLSymbol $kw103$HOST;
  private static final SubLSymbol $kw104$USER;
  private static final SubLSymbol $kw105$TIME;
  private static final SubLSymbol $kw106$FAILED_TO_CONNECT;
  private static final SubLSymbol $kw107$FAILED_TO_SHUTDOWN;
  private static final SubLSymbol $kw108$SHUTDOWN;
  private static final SubLString $str109$Successfully_shutdown_QL_Index_Se;
  private static final SubLSymbol $sym110$CONTROL_CHAR_P;
  private static final SubLSymbol $kw111$KEYWORD;
  private static final SubLString $str112$true;
  private static final SubLSymbol $kw113$BAG;
  private static final SubLSymbol $kw114$AND;
  private static final SubLString $str115$_AND_;
  private static final SubLSymbol $kw116$OR;
  private static final SubLString $str117$_OR_;
  private static final SubLSymbol $kw118$QUOTE;
  private static final SubLString $str119$_;
  private static final SubLSymbol $kw120$MUST;
  private static final SubLString $str121$_;
  private static final SubLSymbol $kw122$LIKE;
  private static final SubLString $str123$_;
  private static final SubLString $str124$___;
  private static final SubLSymbol $kw125$RANGE;
  private static final SubLString $str126$_;
  private static final SubLString $str127$_TO_;
  private static final SubLString $str128$_;
  private static final SubLString $str129$Unknown_operator__A__dont_know_ho;
  private static final SubLString $str130$YYYYMMDD;
  private static final SubLString $str131$date;
  private static final SubLString $str132$_home_shah_cvs_head_cycorp_cyc_ja;
  private static final SubLInteger $int133$8002;
  private static final SubLObject $const134$EBMTTrainingExamplesFromQLMt;
  private static final SubLSymbol $sym135$STRINGP;
  private static final SubLSymbol $sym136$HLMT_P;
  private static final SubLString $str137$_opt_local_pkg_j2sdk1_4_2_bin_jav;
  private static final SubLString $str138$_cp;
  private static final SubLString $str139$com_cyc_common_nlp_EBMTTemplateIn;
  private static final SubLString $str140$_i;
  private static final SubLString $str141$_cyc_top_data_ebmt_release_;
  private static final SubLString $str142$_ebmt_index_;
  private static final SubLString $str143$_p;
  private static final SubLString $str144$_ebmt_index_txt;
  private static final SubLString $str145$_ebmt_index_log;
  private static final SubLString $str146$EBMT_Template_Index_Server;
  private static final SubLString $str147$localhost;
  private static final SubLString $str148$No_templates_added_to_EBMT_Templa;

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 3074L)
  public static SubLObject lucene_index_query_xml(final SubLObject query_type, final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_xml = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        xml_utilities.xml_start_tag_internal( $str0$query, ConsesLow.list( $str1$type, query_type ), NIL, UNPROVIDED, UNPROVIDED );
        xml_utilities.xml_write( query, UNPROVIDED );
        xml_utilities.xml_end_tag_internal( $str0$query );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      query_xml = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return query_xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 4172L)
  public static SubLObject with_ws_index_server(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject host = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    host = current.first();
    current = current.rest();
    final SubLObject port = current.isCons() ? current.first() : $ws_index_port$.getDynamicValue( thread );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list9 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym10$CLET, ConsesLow.list( ConsesLow.list( $sym3$_WS_INDEX_HOST_, host ), ConsesLow.list( $sym7$_WS_INDEX_PORT_, port ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 5828L)
  public static SubLObject get_ql_index_host()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ql_index_host$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 5890L)
  public static SubLObject set_ql_index_host(final SubLObject hostname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $ql_index_host$.setDynamicValue( hostname, thread );
    return $ql_index_host$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 6177L)
  public static SubLObject get_ql_index_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ql_index_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 6239L)
  public static SubLObject set_ql_index_port(final SubLObject v_int)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $ql_index_port$.setDynamicValue( v_int, thread );
    return $ql_index_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 6801L)
  public static SubLObject get_ql_index_root_dir_names()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ql_index_root_dir_names$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 6883L)
  public static SubLObject set_ql_index_root_dir_names(final SubLObject names_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $ql_index_root_dir_names$.setDynamicValue( names_string, thread );
    return $ql_index_root_dir_names$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 7276L)
  public static SubLObject get_ql_index_log()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ql_index_log$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 7336L)
  public static SubLObject set_ql_index_log(final SubLObject pathname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $ql_index_log$.setDynamicValue( pathname, thread );
    return $ql_index_log$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 7440L)
  public static SubLObject lucene_index_query(final SubLObject string, final SubLObject host, final SubLObject port)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym41$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = subl_promotions.open_tcp_stream_with_timeout( host, port, NIL, $kw42$PUBLIC );
            if( NIL != subl_macro_promotions.validate_tcp_connection( stream, host, port ) )
            {
              print_high.princ( string, stream );
              streams_high.terpri( stream );
              streams_high.finish_output( stream );
              result = streams_high.read_line( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != stream )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
            }
          }
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      PrintLow.format( T, $str43$___lucene_index_query__s__s__s___, new SubLObject[] { string, host, port, error
      } );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 7957L)
  public static SubLObject lucene_index_server_version(final SubLObject host, final SubLObject port)
  {
    final SubLObject query_xml = lucene_index_query_xml( $str44$version, $str45$ );
    return lucene_index_query( query_xml, host, port );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 8188L)
  public static SubLObject lucene_index_server_aliveP(final SubLObject host, final SubLObject port, final SubLObject verbose)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject status = NIL;
    SubLObject output = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding( thread );
      try
      {
        StreamsLow.$standard_output$.bind( s, thread );
        if( NIL != lucene_index_server_version( host, port ) )
        {
          status = T;
        }
      }
      finally
      {
        StreamsLow.$standard_output$.rebind( _prev_bind_0, thread );
      }
      output = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    if( NIL != verbose )
    {
      if( NIL != status )
      {
        PrintLow.format( T, $str46$Lucene_Index_Server_listening_at_, port, host );
      }
      else
      {
        PrintLow.format( T, $str47$Lucene_Index_Server_NOT_listening, port, host );
      }
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 8817L)
  public static SubLObject lucene_index_add_indices(final SubLObject host, final SubLObject port, final SubLObject indices)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject indices_string = NIL;
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      indices_string = string_utilities.strip_first( format_nil.format_nil_s( indices ) );
      indices_string = string_utilities.strip_final( indices_string, UNPROVIDED );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    final SubLObject query_xml = lucene_index_query_xml( $str48$AddIndices, indices_string );
    return lucene_index_query( query_xml, host, port );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 9198L)
  public static SubLObject ws_build_search_string(final SubLObject includes, final SubLObject excludes, final SubLObject likes, SubLObject old_search_string)
  {
    if( old_search_string == UNPROVIDED )
    {
      old_search_string = NIL;
    }
    SubLObject pieces = NIL;
    SubLObject cdolist_list_var = includes;
    SubLObject include = NIL;
    include = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pieces = ConsesLow.cons( $str49$__, pieces );
      pieces = ConsesLow.cons( include, pieces );
      cdolist_list_var = cdolist_list_var.rest();
      include = cdolist_list_var.first();
    }
    cdolist_list_var = excludes;
    SubLObject exclude = NIL;
    exclude = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pieces = ConsesLow.cons( $str50$__, pieces );
      pieces = ConsesLow.cons( exclude, pieces );
      cdolist_list_var = cdolist_list_var.rest();
      exclude = cdolist_list_var.first();
    }
    cdolist_list_var = likes;
    SubLObject like = NIL;
    like = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pieces = ConsesLow.cons( $str51$__, pieces );
      pieces = ConsesLow.cons( like, pieces );
      cdolist_list_var = cdolist_list_var.rest();
      like = cdolist_list_var.first();
    }
    if( NIL != old_search_string )
    {
      pieces = ConsesLow.cons( $str52$_, pieces );
      pieces = ConsesLow.cons( old_search_string, pieces );
    }
    return string_utilities.reduce_whitespace( Functions.apply( Symbols.symbol_function( $sym53$CCONCATENATE ), Sequences.nreverse( pieces ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 9829L)
  public static SubLObject get_ws_index_host()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ws_index_host$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 9913L)
  public static SubLObject get_ws_index_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ws_index_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 9975L)
  public static SubLObject ws_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    return lucene_index_server_aliveP( host, port, verbose );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 10256L)
  public static SubLObject ws_index_search(final SubLObject search_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str54$StringURLs, search_string );
      return reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 11082L)
  public static SubLObject ws_index_search_with_snippets(final SubLObject search_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str56$StringURLsAndSnippets, search_string );
      return reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 11933L)
  public static SubLObject ws_index_search_with_titles_and_snippets(final SubLObject search_string, final SubLObject start, final SubLObject count, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    final SubLObject command = PrintLow.format( NIL, $str57$StringURLsTitlesAndSnippets__A__A, start, count );
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( command, search_string );
      return reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 12890L)
  public static SubLObject ws_index_url_content(final SubLObject url_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str58$URLContent, url_string );
      return lucene_index_query( query_xml, host, port );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 13631L)
  public static SubLObject ws_index_url_text(final SubLObject url_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str59$URLText, url_string );
      return lucene_index_query( query_xml, host, port );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 14380L)
  public static SubLObject ws_index_url_title(final SubLObject url_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str60$URLTitle, url_string );
      return lucene_index_query( query_xml, host, port );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 15119L)
  public static SubLObject ws_index_pathname_for_url(final SubLObject url_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str61$URLFile, url_string );
      return lucene_index_query( query_xml, host, port );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 15999L)
  public static SubLObject ws_index_search_for_pathnames(final SubLObject search_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str62$StringFiles, search_string );
      return reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 16889L)
  public static SubLObject ws_index_shutdown(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str63$_quit_, $str45$ );
      lucene_index_query( query_xml, host, port );
    }
    if( NIL != verbose )
    {
      PrintLow.format( T, $str64$Successfully_shutdown_Web_store_I, port, host );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 17359L)
  public static SubLObject ws_index_count(final SubLObject search_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ws_index_port$.getDynamicValue();
    }
    if( NIL != ws_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str65$CountContents, search_string );
      final SubLObject result = reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return ( NIL == result ) ? ZERO_INTEGER : result.first();
    }
    Errors.warn( $str55$Web_store_Index_Server_not_listen, port, host );
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 17966L)
  public static SubLObject url_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $url_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    return lucene_index_server_aliveP( host, port, verbose );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 18261L)
  public static SubLObject url_index_search(final SubLObject search_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $url_index_port$.getDynamicValue();
    }
    if( NIL != url_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str66$URLIndex, search_string );
      return reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    Errors.warn( $str67$URL_Index_Server_not_listening_at, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 19089L)
  public static SubLObject url_index_shutdown(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ws_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $url_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    if( NIL != url_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str63$_quit_, $str45$ );
      lucene_index_query( query_xml, host, port );
    }
    if( NIL != verbose )
    {
      PrintLow.format( T, $str68$Successfully_shutdown_URL_Index_S, port, host );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 19542L)
  public static SubLObject ebmt_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ebmt_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ebmt_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    return lucene_index_server_aliveP( host, port, verbose );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 19863L)
  public static SubLObject ebmt_index_add_template(final SubLObject template_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ebmt_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ebmt_index_port$.getDynamicValue();
    }
    if( NIL != ebmt_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str69$add, template_string );
      return lucene_index_query( query_xml, host, port );
    }
    Errors.warn( $str70$EBMT_Template_Index_Server_not_li, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 20732L)
  public static SubLObject ebmt_template_from_raw_template(final SubLObject raw_template)
  {
    return ebmt_template_parser.new_ebmt_template( NIL, NIL, conses_high.third( raw_template.first() ), list_utilities.cadar( raw_template ), NIL, conses_high.second( raw_template ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 21060L)
  public static SubLObject ebmt_index_find_templates(final SubLObject linkage_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ebmt_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ebmt_index_port$.getDynamicValue();
    }
    if( NIL != ebmt_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str71$find, linkage_string );
      final SubLObject raw_templates = reader.read_from_string( lucene_index_query( query_xml, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject ebmt_templates = Mapping.mapcar( $sym72$EBMT_TEMPLATE_FROM_RAW_TEMPLATE, raw_templates );
      return ebmt_templates;
    }
    Errors.warn( $str70$EBMT_Template_Index_Server_not_li, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 22078L)
  public static SubLObject ebmt_index_delete_template(final SubLObject template_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ebmt_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ebmt_index_port$.getDynamicValue();
    }
    if( NIL != ebmt_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str73$delete, template_string );
      return lucene_index_query( query_xml, host, port );
    }
    Errors.warn( $str70$EBMT_Template_Index_Server_not_li, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 22988L)
  public static SubLObject ebmt_index_add_indices(final SubLObject indices, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ebmt_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ebmt_index_port$.getDynamicValue();
    }
    if( NIL != ebmt_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return lucene_index_add_indices( host, port, indices );
    }
    Errors.warn( $str70$EBMT_Template_Index_Server_not_li, port, host );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 23735L)
  public static SubLObject ebmt_index_shutdown(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ebmt_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ebmt_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    if( NIL != ebmt_index_server_aliveP( UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_xml = lucene_index_query_xml( $str63$_quit_, $str45$ );
      lucene_index_query( query_xml, host, port );
    }
    if( NIL != verbose )
    {
      PrintLow.format( T, $str74$Successfully_shutdown_EBMT_Templa, port, host );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 26139L)
  public static SubLObject ql_index_server_aliveP(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ql_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ql_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    assert NIL != string_utilities.non_empty_string_p( host ) : host;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    assert NIL != obsolete.booleanP( verbose ) : verbose;
    return lucene_index_server_aliveP( host, port, verbose );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 26529L)
  public static SubLObject ql_index_add_queries(final SubLObject encapsulated_requests, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ql_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ql_index_port$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = $ql_index_sc_not_added$.getGlobalValue();
    if( NIL != list_utilities.non_empty_list_p( encapsulated_requests ) && NIL != string_utilities.non_empty_string_p( host ) && NIL != subl_promotions.positive_integer_p( port ) )
    {
      if( NIL != ql_index_server_aliveP( host, port, UNPROVIDED ) )
      {
        SubLObject tmpstr = $str45$;
        SubLObject xml_msg = $str45$;
        SubLObject stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( stream, thread );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_query$.getGlobalValue(), ConsesLow.list( $ql_index_sc_type$.getGlobalValue(), $ql_index_sc_add_n$.getGlobalValue() ), NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_query_index_forms$.getGlobalValue(), ConsesLow.list( $ql_index_sc_kb$.getGlobalValue(), format_nil.format_nil_a( control_vars.kb_loaded() ) ), NIL,
                UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
          tmpstr = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
        xml_msg = tmpstr;
        tmpstr = $str45$;
        SubLObject cdolist_list_var = encapsulated_requests;
        SubLObject v_encapsulation = NIL;
        v_encapsulation = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject xml_form_doc = ql_index_add_query_xml( v_encapsulation );
          if( NIL != xml_form_doc )
          {
            xml_msg = Sequences.cconcatenate( xml_msg, xml_form_doc );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_encapsulation = cdolist_list_var.first();
        }
        stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( stream, thread );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_query_index_forms$.getGlobalValue() );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_query$.getGlobalValue() );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
          tmpstr = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
        xml_msg = Sequences.cconcatenate( xml_msg, tmpstr );
        final SubLObject tmp = lucene_index_query( xml_msg, host, port );
        if( tmp.equal( $ql_index_sc_added$.getGlobalValue() ) )
        {
          result = tmp;
        }
      }
      else
      {
        Errors.warn( $str96$QL_Index_Server_not_listening_at_, port, host );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 28329L)
  public static SubLObject ql_index_add_query(final SubLObject encapsulated_request, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ql_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ql_index_port$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = $ql_index_sc_not_added$.getGlobalValue();
    if( NIL != list_utilities.property_list_p( encapsulated_request ) && NIL != string_utilities.non_empty_string_p( host ) && NIL != subl_promotions.positive_integer_p( port ) )
    {
      if( NIL != ql_index_server_aliveP( host, port, UNPROVIDED ) )
      {
        final SubLObject xml_form_doc = ql_index_add_query_xml( encapsulated_request );
        SubLObject tmpstr = $str45$;
        SubLObject xml_msg = $str45$;
        if( NIL != string_utilities.non_empty_string_p( xml_form_doc ) )
        {
          SubLObject stream = NIL;
          try
          {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
            try
            {
              xml_vars.$xml_stream$.bind( stream, thread );
              xml_utilities.xml_start_tag_internal( $ql_index_sc_query$.getGlobalValue(), ConsesLow.list( $ql_index_sc_type$.getGlobalValue(), $ql_index_sc_add$.getGlobalValue() ), NIL, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
            }
            xml_msg = streams_high.get_output_stream_string( stream );
          }
          finally
          {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              streams_high.close( stream, UNPROVIDED );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
          xml_msg = Sequences.cconcatenate( xml_msg, xml_form_doc );
          stream = NIL;
          try
          {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
            try
            {
              xml_vars.$xml_stream$.bind( stream, thread );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_query$.getGlobalValue() );
            }
            finally
            {
              xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
            }
            tmpstr = streams_high.get_output_stream_string( stream );
          }
          finally
          {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              streams_high.close( stream, UNPROVIDED );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
            }
          }
          xml_msg = Sequences.cconcatenate( xml_msg, tmpstr );
          final SubLObject tmp = lucene_index_query( xml_msg, host, port );
          if( tmp.equal( $ql_index_sc_added$.getGlobalValue() ) )
          {
            result = tmp;
          }
        }
      }
      else
      {
        Errors.warn( $str96$QL_Index_Server_not_listening_at_, port, host );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 29822L)
  public static SubLObject ql_index_add_query_xml(final SubLObject encapsulated_request)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject xml_form_doc = NIL;
    if( NIL != list_utilities.property_list_p( encapsulated_request ) )
    {
      final SubLObject id_string = conses_high.getf( encapsulated_request, $kw97$ID, UNPROVIDED );
      final SubLObject cycl = conses_high.getf( encapsulated_request, $kw98$CYCL, UNPROVIDED );
      final SubLObject generation = conses_high.getf( encapsulated_request, $kw99$GENERATION, UNPROVIDED );
      final SubLObject gloss = conses_high.getf( encapsulated_request, $kw100$GLOSS, UNPROVIDED );
      final SubLObject kb = conses_high.getf( encapsulated_request, $kw101$KB, UNPROVIDED );
      final SubLObject process = conses_high.getf( encapsulated_request, $kw102$PROCESS, UNPROVIDED );
      final SubLObject cyc_host = conses_high.getf( encapsulated_request, $kw103$HOST, UNPROVIDED );
      final SubLObject user = conses_high.getf( encapsulated_request, $kw104$USER, UNPROVIDED );
      final SubLObject time = conses_high.getf( encapsulated_request, $kw105$TIME, UNPROVIDED );
      if( NIL != string_utilities.non_empty_string_p( id_string ) && NIL != cycl && ( NIL != string_utilities.non_empty_string_p( gloss ) || NIL != string_utilities.non_empty_string_p( generation ) ) )
      {
        SubLObject stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( stream, thread );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_form$.getGlobalValue(), ConsesLow.list( $ql_index_sc_id$.getGlobalValue(), id_string ), NIL, UNPROVIDED, UNPROVIDED );
            if( NIL != subl_promotions.positive_integer_p( kb ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_kb$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( format_nil.format_nil_a( kb ) ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_kb$.getGlobalValue() );
            }
            if( NIL != cycl )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_cycl$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( format_nil.format_nil_a( cycl ) ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_cycl$.getGlobalValue() );
            }
            if( NIL != string_utilities.non_empty_string_p( gloss ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_gloss$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( gloss ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_gloss$.getGlobalValue() );
            }
            if( NIL != string_utilities.non_empty_string_p( generation ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_generation$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( generation ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_generation$.getGlobalValue() );
            }
            if( NIL != string_utilities.non_empty_string_p( process ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_process$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( process ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_process$.getGlobalValue() );
            }
            if( NIL != string_utilities.non_empty_string_p( cyc_host ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_host$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( cyc_host ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_host$.getGlobalValue() );
            }
            if( NIL != string_utilities.non_empty_string_p( user ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_user$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( user ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_user$.getGlobalValue() );
            }
            if( NIL != string_utilities.non_empty_string_p( time ) )
            {
              xml_utilities.xml_start_tag_internal( $ql_index_sc_time$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
              xml_utilities.xml_cdata( replace_problematic_chars( time ) );
              xml_utilities.xml_end_tag_internal( $ql_index_sc_time$.getGlobalValue() );
            }
            xml_utilities.xml_end_tag_internal( $ql_index_sc_form$.getGlobalValue() );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
          xml_form_doc = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
      }
    }
    return xml_form_doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 32496L)
  public static SubLObject ql_index_build_from_file(final SubLObject kb, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ql_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ql_index_port$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = $ql_index_sc_not_built$.getGlobalValue();
    if( NIL != subl_promotions.positive_integer_p( kb ) && NIL != string_utilities.non_empty_string_p( host ) && NIL != subl_promotions.positive_integer_p( port ) )
    {
      if( NIL != ql_index_server_aliveP( host, port, UNPROVIDED ) )
      {
        SubLObject xml_msg = NIL;
        SubLObject stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( stream, thread );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_query$.getGlobalValue(), ConsesLow.list( $ql_index_sc_type$.getGlobalValue(), $ql_index_sc_build$.getGlobalValue() ), NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_kb$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( format_nil.format_nil_a( kb ) ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_kb$.getGlobalValue() );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_query$.getGlobalValue() );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
          xml_msg = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
        final SubLObject tmp = lucene_index_query( xml_msg, host, port );
        if( tmp.equal( $ql_index_sc_built$.getGlobalValue() ) )
        {
          result = tmp;
        }
      }
      else
      {
        Errors.warn( $str96$QL_Index_Server_not_listening_at_, port, host );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 33761L)
  public static SubLObject ql_index_find_queries(final SubLObject kb, final SubLObject search_string, SubLObject host, SubLObject port)
  {
    if( host == UNPROVIDED )
    {
      host = $ql_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ql_index_port$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != subl_promotions.positive_integer_p( kb ) && NIL != string_utilities.non_empty_string_p( search_string ) && NIL != string_utilities.non_empty_string_p( host ) && NIL != subl_promotions.positive_integer_p(
        port ) )
    {
      if( NIL != ql_index_server_aliveP( host, port, UNPROVIDED ) )
      {
        final SubLObject cyc_host = Environment.get_machine_name( UNPROVIDED );
        final SubLObject user = format_nil.format_nil_a( operation_communication.the_cyclist() );
        final SubLObject process = format_nil.format_nil_a( Threads.current_process() );
        final SubLObject time = numeric_date_utilities.safe_timestring( Time.get_universal_time() );
        SubLObject xml_msg = NIL;
        SubLObject stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( stream, thread );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_query$.getGlobalValue(), ConsesLow.list( $ql_index_sc_type$.getGlobalValue(), $ql_index_sc_find$.getGlobalValue() ), NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_kb$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( format_nil.format_nil_a( kb ) ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_kb$.getGlobalValue() );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_search_string$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( search_string ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_search_string$.getGlobalValue() );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_host$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( cyc_host ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_host$.getGlobalValue() );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_user$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( user ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_user$.getGlobalValue() );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_process$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( process ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_process$.getGlobalValue() );
            xml_utilities.xml_start_tag_internal( $ql_index_sc_time$.getGlobalValue(), NIL, NIL, UNPROVIDED, UNPROVIDED );
            xml_utilities.xml_cdata( replace_problematic_chars( time ) );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_time$.getGlobalValue() );
            xml_utilities.xml_end_tag_internal( $ql_index_sc_query$.getGlobalValue() );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
          xml_msg = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
        final SubLObject tmp = reader.read_from_string( lucene_index_query( xml_msg, host, port ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != list_utilities.non_empty_list_p( tmp ) )
        {
          result = tmp;
        }
      }
      else
      {
        Errors.warn( $str96$QL_Index_Server_not_listening_at_, port, host );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 36226L)
  public static SubLObject ql_index_server_shutdown(SubLObject host, SubLObject port, SubLObject verbose)
  {
    if( host == UNPROVIDED )
    {
      host = $ql_index_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = $ql_index_port$.getDynamicValue();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    SubLObject result = $kw106$FAILED_TO_CONNECT;
    if( NIL != string_utilities.non_empty_string_p( host ) && NIL != subl_promotions.positive_integer_p( port ) && NIL != obsolete.booleanP( verbose ) && NIL != ql_index_server_aliveP( host, port, UNPROVIDED ) )
    {
      result = $kw107$FAILED_TO_SHUTDOWN;
      final SubLObject query_xml = lucene_index_query_xml( $ql_index_sc_quit$.getGlobalValue(), $str45$ );
      lucene_index_query( query_xml, host, port );
      SubLObject count = ZERO_INTEGER;
      while ( count.numL( FIVE_INTEGER ) && NIL != ql_index_server_aliveP( host, port, UNPROVIDED ))
      {
        count = Numbers.add( count, ONE_INTEGER );
        Threads.sleep( ONE_INTEGER );
      }
      if( NIL == ql_index_server_aliveP( host, port, UNPROVIDED ) )
      {
        result = $kw108$SHUTDOWN;
      }
      if( NIL != verbose && result == $kw108$SHUTDOWN )
      {
        PrintLow.format( T, $str109$Successfully_shutdown_QL_Index_Se, port, host );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 37348L)
  public static SubLObject replace_problematic_chars(final SubLObject string)
  {
    return string_utilities.strip_chars_meeting_test( string, Symbols.symbol_function( $sym110$CONTROL_CHAR_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 37700L)
  public static SubLObject lucene_symbolic_query_to_string(final SubLObject symbolic_query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $lucene_query_string_stack$.currentBinding( thread );
    try
    {
      $lucene_query_string_stack$.bind( NIL, thread );
      interpret_one_symbolic_query_element( symbolic_query );
      result = string_utilities.reduce_whitespace( Functions.apply( Symbols.symbol_function( $sym53$CCONCATENATE ), Sequences.nreverse( $lucene_query_string_stack$.getDynamicValue( thread ) ) ) );
    }
    finally
    {
      $lucene_query_string_stack$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 38733L)
  public static SubLObject interpret_one_symbolic_query_element(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_object.isString() )
    {
      $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( v_object, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
    }
    else if( NIL != forts.fort_p( v_object ) )
    {
      interpret_one_symbolic_query_element( ConsesLow.list( $kw111$KEYWORD, kb_utilities.hl_external_id_string( v_object ), $str112$true ) );
    }
    else if( v_object.isCons() && v_object.first().isKeyword() )
    {
      final SubLObject operator = v_object.first();
      final SubLObject operands = v_object.rest();
      final SubLObject pcase_var = operator;
      if( pcase_var.eql( $kw113$BAG ) )
      {
        SubLObject list_var = NIL;
        SubLObject operand = NIL;
        SubLObject counter = NIL;
        list_var = operands;
        operand = list_var.first();
        for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), operand = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
        {
          if( !counter.isZero() )
          {
            $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str52$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
          }
          interpret_one_symbolic_query_element( operand );
        }
      }
      else if( pcase_var.eql( $kw114$AND ) )
      {
        SubLObject list_var = NIL;
        SubLObject operand = NIL;
        SubLObject counter = NIL;
        list_var = operands;
        operand = list_var.first();
        for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), operand = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
        {
          if( !counter.isZero() )
          {
            $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str115$_AND_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
          }
          interpret_one_symbolic_query_element( operand );
        }
      }
      else if( pcase_var.eql( $kw116$OR ) )
      {
        SubLObject list_var = NIL;
        SubLObject operand = NIL;
        SubLObject counter = NIL;
        list_var = operands;
        operand = list_var.first();
        for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), operand = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
        {
          if( !counter.isZero() )
          {
            $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str117$_OR_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
          }
          interpret_one_symbolic_query_element( operand );
        }
      }
      else if( pcase_var.eql( $kw118$QUOTE ) )
      {
        final SubLObject operand2 = operands.first();
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str119$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        interpret_one_symbolic_query_element( operand2 );
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str119$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
      }
      else if( pcase_var.eql( $kw120$MUST ) )
      {
        final SubLObject operand2 = operands.first();
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str121$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        interpret_one_symbolic_query_element( operand2 );
      }
      else if( pcase_var.eql( $kw122$LIKE ) )
      {
        final SubLObject operand2 = operands.first();
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str123$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        interpret_one_symbolic_query_element( operand2 );
      }
      else if( pcase_var.eql( $kw111$KEYWORD ) )
      {
        final SubLObject keyword = operands.first();
        final SubLObject value = conses_high.second( operands );
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( keyword, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str124$___, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        interpret_one_symbolic_query_element( value );
      }
      else if( pcase_var.eql( $kw125$RANGE ) )
      {
        final SubLObject low = operands.first();
        final SubLObject high = conses_high.second( operands );
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str126$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        interpret_one_symbolic_query_element( low );
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str127$_TO_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
        interpret_one_symbolic_query_element( high );
        $lucene_query_string_stack$.setDynamicValue( ConsesLow.cons( $str128$_, $lucene_query_string_stack$.getDynamicValue( thread ) ), thread );
      }
      else
      {
        Errors.error( $str129$Unknown_operator__A__dont_know_ho, operator );
      }
    }
    else if( NIL != cycl_grammar.cycl_nat_p( v_object ) )
    {
      interpret_nat_symbolic_query_element( v_object );
    }
    else
    {
      interpret_one_symbolic_query_element( string_utilities.to_string( v_object ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 41290L)
  public static SubLObject interpret_nat_symbolic_query_element(final SubLObject nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $lucene_symbolic_query_translate_dates$.getDynamicValue( thread ) && NIL != date_utilities.date_p( nat ) )
    {
      final SubLObject string = date_defns.cyc_date_encode_string( $str130$YYYYMMDD, nat );
      interpret_one_symbolic_query_element( string );
    }
    else
    {
      interpret_one_symbolic_query_element( ConsesLow.list( $kw111$KEYWORD, kb_utilities.hl_external_id_string( nat ), $str112$true ) );
    }
    return nat;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 41669L)
  public static SubLObject construct_symbolic_terminus_ante_quem_query(final SubLObject cycl_date)
  {
    return ConsesLow.list( $kw111$KEYWORD, $str131$date, ConsesLow.list( $kw125$RANGE, ZERO_INTEGER, cycl_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 41811L)
  public static SubLObject construct_symbolic_terminus_post_quem_query(final SubLObject cycl_date)
  {
    return ConsesLow.list( $kw111$KEYWORD, $str131$date, ConsesLow.list( $kw125$RANGE, cycl_date, date_utilities.indexical_today() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 41969L)
  public static SubLObject lucene_symbolic_terminus_ante_quem_query(final SubLObject cycl_date)
  {
    return lucene_symbolic_query_to_string( construct_symbolic_terminus_ante_quem_query( cycl_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 42224L)
  public static SubLObject lucene_symbolic_terminus_post_quem_query(final SubLObject cycl_date)
  {
    return lucene_symbolic_query_to_string( construct_symbolic_terminus_post_quem_query( cycl_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lucene-index.lisp", position = 42481L)
  public static SubLObject ebmt_create_index_for_release(SubLObject kb_num, SubLObject classpath, SubLObject port, SubLObject mt)
  {
    if( kb_num == UNPROVIDED )
    {
      kb_num = control_vars.kb_loaded();
    }
    if( classpath == UNPROVIDED )
    {
      classpath = $str132$_home_shah_cvs_head_cycorp_cyc_ja;
    }
    if( port == UNPROVIDED )
    {
      port = $int133$8002;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const134$EBMTTrainingExamplesFromQLMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( kb_num ) : kb_num;
    assert NIL != Types.stringp( classpath ) : classpath;
    assert NIL != subl_promotions.positive_integer_p( port ) : port;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    final SubLObject program = $str137$_opt_local_pkg_j2sdk1_4_2_bin_jav;
    final SubLObject args = ConsesLow.list( $str138$_cp, classpath, $str139$com_cyc_common_nlp_EBMTTemplateIn, $str140$_i, Sequences.cconcatenate( $str141$_cyc_top_data_ebmt_release_, new SubLObject[] { format_nil
        .format_nil_a_no_copy( kb_num ), $str142$_ebmt_index_
    } ), $str143$_p, format_nil.format_nil_a( port ) );
    final SubLObject index_content = Sequences.cconcatenate( $str141$_cyc_top_data_ebmt_release_, new SubLObject[] { format_nil.format_nil_a_no_copy( kb_num ), $str144$_ebmt_index_txt
    } );
    final SubLObject index_log = Sequences.cconcatenate( $str141$_cyc_top_data_ebmt_release_, new SubLObject[] { format_nil.format_nil_a_no_copy( kb_num ), $str145$_ebmt_index_log
    } );
    final SubLObject os_process = os_process_utilities.make_os_process( $str146$EBMT_Template_Index_Server, program, args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject num_templates = NIL;
    final SubLObject _prev_bind_0 = $ebmt_index_host$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $ebmt_index_port$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $ebmt_index_content$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $ebmt_index_log$.currentBinding( thread );
    try
    {
      $ebmt_index_host$.bind( $str147$localhost, thread );
      $ebmt_index_port$.bind( port, thread );
      $ebmt_index_content$.bind( index_content, thread );
      $ebmt_index_log$.bind( index_log, thread );
      num_templates = ebmt_template_parser.ebmt_populate_index_from_mt( mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $ebmt_index_log$.rebind( _prev_bind_4, thread );
      $ebmt_index_content$.rebind( _prev_bind_3, thread );
      $ebmt_index_port$.rebind( _prev_bind_2, thread );
      $ebmt_index_host$.rebind( _prev_bind_0, thread );
    }
    if( num_templates.numE( ZERO_INTEGER ) )
    {
      Errors.warn( $str148$No_templates_added_to_EBMT_Templa );
    }
    os_process_utilities.kill_os_process( os_process );
    return num_templates;
  }

  public static SubLObject declare_lucene_index_file()
  {
    SubLFiles.declareFunction( me, "lucene_index_query_xml", "LUCENE-INDEX-QUERY-XML", 2, 0, false );
    SubLFiles.declareMacro( me, "with_ws_index_server", "WITH-WS-INDEX-SERVER" );
    SubLFiles.declareFunction( me, "get_ql_index_host", "GET-QL-INDEX-HOST", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_host", "SET-QL-INDEX-HOST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_port", "GET-QL-INDEX-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_port", "SET-QL-INDEX-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_root_dir_names", "GET-QL-INDEX-ROOT-DIR-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_root_dir_names", "SET-QL-INDEX-ROOT-DIR-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_log", "GET-QL-INDEX-LOG", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_log", "SET-QL-INDEX-LOG", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_index_query", "LUCENE-INDEX-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_index_server_version", "LUCENE-INDEX-SERVER-VERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "lucene_index_server_aliveP", "LUCENE-INDEX-SERVER-ALIVE?", 3, 0, false );
    SubLFiles.declareFunction( me, "lucene_index_add_indices", "LUCENE-INDEX-ADD-INDICES", 3, 0, false );
    SubLFiles.declareFunction( me, "ws_build_search_string", "WS-BUILD-SEARCH-STRING", 3, 1, false );
    SubLFiles.declareFunction( me, "get_ws_index_host", "GET-WS-INDEX-HOST", 0, 0, false );
    SubLFiles.declareFunction( me, "get_ws_index_port", "GET-WS-INDEX-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "ws_index_server_aliveP", "WS-INDEX-SERVER-ALIVE?", 0, 3, false );
    SubLFiles.declareFunction( me, "ws_index_search", "WS-INDEX-SEARCH", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_search_with_snippets", "WS-INDEX-SEARCH-WITH-SNIPPETS", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_search_with_titles_and_snippets", "WS-INDEX-SEARCH-WITH-TITLES-AND-SNIPPETS", 3, 2, false );
    SubLFiles.declareFunction( me, "ws_index_url_content", "WS-INDEX-URL-CONTENT", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_url_text", "WS-INDEX-URL-TEXT", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_url_title", "WS-INDEX-URL-TITLE", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_pathname_for_url", "WS-INDEX-PATHNAME-FOR-URL", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_search_for_pathnames", "WS-INDEX-SEARCH-FOR-PATHNAMES", 1, 2, false );
    SubLFiles.declareFunction( me, "ws_index_shutdown", "WS-INDEX-SHUTDOWN", 0, 3, false );
    SubLFiles.declareFunction( me, "ws_index_count", "WS-INDEX-COUNT", 1, 2, false );
    SubLFiles.declareFunction( me, "url_index_server_aliveP", "URL-INDEX-SERVER-ALIVE?", 0, 3, false );
    SubLFiles.declareFunction( me, "url_index_search", "URL-INDEX-SEARCH", 1, 2, false );
    SubLFiles.declareFunction( me, "url_index_shutdown", "URL-INDEX-SHUTDOWN", 0, 3, false );
    SubLFiles.declareFunction( me, "ebmt_index_server_aliveP", "EBMT-INDEX-SERVER-ALIVE?", 0, 3, false );
    SubLFiles.declareFunction( me, "ebmt_index_add_template", "EBMT-INDEX-ADD-TEMPLATE", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_template_from_raw_template", "EBMT-TEMPLATE-FROM-RAW-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_index_find_templates", "EBMT-INDEX-FIND-TEMPLATES", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_index_delete_template", "EBMT-INDEX-DELETE-TEMPLATE", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_index_add_indices", "EBMT-INDEX-ADD-INDICES", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_index_shutdown", "EBMT-INDEX-SHUTDOWN", 0, 3, false );
    SubLFiles.declareFunction( me, "ql_index_server_aliveP", "QL-INDEX-SERVER-ALIVE?", 0, 3, false );
    SubLFiles.declareFunction( me, "ql_index_add_queries", "QL-INDEX-ADD-QUERIES", 1, 2, false );
    SubLFiles.declareFunction( me, "ql_index_add_query", "QL-INDEX-ADD-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "ql_index_add_query_xml", "QL-INDEX-ADD-QUERY-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_index_build_from_file", "QL-INDEX-BUILD-FROM-FILE", 1, 2, false );
    SubLFiles.declareFunction( me, "ql_index_find_queries", "QL-INDEX-FIND-QUERIES", 2, 2, false );
    SubLFiles.declareFunction( me, "ql_index_server_shutdown", "QL-INDEX-SERVER-SHUTDOWN", 0, 3, false );
    SubLFiles.declareFunction( me, "replace_problematic_chars", "REPLACE-PROBLEMATIC-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_symbolic_query_to_string", "LUCENE-SYMBOLIC-QUERY-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_one_symbolic_query_element", "INTERPRET-ONE-SYMBOLIC-QUERY-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_nat_symbolic_query_element", "INTERPRET-NAT-SYMBOLIC-QUERY-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_symbolic_terminus_ante_quem_query", "CONSTRUCT-SYMBOLIC-TERMINUS-ANTE-QUEM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_symbolic_terminus_post_quem_query", "CONSTRUCT-SYMBOLIC-TERMINUS-POST-QUEM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_symbolic_terminus_ante_quem_query", "LUCENE-SYMBOLIC-TERMINUS-ANTE-QUEM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_symbolic_terminus_post_quem_query", "LUCENE-SYMBOLIC-TERMINUS-POST-QUEM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_create_index_for_release", "EBMT-CREATE-INDEX-FOR-RELEASE", 0, 4, false );
    return NIL;
  }

  public static SubLObject init_lucene_index_file()
  {
    $ws_index_host$ = SubLFiles.defparameter( "*WS-INDEX-HOST*", red_infrastructure_macros.red_def_helper( $list2.isSymbol() ? Symbols.symbol_value( $list2 ) : $list2, $sym3$_WS_INDEX_HOST_, $str4$webstore_cyc_com
        .isSymbol() ? Symbols.symbol_value( $str4$webstore_cyc_com ) : $str4$webstore_cyc_com, $kw5$PARAMETER, UNPROVIDED ) );
    $ws_index_port$ = SubLFiles.defparameter( "*WS-INDEX-PORT*", red_infrastructure_macros.red_def_helper( $list6.isSymbol() ? Symbols.symbol_value( $list6 ) : $list6, $sym7$_WS_INDEX_PORT_, $int8$7777.isSymbol()
        ? Symbols.symbol_value( $int8$7777 )
        : $int8$7777, $kw5$PARAMETER, UNPROVIDED ) );
    $url_index_host$ = SubLFiles.defparameter( "*URL-INDEX-HOST*", red_infrastructure_macros.red_def_helper( $list11.isSymbol() ? Symbols.symbol_value( $list11 ) : $list11, $sym12$_URL_INDEX_HOST_,
        $str13$urlindex_cyc_com.isSymbol() ? Symbols.symbol_value( $str13$urlindex_cyc_com ) : $str13$urlindex_cyc_com, $kw5$PARAMETER, UNPROVIDED ) );
    $url_index_port$ = SubLFiles.defparameter( "*URL-INDEX-PORT*", red_infrastructure_macros.red_def_helper( $list14.isSymbol() ? Symbols.symbol_value( $list14 ) : $list14, $sym15$_URL_INDEX_PORT_, $int16$7778.isSymbol()
        ? Symbols.symbol_value( $int16$7778 )
        : $int16$7778, $kw5$PARAMETER, UNPROVIDED ) );
    $ebmt_index_host$ = SubLFiles.defparameter( "*EBMT-INDEX-HOST*", red_infrastructure_macros.red_def_helper( $list17.isSymbol() ? Symbols.symbol_value( $list17 ) : $list17, $sym18$_EBMT_INDEX_HOST_,
        $str19$ebmtindex_cyc_com.isSymbol() ? Symbols.symbol_value( $str19$ebmtindex_cyc_com ) : $str19$ebmtindex_cyc_com, $kw5$PARAMETER, UNPROVIDED ) );
    $ebmt_index_port$ = SubLFiles.defparameter( "*EBMT-INDEX-PORT*", red_infrastructure_macros.red_def_helper( $list20.isSymbol() ? Symbols.symbol_value( $list20 ) : $list20, $sym21$_EBMT_INDEX_PORT_, $int22$7779
        .isSymbol() ? Symbols.symbol_value( $int22$7779 ) : $int22$7779, $kw5$PARAMETER, UNPROVIDED ) );
    $ebmt_index_content$ = SubLFiles.defparameter( "*EBMT-INDEX-CONTENT*", red_infrastructure_macros.red_def_helper( $list23.isSymbol() ? Symbols.symbol_value( $list23 ) : $list23, $sym24$_EBMT_INDEX_CONTENT_,
        $str25$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? Symbols.symbol_value( $str25$_cyc_departments_nl_corpora_ebmt_ ) : $str25$_cyc_departments_nl_corpora_ebmt_, $kw5$PARAMETER, UNPROVIDED ) );
    $ebmt_index_log$ = SubLFiles.defparameter( "*EBMT-INDEX-LOG*", red_infrastructure_macros.red_def_helper( $list26.isSymbol() ? Symbols.symbol_value( $list26 ) : $list26, $sym27$_EBMT_INDEX_LOG_,
        $str28$_cyc_departments_nl_corpora_ebmt_.isSymbol() ? Symbols.symbol_value( $str28$_cyc_departments_nl_corpora_ebmt_ ) : $str28$_cyc_departments_nl_corpora_ebmt_, $kw5$PARAMETER, UNPROVIDED ) );
    $ql_index_host$ = SubLFiles.defparameter( "*QL-INDEX-HOST*", red_infrastructure_macros.red_def_helper( $list29.isSymbol() ? Symbols.symbol_value( $list29 ) : $list29, $sym30$_QL_INDEX_HOST_, $str31$elmore_cyc_com
        .isSymbol() ? Symbols.symbol_value( $str31$elmore_cyc_com ) : $str31$elmore_cyc_com, $kw5$PARAMETER, UNPROVIDED ) );
    $ql_index_port$ = SubLFiles.defparameter( "*QL-INDEX-PORT*", red_infrastructure_macros.red_def_helper( $list32.isSymbol() ? Symbols.symbol_value( $list32 ) : $list32, $sym33$_QL_INDEX_PORT_, $int34$7781.isSymbol()
        ? Symbols.symbol_value( $int34$7781 )
        : $int34$7781, $kw5$PARAMETER, UNPROVIDED ) );
    $ql_index_root_dir_names$ = SubLFiles.defparameter( "*QL-INDEX-ROOT-DIR-NAMES*", red_infrastructure_macros.red_def_helper( $list35.isSymbol() ? Symbols.symbol_value( $list35 ) : $list35,
        $sym36$_QL_INDEX_ROOT_DIR_NAMES_, $str37$data_ir_indexes_ql.isSymbol() ? Symbols.symbol_value( $str37$data_ir_indexes_ql ) : $str37$data_ir_indexes_ql, $kw5$PARAMETER, UNPROVIDED ) );
    $ql_index_log$ = SubLFiles.defparameter( "*QL-INDEX-LOG*", red_infrastructure_macros.red_def_helper( $list38.isSymbol() ? Symbols.symbol_value( $list38 ) : $list38, $sym39$_QL_INDEX_LOG_,
        $str40$data_ir_indexes_ql_ql_index_log.isSymbol() ? Symbols.symbol_value( $str40$data_ir_indexes_ql_ql_index_log ) : $str40$data_ir_indexes_ql_ql_index_log, $kw5$PARAMETER, UNPROVIDED ) );
    $ql_index_sc_added$ = SubLFiles.defconstant( "*QL-INDEX-SC-ADDED*", $str75$Added );
    $ql_index_sc_not_added$ = SubLFiles.defconstant( "*QL-INDEX-SC-NOT-ADDED*", $str76$NotAdded );
    $ql_index_sc_built$ = SubLFiles.defconstant( "*QL-INDEX-SC-BUILT*", $str77$Built );
    $ql_index_sc_not_built$ = SubLFiles.defconstant( "*QL-INDEX-SC-NOT-BUILT*", $str78$NotBuilt );
    $ql_index_sc_query$ = SubLFiles.defconstant( "*QL-INDEX-SC-QUERY*", $str0$query );
    $ql_index_sc_form$ = SubLFiles.defconstant( "*QL-INDEX-SC-FORM*", $str79$form );
    $ql_index_sc_cycl$ = SubLFiles.defconstant( "*QL-INDEX-SC-CYCL*", $str80$cycl );
    $ql_index_sc_kb$ = SubLFiles.defconstant( "*QL-INDEX-SC-KB*", $str81$kb );
    $ql_index_sc_process$ = SubLFiles.defconstant( "*QL-INDEX-SC-PROCESS*", $str82$process );
    $ql_index_sc_host$ = SubLFiles.defconstant( "*QL-INDEX-SC-HOST*", $str83$host );
    $ql_index_sc_user$ = SubLFiles.defconstant( "*QL-INDEX-SC-USER*", $str84$user );
    $ql_index_sc_time$ = SubLFiles.defconstant( "*QL-INDEX-SC-TIME*", $str85$time );
    $ql_index_sc_type$ = SubLFiles.defconstant( "*QL-INDEX-SC-TYPE*", $str1$type );
    $ql_index_sc_id$ = SubLFiles.defconstant( "*QL-INDEX-SC-ID*", $str86$id );
    $ql_index_sc_gloss$ = SubLFiles.defconstant( "*QL-INDEX-SC-GLOSS*", $str87$gloss );
    $ql_index_sc_generation$ = SubLFiles.defconstant( "*QL-INDEX-SC-GENERATION*", $str88$generation );
    $ql_index_sc_build$ = SubLFiles.defconstant( "*QL-INDEX-SC-BUILD*", $str89$build );
    $ql_index_sc_add$ = SubLFiles.defconstant( "*QL-INDEX-SC-ADD*", $str69$add );
    $ql_index_sc_add_n$ = SubLFiles.defconstant( "*QL-INDEX-SC-ADD-N*", $str90$add_n );
    $ql_index_sc_find$ = SubLFiles.defconstant( "*QL-INDEX-SC-FIND*", $str71$find );
    $ql_index_sc_quit$ = SubLFiles.defconstant( "*QL-INDEX-SC-QUIT*", $str63$_quit_ );
    $ql_index_sc_search_string$ = SubLFiles.defconstant( "*QL-INDEX-SC-SEARCH-STRING*", $str91$search_string );
    $ql_index_sc_query_index_forms$ = SubLFiles.defconstant( "*QL-INDEX-SC-QUERY-INDEX-FORMS*", $str92$query_index_forms );
    $lucene_query_string_stack$ = SubLFiles.defparameter( "*LUCENE-QUERY-STRING-STACK*", NIL );
    $lucene_symbolic_query_translate_dates$ = SubLFiles.defparameter( "*LUCENE-SYMBOLIC-QUERY-TRANSLATE-DATES*", T );
    return NIL;
  }

  public static SubLObject setup_lucene_index_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lucene_index_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lucene_index_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lucene_index_file();
  }
  static
  {
    me = new lucene_index();
    $ws_index_host$ = null;
    $ws_index_port$ = null;
    $url_index_host$ = null;
    $url_index_port$ = null;
    $ebmt_index_host$ = null;
    $ebmt_index_port$ = null;
    $ebmt_index_content$ = null;
    $ebmt_index_log$ = null;
    $ql_index_host$ = null;
    $ql_index_port$ = null;
    $ql_index_root_dir_names$ = null;
    $ql_index_log$ = null;
    $ql_index_sc_added$ = null;
    $ql_index_sc_not_added$ = null;
    $ql_index_sc_built$ = null;
    $ql_index_sc_not_built$ = null;
    $ql_index_sc_query$ = null;
    $ql_index_sc_form$ = null;
    $ql_index_sc_cycl$ = null;
    $ql_index_sc_kb$ = null;
    $ql_index_sc_process$ = null;
    $ql_index_sc_host$ = null;
    $ql_index_sc_user$ = null;
    $ql_index_sc_time$ = null;
    $ql_index_sc_type$ = null;
    $ql_index_sc_id$ = null;
    $ql_index_sc_gloss$ = null;
    $ql_index_sc_generation$ = null;
    $ql_index_sc_build$ = null;
    $ql_index_sc_add$ = null;
    $ql_index_sc_add_n$ = null;
    $ql_index_sc_find$ = null;
    $ql_index_sc_quit$ = null;
    $ql_index_sc_search_string$ = null;
    $ql_index_sc_query_index_forms$ = null;
    $lucene_query_string_stack$ = null;
    $lucene_symbolic_query_translate_dates$ = null;
    $str0$query = makeString( "query" );
    $str1$type = makeString( "type" );
    $list2 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ws.host" ) );
    $sym3$_WS_INDEX_HOST_ = makeSymbol( "*WS-INDEX-HOST*" );
    $str4$webstore_cyc_com = makeString( "webstore.cyc.com" );
    $kw5$PARAMETER = makeKeyword( "PARAMETER" );
    $list6 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ws.port" ) );
    $sym7$_WS_INDEX_PORT_ = makeSymbol( "*WS-INDEX-PORT*" );
    $int8$7777 = makeInteger( 7777 );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "HOST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PORT" ), makeSymbol( "*WS-INDEX-PORT*" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym10$CLET = makeSymbol( "CLET" );
    $list11 = ConsesLow.list( makeString( "application.cyc-ir.lucene.url.host" ) );
    $sym12$_URL_INDEX_HOST_ = makeSymbol( "*URL-INDEX-HOST*" );
    $str13$urlindex_cyc_com = makeString( "urlindex.cyc.com" );
    $list14 = ConsesLow.list( makeString( "application.cyc-ir.lucene.url.port" ) );
    $sym15$_URL_INDEX_PORT_ = makeSymbol( "*URL-INDEX-PORT*" );
    $int16$7778 = makeInteger( 7778 );
    $list17 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ebmt.host" ) );
    $sym18$_EBMT_INDEX_HOST_ = makeSymbol( "*EBMT-INDEX-HOST*" );
    $str19$ebmtindex_cyc_com = makeString( "ebmtindex.cyc.com" );
    $list20 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ebmt.port" ) );
    $sym21$_EBMT_INDEX_PORT_ = makeSymbol( "*EBMT-INDEX-PORT*" );
    $int22$7779 = makeInteger( 7779 );
    $list23 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ebmt.content" ) );
    $sym24$_EBMT_INDEX_CONTENT_ = makeSymbol( "*EBMT-INDEX-CONTENT*" );
    $str25$_cyc_departments_nl_corpora_ebmt_ = makeString( "/cyc/departments/nl/corpora/ebmt-index.txt" );
    $list26 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ebmt.log" ) );
    $sym27$_EBMT_INDEX_LOG_ = makeSymbol( "*EBMT-INDEX-LOG*" );
    $str28$_cyc_departments_nl_corpora_ebmt_ = makeString( "/cyc/departments/nl/corpora/ebmt-index.log" );
    $list29 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.host" ) );
    $sym30$_QL_INDEX_HOST_ = makeSymbol( "*QL-INDEX-HOST*" );
    $str31$elmore_cyc_com = makeString( "elmore.cyc.com" );
    $list32 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.port" ) );
    $sym33$_QL_INDEX_PORT_ = makeSymbol( "*QL-INDEX-PORT*" );
    $int34$7781 = makeInteger( 7781 );
    $list35 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.root-dir-names" ) );
    $sym36$_QL_INDEX_ROOT_DIR_NAMES_ = makeSymbol( "*QL-INDEX-ROOT-DIR-NAMES*" );
    $str37$data_ir_indexes_ql = makeString( "data|ir|indexes|ql" );
    $list38 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.log" ) );
    $sym39$_QL_INDEX_LOG_ = makeSymbol( "*QL-INDEX-LOG*" );
    $str40$data_ir_indexes_ql_ql_index_log = makeString( "data/ir/indexes/ql/ql-index.log" );
    $sym41$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw42$PUBLIC = makeKeyword( "PUBLIC" );
    $str43$___lucene_index_query__s__s__s___ = makeString( "~%(lucene-index-query ~s ~s ~s) : ~s" );
    $str44$version = makeString( "version" );
    $str45$ = makeString( "" );
    $str46$Lucene_Index_Server_listening_at_ = makeString( "Lucene Index Server listening at port ~A on ~A~%" );
    $str47$Lucene_Index_Server_NOT_listening = makeString( "Lucene Index Server NOT listening at port ~A on ~A~%" );
    $str48$AddIndices = makeString( "AddIndices" );
    $str49$__ = makeString( " +" );
    $str50$__ = makeString( " -" );
    $str51$__ = makeString( " ~" );
    $str52$_ = makeString( " " );
    $sym53$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str54$StringURLs = makeString( "StringURLs" );
    $str55$Web_store_Index_Server_not_listen = makeString( "Web-store Index Server not listening at port ~A on ~A" );
    $str56$StringURLsAndSnippets = makeString( "StringURLsAndSnippets" );
    $str57$StringURLsTitlesAndSnippets__A__A = makeString( "StringURLsTitlesAndSnippets-~A-~A" );
    $str58$URLContent = makeString( "URLContent" );
    $str59$URLText = makeString( "URLText" );
    $str60$URLTitle = makeString( "URLTitle" );
    $str61$URLFile = makeString( "URLFile" );
    $str62$StringFiles = makeString( "StringFiles" );
    $str63$_quit_ = makeString( "$quit$" );
    $str64$Successfully_shutdown_Web_store_I = makeString( "Successfully shutdown Web-store Index Server at port ~A on ~A~%" );
    $str65$CountContents = makeString( "CountContents" );
    $str66$URLIndex = makeString( "URLIndex" );
    $str67$URL_Index_Server_not_listening_at = makeString( "URL Index Server not listening at port ~A on ~A" );
    $str68$Successfully_shutdown_URL_Index_S = makeString( "Successfully shutdown URL Index Server at port ~A on ~A~%" );
    $str69$add = makeString( "add" );
    $str70$EBMT_Template_Index_Server_not_li = makeString( "EBMT Template Index Server not listening at port ~A on ~A" );
    $str71$find = makeString( "find" );
    $sym72$EBMT_TEMPLATE_FROM_RAW_TEMPLATE = makeSymbol( "EBMT-TEMPLATE-FROM-RAW-TEMPLATE" );
    $str73$delete = makeString( "delete" );
    $str74$Successfully_shutdown_EBMT_Templa = makeString( "Successfully shutdown EBMT Template Index Server at port ~A on ~A~%" );
    $str75$Added = makeString( "Added" );
    $str76$NotAdded = makeString( "NotAdded" );
    $str77$Built = makeString( "Built" );
    $str78$NotBuilt = makeString( "NotBuilt" );
    $str79$form = makeString( "form" );
    $str80$cycl = makeString( "cycl" );
    $str81$kb = makeString( "kb" );
    $str82$process = makeString( "process" );
    $str83$host = makeString( "host" );
    $str84$user = makeString( "user" );
    $str85$time = makeString( "time" );
    $str86$id = makeString( "id" );
    $str87$gloss = makeString( "gloss" );
    $str88$generation = makeString( "generation" );
    $str89$build = makeString( "build" );
    $str90$add_n = makeString( "add-n" );
    $str91$search_string = makeString( "search_string" );
    $str92$query_index_forms = makeString( "query_index_forms" );
    $sym93$NON_EMPTY_STRING_P = makeSymbol( "NON-EMPTY-STRING-P" );
    $sym94$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym95$BOOLEAN_ = makeSymbol( "BOOLEAN?" );
    $str96$QL_Index_Server_not_listening_at_ = makeString( "QL Index Server not listening at port ~A on ~A" );
    $kw97$ID = makeKeyword( "ID" );
    $kw98$CYCL = makeKeyword( "CYCL" );
    $kw99$GENERATION = makeKeyword( "GENERATION" );
    $kw100$GLOSS = makeKeyword( "GLOSS" );
    $kw101$KB = makeKeyword( "KB" );
    $kw102$PROCESS = makeKeyword( "PROCESS" );
    $kw103$HOST = makeKeyword( "HOST" );
    $kw104$USER = makeKeyword( "USER" );
    $kw105$TIME = makeKeyword( "TIME" );
    $kw106$FAILED_TO_CONNECT = makeKeyword( "FAILED-TO-CONNECT" );
    $kw107$FAILED_TO_SHUTDOWN = makeKeyword( "FAILED-TO-SHUTDOWN" );
    $kw108$SHUTDOWN = makeKeyword( "SHUTDOWN" );
    $str109$Successfully_shutdown_QL_Index_Se = makeString( "Successfully shutdown QL Index Server at port ~A on ~A~%" );
    $sym110$CONTROL_CHAR_P = makeSymbol( "CONTROL-CHAR-P" );
    $kw111$KEYWORD = makeKeyword( "KEYWORD" );
    $str112$true = makeString( "true" );
    $kw113$BAG = makeKeyword( "BAG" );
    $kw114$AND = makeKeyword( "AND" );
    $str115$_AND_ = makeString( " AND " );
    $kw116$OR = makeKeyword( "OR" );
    $str117$_OR_ = makeString( " OR " );
    $kw118$QUOTE = makeKeyword( "QUOTE" );
    $str119$_ = makeString( "\"" );
    $kw120$MUST = makeKeyword( "MUST" );
    $str121$_ = makeString( "+" );
    $kw122$LIKE = makeKeyword( "LIKE" );
    $str123$_ = makeString( "~" );
    $str124$___ = makeString( " : " );
    $kw125$RANGE = makeKeyword( "RANGE" );
    $str126$_ = makeString( "[" );
    $str127$_TO_ = makeString( " TO " );
    $str128$_ = makeString( "]" );
    $str129$Unknown_operator__A__dont_know_ho = makeString( "Unknown operator ~A: dont know how to interpret.~%" );
    $str130$YYYYMMDD = makeString( "YYYYMMDD" );
    $str131$date = makeString( "date" );
    $str132$_home_shah_cvs_head_cycorp_cyc_ja = makeString( "/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar" );
    $int133$8002 = makeInteger( 8002 );
    $const134$EBMTTrainingExamplesFromQLMt = constant_handles.reader_make_constant_shell( makeString( "EBMTTrainingExamplesFromQLMt" ) );
    $sym135$STRINGP = makeSymbol( "STRINGP" );
    $sym136$HLMT_P = makeSymbol( "HLMT-P" );
    $str137$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString( "/opt/local/pkg/j2sdk1.4.2/bin/java" );
    $str138$_cp = makeString( "-cp" );
    $str139$com_cyc_common_nlp_EBMTTemplateIn = makeString( "com.cyc.common.nlp.EBMTTemplateIndexServer" );
    $str140$_i = makeString( "-i" );
    $str141$_cyc_top_data_ebmt_release_ = makeString( "/cyc/top/data/ebmt/release/" );
    $str142$_ebmt_index_ = makeString( "/ebmt-index/" );
    $str143$_p = makeString( "-p" );
    $str144$_ebmt_index_txt = makeString( "/ebmt-index.txt" );
    $str145$_ebmt_index_log = makeString( "/ebmt-index.log" );
    $str146$EBMT_Template_Index_Server = makeString( "EBMT Template Index Server" );
    $str147$localhost = makeString( "localhost" );
    $str148$No_templates_added_to_EBMT_Templa = makeString( "No templates added to EBMT Template Index for external release." );
  }
}
/*
 * 
 * Total time: 566 ms
 * 
 */