package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class predicate_strengthener_internals
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.predicate_strengthener_internals";
  public static final String myFingerPrint = "522d36a84a0836eba6fefa66a8494aad079e12e305d097455d89b85b6d459c88";
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 950L)
  private static SubLSymbol $arg_type_alist$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 1361L)
  private static SubLSymbol $arg_type_genls_stores$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 5807L)
  private static SubLSymbol $pred_streng_doneP$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 5968L)
  private static SubLSymbol $pred_streng_result_nodes$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6775L)
  private static SubLSymbol $current_suggested_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 7263L)
  private static SubLSymbol $pred_streng_space$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 7765L)
  private static SubLSymbol $pred_streng_generational_space$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 7825L)
  private static SubLSymbol $pred_streng_suggested_space$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLSymbol $sym2$_ARG_TYPE_ALIST_;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$INITIALIZE_ARG_TYPE_GENLS_STORES;
  private static final SubLObject $const5$genls;
  private static final SubLObject $const6$Thing;
  private static final SubLObject $const7$isa;
  private static final SubLObject $const8$kePrecisionSuggestionByTypeRestri;
  private static final SubLSymbol $sym9$WITH_NEW_PRED_STRENG_DONE;
  private static final SubLSymbol $sym10$WITH_NEW_PRED_STRENG_SPACES;
  private static final SubLSymbol $sym11$WITH_NEW_SUGGESTED_DEPTH;
  private static final SubLSymbol $sym12$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$WITH_NEW_PRED_STRENG_RESULT_NODES;
  private static final SubLSymbol $sym17$CUNWIND_PROTECT;
  private static final SubLSymbol $sym18$PROGN;
  private static final SubLSymbol $sym19$CSETQ;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw29$DONE;
  private static final SubLSymbol $sym30$DONE_VAR;
  private static final SubLSymbol $sym31$ASS_VAR;
  private static final SubLSymbol $sym32$DO_GAF_ARG_INDEX;
  private static final SubLSymbol $kw33$INDEX;
  private static final SubLSymbol $kw34$PREDICATE;
  private static final SubLObject $const35$typedGenlPreds;
  private static final SubLSymbol $sym36$GAF_ARG1;
  private static final SubLSymbol $sym37$FLIP_GENL_INVERSE_MODE;
  private static final SubLObject $const38$typedGenlInverse;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$DONE_VAR;
  private static final SubLObject $const41$kePrecisionSuggestionByTypeRestri;
  private static final SubLSymbol $sym42$GAF_ARG2;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$WITH_INCREMENTED_SUGGESTED_DEPTH;
  private static final SubLObject $const45$UnderspecifiedPredicate;
  private static final SubLSymbol $kw46$GAF;

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 1109L)
  public static SubLObject get_arg_type_alist()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $arg_type_alist$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 1210L)
  public static SubLObject with_arg_type_alist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    alist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym2$_ARG_TYPE_ALIST_, alist ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 1517L)
  public static SubLObject get_arg_type_store(final SubLObject key_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_lookup( $arg_type_genls_stores$.getDynamicValue( thread ), key_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 1669L)
  public static SubLObject with_new_arg_type_genls_stores(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    alist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, $list3, ConsesLow.list( $sym4$INITIALIZE_ARG_TYPE_GENLS_STORES, alist ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 2016L)
  public static SubLObject initialize_arg_type_genls_stores(final SubLObject alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = alist;
    SubLObject arg_info = NIL;
    arg_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject argnum = arg_info.first();
      SubLObject cdolist_list_var_$1 = conses_high.second( arg_info );
      SubLObject constraints = NIL;
      constraints = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject constraint_pred = constraints.first();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            SubLObject cdolist_list_var_$2 = constraints.rest();
            SubLObject constraint_col = NIL;
            constraint_col = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              pred_streng_depth_mark_all_forward_true_nodes( constraint_col );
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              constraint_col = cdolist_list_var_$2.first();
            }
            dictionary.dictionary_enter( $arg_type_genls_stores$.getDynamicValue( thread ), ConsesLow.list( argnum, constraint_pred ), hash_table_utilities.copy_hashtable( sbhl_marking_vars.$sbhl_space$.getDynamicValue(
                thread ), UNPROVIDED ) );
          }
          finally
          {
            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        constraints = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_info = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 2623L)
  public static SubLObject pred_streng_depth_mark_all_forward_true_nodes(final SubLObject col)
  {
    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const5$genls ), col, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 2913L)
  public static SubLObject non_trivial_argn_isa(final SubLObject pred, final SubLObject argnum)
  {
    return Sequences.remove( $const6$Thing, kb_accessors.argn_isa( pred, argnum, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 3014L)
  public static SubLObject arg_types_alist_satisfied_p(final SubLObject pred)
  {
    SubLObject failP = NIL;
    SubLObject successful_args = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = get_arg_type_alist();
      SubLObject arg_info = NIL;
      arg_info = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        SubLObject arg_constraint_arg;
        final SubLObject arg = arg_constraint_arg = arg_info.first();
        if( NIL != sbhl_search_vars.genl_inverse_mode_p() && ( arg.numE( ONE_INTEGER ) || arg.numE( TWO_INTEGER ) ) )
        {
          arg_constraint_arg = misc_utilities.other_binary_arg( arg );
        }
        if( NIL == failP )
        {
          SubLObject csome_list_var_$4 = conses_high.second( arg_info );
          SubLObject constraints = NIL;
          constraints = csome_list_var_$4.first();
          while ( NIL == failP && NIL != csome_list_var_$4)
          {
            final SubLObject constraint_pred = constraints.first();
            SubLObject pred_arg_constraints = NIL;
            SubLObject successP = NIL;
            final SubLObject pcase_var = constraint_pred;
            if( pcase_var.eql( $const7$isa ) )
            {
              pred_arg_constraints = kb_accessors.argn_isa( pred, arg_constraint_arg, UNPROVIDED );
            }
            else if( pcase_var.eql( $const5$genls ) )
            {
              pred_arg_constraints = kb_accessors.argn_genl( pred, arg_constraint_arg, UNPROVIDED );
            }
            if( NIL == pred_arg_constraints || ( NIL == non_trivial_argn_isa( pred, arg_constraint_arg ) && NIL == kb_accessors.argn_genl( pred, arg_constraint_arg, UNPROVIDED ) ) )
            {
              successP = T;
              final SubLObject item_var = arg_constraint_arg;
              if( NIL == conses_high.member( item_var, successful_args, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                successful_args = ConsesLow.cons( item_var, successful_args );
              }
            }
            else
            {
              final SubLObject store_key = ConsesLow.list( arg, constraint_pred );
              if( NIL == successP )
              {
                SubLObject csome_list_var_$5 = pred_arg_constraints;
                SubLObject arg_constraint = NIL;
                arg_constraint = csome_list_var_$5.first();
                while ( NIL == successP && NIL != csome_list_var_$5)
                {
                  if( NIL != sbhl_marking_utilities.sbhl_marked_node_p( arg_constraint, get_arg_type_store( store_key ) ) )
                  {
                    successP = T;
                    final SubLObject item_var2 = arg_constraint_arg;
                    if( NIL == conses_high.member( item_var2, successful_args, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      successful_args = ConsesLow.cons( item_var2, successful_args );
                    }
                  }
                  csome_list_var_$5 = csome_list_var_$5.rest();
                  arg_constraint = csome_list_var_$5.first();
                }
              }
            }
            if( NIL == successP )
            {
              failP = T;
            }
            csome_list_var_$4 = csome_list_var_$4.rest();
            constraints = csome_list_var_$4.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        arg_info = csome_list_var.first();
      }
    }
    if( NIL == list_utilities.lengthE( successful_args, TWO_INTEGER, UNPROVIDED ) )
    {
      failP = T;
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 4575L)
  public static SubLObject node_meets_arg_constraints_p(final SubLObject node)
  {
    return arg_types_alist_satisfied_p( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 4672L)
  public static SubLObject suggestion_assertion_meets_arg_constraints_p(final SubLObject assertion)
  {
    SubLObject constraint_1 = assertions_high.gaf_arg3( assertion );
    SubLObject constraint_2 = assertions_high.gaf_arg4( assertion );
    final SubLObject inverse_predP = Equality.eq( assertions_high.gaf_arg0( assertion ), $const8$kePrecisionSuggestionByTypeRestri );
    if( !makeBoolean( NIL == sbhl_search_vars.genl_inverse_mode_p() ).eql( makeBoolean( NIL == inverse_predP ) ) )
    {
      final SubLObject swap_var = constraint_1;
      constraint_1 = constraint_2;
      constraint_2 = swap_var;
    }
    final SubLObject arg1_store = get_arg_type_store( ConsesLow.list( ONE_INTEGER, $const7$isa ) );
    final SubLObject arg2_store = get_arg_type_store( ConsesLow.list( TWO_INTEGER, $const7$isa ) );
    return makeBoolean( arg1_store.isHashtable() && arg2_store.isHashtable() && NIL != sbhl_marking_utilities.sbhl_marked_node_p( constraint_1, arg1_store ) && NIL != sbhl_marking_utilities.sbhl_marked_node_p(
        constraint_2, arg2_store ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 5497L)
  public static SubLObject with_new_pred_streng_setup(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym9$WITH_NEW_PRED_STRENG_DONE, ConsesLow.list( $sym10$WITH_NEW_PRED_STRENG_SPACES, ConsesLow.list( $sym11$WITH_NEW_SUGGESTED_DEPTH, reader.bq_cons( $sym12$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE,
        ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 5856L)
  public static SubLObject with_new_pred_streng_done(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list13, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6198L)
  public static SubLObject with_new_pred_streng_result_nodes(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list14, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6338L)
  public static SubLObject push_node_onto_result(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary.dictionary_enter( $pred_streng_result_nodes$.getDynamicValue( thread ), node, marked_with( node ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6468L)
  public static SubLObject clear_result()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary.clear_dictionary( $pred_streng_result_nodes$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6561L)
  public static SubLObject with_pred_streng_result(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    result_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym16$WITH_NEW_PRED_STRENG_RESULT_NODES, ConsesLow.list( $sym17$CUNWIND_PROTECT, reader.bq_cons( $sym18$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym19$CSETQ, result_var,
        $list20 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6914L)
  public static SubLObject get_current_suggested_depth()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_suggested_depth$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 6996L)
  public static SubLObject with_incremented_suggested_depth(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list21, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 7148L)
  public static SubLObject with_new_suggested_depth(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list22, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 7882L)
  public static SubLObject with_new_pred_streng_spaces(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list23, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 8088L)
  public static SubLObject with_generational_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list24, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 8227L)
  public static SubLObject with_suggested_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list25, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 8360L)
  public static SubLObject do_accessible_typed_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    node = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list26 );
      if( NIL == conses_high.member( current_$6, $list27, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw28$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw29$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject done_var = $sym30$DONE_VAR;
    final SubLObject ass_var = $sym31$ASS_VAR;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( done_var, done ) ), ConsesLow.list( $sym32$DO_GAF_ARG_INDEX, ConsesLow.list( ass_var, node, $kw33$INDEX, TWO_INTEGER, $kw34$PREDICATE,
        $const35$typedGenlPreds, $kw29$DONE, done_var ), ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_node_var, ConsesLow.list( $sym36$GAF_ARG1, ass_var ) ) ), ConsesLow.append( body, NIL ) ) ),
        ConsesLow.list( $sym37$FLIP_GENL_INVERSE_MODE, ConsesLow.list( $sym32$DO_GAF_ARG_INDEX, ConsesLow.list( ass_var, node, $kw33$INDEX, TWO_INTEGER, $kw34$PREDICATE, $const38$typedGenlInverse, $kw29$DONE, done_var ),
            ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_node_var, ConsesLow.list( $sym36$GAF_ARG1, ass_var ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 9011L)
  public static SubLObject do_accessible_suggested_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject ass_var = NIL;
    SubLObject link_node_var = NIL;
    SubLObject depth_var = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    ass_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    depth_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    node = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      if( NIL == conses_high.member( current_$7, $list27, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw28$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw29$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject done_var = $sym40$DONE_VAR;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( done_var, done ) ), ConsesLow.list( $sym32$DO_GAF_ARG_INDEX, ConsesLow.list( ass_var, node, $kw33$INDEX, ONE_INTEGER, $kw34$PREDICATE,
        $const41$kePrecisionSuggestionByTypeRestri, $kw29$DONE, done_var ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_node_var, ConsesLow.list( $sym42$GAF_ARG2, ass_var ) ), reader.bq_cons(
            depth_var, $list43 ) ), reader.bq_cons( $sym44$WITH_INCREMENTED_SUGGESTED_DEPTH, ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list( $sym37$FLIP_GENL_INVERSE_MODE, ConsesLow.list( $sym32$DO_GAF_ARG_INDEX,
                ConsesLow.list( ass_var, node, $kw33$INDEX, ONE_INTEGER, $kw34$PREDICATE, $const8$kePrecisionSuggestionByTypeRestri, $kw29$DONE, done_var ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list(
                    link_node_var, ConsesLow.list( $sym42$GAF_ARG2, ass_var ) ), reader.bq_cons( depth_var, $list43 ) ), reader.bq_cons( $sym44$WITH_INCREMENTED_SUGGESTED_DEPTH, ConsesLow.append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 9931L)
  public static SubLObject strengthened_preds(final SubLObject pred, final SubLObject alist, SubLObject use_suggestionsP)
  {
    if( use_suggestionsP == UNPROVIDED )
    {
      use_suggestionsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $pred_streng_result_nodes$.currentBinding( thread );
    try
    {
      $pred_streng_result_nodes$.bind( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
      try
      {
        final SubLObject _prev_bind_0_$8 = $arg_type_alist$.currentBinding( thread );
        final SubLObject _prev_bind_2 = $arg_type_genls_stores$.currentBinding( thread );
        try
        {
          $arg_type_alist$.bind( alist, thread );
          $arg_type_genls_stores$.bind( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
          initialize_arg_type_genls_stores( alist );
          final SubLObject _prev_bind_0_$9 = $pred_streng_doneP$.currentBinding( thread );
          final SubLObject _prev_bind_1_$10 = $pred_streng_generational_space$.currentBinding( thread );
          final SubLObject _prev_bind_3 = $pred_streng_suggested_space$.currentBinding( thread );
          final SubLObject _prev_bind_4 = $current_suggested_depth$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          try
          {
            $pred_streng_doneP$.bind( NIL, thread );
            $pred_streng_generational_space$.bind( Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED ), thread );
            $pred_streng_suggested_space$.bind( Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED ), thread );
            $current_suggested_depth$.bind( ZERO_INTEGER, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_marking_generation$.bind( ZERO_INTEGER, thread );
              mark_and_sweep_connected_typed_links( pred, use_suggestionsP );
            }
            finally
            {
              sbhl_marking_vars.$sbhl_marking_generation$.rebind( _prev_bind_0_$10, thread );
            }
            if( NIL != use_suggestionsP )
            {
              mark_and_sweep_suggested_links( pred );
            }
          }
          finally
          {
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_5, thread );
            $current_suggested_depth$.rebind( _prev_bind_4, thread );
            $pred_streng_suggested_space$.rebind( _prev_bind_3, thread );
            $pred_streng_generational_space$.rebind( _prev_bind_1_$10, thread );
            $pred_streng_doneP$.rebind( _prev_bind_0_$9, thread );
          }
        }
        finally
        {
          $arg_type_genls_stores$.rebind( _prev_bind_2, thread );
          $arg_type_alist$.rebind( _prev_bind_0_$8, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          result = compute_pred_streng_result();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
        }
      }
    }
    finally
    {
      $pred_streng_result_nodes$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 11113L)
  public static SubLObject compute_pred_streng_result()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $pred_streng_result_nodes$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 11277L)
  public static SubLObject mark_and_sweep_connected_typed_links(final SubLObject node, SubLObject use_suggestionsP)
  {
    if( use_suggestionsP == UNPROVIDED )
    {
      use_suggestionsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_nodes = NIL;
    final SubLObject _prev_bind_0 = $pred_streng_space$.currentBinding( thread );
    try
    {
      $pred_streng_space$.bind( $pred_streng_generational_space$.getDynamicValue( thread ), thread );
      if( NIL != node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p( node ) )
      {
        if( NIL != predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.getDynamicValue( thread ) && NIL == isa.isaP( node, $const45$UnderspecifiedPredicate, UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL != node_is_of_current_generation_p( node ) )
          {
            sbhl_marking_vars.increment_sbhl_marking_generation();
            push_node_onto_result( node );
            if( NIL == conses_high.member( node, result_nodes, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result_nodes = ConsesLow.cons( node, result_nodes );
            }
          }
          else if( predicate_strengthener.max_pred_strengs().isInteger() && NIL != list_utilities.lengthG( result_nodes, predicate_strengthener.max_pred_strengs(), UNPROVIDED ) )
          {
            clear_result();
            push_node_onto_result( node );
          }
          else
          {
            push_node_onto_result( node );
            if( NIL == conses_high.member( node, result_nodes, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result_nodes = ConsesLow.cons( node, result_nodes );
            }
          }
        }
        else if( NIL != node_visited_in_current_mode_p( node ) && NIL != node_is_unmysterious_p( node ) )
        {
          if( NIL != node_meets_arg_constraints_p( node ) && NIL != node_is_older_than_current_generation_p( node ) )
          {
            sbhl_marking_vars.increment_sbhl_marking_generation();
          }
        }
        else if( NIL != node_meets_arg_constraints_p( node ) )
        {
          SubLObject valid_node_visitedP = NIL;
          generationally_mark_typed_node( node );
          final SubLObject done_var = $pred_streng_doneP$.getDynamicValue( thread );
          final SubLObject pred_var = $const35$typedGenlPreds;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( node, TWO_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( node, TWO_INTEGER, pred_var );
            SubLObject done_var_$13 = done_var;
            final SubLObject token_var = NIL;
            while ( NIL == done_var_$13)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw46$GAF, NIL, NIL );
                  SubLObject done_var_$14 = done_var;
                  final SubLObject token_var_$15 = NIL;
                  while ( NIL == done_var_$14)
                  {
                    final SubLObject ass_var = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$15 );
                    final SubLObject valid_$16 = makeBoolean( !token_var_$15.eql( ass_var ) );
                    if( NIL != valid_$16 )
                    {
                      final SubLObject link_node = assertions_high.gaf_arg1( ass_var );
                      valid_node_visitedP = makeBoolean( NIL != valid_node_visitedP || NIL != node_meets_arg_constraints_p( link_node ) );
                      result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_connected_typed_links( link_node, use_suggestionsP ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      if( NIL != use_suggestionsP )
                      {
                        result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_suggested_links( link_node ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      }
                    }
                    done_var_$14 = makeBoolean( NIL == valid_$16 || NIL != done_var );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                  }
                }
              }
              done_var_$13 = makeBoolean( NIL == valid || NIL != done_var );
            }
          }
          final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$genl_inverse_mode_p$.bind( makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ), thread );
            final SubLObject pred_var2 = $const38$typedGenlInverse;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( node, TWO_INTEGER, pred_var2 ) )
            {
              final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( node, TWO_INTEGER, pred_var2 );
              SubLObject done_var_$15 = done_var;
              final SubLObject token_var2 = NIL;
              while ( NIL == done_var_$15)
              {
                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                if( NIL != valid2 )
                {
                  SubLObject final_index_iterator2 = NIL;
                  try
                  {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw46$GAF, NIL, NIL );
                    SubLObject done_var_$16 = done_var;
                    final SubLObject token_var_$16 = NIL;
                    while ( NIL == done_var_$16)
                    {
                      final SubLObject ass_var2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$16 );
                      final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( ass_var2 ) );
                      if( NIL != valid_$17 )
                      {
                        final SubLObject link_node2 = assertions_high.gaf_arg1( ass_var2 );
                        valid_node_visitedP = makeBoolean( NIL != valid_node_visitedP || NIL != node_meets_arg_constraints_p( link_node2 ) );
                        result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_connected_typed_links( link_node2, use_suggestionsP ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        if( NIL != use_suggestionsP )
                        {
                          result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_suggested_links( link_node2 ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        }
                      }
                      done_var_$16 = makeBoolean( NIL == valid_$17 || NIL != done_var );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator2 )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                      }
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                    }
                  }
                }
                done_var_$15 = makeBoolean( NIL == valid2 || NIL != done_var );
              }
            }
          }
          finally
          {
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$18, thread );
          }
          if( NIL == valid_node_visitedP && NIL != node_is_of_current_generation_p( node ) )
          {
            sbhl_marking_vars.increment_sbhl_marking_generation();
            push_node_onto_result( node );
            if( NIL == conses_high.member( node, result_nodes, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result_nodes = ConsesLow.cons( node, result_nodes );
            }
          }
          else if( predicate_strengthener.max_pred_strengs().isInteger() && NIL != list_utilities.lengthG( result_nodes, predicate_strengthener.max_pred_strengs(), UNPROVIDED ) )
          {
            clear_result();
            push_node_onto_result( node );
          }
        }
      }
    }
    finally
    {
      $pred_streng_space$.rebind( _prev_bind_0, thread );
    }
    return result_nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 14008L)
  public static SubLObject mark_and_sweep_suggested_links(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_nodes = NIL;
    final SubLObject _prev_bind_0 = $pred_streng_space$.currentBinding( thread );
    try
    {
      $pred_streng_space$.bind( $pred_streng_suggested_space$.getDynamicValue( thread ), thread );
      if( NIL != node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p( node ) && ( NIL == node_visited_in_current_mode_p( node ) || NIL == node_is_unmysterious_p( node ) )
          && NIL != arg_types_alist_satisfied_p( node ) )
      {
        SubLObject node_markedP = NIL;
        final SubLObject done_var = $pred_streng_doneP$.getDynamicValue( thread );
        final SubLObject pred_var = $const41$kePrecisionSuggestionByTypeRestri;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( node, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( node, ONE_INTEGER, pred_var );
          SubLObject done_var_$24 = done_var;
          final SubLObject token_var = NIL;
          while ( NIL == done_var_$24)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw46$GAF, NIL, NIL );
                SubLObject done_var_$25 = done_var;
                final SubLObject token_var_$26 = NIL;
                while ( NIL == done_var_$25)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
                  final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( assertion ) );
                  if( NIL != valid_$27 )
                  {
                    final SubLObject link_node = assertions_high.gaf_arg2( assertion );
                    final SubLObject depth = $current_suggested_depth$.getDynamicValue( thread );
                    final SubLObject _prev_bind_0_$28 = $current_suggested_depth$.currentBinding( thread );
                    try
                    {
                      $current_suggested_depth$.bind( number_utilities.f_1X( $current_suggested_depth$.getDynamicValue( thread ) ), thread );
                      if( NIL == node_markedP )
                      {
                        node_markedP = T;
                        mark_suggested_node( node, depth );
                      }
                      if( NIL != suggestion_assertion_meets_arg_constraints_p( assertion ) )
                      {
                        final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding( thread );
                        try
                        {
                          sbhl_marking_vars.$sbhl_marking_generation$.bind( ZERO_INTEGER, thread );
                          result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_connected_typed_links( link_node, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        }
                        finally
                        {
                          sbhl_marking_vars.$sbhl_marking_generation$.rebind( _prev_bind_0_$29, thread );
                        }
                        result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_suggested_links( link_node ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                      }
                    }
                    finally
                    {
                      $current_suggested_depth$.rebind( _prev_bind_0_$28, thread );
                    }
                  }
                  done_var_$25 = makeBoolean( NIL == valid_$27 || NIL != done_var );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                }
              }
            }
            done_var_$24 = makeBoolean( NIL == valid || NIL != done_var );
          }
        }
        final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$genl_inverse_mode_p$.bind( makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ), thread );
          final SubLObject pred_var2 = $const8$kePrecisionSuggestionByTypeRestri;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( node, ONE_INTEGER, pred_var2 ) )
          {
            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( node, ONE_INTEGER, pred_var2 );
            SubLObject done_var_$26 = done_var;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var_$26)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw46$GAF, NIL, NIL );
                  SubLObject done_var_$27 = done_var;
                  final SubLObject token_var_$27 = NIL;
                  while ( NIL == done_var_$27)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$27 );
                    final SubLObject valid_$28 = makeBoolean( !token_var_$27.eql( assertion2 ) );
                    if( NIL != valid_$28 )
                    {
                      final SubLObject link_node2 = assertions_high.gaf_arg2( assertion2 );
                      final SubLObject depth2 = $current_suggested_depth$.getDynamicValue( thread );
                      final SubLObject _prev_bind_0_$32 = $current_suggested_depth$.currentBinding( thread );
                      try
                      {
                        $current_suggested_depth$.bind( number_utilities.f_1X( $current_suggested_depth$.getDynamicValue( thread ) ), thread );
                        if( NIL == node_markedP )
                        {
                          node_markedP = T;
                          mark_suggested_node( node, depth2 );
                        }
                        if( NIL != suggestion_assertion_meets_arg_constraints_p( assertion2 ) )
                        {
                          final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding( thread );
                          try
                          {
                            sbhl_marking_vars.$sbhl_marking_generation$.bind( ZERO_INTEGER, thread );
                            result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_connected_typed_links( link_node2, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                          }
                          finally
                          {
                            sbhl_marking_vars.$sbhl_marking_generation$.rebind( _prev_bind_0_$33, thread );
                          }
                          result_nodes = conses_high.nunion( result_nodes, mark_and_sweep_suggested_links( link_node2 ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                        }
                      }
                      finally
                      {
                        $current_suggested_depth$.rebind( _prev_bind_0_$32, thread );
                      }
                    }
                    done_var_$27 = makeBoolean( NIL == valid_$28 || NIL != done_var );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                  }
                }
              }
              done_var_$26 = makeBoolean( NIL == valid2 || NIL != done_var );
            }
          }
        }
        finally
        {
          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$31, thread );
        }
      }
    }
    finally
    {
      $pred_streng_space$.rebind( _prev_bind_0, thread );
    }
    return result_nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 15249L)
  public static SubLObject marked_with(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( node, $pred_streng_space$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 15674L)
  public static SubLObject node_visited_in_current_mode_p(final SubLObject node)
  {
    return sbhl_marking_utilities.sbhl_predicate_path_termination_p( node_marking_mode( node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 15872L)
  public static SubLObject node_is_marked_with_fewer_than_current_suggested_links_p(final SubLObject node)
  {
    return makeBoolean( NIL != node_is_unmysterious_p( node ) && node_marking_suggested_count( node ).numL( get_current_suggested_depth() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 16077L)
  public static SubLObject node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(final SubLObject node)
  {
    return makeBoolean( NIL != node_is_unmysterious_p( node ) || node_marking_suggested_count( node ).numG( get_current_suggested_depth() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 16306L)
  public static SubLObject node_is_unmysterious_p(final SubLObject node)
  {
    return makeBoolean( !node_marking_suggested_count( node ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 16475L)
  public static SubLObject node_is_older_than_current_generation_p(final SubLObject node)
  {
    return Numbers.numL( node_marking_generation( node ), sbhl_marking_vars.get_sbhl_marking_generation() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 16739L)
  public static SubLObject node_is_of_current_generation_p(final SubLObject node)
  {
    return Numbers.numE( node_marking_generation( node ), sbhl_marking_vars.get_sbhl_marking_generation() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 16872L)
  public static SubLObject node_marking_mode(final SubLObject node)
  {
    return pred_streng_marking_mode( marked_with( node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17001L)
  public static SubLObject pred_streng_marking_mode(final SubLObject marking)
  {
    return marking.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17080L)
  public static SubLObject node_marking_suggested_count(final SubLObject node)
  {
    return pred_streng_marking_suggested_count( marked_with( node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17201L)
  public static SubLObject pred_streng_marking_suggested_count(final SubLObject marking)
  {
    final SubLObject suggested_count = conses_high.second( marking );
    if( suggested_count.isInteger() )
    {
      return suggested_count;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17392L)
  public static SubLObject node_marking_generation(final SubLObject node)
  {
    return pred_streng_marking_generation( marked_with( node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17502L)
  public static SubLObject pred_streng_marking_generation(final SubLObject marking)
  {
    final SubLObject generation = conses_high.third( marking );
    if( generation.isInteger() )
    {
      return generation;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17670L)
  public static SubLObject store_marking(final SubLObject node, final SubLObject marking)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( node, $pred_streng_space$.getDynamicValue( thread ), marking );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 17936L)
  public static SubLObject generationally_mark_typed_node(final SubLObject node)
  {
    final SubLObject current_mode_marking = node_marking_mode( node );
    final SubLObject new_mode_marking = determine_mode_from_marking( current_mode_marking );
    store_marking( node, ConsesLow.list( new_mode_marking, get_current_suggested_depth(), sbhl_marking_vars.get_sbhl_marking_generation() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 18331L)
  public static SubLObject mark_suggested_node(final SubLObject node, final SubLObject depth)
  {
    final SubLObject current_mode_marking = node_marking_mode( node );
    final SubLObject new_mode_marking = determine_mode_from_marking( current_mode_marking );
    store_marking( node, ConsesLow.list( new_mode_marking, depth ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener-internals.lisp", position = 18649L)
  public static SubLObject determine_mode_from_marking(final SubLObject current_mode)
  {
    final SubLObject inverse_modeP = sbhl_search_vars.genl_inverse_mode_p();
    SubLObject result = NIL;
    if( NIL == current_mode )
    {
      if( NIL != inverse_modeP )
      {
        result = sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
      }
      else
      {
        result = sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
      }
    }
    else if( NIL != sbhl_marking_vars.genl_inverse_marking_p( current_mode ) && NIL != inverse_modeP )
    {
      result = sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
    }
    else if( NIL != sbhl_marking_vars.genl_preds_marking_p( current_mode ) && NIL == inverse_modeP )
    {
      result = sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
    }
    else
    {
      result = sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue();
    }
    return result;
  }

  public static SubLObject declare_predicate_strengthener_internals_file()
  {
    SubLFiles.declareFunction( me, "get_arg_type_alist", "GET-ARG-TYPE-ALIST", 0, 0, false );
    SubLFiles.declareMacro( me, "with_arg_type_alist", "WITH-ARG-TYPE-ALIST" );
    SubLFiles.declareFunction( me, "get_arg_type_store", "GET-ARG-TYPE-STORE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_new_arg_type_genls_stores", "WITH-NEW-ARG-TYPE-GENLS-STORES" );
    SubLFiles.declareFunction( me, "initialize_arg_type_genls_stores", "INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_streng_depth_mark_all_forward_true_nodes", "PRED-STRENG-DEPTH-MARK-ALL-FORWARD-TRUE-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "non_trivial_argn_isa", "NON-TRIVIAL-ARGN-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_types_alist_satisfied_p", "ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_meets_arg_constraints_p", "NODE-MEETS-ARG-CONSTRAINTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "suggestion_assertion_meets_arg_constraints_p", "SUGGESTION-ASSERTION-MEETS-ARG-CONSTRAINTS-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_new_pred_streng_setup", "WITH-NEW-PRED-STRENG-SETUP" );
    SubLFiles.declareMacro( me, "with_new_pred_streng_done", "WITH-NEW-PRED-STRENG-DONE" );
    SubLFiles.declareMacro( me, "with_new_pred_streng_result_nodes", "WITH-NEW-PRED-STRENG-RESULT-NODES" );
    SubLFiles.declareFunction( me, "push_node_onto_result", "PUSH-NODE-ONTO-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_result", "CLEAR-RESULT", 0, 0, false );
    SubLFiles.declareMacro( me, "with_pred_streng_result", "WITH-PRED-STRENG-RESULT" );
    SubLFiles.declareFunction( me, "get_current_suggested_depth", "GET-CURRENT-SUGGESTED-DEPTH", 0, 0, false );
    SubLFiles.declareMacro( me, "with_incremented_suggested_depth", "WITH-INCREMENTED-SUGGESTED-DEPTH" );
    SubLFiles.declareMacro( me, "with_new_suggested_depth", "WITH-NEW-SUGGESTED-DEPTH" );
    SubLFiles.declareMacro( me, "with_new_pred_streng_spaces", "WITH-NEW-PRED-STRENG-SPACES" );
    SubLFiles.declareMacro( me, "with_generational_space", "WITH-GENERATIONAL-SPACE" );
    SubLFiles.declareMacro( me, "with_suggested_space", "WITH-SUGGESTED-SPACE" );
    SubLFiles.declareMacro( me, "do_accessible_typed_nodes", "DO-ACCESSIBLE-TYPED-NODES" );
    SubLFiles.declareMacro( me, "do_accessible_suggested_assertions", "DO-ACCESSIBLE-SUGGESTED-ASSERTIONS" );
    SubLFiles.declareFunction( me, "strengthened_preds", "STRENGTHENED-PREDS", 2, 1, false );
    SubLFiles.declareFunction( me, "compute_pred_streng_result", "COMPUTE-PRED-STRENG-RESULT", 0, 0, false );
    SubLFiles.declareFunction( me, "mark_and_sweep_connected_typed_links", "MARK-AND-SWEEP-CONNECTED-TYPED-LINKS", 1, 1, false );
    SubLFiles.declareFunction( me, "mark_and_sweep_suggested_links", "MARK-AND-SWEEP-SUGGESTED-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "marked_with", "MARKED-WITH", 1, 0, false );
    SubLFiles.declareFunction( me, "node_visited_in_current_mode_p", "NODE-VISITED-IN-CURRENT-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_is_marked_with_fewer_than_current_suggested_links_p", "NODE-IS-MARKED-WITH-FEWER-THAN-CURRENT-SUGGESTED-LINKS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p", "NODE-IS-UNMYSTERIOUS-OR-MARKED-WITH-MORE-THAN-CURRENT-SUGGESTED-LINKS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_is_unmysterious_p", "NODE-IS-UNMYSTERIOUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_is_older_than_current_generation_p", "NODE-IS-OLDER-THAN-CURRENT-GENERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_is_of_current_generation_p", "NODE-IS-OF-CURRENT-GENERATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "node_marking_mode", "NODE-MARKING-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_streng_marking_mode", "PRED-STRENG-MARKING-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "node_marking_suggested_count", "NODE-MARKING-SUGGESTED-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_streng_marking_suggested_count", "PRED-STRENG-MARKING-SUGGESTED-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "node_marking_generation", "NODE-MARKING-GENERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_streng_marking_generation", "PRED-STRENG-MARKING-GENERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "store_marking", "STORE-MARKING", 2, 0, false );
    SubLFiles.declareFunction( me, "generationally_mark_typed_node", "GENERATIONALLY-MARK-TYPED-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_suggested_node", "MARK-SUGGESTED-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_mode_from_marking", "DETERMINE-MODE-FROM-MARKING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_predicate_strengthener_internals_file()
  {
    $arg_type_alist$ = SubLFiles.defparameter( "*ARG-TYPE-ALIST*", NIL );
    $arg_type_genls_stores$ = SubLFiles.defparameter( "*ARG-TYPE-GENLS-STORES*", NIL );
    $pred_streng_doneP$ = SubLFiles.defparameter( "*PRED-STRENG-DONE?*", NIL );
    $pred_streng_result_nodes$ = SubLFiles.defparameter( "*PRED-STRENG-RESULT-NODES*", NIL );
    $current_suggested_depth$ = SubLFiles.defparameter( "*CURRENT-SUGGESTED-DEPTH*", NIL );
    $pred_streng_space$ = SubLFiles.defparameter( "*PRED-STRENG-SPACE*", NIL );
    $pred_streng_generational_space$ = SubLFiles.defparameter( "*PRED-STRENG-GENERATIONAL-SPACE*", NIL );
    $pred_streng_suggested_space$ = SubLFiles.defparameter( "*PRED-STRENG-SUGGESTED-SPACE*", NIL );
    return NIL;
  }

  public static SubLObject setup_predicate_strengthener_internals_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_predicate_strengthener_internals_file();
  }

  @Override
  public void initializeVariables()
  {
    init_predicate_strengthener_internals_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_predicate_strengthener_internals_file();
  }
  static
  {
    me = new predicate_strengthener_internals();
    $arg_type_alist$ = null;
    $arg_type_genls_stores$ = null;
    $pred_streng_doneP$ = null;
    $pred_streng_result_nodes$ = null;
    $current_suggested_depth$ = null;
    $pred_streng_space$ = null;
    $pred_streng_generational_space$ = null;
    $pred_streng_suggested_space$ = null;
    $list0 = ConsesLow.list( makeSymbol( "ALIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $sym2$_ARG_TYPE_ALIST_ = makeSymbol( "*ARG-TYPE-ALIST*" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ARG-TYPE-GENLS-STORES*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ) ) );
    $sym4$INITIALIZE_ARG_TYPE_GENLS_STORES = makeSymbol( "INITIALIZE-ARG-TYPE-GENLS-STORES" );
    $const5$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const6$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const7$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const8$kePrecisionSuggestionByTypeRestri = constant_handles.reader_make_constant_shell( makeString( "kePrecisionSuggestionByTypeRestriction-Inverse" ) );
    $sym9$WITH_NEW_PRED_STRENG_DONE = makeSymbol( "WITH-NEW-PRED-STRENG-DONE" );
    $sym10$WITH_NEW_PRED_STRENG_SPACES = makeSymbol( "WITH-NEW-PRED-STRENG-SPACES" );
    $sym11$WITH_NEW_SUGGESTED_DEPTH = makeSymbol( "WITH-NEW-SUGGESTED-DEPTH" );
    $sym12$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol( "WITH-NEW-SBHL-PREDICATE-MODE-SCOPE" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PRED-STRENG-DONE?*" ), NIL ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PRED-STRENG-RESULT-NODES*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ) );
    $list15 = ConsesLow.list( makeSymbol( "RESULT-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym16$WITH_NEW_PRED_STRENG_RESULT_NODES = makeSymbol( "WITH-NEW-PRED-STRENG-RESULT-NODES" );
    $sym17$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym18$PROGN = makeSymbol( "PROGN" );
    $sym19$CSETQ = makeSymbol( "CSETQ" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "COMPUTE-PRED-STRENG-RESULT" ) ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-SUGGESTED-DEPTH*" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "*CURRENT-SUGGESTED-DEPTH*" ) ) ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-SUGGESTED-DEPTH*" ), ZERO_INTEGER ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PRED-STRENG-GENERATIONAL-SPACE*" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), TWENTY_INTEGER ) ), ConsesLow.list( makeSymbol(
        "*PRED-STRENG-SUGGESTED-SPACE*" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), TWENTY_INTEGER ) ) );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PRED-STRENG-SPACE*" ), makeSymbol( "*PRED-STRENG-GENERATIONAL-SPACE*" ) ) );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PRED-STRENG-SPACE*" ), makeSymbol( "*PRED-STRENG-SUGGESTED-SPACE*" ) ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "NODE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list27 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw28$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw29$DONE = makeKeyword( "DONE" );
    $sym30$DONE_VAR = makeUninternedSymbol( "DONE-VAR" );
    $sym31$ASS_VAR = makeUninternedSymbol( "ASS-VAR" );
    $sym32$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $kw33$INDEX = makeKeyword( "INDEX" );
    $kw34$PREDICATE = makeKeyword( "PREDICATE" );
    $const35$typedGenlPreds = constant_handles.reader_make_constant_shell( makeString( "typedGenlPreds" ) );
    $sym36$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $sym37$FLIP_GENL_INVERSE_MODE = makeSymbol( "FLIP-GENL-INVERSE-MODE" );
    $const38$typedGenlInverse = constant_handles.reader_make_constant_shell( makeString( "typedGenlInverse" ) );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASS-VAR" ), makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "DEPTH-VAR" ), makeSymbol( "NODE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym40$DONE_VAR = makeUninternedSymbol( "DONE-VAR" );
    $const41$kePrecisionSuggestionByTypeRestri = constant_handles.reader_make_constant_shell( makeString( "kePrecisionSuggestionByTypeRestriction-Binary" ) );
    $sym42$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $list43 = ConsesLow.list( makeSymbol( "*CURRENT-SUGGESTED-DEPTH*" ) );
    $sym44$WITH_INCREMENTED_SUGGESTED_DEPTH = makeSymbol( "WITH-INCREMENTED-SUGGESTED-DEPTH" );
    $const45$UnderspecifiedPredicate = constant_handles.reader_make_constant_shell( makeString( "UnderspecifiedPredicate" ) );
    $kw46$GAF = makeKeyword( "GAF" );
  }
}
/*
 * 
 * Total time: 398 ms
 * 
 */