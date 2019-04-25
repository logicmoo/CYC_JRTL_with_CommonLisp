package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sg_search
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sg_search";
  public static final String myFingerPrint = "20abba4feb618e29f35949b5031159cf04c8bc05b8180dee40f811b91106e613";
  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 979L)
  private static SubLSymbol $sg_container_accessor_table$;
  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2410L)
  private static SubLSymbol $sg_search_valid_types$;
  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2631L)
  private static SubLSymbol $sg_search_type_container_map$;
  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2890L)
  public static SubLSymbol $sg_current_node$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$SEARCH_TYPE;
  private static final SubLSymbol $kw5$PRIORITY_QUEUE;
  private static final SubLSymbol $kw6$RANKING_FUNCTION;
  private static final SubLSymbol $sym7$_;
  private static final SubLSymbol $kw8$SG_SEARCH_TYPE;
  private static final SubLString $str9$__SG_SEARCH__TYPE__a_;
  private static final SubLSymbol $kw10$EXPAND_FUNCTION;
  private static final SubLSymbol $kw11$DEPTH_EXCEDED_FUNCTION;
  private static final SubLSymbol $kw12$OPTIONS_FUNCTION;
  private static final SubLSymbol $kw13$GOAL_FUNCTION;
  private static final SubLSymbol $kw14$ADD_GOAL_FUNCTION;
  private static final SubLSymbol $kw15$ACTIVE_MODULES;
  private static final SubLSymbol $sym16$SG_CONTAINER_EMPTY_P;
  private static final SubLSymbol $sym17$SG_CONTAINER_NEXT_NODE;
  private static final SubLSymbol $sym18$SG_CONTAINER_ADD;
  private static final SubLSymbol $sym19$SG_PRINT_SEARCH;

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 1418L)
  public static SubLObject sg_container_type(final SubLObject container)
  {
    final SubLObject doneP = NIL;
    SubLObject result = NIL;
    SubLObject rest;
    SubLObject cons;
    SubLObject current;
    SubLObject datum;
    SubLObject type;
    SubLObject func_list;
    for( rest = NIL, rest = $sg_container_accessor_table$.getGlobalValue(); NIL == doneP && NIL != rest; rest = rest.rest() )
    {
      cons = rest.first();
      datum = ( current = cons );
      type = NIL;
      func_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
      type = current.first();
      current = ( func_list = current.rest() );
      if( NIL != Functions.funcall( func_list.first(), container ) )
      {
        result = type;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 1672L)
  public static SubLObject sg_create_container(final SubLObject type)
  {
    final SubLObject func = conses_high.sixth( conses_high.assoc( type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    return Functions.funcall( func );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 1813L)
  public static SubLObject sg_container_empty_p(final SubLObject container)
  {
    final SubLObject type = sg_container_type( container );
    final SubLObject pred = conses_high.third( conses_high.assoc( type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    return Functions.funcall( pred, container );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2014L)
  public static SubLObject sg_container_add(final SubLObject item, final SubLObject container)
  {
    final SubLObject type = sg_container_type( container );
    final SubLObject pred = conses_high.fourth( conses_high.assoc( type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    return Functions.funcall( pred, item, container );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2217L)
  public static SubLObject sg_container_next(final SubLObject container)
  {
    final SubLObject type = sg_container_type( container );
    final SubLObject pred = conses_high.fifth( conses_high.assoc( type, $sg_container_accessor_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    return Functions.funcall( pred, container );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2537L)
  public static SubLObject sg_valid_search_type_p(final SubLObject type)
  {
    return conses_high.member( type, $sg_search_valid_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 2779L)
  public static SubLObject sg_search_type_container(final SubLObject type)
  {
    return conses_high.second( conses_high.assoc( type, $sg_search_type_container_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3083L)
  public static SubLObject sg_container_next_node(final SubLObject container)
  {
    final SubLObject next_node = sg_container_next( container );
    return Values.values( next_node, container );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3230L)
  public static SubLObject sg_search_create_container(final SubLObject v_search, final SubLObject search_properties)
  {
    final SubLObject type = conses_high.getf( search_properties, $kw4$SEARCH_TYPE, UNPROVIDED );
    final SubLObject container_type = sg_search_type_container( type );
    SubLObject container = NIL;
    final SubLObject pcase_var = container_type;
    if( pcase_var.eql( $kw5$PRIORITY_QUEUE ) )
    {
      final SubLObject ranking_func = conses_high.getf( search_properties, $kw6$RANKING_FUNCTION, UNPROVIDED );
      container = queues.create_p_queue( NIL, ranking_func, Symbols.symbol_function( $sym7$_ ) );
    }
    else
    {
      container = sg_create_container( container_type );
    }
    search._csetf_search_leaves( v_search, container );
    return v_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3788L)
  public static SubLObject sg_search_type(final SubLObject v_search)
  {
    return conses_high.getf( search.search_state( v_search ), $kw8$SG_SEARCH_TYPE, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 3891L)
  public static SubLObject sg_print_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str9$__SG_SEARCH__TYPE__a_, sg_search_type( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sg-search.lisp", position = 4045L)
  public static SubLObject new_sg_search(SubLObject state, final SubLObject search_properties)
  {
    final SubLObject type = conses_high.getf( search_properties, $kw4$SEARCH_TYPE, UNPROVIDED );
    final SubLObject expand = conses_high.getf( search_properties, $kw10$EXPAND_FUNCTION, UNPROVIDED );
    final SubLObject too_deep_p = conses_high.getf( search_properties, $kw11$DEPTH_EXCEDED_FUNCTION, UNPROVIDED );
    final SubLObject options = conses_high.getf( search_properties, $kw12$OPTIONS_FUNCTION, UNPROVIDED );
    final SubLObject goal_p = conses_high.getf( search_properties, $kw13$GOAL_FUNCTION, UNPROVIDED );
    final SubLObject add_goal = conses_high.getf( search_properties, $kw14$ADD_GOAL_FUNCTION, UNPROVIDED );
    final SubLObject active_modules = conses_high.getf( search_properties, $kw15$ACTIVE_MODULES, UNPROVIDED );
    SubLObject v_search = NIL;
    state = conses_high.putf( state, $kw8$SG_SEARCH_TYPE, type );
    state = conses_high.putf( state, $kw15$ACTIVE_MODULES, active_modules );
    v_search = search.new_search( $sym16$SG_CONTAINER_EMPTY_P, $sym17$SG_CONTAINER_NEXT_NODE, goal_p, add_goal, options, expand, $sym18$SG_CONTAINER_ADD, too_deep_p, state, $sym19$SG_PRINT_SEARCH );
    v_search = sg_search_create_container( v_search, search_properties );
    return v_search;
  }

  public static SubLObject declare_sg_search_file()
  {
    SubLFiles.declareFunction( me, "sg_container_type", "SG-CONTAINER-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_create_container", "SG-CREATE-CONTAINER", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_container_empty_p", "SG-CONTAINER-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_container_add", "SG-CONTAINER-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "sg_container_next", "SG-CONTAINER-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_valid_search_type_p", "SG-VALID-SEARCH-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_search_type_container", "SG-SEARCH-TYPE-CONTAINER", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_container_next_node", "SG-CONTAINER-NEXT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_search_create_container", "SG-SEARCH-CREATE-CONTAINER", 2, 0, false );
    SubLFiles.declareFunction( me, "sg_search_type", "SG-SEARCH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sg_print_search", "SG-PRINT-SEARCH", 3, 0, false );
    SubLFiles.declareFunction( me, "new_sg_search", "NEW-SG-SEARCH", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sg_search_file()
  {
    $sg_container_accessor_table$ = SubLFiles.deflexical( "*SG-CONTAINER-ACCESSOR-TABLE*", $list0 );
    $sg_search_valid_types$ = SubLFiles.deflexical( "*SG-SEARCH-VALID-TYPES*", $list2 );
    $sg_search_type_container_map$ = SubLFiles.deflexical( "*SG-SEARCH-TYPE-CONTAINER-MAP*", $list3 );
    $sg_current_node$ = SubLFiles.defparameter( "*SG-CURRENT-NODE*", NIL );
    return NIL;
  }

  public static SubLObject setup_sg_search_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sg_search_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sg_search_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sg_search_file();
  }
  static
  {
    me = new sg_search();
    $sg_container_accessor_table$ = null;
    $sg_search_valid_types$ = null;
    $sg_search_type_container_map$ = null;
    $sg_current_node$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeKeyword( "QUEUE" ), makeSymbol( "QUEUE-P" ), makeSymbol( "QUEUE-EMPTY-P" ), makeSymbol( "ENQUEUE" ), makeSymbol( "DEQUEUE" ), makeSymbol( "CREATE-QUEUE" ) ), ConsesLow
        .list( makeKeyword( "PRIORITY-QUEUE" ), makeSymbol( "PRIORITY-QUEUE-P" ), makeSymbol( "P-QUEUE-EMPTY-P" ), makeSymbol( "P-ENQUEUE" ), makeSymbol( "P-DEQUEUE" ), makeSymbol( "CREATE-P-QUEUE" ) ), ConsesLow.list(
            makeKeyword( "STACK" ), makeSymbol( "STACK-P" ), makeSymbol( "STACK-EMPTY-P" ), makeSymbol( "STACK-PUSH" ), makeSymbol( "STACK-POP" ), makeSymbol( "CREATE-STACK" ) ) );
    $list1 = ConsesLow.cons( makeSymbol( "TYPE" ), makeSymbol( "FUNC-LIST" ) );
    $list2 = ConsesLow.list( makeKeyword( "DEPTH-FIRST" ), makeKeyword( "BEST-FIRST" ), makeKeyword( "BREADTH-FIRST" ) );
    $list3 = ConsesLow.list( ConsesLow.list( makeKeyword( "DEPTH-FIRST" ), makeKeyword( "STACK" ) ), ConsesLow.list( makeKeyword( "BREADTH-FIRST" ), makeKeyword( "QUEUE" ) ), ConsesLow.list( makeKeyword( "BEST-FIRST" ),
        makeKeyword( "PRIORITY-QUEUE" ) ) );
    $kw4$SEARCH_TYPE = makeKeyword( "SEARCH-TYPE" );
    $kw5$PRIORITY_QUEUE = makeKeyword( "PRIORITY-QUEUE" );
    $kw6$RANKING_FUNCTION = makeKeyword( "RANKING-FUNCTION" );
    $sym7$_ = makeSymbol( ">" );
    $kw8$SG_SEARCH_TYPE = makeKeyword( "SG-SEARCH-TYPE" );
    $str9$__SG_SEARCH__TYPE__a_ = makeString( "#<SG-SEARCH :TYPE ~a>" );
    $kw10$EXPAND_FUNCTION = makeKeyword( "EXPAND-FUNCTION" );
    $kw11$DEPTH_EXCEDED_FUNCTION = makeKeyword( "DEPTH-EXCEDED-FUNCTION" );
    $kw12$OPTIONS_FUNCTION = makeKeyword( "OPTIONS-FUNCTION" );
    $kw13$GOAL_FUNCTION = makeKeyword( "GOAL-FUNCTION" );
    $kw14$ADD_GOAL_FUNCTION = makeKeyword( "ADD-GOAL-FUNCTION" );
    $kw15$ACTIVE_MODULES = makeKeyword( "ACTIVE-MODULES" );
    $sym16$SG_CONTAINER_EMPTY_P = makeSymbol( "SG-CONTAINER-EMPTY-P" );
    $sym17$SG_CONTAINER_NEXT_NODE = makeSymbol( "SG-CONTAINER-NEXT-NODE" );
    $sym18$SG_CONTAINER_ADD = makeSymbol( "SG-CONTAINER-ADD" );
    $sym19$SG_PRINT_SEARCH = makeSymbol( "SG-PRINT-SEARCH" );
  }
}
/*
 * 
 * Total time: 31 ms
 * 
 */