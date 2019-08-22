package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class zookeeper
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.zookeeper";
  public static final String myFingerPrint = "56ef334dd5fdb72ff061a0ae757c68ffebc9e46418c8090be58bbcd4d1bc1de9";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 841L)
  public static SubLSymbol $zookeeper_rest_servers$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1039L)
  public static SubLSymbol $zookeeper_rest_port$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1147L)
  public static SubLSymbol $zookeeper_rest_timeout$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLSymbol $dtp_zk_child_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLSymbol $dtp_zk_node_state$;
  private static final SubLString $str0$localhost;
  private static final SubLInteger $int1$9998;
  private static final SubLInteger $int2$60;
  private static final SubLSymbol $sym3$ZK_GET_NODE_CHILDREN;
  private static final SubLString $str4$view_children;
  private static final SubLSymbol $kw5$GET;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$ZK_CHILD_STATE;
  private static final SubLSymbol $sym8$ZK_CHILD_STATE_P;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym14$ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$ZKKIDS_PATH;
  private static final SubLSymbol $sym17$_CSETF_ZKKIDS_PATH;
  private static final SubLSymbol $sym18$ZKKIDS_URI;
  private static final SubLSymbol $sym19$_CSETF_ZKKIDS_URI;
  private static final SubLSymbol $sym20$ZKKIDS_CHILD_URI_TEMPLATE;
  private static final SubLSymbol $sym21$_CSETF_ZKKIDS_CHILD_URI_TEMPLATE;
  private static final SubLSymbol $sym22$ZKKIDS_CHILDREN;
  private static final SubLSymbol $sym23$_CSETF_ZKKIDS_CHILDREN;
  private static final SubLSymbol $kw24$PATH;
  private static final SubLSymbol $kw25$URI;
  private static final SubLSymbol $kw26$CHILD_URI_TEMPLATE;
  private static final SubLSymbol $kw27$CHILDREN;
  private static final SubLString $str28$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw29$BEGIN;
  private static final SubLSymbol $sym30$MAKE_ZK_CHILD_STATE;
  private static final SubLSymbol $kw31$SLOT;
  private static final SubLSymbol $kw32$END;
  private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD;
  private static final SubLString $str34$child;
  private static final SubLString $str35$path;
  private static final SubLString $str36$uri;
  private static final SubLString $str37$child_uri_template;
  private static final SubLString $str38$children;
  private static final SubLString $str39$Unexpected_XML_tag__A___;
  private static final SubLString $str40$Unexpected_token_stream__A_;
  private static final SubLSymbol $sym41$ZK_SET_NODE_DATA;
  private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw43$DEFAULT;
  private static final SubLInteger $int44$80;
  private static final SubLSymbol $kw45$PRIVATE;
  private static final SubLSymbol $kw46$MACHINE;
  private static final SubLSymbol $kw47$PORT;
  private static final SubLSymbol $kw48$METHOD;
  private static final SubLSymbol $kw49$PUT;
  private static final SubLSymbol $kw50$URL;
  private static final SubLSymbol $kw51$QUERY;
  private static final SubLSymbol $kw52$KEEP_ALIVE_;
  private static final SubLSymbol $kw53$WIDE_NEWLINES_;
  private static final SubLSymbol $kw54$ACCEPT_TYPES;
  private static final SubLSymbol $kw55$CONTENT_TYPE;
  private static final SubLString $str56$application_octet_stream;
  private static final SubLSymbol $kw57$SOAP_ACTION_URI;
  private static final SubLSymbol $sym58$_EXIT;
  private static final SubLString $str59$n_a;
  private static final SubLString $str60$no_connection;
  private static final SubLString $str61$Could_not_create_node_on_any_serv;
  private static final SubLString $str62$HTTP_1_1_200_OK;
  private static final SubLString $str63$HTTP_1_1_404_Not_Found;
  private static final SubLString $str64$No_such_node_;
  private static final SubLString $str65$Unexpected_HTTP_header_;
  private static final SubLString $str66$_;
  private static final SubLSymbol $sym67$ZK_DELETE_NODE;
  private static final SubLSymbol $kw68$DELETE;
  private static final SubLString $str69$;
  private static final SubLString $str70$HTTP_1_1_204_No_Content;
  private static final SubLSymbol $sym71$ZK_GET_NODE_STATE;
  private static final SubLString $str72$dataformat_utf8;
  private static final SubLSymbol $sym73$ZK_NODE_STATE;
  private static final SubLSymbol $sym74$ZK_NODE_STATE_P;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$ZKSTAT_PATH;
  private static final SubLSymbol $sym82$_CSETF_ZKSTAT_PATH;
  private static final SubLSymbol $sym83$ZKSTAT_URI;
  private static final SubLSymbol $sym84$_CSETF_ZKSTAT_URI;
  private static final SubLSymbol $sym85$ZKSTAT_DATA;
  private static final SubLSymbol $sym86$_CSETF_ZKSTAT_DATA;
  private static final SubLSymbol $sym87$ZKSTAT_CZXID;
  private static final SubLSymbol $sym88$_CSETF_ZKSTAT_CZXID;
  private static final SubLSymbol $sym89$ZKSTAT_MZXID;
  private static final SubLSymbol $sym90$_CSETF_ZKSTAT_MZXID;
  private static final SubLSymbol $sym91$ZKSTAT_CTIME;
  private static final SubLSymbol $sym92$_CSETF_ZKSTAT_CTIME;
  private static final SubLSymbol $sym93$ZKSTAT_MTIME;
  private static final SubLSymbol $sym94$_CSETF_ZKSTAT_MTIME;
  private static final SubLSymbol $sym95$ZKSTAT_VERSION;
  private static final SubLSymbol $sym96$_CSETF_ZKSTAT_VERSION;
  private static final SubLSymbol $sym97$ZKSTAT_CVERSION;
  private static final SubLSymbol $sym98$_CSETF_ZKSTAT_CVERSION;
  private static final SubLSymbol $sym99$ZKSTAT_AVERSION;
  private static final SubLSymbol $sym100$_CSETF_ZKSTAT_AVERSION;
  private static final SubLSymbol $sym101$ZKSTAT_EPHEMERAL_OWNER;
  private static final SubLSymbol $sym102$_CSETF_ZKSTAT_EPHEMERAL_OWNER;
  private static final SubLSymbol $sym103$ZKSTAT_DATA_LEN;
  private static final SubLSymbol $sym104$_CSETF_ZKSTAT_DATA_LEN;
  private static final SubLSymbol $sym105$ZKSTAT_NUM_CHILDREN;
  private static final SubLSymbol $sym106$_CSETF_ZKSTAT_NUM_CHILDREN;
  private static final SubLSymbol $sym107$ZKSTAT_PZXID;
  private static final SubLSymbol $sym108$_CSETF_ZKSTAT_PZXID;
  private static final SubLSymbol $kw109$DATA;
  private static final SubLSymbol $kw110$CZXID;
  private static final SubLSymbol $kw111$MZXID;
  private static final SubLSymbol $kw112$CTIME;
  private static final SubLSymbol $kw113$MTIME;
  private static final SubLSymbol $kw114$VERSION;
  private static final SubLSymbol $kw115$CVERSION;
  private static final SubLSymbol $kw116$AVERSION;
  private static final SubLSymbol $kw117$EPHEMERAL_OWNER;
  private static final SubLSymbol $kw118$DATA_LEN;
  private static final SubLSymbol $kw119$NUM_CHILDREN;
  private static final SubLSymbol $kw120$PZXID;
  private static final SubLSymbol $sym121$MAKE_ZK_NODE_STATE;
  private static final SubLSymbol $sym122$VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD;
  private static final SubLString $str123$stat;
  private static final SubLString $str124$dataUtf8;
  private static final SubLString $str125$czxid;
  private static final SubLString $str126$mzxid;
  private static final SubLString $str127$pzxid;
  private static final SubLString $str128$ctime;
  private static final SubLString $str129$mtime;
  private static final SubLString $str130$version;
  private static final SubLString $str131$aversion;
  private static final SubLString $str132$cversion;
  private static final SubLString $str133$ephemeralOwner;
  private static final SubLString $str134$dataLength;
  private static final SubLString $str135$numChildren;
  private static final SubLString $str136$Expected_closing_tag__A_but_got__;
  private static final SubLSymbol $sym137$ZK_CREATE_PERMANENT_NODE;
  private static final SubLString $str138$_op_create_name_;
  private static final SubLSymbol $kw139$POST;
  private static final SubLString $str140$HTTP_1_1_201_Created;
  private static final SubLString $str141$HTTP_1_1_409_Conflict;
  private static final SubLString $str142$Node_already_exits_;
  private static final SubLString $str143$No_such_parent_node_;
  private static final SubLSymbol $sym144$ZK_CREATE_SESSION;
  private static final SubLString $str145$_sessions_v1__op_create_expire_;
  private static final SubLSymbol $sym146$ZK_SEND_SESSION_HEARTBEAT;
  private static final SubLString $str147$_sessions_v1_;
  private static final SubLSymbol $sym148$ZK_DELETE_SESSION;
  private static final SubLString $str149$No_such_session_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1239L)
  public static SubLObject zk_get_node_children(final SubLObject node_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject port = $zookeeper_rest_port$.getDynamicValue( thread );
    final SubLObject timeout = $zookeeper_rest_timeout$.getDynamicValue( thread );
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject xml_tokens = xml_parsing_utilities.xml_tokenized_http_request( server, node_path, $str4$view_children, $kw5$GET, port, NIL, NIL, timeout, timeout, NIL, $list6 );
      final SubLObject status = thread.secondMultipleValue();
      final SubLObject status_msg = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == status )
      {
        return Values.values( parse_zk_children( xml_tokens ), NIL );
      }
      problems = ConsesLow.cons( ConsesLow.list( server, status, status_msg ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Values.values( NIL, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject zk_child_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject zk_child_state_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$zk_child_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject zkkids_path(final SubLObject v_object)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject zkkids_uri(final SubLObject v_object)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject zkkids_child_uri_template(final SubLObject v_object)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject zkkids_children(final SubLObject v_object)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject _csetf_zkkids_path(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject _csetf_zkkids_uri(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject _csetf_zkkids_child_uri_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject _csetf_zkkids_children(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_child_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject make_zk_child_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $zk_child_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$PATH ) )
      {
        _csetf_zkkids_path( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$URI ) )
      {
        _csetf_zkkids_uri( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$CHILD_URI_TEMPLATE ) )
      {
        _csetf_zkkids_child_uri_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$CHILDREN ) )
      {
        _csetf_zkkids_children( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject visit_defstruct_zk_child_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym30$MAKE_ZK_CHILD_STATE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw24$PATH, zkkids_path( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw25$URI, zkkids_uri( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw26$CHILD_URI_TEMPLATE, zkkids_child_uri_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw27$CHILDREN, zkkids_children( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym30$MAKE_ZK_CHILD_STATE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2647L)
  public static SubLObject visit_defstruct_object_zk_child_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_zk_child_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2896L)
  public static SubLObject parse_zk_children(final SubLObject xml_tokens)
  {
    final SubLObject node = make_zk_child_state( UNPROVIDED );
    final SubLObject tokens = iteration.new_list_iterator( xml_tokens );
    iteration.iteration_next( tokens );
    iteration.iteration_next( tokens );
    if( NIL != web_utilities.matching_open_tagP( $str34$child, iteration.iteration_next( tokens ), UNPROVIDED ) )
    {
      SubLObject children = NIL;
      while ( NIL == iteration.iteration_done( tokens ))
      {
        final SubLObject tag = iteration.iteration_next( tokens );
        if( NIL != web_utilities.matching_close_tagP( $str34$child, tag, UNPROVIDED ) )
        {
          return node;
        }
        if( NIL != web_utilities.matching_open_tagP( $str35$path, tag, UNPROVIDED ) )
        {
          _csetf_zkkids_path( node, iteration.iteration_next( tokens ) );
          zk_must_match_closing_tag( tokens, $str35$path );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str36$uri, tag, UNPROVIDED ) )
        {
          _csetf_zkkids_uri( node, iteration.iteration_next( tokens ) );
          zk_must_match_closing_tag( tokens, $str36$uri );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str37$child_uri_template, tag, UNPROVIDED ) )
        {
          _csetf_zkkids_child_uri_template( node, iteration.iteration_next( tokens ) );
          zk_must_match_closing_tag( tokens, $str37$child_uri_template );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str38$children, tag, UNPROVIDED ) )
        {
          children = NIL;
        }
        else if( NIL != web_utilities.matching_open_tagP( $str34$child, tag, UNPROVIDED ) )
        {
          children = ConsesLow.cons( iteration.iteration_next( tokens ), children );
          zk_must_match_closing_tag( tokens, $str34$child );
        }
        else if( NIL != web_utilities.matching_close_tagP( $str38$children, tag, UNPROVIDED ) )
        {
          _csetf_zkkids_children( node, Sequences.nreverse( children ) );
        }
        else
        {
          Errors.error( $str39$Unexpected_XML_tag__A___, tag );
        }
      }
    }
    return Errors.error( $str40$Unexpected_token_stream__A_, tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4569L)
  public static SubLObject zk_set_node_data(final SubLObject node_path, final SubLObject utf8_data)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject connection_error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject real_port = $zookeeper_rest_port$.getDynamicValue( thread ).eql( $kw43$DEFAULT ) ? $int44$80 : $zookeeper_rest_port$.getDynamicValue( thread );
            SubLObject in_stream = NIL;
            try
            {
              in_stream = subl_promotions.open_tcp_stream_with_timeout( server, real_port, $zookeeper_rest_timeout$.getDynamicValue( thread ), $kw45$PRIVATE );
              if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, server, real_port ) )
              {
                web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw46$MACHINE, server, $kw47$PORT, $zookeeper_rest_port$.getDynamicValue( thread ), $kw48$METHOD, $kw49$PUT, $kw50$URL,
                  node_path, $kw51$QUERY, utf8_data, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $kw54$ACCEPT_TYPES, $list6, $kw55$CONTENT_TYPE, $str56$application_octet_stream, $kw57$SOAP_ACTION_URI, NIL
                } ) );
                if( in_stream.isStream() )
                {
                  thread.resetMultipleValues();
                  final SubLObject status = zk_analyze_set_response( xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject message = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values( status, message );
                }
                problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, $str60$no_connection ), problems );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != in_stream )
                {
                  streams_high.close( in_stream, UNPROVIDED );
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
        connection_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, connection_error ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Errors.error( $str61$Could_not_create_node_on_any_serv, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6138L)
  public static SubLObject zk_analyze_set_response(final SubLObject tokens)
  {
    final SubLObject header = tokens.first();
    if( NIL != string_utilities.starts_with( header, $str62$HTTP_1_1_200_OK ) )
    {
      return Values.values( T, NIL );
    }
    if( NIL != string_utilities.starts_with( header, $str63$HTTP_1_1_404_Not_Found ) )
    {
      return Values.values( NIL, $str64$No_such_node_ );
    }
    return Values.values( NIL, Sequences.cconcatenate( $str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy( header ), $str66$_, format_nil.$format_nil_percent$.getGlobalValue()
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6488L)
  public static SubLObject zk_delete_node(final SubLObject node_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject connection_error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject real_port = $zookeeper_rest_port$.getDynamicValue( thread ).eql( $kw43$DEFAULT ) ? $int44$80 : $zookeeper_rest_port$.getDynamicValue( thread );
            SubLObject in_stream = NIL;
            try
            {
              in_stream = subl_promotions.open_tcp_stream_with_timeout( server, real_port, $zookeeper_rest_timeout$.getDynamicValue( thread ), $kw45$PRIVATE );
              if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, server, real_port ) )
              {
                web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw46$MACHINE, server, $kw47$PORT, $zookeeper_rest_port$.getDynamicValue( thread ), $kw48$METHOD, $kw68$DELETE, $kw50$URL,
                  node_path, $kw51$QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $kw54$ACCEPT_TYPES, $list6, $kw55$CONTENT_TYPE, $str56$application_octet_stream, $kw57$SOAP_ACTION_URI, NIL
                } ) );
                if( in_stream.isStream() )
                {
                  thread.resetMultipleValues();
                  final SubLObject status = zk_analyze_delete_response( xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject message = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values( status, message );
                }
                problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, $str60$no_connection ), problems );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != in_stream )
                {
                  streams_high.close( in_stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
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
        connection_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, connection_error ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Errors.error( $str61$Could_not_create_node_on_any_serv, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7982L)
  public static SubLObject zk_analyze_delete_response(final SubLObject tokens)
  {
    final SubLObject header = tokens.first();
    if( NIL != string_utilities.starts_with( header, $str70$HTTP_1_1_204_No_Content ) )
    {
      return Values.values( T, NIL );
    }
    if( NIL != string_utilities.starts_with( header, $str63$HTTP_1_1_404_Not_Found ) )
    {
      return Values.values( NIL, $str64$No_such_node_ );
    }
    return Values.values( NIL, Sequences.cconcatenate( $str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy( header ), $str66$_, format_nil.$format_nil_percent$.getGlobalValue()
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8343L)
  public static SubLObject zk_get_node_state(final SubLObject node_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject port = $zookeeper_rest_port$.getDynamicValue( thread );
    final SubLObject timeout = $zookeeper_rest_timeout$.getDynamicValue( thread );
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject xml_tokens = xml_parsing_utilities.xml_tokenized_http_request( server, node_path, $str72$dataformat_utf8, $kw5$GET, port, NIL, NIL, timeout, timeout, NIL, $list6 );
      final SubLObject status = thread.secondMultipleValue();
      final SubLObject status_msg = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == status )
      {
        return Values.values( parse_zk_state( xml_tokens ), NIL );
      }
      problems = ConsesLow.cons( ConsesLow.list( server, status, status_msg ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Values.values( NIL, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zk_node_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zk_node_state_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$zk_node_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_path(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_uri(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_data(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_czxid(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_mzxid(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_ctime(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_mtime(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_version(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_cversion(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_aversion(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_ephemeral_owner(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_data_len(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_num_children(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject zkstat_pzxid(final SubLObject v_object)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_path(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_uri(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_czxid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_mzxid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_ctime(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_mtime(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_version(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_cversion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_aversion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_ephemeral_owner(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_data_len(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_num_children(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject _csetf_zkstat_pzxid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != zk_node_state_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject make_zk_node_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $zk_node_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$PATH ) )
      {
        _csetf_zkstat_path( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$URI ) )
      {
        _csetf_zkstat_uri( v_new, current_value );
      }
      else if( pcase_var.eql( $kw109$DATA ) )
      {
        _csetf_zkstat_data( v_new, current_value );
      }
      else if( pcase_var.eql( $kw110$CZXID ) )
      {
        _csetf_zkstat_czxid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw111$MZXID ) )
      {
        _csetf_zkstat_mzxid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw112$CTIME ) )
      {
        _csetf_zkstat_ctime( v_new, current_value );
      }
      else if( pcase_var.eql( $kw113$MTIME ) )
      {
        _csetf_zkstat_mtime( v_new, current_value );
      }
      else if( pcase_var.eql( $kw114$VERSION ) )
      {
        _csetf_zkstat_version( v_new, current_value );
      }
      else if( pcase_var.eql( $kw115$CVERSION ) )
      {
        _csetf_zkstat_cversion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw116$AVERSION ) )
      {
        _csetf_zkstat_aversion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw117$EPHEMERAL_OWNER ) )
      {
        _csetf_zkstat_ephemeral_owner( v_new, current_value );
      }
      else if( pcase_var.eql( $kw118$DATA_LEN ) )
      {
        _csetf_zkstat_data_len( v_new, current_value );
      }
      else if( pcase_var.eql( $kw119$NUM_CHILDREN ) )
      {
        _csetf_zkstat_num_children( v_new, current_value );
      }
      else if( pcase_var.eql( $kw120$PZXID ) )
      {
        _csetf_zkstat_pzxid( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject visit_defstruct_zk_node_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym121$MAKE_ZK_NODE_STATE, FOURTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw24$PATH, zkstat_path( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw25$URI, zkstat_uri( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw109$DATA, zkstat_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw110$CZXID, zkstat_czxid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw111$MZXID, zkstat_mzxid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw112$CTIME, zkstat_ctime( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw113$MTIME, zkstat_mtime( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw114$VERSION, zkstat_version( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw115$CVERSION, zkstat_cversion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw116$AVERSION, zkstat_aversion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw117$EPHEMERAL_OWNER, zkstat_ephemeral_owner( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw118$DATA_LEN, zkstat_data_len( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw119$NUM_CHILDREN, zkstat_num_children( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw120$PZXID, zkstat_pzxid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym121$MAKE_ZK_NODE_STATE, FOURTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9388L)
  public static SubLObject visit_defstruct_object_zk_node_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_zk_node_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9996L)
  public static SubLObject parse_zk_state(final SubLObject xml_tokens)
  {
    final SubLObject node = make_zk_node_state( UNPROVIDED );
    final SubLObject tokens = iteration.new_list_iterator( xml_tokens );
    iteration.iteration_next( tokens );
    iteration.iteration_next( tokens );
    if( NIL != web_utilities.matching_open_tagP( $str123$stat, iteration.iteration_next( tokens ), UNPROVIDED ) )
    {
      while ( NIL == iteration.iteration_done( tokens ))
      {
        final SubLObject tag = iteration.iteration_next( tokens );
        if( NIL != web_utilities.matching_close_tagP( $str123$stat, tag, UNPROVIDED ) )
        {
          return node;
        }
        if( NIL != web_utilities.matching_open_tagP( $str35$path, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_path( node, iteration.iteration_next( tokens ) );
          zk_must_match_closing_tag( tokens, $str35$path );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str36$uri, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_uri( node, iteration.iteration_next( tokens ) );
          zk_must_match_closing_tag( tokens, $str36$uri );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str124$dataUtf8, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_data( node, iteration.iteration_next( tokens ) );
          zk_must_match_closing_tag( tokens, $str124$dataUtf8 );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str125$czxid, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_czxid( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str125$czxid );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str126$mzxid, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_mzxid( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str126$mzxid );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str127$pzxid, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_pzxid( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str127$pzxid );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str128$ctime, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_ctime( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str128$ctime );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str129$mtime, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_mtime( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str129$mtime );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str130$version, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_version( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str130$version );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str131$aversion, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_aversion( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str131$aversion );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str132$cversion, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_cversion( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str132$cversion );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str133$ephemeralOwner, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_ephemeral_owner( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str133$ephemeralOwner );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str134$dataLength, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_data_len( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str134$dataLength );
        }
        else if( NIL != web_utilities.matching_open_tagP( $str135$numChildren, tag, UNPROVIDED ) )
        {
          _csetf_zkstat_num_children( node, reader.parse_integer( iteration.iteration_next( tokens ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          zk_must_match_closing_tag( tokens, $str135$numChildren );
        }
        else
        {
          Errors.error( $str39$Unexpected_XML_tag__A___, tag );
        }
      }
    }
    return Errors.error( $str40$Unexpected_token_stream__A_, tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13259L)
  public static SubLObject zk_must_match_closing_tag(final SubLObject tokens, final SubLObject close_tag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ctag = iteration.iteration_next( tokens );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == web_utilities.matching_close_tagP( close_tag, ctag, UNPROVIDED ) )
    {
      Errors.error( $str136$Expected_closing_tag__A_but_got__, close_tag, ctag );
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13497L)
  public static SubLObject zk_create_permanent_node(final SubLObject parent_node_path, final SubLObject name, SubLObject initial_data)
  {
    if( initial_data == UNPROVIDED )
    {
      initial_data = $str69$;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject full_path = Sequences.cconcatenate( parent_node_path, new SubLObject[] { $str138$_op_create_name_, name
    } );
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject connection_error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject real_port = $zookeeper_rest_port$.getDynamicValue( thread ).eql( $kw43$DEFAULT ) ? $int44$80 : $zookeeper_rest_port$.getDynamicValue( thread );
            SubLObject in_stream = NIL;
            try
            {
              in_stream = subl_promotions.open_tcp_stream_with_timeout( server, real_port, $zookeeper_rest_timeout$.getDynamicValue( thread ), $kw45$PRIVATE );
              if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, server, real_port ) )
              {
                web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw46$MACHINE, server, $kw47$PORT, $zookeeper_rest_port$.getDynamicValue( thread ), $kw48$METHOD, $kw139$POST, $kw50$URL,
                  full_path, $kw51$QUERY, initial_data, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $kw54$ACCEPT_TYPES, $list6, $kw55$CONTENT_TYPE, $str56$application_octet_stream, $kw57$SOAP_ACTION_URI, NIL
                } ) );
                if( in_stream.isStream() )
                {
                  thread.resetMultipleValues();
                  final SubLObject status = zk_analyze_create_response( xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject message = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values( status, message );
                }
                problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, $str60$no_connection ), problems );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != in_stream )
                {
                  streams_high.close( in_stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
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
        connection_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, connection_error ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Values.values( NIL, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14828L)
  public static SubLObject zk_analyze_create_response(final SubLObject tokens)
  {
    final SubLObject header = tokens.first();
    if( NIL != string_utilities.starts_with( header, $str140$HTTP_1_1_201_Created ) )
    {
      return Values.values( T, NIL );
    }
    if( NIL != string_utilities.starts_with( header, $str141$HTTP_1_1_409_Conflict ) )
    {
      return Values.values( NIL, $str142$Node_already_exits_ );
    }
    if( NIL != string_utilities.starts_with( header, $str63$HTTP_1_1_404_Not_Found ) )
    {
      return Values.values( NIL, $str143$No_such_parent_node_ );
    }
    return Values.values( NIL, Sequences.cconcatenate( $str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy( header ), $str66$_, format_nil.$format_nil_percent$.getGlobalValue()
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15293L)
  public static SubLObject zk_create_session(SubLObject timeout_secs)
  {
    if( timeout_secs == UNPROVIDED )
    {
      timeout_secs = FIVE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject session_uri = Sequences.cconcatenate( $str145$_sessions_v1__op_create_expire_, format_nil.format_nil_a_no_copy( timeout_secs ) );
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject connection_error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject real_port = $zookeeper_rest_port$.getDynamicValue( thread ).eql( $kw43$DEFAULT ) ? $int44$80 : $zookeeper_rest_port$.getDynamicValue( thread );
            SubLObject in_stream = NIL;
            try
            {
              in_stream = subl_promotions.open_tcp_stream_with_timeout( server, real_port, $zookeeper_rest_timeout$.getDynamicValue( thread ), $kw45$PRIVATE );
              if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, server, real_port ) )
              {
                web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw46$MACHINE, server, $kw47$PORT, $zookeeper_rest_port$.getDynamicValue( thread ), $kw48$METHOD, $kw139$POST, $kw50$URL,
                  session_uri, $kw51$QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $kw54$ACCEPT_TYPES, $list6, $kw55$CONTENT_TYPE, $str56$application_octet_stream, $kw57$SOAP_ACTION_URI, NIL
                } ) );
                if( in_stream.isStream() )
                {
                  thread.resetMultipleValues();
                  final SubLObject session_id = zk_analyze_create_session_response( xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject message = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values( session_id, message );
                }
                problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, $str60$no_connection ), problems );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != in_stream )
                {
                  streams_high.close( in_stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
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
        connection_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, connection_error ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Values.values( NIL, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17023L)
  public static SubLObject zk_analyze_create_session_response(final SubLObject tokens)
  {
    final SubLObject header = tokens.first();
    if( NIL != string_utilities.starts_with( header, $str140$HTTP_1_1_201_Created ) )
    {
      final SubLObject id_string = ConsesLow.nth( FOUR_INTEGER, tokens );
      return Values.values( id_string, NIL );
    }
    return Values.values( NIL, Sequences.cconcatenate( $str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy( header ), $str66$_, format_nil.$format_nil_percent$.getGlobalValue()
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17347L)
  public static SubLObject zk_send_session_heartbeat(final SubLObject session_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject session_uri = Sequences.cconcatenate( $str147$_sessions_v1_, format_nil.format_nil_a_no_copy( session_id ) );
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject connection_error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject real_port = $zookeeper_rest_port$.getDynamicValue( thread ).eql( $kw43$DEFAULT ) ? $int44$80 : $zookeeper_rest_port$.getDynamicValue( thread );
            SubLObject in_stream = NIL;
            try
            {
              in_stream = subl_promotions.open_tcp_stream_with_timeout( server, real_port, $zookeeper_rest_timeout$.getDynamicValue( thread ), $kw45$PRIVATE );
              if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, server, real_port ) )
              {
                web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw46$MACHINE, server, $kw47$PORT, $zookeeper_rest_port$.getDynamicValue( thread ), $kw48$METHOD, $kw139$POST, $kw50$URL,
                  session_uri, $kw51$QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $kw54$ACCEPT_TYPES, $list6, $kw55$CONTENT_TYPE, $str56$application_octet_stream, $kw57$SOAP_ACTION_URI, NIL
                } ) );
                if( in_stream.isStream() )
                {
                  thread.resetMultipleValues();
                  final SubLObject status = zk_analyze_session_heartbeat_response( xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject message = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values( status, message );
                }
                problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, $str60$no_connection ), problems );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != in_stream )
                {
                  streams_high.close( in_stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
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
        connection_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, connection_error ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Values.values( NIL, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18933L)
  public static SubLObject zk_analyze_session_heartbeat_response(final SubLObject tokens)
  {
    final SubLObject header = tokens.first();
    if( NIL != string_utilities.starts_with( header, $str140$HTTP_1_1_201_Created ) )
    {
      final SubLObject id_string = ConsesLow.nth( FOUR_INTEGER, tokens );
      return Values.values( id_string, NIL );
    }
    return Values.values( NIL, Sequences.cconcatenate( $str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy( header ), $str66$_, format_nil.$format_nil_percent$.getGlobalValue()
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19260L)
  public static SubLObject zk_delete_session(final SubLObject session_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject session_uri = Sequences.cconcatenate( $str147$_sessions_v1_, format_nil.format_nil_a_no_copy( session_id ) );
    SubLObject problems = NIL;
    SubLObject cdolist_list_var = $zookeeper_rest_servers$.getDynamicValue( thread );
    SubLObject server = NIL;
    server = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject connection_error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject real_port = $zookeeper_rest_port$.getDynamicValue( thread ).eql( $kw43$DEFAULT ) ? $int44$80 : $zookeeper_rest_port$.getDynamicValue( thread );
            SubLObject in_stream = NIL;
            try
            {
              in_stream = subl_promotions.open_tcp_stream_with_timeout( server, real_port, $zookeeper_rest_timeout$.getDynamicValue( thread ), $kw45$PRIVATE );
              if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, server, real_port ) )
              {
                web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw46$MACHINE, server, $kw47$PORT, $zookeeper_rest_port$.getDynamicValue( thread ), $kw48$METHOD, $kw68$DELETE, $kw50$URL,
                  session_uri, $kw51$QUERY, $str69$, $kw52$KEEP_ALIVE_, NIL, $kw53$WIDE_NEWLINES_, NIL, $kw54$ACCEPT_TYPES, $list6, $kw55$CONTENT_TYPE, $str56$application_octet_stream, $kw57$SOAP_ACTION_URI, NIL
                } ) );
                if( in_stream.isStream() )
                {
                  thread.resetMultipleValues();
                  final SubLObject status = zk_analyze_delete_session_response( xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject message = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values( status, message );
                }
                problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, $str60$no_connection ), problems );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != in_stream )
                {
                  streams_high.close( in_stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
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
        connection_error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      problems = ConsesLow.cons( ConsesLow.list( server, $str59$n_a, connection_error ), problems );
      cdolist_list_var = cdolist_list_var.rest();
      server = cdolist_list_var.first();
    }
    return Errors.error( $str61$Could_not_create_node_on_any_serv, problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20940L)
  public static SubLObject zk_analyze_delete_session_response(final SubLObject tokens)
  {
    final SubLObject header = tokens.first();
    if( NIL != string_utilities.starts_with( header, $str70$HTTP_1_1_204_No_Content ) )
    {
      return Values.values( T, NIL );
    }
    if( NIL != string_utilities.starts_with( header, $str63$HTTP_1_1_404_Not_Found ) )
    {
      return Values.values( NIL, $str149$No_such_session_ );
    }
    return Values.values( NIL, Sequences.cconcatenate( $str65$Unexpected_HTTP_header_, new SubLObject[] { format_nil.format_nil_a_no_copy( header ), $str66$_, format_nil.$format_nil_percent$.getGlobalValue()
    } ) );
  }

  public static SubLObject declare_zookeeper_file()
  {
    SubLFiles.declareFunction( me, "zk_get_node_children", "ZK-GET-NODE-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_child_state_print_function_trampoline", "ZK-CHILD-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "zk_child_state_p", "ZK-CHILD-STATE-P", 1, 0, false );
    new $zk_child_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "zkkids_path", "ZKKIDS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "zkkids_uri", "ZKKIDS-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "zkkids_child_uri_template", "ZKKIDS-CHILD-URI-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "zkkids_children", "ZKKIDS-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkkids_path", "_CSETF-ZKKIDS-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkkids_uri", "_CSETF-ZKKIDS-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkkids_child_uri_template", "_CSETF-ZKKIDS-CHILD-URI-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkkids_children", "_CSETF-ZKKIDS-CHILDREN", 2, 0, false );
    SubLFiles.declareFunction( me, "make_zk_child_state", "MAKE-ZK-CHILD-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_zk_child_state", "VISIT-DEFSTRUCT-ZK-CHILD-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_zk_child_state_method", "VISIT-DEFSTRUCT-OBJECT-ZK-CHILD-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_zk_children", "PARSE-ZK-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_set_node_data", "ZK-SET-NODE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "zk_analyze_set_response", "ZK-ANALYZE-SET-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_delete_node", "ZK-DELETE-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_analyze_delete_response", "ZK-ANALYZE-DELETE-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_get_node_state", "ZK-GET-NODE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_node_state_print_function_trampoline", "ZK-NODE-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "zk_node_state_p", "ZK-NODE-STATE-P", 1, 0, false );
    new $zk_node_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "zkstat_path", "ZKSTAT-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_uri", "ZKSTAT-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_data", "ZKSTAT-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_czxid", "ZKSTAT-CZXID", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_mzxid", "ZKSTAT-MZXID", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_ctime", "ZKSTAT-CTIME", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_mtime", "ZKSTAT-MTIME", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_version", "ZKSTAT-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_cversion", "ZKSTAT-CVERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_aversion", "ZKSTAT-AVERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_ephemeral_owner", "ZKSTAT-EPHEMERAL-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_data_len", "ZKSTAT-DATA-LEN", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_num_children", "ZKSTAT-NUM-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "zkstat_pzxid", "ZKSTAT-PZXID", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_path", "_CSETF-ZKSTAT-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_uri", "_CSETF-ZKSTAT-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_data", "_CSETF-ZKSTAT-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_czxid", "_CSETF-ZKSTAT-CZXID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_mzxid", "_CSETF-ZKSTAT-MZXID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_ctime", "_CSETF-ZKSTAT-CTIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_mtime", "_CSETF-ZKSTAT-MTIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_version", "_CSETF-ZKSTAT-VERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_cversion", "_CSETF-ZKSTAT-CVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_aversion", "_CSETF-ZKSTAT-AVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_ephemeral_owner", "_CSETF-ZKSTAT-EPHEMERAL-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_data_len", "_CSETF-ZKSTAT-DATA-LEN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_num_children", "_CSETF-ZKSTAT-NUM-CHILDREN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_zkstat_pzxid", "_CSETF-ZKSTAT-PZXID", 2, 0, false );
    SubLFiles.declareFunction( me, "make_zk_node_state", "MAKE-ZK-NODE-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_zk_node_state", "VISIT-DEFSTRUCT-ZK-NODE-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_zk_node_state_method", "VISIT-DEFSTRUCT-OBJECT-ZK-NODE-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_zk_state", "PARSE-ZK-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_must_match_closing_tag", "ZK-MUST-MATCH-CLOSING-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "zk_create_permanent_node", "ZK-CREATE-PERMANENT-NODE", 2, 1, false );
    SubLFiles.declareFunction( me, "zk_analyze_create_response", "ZK-ANALYZE-CREATE-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_create_session", "ZK-CREATE-SESSION", 0, 1, false );
    SubLFiles.declareFunction( me, "zk_analyze_create_session_response", "ZK-ANALYZE-CREATE-SESSION-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_send_session_heartbeat", "ZK-SEND-SESSION-HEARTBEAT", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_analyze_session_heartbeat_response", "ZK-ANALYZE-SESSION-HEARTBEAT-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_delete_session", "ZK-DELETE-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "zk_analyze_delete_session_response", "ZK-ANALYZE-DELETE-SESSION-RESPONSE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_zookeeper_file()
  {
    $zookeeper_rest_servers$ = SubLFiles.defparameter( "*ZOOKEEPER-REST-SERVERS*", ConsesLow.list( $str0$localhost ) );
    $zookeeper_rest_port$ = SubLFiles.defparameter( "*ZOOKEEPER-REST-PORT*", $int1$9998 );
    $zookeeper_rest_timeout$ = SubLFiles.defparameter( "*ZOOKEEPER-REST-TIMEOUT*", $int2$60 );
    $dtp_zk_child_state$ = SubLFiles.defconstant( "*DTP-ZK-CHILD-STATE*", $sym7$ZK_CHILD_STATE );
    $dtp_zk_node_state$ = SubLFiles.defconstant( "*DTP-ZK-NODE-STATE*", $sym73$ZK_NODE_STATE );
    return NIL;
  }

  public static SubLObject setup_zookeeper_file()
  {
    access_macros.register_external_symbol( $sym3$ZK_GET_NODE_CHILDREN );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_zk_child_state$.getGlobalValue(), Symbols.symbol_function( $sym14$ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list15 );
    Structures.def_csetf( $sym16$ZKKIDS_PATH, $sym17$_CSETF_ZKKIDS_PATH );
    Structures.def_csetf( $sym18$ZKKIDS_URI, $sym19$_CSETF_ZKKIDS_URI );
    Structures.def_csetf( $sym20$ZKKIDS_CHILD_URI_TEMPLATE, $sym21$_CSETF_ZKKIDS_CHILD_URI_TEMPLATE );
    Structures.def_csetf( $sym22$ZKKIDS_CHILDREN, $sym23$_CSETF_ZKKIDS_CHILDREN );
    Equality.identity( $sym7$ZK_CHILD_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_zk_child_state$.getGlobalValue(), Symbols.symbol_function( $sym33$VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD ) );
    access_macros.register_external_symbol( $sym41$ZK_SET_NODE_DATA );
    access_macros.register_external_symbol( $sym67$ZK_DELETE_NODE );
    access_macros.register_external_symbol( $sym71$ZK_GET_NODE_STATE );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_zk_node_state$.getGlobalValue(), Symbols.symbol_function( $sym79$ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list80 );
    Structures.def_csetf( $sym81$ZKSTAT_PATH, $sym82$_CSETF_ZKSTAT_PATH );
    Structures.def_csetf( $sym83$ZKSTAT_URI, $sym84$_CSETF_ZKSTAT_URI );
    Structures.def_csetf( $sym85$ZKSTAT_DATA, $sym86$_CSETF_ZKSTAT_DATA );
    Structures.def_csetf( $sym87$ZKSTAT_CZXID, $sym88$_CSETF_ZKSTAT_CZXID );
    Structures.def_csetf( $sym89$ZKSTAT_MZXID, $sym90$_CSETF_ZKSTAT_MZXID );
    Structures.def_csetf( $sym91$ZKSTAT_CTIME, $sym92$_CSETF_ZKSTAT_CTIME );
    Structures.def_csetf( $sym93$ZKSTAT_MTIME, $sym94$_CSETF_ZKSTAT_MTIME );
    Structures.def_csetf( $sym95$ZKSTAT_VERSION, $sym96$_CSETF_ZKSTAT_VERSION );
    Structures.def_csetf( $sym97$ZKSTAT_CVERSION, $sym98$_CSETF_ZKSTAT_CVERSION );
    Structures.def_csetf( $sym99$ZKSTAT_AVERSION, $sym100$_CSETF_ZKSTAT_AVERSION );
    Structures.def_csetf( $sym101$ZKSTAT_EPHEMERAL_OWNER, $sym102$_CSETF_ZKSTAT_EPHEMERAL_OWNER );
    Structures.def_csetf( $sym103$ZKSTAT_DATA_LEN, $sym104$_CSETF_ZKSTAT_DATA_LEN );
    Structures.def_csetf( $sym105$ZKSTAT_NUM_CHILDREN, $sym106$_CSETF_ZKSTAT_NUM_CHILDREN );
    Structures.def_csetf( $sym107$ZKSTAT_PZXID, $sym108$_CSETF_ZKSTAT_PZXID );
    Equality.identity( $sym73$ZK_NODE_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_zk_node_state$.getGlobalValue(), Symbols.symbol_function( $sym122$VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD ) );
    access_macros.register_external_symbol( $sym137$ZK_CREATE_PERMANENT_NODE );
    access_macros.register_external_symbol( $sym144$ZK_CREATE_SESSION );
    access_macros.register_external_symbol( $sym146$ZK_SEND_SESSION_HEARTBEAT );
    access_macros.register_external_symbol( $sym148$ZK_DELETE_SESSION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_zookeeper_file();
  }

  @Override
  public void initializeVariables()
  {
    init_zookeeper_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_zookeeper_file();
  }
  static
  {
    me = new zookeeper();
    $zookeeper_rest_servers$ = null;
    $zookeeper_rest_port$ = null;
    $zookeeper_rest_timeout$ = null;
    $dtp_zk_child_state$ = null;
    $dtp_zk_node_state$ = null;
    $str0$localhost = makeString( "localhost" );
    $int1$9998 = makeInteger( 9998 );
    $int2$60 = makeInteger( 60 );
    $sym3$ZK_GET_NODE_CHILDREN = makeSymbol( "ZK-GET-NODE-CHILDREN" );
    $str4$view_children = makeString( "view=children" );
    $kw5$GET = makeKeyword( "GET" );
    $list6 = ConsesLow.list( makeString( "application/xml" ) );
    $sym7$ZK_CHILD_STATE = makeSymbol( "ZK-CHILD-STATE" );
    $sym8$ZK_CHILD_STATE_P = makeSymbol( "ZK-CHILD-STATE-P" );
    $list9 = ConsesLow.list( makeSymbol( "PATH" ), makeSymbol( "URI" ), makeSymbol( "CHILD-URI-TEMPLATE" ), makeSymbol( "CHILDREN" ) );
    $list10 = ConsesLow.list( makeKeyword( "PATH" ), makeKeyword( "URI" ), makeKeyword( "CHILD-URI-TEMPLATE" ), makeKeyword( "CHILDREN" ) );
    $list11 = ConsesLow.list( makeSymbol( "ZKKIDS-PATH" ), makeSymbol( "ZKKIDS-URI" ), makeSymbol( "ZKKIDS-CHILD-URI-TEMPLATE" ), makeSymbol( "ZKKIDS-CHILDREN" ) );
    $list12 = ConsesLow.list( makeSymbol( "_CSETF-ZKKIDS-PATH" ), makeSymbol( "_CSETF-ZKKIDS-URI" ), makeSymbol( "_CSETF-ZKKIDS-CHILD-URI-TEMPLATE" ), makeSymbol( "_CSETF-ZKKIDS-CHILDREN" ) );
    $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym14$ZK_CHILD_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ZK-CHILD-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list15 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ZK-CHILD-STATE-P" ) );
    $sym16$ZKKIDS_PATH = makeSymbol( "ZKKIDS-PATH" );
    $sym17$_CSETF_ZKKIDS_PATH = makeSymbol( "_CSETF-ZKKIDS-PATH" );
    $sym18$ZKKIDS_URI = makeSymbol( "ZKKIDS-URI" );
    $sym19$_CSETF_ZKKIDS_URI = makeSymbol( "_CSETF-ZKKIDS-URI" );
    $sym20$ZKKIDS_CHILD_URI_TEMPLATE = makeSymbol( "ZKKIDS-CHILD-URI-TEMPLATE" );
    $sym21$_CSETF_ZKKIDS_CHILD_URI_TEMPLATE = makeSymbol( "_CSETF-ZKKIDS-CHILD-URI-TEMPLATE" );
    $sym22$ZKKIDS_CHILDREN = makeSymbol( "ZKKIDS-CHILDREN" );
    $sym23$_CSETF_ZKKIDS_CHILDREN = makeSymbol( "_CSETF-ZKKIDS-CHILDREN" );
    $kw24$PATH = makeKeyword( "PATH" );
    $kw25$URI = makeKeyword( "URI" );
    $kw26$CHILD_URI_TEMPLATE = makeKeyword( "CHILD-URI-TEMPLATE" );
    $kw27$CHILDREN = makeKeyword( "CHILDREN" );
    $str28$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw29$BEGIN = makeKeyword( "BEGIN" );
    $sym30$MAKE_ZK_CHILD_STATE = makeSymbol( "MAKE-ZK-CHILD-STATE" );
    $kw31$SLOT = makeKeyword( "SLOT" );
    $kw32$END = makeKeyword( "END" );
    $sym33$VISIT_DEFSTRUCT_OBJECT_ZK_CHILD_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ZK-CHILD-STATE-METHOD" );
    $str34$child = makeString( "child" );
    $str35$path = makeString( "path" );
    $str36$uri = makeString( "uri" );
    $str37$child_uri_template = makeString( "child_uri_template" );
    $str38$children = makeString( "children" );
    $str39$Unexpected_XML_tag__A___ = makeString( "Unexpected XML tag ~A.~%" );
    $str40$Unexpected_token_stream__A_ = makeString( "Unexpected token stream ~A." );
    $sym41$ZK_SET_NODE_DATA = makeSymbol( "ZK-SET-NODE-DATA" );
    $sym42$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw43$DEFAULT = makeKeyword( "DEFAULT" );
    $int44$80 = makeInteger( 80 );
    $kw45$PRIVATE = makeKeyword( "PRIVATE" );
    $kw46$MACHINE = makeKeyword( "MACHINE" );
    $kw47$PORT = makeKeyword( "PORT" );
    $kw48$METHOD = makeKeyword( "METHOD" );
    $kw49$PUT = makeKeyword( "PUT" );
    $kw50$URL = makeKeyword( "URL" );
    $kw51$QUERY = makeKeyword( "QUERY" );
    $kw52$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw53$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw54$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw55$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $str56$application_octet_stream = makeString( "application/octet-stream" );
    $kw57$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $sym58$_EXIT = makeSymbol( "%EXIT" );
    $str59$n_a = makeString( "n/a" );
    $str60$no_connection = makeString( "no-connection" );
    $str61$Could_not_create_node_on_any_serv = makeString( "Could not create node on any server: ~A." );
    $str62$HTTP_1_1_200_OK = makeString( "HTTP/1.1 200 OK" );
    $str63$HTTP_1_1_404_Not_Found = makeString( "HTTP/1.1 404 Not Found" );
    $str64$No_such_node_ = makeString( "No such node." );
    $str65$Unexpected_HTTP_header_ = makeString( "Unexpected HTTP header " );
    $str66$_ = makeString( "." );
    $sym67$ZK_DELETE_NODE = makeSymbol( "ZK-DELETE-NODE" );
    $kw68$DELETE = makeKeyword( "DELETE" );
    $str69$ = makeString( "" );
    $str70$HTTP_1_1_204_No_Content = makeString( "HTTP/1.1 204 No Content" );
    $sym71$ZK_GET_NODE_STATE = makeSymbol( "ZK-GET-NODE-STATE" );
    $str72$dataformat_utf8 = makeString( "dataformat=utf8" );
    $sym73$ZK_NODE_STATE = makeSymbol( "ZK-NODE-STATE" );
    $sym74$ZK_NODE_STATE_P = makeSymbol( "ZK-NODE-STATE-P" );
    $list75 = ConsesLow.list( new SubLObject[] { makeSymbol( "PATH" ), makeSymbol( "URI" ), makeSymbol( "DATA" ), makeSymbol( "CZXID" ), makeSymbol( "MZXID" ), makeSymbol( "CTIME" ), makeSymbol( "MTIME" ), makeSymbol(
        "VERSION" ), makeSymbol( "CVERSION" ), makeSymbol( "AVERSION" ), makeSymbol( "EPHEMERAL-OWNER" ), makeSymbol( "DATA-LEN" ), makeSymbol( "NUM-CHILDREN" ), makeSymbol( "PZXID" )
    } );
    $list76 = ConsesLow.list( new SubLObject[] { makeKeyword( "PATH" ), makeKeyword( "URI" ), makeKeyword( "DATA" ), makeKeyword( "CZXID" ), makeKeyword( "MZXID" ), makeKeyword( "CTIME" ), makeKeyword( "MTIME" ),
      makeKeyword( "VERSION" ), makeKeyword( "CVERSION" ), makeKeyword( "AVERSION" ), makeKeyword( "EPHEMERAL-OWNER" ), makeKeyword( "DATA-LEN" ), makeKeyword( "NUM-CHILDREN" ), makeKeyword( "PZXID" )
    } );
    $list77 = ConsesLow.list( new SubLObject[] { makeSymbol( "ZKSTAT-PATH" ), makeSymbol( "ZKSTAT-URI" ), makeSymbol( "ZKSTAT-DATA" ), makeSymbol( "ZKSTAT-CZXID" ), makeSymbol( "ZKSTAT-MZXID" ), makeSymbol(
        "ZKSTAT-CTIME" ), makeSymbol( "ZKSTAT-MTIME" ), makeSymbol( "ZKSTAT-VERSION" ), makeSymbol( "ZKSTAT-CVERSION" ), makeSymbol( "ZKSTAT-AVERSION" ), makeSymbol( "ZKSTAT-EPHEMERAL-OWNER" ), makeSymbol(
            "ZKSTAT-DATA-LEN" ), makeSymbol( "ZKSTAT-NUM-CHILDREN" ), makeSymbol( "ZKSTAT-PZXID" )
    } );
    $list78 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-ZKSTAT-PATH" ), makeSymbol( "_CSETF-ZKSTAT-URI" ), makeSymbol( "_CSETF-ZKSTAT-DATA" ), makeSymbol( "_CSETF-ZKSTAT-CZXID" ), makeSymbol(
        "_CSETF-ZKSTAT-MZXID" ), makeSymbol( "_CSETF-ZKSTAT-CTIME" ), makeSymbol( "_CSETF-ZKSTAT-MTIME" ), makeSymbol( "_CSETF-ZKSTAT-VERSION" ), makeSymbol( "_CSETF-ZKSTAT-CVERSION" ), makeSymbol(
            "_CSETF-ZKSTAT-AVERSION" ), makeSymbol( "_CSETF-ZKSTAT-EPHEMERAL-OWNER" ), makeSymbol( "_CSETF-ZKSTAT-DATA-LEN" ), makeSymbol( "_CSETF-ZKSTAT-NUM-CHILDREN" ), makeSymbol( "_CSETF-ZKSTAT-PZXID" )
    } );
    $sym79$ZK_NODE_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ZK-NODE-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list80 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ZK-NODE-STATE-P" ) );
    $sym81$ZKSTAT_PATH = makeSymbol( "ZKSTAT-PATH" );
    $sym82$_CSETF_ZKSTAT_PATH = makeSymbol( "_CSETF-ZKSTAT-PATH" );
    $sym83$ZKSTAT_URI = makeSymbol( "ZKSTAT-URI" );
    $sym84$_CSETF_ZKSTAT_URI = makeSymbol( "_CSETF-ZKSTAT-URI" );
    $sym85$ZKSTAT_DATA = makeSymbol( "ZKSTAT-DATA" );
    $sym86$_CSETF_ZKSTAT_DATA = makeSymbol( "_CSETF-ZKSTAT-DATA" );
    $sym87$ZKSTAT_CZXID = makeSymbol( "ZKSTAT-CZXID" );
    $sym88$_CSETF_ZKSTAT_CZXID = makeSymbol( "_CSETF-ZKSTAT-CZXID" );
    $sym89$ZKSTAT_MZXID = makeSymbol( "ZKSTAT-MZXID" );
    $sym90$_CSETF_ZKSTAT_MZXID = makeSymbol( "_CSETF-ZKSTAT-MZXID" );
    $sym91$ZKSTAT_CTIME = makeSymbol( "ZKSTAT-CTIME" );
    $sym92$_CSETF_ZKSTAT_CTIME = makeSymbol( "_CSETF-ZKSTAT-CTIME" );
    $sym93$ZKSTAT_MTIME = makeSymbol( "ZKSTAT-MTIME" );
    $sym94$_CSETF_ZKSTAT_MTIME = makeSymbol( "_CSETF-ZKSTAT-MTIME" );
    $sym95$ZKSTAT_VERSION = makeSymbol( "ZKSTAT-VERSION" );
    $sym96$_CSETF_ZKSTAT_VERSION = makeSymbol( "_CSETF-ZKSTAT-VERSION" );
    $sym97$ZKSTAT_CVERSION = makeSymbol( "ZKSTAT-CVERSION" );
    $sym98$_CSETF_ZKSTAT_CVERSION = makeSymbol( "_CSETF-ZKSTAT-CVERSION" );
    $sym99$ZKSTAT_AVERSION = makeSymbol( "ZKSTAT-AVERSION" );
    $sym100$_CSETF_ZKSTAT_AVERSION = makeSymbol( "_CSETF-ZKSTAT-AVERSION" );
    $sym101$ZKSTAT_EPHEMERAL_OWNER = makeSymbol( "ZKSTAT-EPHEMERAL-OWNER" );
    $sym102$_CSETF_ZKSTAT_EPHEMERAL_OWNER = makeSymbol( "_CSETF-ZKSTAT-EPHEMERAL-OWNER" );
    $sym103$ZKSTAT_DATA_LEN = makeSymbol( "ZKSTAT-DATA-LEN" );
    $sym104$_CSETF_ZKSTAT_DATA_LEN = makeSymbol( "_CSETF-ZKSTAT-DATA-LEN" );
    $sym105$ZKSTAT_NUM_CHILDREN = makeSymbol( "ZKSTAT-NUM-CHILDREN" );
    $sym106$_CSETF_ZKSTAT_NUM_CHILDREN = makeSymbol( "_CSETF-ZKSTAT-NUM-CHILDREN" );
    $sym107$ZKSTAT_PZXID = makeSymbol( "ZKSTAT-PZXID" );
    $sym108$_CSETF_ZKSTAT_PZXID = makeSymbol( "_CSETF-ZKSTAT-PZXID" );
    $kw109$DATA = makeKeyword( "DATA" );
    $kw110$CZXID = makeKeyword( "CZXID" );
    $kw111$MZXID = makeKeyword( "MZXID" );
    $kw112$CTIME = makeKeyword( "CTIME" );
    $kw113$MTIME = makeKeyword( "MTIME" );
    $kw114$VERSION = makeKeyword( "VERSION" );
    $kw115$CVERSION = makeKeyword( "CVERSION" );
    $kw116$AVERSION = makeKeyword( "AVERSION" );
    $kw117$EPHEMERAL_OWNER = makeKeyword( "EPHEMERAL-OWNER" );
    $kw118$DATA_LEN = makeKeyword( "DATA-LEN" );
    $kw119$NUM_CHILDREN = makeKeyword( "NUM-CHILDREN" );
    $kw120$PZXID = makeKeyword( "PZXID" );
    $sym121$MAKE_ZK_NODE_STATE = makeSymbol( "MAKE-ZK-NODE-STATE" );
    $sym122$VISIT_DEFSTRUCT_OBJECT_ZK_NODE_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ZK-NODE-STATE-METHOD" );
    $str123$stat = makeString( "stat" );
    $str124$dataUtf8 = makeString( "dataUtf8" );
    $str125$czxid = makeString( "czxid" );
    $str126$mzxid = makeString( "mzxid" );
    $str127$pzxid = makeString( "pzxid" );
    $str128$ctime = makeString( "ctime" );
    $str129$mtime = makeString( "mtime" );
    $str130$version = makeString( "version" );
    $str131$aversion = makeString( "aversion" );
    $str132$cversion = makeString( "cversion" );
    $str133$ephemeralOwner = makeString( "ephemeralOwner" );
    $str134$dataLength = makeString( "dataLength" );
    $str135$numChildren = makeString( "numChildren" );
    $str136$Expected_closing_tag__A_but_got__ = makeString( "Expected closing tag ~A but got ~A instead.~%" );
    $sym137$ZK_CREATE_PERMANENT_NODE = makeSymbol( "ZK-CREATE-PERMANENT-NODE" );
    $str138$_op_create_name_ = makeString( "?op=create&name=" );
    $kw139$POST = makeKeyword( "POST" );
    $str140$HTTP_1_1_201_Created = makeString( "HTTP/1.1 201 Created" );
    $str141$HTTP_1_1_409_Conflict = makeString( "HTTP/1.1 409 Conflict" );
    $str142$Node_already_exits_ = makeString( "Node already exits." );
    $str143$No_such_parent_node_ = makeString( "No such parent node." );
    $sym144$ZK_CREATE_SESSION = makeSymbol( "ZK-CREATE-SESSION" );
    $str145$_sessions_v1__op_create_expire_ = makeString( "/sessions/v1/?op=create&expire=" );
    $sym146$ZK_SEND_SESSION_HEARTBEAT = makeSymbol( "ZK-SEND-SESSION-HEARTBEAT" );
    $str147$_sessions_v1_ = makeString( "/sessions/v1/" );
    $sym148$ZK_DELETE_SESSION = makeSymbol( "ZK-DELETE-SESSION" );
    $str149$No_such_session_ = makeString( "No such session." );
  }

  public static final class $zk_child_state_native
      extends
        SubLStructNative
  {
    public SubLObject $path;
    public SubLObject $uri;
    public SubLObject $child_uri_template;
    public SubLObject $children;
    private static final SubLStructDeclNative structDecl;

    public $zk_child_state_native()
    {
      this.$path = CommonSymbols.NIL;
      this.$uri = CommonSymbols.NIL;
      this.$child_uri_template = CommonSymbols.NIL;
      this.$children = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $zk_child_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$path;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$uri;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$child_uri_template;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$children;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$path = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$uri = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$child_uri_template = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$children = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $zk_child_state_native.class, $sym7$ZK_CHILD_STATE, $sym8$ZK_CHILD_STATE_P, $list9, $list10, new String[] { "$path", "$uri", "$child_uri_template", "$children"
      }, $list11, $list12, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $zk_child_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $zk_child_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ZK-CHILD-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return zk_child_state_p( arg1 );
    }
  }

  public static final class $zk_node_state_native
      extends
        SubLStructNative
  {
    public SubLObject $path;
    public SubLObject $uri;
    public SubLObject $data;
    public SubLObject $czxid;
    public SubLObject $mzxid;
    public SubLObject $ctime;
    public SubLObject $mtime;
    public SubLObject $version;
    public SubLObject $cversion;
    public SubLObject $aversion;
    public SubLObject $ephemeral_owner;
    public SubLObject $data_len;
    public SubLObject $num_children;
    public SubLObject $pzxid;
    private static final SubLStructDeclNative structDecl;

    public $zk_node_state_native()
    {
      this.$path = CommonSymbols.NIL;
      this.$uri = CommonSymbols.NIL;
      this.$data = CommonSymbols.NIL;
      this.$czxid = CommonSymbols.NIL;
      this.$mzxid = CommonSymbols.NIL;
      this.$ctime = CommonSymbols.NIL;
      this.$mtime = CommonSymbols.NIL;
      this.$version = CommonSymbols.NIL;
      this.$cversion = CommonSymbols.NIL;
      this.$aversion = CommonSymbols.NIL;
      this.$ephemeral_owner = CommonSymbols.NIL;
      this.$data_len = CommonSymbols.NIL;
      this.$num_children = CommonSymbols.NIL;
      this.$pzxid = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $zk_node_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$path;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$uri;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$data;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$czxid;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$mzxid;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$ctime;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$mtime;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$version;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$cversion;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$aversion;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$ephemeral_owner;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$data_len;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$num_children;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$pzxid;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$path = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$uri = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$data = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$czxid = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$mzxid = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$ctime = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$mtime = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$version = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$cversion = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$aversion = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$ephemeral_owner = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$data_len = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$num_children = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$pzxid = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $zk_node_state_native.class, $sym73$ZK_NODE_STATE, $sym74$ZK_NODE_STATE_P, $list75, $list76, new String[] { "$path", "$uri", "$data", "$czxid", "$mzxid", "$ctime",
        "$mtime", "$version", "$cversion", "$aversion", "$ephemeral_owner", "$data_len", "$num_children", "$pzxid"
      }, $list77, $list78, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $zk_node_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $zk_node_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ZK-NODE-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return zk_node_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 474 ms
 * 
 */