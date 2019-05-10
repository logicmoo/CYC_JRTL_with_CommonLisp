package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.lexicon_subword_index;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_subword_index
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subword_index";
  public static final String myFingerPrint = "ed3659f9cf0d48d0c3c8b5d0528a4339e1758f82f4b56e830c7314d90cf6fb61";
  private static final SubLSymbol $kw0$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLObject $const4$equalStrings_CaseInsensitive;
  private static final SubLSymbol $sym5$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY;
  private static final SubLSymbol $sym6$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST;
  private static final SubLObject $const7$substring;
  private static final SubLSymbol $kw8$ON;
  private static final SubLSymbol $kw9$OFF;
  private static final SubLSymbol $sym10$INDEXED_TERM_P;
  private static final SubLSymbol $kw11$EVAL;
  private static final SubLSymbol $sym12$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND;
  private static final SubLObject $const13$prefixSubstring_CaseInsensitive;
  private static final SubLSymbol $sym14$CYCL_STRING_STARTS_WITH_BY_TEST;
  private static final SubLObject $const15$suffixSubstring;
  private static final SubLSymbol $sym16$CYCL_STRING_ENDS_WITH_BY_TEST;
  private static final SubLSymbol $sym17$CYCL_SUPERSTRING_;
  private static final SubLList $list18;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 1368L)
  public static SubLObject removal_conjunctive_subword_index_applicability(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject indexed_pred_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject substring_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != el_utilities.el_binary_formula_p( asent ) )
        {
          thread.resetMultipleValues();
          final SubLObject pred = el_utilities.unmake_binary_formula( asent );
          final SubLObject arg1 = thread.secondMultipleValue();
          final SubLObject arg2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != conses_high.member( pred, lexicon_subword_index.non_trie_subword_preds(), UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != conses_high.member( TWO_INTEGER, lexicon_subword_index.non_trie_subword_pred_args( pred ), UNPROVIDED, UNPROVIDED ) )
            {
              dictionary_utilities.dictionary_push( indexed_pred_dict, arg2, index );
            }
          }
          else if( NIL != subl_promotions.memberP( pred, $list3, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != cycl_string.cycl_string_p( arg1 ) )
            {
              dictionary_utilities.dictionary_push( substring_dict, arg2, index );
            }
          }
          else if( pred.eql( $const4$equalStrings_CaseInsensitive ) && NIL != cycl_string.cycl_string_p( arg2 ) )
          {
            dictionary_utilities.dictionary_push( substring_dict, arg1, index );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    SubLObject subclause_specs = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( substring_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject substring_indices = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject indexed_pred_indices = dictionary.dictionary_lookup( indexed_pred_dict, var, UNPROVIDED );
      if( NIL != indexed_pred_indices )
      {
        SubLObject cdolist_list_var2;
        final SubLObject index_sets = cdolist_list_var2 = list_utilities.cartesian_product( ConsesLow.list( indexed_pred_indices, substring_indices ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject indices = NIL;
        indices = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          subclause_specs = ConsesLow.cons( clause_utilities.new_subclause_spec( NIL, indices ), subclause_specs );
          cdolist_list_var2 = cdolist_list_var2.rest();
          indices = cdolist_list_var2.first();
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sequences.nreverse( subclause_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 2825L)
  public static SubLObject removal_conjunctive_subword_index_cost(final SubLObject contextualized_dnf_clause)
  {
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 2965L)
  public static SubLObject removal_conjunctive_subword_index_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject pred = removal_conjunctive_subword_index_destructure( contextualized_dnf_clause );
    final SubLObject substring = thread.secondMultipleValue();
    final SubLObject superstring_var = thread.thirdMultipleValue();
    final SubLObject term_var = thread.fourthMultipleValue();
    final SubLObject substring_pred = thread.fifthMultipleValue();
    final SubLObject mt = thread.sixthMultipleValue();
    final SubLObject ordering = thread.seventhMultipleValue();
    thread.resetMultipleValues();
    final SubLObject case_sensitivity = ( NIL != genl_predicates.genl_predicateP( substring_pred, $const7$substring, UNPROVIDED, UNPROVIDED ) ) ? $kw8$ON : $kw9$OFF;
    final SubLObject superstrings = lexicon_subword_index.nl_trie_subword_index_search_set( substring, case_sensitivity );
    if( NIL != set.set_p( superstrings ) )
    {
      final SubLObject set_contents_var = set.do_set_internal( superstrings );
      SubLObject basis_object;
      SubLObject state;
      SubLObject superstring;
      SubLObject orig_bindings;
      SubLObject unify_justification;
      SubLObject mt_var;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject _prev_bind_3;
      SubLObject indexed_terms;
      SubLObject cdolist_list_var;
      SubLObject indexed_pred_support;
      SubLObject v_term;
      SubLObject term_bindings;
      SubLObject term_unify_justification;
      SubLObject v_bindings;
      SubLObject substring_support_sentence;
      SubLObject indexed_pred_supports;
      SubLObject substring_supports;
      SubLObject justifications;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        superstring = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, superstring ) && NIL != removal_substring_matchesP( substring_pred, substring, superstring ) )
        {
          thread.resetMultipleValues();
          orig_bindings = unification_utilities.term_unify( superstring_var, superstring, UNPROVIDED, UNPROVIDED );
          unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != orig_bindings )
          {
            mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
            _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
            _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              indexed_terms = cycl_utilities.expression_gather( superstring, $sym10$INDEXED_TERM_P, NIL, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
              if( NIL != kb_indexing_datastructures.indexed_term_p( pred ) )
              {
                indexed_terms = ConsesLow.cons( pred, indexed_terms );
              }
              cdolist_list_var = virtual_indexing.gather_overlap_index( indexed_terms, UNPROVIDED );
              indexed_pred_support = NIL;
              indexed_pred_support = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( ( NIL == pred || pred.equal( cycl_utilities.formula_operator( assertions_high.assertion_formula( indexed_pred_support ) ) ) ) && NIL != Equality.equal( superstring, cycl_utilities.formula_arg(
                    assertions_high.assertion_formula( indexed_pred_support ), TWO_INTEGER, UNPROVIDED ) ) )
                {
                  v_term = assertions_high.gaf_arg1( indexed_pred_support );
                  thread.resetMultipleValues();
                  term_bindings = unification_utilities.term_unify( term_var, v_term, UNPROVIDED, UNPROVIDED );
                  term_unify_justification = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != term_bindings )
                  {
                    v_bindings = ( ( NIL != variables.variable_p( term_var ) ) ? ConsesLow.append( conses_high.copy_list( orig_bindings ), term_bindings ) : conses_high.copy_list( orig_bindings ) );
                    substring_support_sentence = el_utilities.make_binary_formula( substring_pred, superstring, substring );
                    indexed_pred_supports = ConsesLow.list( indexed_pred_support );
                    substring_supports = ConsesLow.list( arguments.make_hl_support( $kw11$EVAL, substring_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED ) );
                    justifications = list_utilities.permute( ConsesLow.list( indexed_pred_supports, substring_supports ), ordering );
                    inference_worker_removal.conjunctive_removal_callback( v_bindings, justifications );
                  }
                }
                cdolist_list_var = cdolist_list_var.rest();
                indexed_pred_support = cdolist_list_var.first();
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 4641L)
  public static SubLObject removal_substring_matchesP(final SubLObject substring_pred, final SubLObject substring, final SubLObject superstring)
  {
    if( substring_pred.eql( $const4$equalStrings_CaseInsensitive ) )
    {
      return Equality.equalp( substring, superstring );
    }
    final SubLObject test = ( NIL != genl_predicates.genl_predicateP( substring_pred, $const7$substring, UNPROVIDED, UNPROVIDED ) ) ? Symbols.symbol_function( EQUAL ) : Symbols.symbol_function( EQUALP );
    final SubLObject fn = ( NIL != genl_predicates.genl_predicateP( substring_pred, $const13$prefixSubstring_CaseInsensitive, UNPROVIDED, UNPROVIDED ) ) ? Symbols.symbol_function( $sym14$CYCL_STRING_STARTS_WITH_BY_TEST )
        : ( ( NIL != genl_predicates.genl_predicateP( substring_pred, $const15$suffixSubstring, UNPROVIDED, UNPROVIDED ) ) ? Symbols.symbol_function( $sym16$CYCL_STRING_ENDS_WITH_BY_TEST )
            : Symbols.symbol_function( $sym17$CYCL_SUPERSTRING_ ) );
    return Functions.funcall( fn, superstring, substring, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-subword-index.lisp", position = 5206L)
  public static SubLObject removal_conjunctive_subword_index_destructure(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pred = NIL;
    SubLObject substring = NIL;
    SubLObject superstring_var = NIL;
    SubLObject term_var = NIL;
    SubLObject substring_pred = NIL;
    SubLObject mt = NIL;
    SubLObject permutation = NIL;
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject this_mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
      this_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != el_utilities.el_binary_formula_p( asent ) )
        {
          thread.resetMultipleValues();
          final SubLObject this_pred = el_utilities.unmake_binary_formula( asent );
          final SubLObject arg1 = thread.secondMultipleValue();
          final SubLObject arg2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( this_pred.eql( $const4$equalStrings_CaseInsensitive ) )
          {
            if( NIL == superstring_var || superstring_var.eql( arg1 ) )
            {
              substring = arg2;
              superstring_var = arg1;
              substring_pred = this_pred;
              permutation = ConsesLow.cons( ONE_INTEGER, permutation );
            }
          }
          else if( NIL != subl_promotions.memberP( this_pred, $list3, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == superstring_var || superstring_var.eql( arg2 ) )
            {
              substring = arg1;
              superstring_var = arg2;
              substring_pred = this_pred;
              permutation = ConsesLow.cons( ONE_INTEGER, permutation );
            }
          }
          else if( NIL != conses_high.member( this_pred, lexicon_subword_index.non_trie_subword_preds(), UNPROVIDED, UNPROVIDED ) && ( NIL == superstring_var || superstring_var.eql( arg2 ) ) )
          {
            pred = this_pred;
            term_var = arg1;
            superstring_var = arg2;
            mt = this_mt;
            permutation = ConsesLow.cons( ZERO_INTEGER, permutation );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    permutation = Sequences.nreverse( permutation );
    return Values.values( pred, substring, superstring_var, term_var, substring_pred, mt, permutation );
  }

  public static SubLObject declare_removal_modules_subword_index_file()
  {
    SubLFiles.declareFunction( me, "removal_conjunctive_subword_index_applicability", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_subword_index_cost", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_subword_index_expand", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_substring_matchesP", "REMOVAL-SUBSTRING-MATCHES?", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_subword_index_destructure", "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-DESTRUCTURE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_subword_index_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_subword_index_file()
  {
    inference_modules.inference_conjunctive_removal_module( $kw0$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX, $list1 );
    utilities_macros.note_funcall_helper_function( $sym5$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY );
    utilities_macros.note_funcall_helper_function( $sym6$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST );
    utilities_macros.note_funcall_helper_function( $sym12$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_subword_index_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_subword_index_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_subword_index_file();
  }
  static
  {
    me = new removal_modules_subword_index();
    $kw0$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX = makeKeyword( "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "APPLICABILITY" ), makeSymbol( "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY" ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND" ), makeKeyword(
            "DOCUMENTATION" ), makeString( "(#$and (PRED ?X ?Y) (SUBSTRING-PRED SUBSTRING ?Y)) using the subword index. Cf. #$indexSubWordsForArg." ), makeKeyword( "EXAMPLE" ), makeString(
                "(#$and (#$comment ?TERM ?COMMENT) (#$substring ?COMMENT \"more obtuse\"))" )
    } );
    $list2 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "suffixSubstring" ) ), constant_handles.reader_make_constant_shell( makeString( "substring" ) ), constant_handles
        .reader_make_constant_shell( makeString( "prefixSubstring" ) ), constant_handles.reader_make_constant_shell( makeString( "prefixSubstring-CaseInsensitive" ) ), constant_handles.reader_make_constant_shell(
            makeString( "substring-CaseInsensitive" ) ), constant_handles.reader_make_constant_shell( makeString( "suffixSubstring-CaseInsensitive" ) ) );
    $const4$equalStrings_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "equalStrings-CaseInsensitive" ) );
    $sym5$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_APPLICABILITY = makeSymbol( "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-APPLICABILITY" );
    $sym6$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_COST = makeSymbol( "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-COST" );
    $const7$substring = constant_handles.reader_make_constant_shell( makeString( "substring" ) );
    $kw8$ON = makeKeyword( "ON" );
    $kw9$OFF = makeKeyword( "OFF" );
    $sym10$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $kw11$EVAL = makeKeyword( "EVAL" );
    $sym12$REMOVAL_CONJUNCTIVE_SUBWORD_INDEX_EXPAND = makeSymbol( "REMOVAL-CONJUNCTIVE-SUBWORD-INDEX-EXPAND" );
    $const13$prefixSubstring_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "prefixSubstring-CaseInsensitive" ) );
    $sym14$CYCL_STRING_STARTS_WITH_BY_TEST = makeSymbol( "CYCL-STRING-STARTS-WITH-BY-TEST" );
    $const15$suffixSubstring = constant_handles.reader_make_constant_shell( makeString( "suffixSubstring" ) );
    $sym16$CYCL_STRING_ENDS_WITH_BY_TEST = makeSymbol( "CYCL-STRING-ENDS-WITH-BY-TEST" );
    $sym17$CYCL_SUPERSTRING_ = makeSymbol( "CYCL-SUPERSTRING?" );
    $list18 = ConsesLow.list( makeSymbol( "THIS-MT" ), makeSymbol( "ASENT" ) );
  }
}
/*
 * 
 * Total time: 126 ms
 * 
 */