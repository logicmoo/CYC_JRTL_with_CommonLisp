package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class uncanonicalizer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.uncanonicalizer";
  public static final String myFingerPrint = "49d2c5224cb90fadb75543cff6afb8d885c6cc6d2f819121a937ebae3654b657";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 549L)
  private static SubLSymbol $ununiquified_el_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1138L)
  public static SubLSymbol $cache_el_formulaP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4883L)
  private static SubLSymbol $potentially_interestingly_uncanonicalizable_tense_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5236L)
  private static SubLSymbol $cached_assertion_el_formula_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5374L)
  private static SubLSymbol $retain_leading_universals$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5504L)
  private static SubLSymbol $vars_to_universalize$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5615L)
  private static SubLSymbol $universal_vars_to_skolem$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42227L)
  public static SubLSymbol $uncanonicalizer_dnf_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55785L)
  private static SubLSymbol $default_skolem_vars$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CDOLIST;
  private static final SubLSymbol $sym4$VAR;
  private static final SubLSymbol $sym5$CLAUSE_VARIABLES;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$ASSERTION_EL_FORMULA_MEMOIZED;
  private static final SubLSymbol $sym8$ASSERTION_P;
  private static final SubLSymbol $sym9$SKOLEM_FUNCTION_P;
  private static final SubLSymbol $sym10$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym11$ASSERTION_EL_FORMULA;
  private static final SubLList $list12;
  private static final SubLString $str13$Return_the_EL_formula_for_ASSERTI;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$ASSERTION_EL_IST_FORMULA;
  private static final SubLString $str17$Return_the_el_formula_in___ist_fo;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$FAST_FI_NOT_EL_TERM_;
  private static final SubLSymbol $sym20$FAST_REIFIED_SKOLEM_;
  private static final SubLSymbol $sym21$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_;
  private static final SubLSymbol $sym22$QUOTED_TERM_WITH_HL_VAR_;
  private static final SubLObject $const23$termOfUnit;
  private static final SubLObject $const24$evaluate;
  private static final SubLObject $const25$equals;
  private static final SubLObject $const26$SkolemFunctionFn;
  private static final SubLObject $const27$trueSentence;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$CACHED_ASSERTION_EL_FORMULA_INT;
  private static final SubLSymbol $sym30$_CACHED_ASSERTION_EL_FORMULA_INT_CACHING_STATE_;
  private static final SubLInteger $int31$2048;
  private static final SubLInteger $int32$1024;
  private static final SubLSymbol $kw33$FALSE;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$EL_FORMULA;
  private static final SubLObject $const36$UncanonicalizerAssertionFn;
  private static final SubLObject $const37$SubLQuoteFn;
  private static final SubLSymbol $sym38$INDEX_LITS_TO_REMOVE;
  private static final SubLSymbol $sym39$DNF_LITERALS;
  private static final SubLSymbol $sym40$CLAUSE_FROM_EL_LITERALS;
  private static final SubLSymbol $sym41$CNF_LITERALS;
  private static final SubLObject $const42$meetsPragmaticRequirement;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$NEGATE;
  private static final SubLObject $const46$and;
  private static final SubLObject $const47$ist;
  private static final SubLObject $const48$pragmaticRequirement;
  private static final SubLObject $const49$abnormal;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CYC_VAR_;
  private static final SubLObject $const52$exceptFor;
  private static final SubLObject $const53$exceptWhen;
  private static final SubLSymbol $sym54$NEG_LITS;
  private static final SubLObject $const55$implies;
  private static final SubLSymbol $sym56$NEGATE_ATOMIC;
  private static final SubLSymbol $sym57$REMOVE_TRUESENTENCE_REFS;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLString $str61$unanticipated_formula___s;
  private static final SubLSymbol $sym62$TRUE_SENTENCE_VARS;
  private static final SubLSymbol $sym63$UNDO_VARIABLES;
  private static final SubLString $str64$_S_is_not_well_formed_;
  private static final SubLObject $const65$forAll;
  private static final SubLSymbol $sym66$UNREMOVE_UNIVERSALS_INT;
  private static final SubLObject $const67$BaseKB;
  private static final SubLSymbol $sym68$UNREIFIED_SKOLEM_TERM_;
  private static final SubLSymbol $sym69$UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS;
  private static final SubLObject $const70$thereExists;
  private static final SubLObject $const71$IntervalMinFn;
  private static final SubLObject $const72$thereExistAtLeast;
  private static final SubLObject $const73$IntervalMaxFn;
  private static final SubLObject $const74$thereExistAtMost;
  private static final SubLObject $const75$Integer;
  private static final SubLObject $const76$thereExistExactly;
  private static final SubLObject $const77$Unity;
  private static final SubLList $list78;
  private static final SubLObject $const79$PlusInfinity;
  private static final SubLObject $const80$or;
  private static final SubLSymbol $sym81$UNDO_IMPLICATIONS;
  private static final SubLSymbol $sym82$UNCANON_DNF_1;
  private static final SubLString $str83$_s_is_not_well_formed_;
  private static final SubLSymbol $sym84$IST_SENTENCE_P;
  private static final SubLSymbol $sym85$SIMPLIFIABLE_IST_EXPRESSION_;
  private static final SubLSymbol $sym86$SIMPLIFY_IST_EXPRESSION;
  private static final SubLSymbol $kw87$IGNORE;
  private static final SubLString $str88$unable_to_simplify___ist_expressi;
  private static final SubLSymbol $sym89$REMOVE_LEADING_UNIVERSALS;
  private static final SubLSymbol $sym90$SKOLEM_FUNCTION_VAR;
  private static final SubLSymbol $sym91$EL_VAR_;
  private static final SubLSymbol $sym92$SKOLEM_NUMBER;
  private static final SubLSymbol $sym93$_;
  private static final SubLSymbol $sym94$NUM_ARGS_OF_SKOLEM_FN;
  private static final SubLSymbol $sym95$TERM_OF_UNIT;
  private static final SubLSymbol $sym96$SKOLEM_CONSTANT_;
  private static final SubLSymbol $sym97$NART_P;
  private static final SubLSymbol $sym98$REIFIED_SKOLEM_CONSTANT_TERM_;
  private static final SubLSymbol $sym99$FIND_NART;
  private static final SubLSymbol $sym100$KB_ASSERTION_;
  private static final SubLSymbol $sym101$WRAPPED_ASSERTION_EL_FORMULA_WRT_MT;
  private static final SubLSymbol $sym102$OPAQUE_ARG_WRT_SKOLEM_;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$VARIABLE_BINDING_VARIABLE;
  private static final SubLSymbol $sym105$DIGIT_CHAR_P;
  private static final SubLSymbol $sym106$NOT_DIGIT_CHAR_P;
  private static final SubLSymbol $kw107$UNUNUNIQUIFIABLE;
  private static final SubLSymbol $sym108$NAT_FUNCTOR;
  private static final SubLSymbol $sym109$REMOVABLE_TOU_LIT_;
  private static final SubLSymbol $sym110$LITERAL_ARG1;
  private static final SubLSymbol $sym111$EL_VARIABLE_P;
  private static final SubLSymbol $sym112$VARIABLE_P;
  private static final SubLSymbol $sym113$DEFAULT_EL_VAR_FOR_HL_VAR;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 826L)
  public static SubLObject remembering_ununiquified_el_vars(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cnf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    cnf = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, $list2, ConsesLow.listS( $sym3$CDOLIST, ConsesLow.list( $sym4$VAR, ConsesLow.list( $sym5$CLAUSE_VARIABLES, cnf ) ), $list6 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1361L)
  public static SubLObject assertion_el_formula_memoized_internal(final SubLObject assertion)
  {
    return assertion_el_formula( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1361L)
  public static SubLObject assertion_el_formula_memoized(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return assertion_el_formula_memoized_internal( assertion );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym7$ASSERTION_EL_FORMULA_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym7$ASSERTION_EL_FORMULA_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym7$ASSERTION_EL_FORMULA_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( assertion_el_formula_memoized_internal( assertion ) ) );
      memoization_state.caching_state_put( caching_state, assertion, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1498L)
  public static SubLObject assertion_el_formula(SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym8$ASSERTION_P );
    final SubLObject formula = assertions_high.assertion_formula( assertion );
    SubLObject mt = NIL;
    SubLObject result = NIL;
    SubLObject error_message = NIL;
    if( NIL != skolems.skolem_defining_assertionP( assertion ) )
    {
      final SubLObject skolem = cycl_utilities.expression_find_if( $sym9$SKOLEM_FUNCTION_P, ConsesLow.cons( formula, mt ), T, UNPROVIDED );
      final SubLObject skolem_defn_assertions = skolems.skolem_defn_assertions( skolems.skolem_canonical_sibling( skolem ), UNPROVIDED );
      if( NIL != skolem_defn_assertions )
      {
        assertion = skolem_defn_assertions.first();
      }
    }
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym10$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != interesting_uncanonicalizationsP( assertion ) )
          {
            if( NIL == $cache_el_formulaP$.getDynamicValue( thread ) )
            {
              thread.resetMultipleValues();
              final SubLObject result_$1 = assertion_el_formula_int( assertion );
              final SubLObject mt_$2 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = result_$1;
              mt = mt_$2;
            }
            else
            {
              thread.resetMultipleValues();
              final SubLObject result_$2 = cached_assertion_el_formula_int( assertion );
              final SubLObject mt_$3 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = result_$2;
              mt = mt_$3;
            }
          }
          else
          {
            result = fi.perform_fi_substitutions( conses_high.copy_tree( formula ), assertions_high.assertion_el_variables( assertion ) );
            mt = assertions_high.assertion_mt( assertion );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      result = fi.perform_fi_substitutions( conses_high.copy_tree( formula ), assertions_high.assertion_el_variables( assertion ) );
    }
    mt = cycl_utilities.hl_to_el( mt );
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3091L)
  public static SubLObject assertion_elmt(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    thread.resetMultipleValues();
    final SubLObject el_formula = assertion_el_formula( assertion );
    final SubLObject elmt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return elmt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3556L)
  public static SubLObject assertion_el_ist_formula(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( assertion, $sym8$ASSERTION_P );
    thread.resetMultipleValues();
    final SubLObject el_formula = assertion_el_formula( assertion );
    final SubLObject elmt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return el_utilities.make_ist_sentence( elmt, el_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3861L)
  public static SubLObject interesting_uncanonicalizationsP(final SubLObject assertion)
  {
    final SubLObject sentence = assertions_high.assertion_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    return makeBoolean( NIL != cycl_utilities.expression_find_if( $sym19$FAST_FI_NOT_EL_TERM_, sentence, UNPROVIDED, UNPROVIDED ) || NIL != cycl_utilities.expression_find_if( $sym20$FAST_REIFIED_SKOLEM_, mt, UNPROVIDED,
        UNPROVIDED ) || NIL != cycl_utilities.expression_find_if( $sym21$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_, mt, UNPROVIDED, UNPROVIDED ) || NIL != cycl_utilities.expression_find_if(
            $sym22$QUOTED_TERM_WITH_HL_VAR_, sentence, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4286L)
  public static SubLObject fast_fi_not_el_termP(final SubLObject v_object)
  {
    if( NIL != forts.fort_p( v_object ) )
    {
      return makeBoolean( v_object.eql( $const23$termOfUnit ) || v_object.eql( $const24$evaluate ) || v_object.eql( $const25$equals ) || v_object.eql( $const26$SkolemFunctionFn ) || v_object.eql( $const27$trueSentence )
          || NIL != term.fast_reified_skolemP( v_object ) );
    }
    if( NIL != term.kb_assertionP( v_object ) )
    {
      return T;
    }
    if( NIL != cycl_variables.el_varP( v_object ) )
    {
      return makeBoolean( !v_object.eql( ununiquify_el_var( v_object ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5041L)
  public static SubLObject potentially_interestingly_uncanonicalizable_tense_termP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != subl_promotions.memberP( v_object, $potentially_interestingly_uncanonicalizable_tense_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5236L)
  public static SubLObject clear_cached_assertion_el_formula_int()
  {
    final SubLObject cs = $cached_assertion_el_formula_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5236L)
  public static SubLObject remove_cached_assertion_el_formula_int(final SubLObject assertion)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_assertion_el_formula_int_caching_state$.getGlobalValue(), ConsesLow.list( assertion ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5236L)
  public static SubLObject cached_assertion_el_formula_int_internal(final SubLObject assertion)
  {
    return assertion_el_formula_int( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5236L)
  public static SubLObject cached_assertion_el_formula_int(final SubLObject assertion)
  {
    SubLObject caching_state = $cached_assertion_el_formula_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$CACHED_ASSERTION_EL_FORMULA_INT, $sym30$_CACHED_ASSERTION_EL_FORMULA_INT_CACHING_STATE_, $int31$2048, EQL, ONE_INTEGER, $int32$1024 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_assertion_el_formula_int_internal( assertion ) ) );
      memoization_state.caching_state_put( caching_state, assertion, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5756L)
  public static SubLObject assertion_el_formula_int(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff_vars.$within_wffP$.getDynamicValue( thread ) )
    {
      wff.reset_wff_state();
    }
    SubLObject mt = assertions_high.assertion_mt( assertion );
    SubLObject el_formula = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      final SubLObject symbols = assertions_high.assertion_el_variables( assertion );
      final SubLObject el_cnf = nsubst_hl_vars( el_utilities.copy_clause( assertions_high.assertion_cnf( assertion ) ), symbols );
      final SubLObject truth = assertions_high.assertion_truth( assertion );
      final SubLObject _prev_bind_0_$5 = $ununiquified_el_vars$.currentBinding( thread );
      try
      {
        $ununiquified_el_vars$.bind( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
        SubLObject cdolist_list_var = clause_utilities.clause_variables( el_cnf, UNPROVIDED );
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          remember_ununiquified_el_var( var, var );
          cdolist_list_var = cdolist_list_var.rest();
          var = cdolist_list_var.first();
        }
        final SubLObject cnf = el_explicitify_implicit_meta_literals( el_cnf );
        final SubLObject index_lits = index_lits_to_remove( cnf );
        final SubLObject pos_lits = ( truth == $kw33$FALSE ) ? NIL : conses_high.set_difference( clauses.pos_lits( cnf ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        final SubLObject neg_lits = ( truth == $kw33$FALSE ) ? conses_high.set_difference( clauses.pos_lits( cnf ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED )
            : conses_high.set_difference( clauses.neg_lits( cnf ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        SubLObject el_implication = NIL;
        thread.resetMultipleValues();
        SubLObject el_cnfs = el_cnfs( ConsesLow.list( clauses.make_cnf( neg_lits, pos_lits ) ), index_lits, mt );
        SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        el_cnfs = czer_main.canonicalize_clauses_commutative_terms_destructive( czer_main.sort_clauses( el_cnfs ) );
        el_cnfs = unwrap_el_formulas_of_assertions_destructive( el_cnfs );
        thread.resetMultipleValues();
        final SubLObject el_implication_$6 = el_cnfs_to_el_implication( el_cnfs, el_mt );
        final SubLObject el_mt_$7 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        el_implication = el_implication_$6;
        el_mt = el_mt_$7;
        el_formula = undo_variables( el_implication );
        mt = el_mt;
      }
      finally
      {
        $ununiquified_el_vars$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      czer_vars.$simplify_literalP$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( el_formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7123L)
  public static SubLObject unwrap_el_formulas_of_assertions_destructive(SubLObject el_cnfs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list34;
    // TODO see what shis should be
    SubLObject el_formula = NIL;
    for( SubLObject last_el_cnfs = NIL, //
    pattern_result = NIL; !el_cnfs.equal( last_el_cnfs ); //
        el_cnfs = cycl_utilities.expression_subst( el_formula, pattern_result, //
            el_cnfs, Symbols.symbol_function( EQUAL ), //
            UNPROVIDED ) )
    {//
      last_el_cnfs = el_cnfs;
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( el_cnfs, pattern );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        el_formula = list_utilities.alist_lookup_without_values( v_bindings, $sym35$EL_FORMULA, UNPROVIDED, UNPROVIDED );
        pattern_result = ConsesLow.list( $const36$UncanonicalizerAssertionFn, ConsesLow.list( $const37$SubLQuoteFn, el_formula ) );
      }
    }
    return el_cnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7717L)
  public static SubLObject new_assertion_el_formula_int(final SubLObject assertion)
  {
    wff.reset_wff_state();
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject symbols = assertions_high.assertion_el_variables( assertion );
    final SubLObject el_formula = cnf_el_formula( cnf, mt, symbols );
    return Values.values( el_formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8059L)
  public static SubLObject cnf_el_formula(final SubLObject cnf, SubLObject mt, SubLObject symbols)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( symbols == UNPROVIDED )
    {
      symbols = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el_formula = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $vars_to_universalize$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$simplify_literalP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      $vars_to_universalize$.bind( $retain_leading_universals$.getDynamicValue( thread ), thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      final SubLObject cnf_0 = conses_high.copy_tree( cnf );
      final SubLObject cnf_2 = nsubst_hl_vars( cnf_0, symbols );
      final SubLObject cnf_3 = el_explicitify_implicit_meta_literals( cnf_2 );
      final SubLObject index_lits = index_lits_to_remove( cnf_3 );
      final SubLObject pos_lits = conses_high.set_difference( clauses.pos_lits( cnf_3 ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject neg_lits = conses_high.set_difference( clauses.neg_lits( cnf_3 ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject cnfs = ConsesLow.list( clauses.make_cnf( neg_lits, pos_lits ) );
      final SubLObject el_cnfs = unwrap_el_formulas_of_assertions_destructive( czer_main.canonicalize_clauses_commutative_terms_destructive( czer_main.sort_clauses( el_cnfs( cnfs, index_lits, UNPROVIDED ) ) ) );
      final SubLObject el_implication = el_cnfs_to_el_implication( el_cnfs, mt );
      el_formula = undo_variables( el_implication );
    }
    finally
    {
      czer_vars.$simplify_literalP$.rebind( _prev_bind_4, thread );
      $vars_to_universalize$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return el_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8961L)
  public static SubLObject cnfs_el_formula(final SubLObject hl_cnfs, SubLObject mt, SubLObject symbols)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( symbols == UNPROVIDED )
    {
      symbols = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el_formula = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $vars_to_universalize$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$simplify_literalP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      $vars_to_universalize$.bind( $retain_leading_universals$.getDynamicValue( thread ), thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      final SubLObject cnfs_0 = conses_high.copy_tree( hl_cnfs );
      final SubLObject cnfs_2 = nsubst_hl_vars( cnfs_0, symbols );
      final SubLObject cnfs_3 = el_explicitify_implicit_meta_literals( cnfs_2 );
      final SubLObject index_lits = list_utilities.fast_delete_duplicates( list_utilities.mapappend( $sym38$INDEX_LITS_TO_REMOVE, cnfs_3 ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      final SubLObject cnfs = remove_index_lits_from_cnfs( index_lits, cnfs_3 );
      final SubLObject el_cnfs = unwrap_el_formulas_of_assertions_destructive( czer_main.canonicalize_clauses_commutative_terms_destructive( czer_main.sort_clauses( el_cnfs( cnfs, index_lits, UNPROVIDED ) ) ) );
      final SubLObject el_implication = el_cnfs_to_el_implication( el_cnfs, mt );
      el_formula = undo_variables( el_implication );
    }
    finally
    {
      czer_vars.$simplify_literalP$.rebind( _prev_bind_4, thread );
      $vars_to_universalize$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return el_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9789L)
  public static SubLObject hl_dnfs_to_hl_cnfs(final SubLObject hl_dnfs)
  {
    final SubLObject hl_dnfs_with_explicit_literals = Mapping.mapcar( $sym39$DNF_LITERALS, hl_dnfs );
    final SubLObject hl_cnfs_with_explicit_literals = list_utilities.cartesian_product( hl_dnfs_with_explicit_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject hl_cnfs = Mapping.mapcar( $sym40$CLAUSE_FROM_EL_LITERALS, hl_cnfs_with_explicit_literals );
    return hl_cnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10892L)
  public static SubLObject hl_cnfs_to_hl_dnfs(final SubLObject hl_cnfs)
  {
    final SubLObject hl_cnfs_with_explicit_literals = Mapping.mapcar( $sym41$CNF_LITERALS, hl_cnfs );
    final SubLObject hl_dnfs_with_explicit_literals = list_utilities.cartesian_product( hl_cnfs_with_explicit_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject hl_dnfs = Mapping.mapcar( $sym40$CLAUSE_FROM_EL_LITERALS, hl_dnfs_with_explicit_literals );
    return hl_dnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11986L)
  public static SubLObject dnfs_el_formula(final SubLObject hl_dnfs, SubLObject mt, SubLObject symbols)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( symbols == UNPROVIDED )
    {
      symbols = NIL;
    }
    final SubLObject hl_cnfs = hl_dnfs_to_hl_cnfs( hl_dnfs );
    return cnfs_el_formula( hl_cnfs, mt, symbols );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12148L)
  public static SubLObject el_cnfs_to_el_implication(final SubLObject el_cnfs, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject result_mt = NIL;
    final SubLObject el_disjunction = unpackage_cnf_clauses( el_cnfs );
    final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding( thread );
    try
    {
      czer_vars.$encapsulate_intensional_formulaP$.bind( NIL, thread );
      final SubLObject v_skolems = formula_unreified_skolems( el_disjunction );
      final SubLObject _prev_bind_0_$8 = $universal_vars_to_skolem$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $vars_to_universalize$.currentBinding( thread );
      final SubLObject _prev_bind_3 = $retain_leading_universals$.currentBinding( thread );
      try
      {
        $universal_vars_to_skolem$.bind( universal_vars_to_skolem_table( el_disjunction, v_skolems ), thread );
        $vars_to_universalize$.bind( sentence_free_vars_not_bound_to_skolems( el_disjunction, v_skolems ), thread );
        $retain_leading_universals$.bind( ConsesLow.append( $retain_leading_universals$.getDynamicValue( thread ), true_sentence_vars( el_disjunction ) ), thread );
        final SubLObject el_universal = unremove_universals( el_disjunction );
        thread.resetMultipleValues();
        final SubLObject el_existential = unremove_existentials_and_refd_universals( el_universal, mt );
        final SubLObject intermediate_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject el_implication = implications_in( el_existential );
        final SubLObject el_ist_implication = result = ists_out( el_implication );
        result_mt = intermediate_mt;
        thread.resetMultipleValues();
        final SubLObject result_$9 = hlmt_czer.tense_recursive_contractor( result, result_mt );
        final SubLObject result_mt_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$9;
        result_mt = result_mt_$10;
      }
      finally
      {
        $retain_leading_universals$.rebind( _prev_bind_3, thread );
        $vars_to_universalize$.rebind( _prev_bind_2, thread );
        $universal_vars_to_skolem$.rebind( _prev_bind_0_$8, thread );
      }
    }
    finally
    {
      czer_vars.$encapsulate_intensional_formulaP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, result_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13281L)
  public static SubLObject remove_index_lits_from_cnfs(final SubLObject index_lits, final SubLObject cnfs)
  {
    if( NIL != index_lits )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = cnfs;
      SubLObject cnf = NIL;
      cnf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject neg_lits = conses_high.set_difference( clauses.neg_lits( cnf ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        final SubLObject pos_lits = conses_high.set_difference( clauses.pos_lits( cnf ), index_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        result = ConsesLow.cons( clauses.make_cnf( neg_lits, pos_lits ), result );
        cdolist_list_var = cdolist_list_var.rest();
        cnf = cdolist_list_var.first();
      }
      return Sequences.nreverse( result );
    }
    return cnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13651L)
  public static SubLObject cnf_intermediate_el_formula(final SubLObject cnfs)
  {
    return ists_out( unpackage_cnf_clauses( cnfs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13904L)
  public static SubLObject dnf_intermediate_el_formula(final SubLObject dnfs)
  {
    return ists_out( unpackage_dnf_clauses( dnfs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14227L)
  public static SubLObject el_version(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject canon_cnfs = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
    try
    {
      czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
      canon_cnfs = czer_meta.canon_cnfs( formula, NIL, mt );
    }
    finally
    {
      czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_0, thread );
    }
    if( !canon_cnfs.isCons() )
    {
      return formula;
    }
    SubLObject invalidP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $retain_leading_universals$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      $retain_leading_universals$.bind( clausifier.leading_universal_variables( formula, mt ), thread );
      final SubLObject free = el_utilities.relation_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      result = cnfs_el_formula( canon_cnfs, UNPROVIDED, UNPROVIDED );
      invalidP = makeBoolean( NIL != conses_high.set_difference( el_utilities.relation_free_variables( result, UNPROVIDED, UNPROVIDED, UNPROVIDED ), free, UNPROVIDED, UNPROVIDED ) || NIL == wff.el_wffP( result, mt,
          UNPROVIDED ) );
    }
    finally
    {
      $retain_leading_universals$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
    }
    if( NIL != invalidP )
    {
      return formula;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15490L)
  public static SubLObject el_explicitify_implicit_meta_literals(SubLObject cnf)
  {
    cnf = el_exceptions( cnf );
    cnf = el_pragmatic_requirements( cnf );
    return cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15644L)
  public static SubLObject el_pragmatic_requirements(final SubLObject cnf)
  {
    if( NIL != list_utilities.tree_find( $const42$meetsPragmaticRequirement, cnf, UNPROVIDED, UNPROVIDED ) )
    {
      return el_pragmatic_requirement( cnf );
    }
    return cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15807L)
  public static SubLObject el_pragmatic_requirement(final SubLObject cnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( cnf, cnf, $list43 );
    neg_lits = cnf.first();
    SubLObject current = cnf.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, cnf, $list43 );
    pos_lits = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject prag_lits = el_utilities.meets_pragmatic_requirement_asents( pos_lits );
      final SubLObject prag_lit = ( NIL != list_utilities.singletonP( prag_lits ) ) ? prag_lits.first() : NIL;
      final SubLObject other_pos_lits = ( NIL != prag_lit ) ? Sequences.remove( prag_lit, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
      if( NIL == prag_lit )
      {
        return cnf;
      }
      SubLObject current_$12;
      final SubLObject datum_$11 = current_$12 = prag_lit;
      SubLObject prag_pred = NIL;
      SubLObject var_list = NIL;
      SubLObject assertion = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list44 );
      prag_pred = current_$12.first();
      current_$12 = current_$12.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list44 );
      var_list = current_$12.first();
      current_$12 = current_$12.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list44 );
      assertion = current_$12.first();
      current_$12 = current_$12.rest();
      if( NIL == current_$12 )
      {
        if( NIL != term.kb_assertionP( assertion ) )
        {
          final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
          SubLObject assertion_formula = ConsesLow.list( $const36$UncanonicalizerAssertionFn, ConsesLow.list( $const37$SubLQuoteFn, assertion_el_formula( assertion ) ) );
          final SubLObject lhs = Mapping.mapcar( $sym45$NEGATE, other_pos_lits );
          final SubLObject rhs = neg_lits;
          SubLObject pragmatic_antecedent = ConsesLow.append( lhs, rhs );
          if( NIL != pragmatic_antecedent )
          {
            if( NIL != list_utilities.singletonP( pragmatic_antecedent ) )
            {
              pragmatic_antecedent = pragmatic_antecedent.first();
            }
            else
            {
              pragmatic_antecedent = ConsesLow.cons( $const46$and, pragmatic_antecedent );
            }
          }
          if( !mt_relevance_macros.$mt$.getDynamicValue( thread ).eql( assertion_mt ) )
          {
            assertion_formula = ConsesLow.list( $const47$ist, assertion_mt, assertion_formula );
          }
          return clause_utilities.make_gaf_cnf( ConsesLow.list( $const48$pragmaticRequirement, pragmatic_antecedent, assertion_formula ) );
        }
        return cnf;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$11, $list44 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( cnf, $list43 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17120L)
  public static SubLObject el_exceptions(final SubLObject cnf)
  {
    if( NIL == list_utilities.tree_find( $const49$abnormal, cnf, UNPROVIDED, UNPROVIDED ) )
    {
      return cnf;
    }
    if( NIL != clauses.gaf_cnfP( cnf ) )
    {
      return el_except_for( cnf );
    }
    return el_except_when( cnf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17301L)
  public static SubLObject el_except_for(final SubLObject cnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lit = clauses.pos_lits( cnf ).first();
    if( NIL == el_utilities.ab_litP( pos_lit ) )
    {
      return cnf;
    }
    SubLObject current;
    final SubLObject datum = current = pos_lit;
    SubLObject ab_pred = NIL;
    SubLObject exception_list = NIL;
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    ab_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    exception_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    assertion = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
      return NIL;
    }
    final SubLObject exception_args = cycl_utilities.formula_args( exception_list, UNPROVIDED );
    if( NIL != list_utilities.singletonP( exception_args ) && NIL != el_utilities.groundP( exception_args, Symbols.symbol_function( $sym51$CYC_VAR_ ) ) && NIL != term.kb_assertionP( assertion ) )
    {
      final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
      SubLObject assertion_formula = ConsesLow.list( $const36$UncanonicalizerAssertionFn, ConsesLow.list( $const37$SubLQuoteFn, assertion_el_formula( assertion ) ) );
      if( !mt_relevance_macros.$mt$.getDynamicValue( thread ).eql( assertion_mt ) )
      {
        assertion_formula = ConsesLow.list( $const47$ist, assertion_mt, assertion_formula );
      }
      return clauses.make_cnf( NIL, ConsesLow.list( ConsesLow.list( $const52$exceptFor, exception_args.first(), assertion_formula ) ) );
    }
    return cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18086L)
  public static SubLObject el_except_when(final SubLObject cnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( cnf, cnf, $list43 );
    neg_lits = cnf.first();
    SubLObject current = cnf.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, cnf, $list43 );
    pos_lits = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject ab_lits = el_utilities.ab_lits( pos_lits );
      final SubLObject ab_lit = ( NIL != list_utilities.singletonP( ab_lits ) ) ? ab_lits.first() : NIL;
      final SubLObject other_pos_lits = ( NIL != ab_lit ) ? Sequences.remove( ab_lit, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
      if( NIL == ab_lit )
      {
        return cnf;
      }
      SubLObject current_$14;
      final SubLObject datum_$13 = current_$14 = ab_lit;
      SubLObject ab_pred = NIL;
      SubLObject exception_list = NIL;
      SubLObject assertion = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list50 );
      ab_pred = current_$14.first();
      current_$14 = current_$14.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list50 );
      exception_list = current_$14.first();
      current_$14 = current_$14.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list50 );
      assertion = current_$14.first();
      current_$14 = current_$14.rest();
      if( NIL == current_$14 )
      {
        final SubLObject exception_args = cycl_utilities.formula_args( exception_list, UNPROVIDED );
        if( NIL != el_utilities.el_var_listP( exception_args ) && NIL != term.kb_assertionP( assertion ) )
        {
          final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
          SubLObject assertion_formula = ConsesLow.list( $const36$UncanonicalizerAssertionFn, ConsesLow.list( $const37$SubLQuoteFn, assertion_el_formula( assertion ) ) );
          final SubLObject lhs = neg_lits;
          final SubLObject rhs = Mapping.mapcar( Symbols.symbol_function( $sym45$NEGATE ), other_pos_lits );
          SubLObject exception_antecedent = ConsesLow.append( lhs, rhs );
          if( NIL != exception_antecedent )
          {
            if( NIL != list_utilities.singletonP( exception_antecedent ) )
            {
              exception_antecedent = exception_antecedent.first();
            }
            else
            {
              exception_antecedent = ConsesLow.cons( $const46$and, exception_antecedent );
            }
          }
          if( !mt_relevance_macros.$mt$.getDynamicValue( thread ).eql( assertion_mt ) )
          {
            assertion_formula = ConsesLow.list( $const47$ist, assertion_mt, assertion_formula );
          }
          return clauses.make_cnf( NIL, ConsesLow.list( ConsesLow.list( $const53$exceptWhen, exception_antecedent, assertion_formula ) ) );
        }
        return cnf;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$13, $list50 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( cnf, $list43 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19302L)
  public static SubLObject unpackage_cnf_clauses(final SubLObject cnfs)
  {
    final SubLObject neg_lits = list_utilities.intersect_all( Mapping.mapcar( Symbols.symbol_function( $sym54$NEG_LITS ), cnfs ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject pos_lits = NIL;
    SubLObject pos_lits_orts = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf_i = NIL;
    cnf_i = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject neg_lits_i = clauses.neg_lits( cnf_i );
      if( NIL != list_utilities.sets_equalP( neg_lits, neg_lits_i, Symbols.symbol_function( EQUAL ) ) )
      {
        pos_lits = ConsesLow.cons( simplifier.disjoin( clauses.pos_lits( cnf_i ), UNPROVIDED ), pos_lits );
      }
      else if( NIL != conses_high.subsetp( neg_lits, neg_lits_i, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        final SubLObject neg_orts = conses_high.set_difference( neg_lits_i, neg_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        final SubLObject pos_lits_i = clauses.pos_lits( cnf_i );
        if( NIL != neg_orts && NIL != pos_lits_i )
        {
          pos_lits_orts = ConsesLow.cons( el_utilities.make_binary_formula( $const55$implies, simplifier.conjoin( neg_orts, T ), simplifier.disjoin( pos_lits_i, T ) ), pos_lits_orts );
        }
        else if( NIL != neg_orts )
        {
          pos_lits = ConsesLow.cons( simplifier.disjoin( Mapping.mapcar( Symbols.symbol_function( $sym56$NEGATE_ATOMIC ), neg_orts ), UNPROVIDED ), pos_lits );
        }
        else if( NIL != pos_lits_i )
        {
          pos_lits = ConsesLow.cons( simplifier.disjoin( pos_lits_i, UNPROVIDED ), pos_lits );
        }
      }
      else
      {
        result = ConsesLow.cons( czer_utilities.unpackage_cnf_clause( cnf_i ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf_i = cdolist_list_var.first();
    }
    result = Sequences.nreverse( result );
    pos_lits = ConsesLow.nconc( Sequences.nreverse( pos_lits ), Sequences.nreverse( pos_lits_orts ) );
    result = ConsesLow.cons( simplifier.disjoin( ConsesLow.list( cycl_utilities.negate( simplifier.conjoin( neg_lits, UNPROVIDED ) ), simplifier.conjoin( pos_lits, UNPROVIDED ) ), UNPROVIDED ), result );
    return simplifier.simplify_el_syntax( simplifier.conjoin( result, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20598L)
  public static SubLObject unpackage_dnf_clauses(final SubLObject dnfs)
  {
    SubLObject el_clauses = NIL;
    SubLObject cdolist_list_var = dnfs;
    SubLObject dnf = NIL;
    dnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject el_clause = czer_utilities.unpackage_dnf_clause( dnf );
      el_clauses = ConsesLow.cons( el_clause, el_clauses );
      cdolist_list_var = cdolist_list_var.rest();
      dnf = cdolist_list_var.first();
    }
    el_clauses = Sequences.nreverse( el_clauses );
    return simplifier.simplify_el_syntax( simplifier.disjoin( el_clauses, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20878L)
  public static SubLObject remove_truesentence_refs(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( formula.isAtom() )
    {
      return formula;
    }
    if( NIL == list_utilities.tree_find( $const27$trueSentence, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return formula;
    }
    if( NIL != el_utilities.el_conjunction_p( formula ) || NIL != el_utilities.el_disjunction_p( formula ) )
    {
      final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
      return ConsesLow.cons( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym57$REMOVE_TRUESENTENCE_REFS ), args ) );
    }
    if( NIL != czer_utilities.true_sentenceP( formula ) && NIL == el_utilities.el_disjunction_p( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) )
    {
      return remove_truesentence_refs( cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
    }
    if( NIL != el_utilities.el_existential_p( formula ) || NIL != el_utilities.el_universal_p( formula ) )
    {
      SubLObject quantifier = NIL;
      SubLObject var = NIL;
      SubLObject subsent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list58 );
      quantifier = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list58 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list58 );
      subsent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( quantifier, var, remove_truesentence_refs( subsent ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( formula, $list58 );
    }
    else if( NIL != el_utilities.el_bounded_existential_p( formula ) )
    {
      SubLObject quantifier = NIL;
      SubLObject n = NIL;
      SubLObject var2 = NIL;
      SubLObject subsent2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list59 );
      quantifier = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list59 );
      n = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list59 );
      var2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list59 );
      subsent2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( quantifier, n, var2, remove_truesentence_refs( subsent2 ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( formula, $list59 );
    }
    else if( NIL != el_utilities.el_negation_p( formula ) )
    {
      SubLObject neg_form = NIL;
      SubLObject new_formula = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list60 );
      neg_form = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list60 );
      new_formula = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( neg_form, remove_truesentence_refs( new_formula ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( formula, $list60 );
    }
    else
    {
      if( NIL != el_utilities.el_implication_p( formula ) )
      {
        thread.resetMultipleValues();
        final SubLObject implies = el_utilities.unmake_binary_formula( formula );
        final SubLObject antecedent = thread.secondMultipleValue();
        final SubLObject consequent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return el_utilities.make_implication( remove_truesentence_refs( antecedent ), remove_truesentence_refs( consequent ) );
      }
      if( NIL != el_utilities.el_pragmatic_requirement_p( formula ) )
      {
        thread.resetMultipleValues();
        final SubLObject pragmatic_requirement = el_utilities.unmake_binary_formula( formula );
        final SubLObject requirement = thread.secondMultipleValue();
        final SubLObject rule = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return el_utilities.make_binary_formula( $const48$pragmaticRequirement, remove_truesentence_refs( requirement ), remove_truesentence_refs( rule ) );
      }
      if( NIL != el_utilities.literalP( formula ) )
      {
        return formula;
      }
      if( NIL != el_utilities.el_exception_p( formula ) )
      {
        return formula;
      }
      el_utilities.el_error( THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED );
      return formula;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22707L)
  public static SubLObject true_sentence_vars(final SubLObject formula)
  {
    if( !formula.isAtom() )
    {
      if( NIL != list_utilities.tree_find( $const27$trueSentence, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != czer_utilities.true_sentenceP( formula ) )
        {
          return el_utilities.formula_quantified_vars( formula );
        }
        if( NIL != el_utilities.el_negation_p( formula ) )
        {
          return true_sentence_vars( cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
        }
        if( NIL != el_utilities.el_conjunction_p( formula ) || NIL != el_utilities.el_disjunction_p( formula ) )
        {
          return Sequences.remove_duplicates( list_utilities.mapappend( Symbols.symbol_function( $sym62$TRUE_SENTENCE_VARS ), cycl_utilities.formula_args( formula, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED );
        }
        if( NIL != el_utilities.el_existential_p( formula ) || NIL != el_utilities.el_universal_p( formula ) )
        {
          return true_sentence_vars( cycl_utilities.formula_arg2( formula, UNPROVIDED ) );
        }
        if( NIL != el_utilities.el_bounded_existential_p( formula ) )
        {
          return true_sentence_vars( cycl_utilities.formula_arg3( formula, UNPROVIDED ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23344L)
  public static SubLObject undo_variables(SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sequence_var = el_utilities.sequence_var( formula, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL != sequence_var )
    {
      formula = el_utilities.strip_sequence_var( formula );
    }
    if( formula.isAtom() )
    {
      result = formula;
    }
    else if( NIL != el_utilities.el_negation_p( formula ) )
    {
      result = el_utilities.make_unary_formula( cycl_utilities.formula_operator( formula ), undo_variables( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) );
    }
    else if( NIL != el_utilities.el_conjunction_p( formula ) || NIL != el_utilities.el_disjunction_p( formula ) )
    {
      result = el_utilities.make_el_formula( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym63$UNDO_VARIABLES ), cycl_utilities.formula_args( formula, UNPROVIDED ) ),
          UNPROVIDED );
    }
    else if( NIL != el_utilities.el_universal_p( formula ) || NIL != el_utilities.el_existential_p( formula ) )
    {
      thread.resetMultipleValues();
      final SubLObject quantifier = el_utilities.unmake_binary_formula( formula );
      final SubLObject var = thread.secondMultipleValue();
      final SubLObject sub_formula = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject ununique_var = ununiquify_el_var( var );
      final SubLObject new_sub_formula = undo_variables( sub_formula );
      if( NIL == ununique_var )
      {
        result = el_utilities.make_binary_formula( quantifier, var, new_sub_formula );
      }
      else if( ununique_var.eql( var ) )
      {
        result = el_utilities.make_binary_formula( quantifier, var, new_sub_formula );
      }
      else if( NIL != list_utilities.tree_find( ununique_var, new_sub_formula, UNPROVIDED, UNPROVIDED ) )
      {
        result = el_utilities.make_binary_formula( quantifier, var, new_sub_formula );
      }
      else
      {
        result = conses_high.subst( ununique_var, var, el_utilities.make_binary_formula( quantifier, var, new_sub_formula ), UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != el_utilities.el_bounded_existential_p( formula ) )
    {
      thread.resetMultipleValues();
      final SubLObject quantifier = el_utilities.unmake_ternary_formula( formula );
      final SubLObject n = thread.secondMultipleValue();
      final SubLObject var2 = thread.thirdMultipleValue();
      final SubLObject sub_formula2 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      final SubLObject ununique_var2 = ununiquify_el_var( var2 );
      final SubLObject new_sub_formula2 = undo_variables( sub_formula2 );
      if( NIL == ununique_var2 )
      {
        result = el_utilities.make_ternary_formula( quantifier, n, var2, new_sub_formula2 );
      }
      else if( ununique_var2.eql( var2 ) )
      {
        result = el_utilities.make_ternary_formula( quantifier, n, var2, new_sub_formula2 );
      }
      else if( NIL != list_utilities.tree_find( ununique_var2, new_sub_formula2, UNPROVIDED, UNPROVIDED ) )
      {
        result = el_utilities.make_ternary_formula( quantifier, n, var2, new_sub_formula2 );
      }
      else
      {
        result = conses_high.subst( ununique_var2, var2, el_utilities.make_ternary_formula( quantifier, n, var2, new_sub_formula2 ), UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != el_utilities.atomic_sentenceP( formula ) )
    {
      result = el_utilities.make_el_formula( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym63$UNDO_VARIABLES ), cycl_utilities.formula_args( formula, UNPROVIDED ) ),
          UNPROVIDED );
    }
    else if( NIL != el_utilities.scoping_relation_expressionP( formula ) )
    {
      final SubLObject scoping_args = kb_accessors.scoping_args( cycl_utilities.formula_operator( formula ), UNPROVIDED );
      SubLObject position = ZERO_INTEGER;
      SubLObject new_formula = NIL;
      SubLObject cdolist_list_var = formula;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( position, scoping_args, UNPROVIDED, UNPROVIDED ) )
        {
          new_formula = ConsesLow.cons( arg, new_formula );
        }
        else
        {
          new_formula = ConsesLow.cons( undo_variables( arg ), new_formula );
        }
        position = Numbers.add( position, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      new_formula = Sequences.nreverse( new_formula );
      position = ZERO_INTEGER;
      cdolist_list_var = formula;
      arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( position, scoping_args, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject ununique_var3 = ununiquify_el_var( arg );
          if( NIL != ununique_var3 )
          {
            if( !ununique_var3.eql( arg ) )
            {
              if( NIL == list_utilities.tree_find( ununique_var3, new_formula, UNPROVIDED, UNPROVIDED ) )
              {
                new_formula = conses_high.subst( ununique_var3, arg, new_formula, UNPROVIDED, UNPROVIDED );
              }
            }
          }
        }
        position = Numbers.add( position, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      result = new_formula;
    }
    else if( NIL != el_utilities.relation_expressionP( formula ) )
    {
      result = el_utilities.make_el_formula( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym63$UNDO_VARIABLES ), cycl_utilities.formula_args( formula, UNPROVIDED ) ),
          UNPROVIDED );
    }
    else
    {
      el_utilities.el_error( FOUR_INTEGER, $str64$_S_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED );
      result = formula;
    }
    if( NIL != sequence_var )
    {
      result = el_utilities.nadd_sequence_var_to_end( sequence_var, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26552L)
  public static SubLObject unremove_universals(SubLObject formula)
  {
    final SubLObject new_formula = remove_truesentence_refs( formula );
    if( !formula.equal( new_formula ) )
    {
      formula = clausifier.do_negations( new_formula );
    }
    formula = unremove_universals_int( formula );
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26929L)
  public static SubLObject unremove_universals_int(SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( formula.isAtom() )
    {
      return formula;
    }
    if( NIL == $vars_to_universalize$.getDynamicValue( thread ) )
    {
      return formula;
    }
    if( NIL == czer_vars.$unremove_universalsP$.getDynamicValue( thread ) )
    {
      return formula;
    }
    if( NIL == el_utilities.el_conjunction_p( formula ) && NIL == el_utilities.el_disjunction_p( formula ) )
    {
      if( NIL != el_utilities.el_existential_p( formula ) || NIL != el_utilities.el_universal_p( formula ) )
      {
        SubLObject current;
        final SubLObject datum = current = formula;
        SubLObject quantifier = NIL;
        SubLObject var = NIL;
        SubLObject subsent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
        quantifier = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
        subsent = current.first();
        current = current.rest();
        if( NIL == current )
        {
          return ConsesLow.list( quantifier, var, unremove_universals_int( subsent ) );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
      }
      else if( NIL != el_utilities.el_bounded_existential_p( formula ) )
      {
        SubLObject current;
        final SubLObject datum = current = formula;
        SubLObject quantifier = NIL;
        SubLObject n = NIL;
        SubLObject var2 = NIL;
        SubLObject subsent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        quantifier = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        n = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        var2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        subsent2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          return ConsesLow.list( quantifier, n, var2, unremove_universals_int( subsent2 ) );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
      }
      else
      {
        if( NIL != el_utilities.literalP( formula ) )
        {
          SubLObject cdolist_list_var = $vars_to_universalize$.getDynamicValue( thread );
          SubLObject uni_var = NIL;
          uni_var = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != list_utilities.tree_find( uni_var, formula, UNPROVIDED, UNPROVIDED ) )
            {
              formula = ConsesLow.list( $const65$forAll, uni_var, formula );
              $vars_to_universalize$.setDynamicValue( Sequences.remove( uni_var, $vars_to_universalize$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            uni_var = cdolist_list_var.first();
          }
          return formula;
        }
        if( NIL != el_utilities.el_exception_p( formula ) )
        {
          return formula;
        }
        el_utilities.el_error( THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED );
        return formula;
      }
      return NIL;
    }
    final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
    SubLObject cdolist_list_var2;
    final SubLObject inter_arg_universals = cdolist_list_var2 = inter_formula_terms( $vars_to_universalize$.getDynamicValue( thread ), args, UNPROVIDED, UNPROVIDED );
    SubLObject uni_var2 = NIL;
    uni_var2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      formula = ConsesLow.list( $const65$forAll, uni_var2, formula );
      cdolist_list_var2 = cdolist_list_var2.rest();
      uni_var2 = cdolist_list_var2.first();
    }
    $vars_to_universalize$.setDynamicValue( conses_high.set_difference( $vars_to_universalize$.getDynamicValue( thread ), inter_arg_universals, UNPROVIDED, UNPROVIDED ), thread );
    if( NIL != inter_arg_universals )
    {
      return unremove_universals_int( formula );
    }
    if( NIL != $vars_to_universalize$.getDynamicValue( thread ) )
    {
      return ConsesLow.cons( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym66$UNREMOVE_UNIVERSALS_INT ), args ) );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28608L)
  public static SubLObject inter_formula_terms(final SubLObject terms, final SubLObject formulas, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject inter_formula_terms = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject referenced_onceP = NIL;
      SubLObject referenced_twiceP = NIL;
      if( NIL == referenced_twiceP )
      {
        SubLObject csome_list_var = formulas;
        SubLObject formula = NIL;
        formula = csome_list_var.first();
        while ( NIL == referenced_twiceP && NIL != csome_list_var)
        {
          if( NIL != list_utilities.tree_find( v_term, formula, test, key ) )
          {
            if( NIL != referenced_onceP )
            {
              referenced_twiceP = T;
            }
            else
            {
              referenced_onceP = T;
            }
          }
          csome_list_var = csome_list_var.rest();
          formula = csome_list_var.first();
        }
      }
      if( NIL != referenced_twiceP )
      {
        inter_formula_terms = ConsesLow.cons( v_term, inter_formula_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return inter_formula_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29159L)
  public static SubLObject inter_formula_skolems(final SubLObject v_skolems, final SubLObject formulas)
  {
    SubLObject inter_formula_skolems = NIL;
    SubLObject cdolist_list_var = v_skolems;
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject skolem_arg_vars = skolem_fn_arg_vars( skolem );
      SubLObject referenced_onceP = NIL;
      SubLObject referenced_twiceP = NIL;
      if( NIL == referenced_twiceP )
      {
        SubLObject csome_list_var = formulas;
        SubLObject formula = NIL;
        formula = csome_list_var.first();
        while ( NIL == referenced_twiceP && NIL != csome_list_var)
        {
          if( NIL != list_utilities.tree_find( skolem, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL != some_tree_find( skolem_arg_vars, formula, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != referenced_onceP )
            {
              referenced_twiceP = T;
            }
            else
            {
              referenced_onceP = T;
            }
          }
          csome_list_var = csome_list_var.rest();
          formula = csome_list_var.first();
        }
      }
      if( NIL != referenced_twiceP )
      {
        inter_formula_skolems = ConsesLow.cons( skolem, inter_formula_skolems );
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return inter_formula_skolems;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29857L)
  public static SubLObject some_tree_find(final SubLObject items, final SubLObject tree, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject foundP = NIL;
    if( NIL == foundP )
    {
      SubLObject csome_list_var;
      SubLObject item;
      for( csome_list_var = items, item = NIL, item = csome_list_var.first(); NIL == foundP && NIL != csome_list_var; foundP = list_utilities.tree_find( item, tree, test, key ), csome_list_var = csome_list_var
          .rest(), item = csome_list_var.first() )
      {
      }
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30062L)
  public static SubLObject unremove_existentials_and_refd_universals(SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject formula_$15 = undo_skolem_mt( formula, mt );
    final SubLObject mt_$16 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    formula = formula_$15;
    mt = mt_$16;
    formula = undo_existentials_and_refd_universals( segregate_skolems( formula ), UNPROVIDED );
    return Values.values( remove_leading_universals( simplifier.simplify_cycl_sentence( formula, UNPROVIDED ) ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30461L)
  public static SubLObject undo_skolem_mt(final SubLObject formula, final SubLObject mt)
  {
    if( NIL != cycl_utilities.expression_find( $const26$SkolemFunctionFn, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject new_formula = NIL;
      SubLObject cdolist_list_var = cycl_utilities.sentence_args( formula, UNPROVIDED );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != base_kb_ist_sentenceP( arg ) )
        {
          new_formula = ConsesLow.cons( cycl_utilities.sentence_arg2( arg, UNPROVIDED ), new_formula );
        }
        else if( NIL != el_utilities.ist_sentence_p( arg, UNPROVIDED ) )
        {
          new_formula = ConsesLow.cons( arg, new_formula );
        }
        else
        {
          new_formula = ConsesLow.cons( el_utilities.make_ist_sentence( mt, arg ), new_formula );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return Values.values( el_utilities.make_conjunction( Sequences.nreverse( new_formula ) ), $const67$BaseKB );
    }
    return Values.values( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30939L)
  public static SubLObject base_kb_ist_sentenceP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.ist_sentence_p( v_object, UNPROVIDED ) && cycl_utilities.sentence_arg1( v_object, UNPROVIDED ).eql( $const67$BaseKB ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31071L)
  public static SubLObject segregate_skolems(final SubLObject formula)
  {
    final SubLObject v_skolems = list_utilities.tree_find_if( Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), formula, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == v_skolems )
    {
      return formula;
    }
    if( NIL == el_utilities.el_conjunction_p( formula ) )
    {
      return formula;
    }
    SubLObject common = NIL;
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
      SubLObject conjunct = NIL;
      conjunct = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        if( NIL != el_utilities.el_disjunction_p( conjunct ) )
        {
          if( NIL != common )
          {
            common = conses_high.intersection( common, cycl_utilities.formula_args( conjunct, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
          }
          else
          {
            common = cycl_utilities.formula_args( conjunct, UNPROVIDED );
          }
        }
        else
        {
          failP = T;
        }
        csome_list_var = csome_list_var.rest();
        conjunct = csome_list_var.first();
      }
    }
    if( NIL == failP )
    {
      SubLObject cdolist_list_var = common;
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), literal, UNPROVIDED ) )
        {
          common = Sequences.remove( literal, common, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
      if( NIL != common )
      {
        cdolist_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( simplifier.disjoin( conses_high.set_difference( cycl_utilities.formula_args( conjunct, UNPROVIDED ), common, Symbols.symbol_function( EQUAL ), UNPROVIDED ), UNPROVIDED ), result );
          cdolist_list_var = cdolist_list_var.rest();
          conjunct = cdolist_list_var.first();
        }
        result = simplifier.simplify_cycl_sentence( simplifier.disjoin( ConsesLow.append( common, ConsesLow.list( simplifier.conjoin( Sequences.reverse( result ), UNPROVIDED ) ) ), UNPROVIDED ), UNPROVIDED );
      }
    }
    if( NIL != result )
    {
      return result;
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32311L)
  public static SubLObject undo_existentials_and_refd_universals(SubLObject formula, SubLObject vars)
  {
    if( vars == UNPROVIDED )
    {
      vars = el_utilities.sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( formula.isAtom() )
    {
      return formula;
    }
    if( NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), formula, UNPROVIDED ) )
    {
      return formula;
    }
    if( NIL != el_utilities.el_conjunction_p( formula ) || NIL != el_utilities.el_disjunction_p( formula ) )
    {
      final SubLObject v_skolems = Sequences.remove_duplicates( list_utilities.tree_gather( formula, Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED ),
          Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
      SubLObject inter_arg_skolems = inter_formula_skolems( v_skolems, args );
      SubLObject placeholder_vars = NIL;
      if( NIL != inter_arg_skolems )
      {
        SubLObject cdolist_list_var;
        inter_arg_skolems = ( cdolist_list_var = order_skolems_inner_to_outer( inter_arg_skolems ) );
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject test_arg_skolemP = NIL;
          SubLObject test_most_nested_inter_arg_skolemP = NIL;
          if( NIL == test_most_nested_inter_arg_skolemP )
          {
            SubLObject csome_list_var = args;
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ( NIL == test_most_nested_inter_arg_skolemP && NIL != csome_list_var)
            {
              if( NIL != list_utilities.tree_find( skolem, arg, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                if( NIL != test_arg_skolemP )
                {
                  test_most_nested_inter_arg_skolemP = T;
                }
                else
                {
                  test_arg_skolemP = T;
                }
              }
              csome_list_var = csome_list_var.rest();
              arg = csome_list_var.first();
            }
          }
          if( NIL == test_most_nested_inter_arg_skolemP )
          {
            SubLObject cdolist_list_var_$17 = skolem_fn_arg_vars( skolem );
            SubLObject var = NIL;
            var = cdolist_list_var_$17.first();
            while ( NIL != cdolist_list_var_$17)
            {
              placeholder_vars = ConsesLow.cons( var, placeholder_vars );
              add_universal_var_placeholder( var );
              cdolist_list_var_$17 = cdolist_list_var_$17.rest();
              var = cdolist_list_var_$17.first();
            }
            inter_arg_skolems = Sequences.remove( skolem, inter_arg_skolems, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          skolem = cdolist_list_var.first();
        }
      }
      SubLObject cdolist_list_var = inter_arg_skolems;
      SubLObject skolem = NIL;
      skolem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        formula = init_existentialize_formula( skolem, formula );
        cdolist_list_var = cdolist_list_var.rest();
        skolem = cdolist_list_var.first();
      }
      if( NIL != inter_arg_skolems )
      {
        args = cycl_utilities.formula_args( formula, UNPROVIDED );
      }
      if( NIL != v_skolems )
      {
        formula = ConsesLow.cons( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym69$UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS ), args ) );
      }
      cdolist_list_var = placeholder_vars;
      SubLObject var2 = NIL;
      var2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != check_for_universal_var_placeholder( var2 ) )
        {
          formula = ConsesLow.list( $const65$forAll, var2, formula );
        }
        remove_universal_var_placeholder( var2 );
        cdolist_list_var = cdolist_list_var.rest();
        var2 = cdolist_list_var.first();
      }
      cdolist_list_var = order_skolems_inner_to_outer( inter_arg_skolems );
      skolem = NIL;
      skolem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        formula = existentialize_formula( skolem, formula );
        SubLObject cdolist_list_var_$18;
        final SubLObject universal_vars = cdolist_list_var_$18 = remove_skolem_from_universal_vars_to_skolem( skolem );
        SubLObject uni_var = NIL;
        uni_var = cdolist_list_var_$18.first();
        while ( NIL != cdolist_list_var_$18)
        {
          formula = ConsesLow.list( $const65$forAll, uni_var, formula );
          cdolist_list_var_$18 = cdolist_list_var_$18.rest();
          uni_var = cdolist_list_var_$18.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        skolem = cdolist_list_var.first();
      }
      return formula;
    }
    if( NIL != el_utilities.el_existential_p( formula ) )
    {
      SubLObject current;
      final SubLObject datum = current = formula;
      SubLObject quantifier = NIL;
      SubLObject var3 = NIL;
      SubLObject subsent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
      quantifier = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
      var3 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
      subsent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( quantifier, var3, undo_existentials_and_refd_universals( subsent, UNPROVIDED ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    }
    else
    {
      if( NIL != el_utilities.el_universal_p( formula ) )
      {
        SubLObject cdolist_list_var2 = order_skolems_inner_to_outer( list_utilities.tree_gather( formula, Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), Symbols.symbol_function( EQUAL ), UNPROVIDED,
            UNPROVIDED ) );
        SubLObject skolem2 = NIL;
        skolem2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          formula = existentialize_formula( skolem2, formula );
          SubLObject cdolist_list_var_$19;
          final SubLObject universal_vars2 = cdolist_list_var_$19 = remove_skolem_from_universal_vars_to_skolem( skolem2 );
          SubLObject uni_var2 = NIL;
          uni_var2 = cdolist_list_var_$19.first();
          while ( NIL != cdolist_list_var_$19)
          {
            formula = ConsesLow.list( $const65$forAll, uni_var2, formula );
            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
            uni_var2 = cdolist_list_var_$19.first();
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          skolem2 = cdolist_list_var2.first();
        }
        return formula;
      }
      if( NIL != el_utilities.el_exception_p( formula ) )
      {
        return formula;
      }
      if( NIL != el_utilities.el_bounded_existential_p( formula ) )
      {
        SubLObject current;
        final SubLObject datum = current = formula;
        SubLObject quantifier = NIL;
        SubLObject n = NIL;
        SubLObject var4 = NIL;
        SubLObject subsent2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        quantifier = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        n = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        var4 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
        subsent2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          return ConsesLow.list( quantifier, n, var4, undo_existentials_and_refd_universals( subsent2, UNPROVIDED ) );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
      }
      else
      {
        if( NIL != el_utilities.literalP( formula ) )
        {
          SubLObject cdolist_list_var2 = order_skolems_inner_to_outer( list_utilities.tree_gather( formula, Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), Symbols.symbol_function( EQUAL ), UNPROVIDED,
              UNPROVIDED ) );
          SubLObject skolem2 = NIL;
          skolem2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            formula = existentialize_formula( skolem2, formula );
            SubLObject cdolist_list_var_$20;
            final SubLObject universal_vars2 = cdolist_list_var_$20 = remove_skolem_from_universal_vars_to_skolem( skolem2 );
            SubLObject uni_var2 = NIL;
            uni_var2 = cdolist_list_var_$20.first();
            while ( NIL != cdolist_list_var_$20)
            {
              formula = ConsesLow.list( $const65$forAll, uni_var2, formula );
              cdolist_list_var_$20 = cdolist_list_var_$20.rest();
              uni_var2 = cdolist_list_var_$20.first();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            skolem2 = cdolist_list_var2.first();
          }
          return formula;
        }
        el_utilities.el_error( THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED );
        return formula;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37581L)
  public static SubLObject init_existentialize_formula(final SubLObject existential_term, final SubLObject formula)
  {
    final SubLObject sk_var = skolems.skolem_function_var( existential_term );
    return conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37857L)
  public static SubLObject existentialize_formula(final SubLObject existential_term, final SubLObject formula)
  {
    final SubLObject sk_var = skolems.skolem_function_var( existential_term );
    final SubLObject sk_number = skolems.skolem_number( existential_term );
    if( NIL == sk_number )
    {
      return ConsesLow.list( $const70$thereExists, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    if( NIL != el_utilities.el_formula_with_operator_p( sk_number, $const71$IntervalMinFn ) )
    {
      final SubLObject min = cycl_utilities.nat_arg1( sk_number, UNPROVIDED );
      return ConsesLow.list( $const72$thereExistAtLeast, min, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    if( NIL != el_utilities.el_formula_with_operator_p( sk_number, $const73$IntervalMaxFn ) )
    {
      final SubLObject max = cycl_utilities.nat_arg1( sk_number, UNPROVIDED );
      return ConsesLow.list( $const74$thereExistAtMost, max, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    if( NIL != at_defns.quiet_has_typeP( sk_number, $const75$Integer, UNPROVIDED ) )
    {
      return ConsesLow.list( $const76$thereExistExactly, sk_number, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    }
    if( NIL != kb_control_vars.quant_kb_loaded_p() && ( NIL != collection_defns.ibqeP( sk_number, UNPROVIDED ) || ( sk_number.isCons() && sk_number.first().eql( $const77$Unity ) ) ) && sk_number.isList() && THREE_INTEGER
        .numE( Sequences.length( sk_number ) ) )
    {
      SubLObject current;
      final SubLObject datum = current = sk_number;
      SubLObject unit = NIL;
      SubLObject min2 = NIL;
      SubLObject max2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
      unit = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
      min2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
      max2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( unit.eql( $const77$Unity ) )
        {
          if( max2.eql( $const79$PlusInfinity ) && NIL != at_defns.quiet_has_typeP( min2, $const75$Integer, UNPROVIDED ) )
          {
            return ConsesLow.list( $const72$thereExistAtLeast, min2, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          if( min2.eql( ZERO_INTEGER ) && NIL != at_defns.quiet_has_typeP( max2, $const75$Integer, UNPROVIDED ) )
          {
            return ConsesLow.list( $const74$thereExistAtMost, max2, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
          }
          return ConsesLow.list( $const76$thereExistExactly, sk_number, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
      }
      return NIL;
    }
    return ConsesLow.list( $const76$thereExistExactly, sk_number, sk_var, conses_high.subst( sk_var, existential_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39640L)
  public static SubLObject implications_in(final SubLObject formula)
  {
    return simplifier.simplify_cycl_sentence( undo_implications( simplifier.simplify_cycl_sentence( uncanon_dnf_1( formula ), UNPROVIDED ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39848L)
  public static SubLObject undo_implications(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( formula.isAtom() )
    {
      return formula;
    }
    if( NIL != el_utilities.el_negation_p( formula ) )
    {
      SubLObject sub_formula = NIL;
      final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding( thread );
      try
      {
        czer_vars.$within_negationP$.bind( makeBoolean( NIL == czer_vars.$within_negationP$.getDynamicValue( thread ) ), thread );
        sub_formula = undo_implications( cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
      }
      finally
      {
        czer_vars.$within_negationP$.rebind( _prev_bind_0, thread );
      }
      return el_utilities.make_unary_formula( cycl_utilities.formula_operator( formula ), sub_formula );
    }
    if( NIL != implicatable_conjunctionP( formula ) )
    {
      final SubLObject args = cycl_utilities.formula_args( simplifier.simplify_cycl_sentence( clausifier.do_negations( clausifier.negate_conjunction( formula ) ), UNPROVIDED ), UNPROVIDED );
      final SubLObject neg = Mapping.mapcar( Symbols.symbol_function( $sym45$NEGATE ), el_utilities.el_negative_sentences( args ) );
      final SubLObject pos = el_utilities.el_positive_sentences( args );
      final SubLObject lhf = undo_implications( ( NIL != list_utilities.singletonP( neg ) ) ? neg.first() : ConsesLow.cons( $const46$and, neg ) );
      final SubLObject rhf = undo_implications( ( NIL != list_utilities.singletonP( pos ) ) ? pos.first() : ConsesLow.cons( $const80$or, pos ) );
      return cycl_utilities.negate( el_utilities.make_binary_formula( $const55$implies, lhf, rhf ) );
    }
    if( NIL != implicatable_disjunctionP( formula ) )
    {
      final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
      final SubLObject neg = Mapping.mapcar( Symbols.symbol_function( $sym45$NEGATE ), el_utilities.el_negative_sentences( args ) );
      final SubLObject pos = el_utilities.el_positive_sentences( args );
      final SubLObject lhf = undo_implications( ( NIL != list_utilities.singletonP( neg ) ) ? neg.first() : ConsesLow.cons( $const46$and, neg ) );
      final SubLObject rhf = undo_implications( ( NIL != list_utilities.singletonP( pos ) ) ? pos.first() : ConsesLow.cons( $const80$or, pos ) );
      return el_utilities.make_binary_formula( $const55$implies, lhf, rhf );
    }
    if( NIL != el_utilities.el_conjunction_p( formula ) || NIL != el_utilities.el_disjunction_p( formula ) || NIL != el_utilities.el_exception_p( formula ) )
    {
      return ConsesLow.cons( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym81$UNDO_IMPLICATIONS ), cycl_utilities.formula_args( formula, UNPROVIDED ) ) );
    }
    if( NIL != el_utilities.el_existential_p( formula ) || NIL != el_utilities.el_universal_p( formula ) )
    {
      SubLObject quantifier = NIL;
      SubLObject var = NIL;
      SubLObject subsent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list58 );
      quantifier = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list58 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list58 );
      subsent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( quantifier, var, undo_implications( subsent ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( formula, $list58 );
    }
    else if( NIL != el_utilities.el_bounded_existential_p( formula ) )
    {
      SubLObject quantifier = NIL;
      SubLObject n = NIL;
      SubLObject var2 = NIL;
      SubLObject subsent2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list59 );
      quantifier = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list59 );
      n = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list59 );
      var2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list59 );
      subsent2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return ConsesLow.list( quantifier, n, var2, undo_implications( subsent2 ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( formula, $list59 );
    }
    else
    {
      if( NIL != el_utilities.atomic_sentenceP( formula ) )
      {
        return formula;
      }
      return formula;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41588L)
  public static SubLObject implicatable_disjunctionP(final SubLObject formula)
  {
    if( NIL != el_utilities.el_disjunction_p( formula ) )
    {
      SubLObject negP = NIL;
      SubLObject posP = NIL;
      if( NIL == negP )
      {
        SubLObject csome_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
        SubLObject disjunct = NIL;
        disjunct = csome_list_var.first();
        while ( NIL == negP && NIL != csome_list_var)
        {
          if( NIL != el_utilities.el_negation_p( disjunct ) )
          {
            negP = T;
          }
          else
          {
            posP = T;
          }
          csome_list_var = csome_list_var.rest();
          disjunct = csome_list_var.first();
        }
      }
      if( NIL != negP && NIL == posP )
      {
        SubLObject csome_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
        SubLObject disjunct = NIL;
        disjunct = csome_list_var.first();
        while ( NIL == posP && NIL != csome_list_var)
        {
          if( NIL == el_utilities.el_negation_p( disjunct ) )
          {
            posP = T;
          }
          csome_list_var = csome_list_var.rest();
          disjunct = csome_list_var.first();
        }
      }
      return makeBoolean( NIL != negP && NIL != posP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41987L)
  public static SubLObject implicatable_conjunctionP(final SubLObject formula)
  {
    if( NIL != czer_utilities.within_negationP() && NIL != el_utilities.el_conjunction_p( formula ) )
    {
      return implicatable_disjunctionP( simplifier.simplify_el_syntax( clausifier.do_negations( clausifier.negate_conjunction( formula ) ), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42378L)
  public static SubLObject uncanon_dnf_1(SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sequence_var = el_utilities.sequence_var( formula, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL != sequence_var )
    {
      formula = el_utilities.strip_sequence_var( formula );
    }
    if( NIL != czer_utilities.encapsulate_formulaP( formula ) )
    {
      result = czer_utilities.encapsulate_formula( formula, UNPROVIDED );
    }
    else if( formula.isAtom() )
    {
      result = formula;
    }
    else if( NIL != el_utilities.el_negation_p( formula ) )
    {
      result = formula;
    }
    else if( NIL != el_utilities.el_conjunction_p( formula ) && Sequences.length( cycl_utilities.formula_args( formula, UNPROVIDED ) ).numL( $uncanonicalizer_dnf_threshold$.getDynamicValue( thread ) ) )
    {
      final SubLObject disj = clausifier.first_disjunction( cycl_utilities.formula_args( formula, UNPROVIDED ) );
      final SubLObject conj = ( NIL != disj ) ? Sequences.remove( disj, cycl_utilities.formula_args( formula, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
      if( NIL != conj )
      {
        result = uncanon_dnf_1( ConsesLow.cons( $const80$or, Mapping.mapcar( Symbols.symbol_function( $sym82$UNCANON_DNF_1 ), clausifier.distribute_conjunction( conj, disj.rest(), UNPROVIDED ) ) ) );
      }
      else
      {
        result = ConsesLow.cons( $const46$and, Mapping.mapcar( Symbols.symbol_function( $sym82$UNCANON_DNF_1 ), cycl_utilities.formula_args( formula, UNPROVIDED ) ) );
      }
    }
    else if( NIL != el_utilities.el_disjunction_p( formula ) )
    {
      result = ConsesLow.cons( $const80$or, Mapping.mapcar( Symbols.symbol_function( $sym82$UNCANON_DNF_1 ), cycl_utilities.formula_args( formula, UNPROVIDED ) ) );
    }
    else if( NIL != el_utilities.literalP( formula ) )
    {
      result = formula;
    }
    else if( NIL != naut_formulaP( formula ) )
    {
      result = formula;
    }
    else if( NIL != el_utilities.el_non_atomic_sentenceP( formula ) )
    {
      result = formula;
    }
    else
    {
      el_utilities.el_error( FOUR_INTEGER, $str83$_s_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED );
      result = formula;
    }
    if( NIL != sequence_var )
    {
      result = el_utilities.nadd_sequence_var_to_end( sequence_var, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43659L)
  public static SubLObject naut_formulaP(final SubLObject formula)
  {
    if( NIL != term.nautP( formula, UNPROVIDED ) )
    {
      return at_utilities.formula_denoting_functionP( formula, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43774L)
  public static SubLObject ists_out(final SubLObject sentence)
  {
    if( NIL == cycl_utilities.expression_find_if( $sym84$IST_SENTENCE_P, sentence, UNPROVIDED, UNPROVIDED ) )
    {
      return sentence;
    }
    return cycl_utilities.expression_transform( sentence, $sym85$SIMPLIFIABLE_IST_EXPRESSION_, $sym86$SIMPLIFY_IST_EXPRESSION, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44063L)
  public static SubLObject simplifiable_ist_expressionP(final SubLObject v_object)
  {
    if( NIL != el_utilities.ist_sentence_p( v_object, UNPROVIDED ) )
    {
      return el_utilities.ist_sentence_p( el_utilities.designated_sentence( v_object ), UNPROVIDED );
    }
    if( NIL == el_utilities.el_conjunction_p( v_object ) )
    {
      return NIL;
    }
    if( NIL != list_utilities.every_in_list( $sym84$IST_SENTENCE_P, cycl_utilities.formula_args( v_object, UNPROVIDED ), UNPROVIDED ) )
    {
      SubLObject candidate_mt = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( v_object, $kw87$IGNORE );
      SubLObject ist_conjunct = NIL;
      ist_conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject mt = el_utilities.designated_mt( ist_conjunct );
        if( NIL == candidate_mt )
        {
          candidate_mt = mt;
        }
        else if( NIL == hlmt.hlmt_equalP( mt, candidate_mt ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        ist_conjunct = cdolist_list_var.first();
      }
      return list_utilities.sublisp_boolean( candidate_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44667L)
  public static SubLObject simplify_ist_expression(final SubLObject v_object)
  {
    if( NIL != el_utilities.ist_sentence_p( v_object, UNPROVIDED ) )
    {
      if( NIL != el_utilities.ist_sentence_p( el_utilities.designated_sentence( v_object ), UNPROVIDED ) )
      {
        return el_utilities.designated_sentence( v_object );
      }
    }
    else if( NIL != el_utilities.el_conjunction_p( v_object ) )
    {
      if( NIL != list_utilities.every_in_list( $sym84$IST_SENTENCE_P, cycl_utilities.formula_args( v_object, UNPROVIDED ), UNPROVIDED ) )
      {
        final SubLObject candidate_mt = el_utilities.designated_mt( cycl_utilities.formula_arg1( v_object, UNPROVIDED ) );
        SubLObject new_conjuncts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( v_object, $kw87$IGNORE );
        SubLObject ist_conjunct = NIL;
        ist_conjunct = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject sentence = el_utilities.designated_sentence( ist_conjunct );
          new_conjuncts = ConsesLow.cons( sentence, new_conjuncts );
          cdolist_list_var = cdolist_list_var.rest();
          ist_conjunct = cdolist_list_var.first();
        }
        new_conjuncts = Sequences.nreverse( new_conjuncts );
        return ConsesLow.list( $const47$ist, candidate_mt, reader.bq_cons( $const46$and, ConsesLow.append( new_conjuncts, NIL ) ) );
      }
    }
    else
    {
      Errors.error( $str88$unable_to_simplify___ist_expressi, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45459L)
  public static SubLObject remove_leading_universals(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( formula.isAtom() )
    {
      return formula;
    }
    if( NIL == list_utilities.tree_find( $const65$forAll, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return formula;
    }
    if( NIL != el_utilities.el_conjunction_p( formula ) || NIL != el_utilities.el_disjunction_p( formula ) )
    {
      final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
      return ConsesLow.cons( cycl_utilities.formula_operator( formula ), Mapping.mapcar( Symbols.symbol_function( $sym89$REMOVE_LEADING_UNIVERSALS ), args ) );
    }
    if( NIL != el_utilities.el_universal_p( formula ) )
    {
      SubLObject quantifier = NIL;
      SubLObject var = NIL;
      SubLObject subsent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list58 );
      quantifier = formula.first();
      SubLObject current = formula.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list58 );
      var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list58 );
      subsent = current.first();
      current = current.rest();
      if( NIL != current )
      {
        cdestructuring_bind.cdestructuring_bind_error( formula, $list58 );
        return NIL;
      }
      if( NIL != subl_promotions.memberP( var, $retain_leading_universals$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
      {
        return el_utilities.make_binary_formula( quantifier, var, remove_leading_universals( subsent ) );
      }
      return remove_leading_universals( subsent );
    }
    else
    {
      if( NIL != el_utilities.el_existential_p( formula ) || NIL != el_utilities.el_bounded_existential_p( formula ) )
      {
        return formula;
      }
      if( NIL != el_utilities.literalP( formula ) )
      {
        return formula;
      }
      if( NIL != el_utilities.el_exception_p( formula ) )
      {
        return formula;
      }
      el_utilities.el_error( THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED );
      return formula;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46570L)
  public static SubLObject sentence_free_vars_not_bound_to_skolems(final SubLObject formula, SubLObject v_skolems)
  {
    if( v_skolems == UNPROVIDED )
    {
      v_skolems = formula_unreified_skolems( formula );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != v_skolems || $universal_vars_to_skolem$.getDynamicValue( thread ).isHashtable() )
    {
      final SubLObject initial_free_vars = el_utilities.sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject skolem_vars = Mapping.mapcar( $sym90$SKOLEM_FUNCTION_VAR, v_skolems );
      final SubLObject skolem_num_vars = list_utilities.remove_if_not( Symbols.symbol_function( $sym91$EL_VAR_ ), Mapping.mapcar( $sym92$SKOLEM_NUMBER, v_skolems ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject result_vars = NIL;
      SubLObject cdolist_list_var = initial_free_vars;
      SubLObject free_var = NIL;
      free_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == subl_promotions.memberP( free_var, skolem_vars, UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( free_var, skolem_num_vars, UNPROVIDED, UNPROVIDED ) && NIL == Hashtables.gethash( free_var,
            $universal_vars_to_skolem$.getDynamicValue( thread ), UNPROVIDED ) )
        {
          result_vars = ConsesLow.cons( free_var, result_vars );
        }
        cdolist_list_var = cdolist_list_var.rest();
        free_var = cdolist_list_var.first();
      }
      return result_vars;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47293L)
  public static SubLObject add_universal_var_placeholder(final SubLObject uni_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( uni_var, $universal_vars_to_skolem$.getDynamicValue( thread ), ConsesLow.cons( uni_var, Hashtables.gethash( uni_var, $universal_vars_to_skolem$.getDynamicValue( thread ), UNPROVIDED ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47584L)
  public static SubLObject check_for_universal_var_placeholder(final SubLObject uni_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( Hashtables.gethash( uni_var, $universal_vars_to_skolem$.getDynamicValue( thread ), UNPROVIDED ).equal( ConsesLow.list( uni_var ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47833L)
  public static SubLObject remove_universal_var_placeholder(final SubLObject uni_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( uni_var, $universal_vars_to_skolem$.getDynamicValue( thread ), conses_high.set_difference( Hashtables.gethash( uni_var, $universal_vars_to_skolem$.getDynamicValue( thread ), UNPROVIDED ),
        ConsesLow.list( uni_var ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48100L)
  public static SubLObject skolem_fn_arg_vars(final SubLObject unreified_skolem_term)
  {
    return skolems.skolem_function_dependent_vars( unreified_skolem_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48372L)
  public static SubLObject formula_unreified_skolems(final SubLObject formula)
  {
    return Sequences.remove_duplicates( list_utilities.tree_gather( formula, Symbols.symbol_function( $sym68$UNREIFIED_SKOLEM_TERM_ ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED ), Symbols.symbol_function(
        EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48517L)
  public static SubLObject universal_vars_to_skolem_table(final SubLObject formula, SubLObject v_skolems)
  {
    if( v_skolems == UNPROVIDED )
    {
      v_skolems = formula_unreified_skolems( formula );
    }
    final SubLObject table = Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = v_skolems;
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$21;
      final SubLObject var_list = cdolist_list_var_$21 = skolem_fn_arg_vars( skolem );
      SubLObject var = NIL;
      var = cdolist_list_var_$21.first();
      while ( NIL != cdolist_list_var_$21)
      {
        Hashtables.sethash( var, table, ConsesLow.cons( skolem, Hashtables.gethash( var, table, UNPROVIDED ) ) );
        cdolist_list_var_$21 = cdolist_list_var_$21.rest();
        var = cdolist_list_var_$21.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49433L)
  public static SubLObject remove_skolem_from_universal_vars_to_skolem(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject var_list = skolem_fn_arg_vars( skolem );
    SubLObject result_list = NIL;
    SubLObject cdolist_list_var = var_list;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject newhash = conses_high.set_difference( Hashtables.gethash( var, $universal_vars_to_skolem$.getDynamicValue( thread ), UNPROVIDED ), ConsesLow.list( skolem ), Symbols.symbol_function( EQUAL ),
          UNPROVIDED );
      Hashtables.sethash( var, $universal_vars_to_skolem$.getDynamicValue( thread ), newhash );
      if( NIL == newhash )
      {
        result_list = ConsesLow.cons( var, result_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return result_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50050L)
  public static SubLObject num_args_of_skolem_fn(final SubLObject skolem)
  {
    return Sequences.length( skolem_fn_arg_vars( skolem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50219L)
  public static SubLObject order_skolems_inner_to_outer(final SubLObject v_skolems)
  {
    return Sort.sort( v_skolems, Symbols.symbol_function( $sym93$_ ), Symbols.symbol_function( $sym94$NUM_ARGS_OF_SKOLEM_FN ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50513L)
  public static SubLObject nsubst_hl_vars(SubLObject v_object, final SubLObject symbols)
  {
    v_object = czer_utilities.nescape_quote_hl_vars( v_object );
    SubLObject list_var = NIL;
    SubLObject symbol = NIL;
    SubLObject index = NIL;
    list_var = symbols;
    symbol = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), symbol = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      final SubLObject variable = variables.find_variable_by_id( index );
      v_object = conses_high.nsubst( symbol, variable, v_object, UNPROVIDED, UNPROVIDED );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50885L)
  public static SubLObject unreify_cnfs_nats(SubLObject cnfs, SubLObject index_lits, SubLObject mt)
  {
    if( index_lits == UNPROVIDED )
    {
      index_lits = el_utilities.tou_lits( list_utilities.mapappend( Symbols.symbol_function( $sym54$NEG_LITS ), cnfs ) );
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject skolem_constants = gather_skolem_constants( cnfs, mt );
    SubLObject skolem_terms = Mapping.mapcar( Symbols.symbol_function( $sym95$TERM_OF_UNIT ), skolem_constants );
    cnfs = transform_list_utilities.quiescent_transform( cnfs, Symbols.symbol_function( $sym96$SKOLEM_CONSTANT_ ), Symbols.symbol_function( $sym95$TERM_OF_UNIT ), UNPROVIDED, UNPROVIDED );
    mt = transform_list_utilities.quiescent_transform( mt, Symbols.symbol_function( $sym96$SKOLEM_CONSTANT_ ), Symbols.symbol_function( $sym95$TERM_OF_UNIT ), UNPROVIDED, UNPROVIDED );
    SubLObject indexs;
    SubLObject index;
    for( indexs = NIL, index = NIL, indexs = index_lits, index = indexs.first(); NIL != index; index = indexs.first() )
    {
      cnfs = subst_index_in( index, cnfs );
      if( NIL != term.reified_skolem_termP( conses_high.third( index ) ) )
      {
        skolem_terms = ConsesLow.cons( conses_high.third( index ), skolem_terms );
      }
      indexs = subst_index_in( index, indexs.rest() );
    }
    SubLObject cdolist_list_var = skolem_terms;
    SubLObject skolem_term = NIL;
    skolem_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject cnfs_$22 = unreify_cnfs_skolem( cnfs, skolem_term, mt );
      final SubLObject mt_$23 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      cnfs = cnfs_$22;
      mt = mt_$23;
      cdolist_list_var = cdolist_list_var.rest();
      skolem_term = cdolist_list_var.first();
    }
    cnfs = transform_list_utilities.transform( cnfs, Symbols.symbol_function( $sym97$NART_P ), Symbols.symbol_function( $sym95$TERM_OF_UNIT ), UNPROVIDED );
    mt = transform_list_utilities.transform( mt, $sym97$NART_P, $sym95$TERM_OF_UNIT, UNPROVIDED );
    return Values.values( cnfs, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52019L)
  public static SubLObject gather_skolem_constants(final SubLObject cnfs, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    result = cycl_utilities.expression_gather( transform_list_utilities.quiescent_transform( ConsesLow.cons( mt, cnfs ), Symbols.symbol_function( $sym98$REIFIED_SKOLEM_CONSTANT_TERM_ ), Symbols.symbol_function(
        $sym99$FIND_NART ), UNPROVIDED, UNPROVIDED ), $sym96$SKOLEM_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52321L)
  public static SubLObject unreify_cnfs_terms(final SubLObject cnfs, SubLObject index_lits, SubLObject mt)
  {
    if( index_lits == UNPROVIDED )
    {
      index_lits = el_utilities.tou_lits( list_utilities.mapappend( Symbols.symbol_function( $sym54$NEG_LITS ), cnfs ) );
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return unreify_cnfs_nats( unreify_cnfs_assertions( cnfs, mt ), index_lits, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52513L)
  public static SubLObject unreify_cnfs_assertions(final SubLObject cnfs, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_cnfs = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      new_cnfs = transform_list_utilities.transform( cnfs, Symbols.symbol_function( $sym100$KB_ASSERTION_ ), Symbols.symbol_function( $sym101$WRAPPED_ASSERTION_EL_FORMULA_WRT_MT ), UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return new_cnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52739L)
  public static SubLObject wrapped_assertion_el_formula_wrt_mt(final SubLObject assertion)
  {
    final SubLObject assertion_formula = assertion_el_formula( assertion );
    final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
    return ConsesLow.list( $const36$UncanonicalizerAssertionFn, ConsesLow.list( $const37$SubLQuoteFn, el_utilities.make_binary_formula( $const47$ist, assertion_mt, assertion_formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53038L)
  public static SubLObject subst_index_in(final SubLObject index, final SubLObject expression)
  {
    return conses_high.subst( conses_high.third( index ), conses_high.second( index ), expression, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53146L)
  public static SubLObject unreify_cnfs_skolem(final SubLObject cnfs, final SubLObject skolem_term, final SubLObject mt)
  {
    final SubLObject sk_constant = cycl_utilities.nat_functor( skolem_term );
    SubLObject unreified_sk_term = skolems.el_unreified_sk_term( sk_constant );
    if( NIL != sk_constant && NIL != unreified_sk_term )
    {
      final SubLObject sk_var = skolems.skolem_function_var( unreified_sk_term );
      final SubLObject uniquified_var = sk_var_wrt( sk_var, skolem_term, cnfs, mt );
      unreified_sk_term = expression_subst_skolem( uniquified_var, sk_var, el_utilities.copy_formula( unreified_sk_term ), UNPROVIDED );
      SubLObject cdolist_list_var;
      final SubLObject sk_fn_vars = cdolist_list_var = conses_high.second( unreified_sk_term );
      SubLObject sk_fn_var = NIL;
      sk_fn_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject uniquified_sk_fn_var = sk_fn_arg_wrt( sk_fn_var, skolem_term, cnfs, mt );
        unreified_sk_term = expression_subst_skolem( uniquified_sk_fn_var, sk_fn_var, el_utilities.copy_formula( unreified_sk_term ), UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        sk_fn_var = cdolist_list_var.first();
      }
      return Values.values( expression_subst_skolem( unreified_sk_term, skolem_term, cnfs, Symbols.symbol_function( EQUAL ) ), expression_subst_skolem( unreified_sk_term, skolem_term, mt, Symbols.symbol_function(
          EQUAL ) ) );
    }
    return Values.values( cnfs, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54125L)
  public static SubLObject expression_subst_skolem(final SubLObject new_var, final SubLObject old_var, final SubLObject expression, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Functions.funcall( test, new_var, old_var ) )
    {
      return expression;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
    try
    {
      cycl_utilities.$opaque_arg_function$.bind( $sym102$OPAQUE_ARG_WRT_SKOLEM_, thread );
      result = cycl_utilities.expression_subst( new_var, old_var, expression, test, UNPROVIDED );
    }
    finally
    {
      cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54443L)
  public static SubLObject sk_fn_arg_wrt(final SubLObject sk_fn_var, final SubLObject skolem_term, SubLObject cnfs, SubLObject mt)
  {
    if( cnfs == UNPROVIDED )
    {
      cnfs = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject ununiquified_var = NIL;
    ununiquified_var = ununiquify_el_var( sk_fn_var );
    if( !sk_fn_var.eql( ununiquified_var ) && NIL != list_utilities.tree_find( ununiquified_var, ConsesLow.cons( mt, cnfs ), UNPROVIDED, UNPROVIDED ) )
    {
      result = ununiquified_var;
    }
    if( NIL == result )
    {
      result = sk_fn_var;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54844L)
  public static SubLObject sk_var_wrt(final SubLObject sk_var, final SubLObject skolem_term, SubLObject cnfs, SubLObject mt)
  {
    if( cnfs == UNPROVIDED )
    {
      cnfs = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject ununiquified_var = NIL;
    if( NIL == list_utilities.tree_find( sk_var, ConsesLow.cons( mt, cnfs ), UNPROVIDED, UNPROVIDED ) )
    {
      ununiquified_var = ununiquify_el_var( sk_var );
      if( !sk_var.eql( ununiquified_var ) && NIL == list_utilities.tree_find( ununiquified_var, ConsesLow.cons( mt, cnfs ), UNPROVIDED, UNPROVIDED ) )
      {
        result = ununiquified_var;
      }
    }
    if( NIL == result )
    {
      final SubLObject current_var_bind = conses_high.assoc( sk_var, czer_vars.$el_var_blist$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      if( NIL != current_var_bind && !skolem_term.eql( current_var_bind.rest() ) )
      {
        final SubLObject current_sk_bind = conses_high.rassoc( skolem_term, czer_vars.$el_var_blist$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
        if( NIL != current_sk_bind )
        {
          result = current_sk_bind.first();
        }
        else
        {
          result = skolem_uniquify( sk_var );
        }
      }
    }
    if( NIL == result )
    {
      result = sk_var;
    }
    final SubLObject item_var = ConsesLow.cons( result, skolem_term );
    if( NIL == conses_high.member( item_var, czer_vars.$el_var_blist$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      czer_vars.$el_var_blist$.setDynamicValue( ConsesLow.cons( item_var, czer_vars.$el_var_blist$.getDynamicValue( thread ) ), thread );
    }
    if( NIL != skolems.recomputing_defn_of_skolemP( cycl_utilities.nat_functor( skolem_term ) ) )
    {
      skolems.note_skolem_binding( result, sk_var );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55910L)
  public static SubLObject skolem_uniquify(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $default_skolem_vars$.getGlobalValue();
    SubLObject candidate_var = NIL;
    candidate_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( candidate_var, czer_vars.$el_var_blist$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym104$VARIABLE_BINDING_VARIABLE ) ) )
      {
        return candidate_var;
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate_var = cdolist_list_var.first();
    }
    return czer_main.uniquify( var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56136L)
  public static SubLObject ununiquify_el_var(final SubLObject symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$ununiquify_el_varsP$.getDynamicValue( thread ) )
    {
      return symbol;
    }
    if( NIL == cycl_variables.el_varP( symbol ) )
    {
      return symbol;
    }
    final SubLObject name = cycl_variables.el_var_name( symbol );
    final SubLObject start = string_utilities.char_type_position( Symbols.symbol_function( $sym105$DIGIT_CHAR_P ), name, UNPROVIDED, UNPROVIDED );
    final SubLObject end = ( NIL != start ) ? string_utilities.char_type_position( Symbols.symbol_function( $sym106$NOT_DIGIT_CHAR_P ), name, start, UNPROVIDED ) : NIL;
    SubLObject result = NIL;
    if( NIL != start && NIL == end && start.numG( ZERO_INTEGER ) )
    {
      if( NIL != Characters.alpha_char_p( Vectors.aref( name, Numbers.subtract( start, ONE_INTEGER ) ) ) )
      {
        result = cycl_variables.make_el_var( string_utilities.substring( name, ZERO_INTEGER, start ) );
      }
      else
      {
        result = cycl_variables.make_el_var( string_utilities.substring( name, ZERO_INTEGER, Numbers.subtract( start, ONE_INTEGER ) ) );
      }
    }
    if( NIL == result )
    {
      return symbol;
    }
    if( NIL != ununiquification_conflictP( symbol, result ) )
    {
      return symbol;
    }
    remember_ununiquified_el_var( symbol, result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57015L)
  public static SubLObject remember_ununiquified_el_var(final SubLObject old, final SubLObject v_new)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    if( NIL != dictionary.dictionary_p( $ununiquified_el_vars$.getDynamicValue( thread ) ) )
    {
      okP = dictionary.dictionary_enter( $ununiquified_el_vars$.getDynamicValue( thread ), old, v_new );
      if( NIL != okP && !old.eql( v_new ) )
      {
        okP = dictionary.dictionary_enter( $ununiquified_el_vars$.getDynamicValue( thread ), v_new, $kw107$UNUNUNIQUIFIABLE );
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57341L)
  public static SubLObject ununiquification_conflictP(final SubLObject old, final SubLObject v_new)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( old.eql( v_new ) )
    {
      return NIL;
    }
    if( NIL != dictionary.dictionary_p( $ununiquified_el_vars$.getDynamicValue( thread ) ) )
    {
      final SubLObject old_renamed = dictionary.dictionary_lookup( $ununiquified_el_vars$.getDynamicValue( thread ), old, UNPROVIDED );
      final SubLObject new_renamed = dictionary.dictionary_lookup( $ununiquified_el_vars$.getDynamicValue( thread ), v_new, UNPROVIDED );
      return makeBoolean( old_renamed.eql( $kw107$UNUNUNIQUIFIABLE ) || ( NIL != new_renamed && !old_renamed.eql( v_new ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57849L)
  public static SubLObject skolem_el_cnfs_from_assertions(final SubLObject skolem, SubLObject mt, final SubLObject min_mt)
  {
    final SubLObject assertions = skolems.skolem_defn_assertions( skolem, UNPROVIDED );
    final SubLObject differing_mts_modeP = makeBoolean( NIL == min_mt && NIL == assertions_in_same_mtP( assertions ) );
    SubLObject cnfs = NIL;
    if( NIL != min_mt )
    {
      mt = min_mt;
    }
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assertion_mt = ( NIL != min_mt ) ? min_mt : assertions_high.assertion_mt( assertion );
      final SubLObject cnf = fi.perform_fi_substitutions( el_utilities.copy_clause( assertions_high.assertion_cnf( assertion ) ), assertions_high.assertion_el_variables( assertion ) );
      final SubLObject nat_lits = index_lits_to_remove( cnf );
      SubLObject pos_lits = conses_high.set_difference( clauses.pos_lits( cnf ), nat_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      SubLObject neg_lits = conses_high.set_difference( clauses.neg_lits( cnf ), nat_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      if( NIL != differing_mts_modeP )
      {
        SubLObject new_pos_lits = NIL;
        SubLObject new_neg_lits = NIL;
        SubLObject cdolist_list_var_$24 = pos_lits;
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var_$24.first();
        while ( NIL != cdolist_list_var_$24)
        {
          new_pos_lits = ConsesLow.cons( possibly_make_ist_sentence( assertion_mt, pos_lit, mt ), new_pos_lits );
          cdolist_list_var_$24 = cdolist_list_var_$24.rest();
          pos_lit = cdolist_list_var_$24.first();
        }
        SubLObject cdolist_list_var_$25 = neg_lits;
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var_$25.first();
        while ( NIL != cdolist_list_var_$25)
        {
          new_neg_lits = ConsesLow.cons( possibly_make_ist_sentence( assertion_mt, neg_lit, mt ), new_neg_lits );
          cdolist_list_var_$25 = cdolist_list_var_$25.rest();
          neg_lit = cdolist_list_var_$25.first();
        }
        pos_lits = new_pos_lits;
        neg_lits = new_neg_lits;
      }
      final SubLObject el_cnfs = unreify_cnfs_nats( ConsesLow.list( clauses.make_cnf( neg_lits, pos_lits ) ), nat_lits, mt );
      cnfs = conses_high.nunion( cnfs, el_cnfs, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return cnfs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59030L)
  public static SubLObject possibly_make_ist_sentence(final SubLObject sentence_mt, final SubLObject sentence, final SubLObject outer_mt)
  {
    final SubLObject result_sentence = ( NIL != hlmt.hlmt_equalP( sentence_mt, outer_mt ) ) ? sentence : el_utilities.make_ist_sentence( sentence_mt, sentence );
    return result_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59273L)
  public static SubLObject assertions_in_same_mtP(final SubLObject assertions)
  {
    SubLObject assertions_in_different_mtsP = NIL;
    SubLObject mt_finder = NIL;
    if( NIL == assertions_in_different_mtsP )
    {
      SubLObject csome_list_var = assertions;
      SubLObject assertion = NIL;
      assertion = csome_list_var.first();
      while ( NIL == assertions_in_different_mtsP && NIL != csome_list_var)
      {
        final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
        if( NIL == mt_finder )
        {
          mt_finder = assertion_mt;
        }
        else if( NIL == hlmt.hlmt_equalP( assertion_mt, mt_finder ) )
        {
          assertions_in_different_mtsP = T;
        }
        csome_list_var = csome_list_var.rest();
        assertion = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == assertions_in_different_mtsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59754L)
  public static SubLObject el_cnfs(final SubLObject cnfs, SubLObject index_lits, SubLObject mt)
  {
    if( index_lits == UNPROVIDED )
    {
      index_lits = el_utilities.tou_lits( list_utilities.mapappend( Symbols.symbol_function( $sym54$NEG_LITS ), cnfs ) );
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el_cnfs = NIL;
    SubLObject el_mt = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_var_blist$.currentBinding( thread );
    try
    {
      czer_vars.$el_var_blist$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject el_cnfs_$26 = unreify_cnfs_terms( cnfs, index_lits, mt );
      final SubLObject el_mt_$27 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      el_cnfs = el_cnfs_$26;
      el_mt = el_mt_$27;
      SubLObject sk_constants = NIL;
      final SubLObject _prev_bind_0_$28 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
      try
      {
        cycl_utilities.$opaque_arg_function$.bind( $sym102$OPAQUE_ARG_WRT_SKOLEM_, thread );
        sk_constants = Mapping.mapcar( $sym108$NAT_FUNCTOR, cycl_utilities.expression_gather( ConsesLow.cons( mt, cnfs ), $sym96$SKOLEM_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0_$28, thread );
      }
      SubLObject cdolist_list_var = index_lits;
      SubLObject index_lit = NIL;
      index_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != term.reified_skolem_termP( conses_high.third( index_lit ) ) )
        {
          sk_constants = ConsesLow.cons( cycl_utilities.nat_functor( conses_high.third( index_lit ) ), sk_constants );
        }
        cdolist_list_var = cdolist_list_var.rest();
        index_lit = cdolist_list_var.first();
      }
      if( NIL != sk_constants )
      {
        final SubLObject min_mt = skolems.skolems_min_mt( sk_constants );
        if( NIL != min_mt )
        {
          el_mt = min_mt;
        }
        final SubLObject arbitrary_sk_constant = sk_constants.first();
        el_cnfs = conses_high.nunion( el_cnfs, skolem_el_cnfs_from_assertions( arbitrary_sk_constant, mt, min_mt ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
    }
    finally
    {
      czer_vars.$el_var_blist$.rebind( _prev_bind_0, thread );
    }
    return Values.values( el_cnfs, el_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60951L)
  public static SubLObject repair_assertion_vars(final SubLObject assertion)
  {
    final SubLObject vars = assertions_high.assertion_el_variables( assertion );
    SubLObject cnf = assertions_high.assertion_cnf( assertion );
    SubLObject cdolist_list_var = vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cnf = conses_high.nsubst( variables.find_variable_by_id( Sequences.position( var, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), var, cnf, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61200L)
  public static SubLObject index_lits_to_remove(final SubLObject clause)
  {
    return ConsesLow.append( tou_lits_to_remove( clause ), evaluate_lits_to_remove( clause ), equals_lits_to_remove( clause ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61380L)
  public static SubLObject tou_lits_to_remove(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject sk_args = NIL;
    SubLObject cdolist_list_var;
    final SubLObject tou_lits = cdolist_list_var = list_utilities.remove_if_not( $sym109$REMOVABLE_TOU_LIT_, el_utilities.tou_lits( clauses.neg_lits( clause ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject tou_lit = NIL;
    tou_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.reified_skolem_termP( el_utilities.literal_arg2( tou_lit, UNPROVIDED ) ) )
      {
        sk_args = conses_high.nunion( sk_args, conses_high.copy_list( cycl_utilities.nat_args( el_utilities.literal_arg2( tou_lit, UNPROVIDED ), UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tou_lit = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding( thread );
    try
    {
      czer_vars.$gathering_quantified_fn_termsP$.bind( T, thread );
      SubLObject cdolist_list_var2 = tou_lits;
      SubLObject tou_lit2 = NIL;
      tou_lit2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != cycl_variables.cyc_varP( el_utilities.literal_arg1( tou_lit2, UNPROVIDED ) ) && NIL == subl_promotions.memberP( el_utilities.literal_arg1( tou_lit2, UNPROVIDED ), sk_args, UNPROVIDED, UNPROVIDED )
            && list_utilities.tree_count( el_utilities.literal_arg1( tou_lit2, UNPROVIDED ), clause, UNPROVIDED, UNPROVIDED ).numG( ONE_INTEGER ) )
        {
          result = ConsesLow.cons( tou_lit2, result );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        tou_lit2 = cdolist_list_var2.first();
      }
    }
    finally
    {
      czer_vars.$gathering_quantified_fn_termsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62022L)
  public static SubLObject removable_tou_litP(final SubLObject asent)
  {
    final SubLObject naut = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject functor = ( NIL != el_utilities.possibly_naut_p( naut ) ) ? cycl_utilities.nat_functor( naut ) : NIL;
    if( NIL != fort_types_interface.reifiable_function_p( functor ) )
    {
      return T;
    }
    if( NIL != forts.fort_p( functor ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62796L)
  public static SubLObject evaluate_lits_to_remove(final SubLObject clause)
  {
    final SubLObject evaluate_lits = el_utilities.evaluate_lits( clauses.neg_lits( clause ) );
    final SubLObject ambiguous_eval_vars = list_utilities.duplicates( Mapping.mapcar( Symbols.symbol_function( $sym110$LITERAL_ARG1 ), evaluate_lits ), UNPROVIDED, UNPROVIDED );
    final SubLObject variables_inside_functions = gather_variables_inside_functions( clause, UNPROVIDED );
    final SubLObject consequent_variable = el_utilities.sentence_free_variables( clauses.pos_lits( clause ), NIL, $sym91$EL_VAR_, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject sk_args = NIL;
    SubLObject cdolist_list_var = evaluate_lits;
    SubLObject evaluate_lit = NIL;
    evaluate_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.reified_skolem_termP( conses_high.third( evaluate_lit ) ) )
      {
        sk_args = conses_high.nunion( sk_args, conses_high.copy_list( cycl_utilities.nat_args( conses_high.third( evaluate_lit ), UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      evaluate_lit = cdolist_list_var.first();
    }
    cdolist_list_var = evaluate_lits;
    evaluate_lit = NIL;
    evaluate_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject evaluate_var = el_utilities.literal_arg1( evaluate_lit, UNPROVIDED );
      if( NIL != cycl_variables.cyc_varP( evaluate_var ) && NIL == subl_promotions.memberP( evaluate_var, sk_args, UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( evaluate_var, ambiguous_eval_vars,
          UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( evaluate_var, variables_inside_functions, UNPROVIDED, UNPROVIDED ) && NIL == subl_promotions.memberP( evaluate_var, consequent_variable, UNPROVIDED,
              UNPROVIDED ) && NIL != relation_evaluation.evaluatable_expressionP( el_utilities.literal_arg2( evaluate_lit, UNPROVIDED ) ) && list_utilities.tree_count( evaluate_var, clause, UNPROVIDED, UNPROVIDED ).numE(
                  TWO_INTEGER ) && NIL == variable_should_not_be_substituted_during_unczeP( evaluate_var, clause ) )
      {
        result = ConsesLow.cons( evaluate_lit, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      evaluate_lit = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63916L)
  public static SubLObject variable_should_not_be_substituted_during_unczeP(final SubLObject variable, final SubLObject clause)
  {
    SubLObject result;
    SubLObject rest;
    SubLObject pos_lit;
    SubLObject relation;
    SubLObject positions;
    SubLObject csome_list_var;
    SubLObject position;
    for( result = NIL, rest = NIL, rest = clauses.pos_lits( clause ); NIL == result && NIL != rest; rest = rest.rest() )
    {
      pos_lit = rest.first();
      relation = el_utilities.literal_arg0( pos_lit, UNPROVIDED );
      positions = cycl_utilities.formula_arg_positions( pos_lit, variable, UNPROVIDED );
      if( NIL == result )
      {
        csome_list_var = positions;
        position = NIL;
        position = csome_list_var.first();
        while ( NIL == result && NIL != csome_list_var)
        {
          if( NIL != czer_utilities.leave_variables_at_el_for_argP( relation, position, UNPROVIDED ) )
          {
            result = T;
          }
          csome_list_var = csome_list_var.rest();
          position = csome_list_var.first();
        }
      }
    }
    SubLObject neg_lit;
    for( rest = NIL, rest = clauses.neg_lits( clause ); NIL == result && NIL != rest; rest = rest.rest() )
    {
      neg_lit = rest.first();
      if( NIL != kb_utilities.kbeq( $const24$evaluate, el_utilities.literal_arg0( neg_lit, UNPROVIDED ) ) && variable.eql( el_utilities.literal_arg2( neg_lit, UNPROVIDED ) ) )
      {
        result = T;
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64589L)
  public static SubLObject gather_variables_inside_functions(final SubLObject clause, SubLObject inside_functionP)
  {
    if( inside_functionP == UNPROVIDED )
    {
      inside_functionP = NIL;
    }
    SubLObject result = NIL;
    if( NIL != inside_functionP && clause.isList() )
    {
      return cycl_utilities.expression_gather( clause, $sym111$EL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != inside_functionP && NIL != cycl_grammar.el_variable_p( clause ) )
    {
      if( NIL == conses_high.member( clause, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( clause, result );
      }
    }
    else if( clause.isList() && NIL != forts.fort_p( cycl_utilities.formula_arg0( clause ) ) && NIL != fort_types_interface.functor_p( cycl_utilities.formula_arg0( clause ) ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( clause, $kw87$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$29 = gather_variables_inside_functions( arg, T );
        SubLObject var = NIL;
        var = cdolist_list_var_$29.first();
        while ( NIL != cdolist_list_var_$29)
        {
          final SubLObject item_var = var;
          if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
          cdolist_list_var_$29 = cdolist_list_var_$29.rest();
          var = cdolist_list_var_$29.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    else if( clause.isList() )
    {
      SubLObject cdolist_list_var2 = cycl_utilities.formula_terms( clause, UNPROVIDED );
      SubLObject item = NIL;
      item = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$30 = gather_variables_inside_functions( item, UNPROVIDED );
        SubLObject var2 = NIL;
        var2 = cdolist_list_var_$30.first();
        while ( NIL != cdolist_list_var_$30)
        {
          final SubLObject item_var2 = var2;
          if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var2, result );
          }
          cdolist_list_var_$30 = cdolist_list_var_$30.rest();
          var2 = cdolist_list_var_$30.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        item = cdolist_list_var2.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65398L)
  public static SubLObject equals_lits_to_remove(final SubLObject clause)
  {
    final SubLObject equals_lits = el_utilities.equals_lits( clauses.neg_lits( clause ) );
    final SubLObject ambiguous_equal_vars = list_utilities.duplicates( Mapping.mapcar( Symbols.symbol_function( $sym110$LITERAL_ARG1 ), equals_lits ), UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject sk_args = NIL;
    SubLObject cdolist_list_var = equals_lits;
    SubLObject equals_lit = NIL;
    equals_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.reified_skolem_termP( conses_high.third( equals_lit ) ) )
      {
        sk_args = conses_high.nunion( sk_args, conses_high.copy_list( cycl_utilities.nat_args( conses_high.third( equals_lit ), UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      equals_lit = cdolist_list_var.first();
    }
    cdolist_list_var = equals_lits;
    equals_lit = NIL;
    equals_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_variables.cyc_varP( el_utilities.literal_arg1( equals_lit, UNPROVIDED ) ) && NIL == subl_promotions.memberP( el_utilities.literal_arg1( equals_lit, UNPROVIDED ), sk_args, UNPROVIDED, UNPROVIDED )
          && NIL == subl_promotions.memberP( el_utilities.literal_arg1( equals_lit, UNPROVIDED ), ambiguous_equal_vars, UNPROVIDED, UNPROVIDED ) && NIL != relation_evaluation.evaluatable_expressionP( el_utilities
              .literal_arg2( equals_lit, UNPROVIDED ) ) && list_utilities.tree_count( el_utilities.literal_arg1( equals_lit, UNPROVIDED ), clause, UNPROVIDED, UNPROVIDED ).numG( ONE_INTEGER ) )
      {
        result = ConsesLow.cons( equals_lit, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      equals_lit = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66158L)
  public static SubLObject uncanonicalize_recursive_query(final SubLObject sentence)
  {
    return uncanonicalize_recursive_query_vars( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66338L)
  public static SubLObject uncanonicalize_recursive_query_vars(SubLObject v_object)
  {
    if( v_object.isCons() )
    {
      v_object = conses_high.copy_tree( v_object );
    }
    return transform_list_utilities.ntransform( v_object, Symbols.symbol_function( $sym112$VARIABLE_P ), Symbols.symbol_function( $sym113$DEFAULT_EL_VAR_FOR_HL_VAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_uncanonicalizer_file()
  {
    SubLFiles.declareMacro( me, "remembering_ununiquified_el_vars", "REMEMBERING-UNUNIQUIFIED-EL-VARS" );
    SubLFiles.declareFunction( me, "assertion_el_formula_memoized_internal", "ASSERTION-EL-FORMULA-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_el_formula_memoized", "ASSERTION-EL-FORMULA-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_el_formula", "ASSERTION-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_elmt", "ASSERTION-ELMT", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_el_ist_formula", "ASSERTION-EL-IST-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "interesting_uncanonicalizationsP", "INTERESTING-UNCANONICALIZATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "fast_fi_not_el_termP", "FAST-FI-NOT-EL-TERM?", 1, 0, false );
    new $fast_fi_not_el_termP$UnaryFunction();
    SubLFiles.declareFunction( me, "potentially_interestingly_uncanonicalizable_tense_termP", "POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?", 1, 0, false );
    new $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction();
    SubLFiles.declareFunction( me, "clear_cached_assertion_el_formula_int", "CLEAR-CACHED-ASSERTION-EL-FORMULA-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_assertion_el_formula_int", "REMOVE-CACHED-ASSERTION-EL-FORMULA-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_assertion_el_formula_int_internal", "CACHED-ASSERTION-EL-FORMULA-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_assertion_el_formula_int", "CACHED-ASSERTION-EL-FORMULA-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_el_formula_int", "ASSERTION-EL-FORMULA-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "unwrap_el_formulas_of_assertions_destructive", "UNWRAP-EL-FORMULAS-OF-ASSERTIONS-DESTRUCTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_assertion_el_formula_int", "NEW-ASSERTION-EL-FORMULA-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cnf_el_formula", "CNF-EL-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "cnfs_el_formula", "CNFS-EL-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "hl_dnfs_to_hl_cnfs", "HL-DNFS-TO-HL-CNFS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_cnfs_to_hl_dnfs", "HL-CNFS-TO-HL-DNFS", 1, 0, false );
    SubLFiles.declareFunction( me, "dnfs_el_formula", "DNFS-EL-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "el_cnfs_to_el_implication", "EL-CNFS-TO-EL-IMPLICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_index_lits_from_cnfs", "REMOVE-INDEX-LITS-FROM-CNFS", 2, 0, false );
    SubLFiles.declareFunction( me, "cnf_intermediate_el_formula", "CNF-INTERMEDIATE-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "dnf_intermediate_el_formula", "DNF-INTERMEDIATE-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "el_version", "EL-VERSION", 1, 1, false );
    SubLFiles.declareFunction( me, "el_explicitify_implicit_meta_literals", "EL-EXPLICITIFY-IMPLICIT-META-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_pragmatic_requirements", "EL-PRAGMATIC-REQUIREMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_pragmatic_requirement", "EL-PRAGMATIC-REQUIREMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "el_exceptions", "EL-EXCEPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_except_for", "EL-EXCEPT-FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "el_except_when", "EL-EXCEPT-WHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "unpackage_cnf_clauses", "UNPACKAGE-CNF-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "unpackage_dnf_clauses", "UNPACKAGE-DNF-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_truesentence_refs", "REMOVE-TRUESENTENCE-REFS", 1, 0, false );
    SubLFiles.declareFunction( me, "true_sentence_vars", "TRUE-SENTENCE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "undo_variables", "UNDO-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "unremove_universals", "UNREMOVE-UNIVERSALS", 1, 0, false );
    SubLFiles.declareFunction( me, "unremove_universals_int", "UNREMOVE-UNIVERSALS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_formula_terms", "INTER-FORMULA-TERMS", 2, 2, false );
    SubLFiles.declareFunction( me, "inter_formula_skolems", "INTER-FORMULA-SKOLEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "some_tree_find", "SOME-TREE-FIND", 2, 2, false );
    SubLFiles.declareFunction( me, "unremove_existentials_and_refd_universals", "UNREMOVE-EXISTENTIALS-AND-REFD-UNIVERSALS", 2, 0, false );
    SubLFiles.declareFunction( me, "undo_skolem_mt", "UNDO-SKOLEM-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "base_kb_ist_sentenceP", "BASE-KB-IST-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "segregate_skolems", "SEGREGATE-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "undo_existentials_and_refd_universals", "UNDO-EXISTENTIALS-AND-REFD-UNIVERSALS", 1, 1, false );
    SubLFiles.declareFunction( me, "init_existentialize_formula", "INIT-EXISTENTIALIZE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "existentialize_formula", "EXISTENTIALIZE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "implications_in", "IMPLICATIONS-IN", 1, 0, false );
    SubLFiles.declareFunction( me, "undo_implications", "UNDO-IMPLICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "implicatable_disjunctionP", "IMPLICATABLE-DISJUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "implicatable_conjunctionP", "IMPLICATABLE-CONJUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "uncanon_dnf_1", "UNCANON-DNF-1", 1, 0, false );
    SubLFiles.declareFunction( me, "naut_formulaP", "NAUT-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "ists_out", "ISTS-OUT", 1, 0, false );
    SubLFiles.declareFunction( me, "simplifiable_ist_expressionP", "SIMPLIFIABLE-IST-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "simplify_ist_expression", "SIMPLIFY-IST-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_leading_universals", "REMOVE-LEADING-UNIVERSALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_free_vars_not_bound_to_skolems", "SENTENCE-FREE-VARS-NOT-BOUND-TO-SKOLEMS", 1, 1, false );
    SubLFiles.declareFunction( me, "add_universal_var_placeholder", "ADD-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "check_for_universal_var_placeholder", "CHECK-FOR-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_universal_var_placeholder", "REMOVE-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "skolem_fn_arg_vars", "SKOLEM-FN-ARG-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_unreified_skolems", "FORMULA-UNREIFIED-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_vars_to_skolem_table", "UNIVERSAL-VARS-TO-SKOLEM-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_skolem_from_universal_vars_to_skolem", "REMOVE-SKOLEM-FROM-UNIVERSAL-VARS-TO-SKOLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "num_args_of_skolem_fn", "NUM-ARGS-OF-SKOLEM-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "order_skolems_inner_to_outer", "ORDER-SKOLEMS-INNER-TO-OUTER", 1, 0, false );
    SubLFiles.declareFunction( me, "nsubst_hl_vars", "NSUBST-HL-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "unreify_cnfs_nats", "UNREIFY-CNFS-NATS", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_skolem_constants", "GATHER-SKOLEM-CONSTANTS", 1, 1, false );
    SubLFiles.declareFunction( me, "unreify_cnfs_terms", "UNREIFY-CNFS-TERMS", 1, 2, false );
    SubLFiles.declareFunction( me, "unreify_cnfs_assertions", "UNREIFY-CNFS-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "wrapped_assertion_el_formula_wrt_mt", "WRAPPED-ASSERTION-EL-FORMULA-WRT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "subst_index_in", "SUBST-INDEX-IN", 2, 0, false );
    SubLFiles.declareFunction( me, "unreify_cnfs_skolem", "UNREIFY-CNFS-SKOLEM", 3, 0, false );
    SubLFiles.declareFunction( me, "expression_subst_skolem", "EXPRESSION-SUBST-SKOLEM", 3, 1, false );
    SubLFiles.declareFunction( me, "sk_fn_arg_wrt", "SK-FN-ARG-WRT", 2, 2, false );
    SubLFiles.declareFunction( me, "sk_var_wrt", "SK-VAR-WRT", 2, 2, false );
    SubLFiles.declareFunction( me, "skolem_uniquify", "SKOLEM-UNIQUIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "ununiquify_el_var", "UNUNIQUIFY-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "remember_ununiquified_el_var", "REMEMBER-UNUNIQUIFIED-EL-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "ununiquification_conflictP", "UNUNIQUIFICATION-CONFLICT?", 2, 0, false );
    SubLFiles.declareFunction( me, "skolem_el_cnfs_from_assertions", "SKOLEM-EL-CNFS-FROM-ASSERTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_ist_sentence", "POSSIBLY-MAKE-IST-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "assertions_in_same_mtP", "ASSERTIONS-IN-SAME-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_cnfs", "EL-CNFS", 1, 2, false );
    SubLFiles.declareFunction( me, "repair_assertion_vars", "REPAIR-ASSERTION-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "index_lits_to_remove", "INDEX-LITS-TO-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "tou_lits_to_remove", "TOU-LITS-TO-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "removable_tou_litP", "REMOVABLE-TOU-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_lits_to_remove", "EVALUATE-LITS-TO-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_should_not_be_substituted_during_unczeP", "VARIABLE-SHOULD-NOT-BE-SUBSTITUTED-DURING-UNCZE?", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_variables_inside_functions", "GATHER-VARIABLES-INSIDE-FUNCTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "equals_lits_to_remove", "EQUALS-LITS-TO-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "uncanonicalize_recursive_query", "UNCANONICALIZE-RECURSIVE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "uncanonicalize_recursive_query_vars", "UNCANONICALIZE-RECURSIVE-QUERY-VARS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_uncanonicalizer_file()
  {
    $ununiquified_el_vars$ = SubLFiles.defparameter( "*UNUNIQUIFIED-EL-VARS*", NIL );
    $cache_el_formulaP$ = SubLFiles.defparameter( "*CACHE-EL-FORMULA?*", NIL );
    $potentially_interestingly_uncanonicalizable_tense_terms$ = SubLFiles.deflexical( "*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*", $list28 );
    $cached_assertion_el_formula_int_caching_state$ = SubLFiles.deflexical( "*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*", NIL );
    $retain_leading_universals$ = SubLFiles.defparameter( "*RETAIN-LEADING-UNIVERSALS*", NIL );
    $vars_to_universalize$ = SubLFiles.defparameter( "*VARS-TO-UNIVERSALIZE*", NIL );
    $universal_vars_to_skolem$ = SubLFiles.defparameter( "*UNIVERSAL-VARS-TO-SKOLEM*", NIL );
    $uncanonicalizer_dnf_threshold$ = SubLFiles.defparameter( "*UNCANONICALIZER-DNF-THRESHOLD*", FIVE_INTEGER );
    $default_skolem_vars$ = SubLFiles.deflexical( "*DEFAULT-SKOLEM-VARS*", $list103 );
    return NIL;
  }

  public static SubLObject setup_uncanonicalizer_file()
  {
    memoization_state.note_memoized_function( $sym7$ASSERTION_EL_FORMULA_MEMOIZED );
    utilities_macros.register_cyc_api_function( $sym11$ASSERTION_EL_FORMULA, $list12, $str13$Return_the_EL_formula_for_ASSERTI, $list14, $list15 );
    utilities_macros.register_cyc_api_function( $sym16$ASSERTION_EL_IST_FORMULA, $list12, $str17$Return_the_el_formula_in___ist_fo, $list14, $list18 );
    memoization_state.note_globally_cached_function( $sym29$CACHED_ASSERTION_EL_FORMULA_INT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_uncanonicalizer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_uncanonicalizer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_uncanonicalizer_file();
  }
  static
  {
    me = new uncanonicalizer();
    $ununiquified_el_vars$ = null;
    $cache_el_formulaP$ = null;
    $potentially_interestingly_uncanonicalizable_tense_terms$ = null;
    $cached_assertion_el_formula_int_caching_state$ = null;
    $retain_leading_universals$ = null;
    $vars_to_universalize$ = null;
    $universal_vars_to_skolem$ = null;
    $uncanonicalizer_dnf_threshold$ = null;
    $default_skolem_vars$ = null;
    $list0 = ConsesLow.list( makeSymbol( "CNF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "*UNUNIQUIFIED-EL-VARS*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ) );
    $sym3$CDOLIST = makeSymbol( "CDOLIST" );
    $sym4$VAR = makeSymbol( "VAR" );
    $sym5$CLAUSE_VARIABLES = makeSymbol( "CLAUSE-VARIABLES" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "REMEMBER-UNUNIQUIFIED-EL-VAR" ), makeSymbol( "VAR" ), makeSymbol( "VAR" ) ) );
    $sym7$ASSERTION_EL_FORMULA_MEMOIZED = makeSymbol( "ASSERTION-EL-FORMULA-MEMOIZED" );
    $sym8$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym9$SKOLEM_FUNCTION_P = makeSymbol( "SKOLEM-FUNCTION-P" );
    $sym10$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym11$ASSERTION_EL_FORMULA = makeSymbol( "ASSERTION-EL-FORMULA" );
    $list12 = ConsesLow.list( makeSymbol( "ASSERTION" ) );
    $str13$Return_the_EL_formula_for_ASSERTI = makeString( "Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL." );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ) );
    $list15 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym16$ASSERTION_EL_IST_FORMULA = makeSymbol( "ASSERTION-EL-IST-FORMULA" );
    $str17$Return_the_el_formula_in___ist_fo = makeString( "Return the el formula in #$ist format for ASSERTION." );
    $list18 = ConsesLow.list( makeSymbol( "CONSP" ) );
    $sym19$FAST_FI_NOT_EL_TERM_ = makeSymbol( "FAST-FI-NOT-EL-TERM?" );
    $sym20$FAST_REIFIED_SKOLEM_ = makeSymbol( "FAST-REIFIED-SKOLEM?" );
    $sym21$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_ = makeSymbol( "POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?" );
    $sym22$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol( "QUOTED-TERM-WITH-HL-VAR?" );
    $const23$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const24$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $const25$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const26$SkolemFunctionFn = constant_handles.reader_make_constant_shell( makeString( "SkolemFunctionFn" ) );
    $const27$trueSentence = constant_handles.reader_make_constant_shell( makeString( "trueSentence" ) );
    $list28 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn" ) ) );
    $sym29$CACHED_ASSERTION_EL_FORMULA_INT = makeSymbol( "CACHED-ASSERTION-EL-FORMULA-INT" );
    $sym30$_CACHED_ASSERTION_EL_FORMULA_INT_CACHING_STATE_ = makeSymbol( "*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*" );
    $int31$2048 = makeInteger( 2048 );
    $int32$1024 = makeInteger( 1024 );
    $kw33$FALSE = makeKeyword( "FALSE" );
    $list34 = ConsesLow.list( makeKeyword( "TREE-FIND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UncanonicalizerAssertionFn" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "SubLQuoteFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EL-FORMULA" ) ) ) ) );
    $sym35$EL_FORMULA = makeSymbol( "EL-FORMULA" );
    $const36$UncanonicalizerAssertionFn = constant_handles.reader_make_constant_shell( makeString( "UncanonicalizerAssertionFn" ) );
    $const37$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $sym38$INDEX_LITS_TO_REMOVE = makeSymbol( "INDEX-LITS-TO-REMOVE" );
    $sym39$DNF_LITERALS = makeSymbol( "DNF-LITERALS" );
    $sym40$CLAUSE_FROM_EL_LITERALS = makeSymbol( "CLAUSE-FROM-EL-LITERALS" );
    $sym41$CNF_LITERALS = makeSymbol( "CNF-LITERALS" );
    $const42$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "meetsPragmaticRequirement" ) );
    $list43 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $list44 = ConsesLow.list( makeSymbol( "PRAG-PRED" ), makeSymbol( "VAR-LIST" ), makeSymbol( "ASSERTION" ) );
    $sym45$NEGATE = makeSymbol( "NEGATE" );
    $const46$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const47$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const48$pragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "pragmaticRequirement" ) );
    $const49$abnormal = constant_handles.reader_make_constant_shell( makeString( "abnormal" ) );
    $list50 = ConsesLow.list( makeSymbol( "AB-PRED" ), makeSymbol( "EXCEPTION-LIST" ), makeSymbol( "ASSERTION" ) );
    $sym51$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $const52$exceptFor = constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) );
    $const53$exceptWhen = constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) );
    $sym54$NEG_LITS = makeSymbol( "NEG-LITS" );
    $const55$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $sym56$NEGATE_ATOMIC = makeSymbol( "NEGATE-ATOMIC" );
    $sym57$REMOVE_TRUESENTENCE_REFS = makeSymbol( "REMOVE-TRUESENTENCE-REFS" );
    $list58 = ConsesLow.list( makeSymbol( "QUANTIFIER" ), makeSymbol( "VAR" ), makeSymbol( "SUBSENT" ) );
    $list59 = ConsesLow.list( makeSymbol( "QUANTIFIER" ), makeSymbol( "N" ), makeSymbol( "VAR" ), makeSymbol( "SUBSENT" ) );
    $list60 = ConsesLow.list( makeSymbol( "NEG-FORM" ), makeSymbol( "NEW-FORMULA" ) );
    $str61$unanticipated_formula___s = makeString( "unanticipated formula: ~s" );
    $sym62$TRUE_SENTENCE_VARS = makeSymbol( "TRUE-SENTENCE-VARS" );
    $sym63$UNDO_VARIABLES = makeSymbol( "UNDO-VARIABLES" );
    $str64$_S_is_not_well_formed_ = makeString( "~S is not well formed." );
    $const65$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $sym66$UNREMOVE_UNIVERSALS_INT = makeSymbol( "UNREMOVE-UNIVERSALS-INT" );
    $const67$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym68$UNREIFIED_SKOLEM_TERM_ = makeSymbol( "UNREIFIED-SKOLEM-TERM?" );
    $sym69$UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS = makeSymbol( "UNDO-EXISTENTIALS-AND-REFD-UNIVERSALS" );
    $const70$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const71$IntervalMinFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMinFn" ) );
    $const72$thereExistAtLeast = constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) );
    $const73$IntervalMaxFn = constant_handles.reader_make_constant_shell( makeString( "IntervalMaxFn" ) );
    $const74$thereExistAtMost = constant_handles.reader_make_constant_shell( makeString( "thereExistAtMost" ) );
    $const75$Integer = constant_handles.reader_make_constant_shell( makeString( "Integer" ) );
    $const76$thereExistExactly = constant_handles.reader_make_constant_shell( makeString( "thereExistExactly" ) );
    $const77$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
    $list78 = ConsesLow.list( makeSymbol( "UNIT" ), makeSymbol( "MIN" ), makeSymbol( "MAX" ) );
    $const79$PlusInfinity = constant_handles.reader_make_constant_shell( makeString( "PlusInfinity" ) );
    $const80$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $sym81$UNDO_IMPLICATIONS = makeSymbol( "UNDO-IMPLICATIONS" );
    $sym82$UNCANON_DNF_1 = makeSymbol( "UNCANON-DNF-1" );
    $str83$_s_is_not_well_formed_ = makeString( "~s is not well formed." );
    $sym84$IST_SENTENCE_P = makeSymbol( "IST-SENTENCE-P" );
    $sym85$SIMPLIFIABLE_IST_EXPRESSION_ = makeSymbol( "SIMPLIFIABLE-IST-EXPRESSION?" );
    $sym86$SIMPLIFY_IST_EXPRESSION = makeSymbol( "SIMPLIFY-IST-EXPRESSION" );
    $kw87$IGNORE = makeKeyword( "IGNORE" );
    $str88$unable_to_simplify___ist_expressi = makeString( "unable to simplify #$ist expression ~s" );
    $sym89$REMOVE_LEADING_UNIVERSALS = makeSymbol( "REMOVE-LEADING-UNIVERSALS" );
    $sym90$SKOLEM_FUNCTION_VAR = makeSymbol( "SKOLEM-FUNCTION-VAR" );
    $sym91$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym92$SKOLEM_NUMBER = makeSymbol( "SKOLEM-NUMBER" );
    $sym93$_ = makeSymbol( ">" );
    $sym94$NUM_ARGS_OF_SKOLEM_FN = makeSymbol( "NUM-ARGS-OF-SKOLEM-FN" );
    $sym95$TERM_OF_UNIT = makeSymbol( "TERM-OF-UNIT" );
    $sym96$SKOLEM_CONSTANT_ = makeSymbol( "SKOLEM-CONSTANT?" );
    $sym97$NART_P = makeSymbol( "NART-P" );
    $sym98$REIFIED_SKOLEM_CONSTANT_TERM_ = makeSymbol( "REIFIED-SKOLEM-CONSTANT-TERM?" );
    $sym99$FIND_NART = makeSymbol( "FIND-NART" );
    $sym100$KB_ASSERTION_ = makeSymbol( "KB-ASSERTION?" );
    $sym101$WRAPPED_ASSERTION_EL_FORMULA_WRT_MT = makeSymbol( "WRAPPED-ASSERTION-EL-FORMULA-WRT-MT" );
    $sym102$OPAQUE_ARG_WRT_SKOLEM_ = makeSymbol( "OPAQUE-ARG-WRT-SKOLEM?" );
    $list103 = ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z" ), makeSymbol( "?A" ), makeSymbol( "?B" ), makeSymbol( "?C" ), makeSymbol( "?D" ), makeSymbol( "?E" ) );
    $sym104$VARIABLE_BINDING_VARIABLE = makeSymbol( "VARIABLE-BINDING-VARIABLE" );
    $sym105$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $sym106$NOT_DIGIT_CHAR_P = makeSymbol( "NOT-DIGIT-CHAR-P" );
    $kw107$UNUNUNIQUIFIABLE = makeKeyword( "UNUNUNIQUIFIABLE" );
    $sym108$NAT_FUNCTOR = makeSymbol( "NAT-FUNCTOR" );
    $sym109$REMOVABLE_TOU_LIT_ = makeSymbol( "REMOVABLE-TOU-LIT?" );
    $sym110$LITERAL_ARG1 = makeSymbol( "LITERAL-ARG1" );
    $sym111$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $sym112$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym113$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol( "DEFAULT-EL-VAR-FOR-HL-VAR" );
  }

  public static final class $fast_fi_not_el_termP$UnaryFunction
      extends
        UnaryFunction
  {
    public $fast_fi_not_el_termP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FAST-FI-NOT-EL-TERM?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fast_fi_not_el_termP( arg1 );
    }
  }

  public static final class $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction
      extends
        UnaryFunction
  {
    public $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return potentially_interestingly_uncanonicalizable_tense_termP( arg1 );
    }
  }
}
/*
 * 
 * Total time: 828 ms
 * 
 */