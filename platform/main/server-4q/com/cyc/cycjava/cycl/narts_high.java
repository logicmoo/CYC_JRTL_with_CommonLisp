package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class narts_high
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.narts_high";
  public static final String myFingerPrint = "1f3c93da4de9c6ad82d396a9e3101f6b79209582eb2aea100664a70978618a8d";
  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9340L)
  public static SubLSymbol $nart_dump_id_table$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$NUM;
  private static final SubLSymbol $kw4$PROGRESS_MESSAGE;
  private static final SubLString $str5$mapping_narts_for_sweep;
  private static final SubLSymbol $kw6$DONE;
  private static final SubLSymbol $sym7$PIF;
  private static final SubLSymbol $sym8$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym9$PROGRESS_CSOME;
  private static final SubLSymbol $sym10$NARTS_AROUND;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$DO_NARTS;
  private static final SubLSymbol $sym13$NART_P;
  private static final SubLSymbol $sym14$NART_HL_FORMULA;
  private static final SubLList $list15;
  private static final SubLString $str16$Return_the_hl_formula_of_this_NAR;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$NAUT_P;
  private static final SubLList $list20;
  private static final SubLString $str21$Return_T_iff_OBJECT_is_a_datastru;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$NART_EL_FORMULA;
  private static final SubLString $str24$Return_the_el_formula_of_this_NAR;
  private static final SubLSymbol $sym25$POSSIBLY_NAUT_P;
  private static final SubLSymbol $sym26$TRUE;
  private static final SubLSymbol $sym27$RANDOM_NART;
  private static final SubLList $list28;
  private static final SubLString $str29$Return_a_randomly_chosen_NART_tha;
  private static final SubLList $list30;
  private static final SubLInteger $int31$500;
  private static final SubLSymbol $sym32$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym33$HL_FIND_OR_CREATE_NART;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$FIND_OR_CREATE_NART;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$FORT_P;
  private static final SubLString $str38$A_horrible_and_gross_circularity_;
  private static final SubLSymbol $sym39$REMOVE_NART;
  private static final SubLString $str40$Remove_NART_from_the_KB_;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$CLET;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const46$EverythingPSC;
  private static final SubLSymbol $kw47$RULE;
  private static final SubLObject $const48$forwardReificationRule;
  private static final SubLSymbol $sym49$_EXIT;
  private static final SubLSymbol $sym50$NART_INDEPENDENT_ASSERTIONS_INTERNAL;
  private static final SubLString $str51$Looking_for_bad_narts;
  private static final SubLSymbol $sym52$STRINGP;
  private static final SubLSymbol $kw53$SKIP;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$NART_ARG;
  private static final SubLSymbol $kw56$GAF;
  private static final SubLSymbol $kw57$FUNCTION_EXTENT;
  private static final SubLSymbol $kw58$OVERLAP;
  private static final SubLInteger $int59$100;
  private static final SubLSymbol $sym60$FIND_NART_BY_ID;

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 879L)
  public static SubLObject do_recent_narts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject num_tail = cdestructuring_bind.property_list_member( $kw3$NUM, current );
    final SubLObject num = ( NIL != num_tail ) ? conses_high.cadr( num_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw4$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : $str5$mapping_narts_for_sweep;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym7$PIF, ConsesLow.list( $sym8$POSITIVE_INTEGER_P, num ), ConsesLow.listS( $sym9$PROGRESS_CSOME, ConsesLow.list( var, ConsesLow.list( $sym10$NARTS_AROUND, $list11, num, num ),
        progress_message, done ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym12$DO_NARTS, ConsesLow.list( var, progress_message, $kw6$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 1416L)
  public static SubLObject nart_hl_formula(final SubLObject nart)
  {
    enforceType( nart, $sym13$NART_P );
    return ( NIL != nart_handles.nart_handle_validP( nart ) ) ? narts_interface.kb_nart_hl_formula( nart ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 1785L)
  public static SubLObject nart_lookup(final SubLObject nart_hl_formula)
  {
    return narts_interface.kb_lookup_nart( nart_hl_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 1999L)
  public static SubLObject naut_p(final SubLObject v_object)
  {
    if( NIL != el_utilities.possibly_naut_p( v_object ) )
    {
      return cycl_grammar.cycl_nat_p( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 2332L)
  public static SubLObject invalid_nartP(final SubLObject nart, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    return makeBoolean( NIL != nart_handles.nart_p( nart ) && NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 2485L)
  public static SubLObject invalid_nart_robustP(final SubLObject nart)
  {
    SubLObject invalidP = makeBoolean( NIL != nart_handles.nart_p( nart ) && NIL == nart_handles.valid_nart_robustP( nart ) );
    if( NIL == invalidP )
    {
      final SubLObject tou = function_terms.term_of_unit_assertion( nart );
      if( NIL == tou )
      {
        return T;
      }
      invalidP = makeBoolean( !assertions_high.gaf_arg2( tou ).equal( nart_hl_formula( nart ) ) );
    }
    return invalidP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 2843L)
  public static SubLObject nart_el_formula(final SubLObject nart)
  {
    enforceType( nart, $sym13$NART_P );
    return transform_list_utilities.transform( nart, Symbols.symbol_function( $sym13$NART_P ), Symbols.symbol_function( $sym14$NART_HL_FORMULA ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 3060L)
  public static SubLObject find_nart(final SubLObject nart_hl_formula)
  {
    assert NIL != el_utilities.possibly_naut_p( nart_hl_formula ) : nart_hl_formula;
    final SubLObject nart = nart_substitute( nart_hl_formula );
    return ( NIL != nart_handles.nart_p( nart ) ) ? nart : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 3368L)
  public static SubLObject random_nart(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym26$TRUE );
    }
    if( nart_handles.nart_count().numG( ZERO_INTEGER ) )
    {
      final SubLObject max_id = nart_handles.next_nart_id();
      SubLObject v_answer;
      SubLObject candidate;
      for( v_answer = NIL; NIL == v_answer; v_answer = candidate )
      {
        candidate = nart_handles.find_nart_by_id( random.random( max_id ) );
        if( NIL != candidate && NIL != Functions.funcall( test, candidate ) )
        {
        }
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 3757L)
  public static SubLObject sample_narts(SubLObject n, SubLObject allow_repeatsP, SubLObject test)
  {
    if( n == UNPROVIDED )
    {
      n = $int31$500;
    }
    if( allow_repeatsP == UNPROVIDED )
    {
      allow_repeatsP = NIL;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym26$TRUE );
    }
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    if( NIL != allow_repeatsP )
    {
      SubLObject result = NIL;
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        result = ConsesLow.cons( random_nart( test ), result );
      }
      return result;
    }
    SubLObject result;
    for( result = set_contents.new_set_contents( n, Symbols.symbol_function( EQL ) ); set_contents.set_contents_size( result ).numL( n ); result = set_contents.set_contents_add( random_nart( test ), result, Symbols
        .symbol_function( EQL ) ) )
    {
    }
    return set_contents.set_contents_element_list( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 4326L)
  public static SubLObject hl_find_or_create_nart(final SubLObject nart_hl_formula)
  {
    assert NIL != el_utilities.possibly_naut_p( nart_hl_formula ) : nart_hl_formula;
    return czer_main.cyc_find_or_create_nart( nart_hl_formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 4672L)
  public static SubLObject tl_find_or_create_nart(final SubLObject canonical_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_enabledP$.bind( NIL, thread );
      result = czer_main.cyc_find_or_create_nart( canon_tl.transform_tl_terms_to_hl( canonical_naut ), UNPROVIDED );
    }
    finally
    {
      kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 4976L)
  public static SubLObject find_or_create_nart(final SubLObject nart_hl_formula)
  {
    return hl_find_or_create_nart( nart_hl_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 5187L)
  public static SubLObject remove_dependent_narts(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject cdolist_list_var;
    final SubLObject dependencies = cdolist_list_var = indexing_utilities.dependent_narts( fort );
    SubLObject dependent = NIL;
    dependent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != nart_handles.valid_nartP( dependent, UNPROVIDED ) )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && fort.eql( dependent ) )
        {
          Errors.error( $str38$A_horrible_and_gross_circularity_, fort );
        }
        cyc_kernel.cyc_kill( dependent );
      }
      cdolist_list_var = cdolist_list_var.rest();
      dependent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 5621L)
  public static SubLObject remove_nart(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( nart, $sym13$NART_P );
    final SubLObject _prev_bind_0 = hl_macros.$forts_being_removed$.currentBinding( thread );
    try
    {
      hl_macros.$forts_being_removed$.bind( ConsesLow.cons( nart, hl_macros.$forts_being_removed$.getDynamicValue( thread ) ), thread );
      if( NIL != kb_control_vars.time_kb_loaded_p() && NIL != sbhl_time_utilities.sbhl_temporality_term_p( nart ) )
      {
        sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures( nart );
      }
      remove_dependent_narts( nart );
      kb_indexing.remove_term_indices( nart );
      kb_hl_supports_high.tms_remove_kb_hl_supports_mentioning_term( nart );
      cardinality_estimates.clear_cardinality_estimates( nart );
    }
    finally
    {
      hl_macros.$forts_being_removed$.rebind( _prev_bind_0, thread );
    }
    if( NIL != tms.tms_please_kill_this_term_for_me( nart ) )
    {
      return nart;
    }
    return narts_interface.kb_remove_nart( nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 6623L)
  public static SubLObject nart_expand(SubLObject v_object)
  {
    if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym13$NART_P ), v_object, UNPROVIDED ) )
    {
      v_object = transform_list_utilities.transform( v_object, Symbols.symbol_function( $sym13$NART_P ), Symbols.symbol_function( $sym23$NART_EL_FORMULA ), UNPROVIDED );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 6913L)
  public static SubLObject nart_substitute(final SubLObject v_object)
  {
    if( NIL == el_utilities.possibly_naut_p( v_object ) )
    {
      return v_object;
    }
    return nart_substitute_recursive( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 7311L)
  public static SubLObject nart_substitute_recursive(final SubLObject tree)
  {
    if( NIL != el_utilities.subl_escape_p( tree ) )
    {
      return tree;
    }
    SubLObject result = NIL;
    if( NIL != contains_nat_formula_as_elementP( tree ) )
    {
      final SubLObject new_tree = conses_high.copy_list( tree );
      SubLObject list;
      SubLObject arg;
      SubLObject sub_nart;
      for( list = NIL, list = new_tree; !list.isAtom(); list = list.rest() )
      {
        arg = list.first();
        if( NIL != function_terms.nat_formula_p( arg ) )
        {
          sub_nart = nart_substitute_recursive( arg );
          if( NIL != sub_nart )
          {
            ConsesLow.rplaca( list, sub_nart );
          }
        }
      }
      result = new_tree;
    }
    else
    {
      result = tree;
    }
    final SubLObject nart = nart_lookup( result );
    return ( NIL != nart_handles.nart_p( nart ) ) ? nart : result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 7897L)
  public static SubLObject contains_nat_formula_as_elementP(final SubLObject list)
  {
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = list; !rest.isAtom(); rest = rest.rest() )
    {
      arg = rest.first();
      if( NIL != function_terms.nat_formula_p( arg ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 8327L)
  public static SubLObject nart_with_functor_p(final SubLObject functor, final SubLObject v_object)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) && functor.eql( cycl_utilities.nat_functor( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 8569L)
  public static SubLObject nart_checkpoint_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && NIL != list_utilities.every_in_list( $sym32$NON_NEGATIVE_INTEGER_P,
        v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 8835L)
  public static SubLObject new_nart_checkpoint()
  {
    final SubLObject nart_count = nart_handles.nart_count();
    final SubLObject next_nart_id = nart_handles.next_nart_id();
    return ConsesLow.list( nart_count, next_nart_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9047L)
  public static SubLObject nart_checkpoint_currentP(final SubLObject nart_checkpoint)
  {
    SubLObject checkpoint_count = NIL;
    SubLObject checkpoint_next_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( nart_checkpoint, nart_checkpoint, $list42 );
    checkpoint_count = nart_checkpoint.first();
    SubLObject current = nart_checkpoint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, nart_checkpoint, $list42 );
    checkpoint_next_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( checkpoint_count.numE( nart_handles.nart_count() ) && checkpoint_next_id.numE( nart_handles.next_nart_id() ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( nart_checkpoint, $list42 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9443L)
  public static SubLObject nart_dump_id(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = nart_handles.nart_id( nart );
    final SubLObject dump_table = $nart_dump_id_table$.getDynamicValue( thread );
    if( NIL != dump_table )
    {
      id = id_index.id_index_lookup( dump_table, id, UNPROVIDED );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9683L)
  public static SubLObject find_nart_by_dump_id(final SubLObject dump_id)
  {
    return nart_handles.find_nart_by_id( dump_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 9816L)
  public static SubLObject with_nart_dump_id_table(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym43$CLET, $list44, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10003L)
  public static SubLObject useful_nartP(final SubLObject nart)
  {
    return makeBoolean( NIL != nart_handles.nart_p( nart ) && NIL != function_terms.nat_formula_p( nart_hl_formula( nart ) ) && ( NIL != nart_specified_to_be_retainedP( nart ) || NIL != skolemize_forward_nartP( nart )
        || NIL != nart_independent_assertions( nart ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10469L)
  public static SubLObject useless_nartP(final SubLObject nart)
  {
    return makeBoolean( NIL != nart_handles.nart_p( nart ) && NIL == useful_nartP( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10643L)
  public static SubLObject nart_specified_to_be_retainedP(final SubLObject nart)
  {
    return kb_accessors.term_specified_to_be_retainedP( nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10746L)
  public static SubLObject skolemize_forward_nartP(final SubLObject nart)
  {
    return makeBoolean( NIL != kb_accessors.skolemize_forward_somewhereP( cycl_utilities.nat_functor( nart ) ) || NIL != appears_in_forward_reification_ruleP( cycl_utilities.nat_functor( nart ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 10992L)
  public static SubLObject appears_in_forward_reification_ruleP(final SubLObject functor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const46$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( functor, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator( functor, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw47$RULE, NIL, NIL );
              SubLObject done_var_$2 = NIL;
              final SubLObject token_var_$3 = NIL;
              while ( NIL == done_var_$2)
              {
                final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( rule ) );
                if( NIL != valid_$4 && NIL != kb_mapping_utilities.pred_u_v_holds( $const48$forwardReificationRule, functor, rule, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  return T;
                }
                done_var_$2 = makeBoolean( NIL == valid_$4 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 11338L)
  public static SubLObject nart_dependent_assertions(final SubLObject nart)
  {
    assert NIL != nart_handles.nart_p( nart ) : nart;
    return assertions_interface.all_dependent_assertions( function_terms.term_of_unit_assertion( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 11584L)
  public static SubLObject nart_independent_assertions(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != nart_handles.nart_p( nart ) : nart;
    final SubLObject term_of_unit = function_terms.term_of_unit_assertion( nart );
    if( NIL != term_of_unit )
    {
      SubLObject independent_assertions = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding( thread );
      try
      {
        control_vars.$mapping_target$.bind( assertions_low.assertion_dependencies( term_of_unit ), thread );
        control_vars.$mapping_answer$.bind( Hashtables.make_hash_table( Numbers.integerDivide( kb_indexing.num_index( nart ), FOUR_INTEGER ), UNPROVIDED, UNPROVIDED ), thread );
        final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const46$EverythingPSC, thread );
          kb_mapping.map_term( Symbols.symbol_function( $sym50$NART_INDEPENDENT_ASSERTIONS_INTERNAL ), nart );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$7, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$6, thread );
        }
        independent_assertions = hash_table_utilities.hash_table_keys( control_vars.$mapping_answer$.getDynamicValue( thread ) );
      }
      finally
      {
        control_vars.$mapping_answer$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
      }
      return independent_assertions;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12166L)
  public static SubLObject nart_independent_assertions_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Hashtables.gethash( assertion, control_vars.$mapping_target$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ), T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12359L)
  public static SubLObject nart_id_from_recipe(final SubLObject nart_hl_formula)
  {
    final SubLObject nart = nart_lookup( nart_hl_formula );
    return ( NIL != nart_handles.nart_p( nart ) ) ? nart_handles.nart_id( nart ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12509L)
  public static SubLObject nart_knows_its_hl_formulaP(final SubLObject nart)
  {
    return el_utilities.el_formula_p( nart_hl_formula( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12647L)
  public static SubLObject all_narts_know_their_hl_formulasP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject badP = NIL;
    final SubLObject idx = nart_handles.do_narts_table();
    final SubLObject mess = $str51$Looking_for_bad_narts;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$8 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$8, $kw53$SKIP ) )
        {
          final SubLObject idx_$9 = idx_$8;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$9, $kw53$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$9 );
            final SubLObject backwardP_var = NIL;
            final SubLObject length = Sequences.length( vector_var );
            SubLObject current;
            final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER )
                : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
            SubLObject start = NIL;
            SubLObject end = NIL;
            SubLObject delta = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
            start = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
            end = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
            delta = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL == badP )
              {
                SubLObject end_var;
                SubLObject id;
                SubLObject nart;
                for( end_var = end, id = NIL, id = start; NIL == badP && NIL == subl_macros.do_numbers_endtest( id, delta, end_var ); id = Numbers.add( id, delta ) )
                {
                  nart = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( nart ) )
                    {
                      nart = $kw53$SKIP;
                    }
                    if( NIL == nart_knows_its_hl_formulaP( nart ) )
                    {
                      badP = T;
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
            }
          }
          final SubLObject idx_$10 = idx_$8;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$10 ) || NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$10 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$10 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$10 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw53$SKIP ) ) ? NIL : $kw53$SKIP;
            while ( id2.numL( end_id ) && NIL == badP)
            {
              final SubLObject nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) || NIL == id_index.id_index_tombstone_p( nart2 ) )
              {
                if( NIL == nart_knows_its_hl_formulaP( nart2 ) )
                {
                  badP = T;
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 12869L)
  public static SubLObject narts_that_dont_know_their_hl_formulas()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bad_narts = NIL;
    final SubLObject idx = nart_handles.do_narts_table();
    final SubLObject mess = $str51$Looking_for_bad_narts;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$12 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$12, $kw53$SKIP ) )
        {
          final SubLObject idx_$13 = idx_$12;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$13, $kw53$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$13 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject nart;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              nart = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( nart ) )
                {
                  nart = $kw53$SKIP;
                }
                if( NIL == nart_knows_its_hl_formulaP( nart ) )
                {
                  bad_narts = ConsesLow.cons( nart, bad_narts );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$14 = idx_$12;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$14 ) || NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$14 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$14 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$14 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw53$SKIP ) ) ? NIL : $kw53$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw53$SKIP ) || NIL == id_index.id_index_tombstone_p( nart2 ) )
              {
                if( NIL == nart_knows_its_hl_formulaP( nart2 ) )
                {
                  bad_narts = ConsesLow.cons( nart2, bad_narts );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return bad_narts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 13096L)
  public static SubLObject nart_findable_by_hl_formulaP(final SubLObject nart)
  {
    final SubLObject nart_hl_formula = nart_hl_formula( nart );
    final SubLObject found_nart = find_nart( nart_hl_formula );
    return Equality.eql( nart, found_nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 13276L)
  public static SubLObject cleanup_invalid_nart(final SubLObject nart_hl_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.possibly_naut_p( nart_hl_formula ) )
    {
      final SubLObject ans = NIL;
      final SubLObject l_index = kb_indexing.best_nat_lookup_index( nart_hl_formula, NIL );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method( l_index );
      if( pcase_var.eql( $kw55$NART_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject functor = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != functor )
          {
            if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, argnum, functor ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, argnum, functor );
              SubLObject done_var = ans;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                if( NIL != valid )
                {
                  SubLObject final_index_iterator = NIL;
                  try
                  {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw56$GAF, NIL, NIL );
                    SubLObject done_var_$16 = ans;
                    final SubLObject token_var_$17 = NIL;
                    while ( NIL == done_var_$16)
                    {
                      final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$17 );
                      final SubLObject valid_$18 = makeBoolean( !token_var_$17.eql( tou_assertion ) );
                      if( NIL != valid_$18 && NIL != assertion_handles.valid_assertionP( tou_assertion, UNPROVIDED ) )
                      {
                        final SubLObject naut = assertions_high.gaf_arg2( tou_assertion );
                        if( NIL != el_utilities.possibly_naut_p( naut ) && NIL != Functions.funcall( control_vars.$nat_matching_predicate$.getDynamicValue( thread ), naut, nart_hl_formula ) )
                        {
                          final SubLObject nart = assertions_high.gaf_arg1( tou_assertion );
                          if( NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) )
                          {
                            return tms.tms_remove_assertion( tou_assertion );
                          }
                        }
                      }
                      done_var_$16 = makeBoolean( NIL == valid_$18 || NIL != ans );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid || NIL != ans );
              }
            }
          }
          else if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, argnum, NIL ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, argnum, NIL );
            SubLObject done_var = ans;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw56$GAF, NIL, NIL );
                  SubLObject done_var_$17 = ans;
                  final SubLObject token_var_$18 = NIL;
                  while ( NIL == done_var_$17)
                  {
                    final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$18 );
                    final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( tou_assertion ) );
                    if( NIL != valid_$19 && NIL != assertion_handles.valid_assertionP( tou_assertion, UNPROVIDED ) )
                    {
                      final SubLObject naut = assertions_high.gaf_arg2( tou_assertion );
                      if( NIL != el_utilities.possibly_naut_p( naut ) && NIL != Functions.funcall( control_vars.$nat_matching_predicate$.getDynamicValue( thread ), naut, nart_hl_formula ) )
                      {
                        final SubLObject nart = assertions_high.gaf_arg1( tou_assertion );
                        if( NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) )
                        {
                          return tms.tms_remove_assertion( tou_assertion );
                        }
                      }
                    }
                    done_var_$17 = makeBoolean( NIL == valid_$19 || NIL != ans );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != ans );
            }
          }
        }
        else if( NIL != functor )
        {
          if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, NIL, functor ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, NIL, functor );
            SubLObject done_var = ans;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw56$GAF, NIL, NIL );
                  SubLObject done_var_$18 = ans;
                  final SubLObject token_var_$19 = NIL;
                  while ( NIL == done_var_$18)
                  {
                    final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$19 );
                    final SubLObject valid_$20 = makeBoolean( !token_var_$19.eql( tou_assertion ) );
                    if( NIL != valid_$20 && NIL != assertion_handles.valid_assertionP( tou_assertion, UNPROVIDED ) )
                    {
                      final SubLObject naut = assertions_high.gaf_arg2( tou_assertion );
                      if( NIL != el_utilities.possibly_naut_p( naut ) && NIL != Functions.funcall( control_vars.$nat_matching_predicate$.getDynamicValue( thread ), naut, nart_hl_formula ) )
                      {
                        final SubLObject nart = assertions_high.gaf_arg1( tou_assertion );
                        if( NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) )
                        {
                          return tms.tms_remove_assertion( tou_assertion );
                        }
                      }
                    }
                    done_var_$18 = makeBoolean( NIL == valid_$20 || NIL != ans );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != ans );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, NIL, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, NIL, NIL );
          SubLObject done_var = ans;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw56$GAF, NIL, NIL );
                SubLObject done_var_$19 = ans;
                final SubLObject token_var_$20 = NIL;
                while ( NIL == done_var_$19)
                {
                  final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$20 );
                  final SubLObject valid_$21 = makeBoolean( !token_var_$20.eql( tou_assertion ) );
                  if( NIL != valid_$21 && NIL != assertion_handles.valid_assertionP( tou_assertion, UNPROVIDED ) )
                  {
                    final SubLObject naut = assertions_high.gaf_arg2( tou_assertion );
                    if( NIL != el_utilities.possibly_naut_p( naut ) && NIL != Functions.funcall( control_vars.$nat_matching_predicate$.getDynamicValue( thread ), naut, nart_hl_formula ) )
                    {
                      final SubLObject nart = assertions_high.gaf_arg1( tou_assertion );
                      if( NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) )
                      {
                        return tms.tms_remove_assertion( tou_assertion );
                      }
                    }
                  }
                  done_var_$19 = makeBoolean( NIL == valid_$21 || NIL != ans );
                }
              }
              finally
              {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != ans );
          }
        }
      }
      else if( pcase_var.eql( $kw57$FUNCTION_EXTENT ) )
      {
        if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( kb_mapping_macros.do_nli_vfe_extract_key( l_index ) ) )
        {
          final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec( kb_mapping_macros.do_nli_vfe_extract_key( l_index ) );
          SubLObject final_index_iterator2 = NIL;
          try
          {
            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw56$GAF, NIL, NIL );
            SubLObject done_var2 = ans;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject tou_assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( tou_assertion2 ) );
              if( NIL != valid2 && NIL != assertion_handles.valid_assertionP( tou_assertion2, UNPROVIDED ) )
              {
                final SubLObject naut2 = assertions_high.gaf_arg2( tou_assertion2 );
                if( NIL != el_utilities.possibly_naut_p( naut2 ) && NIL != Functions.funcall( control_vars.$nat_matching_predicate$.getDynamicValue( thread ), naut2, nart_hl_formula ) )
                {
                  final SubLObject nart2 = assertions_high.gaf_arg1( tou_assertion2 );
                  if( NIL == nart_handles.valid_nartP( nart2, UNPROVIDED ) )
                  {
                    return tms.tms_remove_assertion( tou_assertion2 );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 || NIL != ans );
            }
          }
          finally
          {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values5 = Values.getValuesAsVector();
              if( NIL != final_index_iterator2 )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
              }
              Values.restoreValuesFromVector( _values5 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw58$OVERLAP ) )
      {
        SubLObject rest;
        SubLObject tou_assertion3;
        SubLObject naut3;
        SubLObject nart3;
        for( rest = NIL, rest = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_nli_vo_extract_key( l_index ), UNPROVIDED ); NIL == ans && NIL != rest; rest = rest.rest() )
        {
          tou_assertion3 = rest.first();
          if( NIL != assertion_handles.valid_assertionP( tou_assertion3, UNPROVIDED ) )
          {
            naut3 = assertions_high.gaf_arg2( tou_assertion3 );
            if( NIL != el_utilities.possibly_naut_p( naut3 ) && NIL != Functions.funcall( control_vars.$nat_matching_predicate$.getDynamicValue( thread ), naut3, nart_hl_formula ) )
            {
              nart3 = assertions_high.gaf_arg1( tou_assertion3 );
              if( NIL == nart_handles.valid_nartP( nart3, UNPROVIDED ) )
              {
                return tms.tms_remove_assertion( tou_assertion3 );
              }
            }
          }
        }
      }
      else
      {
        kb_mapping_macros.do_nli_method_error( l_index, method );
      }
      return ans;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 14001L)
  public static SubLObject narts_around_nart(final SubLObject nart, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int59$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != nart_handles.nart_p( nart ) : nart;
    return narts_around( nart_handles.nart_id( nart ), total, before, after );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-high.lisp", position = 14386L)
  public static SubLObject narts_around(final SubLObject nart_id, SubLObject total, SubLObject before, SubLObject after)
  {
    if( total == UNPROVIDED )
    {
      total = $int59$100;
    }
    if( before == UNPROVIDED )
    {
      before = ZERO_INTEGER;
    }
    if( after == UNPROVIDED )
    {
      after = Numbers.subtract( total, before );
    }
    assert NIL != subl_promotions.non_negative_integer_p( nart_id ) : nart_id;
    return assertions_high.kb_objects_around_id( $sym60$FIND_NART_BY_ID, ZERO_INTEGER, nart_id, nart_handles.next_nart_id(), total, before, after );
  }

  public static SubLObject declare_narts_high_file()
  {
    SubLFiles.declareMacro( me, "do_recent_narts", "DO-RECENT-NARTS" );
    SubLFiles.declareFunction( me, "nart_hl_formula", "NART-HL-FORMULA", 1, 0, false );
    new $nart_hl_formula$UnaryFunction();
    SubLFiles.declareFunction( me, "nart_lookup", "NART-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_p", "NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_nartP", "INVALID-NART?", 1, 1, false );
    SubLFiles.declareFunction( me, "invalid_nart_robustP", "INVALID-NART-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_el_formula", "NART-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "find_nart", "FIND-NART", 1, 0, false );
    new $find_nart$UnaryFunction();
    SubLFiles.declareFunction( me, "random_nart", "RANDOM-NART", 0, 1, false );
    SubLFiles.declareFunction( me, "sample_narts", "SAMPLE-NARTS", 0, 3, false );
    SubLFiles.declareFunction( me, "hl_find_or_create_nart", "HL-FIND-OR-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "tl_find_or_create_nart", "TL-FIND-OR-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_nart", "FIND-OR-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_dependent_narts", "REMOVE-DEPENDENT-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_nart", "REMOVE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_expand", "NART-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_substitute", "NART-SUBSTITUTE", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_substitute_recursive", "NART-SUBSTITUTE-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "contains_nat_formula_as_elementP", "CONTAINS-NAT-FORMULA-AS-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_with_functor_p", "NART-WITH-FUNCTOR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "nart_checkpoint_p", "NART-CHECKPOINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_nart_checkpoint", "NEW-NART-CHECKPOINT", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_checkpoint_currentP", "NART-CHECKPOINT-CURRENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_dump_id", "NART-DUMP-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_nart_by_dump_id", "FIND-NART-BY-DUMP-ID", 1, 0, false );
    SubLFiles.declareMacro( me, "with_nart_dump_id_table", "WITH-NART-DUMP-ID-TABLE" );
    SubLFiles.declareFunction( me, "useful_nartP", "USEFUL-NART?", 1, 0, false );
    SubLFiles.declareFunction( me, "useless_nartP", "USELESS-NART?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_specified_to_be_retainedP", "NART-SPECIFIED-TO-BE-RETAINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "skolemize_forward_nartP", "SKOLEMIZE-FORWARD-NART?", 1, 0, false );
    SubLFiles.declareFunction( me, "appears_in_forward_reification_ruleP", "APPEARS-IN-FORWARD-REIFICATION-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_dependent_assertions", "NART-DEPENDENT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_independent_assertions", "NART-INDEPENDENT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_independent_assertions_internal", "NART-INDEPENDENT-ASSERTIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_id_from_recipe", "NART-ID-FROM-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_knows_its_hl_formulaP", "NART-KNOWS-ITS-HL-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_narts_know_their_hl_formulasP", "ALL-NARTS-KNOW-THEIR-HL-FORMULAS?", 0, 0, false );
    SubLFiles.declareFunction( me, "narts_that_dont_know_their_hl_formulas", "NARTS-THAT-DONT-KNOW-THEIR-HL-FORMULAS", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_findable_by_hl_formulaP", "NART-FINDABLE-BY-HL-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "cleanup_invalid_nart", "CLEANUP-INVALID-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "narts_around_nart", "NARTS-AROUND-NART", 1, 3, false );
    SubLFiles.declareFunction( me, "narts_around", "NARTS-AROUND", 1, 3, false );
    return NIL;
  }

  public static SubLObject init_narts_high_file()
  {
    $nart_dump_id_table$ = SubLFiles.defparameter( "*NART-DUMP-ID-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_narts_high_file()
  {
    utilities_macros.register_cyc_api_function( $sym14$NART_HL_FORMULA, $list15, $str16$Return_the_hl_formula_of_this_NAR, $list17, $list18 );
    utilities_macros.register_cyc_api_function( $sym19$NAUT_P, $list20, $str21$Return_T_iff_OBJECT_is_a_datastru, NIL, $list22 );
    utilities_macros.register_cyc_api_function( $sym23$NART_EL_FORMULA, $list15, $str24$Return_the_el_formula_of_this_NAR, $list17, $list18 );
    utilities_macros.register_cyc_api_function( $sym27$RANDOM_NART, $list28, $str29$Return_a_randomly_chosen_NART_tha, NIL, $list30 );
    access_macros.define_obsolete_register( $sym33$HL_FIND_OR_CREATE_NART, $list34 );
    access_macros.define_obsolete_register( $sym35$FIND_OR_CREATE_NART, $list36 );
    utilities_macros.register_cyc_api_function( $sym39$REMOVE_NART, $list15, $str40$Remove_NART_from_the_KB_, $list17, $list41 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_narts_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_narts_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_narts_high_file();
  }
  static
  {
    me = new narts_high();
    $nart_dump_id_table$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&KEY" ), makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "PROGRESS-MESSAGE" ), makeString( "mapping narts for sweep" ) ), makeSymbol(
        "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "NUM" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$NUM = makeKeyword( "NUM" );
    $kw4$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $str5$mapping_narts_for_sweep = makeString( "mapping narts for sweep" );
    $kw6$DONE = makeKeyword( "DONE" );
    $sym7$PIF = makeSymbol( "PIF" );
    $sym8$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym9$PROGRESS_CSOME = makeSymbol( "PROGRESS-CSOME" );
    $sym10$NARTS_AROUND = makeSymbol( "NARTS-AROUND" );
    $list11 = ConsesLow.list( makeSymbol( "NEXT-NART-ID" ) );
    $sym12$DO_NARTS = makeSymbol( "DO-NARTS" );
    $sym13$NART_P = makeSymbol( "NART-P" );
    $sym14$NART_HL_FORMULA = makeSymbol( "NART-HL-FORMULA" );
    $list15 = ConsesLow.list( makeSymbol( "NART" ) );
    $str16$Return_the_hl_formula_of_this_NAR = makeString( "Return the hl formula of this NART." );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART" ), makeSymbol( "NART-P" ) ) );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSP" ) ) );
    $sym19$NAUT_P = makeSymbol( "NAUT-P" );
    $list20 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str21$Return_T_iff_OBJECT_is_a_datastru = makeString(
        "Return T iff OBJECT is a datastructure implementing a non-atomic unreified term (NAUT).\n   By definition, this satisies @xref CYCL-NAT-P but not @xref NART-P." );
    $list22 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym23$NART_EL_FORMULA = makeSymbol( "NART-EL-FORMULA" );
    $str24$Return_the_el_formula_of_this_NAR = makeString( "Return the el formula of this NART." );
    $sym25$POSSIBLY_NAUT_P = makeSymbol( "POSSIBLY-NAUT-P" );
    $sym26$TRUE = makeSymbol( "TRUE" );
    $sym27$RANDOM_NART = makeSymbol( "RANDOM-NART" );
    $list28 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TRUE" ) ) ) );
    $str29$Return_a_randomly_chosen_NART_tha = makeString( "Return a randomly chosen NART that satisfies TEST" );
    $list30 = ConsesLow.list( makeSymbol( "NART-P" ) );
    $int31$500 = makeInteger( 500 );
    $sym32$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym33$HL_FIND_OR_CREATE_NART = makeSymbol( "HL-FIND-OR-CREATE-NART" );
    $list34 = ConsesLow.list( makeSymbol( "CYC-FIND-OR-CREATE-NART" ) );
    $sym35$FIND_OR_CREATE_NART = makeSymbol( "FIND-OR-CREATE-NART" );
    $list36 = ConsesLow.list( makeSymbol( "HL-FIND-OR-CREATE-NART" ) );
    $sym37$FORT_P = makeSymbol( "FORT-P" );
    $str38$A_horrible_and_gross_circularity_ = makeString( "A horrible and gross circularity has occurred -- ~s is a dependent of itself!" );
    $sym39$REMOVE_NART = makeSymbol( "REMOVE-NART" );
    $str40$Remove_NART_from_the_KB_ = makeString( "Remove NART from the KB." );
    $list41 = ConsesLow.list( makeSymbol( "NULL" ) );
    $list42 = ConsesLow.list( makeSymbol( "CHECKPOINT-COUNT" ), makeSymbol( "CHECKPOINT-NEXT-ID" ) );
    $sym43$CLET = makeSymbol( "CLET" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NART-DUMP-ID-TABLE*" ), ConsesLow.list( makeSymbol( "CREATE-NART-DUMP-ID-TABLE" ) ) ), ConsesLow.list( makeSymbol( "*CFASL-NART-HANDLE-FUNC*" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "NART-DUMP-ID" ) ) ) );
    $sym45$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const46$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw47$RULE = makeKeyword( "RULE" );
    $const48$forwardReificationRule = constant_handles.reader_make_constant_shell( makeString( "forwardReificationRule" ) );
    $sym49$_EXIT = makeSymbol( "%EXIT" );
    $sym50$NART_INDEPENDENT_ASSERTIONS_INTERNAL = makeSymbol( "NART-INDEPENDENT-ASSERTIONS-INTERNAL" );
    $str51$Looking_for_bad_narts = makeString( "Looking for bad narts" );
    $sym52$STRINGP = makeSymbol( "STRINGP" );
    $kw53$SKIP = makeKeyword( "SKIP" );
    $list54 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $kw55$NART_ARG = makeKeyword( "NART-ARG" );
    $kw56$GAF = makeKeyword( "GAF" );
    $kw57$FUNCTION_EXTENT = makeKeyword( "FUNCTION-EXTENT" );
    $kw58$OVERLAP = makeKeyword( "OVERLAP" );
    $int59$100 = makeInteger( 100 );
    $sym60$FIND_NART_BY_ID = makeSymbol( "FIND-NART-BY-ID" );
  }

  public static final class $nart_hl_formula$UnaryFunction
      extends
        UnaryFunction
  {
    public $nart_hl_formula$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NART-HL-FORMULA" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nart_hl_formula( arg1 );
    }
  }

  public static final class $find_nart$UnaryFunction
      extends
        UnaryFunction
  {
    public $find_nart$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FIND-NART" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return find_nart( arg1 );
    }
  }
}
/*
 * 
 * Total time: 598 ms
 * 
 */