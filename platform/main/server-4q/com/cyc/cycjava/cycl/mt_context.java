package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_context
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mt_context";
  public static final String myFingerPrint = "ce7e5518990a3c7ef5cbccccde967c638c5a4835dcb979e9da707c94be977310";
  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 364L)
  public static SubLSymbol $mt_vectors$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 404L)
  public static SubLSymbol $too_general_cols$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 446L)
  public static SubLSymbol $score_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 12642L)
  public static SubLSymbol $mt_vector_files$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 12862L)
  public static SubLSymbol $mt_vectors_general_cols_file$;
  private static final SubLSymbol $sym0$_MT_VECTORS_;
  private static final SubLSymbol $sym1$_TOO_GENERAL_COLS_;
  private static final SubLSymbol $sym2$_SCORE_THRESHOLD_;
  private static final SubLFloat $float3$1_0e_5;
  private static final SubLSymbol $sym4$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLSymbol $sym5$CAR;
  private static final SubLInteger $int6$_3;
  private static final SubLInteger $int7$1000;
  private static final SubLObject $const8$thereExists;
  private static final SubLObject $const9$and;
  private static final SubLObject $const10$or;
  private static final SubLSymbol $sym11$EL_VARIABLE_P;
  private static final SubLObject $const12$Collection;
  private static final SubLObject $const13$Individual;
  private static final SubLObject $const14$Predicate;
  private static final SubLObject $const15$assertedSentence;
  private static final SubLObject $const16$genls;
  private static final SubLList $list17;
  private static final SubLObject $const18$isa;
  private static final SubLObject $const19$EverythingPSC;
  private static final SubLSymbol $kw20$INFERENCE_MODE;
  private static final SubLSymbol $kw21$MINIMAL;
  private static final SubLSymbol $kw22$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw23$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw24$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw25$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw26$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw27$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw28$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw29$MAX_TIME;
  private static final SubLSymbol $kw30$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw31$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float32$1_0;
  private static final SubLSymbol $kw33$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw34$HL;
  private static final SubLSymbol $kw35$CONTINUABLE_;
  private static final SubLSymbol $kw36$PRODUCTIVITY_LIMIT;
  private static final SubLInteger $int37$20000000;
  private static final SubLSymbol $kw38$DIRECTION;
  private static final SubLSymbol $kw39$INPUT;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$_;
  private static final SubLSymbol $sym42$SECOND;
  private static final SubLInteger $int43$_2;
  private static final SubLInteger $int44$100;
  private static final SubLObject $const45$Terrorism_Topic;
  private static final SubLSymbol $sym46$CDAR;
  private static final SubLObject $const47$mtTopic;
  private static final SubLList $list48;
  private static final SubLObject $const49$TKBSourceSpindle;
  private static final SubLObject $const50$mtSpindleMember;
  private static final SubLObject $const51$salientSpecForCollectionInTopic;
  private static final SubLObject $const52$salientPredicateSpaceForTopic;
  private static final SubLObject $const53$salientCollectionSpaceForTopic;
  private static final SubLObject $const54$salientIndividualForMt;
  private static final SubLSymbol $sym55$THIRD;
  private static final SubLSymbol $sym56$GAF_FORMULA;
  private static final SubLString $str57$____a__a_;
  private static final SubLObject $const58$MtUnionFn;
  private static final SubLSymbol $sym59$_;
  private static final SubLSymbol $sym60$_MT_VECTOR_FILES_;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$_MT_VECTORS_GENERAL_COLS_FILE_;
  private static final SubLString $str63$_cyc_top_data_mt_vectors_too_gene;

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 490L)
  public static SubLObject useful_mt_for_queryP(final SubLObject query, final SubLObject mt)
  {
    if( NIL == query || NIL == mt )
    {
      return NIL;
    }
    init_mt_vectors();
    final SubLObject query_context = find_context_of_complex_query( query );
    final SubLObject predicates_in_query = find_predicates_in_query( query );
    SubLObject score = NIL;
    final SubLObject mt_id = mt.isList() ? kb_utilities.compact_hl_external_id_string( narts_high.find_nart( mt ) ) : kb_utilities.compact_hl_external_id_string( mt );
    SubLObject cdolist_list_var = $mt_vectors$.getGlobalValue();
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( entry.first().equal( mt_id ) )
      {
        score = cosine_similarity( query_context, conses_high.second( entry ) );
        return check_topic_compatibility( query_context, predicates_in_query, score, mt_id );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 1224L)
  public static SubLObject check_topic_compatibility(final SubLObject v_context, final SubLObject preds, SubLObject score, final SubLObject mt_id)
  {
    final SubLObject cols = Mapping.mapcar( Symbols.symbol_function( $sym4$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING ), Mapping.mapcar( Symbols.symbol_function( $sym5$CAR ), v_context ) );
    final SubLObject topic_of_mt = find_topic_of_mt( mt_id );
    final SubLObject topic_membership = Numbers.add( check_membership_in_topic_cols( cols, topic_of_mt, mt_id ), check_membership_in_topic_preds( preds, topic_of_mt ) );
    if( topic_membership.numG( ZERO_INTEGER ) )
    {
      score = Numbers.multiply( score, FIFTEEN_INTEGER );
    }
    if( topic_membership.numE( $int6$_3 ) )
    {
      score = Numbers.divide( score, $int7$1000 );
    }
    if( topic_membership.numL( ZERO_INTEGER ) )
    {
      score = Numbers.divide( score, TEN_INTEGER );
    }
    if( NIL != topic_of_mt && topic_membership.numE( ZERO_INTEGER ) )
    {
      score = Numbers.divide( score, TEN_INTEGER );
    }
    return Numbers.numG( score, $score_threshold$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 1964L)
  public static SubLObject find_context_of_complex_query(final SubLObject query)
  {
    if( query.first().equal( $const8$thereExists ) )
    {
      return find_context_of_complex_query( ConsesLow.nth( TWO_INTEGER, query ) );
    }
    if( query.first().eql( $const9$and ) || query.first().eql( $const10$or ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = query.rest();
      SubLObject q = NIL;
      q = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.append( result, find_context_of_query( q ) );
        cdolist_list_var = cdolist_list_var.rest();
        q = cdolist_list_var.first();
      }
      return aggregate_results( result );
    }
    return find_context_of_query( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 2430L)
  public static SubLObject find_predicates_in_query(final SubLObject query)
  {
    if( query.first().equal( $const8$thereExists ) )
    {
      return find_predicates_in_query( ConsesLow.nth( TWO_INTEGER, query ) );
    }
    if( query.first().eql( $const9$and ) || query.first().eql( $const10$or ) )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym5$CAR ), query.rest() );
    }
    return ConsesLow.list( query.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 2738L)
  public static SubLObject find_context_of_query(final SubLObject query)
  {
    final SubLObject non_variables = Sequences.remove_if( Symbols.symbol_function( $sym11$EL_VARIABLE_P ), query.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject v_context = NIL;
    SubLObject cdolist_list_var = non_variables;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isa_in_any_mtP( v_term, $const12$Collection ) )
      {
        SubLObject lst = NIL;
        lst = ConsesLow.cons( ConsesLow.list( kb_utilities.compact_hl_external_id_string( v_term ), ONE_INTEGER ), lst );
        SubLObject cdolist_list_var_$1 = get_context_for_collection( v_term );
        SubLObject cols = NIL;
        cols = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          final SubLObject col = conses_high.cdar( cols );
          if( NIL == conses_high.member( col, $too_general_cols$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
          {
            lst = ConsesLow.cons( ConsesLow.list( kb_utilities.compact_hl_external_id_string( conses_high.cdar( cols ) ), ONE_INTEGER ), lst );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          cols = cdolist_list_var_$1.first();
        }
        v_context = ConsesLow.append( v_context, lst );
      }
      if( NIL != isa.isa_in_any_mtP( v_term, $const13$Individual ) && NIL == isa.isa_in_any_mtP( v_term, $const14$Predicate ) )
      {
        SubLObject lst = NIL;
        lst = ConsesLow.cons( ConsesLow.list( kb_utilities.compact_hl_external_id_string( v_term ), ONE_INTEGER ), lst );
        SubLObject cdolist_list_var_$2 = get_context_for_individual( v_term );
        SubLObject cols = NIL;
        cols = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          final SubLObject col = conses_high.cdar( cols );
          if( NIL == conses_high.member( col, $too_general_cols$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
          {
            lst = ConsesLow.cons( ConsesLow.list( kb_utilities.compact_hl_external_id_string( conses_high.cdar( cols ) ), ONE_INTEGER ), lst );
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          cols = cdolist_list_var_$2.first();
        }
        v_context = ConsesLow.append( v_context, lst );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return aggregate_results( v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 3948L)
  public static SubLObject get_context_for_collection(final SubLObject collection)
  {
    return ask_mt_query( ConsesLow.list( $const15$assertedSentence, ConsesLow.listS( $const16$genls, collection, $list17 ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 4081L)
  public static SubLObject get_context_for_individual(final SubLObject individual)
  {
    return ask_mt_query( ConsesLow.list( $const15$assertedSentence, ConsesLow.listS( $const18$isa, individual, $list17 ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 4214L)
  public static SubLObject ask_mt_query(final SubLObject query, SubLObject max_time, SubLObject mt, SubLObject indeterminate_terms)
  {
    if( max_time == UNPROVIDED )
    {
      max_time = FIVE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const19$EverythingPSC;
    }
    if( indeterminate_terms == UNPROVIDED )
    {
      indeterminate_terms = NIL;
    }
    return inference_kernel.new_cyc_query( query, mt, ConsesLow.list( new SubLObject[] { $kw20$INFERENCE_MODE, $kw21$MINIMAL, $kw22$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T, $kw23$ALLOW_INDETERMINATE_RESULTS_,
      indeterminate_terms, $kw24$DISJUNCTION_FREE_EL_VARS_POLICY, $kw25$COMPUTE_INTERSECTION, $kw26$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw27$NEW_TERMS_ALLOWED_, NIL, $kw28$COMPUTE_ANSWER_JUSTIFICATIONS_, T,
      $kw29$MAX_TIME, max_time, $kw30$MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER, $kw31$PROBABLY_APPROXIMATELY_DONE, $float32$1_0, $kw33$ANSWER_LANGUAGE, $kw34$HL, $kw35$CONTINUABLE_, T, $kw36$PRODUCTIVITY_LIMIT,
      $int37$20000000
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 4888L)
  public static SubLObject cosine_similarity(final SubLObject vector_1, final SubLObject vector_2)
  {
    SubLObject result = ZERO_INTEGER;
    SubLObject cdolist_list_var = vector_1;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = vector_2;
      SubLObject y = NIL;
      y = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        if( x.first().equal( y.first() ) && NIL == conses_high.member( x.first(), $too_general_cols$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          result = Numbers.add( result, Numbers.multiply( conses_high.second( x ), conses_high.second( y ) ) );
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        y = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 5247L)
  public static SubLObject get_mt_information_from_file(final SubLObject filename)
  {
    SubLObject result = NIL;
    SubLObject stream_var = NIL;
    try
    {
      SubLObject stream;
      SubLObject line;
      for( stream_var = ( stream = StreamsLow.open( filename, new SubLObject[] { $kw38$DIRECTION, $kw39$INPUT
      } ) ), line = NIL, line = reader.read( stream, NIL, UNPROVIDED, UNPROVIDED ); NIL != line; line = reader.read( stream, NIL, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( line, result );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != stream_var )
        {
          streams_high.close( stream_var, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 5525L)
  public static SubLObject find_useful_mts_for_query(final SubLObject query)
  {
    final SubLObject query_context = find_context_of_complex_query( query );
    final SubLObject predicates_in_query = find_predicates_in_query( query );
    SubLObject results = NIL;
    final SubLObject tkb_related_queryP = check_tkb_related_query( query_context, predicates_in_query );
    SubLObject cdolist_list_var = $mt_vectors$.getGlobalValue();
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == terrorism_related_mtP( entry.first() ) || NIL != tkb_related_queryP )
      {
        results = ConsesLow.cons( ConsesLow.list( entry.first(), cosine_similarity( query_context, conses_high.second( entry ) ) ), results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return sort_similarity_estimates( check_mt_topics( results, query_context, predicates_in_query ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 6193L)
  public static SubLObject check_tkb_related_query(final SubLObject query_context, final SubLObject preds)
  {
    final SubLObject cols = Mapping.mapcar( Symbols.symbol_function( $sym4$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING ), Mapping.mapcar( Symbols.symbol_function( $sym5$CAR ), query_context ) );
    return makeBoolean( check_membership_in_topic_cols( cols, $list40, UNPROVIDED ).numG( ZERO_INTEGER ) || check_membership_in_topic_preds( preds, $list40 ).numG( ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 6527L)
  public static SubLObject check_mt_topics(final SubLObject lst, final SubLObject v_context, final SubLObject preds)
  {
    final SubLObject sorted_lst = Sort.sort( lst, Symbols.symbol_function( $sym41$_ ), Symbols.symbol_function( $sym42$SECOND ) );
    SubLObject result = NIL;
    final SubLObject cols = Mapping.mapcar( Symbols.symbol_function( $sym4$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING ), Mapping.mapcar( Symbols.symbol_function( $sym5$CAR ), v_context ) );
    SubLObject count;
    SubLObject entry;
    SubLObject topic_of_mt;
    SubLObject topic_membership;
    for( count = NIL, count = ZERO_INTEGER; count.numL( TWENTY_INTEGER ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      entry = ConsesLow.nth( count, sorted_lst );
      topic_of_mt = find_topic_of_mt( entry.first() );
      topic_membership = Numbers.add( check_membership_in_topic_cols( cols, topic_of_mt, entry.first() ), check_membership_in_topic_preds( preds, topic_of_mt ) );
      if( NIL != topic_of_mt && topic_membership.numG( ZERO_INTEGER ) )
      {
        result = ConsesLow.cons( ConsesLow.list( entry.first(), Numbers.multiply( conses_high.second( entry ), FIFTEEN_INTEGER ) ), result );
      }
      if( NIL != topic_of_mt && topic_membership.numE( $int43$_2 ) )
      {
        result = ConsesLow.cons( ConsesLow.list( entry.first(), Numbers.divide( conses_high.second( entry ), $int44$100 ) ), result );
      }
      if( NIL != topic_of_mt && topic_membership.numL( ZERO_INTEGER ) )
      {
        result = ConsesLow.cons( ConsesLow.list( entry.first(), Numbers.divide( conses_high.second( entry ), TEN_INTEGER ) ), result );
      }
      if( NIL != topic_of_mt && topic_membership.numE( ZERO_INTEGER ) )
      {
        result = ConsesLow.cons( ConsesLow.list( entry.first(), Numbers.divide( conses_high.second( entry ), TEN_INTEGER ) ), result );
      }
      if( NIL == topic_of_mt )
      {
        result = ConsesLow.cons( ConsesLow.list( entry.first(), conses_high.second( entry ) ), result );
      }
    }
    SubLObject cdotimes_end_var;
    SubLObject count2;
    SubLObject entry2;
    for( cdotimes_end_var = Numbers.subtract( Sequences.length( sorted_lst ), TEN_INTEGER ), count2 = NIL, count2 = ZERO_INTEGER; count2.numL( cdotimes_end_var ); count2 = Numbers.add( count2, ONE_INTEGER ) )
    {
      entry2 = ConsesLow.nth( Numbers.add( count2, TEN_INTEGER ), sorted_lst );
      result = ConsesLow.cons( ConsesLow.list( entry2.first(), conses_high.second( entry2 ) ), result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 7951L)
  public static SubLObject find_topic_of_mt(final SubLObject mt_id)
  {
    if( NIL != terrorism_related_mtP( mt_id ) )
    {
      return ConsesLow.list( $const45$Terrorism_Topic );
    }
    final SubLObject mt = kb_utilities.find_object_by_compact_hl_external_id_string( mt_id );
    return Mapping.mapcar( Symbols.symbol_function( $sym46$CDAR ), ask_mt_query( ConsesLow.listS( $const47$mtTopic, mt, $list48 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 8215L)
  public static SubLObject terrorism_related_mtP(final SubLObject mt_id)
  {
    final SubLObject mt = kb_utilities.find_object_by_compact_hl_external_id_string( mt_id );
    return Equality.eql( $const49$TKBSourceSpindle, kb_mapping_utilities.fpred_value_in_any_mt( mt, $const50$mtSpindleMember, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 8418L)
  public static SubLObject find_cols_for_topic_1(final SubLObject topic)
  {
    final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt( topic, $const51$salientSpecForCollectionInTopic, THREE_INTEGER, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL != gafs )
    {
      SubLObject cdolist_list_var = gafs;
      SubLObject gaf = NIL;
      gaf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject formula = assertions_high.gaf_formula( gaf );
        result = ConsesLow.cons( conses_high.third( formula ), result );
        cdolist_list_var = cdolist_list_var.rest();
        gaf = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 8751L)
  public static SubLObject find_preds_for_topic(final SubLObject topic)
  {
    final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt( topic, $const52$salientPredicateSpaceForTopic, THREE_INTEGER, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL != gafs )
    {
      SubLObject cdolist_list_var = gafs;
      SubLObject gaf = NIL;
      gaf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject formula = assertions_high.gaf_formula( gaf );
        result = ConsesLow.cons( ConsesLow.list( conses_high.second( formula ), conses_high.third( formula ) ), result );
        cdolist_list_var = cdolist_list_var.rest();
        gaf = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 9090L)
  public static SubLObject find_cols_for_topic_2(final SubLObject topic)
  {
    final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt( topic, $const53$salientCollectionSpaceForTopic, THREE_INTEGER, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL != gafs )
    {
      SubLObject cdolist_list_var = gafs;
      SubLObject gaf = NIL;
      gaf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject formula = assertions_high.gaf_formula( gaf );
        result = ConsesLow.cons( ConsesLow.list( conses_high.second( formula ), conses_high.third( formula ) ), result );
        cdolist_list_var = cdolist_list_var.rest();
        gaf = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 9430L)
  public static SubLObject check_membership_in_topic_cols(final SubLObject lst, final SubLObject lst_of_topics, SubLObject mt_id)
  {
    if( mt_id == UNPROVIDED )
    {
      mt_id = NIL;
    }
    if( NIL != mt_id )
    {
      final SubLObject mt = kb_utilities.find_object_by_compact_hl_external_id_string( mt_id );
      final SubLObject individuals = find_individual_for_mt( mt );
      if( NIL != individuals )
      {
        if( NIL != conses_high.intersection( individuals, lst, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          return ONE_INTEGER;
        }
        return $int6$_3;
      }
    }
    if( NIL == lst_of_topics )
    {
      return ZERO_INTEGER;
    }
    SubLObject lst_of_cols = NIL;
    SubLObject cdolist_list_var = lst_of_topics;
    SubLObject topic = NIL;
    topic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lst_of_cols = ConsesLow.append( lst_of_cols, find_cols_for_topic_1( topic ) );
      cdolist_list_var = cdolist_list_var.rest();
      topic = cdolist_list_var.first();
    }
    cdolist_list_var = lst_of_cols;
    SubLObject topic_col = NIL;
    topic_col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$4 = lst;
      SubLObject col = NIL;
      col = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        if( NIL != genls.genlP( col, topic_col, UNPROVIDED, UNPROVIDED ) )
        {
          return ONE_INTEGER;
        }
        if( NIL != disjoint_with.disjoint_withP( col, topic_col, $const19$EverythingPSC, UNPROVIDED ) )
        {
          return MINUS_ONE_INTEGER;
        }
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        col = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      topic_col = cdolist_list_var.first();
    }
    cdolist_list_var = lst;
    SubLObject col2 = NIL;
    col2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$5 = lst_of_topics;
      SubLObject topic2 = NIL;
      topic2 = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        SubLObject cdolist_list_var_$6;
        final SubLObject cols_spaces = cdolist_list_var_$6 = find_cols_for_topic_2( topic2 );
        SubLObject cols_space = NIL;
        cols_space = cdolist_list_var_$6.first();
        while ( NIL != cdolist_list_var_$6)
        {
          final SubLObject lower = cols_space.first();
          final SubLObject upper = conses_high.second( cols_space );
          if( NIL != genls.genlP( col2, upper, UNPROVIDED, UNPROVIDED ) && NIL != genls.genlP( lower, col2, UNPROVIDED, UNPROVIDED ) )
          {
            return ONE_INTEGER;
          }
          cdolist_list_var_$6 = cdolist_list_var_$6.rest();
          cols_space = cdolist_list_var_$6.first();
        }
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        topic2 = cdolist_list_var_$5.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col2 = cdolist_list_var.first();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 10618L)
  public static SubLObject find_individual_for_mt(final SubLObject mt)
  {
    final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_any_mt( mt, $const54$salientIndividualForMt, ONE_INTEGER, UNPROVIDED );
    if( NIL != gafs )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym55$THIRD ), Mapping.mapcar( Symbols.symbol_function( $sym56$GAF_FORMULA ), gafs ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 10831L)
  public static SubLObject check_membership_in_topic_preds(final SubLObject lst, final SubLObject lst_of_topics)
  {
    if( NIL == lst_of_topics )
    {
      return ZERO_INTEGER;
    }
    SubLObject cdolist_list_var = lst;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$7 = lst_of_topics;
      SubLObject topic = NIL;
      topic = cdolist_list_var_$7.first();
      while ( NIL != cdolist_list_var_$7)
      {
        SubLObject cdolist_list_var_$8;
        final SubLObject pred_spaces = cdolist_list_var_$8 = find_preds_for_topic( topic );
        SubLObject pred_space = NIL;
        pred_space = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          final SubLObject lower = pred_space.first();
          final SubLObject upper = conses_high.second( pred_space );
          if( NIL != genl_predicates.genl_predicate_in_any_mtP( pred, upper ) && NIL != genl_predicates.genl_predicate_in_any_mtP( lower, pred ) )
          {
            return ONE_INTEGER;
          }
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          pred_space = cdolist_list_var_$8.first();
        }
        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
        topic = cdolist_list_var_$7.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 11391L)
  public static SubLObject get_all_mt_vectors()
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = $mt_vector_files$.getGlobalValue();
    SubLObject file = NIL;
    file = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$9 = get_mt_information_from_file( file );
      SubLObject entry = NIL;
      entry = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        result = ConsesLow.cons( entry, result );
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        entry = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      file = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 11603L)
  public static SubLObject sort_similarity_estimates(final SubLObject lst)
  {
    final SubLObject result = Sort.sort( lst, Symbols.symbol_function( $sym41$_ ), Symbols.symbol_function( $sym42$SECOND ) );
    SubLObject ret_value = NIL;
    final SubLObject max_val = conses_high.second( result.first() );
    SubLObject cdolist_list_var = result;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( conses_high.second( x ).numG( ZERO_INTEGER ) && conses_high.second( x ).numG( Numbers.divide( max_val, TEN_INTEGER ) ) )
      {
        PrintLow.format( T, $str57$____a__a_, kb_utilities.find_object_by_compact_hl_external_id_string( x.first() ), conses_high.second( x ) );
        ret_value = ConsesLow.cons( kb_utilities.find_object_by_compact_hl_external_id_string( x.first() ), ret_value );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    if( Sequences.length( ret_value ).numG( ONE_INTEGER ) )
    {
      ret_value = ConsesLow.cons( $const58$MtUnionFn, ret_value );
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 12188L)
  public static SubLObject aggregate_results(final SubLObject lst)
  {
    final SubLObject all_collections = Mapping.mapcar( Symbols.symbol_function( $sym5$CAR ), lst );
    SubLObject result = NIL;
    final SubLObject sum = Sequences.creduce( Symbols.symbol_function( $sym59$_ ), Mapping.mapcar( Symbols.symbol_function( $sym42$SECOND ), lst ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = Sequences.remove_duplicates( all_collections, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject freq = ZERO_INTEGER;
      SubLObject cdolist_list_var_$10 = lst;
      SubLObject entry = NIL;
      entry = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        if( entry.first().equal( col ) )
        {
          freq = Numbers.add( freq, conses_high.second( entry ) );
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        entry = cdolist_list_var_$10.first();
      }
      result = ConsesLow.cons( ConsesLow.list( col, Numbers.divide( freq, sum ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-context.lisp", position = 12962L)
  public static SubLObject init_mt_vectors()
  {
    if( NIL == $mt_vectors$.getGlobalValue() )
    {
      $mt_vectors$.setGlobalValue( get_all_mt_vectors() );
      $too_general_cols$.setGlobalValue( get_mt_information_from_file( $mt_vectors_general_cols_file$.getGlobalValue() ) );
    }
    return NIL;
  }

  public static SubLObject declare_mt_context_file()
  {
    SubLFiles.declareFunction( me, "useful_mt_for_queryP", "USEFUL-MT-FOR-QUERY?", 2, 0, false );
    SubLFiles.declareFunction( me, "check_topic_compatibility", "CHECK-TOPIC-COMPATIBILITY", 4, 0, false );
    SubLFiles.declareFunction( me, "find_context_of_complex_query", "FIND-CONTEXT-OF-COMPLEX-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "find_predicates_in_query", "FIND-PREDICATES-IN-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "find_context_of_query", "FIND-CONTEXT-OF-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_context_for_collection", "GET-CONTEXT-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_context_for_individual", "GET-CONTEXT-FOR-INDIVIDUAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ask_mt_query", "ASK-MT-QUERY", 1, 3, false );
    SubLFiles.declareFunction( me, "cosine_similarity", "COSINE-SIMILARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_mt_information_from_file", "GET-MT-INFORMATION-FROM-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_useful_mts_for_query", "FIND-USEFUL-MTS-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "check_tkb_related_query", "CHECK-TKB-RELATED-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "check_mt_topics", "CHECK-MT-TOPICS", 3, 0, false );
    SubLFiles.declareFunction( me, "find_topic_of_mt", "FIND-TOPIC-OF-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "terrorism_related_mtP", "TERRORISM-RELATED-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cols_for_topic_1", "FIND-COLS-FOR-TOPIC-1", 1, 0, false );
    SubLFiles.declareFunction( me, "find_preds_for_topic", "FIND-PREDS-FOR-TOPIC", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cols_for_topic_2", "FIND-COLS-FOR-TOPIC-2", 1, 0, false );
    SubLFiles.declareFunction( me, "check_membership_in_topic_cols", "CHECK-MEMBERSHIP-IN-TOPIC-COLS", 2, 1, false );
    SubLFiles.declareFunction( me, "find_individual_for_mt", "FIND-INDIVIDUAL-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "check_membership_in_topic_preds", "CHECK-MEMBERSHIP-IN-TOPIC-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_all_mt_vectors", "GET-ALL-MT-VECTORS", 0, 0, false );
    SubLFiles.declareFunction( me, "sort_similarity_estimates", "SORT-SIMILARITY-ESTIMATES", 1, 0, false );
    SubLFiles.declareFunction( me, "aggregate_results", "AGGREGATE-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "init_mt_vectors", "INIT-MT-VECTORS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_mt_context_file()
  {
    $mt_vectors$ = SubLFiles.deflexical( "*MT-VECTORS*", ( maybeDefault( $sym0$_MT_VECTORS_, $mt_vectors$, NIL ) ) );
    $too_general_cols$ = SubLFiles.deflexical( "*TOO-GENERAL-COLS*", ( maybeDefault( $sym1$_TOO_GENERAL_COLS_, $too_general_cols$, NIL ) ) );
    $score_threshold$ = SubLFiles.deflexical( "*SCORE-THRESHOLD*", ( maybeDefault( $sym2$_SCORE_THRESHOLD_, $score_threshold$, $float3$1_0e_5 ) ) );
    $mt_vector_files$ = SubLFiles.deflexical( "*MT-VECTOR-FILES*", ( maybeDefault( $sym60$_MT_VECTOR_FILES_, $mt_vector_files$, $list61 ) ) );
    $mt_vectors_general_cols_file$ = SubLFiles.deflexical( "*MT-VECTORS-GENERAL-COLS-FILE*", ( maybeDefault( $sym62$_MT_VECTORS_GENERAL_COLS_FILE_, $mt_vectors_general_cols_file$,
        $str63$_cyc_top_data_mt_vectors_too_gene ) ) );
    return NIL;
  }

  public static SubLObject setup_mt_context_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_MT_VECTORS_ );
    subl_macro_promotions.declare_defglobal( $sym1$_TOO_GENERAL_COLS_ );
    subl_macro_promotions.declare_defglobal( $sym2$_SCORE_THRESHOLD_ );
    subl_macro_promotions.declare_defglobal( $sym60$_MT_VECTOR_FILES_ );
    subl_macro_promotions.declare_defglobal( $sym62$_MT_VECTORS_GENERAL_COLS_FILE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mt_context_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mt_context_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mt_context_file();
  }
  static
  {
    me = new mt_context();
    $mt_vectors$ = null;
    $too_general_cols$ = null;
    $score_threshold$ = null;
    $mt_vector_files$ = null;
    $mt_vectors_general_cols_file$ = null;
    $sym0$_MT_VECTORS_ = makeSymbol( "*MT-VECTORS*" );
    $sym1$_TOO_GENERAL_COLS_ = makeSymbol( "*TOO-GENERAL-COLS*" );
    $sym2$_SCORE_THRESHOLD_ = makeSymbol( "*SCORE-THRESHOLD*" );
    $float3$1_0e_5 = makeDouble( 1.0E-5 );
    $sym4$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING" );
    $sym5$CAR = makeSymbol( "CAR" );
    $int6$_3 = makeInteger( -3 );
    $int7$1000 = makeInteger( 1000 );
    $const8$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const9$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const10$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $sym11$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $const12$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const13$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const14$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $const15$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $const16$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list17 = ConsesLow.list( makeSymbol( "?X" ) );
    $const18$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const19$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw20$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw21$MINIMAL = makeKeyword( "MINIMAL" );
    $kw22$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw23$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw24$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw25$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw26$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw27$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw28$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw29$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw30$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw31$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float32$1_0 = makeDouble( 1.0 );
    $kw33$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw34$HL = makeKeyword( "HL" );
    $kw35$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw36$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $int37$20000000 = makeInteger( 20000000 );
    $kw38$DIRECTION = makeKeyword( "DIRECTION" );
    $kw39$INPUT = makeKeyword( "INPUT" );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Terrorism-Topic" ) ) );
    $sym41$_ = makeSymbol( ">" );
    $sym42$SECOND = makeSymbol( "SECOND" );
    $int43$_2 = makeInteger( -2 );
    $int44$100 = makeInteger( 100 );
    $const45$Terrorism_Topic = constant_handles.reader_make_constant_shell( makeString( "Terrorism-Topic" ) );
    $sym46$CDAR = makeSymbol( "CDAR" );
    $const47$mtTopic = constant_handles.reader_make_constant_shell( makeString( "mtTopic" ) );
    $list48 = ConsesLow.list( makeSymbol( "?M" ) );
    $const49$TKBSourceSpindle = constant_handles.reader_make_constant_shell( makeString( "TKBSourceSpindle" ) );
    $const50$mtSpindleMember = constant_handles.reader_make_constant_shell( makeString( "mtSpindleMember" ) );
    $const51$salientSpecForCollectionInTopic = constant_handles.reader_make_constant_shell( makeString( "salientSpecForCollectionInTopic" ) );
    $const52$salientPredicateSpaceForTopic = constant_handles.reader_make_constant_shell( makeString( "salientPredicateSpaceForTopic" ) );
    $const53$salientCollectionSpaceForTopic = constant_handles.reader_make_constant_shell( makeString( "salientCollectionSpaceForTopic" ) );
    $const54$salientIndividualForMt = constant_handles.reader_make_constant_shell( makeString( "salientIndividualForMt" ) );
    $sym55$THIRD = makeSymbol( "THIRD" );
    $sym56$GAF_FORMULA = makeSymbol( "GAF-FORMULA" );
    $str57$____a__a_ = makeString( "~% ~a ~a " );
    $const58$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $sym59$_ = makeSymbol( "+" );
    $sym60$_MT_VECTOR_FILES_ = makeSymbol( "*MT-VECTOR-FILES*" );
    $list61 = ConsesLow.list( makeString( "/cyc/top/data/mt-vectors/mt-vectors-1.txt" ), makeString( "/cyc/top/data/mt-vectors/mt-vectors-2.txt" ), makeString( "/cyc/top/data/mt-vectors/mt-vectors-3.txt" ), makeString(
        "/cyc/top/data/mt-vectors/mt-vectors-4.txt" ) );
    $sym62$_MT_VECTORS_GENERAL_COLS_FILE_ = makeSymbol( "*MT-VECTORS-GENERAL-COLS-FILE*" );
    $str63$_cyc_top_data_mt_vectors_too_gene = makeString( "/cyc/top/data/mt-vectors/too-general-cols.txt" );
  }
}
/*
 * 
 * Total time: 209 ms
 * 
 */