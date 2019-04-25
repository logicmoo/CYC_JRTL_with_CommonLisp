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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_graph
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.czer_graph";
  public static final String myFingerPrint = "648e0fa58fe26ac3d78aadf4c2de08e2aae7b05e03c7d1fe57f43669f6609542";
  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLSymbol $dtp_v_colour$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLSymbol $dtp_arc$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLSymbol $dtp_vertex$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLSymbol $dtp_graph_search_node$;
  private static final SubLSymbol $sym0$V_COLOUR;
  private static final SubLSymbol $sym1$V_COLOUR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$V_COLOUR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$V_COLOUR_SORTED_CONSTANT_LIST;
  private static final SubLSymbol $sym10$_CSETF_V_COLOUR_SORTED_CONSTANT_LIST;
  private static final SubLSymbol $sym11$V_COLOUR_SORTED_NAT_LIST;
  private static final SubLSymbol $sym12$_CSETF_V_COLOUR_SORTED_NAT_LIST;
  private static final SubLSymbol $sym13$V_COLOUR_SORTED_ASSERTION_LIST;
  private static final SubLSymbol $sym14$_CSETF_V_COLOUR_SORTED_ASSERTION_LIST;
  private static final SubLSymbol $sym15$V_COLOUR_LIST_STRUCTURE;
  private static final SubLSymbol $sym16$_CSETF_V_COLOUR_LIST_STRUCTURE;
  private static final SubLSymbol $sym17$V_COLOUR_SORTED_VAR_POSITIONS;
  private static final SubLSymbol $sym18$_CSETF_V_COLOUR_SORTED_VAR_POSITIONS;
  private static final SubLSymbol $kw19$SORTED_CONSTANT_LIST;
  private static final SubLSymbol $kw20$SORTED_NAT_LIST;
  private static final SubLSymbol $kw21$SORTED_ASSERTION_LIST;
  private static final SubLSymbol $kw22$LIST_STRUCTURE;
  private static final SubLSymbol $kw23$SORTED_VAR_POSITIONS;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_V_COLOUR;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_V_COLOUR_METHOD;
  private static final SubLSymbol $sym30$V_COLOUR_AS_LIST;
  private static final SubLSymbol $sym31$ARC;
  private static final SubLSymbol $sym32$ARC_P;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$PRINT_ARC;
  private static final SubLSymbol $sym38$ARC_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$ARC_HEAD;
  private static final SubLSymbol $sym41$_CSETF_ARC_HEAD;
  private static final SubLSymbol $sym42$ARC_COLOUR;
  private static final SubLSymbol $sym43$_CSETF_ARC_COLOUR;
  private static final SubLSymbol $kw44$HEAD;
  private static final SubLSymbol $kw45$COLOUR;
  private static final SubLSymbol $sym46$MAKE_ARC;
  private static final SubLSymbol $sym47$VISIT_DEFSTRUCT_OBJECT_ARC_METHOD;
  private static final SubLString $str48$__ARC__a_;
  private static final SubLSymbol $kw49$VARIABLE;
  private static final SubLSymbol $sym50$VERTEX;
  private static final SubLSymbol $sym51$VERTEX_P;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$PRINT_VERTEX;
  private static final SubLSymbol $sym57$VERTEX_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$VERTEX_ID;
  private static final SubLSymbol $sym60$_CSETF_VERTEX_ID;
  private static final SubLSymbol $sym61$VERTEX_COLOUR;
  private static final SubLSymbol $sym62$_CSETF_VERTEX_COLOUR;
  private static final SubLSymbol $sym63$VERTEX_ARC_SET;
  private static final SubLSymbol $sym64$_CSETF_VERTEX_ARC_SET;
  private static final SubLSymbol $kw65$ID;
  private static final SubLSymbol $kw66$ARC_SET;
  private static final SubLSymbol $sym67$MAKE_VERTEX;
  private static final SubLSymbol $sym68$VISIT_DEFSTRUCT_OBJECT_VERTEX_METHOD;
  private static final SubLString $str69$__VERTEX__a_;
  private static final SubLString $str70$vertex_number__a_not_found;
  private static final SubLSymbol $sym71$ARC_AS_SORTABLE_LIST;
  private static final SubLSymbol $sym72$ARC_AS_UNIFIABLE_LIST;
  private static final SubLSymbol $sym73$NART_ID;
  private static final SubLSymbol $sym74$ASSERTION_ID;
  private static final SubLSymbol $sym75$VARIABLE_P;
  private static final SubLSymbol $sym76$GRAPH_SEARCH_NODE;
  private static final SubLSymbol $sym77$GRAPH_SEARCH_NODE_P;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$PRINT_GRAPH_SEARCH_NODE;
  private static final SubLSymbol $sym83$GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$GRAPH_SEARCH_NODE_VERTEX;
  private static final SubLSymbol $sym86$_CSETF_GRAPH_SEARCH_NODE_VERTEX;
  private static final SubLSymbol $sym87$GRAPH_SEARCH_NODE_SEARCH_HISTORY;
  private static final SubLSymbol $sym88$_CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY;
  private static final SubLSymbol $kw89$VERTEX;
  private static final SubLSymbol $kw90$SEARCH_HISTORY;
  private static final SubLSymbol $sym91$MAKE_GRAPH_SEARCH_NODE;
  private static final SubLSymbol $sym92$VISIT_DEFSTRUCT_OBJECT_GRAPH_SEARCH_NODE_METHOD;
  private static final SubLString $str93$__NODE__s__s_;
  private static final SubLSymbol $sym94$EL_VAR_;
  private static final SubLSymbol $sym95$INERT_VARIABLE;
  private static final SubLSymbol $kw96$ARC;
  private static final SubLSymbol $kw97$VERTEX_INFO;
  private static final SubLString $str98$graph_search_node___failed_to_com;
  private static final SubLSymbol $sym99$GRAPH_SEARCH_NODE__;
  private static final SubLString $str100$min_graph_search_node_failed_on_n;
  private static final SubLSymbol $sym101$GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS;
  private static final SubLSymbol $sym102$GRAPH_SEARCH_NODE_AS_SORTABLE_SETS;
  private static final SubLSymbol $sym103$VERTEX_SEARCH_STATE__;
  private static final SubLSymbol $sym104$SORTED_CONSTANT_EXTERNAL_ID_LIST;
  private static final SubLSymbol $sym105$GUID_TREE__;
  private static final SubLSymbol $sym106$SAFE_GUID_;
  private static final SubLSymbol $sym107$SAFE_GUID_;

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $v_colour_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_sorted_constant_list(final SubLObject v_object)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_sorted_nat_list(final SubLObject v_object)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_sorted_assertion_list(final SubLObject v_object)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_list_structure(final SubLObject v_object)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject v_colour_sorted_var_positions(final SubLObject v_object)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject _csetf_v_colour_sorted_constant_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject _csetf_v_colour_sorted_nat_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject _csetf_v_colour_sorted_assertion_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject _csetf_v_colour_list_structure(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject _csetf_v_colour_sorted_var_positions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != v_colour_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject make_v_colour(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $v_colour_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$SORTED_CONSTANT_LIST ) )
      {
        _csetf_v_colour_sorted_constant_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$SORTED_NAT_LIST ) )
      {
        _csetf_v_colour_sorted_nat_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$SORTED_ASSERTION_LIST ) )
      {
        _csetf_v_colour_sorted_assertion_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$LIST_STRUCTURE ) )
      {
        _csetf_v_colour_list_structure( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$SORTED_VAR_POSITIONS ) )
      {
        _csetf_v_colour_sorted_var_positions( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject visit_defstruct_v_colour(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_V_COLOUR, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw19$SORTED_CONSTANT_LIST, v_colour_sorted_constant_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw20$SORTED_NAT_LIST, v_colour_sorted_nat_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$SORTED_ASSERTION_LIST, v_colour_sorted_assertion_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$LIST_STRUCTURE, v_colour_list_structure( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$SORTED_VAR_POSITIONS, v_colour_sorted_var_positions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_V_COLOUR, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 782L)
  public static SubLObject visit_defstruct_object_v_colour_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_v_colour( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 1689L)
  public static SubLObject v_colour_as_list(final SubLObject v_colour)
  {
    return ( NIL != v_colour ) ? ConsesLow.list( v_colour_sorted_constant_list( v_colour ), v_colour_sorted_nat_list( v_colour ), v_colour_sorted_assertion_list( v_colour ), v_colour_list_structure( v_colour ),
        v_colour_sorted_var_positions( v_colour ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2092L)
  public static SubLObject v_colour_min(final SubLObject colours)
  {
    return list_utilities.tree_min( Mapping.mapcar( Symbols.symbol_function( $sym30$V_COLOUR_AS_LIST ), colours ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject arc_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_arc( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject arc_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $arc_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject arc_head(final SubLObject v_object)
  {
    assert NIL != arc_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject arc_colour(final SubLObject v_object)
  {
    assert NIL != arc_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject _csetf_arc_head(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arc_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject _csetf_arc_colour(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arc_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject make_arc(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $arc_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw44$HEAD ) )
      {
        _csetf_arc_head( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$COLOUR ) )
      {
        _csetf_arc_colour( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject visit_defstruct_arc(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym46$MAKE_ARC, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw44$HEAD, arc_head( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw45$COLOUR, arc_colour( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym46$MAKE_ARC, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2188L)
  public static SubLObject visit_defstruct_object_arc_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_arc( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2305L)
  public static SubLObject print_arc(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str48$__ARC__a_, arc_as_unifiable_list( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2478L)
  public static SubLObject new_arc(final SubLObject head, final SubLObject colour)
  {
    final SubLObject arc = make_arc( UNPROVIDED );
    _csetf_arc_head( arc, head );
    _csetf_arc_colour( arc, colour );
    return arc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2628L)
  public static SubLObject arc_as_sortable_list(final SubLObject arc)
  {
    return ConsesLow.list( $kw49$VARIABLE, arc_colour( arc ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2721L)
  public static SubLObject arc_as_unifiable_list(final SubLObject arc)
  {
    return ConsesLow.list( cycl_variables.make_el_var( arc_head( arc ) ), arc_colour( arc ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2834L)
  public static SubLObject colour_arc(final SubLObject arc_var, final SubLObject tail_lit, final SubLObject head_lit)
  {
    return ConsesLow.list( list_utilities.tree_positions_bfs( arc_var, tail_lit, UNPROVIDED ), list_utilities.tree_positions_bfs( arc_var, head_lit, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject vertex_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_vertex( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject vertex_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $vertex_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject vertex_id(final SubLObject v_object)
  {
    assert NIL != vertex_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject vertex_colour(final SubLObject v_object)
  {
    assert NIL != vertex_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject vertex_arc_set(final SubLObject v_object)
  {
    assert NIL != vertex_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject _csetf_vertex_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != vertex_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject _csetf_vertex_colour(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != vertex_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject _csetf_vertex_arc_set(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != vertex_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject make_vertex(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $vertex_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw65$ID ) )
      {
        _csetf_vertex_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$COLOUR ) )
      {
        _csetf_vertex_colour( v_new, current_value );
      }
      else if( pcase_var.eql( $kw66$ARC_SET ) )
      {
        _csetf_vertex_arc_set( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject visit_defstruct_vertex(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym67$MAKE_VERTEX, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw65$ID, vertex_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw45$COLOUR, vertex_colour( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw66$ARC_SET, vertex_arc_set( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym67$MAKE_VERTEX, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 2982L)
  public static SubLObject visit_defstruct_object_vertex_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_vertex( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 3132L)
  public static SubLObject print_vertex(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str69$__VERTEX__a_, vertex_as_unifiable_list( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 3282L)
  public static SubLObject find_vertex_by_id(final SubLObject id, final SubLObject vertices)
  {
    SubLObject cdolist_list_var = vertices;
    SubLObject vertex = NIL;
    vertex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( id.numE( vertex_id( vertex ) ) )
      {
        return vertex;
      }
      cdolist_list_var = cdolist_list_var.rest();
      vertex = cdolist_list_var.first();
    }
    Errors.warn( $str70$vertex_number__a_not_found, id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 3472L)
  public static SubLObject vertex_as_sortable_list(final SubLObject v)
  {
    return ConsesLow.append( vertex_first_half_as_sortable_list( v ), ConsesLow.list( vertex_second_half_as_sortable_set( v ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 3628L)
  public static SubLObject vertex_as_unifiable_list(final SubLObject v)
  {
    return ConsesLow.append( vertex_first_half_as_unifiable_list( v ), ConsesLow.list( vertex_second_half_as_unifiable_set( v ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 3787L)
  public static SubLObject vertex_first_half_as_sortable_list(final SubLObject v)
  {
    return ConsesLow.list( $kw49$VARIABLE, v_colour_as_list( vertex_colour( v ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 3912L)
  public static SubLObject vertex_first_half_as_unifiable_list(final SubLObject v)
  {
    return ConsesLow.list( cycl_variables.make_el_var( vertex_id( v ) ), v_colour_as_list( vertex_colour( v ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 4056L)
  public static SubLObject vertex_second_half_as_sortable_set(final SubLObject v)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym71$ARC_AS_SORTABLE_LIST ), vertex_arc_set( v ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 4172L)
  public static SubLObject vertex_second_half_as_unifiable_set(final SubLObject v)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym72$ARC_AS_UNIFIABLE_LIST ), vertex_arc_set( v ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 4290L)
  public static SubLObject vertex_add_arc(final SubLObject v1, final SubLObject head_id, final SubLObject colour)
  {
    _csetf_vertex_arc_set( v1, ConsesLow.cons( new_arc( head_id, colour ), vertex_arc_set( v1 ) ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 4450L)
  public static SubLObject colour_vertex(final SubLObject literal, final SubLObject sorted_shared_vars)
  {
    final SubLObject colour = make_v_colour( UNPROVIDED );
    SubLObject sorted_var_positions = NIL;
    _csetf_v_colour_sorted_constant_list( colour, cycl_utilities.sorted_constant_external_id_list( literal ) );
    _csetf_v_colour_sorted_nat_list( colour, Mapping.mapcar( Symbols.symbol_function( $sym73$NART_ID ), cycl_utilities.sorted_nat_list( literal ) ) );
    _csetf_v_colour_sorted_assertion_list( colour, Mapping.mapcar( Symbols.symbol_function( $sym74$ASSERTION_ID ), cycl_utilities.sorted_assertion_list( literal ) ) );
    _csetf_v_colour_list_structure( colour, list_utilities.list_structure( literal, MINUS_ONE_INTEGER ) );
    SubLObject cdolist_list_var = sorted_shared_vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sorted_var_positions = ConsesLow.cons( list_utilities.tree_position_bfs( var, literal, UNPROVIDED ), sorted_var_positions );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    _csetf_v_colour_sorted_var_positions( colour, sorted_var_positions );
    return colour;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5296L)
  public static SubLObject new_vertex(final SubLObject id, final SubLObject literals, final SubLObject sorted_shared_vars)
  {
    final SubLObject v = make_vertex( UNPROVIDED );
    final SubLObject v_lit = ConsesLow.nth( id, literals );
    _csetf_vertex_id( v, id );
    _csetf_vertex_colour( v, colour_vertex( v_lit, sorted_shared_vars ) );
    SubLObject cdolist_list_var = list_utilities.tree_gather( v_lit, Symbols.symbol_function( $sym75$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdotimes_end_var;
      SubLObject head_id;
      for( cdotimes_end_var = Sequences.length( literals ), head_id = NIL, head_id = ZERO_INTEGER; head_id.numL( cdotimes_end_var ); head_id = Numbers.add( head_id, ONE_INTEGER ) )
      {
        if( NIL != list_utilities.tree_find( var, ConsesLow.nth( head_id, literals ), UNPROVIDED, UNPROVIDED ) )
        {
          vertex_add_arc( v, head_id, colour_arc( var, v_lit, ConsesLow.nth( head_id, literals ) ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return v;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject graph_search_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_graph_search_node( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject graph_search_node_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $graph_search_node_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject graph_search_node_vertex(final SubLObject v_object)
  {
    assert NIL != graph_search_node_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject graph_search_node_search_history(final SubLObject v_object)
  {
    assert NIL != graph_search_node_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject _csetf_graph_search_node_vertex(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graph_search_node_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject _csetf_graph_search_node_search_history(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graph_search_node_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject make_graph_search_node(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $graph_search_node_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw89$VERTEX ) )
      {
        _csetf_graph_search_node_vertex( v_new, current_value );
      }
      else if( pcase_var.eql( $kw90$SEARCH_HISTORY ) )
      {
        _csetf_graph_search_node_search_history( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject visit_defstruct_graph_search_node(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym91$MAKE_GRAPH_SEARCH_NODE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw89$VERTEX, graph_search_node_vertex( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw90$SEARCH_HISTORY, graph_search_node_search_history( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym91$MAKE_GRAPH_SEARCH_NODE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5749L)
  public static SubLObject visit_defstruct_object_graph_search_node_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_graph_search_node( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 5903L)
  public static SubLObject print_graph_search_node(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str93$__NODE__s__s_, graph_search_node_vertex( v_object ), graph_search_node_search_history( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 6171L)
  public static SubLObject inert_variable(final SubLObject arg)
  {
    return $kw49$VARIABLE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 6243L)
  public static SubLObject graph_search_node_as_sortable_sets(final SubLObject node)
  {
    return transform_list_utilities.ntransform( graph_search_node_as_unifiable_sets( node ), Symbols.symbol_function( $sym94$EL_VAR_ ), Symbols.symbol_function( $sym95$INERT_VARIABLE ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 6485L)
  public static SubLObject graph_search_node_as_unifiable_sets(final SubLObject node)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = graph_search_node_search_history( node );
    SubLObject arc_vertex_pair = NIL;
    arc_vertex_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arc = arc_as_unifiable_list( arc_vertex_pair.first() );
      final SubLObject v_info = vertex_first_half_as_unifiable_list( arc_vertex_pair.rest() );
      final SubLObject v_arc_set = vertex_second_half_as_unifiable_set( arc_vertex_pair.rest() );
      result = ConsesLow.cons( ConsesLow.cons( ConsesLow.cons( $kw96$ARC, arc ), ConsesLow.cons( ConsesLow.cons( $kw97$VERTEX_INFO, v_info ), v_arc_set ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      arc_vertex_pair = cdolist_list_var.first();
    }
    return ConsesLow.cons( ConsesLow.cons( ConsesLow.cons( $kw97$VERTEX_INFO, vertex_first_half_as_unifiable_list( graph_search_node_vertex( node ) ) ), vertex_second_half_as_unifiable_set( graph_search_node_vertex(
        node ) ) ), result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 7323L)
  public static SubLObject unify_graph_search_node(final SubLObject node1, final SubLObject node2)
  {
    return unification_utilities.unify_sets( graph_search_node_as_unifiable_sets( node1 ), graph_search_node_as_unifiable_sets( node2 ), T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 7563L)
  public static SubLObject graph_search_nodes_isomorphicP(final SubLObject node1, final SubLObject node2)
  {
    return Equality.equal( ConsesLow.list( bindings.unification_success_token() ), unify_graph_search_node( node1, node2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 7715L)
  public static SubLObject graph_search_node_L(final SubLObject node1, final SubLObject node2)
  {
    final SubLObject sortable_node1 = graph_search_node_as_sortable_sets( node1 );
    final SubLObject sortable_node2 = graph_search_node_as_sortable_sets( node2 );
    if( NIL != list_utilities.sets_L( sortable_node1, sortable_node2, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != list_utilities.sets_L( sortable_node2, sortable_node1, UNPROVIDED ) )
    {
      return NIL;
    }
    Errors.warn( $str98$graph_search_node___failed_to_com, node1, node2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 8170L)
  public static SubLObject min_graph_search_node(final SubLObject nodes)
  {
    if( NIL != list_utilities.singletonP( nodes ) )
    {
      return nodes.first();
    }
    final SubLObject sorted_nodes = Sort.sort( conses_high.copy_list( nodes ), Symbols.symbol_function( $sym99$GRAPH_SEARCH_NODE__ ), UNPROVIDED );
    if( !sorted_nodes.first().equal( conses_high.second( sorted_nodes ) ) )
    {
      return sorted_nodes.first();
    }
    Errors.warn( $str100$min_graph_search_node_failed_on_n, nodes );
    return nodes.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 8522L)
  public static SubLObject vertex_search_state_as_unifiable_sets_of_sets(final SubLObject state)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym101$GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS ), state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 9150L)
  public static SubLObject vertex_search_state_as_sortable_sets_of_sets(final SubLObject state)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym102$GRAPH_SEARCH_NODE_AS_SORTABLE_SETS ), state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 9281L)
  public static SubLObject unify_vertex_search_state(final SubLObject state1, final SubLObject state2)
  {
    return unification_utilities.unify_sets_of_sets( vertex_search_state_as_unifiable_sets_of_sets( state1 ), vertex_search_state_as_unifiable_sets_of_sets( state2 ), T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 9482L)
  public static SubLObject vertex_search_states_isomorphicP(final SubLObject state1, final SubLObject state2)
  {
    return Equality.equal( ConsesLow.list( bindings.unification_success_token() ), unify_vertex_search_state( state1, state2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 9642L)
  public static SubLObject vertex_search_state_L(final SubLObject state1, final SubLObject state2)
  {
    final SubLObject sortable_state1 = vertex_search_state_as_sortable_sets_of_sets( state1 );
    final SubLObject sortable_state2 = vertex_search_state_as_sortable_sets_of_sets( state2 );
    return list_utilities.sets_of_sets_L( sortable_state1, sortable_state2, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 9914L)
  public static SubLObject min_vertex_search_state(final SubLObject automorphism_set_size, final SubLObject states)
  {
    if( automorphism_set_size.numE( Sequences.length( states ) ) )
    {
      return states.first();
    }
    final SubLObject sorted_states = Sort.sort( states, Symbols.symbol_function( $sym103$VERTEX_SEARCH_STATE__ ), UNPROVIDED );
    if( sorted_states.first().equal( ConsesLow.nth( automorphism_set_size, sorted_states ) ) )
    {
      return NIL;
    }
    return sorted_states.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 10443L)
  public static SubLObject source_vertex(final SubLObject vertex_search_state)
  {
    SubLObject cdolist_list_var = vertex_search_state;
    SubLObject node = NIL;
    node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == graph_search_node_search_history( node ) )
      {
        return graph_search_node_vertex( node );
      }
      cdolist_list_var = cdolist_list_var.rest();
      node = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 10639L)
  public static SubLObject init_graph_search_state(final SubLObject v_graph)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_graph;
    SubLObject vertex = NIL;
    vertex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( make_graph_search_node( ConsesLow.list( $kw89$VERTEX, vertex ) ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      vertex = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 11074L)
  public static SubLObject graph_search_state_covers_graphP(final SubLObject v_graph, final SubLObject graph_search_state)
  {
    SubLObject uncovered_vertexP = NIL;
    if( NIL == uncovered_vertexP )
    {
      SubLObject csome_list_var = graph_search_state;
      SubLObject vertex_search_state = NIL;
      vertex_search_state = csome_list_var.first();
      while ( NIL == uncovered_vertexP && NIL != csome_list_var)
      {
        if( Sequences.length( vertex_search_state ).numGE( Sequences.length( v_graph ) ) )
        {
          SubLObject searched_vertices = NIL;
          SubLObject cdolist_list_var = vertex_search_state;
          SubLObject node = NIL;
          node = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var = vertex_id( graph_search_node_vertex( node ) );
            if( NIL == conses_high.member( item_var, searched_vertices, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              searched_vertices = ConsesLow.cons( item_var, searched_vertices );
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
          }
          uncovered_vertexP = Numbers.numL( Sequences.length( searched_vertices ), Sequences.length( v_graph ) );
        }
        else
        {
          uncovered_vertexP = T;
        }
        csome_list_var = csome_list_var.rest();
        vertex_search_state = csome_list_var.first();
      }
    }
    return uncovered_vertexP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 11704L)
  public static SubLObject least_vertex(final SubLObject v_graph, SubLObject automorphism_set_size)
  {
    if( automorphism_set_size == UNPROVIDED )
    {
      automorphism_set_size = ONE_INTEGER;
    }
    final SubLObject graph_search_state = init_graph_search_state( v_graph );
    final SubLObject v_answer = least_vertex_recursive( v_graph, graph_search_state, automorphism_set_size );
    if( NIL != v_answer )
    {
      return v_answer;
    }
    if( automorphism_set_size.numE( Sequences.length( v_graph ) ) )
    {
      return v_graph.first();
    }
    return least_vertex( v_graph, Numbers.add( ONE_INTEGER, automorphism_set_size ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 12651L)
  public static SubLObject least_vertex_recursive(final SubLObject v_graph, final SubLObject graph_search_state, final SubLObject automorphism_set_size)
  {
    final SubLObject min = min_vertex_search_state( automorphism_set_size, graph_search_state );
    if( NIL != min )
    {
      return source_vertex( min );
    }
    if( NIL != graph_search_state_covers_graphP( v_graph, graph_search_state ) )
    {
      return NIL;
    }
    SubLObject new_graph_search_state = NIL;
    SubLObject cdolist_list_var = graph_search_state;
    SubLObject vertex_search_state = NIL;
    vertex_search_state = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_vertex_search_state = vertex_search_state;
      SubLObject cdolist_list_var_$1 = vertex_search_state;
      SubLObject from_node = NIL;
      from_node = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject from_vertex = graph_search_node_vertex( from_node );
        SubLObject cdolist_list_var_$2 = vertex_arc_set( from_vertex );
        SubLObject arc = NIL;
        arc = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          final SubLObject to_vertex = find_vertex_by_id( arc_head( arc ), v_graph );
          final SubLObject new_history_pair = ConsesLow.list( arc, from_vertex );
          final SubLObject new_history = ConsesLow.cons( new_history_pair, graph_search_node_search_history( from_node ) );
          final SubLObject new_node = make_graph_search_node( ConsesLow.list( $kw89$VERTEX, to_vertex, $kw90$SEARCH_HISTORY, new_history ) );
          new_vertex_search_state = ConsesLow.cons( new_node, new_vertex_search_state );
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          arc = cdolist_list_var_$2.first();
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        from_node = cdolist_list_var_$1.first();
      }
      new_graph_search_state = ConsesLow.cons( new_vertex_search_state, new_graph_search_state );
      cdolist_list_var = cdolist_list_var.rest();
      vertex_search_state = cdolist_list_var.first();
    }
    return least_vertex_recursive( v_graph, new_graph_search_state, automorphism_set_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 13870L)
  public static SubLObject penultimate_resort_literals(final SubLObject literals)
  {
    final SubLObject literal = czer_main.default_preference_lit( literals );
    if( NIL != literal )
    {
      return ConsesLow.list( literal );
    }
    final SubLObject constant_lists = Mapping.mapcar( Symbols.symbol_function( $sym104$SORTED_CONSTANT_EXTERNAL_ID_LIST ), literals );
    final SubLObject sorted_constant_lists = Sort.sort( conses_high.copy_list( constant_lists ), Symbols.symbol_function( $sym105$GUID_TREE__ ), UNPROVIDED );
    if( !sorted_constant_lists.first().equal( conses_high.second( sorted_constant_lists ) ) )
    {
      return ConsesLow.list( ConsesLow.nth( Sequences.position( sorted_constant_lists.first(), constant_lists, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), literals ) );
    }
    return literals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 14746L)
  public static SubLObject guid_tree_L(final SubLObject tree1, final SubLObject tree2)
  {
    return list_utilities.tree_L( tree1, tree2, Symbols.symbol_function( $sym106$SAFE_GUID_ ), Symbols.symbol_function( $sym107$SAFE_GUID_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 14845L)
  public static SubLObject safe_guidL(final SubLObject object1, final SubLObject object2)
  {
    return ( NIL != Guids.guid_p( object1 ) ) ? ( ( NIL != Guids.guid_p( object2 ) ) ? Guids.guidL( object1, object2 ) : NIL ) : ( ( NIL != Guids.guid_p( object2 ) ) ? T : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 15104L)
  public static SubLObject safe_guidE(final SubLObject object1, final SubLObject object2)
  {
    if( NIL != Guids.guid_p( object1 ) && NIL != Guids.guid_p( object2 ) )
    {
      return Guids.guidE( object1, object2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 15259L)
  public static SubLObject last_resort_literal(final SubLObject literals, final SubLObject originals)
  {
    final SubLObject sorted_shared_vars = compute_sorted_shared_vars( originals, literals );
    SubLObject v_graph = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject v;
    for( cdotimes_end_var = Sequences.length( literals ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      v = new_vertex( i, literals, sorted_shared_vars );
      v_graph = ConsesLow.cons( v, v_graph );
    }
    return ConsesLow.nth( vertex_id( least_vertex( v_graph, UNPROVIDED ) ), literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-graph.lisp", position = 15584L)
  public static SubLObject compute_sorted_shared_vars(final SubLObject originals, final SubLObject literals)
  {
    return ( NIL != originals ) ? list_utilities.ordered_intersection( el_utilities.literals_variables( originals, Symbols.symbol_function( $sym75$VARIABLE_P ) ), el_utilities.literals_variables( literals, Symbols
        .symbol_function( $sym75$VARIABLE_P ) ), UNPROVIDED, UNPROVIDED ) : NIL;
  }

  public static SubLObject declare_czer_graph_file()
  {
    SubLFiles.declareFunction( me, "v_colour_print_function_trampoline", "V-COLOUR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "v_colour_p", "V-COLOUR-P", 1, 0, false );
    new $v_colour_p$UnaryFunction();
    SubLFiles.declareFunction( me, "v_colour_sorted_constant_list", "V-COLOUR-SORTED-CONSTANT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "v_colour_sorted_nat_list", "V-COLOUR-SORTED-NAT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "v_colour_sorted_assertion_list", "V-COLOUR-SORTED-ASSERTION-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "v_colour_list_structure", "V-COLOUR-LIST-STRUCTURE", 1, 0, false );
    SubLFiles.declareFunction( me, "v_colour_sorted_var_positions", "V-COLOUR-SORTED-VAR-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_v_colour_sorted_constant_list", "_CSETF-V-COLOUR-SORTED-CONSTANT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_v_colour_sorted_nat_list", "_CSETF-V-COLOUR-SORTED-NAT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_v_colour_sorted_assertion_list", "_CSETF-V-COLOUR-SORTED-ASSERTION-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_v_colour_list_structure", "_CSETF-V-COLOUR-LIST-STRUCTURE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_v_colour_sorted_var_positions", "_CSETF-V-COLOUR-SORTED-VAR-POSITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_v_colour", "MAKE-V-COLOUR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_v_colour", "VISIT-DEFSTRUCT-V-COLOUR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_v_colour_method", "VISIT-DEFSTRUCT-OBJECT-V-COLOUR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "v_colour_as_list", "V-COLOUR-AS-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "v_colour_min", "V-COLOUR-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_print_function_trampoline", "ARC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "arc_p", "ARC-P", 1, 0, false );
    new $arc_p$UnaryFunction();
    SubLFiles.declareFunction( me, "arc_head", "ARC-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_colour", "ARC-COLOUR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arc_head", "_CSETF-ARC-HEAD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arc_colour", "_CSETF-ARC-COLOUR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_arc", "MAKE-ARC", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_arc", "VISIT-DEFSTRUCT-ARC", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_arc_method", "VISIT-DEFSTRUCT-OBJECT-ARC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_arc", "PRINT-ARC", 3, 0, false );
    SubLFiles.declareFunction( me, "new_arc", "NEW-ARC", 2, 0, false );
    SubLFiles.declareFunction( me, "arc_as_sortable_list", "ARC-AS-SORTABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "arc_as_unifiable_list", "ARC-AS-UNIFIABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "colour_arc", "COLOUR-ARC", 3, 0, false );
    SubLFiles.declareFunction( me, "vertex_print_function_trampoline", "VERTEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "vertex_p", "VERTEX-P", 1, 0, false );
    new $vertex_p$UnaryFunction();
    SubLFiles.declareFunction( me, "vertex_id", "VERTEX-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_colour", "VERTEX-COLOUR", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_arc_set", "VERTEX-ARC-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_vertex_id", "_CSETF-VERTEX-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_vertex_colour", "_CSETF-VERTEX-COLOUR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_vertex_arc_set", "_CSETF-VERTEX-ARC-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "make_vertex", "MAKE-VERTEX", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_vertex", "VISIT-DEFSTRUCT-VERTEX", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_vertex_method", "VISIT-DEFSTRUCT-OBJECT-VERTEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_vertex", "PRINT-VERTEX", 3, 0, false );
    SubLFiles.declareFunction( me, "find_vertex_by_id", "FIND-VERTEX-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "vertex_as_sortable_list", "VERTEX-AS-SORTABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_as_unifiable_list", "VERTEX-AS-UNIFIABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_first_half_as_sortable_list", "VERTEX-FIRST-HALF-AS-SORTABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_first_half_as_unifiable_list", "VERTEX-FIRST-HALF-AS-UNIFIABLE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_second_half_as_sortable_set", "VERTEX-SECOND-HALF-AS-SORTABLE-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_second_half_as_unifiable_set", "VERTEX-SECOND-HALF-AS-UNIFIABLE-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_add_arc", "VERTEX-ADD-ARC", 3, 0, false );
    SubLFiles.declareFunction( me, "colour_vertex", "COLOUR-VERTEX", 2, 0, false );
    SubLFiles.declareFunction( me, "new_vertex", "NEW-VERTEX", 3, 0, false );
    SubLFiles.declareFunction( me, "graph_search_node_print_function_trampoline", "GRAPH-SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_search_node_p", "GRAPH-SEARCH-NODE-P", 1, 0, false );
    new $graph_search_node_p$UnaryFunction();
    SubLFiles.declareFunction( me, "graph_search_node_vertex", "GRAPH-SEARCH-NODE-VERTEX", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_search_node_search_history", "GRAPH-SEARCH-NODE-SEARCH-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graph_search_node_vertex", "_CSETF-GRAPH-SEARCH-NODE-VERTEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graph_search_node_search_history", "_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_graph_search_node", "MAKE-GRAPH-SEARCH-NODE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_graph_search_node", "VISIT-DEFSTRUCT-GRAPH-SEARCH-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_graph_search_node_method", "VISIT-DEFSTRUCT-OBJECT-GRAPH-SEARCH-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_graph_search_node", "PRINT-GRAPH-SEARCH-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "inert_variable", "INERT-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_search_node_as_sortable_sets", "GRAPH-SEARCH-NODE-AS-SORTABLE-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_search_node_as_unifiable_sets", "GRAPH-SEARCH-NODE-AS-UNIFIABLE-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "unify_graph_search_node", "UNIFY-GRAPH-SEARCH-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_search_nodes_isomorphicP", "GRAPH-SEARCH-NODES-ISOMORPHIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "graph_search_node_L", "GRAPH-SEARCH-NODE-<", 2, 0, false );
    SubLFiles.declareFunction( me, "min_graph_search_node", "MIN-GRAPH-SEARCH-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_search_state_as_unifiable_sets_of_sets", "VERTEX-SEARCH-STATE-AS-UNIFIABLE-SETS-OF-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "vertex_search_state_as_sortable_sets_of_sets", "VERTEX-SEARCH-STATE-AS-SORTABLE-SETS-OF-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "unify_vertex_search_state", "UNIFY-VERTEX-SEARCH-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "vertex_search_states_isomorphicP", "VERTEX-SEARCH-STATES-ISOMORPHIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "vertex_search_state_L", "VERTEX-SEARCH-STATE-<", 2, 0, false );
    SubLFiles.declareFunction( me, "min_vertex_search_state", "MIN-VERTEX-SEARCH-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "source_vertex", "SOURCE-VERTEX", 1, 0, false );
    SubLFiles.declareFunction( me, "init_graph_search_state", "INIT-GRAPH-SEARCH-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "graph_search_state_covers_graphP", "GRAPH-SEARCH-STATE-COVERS-GRAPH?", 2, 0, false );
    SubLFiles.declareFunction( me, "least_vertex", "LEAST-VERTEX", 1, 1, false );
    SubLFiles.declareFunction( me, "least_vertex_recursive", "LEAST-VERTEX-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "penultimate_resort_literals", "PENULTIMATE-RESORT-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "guid_tree_L", "GUID-TREE-<", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_guidL", "SAFE-GUID<", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_guidE", "SAFE-GUID=", 2, 0, false );
    SubLFiles.declareFunction( me, "last_resort_literal", "LAST-RESORT-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_sorted_shared_vars", "COMPUTE-SORTED-SHARED-VARS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_czer_graph_file()
  {
    $dtp_v_colour$ = SubLFiles.defconstant( "*DTP-V-COLOUR*", $sym0$V_COLOUR );
    $dtp_arc$ = SubLFiles.defconstant( "*DTP-ARC*", $sym31$ARC );
    $dtp_vertex$ = SubLFiles.defconstant( "*DTP-VERTEX*", $sym50$VERTEX );
    $dtp_graph_search_node$ = SubLFiles.defconstant( "*DTP-GRAPH-SEARCH-NODE*", $sym76$GRAPH_SEARCH_NODE );
    return NIL;
  }

  public static SubLObject setup_czer_graph_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_v_colour$.getGlobalValue(), Symbols.symbol_function( $sym7$V_COLOUR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$V_COLOUR_SORTED_CONSTANT_LIST, $sym10$_CSETF_V_COLOUR_SORTED_CONSTANT_LIST );
    Structures.def_csetf( $sym11$V_COLOUR_SORTED_NAT_LIST, $sym12$_CSETF_V_COLOUR_SORTED_NAT_LIST );
    Structures.def_csetf( $sym13$V_COLOUR_SORTED_ASSERTION_LIST, $sym14$_CSETF_V_COLOUR_SORTED_ASSERTION_LIST );
    Structures.def_csetf( $sym15$V_COLOUR_LIST_STRUCTURE, $sym16$_CSETF_V_COLOUR_LIST_STRUCTURE );
    Structures.def_csetf( $sym17$V_COLOUR_SORTED_VAR_POSITIONS, $sym18$_CSETF_V_COLOUR_SORTED_VAR_POSITIONS );
    Equality.identity( $sym0$V_COLOUR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_v_colour$.getGlobalValue(), Symbols.symbol_function( $sym29$VISIT_DEFSTRUCT_OBJECT_V_COLOUR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_arc$.getGlobalValue(), Symbols.symbol_function( $sym38$ARC_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list39 );
    Structures.def_csetf( $sym40$ARC_HEAD, $sym41$_CSETF_ARC_HEAD );
    Structures.def_csetf( $sym42$ARC_COLOUR, $sym43$_CSETF_ARC_COLOUR );
    Equality.identity( $sym31$ARC );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arc$.getGlobalValue(), Symbols.symbol_function( $sym47$VISIT_DEFSTRUCT_OBJECT_ARC_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_vertex$.getGlobalValue(), Symbols.symbol_function( $sym57$VERTEX_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list58 );
    Structures.def_csetf( $sym59$VERTEX_ID, $sym60$_CSETF_VERTEX_ID );
    Structures.def_csetf( $sym61$VERTEX_COLOUR, $sym62$_CSETF_VERTEX_COLOUR );
    Structures.def_csetf( $sym63$VERTEX_ARC_SET, $sym64$_CSETF_VERTEX_ARC_SET );
    Equality.identity( $sym50$VERTEX );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_vertex$.getGlobalValue(), Symbols.symbol_function( $sym68$VISIT_DEFSTRUCT_OBJECT_VERTEX_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_graph_search_node$.getGlobalValue(), Symbols.symbol_function( $sym83$GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list84 );
    Structures.def_csetf( $sym85$GRAPH_SEARCH_NODE_VERTEX, $sym86$_CSETF_GRAPH_SEARCH_NODE_VERTEX );
    Structures.def_csetf( $sym87$GRAPH_SEARCH_NODE_SEARCH_HISTORY, $sym88$_CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY );
    Equality.identity( $sym76$GRAPH_SEARCH_NODE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_graph_search_node$.getGlobalValue(), Symbols.symbol_function(
        $sym92$VISIT_DEFSTRUCT_OBJECT_GRAPH_SEARCH_NODE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_czer_graph_file();
  }

  @Override
  public void initializeVariables()
  {
    init_czer_graph_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_czer_graph_file();
  }
  static
  {
    me = new czer_graph();
    $dtp_v_colour$ = null;
    $dtp_arc$ = null;
    $dtp_vertex$ = null;
    $dtp_graph_search_node$ = null;
    $sym0$V_COLOUR = makeSymbol( "V-COLOUR" );
    $sym1$V_COLOUR_P = makeSymbol( "V-COLOUR-P" );
    $list2 = ConsesLow.list( makeSymbol( "SORTED-CONSTANT-LIST" ), makeSymbol( "SORTED-NAT-LIST" ), makeSymbol( "SORTED-ASSERTION-LIST" ), makeSymbol( "LIST-STRUCTURE" ), makeSymbol( "SORTED-VAR-POSITIONS" ) );
    $list3 = ConsesLow.list( makeKeyword( "SORTED-CONSTANT-LIST" ), makeKeyword( "SORTED-NAT-LIST" ), makeKeyword( "SORTED-ASSERTION-LIST" ), makeKeyword( "LIST-STRUCTURE" ), makeKeyword( "SORTED-VAR-POSITIONS" ) );
    $list4 = ConsesLow.list( makeSymbol( "V-COLOUR-SORTED-CONSTANT-LIST" ), makeSymbol( "V-COLOUR-SORTED-NAT-LIST" ), makeSymbol( "V-COLOUR-SORTED-ASSERTION-LIST" ), makeSymbol( "V-COLOUR-LIST-STRUCTURE" ), makeSymbol(
        "V-COLOUR-SORTED-VAR-POSITIONS" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-V-COLOUR-SORTED-CONSTANT-LIST" ), makeSymbol( "_CSETF-V-COLOUR-SORTED-NAT-LIST" ), makeSymbol( "_CSETF-V-COLOUR-SORTED-ASSERTION-LIST" ), makeSymbol(
        "_CSETF-V-COLOUR-LIST-STRUCTURE" ), makeSymbol( "_CSETF-V-COLOUR-SORTED-VAR-POSITIONS" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$V_COLOUR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "V-COLOUR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "V-COLOUR-P" ) );
    $sym9$V_COLOUR_SORTED_CONSTANT_LIST = makeSymbol( "V-COLOUR-SORTED-CONSTANT-LIST" );
    $sym10$_CSETF_V_COLOUR_SORTED_CONSTANT_LIST = makeSymbol( "_CSETF-V-COLOUR-SORTED-CONSTANT-LIST" );
    $sym11$V_COLOUR_SORTED_NAT_LIST = makeSymbol( "V-COLOUR-SORTED-NAT-LIST" );
    $sym12$_CSETF_V_COLOUR_SORTED_NAT_LIST = makeSymbol( "_CSETF-V-COLOUR-SORTED-NAT-LIST" );
    $sym13$V_COLOUR_SORTED_ASSERTION_LIST = makeSymbol( "V-COLOUR-SORTED-ASSERTION-LIST" );
    $sym14$_CSETF_V_COLOUR_SORTED_ASSERTION_LIST = makeSymbol( "_CSETF-V-COLOUR-SORTED-ASSERTION-LIST" );
    $sym15$V_COLOUR_LIST_STRUCTURE = makeSymbol( "V-COLOUR-LIST-STRUCTURE" );
    $sym16$_CSETF_V_COLOUR_LIST_STRUCTURE = makeSymbol( "_CSETF-V-COLOUR-LIST-STRUCTURE" );
    $sym17$V_COLOUR_SORTED_VAR_POSITIONS = makeSymbol( "V-COLOUR-SORTED-VAR-POSITIONS" );
    $sym18$_CSETF_V_COLOUR_SORTED_VAR_POSITIONS = makeSymbol( "_CSETF-V-COLOUR-SORTED-VAR-POSITIONS" );
    $kw19$SORTED_CONSTANT_LIST = makeKeyword( "SORTED-CONSTANT-LIST" );
    $kw20$SORTED_NAT_LIST = makeKeyword( "SORTED-NAT-LIST" );
    $kw21$SORTED_ASSERTION_LIST = makeKeyword( "SORTED-ASSERTION-LIST" );
    $kw22$LIST_STRUCTURE = makeKeyword( "LIST-STRUCTURE" );
    $kw23$SORTED_VAR_POSITIONS = makeKeyword( "SORTED-VAR-POSITIONS" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_V_COLOUR = makeSymbol( "MAKE-V-COLOUR" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_V_COLOUR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-V-COLOUR-METHOD" );
    $sym30$V_COLOUR_AS_LIST = makeSymbol( "V-COLOUR-AS-LIST" );
    $sym31$ARC = makeSymbol( "ARC" );
    $sym32$ARC_P = makeSymbol( "ARC-P" );
    $list33 = ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "COLOUR" ) );
    $list34 = ConsesLow.list( makeKeyword( "HEAD" ), makeKeyword( "COLOUR" ) );
    $list35 = ConsesLow.list( makeSymbol( "ARC-HEAD" ), makeSymbol( "ARC-COLOUR" ) );
    $list36 = ConsesLow.list( makeSymbol( "_CSETF-ARC-HEAD" ), makeSymbol( "_CSETF-ARC-COLOUR" ) );
    $sym37$PRINT_ARC = makeSymbol( "PRINT-ARC" );
    $sym38$ARC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ARC-PRINT-FUNCTION-TRAMPOLINE" );
    $list39 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ARC-P" ) );
    $sym40$ARC_HEAD = makeSymbol( "ARC-HEAD" );
    $sym41$_CSETF_ARC_HEAD = makeSymbol( "_CSETF-ARC-HEAD" );
    $sym42$ARC_COLOUR = makeSymbol( "ARC-COLOUR" );
    $sym43$_CSETF_ARC_COLOUR = makeSymbol( "_CSETF-ARC-COLOUR" );
    $kw44$HEAD = makeKeyword( "HEAD" );
    $kw45$COLOUR = makeKeyword( "COLOUR" );
    $sym46$MAKE_ARC = makeSymbol( "MAKE-ARC" );
    $sym47$VISIT_DEFSTRUCT_OBJECT_ARC_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ARC-METHOD" );
    $str48$__ARC__a_ = makeString( "#<ARC:~a>" );
    $kw49$VARIABLE = makeKeyword( "VARIABLE" );
    $sym50$VERTEX = makeSymbol( "VERTEX" );
    $sym51$VERTEX_P = makeSymbol( "VERTEX-P" );
    $list52 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "COLOUR" ), makeSymbol( "ARC-SET" ) );
    $list53 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "COLOUR" ), makeKeyword( "ARC-SET" ) );
    $list54 = ConsesLow.list( makeSymbol( "VERTEX-ID" ), makeSymbol( "VERTEX-COLOUR" ), makeSymbol( "VERTEX-ARC-SET" ) );
    $list55 = ConsesLow.list( makeSymbol( "_CSETF-VERTEX-ID" ), makeSymbol( "_CSETF-VERTEX-COLOUR" ), makeSymbol( "_CSETF-VERTEX-ARC-SET" ) );
    $sym56$PRINT_VERTEX = makeSymbol( "PRINT-VERTEX" );
    $sym57$VERTEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "VERTEX-PRINT-FUNCTION-TRAMPOLINE" );
    $list58 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "VERTEX-P" ) );
    $sym59$VERTEX_ID = makeSymbol( "VERTEX-ID" );
    $sym60$_CSETF_VERTEX_ID = makeSymbol( "_CSETF-VERTEX-ID" );
    $sym61$VERTEX_COLOUR = makeSymbol( "VERTEX-COLOUR" );
    $sym62$_CSETF_VERTEX_COLOUR = makeSymbol( "_CSETF-VERTEX-COLOUR" );
    $sym63$VERTEX_ARC_SET = makeSymbol( "VERTEX-ARC-SET" );
    $sym64$_CSETF_VERTEX_ARC_SET = makeSymbol( "_CSETF-VERTEX-ARC-SET" );
    $kw65$ID = makeKeyword( "ID" );
    $kw66$ARC_SET = makeKeyword( "ARC-SET" );
    $sym67$MAKE_VERTEX = makeSymbol( "MAKE-VERTEX" );
    $sym68$VISIT_DEFSTRUCT_OBJECT_VERTEX_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-VERTEX-METHOD" );
    $str69$__VERTEX__a_ = makeString( "#<VERTEX:~a>" );
    $str70$vertex_number__a_not_found = makeString( "vertex number ~a not found" );
    $sym71$ARC_AS_SORTABLE_LIST = makeSymbol( "ARC-AS-SORTABLE-LIST" );
    $sym72$ARC_AS_UNIFIABLE_LIST = makeSymbol( "ARC-AS-UNIFIABLE-LIST" );
    $sym73$NART_ID = makeSymbol( "NART-ID" );
    $sym74$ASSERTION_ID = makeSymbol( "ASSERTION-ID" );
    $sym75$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym76$GRAPH_SEARCH_NODE = makeSymbol( "GRAPH-SEARCH-NODE" );
    $sym77$GRAPH_SEARCH_NODE_P = makeSymbol( "GRAPH-SEARCH-NODE-P" );
    $list78 = ConsesLow.list( makeSymbol( "VERTEX" ), makeSymbol( "SEARCH-HISTORY" ) );
    $list79 = ConsesLow.list( makeKeyword( "VERTEX" ), makeKeyword( "SEARCH-HISTORY" ) );
    $list80 = ConsesLow.list( makeSymbol( "GRAPH-SEARCH-NODE-VERTEX" ), makeSymbol( "GRAPH-SEARCH-NODE-SEARCH-HISTORY" ) );
    $list81 = ConsesLow.list( makeSymbol( "_CSETF-GRAPH-SEARCH-NODE-VERTEX" ), makeSymbol( "_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY" ) );
    $sym82$PRINT_GRAPH_SEARCH_NODE = makeSymbol( "PRINT-GRAPH-SEARCH-NODE" );
    $sym83$GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "GRAPH-SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE" );
    $list84 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "GRAPH-SEARCH-NODE-P" ) );
    $sym85$GRAPH_SEARCH_NODE_VERTEX = makeSymbol( "GRAPH-SEARCH-NODE-VERTEX" );
    $sym86$_CSETF_GRAPH_SEARCH_NODE_VERTEX = makeSymbol( "_CSETF-GRAPH-SEARCH-NODE-VERTEX" );
    $sym87$GRAPH_SEARCH_NODE_SEARCH_HISTORY = makeSymbol( "GRAPH-SEARCH-NODE-SEARCH-HISTORY" );
    $sym88$_CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY = makeSymbol( "_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY" );
    $kw89$VERTEX = makeKeyword( "VERTEX" );
    $kw90$SEARCH_HISTORY = makeKeyword( "SEARCH-HISTORY" );
    $sym91$MAKE_GRAPH_SEARCH_NODE = makeSymbol( "MAKE-GRAPH-SEARCH-NODE" );
    $sym92$VISIT_DEFSTRUCT_OBJECT_GRAPH_SEARCH_NODE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-GRAPH-SEARCH-NODE-METHOD" );
    $str93$__NODE__s__s_ = makeString( "#<NODE:~s ~s>" );
    $sym94$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym95$INERT_VARIABLE = makeSymbol( "INERT-VARIABLE" );
    $kw96$ARC = makeKeyword( "ARC" );
    $kw97$VERTEX_INFO = makeKeyword( "VERTEX-INFO" );
    $str98$graph_search_node___failed_to_com = makeString( "graph-search-node-< failed to compare nodes ~%~s and ~%~s" );
    $sym99$GRAPH_SEARCH_NODE__ = makeSymbol( "GRAPH-SEARCH-NODE-<" );
    $str100$min_graph_search_node_failed_on_n = makeString( "min-graph-search-node failed on nodes ~s" );
    $sym101$GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS = makeSymbol( "GRAPH-SEARCH-NODE-AS-UNIFIABLE-SETS" );
    $sym102$GRAPH_SEARCH_NODE_AS_SORTABLE_SETS = makeSymbol( "GRAPH-SEARCH-NODE-AS-SORTABLE-SETS" );
    $sym103$VERTEX_SEARCH_STATE__ = makeSymbol( "VERTEX-SEARCH-STATE-<" );
    $sym104$SORTED_CONSTANT_EXTERNAL_ID_LIST = makeSymbol( "SORTED-CONSTANT-EXTERNAL-ID-LIST" );
    $sym105$GUID_TREE__ = makeSymbol( "GUID-TREE-<" );
    $sym106$SAFE_GUID_ = makeSymbol( "SAFE-GUID<" );
    $sym107$SAFE_GUID_ = makeSymbol( "SAFE-GUID=" );
  }

  public static final class $v_colour_native
      extends
        SubLStructNative
  {
    public SubLObject $sorted_constant_list;
    public SubLObject $sorted_nat_list;
    public SubLObject $sorted_assertion_list;
    public SubLObject $list_structure;
    public SubLObject $sorted_var_positions;
    private static final SubLStructDeclNative structDecl;

    public $v_colour_native()
    {
      this.$sorted_constant_list = CommonSymbols.NIL;
      this.$sorted_nat_list = CommonSymbols.NIL;
      this.$sorted_assertion_list = CommonSymbols.NIL;
      this.$list_structure = CommonSymbols.NIL;
      this.$sorted_var_positions = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $v_colour_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sorted_constant_list;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$sorted_nat_list;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$sorted_assertion_list;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$list_structure;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$sorted_var_positions;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sorted_constant_list = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$sorted_nat_list = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$sorted_assertion_list = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$list_structure = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$sorted_var_positions = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $v_colour_native.class, $sym0$V_COLOUR, $sym1$V_COLOUR_P, $list2, $list3, new String[] { "$sorted_constant_list", "$sorted_nat_list", "$sorted_assertion_list",
        "$list_structure", "$sorted_var_positions"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $v_colour_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $v_colour_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "V-COLOUR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return v_colour_p( arg1 );
    }
  }

  public static final class $arc_native
      extends
        SubLStructNative
  {
    public SubLObject $head;
    public SubLObject $colour;
    private static final SubLStructDeclNative structDecl;

    public $arc_native()
    {
      this.$head = CommonSymbols.NIL;
      this.$colour = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $arc_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$head;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$colour;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$head = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$colour = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $arc_native.class, $sym31$ARC, $sym32$ARC_P, $list33, $list34, new String[] { "$head", "$colour"
      }, $list35, $list36, $sym37$PRINT_ARC );
    }
  }

  public static final class $arc_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $arc_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ARC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return arc_p( arg1 );
    }
  }

  public static final class $vertex_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $colour;
    public SubLObject $arc_set;
    private static final SubLStructDeclNative structDecl;

    public $vertex_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$colour = CommonSymbols.NIL;
      this.$arc_set = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $vertex_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$colour;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$arc_set;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$colour = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$arc_set = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $vertex_native.class, $sym50$VERTEX, $sym51$VERTEX_P, $list52, $list53, new String[] { "$id", "$colour", "$arc_set"
      }, $list54, $list55, $sym56$PRINT_VERTEX );
    }
  }

  public static final class $vertex_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $vertex_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VERTEX-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return vertex_p( arg1 );
    }
  }

  public static final class $graph_search_node_native
      extends
        SubLStructNative
  {
    public SubLObject $vertex;
    public SubLObject $search_history;
    private static final SubLStructDeclNative structDecl;

    public $graph_search_node_native()
    {
      this.$vertex = CommonSymbols.NIL;
      this.$search_history = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $graph_search_node_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$vertex;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$search_history;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$vertex = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$search_history = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $graph_search_node_native.class, $sym76$GRAPH_SEARCH_NODE, $sym77$GRAPH_SEARCH_NODE_P, $list78, $list79, new String[] { "$vertex", "$search_history"
      }, $list80, $list81, $sym82$PRINT_GRAPH_SEARCH_NODE );
    }
  }

  public static final class $graph_search_node_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $graph_search_node_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GRAPH-SEARCH-NODE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return graph_search_node_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 298 ms
 * 
 */