package com.cyc.cycjava.cycl.butler;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class example_finder
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.butler.example_finder";
  public static final String myFingerPrint = "494ac896a412c0371ba3841b26f0304333595af54f345c2243d3103a4f37ddf7";
  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 3631L)
  private static SubLSymbol $example_finder_max_predicate_extent$;
  private static final SubLSymbol $sym0$EL_IMPLICATION_P;
  private static final SubLObject $const1$and;
  private static final SubLSymbol $kw2$MAX_NUMBER;
  private static final SubLSymbol $kw3$MAX_TIME;
  private static final SubLInteger $int4$10000;
  private static final SubLSymbol $sym5$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const6$InferencePSC;
  private static final SubLSymbol $kw7$GAF;
  private static final SubLSymbol $sym8$LISTP;
  private static final SubLSymbol $sym9$_;
  private static final SubLSymbol $sym10$GENERALITY_ESTIMATE;
  private static final SubLInteger $int11$50;
  private static final SubLObject $const12$GenericInstanceFn;
  private static final SubLSymbol $sym13$CONSTANT_P;
  private static final SubLSymbol $sym14$EL_VAR_;
  private static final SubLObject $const15$isa;
  private static final SubLObject $const16$genls;
  private static final SubLSymbol $sym17$ALL_SPECS;

  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 1487L)
  public static SubLObject example_bindings_for_rule(final SubLObject rule, final SubLObject mt, SubLObject cut_off, SubLObject how_many)
  {
    if( cut_off == UNPROVIDED )
    {
      cut_off = TWENTY_INTEGER;
    }
    if( how_many == UNPROVIDED )
    {
      how_many = ONE_INTEGER;
    }
    assert NIL != el_utilities.el_implication_p( rule ) : rule;
    if( NIL == el_utilities.referenced_variables( rule, UNPROVIDED ) )
    {
      return rule;
    }
    SubLObject formula = ( NIL != el_utilities.el_conjunction_p( rule ) ) ? cycl_utilities.formula_arg1( rule, UNPROVIDED ) : ConsesLow.list( $const1$and, cycl_utilities.formula_arg1( rule, UNPROVIDED ) );
    final SubLObject item_var = cycl_utilities.formula_arg2( rule, UNPROVIDED );
    if( NIL == conses_high.member( item_var, formula, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      final SubLObject new_cons = ConsesLow.cons( item_var, NIL );
      final SubLObject list = formula;
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        formula = new_cons;
      }
    }
    final SubLObject v_bindings = inference_kernel.new_cyc_query( formula, mt, ConsesLow.list( $kw2$MAX_NUMBER, how_many, $kw3$MAX_TIME, cut_off ) );
    if( NIL == v_bindings )
    {
      final SubLObject cnf = clausifier.clausal_form( rule, mt, UNPROVIDED );
      final SubLObject v_clauses = ConsesLow.append( clauses.pos_lits( cnf.first() ), clauses.neg_lits( cnf.first() ) );
      final SubLObject v_bindings_$1 = example_bindings_for_clauses_list( v_clauses );
      return conses_high.sublis( v_bindings_$1, rule, UNPROVIDED, UNPROVIDED );
    }
    SubLObject candidates = NIL;
    SubLObject cdolist_list_var = list_utilities.randomize_list( v_bindings );
    SubLObject bind = NIL;
    bind = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      candidates = ConsesLow.cons( conses_high.subst( conses_high.sublis( bind, rule, UNPROVIDED, UNPROVIDED ), bind, bind, UNPROVIDED, UNPROVIDED ), candidates );
      cdolist_list_var = cdolist_list_var.rest();
      bind = cdolist_list_var.first();
    }
    if( NIL != list_utilities.lengthLE( candidates, how_many, UNPROVIDED ) )
    {
      return candidates;
    }
    return Sequences.subseq( candidates, ZERO_INTEGER, how_many );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 2506L)
  public static SubLObject example_consequents_for_rule(final SubLObject rule, final SubLObject mt, SubLObject cut_off, SubLObject how_many)
  {
    if( cut_off == UNPROVIDED )
    {
      cut_off = TWENTY_INTEGER;
    }
    if( how_many == UNPROVIDED )
    {
      how_many = ONE_INTEGER;
    }
    assert NIL != el_utilities.el_implication_p( rule ) : rule;
    final SubLObject instantiated_rules = example_bindings_for_rule( rule, mt, cut_off, how_many );
    SubLObject consequents = NIL;
    SubLObject cdolist_list_var = instantiated_rules;
    SubLObject instantiated_rule = NIL;
    instantiated_rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject consequent = cycl_utilities.formula_arg2( instantiated_rule, UNPROVIDED );
      consequents = ConsesLow.cons( consequent, consequents );
      cdolist_list_var = cdolist_list_var.rest();
      instantiated_rule = cdolist_list_var.first();
    }
    return Sequences.nreverse( consequents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 2961L)
  public static SubLObject term_meets_arg_isa_and_arg_genl_constraints(final SubLObject v_term, final SubLObject arg_isa_constraints, final SubLObject arg_genl_constraints)
  {
    SubLObject cdolist_list_var = arg_isa_constraints;
    SubLObject isa_constraint = NIL;
    isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa_constraint && NIL == isa.isa_in_any_mtP( v_term, isa_constraint ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      isa_constraint = cdolist_list_var.first();
    }
    cdolist_list_var = arg_genl_constraints;
    SubLObject genl_constraint = NIL;
    genl_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != genl_constraint && NIL == genls.genl_in_any_mtP( v_term, genl_constraint ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl_constraint = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 3842L)
  public static SubLObject get_example_bindings_from_previous_assertions(final SubLObject var, final SubLObject clauses_list, SubLObject arg_isa_constraints, SubLObject arg_genl_constraints,
      SubLObject max_examples_per_clause)
  {
    if( arg_isa_constraints == UNPROVIDED )
    {
      arg_isa_constraints = NIL;
    }
    if( arg_genl_constraints == UNPROVIDED )
    {
      arg_genl_constraints = NIL;
    }
    if( max_examples_per_clause == UNPROVIDED )
    {
      max_examples_per_clause = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject examples = NIL;
    SubLObject no_narts = NIL;
    SubLObject stop = NIL;
    SubLObject v_term = NIL;
    SubLObject cdolist_list_var = clauses_list;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Sequences.position( var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject index = Sequences.position( var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject examples_per_clause = NIL;
        SubLObject no_narts_per_clause = NIL;
        stop = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_ANY_MT, thread );
          mt_relevance_macros.$mt$.bind( $const6$InferencePSC, thread );
          if( kb_indexing.num_predicate_extent_index( clause.first(), UNPROVIDED ).numL( $example_finder_max_predicate_extent$.getGlobalValue() ) )
          {
            final SubLObject pred_var = clause.first();
            if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
            {
              final SubLObject str = NIL;
              final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding( thread );
              final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
              final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
              final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
              final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
              final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
              final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
              final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
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
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
                SubLObject done_var = stop;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    utilities_macros.note_progress();
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw7$GAF, NIL, NIL );
                      SubLObject done_var_$4 = stop;
                      final SubLObject token_var_$5 = NIL;
                      while ( NIL == done_var_$4)
                      {
                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                        final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( gaf ) );
                        if( NIL != valid_$6 )
                        {
                          v_term = ConsesLow.nth( index, assertions_high.assertion_formula( gaf ) );
                          if( NIL != term_meets_arg_isa_and_arg_genl_constraints( v_term, arg_isa_constraints, arg_genl_constraints ) )
                          {
                            SubLObject item_var = v_term;
                            if( NIL == conses_high.member( item_var, examples_per_clause, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                            {
                              examples_per_clause = ConsesLow.cons( item_var, examples_per_clause );
                            }
                            if( NIL != constant_handles.constant_p( v_term ) )
                            {
                              item_var = v_term;
                              if( NIL == conses_high.member( item_var, no_narts_per_clause, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                              {
                                no_narts_per_clause = ConsesLow.cons( item_var, no_narts_per_clause );
                              }
                            }
                            if( Sequences.length( no_narts_per_clause ).numGE( max_examples_per_clause ) )
                            {
                              stop = T;
                            }
                          }
                        }
                        done_var_$4 = makeBoolean( NIL == valid_$6 || NIL != stop );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != stop );
                }
                utilities_macros.noting_progress_postamble();
              }
              finally
              {
                utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
                utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
                utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
                utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
                utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
                utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$2, thread );
              }
            }
          }
          examples = ConsesLow.append( examples_per_clause, examples );
          no_narts = ConsesLow.append( no_narts_per_clause, no_narts );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    if( NIL != no_narts )
    {
      return no_narts;
    }
    return examples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 5741L)
  public static SubLObject get_example_instance_from_collection_list(final SubLObject collections)
  {
    assert NIL != Types.listp( collections ) : collections;
    if( NIL == collections )
    {
      return NIL;
    }
    SubLObject possibilities = NIL;
    SubLObject no_narts = NIL;
    final SubLObject constraint = ( NIL != list_utilities.singletonP( collections ) ) ? collections.first() : list_utilities.extremal( collections, $sym9$_, $sym10$GENERALITY_ESTIMATE );
    if( NIL != list_utilities.singletonP( collections ) )
    {
      possibilities = isa.sample_leaf_instances( constraint, $int11$50, UNPROVIDED, UNPROVIDED );
      if( NIL == possibilities )
      {
        possibilities = isa.all_fort_instances_in_all_mts( constraint );
      }
      if( NIL == possibilities )
      {
        possibilities = ConsesLow.list( ConsesLow.list( $const12$GenericInstanceFn, constraint ) );
      }
    }
    else
    {
      possibilities = isa.sample_leaf_instances( constraint, $int11$50, UNPROVIDED, UNPROVIDED );
      if( NIL == possibilities )
      {
        possibilities = isa.all_fort_instances_in_all_mts( constraint );
      }
      if( NIL == possibilities )
      {
        possibilities = ConsesLow.list( ConsesLow.list( $const12$GenericInstanceFn, constraint ) );
      }
    }
    no_narts = list_utilities.remove_if_not( $sym13$CONSTANT_P, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != no_narts ) ? list_utilities.random_element( no_narts ) : list_utilities.random_element( possibilities );
  }

  @SubLTranslatedFile.SubL(source = "cycl/butler/example-finder.lisp", position = 7652L)
  public static SubLObject example_bindings_for_clauses_list(final SubLObject v_clauses)
  {
    final SubLObject v_variables = cycl_utilities.formula_gather( v_clauses, $sym14$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject arg_isa_constraints = NIL;
    SubLObject arg_genl_constraints = NIL;
    SubLObject arg_isa_constraints_for_var = NIL;
    SubLObject arg_genl_constraints_for_var = NIL;
    SubLObject index = NIL;
    SubLObject v_bindings = NIL;
    SubLObject example = NIL;
    SubLObject no_narts = NIL;
    SubLObject examples_from_previous = NIL;
    SubLObject cdolist_list_var = v_variables;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      arg_isa_constraints_for_var = NIL;
      arg_genl_constraints_for_var = NIL;
      SubLObject cdolist_list_var_$8 = v_clauses;
      SubLObject clause = NIL;
      clause = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        index = Sequences.position( var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != index )
        {
          arg_isa_constraints_for_var = ConsesLow.append( kb_accessors.argn_isa( clause.first(), index, UNPROVIDED ), arg_isa_constraints_for_var );
          arg_genl_constraints_for_var = ConsesLow.append( kb_accessors.argn_genl( clause.first(), index, UNPROVIDED ), arg_genl_constraints_for_var );
          if( NIL != genl_predicates.genl_predicateP( clause.first(), $const15$isa, UNPROVIDED, UNPROVIDED ) && index.numE( ONE_INTEGER ) && NIL != forts.fort_p( ConsesLow.nth( TWO_INTEGER, clause ) ) )
          {
            arg_isa_constraints_for_var = ConsesLow.cons( ConsesLow.nth( TWO_INTEGER, clause ), arg_isa_constraints_for_var );
          }
          if( NIL != genl_predicates.genl_predicateP( clause.first(), $const16$genls, UNPROVIDED, UNPROVIDED ) && index.numE( ONE_INTEGER ) && NIL != forts.fort_p( ConsesLow.nth( TWO_INTEGER, clause ) ) )
          {
            arg_genl_constraints_for_var = ConsesLow.cons( ConsesLow.nth( TWO_INTEGER, clause ), arg_genl_constraints_for_var );
          }
          index = NIL;
        }
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        clause = cdolist_list_var_$8.first();
      }
      SubLObject new_cons = ConsesLow.cons( genls.min_cols( arg_isa_constraints_for_var, UNPROVIDED, UNPROVIDED ), NIL );
      SubLObject list = arg_isa_constraints;
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        arg_isa_constraints = new_cons;
      }
      new_cons = ConsesLow.cons( genls.min_cols( arg_genl_constraints_for_var, UNPROVIDED, UNPROVIDED ), NIL );
      list = arg_genl_constraints;
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        arg_genl_constraints = new_cons;
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject specs;
    SubLObject possibilities;
    SubLObject cdolist_list_var2;
    SubLObject spec;
    for( cdotimes_end_var = Sequences.length( v_variables ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      examples_from_previous = get_example_bindings_from_previous_assertions( ConsesLow.nth( i, v_variables ), v_clauses, ConsesLow.nth( i, arg_isa_constraints ), ConsesLow.nth( i, arg_genl_constraints ), UNPROVIDED );
      if( NIL != examples_from_previous )
      {
        example = list_utilities.random_element( examples_from_previous );
      }
      else if( NIL == ConsesLow.nth( i, arg_genl_constraints ) && NIL == ConsesLow.nth( i, arg_isa_constraints ) )
      {
        example = ConsesLow.nth( i, v_variables );
      }
      else if( NIL == ConsesLow.nth( i, arg_genl_constraints ) )
      {
        example = get_example_instance_from_collection_list( ConsesLow.nth( i, arg_isa_constraints ) );
        if( NIL == example )
        {
          example = ConsesLow.nth( i, v_variables );
        }
      }
      else
      {
        specs = list_utilities.intersect_all( Mapping.mapcar( $sym17$ALL_SPECS, ConsesLow.nth( i, arg_genl_constraints ) ), UNPROVIDED, UNPROVIDED );
        possibilities = NIL;
        cdolist_list_var2 = specs;
        spec = NIL;
        spec = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL != ConsesLow.nth( i, arg_isa_constraints ) && NIL != isa.all_isaP( spec, ConsesLow.nth( i, arg_isa_constraints ), UNPROVIDED, UNPROVIDED ) )
          {
            possibilities = ConsesLow.cons( spec, possibilities );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          spec = cdolist_list_var2.first();
        }
        if( NIL != possibilities )
        {
          no_narts = list_utilities.remove_if_not( $sym13$CONSTANT_P, possibilities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          possibilities = ( ( NIL != no_narts ) ? no_narts : possibilities );
        }
        if( NIL == possibilities )
        {
          if( NIL != list_utilities.singletonP( arg_genl_constraints ) )
          {
            no_narts = list_utilities.remove_if_not( $sym13$CONSTANT_P, specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            possibilities = ( ( NIL != specs ) ? ( ( NIL != no_narts ) ? no_narts : specs ) : get_example_instance_from_collection_list( ConsesLow.nth( i, arg_isa_constraints ) ) );
          }
          else
          {
            possibilities = genls.all_specs( list_utilities.extremal( ConsesLow.nth( i, arg_genl_constraints ), $sym9$_, $sym10$GENERALITY_ESTIMATE ), UNPROVIDED, UNPROVIDED );
            if( NIL == possibilities )
            {
              possibilities = genls.union_all_specs( ConsesLow.nth( i, arg_genl_constraints ), UNPROVIDED, UNPROVIDED );
            }
            if( NIL == specs )
            {
              possibilities = get_example_instance_from_collection_list( ConsesLow.nth( i, arg_isa_constraints ) );
            }
          }
        }
        example = ( ( NIL != possibilities ) ? list_utilities.random_element( possibilities ) : ConsesLow.nth( i, v_variables ) );
      }
      v_bindings = ConsesLow.cons( ConsesLow.cons( ConsesLow.nth( i, v_variables ), example ), v_bindings );
    }
    return v_bindings;
  }

  public static SubLObject declare_example_finder_file()
  {
    SubLFiles.declareFunction( me, "example_bindings_for_rule", "EXAMPLE-BINDINGS-FOR-RULE", 2, 2, false );
    SubLFiles.declareFunction( me, "example_consequents_for_rule", "EXAMPLE-CONSEQUENTS-FOR-RULE", 2, 2, false );
    SubLFiles.declareFunction( me, "term_meets_arg_isa_and_arg_genl_constraints", "TERM-MEETS-ARG-ISA-AND-ARG-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_example_bindings_from_previous_assertions", "GET-EXAMPLE-BINDINGS-FROM-PREVIOUS-ASSERTIONS", 2, 3, false );
    SubLFiles.declareFunction( me, "get_example_instance_from_collection_list", "GET-EXAMPLE-INSTANCE-FROM-COLLECTION-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "example_bindings_for_clauses_list", "EXAMPLE-BINDINGS-FOR-CLAUSES-LIST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_example_finder_file()
  {
    $example_finder_max_predicate_extent$ = SubLFiles.deflexical( "*EXAMPLE-FINDER-MAX-PREDICATE-EXTENT*", $int4$10000 );
    return NIL;
  }

  public static SubLObject setup_example_finder_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_example_finder_file();
  }

  @Override
  public void initializeVariables()
  {
    init_example_finder_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_example_finder_file();
  }
  static
  {
    me = new example_finder();
    $example_finder_max_predicate_extent$ = null;
    $sym0$EL_IMPLICATION_P = makeSymbol( "EL-IMPLICATION-P" );
    $const1$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw2$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw3$MAX_TIME = makeKeyword( "MAX-TIME" );
    $int4$10000 = makeInteger( 10000 );
    $sym5$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const6$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw7$GAF = makeKeyword( "GAF" );
    $sym8$LISTP = makeSymbol( "LISTP" );
    $sym9$_ = makeSymbol( "<" );
    $sym10$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $int11$50 = makeInteger( 50 );
    $const12$GenericInstanceFn = constant_handles.reader_make_constant_shell( makeString( "GenericInstanceFn" ) );
    $sym13$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym14$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $const15$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const16$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym17$ALL_SPECS = makeSymbol( "ALL-SPECS" );
  }
}
/*
 * 
 * Total time: 245 ms
 * 
 */