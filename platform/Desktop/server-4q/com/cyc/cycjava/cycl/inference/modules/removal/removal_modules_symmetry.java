package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_symmetry
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry";
  public static final String myFingerPrint = "54a5d96f1806cd2df36f44b855a5c031657df7c3f4e85aa268a1fbdb14e9ab0e";
  private static final SubLSymbol $sym0$SYMMETRIC_LITERAL;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw5$DONE;
  private static final SubLSymbol $sym6$SOURCE_FORMULA_VAR;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLSymbol $sym8$PIF;
  private static final SubLSymbol $sym9$EL_BINARY_FORMULA_P;
  private static final SubLSymbol $sym10$SYMMETRIC_ASENT;
  private static final SubLSymbol $sym11$DO_LIST;
  private static final SubLSymbol $sym12$FORMULA_COMMUTATIVE_PERMUTATIONS;
  private static final SubLSymbol $sym13$PUNLESS;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$PENETRATE_ARGS_;
  private static final SubLSymbol $sym17$SOURCE_FORMULA_VAR;
  private static final SubLSymbol $sym18$CANONICAL_COMMUTATIVE_PERMUTATIONS;
  private static final SubLList $list19;
  private static final SubLObject $const20$commutativeInArgs;
  private static final SubLSymbol $kw21$GAF;
  private static final SubLObject $const22$commutativeInArgsAndRest;
  private static final SubLSymbol $kw23$DEPTH;
  private static final SubLSymbol $kw24$STACK;
  private static final SubLSymbol $kw25$QUEUE;
  private static final SubLSymbol $sym26$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw27$ERROR;
  private static final SubLString $str28$_A_is_not_a__A;
  private static final SubLSymbol $sym29$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw30$CERROR;
  private static final SubLString $str31$continue_anyway;
  private static final SubLSymbol $kw32$WARN;
  private static final SubLString $str33$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const34$genlPreds;
  private static final SubLString $str35$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str36$attempting_to_bind_direction_link;
  private static final SubLString $str37$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym38$HL_VAR_;
  private static final SubLSymbol $kw39$GAF_ARG;
  private static final SubLSymbol $kw40$PREDICATE_EXTENT;
  private static final SubLSymbol $kw41$OVERLAP;
  private static final SubLSymbol $kw42$TRUE;
  private static final SubLSymbol $kw43$FALSE;
  private static final SubLSymbol $kw44$NEG;
  private static final SubLSymbol $kw45$GROSSLY_INCOMPLETE;
  private static final SubLSymbol $kw46$INCOMPLETE;
  private static final SubLSymbol $kw47$POS;
  private static final SubLObject $const48$SymmetricBinaryPredicate;
  private static final SubLSymbol $kw49$REMOVAL_SYMMETRIC_LOOKUP_POS;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$REMOVAL_SYMMETRIC_LOOKUP_NEG;
  private static final SubLList $list52;
  private static final SubLObject $const53$CommutativePredicate;
  private static final SubLSymbol $kw54$REMOVAL_COMMUTATIVE_LOOKUP_POS;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$REMOVAL_COMMUTATIVE_LOOKUP_NEG;
  private static final SubLList $list57;
  private static final SubLObject $const58$PartiallyCommutativePredicate;
  private static final SubLSymbol $kw59$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG;
  private static final SubLList $list62;
  private static final SubLObject $const63$AsymmetricBinaryPredicate;
  private static final SubLSymbol $kw64$REMOVAL_ASYMMETRIC_LOOKUP;
  private static final SubLList $list65;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 1084L)
  public static SubLObject symmetric_asent(final SubLObject asent)
  {
    return ConsesLow.list( cycl_utilities.atomic_sentence_predicate( asent ), cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 1308L)
  public static SubLObject symmetric_literal(final SubLObject asent)
  {
    return symmetric_asent( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 1419L)
  public static SubLObject do_formula_commutative_permutations(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject permuted_formula = NIL;
    SubLObject source_formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    permuted_formula = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    source_formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list2 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list2 );
      if( NIL == conses_high.member( current_$1, $list3, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw4$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw5$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject source_formula_var = $sym6$SOURCE_FORMULA_VAR;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( source_formula_var, source_formula ) ), ConsesLow.list( $sym8$PIF, ConsesLow.list( $sym9$EL_BINARY_FORMULA_P, source_formula_var ), ConsesLow.listS(
        $sym7$CLET, ConsesLow.list( ConsesLow.list( permuted_formula, ConsesLow.list( $sym10$SYMMETRIC_ASENT, source_formula_var ) ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym11$DO_LIST, ConsesLow.list(
            permuted_formula, ConsesLow.list( $sym12$FORMULA_COMMUTATIVE_PERMUTATIONS, source_formula_var ), $kw5$DONE, done ), ConsesLow.listS( $sym13$PUNLESS, ConsesLow.list( EQUAL, permuted_formula,
                source_formula_var ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 2037L)
  public static SubLObject do_formula_canonical_commutative_permutations(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject permuted_formula = NIL;
    SubLObject source_formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    permuted_formula = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    source_formula = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
      if( NIL == conses_high.member( current_$2, $list15, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw4$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw5$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject penetrate_argsP_tail = cdestructuring_bind.property_list_member( $kw16$PENETRATE_ARGS_, current );
    final SubLObject penetrate_argsP = ( NIL != penetrate_argsP_tail ) ? conses_high.cadr( penetrate_argsP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject source_formula_var = $sym17$SOURCE_FORMULA_VAR;
    return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( source_formula_var, source_formula ) ), ConsesLow.listS( $sym11$DO_LIST, ConsesLow.list( permuted_formula, ConsesLow.list(
        $sym18$CANONICAL_COMMUTATIVE_PERMUTATIONS, source_formula_var, $list19, penetrate_argsP ), $kw5$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 2501L)
  public static SubLObject commutative_in_args_supports(final SubLObject predicate)
  {
    SubLObject assertions = NIL;
    SubLObject pred_var = $const20$commutativeInArgs;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, ONE_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, NIL, NIL );
            SubLObject done_var_$3 = NIL;
            final SubLObject token_var_$4 = NIL;
            while ( NIL == done_var_$3)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
              final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( ass ) );
              if( NIL != valid_$5 )
              {
                assertions = ConsesLow.cons( ass, assertions );
              }
              done_var_$3 = makeBoolean( NIL == valid_$5 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    pred_var = $const22$commutativeInArgsAndRest;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, ONE_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, NIL, NIL );
            SubLObject done_var_$4 = NIL;
            final SubLObject token_var_$5 = NIL;
            while ( NIL == done_var_$4)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
              final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( ass ) );
              if( NIL != valid_$6 )
              {
                assertions = ConsesLow.cons( ass, assertions );
              }
              done_var_$4 = makeBoolean( NIL == valid_$6 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return Sequences.nreverse( assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 2865L)
  public static SubLObject removal_commutativity_lookup_cost(final SubLObject asent, final SubLObject truth)
  {
    return ( NIL != variables.fully_bound_p( asent ) ) ? removal_commutativity_check_cost( asent, truth ) : removal_commutativity_generate_cost( asent, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 3074L)
  public static SubLObject removal_commutativity_check_cost(final SubLObject asent, final SubLObject truth)
  {
    return control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 3203L)
  public static SubLObject removal_commutativity_generate_cost(final SubLObject asent, final SubLObject truth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cost = ZERO_INTEGER;
    SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations( asent, Symbols.symbol_function( $sym38$HL_VAR_ ), NIL );
    SubLObject permuted_asent = NIL;
    permuted_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred = cycl_utilities.atomic_sentence_predicate( permuted_asent );
      if( NIL != forts.fort_p( pred ) )
      {
        final SubLObject node_var = pred;
        final SubLObject deck_type = $kw25$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym26$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw27$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw30$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str31$continue_anyway, $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw32$WARN ) )
                {
                  Errors.warn( $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str33$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str31$continue_anyway, $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const34$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$15 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject spec_pred = node_var_$15;
                      final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$15 ) )
                        {
                          cost = Numbers.add( cost, kb_indexing.num_best_gaf_lookup_index( el_utilities.replace_formula_arg( ZERO_INTEGER, spec_pred, permuted_asent ), truth, UNPROVIDED ) );
                        }
                        SubLObject cdolist_list_var_$17;
                        final SubLObject accessible_modules = cdolist_list_var_$17 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var_$17.first();
                        while ( NIL != cdolist_list_var_$17)
                        {
                          final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var_$15 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$21;
                                        for( iteration_state_$21 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$21 ); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next( iteration_state_$21 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$21 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str35$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$15, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$21 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$14, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$18;
                              final SubLObject new_list = cdolist_list_var_$18 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$18.first();
                              while ( NIL != cdolist_list_var_$18)
                              {
                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str35$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$16, thread );
                                }
                                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                generating_fn = cdolist_list_var_$18.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$13, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$13, thread );
                          }
                          cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                          module_var = cdolist_list_var_$17.first();
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$12, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$14, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$12, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$11, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str37$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$11, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$10, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$9, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        cost = Numbers.add( cost, kb_indexing.num_best_gaf_lookup_index( permuted_asent, truth, UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      permuted_asent = cdolist_list_var.first();
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 3685L)
  public static SubLObject removal_commutativity_lookup_iterator(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL != forts.fort_p( pred ) )
    {
      final SubLObject node_var = pred;
      final SubLObject deck_type = $kw25$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym26$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw27$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw30$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str31$continue_anyway, $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw32$WARN ) )
              {
                Errors.warn( $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str33$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str31$continue_anyway, $str28$_A_is_not_a__A, tv_var, $sym29$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$28 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$29 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const34$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$32 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject spec_pred = node_var_$32;
                    final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$32 ) )
                      {
                        if( NIL != kb_utilities.kbeq( spec_pred, pred ) )
                        {
                          SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations( asent, Symbols.symbol_function( $sym38$HL_VAR_ ), NIL );
                          SubLObject permuted_asent = NIL;
                          permuted_asent = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            result = ConsesLow.append( result, removal_commutativity_lookup_helper( el_utilities.replace_formula_arg( ZERO_INTEGER, spec_pred, permuted_asent ), sense ) );
                            cdolist_list_var = cdolist_list_var.rest();
                            permuted_asent = cdolist_list_var.first();
                          }
                        }
                        else if( NIL != el_utilities.el_binary_formula_p( asent ) )
                        {
                          final SubLObject permuted_asent2 = symmetric_asent( asent );
                          result = ConsesLow.append( result, removal_commutativity_lookup_helper( el_utilities.replace_formula_arg( ZERO_INTEGER, spec_pred, permuted_asent2 ), sense ) );
                        }
                        else
                        {
                          SubLObject cdolist_list_var = cycl_utilities.formula_commutative_permutations( asent, UNPROVIDED );
                          SubLObject permuted_asent = NIL;
                          permuted_asent = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            if( !permuted_asent.equal( asent ) )
                            {
                              result = ConsesLow.append( result, removal_commutativity_lookup_helper( el_utilities.replace_formula_arg( ZERO_INTEGER, spec_pred, permuted_asent ), sense ) );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            permuted_asent = cdolist_list_var.first();
                          }
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const34$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$30 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$32 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$37;
                                      for( iteration_state_$37 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$37 ); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next( iteration_state_$37 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$37 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str35$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$32, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$37 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$31, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$39;
                            final SubLObject new_list = cdolist_list_var_$39 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$39.first();
                            while ( NIL != cdolist_list_var_$39)
                            {
                              final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str35$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$33, thread );
                              }
                              cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                              generating_fn = cdolist_list_var_$39.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$30, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$30, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$29, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$31, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$29, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$28, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str37$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$28, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$27, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$26, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      SubLObject cdolist_list_var2 = cycl_utilities.canonical_commutative_permutations( asent, Symbols.symbol_function( $sym38$HL_VAR_ ), NIL );
      SubLObject permuted_asent3 = NIL;
      permuted_asent3 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        result = ConsesLow.append( result, removal_commutativity_lookup_helper( permuted_asent3, sense ) );
        cdolist_list_var2 = cdolist_list_var2.rest();
        permuted_asent3 = cdolist_list_var2.first();
      }
    }
    return iteration.new_inference_list_iterator( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 4551L)
  public static SubLObject removal_commutativity_lookup_helper(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( asent, sense );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw39$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$42 = NIL;
                  final SubLObject token_var_$43 = NIL;
                  while ( NIL == done_var_$42)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$43 );
                    final SubLObject valid_$44 = makeBoolean( !token_var_$43.eql( assertion ) );
                    if( NIL != valid_$44 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject v_bindings = unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), T, T );
                      final SubLObject gaf_asent = thread.secondMultipleValue();
                      final SubLObject unify_justification = thread.thirdMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != v_bindings )
                      {
                        result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                      }
                    }
                    done_var_$42 = makeBoolean( NIL == valid_$44 );
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
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$43 = NIL;
                  final SubLObject token_var_$44 = NIL;
                  while ( NIL == done_var_$43)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$44 );
                    final SubLObject valid_$45 = makeBoolean( !token_var_$44.eql( assertion ) );
                    if( NIL != valid_$45 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject v_bindings = unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), T, T );
                      final SubLObject gaf_asent = thread.secondMultipleValue();
                      final SubLObject unify_justification = thread.thirdMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != v_bindings )
                      {
                        result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                      }
                    }
                    done_var_$43 = makeBoolean( NIL == valid_$45 );
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
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( NIL != predicate )
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( sense ), NIL );
                SubLObject done_var_$44 = NIL;
                final SubLObject token_var_$45 = NIL;
                while ( NIL == done_var_$44)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$45 );
                  final SubLObject valid_$46 = makeBoolean( !token_var_$45.eql( assertion ) );
                  if( NIL != valid_$46 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), T, T );
                    final SubLObject gaf_asent = thread.secondMultipleValue();
                    final SubLObject unify_justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != v_bindings )
                    {
                      result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                    }
                  }
                  done_var_$44 = makeBoolean( NIL == valid_$46 );
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
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( sense ), NIL );
                SubLObject done_var_$45 = NIL;
                final SubLObject token_var_$46 = NIL;
                while ( NIL == done_var_$45)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$46 );
                  final SubLObject valid_$47 = makeBoolean( !token_var_$46.eql( assertion ) );
                  if( NIL != valid_$47 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion ), T, T );
                    final SubLObject gaf_asent = thread.secondMultipleValue();
                    final SubLObject unify_justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != v_bindings )
                    {
                      result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                    }
                  }
                  done_var_$45 = makeBoolean( NIL == valid_$47 );
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
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw40$PREDICATE_EXTENT ) )
    {
      final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw21$GAF, enumeration_types.sense_truth( sense ), NIL );
                SubLObject done_var_$46 = NIL;
                final SubLObject token_var_$47 = NIL;
                while ( NIL == done_var_$46)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$47 );
                  final SubLObject valid_$48 = makeBoolean( !token_var_$47.eql( assertion2 ) );
                  if( NIL != valid_$48 && NIL != backward_utilities.direction_is_relevant( assertion2 ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion2 ), T, T );
                    final SubLObject gaf_asent2 = thread.secondMultipleValue();
                    final SubLObject unify_justification2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != v_bindings2 )
                    {
                      result = ConsesLow.cons( ConsesLow.list( v_bindings2, assertion2 ), result );
                    }
                  }
                  done_var_$46 = makeBoolean( NIL == valid_$48 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
        }
      }
    }
    else if( pcase_var.eql( $kw41$OVERLAP ) )
    {
      SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( NIL == enumeration_types.sense_truth( sense ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( sense ) ) ) && NIL != backward_utilities.direction_is_relevant(
            assertion3 ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify( asent, assertions_high.gaf_formula( assertion3 ), T, T );
          final SubLObject gaf_asent3 = thread.secondMultipleValue();
          final SubLObject unify_justification3 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_bindings3 )
          {
            result = ConsesLow.cons( ConsesLow.list( v_bindings3, assertion3 ), result );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion3 = cdolist_list_var.first();
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 5028L)
  public static SubLObject removal_symmetric_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw42$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 5677L)
  public static SubLObject removal_symmetric_lookup_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw43$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 5827L)
  public static SubLObject removal_symmetric_lookup_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw44$NEG ) )
    {
      return $kw45$GROSSLY_INCOMPLETE;
    }
    return $kw46$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 6003L)
  public static SubLObject removal_symmetric_lookup_pos_iterator(final SubLObject asent)
  {
    return removal_commutativity_lookup_iterator( asent, $kw47$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 6126L)
  public static SubLObject removal_symmetric_lookup_neg_iterator(final SubLObject asent)
  {
    return removal_commutativity_lookup_iterator( asent, $kw44$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 6249L)
  public static SubLObject removal_symmetric_supports(final SubLObject assertion)
  {
    final SubLObject predicate = assertions_high.gaf_predicate( assertion );
    return ConsesLow.list( assertion, removal_module_utilities.additional_isa_support( predicate, $const48$SymmetricBinaryPredicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 8333L)
  public static SubLObject removal_commutative_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw42$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 8713L)
  public static SubLObject removal_commutative_lookup_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw43$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 8865L)
  public static SubLObject removal_commutative_lookup_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw44$NEG ) )
    {
      return $kw45$GROSSLY_INCOMPLETE;
    }
    return $kw46$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 9043L)
  public static SubLObject removal_commutative_lookup_pos_iterator(final SubLObject asent)
  {
    return removal_commutativity_lookup_iterator( asent, $kw47$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 9168L)
  public static SubLObject removal_commutative_lookup_neg_iterator(final SubLObject asent)
  {
    return removal_commutativity_lookup_iterator( asent, $kw44$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 9293L)
  public static SubLObject removal_commutative_supports(final SubLObject assertion)
  {
    final SubLObject predicate = assertions_high.gaf_predicate( assertion );
    return ConsesLow.list( assertion, removal_module_utilities.additional_isa_support( predicate, $const53$CommutativePredicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 11760L)
  public static SubLObject removal_partially_commutative_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw42$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 12102L)
  public static SubLObject removal_partially_commutative_lookup_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw43$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 12264L)
  public static SubLObject removal_partially_commutative_lookup_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw44$NEG ) )
    {
      return $kw45$GROSSLY_INCOMPLETE;
    }
    return $kw46$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 12452L)
  public static SubLObject removal_partially_commutative_lookup_pos_iterator(final SubLObject asent)
  {
    return removal_commutativity_lookup_iterator( asent, $kw47$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 12587L)
  public static SubLObject removal_partially_commutative_lookup_neg_iterator(final SubLObject asent)
  {
    return removal_commutativity_lookup_iterator( asent, $kw44$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 12722L)
  public static SubLObject removal_partially_commutative_supports(final SubLObject assertion, final SubLObject asent)
  {
    final SubLObject predicate = assertions_high.gaf_predicate( assertion );
    final SubLObject isa_support = removal_module_utilities.additional_isa_support( predicate, $const58$PartiallyCommutativePredicate );
    SubLObject supports = commutative_in_args_supports( predicate );
    final SubLObject assertion_predicate = assertions_high.gaf_predicate( assertion );
    final SubLObject asent_predicate = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL != forts.fort_p( assertion_predicate ) && NIL != forts.fort_p( asent_predicate ) && NIL == kb_utilities.kbeq( assertion_predicate, asent_predicate ) )
    {
      supports = ConsesLow.cons( removal_module_utilities.make_genl_preds_support( assertion_predicate, asent_predicate ), supports );
    }
    return ConsesLow.append( ConsesLow.list( assertion, isa_support ), supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 15752L)
  public static SubLObject removal_asymmetric_lookup_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost( asent, $kw42$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 16093L)
  public static SubLObject removal_asymmetric_lookup_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw44$NEG ) )
    {
      return $kw45$GROSSLY_INCOMPLETE;
    }
    return $kw46$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 16266L)
  public static SubLObject removal_asymmetric_lookup_iterator(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject symmetric_asent = symmetric_asent( asent );
    final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index( symmetric_asent, $kw47$POS );
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
    if( pcase_var.eql( $kw39$GAF_ARG ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
      final SubLObject argnum = thread.secondMultipleValue();
      final SubLObject predicate = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != argnum )
      {
        if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( $kw47$POS ), NIL );
                  SubLObject done_var_$58 = NIL;
                  final SubLObject token_var_$59 = NIL;
                  while ( NIL == done_var_$58)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$59 );
                    final SubLObject valid_$60 = makeBoolean( !token_var_$59.eql( assertion ) );
                    if( NIL != valid_$60 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject v_bindings = unification_utilities.gaf_asent_unify( symmetric_asent, assertions_high.gaf_formula( assertion ), T, T );
                      final SubLObject gaf_asent = thread.secondMultipleValue();
                      final SubLObject unify_justification = thread.thirdMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != v_bindings )
                      {
                        result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                      }
                    }
                    done_var_$58 = makeBoolean( NIL == valid_$60 );
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
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( $kw47$POS ), NIL );
                  SubLObject done_var_$59 = NIL;
                  final SubLObject token_var_$60 = NIL;
                  while ( NIL == done_var_$59)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$60 );
                    final SubLObject valid_$61 = makeBoolean( !token_var_$60.eql( assertion ) );
                    if( NIL != valid_$61 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject v_bindings = unification_utilities.gaf_asent_unify( symmetric_asent, assertions_high.gaf_formula( assertion ), T, T );
                      final SubLObject gaf_asent = thread.secondMultipleValue();
                      final SubLObject unify_justification = thread.thirdMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != v_bindings )
                      {
                        result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                      }
                    }
                    done_var_$59 = makeBoolean( NIL == valid_$61 );
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
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( NIL != predicate )
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( $kw47$POS ), NIL );
                SubLObject done_var_$60 = NIL;
                final SubLObject token_var_$61 = NIL;
                while ( NIL == done_var_$60)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$61 );
                  final SubLObject valid_$62 = makeBoolean( !token_var_$61.eql( assertion ) );
                  if( NIL != valid_$62 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.gaf_asent_unify( symmetric_asent, assertions_high.gaf_formula( assertion ), T, T );
                    final SubLObject gaf_asent = thread.secondMultipleValue();
                    final SubLObject unify_justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != v_bindings )
                    {
                      result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                    }
                  }
                  done_var_$60 = makeBoolean( NIL == valid_$62 );
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
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$GAF, enumeration_types.sense_truth( $kw47$POS ), NIL );
                SubLObject done_var_$61 = NIL;
                final SubLObject token_var_$62 = NIL;
                while ( NIL == done_var_$61)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$62 );
                  final SubLObject valid_$63 = makeBoolean( !token_var_$62.eql( assertion ) );
                  if( NIL != valid_$63 && NIL != backward_utilities.direction_is_relevant( assertion ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.gaf_asent_unify( symmetric_asent, assertions_high.gaf_formula( assertion ), T, T );
                    final SubLObject gaf_asent = thread.secondMultipleValue();
                    final SubLObject unify_justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != v_bindings )
                    {
                      result = ConsesLow.cons( ConsesLow.list( v_bindings, assertion ), result );
                    }
                  }
                  done_var_$61 = makeBoolean( NIL == valid_$63 );
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
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw40$PREDICATE_EXTENT ) )
    {
      final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw21$GAF, enumeration_types.sense_truth( $kw47$POS ), NIL );
                SubLObject done_var_$62 = NIL;
                final SubLObject token_var_$63 = NIL;
                while ( NIL == done_var_$62)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$63 );
                  final SubLObject valid_$64 = makeBoolean( !token_var_$63.eql( assertion2 ) );
                  if( NIL != valid_$64 && NIL != backward_utilities.direction_is_relevant( assertion2 ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings2 = unification_utilities.gaf_asent_unify( symmetric_asent, assertions_high.gaf_formula( assertion2 ), T, T );
                    final SubLObject gaf_asent2 = thread.secondMultipleValue();
                    final SubLObject unify_justification2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != v_bindings2 )
                    {
                      result = ConsesLow.cons( ConsesLow.list( v_bindings2, assertion2 ), result );
                    }
                  }
                  done_var_$62 = makeBoolean( NIL == valid_$64 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$73, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
        }
      }
    }
    else if( pcase_var.eql( $kw41$OVERLAP ) )
    {
      SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
      SubLObject assertion3 = NIL;
      assertion3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( NIL == enumeration_types.sense_truth( $kw47$POS ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( $kw47$POS ) ) ) && NIL != backward_utilities
            .direction_is_relevant( assertion3 ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings3 = unification_utilities.gaf_asent_unify( symmetric_asent, assertions_high.gaf_formula( assertion3 ), T, T );
          final SubLObject gaf_asent3 = thread.secondMultipleValue();
          final SubLObject unify_justification3 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_bindings3 )
          {
            result = ConsesLow.cons( ConsesLow.list( v_bindings3, assertion3 ), result );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion3 = cdolist_list_var.first();
      }
    }
    else
    {
      kb_mapping_macros.do_gli_method_error( l_index, method );
    }
    if( NIL != result )
    {
      return iteration.new_inference_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 16868L)
  public static SubLObject removal_asymmetric_supports(final SubLObject assertion)
  {
    final SubLObject predicate = assertions_high.gaf_predicate( assertion );
    return ConsesLow.list( assertion, removal_module_utilities.additional_isa_support( predicate, $const63$AsymmetricBinaryPredicate ) );
  }

  public static SubLObject declare_removal_modules_symmetry_file()
  {
    SubLFiles.declareFunction( me, "symmetric_asent", "SYMMETRIC-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "symmetric_literal", "SYMMETRIC-LITERAL", 1, 0, false );
    SubLFiles.declareMacro( me, "do_formula_commutative_permutations", "DO-FORMULA-COMMUTATIVE-PERMUTATIONS" );
    SubLFiles.declareMacro( me, "do_formula_canonical_commutative_permutations", "DO-FORMULA-CANONICAL-COMMUTATIVE-PERMUTATIONS" );
    SubLFiles.declareFunction( me, "commutative_in_args_supports", "COMMUTATIVE-IN-ARGS-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_commutativity_lookup_cost", "REMOVAL-COMMUTATIVITY-LOOKUP-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_commutativity_check_cost", "REMOVAL-COMMUTATIVITY-CHECK-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_commutativity_generate_cost", "REMOVAL-COMMUTATIVITY-GENERATE-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_commutativity_lookup_iterator", "REMOVAL-COMMUTATIVITY-LOOKUP-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_commutativity_lookup_helper", "REMOVAL-COMMUTATIVITY-LOOKUP-HELPER", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_symmetric_lookup_pos_cost", "REMOVAL-SYMMETRIC-LOOKUP-POS-COST", 1, 1, false );
    new $removal_symmetric_lookup_pos_cost$UnaryFunction();
    new $removal_symmetric_lookup_pos_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_symmetric_lookup_neg_cost", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_symmetric_lookup_neg_completeness", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_symmetric_lookup_pos_iterator", "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR", 1, 0, false );
    new $removal_symmetric_lookup_pos_iterator$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_symmetric_lookup_neg_iterator", "REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_symmetric_supports", "REMOVAL-SYMMETRIC-SUPPORTS", 1, 0, false );
    new $removal_symmetric_supports$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_commutative_lookup_pos_cost", "REMOVAL-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_commutative_lookup_neg_cost", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_commutative_lookup_neg_completeness", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_commutative_lookup_pos_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_commutative_lookup_neg_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_commutative_supports", "REMOVAL-COMMUTATIVE-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_partially_commutative_lookup_pos_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_partially_commutative_lookup_neg_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_partially_commutative_lookup_neg_completeness", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_partially_commutative_lookup_pos_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_partially_commutative_lookup_neg_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_partially_commutative_supports", "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_asymmetric_lookup_cost", "REMOVAL-ASYMMETRIC-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_asymmetric_lookup_completeness", "REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_asymmetric_lookup_iterator", "REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_asymmetric_supports", "REMOVAL-ASYMMETRIC-SUPPORTS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_symmetry_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_symmetry_file()
  {
    access_macros.define_obsolete_register( $sym0$SYMMETRIC_LITERAL, $list1 );
    inference_modules.inference_removal_module( $kw49$REMOVAL_SYMMETRIC_LOOKUP_POS, $list50 );
    inference_modules.inference_removal_module( $kw51$REMOVAL_SYMMETRIC_LOOKUP_NEG, $list52 );
    inference_modules.inference_removal_module( $kw54$REMOVAL_COMMUTATIVE_LOOKUP_POS, $list55 );
    inference_modules.inference_removal_module( $kw56$REMOVAL_COMMUTATIVE_LOOKUP_NEG, $list57 );
    inference_modules.inference_removal_module( $kw59$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS, $list60 );
    inference_modules.inference_removal_module( $kw61$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG, $list62 );
    inference_modules.inference_removal_module( $kw64$REMOVAL_ASYMMETRIC_LOOKUP, $list65 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_symmetry_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_symmetry_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_symmetry_file();
  }
  static
  {
    me = new removal_modules_symmetry();
    $sym0$SYMMETRIC_LITERAL = makeSymbol( "SYMMETRIC-LITERAL" );
    $list1 = ConsesLow.list( makeSymbol( "SYMMETRIC-ASENT" ) );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "PERMUTED-FORMULA" ), makeSymbol( "SOURCE-FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list3 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw4$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw5$DONE = makeKeyword( "DONE" );
    $sym6$SOURCE_FORMULA_VAR = makeUninternedSymbol( "SOURCE-FORMULA-VAR" );
    $sym7$CLET = makeSymbol( "CLET" );
    $sym8$PIF = makeSymbol( "PIF" );
    $sym9$EL_BINARY_FORMULA_P = makeSymbol( "EL-BINARY-FORMULA-P" );
    $sym10$SYMMETRIC_ASENT = makeSymbol( "SYMMETRIC-ASENT" );
    $sym11$DO_LIST = makeSymbol( "DO-LIST" );
    $sym12$FORMULA_COMMUTATIVE_PERMUTATIONS = makeSymbol( "FORMULA-COMMUTATIVE-PERMUTATIONS" );
    $sym13$PUNLESS = makeSymbol( "PUNLESS" );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "PERMUTED-FORMULA" ), makeSymbol( "SOURCE-FORMULA" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "PENETRATE-ARGS?" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list15 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "PENETRATE-ARGS?" ) );
    $kw16$PENETRATE_ARGS_ = makeKeyword( "PENETRATE-ARGS?" );
    $sym17$SOURCE_FORMULA_VAR = makeUninternedSymbol( "SOURCE-FORMULA-VAR" );
    $sym18$CANONICAL_COMMUTATIVE_PERMUTATIONS = makeSymbol( "CANONICAL-COMMUTATIVE-PERMUTATIONS" );
    $list19 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "HL-VAR?" ) );
    $const20$commutativeInArgs = constant_handles.reader_make_constant_shell( makeString( "commutativeInArgs" ) );
    $kw21$GAF = makeKeyword( "GAF" );
    $const22$commutativeInArgsAndRest = constant_handles.reader_make_constant_shell( makeString( "commutativeInArgsAndRest" ) );
    $kw23$DEPTH = makeKeyword( "DEPTH" );
    $kw24$STACK = makeKeyword( "STACK" );
    $kw25$QUEUE = makeKeyword( "QUEUE" );
    $sym26$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw27$ERROR = makeKeyword( "ERROR" );
    $str28$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym29$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw30$CERROR = makeKeyword( "CERROR" );
    $str31$continue_anyway = makeString( "continue anyway" );
    $kw32$WARN = makeKeyword( "WARN" );
    $str33$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const34$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str35$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str36$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str37$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym38$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $kw39$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw40$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $kw41$OVERLAP = makeKeyword( "OVERLAP" );
    $kw42$TRUE = makeKeyword( "TRUE" );
    $kw43$FALSE = makeKeyword( "FALSE" );
    $kw44$NEG = makeKeyword( "NEG" );
    $kw45$GROSSLY_INCOMPLETE = makeKeyword( "GROSSLY-INCOMPLETE" );
    $kw46$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw47$POS = makeKeyword( "POS" );
    $const48$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "SymmetricBinaryPredicate" ) );
    $kw49$REMOVAL_SYMMETRIC_LOOKUP_POS = makeKeyword( "REMOVAL-SYMMETRIC-LOOKUP-POS" );
    $list50 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "INFERENCE-SYMMETRIC-PREDICATE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-SYMMETRIC-LOOKUP-POS-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
                makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-SYMMETRIC-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(<symmetric predicate> <whatever> <whatever>)\nfrom (<symmetric predicate> <arg2> <arg1>) assertion" ), makeKeyword( "EXAMPLE" ), makeString( "(#$bordersOn #$Canada #$UnitedStatesOfAmerica)" )
    } );
    $kw51$REMOVAL_SYMMETRIC_LOOKUP_NEG = makeKeyword( "REMOVAL-SYMMETRIC-LOOKUP-NEG" );
    $list52 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "INFERENCE-SYMMETRIC-PREDICATE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-SYMMETRIC-LOOKUP-NEG-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list(
                makeKeyword( "CALL" ), makeSymbol( "REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
                    .list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                            ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                                    makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword(
                                        "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-SYMMETRIC-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (<symmetric predicate> <whatever> <whatever>))\nfrom (#$not (<symmetric predicate> <arg2> <arg1>)) assertion" )
    } );
    $const53$CommutativePredicate = constant_handles.reader_make_constant_shell( makeString( "CommutativePredicate" ) );
    $kw54$REMOVAL_COMMUTATIVE_LOOKUP_POS = makeKeyword( "REMOVAL-COMMUTATIVE-LOOKUP-POS" );
    $list55 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "INFERENCE-COMMUTATIVE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "BINARY-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-COMMUTATIVE-LOOKUP-POS-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                    "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                            ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list(
                                makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                                    makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                        "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-COMMUTATIVE-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                            makeSymbol( "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$collinear <some point> <some other point> <some other other point>)" )
    } );
    $kw56$REMOVAL_COMMUTATIVE_LOOKUP_NEG = makeKeyword( "REMOVAL-COMMUTATIVE-LOOKUP-NEG" );
    $list57 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "INFERENCE-COMMUTATIVE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "BINARY-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword(
                    "CALL" ), makeSymbol( "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                        makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow
                                .list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                                        makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword(
                                            "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-COMMUTATIVE-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not (#$collinear <some point> <some other point> <some other other point>))" )
    } );
    $const58$PartiallyCommutativePredicate = constant_handles.reader_make_constant_shell( makeString( "PartiallyCommutativePredicate" ) );
    $kw59$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS = makeKeyword( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS" );
    $list60 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "BINARY-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
                    makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "ASENT" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion" ),
      makeKeyword( "EXAMPLE" ), makeString( "(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\n    from \n    (distanceBetween Sun PlanetEarth ((Mega Mile) 93))" )
    } );
    $kw61$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG = makeKeyword( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG" );
    $list62 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "BINARY-PREDICATE?" ) ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list(
                    makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                        "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow
                            .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword(
                                "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list(
                                    ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ),
      makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
          makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(not (distanceBetween PlanetEarth Sun (Inch 93)))\n    from \n    (not (distanceBetween Sun PlanetEarth (Inch 93)))" )
    } );
    $const63$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AsymmetricBinaryPredicate" ) );
    $kw64$REMOVAL_ASYMMETRIC_LOOKUP = makeKeyword( "REMOVAL-ASYMMETRIC-LOOKUP" );
    $list65 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "FORT" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "FORT" ) ) ),
        ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-ASYMMETRIC-PREDICATE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ASYMMETRIC-LOOKUP-COST" ),
      makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
          .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ASYMMETRIC-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$not (<asymmetric predicate> <non-fort> <non-fort>))\nfrom (<asymmetric predicate> <arg2> <arg1>) assertion.\nNB: the case in which either arg is a FORT is subsumed by\nnegationInverse modules." ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$northOf #$UnitedStatesOfAmerica #$Canada))" )
    } );
  }

  public static final class $removal_symmetric_lookup_pos_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_symmetric_lookup_pos_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-SYMMETRIC-LOOKUP-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_symmetric_lookup_pos_cost( arg1, $removal_symmetric_lookup_pos_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_symmetric_lookup_pos_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_symmetric_lookup_pos_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-SYMMETRIC-LOOKUP-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_symmetric_lookup_pos_cost( arg1, arg2 );
    }
  }

  public static final class $removal_symmetric_lookup_pos_iterator$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_symmetric_lookup_pos_iterator$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_symmetric_lookup_pos_iterator( arg1 );
    }
  }

  public static final class $removal_symmetric_supports$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_symmetric_supports$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-SYMMETRIC-SUPPORTS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_symmetric_supports( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1384 ms
 * 
 */