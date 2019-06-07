package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.rule_after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
//import com.cyc.tool.subl.jrtl.nativeCode.type.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
////import com.cyc.tool.subl.jrtl.nativeCode.type.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class core
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.core";
  public static final String myFingerPrint = "5e3fd41ec3c9a45c24f52c1c2bee91676220161bc820f58ea873f98b265494ba";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1114L)
  private static SubLSymbol $core_seed_collection$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1352L)
  private static SubLSymbol $core_seed_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2459L)
  private static SubLSymbol $all_core_raw_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3366L)
  private static SubLSymbol $all_core_skolems$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5178L)
  private static SubLSymbol $all_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5562L)
  private static SubLSymbol $core_constant_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7201L)
  private static SubLSymbol $all_core_narts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7749L)
  private static SubLSymbol $all_core_forts$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7999L)
  private static SubLSymbol $core_fort_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10012L)
  private static SubLSymbol $all_core_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11658L)
  private static SubLSymbol $core_defining_arg1_predicates_info$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13113L)
  private static SubLSymbol $core_defining_arg2_predicates_info$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13289L)
  private static SubLSymbol $core_definitional_info_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16494L)
  private static SubLSymbol $core_mt_definitional_info_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28128L)
  private static SubLSymbol $core_kb_start_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38976L)
  private static SubLSymbol $decontextualization_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41096L)
  private static SubLSymbol $late_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41646L)
  private static SubLSymbol $core_covered_gaf_predicates$;
  private static final SubLObject $const0$CoreUnionConstant;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$NON_CORE_RAW_CONSTANT_P;
  private static final SubLSymbol $sym3$CONSTANT_P;
  private static final SubLSymbol $sym4$_ALL_CORE_RAW_CONSTANTS_;
  private static final SubLSymbol $kw5$UNINITIALIZED;
  private static final SubLSymbol $sym6$_ALL_CORE_SKOLEMS_;
  private static final SubLSymbol $sym7$_ALL_CORE_CONSTANTS_;
  private static final SubLSymbol $sym8$_CORE_CONSTANT_TABLE_;
  private static final SubLString $str9$Computing_core_NARTs;
  private static final SubLString $str10$cdolist;
  private static final SubLSymbol $sym11$CACHED_NON_CORE_CONSTANT_P;
  private static final SubLSymbol $sym12$_ALL_CORE_NARTS_;
  private static final SubLSymbol $sym13$_ALL_CORE_FORTS_;
  private static final SubLSymbol $sym14$_CORE_FORT_TABLE_;
  private static final SubLSymbol $sym15$CACHED_NON_CORE_FORT_P;
  private static final SubLSymbol $sym16$NON_CORE_ASSERTION_P;
  private static final SubLString $str17$determining_core_rules;
  private static final SubLSymbol $kw18$RULE;
  private static final SubLSymbol $kw19$TRUE;
  private static final SubLSymbol $sym20$_ALL_CORE_RULES_;
  private static final SubLString $str21$Computing_definitional_info;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$CORE_DEFINITIONAL_INFO;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$FALSE;
  private static final SubLObject $const26$isa;
  private static final SubLObject $const27$CycLConstant;
  private static final SubLObject $const28$quotedIsa;
  private static final SubLSymbol $sym29$CACHED_CORE_FORT_P;
  private static final SubLSymbol $sym30$_CORE_DEFINITIONAL_INFO_CACHING_STATE_;
  private static final SubLInteger $int31$300;
  private static final SubLString $str32$__Cycle___S__S__S;
  private static final SubLString $str33$__Given___S__Minimal___S;
  private static final SubLSymbol $sym34$FORT_P;
  private static final SubLSymbol $sym35$CORE_MT_DEFINITIONAL_INFO;
  private static final SubLObject $const36$CoreCycLMt;
  private static final SubLSymbol $sym37$GAF_ARG2;
  private static final SubLSymbol $sym38$GAF_ARG1;
  private static final SubLSymbol $sym39$_CORE_MT_DEFINITIONAL_INFO_CACHING_STATE_;
  private static final SubLSymbol $sym40$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $kw41$OUTPUT;
  private static final SubLString $str42$Unable_to_open__S;
  private static final SubLString $str43$_______Mode__LISP__Package__CYC__;
  private static final SubLString $str44$____;
  private static final SubLString $str45$______A;
  private static final SubLString $str46$_____Core_KB_for_CycL_version__A_;
  private static final SubLString $str47$_____This_file_is_automatically_g;
  private static final SubLString $str48$_________________________________;
  private static final SubLString $str49$_____in_package__CYC__;
  private static final SubLString $str50$_______initialization;
  private static final SubLString $str51$___core_kb_initialization__S_;
  private static final SubLString $str52$_______constants;
  private static final SubLString $str53$constant_creates;
  private static final SubLString $str54$_____core_kb_start_bootstrapping_;
  private static final SubLString $str55$_______NARTs;
  private static final SubLString $str56$NART_creates;
  private static final SubLString $str57$_______after_adding_early_extent_;
  private static final SubLString $str58$after_adding_early_extent_asserts;
  private static final SubLString $str59$_______Core_mt_definitional_asser;
  private static final SubLString $str60$Core_mt_definitional_asserts;
  private static final SubLString $str61$_______decontextualization_early_;
  private static final SubLString $str62$decontextualization_early_extent_;
  private static final SubLString $str63$_____core_kb_start_definitions_;
  private static final SubLString $str64$_______definitional_assertions;
  private static final SubLString $str65$definitional_asserts;
  private static final SubLString $str66$_______post_definitional_initiali;
  private static final SubLString $str67$___core_kb_finish_definitions_;
  private static final SubLString $str68$_______additional_gaf_assertions;
  private static final SubLString $str69$additional_gaf_asserts;
  private static final SubLString $str70$_____core_kb_finish_bootstrapping;
  private static final SubLString $str71$_______rules__asserting_forward_r;
  private static final SubLString $str72$core_rules_with_meta_assertions__;
  private static final SubLString $str73$core_rules_without_meta_assertion;
  private static final SubLString $str74$_______forward_rules__reasserting;
  private static final SubLString $str75$core_rules_with_meta_assertions;
  private static final SubLString $str76$core_rules_without_meta_assertion;
  private static final SubLString $str77$_______meta_assertion_gafs;
  private static final SubLString $str78$meta_assertion_gafs;
  private static final SubLString $str79$_______late_assertions;
  private static final SubLString $str80$_______finalization;
  private static final SubLString $str81$___core_kb_finalization_;
  private static final SubLSymbol $kw82$DEFAULT;
  private static final SubLSymbol $kw83$FORWARD;
  private static final SubLString $str84$Illegal_operation____not_bootstra;
  private static final SubLSymbol $kw85$BACKWARD;
  private static final SubLSymbol $sym86$EL_VAR_;
  private static final SubLString $str87$________Constructing_core_KB_at__;
  private static final SubLSymbol $kw88$STRICT;
  private static final SubLSymbol $kw89$ASSERTIVE;
  private static final SubLString $str90$________Construction_of_core_KB_c;
  private static final SubLString $str91$___find_or_create_constant__S__S_;
  private static final SubLSymbol $sym92$NART_P;
  private static final SubLString $str93$_;
  private static final SubLString $str94$_low_create_nart___;
  private static final SubLString $str95$_;
  private static final SubLString $str96$__;
  private static final SubLString $str97$________S;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$FIRST;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLObject $const102$UniversalVocabularyMt;
  private static final SubLString $str103$___low_assert_literal__;
  private static final SubLString $str104$__;
  private static final SubLString $str105$_;
  private static final SubLSymbol $sym106$WRITE_CORE_CONSTANT;
  private static final SubLSymbol $sym107$WRITE_CORE_NART;
  private static final SubLSymbol $sym108$WRITE_CORE_ASSERTION;
  private static final SubLString $str109$_S;
  private static final SubLString $str110$__find_nart___S_;
  private static final SubLSymbol $sym111$ASSERTION_P;
  private static final SubLString $str112$_s;
  private static final SubLSymbol $sym113$HLMT_P;
  private static final SubLList $list114;
  private static final SubLString $str115$___hl_assert_bookkeeping_binary_g;
  private static final SubLObject $const116$BookkeepingMt;
  private static final SubLString $str117$___;
  private static final SubLString $str118$___asserted_by__S__;
  private static final SubLString $str119$_fi_assert_int__;
  private static final SubLString $str120$___S__S__S___;
  private static final SubLString $str121$_tms_change_direction__find_asser;
  private static final SubLString $str122$___S___S___;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$GAF;
  private static final SubLSymbol $kw125$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym126$IGNORE_ERRORS_HANDLER;
  private static final SubLObject $const127$notAssertibleMt;
  private static final SubLString $str128$late_assertions;
  private static final SubLObject $const129$termOfUnit;
  private static final SubLObject $const130$cyclistNotes;
  private static final SubLSymbol $sym131$CACHED_CORE_CONSTANT_P;
  private static final SubLObject $const132$genlMt;
  private static final SubLObject $const133$genls;
  private static final SubLObject $const134$resultIsa;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1440L)
  public static SubLObject core_raw_constant_p(final SubLObject constant)
  {
    return makeBoolean( NIL != constant_handles.constant_p( constant ) && NIL != isa.quoted_isaP( constant, $core_seed_collection$.getGlobalValue(), $core_seed_mt$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1705L)
  public static SubLObject non_core_raw_constant_p(final SubLObject constant)
  {
    return makeBoolean( NIL != constant_handles.constant_p( constant ) && NIL == core_raw_constant_p( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1839L)
  public static SubLObject core_raw_el_formula_p(final SubLObject formula)
  {
    return makeBoolean( NIL == non_core_raw_el_formula_p( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1941L)
  public static SubLObject non_core_raw_el_formula_p(final SubLObject formula)
  {
    return list_utilities.tree_find_if( Symbols.symbol_function( $sym2$NON_CORE_RAW_CONSTANT_P ), formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2052L)
  public static SubLObject compute_core_raw_constants()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constants = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      constants = isa.all_quoted_instances( $core_seed_collection$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    constants = list_utilities.delete_if_not( Symbols.symbol_function( $sym3$CONSTANT_P ), constants, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    constants = kb_utilities.sort_terms( constants, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return constants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2520L)
  public static SubLObject all_core_raw_constants()
  {
    if( $kw5$UNINITIALIZED == $all_core_raw_constants$.getGlobalValue() )
    {
      final SubLObject core_raw_constants = compute_core_raw_constants();
      $all_core_raw_constants$.setGlobalValue( core_raw_constants );
    }
    return $all_core_raw_constants$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2829L)
  public static SubLObject compute_core_skolems()
  {
    SubLObject core_skolems = NIL;
    core_skolems = kb_utilities.sort_terms( core_skolems, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return core_skolems;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4584L)
  public static SubLObject all_core_skolems()
  {
    if( $kw5$UNINITIALIZED == $all_core_skolems$.getGlobalValue() )
    {
      final SubLObject core_skolems = compute_core_skolems();
      $all_core_skolems$.setGlobalValue( core_skolems );
    }
    return $all_core_skolems$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4845L)
  public static SubLObject compute_core_constants()
  {
    final SubLObject core_raw_constants = all_core_raw_constants();
    final SubLObject core_skolems = all_core_skolems();
    return Sequences.cconcatenate( core_raw_constants, core_skolems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5235L)
  public static SubLObject all_core_constants()
  {
    if( $kw5$UNINITIALIZED == $all_core_constants$.getGlobalValue() )
    {
      final SubLObject core_constants = compute_core_constants();
      $all_core_constants$.setGlobalValue( core_constants );
    }
    return $all_core_constants$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5609L)
  public static SubLObject initialize_core_constant_table()
  {
    final SubLObject core_constants = all_core_constants();
    $core_constant_table$.setGlobalValue( keyhash_utilities.keyhash_list_elements( core_constants, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return keyhash.keyhash_count( $core_constant_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5895L)
  public static SubLObject cached_core_constant_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL != keyhash.getkeyhash( v_object, $core_constant_table$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6030L)
  public static SubLObject cached_non_core_constant_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) && NIL == keyhash.getkeyhash( v_object, $core_constant_table$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6176L)
  public static SubLObject compute_core_narts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constants = all_core_constants();
    final SubLObject expected_nart_count = Numbers.integerDivide( Sequences.length( constants ), TEN_INTEGER );
    SubLObject narts = NIL;
    final SubLObject nart_set = set.new_set( Symbols.symbol_function( EQL ), expected_nart_count );
    final SubLObject list_var = constants;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str9$Computing_core_NARTs, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject constant = NIL;
        constant = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL != fort_types_interface.non_predicate_functionP( constant ) )
          {
            SubLObject cdolist_list_var;
            final SubLObject dependent_narts = cdolist_list_var = indexing_utilities.dependent_narts( constant );
            SubLObject dependent_nart = NIL;
            dependent_nart = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == set.set_memberP( dependent_nart, nart_set ) && NIL != core_nart_p( dependent_nart ) )
              {
                set.set_add( dependent_nart, nart_set );
              }
              cdolist_list_var = cdolist_list_var.rest();
              dependent_nart = cdolist_list_var.first();
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          constant = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    narts = kb_utilities.sort_terms( set.set_element_list( nart_set ), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return narts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6908L)
  public static SubLObject core_nart_p(final SubLObject nart)
  {
    return core_nart_formula_p( narts_high.nart_el_formula( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6998L)
  public static SubLObject core_nart_formula_p(final SubLObject nart_formula)
  {
    return makeBoolean( nart_formula.isCons() && NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym11$CACHED_NON_CORE_CONSTANT_P ), nart_formula, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7255L)
  public static SubLObject all_core_narts()
  {
    if( $kw5$UNINITIALIZED == $all_core_narts$.getGlobalValue() )
    {
      final SubLObject narts = compute_core_narts();
      $all_core_narts$.setGlobalValue( narts );
    }
    return $all_core_narts$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7490L)
  public static SubLObject compute_core_forts()
  {
    final SubLObject core_constants = all_core_constants();
    final SubLObject core_narts = all_core_narts();
    return Sequences.cconcatenate( core_constants, core_narts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7802L)
  public static SubLObject all_core_forts()
  {
    if( $kw5$UNINITIALIZED == $all_core_forts$.getGlobalValue() )
    {
      final SubLObject core_forts = compute_core_forts();
      $all_core_forts$.setGlobalValue( core_forts );
    }
    return $all_core_forts$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8042L)
  public static SubLObject initialize_core_fort_table()
  {
    final SubLObject core_forts = all_core_forts();
    $core_fort_table$.setGlobalValue( keyhash_utilities.keyhash_list_elements( core_forts, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return keyhash.keyhash_count( $core_fort_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8300L)
  public static SubLObject cached_core_fort_p(final SubLObject fort)
  {
    return keyhash.getkeyhash( fort, $core_fort_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8388L)
  public static SubLObject cached_non_core_fort_p(final SubLObject fort)
  {
    return makeBoolean( NIL != forts.fort_p( fort ) && NIL == cached_core_fort_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8504L)
  public static SubLObject core_sentence_p(final SubLObject sentence)
  {
    if( NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym15$CACHED_NON_CORE_FORT_P ), sentence, UNPROVIDED ) && NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym16$NON_CORE_ASSERTION_P ),
        sentence, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8767L)
  public static SubLObject core_assertion_p(final SubLObject assertion)
  {
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      final SubLObject cnf = assertions_high.assertion_cnf( assertion );
      if( NIL == cached_non_core_fort_p( hlmt.hlmt_monad_mt( mt ) ) && NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym15$CACHED_NON_CORE_FORT_P ), cnf, UNPROVIDED ) && NIL == list_utilities
          .tree_find_if( Symbols.symbol_function( $sym16$NON_CORE_ASSERTION_P ), cnf, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9354L)
  public static SubLObject non_core_assertion_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) && NIL == core_assertion_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9477L)
  public static SubLObject compute_core_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject core_rule_table = set.new_set( Symbols.symbol_function( EQL ), Sequences.length( all_core_forts() ) );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject list_var = all_core_forts();
      final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2_$4 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str17$determining_core_rules, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject fort = NIL;
          fort = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != kb_mapping_macros.do_term_index_key_validator( fort, $kw18$RULE ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( fort, $kw18$RULE );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$RULE, $kw19$TRUE, NIL );
                    SubLObject done_var_$5 = NIL;
                    final SubLObject token_var_$6 = NIL;
                    while ( NIL == done_var_$5)
                    {
                      final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                      final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( rule ) );
                      if( NIL != valid_$7 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( rule, final_index_spec ) && NIL == set.set_memberP( rule, core_rule_table ) && NIL != core_assertion_p( rule ) )
                      {
                        set.set_add( rule, core_rule_table );
                      }
                      done_var_$5 = makeBoolean( NIL == valid_$7 );
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
                done_var = makeBoolean( NIL == valid );
              }
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            fort = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_2_$4, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$3, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$2, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( core_rule_table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10065L)
  public static SubLObject all_core_rules()
  {
    if( $kw5$UNINITIALIZED == $all_core_rules$.getGlobalValue() )
    {
      final SubLObject core_rules = compute_core_rules();
      $all_core_rules$.setGlobalValue( core_rules );
    }
    return $all_core_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10262L)
  public static SubLObject identify_core_kb()
  {
    clear_core_state();
    initialize_core_constant_table();
    initialize_core_fort_table();
    all_core_rules();
    return Sequences.length( all_core_forts() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10526L)
  public static SubLObject clear_core_state()
  {
    $all_core_raw_constants$.setGlobalValue( $kw5$UNINITIALIZED );
    $all_core_skolems$.setGlobalValue( $kw5$UNINITIALIZED );
    $all_core_constants$.setGlobalValue( $kw5$UNINITIALIZED );
    $core_constant_table$.setGlobalValue( NIL );
    $all_core_narts$.setGlobalValue( $kw5$UNINITIALIZED );
    $all_core_forts$.setGlobalValue( $kw5$UNINITIALIZED );
    $core_fort_table$.setGlobalValue( NIL );
    $all_core_rules$.setGlobalValue( $kw5$UNINITIALIZED );
    clear_late_assertions();
    clear_core_mt_definitional_info();
    clear_core_definitional_info();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11114L)
  public static SubLObject compute_core_kb(SubLObject datafile)
  {
    if( datafile == UNPROVIDED )
    {
      datafile = NIL;
    }
    compute_core_definitional_info();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11413L)
  public static SubLObject compute_core_definitional_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    identify_core_kb();
    final SubLObject list_var = all_core_forts();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str21$Computing_definitional_info, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject fort = NIL;
        fort = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          core_mt_definitional_info( fort );
          core_definitional_info( fort );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          fort = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13289L)
  public static SubLObject clear_core_definitional_info()
  {
    final SubLObject cs = $core_definitional_info_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13289L)
  public static SubLObject remove_core_definitional_info(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $core_definitional_info_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13289L)
  public static SubLObject core_definitional_info_internal(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = $core_defining_arg1_predicates_info$.getDynamicValue( thread );
      SubLObject pred_info = NIL;
      pred_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = pred_info;
        SubLObject pred = NIL;
        SubLObject all_func = NIL;
        SubLObject test_func = NIL;
        SubLObject reflexive = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        all_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        test_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        reflexive = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( kb_indexing.num_gaf_arg_index( fort, ONE_INTEGER, pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
          {
            SubLObject true_values = kb_mapping_utilities.pred_values( fort, pred, ONE_INTEGER, TWO_INTEGER, $kw19$TRUE );
            SubLObject false_values = kb_mapping_utilities.pred_values( fort, pred, ONE_INTEGER, TWO_INTEGER, $kw25$FALSE );
            if( NIL != all_func && NIL != test_func )
            {
              true_values = minimal_implied_core_values( fort, true_values, all_func, test_func, reflexive );
              if( pred.eql( $const26$isa ) )
              {
                true_values = Sequences.delete( $const27$CycLConstant, true_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              if( pred.eql( $const28$quotedIsa ) )
              {
                true_values = Sequences.delete( $const27$CycLConstant, true_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            false_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            v_answer = ConsesLow.cons( reader.bq_cons( pred, ConsesLow.append( ( NIL != true_values ) ? ConsesLow.list( reader.bq_cons( $kw19$TRUE, ConsesLow.append( true_values, NIL ) ) ) : NIL, ( NIL != false_values )
                ? ConsesLow.list( reader.bq_cons( $kw25$FALSE, ConsesLow.append( false_values, NIL ) ) )
                : NIL, NIL ) ), v_answer );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred_info = cdolist_list_var.first();
      }
      cdolist_list_var = $core_defining_arg2_predicates_info$.getDynamicValue( thread );
      pred_info = NIL;
      pred_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = pred_info;
        SubLObject pred = NIL;
        SubLObject all_func = NIL;
        SubLObject test_func = NIL;
        SubLObject reflexive = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        all_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        test_func = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        reflexive = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( kb_indexing.num_gaf_arg_index( fort, TWO_INTEGER, pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
          {
            SubLObject true_values = kb_mapping_utilities.pred_values( fort, pred, TWO_INTEGER, ONE_INTEGER, $kw19$TRUE );
            SubLObject false_values = kb_mapping_utilities.pred_values( fort, pred, TWO_INTEGER, ONE_INTEGER, $kw25$FALSE );
            if( NIL != all_func && NIL != test_func )
            {
              true_values = minimal_implied_core_values( fort, true_values, all_func, test_func, reflexive );
            }
            false_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            v_answer = ConsesLow.cons( reader.bq_cons( pred, ConsesLow.append( ( NIL != true_values ) ? ConsesLow.list( reader.bq_cons( $kw19$TRUE, ConsesLow.append( true_values, NIL ) ) ) : NIL, ( NIL != false_values )
                ? ConsesLow.list( reader.bq_cons( $kw25$FALSE, ConsesLow.append( false_values, NIL ) ) )
                : NIL, NIL ) ), v_answer );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred_info = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13289L)
  public static SubLObject core_definitional_info(final SubLObject fort)
  {
    SubLObject caching_state = $core_definitional_info_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym23$CORE_DEFINITIONAL_INFO, $sym30$_CORE_DEFINITIONAL_INFO_CACHING_STATE_, NIL, EQL, ONE_INTEGER, $int31$300 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( core_definitional_info_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15289L)
  public static SubLObject minimal_implied_core_values(final SubLObject fort, final SubLObject given_values, final SubLObject all_func, final SubLObject test_func, final SubLObject reflexive)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), given_values, UNPROVIDED ) )
    {
      return given_values;
    }
    SubLObject full_values = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = given_values;
      SubLObject value = NIL;
      value = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        full_values = conses_high.nunion( full_values, Functions.funcall( all_func, value ), UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        value = cdolist_list_var.first();
      }
      full_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cycle_set = NIL;
      if( NIL != reflexive )
      {
        full_values = Sequences.delete( fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cycle_set = core_cycle_set( fort, full_values, test_func );
        if( NIL != cycle_set )
        {
          Errors.warn( $str32$__Cycle___S__S__S, test_func, fort, cycle_set );
          full_values = conses_high.nset_difference( full_values, cycle_set, UNPROVIDED, UNPROVIDED );
        }
      }
      full_values = list_utilities.delete_subsumed_items( full_values, test_func, UNPROVIDED );
      if( NIL != cycle_set )
      {
        full_values = conses_high.nunion( cycle_set, full_values, UNPROVIDED, UNPROVIDED );
        Errors.warn( $str33$__Given___S__Minimal___S, given_values, full_values );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return full_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16251L)
  public static SubLObject core_cycle_set(final SubLObject fort, final SubLObject full_values, final SubLObject test_func)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject cycle_set = NIL;
    SubLObject cdolist_list_var = full_values;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Functions.funcall( test_func, v_term, fort ) )
      {
        cycle_set = ConsesLow.cons( v_term, cycle_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return cycle_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16494L)
  public static SubLObject clear_core_mt_definitional_info()
  {
    final SubLObject cs = $core_mt_definitional_info_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16494L)
  public static SubLObject remove_core_mt_definitional_info(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $core_mt_definitional_info_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16494L)
  public static SubLObject core_mt_definitional_info_internal(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = $core_defining_arg1_predicates_info$.getDynamicValue( thread );
    SubLObject pred_info = NIL;
    pred_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_info;
      SubLObject pred = NIL;
      SubLObject all_func = NIL;
      SubLObject test_func = NIL;
      SubLObject reflexive = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      all_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      test_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      reflexive = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( kb_indexing.num_gaf_arg_index( fort, ONE_INTEGER, pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
        {
          final SubLObject core_mt_true_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( fort, pred, $const36$CoreCycLMt, ONE_INTEGER, $kw19$TRUE );
          final SubLObject core_mt_false_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( fort, pred, $const36$CoreCycLMt, ONE_INTEGER, $kw25$FALSE );
          SubLObject true_values = Mapping.mapcar( Symbols.symbol_function( $sym37$GAF_ARG2 ), core_mt_true_gafs );
          SubLObject false_values = Mapping.mapcar( Symbols.symbol_function( $sym37$GAF_ARG2 ), core_mt_false_gafs );
          SubLObject true_value_tuples = NIL;
          SubLObject false_value_tuples = NIL;
          if( NIL != all_func && NIL != test_func )
          {
            true_values = minimal_core_mt_implied_core_values( fort, true_values, all_func, test_func, reflexive );
            if( pred.eql( $const26$isa ) )
            {
              true_values = Sequences.delete( $const27$CycLConstant, true_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            if( pred.eql( $const28$quotedIsa ) )
            {
              true_values = Sequences.delete( $const27$CycLConstant, true_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          false_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var_$11 = core_mt_true_gafs;
          SubLObject core_mt_true_gaf = NIL;
          core_mt_true_gaf = cdolist_list_var_$11.first();
          while ( NIL != cdolist_list_var_$11)
          {
            final SubLObject value = assertions_high.gaf_arg2( core_mt_true_gaf );
            if( NIL != subl_promotions.memberP( value, true_values, UNPROVIDED, UNPROVIDED ) )
            {
              true_value_tuples = ConsesLow.cons( ConsesLow.list( value, assertions_high.assertion_mt( core_mt_true_gaf ) ), true_value_tuples );
            }
            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
            core_mt_true_gaf = cdolist_list_var_$11.first();
          }
          SubLObject cdolist_list_var_$12 = core_mt_false_gafs;
          SubLObject core_mt_false_gaf = NIL;
          core_mt_false_gaf = cdolist_list_var_$12.first();
          while ( NIL != cdolist_list_var_$12)
          {
            final SubLObject value = assertions_high.gaf_arg2( core_mt_false_gaf );
            if( NIL != subl_promotions.memberP( value, false_values, UNPROVIDED, UNPROVIDED ) )
            {
              false_value_tuples = ConsesLow.cons( ConsesLow.list( value, assertions_high.assertion_mt( core_mt_false_gaf ) ), false_value_tuples );
            }
            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
            core_mt_false_gaf = cdolist_list_var_$12.first();
          }
          v_answer = ConsesLow.cons( reader.bq_cons( pred, ConsesLow.append( ( NIL != true_value_tuples ) ? ConsesLow.list( reader.bq_cons( $kw19$TRUE, ConsesLow.append( true_value_tuples, NIL ) ) ) : NIL,
              ( NIL != false_value_tuples ) ? ConsesLow.list( reader.bq_cons( $kw25$FALSE, ConsesLow.append( false_value_tuples, NIL ) ) ) : NIL, NIL ) ), v_answer );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_info = cdolist_list_var.first();
    }
    cdolist_list_var = $core_defining_arg2_predicates_info$.getDynamicValue( thread );
    pred_info = NIL;
    pred_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_info;
      SubLObject pred = NIL;
      SubLObject all_func = NIL;
      SubLObject test_func = NIL;
      SubLObject reflexive = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      all_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      test_func = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      reflexive = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( kb_indexing.num_gaf_arg_index( fort, TWO_INTEGER, pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
        {
          final SubLObject core_mt_true_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( fort, pred, $const36$CoreCycLMt, TWO_INTEGER, $kw19$TRUE );
          final SubLObject core_mt_false_gafs = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( fort, pred, $const36$CoreCycLMt, TWO_INTEGER, $kw25$FALSE );
          SubLObject true_values = Mapping.mapcar( Symbols.symbol_function( $sym38$GAF_ARG1 ), core_mt_true_gafs );
          SubLObject false_values = Mapping.mapcar( Symbols.symbol_function( $sym38$GAF_ARG1 ), core_mt_false_gafs );
          SubLObject true_value_tuples = NIL;
          SubLObject false_value_tuples = NIL;
          if( NIL != all_func && NIL != test_func )
          {
            true_values = minimal_core_mt_implied_core_values( fort, true_values, all_func, test_func, reflexive );
          }
          false_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), false_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject cdolist_list_var_$13 = core_mt_true_gafs;
          SubLObject core_mt_true_gaf = NIL;
          core_mt_true_gaf = cdolist_list_var_$13.first();
          while ( NIL != cdolist_list_var_$13)
          {
            final SubLObject value = assertions_high.gaf_arg1( core_mt_true_gaf );
            if( NIL != subl_promotions.memberP( value, true_values, UNPROVIDED, UNPROVIDED ) )
            {
              true_value_tuples = ConsesLow.cons( ConsesLow.list( value, assertions_high.assertion_mt( core_mt_true_gaf ) ), true_value_tuples );
            }
            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
            core_mt_true_gaf = cdolist_list_var_$13.first();
          }
          SubLObject cdolist_list_var_$14 = core_mt_false_gafs;
          SubLObject core_mt_false_gaf = NIL;
          core_mt_false_gaf = cdolist_list_var_$14.first();
          while ( NIL != cdolist_list_var_$14)
          {
            final SubLObject value = assertions_high.gaf_arg1( core_mt_false_gaf );
            if( NIL != subl_promotions.memberP( value, false_values, UNPROVIDED, UNPROVIDED ) )
            {
              false_value_tuples = ConsesLow.cons( ConsesLow.list( value, assertions_high.assertion_mt( core_mt_false_gaf ) ), false_value_tuples );
            }
            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
            core_mt_false_gaf = cdolist_list_var_$14.first();
          }
          v_answer = ConsesLow.cons( reader.bq_cons( pred, ConsesLow.append( ( NIL != true_value_tuples ) ? ConsesLow.list( reader.bq_cons( $kw19$TRUE, ConsesLow.append( true_value_tuples, NIL ) ) ) : NIL,
              ( NIL != false_value_tuples ) ? ConsesLow.list( reader.bq_cons( $kw25$FALSE, ConsesLow.append( false_value_tuples, NIL ) ) ) : NIL, NIL ) ), v_answer );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_info = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16494L)
  public static SubLObject core_mt_definitional_info(final SubLObject fort)
  {
    SubLObject caching_state = $core_mt_definitional_info_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym35$CORE_MT_DEFINITIONAL_INFO, $sym39$_CORE_MT_DEFINITIONAL_INFO_CACHING_STATE_, NIL, EQL, ONE_INTEGER, $int31$300 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( core_mt_definitional_info_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19943L)
  public static SubLObject minimal_core_mt_implied_core_values(final SubLObject fort, final SubLObject given_values, final SubLObject all_func, final SubLObject test_func, final SubLObject reflexive)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), given_values, UNPROVIDED ) )
    {
      return given_values;
    }
    SubLObject full_values = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym40$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( $const36$CoreCycLMt, thread );
      SubLObject cdolist_list_var = given_values;
      SubLObject value = NIL;
      value = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        full_values = conses_high.nunion( full_values, Functions.funcall( all_func, value ), UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        value = cdolist_list_var.first();
      }
      full_values = list_utilities.delete_if_not( Symbols.symbol_function( $sym29$CACHED_CORE_FORT_P ), full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cycle_set = NIL;
      if( NIL != reflexive )
      {
        full_values = Sequences.delete( fort, full_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cycle_set = core_cycle_set( fort, full_values, test_func );
        if( NIL != cycle_set )
        {
          Errors.warn( $str32$__Cycle___S__S__S, test_func, fort, cycle_set );
          full_values = conses_high.nset_difference( full_values, cycle_set, UNPROVIDED, UNPROVIDED );
        }
      }
      full_values = list_utilities.delete_subsumed_items( full_values, test_func, UNPROVIDED );
      if( NIL != cycle_set )
      {
        full_values = conses_high.nunion( cycle_set, full_values, UNPROVIDED, UNPROVIDED );
        Errors.warn( $str33$__Given___S__Minimal___S, given_values, full_values );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return full_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20891L)
  public static SubLObject load_core_kb(final SubLObject filename)
  {
    return batch_ke.load_api( filename, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21233L)
  public static SubLObject write_core_kb(final SubLObject output_filename)
  {
    write_core_definition( output_filename, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21431L)
  public static SubLObject write_core_definition(final SubLObject output_filename, SubLObject computeP)
  {
    if( computeP == UNPROVIDED )
    {
      computeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != computeP )
    {
      compute_core_definitional_info();
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( output_filename, $kw41$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str42$Unable_to_open__S, output_filename );
      }
      final SubLObject s = stream;
      PrintLow.format( s, $str43$_______Mode__LISP__Package__CYC__ );
      PrintLow.format( s, $str44$____ );
      PrintLow.format( s, $str45$______A, misc_utilities.copyright_notice() );
      PrintLow.format( s, $str44$____ );
      PrintLow.format( s, $str45$______A, output_filename );
      PrintLow.format( s, $str45$______A, numeric_date_utilities.timestring( UNPROVIDED ) );
      PrintLow.format( s, $str44$____ );
      PrintLow.format( s, $str46$_____Core_KB_for_CycL_version__A_, new SubLObject[] { system_info.cyc_revision_string(), control_vars.kb_loaded(), operation_communication.kb_op_number()
      } );
      PrintLow.format( s, $str44$____ );
      PrintLow.format( s, $str47$_____This_file_is_automatically_g );
      PrintLow.format( s, $str48$_________________________________ );
      PrintLow.format( s, $str49$_____in_package__CYC__ );
      PrintLow.format( s, $str50$_______initialization );
      PrintLow.format( s, $str51$___core_kb_initialization__S_, Sequences.length( all_core_forts() ) );
      PrintLow.format( s, $str52$_______constants );
      SubLObject list_var = all_core_constants();
      SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str53$constant_creates, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_constant_creation( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str54$_____core_kb_start_bootstrapping_ );
      PrintLow.format( s, $str55$_______NARTs );
      list_var = all_core_narts();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str56$NART_creates, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_nart_creation( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str57$_______after_adding_early_extent_ );
      list_var = all_core_forts();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str58$after_adding_early_extent_asserts, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_after_adding_info_to_stream( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str59$_______Core_mt_definitional_asser );
      list_var = all_core_forts();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str60$Core_mt_definitional_asserts, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_mt_definitional_info_to_stream( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str61$_______decontextualization_early_ );
      list_var = all_core_forts();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str62$decontextualization_early_extent_, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_decontextualization_info_to_stream( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str63$_____core_kb_start_definitions_ );
      PrintLow.format( s, $str64$_______definitional_assertions );
      list_var = all_core_forts();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str65$definitional_asserts, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_definitional_info_to_stream( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values6 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values6 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str66$_______post_definitional_initiali );
      PrintLow.format( s, $str67$___core_kb_finish_definitions_ );
      PrintLow.format( s, $str68$_______additional_gaf_assertions );
      list_var = all_core_forts();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str69$additional_gaf_asserts, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject v_term = NIL;
          v_term = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            write_core_additional_gaf_info_to_stream( v_term, s );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            v_term = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values7 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values7 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str70$_____core_kb_finish_bootstrapping );
      PrintLow.format( s, $str71$_______rules__asserting_forward_r );
      list_var = all_core_rules();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str72$core_rules_with_meta_assertions__, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != assertion_utilities.assertion_has_meta_assertionsP( rule ) )
            {
              write_core_rule_assert_backward_if_forward( rule, s );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values8 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values8 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      list_var = all_core_rules();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str73$core_rules_without_meta_assertion, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL == assertion_utilities.assertion_has_meta_assertionsP( rule ) )
            {
              write_core_rule_assert_backward_if_forward( rule, s );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values9 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values9 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str74$_______forward_rules__reasserting );
      list_var = all_core_rules();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str75$core_rules_with_meta_assertions, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != assertion_utilities.assertion_has_meta_assertionsP( rule ) )
            {
              write_core_rule_reassert_as_forward_if_forward( rule, s );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values10 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values10 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      list_var = all_core_rules();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str76$core_rules_without_meta_assertion, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL == assertion_utilities.assertion_has_meta_assertionsP( rule ) )
            {
              write_core_rule_reassert_as_forward_if_forward( rule, s );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values11 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values11 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str77$_______meta_assertion_gafs );
      list_var = all_core_rules();
      _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str78$meta_assertion_gafs, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != assertion_utilities.assertion_has_meta_assertionsP( rule ) )
            {
              write_core_rule_meta_assertion_gafs( rule, s );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values12 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values12 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      PrintLow.format( s, $str79$_______late_assertions );
      write_late_assertions_to_stream( s );
      PrintLow.format( s, $str80$_______finalization );
      PrintLow.format( s, $str81$___core_kb_finalization_ );
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values13 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values13 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26227L)
  public static SubLObject low_create_nart(final SubLObject nart_hl_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    ensure_bootstrapping_kb();
    SubLObject nart = NIL;
    final SubLObject _prev_bind_0 = after_adding.$after_addings_disabledP$.currentBinding( thread );
    try
    {
      after_adding.$after_addings_disabledP$.bind( T, thread );
      nart = czer_main.low_find_or_create_nart( nart_hl_formula );
    }
    finally
    {
      after_adding.$after_addings_disabledP$.rebind( _prev_bind_0, thread );
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26505L)
  public static SubLObject low_assert_gaf(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw82$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw83$FORWARD;
    }
    return low_assert_literal( sentence, mt, strength, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26705L)
  public static SubLObject ensure_bootstrapping_kb()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$bootstrapping_kbP$.getDynamicValue( thread ) )
    {
      Errors.error( $str84$Illegal_operation____not_bootstra );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26866L)
  public static SubLObject low_assert_literal(final SubLObject literal, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw82$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw83$FORWARD;
    }
    ensure_bootstrapping_kb();
    final SubLObject asent = el_utilities.literal_atomic_sentence( literal );
    final SubLObject cnf = ( NIL != cycl_utilities.negatedP( literal ) ) ? clauses.make_cnf( ConsesLow.list( asent ), NIL ) : clauses.make_cnf( NIL, ConsesLow.list( asent ) );
    return low_assert_cnf_internal( cnf, mt, strength, direction, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27244L)
  public static SubLObject low_assert_cnf(SubLObject cnf, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw82$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw85$BACKWARD;
    }
    ensure_bootstrapping_kb();
    cnf = conses_high.copy_tree( cnf );
    SubLObject variable_map = NIL;
    final SubLObject el_variables = list_utilities.tree_gather( cnf, $sym86$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject el_variable = NIL;
    SubLObject variable_number = NIL;
    list_var = el_variables;
    el_variable = list_var.first();
    for( variable_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_variable = list_var.first(), variable_number = Numbers.add( ONE_INTEGER, variable_number ) )
    {
      final SubLObject hl_variable = variables.find_variable_by_id( variable_number );
      variable_map = ConsesLow.cons( bindings.make_variable_binding( el_variable, hl_variable ), variable_map );
    }
    variable_map = Sequences.nreverse( variable_map );
    cnf = conses_high.sublis( variable_map, cnf, UNPROVIDED, UNPROVIDED );
    return low_assert_cnf_internal( cnf, mt, strength, direction, variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27976L)
  public static SubLObject low_assert_cnf_internal(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject variable_map)
  {
    if( variable_map == UNPROVIDED )
    {
      variable_map = NIL;
    }
    return hl_storage_modules.hl_assert( cnf, mt, strength, direction, variable_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28215L)
  public static SubLObject core_kb_initialization(final SubLObject size)
  {
    $core_kb_start_time$.setGlobalValue( Time.get_universal_time() );
    PrintLow.format( T, $str87$________Constructing_core_KB_at__, numeric_date_utilities.timestring( $core_kb_start_time$.getGlobalValue() ) );
    kb_utilities.clear_kb_state( size );
    cardinality_estimates.setup_cardinality_tables( size );
    sbhl_link_methods.initialize_non_fort_isa_tables();
    kb_utilities.finalize_kb_tables();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28534L)
  public static SubLObject core_kb_start_bootstrapping()
  {
    Errors.$continue_cerrorP$.setDynamicValue( T );
    wff_utilities.set_dont_check_wff_semantics();
    czer_vars.$simplify_non_wff_literalP$.setDynamicValue( NIL );
    control_vars.$bootstrapping_kbP$.setDynamicValue( T );
    sbhl_paranoia.$suppress_sbhl_recachingP$.setDynamicValue( T );
    sbhl_module_vars.rebuild_sbhl_modules();
    somewhere_cache.reclassify_somewhere_cached_preds();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29039L)
  public static SubLObject core_kb_start_definitions()
  {
    after_adding.rebuild_after_adding_caches();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29132L)
  public static SubLObject core_kb_finish_definitions()
  {
    sbhl_paranoia.$suppress_sbhl_recachingP$.setDynamicValue( NIL );
    sbhl_cache.initialize_all_sbhl_caching();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29341L)
  public static SubLObject core_kb_finish_bootstrapping()
  {
    control_vars.$bootstrapping_kbP$.setDynamicValue( NIL );
    misc_utilities.system_code_initializations( UNPROVIDED );
    dumper.initialize_kb_features();
    sbhl_cache.initialize_all_sbhl_caching();
    somewhere_cache.initialize_all_somewhere_caches();
    arity.rebuild_arity_cache();
    cardinality_estimates.initialize_cardinalities();
    auxiliary_indexing.reconstruct_auxiliary_indices();
    wff_vars.$wff_mode$.setDynamicValue( $kw88$STRICT );
    forward.perform_forward_inference();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29786L)
  public static SubLObject core_kb_finalization()
  {
    wff_utilities.set_check_wff_semantics();
    wff.clear_assertive_wff_rules_cached();
    czer_main.clear_nart_defining_rules_cached();
    wff_vars.$wff_mode$.setDynamicValue( $kw89$ASSERTIVE );
    czer_vars.$simplify_non_wff_literalP$.setDynamicValue( T );
    dumper.load_essential_kb_initializations();
    dumper.load_kb_initializations();
    kb_utilities.finalize_kb_tables();
    dumper.rebuild_computable_content();
    control_vars.set_build_kb_loaded( ONE_INTEGER );
    if( NIL != $core_kb_start_time$.getGlobalValue() )
    {
      final SubLObject end_time = Time.get_universal_time();
      final SubLObject elapsed_time = Numbers.subtract( end_time, $core_kb_start_time$.getGlobalValue() );
      PrintLow.format( T, $str90$________Construction_of_core_KB_c, numeric_date_utilities.elapsed_time_abbreviation_string( elapsed_time ), numeric_date_utilities.timestring( end_time ) );
    }
    kb_utilities.kb_statistics( UNPROVIDED, UNPROVIDED );
    Storage.room( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30624L)
  public static SubLObject write_core_constant_creation(final SubLObject constant, final SubLObject stream)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject external_id = constants_high.constant_external_id( constant );
    PrintLow.format( stream, $str91$___find_or_create_constant__S__S_, name, external_id );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30933L)
  public static SubLObject write_core_nart_creation(final SubLObject nart, final SubLObject stream)
  {
    assert NIL != nart_handles.nart_p( nart ) : nart;
    streams_high.terpri( stream );
    write_core_nart_creation_internal( nart, stream, ZERO_INTEGER );
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31100L)
  public static SubLObject write_core_nart_creation_internal(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      final SubLObject hl_formula = narts_high.nart_hl_formula( v_object );
      if( !depth.numE( ZERO_INTEGER ) )
      {
        print_high.princ( $str93$_, stream );
      }
      print_high.princ( $str94$_low_create_nart___, stream );
      SubLObject cdolist_list_var = hl_formula;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !arg.eql( hl_formula.first() ) )
        {
          print_high.princ( $str95$_, stream );
        }
        write_core_nart_creation_internal( arg, stream, Numbers.add( depth, ONE_INTEGER ) );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      print_high.princ( $str96$__, stream );
    }
    else
    {
      print_high.prin1( v_object, stream );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31574L)
  public static SubLObject write_core_mt_definitional_info_to_stream(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str97$________S, forts.fort_el_formula( fort ) );
    SubLObject cdolist_list_var;
    final SubLObject info = cdolist_list_var = core_mt_definitional_info( fort );
    SubLObject pred_info = NIL;
    pred_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_info;
      SubLObject pred = NIL;
      SubLObject truths = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      pred = current.first();
      current = ( truths = current.rest() );
      final SubLObject arg2_predicate = conses_high.member( pred, $core_defining_arg2_predicates_info$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym99$FIRST ) );
      SubLObject cdolist_list_var_$27 = truths;
      SubLObject truth_info = NIL;
      truth_info = cdolist_list_var_$27.first();
      while ( NIL != cdolist_list_var_$27)
      {
        SubLObject current_$29;
        final SubLObject datum_$28 = current_$29 = truth_info;
        SubLObject truth = NIL;
        SubLObject values = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$29, datum_$28, $list100 );
        truth = current_$29.first();
        current_$29 = current_$29.rest();
        SubLObject cdolist_list_var_$28;
        values = ( cdolist_list_var_$28 = current_$29 );
        SubLObject truth_value = NIL;
        truth_value = cdolist_list_var_$28.first();
        while ( NIL != cdolist_list_var_$28)
        {
          SubLObject current_$30;
          final SubLObject datum_$29 = current_$30 = truth_value;
          SubLObject value = NIL;
          SubLObject mt = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list101 );
          value = current_$30.first();
          current_$30 = current_$30.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list101 );
          mt = current_$30.first();
          current_$30 = current_$30.rest();
          if( NIL == current_$30 )
          {
            SubLObject formula = NIL;
            if( NIL != arg2_predicate )
            {
              formula = ConsesLow.list( pred, value, fort );
            }
            else
            {
              formula = ConsesLow.list( pred, fort, value );
            }
            if( truth != $kw19$TRUE )
            {
              formula = cycl_utilities.negate( formula );
            }
            write_core_low_assert( formula, mt, stream, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$29, $list101 );
          }
          cdolist_list_var_$28 = cdolist_list_var_$28.rest();
          truth_value = cdolist_list_var_$28.first();
        }
        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
        truth_info = cdolist_list_var_$27.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_info = cdolist_list_var.first();
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32399L)
  public static SubLObject write_core_definitional_info_to_stream(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str97$________S, forts.fort_el_formula( fort ) );
    SubLObject cdolist_list_var;
    final SubLObject info = cdolist_list_var = core_definitional_info( fort );
    SubLObject pred_info = NIL;
    pred_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_info;
      SubLObject pred = NIL;
      SubLObject truths = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      pred = current.first();
      current = ( truths = current.rest() );
      final SubLObject arg2_predicate = conses_high.member( pred, $core_defining_arg2_predicates_info$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym99$FIRST ) );
      SubLObject cdolist_list_var_$33 = truths;
      SubLObject truth_info = NIL;
      truth_info = cdolist_list_var_$33.first();
      while ( NIL != cdolist_list_var_$33)
      {
        SubLObject current_$35;
        final SubLObject datum_$34 = current_$35 = truth_info;
        SubLObject truth = NIL;
        SubLObject values = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$35, datum_$34, $list100 );
        truth = current_$35.first();
        current_$35 = current_$35.rest();
        SubLObject cdolist_list_var_$34;
        values = ( cdolist_list_var_$34 = current_$35 );
        SubLObject value = NIL;
        value = cdolist_list_var_$34.first();
        while ( NIL != cdolist_list_var_$34)
        {
          SubLObject formula = NIL;
          if( NIL != arg2_predicate )
          {
            formula = ConsesLow.list( pred, value, fort );
          }
          else
          {
            formula = ConsesLow.list( pred, fort, value );
          }
          if( truth != $kw19$TRUE )
          {
            formula = cycl_utilities.negate( formula );
          }
          write_core_low_assert( formula, $const102$UniversalVocabularyMt, stream, UNPROVIDED, UNPROVIDED );
          cdolist_list_var_$34 = cdolist_list_var_$34.rest();
          value = cdolist_list_var_$34.first();
        }
        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
        truth_info = cdolist_list_var_$33.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_info = cdolist_list_var.first();
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33187L)
  public static SubLObject write_core_low_assert(final SubLObject formula, final SubLObject mt, final SubLObject stream, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw82$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw83$FORWARD;
    }
    PrintLow.format( stream, $str103$___low_assert_literal__ );
    write_core_formula( formula, stream );
    print_high.princ( $str104$__, stream );
    write_core_hlmt( mt, stream, UNPROVIDED );
    if( strength != $kw82$DEFAULT || direction != $kw83$FORWARD )
    {
      print_high.princ( $str95$_, stream );
      print_high.prin1( strength, stream );
    }
    if( direction != $kw83$FORWARD )
    {
      print_high.princ( $str95$_, stream );
      print_high.prin1( direction, stream );
    }
    print_high.princ( $str105$_, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33679L)
  public static SubLObject write_core_formula(final SubLObject formula, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = format_cycl_expression.$format_cycl_expression_constant_method$.currentBinding( thread );
    final SubLObject _prev_bind_2 = format_cycl_expression.$format_cycl_expression_nat_method$.currentBinding( thread );
    final SubLObject _prev_bind_3 = format_cycl_expression.$format_cycl_expression_assertion_method$.currentBinding( thread );
    try
    {
      format_cycl_expression.$format_cycl_expression_constant_method$.bind( Symbols.symbol_function( $sym106$WRITE_CORE_CONSTANT ), thread );
      format_cycl_expression.$format_cycl_expression_nat_method$.bind( Symbols.symbol_function( $sym107$WRITE_CORE_NART ), thread );
      format_cycl_expression.$format_cycl_expression_assertion_method$.bind( Symbols.symbol_function( $sym108$WRITE_CORE_ASSERTION ), thread );
      format_cycl_expression.format_cycl_expression( formula, stream, NIL );
    }
    finally
    {
      format_cycl_expression.$format_cycl_expression_assertion_method$.rebind( _prev_bind_3, thread );
      format_cycl_expression.$format_cycl_expression_nat_method$.rebind( _prev_bind_2, thread );
      format_cycl_expression.$format_cycl_expression_constant_method$.rebind( _prev_bind_0, thread );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34007L)
  public static SubLObject write_core_constant(final SubLObject constant, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != constant_handles.constant_p( constant ) : constant;
    PrintLow.format( stream, $str109$_S, constant );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34180L)
  public static SubLObject write_core_nart(final SubLObject nart, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != nart_handles.nart_p( nart ) : nart;
    PrintLow.format( stream, $str110$__find_nart___S_, narts_high.nart_el_formula( nart ) );
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34361L)
  public static SubLObject write_core_fort(final SubLObject fort, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return write_core_nart( fort, stream, depth );
    }
    return write_core_constant( fort, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34580L)
  public static SubLObject write_core_assertion(final SubLObject assertion, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    PrintLow.format( stream, $str112$_s, cycl_utilities.hl_to_el( assertions_high.assertion_ist_formula( assertion ) ) );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34838L)
  public static SubLObject write_core_hlmt(final SubLObject v_hlmt, final SubLObject stream, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != hlmt.hlmt_p( v_hlmt ) : v_hlmt;
    return write_core_formula( v_hlmt, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34987L)
  public static SubLObject write_core_gaf_assert(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject formula = fi.assertion_hl_formula( assertion, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject strength = assertions_high.assertion_strength( assertion );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    write_core_low_assert( formula, mt, stream, strength, direction );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35325L)
  public static SubLObject write_core_bookkeeping_assert(final SubLObject asent, final SubLObject stream)
  {
    SubLObject pred = NIL;
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( asent, asent, $list114 );
    pred = asent.first();
    SubLObject current = asent.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, asent, $list114 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, asent, $list114 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      PrintLow.format( stream, $str115$___hl_assert_bookkeeping_binary_g );
      write_core_constant( pred, stream, UNPROVIDED );
      streams_high.write_string( $str95$_, stream, UNPROVIDED, UNPROVIDED );
      write_core_formula( arg1, stream );
      streams_high.write_string( $str95$_, stream, UNPROVIDED, UNPROVIDED );
      write_core_formula( arg2, stream );
      streams_high.write_string( $str95$_, stream, UNPROVIDED, UNPROVIDED );
      write_core_constant( $const116$BookkeepingMt, stream, UNPROVIDED );
      PrintLow.format( stream, $str117$___ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( asent, $list114 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35773L)
  public static SubLObject write_core_late_assert(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject formula = core_rule_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject strength = assertions_high.assertion_strength( assertion );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    streams_high.terpri( stream );
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      final SubLObject asserted_by = assertions_high.asserted_by( assertion );
      if( NIL != asserted_by )
      {
        PrintLow.format( stream, $str118$___asserted_by__S__, asserted_by );
      }
    }
    PrintLow.format( stream, $str119$_fi_assert_int__ );
    format_cycl_expression.format_cycl_expression( formula, stream, TWO_INTEGER );
    PrintLow.format( stream, $str120$___S__S__S___, new SubLObject[] { mt, strength, direction
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36430L)
  public static SubLObject write_core_rule_assert_backward_if_forward(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject formula = core_rule_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject strength = assertions_high.assertion_strength( assertion );
    SubLObject direction = assertions_high.assertion_direction( assertion );
    if( direction == $kw83$FORWARD )
    {
      direction = $kw85$BACKWARD;
    }
    streams_high.terpri( stream );
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      final SubLObject asserted_by = assertions_high.asserted_by( assertion );
      if( NIL != asserted_by )
      {
        PrintLow.format( stream, $str118$___asserted_by__S__, asserted_by );
      }
    }
    PrintLow.format( stream, $str119$_fi_assert_int__ );
    format_cycl_expression.format_cycl_expression( formula, stream, TWO_INTEGER );
    PrintLow.format( stream, $str120$___S__S__S___, new SubLObject[] { mt, strength, direction
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37213L)
  public static SubLObject write_core_rule_reassert_as_forward_if_forward(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject formula = core_rule_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    if( direction == $kw83$FORWARD )
    {
      streams_high.terpri( stream );
      if( NIL != assertions_high.asserted_assertionP( assertion ) )
      {
        final SubLObject asserted_by = assertions_high.asserted_by( assertion );
        if( NIL != asserted_by )
        {
          PrintLow.format( stream, $str118$___asserted_by__S__, asserted_by );
        }
      }
      PrintLow.format( stream, $str121$_tms_change_direction__find_asser );
      format_cycl_expression.format_cycl_expression( formula, stream, TWO_INTEGER );
      PrintLow.format( stream, $str122$___S___S___, mt, direction );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37913L)
  public static SubLObject write_core_rule_meta_assertion_gafs(final SubLObject rule, final SubLObject stream)
  {
    SubLObject cdolist_list_var = assertion_utilities.all_meta_assertions( rule );
    SubLObject meta_assertion = NIL;
    meta_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.gaf_assertionP( meta_assertion ) && NIL != core_assertion_p( meta_assertion ) )
      {
        write_core_late_assert( meta_assertion, stream );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38259L)
  public static SubLObject write_core_early_extent_to_stream(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    write_core_after_adding_info_to_stream( fort, stream );
    write_core_decontextualization_info_to_stream( fort, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38555L)
  public static SubLObject write_core_after_adding_info_to_stream(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = after_adding.$gaf_after_adding_predicates$.getGlobalValue();
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        write_core_early_extent_to_stream_int( fort, pred, stream );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      cdolist_list_var = rule_after_adding.$rule_after_adding_predicates$.getGlobalValue();
      pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        write_core_early_extent_to_stream_int( fort, pred, stream );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39202L)
  public static SubLObject write_core_decontextualization_info_to_stream(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = $decontextualization_predicates$.getGlobalValue();
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        write_core_early_extent_to_stream_int( fort, pred, stream );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39486L)
  public static SubLObject write_core_early_extent_to_stream_int(final SubLObject fort, final SubLObject pred, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, ONE_INTEGER, pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, ONE_INTEGER, pred );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw124$GAF, $kw19$TRUE, NIL );
            SubLObject done_var_$37 = NIL;
            final SubLObject token_var_$38 = NIL;
            while ( NIL == done_var_$37)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$38 );
              final SubLObject valid_$39 = makeBoolean( !token_var_$38.eql( assertion ) );
              if( NIL != valid_$39 )
              {
                SubLObject ignore_errors_tag = NIL;
                try
                {
                  thread.throwStack.push( $kw125$IGNORE_ERRORS_TARGET );
                  final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
                  try
                  {
                    Errors.$error_handler$.bind( Symbols.symbol_function( $sym126$IGNORE_ERRORS_HANDLER ), thread );
                    try
                    {
                      if( NIL != core_assertion_p( assertion ) && NIL == assertions_high.meta_assertionP( assertion ) )
                      {
                        write_core_gaf_assert( assertion, stream );
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
                  ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw125$IGNORE_ERRORS_TARGET );
                }
                finally
                {
                  thread.throwStack.pop();
                }
              }
              done_var_$37 = makeBoolean( NIL == valid_$39 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39801L)
  public static SubLObject write_core_additional_gaf_info_to_stream(final SubLObject fort, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1_preds = kb_indexing.key_gaf_arg_index( fort, ONE_INTEGER, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $core_seed_mt$.getGlobalValue() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = arg1_preds;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != core_additional_gaf_predicate( pred ) )
        {
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, ONE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, ONE_INTEGER, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw124$GAF, $kw19$TRUE, NIL );
                  SubLObject done_var_$40 = NIL;
                  final SubLObject token_var_$41 = NIL;
                  while ( NIL == done_var_$40)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$41 );
                    final SubLObject valid_$42 = makeBoolean( !token_var_$41.eql( assertion ) );
                    if( NIL != valid_$42 )
                    {
                      SubLObject ignore_errors_tag = NIL;
                      try
                      {
                        thread.throwStack.push( $kw125$IGNORE_ERRORS_TARGET );
                        final SubLObject _prev_bind_0_$43 = Errors.$error_handler$.currentBinding( thread );
                        try
                        {
                          Errors.$error_handler$.bind( Symbols.symbol_function( $sym126$IGNORE_ERRORS_HANDLER ), thread );
                          try
                          {
                            if( NIL != core_assertion_p( assertion ) && NIL == assertions_high.meta_assertionP( assertion ) )
                            {
                              if( NIL != core_kb_delay_assertionP( assertion ) )
                              {
                                core_kb_note_assertion_delayed( assertion );
                              }
                              else
                              {
                                write_core_gaf_assert( assertion, stream );
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
                          Errors.$error_handler$.rebind( _prev_bind_0_$43, thread );
                        }
                      }
                      catch( final Throwable ccatch_env_var )
                      {
                        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw125$IGNORE_ERRORS_TARGET );
                      }
                      finally
                      {
                        thread.throwStack.pop();
                      }
                    }
                    done_var_$40 = makeBoolean( NIL == valid_$42 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = bookkeeping_store.bookkeeping_asents_on_term( fort );
    SubLObject asent = NIL;
    asent = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != core_sentence_p( asent ) )
      {
        write_core_bookkeeping_assert( asent, stream );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      asent = cdolist_list_var2.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40678L)
  public static SubLObject core_kb_delay_assertionP(final SubLObject assertion)
  {
    return not_assertible_assertion_p( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40926L)
  public static SubLObject not_assertible_assertion_p(final SubLObject gaf)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( gaf ) && NIL != list_utilities.lengthE( assertions_high.gaf_formula( gaf ), TWO_INTEGER, UNPROVIDED ) && assertions_high.gaf_predicate( gaf ).eql(
        $const127$notAssertibleMt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41234L)
  public static SubLObject clear_late_assertions()
  {
    $late_assertions$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41321L)
  public static SubLObject core_kb_note_assertion_delayed(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $late_assertions$.setDynamicValue( ConsesLow.cons( assertion, $late_assertions$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41432L)
  public static SubLObject write_late_assertions_to_stream(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject list_var = Sequences.reverse( $late_assertions$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str128$late_assertions, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject ass = NIL;
        ass = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          write_core_late_assert( ass, stream );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          ass = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42054L)
  public static SubLObject core_additional_gaf_predicate(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != cached_core_fort_p( predicate ) && NIL == subl_promotions.memberP( predicate, $core_covered_gaf_predicates$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED )
        && NIL != fort_types_interface.predicateP( predicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42252L)
  public static SubLObject core_rule_formula(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject formula = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw125$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym126$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL == czer_main.canonicalizer_problemP( assertion ) )
          {
            formula = uncanonicalizer.assertion_el_formula( assertion );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw125$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == formula )
    {
      formula = fi.assertion_fi_formula( assertion, UNPROVIDED );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42706L)
  public static SubLObject constant_core_kb_link_sentences(final SubLObject constant)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    if( NIL == $core_constant_table$.getGlobalValue() )
    {
      initialize_core_constant_table();
    }
    SubLObject sentences = NIL;
    SubLObject cdolist_list_var;
    SubLObject isas = cdolist_list_var = genls.min_cols( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, isa.all_isa( constant, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED );
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentences = ConsesLow.cons( ConsesLow.list( $const26$isa, constant, v_isa ), sentences );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    isas = ( cdolist_list_var = genls.min_cols( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, isa.all_quoted_isa( constant, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED ) );
    v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !v_isa.eql( $const27$CycLConstant ) )
      {
        sentences = ConsesLow.cons( ConsesLow.list( $const28$quotedIsa, constant, v_isa ), sentences );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    if( NIL != fort_types_interface.microtheory_p( constant ) )
    {
      final SubLObject v_genl_mts = cdolist_list_var = genl_mts.min_mts( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, genl_mts.all_genl_mts( constant, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED ), UNPROVIDED );
      SubLObject genl_mt = NIL;
      genl_mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sentences = ConsesLow.cons( ConsesLow.list( $const132$genlMt, constant, genl_mt ), sentences );
        cdolist_list_var = cdolist_list_var.rest();
        genl_mt = cdolist_list_var.first();
      }
    }
    if( NIL != fort_types_interface.collectionP( constant ) )
    {
      final SubLObject v_genls = cdolist_list_var = genls.min_cols( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, genls.all_genls_in_any_mt( constant ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
          UNPROVIDED, UNPROVIDED );
      SubLObject genl = NIL;
      genl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sentences = ConsesLow.cons( ConsesLow.list( $const133$genls, constant, genl ), sentences );
        cdolist_list_var = cdolist_list_var.rest();
        genl = cdolist_list_var.first();
      }
    }
    if( NIL != kb_accessors.relationP( constant ) )
    {
      final SubLObject max_arity = arity.max_arity( constant );
      if( NIL != max_arity )
      {
        SubLObject end_var;
        SubLObject argnum;
        SubLObject argnum_pred;
        SubLObject argn_isas;
        SubLObject cdolist_list_var2;
        SubLObject argn_isa;
        SubLObject argn_quoted_isas;
        SubLObject argn_quoted_isa;
        for( end_var = number_utilities.f_1X( max_arity ), argnum = NIL, argnum = ONE_INTEGER; !argnum.numGE( end_var ); argnum = number_utilities.f_1X( argnum ) )
        {
          argnum_pred = kb_accessors.arg_isa_pred( argnum, UNPROVIDED, UNPROVIDED );
          argn_isas = kb_accessors.argn_isa( constant, argnum, UNPROVIDED );
          if( NIL != argn_isas )
          {
            argn_isas = ( cdolist_list_var2 = genls.min_cols( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, genls.union_all_genls( argn_isas, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
            argn_isa = NIL;
            argn_isa = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              sentences = ConsesLow.cons( ConsesLow.list( argnum_pred, constant, argn_isa ), sentences );
              cdolist_list_var2 = cdolist_list_var2.rest();
              argn_isa = cdolist_list_var2.first();
            }
          }
          argnum_pred = kb_accessors.arg_quoted_isa_pred( argnum, UNPROVIDED, UNPROVIDED );
          argn_quoted_isas = kb_accessors.argn_quoted_isa( constant, argnum, UNPROVIDED );
          if( NIL != argn_quoted_isas )
          {
            argn_quoted_isas = ( cdolist_list_var2 = genls.min_cols( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, genls.union_all_genls( argn_quoted_isas, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
            argn_quoted_isa = NIL;
            argn_quoted_isa = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              sentences = ConsesLow.cons( ConsesLow.list( argnum_pred, constant, argn_quoted_isa ), sentences );
              cdolist_list_var2 = cdolist_list_var2.rest();
              argn_quoted_isa = cdolist_list_var2.first();
            }
          }
        }
      }
    }
    if( NIL != fort_types_interface.functionP( constant ) )
    {
      SubLObject result_isas = kb_accessors.result_isa( constant, UNPROVIDED );
      if( NIL != result_isas )
      {
        result_isas = ( cdolist_list_var = genls.min_cols( list_utilities.delete_if_not( $sym131$CACHED_CORE_CONSTANT_P, genls.union_all_genls( result_isas, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
        SubLObject result_isa = NIL;
        result_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          sentences = ConsesLow.cons( ConsesLow.list( $const134$resultIsa, constant, result_isa ), sentences );
          cdolist_list_var = cdolist_list_var.rest();
          result_isa = cdolist_list_var.first();
        }
      }
    }
    return Sequences.nreverse( sentences );
  }

  public static SubLObject declare_core_file()
  {
    SubLFiles.declareFunction( me, "core_raw_constant_p", "CORE-RAW-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_core_raw_constant_p", "NON-CORE-RAW-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "core_raw_el_formula_p", "CORE-RAW-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_core_raw_el_formula_p", "NON-CORE-RAW-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_core_raw_constants", "COMPUTE-CORE-RAW-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_core_raw_constants", "ALL-CORE-RAW-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_core_skolems", "COMPUTE-CORE-SKOLEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_core_skolems", "ALL-CORE-SKOLEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_core_constants", "COMPUTE-CORE-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_core_constants", "ALL-CORE-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_core_constant_table", "INITIALIZE-CORE-CONSTANT-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_core_constant_p", "CACHED-CORE-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_non_core_constant_p", "CACHED-NON-CORE-CONSTANT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_core_narts", "COMPUTE-CORE-NARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "core_nart_p", "CORE-NART-P", 1, 0, false );
    SubLFiles.declareFunction( me, "core_nart_formula_p", "CORE-NART-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_core_narts", "ALL-CORE-NARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_core_forts", "COMPUTE-CORE-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_core_forts", "ALL-CORE-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_core_fort_table", "INITIALIZE-CORE-FORT-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_core_fort_p", "CACHED-CORE-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_non_core_fort_p", "CACHED-NON-CORE-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "core_sentence_p", "CORE-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "core_assertion_p", "CORE-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_core_assertion_p", "NON-CORE-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_core_rules", "COMPUTE-CORE-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_core_rules", "ALL-CORE-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "identify_core_kb", "IDENTIFY-CORE-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_core_state", "CLEAR-CORE-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_core_kb", "COMPUTE-CORE-KB", 0, 1, false );
    SubLFiles.declareFunction( me, "compute_core_definitional_info", "COMPUTE-CORE-DEFINITIONAL-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_core_definitional_info", "CLEAR-CORE-DEFINITIONAL-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_core_definitional_info", "REMOVE-CORE-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "core_definitional_info_internal", "CORE-DEFINITIONAL-INFO-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "core_definitional_info", "CORE-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "minimal_implied_core_values", "MINIMAL-IMPLIED-CORE-VALUES", 5, 0, false );
    SubLFiles.declareFunction( me, "core_cycle_set", "CORE-CYCLE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_core_mt_definitional_info", "CLEAR-CORE-MT-DEFINITIONAL-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_core_mt_definitional_info", "REMOVE-CORE-MT-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "core_mt_definitional_info_internal", "CORE-MT-DEFINITIONAL-INFO-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "core_mt_definitional_info", "CORE-MT-DEFINITIONAL-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "minimal_core_mt_implied_core_values", "MINIMAL-CORE-MT-IMPLIED-CORE-VALUES", 5, 0, false );
    SubLFiles.declareFunction( me, "load_core_kb", "LOAD-CORE-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "write_core_kb", "WRITE-CORE-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "write_core_definition", "WRITE-CORE-DEFINITION", 1, 1, false );
    SubLFiles.declareFunction( me, "low_create_nart", "LOW-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "low_assert_gaf", "LOW-ASSERT-GAF", 2, 2, false );
    SubLFiles.declareFunction( me, "ensure_bootstrapping_kb", "ENSURE-BOOTSTRAPPING-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "low_assert_literal", "LOW-ASSERT-LITERAL", 2, 2, false );
    SubLFiles.declareFunction( me, "low_assert_cnf", "LOW-ASSERT-CNF", 2, 2, false );
    SubLFiles.declareFunction( me, "low_assert_cnf_internal", "LOW-ASSERT-CNF-INTERNAL", 4, 1, false );
    SubLFiles.declareFunction( me, "core_kb_initialization", "CORE-KB-INITIALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "core_kb_start_bootstrapping", "CORE-KB-START-BOOTSTRAPPING", 0, 0, false );
    SubLFiles.declareFunction( me, "core_kb_start_definitions", "CORE-KB-START-DEFINITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "core_kb_finish_definitions", "CORE-KB-FINISH-DEFINITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "core_kb_finish_bootstrapping", "CORE-KB-FINISH-BOOTSTRAPPING", 0, 0, false );
    SubLFiles.declareFunction( me, "core_kb_finalization", "CORE-KB-FINALIZATION", 0, 0, false );
    SubLFiles.declareFunction( me, "write_core_constant_creation", "WRITE-CORE-CONSTANT-CREATION", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_nart_creation", "WRITE-CORE-NART-CREATION", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_nart_creation_internal", "WRITE-CORE-NART-CREATION-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "write_core_mt_definitional_info_to_stream", "WRITE-CORE-MT-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "write_core_definitional_info_to_stream", "WRITE-CORE-DEFINITIONAL-INFO-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "write_core_low_assert", "WRITE-CORE-LOW-ASSERT", 3, 2, false );
    SubLFiles.declareFunction( me, "write_core_formula", "WRITE-CORE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_constant", "WRITE-CORE-CONSTANT", 2, 1, false );
    SubLFiles.declareFunction( me, "write_core_nart", "WRITE-CORE-NART", 2, 1, false );
    SubLFiles.declareFunction( me, "write_core_fort", "WRITE-CORE-FORT", 2, 1, false );
    SubLFiles.declareFunction( me, "write_core_assertion", "WRITE-CORE-ASSERTION", 2, 1, false );
    SubLFiles.declareFunction( me, "write_core_hlmt", "WRITE-CORE-HLMT", 2, 1, false );
    SubLFiles.declareFunction( me, "write_core_gaf_assert", "WRITE-CORE-GAF-ASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_bookkeeping_assert", "WRITE-CORE-BOOKKEEPING-ASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_late_assert", "WRITE-CORE-LATE-ASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_rule_assert_backward_if_forward", "WRITE-CORE-RULE-ASSERT-BACKWARD-IF-FORWARD", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_rule_reassert_as_forward_if_forward", "WRITE-CORE-RULE-REASSERT-AS-FORWARD-IF-FORWARD", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_rule_meta_assertion_gafs", "WRITE-CORE-RULE-META-ASSERTION-GAFS", 2, 0, false );
    SubLFiles.declareFunction( me, "write_core_early_extent_to_stream", "WRITE-CORE-EARLY-EXTENT-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "write_core_after_adding_info_to_stream", "WRITE-CORE-AFTER-ADDING-INFO-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "write_core_decontextualization_info_to_stream", "WRITE-CORE-DECONTEXTUALIZATION-INFO-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "write_core_early_extent_to_stream_int", "WRITE-CORE-EARLY-EXTENT-TO-STREAM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "write_core_additional_gaf_info_to_stream", "WRITE-CORE-ADDITIONAL-GAF-INFO-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "core_kb_delay_assertionP", "CORE-KB-DELAY-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "not_assertible_assertion_p", "NOT-ASSERTIBLE-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_late_assertions", "CLEAR-LATE-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "core_kb_note_assertion_delayed", "CORE-KB-NOTE-ASSERTION-DELAYED", 1, 0, false );
    SubLFiles.declareFunction( me, "write_late_assertions_to_stream", "WRITE-LATE-ASSERTIONS-TO-STREAM", 0, 1, false );
    SubLFiles.declareFunction( me, "core_additional_gaf_predicate", "CORE-ADDITIONAL-GAF-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "core_rule_formula", "CORE-RULE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_core_kb_link_sentences", "CONSTANT-CORE-KB-LINK-SENTENCES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_core_file()
  {
    $core_seed_collection$ = SubLFiles.deflexical( "*CORE-SEED-COLLECTION*", $const0$CoreUnionConstant );
    $core_seed_mt$ = SubLFiles.deflexical( "*CORE-SEED-MT*", $list1 );
    $all_core_raw_constants$ = SubLFiles.deflexical( "*ALL-CORE-RAW-CONSTANTS*", ( maybeDefault( $sym4$_ALL_CORE_RAW_CONSTANTS_, $all_core_raw_constants$, $kw5$UNINITIALIZED ) ) );
    $all_core_skolems$ = SubLFiles.deflexical( "*ALL-CORE-SKOLEMS*", ( maybeDefault( $sym6$_ALL_CORE_SKOLEMS_, $all_core_skolems$, NIL ) ) );
    $all_core_constants$ = SubLFiles.deflexical( "*ALL-CORE-CONSTANTS*", ( maybeDefault( $sym7$_ALL_CORE_CONSTANTS_, $all_core_constants$, $kw5$UNINITIALIZED ) ) );
    $core_constant_table$ = SubLFiles.deflexical( "*CORE-CONSTANT-TABLE*", ( maybeDefault( $sym8$_CORE_CONSTANT_TABLE_, $core_constant_table$, NIL ) ) );
    $all_core_narts$ = SubLFiles.deflexical( "*ALL-CORE-NARTS*", ( maybeDefault( $sym12$_ALL_CORE_NARTS_, $all_core_narts$, $kw5$UNINITIALIZED ) ) );
    $all_core_forts$ = SubLFiles.deflexical( "*ALL-CORE-FORTS*", ( maybeDefault( $sym13$_ALL_CORE_FORTS_, $all_core_forts$, $kw5$UNINITIALIZED ) ) );
    $core_fort_table$ = SubLFiles.deflexical( "*CORE-FORT-TABLE*", ( maybeDefault( $sym14$_CORE_FORT_TABLE_, $core_fort_table$, NIL ) ) );
    $all_core_rules$ = SubLFiles.deflexical( "*ALL-CORE-RULES*", ( maybeDefault( $sym20$_ALL_CORE_RULES_, $all_core_rules$, $kw5$UNINITIALIZED ) ) );
    $core_defining_arg1_predicates_info$ = SubLFiles.defparameter( "*CORE-DEFINING-ARG1-PREDICATES-INFO*", $list22 );
    $core_defining_arg2_predicates_info$ = SubLFiles.defparameter( "*CORE-DEFINING-ARG2-PREDICATES-INFO*", NIL );
    $core_definitional_info_caching_state$ = SubLFiles.deflexical( "*CORE-DEFINITIONAL-INFO-CACHING-STATE*", NIL );
    $core_mt_definitional_info_caching_state$ = SubLFiles.deflexical( "*CORE-MT-DEFINITIONAL-INFO-CACHING-STATE*", NIL );
    $core_kb_start_time$ = SubLFiles.deflexical( "*CORE-KB-START-TIME*", NIL );
    $decontextualization_predicates$ = SubLFiles.deflexical( "*DECONTEXTUALIZATION-PREDICATES*", $list123 );
    $late_assertions$ = SubLFiles.defvar( "*LATE-ASSERTIONS*", NIL );
    $core_covered_gaf_predicates$ = SubLFiles.defparameter( "*CORE-COVERED-GAF-PREDICATES*", ConsesLow.nconc( new SubLObject[] { Mapping.mapcar( Symbols.symbol_function( $sym99$FIRST ),
        $core_defining_arg1_predicates_info$.getDynamicValue() ), Mapping.mapcar( Symbols.symbol_function( $sym99$FIRST ), $core_defining_arg2_predicates_info$.getDynamicValue() ), conses_high.copy_list(
            after_adding.$gaf_after_adding_predicates$.getGlobalValue() ), conses_high.copy_list( rule_after_adding.$rule_after_adding_predicates$.getGlobalValue() ), ConsesLow.list( $const129$termOfUnit,
                $const130$cyclistNotes )
    } ) );
    return NIL;
  }

  public static SubLObject setup_core_file()
  {
    subl_macro_promotions.declare_defglobal( $sym4$_ALL_CORE_RAW_CONSTANTS_ );
    subl_macro_promotions.declare_defglobal( $sym6$_ALL_CORE_SKOLEMS_ );
    subl_macro_promotions.declare_defglobal( $sym7$_ALL_CORE_CONSTANTS_ );
    subl_macro_promotions.declare_defglobal( $sym8$_CORE_CONSTANT_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym12$_ALL_CORE_NARTS_ );
    subl_macro_promotions.declare_defglobal( $sym13$_ALL_CORE_FORTS_ );
    subl_macro_promotions.declare_defglobal( $sym14$_CORE_FORT_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym20$_ALL_CORE_RULES_ );
    memoization_state.note_globally_cached_function( $sym23$CORE_DEFINITIONAL_INFO );
    memoization_state.note_globally_cached_function( $sym35$CORE_MT_DEFINITIONAL_INFO );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_core_file();
  }

  @Override
  public void initializeVariables()
  {
    init_core_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_core_file();
  }
  static
  {
    me = new core();
    $core_seed_collection$ = null;
    $core_seed_mt$ = null;
    $all_core_raw_constants$ = null;
    $all_core_skolems$ = null;
    $all_core_constants$ = null;
    $core_constant_table$ = null;
    $all_core_narts$ = null;
    $all_core_forts$ = null;
    $core_fort_table$ = null;
    $all_core_rules$ = null;
    $core_defining_arg1_predicates_info$ = null;
    $core_defining_arg2_predicates_info$ = null;
    $core_definitional_info_caching_state$ = null;
    $core_mt_definitional_info_caching_state$ = null;
    $core_kb_start_time$ = null;
    $decontextualization_predicates$ = null;
    $late_assertions$ = null;
    $core_covered_gaf_predicates$ = null;
    $const0$CoreUnionConstant = constant_handles.reader_make_constant_shell( makeString( "CoreUnionConstant" ) );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ), constant_handles.reader_make_constant_shell(
        makeString( "BookkeepingMt" ) ) );
    $sym2$NON_CORE_RAW_CONSTANT_P = makeSymbol( "NON-CORE-RAW-CONSTANT-P" );
    $sym3$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym4$_ALL_CORE_RAW_CONSTANTS_ = makeSymbol( "*ALL-CORE-RAW-CONSTANTS*" );
    $kw5$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym6$_ALL_CORE_SKOLEMS_ = makeSymbol( "*ALL-CORE-SKOLEMS*" );
    $sym7$_ALL_CORE_CONSTANTS_ = makeSymbol( "*ALL-CORE-CONSTANTS*" );
    $sym8$_CORE_CONSTANT_TABLE_ = makeSymbol( "*CORE-CONSTANT-TABLE*" );
    $str9$Computing_core_NARTs = makeString( "Computing core NARTs" );
    $str10$cdolist = makeString( "cdolist" );
    $sym11$CACHED_NON_CORE_CONSTANT_P = makeSymbol( "CACHED-NON-CORE-CONSTANT-P" );
    $sym12$_ALL_CORE_NARTS_ = makeSymbol( "*ALL-CORE-NARTS*" );
    $sym13$_ALL_CORE_FORTS_ = makeSymbol( "*ALL-CORE-FORTS*" );
    $sym14$_CORE_FORT_TABLE_ = makeSymbol( "*CORE-FORT-TABLE*" );
    $sym15$CACHED_NON_CORE_FORT_P = makeSymbol( "CACHED-NON-CORE-FORT-P" );
    $sym16$NON_CORE_ASSERTION_P = makeSymbol( "NON-CORE-ASSERTION-P" );
    $str17$determining_core_rules = makeString( "determining core rules" );
    $kw18$RULE = makeKeyword( "RULE" );
    $kw19$TRUE = makeKeyword( "TRUE" );
    $sym20$_ALL_CORE_RULES_ = makeSymbol( "*ALL-CORE-RULES*" );
    $str21$Computing_definitional_info = makeString( "Computing definitional info" );
    $list22 = ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "genls" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), T ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ),
                NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "arg2Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "arg2Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) ), makeSymbol( "ALL-GENLS" ),
                            makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg3Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list(
                                constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "arg4Genl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                        makeString( "arg5Isa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) ),
                                            makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) ), makeSymbol( "ALL-GENLS" ),
                                                makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol(
                                                    "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg3QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "arg4QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arg5QuotedIsa" ) ), makeSymbol( "ALL-GENLS" ),
              makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argsQuotedIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "resultGenl" ) ), makeSymbol( "ALL-GENLS" ), makeSymbol( "GENL?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol(
                          "ALL-GENL-PREDS" ), makeSymbol( "GENL-PRED?" ), T ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), makeSymbol( "ALL-GENL-PREDS" ), makeSymbol(
                              "GENL-PRED?" ), NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), makeSymbol( "ALL-GENL-MTS" ), makeSymbol( "GENL-MT?" ), T ), ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "arity" ) ), NIL, NIL, NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arityMin" ) ), NIL, NIL,
                                      NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "arityMax" ) ), NIL, NIL, NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "defnIff" ) ), NIL, NIL, NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "defnNecessary" ) ), NIL, NIL, NIL ), ConsesLow.list(
                                              constant_handles.reader_make_constant_shell( makeString( "defnSufficient" ) ), NIL, NIL, NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                  "quotedDefnIff" ) ), NIL, NIL, NIL ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedDefnNecessary" ) ), NIL, NIL, NIL ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "quotedDefnSufficient" ) ), NIL, NIL, NIL )
    } );
    $sym23$CORE_DEFINITIONAL_INFO = makeSymbol( "CORE-DEFINITIONAL-INFO" );
    $list24 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ALL-FUNC" ), makeSymbol( "TEST-FUNC" ), makeSymbol( "REFLEXIVE" ) );
    $kw25$FALSE = makeKeyword( "FALSE" );
    $const26$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const27$CycLConstant = constant_handles.reader_make_constant_shell( makeString( "CycLConstant" ) );
    $const28$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $sym29$CACHED_CORE_FORT_P = makeSymbol( "CACHED-CORE-FORT-P" );
    $sym30$_CORE_DEFINITIONAL_INFO_CACHING_STATE_ = makeSymbol( "*CORE-DEFINITIONAL-INFO-CACHING-STATE*" );
    $int31$300 = makeInteger( 300 );
    $str32$__Cycle___S__S__S = makeString( "~%Cycle: ~S ~S ~S" );
    $str33$__Given___S__Minimal___S = makeString( "~%Given: ~S~%Minimal: ~S" );
    $sym34$FORT_P = makeSymbol( "FORT-P" );
    $sym35$CORE_MT_DEFINITIONAL_INFO = makeSymbol( "CORE-MT-DEFINITIONAL-INFO" );
    $const36$CoreCycLMt = constant_handles.reader_make_constant_shell( makeString( "CoreCycLMt" ) );
    $sym37$GAF_ARG2 = makeSymbol( "GAF-ARG2" );
    $sym38$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $sym39$_CORE_MT_DEFINITIONAL_INFO_CACHING_STATE_ = makeSymbol( "*CORE-MT-DEFINITIONAL-INFO-CACHING-STATE*" );
    $sym40$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $kw41$OUTPUT = makeKeyword( "OUTPUT" );
    $str42$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str43$_______Mode__LISP__Package__CYC__ = makeString( ";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-" );
    $str44$____ = makeString( "~%;;" );
    $str45$______A = makeString( "~%;; ~A" );
    $str46$_____Core_KB_for_CycL_version__A_ = makeString( "~%;; Core KB for CycL version ~A from KB ~S.~S" );
    $str47$_____This_file_is_automatically_g = makeString( "~%;; This file is automatically generated!  See CYC:CYCL;CORE.LISP for details." );
    $str48$_________________________________ = makeString( "~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" );
    $str49$_____in_package__CYC__ = makeString( "~%~%(in-package \"CYC\")" );
    $str50$_______initialization = makeString( "~%~%;; initialization" );
    $str51$___core_kb_initialization__S_ = makeString( "~%(core-kb-initialization ~S)" );
    $str52$_______constants = makeString( "~%~%;; constants" );
    $str53$constant_creates = makeString( "constant creates" );
    $str54$_____core_kb_start_bootstrapping_ = makeString( "~%~%(core-kb-start-bootstrapping)" );
    $str55$_______NARTs = makeString( "~%~%;; NARTs" );
    $str56$NART_creates = makeString( "NART creates" );
    $str57$_______after_adding_early_extent_ = makeString( "~%~%;; after adding early extent gafs" );
    $str58$after_adding_early_extent_asserts = makeString( "after adding early extent asserts" );
    $str59$_______Core_mt_definitional_asser = makeString( "~%~%;; Core mt definitional assertions" );
    $str60$Core_mt_definitional_asserts = makeString( "Core mt definitional asserts" );
    $str61$_______decontextualization_early_ = makeString( "~%~%;; decontextualization early extent gafs" );
    $str62$decontextualization_early_extent_ = makeString( "decontextualization early extent asserts" );
    $str63$_____core_kb_start_definitions_ = makeString( "~%~%(core-kb-start-definitions)" );
    $str64$_______definitional_assertions = makeString( "~%~%;; definitional assertions" );
    $str65$definitional_asserts = makeString( "definitional asserts" );
    $str66$_______post_definitional_initiali = makeString( "~%~%;; post-definitional initializations" );
    $str67$___core_kb_finish_definitions_ = makeString( "~%(core-kb-finish-definitions)" );
    $str68$_______additional_gaf_assertions = makeString( "~%~%;; additional gaf assertions" );
    $str69$additional_gaf_asserts = makeString( "additional gaf asserts" );
    $str70$_____core_kb_finish_bootstrapping = makeString( "~%~%(core-kb-finish-bootstrapping)" );
    $str71$_______rules__asserting_forward_r = makeString( "~%~%;; rules (asserting forward rules as backward)" );
    $str72$core_rules_with_meta_assertions__ = makeString( "core rules with meta-assertions (asserting forward rules as backward)" );
    $str73$core_rules_without_meta_assertion = makeString( "core rules without meta-assertions (asserting forward rules as backward)" );
    $str74$_______forward_rules__reasserting = makeString( "~%~%;; forward rules (reasserting as forward)" );
    $str75$core_rules_with_meta_assertions = makeString( "core rules with meta-assertions" );
    $str76$core_rules_without_meta_assertion = makeString( "core rules without meta-assertions" );
    $str77$_______meta_assertion_gafs = makeString( "~%~%;; meta-assertion gafs" );
    $str78$meta_assertion_gafs = makeString( "meta-assertion gafs" );
    $str79$_______late_assertions = makeString( "~%~%;; late assertions" );
    $str80$_______finalization = makeString( "~%~%;; finalization" );
    $str81$___core_kb_finalization_ = makeString( "~%(core-kb-finalization)" );
    $kw82$DEFAULT = makeKeyword( "DEFAULT" );
    $kw83$FORWARD = makeKeyword( "FORWARD" );
    $str84$Illegal_operation____not_bootstra = makeString( "Illegal operation -- not bootstrapping KB" );
    $kw85$BACKWARD = makeKeyword( "BACKWARD" );
    $sym86$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $str87$________Constructing_core_KB_at__ = makeString( "~&~%;;; Constructing core KB at ~A~%" );
    $kw88$STRICT = makeKeyword( "STRICT" );
    $kw89$ASSERTIVE = makeKeyword( "ASSERTIVE" );
    $str90$________Construction_of_core_KB_c = makeString( "~&~%;;; Construction of core KB completed (~A) at ~A~%" );
    $str91$___find_or_create_constant__S__S_ = makeString( "~%(find-or-create-constant ~S ~S)" );
    $sym92$NART_P = makeSymbol( "NART-P" );
    $str93$_ = makeString( "," );
    $str94$_low_create_nart___ = makeString( "(low-create-nart `(" );
    $str95$_ = makeString( " " );
    $str96$__ = makeString( "))" );
    $str97$________S = makeString( "~%~%;; ~S" );
    $list98 = ConsesLow.cons( makeSymbol( "PRED" ), makeSymbol( "TRUTHS" ) );
    $sym99$FIRST = makeSymbol( "FIRST" );
    $list100 = ConsesLow.cons( makeSymbol( "TRUTH" ), makeSymbol( "VALUES" ) );
    $list101 = ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "MT" ) );
    $const102$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $str103$___low_assert_literal__ = makeString( "~%(low-assert-literal `" );
    $str104$__ = makeString( " `" );
    $str105$_ = makeString( ")" );
    $sym106$WRITE_CORE_CONSTANT = makeSymbol( "WRITE-CORE-CONSTANT" );
    $sym107$WRITE_CORE_NART = makeSymbol( "WRITE-CORE-NART" );
    $sym108$WRITE_CORE_ASSERTION = makeSymbol( "WRITE-CORE-ASSERTION" );
    $str109$_S = makeString( "~S" );
    $str110$__find_nart___S_ = makeString( ",(find-nart '~S)" );
    $sym111$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str112$_s = makeString( "~s" );
    $sym113$HLMT_P = makeSymbol( "HLMT-P" );
    $list114 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $str115$___hl_assert_bookkeeping_binary_g = makeString( "~%(hl-assert-bookkeeping-binary-gaf " );
    $const116$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $str117$___ = makeString( ")~%" );
    $str118$___asserted_by__S__ = makeString( ";; asserted by ~S~%" );
    $str119$_fi_assert_int__ = makeString( "(fi-assert-int '" );
    $str120$___S__S__S___ = makeString( "~%~S ~S ~S)~%" );
    $str121$_tms_change_direction__find_asser = makeString( "(tms-change-direction (find-assertion-cycl '" );
    $str122$___S___S___ = makeString( "~%~S) ~S)~%" );
    $list123 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decontextualizedPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "predicateConventionMt" ) ),
        constant_handles.reader_make_constant_shell( makeString( "decontextualizedCollection" ) ), constant_handles.reader_make_constant_shell( makeString( "collectionConventionMt" ) ) );
    $kw124$GAF = makeKeyword( "GAF" );
    $kw125$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym126$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $const127$notAssertibleMt = constant_handles.reader_make_constant_shell( makeString( "notAssertibleMt" ) );
    $str128$late_assertions = makeString( "late assertions" );
    $const129$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const130$cyclistNotes = constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) );
    $sym131$CACHED_CORE_CONSTANT_P = makeSymbol( "CACHED-CORE-CONSTANT-P" );
    $const132$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const133$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const134$resultIsa = constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) );
  }
}
/*
 * 
 * Total time: 2476 ms
 * 
 */