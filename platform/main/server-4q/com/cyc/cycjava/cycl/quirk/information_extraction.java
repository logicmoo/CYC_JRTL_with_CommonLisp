package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class information_extraction
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.information_extraction";
  public static final String myFingerPrint = "21aa4a9da8a124b9b89ee6b092981ef91e926c360d467381a74a8737c2c657b6";
  private static final SubLSymbol $sym0$INFORMATION_EXTRACTION_NODE;
  private static final SubLSymbol $sym1$GRAPH_NODE;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CYCL_DENOTATIONS;
  private static final SubLSymbol $sym4$OBJECT;
  private static final SubLSymbol $sym5$INSTANCE_COUNT;
  private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS;
  private static final SubLSymbol $sym7$ISOLATED_P;
  private static final SubLSymbol $sym8$INSTANCE_NUMBER;
  private static final SubLSymbol $sym9$CORE;
  private static final SubLSymbol $sym10$ID;
  private static final SubLSymbol $sym11$LABEL;
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE;
  private static final SubLSymbol $sym13$INITIALIZE;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD;
  private static final SubLSymbol $sym17$CYCL_DENOTS;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD;
  private static final SubLSymbol $sym20$INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD;
  private static final SubLSymbol $sym21$EXTRACT_CYCL;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD;
  private static final SubLSymbol $sym26$LISTP;
  private static final SubLSymbol $sym27$INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD;
  private static final SubLSymbol $sym28$PRINT;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD;
  private static final SubLString $str32$__IEN__;
  private static final SubLString $str33$____;
  private static final SubLString $str34$_;
  private static final SubLSymbol $sym35$INFORMATION_EXTRACTION_NODE_PRINT_METHOD;
  private static final SubLSymbol $sym36$STRINGP;
  private static final SubLSymbol $sym37$SET_LABEL;
  private static final SubLSymbol $sym38$SET_ID;
  private static final SubLSymbol $sym39$INFORMATION_EXTRACTION_GRAPH;
  private static final SubLSymbol $sym40$GRAPH;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS;
  private static final SubLSymbol $sym43$NAME;
  private static final SubLSymbol $sym44$INTEGER_SEQUENCE_GENERATOR;
  private static final SubLSymbol $sym45$LABEL_NODE_MAP;
  private static final SubLSymbol $sym46$NODES;
  private static final SubLSymbol $sym47$LABEL_EDGE_MAP;
  private static final SubLSymbol $sym48$EDGES_SOURCE;
  private static final SubLSymbol $sym49$EDGES_TARGET;
  private static final SubLSymbol $sym50$CORE_NODE_MAP;
  private static final SubLSymbol $sym51$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD;
  private static final SubLSymbol $sym54$ACCEPT_NODE;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD;
  private static final SubLSymbol $sym58$FIND_EVENTS;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD;
  private static final SubLSymbol $sym62$GET_NODE_BY_LABEL;
  private static final SubLSymbol $sym63$ADD_NODE;
  private static final SubLSymbol $sym64$ADD_EDGE;
  private static final SubLSymbol $sym65$GRAPH_EDGE;
  private static final SubLSymbol $sym66$MAKE_EDGE;
  private static final SubLSymbol $sym67$IE_MARKET_POSITION;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$SUPPORTS;
  private static final SubLSymbol $sym70$BINDER;
  private static final SubLSymbol $sym71$FUNDS;
  private static final SubLSymbol $sym72$SOUGHT;
  private static final SubLSymbol $sym73$ON_SALE;
  private static final SubLSymbol $sym74$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS;
  private static final SubLSymbol $sym75$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE;
  private static final SubLSymbol $sym76$VARIABLE_DICTIONARY;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$DICTIONARY;
  private static final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS;
  private static final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$VARIABLE_DICTIONARY_INITIALIZE_METHOD;
  private static final SubLSymbol $sym83$KEYS;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD;
  private static final SubLSymbol $sym86$VARIABLE_DICTIONARY_KEYS_METHOD;
  private static final SubLSymbol $sym87$FIND_VARIABLE_TAXONOMIC_PRED;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD;
  private static final SubLString $str92$___S_is_not_a_variable_;
  private static final SubLList $list93;
  private static final SubLString $str94$___S_is_not_a_taxonomic_predicate;
  private static final SubLObject $const95$genls;
  private static final SubLSymbol $sym96$VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD;
  private static final SubLSymbol $sym97$PPRINT;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD;
  private static final SubLSymbol $sym101$VARIABLE_DICTIONARY_PPRINT_METHOD;
  private static final SubLSymbol $sym102$APPEND;
  private static final SubLSymbol $sym103$CONSP;
  private static final SubLString $str104$index;
  private static final SubLSymbol $sym105$GET_PATH_LABELS;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
  public static SubLObject get_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node)
  {
    return classes.subloop_get_access_protected_instance_slot( information_extraction_node, FOUR_INTEGER, $sym3$CYCL_DENOTATIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
  public static SubLObject set_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( information_extraction_node, value, FOUR_INTEGER, $sym3$CYCL_DENOTATIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
  public static SubLObject subloop_reserved_initialize_information_extraction_node_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
  public static SubLObject subloop_reserved_initialize_information_extraction_node_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$GRAPH_NODE, $sym9$CORE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$GRAPH_NODE, $sym10$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$GRAPH_NODE, $sym11$LABEL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INFORMATION_EXTRACTION_NODE, $sym3$CYCL_DENOTATIONS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
  public static SubLObject information_extraction_node_p(final SubLObject information_extraction_node)
  {
    return classes.subloop_instanceof_class( information_extraction_node, $sym0$INFORMATION_EXTRACTION_NODE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 2325L)
  public static SubLObject information_extraction_node_initialize_method(final SubLObject self)
  {
    graph.graph_node_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 2532L)
  public static SubLObject information_extraction_node_cycl_denots_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_information_extraction_node_method = NIL;
    SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations( self );
    final SubLObject label = graph.get_graph_node_label( self );
    try
    {
      thread.throwStack.push( $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD );
      try
      {
        if( NIL != cycl_denotations )
        {
          Dynamic.sublisp_throw( $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations );
        }
        if( NIL != label )
        {
          cycl_denotations = nl_trie_accessors.nl_trie_all_denots_of_string( label, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        Dynamic.sublisp_throw( $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_information_extraction_node_cycl_denotations( self, cycl_denotations );
          graph.set_graph_node_label( self, label );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_information_extraction_node_method = Errors.handleThrowable( ccatch_env_var, $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_information_extraction_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 2854L)
  public static SubLObject information_extraction_node_extract_cycl_method(final SubLObject self, SubLObject filters)
  {
    if( filters == UNPROVIDED )
    {
      filters = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_information_extraction_node_method = NIL;
    final SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations( self );
    try
    {
      thread.throwStack.push( $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD );
      try
      {
        if( NIL != filters && !assertionsDisabledInClass && NIL == Types.listp( filters ) )
        {
          throw new AssertionError( filters );
        }
        if( NIL == filters )
        {
          Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations );
        }
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var = cycl_denotations;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject fail = NIL;
          if( NIL == fail )
          {
            SubLObject csome_list_var;
            SubLObject filter;
            for( csome_list_var = filters, filter = NIL, filter = csome_list_var.first(); NIL == fail && NIL != csome_list_var; fail = makeBoolean( NIL == at_utilities.more_specific_p( v_term, filter,
                UNPROVIDED ) ), csome_list_var = csome_list_var.rest(), filter = csome_list_var.first() )
            {
            }
          }
          if( NIL == fail )
          {
            filtered = ConsesLow.cons( v_term, filtered );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, filtered );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_information_extraction_node_cycl_denotations( self, cycl_denotations );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_information_extraction_node_method = Errors.handleThrowable( ccatch_env_var, $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_information_extraction_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 3450L)
  public static SubLObject information_extraction_node_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_information_extraction_node_method = NIL;
    final SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations( self );
    final SubLObject label = graph.get_graph_node_label( self );
    try
    {
      thread.throwStack.push( $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD );
      try
      {
        streams_high.write_string( $str32$__IEN__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( label, stream, UNPROVIDED, UNPROVIDED );
        if( NIL != cycl_denotations )
        {
          streams_high.write_string( $str33$____, stream, UNPROVIDED, UNPROVIDED );
          streams_high.write_string( print_high.prin1_to_string( cycl_denotations ), stream, UNPROVIDED, UNPROVIDED );
        }
        streams_high.write_string( $str34$_, stream, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_information_extraction_node_cycl_denotations( self, cycl_denotations );
          graph.set_graph_node_label( self, label );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_information_extraction_node_method = Errors.handleThrowable( ccatch_env_var, $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_information_extraction_node_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 3890L)
  public static SubLObject new_information_extraction_node(final SubLObject label, SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    assert NIL != Types.stringp( label ) : label;
    final SubLObject node = object.new_class_instance( $sym0$INFORMATION_EXTRACTION_NODE );
    methods.funcall_instance_method_with_1_args( node, $sym37$SET_LABEL, label );
    methods.funcall_instance_method_with_0_args( node, $sym17$CYCL_DENOTS );
    if( NIL != id )
    {
      methods.funcall_instance_method_with_1_args( node, $sym38$SET_ID, id );
    }
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4307L)
  public static SubLObject subloop_reserved_initialize_information_extraction_graph_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4307L)
  public static SubLObject subloop_reserved_initialize_information_extraction_graph_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym43$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym44$INTEGER_SEQUENCE_GENERATOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym45$LABEL_NODE_MAP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym46$NODES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym47$LABEL_EDGE_MAP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym48$EDGES_SOURCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym49$EDGES_TARGET, NIL );
    classes.subloop_initialize_slot( new_instance, $sym40$GRAPH, $sym50$CORE_NODE_MAP, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4307L)
  public static SubLObject information_extraction_graph_p(final SubLObject information_extraction_graph)
  {
    return classes.subloop_instanceof_class( information_extraction_graph, $sym39$INFORMATION_EXTRACTION_GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4543L)
  public static SubLObject information_extraction_graph_initialize_method(final SubLObject self)
  {
    graph.graph_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4752L)
  public static SubLObject information_extraction_graph_accept_node_method(final SubLObject self, final SubLObject new_node)
  {
    return information_extraction_node_p( new_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 5018L)
  public static SubLObject information_extraction_graph_find_events_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject events = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( instances.get_slot( self, $sym46$NODES ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject node = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject item_var = methods.funcall_instance_method_with_1_args( node, $sym21$EXTRACT_CYCL, $list60 );
      if( NIL == conses_high.member( item_var, events, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        events = ConsesLow.cons( item_var, events );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return events;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 5232L)
  public static SubLObject new_information_extraction_graph(final SubLObject list)
  {
    final SubLObject ieg = object.new_class_instance( $sym39$INFORMATION_EXTRACTION_GRAPH );
    SubLObject cdolist_list_var = list;
    SubLObject node_list = NIL;
    node_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject from_string = node_list.first();
      SubLObject from_node = methods.funcall_instance_method_with_1_args( ieg, $sym62$GET_NODE_BY_LABEL, from_string );
      final SubLObject to_strings = node_list.rest();
      if( NIL == from_node )
      {
        from_node = new_information_extraction_node( from_string, UNPROVIDED );
        methods.funcall_instance_method_with_1_args( ieg, $sym63$ADD_NODE, from_node );
      }
      SubLObject cdolist_list_var_$1 = to_strings;
      SubLObject to_string = NIL;
      to_string = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        SubLObject to_node = methods.funcall_instance_method_with_1_args( ieg, $sym62$GET_NODE_BY_LABEL, to_string );
        if( NIL == to_node )
        {
          to_node = new_information_extraction_node( to_string, UNPROVIDED );
          methods.funcall_instance_method_with_1_args( ieg, $sym63$ADD_NODE, to_node );
        }
        methods.funcall_instance_method_with_1_args( ieg, $sym64$ADD_EDGE, methods.funcall_class_method_with_2_args( $sym65$GRAPH_EDGE, $sym66$MAKE_EDGE, from_node, to_node ) );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        to_string = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      node_list = cdolist_list_var.first();
    }
    return ieg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject get_ie_market_position_supports(final SubLObject ie_market_position)
  {
    return classes.subloop_get_access_protected_instance_slot( ie_market_position, FIVE_INTEGER, $sym69$SUPPORTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject set_ie_market_position_supports(final SubLObject ie_market_position, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( ie_market_position, value, FIVE_INTEGER, $sym69$SUPPORTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject get_ie_market_position_binder(final SubLObject ie_market_position)
  {
    return classes.subloop_get_access_protected_instance_slot( ie_market_position, FOUR_INTEGER, $sym70$BINDER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject set_ie_market_position_binder(final SubLObject ie_market_position, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( ie_market_position, value, FOUR_INTEGER, $sym70$BINDER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject get_ie_market_position_funds(final SubLObject ie_market_position)
  {
    return classes.subloop_get_access_protected_instance_slot( ie_market_position, THREE_INTEGER, $sym71$FUNDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject set_ie_market_position_funds(final SubLObject ie_market_position, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( ie_market_position, value, THREE_INTEGER, $sym71$FUNDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject get_ie_market_position_sought(final SubLObject ie_market_position)
  {
    return classes.subloop_get_access_protected_instance_slot( ie_market_position, TWO_INTEGER, $sym72$SOUGHT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject set_ie_market_position_sought(final SubLObject ie_market_position, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( ie_market_position, value, TWO_INTEGER, $sym72$SOUGHT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject get_ie_market_position_on_sale(final SubLObject ie_market_position)
  {
    return classes.subloop_get_access_protected_instance_slot( ie_market_position, ONE_INTEGER, $sym73$ON_SALE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject set_ie_market_position_on_sale(final SubLObject ie_market_position, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( ie_market_position, value, ONE_INTEGER, $sym73$ON_SALE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject subloop_reserved_initialize_ie_market_position_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject subloop_reserved_initialize_ie_market_position_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym67$IE_MARKET_POSITION, $sym73$ON_SALE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym67$IE_MARKET_POSITION, $sym72$SOUGHT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym67$IE_MARKET_POSITION, $sym71$FUNDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym67$IE_MARKET_POSITION, $sym70$BINDER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym67$IE_MARKET_POSITION, $sym69$SUPPORTS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
  public static SubLObject ie_market_position_p(final SubLObject ie_market_position)
  {
    return classes.subloop_instanceof_class( ie_market_position, $sym67$IE_MARKET_POSITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
  public static SubLObject get_variable_dictionary_dictionary(final SubLObject variable_dictionary)
  {
    return classes.subloop_get_access_protected_instance_slot( variable_dictionary, ONE_INTEGER, $sym78$DICTIONARY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
  public static SubLObject set_variable_dictionary_dictionary(final SubLObject variable_dictionary, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( variable_dictionary, value, ONE_INTEGER, $sym78$DICTIONARY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
  public static SubLObject subloop_reserved_initialize_variable_dictionary_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
  public static SubLObject subloop_reserved_initialize_variable_dictionary_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym7$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym8$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym76$VARIABLE_DICTIONARY, $sym78$DICTIONARY, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
  public static SubLObject variable_dictionary_p(final SubLObject variable_dictionary)
  {
    return classes.subloop_instanceof_class( variable_dictionary, $sym76$VARIABLE_DICTIONARY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6607L)
  public static SubLObject variable_dictionary_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6711L)
  public static SubLObject variable_dictionary_keys_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_variable_dictionary_method = NIL;
    final SubLObject v_dictionary = get_variable_dictionary_dictionary( self );
    try
    {
      thread.throwStack.push( $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, dictionary.dictionary_keys( v_dictionary ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_variable_dictionary_dictionary( self, v_dictionary );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_variable_dictionary_method = Errors.handleThrowable( ccatch_env_var, $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_variable_dictionary_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6809L)
  public static SubLObject variable_dictionary_find_variable_taxonomic_pred_method(final SubLObject self, final SubLObject var, final SubLObject taxpred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_variable_dictionary_method = NIL;
    final SubLObject v_dictionary = get_variable_dictionary_dictionary( self );
    try
    {
      thread.throwStack.push( $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cycl_variables.hl_varP( var ) && NIL == cycl_variables.el_varP( var ) )
        {
          Errors.error( $str92$___S_is_not_a_variable_, var );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( taxpred, $list93, UNPROVIDED, UNPROVIDED ) )
        {
          Errors.error( $str94$___S_is_not_a_taxonomic_predicate, taxpred );
        }
        final SubLObject literals = dictionary.dictionary_lookup( v_dictionary, var, UNPROVIDED );
        SubLObject types = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pred = el_utilities.literal_arg0( literal, UNPROVIDED );
          SubLObject type = NIL;
          if( taxpred.eql( pred ) && var.eql( el_utilities.literal_arg1( literal, UNPROVIDED ) ) )
          {
            type = el_utilities.literal_arg2( literal, UNPROVIDED );
          }
          if( NIL != cycl_variables.hl_varP( type ) || NIL != cycl_variables.el_varP( type ) )
          {
            type = methods.funcall_instance_method_with_2_args( self, $sym87$FIND_VARIABLE_TAXONOMIC_PRED, type, $const95$genls );
          }
          if( NIL != type )
          {
            final SubLObject item_var = type;
            if( NIL == conses_high.member( item_var, types, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              types = ConsesLow.cons( item_var, types );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          literal = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, types );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_variable_dictionary_dictionary( self, v_dictionary );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_variable_dictionary_method = Errors.handleThrowable( ccatch_env_var, $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_variable_dictionary_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 7502L)
  public static SubLObject variable_dictionary_pprint_method(final SubLObject self, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_variable_dictionary_method = NIL;
    final SubLObject v_dictionary = get_variable_dictionary_dictionary( self );
    try
    {
      thread.throwStack.push( $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD );
      try
      {
        dictionary_utilities.print_dictionary_contents( v_dictionary, stream );
        Dynamic.sublisp_throw( $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_variable_dictionary_dictionary( self, v_dictionary );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_variable_dictionary_method = Errors.handleThrowable( ccatch_env_var, $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_variable_dictionary_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 7646L)
  public static SubLObject new_variable_dictionary(final SubLObject formula)
  {
    final SubLObject v_new = object.new_class_instance( $sym76$VARIABLE_DICTIONARY );
    final SubLObject literals = Functions.apply( $sym102$APPEND, assertions_high.assertion_cnf( formula ) );
    final SubLObject variables_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = el_utilities.literal_terms( literal, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        if( NIL != cycl_variables.hl_varP( v_term ) || NIL != cycl_variables.el_varP( v_term ) )
        {
          dictionary_utilities.dictionary_push( variables_dict, v_term, literal );
        }
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        v_term = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    instances.set_slot( v_new, $sym78$DICTIONARY, variables_dict );
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 8081L)
  public static SubLObject get_word_graph_connected_path_terms(final SubLObject content_terms, SubLObject corpus)
  {
    if( corpus == UNPROVIDED )
    {
      corpus = NIL;
    }
    assert NIL != Types.consp( content_terms ) : content_terms;
    assert NIL != Types.stringp( corpus ) : corpus;
    return methods.funcall_instance_method_with_1_args( graph.make_graph_from_string_lists( external_interfaces.get_word_graph( content_terms, ConsesLow.list( ConsesLow.list( $str104$index, corpus ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), $sym105$GET_PATH_LABELS, content_terms );
  }

  public static SubLObject declare_information_extraction_file()
  {
    SubLFiles.declareFunction( me, "get_information_extraction_node_cycl_denotations", "GET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_information_extraction_node_cycl_denotations", "SET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_extraction_node_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_extraction_node_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_node_p", "INFORMATION-EXTRACTION-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_node_initialize_method", "INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_node_cycl_denots_method", "INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_node_extract_cycl_method", "INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "information_extraction_node_print_method", "INFORMATION-EXTRACTION-NODE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "new_information_extraction_node", "NEW-INFORMATION-EXTRACTION-NODE", 1, 1, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_extraction_graph_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_information_extraction_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_graph_p", "INFORMATION-EXTRACTION-GRAPH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_graph_initialize_method", "INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_graph_accept_node_method", "INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "information_extraction_graph_find_events_method", "INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_information_extraction_graph", "NEW-INFORMATION-EXTRACTION-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ie_market_position_supports", "GET-IE-MARKET-POSITION-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ie_market_position_supports", "SET-IE-MARKET-POSITION-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ie_market_position_binder", "GET-IE-MARKET-POSITION-BINDER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ie_market_position_binder", "SET-IE-MARKET-POSITION-BINDER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ie_market_position_funds", "GET-IE-MARKET-POSITION-FUNDS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ie_market_position_funds", "SET-IE-MARKET-POSITION-FUNDS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ie_market_position_sought", "GET-IE-MARKET-POSITION-SOUGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ie_market_position_sought", "SET-IE-MARKET-POSITION-SOUGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ie_market_position_on_sale", "GET-IE-MARKET-POSITION-ON-SALE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ie_market_position_on_sale", "SET-IE-MARKET-POSITION-ON-SALE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_ie_market_position_class", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_ie_market_position_instance", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "ie_market_position_p", "IE-MARKET-POSITION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_variable_dictionary_dictionary", "GET-VARIABLE-DICTIONARY-DICTIONARY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_variable_dictionary_dictionary", "SET-VARIABLE-DICTIONARY-DICTIONARY", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_variable_dictionary_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_variable_dictionary_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_dictionary_p", "VARIABLE-DICTIONARY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_dictionary_initialize_method", "VARIABLE-DICTIONARY-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_dictionary_keys_method", "VARIABLE-DICTIONARY-KEYS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_dictionary_find_variable_taxonomic_pred_method", "VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "variable_dictionary_pprint_method", "VARIABLE-DICTIONARY-PPRINT-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "new_variable_dictionary", "NEW-VARIABLE-DICTIONARY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_word_graph_connected_path_terms", "GET-WORD-GRAPH-CONNECTED-PATH-TERMS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_information_extraction_file()
  {
    return NIL;
  }

  public static SubLObject setup_information_extraction_file()
  {
    classes.subloop_new_class( $sym0$INFORMATION_EXTRACTION_NODE, $sym1$GRAPH_NODE, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$INFORMATION_EXTRACTION_NODE, NIL );
    classes.subloop_note_class_initialization_function( $sym0$INFORMATION_EXTRACTION_NODE, $sym6$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$INFORMATION_EXTRACTION_NODE, $sym12$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE );
    subloop_reserved_initialize_information_extraction_node_class( $sym0$INFORMATION_EXTRACTION_NODE );
    methods.methods_incorporate_instance_method( $sym13$INITIALIZE, $sym0$INFORMATION_EXTRACTION_NODE, $list14, NIL, $list15 );
    methods.subloop_register_instance_method( $sym0$INFORMATION_EXTRACTION_NODE, $sym13$INITIALIZE, $sym16$INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym17$CYCL_DENOTS, $sym0$INFORMATION_EXTRACTION_NODE, $list14, NIL, $list18 );
    methods.subloop_register_instance_method( $sym0$INFORMATION_EXTRACTION_NODE, $sym17$CYCL_DENOTS, $sym20$INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD );
    methods.methods_incorporate_instance_method( $sym21$EXTRACT_CYCL, $sym0$INFORMATION_EXTRACTION_NODE, $list22, $list23, $list24 );
    methods.subloop_register_instance_method( $sym0$INFORMATION_EXTRACTION_NODE, $sym21$EXTRACT_CYCL, $sym27$INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD );
    methods.methods_incorporate_instance_method( $sym28$PRINT, $sym0$INFORMATION_EXTRACTION_NODE, $list14, $list29, $list30 );
    methods.subloop_register_instance_method( $sym0$INFORMATION_EXTRACTION_NODE, $sym28$PRINT, $sym35$INFORMATION_EXTRACTION_NODE_PRINT_METHOD );
    classes.subloop_new_class( $sym39$INFORMATION_EXTRACTION_GRAPH, $sym40$GRAPH, NIL, NIL, $list41 );
    classes.class_set_implements_slot_listeners( $sym39$INFORMATION_EXTRACTION_GRAPH, NIL );
    classes.subloop_note_class_initialization_function( $sym39$INFORMATION_EXTRACTION_GRAPH, $sym42$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS );
    classes.subloop_note_instance_initialization_function( $sym39$INFORMATION_EXTRACTION_GRAPH, $sym51$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE );
    subloop_reserved_initialize_information_extraction_graph_class( $sym39$INFORMATION_EXTRACTION_GRAPH );
    methods.methods_incorporate_instance_method( $sym13$INITIALIZE, $sym39$INFORMATION_EXTRACTION_GRAPH, $list14, NIL, $list52 );
    methods.subloop_register_instance_method( $sym39$INFORMATION_EXTRACTION_GRAPH, $sym13$INITIALIZE, $sym53$INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym54$ACCEPT_NODE, $sym39$INFORMATION_EXTRACTION_GRAPH, $list14, $list55, $list56 );
    methods.subloop_register_instance_method( $sym39$INFORMATION_EXTRACTION_GRAPH, $sym54$ACCEPT_NODE, $sym57$INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD );
    methods.methods_incorporate_instance_method( $sym58$FIND_EVENTS, $sym39$INFORMATION_EXTRACTION_GRAPH, $list14, NIL, $list59 );
    methods.subloop_register_instance_method( $sym39$INFORMATION_EXTRACTION_GRAPH, $sym58$FIND_EVENTS, $sym61$INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD );
    classes.subloop_new_class( $sym67$IE_MARKET_POSITION, $sym4$OBJECT, NIL, NIL, $list68 );
    classes.class_set_implements_slot_listeners( $sym67$IE_MARKET_POSITION, NIL );
    classes.subloop_note_class_initialization_function( $sym67$IE_MARKET_POSITION, $sym74$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym67$IE_MARKET_POSITION, $sym75$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE );
    subloop_reserved_initialize_ie_market_position_class( $sym67$IE_MARKET_POSITION );
    classes.subloop_new_class( $sym76$VARIABLE_DICTIONARY, $sym4$OBJECT, NIL, NIL, $list77 );
    classes.class_set_implements_slot_listeners( $sym76$VARIABLE_DICTIONARY, NIL );
    classes.subloop_note_class_initialization_function( $sym76$VARIABLE_DICTIONARY, $sym79$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym76$VARIABLE_DICTIONARY, $sym80$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE );
    subloop_reserved_initialize_variable_dictionary_class( $sym76$VARIABLE_DICTIONARY );
    methods.methods_incorporate_instance_method( $sym13$INITIALIZE, $sym76$VARIABLE_DICTIONARY, $list14, NIL, $list81 );
    methods.subloop_register_instance_method( $sym76$VARIABLE_DICTIONARY, $sym13$INITIALIZE, $sym82$VARIABLE_DICTIONARY_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym83$KEYS, $sym76$VARIABLE_DICTIONARY, $list22, NIL, $list84 );
    methods.subloop_register_instance_method( $sym76$VARIABLE_DICTIONARY, $sym83$KEYS, $sym86$VARIABLE_DICTIONARY_KEYS_METHOD );
    methods.methods_incorporate_instance_method( $sym87$FIND_VARIABLE_TAXONOMIC_PRED, $sym76$VARIABLE_DICTIONARY, $list88, $list89, $list90 );
    methods.subloop_register_instance_method( $sym76$VARIABLE_DICTIONARY, $sym87$FIND_VARIABLE_TAXONOMIC_PRED, $sym96$VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD );
    methods.methods_incorporate_instance_method( $sym97$PPRINT, $sym76$VARIABLE_DICTIONARY, $list22, $list98, $list99 );
    methods.subloop_register_instance_method( $sym76$VARIABLE_DICTIONARY, $sym97$PPRINT, $sym101$VARIABLE_DICTIONARY_PPRINT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_information_extraction_file();
  }

  @Override
  public void initializeVariables()
  {
    init_information_extraction_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_information_extraction_file();
  }
  static
  {
    me = new information_extraction();
    $sym0$INFORMATION_EXTRACTION_NODE = makeSymbol( "INFORMATION-EXTRACTION-NODE" );
    $sym1$GRAPH_NODE = makeSymbol( "GRAPH-NODE" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYCL-DENOTATIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "COMPUTE-CYCL-DENOTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT-CYCL" ), ConsesLow.list( makeSymbol( "FILTERS" ) ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$CYCL_DENOTATIONS = makeSymbol( "CYCL-DENOTATIONS" );
    $sym4$OBJECT = makeSymbol( "OBJECT" );
    $sym5$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym6$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS" );
    $sym7$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym8$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym9$CORE = makeSymbol( "CORE" );
    $sym10$ID = makeSymbol( "ID" );
    $sym11$LABEL = makeSymbol( "LABEL" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE" );
    $sym13$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list14 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list15 = ConsesLow.list( makeString( "@return information-extraction-node-p\n   Crates a new information-extraction-node object" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym16$INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD = makeSymbol( "INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD" );
    $sym17$CYCL_DENOTS = makeSymbol( "CYCL-DENOTS" );
    $list18 = ConsesLow.list( makeString( "@return listp\n   Returns a list of Cyc denotations of the label of this node, if any." ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYCL-DENOTATIONS" ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "CYCL-DENOTATIONS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LABEL" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL-DENOTATIONS" ), ConsesLow
            .list( makeSymbol( "NL-TRIE-ALL-DENOTS-OF-STRING" ), makeSymbol( "LABEL" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCL-DENOTATIONS" ) ) );
    $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD" );
    $sym20$INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD = makeSymbol( "INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD" );
    $sym21$EXTRACT_CYCL = makeSymbol( "EXTRACT-CYCL" );
    $list22 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list23 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "FILTERS" ) );
    $list24 = ConsesLow.list( makeString(
        "@param FILTERS listp, expected to be a list of fort-p\n   @return listp\n   Returns all the elements of this node's cycl-denotations slot which are subsumed\n   by all the elements of FILTERS." ), ConsesLow
            .list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "FILTERS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FILTERS" ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "CYCL-DENOTATIONS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                    makeSymbol( "TERM" ), makeSymbol( "CYCL-DENOTATIONS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list(
                        makeSymbol( "FILTER" ), makeSymbol( "FILTERS" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                            makeSymbol( "MORE-SPECIFIC-P" ), makeSymbol( "TERM" ), makeSymbol( "FILTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                makeSymbol( "TERM" ), makeSymbol( "FILTERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FILTERED" ) ) ) );
    $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD" );
    $sym26$LISTP = makeSymbol( "LISTP" );
    $sym27$INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD = makeSymbol( "INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD" );
    $sym28$PRINT = makeSymbol( "PRINT" );
    $list29 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list30 = ConsesLow.list( makeString( "@param STREAM streamp\n   @param DEPTH integerp\n   Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol(
        "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<IEN: " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol( "LABEL" ), makeSymbol( "STREAM" ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYCL-DENOTATIONS" ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( " -> " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
            ConsesLow.list( makeSymbol( "PRIN1-TO-STRING" ), makeSymbol( "CYCL-DENOTATIONS" ) ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ) );
    $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD" );
    $str32$__IEN__ = makeString( "#<IEN: " );
    $str33$____ = makeString( " -> " );
    $str34$_ = makeString( ">" );
    $sym35$INFORMATION_EXTRACTION_NODE_PRINT_METHOD = makeSymbol( "INFORMATION-EXTRACTION-NODE-PRINT-METHOD" );
    $sym36$STRINGP = makeSymbol( "STRINGP" );
    $sym37$SET_LABEL = makeSymbol( "SET-LABEL" );
    $sym38$SET_ID = makeSymbol( "SET-ID" );
    $sym39$INFORMATION_EXTRACTION_GRAPH = makeSymbol( "INFORMATION-EXTRACTION-GRAPH" );
    $sym40$GRAPH = makeSymbol( "GRAPH" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ACCEPT-NODE" ), ConsesLow.list( makeSymbol( "NEW-NODE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym42$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS" );
    $sym43$NAME = makeSymbol( "NAME" );
    $sym44$INTEGER_SEQUENCE_GENERATOR = makeSymbol( "INTEGER-SEQUENCE-GENERATOR" );
    $sym45$LABEL_NODE_MAP = makeSymbol( "LABEL-NODE-MAP" );
    $sym46$NODES = makeSymbol( "NODES" );
    $sym47$LABEL_EDGE_MAP = makeSymbol( "LABEL-EDGE-MAP" );
    $sym48$EDGES_SOURCE = makeSymbol( "EDGES-SOURCE" );
    $sym49$EDGES_TARGET = makeSymbol( "EDGES-TARGET" );
    $sym50$CORE_NODE_MAP = makeSymbol( "CORE-NODE-MAP" );
    $sym51$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE" );
    $list52 = ConsesLow.list( makeString( "@return information-extraction-graph-p\n   Returns a new information-extraction-graph object" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym53$INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD = makeSymbol( "INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD" );
    $sym54$ACCEPT_NODE = makeSymbol( "ACCEPT-NODE" );
    $list55 = ConsesLow.list( makeSymbol( "NEW-NODE" ) );
    $list56 = ConsesLow.list( makeString( "@param NEW-NODE information-extraction-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise." ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
        .list( makeSymbol( "INFORMATION-EXTRACTION-NODE-P" ), makeSymbol( "NEW-NODE" ) ) ) );
    $sym57$INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD = makeSymbol( "INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD" );
    $sym58$FIND_EVENTS = makeSymbol( "FIND-EVENTS" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EVENTS" ), NIL ) ), ConsesLow.list( makeSymbol( "DO-GRAPH-NODES" ), ConsesLow.list( makeSymbol( "NODE" ),
        makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NODE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EXTRACT-CYCL" ) ), ConsesLow.list(
            makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ) ) ), makeSymbol( "EVENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "EVENTS" ) ) ) );
    $list60 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Event" ) ) );
    $sym61$INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD = makeSymbol( "INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD" );
    $sym62$GET_NODE_BY_LABEL = makeSymbol( "GET-NODE-BY-LABEL" );
    $sym63$ADD_NODE = makeSymbol( "ADD-NODE" );
    $sym64$ADD_EDGE = makeSymbol( "ADD-EDGE" );
    $sym65$GRAPH_EDGE = makeSymbol( "GRAPH-EDGE" );
    $sym66$MAKE_EDGE = makeSymbol( "MAKE-EDGE" );
    $sym67$IE_MARKET_POSITION = makeSymbol( "IE-MARKET-POSITION" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "ON-SALE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "SOUGHT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
        ConsesLow.list( makeSymbol( "FUNDS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "BINDER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list(
            makeSymbol( "SUPPORTS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ) );
    $sym69$SUPPORTS = makeSymbol( "SUPPORTS" );
    $sym70$BINDER = makeSymbol( "BINDER" );
    $sym71$FUNDS = makeSymbol( "FUNDS" );
    $sym72$SOUGHT = makeSymbol( "SOUGHT" );
    $sym73$ON_SALE = makeSymbol( "ON-SALE" );
    $sym74$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS" );
    $sym75$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE" );
    $sym76$VARIABLE_DICTIONARY = makeSymbol( "VARIABLE-DICTIONARY" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "DICTIONARY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL,
        makeKeyword( "PROTECTED" ) ) );
    $sym78$DICTIONARY = makeSymbol( "DICTIONARY" );
    $sym79$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS" );
    $sym80$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym82$VARIABLE_DICTIONARY_INITIALIZE_METHOD = makeSymbol( "VARIABLE-DICTIONARY-INITIALIZE-METHOD" );
    $sym83$KEYS = makeSymbol( "KEYS" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-KEYS" ), makeSymbol( "DICTIONARY" ) ) ) );
    $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD" );
    $sym86$VARIABLE_DICTIONARY_KEYS_METHOD = makeSymbol( "VARIABLE-DICTIONARY-KEYS-METHOD" );
    $sym87$FIND_VARIABLE_TAXONOMIC_PRED = makeSymbol( "FIND-VARIABLE-TAXONOMIC-PRED" );
    $list88 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list89 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TAXPRED" ) );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "HL-VAR?" ), makeSymbol( "VAR" ) ), ConsesLow.list( makeSymbol( "EL-VAR?" ),
        makeSymbol( "VAR" ) ) ), makeString( "~%~S is not a variable!" ), makeSymbol( "VAR" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "TAXPRED" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) ) ) ), makeString(
                "~%~S is not a taxonomic predicate!" ), makeSymbol( "TAXPRED" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LITERALS" ), ConsesLow.list( makeSymbol(
                    "DICTIONARY-LOOKUP" ), makeSymbol( "DICTIONARY" ), makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "TYPES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                        "LITERAL" ), makeSymbol( "LITERALS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "LITERAL-ARG0" ), makeSymbol(
                            "LITERAL" ) ) ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQL, makeSymbol( "TAXPRED" ), makeSymbol( "PRED" ) ),
                                ConsesLow.list( EQL, makeSymbol( "VAR" ), ConsesLow.list( makeSymbol( "LITERAL-ARG1" ), makeSymbol( "LITERAL" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPE" ),
                                    ConsesLow.list( makeSymbol( "LITERAL-ARG2" ), makeSymbol( "LITERAL" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol(
                                        "HL-VAR?" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeSymbol( "EL-VAR?" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPE" ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-VARIABLE-TAXONOMIC-PRED" ) ), makeSymbol( "TYPE" ), constant_handles
                                                .reader_make_constant_shell( makeString( "genls" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "CPUSHNEW" ),
                                                    makeSymbol( "TYPE" ), makeSymbol( "TYPES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TYPES" ) ) ) );
    $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD" );
    $str92$___S_is_not_a_variable_ = makeString( "~%~S is not a variable!" );
    $list93 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $str94$___S_is_not_a_taxonomic_predicate = makeString( "~%~S is not a taxonomic predicate!" );
    $const95$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym96$VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD = makeSymbol( "VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD" );
    $sym97$PPRINT = makeSymbol( "PPRINT" );
    $list98 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STREAM" ), T ) );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRINT-DICTIONARY-CONTENTS" ), makeSymbol( "DICTIONARY" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD" );
    $sym101$VARIABLE_DICTIONARY_PPRINT_METHOD = makeSymbol( "VARIABLE-DICTIONARY-PPRINT-METHOD" );
    $sym102$APPEND = makeSymbol( "APPEND" );
    $sym103$CONSP = makeSymbol( "CONSP" );
    $str104$index = makeString( "index" );
    $sym105$GET_PATH_LABELS = makeSymbol( "GET-PATH-LABELS" );
  }
}
/*
 * 
 * Total time: 285 ms synthetic
 */