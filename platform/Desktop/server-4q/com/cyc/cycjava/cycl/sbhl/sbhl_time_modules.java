package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_modules";
  public static final String myFingerPrint = "2e33889b3deb54b1400d186384c9bfefc6a6b7ced7029ee6e65eabf5933211db";
  private static final SubLString $str0$__sbhl_module_for__s__;
  private static final SubLString $str1$______a____a;
  private static final SubLString $str2$__sbhl_module_dictionary_for__s_n;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$NEGATION_BOOLEAN;
  private static final SubLSymbol $kw5$BOOLEAN;
  private static final SubLString $str6$continue_anyway;
  private static final SubLString $str7$_hl_verify_sbhl_time__predicate__;
  private static final SubLString $str8$_hl_verify_sbhl_time__predicate__;
  private static final SubLSymbol $kw9$NEGATION_JUSTIFY;
  private static final SubLSymbol $kw10$JUSTIFY;
  private static final SubLString $str11$_hl_justify_sbhl_time__predicate_;
  private static final SubLString $str12$_hl_justify_sbhl_time__predicate_;
  private static final SubLSymbol $kw13$FALSE;
  private static final SubLSymbol $kw14$TRUE;
  private static final SubLString $str15$_hl_forward_mt_combos_sbhl_time__;
  private static final SubLSymbol $sym16$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const17$EverythingPSC;
  private static final SubLObject $const18$InferencePSC;
  private static final SubLSymbol $sym19$HLMT_EQUAL;
  private static final SubLObject $const20$startsAfterStartingOf;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$STRICT;
  private static final SubLSymbol $kw23$POS;
  private static final SubLSymbol $kw24$START;
  private static final SubLSymbol $sym25$KEYWORDP;
  private static final SubLSymbol $kw26$NEG;
  private static final SubLObject $const27$startsAfterEndingOf;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$END;
  private static final SubLObject $const30$endsAfterStartingOf;
  private static final SubLList $list31;
  private static final SubLObject $const32$endsAfterEndingOf;
  private static final SubLList $list33;
  private static final SubLObject $const34$temporallySubsumes;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$WEAK;
  private static final SubLObject $const37$dateOfEvent;
  private static final SubLList $list38;
  private static final SubLObject $const39$Date;
  private static final SubLObject $const40$cotemporal;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$COORDINATE;
  private static final SubLObject $const43$temporallyIntersects;
  private static final SubLList $list44;
  private static final SubLObject $const45$temporallyDisjoint;
  private static final SubLList $list46;
  private static final SubLObject $const47$temporalBoundsContain;
  private static final SubLList $list48;
  private static final SubLObject $const49$temporalBoundsSubsume;
  private static final SubLList $list50;
  private static final SubLObject $const51$temporalBoundsIdentical;
  private static final SubLList $list52;
  private static final SubLObject $const53$temporalBoundsIntersect;
  private static final SubLList $list54;
  private static final SubLObject $const55$temporallyCooriginating;
  private static final SubLList $list56;
  private static final SubLObject $const57$temporallyCoterminal;
  private static final SubLList $list58;
  private static final SubLObject $const59$contiguousAfter;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$SUCCESSOR;
  private static final SubLObject $const62$startsDuring;
  private static final SubLList $list63;
  private static final SubLObject $const64$endsDuring;
  private static final SubLList $list65;
  private static final SubLObject $const66$startingDate;
  private static final SubLList $list67;
  private static final SubLObject $const68$endingDate;
  private static final SubLList $list69;
  private static final SubLObject $const70$birthDate;
  private static final SubLList $list71;
  private static final SubLObject $const72$dateOfDeath;
  private static final SubLList $list73;
  private static final SubLObject $const74$temporallyStartedBy;
  private static final SubLList $list75;
  private static final SubLObject $const76$temporallyFinishedBy;
  private static final SubLList $list77;
  private static final SubLObject $const78$overlapsStart;
  private static final SubLList $list79;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 1277L)
  public static SubLObject declare_sbhl_time_module(final SubLObject predicate, final SubLObject v_properties)
  {
    if( NIL == conses_high.member( predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      sbhl_time_vars.$sbhl_time_predicates$.setGlobalValue( ConsesLow.cons( predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue() ) );
    }
    final SubLObject v_dictionary = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    dictionary.dictionary_enter( sbhl_time_vars.$sbhl_time_modules$.getGlobalValue(), predicate, v_dictionary );
    SubLObject props = NIL;
    SubLObject value = NIL;
    SubLObject attribute = NIL;
    props = Sequences.reverse( v_properties );
    value = props.first();
    attribute = conses_high.second( props );
    while ( NIL != props)
    {
      dictionary.dictionary_enter( v_dictionary, attribute, value );
      props = conses_high.cddr( props );
      value = props.first();
      attribute = conses_high.second( props );
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 1794L)
  public static SubLObject undeclare_sbhl_time_module(final SubLObject predicate)
  {
    if( NIL != subl_promotions.memberP( predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      sbhl_time_vars.$sbhl_time_predicates$.setGlobalValue( Sequences.remove( predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      dictionary.dictionary_remove( sbhl_time_vars.$sbhl_time_modules$.getGlobalValue(), predicate );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 2039L)
  public static SubLObject get_sbhl_time_module(final SubLObject predicate, final SubLObject attribute, SubLObject not_found)
  {
    if( not_found == UNPROVIDED )
    {
      not_found = NIL;
    }
    final SubLObject v_dictionary = dictionary.dictionary_lookup( sbhl_time_vars.$sbhl_time_modules$.getGlobalValue(), predicate, UNPROVIDED );
    if( NIL != dictionary.dictionary_p( v_dictionary ) )
    {
      return dictionary.dictionary_lookup( v_dictionary, attribute, not_found );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 2294L)
  public static SubLObject describe_sbhl_time_module(final SubLObject predicate, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_dictionary = dictionary.dictionary_lookup( sbhl_time_vars.$sbhl_time_modules$.getGlobalValue(), predicate, UNPROVIDED );
    if( NIL != dictionary.dictionary_p( v_dictionary ) )
    {
      PrintLow.format( stream, $str0$__sbhl_module_for__s__, predicate );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject val = thread.secondMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format( stream, $str1$______a____a, Strings.string_downcase( Symbols.symbol_name( key ), UNPROVIDED, UNPROVIDED ), val.isSymbol() ? Strings.string_downcase( Symbols.symbol_name( val ), UNPROVIDED,
            UNPROVIDED ) : string_utilities.str( val ) );
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    else
    {
      PrintLow.format( stream, $str2$__sbhl_module_dictionary_for__s_n, predicate );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 2859L)
  public static SubLObject hl_verify_sbhl_time(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list3 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject predicate = el_utilities.literal_arg0( literal, UNPROVIDED );
      if( NIL != sbhl_time_utilities.sbhl_time_predicate_p( predicate ) )
      {
        SubLObject verify_fn = NIL;
        if( NIL != cycl_utilities.negatedP( literal ) )
        {
          verify_fn = get_sbhl_time_module( predicate, $kw4$NEGATION_BOOLEAN, UNPROVIDED );
        }
        else
        {
          verify_fn = get_sbhl_time_module( predicate, $kw5$BOOLEAN, UNPROVIDED );
        }
        if( NIL != Symbols.fboundp( verify_fn ) )
        {
          return Functions.funcall( verify_fn, el_utilities.literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal, UNPROVIDED ), mt );
        }
        sbhl_paranoia.sbhl_cerror( TWO_INTEGER, $str6$continue_anyway, $str7$_hl_verify_sbhl_time__predicate__, predicate, verify_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        sbhl_paranoia.sbhl_cerror( TWO_INTEGER, $str6$continue_anyway, $str8$_hl_verify_sbhl_time__predicate__, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( support, $list3 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 3894L)
  public static SubLObject hl_justify_sbhl_time(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list3 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    tv = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( support, $list3 );
      return NIL;
    }
    final SubLObject predicate = el_utilities.literal_arg0( literal, UNPROVIDED );
    if( NIL == sbhl_time_utilities.sbhl_time_predicate_p( predicate ) )
    {
      return sbhl_paranoia.sbhl_cerror( TWO_INTEGER, $str6$continue_anyway, $str12$_hl_justify_sbhl_time__predicate_, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject justify_fn = NIL;
    if( NIL != cycl_utilities.negatedP( literal ) )
    {
      justify_fn = get_sbhl_time_module( predicate, $kw9$NEGATION_JUSTIFY, UNPROVIDED );
    }
    else
    {
      justify_fn = get_sbhl_time_module( predicate, $kw10$JUSTIFY, UNPROVIDED );
    }
    if( NIL != Symbols.fboundp( justify_fn ) )
    {
      return Functions.funcall( justify_fn, el_utilities.literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal, UNPROVIDED ), mt );
    }
    return sbhl_paranoia.sbhl_cerror( TWO_INTEGER, $str6$continue_anyway, $str11$_hl_justify_sbhl_time__predicate_, predicate, justify_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 4882L)
  public static SubLObject hl_forward_mt_combos_sbhl_time(final SubLObject support)
  {
    SubLObject hl_module = NIL;
    SubLObject literal = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list3 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    literal = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list3 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject predicate = el_utilities.literal_arg0( literal, UNPROVIDED );
      if( NIL != sbhl_time_utilities.sbhl_time_predicate_p( predicate ) )
      {
        SubLObject mts = NIL;
        SubLObject ans = NIL;
        if( NIL != cycl_utilities.negatedP( literal ) )
        {
          mts = max_floor_mts_of_sbhl_time_paths( predicate, el_utilities.literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal, UNPROVIDED ), $kw13$FALSE );
        }
        else
        {
          mts = max_floor_mts_of_sbhl_time_paths( predicate, el_utilities.literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal, UNPROVIDED ), $kw14$TRUE );
        }
        if( NIL == mts )
        {
          mts = ConsesLow.list( mt );
        }
        SubLObject cdolist_list_var = mts;
        SubLObject mt_$1 = NIL;
        mt_$1 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          ans = ConsesLow.cons( arguments.make_hl_support( hl_module, literal, mt_$1, tv ), ans );
          cdolist_list_var = cdolist_list_var.rest();
          mt_$1 = cdolist_list_var.first();
        }
        return Sequences.nreverse( ans );
      }
      sbhl_paranoia.sbhl_cerror( TWO_INTEGER, $str6$continue_anyway, $str15$_hl_forward_mt_combos_sbhl_time__, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( support, $list3 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 6056L)
  public static SubLObject max_floor_mts_of_sbhl_time_paths(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, final SubLObject truth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mts = NIL;
    final SubLObject sense = enumeration_types.truth_sense( truth );
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_verbose_justsP$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporality_verbose_justsP$.bind( NIL, thread );
      SubLObject supports = NIL;
      final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        supports = sbhl_time_query_processing.why_true_temporal_relation_literalP( predicate, arg1, arg2, sense, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$2, thread );
      }
      mts = sbhl_time_max_floor_mts( supports );
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporality_verbose_justsP$.rebind( _prev_bind_0, thread );
    }
    return mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 6431L)
  public static SubLObject sbhl_time_max_floor_mts(final SubLObject supports)
  {
    SubLObject mt_list = NIL;
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( support ) )
      {
        mt_list = ConsesLow.cons( assertions_high.assertion_mt( support ), mt_list );
      }
      else if( NIL != arguments.hl_support_p( support ) )
      {
        final SubLObject mt = arguments.support_mt( support );
        if( mt.eql( $const18$InferencePSC ) )
        {
          mt_list = ConsesLow.append( mt_list, hl_supports.hl_forward_mt_combos( support ) );
        }
        else
        {
          mt_list = ConsesLow.cons( mt, mt_list );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return genl_mts.max_floor_mts( list_utilities.fast_delete_duplicates( mt_list, $sym19$HLMT_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 7142L)
  public static SubLObject cleanly_initialize_sbhl_time_modules()
  {
    dictionary.dictionary_rebuild( sbhl_time_vars.$sbhl_time_modules$.getGlobalValue() );
    return initialize_sbhl_time_modules();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 7364L)
  public static SubLObject initialize_sbhl_time_modules()
  {
    init_starts_after_starting_of();
    init_starts_after_ending_of();
    init_ends_after_starting_of();
    init_ends_after_ending_of();
    init_temporally_subsumes();
    init_date_of_event();
    init_cotemporal();
    init_temporally_intersects();
    init_temporally_disjoint();
    init_temporal_bounds_contain();
    init_temporal_bounds_identical();
    init_temporal_bounds_intersect();
    init_temporally_cooriginating();
    init_temporally_coterminal();
    init_contiguous_after();
    init_starts_during();
    init_ends_during();
    init_starting_date();
    init_ending_date();
    init_birth_date();
    init_date_of_death();
    init_temporally_started_by();
    init_temporally_finished_by();
    init_overlaps_start();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 8099L)
  public static SubLObject init_starts_after_starting_of()
  {
    declare_sbhl_time_module( $const20$startsAfterStartingOf, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 8732L)
  public static SubLObject starts_after_starting_of_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_start( arg1 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 8925L)
  public static SubLObject starts_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const20$startsAfterStartingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 9070L)
  public static SubLObject all_starts_after_starting_of(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$3 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg1 ), mt );
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$3, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = Sequences.remove_duplicates( sbhl_time_utilities.point_args( preceding ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 9439L)
  public static SubLObject all_starts_after_starting_of_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$4 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$5 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$5, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$4, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( succeeding );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 9838L)
  public static SubLObject not_starts_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const20$startsAfterStartingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 9987L)
  public static SubLObject why_starts_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const20$startsAfterStartingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 10140L)
  public static SubLObject why_not_starts_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const20$startsAfterStartingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 10297L)
  public static SubLObject init_starts_after_ending_of()
  {
    declare_sbhl_time_module( $const27$startsAfterEndingOf, $list28 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 10842L)
  public static SubLObject starts_after_ending_of_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_end( arg2 ), sbhl_time_utilities.quasi_hl_earliest_start( arg1 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 11031L)
  public static SubLObject starts_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const27$startsAfterEndingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 11172L)
  public static SubLObject all_starts_after_ending_of(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$6 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$7 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$7, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$6, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( preceding );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 11559L)
  public static SubLObject all_starts_after_ending_of_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$8 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$9 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$9, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$8, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( succeeding );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 11954L)
  public static SubLObject not_starts_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const27$startsAfterEndingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 12099L)
  public static SubLObject why_starts_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const27$startsAfterEndingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 12248L)
  public static SubLObject why_not_starts_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const27$startsAfterEndingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 12401L)
  public static SubLObject init_ends_after_starting_of()
  {
    declare_sbhl_time_module( $const30$endsAfterStartingOf, $list31 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 12946L)
  public static SubLObject ends_after_starting_of_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 13135L)
  public static SubLObject ends_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const30$endsAfterStartingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 13276L)
  public static SubLObject all_ends_after_starting_of(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$10 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$10, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = Sequences.remove_duplicates( sbhl_time_utilities.point_args( preceding ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 13641L)
  public static SubLObject all_ends_after_starting_of_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$11 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_start( arg2 ), mt );
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$11, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = Sequences.remove_duplicates( sbhl_time_utilities.point_args( succeeding ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 14016L)
  public static SubLObject not_ends_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const30$endsAfterStartingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 14161L)
  public static SubLObject why_ends_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const30$endsAfterStartingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 14310L)
  public static SubLObject why_not_ends_after_starting_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const30$endsAfterStartingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 14463L)
  public static SubLObject init_ends_after_ending_of()
  {
    declare_sbhl_time_module( $const32$endsAfterEndingOf, $list33 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 14988L)
  public static SubLObject ends_after_ending_of_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_end( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 15173L)
  public static SubLObject ends_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const32$endsAfterEndingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 15310L)
  public static SubLObject all_ends_after_ending_of(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$12 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$13 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$13, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$12, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( preceding );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 15693L)
  public static SubLObject all_ends_after_ending_of_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$14 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg2 ), mt );
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$14, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = Sequences.remove_duplicates( sbhl_time_utilities.point_args( succeeding ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 16064L)
  public static SubLObject not_ends_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const32$endsAfterEndingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 16205L)
  public static SubLObject why_ends_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const32$endsAfterEndingOf, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 16350L)
  public static SubLObject why_not_ends_after_ending_ofP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const32$endsAfterEndingOf, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 16499L)
  public static SubLObject init_temporally_subsumes()
  {
    declare_sbhl_time_module( $const34$temporallySubsumes, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 17018L)
  public static SubLObject temporally_subsumes_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_end( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 17306L)
  public static SubLObject temporally_subsumesP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const34$temporallySubsumes, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 17443L)
  public static SubLObject all_temporally_subsumes(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_between = NIL;
    SubLObject end_between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$15 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$16 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          start_between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$16, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$17 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          end_between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$15, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( start_between ), sbhl_time_utilities.point_args( end_between ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( arg1 ) && NIL == conses_high.member( arg1, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg1, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 18156L)
  public static SubLObject all_temporally_subsumes_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$18 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$19 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_weakly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$19, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$20 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_weakly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$20, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$18, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( arg2 ) && NIL == conses_high.member( arg2, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg2, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 18793L)
  public static SubLObject not_temporally_subsumesP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const34$temporallySubsumes, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 18934L)
  public static SubLObject why_temporally_subsumesP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const34$temporallySubsumes, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 19079L)
  public static SubLObject why_not_temporally_subsumesP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const34$temporallySubsumes, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 19228L)
  public static SubLObject init_date_of_event()
  {
    declare_sbhl_time_module( $const37$dateOfEvent, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 19653L)
  public static SubLObject date_of_event_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_start( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 19903L)
  public static SubLObject date_of_eventP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const37$dateOfEvent, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 20111L)
  public static SubLObject all_date_of_event_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject start_between = NIL;
    SubLObject end_between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$21 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$22 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          start_between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$22, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$23 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          end_between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$23, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$21, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( start_between ), sbhl_time_utilities.point_args( end_between ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 20817L)
  public static SubLObject not_date_of_eventP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const37$dateOfEvent, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 21029L)
  public static SubLObject why_date_of_eventP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const37$dateOfEvent, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 21245L)
  public static SubLObject why_not_date_of_eventP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const37$dateOfEvent, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 21465L)
  public static SubLObject init_cotemporal()
  {
    declare_sbhl_time_module( $const40$cotemporal, $list41 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 21851L)
  public static SubLObject cotemporal_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 22110L)
  public static SubLObject cotemporalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const40$cotemporal, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 22230L)
  public static SubLObject all_cotemporal(final SubLObject arg, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_coordinate = NIL;
    SubLObject end_coordinate = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$24 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$25 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          start_coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_start( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$25, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$26 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          end_coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_end( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$26, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$24, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( start_coordinate ), sbhl_time_utilities.point_args( end_coordinate ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( arg ) && NIL == conses_high.member( arg, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 22857L)
  public static SubLObject not_cotemporalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const40$cotemporal, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 22981L)
  public static SubLObject why_cotemporalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const40$cotemporal, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 23109L)
  public static SubLObject why_not_cotemporalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const40$cotemporal, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 23241L)
  public static SubLObject init_temporally_intersects()
  {
    declare_sbhl_time_module( $const43$temporallyIntersects, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 23724L)
  public static SubLObject temporally_intersects_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 24014L)
  public static SubLObject temporally_intersectsP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const43$temporallyIntersects, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 24155L)
  public static SubLObject all_temporally_intersects(final SubLObject arg, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$27 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$28 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_weakly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_end( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$28, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$29 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_weakly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_start( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$29, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$27, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( arg ) && NIL == conses_high.member( arg, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 24781L)
  public static SubLObject not_temporally_intersectsP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const43$temporallyIntersects, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 24926L)
  public static SubLObject why_temporally_intersectsP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const43$temporallyIntersects, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 25075L)
  public static SubLObject why_not_temporally_intersectsP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const43$temporallyIntersects, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 25228L)
  public static SubLObject init_temporally_disjoint()
  {
    declare_sbhl_time_module( $const45$temporallyDisjoint, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 25695L)
  public static SubLObject temporally_disjoint_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 25983L)
  public static SubLObject temporally_disjointP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const45$temporallyDisjoint, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 26120L)
  public static SubLObject all_temporally_disjoint(final SubLObject arg, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$30 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$31 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$31, thread );
        }
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$32 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$32, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$30, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = ConsesLow.append( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 26684L)
  public static SubLObject not_temporally_disjointP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const45$temporallyDisjoint, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 26825L)
  public static SubLObject why_temporally_disjointP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const45$temporallyDisjoint, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 26970L)
  public static SubLObject why_not_temporally_disjointP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const45$temporallyDisjoint, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 27119L)
  public static SubLObject init_temporal_bounds_contain()
  {
    declare_sbhl_time_module( $const47$temporalBoundsContain, $list48 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 27676L)
  public static SubLObject temporal_bounds_contain_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_end( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 27972L)
  public static SubLObject temporal_bounds_containP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const47$temporalBoundsContain, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 28116L)
  public static SubLObject all_temporal_bounds_contain(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_between = NIL;
    SubLObject end_between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$33 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$34 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          start_between = sbhl_time_query_processing.all_strictly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$34, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$35 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          end_between = sbhl_time_query_processing.all_strictly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$35, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$33, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( start_between ), sbhl_time_utilities.point_args( end_between ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 28782L)
  public static SubLObject all_temporal_bounds_contain_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$36 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$37 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$37, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$38 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$38, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$36, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 29372L)
  public static SubLObject not_temporal_bounds_containP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const47$temporalBoundsContain, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 29520L)
  public static SubLObject why_temporal_bounds_containP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const47$temporalBoundsContain, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 29672L)
  public static SubLObject why_not_temporal_bounds_containP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const47$temporalBoundsContain, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 29828L)
  public static SubLObject init_temporal_bounds_subsume()
  {
    declare_sbhl_time_module( $const49$temporalBoundsSubsume, $list50 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 30385L)
  public static SubLObject temporal_bounds_subsume_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_end( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 30677L)
  public static SubLObject temporal_bounds_subsumeP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const49$temporalBoundsSubsume, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 30821L)
  public static SubLObject all_temporal_bounds_subsume(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_between = NIL;
    SubLObject end_between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$39 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$40 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          start_between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$40, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$41 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          end_between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$41, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$39, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( start_between ), sbhl_time_utilities.point_args( end_between ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 31483L)
  public static SubLObject all_temporal_bounds_subsume_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$42 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$43 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_weakly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$43, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$44 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_weakly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$44, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$42, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 32069L)
  public static SubLObject not_temporal_bounds_subsumeP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const49$temporalBoundsSubsume, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 32217L)
  public static SubLObject why_temporal_bounds_subsumeP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const49$temporalBoundsSubsume, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 32369L)
  public static SubLObject why_not_temporal_bounds_subsumeP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const49$temporalBoundsSubsume, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 32525L)
  public static SubLObject init_temporal_bounds_identical()
  {
    declare_sbhl_time_module( $const51$temporalBoundsIdentical, $list52 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 33041L)
  public static SubLObject temporal_bounds_identical_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 33315L)
  public static SubLObject temporal_bounds_identicalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const51$temporalBoundsIdentical, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 33463L)
  public static SubLObject all_temporal_bounds_identical(final SubLObject arg, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_coordinate = NIL;
    SubLObject end_coordinate = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$45 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$46 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          start_coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_start( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$46, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$47 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          end_coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_end( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$47, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$45, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( start_coordinate ), sbhl_time_utilities.point_args( end_coordinate ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( arg ) && NIL == conses_high.member( arg, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 34105L)
  public static SubLObject not_temporal_bounds_identicalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const51$temporalBoundsIdentical, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 34257L)
  public static SubLObject why_temporal_bounds_identicalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const51$temporalBoundsIdentical, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 34413L)
  public static SubLObject why_not_temporal_bounds_identicalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const51$temporalBoundsIdentical, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 34573L)
  public static SubLObject init_temporal_bounds_intersect()
  {
    declare_sbhl_time_module( $const53$temporalBoundsIntersect, $list54 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 35090L)
  public static SubLObject temporal_bounds_intersect_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 35384L)
  public static SubLObject temporal_bounds_intersectP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const53$temporalBoundsIntersect, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 35532L)
  public static SubLObject all_temporal_bounds_intersect(final SubLObject arg, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$48 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$49 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_weakly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_end( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$49, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$50 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_weakly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_start( arg ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$50, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$48, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( arg ) && NIL == conses_high.member( arg, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 36162L)
  public static SubLObject not_temporal_bounds_intersectP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const53$temporalBoundsIntersect, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 36314L)
  public static SubLObject why_temporal_bounds_intersectP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const53$temporalBoundsIntersect, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 36470L)
  public static SubLObject why_not_temporal_bounds_intersectP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const53$temporalBoundsIntersect, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 36630L)
  public static SubLObject init_temporally_cooriginating()
  {
    declare_sbhl_time_module( $const55$temporallyCooriginating, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 37140L)
  public static SubLObject temporally_cooriginating_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_start( arg2 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 37321L)
  public static SubLObject temporally_cooriginatingP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const55$temporallyCooriginating, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 37468L)
  public static SubLObject all_temporally_cooriginating(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coordinate = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$51 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$52 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$52, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$51, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( coordinate );
    if( NIL != forts.fort_p( arg1 ) && NIL == conses_high.member( arg1, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg1, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 37903L)
  public static SubLObject not_temporally_cooriginatingP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const55$temporallyCooriginating, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 38054L)
  public static SubLObject why_temporally_cooriginatingP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const55$temporallyCooriginating, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 38209L)
  public static SubLObject why_not_temporally_cooriginatingP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const55$temporallyCooriginating, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 38368L)
  public static SubLObject init_temporally_coterminal()
  {
    declare_sbhl_time_module( $const57$temporallyCoterminal, $list58 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 38851L)
  public static SubLObject temporally_coterminal_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 39025L)
  public static SubLObject temporally_coterminalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const57$temporallyCoterminal, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 39166L)
  public static SubLObject all_temporally_coterminal(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coordinate = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$53 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$54 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$54, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$53, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( coordinate );
    if( NIL != forts.fort_p( arg1 ) && NIL == conses_high.member( arg1, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( arg1, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 39594L)
  public static SubLObject not_temporally_coterminalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const57$temporallyCoterminal, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 39739L)
  public static SubLObject why_temporally_coterminalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const57$temporallyCoterminal, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 39888L)
  public static SubLObject why_not_temporally_coterminalP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const57$temporallyCoterminal, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 40041L)
  public static SubLObject init_contiguous_after()
  {
    declare_sbhl_time_module( $const59$contiguousAfter, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 40530L)
  public static SubLObject contiguous_after_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct = ConsesLow.list( $kw61$SUCCESSOR, sbhl_time_utilities.quasi_hl_end( arg2 ), sbhl_time_utilities.quasi_hl_start( arg1 ) );
    return ConsesLow.list( conjunct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 40700L)
  public static SubLObject contiguous_afterP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const59$contiguousAfter, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 40831L)
  public static SubLObject all_contiguous_after(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$55 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$56 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          preceding = sbhl_time_query_processing.all_predecessors_quasi_link( sbhl_time_utilities.quasi_hl_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$56, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$55, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( preceding );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 41200L)
  public static SubLObject all_contiguous_after_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$57 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$58 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          succeeding = sbhl_time_query_processing.all_successors_quasi_link( sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$58, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$57, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( succeeding );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 41578L)
  public static SubLObject not_contiguous_afterP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const59$contiguousAfter, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 41713L)
  public static SubLObject why_contiguous_afterP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const59$contiguousAfter, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 41852L)
  public static SubLObject why_not_contiguous_afterP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const59$contiguousAfter, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 41995L)
  public static SubLObject init_starts_during()
  {
    declare_sbhl_time_module( $const62$startsDuring, $list63 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 42454L)
  public static SubLObject starts_during_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_start( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 42742L)
  public static SubLObject starts_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const62$startsDuring, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 42867L)
  public static SubLObject all_starts_during(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$59 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$60 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$60, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$61 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$61, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$59, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 43441L)
  public static SubLObject all_starts_during_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$62 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$63 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          between = sbhl_time_query_processing.all_strictly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$63, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$62, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( between );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 43855L)
  public static SubLObject not_starts_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const62$startsDuring, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 43984L)
  public static SubLObject why_starts_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const62$startsDuring, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 44117L)
  public static SubLObject why_not_starts_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const62$startsDuring, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 44254L)
  public static SubLObject init_ends_during()
  {
    declare_sbhl_time_module( $const64$endsDuring, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 44693L)
  public static SubLObject ends_during_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_latest_end( arg1 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 44975L)
  public static SubLObject ends_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const64$endsDuring, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 45096L)
  public static SubLObject all_ends_during(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preceding = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$64 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$65 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_earliest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$65, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$66 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_latest_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$66, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$64, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( preceding ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 45664L)
  public static SubLObject all_ends_during_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$67 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$68 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          between = sbhl_time_query_processing.all_strictly_between_quasi_links( sbhl_time_utilities.quasi_hl_latest_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$68, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$67, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( between );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 46071L)
  public static SubLObject not_ends_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const64$endsDuring, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 46196L)
  public static SubLObject why_ends_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const64$endsDuring, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 46325L)
  public static SubLObject why_not_ends_duringP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const64$endsDuring, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 46458L)
  public static SubLObject init_starting_date()
  {
    declare_sbhl_time_module( $const66$startingDate, $list67 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 46885L)
  public static SubLObject starting_date_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_start( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_start( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 47153L)
  public static SubLObject starting_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const66$startingDate, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 47362L)
  public static SubLObject all_starting_date_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$69 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$70 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$70, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$69, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( between );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 47839L)
  public static SubLObject not_starting_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const66$startingDate, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 48052L)
  public static SubLObject why_starting_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const66$startingDate, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 48269L)
  public static SubLObject why_not_starting_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const66$startingDate, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 48490L)
  public static SubLObject init_ending_date()
  {
    declare_sbhl_time_module( $const68$endingDate, $list69 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 48899L)
  public static SubLObject ending_date_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_earliest_end( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_latest_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 49161L)
  public static SubLObject ending_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const68$endingDate, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 49366L)
  public static SubLObject all_ending_date_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$71 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$72 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$72, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$71, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( between );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 49839L)
  public static SubLObject not_ending_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const68$endingDate, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 50048L)
  public static SubLObject why_ending_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const68$endingDate, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 50261L)
  public static SubLObject why_not_ending_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const68$endingDate, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 50478L)
  public static SubLObject init_birth_date()
  {
    declare_sbhl_time_module( $const70$birthDate, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 50878L)
  public static SubLObject birth_date_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_start( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 51127L)
  public static SubLObject birth_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const70$birthDate, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 51330L)
  public static SubLObject all_birth_date_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$73 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$74 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$74, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$73, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( between );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 51804L)
  public static SubLObject not_birth_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const70$birthDate, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 52011L)
  public static SubLObject why_birth_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const70$birthDate, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 52222L)
  public static SubLObject why_not_birth_dateP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const70$birthDate, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 52437L)
  public static SubLObject init_date_of_death()
  {
    declare_sbhl_time_module( $const72$dateOfDeath, $list73 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 52862L)
  public static SubLObject date_of_death_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg1 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw36$WEAK, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 53110L)
  public static SubLObject date_of_deathP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const72$dateOfDeath, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 53318L)
  public static SubLObject all_date_of_death_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject between = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$75 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$76 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          between = sbhl_time_query_processing.all_weakly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$76, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$75, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = sbhl_time_utilities.point_args( between );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 53793L)
  public static SubLObject not_date_of_deathP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const72$dateOfDeath, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 54005L)
  public static SubLObject why_date_of_deathP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const72$dateOfDeath, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 54221L)
  public static SubLObject why_not_date_of_deathP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == date_utilities.date_p( arg2 ) && NIL == isa.isaP( arg2, $const39$Date, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const72$dateOfDeath, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 54441L)
  public static SubLObject init_temporally_started_by()
  {
    declare_sbhl_time_module( $const74$temporallyStartedBy, $list75 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 54978L)
  public static SubLObject temporally_started_by_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_end( arg2 ), sbhl_time_utilities.quasi_hl_end( arg1 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 55244L)
  public static SubLObject temporally_started_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const74$temporallyStartedBy, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 55384L)
  public static SubLObject all_temporally_started_by(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coordinate = NIL;
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$77 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$78 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$78, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$79 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$79, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$77, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( coordinate ), sbhl_time_utilities.point_args( preceding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 55944L)
  public static SubLObject all_temporally_started_by_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coordinate = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$80 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$81 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$81, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$82 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$82, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$80, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( coordinate ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 56514L)
  public static SubLObject not_temporally_started_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const74$temporallyStartedBy, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 56658L)
  public static SubLObject why_temporally_started_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const74$temporallyStartedBy, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 56806L)
  public static SubLObject why_not_temporally_started_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const74$temporallyStartedBy, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 56958L)
  public static SubLObject init_temporally_finished_by()
  {
    declare_sbhl_time_module( $const76$temporallyFinishedBy, $list77 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 57505L)
  public static SubLObject temporally_finished_by_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw42$COORDINATE, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_start( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 57772L)
  public static SubLObject temporally_finished_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const76$temporallyFinishedBy, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 57914L)
  public static SubLObject all_temporally_finished_by(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coordinate = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$83 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$84 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$84, thread );
        }
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$85 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_start( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$85, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$83, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( coordinate ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 58477L)
  public static SubLObject all_temporally_finished_by_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject coordinate = NIL;
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$86 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$87 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          coordinate = sbhl_time_query_processing.all_coordinate_quasi_link( sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$87, thread );
        }
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$88 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$88, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$86, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( coordinate ), sbhl_time_utilities.point_args( preceding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 59046L)
  public static SubLObject not_temporally_finished_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const76$temporallyFinishedBy, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 59192L)
  public static SubLObject why_temporally_finished_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const76$temporallyFinishedBy, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 59342L)
  public static SubLObject why_not_temporally_finished_byP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const76$temporallyFinishedBy, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 59496L)
  public static SubLObject init_overlaps_start()
  {
    declare_sbhl_time_module( $const78$overlapsStart, $list79 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 59965L)
  public static SubLObject overlaps_start_quasi_link_conjunction(final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject conjunct1 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_start( arg2 ) );
    final SubLObject conjunct2 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg1 ) );
    final SubLObject conjunct3 = ConsesLow.list( $kw22$STRICT, sbhl_time_utilities.quasi_hl_end( arg1 ), sbhl_time_utilities.quasi_hl_end( arg2 ) );
    return ConsesLow.list( conjunct1, conjunct2, conjunct3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 60308L)
  public static SubLObject overlaps_startP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const78$overlapsStart, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 60435L)
  public static SubLObject all_overlaps_start(final SubLObject arg1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject between = NIL;
    SubLObject succeeding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$89 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$90 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          between = sbhl_time_query_processing.all_strictly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg1 ), sbhl_time_utilities.quasi_hl_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$90, thread );
        }
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$91 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          succeeding = sbhl_time_query_processing.all_strictly_after_quasi_link( sbhl_time_utilities.quasi_hl_end( arg1 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$91, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$89, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( between ), sbhl_time_utilities.point_args( succeeding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 61008L)
  public static SubLObject all_overlaps_start_inverse(final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject between = NIL;
    SubLObject preceding = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind( NIL, thread );
      if( NIL == mt && NIL == mt_relevance_macros.all_mts_are_relevantP() && NIL == mt_relevance_macros.any_mt_is_relevantP() )
      {
        mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.add_temporal_link_disjunction_consequents( mt );
      }
      final SubLObject _prev_bind_0_$92 = sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.bind( T, thread );
        assert NIL != Types.keywordp( $kw29$END ) : $kw29$END;
        final SubLObject _prev_bind_0_$93 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw29$END, thread );
          between = sbhl_time_query_processing.all_strictly_between_quasi_links( sbhl_time_utilities.quasi_hl_start( arg2 ), sbhl_time_utilities.quasi_hl_end( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$93, thread );
        }
        assert NIL != Types.keywordp( $kw24$START ) : $kw24$START;
        final SubLObject _prev_bind_0_$94 = sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.currentBinding( thread );
        try
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.bind( $kw24$START, thread );
          preceding = sbhl_time_query_processing.all_strictly_before_quasi_link( sbhl_time_utilities.quasi_hl_start( arg2 ), mt );
        }
        finally
        {
          sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.rebind( _prev_bind_0_$94, thread );
        }
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.rebind( _prev_bind_0_$92, thread );
      }
      if( NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue( thread ) )
      {
        sbhl_time_query_processing.remove_temporal_link_disjunction_consequents( mt );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind( _prev_bind_0, thread );
    }
    result = keyhash_utilities.fast_intersection( sbhl_time_utilities.point_args( between ), sbhl_time_utilities.point_args( preceding ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 61589L)
  public static SubLObject not_overlaps_startP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.true_temporal_relation_literalP( $const78$overlapsStart, arg1, arg2, $kw26$NEG, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 61720L)
  public static SubLObject why_overlaps_startP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const78$overlapsStart, arg1, arg2, $kw23$POS, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-modules.lisp", position = 61855L)
  public static SubLObject why_not_overlaps_startP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_time_query_processing.why_true_temporal_relation_literalP( $const78$overlapsStart, arg1, arg2, $kw26$NEG, mt );
  }

  public static SubLObject declare_sbhl_time_modules_file()
  {
    SubLFiles.declareFunction( me, "declare_sbhl_time_module", "DECLARE-SBHL-TIME-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_sbhl_time_module", "UNDECLARE-SBHL-TIME-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_time_module", "GET-SBHL-TIME-MODULE", 2, 1, false );
    SubLFiles.declareFunction( me, "describe_sbhl_time_module", "DESCRIBE-SBHL-TIME-MODULE", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_verify_sbhl_time", "HL-VERIFY-SBHL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_sbhl_time", "HL-JUSTIFY-SBHL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_forward_mt_combos_sbhl_time", "HL-FORWARD-MT-COMBOS-SBHL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_sbhl_time_paths", "MAX-FLOOR-MTS-OF-SBHL-TIME-PATHS", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_time_max_floor_mts", "SBHL-TIME-MAX-FLOOR-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cleanly_initialize_sbhl_time_modules", "CLEANLY-INITIALIZE-SBHL-TIME-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_sbhl_time_modules", "INITIALIZE-SBHL-TIME-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "init_starts_after_starting_of", "INIT-STARTS-AFTER-STARTING-OF", 0, 0, false );
    SubLFiles.declareFunction( me, "starts_after_starting_of_quasi_link_conjunction", "STARTS-AFTER-STARTING-OF-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "starts_after_starting_ofP", "STARTS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_starts_after_starting_of", "ALL-STARTS-AFTER-STARTING-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "all_starts_after_starting_of_inverse", "ALL-STARTS-AFTER-STARTING-OF-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_starts_after_starting_ofP", "NOT-STARTS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_starts_after_starting_ofP", "WHY-STARTS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_starts_after_starting_ofP", "WHY-NOT-STARTS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_starts_after_ending_of", "INIT-STARTS-AFTER-ENDING-OF", 0, 0, false );
    SubLFiles.declareFunction( me, "starts_after_ending_of_quasi_link_conjunction", "STARTS-AFTER-ENDING-OF-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "starts_after_ending_ofP", "STARTS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_starts_after_ending_of", "ALL-STARTS-AFTER-ENDING-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "all_starts_after_ending_of_inverse", "ALL-STARTS-AFTER-ENDING-OF-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_starts_after_ending_ofP", "NOT-STARTS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_starts_after_ending_ofP", "WHY-STARTS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_starts_after_ending_ofP", "WHY-NOT-STARTS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_ends_after_starting_of", "INIT-ENDS-AFTER-STARTING-OF", 0, 0, false );
    SubLFiles.declareFunction( me, "ends_after_starting_of_quasi_link_conjunction", "ENDS-AFTER-STARTING-OF-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "ends_after_starting_ofP", "ENDS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_ends_after_starting_of", "ALL-ENDS-AFTER-STARTING-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "all_ends_after_starting_of_inverse", "ALL-ENDS-AFTER-STARTING-OF-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_ends_after_starting_ofP", "NOT-ENDS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_ends_after_starting_ofP", "WHY-ENDS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_ends_after_starting_ofP", "WHY-NOT-ENDS-AFTER-STARTING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_ends_after_ending_of", "INIT-ENDS-AFTER-ENDING-OF", 0, 0, false );
    SubLFiles.declareFunction( me, "ends_after_ending_of_quasi_link_conjunction", "ENDS-AFTER-ENDING-OF-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "ends_after_ending_ofP", "ENDS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_ends_after_ending_of", "ALL-ENDS-AFTER-ENDING-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "all_ends_after_ending_of_inverse", "ALL-ENDS-AFTER-ENDING-OF-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_ends_after_ending_ofP", "NOT-ENDS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_ends_after_ending_ofP", "WHY-ENDS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_ends_after_ending_ofP", "WHY-NOT-ENDS-AFTER-ENDING-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_subsumes", "INIT-TEMPORALLY-SUBSUMES", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_subsumes_quasi_link_conjunction", "TEMPORALLY-SUBSUMES-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_subsumesP", "TEMPORALLY-SUBSUMES?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_subsumes", "ALL-TEMPORALLY-SUBSUMES", 1, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_subsumes_inverse", "ALL-TEMPORALLY-SUBSUMES-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_subsumesP", "NOT-TEMPORALLY-SUBSUMES?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_subsumesP", "WHY-TEMPORALLY-SUBSUMES?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_subsumesP", "WHY-NOT-TEMPORALLY-SUBSUMES?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_date_of_event", "INIT-DATE-OF-EVENT", 0, 0, false );
    SubLFiles.declareFunction( me, "date_of_event_quasi_link_conjunction", "DATE-OF-EVENT-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "date_of_eventP", "DATE-OF-EVENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_date_of_event_inverse", "ALL-DATE-OF-EVENT-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_date_of_eventP", "NOT-DATE-OF-EVENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_date_of_eventP", "WHY-DATE-OF-EVENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_date_of_eventP", "WHY-NOT-DATE-OF-EVENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_cotemporal", "INIT-COTEMPORAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cotemporal_quasi_link_conjunction", "COTEMPORAL-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cotemporalP", "COTEMPORAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_cotemporal", "ALL-COTEMPORAL", 1, 1, false );
    SubLFiles.declareFunction( me, "not_cotemporalP", "NOT-COTEMPORAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_cotemporalP", "WHY-COTEMPORAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_cotemporalP", "WHY-NOT-COTEMPORAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_intersects", "INIT-TEMPORALLY-INTERSECTS", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_intersects_quasi_link_conjunction", "TEMPORALLY-INTERSECTS-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_intersectsP", "TEMPORALLY-INTERSECTS?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_intersects", "ALL-TEMPORALLY-INTERSECTS", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_intersectsP", "NOT-TEMPORALLY-INTERSECTS?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_intersectsP", "WHY-TEMPORALLY-INTERSECTS?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_intersectsP", "WHY-NOT-TEMPORALLY-INTERSECTS?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_disjoint", "INIT-TEMPORALLY-DISJOINT", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_disjoint_quasi_link_conjunction", "TEMPORALLY-DISJOINT-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_disjointP", "TEMPORALLY-DISJOINT?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_disjoint", "ALL-TEMPORALLY-DISJOINT", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_disjointP", "NOT-TEMPORALLY-DISJOINT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_disjointP", "WHY-TEMPORALLY-DISJOINT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_disjointP", "WHY-NOT-TEMPORALLY-DISJOINT?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporal_bounds_contain", "INIT-TEMPORAL-BOUNDS-CONTAIN", 0, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_contain_quasi_link_conjunction", "TEMPORAL-BOUNDS-CONTAIN-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_containP", "TEMPORAL-BOUNDS-CONTAIN?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporal_bounds_contain", "ALL-TEMPORAL-BOUNDS-CONTAIN", 1, 1, false );
    SubLFiles.declareFunction( me, "all_temporal_bounds_contain_inverse", "ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporal_bounds_containP", "NOT-TEMPORAL-BOUNDS-CONTAIN?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporal_bounds_containP", "WHY-TEMPORAL-BOUNDS-CONTAIN?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporal_bounds_containP", "WHY-NOT-TEMPORAL-BOUNDS-CONTAIN?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporal_bounds_subsume", "INIT-TEMPORAL-BOUNDS-SUBSUME", 0, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_subsume_quasi_link_conjunction", "TEMPORAL-BOUNDS-SUBSUME-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_subsumeP", "TEMPORAL-BOUNDS-SUBSUME?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporal_bounds_subsume", "ALL-TEMPORAL-BOUNDS-SUBSUME", 1, 1, false );
    SubLFiles.declareFunction( me, "all_temporal_bounds_subsume_inverse", "ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporal_bounds_subsumeP", "NOT-TEMPORAL-BOUNDS-SUBSUME?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporal_bounds_subsumeP", "WHY-TEMPORAL-BOUNDS-SUBSUME?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporal_bounds_subsumeP", "WHY-NOT-TEMPORAL-BOUNDS-SUBSUME?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporal_bounds_identical", "INIT-TEMPORAL-BOUNDS-IDENTICAL", 0, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_identical_quasi_link_conjunction", "TEMPORAL-BOUNDS-IDENTICAL-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_identicalP", "TEMPORAL-BOUNDS-IDENTICAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporal_bounds_identical", "ALL-TEMPORAL-BOUNDS-IDENTICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporal_bounds_identicalP", "NOT-TEMPORAL-BOUNDS-IDENTICAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporal_bounds_identicalP", "WHY-TEMPORAL-BOUNDS-IDENTICAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporal_bounds_identicalP", "WHY-NOT-TEMPORAL-BOUNDS-IDENTICAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporal_bounds_intersect", "INIT-TEMPORAL-BOUNDS-INTERSECT", 0, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_intersect_quasi_link_conjunction", "TEMPORAL-BOUNDS-INTERSECT-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporal_bounds_intersectP", "TEMPORAL-BOUNDS-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporal_bounds_intersect", "ALL-TEMPORAL-BOUNDS-INTERSECT", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporal_bounds_intersectP", "NOT-TEMPORAL-BOUNDS-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporal_bounds_intersectP", "WHY-TEMPORAL-BOUNDS-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporal_bounds_intersectP", "WHY-NOT-TEMPORAL-BOUNDS-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_cooriginating", "INIT-TEMPORALLY-COORIGINATING", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_cooriginating_quasi_link_conjunction", "TEMPORALLY-COORIGINATING-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_cooriginatingP", "TEMPORALLY-COORIGINATING?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_cooriginating", "ALL-TEMPORALLY-COORIGINATING", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_cooriginatingP", "NOT-TEMPORALLY-COORIGINATING?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_cooriginatingP", "WHY-TEMPORALLY-COORIGINATING?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_cooriginatingP", "WHY-NOT-TEMPORALLY-COORIGINATING?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_coterminal", "INIT-TEMPORALLY-COTERMINAL", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_coterminal_quasi_link_conjunction", "TEMPORALLY-COTERMINAL-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_coterminalP", "TEMPORALLY-COTERMINAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_coterminal", "ALL-TEMPORALLY-COTERMINAL", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_coterminalP", "NOT-TEMPORALLY-COTERMINAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_coterminalP", "WHY-TEMPORALLY-COTERMINAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_coterminalP", "WHY-NOT-TEMPORALLY-COTERMINAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_contiguous_after", "INIT-CONTIGUOUS-AFTER", 0, 0, false );
    SubLFiles.declareFunction( me, "contiguous_after_quasi_link_conjunction", "CONTIGUOUS-AFTER-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "contiguous_afterP", "CONTIGUOUS-AFTER?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_contiguous_after", "ALL-CONTIGUOUS-AFTER", 1, 1, false );
    SubLFiles.declareFunction( me, "all_contiguous_after_inverse", "ALL-CONTIGUOUS-AFTER-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_contiguous_afterP", "NOT-CONTIGUOUS-AFTER?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_contiguous_afterP", "WHY-CONTIGUOUS-AFTER?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_contiguous_afterP", "WHY-NOT-CONTIGUOUS-AFTER?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_starts_during", "INIT-STARTS-DURING", 0, 0, false );
    SubLFiles.declareFunction( me, "starts_during_quasi_link_conjunction", "STARTS-DURING-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "starts_duringP", "STARTS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_starts_during", "ALL-STARTS-DURING", 1, 1, false );
    SubLFiles.declareFunction( me, "all_starts_during_inverse", "ALL-STARTS-DURING-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_starts_duringP", "NOT-STARTS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_starts_duringP", "WHY-STARTS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_starts_duringP", "WHY-NOT-STARTS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_ends_during", "INIT-ENDS-DURING", 0, 0, false );
    SubLFiles.declareFunction( me, "ends_during_quasi_link_conjunction", "ENDS-DURING-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "ends_duringP", "ENDS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_ends_during", "ALL-ENDS-DURING", 1, 1, false );
    SubLFiles.declareFunction( me, "all_ends_during_inverse", "ALL-ENDS-DURING-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_ends_duringP", "NOT-ENDS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_ends_duringP", "WHY-ENDS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_ends_duringP", "WHY-NOT-ENDS-DURING?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_starting_date", "INIT-STARTING-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "starting_date_quasi_link_conjunction", "STARTING-DATE-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "starting_dateP", "STARTING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_starting_date_inverse", "ALL-STARTING-DATE-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_starting_dateP", "NOT-STARTING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_starting_dateP", "WHY-STARTING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_starting_dateP", "WHY-NOT-STARTING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_ending_date", "INIT-ENDING-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "ending_date_quasi_link_conjunction", "ENDING-DATE-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "ending_dateP", "ENDING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_ending_date_inverse", "ALL-ENDING-DATE-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_ending_dateP", "NOT-ENDING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_ending_dateP", "WHY-ENDING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_ending_dateP", "WHY-NOT-ENDING-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_birth_date", "INIT-BIRTH-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "birth_date_quasi_link_conjunction", "BIRTH-DATE-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "birth_dateP", "BIRTH-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_birth_date_inverse", "ALL-BIRTH-DATE-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_birth_dateP", "NOT-BIRTH-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_birth_dateP", "WHY-BIRTH-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_birth_dateP", "WHY-NOT-BIRTH-DATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_date_of_death", "INIT-DATE-OF-DEATH", 0, 0, false );
    SubLFiles.declareFunction( me, "date_of_death_quasi_link_conjunction", "DATE-OF-DEATH-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "date_of_deathP", "DATE-OF-DEATH?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_date_of_death_inverse", "ALL-DATE-OF-DEATH-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_date_of_deathP", "NOT-DATE-OF-DEATH?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_date_of_deathP", "WHY-DATE-OF-DEATH?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_date_of_deathP", "WHY-NOT-DATE-OF-DEATH?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_started_by", "INIT-TEMPORALLY-STARTED-BY", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_started_by_quasi_link_conjunction", "TEMPORALLY-STARTED-BY-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_started_byP", "TEMPORALLY-STARTED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_started_by", "ALL-TEMPORALLY-STARTED-BY", 1, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_started_by_inverse", "ALL-TEMPORALLY-STARTED-BY-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_started_byP", "NOT-TEMPORALLY-STARTED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_started_byP", "WHY-TEMPORALLY-STARTED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_started_byP", "WHY-NOT-TEMPORALLY-STARTED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_temporally_finished_by", "INIT-TEMPORALLY-FINISHED-BY", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_finished_by_quasi_link_conjunction", "TEMPORALLY-FINISHED-BY-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "temporally_finished_byP", "TEMPORALLY-FINISHED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_finished_by", "ALL-TEMPORALLY-FINISHED-BY", 1, 1, false );
    SubLFiles.declareFunction( me, "all_temporally_finished_by_inverse", "ALL-TEMPORALLY-FINISHED-BY-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_temporally_finished_byP", "NOT-TEMPORALLY-FINISHED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_temporally_finished_byP", "WHY-TEMPORALLY-FINISHED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_temporally_finished_byP", "WHY-NOT-TEMPORALLY-FINISHED-BY?", 2, 1, false );
    SubLFiles.declareFunction( me, "init_overlaps_start", "INIT-OVERLAPS-START", 0, 0, false );
    SubLFiles.declareFunction( me, "overlaps_start_quasi_link_conjunction", "OVERLAPS-START-QUASI-LINK-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "overlaps_startP", "OVERLAPS-START?", 2, 1, false );
    SubLFiles.declareFunction( me, "all_overlaps_start", "ALL-OVERLAPS-START", 1, 1, false );
    SubLFiles.declareFunction( me, "all_overlaps_start_inverse", "ALL-OVERLAPS-START-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "not_overlaps_startP", "NOT-OVERLAPS-START?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_overlaps_startP", "WHY-OVERLAPS-START?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_overlaps_startP", "WHY-NOT-OVERLAPS-START?", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_sbhl_time_modules_file()
  {
    return NIL;
  }

  public static SubLObject setup_sbhl_time_modules_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_time_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_time_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_time_modules_file();
  }
  static
  {
    me = new sbhl_time_modules();
    $str0$__sbhl_module_for__s__ = makeString( "~%sbhl module for ~s :" );
    $str1$______a____a = makeString( "~%  :~a : ~a" );
    $str2$__sbhl_module_dictionary_for__s_n = makeString( "~%sbhl module dictionary for ~s not found" );
    $list3 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "LITERAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $kw4$NEGATION_BOOLEAN = makeKeyword( "NEGATION-BOOLEAN" );
    $kw5$BOOLEAN = makeKeyword( "BOOLEAN" );
    $str6$continue_anyway = makeString( "continue anyway" );
    $str7$_hl_verify_sbhl_time__predicate__ = makeString( "[hl-verify-sbhl-time] predicate ~s has :verify-fn ~s which is not a function" );
    $str8$_hl_verify_sbhl_time__predicate__ = makeString( "[hl-verify-sbhl-time] predicate ~s is not a sbhl-time-predicate-p" );
    $kw9$NEGATION_JUSTIFY = makeKeyword( "NEGATION-JUSTIFY" );
    $kw10$JUSTIFY = makeKeyword( "JUSTIFY" );
    $str11$_hl_justify_sbhl_time__predicate_ = makeString( "[hl-justify-sbhl-time] predicate ~s has justify-fn ~s which is not a function" );
    $str12$_hl_justify_sbhl_time__predicate_ = makeString( "[hl-justify-sbhl-time] predicate ~s is not a sbhl-time-predicate-p" );
    $kw13$FALSE = makeKeyword( "FALSE" );
    $kw14$TRUE = makeKeyword( "TRUE" );
    $str15$_hl_forward_mt_combos_sbhl_time__ = makeString( "[hl-forward-mt-combos-sbhl-time] predicate ~s is not a sbhl-time-predicate-p" );
    $sym16$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const17$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const18$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym19$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $const20$startsAfterStartingOf = constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "STARTS-AFTER-STARTING-OF-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "STARTS-AFTER-STARTING-OF?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-STARTS-AFTER-STARTING-OF" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-STARTS-AFTER-STARTING-OF-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-STARTS-AFTER-STARTING-OF?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-STARTS-AFTER-STARTING-OF?" ),
      makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-STARTS-AFTER-STARTING-OF?" )
    } );
    $kw22$STRICT = makeKeyword( "STRICT" );
    $kw23$POS = makeKeyword( "POS" );
    $kw24$START = makeKeyword( "START" );
    $sym25$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw26$NEG = makeKeyword( "NEG" );
    $const27$startsAfterEndingOf = constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "STARTS-AFTER-ENDING-OF-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "STARTS-AFTER-ENDING-OF?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-STARTS-AFTER-ENDING-OF" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-STARTS-AFTER-ENDING-OF-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-STARTS-AFTER-ENDING-OF?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-STARTS-AFTER-ENDING-OF?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-STARTS-AFTER-ENDING-OF?" )
    } );
    $kw29$END = makeKeyword( "END" );
    $const30$endsAfterStartingOf = constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "ENDS-AFTER-STARTING-OF-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "ENDS-AFTER-STARTING-OF?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-ENDS-AFTER-STARTING-OF" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-ENDS-AFTER-STARTING-OF-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-ENDS-AFTER-STARTING-OF?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-ENDS-AFTER-STARTING-OF?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-ENDS-AFTER-STARTING-OF?" )
    } );
    $const32$endsAfterEndingOf = constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) );
    $list33 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "ENDS-AFTER-ENDING-OF-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "ENDS-AFTER-ENDING-OF?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-ENDS-AFTER-ENDING-OF" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-ENDS-AFTER-ENDING-OF-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-ENDS-AFTER-ENDING-OF?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-ENDS-AFTER-ENDING-OF?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-ENDS-AFTER-ENDING-OF?" )
    } );
    $const34$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $list35 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-SUBSUMES-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-SUBSUMES?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-SUBSUMES" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-TEMPORALLY-SUBSUMES-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-TEMPORALLY-SUBSUMES?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-SUBSUMES?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-SUBSUMES?" )
    } );
    $kw36$WEAK = makeKeyword( "WEAK" );
    $const37$dateOfEvent = constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) );
    $list38 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "DATE-OF-EVENT-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ),
      T, makeKeyword( "BOOLEAN" ), makeSymbol( "DATE-OF-EVENT?" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-DATE-OF-EVENT-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-DATE-OF-EVENT?" ),
      makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-DATE-OF-EVENT?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-DATE-OF-EVENT?" )
    } );
    $const39$Date = constant_handles.reader_make_constant_shell( makeString( "Date" ) );
    $const40$cotemporal = constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "COTEMPORAL-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ), T,
      makeKeyword( "BOOLEAN" ), makeSymbol( "COTEMPORAL?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-COTEMPORAL" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-COTEMPORAL?" ), makeKeyword( "JUSTIFY" ),
      makeSymbol( "WHY-COTEMPORAL?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-COTEMPORAL?" )
    } );
    $kw42$COORDINATE = makeKeyword( "COORDINATE" );
    $const43$temporallyIntersects = constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-INTERSECTS-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-INTERSECTS?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-INTERSECTS" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol(
            "NOT-TEMPORALLY-INTERSECTS?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-INTERSECTS?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-INTERSECTS?" )
    } );
    $const45$temporallyDisjoint = constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) );
    $list46 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-DISJOINT-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), NIL, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-DISJOINT?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-DISJOINT" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol(
            "NOT-TEMPORALLY-DISJOINT?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-DISJOINT?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-DISJOINT?" )
    } );
    $const47$temporalBoundsContain = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) );
    $list48 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORAL-BOUNDS-CONTAIN-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORAL-BOUNDS-CONTAIN?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORAL-BOUNDS-CONTAIN" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-TEMPORAL-BOUNDS-CONTAIN?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORAL-BOUNDS-CONTAIN?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORAL-BOUNDS-CONTAIN?" )
    } );
    $const49$temporalBoundsSubsume = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) );
    $list50 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORAL-BOUNDS-SUBSUME-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORAL-BOUNDS-SUBSUME?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORAL-BOUNDS-SUBSUME" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-TEMPORAL-BOUNDS-SUBSUME?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORAL-BOUNDS-SUBSUME?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORAL-BOUNDS-SUBSUME?" )
    } );
    $const51$temporalBoundsIdentical = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) );
    $list52 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORAL-BOUNDS-IDENTICAL-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORAL-BOUNDS-IDENTICAL?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORAL-BOUNDS-IDENTICAL" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol(
            "NOT-TEMPORAL-BOUNDS-IDENTICAL?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORAL-BOUNDS-IDENTICAL?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORAL-BOUNDS-IDENTICAL?" )
    } );
    $const53$temporalBoundsIntersect = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) );
    $list54 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORAL-BOUNDS-INTERSECT-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORAL-BOUNDS-INTERSECT?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORAL-BOUNDS-INTERSECT" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol(
            "NOT-TEMPORAL-BOUNDS-INTERSECT?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORAL-BOUNDS-INTERSECT?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORAL-BOUNDS-INTERSECT?" )
    } );
    $const55$temporallyCooriginating = constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) );
    $list56 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-COORIGINATING-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-COORIGINATING?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-COORIGINATING" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol(
            "NOT-TEMPORALLY-COORIGINATING?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-COORIGINATING?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-COORIGINATING?" )
    } );
    $const57$temporallyCoterminal = constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) );
    $list58 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-COTERMINAL-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-COTERMINAL?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-COTERMINAL" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol(
            "NOT-TEMPORALLY-COTERMINAL?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-COTERMINAL?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-COTERMINAL?" )
    } );
    $const59$contiguousAfter = constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) );
    $list60 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "CONTIGUOUS-AFTER-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "CONTIGUOUS-AFTER?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-CONTIGUOUS-AFTER" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-CONTIGUOUS-AFTER-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-CONTIGUOUS-AFTER?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-CONTIGUOUS-AFTER?" ), makeKeyword( "NEGATION-JUSTIFY" ),
      makeSymbol( "WHY-NOT-CONTIGUOUS-AFTER?" )
    } );
    $kw61$SUCCESSOR = makeKeyword( "SUCCESSOR" );
    $const62$startsDuring = constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) );
    $list63 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "STARTS-DURING-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ),
      T, makeKeyword( "BOOLEAN" ), makeSymbol( "STARTS-DURING?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-STARTS-DURING" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-STARTS-DURING-INVERSE" ), makeKeyword(
          "NEGATION-BOOLEAN" ), makeSymbol( "NOT-STARTS-DURING?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-STARTS-DURING?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-STARTS-DURING?" )
    } );
    $const64$endsDuring = constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) );
    $list65 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "ENDS-DURING-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ), T,
      makeKeyword( "BOOLEAN" ), makeSymbol( "ENDS-DURING?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-ENDS-DURING" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-ENDS-DURING-INVERSE" ), makeKeyword(
          "NEGATION-BOOLEAN" ), makeSymbol( "NOT-ENDS-DURING?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-ENDS-DURING?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-ENDS-DURING?" )
    } );
    $const66$startingDate = constant_handles.reader_make_constant_shell( makeString( "startingDate" ) );
    $list67 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "STARTING-DATE-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ),
      T, makeKeyword( "BOOLEAN" ), makeSymbol( "STARTING-DATE?" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-STARTING-DATE-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-STARTING-DATE?" ),
      makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-STARTING-DATE?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-STARTING-DATE?" )
    } );
    $const68$endingDate = constant_handles.reader_make_constant_shell( makeString( "endingDate" ) );
    $list69 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "ENDING-DATE-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ), T,
      makeKeyword( "BOOLEAN" ), makeSymbol( "ENDING-DATE?" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-ENDING-DATE-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-ENDING-DATE?" ), makeKeyword(
          "JUSTIFY" ), makeSymbol( "WHY-ENDING-DATE?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-ENDING-DATE?" )
    } );
    $const70$birthDate = constant_handles.reader_make_constant_shell( makeString( "birthDate" ) );
    $list71 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "BIRTH-DATE-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ), T,
      makeKeyword( "BOOLEAN" ), makeSymbol( "BIRTH-DATE?" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-BIRTH-DATE-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-BIRTH-DATE?" ), makeKeyword(
          "JUSTIFY" ), makeSymbol( "WHY-BIRTH-DATE?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-BIRTH-DATE?" )
    } );
    $const72$dateOfDeath = constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) );
    $list73 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "DATE-OF-DEATH-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ),
      T, makeKeyword( "BOOLEAN" ), makeSymbol( "DATE-OF-DEATH?" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-DATE-OF-DEATH-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-DATE-OF-DEATH?" ),
      makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-DATE-OF-DEATH?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-DATE-OF-DEATH?" )
    } );
    $const74$temporallyStartedBy = constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) );
    $list75 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-STARTED-BY-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-STARTED-BY?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-STARTED-BY" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-TEMPORALLY-STARTED-BY-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-TEMPORALLY-STARTED-BY?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-STARTED-BY?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-STARTED-BY?" )
    } );
    $const76$temporallyFinishedBy = constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) );
    $list77 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "TEMPORALLY-FINISHED-BY-QUASI-LINK-CONJUNCTION" ), makeKeyword(
        "CONJUNCTIVE?" ), T, makeKeyword( "BOOLEAN" ), makeSymbol( "TEMPORALLY-FINISHED-BY?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-TEMPORALLY-FINISHED-BY" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol(
            "ALL-TEMPORALLY-FINISHED-BY-INVERSE" ), makeKeyword( "NEGATION-BOOLEAN" ), makeSymbol( "NOT-TEMPORALLY-FINISHED-BY?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-TEMPORALLY-FINISHED-BY?" ), makeKeyword(
                "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-TEMPORALLY-FINISHED-BY?" )
    } );
    $const78$overlapsStart = constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) );
    $list79 = ConsesLow.list( new SubLObject[] { makeKeyword( "SBHL-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "CONJUNCTION-FN" ), makeSymbol( "OVERLAPS-START-QUASI-LINK-CONJUNCTION" ), makeKeyword( "CONJUNCTIVE?" ),
      T, makeKeyword( "BOOLEAN" ), makeSymbol( "OVERLAPS-START?" ), makeKeyword( "CLOSURE" ), makeSymbol( "ALL-OVERLAPS-START" ), makeKeyword( "INVERSE-CLOSURE" ), makeSymbol( "ALL-OVERLAPS-START-INVERSE" ), makeKeyword(
          "NEGATION-BOOLEAN" ), makeSymbol( "NOT-OVERLAPS-START?" ), makeKeyword( "JUSTIFY" ), makeSymbol( "WHY-OVERLAPS-START?" ), makeKeyword( "NEGATION-JUSTIFY" ), makeSymbol( "WHY-NOT-OVERLAPS-START?" )
    } );
  }
}
/*
 * 
 * Total time: 1051 ms
 * 
 */