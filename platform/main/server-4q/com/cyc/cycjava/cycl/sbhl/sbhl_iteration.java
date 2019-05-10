package com.cyc.cycjava.cycl.sbhl;

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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.binary_tree;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_iteration
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_iteration";
  public static final String myFingerPrint = "3008f15e60c7eb93b68b385ad71952d8914e6c5c8e4ab44cd3f9919eef3d8a83";
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 980L)
  public static SubLSymbol $sbhl_iterator_store$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1196L)
  private static SubLSymbol $sbhl_iterator_store_max$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLSymbol $dtp_sbhl_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 11396L)
  private static SubLSymbol $sbhl_null_iterator$;
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SBHL_ITERATOR;
  private static final SubLSymbol $sym3$SBHL_ITERATOR_P;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$PRINT_SBHL_ITERATOR;
  private static final SubLSymbol $sym9$SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$SBHL_IT_STATE;
  private static final SubLSymbol $sym12$_CSETF_SBHL_IT_STATE;
  private static final SubLSymbol $sym13$SBHL_IT_DONE;
  private static final SubLSymbol $sym14$_CSETF_SBHL_IT_DONE;
  private static final SubLSymbol $sym15$SBHL_IT_NEXT;
  private static final SubLSymbol $sym16$_CSETF_SBHL_IT_NEXT;
  private static final SubLSymbol $sym17$SBHL_IT_FINALIZE;
  private static final SubLSymbol $sym18$_CSETF_SBHL_IT_FINALIZE;
  private static final SubLSymbol $kw19$STATE;
  private static final SubLSymbol $kw20$DONE;
  private static final SubLSymbol $kw21$NEXT;
  private static final SubLSymbol $kw22$FINALIZE;
  private static final SubLString $str23$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw24$BEGIN;
  private static final SubLSymbol $sym25$MAKE_SBHL_ITERATOR;
  private static final SubLSymbol $kw26$SLOT;
  private static final SubLSymbol $kw27$END;
  private static final SubLSymbol $sym28$VISIT_DEFSTRUCT_OBJECT_SBHL_ITERATOR_METHOD;
  private static final SubLString $str29$_DONE;
  private static final SubLSymbol $sym30$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym32$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym33$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym34$SBHL_LIST_ITERATOR_DONE;
  private static final SubLSymbol $sym35$SBHL_ALIST_ITERATOR_DONE;
  private static final SubLSymbol $sym36$SBHL_HASH_TABLE_ITERATOR_DONE;
  private static final SubLSymbol $sym37$SBHL_ITERATOR_ITERATOR_DONE;
  private static final SubLSymbol $sym38$SBHL_AVL_TREE_ITERATOR_DONE;
  private static final SubLSymbol $sym39$TRUE;
  private static final SubLSymbol $sym40$FALSE;
  private static final SubLSymbol $sym41$SBHL_TIME_DATE_LINK_ITERATOR_DONE;
  private static final SubLSymbol $sym42$SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE;
  private static final SubLSymbol $sym43$SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE;
  private static final SubLSymbol $sym44$SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE;
  private static final SubLSymbol $sym45$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym46$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym47$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym48$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym49$SBHL_LIST_ITERATOR_NEXT;
  private static final SubLSymbol $sym50$SBHL_ALIST_ITERATOR_NEXT;
  private static final SubLSymbol $sym51$SBHL_HASH_TABLE_ITERATOR_NEXT;
  private static final SubLSymbol $sym52$SBHL_ITERATOR_ITERATOR_NEXT;
  private static final SubLSymbol $sym53$SBHL_AVL_TREE_ITERATOR_NEXT;
  private static final SubLSymbol $sym54$SBHL_TIME_DATE_LINK_ITERATOR_NEXT;
  private static final SubLSymbol $sym55$SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT;
  private static final SubLSymbol $sym56$SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT;
  private static final SubLSymbol $sym57$SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT;
  private static final SubLSymbol $sym58$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym59$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym60$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym61$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym62$SBHL_ITERATOR_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym63$SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym64$SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym65$SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym66$SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLSymbol $kw69$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $sym70$ITERATOR_VAR;
  private static final SubLSymbol $sym71$DO_SBHL_ITERATOR;
  private static final SubLSymbol $sym72$DONE_VAR;
  private static final SubLSymbol $sym73$UNTIL;
  private static final SubLSymbol $sym74$SBHL_ITERATION_NEXT;
  private static final SubLSymbol $sym75$PWHEN;
  private static final SubLSymbol $sym76$CSETQ;
  private static final SubLSymbol $sym77$COR;
  private static final SubLSymbol $sym78$NULL;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$COUNT;
  private static final SubLSymbol $sym81$NEW_DONE;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$__;
  private static final SubLSymbol $sym84$PROGN;
  private static final SubLSymbol $sym85$CINC;
  private static final SubLList $list86;
  private static final SubLSymbol $kw87$ALIST;
  private static final SubLSymbol $kw88$HASHTABLE;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1246L)
  public static SubLObject within_sbhl_iterator_resourcingP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return sbhl_search_datastructures.sbhl_stack_p( $sbhl_iterator_store$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1347L)
  public static SubLObject with_sbhl_iterator_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list1, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1587L)
  public static SubLObject find_or_create_sbhl_iterator_shell()
  {
    final SubLObject iterator_shell = find_sbhl_iterator_shell();
    return ( NIL != iterator_shell ) ? iterator_shell : make_sbhl_iterator( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1756L)
  public static SubLObject find_sbhl_iterator_shell()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != within_sbhl_iterator_resourcingP() ) ? sbhl_search_datastructures.sbhl_stack_pop( $sbhl_iterator_store$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 1894L)
  public static SubLObject release_sbhl_iterator(final SubLObject sbhl_iterator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != within_sbhl_iterator_resourcingP() && ( !$sbhl_iterator_store_max$.getGlobalValue().isInteger() || !sbhl_search_datastructures.sbhl_stack_size( $sbhl_iterator_store$.getDynamicValue( thread ) ).numGE(
        $sbhl_iterator_store_max$.getGlobalValue() ) ) )
    {
      sbhl_search_datastructures.sbhl_stack_push( sbhl_iterator, $sbhl_iterator_store$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject sbhl_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_sbhl_iterator( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject sbhl_iterator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sbhl_iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject sbhl_it_state(final SubLObject v_object)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject sbhl_it_done(final SubLObject v_object)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject sbhl_it_next(final SubLObject v_object)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject sbhl_it_finalize(final SubLObject v_object)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject _csetf_sbhl_it_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject _csetf_sbhl_it_done(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject _csetf_sbhl_it_next(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject _csetf_sbhl_it_finalize(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_iterator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject make_sbhl_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sbhl_iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$STATE ) )
      {
        _csetf_sbhl_it_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$DONE ) )
      {
        _csetf_sbhl_it_done( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$NEXT ) )
      {
        _csetf_sbhl_it_next( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$FINALIZE ) )
      {
        _csetf_sbhl_it_finalize( v_new, current_value );
      }
      else
      {
        Errors.error( $str23$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject visit_defstruct_sbhl_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw24$BEGIN, $sym25$MAKE_SBHL_ITERATOR, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw19$STATE, sbhl_it_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw20$DONE, sbhl_it_done( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw21$NEXT, sbhl_it_next( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$SLOT, $kw22$FINALIZE, sbhl_it_finalize( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$END, $sym25$MAKE_SBHL_ITERATOR, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2528L)
  public static SubLObject visit_defstruct_object_sbhl_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sbhl_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2663L)
  public static SubLObject print_sbhl_iterator(final SubLObject iterator, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( iterator, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, iterator, T, T );
      if( NIL != sbhl_iteration_doneP( iterator ) )
      {
        streams_high.write_string( $str29$_DONE, stream, UNPROVIDED, UNPROVIDED );
      }
      print_macros.print_unreadable_object_postamble( stream, iterator, T, T );
    }
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 2905L)
  public static SubLObject new_sbhl_iterator(final SubLObject state, final SubLObject done, final SubLObject next, final SubLObject finalize)
  {
    final SubLObject sbhl_iterator = find_or_create_sbhl_iterator_shell();
    _csetf_sbhl_it_state( sbhl_iterator, state );
    _csetf_sbhl_it_done( sbhl_iterator, done );
    _csetf_sbhl_it_next( sbhl_iterator, next );
    _csetf_sbhl_it_finalize( sbhl_iterator, finalize );
    return sbhl_iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 3923L)
  public static SubLObject sbhl_iteration_doneP(final SubLObject sbhl_iterator)
  {
    final SubLObject pcase_var = sbhl_it_done( sbhl_iterator );
    if( pcase_var.eql( $sym30$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE ) )
    {
      return sbhl_link_iterators.sbhl_link_node_search_state_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE ) )
    {
      return sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym32$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE ) )
    {
      return sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym33$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE ) )
    {
      return sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym34$SBHL_LIST_ITERATOR_DONE ) )
    {
      return sbhl_list_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym35$SBHL_ALIST_ITERATOR_DONE ) )
    {
      return sbhl_alist_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym36$SBHL_HASH_TABLE_ITERATOR_DONE ) )
    {
      return sbhl_hash_table_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym37$SBHL_ITERATOR_ITERATOR_DONE ) )
    {
      return sbhl_iterator_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym38$SBHL_AVL_TREE_ITERATOR_DONE ) )
    {
      return binary_tree.sbhl_avl_tree_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var.eql( $sym39$TRUE ) )
    {
      return T;
    }
    if( pcase_var.eql( $sym40$FALSE ) )
    {
      return NIL;
    }
    final SubLObject pcase_var_$1 = sbhl_it_done( sbhl_iterator );
    if( pcase_var_$1.eql( $sym41$SBHL_TIME_DATE_LINK_ITERATOR_DONE ) )
    {
      return sbhl_time_dates.sbhl_time_date_link_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var_$1.eql( $sym42$SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE ) )
    {
      return sbhl_time_dates.sbhl_time_date_date_link_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var_$1.eql( $sym43$SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE ) )
    {
      return sbhl_time_dates.sbhl_time_date_link_tag_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    if( pcase_var_$1.eql( $sym44$SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE ) )
    {
      return sbhl_time_dates.sbhl_time_date_mt_link_iterator_done( sbhl_it_state( sbhl_iterator ) );
    }
    return Functions.funcall( sbhl_it_done( sbhl_iterator ), sbhl_it_state( sbhl_iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 5853L)
  public static SubLObject sbhl_iteration_next(final SubLObject sbhl_iterator)
  {
    SubLObject result = NIL;
    final SubLObject pcase_var = sbhl_it_next( sbhl_iterator );
    if( pcase_var.eql( $sym45$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT ) )
    {
      result = sbhl_link_iterators.sbhl_link_node_search_state_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym46$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT ) )
    {
      result = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym47$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT ) )
    {
      result = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym48$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT ) )
    {
      result = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym49$SBHL_LIST_ITERATOR_NEXT ) )
    {
      result = sbhl_list_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym50$SBHL_ALIST_ITERATOR_NEXT ) )
    {
      result = sbhl_alist_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym51$SBHL_HASH_TABLE_ITERATOR_NEXT ) )
    {
      result = sbhl_hash_table_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym52$SBHL_ITERATOR_ITERATOR_NEXT ) )
    {
      result = sbhl_iterator_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym53$SBHL_AVL_TREE_ITERATOR_NEXT ) )
    {
      result = binary_tree.sbhl_avl_tree_iterator_next( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym40$FALSE ) )
    {
      result = NIL;
    }
    else
    {
      final SubLObject pcase_var_$2 = sbhl_it_next( sbhl_iterator );
      if( pcase_var_$2.eql( $sym54$SBHL_TIME_DATE_LINK_ITERATOR_NEXT ) )
      {
        result = sbhl_time_dates.sbhl_time_date_link_iterator_next( sbhl_it_state( sbhl_iterator ) );
      }
      else if( pcase_var_$2.eql( $sym55$SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT ) )
      {
        result = sbhl_time_dates.sbhl_time_date_date_link_iterator_next( sbhl_it_state( sbhl_iterator ) );
      }
      else if( pcase_var_$2.eql( $sym56$SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT ) )
      {
        result = sbhl_time_dates.sbhl_time_date_link_tag_iterator_next( sbhl_it_state( sbhl_iterator ) );
      }
      else if( pcase_var_$2.eql( $sym57$SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT ) )
      {
        result = sbhl_time_dates.sbhl_time_date_mt_link_iterator_next( sbhl_it_state( sbhl_iterator ) );
      }
      if( NIL == result )
      {
        result = Functions.funcall( sbhl_it_next( sbhl_iterator ), sbhl_it_state( sbhl_iterator ) );
      }
    }
    if( NIL == result )
    {
      _csetf_sbhl_it_done( sbhl_iterator, $sym39$TRUE );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 8073L)
  public static SubLObject sbhl_iteration_finalize(final SubLObject sbhl_iterator)
  {
    SubLObject result = NIL;
    final SubLObject pcase_var = sbhl_it_finalize( sbhl_iterator );
    if( pcase_var.eql( $sym58$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE ) )
    {
      result = sbhl_link_iterators.sbhl_link_node_search_state_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym59$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE ) )
    {
      result = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym60$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE ) )
    {
      result = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym61$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE ) )
    {
      result = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym62$SBHL_ITERATOR_ITERATOR_FINALIZE ) )
    {
      result = sbhl_iterator_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
    }
    else if( pcase_var.eql( $sym39$TRUE ) )
    {
      result = T;
    }
    else
    {
      SubLObject handledP = NIL;
      handledP = T;
      final SubLObject pcase_var_$3 = sbhl_it_finalize( sbhl_iterator );
      if( pcase_var_$3.eql( $sym63$SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE ) )
      {
        result = sbhl_time_dates.sbhl_time_date_link_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
      }
      else if( pcase_var_$3.eql( $sym64$SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE ) )
      {
        result = sbhl_time_dates.sbhl_time_date_date_link_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
      }
      else if( pcase_var_$3.eql( $sym65$SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE ) )
      {
        result = sbhl_time_dates.sbhl_time_date_link_tag_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
      }
      else if( pcase_var_$3.eql( $sym66$SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE ) )
      {
        result = sbhl_time_dates.sbhl_time_date_mt_link_iterator_finalize( sbhl_it_state( sbhl_iterator ) );
      }
      else
      {
        handledP = NIL;
      }
      if( NIL == handledP )
      {
        result = Functions.funcall( sbhl_it_finalize( sbhl_iterator ), sbhl_it_state( sbhl_iterator ) );
      }
    }
    release_sbhl_iterator( sbhl_iterator );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 9996L)
  public static SubLObject do_sbhl_iterator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject sbhl_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    sbhl_iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list67 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list67 );
      if( NIL == conses_high.member( current_$4, $list68, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw69$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list67 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( !sbhl_iterator.isSymbol() )
    {
      final SubLObject iterator_var = $sym70$ITERATOR_VAR;
      return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( iterator_var, sbhl_iterator ) ), ConsesLow.listS( $sym71$DO_SBHL_ITERATOR, ConsesLow.list( var, iterator_var, $kw20$DONE, done ), ConsesLow.append(
          body, NIL ) ) );
    }
    final SubLObject done_var = $sym72$DONE_VAR;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( done_var, done ) ), ConsesLow.list( $sym73$UNTIL, done_var, ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list(
        $sym74$SBHL_ITERATION_NEXT, sbhl_iterator ) ) ), ConsesLow.listS( $sym75$PWHEN, var, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym76$CSETQ, done_var, ( NIL != done ) ? ConsesLow.list( $sym77$COR,
            ConsesLow.list( $sym78$NULL, var ), done ) : ConsesLow.list( $sym78$NULL, var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 10861L)
  public static SubLObject do_n_sbhl_iterator_objects(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject n = NIL;
    SubLObject sbhl_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    n = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    sbhl_iterator = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list79 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list79 );
      if( NIL == conses_high.member( current_$5, $list68, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw69$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw20$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject count = $sym80$COUNT;
    final SubLObject new_done = $sym81$NEW_DONE;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( reader.bq_cons( count, $list82 ), ConsesLow.list( new_done, ConsesLow.list( $sym77$COR, done, ConsesLow.list( $sym83$__, count, n ) ) ) ), ConsesLow.list(
        $sym71$DO_SBHL_ITERATOR, ConsesLow.list( var, sbhl_iterator, $kw20$DONE, new_done ), reader.bq_cons( $sym84$PROGN, ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym85$CINC, count ), ConsesLow.list(
            $sym75$PWHEN, ConsesLow.list( $sym77$COR, done, ConsesLow.list( $sym83$__, count, n ) ), ConsesLow.listS( $sym76$CSETQ, new_done, $list86 ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 11670L)
  public static SubLObject new_sbhl_null_iterator()
  {
    if( NIL == $sbhl_null_iterator$.getGlobalValue() )
    {
      $sbhl_null_iterator$.setGlobalValue( new_sbhl_iterator( NIL, $sym39$TRUE, $sym40$FALSE, $sym39$TRUE ) );
    }
    return $sbhl_null_iterator$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 11854L)
  public static SubLObject sbhl_null_iterator_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, $sbhl_null_iterator$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 11945L)
  public static SubLObject new_sbhl_list_iterator(final SubLObject list)
  {
    return new_sbhl_iterator( Vectors.make_vector( ONE_INTEGER, list ), $sym34$SBHL_LIST_ITERATOR_DONE, $sym49$SBHL_LIST_ITERATOR_NEXT, $sym39$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 12216L)
  public static SubLObject sbhl_list_iterator_done(final SubLObject state)
  {
    return Types.sublisp_null( Vectors.aref( state, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 12298L)
  public static SubLObject sbhl_list_iterator_next(final SubLObject state)
  {
    final SubLObject list = Vectors.aref( state, ZERO_INTEGER );
    Vectors.set_aref( state, ZERO_INTEGER, list.rest() );
    return list.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 12438L)
  public static SubLObject new_sbhl_alist_iterator(final SubLObject alist)
  {
    return new_sbhl_iterator( Vectors.make_vector( ONE_INTEGER, alist ), $sym35$SBHL_ALIST_ITERATOR_DONE, $sym50$SBHL_ALIST_ITERATOR_NEXT, $sym39$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 12769L)
  public static SubLObject sbhl_alist_iterator_done(final SubLObject state)
  {
    return Types.sublisp_null( Vectors.aref( state, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 12852L)
  public static SubLObject sbhl_alist_iterator_next(final SubLObject state)
  {
    final SubLObject alist = Vectors.aref( state, ZERO_INTEGER );
    Vectors.set_aref( state, ZERO_INTEGER, alist.rest() );
    if( NIL != alist.first() )
    {
      return ConsesLow.list( conses_high.caar( alist ), conses_high.cdar( alist ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 13049L)
  public static SubLObject new_sbhl_hash_table_iterator(final SubLObject hash_table)
  {
    return new_sbhl_iterator( make_sbhl_hash_table_iterator_state( hash_table ), $sym36$SBHL_HASH_TABLE_ITERATOR_DONE, $sym51$SBHL_HASH_TABLE_ITERATOR_NEXT, $sym39$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 13445L)
  public static SubLObject sbhl_hash_table_iterator_done(final SubLObject state)
  {
    return Types.sublisp_null( Vectors.aref( state, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 13533L)
  public static SubLObject sbhl_hash_table_iterator_next(final SubLObject state)
  {
    final SubLObject keys = Vectors.aref( state, ZERO_INTEGER );
    final SubLObject key = keys.first();
    Vectors.set_aref( state, ZERO_INTEGER, keys.rest() );
    return ( NIL != key ) ? ConsesLow.list( key, Hashtables.gethash( key, Vectors.aref( state, ONE_INTEGER ), UNPROVIDED ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 13744L)
  public static SubLObject make_sbhl_hash_table_iterator_state(final SubLObject hash_table)
  {
    final SubLObject state = Vectors.make_vector( TWO_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, hash_table_utilities.hash_table_keys( hash_table ) );
    Vectors.set_aref( state, ONE_INTEGER, hash_table );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 13953L)
  public static SubLObject new_sbhl_dictionary_iterator(final SubLObject v_dictionary)
  {
    final SubLObject database = dictionary.dictionary_contents( v_dictionary );
    final SubLObject pcase_var = dictionary.dictionary_style( v_dictionary );
    if( pcase_var.eql( $kw87$ALIST ) )
    {
      return new_sbhl_alist_iterator( database );
    }
    if( pcase_var.eql( $kw88$HASHTABLE ) )
    {
      return new_sbhl_hash_table_iterator( database );
    }
    return dictionary.dictionary_style_error( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 14490L)
  public static SubLObject new_sbhl_iterator_iterator(final SubLObject iterators)
  {
    final SubLObject state = Vectors.make_vector( ONE_INTEGER, UNPROVIDED );
    Vectors.set_aref( state, ZERO_INTEGER, iterators );
    return new_sbhl_iterator( state, $sym37$SBHL_ITERATOR_ITERATOR_DONE, $sym52$SBHL_ITERATOR_ITERATOR_NEXT, $sym62$SBHL_ITERATOR_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 14921L)
  public static SubLObject sbhl_iterator_iterator_done(final SubLObject state)
  {
    return Types.sublisp_null( Vectors.aref( state, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 15007L)
  public static SubLObject sbhl_iterator_iterator_next(final SubLObject state)
  {
    SubLObject iterator = Vectors.aref( state, ZERO_INTEGER ).first();
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    while ( NIL == result && NIL == doneP)
    {
      if( NIL == iterator )
      {
        doneP = T;
      }
      else if( NIL != sbhl_iteration_doneP( iterator ) )
      {
        sbhl_iteration_finalize( iterator );
        Vectors.set_aref( state, ZERO_INTEGER, Vectors.aref( state, ZERO_INTEGER ).rest() );
        iterator = Vectors.aref( state, ZERO_INTEGER ).first();
      }
      else
      {
        result = sbhl_iteration_next( iterator );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-iteration.lisp", position = 15463L)
  public static SubLObject sbhl_iterator_iterator_finalize(final SubLObject state)
  {
    SubLObject cdolist_list_var = Vectors.aref( state, ZERO_INTEGER );
    SubLObject iterator = NIL;
    iterator = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sbhl_iteration_finalize( iterator );
      cdolist_list_var = cdolist_list_var.rest();
      iterator = cdolist_list_var.first();
    }
    return T;
  }

  public static SubLObject declare_sbhl_iteration_file()
  {
    SubLFiles.declareFunction( me, "within_sbhl_iterator_resourcingP", "WITHIN-SBHL-ITERATOR-RESOURCING?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_sbhl_iterator_resourcing", "WITH-SBHL-ITERATOR-RESOURCING" );
    SubLFiles.declareFunction( me, "find_or_create_sbhl_iterator_shell", "FIND-OR-CREATE-SBHL-ITERATOR-SHELL", 0, 0, false );
    SubLFiles.declareFunction( me, "find_sbhl_iterator_shell", "FIND-SBHL-ITERATOR-SHELL", 0, 0, false );
    SubLFiles.declareFunction( me, "release_sbhl_iterator", "RELEASE-SBHL-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iterator_print_function_trampoline", "SBHL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iterator_p", "SBHL-ITERATOR-P", 1, 0, false );
    new $sbhl_iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_it_state", "SBHL-IT-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_it_done", "SBHL-IT-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_it_next", "SBHL-IT-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_it_finalize", "SBHL-IT-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_it_state", "_CSETF-SBHL-IT-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_it_done", "_CSETF-SBHL-IT-DONE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_it_next", "_CSETF-SBHL-IT-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_it_finalize", "_CSETF-SBHL-IT-FINALIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sbhl_iterator", "MAKE-SBHL-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sbhl_iterator", "VISIT-DEFSTRUCT-SBHL-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sbhl_iterator_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_sbhl_iterator", "PRINT-SBHL-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_iterator", "NEW-SBHL-ITERATOR", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iteration_doneP", "SBHL-ITERATION-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iteration_next", "SBHL-ITERATION-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iteration_finalize", "SBHL-ITERATION-FINALIZE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_iterator", "DO-SBHL-ITERATOR" );
    SubLFiles.declareMacro( me, "do_n_sbhl_iterator_objects", "DO-N-SBHL-ITERATOR-OBJECTS" );
    SubLFiles.declareFunction( me, "new_sbhl_null_iterator", "NEW-SBHL-NULL-ITERATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_null_iterator_p", "SBHL-NULL-ITERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_list_iterator", "NEW-SBHL-LIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_list_iterator_done", "SBHL-LIST-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_list_iterator_next", "SBHL-LIST-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_alist_iterator", "NEW-SBHL-ALIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_alist_iterator_done", "SBHL-ALIST-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_alist_iterator_next", "SBHL-ALIST-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_hash_table_iterator", "NEW-SBHL-HASH-TABLE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_hash_table_iterator_done", "SBHL-HASH-TABLE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_hash_table_iterator_next", "SBHL-HASH-TABLE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_sbhl_hash_table_iterator_state", "MAKE-SBHL-HASH-TABLE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_dictionary_iterator", "NEW-SBHL-DICTIONARY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_iterator_iterator", "NEW-SBHL-ITERATOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iterator_iterator_done", "SBHL-ITERATOR-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iterator_iterator_next", "SBHL-ITERATOR-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_iterator_iterator_finalize", "SBHL-ITERATOR-ITERATOR-FINALIZE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sbhl_iteration_file()
  {
    $sbhl_iterator_store$ = SubLFiles.defparameter( "*SBHL-ITERATOR-STORE*", NIL );
    $sbhl_iterator_store_max$ = SubLFiles.deflexical( "*SBHL-ITERATOR-STORE-MAX*", TEN_INTEGER );
    $dtp_sbhl_iterator$ = SubLFiles.defconstant( "*DTP-SBHL-ITERATOR*", $sym2$SBHL_ITERATOR );
    $sbhl_null_iterator$ = SubLFiles.deflexical( "*SBHL-NULL-ITERATOR*", NIL );
    return NIL;
  }

  public static SubLObject setup_sbhl_iteration_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_iterator$.getGlobalValue(), Symbols.symbol_function( $sym9$SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list10 );
    Structures.def_csetf( $sym11$SBHL_IT_STATE, $sym12$_CSETF_SBHL_IT_STATE );
    Structures.def_csetf( $sym13$SBHL_IT_DONE, $sym14$_CSETF_SBHL_IT_DONE );
    Structures.def_csetf( $sym15$SBHL_IT_NEXT, $sym16$_CSETF_SBHL_IT_NEXT );
    Structures.def_csetf( $sym17$SBHL_IT_FINALIZE, $sym18$_CSETF_SBHL_IT_FINALIZE );
    Equality.identity( $sym2$SBHL_ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_iterator$.getGlobalValue(), Symbols.symbol_function( $sym28$VISIT_DEFSTRUCT_OBJECT_SBHL_ITERATOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_iteration_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_iteration_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_iteration_file();
  }
  static
  {
    me = new sbhl_iteration();
    $sbhl_iterator_store$ = null;
    $sbhl_iterator_store_max$ = null;
    $dtp_sbhl_iterator$ = null;
    $sbhl_null_iterator$ = null;
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SBHL-ITERATOR-STORE*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "WITHIN-SBHL-ITERATOR-RESOURCING?" ) ), makeSymbol(
        "*SBHL-ITERATOR-STORE*" ), ConsesLow.list( makeSymbol( "NEW-SBHL-STACK" ), makeSymbol( "*SBHL-ITERATOR-STORE-MAX*" ) ) ) ) );
    $sym2$SBHL_ITERATOR = makeSymbol( "SBHL-ITERATOR" );
    $sym3$SBHL_ITERATOR_P = makeSymbol( "SBHL-ITERATOR-P" );
    $list4 = ConsesLow.list( makeSymbol( "STATE" ), makeSymbol( "DONE" ), makeSymbol( "NEXT" ), makeSymbol( "FINALIZE" ) );
    $list5 = ConsesLow.list( makeKeyword( "STATE" ), makeKeyword( "DONE" ), makeKeyword( "NEXT" ), makeKeyword( "FINALIZE" ) );
    $list6 = ConsesLow.list( makeSymbol( "SBHL-IT-STATE" ), makeSymbol( "SBHL-IT-DONE" ), makeSymbol( "SBHL-IT-NEXT" ), makeSymbol( "SBHL-IT-FINALIZE" ) );
    $list7 = ConsesLow.list( makeSymbol( "_CSETF-SBHL-IT-STATE" ), makeSymbol( "_CSETF-SBHL-IT-DONE" ), makeSymbol( "_CSETF-SBHL-IT-NEXT" ), makeSymbol( "_CSETF-SBHL-IT-FINALIZE" ) );
    $sym8$PRINT_SBHL_ITERATOR = makeSymbol( "PRINT-SBHL-ITERATOR" );
    $sym9$SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SBHL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list10 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SBHL-ITERATOR-P" ) );
    $sym11$SBHL_IT_STATE = makeSymbol( "SBHL-IT-STATE" );
    $sym12$_CSETF_SBHL_IT_STATE = makeSymbol( "_CSETF-SBHL-IT-STATE" );
    $sym13$SBHL_IT_DONE = makeSymbol( "SBHL-IT-DONE" );
    $sym14$_CSETF_SBHL_IT_DONE = makeSymbol( "_CSETF-SBHL-IT-DONE" );
    $sym15$SBHL_IT_NEXT = makeSymbol( "SBHL-IT-NEXT" );
    $sym16$_CSETF_SBHL_IT_NEXT = makeSymbol( "_CSETF-SBHL-IT-NEXT" );
    $sym17$SBHL_IT_FINALIZE = makeSymbol( "SBHL-IT-FINALIZE" );
    $sym18$_CSETF_SBHL_IT_FINALIZE = makeSymbol( "_CSETF-SBHL-IT-FINALIZE" );
    $kw19$STATE = makeKeyword( "STATE" );
    $kw20$DONE = makeKeyword( "DONE" );
    $kw21$NEXT = makeKeyword( "NEXT" );
    $kw22$FINALIZE = makeKeyword( "FINALIZE" );
    $str23$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw24$BEGIN = makeKeyword( "BEGIN" );
    $sym25$MAKE_SBHL_ITERATOR = makeSymbol( "MAKE-SBHL-ITERATOR" );
    $kw26$SLOT = makeKeyword( "SLOT" );
    $kw27$END = makeKeyword( "END" );
    $sym28$VISIT_DEFSTRUCT_OBJECT_SBHL_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SBHL-ITERATOR-METHOD" );
    $str29$_DONE = makeString( " DONE" );
    $sym30$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE" );
    $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE" );
    $sym32$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE" );
    $sym33$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE" );
    $sym34$SBHL_LIST_ITERATOR_DONE = makeSymbol( "SBHL-LIST-ITERATOR-DONE" );
    $sym35$SBHL_ALIST_ITERATOR_DONE = makeSymbol( "SBHL-ALIST-ITERATOR-DONE" );
    $sym36$SBHL_HASH_TABLE_ITERATOR_DONE = makeSymbol( "SBHL-HASH-TABLE-ITERATOR-DONE" );
    $sym37$SBHL_ITERATOR_ITERATOR_DONE = makeSymbol( "SBHL-ITERATOR-ITERATOR-DONE" );
    $sym38$SBHL_AVL_TREE_ITERATOR_DONE = makeSymbol( "SBHL-AVL-TREE-ITERATOR-DONE" );
    $sym39$TRUE = makeSymbol( "TRUE" );
    $sym40$FALSE = makeSymbol( "FALSE" );
    $sym41$SBHL_TIME_DATE_LINK_ITERATOR_DONE = makeSymbol( "SBHL-TIME-DATE-LINK-ITERATOR-DONE" );
    $sym42$SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE = makeSymbol( "SBHL-TIME-DATE-DATE-LINK-ITERATOR-DONE" );
    $sym43$SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE = makeSymbol( "SBHL-TIME-DATE-LINK-TAG-ITERATOR-DONE" );
    $sym44$SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE = makeSymbol( "SBHL-TIME-DATE-MT-LINK-ITERATOR-DONE" );
    $sym45$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT" );
    $sym46$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT" );
    $sym47$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT" );
    $sym48$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT" );
    $sym49$SBHL_LIST_ITERATOR_NEXT = makeSymbol( "SBHL-LIST-ITERATOR-NEXT" );
    $sym50$SBHL_ALIST_ITERATOR_NEXT = makeSymbol( "SBHL-ALIST-ITERATOR-NEXT" );
    $sym51$SBHL_HASH_TABLE_ITERATOR_NEXT = makeSymbol( "SBHL-HASH-TABLE-ITERATOR-NEXT" );
    $sym52$SBHL_ITERATOR_ITERATOR_NEXT = makeSymbol( "SBHL-ITERATOR-ITERATOR-NEXT" );
    $sym53$SBHL_AVL_TREE_ITERATOR_NEXT = makeSymbol( "SBHL-AVL-TREE-ITERATOR-NEXT" );
    $sym54$SBHL_TIME_DATE_LINK_ITERATOR_NEXT = makeSymbol( "SBHL-TIME-DATE-LINK-ITERATOR-NEXT" );
    $sym55$SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT = makeSymbol( "SBHL-TIME-DATE-DATE-LINK-ITERATOR-NEXT" );
    $sym56$SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT = makeSymbol( "SBHL-TIME-DATE-LINK-TAG-ITERATOR-NEXT" );
    $sym57$SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT = makeSymbol( "SBHL-TIME-DATE-MT-LINK-ITERATOR-NEXT" );
    $sym58$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym59$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym60$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym61$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym62$SBHL_ITERATOR_ITERATOR_FINALIZE = makeSymbol( "SBHL-ITERATOR-ITERATOR-FINALIZE" );
    $sym63$SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE = makeSymbol( "SBHL-TIME-DATE-LINK-ITERATOR-FINALIZE" );
    $sym64$SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE = makeSymbol( "SBHL-TIME-DATE-DATE-LINK-ITERATOR-FINALIZE" );
    $sym65$SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE = makeSymbol( "SBHL-TIME-DATE-LINK-TAG-ITERATOR-FINALIZE" );
    $sym66$SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE = makeSymbol( "SBHL-TIME-DATE-MT-LINK-ITERATOR-FINALIZE" );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "SBHL-ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list68 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw69$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $sym70$ITERATOR_VAR = makeUninternedSymbol( "ITERATOR-VAR" );
    $sym71$DO_SBHL_ITERATOR = makeSymbol( "DO-SBHL-ITERATOR" );
    $sym72$DONE_VAR = makeUninternedSymbol( "DONE-VAR" );
    $sym73$UNTIL = makeSymbol( "UNTIL" );
    $sym74$SBHL_ITERATION_NEXT = makeSymbol( "SBHL-ITERATION-NEXT" );
    $sym75$PWHEN = makeSymbol( "PWHEN" );
    $sym76$CSETQ = makeSymbol( "CSETQ" );
    $sym77$COR = makeSymbol( "COR" );
    $sym78$NULL = makeSymbol( "NULL" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "N" ), makeSymbol( "SBHL-ITERATOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym80$COUNT = makeUninternedSymbol( "COUNT" );
    $sym81$NEW_DONE = makeUninternedSymbol( "NEW-DONE" );
    $list82 = ConsesLow.list( ZERO_INTEGER );
    $sym83$__ = makeSymbol( ">=" );
    $sym84$PROGN = makeSymbol( "PROGN" );
    $sym85$CINC = makeSymbol( "CINC" );
    $list86 = ConsesLow.list( T );
    $kw87$ALIST = makeKeyword( "ALIST" );
    $kw88$HASHTABLE = makeKeyword( "HASHTABLE" );
  }

  public static final class $sbhl_iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $state;
    public SubLObject $done;
    public SubLObject $next;
    public SubLObject $finalize;
    private static final SubLStructDeclNative structDecl;

    public $sbhl_iterator_native()
    {
      this.$state = CommonSymbols.NIL;
      this.$done = CommonSymbols.NIL;
      this.$next = CommonSymbols.NIL;
      this.$finalize = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sbhl_iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$done;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$next;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$finalize;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$done = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$next = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$finalize = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sbhl_iterator_native.class, $sym2$SBHL_ITERATOR, $sym3$SBHL_ITERATOR_P, $list4, $list5, new String[] { "$state", "$done", "$next", "$finalize"
      }, $list6, $list7, $sym8$PRINT_SBHL_ITERATOR );
    }
  }

  public static final class $sbhl_iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_iterator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 194 ms
 * 
 */