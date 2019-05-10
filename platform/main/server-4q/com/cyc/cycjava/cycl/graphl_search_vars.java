package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class graphl_search_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.graphl_search_vars";
  public static final String myFingerPrint = "787b964ddc428f0630d3646a5d25419092e95d75700a3fd11bd371468974eec3";
  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLSymbol $dtp_graphl_search$;
  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11269L)
  public static SubLSymbol $use_zero_size_graphl_marking_spacesP$;
  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11407L)
  private static SubLSymbol $graphl_search_size$;
  private static final SubLSymbol $sym0$GRAPHL_SEARCH;
  private static final SubLSymbol $sym1$GRAPHL_SEARCH_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_GRAPHL_SEARCH;
  private static final SubLSymbol $sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$GRAPHL_SEARCH_TYPE;
  private static final SubLSymbol $sym10$_CSETF_GRAPHL_SEARCH_TYPE;
  private static final SubLSymbol $sym11$GRAPHL_SEARCH_ORDER;
  private static final SubLSymbol $sym12$_CSETF_GRAPHL_SEARCH_ORDER;
  private static final SubLSymbol $sym13$GRAPHL_SEARCH_CUTOFF;
  private static final SubLSymbol $sym14$_CSETF_GRAPHL_SEARCH_CUTOFF;
  private static final SubLSymbol $sym15$GRAPHL_SEARCH_MARKING;
  private static final SubLSymbol $sym16$_CSETF_GRAPHL_SEARCH_MARKING;
  private static final SubLSymbol $sym17$GRAPHL_SEARCH_MARKING_SPACE;
  private static final SubLSymbol $sym18$_CSETF_GRAPHL_SEARCH_MARKING_SPACE;
  private static final SubLSymbol $sym19$GRAPHL_SEARCH_GOAL_SPACE;
  private static final SubLSymbol $sym20$_CSETF_GRAPHL_SEARCH_GOAL_SPACE;
  private static final SubLSymbol $sym21$GRAPHL_SEARCH_GOAL;
  private static final SubLSymbol $sym22$_CSETF_GRAPHL_SEARCH_GOAL;
  private static final SubLSymbol $sym23$GRAPHL_SEARCH_GOAL_FN;
  private static final SubLSymbol $sym24$_CSETF_GRAPHL_SEARCH_GOAL_FN;
  private static final SubLSymbol $sym25$GRAPHL_SEARCH_GOAL_FOUND_P;
  private static final SubLSymbol $sym26$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P;
  private static final SubLSymbol $sym27$GRAPHL_SEARCH_SATISFY_FN;
  private static final SubLSymbol $sym28$_CSETF_GRAPHL_SEARCH_SATISFY_FN;
  private static final SubLSymbol $sym29$GRAPHL_SEARCH_MAP_FN;
  private static final SubLSymbol $sym30$_CSETF_GRAPHL_SEARCH_MAP_FN;
  private static final SubLSymbol $sym31$GRAPHL_SEARCH_JUSTIFY_;
  private static final SubLSymbol $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_;
  private static final SubLSymbol $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_;
  private static final SubLSymbol $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_;
  private static final SubLSymbol $sym35$GRAPHL_SEARCH_UNWIND_FN_TOGGLE;
  private static final SubLSymbol $sym36$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE;
  private static final SubLSymbol $sym37$GRAPHL_SEARCH_RESULT;
  private static final SubLSymbol $sym38$_CSETF_GRAPHL_SEARCH_RESULT;
  private static final SubLSymbol $sym39$GRAPHL_SEARCH_GRAPH;
  private static final SubLSymbol $sym40$_CSETF_GRAPHL_SEARCH_GRAPH;
  private static final SubLSymbol $kw41$TYPE;
  private static final SubLSymbol $kw42$ORDER;
  private static final SubLSymbol $kw43$CUTOFF;
  private static final SubLSymbol $kw44$MARKING;
  private static final SubLSymbol $kw45$MARKING_SPACE;
  private static final SubLSymbol $kw46$GOAL_SPACE;
  private static final SubLSymbol $kw47$GOAL;
  private static final SubLSymbol $kw48$GOAL_FN;
  private static final SubLSymbol $kw49$GOAL_FOUND_P;
  private static final SubLSymbol $kw50$SATISFY_FN;
  private static final SubLSymbol $kw51$MAP_FN;
  private static final SubLSymbol $kw52$JUSTIFY_;
  private static final SubLSymbol $kw53$ADD_TO_RESULT_;
  private static final SubLSymbol $kw54$UNWIND_FN_TOGGLE;
  private static final SubLSymbol $kw55$RESULT;
  private static final SubLSymbol $kw56$GRAPH;
  private static final SubLString $str57$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw58$BEGIN;
  private static final SubLSymbol $sym59$MAKE_GRAPHL_SEARCH;
  private static final SubLSymbol $kw60$SLOT;
  private static final SubLSymbol $kw61$END;
  private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD;
  private static final SubLString $str63$GraphL_Search____a__;
  private static final SubLString $str64$Type____a__;
  private static final SubLString $str65$Order____a__;
  private static final SubLString $str66$Cutoff____a__;
  private static final SubLString $str67$Marking____a__;
  private static final SubLString $str68$Space____a__;
  private static final SubLString $str69$Goal_Space____a__;
  private static final SubLString $str70$Goal____a__;
  private static final SubLString $str71$Goal_Fn____a__;
  private static final SubLString $str72$Goal_Found_P____a__;
  private static final SubLString $str73$Satisfy_Fn____a__;
  private static final SubLString $str74$Map_Fn____a__;
  private static final SubLString $str75$Justify_____a__;
  private static final SubLString $str76$Add_to_Result_____a__;
  private static final SubLString $str77$Unwind_Fn_Toggle____a__;
  private static final SubLString $str78$Result____a__;
  private static final SubLString $str79$Graph____a__;
  private static final SubLSymbol $kw80$FREE;
  private static final SubLSymbol $kw81$DEPTH_FIRST;
  private static final SubLSymbol $kw82$BREADTH_FIRST;
  private static final SubLSymbol $kw83$ITERATIVE_DEEPENING;
  private static final SubLSymbol $kw84$DEPTH_MARKING;
  private static final SubLSymbol $kw85$NODES_ON_WIND;
  private static final SubLSymbol $kw86$EDGES_ON_UNWIND;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$CLET;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$SET_GRAPHL_SEARCH_PROPERTIES;
  private static final SubLSymbol $sym92$DESTROY_GRAPHL_SEARCH;
  private static final SubLSymbol $sym93$WITH_GRAPHL_SEARCH_INITIALIZED;
  private static final SubLInteger $int94$200;

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_graphl_search( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $graphl_search_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_type(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_order(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_cutoff(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_marking(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_marking_space(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_goal_space(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_goal(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_goal_fn(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_goal_found_p(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_satisfy_fn(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_map_fn(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_justifyP(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_add_to_resultP(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_unwind_fn_toggle(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_result(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject graphl_search_graph(final SubLObject v_object)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.getField17();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_order(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_cutoff(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_marking(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_marking_space(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_goal_space(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_goal(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_goal_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_goal_found_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_satisfy_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_map_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_justifyP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_add_to_resultP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_unwind_fn_toggle(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject _csetf_graphl_search_graph(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != graphl_search_p( v_object ) : v_object;
    return v_object.setField17( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject make_graphl_search(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $graphl_search_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw41$TYPE ) )
      {
        _csetf_graphl_search_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$ORDER ) )
      {
        _csetf_graphl_search_order( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$CUTOFF ) )
      {
        _csetf_graphl_search_cutoff( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$MARKING ) )
      {
        _csetf_graphl_search_marking( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$MARKING_SPACE ) )
      {
        _csetf_graphl_search_marking_space( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$GOAL_SPACE ) )
      {
        _csetf_graphl_search_goal_space( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$GOAL ) )
      {
        _csetf_graphl_search_goal( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$GOAL_FN ) )
      {
        _csetf_graphl_search_goal_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$GOAL_FOUND_P ) )
      {
        _csetf_graphl_search_goal_found_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$SATISFY_FN ) )
      {
        _csetf_graphl_search_satisfy_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$MAP_FN ) )
      {
        _csetf_graphl_search_map_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$JUSTIFY_ ) )
      {
        _csetf_graphl_search_justifyP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$ADD_TO_RESULT_ ) )
      {
        _csetf_graphl_search_add_to_resultP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$UNWIND_FN_TOGGLE ) )
      {
        _csetf_graphl_search_unwind_fn_toggle( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$RESULT ) )
      {
        _csetf_graphl_search_result( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$GRAPH ) )
      {
        _csetf_graphl_search_graph( v_new, current_value );
      }
      else
      {
        Errors.error( $str57$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject visit_defstruct_graphl_search(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw58$BEGIN, $sym59$MAKE_GRAPHL_SEARCH, SIXTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw41$TYPE, graphl_search_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw42$ORDER, graphl_search_order( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw43$CUTOFF, graphl_search_cutoff( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw44$MARKING, graphl_search_marking( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw45$MARKING_SPACE, graphl_search_marking_space( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw46$GOAL_SPACE, graphl_search_goal_space( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw47$GOAL, graphl_search_goal( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw48$GOAL_FN, graphl_search_goal_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw49$GOAL_FOUND_P, graphl_search_goal_found_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw50$SATISFY_FN, graphl_search_satisfy_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw51$MAP_FN, graphl_search_map_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw52$JUSTIFY_, graphl_search_justifyP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw53$ADD_TO_RESULT_, graphl_search_add_to_resultP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw54$UNWIND_FN_TOGGLE, graphl_search_unwind_fn_toggle( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw55$RESULT, graphl_search_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw56$GRAPH, graphl_search_graph( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$END, $sym59$MAKE_GRAPHL_SEARCH, SIXTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 848L)
  public static SubLObject visit_defstruct_object_graphl_search_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_graphl_search( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 1148L)
  public static SubLObject print_graphl_search(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
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

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 1301L)
  public static SubLObject describe_graphl_search(final SubLObject v_object)
  {
    PrintLow.format( T, $str63$GraphL_Search____a__, v_object );
    PrintLow.format( T, $str64$Type____a__, graphl_search_type( v_object ) );
    PrintLow.format( T, $str65$Order____a__, graphl_search_order( v_object ) );
    PrintLow.format( T, $str66$Cutoff____a__, graphl_search_cutoff( v_object ) );
    PrintLow.format( T, $str67$Marking____a__, graphl_search_marking( v_object ) );
    PrintLow.format( T, $str68$Space____a__, graphl_search_marking_space( v_object ) );
    PrintLow.format( T, $str69$Goal_Space____a__, graphl_search_goal_space( v_object ) );
    PrintLow.format( T, $str70$Goal____a__, graphl_search_goal( v_object ) );
    PrintLow.format( T, $str71$Goal_Fn____a__, graphl_search_goal_fn( v_object ) );
    PrintLow.format( T, $str72$Goal_Found_P____a__, graphl_search_goal_found_p( v_object ) );
    PrintLow.format( T, $str73$Satisfy_Fn____a__, graphl_search_satisfy_fn( v_object ) );
    PrintLow.format( T, $str74$Map_Fn____a__, graphl_search_map_fn( v_object ) );
    PrintLow.format( T, $str75$Justify_____a__, graphl_search_justifyP( v_object ) );
    PrintLow.format( T, $str76$Add_to_Result_____a__, graphl_search_add_to_resultP( v_object ) );
    PrintLow.format( T, $str77$Unwind_Fn_Toggle____a__, graphl_search_unwind_fn_toggle( v_object ) );
    PrintLow.format( T, $str78$Result____a__, graphl_search_result( v_object ) );
    PrintLow.format( T, $str79$Graph____a__, graphl_search_graph( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 2424L)
  public static SubLObject new_graphl_search(final SubLObject plist)
  {
    final SubLObject graphl_search = make_graphl_search( UNPROVIDED );
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      set_graphl_search_property( graphl_search, property, value );
    }
    possibly_initialize_graphl_marking_spaces( graphl_search );
    set_graphl_search_result( graphl_search, NIL );
    return graphl_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 2772L)
  public static SubLObject destroy_graphl_search(final SubLObject graph_search)
  {
    _csetf_graphl_search_marking_space( graph_search, $kw80$FREE );
    _csetf_graphl_search_result( graph_search, $kw80$FREE );
    _csetf_graphl_search_graph( graph_search, $kw80$FREE );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3031L)
  public static SubLObject graphl_type(final SubLObject v_search)
  {
    return graphl_search_type( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3133L)
  public static SubLObject graphl_order(final SubLObject v_search)
  {
    return graphl_search_order( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3212L)
  public static SubLObject graphl_marking(final SubLObject v_search)
  {
    return graphl_search_marking( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3295L)
  public static SubLObject graphl_space(final SubLObject v_search)
  {
    return graphl_search_marking_space( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3382L)
  public static SubLObject graphl_goal(final SubLObject v_search)
  {
    return graphl_search_goal( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3459L)
  public static SubLObject graphl_goal_space(final SubLObject v_search)
  {
    return graphl_search_goal_space( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3548L)
  public static SubLObject graphl_goal_found_p(final SubLObject v_search)
  {
    return graphl_search_goal_found_p( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3641L)
  public static SubLObject graphl_map_fn(final SubLObject v_search)
  {
    return graphl_search_map_fn( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3722L)
  public static SubLObject graphl_compute_justifyP(final SubLObject v_search)
  {
    return graphl_search_justifyP( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3815L)
  public static SubLObject graphl_cutoff(final SubLObject v_search)
  {
    return graphl_search_cutoff( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3896L)
  public static SubLObject graphl_add_to_resultP(final SubLObject v_search)
  {
    return graphl_search_add_to_resultP( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 3993L)
  public static SubLObject graphl_result(final SubLObject v_search)
  {
    return graphl_search_result( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4074L)
  public static SubLObject graphl_depth_first_search_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_order( v_search ), $kw81$DEPTH_FIRST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4198L)
  public static SubLObject graphl_breadth_first_search_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_order( v_search ), $kw82$BREADTH_FIRST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4304L)
  public static SubLObject graphl_iterative_deepening_search_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_order( v_search ), $kw83$ITERATIVE_DEEPENING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4422L)
  public static SubLObject graphl_depth_marking_search_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_marking( v_search ), $kw84$DEPTH_MARKING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4530L)
  public static SubLObject graphl_return_one_answer_p(final SubLObject v_search)
  {
    return graphl_goal_search_p( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4624L)
  public static SubLObject graphl_add_nodes_on_wind_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_add_to_resultP( v_search ), $kw85$NODES_ON_WIND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4739L)
  public static SubLObject graphl_add_edges_on_unwind_p(final SubLObject v_search)
  {
    return Equality.eq( graphl_add_to_resultP( v_search ), $kw86$EDGES_ON_UNWIND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 4879L)
  public static SubLObject graphl_goal_search_p(final SubLObject v_search)
  {
    return makeBoolean( NIL != graphl_search_goal( v_search ) || NIL != graphl_search_goal_fn( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5028L)
  public static SubLObject graphl_single_goal_p(final SubLObject v_search)
  {
    return Types.atom( graphl_goal( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5114L)
  public static SubLObject graphl_multiple_goals_p(final SubLObject v_search)
  {
    return Types.listp( graphl_goal( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5206L)
  public static SubLObject graphl_goal_fn_p(final SubLObject v_search)
  {
    return Types.function_spec_p( graphl_search_goal_fn( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5309L)
  public static SubLObject graphl_map_p(final SubLObject v_search)
  {
    return list_utilities.sublisp_boolean( graphl_map_fn( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5392L)
  public static SubLObject graphl_depth_cutoff(final SubLObject v_search)
  {
    return graphl_search_cutoff( v_search );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5479L)
  public static SubLObject graphl_cutoff_search_p(final SubLObject v_search)
  {
    return list_utilities.sublisp_boolean( graphl_search_cutoff( v_search ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5597L)
  public static SubLObject valid_graphl_search_order_p(final SubLObject order)
  {
    return makeBoolean( order == $kw81$DEPTH_FIRST || order == $kw82$BREADTH_FIRST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5764L)
  public static SubLObject valid_graphl_cutoff_p(final SubLObject cutoff)
  {
    return makeBoolean( NIL == cutoff || cutoff == $kw47$GOAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5863L)
  public static SubLObject valid_graphl_marking_style_p(final SubLObject marking)
  {
    return subl_promotions.memberP( marking, $list87, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 5971L)
  public static SubLObject graphl_table_p(final SubLObject obj)
  {
    return Types.hash_table_p( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 6121L)
  public static SubLObject with_graphl_search_initialized(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject search_var = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    search_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    plist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym89$CLET, ConsesLow.list( reader.bq_cons( search_var, $list90 ) ), ConsesLow.list( $sym91$SET_GRAPHL_SEARCH_PROPERTIES, search_var, plist ), ConsesLow.append( body, ConsesLow.list(
        ConsesLow.list( $sym92$DESTROY_GRAPHL_SEARCH, search_var ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 6374L)
  public static SubLObject set_graphl_search_properties(final SubLObject v_search, final SubLObject plist)
  {
    SubLObject remainder;
    SubLObject prop;
    SubLObject val;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      prop = remainder.first();
      val = conses_high.cadr( remainder );
      set_graphl_search_property( v_search, prop, val );
    }
    return v_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 6578L)
  public static SubLObject set_graphl_search_property(final SubLObject v_search, final SubLObject property, final SubLObject value)
  {
    if( property.eql( $kw41$TYPE ) )
    {
      _csetf_graphl_search_type( v_search, value );
    }
    else if( property.eql( $kw42$ORDER ) )
    {
      _csetf_graphl_search_order( v_search, value );
    }
    else if( property.eql( $kw43$CUTOFF ) )
    {
      _csetf_graphl_search_cutoff( v_search, value );
    }
    else if( property.eql( $kw44$MARKING ) )
    {
      _csetf_graphl_search_marking( v_search, value );
    }
    else if( property.eql( $kw45$MARKING_SPACE ) )
    {
      _csetf_graphl_search_marking_space( v_search, value );
    }
    else if( property.eql( $kw47$GOAL ) )
    {
      _csetf_graphl_search_goal( v_search, value );
    }
    else if( property.eql( $kw48$GOAL_FN ) )
    {
      _csetf_graphl_search_goal_fn( v_search, value );
    }
    else if( property.eql( $kw46$GOAL_SPACE ) )
    {
      _csetf_graphl_search_goal_space( v_search, value );
    }
    else if( property.eql( $kw50$SATISFY_FN ) )
    {
      _csetf_graphl_search_satisfy_fn( v_search, value );
    }
    else if( property.eql( $kw51$MAP_FN ) )
    {
      _csetf_graphl_search_map_fn( v_search, value );
    }
    else if( property.eql( $kw52$JUSTIFY_ ) )
    {
      _csetf_graphl_search_justifyP( v_search, value );
    }
    else if( property.eql( $kw53$ADD_TO_RESULT_ ) )
    {
      _csetf_graphl_search_add_to_resultP( v_search, value );
    }
    else if( property.eql( $kw54$UNWIND_FN_TOGGLE ) )
    {
      _csetf_graphl_search_unwind_fn_toggle( v_search, value );
    }
    return v_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 7651L)
  public static SubLObject set_graphl_search_type(final SubLObject v_search, final SubLObject type)
  {
    _csetf_graphl_search_type( v_search, type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 7848L)
  public static SubLObject set_graphl_search_order(final SubLObject v_search, final SubLObject order)
  {
    _csetf_graphl_search_order( v_search, order );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 7964L)
  public static SubLObject set_graphl_search_cutoff(final SubLObject v_search, final SubLObject cutoff_type)
  {
    _csetf_graphl_search_cutoff( v_search, cutoff_type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8094L)
  public static SubLObject set_graphl_search_marking(final SubLObject v_search, final SubLObject marking)
  {
    _csetf_graphl_search_marking( v_search, marking );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8218L)
  public static SubLObject set_graphl_search_marking_space(final SubLObject v_search, final SubLObject marking_space)
  {
    _csetf_graphl_search_marking_space( v_search, marking_space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8366L)
  public static SubLObject set_graphl_search_goal(final SubLObject v_search, final SubLObject goal)
  {
    _csetf_graphl_search_goal( v_search, goal );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8478L)
  public static SubLObject set_graphl_search_goal_fn(final SubLObject v_search, final SubLObject goal_fn)
  {
    _csetf_graphl_search_goal_fn( v_search, goal_fn );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8602L)
  public static SubLObject set_graphl_search_goal_found_p(final SubLObject v_search, final SubLObject found_p)
  {
    _csetf_graphl_search_goal_found_p( v_search, found_p );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8736L)
  public static SubLObject set_graphl_search_goal_space(final SubLObject v_search, final SubLObject goal_space)
  {
    _csetf_graphl_search_goal_space( v_search, goal_space );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 8872L)
  public static SubLObject set_graphl_search_satisfy_fn(final SubLObject v_search, final SubLObject satisfy_fn)
  {
    _csetf_graphl_search_satisfy_fn( v_search, satisfy_fn );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9008L)
  public static SubLObject set_graphl_search_map_fn(final SubLObject v_search, final SubLObject map_fn)
  {
    _csetf_graphl_search_map_fn( v_search, map_fn );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9128L)
  public static SubLObject set_graphl_search_justifyP(final SubLObject v_search, final SubLObject justifyP)
  {
    _csetf_graphl_search_justifyP( v_search, justifyP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9256L)
  public static SubLObject set_graphl_search_result(final SubLObject v_search, final SubLObject result)
  {
    _csetf_graphl_search_result( v_search, result );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9376L)
  public static SubLObject set_graphl_search_add_to_resultP(final SubLObject v_search, final SubLObject addP)
  {
    _csetf_graphl_search_add_to_resultP( v_search, addP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9508L)
  public static SubLObject possibly_initialize_graphl_marking_spaces(final SubLObject v_search)
  {
    final SubLObject space = graphl_search_marking_space( v_search );
    if( NIL == space )
    {
      _csetf_graphl_search_marking_space( v_search, graphl_instantiate_new_space() );
    }
    return v_search;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9773L)
  public static SubLObject reinitialize_graphl_spaces(final SubLObject v_search)
  {
    _csetf_graphl_search_marking_space( v_search, graphl_instantiate_new_space() );
    _csetf_graphl_search_goal_space( v_search, graphl_instantiate_new_space() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 9994L)
  public static SubLObject graphl_add_node_to_result(final SubLObject v_search, final SubLObject node)
  {
    _csetf_graphl_search_result( v_search, ConsesLow.cons( node, graphl_search_result( v_search ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10136L)
  public static SubLObject graphl_add_to_result(final SubLObject v_search, final SubLObject addition, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQ );
    }
    if( NIL == conses_high.member( addition, graphl_search_result( v_search ), test, Symbols.symbol_function( IDENTITY ) ) )
    {
      _csetf_graphl_search_result( v_search, ConsesLow.cons( addition, graphl_search_result( v_search ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10329L)
  public static SubLObject graphl_append_to_result(final SubLObject v_search, final SubLObject addition)
  {
    set_graphl_search_result( v_search, ConsesLow.append( graphl_search_result( v_search ), addition ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10487L)
  public static SubLObject graphl_toggle_unwind_off(final SubLObject v_search)
  {
    _csetf_graphl_search_unwind_fn_toggle( v_search, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10643L)
  public static SubLObject graphl_toggle_unwind_on(final SubLObject v_search)
  {
    _csetf_graphl_search_unwind_fn_toggle( v_search, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 10760L)
  public static SubLObject graphl_node_provides_answer_p(final SubLObject v_search, final SubLObject node)
  {
    if( NIL != graphl_single_goal_p( v_search ) )
    {
      if( graphl_search_goal( v_search ) == $kw50$SATISFY_FN )
      {
        return Functions.funcall( graphl_search_satisfy_fn( v_search ), node );
      }
      return Equality.eq( node, graphl_search_goal( v_search ) );
    }
    else
    {
      if( NIL != graphl_multiple_goals_p( v_search ) )
      {
        return subl_promotions.memberP( node, graphl_search_goal( v_search ), UNPROVIDED, UNPROVIDED );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11454L)
  public static SubLObject graphl_search_size()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $use_zero_size_graphl_marking_spacesP$.getDynamicValue( thread ) ) ? ZERO_INTEGER : $graphl_search_size$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11572L)
  public static SubLObject graphl_instantiate_new_space()
  {
    return Hashtables.make_hash_table( graphl_search_size(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/graphl-search-vars.lisp", position = 11671L)
  public static SubLObject graphl_goal_found_condition_p(final SubLObject condition)
  {
    return Equality.eq( condition, $kw47$GOAL );
  }

  public static SubLObject declare_graphl_search_vars_file()
  {
    SubLFiles.declareFunction( me, "graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false );
    new $graphl_search_p$UnaryFunction();
    SubLFiles.declareFunction( me, "graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_graphl_search", "VISIT-DEFSTRUCT-GRAPHL-SEARCH", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_graphl_search_method", "VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false );
    SubLFiles.declareFunction( me, "describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_type", "GRAPHL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_order", "GRAPHL-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_marking", "GRAPHL-MARKING", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_space", "GRAPHL-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_goal", "GRAPHL-GOAL", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_result", "GRAPHL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_map_p", "GRAPHL-MAP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED" );
    SubLFiles.declareFunction( me, "set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false );
    SubLFiles.declareFunction( me, "reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false );
    SubLFiles.declareFunction( me, "graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false );
    SubLFiles.declareFunction( me, "graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_graphl_search_vars_file()
  {
    $dtp_graphl_search$ = SubLFiles.defconstant( "*DTP-GRAPHL-SEARCH*", $sym0$GRAPHL_SEARCH );
    $use_zero_size_graphl_marking_spacesP$ = SubLFiles.defparameter( "*USE-ZERO-SIZE-GRAPHL-MARKING-SPACES?*", NIL );
    $graphl_search_size$ = SubLFiles.deflexical( "*GRAPHL-SEARCH-SIZE*", $int94$200 );
    return NIL;
  }

  public static SubLObject setup_graphl_search_vars_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_graphl_search$.getGlobalValue(), Symbols.symbol_function( $sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$GRAPHL_SEARCH_TYPE, $sym10$_CSETF_GRAPHL_SEARCH_TYPE );
    Structures.def_csetf( $sym11$GRAPHL_SEARCH_ORDER, $sym12$_CSETF_GRAPHL_SEARCH_ORDER );
    Structures.def_csetf( $sym13$GRAPHL_SEARCH_CUTOFF, $sym14$_CSETF_GRAPHL_SEARCH_CUTOFF );
    Structures.def_csetf( $sym15$GRAPHL_SEARCH_MARKING, $sym16$_CSETF_GRAPHL_SEARCH_MARKING );
    Structures.def_csetf( $sym17$GRAPHL_SEARCH_MARKING_SPACE, $sym18$_CSETF_GRAPHL_SEARCH_MARKING_SPACE );
    Structures.def_csetf( $sym19$GRAPHL_SEARCH_GOAL_SPACE, $sym20$_CSETF_GRAPHL_SEARCH_GOAL_SPACE );
    Structures.def_csetf( $sym21$GRAPHL_SEARCH_GOAL, $sym22$_CSETF_GRAPHL_SEARCH_GOAL );
    Structures.def_csetf( $sym23$GRAPHL_SEARCH_GOAL_FN, $sym24$_CSETF_GRAPHL_SEARCH_GOAL_FN );
    Structures.def_csetf( $sym25$GRAPHL_SEARCH_GOAL_FOUND_P, $sym26$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P );
    Structures.def_csetf( $sym27$GRAPHL_SEARCH_SATISFY_FN, $sym28$_CSETF_GRAPHL_SEARCH_SATISFY_FN );
    Structures.def_csetf( $sym29$GRAPHL_SEARCH_MAP_FN, $sym30$_CSETF_GRAPHL_SEARCH_MAP_FN );
    Structures.def_csetf( $sym31$GRAPHL_SEARCH_JUSTIFY_, $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_ );
    Structures.def_csetf( $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_, $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ );
    Structures.def_csetf( $sym35$GRAPHL_SEARCH_UNWIND_FN_TOGGLE, $sym36$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE );
    Structures.def_csetf( $sym37$GRAPHL_SEARCH_RESULT, $sym38$_CSETF_GRAPHL_SEARCH_RESULT );
    Structures.def_csetf( $sym39$GRAPHL_SEARCH_GRAPH, $sym40$_CSETF_GRAPHL_SEARCH_GRAPH );
    Equality.identity( $sym0$GRAPHL_SEARCH );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_graphl_search$.getGlobalValue(), Symbols.symbol_function( $sym62$VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD ) );
    access_macros.register_macro_helper( $sym91$SET_GRAPHL_SEARCH_PROPERTIES, $sym93$WITH_GRAPHL_SEARCH_INITIALIZED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_graphl_search_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_graphl_search_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_graphl_search_vars_file();
  }
  static
  {
    me = new graphl_search_vars();
    $dtp_graphl_search$ = null;
    $use_zero_size_graphl_marking_spacesP$ = null;
    $graphl_search_size$ = null;
    $sym0$GRAPHL_SEARCH = makeSymbol( "GRAPHL-SEARCH" );
    $sym1$GRAPHL_SEARCH_P = makeSymbol( "GRAPHL-SEARCH-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "TYPE" ), makeSymbol( "ORDER" ), makeSymbol( "CUTOFF" ), makeSymbol( "MARKING" ), makeSymbol( "MARKING-SPACE" ), makeSymbol( "GOAL-SPACE" ), makeSymbol(
        "GOAL" ), makeSymbol( "GOAL-FN" ), makeSymbol( "GOAL-FOUND-P" ), makeSymbol( "SATISFY-FN" ), makeSymbol( "MAP-FN" ), makeSymbol( "JUSTIFY?" ), makeSymbol( "ADD-TO-RESULT?" ), makeSymbol( "UNWIND-FN-TOGGLE" ),
      makeSymbol( "RESULT" ), makeSymbol( "GRAPH" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ORDER" ), makeKeyword( "CUTOFF" ), makeKeyword( "MARKING" ), makeKeyword( "MARKING-SPACE" ), makeKeyword( "GOAL-SPACE" ), makeKeyword(
        "GOAL" ), makeKeyword( "GOAL-FN" ), makeKeyword( "GOAL-FOUND-P" ), makeKeyword( "SATISFY-FN" ), makeKeyword( "MAP-FN" ), makeKeyword( "JUSTIFY?" ), makeKeyword( "ADD-TO-RESULT?" ), makeKeyword(
            "UNWIND-FN-TOGGLE" ), makeKeyword( "RESULT" ), makeKeyword( "GRAPH" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "GRAPHL-SEARCH-TYPE" ), makeSymbol( "GRAPHL-SEARCH-ORDER" ), makeSymbol( "GRAPHL-SEARCH-CUTOFF" ), makeSymbol( "GRAPHL-SEARCH-MARKING" ), makeSymbol(
        "GRAPHL-SEARCH-MARKING-SPACE" ), makeSymbol( "GRAPHL-SEARCH-GOAL-SPACE" ), makeSymbol( "GRAPHL-SEARCH-GOAL" ), makeSymbol( "GRAPHL-SEARCH-GOAL-FN" ), makeSymbol( "GRAPHL-SEARCH-GOAL-FOUND-P" ), makeSymbol(
            "GRAPHL-SEARCH-SATISFY-FN" ), makeSymbol( "GRAPHL-SEARCH-MAP-FN" ), makeSymbol( "GRAPHL-SEARCH-JUSTIFY?" ), makeSymbol( "GRAPHL-SEARCH-ADD-TO-RESULT?" ), makeSymbol( "GRAPHL-SEARCH-UNWIND-FN-TOGGLE" ),
      makeSymbol( "GRAPHL-SEARCH-RESULT" ), makeSymbol( "GRAPHL-SEARCH-GRAPH" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-GRAPHL-SEARCH-TYPE" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-ORDER" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-CUTOFF" ), makeSymbol(
        "_CSETF-GRAPHL-SEARCH-MARKING" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-MARKING-SPACE" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL-SPACE" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL" ), makeSymbol(
            "_CSETF-GRAPHL-SEARCH-GOAL-FN" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-SATISFY-FN" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-MAP-FN" ), makeSymbol(
                "_CSETF-GRAPHL-SEARCH-JUSTIFY?" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE" ), makeSymbol( "_CSETF-GRAPHL-SEARCH-RESULT" ), makeSymbol(
                    "_CSETF-GRAPHL-SEARCH-GRAPH" )
    } );
    $sym6$PRINT_GRAPHL_SEARCH = makeSymbol( "PRINT-GRAPHL-SEARCH" );
    $sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "GRAPHL-SEARCH-P" ) );
    $sym9$GRAPHL_SEARCH_TYPE = makeSymbol( "GRAPHL-SEARCH-TYPE" );
    $sym10$_CSETF_GRAPHL_SEARCH_TYPE = makeSymbol( "_CSETF-GRAPHL-SEARCH-TYPE" );
    $sym11$GRAPHL_SEARCH_ORDER = makeSymbol( "GRAPHL-SEARCH-ORDER" );
    $sym12$_CSETF_GRAPHL_SEARCH_ORDER = makeSymbol( "_CSETF-GRAPHL-SEARCH-ORDER" );
    $sym13$GRAPHL_SEARCH_CUTOFF = makeSymbol( "GRAPHL-SEARCH-CUTOFF" );
    $sym14$_CSETF_GRAPHL_SEARCH_CUTOFF = makeSymbol( "_CSETF-GRAPHL-SEARCH-CUTOFF" );
    $sym15$GRAPHL_SEARCH_MARKING = makeSymbol( "GRAPHL-SEARCH-MARKING" );
    $sym16$_CSETF_GRAPHL_SEARCH_MARKING = makeSymbol( "_CSETF-GRAPHL-SEARCH-MARKING" );
    $sym17$GRAPHL_SEARCH_MARKING_SPACE = makeSymbol( "GRAPHL-SEARCH-MARKING-SPACE" );
    $sym18$_CSETF_GRAPHL_SEARCH_MARKING_SPACE = makeSymbol( "_CSETF-GRAPHL-SEARCH-MARKING-SPACE" );
    $sym19$GRAPHL_SEARCH_GOAL_SPACE = makeSymbol( "GRAPHL-SEARCH-GOAL-SPACE" );
    $sym20$_CSETF_GRAPHL_SEARCH_GOAL_SPACE = makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL-SPACE" );
    $sym21$GRAPHL_SEARCH_GOAL = makeSymbol( "GRAPHL-SEARCH-GOAL" );
    $sym22$_CSETF_GRAPHL_SEARCH_GOAL = makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL" );
    $sym23$GRAPHL_SEARCH_GOAL_FN = makeSymbol( "GRAPHL-SEARCH-GOAL-FN" );
    $sym24$_CSETF_GRAPHL_SEARCH_GOAL_FN = makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL-FN" );
    $sym25$GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol( "GRAPHL-SEARCH-GOAL-FOUND-P" );
    $sym26$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol( "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P" );
    $sym27$GRAPHL_SEARCH_SATISFY_FN = makeSymbol( "GRAPHL-SEARCH-SATISFY-FN" );
    $sym28$_CSETF_GRAPHL_SEARCH_SATISFY_FN = makeSymbol( "_CSETF-GRAPHL-SEARCH-SATISFY-FN" );
    $sym29$GRAPHL_SEARCH_MAP_FN = makeSymbol( "GRAPHL-SEARCH-MAP-FN" );
    $sym30$_CSETF_GRAPHL_SEARCH_MAP_FN = makeSymbol( "_CSETF-GRAPHL-SEARCH-MAP-FN" );
    $sym31$GRAPHL_SEARCH_JUSTIFY_ = makeSymbol( "GRAPHL-SEARCH-JUSTIFY?" );
    $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_ = makeSymbol( "_CSETF-GRAPHL-SEARCH-JUSTIFY?" );
    $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol( "GRAPHL-SEARCH-ADD-TO-RESULT?" );
    $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol( "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?" );
    $sym35$GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol( "GRAPHL-SEARCH-UNWIND-FN-TOGGLE" );
    $sym36$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol( "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE" );
    $sym37$GRAPHL_SEARCH_RESULT = makeSymbol( "GRAPHL-SEARCH-RESULT" );
    $sym38$_CSETF_GRAPHL_SEARCH_RESULT = makeSymbol( "_CSETF-GRAPHL-SEARCH-RESULT" );
    $sym39$GRAPHL_SEARCH_GRAPH = makeSymbol( "GRAPHL-SEARCH-GRAPH" );
    $sym40$_CSETF_GRAPHL_SEARCH_GRAPH = makeSymbol( "_CSETF-GRAPHL-SEARCH-GRAPH" );
    $kw41$TYPE = makeKeyword( "TYPE" );
    $kw42$ORDER = makeKeyword( "ORDER" );
    $kw43$CUTOFF = makeKeyword( "CUTOFF" );
    $kw44$MARKING = makeKeyword( "MARKING" );
    $kw45$MARKING_SPACE = makeKeyword( "MARKING-SPACE" );
    $kw46$GOAL_SPACE = makeKeyword( "GOAL-SPACE" );
    $kw47$GOAL = makeKeyword( "GOAL" );
    $kw48$GOAL_FN = makeKeyword( "GOAL-FN" );
    $kw49$GOAL_FOUND_P = makeKeyword( "GOAL-FOUND-P" );
    $kw50$SATISFY_FN = makeKeyword( "SATISFY-FN" );
    $kw51$MAP_FN = makeKeyword( "MAP-FN" );
    $kw52$JUSTIFY_ = makeKeyword( "JUSTIFY?" );
    $kw53$ADD_TO_RESULT_ = makeKeyword( "ADD-TO-RESULT?" );
    $kw54$UNWIND_FN_TOGGLE = makeKeyword( "UNWIND-FN-TOGGLE" );
    $kw55$RESULT = makeKeyword( "RESULT" );
    $kw56$GRAPH = makeKeyword( "GRAPH" );
    $str57$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw58$BEGIN = makeKeyword( "BEGIN" );
    $sym59$MAKE_GRAPHL_SEARCH = makeSymbol( "MAKE-GRAPHL-SEARCH" );
    $kw60$SLOT = makeKeyword( "SLOT" );
    $kw61$END = makeKeyword( "END" );
    $sym62$VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD" );
    $str63$GraphL_Search____a__ = makeString( "GraphL Search : ~a~%" );
    $str64$Type____a__ = makeString( "Type : ~a~%" );
    $str65$Order____a__ = makeString( "Order : ~a~%" );
    $str66$Cutoff____a__ = makeString( "Cutoff : ~a~%" );
    $str67$Marking____a__ = makeString( "Marking : ~a~%" );
    $str68$Space____a__ = makeString( "Space : ~a~%" );
    $str69$Goal_Space____a__ = makeString( "Goal Space : ~a~%" );
    $str70$Goal____a__ = makeString( "Goal : ~a~%" );
    $str71$Goal_Fn____a__ = makeString( "Goal Fn : ~a~%" );
    $str72$Goal_Found_P____a__ = makeString( "Goal Found-P : ~a~%" );
    $str73$Satisfy_Fn____a__ = makeString( "Satisfy Fn : ~a~%" );
    $str74$Map_Fn____a__ = makeString( "Map Fn : ~a~%" );
    $str75$Justify_____a__ = makeString( "Justify? : ~a~%" );
    $str76$Add_to_Result_____a__ = makeString( "Add to Result? : ~a~%" );
    $str77$Unwind_Fn_Toggle____a__ = makeString( "Unwind Fn Toggle : ~a~%" );
    $str78$Result____a__ = makeString( "Result : ~a~%" );
    $str79$Graph____a__ = makeString( "Graph : ~a~%" );
    $kw80$FREE = makeKeyword( "FREE" );
    $kw81$DEPTH_FIRST = makeKeyword( "DEPTH-FIRST" );
    $kw82$BREADTH_FIRST = makeKeyword( "BREADTH-FIRST" );
    $kw83$ITERATIVE_DEEPENING = makeKeyword( "ITERATIVE-DEEPENING" );
    $kw84$DEPTH_MARKING = makeKeyword( "DEPTH-MARKING" );
    $kw85$NODES_ON_WIND = makeKeyword( "NODES-ON-WIND" );
    $kw86$EDGES_ON_UNWIND = makeKeyword( "EDGES-ON-UNWIND" );
    $list87 = ConsesLow.list( makeKeyword( "DEPTH-MARKING" ), makeKeyword( "SIMPLE" ) );
    $list88 = ConsesLow.list( makeSymbol( "SEARCH-VAR" ), makeSymbol( "PLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym89$CLET = makeSymbol( "CLET" );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-GRAPHL-SEARCH" ) ) );
    $sym91$SET_GRAPHL_SEARCH_PROPERTIES = makeSymbol( "SET-GRAPHL-SEARCH-PROPERTIES" );
    $sym92$DESTROY_GRAPHL_SEARCH = makeSymbol( "DESTROY-GRAPHL-SEARCH" );
    $sym93$WITH_GRAPHL_SEARCH_INITIALIZED = makeSymbol( "WITH-GRAPHL-SEARCH-INITIALIZED" );
    $int94$200 = makeInteger( 200 );
  }

  public static final class $graphl_search_native
      extends
        SubLStructNative
  {
    public SubLObject $type;
    public SubLObject $order;
    public SubLObject $cutoff;
    public SubLObject $marking;
    public SubLObject $marking_space;
    public SubLObject $goal_space;
    public SubLObject $goal;
    public SubLObject $goal_fn;
    public SubLObject $goal_found_p;
    public SubLObject $satisfy_fn;
    public SubLObject $map_fn;
    public SubLObject $justifyP;
    public SubLObject $add_to_resultP;
    public SubLObject $unwind_fn_toggle;
    public SubLObject $result;
    public SubLObject $graph;
    private static final SubLStructDeclNative structDecl;

    public $graphl_search_native()
    {
      this.$type = CommonSymbols.NIL;
      this.$order = CommonSymbols.NIL;
      this.$cutoff = CommonSymbols.NIL;
      this.$marking = CommonSymbols.NIL;
      this.$marking_space = CommonSymbols.NIL;
      this.$goal_space = CommonSymbols.NIL;
      this.$goal = CommonSymbols.NIL;
      this.$goal_fn = CommonSymbols.NIL;
      this.$goal_found_p = CommonSymbols.NIL;
      this.$satisfy_fn = CommonSymbols.NIL;
      this.$map_fn = CommonSymbols.NIL;
      this.$justifyP = CommonSymbols.NIL;
      this.$add_to_resultP = CommonSymbols.NIL;
      this.$unwind_fn_toggle = CommonSymbols.NIL;
      this.$result = CommonSymbols.NIL;
      this.$graph = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $graphl_search_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$order;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$cutoff;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$marking;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$marking_space;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$goal_space;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$goal;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$goal_fn;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$goal_found_p;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$satisfy_fn;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$map_fn;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$justifyP;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$add_to_resultP;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$unwind_fn_toggle;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$result;
    }

    @Override
    public SubLObject getField17()
    {
      return this.$graph;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$order = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$cutoff = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$marking = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$marking_space = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$goal_space = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$goal = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$goal_fn = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$goal_found_p = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$satisfy_fn = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$map_fn = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$justifyP = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$add_to_resultP = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$unwind_fn_toggle = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$result = value;
    }

    @Override
    public SubLObject setField17(final SubLObject value)
    {
      return this.$graph = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $graphl_search_native.class, $sym0$GRAPHL_SEARCH, $sym1$GRAPHL_SEARCH_P, $list2, $list3, new String[] { "$type", "$order", "$cutoff", "$marking", "$marking_space",
        "$goal_space", "$goal", "$goal_fn", "$goal_found_p", "$satisfy_fn", "$map_fn", "$justifyP", "$add_to_resultP", "$unwind_fn_toggle", "$result", "$graph"
      }, $list4, $list5, $sym6$PRINT_GRAPHL_SEARCH );
    }
  }

  public static final class $graphl_search_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $graphl_search_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GRAPHL-SEARCH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return graphl_search_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 234 ms
 * 
 */