package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_search_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ghl_search_vars";
  public static final String myFingerPrint = "74a02bbf3e41132836c275cdb69676ebf133060a2288faff1d7e40962c572ede";
  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 846L)
  private static SubLSymbol $ghl_search_property_defaults$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLSymbol $dtp_ghl_search$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13765L)
  public static SubLSymbol $sksi_gt_search_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13978L)
  public static SubLSymbol $ghl_uses_spec_preds_p$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14578L)
  public static SubLSymbol $gt_args_swapped_p$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14952L)
  public static SubLSymbol $ghl_trace_level$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$GHL_SEARCH;
  private static final SubLSymbol $sym2$GHL_SEARCH_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_GHL_SEARCH;
  private static final SubLSymbol $sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$GHL_SEARCH_GRAPHL_SEARCH;
  private static final SubLSymbol $sym11$_CSETF_GHL_SEARCH_GRAPHL_SEARCH;
  private static final SubLSymbol $sym12$GHL_SEARCH_PREDICATES;
  private static final SubLSymbol $sym13$_CSETF_GHL_SEARCH_PREDICATES;
  private static final SubLSymbol $sym14$GHL_SEARCH_DIRECTIONS;
  private static final SubLSymbol $sym15$_CSETF_GHL_SEARCH_DIRECTIONS;
  private static final SubLSymbol $sym16$GHL_SEARCH_TV;
  private static final SubLSymbol $sym17$_CSETF_GHL_SEARCH_TV;
  private static final SubLSymbol $kw18$GRAPHL_SEARCH;
  private static final SubLSymbol $kw19$PREDICATES;
  private static final SubLSymbol $kw20$DIRECTIONS;
  private static final SubLSymbol $kw21$TV;
  private static final SubLString $str22$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw23$BEGIN;
  private static final SubLSymbol $sym24$MAKE_GHL_SEARCH;
  private static final SubLSymbol $kw25$SLOT;
  private static final SubLSymbol $kw26$END;
  private static final SubLSymbol $sym27$VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD;
  private static final SubLString $str28$GHL_Search____a__;
  private static final SubLString $str29$Predicates__a__;
  private static final SubLString $str30$Directions__a__;
  private static final SubLString $str31$TV__s__;
  private static final SubLSymbol $kw32$FREE;
  private static final SubLSymbol $kw33$TRANSITIVE_REASONING;
  private static final SubLSymbol $kw34$ALL;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$DIRECTION;
  private static final SubLSymbol $kw37$TYPE;
  private static final SubLSymbol $kw38$ORDER;
  private static final SubLSymbol $kw39$CUTOFF;
  private static final SubLSymbol $kw40$MARKING;
  private static final SubLSymbol $kw41$MARKING_SPACE;
  private static final SubLSymbol $kw42$GOAL;
  private static final SubLSymbol $kw43$GOAL_FN;
  private static final SubLSymbol $kw44$GOAL_SPACE;
  private static final SubLSymbol $kw45$SATISFY_FN;
  private static final SubLSymbol $kw46$MAP_FN;
  private static final SubLSymbol $kw47$JUSTIFY_;
  private static final SubLSymbol $kw48$ADD_TO_RESULT_;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$CLET;
  private static final SubLSymbol $sym51$NEW_GHL_SEARCH;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$DESTROY_GHL_SEARCH;
  private static final SubLSymbol $kw54$FORWARD;
  private static final SubLSymbol $kw55$BACKWARD;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw59$DONE_VAR;
  private static final SubLSymbol $sym60$CSOME;
  private static final SubLSymbol $sym61$DETERMINE_GHL_RELEVANT_DIRECTIONS;
  private static final SubLSymbol $kw62$ACCESSIBLE;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$_SKSI_GT_SEARCH_PRED_;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$PROGN;
  private static final SubLSymbol $sym70$CHECK_TYPE;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$_GHL_USES_SPEC_PREDS_P_;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$_GHL_TRACE_LEVEL_;
  private static final SubLString $str79$continue_anyway;

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1499L)
  public static SubLObject ghl_search_property_default(final SubLObject property)
  {
    return conses_high.assoc( property, $ghl_search_property_defaults$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject ghl_search_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_ghl_search( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject ghl_search_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $ghl_search_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject ghl_search_graphl_search(final SubLObject v_object)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject ghl_search_predicates(final SubLObject v_object)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject ghl_search_directions(final SubLObject v_object)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject ghl_search_tv(final SubLObject v_object)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject _csetf_ghl_search_graphl_search(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject _csetf_ghl_search_predicates(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject _csetf_ghl_search_directions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject _csetf_ghl_search_tv(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ghl_search_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject make_ghl_search(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $ghl_search_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw18$GRAPHL_SEARCH ) )
      {
        _csetf_ghl_search_graphl_search( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$PREDICATES ) )
      {
        _csetf_ghl_search_predicates( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$DIRECTIONS ) )
      {
        _csetf_ghl_search_directions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$TV ) )
      {
        _csetf_ghl_search_tv( v_new, current_value );
      }
      else
      {
        Errors.error( $str22$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject visit_defstruct_ghl_search(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw23$BEGIN, $sym24$MAKE_GHL_SEARCH, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw18$GRAPHL_SEARCH, ghl_search_graphl_search( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw19$PREDICATES, ghl_search_predicates( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw20$DIRECTIONS, ghl_search_directions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw21$TV, ghl_search_tv( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$END, $sym24$MAKE_GHL_SEARCH, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1623L)
  public static SubLObject visit_defstruct_object_ghl_search_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_ghl_search( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1828L)
  public static SubLObject print_ghl_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, NIL );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 1979L)
  public static SubLObject describe_ghl_search(final SubLObject v_object)
  {
    PrintLow.format( T, $str28$GHL_Search____a__, v_object );
    PrintLow.format( T, $str29$Predicates__a__, ghl_search_predicates( v_object ) );
    PrintLow.format( T, $str30$Directions__a__, ghl_search_directions( v_object ) );
    PrintLow.format( T, $str31$TV__s__, ghl_search_tv( v_object ) );
    graphl_search_vars.describe_graphl_search( ghl_graphl_search( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 2301L)
  public static SubLObject new_ghl_search(final SubLObject plist)
  {
    final SubLObject ghl_search = make_ghl_search( UNPROVIDED );
    final SubLObject graphl_search = graphl_search_vars.new_graphl_search( NIL );
    set_ghl_graphl_search( ghl_search, graphl_search );
    set_ghl_search_properties( ghl_search, plist );
    return ghl_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 2571L)
  public static SubLObject destroy_ghl_search(final SubLObject graph_search)
  {
    graphl_search_vars.destroy_graphl_search( ghl_search_graphl_search( graph_search ) );
    _csetf_ghl_search_graphl_search( graph_search, $kw32$FREE );
    _csetf_ghl_search_predicates( graph_search, $kw32$FREE );
    _csetf_ghl_search_directions( graph_search, $kw32$FREE );
    _csetf_ghl_search_tv( graph_search, $kw32$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 2925L)
  public static SubLObject ghl_graphl_search(final SubLObject v_search)
  {
    return ghl_search_graphl_search( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3063L)
  public static SubLObject ghl_relevant_predicates(final SubLObject v_search)
  {
    return ghl_search_predicates( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3155L)
  public static SubLObject ghl_relevant_directions(final SubLObject v_search)
  {
    return ghl_search_directions( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3247L)
  public static SubLObject ghl_tv(final SubLObject v_search)
  {
    return ghl_search_tv( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3314L)
  public static SubLObject ghl_result(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_result( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3429L)
  public static SubLObject ghl_space(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_space( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3518L)
  public static SubLObject ghl_goal_space(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_goal_space( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3617L)
  public static SubLObject ghl_truth(final SubLObject v_search)
  {
    return enumeration_types.tv_truth( ghl_tv( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3691L)
  public static SubLObject ghl_strength(final SubLObject v_search)
  {
    return enumeration_types.tv_strength( ghl_tv( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3771L)
  public static SubLObject ghl_compute_justifyP(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_compute_justifyP( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3882L)
  public static SubLObject ghl_add_to_resultP(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_search_add_to_resultP( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 3996L)
  public static SubLObject ghl_goal(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_search_goal( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4090L)
  public static SubLObject ghl_goal_fn(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_search_goal_fn( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4190L)
  public static SubLObject ghl_cutoff(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_cutoff( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4281L)
  public static SubLObject ghl_depth_cutoff(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_cutoff( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4378L)
  public static SubLObject ghl_order(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_order( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4496L)
  public static SubLObject ghl_goal_search_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_goal_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4601L)
  public static SubLObject ghl_map_fn(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_map_fn( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4692L)
  public static SubLObject ghl_map_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_map_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4781L)
  public static SubLObject ghl_depth_first_search(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_depth_first_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 4898L)
  public static SubLObject ghl_breadth_first_search(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_breadth_first_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5019L)
  public static SubLObject ghl_depth_marking_search_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_depth_marking_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5142L)
  public static SubLObject ghl_iterative_deepening_search_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_iterative_deepening_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5277L)
  public static SubLObject ghl_add_nodes_on_wind_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_add_nodes_on_wind_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5394L)
  public static SubLObject ghl_add_edges_on_unwind_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_add_edges_on_unwind_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5515L)
  public static SubLObject ghl_add_unwind_edges_now_p(final SubLObject v_search)
  {
    return graphl_graph_utilities.graphl_add_unwind_edges_now_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5638L)
  public static SubLObject ghl_goal_found_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_goal_found_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5741L)
  public static SubLObject ghl_single_goal_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_single_goal_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5846L)
  public static SubLObject ghl_multiple_goals_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_multiple_goals_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 5957L)
  public static SubLObject ghl_goal_fn_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_goal_fn_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6054L)
  public static SubLObject ghl_depth_first_search_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_depth_first_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6173L)
  public static SubLObject ghl_breadth_first_search_p(final SubLObject v_search)
  {
    return graphl_search_vars.graphl_breadth_first_search_p( ghl_graphl_search( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6296L)
  public static SubLObject ghl_goal_found_condition_p(final SubLObject condition)
  {
    return graphl_search_vars.graphl_goal_found_condition_p( condition );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6405L)
  public static SubLObject ghl_transitive_search_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_search_vars.graphl_type( ghl_graphl_search( v_search ) ), $kw33$TRANSITIVE_REASONING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6556L)
  public static SubLObject ghl_return_one_answer_p(final SubLObject v_search)
  {
    return ghl_goal_search_p( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 6644L)
  public static SubLObject ghl_relevant_predP(final SubLObject v_search, final SubLObject pred)
  {
    if( ghl_search_predicates( v_search ).isList() )
    {
      SubLObject relevantP = NIL;
      if( NIL == relevantP )
      {
        SubLObject csome_list_var = ghl_search_predicates( v_search );
        SubLObject ghl_pred = NIL;
        ghl_pred = csome_list_var.first();
        while ( NIL == relevantP && NIL != csome_list_var)
        {
          if( NIL != ghl_link_iterators.gt_relevant_predP( pred, ghl_pred ) )
          {
            relevantP = T;
          }
          csome_list_var = csome_list_var.rest();
          ghl_pred = csome_list_var.first();
        }
      }
      return relevantP;
    }
    return ghl_link_iterators.gt_relevant_predP( pred, ghl_search_predicates( pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 7015L)
  public static SubLObject ghl_return_all_justificationsP(final SubLObject v_search)
  {
    return Equality.eq( ghl_compute_justifyP( v_search ), $kw34$ALL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 7123L)
  public static SubLObject set_ghl_search_properties(final SubLObject v_search, final SubLObject plist)
  {
    SubLObject cdolist_list_var = $ghl_search_property_defaults$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject prop = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
      prop = current.first();
      current = ( value = current.rest() );
      if( NIL != value )
      {
        set_ghl_search_property( v_search, prop, value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    if( NIL != conses_high.getf( plist, $kw36$DIRECTION, UNPROVIDED ) && NIL == conses_high.getf( plist, $kw20$DIRECTIONS, UNPROVIDED ) )
    {
      set_ghl_search_property( v_search, $kw20$DIRECTIONS, ConsesLow.make_list( Sequences.length( conses_high.getf( plist, $kw19$PREDICATES, UNPROVIDED ) ), conses_high.getf( plist, $kw36$DIRECTION, UNPROVIDED ) ) );
    }
    SubLObject remainder;
    SubLObject prop2;
    SubLObject val;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      prop2 = remainder.first();
      val = conses_high.cadr( remainder );
      set_ghl_search_property( v_search, prop2, val );
    }
    return v_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 7735L)
  public static SubLObject set_ghl_search_property(final SubLObject v_search, final SubLObject property, SubLObject value)
  {
    if( NIL == value )
    {
      value = ghl_search_property_default( property );
    }
    final SubLObject graphl_search = ghl_graphl_search( v_search );
    if( property.eql( $kw19$PREDICATES ) )
    {
      set_ghl_search_predicates( v_search, value );
    }
    else if( property.eql( $kw20$DIRECTIONS ) )
    {
      set_ghl_search_directions( v_search, value );
    }
    else if( property.eql( $kw21$TV ) )
    {
      set_ghl_search_tv( v_search, value );
    }
    else if( property.eql( $kw37$TYPE ) )
    {
      graphl_search_vars.set_graphl_search_type( graphl_search, value );
    }
    else if( property.eql( $kw38$ORDER ) )
    {
      graphl_search_vars.set_graphl_search_order( graphl_search, value );
    }
    else if( property.eql( $kw39$CUTOFF ) )
    {
      graphl_search_vars.set_graphl_search_cutoff( graphl_search, value );
    }
    else if( property.eql( $kw40$MARKING ) )
    {
      graphl_search_vars.set_graphl_search_marking( graphl_search, value );
    }
    else if( property.eql( $kw41$MARKING_SPACE ) )
    {
      graphl_search_vars.set_graphl_search_marking_space( graphl_search, value );
    }
    else if( property.eql( $kw42$GOAL ) )
    {
      graphl_search_vars.set_graphl_search_goal( graphl_search, value );
    }
    else if( property.eql( $kw43$GOAL_FN ) )
    {
      graphl_search_vars.set_graphl_search_goal_fn( graphl_search, value );
    }
    else if( property.eql( $kw44$GOAL_SPACE ) )
    {
      graphl_search_vars.set_graphl_search_goal_space( graphl_search, value );
    }
    else if( property.eql( $kw45$SATISFY_FN ) )
    {
      graphl_search_vars.set_graphl_search_satisfy_fn( graphl_search, value );
    }
    else if( property.eql( $kw46$MAP_FN ) )
    {
      graphl_search_vars.set_graphl_search_map_fn( graphl_search, value );
    }
    else if( property.eql( $kw47$JUSTIFY_ ) )
    {
      graphl_search_vars.set_graphl_search_justifyP( graphl_search, value );
    }
    else if( property.eql( $kw48$ADD_TO_RESULT_ ) )
    {
      graphl_search_vars.set_graphl_search_add_to_resultP( graphl_search, value );
    }
    return v_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9076L)
  public static SubLObject set_ghl_graphl_search(final SubLObject v_search, final SubLObject graphl_search)
  {
    _csetf_ghl_search_graphl_search( v_search, graphl_search );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9237L)
  public static SubLObject set_ghl_search_predicates(final SubLObject v_search, final SubLObject predicates)
  {
    _csetf_ghl_search_predicates( v_search, predicates );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9365L)
  public static SubLObject set_ghl_search_directions(final SubLObject v_search, final SubLObject directions)
  {
    _csetf_ghl_search_directions( v_search, directions );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9493L)
  public static SubLObject set_ghl_search_tv(final SubLObject v_search, final SubLObject tv)
  {
    _csetf_ghl_search_tv( v_search, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9589L)
  public static SubLObject set_ghl_search_order(final SubLObject v_search, final SubLObject order)
  {
    graphl_search_vars.set_graphl_search_order( ghl_graphl_search( v_search ), order );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9716L)
  public static SubLObject set_ghl_search_cutoff(final SubLObject v_search, final SubLObject cutoff_type)
  {
    graphl_search_vars.set_graphl_search_cutoff( ghl_graphl_search( v_search ), cutoff_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9857L)
  public static SubLObject set_ghl_search_marking(final SubLObject v_search, final SubLObject marking)
  {
    graphl_search_vars.set_graphl_search_marking( ghl_graphl_search( v_search ), marking );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 9992L)
  public static SubLObject set_ghl_search_marking_space(final SubLObject v_search, final SubLObject marking_space)
  {
    graphl_search_vars.set_graphl_search_marking_space( ghl_graphl_search( v_search ), marking_space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10151L)
  public static SubLObject set_ghl_search_goal(final SubLObject v_search, final SubLObject goal)
  {
    graphl_search_vars.set_graphl_search_goal( ghl_graphl_search( v_search ), goal );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10274L)
  public static SubLObject set_ghl_search_goal_fn(final SubLObject v_search, final SubLObject goal_fn)
  {
    graphl_search_vars.set_graphl_search_goal_fn( ghl_graphl_search( v_search ), goal_fn );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10409L)
  public static SubLObject set_ghl_search_goal_space(final SubLObject v_search, final SubLObject goal_space)
  {
    graphl_search_vars.set_graphl_search_goal_space( ghl_graphl_search( v_search ), goal_space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10556L)
  public static SubLObject set_ghl_search_satisfy_fn(final SubLObject v_search, final SubLObject satisfy_fn)
  {
    graphl_search_vars.set_graphl_search_satisfy_fn( ghl_graphl_search( v_search ), satisfy_fn );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10703L)
  public static SubLObject set_ghl_search_map_fn(final SubLObject v_search, final SubLObject map_fn)
  {
    graphl_search_vars.set_graphl_search_map_fn( ghl_graphl_search( v_search ), map_fn );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10834L)
  public static SubLObject set_ghl_search_justifyP(final SubLObject v_search, final SubLObject justifyP)
  {
    graphl_search_vars.set_graphl_search_justifyP( ghl_graphl_search( v_search ), justifyP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 10973L)
  public static SubLObject set_ghl_search_result(final SubLObject v_search, final SubLObject result)
  {
    graphl_search_vars.set_graphl_search_result( ghl_graphl_search( v_search ), result );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11104L)
  public static SubLObject set_ghl_goal_found_p(final SubLObject v_search, final SubLObject found_p)
  {
    graphl_search_vars.set_graphl_search_goal_found_p( ghl_graphl_search( v_search ), found_p );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11244L)
  public static SubLObject ghl_set_result(final SubLObject v_search, final SubLObject result)
  {
    set_ghl_search_result( v_search, result );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11372L)
  public static SubLObject ghl_add_node_to_result(final SubLObject v_search, final SubLObject node)
  {
    graphl_search_vars.graphl_add_node_to_result( ghl_graphl_search( v_search ), node );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11701L)
  public static SubLObject ghl_add_to_result(final SubLObject v_search, final SubLObject addition, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    graphl_search_vars.graphl_add_to_result( ghl_graphl_search( v_search ), addition, test );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11858L)
  public static SubLObject ghl_append_to_result(final SubLObject v_search, final SubLObject addition)
  {
    graphl_search_vars.graphl_append_to_result( ghl_graphl_search( v_search ), addition );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 11993L)
  public static SubLObject with_ghl_search_initialized(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject search_var = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    search_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    plist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym50$CLET, ConsesLow.list( ConsesLow.list( search_var, ConsesLow.list( $sym51$NEW_GHL_SEARCH, plist ) ) ), $list52, ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
        $sym53$DESTROY_GHL_SEARCH, search_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12218L)
  public static SubLObject reinitialize_ghl_spaces(final SubLObject v_search)
  {
    graphl_search_vars.reinitialize_graphl_spaces( ghl_graphl_search( v_search ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12341L)
  public static SubLObject ghl_forward_direction()
  {
    return $kw54$FORWARD;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12454L)
  public static SubLObject ghl_backward_direction()
  {
    return $kw55$BACKWARD;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12518L)
  public static SubLObject ghl_forward_direction_p(final SubLObject direction)
  {
    return Equality.eq( direction, $kw54$FORWARD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12606L)
  public static SubLObject do_ghl_relevant_directions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dir_var = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    dir_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    direction = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list56 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list56 );
      if( NIL == conses_high.member( current_$1, $list57, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw58$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    }
    final SubLObject done_var_tail = cdestructuring_bind.property_list_member( $kw59$DONE_VAR, current );
    final SubLObject done_var = ( NIL != done_var_tail ) ? conses_high.cadr( done_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym60$CSOME, ConsesLow.list( dir_var, ConsesLow.list( $sym61$DETERMINE_GHL_RELEVANT_DIRECTIONS, direction ), done_var ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12797L)
  public static SubLObject ghl_opposite_direction(final SubLObject direction)
  {
    if( direction.eql( $kw54$FORWARD ) )
    {
      return $kw55$BACKWARD;
    }
    if( direction.eql( $kw55$BACKWARD ) )
    {
      return $kw54$FORWARD;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 12947L)
  public static SubLObject ghl_direction_for_predicate_relation(final SubLObject pred)
  {
    return ONE_INTEGER.eql( kb_accessors.fan_out_arg( pred, UNPROVIDED ) ) ? $kw54$FORWARD : $kw55$BACKWARD;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13365L)
  public static SubLObject ghl_fan_out_direction(final SubLObject pred)
  {
    final SubLObject pcase_var = kb_accessors.asserted_fan_out_arg( pred, UNPROVIDED );
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return $kw55$BACKWARD;
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return $kw54$FORWARD;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13540L)
  public static SubLObject determine_ghl_relevant_directions(final SubLObject ghl_direction)
  {
    if( ghl_direction.eql( $kw62$ACCESSIBLE ) )
    {
      return $list63;
    }
    if( ghl_direction.eql( $kw54$FORWARD ) )
    {
      return $list64;
    }
    if( ghl_direction.eql( $kw55$BACKWARD ) )
    {
      return $list65;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 13855L)
  public static SubLObject with_sksi_gt_search_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
    pred = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym50$CLET, ConsesLow.list( ConsesLow.list( $sym67$_SKSI_GT_SEARCH_PRED_, pred ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14091L)
  public static SubLObject ghl_uses_spec_preds_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ghl_uses_spec_preds_p$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14168L)
  public static SubLObject with_ghl_spec_pred_use_p(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject use_emP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    use_emP = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym69$PROGN, ConsesLow.listS( $sym70$CHECK_TYPE, use_emP, $list71 ), ConsesLow.listS( $sym50$CLET, ConsesLow.list( ConsesLow.list( $sym72$_GHL_USES_SPEC_PREDS_P_, use_emP ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14345L)
  public static SubLObject with_ghl_spec_pred_use(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym50$CLET, $list73, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14459L)
  public static SubLObject without_ghl_spec_pred_use(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym50$CLET, $list74, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14663L)
  public static SubLObject with_gt_args_unswapped(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym50$CLET, $list75, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14775L)
  public static SubLObject with_gt_args_swapped(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym50$CLET, $list76, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 14883L)
  public static SubLObject gt_args_swapped_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $gt_args_swapped_p$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 15089L)
  public static SubLObject with_ghl_trace_level(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym50$CLET, ConsesLow.list( ConsesLow.list( $sym78$_GHL_TRACE_LEVEL_, level ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-vars.lisp", position = 15203L)
  public static SubLObject ghl_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $ghl_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      Errors.cerror( $str79$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5
      } );
    }
    else if( Numbers.add( TWO_INTEGER, $ghl_trace_level$.getDynamicValue( thread ) ).numGE( level ) )
    {
      Errors.warn( format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5
      } );
    }
    return NIL;
  }

  public static SubLObject declare_ghl_search_vars_file()
  {
    SubLFiles.declareFunction( me, "ghl_search_property_default", "GHL-SEARCH-PROPERTY-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_search_print_function_trampoline", "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_search_p", "GHL-SEARCH-P", 1, 0, false );
    new $ghl_search_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ghl_search_graphl_search", "GHL-SEARCH-GRAPHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_search_predicates", "GHL-SEARCH-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_search_directions", "GHL-SEARCH-DIRECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_search_tv", "GHL-SEARCH-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ghl_search_graphl_search", "_CSETF-GHL-SEARCH-GRAPHL-SEARCH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ghl_search_predicates", "_CSETF-GHL-SEARCH-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ghl_search_directions", "_CSETF-GHL-SEARCH-DIRECTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ghl_search_tv", "_CSETF-GHL-SEARCH-TV", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ghl_search", "MAKE-GHL-SEARCH", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_ghl_search", "VISIT-DEFSTRUCT-GHL-SEARCH", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_ghl_search_method", "VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_ghl_search", "PRINT-GHL-SEARCH", 3, 0, false );
    SubLFiles.declareFunction( me, "describe_ghl_search", "DESCRIBE-GHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "new_ghl_search", "NEW-GHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_ghl_search", "DESTROY-GHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_graphl_search", "GHL-GRAPHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_relevant_predicates", "GHL-RELEVANT-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_relevant_directions", "GHL-RELEVANT-DIRECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_tv", "GHL-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_result", "GHL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_space", "GHL-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_space", "GHL-GOAL-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_truth", "GHL-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_strength", "GHL-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_compute_justifyP", "GHL-COMPUTE-JUSTIFY?", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_to_resultP", "GHL-ADD-TO-RESULT?", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal", "GHL-GOAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_fn", "GHL-GOAL-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_cutoff", "GHL-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_depth_cutoff", "GHL-DEPTH-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_order", "GHL-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_search_p", "GHL-GOAL-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_map_fn", "GHL-MAP-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_map_p", "GHL-MAP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_depth_first_search", "GHL-DEPTH-FIRST-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_breadth_first_search", "GHL-BREADTH-FIRST-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_depth_marking_search_p", "GHL-DEPTH-MARKING-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_iterative_deepening_search_p", "GHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_nodes_on_wind_p", "GHL-ADD-NODES-ON-WIND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_edges_on_unwind_p", "GHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_unwind_edges_now_p", "GHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_found_p", "GHL-GOAL-FOUND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_single_goal_p", "GHL-SINGLE-GOAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_multiple_goals_p", "GHL-MULTIPLE-GOALS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_fn_p", "GHL-GOAL-FN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_depth_first_search_p", "GHL-DEPTH-FIRST-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_breadth_first_search_p", "GHL-BREADTH-FIRST-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_found_condition_p", "GHL-GOAL-FOUND-CONDITION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_transitive_search_p", "GHL-TRANSITIVE-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_return_one_answer_p", "GHL-RETURN-ONE-ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_relevant_predP", "GHL-RELEVANT-PRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_return_all_justificationsP", "GHL-RETURN-ALL-JUSTIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_properties", "SET-GHL-SEARCH-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_property", "SET-GHL-SEARCH-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_graphl_search", "SET-GHL-GRAPHL-SEARCH", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_predicates", "SET-GHL-SEARCH-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_directions", "SET-GHL-SEARCH-DIRECTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_tv", "SET-GHL-SEARCH-TV", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_order", "SET-GHL-SEARCH-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_cutoff", "SET-GHL-SEARCH-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_marking", "SET-GHL-SEARCH-MARKING", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_marking_space", "SET-GHL-SEARCH-MARKING-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_goal", "SET-GHL-SEARCH-GOAL", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_goal_fn", "SET-GHL-SEARCH-GOAL-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_goal_space", "SET-GHL-SEARCH-GOAL-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_satisfy_fn", "SET-GHL-SEARCH-SATISFY-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_map_fn", "SET-GHL-SEARCH-MAP-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_justifyP", "SET-GHL-SEARCH-JUSTIFY?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_search_result", "SET-GHL-SEARCH-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ghl_goal_found_p", "SET-GHL-GOAL-FOUND-P", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_set_result", "GHL-SET-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_node_to_result", "GHL-ADD-NODE-TO-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_to_result", "GHL-ADD-TO-RESULT", 2, 1, false );
    SubLFiles.declareFunction( me, "ghl_append_to_result", "GHL-APPEND-TO-RESULT", 2, 0, false );
    SubLFiles.declareMacro( me, "with_ghl_search_initialized", "WITH-GHL-SEARCH-INITIALIZED" );
    SubLFiles.declareFunction( me, "reinitialize_ghl_spaces", "REINITIALIZE-GHL-SPACES", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_forward_direction", "GHL-FORWARD-DIRECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "ghl_backward_direction", "GHL-BACKWARD-DIRECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "ghl_forward_direction_p", "GHL-FORWARD-DIRECTION-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_ghl_relevant_directions", "DO-GHL-RELEVANT-DIRECTIONS" );
    SubLFiles.declareFunction( me, "ghl_opposite_direction", "GHL-OPPOSITE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_direction_for_predicate_relation", "GHL-DIRECTION-FOR-PREDICATE-RELATION", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_fan_out_direction", "GHL-FAN-OUT-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_ghl_relevant_directions", "DETERMINE-GHL-RELEVANT-DIRECTIONS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sksi_gt_search_pred", "WITH-SKSI-GT-SEARCH-PRED" );
    SubLFiles.declareFunction( me, "ghl_uses_spec_preds_p", "GHL-USES-SPEC-PREDS-P", 0, 0, false );
    SubLFiles.declareMacro( me, "with_ghl_spec_pred_use_p", "WITH-GHL-SPEC-PRED-USE-P" );
    SubLFiles.declareMacro( me, "with_ghl_spec_pred_use", "WITH-GHL-SPEC-PRED-USE" );
    SubLFiles.declareMacro( me, "without_ghl_spec_pred_use", "WITHOUT-GHL-SPEC-PRED-USE" );
    SubLFiles.declareMacro( me, "with_gt_args_unswapped", "WITH-GT-ARGS-UNSWAPPED" );
    SubLFiles.declareMacro( me, "with_gt_args_swapped", "WITH-GT-ARGS-SWAPPED" );
    SubLFiles.declareFunction( me, "gt_args_swapped_p", "GT-ARGS-SWAPPED-P", 0, 0, false );
    SubLFiles.declareMacro( me, "with_ghl_trace_level", "WITH-GHL-TRACE-LEVEL" );
    SubLFiles.declareFunction( me, "ghl_error", "GHL-ERROR", 2, 5, false );
    return NIL;
  }

  public static SubLObject init_ghl_search_vars_file()
  {
    $ghl_search_property_defaults$ = SubLFiles.deflexical( "*GHL-SEARCH-PROPERTY-DEFAULTS*", $list0 );
    $dtp_ghl_search$ = SubLFiles.defconstant( "*DTP-GHL-SEARCH*", $sym1$GHL_SEARCH );
    $sksi_gt_search_pred$ = SubLFiles.defparameter( "*SKSI-GT-SEARCH-PRED*", NIL );
    $ghl_uses_spec_preds_p$ = SubLFiles.defparameter( "*GHL-USES-SPEC-PREDS-P*", T );
    $gt_args_swapped_p$ = SubLFiles.defparameter( "*GT-ARGS-SWAPPED-P*", NIL );
    $ghl_trace_level$ = SubLFiles.defparameter( "*GHL-TRACE-LEVEL*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_ghl_search_vars_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_ghl_search$.getGlobalValue(), Symbols.symbol_function( $sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$GHL_SEARCH_GRAPHL_SEARCH, $sym11$_CSETF_GHL_SEARCH_GRAPHL_SEARCH );
    Structures.def_csetf( $sym12$GHL_SEARCH_PREDICATES, $sym13$_CSETF_GHL_SEARCH_PREDICATES );
    Structures.def_csetf( $sym14$GHL_SEARCH_DIRECTIONS, $sym15$_CSETF_GHL_SEARCH_DIRECTIONS );
    Structures.def_csetf( $sym16$GHL_SEARCH_TV, $sym17$_CSETF_GHL_SEARCH_TV );
    Equality.identity( $sym1$GHL_SEARCH );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ghl_search$.getGlobalValue(), Symbols.symbol_function( $sym27$VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ghl_search_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ghl_search_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ghl_search_vars_file();
  }
  static
  {
    me = new ghl_search_vars();
    $ghl_search_property_defaults$ = null;
    $dtp_ghl_search$ = null;
    $sksi_gt_search_pred$ = null;
    $ghl_uses_spec_preds_p$ = null;
    $gt_args_swapped_p$ = null;
    $ghl_trace_level$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeKeyword( "DIRECTIONS" ), makeKeyword( "FORWARD" ) ), ConsesLow.cons( makeKeyword( "TV" ), makeKeyword( "TRUE-DEF" ) ), ConsesLow.cons( makeKeyword( "ORDER" ), makeKeyword(
        "BREADTH-FIRST" ) ) );
    $sym1$GHL_SEARCH = makeSymbol( "GHL-SEARCH" );
    $sym2$GHL_SEARCH_P = makeSymbol( "GHL-SEARCH-P" );
    $list3 = ConsesLow.list( makeSymbol( "GRAPHL-SEARCH" ), makeSymbol( "PREDICATES" ), makeSymbol( "DIRECTIONS" ), makeSymbol( "TV" ) );
    $list4 = ConsesLow.list( makeKeyword( "GRAPHL-SEARCH" ), makeKeyword( "PREDICATES" ), makeKeyword( "DIRECTIONS" ), makeKeyword( "TV" ) );
    $list5 = ConsesLow.list( makeSymbol( "GHL-SEARCH-GRAPHL-SEARCH" ), makeSymbol( "GHL-SEARCH-PREDICATES" ), makeSymbol( "GHL-SEARCH-DIRECTIONS" ), makeSymbol( "GHL-SEARCH-TV" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-GHL-SEARCH-GRAPHL-SEARCH" ), makeSymbol( "_CSETF-GHL-SEARCH-PREDICATES" ), makeSymbol( "_CSETF-GHL-SEARCH-DIRECTIONS" ), makeSymbol( "_CSETF-GHL-SEARCH-TV" ) );
    $sym7$PRINT_GHL_SEARCH = makeSymbol( "PRINT-GHL-SEARCH" );
    $sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "GHL-SEARCH-P" ) );
    $sym10$GHL_SEARCH_GRAPHL_SEARCH = makeSymbol( "GHL-SEARCH-GRAPHL-SEARCH" );
    $sym11$_CSETF_GHL_SEARCH_GRAPHL_SEARCH = makeSymbol( "_CSETF-GHL-SEARCH-GRAPHL-SEARCH" );
    $sym12$GHL_SEARCH_PREDICATES = makeSymbol( "GHL-SEARCH-PREDICATES" );
    $sym13$_CSETF_GHL_SEARCH_PREDICATES = makeSymbol( "_CSETF-GHL-SEARCH-PREDICATES" );
    $sym14$GHL_SEARCH_DIRECTIONS = makeSymbol( "GHL-SEARCH-DIRECTIONS" );
    $sym15$_CSETF_GHL_SEARCH_DIRECTIONS = makeSymbol( "_CSETF-GHL-SEARCH-DIRECTIONS" );
    $sym16$GHL_SEARCH_TV = makeSymbol( "GHL-SEARCH-TV" );
    $sym17$_CSETF_GHL_SEARCH_TV = makeSymbol( "_CSETF-GHL-SEARCH-TV" );
    $kw18$GRAPHL_SEARCH = makeKeyword( "GRAPHL-SEARCH" );
    $kw19$PREDICATES = makeKeyword( "PREDICATES" );
    $kw20$DIRECTIONS = makeKeyword( "DIRECTIONS" );
    $kw21$TV = makeKeyword( "TV" );
    $str22$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw23$BEGIN = makeKeyword( "BEGIN" );
    $sym24$MAKE_GHL_SEARCH = makeSymbol( "MAKE-GHL-SEARCH" );
    $kw25$SLOT = makeKeyword( "SLOT" );
    $kw26$END = makeKeyword( "END" );
    $sym27$VISIT_DEFSTRUCT_OBJECT_GHL_SEARCH_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-GHL-SEARCH-METHOD" );
    $str28$GHL_Search____a__ = makeString( "GHL Search : ~a~%" );
    $str29$Predicates__a__ = makeString( "Predicates ~a~%" );
    $str30$Directions__a__ = makeString( "Directions ~a~%" );
    $str31$TV__s__ = makeString( "TV ~s~%" );
    $kw32$FREE = makeKeyword( "FREE" );
    $kw33$TRANSITIVE_REASONING = makeKeyword( "TRANSITIVE-REASONING" );
    $kw34$ALL = makeKeyword( "ALL" );
    $list35 = ConsesLow.cons( makeSymbol( "PROP" ), makeSymbol( "VALUE" ) );
    $kw36$DIRECTION = makeKeyword( "DIRECTION" );
    $kw37$TYPE = makeKeyword( "TYPE" );
    $kw38$ORDER = makeKeyword( "ORDER" );
    $kw39$CUTOFF = makeKeyword( "CUTOFF" );
    $kw40$MARKING = makeKeyword( "MARKING" );
    $kw41$MARKING_SPACE = makeKeyword( "MARKING-SPACE" );
    $kw42$GOAL = makeKeyword( "GOAL" );
    $kw43$GOAL_FN = makeKeyword( "GOAL-FN" );
    $kw44$GOAL_SPACE = makeKeyword( "GOAL-SPACE" );
    $kw45$SATISFY_FN = makeKeyword( "SATISFY-FN" );
    $kw46$MAP_FN = makeKeyword( "MAP-FN" );
    $kw47$JUSTIFY_ = makeKeyword( "JUSTIFY?" );
    $kw48$ADD_TO_RESULT_ = makeKeyword( "ADD-TO-RESULT?" );
    $list49 = ConsesLow.list( makeSymbol( "SEARCH-VAR" ), makeSymbol( "PLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$CLET = makeSymbol( "CLET" );
    $sym51$NEW_GHL_SEARCH = makeSymbol( "NEW-GHL-SEARCH" );
    $list52 = ConsesLow.list( makeSymbol( "RESET-GRAPHL-FINISHED" ) );
    $sym53$DESTROY_GHL_SEARCH = makeSymbol( "DESTROY-GHL-SEARCH" );
    $kw54$FORWARD = makeKeyword( "FORWARD" );
    $kw55$BACKWARD = makeKeyword( "BACKWARD" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIR-VAR" ), makeSymbol( "DIRECTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list57 = ConsesLow.list( makeKeyword( "DONE-VAR" ) );
    $kw58$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw59$DONE_VAR = makeKeyword( "DONE-VAR" );
    $sym60$CSOME = makeSymbol( "CSOME" );
    $sym61$DETERMINE_GHL_RELEVANT_DIRECTIONS = makeSymbol( "DETERMINE-GHL-RELEVANT-DIRECTIONS" );
    $kw62$ACCESSIBLE = makeKeyword( "ACCESSIBLE" );
    $list63 = ConsesLow.list( makeKeyword( "FORWARD" ), makeKeyword( "BACKWARD" ) );
    $list64 = ConsesLow.list( makeKeyword( "FORWARD" ) );
    $list65 = ConsesLow.list( makeKeyword( "BACKWARD" ) );
    $list66 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym67$_SKSI_GT_SEARCH_PRED_ = makeSymbol( "*SKSI-GT-SEARCH-PRED*" );
    $list68 = ConsesLow.list( makeSymbol( "USE-EM?" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym69$PROGN = makeSymbol( "PROGN" );
    $sym70$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list71 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym72$_GHL_USES_SPEC_PREDS_P_ = makeSymbol( "*GHL-USES-SPEC-PREDS-P*" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GHL-USES-SPEC-PREDS-P*" ), T ) );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GHL-USES-SPEC-PREDS-P*" ), NIL ) );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-ARGS-SWAPPED-P*" ), NIL ) );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-ARGS-SWAPPED-P*" ), T ) );
    $list77 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym78$_GHL_TRACE_LEVEL_ = makeSymbol( "*GHL-TRACE-LEVEL*" );
    $str79$continue_anyway = makeString( "continue anyway" );
  }

  public static final class $ghl_search_native
      extends
        SubLStructNative
  {
    public SubLObject $graphl_search;
    public SubLObject $predicates;
    public SubLObject $directions;
    public SubLObject $tv;
    private static final SubLStructDeclNative structDecl;

    public $ghl_search_native()
    {
      this.$graphl_search = CommonSymbols.NIL;
      this.$predicates = CommonSymbols.NIL;
      this.$directions = CommonSymbols.NIL;
      this.$tv = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $ghl_search_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$graphl_search;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$predicates;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$directions;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$tv;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$graphl_search = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$predicates = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$directions = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$tv = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $ghl_search_native.class, $sym1$GHL_SEARCH, $sym2$GHL_SEARCH_P, $list3, $list4, new String[] { "$graphl_search", "$predicates", "$directions", "$tv"
      }, $list5, $list6, $sym7$PRINT_GHL_SEARCH );
    }
  }

  public static final class $ghl_search_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $ghl_search_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GHL-SEARCH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ghl_search_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 213 ms
 * 
 */