package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cache_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cache_utilities";
  public static final String myFingerPrint = "71368893c14ebf91e8533b075b52502796e747590c06662ba6c45e36d155ff5e";
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13591L)
  public static SubLSymbol $cache_strategy_object_p_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13724L)
  public static SubLSymbol $cache_strategy_object_reset_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13893L)
  public static SubLSymbol $cache_strategy_object_cache_capacity_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14080L)
  public static SubLSymbol $cache_strategy_object_cache_size_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14259L)
  public static SubLSymbol $cache_strategy_object_track_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14457L)
  public static SubLSymbol $cache_strategy_object_trackedP_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14668L)
  public static SubLSymbol $cache_strategy_object_untrack_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14871L)
  public static SubLSymbol $cache_strategy_object_supports_parameter_p_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15058L)
  public static SubLSymbol $cache_strategy_object_get_parameter_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15298L)
  public static SubLSymbol $cache_strategy_object_set_parameter_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15538L)
  public static SubLSymbol $cache_strategy_object_note_reference_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15747L)
  public static SubLSymbol $cache_strategy_object_note_references_in_order_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16367L)
  public static SubLSymbol $cache_strategy_object_get_metrics_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16546L)
  public static SubLSymbol $cache_strategy_object_reset_metrics_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16729L)
  public static SubLSymbol $cache_strategy_object_gather_metrics_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16938L)
  public static SubLSymbol $cache_strategy_object_dont_gather_metrics_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17133L)
  public static SubLSymbol $cache_strategy_object_keeps_metrics_p_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17341L)
  public static SubLSymbol $new_cache_strategy_object_tracked_content_iterator_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17544L)
  public static SubLSymbol $map_cache_strategy_object_tracked_content_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 18109L)
  public static SubLSymbol $cache_strategy_object_untrack_all_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLSymbol $dtp_cache_metrics$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 23102L)
  private static SubLSymbol $cfasl_wide_opcode_cache_metrics$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLSymbol $dtp_metered_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLSymbol $dtp_recording_cache_strategy_facade$;
  private static final SubLSymbol $sym0$CACHE_STRATEGY_P;
  private static final SubLSymbol $sym1$KEYWORDP;
  private static final SubLSymbol $kw2$UNSUPPORTED;
  private static final SubLSymbol $sym3$FUNCTION_SPEC_P;
  private static final SubLString $str4$Not_implemented_for__A_;
  private static final SubLInteger $int5$256;
  private static final SubLSymbol $sym6$CACHE_METRICS;
  private static final SubLSymbol $sym7$CACHE_METRICS_P;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$PRINT_CACHE_METRICS;
  private static final SubLSymbol $sym13$CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$CACHEMTR_HIT_COUNT;
  private static final SubLSymbol $sym16$_CSETF_CACHEMTR_HIT_COUNT;
  private static final SubLSymbol $sym17$CACHEMTR_MISS_COUNT;
  private static final SubLSymbol $sym18$_CSETF_CACHEMTR_MISS_COUNT;
  private static final SubLSymbol $kw19$HIT_COUNT;
  private static final SubLSymbol $kw20$MISS_COUNT;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_CACHE_METRICS;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_CACHE_METRICS_METHOD;
  private static final SubLString $str27$Hits__;
  private static final SubLString $str28$_Misses__;
  private static final SubLSymbol $sym29$NON_NEGATIVE_INTEGER_P;
  private static final SubLInteger $int30$129;
  private static final SubLSymbol $sym31$CFASL_INPUT_CACHE_METRICS;
  private static final SubLSymbol $sym32$CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD;
  private static final SubLSymbol $sym33$METERED_CACHE;
  private static final SubLSymbol $sym34$METERED_CACHE_P;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$PRINT_METERED_CACHE;
  private static final SubLSymbol $sym40$METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$MCACHE_CACHE;
  private static final SubLSymbol $sym43$_CSETF_MCACHE_CACHE;
  private static final SubLSymbol $sym44$MCACHE_METRICS;
  private static final SubLSymbol $sym45$_CSETF_MCACHE_METRICS;
  private static final SubLSymbol $kw46$CACHE;
  private static final SubLSymbol $kw47$METRICS;
  private static final SubLSymbol $sym48$MAKE_METERED_CACHE;
  private static final SubLSymbol $sym49$VISIT_DEFSTRUCT_OBJECT_METERED_CACHE_METHOD;
  private static final SubLString $str50$Cache__;
  private static final SubLString $str51$_;
  private static final SubLString $str52$_no_metrics_;
  private static final SubLSymbol $sym53$CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym54$CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym55$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym56$CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym57$CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD;
  private static final SubLSymbol $sym59$CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym60$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym61$CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym62$CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym63$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH;
  private static final SubLSymbol $sym65$CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym66$CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym67$CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym68$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym69$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_;
  private static final SubLSymbol $sym71$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym72$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD;
  private static final SubLSymbol $sym73$RECORDING_CACHE_STRATEGY_FACADE;
  private static final SubLSymbol $sym74$RECORDING_CACHE_STRATEGY_FACADE_P;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$PRINT_RECORDING_CACHE_STRATEGY_FACADE;
  private static final SubLSymbol $sym80$RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$REC_CACHSTRAT_FACADE_CACHE_STRATEGY;
  private static final SubLSymbol $sym83$_CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY;
  private static final SubLSymbol $sym84$REC_CACHSTRAT_FACADE_RECORDS;
  private static final SubLSymbol $sym85$_CSETF_REC_CACHSTRAT_FACADE_RECORDS;
  private static final SubLSymbol $sym86$REC_CACHSTRAT_FACADE_TIMESTAMPER;
  private static final SubLSymbol $sym87$_CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER;
  private static final SubLSymbol $kw88$CACHE_STRATEGY;
  private static final SubLSymbol $kw89$RECORDS;
  private static final SubLSymbol $kw90$TIMESTAMPER;
  private static final SubLSymbol $sym91$MAKE_RECORDING_CACHE_STRATEGY_FACADE;
  private static final SubLSymbol $sym92$VISIT_DEFSTRUCT_OBJECT_RECORDING_CACHE_STRATEGY_FACADE_METHOD;
  private static final SubLSymbol $sym93$INTEGER_SEQUENCE_GENERATOR_P;
  private static final SubLString $str94$_wrapped__;
  private static final SubLSymbol $sym95$CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD;
  private static final SubLSymbol $sym96$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO;
  private static final SubLSymbol $sym97$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC;
  private static final SubLSymbol $sym98$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_;
  private static final SubLSymbol $sym99$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO;
  private static final SubLSymbol $sym100$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME;
  private static final SubLSymbol $sym101$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET;
  private static final SubLSymbol $sym102$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE;
  private static final SubLSymbol $sym103$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA;
  private static final SubLSymbol $sym104$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA;
  private static final SubLSymbol $sym105$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC;
  private static final SubLSymbol $sym106$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST;
  private static final SubLSymbol $sym107$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE;
  private static final SubLSymbol $sym108$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA;
  private static final SubLSymbol $sym109$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC;
  private static final SubLSymbol $sym110$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG;
  private static final SubLSymbol $sym111$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA;
  private static final SubLSymbol $sym112$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH;
  private static final SubLSymbol $sym113$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG;
  private static final SubLSymbol $sym114$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE;
  private static final SubLSymbol $kw115$NOTE_REF;
  private static final SubLSymbol $kw116$TRACK;
  private static final SubLSymbol $kw117$UNTRACK;
  private static final SubLSymbol $sym118$TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE;
  private static final SubLSymbol $kw119$TEST;
  private static final SubLSymbol $kw120$OWNER;
  private static final SubLSymbol $kw121$CLASSES;
  private static final SubLSymbol $kw122$KB;
  private static final SubLSymbol $kw123$TINY;
  private static final SubLSymbol $kw124$WORKING_;
  private static final SubLList $list125;
  private static final SubLString $str126$Cannot_properly_validate_dirty_ca;
  private static final SubLString $str127$Strategy__A_is_tracking_item__A_b;
  private static final SubLString $str128$Strategy__A_is_suggesting_to_remo;
  private static final SubLString $str129$Strategy__A_is_not_tracking_item_;
  private static final SubLString $str130$After_adding__A_items_to_an_empty;
  private static final SubLString $str131$The_strategy__A_does_not_implemen;
  private static final SubLString $str132$Strategy__A_is_tracking_item__A_t;
  private static final SubLString $str133$After_removing__A_items_from_a_fu;
  private static final SubLString $str134$The_strategy__A_is_not_implementi;
  private static final SubLSymbol $kw135$SUCCESS;
  private static final SubLString $str136$The_two_strategies_disagree_on_th;
  private static final SubLSymbol $sym137$CACHE_P;
  private static final SubLSymbol $kw138$NEWEST;

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 3203L)
  public static SubLObject cache_strategy_p(final SubLObject v_object)
  {
    return cache_strategy_object_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 3428L)
  public static SubLObject cache_strategy_or_symbol_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() || NIL != cache_strategy_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 3717L)
  public static SubLObject cache_strategy_reset(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    cache_strategy_object_reset( strategy );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 4015L)
  public static SubLObject cache_strategy_cache_capacity(final SubLObject strategy)
  {
    return cache_strategy_object_cache_capacity( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 4256L)
  public static SubLObject cache_strategy_cache_size(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return cache_strategy_object_cache_size( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 4524L)
  public static SubLObject cache_strategy_cache_load(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return Numbers.divide( cache_strategy_cache_size( strategy ), cache_strategy_cache_capacity( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 4858L)
  public static SubLObject cache_strategy_cache_full_p(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return Numbers.numE( cache_strategy_cache_size( strategy ), cache_strategy_cache_capacity( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 5261L)
  public static SubLObject cache_strategy_cache_empty_p(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return Numbers.zerop( cache_strategy_cache_size( strategy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 5559L)
  public static SubLObject cache_strategy_track(final SubLObject strategy, final SubLObject v_object)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return cache_strategy_object_track( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 6019L)
  public static SubLObject cache_strategy_trackedP(final SubLObject strategy, final SubLObject v_object)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return cache_strategy_object_trackedP( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 6327L)
  public static SubLObject cache_strategy_untrack(final SubLObject strategy, final SubLObject v_object)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    cache_strategy_object_untrack( strategy, v_object );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 6641L)
  public static SubLObject cache_strategy_note_cache_hit(final SubLObject strategy)
  {
    if( NIL != cache_strategy_keeps_metrics_p( strategy ) )
    {
      cache_metrics_note_hit( cache_strategy_get_metrics( strategy ) );
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 6951L)
  public static SubLObject cache_strategy_note_cache_hits(final SubLObject strategy, final SubLObject several)
  {
    if( NIL != cache_strategy_keeps_metrics_p( strategy ) )
    {
      final SubLObject metrics = cache_strategy_get_metrics( strategy );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( several ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        cache_metrics_note_hit( metrics );
      }
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 7333L)
  public static SubLObject cache_strategy_note_cache_miss(final SubLObject strategy)
  {
    if( NIL != cache_strategy_keeps_metrics_p( strategy ) )
    {
      cache_metrics_note_miss( cache_strategy_get_metrics( strategy ) );
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 7645L)
  public static SubLObject cache_strategy_supports_parameter_p(final SubLObject strategy, final SubLObject parameter)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    assert NIL != Types.keywordp( parameter ) : parameter;
    return cache_strategy_object_supports_parameter_p( strategy, parameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 7996L)
  public static SubLObject cache_strategy_get_parameter(final SubLObject strategy, final SubLObject parameter, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != cache_strategy_p( strategy ) : strategy;
    assert NIL != Types.keywordp( parameter ) : parameter;
    if( NIL != cache_strategy_supports_parameter_p( strategy, parameter ) )
    {
      return cache_strategy_object_get_parameter( strategy, parameter, v_default );
    }
    return $kw2$UNSUPPORTED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 8496L)
  public static SubLObject cache_strategy_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject value)
  {
    final SubLObject old_value = cache_strategy_get_parameter( strategy, parameter, UNPROVIDED );
    if( old_value != $kw2$UNSUPPORTED )
    {
      cache_strategy_object_set_parameter( strategy, parameter, value );
    }
    return old_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 9074L)
  public static SubLObject cache_strategy_note_reference(final SubLObject strategy, final SubLObject v_object)
  {
    if( NIL != cache_strategy_trackedP( strategy, v_object ) )
    {
      cache_strategy_object_note_reference( strategy, v_object );
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 9507L)
  public static SubLObject cache_strategy_note_references_in_order(final SubLObject strategy, final SubLObject objects)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    cache_strategy_object_note_references_in_order( strategy, objects );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 10156L)
  public static SubLObject cache_strategy_get_metrics(final SubLObject strategy)
  {
    if( NIL != cache_strategy_keeps_metrics_p( strategy ) )
    {
      return cache_strategy_object_get_metrics( strategy );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 10445L)
  public static SubLObject cache_strategy_reset_metrics(final SubLObject strategy)
  {
    if( NIL != cache_strategy_keeps_metrics_p( strategy ) )
    {
      cache_strategy_object_reset_metrics( strategy );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 10824L)
  public static SubLObject cache_strategy_gather_metrics(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    final SubLObject metrics = new_cache_metrics();
    return cache_strategy_object_gather_metrics( strategy, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 11124L)
  public static SubLObject cache_strategy_dont_gather_metrics(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return cache_strategy_object_dont_gather_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 11421L)
  public static SubLObject cache_strategy_keeps_metrics_p(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return cache_strategy_object_keeps_metrics_p( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 11674L)
  public static SubLObject new_cache_strategy_tracked_content_iterator(final SubLObject strategy)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    return new_cache_strategy_object_tracked_content_iterator( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 12142L)
  public static SubLObject map_cache_strategy_tracked_content(final SubLObject strategy, final SubLObject functor)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    assert NIL != Types.function_spec_p( functor ) : functor;
    map_cache_strategy_object_tracked_content( strategy, functor );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 12757L)
  public static SubLObject cache_strategy_untrack_all(final SubLObject strategy, final SubLObject functor)
  {
    assert NIL != cache_strategy_p( strategy ) : strategy;
    assert NIL != Types.function_spec_p( functor ) : functor;
    cache_strategy_object_untrack_all( strategy, functor );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13304L)
  public static SubLObject cache_strategy_method_not_implemented_for(final SubLObject v_object)
  {
    return Errors.error( $str4$Not_implemented_for__A_, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13591L)
  public static SubLObject cache_strategy_object_p(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $cache_strategy_object_p_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13724L)
  public static SubLObject cache_strategy_object_reset(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_reset_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 13893L)
  public static SubLObject cache_strategy_object_cache_capacity(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_cache_capacity_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14080L)
  public static SubLObject cache_strategy_object_cache_size(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_cache_size_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14259L)
  public static SubLObject cache_strategy_object_track(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_track_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, v_object );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14457L)
  public static SubLObject cache_strategy_object_trackedP(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_trackedP_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, v_object );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14668L)
  public static SubLObject cache_strategy_object_untrack(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_untrack_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, v_object );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 14871L)
  public static SubLObject cache_strategy_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, parameter );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15058L)
  public static SubLObject cache_strategy_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_get_parameter_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, parameter, v_default );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15298L)
  public static SubLObject cache_strategy_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_set_parameter_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, parameter, v_default );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15538L)
  public static SubLObject cache_strategy_object_note_reference(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_note_reference_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, v_object );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15747L)
  public static SubLObject cache_strategy_object_note_references_in_order(final SubLObject strategy, final SubLObject objects)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_note_references_in_order_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, objects );
    }
    return default_cache_strategy_object_note_references_in_order( strategy, objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 15953L)
  public static SubLObject default_cache_strategy_object_note_references_in_order(final SubLObject strategy, final SubLObject objects)
  {
    SubLObject cdolist_list_var = objects;
    SubLObject v_object = NIL;
    v_object = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cache_strategy_trackedP( strategy, v_object ) )
      {
        cache_strategy_note_reference( strategy, v_object );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_object = cdolist_list_var.first();
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16367L)
  public static SubLObject cache_strategy_object_get_metrics(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_get_metrics_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16546L)
  public static SubLObject cache_strategy_object_reset_metrics(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_reset_metrics_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16729L)
  public static SubLObject cache_strategy_object_gather_metrics(final SubLObject strategy, final SubLObject metrics)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_gather_metrics_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, metrics );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 16938L)
  public static SubLObject cache_strategy_object_dont_gather_metrics(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17133L)
  public static SubLObject cache_strategy_object_keeps_metrics_p(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17341L)
  public static SubLObject new_cache_strategy_object_tracked_content_iterator(final SubLObject strategy)
  {
    final SubLObject method_function = Structures.method_func( strategy, $new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy );
    }
    return cache_strategy_method_not_implemented_for( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17544L)
  public static SubLObject map_cache_strategy_object_tracked_content(final SubLObject strategy, final SubLObject functor)
  {
    final SubLObject method_function = Structures.method_func( strategy, $map_cache_strategy_object_tracked_content_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, functor );
    }
    default_map_cache_strategy_object_tracked_content( strategy, functor );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 17742L)
  public static SubLObject default_map_cache_strategy_object_tracked_content(final SubLObject strategy, final SubLObject functor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = new_cache_strategy_tracked_content_iterator( strategy );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_object = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        Functions.funcall( functor, v_object );
      }
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 18109L)
  public static SubLObject cache_strategy_object_untrack_all(final SubLObject strategy, final SubLObject functor)
  {
    final SubLObject method_function = Structures.method_func( strategy, $cache_strategy_object_untrack_all_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, strategy, functor );
    }
    default_cache_strategy_object_untrack_all( strategy, functor );
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 18291L)
  public static SubLObject default_cache_strategy_object_untrack_all(final SubLObject strategy, final SubLObject functor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = new_cache_strategy_tracked_content_iterator( strategy );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_object = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        cache_strategy_untrack( strategy, v_object );
        Functions.funcall( functor, v_object );
      }
    }
    return strategy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject cache_metrics_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_cache_metrics( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject cache_metrics_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cache_metrics_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject cachemtr_hit_count(final SubLObject v_object)
  {
    assert NIL != cache_metrics_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject cachemtr_miss_count(final SubLObject v_object)
  {
    assert NIL != cache_metrics_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject _csetf_cachemtr_hit_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_metrics_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject _csetf_cachemtr_miss_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_metrics_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject make_cache_metrics(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cache_metrics_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$HIT_COUNT ) )
      {
        _csetf_cachemtr_hit_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$MISS_COUNT ) )
      {
        _csetf_cachemtr_miss_count( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject visit_defstruct_cache_metrics(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_CACHE_METRICS, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$HIT_COUNT, cachemtr_hit_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$MISS_COUNT, cachemtr_miss_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_CACHE_METRICS, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19111L)
  public static SubLObject visit_defstruct_object_cache_metrics_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cache_metrics( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19303L)
  public static SubLObject print_cache_metrics(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      streams_high.write_string( $str27$Hits__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( cachemtr_hit_count( v_object ), stream );
      streams_high.write_string( $str28$_Misses__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( cachemtr_miss_count( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19633L)
  public static SubLObject new_cache_metrics()
  {
    final SubLObject metrics = make_cache_metrics( UNPROVIDED );
    reset_cache_metrics_counts( metrics, UNPROVIDED, UNPROVIDED );
    return metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 19827L)
  public static SubLObject reset_cache_metrics_counts(final SubLObject metrics, SubLObject hits, SubLObject misses)
  {
    if( hits == UNPROVIDED )
    {
      hits = ZERO_INTEGER;
    }
    if( misses == UNPROVIDED )
    {
      misses = ZERO_INTEGER;
    }
    _csetf_cachemtr_hit_count( metrics, hits );
    _csetf_cachemtr_miss_count( metrics, misses );
    return metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 20065L)
  public static SubLObject new_cache_metrics_with_counts(final SubLObject hits, final SubLObject misses)
  {
    enforceType( hits, $sym29$NON_NEGATIVE_INTEGER_P );
    enforceType( misses, $sym29$NON_NEGATIVE_INTEGER_P );
    return reset_cache_metrics_counts( new_cache_metrics(), hits, misses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 20358L)
  public static SubLObject cache_metrics_reset(final SubLObject metrics)
  {
    reset_cache_metrics_counts( metrics, UNPROVIDED, UNPROVIDED );
    return metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 20512L)
  public static SubLObject cache_metrics_note_hit(final SubLObject metrics)
  {
    assert NIL != cache_metrics_p( metrics ) : metrics;
    _csetf_cachemtr_hit_count( metrics, Numbers.add( cachemtr_hit_count( metrics ), ONE_INTEGER ) );
    return metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 20758L)
  public static SubLObject cache_metrics_note_miss(final SubLObject metrics)
  {
    assert NIL != cache_metrics_p( metrics ) : metrics;
    _csetf_cachemtr_miss_count( metrics, Numbers.add( cachemtr_miss_count( metrics ), ONE_INTEGER ) );
    return metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 21006L)
  public static SubLObject cache_metrics_hit_count(final SubLObject metrics)
  {
    return cachemtr_hit_count( metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 21184L)
  public static SubLObject cache_metrics_miss_count(final SubLObject metrics)
  {
    return cachemtr_miss_count( metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 21365L)
  public static SubLObject cache_metrics_hit_rate(final SubLObject metrics)
  {
    final SubLObject hits = cache_metrics_hit_count( metrics );
    final SubLObject total = cache_metrics_cache_uses( metrics );
    return Numbers.divide( hits, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 21651L)
  public static SubLObject cache_metrics_miss_rate(final SubLObject metrics)
  {
    final SubLObject misses = cache_metrics_miss_count( metrics );
    final SubLObject total = cache_metrics_cache_uses( metrics );
    return Numbers.divide( misses, total );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 21946L)
  public static SubLObject cache_metrics_cache_uses(final SubLObject metrics)
  {
    return Numbers.add( cachemtr_hit_count( metrics ), cachemtr_miss_count( metrics ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 22145L)
  public static SubLObject gather_cache_strategy_information(final SubLObject cache_strategy)
  {
    assert NIL != cache_strategy_p( cache_strategy ) : cache_strategy;
    final SubLObject cache_capacity = cache_strategy_cache_capacity( cache_strategy );
    final SubLObject metrics = cache_strategy_get_metrics( cache_strategy );
    SubLObject hits = NIL;
    SubLObject misses = NIL;
    SubLObject cache_too_small_p = NIL;
    if( NIL != cache_metrics_p( metrics ) )
    {
      hits = cache_metrics_hit_count( metrics );
      misses = cache_metrics_miss_count( metrics );
      cache_too_small_p = Numbers.numG( misses, hits );
    }
    return Values.values( cache_capacity, hits, misses, cache_too_small_p );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 23331L)
  public static SubLObject cfasl_output_object_cache_metrics_method(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_wide_output_cache_metrics( v_object, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 23466L)
  public static SubLObject cfasl_wide_output_cache_metrics(final SubLObject cache_metrics, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_cache_metrics$.getGlobalValue(), stream );
    cfasl_output_cache_metrics_internal( cache_metrics, stream );
    return cache_metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 23692L)
  public static SubLObject cfasl_output_cache_metrics_internal(final SubLObject cache_metrics, final SubLObject stream)
  {
    cfasl.cfasl_output( cache_metrics_hit_count( cache_metrics ), stream );
    cfasl.cfasl_output( cache_metrics_miss_count( cache_metrics ), stream );
    return cache_metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 23920L)
  public static SubLObject cfasl_input_cache_metrics(final SubLObject stream)
  {
    final SubLObject hits = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject misses = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return new_cache_metrics_with_counts( hits, misses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject metered_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_metered_cache( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject metered_cache_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $metered_cache_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject mcache_cache(final SubLObject v_object)
  {
    assert NIL != metered_cache_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject mcache_metrics(final SubLObject v_object)
  {
    assert NIL != metered_cache_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject _csetf_mcache_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != metered_cache_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject _csetf_mcache_metrics(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != metered_cache_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject make_metered_cache(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $metered_cache_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw46$CACHE ) )
      {
        _csetf_mcache_cache( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$METRICS ) )
      {
        _csetf_mcache_metrics( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject visit_defstruct_metered_cache(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym48$MAKE_METERED_CACHE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw46$CACHE, mcache_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw47$METRICS, mcache_metrics( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym48$MAKE_METERED_CACHE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24274L)
  public static SubLObject visit_defstruct_object_metered_cache_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_metered_cache( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24470L)
  public static SubLObject new_metered_cache(final SubLObject v_cache)
  {
    final SubLObject mcache = make_metered_cache( UNPROVIDED );
    _csetf_mcache_cache( mcache, v_cache );
    return mcache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 24721L)
  public static SubLObject new_metered_preallocated_cache(final SubLObject capacity, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return new_metered_cache( cache.new_preallocated_cache( capacity, test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 25006L)
  public static SubLObject print_metered_cache(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      streams_high.write_string( $str50$Cache__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( mcache_cache( v_object ), stream );
      streams_high.write_string( $str51$_, stream, UNPROVIDED, UNPROVIDED );
      final SubLObject metrics = mcache_metrics( v_object );
      if( NIL != cache_metrics_p( metrics ) )
      {
        print_high.princ( metrics, stream );
      }
      else
      {
        streams_high.write_string( $str52$_no_metrics_, stream, UNPROVIDED, UNPROVIDED );
      }
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 25437L)
  public static SubLObject cache_strategy_object_p_metered_cache_method(final SubLObject v_object)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 25571L)
  public static SubLObject cache_strategy_object_reset_metered_cache_method(final SubLObject v_object)
  {
    return cache_strategy_mcache_object_reset( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 25693L)
  public static SubLObject cache_strategy_object_cache_capacity_metered_cache_method(final SubLObject strategy)
  {
    return cache_strategy_mcache_object_cache_capacity( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 25837L)
  public static SubLObject cache_strategy_object_cache_size_metered_cache_method(final SubLObject strategy)
  {
    return cache_strategy_mcache_object_cache_size( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 25973L)
  public static SubLObject cache_strategy_object_track_metered_cache_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_mcache_object_track( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 26113L)
  public static SubLObject cache_strategy_object_trackedP_metered_cache_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_mcache_object_trackedP( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 26259L)
  public static SubLObject cache_strategy_object_untrack_metered_cache_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_mcache_object_untrack( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 26403L)
  public static SubLObject cache_strategy_object_supports_parameter_p_metered_cache_method(final SubLObject strategy, final SubLObject parameter)
  {
    return cache_strategy_mcache_object_supports_parameter_p( strategy, parameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 26579L)
  public static SubLObject cache_strategy_object_get_parameter_metered_cache_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    return cache_strategy_mcache_object_get_parameter( strategy, parameter, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 26757L)
  public static SubLObject cache_strategy_object_set_parameter_metered_cache_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    return cache_strategy_mcache_object_set_parameter( strategy, parameter, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 26935L)
  public static SubLObject cache_strategy_object_note_reference_metered_cache_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_mcache_object_note_reference( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 27093L)
  public static SubLObject cache_strategy_object_note_references_in_order_metered_cache_method(final SubLObject strategy, final SubLObject objects)
  {
    return cache_strategy_mcache_object_note_references_in_order( strategy, objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 27273L)
  public static SubLObject cache_strategy_object_get_metrics_metered_cache_method(final SubLObject strategy)
  {
    return cache_strategy_mcache_object_get_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 27411L)
  public static SubLObject cache_strategy_object_reset_metrics_metered_cache_method(final SubLObject strategy)
  {
    return cache_strategy_mcache_object_reset_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 27553L)
  public static SubLObject cache_strategy_object_gather_metrics_metered_cache_method(final SubLObject strategy, final SubLObject metrics)
  {
    return cache_strategy_mcache_object_gather_metrics( strategy, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 27713L)
  public static SubLObject cache_strategy_object_dont_gather_metrics_metered_cache_method(final SubLObject strategy)
  {
    return cache_strategy_mcache_object_dont_gather_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 27867L)
  public static SubLObject cache_strategy_object_keeps_metrics_p_metered_cache_method(final SubLObject strategy)
  {
    return cache_strategy_mcache_object_keeps_metrics_p( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28013L)
  public static SubLObject new_cache_strategy_object_tracked_content_iterator_metered_cache_method(final SubLObject strategy)
  {
    return new_cache_strategy_mcache_object_tracked_content_iterator( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28186L)
  public static SubLObject map_cache_strategy_object_tracked_content_metered_cache_method(final SubLObject strategy, final SubLObject functor)
  {
    return map_cache_strategy_mcache_object_tracked_content( strategy, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28357L)
  public static SubLObject cache_strategy_object_untrack_all_metered_cache_method(final SubLObject strategy, final SubLObject functor)
  {
    return cache_strategy_mcache_object_untrack_all( strategy, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28512L)
  public static SubLObject cache_strategy_mcache_object_reset(final SubLObject mcache)
  {
    cache.cache_clear( mcache_cache( mcache ) );
    return mcache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28629L)
  public static SubLObject cache_strategy_mcache_object_cache_capacity(final SubLObject mcache)
  {
    return cache.cache_capacity( mcache_cache( mcache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28747L)
  public static SubLObject cache_strategy_mcache_object_track(final SubLObject mcache, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject key = cache.cache_set_return_dropped( mcache_cache( mcache ), v_object, v_object );
    final SubLObject value = thread.secondMultipleValue();
    final SubLObject dropped_p = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ( NIL != dropped_p ) ? key : v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 28988L)
  public static SubLObject cache_strategy_mcache_object_cache_size(final SubLObject mcache)
  {
    return cache.cache_size( mcache_cache( mcache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29098L)
  public static SubLObject cache_strategy_mcache_object_trackedP(final SubLObject mcache, final SubLObject v_object)
  {
    return cache.cache_contains_key_p( mcache_cache( mcache ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29230L)
  public static SubLObject cache_strategy_mcache_object_untrack(final SubLObject mcache, final SubLObject v_object)
  {
    return cache.cache_remove( mcache_cache( mcache ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29353L)
  public static SubLObject cache_strategy_mcache_object_supports_parameter_p(final SubLObject mcache, final SubLObject parameter)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29480L)
  public static SubLObject cache_strategy_mcache_object_get_parameter(final SubLObject mcache, final SubLObject parameter, final SubLObject v_default)
  {
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29612L)
  public static SubLObject cache_strategy_mcache_object_set_parameter(final SubLObject mcache, final SubLObject parameter, final SubLObject v_default)
  {
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29744L)
  public static SubLObject cache_strategy_mcache_object_note_reference(final SubLObject mcache, final SubLObject v_object)
  {
    return cache.cache_set_without_values( mcache_cache( mcache ), v_object, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 29893L)
  public static SubLObject cache_strategy_mcache_object_note_references_in_order(final SubLObject mcache, final SubLObject objects)
  {
    return default_cache_strategy_object_note_references_in_order( mcache, objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30062L)
  public static SubLObject cache_strategy_mcache_object_get_metrics(final SubLObject mcache)
  {
    return mcache_metrics( mcache );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30162L)
  public static SubLObject cache_strategy_mcache_object_reset_metrics(final SubLObject mcache)
  {
    return cache_metrics_reset( mcache_metrics( mcache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30286L)
  public static SubLObject cache_strategy_mcache_object_gather_metrics(final SubLObject mcache, final SubLObject metrics)
  {
    _csetf_mcache_metrics( mcache, metrics );
    return mcache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30422L)
  public static SubLObject cache_strategy_mcache_object_dont_gather_metrics(final SubLObject mcache)
  {
    final SubLObject metrics = mcache_metrics( mcache );
    _csetf_mcache_metrics( mcache, NIL );
    return metrics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30601L)
  public static SubLObject cache_strategy_mcache_object_keeps_metrics_p(final SubLObject mcache)
  {
    return cache_metrics_p( mcache_metrics( mcache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30723L)
  public static SubLObject new_cache_strategy_mcache_object_tracked_content_iterator(final SubLObject mcache)
  {
    return cache.new_cache_content_iterator( mcache_cache( mcache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 30979L)
  public static SubLObject map_cache_strategy_mcache_object_tracked_content(final SubLObject mcache, final SubLObject functor)
  {
    return default_map_cache_strategy_object_tracked_content( mcache, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31213L)
  public static SubLObject cache_strategy_mcache_object_untrack_all(final SubLObject mcache, final SubLObject functor)
  {
    return default_cache_strategy_object_untrack_all( mcache, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject recording_cache_strategy_facade_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_recording_cache_strategy_facade( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject recording_cache_strategy_facade_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $recording_cache_strategy_facade_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject rec_cachstrat_facade_cache_strategy(final SubLObject v_object)
  {
    assert NIL != recording_cache_strategy_facade_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject rec_cachstrat_facade_records(final SubLObject v_object)
  {
    assert NIL != recording_cache_strategy_facade_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject rec_cachstrat_facade_timestamper(final SubLObject v_object)
  {
    assert NIL != recording_cache_strategy_facade_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject _csetf_rec_cachstrat_facade_cache_strategy(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != recording_cache_strategy_facade_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject _csetf_rec_cachstrat_facade_records(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != recording_cache_strategy_facade_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject _csetf_rec_cachstrat_facade_timestamper(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != recording_cache_strategy_facade_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject make_recording_cache_strategy_facade(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $recording_cache_strategy_facade_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw88$CACHE_STRATEGY ) )
      {
        _csetf_rec_cachstrat_facade_cache_strategy( v_new, current_value );
      }
      else if( pcase_var.eql( $kw89$RECORDS ) )
      {
        _csetf_rec_cachstrat_facade_records( v_new, current_value );
      }
      else if( pcase_var.eql( $kw90$TIMESTAMPER ) )
      {
        _csetf_rec_cachstrat_facade_timestamper( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject visit_defstruct_recording_cache_strategy_facade(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym91$MAKE_RECORDING_CACHE_STRATEGY_FACADE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw88$CACHE_STRATEGY, rec_cachstrat_facade_cache_strategy( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw89$RECORDS, rec_cachstrat_facade_records( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw90$TIMESTAMPER, rec_cachstrat_facade_timestamper( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym91$MAKE_RECORDING_CACHE_STRATEGY_FACADE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 31891L)
  public static SubLObject visit_defstruct_object_recording_cache_strategy_facade_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_recording_cache_strategy_facade( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 32202L)
  public static SubLObject new_recording_cache_strategy_facade(final SubLObject cache_strategy, final SubLObject time_stamper)
  {
    assert NIL != cache_strategy_p( cache_strategy ) : cache_strategy;
    assert NIL != integer_sequence_generator.integer_sequence_generator_p( time_stamper ) : time_stamper;
    final SubLObject rec_cache = make_recording_cache_strategy_facade( UNPROVIDED );
    _csetf_rec_cachstrat_facade_cache_strategy( rec_cache, cache_strategy );
    _csetf_rec_cachstrat_facade_records( rec_cache, NIL );
    _csetf_rec_cachstrat_facade_timestamper( rec_cache, time_stamper );
    return rec_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 32917L)
  public static SubLObject recording_cache_strategy_facade_get_records(final SubLObject rec_cache)
  {
    assert NIL != cache_strategy_p( rec_cache ) : rec_cache;
    final SubLObject records = rec_cachstrat_facade_records( rec_cache );
    _csetf_rec_cachstrat_facade_records( rec_cache, NIL );
    return Sequences.nreverse( records );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 33303L)
  public static SubLObject recording_cache_strategy_facade_get_facaded_cache_strategy(final SubLObject rec_cache)
  {
    assert NIL != cache_strategy_p( rec_cache ) : rec_cache;
    return rec_cachstrat_facade_cache_strategy( rec_cache );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 33529L)
  public static SubLObject recording_cache_strategy_facade_record_action(final SubLObject rec_cache, final SubLObject action, final SubLObject item)
  {
    final SubLObject isg = rec_cachstrat_facade_timestamper( rec_cache );
    final SubLObject id = integer_sequence_generator.integer_sequence_generator_next( isg );
    _csetf_rec_cachstrat_facade_records( rec_cache, ConsesLow.cons( ConsesLow.list( id, action, item ), rec_cachstrat_facade_records( rec_cache ) ) );
    return rec_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 33867L)
  public static SubLObject print_recording_cache_strategy_facade(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      streams_high.write_string( $str94$_wrapped__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( rec_cachstrat_facade_cache_strategy( v_object ), stream );
      streams_high.write_string( $str51$_, stream, UNPROVIDED, UNPROVIDED );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 34215L)
  public static SubLObject cache_strategy_object_p_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 34367L)
  public static SubLObject cache_strategy_object_reset_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_reset( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 34514L)
  public static SubLObject cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_cache_capacity( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 34679L)
  public static SubLObject cache_strategy_object_cache_size_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_cache_size( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 34836L)
  public static SubLObject cache_strategy_object_track_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_rec_cache_object_track( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 34997L)
  public static SubLObject cache_strategy_object_trackedP_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_rec_cache_object_trackedP( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 35164L)
  public static SubLObject cache_strategy_object_untrack_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_rec_cache_object_untrack( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 35329L)
  public static SubLObject cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter)
  {
    return cache_strategy_rec_cache_object_supports_parameter_p( strategy, parameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 35526L)
  public static SubLObject cache_strategy_object_get_parameter_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    return cache_strategy_rec_cache_object_get_parameter( strategy, parameter, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 35725L)
  public static SubLObject cache_strategy_object_set_parameter_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    return cache_strategy_rec_cache_object_set_parameter( strategy, parameter, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 35924L)
  public static SubLObject cache_strategy_object_note_reference_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object)
  {
    return cache_strategy_rec_cache_object_note_reference( strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 36103L)
  public static SubLObject cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject objects)
  {
    return cache_strategy_rec_cache_object_note_references_in_order( strategy, objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 36304L)
  public static SubLObject cache_strategy_object_get_metrics_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_get_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 36463L)
  public static SubLObject cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_reset_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 36626L)
  public static SubLObject cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject metrics)
  {
    return cache_strategy_rec_cache_object_gather_metrics( strategy, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 36807L)
  public static SubLObject cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_dont_gather_metrics( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 36982L)
  public static SubLObject cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return cache_strategy_rec_cache_object_keeps_metrics_p( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 37149L)
  public static SubLObject new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method(final SubLObject strategy)
  {
    return new_cache_strategy_rec_cache_object_tracked_content_iterator( strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 37343L)
  public static SubLObject map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject functor)
  {
    return map_cache_strategy_rec_cache_object_tracked_content( strategy, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 37535L)
  public static SubLObject cache_strategy_object_untrack_all_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject functor)
  {
    return cache_strategy_rec_cache_object_untrack_all( strategy, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 37711L)
  public static SubLObject cache_strategy_rec_cache_object_cache_capacity(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_cache_capacity( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 37992L)
  public static SubLObject cache_strategy_rec_cache_object_cache_size(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_cache_size( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 38198L)
  public static SubLObject cache_strategy_rec_cache_object_dont_gather_metrics(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_dont_gather_metrics( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 38422L)
  public static SubLObject cache_strategy_rec_cache_object_gather_metrics(final SubLObject strategy, final SubLObject metrics)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_object_gather_metrics( interior_strategy, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 38659L)
  public static SubLObject cache_strategy_rec_cache_object_get_metrics(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_get_metrics( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 38867L)
  public static SubLObject cache_strategy_rec_cache_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_get_parameter( interior_strategy, parameter, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 39115L)
  public static SubLObject cache_strategy_rec_cache_object_keeps_metrics_p(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_keeps_metrics_p( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 39331L)
  public static SubLObject cache_strategy_rec_cache_object_note_reference(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    recording_cache_strategy_facade_record_action( strategy, $kw115$NOTE_REF, v_object );
    return cache_strategy_note_reference( interior_strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 39637L)
  public static SubLObject cache_strategy_rec_cache_object_note_references_in_order(final SubLObject strategy, final SubLObject objects)
  {
    return default_cache_strategy_object_note_references_in_order( strategy, objects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 39813L)
  public static SubLObject cache_strategy_rec_cache_object_reset(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_reset( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 40009L)
  public static SubLObject cache_strategy_rec_cache_object_reset_metrics(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_reset_metrics( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 40221L)
  public static SubLObject cache_strategy_rec_cache_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_set_parameter( interior_strategy, parameter, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 40469L)
  public static SubLObject cache_strategy_rec_cache_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_supports_parameter_p( interior_strategy, parameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 40715L)
  public static SubLObject cache_strategy_rec_cache_object_track(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    recording_cache_strategy_facade_record_action( strategy, $kw116$TRACK, v_object );
    return cache_strategy_track( interior_strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 41000L)
  public static SubLObject cache_strategy_rec_cache_object_trackedP(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return cache_strategy_trackedP( interior_strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 41216L)
  public static SubLObject cache_strategy_rec_cache_object_untrack(final SubLObject strategy, final SubLObject v_object)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    recording_cache_strategy_facade_record_action( strategy, $kw117$UNTRACK, v_object );
    return cache_strategy_untrack( interior_strategy, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 41507L)
  public static SubLObject cache_strategy_rec_cache_object_untrack_all(final SubLObject strategy, final SubLObject functor)
  {
    return default_cache_strategy_object_untrack_all( strategy, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 41657L)
  public static SubLObject map_cache_strategy_rec_cache_object_tracked_content(final SubLObject strategy, final SubLObject functor)
  {
    return default_map_cache_strategy_object_tracked_content( strategy, functor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 41823L)
  public static SubLObject new_cache_strategy_rec_cache_object_tracked_content_iterator(final SubLObject strategy)
  {
    final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy( strategy );
    return new_cache_strategy_tracked_content_iterator( interior_strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 42480L)
  public static SubLObject test_mcache_strategy_implementation_conformance(final SubLObject capacity)
  {
    return test_cache_strategy_implementation_conformance( new_metered_preallocated_cache( capacity, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 42729L)
  public static SubLObject test_cache_strategy_implementation_conformance(final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !cache_strategy_cache_size( strategy ).isZero() )
    {
      Errors.error( $str126$Cannot_properly_validate_dirty_ca, strategy );
    }
    SubLObject capacity;
    SubLObject i;
    for( capacity = cache_strategy_cache_capacity( strategy ), i = NIL, i = ZERO_INTEGER; i.numL( capacity ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != cache_strategy_trackedP( strategy, i ) )
      {
        Errors.error( $str127$Strategy__A_is_tracking_item__A_b, strategy, i );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !i.numE( cache_strategy_track( strategy, i ) ) )
      {
        Errors.error( $str128$Strategy__A_is_suggesting_to_remo, strategy, i );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cache_strategy_trackedP( strategy, i ) )
      {
        Errors.error( $str129$Strategy__A_is_not_tracking_item_, strategy, i );
      }
    }
    SubLObject curr_size = cache_strategy_cache_size( strategy );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !capacity.numE( curr_size ) )
    {
      Errors.error( $str130$After_adding__A_items_to_an_empty, capacity, curr_size );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cache_strategy_cache_full_p( strategy ) )
    {
      Errors.error( $str131$The_strategy__A_does_not_implemen, strategy );
    }
    for( i = NIL, i = ZERO_INTEGER; i.numL( capacity ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cache_strategy_trackedP( strategy, i ) )
      {
        Errors.error( $str129$Strategy__A_is_not_tracking_item_, strategy, i );
      }
      cache_strategy_untrack( strategy, i );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != cache_strategy_trackedP( strategy, i ) )
      {
        Errors.error( $str132$Strategy__A_is_tracking_item__A_t, strategy, i );
      }
    }
    curr_size = cache_strategy_cache_size( strategy );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !curr_size.isZero() )
    {
      Errors.error( $str133$After_removing__A_items_from_a_fu, capacity, curr_size );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == cache_strategy_cache_empty_p( strategy ) )
    {
      Errors.error( $str134$The_strategy__A_is_not_implementi, strategy );
    }
    return $kw135$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 44766L)
  public static SubLObject test_two_cache_strategy_implementations(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject items_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject list_var = NIL;
    SubLObject item = NIL;
    SubLObject counter = NIL;
    list_var = items_list;
    item = list_var.first();
    for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
    {
      final SubLObject result_a = cache_strategy_track( strategy_a, item );
      final SubLObject result_b = cache_strategy_track( strategy_b, item );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !result_a.eql( result_b ) )
      {
        Errors.error( $str136$The_two_strategies_disagree_on_th, new SubLObject[] { counter, item, strategy_a, result_a, strategy_b, result_b
        } );
      }
    }
    return $kw135$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 45419L)
  public static SubLObject faster_cache_strategy_implementation(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject items_list, SubLObject runs)
  {
    if( runs == UNPROVIDED )
    {
      runs = ONE_INTEGER;
    }
    test_two_cache_strategy_implementations( strategy_a, strategy_b, items_list );
    SubLObject total_time_a = ZERO_INTEGER;
    SubLObject total_time_b = ZERO_INTEGER;
    SubLObject run;
    SubLObject curr_time_a;
    SubLObject curr_time_b;
    SubLObject time_var;
    SubLObject cdolist_list_var;
    SubLObject item;
    for( run = NIL, run = ZERO_INTEGER; run.numL( runs ); run = Numbers.add( run, ONE_INTEGER ) )
    {
      curr_time_a = NIL;
      curr_time_b = NIL;
      cache_strategy_reset( strategy_a );
      cache_strategy_reset( strategy_b );
      Storage.gc( UNPROVIDED );
      time_var = Time.get_internal_real_time();
      cdolist_list_var = items_list;
      item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cache_strategy_track( strategy_b, item );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      curr_time_b = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      total_time_b = Numbers.add( total_time_b, curr_time_b );
      Storage.gc( UNPROVIDED );
      time_var = Time.get_internal_real_time();
      cdolist_list_var = items_list;
      item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cache_strategy_track( strategy_a, item );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      curr_time_a = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      total_time_a = Numbers.add( total_time_a, curr_time_a );
    }
    return Values.values( total_time_b.numL( total_time_a ) ? strategy_b : strategy_a, total_time_a, total_time_b );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 47023L)
  public static SubLObject determine_faster_cache_strategy_implementation(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject capacity, final SubLObject factor, SubLObject runs)
  {
    if( runs == UNPROVIDED )
    {
      runs = ONE_INTEGER;
    }
    final SubLObject items_list = random_integers_for_testing_caches( capacity, factor );
    return faster_cache_strategy_implementation( strategy_a, strategy_b, items_list, runs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 47756L)
  public static SubLObject random_integers_for_testing_caches(final SubLObject capacity, final SubLObject factor)
  {
    SubLObject range = capacity;
    SubLObject cursor;
    final SubLObject numbers = cursor = ConsesLow.make_list( Numbers.multiply( capacity, factor ), UNPROVIDED );
    SubLObject i;
    SubLObject j;
    for( i = NIL, i = ZERO_INTEGER; i.numL( factor ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      for( j = NIL, j = ZERO_INTEGER; j.numL( capacity ); j = Numbers.add( j, ONE_INTEGER ) )
      {
        ConsesLow.rplaca( cursor, random.random( range ) );
        cursor = cursor.rest();
      }
      range = Numbers.add( range, capacity );
    }
    return numbers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cache-utilities.lisp", position = 48323L)
  public static SubLObject cache_to_dictionary(final SubLObject v_cache)
  {
    assert NIL != cache.cache_p( v_cache ) : v_cache;
    final SubLObject result = dictionary.new_dictionary( cache.cache_test( v_cache ), cache.cache_size( v_cache ) );
    final SubLObject order_var = $kw138$NEWEST;
    SubLObject entry = cache.do_cache_first( v_cache, order_var );
    SubLObject key = NIL;
    SubLObject value = NIL;
    while ( NIL == cache.do_cache_doneP( v_cache, entry ))
    {
      key = cache.do_cache_key( entry );
      value = cache.do_cache_value( entry );
      entry = cache.do_cache_next( entry, order_var );
      dictionary.dictionary_enter( result, key, value );
    }
    return result;
  }

  public static SubLObject declare_cache_utilities_file()
  {
    SubLFiles.declareFunction( me, "cache_strategy_p", "CACHE-STRATEGY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_or_symbol_p", "CACHE-STRATEGY-OR-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_reset", "CACHE-STRATEGY-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_cache_capacity", "CACHE-STRATEGY-CACHE-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_cache_size", "CACHE-STRATEGY-CACHE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_cache_load", "CACHE-STRATEGY-CACHE-LOAD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_cache_full_p", "CACHE-STRATEGY-CACHE-FULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_cache_empty_p", "CACHE-STRATEGY-CACHE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_track", "CACHE-STRATEGY-TRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_trackedP", "CACHE-STRATEGY-TRACKED?", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_untrack", "CACHE-STRATEGY-UNTRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_note_cache_hit", "CACHE-STRATEGY-NOTE-CACHE-HIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_note_cache_hits", "CACHE-STRATEGY-NOTE-CACHE-HITS", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_note_cache_miss", "CACHE-STRATEGY-NOTE-CACHE-MISS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_supports_parameter_p", "CACHE-STRATEGY-SUPPORTS-PARAMETER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_get_parameter", "CACHE-STRATEGY-GET-PARAMETER", 2, 1, false );
    SubLFiles.declareFunction( me, "cache_strategy_set_parameter", "CACHE-STRATEGY-SET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_note_reference", "CACHE-STRATEGY-NOTE-REFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_note_references_in_order", "CACHE-STRATEGY-NOTE-REFERENCES-IN-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_get_metrics", "CACHE-STRATEGY-GET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_reset_metrics", "CACHE-STRATEGY-RESET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_gather_metrics", "CACHE-STRATEGY-GATHER-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_dont_gather_metrics", "CACHE-STRATEGY-DONT-GATHER-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_keeps_metrics_p", "CACHE-STRATEGY-KEEPS-METRICS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cache_strategy_tracked_content_iterator", "NEW-CACHE-STRATEGY-TRACKED-CONTENT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "map_cache_strategy_tracked_content", "MAP-CACHE-STRATEGY-TRACKED-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_untrack_all", "CACHE-STRATEGY-UNTRACK-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_method_not_implemented_for", "CACHE-STRATEGY-METHOD-NOT-IMPLEMENTED-FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_p", "CACHE-STRATEGY-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_reset", "CACHE-STRATEGY-OBJECT-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_cache_capacity", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_cache_size", "CACHE-STRATEGY-OBJECT-CACHE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_track", "CACHE-STRATEGY-OBJECT-TRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_trackedP", "CACHE-STRATEGY-OBJECT-TRACKED?", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_untrack", "CACHE-STRATEGY-OBJECT-UNTRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_supports_parameter_p", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_get_parameter", "CACHE-STRATEGY-OBJECT-GET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_set_parameter", "CACHE-STRATEGY-OBJECT-SET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_note_reference", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_note_references_in_order", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "default_cache_strategy_object_note_references_in_order", "DEFAULT-CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_get_metrics", "CACHE-STRATEGY-OBJECT-GET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_reset_metrics", "CACHE-STRATEGY-OBJECT-RESET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_gather_metrics", "CACHE-STRATEGY-OBJECT-GATHER-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_dont_gather_metrics", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_keeps_metrics_p", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cache_strategy_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "map_cache_strategy_object_tracked_content", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "default_map_cache_strategy_object_tracked_content", "DEFAULT-MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_untrack_all", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "default_cache_strategy_object_untrack_all", "DEFAULT-CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_print_function_trampoline", "CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_p", "CACHE-METRICS-P", 1, 0, false );
    new $cache_metrics_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cachemtr_hit_count", "CACHEMTR-HIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "cachemtr_miss_count", "CACHEMTR-MISS-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cachemtr_hit_count", "_CSETF-CACHEMTR-HIT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cachemtr_miss_count", "_CSETF-CACHEMTR-MISS-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cache_metrics", "MAKE-CACHE-METRICS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cache_metrics", "VISIT-DEFSTRUCT-CACHE-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cache_metrics_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_cache_metrics", "PRINT-CACHE-METRICS", 3, 0, false );
    SubLFiles.declareFunction( me, "new_cache_metrics", "NEW-CACHE-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_cache_metrics_counts", "RESET-CACHE-METRICS-COUNTS", 1, 2, false );
    SubLFiles.declareFunction( me, "new_cache_metrics_with_counts", "NEW-CACHE-METRICS-WITH-COUNTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_reset", "CACHE-METRICS-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_note_hit", "CACHE-METRICS-NOTE-HIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_note_miss", "CACHE-METRICS-NOTE-MISS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_hit_count", "CACHE-METRICS-HIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_miss_count", "CACHE-METRICS-MISS-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_hit_rate", "CACHE-METRICS-HIT-RATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_miss_rate", "CACHE-METRICS-MISS-RATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_metrics_cache_uses", "CACHE-METRICS-CACHE-USES", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_cache_strategy_information", "GATHER-CACHE-STRATEGY-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_cache_metrics_method", "CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_output_cache_metrics", "CFASL-WIDE-OUTPUT-CACHE-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_cache_metrics_internal", "CFASL-OUTPUT-CACHE-METRICS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_cache_metrics", "CFASL-INPUT-CACHE-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "metered_cache_print_function_trampoline", "METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "metered_cache_p", "METERED-CACHE-P", 1, 0, false );
    new $metered_cache_p$UnaryFunction();
    SubLFiles.declareFunction( me, "mcache_cache", "MCACHE-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "mcache_metrics", "MCACHE-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mcache_cache", "_CSETF-MCACHE-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mcache_metrics", "_CSETF-MCACHE-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_metered_cache", "MAKE-METERED-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_metered_cache", "VISIT-DEFSTRUCT-METERED-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_metered_cache_method", "VISIT-DEFSTRUCT-OBJECT-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_metered_cache", "NEW-METERED-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_metered_preallocated_cache", "NEW-METERED-PREALLOCATED-CACHE", 1, 1, false );
    SubLFiles.declareFunction( me, "print_metered_cache", "PRINT-METERED-CACHE", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_reset_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_cache_capacity_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_cache_size_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_track_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_trackedP_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_untrack_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_supports_parameter_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_get_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_set_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_note_reference_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_note_references_in_order_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_get_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_reset_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_dont_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_keeps_metrics_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cache_strategy_object_tracked_content_iterator_metered_cache_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_cache_strategy_object_tracked_content_metered_cache_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_untrack_all_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_reset", "CACHE-STRATEGY-MCACHE-OBJECT-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_cache_capacity", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_track", "CACHE-STRATEGY-MCACHE-OBJECT-TRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_cache_size", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_trackedP", "CACHE-STRATEGY-MCACHE-OBJECT-TRACKED?", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_untrack", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_supports_parameter_p", "CACHE-STRATEGY-MCACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_get_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-GET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_set_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-SET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_note_reference", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_note_references_in_order", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_get_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_reset_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-RESET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GATHER-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_dont_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_keeps_metrics_p", "CACHE-STRATEGY-MCACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cache_strategy_mcache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "map_cache_strategy_mcache_object_tracked_content", "MAP-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_mcache_object_untrack_all", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "recording_cache_strategy_facade_print_function_trampoline", "RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "recording_cache_strategy_facade_p", "RECORDING-CACHE-STRATEGY-FACADE-P", 1, 0, false );
    new $recording_cache_strategy_facade_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rec_cachstrat_facade_cache_strategy", "REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "rec_cachstrat_facade_records", "REC-CACHSTRAT-FACADE-RECORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "rec_cachstrat_facade_timestamper", "REC-CACHSTRAT-FACADE-TIMESTAMPER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rec_cachstrat_facade_cache_strategy", "_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rec_cachstrat_facade_records", "_CSETF-REC-CACHSTRAT-FACADE-RECORDS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rec_cachstrat_facade_timestamper", "_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_recording_cache_strategy_facade", "MAKE-RECORDING-CACHE-STRATEGY-FACADE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_recording_cache_strategy_facade", "VISIT-DEFSTRUCT-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_recording_cache_strategy_facade_method", "VISIT-DEFSTRUCT-OBJECT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_recording_cache_strategy_facade", "NEW-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false );
    SubLFiles.declareFunction( me, "recording_cache_strategy_facade_get_records", "RECORDING-CACHE-STRATEGY-FACADE-GET-RECORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "recording_cache_strategy_facade_get_facaded_cache_strategy", "RECORDING-CACHE-STRATEGY-FACADE-GET-FACADED-CACHE-STRATEGY", 1, 0, false );
    SubLFiles.declareFunction( me, "recording_cache_strategy_facade_record_action", "RECORDING-CACHE-STRATEGY-FACADE-RECORD-ACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "print_recording_cache_strategy_facade", "PRINT-RECORDING-CACHE-STRATEGY-FACADE", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_reset_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_cache_size_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_track_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_trackedP_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_untrack_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_get_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_set_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_note_reference_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0,
        false );
    SubLFiles.declareFunction( me, "cache_strategy_object_get_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD",
        1, 0, false );
    SubLFiles.declareFunction( me, "map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_object_untrack_all_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_cache_capacity", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_cache_size", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_dont_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GATHER-METRICS", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_get_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_get_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_keeps_metrics_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_note_reference", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_note_references_in_order", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_reset", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_reset_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_set_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-SET-PARAMETER", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_supports_parameter_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_track", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_trackedP", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED?", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_untrack", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_strategy_rec_cache_object_untrack_all", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "map_cache_strategy_rec_cache_object_tracked_content", "MAP-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cache_strategy_rec_cache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "test_mcache_strategy_implementation_conformance", "TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "test_cache_strategy_implementation_conformance", "TEST-CACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "test_two_cache_strategy_implementations", "TEST-TWO-CACHE-STRATEGY-IMPLEMENTATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "faster_cache_strategy_implementation", "FASTER-CACHE-STRATEGY-IMPLEMENTATION", 3, 1, false );
    SubLFiles.declareFunction( me, "determine_faster_cache_strategy_implementation", "DETERMINE-FASTER-CACHE-STRATEGY-IMPLEMENTATION", 4, 1, false );
    SubLFiles.declareFunction( me, "random_integers_for_testing_caches", "RANDOM-INTEGERS-FOR-TESTING-CACHES", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_to_dictionary", "CACHE-TO-DICTIONARY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cache_utilities_file()
  {
    $cache_strategy_object_p_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-P-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_reset_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-RESET-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_cache_capacity_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_cache_size_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-CACHE-SIZE-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_track_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-TRACK-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_trackedP_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-TRACKED?-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_untrack_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-UNTRACK-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_supports_parameter_p_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_get_parameter_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-GET-PARAMETER-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_set_parameter_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-SET-PARAMETER-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_note_reference_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_note_references_in_order_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_get_metrics_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-GET-METRICS-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_reset_metrics_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-RESET-METRICS-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_gather_metrics_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-GATHER-METRICS-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_dont_gather_metrics_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_keeps_metrics_p_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $new_cache_strategy_object_tracked_content_iterator_method_table$ = SubLFiles.deflexical( "*NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $map_cache_strategy_object_tracked_content_method_table$ = SubLFiles.deflexical( "*MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $cache_strategy_object_untrack_all_method_table$ = SubLFiles.deflexical( "*CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METHOD-TABLE*", Vectors.make_vector( $int5$256, NIL ) );
    $dtp_cache_metrics$ = SubLFiles.defconstant( "*DTP-CACHE-METRICS*", $sym6$CACHE_METRICS );
    $cfasl_wide_opcode_cache_metrics$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-CACHE-METRICS*", $int30$129 );
    $dtp_metered_cache$ = SubLFiles.defconstant( "*DTP-METERED-CACHE*", $sym33$METERED_CACHE );
    $dtp_recording_cache_strategy_facade$ = SubLFiles.defconstant( "*DTP-RECORDING-CACHE-STRATEGY-FACADE*", $sym73$RECORDING_CACHE_STRATEGY_FACADE );
    return NIL;
  }

  public static SubLObject setup_cache_utilities_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), Symbols.symbol_function( $sym13$CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list14 );
    Structures.def_csetf( $sym15$CACHEMTR_HIT_COUNT, $sym16$_CSETF_CACHEMTR_HIT_COUNT );
    Structures.def_csetf( $sym17$CACHEMTR_MISS_COUNT, $sym18$_CSETF_CACHEMTR_MISS_COUNT );
    Equality.identity( $sym6$CACHE_METRICS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_CACHE_METRICS_METHOD ) );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_cache_metrics$.getGlobalValue(), $sym31$CFASL_INPUT_CACHE_METRICS );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), Symbols.symbol_function( $sym32$CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function( $sym40$METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list41 );
    Structures.def_csetf( $sym42$MCACHE_CACHE, $sym43$_CSETF_MCACHE_CACHE );
    Structures.def_csetf( $sym44$MCACHE_METRICS, $sym45$_CSETF_MCACHE_METRICS );
    Equality.identity( $sym33$METERED_CACHE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function( $sym49$VISIT_DEFSTRUCT_OBJECT_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function( $sym53$CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function( $sym54$CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym55$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym56$CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function( $sym57$CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym58$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function( $sym59$CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym60$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym61$CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym62$CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym63$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH ) );
    Structures.register_method( $cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym65$CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym66$CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym67$CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym68$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym69$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD ) );
    Structures.register_method( $new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_ ) );
    Structures.register_method( $map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym71$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD ) );
    Structures.register_method( $cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function(
        $sym72$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym80$RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list81 );
    Structures.def_csetf( $sym82$REC_CACHSTRAT_FACADE_CACHE_STRATEGY, $sym83$_CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY );
    Structures.def_csetf( $sym84$REC_CACHSTRAT_FACADE_RECORDS, $sym85$_CSETF_REC_CACHSTRAT_FACADE_RECORDS );
    Structures.def_csetf( $sym86$REC_CACHSTRAT_FACADE_TIMESTAMPER, $sym87$_CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER );
    Equality.identity( $sym73$RECORDING_CACHE_STRATEGY_FACADE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym92$VISIT_DEFSTRUCT_OBJECT_RECORDING_CACHE_STRATEGY_FACADE_METHOD ) );
    Structures.register_method( $cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym95$CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD ) );
    Structures.register_method( $cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym96$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO ) );
    Structures.register_method( $cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym97$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC ) );
    Structures.register_method( $cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym98$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_ ) );
    Structures.register_method( $cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym99$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO ) );
    Structures.register_method( $cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym100$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME ) );
    Structures.register_method( $cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym101$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET ) );
    Structures.register_method( $cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym102$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE ) );
    Structures.register_method( $cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym103$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA ) );
    Structures.register_method( $cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym104$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA ) );
    Structures.register_method( $cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym105$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC ) );
    Structures.register_method( $cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym106$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST ) );
    Structures.register_method( $cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym107$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE ) );
    Structures.register_method( $cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym108$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA ) );
    Structures.register_method( $cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym109$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC ) );
    Structures.register_method( $cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym110$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG ) );
    Structures.register_method( $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym111$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA ) );
    Structures.register_method( $new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym112$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH ) );
    Structures.register_method( $map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym113$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG ) );
    Structures.register_method( $cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function(
        $sym114$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE ) );
    generic_testing.define_test_case_table_int( $sym118$TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE, ConsesLow.list( new SubLObject[] { $kw119$TEST, NIL, $kw120$OWNER, NIL, $kw121$CLASSES, NIL, $kw122$KB,
      $kw123$TINY, $kw124$WORKING_, T
    } ), $list125 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cache_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cache_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cache_utilities_file();
  }
  static
  {
    me = new cache_utilities();
    $cache_strategy_object_p_method_table$ = null;
    $cache_strategy_object_reset_method_table$ = null;
    $cache_strategy_object_cache_capacity_method_table$ = null;
    $cache_strategy_object_cache_size_method_table$ = null;
    $cache_strategy_object_track_method_table$ = null;
    $cache_strategy_object_trackedP_method_table$ = null;
    $cache_strategy_object_untrack_method_table$ = null;
    $cache_strategy_object_supports_parameter_p_method_table$ = null;
    $cache_strategy_object_get_parameter_method_table$ = null;
    $cache_strategy_object_set_parameter_method_table$ = null;
    $cache_strategy_object_note_reference_method_table$ = null;
    $cache_strategy_object_note_references_in_order_method_table$ = null;
    $cache_strategy_object_get_metrics_method_table$ = null;
    $cache_strategy_object_reset_metrics_method_table$ = null;
    $cache_strategy_object_gather_metrics_method_table$ = null;
    $cache_strategy_object_dont_gather_metrics_method_table$ = null;
    $cache_strategy_object_keeps_metrics_p_method_table$ = null;
    $new_cache_strategy_object_tracked_content_iterator_method_table$ = null;
    $map_cache_strategy_object_tracked_content_method_table$ = null;
    $cache_strategy_object_untrack_all_method_table$ = null;
    $dtp_cache_metrics$ = null;
    $cfasl_wide_opcode_cache_metrics$ = null;
    $dtp_metered_cache$ = null;
    $dtp_recording_cache_strategy_facade$ = null;
    $sym0$CACHE_STRATEGY_P = makeSymbol( "CACHE-STRATEGY-P" );
    $sym1$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw2$UNSUPPORTED = makeKeyword( "UNSUPPORTED" );
    $sym3$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $str4$Not_implemented_for__A_ = makeString( "Not implemented for ~A." );
    $int5$256 = makeInteger( 256 );
    $sym6$CACHE_METRICS = makeSymbol( "CACHE-METRICS" );
    $sym7$CACHE_METRICS_P = makeSymbol( "CACHE-METRICS-P" );
    $list8 = ConsesLow.list( makeSymbol( "HIT-COUNT" ), makeSymbol( "MISS-COUNT" ) );
    $list9 = ConsesLow.list( makeKeyword( "HIT-COUNT" ), makeKeyword( "MISS-COUNT" ) );
    $list10 = ConsesLow.list( makeSymbol( "CACHEMTR-HIT-COUNT" ), makeSymbol( "CACHEMTR-MISS-COUNT" ) );
    $list11 = ConsesLow.list( makeSymbol( "_CSETF-CACHEMTR-HIT-COUNT" ), makeSymbol( "_CSETF-CACHEMTR-MISS-COUNT" ) );
    $sym12$PRINT_CACHE_METRICS = makeSymbol( "PRINT-CACHE-METRICS" );
    $sym13$CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE" );
    $list14 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CACHE-METRICS-P" ) );
    $sym15$CACHEMTR_HIT_COUNT = makeSymbol( "CACHEMTR-HIT-COUNT" );
    $sym16$_CSETF_CACHEMTR_HIT_COUNT = makeSymbol( "_CSETF-CACHEMTR-HIT-COUNT" );
    $sym17$CACHEMTR_MISS_COUNT = makeSymbol( "CACHEMTR-MISS-COUNT" );
    $sym18$_CSETF_CACHEMTR_MISS_COUNT = makeSymbol( "_CSETF-CACHEMTR-MISS-COUNT" );
    $kw19$HIT_COUNT = makeKeyword( "HIT-COUNT" );
    $kw20$MISS_COUNT = makeKeyword( "MISS-COUNT" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_CACHE_METRICS = makeSymbol( "MAKE-CACHE-METRICS" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_CACHE_METRICS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CACHE-METRICS-METHOD" );
    $str27$Hits__ = makeString( "Hits: " );
    $str28$_Misses__ = makeString( " Misses: " );
    $sym29$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $int30$129 = makeInteger( 129 );
    $sym31$CFASL_INPUT_CACHE_METRICS = makeSymbol( "CFASL-INPUT-CACHE-METRICS" );
    $sym32$CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD" );
    $sym33$METERED_CACHE = makeSymbol( "METERED-CACHE" );
    $sym34$METERED_CACHE_P = makeSymbol( "METERED-CACHE-P" );
    $list35 = ConsesLow.list( makeSymbol( "CACHE" ), makeSymbol( "METRICS" ) );
    $list36 = ConsesLow.list( makeKeyword( "CACHE" ), makeKeyword( "METRICS" ) );
    $list37 = ConsesLow.list( makeSymbol( "MCACHE-CACHE" ), makeSymbol( "MCACHE-METRICS" ) );
    $list38 = ConsesLow.list( makeSymbol( "_CSETF-MCACHE-CACHE" ), makeSymbol( "_CSETF-MCACHE-METRICS" ) );
    $sym39$PRINT_METERED_CACHE = makeSymbol( "PRINT-METERED-CACHE" );
    $sym40$METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE" );
    $list41 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "METERED-CACHE-P" ) );
    $sym42$MCACHE_CACHE = makeSymbol( "MCACHE-CACHE" );
    $sym43$_CSETF_MCACHE_CACHE = makeSymbol( "_CSETF-MCACHE-CACHE" );
    $sym44$MCACHE_METRICS = makeSymbol( "MCACHE-METRICS" );
    $sym45$_CSETF_MCACHE_METRICS = makeSymbol( "_CSETF-MCACHE-METRICS" );
    $kw46$CACHE = makeKeyword( "CACHE" );
    $kw47$METRICS = makeKeyword( "METRICS" );
    $sym48$MAKE_METERED_CACHE = makeSymbol( "MAKE-METERED-CACHE" );
    $sym49$VISIT_DEFSTRUCT_OBJECT_METERED_CACHE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-METERED-CACHE-METHOD" );
    $str50$Cache__ = makeString( "Cache: " );
    $str51$_ = makeString( " " );
    $str52$_no_metrics_ = makeString( "(no metrics)" );
    $sym53$CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD" );
    $sym54$CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD" );
    $sym55$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD" );
    $sym56$CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD" );
    $sym57$CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD" );
    $sym58$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD" );
    $sym59$CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD" );
    $sym60$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD" );
    $sym61$CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD" );
    $sym62$CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD" );
    $sym63$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD" );
    $sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH = makeSymbol( "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD" );
    $sym65$CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD" );
    $sym66$CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD" );
    $sym67$CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD" );
    $sym68$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD" );
    $sym69$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD" );
    $sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_ = makeSymbol( "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD" );
    $sym71$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD = makeSymbol( "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD" );
    $sym72$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD" );
    $sym73$RECORDING_CACHE_STRATEGY_FACADE = makeSymbol( "RECORDING-CACHE-STRATEGY-FACADE" );
    $sym74$RECORDING_CACHE_STRATEGY_FACADE_P = makeSymbol( "RECORDING-CACHE-STRATEGY-FACADE-P" );
    $list75 = ConsesLow.list( makeSymbol( "CACHE-STRATEGY" ), makeSymbol( "RECORDS" ), makeSymbol( "TIMESTAMPER" ) );
    $list76 = ConsesLow.list( makeKeyword( "CACHE-STRATEGY" ), makeKeyword( "RECORDS" ), makeKeyword( "TIMESTAMPER" ) );
    $list77 = ConsesLow.list( makeSymbol( "REC-CACHSTRAT-FACADE-CACHE-STRATEGY" ), makeSymbol( "REC-CACHSTRAT-FACADE-RECORDS" ), makeSymbol( "REC-CACHSTRAT-FACADE-TIMESTAMPER" ) );
    $list78 = ConsesLow.list( makeSymbol( "_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY" ), makeSymbol( "_CSETF-REC-CACHSTRAT-FACADE-RECORDS" ), makeSymbol( "_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER" ) );
    $sym79$PRINT_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol( "PRINT-RECORDING-CACHE-STRATEGY-FACADE" );
    $sym80$RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE" );
    $list81 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RECORDING-CACHE-STRATEGY-FACADE-P" ) );
    $sym82$REC_CACHSTRAT_FACADE_CACHE_STRATEGY = makeSymbol( "REC-CACHSTRAT-FACADE-CACHE-STRATEGY" );
    $sym83$_CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY = makeSymbol( "_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY" );
    $sym84$REC_CACHSTRAT_FACADE_RECORDS = makeSymbol( "REC-CACHSTRAT-FACADE-RECORDS" );
    $sym85$_CSETF_REC_CACHSTRAT_FACADE_RECORDS = makeSymbol( "_CSETF-REC-CACHSTRAT-FACADE-RECORDS" );
    $sym86$REC_CACHSTRAT_FACADE_TIMESTAMPER = makeSymbol( "REC-CACHSTRAT-FACADE-TIMESTAMPER" );
    $sym87$_CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER = makeSymbol( "_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER" );
    $kw88$CACHE_STRATEGY = makeKeyword( "CACHE-STRATEGY" );
    $kw89$RECORDS = makeKeyword( "RECORDS" );
    $kw90$TIMESTAMPER = makeKeyword( "TIMESTAMPER" );
    $sym91$MAKE_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol( "MAKE-RECORDING-CACHE-STRATEGY-FACADE" );
    $sym92$VISIT_DEFSTRUCT_OBJECT_RECORDING_CACHE_STRATEGY_FACADE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym93$INTEGER_SEQUENCE_GENERATOR_P = makeSymbol( "INTEGER-SEQUENCE-GENERATOR-P" );
    $str94$_wrapped__ = makeString( " wrapped: " );
    $sym95$CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD = makeSymbol( "CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym96$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol( "CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym97$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC = makeSymbol( "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym98$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_ = makeSymbol( "CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym99$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol( "CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym100$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME = makeSymbol( "CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym101$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET = makeSymbol( "CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym102$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE = makeSymbol( "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym103$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol( "CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym104$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol( "CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym105$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC = makeSymbol( "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym106$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST = makeSymbol( "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym107$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol( "CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym108$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA = makeSymbol( "CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym109$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC = makeSymbol( "CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym110$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG = makeSymbol( "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym111$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA = makeSymbol( "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym112$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH = makeSymbol( "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym113$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG = makeSymbol( "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $sym114$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol( "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD" );
    $kw115$NOTE_REF = makeKeyword( "NOTE-REF" );
    $kw116$TRACK = makeKeyword( "TRACK" );
    $kw117$UNTRACK = makeKeyword( "UNTRACK" );
    $sym118$TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE = makeSymbol( "TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE" );
    $kw119$TEST = makeKeyword( "TEST" );
    $kw120$OWNER = makeKeyword( "OWNER" );
    $kw121$CLASSES = makeKeyword( "CLASSES" );
    $kw122$KB = makeKeyword( "KB" );
    $kw123$TINY = makeKeyword( "TINY" );
    $kw124$WORKING_ = makeKeyword( "WORKING?" );
    $list125 = ConsesLow.list( ConsesLow.list( ConsesLow.list( TEN_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list( TWENTY_INTEGER ), makeKeyword( "SUCCESS" ) ), ConsesLow.list( ConsesLow.list(
        makeInteger( 50 ) ), makeKeyword( "SUCCESS" ) ) );
    $str126$Cannot_properly_validate_dirty_ca = makeString( "Cannot properly validate dirty cache strategy ~A." );
    $str127$Strategy__A_is_tracking_item__A_b = makeString( "Strategy ~A is tracking item ~A before it is added." );
    $str128$Strategy__A_is_suggesting_to_remo = makeString( "Strategy ~A is suggesting to remove item ~A before the cache is full." );
    $str129$Strategy__A_is_not_tracking_item_ = makeString( "Strategy ~A is not tracking item ~A that was just added." );
    $str130$After_adding__A_items_to_an_empty = makeString( "After adding ~A items to an empty cache, the cache contains ~A items." );
    $str131$The_strategy__A_does_not_implemen = makeString( "The strategy ~A does not implement FULL-P correctly." );
    $str132$Strategy__A_is_tracking_item__A_t = makeString( "Strategy ~A is tracking item ~A though it is no longer present." );
    $str133$After_removing__A_items_from_a_fu = makeString( "After removing ~A items from a full cache, the cache still contains ~A items." );
    $str134$The_strategy__A_is_not_implementi = makeString( "The strategy ~A is not implementing EMPTY-P correctly." );
    $kw135$SUCCESS = makeKeyword( "SUCCESS" );
    $str136$The_two_strategies_disagree_on_th = makeString( "The two strategies disagree on the result of adding item #~A (~A).~%~A gives ~A, ~A gives ~A." );
    $sym137$CACHE_P = makeSymbol( "CACHE-P" );
    $kw138$NEWEST = makeKeyword( "NEWEST" );
  }

  public static final class $cache_metrics_native
      extends
        SubLStructNative
  {
    public SubLObject $hit_count;
    public SubLObject $miss_count;
    private static final SubLStructDeclNative structDecl;

    public $cache_metrics_native()
    {
      this.$hit_count = CommonSymbols.NIL;
      this.$miss_count = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cache_metrics_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$hit_count;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$miss_count;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$hit_count = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$miss_count = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cache_metrics_native.class, $sym6$CACHE_METRICS, $sym7$CACHE_METRICS_P, $list8, $list9, new String[] { "$hit_count", "$miss_count"
      }, $list10, $list11, $sym12$PRINT_CACHE_METRICS );
    }
  }

  public static final class $cache_metrics_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cache_metrics_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CACHE-METRICS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cache_metrics_p( arg1 );
    }
  }

  public static final class $metered_cache_native
      extends
        SubLStructNative
  {
    public SubLObject $cache;
    public SubLObject $metrics;
    private static final SubLStructDeclNative structDecl;

    public $metered_cache_native()
    {
      this.$cache = CommonSymbols.NIL;
      this.$metrics = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $metered_cache_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cache;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$metrics;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cache = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$metrics = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $metered_cache_native.class, $sym33$METERED_CACHE, $sym34$METERED_CACHE_P, $list35, $list36, new String[] { "$cache", "$metrics"
      }, $list37, $list38, $sym39$PRINT_METERED_CACHE );
    }
  }

  public static final class $metered_cache_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $metered_cache_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "METERED-CACHE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return metered_cache_p( arg1 );
    }
  }

  public static final class $recording_cache_strategy_facade_native
      extends
        SubLStructNative
  {
    public SubLObject $cache_strategy;
    public SubLObject $records;
    public SubLObject $timestamper;
    private static final SubLStructDeclNative structDecl;

    public $recording_cache_strategy_facade_native()
    {
      this.$cache_strategy = CommonSymbols.NIL;
      this.$records = CommonSymbols.NIL;
      this.$timestamper = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $recording_cache_strategy_facade_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cache_strategy;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$records;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$timestamper;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cache_strategy = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$records = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$timestamper = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $recording_cache_strategy_facade_native.class, $sym73$RECORDING_CACHE_STRATEGY_FACADE, $sym74$RECORDING_CACHE_STRATEGY_FACADE_P, $list75, $list76, new String[] {
        "$cache_strategy", "$records", "$timestamper"
      }, $list77, $list78, $sym79$PRINT_RECORDING_CACHE_STRATEGY_FACADE );
    }
  }

  public static final class $recording_cache_strategy_facade_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $recording_cache_strategy_facade_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RECORDING-CACHE-STRATEGY-FACADE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return recording_cache_strategy_facade_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 477 ms
 * 
 */