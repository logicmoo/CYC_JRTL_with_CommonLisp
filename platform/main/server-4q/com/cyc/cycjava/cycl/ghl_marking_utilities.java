package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_marking_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ghl_marking_utilities";
  public static final String myFingerPrint = "ce0ccdc217bc742913db67916c5e9b97a49415c798ed92e6e465ecde8046a959";
  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 935L)
  public static SubLSymbol $ghl_table$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1001L)
  public static SubLSymbol $use_zero_size_ghl_marking_spacesP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$WITH_GHL_TABLE_VAR;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CDOHASH;
  private static final SubLInteger $int8$200;

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1089L)
  public static SubLObject with_ghl_table_var(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( reader.bq_cons( var, $list2 ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1228L)
  public static SubLObject with_new_ghl_table_named(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$CLET, $list4, ConsesLow.listS( $sym5$WITH_GHL_TABLE_VAR, name, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1471L)
  public static SubLObject with_new_ghl_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1645L)
  public static SubLObject do_ghl_marking_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key_var = NIL;
    SubLObject marking_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    key_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    marking_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym7$CDOHASH, ConsesLow.listS( key_var, marking_var, $list2 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1785L)
  public static SubLObject ghl_marking_table_marked_nodes()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nodes = NIL;
    final SubLObject cdohash_table = $ghl_table$.getDynamicValue( thread );
    SubLObject node = NIL;
    SubLObject marking = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        node = Hashtables.getEntryKey( cdohash_entry );
        marking = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != marking )
        {
          nodes = ConsesLow.cons( node, nodes );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1953L)
  public static SubLObject ghl_instantiate_new_space()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.make_hash_table( ( NIL != $use_zero_size_ghl_marking_spacesP$.getDynamicValue( thread ) ) ? ZERO_INTEGER : $int8$200, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2091L)
  public static SubLObject get_ghl_marking(final SubLObject v_search, final SubLObject node)
  {
    return Hashtables.gethash( node, ghl_search_vars.ghl_space( v_search ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2218L)
  public static SubLObject get_ghl_goal_marking(final SubLObject v_search, final SubLObject node)
  {
    return Hashtables.gethash( node, ghl_search_vars.ghl_goal_space( v_search ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2320L)
  public static SubLObject ghl_marked_node_p(final SubLObject v_search, final SubLObject node)
  {
    return list_utilities.sublisp_boolean( get_ghl_marking( v_search, node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2420L)
  public static SubLObject ghl_goal_marked_node_p(final SubLObject v_search, final SubLObject node)
  {
    return list_utilities.sublisp_boolean( get_ghl_goal_marking( v_search, node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2530L)
  public static SubLObject ghl_node_marked_in_space_p(final SubLObject node, final SubLObject space)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash( node, space, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2629L)
  public static SubLObject ghl_mark_node_in_space(final SubLObject node, final SubLObject mark, final SubLObject space)
  {
    Hashtables.sethash( node, space, mark );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2744L)
  public static SubLObject ghl_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark)
  {
    final SubLObject space = ghl_search_vars.ghl_space( v_search );
    ghl_mark_node_in_space( node, mark, space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2892L)
  public static SubLObject ghl_goal_mark_node(final SubLObject v_search, final SubLObject node, final SubLObject mark)
  {
    final SubLObject space = ghl_search_vars.ghl_goal_space( v_search );
    ghl_mark_node_in_space( node, mark, space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3050L)
  public static SubLObject ghl_mark_node_in_ghl_table(final SubLObject node, final SubLObject mark)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    ghl_mark_node_in_space( node, mark, $ghl_table$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3170L)
  public static SubLObject ghl_unmark_node(final SubLObject v_search, final SubLObject node)
  {
    ghl_mark_node( v_search, node, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3266L)
  public static SubLObject ghl_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth)
  {
    final SubLObject marking = get_ghl_marking( v_search, node );
    if( marking.isInteger() )
    {
      return Numbers.numGE( marking, depth );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3520L)
  public static SubLObject ghl_goal_node_with_equal_or_shallower_depth_p(final SubLObject v_search, final SubLObject node, final SubLObject depth)
  {
    final SubLObject marking = get_ghl_goal_marking( v_search, node );
    if( marking.isInteger() )
    {
      return Numbers.numGE( marking, depth );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 3784L)
  public static SubLObject prepend_to_ghl_marking_state(final SubLObject v_search, final SubLObject node, final SubLObject marking)
  {
    final SubLObject space = ghl_search_vars.ghl_space( v_search );
    hash_table_utilities.push_hash( node, marking, space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 4000L)
  public static SubLObject ghl_goal_mark_node_as_searched(final SubLObject v_search, final SubLObject node)
  {
    ghl_goal_mark_node( v_search, node, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-marking-utilities.lisp", position = 4114L)
  public static SubLObject ghl_marked_cardinality(final SubLObject space)
  {
    return Hashtables.hash_table_count( space );
  }

  public static SubLObject declare_ghl_marking_utilities_file()
  {
    SubLFiles.declareMacro( me, "with_ghl_table_var", "WITH-GHL-TABLE-VAR" );
    SubLFiles.declareMacro( me, "with_new_ghl_table_named", "WITH-NEW-GHL-TABLE-NAMED" );
    SubLFiles.declareMacro( me, "with_new_ghl_table", "WITH-NEW-GHL-TABLE" );
    SubLFiles.declareMacro( me, "do_ghl_marking_table", "DO-GHL-MARKING-TABLE" );
    SubLFiles.declareFunction( me, "ghl_marking_table_marked_nodes", "GHL-MARKING-TABLE-MARKED-NODES", 0, 0, false );
    SubLFiles.declareFunction( me, "ghl_instantiate_new_space", "GHL-INSTANTIATE-NEW-SPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "get_ghl_marking", "GET-GHL-MARKING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ghl_goal_marking", "GET-GHL-GOAL-MARKING", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_marked_node_p", "GHL-MARKED-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_marked_node_p", "GHL-GOAL-MARKED-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_node_marked_in_space_p", "GHL-NODE-MARKED-IN-SPACE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_mark_node_in_space", "GHL-MARK-NODE-IN-SPACE", 3, 0, false );
    SubLFiles.declareFunction( me, "ghl_mark_node", "GHL-MARK-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_mark_node", "GHL-GOAL-MARK-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "ghl_mark_node_in_ghl_table", "GHL-MARK-NODE-IN-GHL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_unmark_node", "GHL-UNMARK-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_node_with_equal_or_shallower_depth_p", "GHL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_node_with_equal_or_shallower_depth_p", "GHL-GOAL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false );
    SubLFiles.declareFunction( me, "prepend_to_ghl_marking_state", "PREPEND-TO-GHL-MARKING-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_mark_node_as_searched", "GHL-GOAL-MARK-NODE-AS-SEARCHED", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_marked_cardinality", "GHL-MARKED-CARDINALITY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_ghl_marking_utilities_file()
  {
    $ghl_table$ = SubLFiles.defparameter( "*GHL-TABLE*", NIL );
    $use_zero_size_ghl_marking_spacesP$ = SubLFiles.defparameter( "*USE-ZERO-SIZE-GHL-MARKING-SPACES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_ghl_marking_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ghl_marking_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ghl_marking_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ghl_marking_utilities_file();
  }
  static
  {
    me = new ghl_marking_utilities();
    $ghl_table$ = null;
    $use_zero_size_ghl_marking_spacesP$ = null;
    $list0 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( makeSymbol( "*GHL-TABLE*" ) );
    $list3 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GHL-TABLE*" ), ConsesLow.list( makeSymbol( "GHL-INSTANTIATE-NEW-SPACE" ) ) ) );
    $sym5$WITH_GHL_TABLE_VAR = makeSymbol( "WITH-GHL-TABLE-VAR" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY-VAR" ), makeSymbol( "MARKING-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$CDOHASH = makeSymbol( "CDOHASH" );
    $int8$200 = makeInteger( 200 );
  }
}
/*
 * 
 * Total time: 96 ms
 * 
 */