package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tersifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.tersifier";
  public static final String myFingerPrint = "9f7631c3f5c86576d05e4d3476735d7fca51a53af0151dcbf3061ce5dc930bda";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1253L)
  private static SubLSymbol $constants_to_ignore_for_contraction_ht$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1526L)
  private static SubLSymbol $contraction_constant_ht$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1781L)
  private static SubLSymbol $contraction_checksum_ht$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2042L)
  private static SubLSymbol $canon_expansion_ht$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3962L)
  private static SubLSymbol $current_generic_arg_num$;
  private static final SubLSymbol $sym0$EL_FORMULA_P;
  private static final SubLSymbol $sym1$EL_CONTRACTION;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_CONTRACTION_CONSTANT_HT_;
  private static final SubLSymbol $sym4$_CONTRACTION_CHECKSUM_HT_;
  private static final SubLSymbol $sym5$_CANON_EXPANSION_HT_;
  private static final SubLSymbol $sym6$EL_VAR_;
  private static final SubLSymbol $sym7$VARIABLE_P;
  private static final SubLSymbol $sym8$DEFAULT_EL_VAR_FOR_HL_VAR;
  private static final SubLSymbol $sym9$UNREIFIED_SKOLEM_TERM_;
  private static final SubLSymbol $sym10$REPLACE_SKOLEM_ARGS_WITH_VARIABLES;
  private static final SubLSymbol $sym11$GENERIC_ARG_P;
  private static final SubLSymbol $sym12$GENERIC_ARG_TO_HL_VAR;
  private static final SubLSymbol $sym13$HL_VAR_TO_GENERIC_ARG;
  private static final SubLSymbol $sym14$DEFAULT_EL_VAR_;
  private static final SubLSymbol $sym15$HL_VAR_FOR_DEFAULT_EL_VAR;
  private static final SubLObject $const16$expansion;
  private static final SubLSymbol $sym17$FIRST;
  private static final SubLSymbol $sym18$KBEQ;
  private static final SubLObject $const19$True;
  private static final SubLObject $const20$False;
  private static final SubLSymbol $sym21$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const22$EverythingPSC;
  private static final SubLSymbol $sym23$ADD_ASSERTION_TO_CONTRACTION_HT;
  private static final SubLSymbol $sym24$GENERIC_ARG_NUM;
  private static final SubLSymbol $sym25$MAX;
  private static final SubLSymbol $sym26$SECOND;
  private static final SubLSymbol $sym27$CDR;
  private static final SubLSymbol $sym28$_;
  private static final SubLSymbol $sym29$CAR;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 721L)
  public static SubLObject tersify_cycl(final SubLObject formula, SubLObject mt, SubLObject settings)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( settings == UNPROVIDED )
    {
      settings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    thread.resetMultipleValues();
    SubLObject contracted_formula = el_contraction( formula, mt );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == changedP )
    {
      contracted_formula = el_utilities.map_formula_terms( Symbols.symbol_function( $sym1$EL_CONTRACTION ), formula, UNPROVIDED );
    }
    return contracted_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2256L)
  public static SubLObject contraction_hts_validP()
  {
    return makeBoolean( NIL != $canon_expansion_ht$.getGlobalValue() && NIL != $contraction_constant_ht$.getGlobalValue() && NIL != $contraction_checksum_ht$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2562L)
  public static SubLObject contraction_relevant_constant_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL == subl_promotions.memberP( v_object, $constants_to_ignore_for_contraction_ht$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2727L)
  public static SubLObject generic_arg_to_hl_var(final SubLObject generic_arg)
  {
    return variables.get_variable( at_utilities.generic_arg_num( generic_arg ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2945L)
  public static SubLObject hl_var_to_generic_arg(final SubLObject hl_var)
  {
    return at_utilities.get_generic_arg( variables.variable_id( hl_var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3116L)
  public static SubLObject clauses_hl_vars_to_el_vars(final SubLObject v_clauses, SubLObject blists)
  {
    if( blists == UNPROVIDED )
    {
      blists = NIL;
    }
    SubLObject new_clauses = NIL;
    SubLObject clause_list = NIL;
    SubLObject clause = NIL;
    SubLObject blist_list = NIL;
    SubLObject blist = NIL;
    clause_list = v_clauses;
    clause = clause_list.first();
    blist_list = blists;
    blist = blist_list.first();
    while ( NIL != clause_list)
    {
      SubLObject cdolist_list_var = blist;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        conses_high.nsubst( binding.first(), binding.rest(), clause, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
      new_clauses = ConsesLow.cons( clause, new_clauses );
      clause_list = clause_list.rest();
      clause = clause_list.first();
      blist_list = blist_list.rest();
      blist = blist_list.first();
    }
    return Sequences.nreverse( new_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3577L)
  public static SubLObject var_name_conflictsP(final SubLObject formula)
  {
    final SubLObject el_vars = list_utilities.tree_gather( formula, Symbols.symbol_function( $sym6$EL_VAR_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject hl_vars = list_utilities.tree_gather( formula, Symbols.symbol_function( $sym7$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return makeBoolean( NIL != conses_high.nintersection( el_vars, Mapping.mapcar( Symbols.symbol_function( $sym8$DEFAULT_EL_VAR_FOR_HL_VAR ), hl_vars ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4014L)
  public static SubLObject generic_arg_unify(final SubLObject generic_arg_template, final SubLObject v_object, final SubLObject object_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != var_name_conflictsP( generic_arg_template ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject highest_num = highest_generic_arg_num( generic_arg_template );
    final SubLObject _prev_bind_0 = $current_generic_arg_num$.currentBinding( thread );
    try
    {
      $current_generic_arg_num$.bind( Numbers.add( ONE_INTEGER, highest_num ), thread );
      final SubLObject unification_template = transform_list_utilities.ntransform( transform_list_utilities.ntransform( transform_list_utilities.transform( generic_arg_template, Symbols.symbol_function(
          $sym9$UNREIFIED_SKOLEM_TERM_ ), Symbols.symbol_function( $sym10$REPLACE_SKOLEM_ARGS_WITH_VARIABLES ), UNPROVIDED ), Symbols.symbol_function( $sym7$VARIABLE_P ), Symbols.symbol_function(
              $sym8$DEFAULT_EL_VAR_FOR_HL_VAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym11$GENERIC_ARG_P ), Symbols.symbol_function( $sym12$GENERIC_ARG_TO_HL_VAR ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      final SubLObject opaque_object = clauses_hl_vars_to_el_vars( v_object, object_bindings );
      result = check_temp_skolem_variables( unification_utilities.unify_clauses( unification_template, opaque_object, T, UNPROVIDED ), highest_num );
    }
    finally
    {
      $current_generic_arg_num$.rebind( _prev_bind_0, thread );
    }
    return transform_list_utilities.ntransform( transform_list_utilities.ntransform( result, Symbols.symbol_function( $sym7$VARIABLE_P ), Symbols.symbol_function( $sym13$HL_VAR_TO_GENERIC_ARG ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), Symbols.symbol_function( $sym14$DEFAULT_EL_VAR_ ), Symbols.symbol_function( $sym15$HL_VAR_FOR_DEFAULT_EL_VAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5008L)
  public static SubLObject expansion_clauseP(final SubLObject clause)
  {
    final SubLObject expansion_neglits = clauses.neg_lits( clause );
    final SubLObject expansion_poslits = clauses.pos_lits( clause );
    final SubLObject expansion_poslit = expansion_poslits.first();
    return makeBoolean( NIL == expansion_neglits && NIL != list_utilities.singletonP( expansion_poslits ) && NIL != el_utilities.el_binary_formula_p( expansion_poslit ) && NIL != kb_utilities.kbeq( $const16$expansion,
        cycl_utilities.formula_arg0( expansion_poslit ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6244L)
  public static SubLObject canonicalize_expansion(final SubLObject expansion, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$add_term_of_unit_litsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$reify_skolemsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$permit_generic_arg_variablesP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
    try
    {
      czer_vars.$add_term_of_unit_litsP$.bind( NIL, thread );
      czer_vars.$reify_skolemsP$.bind( NIL, thread );
      wff_vars.$permit_generic_arg_variablesP$.bind( T, thread );
      czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
      result = czer_main.canonicalize_cycl( expansion, mt );
    }
    finally
    {
      czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_4, thread );
      wff_vars.$permit_generic_arg_variablesP$.rebind( _prev_bind_3, thread );
      czer_vars.$reify_skolemsP$.rebind( _prev_bind_2, thread );
      czer_vars.$add_term_of_unit_litsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6598L)
  public static SubLObject add_assertion_to_contraction_ht(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue( thread ) )
    {
      if( NIL == contraction_hts_validP() )
      {
        sync_contraction_ht_to_kb();
      }
      final SubLObject expansion_clause = assertions_high.assertion_cnf( assertion );
      final SubLObject expansion_mt = assertions_high.assertion_mt( assertion );
      if( NIL != expansion_clauseP( expansion_clause ) )
      {
        thread.resetMultipleValues();
        final SubLObject hash_dollar_expansion = el_utilities.unmake_binary_formula( clauses.pos_lits( expansion_clause ).first() );
        final SubLObject new_reln = thread.secondMultipleValue();
        final SubLObject expansion = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject canon_expansion = canonicalize_expansion( expansion, expansion_mt );
        if( NIL == cycl_grammar.cycl_truth_value_p( canon_expansion ) && canon_expansion.isList() )
        {
          Hashtables.sethash( new_reln, $canon_expansion_ht$.getGlobalValue(), canon_expansion );
          final SubLObject v_clauses = Mapping.mapcar( Symbols.symbol_function( $sym17$FIRST ), canon_expansion );
          final SubLObject constants = cycl_utilities.constant_list( v_clauses, UNPROVIDED );
          SubLObject num_relevant_constants = ZERO_INTEGER;
          SubLObject cdolist_list_var = constants;
          SubLObject constant = NIL;
          constant = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != contraction_relevant_constant_p( constant ) )
            {
              num_relevant_constants = Numbers.add( num_relevant_constants, ONE_INTEGER );
              SubLObject relns = Hashtables.gethash( constant, $contraction_constant_ht$.getGlobalValue(), UNPROVIDED );
              final SubLObject item_var = new_reln;
              if( NIL == conses_high.member( item_var, relns, Symbols.symbol_function( $sym18$KBEQ ), Symbols.symbol_function( IDENTITY ) ) )
              {
                relns = ConsesLow.cons( item_var, relns );
              }
              Hashtables.sethash( constant, $contraction_constant_ht$.getGlobalValue(), relns );
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant = cdolist_list_var.first();
          }
          Hashtables.sethash( new_reln, $contraction_checksum_ht$.getGlobalValue(), num_relevant_constants );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8353L)
  public static SubLObject remove_assertion_from_contraction_ht(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue( thread ) )
    {
      if( NIL == contraction_hts_validP() )
      {
        sync_contraction_ht_to_kb();
      }
      final SubLObject expansion_clause = assertions_high.assertion_cnf( assertion );
      final SubLObject expansion_mt = assertions_high.assertion_mt( assertion );
      if( NIL != expansion_clauseP( expansion_clause ) )
      {
        thread.resetMultipleValues();
        final SubLObject hash_dollar_expansion = el_utilities.unmake_binary_formula( clauses.pos_lits( expansion_clause ).first() );
        final SubLObject dead_reln = thread.secondMultipleValue();
        final SubLObject expansion = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = czer_vars.$reify_skolemsP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_vars.$permit_generic_arg_variablesP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = czer_vars.$control_4$.currentBinding( thread );
        try
        {
          czer_vars.$reify_skolemsP$.bind( NIL, thread );
          wff_vars.$permit_generic_arg_variablesP$.bind( T, thread );
          czer_vars.$control_4$.bind( T, thread );
          final SubLObject canon_expansion = czer_main.canonicalize_cycl( expansion, expansion_mt );
          if( NIL == kb_utilities.kbeq( $const19$True, canon_expansion ) && NIL == kb_utilities.kbeq( $const20$False, canon_expansion ) && canon_expansion.isList() )
          {
            Hashtables.remhash( dead_reln, $canon_expansion_ht$.getGlobalValue() );
            final SubLObject v_clauses = Mapping.mapcar( Symbols.symbol_function( $sym17$FIRST ), canon_expansion );
            SubLObject cdolist_list_var;
            final SubLObject constants = cdolist_list_var = cycl_utilities.constant_list( v_clauses, UNPROVIDED );
            SubLObject constant = NIL;
            constant = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != contraction_relevant_constant_p( constant ) )
              {
                final SubLObject relns = Hashtables.gethash( constant, $contraction_constant_ht$.getGlobalValue(), UNPROVIDED );
                if( relns.equal( ConsesLow.list( dead_reln ) ) )
                {
                  Hashtables.remhash( constant, $contraction_constant_ht$.getGlobalValue() );
                }
                else
                {
                  Hashtables.sethash( constant, $contraction_constant_ht$.getGlobalValue(), Sequences.delete( dead_reln, relns, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              constant = cdolist_list_var.first();
            }
            Hashtables.remhash( dead_reln, $contraction_checksum_ht$.getGlobalValue() );
          }
        }
        finally
        {
          czer_vars.$control_4$.rebind( _prev_bind_3, thread );
          wff_vars.$permit_generic_arg_variablesP$.rebind( _prev_bind_2, thread );
          czer_vars.$reify_skolemsP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10084L)
  public static SubLObject sync_contraction_ht_to_kb()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_num = ZERO_INTEGER;
    if( NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue( thread ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym21$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const22$EverythingPSC, thread );
        final SubLObject expansion_formulas = kb_mapping.gather_predicate_extent_index( $const16$expansion, UNPROVIDED, UNPROVIDED );
        if( NIL != expansion_formulas )
        {
          final SubLObject len = result_num = Sequences.length( expansion_formulas );
          $canon_expansion_ht$.setGlobalValue( Hashtables.make_hash_table( len, Symbols.symbol_function( EQL ), UNPROVIDED ) );
          $contraction_constant_ht$.setGlobalValue( Hashtables.make_hash_table( len, Symbols.symbol_function( EQL ), UNPROVIDED ) );
          $contraction_checksum_ht$.setGlobalValue( Hashtables.make_hash_table( len, Symbols.symbol_function( EQL ), UNPROVIDED ) );
          list_utilities.nmapcar( Symbols.symbol_function( $sym23$ADD_ASSERTION_TO_CONTRACTION_HT ), expansion_formulas );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result_num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10961L)
  public static SubLObject highest_generic_arg_num(final SubLObject formula)
  {
    final SubLObject numbers = Mapping.mapcar( Symbols.symbol_function( $sym24$GENERIC_ARG_NUM ), list_utilities.tree_gather( formula, Symbols.symbol_function( $sym11$GENERIC_ARG_P ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
    return ( NIL != numbers ) ? Functions.apply( Symbols.symbol_function( $sym25$MAX ), numbers ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11189L)
  public static SubLObject check_temp_skolem_variables(final SubLObject bindings_list, final SubLObject highest_legit_num)
  {
    if( bindings_list.isList() && bindings_list.first().isList() )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = bindings_list.first();
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( binding.isList() && NIL != variables.variable_p( binding.first() ) && variables.variable_id( binding.first() ).numLE( highest_legit_num ) )
        {
          result = ConsesLow.cons( binding, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
      return ConsesLow.list( Sequences.nreverse( result ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11677L)
  public static SubLObject replace_skolem_args_with_variables(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_skolem = conses_high.copy_tree( skolem );
    ConsesLow.rplaca( new_skolem.rest(), at_utilities.get_generic_arg( $current_generic_arg_num$.getDynamicValue( thread ) ) );
    $current_generic_arg_num$.setDynamicValue( Numbers.add( $current_generic_arg_num$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return new_skolem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11962L)
  public static SubLObject contraction_candidates(final SubLObject formula)
  {
    final SubLObject constants = cycl_utilities.constant_list( formula, UNPROVIDED );
    final SubLObject temp_hash = Hashtables.make_hash_table( Hashtables.hash_table_count( $contraction_checksum_ht$.getGlobalValue() ), Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = constants;
    SubLObject constant = NIL;
    constant = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = Hashtables.gethash( constant, $contraction_constant_ht$.getGlobalValue(), UNPROVIDED );
      SubLObject reln = NIL;
      reln = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject sum = Hashtables.gethash( reln, temp_hash, UNPROVIDED );
        Hashtables.sethash( reln, temp_hash, sum.isInteger() ? Numbers.add( sum, ONE_INTEGER ) : ONE_INTEGER );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        reln = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      constant = cdolist_list_var.first();
    }
    SubLObject reln2 = NIL;
    SubLObject checksum = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( temp_hash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        reln2 = Hashtables.getEntryKey( cdohash_entry );
        checksum = Hashtables.getEntryValue( cdohash_entry );
        if( checksum.eql( Hashtables.gethash( reln2, $contraction_checksum_ht$.getGlobalValue(), UNPROVIDED ) ) )
        {
          result = ConsesLow.cons( reln2, result );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12743L)
  public static SubLObject el_contraction(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != czer_vars.$el_supports_contractionsP$.getDynamicValue( thread ) )
    {
      if( NIL == contraction_hts_validP() )
      {
        sync_contraction_ht_to_kb();
      }
      final SubLObject canon_formula = canonicalize_expansion( formula, mt );
      if( canon_formula.isCons() )
      {
        final SubLObject canon_formula_clauses = Mapping.mapcar( Symbols.symbol_function( $sym17$FIRST ), canon_formula );
        final SubLObject canon_formula_blists = Mapping.mapcar( Symbols.symbol_function( $sym26$SECOND ), canon_formula );
        final SubLObject relns = contraction_candidates( canon_formula_clauses );
        if( NIL != relns && NIL == result )
        {
          SubLObject csome_list_var = relns;
          SubLObject reln = NIL;
          reln = csome_list_var.first();
          while ( NIL == result && NIL != csome_list_var)
          {
            final SubLObject canon_expansion = Hashtables.gethash( reln, $canon_expansion_ht$.getGlobalValue(), UNPROVIDED );
            if( NIL != canon_expansion && canon_expansion.isList() )
            {
              final SubLObject canon_expansion_clauses = Mapping.mapcar( Symbols.symbol_function( $sym17$FIRST ), canon_expansion );
              final SubLObject v_bindings = generic_arg_unify( canon_expansion_clauses, canon_formula_clauses, canon_formula_blists );
              if( NIL != v_bindings && NIL != list_utilities.proper_list_p( v_bindings ) && NIL != list_utilities.proper_list_p( v_bindings.first() ) )
              {
                SubLObject arg_list_vars = NIL;
                SubLObject errorP = NIL;
                SubLObject cdolist_list_var = v_bindings.first();
                SubLObject binding = NIL;
                binding = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL != list_utilities.dotted_list_p( binding ) )
                  {
                    ConsesLow.rplaca( binding, at_utilities.generic_arg_num( binding.first() ) );
                    if( binding.first().isInteger() )
                    {
                      arg_list_vars = ConsesLow.cons( binding, arg_list_vars );
                    }
                    else
                    {
                      errorP = T;
                    }
                  }
                  else
                  {
                    errorP = T;
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  binding = cdolist_list_var.first();
                }
                if( NIL == errorP )
                {
                  final SubLObject sorted_arg_list_terms = Mapping.mapcar( Symbols.symbol_function( $sym27$CDR ), Sort.sort( arg_list_vars, Symbols.symbol_function( $sym28$_ ), Symbols.symbol_function( $sym29$CAR ) ) );
                  result = el_utilities.make_formula( reln, sorted_arg_list_terms, UNPROVIDED );
                }
              }
            }
            csome_list_var = csome_list_var.rest();
            reln = csome_list_var.first();
          }
        }
      }
    }
    return Values.values( ( NIL != result ) ? result : formula, list_utilities.sublisp_boolean( result ) );
  }

  public static SubLObject declare_tersifier_file()
  {
    SubLFiles.declareFunction( me, "tersify_cycl", "TERSIFY-CYCL", 1, 2, false );
    SubLFiles.declareFunction( me, "contraction_hts_validP", "CONTRACTION-HTS-VALID?", 0, 0, false );
    SubLFiles.declareFunction( me, "contraction_relevant_constant_p", "CONTRACTION-RELEVANT-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_arg_to_hl_var", "GENERIC-ARG-TO-HL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_var_to_generic_arg", "HL-VAR-TO-GENERIC-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "clauses_hl_vars_to_el_vars", "CLAUSES-HL-VARS-TO-EL-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "var_name_conflictsP", "VAR-NAME-CONFLICTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_arg_unify", "GENERIC-ARG-UNIFY", 3, 0, false );
    SubLFiles.declareFunction( me, "expansion_clauseP", "EXPANSION-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_expansion", "CANONICALIZE-EXPANSION", 2, 0, false );
    SubLFiles.declareFunction( me, "add_assertion_to_contraction_ht", "ADD-ASSERTION-TO-CONTRACTION-HT", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_assertion_from_contraction_ht", "REMOVE-ASSERTION-FROM-CONTRACTION-HT", 1, 0, false );
    SubLFiles.declareFunction( me, "sync_contraction_ht_to_kb", "SYNC-CONTRACTION-HT-TO-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "highest_generic_arg_num", "HIGHEST-GENERIC-ARG-NUM", 1, 0, false );
    SubLFiles.declareFunction( me, "check_temp_skolem_variables", "CHECK-TEMP-SKOLEM-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "replace_skolem_args_with_variables", "REPLACE-SKOLEM-ARGS-WITH-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "contraction_candidates", "CONTRACTION-CANDIDATES", 1, 0, false );
    SubLFiles.declareFunction( me, "el_contraction", "EL-CONTRACTION", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_tersifier_file()
  {
    $constants_to_ignore_for_contraction_ht$ = SubLFiles.deflexical( "*CONSTANTS-TO-IGNORE-FOR-CONTRACTION-HT*", $list2 );
    $contraction_constant_ht$ = SubLFiles.deflexical( "*CONTRACTION-CONSTANT-HT*", ( maybeDefault( $sym3$_CONTRACTION_CONSTANT_HT_, $contraction_constant_ht$, NIL ) ) );
    $contraction_checksum_ht$ = SubLFiles.deflexical( "*CONTRACTION-CHECKSUM-HT*", ( maybeDefault( $sym4$_CONTRACTION_CHECKSUM_HT_, $contraction_checksum_ht$, NIL ) ) );
    $canon_expansion_ht$ = SubLFiles.deflexical( "*CANON-EXPANSION-HT*", ( maybeDefault( $sym5$_CANON_EXPANSION_HT_, $canon_expansion_ht$, NIL ) ) );
    $current_generic_arg_num$ = SubLFiles.defparameter( "*CURRENT-GENERIC-ARG-NUM*", ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_tersifier_file()
  {
    subl_macro_promotions.declare_defglobal( $sym3$_CONTRACTION_CONSTANT_HT_ );
    subl_macro_promotions.declare_defglobal( $sym4$_CONTRACTION_CHECKSUM_HT_ );
    subl_macro_promotions.declare_defglobal( $sym5$_CANON_EXPANSION_HT_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_tersifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_tersifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_tersifier_file();
  }
  static
  {
    me = new tersifier();
    $constants_to_ignore_for_contraction_ht$ = null;
    $contraction_constant_ht$ = null;
    $contraction_checksum_ht$ = null;
    $canon_expansion_ht$ = null;
    $current_generic_arg_num$ = null;
    $sym0$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym1$EL_CONTRACTION = makeSymbol( "EL-CONTRACTION" );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ) );
    $sym3$_CONTRACTION_CONSTANT_HT_ = makeSymbol( "*CONTRACTION-CONSTANT-HT*" );
    $sym4$_CONTRACTION_CHECKSUM_HT_ = makeSymbol( "*CONTRACTION-CHECKSUM-HT*" );
    $sym5$_CANON_EXPANSION_HT_ = makeSymbol( "*CANON-EXPANSION-HT*" );
    $sym6$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym7$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym8$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol( "DEFAULT-EL-VAR-FOR-HL-VAR" );
    $sym9$UNREIFIED_SKOLEM_TERM_ = makeSymbol( "UNREIFIED-SKOLEM-TERM?" );
    $sym10$REPLACE_SKOLEM_ARGS_WITH_VARIABLES = makeSymbol( "REPLACE-SKOLEM-ARGS-WITH-VARIABLES" );
    $sym11$GENERIC_ARG_P = makeSymbol( "GENERIC-ARG-P" );
    $sym12$GENERIC_ARG_TO_HL_VAR = makeSymbol( "GENERIC-ARG-TO-HL-VAR" );
    $sym13$HL_VAR_TO_GENERIC_ARG = makeSymbol( "HL-VAR-TO-GENERIC-ARG" );
    $sym14$DEFAULT_EL_VAR_ = makeSymbol( "DEFAULT-EL-VAR?" );
    $sym15$HL_VAR_FOR_DEFAULT_EL_VAR = makeSymbol( "HL-VAR-FOR-DEFAULT-EL-VAR" );
    $const16$expansion = constant_handles.reader_make_constant_shell( makeString( "expansion" ) );
    $sym17$FIRST = makeSymbol( "FIRST" );
    $sym18$KBEQ = makeSymbol( "KBEQ" );
    $const19$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const20$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $sym21$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const22$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym23$ADD_ASSERTION_TO_CONTRACTION_HT = makeSymbol( "ADD-ASSERTION-TO-CONTRACTION-HT" );
    $sym24$GENERIC_ARG_NUM = makeSymbol( "GENERIC-ARG-NUM" );
    $sym25$MAX = makeSymbol( "MAX" );
    $sym26$SECOND = makeSymbol( "SECOND" );
    $sym27$CDR = makeSymbol( "CDR" );
    $sym28$_ = makeSymbol( "<" );
    $sym29$CAR = makeSymbol( "CAR" );
  }
}
/*
 * 
 * Total time: 104 ms
 * 
 */