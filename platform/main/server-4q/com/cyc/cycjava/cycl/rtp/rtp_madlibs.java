package com.cyc.cycjava.cycl.rtp;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.pph_methods;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_madlibs
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_madlibs";
  public static final String myFingerPrint = "0decf2a5592c6b7a21007505a46bc2b752058cdd8f8268b9143cc4fa2ed7c727";
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
  private static SubLSymbol $madlib_get_instances_caching_state$;
  private static final SubLObject $const0$assertTemplate_Reln;
  private static final SubLObject $const1$queryTemplate_Reln;
  private static final SubLList $list2;
  private static final SubLString $str3$MAD_LIBS_NOTE__temporarily_puntin;
  private static final SubLSymbol $kw4$IGNORE;
  private static final SubLObject $const5$CycLSentence_Assertible;
  private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const7$EverythingPSC;
  private static final SubLInteger $int8$100;
  private static final SubLSymbol $sym9$MADLIB_GET_INSTANCES;
  private static final SubLObject $const10$PositiveInteger;
  private static final SubLObject $const11$PositiveNumber;
  private static final SubLInteger $int12$30;
  private static final SubLSymbol $sym13$GENERATE_RANDOM_NONZERO_NUMBER;
  private static final SubLInteger $int14$1000;
  private static final SubLObject $const15$NonNegativeInteger;
  private static final SubLObject $const16$NonNegativeNumber;
  private static final SubLSymbol $sym17$RANDOM;
  private static final SubLSymbol $kw18$ASCENDING;
  private static final SubLObject $const19$GenericInstanceFn;
  private static final SubLSymbol $sym20$_MADLIB_GET_INSTANCES_CACHING_STATE_;
  private static final SubLList $list21;
  private static final SubLObject $const22$NLPatternList;
  private static final SubLObject $const23$NPTemplate;
  private static final SubLObject $const24$City;
  private static final SubLObject $const25$County;
  private static final SubLObject $const26$STemplate;
  private static final SubLObject $const27$SomeExampleFn;
  private static final SubLObject $const28$NumberTemplate;
  private static final SubLObject $const29$NLPattern_Term;
  private static final SubLObject $const30$posPredForTemplateCategory;
  private static final SubLObject $const31$TemplateParsingMt;
  private static final SubLObject $const32$NLPattern_Word;
  private static final SubLObject $const33$TemplateSententialMarker;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLObject $const36$Verb;
  private static final SubLObject $const37$infinitive;
  private static final SubLObject $const38$SpeechPartPredicate;
  private static final SubLList $list39;
  private static final SubLObject $const40$ThirdPerson_NLAttr;
  private static final SubLObject $const41$Singular_NLAttr;
  private static final SubLObject $const42$thirdPersonSg_Generic;

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 1088L)
  public static SubLObject rtp_madlibs_formula_p(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.el_formula_p( formula ) )
    {
      final SubLObject operator = cycl_utilities.formula_operator( formula );
      return makeBoolean( NIL != forts.fort_p( operator ) && ( NIL != genl_predicates.genl_predicateP( operator, $const0$assertTemplate_Reln, mt, UNPROVIDED ) || NIL != genl_predicates.genl_predicateP( operator,
          $const1$queryTemplate_Reln, mt, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 1501L)
  public static SubLObject rtp_generate_madlibs_via_defn(final SubLObject passed)
  {
    return rtp_generate_madlibs( cycl_utilities.formula_arg1( passed, UNPROVIDED ), cycl_utilities.formula_arg2( passed, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 1815L)
  public static SubLObject rtp_generate_madlibs(final SubLObject spec, final SubLObject this_many, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula = ( NIL != assertion_handles.assertion_p( spec ) ) ? assertions_high.assertion_formula( spec ) : spec;
    if( NIL == rtp_madlibs_formula_p( formula, mt ) )
    {
      return NIL;
    }
    final SubLObject ret_pairs = set.new_set( Symbols.symbol_function( EQUALP ), this_many );
    SubLObject current;
    final SubLObject datum = current = formula;
    SubLObject pred = NIL;
    SubLObject template_type = NIL;
    SubLObject reln = NIL;
    SubLObject syntax = NIL;
    SubLObject semantics = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    template_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    reln = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    syntax = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    semantics = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( !cycl_utilities.formula_arg0( semantics ).equal( reln ) )
      {
        Errors.warn( $str3$MAD_LIBS_NOTE__temporarily_puntin );
        return NIL;
      }
      final SubLObject keywords_found = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
      SubLObject reln_arity = arity.arity( reln );
      SubLObject number = ZERO_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( semantics, $kw4$IGNORE );
      SubLObject this_key = NIL;
      this_key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        number = Numbers.add( number, ONE_INTEGER );
        if( this_key.isKeyword() )
        {
          dictionary.dictionary_enter( keywords_found, number, this_key );
        }
        cdolist_list_var = cdolist_list_var.rest();
        this_key = cdolist_list_var.first();
      }
      if( reln_arity.numE( ZERO_INTEGER ) )
      {
        reln_arity = Numbers.max( dictionary.dictionary_keys( keywords_found ), EMPTY_SUBL_OBJECT_ARRAY );
      }
      SubLObject i;
      SubLObject synsem_pair;
      SubLObject this_arg;
      SubLObject the_syn;
      SubLObject the_sem;
      for( i = NIL, i = ZERO_INTEGER; i.numL( this_many ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        synsem_pair = ConsesLow.list( syntax, semantics );
        cdolist_list_var = dictionary.dictionary_keys( keywords_found );
        this_arg = NIL;
        this_arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          the_syn = madlib_prep( synsem_pair, dictionary.dictionary_lookup( keywords_found, this_arg, UNPROVIDED ), ( NIL != subl_promotions.memberP( $const5$CycLSentence_Assertible, kb_accessors.argn_isa( reln,
              this_arg, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) ) ? madlib_random_sentence_for_reln( reln, this_arg )
                  : list_utilities.random_element( madlib_get_instances( kb_accessors.argn_isa( reln, this_arg, UNPROVIDED ), kb_accessors.argn_genl( reln, this_arg, UNPROVIDED ), mt ) ) );
          the_sem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          synsem_pair = ConsesLow.list( the_syn, the_sem );
          cdolist_list_var = cdolist_list_var.rest();
          this_arg = cdolist_list_var.first();
        }
        set.set_add( ConsesLow.list( madlib_complete( synsem_pair.first(), UNPROVIDED ), conses_high.second( synsem_pair ) ), ret_pairs );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    }
    return ret_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 3617L)
  public static SubLObject madlib_random_sentence_for_reln(final SubLObject reln, final SubLObject arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject the_extent = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym6$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const7$EverythingPSC, thread );
      the_extent = kb_mapping.gather_predicate_extent_index( reln, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != list_utilities.proper_list_p( the_extent ) )
    {
      return cycl_utilities.formula_arg( assertions_high.assertion_formula( list_utilities.random_element( the_extent ) ), arg, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4068L)
  public static SubLObject madlib_list_of_n_numbers_using(final SubLObject n, final SubLObject the_func, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = $int8$100;
    }
    SubLObject numbers = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      numbers = ConsesLow.cons( Functions.funcall( the_func, limit ), numbers );
    }
    return numbers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
  public static SubLObject clear_madlib_get_instances()
  {
    final SubLObject cs = $madlib_get_instances_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
  public static SubLObject remove_madlib_get_instances(final SubLObject isas, final SubLObject v_genls, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $madlib_get_instances_caching_state$.getGlobalValue(), ConsesLow.list( isas, v_genls, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
  public static SubLObject madlib_get_instances_internal(SubLObject isas, SubLObject v_genls, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( $const10$PositiveInteger, isas, UNPROVIDED, UNPROVIDED ) || NIL != subl_promotions.memberP( $const11$PositiveNumber, isas, UNPROVIDED, UNPROVIDED ) )
    {
      return list_utilities.flatten( ConsesLow.list( madlib_list_of_n_numbers_using( $int12$30, Symbols.symbol_function( $sym13$GENERATE_RANDOM_NONZERO_NUMBER ), FIVE_INTEGER ), madlib_list_of_n_numbers_using(
          FIVE_INTEGER, Symbols.symbol_function( $sym13$GENERATE_RANDOM_NONZERO_NUMBER ), $int14$1000 ) ) );
    }
    if( NIL != subl_promotions.memberP( $const15$NonNegativeInteger, isas, UNPROVIDED, UNPROVIDED ) || NIL != subl_promotions.memberP( $const16$NonNegativeNumber, isas, UNPROVIDED, UNPROVIDED ) )
    {
      return list_utilities.flatten( ConsesLow.list( madlib_list_of_n_numbers_using( $int12$30, Symbols.symbol_function( $sym17$RANDOM ), FIVE_INTEGER ), madlib_list_of_n_numbers_using( FIVE_INTEGER, Symbols
          .symbol_function( $sym17$RANDOM ), $int14$1000 ) ) );
    }
    isas = cardinality_estimates.sort_by_generality_estimate( isas, $kw18$ASCENDING );
    if( NIL != v_genls )
    {
      v_genls = cardinality_estimates.sort_by_generality_estimate( v_genls, $kw18$ASCENDING );
    }
    final SubLObject tmp = ( mt.eql( $const7$EverythingPSC ) || mt.eql( pph_vars.$pph_domain_mt$.getDynamicValue( thread ) ) ) ? isa.all_fort_instances_in_all_mts( isas.first() )
        : isa.instances( isas.first(), mt, UNPROVIDED );
    SubLObject tmp_list = NIL;
    final SubLObject single_isasP = Numbers.numE( Sequences.length( isas ), ONE_INTEGER );
    SubLObject cdolist_list_var = tmp;
    SubLObject this_isa = NIL;
    this_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( ( NIL != single_isasP || NIL != isa.all_isaP( this_isa, isas.rest(), mt, UNPROVIDED ) ) && ( NIL == v_genls || NIL != isa.all_isaP( this_isa, v_genls, mt, UNPROVIDED ) ) )
      {
        tmp_list = ConsesLow.cons( this_isa, tmp_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_isa = cdolist_list_var.first();
    }
    return ( NIL != tmp_list ) ? tmp_list : ConsesLow.list( ConsesLow.list( $const19$GenericInstanceFn, ( NIL != list_utilities.proper_list_p( v_genls ) ) ? v_genls.first() : isas.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 4525L)
  public static SubLObject madlib_get_instances(final SubLObject isas, final SubLObject v_genls, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    SubLObject caching_state = $madlib_get_instances_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym9$MADLIB_GET_INSTANCES, $sym20$_MADLIB_GET_INSTANCES_CACHING_STATE_, NIL, EQUALP, THREE_INTEGER, EIGHT_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( isas, v_genls, mt );
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
        if( isas.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( v_genls.equalp( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equalp( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( madlib_get_instances_internal( isas, v_genls, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( isas, v_genls, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 6060L)
  public static SubLObject madlib_prep(final SubLObject pair, final SubLObject keyword, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !pair.isList() || !pair.first().isList() )
    {
      return pair;
    }
    SubLObject syntax = NIL;
    SubLObject semantics = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pair, pair, $list21 );
    syntax = pair.first();
    SubLObject current = pair.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pair, $list21 );
    semantics = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = syntax;
      SubLObject branch = NIL;
      branch = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !branch.eql( $const22$NLPatternList ) )
        {
          if( !branch.isList() )
          {
            result = ConsesLow.cons( branch, result );
          }
          else if( NIL != rtp_type_checkers.valid_rtp_slotted_itemP( branch ) )
          {
            SubLObject cdolist_list_var_$1;
            final SubLObject args = cdolist_list_var_$1 = cycl_utilities.formula_args( branch, $kw4$IGNORE );
            SubLObject this_twig = NIL;
            this_twig = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              thread.resetMultipleValues();
              final SubLObject the_syn = madlib_prep( ConsesLow.list( ConsesLow.list( this_twig ), semantics ), keyword, v_term );
              final SubLObject the_sem = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject cdolist_list_var_$2 = the_syn;
              SubLObject this_syn = NIL;
              this_syn = cdolist_list_var_$2.first();
              while ( NIL != cdolist_list_var_$2)
              {
                result = ConsesLow.cons( this_syn, result );
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                this_syn = cdolist_list_var_$2.first();
              }
              semantics = the_sem;
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              this_twig = cdolist_list_var_$1.first();
            }
          }
          else if( NIL != rtp_type_checkers.valid_rtp_recursive_itemP( branch, keyword ) )
          {
            final SubLObject template = rtp_type_checkers.recursive_item_template_category( branch );
            if( template.eql( $const23$NPTemplate ) )
            {
              if( NIL != pph_utilities.pph_isaP( v_term, $const24$City, UNPROVIDED ) )
              {
                result = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn_citywithstateorprovinceabbreviation(), v_term ), result );
              }
              else if( NIL != pph_utilities.pph_isaP( v_term, $const25$County, UNPROVIDED ) )
              {
                result = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn_countywithstateorprovincename(), v_term ), result );
              }
              else
              {
                result = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn_np(), v_term ), result );
              }
            }
            else if( template.eql( $const26$STemplate ) )
            {
              if( NIL != v_term )
              {
                result = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn(), v_term ), result );
              }
              else
              {
                result = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn(), ConsesLow.list( $const27$SomeExampleFn, $const26$STemplate ) ), result );
              }
            }
            else if( template.eql( $const28$NumberTemplate ) )
            {
              result = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn(), v_term ), result );
            }
            else
            {
              result = ConsesLow.cons( ConsesLow.cons( $const29$NLPattern_Term, ConsesLow.list( v_term, cycl_utilities.formula_arg1( assertions_high.assertion_formula( kb_mapping.gather_gaf_arg_index( template,
                  TWO_INTEGER, $const30$posPredForTemplateCategory, $const31$TemplateParsingMt, UNPROVIDED ).first() ), UNPROVIDED ) ) ), result );
            }
          }
          else if( NIL != rtp_type_checkers.rtp_word_itemP( branch ) )
          {
            result = ConsesLow.cons( ConsesLow.cons( $const32$NLPattern_Word, branch ), result );
          }
          else if( cycl_utilities.formula_arg0( branch ).eql( $const32$NLPattern_Word ) )
          {
            result = ConsesLow.cons( branch, result );
          }
          else if( NIL != rtp_type_checkers.optional_template_item( branch ) )
          {
            SubLObject relevant = NIL;
            SubLObject cdolist_list_var_$3 = cycl_utilities.formula_args( branch, UNPROVIDED );
            SubLObject this_option = NIL;
            this_option = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              if( NIL == pph_utilities.pph_isaP( this_option, $const33$TemplateSententialMarker, UNPROVIDED ) )
              {
                relevant = ConsesLow.cons( this_option, relevant );
              }
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              this_option = cdolist_list_var_$3.first();
            }
            if( NIL != relevant )
            {
              result = ConsesLow.cons( madlib_prep( ConsesLow.list( ConsesLow.cons( cycl_utilities.formula_arg0( branch ), relevant ), semantics ), keyword, v_term ), result );
            }
          }
          else
          {
            result = ConsesLow.cons( branch, result );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        branch = cdolist_list_var.first();
      }
      return Values.values( Sequences.reverse( result ), Sequences.substitute( v_term, keyword, semantics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pair, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 8648L)
  public static SubLObject madlib_complete(final SubLObject this_template, SubLObject nested)
  {
    if( nested == UNPROVIDED )
    {
      nested = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject for_gen = ( NIL != nested ) ? NIL : ConsesLow.list( pph_functions.concatenatephrasesfn() );
    SubLObject found_tensed_verbP = NIL;
    SubLObject main_subject_guess = NIL;
    if( NIL == nested )
    {
      final SubLObject terms = cycl_utilities.formula_terms( this_template, $kw4$IGNORE );
      SubLObject rest;
      SubLObject this_item;
      SubLObject current;
      SubLObject datum;
      SubLObject func;
      SubLObject v_term;
      for( rest = NIL, rest = terms; NIL == main_subject_guess && NIL != rest; rest = rest.rest() )
      {
        this_item = rest.first();
        if( this_item.isList() && NIL != list_utilities.lengthE( this_item, TWO_INTEGER, UNPROVIDED ) )
        {
          datum = ( current = this_item );
          func = NIL;
          v_term = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
          func = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
          v_term = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( func.eql( pph_functions.termparaphrasefn_np() ) )
            {
              main_subject_guess = v_term;
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
          }
        }
      }
    }
    SubLObject cdolist_list_var = this_template;
    SubLObject this_item2 = NIL;
    this_item2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( this_item2.isString() )
      {
        if( NIL == pph_utilities.pph_final_punctuation_string_p( this_item2 ) )
        {
          for_gen = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.bestnlphraseofstringfn(), this_item2 ), for_gen );
        }
      }
      else if( NIL == pph_utilities.pph_isaP( this_item2, $const33$TemplateSententialMarker, UNPROVIDED ) )
      {
        if( NIL != rtp_type_checkers.rtp_word_sequence_itemP( this_item2 ) )
        {
          if( NIL != nested )
          {
            SubLObject the_sequence = NIL;
            SubLObject the_completion = NIL;
            SubLObject cdolist_list_var_$4 = cycl_utilities.formula_args( this_item2, UNPROVIDED );
            SubLObject this_bit = NIL;
            this_bit = cdolist_list_var_$4.first();
            while ( NIL != cdolist_list_var_$4)
            {
              the_completion = madlib_complete( ( NIL != rtp_type_checkers.rtp_word_itemP( this_bit ) ) ? ConsesLow.cons( $const32$NLPattern_Word, this_bit ) : ConsesLow.list( this_bit ), T ).first();
              if( NIL != the_completion )
              {
                the_sequence = ConsesLow.cons( the_completion, the_sequence );
              }
              cdolist_list_var_$4 = cdolist_list_var_$4.rest();
              this_bit = cdolist_list_var_$4.first();
            }
            return the_sequence;
          }
          SubLObject the_completion2 = NIL;
          SubLObject cdolist_list_var_$5 = cycl_utilities.formula_args( this_item2, UNPROVIDED );
          SubLObject this_bit2 = NIL;
          this_bit2 = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            the_completion2 = madlib_complete( ( NIL != rtp_type_checkers.rtp_word_itemP( this_bit2 ) ) ? ConsesLow.cons( $const32$NLPattern_Word, this_bit2 ) : ConsesLow.list( this_bit2 ), T ).first();
            if( NIL != the_completion2 )
            {
              for_gen = ConsesLow.cons( the_completion2, for_gen );
            }
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            this_bit2 = cdolist_list_var_$5.first();
          }
        }
        else if( cycl_utilities.formula_arg0( this_item2 ).eql( pph_functions.termparaphrasefn_np() ) )
        {
          for_gen = ConsesLow.cons( this_item2, for_gen );
        }
        else if( NIL != rtp_type_checkers.rtp_cyc_term_item( this_item2 ) )
        {
          for_gen = ConsesLow.cons( el_utilities.make_binary_formula( pph_functions.termparaphrasefn_constrained(), madlib_complete_choose_pospred( cycl_utilities.formula_arg2( this_item2, UNPROVIDED ) ), cycl_utilities
              .formula_arg1( this_item2, UNPROVIDED ) ), for_gen );
        }
        else if( cycl_utilities.formula_arg0( this_item2 ).eql( $const32$NLPattern_Word ) )
        {
          SubLObject current2;
          final SubLObject datum2 = current2 = this_item2;
          SubLObject func2 = NIL;
          SubLObject word = NIL;
          SubLObject pos = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
          func2 = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
          word = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
          pos = current2.first();
          current2 = current2.rest();
          if( NIL == current2 )
          {
            final SubLObject the_pred = madlib_complete_choose_pospred( pos );
            if( NIL != found_tensed_verbP && NIL != pph_utilities.pph_genlP( pos, $const36$Verb, UNPROVIDED ) )
            {
              for_gen = ConsesLow.cons( el_utilities.make_binary_formula( pph_functions.bestnlwordformoflexemefn_constrained(), $const37$infinitive, word ), for_gen );
            }
            else if( NIL != pph_utilities.pph_genlP( pos, $const36$Verb, UNPROVIDED ) )
            {
              for_gen = ConsesLow.cons( el_utilities.make_binary_formula( pph_functions.bestnlwordformoflexemefn_constrained(), madlib_best_pred_for_term_and_tense( main_subject_guess, the_pred ), word ), for_gen );
              found_tensed_verbP = T;
            }
            else
            {
              for_gen = ConsesLow.cons( el_utilities.make_binary_formula( pph_functions.bestnlwordformoflexemefn_constrained(), the_pred, cycl_utilities.formula_arg1( this_item2, UNPROVIDED ) ), for_gen );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum2, $list35 );
          }
        }
        else if( NIL != rtp_type_checkers.rtp_word_itemP( this_item2 ) )
        {
          thread.resetMultipleValues();
          final SubLObject main_result = madlib_complete( ConsesLow.list( ConsesLow.cons( $const32$NLPattern_Word, this_item2 ) ), T );
          final SubLObject found_verbP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          for_gen = ConsesLow.cons( main_result.first(), for_gen );
          if( NIL != found_verbP )
          {
            found_tensed_verbP = T;
          }
        }
        else if( NIL != rtp_type_checkers.rtp_optional_template_itemP( this_item2 ) )
        {
          if( random.random( TWO_INTEGER ).numE( ZERO_INTEGER ) )
          {
            final SubLObject chosen = cycl_utilities.formula_arg( this_item2, number_utilities.f_1X( random.random( el_utilities.formula_arity( this_item2, UNPROVIDED ) ) ), UNPROVIDED );
            thread.resetMultipleValues();
            final SubLObject returned = madlib_complete( ConsesLow.list( chosen ), T );
            final SubLObject verbP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != rtp_type_checkers.rtp_word_sequence_itemP( chosen ) )
            {
              SubLObject cdolist_list_var_$6 = Sequences.reverse( returned );
              SubLObject this_bit3 = NIL;
              this_bit3 = cdolist_list_var_$6.first();
              while ( NIL != cdolist_list_var_$6)
              {
                for_gen = ConsesLow.cons( this_bit3, for_gen );
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                this_bit3 = cdolist_list_var_$6.first();
              }
            }
            else
            {
              for_gen = ConsesLow.cons( returned.first(), for_gen );
            }
            if( NIL != verbP )
            {
              found_tensed_verbP = T;
            }
          }
        }
        else if( NIL != rtp_type_checkers.rtp_required_itemP( this_item2 ) )
        {
          final SubLObject chosen = cycl_utilities.formula_arg( this_item2, number_utilities.f_1X( random.random( el_utilities.formula_arity( this_item2, UNPROVIDED ) ) ), UNPROVIDED );
          thread.resetMultipleValues();
          final SubLObject returned = madlib_complete( ConsesLow.list( chosen ), T );
          final SubLObject verbP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != rtp_type_checkers.rtp_word_sequence_itemP( chosen ) )
          {
            SubLObject cdolist_list_var_$7 = Sequences.reverse( returned );
            SubLObject this_bit3 = NIL;
            this_bit3 = cdolist_list_var_$7.first();
            while ( NIL != cdolist_list_var_$7)
            {
              for_gen = ConsesLow.cons( this_bit3, for_gen );
              cdolist_list_var_$7 = cdolist_list_var_$7.rest();
              this_bit3 = cdolist_list_var_$7.first();
            }
          }
          else
          {
            for_gen = ConsesLow.cons( returned.first(), for_gen );
          }
          if( NIL != verbP )
          {
            found_tensed_verbP = T;
          }
        }
        else
        {
          for_gen = ConsesLow.cons( this_item2, for_gen );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_item2 = cdolist_list_var.first();
    }
    if( NIL == nested )
    {
      main_subject_guess = NIL;
    }
    return Values.values( Sequences.reverse( for_gen ), found_tensed_verbP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 12982L)
  public static SubLObject madlib_complete_choose_pospred(final SubLObject pos)
  {
    if( NIL != isa.isa_in_any_mtP( pos, $const38$SpeechPartPredicate ) )
    {
      return pos;
    }
    if( NIL != pph_utilities.pph_genlP( pos, $const36$Verb, UNPROVIDED ) )
    {
      return list_utilities.random_element( $list39 );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-madlibs.lisp", position = 13522L)
  public static SubLObject madlib_best_pred_for_term_and_tense(final SubLObject v_term, final SubLObject tense)
  {
    if( pph_methods.pph_person( v_term ).eql( $const40$ThirdPerson_NLAttr ) && pph_methods.pph_number( v_term ).eql( $const41$Singular_NLAttr ) )
    {
      return pph_utilities.pph_unify_speech_part_preds( ConsesLow.list( $const42$thirdPersonSg_Generic, tense ) );
    }
    return tense;
  }

  public static SubLObject declare_rtp_madlibs_file()
  {
    SubLFiles.declareFunction( me, "rtp_madlibs_formula_p", "RTP-MADLIBS-FORMULA-P", 1, 1, false );
    SubLFiles.declareFunction( me, "rtp_generate_madlibs_via_defn", "RTP-GENERATE-MADLIBS-VIA-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_generate_madlibs", "RTP-GENERATE-MADLIBS", 2, 1, false );
    SubLFiles.declareFunction( me, "madlib_random_sentence_for_reln", "MADLIB-RANDOM-SENTENCE-FOR-RELN", 2, 0, false );
    SubLFiles.declareFunction( me, "madlib_list_of_n_numbers_using", "MADLIB-LIST-OF-N-NUMBERS-USING", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_madlib_get_instances", "CLEAR-MADLIB-GET-INSTANCES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_madlib_get_instances", "REMOVE-MADLIB-GET-INSTANCES", 2, 1, false );
    SubLFiles.declareFunction( me, "madlib_get_instances_internal", "MADLIB-GET-INSTANCES-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "madlib_get_instances", "MADLIB-GET-INSTANCES", 2, 1, false );
    SubLFiles.declareFunction( me, "madlib_prep", "MADLIB-PREP", 3, 0, false );
    SubLFiles.declareFunction( me, "madlib_complete", "MADLIB-COMPLETE", 1, 1, false );
    SubLFiles.declareFunction( me, "madlib_complete_choose_pospred", "MADLIB-COMPLETE-CHOOSE-POSPRED", 1, 0, false );
    SubLFiles.declareFunction( me, "madlib_best_pred_for_term_and_tense", "MADLIB-BEST-PRED-FOR-TERM-AND-TENSE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rtp_madlibs_file()
  {
    $madlib_get_instances_caching_state$ = SubLFiles.deflexical( "*MADLIB-GET-INSTANCES-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_rtp_madlibs_file()
  {
    memoization_state.note_globally_cached_function( $sym9$MADLIB_GET_INSTANCES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rtp_madlibs_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rtp_madlibs_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rtp_madlibs_file();
  }
  static
  {
    me = new rtp_madlibs();
    $madlib_get_instances_caching_state$ = null;
    $const0$assertTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "assertTemplate-Reln" ) );
    $const1$queryTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "queryTemplate-Reln" ) );
    $list2 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "TEMPLATE-TYPE" ), makeSymbol( "RELN" ), makeSymbol( "SYNTAX" ), makeSymbol( "SEMANTICS" ) );
    $str3$MAD_LIBS_NOTE__temporarily_puntin = makeString( "MAD LIBS NOTE: temporarily punting cases where semantics' arg0 isn't the reln" );
    $kw4$IGNORE = makeKeyword( "IGNORE" );
    $const5$CycLSentence_Assertible = constant_handles.reader_make_constant_shell( makeString( "CycLSentence-Assertible" ) );
    $sym6$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const7$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $int8$100 = makeInteger( 100 );
    $sym9$MADLIB_GET_INSTANCES = makeSymbol( "MADLIB-GET-INSTANCES" );
    $const10$PositiveInteger = constant_handles.reader_make_constant_shell( makeString( "PositiveInteger" ) );
    $const11$PositiveNumber = constant_handles.reader_make_constant_shell( makeString( "PositiveNumber" ) );
    $int12$30 = makeInteger( 30 );
    $sym13$GENERATE_RANDOM_NONZERO_NUMBER = makeSymbol( "GENERATE-RANDOM-NONZERO-NUMBER" );
    $int14$1000 = makeInteger( 1000 );
    $const15$NonNegativeInteger = constant_handles.reader_make_constant_shell( makeString( "NonNegativeInteger" ) );
    $const16$NonNegativeNumber = constant_handles.reader_make_constant_shell( makeString( "NonNegativeNumber" ) );
    $sym17$RANDOM = makeSymbol( "RANDOM" );
    $kw18$ASCENDING = makeKeyword( "ASCENDING" );
    $const19$GenericInstanceFn = constant_handles.reader_make_constant_shell( makeString( "GenericInstanceFn" ) );
    $sym20$_MADLIB_GET_INSTANCES_CACHING_STATE_ = makeSymbol( "*MADLIB-GET-INSTANCES-CACHING-STATE*" );
    $list21 = ConsesLow.list( makeSymbol( "SYNTAX" ), makeSymbol( "SEMANTICS" ) );
    $const22$NLPatternList = constant_handles.reader_make_constant_shell( makeString( "NLPatternList" ) );
    $const23$NPTemplate = constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) );
    $const24$City = constant_handles.reader_make_constant_shell( makeString( "City" ) );
    $const25$County = constant_handles.reader_make_constant_shell( makeString( "County" ) );
    $const26$STemplate = constant_handles.reader_make_constant_shell( makeString( "STemplate" ) );
    $const27$SomeExampleFn = constant_handles.reader_make_constant_shell( makeString( "SomeExampleFn" ) );
    $const28$NumberTemplate = constant_handles.reader_make_constant_shell( makeString( "NumberTemplate" ) );
    $const29$NLPattern_Term = constant_handles.reader_make_constant_shell( makeString( "NLPattern-Term" ) );
    $const30$posPredForTemplateCategory = constant_handles.reader_make_constant_shell( makeString( "posPredForTemplateCategory" ) );
    $const31$TemplateParsingMt = constant_handles.reader_make_constant_shell( makeString( "TemplateParsingMt" ) );
    $const32$NLPattern_Word = constant_handles.reader_make_constant_shell( makeString( "NLPattern-Word" ) );
    $const33$TemplateSententialMarker = constant_handles.reader_make_constant_shell( makeString( "TemplateSententialMarker" ) );
    $list34 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "TERM" ) );
    $list35 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "WORD" ), makeSymbol( "POS" ) );
    $const36$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const37$infinitive = constant_handles.reader_make_constant_shell( makeString( "infinitive" ) );
    $const38$SpeechPartPredicate = constant_handles.reader_make_constant_shell( makeString( "SpeechPartPredicate" ) );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "simplePresent-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "simplePast-Generic" ) ) );
    $const40$ThirdPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "ThirdPerson-NLAttr" ) );
    $const41$Singular_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Singular-NLAttr" ) );
    $const42$thirdPersonSg_Generic = constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Generic" ) );
  }
}
/*
 * 
 * Total time: 137 ms
 * 
 */