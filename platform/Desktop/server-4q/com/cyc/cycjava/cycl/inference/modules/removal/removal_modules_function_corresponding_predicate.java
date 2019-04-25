package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
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
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.nart_handles;
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
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_function_corresponding_predicate
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate";
  public static final String myFingerPrint = "795abd12108bf40c2d27c9cc2d8d065e6038b964c3e321fd6d558ccbb2b63e14";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 922L)
  public static SubLSymbol $use_fcp_removal_moduleP$;
  private static final SubLSymbol $sym0$_USE_FCP_REMOVAL_MODULE__;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$FCP_PRED;
  private static final SubLSymbol $sym3$PWHEN;
  private static final SubLSymbol $sym4$INDEXED_TERM_P;
  private static final SubLSymbol $sym5$DO_ALL_SPEC_PREDICATES;
  private static final SubLObject $const6$functionCorrespondingPredicate_Ca;
  private static final SubLSymbol $sym7$DO_GAF_ARG_INDEX;
  private static final SubLSymbol $kw8$INDEX;
  private static final SubLSymbol $kw9$PREDICATE;
  private static final SubLSymbol $kw10$TRUTH;
  private static final SubLSymbol $kw11$TRUE;
  private static final SubLSymbol $kw12$DONE;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw16$SUPPORT_ASSERTION;
  private static final SubLSymbol $sym17$DO_GAF_ARG_INDEX_GP;
  private static final SubLSymbol $sym18$CLET;
  private static final SubLSymbol $sym19$GAF_ARG1;
  private static final SubLSymbol $sym20$GAF_ARG3;
  private static final SubLSymbol $sym21$EVALUATABLE_FUNCTION_P;
  private static final SubLSymbol $sym22$SUPPORT_ASSERTION;
  private static final SubLSymbol $sym23$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS;
  private static final SubLSymbol $kw24$REMOVAL_FCP_UNIFY;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$RELEVANT_PRED_IS_SPEC_PRED;
  private static final SubLSymbol $kw27$GAF;
  private static final SubLSymbol $sym28$RELEVANT_PRED_IS_SPEC_INVERSE;
  private static final SubLSymbol $kw29$IGNORE;
  private static final SubLSymbol $kw30$DOOMED;
  private static final SubLSymbol $kw31$DISALLOWED;
  private static final SubLSymbol $kw32$GROSSLY_DISPREFERRED;
  private static final SubLSymbol $kw33$DISPREFERRED;
  private static final SubLSymbol $sym34$SHOULD_BIND_ALL_BUT_FUNCTIONAL_IN_ARG_POSITION;
  private static final SubLSymbol $kw35$DEPTH;
  private static final SubLSymbol $kw36$STACK;
  private static final SubLSymbol $kw37$QUEUE;
  private static final SubLSymbol $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw39$ERROR;
  private static final SubLString $str40$_A_is_not_a__A;
  private static final SubLSymbol $sym41$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw42$CERROR;
  private static final SubLString $str43$continue_anyway;
  private static final SubLSymbol $kw44$WARN;
  private static final SubLString $str45$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const46$genlPreds;
  private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str48$attempting_to_bind_direction_link;
  private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw50$REMOVAL_FCP_CHECK;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$REMOVAL_FCP_FIND_NAT;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$FCP;
  private static final SubLSymbol $kw56$REMOVAL_EVALUATABLE_FCP_UNIFY;
  private static final SubLList $list57;
  private static final SubLObject $const58$evaluate;
  private static final SubLSymbol $kw59$REMOVAL_FCP_WITH_GENL_PREDS_WRT_ARGS;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$OPAQUE;
  private static final SubLObject $const62$genlPredsWRTArgs;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$REMOVAL_FCP_WHERE_FUNCTION_EVALUATABLE;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$_EXIT;
  private static final SubLSymbol $kw70$REMOVAL_FCP_SYNTACTIC;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym73$IGNORE_ERRORS_HANDLER;
  private static final SubLObject $const74$genlFuncs;
  private static final SubLSymbol $kw75$QUERY;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 992L)
  public static SubLObject do_fcp_assertions_for_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fcp_as = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    fcp_as = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    pred = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list1 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject fcp_pred = $sym2$FCP_PRED;
      return ConsesLow.list( $sym3$PWHEN, ConsesLow.list( $sym4$INDEXED_TERM_P, pred ), ConsesLow.list( $sym5$DO_ALL_SPEC_PREDICATES, ConsesLow.list( fcp_pred, $const6$functionCorrespondingPredicate_Ca, NIL, NIL,
          done_var ), ConsesLow.listS( $sym7$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[]
          { fcp_as, pred, $kw8$INDEX, TWO_INTEGER, $kw9$PREDICATE, fcp_pred, $kw10$TRUTH, $kw11$TRUE, $kw12$DONE, done_var
      } ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 1394L)
  public static SubLObject do_corresponding_evaluatable_functions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject function = NIL;
    SubLObject argnum = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    argnum = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list13 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list13 );
      if( NIL == conses_high.member( current_$1, $list14, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw15$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw12$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject support_assertion_tail = cdestructuring_bind.property_list_member( $kw16$SUPPORT_ASSERTION, current );
    final SubLObject support_assertion = ( NIL != support_assertion_tail ) ? conses_high.cadr( support_assertion_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != support_assertion )
    {
      return ConsesLow.list( $sym17$DO_GAF_ARG_INDEX_GP, ConsesLow.list( support_assertion, predicate, $const6$functionCorrespondingPredicate_Ca, $kw8$INDEX, TWO_INTEGER, $kw12$DONE, done ), ConsesLow.list( $sym18$CLET,
          ConsesLow.list( ConsesLow.list( function, ConsesLow.list( $sym19$GAF_ARG1, support_assertion ) ), ConsesLow.list( argnum, ConsesLow.list( $sym20$GAF_ARG3, support_assertion ) ) ), ConsesLow.listS( $sym3$PWHEN,
              ConsesLow.list( $sym21$EVALUATABLE_FUNCTION_P, function ), ConsesLow.append( body, NIL ) ) ) );
    }
    final SubLObject support_assertion_$2 = $sym22$SUPPORT_ASSERTION;
    return ConsesLow.listS( $sym23$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS, ConsesLow.list( function, argnum, predicate, $kw12$DONE, done, $kw16$SUPPORT_ASSERTION, support_assertion_$2 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 2250L)
  public static SubLObject should_bind_all_but_functional_in_arg_position(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject evaluatable_functor_foundP = NIL;
    if( NIL != fcp_canonical_predicateP( pred ) )
    {
      SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
      SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
      try
      {
        pred_relevance_macros.$relevant_pred_function$.bind( $sym26$RELEVANT_PRED_IS_SPEC_PRED, thread );
        pred_relevance_macros.$pred$.bind( $const6$functionCorrespondingPredicate_Ca, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, TWO_INTEGER, pred_var );
          SubLObject done_var = evaluatable_functor_foundP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                SubLObject done_var_$3 = evaluatable_functor_foundP;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( support_assertion ) );
                  if( NIL != valid_$5 )
                  {
                    final SubLObject function = assertions_high.gaf_arg1( support_assertion );
                    final SubLObject argnum = assertions_high.gaf_arg3( support_assertion );
                    if( NIL != fort_types_interface.evaluatable_function_p( function ) && NIL != fort_types_interface.evaluatable_function_p( function ) )
                    {
                      evaluatable_functor_foundP = T;
                    }
                  }
                  done_var_$3 = makeBoolean( NIL == valid_$5 || NIL != evaluatable_functor_foundP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != evaluatable_functor_foundP );
          }
        }
      }
      finally
      {
        pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
        pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != kb_gp_mapping.dgaigp_binaryP( $const6$functionCorrespondingPredicate_Ca ) )
      {
        _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
        _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
        try
        {
          pred_relevance_macros.$relevant_pred_function$.bind( $sym28$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
          pred_relevance_macros.$pred$.bind( $const6$functionCorrespondingPredicate_Ca, thread );
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, arity.binary_arg_swap( TWO_INTEGER ), pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, arity.binary_arg_swap( TWO_INTEGER ), pred_var );
            SubLObject done_var = evaluatable_functor_foundP;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                  SubLObject done_var_$4 = evaluatable_functor_foundP;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( support_assertion ) );
                    if( NIL != valid_$6 )
                    {
                      final SubLObject _prev_bind_0_$7 = kb_gp_mapping.$mapping_arg_swap$.currentBinding( thread );
                      try
                      {
                        kb_gp_mapping.$mapping_arg_swap$.bind( makeBoolean( NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                        final SubLObject function2 = assertions_high.gaf_arg1( support_assertion );
                        final SubLObject argnum2 = assertions_high.gaf_arg3( support_assertion );
                        if( NIL != fort_types_interface.evaluatable_function_p( function2 ) && NIL != fort_types_interface.evaluatable_function_p( function2 ) )
                        {
                          evaluatable_functor_foundP = T;
                        }
                      }
                      finally
                      {
                        kb_gp_mapping.$mapping_arg_swap$.rebind( _prev_bind_0_$7, thread );
                      }
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 || NIL != evaluatable_functor_foundP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != evaluatable_functor_foundP );
            }
          }
        }
        finally
        {
          pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
          pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    final SubLObject strictly_functional_in_arg_positions = cycl_utilities.strictly_functional_in_arg_positions( pred, UNPROVIDED );
    final SubLObject strictly_functional_in_arg_position = ( NIL != list_utilities.singletonP( strictly_functional_in_arg_positions ) ) ? strictly_functional_in_arg_positions.first() : NIL;
    if( NIL != strictly_functional_in_arg_position )
    {
      final SubLObject doomedP = NIL;
      SubLObject disallowedP = NIL;
      SubLObject grossly_dispreferredP = NIL;
      SubLObject dispreferredP = NIL;
      if( NIL == variables.fully_bound_p( cycl_utilities.atomic_sentence_arg( asent, strictly_functional_in_arg_position, UNPROVIDED ) ) )
      {
        SubLObject argnum3 = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( asent, $kw29$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum3 = Numbers.add( argnum3, ONE_INTEGER );
          if( !argnum3.eql( strictly_functional_in_arg_position ) && NIL != variables.not_fully_bound_p( arg ) )
          {
            if( NIL != preference_modules.arg_bindableP( argnum3, asent, bindable_vars ) )
            {
              if( NIL != evaluatable_functor_foundP )
              {
                grossly_dispreferredP = T;
              }
              else
              {
                dispreferredP = T;
              }
            }
            else if( NIL != evaluatable_functor_foundP )
            {
              disallowedP = T;
            }
            else
            {
              grossly_dispreferredP = T;
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
      return ( NIL != doomedP ) ? $kw30$DOOMED
          : ( ( NIL != disallowedP ) ? $kw31$DISALLOWED : ( ( NIL != grossly_dispreferredP ) ? $kw32$GROSSLY_DISPREFERRED : ( ( NIL != dispreferredP ) ? $kw33$DISPREFERRED : NIL ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 4098L)
  public static SubLObject fcp_canonical_predicateP(final SubLObject pred)
  {
    return makeBoolean( NIL != cycl_utilities.reified_term_p( pred ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const6$functionCorrespondingPredicate_Ca, pred, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 4274L)
  public static SubLObject removal_fcp_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject v_bindings = removal_fcp_bindings( asent );
    if( NIL != v_bindings )
    {
      final SubLObject support = removal_fcp_support( asent );
      backward.removal_add_node( support, v_bindings, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 4627L)
  public static SubLObject removal_fcp_check_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != $use_fcp_removal_moduleP$.getGlobalValue() )
    {
      final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
      if( NIL != kb_indexing_datastructures.indexed_term_p( pred ) && NIL == ans )
      {
        final SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
        final SubLObject deck_type = $kw37$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw39$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw42$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw44$WARN ) )
                {
                  Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(
                    UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$15 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const46$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( $const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode
                        && NIL == ans; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$18 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject fcp_pred = node_var_$18;
                      final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$18 ) )
                        {
                          final SubLObject pred_var = fcp_pred;
                          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, TWO_INTEGER, pred_var ) )
                          {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, TWO_INTEGER, pred_var );
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
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                                  SubLObject done_var_$20 = ans;
                                  final SubLObject token_var_$21 = NIL;
                                  while ( NIL == done_var_$20)
                                  {
                                    final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$21 );
                                    final SubLObject valid_$22 = makeBoolean( !token_var_$21.eql( fcp_as ) );
                                    if( NIL != valid_$22 )
                                    {
                                      SubLObject failP = NIL;
                                      final SubLObject nat_argnum = assertions_high.gaf_arg3( fcp_as );
                                      SubLObject argnum = ZERO_INTEGER;
                                      final SubLObject args = cycl_utilities.formula_args( asent, $kw29$IGNORE );
                                      SubLObject rest;
                                      SubLObject arg;
                                      for( rest = NIL, rest = args; NIL == failP && NIL != rest; rest = rest.rest() )
                                      {
                                        arg = rest.first();
                                        argnum = Numbers.add( argnum, ONE_INTEGER );
                                        if( argnum.eql( nat_argnum ) )
                                        {
                                          failP = makeBoolean( NIL == variables.fully_bound_p( arg ) || ( NIL == nart_handles.nart_p( arg ) && NIL == term.nautP( arg, UNPROVIDED ) ) );
                                        }
                                        else
                                        {
                                          failP = makeBoolean( NIL == variables.fully_bound_p( arg ) );
                                        }
                                      }
                                      if( NIL == failP )
                                      {
                                        ans = T;
                                      }
                                    }
                                    done_var_$20 = makeBoolean( NIL == valid_$22 || NIL != ans );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
                                  }
                                }
                              }
                              done_var = makeBoolean( NIL == valid || NIL != ans );
                            }
                          }
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                        SubLObject rest2;
                        SubLObject module_var;
                        SubLObject _prev_bind_0_$17;
                        SubLObject _prev_bind_1_$16;
                        SubLObject node;
                        SubLObject d_link;
                        SubLObject mt_links;
                        SubLObject iteration_state;
                        SubLObject mt;
                        SubLObject tv_links;
                        SubLObject _prev_bind_0_$18;
                        SubLObject iteration_state_$27;
                        SubLObject tv;
                        SubLObject link_nodes;
                        SubLObject _prev_bind_0_$19;
                        SubLObject sol;
                        SubLObject set_contents_var;
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject node_vars_link_node;
                        SubLObject csome_list_var;
                        SubLObject node_vars_link_node2;
                        SubLObject new_list;
                        SubLObject rest_$29;
                        SubLObject generating_fn;
                        SubLObject _prev_bind_0_$20;
                        SubLObject sol2;
                        SubLObject link_nodes2;
                        SubLObject set_contents_var2;
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject node_vars_link_node3;
                        SubLObject csome_list_var2;
                        SubLObject node_vars_link_node4;
                        for( rest2 = NIL, rest2 = accessible_modules; NIL == ans && NIL != rest2; rest2 = rest2.rest() )
                        {
                          module_var = rest2.first();
                          _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$18 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == ans && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        for( iteration_state_$27 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == ans && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$27 ); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next( iteration_state_$27 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$27 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
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
                                                if( NIL == ans )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL == ans && NIL != csome_list_var)
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
                                              }
                                              else
                                              {
                                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$19, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$27 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$18, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$29 = NIL, rest_$29 = new_list; NIL == ans && NIL != rest_$29; rest_$29 = rest_$29.rest() )
                              {
                                generating_fn = rest_$29.first();
                                _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
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
                                    if( NIL == ans )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL == ans && NIL != csome_list_var2)
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
                                  }
                                  else
                                  {
                                    Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$20, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$16, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$17, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$15, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$17, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$15, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$14, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                      UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$14, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$13, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$12, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 5667L)
  public static SubLObject removal_fcp_find_nat_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.indexed_term_p( cycl_utilities.formula_arg0( asent ) ) )
    {
      final SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
      final SubLObject deck_type = $kw37$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$32 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw39$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw42$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw44$WARN ) )
              {
                Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(
                  UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$35 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const46$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck
                      .deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$38 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject fcp_pred = node_var_$38;
                    final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$38 ) )
                      {
                        final SubLObject pred_var = fcp_pred;
                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( cycl_utilities.formula_arg0( asent ), TWO_INTEGER, pred_var ) )
                        {
                          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( cycl_utilities.formula_arg0( asent ), TWO_INTEGER, pred_var );
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                                SubLObject done_var_$40 = NIL;
                                final SubLObject token_var_$41 = NIL;
                                while ( NIL == done_var_$40)
                                {
                                  final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$41 );
                                  final SubLObject valid_$42 = makeBoolean( !token_var_$41.eql( fcp_as ) );
                                  if( NIL != valid_$42 )
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = assertions_high.gaf_args( fcp_as );
                                    SubLObject func = NIL;
                                    SubLObject pred = NIL;
                                    SubLObject argnum = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                                    func = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                                    pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                                    argnum = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      final SubLObject naut = el_utilities.make_el_formula( func, list_utilities.remove_nth( number_utilities.f_1_( argnum ), cycl_utilities.formula_args( asent, UNPROVIDED ) ),
                                          UNPROVIDED );
                                      if( NIL != wff.el_wftP( naut, UNPROVIDED, UNPROVIDED ) )
                                      {
                                        final SubLObject nart = czer_main.cyc_find_or_create_nart( naut, UNPROVIDED );
                                        final SubLObject nart_var = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
                                        thread.resetMultipleValues();
                                        final SubLObject v_bindings = unification_utilities.term_unify( nart_var, nart, T, T );
                                        final SubLObject unify_justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != v_bindings )
                                        {
                                          final SubLObject support_sentence = el_utilities.replace_formula_arg( argnum, nart, asent );
                                          final SubLObject support = removal_fcp_support( support_sentence );
                                          backward.removal_add_node( support, v_bindings, unify_justification );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
                                    }
                                  }
                                  done_var_$40 = makeBoolean( NIL == valid_$42 );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
                                }
                              }
                            }
                            done_var = makeBoolean( NIL == valid );
                          }
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$38 );
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
                                    final SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$47;
                                      for( iteration_state_$47 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$47 ); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next( iteration_state_$47 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$47 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                              Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$39, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$47 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$38, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$49;
                            final SubLObject new_list = cdolist_list_var_$49 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$49.first();
                            while ( NIL != cdolist_list_var_$49)
                            {
                              final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$40, thread );
                              }
                              cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                              generating_fn = cdolist_list_var_$49.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$36, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$37, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$35, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$37, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$35, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$34, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                    UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$34, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$33, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$32, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 6425L)
  public static SubLObject removal_fcp_find_nat_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != $use_fcp_removal_moduleP$.getGlobalValue() )
    {
      final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
      if( NIL != kb_indexing_datastructures.indexed_term_p( pred ) && NIL == ans )
      {
        final SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
        final SubLObject deck_type = $kw37$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw39$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw42$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw44$WARN ) )
                {
                  Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(
                    UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$55 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const46$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( $const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode
                        && NIL == ans; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$58 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject fcp_pred = node_var_$58;
                      final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$58 ) )
                        {
                          final SubLObject pred_var = fcp_pred;
                          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, TWO_INTEGER, pred_var ) )
                          {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, TWO_INTEGER, pred_var );
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
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                                  SubLObject done_var_$60 = ans;
                                  final SubLObject token_var_$61 = NIL;
                                  while ( NIL == done_var_$60)
                                  {
                                    final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$61 );
                                    final SubLObject valid_$62 = makeBoolean( !token_var_$61.eql( fcp_as ) );
                                    if( NIL != valid_$62 )
                                    {
                                      SubLObject failP = NIL;
                                      final SubLObject nat_argnum = assertions_high.gaf_arg3( fcp_as );
                                      SubLObject argnum = ZERO_INTEGER;
                                      final SubLObject args = cycl_utilities.formula_args( asent, $kw29$IGNORE );
                                      SubLObject rest;
                                      SubLObject arg;
                                      for( rest = NIL, rest = args; NIL == failP && NIL != rest; rest = rest.rest() )
                                      {
                                        arg = rest.first();
                                        argnum = Numbers.add( argnum, ONE_INTEGER );
                                        if( argnum.eql( nat_argnum ) )
                                        {
                                          failP = variables.fully_bound_p( arg );
                                        }
                                        else
                                        {
                                          failP = makeBoolean( NIL == variables.fully_bound_p( arg ) );
                                        }
                                      }
                                      if( NIL == failP )
                                      {
                                        ans = T;
                                      }
                                    }
                                    done_var_$60 = makeBoolean( NIL == valid_$62 || NIL != ans );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
                                  }
                                }
                              }
                              done_var = makeBoolean( NIL == valid || NIL != ans );
                            }
                          }
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                        SubLObject rest2;
                        SubLObject module_var;
                        SubLObject _prev_bind_0_$57;
                        SubLObject _prev_bind_1_$56;
                        SubLObject node;
                        SubLObject d_link;
                        SubLObject mt_links;
                        SubLObject iteration_state;
                        SubLObject mt;
                        SubLObject tv_links;
                        SubLObject _prev_bind_0_$58;
                        SubLObject iteration_state_$67;
                        SubLObject tv;
                        SubLObject link_nodes;
                        SubLObject _prev_bind_0_$59;
                        SubLObject sol;
                        SubLObject set_contents_var;
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject node_vars_link_node;
                        SubLObject csome_list_var;
                        SubLObject node_vars_link_node2;
                        SubLObject new_list;
                        SubLObject rest_$69;
                        SubLObject generating_fn;
                        SubLObject _prev_bind_0_$60;
                        SubLObject sol2;
                        SubLObject link_nodes2;
                        SubLObject set_contents_var2;
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject node_vars_link_node3;
                        SubLObject csome_list_var2;
                        SubLObject node_vars_link_node4;
                        for( rest2 = NIL, rest2 = accessible_modules; NIL == ans && NIL != rest2; rest2 = rest2.rest() )
                        {
                          module_var = rest2.first();
                          _prev_bind_0_$57 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$58 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == ans && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        for( iteration_state_$67 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == ans && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$67 ); iteration_state_$67 = dictionary_contents.do_dictionary_contents_next( iteration_state_$67 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$67 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
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
                                                if( NIL == ans )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL == ans && NIL != csome_list_var)
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
                                              }
                                              else
                                              {
                                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$59, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$67 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$58, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$69 = NIL, rest_$69 = new_list; NIL == ans && NIL != rest_$69; rest_$69 = rest_$69.rest() )
                              {
                                generating_fn = rest_$69.first();
                                _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
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
                                    if( NIL == ans )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL == ans && NIL != csome_list_var2)
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
                                  }
                                  else
                                  {
                                    Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$60, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$56, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$57, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$55, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$57, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$55, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$54, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                      UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$54, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$53, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$52, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$61, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 7555L)
  public static SubLObject removal_fcp_support(final SubLObject asent)
  {
    final SubLObject support = arguments.make_hl_support( $kw55$FCP, asent, UNPROVIDED, UNPROVIDED );
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 7686L)
  public static SubLObject removal_fcp_bindings(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    SubLObject supports = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( cycl_utilities.formula_arg0( asent ) ) && NIL == supports )
    {
      final SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
      final SubLObject deck_type = $kw37$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw39$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw42$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw44$WARN ) )
              {
                Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(
                  UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const46$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode
                      && NIL == supports; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$78 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject fcp_pred = node_var_$78;
                    final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$78 ) )
                      {
                        final SubLObject pred_var = fcp_pred;
                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( cycl_utilities.formula_arg0( asent ), TWO_INTEGER, pred_var ) )
                        {
                          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( cycl_utilities.formula_arg0( asent ), TWO_INTEGER, pred_var );
                          SubLObject done_var = supports;
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                                SubLObject done_var_$80 = supports;
                                final SubLObject token_var_$81 = NIL;
                                while ( NIL == done_var_$80)
                                {
                                  final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$81 );
                                  final SubLObject valid_$82 = makeBoolean( !token_var_$81.eql( fcp_as ) );
                                  if( NIL != valid_$82 )
                                  {
                                    SubLObject current;
                                    final SubLObject datum = current = assertions_high.gaf_args( fcp_as );
                                    SubLObject func = NIL;
                                    SubLObject pred = NIL;
                                    SubLObject argnum = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                                    func = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                                    pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                                    argnum = current.first();
                                    current = current.rest();
                                    if( NIL == current )
                                    {
                                      final SubLObject naut = el_utilities.make_el_formula( func, list_utilities.remove_nth( number_utilities.f_1_( argnum ), cycl_utilities.formula_args( asent, UNPROVIDED ) ),
                                          UNPROVIDED );
                                      if( NIL != wff.el_wftP( naut, UNPROVIDED, UNPROVIDED ) )
                                      {
                                        final SubLObject candidate_nat = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
                                        thread.resetMultipleValues();
                                        final SubLObject unify_bindings = unification_utilities.term_unify( naut, candidate_nat, UNPROVIDED, UNPROVIDED );
                                        final SubLObject unify_justification = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != unify_bindings )
                                        {
                                          v_bindings = unify_bindings;
                                          supports = ConsesLow.cons( fcp_as, unify_justification );
                                        }
                                      }
                                    }
                                    else
                                    {
                                      cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
                                    }
                                  }
                                  done_var_$80 = makeBoolean( NIL == valid_$82 || NIL != supports );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
                                }
                              }
                            }
                            done_var = makeBoolean( NIL == valid || NIL != supports );
                          }
                        }
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                      SubLObject rest;
                      SubLObject module_var;
                      SubLObject _prev_bind_0_$77;
                      SubLObject _prev_bind_1_$76;
                      SubLObject node;
                      SubLObject d_link;
                      SubLObject mt_links;
                      SubLObject iteration_state;
                      SubLObject mt;
                      SubLObject tv_links;
                      SubLObject _prev_bind_0_$78;
                      SubLObject iteration_state_$87;
                      SubLObject tv;
                      SubLObject link_nodes;
                      SubLObject _prev_bind_0_$79;
                      SubLObject sol;
                      SubLObject set_contents_var;
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject node_vars_link_node;
                      SubLObject csome_list_var;
                      SubLObject node_vars_link_node2;
                      SubLObject new_list;
                      SubLObject rest_$89;
                      SubLObject generating_fn;
                      SubLObject _prev_bind_0_$80;
                      SubLObject sol2;
                      SubLObject link_nodes2;
                      SubLObject set_contents_var2;
                      SubLObject basis_object2;
                      SubLObject state2;
                      SubLObject node_vars_link_node3;
                      SubLObject csome_list_var2;
                      SubLObject node_vars_link_node4;
                      for( rest = NIL, rest = accessible_modules; NIL == supports && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var_$78 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == supports && NIL == dictionary_contents
                                    .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      for( iteration_state_$87 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == supports && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$87 ); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next( iteration_state_$87 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$87 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == supports && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
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
                                              if( NIL == supports )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == supports && NIL != csome_list_var)
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
                                            }
                                            else
                                            {
                                              Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$79, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$87 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$78, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$89 = NIL, rest_$89 = new_list; NIL == supports && NIL != rest_$89; rest_$89 = rest_$89.rest() )
                            {
                              generating_fn = rest_$89.first();
                              _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == supports && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
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
                                  if( NIL == supports )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == supports && NIL != csome_list_var2)
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
                                }
                                else
                                {
                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$80, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$76, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$77, thread );
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$75, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$77, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$75, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$74, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                    UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$74, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$73, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$72, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( v_bindings, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 8518L)
  public static SubLObject removal_fcp_justify(final SubLObject fcp_support)
  {
    final SubLObject asent = arguments.support_sentence( fcp_support );
    final SubLObject supports = Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), removal_fcp_bindings( asent ) );
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 8695L)
  public static SubLObject removal_fcp_verify(final SubLObject fcp_support)
  {
    final SubLObject asent = arguments.support_sentence( fcp_support );
    return list_utilities.sublisp_boolean( removal_fcp_bindings( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 9322L)
  public static SubLObject removal_evaluatable_fcp_unify_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject successP = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( predicate ) )
    {
      SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
      SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
      try
      {
        pred_relevance_macros.$relevant_pred_function$.bind( $sym26$RELEVANT_PRED_IS_SPEC_PRED, thread );
        pred_relevance_macros.$pred$.bind( $const6$functionCorrespondingPredicate_Ca, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, TWO_INTEGER, pred_var );
          SubLObject done_var = successP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                SubLObject done_var_$92 = successP;
                final SubLObject token_var_$93 = NIL;
                while ( NIL == done_var_$92)
                {
                  final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$93 );
                  final SubLObject valid_$94 = makeBoolean( !token_var_$93.eql( support_assertion ) );
                  if( NIL != valid_$94 )
                  {
                    final SubLObject function = assertions_high.gaf_arg1( support_assertion );
                    final SubLObject argnum = assertions_high.gaf_arg3( support_assertion );
                    if( NIL != fort_types_interface.evaluatable_function_p( function ) )
                    {
                      SubLObject failP = NIL;
                      SubLObject asent_argnum = ZERO_INTEGER;
                      final SubLObject args = cycl_utilities.formula_args( asent, $kw29$IGNORE );
                      SubLObject rest;
                      SubLObject asent_arg;
                      for( rest = NIL, rest = args; NIL == failP && NIL != rest; rest = rest.rest() )
                      {
                        asent_arg = rest.first();
                        asent_argnum = Numbers.add( asent_argnum, ONE_INTEGER );
                        if( !argnum.eql( asent_argnum ) && NIL == variables.fully_bound_p( asent_arg ) )
                        {
                          failP = T;
                        }
                      }
                      if( NIL == failP )
                      {
                        successP = T;
                      }
                    }
                  }
                  done_var_$92 = makeBoolean( NIL == valid_$94 || NIL != successP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$95, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != successP );
          }
        }
      }
      finally
      {
        pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
        pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != kb_gp_mapping.dgaigp_binaryP( $const6$functionCorrespondingPredicate_Ca ) )
      {
        _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
        _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
        try
        {
          pred_relevance_macros.$relevant_pred_function$.bind( $sym28$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
          pred_relevance_macros.$pred$.bind( $const6$functionCorrespondingPredicate_Ca, thread );
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, arity.binary_arg_swap( TWO_INTEGER ), pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, arity.binary_arg_swap( TWO_INTEGER ), pred_var );
            SubLObject done_var = successP;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                  SubLObject done_var_$93 = successP;
                  final SubLObject token_var_$94 = NIL;
                  while ( NIL == done_var_$93)
                  {
                    final SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$94 );
                    final SubLObject valid_$95 = makeBoolean( !token_var_$94.eql( support_assertion ) );
                    if( NIL != valid_$95 )
                    {
                      final SubLObject _prev_bind_0_$96 = kb_gp_mapping.$mapping_arg_swap$.currentBinding( thread );
                      try
                      {
                        kb_gp_mapping.$mapping_arg_swap$.bind( makeBoolean( NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                        final SubLObject function2 = assertions_high.gaf_arg1( support_assertion );
                        final SubLObject argnum2 = assertions_high.gaf_arg3( support_assertion );
                        if( NIL != fort_types_interface.evaluatable_function_p( function2 ) )
                        {
                          SubLObject failP2 = NIL;
                          SubLObject asent_argnum2 = ZERO_INTEGER;
                          final SubLObject args2 = cycl_utilities.formula_args( asent, $kw29$IGNORE );
                          SubLObject rest2;
                          SubLObject asent_arg2;
                          for( rest2 = NIL, rest2 = args2; NIL == failP2 && NIL != rest2; rest2 = rest2.rest() )
                          {
                            asent_arg2 = rest2.first();
                            asent_argnum2 = Numbers.add( asent_argnum2, ONE_INTEGER );
                            if( !argnum2.eql( asent_argnum2 ) && NIL == variables.fully_bound_p( asent_arg2 ) )
                            {
                              failP2 = T;
                            }
                          }
                          if( NIL == failP2 )
                          {
                            successP = T;
                          }
                        }
                      }
                      finally
                      {
                        kb_gp_mapping.$mapping_arg_swap$.rebind( _prev_bind_0_$96, thread );
                      }
                    }
                    done_var_$93 = makeBoolean( NIL == valid_$95 || NIL != successP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != successP );
            }
          }
        }
        finally
        {
          pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
          pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 9870L)
  public static SubLObject removal_evaluatable_fcp_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( $sym26$RELEVANT_PRED_IS_SPEC_PRED, thread );
      pred_relevance_macros.$pred$.bind( $const6$functionCorrespondingPredicate_Ca, thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
              SubLObject done_var_$101 = NIL;
              final SubLObject token_var_$102 = NIL;
              while ( NIL == done_var_$101)
              {
                final SubLObject support = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$102 );
                final SubLObject valid_$103 = makeBoolean( !token_var_$102.eql( support ) );
                if( NIL != valid_$103 )
                {
                  final SubLObject function = assertions_high.gaf_arg1( support );
                  final SubLObject argnum = assertions_high.gaf_arg3( support );
                  if( NIL != fort_types_interface.evaluatable_function_p( function ) )
                  {
                    SubLObject function_args = NIL;
                    SubLObject function_term = NIL;
                    SubLObject failP = NIL;
                    SubLObject asent_argnum = ZERO_INTEGER;
                    final SubLObject args = cycl_utilities.formula_args( asent, $kw29$IGNORE );
                    SubLObject rest;
                    SubLObject asent_arg;
                    for( rest = NIL, rest = args; NIL == failP && NIL != rest; rest = rest.rest() )
                    {
                      asent_arg = rest.first();
                      asent_argnum = Numbers.add( asent_argnum, ONE_INTEGER );
                      if( argnum.eql( asent_argnum ) )
                      {
                        function_term = asent_arg;
                      }
                      else if( NIL != variables.fully_bound_p( asent_arg ) )
                      {
                        function_args = ConsesLow.cons( asent_arg, function_args );
                      }
                      else
                      {
                        failP = T;
                      }
                    }
                    if( NIL == failP )
                    {
                      final SubLObject eval_expression = el_utilities.make_el_formula( function, Sequences.nreverse( function_args ), UNPROVIDED );
                      thread.resetMultipleValues();
                      final SubLObject result = relation_evaluation.cyc_evaluate( eval_expression );
                      final SubLObject evaluatableP = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != evaluatableP )
                      {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify( function_term, result, T, T );
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if( NIL != v_bindings )
                        {
                          final SubLObject eval_sentence = el_utilities.make_binary_formula( $const58$evaluate, result, eval_expression );
                          final SubLObject eval_support = removal_modules_evaluation.make_eval_support( eval_sentence, UNPROVIDED );
                          backward.removal_add_node( support, v_bindings, ConsesLow.append( ConsesLow.list( eval_support ), unify_justification ) );
                        }
                      }
                    }
                  }
                }
                done_var_$101 = makeBoolean( NIL == valid_$103 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$104, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != kb_gp_mapping.dgaigp_binaryP( $const6$functionCorrespondingPredicate_Ca ) )
    {
      _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
      _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
      try
      {
        pred_relevance_macros.$relevant_pred_function$.bind( $sym28$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
        pred_relevance_macros.$pred$.bind( $const6$functionCorrespondingPredicate_Ca, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, arity.binary_arg_swap( TWO_INTEGER ), pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, arity.binary_arg_swap( TWO_INTEGER ), pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                SubLObject done_var_$102 = NIL;
                final SubLObject token_var_$103 = NIL;
                while ( NIL == done_var_$102)
                {
                  final SubLObject support = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$103 );
                  final SubLObject valid_$104 = makeBoolean( !token_var_$103.eql( support ) );
                  if( NIL != valid_$104 )
                  {
                    final SubLObject _prev_bind_0_$105 = kb_gp_mapping.$mapping_arg_swap$.currentBinding( thread );
                    try
                    {
                      kb_gp_mapping.$mapping_arg_swap$.bind( makeBoolean( NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                      final SubLObject function2 = assertions_high.gaf_arg1( support );
                      final SubLObject argnum2 = assertions_high.gaf_arg3( support );
                      if( NIL != fort_types_interface.evaluatable_function_p( function2 ) )
                      {
                        SubLObject function_args2 = NIL;
                        SubLObject function_term2 = NIL;
                        SubLObject failP2 = NIL;
                        SubLObject asent_argnum2 = ZERO_INTEGER;
                        final SubLObject args2 = cycl_utilities.formula_args( asent, $kw29$IGNORE );
                        SubLObject rest2;
                        SubLObject asent_arg2;
                        for( rest2 = NIL, rest2 = args2; NIL == failP2 && NIL != rest2; rest2 = rest2.rest() )
                        {
                          asent_arg2 = rest2.first();
                          asent_argnum2 = Numbers.add( asent_argnum2, ONE_INTEGER );
                          if( argnum2.eql( asent_argnum2 ) )
                          {
                            function_term2 = asent_arg2;
                          }
                          else if( NIL != variables.fully_bound_p( asent_arg2 ) )
                          {
                            function_args2 = ConsesLow.cons( asent_arg2, function_args2 );
                          }
                          else
                          {
                            failP2 = T;
                          }
                        }
                        if( NIL == failP2 )
                        {
                          final SubLObject eval_expression2 = el_utilities.make_el_formula( function2, Sequences.nreverse( function_args2 ), UNPROVIDED );
                          thread.resetMultipleValues();
                          final SubLObject result2 = relation_evaluation.cyc_evaluate( eval_expression2 );
                          final SubLObject evaluatableP2 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          if( NIL != evaluatableP2 )
                          {
                            thread.resetMultipleValues();
                            final SubLObject v_bindings2 = unification_utilities.term_unify( function_term2, result2, T, T );
                            final SubLObject unify_justification2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if( NIL != v_bindings2 )
                            {
                              final SubLObject eval_sentence2 = el_utilities.make_binary_formula( $const58$evaluate, result2, eval_expression2 );
                              final SubLObject eval_support2 = removal_modules_evaluation.make_eval_support( eval_sentence2, UNPROVIDED );
                              backward.removal_add_node( support, v_bindings2, ConsesLow.append( ConsesLow.list( eval_support2 ), unify_justification2 ) );
                            }
                          }
                        }
                      }
                    }
                    finally
                    {
                      kb_gp_mapping.$mapping_arg_swap$.rebind( _prev_bind_0_$105, thread );
                    }
                  }
                  done_var_$102 = makeBoolean( NIL == valid_$104 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
        pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 11644L)
  public static SubLObject removal_fcp_with_genl_preds_wrt_args_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return fcp_with_genl_preds_wrt_args_arg2( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 11799L)
  public static SubLObject removal_fcp_with_genl_preds_wrt_args_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg2_query = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg2_answer = fcp_with_genl_preds_wrt_args_arg2( asent );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.term_unify( arg2_query, arg2_answer, T, T );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      final SubLObject sentence = bindings.apply_bindings( v_bindings, asent );
      final SubLObject support = arguments.make_hl_support( $kw61$OPAQUE, sentence, UNPROVIDED, UNPROVIDED );
      backward.removal_add_node( support, v_bindings, unify_justification );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 12315L)
  public static SubLObject fcp_with_genl_preds_wrt_args_arg2(final SubLObject asent)
  {
    if( NIL != forts.fort_p( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != variables.fully_bound_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) && NIL != cycl_grammar.cycl_nat_p(
        cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) ) )
    {
      final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
      final SubLObject supported_nat_argnum = ONE_INTEGER;
      final SubLObject arg1_nat = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
      final SubLObject functor = cycl_utilities.nat_arg0( arg1_nat );
      if( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const62$genlPredsWRTArgs, predicate, TWO_INTEGER, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples( predicate, $const62$genlPredsWRTArgs, TWO_INTEGER, $list66, UNPROVIDED );
        SubLObject spec_pred_wrt_args = NIL;
        spec_pred_wrt_args = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = spec_pred_wrt_args;
          SubLObject spec_pred = NIL;
          SubLObject wrt_args = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
          spec_pred = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
          wrt_args = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != kb_indexing_datastructures.indexed_term_p( spec_pred ) )
            {
              SubLObject cdolist_list_var_$110 = kb_mapping_utilities.pred_value_tuples( functor, $const6$functionCorrespondingPredicate_Ca, ONE_INTEGER, $list65, UNPROVIDED );
              SubLObject spec_pred2_argnum = NIL;
              spec_pred2_argnum = cdolist_list_var_$110.first();
              while ( NIL != cdolist_list_var_$110)
              {
                SubLObject current_$112;
                final SubLObject datum_$111 = current_$112 = spec_pred2_argnum;
                SubLObject spec_pred2 = NIL;
                SubLObject argnum = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$112, datum_$111, $list64 );
                spec_pred2 = current_$112.first();
                current_$112 = current_$112.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$112, datum_$111, $list64 );
                argnum = current_$112.first();
                current_$112 = current_$112.rest();
                if( NIL == current_$112 )
                {
                  if( argnum.eql( supported_nat_argnum ) && NIL != genl_predicates.genl_predP( spec_pred2, spec_pred, UNPROVIDED, UNPROVIDED ) )
                  {
                    final SubLObject other_args = Sequences.remove( argnum, el_utilities.el_list_items( wrt_args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    if( NIL != list_utilities.singletonP( other_args ) )
                    {
                      return cycl_utilities.nat_arg( arg1_nat, Numbers.subtract( other_args.first(), ONE_INTEGER ), UNPROVIDED );
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$111, $list64 );
                }
                cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                spec_pred2_argnum = cdolist_list_var_$110.first();
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          spec_pred_wrt_args = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 13925L)
  public static SubLObject asent_uses_predicate_with_corresponding_evaluatable_function_with_non_functional_arg_unboundP(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL == inference_modules.predicate_has_specific_removal_modulesP( pred ) && NIL != kb_indexing_datastructures.indexed_term_p( pred ) )
    {
      final SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
      final SubLObject deck_type = $kw37$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      SubLObject node_and_predicate_mode = NIL;
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$113 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw39$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw42$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw44$WARN ) )
              {
                Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$114 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(
                  UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$116 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$118 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const46$genlPreds ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  for( node_and_predicate_mode = ConsesLow.list( $const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck
                      .deck_pop( recur_deck ) )
                  {
                    final SubLObject node_var_$119 = node_and_predicate_mode.first();
                    final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                    final SubLObject fcp_pred = node_var_$119;
                    final SubLObject _prev_bind_0_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                      if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$119 ) )
                      {
                        final SubLObject pred_var = fcp_pred;
                        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, TWO_INTEGER, pred_var ) )
                        {
                          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, TWO_INTEGER, pred_var );
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                                SubLObject done_var_$121 = NIL;
                                final SubLObject token_var_$122 = NIL;
                                while ( NIL == done_var_$121)
                                {
                                  final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$122 );
                                  final SubLObject valid_$123 = makeBoolean( !token_var_$122.eql( fcp_as ) );
                                  if( NIL != valid_$123 )
                                  {
                                    final SubLObject fcp_func = assertions_high.gaf_arg1( fcp_as );
                                    final SubLObject fcp_argnum = assertions_high.gaf_arg3( fcp_as );
                                    if( NIL != fort_types_interface.evaluatable_function_p( fcp_func ) && NIL != variables.not_fully_bound_p( list_utilities.remove_nth( fcp_argnum, asent ) ) )
                                    {
                                      return T;
                                    }
                                  }
                                  done_var_$121 = makeBoolean( NIL == valid_$123 );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$117, thread );
                                }
                              }
                            }
                            done_var = makeBoolean( NIL == valid );
                          }
                        }
                      }
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$118 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var_$119 );
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
                                    final SubLObject _prev_bind_0_$119 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$128;
                                      for( iteration_state_$128 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$128 ); iteration_state_$128 = dictionary_contents.do_dictionary_contents_next( iteration_state_$128 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$128 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                              Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$120, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$128 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$119, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$130;
                            final SubLObject new_list = cdolist_list_var_$130 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$130.first();
                            while ( NIL != cdolist_list_var_$130)
                            {
                              final SubLObject _prev_bind_0_$121 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                  Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$121, thread );
                              }
                              cdolist_list_var_$130 = cdolist_list_var_$130.rest();
                              generating_fn = cdolist_list_var_$130.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$117, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$118, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$116, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$118, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$116, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$115, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                    UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$115, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$114, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$113, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$122, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 14918L)
  public static SubLObject removal_fcp_syntactic_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject bindings_values = bindings.bindings_values( removal_fcp_syntactic_bindings( asent ) );
    return makeBoolean( NIL != bindings_values && NIL != el_utilities.closedP( bindings_values, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 15163L)
  public static SubLObject removal_fcp_syntactic_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_bindings = removal_fcp_syntactic_bindings( asent );
    final SubLObject supports = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      final SubLObject sentence = bindings.apply_bindings( v_bindings, asent );
      if( NIL == czer_meta.find_visible_assertion_cycl( sentence, UNPROVIDED ) )
      {
        final SubLObject support = arguments.make_hl_support( $kw61$OPAQUE, sentence, UNPROVIDED, UNPROVIDED );
        backward.removal_add_node( support, v_bindings, supports );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 15626L)
  public static SubLObject removal_fcp_syntactic_bindings(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    SubLObject supports = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw72$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym73$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
          if( NIL != kb_indexing_datastructures.indexed_term_p( pred ) && NIL == v_bindings )
          {
            final SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
            final SubLObject deck_type = $kw37$QUEUE;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$133 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw39$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw42$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw44$WARN ) )
                    {
                      Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(
                        UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$136 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$137 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$139 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                            $const46$genlPreds ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                        for( node_and_predicate_mode = ConsesLow.list( $const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode
                            && NIL == v_bindings; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                        {
                          final SubLObject node_var_$140 = node_and_predicate_mode.first();
                          final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                          final SubLObject fcp_pred = node_var_$140;
                          final SubLObject _prev_bind_0_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                            if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$140 ) )
                            {
                              final SubLObject pred_var = fcp_pred;
                              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( pred, TWO_INTEGER, pred_var ) )
                              {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( pred, TWO_INTEGER, pred_var );
                                SubLObject done_var = v_bindings;
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
                                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw27$GAF, $kw11$TRUE, NIL );
                                      SubLObject done_var_$142 = v_bindings;
                                      final SubLObject token_var_$143 = NIL;
                                      while ( NIL == done_var_$142)
                                      {
                                        final SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$143 );
                                        final SubLObject valid_$144 = makeBoolean( !token_var_$143.eql( fcp_as ) );
                                        if( NIL != valid_$144 )
                                        {
                                          final SubLObject fcp_argnum = assertions_high.gaf_arg3( fcp_as );
                                          final SubLObject fcp_func = assertions_high.gaf_arg1( fcp_as );
                                          final SubLObject expanded_asent = narts_high.nart_expand( asent );
                                          SubLObject args = NIL;
                                          SubLObject func = NIL;
                                          SubLObject v_answer = NIL;
                                          if( cycl_utilities.atomic_sentence_arg( expanded_asent, fcp_argnum, UNPROVIDED ).isCons() )
                                          {
                                            SubLObject argnum = ZERO_INTEGER;
                                            SubLObject cdolist_list_var;
                                            final SubLObject args_$145 = cdolist_list_var = cycl_utilities.formula_args( expanded_asent, $kw29$IGNORE );
                                            SubLObject arg = NIL;
                                            arg = cdolist_list_var.first();
                                            while ( NIL != cdolist_list_var)
                                            {
                                              argnum = Numbers.add( argnum, ONE_INTEGER );
                                              if( argnum.eql( fcp_argnum ) )
                                              {
                                                if( arg.isCons() )
                                                {
                                                  final SubLObject datum_evaluated_var = arg;
                                                  func = datum_evaluated_var.first();
                                                  v_answer = datum_evaluated_var.rest();
                                                }
                                              }
                                              else
                                              {
                                                args = ConsesLow.cons( arg, args );
                                              }
                                              cdolist_list_var = cdolist_list_var.rest();
                                              arg = cdolist_list_var.first();
                                            }
                                            args = Sequences.nreverse( args );
                                            pred = cycl_utilities.atomic_sentence_predicate( expanded_asent );
                                          }
                                          if( NIL != func && NIL != ghl_search_methods.gt_predicate_relation_p( $const74$genlFuncs, func, fcp_func, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != wff.el_wftP( ConsesLow
                                              .cons( func, v_answer ), UNPROVIDED, UNPROVIDED ) )
                                          {
                                            v_answer = narts_high.nart_substitute( v_answer );
                                            v_bindings = unification_utilities.term_unify( args, v_answer, UNPROVIDED, UNPROVIDED );
                                            if( NIL == kb_utilities.kbeq( func, fcp_func ) )
                                            {
                                              supports = ConsesLow.cons( arguments.make_hl_support( $kw75$QUERY, ConsesLow.list( $const74$genlFuncs, func, fcp_func ), UNPROVIDED, UNPROVIDED ), supports );
                                            }
                                            supports = ConsesLow.cons( fcp_as, supports );
                                          }
                                        }
                                        done_var_$142 = makeBoolean( NIL == valid_$144 || NIL != v_bindings );
                                      }
                                    }
                                    finally
                                    {
                                      final SubLObject _prev_bind_0_$138 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$138, thread );
                                      }
                                    }
                                  }
                                  done_var = makeBoolean( NIL == valid || NIL != v_bindings );
                                }
                              }
                            }
                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                            SubLObject rest;
                            SubLObject module_var;
                            SubLObject _prev_bind_0_$139;
                            SubLObject _prev_bind_1_$138;
                            SubLObject node;
                            SubLObject d_link;
                            SubLObject mt_links;
                            SubLObject iteration_state;
                            SubLObject mt;
                            SubLObject tv_links;
                            SubLObject _prev_bind_0_$140;
                            SubLObject iteration_state_$150;
                            SubLObject tv;
                            SubLObject link_nodes;
                            SubLObject _prev_bind_0_$141;
                            SubLObject sol;
                            SubLObject set_contents_var;
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject node_vars_link_node;
                            SubLObject csome_list_var;
                            SubLObject node_vars_link_node2;
                            SubLObject new_list;
                            SubLObject rest_$152;
                            SubLObject generating_fn;
                            SubLObject _prev_bind_0_$142;
                            SubLObject sol2;
                            SubLObject link_nodes2;
                            SubLObject set_contents_var2;
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject node_vars_link_node3;
                            SubLObject csome_list_var2;
                            SubLObject node_vars_link_node4;
                            for( rest = NIL, rest = accessible_modules; NIL == v_bindings && NIL != rest; rest = rest.rest() )
                            {
                              module_var = rest.first();
                              _prev_bind_0_$139 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                              _prev_bind_1_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                    .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                node = function_terms.naut_to_nart( node_var_$140 );
                                if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                {
                                  d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != d_link )
                                  {
                                    mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != mt_links )
                                    {
                                      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == v_bindings && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                      {
                                        thread.resetMultipleValues();
                                        mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                        tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                        {
                                          _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                            for( iteration_state_$150 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == v_bindings && NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state_$150 ); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next( iteration_state_$150 ) )
                                            {
                                              thread.resetMultipleValues();
                                              tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$150 );
                                              link_nodes = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                              {
                                                _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                  sol = link_nodes;
                                                  if( NIL != set.set_p( sol ) )
                                                  {
                                                    set_contents_var = set.do_set_internal( sol );
                                                    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                        set_contents_var ); NIL == v_bindings && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state(
                                                            state ) )
                                                    {
                                                      node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                          node_vars_link_node, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                        deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                      }
                                                    }
                                                  }
                                                  else if( sol.isList() )
                                                  {
                                                    if( NIL == v_bindings )
                                                    {
                                                      csome_list_var = sol;
                                                      node_vars_link_node2 = NIL;
                                                      node_vars_link_node2 = csome_list_var.first();
                                                      while ( NIL == v_bindings && NIL != csome_list_var)
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
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$141, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state_$150 );
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$140, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                }
                                else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                {
                                  new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                      .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                          sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                  for( rest_$152 = NIL, rest_$152 = new_list; NIL == v_bindings && NIL != rest_$152; rest_$152 = rest_$152.rest() )
                                  {
                                    generating_fn = rest_$152.first();
                                    _prev_bind_0_$142 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                      link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                      if( NIL != set.set_p( sol2 ) )
                                      {
                                        set_contents_var2 = set.do_set_internal( sol2 );
                                        for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                            set_contents_var2 ); NIL == v_bindings && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
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
                                        if( NIL == v_bindings )
                                        {
                                          csome_list_var2 = sol2;
                                          node_vars_link_node4 = NIL;
                                          node_vars_link_node4 = csome_list_var2.first();
                                          while ( NIL == v_bindings && NIL != csome_list_var2)
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
                                      }
                                      else
                                      {
                                        Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$142, thread );
                                    }
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$138, thread );
                                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$139, thread );
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$137, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$139, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$137, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$136, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                          UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$136, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$135, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$134, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$143, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$133, thread );
            }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw72$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( v_bindings, supports );
  }

  public static SubLObject declare_removal_modules_function_corresponding_predicate_file()
  {
    SubLFiles.declareMacro( me, "do_fcp_assertions_for_pred", "DO-FCP-ASSERTIONS-FOR-PRED" );
    SubLFiles.declareMacro( me, "do_corresponding_evaluatable_functions", "DO-CORRESPONDING-EVALUATABLE-FUNCTIONS" );
    SubLFiles.declareFunction( me, "should_bind_all_but_functional_in_arg_position", "SHOULD-BIND-ALL-BUT-FUNCTIONAL-IN-ARG-POSITION", 3, 0, false );
    SubLFiles.declareFunction( me, "fcp_canonical_predicateP", "FCP-CANONICAL-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_fcp_check_expand", "REMOVAL-FCP-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_check_required", "REMOVAL-FCP-CHECK-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_find_nat_expand", "REMOVAL-FCP-FIND-NAT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_find_nat_required", "REMOVAL-FCP-FIND-NAT-REQUIRED", 1, 1, false );
    new $removal_fcp_find_nat_required$UnaryFunction();
    new $removal_fcp_find_nat_required$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_fcp_support", "REMOVAL-FCP-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_fcp_bindings", "REMOVAL-FCP-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_fcp_justify", "REMOVAL-FCP-JUSTIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_fcp_verify", "REMOVAL-FCP-VERIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_evaluatable_fcp_unify_required", "REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_evaluatable_fcp_unify_expand", "REMOVAL-EVALUATABLE-FCP-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_with_genl_preds_wrt_args_required", "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_with_genl_preds_wrt_args_expand", "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "fcp_with_genl_preds_wrt_args_arg2", "FCP-WITH-GENL-PREDS-WRT-ARGS-ARG2", 1, 0, false );
    SubLFiles.declareFunction( me, "asent_uses_predicate_with_corresponding_evaluatable_function_with_non_functional_arg_unboundP",
        "ASENT-USES-PREDICATE-WITH-CORRESPONDING-EVALUATABLE-FUNCTION-WITH-NON-FUNCTIONAL-ARG-UNBOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_fcp_syntactic_required", "REMOVAL-FCP-SYNTACTIC-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_syntactic_expand", "REMOVAL-FCP-SYNTACTIC-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_fcp_syntactic_bindings", "REMOVAL-FCP-SYNTACTIC-BINDINGS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_function_corresponding_predicate_file()
  {
    $use_fcp_removal_moduleP$ = SubLFiles.deflexical( "*USE-FCP-REMOVAL-MODULE?*", ( maybeDefault( $sym0$_USE_FCP_REMOVAL_MODULE__, $use_fcp_removal_moduleP$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_function_corresponding_predicate_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_USE_FCP_REMOVAL_MODULE__ );
    preference_modules.inference_preference_module( $kw24$REMOVAL_FCP_UNIFY, $list25 );
    utilities_macros.note_funcall_helper_function( $sym34$SHOULD_BIND_ALL_BUT_FUNCTIONAL_IN_ARG_POSITION );
    inference_modules.inference_removal_module( $kw50$REMOVAL_FCP_CHECK, $list51 );
    inference_modules.inference_removal_module( $kw53$REMOVAL_FCP_FIND_NAT, $list54 );
    inference_modules.inference_removal_module( $kw56$REMOVAL_EVALUATABLE_FCP_UNIFY, $list57 );
    inference_modules.inference_removal_module( $kw59$REMOVAL_FCP_WITH_GENL_PREDS_WRT_ARGS, $list60 );
    preference_modules.inference_preference_module( $kw67$REMOVAL_FCP_WHERE_FUNCTION_EVALUATABLE, $list68 );
    inference_modules.inference_removal_module( $kw70$REMOVAL_FCP_SYNTACTIC, $list71 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_function_corresponding_predicate_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_function_corresponding_predicate_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_function_corresponding_predicate_file();
  }
  static
  {
    me = new removal_modules_function_corresponding_predicate();
    $use_fcp_removal_moduleP$ = null;
    $sym0$_USE_FCP_REMOVAL_MODULE__ = makeSymbol( "*USE-FCP-REMOVAL-MODULE?*" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "FCP-AS" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$FCP_PRED = makeUninternedSymbol( "FCP-PRED" );
    $sym3$PWHEN = makeSymbol( "PWHEN" );
    $sym4$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym5$DO_ALL_SPEC_PREDICATES = makeSymbol( "DO-ALL-SPEC-PREDICATES" );
    $const6$functionCorrespondingPredicate_Ca = constant_handles.reader_make_constant_shell( makeString( "functionCorrespondingPredicate-Canonical" ) );
    $sym7$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $kw8$INDEX = makeKeyword( "INDEX" );
    $kw9$PREDICATE = makeKeyword( "PREDICATE" );
    $kw10$TRUTH = makeKeyword( "TRUTH" );
    $kw11$TRUE = makeKeyword( "TRUE" );
    $kw12$DONE = makeKeyword( "DONE" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ARGNUM" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "SUPPORT-ASSERTION" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list14 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "SUPPORT-ASSERTION" ) );
    $kw15$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw16$SUPPORT_ASSERTION = makeKeyword( "SUPPORT-ASSERTION" );
    $sym17$DO_GAF_ARG_INDEX_GP = makeSymbol( "DO-GAF-ARG-INDEX-GP" );
    $sym18$CLET = makeSymbol( "CLET" );
    $sym19$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $sym20$GAF_ARG3 = makeSymbol( "GAF-ARG3" );
    $sym21$EVALUATABLE_FUNCTION_P = makeSymbol( "EVALUATABLE-FUNCTION-P" );
    $sym22$SUPPORT_ASSERTION = makeUninternedSymbol( "SUPPORT-ASSERTION" );
    $sym23$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS = makeSymbol( "DO-CORRESPONDING-EVALUATABLE-FUNCTIONS" );
    $kw24$REMOVAL_FCP_UNIFY = makeKeyword( "REMOVAL-FCP-UNIFY" );
    $list25 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
        "PREFERENCE" ), makeSymbol( "SHOULD-BIND-ALL-BUT-FUNCTIONAL-IN-ARG-POSITION" ) );
    $sym26$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" );
    $kw27$GAF = makeKeyword( "GAF" );
    $sym28$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol( "RELEVANT-PRED-IS-SPEC-INVERSE" );
    $kw29$IGNORE = makeKeyword( "IGNORE" );
    $kw30$DOOMED = makeKeyword( "DOOMED" );
    $kw31$DISALLOWED = makeKeyword( "DISALLOWED" );
    $kw32$GROSSLY_DISPREFERRED = makeKeyword( "GROSSLY-DISPREFERRED" );
    $kw33$DISPREFERRED = makeKeyword( "DISPREFERRED" );
    $sym34$SHOULD_BIND_ALL_BUT_FUNCTIONAL_IN_ARG_POSITION = makeSymbol( "SHOULD-BIND-ALL-BUT-FUNCTIONAL-IN-ARG-POSITION" );
    $kw35$DEPTH = makeKeyword( "DEPTH" );
    $kw36$STACK = makeKeyword( "STACK" );
    $kw37$QUEUE = makeKeyword( "QUEUE" );
    $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw39$ERROR = makeKeyword( "ERROR" );
    $str40$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym41$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw42$CERROR = makeKeyword( "CERROR" );
    $str43$continue_anyway = makeString( "continue anyway" );
    $kw44$WARN = makeKeyword( "WARN" );
    $str45$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const46$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str47$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str48$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str49$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw50$REMOVAL_FCP_CHECK = makeKeyword( "REMOVAL-FCP-CHECK" );
    $list51 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-FCP-CHECK-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER,
      makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-FCP-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(<functional-pred> . <args>)\n    with all ARGS fully bound\n    using only the KB GAF indexing and explicit assertions" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$territoryOf #$France (#$TerritoryFn #$France))" )
    } );
    $list52 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "PRED" ), makeSymbol( "ARGNUM" ) );
    $kw53$REMOVAL_FCP_FIND_NAT = makeKeyword( "REMOVAL-FCP-FIND-NAT" );
    $list54 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-FCP-FIND-NAT-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER,
      makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-FCP-FIND-NAT-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(<functional-pred> . <args>)\n    with only NAT arg not fully bound\n    using only the KB GAF indexing and explicit assertions" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$territoryOf #$France ?TERRITORY)\n    (#$anatomicalPartOfType #$AbrahamLincoln #$Head-AnimalBodyPart ?HEAD)\n    (#$intervalEndedBy ?INTERVAL #$WorldWarII)" )
    } );
    $kw55$FCP = makeKeyword( "FCP" );
    $kw56$REMOVAL_EVALUATABLE_FCP_UNIFY = makeKeyword( "REMOVAL-EVALUATABLE-FCP-UNIFY" );
    $list57 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EVALUATABLE-FCP-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(<functional-pred> . <args>)\n    with all ARGS fully bound except possibly the functional arg" ), makeKeyword( "EXAMPLE" ), makeString( "(#$commonResidue (#$Degree-UnitOfAngularMeasure 450) ?X)" )
    } );
    $const58$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $kw59$REMOVAL_FCP_WITH_GENL_PREDS_WRT_ARGS = makeKeyword( "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS" );
    $list60 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-REQUIRED" ), makeKeyword( "REQUIRED-PATTERN" ),
      ConsesLow.list( makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
          "EXPAND" ), makeSymbol( "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(<functional-pred> . <args>)\n    with all ARGS fully bound except possibly the functional arg" ), makeKeyword( "EXAMPLE" ), makeString( "(#$commonResidue (#$Degree-UnitOfAngularMeasure 450) ?X)" )
    } );
    $kw61$OPAQUE = makeKeyword( "OPAQUE" );
    $const62$genlPredsWRTArgs = constant_handles.reader_make_constant_shell( makeString( "genlPredsWRTArgs" ) );
    $list63 = ConsesLow.list( makeSymbol( "SPEC-PRED" ), makeSymbol( "WRT-ARGS" ) );
    $list64 = ConsesLow.list( makeSymbol( "SPEC-PRED2" ), makeSymbol( "ARGNUM" ) );
    $list65 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $list66 = ConsesLow.list( ONE_INTEGER, THREE_INTEGER );
    $kw67$REMOVAL_FCP_WHERE_FUNCTION_EVALUATABLE = makeKeyword( "REMOVAL-FCP-WHERE-FUNCTION-EVALUATABLE" );
    $list68 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword(
        "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ASENT-USES-PREDICATE-WITH-CORRESPONDING-EVALUATABLE-FUNCTION-WITH-NON-FUNCTIONAL-ARG-UNBOUND?" ) ) ), makeKeyword( "PREFERENCE-LEVEL" ),
        makeKeyword( "DISPREFERRED" ) );
    $sym69$_EXIT = makeSymbol( "%EXIT" );
    $kw70$REMOVAL_FCP_SYNTACTIC = makeKeyword( "REMOVAL-FCP-SYNTACTIC" );
    $list71 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-FCP-SYNTACTIC-REQUIRED" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FCP-CANONICAL-PREDICATE?" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword(
            "EXPAND" ), makeSymbol( "REMOVAL-FCP-SYNTACTIC-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(<fcp-canon> ?X (<func> <answer>)) or (<fcp-canon> (<func> <answer>) ?X)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(vectorDirection ?WHAT (VectorDirectionFn HYP-VectorInterval-1))" )
    } );
    $kw72$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym73$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $const74$genlFuncs = constant_handles.reader_make_constant_shell( makeString( "genlFuncs" ) );
    $kw75$QUERY = makeKeyword( "QUERY" );
  }

  public static final class $removal_fcp_find_nat_required$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_fcp_find_nat_required$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-FCP-FIND-NAT-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_fcp_find_nat_required( arg1, $removal_fcp_find_nat_required$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_fcp_find_nat_required$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_fcp_find_nat_required$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-FCP-FIND-NAT-REQUIRED" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_fcp_find_nat_required( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 3492 ms
 * 
 */