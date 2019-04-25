package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unification_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.unification_utilities";
  public static final String myFingerPrint = "03c8fa2927af49aead2f49dffb46cbe3e2f09f4d3106055e47c58c5ab194c63d";
  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13365L)
  private static SubLSymbol $query_dnf_from_formula_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  private static SubLSymbol $monad_genl_mt_cachedP_caching_state$;
  private static final SubLSymbol $sym0$LISTP;
  private static final SubLSymbol $sym1$UNIFY_CLAUSE;
  private static final SubLSymbol $sym2$CLAUSE_P;
  private static final SubLSymbol $sym3$UNIFY_CLAUSE_LITERAL;
  private static final SubLSymbol $sym4$CLAUSES_P;
  private static final SubLSymbol $sym5$NON_BASE_VARIABLE_P;
  private static final SubLSymbol $sym6$VARIABLE_BASE_INVERSION_BINDING;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$UNIFY_ELEMENT;
  private static final SubLSymbol $sym9$UNIFY_SET;
  private static final SubLSymbol $sym10$UNIFY_SETS;
  private static final SubLSymbol $sym11$VARIABLE_P;
  private static final SubLSymbol $sym12$BASE_VARIABLE_P;
  private static final SubLSymbol $sym13$TERM__;
  private static final SubLSymbol $sym14$CAR;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$QUERY_DNF_FROM_FORMULA;
  private static final SubLSymbol $sym17$_QUERY_DNF_FROM_FORMULA_CACHING_STATE_;
  private static final SubLInteger $int18$512;
  private static final SubLSymbol $sym19$_EXIT;
  private static final SubLObject $const20$retainTerm;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$OBJECT_TO_STRING;
  private static final SubLObject $const24$Always_TimeInterval;
  private static final SubLObject $const25$TimePoint;
  private static final SubLSymbol $sym26$MONAD_GENL_MT_CACHED_;
  private static final SubLSymbol $sym27$_MONAD_GENL_MT_CACHED__CACHING_STATE_;
  private static final SubLInteger $int28$256;
  private static final SubLSymbol $sym29$CLEAR_MONAD_GENL_MT_CACHED_;
  private static final SubLObject $const30$MtTimeWithGranularityDimFn;
  private static final SubLList $list31;
  private static final SubLObject $const32$MtTimeDimFn;
  private static final SubLObject $const33$Null_TimeParameter;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$GENLMT;
  private static final SubLObject $const36$genlMt;
  private static final SubLSymbol $kw37$TIME;
  private static final SubLObject $const38$temporallySubsumes;
  private static final SubLObject $const39$temporallySubsumes_InsType;
  private static final SubLObject $const40$temporallySubsumes_TypeType;
  private static final SubLSymbol $sym41$TERM_UNIFY;
  private static final SubLSymbol $kw42$TEST;
  private static final SubLSymbol $kw43$OWNER;
  private static final SubLSymbol $kw44$CLASSES;
  private static final SubLSymbol $kw45$KB;
  private static final SubLSymbol $kw46$BOTH;
  private static final SubLSymbol $kw47$WORKING_;
  private static final SubLList $list48;

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 755L)
  public static SubLObject term_unify(final SubLObject term1, final SubLObject term2, SubLObject share_vars, SubLObject justifyP)
  {
    if( share_vars == UNPROVIDED )
    {
      share_vars = T;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    if( NIL != variables.variable_p( term1 ) && NIL != forts.fort_p( term2 ) )
    {
      return Values.values( ConsesLow.list( bindings.make_variable_binding( term1, term2 ) ), NIL );
    }
    return unification.unify( term1, term2, share_vars, justifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 1103L)
  public static SubLObject asent_unify(final SubLObject asent1, final SubLObject asent2, SubLObject share_vars, SubLObject justify)
  {
    if( share_vars == UNPROVIDED )
    {
      share_vars = NIL;
    }
    if( justify == UNPROVIDED )
    {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    return unification.unify( asent1, asent2, share_vars, justify );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 1295L)
  public static SubLObject gaf_asent_unify(final SubLObject inference_asent, final SubLObject gaf_asent, SubLObject share_vars, SubLObject justify)
  {
    if( share_vars == UNPROVIDED )
    {
      share_vars = T;
    }
    if( justify == UNPROVIDED )
    {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification.unify( inference_asent, gaf_asent, share_vars, justify );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( v_bindings, ( NIL != v_bindings ) ? gaf_asent : NIL, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 1601L)
  public static SubLObject gaf_asent_args_unify(final SubLObject inference_asent, final SubLObject gaf_asent, SubLObject share_vars, SubLObject justify)
  {
    if( share_vars == UNPROVIDED )
    {
      share_vars = T;
    }
    if( justify == UNPROVIDED )
    {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_args = cycl_utilities.atomic_sentence_args( inference_asent, UNPROVIDED );
    final SubLObject gaf_args = cycl_utilities.atomic_sentence_args( gaf_asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification.unify( inference_args, gaf_args, share_vars, justify );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      return Values.values( v_bindings, bindings.subst_bindings( v_bindings, inference_asent ), justification );
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 2091L)
  public static SubLObject gaf_asent_inverse_args_unify(final SubLObject inference_asent, final SubLObject gaf_asent, SubLObject share_vars, SubLObject justify)
  {
    if( share_vars == UNPROVIDED )
    {
      share_vars = T;
    }
    if( justify == UNPROVIDED )
    {
      justify = unification.$unify_return_justificationP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_args = Sequences.reverse( cycl_utilities.atomic_sentence_args( inference_asent, UNPROVIDED ) );
    final SubLObject gaf_args = cycl_utilities.atomic_sentence_args( gaf_asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification.unify( inference_args, gaf_args, share_vars, justify );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      return Values.values( v_bindings, bindings.subst_bindings( v_bindings, inference_asent ), justification );
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 2599L)
  public static SubLObject transformation_asent_unify(final SubLObject inference_asent, final SubLObject rule_asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_bindings = asent_unify( inference_asent, rule_asent, NIL, NIL );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( v_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 2906L)
  public static SubLObject rewrite_asent_unify(final SubLObject unrestricted_asent, final SubLObject rewritten_asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_bindings = asent_unify( unrestricted_asent, rewritten_asent, T, NIL );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( v_bindings, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 3213L)
  public static SubLObject unify_clauses(final SubLObject clauses1, final SubLObject clauses2, SubLObject share_varsP, SubLObject assume_bindings)
  {
    if( share_varsP == UNPROVIDED )
    {
      share_varsP = NIL;
    }
    if( assume_bindings == UNPROVIDED )
    {
      assume_bindings = NIL;
    }
    assert NIL != Types.listp( clauses1 ) : clauses1;
    assert NIL != Types.listp( clauses2 ) : clauses2;
    if( !Sequences.length( clauses1 ).numE( Sequences.length( clauses2 ) ) )
    {
      return NIL;
    }
    return clean_up_unify_result( unify_set_recursive( clauses1, clauses2, Symbols.symbol_function( $sym1$UNIFY_CLAUSE ), share_varsP, assume_bindings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 4040L)
  public static SubLObject clean_up_unify_result(final SubLObject binding_lists)
  {
    if( NIL == binding_lists || NIL == bindings.tree_find_dummy_bindingP( binding_lists ) )
    {
      return binding_lists;
    }
    SubLObject new_binding_lists = NIL;
    SubLObject cdolist_list_var = binding_lists;
    SubLObject binding_list = NIL;
    binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_binding_list = bindings.remove_dummy_binding( binding_list );
      if( NIL == bindings.unification_success_token_p( new_binding_list ) )
      {
        new_binding_lists = ConsesLow.cons( new_binding_list, new_binding_lists );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_list = cdolist_list_var.first();
    }
    if( NIL != new_binding_lists )
    {
      return Sequences.nreverse( new_binding_lists );
    }
    return ConsesLow.list( bindings.unification_success_token() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 4696L)
  public static SubLObject unify_clause(final SubLObject clause1, final SubLObject clause2, SubLObject share_varsP, SubLObject assume_bindings)
  {
    if( share_varsP == UNPROVIDED )
    {
      share_varsP = NIL;
    }
    if( assume_bindings == UNPROVIDED )
    {
      assume_bindings = NIL;
    }
    assert NIL != clauses.clause_p( clause1 ) : clause1;
    assert NIL != clauses.clause_p( clause2 ) : clause2;
    if( !Sequences.length( clauses.neg_lits( clause1 ) ).numE( Sequences.length( clauses.neg_lits( clause2 ) ) ) )
    {
      return NIL;
    }
    if( !Sequences.length( clauses.pos_lits( clause1 ) ).numE( Sequences.length( clauses.pos_lits( clause2 ) ) ) )
    {
      return NIL;
    }
    final SubLObject neg_lit_answers = unify_set_recursive( clauses.neg_lits( clause1 ), clauses.neg_lits( clause2 ), Symbols.symbol_function( $sym3$UNIFY_CLAUSE_LITERAL ), share_varsP, assume_bindings );
    if( NIL == neg_lit_answers )
    {
      return NIL;
    }
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = neg_lit_answers;
    SubLObject neg_lit_answer = NIL;
    neg_lit_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pos_lit_answers = unify_set_recursive( clauses.pos_lits( clause1 ), clauses.pos_lits( clause2 ), Symbols.symbol_function( $sym3$UNIFY_CLAUSE_LITERAL ), share_varsP, neg_lit_answer );
      if( NIL != pos_lit_answers )
      {
        SubLObject cdolist_list_var_$1 = pos_lit_answers;
        SubLObject pos_lit_answer = NIL;
        pos_lit_answer = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          answers = ConsesLow.cons( pos_lit_answer, answers );
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          pos_lit_answer = cdolist_list_var_$1.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      neg_lit_answer = cdolist_list_var.first();
    }
    return Sequences.nreverse( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 5992L)
  public static SubLObject unify_clause_literal(final SubLObject literal1, final SubLObject literal2, final SubLObject share_varsP, final SubLObject assume_bindings)
  {
    return unify_element( literal1, literal2, share_varsP, assume_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 6149L)
  public static SubLObject compute_variable_map(final SubLObject clauses1, SubLObject clauses2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != clauses.clauses_p( clauses1 ) : clauses1;
    assert NIL != clauses.clauses_p( clauses2 ) : clauses2;
    if( clauses1.equal( clauses2 ) )
    {
      return inference_czer.identity_variable_map( variables.max_hl_variable_id( clauses1 ) );
    }
    final SubLObject vars_to_sanitize = cycl_utilities.expression_gather( clauses2, $sym5$NON_BASE_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject sanitizing_variable_map = Mapping.mapcar( $sym6$VARIABLE_BASE_INVERSION_BINDING, vars_to_sanitize );
    clauses2 = bindings.apply_bindings( sanitizing_variable_map, clauses2 );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = unification.$computing_variable_mapP$.currentBinding( thread );
    try
    {
      unification.$computing_variable_mapP$.bind( T, thread );
      result = unify_clauses( clauses1, clauses2, NIL, UNPROVIDED ).first();
    }
    finally
    {
      unification.$computing_variable_mapP$.rebind( _prev_bind_0, thread );
    }
    SubLObject undwimmed_bindings = NIL;
    SubLObject cdolist_list_var = result;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject var1 = NIL;
      SubLObject var2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
      var1 = current.first();
      current = ( var2 = current.rest() );
      final SubLObject undwimmed_var1 = unification.variable_base_version( var1 );
      final SubLObject undwimmed_var2 = bindings.apply_bindings_backwards( sanitizing_variable_map, var2 );
      undwimmed_bindings = ConsesLow.cons( bindings.make_variable_binding( undwimmed_var1, undwimmed_var2 ), undwimmed_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( undwimmed_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 7400L)
  public static SubLObject variable_base_inversion_binding(final SubLObject variable)
  {
    return bindings.make_variable_binding( variable, unification.variable_base_inverted_version( variable ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 7544L)
  public static SubLObject unify_set(final SubLObject set1, final SubLObject set2, SubLObject share_varsP, SubLObject assume_bindings)
  {
    if( share_varsP == UNPROVIDED )
    {
      share_varsP = NIL;
    }
    if( assume_bindings == UNPROVIDED )
    {
      assume_bindings = NIL;
    }
    assert NIL != Types.listp( set1 ) : set1;
    assert NIL != Types.listp( set2 ) : set2;
    if( !Sequences.length( set1 ).numE( Sequences.length( set2 ) ) )
    {
      return NIL;
    }
    return unify_set_recursive( set1, set2, Symbols.symbol_function( $sym8$UNIFY_ELEMENT ), share_varsP, assume_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 8525L)
  public static SubLObject unify_sets(final SubLObject sets1, final SubLObject sets2, SubLObject share_varsP, SubLObject assume_bindings)
  {
    if( share_varsP == UNPROVIDED )
    {
      share_varsP = NIL;
    }
    if( assume_bindings == UNPROVIDED )
    {
      assume_bindings = NIL;
    }
    assert NIL != Types.listp( sets1 ) : sets1;
    assert NIL != Types.listp( sets2 ) : sets2;
    if( !Sequences.length( sets1 ).numE( Sequences.length( sets2 ) ) )
    {
      return NIL;
    }
    return unify_set_recursive( sets1, sets2, Symbols.symbol_function( $sym9$UNIFY_SET ), share_varsP, assume_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 9022L)
  public static SubLObject unify_sets_of_sets(final SubLObject sets_of_sets1, final SubLObject sets_of_sets2, SubLObject share_varsP, SubLObject assume_bindings)
  {
    if( share_varsP == UNPROVIDED )
    {
      share_varsP = NIL;
    }
    if( assume_bindings == UNPROVIDED )
    {
      assume_bindings = NIL;
    }
    assert NIL != Types.listp( sets_of_sets1 ) : sets_of_sets1;
    assert NIL != Types.listp( sets_of_sets2 ) : sets_of_sets2;
    if( !Sequences.length( sets_of_sets1 ).numE( Sequences.length( sets_of_sets2 ) ) )
    {
      return NIL;
    }
    return unify_set_recursive( sets_of_sets1, sets_of_sets2, Symbols.symbol_function( $sym10$UNIFY_SETS ), share_varsP, assume_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 9616L)
  public static SubLObject unify_set_recursive(final SubLObject set1, final SubLObject set2, final SubLObject elem_answer_function, final SubLObject share_varsP, final SubLObject assume_bindings)
  {
    if( NIL == set1 )
    {
      return ConsesLow.list( assume_bindings );
    }
    final SubLObject elem1 = set1.first();
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = set2;
    SubLObject elem2 = NIL;
    elem2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject single_elem_answers = Functions.funcall( elem_answer_function, elem1, elem2, share_varsP, assume_bindings );
      if( NIL != single_elem_answers )
      {
        SubLObject cdolist_list_var_$2 = single_elem_answers;
        SubLObject single_elem_answer = NIL;
        single_elem_answer = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          final SubLObject recursive_answers = unify_set_recursive( set1.rest(), Sequences.remove( elem2, set2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), elem_answer_function, share_varsP,
              list_utilities.fast_delete_duplicates( ConsesLow.append( assume_bindings, single_elem_answer ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          if( NIL != recursive_answers )
          {
            SubLObject cdolist_list_var_$3 = recursive_answers;
            SubLObject recursive_answer = NIL;
            recursive_answer = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              final SubLObject item_var = recursive_answer;
              if( NIL == conses_high.member( item_var, answers, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                answers = ConsesLow.cons( item_var, answers );
              }
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              recursive_answer = cdolist_list_var_$3.first();
            }
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          single_elem_answer = cdolist_list_var_$2.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      elem2 = cdolist_list_var.first();
    }
    return Sequences.nreverse( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 10487L)
  public static SubLObject unify_element(final SubLObject elem1, final SubLObject elem2, final SubLObject share_varsP, final SubLObject assume_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification.unify_assuming_bindings( elem1, elem2, share_varsP, assume_bindings, UNPROVIDED );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      return ConsesLow.list( v_bindings );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 10771L)
  public static SubLObject parent_to_unify_bindings(final SubLObject parent_dnf, final SubLObject unify_bindings)
  {
    final SubLObject v_variables = list_utilities.tree_gather( parent_dnf, Symbols.symbol_function( $sym11$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result_bindings = NIL;
    SubLObject cdolist_list_var = v_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject result_binding = NIL;
      assert NIL != unification.base_variable_p( variable ) : variable;
      final SubLObject high_variable = unification.variable_non_base_version( variable );
      result_binding = bindings.subst_bindings( unify_bindings, high_variable );
      result_bindings = ConsesLow.cons( bindings.make_variable_binding( variable, result_binding ), result_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return Sequences.nreverse( result_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 11508L)
  public static SubLObject unify_to_child_bindings(final SubLObject unify_dnf)
  {
    SubLObject v_variables = list_utilities.tree_gather( unify_dnf, Symbols.symbol_function( $sym11$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result_bindings = NIL;
    v_variables = Sort.sort( v_variables, Symbols.symbol_function( $sym13$TERM__ ), UNPROVIDED );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = v_variables;
    SubLObject unify_variable = NIL;
    unify_variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject child_variable = unify_variable;
      child_variable = variables.find_variable_by_id( index );
      index = Numbers.add( index, ONE_INTEGER );
      result_bindings = ConsesLow.cons( bindings.make_variable_binding( unify_variable, child_variable ), result_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      unify_variable = cdolist_list_var.first();
    }
    return Sequences.nreverse( result_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 12169L)
  public static SubLObject unify_source_bindings(final SubLObject unify_bindings, final SubLObject unify_child_bindings)
  {
    final SubLObject relevant_unify_bindings = Sequences.remove_if( Symbols.symbol_function( $sym5$NON_BASE_VARIABLE_P ), unify_bindings, Symbols.symbol_function( $sym14$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject relevant_unify_child_bindings = Sequences.remove_if( Symbols.symbol_function( $sym5$NON_BASE_VARIABLE_P ), unify_child_bindings, Symbols.symbol_function( $sym14$CAR ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    final SubLObject unify_source_bindings = conses_high.nunion( relevant_unify_bindings, relevant_unify_child_bindings, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym14$CAR ) );
    return unify_source_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 12933L)
  public static SubLObject parent_to_child_bindings(final SubLObject parent_unify_bindings, final SubLObject unify_child_bindings)
  {
    SubLObject final_bindings = NIL;
    SubLObject cdolist_list_var = parent_unify_bindings;
    SubLObject parent_unify_binding = NIL;
    parent_unify_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = parent_unify_binding;
      SubLObject parent_var = NIL;
      SubLObject unify_binding = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
      parent_var = current.first();
      current = ( unify_binding = current.rest() );
      final_bindings = ConsesLow.cons( bindings.make_variable_binding( unification.variable_base_version( parent_var ), conses_high.sublis( unify_child_bindings, unify_binding, UNPROVIDED, UNPROVIDED ) ),
          final_bindings );
      cdolist_list_var = cdolist_list_var.rest();
      parent_unify_binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( final_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13365L)
  public static SubLObject clear_query_dnf_from_formula()
  {
    final SubLObject cs = $query_dnf_from_formula_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13365L)
  public static SubLObject remove_query_dnf_from_formula(final SubLObject formula)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_dnf_from_formula_caching_state$.getGlobalValue(), ConsesLow.list( formula ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13365L)
  public static SubLObject query_dnf_from_formula_internal(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding( thread );
    try
    {
      czer_vars.$simplify_non_wff_literalP$.bind( NIL, thread );
      v_answer = Mapping.mapcar( Symbols.symbol_function( $sym14$CAR ), czer_main.canonicalize_query( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      czer_vars.$simplify_non_wff_literalP$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13365L)
  public static SubLObject query_dnf_from_formula(final SubLObject formula)
  {
    SubLObject caching_state = $query_dnf_from_formula_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym16$QUERY_DNF_FROM_FORMULA, $sym17$_QUERY_DNF_FROM_FORMULA_CACHING_STATE_, $int18$512, EQL, ONE_INTEGER, TEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_dnf_from_formula_internal( formula ) ) );
      memoization_state.caching_state_put( caching_state, formula, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13674L)
  public static SubLObject remove_duplicate_formulas(final SubLObject formula_list, SubLObject validateP)
  {
    if( validateP == UNPROVIDED )
    {
      validateP = NIL;
    }
    if( NIL != validateP )
    {
      return remove_duplicate_or_invalid_formulas( formula_list );
    }
    clear_query_dnf_from_formula();
    return Sequences.remove_duplicates( formula_list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym16$QUERY_DNF_FROM_FORMULA ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 13953L)
  public static SubLObject remove_duplicate_or_invalid_formulas(final SubLObject formula_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_query_dnf_from_formula();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding( thread );
    try
    {
      czer_vars.$must_enforce_semanticsP$.bind( T, thread );
      result = list_utilities.remove_from_end_duplicates_and_those_wXkey( formula_list, NIL, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym16$QUERY_DNF_FROM_FORMULA ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      czer_vars.$must_enforce_semanticsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 14242L)
  public static SubLObject unify_el(final SubLObject object_1, final SubLObject object_2, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_supports_dot_syntaxP$.currentBinding( thread );
    try
    {
      czer_vars.$el_supports_dot_syntaxP$.bind( T, thread );
      if( NIL != clause_utilities.cnfP( object_1 ) && NIL != clause_utilities.cnfP( object_2 ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings_$4 = unify_el_cnfs( object_1, object_2, justifyP );
        final SubLObject justification_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_bindings = v_bindings_$4;
        justification = justification_$5;
      }
      else if( NIL != cycl_grammar.cycl_denotational_term_p( object_1 ) && NIL != cycl_grammar.cycl_denotational_term_p( object_2 ) )
      {
        return unify_el_terms( object_1, object_2, UNPROVIDED );
      }
    }
    finally
    {
      czer_vars.$el_supports_dot_syntaxP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 14836L)
  public static SubLObject unify_el_cnfs(final SubLObject cnf_1, final SubLObject cnf_2, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_cnf_1 = czer_main.rename_clause_vars( cnf_1, UNPROVIDED ).first();
    final SubLObject hl_cnf_2 = ( NIL != hl_cnf_1 ) ? czer_main.rename_clause_vars( cnf_2, UNPROVIDED ).first() : NIL;
    SubLObject v_bindings = NIL;
    SubLObject justification = NIL;
    if( NIL != hl_cnf_2 )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings_$6 = unification.unify( hl_cnf_1, hl_cnf_2, NIL, justifyP );
      final SubLObject justification_$7 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      v_bindings = v_bindings_$6;
      justification = justification_$7;
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 15240L)
  public static SubLObject unify_el_terms(final SubLObject term_1, final SubLObject term_2, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    return unify_el_terms_int( term_1, term_2, justifyP, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 15393L)
  public static SubLObject unify_open_el_terms(final SubLObject term_1, final SubLObject term_2, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    return unify_el_terms_int( term_1, term_2, justifyP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 15553L)
  public static SubLObject unify_el_terms_int(final SubLObject term_1, final SubLObject term_2, final SubLObject justifyP, final SubLObject share_varsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = czer_main.rename_clause_vars( ConsesLow.list( $const20$retainTerm, term_1 ), UNPROVIDED );
    SubLObject hl_cnf_1 = NIL;
    SubLObject el_bindings_1 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    hl_cnf_1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    el_bindings_1 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$9;
      final SubLObject datum_$8 = current_$9 = czer_main.rename_clause_vars( ConsesLow.list( $const20$retainTerm, term_2 ), UNPROVIDED );
      SubLObject hl_cnf_2 = NIL;
      SubLObject el_bindings_2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list22 );
      hl_cnf_2 = current_$9.first();
      current_$9 = current_$9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list22 );
      el_bindings_2 = current_$9.first();
      current_$9 = current_$9.rest();
      if( NIL == current_$9 )
      {
        thread.resetMultipleValues();
        final SubLObject hl_bindings = unification.unify( hl_cnf_1, hl_cnf_2, share_varsP, justifyP );
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject transformed_el_bindings_1 = ( NIL != share_varsP ) ? el_bindings_1 : unification.non_base_variable_transform( el_bindings_1 );
        final SubLObject el_bindings = bindings.apply_bindings_backwards( el_bindings_2, bindings.apply_bindings_backwards( transformed_el_bindings_1, hl_bindings ) );
        return Values.values( el_bindings, justification );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum_$8, $list22 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 16207L)
  public static SubLObject unify_one_way(final SubLObject template, final SubLObject v_object)
  {
    final SubLObject opaque_object = transform_list_utilities.transform( v_object, $sym11$VARIABLE_P, $sym23$OBJECT_TO_STRING, UNPROVIDED );
    return unification.unify( template, opaque_object, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 16617L)
  public static SubLObject genl_mt_unify(SubLObject unbound_mt, SubLObject bound_mt, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = unification.$unify_return_justificationP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    bound_mt = date_utilities.possibly_bind_temporal_indexical_in_object( bound_mt );
    unbound_mt = date_utilities.possibly_bind_temporal_indexical_in_object( unbound_mt );
    SubLObject v_bindings = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = unification.$unify_return_justificationP$.currentBinding( thread );
    try
    {
      unification.$unify_return_justificationP$.bind( justifyP, thread );
      thread.resetMultipleValues();
      final SubLObject v_bindings_$10 = term_unify( unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED );
      final SubLObject justification_$11 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      v_bindings = v_bindings_$10;
      justification = justification_$11;
      if( NIL == v_bindings )
      {
        if( NIL != variables.fully_bound_p( unbound_mt ) )
        {
          if( NIL != genl_mts.genl_mtP( unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED ) )
          {
            v_bindings = bindings.unification_success_token();
            justification = genl_mt_unify_possibly_justify_genl_mt( unbound_mt, bound_mt );
          }
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings_$11 = ( NIL != hlmt.monad_mtP( bound_mt ) ) ? genl_mt_unify_int( unbound_mt, hlmt.new_hlmt( ConsesLow.list( bound_mt, hlmt.new_time_dimension( $const24$Always_TimeInterval,
              $const25$TimePoint ) ) ) ) : genl_mt_unify_int( unbound_mt, bound_mt );
          final SubLObject justification_$12 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          v_bindings = v_bindings_$11;
          justification = justification_$12;
          if( NIL != v_bindings )
          {
            v_bindings = bindings.delete_dummy_binding( v_bindings );
            if( NIL != v_bindings )
            {
              v_bindings = list_utilities.fast_delete_duplicates( v_bindings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              v_bindings = bindings.unification_success_token();
            }
          }
        }
      }
    }
    finally
    {
      unification.$unify_return_justificationP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject genl_mt_unify_int(final SubLObject unbound_mt, final SubLObject bound_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject v_bindings = term_unify( unbound_mt, bound_mt, UNPROVIDED, UNPROVIDED );
    SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == v_bindings )
    {
      if( NIL != forts.fort_p( unbound_mt ) )
      {
        if( NIL != hlmt.monad_mtP( bound_mt ) && NIL != monad_genl_mt_cachedP( unbound_mt, bound_mt ) )
        {
          v_bindings = bindings.unification_success_token();
          justification = genl_mt_unify_possibly_justify_genl_mt( unbound_mt, bound_mt );
        }
      }
      else if( NIL == forts.fort_p( bound_mt ) )
      {
        if( NIL != hlmt.temporal_dimension_mt_p( bound_mt ) )
        {
          if( NIL != variables.fully_bound_p( unbound_mt ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_bindings_$14 = genl_mt_unify_temporal_dimension_fully_bound( unbound_mt, bound_mt );
            final SubLObject justification_$15 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_bindings = v_bindings_$14;
            justification = justification_$15;
          }
          else if( NIL != list_utilities.dotted_list_p( unbound_mt ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_bindings_$15 = genl_mt_unify_temporal_dimension_dotted_list( unbound_mt, bound_mt );
            final SubLObject justification_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_bindings = v_bindings_$15;
            justification = justification_$16;
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject v_bindings_$16 = genl_mt_unify_temporal_dimension_undotted_list( unbound_mt, bound_mt );
            final SubLObject justification_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_bindings = v_bindings_$16;
            justification = justification_$17;
          }
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject car_bindings = genl_mt_unify_int( unbound_mt.first(), bound_mt.first() );
          final SubLObject car_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != car_bindings )
          {
            thread.resetMultipleValues();
            final SubLObject cdr_bindings = genl_mt_unify_int( unbound_mt.rest(), bound_mt.rest() );
            final SubLObject cdr_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != cdr_bindings && NIL == bindings.some_variable_with_conflicting_bindings( car_bindings, cdr_bindings ) )
            {
              v_bindings = ConsesLow.append( car_bindings, cdr_bindings );
              justification = ConsesLow.append( car_justification, cdr_justification );
            }
          }
        }
      }
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject clear_monad_genl_mt_cachedP()
  {
    final SubLObject cs = $monad_genl_mt_cachedP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject remove_monad_genl_mt_cachedP(final SubLObject monad1, final SubLObject monad2)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $monad_genl_mt_cachedP_caching_state$.getGlobalValue(), ConsesLow.list( monad1, monad2 ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject monad_genl_mt_cachedP_internal(final SubLObject monad1, final SubLObject monad2)
  {
    return genl_mts.monad_genl_mtP( monad1, monad2, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject monad_genl_mt_cachedP(final SubLObject monad1, final SubLObject monad2)
  {
    SubLObject caching_state = $monad_genl_mt_cachedP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym26$MONAD_GENL_MT_CACHED_, $sym27$_MONAD_GENL_MT_CACHED__CACHING_STATE_, $int28$256, EQL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym29$CLEAR_MONAD_GENL_MT_CACHED_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( monad1, monad2 );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( monad1.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && monad2.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( monad_genl_mt_cachedP_internal( monad1, monad2 ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( monad1, monad2 ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject genl_mt_unify_temporal_dimension_fully_bound(final SubLObject unbound_mt, final SubLObject bound_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    SubLObject justification = NIL;
    SubLObject bound_index = NIL;
    SubLObject bound_param = NIL;
    thread.resetMultipleValues();
    final SubLObject bound_index_$20 = hlmt.mt_time_dim_nat_temporal_values( bound_mt );
    final SubLObject bound_param_$21 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    bound_index = bound_index_$20;
    bound_param = bound_param_$21;
    SubLObject unbound_index = NIL;
    SubLObject unbound_param = NIL;
    thread.resetMultipleValues();
    final SubLObject unbound_index_$22 = hlmt.mt_time_dim_nat_temporal_values( unbound_mt );
    final SubLObject unbound_param_$23 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    unbound_index = unbound_index_$22;
    unbound_param = unbound_param_$23;
    if( NIL != hlmt_relevance.mt_times_visible_p( unbound_index, bound_index, unbound_param, bound_param ) )
    {
      v_bindings = bindings.unification_success_token();
      justification = genl_mt_unify_possibly_justify_genl_mt( unbound_mt, bound_mt );
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject genl_mt_unify_temporal_dimension_dotted_list(final SubLObject unbound_mt, final SubLObject bound_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    SubLObject justification = NIL;
    SubLObject bound_index = NIL;
    SubLObject bound_param = NIL;
    thread.resetMultipleValues();
    final SubLObject bound_index_$24 = hlmt.mt_time_dim_nat_temporal_values( bound_mt );
    final SubLObject bound_param_$25 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    bound_index = bound_index_$24;
    bound_param = bound_param_$25;
    final SubLObject pcase_var = unbound_mt.first();
    if( pcase_var.eql( $const30$MtTimeWithGranularityDimFn ) )
    {
      final SubLObject pcase_var_$26 = list_utilities.dotted_length( unbound_mt );
      if( pcase_var_$26.eql( ONE_INTEGER ) )
      {
        if( NIL != variables.variable_p( unbound_mt.rest() ) )
        {
          v_bindings = ConsesLow.list( bindings.make_variable_binding( unbound_mt.rest(), ConsesLow.list( bound_index, bound_param ) ) );
        }
      }
      else if( pcase_var_$26.eql( TWO_INTEGER ) )
      {
        SubLObject current;
        final SubLObject datum = current = unbound_mt.rest();
        SubLObject unbound_index = NIL;
        SubLObject unbound_param = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
        unbound_index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
        unbound_param = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != variables.variable_p( unbound_param ) )
          {
            final SubLObject param_binding = bindings.make_variable_binding( unbound_param, bound_param );
            if( NIL != variables.fully_bound_p( unbound_index ) )
            {
              if( NIL != hlmt_relevance.subsumed_time_intervalP( unbound_index, bound_index ) && NIL != hlmt_relevance.time_interval_subsumes_typeP( unbound_index, bound_param ) )
              {
                v_bindings = ConsesLow.list( param_binding );
              }
            }
            else
            {
              thread.resetMultipleValues();
              final SubLObject index_bindings = term_unify( unbound_index, bound_index, UNPROVIDED, UNPROVIDED );
              final SubLObject index_justification = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != index_bindings && NIL == bindings.some_variable_with_conflicting_bindings( index_bindings, ConsesLow.list( param_binding ) ) )
              {
                v_bindings = ConsesLow.cons( param_binding, index_bindings );
                justification = index_justification;
              }
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
        }
      }
    }
    else if( pcase_var.eql( $const32$MtTimeDimFn ) )
    {
      final SubLObject pcase_var_$27 = list_utilities.dotted_length( unbound_mt );
      if( pcase_var_$27.eql( ONE_INTEGER ) && NIL != variables.variable_p( unbound_mt.rest() ) && $const33$Null_TimeParameter.eql( bound_param ) )
      {
        v_bindings = ConsesLow.list( bindings.make_variable_binding( unbound_mt.rest(), ConsesLow.list( bound_index ) ) );
      }
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 18609L)
  public static SubLObject genl_mt_unify_temporal_dimension_undotted_list(final SubLObject unbound_mt, final SubLObject bound_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    SubLObject justification = NIL;
    SubLObject bound_index = NIL;
    SubLObject bound_param = NIL;
    thread.resetMultipleValues();
    final SubLObject bound_index_$28 = hlmt.mt_time_dim_nat_temporal_values( bound_mt );
    final SubLObject bound_param_$29 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    bound_index = bound_index_$28;
    bound_param = bound_param_$29;
    final SubLObject pcase_var = unbound_mt.first();
    if( pcase_var.eql( $const30$MtTimeWithGranularityDimFn ) )
    {
      final SubLObject pcase_var_$30 = Sequences.length( unbound_mt.rest() );
      if( pcase_var_$30.eql( TWO_INTEGER ) )
      {
        SubLObject current;
        final SubLObject datum = current = unbound_mt.rest();
        SubLObject unbound_index = NIL;
        SubLObject unbound_param = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
        unbound_index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
        unbound_param = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject index_bindings = NIL;
          SubLObject index_justification = NIL;
          SubLObject param_bindings = NIL;
          SubLObject param_justification = NIL;
          if( NIL != variables.fully_bound_p( unbound_index ) )
          {
            if( NIL != hlmt_relevance.subsumed_time_intervalP( unbound_index, bound_index ) && NIL != hlmt_relevance.time_interval_subsumes_typeP( unbound_index, bound_param ) )
            {
              index_bindings = bindings.unification_success_token();
              index_justification = ConsesLow.append( genl_mt_unify_possibly_justify_temporally_subsumes( bound_index, unbound_index ), genl_mt_unify_possibly_justify_temporally_subsumes_ins_type( unbound_index,
                  bound_param ) );
            }
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject index_bindings_$31 = term_unify( unbound_index, bound_index, UNPROVIDED, UNPROVIDED );
            final SubLObject index_justification_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            index_bindings = index_bindings_$31;
            index_justification = index_justification_$32;
          }
          if( NIL != variables.fully_bound_p( unbound_param ) )
          {
            if( NIL != hlmt_relevance.bigger_time_typeP( unbound_param, bound_param ) )
            {
              param_bindings = bindings.unification_success_token();
              param_justification = genl_mt_unify_possibly_justify_temporally_subsumes_type_type( unbound_param, bound_param );
            }
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject param_bindings_$33 = term_unify( unbound_param, bound_param, UNPROVIDED, UNPROVIDED );
            final SubLObject param_justification_$34 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            param_bindings = param_bindings_$33;
            param_justification = param_justification_$34;
          }
          if( NIL != index_bindings && NIL != param_bindings && NIL == bindings.some_variable_with_conflicting_bindings( index_bindings, param_bindings ) )
          {
            v_bindings = ConsesLow.append( index_bindings, param_bindings );
            justification = ConsesLow.append( index_justification, param_justification );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
        }
      }
    }
    else if( pcase_var.eql( $const32$MtTimeDimFn ) )
    {
      final SubLObject pcase_var_$31 = Sequences.length( unbound_mt.rest() );
      if( pcase_var_$31.eql( ONE_INTEGER ) )
      {
        SubLObject current;
        final SubLObject datum = current = unbound_mt.rest();
        SubLObject unbound_index = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
        unbound_index = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( $const33$Null_TimeParameter.eql( bound_param ) )
          {
            if( NIL != variables.fully_bound_p( unbound_index ) )
            {
              if( NIL != hlmt_relevance.subsumed_time_intervalP( unbound_index, bound_index ) )
              {
                v_bindings = bindings.unification_success_token();
                justification = genl_mt_unify_possibly_justify_temporally_subsumes( bound_index, unbound_index );
              }
            }
            else
            {
              thread.resetMultipleValues();
              final SubLObject v_bindings_$36 = term_unify( unbound_index, bound_index, UNPROVIDED, UNPROVIDED );
              final SubLObject justification_$37 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              v_bindings = v_bindings_$36;
              justification = justification_$37;
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
        }
      }
    }
    return Values.values( v_bindings, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 24736L)
  public static SubLObject genl_mt_unify_possibly_justify_genl_mt(final SubLObject spec_mt, final SubLObject genl_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != unification.$unify_return_justificationP$.getDynamicValue( thread ) ) ? ConsesLow.list( arguments.make_hl_support( $kw35$GENLMT, el_utilities.make_binary_formula( $const36$genlMt, spec_mt, genl_mt ),
        UNPROVIDED, UNPROVIDED ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 24939L)
  public static SubLObject genl_mt_unify_possibly_justify_temporally_subsumes(final SubLObject big_index, final SubLObject small_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != unification.$unify_return_justificationP$.getDynamicValue( thread ) ) ? ConsesLow.list( arguments.make_hl_support( $kw37$TIME, el_utilities.make_binary_formula( $const38$temporallySubsumes, big_index,
        small_index ), UNPROVIDED, UNPROVIDED ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 25176L)
  public static SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_ins_type(final SubLObject interval, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != unification.$unify_return_justificationP$.getDynamicValue( thread ) ) ? ConsesLow.list( arguments.make_hl_support( $kw37$TIME, el_utilities.make_binary_formula( $const39$temporallySubsumes_InsType,
        interval, type ), UNPROVIDED, UNPROVIDED ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unification-utilities.lisp", position = 25414L)
  public static SubLObject genl_mt_unify_possibly_justify_temporally_subsumes_type_type(final SubLObject long_type, final SubLObject short_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != unification.$unify_return_justificationP$.getDynamicValue( thread ) ) ? ConsesLow.list( arguments.make_hl_support( $kw37$TIME, el_utilities.make_binary_formula( $const40$temporallySubsumes_TypeType,
        long_type, short_type ), UNPROVIDED, UNPROVIDED ) ) : NIL;
  }

  public static SubLObject declare_unification_utilities_file()
  {
    SubLFiles.declareFunction( me, "term_unify", "TERM-UNIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "asent_unify", "ASENT-UNIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "gaf_asent_unify", "GAF-ASENT-UNIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "gaf_asent_args_unify", "GAF-ASENT-ARGS-UNIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "gaf_asent_inverse_args_unify", "GAF-ASENT-INVERSE-ARGS-UNIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "transformation_asent_unify", "TRANSFORMATION-ASENT-UNIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "rewrite_asent_unify", "REWRITE-ASENT-UNIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "unify_clauses", "UNIFY-CLAUSES", 2, 2, false );
    SubLFiles.declareFunction( me, "clean_up_unify_result", "CLEAN-UP-UNIFY-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "unify_clause", "UNIFY-CLAUSE", 2, 2, false );
    new $unify_clause$BinaryFunction();
    SubLFiles.declareFunction( me, "unify_clause_literal", "UNIFY-CLAUSE-LITERAL", 4, 0, false );
    SubLFiles.declareFunction( me, "compute_variable_map", "COMPUTE-VARIABLE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_base_inversion_binding", "VARIABLE-BASE-INVERSION-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "unify_set", "UNIFY-SET", 2, 2, false );
    SubLFiles.declareFunction( me, "unify_sets", "UNIFY-SETS", 2, 2, false );
    SubLFiles.declareFunction( me, "unify_sets_of_sets", "UNIFY-SETS-OF-SETS", 2, 2, false );
    SubLFiles.declareFunction( me, "unify_set_recursive", "UNIFY-SET-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "unify_element", "UNIFY-ELEMENT", 4, 0, false );
    SubLFiles.declareFunction( me, "parent_to_unify_bindings", "PARENT-TO-UNIFY-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "unify_to_child_bindings", "UNIFY-TO-CHILD-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "unify_source_bindings", "UNIFY-SOURCE-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "parent_to_child_bindings", "PARENT-TO-CHILD-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_query_dnf_from_formula", "CLEAR-QUERY-DNF-FROM-FORMULA", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_dnf_from_formula", "REMOVE-QUERY-DNF-FROM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "query_dnf_from_formula_internal", "QUERY-DNF-FROM-FORMULA-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_dnf_from_formula", "QUERY-DNF-FROM-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_duplicate_formulas", "REMOVE-DUPLICATE-FORMULAS", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_duplicate_or_invalid_formulas", "REMOVE-DUPLICATE-OR-INVALID-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "unify_el", "UNIFY-EL", 2, 1, false );
    SubLFiles.declareFunction( me, "unify_el_cnfs", "UNIFY-EL-CNFS", 2, 1, false );
    SubLFiles.declareFunction( me, "unify_el_terms", "UNIFY-EL-TERMS", 2, 1, false );
    SubLFiles.declareFunction( me, "unify_open_el_terms", "UNIFY-OPEN-EL-TERMS", 2, 1, false );
    SubLFiles.declareFunction( me, "unify_el_terms_int", "UNIFY-EL-TERMS-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "unify_one_way", "UNIFY-ONE-WAY", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify", "GENL-MT-UNIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_int", "GENL-MT-UNIFY-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_monad_genl_mt_cachedP", "CLEAR-MONAD-GENL-MT-CACHED?", 0, 0, false );
    new $clear_monad_genl_mt_cachedP$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_monad_genl_mt_cachedP", "REMOVE-MONAD-GENL-MT-CACHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "monad_genl_mt_cachedP_internal", "MONAD-GENL-MT-CACHED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "monad_genl_mt_cachedP", "MONAD-GENL-MT-CACHED?", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_temporal_dimension_fully_bound", "GENL-MT-UNIFY-TEMPORAL-DIMENSION-FULLY-BOUND", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_temporal_dimension_dotted_list", "GENL-MT-UNIFY-TEMPORAL-DIMENSION-DOTTED-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_temporal_dimension_undotted_list", "GENL-MT-UNIFY-TEMPORAL-DIMENSION-UNDOTTED-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_possibly_justify_genl_mt", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-GENL-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_possibly_justify_temporally_subsumes", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_possibly_justify_temporally_subsumes_ins_type", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES-INS-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "genl_mt_unify_possibly_justify_temporally_subsumes_type_type", "GENL-MT-UNIFY-POSSIBLY-JUSTIFY-TEMPORALLY-SUBSUMES-TYPE-TYPE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_unification_utilities_file()
  {
    $query_dnf_from_formula_caching_state$ = SubLFiles.deflexical( "*QUERY-DNF-FROM-FORMULA-CACHING-STATE*", NIL );
    $monad_genl_mt_cachedP_caching_state$ = SubLFiles.deflexical( "*MONAD-GENL-MT-CACHED?-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_unification_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym16$QUERY_DNF_FROM_FORMULA );
    memoization_state.note_globally_cached_function( $sym26$MONAD_GENL_MT_CACHED_ );
    generic_testing.define_test_case_table_int( $sym41$TERM_UNIFY, ConsesLow.list( new SubLObject[] { $kw42$TEST, NIL, $kw43$OWNER, NIL, $kw44$CLASSES, NIL, $kw45$KB, $kw46$BOTH, $kw47$WORKING_, T
    } ), $list48 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_unification_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_unification_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_unification_utilities_file();
  }
  static
  {
    me = new unification_utilities();
    $query_dnf_from_formula_caching_state$ = null;
    $monad_genl_mt_cachedP_caching_state$ = null;
    $sym0$LISTP = makeSymbol( "LISTP" );
    $sym1$UNIFY_CLAUSE = makeSymbol( "UNIFY-CLAUSE" );
    $sym2$CLAUSE_P = makeSymbol( "CLAUSE-P" );
    $sym3$UNIFY_CLAUSE_LITERAL = makeSymbol( "UNIFY-CLAUSE-LITERAL" );
    $sym4$CLAUSES_P = makeSymbol( "CLAUSES-P" );
    $sym5$NON_BASE_VARIABLE_P = makeSymbol( "NON-BASE-VARIABLE-P" );
    $sym6$VARIABLE_BASE_INVERSION_BINDING = makeSymbol( "VARIABLE-BASE-INVERSION-BINDING" );
    $list7 = ConsesLow.cons( makeSymbol( "VAR1" ), makeSymbol( "VAR2" ) );
    $sym8$UNIFY_ELEMENT = makeSymbol( "UNIFY-ELEMENT" );
    $sym9$UNIFY_SET = makeSymbol( "UNIFY-SET" );
    $sym10$UNIFY_SETS = makeSymbol( "UNIFY-SETS" );
    $sym11$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym12$BASE_VARIABLE_P = makeSymbol( "BASE-VARIABLE-P" );
    $sym13$TERM__ = makeSymbol( "TERM-<" );
    $sym14$CAR = makeSymbol( "CAR" );
    $list15 = ConsesLow.cons( makeSymbol( "PARENT-VAR" ), makeSymbol( "UNIFY-BINDING" ) );
    $sym16$QUERY_DNF_FROM_FORMULA = makeSymbol( "QUERY-DNF-FROM-FORMULA" );
    $sym17$_QUERY_DNF_FROM_FORMULA_CACHING_STATE_ = makeSymbol( "*QUERY-DNF-FROM-FORMULA-CACHING-STATE*" );
    $int18$512 = makeInteger( 512 );
    $sym19$_EXIT = makeSymbol( "%EXIT" );
    $const20$retainTerm = constant_handles.reader_make_constant_shell( makeString( "retainTerm" ) );
    $list21 = ConsesLow.list( makeSymbol( "HL-CNF-1" ), makeSymbol( "EL-BINDINGS-1" ) );
    $list22 = ConsesLow.list( makeSymbol( "HL-CNF-2" ), makeSymbol( "EL-BINDINGS-2" ) );
    $sym23$OBJECT_TO_STRING = makeSymbol( "OBJECT-TO-STRING" );
    $const24$Always_TimeInterval = constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) );
    $const25$TimePoint = constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) );
    $sym26$MONAD_GENL_MT_CACHED_ = makeSymbol( "MONAD-GENL-MT-CACHED?" );
    $sym27$_MONAD_GENL_MT_CACHED__CACHING_STATE_ = makeSymbol( "*MONAD-GENL-MT-CACHED?-CACHING-STATE*" );
    $int28$256 = makeInteger( 256 );
    $sym29$CLEAR_MONAD_GENL_MT_CACHED_ = makeSymbol( "CLEAR-MONAD-GENL-MT-CACHED?" );
    $const30$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) );
    $list31 = ConsesLow.list( makeSymbol( "UNBOUND-INDEX" ), makeSymbol( "UNBOUND-PARAM" ) );
    $const32$MtTimeDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) );
    $const33$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
    $list34 = ConsesLow.list( makeSymbol( "UNBOUND-INDEX" ) );
    $kw35$GENLMT = makeKeyword( "GENLMT" );
    $const36$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $kw37$TIME = makeKeyword( "TIME" );
    $const38$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $const39$temporallySubsumes_InsType = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) );
    $const40$temporallySubsumes_TypeType = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) );
    $sym41$TERM_UNIFY = makeSymbol( "TERM-UNIFY" );
    $kw42$TEST = makeKeyword( "TEST" );
    $kw43$OWNER = makeKeyword( "OWNER" );
    $kw44$CLASSES = makeKeyword( "CLASSES" );
    $kw45$KB = makeKeyword( "KB" );
    $kw46$BOTH = makeKeyword( "BOTH" );
    $kw47$WORKING_ = makeKeyword( "WORKING?" );
    $list48 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), ONE_INTEGER ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "Unity" ) ), makeDouble( 0.9999999999999999 ) ) ), ConsesLow.list( ConsesLow.cons( T, T ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Unity" ) ), makeDouble( 30.0 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), makeInteger( 30 ) ) ), ConsesLow.list(
                ConsesLow.cons( T, T ) ) ) );
  }

  public static final class $unify_clause$BinaryFunction
      extends
        BinaryFunction
  {
    public $unify_clause$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "UNIFY-CLAUSE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return unify_clause( arg1, arg2, UNPROVIDED, UNPROVIDED );
    }
  }

  public static final class $clear_monad_genl_mt_cachedP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_monad_genl_mt_cachedP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-MONAD-GENL-MT-CACHED?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_monad_genl_mt_cachedP();
    }
  }
}
/*
 * 
 * Total time: 336 ms
 * 
 */